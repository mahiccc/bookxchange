.class final Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "BookViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/BookViewModel;->submitBorrowerFeedback(Lcom/example/data/Book;ILjava/lang/String;ILjava/lang/String;Ljava/util/List;)V
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
    value = "SMAP\nBookViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BookViewModel.kt\ncom/example/ui/BookViewModel$submitBorrowerFeedback$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1363:1\n1#2:1364\n774#3:1365\n865#3,2:1366\n*S KotlinDebug\n*F\n+ 1 BookViewModel.kt\ncom/example/ui/BookViewModel$submitBorrowerFeedback$1\n*L\n1077#1:1365\n1077#1:1366,2\n*E\n"
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
    c = "com.example.ui.BookViewModel$submitBorrowerFeedback$1"
    f = "BookViewModel.kt"
    i = {
        0x0,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x2,
        0x3,
        0x3,
        0x3,
        0x3,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4
    }
    l = {
        0x430,
        0x436,
        0x444,
        0x447,
        0x44a
    }
    m = "invokeSuspend"
    n = {
        "bReview",
        "bReview",
        "updatedBook",
        "newAvg",
        "bReview",
        "updatedBook",
        "lReview",
        "newAvg",
        "bReview",
        "updatedBook",
        "lReview",
        "newAvg",
        "bReview",
        "updatedBook",
        "lReview",
        "lenderUser",
        "newAvg",
        "points"
    }
    s = {
        "L$0",
        "L$0",
        "L$1",
        "D$0",
        "L$0",
        "L$1",
        "L$2",
        "D$0",
        "L$0",
        "L$1",
        "L$2",
        "D$0",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "D$0",
        "I$0"
    }
.end annotation


# instance fields
.field final synthetic $book:Lcom/example/data/Book;

.field final synthetic $bookRating:I

.field final synthetic $bookReview:Ljava/lang/String;

.field final synthetic $lenderRating:I

.field final synthetic $lenderReview:Ljava/lang/String;

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

.field D$0:D

.field I$0:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/example/ui/BookViewModel;


