.class final Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SafeMeetupDialog.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/screens/SafeMeetupDialogKt;->SafeMeetupDialog$performPlaceSearch(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroid/content/Context;Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V
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
    value = "SMAP\nSafeMeetupDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeMeetupDialog.kt\ncom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,475:1\n1617#2,9:476\n1869#2:485\n1870#2:488\n1626#2:489\n1#3:486\n1#3:487\n*S KotlinDebug\n*F\n+ 1 SafeMeetupDialog.kt\ncom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1\n*L\n129#1:476,9\n129#1:485\n129#1:488\n129#1:489\n129#1:487\n*E\n"
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
    c = "com.example.ui.screens.SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1"
    f = "SafeMeetupDialog.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x1
    }
    l = {
        0x8b,
        0x90
    }
    m = "invokeSuspend"
    n = {
        "geocoder",
        "citySuffix",
        "results",
        "mapped",
        "<unused var>"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$0"
    }
.end annotation


# instance fields
.field final synthetic $context:Landroid/content/Context;

.field final synthetic $detectedCity$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $geocodedResults$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/example/ui/screens/SafeSpotOption;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $isSearchingPlaces$delegate:Landroidx/compose/runtime/MutableState;
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

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/example/ui/screens/SafeSpotOption;",
            ">;>;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;->$context:Landroid/content/Context;

    iput-object p2, p0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;->$query:Ljava/lang/String;

    iput-object p3, p0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;->$detectedCity$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p4, p0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;->$geocodedResults$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;->$isSearchingPlaces$delegate:Landroidx/compose/runtime/MutableState;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method static final invokeSuspend$lambda$2$lambda$0(Landroid/location/Address;I)Ljava/lang/CharSequence;
    .locals 0

    .line 131
    invoke-virtual {p0, p1}, Landroid/location/Address;->getAddressLine(I)Ljava/lang/String;

    move-result-object p0

    const-string p1, "getAddressLine(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/CharSequence;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7
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

    new-instance v0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;

    iget-object v1, p0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;->$context:Landroid/content/Context;

    iget-object v2, p0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;->$query:Ljava/lang/String;

    iget-object v3, p0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;->$detectedCity$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v4, p0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;->$geocodedResults$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v5, p0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;->$isSearchingPlaces$delegate:Landroidx/compose/runtime/MutableState;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;-><init>(Landroid/content/Context;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p0

    check-cast p0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    move-object/from16 v1, p0

    const-string v0, " "

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 123
    iget v3, v1, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;->label:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v3, :cond_2

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    iget-object v0, v1, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Exception;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, v1, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;->L$3:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v0, v1, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;->L$2:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v0, v1, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;->L$1:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v1, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;->L$0:Ljava/lang/Object;

    check-cast v0, Landroid/location/Geocoder;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_5

    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 125
    :try_start_1
    new-instance v3, Landroid/location/Geocoder;

    iget-object v7, v1, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;->$context:Landroid/content/Context;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v8

    invoke-direct {v3, v7, v8}, Landroid/location/Geocoder;-><init>(Landroid/content/Context;Ljava/util/Locale;)V

    .line 126
    iget-object v7, v1, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;->$detectedCity$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v7}, Lcom/example/ui/screens/SafeMeetupDialogKt;->access$SafeMeetupDialog$lambda$1(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v7

    check-cast v7, Ljava/lang/CharSequence;

    if-eqz v7, :cond_4

    invoke-static {v7}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_3

    goto :goto_0

    :cond_3
    iget-object v7, v1, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;->$detectedCity$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v7}, Lcom/example/ui/screens/SafeMeetupDialogKt;->access$SafeMeetupDialog$lambda$1(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_4
    :goto_0
    const-string v0, ""

    .line 128
    :goto_1
    iget-object v7, v1, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;->$query:Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x4

    invoke-virtual {v3, v7, v8}, Landroid/location/Geocoder;->getFromLocationName(Ljava/lang/String;I)Ljava/util/List;

    move-result-object v7

    if-eqz v7, :cond_9

    .line 129
    move-object v8, v7

    check-cast v8, Ljava/lang/Iterable;

    iget-object v9, v1, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;->$query:Ljava/lang/String;

    iget-object v10, v1, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;->$detectedCity$delegate:Landroidx/compose/runtime/MutableState;

    .line 476
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    check-cast v11, Ljava/util/Collection;

    .line 485
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_8

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .line 484
    check-cast v12, Landroid/location/Address;

    .line 130
    invoke-virtual {v12}, Landroid/location/Address;->getFeatureName()Ljava/lang/String;

    move-result-object v13

    if-nez v13, :cond_5

    invoke-virtual {v12}, Landroid/location/Address;->getThoroughfare()Ljava/lang/String;

    move-result-object v13

    if-nez v13, :cond_5

    move-object v13, v9

    .line 131
    :cond_5
    new-instance v14, Lkotlin/ranges/IntRange;

    invoke-virtual {v12}, Landroid/location/Address;->getMaxAddressLineIndex()I

    move-result v15

    const/4 v4, 0x0

    invoke-direct {v14, v4, v15}, Lkotlin/ranges/IntRange;-><init>(II)V

    move-object/from16 v16, v14

    check-cast v16, Ljava/lang/Iterable;

    const-string v4, ", "

    move-object/from16 v17, v4

    check-cast v17, Ljava/lang/CharSequence;

    new-instance v4, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1$$ExternalSyntheticLambda0;

    invoke-direct {v4, v12}, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1$$ExternalSyntheticLambda0;-><init>(Landroid/location/Address;)V

    const/16 v23, 0x1e

    const/16 v24, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v22, v4

    invoke-static/range {v16 .. v24}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 133
    const-string v12, "Search"

    .line 135
    sget-object v14, Landroidx/compose/material/icons/Icons;->INSTANCE:Landroidx/compose/material/icons/Icons;

    invoke-virtual {v14}, Landroidx/compose/material/icons/Icons;->getDefault()Landroidx/compose/material/icons/Icons$Filled;

    move-result-object v14

    invoke-static {v14}, Landroidx/compose/material/icons/filled/PlaceKt;->getPlace(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;

    move-result-object v14

    .line 136
    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v15

    if-eqz v15, :cond_7

    invoke-static {v10}, Lcom/example/ui/screens/SafeMeetupDialogKt;->access$SafeMeetupDialog$lambda$1(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_6

    const-string v4, "city"

    :cond_6
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Verified landmark near "

    invoke-virtual {v15, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    :cond_7
    check-cast v4, Ljava/lang/String;

    .line 132
    new-instance v5, Lcom/example/ui/screens/SafeSpotOption;

    invoke-direct {v5, v12, v13, v14, v4}, Lcom/example/ui/screens/SafeSpotOption;-><init>(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;)V

    .line 484
    invoke-interface {v11, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x2

    const/4 v5, 0x1

    goto :goto_2

    .line 489
    :cond_8
    check-cast v11, Ljava/util/List;

    goto :goto_3

    .line 138
    :cond_9
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v11

    .line 139
    :goto_3
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    move-result-object v4

    check-cast v4, Lkotlin/coroutines/CoroutineContext;

    new-instance v5, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1$1;

    iget-object v8, v1, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;->$geocodedResults$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v9, v1, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;->$isSearchingPlaces$delegate:Landroidx/compose/runtime/MutableState;

    invoke-direct {v5, v11, v8, v9, v6}, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1$1;-><init>(Ljava/util/List;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast v5, Lkotlin/jvm/functions/Function2;

    move-object v8, v1

    check-cast v8, Lkotlin/coroutines/Continuation;

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v1, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;->L$0:Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v1, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;->L$1:Ljava/lang/Object;

    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v1, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;->L$2:Ljava/lang/Object;

    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v1, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;->L$3:Ljava/lang/Object;

    const/4 v0, 0x1

    iput v0, v1, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;->label:I

    invoke-static {v4, v5, v8}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ne v0, v2, :cond_a

    goto :goto_4

    :catch_0
    move-exception v0

    .line 144
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    move-result-object v3

    check-cast v3, Lkotlin/coroutines/CoroutineContext;

    new-instance v4, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1$3;

    iget-object v5, v1, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;->$isSearchingPlaces$delegate:Landroidx/compose/runtime/MutableState;

    invoke-direct {v4, v5, v6}, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1$3;-><init>(Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast v4, Lkotlin/jvm/functions/Function2;

    move-object v5, v1

    check-cast v5, Lkotlin/coroutines/Continuation;

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v1, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;->L$0:Ljava/lang/Object;

    iput-object v6, v1, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;->L$1:Ljava/lang/Object;

    iput-object v6, v1, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;->L$2:Ljava/lang/Object;

    iput-object v6, v1, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;->L$3:Ljava/lang/Object;

    const/4 v6, 0x2

    iput v6, v1, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;->label:I

    invoke-static {v3, v4, v5}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_a

    :goto_4
    return-object v2

    .line 148
    :cond_a
    :goto_5
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method
