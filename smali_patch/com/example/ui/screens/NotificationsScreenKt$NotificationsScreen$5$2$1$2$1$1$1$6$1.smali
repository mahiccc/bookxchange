.class final Lcom/example/ui/screens/NotificationsScreenKt$NotificationsScreen$5$2$1$2$1$1$1$6$1;
.super Ljava/lang/Object;
.source "NotificationsScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/screens/NotificationsScreenKt$NotificationsScreen$5$2$1$2$1;->invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic $notif:Lcom/example/ui/screens/NotificationItem;

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


# direct methods
.method constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/example/ui/screens/NotificationItem;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/example/ui/screens/NotificationItem;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/screens/NotificationsScreenKt$NotificationsScreen$5$2$1$2$1$1$1$6$1;->$onChatClick:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/example/ui/screens/NotificationsScreenKt$NotificationsScreen$5$2$1$2$1$1$1$6$1;->$notif:Lcom/example/ui/screens/NotificationItem;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 256
    invoke-virtual {p0}, Lcom/example/ui/screens/NotificationsScreenKt$NotificationsScreen$5$2$1$2$1$1$1$6$1;->invoke()V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke()V
    .locals 1

    .line 256
    iget-object v0, p0, Lcom/example/ui/screens/NotificationsScreenKt$NotificationsScreen$5$2$1$2$1$1$1$6$1;->$onChatClick:Lkotlin/jvm/functions/Function1;

    iget-object p0, p0, Lcom/example/ui/screens/NotificationsScreenKt$NotificationsScreen$5$2$1$2$1$1$1$6$1;->$notif:Lcom/example/ui/screens/NotificationItem;

    invoke-virtual {p0}, Lcom/example/ui/screens/NotificationItem;->getBook()Lcom/example/data/Book;

    move-result-object p0

    invoke-virtual {p0}, Lcom/example/data/Book;->getId()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
