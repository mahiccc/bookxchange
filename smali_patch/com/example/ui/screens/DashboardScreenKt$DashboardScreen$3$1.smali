.class final Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$3$1;
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
    c = "com.example.ui.screens.DashboardScreenKt$DashboardScreen$3$1"
    f = "DashboardScreen.kt"
    i = {
        0x0
    }
    l = {
        0xd8
    }
    m = "invokeSuspend"
    n = {
        "photo"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field final synthetic $aiVerificationAssessment$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $currentBookForScan$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/example/data/Book;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $isVerifyingAI$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $scannedCondition$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $showReturnDialog$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $viewModel:Lcom/example/ui/BookViewModel;

.field L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lcom/example/ui/BookViewModel;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/ui/BookViewModel;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/example/data/Book;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$3$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$3$1;->$viewModel:Lcom/example/ui/BookViewModel;

    iput-object p2, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$3$1;->$showReturnDialog$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p3, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$3$1;->$currentBookForScan$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p4, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$3$1;->$isVerifyingAI$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$3$1;->$aiVerificationAssessment$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$3$1;->$scannedCondition$delegate:Landroidx/compose/runtime/MutableState;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 8
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

    new-instance v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$3$1;

    iget-object v1, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$3$1;->$viewModel:Lcom/example/ui/BookViewModel;

    iget-object v2, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$3$1;->$showReturnDialog$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v3, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$3$1;->$currentBookForScan$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v4, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$3$1;->$isVerifyingAI$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v5, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$3$1;->$aiVerificationAssessment$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v6, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$3$1;->$scannedCondition$delegate:Landroidx/compose/runtime/MutableState;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$3$1;-><init>(Lcom/example/ui/BookViewModel;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$3$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$3$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p0

    check-cast p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$3$1;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$3$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 209
    iget v1, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$3$1;->label:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v4, :cond_0

    iget-object v0, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$3$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_2

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 210
    iget-object p1, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$3$1;->$showReturnDialog$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1}, Lcom/example/ui/screens/DashboardScreenKt;->access$DashboardScreen$lambda$59(Landroidx/compose/runtime/MutableState;)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$3$1;->$currentBookForScan$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1}, Lcom/example/ui/screens/DashboardScreenKt;->access$DashboardScreen$lambda$53(Landroidx/compose/runtime/MutableState;)Lcom/example/data/Book;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 211
    iget-object p1, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$3$1;->$currentBookForScan$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1}, Lcom/example/ui/screens/DashboardScreenKt;->access$DashboardScreen$lambda$53(Landroidx/compose/runtime/MutableState;)Lcom/example/data/Book;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/example/data/Book;->getReturnImageUrl()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$3$1;->$currentBookForScan$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1}, Lcom/example/ui/screens/DashboardScreenKt;->access$DashboardScreen$lambda$53(Landroidx/compose/runtime/MutableState;)Lcom/example/data/Book;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/example/data/Book;->getImageUrl()Ljava/lang/String;

    move-result-object p1

    .line 212
    :cond_2
    move-object v1, p1

    check-cast v1, Ljava/lang/CharSequence;

    if-eqz v1, :cond_5

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_3

    .line 213
    :cond_3
    iget-object v1, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$3$1;->$isVerifyingAI$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1, v4}, Lcom/example/ui/screens/DashboardScreenKt;->access$DashboardScreen$lambda$90(Landroidx/compose/runtime/MutableState;Z)V

    .line 214
    iget-object v1, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$3$1;->$aiVerificationAssessment$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1, v2}, Lcom/example/ui/screens/DashboardScreenKt;->access$DashboardScreen$lambda$87(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    .line 216
    :try_start_1
    iget-object v1, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$3$1;->$viewModel:Lcom/example/ui/BookViewModel;

    .line 217
    iget-object v5, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$3$1;->$currentBookForScan$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v5}, Lcom/example/ui/screens/DashboardScreenKt;->access$DashboardScreen$lambda$53(Landroidx/compose/runtime/MutableState;)Lcom/example/data/Book;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v5}, Lcom/example/data/Book;->getTitle()Ljava/lang/String;

    move-result-object v5

    .line 218
    iget-object v6, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$3$1;->$currentBookForScan$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v6}, Lcom/example/ui/screens/DashboardScreenKt;->access$DashboardScreen$lambda$53(Landroidx/compose/runtime/MutableState;)Lcom/example/data/Book;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v6}, Lcom/example/data/Book;->getCondition()Ljava/lang/String;

    move-result-object v6

    .line 219
    move-object v7, p0

    check-cast v7, Lkotlin/coroutines/Continuation;

    .line 216
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$3$1;->L$0:Ljava/lang/Object;

    iput v4, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$3$1;->label:I

    invoke-virtual {v1, v5, v6, p1, v7}, Lcom/example/ui/BookViewModel;->verifyBookConditionWithAI(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_0
    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 221
    iget-object v1, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$3$1;->$scannedCondition$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1, v0}, Lcom/example/ui/screens/DashboardScreenKt;->access$DashboardScreen$lambda$57(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    .line 222
    iget-object v0, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$3$1;->$aiVerificationAssessment$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v0, p1}, Lcom/example/ui/screens/DashboardScreenKt;->access$DashboardScreen$lambda$87(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 224
    :catch_0
    :try_start_2
    iget-object p1, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$3$1;->$aiVerificationAssessment$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1, v2}, Lcom/example/ui/screens/DashboardScreenKt;->access$DashboardScreen$lambda$87(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 226
    :goto_1
    iget-object p0, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$3$1;->$isVerifyingAI$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p0, v3}, Lcom/example/ui/screens/DashboardScreenKt;->access$DashboardScreen$lambda$90(Landroidx/compose/runtime/MutableState;Z)V

    goto :goto_3

    :goto_2
    iget-object p0, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$3$1;->$isVerifyingAI$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p0, v3}, Lcom/example/ui/screens/DashboardScreenKt;->access$DashboardScreen$lambda$90(Landroidx/compose/runtime/MutableState;Z)V

    throw p1

    .line 230
    :cond_5
    :goto_3
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method
