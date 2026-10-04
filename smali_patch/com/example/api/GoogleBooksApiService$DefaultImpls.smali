.class public final Lcom/example/api/GoogleBooksApiService$DefaultImpls;
.super Ljava/lang/Object;
.source "GoogleBooksApiService.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/example/api/GoogleBooksApiService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
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


# direct methods
.method public static synthetic searchBooks$default(Lcom/example/api/GoogleBooksApiService;Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 84
    invoke-static/range {p0 .. p6}, Lcom/example/api/GoogleBooksApiService;->searchBooks$default(Lcom/example/api/GoogleBooksApiService;Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
