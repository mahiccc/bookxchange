.class public final synthetic Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$2$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# instance fields
.field public final synthetic f$0:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$1:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$2$$ExternalSyntheticLambda2;->f$0:Landroidx/compose/runtime/MutableState;

    iput-object p2, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$2$$ExternalSyntheticLambda2;->f$1:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$2$$ExternalSyntheticLambda2;->f$0:Landroidx/compose/runtime/MutableState;

    iget-object p0, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$2$$ExternalSyntheticLambda2;->f$1:Landroidx/compose/runtime/MutableState;

    invoke-static {v0, p0, p1}, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$2;->invokeSuspend$lambda$16(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Ljava/lang/Exception;)V

    return-void
.end method
