.class final Lcom/example/ui/BookViewModel$addReviewForOwner$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "BookViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/BookViewModel;->addReviewForOwner(Ljava/lang/String;Ljava/lang/String;)V
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
    c = "com.example.ui.BookViewModel$addReviewForOwner$1"
    f = "BookViewModel.kt"
    i = {
        0x0,
        0x1,
        0x2,
        0x2,
        0x2
    }
    l = {
        0x408,
        0x40b,
        0x40f
    }
    m = "invokeSuspend"
    n = {
        "review",
        "review",
        "review",
        "ownerUser",
        "points"
    }
    s = {
        "L$0",
        "L$0",
        "L$0",
        "L$1",
        "I$0"
    }
.end annotation


# instance fields
.field final synthetic $content:Ljava/lang/String;

.field final synthetic $ownerName:Ljava/lang/String;

.field I$0:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/example/ui/BookViewModel;


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/example/ui/BookViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/example/ui/BookViewModel;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/ui/BookViewModel$addReviewForOwner$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/BookViewModel$addReviewForOwner$1;->$ownerName:Ljava/lang/String;

    iput-object p2, p0, Lcom/example/ui/BookViewModel$addReviewForOwner$1;->this$0:Lcom/example/ui/BookViewModel;

    iput-object p3, p0, Lcom/example/ui/BookViewModel$addReviewForOwner$1;->$content:Ljava/lang/String;

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

    new-instance p1, Lcom/example/ui/BookViewModel$addReviewForOwner$1;

    iget-object v0, p0, Lcom/example/ui/BookViewModel$addReviewForOwner$1;->$ownerName:Ljava/lang/String;

    iget-object v1, p0, Lcom/example/ui/BookViewModel$addReviewForOwner$1;->this$0:Lcom/example/ui/BookViewModel;

    iget-object p0, p0, Lcom/example/ui/BookViewModel$addReviewForOwner$1;->$content:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p0, p2}, Lcom/example/ui/BookViewModel$addReviewForOwner$1;-><init>(Ljava/lang/String;Lcom/example/ui/BookViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/BookViewModel$addReviewForOwner$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/BookViewModel$addReviewForOwner$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p0

    check-cast p0, Lcom/example/ui/BookViewModel$addReviewForOwner$1;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lcom/example/ui/BookViewModel$addReviewForOwner$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1025
    iget v2, v0, Lcom/example/ui/BookViewModel$addReviewForOwner$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x2

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-eq v2, v6, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v1, v0, Lcom/example/ui/BookViewModel$addReviewForOwner$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/example/data/User;

    iget-object v0, v0, Lcom/example/ui/BookViewModel$addReviewForOwner$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/example/data/Review;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_4

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v2, v0, Lcom/example/ui/BookViewModel$addReviewForOwner$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/example/data/Review;

    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-object/from16 v4, p1

    goto/16 :goto_2

    :cond_2
    iget-object v2, v0, Lcom/example/ui/BookViewModel$addReviewForOwner$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/example/data/Review;

    :try_start_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    :cond_3
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 1027
    :try_start_3
    new-instance v7, Lcom/example/data/Review;

    .line 1028
    iget-object v9, v0, Lcom/example/ui/BookViewModel$addReviewForOwner$1;->$ownerName:Ljava/lang/String;

    .line 1029
    iget-object v2, v0, Lcom/example/ui/BookViewModel$addReviewForOwner$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v2}, Lcom/example/ui/BookViewModel;->access$get_currentDisplayName$p(Lcom/example/ui/BookViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v2

    invoke-interface {v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_5

    iget-object v2, v0, Lcom/example/ui/BookViewModel$addReviewForOwner$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v2}, Lcom/example/ui/BookViewModel;->access$get_currentUser$p(Lcom/example/ui/BookViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v2

    invoke-interface {v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_4

    const-string v8, "@"

    invoke-static {v2, v8, v5, v6, v5}, Lkotlin/text/StringsKt;->substringBefore$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_4
    move-object v2, v5

    :goto_0
    if-nez v2, :cond_5

    const-string v2, "Anonymous"

    :cond_5
    move-object v10, v2

    .line 1030
    iget-object v12, v0, Lcom/example/ui/BookViewModel$addReviewForOwner$1;->$content:Ljava/lang/String;

    const/16 v20, 0x7e9

    const/16 v21, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    .line 1027
    invoke-direct/range {v7 .. v21}, Lcom/example/data/Review;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1032
    iget-object v2, v0, Lcom/example/ui/BookViewModel$addReviewForOwner$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v2}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v2

    move-object v8, v0

    check-cast v8, Lkotlin/coroutines/Continuation;

    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v0, Lcom/example/ui/BookViewModel$addReviewForOwner$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lcom/example/ui/BookViewModel$addReviewForOwner$1;->label:I

    invoke-virtual {v2, v7, v8}, Lcom/example/data/BookRepository;->insertReview(Lcom/example/data/Review;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_6

    goto/16 :goto_3

    :cond_6
    move-object v2, v7

    .line 1035
    :goto_1
    iget-object v4, v0, Lcom/example/ui/BookViewModel$addReviewForOwner$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v4}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v4

    iget-object v7, v0, Lcom/example/ui/BookViewModel$addReviewForOwner$1;->$ownerName:Ljava/lang/String;

    invoke-virtual {v4, v7}, Lcom/example/data/BookRepository;->getUser(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v4

    move-object v7, v0

    check-cast v7, Lkotlin/coroutines/Continuation;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v0, Lcom/example/ui/BookViewModel$addReviewForOwner$1;->L$0:Ljava/lang/Object;

    iput v6, v0, Lcom/example/ui/BookViewModel$addReviewForOwner$1;->label:I

    invoke-static {v4, v7}, Lkotlinx/coroutines/flow/FlowKt;->firstOrNull(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_7

    goto :goto_3

    .line 1025
    :cond_7
    :goto_2
    move-object v7, v4

    check-cast v7, Lcom/example/data/User;

    if-eqz v7, :cond_a

    .line 1037
    iget-object v4, v0, Lcom/example/ui/BookViewModel$addReviewForOwner$1;->$content:Ljava/lang/String;

    check-cast v4, Ljava/lang/CharSequence;

    const-string v8, "Rated 5"

    check-cast v8, Ljava/lang/CharSequence;

    const/4 v9, 0x0

    invoke-static {v4, v8, v9, v6, v5}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    iget-object v4, v0, Lcom/example/ui/BookViewModel$addReviewForOwner$1;->$content:Ljava/lang/String;

    check-cast v4, Ljava/lang/CharSequence;

    const-string v8, "Rated 4"

    check-cast v8, Ljava/lang/CharSequence;

    invoke-static {v4, v8, v9, v6, v5}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    :cond_8
    const/4 v9, 0x5

    :cond_9
    move v4, v9

    if-lez v4, :cond_a

    .line 1039
    iget-object v5, v0, Lcom/example/ui/BookViewModel$addReviewForOwner$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v5}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v5

    invoke-virtual {v7}, Lcom/example/data/User;->getTrustScore()I

    move-result v6

    add-int v10, v6, v4

    const/16 v20, 0x7fb

    const/16 v21, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    invoke-static/range {v7 .. v21}, Lcom/example/data/User;->copy$default(Lcom/example/data/User;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;IIDILjava/lang/Object;)Lcom/example/data/User;

    move-result-object v6

    move-object v8, v0

    check-cast v8, Lkotlin/coroutines/Continuation;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lcom/example/ui/BookViewModel$addReviewForOwner$1;->L$0:Ljava/lang/Object;

    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lcom/example/ui/BookViewModel$addReviewForOwner$1;->L$1:Ljava/lang/Object;

    iput v4, v0, Lcom/example/ui/BookViewModel$addReviewForOwner$1;->I$0:I

    iput v3, v0, Lcom/example/ui/BookViewModel$addReviewForOwner$1;->label:I

    invoke-virtual {v5, v6, v8}, Lcom/example/data/BookRepository;->updateUser(Lcom/example/data/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    if-ne v0, v1, :cond_a

    :goto_3
    return-object v1

    :catch_0
    move-exception v0

    .line 1043
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 1045
    :cond_a
    :goto_4
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method
