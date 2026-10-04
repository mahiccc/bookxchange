.class final Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "CameraScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/screens/CameraScreenKt;->CameraScreen$searchGoogleBooksManually(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V
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
    value = "SMAP\nCameraScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraScreen.kt\ncom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1299:1\n1617#2,9:1300\n1869#2:1309\n1870#2:1311\n1626#2:1312\n1#3:1310\n*S KotlinDebug\n*F\n+ 1 CameraScreen.kt\ncom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1\n*L\n140#1:1300,9\n140#1:1309\n140#1:1311\n140#1:1312\n140#1:1310\n*E\n"
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
    c = "com.example.ui.screens.CameraScreenKt$CameraScreen$searchGoogleBooksManually$1"
    f = "CameraScreen.kt"
    i = {
        0x0
    }
    l = {
        0x7e
    }
    m = "invokeSuspend"
    n = {
        "key"
    }
    s = {
        "L$0"
    }
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

.field final synthetic $isSearchingGoogleBooks$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $query:Ljava/lang/String;

.field L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/example/api/VolumeInfo;",
            ">;>;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1;->$query:Ljava/lang/String;

    iput-object p2, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1;->$googleBooksSearchResults$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p3, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1;->$isSearchingGoogleBooks$delegate:Landroidx/compose/runtime/MutableState;

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

    new-instance p1, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1;

    iget-object v0, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1;->$query:Ljava/lang/String;

    iget-object v1, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1;->$googleBooksSearchResults$delegate:Landroidx/compose/runtime/MutableState;

    iget-object p0, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1;->$isSearchingGoogleBooks$delegate:Landroidx/compose/runtime/MutableState;

    invoke-direct {p1, v0, v1, p0, p2}, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1;-><init>(Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p0

    check-cast p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 123
    iget v1, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1;->label:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 125
    :try_start_1
    invoke-static {}, Lcom/example/security/SecureKeyProvider;->getGoogleBooksApiKey()Ljava/lang/String;

    move-result-object p1

    .line 126
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    check-cast v1, Lkotlin/coroutines/CoroutineContext;

    new-instance v4, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1$resp$1;

    iget-object v5, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1;->$query:Ljava/lang/String;

    const/4 v6, 0x0

    invoke-direct {v4, p1, v5, v6}, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1$resp$1;-><init>(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v4, Lkotlin/jvm/functions/Function2;

    move-object v5, p0

    check-cast v5, Lkotlin/coroutines/Continuation;

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1;->L$0:Ljava/lang/Object;

    iput v2, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1;->label:I

    invoke-static {v1, v4, v5}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    .line 123
    :cond_2
    :goto_0
    check-cast p1, Lcom/example/api/GoogleBooksResponse;

    .line 140
    iget-object v0, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1;->$googleBooksSearchResults$delegate:Landroidx/compose/runtime/MutableState;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/example/api/GoogleBooksResponse;->getItems()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_5

    check-cast p1, Ljava/lang/Iterable;

    .line 1300
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 1309
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 1308
    check-cast v2, Lcom/example/api/VolumeItem;

    .line 140
    invoke-virtual {v2}, Lcom/example/api/VolumeItem;->getVolumeInfo()Lcom/example/api/VolumeInfo;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 1308
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1312
    :cond_4
    check-cast v1, Ljava/util/List;

    goto :goto_2

    .line 140
    :cond_5
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    :goto_2
    invoke-static {v0, v1}, Lcom/example/ui/screens/CameraScreenKt;->access$CameraScreen$lambda$71(Landroidx/compose/runtime/MutableState;Ljava/util/List;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    .line 142
    :catch_0
    :try_start_2
    iget-object p1, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1;->$googleBooksSearchResults$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/example/ui/screens/CameraScreenKt;->access$CameraScreen$lambda$71(Landroidx/compose/runtime/MutableState;Ljava/util/List;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 144
    :goto_3
    iget-object p0, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1;->$isSearchingGoogleBooks$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p0, v3}, Lcom/example/ui/screens/CameraScreenKt;->access$CameraScreen$lambda$74(Landroidx/compose/runtime/MutableState;Z)V

    .line 146
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0

    .line 144
    :goto_4
    iget-object p0, p0, Lcom/example/ui/screens/CameraScreenKt$CameraScreen$searchGoogleBooksManually$1;->$isSearchingGoogleBooks$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p0, v3}, Lcom/example/ui/screens/CameraScreenKt;->access$CameraScreen$lambda$74(Landroidx/compose/runtime/MutableState;Z)V

    throw p1
.end method
