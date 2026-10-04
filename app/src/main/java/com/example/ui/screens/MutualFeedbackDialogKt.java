package com.example.ui.screens;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
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
import androidx.compose.material.icons.filled.BookKt;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.material.icons.filled.PersonKt;
import androidx.compose.material.icons.filled.RateReviewKt;
import androidx.compose.material.icons.filled.StarKt;
import androidx.compose.material.icons.filled.StarOutlineKt;
import androidx.compose.material.icons.filled.VerifiedUserKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonElevation;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.IconButtonColors;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SelectableChipColors;
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
import androidx.compose.runtime.IntState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
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
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.profileinstaller.ProfileVerifier;
import com.example.BuildConfig;
import com.example.data.Book;
import com.example.ui.BookViewModel;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: MutualFeedbackDialog.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0002\u0010\n\u001a)\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0010¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\rX\u008a\u008e\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010\u0015\u001a\u00020\rX\u008a\u008e\u0002²\u0006\n\u0010\u0016\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010\u0017\u001a\u00020\rX\u008a\u008e\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u008e\u0002"}, d2 = {"MutualFeedbackDialog", "", "book", "Lcom/example/data/Book;", "feedbackType", "Lcom/example/ui/screens/FeedbackTargetType;", "viewModel", "Lcom/example/ui/BookViewModel;", "onDismiss", "Lkotlin/Function0;", "(Lcom/example/data/Book;Lcom/example/ui/screens/FeedbackTargetType;Lcom/example/ui/BookViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "InteractiveStarRating", "rating", "", "onRatingChange", "Lkotlin/Function1;", "(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "app", "bookRating", "bookReviewText", "", "lenderRating", "lenderReviewText", "borrowerRating", "borrowerReviewText", "isSubmitting", ""}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class MutualFeedbackDialogKt {
    static final Unit InteractiveStarRating$lambda$76(int i, Function1 function1, int i2, Composer composer, int i3) {
        InteractiveStarRating(i, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    static final Unit MutualFeedbackDialog$lambda$71(Book book, FeedbackTargetType feedbackTargetType, BookViewModel bookViewModel, Function0 function0, int i, Composer composer, int i2) {
        MutualFeedbackDialog(book, feedbackTargetType, bookViewModel, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void MutualFeedbackDialog(final Book book, final FeedbackTargetType feedbackTargetType, final BookViewModel bookViewModel, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(book, "book");
        Intrinsics.checkNotNullParameter(feedbackTargetType, "feedbackType");
        Intrinsics.checkNotNullParameter(bookViewModel, "viewModel");
        Intrinsics.checkNotNullParameter(function0, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(1275332414);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(MutualFeedbackDialog)P(!2,3)40@1368L7,43@1439L33,44@1499L31,46@1686L41,49@1795L33,50@1857L31,52@2037L41,55@2148L33,56@2212L31,58@2414L41,60@2481L34,65@2644L16428,62@2521L16551:MutualFeedbackDialog.kt#2thlc2");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(book) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(feedbackTargetType.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(bookViewModel) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i2 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1275332414, i2, -1, "com.example.ui.screens.MutualFeedbackDialog (MutualFeedbackDialog.kt:39)");
            }
            CompositionLocal localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final Context context = (Context) objConsume;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1528778655, "CC(remember):MutualFeedbackDialog.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotIntStateKt.mutableIntStateOf(5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableIntState mutableIntState = (MutableIntState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1528780573, "CC(remember):MutualFeedbackDialog.kt#9igjgp");
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final MutableState mutableState = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final List listListOf = CollectionsKt.listOf(new String[]{"Great Condition", "Page-Turner", "Clean & Intact", "Must Read", "Helpful", "Minor Creases"});
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1528786567, "CC(remember):MutualFeedbackDialog.kt#9igjgp");
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt.mutableStateListOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1528790047, "CC(remember):MutualFeedbackDialog.kt#9igjgp");
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = SnapshotIntStateKt.mutableIntStateOf(5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final MutableIntState mutableIntState2 = (MutableIntState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1528792029, "CC(remember):MutualFeedbackDialog.kt#9igjgp");
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            final MutableState mutableState2 = (MutableState) objRememberedValue5;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final List listListOf2 = CollectionsKt.listOf(new String[]{"Punctual", "Super Friendly", "Easy Meetup", "Quick Responder", "Trusted Lender"});
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1528797799, "CC(remember):MutualFeedbackDialog.kt#9igjgp");
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == Composer.Companion.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt.mutableStateListOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            final SnapshotStateList snapshotStateList2 = (SnapshotStateList) objRememberedValue6;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1528801343, "CC(remember):MutualFeedbackDialog.kt#9igjgp");
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == Composer.Companion.getEmpty()) {
                objRememberedValue7 = SnapshotIntStateKt.mutableIntStateOf(5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            final MutableIntState mutableIntState3 = (MutableIntState) objRememberedValue7;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1528803389, "CC(remember):MutualFeedbackDialog.kt#9igjgp");
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == Composer.Companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default);
                objRememberedValue8 = mutableStateMutableStateOf$default;
            }
            final MutableState mutableState3 = (MutableState) objRememberedValue8;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final List listListOf3 = CollectionsKt.listOf(new String[]{"Returned on Time", "Book Kept Pristine", "Polite & Respectful", "Great Communication", "Reliable"});
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1528809863, "CC(remember):MutualFeedbackDialog.kt#9igjgp");
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue9 == Composer.Companion.getEmpty()) {
                objRememberedValue9 = SnapshotStateKt.mutableStateListOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            final SnapshotStateList snapshotStateList3 = (SnapshotStateList) objRememberedValue9;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1528812000, "CC(remember):MutualFeedbackDialog.kt#9igjgp");
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue10 == Composer.Companion.getEmpty()) {
                objRememberedValue10 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            final MutableState mutableState4 = (MutableState) objRememberedValue10;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composer2 = composerStartRestartGroup;
            AndroidDialog_androidKt.Dialog(function0, new DialogProperties(false, false, false, 3, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-941680939, true, new Function2() { // from class: com.example.ui.screens.MutualFeedbackDialogKt$$ExternalSyntheticLambda3
                public final Object invoke(Object obj, Object obj2) {
                    return MutualFeedbackDialogKt.MutualFeedbackDialog$lambda$70(function0, feedbackTargetType, book, mutableIntState, listListOf, snapshotStateList, mutableState, mutableIntState2, listListOf2, snapshotStateList2, mutableState2, mutableIntState3, listListOf3, snapshotStateList3, mutableState3, bookViewModel, context, mutableState4, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer2, 54), composer2, ((i2 >> 9) & 14) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.MutualFeedbackDialogKt$$ExternalSyntheticLambda4
                public final Object invoke(Object obj, Object obj2) {
                    return MutualFeedbackDialogKt.MutualFeedbackDialog$lambda$71(book, feedbackTargetType, bookViewModel, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final int MutualFeedbackDialog$lambda$1(MutableIntState mutableIntState) {
        return ((IntState) mutableIntState).getIntValue();
    }

    private static final String MutualFeedbackDialog$lambda$4(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final int MutualFeedbackDialog$lambda$8(MutableIntState mutableIntState) {
        return ((IntState) mutableIntState).getIntValue();
    }

    private static final String MutualFeedbackDialog$lambda$11(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final int MutualFeedbackDialog$lambda$15(MutableIntState mutableIntState) {
        return ((IntState) mutableIntState).getIntValue();
    }

    private static final String MutualFeedbackDialog$lambda$18(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final boolean MutualFeedbackDialog$lambda$22(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void MutualFeedbackDialog$lambda$23(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    static final Unit MutualFeedbackDialog$lambda$70(final Function0 function0, final FeedbackTargetType feedbackTargetType, final Book book, final MutableIntState mutableIntState, final List list, final SnapshotStateList snapshotStateList, final MutableState mutableState, final MutableIntState mutableIntState2, final List list2, final SnapshotStateList snapshotStateList2, final MutableState mutableState2, final MutableIntState mutableIntState3, final List list3, final SnapshotStateList snapshotStateList3, final MutableState mutableState3, final BookViewModel bookViewModel, final Context context, final MutableState mutableState4, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C72@2934L11,72@2892L62,73@2993L38,74@3042L16024,66@2654L16412:MutualFeedbackDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-941680939, i, -1, "com.example.ui.screens.MutualFeedbackDialog.<anonymous> (MutualFeedbackDialog.kt:66)");
            }
            CardKt.Card(PaddingKt.padding-VpY3zN4$default(SizeKt.fillMaxHeight(SizeKt.fillMaxWidth(Modifier.Companion, 0.94f), 0.88f), 0.0f, Dp.constructor-impl(16.0f), 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(24.0f)), CardDefaults.INSTANCE.cardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0L, 0L, composer, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.cardElevation-aqJV_2Y(Dp.constructor-impl(8.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer, (CardDefaults.$stable << 18) | 6, 62), (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(563916103, true, new Function3() { // from class: com.example.ui.screens.MutualFeedbackDialogKt$$ExternalSyntheticLambda0
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return MutualFeedbackDialogKt.MutualFeedbackDialog$lambda$70$lambda$69(function0, feedbackTargetType, book, mutableIntState, list, snapshotStateList, mutableState, mutableIntState2, list2, snapshotStateList2, mutableState2, mutableIntState3, list3, snapshotStateList3, mutableState3, bookViewModel, context, mutableState4, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer, 54), composer, 196614, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit MutualFeedbackDialog$lambda$70$lambda$69(final Function0 function0, final FeedbackTargetType feedbackTargetType, final Book book, final MutableIntState mutableIntState, final List list, final SnapshotStateList snapshotStateList, final MutableState mutableState, final MutableIntState mutableIntState2, final List list2, final SnapshotStateList snapshotStateList2, final MutableState mutableState2, final MutableIntState mutableIntState3, final List list3, final SnapshotStateList snapshotStateList3, final MutableState mutableState3, final BookViewModel bookViewModel, final Context context, final MutableState mutableState4, ColumnScope columnScope, Composer composer, int i) {
        Object obj;
        String strSubstringBefore$default;
        String str;
        int i2;
        String str2;
        float f;
        Object obj2;
        String strSubstringBefore$default2;
        char c;
        Composer composer2;
        Intrinsics.checkNotNullParameter(columnScope, "$this$Card");
        ComposerKt.sourceInformation(composer, "C75@3056L16000:MutualFeedbackDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(563916103, i, -1, "com.example.ui.screens.MutualFeedbackDialog.<anonymous>.<anonymous> (MutualFeedbackDialog.kt:75)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(20.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
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
            Composer composer3 = Updater.constructor-impl(composer);
            Updater.set-impl(composer3, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer3, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composer3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composer3.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.set-impl(composer3, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScope columnScope2 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -2125940223, "C81@3229L2395,124@5642L41,130@5865L21,127@5741L10551,285@16310L41,288@16403L2639:MutualFeedbackDialog.kt#2thlc2");
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer, 54);
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
            Composer composer4 = Updater.constructor-impl(composer);
            Updater.set-impl(composer4, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer4, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer4.getInserting() || !Intrinsics.areEqual(composer4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composer4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composer4.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.set-impl(composer4, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -372588793, "C86@3467L1983,119@5471L135:MutualFeedbackDialog.kt#2thlc2");
            Alignment.Vertical centerVertically2 = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier2 = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer, 48);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifier2);
            Function0 constructor3 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer composer5 = Updater.constructor-impl(composer);
            Updater.set-impl(composer5, measurePolicyRowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer5, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer5.getInserting() || !Intrinsics.areEqual(composer5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composer5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composer5.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.set-impl(composer5, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope2 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1324339037, "C88@3604L11,91@3783L617,87@3545L855,102@4425L40,103@4490L938:MutualFeedbackDialog.kt#2thlc2");
            SurfaceKt.Surface-T9BRK9s(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(40.0f)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(1859875040, true, new Function2() { // from class: com.example.ui.screens.MutualFeedbackDialogKt$$ExternalSyntheticLambda5
                public final Object invoke(Object obj3, Object obj4) {
                    return MutualFeedbackDialogKt.MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$28$lambda$27$lambda$25(feedbackTargetType, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, composer, 54), composer, 12582918, 120);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f)), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier3 = Modifier.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, modifier3);
            Function0 constructor4 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor4);
            } else {
                composer.useNode();
            }
            Composer composer6 = Updater.constructor-impl(composer);
            Updater.set-impl(composer6, measurePolicyColumnMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer6, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer6.getInserting() || !Intrinsics.areEqual(composer6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composer6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composer6.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.set-impl(composer6, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScope columnScope3 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -806523555, "C107@4773L10,104@4527L360,114@5276L10,115@5353L11,110@4916L486:MutualFeedbackDialog.kt#2thlc2");
            TextKt.Text--4IGK_g(feedbackTargetType == FeedbackTargetType.BORROWER_TO_LENDER_AND_BOOK ? "Rate Book & Lender" : "Rate Borrower", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleMedium(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
            if (feedbackTargetType == FeedbackTargetType.BORROWER_TO_LENDER_AND_BOOK) {
                str = "Feedback for '" + book.getTitle() + "' & owner";
                obj = null;
            } else {
                String borrowerName = book.getBorrowerName();
                obj = null;
                if (borrowerName == null || (strSubstringBefore$default = StringsKt.substringBefore$default(borrowerName, "@", (String) null, 2, (Object) null)) == null) {
                    strSubstringBefore$default = "Reader";
                }
                str = "Feedback for borrower: " + strSubstringBefore$default;
            }
            TextKt.Text--4IGK_g(str, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOutline-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 0, 0, 65530);
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
            IconButtonKt.IconButton(function0, (Modifier) null, false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableSingletons$MutualFeedbackDialogKt.INSTANCE.m324getLambda$1795728898$app(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(14.0f)), composer, 6);
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(ColumnScope.weight$default(columnScope2, Modifier.Companion, 1.0f, false, 2, (Object) null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, (FlingBehavior) null, false, 14, (Object) null);
            Arrangement.Vertical vertical = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(16.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(vertical, Alignment.Companion.getStart(), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer, modifierVerticalScroll$default);
            Function0 constructor5 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor5);
            } else {
                composer.useNode();
            }
            Composer composer7 = Updater.constructor-impl(composer);
            Updater.set-impl(composer7, measurePolicyColumnMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer7, currentCompositionLocalMap5, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash5 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer7.getInserting() || !Intrinsics.areEqual(composer7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                composer7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                composer7.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
            }
            Updater.set-impl(composer7, modifierMaterializeModifier5, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScope columnScope4 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1921888365, "C:MutualFeedbackDialog.kt#2thlc2");
            if (feedbackTargetType == FeedbackTargetType.BORROWER_TO_LENDER_AND_BOOK) {
                composer.startReplaceGroup(1921845956);
                ComposerKt.sourceInformation(composer, "136@6243L11,136@6201L88,139@6443L2918,135@6145L3216,186@9657L11,186@9615L91,189@9860L2916,185@9559L3217");
                i2 = 1;
                CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(16.0f)), CardDefaults.INSTANCE.cardColors-ro_MJ88(Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0L, 0L, composer, CardDefaults.$stable << 12, 14), (CardElevation) null, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(1433709888, true, new Function3() { // from class: com.example.ui.screens.MutualFeedbackDialogKt$$ExternalSyntheticLambda6
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        return MutualFeedbackDialogKt.MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$63$lambda$39(book, mutableIntState, list, snapshotStateList, mutableState, (ColumnScope) obj3, (Composer) obj4, ((Integer) obj5).intValue());
                    }
                }, composer, 54), composer, 196614, 24);
                String ownerDisplayName = book.getOwnerDisplayName();
                if (StringsKt.isBlank(ownerDisplayName)) {
                    ownerDisplayName = StringsKt.substringBefore$default(book.getOwnerName(), "@", (String) null, 2, (Object) null);
                }
                final String str3 = ownerDisplayName;
                f = 0.0f;
                str2 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                obj2 = null;
                composer2 = composer;
                CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(16.0f)), CardDefaults.INSTANCE.cardColors-ro_MJ88(Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), 0.35f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0L, 0L, composer, CardDefaults.$stable << 12, 14), (CardElevation) null, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-620990345, true, new Function3() { // from class: com.example.ui.screens.MutualFeedbackDialogKt$$ExternalSyntheticLambda7
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        return MutualFeedbackDialogKt.MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$63$lambda$51(str3, mutableIntState2, list2, snapshotStateList2, mutableState2, (ColumnScope) obj3, (Composer) obj4, ((Integer) obj5).intValue());
                    }
                }, composer, 54), composer2, 196614, 24);
                composer2.endReplaceGroup();
                c = '6';
            } else {
                i2 = 1;
                str2 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                f = 0.0f;
                obj2 = null;
                composer.startReplaceGroup(1928427969);
                ComposerKt.sourceInformation(composer, "236@13078L11,236@13036L92,239@13282L2970,235@12980L3272");
                String borrowerName2 = book.getBorrowerName();
                if (borrowerName2 == null || (strSubstringBefore$default2 = StringsKt.substringBefore$default(borrowerName2, "@", (String) null, 2, (Object) null)) == null) {
                    strSubstringBefore$default2 = "Borrower";
                }
                final String str4 = strSubstringBefore$default2;
                c = '6';
                composer2 = composer;
                CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(16.0f)), CardDefaults.INSTANCE.cardColors-ro_MJ88(Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getTertiaryContainer-0d7_KjU(), 0.35f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0L, 0L, composer, CardDefaults.$stable << 12, 14), (CardElevation) null, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(2021473737, true, new Function3() { // from class: com.example.ui.screens.MutualFeedbackDialogKt$$ExternalSyntheticLambda8
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        return MutualFeedbackDialogKt.MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$63$lambda$62(str4, mutableIntState3, list3, snapshotStateList3, mutableState3, (ColumnScope) obj3, (Composer) obj4, ((Integer) obj5).intValue());
                    }
                }, composer, 54), composer2, 196614, 24);
                composer2.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(12.0f)), composer2, 6);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.Companion, f, i2, obj2);
            Arrangement.Horizontal horizontal = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(10.0f));
            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(horizontal, Alignment.Companion.getTop(), composer2, 6);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default2);
            Function0 constructor6 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str2);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor6);
            } else {
                composer2.useNode();
            }
            Composer composer8 = Updater.constructor-impl(composer2);
            Updater.set-impl(composer8, measurePolicyRowMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer8, currentCompositionLocalMap6, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash6 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer8.getInserting() || !Intrinsics.areEqual(composer8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                composer8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                composer8.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
            }
            Updater.set-impl(composer8, modifierMaterializeModifier6, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope3 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, 36861979, "C292@16576L259,301@16899L1446,328@18534L490,300@16857L2167:MutualFeedbackDialog.kt#2thlc2");
            ButtonKt.OutlinedButton(function0, RowScope.weight$default(rowScope3, Modifier.Companion, 1.0f, false, 2, (Object) null), false, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$MutualFeedbackDialogKt.INSTANCE.getLambda$764139402$app(), composer, 805306368, 500);
            Composer composer9 = composer;
            boolean z = !MutualFeedbackDialog$lambda$22(mutableState4);
            Modifier modifierWeight$default = RowScope.weight$default(rowScope3, Modifier.Companion, 1.5f, false, 2, (Object) null);
            Shape shape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f));
            ComposerKt.sourceInformationMarkerStart(composer9, 1198430, "CC(remember):MutualFeedbackDialog.kt#9igjgp");
            boolean zChanged = composer9.changed(feedbackTargetType.ordinal()) | composer9.changedInstance(bookViewModel) | composer9.changedInstance(book) | composer9.changedInstance(context) | composer9.changed(function0);
            Object objRememberedValue = composer9.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                Function0 function1 = new Function0() { // from class: com.example.ui.screens.MutualFeedbackDialogKt$$ExternalSyntheticLambda9
                    public final Object invoke() {
                        return MutualFeedbackDialogKt.MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$67$lambda$65$lambda$64(feedbackTargetType, bookViewModel, book, snapshotStateList, snapshotStateList2, context, snapshotStateList3, function0, mutableState4, mutableIntState, mutableState, mutableIntState2, mutableState2, mutableIntState3, mutableState3);
                    }
                };
                composer9 = composer;
                composer9.updateRememberedValue(function1);
                objRememberedValue = function1;
            }
            ComposerKt.sourceInformationMarkerEnd(composer9);
            ButtonKt.Button((Function0) objRememberedValue, modifierWeight$default, z, shape, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableLambdaKt.rememberComposableLambda(1593080456, true, new Function3() { // from class: com.example.ui.screens.MutualFeedbackDialogKt$$ExternalSyntheticLambda10
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    return MutualFeedbackDialogKt.MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$67$lambda$66(mutableState4, (RowScope) obj3, (Composer) obj4, ((Integer) obj5).intValue());
                }
            }, composer9, 54), composer9, 805306368, 496);
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

    static final Unit MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$28$lambda$27$lambda$25(FeedbackTargetType feedbackTargetType, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C92@3813L561:MutualFeedbackDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1859875040, i, -1, "com.example.ui.screens.MutualFeedbackDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MutualFeedbackDialog.kt:92)");
            }
            Alignment center = Alignment.Companion.getCenter();
            ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            Modifier modifier = Modifier.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
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
            Updater.set-impl(composer2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer2, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer2.getInserting() || !Intrinsics.areEqual(composer2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composer2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composer2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.set-impl(composer2, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScope boxScope = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1559003553, "C97@4222L11,93@3888L456:MutualFeedbackDialog.kt#2thlc2");
            IconKt.Icon-ww6aTOc(feedbackTargetType == FeedbackTargetType.BORROWER_TO_LENDER_AND_BOOK ? RateReviewKt.getRateReview(Icons.INSTANCE.getDefault()) : StarKt.getStar(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(22.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 432, 0);
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

    static final Unit MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$63$lambda$39(Book book, final MutableIntState mutableIntState, final List list, final SnapshotStateList snapshotStateList, final MutableState mutableState, ColumnScope columnScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(columnScope, "$this$Card");
        ComposerKt.sourceInformation(composer, "C140@6473L2862:MutualFeedbackDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1433709888, i, -1, "com.example.ui.screens.MutualFeedbackDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MutualFeedbackDialog.kt:140)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(14.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
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
            ComposerKt.sourceInformationMarkerStart(composer, 260717162, "C141@6550L462,146@7096L10,146@7140L11,146@7045L124,148@7235L41,151@7442L19,149@7309L186,154@7561L40,155@7682L10,155@7634L104,156@7771L40,157@7904L703,157@7844L763,170@8641L40,173@8845L23,171@8714L591:MutualFeedbackDialog.kt#2thlc2");
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier2 = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
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
            ComposerKt.sourceInformationMarkerStart(composer, 1804491095, "C142@6713L11,142@6640L126,143@6803L39,144@6926L10,144@6879L99:MutualFeedbackDialog.kt#2thlc2");
            IconKt.Icon-ww6aTOc(BookKt.getBook(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 432, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextKt.Text--4IGK_g("1. Rate the Book", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleSmall(), composer, 196614, 0, 65502);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            TextKt.Text--4IGK_g("Title: " + book.getTitle(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 0, 0, 65530);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f)), composer, 6);
            int iMutualFeedbackDialog$lambda$1 = MutualFeedbackDialog$lambda$1(mutableIntState);
            ComposerKt.sourceInformationMarkerStart(composer, -2069773943, "CC(remember):MutualFeedbackDialog.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.example.ui.screens.MutualFeedbackDialogKt$$ExternalSyntheticLambda11
                    public final Object invoke(Object obj) {
                        return MutualFeedbackDialogKt.MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$63$lambda$39$lambda$38$lambda$31$lambda$30(mutableIntState, ((Integer) obj).intValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            InteractiveStarRating(iMutualFeedbackDialog$lambda$1, (Function1) objRememberedValue, composer, 48);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            TextKt.Text--4IGK_g("Quick Highlights:", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 196614, 0, 65502);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            Arrangement.Horizontal horizontal = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(6.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -2069758475, "CC(remember):MutualFeedbackDialog.kt#9igjgp");
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.example.ui.screens.MutualFeedbackDialogKt$$ExternalSyntheticLambda12
                    public final Object invoke(Object obj) {
                        return MutualFeedbackDialogKt.MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$63$lambda$39$lambda$38$lambda$35$lambda$34(list, snapshotStateList, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            LazyDslKt.LazyRow((Modifier) null, (LazyListState) null, (PaddingValues) null, false, horizontal, (Alignment.Vertical) null, (FlingBehavior) null, false, (Function1) objRememberedValue2, composer, 100687872, 239);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            String strMutualFeedbackDialog$lambda$4 = MutualFeedbackDialog$lambda$4(mutableState);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            Shape shape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -2069729043, "CC(remember):MutualFeedbackDialog.kt#9igjgp");
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.example.ui.screens.MutualFeedbackDialogKt$$ExternalSyntheticLambda13
                    public final Object invoke(Object obj) {
                        return MutualFeedbackDialogKt.MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$63$lambda$39$lambda$38$lambda$37$lambda$36(mutableState, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            OutlinedTextFieldKt.OutlinedTextField(strMutualFeedbackDialog$lambda$4, (Function1) objRememberedValue3, modifierFillMaxWidth$default, false, false, (TextStyle) null, ComposableSingletons$MutualFeedbackDialogKt.INSTANCE.m323getLambda$1428470832$app(), ComposableSingletons$MutualFeedbackDialogKt.INSTANCE.getLambda$1574427055$app(), (Function2) null, (Function2) null, (Function2) null, (Function2) null, (Function2) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 3, 0, (MutableInteractionSource) null, shape, (TextFieldColors) null, composer, 14156208, 100663296, 0, 6029112);
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

    static final Unit MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$63$lambda$39$lambda$38$lambda$31$lambda$30(MutableIntState mutableIntState, int i) {
        mutableIntState.setIntValue(i);
        return Unit.INSTANCE;
    }

    static final Unit MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$63$lambda$39$lambda$38$lambda$37$lambda$36(MutableState mutableState, String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        mutableState.setValue(str);
        return Unit.INSTANCE;
    }

    static final Unit MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$63$lambda$51(String str, final MutableIntState mutableIntState, final List list, final SnapshotStateList snapshotStateList, final MutableState mutableState, ColumnScope columnScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(columnScope, "$this$Card");
        ComposerKt.sourceInformation(composer, "C190@9890L2860:MutualFeedbackDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-620990345, i, -1, "com.example.ui.screens.MutualFeedbackDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MutualFeedbackDialog.kt:190)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(14.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
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
            ComposerKt.sourceInformationMarkerStart(composer, 1595026709, "C191@9967L487,196@10569L10,196@10613L11,196@10487L155,198@10676L41,201@10885L21,199@10750L190,204@10974L40,205@11096L10,205@11047L105,206@11185L40,207@11318L711,207@11258L771,220@12063L40,223@12269L25,221@12136L584:MutualFeedbackDialog.kt#2thlc2");
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier2 = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
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
            ComposerKt.sourceInformationMarkerStart(composer, -828786617, "C192@10132L11,192@10057L128,193@10222L39,194@10368L10,194@10298L122:MutualFeedbackDialog.kt#2thlc2");
            IconKt.Icon-ww6aTOc(PersonKt.getPerson(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 432, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextKt.Text--4IGK_g("2. Rate the Lender (" + str + ")", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleSmall(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            TextKt.Text--4IGK_g("How was your exchange and communication experience?", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 65530);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f)), composer, 6);
            int iMutualFeedbackDialog$lambda$8 = MutualFeedbackDialog$lambda$8(mutableIntState);
            ComposerKt.sourceInformationMarkerStart(composer, -364162878, "CC(remember):MutualFeedbackDialog.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.example.ui.screens.MutualFeedbackDialogKt$$ExternalSyntheticLambda16
                    public final Object invoke(Object obj) {
                        return MutualFeedbackDialogKt.MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$63$lambda$51$lambda$50$lambda$43$lambda$42(mutableIntState, ((Integer) obj).intValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            InteractiveStarRating(iMutualFeedbackDialog$lambda$8, (Function1) objRememberedValue, composer, 48);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            TextKt.Text--4IGK_g("Lender Experience:", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 196614, 0, 65502);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            Arrangement.Horizontal horizontal = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(6.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -364148332, "CC(remember):MutualFeedbackDialog.kt#9igjgp");
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.example.ui.screens.MutualFeedbackDialogKt$$ExternalSyntheticLambda17
                    public final Object invoke(Object obj) {
                        return MutualFeedbackDialogKt.MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$63$lambda$51$lambda$50$lambda$47$lambda$46(list, snapshotStateList, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            LazyDslKt.LazyRow((Modifier) null, (LazyListState) null, (PaddingValues) null, false, horizontal, (Alignment.Vertical) null, (FlingBehavior) null, false, (Function1) objRememberedValue2, composer, 100687872, 239);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            String strMutualFeedbackDialog$lambda$11 = MutualFeedbackDialog$lambda$11(mutableState);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            Shape shape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -364118586, "CC(remember):MutualFeedbackDialog.kt#9igjgp");
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.example.ui.screens.MutualFeedbackDialogKt$$ExternalSyntheticLambda18
                    public final Object invoke(Object obj) {
                        return MutualFeedbackDialogKt.MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$63$lambda$51$lambda$50$lambda$49$lambda$48(mutableState, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            OutlinedTextFieldKt.OutlinedTextField(strMutualFeedbackDialog$lambda$11, (Function1) objRememberedValue3, modifierFillMaxWidth$default, false, false, (TextStyle) null, ComposableSingletons$MutualFeedbackDialogKt.INSTANCE.getLambda$1897374471$app(), ComposableSingletons$MutualFeedbackDialogKt.INSTANCE.getLambda$1464220966$app(), (Function2) null, (Function2) null, (Function2) null, (Function2) null, (Function2) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 3, 0, (MutableInteractionSource) null, shape, (TextFieldColors) null, composer, 14156208, 100663296, 0, 6029112);
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

    static final Unit MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$63$lambda$51$lambda$50$lambda$43$lambda$42(MutableIntState mutableIntState, int i) {
        mutableIntState.setIntValue(i);
        return Unit.INSTANCE;
    }

    static final Unit MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$63$lambda$51$lambda$50$lambda$49$lambda$48(MutableState mutableState, String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        mutableState.setValue(str);
        return Unit.INSTANCE;
    }

    static final Unit MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$63$lambda$62(String str, final MutableIntState mutableIntState, final List list, final SnapshotStateList snapshotStateList, final MutableState mutableState, ColumnScope columnScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(columnScope, "$this$Card");
        ComposerKt.sourceInformation(composer, "C240@13312L2914:MutualFeedbackDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2021473737, i, -1, "com.example.ui.screens.MutualFeedbackDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MutualFeedbackDialog.kt:240)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(14.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
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
            ComposerKt.sourceInformationMarkerStart(composer, 287113741, "C241@13389L491,246@14016L10,246@14060L11,246@13913L176,248@14123L41,251@14334L23,249@14197L194,254@14425L40,255@14550L10,255@14498L108,256@14639L40,257@14772L719,257@14712L779,270@15525L40,273@15733L27,271@15598L598:MutualFeedbackDialog.kt#2thlc2");
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier2 = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
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
            ComposerKt.sourceInformationMarkerStart(composer, -1378388687, "C242@13560L11,242@13479L135,243@13651L39,244@13794L10,244@13727L119:MutualFeedbackDialog.kt#2thlc2");
            IconKt.Icon-ww6aTOc(VerifiedUserKt.getVerifiedUser(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getTertiary-0d7_KjU(), composer, 432, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextKt.Text--4IGK_g("Rate Borrower (" + str + ")", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleSmall(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            TextKt.Text--4IGK_g("Help other lenders know if " + str + " is a trustworthy reader.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 0, 0, 65530);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f)), composer, 6);
            int iMutualFeedbackDialog$lambda$15 = MutualFeedbackDialog$lambda$15(mutableIntState);
            ComposerKt.sourceInformationMarkerStart(composer, 563478518, "CC(remember):MutualFeedbackDialog.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.example.ui.screens.MutualFeedbackDialogKt$$ExternalSyntheticLambda19
                    public final Object invoke(Object obj) {
                        return MutualFeedbackDialogKt.MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$63$lambda$62$lambda$61$lambda$54$lambda$53(mutableIntState, ((Integer) obj).intValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            InteractiveStarRating(iMutualFeedbackDialog$lambda$15, (Function1) objRememberedValue, composer, 48);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            TextKt.Text--4IGK_g("Borrower Reliability:", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 196614, 0, 65502);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            Arrangement.Horizontal horizontal = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(6.0f));
            ComposerKt.sourceInformationMarkerStart(composer, 563493230, "CC(remember):MutualFeedbackDialog.kt#9igjgp");
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.example.ui.screens.MutualFeedbackDialogKt$$ExternalSyntheticLambda1
                    public final Object invoke(Object obj) {
                        return MutualFeedbackDialogKt.MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$63$lambda$62$lambda$61$lambda$58$lambda$57(list, snapshotStateList, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            LazyDslKt.LazyRow((Modifier) null, (LazyListState) null, (PaddingValues) null, false, horizontal, (Alignment.Vertical) null, (FlingBehavior) null, false, (Function1) objRememberedValue2, composer, 100687872, 239);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            String strMutualFeedbackDialog$lambda$18 = MutualFeedbackDialog$lambda$18(mutableState);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            Shape shape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f));
            ComposerKt.sourceInformationMarkerStart(composer, 563523290, "CC(remember):MutualFeedbackDialog.kt#9igjgp");
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.example.ui.screens.MutualFeedbackDialogKt$$ExternalSyntheticLambda2
                    public final Object invoke(Object obj) {
                        return MutualFeedbackDialogKt.MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$63$lambda$62$lambda$61$lambda$60$lambda$59(mutableState, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            OutlinedTextFieldKt.OutlinedTextField(strMutualFeedbackDialog$lambda$18, (Function1) objRememberedValue3, modifierFillMaxWidth$default, false, false, (TextStyle) null, ComposableSingletons$MutualFeedbackDialogKt.INSTANCE.m325getLambda$256362407$app(), ComposableSingletons$MutualFeedbackDialogKt.INSTANCE.m326getLambda$280053256$app(), (Function2) null, (Function2) null, (Function2) null, (Function2) null, (Function2) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 3, 0, (MutableInteractionSource) null, shape, (TextFieldColors) null, composer, 14156208, 100663296, 0, 6029112);
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

    static final Unit MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$63$lambda$62$lambda$61$lambda$54$lambda$53(MutableIntState mutableIntState, int i) {
        mutableIntState.setIntValue(i);
        return Unit.INSTANCE;
    }

    static final Unit MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$63$lambda$62$lambda$61$lambda$60$lambda$59(MutableState mutableState, String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        mutableState.setValue(str);
        return Unit.INSTANCE;
    }

    static final Unit MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$67$lambda$65$lambda$64(FeedbackTargetType feedbackTargetType, BookViewModel bookViewModel, Book book, SnapshotStateList snapshotStateList, SnapshotStateList snapshotStateList2, Context context, SnapshotStateList snapshotStateList3, Function0 function0, MutableState mutableState, MutableIntState mutableIntState, MutableState mutableState2, MutableIntState mutableIntState2, MutableState mutableState3, MutableIntState mutableIntState3, MutableState mutableState4) {
        MutualFeedbackDialog$lambda$23(mutableState, true);
        if (feedbackTargetType == FeedbackTargetType.BORROWER_TO_LENDER_AND_BOOK) {
            bookViewModel.submitBorrowerFeedback(book, MutualFeedbackDialog$lambda$1(mutableIntState), MutualFeedbackDialog$lambda$4(mutableState2), MutualFeedbackDialog$lambda$8(mutableIntState2), MutualFeedbackDialog$lambda$11(mutableState3), CollectionsKt.plus((Collection) snapshotStateList, (Iterable) snapshotStateList2));
            Toast.makeText(context, "Thank you! Reviews submitted for '" + book.getTitle() + "' and the owner.", 1).show();
        } else {
            bookViewModel.submitLenderFeedback(book, MutualFeedbackDialog$lambda$15(mutableIntState3), MutualFeedbackDialog$lambda$18(mutableState4), (List) snapshotStateList3);
            Toast.makeText(context, "Borrower review submitted successfully!", 1).show();
        }
        MutualFeedbackDialog$lambda$23(mutableState, false);
        function0.invoke();
        return Unit.INSTANCE;
    }

    static final Unit MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$67$lambda$66(MutableState mutableState, RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C:MutualFeedbackDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1593080456, i, -1, "com.example.ui.screens.MutualFeedbackDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MutualFeedbackDialog.kt:329)");
            }
            if (MutualFeedbackDialog$lambda$22(mutableState)) {
                composer.startReplaceGroup(71292475);
                ComposerKt.sourceInformation(composer, "330@18689L11,330@18608L103");
                ProgressIndicatorKt.CircularProgressIndicator-LxG7B9w(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnPrimary-0d7_KjU(), 0.0f, 0L, 0, composer, 6, 28);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(71459255);
                ComposerKt.sourceInformation(composer, "332@18773L85,333@18887L39,334@18955L21");
                IconKt.Icon-ww6aTOc(CheckKt.getCheck(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), 0L, composer, 432, 8);
                SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
                TextKt.Text--4IGK_g("Submit Review", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void InteractiveStarRating(final int i, final Function1<? super Integer, Unit> function1, Composer composer, final int i2) {
        int i3;
        String str;
        Composer composer2;
        long jColor;
        Intrinsics.checkNotNullParameter(function1, "onRatingChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-206152932);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(InteractiveStarRating)P(1)357@19384L1264:MutualFeedbackDialog.kt#2thlc2");
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i3;
        if ((i4 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-206152932, i4, -1, "com.example.ui.screens.InteractiveStarRating (MutualFeedbackDialog.kt:347)");
            }
            if (i == 1) {
                str = "Poor 😞";
            } else if (i == 2) {
                str = "Fair 😐";
            } else if (i == 3) {
                str = "Good 🙂";
            } else if (i == 4) {
                str = "Very Good! 😊";
            } else if (i == 5) {
                str = "Excellent / 5 Stars! ⭐⭐⭐⭐⭐";
            } else {
                str = "";
            }
            String str2 = str;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier = Modifier.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            Updater.set-impl(composer3, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer3, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composer3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composer3.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.set-impl(composer3, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 220331876, "C358@19401L966,381@20376L40,384@20503L10,385@20560L11,382@20425L217:MutualFeedbackDialog.kt#2thlc2");
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Arrangement.Horizontal horizontal = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(6.0f));
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier2 = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontal, centerVertically, composerStartRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier2);
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
            Updater.set-impl(composer4, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer4, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer4.getInserting() || !Intrinsics.areEqual(composer4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composer4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composer4.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.set-impl(composer4, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 829307229, "C373@20083L39,376@20217L10,378@20324L11,374@20135L222:MutualFeedbackDialog.kt#2thlc2");
            composerStartRestartGroup.startReplaceGroup(26751559);
            ComposerKt.sourceInformation(composerStartRestartGroup, "*370@20017L21,363@19587L469");
            final int i5 = 1;
            while (i5 < 6) {
                Icons.Filled filled = Icons.INSTANCE.getDefault();
                ImageVector star = i5 <= i ? StarKt.getStar(filled) : StarOutlineKt.getStarOutline(filled);
                String str3 = "Rate " + i5;
                if (i5 <= i) {
                    composerStartRestartGroup.startReplaceGroup(26758675);
                    composerStartRestartGroup.endReplaceGroup();
                    jColor = ColorKt.Color(4294947584L);
                } else {
                    composerStartRestartGroup.startReplaceGroup(26760233);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "366@19828L11");
                    jColor = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOutline-0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                }
                long j = jColor;
                Modifier modifierClip = ClipKt.clip(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(34.0f)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(6.0f)));
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 26765911, "CC(remember):MutualFeedbackDialog.kt#9igjgp");
                boolean zChanged = ((i4 & 112) == 32) | composerStartRestartGroup.changed(i5);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.example.ui.screens.MutualFeedbackDialogKt$$ExternalSyntheticLambda14
                        public final Object invoke() {
                            return MutualFeedbackDialogKt.InteractiveStarRating$lambda$75$lambda$74$lambda$73$lambda$72(function1, i5);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                IconKt.Icon-ww6aTOc(star, str3, ClickableKt.clickable-XHw0xAI$default(modifierClip, false, (String) null, (Role) null, (Function0) objRememberedValue, 7, (Object) null), j, composerStartRestartGroup, 0, 0);
                i5++;
            }
            composerStartRestartGroup.endReplaceGroup();
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composerStartRestartGroup, 6);
            composer2 = composerStartRestartGroup;
            TextKt.Text--4IGK_g(i + " / 5", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getTitleSmall(), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(2.0f)), composer2, 6);
            TextKt.Text--4IGK_g(str2, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getLabelSmall(), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.MutualFeedbackDialogKt$$ExternalSyntheticLambda15
                public final Object invoke(Object obj, Object obj2) {
                    return MutualFeedbackDialogKt.InteractiveStarRating$lambda$76(i, function1, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final Unit InteractiveStarRating$lambda$75$lambda$74$lambda$73$lambda$72(Function1 function1, int i) {
        function1.invoke(Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    static final Unit MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$63$lambda$39$lambda$38$lambda$35$lambda$34(final List list, final SnapshotStateList snapshotStateList, LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyRow");
        final MutualFeedbackDialogKt$MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$63$lambda$39$lambda$38$lambda$35$lambda$34$$inlined$items$default$1 mutualFeedbackDialogKt$MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$63$lambda$39$lambda$38$lambda$35$lambda$34$$inlined$items$default$1 = new Function1() { // from class: com.example.ui.screens.MutualFeedbackDialogKt$MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$63$lambda$39$lambda$38$lambda$35$lambda$34$$inlined$items$default$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final Void m377invoke(String str) {
                return null;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m377invoke((String) obj);
            }
        };
        lazyListScope.items(list.size(), (Function1) null, new Function1<Integer, Object>() { // from class: com.example.ui.screens.MutualFeedbackDialogKt$MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$63$lambda$39$lambda$38$lambda$35$lambda$34$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i) {
                return mutualFeedbackDialogKt$MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$63$lambda$39$lambda$38$lambda$35$lambda$34$$inlined$items$default$1.invoke(list.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.screens.MutualFeedbackDialogKt$MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$63$lambda$39$lambda$38$lambda$35$lambda$34$$inlined$items$default$4
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
                composer.startReplaceGroup(-897339253);
                ComposerKt.sourceInformation(composer, "C*162@8237L171,165@8462L31,160@8104L431:MutualFeedbackDialog.kt#2thlc2");
                final boolean zContains = snapshotStateList.contains(str);
                ComposerKt.sourceInformationMarkerStart(composer, -444581700, "CC(remember):MutualFeedbackDialog.kt#9igjgp");
                boolean zChanged = composer.changed(zContains) | composer.changed(str);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    final SnapshotStateList snapshotStateList2 = snapshotStateList;
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.MutualFeedbackDialogKt$MutualFeedbackDialog$1$1$1$2$1$1$3$1$1$1$1
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m374invoke();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m374invoke() {
                            boolean z = zContains;
                            SnapshotStateList<String> snapshotStateList3 = snapshotStateList2;
                            String str2 = str;
                            if (z) {
                                snapshotStateList3.remove(str2);
                            } else {
                                snapshotStateList3.add(str2);
                            }
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                ChipKt.FilterChip(zContains, (Function0) objRememberedValue, ComposableLambdaKt.rememberComposableLambda(-1158377660, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.ui.screens.MutualFeedbackDialogKt$MutualFeedbackDialog$1$1$1$2$1$1$3$1$1$2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i4) {
                        ComposerKt.sourceInformation(composer2, "C165@8464L27:MutualFeedbackDialog.kt#2thlc2");
                        if ((i4 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1158377660, i4, -1, "com.example.ui.screens.MutualFeedbackDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MutualFeedbackDialog.kt:165)");
                        }
                        TextKt.Text--4IGK_g(str, (Modifier) null, 0L, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer2, 3072, 0, 131062);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), (Modifier) null, false, (Function2) null, (Function2) null, (Shape) null, (SelectableChipColors) null, (SelectableChipElevation) null, (BorderStroke) null, (MutableInteractionSource) null, composer, 384, 0, 4088);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    static final Unit MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$63$lambda$51$lambda$50$lambda$47$lambda$46(final List list, final SnapshotStateList snapshotStateList, LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyRow");
        final MutualFeedbackDialogKt$MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$63$lambda$51$lambda$50$lambda$47$lambda$46$$inlined$items$default$1 mutualFeedbackDialogKt$MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$63$lambda$51$lambda$50$lambda$47$lambda$46$$inlined$items$default$1 = new Function1() { // from class: com.example.ui.screens.MutualFeedbackDialogKt$MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$63$lambda$51$lambda$50$lambda$47$lambda$46$$inlined$items$default$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final Void m378invoke(String str) {
                return null;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m378invoke((String) obj);
            }
        };
        lazyListScope.items(list.size(), (Function1) null, new Function1<Integer, Object>() { // from class: com.example.ui.screens.MutualFeedbackDialogKt$MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$63$lambda$51$lambda$50$lambda$47$lambda$46$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i) {
                return mutualFeedbackDialogKt$MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$63$lambda$51$lambda$50$lambda$47$lambda$46$$inlined$items$default$1.invoke(list.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.screens.MutualFeedbackDialogKt$MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$63$lambda$51$lambda$50$lambda$47$lambda$46$$inlined$items$default$4
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
                composer.startReplaceGroup(1151600366);
                ComposerKt.sourceInformation(composer, "C*212@11655L175,215@11884L31,210@11522L435:MutualFeedbackDialog.kt#2thlc2");
                final boolean zContains = snapshotStateList.contains(str);
                ComposerKt.sourceInformationMarkerStart(composer, -1902507465, "CC(remember):MutualFeedbackDialog.kt#9igjgp");
                boolean zChanged = composer.changed(zContains) | composer.changed(str);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    final SnapshotStateList snapshotStateList2 = snapshotStateList;
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.MutualFeedbackDialogKt$MutualFeedbackDialog$1$1$1$2$2$1$3$1$1$1$1
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m375invoke();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m375invoke() {
                            boolean z = zContains;
                            SnapshotStateList<String> snapshotStateList3 = snapshotStateList2;
                            String str2 = str;
                            if (z) {
                                snapshotStateList3.remove(str2);
                            } else {
                                snapshotStateList3.add(str2);
                            }
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                ChipKt.FilterChip(zContains, (Function0) objRememberedValue, ComposableLambdaKt.rememberComposableLambda(-536092293, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.ui.screens.MutualFeedbackDialogKt$MutualFeedbackDialog$1$1$1$2$2$1$3$1$1$2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i4) {
                        ComposerKt.sourceInformation(composer2, "C215@11886L27:MutualFeedbackDialog.kt#2thlc2");
                        if ((i4 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-536092293, i4, -1, "com.example.ui.screens.MutualFeedbackDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MutualFeedbackDialog.kt:215)");
                        }
                        TextKt.Text--4IGK_g(str, (Modifier) null, 0L, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer2, 3072, 0, 131062);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), (Modifier) null, false, (Function2) null, (Function2) null, (Shape) null, (SelectableChipColors) null, (SelectableChipElevation) null, (BorderStroke) null, (MutableInteractionSource) null, composer, 384, 0, 4088);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    static final Unit MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$63$lambda$62$lambda$61$lambda$58$lambda$57(final List list, final SnapshotStateList snapshotStateList, LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyRow");
        final MutualFeedbackDialogKt$MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$63$lambda$62$lambda$61$lambda$58$lambda$57$$inlined$items$default$1 mutualFeedbackDialogKt$MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$63$lambda$62$lambda$61$lambda$58$lambda$57$$inlined$items$default$1 = new Function1() { // from class: com.example.ui.screens.MutualFeedbackDialogKt$MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$63$lambda$62$lambda$61$lambda$58$lambda$57$$inlined$items$default$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final Void m379invoke(String str) {
                return null;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m379invoke((String) obj);
            }
        };
        lazyListScope.items(list.size(), (Function1) null, new Function1<Integer, Object>() { // from class: com.example.ui.screens.MutualFeedbackDialogKt$MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$63$lambda$62$lambda$61$lambda$58$lambda$57$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i) {
                return mutualFeedbackDialogKt$MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$63$lambda$62$lambda$61$lambda$58$lambda$57$$inlined$items$default$1.invoke(list.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.screens.MutualFeedbackDialogKt$MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$63$lambda$62$lambda$61$lambda$58$lambda$57$$inlined$items$default$4
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
                composer.startReplaceGroup(893673622);
                ComposerKt.sourceInformation(composer, "C*262@15113L179,265@15346L31,260@14980L439:MutualFeedbackDialog.kt#2thlc2");
                final boolean zContains = snapshotStateList.contains(str);
                ComposerKt.sourceInformationMarkerStart(composer, -248259635, "CC(remember):MutualFeedbackDialog.kt#9igjgp");
                boolean zChanged = composer.changed(zContains) | composer.changed(str);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    final SnapshotStateList snapshotStateList2 = snapshotStateList;
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.MutualFeedbackDialogKt$MutualFeedbackDialog$1$1$1$2$3$1$3$1$1$1$1
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m376invoke();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m376invoke() {
                            boolean z = zContains;
                            SnapshotStateList<String> snapshotStateList3 = snapshotStateList2;
                            String str2 = str;
                            if (z) {
                                snapshotStateList3.remove(str2);
                            } else {
                                snapshotStateList3.add(str2);
                            }
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                ChipKt.FilterChip(zContains, (Function0) objRememberedValue, ComposableLambdaKt.rememberComposableLambda(-774516531, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.ui.screens.MutualFeedbackDialogKt$MutualFeedbackDialog$1$1$1$2$3$1$3$1$1$2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i4) {
                        ComposerKt.sourceInformation(composer2, "C265@15348L27:MutualFeedbackDialog.kt#2thlc2");
                        if ((i4 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-774516531, i4, -1, "com.example.ui.screens.MutualFeedbackDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MutualFeedbackDialog.kt:265)");
                        }
                        TextKt.Text--4IGK_g(str, (Modifier) null, 0L, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer2, 3072, 0, 131062);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), (Modifier) null, false, (Function2) null, (Function2) null, (Shape) null, (SelectableChipColors) null, (SelectableChipElevation) null, (BorderStroke) null, (MutableInteractionSource) null, composer, 384, 0, 4088);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }
}
