.class public final synthetic Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda46;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Lcom/example/ui/BookViewModel;

.field public final synthetic f$1:Lcom/example/data/Book;

.field public final synthetic f$2:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$3:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Lcom/example/ui/BookViewModel;Lcom/example/data/Book;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda46;->f$0:Lcom/example/ui/BookViewModel;

    iput-object p2, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda46;->f$1:Lcom/example/data/Book;

    iput-object p3, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda46;->f$2:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda46;->f$3:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda46;->f$0:Lcom/example/ui/BookViewModel;

    iget-object v1, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda46;->f$1:Lcom/example/data/Book;

    iget-object v2, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda46;->f$2:Lkotlin/jvm/functions/Function0;

    iget-object p0, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda46;->f$3:Landroidx/compose/runtime/MutableState;

    invoke-static {v0, v1, v2, p0}, Lcom/example/ui/screens/BookDetailsDialogKt;->BookDetailsDialog$lambda$143$lambda$142$lambda$141$lambda$140$lambda$137$lambda$136(Lcom/example/ui/BookViewModel;Lcom/example/data/Book;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
