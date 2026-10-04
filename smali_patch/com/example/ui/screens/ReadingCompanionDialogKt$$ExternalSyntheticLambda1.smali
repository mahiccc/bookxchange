.class public final synthetic Lcom/example/ui/screens/ReadingCompanionDialogKt$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:F

.field public final synthetic f$1:I

.field public final synthetic f$2:I

.field public final synthetic f$3:Landroidx/compose/runtime/MutableFloatState;


# direct methods
.method public synthetic constructor <init>(FIILandroidx/compose/runtime/MutableFloatState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/example/ui/screens/ReadingCompanionDialogKt$$ExternalSyntheticLambda1;->f$0:F

    iput p2, p0, Lcom/example/ui/screens/ReadingCompanionDialogKt$$ExternalSyntheticLambda1;->f$1:I

    iput p3, p0, Lcom/example/ui/screens/ReadingCompanionDialogKt$$ExternalSyntheticLambda1;->f$2:I

    iput-object p4, p0, Lcom/example/ui/screens/ReadingCompanionDialogKt$$ExternalSyntheticLambda1;->f$3:Landroidx/compose/runtime/MutableFloatState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 0
    iget v0, p0, Lcom/example/ui/screens/ReadingCompanionDialogKt$$ExternalSyntheticLambda1;->f$0:F

    iget v1, p0, Lcom/example/ui/screens/ReadingCompanionDialogKt$$ExternalSyntheticLambda1;->f$1:I

    iget v2, p0, Lcom/example/ui/screens/ReadingCompanionDialogKt$$ExternalSyntheticLambda1;->f$2:I

    iget-object v3, p0, Lcom/example/ui/screens/ReadingCompanionDialogKt$$ExternalSyntheticLambda1;->f$3:Landroidx/compose/runtime/MutableFloatState;

    move-object v4, p1

    check-cast v4, Landroidx/compose/foundation/layout/ColumnScope;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lcom/example/ui/screens/ReadingCompanionDialogKt;->ReadingCompanionDialog$lambda$29$lambda$28$lambda$27$lambda$22(FIILandroidx/compose/runtime/MutableFloatState;Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
