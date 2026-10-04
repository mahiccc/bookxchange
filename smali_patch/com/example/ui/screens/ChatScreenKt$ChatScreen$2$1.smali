.class final Lcom/example/ui/screens/ChatScreenKt$ChatScreen$2$1;
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

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nChatScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatScreen.kt\ncom/example/ui/screens/ChatScreenKt$ChatScreen$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2134:1\n1#2:2135\n*E\n"
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
    c = "com.example.ui.screens.ChatScreenKt$ChatScreen$2$1"
    f = "ChatScreen.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
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

.field final synthetic $prefs:Landroid/content/SharedPreferences;

.field final synthetic $viewModel:Lcom/example/ui/BookViewModel;

.field label:I


# direct methods
.method constructor <init>(Ljava/lang/String;Landroid/content/SharedPreferences;Lcom/example/ui/BookViewModel;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/content/SharedPreferences;",
            "Lcom/example/ui/BookViewModel;",
            "Landroidx/compose/runtime/State<",
            "+",
            "Ljava/util/List<",
            "Lcom/example/data/Message;",
            ">;>;",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/ui/screens/ChatScreenKt$ChatScreen$2$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$2$1;->$bookId:Ljava/lang/String;

    iput-object p2, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$2$1;->$prefs:Landroid/content/SharedPreferences;

    iput-object p3, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$2$1;->$viewModel:Lcom/example/ui/BookViewModel;

    iput-object p4, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$2$1;->$messages$delegate:Landroidx/compose/runtime/State;

    iput-object p5, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$2$1;->$currentUser$delegate:Landroidx/compose/runtime/State;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7
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

    new-instance v0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$2$1;

    iget-object v1, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$2$1;->$bookId:Ljava/lang/String;

    iget-object v2, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$2$1;->$prefs:Landroid/content/SharedPreferences;

    iget-object v3, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$2$1;->$viewModel:Lcom/example/ui/BookViewModel;

    iget-object v4, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$2$1;->$messages$delegate:Landroidx/compose/runtime/State;

    iget-object v5, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$2$1;->$currentUser$delegate:Landroidx/compose/runtime/State;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$2$1;-><init>(Ljava/lang/String;Landroid/content/SharedPreferences;Lcom/example/ui/BookViewModel;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$2$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$2$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p0

    check-cast p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$2$1;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 186
    iget v0, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$2$1;->label:I

    if-nez v0, :cond_8

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 187
    iget-object p1, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$2$1;->$bookId:Ljava/lang/String;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-static {p1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_7

    .line 188
    iget-object p1, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$2$1;->$messages$delegate:Landroidx/compose/runtime/State;

    invoke-static {p1}, Lcom/example/ui/screens/ChatScreenKt;->access$ChatScreen$lambda$8(Landroidx/compose/runtime/State;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/example/data/Message;

    invoke-virtual {v0}, Lcom/example/data/Message;->getTimestamp()J

    move-result-wide v0

    invoke-static {v0, v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    move-result-object v0

    check-cast v0, Ljava/lang/Comparable;

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/example/data/Message;

    invoke-virtual {v1}, Lcom/example/data/Message;->getTimestamp()J

    move-result-wide v1

    invoke-static {v1, v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    move-result-object v1

    check-cast v1, Ljava/lang/Comparable;

    invoke-interface {v0, v1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v2

    if-gez v2, :cond_1

    move-object v0, v1

    goto :goto_0

    :cond_2
    move-object p1, v0

    :goto_1
    check-cast p1, Ljava/lang/Long;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    goto :goto_2

    :cond_3
    const-wide/16 v0, 0x0

    .line 189
    :goto_2
    iget-object p1, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$2$1;->$messages$delegate:Landroidx/compose/runtime/State;

    invoke-static {p1}, Lcom/example/ui/screens/ChatScreenKt;->access$ChatScreen$lambda$8(Landroidx/compose/runtime/State;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/example/data/Message;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/example/data/Message;->getId()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_5

    :cond_4
    const-string p1, ""

    .line 190
    :cond_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    const-wide/16 v2, 0x7d0

    add-long/2addr v0, v2

    .line 191
    iget-object v2, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$2$1;->$prefs:Landroid/content/SharedPreferences;

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    .line 192
    iget-object v3, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$2$1;->$bookId:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "chat_last_read_"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 193
    iget-object v1, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$2$1;->$bookId:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "chat_last_read_msg_id_"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    .line 194
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 195
    iget-object p1, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$2$1;->$currentUser$delegate:Landroidx/compose/runtime/State;

    invoke-static {p1}, Lcom/example/ui/screens/ChatScreenKt;->access$ChatScreen$lambda$13(Landroidx/compose/runtime/State;)Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    if-eqz p1, :cond_7

    invoke-static {p1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_6

    goto :goto_3

    .line 196
    :cond_6
    iget-object p1, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$2$1;->$viewModel:Lcom/example/ui/BookViewModel;

    iget-object v0, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$2$1;->$bookId:Ljava/lang/String;

    iget-object p0, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$2$1;->$currentUser$delegate:Landroidx/compose/runtime/State;

    invoke-static {p0}, Lcom/example/ui/screens/ChatScreenKt;->access$ChatScreen$lambda$13(Landroidx/compose/runtime/State;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1, v0, p0}, Lcom/example/ui/BookViewModel;->markMessagesAsRead(Ljava/lang/String;Ljava/lang/String;)V

    .line 199
    :cond_7
    :goto_3
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0

    .line 186
    :cond_8
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
