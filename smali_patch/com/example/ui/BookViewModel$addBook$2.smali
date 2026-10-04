.class final Lcom/example/ui/BookViewModel$addBook$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "BookViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/BookViewModel;->addBook(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;)V
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
    c = "com.example.ui.BookViewModel$addBook$2"
    f = "BookViewModel.kt"
    i = {
        0x0,
        0x1,
        0x2,
        0x3,
        0x3
    }
    l = {
        0x213,
        0x219,
        0x21d,
        0x21f
    }
    m = "invokeSuspend"
    n = {
        "auth",
        "auth",
        "auth",
        "auth",
        "existingUser"
    }
    s = {
        "L$0",
        "L$0",
        "L$0",
        "L$0",
        "L$1"
    }
.end annotation


# instance fields
.field final synthetic $book:Lcom/example/data/Book;

.field final synthetic $mobileNumber:Ljava/lang/String;

.field final synthetic $user:Ljava/lang/String;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/example/ui/BookViewModel;


# direct methods
.method constructor <init>(Lcom/example/ui/BookViewModel;Lcom/example/data/Book;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/ui/BookViewModel;",
            "Lcom/example/data/Book;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/ui/BookViewModel$addBook$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/BookViewModel$addBook$2;->this$0:Lcom/example/ui/BookViewModel;

    iput-object p2, p0, Lcom/example/ui/BookViewModel$addBook$2;->$book:Lcom/example/data/Book;

    iput-object p3, p0, Lcom/example/ui/BookViewModel$addBook$2;->$mobileNumber:Ljava/lang/String;

    iput-object p4, p0, Lcom/example/ui/BookViewModel$addBook$2;->$user:Ljava/lang/String;

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

    new-instance v0, Lcom/example/ui/BookViewModel$addBook$2;

    iget-object v1, p0, Lcom/example/ui/BookViewModel$addBook$2;->this$0:Lcom/example/ui/BookViewModel;

    iget-object v2, p0, Lcom/example/ui/BookViewModel$addBook$2;->$book:Lcom/example/data/Book;

    iget-object v3, p0, Lcom/example/ui/BookViewModel$addBook$2;->$mobileNumber:Ljava/lang/String;

    iget-object v4, p0, Lcom/example/ui/BookViewModel$addBook$2;->$user:Ljava/lang/String;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/example/ui/BookViewModel$addBook$2;-><init>(Lcom/example/ui/BookViewModel;Lcom/example/data/Book;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/BookViewModel$addBook$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/BookViewModel$addBook$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p0

    check-cast p0, Lcom/example/ui/BookViewModel$addBook$2;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lcom/example/ui/BookViewModel$addBook$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v1, p0

    const-string v2, "Anonymous auth fallback: "

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 525
    iget v0, v1, Lcom/example/ui/BookViewModel$addBook$2;->label:I

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x1

    const/4 v7, 0x2

    if-eqz v0, :cond_4

    if-eq v0, v6, :cond_3

    if-eq v0, v7, :cond_2

    if-eq v0, v5, :cond_1

    if-ne v0, v4, :cond_0

    iget-object v0, v1, Lcom/example/ui/BookViewModel$addBook$2;->L$1:Ljava/lang/Object;

    check-cast v0, Lcom/example/data/User;

    iget-object v0, v1, Lcom/example/ui/BookViewModel$addBook$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/google/firebase/auth/FirebaseAuth;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    goto/16 :goto_7

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, v1, Lcom/example/ui/BookViewModel$addBook$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/google/firebase/auth/FirebaseAuth;

    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    move-object/from16 v2, p1

    goto/16 :goto_4

    :cond_2
    iget-object v0, v1, Lcom/example/ui/BookViewModel$addBook$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/google/firebase/auth/FirebaseAuth;

    :try_start_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto/16 :goto_3

    :cond_3
    iget-object v0, v1, Lcom/example/ui/BookViewModel$addBook$2;->L$0:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lcom/google/firebase/auth/FirebaseAuth;

    :try_start_3
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_4
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 528
    :try_start_4
    invoke-static {}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance()Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v8

    const-string v0, "getInstance(...)"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 529
    invoke-virtual {v8}, Lcom/google/firebase/auth/FirebaseAuth;->getCurrentUser()Lcom/google/firebase/auth/FirebaseUser;

    move-result-object v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    if-nez v0, :cond_6

    .line 531
    :try_start_5
    invoke-virtual {v8}, Lcom/google/firebase/auth/FirebaseAuth;->signInAnonymously()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    const-string v9, "signInAnonymously(...)"

    invoke-static {v0, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v9, v1

    check-cast v9, Lkotlin/coroutines/Continuation;

    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v1, Lcom/example/ui/BookViewModel$addBook$2;->L$0:Ljava/lang/Object;

    iput v6, v1, Lcom/example/ui/BookViewModel$addBook$2;->label:I

    invoke-static {v0, v9}, Lkotlinx/coroutines/tasks/TasksKt;->await(Lcom/google/android/gms/tasks/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    if-ne v0, v3, :cond_5

    goto/16 :goto_5

    :cond_5
    move-object v6, v8

    :goto_0
    move-object v8, v6

    goto :goto_2

    :catch_1
    move-exception v0

    move-object v6, v8

    .line 533
    :goto_1
    :try_start_6
    const-string v8, "BookViewModel"

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    goto :goto_0

    .line 537
    :cond_6
    :goto_2
    iget-object v0, v1, Lcom/example/ui/BookViewModel$addBook$2;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v0}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v0

    iget-object v2, v1, Lcom/example/ui/BookViewModel$addBook$2;->$book:Lcom/example/data/Book;

    move-object v6, v1

    check-cast v6, Lkotlin/coroutines/Continuation;

    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v1, Lcom/example/ui/BookViewModel$addBook$2;->L$0:Ljava/lang/Object;

    iput v7, v1, Lcom/example/ui/BookViewModel$addBook$2;->label:I

    invoke-virtual {v0, v2, v6}, Lcom/example/data/BookRepository;->insertBook(Lcom/example/data/Book;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_7

    goto :goto_5

    :cond_7
    move-object v0, v8

    .line 540
    :goto_3
    iget-object v2, v1, Lcom/example/ui/BookViewModel$addBook$2;->$mobileNumber:Ljava/lang/String;

    check-cast v2, Ljava/lang/CharSequence;

    if-eqz v2, :cond_c

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_8

    goto/16 :goto_7

    .line 541
    :cond_8
    iget-object v2, v1, Lcom/example/ui/BookViewModel$addBook$2;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v2}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v2

    iget-object v6, v1, Lcom/example/ui/BookViewModel$addBook$2;->$user:Ljava/lang/String;

    invoke-virtual {v2, v6}, Lcom/example/data/BookRepository;->getUser(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v2

    move-object v6, v1

    check-cast v6, Lkotlin/coroutines/Continuation;

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v1, Lcom/example/ui/BookViewModel$addBook$2;->L$0:Ljava/lang/Object;

    iput v5, v1, Lcom/example/ui/BookViewModel$addBook$2;->label:I

    invoke-static {v2, v6}, Lkotlinx/coroutines/flow/FlowKt;->firstOrNull(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_9

    goto :goto_5

    .line 525
    :cond_9
    :goto_4
    move-object v8, v2

    check-cast v8, Lcom/example/data/User;

    if-eqz v8, :cond_c

    .line 543
    iget-object v2, v1, Lcom/example/ui/BookViewModel$addBook$2;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v2}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v2

    iget-object v5, v1, Lcom/example/ui/BookViewModel$addBook$2;->$mobileNumber:Ljava/lang/String;

    check-cast v5, Ljava/lang/CharSequence;

    invoke-static {v5}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v14

    const/16 v21, 0x7df

    const/16 v22, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    invoke-static/range {v8 .. v22}, Lcom/example/data/User;->copy$default(Lcom/example/data/User;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;IIDILjava/lang/Object;)Lcom/example/data/User;

    move-result-object v5

    move-object v6, v1

    check-cast v6, Lkotlin/coroutines/Continuation;

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v1, Lcom/example/ui/BookViewModel$addBook$2;->L$0:Ljava/lang/Object;

    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v1, Lcom/example/ui/BookViewModel$addBook$2;->L$1:Ljava/lang/Object;

    iput v4, v1, Lcom/example/ui/BookViewModel$addBook$2;->label:I

    invoke-virtual {v2, v5, v6}, Lcom/example/data/BookRepository;->updateUser(Lcom/example/data/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    if-ne v0, v3, :cond_c

    :goto_5
    return-object v3

    :catch_2
    move-exception v0

    .line 547
    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_a

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    .line 548
    :cond_a
    iget-object v1, v1, Lcom/example/ui/BookViewModel$addBook$2;->this$0:Lcom/example/ui/BookViewModel;

    invoke-virtual {v1}, Lcom/example/ui/BookViewModel;->getInsertError()Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v1

    move-object v3, v2

    check-cast v3, Ljava/lang/CharSequence;

    const-string v4, "PERMISSION_DENIED"

    check-cast v4, Ljava/lang/CharSequence;

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v7, v6}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    .line 549
    const-string v2, "Database permission denied. Please update Firebase Firestore security rules to allow read/write."

    goto :goto_6

    .line 551
    :cond_b
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Database error: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 548
    :goto_6
    invoke-interface {v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 553
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 555
    :cond_c
    :goto_7
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method
