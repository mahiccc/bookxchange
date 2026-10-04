.class public final synthetic Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda23;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lkotlinx/coroutines/CoroutineScope;

.field public final synthetic f$1:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$10:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$2:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$3:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$4:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$5:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$6:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$7:Lcom/example/ui/BookViewModel;

.field public final synthetic f$8:Lcom/example/data/Book;

.field public final synthetic f$9:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/example/ui/BookViewModel;Lcom/example/data/Book;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda23;->f$0:Lkotlinx/coroutines/CoroutineScope;

    iput-object p2, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda23;->f$1:Landroidx/compose/runtime/MutableState;

    iput-object p3, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda23;->f$2:Landroidx/compose/runtime/MutableState;

    iput-object p4, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda23;->f$3:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda23;->f$4:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda23;->f$5:Landroidx/compose/runtime/MutableState;

    iput-object p7, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda23;->f$6:Landroidx/compose/runtime/MutableState;

    iput-object p8, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda23;->f$7:Lcom/example/ui/BookViewModel;

    iput-object p9, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda23;->f$8:Lcom/example/data/Book;

    iput-object p10, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda23;->f$9:Landroidx/compose/runtime/MutableState;

    iput-object p11, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda23;->f$10:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda23;->f$0:Lkotlinx/coroutines/CoroutineScope;

    iget-object v1, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda23;->f$1:Landroidx/compose/runtime/MutableState;

    iget-object v2, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda23;->f$2:Landroidx/compose/runtime/MutableState;

    iget-object v3, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda23;->f$3:Landroidx/compose/runtime/MutableState;

    iget-object v4, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda23;->f$4:Landroidx/compose/runtime/MutableState;

    iget-object v5, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda23;->f$5:Landroidx/compose/runtime/MutableState;

    iget-object v6, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda23;->f$6:Landroidx/compose/runtime/MutableState;

    iget-object v7, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda23;->f$7:Lcom/example/ui/BookViewModel;

    iget-object v8, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda23;->f$8:Lcom/example/data/Book;

    iget-object v9, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda23;->f$9:Landroidx/compose/runtime/MutableState;

    iget-object v10, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda23;->f$10:Landroidx/compose/runtime/MutableState;

    move-object v11, p1

    check-cast v11, Landroid/graphics/Bitmap;

    invoke-static/range {v0 .. v11}, Lcom/example/ui/screens/BookDetailsDialogKt;->BookDetailsDialog$lambda$70$lambda$69(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/example/ui/BookViewModel;Lcom/example/data/Book;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroid/graphics/Bitmap;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
