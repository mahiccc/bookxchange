package com.example.ui.screens;

import androidx.compose.foundation.BorderStroke;
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
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.SendKt;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.material.icons.filled.HandshakeKt;
import androidx.compose.material.icons.filled.MapKt;
import androidx.compose.material.icons.filled.PlaceKt;
import androidx.compose.material.icons.filled.SearchKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
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

/* JADX INFO: compiled from: SafeMeetupDialog.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class ComposableSingletons$SafeMeetupDialogKt {
    public static final ComposableSingletons$SafeMeetupDialogKt INSTANCE = new ComposableSingletons$SafeMeetupDialogKt();
    private static Function3<RowScope, Composer, Integer, Unit> lambda$2085108294 = ComposableLambdaKt.composableLambdaInstance(2085108294, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$SafeMeetupDialogKt$$ExternalSyntheticLambda0
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$SafeMeetupDialogKt.lambda_2085108294$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$724382549 = ComposableLambdaKt.composableLambdaInstance(724382549, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$SafeMeetupDialogKt$$ExternalSyntheticLambda11
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$SafeMeetupDialogKt.lambda_724382549$lambda$1((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-2031749031, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f173lambda$2031749031 = ComposableLambdaKt.composableLambdaInstance(-2031749031, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$SafeMeetupDialogKt$$ExternalSyntheticLambda12
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$SafeMeetupDialogKt.lambda__2031749031$lambda$3((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1179616010 = ComposableLambdaKt.composableLambdaInstance(1179616010, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$SafeMeetupDialogKt$$ExternalSyntheticLambda13
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$SafeMeetupDialogKt.lambda_1179616010$lambda$5((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1357906833, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f172lambda$1357906833 = ComposableLambdaKt.composableLambdaInstance(-1357906833, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$SafeMeetupDialogKt$$ExternalSyntheticLambda14
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$SafeMeetupDialogKt.lambda__1357906833$lambda$6((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-534607449, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f175lambda$534607449 = ComposableLambdaKt.composableLambdaInstance(-534607449, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$SafeMeetupDialogKt$$ExternalSyntheticLambda1
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$SafeMeetupDialogKt.lambda__534607449$lambda$7((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-892192254, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f176lambda$892192254 = ComposableLambdaKt.composableLambdaInstance(-892192254, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$SafeMeetupDialogKt$$ExternalSyntheticLambda2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$SafeMeetupDialogKt.lambda__892192254$lambda$8((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1948449761 = ComposableLambdaKt.composableLambdaInstance(1948449761, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$SafeMeetupDialogKt$$ExternalSyntheticLambda3
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$SafeMeetupDialogKt.lambda_1948449761$lambda$9((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$494124480 = ComposableLambdaKt.composableLambdaInstance(494124480, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$SafeMeetupDialogKt$$ExternalSyntheticLambda4
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$SafeMeetupDialogKt.lambda_494124480$lambda$10((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1376738398 = ComposableLambdaKt.composableLambdaInstance(1376738398, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$SafeMeetupDialogKt$$ExternalSyntheticLambda5
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$SafeMeetupDialogKt.lambda_1376738398$lambda$11((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$34562499 = ComposableLambdaKt.composableLambdaInstance(34562499, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$SafeMeetupDialogKt$$ExternalSyntheticLambda6
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$SafeMeetupDialogKt.lambda_34562499$lambda$12((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$961317252 = ComposableLambdaKt.composableLambdaInstance(961317252, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$SafeMeetupDialogKt$$ExternalSyntheticLambda7
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$SafeMeetupDialogKt.lambda_961317252$lambda$13((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-493008029, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f174lambda$493008029 = ComposableLambdaKt.composableLambdaInstance(-493008029, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$SafeMeetupDialogKt$$ExternalSyntheticLambda8
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$SafeMeetupDialogKt.lambda__493008029$lambda$14((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1122555733, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f171lambda$1122555733 = ComposableLambdaKt.composableLambdaInstance(-1122555733, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$SafeMeetupDialogKt$$ExternalSyntheticLambda9
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$SafeMeetupDialogKt.lambda__1122555733$lambda$15((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1202885663 = ComposableLambdaKt.composableLambdaInstance(1202885663, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$SafeMeetupDialogKt$$ExternalSyntheticLambda10
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$SafeMeetupDialogKt.lambda_1202885663$lambda$16((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-1122555733$app, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m352getLambda$1122555733$app() {
        return f171lambda$1122555733;
    }

    /* JADX INFO: renamed from: getLambda$-1357906833$app, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m353getLambda$1357906833$app() {
        return f172lambda$1357906833;
    }

    /* JADX INFO: renamed from: getLambda$-2031749031$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m354getLambda$2031749031$app() {
        return f173lambda$2031749031;
    }

    /* JADX INFO: renamed from: getLambda$-493008029$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m355getLambda$493008029$app() {
        return f174lambda$493008029;
    }

    /* JADX INFO: renamed from: getLambda$-534607449$app, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m356getLambda$534607449$app() {
        return f175lambda$534607449;
    }

    /* JADX INFO: renamed from: getLambda$-892192254$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m357getLambda$892192254$app() {
        return f176lambda$892192254;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1179616010$app() {
        return lambda$1179616010;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1202885663$app() {
        return lambda$1202885663;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1376738398$app() {
        return lambda$1376738398;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1948449761$app() {
        return lambda$1948449761;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$2085108294$app() {
        return lambda$2085108294;
    }

    public final Function2<Composer, Integer, Unit> getLambda$34562499$app() {
        return lambda$34562499;
    }

    public final Function2<Composer, Integer, Unit> getLambda$494124480$app() {
        return lambda$494124480;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$724382549$app() {
        return lambda$724382549;
    }

    public final Function2<Composer, Integer, Unit> getLambda$961317252$app() {
        return lambda$961317252;
    }

    static final Unit lambda__2031749031$lambda$3(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C159@7191L338:SafeMeetupDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2031749031, i, -1, "com.example.ui.screens.ComposableSingletons$SafeMeetupDialogKt.lambda$-2031749031.<anonymous> (SafeMeetupDialog.kt:159)");
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
            ComposerKt.sourceInformationMarkerStart(composer, -1870127369, "C160@7258L249:SafeMeetupDialog.kt#2thlc2");
            IconKt.Icon-ww6aTOc(PlaceKt.getPlace(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(24.0f)), ColorKt.Color(4279994175L), composer, 3504, 0);
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

    static final Unit lambda__1357906833$lambda$6(LazyItemScope lazyItemScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(lazyItemScope, "$this$item");
        ComposerKt.sourceInformation(composer, "C191@8548L1288:SafeMeetupDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1357906833, i, -1, "com.example.ui.screens.ComposableSingletons$SafeMeetupDialogKt.lambda$-1357906833.<anonymous> (SafeMeetupDialog.kt:191)");
            }
            long j = Color.copy-wmQWz5c$default(ColorKt.Color(4279994175L), 0.1f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
            SurfaceKt.Surface-T9BRK9s(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), j, 0L, 0.0f, 0.0f, (BorderStroke) null, lambda$1179616010, composer, 12583302, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1179616010$lambda$5(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C196@8794L1020:SafeMeetupDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1179616010, i, -1, "com.example.ui.screens.ComposableSingletons$SafeMeetupDialogKt.lambda$1179616010.<anonymous> (SafeMeetupDialog.kt:196)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f));
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
            ComposerKt.sourceInformationMarkerStart(composer, -240750205, "C200@8994L273,206@9296L39,209@9611L10,210@9687L11,207@9364L424:SafeMeetupDialog.kt#2thlc2");
            IconKt.Icon-ww6aTOc(HandshakeKt.getHandshake(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(20.0f)), ColorKt.Color(4279994175L), composer, 3504, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            TextKt.Text--4IGK_g("Propose a spot below. Once the other reader taps 'Agree & Confirm', it becomes your mutually agreed meetup location with shared Maps navigation!", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface-0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 3078, 0, 65522);
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

    static final Unit lambda__534607449$lambda$7(LazyItemScope lazyItemScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(lazyItemScope, "$this$item");
        ComposerKt.sourceInformation(composer, "C263@12269L10,261@12154L213:SafeMeetupDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-534607449, i, -1, "com.example.ui.screens.ComposableSingletons$SafeMeetupDialogKt.lambda$-534607449.<anonymous> (SafeMeetupDialog.kt:261)");
            }
            TextKt.Text--4IGK_g("2. Suggested Spots Near You:", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelMedium(), composer, 196614, 0, 65502);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__892192254$lambda$8(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C336@16109L44:SafeMeetupDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-892192254, i, -1, "com.example.ui.screens.ComposableSingletons$SafeMeetupDialogKt.lambda$-892192254.<anonymous> (SafeMeetupDialog.kt:336)");
            }
            TextKt.Text--4IGK_g("Or Search Public Library / Spot Name", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1948449761$lambda$9(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C337@16197L46:SafeMeetupDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1948449761, i, -1, "com.example.ui.screens.ComposableSingletons$SafeMeetupDialogKt.lambda$1948449761.<anonymous> (SafeMeetupDialog.kt:337)");
            }
            TextKt.Text--4IGK_g("e.g. City Central Library, Indiranagar", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_494124480$lambda$10(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C338@16362L11,338@16287L95:SafeMeetupDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(494124480, i, -1, "com.example.ui.screens.ComposableSingletons$SafeMeetupDialogKt.lambda$494124480.<anonymous> (SafeMeetupDialog.kt:338)");
            }
            IconKt.Icon-ww6aTOc(SearchKt.getSearch(Icons.INSTANCE.getDefault()), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1376738398$lambda$11(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C344@16802L55:SafeMeetupDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1376738398, i, -1, "com.example.ui.screens.ComposableSingletons$SafeMeetupDialogKt.lambda$1376738398.<anonymous> (SafeMeetupDialog.kt:344)");
            }
            IconKt.Icon-ww6aTOc(CloseKt.getClose(Icons.INSTANCE.getDefault()), "Clear", (Modifier) null, 0L, composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_34562499$lambda$12(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C359@17407L38:SafeMeetupDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(34562499, i, -1, "com.example.ui.screens.ComposableSingletons$SafeMeetupDialogKt.lambda$34562499.<anonymous> (SafeMeetupDialog.kt:359)");
            }
            TextKt.Text--4IGK_g("Selected Place / Landmark Name", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_961317252$lambda$13(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C370@17854L40:SafeMeetupDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(961317252, i, -1, "com.example.ui.screens.ComposableSingletons$SafeMeetupDialogKt.lambda$961317252.<anonymous> (SafeMeetupDialog.kt:370)");
            }
            TextKt.Text--4IGK_g("Specific Meeting Point / Address", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__493008029$lambda$14(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C371@17938L46:SafeMeetupDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-493008029, i, -1, "com.example.ui.screens.ComposableSingletons$SafeMeetupDialogKt.lambda$-493008029.<anonymous> (SafeMeetupDialog.kt:371)");
            }
            TextKt.Text--4IGK_g("e.g. Inside main reading room entrance", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1122555733$lambda$15(LazyItemScope lazyItemScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(lazyItemScope, "$this$item");
        ComposerKt.sourceInformation(composer, "C379@18230L40,382@18400L10,380@18291L207:SafeMeetupDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1122555733, i, -1, "com.example.ui.screens.ComposableSingletons$SafeMeetupDialogKt.lambda$-1122555733.<anonymous> (SafeMeetupDialog.kt:379)");
            }
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(2.0f)), composer, 6);
            TextKt.Text--4IGK_g("3. Select Date & Time:", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelMedium(), composer, 196614, 0, 65502);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1202885663$lambda$16(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C435@21583L83,436@21691L39,437@21755L44:SafeMeetupDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1202885663, i, -1, "com.example.ui.screens.ComposableSingletons$SafeMeetupDialogKt.lambda$1202885663.<anonymous> (SafeMeetupDialog.kt:435)");
            }
            IconKt.Icon-ww6aTOc(MapKt.getMap(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextKt.Text--4IGK_g("Preview Selected Spot on Google Maps", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_2085108294$lambda$0(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C462@22881L96,463@22994L39,464@23050L63:SafeMeetupDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2085108294, i, -1, "com.example.ui.screens.ComposableSingletons$SafeMeetupDialogKt.lambda$2085108294.<anonymous> (SafeMeetupDialog.kt:462)");
            }
            IconKt.Icon-ww6aTOc(SendKt.getSend(Icons.AutoMirrored.Filled.INSTANCE), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextKt.Text--4IGK_g("Send for Mutual Agreement", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 196614, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_724382549$lambda$1(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$TextButton");
        ComposerKt.sourceInformation(composer, "C469@23227L14:SafeMeetupDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(724382549, i, -1, "com.example.ui.screens.ComposableSingletons$SafeMeetupDialogKt.lambda$724382549.<anonymous> (SafeMeetupDialog.kt:469)");
            }
            TextKt.Text--4IGK_g("Cancel", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
