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
import androidx.compose.material.icons.automirrored.filled.ChatKt;
import androidx.compose.material.icons.filled.AddKt;
import androidx.compose.material.icons.filled.AutoAwesomeKt;
import androidx.compose.material.icons.filled.AutoStoriesKt;
import androidx.compose.material.icons.filled.BookmarkKt;
import androidx.compose.material.icons.filled.CameraAltKt;
import androidx.compose.material.icons.filled.CheckCircleKt;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.material.icons.filled.DeleteKt;
import androidx.compose.material.icons.filled.EcoKt;
import androidx.compose.material.icons.filled.EmailKt;
import androidx.compose.material.icons.filled.FeedbackKt;
import androidx.compose.material.icons.filled.InfoKt;
import androidx.compose.material.icons.filled.QrCode2Kt;
import androidx.compose.material.icons.filled.QrCodeScannerKt;
import androidx.compose.material.icons.filled.ScheduleKt;
import androidx.compose.material.icons.filled.SearchKt;
import androidx.compose.material.icons.filled.ShareKt;
import androidx.compose.material.icons.filled.StarKt;
import androidx.compose.material.icons.filled.VerifiedKt;
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
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DashboardScreen.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class ComposableSingletons$DashboardScreenKt {
    public static final ComposableSingletons$DashboardScreenKt INSTANCE = new ComposableSingletons$DashboardScreenKt();
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1648220262 = ComposableLambdaKt.composableLambdaInstance(1648220262, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda0
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda_1648220262$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1256558007 = ComposableLambdaKt.composableLambdaInstance(1256558007, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda2
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda_1256558007$lambda$1((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-2101376302, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f117lambda$2101376302 = ComposableLambdaKt.composableLambdaInstance(-2101376302, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda14
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DashboardScreenKt.lambda__2101376302$lambda$3((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1457579438 = ComposableLambdaKt.composableLambdaInstance(1457579438, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda26
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DashboardScreenKt.lambda_1457579438$lambda$5((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1581698781 = ComposableLambdaKt.composableLambdaInstance(1581698781, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda38
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda_1581698781$lambda$6((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1143573522, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f97lambda$1143573522 = ComposableLambdaKt.composableLambdaInstance(-1143573522, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda50
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda__1143573522$lambda$7((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1696962121 = ComposableLambdaKt.composableLambdaInstance(1696962121, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda62
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DashboardScreenKt.lambda_1696962121$lambda$9((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-352507618, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f120lambda$352507618 = ComposableLambdaKt.composableLambdaInstance(-352507618, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda74
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda__352507618$lambda$10((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1217187375 = ComposableLambdaKt.composableLambdaInstance(1217187375, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda86
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda_1217187375$lambda$11((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-237244278, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f118lambda$237244278 = ComposableLambdaKt.composableLambdaInstance(-237244278, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda89
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DashboardScreenKt.lambda__237244278$lambda$13((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$2008253279 = ComposableLambdaKt.composableLambdaInstance(2008253279, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda11
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda_2008253279$lambda$14((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-717019024, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f131lambda$717019024 = ComposableLambdaKt.composableLambdaInstance(-717019024, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda22
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda__717019024$lambda$15((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$2123516619 = ComposableLambdaKt.composableLambdaInstance(2123516619, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda33
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DashboardScreenKt.lambda_2123516619$lambda$17((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$924224026 = ComposableLambdaKt.composableLambdaInstance(924224026, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda44
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DashboardScreenKt.lambda_924224026$lambda$18((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$502488515 = ComposableLambdaKt.composableLambdaInstance(502488515, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda55
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DashboardScreenKt.lambda_502488515$lambda$19((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1275530466 = ComposableLambdaKt.composableLambdaInstance(1275530466, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda66
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DashboardScreenKt.lambda_1275530466$lambda$20((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-557896308, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f128lambda$557896308 = ComposableLambdaKt.composableLambdaInstance(-557896308, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda77
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DashboardScreenKt.lambda__557896308$lambda$21((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-841294359, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f132lambda$841294359 = ComposableLambdaKt.composableLambdaInstance(-841294359, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda88
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DashboardScreenKt.lambda__841294359$lambda$22((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1851960406, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f113lambda$1851960406 = ComposableLambdaKt.composableLambdaInstance(-1851960406, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda90
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DashboardScreenKt.lambda__1851960406$lambda$23((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-494412445, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f127lambda$494412445 = ComposableLambdaKt.composableLambdaInstance(-494412445, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda1
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DashboardScreenKt.lambda__494412445$lambda$24((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$2073061752 = ComposableLambdaKt.composableLambdaInstance(2073061752, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda_2073061752$lambda$25((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-155646895, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f102lambda$155646895 = ComposableLambdaKt.composableLambdaInstance(-155646895, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda4
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda__155646895$lambda$26((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1033837522 = ComposableLambdaKt.composableLambdaInstance(1033837522, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda5
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DashboardScreenKt.lambda_1033837522$lambda$27((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$824727388 = ComposableLambdaKt.composableLambdaInstance(824727388, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda6
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DashboardScreenKt.lambda_824727388$lambda$28((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1914652494, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f115lambda$1914652494 = ComposableLambdaKt.composableLambdaInstance(-1914652494, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda7
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda__1914652494$lambda$29((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1756958160, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f109lambda$1756958160 = ComposableLambdaKt.composableLambdaInstance(-1756958160, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda8
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda__1756958160$lambda$30((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1109407621, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f96lambda$1109407621 = ComposableLambdaKt.composableLambdaInstance(-1109407621, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda9
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda__1109407621$lambda$31((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-438417191, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f123lambda$438417191 = ComposableLambdaKt.composableLambdaInstance(-438417191, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda10
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda__438417191$lambda$32((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1658816805, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f107lambda$1658816805 = ComposableLambdaKt.composableLambdaInstance(-1658816805, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda12
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda__1658816805$lambda$33((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1847830394, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f112lambda$1847830394 = ComposableLambdaKt.composableLambdaInstance(-1847830394, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda13
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DashboardScreenKt.lambda__1847830394$lambda$34((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$578660077 = ComposableLambdaKt.composableLambdaInstance(578660077, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda15
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DashboardScreenKt.lambda_578660077$lambda$36((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1778608708 = ComposableLambdaKt.composableLambdaInstance(1778608708, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda16
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda_1778608708$lambda$37((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$378370939 = ComposableLambdaKt.composableLambdaInstance(378370939, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda17
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda_378370939$lambda$38((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-366714007, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f121lambda$366714007 = ComposableLambdaKt.composableLambdaInstance(-366714007, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda18
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DashboardScreenKt.lambda__366714007$lambda$39((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1005329224, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f93lambda$1005329224 = ComposableLambdaKt.composableLambdaInstance(-1005329224, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda19
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda__1005329224$lambda$40((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$2069238458 = ComposableLambdaKt.composableLambdaInstance(2069238458, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda20
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda_2069238458$lambda$41((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$2085371538 = ComposableLambdaKt.composableLambdaInstance(2085371538, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda21
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda_2085371538$lambda$42((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1572241257, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f104lambda$1572241257 = ComposableLambdaKt.composableLambdaInstance(-1572241257, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda23
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda__1572241257$lambda$43((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$160951310 = ComposableLambdaKt.composableLambdaInstance(160951310, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda24
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda_160951310$lambda$44((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1502326425 = ComposableLambdaKt.composableLambdaInstance(1502326425, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda25
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda_1502326425$lambda$45((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$922741888 = ComposableLambdaKt.composableLambdaInstance(922741888, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda27
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda_922741888$lambda$46((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$644784642 = ComposableLambdaKt.composableLambdaInstance(644784642, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda28
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda_644784642$lambda$47((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1221080082 = ComposableLambdaKt.composableLambdaInstance(1221080082, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda29
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda_1221080082$lambda$48((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1588901973 = ComposableLambdaKt.composableLambdaInstance(1588901973, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda30
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda_1588901973$lambda$49((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$368502359 = ComposableLambdaKt.composableLambdaInstance(368502359, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda31
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda_368502359$lambda$50((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-972872756, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f133lambda$972872756 = ComposableLambdaKt.composableLambdaInstance(-972872756, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda32
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda__972872756$lambda$51((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1574301125, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f105lambda$1574301125 = ComposableLambdaKt.composableLambdaInstance(-1574301125, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda34
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda__1574301125$lambda$52((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1516915719, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f101lambda$1516915719 = ComposableLambdaKt.composableLambdaInstance(-1516915719, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda35
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda__1516915719$lambda$53((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1291560414, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f99lambda$1291560414 = ComposableLambdaKt.composableLambdaInstance(-1291560414, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda36
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda__1291560414$lambda$54((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-2100622594, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f116lambda$2100622594 = ComposableLambdaKt.composableLambdaInstance(-2100622594, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda37
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DashboardScreenKt.lambda__2100622594$lambda$55((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$54015746 = ComposableLambdaKt.composableLambdaInstance(54015746, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda39
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda_54015746$lambda$56((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$393993856 = ComposableLambdaKt.composableLambdaInstance(393993856, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda40
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda_393993856$lambda$57((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-116347673, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f98lambda$116347673 = ComposableLambdaKt.composableLambdaInstance(-116347673, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda41
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda__116347673$lambda$58((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1054025257 = ComposableLambdaKt.composableLambdaInstance(1054025257, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda42
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda_1054025257$lambda$59((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$752576043 = ComposableLambdaKt.composableLambdaInstance(752576043, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda43
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda_752576043$lambda$60((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1565603901 = ComposableLambdaKt.composableLambdaInstance(1565603901, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda45
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DashboardScreenKt.lambda_1565603901$lambda$61((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-637465964, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f129lambda$637465964 = ComposableLambdaKt.composableLambdaInstance(-637465964, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda46
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda__637465964$lambda$62((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-474141532, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f126lambda$474141532 = ComposableLambdaKt.composableLambdaInstance(-474141532, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda47
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda__474141532$lambda$63((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1879837671 = ComposableLambdaKt.composableLambdaInstance(1879837671, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda48
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda_1879837671$lambda$64((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-319969698, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f119lambda$319969698 = ComposableLambdaKt.composableLambdaInstance(-319969698, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda49
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda__319969698$lambda$65((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$2118232272 = ComposableLambdaKt.composableLambdaInstance(2118232272, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda51
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda_2118232272$lambda$66((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1227260295 = ComposableLambdaKt.composableLambdaInstance(1227260295, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda52
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda_1227260295$lambda$67((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$351670882 = ComposableLambdaKt.composableLambdaInstance(351670882, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda53
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda_351670882$lambda$68((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1589317211, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f106lambda$1589317211 = ComposableLambdaKt.composableLambdaInstance(-1589317211, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda54
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda__1589317211$lambda$69((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1890766425, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f114lambda$1890766425 = ComposableLambdaKt.composableLambdaInstance(-1890766425, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda56
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda__1890766425$lambda$70((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1350922610, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f100lambda$1350922610 = ComposableLambdaKt.composableLambdaInstance(-1350922610, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda57
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda__1350922610$lambda$71((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1014158864 = ComposableLambdaKt.composableLambdaInstance(1014158864, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda58
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda_1014158864$lambda$72((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$2053072709 = ComposableLambdaKt.composableLambdaInstance(2053072709, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda59
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda_2053072709$lambda$73((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$23645036 = ComposableLambdaKt.composableLambdaInstance(23645036, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda60
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DashboardScreenKt.lambda_23645036$lambda$74((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1071646331, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f95lambda$1071646331 = ComposableLambdaKt.composableLambdaInstance(-1071646331, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda61
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda__1071646331$lambda$75((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$909010070 = ComposableLambdaKt.composableLambdaInstance(909010070, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda63
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda_909010070$lambda$76((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1754543887, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f108lambda$1754543887 = ComposableLambdaKt.composableLambdaInstance(-1754543887, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda64
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DashboardScreenKt.lambda__1754543887$lambda$77((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$679296170 = ComposableLambdaKt.composableLambdaInstance(679296170, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda65
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda_679296170$lambda$78((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1779344448, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f110lambda$1779344448 = ComposableLambdaKt.composableLambdaInstance(-1779344448, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda67
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DashboardScreenKt.lambda__1779344448$lambda$79((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1225387359 = ComposableLambdaKt.composableLambdaInstance(1225387359, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda68
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DashboardScreenKt.lambda_1225387359$lambda$80((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$495501679 = ComposableLambdaKt.composableLambdaInstance(495501679, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda69
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DashboardScreenKt.lambda_495501679$lambda$82((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1332307430 = ComposableLambdaKt.composableLambdaInstance(1332307430, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda70
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DashboardScreenKt.lambda_1332307430$lambda$84((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1508635687 = ComposableLambdaKt.composableLambdaInstance(1508635687, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda71
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DashboardScreenKt.lambda_1508635687$lambda$86((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1684963944 = ComposableLambdaKt.composableLambdaInstance(1684963944, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda72
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DashboardScreenKt.lambda_1684963944$lambda$89((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1861292201 = ComposableLambdaKt.composableLambdaInstance(1861292201, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda73
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DashboardScreenKt.lambda_1861292201$lambda$91((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-661557879, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f130lambda$661557879 = ComposableLambdaKt.composableLambdaInstance(-661557879, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda75
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda__661557879$lambda$92((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-397961802, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f122lambda$397961802 = ComposableLambdaKt.composableLambdaInstance(-397961802, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda76
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DashboardScreenKt.lambda__397961802$lambda$94((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-461865392, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f125lambda$461865392 = ComposableLambdaKt.composableLambdaInstance(-461865392, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda78
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DashboardScreenKt.lambda__461865392$lambda$95((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1925528431 = ComposableLambdaKt.composableLambdaInstance(1925528431, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda79
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DashboardScreenKt.lambda_1925528431$lambda$96((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1049938387, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f94lambda$1049938387 = ComposableLambdaKt.composableLambdaInstance(-1049938387, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda80
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DashboardScreenKt.lambda__1049938387$lambda$97((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1432265395 = ComposableLambdaKt.composableLambdaInstance(1432265395, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda81
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DashboardScreenKt.lambda_1432265395$lambda$99((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1814009743 = ComposableLambdaKt.composableLambdaInstance(1814009743, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda82
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DashboardScreenKt.lambda_1814009743$lambda$100((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-453077997, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f124lambda$453077997 = ComposableLambdaKt.composableLambdaInstance(-453077997, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda83
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DashboardScreenKt.lambda__453077997$lambda$102((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$2114251191 = ComposableLambdaKt.composableLambdaInstance(2114251191, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda84
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DashboardScreenKt.lambda_2114251191$lambda$103((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1795038698, reason: not valid java name */
    private static Function3<ColumnScope, Composer, Integer, Unit> f111lambda$1795038698 = ComposableLambdaKt.composableLambdaInstance(-1795038698, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda85
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DashboardScreenKt.lambda__1795038698$lambda$107((ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1558931151, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f103lambda$1558931151 = ComposableLambdaKt.composableLambdaInstance(-1558931151, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DashboardScreenKt$$ExternalSyntheticLambda87
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DashboardScreenKt.lambda__1558931151$lambda$109((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-1005329224$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m274getLambda$1005329224$app() {
        return f93lambda$1005329224;
    }

    /* JADX INFO: renamed from: getLambda$-1049938387$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m275getLambda$1049938387$app() {
        return f94lambda$1049938387;
    }

    /* JADX INFO: renamed from: getLambda$-1071646331$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m276getLambda$1071646331$app() {
        return f95lambda$1071646331;
    }

    /* JADX INFO: renamed from: getLambda$-1109407621$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m277getLambda$1109407621$app() {
        return f96lambda$1109407621;
    }

    /* JADX INFO: renamed from: getLambda$-1143573522$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m278getLambda$1143573522$app() {
        return f97lambda$1143573522;
    }

    /* JADX INFO: renamed from: getLambda$-116347673$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m279getLambda$116347673$app() {
        return f98lambda$116347673;
    }

    /* JADX INFO: renamed from: getLambda$-1291560414$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m280getLambda$1291560414$app() {
        return f99lambda$1291560414;
    }

    /* JADX INFO: renamed from: getLambda$-1350922610$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m281getLambda$1350922610$app() {
        return f100lambda$1350922610;
    }

    /* JADX INFO: renamed from: getLambda$-1516915719$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m282getLambda$1516915719$app() {
        return f101lambda$1516915719;
    }

    /* JADX INFO: renamed from: getLambda$-155646895$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m283getLambda$155646895$app() {
        return f102lambda$155646895;
    }

    /* JADX INFO: renamed from: getLambda$-1558931151$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m284getLambda$1558931151$app() {
        return f103lambda$1558931151;
    }

    /* JADX INFO: renamed from: getLambda$-1572241257$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m285getLambda$1572241257$app() {
        return f104lambda$1572241257;
    }

    /* JADX INFO: renamed from: getLambda$-1574301125$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m286getLambda$1574301125$app() {
        return f105lambda$1574301125;
    }

    /* JADX INFO: renamed from: getLambda$-1589317211$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m287getLambda$1589317211$app() {
        return f106lambda$1589317211;
    }

    /* JADX INFO: renamed from: getLambda$-1658816805$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m288getLambda$1658816805$app() {
        return f107lambda$1658816805;
    }

    /* JADX INFO: renamed from: getLambda$-1754543887$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m289getLambda$1754543887$app() {
        return f108lambda$1754543887;
    }

    /* JADX INFO: renamed from: getLambda$-1756958160$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m290getLambda$1756958160$app() {
        return f109lambda$1756958160;
    }

    /* JADX INFO: renamed from: getLambda$-1779344448$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m291getLambda$1779344448$app() {
        return f110lambda$1779344448;
    }

    /* JADX INFO: renamed from: getLambda$-1795038698$app, reason: not valid java name */
    public final Function3<ColumnScope, Composer, Integer, Unit> m292getLambda$1795038698$app() {
        return f111lambda$1795038698;
    }

    /* JADX INFO: renamed from: getLambda$-1847830394$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m293getLambda$1847830394$app() {
        return f112lambda$1847830394;
    }

    /* JADX INFO: renamed from: getLambda$-1851960406$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m294getLambda$1851960406$app() {
        return f113lambda$1851960406;
    }

    /* JADX INFO: renamed from: getLambda$-1890766425$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m295getLambda$1890766425$app() {
        return f114lambda$1890766425;
    }

    /* JADX INFO: renamed from: getLambda$-1914652494$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m296getLambda$1914652494$app() {
        return f115lambda$1914652494;
    }

    /* JADX INFO: renamed from: getLambda$-2100622594$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m297getLambda$2100622594$app() {
        return f116lambda$2100622594;
    }

    /* JADX INFO: renamed from: getLambda$-2101376302$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m298getLambda$2101376302$app() {
        return f117lambda$2101376302;
    }

    /* JADX INFO: renamed from: getLambda$-237244278$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m299getLambda$237244278$app() {
        return f118lambda$237244278;
    }

    /* JADX INFO: renamed from: getLambda$-319969698$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m300getLambda$319969698$app() {
        return f119lambda$319969698;
    }

    /* JADX INFO: renamed from: getLambda$-352507618$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m301getLambda$352507618$app() {
        return f120lambda$352507618;
    }

    /* JADX INFO: renamed from: getLambda$-366714007$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m302getLambda$366714007$app() {
        return f121lambda$366714007;
    }

    /* JADX INFO: renamed from: getLambda$-397961802$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m303getLambda$397961802$app() {
        return f122lambda$397961802;
    }

    /* JADX INFO: renamed from: getLambda$-438417191$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m304getLambda$438417191$app() {
        return f123lambda$438417191;
    }

    /* JADX INFO: renamed from: getLambda$-453077997$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m305getLambda$453077997$app() {
        return f124lambda$453077997;
    }

    /* JADX INFO: renamed from: getLambda$-461865392$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m306getLambda$461865392$app() {
        return f125lambda$461865392;
    }

    /* JADX INFO: renamed from: getLambda$-474141532$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m307getLambda$474141532$app() {
        return f126lambda$474141532;
    }

    /* JADX INFO: renamed from: getLambda$-494412445$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m308getLambda$494412445$app() {
        return f127lambda$494412445;
    }

    /* JADX INFO: renamed from: getLambda$-557896308$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m309getLambda$557896308$app() {
        return f128lambda$557896308;
    }

    /* JADX INFO: renamed from: getLambda$-637465964$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m310getLambda$637465964$app() {
        return f129lambda$637465964;
    }

    /* JADX INFO: renamed from: getLambda$-661557879$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m311getLambda$661557879$app() {
        return f130lambda$661557879;
    }

    /* JADX INFO: renamed from: getLambda$-717019024$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m312getLambda$717019024$app() {
        return f131lambda$717019024;
    }

    /* JADX INFO: renamed from: getLambda$-841294359$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m313getLambda$841294359$app() {
        return f132lambda$841294359;
    }

    /* JADX INFO: renamed from: getLambda$-972872756$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m314getLambda$972872756$app() {
        return f133lambda$972872756;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1014158864$app() {
        return lambda$1014158864;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1033837522$app() {
        return lambda$1033837522;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1054025257$app() {
        return lambda$1054025257;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1217187375$app() {
        return lambda$1217187375;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1221080082$app() {
        return lambda$1221080082;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1225387359$app() {
        return lambda$1225387359;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1227260295$app() {
        return lambda$1227260295;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1256558007$app() {
        return lambda$1256558007;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1275530466$app() {
        return lambda$1275530466;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1332307430$app() {
        return lambda$1332307430;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1432265395$app() {
        return lambda$1432265395;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1457579438$app() {
        return lambda$1457579438;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1502326425$app() {
        return lambda$1502326425;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1508635687$app() {
        return lambda$1508635687;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1565603901$app() {
        return lambda$1565603901;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1581698781$app() {
        return lambda$1581698781;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1588901973$app() {
        return lambda$1588901973;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$160951310$app() {
        return lambda$160951310;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1648220262$app() {
        return lambda$1648220262;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1684963944$app() {
        return lambda$1684963944;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1696962121$app() {
        return lambda$1696962121;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1778608708$app() {
        return lambda$1778608708;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1814009743$app() {
        return lambda$1814009743;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1861292201$app() {
        return lambda$1861292201;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1879837671$app() {
        return lambda$1879837671;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1925528431$app() {
        return lambda$1925528431;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$2008253279$app() {
        return lambda$2008253279;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$2053072709$app() {
        return lambda$2053072709;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$2069238458$app() {
        return lambda$2069238458;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$2073061752$app() {
        return lambda$2073061752;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$2085371538$app() {
        return lambda$2085371538;
    }

    public final Function2<Composer, Integer, Unit> getLambda$2114251191$app() {
        return lambda$2114251191;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$2118232272$app() {
        return lambda$2118232272;
    }

    public final Function2<Composer, Integer, Unit> getLambda$2123516619$app() {
        return lambda$2123516619;
    }

    public final Function2<Composer, Integer, Unit> getLambda$23645036$app() {
        return lambda$23645036;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$351670882$app() {
        return lambda$351670882;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$368502359$app() {
        return lambda$368502359;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$378370939$app() {
        return lambda$378370939;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$393993856$app() {
        return lambda$393993856;
    }

    public final Function2<Composer, Integer, Unit> getLambda$495501679$app() {
        return lambda$495501679;
    }

    public final Function2<Composer, Integer, Unit> getLambda$502488515$app() {
        return lambda$502488515;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$54015746$app() {
        return lambda$54015746;
    }

    public final Function2<Composer, Integer, Unit> getLambda$578660077$app() {
        return lambda$578660077;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$644784642$app() {
        return lambda$644784642;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$679296170$app() {
        return lambda$679296170;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$752576043$app() {
        return lambda$752576043;
    }

    public final Function2<Composer, Integer, Unit> getLambda$824727388$app() {
        return lambda$824727388;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$909010070$app() {
        return lambda$909010070;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$922741888$app() {
        return lambda$922741888;
    }

    public final Function2<Composer, Integer, Unit> getLambda$924224026$app() {
        return lambda$924224026;
    }

    static final Unit lambda__2101376302$lambda$3(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C237@11406L311:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2101376302, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$-2101376302.<anonymous> (DashboardScreen.kt:237)");
            }
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier = Modifier.Companion;
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
            ComposerKt.sourceInformationMarkerStart(composer, 1094841626, "C238@11560L11,238@11480L101,239@11602L39,240@11662L37:DashboardScreen.kt#2thlc2");
            IconKt.Icon-ww6aTOc(CheckCircleKt.getCheckCircle(Icons.INSTANCE.getDefault()), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getTertiary-0d7_KjU(), composer, 48, 4);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            TextKt.Text--4IGK_g("Confirm Return & Verify Photo", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
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

    static final Unit lambda_1457579438$lambda$5(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C289@14485L420:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1457579438, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$1457579438.<anonymous> (DashboardScreen.kt:289)");
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
            ComposerKt.sourceInformationMarkerStart(composer, 950853349, "C290@14607L78,291@14718L39,292@14854L10,292@14790L85:DashboardScreen.kt#2thlc2");
            ProgressIndicatorKt.CircularProgressIndicator-LxG7B9w(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), 0L, Dp.constructor-impl(2.0f), 0L, 0, composer, 390, 26);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            TextKt.Text--4IGK_g("AI is verifying book condition...", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 65534);
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

    static final Unit lambda_1648220262$lambda$0(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C370@19625L85,371@19731L39,372@19791L22:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1648220262, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$1648220262.<anonymous> (DashboardScreen.kt:370)");
            }
            IconKt.Icon-ww6aTOc(CheckKt.getCheck(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextKt.Text--4IGK_g("Confirm Return", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1256558007$lambda$1(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$TextButton");
        ComposerKt.sourceInformation(composer, "C379@20030L14:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1256558007, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$1256558007.<anonymous> (DashboardScreen.kt:379)");
            }
            TextKt.Text--4IGK_g("Cancel", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1696962121$lambda$9(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C389@20302L292:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1696962121, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$1696962121.<anonymous> (DashboardScreen.kt:389)");
            }
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier = Modifier.Companion;
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
            ComposerKt.sourceInformationMarkerStart(composer, 1212241654, "C390@20454L11,390@20376L98,391@20495L39,392@20555L21:DashboardScreen.kt#2thlc2");
            IconKt.Icon-ww6aTOc(CameraAltKt.getCameraAlt(Icons.INSTANCE.getDefault()), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 48, 4);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            TextKt.Text--4IGK_g("Handover Scan", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
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

    static final Unit lambda_1581698781$lambda$6(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C403@21088L89,404@21198L39,405@21258L23:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1581698781, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$1581698781.<anonymous> (DashboardScreen.kt:403)");
            }
            IconKt.Icon-ww6aTOc(CameraAltKt.getCameraAlt(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextKt.Text--4IGK_g("Scan & Transfer", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1143573522$lambda$7(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$TextButton");
        ComposerKt.sourceInformation(composer, "C412@21532L18:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1143573522, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$-1143573522.<anonymous> (DashboardScreen.kt:412)");
            }
            TextKt.Text--4IGK_g("Skip Photo", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__237244278$lambda$13(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C422@21817L300:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-237244278, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$-237244278.<anonymous> (DashboardScreen.kt:422)");
            }
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier = Modifier.Companion;
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
            ComposerKt.sourceInformationMarkerStart(composer, 550652429, "C423@21969L11,423@21891L99,424@22011L39,425@22071L28:DashboardScreen.kt#2thlc2");
            IconKt.Icon-ww6aTOc(CameraAltKt.getCameraAlt(Icons.INSTANCE.getDefault()), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getTertiary-0d7_KjU(), composer, 48, 4);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            TextKt.Text--4IGK_g("Initiate Return Scan", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
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

    static final Unit lambda__352507618$lambda$10(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C439@22721L89,440@22831L39,441@22891L25:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-352507618, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$-352507618.<anonymous> (DashboardScreen.kt:439)");
            }
            IconKt.Icon-ww6aTOc(CameraAltKt.getCameraAlt(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextKt.Text--4IGK_g("Take Return Photo", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1217187375$lambda$11(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$TextButton");
        ComposerKt.sourceInformation(composer, "C449@23178L18:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1217187375, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$1217187375.<anonymous> (DashboardScreen.kt:449)");
            }
            TextKt.Text--4IGK_g("Skip Photo", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_2123516619$lambda$17(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C460@23513L302:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2123516619, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$2123516619.<anonymous> (DashboardScreen.kt:460)");
            }
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier = Modifier.Companion;
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
            ComposerKt.sourceInformationMarkerStart(composer, -110936982, "C461@23664L11,461@23587L97,462@23705L39,463@23765L32:DashboardScreen.kt#2thlc2");
            IconKt.Icon-ww6aTOc(VerifiedKt.getVerified(Icons.INSTANCE.getDefault()), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 48, 4);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            TextKt.Text--4IGK_g("Confirm Handover Receipt", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
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

    static final Unit lambda_2008253279$lambda$14(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C520@27133L32:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2008253279, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$2008253279.<anonymous> (DashboardScreen.kt:520)");
            }
            TextKt.Text--4IGK_g("Confirm Receipt & Borrow", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__717019024$lambda$15(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$TextButton");
        ComposerKt.sourceInformation(composer, "C527@27390L14:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-717019024, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$-717019024.<anonymous> (DashboardScreen.kt:527)");
            }
            TextKt.Text--4IGK_g("Cancel", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_924224026$lambda$18(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C636@31632L11,636@31546L106:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(924224026, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$924224026.<anonymous> (DashboardScreen.kt:636)");
            }
            IconKt.Icon-ww6aTOc(InfoKt.getInfo(Icons.INSTANCE.getDefault()), "About Developer", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_502488515$lambda$19(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C639@31779L85:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(502488515, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$502488515.<anonymous> (DashboardScreen.kt:639)");
            }
            IconKt.Icon-ww6aTOc(EcoKt.getEco(Icons.INSTANCE.getDefault()), "Eco & Ranks", (Modifier) null, ColorKt.Color(4279994175L), composer, 3120, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1275530466$lambda$20(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C642@31985L61:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1275530466, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$1275530466.<anonymous> (DashboardScreen.kt:642)");
            }
            IconKt.Icon-ww6aTOc(FeedbackKt.getFeedback(Icons.INSTANCE.getDefault()), "Feedback", (Modifier) null, 0L, composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__557896308$lambda$21(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C682@34432L70:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-557896308, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$-557896308.<anonymous> (DashboardScreen.kt:682)");
            }
            IconKt.Icon-ww6aTOc(QrCodeScannerKt.getQrCodeScanner(Icons.INSTANCE.getDefault()), "Scan QR Code", (Modifier) null, 0L, composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__841294359$lambda$22(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C724@36192L33:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-841294359, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$-841294359.<anonymous> (DashboardScreen.kt:724)");
            }
            TextKt.Text--4IGK_g("Search title or author...", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1851960406$lambda$23(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C725@36344L11,725@36269L95:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1851960406, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$-1851960406.<anonymous> (DashboardScreen.kt:725)");
            }
            IconKt.Icon-ww6aTOc(SearchKt.getSearch(Icons.INSTANCE.getDefault()), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__494412445$lambda$24(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C729@36681L11,729@36597L113:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-494412445, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$-494412445.<anonymous> (DashboardScreen.kt:729)");
            }
            IconKt.Icon-ww6aTOc(CloseKt.getClose(Icons.INSTANCE.getDefault()), "Clear search", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_2073061752$lambda$25(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C887@46700L21:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2073061752, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$2073061752.<anonymous> (DashboardScreen.kt:887)");
            }
            TextKt.Text--4IGK_g("Clear Filters", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__155646895$lambda$26(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C900@47831L82,901@47946L39,902@48068L10,902@48018L103:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-155646895, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$-155646895.<anonymous> (DashboardScreen.kt:900)");
            }
            IconKt.Icon-ww6aTOc(AddKt.getAdd(Icons.INSTANCE.getDefault()), (String) null, (Modifier) null, 0L, composer, 48, 12);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            TextKt.Text--4IGK_g("Add Your First Book", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleMedium(), composer, 196614, 0, 65502);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1033837522$lambda$27(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1200@65013L11,1197@64829L298:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1033837522, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$1033837522.<anonymous> (DashboardScreen.kt:1197)");
            }
            IconKt.Icon-ww6aTOc(ChatKt.getChat(Icons.AutoMirrored.Filled.INSTANCE), "Chat", SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_824727388$lambda$28(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1265@68105L11,1265@68021L102:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(824727388, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$824727388.<anonymous> (DashboardScreen.kt:1265)");
            }
            IconKt.Icon-ww6aTOc(DeleteKt.getDelete(Icons.INSTANCE.getDefault()), "Delete Book", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU(), composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1914652494$lambda$29(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C1340@72186L96,1341@72315L39,1342@72387L26:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1914652494, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$-1914652494.<anonymous> (DashboardScreen.kt:1340)");
            }
            IconKt.Icon-ww6aTOc(ChatKt.getChat(Icons.AutoMirrored.Filled.INSTANCE), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Chat", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1) null, (TextStyle) null, composer, 6, 3072, 122878);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1756958160$lambda$30(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1350@72854L29:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1756958160, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$-1756958160.<anonymous> (DashboardScreen.kt:1350)");
            }
            TextKt.Text--4IGK_g("Request", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1) null, (TextStyle) null, composer, 6, 3072, 122878);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1109407621$lambda$31(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C1366@73796L96,1367@73925L39,1368@74037L10,1368@73997L62:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1109407621, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$-1109407621.<anonymous> (DashboardScreen.kt:1366)");
            }
            IconKt.Icon-ww6aTOc(ChatKt.getChat(Icons.AutoMirrored.Filled.INSTANCE), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(14.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Inquiries", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 6, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__438417191$lambda$32(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1385@74839L91,1386@74963L39,1387@75035L28:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-438417191, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$-438417191.<anonymous> (DashboardScreen.kt:1385)");
            }
            IconKt.Icon-ww6aTOc(CheckCircleKt.getCheckCircle(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Accept", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1) null, (TextStyle) null, composer, 6, 3072, 122878);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1658816805$lambda$33(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C1394@75410L29:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1658816805, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$-1658816805.<anonymous> (DashboardScreen.kt:1394)");
            }
            TextKt.Text--4IGK_g("Decline", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1) null, (TextStyle) null, composer, 6, 3072, 122878);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1847830394$lambda$34(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1397@75653L11,1397@75566L107:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1847830394, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$-1847830394.<anonymous> (DashboardScreen.kt:1397)");
            }
            IconKt.Icon-ww6aTOc(ChatKt.getChat(Icons.AutoMirrored.Filled.INSTANCE), "Chat", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_578660077$lambda$36(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1411@76386L707:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(578660077, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$578660077.<anonymous> (DashboardScreen.kt:1411)");
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
            ComposerKt.sourceInformationMarkerStart(composer, -176780961, "C1415@76648L114,1416@76799L39,1417@76932L10,1417@76875L184:DashboardScreen.kt#2thlc2");
            IconKt.Icon-ww6aTOc(ScheduleKt.getSchedule(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), ColorKt.Color(4293284096L), composer, 3504, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextKt.Text--4IGK_g("Requested • Awaiting Owner", (Modifier) null, ColorKt.Color(4293284096L), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.getEllipsis-gIe3tQ8(), false, 1, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 390, 3120, 55290);
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

    static final Unit lambda_1778608708$lambda$37(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C1424@77353L96,1425@77482L39,1426@77554L26:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1778608708, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$1778608708.<anonymous> (DashboardScreen.kt:1424)");
            }
            IconKt.Icon-ww6aTOc(ChatKt.getChat(Icons.AutoMirrored.Filled.INSTANCE), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Chat", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1) null, (TextStyle) null, composer, 6, 3072, 122878);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_378370939$lambda$38(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C1433@78033L11,1433@77996L69:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(378370939, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$378370939.<anonymous> (DashboardScreen.kt:1433)");
            }
            TextKt.Text--4IGK_g("Cancel", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1) null, (TextStyle) null, composer, 6, 3072, 122874);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__366714007$lambda$39(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1444@78567L10,1446@78710L11,1442@78444L324:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-366714007, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$-366714007.<anonymous> (DashboardScreen.kt:1442)");
            }
            TextKt.Text--4IGK_g("Requested by another reader", PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 54, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1005329224$lambda$40(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1455@79213L89,1456@79335L39,1457@79407L35:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1005329224, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$-1005329224.<anonymous> (DashboardScreen.kt:1455)");
            }
            IconKt.Icon-ww6aTOc(CameraAltKt.getCameraAlt(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextKt.Text--4IGK_g("Handover Scan", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1) null, (TextStyle) null, composer, 6, 3072, 122878);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_2069238458$lambda$41(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C1465@79960L11,1465@79923L69:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2069238458, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$2069238458.<anonymous> (DashboardScreen.kt:1465)");
            }
            TextKt.Text--4IGK_g("Cancel", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1) null, (TextStyle) null, composer, 6, 3072, 122874);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_2085371538$lambda$42(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C1490@81620L11,1490@81661L10,1490@81583L100:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2085371538, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$2085371538.<anonymous> (DashboardScreen.kt:1490)");
            }
            TextKt.Text--4IGK_g("Cancel", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 6, 0, 65530);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1572241257$lambda$43(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1540@84933L87,1541@85053L39,1542@85171L10,1542@85125L68:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1572241257, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$-1572241257.<anonymous> (DashboardScreen.kt:1540)");
            }
            IconKt.Icon-ww6aTOc(QrCode2Kt.getQrCode2(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Step 2: Show QR", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 6, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_160951310$lambda$44(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1551@85749L91,1552@85873L39,1553@85990L10,1553@85945L67:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(160951310, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$160951310.<anonymous> (DashboardScreen.kt:1551)");
            }
            IconKt.Icon-ww6aTOc(CheckCircleKt.getCheckCircle(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Step 3: Accept", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 6, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1502326425$lambda$45(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C1562@86632L11,1562@86673L10,1562@86595L100:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1502326425, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$1502326425.<anonymous> (DashboardScreen.kt:1562)");
            }
            TextKt.Text--4IGK_g("Cancel", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 6, 0, 65530);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_922741888$lambda$46(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1568@87125L93,1569@87251L39,1570@87369L10,1570@87323L68:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(922741888, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$922741888.<anonymous> (DashboardScreen.kt:1568)");
            }
            IconKt.Icon-ww6aTOc(QrCodeScannerKt.getQrCodeScanner(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextKt.Text--4IGK_g("Step 2: Scan QR", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 6, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_644784642$lambda$47(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C1578@87909L11,1578@87950L10,1578@87872L100:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(644784642, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$644784642.<anonymous> (DashboardScreen.kt:1578)");
            }
            TextKt.Text--4IGK_g("Cancel", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 6, 0, 65530);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1221080082$lambda$48(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1590@88526L89,1591@88644L39,1592@88712L24:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1221080082, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$1221080082.<anonymous> (DashboardScreen.kt:1590)");
            }
            IconKt.Icon-ww6aTOc(CameraAltKt.getCameraAlt(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextKt.Text--4IGK_g("Return Book Scan", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1588901973$lambda$49(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1639@91713L87,1640@91833L39,1641@91943L10,1641@91905L60:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1588901973, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$1588901973.<anonymous> (DashboardScreen.kt:1639)");
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

    static final Unit lambda_368502359$lambda$50(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C1647@92252L93,1648@92378L39,1649@92488L10,1649@92450L60:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(368502359, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$368502359.<anonymous> (DashboardScreen.kt:1647)");
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

    static final Unit lambda__972872756$lambda$51(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1656@92896L91,1657@93020L39,1658@93129L10,1658@93092L59:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-972872756, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$-972872756.<anonymous> (DashboardScreen.kt:1656)");
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

    static final Unit lambda__1574301125$lambda$52(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1693@95489L93,1694@95623L39,1695@95741L10,1695@95703L60:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1574301125, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$-1574301125.<anonymous> (DashboardScreen.kt:1693)");
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

    static final Unit lambda__1516915719$lambda$53(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C1702@96175L87,1703@96303L39,1704@96421L10,1704@96383L60:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1516915719, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$-1516915719.<anonymous> (DashboardScreen.kt:1702)");
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

    static final Unit lambda__1291560414$lambda$54(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C1712@97023L11,1712@97064L10,1712@96986L100:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1291560414, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$-1291560414.<anonymous> (DashboardScreen.kt:1712)");
            }
            TextKt.Text--4IGK_g("Cancel", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 6, 0, 65530);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__2100622594$lambda$55(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1848@102747L11,1845@102563L298:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2100622594, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$-2100622594.<anonymous> (DashboardScreen.kt:1845)");
            }
            IconKt.Icon-ww6aTOc(ChatKt.getChat(Icons.AutoMirrored.Filled.INSTANCE), "Chat", SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(14.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_54015746$lambda$56(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C1900@105651L96,1901@105784L39,1902@105895L10,1902@105860L71:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(54015746, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$54015746.<anonymous> (DashboardScreen.kt:1900)");
            }
            IconKt.Icon-ww6aTOc(ChatKt.getChat(Icons.AutoMirrored.Filled.INSTANCE), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(12.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(2.0f)), composer, 6);
            TextKt.Text--4IGK_g("Chat", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 6, 3072, 57342);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_393993856$lambda$57(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1909@106371L10,1909@106333L74:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(393993856, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$393993856.<anonymous> (DashboardScreen.kt:1909)");
            }
            TextKt.Text--4IGK_g("Request", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 6, 3072, 57342);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__116347673$lambda$58(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C1918@106855L96,1919@106984L39,1920@107096L10,1920@107056L76:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-116347673, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$-116347673.<anonymous> (DashboardScreen.kt:1918)");
            }
            IconKt.Icon-ww6aTOc(ChatKt.getChat(Icons.AutoMirrored.Filled.INSTANCE), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(12.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(2.0f)), composer, 6);
            TextKt.Text--4IGK_g("Inquiries", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 6, 3072, 57342);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1054025257$lambda$59(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1933@107910L10,1933@107873L59:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1054025257, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$1054025257.<anonymous> (DashboardScreen.kt:1933)");
            }
            TextKt.Text--4IGK_g("Accept", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 6, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_752576043$lambda$60(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C1940@108348L10,1940@108310L60:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(752576043, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$752576043.<anonymous> (DashboardScreen.kt:1940)");
            }
            TextKt.Text--4IGK_g("Decline", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 6, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1565603901$lambda$61(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1952@109109L10,1950@108986L455:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1565603901, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$1565603901.<anonymous> (DashboardScreen.kt:1950)");
            }
            TextStyle labelSmall = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall();
            TextKt.Text--4IGK_g("Requested ⏳", PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(4.0f), Dp.constructor-impl(4.0f)), ColorKt.Color(4293284096L), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.box-impl(TextAlign.Companion.getCenter-e0LSkKk()), 0L, 0, false, 0, 0, (Function1) null, labelSmall, composer, 438, 0, 65016);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__637465964$lambda$62(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C1964@109993L11,1964@110034L10,1964@109956L100:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-637465964, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$-637465964.<anonymous> (DashboardScreen.kt:1964)");
            }
            TextKt.Text--4IGK_g("Cancel", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 6, 0, 65530);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__474141532$lambda$63(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1972@110501L10,1972@110462L61:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-474141532, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$-474141532.<anonymous> (DashboardScreen.kt:1972)");
            }
            TextKt.Text--4IGK_g("Handover", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 6, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1879837671$lambda$64(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1980@111108L10,1980@111070L60:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1879837671, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$1879837671.<anonymous> (DashboardScreen.kt:1980)");
            }
            TextKt.Text--4IGK_g("Show QR", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 6, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__319969698$lambda$65(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1983@111493L10,1983@111456L59:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-319969698, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$-319969698.<anonymous> (DashboardScreen.kt:1983)");
            }
            TextKt.Text--4IGK_g("Cancel", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 6, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_2118232272$lambda$66(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1989@111993L10,1989@111955L60:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2118232272, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$2118232272.<anonymous> (DashboardScreen.kt:1989)");
            }
            TextKt.Text--4IGK_g("Scan QR", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 6, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1227260295$lambda$67(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1992@112376L10,1992@112339L59:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1227260295, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$1227260295.<anonymous> (DashboardScreen.kt:1992)");
            }
            TextKt.Text--4IGK_g("Cancel", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 6, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_351670882$lambda$68(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C2005@113133L10,2005@113091L64:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(351670882, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$351670882.<anonymous> (DashboardScreen.kt:2005)");
            }
            TextKt.Text--4IGK_g("Return Scan", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 6, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1589317211$lambda$69(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C2018@113951L10,2018@113913L60:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1589317211, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$-1589317211.<anonymous> (DashboardScreen.kt:2018)");
            }
            TextKt.Text--4IGK_g("Show QR", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 6, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1890766425$lambda$70(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C2025@114396L10,2025@114358L60:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1890766425, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$-1890766425.<anonymous> (DashboardScreen.kt:2025)");
            }
            TextKt.Text--4IGK_g("Scan QR", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 6, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1350922610$lambda$71(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C2036@115188L10,2036@115150L60:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1350922610, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$-1350922610.<anonymous> (DashboardScreen.kt:2036)");
            }
            TextKt.Text--4IGK_g("Scan QR", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 6, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1014158864$lambda$72(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C2043@115633L10,2043@115595L60:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1014158864, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$1014158864.<anonymous> (DashboardScreen.kt:2043)");
            }
            TextKt.Text--4IGK_g("Show QR", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 6, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_2053072709$lambda$73(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C2051@116197L10,2051@116160L59:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2053072709, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$2053072709.<anonymous> (DashboardScreen.kt:2051)");
            }
            TextKt.Text--4IGK_g("Cancel", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 6, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_23645036$lambda$74(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2097@118426L11,2097@118342L102:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(23645036, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$23645036.<anonymous> (DashboardScreen.kt:2097)");
            }
            IconKt.Icon-ww6aTOc(DeleteKt.getDelete(Icons.INSTANCE.getDefault()), "Delete Book", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU(), composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1754543887$lambda$77(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2117@118988L56:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1754543887, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$-1754543887.<anonymous> (DashboardScreen.kt:2117)");
            }
            TextKt.Text--4IGK_g("Feedback & Support", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 196614, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_679296170$lambda$78(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C2133@119801L51,2134@119873L28,2135@119922L26:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(679296170, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$679296170.<anonymous> (DashboardScreen.kt:2133)");
            }
            IconKt.Icon-ww6aTOc(StarKt.getStar(Icons.INSTANCE.getDefault()), (String) null, (Modifier) null, 0L, composer, 48, 12);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            TextKt.Text--4IGK_g("Rate on Play Store", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1779344448$lambda$79(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2173@121583L45:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1779344448, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$-1779344448.<anonymous> (DashboardScreen.kt:2173)");
            }
            TextKt.Text--4IGK_g("Describe your feedback or thoughts...", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1071646331$lambda$75(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C2197@122623L14:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1071646331, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$-1071646331.<anonymous> (DashboardScreen.kt:2197)");
            }
            TextKt.Text--4IGK_g("Submit", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_909010070$lambda$76(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$TextButton");
        ComposerKt.sourceInformation(composer, "C2202@122751L13:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(909010070, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$909010070.<anonymous> (DashboardScreen.kt:2202)");
            }
            TextKt.Text--4IGK_g("Close", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1225387359$lambda$80(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2250@124438L11,2247@124274L214:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1225387359, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$1225387359.<anonymous> (DashboardScreen.kt:2247)");
            }
            IconKt.Icon-ww6aTOc(CloseKt.getClose(Icons.INSTANCE.getDefault()), "Close", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_495501679$lambda$82(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2308@126952L905:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(495501679, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$495501679.<anonymous> (DashboardScreen.kt:2308)");
            }
            Modifier modifier = PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(14.0f), Dp.constructor-impl(6.0f));
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
            ComposerKt.sourceInformationMarkerStart(composer, -1218350501, "C2315@127331L11,2312@127166L271,2318@127462L39,2321@127647L10,2323@127779L11,2319@127526L309:DashboardScreen.kt#2thlc2");
            IconKt.Icon-ww6aTOc(AutoStoriesKt.getAutoStories(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 432, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextStyle labelMedium = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelMedium();
            TextKt.Text--4IGK_g("Grade 9 Student & Android Creator", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnPrimaryContainer-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, labelMedium, composer, 196614, 0, 65498);
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

    static final Unit lambda_1332307430$lambda$84(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2334@128176L1434:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1332307430, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$1332307430.<anonymous> (DashboardScreen.kt:2334)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f));
            Arrangement.Vertical vertical = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(8.0f));
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
            ComposerKt.sourceInformationMarkerStart(composer, -911542996, "C2340@128474L10,2342@128605L11,2338@128365L285,2346@128952L10,2347@129025L11,2344@128675L452,2352@129413L10,2353@129486L11,2350@129152L436:DashboardScreen.kt#2thlc2");
            TextStyle titleSmall = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleSmall();
            TextKt.Text--4IGK_g("📖 My Story & Mission", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, titleSmall, composer, 196614, 0, 65498);
            TextKt.Text--4IGK_g("I am a passionate 9th-grade student and a self-taught developer with an avid love for reading books. I build practical, high-quality apps designed to bring genuine value to everyday people.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(20), 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 6, 6, 64506);
            TextKt.Text--4IGK_g("BookXchange was created with a vision to connect local book lovers, promote affordable peer-to-peer reading, and build a trusted, vibrant reading community without barriers!", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(20), 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 6, 6, 64506);
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

    static final Unit lambda_1508635687$lambda$86(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2365@129930L945:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1508635687, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$1508635687.<anonymous> (DashboardScreen.kt:2365)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f));
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
            ComposerKt.sourceInformationMarkerStart(composer, -661456876, "C2371@130234L10,2373@130365L11,2369@130119L291,2377@130679L10,2378@130751L11,2375@130435L418:DashboardScreen.kt#2thlc2");
            TextStyle titleSmall = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleSmall();
            TextKt.Text--4IGK_g("⚡ Technology & Architecture", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, titleSmall, composer, 196614, 0, 65498);
            TextKt.Text--4IGK_g("• 100% Kotlin & Jetpack Compose (Material 3)\n• Firebase Firestore Real-Time Sync\n• Google Gemini AI Scanner & Moderation\n• End-to-End Secure Architecture", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(18), 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 6, 6, 64506);
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

    static final Unit lambda_1684963944$lambda$89(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2390@131198L1242:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1684963944, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$1684963944.<anonymous> (DashboardScreen.kt:2390)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(14.0f));
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
            ComposerKt.sourceInformationMarkerStart(composer, -1911781837, "C2397@131541L11,2394@131382L265,2400@131672L40,2401@131737L681:DashboardScreen.kt#2thlc2");
            IconKt.Icon-ww6aTOc(EmailKt.getEmail(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(20.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 432, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f)), composer, 6);
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
            ComposerKt.sourceInformationMarkerStart(composer, 186439819, "C2404@131898L10,2405@131975L11,2402@131774L280,2409@132205L10,2411@132343L11,2407@132083L309:DashboardScreen.kt#2thlc2");
            TextKt.Text--4IGK_g("Developer Contact & Feedback", (Modifier) null, Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnPrimaryContainer-0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 6, 0, 65530);
            TextStyle bodySmall = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall();
            TextKt.Text--4IGK_g("bookxchange.care@gmail.com", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, bodySmall, composer, 196614, 0, 65498);
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

    static final Unit lambda_1861292201$lambda$91(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2423@132770L843:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1861292201, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$1861292201.<anonymous> (DashboardScreen.kt:2423)");
            }
            Modifier modifier = PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(14.0f), Dp.constructor-impl(10.0f));
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer, 54);
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
            ComposerKt.sourceInformationMarkerStart(composer, -1661696182, "C2430@133158L10,2431@133230L11,2428@133059L225,2435@133414L10,2437@133546L11,2433@133309L282:DashboardScreen.kt#2thlc2");
            TextKt.Text--4IGK_g("App Version", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 65530);
            TextStyle labelMedium = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelMedium();
            TextKt.Text--4IGK_g("v1.47 (Build 147)", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, labelMedium, composer, 196614, 0, 65498);
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

    static final Unit lambda__661557879$lambda$92(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C2455@134125L43:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-661557879, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$-661557879.<anonymous> (DashboardScreen.kt:2455)");
            }
            TextKt.Text--4IGK_g("Close", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 196614, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__397961802$lambda$94(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2488@135302L117:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-397961802, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$-397961802.<anonymous> (DashboardScreen.kt:2488)");
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
            ComposerKt.sourceInformationMarkerStart(composer, -1802620105, "C2489@135369L28:DashboardScreen.kt#2thlc2");
            TextKt.Text--4IGK_g("🌱", (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 3078, 0, 131062);
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

    static final Unit lambda__461865392$lambda$95(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2506@136200L353:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-461865392, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$-461865392.<anonymous> (DashboardScreen.kt:2506)");
            }
            long sp = TextUnitKt.getSp(9);
            FontWeight extraBold = FontWeight.Companion.getExtraBold();
            TextKt.Text--4IGK_g("LIVE", PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(5.0f), Dp.constructor-impl(1.0f)), ColorKt.Color(4278556265L), sp, (FontStyle) null, extraBold, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 200118, 0, 131024);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1925528431$lambda$96(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2529@137215L243:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1925528431, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$1925528431.<anonymous> (DashboardScreen.kt:2529)");
            }
            IconKt.Icon-ww6aTOc(ShareKt.getShare(Icons.INSTANCE.getDefault()), "Share Eco Impact", SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), ColorKt.Color(4278556265L), composer, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1049938387$lambda$97(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2543@137795L10,2541@137699L328:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1049938387, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$-1049938387.<anonymous> (DashboardScreen.kt:2541)");
            }
            TextStyle labelSmall = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall();
            FontWeight bold = FontWeight.Companion.getBold();
            TextKt.Text--4IGK_g("Impact 🏆", PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(10.0f), Dp.constructor-impl(5.0f)), Color.Companion.getWhite-0d7_KjU(), 0L, (FontStyle) null, bold, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, labelSmall, composer, 197046, 0, 65496);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1432265395$lambda$99(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2579@139105L117:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1432265395, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$1432265395.<anonymous> (DashboardScreen.kt:2579)");
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
            ComposerKt.sourceInformationMarkerStart(composer, -197888742, "C2580@139172L28:DashboardScreen.kt#2thlc2");
            TextKt.Text--4IGK_g("🔥", (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 3078, 0, 131062);
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

    static final Unit lambda_1814009743$lambda$100(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2622@141192L10,2620@141106L302:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1814009743, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$1814009743.<anonymous> (DashboardScreen.kt:2620)");
            }
            TextStyle labelSmall = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall();
            FontWeight bold = FontWeight.Companion.getBold();
            TextKt.Text--4IGK_g("+10m 📖", PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(10.0f), Dp.constructor-impl(5.0f)), Color.Companion.getWhite-0d7_KjU(), 0L, (FontStyle) null, bold, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, labelSmall, composer, 197046, 0, 65496);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1795038698$lambda$107(ColumnScope columnScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(columnScope, "$this$Card");
        ComposerKt.sourceInformation(composer, "C2641@141907L2145:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1795038698, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$-1795038698.<anonymous> (DashboardScreen.kt:2641)");
            }
            Modifier modifier = PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(14.0f), Dp.constructor-impl(11.0f));
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer, 54);
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
            ComposerKt.sourceInformationMarkerStart(composer, -1929815649, "C2646@142136L1400,2680@143648L11,2678@143550L492:DashboardScreen.kt#2thlc2");
            Alignment.Vertical centerVertically2 = Alignment.Companion.getCenterVertically();
            Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.Companion, 1.0f, false, 2, (Object) null);
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer, 48);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierWeight$default);
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
            Updater.set-impl(composer3, measurePolicyRowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer3, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composer3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composer3.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.set-impl(composer3, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope2 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1202787023, "C2647@142238L545,2661@142800L40,2662@142857L665:DashboardScreen.kt#2thlc2");
            SurfaceKt.Surface-T9BRK9s(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(36.0f)), RoundedCornerShapeKt.getCircleShape(), ColorKt.Color(4279994175L), 0L, 0.0f, 0.0f, (BorderStroke) null, f124lambda$453077997, composer, 12583302, 120);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f)), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier2 = Modifier.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
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
            Composer composer4 = Updater.constructor-impl(composer);
            Updater.set-impl(composer4, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer4, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer4.getInserting() || !Intrinsics.areEqual(composer4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composer4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composer4.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.set-impl(composer4, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScope columnScope2 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -91674239, "C2665@142991L10,2667@143119L11,2663@142886L285,2671@143323L10,2672@143391L11,2669@143192L312:DashboardScreen.kt#2thlc2");
            TextStyle titleSmall = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleSmall();
            TextKt.Text--4IGK_g("AI Book Matchmaker", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnPrimaryContainer-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, titleSmall, composer, 196614, 0, 65498);
            TextKt.Text--4IGK_g("Discover books tailored to your reading vibe", (Modifier) null, Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnPrimaryContainer-0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, (Object) null), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 3078, 0, 65522);
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
            SurfaceKt.Surface-T9BRK9s((Modifier) null, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(20.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0L, 0.0f, 0.0f, (BorderStroke) null, lambda$2114251191, composer, 12582912, 121);
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

    static final Unit lambda__453077997$lambda$102(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2652@142427L338:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-453077997, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$-453077997.<anonymous> (DashboardScreen.kt:2652)");
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
            ComposerKt.sourceInformationMarkerStart(composer, 867639217, "C2653@142494L249:DashboardScreen.kt#2thlc2");
            IconKt.Icon-ww6aTOc(AutoAwesomeKt.getAutoAwesome(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), Color.Companion.getWhite-0d7_KjU(), composer, 3504, 0);
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

    static final Unit lambda_2114251191$lambda$103(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2684@143788L10,2686@143903L11,2682@143700L328:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2114251191, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$2114251191.<anonymous> (DashboardScreen.kt:2682)");
            }
            TextStyle labelSmall = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall();
            FontWeight bold = FontWeight.Companion.getBold();
            TextKt.Text--4IGK_g("Explore ✨", PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(10.0f), Dp.constructor-impl(5.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnPrimary-0d7_KjU(), 0L, (FontStyle) null, bold, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, labelSmall, composer, 196662, 0, 65496);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1558931151$lambda$109(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2712@144899L333:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1558931151, i, -1, "com.example.ui.screens.ComposableSingletons$DashboardScreenKt.lambda$-1558931151.<anonymous> (DashboardScreen.kt:2712)");
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
            ComposerKt.sourceInformationMarkerStart(composer, -1451434244, "C2716@145112L11,2713@144962L252:DashboardScreen.kt#2thlc2");
            IconKt.Icon-ww6aTOc(BookmarkKt.getBookmark(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSecondary-0d7_KjU(), composer, 432, 0);
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
}
