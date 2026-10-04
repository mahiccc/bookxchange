.class public final synthetic Lcom/example/MainActivityKt$$ExternalSyntheticLambda9;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Lcom/example/ui/BookViewModel;

.field public final synthetic f$1:Landroidx/navigation/NavHostController;


# direct methods
.method public synthetic constructor <init>(Lcom/example/ui/BookViewModel;Landroidx/navigation/NavHostController;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/MainActivityKt$$ExternalSyntheticLambda9;->f$0:Lcom/example/ui/BookViewModel;

    iput-object p2, p0, Lcom/example/MainActivityKt$$ExternalSyntheticLambda9;->f$1:Landroidx/navigation/NavHostController;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/example/MainActivityKt$$ExternalSyntheticLambda9;->f$0:Lcom/example/ui/BookViewModel;

    iget-object p0, p0, Lcom/example/MainActivityKt$$ExternalSyntheticLambda9;->f$1:Landroidx/navigation/NavHostController;

    invoke-static {v0, p0}, Lcom/example/MainActivityKt;->BookBorrowApp$lambda$44$lambda$43$lambda$38$lambda$37$lambda$36$lambda$35$lambda$34$lambda$33(Lcom/example/ui/BookViewModel;Landroidx/navigation/NavHostController;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
