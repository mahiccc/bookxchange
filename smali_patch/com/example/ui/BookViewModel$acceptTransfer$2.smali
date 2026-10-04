.class final Lcom/example/ui/BookViewModel$acceptTransfer$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "BookViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/BookViewModel;->acceptTransfer(Lcom/example/data/Book;)V
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
    c = "com.example.ui.BookViewModel$acceptTransfer$2"
    f = "BookViewModel.kt"
    i = {
        0x2,
        0x3,
        0x4,
        0x4
    }
    l = {
        0x2ef,
        0x2f0,
        0x2f2,
        0x2f4,
        0x2f6
    }
    m = "invokeSuspend"
    n = {
        "ownerUser",
        "ownerUser",
        "ownerUser",
        "borrowerUser"
    }
    s = {
        "L$0",
        "L$0",
        "L$0",
        "L$1"
    }
.end annotation


# instance fields
.field final synthetic $book:Lcom/example/data/Book;

.field final synthetic $borrower:Ljava/lang/String;

.field final synthetic $updated:Lcom/example/data/Book;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/example/ui/BookViewModel;


# direct methods
.method constructor <init>(Lcom/example/ui/BookViewModel;Lcom/example/data/Book;Lcom/example/data/Book;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/ui/BookViewModel;",
            "Lcom/example/data/Book;",
            "Lcom/example/data/Book;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/ui/BookViewModel$acceptTransfer$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/BookViewModel$acceptTransfer$2;->this$0:Lcom/example/ui/BookViewModel;

    iput-object p2, p0, Lcom/example/ui/BookViewModel$acceptTransfer$2;->$updated:Lcom/example/data/Book;

    iput-object p3, p0, Lcom/example/ui/BookViewModel$acceptTransfer$2;->$book:Lcom/example/data/Book;

    iput-object p4, p0, Lcom/example/ui/BookViewModel$acceptTransfer$2;->$borrower:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6
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

    new-instance v0, Lcom/example/ui/BookViewModel$acceptTransfer$2;

    iget-object v1, p0, Lcom/example/ui/BookViewModel$acceptTransfer$2;->this$0:Lcom/example/ui/BookViewModel;

    iget-object v2, p0, Lcom/example/ui/BookViewModel$acceptTransfer$2;->$updated:Lcom/example/data/Book;

    iget-object v3, p0, Lcom/example/ui/BookViewModel$acceptTransfer$2;->$book:Lcom/example/data/Book;

    iget-object v4, p0, Lcom/example/ui/BookViewModel$acceptTransfer$2;->$borrower:Ljava/lang/String;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/example/ui/BookViewModel$acceptTransfer$2;-><init>(Lcom/example/ui/BookViewModel;Lcom/example/data/Book;Lcom/example/data/Book;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/BookViewModel$acceptTransfer$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/BookViewModel$acceptTransfer$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p0

    check-cast p0, Lcom/example/ui/BookViewModel$acceptTransfer$2;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lcom/example/ui/BookViewModel$acceptTransfer$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 750
    iget v2, v0, Lcom/example/ui/BookViewModel$acceptTransfer$2;->label:I

    const/4 v3, 0x5

    const/4 v4, 0x4

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x3

    if-eqz v2, :cond_5

    if-eq v2, v6, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v7, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v1, v0, Lcom/example/ui/BookViewModel$acceptTransfer$2;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/example/data/User;

    iget-object v1, v0, Lcom/example/ui/BookViewModel$acceptTransfer$2;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/example/data/User;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v2, v0, Lcom/example/ui/BookViewModel$acceptTransfer$2;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/example/data/User;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v4, p1

    goto/16 :goto_3

    :cond_2
    iget-object v2, v0, Lcom/example/ui/BookViewModel$acceptTransfer$2;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/example/data/User;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_3
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_1

    :cond_4
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_5
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 751
    iget-object v2, v0, Lcom/example/ui/BookViewModel$acceptTransfer$2;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v2}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v2

    iget-object v8, v0, Lcom/example/ui/BookViewModel$acceptTransfer$2;->$updated:Lcom/example/data/Book;

    move-object v9, v0

    check-cast v9, Lkotlin/coroutines/Continuation;

    iput v6, v0, Lcom/example/ui/BookViewModel$acceptTransfer$2;->label:I

    invoke-virtual {v2, v8, v9}, Lcom/example/data/BookRepository;->updateBook(Lcom/example/data/Book;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_6

    goto/16 :goto_4

    .line 752
    :cond_6
    :goto_0
    iget-object v2, v0, Lcom/example/ui/BookViewModel$acceptTransfer$2;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v2}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v2

    iget-object v6, v0, Lcom/example/ui/BookViewModel$acceptTransfer$2;->$book:Lcom/example/data/Book;

    invoke-virtual {v6}, Lcom/example/data/Book;->getOwnerName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Lcom/example/data/BookRepository;->getUser(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v2

    move-object v6, v0

    check-cast v6, Lkotlin/coroutines/Continuation;

    iput v5, v0, Lcom/example/ui/BookViewModel$acceptTransfer$2;->label:I

    invoke-static {v2, v6}, Lkotlinx/coroutines/flow/FlowKt;->firstOrNull(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_7

    goto/16 :goto_4

    .line 750
    :cond_7
    :goto_1
    move-object v8, v2

    check-cast v8, Lcom/example/data/User;

    if-eqz v8, :cond_8

    .line 754
    iget-object v2, v0, Lcom/example/ui/BookViewModel$acceptTransfer$2;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v2}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v2

    invoke-virtual {v8}, Lcom/example/data/User;->getTrustScore()I

    move-result v5

    add-int/lit8 v11, v5, 0x3

    const/16 v21, 0x7fb

    const/16 v22, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    invoke-static/range {v8 .. v22}, Lcom/example/data/User;->copy$default(Lcom/example/data/User;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;IIDILjava/lang/Object;)Lcom/example/data/User;

    move-result-object v5

    move-object v6, v0

    check-cast v6, Lkotlin/coroutines/Continuation;

    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v0, Lcom/example/ui/BookViewModel$acceptTransfer$2;->L$0:Ljava/lang/Object;

    iput v7, v0, Lcom/example/ui/BookViewModel$acceptTransfer$2;->label:I

    invoke-virtual {v2, v5, v6}, Lcom/example/data/BookRepository;->updateUser(Lcom/example/data/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_8

    goto :goto_4

    :cond_8
    move-object v2, v8

    .line 756
    :goto_2
    iget-object v5, v0, Lcom/example/ui/BookViewModel$acceptTransfer$2;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v5}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v5

    iget-object v6, v0, Lcom/example/ui/BookViewModel$acceptTransfer$2;->$borrower:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lcom/example/data/BookRepository;->getUser(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v5

    move-object v6, v0

    check-cast v6, Lkotlin/coroutines/Continuation;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v0, Lcom/example/ui/BookViewModel$acceptTransfer$2;->L$0:Ljava/lang/Object;

    iput v4, v0, Lcom/example/ui/BookViewModel$acceptTransfer$2;->label:I

    invoke-static {v5, v6}, Lkotlinx/coroutines/flow/FlowKt;->firstOrNull(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_9

    goto :goto_4

    .line 750
    :cond_9
    :goto_3
    move-object v8, v4

    check-cast v8, Lcom/example/data/User;

    if-eqz v8, :cond_a

    .line 758
    iget-object v4, v0, Lcom/example/ui/BookViewModel$acceptTransfer$2;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v4}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v4

    invoke-virtual {v8}, Lcom/example/data/User;->getTrustScore()I

    move-result v5

    add-int/lit8 v11, v5, 0x3

    const/16 v21, 0x7fb

    const/16 v22, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    invoke-static/range {v8 .. v22}, Lcom/example/data/User;->copy$default(Lcom/example/data/User;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;IIDILjava/lang/Object;)Lcom/example/data/User;

    move-result-object v5

    move-object v6, v0

    check-cast v6, Lkotlin/coroutines/Continuation;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lcom/example/ui/BookViewModel$acceptTransfer$2;->L$0:Ljava/lang/Object;

    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lcom/example/ui/BookViewModel$acceptTransfer$2;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcom/example/ui/BookViewModel$acceptTransfer$2;->label:I

    invoke-virtual {v4, v5, v6}, Lcom/example/data/BookRepository;->updateUser(Lcom/example/data/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_a

    :goto_4
    return-object v1

    .line 760
    :cond_a
    :goto_5
    iget-object v1, v0, Lcom/example/ui/BookViewModel$acceptTransfer$2;->this$0:Lcom/example/ui/BookViewModel;

    .line 761
    iget-object v2, v0, Lcom/example/ui/BookViewModel$acceptTransfer$2;->$book:Lcom/example/data/Book;

    invoke-virtual {v2}, Lcom/example/data/Book;->getId()Ljava/lang/String;

    move-result-object v2

    .line 762
    iget-object v3, v0, Lcom/example/ui/BookViewModel$acceptTransfer$2;->$book:Lcom/example/data/Book;

    invoke-virtual {v3}, Lcom/example/data/Book;->getOwnerName()Ljava/lang/String;

    move-result-object v3

    .line 763
    iget-object v0, v0, Lcom/example/ui/BookViewModel$acceptTransfer$2;->$book:Lcom/example/data/Book;

    invoke-virtual {v0}, Lcom/example/data/Book;->getTitle()Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Borrower accepted the handover photo! \'"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, "\' is now officially borrowed."

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 760
    invoke-virtual {v1, v2, v3, v0}, Lcom/example/ui/BookViewModel;->sendMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 765
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method
