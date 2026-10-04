.class public final Lcom/example/ui/screens/ChatScreenKt$ChatScreen$lambda$272$lambda$271$lambda$246$lambda$245$$inlined$items$default$4;
.super Lkotlin/jvm/internal/Lambda;
.source "LazyDsl.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/screens/ChatScreenKt;->ChatScreen(Ljava/lang/String;Lcom/example/ui/BookViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
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
    value = "SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$4\n+ 2 ChatScreen.kt\ncom/example/ui/screens/ChatScreenKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,433:1\n1146#2,9:434\n1156#2:444\n1159#2,3:446\n1162#2:455\n1490#2:456\n149#3:443\n149#3:445\n1225#4,6:449\n*S KotlinDebug\n*F\n+ 1 ChatScreen.kt\ncom/example/ui/screens/ChatScreenKt\n*L\n1154#1:443\n1156#1:445\n1161#1:449,6\n*E\n"
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
.field final synthetic $book$inlined:Lcom/example/data/Book;

.field final synthetic $context$inlined:Landroid/content/Context;

.field final synthetic $currentUser$delegate$inlined:Landroidx/compose/runtime/State;

.field final synthetic $isDarkTheme$inlined:Z

.field final synthetic $items:Ljava/util/List;

.field final synthetic $this_Column$inlined:Landroidx/compose/foundation/layout/ColumnScope;

.field final synthetic $timeFormat$inlined:Ljava/text/SimpleDateFormat;

.field final synthetic $viewModel$inlined:Lcom/example/ui/BookViewModel;


