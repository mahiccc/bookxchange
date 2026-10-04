.class public final synthetic Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda42;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Lkotlin/jvm/functions/Function2;

.field public final synthetic f$1:Lcom/example/data/Book;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function2;Lcom/example/data/Book;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda42;->f$0:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda42;->f$1:Lcom/example/data/Book;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda42;->f$0:Lkotlin/jvm/functions/Function2;

    iget-object p0, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda42;->f$1:Lcom/example/data/Book;

    invoke-static {v0, p0}, Lcom/example/ui/screens/DashboardScreenKt;->BookCardGrid$lambda$441$lambda$440$lambda$439$lambda$420$lambda$419$lambda$418(Lkotlin/jvm/functions/Function2;Lcom/example/data/Book;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
