.class public final synthetic Lcom/example/ui/screens/MutualFeedbackDialogKt$$ExternalSyntheticLambda11;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Landroidx/compose/runtime/MutableIntState;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/runtime/MutableIntState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/MutualFeedbackDialogKt$$ExternalSyntheticLambda11;->f$0:Landroidx/compose/runtime/MutableIntState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 0
    iget-object p0, p0, Lcom/example/ui/screens/MutualFeedbackDialogKt$$ExternalSyntheticLambda11;->f$0:Landroidx/compose/runtime/MutableIntState;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p0, p1}, Lcom/example/ui/screens/MutualFeedbackDialogKt;->MutualFeedbackDialog$lambda$70$lambda$69$lambda$68$lambda$63$lambda$39$lambda$38$lambda$31$lambda$30(Landroidx/compose/runtime/MutableIntState;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
