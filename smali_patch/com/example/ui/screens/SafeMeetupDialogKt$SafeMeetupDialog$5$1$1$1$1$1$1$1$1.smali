.class final Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$5$1$1$1$1$1$1$1$1;
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
.field final synthetic $cat:Ljava/lang/String;

.field final synthetic $dynamicPresets:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/example/ui/screens/SafeSpotOption;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $geocodedResults$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/example/ui/screens/SafeSpotOption;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $searchQuery$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $selectedCategory$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $selectedSpotName$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

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
.method constructor <init>(Ljava/lang/String;Ljava/util/List;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/example/ui/screens/SafeSpotOption;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/example/ui/screens/SafeSpotOption;",
            ">;>;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$5$1$1$1$1$1$1$1$1;->$cat:Ljava/lang/String;

    iput-object p2, p0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$5$1$1$1$1$1$1$1$1;->$dynamicPresets:Ljava/util/List;

    iput-object p3, p0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$5$1$1$1$1$1$1$1$1;->$selectedCategory$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p4, p0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$5$1$1$1$1$1$1$1$1;->$searchQuery$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$5$1$1$1$1$1$1$1$1;->$geocodedResults$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$5$1$1$1$1$1$1$1$1;->$selectedSpotName$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p7, p0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$5$1$1$1$1$1$1$1$1;->$spotAddress$delegate:Landroidx/compose/runtime/MutableState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 232
    invoke-virtual {p0}, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$5$1$1$1$1$1$1$1$1;->invoke()V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke()V
    .locals 3

    .line 233
    iget-object v0, p0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$5$1$1$1$1$1$1$1$1;->$selectedCategory$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v1, p0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$5$1$1$1$1$1$1$1$1;->$cat:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/example/ui/screens/SafeMeetupDialogKt;->access$SafeMeetupDialog$lambda$8(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    .line 234
    iget-object v0, p0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$5$1$1$1$1$1$1$1$1;->$searchQuery$delegate:Landroidx/compose/runtime/MutableState;

    const-string v1, ""

    invoke-static {v0, v1}, Lcom/example/ui/screens/SafeMeetupDialogKt;->access$SafeMeetupDialog$lambda$11(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    .line 235
    iget-object v0, p0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$5$1$1$1$1$1$1$1$1;->$geocodedResults$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/example/ui/screens/SafeMeetupDialogKt;->access$SafeMeetupDialog$lambda$17(Landroidx/compose/runtime/MutableState;Ljava/util/List;)V

    .line 236
    iget-object v0, p0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$5$1$1$1$1$1$1$1$1;->$dynamicPresets:Ljava/util/List;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/example/ui/screens/SafeSpotOption;

    if-eqz v0, :cond_0

    .line 238
    iget-object v1, p0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$5$1$1$1$1$1$1$1$1;->$selectedSpotName$delegate:Landroidx/compose/runtime/MutableState;

    invoke-virtual {v0}, Lcom/example/ui/screens/SafeSpotOption;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/example/ui/screens/SafeMeetupDialogKt;->access$SafeMeetupDialog$lambda$22(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    .line 239
    iget-object p0, p0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$5$1$1$1$1$1$1$1$1;->$spotAddress$delegate:Landroidx/compose/runtime/MutableState;

    invoke-virtual {v0}, Lcom/example/ui/screens/SafeSpotOption;->getDefaultAddress()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/example/ui/screens/SafeMeetupDialogKt;->access$SafeMeetupDialog$lambda$25(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
