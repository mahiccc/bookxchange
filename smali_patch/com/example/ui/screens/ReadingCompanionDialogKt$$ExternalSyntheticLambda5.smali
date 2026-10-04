.class public final synthetic Lcom/example/ui/screens/ReadingCompanionDialogKt$$ExternalSyntheticLambda5;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Landroidx/compose/runtime/MutableFloatState;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/runtime/MutableFloatState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/ReadingCompanionDialogKt$$ExternalSyntheticLambda5;->f$0:Landroidx/compose/runtime/MutableFloatState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 0
    iget-object p0, p0, Lcom/example/ui/screens/ReadingCompanionDialogKt$$ExternalSyntheticLambda5;->f$0:Landroidx/compose/runtime/MutableFloatState;

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {p0, p1}, Lcom/example/ui/screens/ReadingCompanionDialogKt;->ReadingCompanionDialog$lambda$29$lambda$28$lambda$27$lambda$22$lambda$21$lambda$20$lambda$19(Landroidx/compose/runtime/MutableFloatState;F)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
