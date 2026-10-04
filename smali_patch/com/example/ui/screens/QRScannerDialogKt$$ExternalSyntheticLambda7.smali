.class public final synthetic Lcom/example/ui/screens/QRScannerDialogKt$$ExternalSyntheticLambda7;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Landroidx/camera/core/ImageAnalysis$Analyzer;


# instance fields
.field public final synthetic f$0:Lcom/google/mlkit/vision/barcode/BarcodeScanner;

.field public final synthetic f$1:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$2:Landroid/content/Context;

.field public final synthetic f$3:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lcom/google/mlkit/vision/barcode/BarcodeScanner;Landroidx/compose/runtime/MutableState;Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/QRScannerDialogKt$$ExternalSyntheticLambda7;->f$0:Lcom/google/mlkit/vision/barcode/BarcodeScanner;

    iput-object p2, p0, Lcom/example/ui/screens/QRScannerDialogKt$$ExternalSyntheticLambda7;->f$1:Landroidx/compose/runtime/MutableState;

    iput-object p3, p0, Lcom/example/ui/screens/QRScannerDialogKt$$ExternalSyntheticLambda7;->f$2:Landroid/content/Context;

    iput-object p4, p0, Lcom/example/ui/screens/QRScannerDialogKt$$ExternalSyntheticLambda7;->f$3:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final analyze(Landroidx/camera/core/ImageProxy;)V
    .locals 3

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/QRScannerDialogKt$$ExternalSyntheticLambda7;->f$0:Lcom/google/mlkit/vision/barcode/BarcodeScanner;

    iget-object v1, p0, Lcom/example/ui/screens/QRScannerDialogKt$$ExternalSyntheticLambda7;->f$1:Landroidx/compose/runtime/MutableState;

    iget-object v2, p0, Lcom/example/ui/screens/QRScannerDialogKt$$ExternalSyntheticLambda7;->f$2:Landroid/content/Context;

    iget-object p0, p0, Lcom/example/ui/screens/QRScannerDialogKt$$ExternalSyntheticLambda7;->f$3:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2, p0, p1}, Lcom/example/ui/screens/QRScannerDialogKt;->QRScannerDialog$lambda$48$lambda$47$lambda$46$lambda$31$lambda$30$lambda$29$lambda$28(Lcom/google/mlkit/vision/barcode/BarcodeScanner;Landroidx/compose/runtime/MutableState;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Landroidx/camera/core/ImageProxy;)V

    return-void
.end method
