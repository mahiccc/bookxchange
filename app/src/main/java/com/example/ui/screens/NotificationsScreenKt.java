package com.example.ui.screens;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
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
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.PersonKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonElevation;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonColors;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.fragment.app.FragmentTransaction;
import androidx.profileinstaller.ProfileVerifier;
import coil.compose.SingletonAsyncImageKt;
import com.example.BuildConfig;
import com.example.data.Book;
import com.example.data.Message;
import com.example.data.User;
import com.example.ui.BookViewModel;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: NotificationsScreen.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001aO\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\fH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e²\u0006\f\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u008a\u0084\u0002²\u0006\u0010\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003X\u008a\u0084\u0002"}, d2 = {"NotificationsScreen", "", "books", "", "Lcom/example/data/Book;", "currentUser", "", "viewModel", "Lcom/example/ui/BookViewModel;", "onProfileClick", "Lkotlin/Function0;", "onChatClick", "Lkotlin/Function1;", "(Ljava/util/List;Ljava/lang/String;Lcom/example/ui/BookViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "app", "userState", "Lcom/example/data/User;", "userChats", "Lcom/example/data/Message;"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class NotificationsScreenKt {
    static final Unit NotificationsScreen$lambda$22(List list, String str, BookViewModel bookViewModel, Function0 function0, Function1 function1, int i, int i2, Composer composer, int i3) {
        NotificationsScreen(list, str, bookViewModel, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    static final Unit NotificationsScreen$lambda$1$lambda$0(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:107:0x021f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0232  */
    /* JADX WARN: Code duplicated, block: B:120:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:122:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:127:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:136:0x0321  */
    /* JADX WARN: Code duplicated, block: B:138:0x032d  */
    /* JADX WARN: Code duplicated, block: B:140:0x034c  */
    /* JADX WARN: Code duplicated, block: B:142:0x0353  */
    /* JADX WARN: Code duplicated, block: B:146:0x038e  */
    /* JADX WARN: Code duplicated, block: B:148:0x039a  */
    /* JADX WARN: Code duplicated, block: B:150:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:152:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:157:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:159:0x0409  */
    /* JADX WARN: Code duplicated, block: B:162:0x0453  */
    /* JADX WARN: Code duplicated, block: B:167:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:171:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:174:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x024f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0217 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x03f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x045f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x02ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x009d  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:68:0x011a  */
    /* JADX WARN: Code duplicated, block: B:69:0x011c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0124  */
    /* JADX WARN: Code duplicated, block: B:74:0x012c  */
    /* JADX WARN: Code duplicated, block: B:78:0x015f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0189  */
    /* JADX WARN: Code duplicated, block: B:86:0x019a  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:94:0x01db  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e6  */
    public static final void NotificationsScreen(final List<Book> list, final String str, final BookViewModel bookViewModel, final Function0<Unit> function0, Function1<? super String, Unit> function1, Composer composer, final int i, final int i2) {
        Function1<? super String, Unit> function2;
        final ArrayList arrayList;
        int i3;
        boolean z;
        Object objRememberedValue;
        boolean z2;
        Object objRememberedValue2;
        ArrayList arrayList2;
        LinkedHashMap linkedHashMap;
        ArrayList<Message> arrayList3;
        Iterator it;
        final Function1<? super String, Unit> function3;
        boolean zEquals;
        String borrowerName;
        String string;
        boolean z3;
        String borrowerName2;
        String strSubstringBefore$default;
        String requestedByName;
        String strSubstringBefore$default2;
        String string2;
        Iterator<T> it2;
        Object next;
        Book book;
        Iterator it3;
        Object next2;
        long timestamp;
        Object next3;
        long timestamp2;
        String bookId;
        Object obj;
        Object objRememberedValue3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(list, "books");
        Intrinsics.checkNotNullParameter(str, "currentUser");
        Intrinsics.checkNotNullParameter(bookViewModel, "viewModel");
        Intrinsics.checkNotNullParameter(function0, "onProfileClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(115389163);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(NotificationsScreen)P(!2,4,3)35@1321L2,39@1458L56,40@1545L30,42@1605L61,43@1702L37,127@5322L1958,161@7287L6590,126@5295L8582:NotificationsScreen.kt#2thlc2");
        int i4 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(bookViewModel) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                function2 = function1;
                i4 |= composerStartRestartGroup.changedInstance(function2) ? 16384 : FragmentTransaction.TRANSIT_EXIT_MASK;
            }
            if ((i4 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                if (i5 != 0) {
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -780156915, "CC(remember):NotificationsScreen.kt#9igjgp");
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                        objRememberedValue3 = new Function1() { // from class: com.example.ui.screens.NotificationsScreenKt$$ExternalSyntheticLambda3
                            public final Object invoke(Object obj2) {
                                return NotificationsScreenKt.NotificationsScreen$lambda$1$lambda$0((String) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    function2 = (Function1) objRememberedValue3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(115389163, i4, -1, "com.example.ui.screens.NotificationsScreen (NotificationsScreen.kt:36)");
                }
                arrayList = new ArrayList();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -780152477, "CC(remember):NotificationsScreen.kt#9igjgp");
                i3 = i4 & 112;
                if (i3 == 32) {
                    z = true;
                } else {
                    z = false;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = bookViewModel.getUser(str);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                final Function1<? super String, Unit> function4 = function2;
                final State stateCollectAsState = SnapshotStateKt.collectAsState((StateFlow) objRememberedValue, (Object) null, (CoroutineContext) null, composerStartRestartGroup, 48, 2);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -780147768, "CC(remember):NotificationsScreen.kt#9igjgp");
                if (i3 == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = bookViewModel.getUserChats(str);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                List<Message> listNotificationsScreen$lambda$5 = NotificationsScreen$lambda$5(SnapshotStateKt.collectAsState((StateFlow) objRememberedValue2, CollectionsKt.emptyList(), (CoroutineContext) null, composerStartRestartGroup, 48, 2));
                arrayList2 = new ArrayList();
                for (Object obj2 : listNotificationsScreen$lambda$5) {
                    if (!Intrinsics.areEqual(((Message) obj2).getSender(), str)) {
                        arrayList2.add(obj2);
                    }
                }
                linkedHashMap = new LinkedHashMap();
                for (Object obj3 : arrayList2) {
                    bookId = ((Message) obj3).getBookId();
                    obj = linkedHashMap.get(bookId);
                    if (obj == null) {
                        obj = (List) new ArrayList();
                        linkedHashMap.put(bookId, obj);
                    }
                    ((List) obj).add(obj3);
                }
                arrayList3 = new ArrayList(linkedHashMap.size());
                it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    it3 = ((Iterable) ((Map.Entry) it.next()).getValue()).iterator();
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        if (it3.hasNext()) {
                            timestamp = ((Message) next2).getTimestamp();
                            do {
                                next3 = it3.next();
                                timestamp2 = ((Message) next3).getTimestamp();
                                if (timestamp < timestamp2) {
                                    next2 = next3;
                                    timestamp = timestamp2;
                                }
                            } while (it3.hasNext());
                        }
                    } else {
                        next2 = null;
                    }
                    Intrinsics.checkNotNull(next2);
                    arrayList3.add((Message) next2);
                }
                for (Message message : arrayList3) {
                    it2 = list.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!Intrinsics.areEqual(((Book) next).getId(), message.getBookId()));
                    book = (Book) next;
                    if (book != null) {
                        arrayList.add(new NotificationItem("chat_" + message.getId(), "New Message: " + book.getTitle(), StringsKt.substringBefore$default(message.getSender(), "@", (String) null, 2, (Object) null) + ": " + message.getContent(), book, NotificationType.CHAT_MESSAGE));
                    }
                }
                for (Book book2 : list) {
                    String str2 = str;
                    zEquals = StringsKt.equals(StringsKt.trim(book2.getOwnerName()).toString(), StringsKt.trim(str2).toString(), true);
                    String requestedByName2 = book2.getRequestedByName();
                    z3 = (requestedByName2 == null && (string2 = StringsKt.trim(requestedByName2).toString()) != null && StringsKt.equals(string2, StringsKt.trim(str2).toString(), true)) || !((borrowerName = book2.getBorrowerName()) == null || (string = StringsKt.trim(borrowerName).toString()) == null || !StringsKt.equals(string, StringsKt.trim(str2).toString(), true));
                    if (zEquals) {
                        if (Intrinsics.areEqual(book2.getStatus(), "REQUESTED")) {
                            String str3 = book2.getId() + "_req";
                            requestedByName = book2.getRequestedByName();
                            if (requestedByName != null || (strSubstringBefore$default2 = StringsKt.substringBefore$default(requestedByName, "@", (String) null, 2, (Object) null)) == null) {
                                strSubstringBefore$default2 = "Someone";
                            }
                            arrayList.add(new NotificationItem(str3, "Book Request", strSubstringBefore$default2 + " requested your book '" + book2.getTitle() + "'.", book2, NotificationType.OWNER_REQUESTED));
                        }
                        if (Intrinsics.areEqual(book2.getStatus(), "PENDING_RETURN") || Intrinsics.areEqual(book2.getStatus(), "RETURN_INITIATED")) {
                            String str4 = book2.getId() + "_return";
                            borrowerName2 = book2.getBorrowerName();
                            if (borrowerName2 != null || (strSubstringBefore$default = StringsKt.substringBefore$default(borrowerName2, "@", (String) null, 2, (Object) null)) == null) {
                                strSubstringBefore$default = "Borrower";
                            }
                            arrayList.add(new NotificationItem(str4, "Return Initiated", strSubstringBefore$default + " has initiated return for '" + book2.getTitle() + "'. Please verify.", book2, NotificationType.OWNER_PENDING_RETURN));
                        }
                    }
                    if (z3) {
                        if (Intrinsics.areEqual(book2.getStatus(), "PENDING_TRANSFER") || Intrinsics.areEqual(book2.getStatus(), "ACCEPTED")) {
                            arrayList.add(new NotificationItem(book2.getId() + "_pt", "Request Accepted", "Your request for '" + book2.getTitle() + "' was accepted. Contact owner for transfer.", book2, NotificationType.REQUESTER_ACCEPTED));
                        }
                        if (!Intrinsics.areEqual(book2.getStatus(), "PENDING_RECEIPT") || Intrinsics.areEqual(book2.getStatus(), "TRANSFER_INITIATED")) {
                            arrayList.add(new NotificationItem(book2.getId() + "_pr", "Transfer Initiated", "The owner has transferred '" + book2.getTitle() + "'. Please confirm receipt.", book2, NotificationType.REQUESTER_CONFIRM_RECEIPT));
                        }
                    }
                }
                ScaffoldKt.Scaffold-TvnljyQ((Modifier) null, ComposableLambdaKt.rememberComposableLambda(101386159, true, new Function2() { // from class: com.example.ui.screens.NotificationsScreenKt$$ExternalSyntheticLambda4
                    public final Object invoke(Object obj4, Object obj5) {
                        return NotificationsScreenKt.NotificationsScreen$lambda$15(function0, stateCollectAsState, (Composer) obj4, ((Integer) obj5).intValue());
                    }
                }, composerStartRestartGroup, 54), (Function2) null, (Function2) null, (Function2) null, 0, 0L, 0L, (WindowInsets) null, ComposableLambdaKt.rememberComposableLambda(177596026, true, new Function3() { // from class: com.example.ui.screens.NotificationsScreenKt$$ExternalSyntheticLambda5
                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                        return NotificationsScreenKt.NotificationsScreen$lambda$21(arrayList, bookViewModel, function4, (PaddingValues) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 805306416, 509);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function3 = function4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                function3 = function2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.NotificationsScreenKt$$ExternalSyntheticLambda6
                    public final Object invoke(Object obj4, Object obj5) {
                        return NotificationsScreenKt.NotificationsScreen$lambda$22(list, str, bookViewModel, function0, function3, i, i2, (Composer) obj4, ((Integer) obj5).intValue());
                    }
                });
            }
        }
        i4 |= 24576;
        function2 = function1;
        if ((i4 & 9363) == 9362) {
            if (i5 != 0) {
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -780156915, "CC(remember):NotificationsScreen.kt#9igjgp");
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.example.ui.screens.NotificationsScreenKt$$ExternalSyntheticLambda3
                        public final Object invoke(Object obj4) {
                            return NotificationsScreenKt.NotificationsScreen$lambda$1$lambda$0((String) obj4);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                function2 = (Function1) objRememberedValue3;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(115389163, i4, -1, "com.example.ui.screens.NotificationsScreen (NotificationsScreen.kt:36)");
            }
            arrayList = new ArrayList();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -780152477, "CC(remember):NotificationsScreen.kt#9igjgp");
            i3 = i4 & 112;
            if (i3 == 32) {
                z = true;
            } else {
                z = false;
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z) {
                objRememberedValue = bookViewModel.getUser(str);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = bookViewModel.getUser(str);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final Function1 function5 = function2;
            final State stateCollectAsState2 = SnapshotStateKt.collectAsState((StateFlow) objRememberedValue, (Object) null, (CoroutineContext) null, composerStartRestartGroup, 48, 2);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -780147768, "CC(remember):NotificationsScreen.kt#9igjgp");
            if (i3 == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2) {
                objRememberedValue2 = bookViewModel.getUserChats(str);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = bookViewModel.getUserChats(str);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            List<Message> listNotificationsScreen$lambda$6 = NotificationsScreen$lambda$5(SnapshotStateKt.collectAsState((StateFlow) objRememberedValue2, CollectionsKt.emptyList(), (CoroutineContext) null, composerStartRestartGroup, 48, 2));
            arrayList2 = new ArrayList();
            while (r7.hasNext()) {
                if (!Intrinsics.areEqual(((Message) obj2).getSender(), str)) {
                    arrayList2.add(obj2);
                }
            }
            linkedHashMap = new LinkedHashMap();
            while (r8.hasNext()) {
                bookId = ((Message) obj3).getBookId();
                obj = linkedHashMap.get(bookId);
                if (obj == null) {
                    obj = (List) new ArrayList();
                    linkedHashMap.put(bookId, obj);
                }
                ((List) obj).add(obj3);
            }
            arrayList3 = new ArrayList(linkedHashMap.size());
            it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                it3 = ((Iterable) ((Map.Entry) it.next()).getValue()).iterator();
                if (it3.hasNext()) {
                    next2 = null;
                } else {
                    next2 = it3.next();
                    if (it3.hasNext()) {
                        timestamp = ((Message) next2).getTimestamp();
                        do {
                            next3 = it3.next();
                            timestamp2 = ((Message) next3).getTimestamp();
                            if (timestamp < timestamp2) {
                                next2 = next3;
                                timestamp = timestamp2;
                            }
                        } while (it3.hasNext());
                    }
                }
                Intrinsics.checkNotNull(next2);
                arrayList3.add((Message) next2);
            }
            while (r7.hasNext()) {
                it2 = list.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!Intrinsics.areEqual(((Book) next).getId(), message.getBookId()));
                book = (Book) next;
                if (book != null) {
                    arrayList.add(new NotificationItem("chat_" + message.getId(), "New Message: " + book.getTitle(), StringsKt.substringBefore$default(message.getSender(), "@", (String) null, 2, (Object) null) + ": " + message.getContent(), book, NotificationType.CHAT_MESSAGE));
                }
            }
            while (r7.hasNext()) {
                String str5 = str;
                zEquals = StringsKt.equals(StringsKt.trim(book2.getOwnerName()).toString(), StringsKt.trim(str5).toString(), true);
                String requestedByName3 = book2.getRequestedByName();
                if (requestedByName3 == null) {
                }
                if (zEquals) {
                    if (Intrinsics.areEqual(book2.getStatus(), "REQUESTED")) {
                        String str6 = book2.getId() + "_req";
                        requestedByName = book2.getRequestedByName();
                        if (requestedByName != null) {
                            strSubstringBefore$default2 = "Someone";
                        } else {
                            strSubstringBefore$default2 = "Someone";
                        }
                        arrayList.add(new NotificationItem(str6, "Book Request", strSubstringBefore$default2 + " requested your book '" + book2.getTitle() + "'.", book2, NotificationType.OWNER_REQUESTED));
                    }
                    if (Intrinsics.areEqual(book2.getStatus(), "PENDING_RETURN")) {
                        String str7 = book2.getId() + "_return";
                        borrowerName2 = book2.getBorrowerName();
                        if (borrowerName2 != null) {
                            strSubstringBefore$default = "Borrower";
                        } else {
                            strSubstringBefore$default = "Borrower";
                        }
                        arrayList.add(new NotificationItem(str7, "Return Initiated", strSubstringBefore$default + " has initiated return for '" + book2.getTitle() + "'. Please verify.", book2, NotificationType.OWNER_PENDING_RETURN));
                    } else {
                        String str8 = book2.getId() + "_return";
                        borrowerName2 = book2.getBorrowerName();
                        if (borrowerName2 != null) {
                            strSubstringBefore$default = "Borrower";
                        } else {
                            strSubstringBefore$default = "Borrower";
                        }
                        arrayList.add(new NotificationItem(str8, "Return Initiated", strSubstringBefore$default + " has initiated return for '" + book2.getTitle() + "'. Please verify.", book2, NotificationType.OWNER_PENDING_RETURN));
                    }
                }
                if (z3) {
                    if (Intrinsics.areEqual(book2.getStatus(), "PENDING_TRANSFER")) {
                        arrayList.add(new NotificationItem(book2.getId() + "_pt", "Request Accepted", "Your request for '" + book2.getTitle() + "' was accepted. Contact owner for transfer.", book2, NotificationType.REQUESTER_ACCEPTED));
                    } else {
                        arrayList.add(new NotificationItem(book2.getId() + "_pt", "Request Accepted", "Your request for '" + book2.getTitle() + "' was accepted. Contact owner for transfer.", book2, NotificationType.REQUESTER_ACCEPTED));
                    }
                    if (!Intrinsics.areEqual(book2.getStatus(), "PENDING_RECEIPT")) {
                    }
                    arrayList.add(new NotificationItem(book2.getId() + "_pr", "Transfer Initiated", "The owner has transferred '" + book2.getTitle() + "'. Please confirm receipt.", book2, NotificationType.REQUESTER_CONFIRM_RECEIPT));
                }
            }
            ScaffoldKt.Scaffold-TvnljyQ((Modifier) null, ComposableLambdaKt.rememberComposableLambda(101386159, true, new Function2() { // from class: com.example.ui.screens.NotificationsScreenKt$$ExternalSyntheticLambda4
                public final Object invoke(Object obj4, Object obj5) {
                    return NotificationsScreenKt.NotificationsScreen$lambda$15(function0, stateCollectAsState2, (Composer) obj4, ((Integer) obj5).intValue());
                }
            }, composerStartRestartGroup, 54), (Function2) null, (Function2) null, (Function2) null, 0, 0L, 0L, (WindowInsets) null, ComposableLambdaKt.rememberComposableLambda(177596026, true, new Function3() { // from class: com.example.ui.screens.NotificationsScreenKt$$ExternalSyntheticLambda5
                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                    return NotificationsScreenKt.NotificationsScreen$lambda$21(arrayList, bookViewModel, function5, (PaddingValues) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 805306416, 509);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function3 = function5;
        } else {
            if (i5 != 0) {
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -780156915, "CC(remember):NotificationsScreen.kt#9igjgp");
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.example.ui.screens.NotificationsScreenKt$$ExternalSyntheticLambda3
                        public final Object invoke(Object obj4) {
                            return NotificationsScreenKt.NotificationsScreen$lambda$1$lambda$0((String) obj4);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                function2 = (Function1) objRememberedValue3;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(115389163, i4, -1, "com.example.ui.screens.NotificationsScreen (NotificationsScreen.kt:36)");
            }
            arrayList = new ArrayList();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -780152477, "CC(remember):NotificationsScreen.kt#9igjgp");
            i3 = i4 & 112;
            if (i3 == 32) {
                z = true;
            } else {
                z = false;
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z) {
                objRememberedValue = bookViewModel.getUser(str);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = bookViewModel.getUser(str);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final Function1 function6 = function2;
            final State stateCollectAsState3 = SnapshotStateKt.collectAsState((StateFlow) objRememberedValue, (Object) null, (CoroutineContext) null, composerStartRestartGroup, 48, 2);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -780147768, "CC(remember):NotificationsScreen.kt#9igjgp");
            if (i3 == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2) {
                objRememberedValue2 = bookViewModel.getUserChats(str);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = bookViewModel.getUserChats(str);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            List<Message> listNotificationsScreen$lambda$7 = NotificationsScreen$lambda$5(SnapshotStateKt.collectAsState((StateFlow) objRememberedValue2, CollectionsKt.emptyList(), (CoroutineContext) null, composerStartRestartGroup, 48, 2));
            arrayList2 = new ArrayList();
            while (r7.hasNext()) {
                if (!Intrinsics.areEqual(((Message) obj2).getSender(), str)) {
                    arrayList2.add(obj2);
                }
            }
            linkedHashMap = new LinkedHashMap();
            while (r8.hasNext()) {
                bookId = ((Message) obj3).getBookId();
                obj = linkedHashMap.get(bookId);
                if (obj == null) {
                    obj = (List) new ArrayList();
                    linkedHashMap.put(bookId, obj);
                }
                ((List) obj).add(obj3);
            }
            arrayList3 = new ArrayList(linkedHashMap.size());
            it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                it3 = ((Iterable) ((Map.Entry) it.next()).getValue()).iterator();
                if (it3.hasNext()) {
                    next2 = null;
                } else {
                    next2 = it3.next();
                    if (it3.hasNext()) {
                        timestamp = ((Message) next2).getTimestamp();
                        do {
                            next3 = it3.next();
                            timestamp2 = ((Message) next3).getTimestamp();
                            if (timestamp < timestamp2) {
                                next2 = next3;
                                timestamp = timestamp2;
                            }
                        } while (it3.hasNext());
                    }
                }
                Intrinsics.checkNotNull(next2);
                arrayList3.add((Message) next2);
            }
            while (r7.hasNext()) {
                it2 = list.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!Intrinsics.areEqual(((Book) next).getId(), message.getBookId()));
                book = (Book) next;
                if (book != null) {
                    arrayList.add(new NotificationItem("chat_" + message.getId(), "New Message: " + book.getTitle(), StringsKt.substringBefore$default(message.getSender(), "@", (String) null, 2, (Object) null) + ": " + message.getContent(), book, NotificationType.CHAT_MESSAGE));
                }
            }
            while (r7.hasNext()) {
                String str9 = str;
                zEquals = StringsKt.equals(StringsKt.trim(book2.getOwnerName()).toString(), StringsKt.trim(str9).toString(), true);
                String requestedByName4 = book2.getRequestedByName();
                if (requestedByName4 == null) {
                }
                if (zEquals) {
                    if (Intrinsics.areEqual(book2.getStatus(), "REQUESTED")) {
                        String str10 = book2.getId() + "_req";
                        requestedByName = book2.getRequestedByName();
                        if (requestedByName != null) {
                            strSubstringBefore$default2 = "Someone";
                        } else {
                            strSubstringBefore$default2 = "Someone";
                        }
                        arrayList.add(new NotificationItem(str10, "Book Request", strSubstringBefore$default2 + " requested your book '" + book2.getTitle() + "'.", book2, NotificationType.OWNER_REQUESTED));
                    }
                    if (Intrinsics.areEqual(book2.getStatus(), "PENDING_RETURN")) {
                        String str11 = book2.getId() + "_return";
                        borrowerName2 = book2.getBorrowerName();
                        if (borrowerName2 != null) {
                            strSubstringBefore$default = "Borrower";
                        } else {
                            strSubstringBefore$default = "Borrower";
                        }
                        arrayList.add(new NotificationItem(str11, "Return Initiated", strSubstringBefore$default + " has initiated return for '" + book2.getTitle() + "'. Please verify.", book2, NotificationType.OWNER_PENDING_RETURN));
                    } else {
                        String str12 = book2.getId() + "_return";
                        borrowerName2 = book2.getBorrowerName();
                        if (borrowerName2 != null) {
                            strSubstringBefore$default = "Borrower";
                        } else {
                            strSubstringBefore$default = "Borrower";
                        }
                        arrayList.add(new NotificationItem(str12, "Return Initiated", strSubstringBefore$default + " has initiated return for '" + book2.getTitle() + "'. Please verify.", book2, NotificationType.OWNER_PENDING_RETURN));
                    }
                }
                if (z3) {
                    if (Intrinsics.areEqual(book2.getStatus(), "PENDING_TRANSFER")) {
                        arrayList.add(new NotificationItem(book2.getId() + "_pt", "Request Accepted", "Your request for '" + book2.getTitle() + "' was accepted. Contact owner for transfer.", book2, NotificationType.REQUESTER_ACCEPTED));
                    } else {
                        arrayList.add(new NotificationItem(book2.getId() + "_pt", "Request Accepted", "Your request for '" + book2.getTitle() + "' was accepted. Contact owner for transfer.", book2, NotificationType.REQUESTER_ACCEPTED));
                    }
                    if (!Intrinsics.areEqual(book2.getStatus(), "PENDING_RECEIPT")) {
                    }
                    arrayList.add(new NotificationItem(book2.getId() + "_pr", "Transfer Initiated", "The owner has transferred '" + book2.getTitle() + "'. Please confirm receipt.", book2, NotificationType.REQUESTER_CONFIRM_RECEIPT));
                }
            }
            ScaffoldKt.Scaffold-TvnljyQ((Modifier) null, ComposableLambdaKt.rememberComposableLambda(101386159, true, new Function2() { // from class: com.example.ui.screens.NotificationsScreenKt$$ExternalSyntheticLambda4
                public final Object invoke(Object obj4, Object obj5) {
                    return NotificationsScreenKt.NotificationsScreen$lambda$15(function0, stateCollectAsState3, (Composer) obj4, ((Integer) obj5).intValue());
                }
            }, composerStartRestartGroup, 54), (Function2) null, (Function2) null, (Function2) null, 0, 0L, 0L, (WindowInsets) null, ComposableLambdaKt.rememberComposableLambda(177596026, true, new Function3() { // from class: com.example.ui.screens.NotificationsScreenKt$$ExternalSyntheticLambda5
                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                    return NotificationsScreenKt.NotificationsScreen$lambda$21(arrayList, bookViewModel, function6, (PaddingValues) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 805306416, 509);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function3 = function6;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.NotificationsScreenKt$$ExternalSyntheticLambda6
                public final Object invoke(Object obj4, Object obj5) {
                    return NotificationsScreenKt.NotificationsScreen$lambda$22(list, str, bookViewModel, function0, function3, i, i2, (Composer) obj4, ((Integer) obj5).intValue());
                }
            });
        }
    }

    static final Unit NotificationsScreen$lambda$15(final Function0 function0, final State state, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C131@5539L11,132@5621L11,130@5471L196,134@5695L1561,128@5336L1934:NotificationsScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(101386159, i, -1, "com.example.ui.screens.NotificationsScreen.<anonymous> (NotificationsScreen.kt:128)");
            }
            AppBarKt.TopAppBar-GHTll3U(ComposableSingletons$NotificationsScreenKt.INSTANCE.getLambda$655930731$app(), (Modifier) null, (Function2) null, ComposableLambdaKt.rememberComposableLambda(148120288, true, new Function3() { // from class: com.example.ui.screens.NotificationsScreenKt$$ExternalSyntheticLambda7
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return NotificationsScreenKt.NotificationsScreen$lambda$15$lambda$14(function0, state, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer, 54), 0.0f, (WindowInsets) null, TopAppBarDefaults.INSTANCE.topAppBarColors-zjMxDiM(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0L, 0L, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, composer, TopAppBarDefaults.$stable << 15, 22), (TopAppBarScrollBehavior) null, composer, 3078, 182);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit NotificationsScreen$lambda$15$lambda$14(Function0 function0, final State state, RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$TopAppBar");
        ComposerKt.sourceInformation(composer, "C135@5754L1484,135@5717L1521:NotificationsScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(148120288, i, -1, "com.example.ui.screens.NotificationsScreen.<anonymous>.<anonymous> (NotificationsScreen.kt:135)");
            }
            IconButtonKt.IconButton(function0, (Modifier) null, false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableLambdaKt.rememberComposableLambda(-1719934339, true, new Function2() { // from class: com.example.ui.screens.NotificationsScreenKt$$ExternalSyntheticLambda1
                public final Object invoke(Object obj, Object obj2) {
                    return NotificationsScreenKt.NotificationsScreen$lambda$15$lambda$14$lambda$13(state, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit NotificationsScreen$lambda$15$lambda$14$lambda$13(State state, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C:NotificationsScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1719934339, i, -1, "com.example.ui.screens.NotificationsScreen.<anonymous>.<anonymous>.<anonymous> (NotificationsScreen.kt:136)");
            }
            User userNotificationsScreen$lambda$3 = NotificationsScreen$lambda$3(state);
            String profilePicBase64 = userNotificationsScreen$lambda$3 != null ? userNotificationsScreen$lambda$3.getProfilePicBase64() : null;
            if (profilePicBase64 != null && StringsKt.startsWith$default(profilePicBase64, "http", false, 2, (Object) null)) {
                composer.startReplaceGroup(396099382);
                ComposerKt.sourceInformation(composer, "138@5924L343");
                SingletonAsyncImageKt.m108AsyncImagegl8XCv8(profilePicBase64, "Profile Picture", ClipKt.clip(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(32.0f)), RoundedCornerShapeKt.getCircleShape()), null, null, null, ContentScale.Companion.getCrop(), 0.0f, null, 0, false, null, composer, 1572912, 0, 4024);
                composer.endReplaceGroup();
            } else if (profilePicBase64 == null || !StringsKt.startsWith$default(profilePicBase64, "data:image/jpeg;base64,", false, 2, (Object) null)) {
                composer.startReplaceGroup(397288883);
                ComposerKt.sourceInformation(composer, "155@7132L58");
                IconKt.Icon-ww6aTOc(PersonKt.getPerson(Icons.INSTANCE.getDefault()), "Profile", (Modifier) null, 0L, composer, 48, 12);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(396578828);
                ComposerKt.sourceInformation(composer, "148@6715L355");
                byte[] bArrDecode = Base64.decode(StringsKt.removePrefix(profilePicBase64, "data:image/jpeg;base64,"), 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                Intrinsics.checkNotNull(bitmapDecodeByteArray);
                ImageKt.Image-5h-nEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmapDecodeByteArray), "Profile Picture", ClipKt.clip(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(32.0f)), RoundedCornerShapeKt.getCircleShape()), (Alignment) null, ContentScale.Companion.getCrop(), 0.0f, (ColorFilter) null, 0, composer, 24624, 232);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit NotificationsScreen$lambda$21(final List list, final BookViewModel bookViewModel, final Function1 function1, PaddingValues paddingValues, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(paddingValues, "padding");
        ComposerKt.sourceInformation(composer, "C:NotificationsScreen.kt#2thlc2");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(paddingValues) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(177596026, i2, -1, "com.example.ui.screens.NotificationsScreen.<anonymous> (NotificationsScreen.kt:162)");
            }
            if (list.isEmpty()) {
                composer.startReplaceGroup(-636439700);
                ComposerKt.sourceInformation(composer, "163@7351L260");
                Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null), paddingValues);
                Alignment center = Alignment.Companion.getCenter();
                ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
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
                ComposerKt.sourceInformationMarkerStart(composer, 81123715, "C164@7524L10,164@7568L11,164@7462L135:NotificationsScreen.kt#2thlc2");
                TextKt.Text--4IGK_g("No notifications at the moment.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyLarge(), composer, 6, 0, 65530);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-635967260);
                ComposerKt.sourceInformation(composer, "173@7948L5913,167@7641L6220");
                Modifier modifierPadding2 = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null), paddingValues);
                PaddingValues paddingValues2 = PaddingKt.PaddingValues-a9UjIt4(Dp.constructor-impl(16.0f), Dp.constructor-impl(16.0f), Dp.constructor-impl(16.0f), Dp.constructor-impl(124.0f));
                Arrangement.Vertical vertical = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(8.0f));
                ComposerKt.sourceInformationMarkerStart(composer, -1128883789, "CC(remember):NotificationsScreen.kt#9igjgp");
                boolean zChangedInstance = composer.changedInstance(list) | composer.changedInstance(bookViewModel) | composer.changed(function1);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.example.ui.screens.NotificationsScreenKt$$ExternalSyntheticLambda0
                        public final Object invoke(Object obj) {
                            return NotificationsScreenKt.NotificationsScreen$lambda$21$lambda$20$lambda$19(list, bookViewModel, function1, (LazyListScope) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                LazyDslKt.LazyColumn(modifierPadding2, (LazyListState) null, paddingValues2, false, vertical, (Alignment.Horizontal) null, (FlingBehavior) null, false, (Function1) objRememberedValue, composer, 24576, 234);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit NotificationsScreen$lambda$21$lambda$20$lambda$19(final List list, final BookViewModel bookViewModel, final Function1 function1, LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyColumn");
        final Function1 function2 = new Function1() { // from class: com.example.ui.screens.NotificationsScreenKt$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return NotificationsScreenKt.NotificationsScreen$lambda$21$lambda$20$lambda$19$lambda$17((NotificationItem) obj);
            }
        };
        final NotificationsScreenKt$NotificationsScreen$lambda$21$lambda$20$lambda$19$$inlined$items$default$1 notificationsScreenKt$NotificationsScreen$lambda$21$lambda$20$lambda$19$$inlined$items$default$1 = new Function1() { // from class: com.example.ui.screens.NotificationsScreenKt$NotificationsScreen$lambda$21$lambda$20$lambda$19$$inlined$items$default$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final Void m386invoke(NotificationItem notificationItem) {
                return null;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m386invoke((NotificationItem) obj);
            }
        };
        lazyListScope.items(list.size(), new Function1<Integer, Object>() { // from class: com.example.ui.screens.NotificationsScreenKt$NotificationsScreen$lambda$21$lambda$20$lambda$19$$inlined$items$default$2
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
        }, new Function1<Integer, Object>() { // from class: com.example.ui.screens.NotificationsScreenKt$NotificationsScreen$lambda$21$lambda$20$lambda$19$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i) {
                return notificationsScreenKt$NotificationsScreen$lambda$21$lambda$20$lambda$19$$inlined$items$default$1.invoke(list.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.screens.NotificationsScreenKt$NotificationsScreen$lambda$21$lambda$20$lambda$19$$inlined$items$default$4
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
                final NotificationItem notificationItem = (NotificationItem) list.get(i);
                composer.startReplaceGroup(-1328273169);
                ComposerKt.sourceInformation(composer, "C*177@8189L11,177@8147L62,178@8260L38,179@8321L5508,175@8035L5794:NotificationsScreen.kt#2thlc2");
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
                CardColors cardColors = CardDefaults.INSTANCE.cardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0L, 0L, composer, CardDefaults.$stable << 12, 14);
                CardElevation cardElevation = CardDefaults.INSTANCE.cardElevation-aqJV_2Y(Dp.constructor-impl(2.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer, (CardDefaults.$stable << 18) | 6, 62);
                final BookViewModel bookViewModel2 = bookViewModel;
                final Function1 function3 = function1;
                CardKt.Card(modifierFillMaxWidth$default, (Shape) null, cardColors, cardElevation, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(106170756, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.example.ui.screens.NotificationsScreenKt$NotificationsScreen$5$2$1$2$1

                    /* JADX INFO: compiled from: NotificationsScreen.kt */
                    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                    public static final /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[NotificationType.values().length];
                            try {
                                iArr[NotificationType.OWNER_REQUESTED.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[NotificationType.REQUESTER_ACCEPTED.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[NotificationType.REQUESTER_CONFIRM_RECEIPT.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            try {
                                iArr[NotificationType.OWNER_PENDING_RETURN.ordinal()] = 4;
                            } catch (NoSuchFieldError unused4) {
                            }
                            try {
                                iArr[NotificationType.CHAT_MESSAGE.ordinal()] = 5;
                            } catch (NoSuchFieldError unused5) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                        invoke((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                    /* JADX WARN: Code duplicated, block: B:103:0x05a4  */
                    /* JADX WARN: Code duplicated, block: B:105:0x05d1  */
                    /* JADX WARN: Code duplicated, block: B:109:0x05fd  */
                    /* JADX WARN: Code duplicated, block: B:111:0x062a  */
                    /* JADX WARN: Code duplicated, block: B:115:0x0656  */
                    /* JADX WARN: Code duplicated, block: B:120:0x06ae  */
                    /* JADX WARN: Code duplicated, block: B:124:0x0703  */
                    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:47:0x02e8  */
                    /* JADX WARN: Code duplicated, block: B:62:0x03cb  */
                    /* JADX WARN: Code duplicated, block: B:65:0x042d  */
                    /* JADX WARN: Code duplicated, block: B:68:0x0439  */
                    /* JADX WARN: Code duplicated, block: B:69:0x043d  */
                    /* JADX WARN: Code duplicated, block: B:74:0x0470  */
                    /* JADX WARN: Code duplicated, block: B:77:0x04ab  */
                    /* JADX WARN: Code duplicated, block: B:79:0x04ae  */
                    /* JADX WARN: Code duplicated, block: B:81:0x04b1  */
                    /* JADX WARN: Code duplicated, block: B:83:0x04b4  */
                    /* JADX WARN: Code duplicated, block: B:85:0x04b7  */
                    /* JADX WARN: Code duplicated, block: B:89:0x04e3  */
                    /* JADX WARN: Code duplicated, block: B:91:0x0510  */
                    /* JADX WARN: Code duplicated, block: B:93:0x051f  */
                    /* JADX WARN: Code duplicated, block: B:97:0x054b  */
                    /* JADX WARN: Code duplicated, block: B:99:0x0578  */
                    public final void invoke(ColumnScope columnScope, Composer composer2, int i4) throws NoWhenBranchMatchedException {
                        int i5;
                        int i6;
                        String transferImageUrl;
                        int i7;
                        Object obj;
                        int currentCompositeKeyHash;
                        Function0 constructor;
                        Composer composer3;
                        Function2 setCompositeKeyHash;
                        int i8;
                        boolean zChangedInstance;
                        Object objRememberedValue;
                        boolean zChangedInstance2;
                        Object objRememberedValue2;
                        boolean zChanged;
                        Object objRememberedValue3;
                        boolean zChangedInstance3;
                        Object objRememberedValue4;
                        boolean zChangedInstance4;
                        Object objRememberedValue5;
                        boolean zChanged2;
                        Object objRememberedValue6;
                        String str;
                        Intrinsics.checkNotNullParameter(columnScope, "$this$Card");
                        ComposerKt.sourceInformation(composer2, "C180@8347L5460:NotificationsScreen.kt#2thlc2");
                        if ((i4 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(106170756, i4, -1, "com.example.ui.screens.NotificationsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NotificationsScreen.kt:180)");
                        }
                        Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f));
                        final NotificationItem notificationItem2 = notificationItem;
                        final BookViewModel bookViewModel3 = bookViewModel2;
                        final Function1<String, Unit> function4 = function3;
                        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, 0);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifier);
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
                        Updater.set-impl(composer4, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.set-impl(composer4, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composer4.getInserting() || !Intrinsics.areEqual(composer4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composer4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composer4.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.set-impl(composer4, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScope columnScope2 = ColumnScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, 1267946040, "C181@8467L10,181@8420L100,182@8549L40,183@8667L10,183@8618L71,224@11390L40,225@11459L2322:NotificationsScreen.kt#2thlc2");
                        TextKt.Text--4IGK_g(notificationItem2.getTitle(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getTitleMedium(), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
                        SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer2, 6);
                        TextKt.Text--4IGK_g(notificationItem2.getMessage(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodyMedium(), composer2, 0, 0, 65534);
                        Composer composer5 = composer2;
                        String returnImageUrl = notificationItem2.getBook().getReturnImageUrl();
                        if (returnImageUrl == null) {
                            returnImageUrl = notificationItem2.getBook().getImageUrl();
                        }
                        String str2 = returnImageUrl;
                        String str3 = "Book Photo:";
                        Object obj2 = null;
                        float f = 0.0f;
                        int i9 = 1;
                        if (notificationItem2.getType() == NotificationType.OWNER_PENDING_RETURN) {
                            String str4 = str2;
                            if (str4 == null || StringsKt.isBlank(str4)) {
                                i5 = 6;
                                i6 = 1259426216;
                            } else {
                                composer5.startReplaceGroup(1268293239);
                                ComposerKt.sourceInformation(composer5, "187@8937L40,190@9220L10,188@9010L335,193@9378L40,201@9917L11,194@9451L527");
                                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer5, 6);
                                String returnImageUrl2 = notificationItem2.getBook().getReturnImageUrl();
                                TextKt.Text--4IGK_g((returnImageUrl2 == null || StringsKt.isBlank(returnImageUrl2)) ? "Book Photo:" : "Borrower's Scanned Return Photo:", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer5, MaterialTheme.$stable).getLabelSmall(), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
                                composer5 = composer2;
                                i5 = 6;
                                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer5, 6);
                                obj2 = null;
                                f = 0.0f;
                                i9 = 1;
                                BookImageDisplayKt.BookImageDisplay(str2, "Scanned Return Photo", BackgroundKt.background-bw27NRU$default(ClipKt.clip(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(160.0f)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(10.0f))), MaterialTheme.INSTANCE.getColorScheme(composer5, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), (Shape) null, 2, (Object) null), null, null, composer5, 48, 24);
                                composer5.endReplaceGroup();
                                i6 = 1259426216;
                            }
                            transferImageUrl = notificationItem2.getBook().getTransferImageUrl();
                            if (transferImageUrl == null) {
                                transferImageUrl = notificationItem2.getBook().getImageUrl();
                            }
                            String str5 = transferImageUrl;
                            if (notificationItem2.getType() == NotificationType.REQUESTER_CONFIRM_RECEIPT || (str = str5) == null || StringsKt.isBlank(str)) {
                                i7 = i5;
                                obj = obj2;
                                composer5.startReplaceGroup(i6);
                            } else {
                                composer5.startReplaceGroup(1269611452);
                                ComposerKt.sourceInformation(composer5, "206@10266L40,209@10542L10,207@10339L328,212@10700L40,220@11241L11,213@10773L529");
                                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer5, i5);
                                String transferImageUrl2 = notificationItem2.getBook().getTransferImageUrl();
                                if (transferImageUrl2 != null && !StringsKt.isBlank(transferImageUrl2)) {
                                    str3 = "Owner's Handover Photo:";
                                }
                                TextKt.Text--4IGK_g(str3, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer5, MaterialTheme.$stable).getLabelSmall(), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
                                composer5 = composer2;
                                i7 = 6;
                                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer5, 6);
                                f = 0.0f;
                                i9 = 1;
                                obj = null;
                                BookImageDisplayKt.BookImageDisplay(str5, "Owner Handover Photo", BackgroundKt.background-bw27NRU$default(ClipKt.clip(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(160.0f)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(10.0f))), MaterialTheme.INSTANCE.getColorScheme(composer5, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), (Shape) null, 2, (Object) null), null, null, composer5, 48, 24);
                            }
                            composer5.endReplaceGroup();
                            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer5, i7);
                            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.Companion, f, i9, obj);
                            Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                            ComposerKt.sourceInformationMarkerStart(composer5, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(end, Alignment.Companion.getTop(), composer5, i7);
                            ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer5, modifierFillMaxWidth$default2);
                            constructor = ComposeUiNode.Companion.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer5.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer5.startReusableNode();
                            if (composer5.getInserting()) {
                                composer5.createNode(constructor);
                            } else {
                                composer5.useNode();
                            }
                            composer3 = Updater.constructor-impl(composer5);
                            Updater.set-impl(composer3, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                            Updater.set-impl(composer3, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                            if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composer3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composer3.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.set-impl(composer3, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer5, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            RowScope rowScope = RowScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer5, 1520378692, "C:NotificationsScreen.kt#2thlc2");
                            i8 = WhenMappings.$EnumSwitchMapping$0[notificationItem2.getType().ordinal()];
                            if (i8 != i9) {
                                composer5.startReplaceGroup(1520418805);
                                ComposerKt.sourceInformation(composer5, "228@11729L40,228@11708L166,231@11915L39,232@12012L39,232@11995L160");
                                ComposerKt.sourceInformationMarkerStart(composer5, 1295973286, "CC(remember):NotificationsScreen.kt#9igjgp");
                                zChangedInstance = composer5.changedInstance(bookViewModel3) | composer5.changedInstance(notificationItem2);
                                objRememberedValue = composer5.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.NotificationsScreenKt$NotificationsScreen$5$2$1$2$1$1$1$1$1
                                        public /* bridge */ /* synthetic */ Object invoke() {
                                            m380invoke();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                        public final void m380invoke() {
                                            bookViewModel3.declineRequest(notificationItem2.getBook());
                                        }
                                    };
                                    composer5.updateRememberedValue(objRememberedValue);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                ButtonKt.TextButton((Function0) objRememberedValue, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$NotificationsScreenKt.INSTANCE.getLambda$1477645779$app(), composer5, 805306368, 510);
                                SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer5, i7);
                                ComposerKt.sourceInformationMarkerStart(composer5, 1295982341, "CC(remember):NotificationsScreen.kt#9igjgp");
                                zChangedInstance2 = composer5.changedInstance(bookViewModel3) | composer5.changedInstance(notificationItem2);
                                objRememberedValue2 = composer5.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                                    objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.NotificationsScreenKt$NotificationsScreen$5$2$1$2$1$1$1$2$1
                                        public /* bridge */ /* synthetic */ Object invoke() {
                                            m381invoke();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                        public final void m381invoke() {
                                            bookViewModel3.acceptRequest(notificationItem2.getBook());
                                        }
                                    };
                                    composer5.updateRememberedValue(objRememberedValue2);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                ButtonKt.Button((Function0) objRememberedValue2, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$NotificationsScreenKt.INSTANCE.m327getLambda$240307002$app(), composer5, 805306368, 510);
                                composer2.endReplaceGroup();
                                Unit unit = Unit.INSTANCE;
                            } else if (i8 != 2) {
                                composer5.startReplaceGroup(1521007929);
                                ComposerKt.sourceInformation(composer5, "237@12328L30,237@12311L155");
                                ComposerKt.sourceInformationMarkerStart(composer5, 1295992444, "CC(remember):NotificationsScreen.kt#9igjgp");
                                zChanged = composer5.changed(function4) | composer5.changedInstance(notificationItem2);
                                objRememberedValue3 = composer5.rememberedValue();
                                if (zChanged || objRememberedValue3 == Composer.Companion.getEmpty()) {
                                    objRememberedValue3 = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.NotificationsScreenKt$NotificationsScreen$5$2$1$2$1$1$1$3$1
                                        public /* bridge */ /* synthetic */ Object invoke() {
                                            m382invoke();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                        public final void m382invoke() {
                                            function4.invoke(notificationItem2.getBook().getId());
                                        }
                                    };
                                    composer5.updateRememberedValue(objRememberedValue3);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                ButtonKt.Button((Function0) objRememberedValue3, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$NotificationsScreenKt.INSTANCE.getLambda$1583056367$app(), composer5, 805306368, 510);
                                composer5.endReplaceGroup();
                                Unit unit2 = Unit.INSTANCE;
                            } else if (i8 != 3) {
                                composer5.startReplaceGroup(1521323850);
                                ComposerKt.sourceInformation(composer5, "242@12646L40,242@12629L170");
                                ComposerKt.sourceInformationMarkerStart(composer5, 1296002630, "CC(remember):NotificationsScreen.kt#9igjgp");
                                zChangedInstance3 = composer5.changedInstance(bookViewModel3) | composer5.changedInstance(notificationItem2);
                                objRememberedValue4 = composer5.rememberedValue();
                                if (zChangedInstance3 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                                    objRememberedValue4 = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.NotificationsScreenKt$NotificationsScreen$5$2$1$2$1$1$1$4$1
                                        public /* bridge */ /* synthetic */ Object invoke() {
                                            m383invoke();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                        public final void m383invoke() {
                                            bookViewModel3.acceptTransfer(notificationItem2.getBook());
                                        }
                                    };
                                    composer5.updateRememberedValue(objRememberedValue4);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                ButtonKt.Button((Function0) objRememberedValue4, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$NotificationsScreenKt.INSTANCE.getLambda$1436127502$app(), composer5, 805306368, 510);
                                composer5.endReplaceGroup();
                                Unit unit3 = Unit.INSTANCE;
                            } else if (i8 != 4) {
                                composer5.startReplaceGroup(1521657038);
                                ComposerKt.sourceInformation(composer5, "247@12974L294,247@12957L422");
                                ComposerKt.sourceInformationMarkerStart(composer5, 1296013380, "CC(remember):NotificationsScreen.kt#9igjgp");
                                zChangedInstance4 = composer5.changedInstance(bookViewModel3) | composer5.changedInstance(notificationItem2);
                                objRememberedValue5 = composer5.rememberedValue();
                                if (zChangedInstance4 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                                    objRememberedValue5 = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.NotificationsScreenKt$NotificationsScreen$5$2$1$2$1$1$1$5$1
                                        public /* bridge */ /* synthetic */ Object invoke() {
                                            m384invoke();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                        public final void m384invoke() {
                                            BookViewModel.returnBook$default(bookViewModel3, notificationItem2.getBook(), notificationItem2.getBook().getCondition(), null, 4, null);
                                        }
                                    };
                                    composer5.updateRememberedValue(objRememberedValue5);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                ButtonKt.Button((Function0) objRememberedValue5, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$NotificationsScreenKt.INSTANCE.getLambda$1289198637$app(), composer5, 805306368, 510);
                                composer5.endReplaceGroup();
                                Unit unit4 = Unit.INSTANCE;
                            } else {
                                if (i8 == 5) {
                                    composer5.startReplaceGroup(1295970463);
                                    composer5.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer5.startReplaceGroup(1522216030);
                                ComposerKt.sourceInformation(composer5, "255@13546L30,255@13529L150");
                                ComposerKt.sourceInformationMarkerStart(composer5, 1296031420, "CC(remember):NotificationsScreen.kt#9igjgp");
                                zChanged2 = composer5.changed(function4) | composer5.changedInstance(notificationItem2);
                                objRememberedValue6 = composer5.rememberedValue();
                                if (zChanged2 || objRememberedValue6 == Composer.Companion.getEmpty()) {
                                    objRememberedValue6 = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.NotificationsScreenKt$NotificationsScreen$5$2$1$2$1$1$1$6$1
                                        public /* bridge */ /* synthetic */ Object invoke() {
                                            m385invoke();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                        public final void m385invoke() {
                                            function4.invoke(notificationItem2.getBook().getId());
                                        }
                                    };
                                    composer5.updateRememberedValue(objRememberedValue6);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                ButtonKt.Button((Function0) objRememberedValue6, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$NotificationsScreenKt.INSTANCE.getLambda$1142269772$app(), composer5, 805306368, 510);
                                composer5.endReplaceGroup();
                                Unit unit5 = Unit.INSTANCE;
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
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
                        i5 = 6;
                        i6 = 1259426216;
                        composer5.startReplaceGroup(i6);
                        composer5.endReplaceGroup();
                        transferImageUrl = notificationItem2.getBook().getTransferImageUrl();
                        if (transferImageUrl == null) {
                            transferImageUrl = notificationItem2.getBook().getImageUrl();
                        }
                        String str6 = transferImageUrl;
                        if (notificationItem2.getType() == NotificationType.REQUESTER_CONFIRM_RECEIPT) {
                            i7 = i5;
                            obj = obj2;
                            composer5.startReplaceGroup(i6);
                        } else {
                            i7 = i5;
                            obj = obj2;
                            composer5.startReplaceGroup(i6);
                        }
                        composer5.endReplaceGroup();
                        SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer5, i7);
                        Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.Companion, f, i9, obj);
                        Arrangement.Horizontal end2 = Arrangement.INSTANCE.getEnd();
                        ComposerKt.sourceInformationMarkerStart(composer5, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(end2, Alignment.Companion.getTop(), composer5, i7);
                        ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer5, modifierFillMaxWidth$default3);
                        constructor = ComposeUiNode.Companion.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer5.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer5.startReusableNode();
                        if (composer5.getInserting()) {
                            composer5.createNode(constructor);
                        } else {
                            composer5.useNode();
                        }
                        composer3 = Updater.constructor-impl(composer5);
                        Updater.set-impl(composer3, measurePolicyRowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.set-impl(composer3, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composer3.getInserting()) {
                            composer3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composer3.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        } else {
                            composer3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composer3.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.set-impl(composer3, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer5, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScope rowScope2 = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer5, 1520378692, "C:NotificationsScreen.kt#2thlc2");
                        i8 = WhenMappings.$EnumSwitchMapping$0[notificationItem2.getType().ordinal()];
                        if (i8 != i9) {
                            composer5.startReplaceGroup(1520418805);
                            ComposerKt.sourceInformation(composer5, "228@11729L40,228@11708L166,231@11915L39,232@12012L39,232@11995L160");
                            ComposerKt.sourceInformationMarkerStart(composer5, 1295973286, "CC(remember):NotificationsScreen.kt#9igjgp");
                            zChangedInstance = composer5.changedInstance(bookViewModel3) | composer5.changedInstance(notificationItem2);
                            objRememberedValue = composer5.rememberedValue();
                            if (zChangedInstance) {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.NotificationsScreenKt$NotificationsScreen$5$2$1$2$1$1$1$1$1
                                    public /* bridge */ /* synthetic */ Object invoke() {
                                        m380invoke();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                    public final void m380invoke() {
                                        bookViewModel3.declineRequest(notificationItem2.getBook());
                                    }
                                };
                                composer5.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.NotificationsScreenKt$NotificationsScreen$5$2$1$2$1$1$1$1$1
                                    public /* bridge */ /* synthetic */ Object invoke() {
                                        m380invoke();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                    public final void m380invoke() {
                                        bookViewModel3.declineRequest(notificationItem2.getBook());
                                    }
                                };
                                composer5.updateRememberedValue(objRememberedValue);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ButtonKt.TextButton((Function0) objRememberedValue, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$NotificationsScreenKt.INSTANCE.getLambda$1477645779$app(), composer5, 805306368, 510);
                            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer5, i7);
                            ComposerKt.sourceInformationMarkerStart(composer5, 1295982341, "CC(remember):NotificationsScreen.kt#9igjgp");
                            zChangedInstance2 = composer5.changedInstance(bookViewModel3) | composer5.changedInstance(notificationItem2);
                            objRememberedValue2 = composer5.rememberedValue();
                            if (zChangedInstance2) {
                                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.NotificationsScreenKt$NotificationsScreen$5$2$1$2$1$1$1$2$1
                                    public /* bridge */ /* synthetic */ Object invoke() {
                                        m381invoke();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                    public final void m381invoke() {
                                        bookViewModel3.acceptRequest(notificationItem2.getBook());
                                    }
                                };
                                composer5.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.NotificationsScreenKt$NotificationsScreen$5$2$1$2$1$1$1$2$1
                                    public /* bridge */ /* synthetic */ Object invoke() {
                                        m381invoke();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                    public final void m381invoke() {
                                        bookViewModel3.acceptRequest(notificationItem2.getBook());
                                    }
                                };
                                composer5.updateRememberedValue(objRememberedValue2);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ButtonKt.Button((Function0) objRememberedValue2, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$NotificationsScreenKt.INSTANCE.m327getLambda$240307002$app(), composer5, 805306368, 510);
                            composer2.endReplaceGroup();
                            Unit unit6 = Unit.INSTANCE;
                        } else if (i8 != 2) {
                            composer5.startReplaceGroup(1521007929);
                            ComposerKt.sourceInformation(composer5, "237@12328L30,237@12311L155");
                            ComposerKt.sourceInformationMarkerStart(composer5, 1295992444, "CC(remember):NotificationsScreen.kt#9igjgp");
                            zChanged = composer5.changed(function4) | composer5.changedInstance(notificationItem2);
                            objRememberedValue3 = composer5.rememberedValue();
                            if (zChanged) {
                                objRememberedValue3 = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.NotificationsScreenKt$NotificationsScreen$5$2$1$2$1$1$1$3$1
                                    public /* bridge */ /* synthetic */ Object invoke() {
                                        m382invoke();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                    public final void m382invoke() {
                                        function4.invoke(notificationItem2.getBook().getId());
                                    }
                                };
                                composer5.updateRememberedValue(objRememberedValue3);
                            } else {
                                objRememberedValue3 = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.NotificationsScreenKt$NotificationsScreen$5$2$1$2$1$1$1$3$1
                                    public /* bridge */ /* synthetic */ Object invoke() {
                                        m382invoke();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                    public final void m382invoke() {
                                        function4.invoke(notificationItem2.getBook().getId());
                                    }
                                };
                                composer5.updateRememberedValue(objRememberedValue3);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ButtonKt.Button((Function0) objRememberedValue3, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$NotificationsScreenKt.INSTANCE.getLambda$1583056367$app(), composer5, 805306368, 510);
                            composer5.endReplaceGroup();
                            Unit unit7 = Unit.INSTANCE;
                        } else if (i8 != 3) {
                            composer5.startReplaceGroup(1521323850);
                            ComposerKt.sourceInformation(composer5, "242@12646L40,242@12629L170");
                            ComposerKt.sourceInformationMarkerStart(composer5, 1296002630, "CC(remember):NotificationsScreen.kt#9igjgp");
                            zChangedInstance3 = composer5.changedInstance(bookViewModel3) | composer5.changedInstance(notificationItem2);
                            objRememberedValue4 = composer5.rememberedValue();
                            if (zChangedInstance3) {
                                objRememberedValue4 = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.NotificationsScreenKt$NotificationsScreen$5$2$1$2$1$1$1$4$1
                                    public /* bridge */ /* synthetic */ Object invoke() {
                                        m383invoke();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                    public final void m383invoke() {
                                        bookViewModel3.acceptTransfer(notificationItem2.getBook());
                                    }
                                };
                                composer5.updateRememberedValue(objRememberedValue4);
                            } else {
                                objRememberedValue4 = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.NotificationsScreenKt$NotificationsScreen$5$2$1$2$1$1$1$4$1
                                    public /* bridge */ /* synthetic */ Object invoke() {
                                        m383invoke();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                    public final void m383invoke() {
                                        bookViewModel3.acceptTransfer(notificationItem2.getBook());
                                    }
                                };
                                composer5.updateRememberedValue(objRememberedValue4);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ButtonKt.Button((Function0) objRememberedValue4, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$NotificationsScreenKt.INSTANCE.getLambda$1436127502$app(), composer5, 805306368, 510);
                            composer5.endReplaceGroup();
                            Unit unit8 = Unit.INSTANCE;
                        } else if (i8 != 4) {
                            composer5.startReplaceGroup(1521657038);
                            ComposerKt.sourceInformation(composer5, "247@12974L294,247@12957L422");
                            ComposerKt.sourceInformationMarkerStart(composer5, 1296013380, "CC(remember):NotificationsScreen.kt#9igjgp");
                            zChangedInstance4 = composer5.changedInstance(bookViewModel3) | composer5.changedInstance(notificationItem2);
                            objRememberedValue5 = composer5.rememberedValue();
                            if (zChangedInstance4) {
                                objRememberedValue5 = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.NotificationsScreenKt$NotificationsScreen$5$2$1$2$1$1$1$5$1
                                    public /* bridge */ /* synthetic */ Object invoke() {
                                        m384invoke();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                    public final void m384invoke() {
                                        BookViewModel.returnBook$default(bookViewModel3, notificationItem2.getBook(), notificationItem2.getBook().getCondition(), null, 4, null);
                                    }
                                };
                                composer5.updateRememberedValue(objRememberedValue5);
                            } else {
                                objRememberedValue5 = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.NotificationsScreenKt$NotificationsScreen$5$2$1$2$1$1$1$5$1
                                    public /* bridge */ /* synthetic */ Object invoke() {
                                        m384invoke();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                    public final void m384invoke() {
                                        BookViewModel.returnBook$default(bookViewModel3, notificationItem2.getBook(), notificationItem2.getBook().getCondition(), null, 4, null);
                                    }
                                };
                                composer5.updateRememberedValue(objRememberedValue5);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ButtonKt.Button((Function0) objRememberedValue5, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$NotificationsScreenKt.INSTANCE.getLambda$1289198637$app(), composer5, 805306368, 510);
                            composer5.endReplaceGroup();
                            Unit unit9 = Unit.INSTANCE;
                        } else {
                            if (i8 == 5) {
                                composer5.startReplaceGroup(1295970463);
                                composer5.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer5.startReplaceGroup(1522216030);
                            ComposerKt.sourceInformation(composer5, "255@13546L30,255@13529L150");
                            ComposerKt.sourceInformationMarkerStart(composer5, 1296031420, "CC(remember):NotificationsScreen.kt#9igjgp");
                            zChanged2 = composer5.changed(function4) | composer5.changedInstance(notificationItem2);
                            objRememberedValue6 = composer5.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue6 = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.NotificationsScreenKt$NotificationsScreen$5$2$1$2$1$1$1$6$1
                                    public /* bridge */ /* synthetic */ Object invoke() {
                                        m385invoke();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                    public final void m385invoke() {
                                        function4.invoke(notificationItem2.getBook().getId());
                                    }
                                };
                                composer5.updateRememberedValue(objRememberedValue6);
                            } else {
                                objRememberedValue6 = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.NotificationsScreenKt$NotificationsScreen$5$2$1$2$1$1$1$6$1
                                    public /* bridge */ /* synthetic */ Object invoke() {
                                        m385invoke();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                    public final void m385invoke() {
                                        function4.invoke(notificationItem2.getBook().getId());
                                    }
                                };
                                composer5.updateRememberedValue(objRememberedValue6);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ButtonKt.Button((Function0) objRememberedValue6, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$NotificationsScreenKt.INSTANCE.getLambda$1142269772$app(), composer5, 805306368, 510);
                            composer5.endReplaceGroup();
                            Unit unit10 = Unit.INSTANCE;
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
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
                }, composer, 54), composer, 196614, 18);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    static final Object NotificationsScreen$lambda$21$lambda$20$lambda$19$lambda$17(NotificationItem notificationItem) {
        Intrinsics.checkNotNullParameter(notificationItem, "it");
        return notificationItem.getId();
    }

    private static final User NotificationsScreen$lambda$3(State<User> state) {
        return (User) state.getValue();
    }

    private static final List<Message> NotificationsScreen$lambda$5(State<? extends List<Message>> state) {
        return (List) state.getValue();
    }
}