# direct methods
.method public constructor <init>(Ljava/util/List;ZLandroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/State;Ljava/text/SimpleDateFormat;Lcom/example/ui/BookViewModel;Landroid/content/Context;Lcom/example/data/Book;)V
    .locals 0

    iput-object p1, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$lambda$272$lambda$271$lambda$246$lambda$245$$inlined$items$default$4;->$items:Ljava/util/List;

    iput-boolean p2, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$lambda$272$lambda$271$lambda$246$lambda$245$$inlined$items$default$4;->$isDarkTheme$inlined:Z

    iput-object p3, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$lambda$272$lambda$271$lambda$246$lambda$245$$inlined$items$default$4;->$this_Column$inlined:Landroidx/compose/foundation/layout/ColumnScope;

    iput-object p4, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$lambda$272$lambda$271$lambda$246$lambda$245$$inlined$items$default$4;->$currentUser$delegate$inlined:Landroidx/compose/runtime/State;

    iput-object p5, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$lambda$272$lambda$271$lambda$246$lambda$245$$inlined$items$default$4;->$timeFormat$inlined:Ljava/text/SimpleDateFormat;

    iput-object p6, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$lambda$272$lambda$271$lambda$246$lambda$245$$inlined$items$default$4;->$viewModel$inlined:Lcom/example/ui/BookViewModel;

    iput-object p7, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$lambda$272$lambda$271$lambda$246$lambda$245$$inlined$items$default$4;->$context$inlined:Landroid/content/Context;

    iput-object p8, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$lambda$272$lambda$271$lambda$246$lambda$245$$inlined$items$default$4;->$book$inlined:Lcom/example/data/Book;

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

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$lambda$272$lambda$271$lambda$246$lambda$245$$inlined$items$default$4;->invoke(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V
    .locals 20

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v7, p3

    const-string v2, "C152@7074L22:LazyDsl.kt#428nma"

    invoke-static {v7, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v2, p4, 0x6

    const/4 v3, 0x2

    if-nez v2, :cond_1

    move-object/from16 v2, p1

    invoke-interface {v7, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int v2, p4, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p4

    :goto_1
    and-int/lit8 v4, p4, 0x30

    if-nez v4, :cond_3

    invoke-interface {v7, v1}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v2, v4

    :cond_3
    and-int/lit16 v4, v2, 0x93

    const/16 v5, 0x92

    if-ne v4, v5, :cond_5

    .line 153
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    :cond_5
    :goto_3
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v4

    if-eqz v4, :cond_6

    const/4 v4, -0x1

    const-string v5, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)"

    const v6, -0x25b7f321

    invoke-static {v6, v2, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_6
    iget-object v2, v0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$lambda$272$lambda$271$lambda$246$lambda$245$$inlined$items$default$4;->$items:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lcom/example/data/Message;

    const v1, -0x7533b94e

    .line 434
    invoke-interface {v7, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v1, "C*1160@58899L6,1161@58928L24596,1158@58756L24768:ChatScreen.kt#2thlc2"

    invoke-static {v7, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-virtual {v10}, Lcom/example/data/Message;->getSender()Ljava/lang/String;

    move-result-object v1

    iget-object v2, v0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$lambda$272$lambda$271$lambda$246$lambda$245$$inlined$items$default$4;->$currentUser$delegate$inlined:Landroidx/compose/runtime/State;

    invoke-static {v2}, Lcom/example/ui/screens/ChatScreenKt;->access$ChatScreen$lambda$13(Landroidx/compose/runtime/State;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    .line 438
    iget-boolean v1, v0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$lambda$272$lambda$271$lambda$246$lambda$245$$inlined$items$default$4;->$isDarkTheme$inlined:Z

    if-eqz v9, :cond_8

    if-eqz v1, :cond_7

    const-wide v1, 0xff005c4bL

    goto :goto_4

    :cond_7
    const-wide v1, 0xffd9fdd3L

    .line 436
    :goto_4
    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v1

    goto :goto_5

    :cond_8
    if-eqz v1, :cond_9

    const-wide v1, 0xff202c33L

    .line 438
    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v1

    goto :goto_5

    :cond_9
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    move-result-wide v1

    :goto_5
    move-wide v12, v1

    .line 440
    iget-boolean v1, v0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$lambda$272$lambda$271$lambda$246$lambda$245$$inlined$items$default$4;->$isDarkTheme$inlined:Z

    if-eqz v1, :cond_a

    const-wide v1, 0xffe9edefL

    goto :goto_6

    :cond_a
    const-wide v1, 0xff111b21L

    :goto_6
    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v1

    move-wide/from16 v18, v1

    const/high16 v1, 0x41800000    # 16.0f

    const/high16 v2, 0x40800000    # 4.0f

    if-eqz v9, :cond_b

    .line 443
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v4

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v5

    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 442
    invoke-static {v4, v2, v1, v5}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-a9UjIt4(FFFF)Landroidx/compose/foundation/shape/RoundedCornerShape;

    move-result-object v1

    goto :goto_7

    .line 445
    :cond_b
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v4

    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v5

    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 444
    invoke-static {v2, v4, v1, v5}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-a9UjIt4(FFFF)Landroidx/compose/foundation/shape/RoundedCornerShape;

    move-result-object v1

    :goto_7
    move-object v11, v1

    .line 446
    iget-object v1, v0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$lambda$272$lambda$271$lambda$246$lambda$245$$inlined$items$default$4;->$this_Column$inlined:Landroidx/compose/foundation/layout/ColumnScope;

    const/16 v2, 0xdc

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    .line 448
    invoke-static {v2, v4, v5, v6, v5}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    move-result-object v8

    check-cast v8, Landroidx/compose/animation/core/FiniteAnimationSpec;

    const/4 v14, 0x0

    invoke-static {v8, v14, v3, v5}, Landroidx/compose/animation/EnterExitTransitionKt;->fadeIn$default(Landroidx/compose/animation/core/FiniteAnimationSpec;FILjava/lang/Object;)Landroidx/compose/animation/EnterTransition;

    move-result-object v3

    invoke-static {v2, v4, v5, v6, v5}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    move-result-object v2

    check-cast v2, Landroidx/compose/animation/core/FiniteAnimationSpec;

    const v4, 0x3e48b30c

    const-string v5, "CC(remember):ChatScreen.kt#9igjgp"

    invoke-static {v7, v4, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 449
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    .line 450
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v4, v5, :cond_c

    .line 448
    sget-object v4, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$21$1$20$1$2$1$1;->INSTANCE:Lcom/example/ui/screens/ChatScreenKt$ChatScreen$21$1$20$1$2$1$1;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 452
    invoke-interface {v7, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 448
    :cond_c
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {v2, v4}, Landroidx/compose/animation/EnterExitTransitionKt;->slideInVertically(Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/EnterTransition;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroidx/compose/animation/EnterTransition;->plus(Landroidx/compose/animation/EnterTransition;)Landroidx/compose/animation/EnterTransition;

    move-result-object v3

    .line 455
    new-instance v8, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$21$1$20$1$2$2;

    iget-object v14, v0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$lambda$272$lambda$271$lambda$246$lambda$245$$inlined$items$default$4;->$timeFormat$inlined:Ljava/text/SimpleDateFormat;

    iget-object v15, v0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$lambda$272$lambda$271$lambda$246$lambda$245$$inlined$items$default$4;->$viewModel$inlined:Lcom/example/ui/BookViewModel;

    iget-object v2, v0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$lambda$272$lambda$271$lambda$246$lambda$245$$inlined$items$default$4;->$context$inlined:Landroid/content/Context;

    iget-object v0, v0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$lambda$272$lambda$271$lambda$246$lambda$245$$inlined$items$default$4;->$book$inlined:Lcom/example/data/Book;

    move-object/from16 v17, v0

    move-object/from16 v16, v2

    invoke-direct/range {v8 .. v19}, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$21$1$20$1$2$2;-><init>(ZLcom/example/data/Message;Landroidx/compose/foundation/shape/RoundedCornerShape;JLjava/text/SimpleDateFormat;Lcom/example/ui/BookViewModel;Landroid/content/Context;Lcom/example/data/Book;J)V

    const/16 v0, 0x36

    const v2, -0x38b3782

    const/4 v4, 0x1

    invoke-static {v2, v4, v8, v7, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function3;

    const v8, 0x180c30

    const/16 v9, 0x1a

    move-object v0, v1

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 446
    invoke-static/range {v0 .. v9}, Landroidx/compose/animation/AnimatedVisibilityKt;->AnimatedVisibility(Landroidx/compose/foundation/layout/ColumnScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    invoke-interface/range {p3 .. p3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 153
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_d
    return-void
.end method
