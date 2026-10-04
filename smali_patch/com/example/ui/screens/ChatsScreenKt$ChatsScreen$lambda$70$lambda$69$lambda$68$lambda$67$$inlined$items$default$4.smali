.class public final Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$lambda$70$lambda$69$lambda$68$lambda$67$$inlined$items$default$4;
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
    value = "SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$4\n+ 2 ChatsScreen.kt\ncom/example/ui/screens/ChatsScreenKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,433:1\n367#2,5:434\n382#2:445\n383#2:447\n384#2:449\n381#2,6:450\n1225#3,6:439\n149#4:446\n159#4:448\n*S KotlinDebug\n*F\n+ 1 ChatsScreen.kt\ncom/example/ui/screens/ChatsScreenKt\n*L\n371#1:439,6\n382#1:446\n383#1:448\n*E\n"
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
.field final synthetic $currentUser$inlined:Ljava/lang/String;

.field final synthetic $items:Ljava/util/List;

.field final synthetic $onChatClick$inlined:Lkotlin/jvm/functions/Function1;

.field final synthetic $prefs$inlined:Landroid/content/SharedPreferences;

.field final synthetic $readUpdateTrigger$delegate$inlined:Landroidx/compose/runtime/MutableState;

.field final synthetic $viewModel$inlined:Lcom/example/ui/BookViewModel;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/String;Lcom/example/ui/BookViewModel;Landroid/content/SharedPreferences;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    iput-object p1, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$lambda$70$lambda$69$lambda$68$lambda$67$$inlined$items$default$4;->$items:Ljava/util/List;

    iput-object p2, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$lambda$70$lambda$69$lambda$68$lambda$67$$inlined$items$default$4;->$currentUser$inlined:Ljava/lang/String;

    iput-object p3, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$lambda$70$lambda$69$lambda$68$lambda$67$$inlined$items$default$4;->$viewModel$inlined:Lcom/example/ui/BookViewModel;

    iput-object p4, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$lambda$70$lambda$69$lambda$68$lambda$67$$inlined$items$default$4;->$prefs$inlined:Landroid/content/SharedPreferences;

    iput-object p5, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$lambda$70$lambda$69$lambda$68$lambda$67$$inlined$items$default$4;->$onChatClick$inlined:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$lambda$70$lambda$69$lambda$68$lambda$67$$inlined$items$default$4;->$readUpdateTrigger$delegate$inlined:Landroidx/compose/runtime/MutableState;

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

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$lambda$70$lambda$69$lambda$68$lambda$67$$inlined$items$default$4;->invoke(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V
    .locals 13

    move-object/from16 v4, p3

    const-string v0, "C152@7074L22:LazyDsl.kt#428nma"

    invoke-static {v4, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_1

    invoke-interface {v4, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    :goto_0
    or-int p1, p4, p1

    goto :goto_1

    :cond_1
    move/from16 p1, p4

    :goto_1
    and-int/lit8 v0, p4, 0x30

    if-nez v0, :cond_3

    invoke-interface {v4, p2}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x20

    goto :goto_2

    :cond_2
    const/16 v0, 0x10

    :goto_2
    or-int/2addr p1, v0

    :cond_3
    and-int/lit16 v0, p1, 0x93

    const/16 v1, 0x92

    if-ne v0, v1, :cond_5

    .line 153
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    :cond_5
    :goto_3
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_6

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)"

    const v2, -0x25b7f321

    invoke-static {v2, p1, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_6
    iget-object p1, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$lambda$70$lambda$69$lambda$68$lambda$67$$inlined$items$default$4;->$items:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lcom/example/ui/screens/ChatConversation;

    const p1, -0x58377c1

    .line 434
    invoke-interface {v4, p1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string p1, "C*370@17346L569,366@17127L814,383@18155L11,380@17966L260:ChatsScreen.kt#2thlc2"

    invoke-static {v4, p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 436
    iget-object v1, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$lambda$70$lambda$69$lambda$68$lambda$67$$inlined$items$default$4;->$currentUser$inlined:Ljava/lang/String;

    .line 437
    iget-object v2, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$lambda$70$lambda$69$lambda$68$lambda$67$$inlined$items$default$4;->$viewModel$inlined:Lcom/example/ui/BookViewModel;

    const p1, -0x7c0c666e

    const-string p2, "CC(remember):ChatsScreen.kt#9igjgp"

    .line 438
    invoke-static {v4, p1, p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result p1

    iget-object p2, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$lambda$70$lambda$69$lambda$68$lambda$67$$inlined$items$default$4;->$prefs$inlined:Landroid/content/SharedPreferences;

    invoke-interface {v4, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result p2

    or-int/2addr p1, p2

    iget-object p2, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$lambda$70$lambda$69$lambda$68$lambda$67$$inlined$items$default$4;->$onChatClick$inlined:Lkotlin/jvm/functions/Function1;

    invoke-interface {v4, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result p2

    or-int/2addr p1, p2

    .line 439
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_7

    .line 440
    sget-object p1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {p1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object p1

    if-ne p2, p1, :cond_8

    .line 438
    :cond_7
    new-instance p1, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$5$1$2$1$2$1$1;

    iget-object p2, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$lambda$70$lambda$69$lambda$68$lambda$67$$inlined$items$default$4;->$prefs$inlined:Landroid/content/SharedPreferences;

    iget-object v3, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$lambda$70$lambda$69$lambda$68$lambda$67$$inlined$items$default$4;->$onChatClick$inlined:Lkotlin/jvm/functions/Function1;

    iget-object p0, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$lambda$70$lambda$69$lambda$68$lambda$67$$inlined$items$default$4;->$readUpdateTrigger$delegate$inlined:Landroidx/compose/runtime/MutableState;

    invoke-direct {p1, v0, p2, v3, p0}, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$5$1$2$1$2$1$1;-><init>(Lcom/example/ui/screens/ChatConversation;Landroid/content/SharedPreferences;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;)V

    move-object p2, p1

    check-cast p2, Lkotlin/jvm/functions/Function0;

    .line 442
    invoke-interface {v4, p2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 438
    :cond_8
    move-object v3, p2

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/4 v5, 0x0

    .line 434
    invoke-static/range {v0 .. v5}, Lcom/example/ui/screens/ChatsScreenKt;->WhatsAppConversationItem(Lcom/example/ui/screens/ChatConversation;Ljava/lang/String;Lcom/example/ui/BookViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    .line 445
    sget-object p0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    move-object v5, p0

    check-cast v5, Landroidx/compose/ui/Modifier;

    const/high16 p0, 0x42980000    # 76.0f

    .line 446
    invoke-static {p0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v6

    const/16 v10, 0xe

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 445
    invoke-static/range {v5 .. v11}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/high16 p0, 0x3f000000    # 0.5f

    .line 448
    invoke-static {p0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 449
    sget-object p0, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    sget p1, Landroidx/compose/material3/MaterialTheme;->$stable:I

    invoke-virtual {p0, v4, p1}, Landroidx/compose/material3/MaterialTheme;->getColorScheme(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ColorScheme;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/compose/material3/ColorScheme;->getOutlineVariant-0d7_KjU()J

    move-result-wide v5

    const/16 v11, 0xe

    const/4 v12, 0x0

    const/high16 v7, 0x3f000000    # 0.5f

    const/4 v10, 0x0

    invoke-static/range {v5 .. v12}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v2

    const/16 v5, 0x36

    const/4 v6, 0x0

    .line 450
    invoke-static/range {v0 .. v6}, Landroidx/compose/material3/DividerKt;->HorizontalDivider-9IZ8Weo(Landroidx/compose/ui/Modifier;FJLandroidx/compose/runtime/Composer;II)V

    invoke-interface/range {p3 .. p3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 153
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p0

    if-eqz p0, :cond_9

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_9
    return-void
.end method
