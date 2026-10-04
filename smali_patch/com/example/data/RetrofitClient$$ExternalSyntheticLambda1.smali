.class public final synthetic Lcom/example/data/RetrofitClient$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 0

    .line 0
    invoke-static {}, Lcom/example/data/RetrofitClient;->service_delegate$lambda$1()Lcom/example/data/GeminiApiService;

    move-result-object p0

    return-object p0
.end method
