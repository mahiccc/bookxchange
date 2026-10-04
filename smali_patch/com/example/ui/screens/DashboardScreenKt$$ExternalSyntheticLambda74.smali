.class public final synthetic Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda74;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Lcom/example/data/Book;

.field public final synthetic f$1:Z

.field public final synthetic f$2:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$3:Ljava/lang/String;

.field public final synthetic f$4:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$5:Ljava/lang/String;

.field public final synthetic f$6:Lkotlin/jvm/functions/Function2;

.field public final synthetic f$7:Lcom/example/ui/BookViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/example/data/Book;ZLkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lcom/example/ui/BookViewModel;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda74;->f$0:Lcom/example/data/Book;

    iput-boolean p2, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda74;->f$1:Z

    iput-object p3, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda74;->f$2:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda74;->f$3:Ljava/lang/String;

    iput-object p5, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda74;->f$4:Lkotlin/jvm/functions/Function0;

    iput-object p6, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda74;->f$5:Ljava/lang/String;

    iput-object p7, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda74;->f$6:Lkotlin/jvm/functions/Function2;

    iput-object p8, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda74;->f$7:Lcom/example/ui/BookViewModel;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda74;->f$0:Lcom/example/data/Book;

    iget-boolean v1, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda74;->f$1:Z

    iget-object v2, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda74;->f$2:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda74;->f$3:Ljava/lang/String;

    iget-object v4, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda74;->f$4:Lkotlin/jvm/functions/Function0;

    iget-object v5, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda74;->f$5:Ljava/lang/String;

    iget-object v6, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda74;->f$6:Lkotlin/jvm/functions/Function2;

    iget-object v7, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda74;->f$7:Lcom/example/ui/BookViewModel;

    move-object v8, p1

    check-cast v8, Landroidx/compose/foundation/layout/ColumnScope;

    move-object v9, p2

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-static/range {v0 .. v10}, Lcom/example/ui/screens/DashboardScreenKt;->BookCardGrid$lambda$441(Lcom/example/data/Book;ZLkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lcom/example/ui/BookViewModel;Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
