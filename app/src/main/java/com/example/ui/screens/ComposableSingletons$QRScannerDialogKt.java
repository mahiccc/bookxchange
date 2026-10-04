package com.example.ui.screens;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CameraAltKt;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: QRScannerDialog.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class ComposableSingletons$QRScannerDialogKt {
    public static final ComposableSingletons$QRScannerDialogKt INSTANCE = new ComposableSingletons$QRScannerDialogKt();
    private static Function3<RowScope, Composer, Integer, Unit> lambda$584615728 = ComposableLambdaKt.composableLambdaInstance(584615728, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$QRScannerDialogKt$$ExternalSyntheticLambda0
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$QRScannerDialogKt.lambda_584615728$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-558201330, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f167lambda$558201330 = ComposableLambdaKt.composableLambdaInstance(-558201330, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$QRScannerDialogKt$$ExternalSyntheticLambda1
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$QRScannerDialogKt.lambda__558201330$lambda$1((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-748619679, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f168lambda$748619679 = ComposableLambdaKt.composableLambdaInstance(-748619679, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$QRScannerDialogKt$$ExternalSyntheticLambda2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$QRScannerDialogKt.lambda__748619679$lambda$2((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1825939819, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f166lambda$1825939819 = ComposableLambdaKt.composableLambdaInstance(-1825939819, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$QRScannerDialogKt$$ExternalSyntheticLambda3
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$QRScannerDialogKt.lambda__1825939819$lambda$3((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1314557374 = ComposableLambdaKt.composableLambdaInstance(1314557374, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$QRScannerDialogKt$$ExternalSyntheticLambda4
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$QRScannerDialogKt.lambda_1314557374$lambda$4((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1659064177 = ComposableLambdaKt.composableLambdaInstance(1659064177, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$QRScannerDialogKt$$ExternalSyntheticLambda5
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$QRScannerDialogKt.lambda_1659064177$lambda$5((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-1825939819$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m347getLambda$1825939819$app() {
        return f166lambda$1825939819;
    }

    /* JADX INFO: renamed from: getLambda$-558201330$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m348getLambda$558201330$app() {
        return f167lambda$558201330;
    }

    /* JADX INFO: renamed from: getLambda$-748619679$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m349getLambda$748619679$app() {
        return f168lambda$748619679;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1314557374$app() {
        return lambda$1314557374;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1659064177$app() {
        return lambda$1659064177;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$584615728$app() {
        return lambda$584615728;
    }

    static final Unit lambda_584615728$lambda$0(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C234@10913L24:QRScannerDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(584615728, i, -1, "com.example.ui.screens.ComposableSingletons$QRScannerDialogKt.lambda$584615728.<anonymous> (QRScannerDialog.kt:234)");
            }
            TextKt.Text--4IGK_g("Grant Permission", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__558201330$lambda$1(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C289@13506L89,290@13624L39,291@13692L29:QRScannerDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-558201330, i, -1, "com.example.ui.screens.ComposableSingletons$QRScannerDialogKt.lambda$-558201330.<anonymous> (QRScannerDialog.kt:289)");
            }
            IconKt.Icon-ww6aTOc(CameraAltKt.getCameraAlt(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextKt.Text--4IGK_g("Take Snapshot to Scan", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__748619679$lambda$2(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C328@15424L75:QRScannerDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-748619679, i, -1, "com.example.ui.screens.ComposableSingletons$QRScannerDialogKt.lambda$-748619679.<anonymous> (QRScannerDialog.kt:328)");
            }
            IconKt.Icon-ww6aTOc(CloseKt.getClose(Icons.INSTANCE.getDefault()), "Close", (Modifier) null, Color.Companion.getWhite-0d7_KjU(), composer, 3120, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1825939819$lambda$3(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C470@21884L75:QRScannerDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1825939819, i, -1, "com.example.ui.screens.ComposableSingletons$QRScannerDialogKt.lambda$-1825939819.<anonymous> (QRScannerDialog.kt:470)");
            }
            IconKt.Icon-ww6aTOc(CloseKt.getClose(Icons.INSTANCE.getDefault()), "Close", (Modifier) null, Color.Companion.getWhite-0d7_KjU(), composer, 3120, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1314557374$lambda$4(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$TextButton");
        ComposerKt.sourceInformation(composer, "C523@24525L14:QRScannerDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1314557374, i, -1, "com.example.ui.screens.ComposableSingletons$QRScannerDialogKt.lambda$1314557374.<anonymous> (QRScannerDialog.kt:523)");
            }
            TextKt.Text--4IGK_g("Cancel", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1659064177$lambda$5(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C525@24652L10:QRScannerDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1659064177, i, -1, "com.example.ui.screens.ComposableSingletons$QRScannerDialogKt.lambda$1659064177.<anonymous> (QRScannerDialog.kt:525)");
            }
            TextKt.Text--4IGK_g("OK", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
