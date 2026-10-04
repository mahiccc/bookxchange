.class public final Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$lambda$276$lambda$275$lambda$209$lambda$208$lambda$207$$inlined$items$default$4;
.super Lkotlin/jvm/internal/Lambda;
.source "LazyDsl.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/screens/DashboardScreenKt;->DashboardScreen(Ljava/util/List;Ljava/lang/String;Lcom/example/ui/BookViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function4<",
        "Landroidx/compose/foundation/lazy/LazyItemScope;",
        "Ljava/lang/Integer;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$4\n+ 2 DashboardScreen.kt\ncom/example/ui/screens/DashboardScreenKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,433:1\n763#2,3:434\n766#2,2:441\n768#2:447\n769#2:452\n770#2,29:457\n799#2,3:487\n785#2:490\n789#2:497\n783#2:498\n804#2:499\n1788#3,4:437\n1788#3,4:443\n1788#3,4:448\n1788#3,4:453\n149#4:486\n1225#5,6:491\n*S KotlinDebug\n*F\n+ 1 DashboardScreen.kt\ncom/example/ui/screens/DashboardScreenKt\n*L\n765#1:437,4\n767#1:443,4\n768#1:448,4\n769#1:453,4\n798#1:486\n785#1:491,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "<anonymous>",
        "",
        "T",
        "Landroidx/compose/foundation/lazy/LazyItemScope;",
        "it",
        "",
        "invoke",
        "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V",
        "androidx/compose/foundation/lazy/LazyDslKt$items$4"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $aiRecommendedBooks$inlined:Ljava/util/List;

.field final synthetic $books$inlined:Ljava/util/List;

.field final synthetic $currentUser$inlined:Ljava/lang/String;

.field final synthetic $filterStatus$delegate$inlined:Landroidx/compose/runtime/State;

.field final synthetic $items:Ljava/util/List;

.field final synthetic $userWishlist$delegate$inlined:Landroidx/compose/runtime/State;

