.class public final synthetic Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda41;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/example/data/Book;

.field public final synthetic f$1:Lcom/example/ui/BookViewModel;

.field public final synthetic f$2:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$3:Landroidx/activity/compose/ManagedActivityResultLauncher;

.field public final synthetic f$4:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$5:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Lcom/example/data/Book;Lcom/example/ui/BookViewModel;Lkotlin/jvm/functions/Function0;Landroidx/activity/compose/ManagedActivityResultLauncher;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda41;->f$0:Lcom/example/data/Book;

    iput-object p2, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda41;->f$1:Lcom/example/ui/BookViewModel;

    iput-object p3, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda41;->f$2:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda41;->f$3:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iput-object p5, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda41;->f$4:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda41;->f$5:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda41;->f$0:Lcom/example/data/Book;

    iget-object v1, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda41;->f$1:Lcom/example/ui/BookViewModel;

    iget-object v2, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda41;->f$2:Lkotlin/jvm/functions/Function0;

    iget-object v3, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda41;->f$3:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iget-object v4, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda41;->f$4:Landroidx/compose/runtime/MutableState;

    iget-object v5, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda41;->f$5:Landroidx/compose/runtime/MutableState;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lcom/example/ui/screens/BookDetailsDialogKt;->BookDetailsDialog$lambda$143(Lcom/example/data/Book;Lcom/example/ui/BookViewModel;Lkotlin/jvm/functions/Function0;Landroidx/activity/compose/ManagedActivityResultLauncher;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
