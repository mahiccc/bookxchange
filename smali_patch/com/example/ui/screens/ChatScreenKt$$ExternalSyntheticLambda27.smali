.class public final synthetic Lcom/example/ui/screens/ChatScreenKt$$ExternalSyntheticLambda27;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Ljava/lang/String;

.field public final synthetic f$1:J


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;J)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/ChatScreenKt$$ExternalSyntheticLambda27;->f$0:Ljava/lang/String;

    iput-wide p2, p0, Lcom/example/ui/screens/ChatScreenKt$$ExternalSyntheticLambda27;->f$1:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/ChatScreenKt$$ExternalSyntheticLambda27;->f$0:Ljava/lang/String;

    iget-wide v1, p0, Lcom/example/ui/screens/ChatScreenKt$$ExternalSyntheticLambda27;->f$1:J

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {v0, v1, v2, p1, p0}, Lcom/example/ui/screens/ChatScreenKt;->ChatScreen$lambda$272$lambda$271$lambda$194$lambda$193$lambda$192$lambda$191$lambda$188(Ljava/lang/String;JLandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
