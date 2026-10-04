.class final Lcom/example/ui/screens/ChatScreenKt$ChatScreen$1$1$1;
.super Ljava/lang/Object;
.source "ChatScreen.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/screens/ChatScreenKt$ChatScreen$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/flow/FlowCollector;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $otherUserName$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $otherUserPhoto$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$1$1$1;->$otherUserName$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p2, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$1$1$1;->$otherUserPhoto$delegate:Landroidx/compose/runtime/MutableState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Lcom/example/data/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/data/User;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    if-eqz p1, :cond_2

    .line 175
    invoke-virtual {p1}, Lcom/example/data/User;->getDisplayName()Ljava/lang/String;

    move-result-object p2

    check-cast p2, Ljava/lang/CharSequence;

    invoke-static {p2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_0

    .line 176
    iget-object p2, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$1$1$1;->$otherUserName$delegate:Landroidx/compose/runtime/MutableState;

    invoke-virtual {p1}, Lcom/example/data/User;->getDisplayName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lcom/example/ui/screens/ChatScreenKt;->access$ChatScreen$lambda$72(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    .line 178
    :cond_0
    invoke-virtual {p1}, Lcom/example/data/User;->getProfilePicBase64()Ljava/lang/String;

    move-result-object p2

    check-cast p2, Ljava/lang/CharSequence;

    if-eqz p2, :cond_2

    invoke-static {p2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_0

    .line 179
    :cond_1
    iget-object p0, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$1$1$1;->$otherUserPhoto$delegate:Landroidx/compose/runtime/MutableState;

    invoke-virtual {p1}, Lcom/example/data/User;->getProfilePicBase64()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/example/ui/screens/ChatScreenKt;->access$ChatScreen$lambda$75(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    .line 182
    :cond_2
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 173
    check-cast p1, Lcom/example/data/User;

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$1$1$1;->emit(Lcom/example/data/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
