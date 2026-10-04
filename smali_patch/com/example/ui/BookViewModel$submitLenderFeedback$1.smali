.class final Lcom/example/ui/BookViewModel$submitLenderFeedback$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "BookViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/BookViewModel;->submitLenderFeedback(Lcom/example/data/Book;ILjava/lang/String;Ljava/util/List;)V
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
    value = "SMAP\nBookViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BookViewModel.kt\ncom/example/ui/BookViewModel$submitLenderFeedback$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1363:1\n1#2:1364\n*E\n"
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
    c = "com.example.ui.BookViewModel$submitLenderFeedback$1"
    f = "BookViewModel.kt"
    i = {
        0x0,
        0x1,
        0x2,
        0x2,
        0x2
    }
    l = {
        0x46a,
        0x46d,
        0x470
    }
    m = "invokeSuspend"
    n = {
        "bReview",
        "bReview",
        "bReview",
        "borrowerUser",
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
.field final synthetic $book:Lcom/example/data/Book;

.field final synthetic $borrower:Ljava/lang/String;

.field final synthetic $borrowerRating:I

.field final synthetic $borrowerReview:Ljava/lang/String;

.field final synthetic $reviewer:Ljava/lang/String;

.field final synthetic $reviewerDisplayName:Ljava/lang/String;

.field final synthetic $tags:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field I$0:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/example/ui/BookViewModel;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/example/data/Book;Ljava/util/List;Lcom/example/ui/BookViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Lcom/example/data/Book;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/example/ui/BookViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/ui/BookViewModel$submitLenderFeedback$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->$borrower:Ljava/lang/String;

    iput-object p2, p0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->$reviewerDisplayName:Ljava/lang/String;

    iput-object p3, p0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->$reviewer:Ljava/lang/String;

    iput-object p4, p0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->$borrowerReview:Ljava/lang/String;

    iput p5, p0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->$borrowerRating:I

    iput-object p6, p0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->$book:Lcom/example/data/Book;

    iput-object p7, p0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->$tags:Ljava/util/List;

    iput-object p8, p0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->this$0:Lcom/example/ui/BookViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p9}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 10
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

    new-instance v0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;

    iget-object v1, p0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->$borrower:Ljava/lang/String;

    iget-object v2, p0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->$reviewerDisplayName:Ljava/lang/String;

    iget-object v3, p0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->$reviewer:Ljava/lang/String;

    iget-object v4, p0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->$borrowerReview:Ljava/lang/String;

    iget v5, p0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->$borrowerRating:I

    iget-object v6, p0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->$book:Lcom/example/data/Book;

    iget-object v7, p0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->$tags:Ljava/util/List;

    iget-object v8, p0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->this$0:Lcom/example/ui/BookViewModel;

    move-object v9, p2

    invoke-direct/range {v0 .. v9}, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/example/data/Book;Ljava/util/List;Lcom/example/ui/BookViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p0

    check-cast p0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p0

    const-string v1, "Rated "

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 1117
    iget v3, v0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->label:I

    const/4 v4, 0x3

    const/4 v5, 0x1

    const/4 v6, 0x2

    if-eqz v3, :cond_3

    if-eq v3, v5, :cond_2

    if-eq v3, v6, :cond_1

    if-ne v3, v4, :cond_0

    iget-object v1, v0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/example/data/User;

    iget-object v1, v0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/example/data/Review;

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
    iget-object v1, v0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/example/data/Review;

    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-object/from16 v3, p1

    goto/16 :goto_1

    :cond_2
    iget-object v1, v0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/example/data/Review;

    :try_start_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :cond_3
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 1120
    :try_start_3
    iget-object v9, v0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->$borrower:Ljava/lang/String;

    .line 1121
    iget-object v10, v0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->$reviewerDisplayName:Ljava/lang/String;

    .line 1122
    iget-object v11, v0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->$reviewer:Ljava/lang/String;

    .line 1123
    iget-object v3, v0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->$borrowerReview:Ljava/lang/String;

    check-cast v3, Ljava/lang/CharSequence;

    iget v7, v0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->$borrowerRating:I

    invoke-static {v3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " stars as a borrower."

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :cond_4
    move-object v12, v3

    check-cast v12, Ljava/lang/String;

    .line 1124
    iget v13, v0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->$borrowerRating:I

    .line 1125
    const-string v14, "BORROWER"

    .line 1126
    iget-object v1, v0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->$book:Lcom/example/data/Book;

    invoke-virtual {v1}, Lcom/example/data/Book;->getId()Ljava/lang/String;

    move-result-object v15

    .line 1127
    iget-object v1, v0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->$book:Lcom/example/data/Book;

    invoke-virtual {v1}, Lcom/example/data/Book;->getTitle()Ljava/lang/String;

    move-result-object v16

    .line 1128
    iget-object v1, v0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->$tags:Ljava/util/List;

    .line 1119
    new-instance v7, Lcom/example/data/Review;

    const/4 v8, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x401

    const/16 v21, 0x0

    move-object/from16 v17, v1

    invoke-direct/range {v7 .. v21}, Lcom/example/data/Review;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1130
    iget-object v1, v0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v1}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v1

    move-object v3, v0

    check-cast v3, Lkotlin/coroutines/Continuation;

    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->L$0:Ljava/lang/Object;

    iput v5, v0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->label:I

    invoke-virtual {v1, v7, v3}, Lcom/example/data/BookRepository;->insertReview(Lcom/example/data/Review;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_5

    goto :goto_3

    :cond_5
    move-object v1, v7

    .line 1133
    :goto_0
    iget-object v3, v0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v3}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v3

    iget-object v5, v0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->$borrower:Ljava/lang/String;

    invoke-virtual {v3, v5}, Lcom/example/data/BookRepository;->getUser(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v3

    move-object v5, v0

    check-cast v5, Lkotlin/coroutines/Continuation;

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->L$0:Ljava/lang/Object;

    iput v6, v0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->label:I

    invoke-static {v3, v5}, Lkotlinx/coroutines/flow/FlowKt;->firstOrNull(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_6

    goto :goto_3

    .line 1117
    :cond_6
    :goto_1
    move-object v7, v3

    check-cast v7, Lcom/example/data/User;

    if-eqz v7, :cond_9

    .line 1135
    iget v3, v0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->$borrowerRating:I

    const/4 v5, 0x4

    if-lt v3, v5, :cond_7

    const/4 v6, 0x5

    goto :goto_2

    :cond_7
    if-gt v3, v6, :cond_8

    const/4 v6, -0x5

    .line 1136
    :cond_8
    :goto_2
    iget-object v3, v0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v3}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v3

    invoke-virtual {v7}, Lcom/example/data/User;->getTrustScore()I

    move-result v5

    add-int/2addr v5, v6

    const/4 v8, 0x0

    const/16 v9, 0x64

    invoke-static {v5, v8, v9}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v10

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

    move-result-object v5

    move-object v8, v0

    check-cast v8, Lkotlin/coroutines/Continuation;

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->L$0:Ljava/lang/Object;

    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->L$1:Ljava/lang/Object;

    iput v6, v0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->I$0:I

    iput v4, v0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->label:I

    invoke-virtual {v3, v5, v8}, Lcom/example/data/BookRepository;->updateUser(Lcom/example/data/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_9

    :goto_3
    return-object v2

    .line 1139
    :cond_9
    :goto_4
    iget-object v1, v0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->this$0:Lcom/example/ui/BookViewModel;

    iget-object v2, v0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->$book:Lcom/example/data/Book;

    invoke-virtual {v2}, Lcom/example/data/Book;->getId()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->$borrower:Ljava/lang/String;

    iget-object v4, v0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->$reviewerDisplayName:Ljava/lang/String;

    iget v5, v0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->$borrowerRating:I

    iget-object v0, v0, Lcom/example/ui/BookViewModel$submitLenderFeedback$1;->$borrowerReview:Ljava/lang/String;

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_a

    const-string v0, "Thank you for returning the book in good condition!"

    :cond_a
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v6, " left feedback on your book return "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " \u2b50: \""

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, "\""

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v3, v0}, Lcom/example/ui/BookViewModel;->sendMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_5

    :catch_0
    move-exception v0

    .line 1141
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 1143
    :goto_5
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method
