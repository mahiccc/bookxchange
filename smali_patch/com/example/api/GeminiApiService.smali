.class public interface abstract Lcom/example/api/GeminiApiService;
.super Ljava/lang/Object;
.source "GeminiApiService.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008f\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\u0008J,\u0010\t\u001a\u00020\u00032\u0008\u0008\u0001\u0010\n\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\u000c\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/example/api/GeminiApiService;",
        "",
        "generateContent",
        "Lcom/example/api/GenerateContentResponse;",
        "apiKey",
        "",
        "request",
        "Lcom/example/api/GenerateContentRequest;",
        "(Ljava/lang/String;Lcom/example/api/GenerateContentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "generateContentWithModel",
        "model",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/example/api/GenerateContentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "app"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract generateContent(Ljava/lang/String;Lcom/example/api/GenerateContentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "key"
        .end annotation
    .end param
    .param p2    # Lcom/example/api/GenerateContentRequest;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/example/api/GenerateContentRequest;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/api/GenerateContentResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v1beta/models/gemini-3.5-flash-lite:generateContent"
    .end annotation
.end method

.method public abstract generateContentWithModel(Ljava/lang/String;Ljava/lang/String;Lcom/example/api/GenerateContentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Path;
            value = "model"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "key"
        .end annotation
    .end param
    .param p3    # Lcom/example/api/GenerateContentRequest;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/example/api/GenerateContentRequest;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/api/GenerateContentResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v1beta/models/{model}:generateContent"
    .end annotation
.end method
