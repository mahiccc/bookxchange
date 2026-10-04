.class final Lcom/example/ui/BookViewModel$confirmHandover$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "BookViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/BookViewModel;->confirmHandover(Ljava/lang/String;Ljava/lang/String;)V
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
    c = "com.example.ui.BookViewModel$confirmHandover$1"
    f = "BookViewModel.kt"
    i = {
        0x1,
        0x1,
        0x2,
        0x2,
        0x3,
        0x3,
        0x3,
        0x4,
        0x4,
        0x4,
        0x5,
        0x5,
        0x5,
        0x5,
        0x6,
        0x6,
        0x6,
        0x6,
        0x6
    }
    l = {
        0x19d,
        0x1a5,
        0x1a7,
        0x1a9,
        0x1af,
        0x1b1,
        0x1bf
    }
    m = "invokeSuspend"
    n = {
        "book",
        "updatedBook",
        "book",
        "updatedBook",
        "book",
        "updatedBook",
        "user",
        "book",
        "updatedBook",
        "user",
        "book",
        "updatedBook",
        "user",
        "owner",
        "book",
        "updatedBook",
        "user",
        "owner",
        "msg"
    }
    s = {
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$2",
        "L$0",
        "L$1",
        "L$2",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4"
    }
.end annotation


# instance fields
.field final synthetic $bookId:Ljava/lang/String;

.field final synthetic $otherPartyEmail:Ljava/lang/String;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/example/ui/BookViewModel;


