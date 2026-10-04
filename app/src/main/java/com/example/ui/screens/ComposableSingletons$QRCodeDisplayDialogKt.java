package com.example.ui.screens;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: QRCodeDisplayDialog.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class ComposableSingletons$QRCodeDisplayDialogKt {
    public static final ComposableSingletons$QRCodeDisplayDialogKt INSTANCE = new ComposableSingletons$QRCodeDisplayDialogKt();
    private static Function2<Composer, Integer, Unit> lambda$1353937549 = ComposableLambdaKt.composableLambdaInstance(1353937549, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$QRCodeDisplayDialogKt$$ExternalSyntheticLambda0
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$QRCodeDisplayDialogKt.lambda_1353937549$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-2063529218, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f165lambda$2063529218 = ComposableLambdaKt.composableLambdaInstance(-2063529218, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$QRCodeDisplayDialogKt$$ExternalSyntheticLambda1
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$QRCodeDisplayDialogKt.lambda__2063529218$lambda$1((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-2063529218$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m346getLambda$2063529218$app() {
        return f165lambda$2063529218;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1353937549$app() {
        return lambda$1353937549;
    }

    static final Unit lambda_1353937549$lambda$0(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C105@4600L55:QRCodeDisplayDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1353937549, i, -1, "com.example.ui.screens.ComposableSingletons$QRCodeDisplayDialogKt.lambda$1353937549.<anonymous> (QRCodeDisplayDialog.kt:105)");
            }
            IconKt.Icon-ww6aTOc(CloseKt.getClose(Icons.INSTANCE.getDefault()), "Close", (Modifier) null, 0L, composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__2063529218$lambda$1(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C232@10372L20:QRCodeDisplayDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2063529218, i, -1, "com.example.ui.screens.ComposableSingletons$QRCodeDisplayDialogKt.lambda$-2063529218.<anonymous> (QRCodeDisplayDialog.kt:232)");
            }
            TextKt.Text--4IGK_g("Done / Close", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
