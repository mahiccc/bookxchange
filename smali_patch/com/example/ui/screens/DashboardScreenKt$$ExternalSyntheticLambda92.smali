.class public final synthetic Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda92;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Lcom/example/ui/BookViewModel;

.field public final synthetic f$1:Lcom/example/data/Book;


# direct methods
.method public synthetic constructor <init>(Lcom/example/ui/BookViewModel;Lcom/example/data/Book;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda92;->f$0:Lcom/example/ui/BookViewModel;

    iput-object p2, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda92;->f$1:Lcom/example/data/Book;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda92;->f$0:Lcom/example/ui/BookViewModel;

    iget-object p0, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda92;->f$1:Lcom/example/data/Book;

    invoke-static {v0, p0}, Lcom/example/ui/screens/DashboardScreenKt;->BookCard$lambda$372$lambda$312$lambda$304$lambda$303$lambda$302$lambda$298$lambda$297(Lcom/example/ui/BookViewModel;Lcom/example/data/Book;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
