package com.example.ui.screens;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.material.icons.filled.BookKt;
import androidx.compose.material.icons.filled.CameraAltKt;
import androidx.compose.material.icons.filled.CheckCircleKt;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.material.icons.filled.DateRangeKt;
import androidx.compose.material.icons.filled.GppGoodKt;
import androidx.compose.material.icons.filled.InfoKt;
import androidx.compose.material.icons.filled.NavigationKt;
import androidx.compose.material.icons.filled.PlaceKt;
import androidx.compose.material.icons.filled.QrCode2Kt;
import androidx.compose.material.icons.filled.QrCodeScannerKt;
import androidx.compose.material.icons.filled.SearchKt;
import androidx.compose.material.icons.filled.SecurityKt;
import androidx.compose.material.icons.filled.WarningKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
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

/* JADX INFO: compiled from: ChatScreen.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class ComposableSingletons$ChatScreenKt {
    public static final ComposableSingletons$ChatScreenKt INSTANCE = new ComposableSingletons$ChatScreenKt();
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1397593611 = ComposableLambdaKt.composableLambdaInstance(1397593611, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda0
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda_1397593611$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-91579490, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f83lambda$91579490 = ComposableLambdaKt.composableLambdaInstance(-91579490, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatScreenKt.lambda__91579490$lambda$1((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1702605855 = ComposableLambdaKt.composableLambdaInstance(1702605855, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda14
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatScreenKt.lambda_1702605855$lambda$2((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-375988239, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f78lambda$375988239 = ComposableLambdaKt.composableLambdaInstance(-375988239, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda26
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatScreenKt.lambda__375988239$lambda$4((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-798176096, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f80lambda$798176096 = ComposableLambdaKt.composableLambdaInstance(-798176096, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda38
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatScreenKt.lambda__798176096$lambda$7((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1620397620 = ComposableLambdaKt.composableLambdaInstance(1620397620, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda43
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda_1620397620$lambda$8((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$749157127 = ComposableLambdaKt.composableLambdaInstance(749157127, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda45
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatScreenKt.lambda_749157127$lambda$9((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1615579320, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f68lambda$1615579320 = ComposableLambdaKt.composableLambdaInstance(-1615579320, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda46
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatScreenKt.lambda__1615579320$lambda$10((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-132722667, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f64lambda$132722667 = ComposableLambdaKt.composableLambdaInstance(-132722667, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda47
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatScreenKt.lambda__132722667$lambda$11((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$133534666 = ComposableLambdaKt.composableLambdaInstance(133534666, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda48
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatScreenKt.lambda_133534666$lambda$13((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$2062379198 = ComposableLambdaKt.composableLambdaInstance(2062379198, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda11
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda_2062379198$lambda$14((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1369637244 = ComposableLambdaKt.composableLambdaInstance(1369637244, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda22
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda_1369637244$lambda$15((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$98330325 = ComposableLambdaKt.composableLambdaInstance(98330325, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda33
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda_98330325$lambda$16((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1643976467 = ComposableLambdaKt.composableLambdaInstance(1643976467, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda44
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda_1643976467$lambda$17((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1147841043, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f62lambda$1147841043 = ComposableLambdaKt.composableLambdaInstance(-1147841043, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda49
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatScreenKt.lambda__1147841043$lambda$18((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1689933951, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f69lambda$1689933951 = ComposableLambdaKt.composableLambdaInstance(-1689933951, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda50
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatScreenKt.lambda__1689933951$lambda$19((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1384510939, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f65lambda$1384510939 = ComposableLambdaKt.composableLambdaInstance(-1384510939, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda51
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatScreenKt.lambda__1384510939$lambda$20((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-340319957, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f77lambda$340319957 = ComposableLambdaKt.composableLambdaInstance(-340319957, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda52
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatScreenKt.lambda__340319957$lambda$22((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-333450478, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f76lambda$333450478 = ComposableLambdaKt.composableLambdaInstance(-333450478, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda53
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatScreenKt.lambda__333450478$lambda$24((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1240121655, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f63lambda$1240121655 = ComposableLambdaKt.composableLambdaInstance(-1240121655, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda1
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda__1240121655$lambda$25((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1316021119 = ComposableLambdaKt.composableLambdaInstance(1316021119, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda3
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatScreenKt.lambda_1316021119$lambda$27((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$648401269 = ComposableLambdaKt.composableLambdaInstance(648401269, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda4
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda_648401269$lambda$28((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$176807091 = ComposableLambdaKt.composableLambdaInstance(176807091, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda5
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda_176807091$lambda$29((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$707411071 = ComposableLambdaKt.composableLambdaInstance(707411071, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda6
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatScreenKt.lambda_707411071$lambda$31((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$196675702 = ComposableLambdaKt.composableLambdaInstance(196675702, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda7
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatScreenKt.lambda_196675702$lambda$32((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1976948901, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f73lambda$1976948901 = ComposableLambdaKt.composableLambdaInstance(-1976948901, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda8
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatScreenKt.lambda__1976948901$lambda$33((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-513478590, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f79lambda$513478590 = ComposableLambdaKt.composableLambdaInstance(-513478590, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda9
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda__513478590$lambda$34((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1951141504 = ComposableLambdaKt.composableLambdaInstance(1951141504, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda10
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda_1951141504$lambda$35((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$710772658 = ComposableLambdaKt.composableLambdaInstance(710772658, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda12
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatScreenKt.lambda_710772658$lambda$36((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1499449026 = ComposableLambdaKt.composableLambdaInstance(1499449026, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda13
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda_1499449026$lambda$37((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-821782400, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f81lambda$821782400 = ComposableLambdaKt.composableLambdaInstance(-821782400, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda15
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda__821782400$lambda$38((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1762353324, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f70lambda$1762353324 = ComposableLambdaKt.composableLambdaInstance(-1762353324, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda16
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatScreenKt.lambda__1762353324$lambda$40((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1871148776 = ComposableLambdaKt.composableLambdaInstance(1871148776, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda17
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatScreenKt.lambda_1871148776$lambda$41((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$741323677 = ComposableLambdaKt.composableLambdaInstance(741323677, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda18
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda_741323677$lambda$42((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$2055182960 = ComposableLambdaKt.composableLambdaInstance(2055182960, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda19
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda_2055182960$lambda$43((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1141455677, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f61lambda$1141455677 = ComposableLambdaKt.composableLambdaInstance(-1141455677, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda20
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda__1141455677$lambda$44((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1880564095, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f71lambda$1880564095 = ComposableLambdaKt.composableLambdaInstance(-1880564095, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda21
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda__1880564095$lambda$45((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1015662020, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f58lambda$1015662020 = ComposableLambdaKt.composableLambdaInstance(-1015662020, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda23
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda__1015662020$lambda$46((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1090770684, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f60lambda$1090770684 = ComposableLambdaKt.composableLambdaInstance(-1090770684, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda24
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda__1090770684$lambda$47((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-240833875, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f74lambda$240833875 = ComposableLambdaKt.composableLambdaInstance(-240833875, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda25
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda__240833875$lambda$48((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-26156037, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f75lambda$26156037 = ComposableLambdaKt.composableLambdaInstance(-26156037, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda27
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda__26156037$lambda$49((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$719331172 = ComposableLambdaKt.composableLambdaInstance(719331172, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda28
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda_719331172$lambda$50((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1040085691, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f59lambda$1040085691 = ComposableLambdaKt.composableLambdaInstance(-1040085691, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda29
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda__1040085691$lambda$51((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-190148882, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f72lambda$190148882 = ComposableLambdaKt.composableLambdaInstance(-190148882, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda30
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda__190148882$lambda$52((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$24528956 = ComposableLambdaKt.composableLambdaInstance(24528956, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda31
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda_24528956$lambda$53((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$770016165 = ComposableLambdaKt.composableLambdaInstance(770016165, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda32
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda_770016165$lambda$54((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-989400698, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f85lambda$989400698 = ComposableLambdaKt.composableLambdaInstance(-989400698, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda34
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda__989400698$lambda$55((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-139463889, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f66lambda$139463889 = ComposableLambdaKt.composableLambdaInstance(-139463889, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda35
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda__139463889$lambda$56((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$75213949 = ComposableLambdaKt.composableLambdaInstance(75213949, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda36
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda_75213949$lambda$57((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$820701158 = ComposableLambdaKt.composableLambdaInstance(820701158, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda37
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda_820701158$lambda$58((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-938715705, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f84lambda$938715705 = ComposableLambdaKt.composableLambdaInstance(-938715705, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda39
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda__938715705$lambda$59((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-88778896, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f82lambda$88778896 = ComposableLambdaKt.composableLambdaInstance(-88778896, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda40
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda__88778896$lambda$60((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$125898942 = ComposableLambdaKt.composableLambdaInstance(125898942, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda41
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda_125898942$lambda$61((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1487686916, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f67lambda$1487686916 = ComposableLambdaKt.composableLambdaInstance(-1487686916, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ChatScreenKt$$ExternalSyntheticLambda42
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatScreenKt.lambda__1487686916$lambda$62((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-1015662020$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m239getLambda$1015662020$app() {
        return f58lambda$1015662020;
    }

    /* JADX INFO: renamed from: getLambda$-1040085691$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m240getLambda$1040085691$app() {
        return f59lambda$1040085691;
    }

    /* JADX INFO: renamed from: getLambda$-1090770684$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m241getLambda$1090770684$app() {
        return f60lambda$1090770684;
    }

    /* JADX INFO: renamed from: getLambda$-1141455677$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m242getLambda$1141455677$app() {
        return f61lambda$1141455677;
    }

    /* JADX INFO: renamed from: getLambda$-1147841043$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m243getLambda$1147841043$app() {
        return f62lambda$1147841043;
    }

    /* JADX INFO: renamed from: getLambda$-1240121655$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m244getLambda$1240121655$app() {
        return f63lambda$1240121655;
    }

    /* JADX INFO: renamed from: getLambda$-132722667$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m245getLambda$132722667$app() {
        return f64lambda$132722667;
    }

    /* JADX INFO: renamed from: getLambda$-1384510939$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m246getLambda$1384510939$app() {
        return f65lambda$1384510939;
    }

    /* JADX INFO: renamed from: getLambda$-139463889$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m247getLambda$139463889$app() {
        return f66lambda$139463889;
    }

    /* JADX INFO: renamed from: getLambda$-1487686916$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m248getLambda$1487686916$app() {
        return f67lambda$1487686916;
    }

    /* JADX INFO: renamed from: getLambda$-1615579320$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m249getLambda$1615579320$app() {
        return f68lambda$1615579320;
    }

    /* JADX INFO: renamed from: getLambda$-1689933951$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m250getLambda$1689933951$app() {
        return f69lambda$1689933951;
    }

    /* JADX INFO: renamed from: getLambda$-1762353324$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m251getLambda$1762353324$app() {
        return f70lambda$1762353324;
    }

    /* JADX INFO: renamed from: getLambda$-1880564095$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m252getLambda$1880564095$app() {
        return f71lambda$1880564095;
    }

    /* JADX INFO: renamed from: getLambda$-190148882$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m253getLambda$190148882$app() {
        return f72lambda$190148882;
    }

    /* JADX INFO: renamed from: getLambda$-1976948901$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m254getLambda$1976948901$app() {
        return f73lambda$1976948901;
    }

    /* JADX INFO: renamed from: getLambda$-240833875$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m255getLambda$240833875$app() {
        return f74lambda$240833875;
    }

    /* JADX INFO: renamed from: getLambda$-26156037$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m256getLambda$26156037$app() {
        return f75lambda$26156037;
    }

    /* JADX INFO: renamed from: getLambda$-333450478$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m257getLambda$333450478$app() {
        return f76lambda$333450478;
    }

    /* JADX INFO: renamed from: getLambda$-340319957$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m258getLambda$340319957$app() {
        return f77lambda$340319957;
    }

    /* JADX INFO: renamed from: getLambda$-375988239$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m259getLambda$375988239$app() {
        return f78lambda$375988239;
    }

    /* JADX INFO: renamed from: getLambda$-513478590$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m260getLambda$513478590$app() {
        return f79lambda$513478590;
    }

    /* JADX INFO: renamed from: getLambda$-798176096$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m261getLambda$798176096$app() {
        return f80lambda$798176096;
    }

    /* JADX INFO: renamed from: getLambda$-821782400$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m262getLambda$821782400$app() {
        return f81lambda$821782400;
    }

    /* JADX INFO: renamed from: getLambda$-88778896$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m263getLambda$88778896$app() {
        return f82lambda$88778896;
    }

    /* JADX INFO: renamed from: getLambda$-91579490$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m264getLambda$91579490$app() {
        return f83lambda$91579490;
    }

    /* JADX INFO: renamed from: getLambda$-938715705$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m265getLambda$938715705$app() {
        return f84lambda$938715705;
    }

    /* JADX INFO: renamed from: getLambda$-989400698$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m266getLambda$989400698$app() {
        return f85lambda$989400698;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$125898942$app() {
        return lambda$125898942;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1316021119$app() {
        return lambda$1316021119;
    }

    public final Function2<Composer, Integer, Unit> getLambda$133534666$app() {
        return lambda$133534666;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1369637244$app() {
        return lambda$1369637244;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1397593611$app() {
        return lambda$1397593611;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1499449026$app() {
        return lambda$1499449026;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1620397620$app() {
        return lambda$1620397620;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1643976467$app() {
        return lambda$1643976467;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1702605855$app() {
        return lambda$1702605855;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$176807091$app() {
        return lambda$176807091;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1871148776$app() {
        return lambda$1871148776;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1951141504$app() {
        return lambda$1951141504;
    }

    public final Function2<Composer, Integer, Unit> getLambda$196675702$app() {
        return lambda$196675702;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$2055182960$app() {
        return lambda$2055182960;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$2062379198$app() {
        return lambda$2062379198;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$24528956$app() {
        return lambda$24528956;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$648401269$app() {
        return lambda$648401269;
    }

    public final Function2<Composer, Integer, Unit> getLambda$707411071$app() {
        return lambda$707411071;
    }

    public final Function2<Composer, Integer, Unit> getLambda$710772658$app() {
        return lambda$710772658;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$719331172$app() {
        return lambda$719331172;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$741323677$app() {
        return lambda$741323677;
    }

    public final Function2<Composer, Integer, Unit> getLambda$749157127$app() {
        return lambda$749157127;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$75213949$app() {
        return lambda$75213949;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$770016165$app() {
        return lambda$770016165;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$820701158$app() {
        return lambda$820701158;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$98330325$app() {
        return lambda$98330325;
    }

    static final Unit lambda__91579490$lambda$1(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C260@11408L11,257@11262L236:ChatScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-91579490, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$-91579490.<anonymous> (ChatScreen.kt:257)");
            }
            IconKt.Icon-ww6aTOc(SecurityKt.getSecurity(Icons.INSTANCE.getDefault()), "Security", SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(36.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1702605855$lambda$2(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C268@11706L10,265@11552L193:ChatScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1702605855, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$1702605855.<anonymous> (ChatScreen.kt:265)");
            }
            TextKt.Text--4IGK_g("Community Chat Guidelines", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleLarge(), composer, 196614, 0, 65502);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__798176096$lambda$7(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C272@11798L2332:ChatScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-798176096, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$-798176096.<anonymous> (ChatScreen.kt:272)");
            }
            Arrangement.Vertical vertical = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(10.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier = Modifier.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(vertical, Alignment.Companion.getStart(), composer, 6);
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
            ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -2054281101, "C275@12045L10,276@12114L11,273@11878L286,280@12261L11,279@12206L963,292@13191L921:ChatScreen.kt#2thlc2");
            TextKt.Text--4IGK_g("To ensure a safe and friendly book-sharing community, please follow these rules:", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 6, 0, 65530);
            long j = Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
            SurfaceKt.Surface-T9BRK9s(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(8.0f)), j, 0L, 0.0f, 0.0f, (BorderStroke) null, f78lambda$375988239, composer, 12582918, 120);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
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
            ComposerKt.sourceInformationMarkerStart(composer, -5829090, "C296@13375L264,302@13664L39,305@13926L10,303@13728L362:ChatScreen.kt#2thlc2");
            IconKt.Icon-ww6aTOc(GppGoodKt.getGppGood(Icons.INSTANCE.getDefault()), "AI Moderation", SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(20.0f)), ColorKt.Color(4279994175L), composer, 3504, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextKt.Text--4IGK_g("AI Real-Time Safety Active: Inappropriate messages are blocked and result in a -10 Trust Score penalty.", (Modifier) null, ColorKt.Color(4279994175L), 0L, (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 196998, 0, 65498);
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

    static final Unit lambda__375988239$lambda$4(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C284@12473L674:ChatScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-375988239, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$-375988239.<anonymous> (ChatScreen.kt:284)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f));
            Arrangement.Vertical vertical = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(6.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(vertical, Alignment.Companion.getStart(), composer, 6);
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
            ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1865791803, "C285@12682L10,285@12596L107,286@12820L10,286@12732L109,287@12958L10,287@12870L109,288@13100L10,288@13008L113:ChatScreen.kt#2thlc2");
            TextKt.Text--4IGK_g("1. Respect fellow readers and keep conversation polite.", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 65534);
            TextKt.Text--4IGK_g("2. Only arrange book pickups, returns & exchange details.", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 65534);
            TextKt.Text--4IGK_g("3. Never ask for bank account details, OTP, or passwords.", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 65534);
            TextKt.Text--4IGK_g("4. No profanity, harassment, hate speech, or commercial spam.", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 65534);
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

    static final Unit lambda_1397593611$lambda$0(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C320@14490L29:ChatScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1397593611, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$1397593611.<anonymous> (ChatScreen.kt:320)");
            }
            TextKt.Text--4IGK_g("I Understand & Accept", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_749157127$lambda$9(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C334@14904L11,331@14752L240:ChatScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(749157127, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$749157127.<anonymous> (ChatScreen.kt:331)");
            }
            IconKt.Icon-ww6aTOc(WarningKt.getWarning(Icons.INSTANCE.getDefault()), "Violation Alert", SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(40.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU(), composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1615579320$lambda$10(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C342@15203L11,343@15264L10,339@15046L257:ChatScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1615579320, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$-1615579320.<anonymous> (ChatScreen.kt:339)");
            }
            TextKt.Text--4IGK_g("Message Blocked by AI Safety", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleLarge(), composer, 196614, 0, 65498);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1620397620$lambda$8(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C378@16953L20:ChatScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1620397620, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$1620397620.<anonymous> (ChatScreen.kt:378)");
            }
            TextKt.Text--4IGK_g("I Understand", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__132722667$lambda$11(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C496@21847L55:ChatScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-132722667, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$-132722667.<anonymous> (ChatScreen.kt:496)");
            }
            IconKt.Icon-ww6aTOc(CloseKt.getClose(Icons.INSTANCE.getDefault()), "Close", (Modifier) null, 0L, composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_133534666$lambda$13(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C527@23320L756:ChatScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(133534666, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$133534666.<anonymous> (ChatScreen.kt:527)");
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
            ComposerKt.sourceInformationMarkerStart(composer, 666124203, "C531@23552L78,532@23667L40,535@23899L10,536@23983L11,533@23744L298:ChatScreen.kt#2thlc2");
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

    static final Unit lambda_2062379198$lambda$14(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C593@27345L87,594@27465L39,595@27537L72:ChatScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2062379198, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$2062379198.<anonymous> (ChatScreen.kt:593)");
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

    static final Unit lambda_1369637244$lambda$15(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C610@28577L32:ChatScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1369637244, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$1369637244.<anonymous> (ChatScreen.kt:610)");
            }
            TextKt.Text--4IGK_g("OK, Save Photo for Later", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_98330325$lambda$16(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C628@29682L87,629@29802L39,630@29874L70:ChatScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(98330325, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$98330325.<anonymous> (ChatScreen.kt:628)");
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

    static final Unit lambda_1643976467$lambda$17(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C645@30916L29:ChatScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1643976467, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$1643976467.<anonymous> (ChatScreen.kt:645)");
            }
            TextKt.Text--4IGK_g("OK, Save Return Photo", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1147841043$lambda$18(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C710@34252L70:ChatScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1147841043, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$-1147841043.<anonymous> (ChatScreen.kt:710)");
            }
            IconKt.Icon-ww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE), "Back", (Modifier) null, 0L, composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1689933951$lambda$19(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C733@35638L93:ChatScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1689933951, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$-1689933951.<anonymous> (ChatScreen.kt:733)");
            }
            IconKt.Icon-ww6aTOc(PlaceKt.getPlace(Icons.INSTANCE.getDefault()), "Safe Meetup Spots", (Modifier) null, ColorKt.Color(4279994175L), composer, 3120, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1384510939$lambda$20(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C757@37190L11,757@37104L106:ChatScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1384510939, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$-1384510939.<anonymous> (ChatScreen.kt:757)");
            }
            IconKt.Icon-ww6aTOc(InfoKt.getInfo(Icons.INSTANCE.getDefault()), "Chat Guidelines", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__340319957$lambda$22(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C815@39978L460:ChatScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-340319957, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$-340319957.<anonymous> (ChatScreen.kt:815)");
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
            ComposerKt.sourceInformationMarkerStart(composer, -2019480833, "C816@40061L339:ChatScreen.kt#2thlc2");
            IconKt.Icon-ww6aTOc(SearchKt.getSearch(Icons.INSTANCE.getDefault()), "Inspect Condition", SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f)), Color.Companion.getWhite-0d7_KjU(), composer, 3504, 0);
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

    static final Unit lambda__333450478$lambda$24(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C884@43981L1141:ChatScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-333450478, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$-333450478.<anonymous> (ChatScreen.kt:884)");
            }
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Modifier modifier = PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(5.0f), Dp.constructor-impl(1.0f));
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
            ComposerKt.sourceInformationMarkerStart(composer, 1980077715, "C891@44466L11,888@44258L357,894@44656L39,897@44876L11,895@44736L348:ChatScreen.kt#2thlc2");
            IconKt.Icon-ww6aTOc(SearchKt.getSearch(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnPrimaryContainer-0d7_KjU(), composer, 432, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(2.0f)), composer, 6);
            TextKt.Text--4IGK_g("Inspect Photo", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnPrimaryContainer-0d7_KjU(), TextUnitKt.getSp(10), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 199686, 0, 131026);
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

    static final Unit lambda__1240121655$lambda$25(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1027@52016L90,1028@52139L39,1029@52211L64:ChatScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1240121655, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$-1240121655.<anonymous> (ChatScreen.kt:1027)");
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

    static final Unit lambda_1316021119$lambda$27(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1087@54632L393:ChatScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1316021119, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$1316021119.<anonymous> (ChatScreen.kt:1087)");
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
            ComposerKt.sourceInformationMarkerStart(composer, -1878326582, "C1088@54707L288:ChatScreen.kt#2thlc2");
            IconKt.Icon-ww6aTOc(BookKt.getBook(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(32.0f)), ColorKt.Color(4279994175L), composer, 3504, 0);
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

    static final Unit lambda_648401269$lambda$28(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1210@63239L32:ChatScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(648401269, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$648401269.<anonymous> (ChatScreen.kt:1210)");
            }
            TextKt.Text--4IGK_g("Accept", (Modifier) null, 0L, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 3078, 0, 131062);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_176807091$lambda$29(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C1216@63684L33:ChatScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(176807091, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$176807091.<anonymous> (ChatScreen.kt:1216)");
            }
            TextKt.Text--4IGK_g("Decline", (Modifier) null, 0L, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 3078, 0, 131062);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_707411071$lambda$31(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1303@69459L1060:ChatScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(707411071, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$707411071.<anonymous> (ChatScreen.kt:1303)");
            }
            Modifier modifier = PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(10.0f), Dp.constructor-impl(6.0f));
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
            ComposerKt.sourceInformationMarkerStart(composer, -1443504812, "C1307@69785L117,1308@69955L39,1311@70225L10,1309@70047L422:ChatScreen.kt#2thlc2");
            IconKt.Icon-ww6aTOc(CheckCircleKt.getCheckCircle(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), ColorKt.Color(4279994175L), composer, 3504, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextStyle labelSmall = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall();
            TextKt.Text--4IGK_g("✓ Mutually Agreed by Both Readers!", (Modifier) null, ColorKt.Color(4279994175L), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, labelSmall, composer, 196998, 0, 65498);
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

    static final Unit lambda_196675702$lambda$32(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1324@71146L10,1326@71325L11,1322@70986L523:ChatScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(196675702, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$196675702.<anonymous> (ChatScreen.kt:1322)");
            }
            TextStyle labelSmall = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall();
            FontWeight bold = FontWeight.Companion.getBold();
            TextKt.Text--4IGK_g("✗ Meetup Declined", PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(8.0f), Dp.constructor-impl(3.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU(), 0L, (FontStyle) null, bold, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, labelSmall, composer, 196662, 0, 65496);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1976948901$lambda$33(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1338@72194L10,1336@72009L550:ChatScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1976948901, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$-1976948901.<anonymous> (ChatScreen.kt:1336)");
            }
            TextStyle labelSmall = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall();
            FontWeight bold = FontWeight.Companion.getBold();
            TextKt.Text--4IGK_g("Action Needed: Agree to this spot?", PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(8.0f), Dp.constructor-impl(3.0f)), ColorKt.Color(4293880832L), 0L, (FontStyle) null, bold, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, labelSmall, composer, 197046, 0, 65496);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__513478590$lambda$34(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1351@73348L91,1352@73496L39,1353@73592L41:ChatScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-513478590, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$-513478590.<anonymous> (ChatScreen.kt:1351)");
            }
            IconKt.Icon-ww6aTOc(CheckCircleKt.getCheckCircle(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(14.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Agree & Confirm", (Modifier) null, 0L, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 3078, 0, 131062);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1951141504$lambda$35(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C1360@74224L33:ChatScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1951141504, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$1951141504.<anonymous> (ChatScreen.kt:1360)");
            }
            TextKt.Text--4IGK_g("Decline", (Modifier) null, 0L, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 3078, 0, 131062);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_710772658$lambda$36(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1370@74949L10,1368@74760L554:ChatScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(710772658, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$710772658.<anonymous> (ChatScreen.kt:1368)");
            }
            TextStyle labelSmall = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall();
            FontWeight bold = FontWeight.Companion.getBold();
            TextKt.Text--4IGK_g("⏳ Waiting for other reader to agree...", PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(8.0f), Dp.constructor-impl(3.0f)), ColorKt.Color(4293880832L), 0L, (FontStyle) null, bold, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, labelSmall, composer, 197046, 0, 65496);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1499449026$lambda$37(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1402@77349L85,1403@77483L39,1404@77571L38:ChatScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1499449026, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$1499449026.<anonymous> (ChatScreen.kt:1402)");
            }
            IconKt.Icon-ww6aTOc(PlaceKt.getPlace(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(14.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Open in Maps", (Modifier) null, 0L, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 3078, 0, 131062);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__821782400$lambda$38(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C1427@79563L89,1428@79701L39,1429@79789L34:ChatScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-821782400, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$-821782400.<anonymous> (ChatScreen.kt:1427)");
            }
            IconKt.Icon-ww6aTOc(DateRangeKt.getDateRange(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(12.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Calendar", (Modifier) null, 0L, TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 3078, 0, 131062);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1762353324$lambda$40(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1552@86331L917:ChatScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1762353324, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$-1762353324.<anonymous> (ChatScreen.kt:1552)");
            }
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Modifier modifier = PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(12.0f), Dp.constructor-impl(6.0f));
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
            ComposerKt.sourceInformationMarkerStart(composer, 1383016854, "C1556@86561L269,1562@86859L39,1565@87051L10,1563@86927L295:ChatScreen.kt#2thlc2");
            IconKt.Icon-ww6aTOc(PlaceKt.getPlace(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(14.0f)), ColorKt.Color(4279994175L), composer, 3504, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("🛡️ Propose Safe Spot", (Modifier) null, ColorKt.Color(4279994175L), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 196998, 0, 65498);
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

    static final Unit lambda_1871148776$lambda$41(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1632@90331L10,1633@90412L11,1630@90210L284:ChatScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1871148776, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$1871148776.<anonymous> (ChatScreen.kt:1630)");
            }
            TextKt.Text--4IGK_g("Type a message...", (Modifier) null, Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0.65f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 6, 0, 65530);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_741323677$lambda$42(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$FilledTonalButton");
        ComposerKt.sourceInformation(composer, "C1823@99907L85,1824@100013L39,1825@100121L10,1825@100073L100:ChatScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(741323677, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$741323677.<anonymous> (ChatScreen.kt:1823)");
            }
            IconKt.Icon-ww6aTOc(PlaceKt.getPlace(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Safe Meetup Spots", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 196614, 0, 65502);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_2055182960$lambda$43(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1860@102567L84,1861@102680L39,1862@102748L65:ChatScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2055182960, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$2055182960.<anonymous> (ChatScreen.kt:1860)");
            }
            IconKt.Icon-ww6aTOc(BookKt.getBook(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            TextKt.Text--4IGK_g("Request to Borrow This Book", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 196614, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1141455677$lambda$44(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1890@104584L91,1891@104708L39,1892@104780L52:ChatScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1141455677, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$-1141455677.<anonymous> (ChatScreen.kt:1890)");
            }
            IconKt.Icon-ww6aTOc(CheckCircleKt.getCheckCircle(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextKt.Text--4IGK_g("Accept Request", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 196614, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1880564095$lambda$45(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C1900@105303L15:ChatScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1880564095, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$-1880564095.<anonymous> (ChatScreen.kt:1900)");
            }
            TextKt.Text--4IGK_g("Decline", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1015662020$lambda$46(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C1909@105697L85,1910@105811L39,1911@105879L43:ChatScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1015662020, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$-1015662020.<anonymous> (ChatScreen.kt:1909)");
            }
            IconKt.Icon-ww6aTOc(PlaceKt.getPlace(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextKt.Text--4IGK_g("Propose Safe Meetup Spot in Advance", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1090770684$lambda$47(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1926@106573L89,1927@106695L39,1928@106767L51:ChatScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1090770684, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$-1090770684.<anonymous> (ChatScreen.kt:1926)");
            }
            IconKt.Icon-ww6aTOc(CameraAltKt.getCameraAlt(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextKt.Text--4IGK_g("Handover Scan", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 196614, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__240833875$lambda$48(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1936@107276L87,1937@107396L39,1938@107468L15:ChatScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-240833875, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$-240833875.<anonymous> (ChatScreen.kt:1936)");
            }
            IconKt.Icon-ww6aTOc(QrCode2Kt.getQrCode2(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Show QR", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__26156037$lambda$49(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1952@108213L87,1953@108333L39,1954@108405L18:ChatScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-26156037, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$-26156037.<anonymous> (ChatScreen.kt:1952)");
            }
            IconKt.Icon-ww6aTOc(QrCode2Kt.getQrCode2(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Show My QR", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_719331172$lambda$50(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1962@108866L91,1963@108990L39,1964@109062L49:ChatScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(719331172, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$719331172.<anonymous> (ChatScreen.kt:1962)");
            }
            IconKt.Icon-ww6aTOc(CheckCircleKt.getCheckCircle(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Accept Book", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 196614, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1040085691$lambda$51(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1980@109788L93,1981@109914L39,1982@109986L24:ChatScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1040085691, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$-1040085691.<anonymous> (ChatScreen.kt:1980)");
            }
            IconKt.Icon-ww6aTOc(QrCodeScannerKt.getQrCodeScanner(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextKt.Text--4IGK_g("Scan Borrower QR", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__190148882$lambda$52(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1990@110468L87,1991@110588L39,1992@110660L15:ChatScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-190148882, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$-190148882.<anonymous> (ChatScreen.kt:1990)");
            }
            IconKt.Icon-ww6aTOc(QrCode2Kt.getQrCode2(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Show QR", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_24528956$lambda$53(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C2006@111405L87,2007@111525L39,2008@111597L18:ChatScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(24528956, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$24528956.<anonymous> (ChatScreen.kt:2006)");
            }
            IconKt.Icon-ww6aTOc(QrCode2Kt.getQrCode2(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Show My QR", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_770016165$lambda$54(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C2016@112058L91,2017@112182L39,2018@112254L49:ChatScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(770016165, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$770016165.<anonymous> (ChatScreen.kt:2016)");
            }
            IconKt.Icon-ww6aTOc(CheckCircleKt.getCheckCircle(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Accept Book", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 196614, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__989400698$lambda$55(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C2035@113100L89,2036@113222L39,2037@113294L54:ChatScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-989400698, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$-989400698.<anonymous> (ChatScreen.kt:2035)");
            }
            IconKt.Icon-ww6aTOc(CameraAltKt.getCameraAlt(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextKt.Text--4IGK_g("Take Return Scan", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 196614, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__139463889$lambda$56(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C2044@113681L87,2045@113801L39,2046@113873L15:ChatScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-139463889, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$-139463889.<anonymous> (ChatScreen.kt:2044)");
            }
            IconKt.Icon-ww6aTOc(QrCode2Kt.getQrCode2(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Show QR", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_75213949$lambda$57(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C2059@114491L93,2060@114617L39,2061@114689L22:ChatScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(75213949, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$75213949.<anonymous> (ChatScreen.kt:2059)");
            }
            IconKt.Icon-ww6aTOc(QrCodeScannerKt.getQrCodeScanner(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextKt.Text--4IGK_g("Scan Return QR", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_820701158$lambda$58(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C2069@115167L87,2070@115287L39,2071@115359L15:ChatScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(820701158, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$820701158.<anonymous> (ChatScreen.kt:2069)");
            }
            IconKt.Icon-ww6aTOc(QrCode2Kt.getQrCode2(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Show QR", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__938715705$lambda$59(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C2087@116048L93,2088@116174L39,2089@116246L22:ChatScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-938715705, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$-938715705.<anonymous> (ChatScreen.kt:2087)");
            }
            IconKt.Icon-ww6aTOc(QrCodeScannerKt.getQrCodeScanner(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Scan Return QR", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__88778896$lambda$60(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C2097@116709L91,2098@116833L39,2099@116905L51:ChatScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-88778896, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$-88778896.<anonymous> (ChatScreen.kt:2097)");
            }
            IconKt.Icon-ww6aTOc(CheckCircleKt.getCheckCircle(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Accept Return", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 196614, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_125898942$lambda$61(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C2113@117685L87,2114@117805L39,2115@117877L52:ChatScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(125898942, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$125898942.<anonymous> (ChatScreen.kt:2113)");
            }
            IconKt.Icon-ww6aTOc(QrCode2Kt.getQrCode2(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextKt.Text--4IGK_g("Show Return QR", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 196614, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1487686916$lambda$62(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C2122@118273L89,2123@118395L39,2124@118467L14:ChatScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1487686916, i, -1, "com.example.ui.screens.ComposableSingletons$ChatScreenKt.lambda$-1487686916.<anonymous> (ChatScreen.kt:2122)");
            }
            IconKt.Icon-ww6aTOc(CameraAltKt.getCameraAlt(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Rescan", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
