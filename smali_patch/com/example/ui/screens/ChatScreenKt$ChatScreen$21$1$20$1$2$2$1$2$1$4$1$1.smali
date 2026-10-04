.class final Lcom/example/ui/screens/ChatScreenKt$ChatScreen$21$1$20$1$2$2$1$2$1$4$1$1;
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
.field final synthetic $context:Landroid/content/Context;

.field final synthetic $msg:Lcom/example/data/Message;


# direct methods
.method constructor <init>(Lcom/example/data/Message;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$21$1$20$1$2$2$1$2$1$4$1$1;->$msg:Lcom/example/data/Message;

    iput-object p2, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$21$1$20$1$2$2$1$2$1$4$1$1;->$context:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 1388
    invoke-virtual {p0}, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$21$1$20$1$2$2$1$2$1$4$1$1;->invoke()V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke()V
    .locals 6

    .line 1389
    const-string v0, "android.intent.action.VIEW"

    .line 0
    const-string v1, "geo:0,0?q="

    .line 1389
    iget-object v2, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$21$1$20$1$2$2$1$2$1$4$1$1;->$msg:Lcom/example/data/Message;

    invoke-virtual {v2}, Lcom/example/data/Message;->getMeetupLocation()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    const-string v2, "safe spot"

    .line 1391
    :cond_0
    :try_start_0
    new-instance v3, Landroid/content/Intent;

    invoke-static {v2}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v3, v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 1392
    const-string v1, "com.google.android.apps.maps"

    invoke-virtual {v3, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 1393
    iget-object v1, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$21$1$20$1$2$2$1$2$1$4$1$1;->$context:Landroid/content/Context;

    invoke-virtual {v1, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 1395
    :catch_0
    new-instance v1, Landroid/content/Intent;

    invoke-static {v2}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "https://www.google.com/maps/search/?api=1&query="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 1396
    iget-object p0, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$21$1$20$1$2$2$1$2$1$4$1$1;->$context:Landroid/content/Context;

    invoke-virtual {p0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
