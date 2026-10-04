.class public final synthetic Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda120;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lkotlinx/coroutines/CoroutineScope;

.field public final synthetic f$1:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$2:Lcom/example/ui/BookViewModel;

.field public final synthetic f$3:Landroidx/compose/material3/SnackbarHostState;


# direct methods
.method public synthetic constructor <init>(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Lcom/example/ui/BookViewModel;Landroidx/compose/material3/SnackbarHostState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda120;->f$0:Lkotlinx/coroutines/CoroutineScope;

    iput-object p2, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda120;->f$1:Landroidx/compose/runtime/MutableState;

    iput-object p3, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda120;->f$2:Lcom/example/ui/BookViewModel;

    iput-object p4, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda120;->f$3:Landroidx/compose/material3/SnackbarHostState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda120;->f$0:Lkotlinx/coroutines/CoroutineScope;

    iget-object v1, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda120;->f$1:Landroidx/compose/runtime/MutableState;

    iget-object v2, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda120;->f$2:Lcom/example/ui/BookViewModel;

    iget-object p0, p0, Lcom/example/ui/screens/DashboardScreenKt$$ExternalSyntheticLambda120;->f$3:Landroidx/compose/material3/SnackbarHostState;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, v2, p0, p1}, Lcom/example/ui/screens/DashboardScreenKt;->DashboardScreen$lambda$276$lambda$189$lambda$188(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Lcom/example/ui/BookViewModel;Landroidx/compose/material3/SnackbarHostState;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
