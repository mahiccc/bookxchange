.class public final synthetic Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda168;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Ljava/util/List;

.field public final synthetic f$1:Ljava/lang/String;

.field public final synthetic f$2:Lcom/example/ui/BookViewModel;

.field public final synthetic f$3:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$4:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$5:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$6:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$7:I


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ljava/lang/String;Lcom/example/ui/BookViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda168;->f$0:Ljava/util/List;

    iput-object p2, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda168;->f$1:Ljava/lang/String;

    iput-object p3, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda168;->f$2:Lcom/example/ui/BookViewModel;

    iput-object p4, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda168;->f$3:Lkotlin/jvm/functions/Function0;

    iput-object p5, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda168;->f$4:Lkotlin/jvm/functions/Function0;

    iput-object p6, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda168;->f$5:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda168;->f$6:Lkotlin/jvm/functions/Function0;

    iput p8, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda168;->f$7:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda168;->f$0:Ljava/util/List;

    iget-object v1, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda168;->f$1:Ljava/lang/String;

    iget-object v2, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda168;->f$2:Lcom/example/ui/BookViewModel;

    iget-object v3, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda168;->f$3:Lkotlin/jvm/functions/Function0;

    iget-object v4, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda168;->f$4:Lkotlin/jvm/functions/Function0;

    iget-object v5, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda168;->f$5:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda168;->f$6:Lkotlin/jvm/functions/Function0;

    iget v7, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda168;->f$7:I

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lcom/example/ui/screens/DashboardScreenKt;->DashboardScreen$lambda$281(Ljava/util/List;Ljava/lang/String;Lcom/example/ui/BookViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
