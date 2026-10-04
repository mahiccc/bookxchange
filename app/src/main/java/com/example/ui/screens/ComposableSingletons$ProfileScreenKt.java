package com.example.ui.screens;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
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
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.LogoutKt;
import androidx.compose.material.icons.automirrored.filled.MenuBookKt;
import androidx.compose.material.icons.filled.AddKt;
import androidx.compose.material.icons.filled.AutoStoriesKt;
import androidx.compose.material.icons.filled.BookmarkAddKt;
import androidx.compose.material.icons.filled.BookmarkBorderKt;
import androidx.compose.material.icons.filled.BookmarkKt;
import androidx.compose.material.icons.filled.BuildKt;
import androidx.compose.material.icons.filled.CameraAltKt;
import androidx.compose.material.icons.filled.ChevronRightKt;
import androidx.compose.material.icons.filled.DeleteOutlineKt;
import androidx.compose.material.icons.filled.EditKt;
import androidx.compose.material.icons.filled.PersonKt;
import androidx.compose.material.icons.filled.RateReviewKt;
import androidx.compose.material.icons.filled.ShareKt;
import androidx.compose.material.icons.filled.SwapHorizKt;
import androidx.compose.material3.DividerKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.example.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ProfileScreen.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class ComposableSingletons$ProfileScreenKt {
    public static final ComposableSingletons$ProfileScreenKt INSTANCE = new ComposableSingletons$ProfileScreenKt();
    private static Function3<RowScope, Composer, Integer, Unit> lambda$457126465 = ComposableLambdaKt.composableLambdaInstance(457126465, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda0
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ProfileScreenKt.lambda_457126465$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1319308134, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f149lambda$1319308134 = ComposableLambdaKt.composableLambdaInstance(-1319308134, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ProfileScreenKt.lambda__1319308134$lambda$1((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1888712666, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f152lambda$1888712666 = ComposableLambdaKt.composableLambdaInstance(-1888712666, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda14
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ProfileScreenKt.lambda__1888712666$lambda$2((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$571825871 = ComposableLambdaKt.composableLambdaInstance(571825871, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda26
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ProfileScreenKt.lambda_571825871$lambda$3((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1260382629 = ComposableLambdaKt.composableLambdaInstance(1260382629, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda32
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ProfileScreenKt.lambda_1260382629$lambda$4((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-292392522, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f158lambda$292392522 = ComposableLambdaKt.composableLambdaInstance(-292392522, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda34
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ProfileScreenKt.lambda__292392522$lambda$5((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1947054414, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f154lambda$1947054414 = ComposableLambdaKt.composableLambdaInstance(-1947054414, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda35
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ProfileScreenKt.lambda__1947054414$lambda$6((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-2079378159, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f155lambda$2079378159 = ComposableLambdaKt.composableLambdaInstance(-2079378159, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda36
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ProfileScreenKt.lambda__2079378159$lambda$7((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$2083265392 = ComposableLambdaKt.composableLambdaInstance(2083265392, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda37
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ProfileScreenKt.lambda_2083265392$lambda$8((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-705636684, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f164lambda$705636684 = ComposableLambdaKt.composableLambdaInstance(-705636684, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda38
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ProfileScreenKt.lambda__705636684$lambda$9((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1343009822, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f150lambda$1343009822 = ComposableLambdaKt.composableLambdaInstance(-1343009822, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda11
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ProfileScreenKt.lambda__1343009822$lambda$10((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$797395595 = ComposableLambdaKt.composableLambdaInstance(797395595, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda22
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ProfileScreenKt.lambda_797395595$lambda$11((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$406723659 = ComposableLambdaKt.composableLambdaInstance(406723659, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda33
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ProfileScreenKt.lambda_406723659$lambda$14((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-2143663289, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f156lambda$2143663289 = ComposableLambdaKt.composableLambdaInstance(-2143663289, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda39
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ProfileScreenKt.lambda__2143663289$lambda$15((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1443702511 = ComposableLambdaKt.composableLambdaInstance(1443702511, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda40
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ProfileScreenKt.lambda_1443702511$lambda$16((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$120362451 = ComposableLambdaKt.composableLambdaInstance(120362451, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda41
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ProfileScreenKt.lambda_120362451$lambda$17((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1911845622, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f153lambda$1911845622 = ComposableLambdaKt.composableLambdaInstance(-1911845622, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda42
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ProfileScreenKt.lambda__1911845622$lambda$18((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-615390708, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f162lambda$615390708 = ComposableLambdaKt.composableLambdaInstance(-615390708, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda43
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ProfileScreenKt.lambda__615390708$lambda$19((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$32836749 = ComposableLambdaKt.composableLambdaInstance(32836749, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda44
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ProfileScreenKt.lambda_32836749$lambda$20((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$681064206 = ComposableLambdaKt.composableLambdaInstance(681064206, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda1
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ProfileScreenKt.lambda_681064206$lambda$21((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-662875800, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f163lambda$662875800 = ComposableLambdaKt.composableLambdaInstance(-662875800, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ProfileScreenKt.lambda__662875800$lambda$22((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$2079316345 = ComposableLambdaKt.composableLambdaInstance(2079316345, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda4
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ProfileScreenKt.lambda_2079316345$lambda$23((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$424654453 = ComposableLambdaKt.composableLambdaInstance(424654453, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda5
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ProfileScreenKt.lambda_424654453$lambda$24((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$292330708 = ComposableLambdaKt.composableLambdaInstance(292330708, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda6
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ProfileScreenKt.lambda_292330708$lambda$25((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$2146071203 = ComposableLambdaKt.composableLambdaInstance(2146071203, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda7
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ProfileScreenKt.lambda_2146071203$lambda$26((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1303961943, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f148lambda$1303961943 = ComposableLambdaKt.composableLambdaInstance(-1303961943, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda8
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ProfileScreenKt.lambda__1303961943$lambda$27((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1438230202 = ComposableLambdaKt.composableLambdaInstance(1438230202, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda9
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ProfileScreenKt.lambda_1438230202$lambda$28((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-216431690, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f157lambda$216431690 = ComposableLambdaKt.composableLambdaInstance(-216431690, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda10
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ProfileScreenKt.lambda__216431690$lambda$29((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-348755435, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f160lambda$348755435 = ComposableLambdaKt.composableLambdaInstance(-348755435, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda12
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ProfileScreenKt.lambda__348755435$lambda$30((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1504985060 = ComposableLambdaKt.composableLambdaInstance(1504985060, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda13
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ProfileScreenKt.lambda_1504985060$lambda$31((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-300518235, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f159lambda$300518235 = ComposableLambdaKt.composableLambdaInstance(-300518235, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda15
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ProfileScreenKt.lambda__300518235$lambda$32((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$2014956429 = ComposableLambdaKt.composableLambdaInstance(2014956429, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda16
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ProfileScreenKt.lambda_2014956429$lambda$33((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$2093077518 = ComposableLambdaKt.composableLambdaInstance(2093077518, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda17
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ProfileScreenKt.lambda_2093077518$lambda$34((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$297010338 = ComposableLambdaKt.composableLambdaInstance(297010338, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda18
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ProfileScreenKt.lambda_297010338$lambda$36((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$837332741 = ComposableLambdaKt.composableLambdaInstance(837332741, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda19
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ProfileScreenKt.lambda_837332741$lambda$37((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1198244877, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f147lambda$1198244877 = ComposableLambdaKt.composableLambdaInstance(-1198244877, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda20
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ProfileScreenKt.lambda__1198244877$lambda$38((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$883711041 = ComposableLambdaKt.composableLambdaInstance(883711041, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda21
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ProfileScreenKt.lambda_883711041$lambda$39((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$520156255 = ComposableLambdaKt.composableLambdaInstance(520156255, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda23
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ProfileScreenKt.lambda_520156255$lambda$41((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-390328063, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f161lambda$390328063 = ComposableLambdaKt.composableLambdaInstance(-390328063, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda24
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ProfileScreenKt.lambda__390328063$lambda$42((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1614291527 = ComposableLambdaKt.composableLambdaInstance(1614291527, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda25
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ProfileScreenKt.lambda_1614291527$lambda$44((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$286751272 = ComposableLambdaKt.composableLambdaInstance(286751272, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda27
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ProfileScreenKt.lambda_286751272$lambda$45((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$118443651 = ComposableLambdaKt.composableLambdaInstance(118443651, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda28
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ProfileScreenKt.lambda_118443651$lambda$47((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$806449441 = ComposableLambdaKt.composableLambdaInstance(806449441, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda29
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ProfileScreenKt.lambda_806449441$lambda$48((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1676766906, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f151lambda$1676766906 = ComposableLambdaKt.composableLambdaInstance(-1676766906, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda30
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ProfileScreenKt.lambda__1676766906$lambda$49((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1897988936 = ComposableLambdaKt.composableLambdaInstance(1897988936, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ProfileScreenKt$$ExternalSyntheticLambda31
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ProfileScreenKt.lambda_1897988936$lambda$50((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-1198244877$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m328getLambda$1198244877$app() {
        return f147lambda$1198244877;
    }

    /* JADX INFO: renamed from: getLambda$-1303961943$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m329getLambda$1303961943$app() {
        return f148lambda$1303961943;
    }

    /* JADX INFO: renamed from: getLambda$-1319308134$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m330getLambda$1319308134$app() {
        return f149lambda$1319308134;
    }

    /* JADX INFO: renamed from: getLambda$-1343009822$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m331getLambda$1343009822$app() {
        return f150lambda$1343009822;
    }

    /* JADX INFO: renamed from: getLambda$-1676766906$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m332getLambda$1676766906$app() {
        return f151lambda$1676766906;
    }

    /* JADX INFO: renamed from: getLambda$-1888712666$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m333getLambda$1888712666$app() {
        return f152lambda$1888712666;
    }

    /* JADX INFO: renamed from: getLambda$-1911845622$app, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m334getLambda$1911845622$app() {
        return f153lambda$1911845622;
    }

    /* JADX INFO: renamed from: getLambda$-1947054414$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m335getLambda$1947054414$app() {
        return f154lambda$1947054414;
    }

    /* JADX INFO: renamed from: getLambda$-2079378159$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m336getLambda$2079378159$app() {
        return f155lambda$2079378159;
    }

    /* JADX INFO: renamed from: getLambda$-2143663289$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m337getLambda$2143663289$app() {
        return f156lambda$2143663289;
    }

    /* JADX INFO: renamed from: getLambda$-216431690$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m338getLambda$216431690$app() {
        return f157lambda$216431690;
    }

    /* JADX INFO: renamed from: getLambda$-292392522$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m339getLambda$292392522$app() {
        return f158lambda$292392522;
    }

    /* JADX INFO: renamed from: getLambda$-300518235$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m340getLambda$300518235$app() {
        return f159lambda$300518235;
    }

    /* JADX INFO: renamed from: getLambda$-348755435$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m341getLambda$348755435$app() {
        return f160lambda$348755435;
    }

    /* JADX INFO: renamed from: getLambda$-390328063$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m342getLambda$390328063$app() {
        return f161lambda$390328063;
    }

    /* JADX INFO: renamed from: getLambda$-615390708$app, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m343getLambda$615390708$app() {
        return f162lambda$615390708;
    }

    /* JADX INFO: renamed from: getLambda$-662875800$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m344getLambda$662875800$app() {
        return f163lambda$662875800;
    }

    /* JADX INFO: renamed from: getLambda$-705636684$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m345getLambda$705636684$app() {
        return f164lambda$705636684;
    }

    public final Function2<Composer, Integer, Unit> getLambda$118443651$app() {
        return lambda$118443651;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$120362451$app() {
        return lambda$120362451;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1260382629$app() {
        return lambda$1260382629;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1438230202$app() {
        return lambda$1438230202;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1443702511$app() {
        return lambda$1443702511;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1504985060$app() {
        return lambda$1504985060;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1614291527$app() {
        return lambda$1614291527;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1897988936$app() {
        return lambda$1897988936;
    }

    public final Function2<Composer, Integer, Unit> getLambda$2014956429$app() {
        return lambda$2014956429;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$2079316345$app() {
        return lambda$2079316345;
    }

    public final Function2<Composer, Integer, Unit> getLambda$2083265392$app() {
        return lambda$2083265392;
    }

    public final Function2<Composer, Integer, Unit> getLambda$2093077518$app() {
        return lambda$2093077518;
    }

    public final Function2<Composer, Integer, Unit> getLambda$2146071203$app() {
        return lambda$2146071203;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$286751272$app() {
        return lambda$286751272;
    }

    public final Function2<Composer, Integer, Unit> getLambda$292330708$app() {
        return lambda$292330708;
    }

    public final Function2<Composer, Integer, Unit> getLambda$297010338$app() {
        return lambda$297010338;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$32836749$app() {
        return lambda$32836749;
    }

    public final Function2<Composer, Integer, Unit> getLambda$406723659$app() {
        return lambda$406723659;
    }

    public final Function2<Composer, Integer, Unit> getLambda$424654453$app() {
        return lambda$424654453;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$457126465$app() {
        return lambda$457126465;
    }

    public final Function2<Composer, Integer, Unit> getLambda$520156255$app() {
        return lambda$520156255;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$571825871$app() {
        return lambda$571825871;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$681064206$app() {
        return lambda$681064206;
    }

    public final Function2<Composer, Integer, Unit> getLambda$797395595$app() {
        return lambda$797395595;
    }

    public final Function2<Composer, Integer, Unit> getLambda$806449441$app() {
        return lambda$806449441;
    }

    public final Function2<Composer, Integer, Unit> getLambda$837332741$app() {
        return lambda$837332741;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$883711041$app() {
        return lambda$883711041;
    }

    static final Unit lambda__1319308134$lambda$1(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C131@6333L30:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1319308134, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$-1319308134.<anonymous> (ProfileScreen.kt:131)");
            }
            TextKt.Text--4IGK_g("Update Profile Picture", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1888712666$lambda$2(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$TextButton");
        ComposerKt.sourceInformation(composer, "C141@6735L20:ProfileScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1888712666, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$-1888712666.<anonymous> (ProfileScreen.kt:141)");
            }
            TextKt.Text--4IGK_g("Take a Photo", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_571825871$lambda$3(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$TextButton");
        ComposerKt.sourceInformation(composer, "C150@7103L27:ProfileScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(571825871, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$571825871.<anonymous> (ProfileScreen.kt:150)");
            }
            TextKt.Text--4IGK_g("Choose from Gallery", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_457126465$lambda$0(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$TextButton");
        ComposerKt.sourceInformation(composer, "C156@7310L14:ProfileScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(457126465, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$457126465.<anonymous> (ProfileScreen.kt:156)");
            }
            TextKt.Text--4IGK_g("Cancel", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1947054414$lambda$6(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C171@7754L11,168@7606L236:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1947054414, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$-1947054414.<anonymous> (ProfileScreen.kt:168)");
            }
            IconKt.Icon-ww6aTOc(LogoutKt.getLogout(Icons.AutoMirrored.Filled.INSTANCE), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(32.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU(), composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__2079378159$lambda$7(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C176@7896L45:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2079378159, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$-2079378159.<anonymous> (ProfileScreen.kt:176)");
            }
            TextKt.Text--4IGK_g("Log Out", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 196614, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_2083265392$lambda$8(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C179@7994L56:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2083265392, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$2083265392.<anonymous> (ProfileScreen.kt:179)");
            }
            TextKt.Text--4IGK_g("Are you sure you want to log out of BookXchange?", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1260382629$lambda$4(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C189@8418L15:ProfileScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1260382629, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$1260382629.<anonymous> (ProfileScreen.kt:189)");
            }
            TextKt.Text--4IGK_g("Log Out", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__292392522$lambda$5(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$TextButton");
        ComposerKt.sourceInformation(composer, "C194@8593L14:ProfileScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-292392522, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$-292392522.<anonymous> (ProfileScreen.kt:194)");
            }
            TextKt.Text--4IGK_g("Cancel", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__705636684$lambda$9(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C203@8793L10,203@8752L67:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-705636684, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$-705636684.<anonymous> (ProfileScreen.kt:203)");
            }
            TextKt.Text--4IGK_g("My Profile", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getHeadlineMedium(), composer, 6, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1343009822$lambda$10(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C209@9122L11,206@8950L217:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1343009822, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$-1343009822.<anonymous> (ProfileScreen.kt:206)");
            }
            IconKt.Icon-ww6aTOc(BuildKt.getBuild(Icons.INSTANCE.getDefault()), "About Developer", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_797395595$lambda$11(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C216@9470L11,213@9293L220:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(797395595, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$797395595.<anonymous> (ProfileScreen.kt:213)");
            }
            IconKt.Icon-ww6aTOc(LogoutKt.getLogout(Icons.AutoMirrored.Filled.INSTANCE), "Log Out", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU(), composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_406723659$lambda$14(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C278@12105L1311:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(406723659, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$406723659.<anonymous> (ProfileScreen.kt:278)");
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
            ComposerKt.sourceInformationMarkerStart(composer, 801706115, "C283@12358L60,289@12748L11,282@12289L518,291@12832L40,292@12897L371,296@13374L11,296@13293L101:ProfileScreen.kt#2thlc2");
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.developer_photo, composer, 0), "Developer", BorderKt.border-xT4_qwU(ClipKt.clip(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(44.0f)), RoundedCornerShapeKt.getCircleShape()), Dp.constructor-impl(2.0f), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), (Alignment) null, ContentScale.Companion.getCrop(), 0.0f, (ColorFilter) null, composer, 24624, 104);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(12.0f)), composer, 6);
            Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.Companion, 1.0f, false, 2, (Object) null);
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
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
            ComposerKt.sourceInformationMarkerStart(composer, 232372330, "C293@13015L10,293@12966L101,294@13169L10,294@13213L11,294@13096L146:ProfileScreen.kt#2thlc2");
            TextKt.Text--4IGK_g("Meet the Developer", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleSmall(), composer, 196614, 0, 65502);
            TextKt.Text--4IGK_g("Shiva Sumukesh • Grade 9 Student & Creator", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            IconKt.Icon-ww6aTOc(ChevronRightKt.getChevronRight(Icons.INSTANCE.getDefault()), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 48, 4);
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

    static final Unit lambda__2143663289$lambda$15(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C315@14257L11,315@14217L86:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2143663289, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$-2143663289.<anonymous> (ProfileScreen.kt:315)");
            }
            DividerKt.HorizontalDivider-9IZ8Weo((Modifier) null, 0.0f, Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOutlineVariant-0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null), composer, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1443702511$lambda$16(LazyItemScope lazyItemScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(lazyItemScope, "$this$item");
        ComposerKt.sourceInformation(composer, "C338@15315L40:ProfileScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1443702511, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$1443702511.<anonymous> (ProfileScreen.kt:338)");
            }
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_120362451$lambda$17(LazyItemScope lazyItemScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(lazyItemScope, "$this$item");
        ComposerKt.sourceInformation(composer, "C345@15564L335:ProfileScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(120362451, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$120362451.<anonymous> (ProfileScreen.kt:345)");
            }
            ProfileScreenKt.ProfileEmptyState(MenuBookKt.getMenuBook(Icons.AutoMirrored.Filled.INSTANCE), "No Books Added Yet", "You haven't added any books to your collection yet.\nList books to start exchanging with fellow readers!", composer, 432);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1911845622$lambda$18(LazyItemScope lazyItemScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(lazyItemScope, "$this$item");
        ComposerKt.sourceInformation(composer, "C365@16651L318:ProfileScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1911845622, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$-1911845622.<anonymous> (ProfileScreen.kt:365)");
            }
            ProfileScreenKt.ProfileEmptyState(BookmarkBorderKt.getBookmarkBorder(Icons.INSTANCE.getDefault()), "Your Wishlist is Empty", "Tap 'Add Book' above to get notified whenever your desired books become available nearby!", composer, 432);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__615390708$lambda$19(LazyItemScope lazyItemScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(lazyItemScope, "$this$item");
        ComposerKt.sourceInformation(composer, "C392@17994L268:ProfileScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-615390708, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$-615390708.<anonymous> (ProfileScreen.kt:392)");
            }
            ProfileScreenKt.ProfileEmptyState(SwapHorizKt.getSwapHoriz(Icons.INSTANCE.getDefault()), "No Books Lent Out", "No books are currently lent out to other readers.", composer, 432);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_32836749$lambda$20(LazyItemScope lazyItemScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(lazyItemScope, "$this$item");
        ComposerKt.sourceInformation(composer, "C409@18858L322:ProfileScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(32836749, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$32836749.<anonymous> (ProfileScreen.kt:409)");
            }
            ProfileScreenKt.ProfileEmptyState(MenuBookKt.getMenuBook(Icons.AutoMirrored.Filled.INSTANCE), "No Borrowed Books", "You are not borrowing any books right now.\nExplore nearby books on the Home feed to borrow!", composer, 432);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_681064206$lambda$21(LazyItemScope lazyItemScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(lazyItemScope, "$this$item");
        ComposerKt.sourceInformation(composer, "C426@19776L274:ProfileScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(681064206, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$681064206.<anonymous> (ProfileScreen.kt:426)");
            }
            ProfileScreenKt.ProfileEmptyState(RateReviewKt.getRateReview(Icons.INSTANCE.getDefault()), "No Reviews Yet", "Ratings and reviews from book exchanges will appear here.", composer, 432);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_424654453$lambda$24(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C464@21084L11,464@21004L133:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(424654453, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$424654453.<anonymous> (ProfileScreen.kt:464)");
            }
            IconKt.Icon-ww6aTOc(AutoStoriesKt.getAutoStories(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(32.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_292330708$lambda$25(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C467@21191L59:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(292330708, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$292330708.<anonymous> (ProfileScreen.kt:467)");
            }
            TextKt.Text--4IGK_g("Set 2026 Reading Goal", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 196614, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_2146071203$lambda$26(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C475@21685L20:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2146071203, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$2146071203.<anonymous> (ProfileScreen.kt:475)");
            }
            TextKt.Text--4IGK_g("Goal (Books)", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__662875800$lambda$22(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C490@22248L17:ProfileScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-662875800, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$-662875800.<anonymous> (ProfileScreen.kt:490)");
            }
            TextKt.Text--4IGK_g("Save Goal", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_2079316345$lambda$23(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$TextButton");
        ComposerKt.sourceInformation(composer, "C495@22423L14:ProfileScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2079316345, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$2079316345.<anonymous> (ProfileScreen.kt:495)");
            }
            TextKt.Text--4IGK_g("Cancel", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__216431690$lambda$29(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C506@22754L11,506@22674L133:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-216431690, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$-216431690.<anonymous> (ProfileScreen.kt:506)");
            }
            IconKt.Icon-ww6aTOc(BookmarkAddKt.getBookmarkAdd(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(32.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__348755435$lambda$30(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C509@22861L58:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-348755435, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$-348755435.<anonymous> (ProfileScreen.kt:509)");
            }
            TextKt.Text--4IGK_g("Add Book to Wishlist", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 196614, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1504985060$lambda$31(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C517@23378L20:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1504985060, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$1504985060.<anonymous> (ProfileScreen.kt:517)");
            }
            TextKt.Text--4IGK_g("Book Title *", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__300518235$lambda$32(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C518@23442L20:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-300518235, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$-300518235.<anonymous> (ProfileScreen.kt:518)");
            }
            TextKt.Text--4IGK_g("e.g. Sapiens", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_2014956429$lambda$33(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C526@23841L25:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2014956429, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$2014956429.<anonymous> (ProfileScreen.kt:526)");
            }
            TextKt.Text--4IGK_g("Author (Optional)", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_2093077518$lambda$34(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C527@23910L30:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2093077518, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$2093077518.<anonymous> (ProfileScreen.kt:527)");
            }
            TextKt.Text--4IGK_g("e.g. Yuval Noah Harari", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1303961943$lambda$27(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C546@24704L24:ProfileScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1303961943, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$-1303961943.<anonymous> (ProfileScreen.kt:546)");
            }
            TextKt.Text--4IGK_g("Save to Wishlist", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1438230202$lambda$28(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$TextButton");
        ComposerKt.sourceInformation(composer, "C551@24886L14:ProfileScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1438230202, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$1438230202.<anonymous> (ProfileScreen.kt:551)");
            }
            TextKt.Text--4IGK_g("Cancel", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_297010338$lambda$36(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C636@28495L296:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(297010338, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$297010338.<anonymous> (ProfileScreen.kt:636)");
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
            ComposerKt.sourceInformationMarkerStart(composer, 1640038392, "C637@28562L207:ProfileScreen.kt#2thlc2");
            IconKt.Icon-ww6aTOc(CameraAltKt.getCameraAlt(Icons.INSTANCE.getDefault()), "Edit photo", SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(14.0f)), 0L, composer, 432, 8);
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

    static final Unit lambda_837332741$lambda$37(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C708@32169L11,708@32056L135:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(837332741, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$837332741.<anonymous> (ProfileScreen.kt:708)");
            }
            IconKt.Icon-ww6aTOc(EditKt.getEdit(Icons.INSTANCE.getDefault()), "Edit Goal", SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSecondary-0d7_KjU(), composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1198244877$lambda$38(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C749@34293L104,750@34414L28,751@34459L50:ProfileScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1198244877, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$-1198244877.<anonymous> (ProfileScreen.kt:749)");
            }
            IconKt.Icon-ww6aTOc(LogoutKt.getLogout(Icons.AutoMirrored.Filled.INSTANCE), "Sign out", SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            TextKt.Text--4IGK_g("Sign out", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 196614, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_883711041$lambda$39(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C837@37727L83,838@37823L39,839@37875L64:ProfileScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(883711041, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$883711041.<anonymous> (ProfileScreen.kt:837)");
            }
            IconKt.Icon-ww6aTOc(AddKt.getAdd(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Add Book", (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 199686, 0, 131030);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_520156255$lambda$41(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C870@38907L357:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(520156255, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$520156255.<anonymous> (ProfileScreen.kt:870)");
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
            ComposerKt.sourceInformationMarkerStart(composer, -651245646, "C874@39136L11,871@38974L268:ProfileScreen.kt#2thlc2");
            IconKt.Icon-ww6aTOc(BookmarkKt.getBookmark(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(20.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 432, 0);
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

    static final Unit lambda__390328063$lambda$42(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C906@40467L11,903@40320L184:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-390328063, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$-390328063.<anonymous> (ProfileScreen.kt:903)");
            }
            IconKt.Icon-ww6aTOc(DeleteOutlineKt.getDeleteOutline(Icons.INSTANCE.getDefault()), "Remove", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOutline-0d7_KjU(), composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1614291527$lambda$44(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1263@56109L383:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1614291527, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$1614291527.<anonymous> (ProfileScreen.kt:1263)");
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
            ComposerKt.sourceInformationMarkerStart(composer, 1647762756, "C1268@56417L11,1264@56180L286:ProfileScreen.kt#2thlc2");
            IconKt.Icon-ww6aTOc(PersonKt.getPerson(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 432, 0);
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

    static final Unit lambda_286751272$lambda$45(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1445@64111L83,1446@64211L39,1447@64267L64:ProfileScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(286751272, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$286751272.<anonymous> (ProfileScreen.kt:1445)");
            }
            IconKt.Icon-ww6aTOc(AddKt.getAdd(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("Add Book", (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 199686, 0, 131030);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_118443651$lambda$47(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1508@67308L469:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(118443651, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$118443651.<anonymous> (ProfileScreen.kt:1508)");
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
            ComposerKt.sourceInformationMarkerStart(composer, 1970854538, "C1512@67601L11,1509@67391L348:ProfileScreen.kt#2thlc2");
            IconKt.Icon-ww6aTOc(BookmarkKt.getBookmark(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(20.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 432, 0);
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

    static final Unit lambda_806449441$lambda$48(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1544@69454L11,1541@69259L248:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(806449441, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$806449441.<anonymous> (ProfileScreen.kt:1541)");
            }
            IconKt.Icon-ww6aTOc(DeleteOutlineKt.getDeleteOutline(Icons.INSTANCE.getDefault()), "Remove", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOutline-0d7_KjU(), composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1676766906$lambda$49(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1707@77239L85,1708@77349L39,1709@77413L20:ProfileScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1676766906, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$-1676766906.<anonymous> (ProfileScreen.kt:1707)");
            }
            IconKt.Icon-ww6aTOc(ShareKt.getShare(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextKt.Text--4IGK_g("Share Impact", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1897988936$lambda$50(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C1717@77708L22:ProfileScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1897988936, i, -1, "com.example.ui.screens.ComposableSingletons$ProfileScreenKt.lambda$1897988936.<anonymous> (ProfileScreen.kt:1717)");
            }
            TextKt.Text--4IGK_g("Leaderboard 🏆", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
