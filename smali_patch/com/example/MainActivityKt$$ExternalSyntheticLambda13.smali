.class public final synthetic Lcom/example/MainActivityKt$$ExternalSyntheticLambda13;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# instance fields
.field public final synthetic f$0:Lcom/example/ui/BookViewModel;

.field public final synthetic f$1:Landroidx/navigation/NavHostController;

.field public final synthetic f$2:Landroidx/compose/runtime/State;


# direct methods
.method public synthetic constructor <init>(Lcom/example/ui/BookViewModel;Landroidx/navigation/NavHostController;Landroidx/compose/runtime/State;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/MainActivityKt$$ExternalSyntheticLambda13;->f$0:Lcom/example/ui/BookViewModel;

    iput-object p2, p0, Lcom/example/MainActivityKt$$ExternalSyntheticLambda13;->f$1:Landroidx/navigation/NavHostController;

    iput-object p3, p0, Lcom/example/MainActivityKt$$ExternalSyntheticLambda13;->f$2:Landroidx/compose/runtime/State;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 0
    iget-object v0, p0, Lcom/example/MainActivityKt$$ExternalSyntheticLambda13;->f$0:Lcom/example/ui/BookViewModel;

    iget-object v1, p0, Lcom/example/MainActivityKt$$ExternalSyntheticLambda13;->f$1:Landroidx/navigation/NavHostController;

    iget-object v2, p0, Lcom/example/MainActivityKt$$ExternalSyntheticLambda13;->f$2:Landroidx/compose/runtime/State;

    move-object v3, p1

    check-cast v3, Landroidx/compose/animation/AnimatedContentScope;

    move-object v4, p2

    check-cast v4, Landroidx/navigation/NavBackStackEntry;

    move-object v5, p3

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lcom/example/MainActivityKt;->BookBorrowApp$lambda$44$lambda$43$lambda$38(Lcom/example/ui/BookViewModel;Landroidx/navigation/NavHostController;Landroidx/compose/runtime/State;Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
