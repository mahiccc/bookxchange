.class final Lcom/example/ui/BookViewModel$respondToSwapProposal$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "BookViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/BookViewModel;->respondToSwapProposal(Lcom/example/data/Message;Z)V
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
    c = "com.example.ui.BookViewModel$respondToSwapProposal$1"
    f = "BookViewModel.kt"
    i = {
        0x2,
        0x2
    }
    l = {
        0x14b,
        0x14d,
        0x155
    }
    m = "invokeSuspend"
    n = {
        "book",
        "updatedBook"
    }
    s = {
        "L$0",
        "L$1"
    }
.end annotation


# instance fields
.field final synthetic $accept:Z

.field final synthetic $message:Lcom/example/data/Message;

.field final synthetic $updated:Lcom/example/data/Message;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/example/ui/BookViewModel;


# direct methods
.method constructor <init>(Lcom/example/ui/BookViewModel;Lcom/example/data/Message;ZLcom/example/data/Message;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/ui/BookViewModel;",
            "Lcom/example/data/Message;",
            "Z",
            "Lcom/example/data/Message;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/ui/BookViewModel$respondToSwapProposal$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/BookViewModel$respondToSwapProposal$1;->this$0:Lcom/example/ui/BookViewModel;

    iput-object p2, p0, Lcom/example/ui/BookViewModel$respondToSwapProposal$1;->$updated:Lcom/example/data/Message;

    iput-boolean p3, p0, Lcom/example/ui/BookViewModel$respondToSwapProposal$1;->$accept:Z

    iput-object p4, p0, Lcom/example/ui/BookViewModel$respondToSwapProposal$1;->$message:Lcom/example/data/Message;

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

    new-instance v0, Lcom/example/ui/BookViewModel$respondToSwapProposal$1;

    iget-object v1, p0, Lcom/example/ui/BookViewModel$respondToSwapProposal$1;->this$0:Lcom/example/ui/BookViewModel;

    iget-object v2, p0, Lcom/example/ui/BookViewModel$respondToSwapProposal$1;->$updated:Lcom/example/data/Message;

    iget-boolean v3, p0, Lcom/example/ui/BookViewModel$respondToSwapProposal$1;->$accept:Z

    iget-object v4, p0, Lcom/example/ui/BookViewModel$respondToSwapProposal$1;->$message:Lcom/example/data/Message;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/example/ui/BookViewModel$respondToSwapProposal$1;-><init>(Lcom/example/ui/BookViewModel;Lcom/example/data/Message;ZLcom/example/data/Message;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/BookViewModel$respondToSwapProposal$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/BookViewModel$respondToSwapProposal$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p0

    check-cast p0, Lcom/example/ui/BookViewModel$respondToSwapProposal$1;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lcom/example/ui/BookViewModel$respondToSwapProposal$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 52

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 330
    iget v2, v0, Lcom/example/ui/BookViewModel$respondToSwapProposal$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v1, v0, Lcom/example/ui/BookViewModel$respondToSwapProposal$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/example/data/Book;

    iget-object v0, v0, Lcom/example/ui/BookViewModel$respondToSwapProposal$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/example/data/Book;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_1

    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 331
    iget-object v2, v0, Lcom/example/ui/BookViewModel$respondToSwapProposal$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v2}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v2

    iget-object v6, v0, Lcom/example/ui/BookViewModel$respondToSwapProposal$1;->$updated:Lcom/example/data/Message;

    move-object v7, v0

    check-cast v7, Lkotlin/coroutines/Continuation;

    iput v5, v0, Lcom/example/ui/BookViewModel$respondToSwapProposal$1;->label:I

    invoke-virtual {v2, v6, v7}, Lcom/example/data/BookRepository;->updateMessage(Lcom/example/data/Message;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    goto/16 :goto_2

    .line 332
    :cond_4
    :goto_0
    iget-boolean v2, v0, Lcom/example/ui/BookViewModel$respondToSwapProposal$1;->$accept:Z

    if-eqz v2, :cond_6

    iget-object v2, v0, Lcom/example/ui/BookViewModel$respondToSwapProposal$1;->$message:Lcom/example/data/Message;

    invoke-virtual {v2}, Lcom/example/data/Message;->getBookId()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_6

    .line 333
    iget-object v2, v0, Lcom/example/ui/BookViewModel$respondToSwapProposal$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v2}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v2

    iget-object v5, v0, Lcom/example/ui/BookViewModel$respondToSwapProposal$1;->$message:Lcom/example/data/Message;

    invoke-virtual {v5}, Lcom/example/data/Message;->getBookId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/example/data/BookRepository;->getBookById(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v2

    move-object v5, v0

    check-cast v5, Lkotlin/coroutines/Continuation;

    iput v4, v0, Lcom/example/ui/BookViewModel$respondToSwapProposal$1;->label:I

    invoke-static {v2, v5}, Lkotlinx/coroutines/flow/FlowKt;->firstOrNull(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_5

    goto/16 :goto_2

    .line 330
    :cond_5
    :goto_1
    move-object v4, v2

    check-cast v4, Lcom/example/data/Book;

    if-eqz v4, :cond_6

    .line 338
    iget-object v2, v0, Lcom/example/ui/BookViewModel$respondToSwapProposal$1;->$message:Lcom/example/data/Message;

    invoke-virtual {v2}, Lcom/example/data/Message;->getSender()Ljava/lang/String;

    move-result-object v14

    .line 339
    iget-object v2, v0, Lcom/example/ui/BookViewModel$respondToSwapProposal$1;->$message:Lcom/example/data/Message;

    invoke-virtual {v2}, Lcom/example/data/Message;->getSender()Ljava/lang/String;

    move-result-object v13

    const/16 v50, 0x7ff

    const/16 v51, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    .line 335
    const-string v15, "PENDING_TRANSFER"

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

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

    const/16 v49, -0x781

    invoke-static/range {v4 .. v51}, Lcom/example/data/Book;->copy$default(Lcom/example/data/Book;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;IILjava/lang/Object;)Lcom/example/data/Book;

    move-result-object v2

    .line 341
    iget-object v5, v0, Lcom/example/ui/BookViewModel$respondToSwapProposal$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v5}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v5

    move-object v6, v0

    check-cast v6, Lkotlin/coroutines/Continuation;

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v0, Lcom/example/ui/BookViewModel$respondToSwapProposal$1;->L$0:Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v0, Lcom/example/ui/BookViewModel$respondToSwapProposal$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcom/example/ui/BookViewModel$respondToSwapProposal$1;->label:I

    invoke-virtual {v5, v2, v6}, Lcom/example/data/BookRepository;->updateBook(Lcom/example/data/Book;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_6

    :goto_2
    return-object v1

    .line 344
    :cond_6
    :goto_3
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method
