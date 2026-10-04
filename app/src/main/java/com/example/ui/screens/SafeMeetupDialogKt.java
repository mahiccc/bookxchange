package com.example.ui.screens;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.AccountBalanceKt;
import androidx.compose.material.icons.filled.CheckCircleKt;
import androidx.compose.material.icons.filled.DirectionsSubwayKt;
import androidx.compose.material.icons.filled.DirectionsTransitKt;
import androidx.compose.material.icons.filled.LocalCafeKt;
import androidx.compose.material.icons.filled.LocalLibraryKt;
import androidx.compose.material.icons.filled.MenuBookKt;
import androidx.compose.material.icons.filled.SecurityKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonElevation;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.FilterChipDefaults;
import androidx.compose.material3.IconButtonColors;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SelectableChipElevation;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.fragment.app.FragmentTransaction;
import com.example.BuildConfig;
import com.example.ui.BookViewModel;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: SafeMeetupDialog.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\f\u0010\f\u001a\u0004\u0018\u00010\u0003X\u008a\u008e\u0002²\u0006\f\u0010\r\u001a\u0004\u0018\u00010\u0003X\u008a\u008e\u0002²\u0006\n\u0010\u000e\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\u0010\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u008a\u008e\u0002²\u0006\n\u0010\u0015\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010\u0016\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0003X\u008a\u008e\u0002"}, d2 = {"SafeMeetupDialog", "", "bookId", "", "bookTitle", "receiverEmail", "viewModel", "Lcom/example/ui/BookViewModel;", "onDismiss", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/ui/BookViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app", "detectedCity", "detectedLocality", "selectedCategory", "searchQuery", "isSearchingPlaces", "", "geocodedResults", "", "Lcom/example/ui/screens/SafeSpotOption;", "selectedSpotName", "spotAddress", "timeSelection"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class SafeMeetupDialogKt {
    static final Unit SafeMeetupDialog$lambda$72(String str, String str2, String str3, BookViewModel bookViewModel, Function0 function0, int i, Composer composer, int i2) {
        SafeMeetupDialog(str, str2, str3, bookViewModel, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:97:0x03c5  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void SafeMeetupDialog(final String str, final String str2, final String str3, final BookViewModel bookViewModel, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        char c;
        List listEmptyList;
        Composer composer2;
        String defaultAddress;
        String name;
        Intrinsics.checkNotNullParameter(str, "bookId");
        Intrinsics.checkNotNullParameter(str2, "bookTitle");
        Intrinsics.checkNotNullParameter(str3, "receiverEmail");
        Intrinsics.checkNotNullParameter(bookViewModel, "viewModel");
        Intrinsics.checkNotNullParameter(function0, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(-802008050);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SafeMeetupDialog)P(!2,3,4)48@1625L7,49@1658L24,51@1708L42,52@1779L42,53@1850L38,55@1913L31,56@1974L34,57@2036L62,60@2194L775,60@2173L796,80@2996L1838,107@4864L89,108@4977L99,109@5102L45,111@5176L117,442@21889L1248,467@23163L102,152@6898L1378,184@8293L13570,150@6831L16440:SafeMeetupDialog.kt#2thlc2");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str3) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(bookViewModel) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : FragmentTransaction.TRANSIT_EXIT_MASK;
        }
        int i3 = i2;
        if ((i3 & 9347) == 9346 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-802008050, i3, -1, "com.example.ui.screens.SafeMeetupDialog (SafeMeetupDialog.kt:47)");
            }
            CompositionLocal localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final Context context = (Context) objConsume;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                objRememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1930579848, "CC(remember):SafeMeetupDialog.kt#9igjgp");
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final MutableState mutableState = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1930577576, "CC(remember):SafeMeetupDialog.kt#9igjgp");
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1930575308, "CC(remember):SafeMeetupDialog.kt#9igjgp");
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt.mutableStateOf$default("Library", (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final MutableState mutableState3 = (MutableState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1930573299, "CC(remember):SafeMeetupDialog.kt#9igjgp");
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            final MutableState mutableState4 = (MutableState) objRememberedValue5;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1930571344, "CC(remember):SafeMeetupDialog.kt#9igjgp");
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == Composer.Companion.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            final MutableState mutableState5 = (MutableState) objRememberedValue6;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1930569332, "CC(remember):SafeMeetupDialog.kt#9igjgp");
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == Composer.Companion.getEmpty()) {
                objRememberedValue7 = SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            final MutableState mutableState6 = (MutableState) objRememberedValue7;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1930563563, "CC(remember):SafeMeetupDialog.kt#9igjgp");
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(context);
            SafeMeetupDialogKt$SafeMeetupDialog$1$1 safeMeetupDialogKt$SafeMeetupDialog$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || safeMeetupDialogKt$SafeMeetupDialog$1$1RememberedValue == Composer.Companion.getEmpty()) {
                safeMeetupDialogKt$SafeMeetupDialog$1$1RememberedValue = new SafeMeetupDialogKt$SafeMeetupDialog$1$1(context, mutableState, mutableState2, null);
                composerStartRestartGroup.updateRememberedValue(safeMeetupDialogKt$SafeMeetupDialog$1$1RememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            EffectsKt.LaunchedEffect(unit, (Function2) safeMeetupDialogKt$SafeMeetupDialog$1$1RememberedValue, composerStartRestartGroup, 6);
            String strSafeMeetupDialog$lambda$1 = SafeMeetupDialog$lambda$1(mutableState);
            String strSafeMeetupDialog$lambda$4 = SafeMeetupDialog$lambda$4(mutableState2);
            String strSafeMeetupDialog$lambda$7 = SafeMeetupDialog$lambda$7(mutableState3);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1930536836, "CC(remember):SafeMeetupDialog.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(strSafeMeetupDialog$lambda$1) | composerStartRestartGroup.changed(strSafeMeetupDialog$lambda$4) | composerStartRestartGroup.changed(strSafeMeetupDialog$lambda$7);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue8 == Composer.Companion.getEmpty()) {
                String strSafeMeetupDialog$lambda$2 = SafeMeetupDialog$lambda$1(mutableState);
                if (strSafeMeetupDialog$lambda$2 == null) {
                    strSafeMeetupDialog$lambda$2 = "City Central";
                }
                String strSafeMeetupDialog$lambda$5 = SafeMeetupDialog$lambda$4(mutableState2);
                if (strSafeMeetupDialog$lambda$5 == null) {
                    strSafeMeetupDialog$lambda$5 = strSafeMeetupDialog$lambda$2;
                }
                c = 1;
                switch (SafeMeetupDialog$lambda$7(mutableState3)) {
                    case "Cafe":
                        listEmptyList = CollectionsKt.listOf(new SafeSpotOption[]{new SafeSpotOption("Cafe", "Starbucks Coffee - " + strSafeMeetupDialog$lambda$5, LocalCafeKt.getLocalCafe(Icons.INSTANCE.getDefault()), "Indoor central seating area"), new SafeSpotOption("Cafe", "Cafe Coffee Day (CCD) - " + strSafeMeetupDialog$lambda$2, LocalCafeKt.getLocalCafe(Icons.INSTANCE.getDefault()), "Main entrance / Counter area"), new SafeSpotOption("Cafe", "Costa / Blue Tokai Coffee Roasters", LocalCafeKt.getLocalCafe(Icons.INSTANCE.getDefault()), "Quiet indoor study corner")});
                        break;
                    case "Metro":
                        listEmptyList = CollectionsKt.listOf(new SafeSpotOption[]{new SafeSpotOption("Metro", strSafeMeetupDialog$lambda$5 + " Metro Station", DirectionsSubwayKt.getDirectionsSubway(Icons.INSTANCE.getDefault()), "Customer care gate / Exit 1 lobby"), new SafeSpotOption("Metro", strSafeMeetupDialog$lambda$2 + " Central Transit Concourse", DirectionsTransitKt.getDirectionsTransit(Icons.INSTANCE.getDefault()), "Main ticketing & public inquiry hall")});
                        break;
                    case "Safe Zone":
                        listEmptyList = CollectionsKt.listOf(new SafeSpotOption[]{new SafeSpotOption("Safe Zone", strSafeMeetupDialog$lambda$2 + " Police Station Community Zone", SecurityKt.getSecurity(Icons.INSTANCE.getDefault()), "Designated public safe exchange parking / lobby"), new SafeSpotOption("Safe Zone", "Municipal Civic Center / Post Office", AccountBalanceKt.getAccountBalance(Icons.INSTANCE.getDefault()), "Main reception & postal counter")});
                        break;
                    case "Library":
                        listEmptyList = CollectionsKt.listOf(new SafeSpotOption[]{new SafeSpotOption("Library", strSafeMeetupDialog$lambda$5 + " Public Library", LocalLibraryKt.getLocalLibrary(Icons.INSTANCE.getDefault()), "Main reading hall entrance • Free public access"), new SafeSpotOption("Library", strSafeMeetupDialog$lambda$2 + " State Central Library", LocalLibraryKt.getLocalLibrary(Icons.INSTANCE.getDefault()), "Reference section / Reception lobby"), new SafeSpotOption("Library", "University & Community Study Center", MenuBookKt.getMenuBook(Icons.INSTANCE.getDefault()), "Public visitors waiting lounge")});
                        break;
                    default:
                        listEmptyList = CollectionsKt.emptyList();
                        break;
                }
                objRememberedValue8 = listEmptyList;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            } else {
                c = 1;
            }
            final List list = (List) objRememberedValue8;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1930478809, "CC(remember):SafeMeetupDialog.kt#9igjgp");
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue9 == Composer.Companion.getEmpty()) {
                SafeSpotOption safeSpotOption = (SafeSpotOption) CollectionsKt.firstOrNull(list);
                if (safeSpotOption == null || (name = safeSpotOption.getName()) == null) {
                    name = "Local Public Library";
                }
                objRememberedValue9 = SnapshotStateKt.mutableStateOf$default(name, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            final MutableState mutableState7 = (MutableState) objRememberedValue9;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1930475183, "CC(remember):SafeMeetupDialog.kt#9igjgp");
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue10 == Composer.Companion.getEmpty()) {
                SafeSpotOption safeSpotOption2 = (SafeSpotOption) CollectionsKt.firstOrNull(list);
                if (safeSpotOption2 == null || (defaultAddress = safeSpotOption2.getDefaultAddress()) == null) {
                    defaultAddress = "Main public entrance";
                }
                objRememberedValue10 = SnapshotStateKt.mutableStateOf$default(defaultAddress, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            final MutableState mutableState8 = (MutableState) objRememberedValue10;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1930471237, "CC(remember):SafeMeetupDialog.kt#9igjgp");
            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue11 == Composer.Companion.getEmpty()) {
                objRememberedValue11 = SnapshotStateKt.mutableStateOf$default("Today, 5:30 PM", (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
            }
            final MutableState mutableState9 = (MutableState) objRememberedValue11;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1930468797, "CC(remember):SafeMeetupDialog.kt#9igjgp");
            Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue12 == Composer.Companion.getEmpty()) {
                String[] strArr = new String[4];
                strArr[0] = "Today, 5:30 PM";
                strArr[c] = "Tomorrow, 11:00 AM";
                strArr[2] = "Tomorrow, 5:00 PM";
                strArr[3] = "This Weekend, 4:00 PM";
                objRememberedValue12 = CollectionsKt.listOf(strArr);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
            }
            final List list2 = (List) objRememberedValue12;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            boolean z = c;
            composer2 = composerStartRestartGroup;
            AndroidAlertDialog_androidKt.AlertDialog-Oix01E0(function0, ComposableLambdaKt.rememberComposableLambda(-1168648618, z, new Function2() { // from class: com.example.ui.screens.SafeMeetupDialogKt$$ExternalSyntheticLambda5
                public final Object invoke(Object obj, Object obj2) {
                    return SafeMeetupDialogKt.SafeMeetupDialog$lambda$34(bookViewModel, str, str3, context, function0, mutableState7, mutableState8, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), (Modifier) null, ComposableLambdaKt.rememberComposableLambda(-1324629160, z, new Function2() { // from class: com.example.ui.screens.SafeMeetupDialogKt$$ExternalSyntheticLambda6
                public final Object invoke(Object obj, Object obj2) {
                    return SafeMeetupDialogKt.SafeMeetupDialog$lambda$35(function0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), (Function2) null, ComposableLambdaKt.rememberComposableLambda(-1480609702, z, new Function2() { // from class: com.example.ui.screens.SafeMeetupDialogKt$$ExternalSyntheticLambda7
                public final Object invoke(Object obj, Object obj2) {
                    return SafeMeetupDialogKt.SafeMeetupDialog$lambda$38(mutableState, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-1558599973, z, new Function2() { // from class: com.example.ui.screens.SafeMeetupDialogKt$$ExternalSyntheticLambda8
                public final Object invoke(Object obj, Object obj2) {
                    return SafeMeetupDialogKt.SafeMeetupDialog$lambda$71(list, coroutineScope, context, list2, mutableState3, mutableState4, mutableState6, mutableState7, mutableState8, mutableState5, mutableState, mutableState9, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), (Shape) null, 0L, 0L, 0L, 0L, 0.0f, (DialogProperties) null, composer2, ((i3 >> 12) & 14) | 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.SafeMeetupDialogKt$$ExternalSyntheticLambda9
                public final Object invoke(Object obj, Object obj2) {
                    return SafeMeetupDialogKt.SafeMeetupDialog$lambda$72(str, str2, str3, bookViewModel, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SafeMeetupDialog$lambda$1(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final String SafeMeetupDialog$lambda$4(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SafeMeetupDialog$lambda$7(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final String SafeMeetupDialog$lambda$10(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final boolean SafeMeetupDialog$lambda$13(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SafeMeetupDialog$lambda$14(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final List<SafeSpotOption> SafeMeetupDialog$lambda$16(MutableState<List<SafeSpotOption>> mutableState) {
        return (List) ((State) mutableState).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SafeMeetupDialog$lambda$21(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final String SafeMeetupDialog$lambda$24(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final String SafeMeetupDialog$lambda$27(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final void SafeMeetupDialog$performPlaceSearch(CoroutineScope coroutineScope, MutableState<List<SafeSpotOption>> mutableState, MutableState<Boolean> mutableState2, Context context, MutableState<String> mutableState3, String str) {
        if (str.length() >= 3) {
            SafeMeetupDialog$lambda$14(mutableState2, true);
            BuildersKt.launch$default(coroutineScope, Dispatchers.getIO(), (CoroutineStart) null, new SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1(context, str, mutableState3, mutableState, mutableState2, null), 2, (Object) null);
        } else {
            mutableState.setValue(CollectionsKt.emptyList());
        }
    }

    static final Unit SafeMeetupDialog$lambda$38(MutableState mutableState, Composer composer, int i) {
        String str;
        ComposerKt.sourceInformation(composer, "C153@6912L1354:SafeMeetupDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1480609702, i, -1, "com.example.ui.screens.SafeMeetupDialog.<anonymous> (SafeMeetupDialog.kt:153)");
            }
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifier);
            Function0 constructor = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composer2 = Updater.constructor-impl(composer);
            Updater.set-impl(composer2, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer2, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer2.getInserting() || !Intrinsics.areEqual(composer2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composer2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composer2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.set-impl(composer2, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1802468081, "C154@6982L565,168@7564L40,169@7621L631:SafeMeetupDialog.kt#2thlc2");
            SurfaceKt.Surface-T9BRK9s(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(42.0f)), RoundedCornerShapeKt.getCircleShape(), Color.copy-wmQWz5c$default(ColorKt.Color(4279994175L), 0.15f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableSingletons$SafeMeetupDialogKt.INSTANCE.m354getLambda$2031749031$app(), composer, 12583302, 120);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(12.0f)), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier2 = Modifier.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifier2);
            Function0 constructor2 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composer3 = Updater.constructor-impl(composer);
            Updater.set-impl(composer3, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer3, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composer3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composer3.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.set-impl(composer3, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1885999431, "C172@7762L10,170@7650L210,177@8083L10,175@7881L353:SafeMeetupDialog.kt#2thlc2");
            TextKt.Text--4IGK_g("Agree on Safe Meetup Spot", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleMedium(), composer, 196614, 0, 65502);
            String strSafeMeetupDialog$lambda$1 = SafeMeetupDialog$lambda$1(mutableState);
            if (strSafeMeetupDialog$lambda$1 == null || StringsKt.isBlank(strSafeMeetupDialog$lambda$1)) {
                str = "Public spots for mutual agreement";
            } else {
                str = "📍 Near " + SafeMeetupDialog$lambda$1(mutableState) + " • Mutual Decision";
            }
            TextKt.Text--4IGK_g(str, (Modifier) null, ColorKt.Color(4279994175L), 0L, (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 196992, 0, 65498);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit SafeMeetupDialog$lambda$71(final List list, final CoroutineScope coroutineScope, final Context context, final List list2, final MutableState mutableState, final MutableState mutableState2, final MutableState mutableState3, final MutableState mutableState4, final MutableState mutableState5, final MutableState mutableState6, final MutableState mutableState7, final MutableState mutableState8, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C188@8451L13402,185@8307L13546:SafeMeetupDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1558599973, i, -1, "com.example.ui.screens.SafeMeetupDialog.<anonymous> (SafeMeetupDialog.kt:185)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            Arrangement.Vertical vertical = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(10.0f));
            ComposerKt.sourceInformationMarkerStart(composer, 1129030709, "CC(remember):SafeMeetupDialog.kt#9igjgp");
            boolean zChangedInstance = composer.changedInstance(list) | composer.changedInstance(coroutineScope) | composer.changedInstance(context) | composer.changedInstance(list2);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.example.ui.screens.SafeMeetupDialogKt$$ExternalSyntheticLambda13
                    public final Object invoke(Object obj) {
                        return SafeMeetupDialogKt.SafeMeetupDialog$lambda$71$lambda$70$lambda$69(list, mutableState, mutableState2, mutableState3, mutableState4, mutableState5, coroutineScope, context, mutableState6, mutableState7, list2, mutableState8, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            LazyDslKt.LazyColumn(modifierFillMaxWidth$default, (LazyListState) null, (PaddingValues) null, false, vertical, (Alignment.Horizontal) null, (FlingBehavior) null, false, (Function1) objRememberedValue, composer, 24582, 238);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit SafeMeetupDialog$lambda$71$lambda$70$lambda$69(final List list, final MutableState mutableState, final MutableState mutableState2, final MutableState mutableState3, final MutableState mutableState4, final MutableState mutableState5, final CoroutineScope coroutineScope, final Context context, final MutableState mutableState6, final MutableState mutableState7, final List list2, final MutableState mutableState8, LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyColumn");
        LazyListScope.item$default(lazyListScope, (Object) null, (Object) null, ComposableSingletons$SafeMeetupDialogKt.INSTANCE.m353getLambda$1357906833$app(), 3, (Object) null);
        LazyListScope.item$default(lazyListScope, (Object) null, (Object) null, ComposableLambdaKt.composableLambdaInstance(-1461362202, true, new Function3() { // from class: com.example.ui.screens.SafeMeetupDialogKt$$ExternalSyntheticLambda20
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SafeMeetupDialogKt.SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$43(list, mutableState, mutableState2, mutableState3, mutableState4, mutableState5, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, (Object) null);
        LazyListScope.item$default(lazyListScope, (Object) null, (Object) null, ComposableSingletons$SafeMeetupDialogKt.INSTANCE.m356getLambda$534607449$app(), 3, (Object) null);
        if (!SafeMeetupDialog$lambda$16(mutableState3).isEmpty()) {
            list = SafeMeetupDialog$lambda$16(mutableState3);
        }
        final SafeMeetupDialogKt$SafeMeetupDialog$lambda$71$lambda$70$lambda$69$$inlined$items$default$1 safeMeetupDialogKt$SafeMeetupDialog$lambda$71$lambda$70$lambda$69$$inlined$items$default$1 = new Function1() { // from class: com.example.ui.screens.SafeMeetupDialogKt$SafeMeetupDialog$lambda$71$lambda$70$lambda$69$$inlined$items$default$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final Void m404invoke(SafeSpotOption safeSpotOption) {
                return null;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m404invoke((SafeSpotOption) obj);
            }
        };
        lazyListScope.items(list.size(), (Function1) null, new Function1<Integer, Object>() { // from class: com.example.ui.screens.SafeMeetupDialogKt$SafeMeetupDialog$lambda$71$lambda$70$lambda$69$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i) {
                return safeMeetupDialogKt$SafeMeetupDialog$lambda$71$lambda$70$lambda$69$$inlined$items$default$1.invoke(list.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.screens.SafeMeetupDialogKt$SafeMeetupDialog$lambda$71$lambda$70$lambda$69$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                long j;
                BorderStroke borderStroke;
                ComposerKt.sourceInformation(composer, "C152@7074L22:LazyDsl.kt#428nma");
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if ((i3 & BuildConfig.VERSION_CODE) == 146 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                }
                final SafeSpotOption safeSpotOption = (SafeSpotOption) list.get(i);
                composer.startReplaceGroup(1165253295);
                ComposerKt.sourceInformation(composer, "C*278@13136L158,282@13317L2407,272@12640L3084:SafeMeetupDialog.kt#2thlc2");
                final boolean zAreEqual = Intrinsics.areEqual(SafeMeetupDialogKt.SafeMeetupDialog$lambda$21(mutableState4), safeSpotOption.getName());
                Shape shape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f));
                if (zAreEqual) {
                    composer.startReplaceGroup(176139701);
                    ComposerKt.sourceInformation(composer, "274@12770L11");
                    j = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU();
                } else {
                    composer.startReplaceGroup(176141719);
                    ComposerKt.sourceInformation(composer, "274@12818L11");
                    j = Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
                }
                composer.endReplaceGroup();
                if (zAreEqual) {
                    composer.startReplaceGroup(176144860);
                    ComposerKt.sourceInformation(composer, "275@12977L11");
                    BorderStroke borderStroke2 = BorderStrokeKt.BorderStroke-cXLIe8U(Dp.constructor-impl(1.5f), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU());
                    composer.endReplaceGroup();
                    borderStroke = borderStroke2;
                } else {
                    composer.startReplaceGroup(1165582296);
                    composer.endReplaceGroup();
                    borderStroke = null;
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
                ComposerKt.sourceInformationMarkerStart(composer, 176151171, "CC(remember):SafeMeetupDialog.kt#9igjgp");
                boolean zChanged = composer.changed(safeSpotOption);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    final MutableState mutableState9 = mutableState4;
                    final MutableState mutableState10 = mutableState5;
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.SafeMeetupDialogKt$SafeMeetupDialog$5$1$1$2$1$1
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m403invoke();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m403invoke() {
                            mutableState9.setValue(safeSpotOption.getName());
                            mutableState10.setValue(safeSpotOption.getDefaultAddress());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                SurfaceKt.Surface-T9BRK9s(ClickableKt.clickable-XHw0xAI$default(modifierFillMaxWidth$default, false, (String) null, (Role) null, (Function0) objRememberedValue, 7, (Object) null), shape, j, 0L, 0.0f, 0.0f, borderStroke, ComposableLambdaKt.rememberComposableLambda(-1097872118, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.ui.screens.SafeMeetupDialogKt$SafeMeetupDialog$5$1$1$2$2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i4) {
                        long j2;
                        ComposerKt.sourceInformation(composer2, "C283@13343L2359:SafeMeetupDialog.kt#2thlc2");
                        if ((i4 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1097872118, i4, -1, "com.example.ui.screens.SafeMeetupDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SafeMeetupDialog.kt:283)");
                        }
                        Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f));
                        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                        final boolean z = zAreEqual;
                        final SafeSpotOption safeSpotOption2 = safeSpotOption;
                        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifier);
                        Function0 constructor = ComposeUiNode.Companion.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composer3 = Updater.constructor-impl(composer2);
                        Updater.set-impl(composer3, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.set-impl(composer3, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composer3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composer3.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.set-impl(composer3, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScope rowScope = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, 78105696, "C291@13836L534,287@13543L827,301@14399L40,302@14468L788:SafeMeetupDialog.kt#2thlc2");
                        Shape circleShape = RoundedCornerShapeKt.getCircleShape();
                        if (z) {
                            composer2.startReplaceGroup(556711349);
                            ComposerKt.sourceInformation(composer2, "289@13675L11");
                            j2 = MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getPrimary-0d7_KjU();
                        } else {
                            composer2.startReplaceGroup(556712604);
                            ComposerKt.sourceInformation(composer2, "289@13714L11");
                            j2 = MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU();
                        }
                        composer2.endReplaceGroup();
                        SurfaceKt.Surface-T9BRK9s(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(34.0f)), circleShape, j2, 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(875834825, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.ui.screens.SafeMeetupDialogKt$SafeMeetupDialog$5$1$1$2$2$1$1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i5) {
                                long j3;
                                ComposerKt.sourceInformation(composer4, "C292@13870L470:SafeMeetupDialog.kt#2thlc2");
                                if ((i5 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(875834825, i5, -1, "com.example.ui.screens.SafeMeetupDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SafeMeetupDialog.kt:292)");
                                }
                                Alignment center = Alignment.Companion.getCenter();
                                SafeSpotOption safeSpotOption3 = safeSpotOption2;
                                boolean z2 = z;
                                ComposerKt.sourceInformationMarkerStart(composer4, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                Modifier modifier2 = Modifier.Companion;
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                                ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifier2);
                                Function0 constructor2 = ComposeUiNode.Companion.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(composer4.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor2);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composer5 = Updater.constructor-impl(composer4);
                                Updater.set-impl(composer5, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                                Updater.set-impl(composer5, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                Function2 setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                if (composer5.getInserting() || !Intrinsics.areEqual(composer5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composer5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composer5.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.set-impl(composer5, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                BoxScope boxScope = BoxScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer4, -2012407141, "C293@13949L357:SafeMeetupDialog.kt#2thlc2");
                                ImageVector icon = safeSpotOption3.getIcon();
                                if (z2) {
                                    composer4.startReplaceGroup(-619099864);
                                    composer4.endReplaceGroup();
                                    j3 = Color.Companion.getWhite-0d7_KjU();
                                } else {
                                    composer4.startReplaceGroup(-619098669);
                                    ComposerKt.sourceInformation(composer4, "296@14167L11");
                                    j3 = MaterialTheme.INSTANCE.getColorScheme(composer4, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU();
                                    composer4.endReplaceGroup();
                                }
                                IconKt.Icon-ww6aTOc(icon, (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), j3, composer4, 432, 0);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                composer4.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 12582918, 120);
                        SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f)), composer2, 6);
                        Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.Companion, 1.0f, false, 2, (Object) null);
                        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, 0);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierWeight$default);
                        Function0 constructor2 = ComposeUiNode.Companion.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composer4 = Updater.constructor-impl(composer2);
                        Updater.set-impl(composer4, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.set-impl(composer4, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composer4.getInserting() || !Intrinsics.areEqual(composer4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composer4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composer4.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.set-impl(composer4, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, 723662034, "C305@14659L10,303@14541L278,310@14980L10,311@15060L11,308@14852L374:SafeMeetupDialog.kt#2thlc2");
                        String name = safeSpotOption2.getName();
                        TextStyle bodyMedium = MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodyMedium();
                        FontWeight.Companion companion = FontWeight.Companion;
                        TextKt.Text--4IGK_g(name, (Modifier) null, 0L, 0L, (FontStyle) null, z ? companion.getBold() : companion.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, bodyMedium, composer2, 0, 0, 65502);
                        TextKt.Text--4IGK_g(safeSpotOption2.getDefaultAddress(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 2, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodySmall(), composer2, 3072, 3072, 57330);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (z) {
                            composer2.startReplaceGroup(79795133);
                            ComposerKt.sourceInformation(composer2, "320@15524L11,317@15335L311");
                            IconKt.Icon-ww6aTOc(CheckCircleKt.getCheckCircle(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(20.0f)), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer2, 432, 0);
                        } else {
                            composer2.startReplaceGroup(64603924);
                        }
                        composer2.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 12582912, 56);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        LazyListScope.item$default(lazyListScope, (Object) null, (Object) null, ComposableLambdaKt.composableLambdaInstance(392147304, true, new Function3() { // from class: com.example.ui.screens.SafeMeetupDialogKt$$ExternalSyntheticLambda21
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SafeMeetupDialogKt.SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$51(coroutineScope, context, mutableState2, mutableState3, mutableState6, mutableState7, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, (Object) null);
        LazyListScope.item$default(lazyListScope, (Object) null, (Object) null, ComposableLambdaKt.composableLambdaInstance(1318902057, true, new Function3() { // from class: com.example.ui.screens.SafeMeetupDialogKt$$ExternalSyntheticLambda1
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SafeMeetupDialogKt.SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$54(mutableState4, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, (Object) null);
        LazyListScope.item$default(lazyListScope, (Object) null, (Object) null, ComposableLambdaKt.composableLambdaInstance(-2049310486, true, new Function3() { // from class: com.example.ui.screens.SafeMeetupDialogKt$$ExternalSyntheticLambda2
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SafeMeetupDialogKt.SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$57(mutableState5, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, (Object) null);
        LazyListScope.item$default(lazyListScope, (Object) null, (Object) null, ComposableSingletons$SafeMeetupDialogKt.INSTANCE.m352getLambda$1122555733$app(), 3, (Object) null);
        LazyListScope.item$default(lazyListScope, (Object) null, (Object) null, ComposableLambdaKt.composableLambdaInstance(-195800980, true, new Function3() { // from class: com.example.ui.screens.SafeMeetupDialogKt$$ExternalSyntheticLambda3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SafeMeetupDialogKt.SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$65(list2, mutableState8, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, (Object) null);
        LazyListScope.item$default(lazyListScope, (Object) null, (Object) null, ComposableLambdaKt.composableLambdaInstance(730953773, true, new Function3() { // from class: com.example.ui.screens.SafeMeetupDialogKt$$ExternalSyntheticLambda4
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SafeMeetupDialogKt.SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$68(context, mutableState4, mutableState5, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, (Object) null);
        return Unit.INSTANCE;
    }

    static final Unit SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$43(final List list, final MutableState mutableState, final MutableState mutableState2, final MutableState mutableState3, final MutableState mutableState4, final MutableState mutableState5, LazyItemScope lazyItemScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(lazyItemScope, "$this$item");
        ComposerKt.sourceInformation(composer, "C221@10058L10,219@9940L216,224@10177L40,226@10383L1660,226@10323L1720:SafeMeetupDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1461362202, i, -1, "com.example.ui.screens.SafeMeetupDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SafeMeetupDialog.kt:219)");
            }
            TextKt.Text--4IGK_g("1. Choose Public Spot Category:", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelMedium(), composer, 196614, 0, 65502);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            final List listListOf = CollectionsKt.listOf(new String[]{"Library", "Cafe", "Metro", "Safe Zone"});
            Arrangement.Horizontal horizontal = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(6.0f));
            ComposerKt.sourceInformationMarkerStart(composer, 85246210, "CC(remember):SafeMeetupDialog.kt#9igjgp");
            boolean zChangedInstance = composer.changedInstance(list);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                Function1 function1 = new Function1() { // from class: com.example.ui.screens.SafeMeetupDialogKt$$ExternalSyntheticLambda10
                    public final Object invoke(Object obj) {
                        return SafeMeetupDialogKt.SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$43$lambda$42$lambda$41(listListOf, list, mutableState, mutableState2, mutableState3, mutableState4, mutableState5, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(function1);
                objRememberedValue = function1;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            LazyDslKt.LazyRow((Modifier) null, (LazyListState) null, (PaddingValues) null, false, horizontal, (Alignment.Vertical) null, (FlingBehavior) null, false, (Function1) objRememberedValue, composer, 24576, 239);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$51(final CoroutineScope coroutineScope, final Context context, final MutableState mutableState, final MutableState mutableState2, final MutableState mutableState3, final MutableState mutableState4, LazyItemScope lazyItemScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(lazyItemScope, "$this$item");
        ComposerKt.sourceInformation(composer, "C332@15950L123,339@16425L522,330@15846L1285:SafeMeetupDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(392147304, i, -1, "com.example.ui.screens.SafeMeetupDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SafeMeetupDialog.kt:330)");
            }
            String strSafeMeetupDialog$lambda$10 = SafeMeetupDialog$lambda$10(mutableState);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            Shape shape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -1103558749, "CC(remember):SafeMeetupDialog.kt#9igjgp");
            boolean zChangedInstance = composer.changedInstance(coroutineScope) | composer.changedInstance(context);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                Function1 function1 = new Function1() { // from class: com.example.ui.screens.SafeMeetupDialogKt$$ExternalSyntheticLambda15
                    public final Object invoke(Object obj) {
                        return SafeMeetupDialogKt.SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$51$lambda$47$lambda$46(mutableState, coroutineScope, mutableState2, mutableState3, context, mutableState4, (String) obj);
                    }
                };
                composer.updateRememberedValue(function1);
                objRememberedValue = function1;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            OutlinedTextFieldKt.OutlinedTextField(strSafeMeetupDialog$lambda$10, (Function1) objRememberedValue, modifierFillMaxWidth$default, false, false, (TextStyle) null, ComposableSingletons$SafeMeetupDialogKt.INSTANCE.m357getLambda$892192254$app(), ComposableSingletons$SafeMeetupDialogKt.INSTANCE.getLambda$1948449761$app(), ComposableSingletons$SafeMeetupDialogKt.INSTANCE.getLambda$494124480$app(), ComposableLambdaKt.rememberComposableLambda(-960200801, true, new Function2() { // from class: com.example.ui.screens.SafeMeetupDialogKt$$ExternalSyntheticLambda16
                public final Object invoke(Object obj, Object obj2) {
                    return SafeMeetupDialogKt.SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$51$lambda$50(mutableState3, mutableState, mutableState2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), (Function2) null, (Function2) null, (Function2) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, shape, (TextFieldColors) null, composer, 920125824, 12582912, 0, 6159416);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$51$lambda$47$lambda$46(MutableState mutableState, CoroutineScope coroutineScope, MutableState mutableState2, MutableState mutableState3, Context context, MutableState mutableState4, String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        mutableState.setValue(str);
        SafeMeetupDialog$performPlaceSearch(coroutineScope, mutableState2, mutableState3, context, mutableState4, str);
        return Unit.INSTANCE;
    }

    static final Unit SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$51$lambda$50(MutableState mutableState, final MutableState mutableState2, final MutableState mutableState3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C:SafeMeetupDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-960200801, i, -1, "com.example.ui.screens.SafeMeetupDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SafeMeetupDialog.kt:340)");
            }
            if (SafeMeetupDialog$lambda$13(mutableState)) {
                composer.startReplaceGroup(-859814251);
                ComposerKt.sourceInformation(composer, "341@16512L78");
                ProgressIndicatorKt.CircularProgressIndicator-LxG7B9w(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), 0L, Dp.constructor-impl(2.0f), 0L, 0, composer, 390, 26);
                composer.endReplaceGroup();
            } else {
                if (StringsKt.isBlank(SafeMeetupDialog$lambda$10(mutableState2))) {
                    composer.startReplaceGroup(-876165821);
                } else {
                    composer.startReplaceGroup(-859633862);
                    ComposerKt.sourceInformation(composer, "343@16711L51,343@16690L201");
                    ComposerKt.sourceInformationMarkerStart(composer, 665008082, "CC(remember):SafeMeetupDialog.kt#9igjgp");
                    Object objRememberedValue = composer.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.example.ui.screens.SafeMeetupDialogKt$$ExternalSyntheticLambda18
                            public final Object invoke() {
                                return SafeMeetupDialogKt.SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$51$lambda$50$lambda$49$lambda$48(mutableState2, mutableState3);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    IconButtonKt.IconButton((Function0) objRememberedValue, (Modifier) null, false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableSingletons$SafeMeetupDialogKt.INSTANCE.getLambda$1376738398$app(), composer, 196614, 30);
                }
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$51$lambda$50$lambda$49$lambda$48(MutableState mutableState, MutableState mutableState2) {
        mutableState.setValue("");
        mutableState2.setValue(CollectionsKt.emptyList());
        return Unit.INSTANCE;
    }

    static final Unit SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$54(final MutableState mutableState, LazyItemScope lazyItemScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(lazyItemScope, "$this$item");
        ComposerKt.sourceInformation(composer, "C358@17346L25,356@17237L394:SafeMeetupDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1318902057, i, -1, "com.example.ui.screens.SafeMeetupDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SafeMeetupDialog.kt:356)");
            }
            String strSafeMeetupDialog$lambda$21 = SafeMeetupDialog$lambda$21(mutableState);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            Shape shape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(10.0f));
            ComposerKt.sourceInformationMarkerStart(composer, 449528674, "CC(remember):SafeMeetupDialog.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.example.ui.screens.SafeMeetupDialogKt$$ExternalSyntheticLambda19
                    public final Object invoke(Object obj) {
                        return SafeMeetupDialogKt.SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$54$lambda$53$lambda$52(mutableState, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            OutlinedTextFieldKt.OutlinedTextField(strSafeMeetupDialog$lambda$21, (Function1) objRememberedValue, modifierFillMaxWidth$default, false, false, (TextStyle) null, ComposableSingletons$SafeMeetupDialogKt.INSTANCE.getLambda$34562499$app(), (Function2) null, (Function2) null, (Function2) null, (Function2) null, (Function2) null, (Function2) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, shape, (TextFieldColors) null, composer, 1573296, 12582912, 0, 6160312);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$54$lambda$53$lambda$52(MutableState mutableState, String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        mutableState.setValue(str);
        return Unit.INSTANCE;
    }

    static final Unit SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$57(final MutableState mutableState, LazyItemScope lazyItemScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(lazyItemScope, "$this$item");
        ComposerKt.sourceInformation(composer, "C369@17798L20,367@17694L433:SafeMeetupDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2049310486, i, -1, "com.example.ui.screens.SafeMeetupDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SafeMeetupDialog.kt:367)");
            }
            String strSafeMeetupDialog$lambda$24 = SafeMeetupDialog$lambda$24(mutableState);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            Shape shape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(10.0f));
            ComposerKt.sourceInformationMarkerStart(composer, 2002615870, "CC(remember):SafeMeetupDialog.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.example.ui.screens.SafeMeetupDialogKt$$ExternalSyntheticLambda14
                    public final Object invoke(Object obj) {
                        return SafeMeetupDialogKt.SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$57$lambda$56$lambda$55(mutableState, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            OutlinedTextFieldKt.OutlinedTextField(strSafeMeetupDialog$lambda$24, (Function1) objRememberedValue, modifierFillMaxWidth$default, false, false, (TextStyle) null, ComposableSingletons$SafeMeetupDialogKt.INSTANCE.getLambda$961317252$app(), ComposableSingletons$SafeMeetupDialogKt.INSTANCE.m355getLambda$493008029$app(), (Function2) null, (Function2) null, (Function2) null, (Function2) null, (Function2) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, shape, (TextFieldColors) null, composer, 14156208, 0, 0, 6291256);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$57$lambda$56$lambda$55(MutableState mutableState, String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        mutableState.setValue(str);
        return Unit.INSTANCE;
    }

    static final Unit SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$65(List list, final MutableState mutableState, LazyItemScope lazyItemScope, Composer composer, int i) {
        long j;
        BorderStroke borderStroke;
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(lazyItemScope, "$this$item");
        ComposerKt.sourceInformation(composer2, "C388@18561L2028:SafeMeetupDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-195800980, i, -1, "com.example.ui.screens.SafeMeetupDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SafeMeetupDialog.kt:388)");
            }
            Arrangement.Vertical vertical = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(6.0f));
            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier = Modifier.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(vertical, Alignment.Companion.getStart(), composer2, 6);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int i2 = 0;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifier);
            Function0 constructor = ComposeUiNode.Companion.getConstructor();
            int i3 = -692256719;
            String str = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composer3 = Updater.constructor-impl(composer2);
            Updater.set-impl(composer3, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer3, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composer3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composer3.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.set-impl(composer3, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            String str2 = "C:SafeMeetupDialog.kt#2thlc2";
            ComposerKt.sourceInformationMarkerStart(composer2, -1156461826, "C:SafeMeetupDialog.kt#2thlc2");
            composer2.startReplaceGroup(1348168969);
            ComposerKt.sourceInformation(composer2, "*390@18724L1817");
            for (List<String> list2 : CollectionsKt.chunked(list, 2)) {
                boolean z = true;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
                Arrangement.Horizontal horizontal = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(8.0f));
                ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontal, Alignment.Companion.getTop(), composer2, 6);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, i2);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
                Function0 constructor2 = ComposeUiNode.Companion.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, i3, str);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                Composer composer4 = Updater.constructor-impl(composer2);
                Updater.set-impl(composer4, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl(composer4, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composer4.getInserting() || !Intrinsics.areEqual(composer4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composer4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composer4.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.set-impl(composer4, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScope rowScope = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, 1116973065, str2);
                composer2.startReplaceGroup(1005863055);
                ComposerKt.sourceInformation(composer2, "*402@19652L23,403@19714L763,396@19082L1395");
                for (final String str3 : list2) {
                    final boolean zAreEqual = Intrinsics.areEqual(SafeMeetupDialog$lambda$27(mutableState), str3);
                    Shape shape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(8.0f));
                    if (zAreEqual) {
                        composer2.startReplaceGroup(1409232669);
                        ComposerKt.sourceInformation(composer2, "398@19243L11");
                        j = MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getSecondaryContainer-0d7_KjU();
                    } else {
                        composer2.startReplaceGroup(1409234265);
                        ComposerKt.sourceInformation(composer2, "398@19293L11");
                        j = MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU();
                    }
                    composer2.endReplaceGroup();
                    if (zAreEqual) {
                        composer2.startReplaceGroup(1409237794);
                        ComposerKt.sourceInformation(composer2, "399@19447L11");
                        BorderStroke borderStroke2 = BorderStrokeKt.BorderStroke-cXLIe8U(Dp.constructor-impl(1.0f), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getSecondary-0d7_KjU());
                        composer2.endReplaceGroup();
                        borderStroke = borderStroke2;
                    } else {
                        composer2.startReplaceGroup(736757586);
                        composer2.endReplaceGroup();
                        borderStroke = null;
                    }
                    Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.Companion, 1.0f, false, 2, (Object) null);
                    ComposerKt.sourceInformationMarkerStart(composer2, 1409245378, "CC(remember):SafeMeetupDialog.kt#9igjgp");
                    boolean zChanged = composer2.changed(str3);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.example.ui.screens.SafeMeetupDialogKt$$ExternalSyntheticLambda0
                            public final Object invoke() {
                                return SafeMeetupDialogKt.SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$65$lambda$64$lambda$63$lambda$62$lambda$61$lambda$59$lambda$58(str3, mutableState);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    SurfaceKt.Surface-T9BRK9s(ClickableKt.clickable-XHw0xAI$default(modifierWeight$default, false, (String) null, (Role) null, (Function0) objRememberedValue, 7, (Object) null), shape, j, 0L, 0.0f, 0.0f, borderStroke, ComposableLambdaKt.rememberComposableLambda(998158310, z, new Function2() { // from class: com.example.ui.screens.SafeMeetupDialogKt$$ExternalSyntheticLambda11
                        public final Object invoke(Object obj, Object obj2) {
                            return SafeMeetupDialogKt.SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$65$lambda$64$lambda$63$lambda$62$lambda$61$lambda$60(zAreEqual, str3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    }, composer2, 54), composer2, 12582912, 56);
                    composer2 = composer;
                    z = z;
                    str2 = str2;
                    str = str;
                    i3 = -692256719;
                }
                composer.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer2 = composer;
                i2 = 0;
            }
            composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$65$lambda$64$lambda$63$lambda$62$lambda$61$lambda$59$lambda$58(String str, MutableState mutableState) {
        mutableState.setValue(str);
        return Unit.INSTANCE;
    }

    static final Unit SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$65$lambda$64$lambda$63$lambda$62$lambda$61$lambda$60(boolean z, String str, Composer composer, int i) {
        long j;
        ComposerKt.sourceInformation(composer, "C406@19884L10,404@19756L683:SafeMeetupDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(998158310, i, -1, "com.example.ui.screens.SafeMeetupDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SafeMeetupDialog.kt:404)");
            }
            TextStyle labelMedium = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelMedium();
            FontWeight.Companion companion = FontWeight.Companion;
            FontWeight bold = z ? companion.getBold() : companion.getNormal();
            if (z) {
                composer.startReplaceGroup(1452441754);
                ComposerKt.sourceInformation(composer, "408@20103L11");
                j = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSecondaryContainer-0d7_KjU();
            } else {
                composer.startReplaceGroup(1452443414);
                ComposerKt.sourceInformation(composer, "408@20155L11");
                j = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU();
            }
            composer.endReplaceGroup();
            TextKt.Text--4IGK_g(str, PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(6.0f), Dp.constructor-impl(8.0f)), j, 0L, (FontStyle) null, bold, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.box-impl(TextAlign.Companion.getCenter-e0LSkKk()), 0L, 0, false, 0, 0, (Function1) null, labelMedium, composer, 0, 0, 64984);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$68(final Context context, final MutableState mutableState, final MutableState mutableState2, LazyItemScope lazyItemScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(lazyItemScope, "$this$item");
        ComposerKt.sourceInformation(composer, "C422@20751L723,421@20701L1120:SafeMeetupDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(730953773, i, -1, "com.example.ui.screens.SafeMeetupDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SafeMeetupDialog.kt:421)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, -1928057664, "CC(remember):SafeMeetupDialog.kt#9igjgp");
            boolean zChangedInstance = composer.changedInstance(context);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.SafeMeetupDialogKt$$ExternalSyntheticLambda12
                    public final Object invoke() {
                        return SafeMeetupDialogKt.SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$68$lambda$67$lambda$66(context, mutableState, mutableState2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ButtonKt.OutlinedButton((Function0) objRememberedValue, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$SafeMeetupDialogKt.INSTANCE.getLambda$1202885663$app(), composer, 805306416, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$68$lambda$67$lambda$66(Context context, MutableState mutableState, MutableState mutableState2) {
        String str = SafeMeetupDialog$lambda$21(mutableState) + ", " + SafeMeetupDialog$lambda$24(mutableState2);
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + Uri.encode(str)));
            intent.setPackage("com.google.android.apps.maps");
            context.startActivity(intent);
        } catch (Exception unused) {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.google.com/maps/search/?api=1&query=" + Uri.encode(str))));
        }
        return Unit.INSTANCE;
    }

    static final Unit SafeMeetupDialog$lambda$34(final BookViewModel bookViewModel, final String str, final String str2, final Context context, final Function0 function0, final MutableState mutableState, final MutableState mutableState2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C459@22749L48,444@21937L770,443@21903L1224:SafeMeetupDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1168648618, i, -1, "com.example.ui.screens.SafeMeetupDialog.<anonymous> (SafeMeetupDialog.kt:443)");
            }
            ButtonColors buttonColors = ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(ColorKt.Color(4279994175L), 0L, 0L, 0L, composer, (ButtonDefaults.$stable << 12) | 6, 14);
            Shape shape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -2084855336, "CC(remember):SafeMeetupDialog.kt#9igjgp");
            boolean zChangedInstance = composer.changedInstance(bookViewModel) | composer.changed(str) | composer.changed(str2) | composer.changedInstance(context) | composer.changed(function0);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                Function0 function1 = new Function0() { // from class: com.example.ui.screens.SafeMeetupDialogKt$$ExternalSyntheticLambda17
                    public final Object invoke() {
                        return SafeMeetupDialogKt.SafeMeetupDialog$lambda$34$lambda$33$lambda$32(bookViewModel, str, str2, context, function0, mutableState, mutableState2);
                    }
                };
                composer.updateRememberedValue(function1);
                objRememberedValue = function1;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ButtonKt.Button((Function0) objRememberedValue, (Modifier) null, false, shape, buttonColors, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$SafeMeetupDialogKt.INSTANCE.getLambda$2085108294$app(), composer, 805306368, 486);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit SafeMeetupDialog$lambda$34$lambda$33$lambda$32(BookViewModel bookViewModel, String str, String str2, Context context, Function0 function0, MutableState mutableState, MutableState mutableState2) {
        String string = StringsKt.trim(SafeMeetupDialog$lambda$21(mutableState)).toString();
        if (StringsKt.isBlank(string)) {
            string = "Local Public Library";
        }
        String str3 = string;
        String string2 = StringsKt.trim(SafeMeetupDialog$lambda$24(mutableState2)).toString();
        if (StringsKt.isBlank(string2)) {
            string2 = "Main public entrance";
        }
        bookViewModel.sendMeetupProposal(str, str2, str3, string2, System.currentTimeMillis() + 14400000);
        Toast.makeText(context, "Meetup proposal for '" + str3 + "' sent! Waiting for agreement.", 1).show();
        function0.invoke();
        return Unit.INSTANCE;
    }

    static final Unit SafeMeetupDialog$lambda$35(Function0 function0, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C468@23177L78:SafeMeetupDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1324629160, i, -1, "com.example.ui.screens.SafeMeetupDialog.<anonymous> (SafeMeetupDialog.kt:468)");
            }
            ButtonKt.TextButton(function0, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$SafeMeetupDialogKt.INSTANCE.getLambda$724382549$app(), composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$43$lambda$42$lambda$41(final List list, final List list2, final MutableState mutableState, final MutableState mutableState2, final MutableState mutableState3, final MutableState mutableState4, final MutableState mutableState5, LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyRow");
        final SafeMeetupDialogKt$SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$43$lambda$42$lambda$41$$inlined$items$default$1 safeMeetupDialogKt$SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$43$lambda$42$lambda$41$$inlined$items$default$1 = new Function1() { // from class: com.example.ui.screens.SafeMeetupDialogKt$SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$43$lambda$42$lambda$41$$inlined$items$default$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final Void m405invoke(String str) {
                return null;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m405invoke((String) obj);
            }
        };
        lazyListScope.items(list.size(), (Function1) null, new Function1<Integer, Object>() { // from class: com.example.ui.screens.SafeMeetupDialogKt$SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$43$lambda$42$lambda$41$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i) {
                return safeMeetupDialogKt$SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$43$lambda$42$lambda$41$$inlined$items$default$1.invoke(list.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.screens.SafeMeetupDialogKt$SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$43$lambda$42$lambda$41$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                ComposerKt.sourceInformation(composer, "C152@7074L22:LazyDsl.kt#428nma");
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if ((i3 & BuildConfig.VERSION_CODE) == 146 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                }
                final String str = (String) list.get(i);
                composer.startReplaceGroup(-1101216793);
                ComposerKt.sourceInformation(composer, "C*231@10642L530,241@11214L431,251@11800L11,252@11901L11,250@11707L258,229@10533L1462:SafeMeetupDialog.kt#2thlc2");
                boolean zAreEqual = Intrinsics.areEqual(SafeMeetupDialogKt.SafeMeetupDialog$lambda$7(mutableState), str);
                ComposerKt.sourceInformationMarkerStart(composer, -1698086413, "CC(remember):SafeMeetupDialog.kt#9igjgp");
                boolean zChanged = composer.changed(str) | composer.changedInstance(list2);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    final List list3 = list2;
                    final MutableState mutableState6 = mutableState;
                    final MutableState mutableState7 = mutableState2;
                    final MutableState mutableState8 = mutableState3;
                    final MutableState mutableState9 = mutableState4;
                    final MutableState mutableState10 = mutableState5;
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.SafeMeetupDialogKt$SafeMeetupDialog$5$1$1$1$1$1$1$1$1
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m402invoke();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m402invoke() {
                            mutableState6.setValue(str);
                            mutableState7.setValue("");
                            mutableState8.setValue(CollectionsKt.emptyList());
                            SafeSpotOption safeSpotOption = (SafeSpotOption) CollectionsKt.firstOrNull(list3);
                            if (safeSpotOption != null) {
                                mutableState9.setValue(safeSpotOption.getName());
                                mutableState10.setValue(safeSpotOption.getDefaultAddress());
                            }
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                ChipKt.FilterChip(zAreEqual, (Function0) objRememberedValue, ComposableLambdaKt.rememberComposableLambda(-1811462668, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.ui.screens.SafeMeetupDialogKt$SafeMeetupDialog$5$1$1$1$1$1$1$2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
                    public final void invoke(Composer composer2, int i4) {
                        String str2;
                        ComposerKt.sourceInformation(composer2, "C248@11576L35:SafeMeetupDialog.kt#2thlc2");
                        if ((i4 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1811462668, i4, -1, "com.example.ui.screens.SafeMeetupDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SafeMeetupDialog.kt:242)");
                        }
                        String str3 = str;
                        int iHashCode = str3.hashCode();
                        if (iHashCode != 2092477) {
                            if (iHashCode != 74235129) {
                                if (iHashCode == 1830861979 && str3.equals("Library")) {
                                    str2 = "🏛️ ";
                                } else {
                                    str2 = "👮 ";
                                }
                            } else if (str3.equals("Metro")) {
                                str2 = "🚇 ";
                            } else {
                                str2 = "👮 ";
                            }
                        } else if (str3.equals("Cafe")) {
                            str2 = "☕ ";
                        } else {
                            str2 = "👮 ";
                        }
                        TextKt.Text--4IGK_g(str2 + str, (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer2, 3072, 0, 131062);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), (Modifier) null, false, (Function2) null, (Function2) null, (Shape) null, FilterChipDefaults.INSTANCE.filterChipColors-XqyqHi0(0L, 0L, 0L, 0L, 0L, 0L, 0L, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), 0L, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnPrimaryContainer-0d7_KjU(), 0L, 0L, composer, 0, FilterChipDefaults.$stable << 6, 3455), (SelectableChipElevation) null, (BorderStroke) null, (MutableInteractionSource) null, composer, 384, 0, 3832);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }
}
