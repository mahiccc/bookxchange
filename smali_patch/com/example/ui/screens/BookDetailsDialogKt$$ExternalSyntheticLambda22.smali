.class public final synthetic Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda22;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Lcom/example/data/Book;

.field public final synthetic f$1:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lcom/example/data/Book;Landroid/content/Context;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda22;->f$0:Lcom/example/data/Book;

    iput-object p2, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda22;->f$1:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda22;->f$0:Lcom/example/data/Book;

    iget-object p0, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda22;->f$1:Landroid/content/Context;

    invoke-static {v0, p0}, Lcom/example/ui/screens/BookDetailsDialogKt;->BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$183$lambda$182$lambda$181$lambda$180(Lcom/example/data/Book;Landroid/content/Context;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
