.class final Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$2$barcodeResult$1$1;
.super Ljava/lang/Object;
.source "CameraScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/List<",
        "Lcom/google/mlkit/vision/barcode/common/Barcode;",
        ">;",
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
.field final synthetic $cont:Lkotlinx/coroutines/CancellableContinuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/CancellableContinuation<",
            "Ljava/util/List<",
            "+",
            "Lcom/google/mlkit/vision/barcode/common/Barcode;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlinx/coroutines/CancellableContinuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CancellableContinuation<",
            "-",
            "Ljava/util/List<",
            "+",
            "Lcom/google/mlkit/vision/barcode/common/Barcode;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$2$barcodeResult$1$1;->$cont:Lkotlinx/coroutines/CancellableContinuation;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 187
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$2$barcodeResult$1$1;->invoke(Ljava/util/List;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/mlkit/vision/barcode/common/Barcode;",
            ">;)V"
        }
    .end annotation

    .line 187
    iget-object v0, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$2$barcodeResult$1$1;->$cont:Lkotlinx/coroutines/CancellableContinuation;

    invoke-interface {v0}, Lkotlinx/coroutines/CancellableContinuation;->isActive()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$2$barcodeResult$1$1;->$cont:Lkotlinx/coroutines/CancellableContinuation;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    sget-object v0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$2$barcodeResult$1$1$1;->INSTANCE:Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$2$barcodeResult$1$1$1;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-interface {p0, p1, v0}, Lkotlinx/coroutines/CancellableContinuation;->resume(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    :cond_0
    return-void
.end method
