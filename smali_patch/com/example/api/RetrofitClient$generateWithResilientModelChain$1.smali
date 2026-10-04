.class final Lcom/example/api/RetrofitClient$generateWithResilientModelChain$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "GeminiApiService.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/api/RetrofitClient;->generateWithResilientModelChain(Ljava/lang/String;Lcom/example/api/GenerateContentRequest;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.example.api.RetrofitClient"
    f = "GeminiApiService.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0x82
    }
    m = "generateWithResilientModelChain"
    n = {
        "apiKey",
        "request",
        "preferredModels",
        "lastException",
        "model"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$5"
    }
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcom/example/api/RetrofitClient;


# direct methods
.method constructor <init>(Lcom/example/api/RetrofitClient;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/api/RetrofitClient;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/api/RetrofitClient$generateWithResilientModelChain$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/api/RetrofitClient$generateWithResilientModelChain$1;->this$0:Lcom/example/api/RetrofitClient;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/example/api/RetrofitClient$generateWithResilientModelChain$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcom/example/api/RetrofitClient$generateWithResilientModelChain$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/example/api/RetrofitClient$generateWithResilientModelChain$1;->label:I

    iget-object p1, p0, Lcom/example/api/RetrofitClient$generateWithResilientModelChain$1;->this$0:Lcom/example/api/RetrofitClient;

    const/4 v0, 0x0

    check-cast p0, Lkotlin/coroutines/Continuation;

    invoke-virtual {p1, v0, v0, v0, p0}, Lcom/example/api/RetrofitClient;->generateWithResilientModelChain(Ljava/lang/String;Lcom/example/api/GenerateContentRequest;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
