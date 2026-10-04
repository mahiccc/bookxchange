.class final Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1$resp$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "CameraScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Lcom/example/api/GoogleBooksResponse;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/example/api/GoogleBooksResponse;",
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
    c = "com.example.ui.screens.CameraScreenKt$CameraScreen$searchGoogleBooksManually$1$resp$1"
    f = "CameraScreen.kt"
    i = {
        0x1
    }
    l = {
        0x82,
        0x87
    }
    m = "invokeSuspend"
    n = {
        "r"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field final synthetic $key:Ljava/lang/String;

.field final synthetic $query:Ljava/lang/String;

.field L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1$resp$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1$resp$1;->$key:Ljava/lang/String;

    iput-object p2, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1$resp$1;->$query:Ljava/lang/String;

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

    new-instance p1, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1$resp$1;

    iget-object v0, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1$resp$1;->$key:Ljava/lang/String;

    iget-object p0, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1$resp$1;->$query:Ljava/lang/String;

    invoke-direct {p1, v0, p0, p2}, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1$resp$1;-><init>(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1$resp$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lcom/example/api/GoogleBooksResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1$resp$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p0

    check-cast p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1$resp$1;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1$resp$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 126
    iget v1, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1$resp$1;->label:I

    const/4 v2, 0x5

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    iget-object p0, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1$resp$1;->L$0:Ljava/lang/Object;

    check-cast p0, Lcom/example/api/GoogleBooksResponse;

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    goto/16 :goto_3

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :try_start_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 128
    iget-object p1, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1$resp$1;->$key:Ljava/lang/String;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-static {p1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_4

    .line 130
    :try_start_2
    sget-object p1, Lcom/example/api/RetrofitClient;->INSTANCE:Lcom/example/api/RetrofitClient;

    invoke-virtual {p1}, Lcom/example/api/RetrofitClient;->getGoogleBooksService()Lcom/example/api/GoogleBooksApiService;

    move-result-object p1

    iget-object v1, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1$resp$1;->$query:Ljava/lang/String;

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v6, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1$resp$1;->$key:Ljava/lang/String;

    move-object v7, p0

    check-cast v7, Lkotlin/coroutines/Continuation;

    iput v4, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1$resp$1;->label:I

    invoke-interface {p1, v1, v2, v6, v7}, Lcom/example/api/GoogleBooksApiService;->searchBooks(Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_2

    :cond_3
    :goto_0
    check-cast p1, Lcom/example/api/GoogleBooksResponse;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    :catch_0
    :cond_4
    move-object p1, v5

    :goto_1
    if-eqz p1, :cond_5

    .line 133
    invoke-virtual {p1}, Lcom/example/api/GoogleBooksResponse;->getItems()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    if-eqz v1, :cond_5

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 135
    :cond_5
    :try_start_3
    sget-object v1, Lcom/example/api/RetrofitClient;->INSTANCE:Lcom/example/api/RetrofitClient;

    invoke-virtual {v1}, Lcom/example/api/RetrofitClient;->getGoogleBooksService()Lcom/example/api/GoogleBooksApiService;

    move-result-object v1

    iget-object v4, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1$resp$1;->$query:Ljava/lang/String;

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    move-object v6, p0

    check-cast v6, Lkotlin/coroutines/Continuation;

    iput-object p1, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1$resp$1;->L$0:Ljava/lang/Object;

    iput v3, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1$resp$1;->label:I

    invoke-interface {v1, v4, v2, v5, v6}, Lcom/example/api/GoogleBooksApiService;->searchBooks(Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    if-ne p0, v0, :cond_6

    :goto_2
    return-object v0

    :cond_6
    move-object v8, p1

    move-object p1, p0

    move-object p0, v8

    :goto_3
    :try_start_4
    check-cast p1, Lcom/example/api/GoogleBooksResponse;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_4

    :catch_1
    move-object p0, p1

    :catch_2
    move-object p1, p0

    :cond_7
    :goto_4
    return-object p1
.end method
