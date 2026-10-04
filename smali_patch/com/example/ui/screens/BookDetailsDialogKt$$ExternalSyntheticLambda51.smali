.class public final synthetic Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda51;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Z

.field public final synthetic f$1:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$2:Landroidx/compose/runtime/MutableIntState;

.field public final synthetic f$3:Ljava/lang/String;

.field public final synthetic f$4:Ljava/lang/String;

.field public final synthetic f$5:Lcom/example/data/Book;


# direct methods
.method public synthetic constructor <init>(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/MutableIntState;Ljava/lang/String;Ljava/lang/String;Lcom/example/data/Book;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda51;->f$0:Z

    iput-object p2, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda51;->f$1:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda51;->f$2:Landroidx/compose/runtime/MutableIntState;

    iput-object p4, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda51;->f$3:Ljava/lang/String;

    iput-object p5, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda51;->f$4:Ljava/lang/String;

    iput-object p6, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda51;->f$5:Lcom/example/data/Book;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 0
    iget-boolean v0, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda51;->f$0:Z

    iget-object v1, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda51;->f$1:Lkotlin/jvm/functions/Function0;

    iget-object v2, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda51;->f$2:Landroidx/compose/runtime/MutableIntState;

    iget-object v3, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda51;->f$3:Ljava/lang/String;

    iget-object v4, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda51;->f$4:Ljava/lang/String;

    iget-object v5, p0, Lcom/example/ui/screens/BookDetailsDialogKt$$ExternalSyntheticLambda51;->f$5:Lcom/example/data/Book;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lcom/example/ui/screens/BookDetailsDialogKt;->BookConditionPhotoDialog$lambda$376$lambda$375(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/MutableIntState;Ljava/lang/String;Ljava/lang/String;Lcom/example/data/Book;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
