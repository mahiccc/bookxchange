.class public final synthetic Lcom/example/ui/screens/QRScannerDialogKt$$ExternalSyntheticLambda15;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Ljava/util/concurrent/ExecutorService;

.field public final synthetic f$1:Landroidx/lifecycle/LifecycleOwner;

.field public final synthetic f$2:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$3:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/ExecutorService;Landroidx/lifecycle/LifecycleOwner;Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/QRScannerDialogKt$$ExternalSyntheticLambda15;->f$0:Ljava/util/concurrent/ExecutorService;

    iput-object p2, p0, Lcom/example/ui/screens/QRScannerDialogKt$$ExternalSyntheticLambda15;->f$1:Landroidx/lifecycle/LifecycleOwner;

    iput-object p3, p0, Lcom/example/ui/screens/QRScannerDialogKt$$ExternalSyntheticLambda15;->f$2:Landroidx/compose/runtime/MutableState;

    iput-object p4, p0, Lcom/example/ui/screens/QRScannerDialogKt$$ExternalSyntheticLambda15;->f$3:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/QRScannerDialogKt$$ExternalSyntheticLambda15;->f$0:Ljava/util/concurrent/ExecutorService;

    iget-object v1, p0, Lcom/example/ui/screens/QRScannerDialogKt$$ExternalSyntheticLambda15;->f$1:Landroidx/lifecycle/LifecycleOwner;

    iget-object v2, p0, Lcom/example/ui/screens/QRScannerDialogKt$$ExternalSyntheticLambda15;->f$2:Landroidx/compose/runtime/MutableState;

    iget-object p0, p0, Lcom/example/ui/screens/QRScannerDialogKt$$ExternalSyntheticLambda15;->f$3:Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroid/content/Context;

    invoke-static {v0, v1, v2, p0, p1}, Lcom/example/ui/screens/QRScannerDialogKt;->QRScannerDialog$lambda$48$lambda$47$lambda$46$lambda$31$lambda$30(Ljava/util/concurrent/ExecutorService;Landroidx/lifecycle/LifecycleOwner;Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function1;Landroid/content/Context;)Landroidx/camera/view/PreviewView;

    move-result-object p0

    return-object p0
.end method
