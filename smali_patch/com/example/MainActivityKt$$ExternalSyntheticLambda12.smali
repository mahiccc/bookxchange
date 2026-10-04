.class public final synthetic Lcom/example/MainActivityKt$$ExternalSyntheticLambda12;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# instance fields
.field public final synthetic f$0:Landroidx/navigation/NavHostController;

.field public final synthetic f$1:Lcom/example/ui/BookViewModel;


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavHostController;Lcom/example/ui/BookViewModel;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/MainActivityKt$$ExternalSyntheticLambda12;->f$0:Landroidx/navigation/NavHostController;

    iput-object p2, p0, Lcom/example/MainActivityKt$$ExternalSyntheticLambda12;->f$1:Lcom/example/ui/BookViewModel;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 0
    iget-object v0, p0, Lcom/example/MainActivityKt$$ExternalSyntheticLambda12;->f$0:Landroidx/navigation/NavHostController;

    iget-object v1, p0, Lcom/example/MainActivityKt$$ExternalSyntheticLambda12;->f$1:Lcom/example/ui/BookViewModel;

    move-object v2, p1

    check-cast v2, Landroidx/compose/animation/AnimatedContentScope;

    move-object v3, p2

    check-cast v3, Landroidx/navigation/NavBackStackEntry;

    move-object v4, p3

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, Lcom/example/MainActivityKt;->BookBorrowApp$lambda$44$lambda$43$lambda$23(Landroidx/navigation/NavHostController;Lcom/example/ui/BookViewModel;Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
