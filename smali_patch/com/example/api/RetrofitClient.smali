.class public final Lcom/example/api/RetrofitClient;
.super Ljava/lang/Object;
.source "GeminiApiService.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J.\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00172\u000e\u0008\u0002\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0019H\u0086@\u00a2\u0006\u0002\u0010\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0008\u001a\u00020\t8FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\r\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/example/api/RetrofitClient;",
        "",
        "<init>",
        "()V",
        "BASE_URL",
        "",
        "okHttpClient",
        "Lokhttp3/OkHttpClient;",
        "service",
        "Lcom/example/api/GeminiApiService;",
        "getService",
        "()Lcom/example/api/GeminiApiService;",
        "service$delegate",
        "Lkotlin/Lazy;",
        "googleBooksService",
        "Lcom/example/api/GoogleBooksApiService;",
        "getGoogleBooksService",
        "()Lcom/example/api/GoogleBooksApiService;",
        "googleBooksService$delegate",
        "generateWithResilientModelChain",
        "Lcom/example/api/GenerateContentResponse;",
        "apiKey",
        "request",
        "Lcom/example/api/GenerateContentRequest;",
        "preferredModels",
        "",
        "(Ljava/lang/String;Lcom/example/api/GenerateContentRequest;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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


# static fields
.field public static final $stable:I

.field private static final BASE_URL:Ljava/lang/String; = "https://generativelanguage.googleapis.com/"

.field public static final INSTANCE:Lcom/example/api/RetrofitClient;

.field private static final googleBooksService$delegate:Lkotlin/Lazy;

.field private static final okHttpClient:Lokhttp3/OkHttpClient;