# direct methods
.method constructor <init>(Lcom/example/ui/BookViewModel;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/ui/BookViewModel;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/ui/BookViewModel$confirmHandover$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/BookViewModel$confirmHandover$1;->this$0:Lcom/example/ui/BookViewModel;

    iput-object p2, p0, Lcom/example/ui/BookViewModel$confirmHandover$1;->$bookId:Ljava/lang/String;

    iput-object p3, p0, Lcom/example/ui/BookViewModel$confirmHandover$1;->$otherPartyEmail:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

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

    new-instance p1, Lcom/example/ui/BookViewModel$confirmHandover$1;

    iget-object v0, p0, Lcom/example/ui/BookViewModel$confirmHandover$1;->this$0:Lcom/example/ui/BookViewModel;

    iget-object v1, p0, Lcom/example/ui/BookViewModel$confirmHandover$1;->$bookId:Ljava/lang/String;

    iget-object p0, p0, Lcom/example/ui/BookViewModel$confirmHandover$1;->$otherPartyEmail:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p0, p2}, Lcom/example/ui/BookViewModel$confirmHandover$1;-><init>(Lcom/example/ui/BookViewModel;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/BookViewModel$confirmHandover$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/BookViewModel$confirmHandover$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p0

    check-cast p0, Lcom/example/ui/BookViewModel$confirmHandover$1;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lcom/example/ui/BookViewModel$confirmHandover$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 56

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 412
    iget v2, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->label:I

    const-wide v3, 0x4075e00000000000L    # 350.0

    const/4 v5, 0x2

    const/4 v6, 0x1

    packed-switch v2, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v1, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->L$4:Ljava/lang/Object;

    check-cast v1, Lcom/example/data/Message;

    iget-object v1, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->L$3:Ljava/lang/Object;

    check-cast v1, Lcom/example/data/User;

    iget-object v1, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->L$2:Ljava/lang/Object;

    check-cast v1, Lcom/example/data/User;

    iget-object v1, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/example/data/Book;

    iget-object v0, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/example/data/Book;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_8

    :pswitch_1
    iget-object v2, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->L$3:Ljava/lang/Object;

    check-cast v2, Lcom/example/data/User;

    iget-object v3, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->L$2:Ljava/lang/Object;

    check-cast v3, Lcom/example/data/User;

    iget-object v4, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->L$1:Ljava/lang/Object;

    check-cast v4, Lcom/example/data/Book;

    iget-object v7, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lcom/example/data/Book;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_2
    iget-object v2, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->L$2:Ljava/lang/Object;

    check-cast v2, Lcom/example/data/User;

    iget-object v7, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->L$1:Ljava/lang/Object;

    check-cast v7, Lcom/example/data/Book;

    iget-object v8, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->L$0:Ljava/lang/Object;

    check-cast v8, Lcom/example/data/Book;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v9, v8

    move-object/from16 v8, p1

    goto/16 :goto_4

    :pswitch_3
    iget-object v2, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->L$2:Ljava/lang/Object;

    check-cast v2, Lcom/example/data/User;

    iget-object v7, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->L$1:Ljava/lang/Object;

    check-cast v7, Lcom/example/data/Book;

    iget-object v8, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->L$0:Ljava/lang/Object;

    check-cast v8, Lcom/example/data/Book;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_4
    iget-object v2, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcom/example/data/Book;

    iget-object v7, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lcom/example/data/Book;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v8, v7

    move-object v7, v2

    move-object v2, v8

    move-object/from16 v8, p1

    goto/16 :goto_2

    :pswitch_5
    iget-object v2, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcom/example/data/Book;

    iget-object v7, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lcom/example/data/Book;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_6
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_0

    :pswitch_7
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 413
    iget-object v2, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v2}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v2

    iget-object v7, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->$bookId:Ljava/lang/String;

    invoke-virtual {v2, v7}, Lcom/example/data/BookRepository;->getBookById(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v2

    move-object v7, v0

    check-cast v7, Lkotlin/coroutines/Continuation;

    iput v6, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->label:I

    invoke-static {v2, v7}, Lkotlinx/coroutines/flow/FlowKt;->firstOrNull(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_0

    goto/16 :goto_7

    :cond_0
    :goto_0
    move-object v7, v2

    check-cast v7, Lcom/example/data/Book;

    if-nez v7, :cond_1

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 418
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 419
    invoke-virtual {v7}, Lcom/example/data/Book;->getRentCount()I

    move-result v2

    add-int/lit8 v37, v2, 0x1

    .line 417
    iget-object v2, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->$otherPartyEmail:Ljava/lang/String;

    .line 418
    invoke-static {v8, v9}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    move-result-object v45

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

    const/16 v17, 0x0

    .line 414
    const-string v18, "BORROWED"

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

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const v52, -0x10000581

    move-object/from16 v16, v2

    invoke-static/range {v7 .. v54}, Lcom/example/data/Book;->copy$default(Lcom/example/data/Book;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;IILjava/lang/Object;)Lcom/example/data/Book;

    move-result-object v2

    .line 421
    iget-object v8, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v8}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v8

    move-object v9, v0

    check-cast v9, Lkotlin/coroutines/Continuation;

    iput-object v7, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->L$0:Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->L$1:Ljava/lang/Object;

    iput v5, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->label:I

    invoke-virtual {v8, v2, v9}, Lcom/example/data/BookRepository;->updateBook(Lcom/example/data/Book;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v1, :cond_2

    goto/16 :goto_7

    .line 423
    :cond_2
    :goto_1
    iget-object v8, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v8}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v8

    iget-object v9, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->$otherPartyEmail:Ljava/lang/String;

    invoke-virtual {v8, v9}, Lcom/example/data/BookRepository;->getUser(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v8

    move-object v9, v0

    check-cast v9, Lkotlin/coroutines/Continuation;

    iput-object v7, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->L$0:Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->L$1:Ljava/lang/Object;

    const/4 v10, 0x3

    iput v10, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->label:I

    invoke-static {v8, v9}, Lkotlinx/coroutines/flow/FlowKt;->firstOrNull(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v1, :cond_3

    goto/16 :goto_7

    :cond_3
    move-object/from16 v55, v7

    move-object v7, v2

    move-object/from16 v2, v55

    .line 412
    :goto_2
    move-object v9, v8

    check-cast v9, Lcom/example/data/User;

    if-eqz v9, :cond_5

    .line 425
    iget-object v8, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v8}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v8

    .line 426
    invoke-virtual {v9}, Lcom/example/data/User;->getCompletedSwaps()I

    move-result v10

    add-int/lit8 v13, v10, 0x1

    .line 427
    invoke-virtual {v9}, Lcom/example/data/User;->getBooksReadThisYear()I

    move-result v10

    add-int/lit8 v19, v10, 0x1

    .line 428
    invoke-virtual {v9}, Lcom/example/data/User;->getTotalMoneySaved()D

    move-result-wide v10

    add-double v20, v10, v3

    const/16 v22, 0x1f7

    const/16 v23, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    .line 425
    invoke-static/range {v9 .. v23}, Lcom/example/data/User;->copy$default(Lcom/example/data/User;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;IIDILjava/lang/Object;)Lcom/example/data/User;

    move-result-object v10

    move-object v11, v0

    check-cast v11, Lkotlin/coroutines/Continuation;

    iput-object v2, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->L$0:Ljava/lang/Object;

    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->L$1:Ljava/lang/Object;

    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->L$2:Ljava/lang/Object;

    const/4 v12, 0x4

    iput v12, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->label:I

    invoke-virtual {v8, v10, v11}, Lcom/example/data/BookRepository;->updateUser(Lcom/example/data/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v1, :cond_4

    goto/16 :goto_7

    :cond_4
    move-object v8, v2

    move-object v2, v9

    :goto_3
    move-object v9, v2

    move-object v2, v8

    .line 431
    :cond_5
    iget-object v8, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v8}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v8

    invoke-virtual {v2}, Lcom/example/data/Book;->getOwnerName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Lcom/example/data/BookRepository;->getUser(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v8

    move-object v10, v0

    check-cast v10, Lkotlin/coroutines/Continuation;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->L$0:Ljava/lang/Object;

    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->L$1:Ljava/lang/Object;

    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->L$2:Ljava/lang/Object;

    const/4 v11, 0x5

    iput v11, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->label:I

    invoke-static {v8, v10}, Lkotlinx/coroutines/flow/FlowKt;->firstOrNull(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v1, :cond_6

    goto/16 :goto_7

    :cond_6
    move-object/from16 v55, v9

    move-object v9, v2

    move-object/from16 v2, v55

    .line 412
    :goto_4
    move-object v10, v8

    check-cast v10, Lcom/example/data/User;

    if-eqz v10, :cond_8

    .line 433
    iget-object v8, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v8}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v8

    .line 434
    invoke-virtual {v10}, Lcom/example/data/User;->getCompletedSwaps()I

    move-result v11

    add-int/lit8 v14, v11, 0x1

    .line 435
    invoke-virtual {v10}, Lcom/example/data/User;->getTotalMoneySaved()D

    move-result-wide v11

    add-double v21, v11, v3

    const/16 v23, 0x3f7

    const/16 v24, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    .line 433
    invoke-static/range {v10 .. v24}, Lcom/example/data/User;->copy$default(Lcom/example/data/User;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;IIDILjava/lang/Object;)Lcom/example/data/User;

    move-result-object v3

    move-object v4, v0

    check-cast v4, Lkotlin/coroutines/Continuation;

    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->L$0:Ljava/lang/Object;

    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->L$1:Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->L$2:Ljava/lang/Object;

    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->L$3:Ljava/lang/Object;

    const/4 v11, 0x6

    iput v11, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->label:I

    invoke-virtual {v8, v3, v4}, Lcom/example/data/BookRepository;->updateUser(Lcom/example/data/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_7

    goto/16 :goto_7

    :cond_7
    move-object v3, v2

    move-object v4, v7

    move-object v7, v9

    move-object v2, v10

    :goto_5
    move-object v10, v2

    move-object v2, v3

    move-object v9, v7

    move-object v7, v4

    .line 439
    :cond_8
    new-instance v11, Lcom/example/data/Message;

    .line 440
    iget-object v13, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->$bookId:Ljava/lang/String;

    .line 441
    iget-object v3, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-virtual {v3}, Lcom/example/ui/BookViewModel;->getCurrentUser()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v3

    invoke-interface {v3}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, ""

    if-nez v3, :cond_9

    move-object v3, v4

    :cond_9
    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v14

    const-string v3, "toLowerCase(...)"

    invoke-static {v14, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 442
    iget-object v8, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->$otherPartyEmail:Ljava/lang/String;

    sget-object v12, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v8, v12}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 443
    new-array v5, v5, [Ljava/lang/String;

    iget-object v8, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-virtual {v8}, Lcom/example/ui/BookViewModel;->getCurrentUser()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v8

    invoke-interface {v8}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    if-nez v8, :cond_a

    goto :goto_6

    :cond_a
    move-object v4, v8

    :goto_6
    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v4, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v8, 0x0

    aput-object v4, v5, v8

    iget-object v4, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->$otherPartyEmail:Ljava/lang/String;

    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v4, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    aput-object v4, v5, v6

    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->distinct(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v16

    const v31, 0x3fec1

    const/16 v32, 0x0

    const/4 v12, 0x0

    .line 439
    const-string v17, "\ud83c\udf89 Book handover successfully verified and completed! Happy reading!"

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const-string v21, "HANDOVER_PIN"

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-direct/range {v11 .. v32}, Lcom/example/data/Message;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 447
    iget-object v3, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v3}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v3

    move-object v4, v0

    check-cast v4, Lkotlin/coroutines/Continuation;

    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->L$0:Ljava/lang/Object;

    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->L$1:Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->L$2:Ljava/lang/Object;

    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->L$3:Ljava/lang/Object;

    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->L$4:Ljava/lang/Object;

    const/4 v2, 0x7

    iput v2, v0, Lcom/example/ui/BookViewModel$confirmHandover$1;->label:I

    invoke-virtual {v3, v11, v4}, Lcom/example/data/BookRepository;->insertMessage(Lcom/example/data/Message;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_b

    :goto_7
    return-object v1

    .line 448
    :cond_b
    :goto_8
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
