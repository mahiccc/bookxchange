.class final Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$2$enrichFromExternalAPIs$2$3;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "CameraScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$2$enrichFromExternalAPIs$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCameraScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraScreen.kt\ncom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$2$enrichFromExternalAPIs$2$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1299:1\n1617#2,9:1300\n1869#2:1309\n1870#2:1311\n1626#2:1312\n1#3:1310\n*S KotlinDebug\n*F\n+ 1 CameraScreen.kt\ncom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$2$enrichFromExternalAPIs$2$3\n*L\n339#1:1300,9\n339#1:1309\n339#1:1311\n339#1:1312\n339#1:1310\n*E\n"
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
    c = "com.example.ui.screens.CameraScreenKt$CameraScreen$processBitmapWithGemini$2$enrichFromExternalAPIs$2$3"
    f = "CameraScreen.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $googleBooksSearchResults$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/example/api/VolumeInfo;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $resp:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcom/example/api/GoogleBooksResponse;",
            ">;"
        }
    .end annotation
.end field

.field label:I


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcom/example/api/GoogleBooksResponse;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/example/api/VolumeInfo;",
            ">;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$2$enrichFromExternalAPIs$2$3;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$2$enrichFromExternalAPIs$2$3;->$resp:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p2, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$2$enrichFromExternalAPIs$2$3;->$googleBooksSearchResults$delegate:Landroidx/compose/runtime/MutableState;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1
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

    new-instance p1, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$2$enrichFromExternalAPIs$2$3;

    iget-object v0, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$2$enrichFromExternalAPIs$2$3;->$resp:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object p0, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$2$enrichFromExternalAPIs$2$3;->$googleBooksSearchResults$delegate:Landroidx/compose/runtime/MutableState;

    invoke-direct {p1, v0, p0, p2}, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$2$enrichFromExternalAPIs$2$3;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$2$enrichFromExternalAPIs$2$3;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$2$enrichFromExternalAPIs$2$3;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p0

    check-cast p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$2$enrichFromExternalAPIs$2$3;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$2$enrichFromExternalAPIs$2$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 338
    iget v0, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$2$enrichFromExternalAPIs$2$3;->label:I

    if-nez v0, :cond_3

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 339
    iget-object p1, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$2$enrichFromExternalAPIs$2$3;->$googleBooksSearchResults$delegate:Landroidx/compose/runtime/MutableState;

    iget-object p0, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$processBitmapWithGemini$2$enrichFromExternalAPIs$2$3;->$resp:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object p0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p0, Lcom/example/api/GoogleBooksResponse;

    invoke-virtual {p0}, Lcom/example/api/GoogleBooksResponse;->getItems()Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_2

    check-cast p0, Ljava/lang/Iterable;

    .line 1300
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/Collection;

    .line 1309
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 1308
    check-cast v1, Lcom/example/api/VolumeItem;

    .line 339
    invoke-virtual {v1}, Lcom/example/api/VolumeItem;->getVolumeInfo()Lcom/example/api/VolumeInfo;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 1308
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1312
    :cond_1
    check-cast v0, Ljava/util/List;

    goto :goto_1

    .line 339
    :cond_2
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    :goto_1
    invoke-static {p1, v0}, Lcom/example/ui/screens/CameraScreenKt;->access$CameraScreen$lambda$71(Landroidx/compose/runtime/MutableState;Ljava/util/List;)V

    .line 340
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0

    .line 338
    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
