.class public final synthetic Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda73;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/example/data/Review;


# direct methods
.method public synthetic constructor <init>(Lcom/example/data/Review;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda73;->f$0:Lcom/example/data/Review;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 0
    iget-object p0, p0, Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda73;->f$0:Lcom/example/data/Review;

    check-cast p1, Landroidx/compose/foundation/lazy/LazyListScope;

    invoke-static {p0, p1}, Lcom/example/ui/screens/ProfileScreenKt;->ReviewItemCard$lambda$239$lambda$238$lambda$237$lambda$236(Lcom/example/data/Review;Landroidx/compose/foundation/lazy/LazyListScope;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
