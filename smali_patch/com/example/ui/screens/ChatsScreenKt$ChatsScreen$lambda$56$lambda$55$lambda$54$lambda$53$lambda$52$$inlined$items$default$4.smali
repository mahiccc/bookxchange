.class public final Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$lambda$56$lambda$55$lambda$54$lambda$53$lambda$52$$inlined$items$default$4;
.super Lkotlin/jvm/internal/Lambda;
.source "LazyDsl.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/screens/ChatsScreenKt;->ChatsScreen(Lcom/example/ui/BookViewModel;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
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
    value = "SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$4\n+ 2 ChatsScreen.kt\ncom/example/ui/screens/ChatsScreenKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,433:1\n266#2,13:434\n280#2:454\n149#3:447\n1225#4,6:448\n*S KotlinDebug\n*F\n+ 1 ChatsScreen.kt\ncom/example/ui/screens/ChatsScreenKt\n*L\n278#1:447\n269#1:448,6\n*E\n"
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
.field final synthetic $items:Ljava/util/List;

.field final synthetic $selectedFilter$delegate$inlined:Landroidx/compose/runtime/MutableState;

.field final synthetic $totalUnread$inlined:I


# direct methods
.method public constructor <init>(Ljava/util/List;Landroidx/compose/runtime/MutableState;I)V
    .locals 0

    iput-object p1, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$lambda$56$lambda$55$lambda$54$lambda$53$lambda$52$$inlined$items$default$4;->$items:Ljava/util/List;

    iput-object p2, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$lambda$56$lambda$55$lambda$54$lambda$53$lambda$52$$inlined$items$default$4;->$selectedFilter$delegate$inlined:Landroidx/compose/runtime/MutableState;

    iput p3, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$lambda$56$lambda$55$lambda$54$lambda$53$lambda$52$$inlined$items$default$4;->$totalUnread$inlined:I

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

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$lambda$56$lambda$55$lambda$54$lambda$53$lambda$52$$inlined$items$default$4;->invoke(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V

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
    iget-object v2, v0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$lambda$56$lambda$55$lambda$54$lambda$53$lambda$52$$inlined$items$default$4;->$items:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const v2, -0x46623ba4

    .line 434
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v2, "C*273@12581L226,268@12163L27,269@12232L287,266@12054L850:ChatsScreen.kt#2thlc2"

    invoke-static {v12, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    iget-object v2, v0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$lambda$56$lambda$55$lambda$54$lambda$53$lambda$52$$inlined$items$default$4;->$selectedFilter$delegate$inlined:Landroidx/compose/runtime/MutableState;

    invoke-static {v2}, Lcom/example/ui/screens/ChatsScreenKt;->access$ChatsScreen$lambda$7(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    move-object v3, v1

    .line 442
    sget-object v1, Landroidx/compose/material3/FilterChipDefaults;->INSTANCE:Landroidx/compose/material3/FilterChipDefaults;

    const-wide v4, 0xff1b873fL

    .line 443
    invoke-static {v4, v5}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v13

    const/16 v19, 0xe

    const/16 v20, 0x0

    const v15, 0x3e19999a    # 0.15f

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v13 .. v20}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v16

    const-wide v4, 0xff0f5132L

    .line 444
    invoke-static {v4, v5}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v20

    sget v4, Landroidx/compose/material3/FilterChipDefaults;->$stable:I

    shl-int/lit8 v28, v4, 0x6

    const/16 v29, 0xd7f

    move v5, v2

    move-object v4, v3

    const-wide/16 v2, 0x0

    move-object v6, v4

    move v7, v5

    const-wide/16 v4, 0x0

    move-object v8, v6

    move v9, v7

    const-wide/16 v6, 0x0

    move-object v10, v8

    move v11, v9

    const-wide/16 v8, 0x0

    move-object v13, v10

    move v14, v11

    const-wide/16 v10, 0x0

    move-object v15, v13

    const-wide/16 v12, 0x0

    move/from16 v19, v14

    move-object/from16 v18, v15

    const-wide/16 v14, 0x0

    move-object/from16 v22, v18

    move/from16 v23, v19

    const-wide/16 v18, 0x0

    move-object/from16 v24, v22

    move/from16 v25, v23

    const-wide/16 v22, 0x0

    move-object/from16 v26, v24

    move/from16 v27, v25

    const-wide/16 v24, 0x0

    move/from16 v30, v27

    const/high16 v27, 0x30c00000

    move-object/from16 v0, v26

    move/from16 v31, v30

    move-object/from16 v26, p3

    .line 442
    invoke-virtual/range {v1 .. v29}, Landroidx/compose/material3/FilterChipDefaults;->filterChipColors-XqyqHi0(JJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SelectableChipColors;

    move-result-object v8

    move-object/from16 v12, v26

    const/high16 v1, 0x41800000    # 16.0f

    .line 447
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 446
    invoke-static {v1}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    move-result-object v1

    const v2, -0x7e242096

    .line 436
    const-string v3, "CC(remember):ChatsScreen.kt#9igjgp"

    .line 437
    invoke-static {v12, v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    .line 448
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_8

    .line 449
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_7

    goto :goto_4

    :cond_7
    move-object v2, v3

    move-object/from16 v3, p0

    goto :goto_5

    .line 437
    :cond_8
    :goto_4
    new-instance v2, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$3$1$1$4$1$1$1$1;

    move-object/from16 v3, p0

    iget-object v4, v3, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$lambda$56$lambda$55$lambda$54$lambda$53$lambda$52$$inlined$items$default$4;->$selectedFilter$delegate$inlined:Landroidx/compose/runtime/MutableState;

    invoke-direct {v2, v0, v4}, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$3$1$1$4$1$1$1$1;-><init>(Ljava/lang/String;Landroidx/compose/runtime/MutableState;)V

    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 451
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 437
    :goto_5
    check-cast v2, Lkotlin/jvm/functions/Function0;

    invoke-static {v12}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 438
    new-instance v4, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$3$1$1$4$1$1$2;

    iget v3, v3, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$lambda$56$lambda$55$lambda$54$lambda$53$lambda$52$$inlined$items$default$4;->$totalUnread$inlined:I

    move/from16 v11, v31

    invoke-direct {v4, v0, v3, v11}, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$3$1$1$4$1$1$2;-><init>(Ljava/lang/String;IZ)V

    const/16 v0, 0x36

    const v3, -0x580d5a1e

    const/4 v5, 0x1

    invoke-static {v3, v5, v4, v12, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 446
    move-object v7, v1

    check-cast v7, Landroidx/compose/ui/graphics/Shape;

    const/4 v14, 0x0

    const/16 v15, 0xe78

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move/from16 v27, v11

    const/4 v11, 0x0

    const/16 v13, 0x180

    move-object v1, v2

    move-object v2, v0

    move/from16 v0, v27

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
