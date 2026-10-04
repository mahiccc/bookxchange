.class public final synthetic Lcom/example/ui/screens/EcoLeaderboardDialogKt$$ExternalSyntheticLambda9;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:F

.field public final synthetic f$1:Ljava/lang/String;

.field public final synthetic f$2:I

.field public final synthetic f$3:I


# direct methods
.method public synthetic constructor <init>(FLjava/lang/String;II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/example/ui/screens/EcoLeaderboardDialogKt$$ExternalSyntheticLambda9;->f$0:F

    iput-object p2, p0, Lcom/example/ui/screens/EcoLeaderboardDialogKt$$ExternalSyntheticLambda9;->f$1:Ljava/lang/String;

    iput p3, p0, Lcom/example/ui/screens/EcoLeaderboardDialogKt$$ExternalSyntheticLambda9;->f$2:I

    iput p4, p0, Lcom/example/ui/screens/EcoLeaderboardDialogKt$$ExternalSyntheticLambda9;->f$3:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 0
    iget v0, p0, Lcom/example/ui/screens/EcoLeaderboardDialogKt$$ExternalSyntheticLambda9;->f$0:F

    iget-object v1, p0, Lcom/example/ui/screens/EcoLeaderboardDialogKt$$ExternalSyntheticLambda9;->f$1:Ljava/lang/String;

    iget v2, p0, Lcom/example/ui/screens/EcoLeaderboardDialogKt$$ExternalSyntheticLambda9;->f$2:I

    iget v3, p0, Lcom/example/ui/screens/EcoLeaderboardDialogKt$$ExternalSyntheticLambda9;->f$3:I

    move-object v4, p1

    check-cast v4, Landroidx/compose/foundation/layout/ColumnScope;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lcom/example/ui/screens/EcoLeaderboardDialogKt;->EcoLeaderboardDialog$lambda$32$lambda$31$lambda$30$lambda$29$lambda$28$lambda$26$lambda$25(FLjava/lang/String;IILandroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
