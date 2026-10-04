.class public final Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$43$lambda$42$lambda$41$$inlined$items$default$4;
.super Lkotlin/jvm/internal/Lambda;
.source "LazyDsl.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/screens/SafeMeetupDialogKt;->SafeMeetupDialog(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/ui/BookViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
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
    value = "SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$4\n+ 2 SafeMeetupDialog.kt\ncom/example/ui/screens/SafeMeetupDialogKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,433:1\n229#2,4:434\n242#2,15:444\n1225#3,6:438\n*S KotlinDebug\n*F\n+ 1 SafeMeetupDialog.kt\ncom/example/ui/screens/SafeMeetupDialogKt\n*L\n232#1:438,6\n*E\n"
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
.field final synthetic $dynamicPresets$inlined:Ljava/util/List;

.field final synthetic $geocodedResults$delegate$inlined:Landroidx/compose/runtime/MutableState;

.field final synthetic $items:Ljava/util/List;

.field final synthetic $searchQuery$delegate$inlined:Landroidx/compose/runtime/MutableState;

.field final synthetic $selectedCategory$delegate$inlined:Landroidx/compose/runtime/MutableState;

.field final synthetic $selectedSpotName$delegate$inlined:Landroidx/compose/runtime/MutableState;

.field final synthetic $spotAddress$delegate$inlined:Landroidx/compose/runtime/MutableState;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/List;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    iput-object p1, p0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$43$lambda$42$lambda$41$$inlined$items$default$4;->$items:Ljava/util/List;

    iput-object p2, p0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$43$lambda$42$lambda$41$$inlined$items$default$4;->$dynamicPresets$inlined:Ljava/util/List;

    iput-object p3, p0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$43$lambda$42$lambda$41$$inlined$items$default$4;->$selectedCategory$delegate$inlined:Landroidx/compose/runtime/MutableState;

    iput-object p4, p0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$43$lambda$42$lambda$41$$inlined$items$default$4;->$searchQuery$delegate$inlined:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$43$lambda$42$lambda$41$$inlined$items$default$4;->$geocodedResults$delegate$inlined:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$43$lambda$42$lambda$41$$inlined$items$default$4;->$selectedSpotName$delegate$inlined:Landroidx/compose/runtime/MutableState;

    iput-object p7, p0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$43$lambda$42$lambda$41$$inlined$items$default$4;->$spotAddress$delegate$inlined:Landroidx/compose/runtime/MutableState;

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

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$43$lambda$42$lambda$41$$inlined$items$default$4;->invoke(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V
    .locals 32

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
    iget-object v2, v0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$43$lambda$42$lambda$41$$inlined$items$default$4;->$items:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/lang/String;

    const v1, -0x41a33c19

    .line 434
    invoke-interface {v12, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v1, "C*231@10642L530,241@11214L431,251@11800L11,252@11901L11,250@11707L258,229@10533L1462:SafeMeetupDialog.kt#2thlc2"

    invoke-static {v12, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    iget-object v1, v0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$43$lambda$42$lambda$41$$inlined$items$default$4;->$selectedCategory$delegate$inlined:Landroidx/compose/runtime/MutableState;

    invoke-static {v1}, Lcom/example/ui/screens/SafeMeetupDialogKt;->access$SafeMeetupDialog$lambda$7(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v30

    const v1, -0x6536be0d

    .line 436
    const-string v2, "CC(remember):SafeMeetupDialog.kt#9igjgp"

    .line 437
    invoke-static {v12, v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, v0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$43$lambda$42$lambda$41$$inlined$items$default$4;->$dynamicPresets$inlined:Ljava/util/List;

    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    .line 438
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_7

    .line 439
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_8

    .line 437
    :cond_7
    new-instance v2, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$5$1$1$1$1$1$1$1$1;

    iget-object v4, v0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$43$lambda$42$lambda$41$$inlined$items$default$4;->$dynamicPresets$inlined:Ljava/util/List;

    iget-object v5, v0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$43$lambda$42$lambda$41$$inlined$items$default$4;->$selectedCategory$delegate$inlined:Landroidx/compose/runtime/MutableState;

    iget-object v6, v0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$43$lambda$42$lambda$41$$inlined$items$default$4;->$searchQuery$delegate$inlined:Landroidx/compose/runtime/MutableState;

    iget-object v7, v0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$43$lambda$42$lambda$41$$inlined$items$default$4;->$geocodedResults$delegate$inlined:Landroidx/compose/runtime/MutableState;

    iget-object v8, v0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$43$lambda$42$lambda$41$$inlined$items$default$4;->$selectedSpotName$delegate$inlined:Landroidx/compose/runtime/MutableState;

    iget-object v9, v0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$lambda$71$lambda$70$lambda$69$lambda$43$lambda$42$lambda$41$$inlined$items$default$4;->$spotAddress$delegate$inlined:Landroidx/compose/runtime/MutableState;

    invoke-direct/range {v2 .. v9}, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$5$1$1$1$1$1$1$1$1;-><init>(Ljava/lang/String;Ljava/util/List;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V

    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 441
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 437
    :cond_8
    move-object v0, v2

    check-cast v0, Lkotlin/jvm/functions/Function0;

    invoke-static {v12}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 444
    new-instance v1, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$5$1$1$1$1$1$1$2;

    invoke-direct {v1, v3}, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$5$1$1$1$1$1$1$2;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x36

    const v3, -0x6bf8ba0c

    const/4 v4, 0x1

    invoke-static {v3, v4, v1, v12, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object/from16 v31, v1

    check-cast v31, Lkotlin/jvm/functions/Function2;

    .line 453
    sget-object v1, Landroidx/compose/material3/FilterChipDefaults;->INSTANCE:Landroidx/compose/material3/FilterChipDefaults;

    .line 454
    sget-object v2, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    sget v3, Landroidx/compose/material3/MaterialTheme;->$stable:I

    invoke-virtual {v2, v12, v3}, Landroidx/compose/material3/MaterialTheme;->getColorScheme(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ColorScheme;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/material3/ColorScheme;->getPrimaryContainer-0d7_KjU()J

    move-result-wide v16

    .line 455
    sget-object v2, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    sget v3, Landroidx/compose/material3/MaterialTheme;->$stable:I

    invoke-virtual {v2, v12, v3}, Landroidx/compose/material3/MaterialTheme;->getColorScheme(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ColorScheme;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/material3/ColorScheme;->getOnPrimaryContainer-0d7_KjU()J

    move-result-wide v20

    sget v2, Landroidx/compose/material3/FilterChipDefaults;->$stable:I

    shl-int/lit8 v28, v2, 0x6

    const/16 v29, 0xd7f

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    const-wide/16 v18, 0x0

    const-wide/16 v22, 0x0

    const-wide/16 v24, 0x0

    const/16 v27, 0x0

    move-object/from16 v26, p3

    .line 453
    invoke-virtual/range {v1 .. v29}, Landroidx/compose/material3/FilterChipDefaults;->filterChipColors-XqyqHi0(JJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SelectableChipColors;

    move-result-object v8

    const/4 v14, 0x0

    const/16 v15, 0xef8

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v13, 0x180

    move-object/from16 v12, p3

    move-object v1, v0

    move/from16 v0, v30

    move-object/from16 v2, v31

    .line 435
    invoke-static/range {v0 .. v15}, Landroidx/compose/material3/ChipKt;->FilterChip(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V

    invoke-interface/range {p3 .. p3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 153
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_9
    return-void
.end method
