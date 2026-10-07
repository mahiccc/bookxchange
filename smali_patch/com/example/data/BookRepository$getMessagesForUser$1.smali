.class final Lcom/example/data/BookRepository$getMessagesForUser$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "BookRepository.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/data/BookRepository;->getMessagesForUser(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/channels/ProducerScope<",
        "-",
        "Ljava/util/List<",
        "+",
        "Lcom/example/data/Message;",
        ">;>;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBookRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BookRepository.kt\ncom/example/data/BookRepository$getMessagesForUser$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,444:1\n1068#2:445\n1869#2:446\n1870#2:448\n1869#2,2:449\n1869#2,2:451\n1869#2,2:453\n1869#2,2:455\n1#3:447\n*S KotlinDebug\n*F\n+ 1 BookRepository.kt\ncom/example/data/BookRepository$getMessagesForUser$1\n*L\n186#1:445\n194#1:446\n194#1:448\n206#1:449,2\n218#1:451,2\n231#1:453,2\n244#1:455,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/channels/ProducerScope;",
        "",
        "Lcom/example/data/Message;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.example.data.BookRepository$getMessagesForUser$1"
    f = "BookRepository.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0xfc
    }
    m = "invokeSuspend"
    n = {
        "$this$callbackFlow",
        "cleanUser",
        "originalUser",
        "messagesMap",
        "l1",
        "l2",
        "l3",
        "l4",
        "l5"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5",
        "L$6",
        "L$7",
        "L$8"
    }
.end annotation


# instance fields
.field final synthetic $username:Ljava/lang/String;

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field L$7:Ljava/lang/Object;

