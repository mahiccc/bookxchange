package com.example.data;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.ListenerRegistration;
import com.google.firebase.firestore.MetadataChanges;
import com.google.firebase.firestore.QuerySnapshot;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: compiled from: BookRepository.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "", "Lcom/example/data/Book;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.data.BookRepository$allBooks$1", f = "BookRepository.kt", i = {0, 0}, l = {93}, m = "invokeSuspend", n = {"$this$callbackFlow", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER}, s = {"L$0", "L$1"})
final class BookRepository$allBooks$1 extends SuspendLambda implements Function2<ProducerScope<? super List<? extends Book>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ BookRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BookRepository$allBooks$1(BookRepository bookRepository, Continuation<? super BookRepository$allBooks$1> continuation) {
        super(2, continuation);
        this.this$0 = bookRepository;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Continuation<Unit> bookRepository$allBooks$1 = new BookRepository$allBooks$1(this.this$0, continuation);
        bookRepository$allBooks$1.L$0 = obj;
        return bookRepository$allBooks$1;
    }

    public final Object invoke(ProducerScope<? super List<Book>> producerScope, Continuation<? super Unit> continuation) {
        return create(producerScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        final ProducerScope producerScope = (ProducerScope) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final ListenerRegistration listenerRegistrationAddSnapshotListener = this.this$0.firestore.collection("books_v2").addSnapshotListener(MetadataChanges.INCLUDE, new EventListener() { // from class: com.example.data.BookRepository$allBooks$1$$ExternalSyntheticLambda0
                public final void onEvent(Object obj2, FirebaseFirestoreException firebaseFirestoreException) {
                    BookRepository$allBooks$1.invokeSuspend$lambda$5(producerScope, (QuerySnapshot) obj2, firebaseFirestoreException);
                }
            });
            Intrinsics.checkNotNullExpressionValue(listenerRegistrationAddSnapshotListener, "addSnapshotListener(...)");
            this.L$0 = SpillingKt.nullOutSpilledVariable(producerScope);
            this.L$1 = SpillingKt.nullOutSpilledVariable(listenerRegistrationAddSnapshotListener);
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, new Function0() { // from class: com.example.data.BookRepository$allBooks$1$$ExternalSyntheticLambda1
                public final Object invoke() {
                    return BookRepository$allBooks$1.invokeSuspend$lambda$6(listenerRegistrationAddSnapshotListener);
                }
            }, (Continuation) this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    static final void invokeSuspend$lambda$5(ProducerScope producerScope, QuerySnapshot querySnapshot, FirebaseFirestoreException firebaseFirestoreException) {
        ArrayList arrayListEmptyList;
        List documents;
        Iterator it;
        Book book;
        boolean zBooleanValue;
        Double d;
        Double d2;
        if (firebaseFirestoreException != null) {
            firebaseFirestoreException.printStackTrace();
            return;
        }
        if (querySnapshot == null || (documents = querySnapshot.getDocuments()) == null) {
            arrayListEmptyList = CollectionsKt.emptyList();
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = documents.iterator();
            while (it2.hasNext()) {
                DocumentSnapshot documentSnapshot = (DocumentSnapshot) it2.next();
                try {
                    Map data = documentSnapshot.getData();
                    if (data == null) {
                        it = it2;
                        book = null;
                    } else {
                        String id = documentSnapshot.getId();
                        Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
                        String strInvokeSuspend$lambda$5$lambda$3$getString = invokeSuspend$lambda$5$lambda$3$getString(data, "title");
                        String str = strInvokeSuspend$lambda$5$lambda$3$getString == null ? "" : strInvokeSuspend$lambda$5$lambda$3$getString;
                        String strInvokeSuspend$lambda$5$lambda$3$getString2 = invokeSuspend$lambda$5$lambda$3$getString(data, "author");
                        String str2 = strInvokeSuspend$lambda$5$lambda$3$getString2 == null ? "" : strInvokeSuspend$lambda$5$lambda$3$getString2;
                        String strInvokeSuspend$lambda$5$lambda$3$getString3 = invokeSuspend$lambda$5$lambda$3$getString(data, "condition");
                        if (strInvokeSuspend$lambda$5$lambda$3$getString3 == null) {
                            strInvokeSuspend$lambda$5$lambda$3$getString3 = "Good";
                        }
                        String str3 = strInvokeSuspend$lambda$5$lambda$3$getString3;
                        String strInvokeSuspend$lambda$5$lambda$3$getString4 = invokeSuspend$lambda$5$lambda$3$getString(data, "ownerName");
                        String str4 = strInvokeSuspend$lambda$5$lambda$3$getString4 == null ? "" : strInvokeSuspend$lambda$5$lambda$3$getString4;
                        String strInvokeSuspend$lambda$5$lambda$3$getString5 = invokeSuspend$lambda$5$lambda$3$getString(data, "ownerDisplayName");
                        String str5 = strInvokeSuspend$lambda$5$lambda$3$getString5 == null ? "" : strInvokeSuspend$lambda$5$lambda$3$getString5;
                        String strInvokeSuspend$lambda$5$lambda$3$getString6 = invokeSuspend$lambda$5$lambda$3$getString(data, "ownerProfilePicUrl");
                        Object obj = data.get("isAvailable");
                        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                        if (bool == null) {
                            Object obj2 = data.get("available");
                            bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                            zBooleanValue = bool != null ? bool.booleanValue() : true;
                        }
                        boolean z = zBooleanValue;
                        String strInvokeSuspend$lambda$5$lambda$3$getString7 = invokeSuspend$lambda$5$lambda$3$getString(data, "borrowerName");
                        String strInvokeSuspend$lambda$5$lambda$3$getString8 = invokeSuspend$lambda$5$lambda$3$getString(data, "requestedByName");
                        String strInvokeSuspend$lambda$5$lambda$3$getString9 = invokeSuspend$lambda$5$lambda$3$getString(data, "status");
                        if (strInvokeSuspend$lambda$5$lambda$3$getString9 == null) {
                            strInvokeSuspend$lambda$5$lambda$3$getString9 = "AVAILABLE";
                        }
                        String str6 = strInvokeSuspend$lambda$5$lambda$3$getString9;
                        it = it2;
                        try {
                            long jInvokeSuspend$lambda$5$lambda$3$getLong = invokeSuspend$lambda$5$lambda$3$getLong(data, "timestamp", System.currentTimeMillis());
                            String strInvokeSuspend$lambda$5$lambda$3$getString10 = invokeSuspend$lambda$5$lambda$3$getString(data, "imageUrl");
                            String strInvokeSuspend$lambda$5$lambda$3$getString11 = invokeSuspend$lambda$5$lambda$3$getString(data, "estimatedPrice");
                            String strInvokeSuspend$lambda$5$lambda$3$getString12 = invokeSuspend$lambda$5$lambda$3$getString(data, "pickupAddress");
                            String strInvokeSuspend$lambda$5$lambda$3$getString13 = invokeSuspend$lambda$5$lambda$3$getString(data, "mobileNumber");
                            Double dInvokeSuspend$lambda$5$lambda$3$getDouble = invokeSuspend$lambda$5$lambda$3$getDouble(data, "latitude");
                            if (dInvokeSuspend$lambda$5$lambda$3$getDouble != null) {
                                d = dInvokeSuspend$lambda$5$lambda$3$getDouble;
                            } else {
                                String strInvokeSuspend$lambda$5$lambda$3$getString14 = invokeSuspend$lambda$5$lambda$3$getString(data, "latitude");
                                if (strInvokeSuspend$lambda$5$lambda$3$getString14 != null) {
                                    dInvokeSuspend$lambda$5$lambda$3$getDouble = StringsKt.toDoubleOrNull(strInvokeSuspend$lambda$5$lambda$3$getString14);
                                    d = dInvokeSuspend$lambda$5$lambda$3$getDouble;
                                } else {
                                    d = null;
                                }
                            }
                            Double dInvokeSuspend$lambda$5$lambda$3$getDouble2 = invokeSuspend$lambda$5$lambda$3$getDouble(data, "longitude");
                            if (dInvokeSuspend$lambda$5$lambda$3$getDouble2 != null) {
                                d2 = dInvokeSuspend$lambda$5$lambda$3$getDouble2;
                            } else {
                                String strInvokeSuspend$lambda$5$lambda$3$getString15 = invokeSuspend$lambda$5$lambda$3$getString(data, "longitude");
                                if (strInvokeSuspend$lambda$5$lambda$3$getString15 != null) {
                                    dInvokeSuspend$lambda$5$lambda$3$getDouble2 = StringsKt.toDoubleOrNull(strInvokeSuspend$lambda$5$lambda$3$getString15);
                                    d2 = dInvokeSuspend$lambda$5$lambda$3$getDouble2;
                                } else {
                                    d2 = null;
                                }
                            }
                            String strInvokeSuspend$lambda$5$lambda$3$getString16 = invokeSuspend$lambda$5$lambda$3$getString(data, "genre");
                            String strInvokeSuspend$lambda$5$lambda$3$getString17 = invokeSuspend$lambda$5$lambda$3$getString(data, "description");
                            String strInvokeSuspend$lambda$5$lambda$3$getString18 = invokeSuspend$lambda$5$lambda$3$getString(data, "transferImageUrl");
                            String strInvokeSuspend$lambda$5$lambda$3$getString19 = invokeSuspend$lambda$5$lambda$3$getString(data, "returnImageUrl");
                            String strInvokeSuspend$lambda$5$lambda$3$getString20 = invokeSuspend$lambda$5$lambda$3$getString(data, "transferCondition");
                            String strInvokeSuspend$lambda$5$lambda$3$getString21 = invokeSuspend$lambda$5$lambda$3$getString(data, "transferAiAssessment");
                            String strInvokeSuspend$lambda$5$lambda$3$getString22 = invokeSuspend$lambda$5$lambda$3$getString(data, "returnCondition");
                            String strInvokeSuspend$lambda$5$lambda$3$getString23 = invokeSuspend$lambda$5$lambda$3$getString(data, "returnAiAssessment");
                            boolean zInvokeSuspend$lambda$5$lambda$3$getBoolean = invokeSuspend$lambda$5$lambda$3$getBoolean(data, "isTransferQrVerified", false);
                            boolean zInvokeSuspend$lambda$5$lambda$3$getBoolean2 = invokeSuspend$lambda$5$lambda$3$getBoolean(data, "isReturnQrVerified", false);
                            int iInvokeSuspend$lambda$5$lambda$3$getInt = invokeSuspend$lambda$5$lambda$3$getInt(data, "rentCount", 0);
                            String strInvokeSuspend$lambda$5$lambda$3$getString24 = invokeSuspend$lambda$5$lambda$3$getString(data, "publisher");
                            String strInvokeSuspend$lambda$5$lambda$3$getString25 = invokeSuspend$lambda$5$lambda$3$getString(data, "publishedDate");
                            Integer numValueOf = Integer.valueOf(invokeSuspend$lambda$5$lambda$3$getInt(data, "pageCount", 0));
                            Integer num = numValueOf.intValue() > 0 ? numValueOf : null;
                            String strInvokeSuspend$lambda$5$lambda$3$getString26 = invokeSuspend$lambda$5$lambda$3$getString(data, "language");
                            Double dInvokeSuspend$lambda$5$lambda$3$getDouble3 = invokeSuspend$lambda$5$lambda$3$getDouble(data, "averageRating");
                            String strInvokeSuspend$lambda$5$lambda$3$getString27 = invokeSuspend$lambda$5$lambda$3$getString(data, "categories");
                            String strInvokeSuspend$lambda$5$lambda$3$getString28 = invokeSuspend$lambda$5$lambda$3$getString(data, "remarks");
                            Long lValueOf = Long.valueOf(invokeSuspend$lambda$5$lambda$3$getLong(data, "borrowedDate", 0L));
                            Long l = lValueOf.longValue() > 0 ? lValueOf : null;
                            int iInvokeSuspend$lambda$5$lambda$3$getInt2 = invokeSuspend$lambda$5$lambda$3$getInt(data, "borrowerCurrentPage", 0);
                            String strInvokeSuspend$lambda$5$lambda$3$getString29 = invokeSuspend$lambda$5$lambda$3$getString(data, "borrowerNotes");
                            String strInvokeSuspend$lambda$5$lambda$3$getString30 = invokeSuspend$lambda$5$lambda$3$getString(data, "agreedMeetupSpot");
                            String strInvokeSuspend$lambda$5$lambda$3$getString31 = invokeSuspend$lambda$5$lambda$3$getString(data, "agreedMeetupAddress");
                            Long lValueOf2 = Long.valueOf(invokeSuspend$lambda$5$lambda$3$getLong(data, "agreedMeetupTime", 0L));
                            book = new Book(id, str, str2, str3, str4, str5, strInvokeSuspend$lambda$5$lambda$3$getString6, z, strInvokeSuspend$lambda$5$lambda$3$getString7, strInvokeSuspend$lambda$5$lambda$3$getString8, str6, jInvokeSuspend$lambda$5$lambda$3$getLong, strInvokeSuspend$lambda$5$lambda$3$getString10, strInvokeSuspend$lambda$5$lambda$3$getString11, strInvokeSuspend$lambda$5$lambda$3$getString12, strInvokeSuspend$lambda$5$lambda$3$getString13, d, d2, strInvokeSuspend$lambda$5$lambda$3$getString16, strInvokeSuspend$lambda$5$lambda$3$getString17, strInvokeSuspend$lambda$5$lambda$3$getString18, strInvokeSuspend$lambda$5$lambda$3$getString19, strInvokeSuspend$lambda$5$lambda$3$getString20, strInvokeSuspend$lambda$5$lambda$3$getString21, strInvokeSuspend$lambda$5$lambda$3$getString22, strInvokeSuspend$lambda$5$lambda$3$getString23, zInvokeSuspend$lambda$5$lambda$3$getBoolean, zInvokeSuspend$lambda$5$lambda$3$getBoolean2, iInvokeSuspend$lambda$5$lambda$3$getInt, strInvokeSuspend$lambda$5$lambda$3$getString24, strInvokeSuspend$lambda$5$lambda$3$getString25, num, strInvokeSuspend$lambda$5$lambda$3$getString26, dInvokeSuspend$lambda$5$lambda$3$getDouble3, strInvokeSuspend$lambda$5$lambda$3$getString27, strInvokeSuspend$lambda$5$lambda$3$getString28, l, null, iInvokeSuspend$lambda$5$lambda$3$getInt2, strInvokeSuspend$lambda$5$lambda$3$getString29, strInvokeSuspend$lambda$5$lambda$3$getString30, strInvokeSuspend$lambda$5$lambda$3$getString31, lValueOf2.longValue() > 0 ? lValueOf2 : null, 0, 32, null);
                        } catch (Exception e) {
                            e = e;
                            e.printStackTrace();
                            book = null;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    it = it2;
                }
                if (book != null) {
                    arrayList.add(book);
                }
                it2 = it;
            }
            arrayListEmptyList = arrayList;
        }
        ChannelResult.isSuccess-impl(producerScope.trySend-JP2dKIU(CollectionsKt.sortedWith(arrayListEmptyList, new Comparator() { // from class: com.example.data.BookRepository$allBooks$1$invokeSuspend$lambda$5$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Long.valueOf(((Book) t2).getTimestamp()), Long.valueOf(((Book) t).getTimestamp()));
            }
        })));
    }

    private static final String invokeSuspend$lambda$5$lambda$3$getString(Map<String, Object> map, String str) {
        Object obj = map.get(str);
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    private static final boolean invokeSuspend$lambda$5$lambda$3$getBoolean(Map<String, Object> map, String str, boolean z) {
        Object obj = map.get(str);
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        return bool != null ? bool.booleanValue() : z;
    }

    private static final long invokeSuspend$lambda$5$lambda$3$getLong(Map<String, Object> map, String str, long j) {
        Object obj = map.get(str);
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        return obj instanceof Timestamp ? ((Timestamp) obj).toDate().getTime() : j;
    }

    private static final Double invokeSuspend$lambda$5$lambda$3$getDouble(Map<String, Object> map, String str) {
        Object obj = map.get(str);
        Number number = obj instanceof Number ? (Number) obj : null;
        if (number != null) {
            return Double.valueOf(number.doubleValue());
        }
        return null;
    }

    private static final int invokeSuspend$lambda$5$lambda$3$getInt(Map<String, Object> map, String str, int i) {
        Object obj = map.get(str);
        Number number = obj instanceof Number ? (Number) obj : null;
        return number != null ? number.intValue() : i;
    }

    static final Unit invokeSuspend$lambda$6(ListenerRegistration listenerRegistration) {
        listenerRegistration.remove();
        return Unit.INSTANCE;
    }
}
