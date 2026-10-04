package com.example.ui.screens;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.ChatKt;
import androidx.compose.material.icons.automirrored.filled.MessageKt;
import androidx.compose.material.icons.filled.AutoStoriesKt;
import androidx.compose.material.icons.filled.BookKt;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.material.icons.filled.SearchKt;
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

/* JADX INFO: compiled from: ChatsScreen.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class ComposableSingletons$ChatsScreenKt {
    public static final ComposableSingletons$ChatsScreenKt INSTANCE = new ComposableSingletons$ChatsScreenKt();

    /* JADX INFO: renamed from: lambda$-601486699, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f89lambda$601486699 = ComposableLambdaKt.composableLambdaInstance(-601486699, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ChatsScreenKt$$ExternalSyntheticLambda0
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatsScreenKt.lambda__601486699$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-700946995, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f90lambda$700946995 = ComposableLambdaKt.composableLambdaInstance(-700946995, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ChatsScreenKt$$ExternalSyntheticLambda3
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatsScreenKt.lambda__700946995$lambda$1((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$637545260 = ComposableLambdaKt.composableLambdaInstance(637545260, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ChatsScreenKt$$ExternalSyntheticLambda4
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatsScreenKt.lambda_637545260$lambda$2((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1416871021, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f86lambda$1416871021 = ComposableLambdaKt.composableLambdaInstance(-1416871021, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ChatsScreenKt$$ExternalSyntheticLambda5
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatsScreenKt.lambda__1416871021$lambda$3((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-869596684, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f91lambda$869596684 = ComposableLambdaKt.composableLambdaInstance(-869596684, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ChatsScreenKt$$ExternalSyntheticLambda6
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatsScreenKt.lambda__869596684$lambda$4((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$365164448 = ComposableLambdaKt.composableLambdaInstance(365164448, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ChatsScreenKt$$ExternalSyntheticLambda7
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatsScreenKt.lambda_365164448$lambda$6((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-23034343, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f88lambda$23034343 = ComposableLambdaKt.composableLambdaInstance(-23034343, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ChatsScreenKt$$ExternalSyntheticLambda8
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatsScreenKt.lambda__23034343$lambda$7((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-180728677, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f87lambda$180728677 = ComposableLambdaKt.composableLambdaInstance(-180728677, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ChatsScreenKt$$ExternalSyntheticLambda9
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatsScreenKt.lambda__180728677$lambda$8((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1002096231 = ComposableLambdaKt.composableLambdaInstance(1002096231, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ChatsScreenKt$$ExternalSyntheticLambda10
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatsScreenKt.lambda_1002096231$lambda$9((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1985825774 = ComposableLambdaKt.composableLambdaInstance(1985825774, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ChatsScreenKt$$ExternalSyntheticLambda1
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatsScreenKt.lambda_1985825774$lambda$10((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-989624312, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f92lambda$989624312 = ComposableLambdaKt.composableLambdaInstance(-989624312, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ChatsScreenKt$$ExternalSyntheticLambda2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatsScreenKt.lambda__989624312$lambda$12((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-1416871021$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m267getLambda$1416871021$app() {
        return f86lambda$1416871021;
    }

    /* JADX INFO: renamed from: getLambda$-180728677$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m268getLambda$180728677$app() {
        return f87lambda$180728677;
    }

    /* JADX INFO: renamed from: getLambda$-23034343$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m269getLambda$23034343$app() {
        return f88lambda$23034343;
    }

    /* JADX INFO: renamed from: getLambda$-601486699$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m270getLambda$601486699$app() {
        return f89lambda$601486699;
    }

    /* JADX INFO: renamed from: getLambda$-700946995$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m271getLambda$700946995$app() {
        return f90lambda$700946995;
    }

    /* JADX INFO: renamed from: getLambda$-869596684$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m272getLambda$869596684$app() {
        return f91lambda$869596684;
    }

    /* JADX INFO: renamed from: getLambda$-989624312$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m273getLambda$989624312$app() {
        return f92lambda$989624312;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1002096231$app() {
        return lambda$1002096231;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1985825774$app() {
        return lambda$1985825774;
    }

    public final Function2<Composer, Integer, Unit> getLambda$365164448$app() {
        return lambda$365164448;
    }

    public final Function2<Composer, Integer, Unit> getLambda$637545260$app() {
        return lambda$637545260;
    }

    static final Unit lambda__601486699$lambda$0(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C213@9425L11,210@9231L243:ChatsScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-601486699, i, -1, "com.example.ui.screens.ComposableSingletons$ChatsScreenKt.lambda$-601486699.<anonymous> (ChatsScreen.kt:210)");
            }
            IconKt.Icon-ww6aTOc(ChatKt.getChat(Icons.AutoMirrored.Filled.INSTANCE), "Start New Chat", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__700946995$lambda$1(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C226@9930L10,227@10007L11,224@9801L283:ChatsScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-700946995, i, -1, "com.example.ui.screens.ComposableSingletons$ChatsScreenKt.lambda$-700946995.<anonymous> (ChatsScreen.kt:224)");
            }
            TextKt.Text--4IGK_g("Search chats, readers or books...", (Modifier) null, Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 6, 0, 65530);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_637545260$lambda$2(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C234@10356L11,231@10180L234:ChatsScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(637545260, i, -1, "com.example.ui.screens.ComposableSingletons$ChatsScreenKt.lambda$637545260.<anonymous> (ChatsScreen.kt:231)");
            }
            IconKt.Icon-ww6aTOc(SearchKt.getSearch(Icons.INSTANCE.getDefault()), "Search", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1416871021$lambda$3(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C240@10656L88:ChatsScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1416871021, i, -1, "com.example.ui.screens.ComposableSingletons$ChatsScreenKt.lambda$-1416871021.<anonymous> (ChatsScreen.kt:240)");
            }
            IconKt.Icon-ww6aTOc(CloseKt.getClose(Icons.INSTANCE.getDefault()), "Clear", SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), 0L, composer, 432, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__869596684$lambda$4(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C292@13344L80:ChatsScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-869596684, i, -1, "com.example.ui.screens.ComposableSingletons$ChatsScreenKt.lambda$-869596684.<anonymous> (ChatsScreen.kt:292)");
            }
            IconKt.Icon-ww6aTOc(MessageKt.getMessage(Icons.AutoMirrored.Filled.INSTANCE), "New Conversation", (Modifier) null, 0L, composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_365164448$lambda$6(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C315@14262L377:ChatsScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(365164448, i, -1, "com.example.ui.screens.ComposableSingletons$ChatsScreenKt.lambda$365164448.<anonymous> (ChatsScreen.kt:315)");
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
            ComposerKt.sourceInformationMarkerStart(composer, -224123375, "C316@14333L280:ChatsScreen.kt#2thlc2");
            IconKt.Icon-ww6aTOc(ChatKt.getChat(Icons.AutoMirrored.Filled.INSTANCE), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(44.0f)), ColorKt.Color(4279994175L), composer, 3504, 0);
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

    static final Unit lambda__23034343$lambda$7(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C346@16094L91,347@16214L39,348@16282L20:ChatsScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-23034343, i, -1, "com.example.ui.screens.ComposableSingletons$ChatsScreenKt.lambda$-23034343.<anonymous> (ChatsScreen.kt:346)");
            }
            IconKt.Icon-ww6aTOc(AutoStoriesKt.getAutoStories(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextKt.Text--4IGK_g("Browse Books", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__180728677$lambda$8(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C354@16555L96,355@16680L39,356@16748L16:ChatsScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-180728677, i, -1, "com.example.ui.screens.ComposableSingletons$ChatsScreenKt.lambda$-180728677.<anonymous> (ChatsScreen.kt:354)");
            }
            IconKt.Icon-ww6aTOc(ChatKt.getChat(Icons.AutoMirrored.Filled.INSTANCE), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextKt.Text--4IGK_g("New Chat", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1985825774$lambda$10(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C395@18448L58:ChatsScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1985825774, i, -1, "com.example.ui.screens.ComposableSingletons$ChatsScreenKt.lambda$1985825774.<anonymous> (ChatsScreen.kt:395)");
            }
            TextKt.Text--4IGK_g("Start a Conversation", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 196614, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1002096231$lambda$9(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$TextButton");
        ComposerKt.sourceInformation(composer, "C495@24689L13:ChatsScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1002096231, i, -1, "com.example.ui.screens.ComposableSingletons$ChatsScreenKt.lambda$1002096231.<anonymous> (ChatsScreen.kt:495)");
            }
            TextKt.Text--4IGK_g("Close", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__989624312$lambda$12(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C595@28663L331:ChatsScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-989624312, i, -1, "com.example.ui.screens.ComposableSingletons$ChatsScreenKt.lambda$-989624312.<anonymous> (ChatsScreen.kt:595)");
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
            ComposerKt.sourceInformationMarkerStart(composer, -1183098865, "C596@28730L242:ChatsScreen.kt#2thlc2");
            IconKt.Icon-ww6aTOc(BookKt.getBook(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(11.0f)), Color.Companion.getWhite-0d7_KjU(), composer, 3504, 0);
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