.field L$8:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/example/data/BookRepository;


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/example/data/BookRepository;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/example/data/BookRepository;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/data/BookRepository$getMessagesForUser$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/data/BookRepository$getMessagesForUser$1;->$username:Ljava/lang/String;

    iput-object p2, p0, Lcom/example/data/BookRepository$getMessagesForUser$1;->this$0:Lcom/example/data/BookRepository;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method private static final invokeSuspend$emitSorted(Lkotlinx/coroutines/channels/ProducerScope;Ljava/util/concurrent/ConcurrentHashMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/channels/ProducerScope<",
            "-",
            "Ljava/util/List<",
            "Lcom/example/data/Message;",
            ">;>;",
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lcom/example/data/Message;",
            ">;)V"
        }
    .end annotation

    .line 186
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object p1

    const-string v0, "<get-values>(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    .line 445
    new-instance v0, Lcom/example/data/BookRepository$getMessagesForUser$1$invokeSuspend$emitSorted$$inlined$sortedByDescending$1;

    invoke-direct {v0}, Lcom/example/data/BookRepository$getMessagesForUser$1$invokeSuspend$emitSorted$$inlined$sortedByDescending$1;-><init>()V

    check-cast v0, Ljava/util/Comparator;

    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    .line 186
    invoke-interface {p0, p1}, Lkotlinx/coroutines/channels/ProducerScope;->trySend-JP2dKIU(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method static final invokeSuspend$lambda$12(Ljava/util/concurrent/ConcurrentHashMap;Lkotlinx/coroutines/channels/ProducerScope;Lcom/google/firebase/firestore/QuerySnapshot;Lcom/google/firebase/firestore/FirebaseFirestoreException;)V
    .locals 2

    if-nez p3, :cond_2

    if-eqz p2, :cond_2

    .line 231
    invoke-virtual {p2}, Lcom/google/firebase/firestore/QuerySnapshot;->getDocuments()Ljava/util/List;

    move-result-object p2

    const-string p3, "getDocuments(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Iterable;

    .line 453
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/google/firebase/firestore/DocumentSnapshot;

    .line 232
    const-class v0, Lcom/example/data/Message;

    invoke-virtual {p3, v0}, Lcom/google/firebase/firestore/DocumentSnapshot;->toObject(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/example/data/Message;

    if-eqz p3, :cond_0

    move-object v0, p0

    check-cast v0, Ljava/util/Map;

    invoke-virtual {p3}, Lcom/example/data/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 234
    :cond_1
    invoke-static {p1, p0}, Lcom/example/data/BookRepository$getMessagesForUser$1;->invokeSuspend$emitSorted(Lkotlinx/coroutines/channels/ProducerScope;Ljava/util/concurrent/ConcurrentHashMap;)V

    :cond_2
    return-void
.end method

.method static final invokeSuspend$lambda$15(Ljava/util/concurrent/ConcurrentHashMap;Lkotlinx/coroutines/channels/ProducerScope;Lcom/google/firebase/firestore/QuerySnapshot;Lcom/google/firebase/firestore/FirebaseFirestoreException;)V
    .locals 2

    if-nez p3, :cond_2

    if-eqz p2, :cond_2

    .line 244
    invoke-virtual {p2}, Lcom/google/firebase/firestore/QuerySnapshot;->getDocuments()Ljava/util/List;

    move-result-object p2

    const-string p3, "getDocuments(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Iterable;

    .line 455
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/google/firebase/firestore/DocumentSnapshot;

    .line 245
    const-class v0, Lcom/example/data/Message;

    invoke-virtual {p3, v0}, Lcom/google/firebase/firestore/DocumentSnapshot;->toObject(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/example/data/Message;

    if-eqz p3, :cond_0

    move-object v0, p0

    check-cast v0, Ljava/util/Map;

    invoke-virtual {p3}, Lcom/example/data/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 247
    :cond_1
    invoke-static {p1, p0}, Lcom/example/data/BookRepository$getMessagesForUser$1;->invokeSuspend$emitSorted(Lkotlinx/coroutines/channels/ProducerScope;Ljava/util/concurrent/ConcurrentHashMap;)V

    :cond_2
    return-void
.end method

.method static final invokeSuspend$lambda$16(Lcom/google/firebase/firestore/ListenerRegistration;Lcom/google/firebase/firestore/ListenerRegistration;Lcom/google/firebase/firestore/ListenerRegistration;Lcom/google/firebase/firestore/ListenerRegistration;Lcom/google/firebase/firestore/ListenerRegistration;)Lkotlin/Unit;
    .locals 0

    .line 253
    invoke-interface {p0}, Lcom/google/firebase/firestore/ListenerRegistration;->remove()V

    .line 254
    invoke-interface {p1}, Lcom/google/firebase/firestore/ListenerRegistration;->remove()V

    .line 255
    invoke-interface {p2}, Lcom/google/firebase/firestore/ListenerRegistration;->remove()V

    if-eqz p3, :cond_0

    .line 256
    invoke-interface {p3}, Lcom/google/firebase/firestore/ListenerRegistration;->remove()V

    :cond_0
    if-eqz p4, :cond_1

    .line 257
    invoke-interface {p4}, Lcom/google/firebase/firestore/ListenerRegistration;->remove()V

    .line 258
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method static final invokeSuspend$lambda$3(Ljava/util/concurrent/ConcurrentHashMap;Lkotlinx/coroutines/channels/ProducerScope;Lcom/google/firebase/firestore/QuerySnapshot;Lcom/google/firebase/firestore/FirebaseFirestoreException;)V
    .locals 2

    if-nez p3, :cond_2

    if-eqz p2, :cond_2

    .line 194
    invoke-virtual {p2}, Lcom/google/firebase/firestore/QuerySnapshot;->getDocuments()Ljava/util/List;

    move-result-object p2

    const-string p3, "getDocuments(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Iterable;

    .line 446
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/google/firebase/firestore/DocumentSnapshot;

    .line 195
    const-class v0, Lcom/example/data/Message;

    invoke-virtual {p3, v0}, Lcom/google/firebase/firestore/DocumentSnapshot;->toObject(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/example/data/Message;

    if-eqz p3, :cond_0

    move-object v0, p0

    check-cast v0, Ljava/util/Map;

    invoke-virtual {p3}, Lcom/example/data/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 197
    :cond_1
    invoke-static {p1, p0}, Lcom/example/data/BookRepository$getMessagesForUser$1;->invokeSuspend$emitSorted(Lkotlinx/coroutines/channels/ProducerScope;Ljava/util/concurrent/ConcurrentHashMap;)V

    :cond_2
    return-void
.end method

.method static final invokeSuspend$lambda$6(Ljava/util/concurrent/ConcurrentHashMap;Lkotlinx/coroutines/channels/ProducerScope;Lcom/google/firebase/firestore/QuerySnapshot;Lcom/google/firebase/firestore/FirebaseFirestoreException;)V
    .locals 2

    if-nez p3, :cond_2

    if-eqz p2, :cond_2

    .line 206
    invoke-virtual {p2}, Lcom/google/firebase/firestore/QuerySnapshot;->getDocuments()Ljava/util/List;

    move-result-object p2

    const-string p3, "getDocuments(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Iterable;

    .line 449
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/google/firebase/firestore/DocumentSnapshot;

    .line 207
    const-class v0, Lcom/example/data/Message;

    invoke-virtual {p3, v0}, Lcom/google/firebase/firestore/DocumentSnapshot;->toObject(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/example/data/Message;

    if-eqz p3, :cond_0

    move-object v0, p0

    check-cast v0, Ljava/util/Map;

    invoke-virtual {p3}, Lcom/example/data/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 209
    :cond_1
    invoke-static {p1, p0}, Lcom/example/data/BookRepository$getMessagesForUser$1;->invokeSuspend$emitSorted(Lkotlinx/coroutines/channels/ProducerScope;Ljava/util/concurrent/ConcurrentHashMap;)V

    :cond_2
    return-void
.end method

.method static final invokeSuspend$lambda$9(Ljava/util/concurrent/ConcurrentHashMap;Lkotlinx/coroutines/channels/ProducerScope;Lcom/google/firebase/firestore/QuerySnapshot;Lcom/google/firebase/firestore/FirebaseFirestoreException;)V
    .locals 2

    if-nez p3, :cond_2

    if-eqz p2, :cond_2

    .line 218
    invoke-virtual {p2}, Lcom/google/firebase/firestore/QuerySnapshot;->getDocuments()Ljava/util/List;

    move-result-object p2

    const-string p3, "getDocuments(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Iterable;

    .line 451
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/google/firebase/firestore/DocumentSnapshot;

    .line 219
    const-class v0, Lcom/example/data/Message;

    invoke-virtual {p3, v0}, Lcom/google/firebase/firestore/DocumentSnapshot;->toObject(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/example/data/Message;

    if-eqz p3, :cond_0

    move-object v0, p0

    check-cast v0, Ljava/util/Map;

    invoke-virtual {p3}, Lcom/example/data/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 221
    :cond_1
    invoke-static {p1, p0}, Lcom/example/data/BookRepository$getMessagesForUser$1;->invokeSuspend$emitSorted(Lkotlinx/coroutines/channels/ProducerScope;Ljava/util/concurrent/ConcurrentHashMap;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/example/data/BookRepository$getMessagesForUser$1;

    iget-object v1, p0, Lcom/example/data/BookRepository$getMessagesForUser$1;->$username:Ljava/lang/String;

    iget-object p0, p0, Lcom/example/data/BookRepository$getMessagesForUser$1;->this$0:Lcom/example/data/BookRepository;

    invoke-direct {v0, v1, p0, p2}, Lcom/example/data/BookRepository$getMessagesForUser$1;-><init>(Ljava/lang/String;Lcom/example/data/BookRepository;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/example/data/BookRepository$getMessagesForUser$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/channels/ProducerScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/data/BookRepository$getMessagesForUser$1;->invoke(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invoke(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/channels/ProducerScope<",
            "-",
            "Ljava/util/List<",
            "Lcom/example/data/Message;",
            ">;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/example/data/BookRepository$getMessagesForUser$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p0

    check-cast p0, Lcom/example/data/BookRepository$getMessagesForUser$1;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lcom/example/data/BookRepository$getMessagesForUser$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/example/data/BookRepository$getMessagesForUser$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lkotlinx/coroutines/channels/ProducerScope;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 175
    iget v3, v0, Lcom/example/data/BookRepository$getMessagesForUser$1;->label:I

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v4, :cond_0

    iget-object v1, v0, Lcom/example/data/BookRepository$getMessagesForUser$1;->L$8:Ljava/lang/Object;

    check-cast v1, Lcom/google/firebase/firestore/ListenerRegistration;

    iget-object v1, v0, Lcom/example/data/BookRepository$getMessagesForUser$1;->L$7:Ljava/lang/Object;

    check-cast v1, Lcom/google/firebase/firestore/ListenerRegistration;

    iget-object v1, v0, Lcom/example/data/BookRepository$getMessagesForUser$1;->L$6:Ljava/lang/Object;

    check-cast v1, Lcom/google/firebase/firestore/ListenerRegistration;

    iget-object v1, v0, Lcom/example/data/BookRepository$getMessagesForUser$1;->L$5:Ljava/lang/Object;

    check-cast v1, Lcom/google/firebase/firestore/ListenerRegistration;

    iget-object v1, v0, Lcom/example/data/BookRepository$getMessagesForUser$1;->L$4:Ljava/lang/Object;

    check-cast v1, Lcom/google/firebase/firestore/ListenerRegistration;

    iget-object v1, v0, Lcom/example/data/BookRepository$getMessagesForUser$1;->L$3:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v1, v0, Lcom/example/data/BookRepository$getMessagesForUser$1;->L$2:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v0, v0, Lcom/example/data/BookRepository$getMessagesForUser$1;->L$1:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 176
    iget-object v3, v0, Lcom/example/data/BookRepository$getMessagesForUser$1;->$username:Ljava/lang/String;

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v3

    const/4 v5, 0x0

    if-eqz v3, :cond_2

    .line 177
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Lkotlinx/coroutines/channels/ProducerScope;->trySend-JP2dKIU(Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    check-cast v1, Lkotlinx/coroutines/channels/SendChannel;

    invoke-static {v1, v5, v4, v5}, Lkotlinx/coroutines/channels/SendChannel$DefaultImpls;->close$default(Lkotlinx/coroutines/channels/SendChannel;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    .line 179
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 181
    :cond_2
    iget-object v3, v0, Lcom/example/data/BookRepository$getMessagesForUser$1;->$username:Ljava/lang/String;

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const-string v6, "toLowerCase(...)"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 182
    const-string v6, "shiva"

    invoke-virtual {v3, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_check_sumukesh_repo

    const-string v6, "sumukesh.ccc@gmail.com"

    goto :goto_alias_done

    :cond_check_sumukesh_repo
    const-string v6, "sumukesh"

    invoke-virtual {v3, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_default_alias_repo

    const-string v6, "chindhulurushivasumukesh@gmail.com"

    goto :goto_alias_done

    :cond_default_alias_repo
    iget-object v6, v0, Lcom/example/data/BookRepository$getMessagesForUser$1;->$username:Ljava/lang/String;

    check-cast v6, Ljava/lang/CharSequence;

    invoke-static {v6}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    :goto_alias_done

    .line 183
    new-instance v7, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v7}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 190
    iget-object v8, v0, Lcom/example/data/BookRepository$getMessagesForUser$1;->this$0:Lcom/example/data/BookRepository;

    invoke-static {v8}, Lcom/example/data/BookRepository;->access$getFirestore$p(Lcom/example/data/BookRepository;)Lcom/google/firebase/firestore/FirebaseFirestore;

    move-result-object v8

    const-string v9, "messages"

    invoke-virtual {v8, v9}, Lcom/google/firebase/firestore/FirebaseFirestore;->collection(Ljava/lang/String;)Lcom/google/firebase/firestore/CollectionReference;

    move-result-object v8

    .line 191
    const-string v10, "receiver"

    invoke-virtual {v8, v10, v3}, Lcom/google/firebase/firestore/CollectionReference;->whereEqualTo(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/firebase/firestore/Query;

    move-result-object v8

    .line 192
    new-instance v11, Lcom/example/data/BookRepository$getMessagesForUser$1$$ExternalSyntheticLambda0;

    invoke-direct {v11, v7, v1}, Lcom/example/data/BookRepository$getMessagesForUser$1$$ExternalSyntheticLambda0;-><init>(Ljava/util/concurrent/ConcurrentHashMap;Lkotlinx/coroutines/channels/ProducerScope;)V

    invoke-virtual {v8, v11}, Lcom/google/firebase/firestore/Query;->addSnapshotListener(Lcom/google/firebase/firestore/EventListener;)Lcom/google/firebase/firestore/ListenerRegistration;

    move-result-object v13

    const-string v8, "addSnapshotListener(...)"

    invoke-static {v13, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 202
    iget-object v11, v0, Lcom/example/data/BookRepository$getMessagesForUser$1;->this$0:Lcom/example/data/BookRepository;

    invoke-static {v11}, Lcom/example/data/BookRepository;->access$getFirestore$p(Lcom/example/data/BookRepository;)Lcom/google/firebase/firestore/FirebaseFirestore;

    move-result-object v11

    invoke-virtual {v11, v9}, Lcom/google/firebase/firestore/FirebaseFirestore;->collection(Ljava/lang/String;)Lcom/google/firebase/firestore/CollectionReference;

    move-result-object v11

    .line 203
    const-string v12, "sender"

    invoke-virtual {v11, v12, v3}, Lcom/google/firebase/firestore/CollectionReference;->whereEqualTo(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/firebase/firestore/Query;

    move-result-object v11

    .line 204
    new-instance v14, Lcom/example/data/BookRepository$getMessagesForUser$1$$ExternalSyntheticLambda1;

    invoke-direct {v14, v7, v1}, Lcom/example/data/BookRepository$getMessagesForUser$1$$ExternalSyntheticLambda1;-><init>(Ljava/util/concurrent/ConcurrentHashMap;Lkotlinx/coroutines/channels/ProducerScope;)V

    invoke-virtual {v11, v14}, Lcom/google/firebase/firestore/Query;->addSnapshotListener(Lcom/google/firebase/firestore/EventListener;)Lcom/google/firebase/firestore/ListenerRegistration;

    move-result-object v14

    invoke-static {v14, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 214
    iget-object v11, v0, Lcom/example/data/BookRepository$getMessagesForUser$1;->this$0:Lcom/example/data/BookRepository;

    invoke-static {v11}, Lcom/example/data/BookRepository;->access$getFirestore$p(Lcom/example/data/BookRepository;)Lcom/google/firebase/firestore/FirebaseFirestore;

    move-result-object v11

    invoke-virtual {v11, v9}, Lcom/google/firebase/firestore/FirebaseFirestore;->collection(Ljava/lang/String;)Lcom/google/firebase/firestore/CollectionReference;

    move-result-object v11

    .line 215
    const-string v15, "participants"

    invoke-virtual {v11, v15, v3}, Lcom/google/firebase/firestore/CollectionReference;->whereArrayContains(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/firebase/firestore/Query;

    move-result-object v11

    .line 216
    new-instance v15, Lcom/example/data/BookRepository$getMessagesForUser$1$$ExternalSyntheticLambda2;

    invoke-direct {v15, v7, v1}, Lcom/example/data/BookRepository$getMessagesForUser$1$$ExternalSyntheticLambda2;-><init>(Ljava/util/concurrent/ConcurrentHashMap;Lkotlinx/coroutines/channels/ProducerScope;)V

    invoke-virtual {v11, v15}, Lcom/google/firebase/firestore/Query;->addSnapshotListener(Lcom/google/firebase/firestore/EventListener;)Lcom/google/firebase/firestore/ListenerRegistration;

    move-result-object v15

    invoke-static {v15, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 226
    invoke-static {v6, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3

    .line 227
    iget-object v8, v0, Lcom/example/data/BookRepository$getMessagesForUser$1;->this$0:Lcom/example/data/BookRepository;

    invoke-static {v8}, Lcom/example/data/BookRepository;->access$getFirestore$p(Lcom/example/data/BookRepository;)Lcom/google/firebase/firestore/FirebaseFirestore;

    move-result-object v8

    invoke-virtual {v8, v9}, Lcom/google/firebase/firestore/FirebaseFirestore;->collection(Ljava/lang/String;)Lcom/google/firebase/firestore/CollectionReference;

    move-result-object v8

    .line 228
    invoke-virtual {v8, v10, v6}, Lcom/google/firebase/firestore/CollectionReference;->whereEqualTo(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/firebase/firestore/Query;

    move-result-object v8

    .line 229
    new-instance v10, Lcom/example/data/BookRepository$getMessagesForUser$1$$ExternalSyntheticLambda3;

    invoke-direct {v10, v7, v1}, Lcom/example/data/BookRepository$getMessagesForUser$1$$ExternalSyntheticLambda3;-><init>(Ljava/util/concurrent/ConcurrentHashMap;Lkotlinx/coroutines/channels/ProducerScope;)V

    invoke-virtual {v8, v10}, Lcom/google/firebase/firestore/Query;->addSnapshotListener(Lcom/google/firebase/firestore/EventListener;)Lcom/google/firebase/firestore/ListenerRegistration;

    move-result-object v8

    move-object/from16 v16, v8

    goto :goto_0

    :cond_3
    move-object/from16 v16, v5

    .line 239
    :goto_0
    invoke-static {v6, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_4

    .line 240
    iget-object v5, v0, Lcom/example/data/BookRepository$getMessagesForUser$1;->this$0:Lcom/example/data/BookRepository;

    invoke-static {v5}, Lcom/example/data/BookRepository;->access$getFirestore$p(Lcom/example/data/BookRepository;)Lcom/google/firebase/firestore/FirebaseFirestore;

    move-result-object v5

    invoke-virtual {v5, v9}, Lcom/google/firebase/firestore/FirebaseFirestore;->collection(Ljava/lang/String;)Lcom/google/firebase/firestore/CollectionReference;

    move-result-object v5

    .line 241
    invoke-virtual {v5, v12, v6}, Lcom/google/firebase/firestore/CollectionReference;->whereEqualTo(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/firebase/firestore/Query;

    move-result-object v5

    .line 242
    new-instance v8, Lcom/example/data/BookRepository$getMessagesForUser$1$$ExternalSyntheticLambda4;

    invoke-direct {v8, v7, v1}, Lcom/example/data/BookRepository$getMessagesForUser$1$$ExternalSyntheticLambda4;-><init>(Ljava/util/concurrent/ConcurrentHashMap;Lkotlinx/coroutines/channels/ProducerScope;)V

    invoke-virtual {v5, v8}, Lcom/google/firebase/firestore/Query;->addSnapshotListener(Lcom/google/firebase/firestore/EventListener;)Lcom/google/firebase/firestore/ListenerRegistration;

    move-result-object v5

    :cond_4
    move-object/from16 v17, v5

    .line 252
    new-instance v12, Lcom/example/data/BookRepository$getMessagesForUser$1$$ExternalSyntheticLambda5;

    invoke-direct/range {v12 .. v17}, Lcom/example/data/BookRepository$getMessagesForUser$1$$ExternalSyntheticLambda5;-><init>(Lcom/google/firebase/firestore/ListenerRegistration;Lcom/google/firebase/firestore/ListenerRegistration;Lcom/google/firebase/firestore/ListenerRegistration;Lcom/google/firebase/firestore/ListenerRegistration;Lcom/google/firebase/firestore/ListenerRegistration;)V

    move-object v5, v0

    check-cast v5, Lkotlin/coroutines/Continuation;

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v0, Lcom/example/data/BookRepository$getMessagesForUser$1;->L$0:Ljava/lang/Object;

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v0, Lcom/example/data/BookRepository$getMessagesForUser$1;->L$1:Ljava/lang/Object;

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v0, Lcom/example/data/BookRepository$getMessagesForUser$1;->L$2:Ljava/lang/Object;

    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v0, Lcom/example/data/BookRepository$getMessagesForUser$1;->L$3:Ljava/lang/Object;

    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v0, Lcom/example/data/BookRepository$getMessagesForUser$1;->L$4:Ljava/lang/Object;

    invoke-static {v14}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v0, Lcom/example/data/BookRepository$getMessagesForUser$1;->L$5:Ljava/lang/Object;

    invoke-static {v15}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v0, Lcom/example/data/BookRepository$getMessagesForUser$1;->L$6:Ljava/lang/Object;

    invoke-static/range {v16 .. v16}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v0, Lcom/example/data/BookRepository$getMessagesForUser$1;->L$7:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v0, Lcom/example/data/BookRepository$getMessagesForUser$1;->L$8:Ljava/lang/Object;

    iput v4, v0, Lcom/example/data/BookRepository$getMessagesForUser$1;->label:I

    invoke-static {v1, v12, v5}, Lkotlinx/coroutines/channels/ProduceKt;->awaitClose(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_5

    return-object v2

    .line 259
    :cond_5
    :goto_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method
