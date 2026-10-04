package com.example.ui.screens;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.AutoAwesomeKt;
import androidx.compose.material.icons.filled.AutoStoriesKt;
import androidx.compose.material.icons.filled.BookmarkBorderKt;
import androidx.compose.material.icons.filled.CelebrationKt;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.material.icons.filled.RefreshKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BookMatchmakerDialog.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class ComposableSingletons$BookMatchmakerDialogKt {
    public static final ComposableSingletons$BookMatchmakerDialogKt INSTANCE = new ComposableSingletons$BookMatchmakerDialogKt();

    /* JADX INFO: renamed from: lambda$-1844628638, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f39lambda$1844628638 = ComposableLambdaKt.composableLambdaInstance(-1844628638, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$BookMatchmakerDialogKt$$ExternalSyntheticLambda0
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$BookMatchmakerDialogKt.lambda__1844628638$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1469224384 = ComposableLambdaKt.composableLambdaInstance(1469224384, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$BookMatchmakerDialogKt$$ExternalSyntheticLambda1
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$BookMatchmakerDialogKt.lambda_1469224384$lambda$2((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1761859025 = ComposableLambdaKt.composableLambdaInstance(1761859025, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$BookMatchmakerDialogKt$$ExternalSyntheticLambda2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$BookMatchmakerDialogKt.lambda_1761859025$lambda$4((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$345774556 = ComposableLambdaKt.composableLambdaInstance(345774556, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookMatchmakerDialogKt$$ExternalSyntheticLambda3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookMatchmakerDialogKt.lambda_345774556$lambda$5((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$346612139 = ComposableLambdaKt.composableLambdaInstance(346612139, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookMatchmakerDialogKt$$ExternalSyntheticLambda4
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookMatchmakerDialogKt.lambda_346612139$lambda$6((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$2092472267 = ComposableLambdaKt.composableLambdaInstance(2092472267, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookMatchmakerDialogKt$$ExternalSyntheticLambda5
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookMatchmakerDialogKt.lambda_2092472267$lambda$7((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-2142598803, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f40lambda$2142598803 = ComposableLambdaKt.composableLambdaInstance(-2142598803, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookMatchmakerDialogKt$$ExternalSyntheticLambda6
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookMatchmakerDialogKt.lambda__2142598803$lambda$8((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-1844628638$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m220getLambda$1844628638$app() {
        return f39lambda$1844628638;
    }

    /* JADX INFO: renamed from: getLambda$-2142598803$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m221getLambda$2142598803$app() {
        return f40lambda$2142598803;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1469224384$app() {
        return lambda$1469224384;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1761859025$app() {
        return lambda$1761859025;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$2092472267$app() {
        return lambda$2092472267;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$345774556$app() {
        return lambda$345774556;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$346612139$app() {
        return lambda$346612139;
    }

    static final Unit lambda__1844628638$lambda$0(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C74@2970L11,74@2893L102:BookMatchmakerDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1844628638, i, -1, "com.example.ui.screens.ComposableSingletons$BookMatchmakerDialogKt.lambda$-1844628638.<anonymous> (BookMatchmakerDialog.kt:74)");
            }
            IconKt.Icon-ww6aTOc(CloseKt.getClose(Icons.INSTANCE.getDefault()), "Close", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnBackground-0d7_KjU(), composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1469224384$lambda$2(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C82@3343L1027:BookMatchmakerDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1469224384, i, -1, "com.example.ui.screens.ComposableSingletons$BookMatchmakerDialogKt.lambda$1469224384.<anonymous> (BookMatchmakerDialog.kt:82)");
            }
            Modifier modifier = PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(12.0f), Dp.constructor-impl(6.0f));
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
            ComposerKt.sourceInformationMarkerStart(composer, 1868253200, "C89@3778L11,86@3589L311,92@3933L39,95@4129L10,97@4276L11,93@4005L335:BookMatchmakerDialog.kt#2thlc2");
            IconKt.Icon-ww6aTOc(AutoAwesomeKt.getAutoAwesome(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 432, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextStyle titleSmall = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleSmall();
            TextKt.Text--4IGK_g("AI Matchmaker", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnPrimaryContainer-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, titleSmall, composer, 196614, 0, 65498);
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

    static final Unit lambda_1761859025$lambda$4(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C138@6152L444:BookMatchmakerDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1761859025, i, -1, "com.example.ui.screens.ComposableSingletons$BookMatchmakerDialogKt.lambda$1761859025.<anonymous> (BookMatchmakerDialog.kt:138)");
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
            ComposerKt.sourceInformationMarkerStart(composer, -1647859679, "C142@6432L11,139@6231L331:BookMatchmakerDialog.kt#2thlc2");
            IconKt.Icon-ww6aTOc(CelebrationKt.getCelebration(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(44.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 432, 0);
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

    static final Unit lambda_345774556$lambda$5(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C166@7838L87,167@7958L39,168@8030L20:BookMatchmakerDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(345774556, i, -1, "com.example.ui.screens.ComposableSingletons$BookMatchmakerDialogKt.lambda$345774556.<anonymous> (BookMatchmakerDialog.kt:166)");
            }
            IconKt.Icon-ww6aTOc(RefreshKt.getRefresh(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            TextKt.Text--4IGK_g("Restart Deck", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_346612139$lambda$6(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C398@22115L11,395@21906L347:BookMatchmakerDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(346612139, i, -1, "com.example.ui.screens.ComposableSingletons$BookMatchmakerDialogKt.lambda$346612139.<anonymous> (BookMatchmakerDialog.kt:395)");
            }
            IconKt.Icon-ww6aTOc(CloseKt.getClose(Icons.INSTANCE.getDefault()), "Pass", SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(24.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOutline-0d7_KjU(), composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_2092472267$lambda$7(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$FilledTonalButton");
        ComposerKt.sourceInformation(composer, "C420@23506L11,417@23276L368:BookMatchmakerDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2092472267, i, -1, "com.example.ui.screens.ComposableSingletons$BookMatchmakerDialogKt.lambda$2092472267.<anonymous> (BookMatchmakerDialog.kt:417)");
            }
            IconKt.Icon-ww6aTOc(BookmarkBorderKt.getBookmarkBorder(Icons.INSTANCE.getDefault()), "Save to Wishlist", SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(24.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__2142598803$lambda$8(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C435@24370L265,440@24676L39,441@24756L249:BookMatchmakerDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2142598803, i, -1, "com.example.ui.screens.ComposableSingletons$BookMatchmakerDialogKt.lambda$-2142598803.<anonymous> (BookMatchmakerDialog.kt:435)");
            }
            IconKt.Icon-ww6aTOc(AutoStoriesKt.getAutoStories(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(20.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            TextKt.Text--4IGK_g("Request Book", (Modifier) null, 0L, TextUnitKt.getSp(15), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 199686, 0, 131030);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
