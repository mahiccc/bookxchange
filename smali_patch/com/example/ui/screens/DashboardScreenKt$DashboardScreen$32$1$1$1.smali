.class final Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "DashboardScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/screens/DashboardScreenKt;->DashboardScreen(Ljava/util/List;Ljava/lang/String;Lcom/example/ui/BookViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
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
    c = "com.example.ui.screens.DashboardScreenKt$DashboardScreen$32$1$1$1"
    f = "DashboardScreen.kt"
    i = {
        0x1,
        0x2,
        0x3
    }
    l = {
        0x2b6,
        0x2b8,
        0x2ba,
        0x2bd
    }
    m = "invokeSuspend"
    n = {
        "res",
        "res",
        "e"
    }
    s = {
        "L$0",
        "L$0",
        "L$0"
    }
.end annotation


# instance fields
.field final synthetic $raw:Ljava/lang/String;

.field final synthetic $snackbarHostState:Landroidx/compose/material3/SnackbarHostState;

.field final synthetic $viewModel:Lcom/example/ui/BookViewModel;

.field L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lcom/example/ui/BookViewModel;Ljava/lang/String;Landroidx/compose/material3/SnackbarHostState;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/ui/BookViewModel;",
            "Ljava/lang/String;",
            "Landroidx/compose/material3/SnackbarHostState;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$1$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$1$1$1;->$viewModel:Lcom/example/ui/BookViewModel;

    iput-object p2, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$1$1$1;->$raw:Ljava/lang/String;

    iput-object p3, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$1$1$1;->$snackbarHostState:Landroidx/compose/material3/SnackbarHostState;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
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

    new-instance p1, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$1$1$1;

    iget-object v0, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$1$1$1;->$viewModel:Lcom/example/ui/BookViewModel;

    iget-object v1, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$1$1$1;->$raw:Ljava/lang/String;

    iget-object p0, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$1$1$1;->$snackbarHostState:Landroidx/compose/material3/SnackbarHostState;

    invoke-direct {p1, v0, v1, p0, p2}, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$1$1$1;-><init>(Lcom/example/ui/BookViewModel;Ljava/lang/String;Landroidx/compose/material3/SnackbarHostState;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$1$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$1$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p0

    check-cast p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$1$1$1;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    const-string v0, "QR Error: "

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 692
    iget v2, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$1$1$1;->label:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object p0, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$1$1$1;->L$0:Ljava/lang/Object;

    check-cast p0, Ljava/lang/Exception;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_4

    :cond_4
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 694
    :try_start_1
    iget-object p1, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$1$1$1;->$viewModel:Lcom/example/ui/BookViewModel;

    iget-object v2, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$1$1$1;->$raw:Ljava/lang/String;

    move-object v7, p0

    check-cast v7, Lkotlin/coroutines/Continuation;

    iput v6, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$1$1$1;->label:I

    invoke-virtual {p1, v2, v7}, Lcom/example/ui/BookViewModel;->handleGlobalQrScan-gIAlu-s(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto/16 :goto_5

    .line 695
    :cond_5
    :goto_0
    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 698
    iget-object v6, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$1$1$1;->$snackbarHostState:Landroidx/compose/material3/SnackbarHostState;

    const/4 v7, 0x0

    if-eqz v2, :cond_9

    .line 696
    :try_start_2
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_1

    :cond_6
    move-object v7, p1

    :goto_1
    check-cast v7, Ljava/lang/String;

    if-nez v7, :cond_7

    const-string v7, "Scan successful!"

    :cond_7
    move-object v11, p0

    check-cast v11, Lkotlin/coroutines/Continuation;

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$1$1$1;->L$0:Ljava/lang/Object;

    iput v5, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$1$1$1;->label:I

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v12, 0xe

    const/4 v13, 0x0

    invoke-static/range {v6 .. v13}, Landroidx/compose/material3/SnackbarHostState;->showSnackbar$default(Landroidx/compose/material3/SnackbarHostState;Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/material3/SnackbarDuration;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto :goto_5

    :cond_8
    :goto_2
    check-cast p1, Landroidx/compose/material3/SnackbarResult;

    goto :goto_7

    .line 698
    :cond_9
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v7

    :cond_a
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    move-object v11, p0

    check-cast v11, Lkotlin/coroutines/Continuation;

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$1$1$1;->L$0:Ljava/lang/Object;

    iput v4, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$1$1$1;->label:I

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v12, 0xe

    const/4 v13, 0x0

    invoke-static/range {v6 .. v13}, Landroidx/compose/material3/SnackbarHostState;->showSnackbar$default(Landroidx/compose/material3/SnackbarHostState;Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/material3/SnackbarDuration;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    goto :goto_5

    :cond_b
    :goto_3
    check-cast p1, Landroidx/compose/material3/SnackbarResult;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_7

    .line 701
    :goto_4
    iget-object v4, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$1$1$1;->$snackbarHostState:Landroidx/compose/material3/SnackbarHostState;

    move-object v9, p0

    check-cast v9, Lkotlin/coroutines/Continuation;

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$1$1$1;->L$0:Ljava/lang/Object;

    iput v3, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$1$1$1;->label:I

    const-string v5, "Error processing QR code."

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v10, 0xe

    const/4 v11, 0x0

    invoke-static/range {v4 .. v11}, Landroidx/compose/material3/SnackbarHostState;->showSnackbar$default(Landroidx/compose/material3/SnackbarHostState;Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/material3/SnackbarDuration;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_c

    :goto_5
    return-object v1

    .line 692
    :cond_c
    :goto_6
    check-cast p1, Landroidx/compose/material3/SnackbarResult;

    .line 703
    :goto_7
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method
