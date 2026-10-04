.class public final synthetic Lcom/example/ui/screens/GamificationBadgesKt$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Landroidx/compose/ui/graphics/vector/ImageVector;

.field public final synthetic f$1:Ljava/lang/String;

.field public final synthetic f$2:Ljava/lang/String;

.field public final synthetic f$3:J

.field public final synthetic f$4:Landroidx/compose/ui/Modifier;

.field public final synthetic f$5:I

.field public final synthetic f$6:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Ljava/lang/String;JLandroidx/compose/ui/Modifier;II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/GamificationBadgesKt$$ExternalSyntheticLambda2;->f$0:Landroidx/compose/ui/graphics/vector/ImageVector;

    iput-object p2, p0, Lcom/example/ui/screens/GamificationBadgesKt$$ExternalSyntheticLambda2;->f$1:Ljava/lang/String;

    iput-object p3, p0, Lcom/example/ui/screens/GamificationBadgesKt$$ExternalSyntheticLambda2;->f$2:Ljava/lang/String;

    iput-wide p4, p0, Lcom/example/ui/screens/GamificationBadgesKt$$ExternalSyntheticLambda2;->f$3:J

    iput-object p6, p0, Lcom/example/ui/screens/GamificationBadgesKt$$ExternalSyntheticLambda2;->f$4:Landroidx/compose/ui/Modifier;

    iput p7, p0, Lcom/example/ui/screens/GamificationBadgesKt$$ExternalSyntheticLambda2;->f$5:I

    iput p8, p0, Lcom/example/ui/screens/GamificationBadgesKt$$ExternalSyntheticLambda2;->f$6:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/GamificationBadgesKt$$ExternalSyntheticLambda2;->f$0:Landroidx/compose/ui/graphics/vector/ImageVector;

    iget-object v1, p0, Lcom/example/ui/screens/GamificationBadgesKt$$ExternalSyntheticLambda2;->f$1:Ljava/lang/String;

    iget-object v2, p0, Lcom/example/ui/screens/GamificationBadgesKt$$ExternalSyntheticLambda2;->f$2:Ljava/lang/String;

    iget-wide v3, p0, Lcom/example/ui/screens/GamificationBadgesKt$$ExternalSyntheticLambda2;->f$3:J

    iget-object v5, p0, Lcom/example/ui/screens/GamificationBadgesKt$$ExternalSyntheticLambda2;->f$4:Landroidx/compose/ui/Modifier;

    iget v6, p0, Lcom/example/ui/screens/GamificationBadgesKt$$ExternalSyntheticLambda2;->f$5:I

    iget v7, p0, Lcom/example/ui/screens/GamificationBadgesKt$$ExternalSyntheticLambda2;->f$6:I

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lcom/example/ui/screens/GamificationBadgesKt;->BadgeCard_uDo3WH8$lambda$5(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Ljava/lang/String;JLandroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
