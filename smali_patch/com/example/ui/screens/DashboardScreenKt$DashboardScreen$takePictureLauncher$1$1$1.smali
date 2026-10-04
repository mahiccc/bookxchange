.class final Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;
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
    c = "com.example.ui.screens.DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1"
    f = "DashboardScreen.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1,
        0x2,
        0x2,
        0x3,
        0x3
    }
    l = {
        0xaf,
        0xb7,
        0xba,
        0xbd
    }
    m = "invokeSuspend"
    n = {
        "aiCond",
        "aiNote",
        "aiCond",
        "aiNote",
        "aiCond",
        "aiNote",
        "aiCond",
        "aiNote"
    }
    s = {
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$0",
        "L$1"
    }
.end annotation


# instance fields
.field final synthetic $base64Str:Ljava/lang/String;

.field final synthetic $bookToScan:Lcom/example/data/Book;

.field final synthetic $returnRating$delegate:Landroidx/compose/runtime/MutableIntState;

.field final synthetic $scanMode$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $snackbarHostState:Landroidx/compose/material3/SnackbarHostState;

.field final synthetic $viewModel:Lcom/example/ui/BookViewModel;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lcom/example/data/Book;Lcom/example/ui/BookViewModel;Ljava/lang/String;Landroidx/compose/material3/SnackbarHostState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableIntState;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/data/Book;",
            "Lcom/example/ui/BookViewModel;",
            "Ljava/lang/String;",
            "Landroidx/compose/material3/SnackbarHostState;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableIntState;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->$bookToScan:Lcom/example/data/Book;

    iput-object p2, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->$viewModel:Lcom/example/ui/BookViewModel;

    iput-object p3, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->$base64Str:Ljava/lang/String;

    iput-object p4, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->$snackbarHostState:Landroidx/compose/material3/SnackbarHostState;

    iput-object p5, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->$scanMode$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->$returnRating$delegate:Landroidx/compose/runtime/MutableIntState;

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

    new-instance v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;

    iget-object v1, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->$bookToScan:Lcom/example/data/Book;

    iget-object v2, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->$viewModel:Lcom/example/ui/BookViewModel;

    iget-object v3, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->$base64Str:Ljava/lang/String;

    iget-object v4, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->$snackbarHostState:Landroidx/compose/material3/SnackbarHostState;

    iget-object v5, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->$scanMode$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v6, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->$returnRating$delegate:Landroidx/compose/runtime/MutableIntState;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;-><init>(Lcom/example/data/Book;Lcom/example/ui/BookViewModel;Ljava/lang/String;Landroidx/compose/material3/SnackbarHostState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableIntState;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p0

    check-cast p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 171
    iget v2, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->label:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v6, :cond_2

    if-eq v2, v5, :cond_1

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
    iget-object v1, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v0, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_2
    iget-object v2, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->L$1:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v6, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->L$0:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    move-object v7, v6

    move-object/from16 v6, p1

    goto :goto_1

    :cond_3
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 172
    iget-object v2, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->$bookToScan:Lcom/example/data/Book;

    invoke-virtual {v2}, Lcom/example/data/Book;->getCondition()Ljava/lang/String;

    move-result-object v2

    .line 173
    const-string v7, "Condition verified via camera inspection."

    .line 175
    :try_start_1
    iget-object v8, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->$viewModel:Lcom/example/ui/BookViewModel;

    iget-object v9, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->$bookToScan:Lcom/example/data/Book;

    invoke-virtual {v9}, Lcom/example/data/Book;->getTitle()Ljava/lang/String;

    move-result-object v9

    iget-object v10, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->$bookToScan:Lcom/example/data/Book;

    invoke-virtual {v10}, Lcom/example/data/Book;->getCondition()Ljava/lang/String;

    move-result-object v10

    iget-object v11, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->$base64Str:Ljava/lang/String;

    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v12, v0

    check-cast v12, Lkotlin/coroutines/Continuation;

    iput-object v2, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->L$0:Ljava/lang/Object;

    iput-object v7, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->L$1:Ljava/lang/Object;

    iput v6, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->label:I

    invoke-virtual {v8, v9, v10, v11, v12}, Lcom/example/ui/BookViewModel;->verifyBookConditionWithAI(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v6
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    if-ne v6, v1, :cond_4

    goto/16 :goto_4

    :cond_4
    move-object/from16 v23, v7

    move-object v7, v2

    move-object/from16 v2, v23

    .line 171
    :goto_1
    :try_start_2
    check-cast v6, Lkotlin/Pair;

    .line 176
    invoke-virtual {v6}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 177
    :try_start_3
    invoke-virtual {v6}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_3

    :catch_0
    move-object v6, v8

    goto :goto_2

    :catch_1
    move-object v6, v7

    goto :goto_2

    :catch_2
    move-object v6, v2

    move-object v2, v7

    :catch_3
    :goto_2
    move-object v8, v6

    move-object v6, v2

    .line 181
    :goto_3
    iget-object v2, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->$scanMode$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v2}, Lcom/example/ui/screens/DashboardScreenKt;->access$DashboardScreen$lambda$50(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v2

    const-string v7, "HANDOVER"

    invoke-static {v2, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 182
    iget-object v2, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->$viewModel:Lcom/example/ui/BookViewModel;

    iget-object v3, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->$bookToScan:Lcom/example/data/Book;

    iget-object v4, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->$base64Str:Ljava/lang/String;

    invoke-virtual {v2, v3, v4, v8, v6}, Lcom/example/ui/BookViewModel;->transferBookInitiated(Lcom/example/data/Book;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    iget-object v9, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->$snackbarHostState:Landroidx/compose/material3/SnackbarHostState;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Handover scan analyzed by AI ("

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ")! Please show your Handover QR."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    move-object v14, v0

    check-cast v14, Lkotlin/coroutines/Continuation;

    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->L$0:Ljava/lang/Object;

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->L$1:Ljava/lang/Object;

    iput v5, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->label:I

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v15, 0xe

    const/16 v16, 0x0

    invoke-static/range {v9 .. v16}, Landroidx/compose/material3/SnackbarHostState;->showSnackbar$default(Landroidx/compose/material3/SnackbarHostState;Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/material3/SnackbarDuration;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_7

    goto/16 :goto_4

    .line 184
    :cond_5
    iget-object v2, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->$scanMode$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v2}, Lcom/example/ui/screens/DashboardScreenKt;->access$DashboardScreen$lambda$50(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v2

    const-string v5, "BORROWER_RETURN"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 185
    iget-object v2, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->$viewModel:Lcom/example/ui/BookViewModel;

    iget-object v3, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->$bookToScan:Lcom/example/data/Book;

    iget-object v5, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->$base64Str:Ljava/lang/String;

    invoke-virtual {v2, v3, v5, v8, v6}, Lcom/example/ui/BookViewModel;->initiateReturn(Lcom/example/data/Book;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    iget-object v9, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->$snackbarHostState:Landroidx/compose/material3/SnackbarHostState;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Return scan analyzed by AI ("

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ")! Please show your Return QR."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    move-object v14, v0

    check-cast v14, Lkotlin/coroutines/Continuation;

    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->L$0:Ljava/lang/Object;

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->L$1:Ljava/lang/Object;

    iput v4, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->label:I

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v15, 0xe

    const/16 v16, 0x0

    invoke-static/range {v9 .. v16}, Landroidx/compose/material3/SnackbarHostState;->showSnackbar$default(Landroidx/compose/material3/SnackbarHostState;Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/material3/SnackbarDuration;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_7

    goto :goto_4

    .line 187
    :cond_6
    iget-object v2, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->$scanMode$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v2}, Lcom/example/ui/screens/DashboardScreenKt;->access$DashboardScreen$lambda$50(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "RETURN"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 188
    iget-object v9, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->$viewModel:Lcom/example/ui/BookViewModel;

    iget-object v10, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->$bookToScan:Lcom/example/data/Book;

    iget-object v2, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->$returnRating$delegate:Landroidx/compose/runtime/MutableIntState;

    invoke-static {v2}, Lcom/example/ui/screens/DashboardScreenKt;->access$DashboardScreen$lambda$83(Landroidx/compose/runtime/MutableIntState;)I

    move-result v2

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v11

    const/4 v13, 0x4

    const/4 v14, 0x0

    const/4 v12, 0x0

    invoke-static/range {v9 .. v14}, Lcom/example/ui/BookViewModel;->confirmAndCompleteReturn-0E7RQCE$default(Lcom/example/ui/BookViewModel;Lcom/example/data/Book;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Object;

    .line 189
    iget-object v15, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->$snackbarHostState:Landroidx/compose/material3/SnackbarHostState;

    move-object/from16 v20, v0

    check-cast v20, Lkotlin/coroutines/Continuation;

    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->L$0:Ljava/lang/Object;

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1;->label:I

    const-string v16, "Return confirmed successfully!"

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0xe

    const/16 v22, 0x0

    invoke-static/range {v15 .. v22}, Landroidx/compose/material3/SnackbarHostState;->showSnackbar$default(Landroidx/compose/material3/SnackbarHostState;Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/material3/SnackbarDuration;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_7

    :goto_4
    return-object v1

    .line 191
    :cond_7
    :goto_5
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method
