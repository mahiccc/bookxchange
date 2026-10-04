.class final Lcom/example/ui/screens/ChatScreenKt$ChatScreen$3$1;
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
    c = "com.example.ui.screens.ChatScreenKt$ChatScreen$3$1"
    f = "ChatScreen.kt"
    i = {}
    l = {
        0xe6
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $aiMeetingRecommendation$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $aiProcessing$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $aiSuggestion$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $bookId:Ljava/lang/String;

.field final synthetic $currentUser$delegate:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $messages$delegate:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Ljava/util/List<",
            "Lcom/example/data/Message;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $otherUserName$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $viewModel:Lcom/example/ui/BookViewModel;

.field label:I


# direct methods
.method constructor <init>(Lcom/example/ui/BookViewModel;Ljava/lang/String;Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/ui/BookViewModel;",
            "Ljava/lang/String;",
            "Landroidx/compose/runtime/State<",
            "+",
            "Ljava/util/List<",
            "Lcom/example/data/Message;",
            ">;>;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/ui/screens/ChatScreenKt$ChatScreen$3$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$3$1;->$viewModel:Lcom/example/ui/BookViewModel;

    iput-object p2, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$3$1;->$bookId:Ljava/lang/String;

    iput-object p3, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$3$1;->$messages$delegate:Landroidx/compose/runtime/State;

    iput-object p4, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$3$1;->$aiProcessing$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$3$1;->$currentUser$delegate:Landroidx/compose/runtime/State;

    iput-object p6, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$3$1;->$otherUserName$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p7, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$3$1;->$aiSuggestion$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p8, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$3$1;->$aiMeetingRecommendation$delegate:Landroidx/compose/runtime/MutableState;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p9}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 10
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

    new-instance v0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$3$1;

    iget-object v1, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$3$1;->$viewModel:Lcom/example/ui/BookViewModel;

    iget-object v2, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$3$1;->$bookId:Ljava/lang/String;

    iget-object v3, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$3$1;->$messages$delegate:Landroidx/compose/runtime/State;

    iget-object v4, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$3$1;->$aiProcessing$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v5, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$3$1;->$currentUser$delegate:Landroidx/compose/runtime/State;

    iget-object v6, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$3$1;->$otherUserName$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v7, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$3$1;->$aiSuggestion$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v8, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$3$1;->$aiMeetingRecommendation$delegate:Landroidx/compose/runtime/MutableState;

    move-object v9, p2

    invoke-direct/range {v0 .. v9}, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$3$1;-><init>(Lcom/example/ui/BookViewModel;Ljava/lang/String;Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$3$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$3$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p0

    check-cast p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$3$1;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$3$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 226
    iget v1, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$3$1;->label:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_3

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 227
    iget-object p1, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$3$1;->$messages$delegate:Landroidx/compose/runtime/State;

    invoke-static {p1}, Lcom/example/ui/screens/ChatScreenKt;->access$ChatScreen$lambda$8(Landroidx/compose/runtime/State;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_4

    .line 228
    iget-object p1, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$3$1;->$aiProcessing$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1, v3}, Lcom/example/ui/screens/ChatScreenKt;->access$ChatScreen$lambda$95(Landroidx/compose/runtime/MutableState;Z)V

    .line 230
    :try_start_1
    iget-object v4, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$3$1;->$viewModel:Lcom/example/ui/BookViewModel;

    iget-object p1, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$3$1;->$messages$delegate:Landroidx/compose/runtime/State;

    invoke-static {p1}, Lcom/example/ui/screens/ChatScreenKt;->access$ChatScreen$lambda$8(Landroidx/compose/runtime/State;)Ljava/util/List;

    move-result-object v5

    iget-object p1, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$3$1;->$currentUser$delegate:Landroidx/compose/runtime/State;

    invoke-static {p1}, Lcom/example/ui/screens/ChatScreenKt;->access$ChatScreen$lambda$13(Landroidx/compose/runtime/State;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    const-string p1, ""

    :cond_2
    move-object v6, p1

    iget-object p1, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$3$1;->$otherUserName$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1}, Lcom/example/ui/screens/ChatScreenKt;->access$ChatScreen$lambda$71(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$3$1;->$bookId:Ljava/lang/String;

    move-object v9, p0

    check-cast v9, Lkotlin/coroutines/Continuation;

    iput v3, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$3$1;->label:I

    invoke-virtual/range {v4 .. v9}, Lcom/example/ui/BookViewModel;->analyzeChat(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    .line 226
    :cond_3
    :goto_0
    check-cast p1, Lcom/example/ui/BookViewModel$ChatAnalysis;

    .line 231
    iget-object v0, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$3$1;->$aiSuggestion$delegate:Landroidx/compose/runtime/MutableState;

    invoke-virtual {p1}, Lcom/example/ui/BookViewModel$ChatAnalysis;->getSuggestion()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/example/ui/screens/ChatScreenKt;->access$ChatScreen$lambda$89(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    .line 232
    iget-object v0, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$3$1;->$aiMeetingRecommendation$delegate:Landroidx/compose/runtime/MutableState;

    invoke-virtual {p1}, Lcom/example/ui/BookViewModel$ChatAnalysis;->getMeetingRecommendation()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/example/ui/screens/ChatScreenKt;->access$ChatScreen$lambda$92(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    .line 234
    :goto_1
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 236
    :goto_2
    iget-object p0, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$3$1;->$aiProcessing$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p0, v2}, Lcom/example/ui/screens/ChatScreenKt;->access$ChatScreen$lambda$95(Landroidx/compose/runtime/MutableState;Z)V

    goto :goto_4

    :goto_3
    iget-object p0, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$3$1;->$aiProcessing$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p0, v2}, Lcom/example/ui/screens/ChatScreenKt;->access$ChatScreen$lambda$95(Landroidx/compose/runtime/MutableState;Z)V

    throw p1

    .line 239
    :cond_4
    :goto_4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method
