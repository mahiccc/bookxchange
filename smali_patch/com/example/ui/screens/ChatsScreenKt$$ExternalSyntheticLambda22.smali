.class public final synthetic Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda22;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/example/ui/screens/ChatConversation;

.field public final synthetic f$1:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$2:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$3:Ljava/lang/String;

.field public final synthetic f$4:Z


# direct methods
.method public synthetic constructor <init>(Lcom/example/ui/screens/ChatConversation;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Ljava/lang/String;Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda22;->f$0:Lcom/example/ui/screens/ChatConversation;

    iput-object p2, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda22;->f$1:Landroidx/compose/runtime/MutableState;

    iput-object p3, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda22;->f$2:Landroidx/compose/runtime/MutableState;

    iput-object p4, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda22;->f$3:Ljava/lang/String;

    iput-boolean p5, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda22;->f$4:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda22;->f$0:Lcom/example/ui/screens/ChatConversation;

    iget-object v1, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda22;->f$1:Landroidx/compose/runtime/MutableState;

    iget-object v2, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda22;->f$2:Landroidx/compose/runtime/MutableState;

    iget-object v3, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda22;->f$3:Ljava/lang/String;

    iget-boolean v4, p0, Lcom/example/ui/screens/ChatsScreenKt$$ExternalSyntheticLambda22;->f$4:Z

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lcom/example/ui/screens/ChatsScreenKt;->WhatsAppConversationItem$lambda$102(Lcom/example/ui/screens/ChatConversation;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Ljava/lang/String;ZLandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
