.class public final synthetic Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda89;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Lcom/example/data/User;

.field public final synthetic f$1:Landroidx/compose/runtime/State;

.field public final synthetic f$2:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$3:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$4:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$5:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$6:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Lcom/example/data/User;Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda89;->f$0:Lcom/example/data/User;

    iput-object p2, p0, Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda89;->f$1:Landroidx/compose/runtime/State;

    iput-object p3, p0, Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda89;->f$2:Landroidx/compose/runtime/MutableState;

    iput-object p4, p0, Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda89;->f$3:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda89;->f$4:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda89;->f$5:Landroidx/compose/runtime/MutableState;

    iput-object p7, p0, Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda89;->f$6:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda89;->f$0:Lcom/example/data/User;

    iget-object v1, p0, Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda89;->f$1:Landroidx/compose/runtime/State;

    iget-object v2, p0, Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda89;->f$2:Landroidx/compose/runtime/MutableState;

    iget-object v3, p0, Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda89;->f$3:Landroidx/compose/runtime/MutableState;

    iget-object v4, p0, Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda89;->f$4:Landroidx/compose/runtime/MutableState;

    iget-object v5, p0, Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda89;->f$5:Landroidx/compose/runtime/MutableState;

    iget-object v6, p0, Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda89;->f$6:Landroidx/compose/runtime/MutableState;

    move-object v7, p1

    check-cast v7, Landroidx/compose/foundation/lazy/LazyItemScope;

    move-object v8, p2

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lcom/example/ui/screens/ProfileScreenKt;->ProfileScreen$lambda$127$lambda$126$lambda$125$lambda$91(Lcom/example/data/User;Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/lazy/LazyItemScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
