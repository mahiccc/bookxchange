.class final Lcom/example/data/BookRepository$getWishlistForUser$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "BookRepository.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/data/BookRepository;->getWishlistForUser(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;
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
        "Lcom/example/data/WishlistRequest;",
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
    value = "SMAP\nBookRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BookRepository.kt\ncom/example/data/BookRepository$getWishlistForUser$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,444:1\n1617#2,9:445\n1869#2:454\n1870#2:456\n1626#2:457\n1068#2:458\n1#3:455\n*S KotlinDebug\n*F\n+ 1 BookRepository.kt\ncom/example/data/BookRepository$getWishlistForUser$1\n*L\n400#1:445,9\n400#1:454\n400#1:456\n400#1:457\n403#1:458\n400#1:455\n*E\n"
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
        "Lcom/example/data/WishlistRequest;"
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
    c = "com.example.data.BookRepository$getWishlistForUser$1"
    f = "BookRepository.kt"
    i = {
        0x0,
        0x0,
        0x0
    }
    l = {
        0x195
    }
    m = "invokeSuspend"
    n = {
        "$this$callbackFlow",
        "cleanEmail",
        "listener"
    }
    s = {
        "L$0",
        "L$1",
        "L$2"
    }
.end annotation


# instance fields
.field final synthetic $userEmail:Ljava/lang/String;

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

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
            "Lcom/example/data/BookRepository$getWishlistForUser$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/data/BookRepository$getWishlistForUser$1;->$userEmail:Ljava/lang/String;

    iput-object p2, p0, Lcom/example/data/BookRepository$getWishlistForUser$1;->this$0:Lcom/example/data/BookRepository;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method static final invokeSuspend$lambda$2(Lkotlinx/coroutines/channels/ProducerScope;Lcom/google/firebase/firestore/QuerySnapshot;Lcom/google/firebase/firestore/FirebaseFirestoreException;)V
    .locals 2

    if-eqz p2, :cond_0

    .line 397
    invoke-virtual {p2}, Lcom/google/firebase/firestore/FirebaseFirestoreException;->printStackTrace()V

    return-void

    :cond_0
    if-eqz p1, :cond_3

    .line 400
    invoke-virtual {p1}, Lcom/google/firebase/firestore/QuerySnapshot;->getDocuments()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_3

    check-cast p1, Ljava/lang/Iterable;

    .line 445
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    check-cast p2, Ljava/util/Collection;

    .line 454
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 453
    check-cast v0, Lcom/google/firebase/firestore/DocumentSnapshot;

    .line 401
    :try_start_0
    const-class v1, Lcom/example/data/WishlistRequest;

    invoke-virtual {v0, v1}, Lcom/google/firebase/firestore/DocumentSnapshot;->toObject(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/example/data/WishlistRequest;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_1

    .line 453
    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 457
    :cond_2
    check-cast p2, Ljava/util/List;

    goto :goto_2

    .line 402
    :cond_3
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p2

    .line 403
    :goto_2
    check-cast p2, Ljava/lang/Iterable;

    .line 458
    new-instance p1, Lcom/example/data/BookRepository$getWishlistForUser$1$invokeSuspend$lambda$2$$inlined$sortedByDescending$1;

    invoke-direct {p1}, Lcom/example/data/BookRepository$getWishlistForUser$1$invokeSuspend$lambda$2$$inlined$sortedByDescending$1;-><init>()V

    check-cast p1, Ljava/util/Comparator;

    invoke-static {p2, p1}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    .line 403
    invoke-interface {p0, p1}, Lkotlinx/coroutines/channels/ProducerScope;->trySend-JP2dKIU(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method static final invokeSuspend$lambda$3(Lcom/google/firebase/firestore/ListenerRegistration;)Lkotlin/Unit;
    .locals 0

    .line 405
    invoke-interface {p0}, Lcom/google/firebase/firestore/ListenerRegistration;->remove()V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
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

    new-instance v0, Lcom/example/data/BookRepository$getWishlistForUser$1;

    iget-object v1, p0, Lcom/example/data/BookRepository$getWishlistForUser$1;->$userEmail:Ljava/lang/String;

    iget-object p0, p0, Lcom/example/data/BookRepository$getWishlistForUser$1;->this$0:Lcom/example/data/BookRepository;

    invoke-direct {v0, v1, p0, p2}, Lcom/example/data/BookRepository$getWishlistForUser$1;-><init>(Ljava/lang/String;Lcom/example/data/BookRepository;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/example/data/BookRepository$getWishlistForUser$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/channels/ProducerScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/data/BookRepository$getWishlistForUser$1;->invoke(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lcom/example/data/WishlistRequest;",
            ">;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/example/data/BookRepository$getWishlistForUser$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p0

    check-cast p0, Lcom/example/data/BookRepository$getWishlistForUser$1;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lcom/example/data/BookRepository$getWishlistForUser$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lcom/example/data/BookRepository$getWishlistForUser$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlinx/coroutines/channels/ProducerScope;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 386
    iget v2, p0, Lcom/example/data/BookRepository$getWishlistForUser$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lcom/example/data/BookRepository$getWishlistForUser$1;->L$2:Ljava/lang/Object;

    check-cast v0, Lcom/google/firebase/firestore/ListenerRegistration;

    iget-object p0, p0, Lcom/example/data/BookRepository$getWishlistForUser$1;->L$1:Ljava/lang/Object;

    check-cast p0, Ljava/lang/String;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 387
    iget-object p1, p0, Lcom/example/data/BookRepository$getWishlistForUser$1;->$userEmail:Ljava/lang/String;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-static {p1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 388
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p0

    invoke-interface {v0, p0}, Lkotlinx/coroutines/channels/ProducerScope;->trySend-JP2dKIU(Ljava/lang/Object;)Ljava/lang/Object;

    .line 389
    check-cast v0, Lkotlinx/coroutines/channels/SendChannel;

    const/4 p0, 0x0

    invoke-static {v0, p0, v3, p0}, Lkotlinx/coroutines/channels/SendChannel$DefaultImpls;->close$default(Lkotlinx/coroutines/channels/SendChannel;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    .line 390
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0

    .line 392
    :cond_2
    iget-object p1, p0, Lcom/example/data/BookRepository$getWishlistForUser$1;->$userEmail:Ljava/lang/String;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-static {p1}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "toLowerCase(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 393
    iget-object v2, p0, Lcom/example/data/BookRepository$getWishlistForUser$1;->this$0:Lcom/example/data/BookRepository;

    invoke-static {v2}, Lcom/example/data/BookRepository;->access$getFirestore$p(Lcom/example/data/BookRepository;)Lcom/google/firebase/firestore/FirebaseFirestore;

    move-result-object v2

    const-string v4, "wishlists"

    invoke-virtual {v2, v4}, Lcom/google/firebase/firestore/FirebaseFirestore;->collection(Ljava/lang/String;)Lcom/google/firebase/firestore/CollectionReference;

    move-result-object v2

    .line 394
    const-string v4, "userEmail"

    invoke-virtual {v2, v4, p1}, Lcom/google/firebase/firestore/CollectionReference;->whereEqualTo(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/firebase/firestore/Query;

    move-result-object v2

    .line 395
    new-instance v4, Lcom/example/data/BookRepository$getWishlistForUser$1$$ExternalSyntheticLambda0;

    invoke-direct {v4, v0}, Lcom/example/data/BookRepository$getWishlistForUser$1$$ExternalSyntheticLambda0;-><init>(Lkotlinx/coroutines/channels/ProducerScope;)V

    invoke-virtual {v2, v4}, Lcom/google/firebase/firestore/Query;->addSnapshotListener(Lcom/google/firebase/firestore/EventListener;)Lcom/google/firebase/firestore/ListenerRegistration;

    move-result-object v2

    const-string v4, "addSnapshotListener(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 405
    new-instance v4, Lcom/example/data/BookRepository$getWishlistForUser$1$$ExternalSyntheticLambda1;

    invoke-direct {v4, v2}, Lcom/example/data/BookRepository$getWishlistForUser$1$$ExternalSyntheticLambda1;-><init>(Lcom/google/firebase/firestore/ListenerRegistration;)V

    move-object v5, p0

    check-cast v5, Lkotlin/coroutines/Continuation;

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, p0, Lcom/example/data/BookRepository$getWishlistForUser$1;->L$0:Ljava/lang/Object;

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/example/data/BookRepository$getWishlistForUser$1;->L$1:Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/example/data/BookRepository$getWishlistForUser$1;->L$2:Ljava/lang/Object;

    iput v3, p0, Lcom/example/data/BookRepository$getWishlistForUser$1;->label:I

    invoke-static {v0, v4, v5}, Lkotlinx/coroutines/channels/ProduceKt;->awaitClose(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    .line 406
    :cond_3
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method
