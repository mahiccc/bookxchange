.class final Lcom/example/ui/BookViewModel$initiateReturn$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "BookViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/BookViewModel;->initiateReturn(Lcom/example/data/Book;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.example.ui.BookViewModel$initiateReturn$2"
    f = "BookViewModel.kt"
    i = {}
    l = {
        0x30f
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $aiCondition:Ljava/lang/String;

.field final synthetic $book:Lcom/example/data/Book;

.field final synthetic $updated:Lcom/example/data/Book;

.field label:I

.field final synthetic this$0:Lcom/example/ui/BookViewModel;


# direct methods
.method constructor <init>(Lcom/example/ui/BookViewModel;Lcom/example/data/Book;Lcom/example/data/Book;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/ui/BookViewModel;",
            "Lcom/example/data/Book;",
            "Lcom/example/data/Book;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/ui/BookViewModel$initiateReturn$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/BookViewModel$initiateReturn$2;->this$0:Lcom/example/ui/BookViewModel;

    iput-object p2, p0, Lcom/example/ui/BookViewModel$initiateReturn$2;->$updated:Lcom/example/data/Book;

    iput-object p3, p0, Lcom/example/ui/BookViewModel$initiateReturn$2;->$book:Lcom/example/data/Book;

    iput-object p4, p0, Lcom/example/ui/BookViewModel$initiateReturn$2;->$aiCondition:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/example/ui/BookViewModel$initiateReturn$2;

    iget-object v1, p0, Lcom/example/ui/BookViewModel$initiateReturn$2;->this$0:Lcom/example/ui/BookViewModel;

    iget-object v2, p0, Lcom/example/ui/BookViewModel$initiateReturn$2;->$updated:Lcom/example/data/Book;

    iget-object v3, p0, Lcom/example/ui/BookViewModel$initiateReturn$2;->$book:Lcom/example/data/Book;

    iget-object v4, p0, Lcom/example/ui/BookViewModel$initiateReturn$2;->$aiCondition:Ljava/lang/String;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/example/ui/BookViewModel$initiateReturn$2;-><init>(Lcom/example/ui/BookViewModel;Lcom/example/data/Book;Lcom/example/data/Book;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/BookViewModel$initiateReturn$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/BookViewModel$initiateReturn$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p0

    check-cast p0, Lcom/example/ui/BookViewModel$initiateReturn$2;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lcom/example/ui/BookViewModel$initiateReturn$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 782
    iget v1, p0, Lcom/example/ui/BookViewModel$initiateReturn$2;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 783
    iget-object p1, p0, Lcom/example/ui/BookViewModel$initiateReturn$2;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {p1}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object p1

    iget-object v1, p0, Lcom/example/ui/BookViewModel$initiateReturn$2;->$updated:Lcom/example/data/Book;

    move-object v3, p0

    check-cast v3, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lcom/example/ui/BookViewModel$initiateReturn$2;->label:I

    invoke-virtual {p1, v1, v3}, Lcom/example/data/BookRepository;->updateBook(Lcom/example/data/Book;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    .line 784
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/example/ui/BookViewModel$initiateReturn$2;->this$0:Lcom/example/ui/BookViewModel;

    .line 785
    iget-object v0, p0, Lcom/example/ui/BookViewModel$initiateReturn$2;->$book:Lcom/example/data/Book;

    invoke-virtual {v0}, Lcom/example/data/Book;->getId()Ljava/lang/String;

    move-result-object v0

    .line 786
    iget-object v1, p0, Lcom/example/ui/BookViewModel$initiateReturn$2;->$book:Lcom/example/data/Book;

    invoke-virtual {v1}, Lcom/example/data/Book;->getOwnerName()Ljava/lang/String;

    move-result-object v1

    .line 787
    iget-object v2, p0, Lcom/example/ui/BookViewModel$initiateReturn$2;->$book:Lcom/example/data/Book;

    invoke-virtual {v2}, Lcom/example/data/Book;->getTitle()Ljava/lang/String;

    move-result-object v2

    iget-object p0, p0, Lcom/example/ui/BookViewModel$initiateReturn$2;->$aiCondition:Ljava/lang/String;

    if-nez p0, :cond_3

    const-string p0, "Verified"

    :cond_3
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Borrower took a return photo of \'"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\'! AI Condition: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string v2, ". Borrower will now show their Return QR."

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 784
    invoke-virtual {p1, v0, v1, p0}, Lcom/example/ui/BookViewModel;->sendMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 789
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method
