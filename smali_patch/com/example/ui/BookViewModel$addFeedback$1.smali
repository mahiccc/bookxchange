.class final Lcom/example/ui/BookViewModel$addFeedback$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "BookViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/BookViewModel;->addFeedback(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
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
    c = "com.example.ui.BookViewModel$addFeedback$1"
    f = "BookViewModel.kt"
    i = {}
    l = {
        0x3ef,
        0x3f5
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $content:Ljava/lang/String;

.field final synthetic $reviewer:Ljava/lang/String;

.field final synthetic $targetUsername:Ljava/lang/String;

.field final synthetic $type:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lcom/example/ui/BookViewModel;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/example/ui/BookViewModel;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/example/ui/BookViewModel;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/ui/BookViewModel$addFeedback$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/BookViewModel$addFeedback$1;->$type:Ljava/lang/String;

    iput-object p2, p0, Lcom/example/ui/BookViewModel$addFeedback$1;->$targetUsername:Ljava/lang/String;

    iput-object p3, p0, Lcom/example/ui/BookViewModel$addFeedback$1;->this$0:Lcom/example/ui/BookViewModel;

    iput-object p4, p0, Lcom/example/ui/BookViewModel$addFeedback$1;->$reviewer:Ljava/lang/String;

    iput-object p5, p0, Lcom/example/ui/BookViewModel$addFeedback$1;->$content:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7
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

    new-instance v0, Lcom/example/ui/BookViewModel$addFeedback$1;

    iget-object v1, p0, Lcom/example/ui/BookViewModel$addFeedback$1;->$type:Ljava/lang/String;

    iget-object v2, p0, Lcom/example/ui/BookViewModel$addFeedback$1;->$targetUsername:Ljava/lang/String;

    iget-object v3, p0, Lcom/example/ui/BookViewModel$addFeedback$1;->this$0:Lcom/example/ui/BookViewModel;

    iget-object v4, p0, Lcom/example/ui/BookViewModel$addFeedback$1;->$reviewer:Ljava/lang/String;

    iget-object v5, p0, Lcom/example/ui/BookViewModel$addFeedback$1;->$content:Ljava/lang/String;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/example/ui/BookViewModel$addFeedback$1;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/example/ui/BookViewModel;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/BookViewModel$addFeedback$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/BookViewModel$addFeedback$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p0

    check-cast p0, Lcom/example/ui/BookViewModel$addFeedback$1;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lcom/example/ui/BookViewModel$addFeedback$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1005
    iget v2, v0, Lcom/example/ui/BookViewModel$addFeedback$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 1006
    iget-object v2, v0, Lcom/example/ui/BookViewModel$addFeedback$1;->$type:Ljava/lang/String;

    const-string v5, "USER_REVIEW"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, v0, Lcom/example/ui/BookViewModel$addFeedback$1;->$targetUsername:Ljava/lang/String;

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 1007
    iget-object v2, v0, Lcom/example/ui/BookViewModel$addFeedback$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v2}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v2

    new-instance v5, Lcom/example/data/Review;

    .line 1008
    iget-object v7, v0, Lcom/example/ui/BookViewModel$addFeedback$1;->$targetUsername:Ljava/lang/String;

    .line 1009
    iget-object v8, v0, Lcom/example/ui/BookViewModel$addFeedback$1;->$reviewer:Ljava/lang/String;

    .line 1010
    iget-object v10, v0, Lcom/example/ui/BookViewModel$addFeedback$1;->$content:Ljava/lang/String;

    const/16 v18, 0x7e9

    const/16 v19, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    .line 1007
    invoke-direct/range {v5 .. v19}, Lcom/example/data/Review;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v3, v0

    check-cast v3, Lkotlin/coroutines/Continuation;

    iput v4, v0, Lcom/example/ui/BookViewModel$addFeedback$1;->label:I

    invoke-virtual {v2, v5, v3}, Lcom/example/data/BookRepository;->insertReview(Lcom/example/data/Review;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_4

    goto :goto_1

    .line 1013
    :cond_3
    iget-object v2, v0, Lcom/example/ui/BookViewModel$addFeedback$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v2}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v2

    new-instance v4, Lcom/example/data/Feedback;

    .line 1014
    iget-object v6, v0, Lcom/example/ui/BookViewModel$addFeedback$1;->$type:Ljava/lang/String;

    .line 1015
    iget-object v7, v0, Lcom/example/ui/BookViewModel$addFeedback$1;->$content:Ljava/lang/String;

    .line 1016
    iget-object v8, v0, Lcom/example/ui/BookViewModel$addFeedback$1;->$reviewer:Ljava/lang/String;

    const/16 v13, 0x61

    const/4 v14, 0x0

    const/4 v5, 0x0

    .line 1013
    const-string v9, "REPORTED"

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    invoke-direct/range {v4 .. v14}, Lcom/example/data/Feedback;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v5, v0

    check-cast v5, Lkotlin/coroutines/Continuation;

    iput v3, v0, Lcom/example/ui/BookViewModel$addFeedback$1;->label:I

    invoke-virtual {v2, v4, v5}, Lcom/example/data/BookRepository;->insertFeedback(Lcom/example/data/Feedback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_4

    :goto_1
    return-object v1

    .line 1020
    :cond_4
    :goto_2
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method
