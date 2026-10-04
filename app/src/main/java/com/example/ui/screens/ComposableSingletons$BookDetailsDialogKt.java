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
import androidx.compose.material.icons.automirrored.filled.ChatKt;
import androidx.compose.material.icons.filled.BookmarkKt;
import androidx.compose.material.icons.filled.CameraAltKt;
import androidx.compose.material.icons.filled.CheckCircleKt;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.material.icons.filled.DeleteKt;
import androidx.compose.material.icons.filled.NavigationKt;
import androidx.compose.material.icons.filled.PlaceKt;
import androidx.compose.material.icons.filled.QrCode2Kt;
import androidx.compose.material.icons.filled.QrCodeScannerKt;
import androidx.compose.material.icons.filled.RateReviewKt;
import androidx.compose.material.icons.filled.VerifiedKt;
import androidx.compose.material.icons.filled.WarningKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
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

/* JADX INFO: compiled from: BookDetailsDialog.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class ComposableSingletons$BookDetailsDialogKt {
    public static final ComposableSingletons$BookDetailsDialogKt INSTANCE = new ComposableSingletons$BookDetailsDialogKt();

    /* JADX INFO: renamed from: lambda$-650591842, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f35lambda$650591842 = ComposableLambdaKt.composableLambdaInstance(-650591842, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda0
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$BookDetailsDialogKt.lambda__650591842$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1522665015, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f16lambda$1522665015 = ComposableLambdaKt.composableLambdaInstance(-1522665015, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$BookDetailsDialogKt.lambda__1522665015$lambda$2((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$2111266901 = ComposableLambdaKt.composableLambdaInstance(2111266901, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda14
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda_2111266901$lambda$3((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1821991209, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f25lambda$1821991209 = ComposableLambdaKt.composableLambdaInstance(-1821991209, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda26
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda__1821991209$lambda$4((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1204138718 = ComposableLambdaKt.composableLambdaInstance(1204138718, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda38
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda_1204138718$lambda$5((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$364292576 = ComposableLambdaKt.composableLambdaInstance(364292576, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda50
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda_364292576$lambda$6((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1090049619, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f8lambda$1090049619 = ComposableLambdaKt.composableLambdaInstance(-1090049619, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda62
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda__1090049619$lambda$7((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$61718176 = ComposableLambdaKt.composableLambdaInstance(61718176, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda65
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda_61718176$lambda$8((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1910683885 = ComposableLambdaKt.composableLambdaInstance(1910683885, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda67
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda_1910683885$lambda$9((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1232515616, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f12lambda$1232515616 = ComposableLambdaKt.composableLambdaInstance(-1232515616, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda68
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda__1232515616$lambda$10((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$462677038 = ComposableLambdaKt.composableLambdaInstance(462677038, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda11
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda_462677038$lambda$11((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1614444833 = ComposableLambdaKt.composableLambdaInstance(1614444833, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda22
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda_1614444833$lambda$12((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1639001888 = ComposableLambdaKt.composableLambdaInstance(1639001888, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda33
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$BookDetailsDialogKt.lambda_1639001888$lambda$13((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-681887910, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f37lambda$681887910 = ComposableLambdaKt.composableLambdaInstance(-681887910, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda44
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda__681887910$lambda$14((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1666968850, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f20lambda$1666968850 = ComposableLambdaKt.composableLambdaInstance(-1666968850, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda55
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda__1666968850$lambda$15((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$700596995 = ComposableLambdaKt.composableLambdaInstance(700596995, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda66
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda_700596995$lambda$16((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$391803308 = ComposableLambdaKt.composableLambdaInstance(391803308, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda69
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda_391803308$lambda$17((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1830029076 = ComposableLambdaKt.composableLambdaInstance(1830029076, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda70
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda_1830029076$lambda$18((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1849759323 = ComposableLambdaKt.composableLambdaInstance(1849759323, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda71
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$BookDetailsDialogKt.lambda_1849759323$lambda$19((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1961379022, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f28lambda$1961379022 = ComposableLambdaKt.composableLambdaInstance(-1961379022, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda1
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda__1961379022$lambda$20((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$187965680 = ComposableLambdaKt.composableLambdaInstance(187965680, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda_187965680$lambda$21((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1403559565, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f13lambda$1403559565 = ComposableLambdaKt.composableLambdaInstance(-1403559565, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda4
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda__1403559565$lambda$22((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1907182769 = ComposableLambdaKt.composableLambdaInstance(1907182769, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda5
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda_1907182769$lambda$23((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1670609356, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f21lambda$1670609356 = ComposableLambdaKt.composableLambdaInstance(-1670609356, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda6
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda__1670609356$lambda$24((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1520158435, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f15lambda$1520158435 = ComposableLambdaKt.composableLambdaInstance(-1520158435, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda7
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda__1520158435$lambda$25((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$2022662621 = ComposableLambdaKt.composableLambdaInstance(2022662621, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda8
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda_2022662621$lambda$26((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1075279259 = ComposableLambdaKt.composableLambdaInstance(1075279259, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda9
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda_1075279259$lambda$27((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1937659147, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f27lambda$1937659147 = ComposableLambdaKt.composableLambdaInstance(-1937659147, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda10
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda__1937659147$lambda$28((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1373083187 = ComposableLambdaKt.composableLambdaInstance(1373083187, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda12
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda_1373083187$lambda$29((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-104848167, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f6lambda$104848167 = ComposableLambdaKt.composableLambdaInstance(-104848167, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda13
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda__104848167$lambda$30((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1106033396 = ComposableLambdaKt.composableLambdaInstance(1106033396, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda15
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda_1106033396$lambda$31((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1823208567 = ComposableLambdaKt.composableLambdaInstance(1823208567, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda16
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda_1823208567$lambda$32((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$838983605 = ComposableLambdaKt.composableLambdaInstance(838983605, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda17
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda_838983605$lambda$33((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1973659488 = ComposableLambdaKt.composableLambdaInstance(1973659488, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda18
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda_1973659488$lambda$34((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1749750550, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f23lambda$1749750550 = ComposableLambdaKt.composableLambdaInstance(-1749750550, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda19
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$BookDetailsDialogKt.lambda__1749750550$lambda$35((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$38817555 = ComposableLambdaKt.composableLambdaInstance(38817555, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda20
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$BookDetailsDialogKt.lambda_38817555$lambda$36((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$506971822 = ComposableLambdaKt.composableLambdaInstance(506971822, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda21
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda_506971822$lambda$37((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-2069959315, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f31lambda$2069959315 = ComposableLambdaKt.composableLambdaInstance(-2069959315, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda23
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda__2069959315$lambda$38((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1220022506, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f11lambda$1220022506 = ComposableLambdaKt.composableLambdaInstance(-1220022506, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda24
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda__1220022506$lambda$39((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$17787971 = ComposableLambdaKt.composableLambdaInstance(17787971, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda25
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda_17787971$lambda$40((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1076477652, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f7lambda$1076477652 = ComposableLambdaKt.composableLambdaInstance(-1076477652, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda27
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda__1076477652$lambda$41((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$488922089 = ComposableLambdaKt.composableLambdaInstance(488922089, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda28
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda_488922089$lambda$42((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$43348698 = ComposableLambdaKt.composableLambdaInstance(43348698, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda29
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda_43348698$lambda$43((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1407429404 = ComposableLambdaKt.composableLambdaInstance(1407429404, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda30
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda_1407429404$lambda$44((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1130758906, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f9lambda$1130758906 = ComposableLambdaKt.composableLambdaInstance(-1130758906, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda31
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda__1130758906$lambda$45((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1902707556 = ComposableLambdaKt.composableLambdaInstance(1902707556, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda32
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda_1902707556$lambda$46((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-2047292092, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f30lambda$2047292092 = ComposableLambdaKt.composableLambdaInstance(-2047292092, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda34
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda__2047292092$lambda$47((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-2021731365, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f29lambda$2021731365 = ComposableLambdaKt.composableLambdaInstance(-2021731365, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda35
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda__2021731365$lambda$48((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-657650659, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f36lambda$657650659 = ComposableLambdaKt.composableLambdaInstance(-657650659, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda36
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda__657650659$lambda$49((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1790326447, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f24lambda$1790326447 = ComposableLambdaKt.composableLambdaInstance(-1790326447, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda37
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda__1790326447$lambda$50((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1052279610 = ComposableLambdaKt.composableLambdaInstance(1052279610, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda39
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda_1052279610$lambda$51((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-266889585, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f33lambda$266889585 = ComposableLambdaKt.composableLambdaInstance(-266889585, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda40
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda__266889585$lambda$52((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$513318596 = ComposableLambdaKt.composableLambdaInstance(513318596, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda41
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$BookDetailsDialogKt.lambda_513318596$lambda$53((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$208155868 = ComposableLambdaKt.composableLambdaInstance(208155868, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda42
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda_208155868$lambda$54((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1572236574 = ComposableLambdaKt.composableLambdaInstance(1572236574, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda43
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda_1572236574$lambda$55((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1411350804, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f14lambda$1411350804 = ComposableLambdaKt.composableLambdaInstance(-1411350804, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda45
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda__1411350804$lambda$56((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$712292639 = ComposableLambdaKt.composableLambdaInstance(712292639, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda46
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$BookDetailsDialogKt.lambda_712292639$lambda$57((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1258144904 = ComposableLambdaKt.composableLambdaInstance(1258144904, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda47
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$BookDetailsDialogKt.lambda_1258144904$lambda$58((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1655662105, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f19lambda$1655662105 = ComposableLambdaKt.composableLambdaInstance(-1655662105, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda48
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$BookDetailsDialogKt.lambda__1655662105$lambda$59((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1856924195, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f26lambda$1856924195 = ComposableLambdaKt.composableLambdaInstance(-1856924195, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda49
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda__1856924195$lambda$60((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-492843489, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f34lambda$492843489 = ComposableLambdaKt.composableLambdaInstance(-492843489, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda51
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda__492843489$lambda$61((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1625519277, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f18lambda$1625519277 = ComposableLambdaKt.composableLambdaInstance(-1625519277, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda52
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda__1625519277$lambda$62((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-102082415, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f5lambda$102082415 = ComposableLambdaKt.composableLambdaInstance(-102082415, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda53
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda__102082415$lambda$63((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$656063226 = ComposableLambdaKt.composableLambdaInstance(656063226, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda54
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda_656063226$lambda$64((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-2081348678, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f32lambda$2081348678 = ComposableLambdaKt.composableLambdaInstance(-2081348678, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda56
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda__2081348678$lambda$65((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1877443034 = ComposableLambdaKt.composableLambdaInstance(1877443034, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda57
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda_1877443034$lambda$66((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$372963038 = ComposableLambdaKt.composableLambdaInstance(372963038, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda58
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda_372963038$lambda$67((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1737043744 = ComposableLambdaKt.composableLambdaInstance(1737043744, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda59
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda_1737043744$lambda$68((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1545109735, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f17lambda$1545109735 = ComposableLambdaKt.composableLambdaInstance(-1545109735, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda60
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$BookDetailsDialogKt.lambda__1545109735$lambda$70((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-941734853, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f38lambda$941734853 = ComposableLambdaKt.composableLambdaInstance(-941734853, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda61
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$BookDetailsDialogKt.lambda__941734853$lambda$71((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1728767254, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f22lambda$1728767254 = ComposableLambdaKt.composableLambdaInstance(-1728767254, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda63
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$BookDetailsDialogKt.lambda__1728767254$lambda$72((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1196572884, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f10lambda$1196572884 = ComposableLambdaKt.composableLambdaInstance(-1196572884, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt$$ExternalSyntheticLambda64
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BookDetailsDialogKt.lambda__1196572884$lambda$73((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-102082415$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m186getLambda$102082415$app() {
        return f5lambda$102082415;
    }

    /* JADX INFO: renamed from: getLambda$-104848167$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m187getLambda$104848167$app() {
        return f6lambda$104848167;
    }

    /* JADX INFO: renamed from: getLambda$-1076477652$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m188getLambda$1076477652$app() {
        return f7lambda$1076477652;
    }

    /* JADX INFO: renamed from: getLambda$-1090049619$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m189getLambda$1090049619$app() {
        return f8lambda$1090049619;
    }

    /* JADX INFO: renamed from: getLambda$-1130758906$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m190getLambda$1130758906$app() {
        return f9lambda$1130758906;
    }

    /* JADX INFO: renamed from: getLambda$-1196572884$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m191getLambda$1196572884$app() {
        return f10lambda$1196572884;
    }

    /* JADX INFO: renamed from: getLambda$-1220022506$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m192getLambda$1220022506$app() {
        return f11lambda$1220022506;
    }

    /* JADX INFO: renamed from: getLambda$-1232515616$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m193getLambda$1232515616$app() {
        return f12lambda$1232515616;
    }

    /* JADX INFO: renamed from: getLambda$-1403559565$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m194getLambda$1403559565$app() {
        return f13lambda$1403559565;
    }

    /* JADX INFO: renamed from: getLambda$-1411350804$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m195getLambda$1411350804$app() {
        return f14lambda$1411350804;
    }

    /* JADX INFO: renamed from: getLambda$-1520158435$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m196getLambda$1520158435$app() {
        return f15lambda$1520158435;
    }

    /* JADX INFO: renamed from: getLambda$-1522665015$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m197getLambda$1522665015$app() {
        return f16lambda$1522665015;
    }

    /* JADX INFO: renamed from: getLambda$-1545109735$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m198getLambda$1545109735$app() {
        return f17lambda$1545109735;
    }

    /* JADX INFO: renamed from: getLambda$-1625519277$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m199getLambda$1625519277$app() {
        return f18lambda$1625519277;
    }

    /* JADX INFO: renamed from: getLambda$-1655662105$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m200getLambda$1655662105$app() {
        return f19lambda$1655662105;
    }

    /* JADX INFO: renamed from: getLambda$-1666968850$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m201getLambda$1666968850$app() {
        return f20lambda$1666968850;
    }

    /* JADX INFO: renamed from: getLambda$-1670609356$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m202getLambda$1670609356$app() {
        return f21lambda$1670609356;
    }

    /* JADX INFO: renamed from: getLambda$-1728767254$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m203getLambda$1728767254$app() {
        return f22lambda$1728767254;
    }

    /* JADX INFO: renamed from: getLambda$-1749750550$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m204getLambda$1749750550$app() {
        return f23lambda$1749750550;
    }

    /* JADX INFO: renamed from: getLambda$-1790326447$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m205getLambda$1790326447$app() {
        return f24lambda$1790326447;
    }

    /* JADX INFO: renamed from: getLambda$-1821991209$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m206getLambda$1821991209$app() {
        return f25lambda$1821991209;
    }

    /* JADX INFO: renamed from: getLambda$-1856924195$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m207getLambda$1856924195$app() {
        return f26lambda$1856924195;
    }

    /* JADX INFO: renamed from: getLambda$-1937659147$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m208getLambda$1937659147$app() {
        return f27lambda$1937659147;
    }

    /* JADX INFO: renamed from: getLambda$-1961379022$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m209getLambda$1961379022$app() {
        return f28lambda$1961379022;
    }

    /* JADX INFO: renamed from: getLambda$-2021731365$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m210getLambda$2021731365$app() {
        return f29lambda$2021731365;
    }

    /* JADX INFO: renamed from: getLambda$-2047292092$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m211getLambda$2047292092$app() {
        return f30lambda$2047292092;
    }

    /* JADX INFO: renamed from: getLambda$-2069959315$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m212getLambda$2069959315$app() {
        return f31lambda$2069959315;
    }

    /* JADX INFO: renamed from: getLambda$-2081348678$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m213getLambda$2081348678$app() {
        return f32lambda$2081348678;
    }

    /* JADX INFO: renamed from: getLambda$-266889585$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m214getLambda$266889585$app() {
        return f33lambda$266889585;
    }

    /* JADX INFO: renamed from: getLambda$-492843489$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m215getLambda$492843489$app() {
        return f34lambda$492843489;
    }

    /* JADX INFO: renamed from: getLambda$-650591842$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m216getLambda$650591842$app() {
        return f35lambda$650591842;
    }

    /* JADX INFO: renamed from: getLambda$-657650659$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m217getLambda$657650659$app() {
        return f36lambda$657650659;
    }

    /* JADX INFO: renamed from: getLambda$-681887910$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m218getLambda$681887910$app() {
        return f37lambda$681887910;
    }

    /* JADX INFO: renamed from: getLambda$-941734853$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m219getLambda$941734853$app() {
        return f38lambda$941734853;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1052279610$app() {
        return lambda$1052279610;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1075279259$app() {
        return lambda$1075279259;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1106033396$app() {
        return lambda$1106033396;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1204138718$app() {
        return lambda$1204138718;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1258144904$app() {
        return lambda$1258144904;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1373083187$app() {
        return lambda$1373083187;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1407429404$app() {
        return lambda$1407429404;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1572236574$app() {
        return lambda$1572236574;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1614444833$app() {
        return lambda$1614444833;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1639001888$app() {
        return lambda$1639001888;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1737043744$app() {
        return lambda$1737043744;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$17787971$app() {
        return lambda$17787971;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1823208567$app() {
        return lambda$1823208567;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1830029076$app() {
        return lambda$1830029076;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1849759323$app() {
        return lambda$1849759323;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1877443034$app() {
        return lambda$1877443034;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$187965680$app() {
        return lambda$187965680;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1902707556$app() {
        return lambda$1902707556;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1907182769$app() {
        return lambda$1907182769;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1910683885$app() {
        return lambda$1910683885;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1973659488$app() {
        return lambda$1973659488;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$2022662621$app() {
        return lambda$2022662621;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$208155868$app() {
        return lambda$208155868;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$2111266901$app() {
        return lambda$2111266901;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$364292576$app() {
        return lambda$364292576;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$372963038$app() {
        return lambda$372963038;
    }

    public final Function2<Composer, Integer, Unit> getLambda$38817555$app() {
        return lambda$38817555;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$391803308$app() {
        return lambda$391803308;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$43348698$app() {
        return lambda$43348698;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$462677038$app() {
        return lambda$462677038;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$488922089$app() {
        return lambda$488922089;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$506971822$app() {
        return lambda$506971822;
    }

    public final Function2<Composer, Integer, Unit> getLambda$513318596$app() {
        return lambda$513318596;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$61718176$app() {
        return lambda$61718176;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$656063226$app() {
        return lambda$656063226;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$700596995$app() {
        return lambda$700596995;
    }

    public final Function2<Composer, Integer, Unit> getLambda$712292639$app() {
        return lambda$712292639;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$838983605$app() {
        return lambda$838983605;
    }

    static final Unit lambda__650591842$lambda$0(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C148@7058L55:BookDetailsDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-650591842, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$-650591842.<anonymous> (BookDetailsDialog.kt:148)");
            }
            IconKt.Icon-ww6aTOc(CloseKt.getClose(Icons.INSTANCE.getDefault()), "Close", (Modifier) null, 0L, composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1522665015$lambda$2(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C179@8531L756:BookDetailsDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1522665015, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$-1522665015.<anonymous> (BookDetailsDialog.kt:179)");
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
            ComposerKt.sourceInformationMarkerStart(composer, -838988396, "C183@8763L78,184@8878L40,187@9110L10,188@9194L11,185@8955L298:BookDetailsDialog.kt#2thlc2");
            ProgressIndicatorKt.CircularProgressIndicator-LxG7B9w(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(20.0f)), 0L, Dp.constructor-impl(2.0f), 0L, 0, composer, 390, 26);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f)), composer, 6);
            TextKt.Text--4IGK_g("AI is analyzing cover condition and wear...", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 65530);
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

    static final Unit lambda_2111266901$lambda$3(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C245@12556L87,246@12676L39,247@12748L72:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2111266901, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$2111266901.<anonymous> (BookDetailsDialog.kt:245)");
            }
            IconKt.Icon-ww6aTOc(QrCode2Kt.getQrCode2(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(20.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            TextKt.Text--4IGK_g("✅ OK - Show Handover QR Code Now →", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 196614, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1821991209$lambda$4(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C262@13818L32:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1821991209, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$-1821991209.<anonymous> (BookDetailsDialog.kt:262)");
            }
            TextKt.Text--4IGK_g("OK, Save Photo for Later", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1204138718$lambda$5(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C280@14923L87,281@15043L39,282@15115L70:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1204138718, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$1204138718.<anonymous> (BookDetailsDialog.kt:280)");
            }
            IconKt.Icon-ww6aTOc(QrCode2Kt.getQrCode2(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(20.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            TextKt.Text--4IGK_g("✅ OK - Show Return QR Code Now →", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 196614, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_364292576$lambda$6(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C297@16187L29:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(364292576, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$364292576.<anonymous> (BookDetailsDialog.kt:297)");
            }
            TextKt.Text--4IGK_g("OK, Save Return Photo", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1090049619$lambda$7(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$TextButton");
        ComposerKt.sourceInformation(composer, "C444@24545L11,444@24505L69:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1090049619, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$-1090049619.<anonymous> (BookDetailsDialog.kt:444)");
            }
            TextKt.Text--4IGK_g("Skip Scan", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131066);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_61718176$lambda$8(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C453@25121L85,454@25235L39,455@25303L22:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(61718176, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$61718176.<anonymous> (BookDetailsDialog.kt:453)");
            }
            IconKt.Icon-ww6aTOc(CheckKt.getCheck(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            TextKt.Text--4IGK_g("Confirm Return", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1910683885$lambda$9(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$TextButton");
        ComposerKt.sourceInformation(composer, "C507@28074L11,507@28034L69:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1910683885, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$1910683885.<anonymous> (BookDetailsDialog.kt:507)");
            }
            TextKt.Text--4IGK_g("Skip Scan", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131066);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1232515616$lambda$10(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C523@28920L89,524@29038L39,525@29106L17:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1232515616, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$-1232515616.<anonymous> (BookDetailsDialog.kt:523)");
            }
            IconKt.Icon-ww6aTOc(CameraAltKt.getCameraAlt(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            TextKt.Text--4IGK_g("Scan Book", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_462677038$lambda$11(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$TextButton");
        ComposerKt.sourceInformation(composer, "C577@31873L11,577@31833L69:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(462677038, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$462677038.<anonymous> (BookDetailsDialog.kt:577)");
            }
            TextKt.Text--4IGK_g("Skip Scan", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131066);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1614444833$lambda$12(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C593@32713L89,594@32831L39,595@32899L23:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1614444833, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$1614444833.<anonymous> (BookDetailsDialog.kt:593)");
            }
            IconKt.Icon-ww6aTOc(CameraAltKt.getCameraAlt(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            TextKt.Text--4IGK_g("Scan & Transfer", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1639001888$lambda$13(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C740@39219L55:BookDetailsDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1639001888, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$1639001888.<anonymous> (BookDetailsDialog.kt:740)");
            }
            IconKt.Icon-ww6aTOc(CloseKt.getClose(Icons.INSTANCE.getDefault()), "Close", (Modifier) null, 0L, composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__681887910$lambda$14(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C917@49754L90,918@49881L39,919@49957L64:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-681887910, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$-681887910.<anonymous> (BookDetailsDialog.kt:917)");
            }
            IconKt.Icon-ww6aTOc(NavigationKt.getNavigation(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(14.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Navigate", (Modifier) null, 0L, TextUnitKt.getSp(11), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 199686, 0, 131030);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1666968850$lambda$15(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C933@50860L111,934@51000L39,935@51134L10,935@51068L123:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1666968850, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$-1666968850.<anonymous> (BookDetailsDialog.kt:933)");
            }
            IconKt.Icon-ww6aTOc(PlaceKt.getPlace(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), ColorKt.Color(4279994175L), composer, 3504, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextKt.Text--4IGK_g("Suggest & Agree on Safe Meetup Spot", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelMedium(), composer, 196614, 0, 65502);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_700596995$lambda$16(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$FilledTonalButton");
        ComposerKt.sourceInformation(composer, "C1115@61932L90,1116@62067L39,1117@62151L37:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(700596995, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$700596995.<anonymous> (BookDetailsDialog.kt:1115)");
            }
            IconKt.Icon-ww6aTOc(RateReviewKt.getRateReview(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(14.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Rate Lender", (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 3078, 0, 131062);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_391803308$lambda$17(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C1125@62796L11,1125@62678L138,1126@62861L39,1127@62945L41:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(391803308, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$391803308.<anonymous> (BookDetailsDialog.kt:1125)");
            }
            IconKt.Icon-ww6aTOc(ChatKt.getChat(Icons.AutoMirrored.Filled.INSTANCE), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(14.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 432, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Chat with Owner", (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 3078, 0, 131062);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1830029076$lambda$18(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$TextButton");
        ComposerKt.sourceInformation(composer, "C1220@69109L90,1221@69240L39,1222@69320L38:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1830029076, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$1830029076.<anonymous> (BookDetailsDialog.kt:1220)");
            }
            IconKt.Icon-ww6aTOc(RateReviewKt.getRateReview(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(14.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Write Review", (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 3078, 0, 131062);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1849759323$lambda$19(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1232@69964L11,1229@69759L403:BookDetailsDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1849759323, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$1849759323.<anonymous> (BookDetailsDialog.kt:1229)");
            }
            long sp = TextUnitKt.getSp(11);
            TextKt.Text--4IGK_g("Borrow to review", PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(8.0f), Dp.constructor-impl(4.0f)), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, (Object) null), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 3126, 0, 131056);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1961379022$lambda$20(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1308@74578L96,1309@74715L39,1310@74795L23:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1961379022, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$-1961379022.<anonymous> (BookDetailsDialog.kt:1308)");
            }
            IconKt.Icon-ww6aTOc(ChatKt.getChat(Icons.AutoMirrored.Filled.INSTANCE), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextKt.Text--4IGK_g("View Book Chats", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_187965680$lambda$21(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C1320@75419L86,1321@75546L39,1322@75626L14:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(187965680, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$187965680.<anonymous> (BookDetailsDialog.kt:1320)");
            }
            IconKt.Icon-ww6aTOc(DeleteKt.getDelete(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Remove", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1403559565$lambda$22(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1340@76735L91,1341@76871L39,1342@76955L22:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1403559565, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$-1403559565.<anonymous> (BookDetailsDialog.kt:1340)");
            }
            IconKt.Icon-ww6aTOc(CheckCircleKt.getCheckCircle(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Accept Request", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1907182769$lambda$23(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C1352@77619L15:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1907182769, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$1907182769.<anonymous> (BookDetailsDialog.kt:1352)");
            }
            TextKt.Text--4IGK_g("Decline", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1670609356$lambda$24(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1376@79364L89,1377@79498L39,1378@79582L29:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1670609356, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$-1670609356.<anonymous> (BookDetailsDialog.kt:1376)");
            }
            IconKt.Icon-ww6aTOc(CameraAltKt.getCameraAlt(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Step 1: Handover Scan", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1520158435$lambda$25(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1388@80253L87,1389@80385L39,1390@80469L15:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1520158435, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$-1520158435.<anonymous> (BookDetailsDialog.kt:1388)");
            }
            IconKt.Icon-ww6aTOc(QrCode2Kt.getQrCode2(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(3.0f)), composer, 6);
            TextKt.Text--4IGK_g("Show QR", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_2022662621$lambda$26(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1399@81183L96,1400@81324L39,1401@81408L22:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2022662621, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$2022662621.<anonymous> (BookDetailsDialog.kt:1399)");
            }
            IconKt.Icon-ww6aTOc(ChatKt.getChat(Icons.AutoMirrored.Filled.INSTANCE), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Chat Requester", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1075279259$lambda$27(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C1411@82109L11,1411@82072L55:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1075279259, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$1075279259.<anonymous> (BookDetailsDialog.kt:1411)");
            }
            TextKt.Text--4IGK_g("Cancel", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131066);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1937659147$lambda$28(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1426@83046L93,1427@83184L39,1428@83268L23:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1937659147, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$-1937659147.<anonymous> (BookDetailsDialog.kt:1426)");
            }
            IconKt.Icon-ww6aTOc(QrCodeScannerKt.getQrCodeScanner(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Step 2: Scan QR", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1373083187$lambda$29(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C1438@83970L11,1438@83933L55:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1373083187, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$1373083187.<anonymous> (BookDetailsDialog.kt:1438)");
            }
            TextKt.Text--4IGK_g("Cancel", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131066);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__104848167$lambda$30(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1446@84535L96,1447@84672L39,1448@84752L27:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-104848167, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$-104848167.<anonymous> (BookDetailsDialog.kt:1446)");
            }
            IconKt.Icon-ww6aTOc(ChatKt.getChat(Icons.AutoMirrored.Filled.INSTANCE), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextKt.Text--4IGK_g("Chat with Requester", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1106033396$lambda$31(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C1471@86415L93,1472@86553L39,1473@86637L19:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1106033396, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$1106033396.<anonymous> (BookDetailsDialog.kt:1471)");
            }
            IconKt.Icon-ww6aTOc(QrCodeScannerKt.getQrCodeScanner(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Scan Return", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1823208567$lambda$32(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1515@89844L87,1516@89976L39,1517@90098L10,1517@90060L60:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1823208567, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$1823208567.<anonymous> (BookDetailsDialog.kt:1515)");
            }
            IconKt.Icon-ww6aTOc(QrCode2Kt.getQrCode2(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(3.0f)), composer, 6);
            TextKt.Text--4IGK_g("Show QR", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 6, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_838983605$lambda$33(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C1526@90635L93,1527@90773L39,1528@90895L10,1528@90857L60:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(838983605, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$838983605.<anonymous> (BookDetailsDialog.kt:1526)");
            }
            IconKt.Icon-ww6aTOc(QrCodeScannerKt.getQrCodeScanner(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(3.0f)), composer, 6);
            TextKt.Text--4IGK_g("Scan QR", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 6, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1973659488$lambda$34(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1535@91374L91,1536@91510L39,1537@91631L10,1537@91594L59:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1973659488, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$1973659488.<anonymous> (BookDetailsDialog.kt:1535)");
            }
            IconKt.Icon-ww6aTOc(CheckCircleKt.getCheckCircle(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(3.0f)), composer, 6);
            TextKt.Text--4IGK_g("Accept", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 6, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1749750550$lambda$35(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1543@92117L11,1543@92027L111:BookDetailsDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1749750550, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$-1749750550.<anonymous> (BookDetailsDialog.kt:1543)");
            }
            IconKt.Icon-ww6aTOc(RateReviewKt.getRateReview(Icons.INSTANCE.getDefault()), "Rate Borrower", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getTertiary-0d7_KjU(), composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_38817555$lambda$36(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1546@92388L11,1546@92301L107:BookDetailsDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(38817555, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$38817555.<anonymous> (BookDetailsDialog.kt:1546)");
            }
            IconKt.Icon-ww6aTOc(ChatKt.getChat(Icons.AutoMirrored.Filled.INSTANCE), "Chat", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_506971822$lambda$37(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$TextButton");
        ComposerKt.sourceInformation(composer, "C1564@93813L87,1565@93941L39,1566@94021L51:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(506971822, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$506971822.<anonymous> (BookDetailsDialog.kt:1564)");
            }
            IconKt.Icon-ww6aTOc(WarningKt.getWarning(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Report Overdue/Stolen (Wipe Borrower Trust)", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__2069959315$lambda$38(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1583@94893L25:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2069959315, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$-2069959315.<anonymous> (BookDetailsDialog.kt:1583)");
            }
            TextKt.Text--4IGK_g("Request to Borrow", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1220022506$lambda$39(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1590@95391L96,1591@95524L39,1592@95600L12:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1220022506, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$-1220022506.<anonymous> (BookDetailsDialog.kt:1590)");
            }
            IconKt.Icon-ww6aTOc(ChatKt.getChat(Icons.AutoMirrored.Filled.INSTANCE), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Chat", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_17787971$lambda$40(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C1603@96237L17:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(17787971, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$17787971.<anonymous> (BookDetailsDialog.kt:1603)");
            }
            TextKt.Text--4IGK_g("Requested", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1076477652$lambda$41(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C1613@96938L11,1613@96901L55:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1076477652, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$-1076477652.<anonymous> (BookDetailsDialog.kt:1613)");
            }
            TextKt.Text--4IGK_g("Cancel", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131066);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_488922089$lambda$42(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1620@97306L96,1621@97443L39,1622@97523L12:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(488922089, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$488922089.<anonymous> (BookDetailsDialog.kt:1620)");
            }
            IconKt.Icon-ww6aTOc(ChatKt.getChat(Icons.AutoMirrored.Filled.INSTANCE), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Chat", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_43348698$lambda$43(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C1631@98083L17:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(43348698, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$43348698.<anonymous> (BookDetailsDialog.kt:1631)");
            }
            TextKt.Text--4IGK_g("Requested", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1407429404$lambda$44(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1637@98421L96,1638@98562L39,1639@98646L18:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1407429404, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$1407429404.<anonymous> (BookDetailsDialog.kt:1637)");
            }
            IconKt.Icon-ww6aTOc(ChatKt.getChat(Icons.AutoMirrored.Filled.INSTANCE), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Chat Owner", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1130758906$lambda$45(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1654@99440L63,1655@99548L39,1656@99632L18:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1130758906, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$-1130758906.<anonymous> (BookDetailsDialog.kt:1654)");
            }
            IconKt.Icon-ww6aTOc(ChatKt.getChat(Icons.AutoMirrored.Filled.INSTANCE), (String) null, (Modifier) null, 0L, composer, 48, 12);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextKt.Text--4IGK_g("Chat Owner", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1902707556$lambda$46(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$FilledTonalButton");
        ComposerKt.sourceInformation(composer, "C1662@100109L85,1663@100239L39,1664@100323L17:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1902707556, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$1902707556.<anonymous> (BookDetailsDialog.kt:1662)");
            }
            IconKt.Icon-ww6aTOc(PlaceKt.getPlace(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Safe Spot", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__2047292092$lambda$47(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C1673@100948L11,1673@100911L55:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2047292092, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$-2047292092.<anonymous> (BookDetailsDialog.kt:1673)");
            }
            TextKt.Text--4IGK_g("Cancel", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131066);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__2021731365$lambda$48(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C1683@101556L16:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2021731365, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$-2021731365.<anonymous> (BookDetailsDialog.kt:1683)");
            }
            TextKt.Text--4IGK_g("Reserved", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__657650659$lambda$49(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1689@101893L96,1690@102034L39,1691@102118L18:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-657650659, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$-657650659.<anonymous> (BookDetailsDialog.kt:1689)");
            }
            IconKt.Icon-ww6aTOc(ChatKt.getChat(Icons.AutoMirrored.Filled.INSTANCE), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Chat Owner", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1790326447$lambda$50(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1739@105912L54,1740@106015L39,1741@106103L23:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1790326447, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$-1790326447.<anonymous> (BookDetailsDialog.kt:1739)");
            }
            IconKt.Icon-ww6aTOc(QrCode2Kt.getQrCode2(Icons.INSTANCE.getDefault()), (String) null, (Modifier) null, 0L, composer, 48, 12);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Step 2: Show QR", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1052279610$lambda$51(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1752@106966L58,1753@107073L39,1754@107161L22:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1052279610, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$1052279610.<anonymous> (BookDetailsDialog.kt:1752)");
            }
            IconKt.Icon-ww6aTOc(CheckCircleKt.getCheckCircle(Icons.INSTANCE.getDefault()), (String) null, (Modifier) null, 0L, composer, 48, 12);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Step 3: Accept", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__266889585$lambda$52(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C1763@107822L11,1763@107785L55:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-266889585, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$-266889585.<anonymous> (BookDetailsDialog.kt:1763)");
            }
            TextKt.Text--4IGK_g("Cancel", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131066);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_513318596$lambda$53(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1766@108015L65:BookDetailsDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(513318596, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$513318596.<anonymous> (BookDetailsDialog.kt:1766)");
            }
            IconKt.Icon-ww6aTOc(ChatKt.getChat(Icons.AutoMirrored.Filled.INSTANCE), "Chat", (Modifier) null, 0L, composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_208155868$lambda$54(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C1777@108716L20:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(208155868, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$208155868.<anonymous> (BookDetailsDialog.kt:1777)");
            }
            TextKt.Text--4IGK_g("Transferring", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1572236574$lambda$55(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1783@109057L96,1784@109198L39,1785@109282L18:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1572236574, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$1572236574.<anonymous> (BookDetailsDialog.kt:1783)");
            }
            IconKt.Icon-ww6aTOc(ChatKt.getChat(Icons.AutoMirrored.Filled.INSTANCE), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Chat Owner", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1411350804$lambda$56(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1800@110112L56,1801@110209L39,1802@110289L27:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1411350804, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$-1411350804.<anonymous> (BookDetailsDialog.kt:1800)");
            }
            IconKt.Icon-ww6aTOc(CameraAltKt.getCameraAlt(Icons.INSTANCE.getDefault()), (String) null, (Modifier) null, 0L, composer, 48, 12);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextKt.Text--4IGK_g("Step 1: Return Scan", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_712292639$lambda$57(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1805@110554L11,1805@110467L107:BookDetailsDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(712292639, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$712292639.<anonymous> (BookDetailsDialog.kt:1805)");
            }
            IconKt.Icon-ww6aTOc(ChatKt.getChat(Icons.AutoMirrored.Filled.INSTANCE), "Chat", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1258144904$lambda$58(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1808@110842L11,1808@110751L111:BookDetailsDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1258144904, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$1258144904.<anonymous> (BookDetailsDialog.kt:1808)");
            }
            IconKt.Icon-ww6aTOc(BookmarkKt.getBookmark(Icons.INSTANCE.getDefault()), "Reading Bookmark", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1655662105$lambda$59(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1814@111316L11,1814@111221L117:BookDetailsDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1655662105, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$-1655662105.<anonymous> (BookDetailsDialog.kt:1814)");
            }
            IconKt.Icon-ww6aTOc(RateReviewKt.getRateReview(Icons.INSTANCE.getDefault()), "Rate Book & Lender", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSecondary-0d7_KjU(), composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1856924195$lambda$60(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C1823@111886L16:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1856924195, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$-1856924195.<anonymous> (BookDetailsDialog.kt:1823)");
            }
            TextKt.Text--4IGK_g("Borrowed", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__492843489$lambda$61(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1829@112223L96,1830@112364L39,1831@112448L18:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-492843489, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$-492843489.<anonymous> (BookDetailsDialog.kt:1829)");
            }
            IconKt.Icon-ww6aTOc(ChatKt.getChat(Icons.AutoMirrored.Filled.INSTANCE), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Chat Owner", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1625519277$lambda$62(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1848@113557L93,1849@113699L39,1850@113825L10,1850@113787L60:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1625519277, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$-1625519277.<anonymous> (BookDetailsDialog.kt:1848)");
            }
            IconKt.Icon-ww6aTOc(QrCodeScannerKt.getQrCodeScanner(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Scan QR", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 6, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__102082415$lambda$63(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C1859@114398L87,1860@114534L39,1861@114660L10,1861@114622L60:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-102082415, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$-102082415.<anonymous> (BookDetailsDialog.kt:1859)");
            }
            IconKt.Icon-ww6aTOc(QrCode2Kt.getQrCode2(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Show QR", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 6, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_656063226$lambda$64(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C1871@115399L11,1871@115440L10,1871@115362L100:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(656063226, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$656063226.<anonymous> (BookDetailsDialog.kt:1871)");
            }
            TextKt.Text--4IGK_g("Cancel", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 6, 0, 65530);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__2081348678$lambda$65(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C1883@116202L63,1884@116314L39,1885@116402L12:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2081348678, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$-2081348678.<anonymous> (BookDetailsDialog.kt:1883)");
            }
            IconKt.Icon-ww6aTOc(ChatKt.getChat(Icons.AutoMirrored.Filled.INSTANCE), (String) null, (Modifier) null, 0L, composer, 48, 12);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Chat", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1877443034$lambda$66(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$FilledTonalButton");
        ComposerKt.sourceInformation(composer, "C1894@117016L90,1895@117155L39,1896@117243L12:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1877443034, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$1877443034.<anonymous> (BookDetailsDialog.kt:1894)");
            }
            IconKt.Icon-ww6aTOc(RateReviewKt.getRateReview(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Rate", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_372963038$lambda$67(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C1907@117891L24:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(372963038, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$372963038.<anonymous> (BookDetailsDialog.kt:1907)");
            }
            TextKt.Text--4IGK_g("Return Initiated", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1737043744$lambda$68(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1913@118236L96,1914@118377L39,1915@118461L18:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1737043744, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$1737043744.<anonymous> (BookDetailsDialog.kt:1913)");
            }
            IconKt.Icon-ww6aTOc(ChatKt.getChat(Icons.AutoMirrored.Filled.INSTANCE), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Chat Owner", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1545109735$lambda$70(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2000@121454L397:BookDetailsDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1545109735, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$-1545109735.<anonymous> (BookDetailsDialog.kt:2000)");
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
            ComposerKt.sourceInformationMarkerStart(composer, 325384992, "C2001@121529L292:BookDetailsDialog.kt#2thlc2");
            IconKt.Icon-ww6aTOc(VerifiedKt.getVerified(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(20.0f)), ColorKt.Color(4279994175L), composer, 3504, 0);
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

    static final Unit lambda__941734853$lambda$71(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2035@123218L11,2032@123056L277:BookDetailsDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-941734853, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$-941734853.<anonymous> (BookDetailsDialog.kt:2032)");
            }
            IconKt.Icon-ww6aTOc(CloseKt.getClose(Icons.INSTANCE.getDefault()), "Close", SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(20.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1728767254$lambda$72(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C:BookDetailsDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1728767254, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$-1728767254.<anonymous> (BookDetailsDialog.kt:2049)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1196572884$lambda$73(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C2278@136444L74:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1196572884, i, -1, "com.example.ui.screens.ComposableSingletons$BookDetailsDialogKt.lambda$-1196572884.<anonymous> (BookDetailsDialog.kt:2278)");
            }
            TextKt.Text--4IGK_g("Done Inspecting", (Modifier) null, Color.Companion.getWhite-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 196998, 0, 131034);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
