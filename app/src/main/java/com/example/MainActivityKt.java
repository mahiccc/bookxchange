package com.example;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
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
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.BlockKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonElevation;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.navigation.NamedNavArgumentKt;
import androidx.navigation.NavArgumentBuilder;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptions;
import androidx.navigation.NavOptionsBuilder;
import androidx.navigation.NavType;
import androidx.navigation.Navigator;
import androidx.navigation.PopUpToBuilder;
import androidx.navigation.compose.NavGraphBuilderKt;
import androidx.navigation.compose.NavHostControllerKt;
import androidx.navigation.compose.NavHostKt;
import androidx.profileinstaller.ProfileVerifier;
import com.example.data.User;
import com.example.ui.BookViewModel;
import com.example.ui.screens.ChatScreenKt;
import com.example.ui.screens.LoginScreenKt;
import com.example.ui.screens.MainScreenKt;
import com.example.ui.screens.TermsScreenKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: MainActivity.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005²\u0006\f\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u0004\u0018\u00010\tX\u008a\u0084\u0002²\u0006\u0016\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000bX\u008a\u0084\u0002"}, d2 = {"BookBorrowApp", "", "viewModel", "Lcom/example/ui/BookViewModel;", "(Lcom/example/ui/BookViewModel;Landroidx/compose/runtime/Composer;I)V", "app", "currentUser", "", "userState", "Lcom/example/data/User;", "sysControl", "", ""}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class MainActivityKt {
    static final int BookBorrowApp$lambda$4$lambda$3$lambda$2(int i) {
        return 50;
    }

    static final Unit BookBorrowApp$lambda$45(BookViewModel bookViewModel, int i, Composer composer, int i2) {
        BookBorrowApp(bookViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final int BookBorrowApp$lambda$9$lambda$8$lambda$7(int i) {
        return -50;
    }

    public static final void BookBorrowApp(final BookViewModel bookViewModel, Composer composer, final int i) {
        int i2;
        String str;
        Intrinsics.checkNotNullParameter(bookViewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2015265125);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BookBorrowApp)152@6028L7,156@6246L23,157@6315L16,161@6470L347,161@6442L375,173@6935L213,174@7175L98,175@7304L214,176@7548L98,177@7653L7898,170@6823L8728:MainActivity.kt#to5c3");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(bookViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2015265125, i2, -1, "com.example.BookBorrowApp (MainActivity.kt:151)");
            }
            CompositionLocal localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Context context = (Context) objConsume;
            final SharedPreferences sharedPreferences = context.getSharedPreferences("bookxchange_prefs", 0);
            boolean z = sharedPreferences.getBoolean("terms_accepted", false);
            final NavHostController navHostControllerRememberNavController = NavHostControllerKt.rememberNavController(new Navigator[0], composerStartRestartGroup, 0);
            final State stateCollectAsState = SnapshotStateKt.collectAsState(bookViewModel.getCurrentUser(), (CoroutineContext) null, composerStartRestartGroup, 0, 1);
            if (BookBorrowApp$lambda$0(stateCollectAsState) != null) {
                str = "main";
            } else {
                str = z ? "login" : "terms";
            }
            String strBookBorrowApp$lambda$0 = BookBorrowApp$lambda$0(stateCollectAsState);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 360483638, "CC(remember):MainActivity.kt#9igjgp");
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changed(stateCollectAsState) | composerStartRestartGroup.changedInstance(navHostControllerRememberNavController);
            MainActivityKt$BookBorrowApp$1$1 mainActivityKt$BookBorrowApp$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || mainActivityKt$BookBorrowApp$1$1RememberedValue == Composer.Companion.getEmpty()) {
                mainActivityKt$BookBorrowApp$1$1RememberedValue = new MainActivityKt$BookBorrowApp$1$1(context, navHostControllerRememberNavController, stateCollectAsState, null);
                composerStartRestartGroup.updateRememberedValue(mainActivityKt$BookBorrowApp$1$1RememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            EffectsKt.LaunchedEffect(strBookBorrowApp$lambda$0, (Function2) mainActivityKt$BookBorrowApp$1$1RememberedValue, composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 360498384, "CC(remember):MainActivity.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda23
                    public final Object invoke(Object obj) {
                        return MainActivityKt.BookBorrowApp$lambda$4$lambda$3((AnimatedContentTransitionScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 360505949, "CC(remember):MainActivity.kt#9igjgp");
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda24
                    public final Object invoke(Object obj) {
                        return MainActivityKt.BookBorrowApp$lambda$6$lambda$5((AnimatedContentTransitionScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function1 function2 = (Function1) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 360510193, "CC(remember):MainActivity.kt#9igjgp");
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda25
                    public final Object invoke(Object obj) {
                        return MainActivityKt.BookBorrowApp$lambda$9$lambda$8((AnimatedContentTransitionScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function1 function3 = (Function1) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 360517885, "CC(remember):MainActivity.kt#9igjgp");
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda1
                    public final Object invoke(Object obj) {
                        return MainActivityKt.BookBorrowApp$lambda$11$lambda$10((AnimatedContentTransitionScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Function1 function4 = (Function1) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 360529045, "CC(remember):MainActivity.kt#9igjgp");
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(sharedPreferences) | composerStartRestartGroup.changedInstance(navHostControllerRememberNavController) | composerStartRestartGroup.changedInstance(bookViewModel) | composerStartRestartGroup.changed(stateCollectAsState);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = new Function1() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda2
                    public final Object invoke(Object obj) {
                        return MainActivityKt.BookBorrowApp$lambda$44$lambda$43(sharedPreferences, navHostControllerRememberNavController, bookViewModel, stateCollectAsState, (NavGraphBuilder) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            NavHostKt.NavHost(navHostControllerRememberNavController, str, null, null, null, function1, function2, function3, function4, null, (Function1) objRememberedValue5, composerStartRestartGroup, 115015680, 0, 540);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda3
                public final Object invoke(Object obj, Object obj2) {
                    return MainActivityKt.BookBorrowApp$lambda$45(bookViewModel, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final EnterTransition BookBorrowApp$lambda$4$lambda$3(AnimatedContentTransitionScope animatedContentTransitionScope) {
        Intrinsics.checkNotNullParameter(animatedContentTransitionScope, "$this$NavHost");
        return EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, (Easing) null, 6, (Object) null), 0.0f, 2, (Object) null).plus(EnterExitTransitionKt.slideInHorizontally(AnimationSpecKt.tween$default(300, 0, (Easing) null, 6, (Object) null), new Function1() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda17
            public final Object invoke(Object obj) {
                return Integer.valueOf(MainActivityKt.BookBorrowApp$lambda$4$lambda$3$lambda$2(((Integer) obj).intValue()));
            }
        }));
    }

    static final ExitTransition BookBorrowApp$lambda$6$lambda$5(AnimatedContentTransitionScope animatedContentTransitionScope) {
        Intrinsics.checkNotNullParameter(animatedContentTransitionScope, "$this$NavHost");
        return EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(200, 0, (Easing) null, 6, (Object) null), 0.0f, 2, (Object) null);
    }

    static final EnterTransition BookBorrowApp$lambda$9$lambda$8(AnimatedContentTransitionScope animatedContentTransitionScope) {
        Intrinsics.checkNotNullParameter(animatedContentTransitionScope, "$this$NavHost");
        return EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, (Easing) null, 6, (Object) null), 0.0f, 2, (Object) null).plus(EnterExitTransitionKt.slideInHorizontally(AnimationSpecKt.tween$default(300, 0, (Easing) null, 6, (Object) null), new Function1() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda6
            public final Object invoke(Object obj) {
                return Integer.valueOf(MainActivityKt.BookBorrowApp$lambda$9$lambda$8$lambda$7(((Integer) obj).intValue()));
            }
        }));
    }

    static final ExitTransition BookBorrowApp$lambda$11$lambda$10(AnimatedContentTransitionScope animatedContentTransitionScope) {
        Intrinsics.checkNotNullParameter(animatedContentTransitionScope, "$this$NavHost");
        return EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(200, 0, (Easing) null, 6, (Object) null), 0.0f, 2, (Object) null);
    }

    static final Unit BookBorrowApp$lambda$44$lambda$43(final SharedPreferences sharedPreferences, final NavHostController navHostController, final BookViewModel bookViewModel, final State state, NavGraphBuilder navGraphBuilder) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "$this$NavHost");
        NavGraphBuilderKt.composable$default(navGraphBuilder, "terms", null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-811960258, true, new Function4() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda10
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MainActivityKt.BookBorrowApp$lambda$44$lambda$43$lambda$16(sharedPreferences, navHostController, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 254, null);
        NavGraphBuilderKt.composable$default(navGraphBuilder, "login", null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-824773067, true, new Function4() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda12
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MainActivityKt.BookBorrowApp$lambda$44$lambda$43$lambda$23(navHostController, bookViewModel, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 254, null);
        NavGraphBuilderKt.composable$default(navGraphBuilder, "main", null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-643039818, true, new Function4() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda13
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MainActivityKt.BookBorrowApp$lambda$44$lambda$43$lambda$38(bookViewModel, navHostController, state, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 254, null);
        NavGraphBuilderKt.composable$default(navGraphBuilder, "chat/{bookId}", CollectionsKt.listOf(NamedNavArgumentKt.navArgument("bookId", new Function1() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda14
            public final Object invoke(Object obj) {
                return MainActivityKt.BookBorrowApp$lambda$44$lambda$43$lambda$39((NavArgumentBuilder) obj);
            }
        })), null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-461306569, true, new Function4() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda15
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MainActivityKt.BookBorrowApp$lambda$44$lambda$43$lambda$42(bookViewModel, navHostController, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 252, null);
        return Unit.INSTANCE;
    }

    static final Unit BookBorrowApp$lambda$44$lambda$43$lambda$16(final SharedPreferences sharedPreferences, final NavHostController navHostController, AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(animatedContentScope, "$this$composable");
        Intrinsics.checkNotNullParameter(navBackStackEntry, "it");
        ComposerKt.sourceInformation(composer, "C179@7721L220,179@7698L244:MainActivity.kt#to5c3");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-811960258, i, -1, "com.example.BookBorrowApp.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:179)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 1390241370, "CC(remember):MainActivity.kt#9igjgp");
        boolean zChangedInstance = composer.changedInstance(sharedPreferences) | composer.changedInstance(navHostController);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda16
                public final Object invoke() {
                    return MainActivityKt.BookBorrowApp$lambda$44$lambda$43$lambda$16$lambda$15$lambda$14(sharedPreferences, navHostController);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        TermsScreenKt.TermsScreen((Function0) objRememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    static final Unit BookBorrowApp$lambda$44$lambda$43$lambda$16$lambda$15$lambda$14(SharedPreferences sharedPreferences, NavHostController navHostController) {
        sharedPreferences.edit().putBoolean("terms_accepted", true).apply();
        navHostController.navigate("login", new Function1() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda21
            public final Object invoke(Object obj) {
                return MainActivityKt.BookBorrowApp$lambda$44$lambda$43$lambda$16$lambda$15$lambda$14$lambda$13((NavOptionsBuilder) obj);
            }
        });
        return Unit.INSTANCE;
    }

    static final Unit BookBorrowApp$lambda$44$lambda$43$lambda$16$lambda$15$lambda$14$lambda$13(NavOptionsBuilder navOptionsBuilder) {
        Intrinsics.checkNotNullParameter(navOptionsBuilder, "$this$navigate");
        navOptionsBuilder.popUpTo("terms", new Function1() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda19
            public final Object invoke(Object obj) {
                return MainActivityKt.BookBorrowApp$lambda$44$lambda$43$lambda$16$lambda$15$lambda$14$lambda$13$lambda$12((PopUpToBuilder) obj);
            }
        });
        return Unit.INSTANCE;
    }

    static final Unit BookBorrowApp$lambda$44$lambda$43$lambda$16$lambda$15$lambda$14$lambda$13$lambda$12(PopUpToBuilder popUpToBuilder) {
        Intrinsics.checkNotNullParameter(popUpToBuilder, "$this$popUpTo");
        popUpToBuilder.setInclusive(true);
        return Unit.INSTANCE;
    }

    static final Unit BookBorrowApp$lambda$44$lambda$43$lambda$23(final NavHostController navHostController, final BookViewModel bookViewModel, AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(animatedContentScope, "$this$composable");
        Intrinsics.checkNotNullParameter(navBackStackEntry, "it");
        ComposerKt.sourceInformation(composer, "C188@8040L35,189@8110L264,187@7996L392:MainActivity.kt#to5c3");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-824773067, i, -1, "com.example.BookBorrowApp.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:187)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 1962034264, "CC(remember):MainActivity.kt#9igjgp");
        boolean zChangedInstance = composer.changedInstance(navHostController);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda4
                public final Object invoke() {
                    return MainActivityKt.BookBorrowApp$lambda$44$lambda$43$lambda$23$lambda$18$lambda$17(navHostController);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, 1962036733, "CC(remember):MainActivity.kt#9igjgp");
        boolean zChangedInstance2 = composer.changedInstance(bookViewModel) | composer.changedInstance(navHostController);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new Function3() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda5
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return MainActivityKt.BookBorrowApp$lambda$44$lambda$43$lambda$23$lambda$22$lambda$21(bookViewModel, navHostController, (String) obj, (String) obj2, (String) obj3);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        LoginScreenKt.LoginScreen(function0, (Function3) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    static final Unit BookBorrowApp$lambda$44$lambda$43$lambda$23$lambda$18$lambda$17(NavHostController navHostController) {
        NavController.navigate$default((NavController) navHostController, "terms", (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    static final Unit BookBorrowApp$lambda$44$lambda$43$lambda$23$lambda$22$lambda$21(BookViewModel bookViewModel, NavHostController navHostController, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "username");
        Intrinsics.checkNotNullParameter(str2, "displayName");
        Intrinsics.checkNotNullParameter(str3, "pictureUrl");
        bookViewModel.login(str, str2, str3);
        navHostController.navigate("main", new Function1() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda20
            public final Object invoke(Object obj) {
                return MainActivityKt.BookBorrowApp$lambda$44$lambda$43$lambda$23$lambda$22$lambda$21$lambda$20((NavOptionsBuilder) obj);
            }
        });
        return Unit.INSTANCE;
    }

    static final Unit BookBorrowApp$lambda$44$lambda$43$lambda$23$lambda$22$lambda$21$lambda$20(NavOptionsBuilder navOptionsBuilder) {
        Intrinsics.checkNotNullParameter(navOptionsBuilder, "$this$navigate");
        navOptionsBuilder.popUpTo("login", new Function1() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda22
            public final Object invoke(Object obj) {
                return MainActivityKt.BookBorrowApp$lambda$44$lambda$43$lambda$23$lambda$22$lambda$21$lambda$20$lambda$19((PopUpToBuilder) obj);
            }
        });
        return Unit.INSTANCE;
    }

    static final Unit BookBorrowApp$lambda$44$lambda$43$lambda$23$lambda$22$lambda$21$lambda$20$lambda$19(PopUpToBuilder popUpToBuilder) {
        Intrinsics.checkNotNullParameter(popUpToBuilder, "$this$popUpTo");
        popUpToBuilder.setInclusive(true);
        return Unit.INSTANCE;
    }

    static final Unit BookBorrowApp$lambda$44$lambda$43$lambda$38(final BookViewModel bookViewModel, final NavHostController navHostController, State state, AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i) {
        User userBookBorrowApp$lambda$44$lambda$43$lambda$38$lambda$25;
        Intrinsics.checkNotNullParameter(animatedContentScope, "$this$composable");
        Intrinsics.checkNotNullParameter(navBackStackEntry, "it");
        ComposerKt.sourceInformation(composer, "C200@8501L132,202@8634L30,204@8720L16,210@9267L206,210@9246L227:MainActivity.kt#to5c3");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-643039818, i, -1, "com.example.BookBorrowApp.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:199)");
        }
        String strBookBorrowApp$lambda$0 = BookBorrowApp$lambda$0(state);
        ComposerKt.sourceInformationMarkerStart(composer, 514027770, "CC(remember):MainActivity.kt#9igjgp");
        boolean zChanged = composer.changed(strBookBorrowApp$lambda$0);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = strBookBorrowApp$lambda$0 != null ? (Flow) bookViewModel.getUser(strBookBorrowApp$lambda$0) : FlowKt.flowOf((Object) null);
            composer.updateRememberedValue(objRememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        final State stateCollectAsState = SnapshotStateKt.collectAsState((Flow) objRememberedValue, (Object) null, (CoroutineContext) null, composer, 48, 2);
        Composer composer2 = composer;
        State stateCollectAsState2 = SnapshotStateKt.collectAsState(bookViewModel.getSystemControl(), (CoroutineContext) null, composer2, 0, 1);
        Object obj = BookBorrowApp$lambda$44$lambda$43$lambda$38$lambda$26(stateCollectAsState2).get("maintenanceMode");
        boolean zAreEqual = Intrinsics.areEqual(obj instanceof Boolean ? (Boolean) obj : null, true);
        Object obj2 = BookBorrowApp$lambda$44$lambda$43$lambda$38$lambda$26(stateCollectAsState2).get("maintenanceTitle");
        String str = obj2 instanceof String ? (String) obj2 : null;
        if (str == null) {
            str = "Under Scheduled Maintenance";
        }
        final String str2 = str;
        Object obj3 = BookBorrowApp$lambda$44$lambda$43$lambda$38$lambda$26(stateCollectAsState2).get("maintenanceMessage");
        String str3 = obj3 instanceof String ? (String) obj3 : null;
        if (str3 == null) {
            str3 = "We are currently improving BookXchange with new features. We will be back online shortly!";
        }
        final String str4 = str3;
        boolean z = (strBookBorrowApp$lambda$0 != null && StringsKt.contains(strBookBorrowApp$lambda$0, "shiva", true)) || (strBookBorrowApp$lambda$0 != null && StringsKt.contains(strBookBorrowApp$lambda$0, "admin", true));
        ComposerKt.sourceInformationMarkerStart(composer2, 514052356, "CC(remember):MainActivity.kt#9igjgp");
        boolean zChanged2 = composer2.changed(strBookBorrowApp$lambda$0) | composer2.changedInstance(navHostController);
        MainActivityKt$BookBorrowApp$6$1$3$1$1 mainActivityKt$BookBorrowApp$6$1$3$1$1RememberedValue = composer2.rememberedValue();
        if (zChanged2 || mainActivityKt$BookBorrowApp$6$1$3$1$1RememberedValue == Composer.Companion.getEmpty()) {
            mainActivityKt$BookBorrowApp$6$1$3$1$1RememberedValue = new MainActivityKt$BookBorrowApp$6$1$3$1$1(strBookBorrowApp$lambda$0, navHostController, null);
            composer2.updateRememberedValue(mainActivityKt$BookBorrowApp$6$1$3$1$1RememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer2);
        EffectsKt.LaunchedEffect(strBookBorrowApp$lambda$0, (Function2) mainActivityKt$BookBorrowApp$6$1$3$1$1RememberedValue, composer2, 0);
        if (zAreEqual && !z) {
            composer2.startReplaceGroup(-1243903410);
            ComposerKt.sourceInformation(composer2, "220@9623L11,219@9539L3102");
            Modifier modifier = PaddingKt.padding-3ABfNKs(BackgroundKt.background-bw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getBackground-0d7_KjU(), (Shape) null, 2, (Object) null), Dp.constructor-impl(28.0f));
            Alignment center = Alignment.Companion.getCenter();
            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
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
            Updater.set-impl(composer3, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer3, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composer3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composer3.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.set-impl(composer3, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScope boxScope = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, -309897636, "C224@9853L11,224@9811L69,226@9990L38,227@10051L2572,223@9759L2864:MainActivity.kt#to5c3");
            CardKt.Card((Modifier) null, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(28.0f)), CardDefaults.INSTANCE.cardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0L, 0L, 0L, composer, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.cardElevation-aqJV_2Y(Dp.constructor-impl(6.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer, (CardDefaults.$stable << 18) | 6, 62), (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(1761415241, true, new Function3() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda11
                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                    return MainActivityKt.BookBorrowApp$lambda$44$lambda$43$lambda$38$lambda$30$lambda$29(str2, str4, (ColumnScope) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                }
            }, composer, 54), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 17);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceGroup();
        } else if (BookBorrowApp$lambda$0(state) != null && ((userBookBorrowApp$lambda$44$lambda$43$lambda$38$lambda$25 = BookBorrowApp$lambda$44$lambda$43$lambda$38$lambda$25(stateCollectAsState)) == null || !userBookBorrowApp$lambda$44$lambda$43$lambda$38$lambda$25.isBanned())) {
            composer2.startReplaceGroup(-1240828024);
            ComposerKt.sourceInformation(composer2, "276@12735L36");
            MainScreenKt.MainScreen(bookViewModel, navHostController, composer2, 0);
            composer2.endReplaceGroup();
        } else {
            User userBookBorrowApp$lambda$44$lambda$43$lambda$38$lambda$26 = BookBorrowApp$lambda$44$lambda$43$lambda$38$lambda$25(stateCollectAsState);
            if (userBookBorrowApp$lambda$44$lambda$43$lambda$38$lambda$26 == null || !userBookBorrowApp$lambda$44$lambda$43$lambda$38$lambda$26.isBanned()) {
                composer2.startReplaceGroup(-1253446388);
            } else {
                composer2.startReplaceGroup(-1240653649);
                ComposerKt.sourceInformation(composer2, "279@12926L11,278@12842L2237");
                Modifier modifier2 = PaddingKt.padding-3ABfNKs(BackgroundKt.background-bw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getBackground-0d7_KjU(), (Shape) null, 2, (Object) null), Dp.constructor-impl(32.0f));
                Alignment center2 = Alignment.Companion.getCenter();
                ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifier2);
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
                Updater.set-impl(composer4, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl(composer4, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composer4.getInserting() || !Intrinsics.areEqual(composer4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composer4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composer4.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.set-impl(composer4, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScope boxScope2 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, -524526635, "C283@13156L11,283@13114L69,285@13265L1796,282@13062L1999:MainActivity.kt#to5c3");
                CardColors cardColors = CardDefaults.INSTANCE.cardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getErrorContainer-0d7_KjU(), 0L, 0L, 0L, composer, CardDefaults.$stable << 12, 14);
                composer2 = composer;
                CardKt.Card((Modifier) null, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(24.0f)), cardColors, (CardElevation) null, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(1648253073, true, new Function3() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda18
                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                        return MainActivityKt.BookBorrowApp$lambda$44$lambda$43$lambda$38$lambda$37$lambda$36(bookViewModel, navHostController, stateCollectAsState, (ColumnScope) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                    }
                }, composer2, 54), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 25);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
            }
            composer2.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    static final Unit BookBorrowApp$lambda$44$lambda$43$lambda$38$lambda$30$lambda$29(String str, String str2, ColumnScope columnScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(columnScope, "$this$Card");
        ComposerKt.sourceInformation(composer, "C228@10077L2524:MainActivity.kt#to5c3");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1761415241, i, -1, "com.example.BookBorrowApp.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:228)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(28.0f));
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            Arrangement.Vertical vertical = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(16.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(vertical, centerHorizontally, composer, 54);
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
            ComposerKt.sourceInformationMarkerStart(composer, 177805312, "C235@10493L11,233@10363L756,249@11252L10,247@11148L312,255@11595L10,257@11734L11,253@11489L355,262@12002L11,260@11873L702:MainActivity.kt#to5c3");
            SurfaceKt.Surface-T9BRK9s(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(68.0f)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(20.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableSingletons$MainActivityKt.INSTANCE.m131getLambda$1369350566$app(), composer, 12582918, 120);
            TextKt.Text--4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.box-impl(TextAlign.Companion.getCenter-e0LSkKk()), 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getHeadlineSmall(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 64990);
            TextStyle bodyMedium = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium();
            int i2 = TextAlign.Companion.getCenter-e0LSkKk();
            TextKt.Text--4IGK_g(str2, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.box-impl(i2), TextUnitKt.getSp(20), 0, false, 0, 0, (Function1) null, bodyMedium, composer, 0, 6, 63994);
            SurfaceKt.Surface-T9BRK9s((Modifier) null, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(8.0f)), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableSingletons$MainActivityKt.INSTANCE.getLambda$1612655569$app(), composer, 12582912, 121);
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

    static final Unit BookBorrowApp$lambda$44$lambda$43$lambda$38$lambda$37$lambda$36(final BookViewModel bookViewModel, final NavHostController navHostController, State state, ColumnScope columnScope, Composer composer, int i) {
        String banReason;
        Intrinsics.checkNotNullParameter(columnScope, "$this$Card");
        ComposerKt.sourceInformation(composer, "C286@13291L1748:MainActivity.kt#to5c3");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1648253073, i, -1, "com.example.BookBorrowApp.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:286)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(24.0f));
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            Arrangement.Vertical vertical = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(16.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(vertical, centerHorizontally, composer, 54);
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
            ComposerKt.sourceInformationMarkerStart(composer, 18358848, "C291@13651L11,291@13577L125,294@13844L10,296@14013L11,292@13731L340,300@14308L10,302@14447L11,298@14100L405,305@14584L199,309@14885L11,309@14841L62,304@14534L479:MainActivity.kt#to5c3");
            IconKt.Icon-ww6aTOc(BlockKt.getBlock(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(56.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU(), composer, 432, 0);
            TextKt.Text--4IGK_g("Account Suspended", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnErrorContainer-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleLarge(), composer, 196614, 0, 65498);
            User userBookBorrowApp$lambda$44$lambda$43$lambda$38$lambda$25 = BookBorrowApp$lambda$44$lambda$43$lambda$38$lambda$25(state);
            if (userBookBorrowApp$lambda$44$lambda$43$lambda$38$lambda$25 == null || (banReason = userBookBorrowApp$lambda$44$lambda$43$lambda$38$lambda$25.getBanReason()) == null) {
                banReason = "Violation of guidelines";
            }
            TextKt.Text--4IGK_g("Your account has been banned by the administrator.\nReason: " + banReason, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnErrorContainer-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.box-impl(TextAlign.Companion.getCenter-e0LSkKk()), 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 0, 0, 65018);
            ComposerKt.sourceInformationMarkerStart(composer, -1939039442, "CC(remember):MainActivity.kt#9igjgp");
            boolean zChangedInstance = composer.changedInstance(bookViewModel) | composer.changedInstance(navHostController);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda9
                    public final Object invoke() {
                        return MainActivityKt.BookBorrowApp$lambda$44$lambda$43$lambda$38$lambda$37$lambda$36$lambda$35$lambda$34$lambda$33(bookViewModel, navHostController);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ButtonKt.Button((Function0) objRememberedValue, (Modifier) null, false, (Shape) null, ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU(), 0L, 0L, 0L, composer, ButtonDefaults.$stable << 12, 14), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$MainActivityKt.INSTANCE.m132getLambda$1944214921$app(), composer, 805306368, 494);
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

    static final Unit BookBorrowApp$lambda$44$lambda$43$lambda$38$lambda$37$lambda$36$lambda$35$lambda$34$lambda$33(BookViewModel bookViewModel, NavHostController navHostController) {
        bookViewModel.logout();
        navHostController.navigate("login", new Function1() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda7
            public final Object invoke(Object obj) {
                return MainActivityKt.BookBorrowApp$lambda$44$lambda$43$lambda$38$lambda$37$lambda$36$lambda$35$lambda$34$lambda$33$lambda$32((NavOptionsBuilder) obj);
            }
        });
        return Unit.INSTANCE;
    }

    static final Unit BookBorrowApp$lambda$44$lambda$43$lambda$38$lambda$37$lambda$36$lambda$35$lambda$34$lambda$33$lambda$32(NavOptionsBuilder navOptionsBuilder) {
        Intrinsics.checkNotNullParameter(navOptionsBuilder, "$this$navigate");
        navOptionsBuilder.popUpTo("main", new Function1() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda8
            public final Object invoke(Object obj) {
                return MainActivityKt.BookBorrowApp$lambda$44$lambda$43$lambda$38$lambda$37$lambda$36$lambda$35$lambda$34$lambda$33$lambda$32$lambda$31((PopUpToBuilder) obj);
            }
        });
        return Unit.INSTANCE;
    }

    static final Unit BookBorrowApp$lambda$44$lambda$43$lambda$38$lambda$37$lambda$36$lambda$35$lambda$34$lambda$33$lambda$32$lambda$31(PopUpToBuilder popUpToBuilder) {
        Intrinsics.checkNotNullParameter(popUpToBuilder, "$this$popUpTo");
        popUpToBuilder.setInclusive(true);
        return Unit.INSTANCE;
    }

    static final Unit BookBorrowApp$lambda$44$lambda$43$lambda$39(NavArgumentBuilder navArgumentBuilder) {
        Intrinsics.checkNotNullParameter(navArgumentBuilder, "$this$navArgument");
        navArgumentBuilder.setType(NavType.StringType);
        return Unit.INSTANCE;
    }

    static final Unit BookBorrowApp$lambda$44$lambda$43$lambda$42(BookViewModel bookViewModel, final NavHostController navHostController, AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i) {
        String string;
        Intrinsics.checkNotNullParameter(animatedContentScope, "$this$composable");
        Intrinsics.checkNotNullParameter(navBackStackEntry, "backStackEntry");
        ComposerKt.sourceInformation(composer, "C327@15489L32,324@15380L155:MainActivity.kt#to5c3");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-461306569, i, -1, "com.example.BookBorrowApp.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:323)");
        }
        Bundle arguments = navBackStackEntry.getArguments();
        if (arguments == null || (string = arguments.getString("bookId")) == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
        ComposerKt.sourceInformationMarkerStart(composer, -933973833, "CC(remember):MainActivity.kt#9igjgp");
        boolean zChangedInstance = composer.changedInstance(navHostController);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda0
                public final Object invoke() {
                    return MainActivityKt.BookBorrowApp$lambda$44$lambda$43$lambda$42$lambda$41$lambda$40(navHostController);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        ChatScreenKt.ChatScreen(string, bookViewModel, (Function0) objRememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    static final Unit BookBorrowApp$lambda$44$lambda$43$lambda$42$lambda$41$lambda$40(NavHostController navHostController) {
        navHostController.popBackStack();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String BookBorrowApp$lambda$0(State<String> state) {
        return (String) state.getValue();
    }

    private static final User BookBorrowApp$lambda$44$lambda$43$lambda$38$lambda$25(State<User> state) {
        return (User) state.getValue();
    }

    private static final Map<String, Object> BookBorrowApp$lambda$44$lambda$43$lambda$38$lambda$26(State<? extends Map<String, ? extends Object>> state) {
        return (Map) state.getValue();
    }
}
