.class public final synthetic Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda9;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Ljava/util/List;

.field public final synthetic f$1:Ljava/lang/String;

.field public final synthetic f$2:Lcom/example/ui/BookViewModel;

.field public final synthetic f$3:Landroid/content/SharedPreferences;

.field public final synthetic f$4:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$5:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ljava/lang/String;Lcom/example/ui/BookViewModel;Landroid/content/SharedPreferences;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda9;->f$0:Ljava/util/List;

    iput-object p2, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda9;->f$1:Ljava/lang/String;

    iput-object p3, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda9;->f$2:Lcom/example/ui/BookViewModel;

    iput-object p4, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda9;->f$3:Landroid/content/SharedPreferences;

    iput-object p5, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda9;->f$4:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda9;->f$5:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda9;->f$0:Ljava/util/List;

    iget-object v1, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda9;->f$1:Ljava/lang/String;

    iget-object v2, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda9;->f$2:Lcom/example/ui/BookViewModel;

    iget-object v3, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda9;->f$3:Landroid/content/SharedPreferences;

    iget-object v4, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda9;->f$4:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda9;->f$5:Landroidx/compose/runtime/MutableState;

    move-object v6, p1

    check-cast v6, Landroidx/compose/foundation/lazy/LazyListScope;

    invoke-static/range {v0 .. v6}, Lcom/example/ui/screens/ChatsScreenKt;->ChatsScreen$lambda$70$lambda$69$lambda$68$lambda$67(Ljava/util/List;Ljava/lang/String;Lcom/example/ui/BookViewModel;Landroid/content/SharedPreferences;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/lazy/LazyListScope;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
