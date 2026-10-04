.class final Lcom/example/ui/screens/ChatScreenKt$ChatScreen$takePictureLauncher$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ChatScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/screens/ChatScreenKt;->ChatScreen(Ljava/lang/String;Lcom/example/ui/BookViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
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
    c = "com.example.ui.screens.ChatScreenKt$ChatScreen$takePictureLauncher$1$1$1"
    f = "ChatScreen.kt"
    i = {}
    l = {
        0x7f
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $aiAssessmentResult$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $aiConditionResult$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $base64Str:Ljava/lang/String;

.field final synthetic $book:Lcom/example/data/Book;

.field final synthetic $isAnalyzingAi$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $viewModel:Lcom/example/ui/BookViewModel;

.field label:I


# direct methods
.method constructor <init>(Lcom/example/ui/BookViewModel;Lcom/example/data/Book;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/ui/BookViewModel;",
            "Lcom/example/data/Book;",
            "Ljava/lang/String;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/ui/screens/ChatScreenKt$ChatScreen$takePictureLauncher$1$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$takePictureLauncher$1$1$1;->$viewModel:Lcom/example/ui/BookViewModel;

    iput-object p2, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$takePictureLauncher$1$1$1;->$book:Lcom/example/data/Book;

    iput-object p3, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$takePictureLauncher$1$1$1;->$base64Str:Ljava/lang/String;

    iput-object p4, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$takePictureLauncher$1$1$1;->$aiConditionResult$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$takePictureLauncher$1$1$1;->$aiAssessmentResult$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$takePictureLauncher$1$1$1;->$isAnalyzingAi$delegate:Landroidx/compose/runtime/MutableState;

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

    new-instance v0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$takePictureLauncher$1$1$1;

    iget-object v1, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$takePictureLauncher$1$1$1;->$viewModel:Lcom/example/ui/BookViewModel;

    iget-object v2, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$takePictureLauncher$1$1$1;->$book:Lcom/example/data/Book;

    iget-object v3, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$takePictureLauncher$1$1$1;->$base64Str:Ljava/lang/String;

    iget-object v4, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$takePictureLauncher$1$1$1;->$aiConditionResult$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v5, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$takePictureLauncher$1$1$1;->$aiAssessmentResult$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v6, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$takePictureLauncher$1$1$1;->$isAnalyzingAi$delegate:Landroidx/compose/runtime/MutableState;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$takePictureLauncher$1$1$1;-><init>(Lcom/example/ui/BookViewModel;Lcom/example/data/Book;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$takePictureLauncher$1$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$takePictureLauncher$1$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p0

    check-cast p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$takePictureLauncher$1$1$1;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$takePictureLauncher$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 125
    iget v1, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$takePictureLauncher$1$1$1;->label:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 127
    :try_start_1
    iget-object p1, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$takePictureLauncher$1$1$1;->$viewModel:Lcom/example/ui/BookViewModel;

    .line 128
    iget-object v1, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$takePictureLauncher$1$1$1;->$book:Lcom/example/data/Book;

    invoke-virtual {v1}, Lcom/example/data/Book;->getTitle()Ljava/lang/String;

    move-result-object v1

    .line 129
    iget-object v4, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$takePictureLauncher$1$1$1;->$book:Lcom/example/data/Book;

    invoke-virtual {v4}, Lcom/example/data/Book;->getCondition()Ljava/lang/String;

    move-result-object v4

    .line 130
    iget-object v5, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$takePictureLauncher$1$1$1;->$base64Str:Ljava/lang/String;

    move-object v6, p0

    check-cast v6, Lkotlin/coroutines/Continuation;

    .line 127
    iput v2, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$takePictureLauncher$1$1$1;->label:I

    invoke-virtual {p1, v1, v4, v5, v6}, Lcom/example/ui/BookViewModel;->verifyBookConditionWithAI(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 132
    iget-object v1, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$takePictureLauncher$1$1$1;->$aiConditionResult$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1, v0}, Lcom/example/ui/screens/ChatScreenKt;->access$ChatScreen$lambda$52(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    .line 133
    iget-object v0, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$takePictureLauncher$1$1$1;->$aiAssessmentResult$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v0, p1}, Lcom/example/ui/screens/ChatScreenKt;->access$ChatScreen$lambda$55(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 135
    :catch_0
    :try_start_2
    iget-object p1, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$takePictureLauncher$1$1$1;->$aiConditionResult$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v0, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$takePictureLauncher$1$1$1;->$book:Lcom/example/data/Book;

    invoke-virtual {v0}, Lcom/example/data/Book;->getCondition()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/example/ui/screens/ChatScreenKt;->access$ChatScreen$lambda$52(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    .line 136
    iget-object p1, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$takePictureLauncher$1$1$1;->$aiAssessmentResult$delegate:Landroidx/compose/runtime/MutableState;

    const-string v0, "Condition inspected and photo recorded."

    invoke-static {p1, v0}, Lcom/example/ui/screens/ChatScreenKt;->access$ChatScreen$lambda$55(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 138
    :goto_1
    iget-object p0, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$takePictureLauncher$1$1$1;->$isAnalyzingAi$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p0, v3}, Lcom/example/ui/screens/ChatScreenKt;->access$ChatScreen$lambda$49(Landroidx/compose/runtime/MutableState;Z)V

    .line 140
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0

    .line 138
    :goto_2
    iget-object p0, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$takePictureLauncher$1$1$1;->$isAnalyzingAi$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p0, v3}, Lcom/example/ui/screens/ChatScreenKt;->access$ChatScreen$lambda$49(Landroidx/compose/runtime/MutableState;Z)V

    throw p1
.end method
