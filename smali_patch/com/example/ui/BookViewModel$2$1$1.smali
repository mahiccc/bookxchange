.class final Lcom/example/ui/BookViewModel$2$1$1;
.super Ljava/lang/Object;
.source "BookViewModel.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/BookViewModel$2$1;->emit(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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

.field final synthetic this$0:Lcom/example/ui/BookViewModel;


# direct methods
.method constructor <init>(Lcom/example/ui/BookViewModel;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/example/ui/BookViewModel$2$1$1;->this$0:Lcom/example/ui/BookViewModel;

    iput-object p2, p0, Lcom/example/ui/BookViewModel$2$1$1;->$user:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 83
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/BookViewModel$2$1$1;->emit(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final emit(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
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

    .line 84
    sget-object p2, Lcom/example/ui/NotificationService;->INSTANCE:Lcom/example/ui/NotificationService;

    iget-object v0, p0, Lcom/example/ui/BookViewModel$2$1$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v0}, Lcom/example/ui/BookViewModel;->access$getAppContext$p(Lcom/example/ui/BookViewModel;)Landroid/content/Context;

    move-result-object v0

    iget-object p0, p0, Lcom/example/ui/BookViewModel$2$1$1;->$user:Ljava/lang/String;

    invoke-virtual {p2, v0, p1, p0}, Lcom/example/ui/NotificationService;->checkAndNotifyMessages(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;)V

    .line 85
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method
