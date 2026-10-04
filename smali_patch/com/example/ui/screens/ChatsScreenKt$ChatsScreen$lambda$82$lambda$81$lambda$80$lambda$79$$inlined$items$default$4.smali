.class public final Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$lambda$82$lambda$81$lambda$80$lambda$79$$inlined$items$default$4;
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
    value = "SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$4\n+ 2 ChatsScreen.kt\ncom/example/ui/screens/ChatsScreenKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,433:1\n420#2,4:434\n429#2:444\n430#2,2:446\n489#2:448\n1225#3,6:438\n149#4:445\n*S KotlinDebug\n*F\n+ 1 ChatsScreen.kt\ncom/example/ui/screens/ChatsScreenKt\n*L\n423#1:438,6\n429#1:445\n*E\n"
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

.field final synthetic $showNewChatDialog$delegate$inlined:Landroidx/compose/runtime/MutableState;


# direct methods
.method public constructor <init>(Ljava/util/List;Landroid/content/SharedPreferences;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$lambda$82$lambda$81$lambda$80$lambda$79$$inlined$items$default$4;->$items:Ljava/util/List;

    iput-object p2, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$lambda$82$lambda$81$lambda$80$lambda$79$$inlined$items$default$4;->$prefs$inlined:Landroid/content/SharedPreferences;

    iput-object p3, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$lambda$82$lambda$81$lambda$80$lambda$79$$inlined$items$default$4;->$onChatClick$inlined:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$lambda$82$lambda$81$lambda$80$lambda$79$$inlined$items$default$4;->$showNewChatDialog$delegate$inlined:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$lambda$82$lambda$81$lambda$80$lambda$79$$inlined$items$default$4;->$readUpdateTrigger$delegate$inlined:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$lambda$82$lambda$81$lambda$80$lambda$79$$inlined$items$default$4;->$currentUser$inlined:Ljava/lang/String;

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

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$lambda$82$lambda$81$lambda$80$lambda$79$$inlined$items$default$4;->invoke(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v10, p3

    const-string v2, "C152@7074L22:LazyDsl.kt#428nma"

    invoke-static {v10, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v2, p4, 0x6

    if-nez v2, :cond_1

    move-object/from16 v2, p1

    invoke-interface {v10, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

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

    invoke-interface {v10, v1}, Landroidx/compose/runtime/Composer;->changed(I)Z

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
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

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
    iget-object v2, v0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$lambda$82$lambda$81$lambda$80$lambda$79$$inlined$items$default$4;->$items:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lcom/example/data/Book;

    const v1, -0x74c86548

    .line 434
    invoke-interface {v10, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v1, "C*422@19938L408,429@20477L11,430@20557L3900,419@19766L4691:ChatsScreen.kt#2thlc2"

    invoke-static {v10, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 435
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v1, Landroidx/compose/ui/Modifier;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v8, 0x1

    .line 436
    invoke-static {v1, v2, v8, v3}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const v1, 0xcbfbf70

    .line 437
    const-string v2, "CC(remember):ChatsScreen.kt#9igjgp"

    invoke-static {v10, v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    iget-object v1, v0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$lambda$82$lambda$81$lambda$80$lambda$79$$inlined$items$default$4;->$prefs$inlined:Landroid/content/SharedPreferences;

    invoke-interface {v10, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    iget-object v2, v0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$lambda$82$lambda$81$lambda$80$lambda$79$$inlined$items$default$4;->$onChatClick$inlined:Lkotlin/jvm/functions/Function1;

    invoke-interface {v10, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    .line 438
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_7

    .line 439
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_8

    .line 437
    :cond_7
    new-instance v2, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$8$1$1$1$1$1$1;

    iget-object v3, v0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$lambda$82$lambda$81$lambda$80$lambda$79$$inlined$items$default$4;->$prefs$inlined:Landroid/content/SharedPreferences;

    iget-object v5, v0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$lambda$82$lambda$81$lambda$80$lambda$79$$inlined$items$default$4;->$onChatClick$inlined:Lkotlin/jvm/functions/Function1;

    iget-object v6, v0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$lambda$82$lambda$81$lambda$80$lambda$79$$inlined$items$default$4;->$showNewChatDialog$delegate$inlined:Landroidx/compose/runtime/MutableState;

    iget-object v7, v0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$lambda$82$lambda$81$lambda$80$lambda$79$$inlined$items$default$4;->$readUpdateTrigger$delegate$inlined:Landroidx/compose/runtime/MutableState;

    invoke-direct/range {v2 .. v7}, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$8$1$1$1$1$1$1;-><init>(Landroid/content/SharedPreferences;Lcom/example/data/Book;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V

    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 441
    invoke-interface {v10, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 437
    :cond_8
    move-object v15, v2

    check-cast v15, Lkotlin/jvm/functions/Function0;

    invoke-static {v10}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/16 v16, 0x7

    const/16 v17, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v11 .. v17}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/high16 v2, 0x41400000    # 12.0f

    .line 445
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    .line 444
    invoke-static {v2}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/graphics/Shape;

    .line 446
    sget-object v3, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    sget v5, Landroidx/compose/material3/MaterialTheme;->$stable:I

    invoke-virtual {v3, v10, v5}, Landroidx/compose/material3/MaterialTheme;->getColorScheme(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ColorScheme;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/material3/ColorScheme;->getSurfaceVariant-0d7_KjU()J

    move-result-wide v11

    const/16 v17, 0xe

    const/16 v18, 0x0

    const/high16 v13, 0x3f000000    # 0.5f

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v11 .. v18}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v5

    .line 447
    new-instance v3, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$8$1$1$1$1$2;

    iget-object v0, v0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$lambda$82$lambda$81$lambda$80$lambda$79$$inlined$items$default$4;->$currentUser$inlined:Ljava/lang/String;

    invoke-direct {v3, v4, v0}, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$8$1$1$1$1$2;-><init>(Lcom/example/data/Book;Ljava/lang/String;)V

    const/16 v0, 0x36

    const v4, 0x4759585d

    invoke-static {v4, v8, v3, v10, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lkotlin/jvm/functions/Function2;

    const/high16 v11, 0xc00000

    const/16 v12, 0x78

    move-object v0, v1

    move-object v1, v2

    move-wide v2, v5

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 434
    invoke-static/range {v0 .. v12}, Landroidx/compose/material3/SurfaceKt;->Surface-T9BRK9s(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    invoke-interface/range {p3 .. p3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 153
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_9
    return-void
.end method
