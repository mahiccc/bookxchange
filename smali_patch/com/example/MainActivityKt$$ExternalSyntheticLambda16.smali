.class public final synthetic Lcom/example/MainActivityKt$$ExternalSyntheticLambda16;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Landroid/content/SharedPreferences;

.field public final synthetic f$1:Landroidx/navigation/NavHostController;


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Landroidx/navigation/NavHostController;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/MainActivityKt$$ExternalSyntheticLambda16;->f$0:Landroid/content/SharedPreferences;

    iput-object p2, p0, Lcom/example/MainActivityKt$$ExternalSyntheticLambda16;->f$1:Landroidx/navigation/NavHostController;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/example/MainActivityKt$$ExternalSyntheticLambda16;->f$0:Landroid/content/SharedPreferences;

    iget-object p0, p0, Lcom/example/MainActivityKt$$ExternalSyntheticLambda16;->f$1:Landroidx/navigation/NavHostController;

    invoke-static {v0, p0}, Lcom/example/MainActivityKt;->BookBorrowApp$lambda$44$lambda$43$lambda$16$lambda$15$lambda$14(Landroid/content/SharedPreferences;Landroidx/navigation/NavHostController;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
