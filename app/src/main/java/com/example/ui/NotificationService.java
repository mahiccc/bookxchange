package com.example.ui;

import android.content.Context;
import com.example.data.Book;
import com.example.data.Message;
import com.example.data.User;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: NotificationService.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\bJ&\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\bJ\u0006\u0010\u0019\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/example/ui/NotificationService;", "", "<init>", "()V", "appStartTime", "", "lastMessageIds", "", "", "lastKnownBookStatuses", "Ljava/util/concurrent/ConcurrentHashMap;", "isMessagesInitialized", "", "isBooksInitialized", "checkAndNotifyMessages", "", "context", "Landroid/content/Context;", "messages", "", "Lcom/example/data/Message;", "currentUser", "checkAndNotifyBooks", "books", "Lcom/example/data/Book;", "markInitialized", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NotificationService {
    public static final int $stable;
    public static final NotificationService INSTANCE = new NotificationService();
    private static long appStartTime = System.currentTimeMillis();
    private static boolean isBooksInitialized;
    private static boolean isMessagesInitialized;
    private static final ConcurrentHashMap<String, String> lastKnownBookStatuses;
    private static final Set<String> lastMessageIds;

    public final void markInitialized() {
    }

    private NotificationService() {
    }

    static {
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        Intrinsics.checkNotNullExpressionValue(keySetViewNewKeySet, "newKeySet(...)");
        lastMessageIds = keySetViewNewKeySet;
        lastKnownBookStatuses = new ConcurrentHashMap<>();
        $stable = 8;
    }

    public final void checkAndNotifyMessages(final Context context, List<Message> messages, String currentUser) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(messages, "messages");
        String str = currentUser;
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        String lowerCase = StringsKt.trim(str).toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (!isMessagesInitialized) {
            isMessagesInitialized = true;
            Set<String> set = lastMessageIds;
            List<Message> list = messages;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Message) it.next()).getId());
            }
            set.addAll(arrayList);
            return;
        }
        List<Message> list2 = messages;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((Message) it2.next()).getId());
        }
        Set set2 = CollectionsKt.toSet(arrayList2);
        Set setMinus = SetsKt.minus(set2, lastMessageIds);
        if (setMinus.isEmpty()) {
            return;
        }
        long j = appStartTime - 300000;
        ArrayList<Message> arrayList3 = new ArrayList();
        for (Object obj : list2) {
            Message message = (Message) obj;
            if (setMinus.contains(message.getId()) && StringsKt.equals(StringsKt.trim(message.getReceiver()).toString(), lowerCase, true) && !StringsKt.equals(StringsKt.trim(message.getSender()).toString(), lowerCase, true) && message.getTimestamp() >= j) {
                arrayList3.add(obj);
            }
        }
        for (final Message message2 : arrayList3) {
            final String string = StringsKt.trim(message2.getSender()).toString();
            if (!StringsKt.isBlank(string)) {
                Task task = FirebaseFirestore.getInstance().collection("users").document(string).get();
                final Function1 function1 = new Function1() { // from class: com.example.ui.NotificationService$$ExternalSyntheticLambda0
                    public final Object invoke(Object obj2) {
                        return NotificationService.checkAndNotifyMessages$lambda$5(string, context, message2, (DocumentSnapshot) obj2);
                    }
                };
                Intrinsics.checkNotNull(task.addOnSuccessListener(new OnSuccessListener() { // from class: com.example.ui.NotificationService$$ExternalSyntheticLambda1
                    public final void onSuccess(Object obj2) {
                        function1.invoke(obj2);
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: com.example.ui.NotificationService$$ExternalSyntheticLambda2
                    public final void onFailure(Exception exc) {
                        NotificationService.checkAndNotifyMessages$lambda$8(string, context, message2, exc);
                    }
                }));
            } else {
                NotificationHelper.INSTANCE.showChatNotification(context, message2.getBookId(), "reader", "Book Reader", message2.getContent(), (96 & 32) != 0 ? null : null, (96 & 64) != 0 ? System.currentTimeMillis() : message2.getTimestamp());
            }
        }
        lastMessageIds.addAll(set2);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    static final Unit checkAndNotifyMessages$lambda$5(String str, Context context, Message message, DocumentSnapshot documentSnapshot) {
        String strSubstringBefore$default;
        User user = (User) documentSnapshot.toObject(User.class);
        if (user == null || (strSubstringBefore$default = user.getDisplayName()) == null) {
            strSubstringBefore$default = StringsKt.substringBefore$default(str, "@", (String) null, 2, (Object) null);
            if (strSubstringBefore$default.length() > 0) {
                StringBuilder sb = new StringBuilder();
                String strValueOf = String.valueOf(strSubstringBefore$default.charAt(0));
                Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
                String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                StringBuilder sbAppend = sb.append((Object) upperCase);
                String strSubstring = strSubstringBefore$default.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                strSubstringBefore$default = sbAppend.append(strSubstring).toString();
            }
        } else {
            if (StringsKt.isBlank(strSubstringBefore$default)) {
                strSubstringBefore$default = null;
            }
            if (strSubstringBefore$default == null) {
                strSubstringBefore$default = StringsKt.substringBefore$default(str, "@", (String) null, 2, (Object) null);
                if (strSubstringBefore$default.length() > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    String strValueOf2 = String.valueOf(strSubstringBefore$default.charAt(0));
                    Intrinsics.checkNotNull(strValueOf2, "null cannot be cast to non-null type java.lang.String");
                    String upperCase2 = strValueOf2.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                    StringBuilder sbAppend2 = sb2.append((Object) upperCase2);
                    String strSubstring2 = strSubstringBefore$default.substring(1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                    strSubstringBefore$default = sbAppend2.append(strSubstring2).toString();
                }
            }
        }
        NotificationHelper.INSTANCE.showChatNotification(context, message.getBookId(), str, strSubstringBefore$default, message.getContent(), user != null ? user.getProfilePicBase64() : null, message.getTimestamp());
        return Unit.INSTANCE;
    }

    static final void checkAndNotifyMessages$lambda$8(String str, Context context, Message message, Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "it");
        String strSubstringBefore$default = StringsKt.substringBefore$default(str, "@", (String) null, 2, (Object) null);
        if (strSubstringBefore$default.length() > 0) {
            StringBuilder sb = new StringBuilder();
            String strValueOf = String.valueOf(strSubstringBefore$default.charAt(0));
            Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            StringBuilder sbAppend = sb.append((Object) upperCase);
            String strSubstring = strSubstringBefore$default.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            strSubstringBefore$default = sbAppend.append(strSubstring).toString();
        }
        NotificationHelper.INSTANCE.showChatNotification(context, message.getBookId(), str, strSubstringBefore$default, message.getContent(), (96 & 32) != 0 ? null : null, (96 & 64) != 0 ? System.currentTimeMillis() : message.getTimestamp());
    }

    /* JADX WARN: Code duplicated, block: B:73:0x022c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0268 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x026a  */
    /* JADX WARN: Code duplicated, block: B:83:0x028a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x028c  */
    /* JADX WARN: Code duplicated, block: B:88:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:89:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:91:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:92:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:94:0x02de  */
    /* JADX WARN: Failed to find 'out' block for switch in B:50:0x0189. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void checkAndNotifyBooks(Context context, List<Book> books, String currentUser) {
        String requestedByName;
        String string;
        String strSubstringBefore$default;
        String strSubstringBefore$default2;
        String strSubstringBefore$default3;
        boolean z;
        String strSubstringBefore$default4;
        String string2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(books, "books");
        if (books.isEmpty()) {
            return;
        }
        boolean z2 = true;
        if (!isBooksInitialized) {
            isBooksInitialized = true;
            for (Book book : books) {
                lastKnownBookStatuses.put(book.getId(), book.getStatus());
            }
            return;
        }
        String str = currentUser;
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        String lowerCase = StringsKt.trim(str).toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        long j = appStartTime - 300000;
        Iterator<Book> it = books.iterator();
        while (it.hasNext()) {
            Book next = it.next();
            ConcurrentHashMap<String, String> concurrentHashMap = lastKnownBookStatuses;
            String str2 = concurrentHashMap.get(next.getId());
            String status = next.getStatus();
            boolean zEquals = StringsKt.equals(StringsKt.trim(next.getOwnerName()).toString(), lowerCase, z2);
            String borrowerName = next.getBorrowerName();
            boolean z3 = ((borrowerName == null || (string2 = StringsKt.trim(borrowerName).toString()) == null || StringsKt.equals(string2, lowerCase, z2) != z2) && ((requestedByName = next.getRequestedByName()) == null || (string = StringsKt.trim(requestedByName).toString()) == null || StringsKt.equals(string, lowerCase, z2) != z2)) ? false : z2;
            it = it;
            if (str2 == null) {
                concurrentHashMap.put(next.getId(), status);
                if (!zEquals && next.getTimestamp() >= j) {
                    if (StringsKt.isBlank(next.getOwnerDisplayName())) {
                        strSubstringBefore$default = StringsKt.substringBefore$default(next.getOwnerName(), "@", (String) null, 2, (Object) null);
                        if (strSubstringBefore$default.length() > 0) {
                            StringBuilder sb = new StringBuilder();
                            String strValueOf = String.valueOf(strSubstringBefore$default.charAt(0));
                            Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
                            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                            StringBuilder sbAppend = sb.append((Object) upperCase);
                            String strSubstring = strSubstringBefore$default.substring(1);
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                            strSubstringBefore$default = sbAppend.append(strSubstring).toString();
                        }
                    } else {
                        strSubstringBefore$default = next.getOwnerDisplayName();
                    }
                    NotificationHelper.INSTANCE.showNotification(context, "New Book Added!", "'" + next.getTitle() + "' by " + strSubstringBefore$default + " was just added to BookXchange!");
                }
            } else if (!Intrinsics.areEqual(str2, status)) {
                concurrentHashMap.put(next.getId(), status);
                String str3 = lowerCase;
                switch (status.hashCode()) {
                    case -1710271240:
                        if (status.equals("PENDING_RETURN") && zEquals) {
                            String borrowerName2 = next.getBorrowerName();
                            if (borrowerName2 == null || (strSubstringBefore$default4 = StringsKt.substringBefore$default(borrowerName2, "@", (String) null, 2, (Object) null)) == null) {
                                z = true;
                            } else {
                                if (strSubstringBefore$default4.length() > 0) {
                                    StringBuilder sb2 = new StringBuilder();
                                    String strValueOf2 = String.valueOf(strSubstringBefore$default4.charAt(0));
                                    Intrinsics.checkNotNull(strValueOf2, "null cannot be cast to non-null type java.lang.String");
                                    String upperCase2 = strValueOf2.toUpperCase(Locale.ROOT);
                                    Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                                    StringBuilder sbAppend2 = sb2.append((Object) upperCase2);
                                    z = true;
                                    String strSubstring2 = strSubstringBefore$default4.substring(1);
                                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                                    strSubstringBefore$default4 = sbAppend2.append(strSubstring2).toString();
                                } else {
                                    z = true;
                                }
                                if (strSubstringBefore$default4 == null) {
                                }
                                NotificationHelper.INSTANCE.showNotification(context, "Return Initiated 📦", strSubstringBefore$default4 + " has initiated return for '" + next.getTitle() + "'. Tap to inspect & confirm receipt.");
                                it = it;
                                z2 = z;
                                lowerCase = str3;
                            }
                            strSubstringBefore$default4 = "Borrower";
                            NotificationHelper.INSTANCE.showNotification(context, "Return Initiated 📦", strSubstringBefore$default4 + " has initiated return for '" + next.getTitle() + "'. Tap to inspect & confirm receipt.");
                            it = it;
                            z2 = z;
                            lowerCase = str3;
                        } else {
                            lowerCase = str3;
                            z2 = true;
                        }
                        break;
                    case -1494985904:
                        if (status.equals("PENDING_RECEIPT")) {
                            if (z3) {
                                if (StringsKt.isBlank(next.getOwnerDisplayName())) {
                                    strSubstringBefore$default2 = StringsKt.substringBefore$default(next.getOwnerName(), "@", (String) null, 2, (Object) null);
                                    if (strSubstringBefore$default2.length() > 0) {
                                        StringBuilder sb3 = new StringBuilder();
                                        String strValueOf3 = String.valueOf(strSubstringBefore$default2.charAt(0));
                                        Intrinsics.checkNotNull(strValueOf3, "null cannot be cast to non-null type java.lang.String");
                                        String upperCase3 = strValueOf3.toUpperCase(Locale.ROOT);
                                        Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
                                        StringBuilder sbAppend3 = sb3.append((Object) upperCase3);
                                        String strSubstring3 = strSubstringBefore$default2.substring(1);
                                        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                                        strSubstringBefore$default2 = sbAppend3.append(strSubstring3).toString();
                                    }
                                } else {
                                    strSubstringBefore$default2 = next.getOwnerDisplayName();
                                }
                                NotificationHelper.INSTANCE.showNotification(context, "Request Accepted! 🎉", strSubstringBefore$default2 + " accepted your request for '" + next.getTitle() + "'. Tap to coordinate handover.");
                            }
                        }
                        lowerCase = str3;
                        z2 = true;
                        break;
                    case -1414529708:
                        if (status.equals("BORROWED")) {
                            if (z3) {
                                NotificationHelper.INSTANCE.showNotification(context, "Handover Complete! 📚", "'" + next.getTitle() + "' is now in your active reads. Happy reading!");
                            } else if (zEquals) {
                                NotificationHelper.INSTANCE.showNotification(context, "Book Lent Out! 🤝", "Handover complete for '" + next.getTitle() + "'.");
                            }
                        }
                        lowerCase = str3;
                        z2 = true;
                        break;
                    case -1305282125:
                        if (status.equals("PENDING_TRANSFER")) {
                            if (z3) {
                                if (StringsKt.isBlank(next.getOwnerDisplayName())) {
                                    strSubstringBefore$default2 = next.getOwnerDisplayName();
                                } else {
                                    strSubstringBefore$default2 = StringsKt.substringBefore$default(next.getOwnerName(), "@", (String) null, 2, (Object) null);
                                    if (strSubstringBefore$default2.length() > 0) {
                                        StringBuilder sb4 = new StringBuilder();
                                        String strValueOf4 = String.valueOf(strSubstringBefore$default2.charAt(0));
                                        Intrinsics.checkNotNull(strValueOf4, "null cannot be cast to non-null type java.lang.String");
                                        String upperCase4 = strValueOf4.toUpperCase(Locale.ROOT);
                                        Intrinsics.checkNotNullExpressionValue(upperCase4, "toUpperCase(...)");
                                        StringBuilder sbAppend4 = sb4.append((Object) upperCase4);
                                        String strSubstring4 = strSubstringBefore$default2.substring(1);
                                        Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
                                        strSubstringBefore$default2 = sbAppend4.append(strSubstring4).toString();
                                    }
                                }
                                NotificationHelper.INSTANCE.showNotification(context, "Request Accepted! 🎉", strSubstringBefore$default2 + " accepted your request for '" + next.getTitle() + "'. Tap to coordinate handover.");
                            }
                        }
                        lowerCase = str3;
                        z2 = true;
                        break;
                    case -814438578:
                        if (status.equals("REQUESTED") && zEquals) {
                            String requestedByName2 = next.getRequestedByName();
                            if (requestedByName2 == null || (strSubstringBefore$default3 = StringsKt.substringBefore$default(requestedByName2, "@", (String) null, 2, (Object) null)) == null) {
                                strSubstringBefore$default3 = "A reader";
                            } else {
                                if (strSubstringBefore$default3.length() > 0) {
                                    StringBuilder sb5 = new StringBuilder();
                                    String strValueOf5 = String.valueOf(strSubstringBefore$default3.charAt(0));
                                    Intrinsics.checkNotNull(strValueOf5, "null cannot be cast to non-null type java.lang.String");
                                    String upperCase5 = strValueOf5.toUpperCase(Locale.ROOT);
                                    Intrinsics.checkNotNullExpressionValue(upperCase5, "toUpperCase(...)");
                                    StringBuilder sbAppend5 = sb5.append((Object) upperCase5);
                                    String strSubstring5 = strSubstringBefore$default3.substring(1);
                                    Intrinsics.checkNotNullExpressionValue(strSubstring5, "substring(...)");
                                    strSubstringBefore$default3 = sbAppend5.append(strSubstring5).toString();
                                }
                                if (strSubstringBefore$default3 == null) {
                                    strSubstringBefore$default3 = "A reader";
                                }
                            }
                            NotificationHelper.INSTANCE.showNotification(context, "Book Requested! 📖", strSubstringBefore$default3 + " requested to borrow '" + next.getTitle() + "'");
                        }
                        lowerCase = str3;
                        z2 = true;
                        break;
                    case 2332927:
                        if (status.equals("LENT")) {
                            if (z3) {
                                NotificationHelper.INSTANCE.showNotification(context, "Handover Complete! 📚", "'" + next.getTitle() + "' is now in your active reads. Happy reading!");
                            } else if (zEquals) {
                                NotificationHelper.INSTANCE.showNotification(context, "Book Lent Out! 🤝", "Handover complete for '" + next.getTitle() + "'.");
                            }
                        }
                        lowerCase = str3;
                        z2 = true;
                        break;
                    case 2052692649:
                        if (status.equals("AVAILABLE") && CollectionsKt.listOf(new String[]{"PENDING_RETURN", "BORROWED", "LENT"}).contains(str2)) {
                            NotificationHelper.INSTANCE.showNotification(context, "Return Completed! ✨", "'" + next.getTitle() + "' return has been verified and completed! Community credits updated.");
                            z = true;
                            it = it;
                            z2 = z;
                            lowerCase = str3;
                        } else {
                            lowerCase = str3;
                            z2 = true;
                        }
                        break;
                    default:
                        z = true;
                        it = it;
                        z2 = z;
                        lowerCase = str3;
                        break;
                }
            }
            z2 = true;
        }
    }
}
