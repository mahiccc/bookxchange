.class public final synthetic Lcom/example/MainActivityKt$$ExternalSyntheticLambda5;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Lcom/example/ui/BookViewModel;

.field public final synthetic f$1:Landroidx/navigation/NavHostController;


# direct methods
.method public synthetic constructor <init>(Lcom/example/ui/BookViewModel;Landroidx/navigation/NavHostController;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/MainActivityKt$$ExternalSyntheticLambda5;->f$0:Lcom/example/ui/BookViewModel;

    iput-object p2, p0, Lcom/example/MainActivityKt$$ExternalSyntheticLambda5;->f$1:Landroidx/navigation/NavHostController;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/example/MainActivityKt$$ExternalSyntheticLambda5;->f$0:Lcom/example/ui/BookViewModel;

    iget-object p0, p0, Lcom/example/MainActivityKt$$ExternalSyntheticLambda5;->f$1:Landroidx/navigation/NavHostController;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    check-cast p3, Ljava/lang/String;

    invoke-static {v0, p0, p1, p2, p3}, Lcom/example/MainActivityKt;->BookBorrowApp$lambda$44$lambda$43$lambda$23$lambda$22$lambda$21(Lcom/example/ui/BookViewModel;Landroidx/navigation/NavHostController;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