# direct methods
.method constructor <init>(Lcom/example/data/Book;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Lcom/example/ui/BookViewModel;Ljava/lang/String;ILkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/data/Book;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/example/ui/BookViewModel;",
            "Ljava/lang/String;",
            "I",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$book:Lcom/example/data/Book;

    iput-object p2, p0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$reviewerDisplayName:Ljava/lang/String;

    iput-object p3, p0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$reviewer:Ljava/lang/String;

    iput-object p4, p0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$bookReview:Ljava/lang/String;

    iput p5, p0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$bookRating:I

    iput-object p6, p0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$tags:Ljava/util/List;

    iput-object p7, p0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->this$0:Lcom/example/ui/BookViewModel;

    iput-object p8, p0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$lenderReview:Ljava/lang/String;

    iput p9, p0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$lenderRating:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p10}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 11
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

    new-instance v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;

    iget-object v1, p0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$book:Lcom/example/data/Book;

    iget-object v2, p0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$reviewerDisplayName:Ljava/lang/String;

    iget-object v3, p0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$reviewer:Ljava/lang/String;

    iget-object v4, p0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$bookReview:Ljava/lang/String;

    iget v5, p0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$bookRating:I

    iget-object v6, p0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$tags:Ljava/util/List;

    iget-object v7, p0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->this$0:Lcom/example/ui/BookViewModel;

    iget-object v8, p0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$lenderReview:Ljava/lang/String;

    iget v9, p0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$lenderRating:I

    move-object v10, p2

    invoke-direct/range {v0 .. v10}, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;-><init>(Lcom/example/data/Book;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Lcom/example/ui/BookViewModel;Ljava/lang/String;ILkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p0

    check-cast p0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 59

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1058
    iget v2, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x1

    const/4 v5, 0x5

    const/4 v6, 0x4

    const/4 v7, 0x2

    const-string v8, "Rated "

    if-eqz v2, :cond_5

    if-eq v2, v4, :cond_4

    if-eq v2, v7, :cond_3

    if-eq v2, v3, :cond_2

    if-eq v2, v6, :cond_1

    if-ne v2, v5, :cond_0

    iget-object v1, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->L$3:Ljava/lang/Object;

    check-cast v1, Lcom/example/data/User;

    iget-object v1, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->L$2:Ljava/lang/Object;

    check-cast v1, Lcom/example/data/Review;

    iget-object v1, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/example/data/Book;

    iget-object v1, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/example/data/Review;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_8

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-wide v2, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->D$0:D

    iget-object v4, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->L$2:Ljava/lang/Object;

    check-cast v4, Lcom/example/data/Review;

    iget-object v8, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->L$1:Ljava/lang/Object;

    check-cast v8, Lcom/example/data/Book;

    iget-object v9, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->L$0:Ljava/lang/Object;

    check-cast v9, Lcom/example/data/Review;

    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-object/from16 v5, p1

    goto/16 :goto_5

    :cond_2
    iget-wide v2, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->D$0:D

    iget-object v4, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->L$2:Ljava/lang/Object;

    check-cast v4, Lcom/example/data/Review;

    iget-object v8, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->L$1:Ljava/lang/Object;

    check-cast v8, Lcom/example/data/Book;

    iget-object v9, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->L$0:Ljava/lang/Object;

    check-cast v9, Lcom/example/data/Review;

    :try_start_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_4

    :cond_3
    iget-wide v9, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->D$0:D

    iget-object v2, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcom/example/data/Book;

    iget-object v4, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lcom/example/data/Review;

    :try_start_3
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto/16 :goto_3

    :cond_4
    iget-object v2, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/example/data/Review;

    :try_start_4
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    move-object v4, v2

    goto :goto_0

    :cond_5
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 1062
    :try_start_5
    iget-object v2, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$book:Lcom/example/data/Book;

    invoke-virtual {v2}, Lcom/example/data/Book;->getId()Ljava/lang/String;

    move-result-object v11

    .line 1063
    iget-object v12, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$reviewerDisplayName:Ljava/lang/String;

    .line 1064
    iget-object v13, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$reviewer:Ljava/lang/String;

    .line 1065
    iget-object v2, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$bookReview:Ljava/lang/String;

    check-cast v2, Ljava/lang/CharSequence;

    iget v9, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$bookRating:I

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_6

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v9, " stars."

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_6
    move-object v14, v2

    check-cast v14, Ljava/lang/String;

    .line 1066
    iget v15, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$bookRating:I

    .line 1067
    const-string v16, "BOOK"

    .line 1068
    iget-object v2, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$book:Lcom/example/data/Book;

    invoke-virtual {v2}, Lcom/example/data/Book;->getId()Ljava/lang/String;

    move-result-object v17

    .line 1069
    iget-object v2, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$book:Lcom/example/data/Book;

    invoke-virtual {v2}, Lcom/example/data/Book;->getTitle()Ljava/lang/String;

    move-result-object v18

    .line 1070
    iget-object v2, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$tags:Ljava/util/List;

    .line 1061
    new-instance v9, Lcom/example/data/Review;

    const/4 v10, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x401

    const/16 v23, 0x0

    move-object/from16 v19, v2

    invoke-direct/range {v9 .. v23}, Lcom/example/data/Review;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1072
    iget-object v2, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v2}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v2

    move-object v10, v0

    check-cast v10, Lkotlin/coroutines/Continuation;

    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->label:I

    invoke-virtual {v2, v9, v10}, Lcom/example/data/BookRepository;->insertReview(Lcom/example/data/Review;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_7

    goto/16 :goto_7

    :cond_7
    move-object v4, v9

    .line 1075
    :goto_0
    iget-object v2, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$book:Lcom/example/data/Book;

    invoke-virtual {v2}, Lcom/example/data/Book;->getAverageRating()Ljava/lang/Double;

    move-result-object v2

    if-eqz v2, :cond_8

    iget-object v2, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$book:Lcom/example/data/Book;

    invoke-virtual {v2}, Lcom/example/data/Book;->getAverageRating()Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v9

    iget v2, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$bookRating:I

    int-to-double v11, v2

    add-double/2addr v9, v11

    const-wide/high16 v11, 0x4000000000000000L    # 2.0

    div-double/2addr v9, v11

    goto :goto_1

    :cond_8
    iget v2, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$bookRating:I

    int-to-double v9, v2

    .line 1076
    :goto_1
    iget-object v11, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$book:Lcom/example/data/Book;

    const-wide/high16 v12, 0x4024000000000000L    # 10.0

    mul-double v14, v9, v12

    invoke-static {v14, v15}, Ljava/lang/Math;->round(D)J

    move-result-wide v14

    long-to-double v14, v14

    div-double/2addr v14, v12

    invoke-static {v14, v15}, Lkotlin/coroutines/jvm/internal/Boxing;->boxDouble(D)Ljava/lang/Double;

    move-result-object v46

    const/16 v57, 0x7fd

    const/16 v58, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

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

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, -0x1

    invoke-static/range {v11 .. v58}, Lcom/example/data/Book;->copy$default(Lcom/example/data/Book;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;IILjava/lang/Object;)Lcom/example/data/Book;

    move-result-object v2

    .line 1077
    iget-object v11, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v11}, Lcom/example/ui/BookViewModel;->access$get_localOptimisticBooks$p(Lcom/example/ui/BookViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v11

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    check-cast v12, Ljava/util/Collection;

    iget-object v13, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v13}, Lcom/example/ui/BookViewModel;->access$get_localOptimisticBooks$p(Lcom/example/ui/BookViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v13

    invoke-interface {v13}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Iterable;

    .line 1365
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    check-cast v14, Ljava/util/Collection;

    .line 1366
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_2
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_a

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    move-object/from16 v16, v15

    check-cast v16, Lcom/example/data/Book;

    .line 1077
    invoke-virtual/range {v16 .. v16}, Lcom/example/data/Book;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Lcom/example/data/Book;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_9

    .line 1366
    invoke-interface {v14, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_9
    const/4 v5, 0x5

    const/4 v6, 0x4

    goto :goto_2

    .line 1367
    :cond_a
    check-cast v14, Ljava/util/List;

    .line 1365
    check-cast v14, Ljava/lang/Iterable;

    .line 1077
    invoke-static {v12, v14}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v11, v5}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 1078
    iget-object v5, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v5}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v5

    move-object v6, v0

    check-cast v6, Lkotlin/coroutines/Continuation;

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->L$0:Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->L$1:Ljava/lang/Object;

    iput-wide v9, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->D$0:D

    iput v7, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->label:I

    invoke-virtual {v5, v2, v6}, Lcom/example/data/BookRepository;->updateBook(Lcom/example/data/Book;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_b

    goto/16 :goto_7

    .line 1082
    :cond_b
    :goto_3
    iget-object v5, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$book:Lcom/example/data/Book;

    invoke-virtual {v5}, Lcom/example/data/Book;->getOwnerName()Ljava/lang/String;

    move-result-object v20

    .line 1083
    iget-object v5, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$reviewerDisplayName:Ljava/lang/String;

    .line 1084
    iget-object v6, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$reviewer:Ljava/lang/String;

    .line 1085
    iget-object v11, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$lenderReview:Ljava/lang/String;

    check-cast v11, Ljava/lang/CharSequence;

    iget v12, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$lenderRating:I

    invoke-static {v11}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v13

    if-eqz v13, :cond_c

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v11, " stars as a lender."

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    :cond_c
    move-object/from16 v23, v11

    check-cast v23, Ljava/lang/String;

    .line 1086
    iget v8, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$lenderRating:I

    .line 1087
    const-string v25, "LENDER"

    .line 1088
    iget-object v11, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$book:Lcom/example/data/Book;

    invoke-virtual {v11}, Lcom/example/data/Book;->getId()Ljava/lang/String;

    move-result-object v26

    .line 1089
    iget-object v11, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$book:Lcom/example/data/Book;

    invoke-virtual {v11}, Lcom/example/data/Book;->getTitle()Ljava/lang/String;

    move-result-object v27

    .line 1090
    iget-object v11, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$tags:Ljava/util/List;

    .line 1081
    new-instance v18, Lcom/example/data/Review;

    const/16 v19, 0x0

    const-wide/16 v29, 0x0

    const/16 v31, 0x401

    const/16 v32, 0x0

    move-object/from16 v21, v5

    move-object/from16 v22, v6

    move/from16 v24, v8

    move-object/from16 v28, v11

    invoke-direct/range {v18 .. v32}, Lcom/example/data/Review;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v5, v18

    .line 1092
    iget-object v6, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v6}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v6

    move-object v8, v0

    check-cast v8, Lkotlin/coroutines/Continuation;

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->L$0:Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->L$1:Ljava/lang/Object;

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->L$2:Ljava/lang/Object;

    iput-wide v9, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->D$0:D

    iput v3, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->label:I

    invoke-virtual {v6, v5, v8}, Lcom/example/data/BookRepository;->insertReview(Lcom/example/data/Review;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_d

    goto/16 :goto_7

    :cond_d
    move-object v8, v2

    move-wide v2, v9

    move-object v9, v4

    move-object v4, v5

    .line 1095
    :goto_4
    iget-object v5, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v5}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v5

    iget-object v6, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$book:Lcom/example/data/Book;

    invoke-virtual {v6}, Lcom/example/data/Book;->getOwnerName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/example/data/BookRepository;->getUser(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v5

    move-object v6, v0

    check-cast v6, Lkotlin/coroutines/Continuation;

    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->L$0:Ljava/lang/Object;

    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->L$1:Ljava/lang/Object;

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->L$2:Ljava/lang/Object;

    iput-wide v2, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->D$0:D

    const/4 v10, 0x4

    iput v10, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->label:I

    invoke-static {v5, v6}, Lkotlinx/coroutines/flow/FlowKt;->firstOrNull(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_e

    goto :goto_7

    .line 1058
    :cond_e
    :goto_5
    move-object/from16 v18, v5

    check-cast v18, Lcom/example/data/User;

    if-eqz v18, :cond_11

    .line 1097
    iget v5, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$lenderRating:I

    const/4 v10, 0x4

    if-lt v5, v10, :cond_f

    const/4 v7, 0x5

    goto :goto_6

    :cond_f
    if-gt v5, v7, :cond_10

    const/4 v7, -0x3

    .line 1098
    :cond_10
    :goto_6
    iget-object v5, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v5}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v5

    invoke-virtual/range {v18 .. v18}, Lcom/example/data/User;->getTrustScore()I

    move-result v6

    add-int/2addr v6, v7

    const/4 v10, 0x0

    const/16 v11, 0x64

    invoke-static {v6, v10, v11}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v21

    const/16 v31, 0x7fb

    const/16 v32, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const-wide/16 v29, 0x0

    invoke-static/range {v18 .. v32}, Lcom/example/data/User;->copy$default(Lcom/example/data/User;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;IIDILjava/lang/Object;)Lcom/example/data/User;

    move-result-object v6

    move-object v10, v0

    check-cast v10, Lkotlin/coroutines/Continuation;

    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->L$0:Ljava/lang/Object;

    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->L$1:Ljava/lang/Object;

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->L$2:Ljava/lang/Object;

    invoke-static/range {v18 .. v18}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->L$3:Ljava/lang/Object;

    iput-wide v2, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->D$0:D

    iput v7, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->I$0:I

    const/4 v2, 0x5

    iput v2, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->label:I

    invoke-virtual {v5, v6, v10}, Lcom/example/data/BookRepository;->updateUser(Lcom/example/data/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_11

    :goto_7
    return-object v1

    .line 1101
    :cond_11
    :goto_8
    iget-object v1, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->this$0:Lcom/example/ui/BookViewModel;

    iget-object v2, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$book:Lcom/example/data/Book;

    invoke-virtual {v2}, Lcom/example/data/Book;->getId()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$book:Lcom/example/data/Book;

    invoke-virtual {v3}, Lcom/example/data/Book;->getOwnerName()Ljava/lang/String;

    move-result-object v3

    iget-object v4, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$reviewerDisplayName:Ljava/lang/String;

    iget v5, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$lenderRating:I

    iget-object v0, v0, Lcom/example/ui/BookViewModel$submitBorrowerFeedback$1;->$lenderReview:Ljava/lang/String;

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_12

    const-string v0, "Great book exchange!"

    :cond_12
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v6, " rated your book exchange "

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
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    goto :goto_9

    :catch_0
    move-exception v0

    .line 1103
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 1105
    :goto_9
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method
