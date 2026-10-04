.class public final synthetic Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda17;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$1:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/runtime/MutableState;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda17;->f$0:Landroidx/compose/runtime/MutableState;

    iput p2, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda17;->f$1:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda17;->f$0:Landroidx/compose/runtime/MutableState;

    iget p0, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda17;->f$1:I

    check-cast p1, Landroidx/compose/foundation/lazy/LazyListScope;

    invoke-static {v0, p0, p1}, Lcom/example/ui/screens/ChatsScreenKt;->ChatsScreen$lambda$56$lambda$55$lambda$54$lambda$53$lambda$52(Landroidx/compose/runtime/MutableState;ILandroidx/compose/foundation/lazy/LazyListScope;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
