.class final Lcom/example/ui/screens/ProfileScreenKt$ProfileScreen$8$1$1$7$1$1$1;
.super Ljava/lang/Object;
.source "ProfileScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/screens/ProfileScreenKt;->ProfileScreen(Ljava/util/List;Ljava/lang/String;Lcom/example/ui/BookViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic $item:Lcom/example/data/WishlistRequest;

.field final synthetic $viewModel:Lcom/example/ui/BookViewModel;


# direct methods
.method constructor <init>(Lcom/example/ui/BookViewModel;Lcom/example/data/WishlistRequest;)V
    .locals 0

    iput-object p1, p0, Lcom/example/ui/screens/ProfileScreenKt$ProfileScreen$8$1$1$7$1$1$1;->$viewModel:Lcom/example/ui/BookViewModel;

    iput-object p2, p0, Lcom/example/ui/screens/ProfileScreenKt$ProfileScreen$8$1$1$7$1$1$1;->$item:Lcom/example/data/WishlistRequest;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 375
    invoke-virtual {p0}, Lcom/example/ui/screens/ProfileScreenKt$ProfileScreen$8$1$1$7$1$1$1;->invoke()V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke()V
    .locals 1

    .line 375
    iget-object v0, p0, Lcom/example/ui/screens/ProfileScreenKt$ProfileScreen$8$1$1$7$1$1$1;->$viewModel:Lcom/example/ui/BookViewModel;

    iget-object p0, p0, Lcom/example/ui/screens/ProfileScreenKt$ProfileScreen$8$1$1$7$1$1$1;->$item:Lcom/example/data/WishlistRequest;

    invoke-virtual {p0}, Lcom/example/data/WishlistRequest;->getId()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/example/ui/BookViewModel;->removeFromWishlist(Ljava/lang/String;)V

    return-void
.end method
