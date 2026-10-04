.class public final synthetic Lcom/example/ui/screens/QRCodeDisplayDialogKt$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$1:Ljava/lang/String;

.field public final synthetic f$2:Lcom/example/data/Book;

.field public final synthetic f$3:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$4:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lcom/example/data/Book;Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/QRCodeDisplayDialogKt$$ExternalSyntheticLambda0;->f$0:Lkotlin/jvm/functions/Function0;

    iput-object p2, p0, Lcom/example/ui/screens/QRCodeDisplayDialogKt$$ExternalSyntheticLambda0;->f$1:Ljava/lang/String;

    iput-object p3, p0, Lcom/example/ui/screens/QRCodeDisplayDialogKt$$ExternalSyntheticLambda0;->f$2:Lcom/example/data/Book;

    iput-object p4, p0, Lcom/example/ui/screens/QRCodeDisplayDialogKt$$ExternalSyntheticLambda0;->f$3:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/example/ui/screens/QRCodeDisplayDialogKt$$ExternalSyntheticLambda0;->f$4:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/QRCodeDisplayDialogKt$$ExternalSyntheticLambda0;->f$0:Lkotlin/jvm/functions/Function0;

    iget-object v1, p0, Lcom/example/ui/screens/QRCodeDisplayDialogKt$$ExternalSyntheticLambda0;->f$1:Ljava/lang/String;

    iget-object v2, p0, Lcom/example/ui/screens/QRCodeDisplayDialogKt$$ExternalSyntheticLambda0;->f$2:Lcom/example/data/Book;

    iget-object v3, p0, Lcom/example/ui/screens/QRCodeDisplayDialogKt$$ExternalSyntheticLambda0;->f$3:Landroidx/compose/runtime/MutableState;

    iget-object v4, p0, Lcom/example/ui/screens/QRCodeDisplayDialogKt$$ExternalSyntheticLambda0;->f$4:Ljava/lang/String;

    move-object v5, p1

    check-cast v5, Landroidx/compose/foundation/layout/ColumnScope;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lcom/example/ui/screens/QRCodeDisplayDialogKt;->QRCodeDisplayDialog$lambda$21$lambda$20(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lcom/example/data/Book;Landroidx/compose/runtime/MutableState;Ljava/lang/String;Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
