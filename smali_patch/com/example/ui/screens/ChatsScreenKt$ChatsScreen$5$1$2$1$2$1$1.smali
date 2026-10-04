.class final Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$5$1$2$1$2$1$1;
.super Ljava/lang/Object;
.source "ChatsScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/screens/ChatsScreenKt;->ChatsScreen(Lcom/example/ui/BookViewModel;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
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


# instance fields
.field final synthetic $conv:Lcom/example/ui/screens/ChatConversation;

.field final synthetic $onChatClick:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $prefs:Landroid/content/SharedPreferences;

.field final synthetic $readUpdateTrigger$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/example/ui/screens/ChatConversation;Landroid/content/SharedPreferences;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/ui/screens/ChatConversation;",
            "Landroid/content/SharedPreferences;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$5$1$2$1$2$1$1;->$conv:Lcom/example/ui/screens/ChatConversation;

    iput-object p2, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$5$1$2$1$2$1$1;->$prefs:Landroid/content/SharedPreferences;

    iput-object p3, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$5$1$2$1$2$1$1;->$onChatClick:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$5$1$2$1$2$1$1;->$readUpdateTrigger$delegate:Landroidx/compose/runtime/MutableState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 371
    invoke-virtual {p0}, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$5$1$2$1$2$1$1;->invoke()V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke()V
    .locals 6

    .line 372
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$5$1$2$1$2$1$1;->$conv:Lcom/example/ui/screens/ChatConversation;

    invoke-virtual {v2}, Lcom/example/ui/screens/ChatConversation;->getLastMessage()Lcom/example/data/Message;

    move-result-object v2

    invoke-virtual {v2}, Lcom/example/data/Message;->getTimestamp()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    const-wide/16 v2, 0x7d0

    add-long/2addr v0, v2

    .line 373
    iget-object v2, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$5$1$2$1$2$1$1;->$prefs:Landroid/content/SharedPreferences;

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    .line 374
    iget-object v3, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$5$1$2$1$2$1$1;->$conv:Lcom/example/ui/screens/ChatConversation;

    invoke-virtual {v3}, Lcom/example/ui/screens/ChatConversation;->getBookId()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "chat_last_read_"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 375
    iget-object v1, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$5$1$2$1$2$1$1;->$conv:Lcom/example/ui/screens/ChatConversation;

    invoke-virtual {v1}, Lcom/example/ui/screens/ChatConversation;->getBookId()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "chat_last_read_msg_id_"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$5$1$2$1$2$1$1;->$conv:Lcom/example/ui/screens/ChatConversation;

    invoke-virtual {v2}, Lcom/example/ui/screens/ChatConversation;->getLastMessage()Lcom/example/data/Message;

    move-result-object v2

    invoke-virtual {v2}, Lcom/example/data/Message;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 376
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 377
    iget-object v0, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$5$1$2$1$2$1$1;->$readUpdateTrigger$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/example/ui/screens/ChatsScreenKt;->access$ChatsScreen$lambda$15(Landroidx/compose/runtime/MutableState;J)V

    .line 378
    iget-object v0, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$5$1$2$1$2$1$1;->$onChatClick:Lkotlin/jvm/functions/Function1;

    iget-object p0, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$5$1$2$1$2$1$1;->$conv:Lcom/example/ui/screens/ChatConversation;

    invoke-virtual {p0}, Lcom/example/ui/screens/ChatConversation;->getBookId()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
