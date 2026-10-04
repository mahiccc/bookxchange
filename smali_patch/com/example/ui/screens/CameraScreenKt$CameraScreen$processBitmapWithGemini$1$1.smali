.class final Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "CameraScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.example.ui.screens.CameraScreenKt$CameraScreen$processBitmapWithGemini$1$1"
    f = "CameraScreen.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $latitude$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $loc:Landroid/location/Location;

.field final synthetic $longitude$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field label:I


# direct methods
.method constructor <init>(Landroid/location/Location;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/location/Location;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Double;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Double;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$1$1;->$loc:Landroid/location/Location;

    iput-object p2, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$1$1;->$latitude$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p3, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$1$1;->$longitude$delegate:Landroidx/compose/runtime/MutableState;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$1$1;

    iget-object v0, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$1$1;->$loc:Landroid/location/Location;

    iget-object v1, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$1$1;->$latitude$delegate:Landroidx/compose/runtime/MutableState;

    iget-object p0, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$1$1;->$longitude$delegate:Landroidx/compose/runtime/MutableState;

    invoke-direct {p1, v0, v1, p0, p2}, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$1$1;-><init>(Landroid/location/Location;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p0

    check-cast p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$1$1;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 161
    iget v0, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$1$1;->label:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 162
    iget-object p1, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$1$1;->$latitude$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v0, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$1$1;->$loc:Landroid/location/Location;

    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    invoke-static {v0, v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxDouble(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/example/ui/screens/CameraScreenKt;->access$CameraScreen$lambda$50(Landroidx/compose/runtime/MutableState;Ljava/lang/Double;)V

    .line 163
    iget-object p1, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$1$1;->$longitude$delegate:Landroidx/compose/runtime/MutableState;

    iget-object p0, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$1$1;->$loc:Landroid/location/Location;

    invoke-virtual {p0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v0

    invoke-static {v0, v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxDouble(D)Ljava/lang/Double;

    move-result-object p0

    invoke-static {p1, p0}, Lcom/example/ui/screens/CameraScreenKt;->access$CameraScreen$lambda$53(Landroidx/compose/runtime/MutableState;Ljava/lang/Double;)V

    .line 164
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0

    .line 161
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
