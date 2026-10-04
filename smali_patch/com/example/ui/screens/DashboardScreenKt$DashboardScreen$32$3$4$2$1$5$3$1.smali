.class final Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$2$1$5$3$1;
.super Ljava/lang/Object;
.source "DashboardScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/screens/DashboardScreenKt;->DashboardScreen(Ljava/util/List;Ljava/lang/String;Lcom/example/ui/BookViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function2<",
        "Ljava/lang/String;",
        "Lcom/example/data/Book;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $currentBookForScan$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/example/data/Book;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $qrDisplayType$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $qrScannerType$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $scannedCondition$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $showAcceptTransferDialog$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $showBorrowerScanDialog$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $showQrDisplayDialog$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $showQrScannerDialog$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $showReturnDialog$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $showTransferScanDialog$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $viewModel:Lcom/example/ui/BookViewModel;


# direct methods
.method constructor <init>(Lcom/example/ui/BookViewModel;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/ui/BookViewModel;",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/example/data/Book;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$2$1$5$3$1;->$viewModel:Lcom/example/ui/BookViewModel;

    iput-object p2, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$2$1$5$3$1;->$currentBookForScan$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p3, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$2$1$5$3$1;->$showAcceptTransferDialog$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p4, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$2$1$5$3$1;->$showTransferScanDialog$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$2$1$5$3$1;->$qrDisplayType$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$2$1$5$3$1;->$showQrDisplayDialog$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p7, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$2$1$5$3$1;->$qrScannerType$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p8, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$2$1$5$3$1;->$showQrScannerDialog$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p9, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$2$1$5$3$1;->$showBorrowerScanDialog$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p10, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$2$1$5$3$1;->$scannedCondition$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p11, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$2$1$5$3$1;->$showReturnDialog$delegate:Landroidx/compose/runtime/MutableState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1028
    check-cast p1, Ljava/lang/String;

    check-cast p2, Lcom/example/data/Book;

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$2$1$5$3$1;->invoke(Ljava/lang/String;Lcom/example/data/Book;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke(Ljava/lang/String;Lcom/example/data/Book;)V
    .locals 4

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bookItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1029
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const-string v1, "HANDOVER"

    const-string v2, "RETURN"

    const/4 v3, 0x1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "REQUEST"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto/16 :goto_0

    .line 1030
    :cond_0
    iget-object p0, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$2$1$5$3$1;->$viewModel:Lcom/example/ui/BookViewModel;

    invoke-virtual {p0, p2}, Lcom/example/ui/BookViewModel;->requestBook(Lcom/example/data/Book;)V

    return-void

    .line 1029
    :sswitch_1
    const-string v0, "CANCEL_HANDOVER"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto/16 :goto_0

    .line 1041
    :cond_1
    iget-object p0, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$2$1$5$3$1;->$viewModel:Lcom/example/ui/BookViewModel;

    invoke-virtual {p0, p2}, Lcom/example/ui/BookViewModel;->cancelHandover(Lcom/example/data/Book;)V

    return-void

    .line 1029
    :sswitch_2
    const-string v0, "SHOW_RETURN_QR"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto/16 :goto_0

    .line 1037
    :cond_2
    iget-object p1, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$2$1$5$3$1;->$currentBookForScan$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1, p2}, Lcom/example/ui/screens/DashboardScreenKt;->access$DashboardScreen$lambda$54(Landroidx/compose/runtime/MutableState;Lcom/example/data/Book;)V

    iget-object p1, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$2$1$5$3$1;->$qrDisplayType$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1, v2}, Lcom/example/ui/screens/DashboardScreenKt;->access$DashboardScreen$lambda$75(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$2$1$5$3$1;->$showQrDisplayDialog$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p0, v3}, Lcom/example/ui/screens/DashboardScreenKt;->access$DashboardScreen$lambda$72(Landroidx/compose/runtime/MutableState;Z)V

    return-void

    .line 1029
    :sswitch_3
    const-string v0, "CONFIRM_RETURN"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto/16 :goto_0

    .line 1039
    :cond_3
    iget-object p1, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$2$1$5$3$1;->$currentBookForScan$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1, p2}, Lcom/example/ui/screens/DashboardScreenKt;->access$DashboardScreen$lambda$54(Landroidx/compose/runtime/MutableState;Lcom/example/data/Book;)V

    iget-object p1, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$2$1$5$3$1;->$scannedCondition$delegate:Landroidx/compose/runtime/MutableState;

    invoke-virtual {p2}, Lcom/example/data/Book;->getCondition()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/example/ui/screens/DashboardScreenKt;->access$DashboardScreen$lambda$57(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$2$1$5$3$1;->$showReturnDialog$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p0, v3}, Lcom/example/ui/screens/DashboardScreenKt;->access$DashboardScreen$lambda$60(Landroidx/compose/runtime/MutableState;Z)V

    return-void

    .line 1029
    :sswitch_4
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto/16 :goto_0

    .line 1033
    :cond_4
    iget-object p1, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$2$1$5$3$1;->$currentBookForScan$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1, p2}, Lcom/example/ui/screens/DashboardScreenKt;->access$DashboardScreen$lambda$54(Landroidx/compose/runtime/MutableState;Lcom/example/data/Book;)V

    iget-object p0, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$2$1$5$3$1;->$showTransferScanDialog$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p0, v3}, Lcom/example/ui/screens/DashboardScreenKt;->access$DashboardScreen$lambda$63(Landroidx/compose/runtime/MutableState;Z)V

    return-void

    .line 1029
    :sswitch_5
    const-string v0, "BORROWER_RETURN"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    goto/16 :goto_0

    :sswitch_6
    const-string v0, "SCAN_HANDOVER_QR"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto/16 :goto_0

    .line 1035
    :cond_5
    iget-object p1, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$2$1$5$3$1;->$currentBookForScan$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1, p2}, Lcom/example/ui/screens/DashboardScreenKt;->access$DashboardScreen$lambda$54(Landroidx/compose/runtime/MutableState;Lcom/example/data/Book;)V

    iget-object p1, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$2$1$5$3$1;->$qrScannerType$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1, v1}, Lcom/example/ui/screens/DashboardScreenKt;->access$DashboardScreen$lambda$81(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$2$1$5$3$1;->$showQrScannerDialog$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p0, v3}, Lcom/example/ui/screens/DashboardScreenKt;->access$DashboardScreen$lambda$78(Landroidx/compose/runtime/MutableState;Z)V

    return-void

    .line 1029
    :sswitch_7
    const-string v0, "SCAN_RETURN_QR"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto/16 :goto_0

    .line 1038
    :cond_6
    iget-object p1, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$2$1$5$3$1;->$currentBookForScan$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1, p2}, Lcom/example/ui/screens/DashboardScreenKt;->access$DashboardScreen$lambda$54(Landroidx/compose/runtime/MutableState;Lcom/example/data/Book;)V

    iget-object p1, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$2$1$5$3$1;->$qrScannerType$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1, v2}, Lcom/example/ui/screens/DashboardScreenKt;->access$DashboardScreen$lambda$81(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$2$1$5$3$1;->$showQrScannerDialog$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p0, v3}, Lcom/example/ui/screens/DashboardScreenKt;->access$DashboardScreen$lambda$78(Landroidx/compose/runtime/MutableState;Z)V

    return-void

    .line 1029
    :sswitch_8
    const-string v0, "ACCEPT_TRANSFER_VIEW"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_0

    .line 1032
    :cond_7
    iget-object p1, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$2$1$5$3$1;->$currentBookForScan$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1, p2}, Lcom/example/ui/screens/DashboardScreenKt;->access$DashboardScreen$lambda$54(Landroidx/compose/runtime/MutableState;Lcom/example/data/Book;)V

    iget-object p0, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$2$1$5$3$1;->$showAcceptTransferDialog$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p0, v3}, Lcom/example/ui/screens/DashboardScreenKt;->access$DashboardScreen$lambda$66(Landroidx/compose/runtime/MutableState;Z)V

    return-void

    .line 1029
    :sswitch_9
    const-string v0, "CANCEL_REQUEST"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto :goto_0

    .line 1040
    :cond_8
    iget-object p0, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$2$1$5$3$1;->$viewModel:Lcom/example/ui/BookViewModel;

    invoke-virtual {p0, p2}, Lcom/example/ui/BookViewModel;->cancelBorrowRequest(Lcom/example/data/Book;)V

    return-void

    .line 1029
    :sswitch_a
    const-string v0, "CANCEL_RETURN"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto :goto_0

    .line 1042
    :cond_9
    iget-object p0, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$2$1$5$3$1;->$viewModel:Lcom/example/ui/BookViewModel;

    invoke-virtual {p0, p2}, Lcom/example/ui/BookViewModel;->cancelReturn(Lcom/example/data/Book;)V

    return-void

    .line 1029
    :sswitch_b
    const-string v0, "ACCEPT_TRANSFER"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    goto :goto_0

    .line 1031
    :cond_a
    iget-object p0, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$2$1$5$3$1;->$viewModel:Lcom/example/ui/BookViewModel;

    invoke-virtual {p0, p2}, Lcom/example/ui/BookViewModel;->acceptTransfer(Lcom/example/data/Book;)V

    return-void

    .line 1029
    :sswitch_c
    const-string v0, "SHOW_HANDOVER_QR"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    goto :goto_0

    .line 1034
    :cond_b
    iget-object p1, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$2$1$5$3$1;->$currentBookForScan$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1, p2}, Lcom/example/ui/screens/DashboardScreenKt;->access$DashboardScreen$lambda$54(Landroidx/compose/runtime/MutableState;Lcom/example/data/Book;)V

    iget-object p1, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$2$1$5$3$1;->$qrDisplayType$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1, v1}, Lcom/example/ui/screens/DashboardScreenKt;->access$DashboardScreen$lambda$75(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$2$1$5$3$1;->$showQrDisplayDialog$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p0, v3}, Lcom/example/ui/screens/DashboardScreenKt;->access$DashboardScreen$lambda$72(Landroidx/compose/runtime/MutableState;Z)V

    return-void

    .line 1029
    :sswitch_d
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    goto :goto_0

    .line 1036
    :cond_c
    iget-object p1, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$2$1$5$3$1;->$currentBookForScan$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1, p2}, Lcom/example/ui/screens/DashboardScreenKt;->access$DashboardScreen$lambda$54(Landroidx/compose/runtime/MutableState;Lcom/example/data/Book;)V

    iget-object p0, p0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$2$1$5$3$1;->$showBorrowerScanDialog$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p0, v3}, Lcom/example/ui/screens/DashboardScreenKt;->access$DashboardScreen$lambda$69(Landroidx/compose/runtime/MutableState;Z)V

    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x701eced0 -> :sswitch_d
        -0x65b88c25 -> :sswitch_c
        -0x631d26be -> :sswitch_b
        -0x5416d16b -> :sswitch_a
        -0x2eedd256 -> :sswitch_9
        -0x1e00747e -> :sswitch_8
        0xf19f04e -> :sswitch_7
        0x1c421f5b -> :sswitch_6
        0x204dbead -> :sswitch_5
        0x2ec71dc3 -> :sswitch_4
        0x5d0c87af -> :sswitch_3
        0x5f6a64ce -> :sswitch_2
        0x68c555e8 -> :sswitch_1
        0x6c1a7e6f -> :sswitch_0
    .end sparse-switch
.end method
