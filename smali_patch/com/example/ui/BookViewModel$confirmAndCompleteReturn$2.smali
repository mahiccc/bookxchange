.class final Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "BookViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/BookViewModel;->confirmAndCompleteReturn-0E7RQCE(Lcom/example/data/Book;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/Object;
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
    value = "SMAP\nBookViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BookViewModel.kt\ncom/example/ui/BookViewModel$confirmAndCompleteReturn$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1363:1\n1#2:1364\n*E\n"
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
    c = "com.example.ui.BookViewModel$confirmAndCompleteReturn$2"
    f = "BookViewModel.kt"
    i = {
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4
    }
    l = {
        0x35d,
        0x369,
        0x36c,
        0x370,
        0x376
    }
    m = "invokeSuspend"
    n = {
        "conditions",
        "originalCond",
        "retCond",
        "origIdx",
        "retIdx",
        "isDegraded",
        "conditions",
        "originalCond",
        "retCond",
        "owner",
        "origIdx",
        "retIdx",
        "isDegraded",
        "ownerScoreChange",
        "conditions",
        "originalCond",
        "retCond",
        "owner",
        "origIdx",
        "retIdx",
        "isDegraded",
        "conditions",
        "originalCond",
        "retCond",
        "owner",
        "borrowerUser",
        "origIdx",
        "retIdx",
        "isDegraded",
        "ratingScore",
        "borrowerScoreChange",
        "estPrice"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "I$0",
        "I$1",
        "I$2",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "I$0",
        "I$1",
        "I$2",
        "I$3",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "I$0",
        "I$1",
        "I$2",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "I$0",
        "I$1",
        "I$2",
        "I$3",
        "I$4",
        "D$0"
    }
.end annotation


# instance fields
.field final synthetic $book:Lcom/example/data/Book;

.field final synthetic $borrower:Ljava/lang/String;

.field final synthetic $rating:Ljava/lang/Integer;

.field final synthetic $review:Ljava/lang/String;

.field final synthetic $updated:Lcom/example/data/Book;

.field D$0:D

.field I$0:I

.field I$1:I

.field I$2:I

.field I$3:I

.field I$4:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/example/ui/BookViewModel;


