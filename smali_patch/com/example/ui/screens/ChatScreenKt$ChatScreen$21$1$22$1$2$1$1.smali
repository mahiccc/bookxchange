.class final Lcom/example/ui/screens/ChatScreenKt$ChatScreen$21$1$22$1$2$1$1;
.super Ljava/lang/Object;
.source "ChatScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/screens/ChatScreenKt;->ChatScreen(Ljava/lang/String;Lcom/example/ui/BookViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
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
.field final synthetic $cleanText:Ljava/lang/String;

.field final synthetic $messageText$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/String;Landroidx/compose/runtime/MutableState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$21$1$22$1$2$1$1;->$cleanText:Ljava/lang/String;

    iput-object p2, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$21$1$22$1$2$1$1;->$messageText$delegate:Landroidx/compose/runtime/MutableState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 1579
    invoke-virtual {p0}, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$21$1$22$1$2$1$1;->invoke()V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke()V
    .locals 1

    .line 1580
    iget-object v0, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$21$1$22$1$2$1$1;->$messageText$delegate:Landroidx/compose/runtime/MutableState;

    iget-object p0, p0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$21$1$22$1$2$1$1;->$cleanText:Ljava/lang/String;

    invoke-static {v0, p0}, Lcom/example/ui/screens/ChatScreenKt;->access$ChatScreen$lambda$83(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    return-void
.end method
