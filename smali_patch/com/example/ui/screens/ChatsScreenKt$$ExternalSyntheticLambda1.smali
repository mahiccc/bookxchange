.class public final synthetic Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Ljava/util/List;

.field public final synthetic f$1:Ljava/lang/String;

.field public final synthetic f$2:Lcom/example/ui/BookViewModel;

.field public final synthetic f$3:Landroid/content/SharedPreferences;

.field public final synthetic f$4:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$5:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$6:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$7:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$8:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ljava/lang/String;Lcom/example/ui/BookViewModel;Landroid/content/SharedPreferences;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda1;->f$0:Ljava/util/List;

    iput-object p2, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda1;->f$1:Ljava/lang/String;

    iput-object p3, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda1;->f$2:Lcom/example/ui/BookViewModel;

    iput-object p4, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda1;->f$3:Landroid/content/SharedPreferences;

    iput-object p5, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda1;->f$4:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda1;->f$5:Landroidx/compose/runtime/MutableState;

    iput-object p7, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda1;->f$6:Lkotlin/jvm/functions/Function0;

    iput-object p8, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda1;->f$7:Landroidx/compose/runtime/MutableState;

    iput-object p9, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda1;->f$8:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda1;->f$0:Ljava/util/List;

    iget-object v1, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda1;->f$1:Ljava/lang/String;

    iget-object v2, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda1;->f$2:Lcom/example/ui/BookViewModel;

    iget-object v3, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda1;->f$3:Landroid/content/SharedPreferences;

    iget-object v4, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda1;->f$4:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda1;->f$5:Landroidx/compose/runtime/MutableState;

    iget-object v6, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda1;->f$6:Lkotlin/jvm/functions/Function0;

    iget-object v7, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda1;->f$7:Landroidx/compose/runtime/MutableState;

    iget-object v8, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda1;->f$8:Landroidx/compose/runtime/MutableState;

    move-object v9, p1

    check-cast v9, Landroidx/compose/foundation/layout/PaddingValues;

    move-object v10, p2

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-static/range {v0 .. v11}, Lcom/example/ui/screens/ChatsScreenKt;->ChatsScreen$lambda$70(Ljava/util/List;Ljava/lang/String;Lcom/example/ui/BookViewModel;Landroid/content/SharedPreferences;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