# direct methods
.method constructor <init>(Lcom/example/ui/BookViewModel;Lcom/example/data/Book;Lcom/example/data/Book;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/ui/BookViewModel;",
            "Lcom/example/data/Book;",
            "Lcom/example/data/Book;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->this$0:Lcom/example/ui/BookViewModel;

    iput-object p2, p0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->$updated:Lcom/example/data/Book;

    iput-object p3, p0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->$book:Lcom/example/data/Book;

    iput-object p4, p0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->$borrower:Ljava/lang/String;

    iput-object p5, p0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->$rating:Ljava/lang/Integer;

    iput-object p6, p0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->$review:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 8
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

    new-instance v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;

    iget-object v1, p0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->this$0:Lcom/example/ui/BookViewModel;

    iget-object v2, p0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->$updated:Lcom/example/data/Book;

    iget-object v3, p0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->$book:Lcom/example/data/Book;

    iget-object v4, p0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->$borrower:Ljava/lang/String;

    iget-object v5, p0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->$rating:Ljava/lang/Integer;

    iget-object v6, p0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->$review:Ljava/lang/String;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;-><init>(Lcom/example/ui/BookViewModel;Lcom/example/data/Book;Lcom/example/data/Book;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p0

    check-cast p0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 47

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 860
    iget v2, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->label:I

    const/4 v3, 0x5

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v2, :cond_5

    if-eq v2, v7, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget v1, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->I$2:I

    iget-object v2, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->L$4:Ljava/lang/Object;

    check-cast v2, Lcom/example/data/User;

    iget-object v2, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->L$3:Ljava/lang/Object;

    check-cast v2, Lcom/example/data/User;

    iget-object v2, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->L$2:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->L$1:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v3, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->L$0:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_c

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget v2, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->I$2:I

    iget v8, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->I$1:I

    iget v9, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->I$0:I

    iget-object v10, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->L$3:Ljava/lang/Object;

    check-cast v10, Lcom/example/data/User;

    iget-object v11, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->L$2:Ljava/lang/Object;

    check-cast v11, Ljava/lang/String;

    iget-object v12, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->L$1:Ljava/lang/Object;

    check-cast v12, Ljava/lang/String;

    iget-object v13, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->L$0:Ljava/lang/Object;

    check-cast v13, Ljava/util/List;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    move/from16 v30, v7

    goto/16 :goto_7

    :cond_2
    iget v2, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->I$2:I

    iget v8, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->I$1:I

    iget v9, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->I$0:I

    iget-object v10, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->L$3:Ljava/lang/Object;

    check-cast v10, Lcom/example/data/User;

    iget-object v11, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->L$2:Ljava/lang/Object;

    check-cast v11, Ljava/lang/String;

    iget-object v12, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->L$1:Ljava/lang/Object;

    check-cast v12, Ljava/lang/String;

    iget-object v13, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->L$0:Ljava/lang/Object;

    check-cast v13, Ljava/util/List;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move/from16 v30, v7

    goto/16 :goto_6

    :cond_3
    iget v2, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->I$2:I

    iget v8, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->I$1:I

    iget v9, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->I$0:I

    iget-object v10, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->L$2:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    iget-object v11, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->L$1:Ljava/lang/Object;

    check-cast v11, Ljava/lang/String;

    iget-object v12, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->L$0:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v13, v11

    move-object v11, v10

    move-object v10, v12

    move-object v12, v13

    move-object/from16 v13, p1

    goto/16 :goto_4

    :cond_4
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_5
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 861
    iget-object v2, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v2}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v2

    iget-object v8, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->$updated:Lcom/example/data/Book;

    move-object v9, v0

    check-cast v9, Lkotlin/coroutines/Continuation;

    iput v7, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->label:I

    invoke-virtual {v2, v8, v9}, Lcom/example/data/BookRepository;->updateBook(Lcom/example/data/Book;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_6

    goto/16 :goto_b

    .line 864
    :cond_6
    :goto_0
    new-array v2, v4, [Ljava/lang/String;

    const-string v8, "POOR"

    const/4 v9, 0x0

    aput-object v8, v2, v9

    const-string v8, "FAIR"

    aput-object v8, v2, v7

    const-string v8, "GOOD"

    aput-object v8, v2, v6

    const-string v8, "MINT"

    aput-object v8, v2, v5

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 865
    iget-object v8, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->$book:Lcom/example/data/Book;

    invoke-virtual {v8}, Lcom/example/data/Book;->getTransferCondition()Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_7

    iget-object v8, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->$book:Lcom/example/data/Book;

    invoke-virtual {v8}, Lcom/example/data/Book;->getCondition()Ljava/lang/String;

    move-result-object v8

    :cond_7
    sget-object v10, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v8, v10}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v8

    const-string v10, "toUpperCase(...)"

    invoke-static {v8, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 866
    iget-object v11, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->$book:Lcom/example/data/Book;

    invoke-virtual {v11}, Lcom/example/data/Book;->getReturnCondition()Ljava/lang/String;

    move-result-object v11

    if-nez v11, :cond_8

    move-object v11, v8

    :cond_8
    sget-object v12, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v11, v12}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 868
    invoke-interface {v2, v8}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v10

    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v10

    move-object v12, v10

    check-cast v12, Ljava/lang/Number;

    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    move-result v12

    const/4 v13, 0x0

    if-ltz v12, :cond_9

    goto :goto_1

    :cond_9
    move-object v10, v13

    :goto_1
    if-eqz v10, :cond_a

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    goto :goto_2

    :cond_a
    move v10, v6

    .line 869
    :goto_2
    invoke-interface {v2, v11}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v12

    invoke-static {v12}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v12

    move-object v14, v12

    check-cast v14, Ljava/lang/Number;

    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    move-result v14

    if-ltz v14, :cond_b

    move-object v13, v12

    :cond_b
    if-eqz v13, :cond_c

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v12

    goto :goto_3

    :cond_c
    move v12, v6

    :goto_3
    if-ge v12, v10, :cond_d

    move v9, v7

    .line 873
    :cond_d
    iget-object v13, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v13}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v13

    iget-object v14, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->$book:Lcom/example/data/Book;

    invoke-virtual {v14}, Lcom/example/data/Book;->getOwnerName()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Lcom/example/data/BookRepository;->getUser(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v13

    move-object v14, v0

    check-cast v14, Lkotlin/coroutines/Continuation;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    iput-object v15, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->L$0:Ljava/lang/Object;

    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    iput-object v15, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->L$1:Ljava/lang/Object;

    iput-object v11, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->L$2:Ljava/lang/Object;

    iput v10, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->I$0:I

    iput v12, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->I$1:I

    iput v9, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->I$2:I

    iput v6, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->label:I

    invoke-static {v13, v14}, Lkotlinx/coroutines/flow/FlowKt;->firstOrNull(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v1, :cond_e

    goto/16 :goto_b

    :cond_e
    move/from16 v46, v10

    move-object v10, v2

    move v2, v9

    move/from16 v9, v46

    move/from16 v46, v12

    move-object v12, v8

    move/from16 v8, v46

    .line 860
    :goto_4
    move-object v14, v13

    check-cast v14, Lcom/example/data/User;

    if-eqz v14, :cond_10

    if-eqz v2, :cond_f

    const/16 v13, 0xa

    goto :goto_5

    :cond_f
    move v13, v3

    .line 876
    :goto_5
    iget-object v15, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v15}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v15

    invoke-virtual {v14}, Lcom/example/data/User;->getTrustScore()I

    move-result v16

    add-int v17, v16, v13

    invoke-virtual {v14}, Lcom/example/data/User;->getCompletedSwaps()I

    move-result v16

    add-int/lit8 v18, v16, 0x1

    const/16 v27, 0x7f3

    const/16 v28, 0x0

    move-object/from16 v16, v15

    const/4 v15, 0x0

    move-object/from16 v19, v16

    const/16 v16, 0x0

    move-object/from16 v20, v19

    const/16 v19, 0x0

    move-object/from16 v21, v20

    const/16 v20, 0x0

    move-object/from16 v22, v21

    const/16 v21, 0x0

    move-object/from16 v23, v22

    const/16 v22, 0x0

    move-object/from16 v24, v23

    const/16 v23, 0x0

    move-object/from16 v25, v24

    const/16 v24, 0x0

    move-object/from16 v29, v25

    const-wide/16 v25, 0x0

    move/from16 v30, v7

    move-object/from16 v7, v29

    invoke-static/range {v14 .. v28}, Lcom/example/data/User;->copy$default(Lcom/example/data/User;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;IIDILjava/lang/Object;)Lcom/example/data/User;

    move-result-object v15

    move-object v3, v0

    check-cast v3, Lkotlin/coroutines/Continuation;

    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->L$0:Ljava/lang/Object;

    invoke-static {v12}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->L$1:Ljava/lang/Object;

    iput-object v11, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->L$2:Ljava/lang/Object;

    invoke-static {v14}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->L$3:Ljava/lang/Object;

    iput v9, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->I$0:I

    iput v8, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->I$1:I

    iput v2, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->I$2:I

    iput v13, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->I$3:I

    iput v5, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->label:I

    invoke-virtual {v7, v15, v3}, Lcom/example/data/BookRepository;->updateUser(Lcom/example/data/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_11

    goto/16 :goto_b

    :cond_10
    move/from16 v30, v7

    :cond_11
    move-object v13, v10

    move-object v10, v14

    .line 879
    :goto_6
    iget-object v3, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->$borrower:Ljava/lang/String;

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1c

    .line 880
    iget-object v3, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v3}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v3

    iget-object v6, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->$borrower:Ljava/lang/String;

    invoke-virtual {v3, v6}, Lcom/example/data/BookRepository;->getUser(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v3

    move-object v6, v0

    check-cast v6, Lkotlin/coroutines/Continuation;

    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->L$0:Ljava/lang/Object;

    invoke-static {v12}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->L$1:Ljava/lang/Object;

    iput-object v11, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->L$2:Ljava/lang/Object;

    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->L$3:Ljava/lang/Object;

    iput v9, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->I$0:I

    iput v8, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->I$1:I

    iput v2, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->I$2:I

    iput v4, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->label:I

    invoke-static {v3, v6}, Lkotlinx/coroutines/flow/FlowKt;->firstOrNull(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_12

    goto/16 :goto_b

    .line 860
    :cond_12
    :goto_7
    move-object/from16 v31, v3

    check-cast v31, Lcom/example/data/User;

    if-eqz v31, :cond_18

    .line 882
    iget-object v3, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->$rating:Ljava/lang/Integer;

    if-eqz v3, :cond_13

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-lt v3, v4, :cond_13

    const/4 v5, 0x5

    goto :goto_8

    :cond_13
    iget-object v3, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->$rating:Ljava/lang/Integer;

    if-eqz v3, :cond_14

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/4 v4, 0x2

    if-gt v3, v4, :cond_14

    const/4 v5, -0x3

    :cond_14
    :goto_8
    if-eqz v2, :cond_15

    const/16 v3, -0xa

    goto :goto_9

    :cond_15
    move v3, v5

    .line 885
    :goto_9
    iget-object v4, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->$book:Lcom/example/data/Book;

    invoke-virtual {v4}, Lcom/example/data/Book;->getEstimatedPrice()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_16

    check-cast v4, Ljava/lang/CharSequence;

    new-instance v6, Lkotlin/text/Regex;

    const-string v7, "[^0-9.]"

    invoke-direct {v6, v7}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    const-string v7, ""

    invoke-virtual {v6, v4, v7}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_16

    invoke-static {v4}, Lkotlin/text/StringsKt;->toDoubleOrNull(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v4

    if-eqz v4, :cond_16

    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v6

    goto :goto_a

    :cond_16
    const-wide v6, 0x406f400000000000L    # 250.0

    .line 886
    :goto_a
    iget-object v4, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v4}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v4

    .line 888
    invoke-virtual/range {v31 .. v31}, Lcom/example/data/User;->getTrustScore()I

    move-result v14

    add-int v34, v14, v3

    .line 889
    invoke-virtual/range {v31 .. v31}, Lcom/example/data/User;->getCompletedSwaps()I

    move-result v14

    add-int/lit8 v35, v14, 0x1

    .line 890
    invoke-virtual/range {v31 .. v31}, Lcom/example/data/User;->getBooksReadThisYear()I

    move-result v14

    add-int/lit8 v41, v14, 0x1

    .line 891
    invoke-virtual/range {v31 .. v31}, Lcom/example/data/User;->getTotalMoneySaved()D

    move-result-wide v14

    add-double v42, v14, v6

    const/16 v44, 0x1f3

    const/16 v45, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    .line 887
    invoke-static/range {v31 .. v45}, Lcom/example/data/User;->copy$default(Lcom/example/data/User;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;IIDILjava/lang/Object;)Lcom/example/data/User;

    move-result-object v14

    move-object v15, v0

    check-cast v15, Lkotlin/coroutines/Continuation;

    .line 886
    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    iput-object v13, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->L$0:Ljava/lang/Object;

    invoke-static {v12}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->L$1:Ljava/lang/Object;

    iput-object v11, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->L$2:Ljava/lang/Object;

    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->L$3:Ljava/lang/Object;

    invoke-static/range {v31 .. v31}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->L$4:Ljava/lang/Object;

    iput v9, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->I$0:I

    iput v8, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->I$1:I

    iput v2, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->I$2:I

    iput v5, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->I$3:I

    iput v3, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->I$4:I

    iput-wide v6, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->D$0:D

    const/4 v3, 0x5

    iput v3, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->label:I

    invoke-virtual {v4, v14, v15}, Lcom/example/data/BookRepository;->updateUser(Lcom/example/data/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_17

    :goto_b
    return-object v1

    :cond_17
    move v1, v2

    move-object v2, v11

    :goto_c
    move-object v11, v2

    move v2, v1

    .line 895
    :cond_18
    iget-object v1, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->$review:Ljava/lang/String;

    check-cast v1, Ljava/lang/CharSequence;

    if-eqz v1, :cond_1a

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_19

    goto :goto_d

    .line 896
    :cond_19
    iget-object v1, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->this$0:Lcom/example/ui/BookViewModel;

    iget-object v3, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->$borrower:Ljava/lang/String;

    iget-object v4, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->$review:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Lcom/example/ui/BookViewModel;->addReviewForOwner(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1a
    :goto_d
    if-eqz v2, :cond_1b

    .line 900
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Return accepted! However, the AI scan detected the book condition degraded to "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ". 10 trust points have been deducted."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_e

    .line 902
    :cond_1b
    iget-object v1, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->$book:Lcom/example/data/Book;

    invoke-virtual {v1}, Lcom/example/data/Book;->getTitle()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Return accepted! Thank you for returning \'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\' in good condition. We hope you enjoyed reading it!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 904
    :goto_e
    iget-object v2, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->this$0:Lcom/example/ui/BookViewModel;

    iget-object v3, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->$book:Lcom/example/data/Book;

    invoke-virtual {v3}, Lcom/example/data/Book;->getId()Ljava/lang/String;

    move-result-object v3

    iget-object v0, v0, Lcom/example/ui/BookViewModel$confirmAndCompleteReturn$2;->$borrower:Ljava/lang/String;

    invoke-virtual {v2, v3, v0, v1}, Lcom/example/ui/BookViewModel;->sendMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 906
    :cond_1c
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method
