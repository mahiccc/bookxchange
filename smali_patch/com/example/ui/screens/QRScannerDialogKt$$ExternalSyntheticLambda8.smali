.class public final synthetic Lcom/example/ui/screens/QRScannerDialogKt$$ExternalSyntheticLambda8;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Lcom/google/common/util/concurrent/ListenableFuture;

.field public final synthetic f$1:Landroidx/lifecycle/LifecycleOwner;

.field public final synthetic f$2:Landroidx/camera/view/PreviewView;

.field public final synthetic f$3:Landroid/content/Context;

.field public final synthetic f$4:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lcom/google/common/util/concurrent/ListenableFuture;Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/view/PreviewView;Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/QRScannerDialogKt$$ExternalSyntheticLambda8;->f$0:Lcom/google/common/util/concurrent/ListenableFuture;

    iput-object p2, p0, Lcom/example/ui/screens/QRScannerDialogKt$$ExternalSyntheticLambda8;->f$1:Landroidx/lifecycle/LifecycleOwner;

    iput-object p3, p0, Lcom/example/ui/screens/QRScannerDialogKt$$ExternalSyntheticLambda8;->f$2:Landroidx/camera/view/PreviewView;

    iput-object p4, p0, Lcom/example/ui/screens/QRScannerDialogKt$$ExternalSyntheticLambda8;->f$3:Landroid/content/Context;

    iput-object p5, p0, Lcom/example/ui/screens/QRScannerDialogKt$$ExternalSyntheticLambda8;->f$4:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/QRScannerDialogKt$$ExternalSyntheticLambda8;->f$0:Lcom/google/common/util/concurrent/ListenableFuture;

    iget-object v1, p0, Lcom/example/ui/screens/QRScannerDialogKt$$ExternalSyntheticLambda8;->f$1:Landroidx/lifecycle/LifecycleOwner;

    iget-object v2, p0, Lcom/example/ui/screens/QRScannerDialogKt$$ExternalSyntheticLambda8;->f$2:Landroidx/camera/view/PreviewView;

    iget-object v3, p0, Lcom/example/ui/screens/QRScannerDialogKt$$ExternalSyntheticLambda8;->f$3:Landroid/content/Context;

    iget-object p0, p0, Lcom/example/ui/screens/QRScannerDialogKt$$ExternalSyntheticLambda8;->f$4:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2, v3, p0}, Lcom/example/ui/screens/QRScannerDialogKt;->GlobalQRScannerDialog$lambda$67$lambda$66$lambda$65$lambda$64$lambda$63$lambda$62(Lcom/google/common/util/concurrent/ListenableFuture;Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/view/PreviewView;Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
