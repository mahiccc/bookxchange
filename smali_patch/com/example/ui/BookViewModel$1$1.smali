.class final Lcom/example/ui/BookViewModel$1$1;
.super Ljava/lang/Object;
.source "BookViewModel.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/BookViewModel$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic this$0:Lcom/example/ui/BookViewModel;


# direct methods
.method constructor <init>(Lcom/example/ui/BookViewModel;)V
    .locals 0

    iput-object p1, p0, Lcom/example/ui/BookViewModel$1$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 76
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/BookViewModel$1$1;->emit(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final emit(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/example/data/Book;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 77
    sget-object p2, Lcom/example/ui/NotificationService;->INSTANCE:Lcom/example/ui/NotificationService;

    iget-object v0, p0, Lcom/example/ui/BookViewModel$1$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v0}, Lcom/example/ui/BookViewModel;->access$getAppContext$p(Lcom/example/ui/BookViewModel;)Landroid/content/Context;

    move-result-object v0

    iget-object p0, p0, Lcom/example/ui/BookViewModel$1$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {p0}, Lcom/example/ui/BookViewModel;->access$get_currentUser$p(Lcom/example/ui/BookViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p0

    invoke-interface {p0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-virtual {p2, v0, p1, p0}, Lcom/example/ui/NotificationService;->checkAndNotifyBooks(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;)V

    .line 78
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method
