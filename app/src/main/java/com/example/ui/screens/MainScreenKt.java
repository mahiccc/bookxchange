package com.example.ui.screens;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckCircleKt;
import androidx.compose.material.icons.filled.InfoKt;
import androidx.compose.material.icons.filled.WarningKt;
import androidx.compose.material3.BadgeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.NavigationBarItemDefaults;
import androidx.compose.material3.NavigationBarKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptions;
import androidx.navigation.NavOptionsBuilder;
import androidx.navigation.Navigator;
import androidx.navigation.PopUpToBuilder;
import androidx.navigation.compose.NavGraphBuilderKt;
import androidx.navigation.compose.NavHostControllerKt;
import androidx.navigation.compose.NavHostKt;
import com.example.data.Book;
import com.example.data.Message;
import com.example.data.User;
import com.example.ui.BookViewModel;
import com.google.android.gms.common.Scopes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: MainScreen.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\u0010\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u008a\u0084\u0002²\u0006\f\u0010\u000b\u001a\u0004\u0018\u00010\fX\u008a\u0084\u0002²\u0006\u0010\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\tX\u008a\u0084\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\u0016\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00130\u0012X\u008a\u0084\u0002²\u0006\f\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u008a\u0084\u0002²\u0006\f\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u008a\u0084\u0002"}, d2 = {"MainScreen", "", "viewModel", "Lcom/example/ui/BookViewModel;", "rootNavController", "Landroidx/navigation/NavHostController;", "(Lcom/example/ui/BookViewModel;Landroidx/navigation/NavHostController;Landroidx/compose/runtime/Composer;I)V", "app", "allBooks", "", "Lcom/example/data/Book;", "currentUser", "", "userChats", "Lcom/example/data/Message;", "readUpdateTrigger", "", "sysControl", "", "", "navBackStackEntry", "Landroidx/navigation/NavBackStackEntry;", "userState", "Lcom/example/data/User;"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class MainScreenKt {
    static final Unit MainScreen$lambda$95(BookViewModel bookViewModel, NavHostController navHostController, int i, Composer composer, int i2) {
        MainScreen(bookViewModel, navHostController, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:130:0x0384 A[PHI: r21
      0x0384: PHI (r21v3 int) = (r21v5 int), (r21v6 int) binds: [B:129:0x0382, B:121:0x035e] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void MainScreen(final BookViewModel bookViewModel, final NavHostController navHostController, Composer composer, final int i) {
        int i2;
        Object next;
        int i3;
        int i4;
        boolean z;
        String string;
        String string2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(bookViewModel, "viewModel");
        Intrinsics.checkNotNullParameter(navHostController, "rootNavController");
        Composer composerStartRestartGroup = composer.startRestartGroup(63108910);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(MainScreen)P(1)37@1475L23,38@1538L16,39@1600L16,42@1680L57,43@1773L37,45@1843L7,46@1867L100,47@1997L55,49@2126L7,50@2171L393,50@2138L426,62@2594L476,62@2570L500,74@3099L710,90@3838L880,111@4766L16,117@5053L7483,276@12543L6781,116@5023L14301:MainScreen.kt#2thlc2");
        int i5 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(bookViewModel) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(navHostController) ? 32 : 16;
        }
        if ((i5 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(63108910, i5, -1, "com.example.ui.screens.MainScreen (MainScreen.kt:36)");
            }
            final NavHostController navHostControllerRememberNavController = NavHostControllerKt.rememberNavController(new Navigator[0], composerStartRestartGroup, 0);
            final State stateCollectAsState = SnapshotStateKt.collectAsState(bookViewModel.getAllBooks(), (CoroutineContext) null, composerStartRestartGroup, 0, 1);
            final State stateCollectAsState2 = SnapshotStateKt.collectAsState(bookViewModel.getCurrentUser(), (CoroutineContext) null, composerStartRestartGroup, 0, 1);
            String strMainScreen$lambda$1 = MainScreen$lambda$1(stateCollectAsState2);
            String str = strMainScreen$lambda$1 == null ? "" : strMainScreen$lambda$1;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 518130919, "CC(remember):MainScreen.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(str);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = bookViewModel.getUserChats(str);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            State stateCollectAsState3 = SnapshotStateKt.collectAsState((StateFlow) objRememberedValue, CollectionsKt.emptyList(), (CoroutineContext) null, composerStartRestartGroup, 48, 2);
            CompositionLocal localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final Context context = (Context) objConsume;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 518136946, "CC(remember):MainScreen.kt#9igjgp");
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = context.getSharedPreferences("book_borrow_prefs", 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final SharedPreferences sharedPreferences = (SharedPreferences) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 518141061, "CC(remember):MainScreen.kt#9igjgp");
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt.mutableStateOf$default(Long.valueOf(System.currentTimeMillis()), (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final MutableState mutableState = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            CompositionLocal localLifecycleOwner = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composerStartRestartGroup.consume(localLifecycleOwner);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final LifecycleOwner lifecycleOwner = (LifecycleOwner) objConsume2;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 518146967, "CC(remember):MainScreen.kt#9igjgp");
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(lifecycleOwner);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda18
                    public final Object invoke(Object obj) {
                        return MainScreenKt.MainScreen$lambda$11$lambda$10(lifecycleOwner, mutableState, (DisposableEffectScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            EffectsKt.DisposableEffect(lifecycleOwner, (Function1) objRememberedValue4, composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 518160586, "CC(remember):MainScreen.kt#9igjgp");
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(sharedPreferences);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = new Function1() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda19
                    public final Object invoke(Object obj) {
                        return MainScreenKt.MainScreen$lambda$15$lambda$14(sharedPreferences, mutableState, (DisposableEffectScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            EffectsKt.DisposableEffect(sharedPreferences, (Function1) objRememberedValue5, composerStartRestartGroup, 0);
            List<Message> listMainScreen$lambda$3 = MainScreen$lambda$3(stateCollectAsState3);
            long jMainScreen$lambda$6 = MainScreen$lambda$6(mutableState);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 518176980, "CC(remember):MainScreen.kt#9igjgp");
            boolean zChanged2 = composerStartRestartGroup.changed(listMainScreen$lambda$3) | composerStartRestartGroup.changed(str) | composerStartRestartGroup.changed(jMainScreen$lambda$6);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue6 == Composer.Companion.getEmpty()) {
                List<Message> listMainScreen$lambda$4 = MainScreen$lambda$3(stateCollectAsState3);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : listMainScreen$lambda$4) {
                    String bookId = ((Message) obj).getBookId();
                    Object obj2 = linkedHashMap.get(bookId);
                    if (obj2 == null) {
                        obj2 = (List) new ArrayList();
                        linkedHashMap.put(bookId, obj2);
                    }
                    ((List) obj2).add(obj);
                }
                if (linkedHashMap.isEmpty()) {
                    i2 = 0;
                } else {
                    Iterator it = linkedHashMap.entrySet().iterator();
                    i2 = 0;
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        String str2 = (String) entry.getKey();
                        List list = (List) entry.getValue();
                        Iterator it2 = it;
                        long j = sharedPreferences.getLong("chat_last_read_" + str2, 0L);
                        String string3 = sharedPreferences.getString("chat_last_read_msg_id_" + str2, null);
                        List<Message> list2 = list;
                        Iterator it3 = list2.iterator();
                        if (it3.hasNext()) {
                            next = it3.next();
                            if (it3.hasNext()) {
                                long timestamp = ((Message) next).getTimestamp();
                                do {
                                    Object next2 = it3.next();
                                    long timestamp2 = ((Message) next2).getTimestamp();
                                    if (timestamp < timestamp2) {
                                        next = next2;
                                        timestamp = timestamp2;
                                    }
                                } while (it3.hasNext());
                            }
                        } else {
                            next = null;
                        }
                        Message message = (Message) next;
                        if (message != null && ((string3 == null || !Intrinsics.areEqual(message.getId(), string3)) && message.getTimestamp() > j && (!(list2 instanceof Collection) || !list2.isEmpty()))) {
                            for (Message message2 : list2) {
                                if (!Intrinsics.areEqual(message2.getSender(), str) && message2.getTimestamp() > j && !Intrinsics.areEqual(message2.getId(), string3)) {
                                    i2++;
                                    break;
                                }
                            }
                        }
                        it = it2;
                    }
                }
                objRememberedValue6 = Integer.valueOf(i2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            int iIntValue = ((Number) objRememberedValue6).intValue();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            List<Book> listMainScreen$lambda$0 = MainScreen$lambda$0(stateCollectAsState);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 518200798, "CC(remember):MainScreen.kt#9igjgp");
            boolean zChanged3 = composerStartRestartGroup.changed(listMainScreen$lambda$0) | composerStartRestartGroup.changed(str);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue7 == Composer.Companion.getEmpty()) {
                int i6 = 0;
                for (Book book : MainScreen$lambda$0(stateCollectAsState)) {
                    String str3 = str;
                    boolean zEquals = StringsKt.equals(StringsKt.trim(book.getOwnerName()).toString(), StringsKt.trim(str3).toString(), true);
                    String requestedByName = book.getRequestedByName();
                    if (requestedByName == null || (string2 = StringsKt.trim(requestedByName).toString()) == null) {
                        i4 = iIntValue;
                    } else {
                        i4 = iIntValue;
                        z = StringsKt.equals(string2, StringsKt.trim(str3).toString(), true);
                        if (zEquals && (Intrinsics.areEqual(book.getStatus(), "REQUESTED") || Intrinsics.areEqual(book.getStatus(), "PENDING_RETURN") || Intrinsics.areEqual(book.getStatus(), "RETURN_INITIATED"))) {
                            i6++;
                        }
                        if (!z && (Intrinsics.areEqual(book.getStatus(), "PENDING_TRANSFER") || Intrinsics.areEqual(book.getStatus(), "ACCEPTED") || Intrinsics.areEqual(book.getStatus(), "PENDING_RECEIPT") || Intrinsics.areEqual(book.getStatus(), "TRANSFER_INITIATED"))) {
                            i6++;
                        }
                        iIntValue = i4;
                    }
                    String borrowerName = book.getBorrowerName();
                    if (borrowerName == null || (string = StringsKt.trim(borrowerName).toString()) == null || !StringsKt.equals(string, StringsKt.trim(str3).toString(), true)) {
                    }
                    if (zEquals) {
                        i6++;
                    }
                    if (!z) {
                    }
                    iIntValue = i4;
                }
                i3 = iIntValue;
                objRememberedValue7 = Integer.valueOf(i6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            } else {
                i3 = iIntValue;
            }
            final int iIntValue2 = ((Number) objRememberedValue7).intValue();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final State stateCollectAsState4 = SnapshotStateKt.collectAsState(bookViewModel.getSystemControl(), (CoroutineContext) null, composerStartRestartGroup, 0, 1);
            Object obj3 = MainScreen$lambda$23(stateCollectAsState4).get("broadcastBannerActive");
            final boolean zAreEqual = Intrinsics.areEqual(obj3 instanceof Boolean ? (Boolean) obj3 : null, true);
            Object obj4 = MainScreen$lambda$23(stateCollectAsState4).get("broadcastBannerText");
            String str4 = obj4 instanceof String ? (String) obj4 : null;
            if (str4 == null) {
                str4 = "";
            }
            Object obj5 = MainScreen$lambda$23(stateCollectAsState4).get("broadcastBannerType");
            String str5 = obj5 instanceof String ? (String) obj5 : null;
            if (str5 == null) {
                str5 = "INFO";
            }
            final int i7 = i3;
            Function2 function2RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-808817165, true, new Function2() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda20
                public final Object invoke(Object obj6, Object obj7) {
                    return MainScreenKt.MainScreen$lambda$49(navHostControllerRememberNavController, stateCollectAsState4, context, i7, iIntValue2, (Composer) obj6, ((Integer) obj7).intValue());
                }
            }, composerStartRestartGroup, 54);
            final String str6 = str4;
            final String str7 = str5;
            Function3 function3RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1670240579, true, new Function3() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda21
                public final Object invoke(Object obj6, Object obj7, Object obj8) {
                    return MainScreenKt.MainScreen$lambda$94(zAreEqual, str6, str7, navHostControllerRememberNavController, stateCollectAsState, stateCollectAsState2, bookViewModel, stateCollectAsState4, context, navHostController, (PaddingValues) obj6, (Composer) obj7, ((Integer) obj8).intValue());
                }
            }, composerStartRestartGroup, 54);
            composer2 = composerStartRestartGroup;
            ScaffoldKt.Scaffold-TvnljyQ((Modifier) null, (Function2) null, function2RememberComposableLambda, (Function2) null, (Function2) null, 0, 0L, 0L, (WindowInsets) null, function3RememberComposableLambda, composer2, 805306752, 507);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda23
                public final Object invoke(Object obj6, Object obj7) {
                    return MainScreenKt.MainScreen$lambda$95(bookViewModel, navHostController, i, (Composer) obj6, ((Integer) obj7).intValue());
                }
            });
        }
    }

    private static final long MainScreen$lambda$6(MutableState<Long> mutableState) {
        return ((Number) ((State) mutableState).getValue()).longValue();
    }

    private static final void MainScreen$lambda$7(MutableState<Long> mutableState, long j) {
        mutableState.setValue(Long.valueOf(j));
    }

    static final DisposableEffectResult MainScreen$lambda$11$lambda$10(final LifecycleOwner lifecycleOwner, final MutableState mutableState, DisposableEffectScope disposableEffectScope) {
        Intrinsics.checkNotNullParameter(disposableEffectScope, "$this$DisposableEffect");
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda4
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                MainScreenKt.MainScreen$lambda$11$lambda$10$lambda$8(mutableState, lifecycleOwner2, event);
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new DisposableEffectResult() { // from class: com.example.ui.screens.MainScreenKt$MainScreen$lambda$11$lambda$10$$inlined$onDispose$1
            public void dispose() {
                lifecycleOwner.getLifecycle().removeObserver(lifecycleEventObserver);
            }
        };
    }

    static final void MainScreen$lambda$11$lambda$10$lambda$8(MutableState mutableState, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.Event.ON_RESUME) {
            MainScreen$lambda$7(mutableState, System.currentTimeMillis());
        }
    }

    static final DisposableEffectResult MainScreen$lambda$15$lambda$14(final SharedPreferences sharedPreferences, final MutableState mutableState, DisposableEffectScope disposableEffectScope) {
        Intrinsics.checkNotNullParameter(disposableEffectScope, "$this$DisposableEffect");
        final SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda27
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                MainScreenKt.MainScreen$lambda$15$lambda$14$lambda$12(mutableState, sharedPreferences2, str);
            }
        };
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        return new DisposableEffectResult() { // from class: com.example.ui.screens.MainScreenKt$MainScreen$lambda$15$lambda$14$$inlined$onDispose$1
            public void dispose() {
                sharedPreferences.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
            }
        };
    }

    static final void MainScreen$lambda$15$lambda$14$lambda$12(MutableState mutableState, SharedPreferences sharedPreferences, String str) {
        if (str != null) {
            if (StringsKt.startsWith$default(str, "chat_last_read_", false, 2, (Object) null) || StringsKt.startsWith$default(str, "chat_last_read_msg_id_", false, 2, (Object) null)) {
                MainScreen$lambda$7(mutableState, System.currentTimeMillis());
            }
        }
    }

    static final Unit MainScreen$lambda$49(final NavHostController navHostController, final State state, final Context context, final int i, final int i2, Composer composer, int i3) {
        ComposerKt.sourceInformation(composer, "C124@5349L11,127@5527L11,128@5589L6937,118@5067L7459:MainScreen.kt#2thlc2");
        if ((i3 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-808817165, i3, -1, "com.example.ui.screens.MainScreen.<anonymous> (MainScreen.kt:118)");
            }
            Modifier modifier = PaddingKt.padding-VpY3zN4(WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null)), Dp.constructor-impl(14.0f), Dp.constructor-impl(8.0f));
            Shape shape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(26.0f));
            Shape shape2 = shape;
            SurfaceKt.Surface-T9BRK9s(modifier, shape2, Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface-0d7_KjU(), 0.96f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, Dp.constructor-impl(4.0f), Dp.constructor-impl(8.0f), BorderStrokeKt.BorderStroke-cXLIe8U(Dp.constructor-impl(1.0f), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOutlineVariant-0d7_KjU(), 0.35f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), ComposableLambdaKt.rememberComposableLambda(-785769906, true, new Function2() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda11
                public final Object invoke(Object obj, Object obj2) {
                    return MainScreenKt.MainScreen$lambda$49$lambda$48(navHostController, state, context, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 12804096, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$49$lambda$48(final NavHostController navHostController, final State state, final Context context, final int i, final int i2, Composer composer, int i3) {
        ComposerKt.sourceInformation(composer, "C131@5756L11,133@5851L6661,129@5607L6905:MainScreen.kt#2thlc2");
        if ((i3 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-785769906, i3, -1, "com.example.ui.screens.MainScreen.<anonymous>.<anonymous> (MainScreen.kt:129)");
            }
            NavigationBarKt.NavigationBar-HsRjFd4(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(64.0f)), Color.Companion.getTransparent-0d7_KjU(), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface-0d7_KjU(), 0.0f, (WindowInsets) null, ComposableLambdaKt.rememberComposableLambda(-1813903801, true, new Function3() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda0
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return MainScreenKt.MainScreen$lambda$49$lambda$48$lambda$47(navHostController, state, context, i, i2, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer, 54), composer, 196662, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$49$lambda$48$lambda$47(final NavHostController navHostController, final State state, final Context context, final int i, final int i2, RowScope rowScope, Composer composer, int i3) {
        int i4;
        NavDestination destination;
        Intrinsics.checkNotNullParameter(rowScope, "$this$NavigationBar");
        ComposerKt.sourceInformation(composer, "C134@5914L30,139@6160L284,150@6797L11,151@6873L11,148@6645L269,137@6051L881,157@7055L310,165@7394L647,183@8297L11,184@8373L11,181@8145L269,155@6950L1482,190@8556L715,219@10027L11,220@10103L11,217@9875L269,188@8450L1712,226@10309L326,234@10664L515,250@11436L11,251@11512L11,248@11284L269,224@10196L1375,257@11696L314,269@12359L11,270@12435L11,267@12207L269,255@11589L905:MainScreen.kt#2thlc2");
        if ((i3 & 6) == 0) {
            i4 = i3 | (composer.changed(rowScope) ? 4 : 2);
        } else {
            i4 = i3;
        }
        if ((i4 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1813903801, i4, -1, "com.example.ui.screens.MainScreen.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:134)");
            }
            NavBackStackEntry navBackStackEntryMainScreen$lambda$49$lambda$48$lambda$47$lambda$24 = MainScreen$lambda$49$lambda$48$lambda$47$lambda$24(NavHostControllerKt.currentBackStackEntryAsState(navHostController, composer, 0));
            final String route = (navBackStackEntryMainScreen$lambda$49$lambda$48$lambda$47$lambda$24 == null || (destination = navBackStackEntryMainScreen$lambda$49$lambda$48$lambda$47$lambda$24.getDestination()) == null) ? null : destination.getRoute();
            boolean zAreEqual = Intrinsics.areEqual(route, "dashboard");
            ComposerKt.sourceInformationMarkerStart(composer, 595179587, "CC(remember):MainScreen.kt#9igjgp");
            boolean zChanged = composer.changed(route) | composer.changedInstance(navHostController);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda22
                    public final Object invoke() {
                        return MainScreenKt.MainScreen$lambda$49$lambda$48$lambda$47$lambda$28$lambda$27(route, navHostController);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            final String str = route;
            int i5 = (i4 & 14) | 1575936;
            NavigationBarKt.NavigationBarItem(rowScope, zAreEqual, (Function0) objRememberedValue, ComposableSingletons$MainScreenKt.INSTANCE.m319getLambda$1510547518$app(), (Modifier) null, false, ComposableSingletons$MainScreenKt.INSTANCE.m321getLambda$909457851$app(), false, NavigationBarItemDefaults.INSTANCE.colors-69fazGs(Color.Companion.getWhite-0d7_KjU(), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0L, 0L, 0L, 0L, composer, (NavigationBarItemDefaults.$stable << 21) | 6, 120), (MutableInteractionSource) null, composer, i5, 344);
            boolean zAreEqual2 = Intrinsics.areEqual(str, "chats");
            ComposerKt.sourceInformationMarkerStart(composer, 595208253, "CC(remember):MainScreen.kt#9igjgp");
            boolean zChanged2 = composer.changed(str) | composer.changedInstance(navHostController);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda33
                    public final Object invoke() {
                        return MainScreenKt.MainScreen$lambda$49$lambda$48$lambda$47$lambda$31$lambda$30(str, navHostController);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            NavigationBarKt.NavigationBarItem(rowScope, zAreEqual2, (Function0) objRememberedValue2, ComposableLambdaKt.rememberComposableLambda(1105234667, true, new Function2() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda44
                public final Object invoke(Object obj, Object obj2) {
                    return MainScreenKt.MainScreen$lambda$49$lambda$48$lambda$47$lambda$34(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), (Modifier) null, false, ComposableSingletons$MainScreenKt.INSTANCE.m317getLambda$1068180306$app(), false, NavigationBarItemDefaults.INSTANCE.colors-69fazGs(Color.Companion.getWhite-0d7_KjU(), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0L, 0L, 0L, 0L, composer, (NavigationBarItemDefaults.$stable << 21) | 6, 120), (MutableInteractionSource) null, composer, i5, 344);
            boolean zAreEqual3 = Intrinsics.areEqual(str, "camera");
            ComposerKt.sourceInformationMarkerStart(composer, 595256690, "CC(remember):MainScreen.kt#9igjgp");
            boolean zChanged3 = composer.changed(str) | composer.changed(state) | composer.changedInstance(navHostController) | composer.changedInstance(context);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda45
                    public final Object invoke() {
                        return MainScreenKt.MainScreen$lambda$49$lambda$48$lambda$47$lambda$37$lambda$36(str, navHostController, context, state);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            NavigationBarKt.NavigationBarItem(rowScope, zAreEqual3, (Function0) objRememberedValue3, ComposableSingletons$MainScreenKt.INSTANCE.m320getLambda$274550646$app(), (Modifier) null, false, ComposableSingletons$MainScreenKt.INSTANCE.getLambda$1847001677$app(), false, NavigationBarItemDefaults.INSTANCE.colors-69fazGs(Color.Companion.getWhite-0d7_KjU(), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0L, 0L, 0L, 0L, composer, (NavigationBarItemDefaults.$stable << 21) | 6, 120), (MutableInteractionSource) null, composer, i5, 344);
            boolean zAreEqual4 = Intrinsics.areEqual(str, "notifications");
            ComposerKt.sourceInformationMarkerStart(composer, 595312397, "CC(remember):MainScreen.kt#9igjgp");
            boolean zChanged4 = composer.changed(str) | composer.changedInstance(navHostController);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged4 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda46
                    public final Object invoke() {
                        return MainScreenKt.MainScreen$lambda$49$lambda$48$lambda$47$lambda$40$lambda$39(str, navHostController);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            NavigationBarKt.NavigationBarItem(rowScope, zAreEqual4, (Function0) objRememberedValue4, ComposableLambdaKt.rememberComposableLambda(-1654335959, true, new Function2() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda47
                public final Object invoke(Object obj, Object obj2) {
                    return MainScreenKt.MainScreen$lambda$49$lambda$48$lambda$47$lambda$43(i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), (Modifier) null, false, ComposableSingletons$MainScreenKt.INSTANCE.getLambda$467216364$app(), false, NavigationBarItemDefaults.INSTANCE.colors-69fazGs(Color.Companion.getWhite-0d7_KjU(), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0L, 0L, 0L, 0L, composer, (NavigationBarItemDefaults.$stable << 21) | 6, 120), (MutableInteractionSource) null, composer, i5, 344);
            boolean zAreEqual5 = Intrinsics.areEqual(str, Scopes.PROFILE);
            ComposerKt.sourceInformationMarkerStart(composer, 595356769, "CC(remember):MainScreen.kt#9igjgp");
            boolean zChanged5 = composer.changed(str) | composer.changedInstance(navHostController);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChanged5 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = new Function0() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda48
                    public final Object invoke() {
                        return MainScreenKt.MainScreen$lambda$49$lambda$48$lambda$47$lambda$46$lambda$45(str, navHostController);
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            NavigationBarKt.NavigationBarItem(rowScope, zAreEqual5, (Function0) objRememberedValue5, ComposableSingletons$MainScreenKt.INSTANCE.getLambda$1260846024$app(), (Modifier) null, false, ComposableSingletons$MainScreenKt.INSTANCE.m322getLambda$912568949$app(), false, NavigationBarItemDefaults.INSTANCE.colors-69fazGs(Color.Companion.getWhite-0d7_KjU(), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0L, 0L, 0L, 0L, composer, (NavigationBarItemDefaults.$stable << 21) | 6, 120), (MutableInteractionSource) null, composer, i5, 344);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$49$lambda$48$lambda$47$lambda$28$lambda$27(String str, NavHostController navHostController) {
        if (!Intrinsics.areEqual(str, "dashboard")) {
            navHostController.navigate("dashboard", new Function1() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda24
                public final Object invoke(Object obj) {
                    return MainScreenKt.MainScreen$lambda$49$lambda$48$lambda$47$lambda$28$lambda$27$lambda$26((NavOptionsBuilder) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$49$lambda$48$lambda$47$lambda$28$lambda$27$lambda$26(NavOptionsBuilder navOptionsBuilder) {
        Intrinsics.checkNotNullParameter(navOptionsBuilder, "$this$navigate");
        navOptionsBuilder.popUpTo("dashboard", new Function1() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda28
            public final Object invoke(Object obj) {
                return MainScreenKt.MainScreen$lambda$49$lambda$48$lambda$47$lambda$28$lambda$27$lambda$26$lambda$25((PopUpToBuilder) obj);
            }
        });
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$49$lambda$48$lambda$47$lambda$28$lambda$27$lambda$26$lambda$25(PopUpToBuilder popUpToBuilder) {
        Intrinsics.checkNotNullParameter(popUpToBuilder, "$this$popUpTo");
        popUpToBuilder.setInclusive(true);
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$49$lambda$48$lambda$47$lambda$31$lambda$30(String str, NavHostController navHostController) {
        if (!Intrinsics.areEqual(str, "chats")) {
            navHostController.navigate("chats", new Function1() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda6
                public final Object invoke(Object obj) {
                    return MainScreenKt.MainScreen$lambda$49$lambda$48$lambda$47$lambda$31$lambda$30$lambda$29((NavOptionsBuilder) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$49$lambda$48$lambda$47$lambda$31$lambda$30$lambda$29(NavOptionsBuilder navOptionsBuilder) {
        Intrinsics.checkNotNullParameter(navOptionsBuilder, "$this$navigate");
        NavOptionsBuilder.popUpTo$default(navOptionsBuilder, "dashboard", (Function1) null, 2, (Object) null);
        navOptionsBuilder.setLaunchSingleTop(true);
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$49$lambda$48$lambda$47$lambda$34(final int i, Composer composer, int i2) {
        ComposerKt.sourceInformation(composer, "C167@7467L403,166@7420L599:MainScreen.kt#2thlc2");
        if ((i2 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1105234667, i2, -1, "com.example.ui.screens.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:166)");
            }
            BadgeKt.BadgedBox(ComposableLambdaKt.rememberComposableLambda(2105673587, true, new Function3() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda49
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return MainScreenKt.MainScreen$lambda$49$lambda$48$lambda$47$lambda$34$lambda$33(i, (BoxScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer, 54), (Modifier) null, ComposableSingletons$MainScreenKt.INSTANCE.m318getLambda$1378774095$app(), composer, 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$49$lambda$48$lambda$47$lambda$34$lambda$33(final int i, BoxScope boxScope, Composer composer, int i2) {
        Composer composer2;
        Intrinsics.checkNotNullParameter(boxScope, "$this$BadgedBox");
        ComposerKt.sourceInformation(composer, "C:MainScreen.kt#2thlc2");
        if ((i2 & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2105673587, i2, -1, "com.example.ui.screens.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:168)");
            }
            if (i > 0) {
                composer.startReplaceGroup(2124541462);
                ComposerKt.sourceInformation(composer, "170@7643L11,171@7701L105,169@7565L241");
                composer2 = composer;
                BadgeKt.Badge-eopBjH0((Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0L, ComposableLambdaKt.rememberComposableLambda(-1752320837, true, new Function3() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda29
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return MainScreenKt.MainScreen$lambda$49$lambda$48$lambda$47$lambda$34$lambda$33$lambda$32(i, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, composer, 54), composer2, 3072, 5);
            } else {
                composer2 = composer;
                composer2.startReplaceGroup(2117063983);
            }
            composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$49$lambda$48$lambda$47$lambda$34$lambda$33$lambda$32(int i, RowScope rowScope, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Badge");
        ComposerKt.sourceInformation(composer, "C172@7743L25:MainScreen.kt#2thlc2");
        if ((i2 & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1752320837, i2, -1, "com.example.ui.screens.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:172)");
            }
            TextKt.Text--4IGK_g(String.valueOf(i), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$49$lambda$48$lambda$47$lambda$37$lambda$36(String str, NavHostController navHostController, Context context, State state) {
        if (!Intrinsics.areEqual(str, "camera")) {
            Object obj = MainScreen$lambda$23(state).get("allowNewBookUploads");
            Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
            if (bool != null ? bool.booleanValue() : true) {
                navHostController.navigate("camera", new Function1() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda3
                    public final Object invoke(Object obj2) {
                        return MainScreenKt.MainScreen$lambda$49$lambda$48$lambda$47$lambda$37$lambda$36$lambda$35((NavOptionsBuilder) obj2);
                    }
                });
            } else {
                Toast.makeText(context, "Book uploads are temporarily paused by administrator", 0).show();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$49$lambda$48$lambda$47$lambda$37$lambda$36$lambda$35(NavOptionsBuilder navOptionsBuilder) {
        Intrinsics.checkNotNullParameter(navOptionsBuilder, "$this$navigate");
        NavOptionsBuilder.popUpTo$default(navOptionsBuilder, "dashboard", (Function1) null, 2, (Object) null);
        navOptionsBuilder.setLaunchSingleTop(true);
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$49$lambda$48$lambda$47$lambda$40$lambda$39(String str, NavHostController navHostController) {
        if (!Intrinsics.areEqual(str, "notifications")) {
            navHostController.navigate("notifications", new Function1() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda7
                public final Object invoke(Object obj) {
                    return MainScreenKt.MainScreen$lambda$49$lambda$48$lambda$47$lambda$40$lambda$39$lambda$38((NavOptionsBuilder) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$49$lambda$48$lambda$47$lambda$40$lambda$39$lambda$38(NavOptionsBuilder navOptionsBuilder) {
        Intrinsics.checkNotNullParameter(navOptionsBuilder, "$this$navigate");
        NavOptionsBuilder.popUpTo$default(navOptionsBuilder, "dashboard", (Function1) null, 2, (Object) null);
        navOptionsBuilder.setLaunchSingleTop(true);
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$49$lambda$48$lambda$47$lambda$43(final int i, Composer composer, int i2) {
        ComposerKt.sourceInformation(composer, "C236@10737L273,235@10690L467:MainScreen.kt#2thlc2");
        if ((i2 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1654335959, i2, -1, "com.example.ui.screens.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:235)");
            }
            BadgeKt.BadgedBox(ComposableLambdaKt.rememberComposableLambda(-653897039, true, new Function3() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda1
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return MainScreenKt.MainScreen$lambda$49$lambda$48$lambda$47$lambda$43$lambda$42(i, (BoxScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer, 54), (Modifier) null, ComposableSingletons$MainScreenKt.INSTANCE.getLambda$156622575$app(), composer, 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$49$lambda$48$lambda$47$lambda$43$lambda$42(final int i, BoxScope boxScope, Composer composer, int i2) {
        Composer composer2;
        Intrinsics.checkNotNullParameter(boxScope, "$this$BadgedBox");
        ComposerKt.sourceInformation(composer, "C:MainScreen.kt#2thlc2");
        if ((i2 & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-653897039, i2, -1, "com.example.ui.screens.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:237)");
            }
            if (i > 0) {
                composer.startReplaceGroup(1725031002);
                ComposerKt.sourceInformation(composer, "238@10841L105,238@10835L111");
                composer2 = composer;
                BadgeKt.Badge-eopBjH0((Modifier) null, 0L, 0L, ComposableLambdaKt.rememberComposableLambda(-216924167, true, new Function3() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda30
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return MainScreenKt.MainScreen$lambda$49$lambda$48$lambda$47$lambda$43$lambda$42$lambda$41(i, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, composer, 54), composer2, 3072, 7);
            } else {
                composer2 = composer;
                composer2.startReplaceGroup(1714313713);
            }
            composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$49$lambda$48$lambda$47$lambda$43$lambda$42$lambda$41(int i, RowScope rowScope, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Badge");
        ComposerKt.sourceInformation(composer, "C239@10883L25:MainScreen.kt#2thlc2");
        if ((i2 & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-216924167, i2, -1, "com.example.ui.screens.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:239)");
            }
            TextKt.Text--4IGK_g(String.valueOf(i), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$49$lambda$48$lambda$47$lambda$46$lambda$45(String str, NavHostController navHostController) {
        if (!Intrinsics.areEqual(str, Scopes.PROFILE)) {
            navHostController.navigate(Scopes.PROFILE, new Function1() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda5
                public final Object invoke(Object obj) {
                    return MainScreenKt.MainScreen$lambda$49$lambda$48$lambda$47$lambda$46$lambda$45$lambda$44((NavOptionsBuilder) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$49$lambda$48$lambda$47$lambda$46$lambda$45$lambda$44(NavOptionsBuilder navOptionsBuilder) {
        Intrinsics.checkNotNullParameter(navOptionsBuilder, "$this$navigate");
        NavOptionsBuilder.popUpTo$default(navOptionsBuilder, "dashboard", (Function1) null, 2, (Object) null);
        navOptionsBuilder.setLaunchSingleTop(true);
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$94(boolean z, final String str, final String str2, final NavHostController navHostController, final State state, final State state2, final BookViewModel bookViewModel, final State state3, final Context context, final NavHostController navHostController2, PaddingValues paddingValues, Composer composer, int i) {
        int i2;
        Composer composer2;
        long jColor;
        Intrinsics.checkNotNullParameter(paddingValues, "innerPadding");
        ComposerKt.sourceInformation(composer, "C277@12569L6749:MainScreen.kt#2thlc2");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(paddingValues) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1670240579, i2, -1, "com.example.ui.screens.MainScreen.<anonymous> (MainScreen.kt:277)");
            }
            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null), paddingValues);
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierPadding);
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
            Composer composer3 = Updater.constructor-impl(composer);
            Updater.set-impl(composer3, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer3, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composer3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composer3.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.set-impl(composer3, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -167531829, "C321@14679L97,322@14811L98,323@14948L97,324@15083L98,325@15196L4112,317@14487L4821:MainScreen.kt#2thlc2");
            if (!z || StringsKt.isBlank(str)) {
                composer2 = composer;
                composer2.startReplaceGroup(-180365861);
            } else {
                composer.startReplaceGroup(-167636548);
                ComposerKt.sourceInformation(composer, "290@13196L1263,283@12796L1663");
                if (Intrinsics.areEqual(str2, "WARNING")) {
                    jColor = ColorKt.Color(4286067983L);
                } else {
                    jColor = Intrinsics.areEqual(str2, "SUCCESS") ? ColorKt.Color(4278603323L) : ColorKt.Color(4280171146L);
                }
                SurfaceKt.Surface-T9BRK9s(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), (Shape) null, jColor, 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(735689873, true, new Function2() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda31
                    public final Object invoke(Object obj, Object obj2) {
                        return MainScreenKt.MainScreen$lambda$94$lambda$93$lambda$51(str2, str, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer, 54), composer, 12582918, 122);
                composer2 = composer;
            }
            composer2.endReplaceGroup();
            Modifier modifierWeight$default = ColumnScope.weight$default(columnScope, Modifier.Companion, 1.0f, false, 2, (Object) null);
            ComposerKt.sourceInformationMarkerStart(composer2, 687388264, "CC(remember):MainScreen.kt#9igjgp");
            Object objRememberedValue = composer2.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda32
                    public final Object invoke(Object obj) {
                        return MainScreenKt.MainScreen$lambda$94$lambda$93$lambda$53$lambda$52((AnimatedContentTransitionScope) obj);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerStart(composer2, 687392489, "CC(remember):MainScreen.kt#9igjgp");
            Object objRememberedValue2 = composer2.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda34
                    public final Object invoke(Object obj) {
                        return MainScreenKt.MainScreen$lambda$94$lambda$93$lambda$55$lambda$54((AnimatedContentTransitionScope) obj);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue2);
            }
            Function1 function2 = (Function1) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerStart(composer2, 687396872, "CC(remember):MainScreen.kt#9igjgp");
            Object objRememberedValue3 = composer2.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda35
                    public final Object invoke(Object obj) {
                        return MainScreenKt.MainScreen$lambda$94$lambda$93$lambda$57$lambda$56((AnimatedContentTransitionScope) obj);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue3);
            }
            Function1 function3 = (Function1) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerStart(composer2, 687401193, "CC(remember):MainScreen.kt#9igjgp");
            Object objRememberedValue4 = composer2.rememberedValue();
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda36
                    public final Object invoke(Object obj) {
                        return MainScreenKt.MainScreen$lambda$94$lambda$93$lambda$59$lambda$58((AnimatedContentTransitionScope) obj);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue4);
            }
            Function1 function4 = (Function1) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerStart(composer2, 687408823, "CC(remember):MainScreen.kt#9igjgp");
            boolean zChanged = composer2.changed(state) | composer2.changed(state2) | composer2.changedInstance(bookViewModel) | composer2.changed(state3) | composer2.changedInstance(navHostController) | composer2.changedInstance(context) | composer2.changedInstance(navHostController2);
            Object objRememberedValue5 = composer2.rememberedValue();
            if (zChanged || objRememberedValue5 == Composer.Companion.getEmpty()) {
                Function1 function5 = new Function1() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda37
                    public final Object invoke(Object obj) {
                        return MainScreenKt.MainScreen$lambda$94$lambda$93$lambda$92$lambda$91(bookViewModel, state3, navHostController, context, navHostController2, state, state2, (NavGraphBuilder) obj);
                    }
                };
                composer2.updateRememberedValue(function5);
                objRememberedValue5 = function5;
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            NavHostKt.NavHost(navHostController, "dashboard", modifierWeight$default, null, null, function1, function2, function3, function4, null, (Function1) objRememberedValue5, composer2, 115015728, 0, 536);
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

    static final Unit MainScreen$lambda$94$lambda$93$lambda$51(String str, String str2, Composer composer, int i) {
        ImageVector checkCircle;
        ComposerKt.sourceInformation(composer, "C291@13218L1223:MainScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(735689873, i, -1, "com.example.ui.screens.MainScreen.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:291)");
            }
            Modifier modifier = PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(14.0f), Dp.constructor-impl(8.0f));
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Arrangement.Horizontal horizontal = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(8.0f));
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontal, centerVertically, composer, 54);
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
            ComposerKt.sourceInformationMarkerStart(composer, -1078364525, "C296@13528L513,306@14066L353:MainScreen.kt#2thlc2");
            if (Intrinsics.areEqual(str, "WARNING")) {
                checkCircle = WarningKt.getWarning(Icons.INSTANCE.getDefault());
            } else {
                checkCircle = Intrinsics.areEqual(str, "SUCCESS") ? CheckCircleKt.getCheckCircle(Icons.INSTANCE.getDefault()) : InfoKt.getInfo(Icons.INSTANCE.getDefault());
            }
            IconKt.Icon-ww6aTOc(checkCircle, (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), Color.Companion.getWhite-0d7_KjU(), composer, 3504, 0);
            TextKt.Text--4IGK_g(str2, RowScope.weight$default(rowScope, Modifier.Companion, 1.0f, false, 2, (Object) null), Color.Companion.getWhite-0d7_KjU(), TextUnitKt.getSp(12), (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 200064, 0, 131024);
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

    static final EnterTransition MainScreen$lambda$94$lambda$93$lambda$53$lambda$52(AnimatedContentTransitionScope animatedContentTransitionScope) {
        Intrinsics.checkNotNullParameter(animatedContentTransitionScope, "$this$NavHost");
        return EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(260, 0, (Easing) null, 6, (Object) null), 0.0f, 2, (Object) null);
    }

    static final ExitTransition MainScreen$lambda$94$lambda$93$lambda$55$lambda$54(AnimatedContentTransitionScope animatedContentTransitionScope) {
        Intrinsics.checkNotNullParameter(animatedContentTransitionScope, "$this$NavHost");
        return EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(180, 0, (Easing) null, 6, (Object) null), 0.0f, 2, (Object) null);
    }

    static final EnterTransition MainScreen$lambda$94$lambda$93$lambda$57$lambda$56(AnimatedContentTransitionScope animatedContentTransitionScope) {
        Intrinsics.checkNotNullParameter(animatedContentTransitionScope, "$this$NavHost");
        return EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(260, 0, (Easing) null, 6, (Object) null), 0.0f, 2, (Object) null);
    }

    static final ExitTransition MainScreen$lambda$94$lambda$93$lambda$59$lambda$58(AnimatedContentTransitionScope animatedContentTransitionScope) {
        Intrinsics.checkNotNullParameter(animatedContentTransitionScope, "$this$NavHost");
        return EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(180, 0, (Easing) null, 6, (Object) null), 0.0f, 2, (Object) null);
    }

    static final Unit MainScreen$lambda$94$lambda$93$lambda$92$lambda$91(final BookViewModel bookViewModel, final State state, final NavHostController navHostController, final Context context, final NavHostController navHostController2, final State state2, final State state3, NavGraphBuilder navGraphBuilder) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "$this$NavHost");
        NavGraphBuilderKt.composable$default(navGraphBuilder, "dashboard", null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1816332796, true, new Function4() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda13
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MainScreenKt.MainScreen$lambda$94$lambda$93$lambda$92$lambda$91$lambda$68(bookViewModel, state, navHostController, context, navHostController2, state2, state3, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 254, null);
        NavGraphBuilderKt.composable$default(navGraphBuilder, "chats", null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(2024804525, true, new Function4() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda14
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MainScreenKt.MainScreen$lambda$94$lambda$93$lambda$92$lambda$91$lambda$74(bookViewModel, navHostController2, navHostController, state3, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 254, null);
        NavGraphBuilderKt.composable$default(navGraphBuilder, "camera", null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-390636148, true, new Function4() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda15
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MainScreenKt.MainScreen$lambda$94$lambda$93$lambda$92$lambda$91$lambda$80(bookViewModel, navHostController, state3, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 254, null);
        NavGraphBuilderKt.composable$default(navGraphBuilder, "notifications", null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1488890475, true, new Function4() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda16
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MainScreenKt.MainScreen$lambda$94$lambda$93$lambda$92$lambda$91$lambda$85(bookViewModel, navHostController, navHostController2, state2, state3, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 254, null);
        NavGraphBuilderKt.composable$default(navGraphBuilder, Scopes.PROFILE, null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-926550198, true, new Function4() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda17
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MainScreenKt.MainScreen$lambda$94$lambda$93$lambda$92$lambda$91$lambda$90(bookViewModel, navHostController2, state2, state3, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 254, null);
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$94$lambda$93$lambda$92$lambda$91$lambda$68(final BookViewModel bookViewModel, final State state, final NavHostController navHostController, final Context context, final NavHostController navHostController2, State state2, State state3, AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(animatedContentScope, "$this$composable");
        Intrinsics.checkNotNullParameter(navBackStackEntry, "it");
        ComposerKt.sourceInformation(composer, "C331@15464L485,339@15991L22,340@16053L56,341@16152L43,327@15260L957:MainScreen.kt#2thlc2");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1816332796, i, -1, "com.example.ui.screens.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:327)");
        }
        List<Book> listMainScreen$lambda$0 = MainScreen$lambda$0(state2);
        String strMainScreen$lambda$1 = MainScreen$lambda$1(state3);
        if (strMainScreen$lambda$1 == null) {
            strMainScreen$lambda$1 = "";
        }
        ComposerKt.sourceInformationMarkerStart(composer, -1739087063, "CC(remember):MainScreen.kt#9igjgp");
        boolean zChanged = composer.changed(state) | composer.changedInstance(navHostController) | composer.changedInstance(context);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda38
                public final Object invoke() {
                    return MainScreenKt.MainScreen$lambda$94$lambda$93$lambda$92$lambda$91$lambda$68$lambda$61$lambda$60(navHostController, context, state);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, -1739070662, "CC(remember):MainScreen.kt#9igjgp");
        boolean zChangedInstance = composer.changedInstance(bookViewModel);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda39
                public final Object invoke() {
                    return MainScreenKt.MainScreen$lambda$94$lambda$93$lambda$92$lambda$91$lambda$68$lambda$63$lambda$62(bookViewModel);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function0 function1 = (Function0) objRememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, -1739068644, "CC(remember):MainScreen.kt#9igjgp");
        boolean zChangedInstance2 = composer.changedInstance(navHostController2);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
            objRememberedValue3 = new Function1() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda40
                public final Object invoke(Object obj) {
                    return MainScreenKt.MainScreen$lambda$94$lambda$93$lambda$92$lambda$91$lambda$68$lambda$65$lambda$64(navHostController2, (String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        Function1 function2 = (Function1) objRememberedValue3;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, -1739065489, "CC(remember):MainScreen.kt#9igjgp");
        boolean zChangedInstance3 = composer.changedInstance(navHostController);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChangedInstance3 || objRememberedValue4 == Composer.Companion.getEmpty()) {
            objRememberedValue4 = new Function0() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda41
                public final Object invoke() {
                    return MainScreenKt.MainScreen$lambda$94$lambda$93$lambda$92$lambda$91$lambda$68$lambda$67$lambda$66(navHostController);
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        DashboardScreenKt.DashboardScreen(listMainScreen$lambda$0, strMainScreen$lambda$1, bookViewModel, function0, function1, function2, (Function0) objRememberedValue4, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$94$lambda$93$lambda$92$lambda$91$lambda$68$lambda$61$lambda$60(NavHostController navHostController, Context context, State state) {
        Object obj = MainScreen$lambda$23(state).get("allowNewBookUploads");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null ? bool.booleanValue() : true) {
            NavController.navigate$default((NavController) navHostController, "camera", (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        } else {
            Toast.makeText(context, "Book uploads are temporarily paused by administrator", 0).show();
        }
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$94$lambda$93$lambda$92$lambda$91$lambda$68$lambda$63$lambda$62(BookViewModel bookViewModel) {
        bookViewModel.logout();
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$94$lambda$93$lambda$92$lambda$91$lambda$68$lambda$65$lambda$64(NavHostController navHostController, String str) {
        Intrinsics.checkNotNullParameter(str, "bookId");
        NavController.navigate$default((NavController) navHostController, "chat/" + str, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$94$lambda$93$lambda$92$lambda$91$lambda$68$lambda$67$lambda$66(NavHostController navHostController) {
        NavController.navigate$default((NavController) navHostController, Scopes.PROFILE, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$94$lambda$93$lambda$92$lambda$91$lambda$74(BookViewModel bookViewModel, final NavHostController navHostController, final NavHostController navHostController2, State state, AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(animatedContentScope, "$this$composable");
        Intrinsics.checkNotNullParameter(navBackStackEntry, "it");
        ComposerKt.sourceInformation(composer, "C349@16450L56,350@16549L237,346@16295L513:MainScreen.kt#2thlc2");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2024804525, i, -1, "com.example.ui.screens.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:346)");
        }
        String strMainScreen$lambda$1 = MainScreen$lambda$1(state);
        if (strMainScreen$lambda$1 == null) {
            strMainScreen$lambda$1 = "";
        }
        String str = strMainScreen$lambda$1;
        ComposerKt.sourceInformationMarkerStart(composer, 216969157, "CC(remember):MainScreen.kt#9igjgp");
        boolean zChangedInstance = composer.changedInstance(navHostController);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda10
                public final Object invoke(Object obj) {
                    return MainScreenKt.MainScreen$lambda$94$lambda$93$lambda$92$lambda$91$lambda$74$lambda$70$lambda$69(navHostController, (String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, 216972506, "CC(remember):MainScreen.kt#9igjgp");
        boolean zChangedInstance2 = composer.changedInstance(navHostController2);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda12
                public final Object invoke() {
                    return MainScreenKt.MainScreen$lambda$94$lambda$93$lambda$92$lambda$91$lambda$74$lambda$73$lambda$72(navHostController2);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        ChatsScreenKt.ChatsScreen(bookViewModel, str, function1, (Function0) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$94$lambda$93$lambda$92$lambda$91$lambda$74$lambda$70$lambda$69(NavHostController navHostController, String str) {
        Intrinsics.checkNotNullParameter(str, "bookId");
        NavController.navigate$default((NavController) navHostController, "chat/" + str, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$94$lambda$93$lambda$92$lambda$91$lambda$74$lambda$73$lambda$72(NavHostController navHostController) {
        navHostController.navigate("dashboard", new Function1() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return MainScreenKt.MainScreen$lambda$94$lambda$93$lambda$92$lambda$91$lambda$74$lambda$73$lambda$72$lambda$71((NavOptionsBuilder) obj);
            }
        });
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$94$lambda$93$lambda$92$lambda$91$lambda$74$lambda$73$lambda$72$lambda$71(NavOptionsBuilder navOptionsBuilder) {
        Intrinsics.checkNotNullParameter(navOptionsBuilder, "$this$navigate");
        NavOptionsBuilder.popUpTo$default(navOptionsBuilder, "dashboard", (Function1) null, 2, (Object) null);
        navOptionsBuilder.setLaunchSingleTop(true);
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$94$lambda$93$lambda$92$lambda$91$lambda$80(final BookViewModel bookViewModel, final NavHostController navHostController, State state, AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i) {
        String mobileNumber;
        Intrinsics.checkNotNullParameter(animatedContentScope, "$this$composable");
        Intrinsics.checkNotNullParameter(navBackStackEntry, "it");
        ComposerKt.sourceInformation(composer, "C360@16902L62,361@17007L30,364@17177L1273,362@17054L1414:MainScreen.kt#2thlc2");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-390636148, i, -1, "com.example.ui.screens.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:360)");
        }
        String strMainScreen$lambda$1 = MainScreen$lambda$1(state);
        ComposerKt.sourceInformationMarkerStart(composer, -1739182230, "CC(remember):MainScreen.kt#9igjgp");
        boolean zChanged = composer.changed(strMainScreen$lambda$1);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            String strMainScreen$lambda$2 = MainScreen$lambda$1(state);
            if (strMainScreen$lambda$2 == null) {
                strMainScreen$lambda$2 = "";
            }
            objRememberedValue = bookViewModel.getUser(strMainScreen$lambda$2);
            composer.updateRememberedValue(objRememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        User userMainScreen$lambda$94$lambda$93$lambda$92$lambda$91$lambda$80$lambda$76 = MainScreen$lambda$94$lambda$93$lambda$92$lambda$91$lambda$80$lambda$76(SnapshotStateKt.collectAsState((StateFlow) objRememberedValue, (Object) null, (CoroutineContext) null, composer, 48, 2));
        String str = (userMainScreen$lambda$94$lambda$93$lambda$92$lambda$91$lambda$80$lambda$76 == null || (mobileNumber = userMainScreen$lambda$94$lambda$93$lambda$92$lambda$91$lambda$80$lambda$76.getMobileNumber()) == null) ? "" : mobileNumber;
        ComposerKt.sourceInformationMarkerStart(composer, -1739172219, "CC(remember):MainScreen.kt#9igjgp");
        boolean zChangedInstance = composer.changedInstance(bookViewModel) | composer.changedInstance(navHostController);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new Function16() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda26
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16) {
                    return MainScreenKt.MainScreen$lambda$94$lambda$93$lambda$92$lambda$91$lambda$80$lambda$79$lambda$78(bookViewModel, navHostController, (String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, (String) obj7, (String) obj8, (Double) obj9, (Double) obj10, (String) obj11, (String) obj12, (String) obj13, (Integer) obj14, (String) obj15, (Double) obj16);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        CameraScreenKt.CameraScreen((Function16) objRememberedValue2, null, str, composer, 0, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$94$lambda$93$lambda$92$lambda$91$lambda$80$lambda$79$lambda$78(BookViewModel bookViewModel, NavHostController navHostController, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Double d, Double d2, String str9, String str10, String str11, Integer num, String str12, Double d3) {
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(str2, "author");
        Intrinsics.checkNotNullParameter(str3, "condition");
        Intrinsics.checkNotNullParameter(str4, "description");
        Intrinsics.checkNotNullParameter(str5, "genre");
        Intrinsics.checkNotNullParameter(str6, "pickupAddress");
        Intrinsics.checkNotNullParameter(str7, "mobileNumber");
        bookViewModel.addBook(str, str2, str3, str8, str4, str5, str6, str7, d, d2, str9, str10, str11, num, str12, d3);
        navHostController.navigate("dashboard", new Function1() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda25
            public final Object invoke(Object obj) {
                return MainScreenKt.MainScreen$lambda$94$lambda$93$lambda$92$lambda$91$lambda$80$lambda$79$lambda$78$lambda$77((NavOptionsBuilder) obj);
            }
        });
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$94$lambda$93$lambda$92$lambda$91$lambda$80$lambda$79$lambda$78$lambda$77(NavOptionsBuilder navOptionsBuilder) {
        Intrinsics.checkNotNullParameter(navOptionsBuilder, "$this$navigate");
        NavOptionsBuilder.popUpTo$default(navOptionsBuilder, "dashboard", (Function1) null, 2, (Object) null);
        navOptionsBuilder.setLaunchSingleTop(true);
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$94$lambda$93$lambda$92$lambda$91$lambda$85(BookViewModel bookViewModel, final NavHostController navHostController, final NavHostController navHostController2, State state, State state2, AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(animatedContentScope, "$this$composable");
        Intrinsics.checkNotNullParameter(navBackStackEntry, "it");
        ComposerKt.sourceInformation(composer, "C396@18746L43,397@18825L56,392@18554L345:MainScreen.kt#2thlc2");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1488890475, i, -1, "com.example.ui.screens.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:392)");
        }
        List<Book> listMainScreen$lambda$0 = MainScreen$lambda$0(state);
        String strMainScreen$lambda$1 = MainScreen$lambda$1(state2);
        if (strMainScreen$lambda$1 == null) {
            strMainScreen$lambda$1 = "";
        }
        ComposerKt.sourceInformationMarkerStart(composer, 599643670, "CC(remember):MainScreen.kt#9igjgp");
        boolean zChangedInstance = composer.changedInstance(navHostController);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda8
                public final Object invoke() {
                    return MainScreenKt.MainScreen$lambda$94$lambda$93$lambda$92$lambda$91$lambda$85$lambda$82$lambda$81(navHostController);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, 599646211, "CC(remember):MainScreen.kt#9igjgp");
        boolean zChangedInstance2 = composer.changedInstance(navHostController2);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda9
                public final Object invoke(Object obj) {
                    return MainScreenKt.MainScreen$lambda$94$lambda$93$lambda$92$lambda$91$lambda$85$lambda$84$lambda$83(navHostController2, (String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        NotificationsScreenKt.NotificationsScreen(listMainScreen$lambda$0, strMainScreen$lambda$1, bookViewModel, function0, (Function1) objRememberedValue2, composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$94$lambda$93$lambda$92$lambda$91$lambda$85$lambda$82$lambda$81(NavHostController navHostController) {
        NavController.navigate$default((NavController) navHostController, Scopes.PROFILE, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$94$lambda$93$lambda$92$lambda$91$lambda$85$lambda$84$lambda$83(NavHostController navHostController, String str) {
        Intrinsics.checkNotNullParameter(str, "bookId");
        NavController.navigate$default((NavController) navHostController, "chat/" + str, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$94$lambda$93$lambda$92$lambda$91$lambda$90(final BookViewModel bookViewModel, final NavHostController navHostController, State state, State state2, AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(animatedContentScope, "$this$composable");
        Intrinsics.checkNotNullParameter(navBackStackEntry, "it");
        ComposerKt.sourceInformation(composer, "C406@19150L56,407@19244L22,402@18967L317:MainScreen.kt#2thlc2");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-926550198, i, -1, "com.example.ui.screens.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:402)");
        }
        List<Book> listMainScreen$lambda$0 = MainScreen$lambda$0(state);
        String strMainScreen$lambda$1 = MainScreen$lambda$1(state2);
        if (strMainScreen$lambda$1 == null) {
            strMainScreen$lambda$1 = "";
        }
        String str = strMainScreen$lambda$1;
        ComposerKt.sourceInformationMarkerStart(composer, -1356503518, "CC(remember):MainScreen.kt#9igjgp");
        boolean zChangedInstance = composer.changedInstance(navHostController);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda42
                public final Object invoke(Object obj) {
                    return MainScreenKt.MainScreen$lambda$94$lambda$93$lambda$92$lambda$91$lambda$90$lambda$87$lambda$86(navHostController, (String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, -1356500544, "CC(remember):MainScreen.kt#9igjgp");
        boolean zChangedInstance2 = composer.changedInstance(bookViewModel);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.example.ui.screens.MainScreenKt$$ExternalSyntheticLambda43
                public final Object invoke() {
                    return MainScreenKt.MainScreen$lambda$94$lambda$93$lambda$92$lambda$91$lambda$90$lambda$89$lambda$88(bookViewModel);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        ProfileScreenKt.ProfileScreen(listMainScreen$lambda$0, str, bookViewModel, function1, (Function0) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$94$lambda$93$lambda$92$lambda$91$lambda$90$lambda$87$lambda$86(NavHostController navHostController, String str) {
        Intrinsics.checkNotNullParameter(str, "bookId");
        NavController.navigate$default((NavController) navHostController, "chat/" + str, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    static final Unit MainScreen$lambda$94$lambda$93$lambda$92$lambda$91$lambda$90$lambda$89$lambda$88(BookViewModel bookViewModel) {
        bookViewModel.logout();
        return Unit.INSTANCE;
    }

    private static final List<Book> MainScreen$lambda$0(State<? extends List<Book>> state) {
        return (List) state.getValue();
    }

    private static final String MainScreen$lambda$1(State<String> state) {
        return (String) state.getValue();
    }

    private static final List<Message> MainScreen$lambda$3(State<? extends List<Message>> state) {
        return (List) state.getValue();
    }

    private static final Map<String, Object> MainScreen$lambda$23(State<? extends Map<String, ? extends Object>> state) {
        return (Map) state.getValue();
    }

    private static final NavBackStackEntry MainScreen$lambda$49$lambda$48$lambda$47$lambda$24(State<NavBackStackEntry> state) {
        return (NavBackStackEntry) state.getValue();
    }

    private static final User MainScreen$lambda$94$lambda$93$lambda$92$lambda$91$lambda$80$lambda$76(State<User> state) {
        return (User) state.getValue();
    }
}