.field private static final service$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/example/api/RetrofitClient;

    invoke-direct {v0}, Lcom/example/api/RetrofitClient;-><init>()V

    sput-object v0, Lcom/example/api/RetrofitClient;->INSTANCE:Lcom/example/api/RetrofitClient;

    .line 92
    new-instance v0, Lokhttp3/OkHttpClient$Builder;

    invoke-direct {v0}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    .line 93
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x3c

    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/OkHttpClient$Builder;->connectTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    .line 94
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/OkHttpClient$Builder;->readTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    .line 95
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/OkHttpClient$Builder;->writeTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    .line 96
    invoke-virtual {v0}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    move-result-object v0

    sput-object v0, Lcom/example/api/RetrofitClient;->okHttpClient:Lokhttp3/OkHttpClient;

    .line 98
    new-instance v0, Lcom/example/api/RetrofitClient$$ExternalSyntheticLambda1;

    invoke-direct {v0}, Lcom/example/api/RetrofitClient$$ExternalSyntheticLambda1;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/example/api/RetrofitClient;->service$delegate:Lkotlin/Lazy;

    .line 108
    new-instance v0, Lcom/example/api/RetrofitClient$$ExternalSyntheticLambda2;

    invoke-direct {v0}, Lcom/example/api/RetrofitClient$$ExternalSyntheticLambda2;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/example/api/RetrofitClient;->googleBooksService$delegate:Lkotlin/Lazy;

    const/16 v0, 0x8

    sput v0, Lcom/example/api/RetrofitClient;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 89
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic generateWithResilientModelChain$default(Lcom/example/api/RetrofitClient;Ljava/lang/String;Lcom/example/api/GenerateContentRequest;Ljava/util/List;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 p6, 0x4

    and-int/2addr p5, p6

    if-eqz p5, :cond_0

    const/4 p3, 0x5

    .line 125
    new-array p3, p3, [Ljava/lang/String;

    const/4 p5, 0x0

    const-string v0, "gemini-3.5-flash-lite"

    aput-object v0, p3, p5

    const/4 p5, 0x1

    const-string v0, "gemini-3.1-flash-lite"

    aput-object v0, p3, p5

    const/4 p5, 0x2

    const-string v0, "gemini-3.6-flash"

    aput-object v0, p3, p5

    const/4 p5, 0x3

    const-string v0, "gemini-3.8-flash"

    aput-object v0, p3, p5

    const-string p5, "gemini-3.5-flash"

    aput-object p5, p3, p6

    invoke-static {p3}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    .line 122
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/example/api/RetrofitClient;->generateWithResilientModelChain(Ljava/lang/String;Lcom/example/api/GenerateContentRequest;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method static final googleBooksService_delegate$lambda$3()Lcom/example/api/GoogleBooksApiService;
    .locals 4

    .line 109
    new-instance v0, Lcom/example/api/RetrofitClient$$ExternalSyntheticLambda3;

    invoke-direct {v0}, Lcom/example/api/RetrofitClient$$ExternalSyntheticLambda3;-><init>()V

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v2}, Lkotlinx/serialization/json/JsonKt;->Json$default(Lkotlinx/serialization/json/Json;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lkotlinx/serialization/json/Json;

    move-result-object v0

    .line 110
    new-instance v1, Lretrofit2/Retrofit$Builder;

    invoke-direct {v1}, Lretrofit2/Retrofit$Builder;-><init>()V

    .line 111
    const-string v2, "https://www.googleapis.com/"

    invoke-virtual {v1, v2}, Lretrofit2/Retrofit$Builder;->baseUrl(Ljava/lang/String;)Lretrofit2/Retrofit$Builder;

    move-result-object v1

    .line 112
    sget-object v2, Lcom/example/api/RetrofitClient;->okHttpClient:Lokhttp3/OkHttpClient;

    invoke-virtual {v1, v2}, Lretrofit2/Retrofit$Builder;->client(Lokhttp3/OkHttpClient;)Lretrofit2/Retrofit$Builder;

    move-result-object v1

    .line 113
    check-cast v0, Lkotlinx/serialization/StringFormat;

    sget-object v2, Lokhttp3/MediaType;->Companion:Lokhttp3/MediaType$Companion;

    const-string v3, "application/json"

    invoke-virtual {v2, v3}, Lokhttp3/MediaType$Companion;->get(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v2

    invoke-static {v0, v2}, Lretrofit2/converter/kotlinx/serialization/KotlinSerializationConverterFactory;->create(Lkotlinx/serialization/StringFormat;Lokhttp3/MediaType;)Lretrofit2/Converter$Factory;

    move-result-object v0

    invoke-virtual {v1, v0}, Lretrofit2/Retrofit$Builder;->addConverterFactory(Lretrofit2/Converter$Factory;)Lretrofit2/Retrofit$Builder;

    move-result-object v0

    .line 114
    invoke-virtual {v0}, Lretrofit2/Retrofit$Builder;->build()Lretrofit2/Retrofit;

    move-result-object v0

    .line 115
    const-class v1, Lcom/example/api/GoogleBooksApiService;

    invoke-virtual {v0, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/example/api/GoogleBooksApiService;

    return-object v0
.end method

.method static final googleBooksService_delegate$lambda$3$lambda$2(Lkotlinx/serialization/json/JsonBuilder;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$Json"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 109
    invoke-virtual {p0, v0}, Lkotlinx/serialization/json/JsonBuilder;->setIgnoreUnknownKeys(Z)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method static final service_delegate$lambda$1()Lcom/example/api/GeminiApiService;
    .locals 4

    .line 99
    new-instance v0, Lcom/example/api/RetrofitClient$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/example/api/RetrofitClient$$ExternalSyntheticLambda0;-><init>()V

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v2}, Lkotlinx/serialization/json/JsonKt;->Json$default(Lkotlinx/serialization/json/Json;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lkotlinx/serialization/json/Json;

    move-result-object v0

    .line 100
    new-instance v1, Lretrofit2/Retrofit$Builder;

    invoke-direct {v1}, Lretrofit2/Retrofit$Builder;-><init>()V

    .line 101
    const-string v2, "https://generativelanguage.googleapis.com/"

    invoke-virtual {v1, v2}, Lretrofit2/Retrofit$Builder;->baseUrl(Ljava/lang/String;)Lretrofit2/Retrofit$Builder;

    move-result-object v1

    .line 102
    sget-object v2, Lcom/example/api/RetrofitClient;->okHttpClient:Lokhttp3/OkHttpClient;

    invoke-virtual {v1, v2}, Lretrofit2/Retrofit$Builder;->client(Lokhttp3/OkHttpClient;)Lretrofit2/Retrofit$Builder;

    move-result-object v1

    .line 103
    check-cast v0, Lkotlinx/serialization/StringFormat;

    sget-object v2, Lokhttp3/MediaType;->Companion:Lokhttp3/MediaType$Companion;

    const-string v3, "application/json"

    invoke-virtual {v2, v3}, Lokhttp3/MediaType$Companion;->get(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v2

    invoke-static {v0, v2}, Lretrofit2/converter/kotlinx/serialization/KotlinSerializationConverterFactory;->create(Lkotlinx/serialization/StringFormat;Lokhttp3/MediaType;)Lretrofit2/Converter$Factory;

    move-result-object v0

    invoke-virtual {v1, v0}, Lretrofit2/Retrofit$Builder;->addConverterFactory(Lretrofit2/Converter$Factory;)Lretrofit2/Retrofit$Builder;

    move-result-object v0

    .line 104
    invoke-virtual {v0}, Lretrofit2/Retrofit$Builder;->build()Lretrofit2/Retrofit;

    move-result-object v0

    .line 105
    const-class v1, Lcom/example/api/GeminiApiService;

    invoke-virtual {v0, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/example/api/GeminiApiService;

    return-object v0
.end method

.method static final service_delegate$lambda$1$lambda$0(Lkotlinx/serialization/json/JsonBuilder;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$Json"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 99
    invoke-virtual {p0, v0}, Lkotlinx/serialization/json/JsonBuilder;->setIgnoreUnknownKeys(Z)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final generateWithResilientModelChain(Ljava/lang/String;Lcom/example/api/GenerateContentRequest;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/example/api/GenerateContentRequest;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/api/GenerateContentResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/example/api/RetrofitClient$generateWithResilientModelChain$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/example/api/RetrofitClient$generateWithResilientModelChain$1;

    iget v1, v0, Lcom/example/api/RetrofitClient$generateWithResilientModelChain$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/example/api/RetrofitClient$generateWithResilientModelChain$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/example/api/RetrofitClient$generateWithResilientModelChain$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/example/api/RetrofitClient$generateWithResilientModelChain$1;

    invoke-direct {v0, p0, p4}, Lcom/example/api/RetrofitClient$generateWithResilientModelChain$1;-><init>(Lcom/example/api/RetrofitClient;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/example/api/RetrofitClient$generateWithResilientModelChain$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 122
    iget v2, v0, Lcom/example/api/RetrofitClient$generateWithResilientModelChain$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/example/api/RetrofitClient$generateWithResilientModelChain$1;->L$5:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lcom/example/api/RetrofitClient$generateWithResilientModelChain$1;->L$4:Ljava/lang/Object;

    check-cast p1, Ljava/util/Iterator;

    iget-object p2, v0, Lcom/example/api/RetrofitClient$generateWithResilientModelChain$1;->L$3:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Exception;

    iget-object p2, v0, Lcom/example/api/RetrofitClient$generateWithResilientModelChain$1;->L$2:Ljava/lang/Object;

    check-cast p2, Ljava/util/List;

    iget-object p3, v0, Lcom/example/api/RetrofitClient$generateWithResilientModelChain$1;->L$1:Ljava/lang/Object;

    check-cast p3, Lcom/example/api/GenerateContentRequest;

    iget-object v2, v0, Lcom/example/api/RetrofitClient$generateWithResilientModelChain$1;->L$0:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    :try_start_0
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p4

    :catch_0
    move-exception p4

    move-object v7, p4

    move-object p4, p2

    move-object p2, v2

    move-object v2, v7

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 128
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p4

    const/4 v2, 0x0

    move-object v7, p2

    move-object p2, p1

    move-object p1, p4

    move-object p4, p3

    move-object p3, v7

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 130
    :try_start_1
    invoke-virtual {p0}, Lcom/example/api/RetrofitClient;->getService()Lcom/example/api/GeminiApiService;

    move-result-object v5

    iput-object p2, v0, Lcom/example/api/RetrofitClient$generateWithResilientModelChain$1;->L$0:Ljava/lang/Object;

    iput-object p3, v0, Lcom/example/api/RetrofitClient$generateWithResilientModelChain$1;->L$1:Ljava/lang/Object;

    invoke-static {p4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v0, Lcom/example/api/RetrofitClient$generateWithResilientModelChain$1;->L$2:Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lcom/example/api/RetrofitClient$generateWithResilientModelChain$1;->L$3:Ljava/lang/Object;

    iput-object p1, v0, Lcom/example/api/RetrofitClient$generateWithResilientModelChain$1;->L$4:Ljava/lang/Object;

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lcom/example/api/RetrofitClient$generateWithResilientModelChain$1;->L$5:Ljava/lang/Object;

    iput v3, v0, Lcom/example/api/RetrofitClient$generateWithResilientModelChain$1;->label:I

    invoke-interface {v5, v4, p2, p3, v0}, Lcom/example/api/GeminiApiService;->generateContentWithModel(Ljava/lang/String;Ljava/lang/String;Lcom/example/api/GenerateContentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    return-object p0

    :catch_1
    move-exception v2

    goto :goto_1

    :cond_4
    if-eqz v2, :cond_5

    .line 135
    check-cast v2, Ljava/lang/Throwable;

    goto :goto_2

    :cond_5
    new-instance p0, Ljava/lang/RuntimeException;

    const-string p1, "All Gemini models failed"

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    move-object v2, p0

    check-cast v2, Ljava/lang/Throwable;

    :goto_2
    throw v2
.end method

.method public final getGoogleBooksService()Lcom/example/api/GoogleBooksApiService;
    .locals 1

    .line 108
    sget-object p0, Lcom/example/api/RetrofitClient;->googleBooksService$delegate:Lkotlin/Lazy;

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    const-string v0, "getValue(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/example/api/GoogleBooksApiService;

    return-object p0
.end method

.method public final getService()Lcom/example/api/GeminiApiService;
    .locals 1

    .line 98
    sget-object p0, Lcom/example/api/RetrofitClient;->service$delegate:Lkotlin/Lazy;

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    const-string v0, "getValue(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/example/api/GeminiApiService;

    return-object p0
.end method
