.class final Lcom/example/MainActivity$onCreate$1$1$1$2$1$1;
.super Ljava/lang/Object;
.source "MainActivity.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/MainActivity$onCreate$1$1$1$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic $user:Ljava/lang/String;

.field final synthetic $userMessages$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/example/data/Message;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $viewModel:Lcom/example/ui/BookViewModel;

.field final synthetic this$0:Lcom/example/MainActivity;


# direct methods
.method constructor <init>(Lcom/example/MainActivity;Ljava/lang/String;Lcom/example/ui/BookViewModel;Landroidx/compose/runtime/MutableState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/MainActivity;",
            "Ljava/lang/String;",
            "Lcom/example/ui/BookViewModel;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/example/data/Message;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/MainActivity$onCreate$1$1$1$2$1$1;->this$0:Lcom/example/MainActivity;

    iput-object p2, p0, Lcom/example/MainActivity$onCreate$1$1$1$2$1$1;->$user:Ljava/lang/String;

    iput-object p3, p0, Lcom/example/MainActivity$onCreate$1$1$1$2$1$1;->$viewModel:Lcom/example/ui/BookViewModel;

    iput-object p4, p0, Lcom/example/MainActivity$onCreate$1$1$1$2$1$1;->$userMessages$delegate:Landroidx/compose/runtime/MutableState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 126
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Lcom/example/MainActivity$onCreate$1$1$1$2$1$1;->emit(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final emit(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/example/data/Message;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 127
    iget-object p2, p0, Lcom/example/MainActivity$onCreate$1$1$1$2$1$1;->$userMessages$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p2, p1}, Lcom/example/MainActivity;->access$onCreate$lambda$11$lambda$10$lambda$9$lambda$6(Landroidx/compose/runtime/MutableState;Ljava/util/List;)V

    .line 128
    sget-object p2, Lcom/example/ui/NotificationService;->INSTANCE:Lcom/example/ui/NotificationService;

    iget-object v0, p0, Lcom/example/MainActivity$onCreate$1$1$1$2$1$1;->this$0:Lcom/example/MainActivity;

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lcom/example/MainActivity$onCreate$1$1$1$2$1$1;->$user:Ljava/lang/String;

    invoke-virtual {p2, v0, p1, v1}, Lcom/example/ui/NotificationService;->checkAndNotifyMessages(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;)V

    .line 129
    iget-object p1, p0, Lcom/example/MainActivity$onCreate$1$1$1$2$1$1;->$viewModel:Lcom/example/ui/BookViewModel;

    iget-object p0, p0, Lcom/example/MainActivity$onCreate$1$1$1$2$1$1;->$user:Ljava/lang/String;

    invoke-virtual {p1, p0}, Lcom/example/ui/BookViewModel;->markMessagesAsDelivered(Ljava/lang/String;)V

    .line 130
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method
