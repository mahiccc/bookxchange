.class public final synthetic Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda80;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Lcom/example/data/Book;

.field public final synthetic f$1:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$2:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$3:Lcom/example/ui/BookViewModel;

.field public final synthetic f$4:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$5:Landroid/content/Context;

.field public final synthetic f$6:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$7:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Lcom/example/data/Book;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/example/ui/BookViewModel;Lkotlin/jvm/functions/Function0;Landroid/content/Context;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda80;->f$0:Lcom/example/data/Book;

    iput-object p2, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda80;->f$1:Landroidx/compose/runtime/MutableState;

    iput-object p3, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda80;->f$2:Landroidx/compose/runtime/MutableState;

    iput-object p4, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda80;->f$3:Lcom/example/ui/BookViewModel;

    iput-object p5, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda80;->f$4:Lkotlin/jvm/functions/Function0;

    iput-object p6, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda80;->f$5:Landroid/content/Context;

    iput-object p7, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda80;->f$6:Landroidx/compose/runtime/MutableState;

    iput-object p8, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda80;->f$7:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda80;->f$0:Lcom/example/data/Book;

    iget-object v1, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda80;->f$1:Landroidx/compose/runtime/MutableState;

    iget-object v2, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda80;->f$2:Landroidx/compose/runtime/MutableState;

    iget-object v3, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda80;->f$3:Lcom/example/ui/BookViewModel;

    iget-object v4, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda80;->f$4:Lkotlin/jvm/functions/Function0;

    iget-object v5, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda80;->f$5:Landroid/content/Context;

    iget-object v6, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda80;->f$6:Landroidx/compose/runtime/MutableState;

    iget-object v7, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda80;->f$7:Landroidx/compose/runtime/MutableState;

    move-object v8, p1

    check-cast v8, Landroidx/compose/foundation/layout/ColumnScope;

    move-object v9, p2

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-static/range {v0 .. v10}, Lcom/example/ui/screens/BookDetailsDialogKt;->BookDetailsDialog$lambda$117$lambda$116(Lcom/example/data/Book;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/example/ui/BookViewModel;Lkotlin/jvm/functions/Function0;Landroid/content/Context;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
