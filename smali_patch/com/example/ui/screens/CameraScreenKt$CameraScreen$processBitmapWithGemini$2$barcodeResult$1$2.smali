.class final Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$2$barcodeResult$1$2;
.super Ljava/lang/Object;
.source "CameraScreen.kt"

# interfaces
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
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

    iput-object p1, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$2$barcodeResult$1$2;->$cont:Lkotlinx/coroutines/CancellableContinuation;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 188
    iget-object p1, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$2$barcodeResult$1$2;->$cont:Lkotlinx/coroutines/CancellableContinuation;

    invoke-interface {p1}, Lkotlinx/coroutines/CancellableContinuation;->isActive()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p0, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$2$barcodeResult$1$2;->$cont:Lkotlinx/coroutines/CancellableContinuation;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    sget-object v0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$2$barcodeResult$1$2$1;->INSTANCE:Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$2$barcodeResult$1$2$1;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-interface {p0, p1, v0}, Lkotlinx/coroutines/CancellableContinuation;->resume(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    :cond_0
    return-void
.end method
