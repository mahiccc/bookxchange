.class public final synthetic Lcom/example/ui/screens/QRScannerDialogKt$$ExternalSyntheticLambda20;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$1:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$2:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/QRScannerDialogKt$$ExternalSyntheticLambda20;->f$0:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/example/ui/screens/QRScannerDialogKt$$ExternalSyntheticLambda20;->f$1:Landroidx/compose/runtime/MutableState;

    iput-object p3, p0, Lcom/example/ui/screens/QRScannerDialogKt$$ExternalSyntheticLambda20;->f$2:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/QRScannerDialogKt$$ExternalSyntheticLambda20;->f$0:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcom/example/ui/screens/QRScannerDialogKt$$ExternalSyntheticLambda20;->f$1:Landroidx/compose/runtime/MutableState;

    iget-object p0, p0, Lcom/example/ui/screens/QRScannerDialogKt$$ExternalSyntheticLambda20;->f$2:Landroidx/compose/runtime/MutableState;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, v1, p0, p1}, Lcom/example/ui/screens/QRScannerDialogKt;->QRScannerDialog$lambda$16$lambda$15$lambda$12(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
