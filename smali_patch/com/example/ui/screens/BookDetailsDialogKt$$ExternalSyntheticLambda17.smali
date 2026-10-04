.class public final synthetic Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda17;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Ljava/util/List;

.field public final synthetic f$1:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda17;->f$0:Ljava/util/List;

    iput-object p2, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda17;->f$1:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda17;->f$0:Ljava/util/List;

    iget-object p0, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda17;->f$1:Landroidx/compose/runtime/MutableState;

    check-cast p1, Landroidx/compose/foundation/lazy/LazyListScope;

    invoke-static {v0, p0, p1}, Lcom/example/ui/screens/BookDetailsDialogKt;->BookDetailsDialog$lambda$117$lambda$116$lambda$115$lambda$103$lambda$102(Ljava/util/List;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/lazy/LazyListScope;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