.field final synthetic $viewModel$inlined:Lcom/example/ui/BookViewModel;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/example/ui/BookViewModel;Ljava/lang/String;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V
    .locals 0

    iput-object p1, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$lambda$276$lambda$275$lambda$209$lambda$208$lambda$207$$inlined$items$default$4;->$items:Ljava/util/List;

    iput-object p2, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$lambda$276$lambda$275$lambda$209$lambda$208$lambda$207$$inlined$items$default$4;->$books$inlined:Ljava/util/List;

    iput-object p3, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$lambda$276$lambda$275$lambda$209$lambda$208$lambda$207$$inlined$items$default$4;->$aiRecommendedBooks$inlined:Ljava/util/List;

    iput-object p4, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$lambda$276$lambda$275$lambda$209$lambda$208$lambda$207$$inlined$items$default$4;->$viewModel$inlined:Lcom/example/ui/BookViewModel;

    iput-object p5, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$lambda$276$lambda$275$lambda$209$lambda$208$lambda$207$$inlined$items$default$4;->$currentUser$inlined:Ljava/lang/String;

    iput-object p6, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$lambda$276$lambda$275$lambda$209$lambda$208$lambda$207$$inlined$items$default$4;->$userWishlist$delegate$inlined:Landroidx/compose/runtime/State;

    iput-object p7, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$lambda$276$lambda$275$lambda$209$lambda$208$lambda$207$$inlined$items$default$4;->$filterStatus$delegate$inlined:Landroidx/compose/runtime/State;

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 152
    check-cast p1, Landroidx/compose/foundation/lazy/LazyItemScope;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$lambda$276$lambda$275$lambda$209$lambda$208$lambda$207$$inlined$items$default$4;->invoke(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V
    .locals 38

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v12, p3

    const-string v2, "C152@7074L22:LazyDsl.kt#428nma"

    invoke-static {v12, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v2, p4, 0x6

    if-nez v2, :cond_1

    move-object/from16 v2, p1

    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p4, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p4

    :goto_1
    and-int/lit8 v3, p4, 0x30

    if-nez v3, :cond_3

    invoke-interface {v12, v1}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_3
    and-int/lit16 v3, v2, 0x93

    const/16 v4, 0x92

    if-ne v3, v4, :cond_5

    .line 153
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    :cond_5
    :goto_3
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_6

    const/4 v3, -0x1

    const-string v4, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)"

    const v5, -0x25b7f321

    invoke-static {v5, v2, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_6
    iget-object v2, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$lambda$276$lambda$275$lambda$209$lambda$208$lambda$207$$inlined$items$default$4;->$items:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const v2, -0x48b6e1f9

    .line 434
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v2, "C*799@40986L11,800@41083L11,798@40897L246,784@39846L40,788@40134L642,782@39733L1436:DashboardScreen.kt#2thlc2"

    invoke-static {v12, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    const-string v3, "AVAILABLE"

    const-string v4, "MY_BOOKS"

    const-string v5, "BOOKMARKS"

    const-string v6, "ALL"

    const-string v7, "RECOMMENDED"

    const-string v8, "REQUESTED"

    const-string v9, "BORROWED"

    const/4 v10, 0x0

    sparse-switch v2, :sswitch_data_0

    goto/16 :goto_8

    :sswitch_0
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto/16 :goto_8

    .line 442
    :cond_7
    iget-object v2, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$lambda$276$lambda$275$lambda$209$lambda$208$lambda$207$$inlined$items$default$4;->$books$inlined:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    .line 443
    instance-of v11, v2, Ljava/util/Collection;

    if-eqz v11, :cond_8

    move-object v11, v2

    check-cast v11, Ljava/util/Collection;

    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_8

    goto/16 :goto_8

    .line 445
    :cond_8
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_9
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_16

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/example/data/Book;

    .line 442
    invoke-virtual {v11}, Lcom/example/data/Book;->isAvailable()Z

    move-result v11

    if-eqz v11, :cond_9

    add-int/lit8 v10, v10, 0x1

    if-gez v10, :cond_9

    .line 445
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwCountOverflow()V

    goto :goto_4

    .line 434
    :sswitch_1
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    goto/16 :goto_8

    .line 436
    :cond_a
    iget-object v2, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$lambda$276$lambda$275$lambda$209$lambda$208$lambda$207$$inlined$items$default$4;->$books$inlined:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    .line 437
    instance-of v11, v2, Ljava/util/Collection;

    if-eqz v11, :cond_b

    move-object v11, v2

    check-cast v11, Ljava/util/Collection;

    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_b

    goto/16 :goto_8

    .line 439
    :cond_b
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_c
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_16

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/example/data/Book;

    .line 436
    iget-object v13, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$lambda$276$lambda$275$lambda$209$lambda$208$lambda$207$$inlined$items$default$4;->$currentUser$inlined:Ljava/lang/String;

    invoke-static {v11, v13}, Lcom/example/ui/screens/DashboardScreenKt;->isBookOwner(Lcom/example/data/Book;Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_c

    add-int/lit8 v10, v10, 0x1

    if-gez v10, :cond_c

    .line 439
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwCountOverflow()V

    goto :goto_5

    .line 434
    :sswitch_2
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    goto/16 :goto_8

    .line 457
    :cond_d
    iget-object v2, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$lambda$276$lambda$275$lambda$209$lambda$208$lambda$207$$inlined$items$default$4;->$userWishlist$delegate$inlined:Landroidx/compose/runtime/State;

    invoke-static {v2}, Lcom/example/ui/screens/DashboardScreenKt;->access$DashboardScreen$lambda$23(Landroidx/compose/runtime/State;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v10

    goto/16 :goto_8

    .line 434
    :sswitch_3
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    goto/16 :goto_8

    .line 435
    :cond_e
    iget-object v2, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$lambda$276$lambda$275$lambda$209$lambda$208$lambda$207$$inlined$items$default$4;->$books$inlined:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v10

    goto/16 :goto_8

    .line 434
    :sswitch_4
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    goto/16 :goto_8

    .line 441
    :cond_f
    iget-object v2, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$lambda$276$lambda$275$lambda$209$lambda$208$lambda$207$$inlined$items$default$4;->$aiRecommendedBooks$inlined:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v10

    goto/16 :goto_8

    .line 434
    :sswitch_5
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_10

    goto/16 :goto_8

    .line 447
    :cond_10
    iget-object v2, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$lambda$276$lambda$275$lambda$209$lambda$208$lambda$207$$inlined$items$default$4;->$books$inlined:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    .line 448
    instance-of v11, v2, Ljava/util/Collection;

    if-eqz v11, :cond_11

    move-object v11, v2

    check-cast v11, Ljava/util/Collection;

    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_11

    goto :goto_8

    .line 450
    :cond_11
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_12
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_16

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/example/data/Book;

    .line 447
    invoke-virtual {v11}, Lcom/example/data/Book;->getStatus()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_12

    add-int/lit8 v10, v10, 0x1

    if-gez v10, :cond_12

    .line 450
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwCountOverflow()V

    goto :goto_6

    .line 434
    :sswitch_6
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_13

    goto :goto_8

    .line 452
    :cond_13
    iget-object v2, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$lambda$276$lambda$275$lambda$209$lambda$208$lambda$207$$inlined$items$default$4;->$books$inlined:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    .line 453
    instance-of v11, v2, Ljava/util/Collection;

    if-eqz v11, :cond_14

    move-object v11, v2

    check-cast v11, Ljava/util/Collection;

    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_14

    goto :goto_8

    .line 455
    :cond_14
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_15
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_16

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/example/data/Book;

    .line 452
    invoke-virtual {v11}, Lcom/example/data/Book;->getStatus()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_15

    add-int/lit8 v10, v10, 0x1

    if-gez v10, :cond_15

    .line 455
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwCountOverflow()V

    goto :goto_7

    .line 460
    :cond_16
    :goto_8
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    const/4 v11, 0x0

    sparse-switch v2, :sswitch_data_1

    goto/16 :goto_9

    :sswitch_7
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_17

    goto/16 :goto_9

    .line 464
    :cond_17
    sget-object v2, Landroidx/compose/material/icons/Icons;->INSTANCE:Landroidx/compose/material/icons/Icons;

    invoke-virtual {v2}, Landroidx/compose/material/icons/Icons;->getDefault()Landroidx/compose/material/icons/Icons$Filled;

    move-result-object v2

    invoke-static {v2}, Landroidx/compose/material/icons/filled/CheckCircleKt;->getCheckCircle(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;

    move-result-object v2

    goto/16 :goto_a

    .line 460
    :sswitch_8
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_18

    goto :goto_9

    .line 462
    :cond_18
    sget-object v2, Landroidx/compose/material/icons/Icons$AutoMirrored$Filled;->INSTANCE:Landroidx/compose/material/icons/Icons$AutoMirrored$Filled;

    invoke-static {v2}, Landroidx/compose/material/icons/automirrored/filled/LibraryBooksKt;->getLibraryBooks(Landroidx/compose/material/icons/Icons$AutoMirrored$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;

    move-result-object v2

    goto :goto_a

    .line 460
    :sswitch_9
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_19

    goto :goto_9

    .line 467
    :cond_19
    sget-object v2, Landroidx/compose/material/icons/Icons;->INSTANCE:Landroidx/compose/material/icons/Icons;

    invoke-virtual {v2}, Landroidx/compose/material/icons/Icons;->getDefault()Landroidx/compose/material/icons/Icons$Filled;

    move-result-object v2

    invoke-static {v2}, Landroidx/compose/material/icons/filled/BookmarkKt;->getBookmark(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;

    move-result-object v2

    goto :goto_a

    .line 460
    :sswitch_a
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1a

    goto :goto_9

    .line 461
    :cond_1a
    sget-object v2, Landroidx/compose/material/icons/Icons;->INSTANCE:Landroidx/compose/material/icons/Icons;

    invoke-virtual {v2}, Landroidx/compose/material/icons/Icons;->getDefault()Landroidx/compose/material/icons/Icons$Filled;

    move-result-object v2

    invoke-static {v2}, Landroidx/compose/material/icons/filled/AutoStoriesKt;->getAutoStories(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;

    move-result-object v2

    goto :goto_a

    .line 460
    :sswitch_b
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1b

    goto :goto_9

    .line 463
    :cond_1b
    sget-object v2, Landroidx/compose/material/icons/Icons;->INSTANCE:Landroidx/compose/material/icons/Icons;

    invoke-virtual {v2}, Landroidx/compose/material/icons/Icons;->getDefault()Landroidx/compose/material/icons/Icons$Filled;

    move-result-object v2

    invoke-static {v2}, Landroidx/compose/material/icons/filled/StarKt;->getStar(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;

    move-result-object v2

    goto :goto_a

    .line 460
    :sswitch_c
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1c

    goto :goto_9

    .line 465
    :cond_1c
    sget-object v2, Landroidx/compose/material/icons/Icons;->INSTANCE:Landroidx/compose/material/icons/Icons;

    invoke-virtual {v2}, Landroidx/compose/material/icons/Icons;->getDefault()Landroidx/compose/material/icons/Icons$Filled;

    move-result-object v2

    invoke-static {v2}, Landroidx/compose/material/icons/filled/EmailKt;->getEmail(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;

    move-result-object v2

    goto :goto_a

    .line 460
    :sswitch_d
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1d

    goto :goto_9

    .line 466
    :cond_1d
    sget-object v2, Landroidx/compose/material/icons/Icons;->INSTANCE:Landroidx/compose/material/icons/Icons;

    invoke-virtual {v2}, Landroidx/compose/material/icons/Icons;->getDefault()Landroidx/compose/material/icons/Icons$Filled;

    move-result-object v2

    invoke-static {v2}, Landroidx/compose/material/icons/filled/BookKt;->getBook(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;

    move-result-object v2

    goto :goto_a

    :goto_9
    move-object v2, v11

    .line 471
    :goto_a
    iget-object v3, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$lambda$276$lambda$275$lambda$209$lambda$208$lambda$207$$inlined$items$default$4;->$filterStatus$delegate$inlined:Landroidx/compose/runtime/State;

    invoke-static {v3}, Lcom/example/ui/screens/DashboardScreenKt;->access$DashboardScreen$lambda$1(Landroidx/compose/runtime/State;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v30

    const/16 v3, 0x36

    const/4 v4, 0x1

    if-eqz v2, :cond_1e

    const v5, -0x48a29293

    .line 473
    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v5, "786@39982L74"

    invoke-static {v12, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 474
    new-instance v5, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$1$2$1$1$1;

    invoke-direct {v5, v2}, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$1$2$1$1$1;-><init>(Landroidx/compose/ui/graphics/vector/ImageVector;)V

    const v2, 0x16fa97b0

    invoke-static {v2, v4, v5, v12, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v2

    .line 473
    move-object v11, v2

    check-cast v11, Lkotlin/jvm/functions/Function2;

    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_b

    :cond_1e
    const v2, -0x48a074ce

    .line 475
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    :goto_b
    move-object/from16 v31, v11

    const/high16 v2, 0x41800000    # 16.0f

    .line 486
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    .line 485
    invoke-static {v2}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    move-result-object v32

    move-object v2, v1

    .line 487
    sget-object v1, Landroidx/compose/material3/FilterChipDefaults;->INSTANCE:Landroidx/compose/material3/FilterChipDefaults;

    .line 488
    sget-object v5, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    sget v6, Landroidx/compose/material3/MaterialTheme;->$stable:I

    invoke-virtual {v5, v12, v6}, Landroidx/compose/material3/MaterialTheme;->getColorScheme(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ColorScheme;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/compose/material3/ColorScheme;->getPrimaryContainer-0d7_KjU()J

    move-result-wide v16

    .line 489
    sget-object v5, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    sget v6, Landroidx/compose/material3/MaterialTheme;->$stable:I

    invoke-virtual {v5, v12, v6}, Landroidx/compose/material3/MaterialTheme;->getColorScheme(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ColorScheme;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/compose/material3/ColorScheme;->getOnPrimaryContainer-0d7_KjU()J

    move-result-wide v20

    sget v5, Landroidx/compose/material3/FilterChipDefaults;->$stable:I

    shl-int/lit8 v28, v5, 0x6

    const/16 v29, 0xd7f

    move-object v5, v2

    move v6, v3

    const-wide/16 v2, 0x0

    move v8, v4

    move-object v7, v5

    const-wide/16 v4, 0x0

    move v11, v6

    move-object v9, v7

    const-wide/16 v6, 0x0

    move v14, v8

    move-object v13, v9

    const-wide/16 v8, 0x0

    move v15, v10

    move/from16 v18, v11

    const-wide/16 v10, 0x0

    move-object/from16 v19, v13

    const-wide/16 v12, 0x0

    move/from16 v23, v14

    move/from16 v22, v15

    const-wide/16 v14, 0x0

    move/from16 v25, v18

    move-object/from16 v24, v19

    const-wide/16 v18, 0x0

    move/from16 v26, v22

    move/from16 v27, v23

    const-wide/16 v22, 0x0

    move-object/from16 v33, v24

    move/from16 v34, v25

    const-wide/16 v24, 0x0

    move/from16 v35, v27

    const/16 v27, 0x0

    move/from16 v37, v26

    move-object/from16 v36, v33

    move-object/from16 v26, p3

    .line 487
    invoke-virtual/range {v1 .. v29}, Landroidx/compose/material3/FilterChipDefaults;->filterChipColors-XqyqHi0(JJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SelectableChipColors;

    move-result-object v8

    move-object/from16 v12, v26

    const v1, -0x3c2653ed

    .line 471
    const-string v2, "CC(remember):DashboardScreen.kt#9igjgp"

    .line 490
    invoke-static {v12, v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    iget-object v1, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$lambda$276$lambda$275$lambda$209$lambda$208$lambda$207$$inlined$items$default$4;->$viewModel$inlined:Lcom/example/ui/BookViewModel;

    invoke-interface {v12, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    move-object/from16 v13, v36

    invoke-interface {v12, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    .line 491
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_1f

    .line 492
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_20

    .line 490
    :cond_1f
    new-instance v1, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$1$2$1$1$2$1;

    iget-object v2, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$lambda$276$lambda$275$lambda$209$lambda$208$lambda$207$$inlined$items$default$4;->$viewModel$inlined:Lcom/example/ui/BookViewModel;

    invoke-direct {v1, v2, v13}, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$1$2$1$1$2$1;-><init>(Lcom/example/ui/BookViewModel;Ljava/lang/String;)V

    move-object v2, v1

    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 494
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 490
    :cond_20
    move-object v1, v2

    check-cast v1, Lkotlin/jvm/functions/Function0;

    invoke-static {v12}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 497
    new-instance v2, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$1$2$1$1$3;

    iget-object v0, v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$lambda$276$lambda$275$lambda$209$lambda$208$lambda$207$$inlined$items$default$4;->$filterStatus$delegate$inlined:Landroidx/compose/runtime/State;

    move/from16 v15, v37

    invoke-direct {v2, v13, v15, v0}, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$1$2$1$1$3;-><init>(Ljava/lang/String;ILandroidx/compose/runtime/State;)V

    const v0, -0x74192568

    const/16 v11, 0x36

    const/4 v14, 0x1

    invoke-static {v0, v14, v2, v12, v11}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function2;

    .line 485
    move-object/from16 v7, v32

    check-cast v7, Landroidx/compose/ui/graphics/Shape;

    const/4 v14, 0x0

    const/16 v15, 0xe58

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v13, 0x180

    move/from16 v0, v30

    move-object/from16 v5, v31

    .line 498
    invoke-static/range {v0 .. v15}, Landroidx/compose/material3/ChipKt;->FilterChip(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V

    invoke-interface/range {p3 .. p3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 153
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_21

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_21
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x545002ac -> :sswitch_6
        -0x308b58b2 -> :sswitch_5
        -0x29f78dc5 -> :sswitch_4
        0xfd81 -> :sswitch_3
        0x1f8511dd -> :sswitch_2
        0x48a8a637 -> :sswitch_1
        0x7a599aa9 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        -0x545002ac -> :sswitch_d
        -0x308b58b2 -> :sswitch_c
        -0x29f78dc5 -> :sswitch_b
        0xfd81 -> :sswitch_a
        0x1f8511dd -> :sswitch_9
        0x48a8a637 -> :sswitch_8
        0x7a599aa9 -> :sswitch_7
    .end sparse-switch
.end method
