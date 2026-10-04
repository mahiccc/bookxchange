.class public final synthetic Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda34;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$1:Lcom/example/data/WishlistRequest;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/example/data/WishlistRequest;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda34;->f$0:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda34;->f$1:Lcom/example/data/WishlistRequest;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda34;->f$0:Lkotlin/jvm/functions/Function1;

    iget-object p0, p0, Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda34;->f$1:Lcom/example/data/WishlistRequest;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p0, p1, p2}, Lcom/example/ui/screens/ProfileScreenKt;->WishlistSection$lambda$261$lambda$260$lambda$259$lambda$258$lambda$257(Lkotlin/jvm/functions/Function1;Lcom/example/data/WishlistRequest;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
