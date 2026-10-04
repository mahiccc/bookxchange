.class public interface abstract Lcom/example/data/GeminiApiService;
.super Ljava/lang/Object;
.source "GeminiApiService.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\u0008\u00a8\u0006\t\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/example/data/GeminiApiService;",
        "",
        "generateContent",
        "Lcom/example/data/GenerateContentResponse;",
        "apiKey",
        "",
        "request",
        "Lcom/example/data/GenerateContentRequest;",
        "(Ljava/lang/String;Lcom/example/data/GenerateContentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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
.method public abstract generateContent(Ljava/lang/String;Lcom/example/data/GenerateContentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "key"
        .end annotation
    .end param
    .param p2    # Lcom/example/data/GenerateContentRequest;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/example/data/GenerateContentRequest;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/data/GenerateContentResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v1beta/models/gemini-3.5-flash-lite:generateContent"
    .end annotation
.end method
