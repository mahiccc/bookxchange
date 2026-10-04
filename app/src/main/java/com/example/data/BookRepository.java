package com.example.data;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.ListenerRegistration;
import com.google.firebase.firestore.QuerySnapshot;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.tasks.TasksKt;

/* JADX INFO: compiled from: BookRepository.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00072\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0014\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00072\u0006\u0010\u0018\u001a\u00020\u000eJ\u0016\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010\u001bJ\u0016\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010\u001bJ\u001a\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\b0\u00072\u0006\u0010\u001f\u001a\u00020\u000eJ\u001a\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\b0\u00072\u0006\u0010\u0018\u001a\u00020\u000eJ\u0016\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u001eH\u0086@¢\u0006\u0002\u0010#J\u001e\u0010$\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010&J\u0016\u0010'\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u0015J\u001a\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\b0\u00072\u0006\u0010\u0018\u001a\u00020\u000eJ\u0016\u0010+\u001a\u00020\u00102\u0006\u0010,\u001a\u00020*H\u0086@¢\u0006\u0002\u0010-J\u001a\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\b0\u00072\u0006\u0010\u001f\u001a\u00020\u000eJ\u0012\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\b0\u0007J\u0016\u00101\u001a\u00020\u00102\u0006\u00102\u001a\u000200H\u0086@¢\u0006\u0002\u00103J\u001a\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\b0\u00072\u0006\u00106\u001a\u00020\u000eJ\u0016\u00107\u001a\u00020\u00102\u0006\u00108\u001a\u000205H\u0086@¢\u0006\u0002\u00109J\u0016\u0010:\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u0015J\u0016\u0010;\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u001eH\u0086@¢\u0006\u0002\u0010#J\u0018\u0010<\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010=0\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006>"}, d2 = {"Lcom/example/data/BookRepository;", "", "firestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "<init>", "(Lcom/google/firebase/firestore/FirebaseFirestore;)V", "allBooks", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/data/Book;", "getAllBooks", "()Lkotlinx/coroutines/flow/Flow;", "getBookById", "id", "", "insertBook", "", "book", "(Lcom/example/data/Book;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateBook", "deleteBookById", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUser", "Lcom/example/data/User;", "username", "insertUser", "user", "(Lcom/example/data/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUser", "getMessagesForBook", "Lcom/example/data/Message;", "bookId", "getMessagesForUser", "insertMessage", "message", "(Lcom/example/data/Message;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markMessagesAsRead", "readerUsername", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markMessagesAsDelivered", "recipientUsername", "getReviewsForUser", "Lcom/example/data/Review;", "insertReview", "review", "(Lcom/example/data/Review;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getReviewsForBook", "getAllFeedback", "Lcom/example/data/Feedback;", "insertFeedback", "feedback", "(Lcom/example/data/Feedback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWishlistForUser", "Lcom/example/data/WishlistRequest;", "userEmail", "insertWishlist", "item", "(Lcom/example/data/WishlistRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteWishlist", "updateMessage", "getSystemControl", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BookRepository {
    public static final int $stable = 8;
    private final Flow<List<Book>> allBooks;
    private final FirebaseFirestore firestore;

    /* JADX INFO: renamed from: com.example.data.BookRepository$deleteBookById$1, reason: invalid class name */
    /* JADX INFO: compiled from: BookRepository.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.data.BookRepository", f = "BookRepository.kt", i = {0}, l = {126}, m = "deleteBookById", n = {"id"}, s = {"L$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BookRepository.this.deleteBookById(null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.example.data.BookRepository$deleteWishlist$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookRepository.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.data.BookRepository", f = "BookRepository.kt", i = {0}, l = {421}, m = "deleteWishlist", n = {"id"}, s = {"L$0"})
    static final class C00751 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C00751(Continuation<? super C00751> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BookRepository.this.deleteWishlist(null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.example.data.BookRepository$insertBook$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookRepository.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.data.BookRepository", f = "BookRepository.kt", i = {0}, l = {116}, m = "insertBook", n = {"book"}, s = {"L$0"})
    static final class C00851 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C00851(Continuation<? super C00851> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BookRepository.this.insertBook(null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.example.data.BookRepository$insertFeedback$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookRepository.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.data.BookRepository", f = "BookRepository.kt", i = {0}, l = {382}, m = "insertFeedback", n = {"feedback"}, s = {"L$0"})
    static final class C00861 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C00861(Continuation<? super C00861> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BookRepository.this.insertFeedback(null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.example.data.BookRepository$insertMessage$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookRepository.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.data.BookRepository", f = "BookRepository.kt", i = {0, 0, 0, 0, 0}, l = {275}, m = "insertMessage", n = {"message", "cleanSender", "cleanReceiver", "participantsList", "enrichedMessage"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
    static final class C00871 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C00871(Continuation<? super C00871> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BookRepository.this.insertMessage(null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.example.data.BookRepository$insertReview$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookRepository.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.data.BookRepository", f = "BookRepository.kt", i = {0}, l = {346}, m = "insertReview", n = {"review"}, s = {"L$0"})
    static final class C00881 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C00881(Continuation<? super C00881> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BookRepository.this.insertReview(null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.example.data.BookRepository$insertUser$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookRepository.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.data.BookRepository", f = "BookRepository.kt", i = {0}, l = {150}, m = "insertUser", n = {"user"}, s = {"L$0"})
    static final class C00891 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C00891(Continuation<? super C00891> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BookRepository.this.insertUser(null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.example.data.BookRepository$insertWishlist$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookRepository.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.data.BookRepository", f = "BookRepository.kt", i = {0, 0}, l = {412}, m = "insertWishlist", n = {"item", "clean"}, s = {"L$0", "L$1"})
    static final class C00901 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C00901(Continuation<? super C00901> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BookRepository.this.insertWishlist(null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.example.data.BookRepository$markMessagesAsDelivered$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookRepository.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.data.BookRepository", f = "BookRepository.kt", i = {0, 0, 1, 1, 1, 1}, l = {315, 321}, m = "markMessagesAsDelivered", n = {"recipientUsername", "cleanRecipient", "recipientUsername", "cleanRecipient", "snapshot", "batch"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3"})
    static final class C00911 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C00911(Continuation<? super C00911> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BookRepository.this.markMessagesAsDelivered(null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.example.data.BookRepository$markMessagesAsRead$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookRepository.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.data.BookRepository", f = "BookRepository.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {288, 300}, m = "markMessagesAsRead", n = {"bookId", "readerUsername", "cleanReader", "bookId", "readerUsername", "cleanReader", "snapshot", "batch", "count"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0"})
    static final class C00921 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C00921(Continuation<? super C00921> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BookRepository.this.markMessagesAsRead(null, null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.example.data.BookRepository$updateBook$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookRepository.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.data.BookRepository", f = "BookRepository.kt", i = {0}, l = {121}, m = "updateBook", n = {"book"}, s = {"L$0"})
    static final class C00931 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C00931(Continuation<? super C00931> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BookRepository.this.updateBook(null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.example.data.BookRepository$updateMessage$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookRepository.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.data.BookRepository", f = "BookRepository.kt", i = {0}, l = {430}, m = "updateMessage", n = {"message"}, s = {"L$0"})
    static final class C00941 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C00941(Continuation<? super C00941> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BookRepository.this.updateMessage(null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.example.data.BookRepository$updateUser$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookRepository.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.data.BookRepository", f = "BookRepository.kt", i = {0}, l = {155}, m = "updateUser", n = {"user"}, s = {"L$0"})
    static final class C00951 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C00951(Continuation<? super C00951> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BookRepository.this.updateUser(null, (Continuation) this);
        }
    }

    public BookRepository(FirebaseFirestore firebaseFirestore) {
        Intrinsics.checkNotNullParameter(firebaseFirestore, "firestore");
        this.firestore = firebaseFirestore;
        this.allBooks = FlowKt.callbackFlow(new BookRepository$allBooks$1(this, null));
    }

    public final Flow<List<Book>> getAllBooks() {
        return this.allBooks;
    }

    /* JADX INFO: renamed from: com.example.data.BookRepository$getBookById$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookRepository.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/example/data/Book;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.data.BookRepository$getBookById$1", f = "BookRepository.kt", i = {0, 0}, l = {111}, m = "invokeSuspend", n = {"$this$callbackFlow", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER}, s = {"L$0", "L$1"})
    static final class C00771 extends SuspendLambda implements Function2<ProducerScope<? super Book>, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $id;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ BookRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C00771(String str, BookRepository bookRepository, Continuation<? super C00771> continuation) {
            super(2, continuation);
            this.$id = str;
            this.this$0 = bookRepository;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            Continuation<Unit> c00771 = new C00771(this.$id, this.this$0, continuation);
            c00771.L$0 = obj;
            return c00771;
        }

        public final Object invoke(ProducerScope<? super Book> producerScope, Continuation<? super Unit> continuation) {
            return create(producerScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            final SendChannel sendChannel = (ProducerScope) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (StringsKt.isBlank(this.$id)) {
                    sendChannel.trySend-JP2dKIU((Object) null);
                    SendChannel.DefaultImpls.close$default(sendChannel, (Throwable) null, 1, (Object) null);
                    return Unit.INSTANCE;
                }
                final ListenerRegistration listenerRegistrationAddSnapshotListener = this.this$0.firestore.collection("books_v2").document(this.$id).addSnapshotListener(new EventListener() { // from class: com.example.data.BookRepository$getBookById$1$$ExternalSyntheticLambda0
                    public final void onEvent(Object obj2, FirebaseFirestoreException firebaseFirestoreException) {
                        BookRepository.C00771.invokeSuspend$lambda$0(sendChannel, (DocumentSnapshot) obj2, firebaseFirestoreException);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(listenerRegistrationAddSnapshotListener, "addSnapshotListener(...)");
                this.L$0 = SpillingKt.nullOutSpilledVariable(sendChannel);
                this.L$1 = SpillingKt.nullOutSpilledVariable(listenerRegistrationAddSnapshotListener);
                this.label = 1;
                if (ProduceKt.awaitClose(sendChannel, new Function0() { // from class: com.example.data.BookRepository$getBookById$1$$ExternalSyntheticLambda1
                    public final Object invoke() {
                        return BookRepository.C00771.invokeSuspend$lambda$1(listenerRegistrationAddSnapshotListener);
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

        static final void invokeSuspend$lambda$0(ProducerScope producerScope, DocumentSnapshot documentSnapshot, FirebaseFirestoreException firebaseFirestoreException) {
            if (firebaseFirestoreException != null) {
                firebaseFirestoreException.printStackTrace();
                return;
            }
            Book book = null;
            if (documentSnapshot != null) {
                try {
                    book = (Book) documentSnapshot.toObject(Book.class);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            producerScope.trySend-JP2dKIU(book);
        }

        static final Unit invokeSuspend$lambda$1(ListenerRegistration listenerRegistration) {
            listenerRegistration.remove();
            return Unit.INSTANCE;
        }
    }

    public final Flow<Book> getBookById(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return FlowKt.callbackFlow(new C00771(id, this, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object insertBook(Book book, Continuation<? super Unit> continuation) {
        C00851 c00851;
        if (continuation instanceof C00851) {
            c00851 = (C00851) continuation;
            if ((c00851.label & Integer.MIN_VALUE) != 0) {
                c00851.label -= Integer.MIN_VALUE;
            } else {
                c00851 = new C00851(continuation);
            }
        } else {
            c00851 = new C00851(continuation);
        }
        Object obj = c00851.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c00851.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (StringsKt.isBlank(book.getId())) {
                    return Unit.INSTANCE;
                }
                Task task = this.firestore.collection("books_v2").document(book.getId()).set(book);
                Intrinsics.checkNotNullExpressionValue(task, "set(...)");
                c00851.L$0 = SpillingKt.nullOutSpilledVariable(book);
                c00851.label = 1;
                if (TasksKt.await(task, c00851) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object updateBook(Book book, Continuation<? super Unit> continuation) {
        C00931 c00931;
        if (continuation instanceof C00931) {
            c00931 = (C00931) continuation;
            if ((c00931.label & Integer.MIN_VALUE) != 0) {
                c00931.label -= Integer.MIN_VALUE;
            } else {
                c00931 = new C00931(continuation);
            }
        } else {
            c00931 = new C00931(continuation);
        }
        Object obj = c00931.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c00931.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (StringsKt.isBlank(book.getId())) {
                    return Unit.INSTANCE;
                }
                Task task = this.firestore.collection("books_v2").document(book.getId()).set(book);
                Intrinsics.checkNotNullExpressionValue(task, "set(...)");
                c00931.L$0 = SpillingKt.nullOutSpilledVariable(book);
                c00931.label = 1;
                if (TasksKt.await(task, c00931) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object deleteBookById(String str, Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (StringsKt.isBlank(str)) {
                    return Unit.INSTANCE;
                }
                Task taskDelete = this.firestore.collection("books_v2").document(str).delete();
                Intrinsics.checkNotNullExpressionValue(taskDelete, "delete(...)");
                anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(str);
                anonymousClass1.label = 1;
                if (TasksKt.await(taskDelete, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.example.data.BookRepository$getUser$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookRepository.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/example/data/User;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.data.BookRepository$getUser$1", f = "BookRepository.kt", i = {0, 0}, l = {145}, m = "invokeSuspend", n = {"$this$callbackFlow", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER}, s = {"L$0", "L$1"})
    static final class C00831 extends SuspendLambda implements Function2<ProducerScope<? super User>, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $username;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ BookRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C00831(String str, BookRepository bookRepository, Continuation<? super C00831> continuation) {
            super(2, continuation);
            this.$username = str;
            this.this$0 = bookRepository;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            Continuation<Unit> c00831 = new C00831(this.$username, this.this$0, continuation);
            c00831.L$0 = obj;
            return c00831;
        }

        public final Object invoke(ProducerScope<? super User> producerScope, Continuation<? super Unit> continuation) {
            return create(producerScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            final SendChannel sendChannel = (ProducerScope) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (StringsKt.isBlank(this.$username)) {
                    sendChannel.trySend-JP2dKIU((Object) null);
                    SendChannel.DefaultImpls.close$default(sendChannel, (Throwable) null, 1, (Object) null);
                    return Unit.INSTANCE;
                }
                final ListenerRegistration listenerRegistrationAddSnapshotListener = this.this$0.firestore.collection("users").document(this.$username).addSnapshotListener(new EventListener() { // from class: com.example.data.BookRepository$getUser$1$$ExternalSyntheticLambda0
                    public final void onEvent(Object obj2, FirebaseFirestoreException firebaseFirestoreException) {
                        BookRepository.C00831.invokeSuspend$lambda$0(sendChannel, (DocumentSnapshot) obj2, firebaseFirestoreException);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(listenerRegistrationAddSnapshotListener, "addSnapshotListener(...)");
                this.L$0 = SpillingKt.nullOutSpilledVariable(sendChannel);
                this.L$1 = SpillingKt.nullOutSpilledVariable(listenerRegistrationAddSnapshotListener);
                this.label = 1;
                if (ProduceKt.awaitClose(sendChannel, new Function0() { // from class: com.example.data.BookRepository$getUser$1$$ExternalSyntheticLambda1
                    public final Object invoke() {
                        return BookRepository.C00831.invokeSuspend$lambda$1(listenerRegistrationAddSnapshotListener);
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

        static final void invokeSuspend$lambda$0(ProducerScope producerScope, DocumentSnapshot documentSnapshot, FirebaseFirestoreException firebaseFirestoreException) {
            if (firebaseFirestoreException != null) {
                firebaseFirestoreException.printStackTrace();
                return;
            }
            User user = null;
            if (documentSnapshot != null) {
                try {
                    user = (User) documentSnapshot.toObject(User.class);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            producerScope.trySend-JP2dKIU(user);
        }

        static final Unit invokeSuspend$lambda$1(ListenerRegistration listenerRegistration) {
            listenerRegistration.remove();
            return Unit.INSTANCE;
        }
    }

    public final Flow<User> getUser(String username) {
        Intrinsics.checkNotNullParameter(username, "username");
        return FlowKt.callbackFlow(new C00831(username, this, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object insertUser(User user, Continuation<? super Unit> continuation) {
        C00891 c00891;
        if (continuation instanceof C00891) {
            c00891 = (C00891) continuation;
            if ((c00891.label & Integer.MIN_VALUE) != 0) {
                c00891.label -= Integer.MIN_VALUE;
            } else {
                c00891 = new C00891(continuation);
            }
        } else {
            c00891 = new C00891(continuation);
        }
        Object obj = c00891.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c00891.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (StringsKt.isBlank(user.getUsername())) {
                    return Unit.INSTANCE;
                }
                Task task = this.firestore.collection("users").document(user.getUsername()).set(user);
                Intrinsics.checkNotNullExpressionValue(task, "set(...)");
                c00891.L$0 = SpillingKt.nullOutSpilledVariable(user);
                c00891.label = 1;
                if (TasksKt.await(task, c00891) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object updateUser(User user, Continuation<? super Unit> continuation) {
        C00951 c00951;
        if (continuation instanceof C00951) {
            c00951 = (C00951) continuation;
            if ((c00951.label & Integer.MIN_VALUE) != 0) {
                c00951.label -= Integer.MIN_VALUE;
            } else {
                c00951 = new C00951(continuation);
            }
        } else {
            c00951 = new C00951(continuation);
        }
        Object obj = c00951.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c00951.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (StringsKt.isBlank(user.getUsername())) {
                    return Unit.INSTANCE;
                }
                Task task = this.firestore.collection("users").document(user.getUsername()).set(user);
                Intrinsics.checkNotNullExpressionValue(task, "set(...)");
                c00951.L$0 = SpillingKt.nullOutSpilledVariable(user);
                c00951.label = 1;
                if (TasksKt.await(task, c00951) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.example.data.BookRepository$getMessagesForBook$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookRepository.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "", "Lcom/example/data/Message;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.data.BookRepository$getMessagesForBook$1", f = "BookRepository.kt", i = {0, 0}, l = {172}, m = "invokeSuspend", n = {"$this$callbackFlow", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER}, s = {"L$0", "L$1"})
    static final class C00781 extends SuspendLambda implements Function2<ProducerScope<? super List<? extends Message>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $bookId;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C00781(String str, Continuation<? super C00781> continuation) {
            super(2, continuation);
            this.$bookId = str;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            Continuation<Unit> c00781 = BookRepository.this.new C00781(this.$bookId, continuation);
            c00781.L$0 = obj;
            return c00781;
        }

        public final Object invoke(ProducerScope<? super List<Message>> producerScope, Continuation<? super Unit> continuation) {
            return create(producerScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final ListenerRegistration listenerRegistrationAddSnapshotListener = BookRepository.this.firestore.collection("messages").whereEqualTo("bookId", this.$bookId).addSnapshotListener(new EventListener() { // from class: com.example.data.BookRepository$getMessagesForBook$1$$ExternalSyntheticLambda0
                    public final void onEvent(Object obj2, FirebaseFirestoreException firebaseFirestoreException) {
                        BookRepository.C00781.invokeSuspend$lambda$2(producerScope, (QuerySnapshot) obj2, firebaseFirestoreException);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(listenerRegistrationAddSnapshotListener, "addSnapshotListener(...)");
                this.L$0 = SpillingKt.nullOutSpilledVariable(producerScope);
                this.L$1 = SpillingKt.nullOutSpilledVariable(listenerRegistrationAddSnapshotListener);
                this.label = 1;
                if (ProduceKt.awaitClose(producerScope, new Function0() { // from class: com.example.data.BookRepository$getMessagesForBook$1$$ExternalSyntheticLambda1
                    public final Object invoke() {
                        return BookRepository.C00781.invokeSuspend$lambda$3(listenerRegistrationAddSnapshotListener);
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

        static final void invokeSuspend$lambda$2(ProducerScope producerScope, QuerySnapshot querySnapshot, FirebaseFirestoreException firebaseFirestoreException) {
            ArrayList arrayListEmptyList;
            List documents;
            Message message;
            if (firebaseFirestoreException != null) {
                firebaseFirestoreException.printStackTrace();
                return;
            }
            if (querySnapshot == null || (documents = querySnapshot.getDocuments()) == null) {
                arrayListEmptyList = CollectionsKt.emptyList();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = documents.iterator();
                while (it.hasNext()) {
                    try {
                        message = (Message) ((DocumentSnapshot) it.next()).toObject(Message.class);
                    } catch (Exception e) {
                        e.printStackTrace();
                        message = null;
                    }
                    if (message != null) {
                        arrayList.add(message);
                    }
                }
                arrayListEmptyList = arrayList;
            }
            producerScope.trySend-JP2dKIU(CollectionsKt.sortedWith(arrayListEmptyList, new Comparator() { // from class: com.example.data.BookRepository$getMessagesForBook$1$invokeSuspend$lambda$2$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Long.valueOf(((Message) t).getTimestamp()), Long.valueOf(((Message) t2).getTimestamp()));
                }
            }));
        }

        static final Unit invokeSuspend$lambda$3(ListenerRegistration listenerRegistration) {
            listenerRegistration.remove();
            return Unit.INSTANCE;
        }
    }

    public final Flow<List<Message>> getMessagesForBook(String bookId) {
        Intrinsics.checkNotNullParameter(bookId, "bookId");
        return FlowKt.callbackFlow(new C00781(bookId, null));
    }

    /* JADX INFO: renamed from: com.example.data.BookRepository$getMessagesForUser$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookRepository.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "", "Lcom/example/data/Message;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.data.BookRepository$getMessagesForUser$1", f = "BookRepository.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {252}, m = "invokeSuspend", n = {"$this$callbackFlow", "cleanUser", "originalUser", "messagesMap", "l1", "l2", "l3", "l4", "l5"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"})
    static final class C00791 extends SuspendLambda implements Function2<ProducerScope<? super List<? extends Message>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $username;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;
        final /* synthetic */ BookRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C00791(String str, BookRepository bookRepository, Continuation<? super C00791> continuation) {
            super(2, continuation);
            this.$username = str;
            this.this$0 = bookRepository;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            Continuation<Unit> c00791 = new C00791(this.$username, this.this$0, continuation);
            c00791.L$0 = obj;
            return c00791;
        }

        public final Object invoke(ProducerScope<? super List<Message>> producerScope, Continuation<? super Unit> continuation) {
            return create(producerScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            final SendChannel sendChannel = (ProducerScope) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (StringsKt.isBlank(this.$username)) {
                    sendChannel.trySend-JP2dKIU(CollectionsKt.emptyList());
                    SendChannel.DefaultImpls.close$default(sendChannel, (Throwable) null, 1, (Object) null);
                    return Unit.INSTANCE;
                }
                String lowerCase = StringsKt.trim(this.$username).toString().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                String string = StringsKt.trim(this.$username).toString();
                final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                final ListenerRegistration listenerRegistrationAddSnapshotListener = this.this$0.firestore.collection("messages").whereEqualTo("receiver", lowerCase).addSnapshotListener(new EventListener() { // from class: com.example.data.BookRepository$getMessagesForUser$1$$ExternalSyntheticLambda0
                    public final void onEvent(Object obj2, FirebaseFirestoreException firebaseFirestoreException) {
                        BookRepository.C00791.invokeSuspend$lambda$3(concurrentHashMap, sendChannel, (QuerySnapshot) obj2, firebaseFirestoreException);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(listenerRegistrationAddSnapshotListener, "addSnapshotListener(...)");
                final ListenerRegistration listenerRegistrationAddSnapshotListener2 = this.this$0.firestore.collection("messages").whereEqualTo("sender", lowerCase).addSnapshotListener(new EventListener() { // from class: com.example.data.BookRepository$getMessagesForUser$1$$ExternalSyntheticLambda1
                    public final void onEvent(Object obj2, FirebaseFirestoreException firebaseFirestoreException) {
                        BookRepository.C00791.invokeSuspend$lambda$6(concurrentHashMap, sendChannel, (QuerySnapshot) obj2, firebaseFirestoreException);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(listenerRegistrationAddSnapshotListener2, "addSnapshotListener(...)");
                final ListenerRegistration listenerRegistrationAddSnapshotListener3 = this.this$0.firestore.collection("messages").whereArrayContains("participants", lowerCase).addSnapshotListener(new EventListener() { // from class: com.example.data.BookRepository$getMessagesForUser$1$$ExternalSyntheticLambda2
                    public final void onEvent(Object obj2, FirebaseFirestoreException firebaseFirestoreException) {
                        BookRepository.C00791.invokeSuspend$lambda$9(concurrentHashMap, sendChannel, (QuerySnapshot) obj2, firebaseFirestoreException);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(listenerRegistrationAddSnapshotListener3, "addSnapshotListener(...)");
                final ListenerRegistration listenerRegistrationAddSnapshotListener4 = !Intrinsics.areEqual(string, lowerCase) ? this.this$0.firestore.collection("messages").whereEqualTo("receiver", string).addSnapshotListener(new EventListener() { // from class: com.example.data.BookRepository$getMessagesForUser$1$$ExternalSyntheticLambda3
                    public final void onEvent(Object obj2, FirebaseFirestoreException firebaseFirestoreException) {
                        BookRepository.C00791.invokeSuspend$lambda$12(concurrentHashMap, sendChannel, (QuerySnapshot) obj2, firebaseFirestoreException);
                    }
                }) : null;
                final ListenerRegistration listenerRegistrationAddSnapshotListener5 = Intrinsics.areEqual(string, lowerCase) ? null : this.this$0.firestore.collection("messages").whereEqualTo("sender", string).addSnapshotListener(new EventListener() { // from class: com.example.data.BookRepository$getMessagesForUser$1$$ExternalSyntheticLambda4
                    public final void onEvent(Object obj2, FirebaseFirestoreException firebaseFirestoreException) {
                        BookRepository.C00791.invokeSuspend$lambda$15(concurrentHashMap, sendChannel, (QuerySnapshot) obj2, firebaseFirestoreException);
                    }
                });
                this.L$0 = SpillingKt.nullOutSpilledVariable(sendChannel);
                this.L$1 = SpillingKt.nullOutSpilledVariable(lowerCase);
                this.L$2 = SpillingKt.nullOutSpilledVariable(string);
                this.L$3 = SpillingKt.nullOutSpilledVariable(concurrentHashMap);
                this.L$4 = SpillingKt.nullOutSpilledVariable(listenerRegistrationAddSnapshotListener);
                this.L$5 = SpillingKt.nullOutSpilledVariable(listenerRegistrationAddSnapshotListener2);
                this.L$6 = SpillingKt.nullOutSpilledVariable(listenerRegistrationAddSnapshotListener3);
                this.L$7 = SpillingKt.nullOutSpilledVariable(listenerRegistrationAddSnapshotListener4);
                this.L$8 = SpillingKt.nullOutSpilledVariable(listenerRegistrationAddSnapshotListener5);
                this.label = 1;
                if (ProduceKt.awaitClose(sendChannel, new Function0() { // from class: com.example.data.BookRepository$getMessagesForUser$1$$ExternalSyntheticLambda5
                    public final Object invoke() {
                        return BookRepository.C00791.invokeSuspend$lambda$16(listenerRegistrationAddSnapshotListener, listenerRegistrationAddSnapshotListener2, listenerRegistrationAddSnapshotListener3, listenerRegistrationAddSnapshotListener4, listenerRegistrationAddSnapshotListener5);
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

        private static final void invokeSuspend$emitSorted(ProducerScope<? super List<Message>> producerScope, ConcurrentHashMap<String, Message> concurrentHashMap) {
            Collection<Message> collectionValues = concurrentHashMap.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
            producerScope.trySend-JP2dKIU(CollectionsKt.sortedWith(collectionValues, new Comparator() { // from class: com.example.data.BookRepository$getMessagesForUser$1$invokeSuspend$emitSorted$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Long.valueOf(((Message) t2).getTimestamp()), Long.valueOf(((Message) t).getTimestamp()));
                }
            }));
        }

        static final void invokeSuspend$lambda$3(ConcurrentHashMap concurrentHashMap, ProducerScope producerScope, QuerySnapshot querySnapshot, FirebaseFirestoreException firebaseFirestoreException) {
            if (firebaseFirestoreException != null || querySnapshot == null) {
                return;
            }
            List documents = querySnapshot.getDocuments();
            Intrinsics.checkNotNullExpressionValue(documents, "getDocuments(...)");
            Iterator it = documents.iterator();
            while (it.hasNext()) {
                Message message = (Message) ((DocumentSnapshot) it.next()).toObject(Message.class);
                if (message != null) {
                    concurrentHashMap.put(message.getId(), message);
                }
            }
            invokeSuspend$emitSorted(producerScope, concurrentHashMap);
        }

        static final void invokeSuspend$lambda$6(ConcurrentHashMap concurrentHashMap, ProducerScope producerScope, QuerySnapshot querySnapshot, FirebaseFirestoreException firebaseFirestoreException) {
            if (firebaseFirestoreException != null || querySnapshot == null) {
                return;
            }
            List documents = querySnapshot.getDocuments();
            Intrinsics.checkNotNullExpressionValue(documents, "getDocuments(...)");
            Iterator it = documents.iterator();
            while (it.hasNext()) {
                Message message = (Message) ((DocumentSnapshot) it.next()).toObject(Message.class);
                if (message != null) {
                    concurrentHashMap.put(message.getId(), message);
                }
            }
            invokeSuspend$emitSorted(producerScope, concurrentHashMap);
        }

        static final void invokeSuspend$lambda$9(ConcurrentHashMap concurrentHashMap, ProducerScope producerScope, QuerySnapshot querySnapshot, FirebaseFirestoreException firebaseFirestoreException) {
            if (firebaseFirestoreException != null || querySnapshot == null) {
                return;
            }
            List documents = querySnapshot.getDocuments();
            Intrinsics.checkNotNullExpressionValue(documents, "getDocuments(...)");
            Iterator it = documents.iterator();
            while (it.hasNext()) {
                Message message = (Message) ((DocumentSnapshot) it.next()).toObject(Message.class);
                if (message != null) {
                    concurrentHashMap.put(message.getId(), message);
                }
            }
            invokeSuspend$emitSorted(producerScope, concurrentHashMap);
        }

        static final void invokeSuspend$lambda$12(ConcurrentHashMap concurrentHashMap, ProducerScope producerScope, QuerySnapshot querySnapshot, FirebaseFirestoreException firebaseFirestoreException) {
            if (firebaseFirestoreException != null || querySnapshot == null) {
                return;
            }
            List documents = querySnapshot.getDocuments();
            Intrinsics.checkNotNullExpressionValue(documents, "getDocuments(...)");
            Iterator it = documents.iterator();
            while (it.hasNext()) {
                Message message = (Message) ((DocumentSnapshot) it.next()).toObject(Message.class);
                if (message != null) {
                    concurrentHashMap.put(message.getId(), message);
                }
            }
            invokeSuspend$emitSorted(producerScope, concurrentHashMap);
        }

        static final void invokeSuspend$lambda$15(ConcurrentHashMap concurrentHashMap, ProducerScope producerScope, QuerySnapshot querySnapshot, FirebaseFirestoreException firebaseFirestoreException) {
            if (firebaseFirestoreException != null || querySnapshot == null) {
                return;
            }
            List documents = querySnapshot.getDocuments();
            Intrinsics.checkNotNullExpressionValue(documents, "getDocuments(...)");
            Iterator it = documents.iterator();
            while (it.hasNext()) {
                Message message = (Message) ((DocumentSnapshot) it.next()).toObject(Message.class);
                if (message != null) {
                    concurrentHashMap.put(message.getId(), message);
                }
            }
            invokeSuspend$emitSorted(producerScope, concurrentHashMap);
        }

        static final Unit invokeSuspend$lambda$16(ListenerRegistration listenerRegistration, ListenerRegistration listenerRegistration2, ListenerRegistration listenerRegistration3, ListenerRegistration listenerRegistration4, ListenerRegistration listenerRegistration5) {
            listenerRegistration.remove();
            listenerRegistration2.remove();
            listenerRegistration3.remove();
            if (listenerRegistration4 != null) {
                listenerRegistration4.remove();
            }
            if (listenerRegistration5 != null) {
                listenerRegistration5.remove();
            }
            return Unit.INSTANCE;
        }
    }

    public final Flow<List<Message>> getMessagesForUser(String username) {
        Intrinsics.checkNotNullParameter(username, "username");
        return FlowKt.callbackFlow(new C00791(username, this, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public final Object insertMessage(Message message, Continuation<? super Unit> continuation) {
        C00871 c00871;
        if (continuation instanceof C00871) {
            c00871 = (C00871) continuation;
            if ((c00871.label & Integer.MIN_VALUE) != 0) {
                c00871.label -= Integer.MIN_VALUE;
            } else {
                c00871 = new C00871(continuation);
            }
        } else {
            c00871 = new C00871(continuation);
        }
        Object obj = c00871.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c00871.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String lowerCase = StringsKt.trim(message.getSender()).toString().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                String lowerCase2 = StringsKt.trim(message.getReceiver()).toString().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                List listDistinct = CollectionsKt.distinct(CollectionsKt.listOf(new String[]{lowerCase, lowerCase2, StringsKt.trim(message.getSender()).toString(), StringsKt.trim(message.getReceiver()).toString()}));
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listDistinct) {
                    if (!StringsKt.isBlank((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = arrayList;
                Message messageCopy$default = Message.copy$default(message, null, null, lowerCase, lowerCase2, arrayList2, null, 0L, StringsKt.isBlank(message.getStatus()) ? "SENT" : message.getStatus(), null, null, null, null, null, null, null, null, null, null, 261987, null);
                Task task = this.firestore.collection("messages").document(messageCopy$default.getId()).set(messageCopy$default);
                Intrinsics.checkNotNullExpressionValue(task, "set(...)");
                c00871.L$0 = SpillingKt.nullOutSpilledVariable(message);
                c00871.L$1 = SpillingKt.nullOutSpilledVariable(lowerCase);
                c00871.L$2 = SpillingKt.nullOutSpilledVariable(lowerCase2);
                c00871.L$3 = SpillingKt.nullOutSpilledVariable(arrayList2);
                c00871.L$4 = SpillingKt.nullOutSpilledVariable(messageCopy$default);
                c00871.label = 1;
                if (TasksKt.await(task, c00871) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x010b  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0160, code lost:
    
        if (kotlinx.coroutines.tasks.TasksKt.await(r3, r5) == r6) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object markMessagesAsRead(java.lang.String r18, java.lang.String r19, kotlin.coroutines.Continuation<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.data.BookRepository.markMessagesAsRead(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0107, code lost:
    
        if (kotlinx.coroutines.tasks.TasksKt.await(r3, r0) == r1) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object markMessagesAsDelivered(java.lang.String r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.data.BookRepository.markMessagesAsDelivered(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: com.example.data.BookRepository$getReviewsForUser$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookRepository.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "", "Lcom/example/data/Review;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.data.BookRepository$getReviewsForUser$1", f = "BookRepository.kt", i = {0, 0}, l = {342}, m = "invokeSuspend", n = {"$this$callbackFlow", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER}, s = {"L$0", "L$1"})
    static final class C00811 extends SuspendLambda implements Function2<ProducerScope<? super List<? extends Review>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $username;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C00811(String str, Continuation<? super C00811> continuation) {
            super(2, continuation);
            this.$username = str;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            Continuation<Unit> c00811 = BookRepository.this.new C00811(this.$username, continuation);
            c00811.L$0 = obj;
            return c00811;
        }

        public final Object invoke(ProducerScope<? super List<Review>> producerScope, Continuation<? super Unit> continuation) {
            return create(producerScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final ListenerRegistration listenerRegistrationAddSnapshotListener = BookRepository.this.firestore.collection("reviews").whereEqualTo("targetUsername", this.$username).addSnapshotListener(new EventListener() { // from class: com.example.data.BookRepository$getReviewsForUser$1$$ExternalSyntheticLambda0
                    public final void onEvent(Object obj2, FirebaseFirestoreException firebaseFirestoreException) {
                        BookRepository.C00811.invokeSuspend$lambda$2(producerScope, (QuerySnapshot) obj2, firebaseFirestoreException);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(listenerRegistrationAddSnapshotListener, "addSnapshotListener(...)");
                this.L$0 = SpillingKt.nullOutSpilledVariable(producerScope);
                this.L$1 = SpillingKt.nullOutSpilledVariable(listenerRegistrationAddSnapshotListener);
                this.label = 1;
                if (ProduceKt.awaitClose(producerScope, new Function0() { // from class: com.example.data.BookRepository$getReviewsForUser$1$$ExternalSyntheticLambda1
                    public final Object invoke() {
                        return BookRepository.C00811.invokeSuspend$lambda$3(listenerRegistrationAddSnapshotListener);
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

        static final void invokeSuspend$lambda$2(ProducerScope producerScope, QuerySnapshot querySnapshot, FirebaseFirestoreException firebaseFirestoreException) {
            ArrayList arrayListEmptyList;
            List documents;
            Review review;
            if (firebaseFirestoreException != null) {
                firebaseFirestoreException.printStackTrace();
                return;
            }
            if (querySnapshot == null || (documents = querySnapshot.getDocuments()) == null) {
                arrayListEmptyList = CollectionsKt.emptyList();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = documents.iterator();
                while (it.hasNext()) {
                    try {
                        review = (Review) ((DocumentSnapshot) it.next()).toObject(Review.class);
                    } catch (Exception e) {
                        e.printStackTrace();
                        review = null;
                    }
                    if (review != null) {
                        arrayList.add(review);
                    }
                }
                arrayListEmptyList = arrayList;
            }
            producerScope.trySend-JP2dKIU(CollectionsKt.sortedWith(arrayListEmptyList, new Comparator() { // from class: com.example.data.BookRepository$getReviewsForUser$1$invokeSuspend$lambda$2$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Long.valueOf(((Review) t2).getTimestamp()), Long.valueOf(((Review) t).getTimestamp()));
                }
            }));
        }

        static final Unit invokeSuspend$lambda$3(ListenerRegistration listenerRegistration) {
            listenerRegistration.remove();
            return Unit.INSTANCE;
        }
    }

    public final Flow<List<Review>> getReviewsForUser(String username) {
        Intrinsics.checkNotNullParameter(username, "username");
        return FlowKt.callbackFlow(new C00811(username, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object insertReview(Review review, Continuation<? super Unit> continuation) {
        C00881 c00881;
        if (continuation instanceof C00881) {
            c00881 = (C00881) continuation;
            if ((c00881.label & Integer.MIN_VALUE) != 0) {
                c00881.label -= Integer.MIN_VALUE;
            } else {
                c00881 = new C00881(continuation);
            }
        } else {
            c00881 = new C00881(continuation);
        }
        Object obj = c00881.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c00881.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Task task = this.firestore.collection("reviews").document(review.getId()).set(review);
                Intrinsics.checkNotNullExpressionValue(task, "set(...)");
                c00881.L$0 = SpillingKt.nullOutSpilledVariable(review);
                c00881.label = 1;
                if (TasksKt.await(task, c00881) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.example.data.BookRepository$getReviewsForBook$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookRepository.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "", "Lcom/example/data/Review;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.data.BookRepository$getReviewsForBook$1", f = "BookRepository.kt", i = {0, 0}, l = {362}, m = "invokeSuspend", n = {"$this$callbackFlow", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER}, s = {"L$0", "L$1"})
    static final class C00801 extends SuspendLambda implements Function2<ProducerScope<? super List<? extends Review>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $bookId;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C00801(String str, Continuation<? super C00801> continuation) {
            super(2, continuation);
            this.$bookId = str;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            Continuation<Unit> c00801 = BookRepository.this.new C00801(this.$bookId, continuation);
            c00801.L$0 = obj;
            return c00801;
        }

        public final Object invoke(ProducerScope<? super List<Review>> producerScope, Continuation<? super Unit> continuation) {
            return create(producerScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final ListenerRegistration listenerRegistrationAddSnapshotListener = BookRepository.this.firestore.collection("reviews").whereEqualTo("bookId", this.$bookId).addSnapshotListener(new EventListener() { // from class: com.example.data.BookRepository$getReviewsForBook$1$$ExternalSyntheticLambda0
                    public final void onEvent(Object obj2, FirebaseFirestoreException firebaseFirestoreException) {
                        BookRepository.C00801.invokeSuspend$lambda$2(producerScope, (QuerySnapshot) obj2, firebaseFirestoreException);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(listenerRegistrationAddSnapshotListener, "addSnapshotListener(...)");
                this.L$0 = SpillingKt.nullOutSpilledVariable(producerScope);
                this.L$1 = SpillingKt.nullOutSpilledVariable(listenerRegistrationAddSnapshotListener);
                this.label = 1;
                if (ProduceKt.awaitClose(producerScope, new Function0() { // from class: com.example.data.BookRepository$getReviewsForBook$1$$ExternalSyntheticLambda1
                    public final Object invoke() {
                        return BookRepository.C00801.invokeSuspend$lambda$3(listenerRegistrationAddSnapshotListener);
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

        static final void invokeSuspend$lambda$2(ProducerScope producerScope, QuerySnapshot querySnapshot, FirebaseFirestoreException firebaseFirestoreException) {
            ArrayList arrayListEmptyList;
            List documents;
            Review review;
            if (firebaseFirestoreException != null) {
                firebaseFirestoreException.printStackTrace();
                return;
            }
            if (querySnapshot == null || (documents = querySnapshot.getDocuments()) == null) {
                arrayListEmptyList = CollectionsKt.emptyList();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = documents.iterator();
                while (it.hasNext()) {
                    try {
                        review = (Review) ((DocumentSnapshot) it.next()).toObject(Review.class);
                    } catch (Exception unused) {
                        review = null;
                    }
                    if (review != null) {
                        arrayList.add(review);
                    }
                }
                arrayListEmptyList = arrayList;
            }
            producerScope.trySend-JP2dKIU(CollectionsKt.sortedWith(arrayListEmptyList, new Comparator() { // from class: com.example.data.BookRepository$getReviewsForBook$1$invokeSuspend$lambda$2$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Long.valueOf(((Review) t2).getTimestamp()), Long.valueOf(((Review) t).getTimestamp()));
                }
            }));
        }

        static final Unit invokeSuspend$lambda$3(ListenerRegistration listenerRegistration) {
            listenerRegistration.remove();
            return Unit.INSTANCE;
        }
    }

    public final Flow<List<Review>> getReviewsForBook(String bookId) {
        Intrinsics.checkNotNullParameter(bookId, "bookId");
        return FlowKt.callbackFlow(new C00801(bookId, null));
    }

    /* JADX INFO: renamed from: com.example.data.BookRepository$getAllFeedback$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookRepository.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "", "Lcom/example/data/Feedback;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.data.BookRepository$getAllFeedback$1", f = "BookRepository.kt", i = {0, 0}, l = {378}, m = "invokeSuspend", n = {"$this$callbackFlow", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER}, s = {"L$0", "L$1"})
    static final class C00761 extends SuspendLambda implements Function2<ProducerScope<? super List<? extends Feedback>>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        C00761(Continuation<? super C00761> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            Continuation<Unit> c00761 = BookRepository.this.new C00761(continuation);
            c00761.L$0 = obj;
            return c00761;
        }

        public final Object invoke(ProducerScope<? super List<Feedback>> producerScope, Continuation<? super Unit> continuation) {
            return create(producerScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final ListenerRegistration listenerRegistrationAddSnapshotListener = BookRepository.this.firestore.collection("feedback").addSnapshotListener(new EventListener() { // from class: com.example.data.BookRepository$getAllFeedback$1$$ExternalSyntheticLambda0
                    public final void onEvent(Object obj2, FirebaseFirestoreException firebaseFirestoreException) {
                        BookRepository.C00761.invokeSuspend$lambda$2(producerScope, (QuerySnapshot) obj2, firebaseFirestoreException);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(listenerRegistrationAddSnapshotListener, "addSnapshotListener(...)");
                this.L$0 = SpillingKt.nullOutSpilledVariable(producerScope);
                this.L$1 = SpillingKt.nullOutSpilledVariable(listenerRegistrationAddSnapshotListener);
                this.label = 1;
                if (ProduceKt.awaitClose(producerScope, new Function0() { // from class: com.example.data.BookRepository$getAllFeedback$1$$ExternalSyntheticLambda1
                    public final Object invoke() {
                        return BookRepository.C00761.invokeSuspend$lambda$3(listenerRegistrationAddSnapshotListener);
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

        static final void invokeSuspend$lambda$2(ProducerScope producerScope, QuerySnapshot querySnapshot, FirebaseFirestoreException firebaseFirestoreException) {
            ArrayList arrayListEmptyList;
            List documents;
            Feedback feedback;
            if (firebaseFirestoreException != null) {
                firebaseFirestoreException.printStackTrace();
                return;
            }
            if (querySnapshot == null || (documents = querySnapshot.getDocuments()) == null) {
                arrayListEmptyList = CollectionsKt.emptyList();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = documents.iterator();
                while (it.hasNext()) {
                    try {
                        feedback = (Feedback) ((DocumentSnapshot) it.next()).toObject(Feedback.class);
                    } catch (Exception unused) {
                        feedback = null;
                    }
                    if (feedback != null) {
                        arrayList.add(feedback);
                    }
                }
                arrayListEmptyList = arrayList;
            }
            producerScope.trySend-JP2dKIU(CollectionsKt.sortedWith(arrayListEmptyList, new Comparator() { // from class: com.example.data.BookRepository$getAllFeedback$1$invokeSuspend$lambda$2$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Long.valueOf(((Feedback) t2).getTimestamp()), Long.valueOf(((Feedback) t).getTimestamp()));
                }
            }));
        }

        static final Unit invokeSuspend$lambda$3(ListenerRegistration listenerRegistration) {
            listenerRegistration.remove();
            return Unit.INSTANCE;
        }
    }

    public final Flow<List<Feedback>> getAllFeedback() {
        return FlowKt.callbackFlow(new C00761(null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object insertFeedback(Feedback feedback, Continuation<? super Unit> continuation) {
        C00861 c00861;
        if (continuation instanceof C00861) {
            c00861 = (C00861) continuation;
            if ((c00861.label & Integer.MIN_VALUE) != 0) {
                c00861.label -= Integer.MIN_VALUE;
            } else {
                c00861 = new C00861(continuation);
            }
        } else {
            c00861 = new C00861(continuation);
        }
        Object obj = c00861.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c00861.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Task task = this.firestore.collection("feedback").document(feedback.getId()).set(feedback);
                Intrinsics.checkNotNullExpressionValue(task, "set(...)");
                c00861.L$0 = SpillingKt.nullOutSpilledVariable(feedback);
                c00861.label = 1;
                if (TasksKt.await(task, c00861) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.example.data.BookRepository$getWishlistForUser$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookRepository.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "", "Lcom/example/data/WishlistRequest;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.data.BookRepository$getWishlistForUser$1", f = "BookRepository.kt", i = {0, 0, 0}, l = {405}, m = "invokeSuspend", n = {"$this$callbackFlow", "cleanEmail", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER}, s = {"L$0", "L$1", "L$2"})
    static final class C00841 extends SuspendLambda implements Function2<ProducerScope<? super List<? extends WishlistRequest>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $userEmail;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ BookRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C00841(String str, BookRepository bookRepository, Continuation<? super C00841> continuation) {
            super(2, continuation);
            this.$userEmail = str;
            this.this$0 = bookRepository;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            Continuation<Unit> c00841 = new C00841(this.$userEmail, this.this$0, continuation);
            c00841.L$0 = obj;
            return c00841;
        }

        public final Object invoke(ProducerScope<? super List<WishlistRequest>> producerScope, Continuation<? super Unit> continuation) {
            return create(producerScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            final SendChannel sendChannel = (ProducerScope) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (StringsKt.isBlank(this.$userEmail)) {
                    sendChannel.trySend-JP2dKIU(CollectionsKt.emptyList());
                    SendChannel.DefaultImpls.close$default(sendChannel, (Throwable) null, 1, (Object) null);
                    return Unit.INSTANCE;
                }
                String lowerCase = StringsKt.trim(this.$userEmail).toString().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                final ListenerRegistration listenerRegistrationAddSnapshotListener = this.this$0.firestore.collection("wishlists").whereEqualTo("userEmail", lowerCase).addSnapshotListener(new EventListener() { // from class: com.example.data.BookRepository$getWishlistForUser$1$$ExternalSyntheticLambda0
                    public final void onEvent(Object obj2, FirebaseFirestoreException firebaseFirestoreException) {
                        BookRepository.C00841.invokeSuspend$lambda$2(sendChannel, (QuerySnapshot) obj2, firebaseFirestoreException);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(listenerRegistrationAddSnapshotListener, "addSnapshotListener(...)");
                this.L$0 = SpillingKt.nullOutSpilledVariable(sendChannel);
                this.L$1 = SpillingKt.nullOutSpilledVariable(lowerCase);
                this.L$2 = SpillingKt.nullOutSpilledVariable(listenerRegistrationAddSnapshotListener);
                this.label = 1;
                if (ProduceKt.awaitClose(sendChannel, new Function0() { // from class: com.example.data.BookRepository$getWishlistForUser$1$$ExternalSyntheticLambda1
                    public final Object invoke() {
                        return BookRepository.C00841.invokeSuspend$lambda$3(listenerRegistrationAddSnapshotListener);
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

        static final void invokeSuspend$lambda$2(ProducerScope producerScope, QuerySnapshot querySnapshot, FirebaseFirestoreException firebaseFirestoreException) {
            ArrayList arrayListEmptyList;
            List documents;
            WishlistRequest wishlistRequest;
            if (firebaseFirestoreException != null) {
                firebaseFirestoreException.printStackTrace();
                return;
            }
            if (querySnapshot == null || (documents = querySnapshot.getDocuments()) == null) {
                arrayListEmptyList = CollectionsKt.emptyList();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = documents.iterator();
                while (it.hasNext()) {
                    try {
                        wishlistRequest = (WishlistRequest) ((DocumentSnapshot) it.next()).toObject(WishlistRequest.class);
                    } catch (Exception unused) {
                        wishlistRequest = null;
                    }
                    if (wishlistRequest != null) {
                        arrayList.add(wishlistRequest);
                    }
                }
                arrayListEmptyList = arrayList;
            }
            producerScope.trySend-JP2dKIU(CollectionsKt.sortedWith(arrayListEmptyList, new Comparator() { // from class: com.example.data.BookRepository$getWishlistForUser$1$invokeSuspend$lambda$2$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Long.valueOf(((WishlistRequest) t2).getTimestamp()), Long.valueOf(((WishlistRequest) t).getTimestamp()));
                }
            }));
        }

        static final Unit invokeSuspend$lambda$3(ListenerRegistration listenerRegistration) {
            listenerRegistration.remove();
            return Unit.INSTANCE;
        }
    }

    public final Flow<List<WishlistRequest>> getWishlistForUser(String userEmail) {
        Intrinsics.checkNotNullParameter(userEmail, "userEmail");
        return FlowKt.callbackFlow(new C00841(userEmail, this, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public final Object insertWishlist(WishlistRequest wishlistRequest, Continuation<? super Unit> continuation) {
        C00901 c00901;
        if (continuation instanceof C00901) {
            c00901 = (C00901) continuation;
            if ((c00901.label & Integer.MIN_VALUE) != 0) {
                c00901.label -= Integer.MIN_VALUE;
            } else {
                c00901 = new C00901(continuation);
            }
        } else {
            c00901 = new C00901(continuation);
        }
        Object obj = c00901.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c00901.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (StringsKt.isBlank(wishlistRequest.getId()) || StringsKt.isBlank(wishlistRequest.getUserEmail())) {
                    return Unit.INSTANCE;
                }
                String lowerCase = StringsKt.trim(wishlistRequest.getUserEmail()).toString().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                WishlistRequest wishlistRequestCopy$default = WishlistRequest.copy$default(wishlistRequest, null, lowerCase, null, null, null, 0L, 61, null);
                Task task = this.firestore.collection("wishlists").document(wishlistRequestCopy$default.getId()).set(wishlistRequestCopy$default);
                Intrinsics.checkNotNullExpressionValue(task, "set(...)");
                c00901.L$0 = SpillingKt.nullOutSpilledVariable(wishlistRequest);
                c00901.L$1 = SpillingKt.nullOutSpilledVariable(wishlistRequestCopy$default);
                c00901.label = 1;
                if (TasksKt.await(task, c00901) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object deleteWishlist(String str, Continuation<? super Unit> continuation) {
        C00751 c00751;
        if (continuation instanceof C00751) {
            c00751 = (C00751) continuation;
            if ((c00751.label & Integer.MIN_VALUE) != 0) {
                c00751.label -= Integer.MIN_VALUE;
            } else {
                c00751 = new C00751(continuation);
            }
        } else {
            c00751 = new C00751(continuation);
        }
        Object obj = c00751.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c00751.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (StringsKt.isBlank(str)) {
                    return Unit.INSTANCE;
                }
                Task taskDelete = this.firestore.collection("wishlists").document(str).delete();
                Intrinsics.checkNotNullExpressionValue(taskDelete, "delete(...)");
                c00751.L$0 = SpillingKt.nullOutSpilledVariable(str);
                c00751.label = 1;
                if (TasksKt.await(taskDelete, c00751) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object updateMessage(Message message, Continuation<? super Unit> continuation) {
        C00941 c00941;
        if (continuation instanceof C00941) {
            c00941 = (C00941) continuation;
            if ((c00941.label & Integer.MIN_VALUE) != 0) {
                c00941.label -= Integer.MIN_VALUE;
            } else {
                c00941 = new C00941(continuation);
            }
        } else {
            c00941 = new C00941(continuation);
        }
        Object obj = c00941.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c00941.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (StringsKt.isBlank(message.getId())) {
                    return Unit.INSTANCE;
                }
                Task task = this.firestore.collection("messages").document(message.getId()).set(message);
                Intrinsics.checkNotNullExpressionValue(task, "set(...)");
                c00941.L$0 = SpillingKt.nullOutSpilledVariable(message);
                c00941.label = 1;
                if (TasksKt.await(task, c00941) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.example.data.BookRepository$getSystemControl$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookRepository.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "", "", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.data.BookRepository$getSystemControl$1", f = "BookRepository.kt", i = {0, 0}, l = {441}, m = "invokeSuspend", n = {"$this$callbackFlow", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER}, s = {"L$0", "L$1"})
    static final class C00821 extends SuspendLambda implements Function2<ProducerScope<? super Map<String, ? extends Object>>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        C00821(Continuation<? super C00821> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            Continuation<Unit> c00821 = BookRepository.this.new C00821(continuation);
            c00821.L$0 = obj;
            return c00821;
        }

        public final Object invoke(ProducerScope<? super Map<String, ? extends Object>> producerScope, Continuation<? super Unit> continuation) {
            return create(producerScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final ListenerRegistration listenerRegistrationAddSnapshotListener = BookRepository.this.firestore.collection("system_control").document("global_settings").addSnapshotListener(new EventListener() { // from class: com.example.data.BookRepository$getSystemControl$1$$ExternalSyntheticLambda0
                    public final void onEvent(Object obj2, FirebaseFirestoreException firebaseFirestoreException) {
                        BookRepository.C00821.invokeSuspend$lambda$0(producerScope, (DocumentSnapshot) obj2, firebaseFirestoreException);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(listenerRegistrationAddSnapshotListener, "addSnapshotListener(...)");
                this.L$0 = SpillingKt.nullOutSpilledVariable(producerScope);
                this.L$1 = SpillingKt.nullOutSpilledVariable(listenerRegistrationAddSnapshotListener);
                this.label = 1;
                if (ProduceKt.awaitClose(producerScope, new Function0() { // from class: com.example.data.BookRepository$getSystemControl$1$$ExternalSyntheticLambda1
                    public final Object invoke() {
                        return BookRepository.C00821.invokeSuspend$lambda$1(listenerRegistrationAddSnapshotListener);
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

        static final void invokeSuspend$lambda$0(ProducerScope producerScope, DocumentSnapshot documentSnapshot, FirebaseFirestoreException firebaseFirestoreException) {
            Map mapEmptyMap;
            if (documentSnapshot == null || (mapEmptyMap = documentSnapshot.getData()) == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            producerScope.trySend-JP2dKIU(mapEmptyMap);
        }

        static final Unit invokeSuspend$lambda$1(ListenerRegistration listenerRegistration) {
            listenerRegistration.remove();
            return Unit.INSTANCE;
        }
    }

    public final Flow<Map<String, Object>> getSystemControl() {
        return FlowKt.callbackFlow(new C00821(null));
    }
}
