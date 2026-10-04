.class final Lcom/example/ui/screens/ChatScreenKt$ChatScreen$21$1$20$1$2$2$1$2$1$4$2$1;
.super Ljava/lang/Object;
.source "ChatScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/screens/ChatScreenKt$ChatScreen$21$1$20$1$2$2$1$2;->invoke(Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic $book:Lcom/example/data/Book;

.field final synthetic $context:Landroid/content/Context;

.field final synthetic $msg:Lcom/example/data/Message;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/example/data/Book;Lcom/example/data/Message;)V
    .locals 0

    iput-object p1, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$21$1$20$1$2$2$1$2$1$4$2$1;->$context:Landroid/content/Context;

    iput-object p2, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$21$1$20$1$2$2$1$2$1$4$2$1;->$book:Lcom/example/data/Book;

    iput-object p3, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$21$1$20$1$2$2$1$2$1$4$2$1;->$msg:Lcom/example/data/Message;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 1409
    invoke-virtual {p0}, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$21$1$20$1$2$2$1$2$1$4$2$1;->invoke()V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke()V
    .locals 6

    const-string v0, "BookXchange: "

    .line 1411
    :try_start_0
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.INSERT"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$21$1$20$1$2$2$1$2$1$4$2$1;->$book:Lcom/example/data/Book;

    iget-object v3, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$21$1$20$1$2$2$1$2$1$4$2$1;->$msg:Lcom/example/data/Message;

    .line 1412
    sget-object v4, Landroid/provider/CalendarContract$Events;->CONTENT_URI:Landroid/net/Uri;

    invoke-virtual {v1, v4}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 1413
    const-string v4, "title"

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/example/data/Book;->getTitle()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    :cond_0
    const-string v2, "Book Swap"

    :cond_1
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v4, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1414
    const-string v0, "eventLocation"

    invoke-virtual {v3}, Lcom/example/data/Message;->getMeetupLocation()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    const-string v2, ""

    :cond_2
    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1415
    invoke-virtual {v3}, Lcom/example/data/Message;->getMeetupTime()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_3

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    .line 1416
    const-string v0, "beginTime"

    invoke-virtual {v1, v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 1417
    const-string v0, "endTime"

    const-wide/32 v4, 0x1b7740

    add-long/2addr v2, v4

    invoke-virtual {v1, v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 1420
    :cond_3
    iget-object v0, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$21$1$20$1$2$2$1$2$1$4$2$1;->$context:Landroid/content/Context;

    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 1422
    :catch_0
    iget-object p0, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$21$1$20$1$2$2$1$2$1$4$2$1;->$context:Landroid/content/Context;

    const-string v0, "Cannot launch Calendar"

    check-cast v0, Ljava/lang/CharSequence;

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    return-void
.end method
