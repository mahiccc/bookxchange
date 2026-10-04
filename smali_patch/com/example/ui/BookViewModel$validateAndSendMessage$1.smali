.class final Lcom/example/ui/BookViewModel$validateAndSendMessage$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "BookViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/BookViewModel;->validateAndSendMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V
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

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBookViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BookViewModel.kt\ncom/example/ui/BookViewModel$validateAndSendMessage$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1363:1\n1761#2,3:1364\n1761#2,3:1367\n774#2:1370\n865#2,2:1371\n774#2:1373\n865#2,2:1374\n*S KotlinDebug\n*F\n+ 1 BookViewModel.kt\ncom/example/ui/BookViewModel$validateAndSendMessage$1\n*L\n1189#1:1364,3\n1236#1:1367,3\n1243#1:1370\n1243#1:1371,2\n1262#1:1373\n1262#1:1374,2\n*E\n"
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
    c = "com.example.ui.BookViewModel$validateAndSendMessage$1"
    f = "BookViewModel.kt"
    i = {
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x4,
        0x4,
        0x4,
        0x4,
        0x5,
        0x5,
        0x5,
        0x5,
        0x5
    }
    l = {
        0x49d,
        0x4a8,
        0x4c1,
        0x4e4,
        0x4e7,
        0x4f7
    }
    m = "invokeSuspend"
    n = {
        "targetReceiver",
        "apiKey",
        "targetReceiver",
        "apiKey",
        "book",
        "overdueNote",
        "prompt",
        "req",
        "targetReceiver",
        "apiKey",
        "reason",
        "normalizedSender",
        "normalizedReceiver",
        "participants",
        "message",
        "isSafe",
        "targetReceiver",
        "apiKey",
        "reason",
        "isSafe",
        "t",
        "normalizedSender",
        "normalizedReceiver",
        "participants",
        "fallbackMsg"
    }
    s = {
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5",
        "L$6",
        "Z$0",
        "L$0",
        "L$1",
        "L$2",
        "Z$0",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4"
    }
.end annotation


# instance fields
.field final synthetic $bookId:Ljava/lang/String;

.field final synthetic $content:Ljava/lang/String;

.field final synthetic $onResult:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $receiver:Ljava/lang/String;

.field final synthetic $sender:Ljava/lang/String;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field Z$0:Z

.field label:I

