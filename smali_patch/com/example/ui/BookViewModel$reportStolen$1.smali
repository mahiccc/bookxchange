.class final Lcom/example/ui/BookViewModel$reportStolen$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "BookViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/BookViewModel;->reportStolen(Lcom/example/data/Book;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBookViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BookViewModel.kt\ncom/example/ui/BookViewModel$reportStolen$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1363:1\n774#2:1364\n865#2,2:1365\n*S KotlinDebug\n*F\n+ 1 BookViewModel.kt\ncom/example/ui/BookViewModel$reportStolen$1\n*L\n926#1:1364\n926#1:1365,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
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
    c = "com.example.ui.BookViewModel$reportStolen$1"
    f = "BookViewModel.kt"
    i = {
        0x0,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2
    }
    l = {
        0x399,
        0x39b,
        0x39f
    }
    m = "invokeSuspend"
    n = {
        "borrower",
        "borrower",
        "bUser",
        "borrower",
        "bUser",
        "updated"
    }
    s = {
        "L$0",
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$2"
    }
.end annotation


# instance fields
.field final synthetic $book:Lcom/example/data/Book;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/example/ui/BookViewModel;


# direct methods
.method constructor <init>(Lcom/example/data/Book;Lcom/example/ui/BookViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/data/Book;",
            "Lcom/example/ui/BookViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/ui/BookViewModel$reportStolen$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/BookViewModel$reportStolen$1;->$book:Lcom/example/data/Book;

    iput-object p2, p0, Lcom/example/ui/BookViewModel$reportStolen$1;->this$0:Lcom/example/ui/BookViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1
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

    new-instance p1, Lcom/example/ui/BookViewModel$reportStolen$1;

    iget-object v0, p0, Lcom/example/ui/BookViewModel$reportStolen$1;->$book:Lcom/example/data/Book;

    iget-object p0, p0, Lcom/example/ui/BookViewModel$reportStolen$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-direct {p1, v0, p0, p2}, Lcom/example/ui/BookViewModel$reportStolen$1;-><init>(Lcom/example/data/Book;Lcom/example/ui/BookViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/BookViewModel$reportStolen$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/BookViewModel$reportStolen$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p0

    check-cast p0, Lcom/example/ui/BookViewModel$reportStolen$1;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lcom/example/ui/BookViewModel$reportStolen$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 55

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 919
    iget v2, v0, Lcom/example/ui/BookViewModel$reportStolen$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v1, v0, Lcom/example/ui/BookViewModel$reportStolen$1;->L$2:Ljava/lang/Object;

    check-cast v1, Lcom/example/data/Book;

    iget-object v1, v0, Lcom/example/ui/BookViewModel$reportStolen$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/example/data/User;

    iget-object v0, v0, Lcom/example/ui/BookViewModel$reportStolen$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v2, v0, Lcom/example/ui/BookViewModel$reportStolen$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcom/example/data/User;

    iget-object v4, v0, Lcom/example/ui/BookViewModel$reportStolen$1;->L$0:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_2
    iget-object v2, v0, Lcom/example/ui/BookViewModel$reportStolen$1;->L$0:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v5, p1

    goto :goto_0

    :cond_3
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 920
    iget-object v2, v0, Lcom/example/ui/BookViewModel$reportStolen$1;->$book:Lcom/example/data/Book;

    invoke-virtual {v2}, Lcom/example/data/Book;->getBorrowerName()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_4

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 921
    :cond_4
    iget-object v6, v0, Lcom/example/ui/BookViewModel$reportStolen$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v6}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v6

    invoke-virtual {v6, v2}, Lcom/example/data/BookRepository;->getUser(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v6

    move-object v7, v0

    check-cast v7, Lkotlin/coroutines/Continuation;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v0, Lcom/example/ui/BookViewModel$reportStolen$1;->L$0:Ljava/lang/Object;

    iput v5, v0, Lcom/example/ui/BookViewModel$reportStolen$1;->label:I

    invoke-static {v6, v7}, Lkotlinx/coroutines/flow/FlowKt;->firstOrNull(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_5

    goto/16 :goto_3

    .line 919
    :cond_5
    :goto_0
    move-object v6, v5

    check-cast v6, Lcom/example/data/User;

    if-eqz v6, :cond_7

    .line 923
    iget-object v5, v0, Lcom/example/ui/BookViewModel$reportStolen$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v5}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v5

    const/16 v19, 0x7fb

    const/16 v20, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    invoke-static/range {v6 .. v20}, Lcom/example/data/User;->copy$default(Lcom/example/data/User;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;IIDILjava/lang/Object;)Lcom/example/data/User;

    move-result-object v7

    move-object v8, v0

    check-cast v8, Lkotlin/coroutines/Continuation;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v0, Lcom/example/ui/BookViewModel$reportStolen$1;->L$0:Ljava/lang/Object;

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v0, Lcom/example/ui/BookViewModel$reportStolen$1;->L$1:Ljava/lang/Object;

    iput v4, v0, Lcom/example/ui/BookViewModel$reportStolen$1;->label:I

    invoke-virtual {v5, v7, v8}, Lcom/example/data/BookRepository;->updateUser(Lcom/example/data/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_6

    goto/16 :goto_3

    :cond_6
    move-object v4, v2

    move-object v2, v6

    :goto_1
    move-object v6, v2

    move-object v2, v4

    .line 925
    :cond_7
    iget-object v7, v0, Lcom/example/ui/BookViewModel$reportStolen$1;->$book:Lcom/example/data/Book;

    const/16 v53, 0x7ef

    const/16 v54, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-string v18, "AVAILABLE"

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const v52, -0x300701

    invoke-static/range {v7 .. v54}, Lcom/example/data/Book;->copy$default(Lcom/example/data/Book;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;IILjava/lang/Object;)Lcom/example/data/Book;

    move-result-object v4

    .line 926
    iget-object v5, v0, Lcom/example/ui/BookViewModel$reportStolen$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v5}, Lcom/example/ui/BookViewModel;->access$get_localOptimisticBooks$p(Lcom/example/ui/BookViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v5

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/util/Collection;

    iget-object v8, v0, Lcom/example/ui/BookViewModel$reportStolen$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v8}, Lcom/example/ui/BookViewModel;->access$get_localOptimisticBooks$p(Lcom/example/ui/BookViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v8

    invoke-interface {v8}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Iterable;

    .line 1364
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    check-cast v9, Ljava/util/Collection;

    .line 1365
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_8
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_9

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v11, v10

    check-cast v11, Lcom/example/data/Book;

    .line 926
    invoke-virtual {v11}, Lcom/example/data/Book;->getId()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v4}, Lcom/example/data/Book;->getId()Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_8

    .line 1365
    invoke-interface {v9, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 1366
    :cond_9
    check-cast v9, Ljava/util/List;

    .line 1364
    check-cast v9, Ljava/lang/Iterable;

    .line 926
    invoke-static {v7, v9}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v7

    invoke-interface {v5, v7}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 927
    iget-object v5, v0, Lcom/example/ui/BookViewModel$reportStolen$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v5}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v5

    move-object v7, v0

    check-cast v7, Lkotlin/coroutines/Continuation;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lcom/example/ui/BookViewModel$reportStolen$1;->L$0:Ljava/lang/Object;

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lcom/example/ui/BookViewModel$reportStolen$1;->L$1:Ljava/lang/Object;

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lcom/example/ui/BookViewModel$reportStolen$1;->L$2:Ljava/lang/Object;

    iput v3, v0, Lcom/example/ui/BookViewModel$reportStolen$1;->label:I

    invoke-virtual {v5, v4, v7}, Lcom/example/data/BookRepository;->updateBook(Lcom/example/data/Book;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_a

    :goto_3
    return-object v1

    .line 928
    :cond_a
    :goto_4
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method
