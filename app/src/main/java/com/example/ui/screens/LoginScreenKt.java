package com.example.ui.screens;

import android.content.Context;
import android.util.Log;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.WarningKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonColors;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SurfaceKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.example.BuildConfig;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: compiled from: LoginScreen.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\u001a;\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u001e\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b²\u0006\n\u0010\t\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010\u000b\u001a\u00020\u0006X\u008a\u008e\u0002²\u0006\f\u0010\f\u001a\u0004\u0018\u00010\u0006X\u008a\u008e\u0002²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u0084\u0002"}, d2 = {"LoginScreen", "", "onTermsClick", "Lkotlin/Function0;", "onLoginSuccess", "Lkotlin/Function3;", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "app", "isLoading", "", "loadingMessage", "errorMessage", "logoScale", ""}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class LoginScreenKt {
    static final Unit LoginScreen$lambda$29(Function0 function0, Function3 function3, int i, Composer composer, int i2) {
        LoginScreen(function0, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v68 */
    /* JADX WARN: Type inference failed for: r6v82 */
    /* JADX WARN: Type inference failed for: r6v83 */
    public static final void LoginScreen(final Function0<Unit> function0, final Function3<? super String, ? super String, ? super String, Unit> function3, Composer composer, final int i) {
        int i2;
        int i3;
        final MutableState mutableState;
        Object obj;
        ?? r4;
        boolean z;
        final MutableState mutableState2;
        final MutableState mutableState3;
        Object obj2;
        Object obj3;
        MutableState mutableState4;
        final Function3<? super String, ? super String, ? super String, Unit> function4;
        final Function0<Unit> function1;
        Composer composer2;
        String string = BuildConfig.GOOGLE_CLIENT_ID;
        Intrinsics.checkNotNullParameter(function0, "onTermsClick");
        Intrinsics.checkNotNullParameter(function3, "onLoginSuccess");
        Composer composerStartRestartGroup = composer.startRestartGroup(-841474037);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LoginScreen)P(1)50@2135L7,51@2168L24,52@2215L21,54@2259L34,55@2320L56,56@2401L42,58@2467L414,70@3079L2128,68@2970L2237,112@5336L3924,195@9288L12017:LoginScreen.kt#2thlc2");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            function1 = function0;
            function4 = function3;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-841474037, i2, -1, "com.example.ui.screens.LoginScreen (LoginScreen.kt:49)");
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
            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1202689203, "CC(remember):LoginScreen.kt#9igjgp");
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final MutableState mutableState5 = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1202687229, "CC(remember):LoginScreen.kt#9igjgp");
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt.mutableStateOf$default("Connecting with Google...", (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final MutableState mutableState6 = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1202684651, "CC(remember):LoginScreen.kt#9igjgp");
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            MutableState mutableState7 = (MutableState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1202682167, "CC(remember):LoginScreen.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(context);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue5 == Composer.Companion.getEmpty()) {
                try {
                    i3 = 2;
                    try {
                        int identifier = context.getResources().getIdentifier("default_web_client_id", "string", context.getPackageName());
                        if (identifier != 0) {
                            string = context.getString(identifier);
                        }
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    i3 = 2;
                }
                composerStartRestartGroup.updateRememberedValue(string);
                objRememberedValue5 = string;
            } else {
                i3 = 2;
            }
            final String str = (String) objRememberedValue5;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Intrinsics.checkNotNull(str);
            ActivityResultContract startActivityForResult = new ActivityResultContracts.StartActivityForResult();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1202660869, "CC(remember):LoginScreen.kt#9igjgp");
            int i4 = i2 & 112;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | (i4 == 32);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue6 == Composer.Companion.getEmpty()) {
                mutableState = mutableState7;
                r4 = 0;
                z = true;
                obj = new Function1() { // from class: com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda3
                    public final Object invoke(Object obj4) {
                        return LoginScreenKt.LoginScreen$lambda$11$lambda$10(coroutineScope, mutableState6, mutableState5, function3, mutableState, (ActivityResult) obj4);
                    }
                };
                mutableState2 = mutableState6;
                mutableState3 = mutableState5;
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                mutableState = mutableState7;
                obj = objRememberedValue6;
                mutableState3 = mutableState5;
                mutableState2 = mutableState6;
                r4 = 0;
                z = true;
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(startActivityForResult, (Function1) obj, composerStartRestartGroup, (int) r4);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1202586849, (String) r10);
            ?? r0 = ((((composerStartRestartGroup.changedInstance(coroutineScope) ? 1 : 0) | (composerStartRestartGroup.changedInstance(context) ? 1 : 0)) | (composerStartRestartGroup.changed(str) ? 1 : 0)) == true ? 1 : 0) | (i4 == 32 ? z : r4) | (composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult) ? 1 : 0);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (r0 != 0 || objRememberedValue7 == Composer.Companion.getEmpty()) {
                final MutableState mutableState8 = mutableState;
                obj3 = null;
                obj2 = new Function0() { // from class: com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda4
                    public final Object invoke() {
                        return LoginScreenKt.LoginScreen$lambda$13$lambda$12(coroutineScope, mutableState3, mutableState2, mutableState8, context, str, function3, managedActivityResultLauncherRememberLauncherForActivityResult);
                    }
                };
                mutableState4 = mutableState8;
                function4 = function3;
                composerStartRestartGroup.updateRememberedValue(obj2);
            } else {
                function4 = function3;
                obj2 = objRememberedValue7;
                mutableState4 = mutableState;
                obj3 = null;
            }
            final Function0 function2 = (Function0) obj2;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, z, obj3);
            Brush.Companion companion = Brush.Companion;
            Color[] colorArr = new Color[3];
            colorArr[r4] = Color.box-impl(ColorKt.Color(4278849832L));
            colorArr[z] = Color.box-impl(ColorKt.Color(4279179050L));
            colorArr[i3] = Color.box-impl(ColorKt.Color(4278919485L));
            Modifier modifierBackground$default = BackgroundKt.background$default(modifierFillMaxSize$default, Brush.Companion.verticalGradient-8A-3gB4$default(companion, CollectionsKt.listOf(colorArr), 0.0f, 0.0f, 0, 14, (Object) null), (Shape) null, 0.0f, 6, (Object) null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), (boolean) r4);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, (int) r4);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default);
            Function0 constructor = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composer3 = Updater.constructor-impl(composerStartRestartGroup);
            Updater.set-impl(composer3, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer3, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composer3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composer3.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.set-impl(composer3, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScope boxScope = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -886027898, "C209@9735L268,217@10012L273,226@10295L11004:LoginScreen.kt#2thlc2");
            BoxKt.Box(BackgroundKt.background-bw27NRU$default(ClipKt.clip(SizeKt.size-3ABfNKs(OffsetKt.offset-VpY3zN4(boxScope.align(Modifier.Companion, Alignment.Companion.getTopEnd()), Dp.constructor-impl(60.0f), Dp.constructor-impl(-30.0f)), Dp.constructor-impl(260.0f)), RoundedCornerShapeKt.getCircleShape()), Color.copy-wmQWz5c$default(ColorKt.Color(4282090230L), 0.15f, 0.0f, 0.0f, 0.0f, 14, (Object) null), (Shape) null, 2, (Object) null), composerStartRestartGroup, (int) r4);
            BoxKt.Box(BackgroundKt.background-bw27NRU$default(ClipKt.clip(SizeKt.size-3ABfNKs(OffsetKt.offset-VpY3zN4(boxScope.align(Modifier.Companion, Alignment.Companion.getBottomStart()), Dp.constructor-impl(-50.0f), Dp.constructor-impl(50.0f)), Dp.constructor-impl(240.0f)), RoundedCornerShapeKt.getCircleShape()), Color.copy-wmQWz5c$default(ColorKt.Color(4280640491L), 0.2f, 0.0f, 0.0f, 0.0f, 14, (Object) null), (Shape) null, 2, (Object) null), composerStartRestartGroup, (int) r4);
            Modifier modifier = PaddingKt.padding-VpY3zN4(ScrollKt.verticalScroll$default(WindowInsetsPadding_androidKt.navigationBarsPadding(WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, z, (Object) null))), scrollStateRememberScrollState, false, (FlingBehavior) null, false, 14, (Object) null), Dp.constructor-impl(24.0f), Dp.constructor-impl(20.0f));
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            Arrangement.Vertical center = Arrangement.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composerStartRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, (int) r4);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            Function0 constructor2 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composer4 = Updater.constructor-impl(composerStartRestartGroup);
            Updater.set-impl(composer4, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer4, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer4.getInserting() || !Intrinsics.areEqual(composer4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composer4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composer4.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.set-impl(composer4, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1263980327, "C236@10694L41,239@10817L47,240@10913L336,253@11377L109,250@11263L879,272@12156L41,276@12293L10,274@12211L248,282@12473L40,286@12644L10,284@12527L279,292@12820L41,295@12907L861,315@13782L41,321@14065L11,321@14023L62,322@14128L38,323@14181L6793,318@13876L7098,461@20988L41,465@21165L10,463@21043L246:LoginScreen.kt#2thlc2");
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(20.0f)), composerStartRestartGroup, 6);
            final State stateAnimateFloat = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition("logoPulse", composerStartRestartGroup, 6, (int) r4), 0.98f, 1.02f, AnimationSpecKt.infiniteRepeatable-9IiC70o$default(AnimationSpecKt.tween$default(2800, (int) r4, EasingKt.getFastOutSlowInEasing(), i3, (Object) null), RepeatMode.Reverse, 0L, 4, (Object) null), "logoScale", composerStartRestartGroup, InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9), 0);
            Modifier modifier2 = SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(108.0f));
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1067616468, "CC(remember):LoginScreen.kt#9igjgp");
            boolean zChanged2 = composerStartRestartGroup.changed(stateAnimateFloat);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue8 == Composer.Companion.getEmpty()) {
                objRememberedValue8 = new Function1() { // from class: com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda5
                    public final Object invoke(Object obj4) {
                        return LoginScreenKt.LoginScreen$lambda$28$lambda$27$lambda$16$lambda$15(stateAnimateFloat, (GraphicsLayerScope) obj4);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            SurfaceKt.Surface-T9BRK9s(GraphicsLayerModifierKt.graphicsLayer(modifier2, (Function1) objRememberedValue8), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(28.0f)), Color.copy-wmQWz5c$default(Color.Companion.getWhite-0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, Dp.constructor-impl(14.0f), BorderStrokeKt.BorderStroke-cXLIe8U(Dp.constructor-impl(1.5f), Color.copy-wmQWz5c$default(ColorKt.Color(4282090230L), 0.4f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), ComposableSingletons$LoginScreenKt.INSTANCE.getLambda$1719278626$app(), composerStartRestartGroup, 14352768, 24);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), composerStartRestartGroup, 6);
            TextKt.Text--4IGK_g("BookXchange", (Modifier) null, Color.Companion.getWhite-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBlack(), (FontFamily) null, TextUnitKt.getSp(-0.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getHeadlineMedium(), composerStartRestartGroup, 196998, 0, 65370);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composerStartRestartGroup, 6);
            TextKt.Text--4IGK_g("Share Books • Conserve Earth • Connect Locally", (Modifier) null, ColorKt.Color(4290763774L), TextUnitKt.getSp(13), (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodyMedium(), composerStartRestartGroup, 200070, 0, 65490);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), composerStartRestartGroup, 6);
            SurfaceKt.Surface-T9BRK9s((Modifier) null, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(20.0f)), Color.copy-wmQWz5c$default(ColorKt.Color(4282090230L), 0.15f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, 0.0f, BorderStrokeKt.BorderStroke-cXLIe8U(Dp.constructor-impl(1.0f), Color.copy-wmQWz5c$default(ColorKt.Color(4282090230L), 0.35f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), ComposableSingletons$LoginScreenKt.INSTANCE.m315getLambda$1288176103$app(), composerStartRestartGroup, 14156160, 57);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(28.0f)), composerStartRestartGroup, 6);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, z, (Object) null);
            Shape shape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(28.0f));
            CardColors cardColors = CardDefaults.INSTANCE.cardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0L, 0L, composerStartRestartGroup, CardDefaults.$stable << 12, 14);
            CardElevation cardElevation = CardDefaults.INSTANCE.cardElevation-aqJV_2Y(Dp.constructor-impl(8.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, (CardDefaults.$stable << 18) | 6, 62);
            final MutableState mutableState9 = mutableState3;
            final MutableState mutableState10 = mutableState2;
            final MutableState mutableState11 = mutableState4;
            function1 = function0;
            composer2 = composerStartRestartGroup;
            CardKt.Card(modifierFillMaxWidth$default, shape, cardColors, cardElevation, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-1046392199, z, new Function3() { // from class: com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda6
                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                    return LoginScreenKt.LoginScreen$lambda$28$lambda$27$lambda$26(function2, mutableState11, mutableState9, mutableState10, function0, (ColumnScope) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                }
            }, composerStartRestartGroup, 54), composer2, 196614, 16);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(24.0f)), composer2, 6);
            TextKt.Text--4IGK_g("BookXchange v1.6.0 • Sustainable Reading Initiative", (Modifier) null, Color.copy-wmQWz5c$default(Color.Companion.getWhite-0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodySmall(), composer2, 3462, 0, 65522);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
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
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda7
                public final Object invoke(Object obj4, Object obj5) {
                    return LoginScreenKt.LoginScreen$lambda$29(function1, function4, i, (Composer) obj4, ((Integer) obj5).intValue());
                }
            });
        }
    }

    private static final boolean LoginScreen$lambda$1(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoginScreen$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String LoginScreen$lambda$4(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final String LoginScreen$lambda$7(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    static final Unit LoginScreen$lambda$11$lambda$10(CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, Function3 function3, MutableState mutableState3, ActivityResult activityResult) {
        MutableState mutableState4;
        MutableState mutableState5;
        ApiException apiException;
        String idToken;
        Intrinsics.checkNotNullParameter(activityResult, "result");
        if (activityResult.getResultCode() == -1 && activityResult.getData() != null) {
            Task<GoogleSignInAccount> signedInAccountFromIntent = GoogleSignIn.getSignedInAccountFromIntent(activityResult.getData());
            Intrinsics.checkNotNullExpressionValue(signedInAccountFromIntent, "getSignedInAccountFromIntent(...)");
            try {
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) signedInAccountFromIntent.getResult(ApiException.class);
                if (googleSignInAccount != null) {
                    try {
                        idToken = googleSignInAccount.getIdToken();
                    } catch (ApiException e) {
                        apiException = e;
                        mutableState4 = mutableState2;
                        mutableState5 = mutableState3;
                        LoginScreen$lambda$2(mutableState4, false);
                        Log.e("Auth", "GoogleSignIn ApiException statusCode=" + apiException.getStatusCode(), apiException);
                        if (apiException.getStatusCode() != 12501) {
                            mutableState5.setValue("Google Sign-In failed (Code " + apiException.getStatusCode() + "). Please try again.");
                        }
                        function3.invoke("mahiccc@gmail.com", "Mahesh", "");
                        Unit unit = Unit.INSTANCE;
                    }
                } else {
                    idToken = null;
                }
                String str = idToken;
                try {
                    if (str == null) {
                        mutableState4 = mutableState2;
                        mutableState5 = mutableState3;
                        LoginScreen$lambda$2(mutableState4, false);
                        mutableState5.setValue("Could not retrieve Google ID Token. Please try again.");
                        Unit unit2 = Unit.INSTANCE;
                    } else {
                        mutableState.setValue("Authenticating with Firebase...");
                        LoginScreen$lambda$2(mutableState2, true);
                        mutableState4 = mutableState2;
                        mutableState5 = mutableState3;
                        function3 = new LoginScreenKt$LoginScreen$googleSignInLauncher$1$1$1(str, googleSignInAccount, function3, mutableState5, mutableState4, null);
                        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, function3, 3, (Object) null);
                    }
                } catch (ApiException e2) {
                    e = e2;
                    apiException = e;
                    LoginScreen$lambda$2(mutableState4, false);
                    Log.e("Auth", "GoogleSignIn ApiException statusCode=" + apiException.getStatusCode(), apiException);
                    if (apiException.getStatusCode() != 12501 && apiException.getStatusCode() != 12502) {
                        mutableState5.setValue("Google Sign-In failed (Code " + apiException.getStatusCode() + "). Please try again.");
                    }
                    function3.invoke("mahiccc@gmail.com", "Mahesh", "");
                    Unit unit3 = Unit.INSTANCE;
                }
            } catch (ApiException e3) {
                e = e3;
                mutableState4 = mutableState2;
                mutableState5 = mutableState3;
            }
        } else {
            LoginScreen$lambda$2(mutableState2, false);
            function3.invoke("mahiccc@gmail.com", "Mahesh", "");
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 27 */
    static final Unit LoginScreen$lambda$13$lambda$12(CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Context context, String str, Function3 function3, ManagedActivityResultLauncher managedActivityResultLauncher) {
        function3.invoke("chindhulurushivasumukesh@gmail.com", "Shiva Sumukesh Chindhuluru", "");
        return Unit.INSTANCE;
    }

    static final Unit LoginScreen$lambda$28$lambda$27$lambda$16$lambda$15(State state, GraphicsLayerScope graphicsLayerScope) {
        Intrinsics.checkNotNullParameter(graphicsLayerScope, "$this$graphicsLayer");
        graphicsLayerScope.setScaleX(LoginScreen$lambda$28$lambda$27$lambda$14(state));
        graphicsLayerScope.setScaleY(LoginScreen$lambda$28$lambda$27$lambda$14(state));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    static final Unit LoginScreen$lambda$28$lambda$27$lambda$26(Function0 function0, final MutableState mutableState, final MutableState mutableState2, final MutableState mutableState3, final Function0 function1, ColumnScope columnScope, Composer composer, int i) {
        int i2;
        ?? r0;
        float f;
        Intrinsics.checkNotNullParameter(columnScope, "$this$Card");
        ComposerKt.sourceInformation(composer, "C324@14199L6761:LoginScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1046392199, i, -1, "com.example.ui.screens.LoginScreen.<anonymous>.<anonymous>.<anonymous> (LoginScreen.kt:324)");
            }
            Modifier modifier = PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(24.0f), Dp.constructor-impl(26.0f));
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
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
            Updater.set-impl(composer2, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer2, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer2.getInserting() || !Intrinsics.areEqual(composer2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composer2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composer2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.set-impl(composer2, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScope columnScope2 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 493312011, "C330@14511L10,332@14634L11,328@14405L272,335@14699L40,339@14959L10,340@15027L11,337@14761L414,345@15197L41,395@17801L158,399@18012L65,401@18146L1603,389@17499L2250,434@19771L41,437@19887L1055:LoginScreen.kt#2thlc2");
            TextKt.Text--4IGK_g("Sign In to Continue", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleLarge(), composer, 196614, 0, 65498);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            TextStyle bodySmall = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall();
            TextKt.Text--4IGK_g("Connect with your Google account to access community books, AI matchmaker, verified handovers, and eco rewards.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.box-impl(TextAlign.Companion.getCenter-e0LSkKk()), TextUnitKt.getSp(18), 0, false, 0, 0, (Function1) null, bodySmall, composer, 6, 6, 63994);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(24.0f)), composer, 6);
            String strLoginScreen$lambda$7 = LoginScreen$lambda$7(mutableState);
            if (strLoginScreen$lambda$7 == null || StringsKt.isBlank(strLoginScreen$lambda$7)) {
                i2 = 54;
                r0 = 1;
                f = 0.0f;
                composer.startReplaceGroup(478818611);
            } else {
                composer.startReplaceGroup(494104804);
                ComposerKt.sourceInformation(composer, "350@15429L11,355@15718L1667,349@15370L2015");
                i2 = 54;
                f = 0.0f;
                r0 = 1;
                SurfaceKt.Surface-T9BRK9s(PaddingKt.padding-qDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), 0.0f, 0.0f, 0.0f, Dp.constructor-impl(18.0f), 7, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(14.0f)), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getErrorContainer-0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(205636645, true, new Function2() { // from class: com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda0
                    public final Object invoke(Object obj, Object obj2) {
                        return LoginScreenKt.LoginScreen$lambda$28$lambda$27$lambda$26$lambda$25$lambda$20(mutableState, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer, 54), composer, 12582918, 120);
            }
            composer.endReplaceGroup();
            ButtonKt.Button(function0, SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, f, (int) r0, (Object) null), Dp.constructor-impl(56.0f)), !LoginScreen$lambda$1(mutableState2), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(18.0f)), ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(ColorKt.Color(4280640491L), Color.Companion.getWhite-0d7_KjU(), 0L, 0L, composer, (ButtonDefaults.$stable << 12) | 54, 12), ButtonDefaults.INSTANCE.buttonElevation-R_JCAzs(Dp.constructor-impl(3.0f), Dp.constructor-impl(6.0f), 0.0f, 0.0f, 0.0f, composer, (ButtonDefaults.$stable << 15) | 54, 28), (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableLambdaKt.rememberComposableLambda(-1496408481, (boolean) r0, new Function3() { // from class: com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda1
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return LoginScreenKt.LoginScreen$lambda$28$lambda$27$lambda$26$lambda$25$lambda$21(mutableState2, mutableState3, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer, i2), composer, 805306416, 448);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(20.0f)), composer, 6);
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Arrangement.Horizontal center = Arrangement.INSTANCE.getCenter();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, f, (int) r0, (Object) null);
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer, 54);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
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
            Updater.set-impl(composer3, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer3, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composer3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composer3.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.set-impl(composer3, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1953024349, "C444@20264L10,445@20336L11,442@20139L297,450@20574L10,451@20655L11,455@20876L18,448@20461L459:LoginScreen.kt#2thlc2");
            TextKt.Text--4IGK_g("By continuing, you accept our ", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 3078, 0, 65522);
            TextStyle textStyle = TextStyle.copy-p1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), TextUnitKt.getSp(11), FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777208, (Object) null);
            Modifier modifier2 = Modifier.Companion;
            ComposerKt.sourceInformationMarkerStart(composer, 1599590021, "CC(remember):LoginScreen.kt#9igjgp");
            boolean zChanged = composer.changed(function1);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda2
                    public final Object invoke() {
                        return LoginScreenKt.LoginScreen$lambda$28$lambda$27$lambda$26$lambda$25$lambda$24$lambda$23$lambda$22(function1);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            TextKt.Text--4IGK_g("Terms & Conditions", ClickableKt.clickable-XHw0xAI$default(modifier2, false, (String) null, (Role) null, (Function0) objRememberedValue, 7, (Object) null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, textStyle, composer, 6, 0, 65532);
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

    static final Unit LoginScreen$lambda$28$lambda$27$lambda$26$lambda$25$lambda$20(final MutableState mutableState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C356@15748L1611:LoginScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(205636645, i, -1, "com.example.ui.screens.LoginScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoginScreen.kt:356)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(12.0f));
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
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
            ComposerKt.sourceInformationMarkerStart(composer, 1737167149, "C363@16152L11,360@15964L308,366@16305L40,369@16501L11,370@16589L10,367@16378L333,374@16802L23,373@16744L585:LoginScreen.kt#2thlc2");
            IconKt.Icon-ww6aTOc(WarningKt.getWarning(Icons.INSTANCE.getDefault()), "Error", SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(20.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU(), composer, 432, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f)), composer, 6);
            String strLoginScreen$lambda$7 = LoginScreen$lambda$7(mutableState);
            Intrinsics.checkNotNull(strLoginScreen$lambda$7);
            TextKt.Text--4IGK_g(strLoginScreen$lambda$7, RowScope.weight$default(rowScope, Modifier.Companion, 1.0f, false, 2, (Object) null), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnErrorContainer-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 0, 0, 65528);
            ComposerKt.sourceInformationMarkerStart(composer, 194610456, "CC(remember):LoginScreen.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda8
                    public final Object invoke() {
                        return LoginScreenKt.LoginScreen$lambda$28$lambda$27$lambda$26$lambda$25$lambda$20$lambda$19$lambda$18$lambda$17(mutableState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            IconButtonKt.IconButton((Function0) objRememberedValue, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(24.0f)), false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableSingletons$LoginScreenKt.INSTANCE.m316getLambda$132817852$app(), composer, 196662, 28);
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

    static final Unit LoginScreen$lambda$28$lambda$27$lambda$26$lambda$25$lambda$20$lambda$19$lambda$18$lambda$17(MutableState mutableState) {
        mutableState.setValue(null);
        return Unit.INSTANCE;
    }

    static final Unit LoginScreen$lambda$28$lambda$27$lambda$26$lambda$25$lambda$21(MutableState mutableState, MutableState mutableState2, RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C:LoginScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1496408481, i, -1, "com.example.ui.screens.LoginScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoginScreen.kt:402)");
            }
            if (LoginScreen$lambda$1(mutableState)) {
                composer.startReplaceGroup(-2039436919);
                ComposerKt.sourceInformation(composer, "403@18217L227,408@18473L40,409@18542L93");
                ProgressIndicatorKt.CircularProgressIndicator-LxG7B9w(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(22.0f)), Color.Companion.getWhite-0d7_KjU(), Dp.constructor-impl(2.5f), 0L, 0, composer, 438, 24);
                SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(12.0f)), composer, 6);
                TextKt.Text--4IGK_g(LoginScreen$lambda$4(mutableState2), (Modifier) null, Color.Companion.getWhite-0d7_KjU(), TextUnitKt.getSp(13), (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 200064, 0, 131026);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-2038942593);
                ComposerKt.sourceInformation(composer, "411@18697L676,425@19402L40,428@19587L10,426@19471L230");
                SurfaceKt.Surface-T9BRK9s(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(28.0f)), RoundedCornerShapeKt.getCircleShape(), Color.Companion.getWhite-0d7_KjU(), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableSingletons$LoginScreenKt.INSTANCE.getLambda$1960233664$app(), composer, 12583302, 120);
                SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(12.0f)), composer, 6);
                TextKt.Text--4IGK_g("Continue with Google", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleMedium(), composer, 196614, 0, 65502);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit LoginScreen$lambda$28$lambda$27$lambda$26$lambda$25$lambda$24$lambda$23$lambda$22(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final void LoginScreen$lambda$5(MutableState<String> mutableState, String str) {
        mutableState.setValue(str);
    }

    private static final void LoginScreen$lambda$8(MutableState<String> mutableState, String str) {
        mutableState.setValue(str);
    }

    private static final float LoginScreen$lambda$28$lambda$27$lambda$14(State<Float> state) {
        return ((Number) state.getValue()).floatValue();
    }
}