.field final synthetic this$0:Lcom/example/ui/BookViewModel;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/example/ui/BookViewModel;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/example/ui/BookViewModel;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Boolean;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/ui/BookViewModel$validateAndSendMessage$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->$receiver:Ljava/lang/String;

    iput-object p2, p0, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->$bookId:Ljava/lang/String;

    iput-object p3, p0, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->this$0:Lcom/example/ui/BookViewModel;

    iput-object p4, p0, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->$sender:Ljava/lang/String;

    iput-object p5, p0, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->$content:Ljava/lang/String;

    iput-object p6, p0, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->$onResult:Lkotlin/jvm/functions/Function2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 8
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

    new-instance v0, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;

    iget-object v1, p0, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->$receiver:Ljava/lang/String;

    iget-object v2, p0, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->$bookId:Ljava/lang/String;

    iget-object v3, p0, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->this$0:Lcom/example/ui/BookViewModel;

    iget-object v4, p0, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->$sender:Ljava/lang/String;

    iget-object v5, p0, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->$content:Ljava/lang/String;

    iget-object v6, p0, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->$onResult:Lkotlin/jvm/functions/Function2;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/example/ui/BookViewModel;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p0

    check-cast p0, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 48

    move-object/from16 v1, p0

    const-string v0, "```json"

    const-string v2, "\n                            You are an automated community safety moderator for a peer-to-peer book-sharing app.\n                            Analyze the following chat message between a book owner and a borrower:\n                            \n                            Message: \""

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 1178
    iget v4, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->label:I

    const-string v5, "fuck"

    const-string v6, "cvv"

    const-string v7, "password"

    const-string v8, "otp"

    const-string v9, "credit card"

    const-string v10, "bank account"

    const-string v11, "scam"

    const/16 v16, 0xa

    const/16 v17, 0x5

    const-string v18, ""

    const/16 v19, 0x6

    const-string v14, "toLowerCase(...)"

    const/16 v20, 0x4

    const-string v15, "OK"

    const/16 v21, 0xb

    const/16 v22, 0x3

    const/16 v23, 0x2

    const/4 v12, 0x1

    const/16 v24, 0x0

    packed-switch v4, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$4:Ljava/lang/Object;

    check-cast v0, Lcom/example/data/Message;

    iget-object v0, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$3:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v0, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$2:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$1:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_1b

    :pswitch_1
    iget-object v0, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$2:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v2, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$1:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v2, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$0:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_17

    :pswitch_2
    iget-object v0, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$6:Ljava/lang/Object;

    check-cast v0, Lcom/example/data/Message;

    iget-object v0, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$5:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v0, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$4:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$3:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$2:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$1:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_16

    :pswitch_3
    iget-object v2, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$5:Ljava/lang/Object;

    check-cast v2, Lcom/example/api/GenerateContentRequest;

    iget-object v2, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$4:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v2, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$3:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v2, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$2:Ljava/lang/Object;

    check-cast v2, Lcom/example/data/Book;

    iget-object v2, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$1:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v4, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$0:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    :try_start_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object/from16 v30, v2

    move-object/from16 v27, v5

    move-object/from16 v28, v6

    move/from16 v25, v12

    move-object/from16 v2, p1

    goto/16 :goto_b

    :catch_0
    move-exception v0

    move-object/from16 v27, v5

    move-object/from16 v28, v6

    goto/16 :goto_11

    :pswitch_4
    iget-object v4, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$1:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v13, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$0:Ljava/lang/Object;

    check-cast v13, Ljava/lang/String;

    :try_start_3
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-object/from16 v27, v5

    move-object/from16 v28, v6

    move/from16 v25, v12

    move-object/from16 v5, p1

    goto/16 :goto_8

    :catch_1
    move-exception v0

    move-object v2, v4

    move-object/from16 v27, v5

    move-object/from16 v28, v6

    :goto_0
    move-object v4, v13

    goto/16 :goto_11

    :pswitch_5
    :try_start_4
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-object/from16 v4, p1

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_18

    :pswitch_6
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 1180
    :try_start_5
    iget-object v4, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->$receiver:Ljava/lang/String;

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_0

    iget-object v4, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->$receiver:Ljava/lang/String;

    move/from16 v25, v12

    goto :goto_5

    .line 1181
    :cond_0
    iget-object v4, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->$bookId:Ljava/lang/String;

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_2

    iget-object v4, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v4}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v4

    iget-object v13, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->$bookId:Ljava/lang/String;

    invoke-virtual {v4, v13}, Lcom/example/data/BookRepository;->getBookById(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v4

    move-object v13, v1

    check-cast v13, Lkotlin/coroutines/Continuation;

    iput v12, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->label:I

    invoke-static {v4, v13}, Lkotlinx/coroutines/flow/FlowKt;->firstOrNull(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_1

    goto/16 :goto_1a

    :cond_1
    :goto_1
    check-cast v4, Lcom/example/data/Book;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    :goto_2
    if-eqz v4, :cond_3

    .line 1182
    :try_start_6
    invoke-virtual {v4}, Lcom/example/data/Book;->getOwnerName()Ljava/lang/String;

    move-result-object v13
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    move/from16 v25, v12

    :try_start_7
    iget-object v12, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->$sender:Ljava/lang/String;

    invoke-static {v13, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_4

    invoke-virtual {v4}, Lcom/example/data/Book;->getOwnerName()Ljava/lang/String;

    move-result-object v4

    goto :goto_5

    :catchall_1
    move-exception v0

    move/from16 v25, v12

    goto/16 :goto_18

    :cond_3
    move/from16 v25, v12

    :cond_4
    if-eqz v4, :cond_6

    invoke-virtual {v4}, Lcom/example/data/Book;->getRequestedByName()Ljava/lang/String;

    move-result-object v12

    if-nez v12, :cond_5

    goto :goto_3

    :cond_5
    move-object v4, v12

    goto :goto_5

    :cond_6
    :goto_3
    if-eqz v4, :cond_7

    invoke-virtual {v4}, Lcom/example/data/Book;->getBorrowerName()Ljava/lang/String;

    move-result-object v4

    goto :goto_4

    :cond_7
    const/4 v4, 0x0

    :goto_4
    if-nez v4, :cond_8

    move-object/from16 v4, v18

    .line 1185
    :cond_8
    :goto_5
    invoke-static {}, Lcom/example/security/SecureKeyProvider;->getGeminiApiKey()Ljava/lang/String;

    move-result-object v12
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 1187
    :try_start_8
    move-object v13, v12

    check-cast v13, Ljava/lang/CharSequence;

    invoke-static {v13}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v13

    if-eqz v13, :cond_c

    const/16 v0, 0xc

    .line 1188
    new-array v0, v0, [Ljava/lang/String;

    aput-object v11, v0, v24

    aput-object v10, v0, v25

    aput-object v9, v0, v23

    aput-object v8, v0, v22

    aput-object v7, v0, v20

    aput-object v6, v0, v17

    aput-object v5, v0, v19

    const-string v2, "bitch"

    const/4 v13, 0x7

    aput-object v2, v0, v13

    const-string v2, "bastard"

    const/16 v13, 0x8

    aput-object v2, v0, v13

    const-string v2, "die"

    const/16 v13, 0x9

    aput-object v2, v0, v13

    const-string v2, "kill"

    aput-object v2, v0, v16

    const-string v2, "threat"

    aput-object v2, v0, v21

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 1189
    check-cast v0, Ljava/lang/Iterable;

    iget-object v2, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->$content:Ljava/lang/String;

    .line 1364
    instance-of v13, v0, Ljava/util/Collection;

    if-eqz v13, :cond_a

    move-object v13, v0

    check-cast v13, Ljava/util/Collection;

    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    move-result v13

    if-eqz v13, :cond_a

    :cond_9
    move-object/from16 v27, v5

    move-object/from16 v28, v6

    goto :goto_7

    .line 1365
    :cond_a
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    move-object/from16 p1, v0

    .line 1189
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/CharSequence;

    check-cast v13, Ljava/lang/CharSequence;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_5
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    move-object/from16 v26, v2

    move-object/from16 v27, v5

    move-object/from16 v28, v6

    move/from16 v2, v23

    move/from16 v5, v24

    const/4 v6, 0x0

    :try_start_9
    invoke-static {v0, v13, v5, v2, v6}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 1190
    new-instance v0, Lkotlin/Pair;

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v2

    const-string v5, "Message contains sensitive or offensive terms."

    invoke-direct {v0, v2, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_14

    :cond_b
    move-object/from16 v0, p1

    move/from16 v24, v5

    move-object/from16 v2, v26

    move-object/from16 v5, v27

    move-object/from16 v6, v28

    const/16 v23, 0x2

    goto :goto_6

    :goto_7
    new-instance v0, Lkotlin/Pair;

    invoke-static/range {v25 .. v25}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-direct {v0, v2, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_14

    :cond_c
    move-object/from16 v27, v5

    move-object/from16 v28, v6

    .line 1192
    iget-object v5, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->$bookId:Ljava/lang/String;

    check-cast v5, Ljava/lang/CharSequence;

    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-lez v5, :cond_e

    iget-object v5, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v5}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v5

    iget-object v6, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->$bookId:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lcom/example/data/BookRepository;->getBookById(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v5

    move-object v6, v1

    check-cast v6, Lkotlin/coroutines/Continuation;

    iput-object v4, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$0:Ljava/lang/Object;

    iput-object v12, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$1:Ljava/lang/Object;

    const/4 v13, 0x2

    iput v13, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->label:I

    invoke-static {v5, v6}, Lkotlinx/coroutines/flow/FlowKt;->firstOrNull(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v5
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_4
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    if-ne v5, v3, :cond_d

    goto/16 :goto_1a

    :cond_d
    move-object v13, v4

    move-object v4, v12

    :goto_8
    :try_start_a
    check-cast v5, Lcom/example/data/Book;
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_2
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    move-object/from16 v30, v4

    move-object v4, v13

    goto :goto_9

    :catch_2
    move-exception v0

    move-object v2, v4

    goto/16 :goto_0

    :cond_e
    move-object/from16 v30, v12

    const/4 v5, 0x0

    :goto_9
    if-eqz v5, :cond_f

    .line 1194
    :try_start_b
    invoke-virtual {v5}, Lcom/example/data/Book;->getStatus()Ljava/lang/String;

    move-result-object v6

    const-string v12, "BORROWED"

    invoke-static {v6, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_f

    .line 1195
    const-string v6, "If you detect they have been borrowing it for a long time (e.g. they mention it\'s been weeks), HIGHLY suggest that the lender say: \'It\'s been 20+ days, please return back the book.\'"

    goto :goto_a

    :cond_f
    move-object/from16 v6, v18

    .line 1202
    :goto_a
    iget-object v12, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->$content:Ljava/lang/String;

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v12, "\"\n                            \n                            Rules:\n                            1. INAPPROPRIATE / PROHIBITED if: harassment, profanity/vulgarity, threats, insults, hate speech, asking for bank account/credit card/passwords/OTP, financial fraud/scams, sexual content, spam.\n                            2. APPROPRIATE if: friendly chat, discussing book condition, arranging pickup/meetup, sharing address or phone number for meetup, polite greetings.\n                            \n                            Respond in strict JSON with keys:\n                            \"isAppropriate\": boolean,\n                            \"reason\": \"concise explanation if inappropriate, or OK\"\n                        "

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 1211
    invoke-static {v2}, Lkotlin/text/StringsKt;->trimIndent(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1213
    new-instance v31, Lcom/example/api/GenerateContentRequest;

    .line 1214
    new-instance v12, Lcom/example/api/Content;

    new-instance v13, Lcom/example/api/Part;

    move-object/from16 p1, v5

    move-object/from16 v26, v6

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-direct {v13, v2, v6, v5, v6}, Lcom/example/api/Part;-><init>(Ljava/lang/String;Lcom/example/api/InlineData;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v13}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-direct {v12, v5}, Lcom/example/api/Content;-><init>(Ljava/util/List;)V

    invoke-static {v12}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v32

    .line 1215
    new-instance v33, Lcom/example/api/GenerationConfig;

    const-string v35, "application/json"

    const v5, 0x3dcccccd    # 0.1f

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/Boxing;->boxFloat(F)Ljava/lang/Float;

    move-result-object v36

    const/16 v40, 0x39

    const/16 v41, 0x0

    const/16 v34, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    invoke-direct/range {v33 .. v41}, Lcom/example/api/GenerationConfig;-><init>(Lcom/example/api/ResponseFormat;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v36, 0xc

    const/16 v37, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    .line 1213
    invoke-direct/range {v31 .. v37}, Lcom/example/api/GenerateContentRequest;-><init>(Ljava/util/List;Lcom/example/api/GenerationConfig;Ljava/util/List;Lcom/example/api/Content;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1217
    sget-object v29, Lcom/example/api/RetrofitClient;->INSTANCE:Lcom/example/api/RetrofitClient;

    move-object/from16 v33, v1

    check-cast v33, Lkotlin/coroutines/Continuation;

    iput-object v4, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$0:Ljava/lang/Object;

    invoke-static/range {v30 .. v30}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$1:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$2:Ljava/lang/Object;

    invoke-static/range {v26 .. v26}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$3:Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$4:Ljava/lang/Object;

    invoke-static/range {v31 .. v31}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$5:Ljava/lang/Object;

    move/from16 v2, v22

    iput v2, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->label:I

    const/16 v32, 0x0

    const/16 v34, 0x4

    const/16 v35, 0x0

    invoke-static/range {v29 .. v35}, Lcom/example/api/RetrofitClient;->generateWithResilientModelChain$default(Lcom/example/api/RetrofitClient;Ljava/lang/String;Lcom/example/api/GenerateContentRequest;Ljava/util/List;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_10

    goto/16 :goto_1a

    .line 1178
    :cond_10
    :goto_b
    check-cast v2, Lcom/example/api/GenerateContentResponse;

    .line 1218
    invoke-virtual {v2}, Lcom/example/api/GenerateContentResponse;->getCandidates()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/example/api/Candidate;

    if-eqz v2, :cond_11

    invoke-virtual {v2}, Lcom/example/api/Candidate;->getContent()Lcom/example/api/Content;

    move-result-object v2

    if-eqz v2, :cond_11

    invoke-virtual {v2}, Lcom/example/api/Content;->getParts()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_11

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/example/api/Part;

    if-eqz v2, :cond_11

    invoke-virtual {v2}, Lcom/example/api/Part;->getText()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_11

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_3
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    goto :goto_c

    :cond_11
    const/4 v2, 0x0

    .line 1219
    :goto_c
    const-string v5, "```"

    if-eqz v2, :cond_12

    const/4 v6, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x2

    :try_start_c
    invoke-static {v2, v0, v6, v13, v12}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_12

    .line 1220
    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v2, v0}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    check-cast v5, Ljava/lang/CharSequence;

    invoke-static {v0, v5}, Lkotlin/text/StringsKt;->removeSuffix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_d

    :cond_12
    if-eqz v2, :cond_13

    const/4 v6, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x2

    .line 1221
    invoke-static {v2, v5, v6, v13, v12}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 1222
    move-object v0, v5

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v2, v0}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    check-cast v5, Ljava/lang/CharSequence;

    invoke-static {v0, v5}, Lkotlin/text/StringsKt;->removeSuffix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_13
    :goto_d
    if-eqz v2, :cond_15

    .line 1225
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1226
    const-string v2, "isAppropriate"

    move/from16 v5, v25

    invoke-virtual {v0, v2, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v2

    .line 1227
    const-string v5, "reason"

    if-eqz v2, :cond_14

    move-object v6, v15

    goto :goto_e

    :cond_14
    const-string v6, "Inappropriate language or behavior detected."

    :goto_e
    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1228
    new-instance v5, Lkotlin/Pair;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-direct {v5, v2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v0, v5

    goto :goto_f

    .line 1230
    :cond_15
    new-instance v0, Lkotlin/Pair;

    const/16 v25, 0x1

    invoke-static/range {v25 .. v25}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-direct {v0, v2, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_3
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    :goto_f
    move-object/from16 v12, v30

    goto/16 :goto_14

    :catch_3
    move-exception v0

    move-object/from16 v2, v30

    goto :goto_11

    :catch_4
    move-exception v0

    goto :goto_10

    :catch_5
    move-exception v0

    move-object/from16 v27, v5

    move-object/from16 v28, v6

    :goto_10
    move-object v2, v12

    .line 1234
    :goto_11
    :try_start_d
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    move/from16 v5, v21

    .line 1235
    new-array v0, v5, [Ljava/lang/String;

    const/16 v24, 0x0

    aput-object v11, v0, v24

    const/16 v25, 0x1

    aput-object v10, v0, v25

    const/16 v23, 0x2

    aput-object v9, v0, v23

    const/16 v22, 0x3

    aput-object v8, v0, v22

    aput-object v7, v0, v20

    aput-object v28, v0, v17

    aput-object v27, v0, v19

    const-string v5, "bitch"

    const/4 v6, 0x7

    aput-object v5, v0, v6

    const-string v5, "bastard"

    const/16 v6, 0x8

    aput-object v5, v0, v6

    const-string v5, "die"

    const/16 v6, 0x9

    aput-object v5, v0, v6

    const-string v5, "kill"

    aput-object v5, v0, v16

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 1236
    check-cast v0, Ljava/lang/Iterable;

    iget-object v5, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->$content:Ljava/lang/String;

    .line 1367
    instance-of v6, v0, Ljava/util/Collection;

    if-eqz v6, :cond_16

    move-object v6, v0

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_16

    goto :goto_12

    .line 1368
    :cond_16
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_18

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 1236
    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v5, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Ljava/lang/CharSequence;

    check-cast v6, Ljava/lang/CharSequence;

    const/4 v8, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x2

    invoke-static {v7, v6, v8, v13, v12}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_17

    .line 1237
    new-instance v0, Lkotlin/Pair;

    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v5

    const-string v6, "Prohibited language or sensitive information detected."

    invoke-direct {v0, v5, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_13

    :cond_18
    :goto_12
    new-instance v0, Lkotlin/Pair;

    const/16 v25, 0x1

    invoke-static/range {v25 .. v25}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-direct {v0, v5, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_13
    move-object v12, v2

    .line 1186
    :goto_14
    invoke-virtual {v0}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {v0}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v2, :cond_1c

    .line 1241
    iget-object v5, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->$sender:Ljava/lang/String;

    check-cast v5, Ljava/lang/CharSequence;

    invoke-static {v5}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v5, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1242
    move-object v6, v4

    check-cast v6, Ljava/lang/CharSequence;

    invoke-static {v6}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v13, 0x2

    .line 1243
    new-array v7, v13, [Ljava/lang/String;

    const/16 v24, 0x0

    aput-object v5, v7, v24

    const/16 v25, 0x1

    aput-object v6, v7, v25

    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    .line 1370
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    check-cast v8, Ljava/util/Collection;

    .line 1371
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_19
    :goto_15
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1a

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Ljava/lang/String;

    .line 1243
    check-cast v10, Ljava/lang/CharSequence;

    invoke-static {v10}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_19

    .line 1371
    invoke-interface {v8, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_15

    .line 1372
    :cond_1a
    check-cast v8, Ljava/util/List;

    .line 1370
    check-cast v8, Ljava/lang/Iterable;

    .line 1243
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->distinct(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v31

    .line 1244
    new-instance v26, Lcom/example/data/Message;

    .line 1245
    iget-object v7, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->$bookId:Ljava/lang/String;

    .line 1249
    iget-object v8, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->$content:Ljava/lang/String;

    check-cast v8, Ljava/lang/CharSequence;

    invoke-static {v8}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v32

    .line 1250
    const-string v35, "SENT"

    const v46, 0x3ff41

    const/16 v47, 0x0

    const/16 v27, 0x0

    const-wide/16 v33, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    move-object/from16 v29, v5

    move-object/from16 v30, v6

    move-object/from16 v28, v7

    .line 1244
    invoke-direct/range {v26 .. v47}, Lcom/example/data/Message;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v5, v26

    .line 1252
    iget-object v6, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v6}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v6

    move-object v7, v1

    check-cast v7, Lkotlin/coroutines/Continuation;

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$0:Ljava/lang/Object;

    invoke-static {v12}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$1:Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$2:Ljava/lang/Object;

    invoke-static/range {v29 .. v29}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$3:Ljava/lang/Object;

    invoke-static/range {v30 .. v30}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$4:Ljava/lang/Object;

    invoke-static/range {v31 .. v31}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$5:Ljava/lang/Object;

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$6:Ljava/lang/Object;

    iput-boolean v2, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->Z$0:Z

    move/from16 v2, v20

    iput v2, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->label:I

    invoke-virtual {v6, v5, v7}, Lcom/example/data/BookRepository;->insertMessage(Lcom/example/data/Message;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_1b

    goto/16 :goto_1a

    .line 1253
    :cond_1b
    :goto_16
    iget-object v0, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->$onResult:Lkotlin/jvm/functions/Function2;

    const/16 v25, 0x1

    invoke-static/range {v25 .. v25}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v2, v15}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_1c

    .line 1255
    :cond_1c
    iget-object v5, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->this$0:Lcom/example/ui/BookViewModel;

    iget-object v6, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->$sender:Ljava/lang/String;

    move-object v7, v1

    check-cast v7, Lkotlin/coroutines/Continuation;

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$0:Ljava/lang/Object;

    invoke-static {v12}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$1:Ljava/lang/Object;

    iput-object v0, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$2:Ljava/lang/Object;

    const/4 v12, 0x0

    iput-object v12, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$3:Ljava/lang/Object;

    iput-object v12, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$4:Ljava/lang/Object;

    iput-object v12, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$5:Ljava/lang/Object;

    iput-boolean v2, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->Z$0:Z

    move/from16 v2, v17

    iput v2, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->label:I

    move/from16 v2, v16

    invoke-virtual {v5, v6, v2, v7}, Lcom/example/ui/BookViewModel;->deductTrustScore(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_1d

    goto/16 :goto_1a

    .line 1256
    :cond_1d
    :goto_17
    iget-object v2, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->$onResult:Lkotlin/jvm/functions/Function2;

    const/16 v24, 0x0

    invoke-static/range {v24 .. v24}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-interface {v2, v4, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    goto/16 :goto_1c

    .line 1259
    :goto_18
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 1260
    iget-object v2, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->$sender:Ljava/lang/String;

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1261
    iget-object v4, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->$receiver:Ljava/lang/String;

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_1e

    iget-object v4, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->$receiver:Ljava/lang/String;

    move-object/from16 v18, v4

    :cond_1e
    check-cast v18, Ljava/lang/CharSequence;

    invoke-static/range {v18 .. v18}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v13, 0x2

    .line 1262
    new-array v5, v13, [Ljava/lang/String;

    const/16 v24, 0x0

    aput-object v2, v5, v24

    const/16 v25, 0x1

    aput-object v4, v5, v25

    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    .line 1373
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    check-cast v6, Ljava/util/Collection;

    .line 1374
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_1f
    :goto_19
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_20

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Ljava/lang/String;

    .line 1262
    check-cast v8, Ljava/lang/CharSequence;

    invoke-static {v8}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_1f

    .line 1374
    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_19

    .line 1375
    :cond_20
    check-cast v6, Ljava/util/List;

    .line 1373
    check-cast v6, Ljava/lang/Iterable;

    .line 1262
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->distinct(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v31

    .line 1263
    new-instance v26, Lcom/example/data/Message;

    .line 1264
    iget-object v5, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->$bookId:Ljava/lang/String;

    .line 1268
    iget-object v6, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->$content:Ljava/lang/String;

    check-cast v6, Ljava/lang/CharSequence;

    invoke-static {v6}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v32

    const v46, 0x3ff41

    const/16 v47, 0x0

    const/16 v27, 0x0

    const-wide/16 v33, 0x0

    .line 1263
    const-string v35, "SENT"

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    move-object/from16 v29, v2

    move-object/from16 v30, v4

    move-object/from16 v28, v5

    invoke-direct/range {v26 .. v47}, Lcom/example/data/Message;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v26

    .line 1271
    iget-object v4, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v4}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v4

    move-object v5, v1

    check-cast v5, Lkotlin/coroutines/Continuation;

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$0:Ljava/lang/Object;

    invoke-static/range {v29 .. v29}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$1:Ljava/lang/Object;

    invoke-static/range {v30 .. v30}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$2:Ljava/lang/Object;

    invoke-static/range {v31 .. v31}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$3:Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$4:Ljava/lang/Object;

    const/4 v12, 0x0

    iput-object v12, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$5:Ljava/lang/Object;

    iput-object v12, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->L$6:Ljava/lang/Object;

    move/from16 v6, v19

    iput v6, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->label:I

    invoke-virtual {v4, v2, v5}, Lcom/example/data/BookRepository;->insertMessage(Lcom/example/data/Message;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_21

    :goto_1a
    return-object v3

    .line 1272
    :cond_21
    :goto_1b
    iget-object v0, v1, Lcom/example/ui/BookViewModel$validateAndSendMessage$1;->$onResult:Lkotlin/jvm/functions/Function2;

    const/16 v25, 0x1

    invoke-static/range {v25 .. v25}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1, v15}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1274
    :goto_1c
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
