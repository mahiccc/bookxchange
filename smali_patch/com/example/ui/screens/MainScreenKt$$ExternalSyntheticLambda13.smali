.class public final synthetic Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda13;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# instance fields
.field public final synthetic f$0:Lcom/example/ui/BookViewModel;

.field public final synthetic f$1:Landroidx/compose/runtime/State;

.field public final synthetic f$2:Landroidx/navigation/NavHostController;

.field public final synthetic f$3:Landroid/content/Context;

.field public final synthetic f$4:Landroidx/navigation/NavHostController;

.field public final synthetic f$5:Landroidx/compose/runtime/State;

.field public final synthetic f$6:Landroidx/compose/runtime/State;


# direct methods
.method public synthetic constructor <init>(Lcom/example/ui/BookViewModel;Landroidx/compose/runtime/State;Landroidx/navigation/NavHostController;Landroid/content/Context;Landroidx/navigation/NavHostController;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda13;->f$0:Lcom/example/ui/BookViewModel;

    iput-object p2, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda13;->f$1:Landroidx/compose/runtime/State;

    iput-object p3, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda13;->f$2:Landroidx/navigation/NavHostController;

    iput-object p4, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda13;->f$3:Landroid/content/Context;

    iput-object p5, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda13;->f$4:Landroidx/navigation/NavHostController;

    iput-object p6, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda13;->f$5:Landroidx/compose/runtime/State;

    iput-object p7, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda13;->f$6:Landroidx/compose/runtime/State;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda13;->f$0:Lcom/example/ui/BookViewModel;

    iget-object v1, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda13;->f$1:Landroidx/compose/runtime/State;

    iget-object v2, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda13;->f$2:Landroidx/navigation/NavHostController;

    iget-object v3, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda13;->f$3:Landroid/content/Context;

    iget-object v4, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda13;->f$4:Landroidx/navigation/NavHostController;

    iget-object v5, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda13;->f$5:Landroidx/compose/runtime/State;

    iget-object v6, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda13;->f$6:Landroidx/compose/runtime/State;

    move-object v7, p1

    check-cast v7, Landroidx/compose/animation/AnimatedContentScope;

    move-object v8, p2

    check-cast v8, Landroidx/navigation/NavBackStackEntry;

    move-object v9, p3

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-static/range {v0 .. v10}, Lcom/example/ui/screens/MainScreenKt;->MainScreen$lambda$94$lambda$93$lambda$92$lambda$91$lambda$68(Lcom/example/ui/BookViewModel;Landroidx/compose/runtime/State;Landroidx/navigation/NavHostController;Landroid/content/Context;Landroidx/navigation/NavHostController;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
