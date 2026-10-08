package com.example.ui.screens;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.ChatKt;
import androidx.compose.material.icons.filled.BookKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonElevation;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.FilterChipDefaults;
import androidx.compose.material3.FloatingActionButtonElevation;
import androidx.compose.material3.FloatingActionButtonKt;
import androidx.compose.material3.IconButtonColors;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SelectableChipColors;
import androidx.compose.material3.SelectableChipElevation;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextFieldColors;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.profileinstaller.ProfileVerifier;
import coil.compose.SingletonAsyncImageKt;
import com.example.BuildConfig;
import com.example.data.Book;
import com.example.data.Message;
import com.example.ui.BookViewModel;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: ChatsScreen.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a?\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0002\u0010\n\u001a3\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0002\u0010\u000f\u001a\u0015\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0012\u001a\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0002¨\u0006\u0016²\u0006\u0010\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u008a\u0084\u0002²\u0006\u0010\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0018X\u008a\u0084\u0002²\u0006\n\u0010\u001c\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010\u001e\u001a\u00020\u001fX\u008a\u008e\u0002²\u0006\n\u0010 \u001a\u00020\u0015X\u008a\u008e\u0002²\u0006\n\u0010!\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\f\u0010\"\u001a\u0004\u0018\u00010\u0005X\u008a\u008e\u0002"}, d2 = {"ChatsScreen", "", "viewModel", "Lcom/example/ui/BookViewModel;", "currentUser", "", "onChatClick", "Lkotlin/Function1;", "onExploreClick", "Lkotlin/Function0;", "(Lcom/example/ui/BookViewModel;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "WhatsAppConversationItem", "conversation", "Lcom/example/ui/screens/ChatConversation;", "onClick", "(Lcom/example/ui/screens/ChatConversation;Ljava/lang/String;Lcom/example/ui/BookViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "DefaultAvatarCircle", "name", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "formatWhatsAppTime", "timestamp", "", "app", "allBooks", "", "Lcom/example/data/Book;", "userChats", "Lcom/example/data/Message;", "searchQuery", "selectedFilter", "showNewChatDialog", "", "readUpdateTrigger", "resolvedDisplayName", "resolvedPhotoUrl"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class ChatsScreenKt {
    static final Unit ChatsScreen$lambda$83(BookViewModel bookViewModel, String str, Function1 function1, Function0 function0, int i, Composer composer, int i2) {
        ChatsScreen(bookViewModel, str, function1, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit DefaultAvatarCircle$lambda$106(String str, int i, Composer composer, int i2) {
        DefaultAvatarCircle(str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit WhatsAppConversationItem$lambda$103(ChatConversation chatConversation, String str, BookViewModel bookViewModel, Function0 function0, int i, Composer composer, int i2) {
        WhatsAppConversationItem(chatConversation, str, bookViewModel, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:147:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:153:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:158:0x0400  */
    /* JADX WARN: Code duplicated, block: B:191:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:193:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:263:0x0677  */
    /* JADX WARN: Code duplicated, block: B:309:0x0517 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public static final void ChatsScreen(final BookViewModel bookViewModel, final String str, final Function1<? super String, Unit> function1, final Function0<Unit> function0, Composer composer, final int i) {
        SharedPreferences sharedPreferences;
        MutableState mutableState;
        List listSortedWith;
        Object next;
        Iterator it;
        MutableState mutableState2;
        Object next2;
        Object obj;
        String ownerName;
        String strSubstringBefore$default;
        String strValueOf;
        String string;
        Iterator it2;
        SharedPreferences sharedPreferences2;
        int i2;
        Message message;
        ChatConversation chatConversation;
        boolean zIsOwner;
        Book book;
        String title;
        Intrinsics.checkNotNullParameter(bookViewModel, "viewModel");
        Intrinsics.checkNotNullParameter(str, "currentUser");
        Intrinsics.checkNotNullParameter(function1, "onChatClick");
        Intrinsics.checkNotNullParameter(function0, "onExploreClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(2131913821);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ChatsScreen)P(3)60@2114L16,61@2155L61,62@2252L37,64@2314L31,65@2372L34,66@2436L34,68@2503L7,69@2527L84,70@2641L55,72@2770L7,73@2815L393,73@2782L426,85@3238L460,85@3214L484,97@3724L2604,148@6352L66,150@6452L695,169@7180L5814,284@13027L421,295@13455L4841,168@7153L11143:ChatsScreen.kt#2thlc2");
        int i3 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(bookViewModel) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2131913821, i3, -1, "com.example.ui.screens.ChatsScreen (ChatsScreen.kt:59)");
            }
            final State stateCollectAsState = SnapshotStateKt.collectAsState(bookViewModel.getAllBooks(), (CoroutineContext) null, composerStartRestartGroup, 0, 1);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 69790618, "CC(remember):ChatsScreen.kt#9igjgp");
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = bookViewModel.getUserChats(str);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            State stateCollectAsState2 = SnapshotStateKt.collectAsState((StateFlow) objRememberedValue, CollectionsKt.emptyList(), (CoroutineContext) null, composerStartRestartGroup, 48, 2);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 69795676, "CC(remember):ChatsScreen.kt#9igjgp");
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final MutableState mutableState3 = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 69797535, "CC(remember):ChatsScreen.kt#9igjgp");
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt.mutableStateOf$default("All", (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final MutableState mutableState4 = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 69799583, "CC(remember):ChatsScreen.kt#9igjgp");
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final MutableState mutableState5 = (MutableState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            CompositionLocal localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Context context = (Context) objConsume;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 69802545, "CC(remember):ChatsScreen.kt#9igjgp");
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                SharedPreferences sharedPreferences3 = context.getSharedPreferences("book_borrow_prefs", 0);
                composerStartRestartGroup.updateRememberedValue(sharedPreferences3);
                objRememberedValue5 = sharedPreferences3;
            }
            final SharedPreferences sharedPreferences4 = (SharedPreferences) objRememberedValue5;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 69806164, "CC(remember):ChatsScreen.kt#9igjgp");
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == Composer.Companion.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt.mutableStateOf$default(Long.valueOf(System.currentTimeMillis()), (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            final MutableState mutableState6 = (MutableState) objRememberedValue6;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            CompositionLocal localLifecycleOwner = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composerStartRestartGroup.consume(localLifecycleOwner);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final LifecycleOwner lifecycleOwner = (LifecycleOwner) objConsume2;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 69812070, "CC(remember):ChatsScreen.kt#9igjgp");
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(lifecycleOwner);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue7 == Composer.Companion.getEmpty()) {
                objRememberedValue7 = new Function1() { // from class: com.example.ui.screens.ChatsScreenKt$$ExternalSyntheticLambda25
                    public final Object invoke(Object obj2) {
                        return ChatsScreenKt.ChatsScreen$lambda$19$lambda$18(lifecycleOwner, mutableState6, (DisposableEffectScope) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            EffectsKt.DisposableEffect(lifecycleOwner, (Function1) objRememberedValue7, composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 69825673, "CC(remember):ChatsScreen.kt#9igjgp");
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(sharedPreferences4);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue8 == Composer.Companion.getEmpty()) {
                objRememberedValue8 = new Function1() { // from class: com.example.ui.screens.ChatsScreenKt$$ExternalSyntheticLambda26
                    public final Object invoke(Object obj2) {
                        return ChatsScreenKt.ChatsScreen$lambda$23$lambda$22(sharedPreferences4, mutableState6, (DisposableEffectScope) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            EffectsKt.DisposableEffect(sharedPreferences4, (Function1) objRememberedValue8, composerStartRestartGroup, 0);
            List<Message> listChatsScreen$lambda$2 = ChatsScreen$lambda$2(stateCollectAsState2);
            List<Book> listChatsScreen$lambda$0 = ChatsScreen$lambda$0(stateCollectAsState);
            long jChatsScreen$lambda$14 = ChatsScreen$lambda$14(mutableState6);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 69843369, "CC(remember):ChatsScreen.kt#9igjgp");
            boolean zChanged = (i4 == 32) | composerStartRestartGroup.changed(listChatsScreen$lambda$2) | composerStartRestartGroup.changed(listChatsScreen$lambda$0) | composerStartRestartGroup.changed(jChatsScreen$lambda$14);
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue9 == Composer.Companion.getEmpty()) {
                if (ChatsScreen$lambda$2(stateCollectAsState2).isEmpty()) {
                    listSortedWith = CollectionsKt.emptyList();
                    sharedPreferences = sharedPreferences4;
                    mutableState = mutableState6;
                } else {
                    List<Message> listChatsScreen$lambda$3 = ChatsScreen$lambda$2(stateCollectAsState2);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj2 : listChatsScreen$lambda$3) {
                        String bookId = ((Message) obj2).getBookId();
                        Object obj3 = linkedHashMap.get(bookId);
                        if (obj3 == null) {
                            obj3 = (List) new ArrayList();
                            linkedHashMap.put(bookId, obj3);
                        }
                        ((List) obj3).add(obj2);
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it3 = linkedHashMap.entrySet().iterator();
                    while (it3.hasNext()) {
                        Map.Entry entry = (Map.Entry) it3.next();
                        String str2 = (String) entry.getKey();
                        List list = (List) entry.getValue();
                        Iterator<T> it4 = ChatsScreen$lambda$0(stateCollectAsState).iterator();
                        do {
                            if (!it4.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it4.next();
                        } while (!Intrinsics.areEqual(((Book) next).getId(), str2));
                        Book book2 = (Book) next;
                        List list2 = list;
                        Message message2 = (Message) CollectionsKt.firstOrNull(CollectionsKt.sortedWith(list2, new Comparator() { // from class: com.example.ui.screens.ChatsScreenKt$ChatsScreen$lambda$35$lambda$33$$inlined$sortedByDescending$1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.Comparator
                            public final int compare(T t, T t2) {
                                return ComparisonsKt.compareValues(Long.valueOf(((Message) t2).getTimestamp()), Long.valueOf(((Message) t).getTimestamp()));
                            }
                        }));
                        if (message2 == null) {
                            sharedPreferences2 = sharedPreferences4;
                            it = it3;
                            mutableState2 = mutableState6;
                            chatConversation = null;
                        } else {
                            Iterator it5 = list2.iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    it = it3;
                                    mutableState2 = mutableState6;
                                    next2 = null;
                                    break;
                                }
                                next2 = it5.next();
                                Message message3 = (Message) next2;
                                it = it3;
                                mutableState2 = mutableState6;
                                Iterator it6 = it5;
                                if (!StringsKt.equals(StringsKt.trim(message3.getSender()).toString(), StringsKt.trim(str).toString(), true) && !StringsKt.isBlank(message3.getSender())) {
                                    break;
                                }
                                it3 = it;
                                it5 = it6;
                                mutableState6 = mutableState2;
                            }
                            Message message4 = (Message) next2;
                            Iterator it7 = list2.iterator();
                            while (true) {
                                if (!it7.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                Object next3 = it7.next();
                                Message message5 = (Message) next3;
                                Iterator it8 = it7;
                                obj = next3;
                                if (!StringsKt.equals(StringsKt.trim(message5.getReceiver()).toString(), StringsKt.trim(str).toString(), true) && !StringsKt.isBlank(message5.getReceiver())) {
                                    break;
                                } else {
                                    it7 = it8;
                                }
                            }
                            Message message6 = (Message) obj;
                            boolean z2 = book2 != null && StringsKt.equals(StringsKt.trim(book2.getOwnerName()).toString(), StringsKt.trim(str).toString(), true);
                            if (message4 != null) {
                                ownerName = message4.getSender();
                            } else if (message6 != null) {
                                ownerName = message6.getReceiver();
                            } else if (z2) {
                                if (book2 == null || (ownerName = book2.getRequestedByName()) == null) {
                                    if (book2 != null || (ownerName = book2.getBorrowerName()) == null || StringsKt.isBlank(ownerName)) {
                                        ownerName = null;
                                    }
                                    if (ownerName == null) {
                                        ownerName = "";
                                    }
                                } else {
                                    if (StringsKt.isBlank(ownerName)) {
                                        ownerName = null;
                                    }
                                    if (ownerName == null) {
                                        if (book2 != null) {
                                            ownerName = null;
                                        } else {
                                            ownerName = null;
                                        }
                                        if (ownerName == null) {
                                            ownerName = "";
                                        }
                                    }
                                }
                            } else if (book2 != null) {
                                ownerName = book2.getOwnerName();
                            } else {
                                ownerName = "";
                            }
                            if (z2 || book2 == null || StringsKt.isBlank(book2.getOwnerDisplayName())) {
                                if (!StringsKt.isBlank(ownerName)) {
                                    strSubstringBefore$default = StringsKt.substringBefore$default(ownerName, "@", (String) null, 2, (Object) null);
                                    if (strSubstringBefore$default.length() > 0) {
                                        StringBuilder sb = new StringBuilder();
                                        char cCharAt = strSubstringBefore$default.charAt(0);
                                        if (Character.isLowerCase(cCharAt)) {
                                            Locale locale = Locale.getDefault();
                                            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                                            strValueOf = CharsKt.titlecase(cCharAt, locale);
                                        } else {
                                            strValueOf = String.valueOf(cCharAt);
                                        }
                                        StringBuilder sbAppend = sb.append((Object) strValueOf);
                                        String strSubstring = strSubstringBefore$default.substring(1);
                                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                                        strSubstringBefore$default = sbAppend.append(strSubstring).toString();
                                    }
                                } else {
                                    ownerName = ownerName;
                                    strSubstringBefore$default = "Reader";
                                }
                                String str3 = strSubstringBefore$default;
                                long j = sharedPreferences4.getLong("chat_last_read_" + str2, 0L);
                                string = sharedPreferences4.getString("chat_last_read_msg_id_" + str2, null);
                                if ((string == null && Intrinsics.areEqual(message2.getId(), string)) || message2.getTimestamp() <= j || ((list2 instanceof Collection) && list2.isEmpty())) {
                                    sharedPreferences2 = sharedPreferences4;
                                    i2 = 0;
                                } else {
                                    it2 = list2.iterator();
                                    int i5 = 0;
                                    while (it2.hasNext()) {
                                        message = (Message) it2.next();
                                        SharedPreferences sharedPreferences5 = sharedPreferences4;
                                        Iterator it9 = it2;
                                        if (StringsKt.equals(StringsKt.trim(message.getSender()).toString(), StringsKt.trim(str).toString(), true) && message.getTimestamp() > j && !Intrinsics.areEqual(message.getId(), string) && (i5 = i5 + 1) < 0) {
                                            CollectionsKt.throwCountOverflow();
                                        }
                                        it2 = it9;
                                        sharedPreferences4 = sharedPreferences5;
                                    }
                                    sharedPreferences2 = sharedPreferences4;
                                    i2 = i5;
                                }
                                chatConversation = new ChatConversation(str2, book2, ownerName, str3, null, message2, i2, z2);
                            } else {
                                strSubstringBefore$default = book2.getOwnerDisplayName();
                            }
                            ownerName = ownerName;
                            String str4 = strSubstringBefore$default;
                            long j2 = sharedPreferences4.getLong("chat_last_read_" + str2, 0L);
                            string = sharedPreferences4.getString("chat_last_read_msg_id_" + str2, null);
                            if (string == null) {
                                it2 = list2.iterator();
                                int i6 = 0;
                                while (it2.hasNext()) {
                                    message = (Message) it2.next();
                                    SharedPreferences sharedPreferences6 = sharedPreferences4;
                                    Iterator it10 = it2;
                                    if (StringsKt.equals(StringsKt.trim(message.getSender()).toString(), StringsKt.trim(str).toString(), true)) {
                                    }
                                    it2 = it10;
                                    sharedPreferences4 = sharedPreferences6;
                                }
                                sharedPreferences2 = sharedPreferences4;
                                i2 = i6;
                            } else {
                                it2 = list2.iterator();
                                int i7 = 0;
                                while (it2.hasNext()) {
                                    message = (Message) it2.next();
                                    SharedPreferences sharedPreferences7 = sharedPreferences4;
                                    Iterator it11 = it2;
                                    if (StringsKt.equals(StringsKt.trim(message.getSender()).toString(), StringsKt.trim(str).toString(), true)) {
                                    }
                                    it2 = it11;
                                    sharedPreferences4 = sharedPreferences7;
                                }
                                sharedPreferences2 = sharedPreferences4;
                                i2 = i7;
                            }
                            chatConversation = new ChatConversation(str2, book2, ownerName, str4, null, message2, i2, z2);
                        }
                        if (chatConversation != null) {
                            arrayList.add(chatConversation);
                        }
                        it3 = it;
                        mutableState6 = mutableState2;
                        sharedPreferences4 = sharedPreferences2;
                    }
                    sharedPreferences = sharedPreferences4;
                    mutableState = mutableState6;
                    listSortedWith = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.example.ui.screens.ChatsScreenKt$ChatsScreen$lambda$35$$inlined$sortedByDescending$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return ComparisonsKt.compareValues(Long.valueOf(((ChatConversation) t2).getLastMessage().getTimestamp()), Long.valueOf(((ChatConversation) t).getLastMessage().getTimestamp()));
                        }
                    });
                }
                objRememberedValue9 = listSortedWith;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            } else {
                sharedPreferences = sharedPreferences4;
                mutableState = mutableState6;
            }
            List list3 = (List) objRememberedValue9;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 69924927, "CC(remember):ChatsScreen.kt#9igjgp");
            boolean zChanged2 = composerStartRestartGroup.changed(list3);
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue10 == Composer.Companion.getEmpty()) {
                Iterator it12 = list3.iterator();
                int unreadCount = 0;
                while (it12.hasNext()) {
                    unreadCount += ((ChatConversation) it12.next()).getUnreadCount();
                }
                objRememberedValue10 = Integer.valueOf(unreadCount);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            final int iIntValue = ((Number) objRememberedValue10).intValue();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            String strChatsScreen$lambda$4 = ChatsScreen$lambda$4(mutableState3);
            String strChatsScreen$lambda$7 = ChatsScreen$lambda$7(mutableState4);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 69928756, "CC(remember):ChatsScreen.kt#9igjgp");
            boolean zChanged3 = composerStartRestartGroup.changed(strChatsScreen$lambda$4) | composerStartRestartGroup.changed(list3) | composerStartRestartGroup.changed(strChatsScreen$lambda$7);
            ArrayList arrayListRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || arrayListRememberedValue == Composer.Companion.getEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : list3) {
                    ChatConversation chatConversation2 = (ChatConversation) obj4;
                    boolean z3 = StringsKt.isBlank(ChatsScreen$lambda$4(mutableState3)) || StringsKt.contains(chatConversation2.getOtherUserName(), ChatsScreen$lambda$4(mutableState3), true) || !((book = chatConversation2.getBook()) == null || (title = book.getTitle()) == null || !StringsKt.contains(title, ChatsScreen$lambda$4(mutableState3), true)) || StringsKt.contains(chatConversation2.getLastMessage().getContent(), ChatsScreen$lambda$4(mutableState3), true);
                    String strChatsScreen$lambda$8 = ChatsScreen$lambda$7(mutableState4);
                    int iHashCode = strChatsScreen$lambda$8.hashCode();
                    if (iHashCode != -1756405809) {
                        if (iHashCode != -1683370579) {
                            if (iHashCode == 1727018099 && strChatsScreen$lambda$8.equals("Lending")) {
                                zIsOwner = chatConversation2.isOwner();
                            }
                        } else if (strChatsScreen$lambda$8.equals("Borrowing") && chatConversation2.isOwner()) {
                            zIsOwner = false;
                        }
                        zIsOwner = true;
                    } else if (strChatsScreen$lambda$8.equals("Unread") && chatConversation2.getUnreadCount() <= 0) {
                        zIsOwner = false;
                    } else {
                        zIsOwner = true;
                    }
                    if (z3 && zIsOwner) {
                        arrayList2.add(obj4);
                    }
                }
                arrayListRememberedValue = arrayList2;
                composerStartRestartGroup.updateRememberedValue(arrayListRememberedValue);
            }
            final List list4 = (List) arrayListRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final MutableState mutableState7 = mutableState;
            final SharedPreferences sharedPreferences8 = sharedPreferences;
            ScaffoldKt.Scaffold-TvnljyQ((Modifier) null, ComposableLambdaKt.rememberComposableLambda(1784685849, true, new Function2() { // from class: com.example.ui.screens.ChatsScreenKt$$ExternalSyntheticLambda27
                public final Object invoke(Object obj5, Object obj6) {
                    return ChatsScreenKt.ChatsScreen$lambda$56(iIntValue, mutableState5, mutableState3, mutableState4, (Composer) obj5, ((Integer) obj6).intValue());
                }
            }, composerStartRestartGroup, 54), (Function2) null, (Function2) null, ComposableLambdaKt.rememberComposableLambda(-1089724618, true, new Function2() { // from class: com.example.ui.screens.ChatsScreenKt$$ExternalSyntheticLambda28
                public final Object invoke(Object obj5, Object obj6) {
                    return ChatsScreenKt.ChatsScreen$lambda$59(mutableState5, (Composer) obj5, ((Integer) obj6).intValue());
                }
            }, composerStartRestartGroup, 54), 0, 0L, 0L, (WindowInsets) null, ComposableLambdaKt.rememberComposableLambda(-593805970, true, new Function3() { // from class: com.example.ui.screens.ChatsScreenKt$$ExternalSyntheticLambda1
                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                    return ChatsScreenKt.ChatsScreen$lambda$70(list4, str, bookViewModel, sharedPreferences8, function1, mutableState3, function0, mutableState5, mutableState7, (PaddingValues) obj5, (Composer) obj6, ((Integer) obj7).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 805330992, 493);
            composerStartRestartGroup = composerStartRestartGroup;
            if (!ChatsScreen$lambda$10(mutableState5)) {
                composerStartRestartGroup.startReplaceGroup(-2133598779);
            } else {
                composerStartRestartGroup.startReplaceGroup(-2115220212);
                ComposerKt.sourceInformation(composerStartRestartGroup, "393@18379L29,493@24597L137,397@18541L6026,392@18335L6409");
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 70309754, "CC(remember):ChatsScreen.kt#9igjgp");
                Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue11 == Composer.Companion.getEmpty()) {
                    objRememberedValue11 = new Function0() { // from class: com.example.ui.screens.ChatsScreenKt$$ExternalSyntheticLambda2
                        public final Object invoke() {
                            return ChatsScreenKt.ChatsScreen$lambda$72$lambda$71(mutableState5);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                AndroidAlertDialog_androidKt.AlertDialog-Oix01E0((Function0) objRememberedValue11, ComposableLambdaKt.rememberComposableLambda(1846530026, true, new Function2() { // from class: com.example.ui.screens.ChatsScreenKt$$ExternalSyntheticLambda3
                    public final Object invoke(Object obj5, Object obj6) {
                        return ChatsScreenKt.ChatsScreen$lambda$75(mutableState5, (Composer) obj5, ((Integer) obj6).intValue());
                    }
                }, composerStartRestartGroup, 54), (Modifier) null, (Function2) null, (Function2) null, ComposableSingletons$ChatsScreenKt.INSTANCE.getLambda$1985825774$app(), ComposableLambdaKt.rememberComposableLambda(2020649711, true, new Function2() { // from class: com.example.ui.screens.ChatsScreenKt$$ExternalSyntheticLambda4
                    public final Object invoke(Object obj5, Object obj6) {
                        return ChatsScreenKt.ChatsScreen$lambda$82(sharedPreferences8, function1, str, stateCollectAsState, mutableState5, mutableState7, (Composer) obj5, ((Integer) obj6).intValue());
                    }
                }, composerStartRestartGroup, 54), (Shape) null, 0L, 0L, 0L, 0L, 0.0f, (DialogProperties) null, composerStartRestartGroup, 1769526, 0, 16284);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.ChatsScreenKt$$ExternalSyntheticLambda5
                public final Object invoke(Object obj5, Object obj6) {
                    return ChatsScreenKt.ChatsScreen$lambda$83(bookViewModel, str, function1, function0, i, (Composer) obj5, ((Integer) obj6).intValue());
                }
            });
        }
    }

    private static final String ChatsScreen$lambda$4(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ChatsScreen$lambda$7(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final boolean ChatsScreen$lambda$10(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChatsScreen$lambda$11(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final long ChatsScreen$lambda$14(MutableState<Long> mutableState) {
        return ((Number) ((State) mutableState).getValue()).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChatsScreen$lambda$15(MutableState<Long> mutableState, long j) {
        mutableState.setValue(Long.valueOf(j));
    }

    static final DisposableEffectResult ChatsScreen$lambda$19$lambda$18(final LifecycleOwner lifecycleOwner, final MutableState mutableState, DisposableEffectScope disposableEffectScope) {
        Intrinsics.checkNotNullParameter(disposableEffectScope, "$this$DisposableEffect");
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.example.ui.screens.ChatsScreenKt$$ExternalSyntheticLambda18
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                ChatsScreenKt.ChatsScreen$lambda$19$lambda$18$lambda$16(mutableState, lifecycleOwner2, event);
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new DisposableEffectResult() { // from class: com.example.ui.screens.ChatsScreenKt$ChatsScreen$lambda$19$lambda$18$$inlined$onDispose$1
            public void dispose() {
                lifecycleOwner.getLifecycle().removeObserver(lifecycleEventObserver);
            }
        };
    }

    static final void ChatsScreen$lambda$19$lambda$18$lambda$16(MutableState mutableState, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.Event.ON_RESUME) {
            ChatsScreen$lambda$15(mutableState, System.currentTimeMillis());
        }
    }

    static final DisposableEffectResult ChatsScreen$lambda$23$lambda$22(final SharedPreferences sharedPreferences, final MutableState mutableState, DisposableEffectScope disposableEffectScope) {
        Intrinsics.checkNotNullParameter(disposableEffectScope, "$this$DisposableEffect");
        final SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.example.ui.screens.ChatsScreenKt$$ExternalSyntheticLambda20
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                ChatsScreenKt.ChatsScreen$lambda$23$lambda$22$lambda$20(mutableState, sharedPreferences2, str);
            }
        };
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        return new DisposableEffectResult() { // from class: com.example.ui.screens.ChatsScreenKt$ChatsScreen$lambda$23$lambda$22$$inlined$onDispose$1
            public void dispose() {
                sharedPreferences.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
            }
        };
    }

    static final void ChatsScreen$lambda$23$lambda$22$lambda$20(MutableState mutableState, SharedPreferences sharedPreferences, String str) {
        if (str != null) {
            if (StringsKt.startsWith$default(str, "chat_last_read_", false, 2, (Object) null) || StringsKt.startsWith$default(str, "chat_last_read_msg_id_", false, 2, (Object) null)) {
                ChatsScreen$lambda$15(mutableState, System.currentTimeMillis());
            }
        }
    }

    static final Unit ChatsScreen$lambda$56(final int i, final MutableState mutableState, final MutableState mutableState2, final MutableState mutableState3, Composer composer, int i2) {
        ComposerKt.sourceInformation(composer, "C171@7241L11,173@7315L5669,170@7194L5790:ChatsScreen.kt#2thlc2");
        if ((i2 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1784685849, i2, -1, "com.example.ui.screens.ChatsScreen.<anonymous> (ChatsScreen.kt:170)");
            }
            SurfaceKt.Surface-T9BRK9s((Modifier) null, (Shape) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0.0f, Dp.constructor-impl(1.0f), (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(1055048158, true, new Function2() { // from class: com.example.ui.screens.ChatsScreenKt$$ExternalSyntheticLambda19
                public final Object invoke(Object obj, Object obj2) {
                    return ChatsScreenKt.ChatsScreen$lambda$56$lambda$55(i, mutableState, mutableState2, mutableState3, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 12779520, 91);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    static final Unit ChatsScreen$lambda$56$lambda$55(final int i, final MutableState mutableState, MutableState mutableState2, final MutableState mutableState3, Composer composer, int i2) {
        ?? r1;
        final MutableState mutableState4;
        ComposerKt.sourceInformation(composer, "C174@7333L5637:ChatsScreen.kt#2thlc2");
        if ((i2 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1055048158, i2, -1, "com.example.ui.screens.ChatsScreen.<anonymous>.<anonymous> (ChatsScreen.kt:174)");
            }
            Modifier modifier = PaddingKt.padding-VpY3zN4(WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null)), Dp.constructor-impl(16.0f), Dp.constructor-impl(12.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
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
            ComposerKt.sourceInformationMarkerStart(composer, 1191783632, "C180@7577L1945,218@9544L41,247@11071L11,248@11187L11,249@11297L11,246@10997L415,222@9711L20,237@10481L353,220@9607L1959,257@11588L41,262@11817L1135,259@11651L1301:ChatsScreen.kt#2thlc2");
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer, 54);
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
            ComposerKt.sourceInformationMarkerStart(composer, 763346218, "C185@7835L1289,209@9171L28,209@9150L350:ChatsScreen.kt#2thlc2");
            Alignment.Vertical centerVertically2 = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier2 = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer, 48);
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
            Updater.set-impl(composer4, measurePolicyRowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer4, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer4.getInserting() || !Intrinsics.areEqual(composer4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composer4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composer4.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.set-impl(composer4, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope2 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -651132118, "C188@8025L10,190@8168L11,186@7917L302:ChatsScreen.kt#2thlc2");
            TextKt.Text--4IGK_g("Chats", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getHeadlineMedium(), composer, 196614, 0, 65498);
            if (i > 0) {
                composer.startReplaceGroup(-650793847);
                ComposerKt.sourceInformation(composer, "193@8303L39,197@8537L531,194@8375L693");
                SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
                r1 = 1;
                SurfaceKt.Surface-T9BRK9s((Modifier) null, RoundedCornerShapeKt.getCircleShape(), ColorKt.Color(4279994175L), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-595845038, true, new Function2() { // from class: com.example.ui.screens.ChatsScreenKt$$ExternalSyntheticLambda13
                    public final Object invoke(Object obj, Object obj2) {
                        return ChatsScreenKt.ChatsScreen$lambda$56$lambda$55$lambda$54$lambda$44$lambda$41$lambda$40(i, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer, 54), composer, 12583296, 121);
            } else {
                r1 = 1;
                composer.startReplaceGroup(-659023386);
            }
            composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 1687233172, "CC(remember):ChatsScreen.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.ChatsScreenKt$$ExternalSyntheticLambda14
                    public final Object invoke() {
                        return ChatsScreenKt.ChatsScreen$lambda$56$lambda$55$lambda$54$lambda$44$lambda$43$lambda$42(mutableState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            IconButtonKt.IconButton((Function0) objRememberedValue, (Modifier) null, false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableSingletons$ChatsScreenKt.INSTANCE.m270getLambda$601486699$app(), composer, 196614, 30);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f)), composer, 6);
            String strChatsScreen$lambda$4 = ChatsScreen$lambda$4(mutableState2);
            Shape shape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(24.0f));
            TextFieldColors textFieldColors = OutlinedTextFieldDefaults.INSTANCE.colors-0hiis_0(0L, 0L, 0L, 0L, Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0.45f, 0.0f, 0.0f, 0.0f, 14, (Object) null), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0L, 0L, 0L, (TextSelectionColors) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), Color.Companion.getTransparent-0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 0, 384, 0, 0, 3072, 2147477455, 4095);
            Modifier modifier3 = SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, (int) r1, (Object) null), Dp.constructor-impl(50.0f));
            ComposerKt.sourceInformationMarkerStart(composer, 1978170216, "CC(remember):ChatsScreen.kt#9igjgp");
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                mutableState4 = mutableState2;
                objRememberedValue2 = new Function1() { // from class: com.example.ui.screens.ChatsScreenKt$$ExternalSyntheticLambda15
                    public final Object invoke(Object obj) {
                        return ChatsScreenKt.ChatsScreen$lambda$56$lambda$55$lambda$54$lambda$46$lambda$45(mutableState4, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            } else {
                mutableState4 = mutableState2;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            OutlinedTextFieldKt.OutlinedTextField(strChatsScreen$lambda$4, (Function1) objRememberedValue2, modifier3, false, false, (TextStyle) null, (Function2) null, ComposableSingletons$ChatsScreenKt.INSTANCE.m271getLambda$700946995$app(), ComposableSingletons$ChatsScreenKt.INSTANCE.getLambda$637545260$app(), ComposableLambdaKt.rememberComposableLambda(1976037515, (boolean) r1, new Function2() { // from class: com.example.ui.screens.ChatsScreenKt$$ExternalSyntheticLambda16
                public final Object invoke(Object obj, Object obj2) {
                    return ChatsScreenKt.ChatsScreen$lambda$56$lambda$55$lambda$54$lambda$49(mutableState4, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), (Function2) null, (Function2) null, (Function2) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, shape, textFieldColors, composer, 918553008, 12582912, 0, 1965176);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f)), composer, 6);
            Arrangement.Horizontal horizontal = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(8.0f));
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            Arrangement.Horizontal horizontal2 = horizontal;
            ComposerKt.sourceInformationMarkerStart(composer, 1978238723, "CC(remember):ChatsScreen.kt#9igjgp");
            boolean zChanged = composer.changed(i);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.example.ui.screens.ChatsScreenKt$$ExternalSyntheticLambda17
                    public final Object invoke(Object obj) {
                        return ChatsScreenKt.ChatsScreen$lambda$56$lambda$55$lambda$54$lambda$53$lambda$52(mutableState3, i, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            LazyDslKt.LazyRow(modifierFillMaxWidth$default2, (LazyListState) null, (PaddingValues) null, false, horizontal2, (Alignment.Vertical) null, (FlingBehavior) null, false, (Function1) objRememberedValue3, composer, 24582, 238);
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

    static final Unit ChatsScreen$lambda$56$lambda$55$lambda$54$lambda$44$lambda$41$lambda$40(int i, Composer composer, int i2) {
        ComposerKt.sourceInformation(composer, "C201@8800L10,198@8575L459:ChatsScreen.kt#2thlc2");
        if ((i2 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-595845038, i2, -1, "com.example.ui.screens.ChatsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatsScreen.kt:198)");
            }
            String strValueOf = i > 99 ? "99+" : String.valueOf(i);
            String str = strValueOf;
            TextKt.Text--4IGK_g(str, PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(7.0f), Dp.constructor-impl(2.0f)), Color.Companion.getWhite-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 197040, 0, 65496);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ChatsScreen$lambda$56$lambda$55$lambda$54$lambda$44$lambda$43$lambda$42(MutableState mutableState) {
        ChatsScreen$lambda$11(mutableState, true);
        return Unit.INSTANCE;
    }

    static final Unit ChatsScreen$lambda$56$lambda$55$lambda$54$lambda$46$lambda$45(MutableState mutableState, String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        mutableState.setValue(str);
        return Unit.INSTANCE;
    }

    static final Unit ChatsScreen$lambda$56$lambda$55$lambda$54$lambda$49(final MutableState mutableState, Composer composer, int i) {
        Composer composer2;
        ComposerKt.sourceInformation(composer, "C:ChatsScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1976037515, i, -1, "com.example.ui.screens.ChatsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatsScreen.kt:238)");
            }
            if (StringsKt.isBlank(ChatsScreen$lambda$4(mutableState))) {
                composer2 = composer;
                composer2.startReplaceGroup(1301452247);
            } else {
                composer.startReplaceGroup(1311918188);
                ComposerKt.sourceInformation(composer, "239@10596L20,239@10575L203");
                ComposerKt.sourceInformationMarkerStart(composer, 596510783, "CC(remember):ChatsScreen.kt#9igjgp");
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.example.ui.screens.ChatsScreenKt$$ExternalSyntheticLambda10
                        public final Object invoke() {
                            return ChatsScreenKt.ChatsScreen$lambda$56$lambda$55$lambda$54$lambda$49$lambda$48$lambda$47(mutableState);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer2 = composer;
                IconButtonKt.IconButton((Function0) objRememberedValue, (Modifier) null, false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableSingletons$ChatsScreenKt.INSTANCE.m267getLambda$1416871021$app(), composer2, 196614, 30);
            }
            composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ChatsScreen$lambda$56$lambda$55$lambda$54$lambda$49$lambda$48$lambda$47(MutableState mutableState) {
        mutableState.setValue("");
        return Unit.INSTANCE;
    }

    static final Unit ChatsScreen$lambda$56$lambda$55$lambda$54$lambda$53$lambda$52(final MutableState mutableState, final int i, LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyRow");
        final List listListOf = CollectionsKt.listOf(new String[]{"All", "Unread", "Lending", "Borrowing"});
        final ChatsScreenKt$ChatsScreen$lambda$56$lambda$55$lambda$54$lambda$53$lambda$52$$inlined$items$default$1 chatsScreenKt$ChatsScreen$lambda$56$lambda$55$lambda$54$lambda$53$lambda$52$$inlined$items$default$1 = new Function1() { // from class: com.example.ui.screens.ChatsScreenKt$ChatsScreen$lambda$56$lambda$55$lambda$54$lambda$53$lambda$52$$inlined$items$default$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final Void m183invoke(String str) {
                return null;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m183invoke((String) obj);
            }
        };
        lazyListScope.items(listListOf.size(), (Function1) null, new Function1<Integer, Object>() { // from class: com.example.ui.screens.ChatsScreenKt$ChatsScreen$lambda$56$lambda$55$lambda$54$lambda$53$lambda$52$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i2) {
                return chatsScreenKt$ChatsScreen$lambda$56$lambda$55$lambda$54$lambda$53$lambda$52$$inlined$items$default$1.invoke(listListOf.get(i2));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.screens.ChatsScreenKt$ChatsScreen$lambda$56$lambda$55$lambda$54$lambda$53$lambda$52$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
                int i4;
                ChatsScreenKt$ChatsScreen$lambda$56$lambda$55$lambda$54$lambda$53$lambda$52$$inlined$items$default$4 chatsScreenKt$ChatsScreen$lambda$56$lambda$55$lambda$54$lambda$53$lambda$52$$inlined$items$default$4;
                Object obj;
                ComposerKt.sourceInformation(composer, "C152@7074L22:LazyDsl.kt#428nma");
                if ((i3 & 6) == 0) {
                    i4 = i3 | (composer.changed(lazyItemScope) ? 4 : 2);
                } else {
                    i4 = i3;
                }
                if ((i3 & 48) == 0) {
                    i4 |= composer.changed(i2) ? 32 : 16;
                }
                if ((i4 & BuildConfig.VERSION_CODE) == 146 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i4, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                }
                final String str = (String) listListOf.get(i2);
                composer.startReplaceGroup(-1180842916);
                ComposerKt.sourceInformation(composer, "C*273@12581L226,268@12163L27,269@12232L287,266@12054L850:ChatsScreen.kt#2thlc2");
                final boolean zAreEqual = Intrinsics.areEqual(ChatsScreenKt.ChatsScreen$lambda$7(mutableState), str);
                SelectableChipColors selectableChipColors = FilterChipDefaults.INSTANCE.filterChipColors-XqyqHi0(0L, 0L, 0L, 0L, 0L, 0L, 0L, Color.copy-wmQWz5c$default(ColorKt.Color(4279994175L), 0.15f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, ColorKt.Color(4279193906L), 0L, 0L, composer, 817889280, FilterChipDefaults.$stable << 6, 3455);
                Shape shape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(16.0f));
                ComposerKt.sourceInformationMarkerStart(composer, -2116296854, "CC(remember):ChatsScreen.kt#9igjgp");
                boolean zChanged = composer.changed(str);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    chatsScreenKt$ChatsScreen$lambda$56$lambda$55$lambda$54$lambda$53$lambda$52$$inlined$items$default$4 = this;
                    final MutableState mutableState2 = mutableState;
                    obj = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.ChatsScreenKt$ChatsScreen$3$1$1$4$1$1$1$1
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m180invoke();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m180invoke() {
                            mutableState2.setValue(str);
                        }
                    };
                    composer.updateRememberedValue(obj);
                } else {
                    obj = objRememberedValue;
                    chatsScreenKt$ChatsScreen$lambda$56$lambda$55$lambda$54$lambda$53$lambda$52$$inlined$items$default$4 = this;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                final int i5 = i;
                ChipKt.FilterChip(zAreEqual, (Function0) obj, ComposableLambdaKt.rememberComposableLambda(-1477270046, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.ui.screens.ChatsScreenKt$ChatsScreen$3$1$1$4$1$1$2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        invoke((Composer) obj2, ((Number) obj3).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        int i7;
                        ComposerKt.sourceInformation(composer2, "C271@12401L84:ChatsScreen.kt#2thlc2");
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1477270046, i6, -1, "com.example.ui.screens.ChatsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatsScreen.kt:270)");
                        }
                        TextKt.Text--4IGK_g((!Intrinsics.areEqual(str, "Unread") || (i7 = i5) <= 0) ? str : "Unread (" + i7 + ")", (Modifier) null, 0L, 0L, (FontStyle) null, zAreEqual ? FontWeight.Companion.getBold() : FontWeight.Companion.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer2, 0, 0, 131038);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), (Modifier) null, false, (Function2) null, (Function2) null, shape, selectableChipColors, (SelectableChipElevation) null, (BorderStroke) null, (MutableInteractionSource) null, composer, 384, 0, 3704);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    static final Unit ChatsScreen$lambda$59(final MutableState mutableState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C286@13089L28,285@13041L397:ChatsScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1089724618, i, -1, "com.example.ui.screens.ChatsScreen.<anonymous> (ChatsScreen.kt:285)");
            }
            long jColor = ColorKt.Color(4279994175L);
            long j = Color.Companion.getWhite-0d7_KjU();
            Shape circleShape = RoundedCornerShapeKt.getCircleShape();
            Modifier modifier = PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, Dp.constructor-impl(80.0f), 7, (Object) null);
            ComposerKt.sourceInformationMarkerStart(composer, 746664338, "CC(remember):ChatsScreen.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.ChatsScreenKt$$ExternalSyntheticLambda11
                    public final Object invoke() {
                        return ChatsScreenKt.ChatsScreen$lambda$59$lambda$58$lambda$57(mutableState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            FloatingActionButtonKt.FloatingActionButton-X-z6DiA((Function0) objRememberedValue, modifier, circleShape, jColor, j, (FloatingActionButtonElevation) null, (MutableInteractionSource) null, ComposableSingletons$ChatsScreenKt.INSTANCE.m272getLambda$869596684$app(), composer, 12610614, 96);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ChatsScreen$lambda$59$lambda$58$lambda$57(MutableState mutableState) {
        ChatsScreen$lambda$11(mutableState, true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 12 */
    static final Unit ChatsScreen$lambda$70(final List list, final String str, final BookViewModel bookViewModel, final SharedPreferences sharedPreferences, final Function1 function1, MutableState mutableState, Function0 function0, final MutableState mutableState2, final MutableState mutableState3, PaddingValues paddingValues, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(paddingValues, "innerPadding");
        ComposerKt.sourceInformation(composer, "C300@13630L11,296@13481L4809:ChatsScreen.kt#2thlc2");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(paddingValues) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-593805970, i2, -1, "com.example.ui.screens.ChatsScreen.<anonymous> (ChatsScreen.kt:296)");
            }
            Modifier modifier = BackgroundKt.background-bw27NRU$default(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null), paddingValues), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getBackground-0d7_KjU(), (Shape) null, 2, (Object) null);
            ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
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
            ComposerKt.sourceInformationMarkerStart(composer, -692546539, "C:ChatsScreen.kt#2thlc2");
            if (list.isEmpty()) {
                composer.startReplaceGroup(-692555499);
                ComposerKt.sourceInformation(composer, "303@13733L3097");
                Modifier modifier2 = PaddingKt.padding-3ABfNKs(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(32.0f));
                Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
                Arrangement.Vertical center = Arrangement.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer, 54);
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
                ComposerKt.sourceInformationMarkerStart(composer, 1677103812, "C310@14034L627,324@14682L41,327@14906L10,329@15029L11,325@14744L328,331@15093L40,335@15442L10,336@15511L11,332@15154L492,339@15667L41,340@15729L1083:ChatsScreen.kt#2thlc2");
                SurfaceKt.Surface-T9BRK9s(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(96.0f)), RoundedCornerShapeKt.getCircleShape(), Color.copy-wmQWz5c$default(ColorKt.Color(4279994175L), 0.1f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableSingletons$ChatsScreenKt.INSTANCE.getLambda$365164448$app(), composer, 12583302, 120);
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(20.0f)), composer, 6);
                String str2 = !StringsKt.isBlank(ChatsScreen$lambda$4(mutableState)) ? "No Matching Chats" : "No Conversations Yet";
                TextKt.Text--4IGK_g(str2, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleLarge(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
                TextKt.Text--4IGK_g(!StringsKt.isBlank(ChatsScreen$lambda$4(mutableState)) ? "Try searching for a different name or book title." : "When you request a book or someone contacts you about a book, your chats will appear here.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.box-impl(TextAlign.Companion.getCenter-e0LSkKk()), 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 0, 0, 65018);
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(24.0f)), composer, 6);
                Arrangement.Horizontal horizontal = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(10.0f));
                ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                Modifier modifier3 = Modifier.Companion;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontal, Alignment.Companion.getTop(), composer, 6);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifier3);
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
                Updater.set-impl(composer4, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl(composer4, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composer4.getInserting() || !Intrinsics.areEqual(composer4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composer4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composer4.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.set-impl(composer4, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScope rowScope = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, -2079061912, "C343@15926L48,341@15812L516,351@16407L28,350@16353L437:ChatsScreen.kt#2thlc2");
                ButtonKt.Button(function0, (Modifier) null, false, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(24.0f)), ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(ColorKt.Color(4279994175L), 0L, 0L, 0L, composer, (ButtonDefaults.$stable << 12) | 6, 14), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$ChatsScreenKt.INSTANCE.m269getLambda$23034343$app(), composer, 805306368, 486);
                ComposerKt.sourceInformationMarkerStart(composer, 348593573, "CC(remember):ChatsScreen.kt#9igjgp");
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.example.ui.screens.ChatsScreenKt$$ExternalSyntheticLambda8
                        public final Object invoke() {
                            return ChatsScreenKt.ChatsScreen$lambda$70$lambda$69$lambda$63$lambda$62$lambda$61$lambda$60(mutableState2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(24.0f));
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
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-689498248);
                ComposerKt.sourceInformation(composer, "364@17021L1245,361@16868L1398");
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null);
                PaddingValues paddingValues2 = PaddingKt.PaddingValues-a9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.constructor-impl(16.0f), 7, (Object) null);
                ComposerKt.sourceInformationMarkerStart(composer, 1086142065, "CC(remember):ChatsScreen.kt#9igjgp");
                boolean zChangedInstance = composer.changedInstance(list) | composer.changed(str) | composer.changedInstance(bookViewModel) | composer.changedInstance(sharedPreferences) | composer.changed(function1);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    Function1 function2 = new Function1() { // from class: com.example.ui.screens.ChatsScreenKt$$ExternalSyntheticLambda9
                        public final Object invoke(Object obj) {
                            return ChatsScreenKt.ChatsScreen$lambda$70$lambda$69$lambda$68$lambda$67(list, str, bookViewModel, sharedPreferences, function1, mutableState3, (LazyListScope) obj);
                        }
                    };
                    composer.updateRememberedValue(function2);
                    objRememberedValue2 = function2;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                LazyDslKt.LazyColumn(modifierFillMaxSize$default, (LazyListState) null, paddingValues2, false, (Arrangement.Vertical) null, (Alignment.Horizontal) null, (FlingBehavior) null, false, (Function1) objRememberedValue2, composer, 390, 250);
                composer.endReplaceGroup();
            }
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

    static final Unit ChatsScreen$lambda$70$lambda$69$lambda$63$lambda$62$lambda$61$lambda$60(MutableState mutableState) {
        ChatsScreen$lambda$11(mutableState, true);
        return Unit.INSTANCE;
    }

    static final Unit ChatsScreen$lambda$70$lambda$69$lambda$68$lambda$67(final List list, final String str, final BookViewModel bookViewModel, final SharedPreferences sharedPreferences, final Function1 function1, final MutableState mutableState, LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyColumn");
        final Function1 function2 = new Function1() { // from class: com.example.ui.screens.ChatsScreenKt$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return ChatsScreenKt.ChatsScreen$lambda$70$lambda$69$lambda$68$lambda$67$lambda$64((ChatConversation) obj);
            }
        };
        final ChatsScreenKt$ChatsScreen$lambda$70$lambda$69$lambda$68$lambda$67$$inlined$items$default$1 chatsScreenKt$ChatsScreen$lambda$70$lambda$69$lambda$68$lambda$67$$inlined$items$default$1 = new Function1() { // from class: com.example.ui.screens.ChatsScreenKt$ChatsScreen$lambda$70$lambda$69$lambda$68$lambda$67$$inlined$items$default$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final Void m184invoke(ChatConversation chatConversation) {
                return null;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m184invoke((ChatConversation) obj);
            }
        };
        lazyListScope.items(list.size(), new Function1<Integer, Object>() { // from class: com.example.ui.screens.ChatsScreenKt$ChatsScreen$lambda$70$lambda$69$lambda$68$lambda$67$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i) {
                return function2.invoke(list.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: com.example.ui.screens.ChatsScreenKt$ChatsScreen$lambda$70$lambda$69$lambda$68$lambda$67$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i) {
                return chatsScreenKt$ChatsScreen$lambda$70$lambda$69$lambda$68$lambda$67$$inlined$items$default$1.invoke(list.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.screens.ChatsScreenKt$ChatsScreen$lambda$70$lambda$69$lambda$68$lambda$67$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                ComposerKt.sourceInformation(composer, "C152@7074L22:LazyDsl.kt#428nma");
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if ((i3 & BuildConfig.VERSION_CODE) == 146 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                }
                final ChatConversation chatConversation = (ChatConversation) list.get(i);
                composer.startReplaceGroup(-92501953);
                ComposerKt.sourceInformation(composer, "C*370@17346L569,366@17127L814,383@18155L11,380@17966L260:ChatsScreen.kt#2thlc2");
                String str2 = str;
                BookViewModel bookViewModel2 = bookViewModel;
                ComposerKt.sourceInformationMarkerStart(composer, -2081187438, "CC(remember):ChatsScreen.kt#9igjgp");
                boolean zChangedInstance = composer.changedInstance(chatConversation) | composer.changedInstance(sharedPreferences) | composer.changed(function1);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                    final SharedPreferences sharedPreferences2 = sharedPreferences;
                    final Function1 function3 = function1;
                    final MutableState mutableState2 = mutableState;
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.ChatsScreenKt$ChatsScreen$5$1$2$1$2$1$1
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m181invoke();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m181invoke() {
                            sharedPreferences2.edit().putLong("chat_last_read_" + chatConversation.getBookId(), Math.max(System.currentTimeMillis(), chatConversation.getLastMessage().getTimestamp()) + 2000).putString("chat_last_read_msg_id_" + chatConversation.getBookId(), chatConversation.getLastMessage().getId()).commit();
                            ChatsScreenKt.ChatsScreen$lambda$15(mutableState2, System.currentTimeMillis());
                            function3.invoke(chatConversation.getBookId());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                ChatsScreenKt.WhatsAppConversationItem(chatConversation, str2, bookViewModel2, (Function0) objRememberedValue, composer, 0);
                DividerKt.HorizontalDivider-9IZ8Weo(PaddingKt.padding-qDBjuR0$default(Modifier.Companion, Dp.constructor-impl(76.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null), Dp.constructor-impl(0.5f), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOutlineVariant-0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null), composer, 54, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    static final Object ChatsScreen$lambda$70$lambda$69$lambda$68$lambda$67$lambda$64(ChatConversation chatConversation) {
        Intrinsics.checkNotNullParameter(chatConversation, "it");
        return chatConversation.getBookId();
    }

    static final Unit ChatsScreen$lambda$72$lambda$71(MutableState mutableState) {
        ChatsScreen$lambda$11(mutableState, false);
        return Unit.INSTANCE;
    }

    static final Unit ChatsScreen$lambda$82(final SharedPreferences sharedPreferences, final Function1 function1, final String str, State state, final MutableState mutableState, final MutableState mutableState2, Composer composer, int i) {
        String requestedByName;
        String borrowerName;
        ComposerKt.sourceInformation(composer, "C398@18559L5994:ChatsScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2020649711, i, -1, "com.example.ui.screens.ChatsScreen.<anonymous> (ChatsScreen.kt:398)");
            }
            Arrangement.Vertical vertical = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(8.0f));
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
            ComposerKt.sourceInformationMarkerStart(composer, 79925333, "C401@18769L10,402@18838L11,399@18638L250,404@18909L40:ChatsScreen.kt#2thlc2");
            TextKt.Text--4IGK_g("Select any book to chat with the owner or borrower:", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 6, 0, 65530);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            List<Book> listChatsScreen$lambda$0 = ChatsScreen$lambda$0(state);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listChatsScreen$lambda$0) {
                Book book = (Book) obj;
                if (!Intrinsics.areEqual(book.getOwnerName(), str) || (((requestedByName = book.getRequestedByName()) != null && !StringsKt.isBlank(requestedByName)) || ((borrowerName = book.getBorrowerName()) != null && !StringsKt.isBlank(borrowerName)))) {
                    arrayList.add(obj);
                }
            }
            final ArrayList arrayList2 = arrayList;
            if (arrayList2.isEmpty()) {
                composer.startReplaceGroup(80352698);
                ComposerKt.sourceInformation(composer, "413@19396L10,414@19468L11,411@19270L243");
                TextKt.Text--4IGK_g("No books available in the library yet.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOutline-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 65530);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(80793115);
                ComposerKt.sourceInformation(composer, "417@19672L4841,417@19567L4946");
                Modifier modifier2 = SizeKt.heightIn-VpY3zN4$default(Modifier.Companion, 0.0f, Dp.constructor-impl(300.0f), 1, (Object) null);
                Arrangement.Vertical vertical2 = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(6.0f));
                ComposerKt.sourceInformationMarkerStart(composer, 1665178254, "CC(remember):ChatsScreen.kt#9igjgp");
                boolean zChangedInstance = composer.changedInstance(arrayList2) | composer.changedInstance(sharedPreferences) | composer.changed(function1) | composer.changed(str);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                    Function1 function2 = new Function1() { // from class: com.example.ui.screens.ChatsScreenKt$$ExternalSyntheticLambda12
                        public final Object invoke(Object obj2) {
                            return ChatsScreenKt.ChatsScreen$lambda$82$lambda$81$lambda$80$lambda$79(arrayList2, sharedPreferences, function1, mutableState, mutableState2, str, (LazyListScope) obj2);
                        }
                    };
                    composer.updateRememberedValue(function2);
                    objRememberedValue = function2;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                LazyDslKt.LazyColumn(modifier2, (LazyListState) null, (PaddingValues) null, false, vertical2, (Alignment.Horizontal) null, (FlingBehavior) null, false, (Function1) objRememberedValue, composer, 24582, 238);
                composer.endReplaceGroup();
            }
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

    static final Unit ChatsScreen$lambda$75(final MutableState mutableState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C494@24636L29,494@24615L105:ChatsScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1846530026, i, -1, "com.example.ui.screens.ChatsScreen.<anonymous> (ChatsScreen.kt:494)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, 693863015, "CC(remember):ChatsScreen.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.ChatsScreenKt$$ExternalSyntheticLambda21
                    public final Object invoke() {
                        return ChatsScreenKt.ChatsScreen$lambda$75$lambda$74$lambda$73(mutableState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ButtonKt.TextButton((Function0) objRememberedValue, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$ChatsScreenKt.INSTANCE.getLambda$1002096231$app(), composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ChatsScreen$lambda$75$lambda$74$lambda$73(MutableState mutableState) {
        ChatsScreen$lambda$11(mutableState, false);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0109  */
    public static final void WhatsAppConversationItem(final ChatConversation chatConversation, final String str, final BookViewModel bookViewModel, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        String ownerProfilePicUrl;
        Book book;
        Composer composer2;
        Intrinsics.checkNotNullParameter(chatConversation, "conversation");
        Intrinsics.checkNotNullParameter(str, "currentUser");
        Intrinsics.checkNotNullParameter(bookViewModel, "viewModel");
        Intrinsics.checkNotNullParameter(function0, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(818783742);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(WhatsAppConversationItem)P(!2,3)509@24946L98,512@25073L232,516@25355L513,516@25311L557,531@25894L115,541@26218L11,542@26244L8471,537@26080L8635:ChatsScreen.kt#2thlc2");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(chatConversation) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(bookViewModel) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i2 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(818783742, i2, -1, "com.example.ui.screens.WhatsAppConversationItem (ChatsScreen.kt:508)");
            }
            String otherUserEmail = chatConversation.getOtherUserEmail();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 872167136, "CC(remember):ChatsScreen.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(otherUserEmail);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateOf$default(chatConversation.getOtherUserName(), (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            String otherUserEmail2 = chatConversation.getOtherUserEmail();
            Book book2 = chatConversation.getBook();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 872171334, "CC(remember):ChatsScreen.kt#9igjgp");
            boolean zChanged2 = composerStartRestartGroup.changed(otherUserEmail2) | composerStartRestartGroup.changed(book2);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                if (chatConversation.isOwner()) {
                    ownerProfilePicUrl = null;
                } else {
                    Book book3 = chatConversation.getBook();
                    String ownerProfilePicUrl2 = book3 != null ? book3.getOwnerProfilePicUrl() : null;
                    if (ownerProfilePicUrl2 == null || StringsKt.isBlank(ownerProfilePicUrl2) || (book = chatConversation.getBook()) == null) {
                        ownerProfilePicUrl = null;
                    } else {
                        ownerProfilePicUrl = book.getOwnerProfilePicUrl();
                    }
                }
                objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(ownerProfilePicUrl, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final MutableState mutableState2 = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            String otherUserEmail3 = chatConversation.getOtherUserEmail();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 872180639, "CC(remember):ChatsScreen.kt#9igjgp");
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(chatConversation) | composerStartRestartGroup.changedInstance(bookViewModel) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(mutableState2);
            ChatsScreenKt$WhatsAppConversationItem$1$1 chatsScreenKt$WhatsAppConversationItem$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || chatsScreenKt$WhatsAppConversationItem$1$1RememberedValue == Composer.Companion.getEmpty()) {
                chatsScreenKt$WhatsAppConversationItem$1$1RememberedValue = new ChatsScreenKt$WhatsAppConversationItem$1$1(chatConversation, bookViewModel, mutableState, mutableState2, null);
                composerStartRestartGroup.updateRememberedValue(chatsScreenKt$WhatsAppConversationItem$1$1RememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            EffectsKt.LaunchedEffect(otherUserEmail3, (Function2) chatsScreenKt$WhatsAppConversationItem$1$1RememberedValue, composerStartRestartGroup, 0);
            long timestamp = chatConversation.getLastMessage().getTimestamp();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 872197489, "CC(remember):ChatsScreen.kt#9igjgp");
            boolean zChanged3 = composerStartRestartGroup.changed(timestamp);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = formatWhatsAppTime(chatConversation.getLastMessage().getTimestamp());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final String str2 = (String) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final boolean zAreEqual = Intrinsics.areEqual(chatConversation.getLastMessage().getSender(), str);
            composer2 = composerStartRestartGroup;
            SurfaceKt.Surface-T9BRK9s(ClickableKt.clickable-XHw0xAI$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), false, (String) null, (Role) null, function0, 7, (Object) null), (Shape) null, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(1813914755, true, new Function2() { // from class: com.example.ui.screens.ChatsScreenKt$$ExternalSyntheticLambda22
                public final Object invoke(Object obj, Object obj2) {
                    return ChatsScreenKt.WhatsAppConversationItem$lambda$102(chatConversation, mutableState2, mutableState, str2, zAreEqual, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composer2, 12582912, 122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.ChatsScreenKt$$ExternalSyntheticLambda23
                public final Object invoke(Object obj, Object obj2) {
                    return ChatsScreenKt.WhatsAppConversationItem$lambda$103(chatConversation, str, bookViewModel, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final String WhatsAppConversationItem$lambda$85(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final String WhatsAppConversationItem$lambda$88(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:190:0x028f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0254  */
    /* JADX WARN: Code duplicated, block: B:58:0x02a9 A[Catch: Exception -> 0x02b1, TRY_LEAVE, TryCatch #2 {Exception -> 0x02b1, blocks: (B:56:0x029e, B:58:0x02a9), top: B:192:0x029e }] */
    /* JADX WARN: Code duplicated, block: B:62:0x02b1 A[PHI: r13 r14
      0x02b1: PHI (r13v21 androidx.compose.ui.graphics.ImageBitmap) = 
      (r13v20 androidx.compose.ui.graphics.ImageBitmap)
      (r13v23 androidx.compose.ui.graphics.ImageBitmap)
      (r13v23 androidx.compose.ui.graphics.ImageBitmap)
     binds: [B:61:0x02b0, B:186:0x02b1, B:57:0x02a7] A[DONT_GENERATE, DONT_INLINE]
      0x02b1: PHI (r14v25 int) = (r14v24 int), (r14v27 int), (r14v27 int) binds: [B:61:0x02b0, B:186:0x02b1, B:57:0x02a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x02be  */
    /* JADX WARN: Code duplicated, block: B:67:0x02fb  */
    static final Unit WhatsAppConversationItem$lambda$102(ChatConversation chatConversation, MutableState mutableState, MutableState mutableState2, String str, boolean z, Composer composer, int i) {
        String str2;
        String str3;
        ImageBitmap imageBitmap;
        BoxScope boxScope;
        String str4;
        String str5;
        String str6;
        int i2;
        long jColor;
        String str7;
        String str8;
        long j;
        int i3;
        final ChatConversation chatConversation2;
        int i4;
        Pair pair;
        boolean zChanged;
        Object objRememberedValue;
        ImageBitmap imageBitmapAsImageBitmap;
        Bitmap bitmapDecodeByteArray;
        ImageBitmap imageBitmap2;
        Composer composer2 = composer;
        ComposerKt.sourceInformation(composer2, "C543@26254L8455:ChatsScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1813914755, i, -1, "com.example.ui.screens.WhatsAppConversationItem.<anonymous> (ChatsScreen.kt:543)");
            }
            Modifier modifier = PaddingKt.padding-VpY3zN4(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(16.0f), Dp.constructor-impl(12.0f));
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifier);
            Function0 constructor = ComposeUiNode.Companion.getConstructor();
            String str9 = "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo";
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composer3 = Updater.constructor-impl(composer2);
            Updater.set-impl(composer3, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer3, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composer3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composer3.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.set-impl(composer3, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, 819517559, "C549@26470L2556,606@29040L40,608@29094L4410:ChatsScreen.kt#2thlc2");
            Modifier modifier2 = SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(54.0f));
            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifier2);
            Function0 constructor2 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer composer4 = Updater.constructor-impl(composer2);
            Updater.set-impl(composer4, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer4, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer4.getInserting() || !Intrinsics.areEqual(composer4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composer4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composer4.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.set-impl(composer4, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScope boxScope2 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, 768717919, "C589@28429L11,587@28337L675:ChatsScreen.kt#2thlc2");
            String strWhatsAppConversationItem$lambda$88 = WhatsAppConversationItem$lambda$88(mutableState);
            if (strWhatsAppConversationItem$lambda$88 == null || StringsKt.isBlank(strWhatsAppConversationItem$lambda$88)) {
                str2 = "C101@5126L9:Row.kt#2w3rfo";
                str3 = "C73@3429L9:Box.kt#2w3rfo";
                imageBitmap = null;
                boxScope = boxScope2;
                str4 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                str5 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                str6 = "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo";
                str9 = str9;
                i2 = 0;
                composer2.startReplaceGroup(770343589);
                ComposerKt.sourceInformation(composer2, "584@28261L40");
                DefaultAvatarCircle(WhatsAppConversationItem$lambda$85(mutableState2), composer2, 0);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(768731248);
                ComposerKt.sourceInformation(composer2, "");
                String strWhatsAppConversationItem$lambda$89 = WhatsAppConversationItem$lambda$88(mutableState);
                Intrinsics.checkNotNull(strWhatsAppConversationItem$lambda$89);
                if (StringsKt.startsWith$default(strWhatsAppConversationItem$lambda$89, "data:image", false, 2, (Object) null)) {
                    str2 = "C101@5126L9:Row.kt#2w3rfo";
                    str3 = "C73@3429L9:Box.kt#2w3rfo";
                    boxScope = boxScope2;
                    str4 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                    str5 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                    str6 = "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo";
                    composer2.startReplaceGroup(768819505);
                    ComposerKt.sourceInformation(composer2, "552@26709L479");
                    String strWhatsAppConversationItem$lambda$810 = WhatsAppConversationItem$lambda$88(mutableState);
                    ComposerKt.sourceInformationMarkerStart(composer2, -113746100, "CC(remember):ChatsScreen.kt#9igjgp");
                    zChanged = composer2.changed(strWhatsAppConversationItem$lambda$810);
                    objRememberedValue = composer2.rememberedValue();
                    if (zChanged) {
                        String strWhatsAppConversationItem$lambda$811 = WhatsAppConversationItem$lambda$88(mutableState);
                        Intrinsics.checkNotNull(strWhatsAppConversationItem$lambda$811);
                        imageBitmap = null;
                        i2 = 0;
                        byte[] bArrDecode = Base64.decode(StringsKt.substringAfter$default(strWhatsAppConversationItem$lambda$811, "base64,", (String) null, 2, (Object) null), 0);
                        bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                        if (bitmapDecodeByteArray != null) {
                            imageBitmapAsImageBitmap = AndroidImageBitmap_androidKt.asImageBitmap(bitmapDecodeByteArray);
                        } else {
                            imageBitmapAsImageBitmap = imageBitmap;
                        }
                        composer2.updateRememberedValue(imageBitmapAsImageBitmap);
                        objRememberedValue = imageBitmapAsImageBitmap;
                    } else {
                        String strWhatsAppConversationItem$lambda$812 = WhatsAppConversationItem$lambda$88(mutableState);
                        Intrinsics.checkNotNull(strWhatsAppConversationItem$lambda$812);
                        imageBitmap = null;
                        i2 = 0;
                        byte[] bArrDecode2 = Base64.decode(StringsKt.substringAfter$default(strWhatsAppConversationItem$lambda$812, "base64,", (String) null, 2, (Object) null), 0);
                        bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode2, 0, bArrDecode2.length);
                        if (bitmapDecodeByteArray != null) {
                            imageBitmapAsImageBitmap = AndroidImageBitmap_androidKt.asImageBitmap(bitmapDecodeByteArray);
                        } else {
                            imageBitmapAsImageBitmap = imageBitmap;
                        }
                        composer2.updateRememberedValue(imageBitmapAsImageBitmap);
                        objRememberedValue = imageBitmapAsImageBitmap;
                    }
                    imageBitmap2 = (ImageBitmap) objRememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (imageBitmap2 != null) {
                        composer2.startReplaceGroup(769356704);
                        ComposerKt.sourceInformation(composer2, "562@27263L381");
                        ImageKt.Image-5h-nEew(imageBitmap2, WhatsAppConversationItem$lambda$85(mutableState2), ClipKt.clip(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(50.0f)), RoundedCornerShapeKt.getCircleShape()), (Alignment) null, ContentScale.Companion.getCrop(), 0.0f, (ColorFilter) null, 0, composer, 24576, 232);
                        composer2 = composer;
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(769785589);
                        ComposerKt.sourceInformation(composer2, "571@27706L40");
                        DefaultAvatarCircle(WhatsAppConversationItem$lambda$85(mutableState2), composer2, i2);
                        composer2.endReplaceGroup();
                    }
                    composer2.endReplaceGroup();
                } else {
                    String strWhatsAppConversationItem$lambda$813 = WhatsAppConversationItem$lambda$88(mutableState);
                    Intrinsics.checkNotNull(strWhatsAppConversationItem$lambda$813);
                    if (strWhatsAppConversationItem$lambda$813.length() > 200) {
                        str2 = "C101@5126L9:Row.kt#2w3rfo";
                        str3 = "C73@3429L9:Box.kt#2w3rfo";
                        boxScope = boxScope2;
                        str4 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                        str5 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                        str6 = "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo";
                        composer2.startReplaceGroup(768819505);
                        ComposerKt.sourceInformation(composer2, "552@26709L479");
                        String strWhatsAppConversationItem$lambda$814 = WhatsAppConversationItem$lambda$88(mutableState);
                        ComposerKt.sourceInformationMarkerStart(composer2, -113746100, "CC(remember):ChatsScreen.kt#9igjgp");
                        zChanged = composer2.changed(strWhatsAppConversationItem$lambda$814);
                        objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                            try {
                                String strWhatsAppConversationItem$lambda$815 = WhatsAppConversationItem$lambda$88(mutableState);
                                Intrinsics.checkNotNull(strWhatsAppConversationItem$lambda$815);
                                imageBitmap = null;
                                try {
                                    i2 = 0;
                                    try {
                                        byte[] bArrDecode3 = Base64.decode(StringsKt.substringAfter$default(strWhatsAppConversationItem$lambda$815, "base64,", (String) null, 2, (Object) null), 0);
                                        bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode3, 0, bArrDecode3.length);
                                        if (bitmapDecodeByteArray != null) {
                                            imageBitmapAsImageBitmap = AndroidImageBitmap_androidKt.asImageBitmap(bitmapDecodeByteArray);
                                        } else {
                                            imageBitmapAsImageBitmap = imageBitmap;
                                        }
                                    } catch (Exception unused) {
                                    }
                                } catch (Exception unused2) {
                                    i2 = 0;
                                }
                            } catch (Exception unused3) {
                                imageBitmap = null;
                            }
                            composer2.updateRememberedValue(imageBitmapAsImageBitmap);
                            objRememberedValue = imageBitmapAsImageBitmap;
                        } else {
                            imageBitmap = null;
                            i2 = 0;
                        }
                        imageBitmap2 = (ImageBitmap) objRememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (imageBitmap2 != null) {
                            composer2.startReplaceGroup(769356704);
                            ComposerKt.sourceInformation(composer2, "562@27263L381");
                            ImageKt.Image-5h-nEew(imageBitmap2, WhatsAppConversationItem$lambda$85(mutableState2), ClipKt.clip(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(50.0f)), RoundedCornerShapeKt.getCircleShape()), (Alignment) null, ContentScale.Companion.getCrop(), 0.0f, (ColorFilter) null, 0, composer, 24576, 232);
                            composer2 = composer;
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(769785589);
                            ComposerKt.sourceInformation(composer2, "571@27706L40");
                            DefaultAvatarCircle(WhatsAppConversationItem$lambda$85(mutableState2), composer2, i2);
                            composer2.endReplaceGroup();
                        }
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(769918486);
                        ComposerKt.sourceInformation(composer2, "574@27826L367");
                        str6 = "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo";
                        str3 = "C73@3429L9:Box.kt#2w3rfo";
                        str2 = "C101@5126L9:Row.kt#2w3rfo";
                        boxScope = boxScope2;
                        str4 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                        str5 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                        SingletonAsyncImageKt.m108AsyncImagegl8XCv8(WhatsAppConversationItem$lambda$88(mutableState), WhatsAppConversationItem$lambda$85(mutableState2), ClipKt.clip(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(50.0f)), RoundedCornerShapeKt.getCircleShape()), null, null, null, ContentScale.Companion.getCrop(), 0.0f, null, 0, false, null, composer, 1572864, 0, 4024);
                        composer2 = composer;
                        composer2.endReplaceGroup();
                        imageBitmap = null;
                        i2 = 0;
                    }
                }
                composer2.endReplaceGroup();
            }
            SurfaceKt.Surface-T9BRK9s(boxScope.align(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(20.0f)), Alignment.Companion.getBottomEnd()), RoundedCornerShapeKt.getCircleShape(), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0L, 0.0f, Dp.constructor-impl(2.0f), (BorderStroke) null, ComposableSingletons$ChatsScreenKt.INSTANCE.m273getLambda$989624312$app(), composer2, 12779520, 88);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(14.0f)), composer2, 6);
            Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.Companion, 1.0f, false, 2, (Object) null);
            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, i2);
            String str10 = str5;
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str10);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, i2);
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierWeight$default);
            Function0 constructor3 = ComposeUiNode.Companion.getConstructor();
            String str11 = str4;
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str11);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            Composer composer5 = Updater.constructor-impl(composer2);
            Updater.set-impl(composer5, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer5, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer5.getInserting() || !Intrinsics.areEqual(composer5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composer5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composer5.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.set-impl(composer5, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, 2105284147, "C609@29151L1223,632@30392L40,646@30978L2512:ChatsScreen.kt#2thlc2");
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, imageBitmap);
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically2 = Alignment.Companion.getCenterVertically();
            String str12 = str9;
            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, str12);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween, centerVertically2, composer2, 54);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str10);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, i2);
            CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
            Function0 constructor4 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str11);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor4);
            } else {
                composer2.useNode();
            }
            Composer composer6 = Updater.constructor-impl(composer2);
            Updater.set-impl(composer6, measurePolicyRowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer6, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer6.getInserting() || !Intrinsics.areEqual(composer6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composer6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composer6.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.set-impl(composer6, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
            String str13 = str2;
            ComposerKt.sourceInformationMarkerStart(composer2, -407840262, str13);
            RowScope rowScope2 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, 1695890299, "C616@29493L10,618@29676L11,614@29389L482,623@29892L39,626@30050L10,624@29952L404:ChatsScreen.kt#2thlc2");
            TextKt.Text--4IGK_g(WhatsAppConversationItem$lambda$85(mutableState2), RowScope.weight$default(rowScope2, Modifier.Companion, 1.0f, false, 2, (Object) null), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurface-0d7_KjU(), 0L, (FontStyle) null, chatConversation.getUnreadCount() > 0 ? FontWeight.Companion.getBold() : FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.getEllipsis-gIe3tQ8(), false, 1, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getTitleMedium(), composer, 0, 3120, 55256);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            TextStyle labelSmall = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall();
            if (chatConversation.getUnreadCount() > 0) {
                composer.startReplaceGroup(1578749842);
                composer.endReplaceGroup();
                jColor = ColorKt.Color(4279994175L);
            } else {
                composer.startReplaceGroup(1578751955);
                ComposerKt.sourceInformation(composer, "627@30176L11");
                jColor = Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
                composer.endReplaceGroup();
            }
            TextKt.Text--4IGK_g(str, (Modifier) null, jColor, 0L, (FontStyle) null, chatConversation.getUnreadCount() > 0 ? FontWeight.Companion.getBold() : FontWeight.Companion.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, labelSmall, composer, 0, 0, 65498);
            Composer composer7 = composer;
            ComposerKt.sourceInformationMarkerEnd(composer7);
            ComposerKt.sourceInformationMarkerEnd(composer7);
            composer7.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer7);
            ComposerKt.sourceInformationMarkerEnd(composer7);
            ComposerKt.sourceInformationMarkerEnd(composer7);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(2.0f)), composer7, 6);
            if (chatConversation.getBook() != null) {
                composer7.startReplaceGroup(2106483846);
                ComposerKt.sourceInformation(composer7, "637@30619L10,638@30688L11,635@30503L378,643@30902L40");
                TextKt.Text--4IGK_g("📖 " + chatConversation.getBook().getTitle(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer7, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.getEllipsis-gIe3tQ8(), false, 1, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer7, MaterialTheme.$stable).getLabelSmall(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 3120, 55258);
                composer7 = composer;
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(2.0f)), composer7, 6);
            } else {
                composer7.startReplaceGroup(2076230853);
            }
            composer7.endReplaceGroup();
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            Arrangement.Horizontal spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically3 = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer7, 693286680, str12);
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(spaceBetween2, centerVertically3, composer7, 54);
            ComposerKt.sourceInformationMarkerStart(composer7, -1323940314, str10);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer7, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composer7.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer7, modifierFillMaxWidth$default2);
            Function0 constructor5 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer7, -692256719, str11);
            if (!(composer7.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer7.startReusableNode();
            if (composer7.getInserting()) {
                composer7.createNode(constructor5);
            } else {
                composer7.useNode();
            }
            Composer composer8 = Updater.constructor-impl(composer7);
            Updater.set-impl(composer8, measurePolicyRowMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer8, currentCompositionLocalMap5, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash5 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer8.getInserting() || !Intrinsics.areEqual(composer8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                composer8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                composer8.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
            }
            Updater.set-impl(composer8, modifierMaterializeModifier5, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer7, -407840262, str13);
            RowScope rowScope3 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer7, -245619653, "C651@31216L1439:ChatsScreen.kt#2thlc2");
            Modifier modifierWeight$default2 = RowScope.weight$default(rowScope3, Modifier.Companion, 1.0f, false, 2, (Object) null);
            Alignment.Vertical centerVertically4 = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer7, 693286680, str12);
            MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically4, composer7, 48);
            ComposerKt.sourceInformationMarkerStart(composer7, -1323940314, str10);
            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer7, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composer7.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer7, modifierWeight$default2);
            Function0 constructor6 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer7, -692256719, str11);
            if (!(composer7.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer7.startReusableNode();
            if (composer7.getInserting()) {
                composer7.createNode(constructor6);
            } else {
                composer7.useNode();
            }
            Composer composer9 = Updater.constructor-impl(composer7);
            Updater.set-impl(composer9, measurePolicyRowMeasurePolicy4, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer9, currentCompositionLocalMap6, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash6 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer9.getInserting() || !Intrinsics.areEqual(composer9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                composer9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                composer9.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
            }
            Updater.set-impl(composer9, modifierMaterializeModifier6, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer7, -407840262, str13);
            RowScope rowScope4 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer7, -156287374, "C670@32208L10,668@32083L550:ChatsScreen.kt#2thlc2");
            if (z) {
                composer7.startReplaceGroup(-156293668);
                ComposerKt.sourceInformation(composer7, "661@31786L246");
                String upperCase = chatConversation.getLastMessage().getStatus().toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                if (Intrinsics.areEqual(upperCase, "READ")) {
                    pair = TuplesKt.to("✓✓ ", Color.box-impl(ColorKt.Color(4281645041L)));
                } else {
                    pair = Intrinsics.areEqual(upperCase, "DELIVERED") ? TuplesKt.to("✓✓ ", Color.box-impl(ColorKt.Color(4287010464L))) : TuplesKt.to("✓ ", Color.box-impl(ColorKt.Color(4287010464L)));
                }
                str7 = str11;
                str8 = str10;
                TextKt.Text--4IGK_g((String) pair.component1(), (Modifier) null, ((Color) pair.component2()).unbox-impl(), TextUnitKt.getSp(12), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 199680, 0, 131026);
                composer7 = composer;
            } else {
                str7 = str11;
                str8 = str10;
                composer7.startReplaceGroup(-187471546);
            }
            composer7.endReplaceGroup();
            String content = chatConversation.getLastMessage().getContent();
            TextStyle bodyMedium = MaterialTheme.INSTANCE.getTypography(composer7, MaterialTheme.$stable).getBodyMedium();
            if (chatConversation.getUnreadCount() > 0) {
                composer7.startReplaceGroup(1380460357);
                ComposerKt.sourceInformation(composer7, "671@32315L11");
                j = MaterialTheme.INSTANCE.getColorScheme(composer7, MaterialTheme.$stable).getOnSurface-0d7_KjU();
            } else {
                composer7.startReplaceGroup(1380461676);
                ComposerKt.sourceInformation(composer7, "671@32356L11");
                j = MaterialTheme.INSTANCE.getColorScheme(composer7, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU();
            }
            composer7.endReplaceGroup();
            TextKt.Text--4IGK_g(content, (Modifier) null, j, 0L, (FontStyle) null, chatConversation.getUnreadCount() > 0 ? FontWeight.Companion.getSemiBold() : FontWeight.Companion.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.getEllipsis-gIe3tQ8(), false, 1, 0, (Function1) null, bodyMedium, composer, 0, 3120, 55258);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (chatConversation.getUnreadCount() > 0) {
                composer.startReplaceGroup(-244182959);
                ComposerKt.sourceInformation(composer, "679@32737L39,684@33000L450,680@32801L649");
                i3 = 6;
                SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
                chatConversation2 = chatConversation;
                i4 = 1;
                SurfaceKt.Surface-T9BRK9s(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(20.0f)), RoundedCornerShapeKt.getCircleShape(), ColorKt.Color(4279994175L), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(1288160238, true, new Function2() { // from class: com.example.ui.screens.ChatsScreenKt$$ExternalSyntheticLambda24
                    public final Object invoke(Object obj, Object obj2) {
                        return ChatsScreenKt.WhatsAppConversationItem$lambda$102$lambda$101$lambda$99$lambda$98$lambda$97(chatConversation2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer, 54), composer, 12583302, 120);
            } else {
                i3 = 6;
                chatConversation2 = chatConversation;
                i4 = 1;
                composer.startReplaceGroup(-276656854);
            }
            composer.endReplaceGroup();
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
            if (chatConversation2.getBook() != null) {
                composer.startReplaceGroup(826320477);
                ComposerKt.sourceInformation(composer, "699@33567L40,704@33819L11,700@33624L1061");
                SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f)), composer, i3);
                Modifier modifier3 = BackgroundKt.background-bw27NRU$default(ClipKt.clip(SizeKt.size-VpY3zN4(Modifier.Companion, Dp.constructor-impl(38.0f), Dp.constructor-impl(52.0f)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(6.0f))), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), (Shape) null, 2, (Object) null);
                Alignment center = Alignment.Companion.getCenter();
                ComposerKt.sourceInformationMarkerStart(composer, 733328855, str6);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, str8);
                int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap7 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer, modifier3);
                Function0 constructor7 = ComposeUiNode.Companion.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, str7);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor7);
                } else {
                    composer.useNode();
                }
                Composer composer10 = Updater.constructor-impl(composer);
                Updater.set-impl(composer10, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl(composer10, currentCompositionLocalMap7, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash7 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composer10.getInserting() || !Intrinsics.areEqual(composer10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                    composer10.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                    composer10.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                }
                Updater.set-impl(composer10, modifierMaterializeModifier7, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -2146769399, str3);
                BoxScope boxScope3 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, 1754362440, "C:ChatsScreen.kt#2thlc2");
                String imageUrl = chatConversation2.getBook().getImageUrl();
                if (imageUrl == null || StringsKt.isBlank(imageUrl)) {
                    composer.startReplaceGroup(1754757410);
                    ComposerKt.sourceInformation(composer, "718@34539L11,715@34381L264");
                    IconKt.Icon-ww6aTOc(BookKt.getBook(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(20.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 432, 0);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(1754399670);
                    ComposerKt.sourceInformation(composer, "708@34019L308");
                    BookImageDisplayKt.BookImageDisplay(chatConversation2.getBook().getImageUrl(), chatConversation2.getBook().getTitle(), SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, i4, (Object) null), ContentScale.Companion.getCrop(), null, composer, 3456, 16);
                    composer.endReplaceGroup();
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
            } else {
                composer.startReplaceGroup(793003227);
            }
            composer.endReplaceGroup();
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

    static final Unit WhatsAppConversationItem$lambda$102$lambda$101$lambda$99$lambda$98$lambda$97(ChatConversation chatConversation, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C685@33030L394:ChatsScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1288160238, i, -1, "com.example.ui.screens.WhatsAppConversationItem.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatsScreen.kt:685)");
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
            ComposerKt.sourceInformationMarkerStart(composer, -40452326, "C686@33105L289:ChatsScreen.kt#2thlc2");
            TextKt.Text--4IGK_g(String.valueOf(chatConversation.getUnreadCount()), (Modifier) null, Color.Companion.getWhite-0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 200064, 0, 131026);
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

    private static final void DefaultAvatarCircle(final String str, Composer composer, final int i) {
        int i2;
        final String string;
        Composer composerStartRestartGroup = composer.startRestartGroup(1998168336);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DefaultAvatarCircle)742@35249L248,738@35140L357:ChatsScreen.kt#2thlc2");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1998168336, i2, -1, "com.example.ui.screens.DefaultAvatarCircle (ChatsScreen.kt:729)");
            }
            Character chFirstOrNull = StringsKt.firstOrNull(str);
            if (chFirstOrNull == null || (string = Character.valueOf(Character.toUpperCase(chFirstOrNull.charValue())).toString()) == null) {
                string = "R";
            }
            List listListOf = CollectionsKt.listOf(new Color[]{Color.box-impl(ColorKt.Color(4278672980L)), Color.box-impl(ColorKt.Color(4279405694L)), Color.box-impl(ColorKt.Color(4280669030L)), Color.box-impl(ColorKt.Color(4280191205L)), Color.box-impl(ColorKt.Color(4284364209L)), Color.box-impl(ColorKt.Color(4278225275L))});
            SurfaceKt.Surface-T9BRK9s(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(50.0f)), RoundedCornerShapeKt.getCircleShape(), ((Color) listListOf.get((str.hashCode() & Integer.MAX_VALUE) % listListOf.size())).unbox-impl(), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-1436020651, true, new Function2() { // from class: com.example.ui.screens.ChatsScreenKt$$ExternalSyntheticLambda6
                public final Object invoke(Object obj, Object obj2) {
                    return ChatsScreenKt.DefaultAvatarCircle$lambda$105(string, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 12582918, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.ChatsScreenKt$$ExternalSyntheticLambda7
                public final Object invoke(Object obj, Object obj2) {
                    return ChatsScreenKt.DefaultAvatarCircle$lambda$106(str, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final Unit DefaultAvatarCircle$lambda$105(String str, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C743@35259L232:ChatsScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1436020651, i, -1, "com.example.ui.screens.DefaultAvatarCircle.<anonymous> (ChatsScreen.kt:743)");
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
            ComposerKt.sourceInformationMarkerStart(composer, -221238079, "C744@35314L167:ChatsScreen.kt#2thlc2");
            TextKt.Text--4IGK_g(str, (Modifier) null, Color.Companion.getWhite-0d7_KjU(), TextUnitKt.getSp(20), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 200064, 0, 131026);
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

    private static final String formatWhatsAppTime(long j) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j);
        if (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) {
            String str = new SimpleDateFormat("hh:mm a", Locale.getDefault()).format(new Date(j));
            Intrinsics.checkNotNull(str);
            return str;
        }
        if (calendar.get(1) == calendar2.get(1) && calendar.get(6) - calendar2.get(6) == 1) {
            return "Yesterday";
        }
        if (calendar.get(1) == calendar2.get(1)) {
            String str2 = new SimpleDateFormat("dd MMM", Locale.getDefault()).format(new Date(j));
            Intrinsics.checkNotNull(str2);
            return str2;
        }
        String str3 = new SimpleDateFormat("dd/MM/yy", Locale.getDefault()).format(new Date(j));
        Intrinsics.checkNotNull(str3);
        return str3;
    }

    private static final List<Book> ChatsScreen$lambda$0(State<? extends List<Book>> state) {
        return (List) state.getValue();
    }

    private static final List<Message> ChatsScreen$lambda$2(State<? extends List<Message>> state) {
        return (List) state.getValue();
    }

    static final Unit ChatsScreen$lambda$82$lambda$81$lambda$80$lambda$79(final List list, final SharedPreferences sharedPreferences, final Function1 function1, final MutableState mutableState, final MutableState mutableState2, final String str, LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyColumn");
        final ChatsScreenKt$ChatsScreen$lambda$82$lambda$81$lambda$80$lambda$79$$inlined$items$default$1 chatsScreenKt$ChatsScreen$lambda$82$lambda$81$lambda$80$lambda$79$$inlined$items$default$1 = new Function1() { // from class: com.example.ui.screens.ChatsScreenKt$ChatsScreen$lambda$82$lambda$81$lambda$80$lambda$79$$inlined$items$default$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final Void m185invoke(Book book) {
                return null;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m185invoke((Book) obj);
            }
        };
        lazyListScope.items(list.size(), (Function1) null, new Function1<Integer, Object>() { // from class: com.example.ui.screens.ChatsScreenKt$ChatsScreen$lambda$82$lambda$81$lambda$80$lambda$79$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i) {
                return chatsScreenKt$ChatsScreen$lambda$82$lambda$81$lambda$80$lambda$79$$inlined$items$default$1.invoke(list.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.screens.ChatsScreenKt$ChatsScreen$lambda$82$lambda$81$lambda$80$lambda$79$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                ComposerKt.sourceInformation(composer, "C152@7074L22:LazyDsl.kt#428nma");
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if ((i3 & BuildConfig.VERSION_CODE) == 146 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                }
                final Book book = (Book) list.get(i);
                composer.startReplaceGroup(-1959290184);
                ComposerKt.sourceInformation(composer, "C*422@19938L408,429@20477L11,430@20557L3900,419@19766L4691:ChatsScreen.kt#2thlc2");
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
                ComposerKt.sourceInformationMarkerStart(composer, 213892976, "CC(remember):ChatsScreen.kt#9igjgp");
                boolean zChangedInstance = composer.changedInstance(sharedPreferences) | composer.changedInstance(book) | composer.changed(function1);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                    final SharedPreferences sharedPreferences2 = sharedPreferences;
                    final Function1 function2 = function1;
                    final MutableState mutableState3 = mutableState;
                    final MutableState mutableState4 = mutableState2;
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.ChatsScreenKt$ChatsScreen$8$1$1$1$1$1$1
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m182invoke();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m182invoke() {
                            ChatsScreenKt.ChatsScreen$lambda$11(mutableState3, false);
                            sharedPreferences2.edit().putLong("chat_last_read_" + book.getId(), System.currentTimeMillis() + 2000).commit();
                            ChatsScreenKt.ChatsScreen$lambda$15(mutableState4, System.currentTimeMillis());
                            function2.invoke(book.getId());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                Modifier modifier = ClickableKt.clickable-XHw0xAI$default(modifierFillMaxWidth$default, false, (String) null, (Role) null, (Function0) objRememberedValue, 7, (Object) null);
                Shape shape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f));
                long j = Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
                final String str2 = str;
                SurfaceKt.Surface-T9BRK9s(modifier, shape, j, 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(1197037661, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.ui.screens.ChatsScreenKt$ChatsScreen$8$1$1$1$1$2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i4) {
                        Composer composer3;
                        String ownerDisplayName;
                        ComposerKt.sourceInformation(composer2, "C431@20595L3828:ChatsScreen.kt#2thlc2");
                        if ((i4 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1197037661, i4, -1, "com.example.ui.screens.ChatsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatsScreen.kt:431)");
                        }
                        Modifier modifier2 = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f));
                        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                        Book book2 = book;
                        String str3 = str2;
                        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifier2);
                        Function0 constructor = ComposeUiNode.Companion.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composer4 = Updater.constructor-impl(composer2);
                        Updater.set-impl(composer4, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.set-impl(composer4, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composer4.getInserting() || !Intrinsics.areEqual(composer4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composer4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composer4.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.set-impl(composer4, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScope rowScope = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, -1656167317, "C439@21133L11,435@20842L1550,458@22433L40,459@22514L1488,480@24043L342:ChatsScreen.kt#2thlc2");
                        Modifier modifier3 = BackgroundKt.background-bw27NRU$default(ClipKt.clip(SizeKt.size-VpY3zN4(Modifier.Companion, Dp.constructor-impl(36.0f), Dp.constructor-impl(50.0f)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(6.0f))), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), (Shape) null, 2, (Object) null);
                        Alignment center = Alignment.Companion.getCenter();
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifier3);
                        Function0 constructor2 = ComposeUiNode.Companion.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composer5 = Updater.constructor-impl(composer2);
                        Updater.set-impl(composer5, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.set-impl(composer5, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composer5.getInserting() || !Intrinsics.areEqual(composer5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composer5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composer5.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.set-impl(composer5, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScope boxScope = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, 983505824, "C:ChatsScreen.kt#2thlc2");
                        String imageUrl = book2.getImageUrl();
                        if (imageUrl == null || StringsKt.isBlank(imageUrl)) {
                            composer2.startReplaceGroup(984024763);
                            ComposerKt.sourceInformation(composer2, "453@22150L11,450@21920L384");
                            IconKt.Icon-ww6aTOc(BookKt.getBook(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(20.0f)), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer2, 432, 0);
                            composer3 = composer2;
                            composer3.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(983525353);
                            ComposerKt.sourceInformation(composer2, "443@21416L402");
                            BookImageDisplayKt.BookImageDisplay(book2.getImageUrl(), book2.getTitle(), SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null), ContentScale.Companion.getCrop(), null, composer2, 3456, 16);
                            composer2.endReplaceGroup();
                            composer3 = composer2;
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f)), composer3, 6);
                        Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.Companion, 1.0f, false, 2, (Object) null);
                        ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer3, 0);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, modifierWeight$default);
                        Function0 constructor3 = ComposeUiNode.Companion.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor3);
                        } else {
                            composer3.useNode();
                        }
                        Composer composer6 = Updater.constructor-impl(composer3);
                        Updater.set-impl(composer6, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.set-impl(composer6, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composer6.getInserting() || !Intrinsics.areEqual(composer6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composer6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composer6.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.set-impl(composer6, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer3, 1795424891, "C462@22742L10,460@22599L436,474@23650L10,475@23742L11,472@23487L473:ChatsScreen.kt#2thlc2");
                        TextKt.Text--4IGK_g(book2.getTitle(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.getEllipsis-gIe3tQ8(), false, 1, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getTitleSmall(), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 3120, 55262);
                        if (Intrinsics.areEqual(book2.getOwnerName(), str3)) {
                            ownerDisplayName = "You (Owner)";
                        } else {
                            ownerDisplayName = !StringsKt.isBlank(book2.getOwnerDisplayName()) ? book2.getOwnerDisplayName() : StringsKt.substringBefore$default(book2.getOwnerName(), "@", (String) null, 2, (Object) null);
                        }
                        TextKt.Text--4IGK_g("by " + book2.getAuthor() + " • " + ownerDisplayName, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.getEllipsis-gIe3tQ8(), false, 1, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodySmall(), composer2, 0, 3120, 55290);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        IconKt.Icon-ww6aTOc(ChatKt.getChat(Icons.AutoMirrored.Filled.INSTANCE), "Chat", SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(20.0f)), ColorKt.Color(4279994175L), composer2, 3504, 0);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 12582912, 120);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }
}
