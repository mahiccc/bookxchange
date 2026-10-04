.class public final synthetic Lcom/example/ui/screens/QRScannerDialogKt$$ExternalSyntheticLambda6;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic f$0:Landroidx/camera/core/ImageProxy;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/ImageProxy;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/QRScannerDialogKt$$ExternalSyntheticLambda6;->f$0:Landroidx/camera/core/ImageProxy;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    .line 0
    iget-object p0, p0, Lcom/example/ui/screens/QRScannerDialogKt$$ExternalSyntheticLambda6;->f$0:Landroidx/camera/core/ImageProxy;

    invoke-static {p0, p1}, Lcom/example/ui/screens/QRScannerDialogKt;->GlobalQRScannerDialog$lambda$67$lambda$66$lambda$65$lambda$64$lambda$63$lambda$62$lambda$61$lambda$60$lambda$59(Landroidx/camera/core/ImageProxy;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
