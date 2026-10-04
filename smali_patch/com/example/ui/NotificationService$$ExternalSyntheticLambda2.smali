.class public final synthetic Lcom/example/ui/NotificationService$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# instance fields
.field public final synthetic f$0:Ljava/lang/String;

.field public final synthetic f$1:Landroid/content/Context;

.field public final synthetic f$2:Lcom/example/data/Message;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Landroid/content/Context;Lcom/example/data/Message;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/NotificationService$$ExternalSyntheticLambda2;->f$0:Ljava/lang/String;

    iput-object p2, p0, Lcom/example/ui/NotificationService$$ExternalSyntheticLambda2;->f$1:Landroid/content/Context;

    iput-object p3, p0, Lcom/example/ui/NotificationService$$ExternalSyntheticLambda2;->f$2:Lcom/example/data/Message;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/example/ui/NotificationService$$ExternalSyntheticLambda2;->f$0:Ljava/lang/String;

    iget-object v1, p0, Lcom/example/ui/NotificationService$$ExternalSyntheticLambda2;->f$1:Landroid/content/Context;

    iget-object p0, p0, Lcom/example/ui/NotificationService$$ExternalSyntheticLambda2;->f$2:Lcom/example/data/Message;

    invoke-static {v0, v1, p0, p1}, Lcom/example/ui/NotificationService;->checkAndNotifyMessages$lambda$8(Ljava/lang/String;Landroid/content/Context;Lcom/example/data/Message;Ljava/lang/Exception;)V

    return-void
.end method
