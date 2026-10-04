.class public final synthetic Lcom/example/ui/screens/BookMatchmakerDialogKt$$ExternalSyntheticLambda3;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Lcom/example/data/Book;

.field public final synthetic f$1:I

.field public final synthetic f$2:Ljava/lang/String;

.field public final synthetic f$3:Lcom/example/ui/BookViewModel;

.field public final synthetic f$4:Landroid/content/Context;

.field public final synthetic f$5:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$6:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$7:Landroidx/compose/runtime/MutableIntState;


# direct methods
.method public synthetic constructor <init>(Lcom/example/data/Book;ILjava/lang/String;Lcom/example/ui/BookViewModel;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/MutableIntState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/BookMatchmakerDialogKt$$ExternalSyntheticLambda3;->f$0:Lcom/example/data/Book;

    iput p2, p0, Lcom/example/ui/screens/BookMatchmakerDialogKt$$ExternalSyntheticLambda3;->f$1:I

    iput-object p3, p0, Lcom/example/ui/screens/BookMatchmakerDialogKt$$ExternalSyntheticLambda3;->f$2:Ljava/lang/String;

    iput-object p4, p0, Lcom/example/ui/screens/BookMatchmakerDialogKt$$ExternalSyntheticLambda3;->f$3:Lcom/example/ui/BookViewModel;

    iput-object p5, p0, Lcom/example/ui/screens/BookMatchmakerDialogKt$$ExternalSyntheticLambda3;->f$4:Landroid/content/Context;

    iput-object p6, p0, Lcom/example/ui/screens/BookMatchmakerDialogKt$$ExternalSyntheticLambda3;->f$5:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lcom/example/ui/screens/BookMatchmakerDialogKt$$ExternalSyntheticLambda3;->f$6:Lkotlin/jvm/functions/Function0;

    iput-object p8, p0, Lcom/example/ui/screens/BookMatchmakerDialogKt$$ExternalSyntheticLambda3;->f$7:Landroidx/compose/runtime/MutableIntState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/BookMatchmakerDialogKt$$ExternalSyntheticLambda3;->f$0:Lcom/example/data/Book;

    iget v1, p0, Lcom/example/ui/screens/BookMatchmakerDialogKt$$ExternalSyntheticLambda3;->f$1:I

    iget-object v2, p0, Lcom/example/ui/screens/BookMatchmakerDialogKt$$ExternalSyntheticLambda3;->f$2:Ljava/lang/String;

    iget-object v3, p0, Lcom/example/ui/screens/BookMatchmakerDialogKt$$ExternalSyntheticLambda3;->f$3:Lcom/example/ui/BookViewModel;

    iget-object v4, p0, Lcom/example/ui/screens/BookMatchmakerDialogKt$$ExternalSyntheticLambda3;->f$4:Landroid/content/Context;

    iget-object v5, p0, Lcom/example/ui/screens/BookMatchmakerDialogKt$$ExternalSyntheticLambda3;->f$5:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Lcom/example/ui/screens/BookMatchmakerDialogKt$$ExternalSyntheticLambda3;->f$6:Lkotlin/jvm/functions/Function0;

    iget-object v7, p0, Lcom/example/ui/screens/BookMatchmakerDialogKt$$ExternalSyntheticLambda3;->f$7:Landroidx/compose/runtime/MutableIntState;

    move-object v8, p1

    check-cast v8, Landroidx/compose/foundation/layout/ColumnScope;

    move-object v9, p2

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-static/range {v0 .. v10}, Lcom/example/ui/screens/BookMatchmakerDialogKt;->BookMatchmakerDialog$lambda$44$lambda$43$lambda$42$lambda$41(Lcom/example/data/Book;ILjava/lang/String;Lcom/example/ui/BookViewModel;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
