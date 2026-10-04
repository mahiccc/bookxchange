.class final Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$5$1$1$2$1$1;
.super Ljava/lang/Object;
.source "SafeMeetupDialog.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/screens/SafeMeetupDialogKt;->SafeMeetupDialog(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/ui/BookViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function0<",
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
.field final synthetic $selectedSpotName$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $spot:Lcom/example/ui/screens/SafeSpotOption;

.field final synthetic $spotAddress$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/example/ui/screens/SafeSpotOption;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/ui/screens/SafeSpotOption;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$5$1$1$2$1$1;->$spot:Lcom/example/ui/screens/SafeSpotOption;

    iput-object p2, p0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$5$1$1$2$1$1;->$selectedSpotName$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p3, p0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$5$1$1$2$1$1;->$spotAddress$delegate:Landroidx/compose/runtime/MutableState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 279
    invoke-virtual {p0}, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$5$1$1$2$1$1;->invoke()V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke()V
    .locals 2

    .line 280
    iget-object v0, p0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$5$1$1$2$1$1;->$selectedSpotName$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v1, p0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$5$1$1$2$1$1;->$spot:Lcom/example/ui/screens/SafeSpotOption;

    invoke-virtual {v1}, Lcom/example/ui/screens/SafeSpotOption;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/example/ui/screens/SafeMeetupDialogKt;->access$SafeMeetupDialog$lambda$22(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    .line 281
    iget-object v0, p0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$5$1$1$2$1$1;->$spotAddress$delegate:Landroidx/compose/runtime/MutableState;

    iget-object p0, p0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$5$1$1$2$1$1;->$spot:Lcom/example/ui/screens/SafeSpotOption;

    invoke-virtual {p0}, Lcom/example/ui/screens/SafeSpotOption;->getDefaultAddress()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lcom/example/ui/screens/SafeMeetupDialogKt;->access$SafeMeetupDialog$lambda$25(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    return-void
.end method
