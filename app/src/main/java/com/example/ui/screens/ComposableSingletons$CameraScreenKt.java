package com.example.ui.screens;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CameraAltKt;
import androidx.compose.material.icons.filled.DocumentScannerKt;
import androidx.compose.material.icons.filled.PhotoLibraryKt;
import androidx.compose.material.icons.filled.SearchKt;
import androidx.compose.material.icons.filled.VerifiedKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.material3.TopAppBarScrollBehavior;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CameraScreen.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class ComposableSingletons$CameraScreenKt {
    public static final ComposableSingletons$CameraScreenKt INSTANCE = new ComposableSingletons$CameraScreenKt();
    private static Function2<Composer, Integer, Unit> lambda$342927075 = ComposableLambdaKt.composableLambdaInstance(342927075, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$CameraScreenKt$$ExternalSyntheticLambda0
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$CameraScreenKt.lambda_342927075$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-2075333601, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f50lambda$2075333601 = ComposableLambdaKt.composableLambdaInstance(-2075333601, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$CameraScreenKt$$ExternalSyntheticLambda2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$CameraScreenKt.lambda__2075333601$lambda$1((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1693687029 = ComposableLambdaKt.composableLambdaInstance(1693687029, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$CameraScreenKt$$ExternalSyntheticLambda8
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$CameraScreenKt.lambda_1693687029$lambda$2((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-978543241, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f57lambda$978543241 = ComposableLambdaKt.composableLambdaInstance(-978543241, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$CameraScreenKt$$ExternalSyntheticLambda9
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$CameraScreenKt.lambda__978543241$lambda$3((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1009558226, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f41lambda$1009558226 = ComposableLambdaKt.composableLambdaInstance(-1009558226, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$CameraScreenKt$$ExternalSyntheticLambda10
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$CameraScreenKt.lambda__1009558226$lambda$4((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-581009893, reason: not valid java name */
    private static Function3<ColumnScope, Composer, Integer, Unit> f54lambda$581009893 = ComposableLambdaKt.composableLambdaInstance(-581009893, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$CameraScreenKt$$ExternalSyntheticLambda12
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$CameraScreenKt.lambda__581009893$lambda$6((ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1980000723, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f49lambda$1980000723 = ComposableLambdaKt.composableLambdaInstance(-1980000723, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$CameraScreenKt$$ExternalSyntheticLambda13
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$CameraScreenKt.lambda__1980000723$lambda$7((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$914728804 = ComposableLambdaKt.composableLambdaInstance(914728804, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$CameraScreenKt$$ExternalSyntheticLambda14
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$CameraScreenKt.lambda_914728804$lambda$8((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1748467668, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f46lambda$1748467668 = ComposableLambdaKt.composableLambdaInstance(-1748467668, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$CameraScreenKt$$ExternalSyntheticLambda15
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$CameraScreenKt.lambda__1748467668$lambda$11((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$2048933904 = ComposableLambdaKt.composableLambdaInstance(2048933904, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$CameraScreenKt$$ExternalSyntheticLambda16
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$CameraScreenKt.lambda_2048933904$lambda$12((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-825243089, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f55lambda$825243089 = ComposableLambdaKt.composableLambdaInstance(-825243089, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$CameraScreenKt$$ExternalSyntheticLambda11
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$CameraScreenKt.lambda__825243089$lambda$13((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1317418132, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f44lambda$1317418132 = ComposableLambdaKt.composableLambdaInstance(-1317418132, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$CameraScreenKt$$ExternalSyntheticLambda17
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$CameraScreenKt.lambda__1317418132$lambda$14((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1273333679, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f43lambda$1273333679 = ComposableLambdaKt.composableLambdaInstance(-1273333679, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$CameraScreenKt$$ExternalSyntheticLambda18
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$CameraScreenKt.lambda__1273333679$lambda$15((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$94924359 = ComposableLambdaKt.composableLambdaInstance(94924359, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$CameraScreenKt$$ExternalSyntheticLambda19
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$CameraScreenKt.lambda_94924359$lambda$16((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-325194586, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f52lambda$325194586 = ComposableLambdaKt.composableLambdaInstance(-325194586, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$CameraScreenKt$$ExternalSyntheticLambda20
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$CameraScreenKt.lambda__325194586$lambda$17((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$197401352 = ComposableLambdaKt.composableLambdaInstance(197401352, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$CameraScreenKt$$ExternalSyntheticLambda21
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$CameraScreenKt.lambda_197401352$lambda$18((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-222717593, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f51lambda$222717593 = ComposableLambdaKt.composableLambdaInstance(-222717593, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$CameraScreenKt$$ExternalSyntheticLambda22
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$CameraScreenKt.lambda__222717593$lambda$19((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$299878345 = ComposableLambdaKt.composableLambdaInstance(299878345, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$CameraScreenKt$$ExternalSyntheticLambda23
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$CameraScreenKt.lambda_299878345$lambda$20((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-120240600, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f42lambda$120240600 = ComposableLambdaKt.composableLambdaInstance(-120240600, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$CameraScreenKt$$ExternalSyntheticLambda24
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$CameraScreenKt.lambda__120240600$lambda$21((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$402355338 = ComposableLambdaKt.composableLambdaInstance(402355338, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$CameraScreenKt$$ExternalSyntheticLambda1
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$CameraScreenKt.lambda_402355338$lambda$22((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-17763607, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f47lambda$17763607 = ComposableLambdaKt.composableLambdaInstance(-17763607, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$CameraScreenKt$$ExternalSyntheticLambda3
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$CameraScreenKt.lambda__17763607$lambda$23((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-540009081, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f53lambda$540009081 = ComposableLambdaKt.composableLambdaInstance(-540009081, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$CameraScreenKt$$ExternalSyntheticLambda4
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$CameraScreenKt.lambda__540009081$lambda$24((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-960128026, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f56lambda$960128026 = ComposableLambdaKt.composableLambdaInstance(-960128026, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$CameraScreenKt$$ExternalSyntheticLambda5
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$CameraScreenKt.lambda__960128026$lambda$25((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1442473474, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f45lambda$1442473474 = ComposableLambdaKt.composableLambdaInstance(-1442473474, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$CameraScreenKt$$ExternalSyntheticLambda6
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$CameraScreenKt.lambda__1442473474$lambda$26((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1897981826, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f48lambda$1897981826 = ComposableLambdaKt.composableLambdaInstance(-1897981826, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$CameraScreenKt$$ExternalSyntheticLambda7
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$CameraScreenKt.lambda__1897981826$lambda$27((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-1009558226$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m222getLambda$1009558226$app() {
        return f41lambda$1009558226;
    }

    /* JADX INFO: renamed from: getLambda$-120240600$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m223getLambda$120240600$app() {
        return f42lambda$120240600;
    }

    /* JADX INFO: renamed from: getLambda$-1273333679$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m224getLambda$1273333679$app() {
        return f43lambda$1273333679;
    }

    /* JADX INFO: renamed from: getLambda$-1317418132$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m225getLambda$1317418132$app() {
        return f44lambda$1317418132;
    }

    /* JADX INFO: renamed from: getLambda$-1442473474$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m226getLambda$1442473474$app() {
        return f45lambda$1442473474;
    }

    /* JADX INFO: renamed from: getLambda$-1748467668$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m227getLambda$1748467668$app() {
        return f46lambda$1748467668;
    }

    /* JADX INFO: renamed from: getLambda$-17763607$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m228getLambda$17763607$app() {
        return f47lambda$17763607;
    }

    /* JADX INFO: renamed from: getLambda$-1897981826$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m229getLambda$1897981826$app() {
        return f48lambda$1897981826;
    }

    /* JADX INFO: renamed from: getLambda$-1980000723$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m230getLambda$1980000723$app() {
        return f49lambda$1980000723;
    }

    /* JADX INFO: renamed from: getLambda$-2075333601$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m231getLambda$2075333601$app() {
        return f50lambda$2075333601;
    }

    /* JADX INFO: renamed from: getLambda$-222717593$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m232getLambda$222717593$app() {
        return f51lambda$222717593;
    }

    /* JADX INFO: renamed from: getLambda$-325194586$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m233getLambda$325194586$app() {
        return f52lambda$325194586;
    }

    /* JADX INFO: renamed from: getLambda$-540009081$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m234getLambda$540009081$app() {
        return f53lambda$540009081;
    }

    /* JADX INFO: renamed from: getLambda$-581009893$app, reason: not valid java name */
    public final Function3<ColumnScope, Composer, Integer, Unit> m235getLambda$581009893$app() {
        return f54lambda$581009893;
    }

    /* JADX INFO: renamed from: getLambda$-825243089$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m236getLambda$825243089$app() {
        return f55lambda$825243089;
    }

    /* JADX INFO: renamed from: getLambda$-960128026$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m237getLambda$960128026$app() {
        return f56lambda$960128026;
    }

    /* JADX INFO: renamed from: getLambda$-978543241$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m238getLambda$978543241$app() {
        return f57lambda$978543241;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1693687029$app() {
        return lambda$1693687029;
    }

    public final Function2<Composer, Integer, Unit> getLambda$197401352$app() {
        return lambda$197401352;
    }

    public final Function2<Composer, Integer, Unit> getLambda$2048933904$app() {
        return lambda$2048933904;
    }

    public final Function2<Composer, Integer, Unit> getLambda$299878345$app() {
        return lambda$299878345;
    }

    public final Function2<Composer, Integer, Unit> getLambda$342927075$app() {
        return lambda$342927075;
    }

    public final Function2<Composer, Integer, Unit> getLambda$402355338$app() {
        return lambda$402355338;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$914728804$app() {
        return lambda$914728804;
    }

    public final Function2<Composer, Integer, Unit> getLambda$94924359$app() {
        return lambda$94924359;
    }

    static final Unit lambda__2075333601$lambda$1(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C714@41098L11,715@41173L11,713@41030L182,711@40900L326:CameraScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2075333601, i, -1, "com.example.ui.screens.ComposableSingletons$CameraScreenKt.lambda$-2075333601.<anonymous> (CameraScreen.kt:711)");
            }
            AppBarKt.TopAppBar-GHTll3U(lambda$342927075, (Modifier) null, (Function2) null, (Function3) null, 0.0f, (WindowInsets) null, TopAppBarDefaults.INSTANCE.topAppBarColors-zjMxDiM(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0L, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface-0d7_KjU(), 0L, composer, TopAppBarDefaults.$stable << 15, 22), (TopAppBarScrollBehavior) null, composer, 6, 190);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_342927075$lambda$0(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C712@40937L46:CameraScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(342927075, i, -1, "com.example.ui.screens.ComposableSingletons$CameraScreenKt.lambda$342927075.<anonymous> (CameraScreen.kt:712)");
            }
            TextKt.Text--4IGK_g("Add Book", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 196614, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1693687029$lambda$2(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C759@42957L70,760@43048L28,761@43148L10,761@43097L74:CameraScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1693687029, i, -1, "com.example.ui.screens.ComposableSingletons$CameraScreenKt.lambda$1693687029.<anonymous> (CameraScreen.kt:759)");
            }
            IconKt.Icon-ww6aTOc(DocumentScannerKt.getDocumentScanner(Icons.INSTANCE.getDefault()), "Scan Cover", (Modifier) null, 0L, composer, 48, 12);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            TextKt.Text--4IGK_g("Scan Book Cover (AI)", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleMedium(), composer, 6, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__978543241$lambda$3(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C771@43517L60,772@43598L28,773@43694L10,773@43647L70:CameraScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-978543241, i, -1, "com.example.ui.screens.ComposableSingletons$CameraScreenKt.lambda$-978543241.<anonymous> (CameraScreen.kt:771)");
            }
            IconKt.Icon-ww6aTOc(CameraAltKt.getCameraAlt(Icons.INSTANCE.getDefault()), "Camera", (Modifier) null, 0L, composer, 48, 12);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            TextKt.Text--4IGK_g("Take Quick Photo", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleMedium(), composer, 6, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1009558226$lambda$4(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C783@44094L64,784@44179L28,785@44278L10,785@44228L73:CameraScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1009558226, i, -1, "com.example.ui.screens.ComposableSingletons$CameraScreenKt.lambda$-1009558226.<anonymous> (CameraScreen.kt:783)");
            }
            IconKt.Icon-ww6aTOc(PhotoLibraryKt.getPhotoLibrary(Icons.INSTANCE.getDefault()), "Gallery", (Modifier) null, 0L, composer, 48, 12);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            TextKt.Text--4IGK_g("Upload from Gallery", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleMedium(), composer, 6, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__581009893$lambda$6(ColumnScope columnScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(columnScope, "$this$Card");
        ComposerKt.sourceInformation(composer, "C797@44841L655:CameraScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-581009893, i, -1, "com.example.ui.screens.ComposableSingletons$CameraScreenKt.lambda$-581009893.<anonymous> (CameraScreen.kt:797)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(16.0f));
            Arrangement.Horizontal center = Arrangement.INSTANCE.getCenter();
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer, 54);
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
            ComposerKt.sourceInformationMarkerStart(composer, 391374286, "C802@45209L11,802@45128L112,803@45269L40,804@45393L10,804@45439L11,804@45338L132:CameraScreen.kt#2thlc2");
            ProgressIndicatorKt.CircularProgressIndicator-LxG7B9w(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(24.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnPrimaryContainer-0d7_KjU(), 0.0f, 0L, 0, composer, 6, 28);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), composer, 6);
            TextKt.Text--4IGK_g("Scanning book details...", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnPrimaryContainer-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleMedium(), composer, 6, 0, 65530);
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

    static final Unit lambda__1980000723$lambda$7(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C849@47697L95,850@47825L28,851@47886L14:CameraScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1980000723, i, -1, "com.example.ui.screens.ComposableSingletons$CameraScreenKt.lambda$-1980000723.<anonymous> (CameraScreen.kt:849)");
            }
            IconKt.Icon-ww6aTOc(DocumentScannerKt.getDocumentScanner(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextKt.Text--4IGK_g("Rescan", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_914728804$lambda$8(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C857@48186L92,858@48311L28,859@48372L20:CameraScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(914728804, i, -1, "com.example.ui.screens.ComposableSingletons$CameraScreenKt.lambda$914728804.<anonymous> (CameraScreen.kt:857)");
            }
            IconKt.Icon-ww6aTOc(PhotoLibraryKt.getPhotoLibrary(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextKt.Text--4IGK_g("Pick Gallery", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1748467668$lambda$11(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C887@49864L1549:CameraScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1748467668, i, -1, "com.example.ui.screens.ComposableSingletons$CameraScreenKt.lambda$-1748467668.<anonymous> (CameraScreen.kt:887)");
            }
            Modifier modifier = PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(12.0f), Dp.constructor-impl(8.0f));
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
            ComposerKt.sourceInformationMarkerStart(composer, -536080202, "C891@50126L312,897@50475L39,898@50551L828:CameraScreen.kt#2thlc2");
            IconKt.Icon-ww6aTOc(VerifiedKt.getVerified(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(20.0f)), ColorKt.Color(4279994175L), composer, 3504, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
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
            ComposerKt.sourceInformationMarkerStart(composer, -1977462612, "C901@50768L10,899@50600L377,907@51187L10,905@51018L323:CameraScreen.kt#2thlc2");
            TextStyle labelMedium = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelMedium();
            TextKt.Text--4IGK_g("Verified with Google Books & Open Library", (Modifier) null, ColorKt.Color(4279994175L), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, labelMedium, composer, 196998, 0, 65498);
            TextKt.Text--4IGK_g("Official catalog metadata & details loaded", (Modifier) null, Color.copy-wmQWz5c$default(ColorKt.Color(4279994175L), 0.85f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 390, 0, 65530);
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

    static final Unit lambda_2048933904$lambda$12(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C979@55353L20:CameraScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2048933904, i, -1, "com.example.ui.screens.ComposableSingletons$CameraScreenKt.lambda$2048933904.<anonymous> (CameraScreen.kt:979)");
            }
            TextKt.Text--4IGK_g("Book Title *", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__825243089$lambda$13(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C980@55421L28:CameraScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-825243089, i, -1, "com.example.ui.screens.ComposableSingletons$CameraScreenKt.lambda$-825243089.<anonymous> (CameraScreen.kt:980)");
            }
            TextKt.Text--4IGK_g("e.g. Science Class 9", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1317418132$lambda$14(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C990@56128L70:CameraScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1317418132, i, -1, "com.example.ui.screens.ComposableSingletons$CameraScreenKt.lambda$-1317418132.<anonymous> (CameraScreen.kt:990)");
            }
            IconKt.Icon-ww6aTOc(SearchKt.getSearch(Icons.INSTANCE.getDefault()), "Search Google Books", (Modifier) null, 0L, composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1273333679$lambda$15(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$TextButton");
        ComposerKt.sourceInformation(composer, "C1021@58182L10,1021@58144L60:CameraScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1273333679, i, -1, "com.example.ui.screens.ComposableSingletons$CameraScreenKt.lambda$-1273333679.<anonymous> (CameraScreen.kt:1021)");
            }
            TextKt.Text--4IGK_g("Dismiss", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 6, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_94924359$lambda$16(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1087@62972L16:CameraScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(94924359, i, -1, "com.example.ui.screens.ComposableSingletons$CameraScreenKt.lambda$94924359.<anonymous> (CameraScreen.kt:1087)");
            }
            TextKt.Text--4IGK_g("Author *", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__325194586$lambda$17(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1088@63036L33:CameraScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-325194586, i, -1, "com.example.ui.screens.ComposableSingletons$CameraScreenKt.lambda$-325194586.<anonymous> (CameraScreen.kt:1088)");
            }
            TextKt.Text--4IGK_g("e.g. NCERT or Author Name", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_197401352$lambda$18(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1103@63857L25:CameraScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(197401352, i, -1, "com.example.ui.screens.ComposableSingletons$CameraScreenKt.lambda$197401352.<anonymous> (CameraScreen.kt:1103)");
            }
            TextKt.Text--4IGK_g("Publisher / Board", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__222717593$lambda$19(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1104@63930L36:CameraScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-222717593, i, -1, "com.example.ui.screens.ComposableSingletons$CameraScreenKt.lambda$-222717593.<anonymous> (CameraScreen.kt:1104)");
            }
            TextKt.Text--4IGK_g("e.g. NCERT, Penguin, Pearson", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_299878345$lambda$20(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1113@64354L23:CameraScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(299878345, i, -1, "com.example.ui.screens.ComposableSingletons$CameraScreenKt.lambda$299878345.<anonymous> (CameraScreen.kt:1113)");
            }
            TextKt.Text--4IGK_g("Genre / Subject", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__120240600$lambda$21(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1114@64425L35:CameraScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-120240600, i, -1, "com.example.ui.screens.ComposableSingletons$CameraScreenKt.lambda$-120240600.<anonymous> (CameraScreen.kt:1114)");
            }
            TextKt.Text--4IGK_g("e.g. Science, Fiction, Exam", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_402355338$lambda$22(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1137@65628L30:CameraScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(402355338, i, -1, "com.example.ui.screens.ComposableSingletons$CameraScreenKt.lambda$402355338.<anonymous> (CameraScreen.kt:1137)");
            }
            TextKt.Text--4IGK_g("Description (Optional)", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__17763607$lambda$23(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1138@65706L40:CameraScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-17763607, i, -1, "com.example.ui.screens.ComposableSingletons$CameraScreenKt.lambda$-17763607.<anonymous> (CameraScreen.kt:1138)");
            }
            TextKt.Text--4IGK_g("Brief description of the book...", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__540009081$lambda$24(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1179@67816L33:CameraScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-540009081, i, -1, "com.example.ui.screens.ComposableSingletons$CameraScreenKt.lambda$-540009081.<anonymous> (CameraScreen.kt:1179)");
            }
            TextKt.Text--4IGK_g("Pickup Address / Landmark", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__960128026$lambda$25(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1180@67897L41:CameraScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-960128026, i, -1, "com.example.ui.screens.ComposableSingletons$CameraScreenKt.lambda$-960128026.<anonymous> (CameraScreen.kt:1180)");
            }
            TextKt.Text--4IGK_g("e.g. Community Center or Main St.", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1442473474$lambda$26(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1189@68364L32:CameraScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1442473474, i, -1, "com.example.ui.screens.ComposableSingletons$CameraScreenKt.lambda$-1442473474.<anonymous> (CameraScreen.kt:1189)");
            }
            TextKt.Text--4IGK_g("Mobile Number (Optional)", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1897981826$lambda$27(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1230@70290L10,1230@70240L103:CameraScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1897981826, i, -1, "com.example.ui.screens.ComposableSingletons$CameraScreenKt.lambda$-1897981826.<anonymous> (CameraScreen.kt:1230)");
            }
            TextKt.Text--4IGK_g("Add Book to Library", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleMedium(), composer, 196614, 0, 65502);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
