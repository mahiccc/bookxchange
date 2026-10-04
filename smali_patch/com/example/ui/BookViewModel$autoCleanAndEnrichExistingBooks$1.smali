.class final Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "BookViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/BookViewModel;->autoCleanAndEnrichExistingBooks()V
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
    value = "SMAP\nBookViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BookViewModel.kt\ncom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1363:1\n17#2:1364\n19#2:1368\n46#3:1365\n51#3:1367\n105#4:1366\n1#5:1369\n*S KotlinDebug\n*F\n+ 1 BookViewModel.kt\ncom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1\n*L\n103#1:1364\n103#1:1368\n103#1:1365\n103#1:1367\n103#1:1366\n*E\n"
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
    c = "com.example.ui.BookViewModel$autoCleanAndEnrichExistingBooks$1"
    f = "BookViewModel.kt"
    i = {
        0x1,
        0x1,
        0x1,
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
        0x3,
        0x3
    }
    l = {
        0x67,
        0x7f,
        0x84,
        0x97
    }
    m = "invokeSuspend"
    n = {
        "books",
        "googleBooksKey",
        "b",
        "cleanQuery",
        "needsCleaning",
        "books",
        "googleBooksKey",
        "b",
        "cleanQuery",
        "resp",
        "needsCleaning",
        "books",
        "googleBooksKey",
        "b",
        "cleanQuery",
        "resp",
        "vol",
        "newTitle",
        "newAuthor",
        "updated",
        "needsCleaning"
    }
    s = {
        "L$0",
        "L$1",
        "L$3",
        "L$4",
        "I$0",
        "L$0",
        "L$1",
        "L$3",
        "L$4",
        "L$5",
        "I$0",
        "L$0",
        "L$1",
        "L$3",
        "L$4",
        "L$5",
        "L$6",
        "L$7",
        "L$8",
        "L$9",
        "I$0"
    }
.end annotation


# instance fields
.field I$0:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field L$7:Ljava/lang/Object;

.field L$8:Ljava/lang/Object;

.field L$9:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/example/ui/BookViewModel;


# direct methods
.method constructor <init>(Lcom/example/ui/BookViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/ui/BookViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->this$0:Lcom/example/ui/BookViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 0
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

    new-instance p1, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;

    iget-object p0, p0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-direct {p1, p0, p2}, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;-><init>(Lcom/example/ui/BookViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p0

    check-cast p0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 67

    move-object/from16 v0, p0

    const-string v1, ""

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 100
    iget v3, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->label:I

    const-string v4, "Unknown"

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eqz v3, :cond_4

    if-eq v3, v9, :cond_3

    if-eq v3, v8, :cond_2

    if-eq v3, v6, :cond_1

    if-ne v3, v5, :cond_0

    iget-object v3, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$9:Ljava/lang/Object;

    check-cast v3, Lcom/example/data/Book;

    iget-object v3, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$8:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v3, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$7:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v3, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$6:Ljava/lang/Object;

    check-cast v3, Lcom/example/api/VolumeInfo;

    iget-object v3, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$5:Ljava/lang/Object;

    check-cast v3, Lcom/example/api/GoogleBooksResponse;

    iget-object v3, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$4:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v3, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$3:Ljava/lang/Object;

    check-cast v3, Lcom/example/data/Book;

    iget-object v3, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$2:Ljava/lang/Object;

    check-cast v3, Ljava/util/Iterator;

    iget-object v11, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$1:Ljava/lang/Object;

    check-cast v11, Ljava/lang/String;

    iget-object v12, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$0:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-object/from16 v66, v1

    move-object/from16 v16, v4

    goto/16 :goto_17

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget v3, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->I$0:I

    iget-object v11, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$5:Ljava/lang/Object;

    check-cast v11, Lcom/example/api/GoogleBooksResponse;

    iget-object v12, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$4:Ljava/lang/Object;

    check-cast v12, Ljava/lang/String;

    iget-object v13, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$3:Ljava/lang/Object;

    check-cast v13, Lcom/example/data/Book;

    iget-object v14, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$2:Ljava/lang/Object;

    check-cast v14, Ljava/util/Iterator;

    iget-object v15, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$1:Ljava/lang/Object;

    check-cast v15, Ljava/lang/String;

    iget-object v5, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$0:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_5

    move-object/from16 v9, p1

    goto/16 :goto_9

    :cond_2
    iget v3, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->I$0:I

    iget-object v5, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$4:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v11, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$3:Ljava/lang/Object;

    check-cast v11, Lcom/example/data/Book;

    iget-object v12, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$2:Ljava/lang/Object;

    check-cast v12, Ljava/util/Iterator;

    iget-object v13, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$1:Ljava/lang/Object;

    check-cast v13, Ljava/lang/String;

    iget-object v14, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$0:Ljava/lang/Object;

    check-cast v14, Ljava/util/List;

    :try_start_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-object/from16 v7, p1

    goto/16 :goto_4

    :cond_3
    :try_start_3
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_d

    move-object/from16 v3, p1

    goto :goto_0

    :cond_4
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 103
    :try_start_4
    iget-object v3, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-virtual {v3}, Lcom/example/ui/BookViewModel;->getAllBooks()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v3

    check-cast v3, Lkotlinx/coroutines/flow/Flow;

    .line 1366
    new-instance v5, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1$invokeSuspend$$inlined$filter$1;

    invoke-direct {v5, v3}, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1$invokeSuspend$$inlined$filter$1;-><init>(Lkotlinx/coroutines/flow/Flow;)V

    check-cast v5, Lkotlinx/coroutines/flow/Flow;

    .line 1368
    move-object v3, v0

    check-cast v3, Lkotlin/coroutines/Continuation;

    .line 103
    iput v9, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->label:I

    invoke-static {v5, v3}, Lkotlinx/coroutines/flow/FlowKt;->first(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_5

    goto/16 :goto_15

    .line 100
    :cond_5
    :goto_0
    check-cast v3, Ljava/util/List;

    .line 104
    invoke-static {}, Lcom/example/security/SecureKeyProvider;->getGoogleBooksApiKey()Ljava/lang/String;

    move-result-object v5

    .line 106
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    move-object v12, v3

    move-object v3, v11

    move-object v11, v5

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_28

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/example/data/Book;

    .line 107
    invoke-virtual {v5}, Lcom/example/data/Book;->getTitle()Ljava/lang/String;

    move-result-object v13

    check-cast v13, Ljava/lang/CharSequence;

    new-instance v14, Lkotlin/text/Regex;

    const-string v15, "(?i)\\b(bestseller|over\\s+[0-9]+|copies\\s+sold|a\\s+novel)\\b"

    invoke-direct {v14, v15}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v13}, Lkotlin/text/Regex;->containsMatchIn(Ljava/lang/CharSequence;)Z

    move-result v13
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_d

    const-string v14, " "

    if-nez v13, :cond_9

    .line 108
    :try_start_5
    invoke-virtual {v5}, Lcom/example/data/Book;->getTitle()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v13

    const/16 v15, 0x32

    if-le v13, v15, :cond_6

    invoke-virtual {v5}, Lcom/example/data/Book;->getTitle()Ljava/lang/String;

    move-result-object v13

    check-cast v13, Ljava/lang/CharSequence;

    move-object v15, v14

    check-cast v15, Ljava/lang/CharSequence;

    invoke-static {v13, v15, v7, v8, v10}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_9

    .line 109
    :cond_6
    invoke-virtual {v5}, Lcom/example/data/Book;->getDescription()Ljava/lang/String;

    move-result-object v13

    check-cast v13, Ljava/lang/CharSequence;

    if-eqz v13, :cond_9

    invoke-static {v13}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v13

    if-eqz v13, :cond_7

    goto :goto_2

    .line 110
    :cond_7
    invoke-virtual {v5}, Lcom/example/data/Book;->getAuthor()Ljava/lang/String;

    move-result-object v13

    check-cast v13, Ljava/lang/CharSequence;

    invoke-static {v13}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v13

    if-nez v13, :cond_9

    .line 111
    invoke-virtual {v5}, Lcom/example/data/Book;->getAuthor()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v4, v9}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v13

    if-nez v13, :cond_9

    .line 112
    invoke-virtual {v5}, Lcom/example/data/Book;->getPageCount()Ljava/lang/Integer;

    move-result-object v13

    if-nez v13, :cond_8

    goto :goto_2

    :cond_8
    move v13, v7

    goto :goto_3

    :cond_9
    :goto_2
    move v13, v9

    :goto_3
    if-eqz v13, :cond_27

    .line 115
    invoke-virtual {v5}, Lcom/example/data/Book;->getTitle()Ljava/lang/String;

    move-result-object v15

    check-cast v15, Ljava/lang/CharSequence;

    .line 116
    new-instance v7, Lkotlin/text/Regex;

    const-string v6, "(?i)\\b(the\\s+international\\s+bestseller|international\\s+bestseller|national\\s+bestseller|new\\s+york\\s+times\\s+bestseller|bestseller|over\\s+[0-9]+(?:\\s+million)?\\s+copies\\s+sold|a\\s+novel(?:\\s+by)?|a\\s+memoir)\\b"

    invoke-direct {v7, v6}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v15, v1}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    check-cast v6, Ljava/lang/CharSequence;

    .line 117
    new-instance v7, Lkotlin/text/Regex;

    const-string v15, "(?i)\\b(paperback|hardcover|special\\s+edition|anniversary\\s+edition|vol\\.?|volume|part)\\b.*"

    invoke-direct {v7, v15}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v6, v1}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    check-cast v6, Ljava/lang/CharSequence;

    .line 118
    new-instance v7, Lkotlin/text/Regex;

    const-string v15, "[#*~\"\'()]"

    invoke-direct {v7, v15}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v6, v14}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 119
    check-cast v6, Ljava/lang/CharSequence;

    invoke-static {v6}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    check-cast v6, Ljava/lang/CharSequence;

    .line 120
    new-instance v7, Lkotlin/text/Regex;

    const-string v15, "\\s+"

    invoke-direct {v7, v15}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v6, v14}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 122
    move-object v7, v6

    check-cast v7, Ljava/lang/CharSequence;

    invoke-static {v7}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v7
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_d

    if-nez v7, :cond_27

    .line 125
    :try_start_6
    move-object v7, v11

    check-cast v7, Ljava/lang/CharSequence;

    invoke-static {v7}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v7
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_c

    if-nez v7, :cond_b

    .line 127
    :try_start_7
    sget-object v7, Lcom/example/api/RetrofitClient;->INSTANCE:Lcom/example/api/RetrofitClient;

    invoke-virtual {v7}, Lcom/example/api/RetrofitClient;->getGoogleBooksService()Lcom/example/api/GoogleBooksApiService;

    move-result-object v7

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "intitle:\""

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    const-string v15, "\""

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    move-object v15, v0

    check-cast v15, Lkotlin/coroutines/Continuation;

    invoke-static {v12}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$0:Ljava/lang/Object;

    iput-object v11, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$1:Ljava/lang/Object;

    iput-object v3, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$2:Ljava/lang/Object;

    iput-object v5, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$3:Ljava/lang/Object;

    iput-object v6, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$4:Ljava/lang/Object;

    iput-object v10, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$5:Ljava/lang/Object;

    iput-object v10, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$6:Ljava/lang/Object;

    iput-object v10, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$7:Ljava/lang/Object;

    iput-object v10, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$8:Ljava/lang/Object;

    iput-object v10, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$9:Ljava/lang/Object;

    iput v13, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->I$0:I

    iput v8, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->label:I

    const/4 v9, 0x1

    invoke-interface {v7, v14, v9, v11, v15}, Lcom/example/api/GoogleBooksApiService;->searchBooks(Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v7
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    if-ne v7, v2, :cond_a

    goto/16 :goto_15

    :cond_a
    move-object v14, v12

    move-object v12, v3

    move v3, v13

    move-object v13, v11

    move-object v11, v5

    move-object v5, v6

    :goto_4
    :try_start_8
    check-cast v7, Lcom/example/api/GoogleBooksResponse;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2

    move-object v6, v11

    move-object v11, v7

    move-object v7, v6

    move-object v6, v5

    move-object v5, v13

    move v13, v3

    goto :goto_5

    :catch_1
    move-object v14, v12

    move-object v12, v3

    move v3, v13

    move-object v13, v11

    move-object v11, v5

    move-object v5, v6

    :catch_2
    move-object v6, v5

    move-object v7, v11

    move-object v5, v13

    move v13, v3

    move-object v11, v10

    :goto_5
    move-object v3, v12

    move-object v12, v14

    goto :goto_6

    :cond_b
    move-object v7, v5

    move-object v5, v11

    move-object v11, v10

    :goto_6
    if-eqz v11, :cond_d

    .line 130
    :try_start_9
    invoke-virtual {v11}, Lcom/example/api/GoogleBooksResponse;->getItems()Ljava/util/List;

    move-result-object v9

    check-cast v9, Ljava/util/Collection;

    if-eqz v9, :cond_d

    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    move-result v9
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_3

    if-eqz v9, :cond_c

    goto :goto_8

    :cond_c
    move-object v15, v5

    move-object/from16 v18, v7

    goto/16 :goto_b

    :catch_3
    move-object/from16 v66, v1

    move-object/from16 v16, v4

    move-object v11, v5

    :goto_7
    const/4 v5, 0x4

    goto/16 :goto_17

    .line 132
    :cond_d
    :goto_8
    :try_start_a
    sget-object v9, Lcom/example/api/RetrofitClient;->INSTANCE:Lcom/example/api/RetrofitClient;

    invoke-virtual {v9}, Lcom/example/api/RetrofitClient;->getGoogleBooksService()Lcom/example/api/GoogleBooksApiService;

    move-result-object v9

    move-object v14, v0

    check-cast v14, Lkotlin/coroutines/Continuation;

    invoke-static {v12}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    iput-object v15, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$0:Ljava/lang/Object;

    iput-object v5, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$1:Ljava/lang/Object;

    iput-object v3, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$2:Ljava/lang/Object;

    iput-object v7, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$3:Ljava/lang/Object;

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    iput-object v15, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$4:Ljava/lang/Object;

    iput-object v11, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$5:Ljava/lang/Object;

    iput-object v10, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$6:Ljava/lang/Object;

    iput-object v10, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$7:Ljava/lang/Object;

    iput-object v10, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$8:Ljava/lang/Object;

    iput-object v10, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$9:Ljava/lang/Object;

    iput v13, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->I$0:I

    const/4 v15, 0x3

    iput v15, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->label:I

    const/4 v15, 0x1

    invoke-interface {v9, v6, v15, v10, v14}, Lcom/example/api/GoogleBooksApiService;->searchBooks(Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v9
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_4

    if-ne v9, v2, :cond_e

    goto/16 :goto_15

    :cond_e
    move-object v14, v3

    move-object v15, v5

    move-object v5, v12

    move v3, v13

    move-object v12, v6

    move-object v13, v7

    :goto_9
    :try_start_b
    move-object v6, v9

    check-cast v6, Lcom/example/api/GoogleBooksResponse;
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_5

    move-object v11, v6

    goto :goto_a

    :catch_4
    move-object v14, v3

    move-object v15, v5

    move-object v5, v12

    move v3, v13

    move-object v12, v6

    move-object v13, v7

    :catch_5
    :goto_a
    move-object v6, v12

    move-object/from16 v18, v13

    move v13, v3

    move-object v12, v5

    move-object v3, v14

    :goto_b
    if-eqz v11, :cond_f

    .line 135
    :try_start_c
    invoke-virtual {v11}, Lcom/example/api/GoogleBooksResponse;->getItems()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_f

    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/example/api/VolumeItem;

    if-eqz v5, :cond_f

    invoke-virtual {v5}, Lcom/example/api/VolumeItem;->getVolumeInfo()Lcom/example/api/VolumeInfo;

    move-result-object v5
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_6

    goto :goto_d

    :catch_6
    move-object/from16 v66, v1

    move-object/from16 v16, v4

    :catch_7
    :goto_c
    move-object v11, v15

    goto :goto_7

    :cond_f
    move-object v5, v10

    :goto_d
    if-eqz v5, :cond_24

    .line 137
    :try_start_d
    invoke-virtual {v5}, Lcom/example/api/VolumeInfo;->getFullTitle()Ljava/lang/String;

    move-result-object v7

    check-cast v7, Ljava/lang/CharSequence;

    invoke-static {v7}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v9
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_9

    if-eqz v9, :cond_10

    :try_start_e
    invoke-virtual {v5}, Lcom/example/api/VolumeInfo;->getTitle()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_10

    invoke-virtual/range {v18 .. v18}, Lcom/example/data/Book;->getTitle()Ljava/lang/String;

    move-result-object v7
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_6

    :cond_10
    :try_start_f
    check-cast v7, Ljava/lang/String;

    .line 138
    invoke-virtual {v5}, Lcom/example/api/VolumeInfo;->getAuthors()Ljava/util/List;

    move-result-object v9
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_9

    const-string v14, ", "

    if-eqz v9, :cond_11

    :try_start_10
    move-object/from16 v19, v9

    check-cast v19, Ljava/lang/Iterable;

    move-object/from16 v20, v14

    check-cast v20, Ljava/lang/CharSequence;

    const/16 v26, 0x3e

    const/16 v27, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-static/range {v19 .. v27}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v9
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_6

    if-nez v9, :cond_12

    :cond_11
    :try_start_11
    invoke-virtual/range {v18 .. v18}, Lcom/example/data/Book;->getAuthor()Ljava/lang/String;

    move-result-object v9

    .line 140
    :cond_12
    move-object/from16 v19, v7

    check-cast v19, Ljava/lang/CharSequence;

    invoke-static/range {v19 .. v19}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v19

    if-nez v19, :cond_13

    move-object/from16 v20, v7

    goto :goto_e

    :cond_13
    invoke-virtual/range {v18 .. v18}, Lcom/example/data/Book;->getTitle()Ljava/lang/String;

    move-result-object v19

    move-object/from16 v20, v19

    .line 141
    :goto_e
    move-object/from16 v19, v9

    check-cast v19, Ljava/lang/CharSequence;

    invoke-static/range {v19 .. v19}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v19
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_9

    if-nez v19, :cond_14

    const/4 v8, 0x1

    :try_start_12
    invoke-static {v9, v4, v8}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v17
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_6

    if-nez v17, :cond_15

    move-object/from16 v21, v9

    goto :goto_f

    :cond_14
    const/4 v8, 0x1

    :cond_15
    :try_start_13
    invoke-virtual/range {v18 .. v18}, Lcom/example/data/Book;->getAuthor()Ljava/lang/String;

    move-result-object v17

    move-object/from16 v21, v17

    .line 142
    :goto_f
    invoke-virtual {v5}, Lcom/example/api/VolumeInfo;->getDescription()Ljava/lang/String;

    move-result-object v17

    check-cast v17, Ljava/lang/CharSequence;
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_9

    if-eqz v17, :cond_17

    :try_start_14
    invoke-static/range {v17 .. v17}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v17

    if-eqz v17, :cond_16

    goto :goto_10

    :cond_16
    invoke-virtual {v5}, Lcom/example/api/VolumeInfo;->getDescription()Ljava/lang/String;

    move-result-object v17
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_6

    goto :goto_11

    :cond_17
    :goto_10
    :try_start_15
    invoke-virtual/range {v18 .. v18}, Lcom/example/data/Book;->getDescription()Ljava/lang/String;

    move-result-object v17

    :goto_11
    move-object/from16 v39, v17

    .line 143
    invoke-virtual {v5}, Lcom/example/api/VolumeInfo;->getCategories()Ljava/util/List;

    move-result-object v17
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_9

    if-eqz v17, :cond_18

    :try_start_16
    invoke-static/range {v17 .. v17}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Ljava/lang/String;
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_6

    if-nez v17, :cond_19

    :cond_18
    :try_start_17
    invoke-virtual/range {v18 .. v18}, Lcom/example/data/Book;->getGenre()Ljava/lang/String;

    move-result-object v17

    :cond_19
    move-object/from16 v38, v17

    .line 144
    invoke-virtual {v5}, Lcom/example/api/VolumeInfo;->getPublisher()Ljava/lang/String;

    move-result-object v17
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_9

    if-nez v17, :cond_1a

    :try_start_18
    invoke-virtual/range {v18 .. v18}, Lcom/example/data/Book;->getPublisher()Ljava/lang/String;

    move-result-object v17
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_6

    :cond_1a
    move-object/from16 v49, v17

    .line 145
    :try_start_19
    invoke-virtual {v5}, Lcom/example/api/VolumeInfo;->getPublishedDate()Ljava/lang/String;

    move-result-object v17
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_9

    if-nez v17, :cond_1b

    :try_start_1a
    invoke-virtual/range {v18 .. v18}, Lcom/example/data/Book;->getPublishedDate()Ljava/lang/String;

    move-result-object v17
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_6

    :cond_1b
    move-object/from16 v50, v17

    .line 146
    :try_start_1b
    invoke-virtual {v5}, Lcom/example/api/VolumeInfo;->getPageCount()Ljava/lang/Integer;

    move-result-object v17
    :try_end_1b
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_1b} :catch_9

    if-nez v17, :cond_1c

    :try_start_1c
    invoke-virtual/range {v18 .. v18}, Lcom/example/data/Book;->getPageCount()Ljava/lang/Integer;

    move-result-object v17
    :try_end_1c
    .catch Ljava/lang/Exception; {:try_start_1c .. :try_end_1c} :catch_6

    :cond_1c
    move-object/from16 v51, v17

    .line 147
    :try_start_1d
    invoke-virtual {v5}, Lcom/example/api/VolumeInfo;->getCategories()Ljava/util/List;

    move-result-object v17
    :try_end_1d
    .catch Ljava/lang/Exception; {:try_start_1d .. :try_end_1d} :catch_9

    if-eqz v17, :cond_1d

    :try_start_1e
    move-object/from16 v22, v17

    check-cast v22, Ljava/lang/Iterable;

    move-object/from16 v23, v14

    check-cast v23, Ljava/lang/CharSequence;

    const/16 v29, 0x3e

    const/16 v30, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    invoke-static/range {v22 .. v30}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v14
    :try_end_1e
    .catch Ljava/lang/Exception; {:try_start_1e .. :try_end_1e} :catch_6

    if-nez v14, :cond_1e

    :cond_1d
    :try_start_1f
    invoke-virtual/range {v18 .. v18}, Lcom/example/data/Book;->getCategories()Ljava/lang/String;

    move-result-object v14

    :cond_1e
    move-object/from16 v54, v14

    .line 148
    invoke-virtual/range {v18 .. v18}, Lcom/example/data/Book;->getImageUrl()Ljava/lang/String;

    move-result-object v14

    check-cast v14, Ljava/lang/CharSequence;
    :try_end_1f
    .catch Ljava/lang/Exception; {:try_start_1f .. :try_end_1f} :catch_9

    if-eqz v14, :cond_21

    :try_start_20
    invoke-static {v14}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cond_1f

    goto :goto_12

    :cond_1f
    invoke-virtual/range {v18 .. v18}, Lcom/example/data/Book;->getImageUrl()Ljava/lang/String;

    move-result-object v14

    const-string v8, "android.resource"
    :try_end_20
    .catch Ljava/lang/Exception; {:try_start_20 .. :try_end_20} :catch_8

    move-object/from16 v66, v1

    move-object/from16 v16, v4

    const/4 v1, 0x0

    const/4 v4, 0x2

    :try_start_21
    invoke-static {v14, v8, v1, v4, v10}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_20

    goto :goto_13

    :cond_20
    invoke-virtual/range {v18 .. v18}, Lcom/example/data/Book;->getImageUrl()Ljava/lang/String;

    move-result-object v8
    :try_end_21
    .catch Ljava/lang/Exception; {:try_start_21 .. :try_end_21} :catch_7

    goto :goto_14

    :catch_8
    move-object/from16 v66, v1

    move-object/from16 v16, v4

    const/4 v1, 0x0

    goto/16 :goto_c

    :cond_21
    :goto_12
    move-object/from16 v66, v1

    move-object/from16 v16, v4

    const/4 v1, 0x0

    const/4 v4, 0x2

    :goto_13
    :try_start_22
    invoke-virtual {v5}, Lcom/example/api/VolumeInfo;->getImageLinks()Lcom/example/api/ImageLinks;

    move-result-object v8
    :try_end_22
    .catch Ljava/lang/Exception; {:try_start_22 .. :try_end_22} :catch_a

    if-eqz v8, :cond_22

    :try_start_23
    invoke-virtual {v8}, Lcom/example/api/ImageLinks;->getBestHighResUrl()Ljava/lang/String;

    move-result-object v8
    :try_end_23
    .catch Ljava/lang/Exception; {:try_start_23 .. :try_end_23} :catch_7

    if-nez v8, :cond_23

    :cond_22
    :try_start_24
    invoke-virtual/range {v18 .. v18}, Lcom/example/data/Book;->getImageUrl()Ljava/lang/String;

    move-result-object v8

    :cond_23
    :goto_14
    move-object/from16 v32, v8

    const/16 v64, 0x7fb

    const/16 v65, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const-wide/16 v30, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const v63, 0x1ff3eff9

    .line 139
    invoke-static/range {v18 .. v65}, Lcom/example/data/Book;->copy$default(Lcom/example/data/Book;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;IILjava/lang/Object;)Lcom/example/data/Book;

    move-result-object v8

    move-object/from16 v14, v18

    .line 150
    invoke-static {v8, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v18

    if-nez v18, :cond_25

    .line 151
    iget-object v1, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-static {v1}, Lcom/example/ui/BookViewModel;->access$getRepository$p(Lcom/example/ui/BookViewModel;)Lcom/example/data/BookRepository;

    move-result-object v1

    move-object v4, v0

    check-cast v4, Lkotlin/coroutines/Continuation;

    invoke-static {v12}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$0:Ljava/lang/Object;

    iput-object v15, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$1:Ljava/lang/Object;

    iput-object v3, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$2:Ljava/lang/Object;

    invoke-static {v14}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$3:Ljava/lang/Object;

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$4:Ljava/lang/Object;

    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$5:Ljava/lang/Object;

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$6:Ljava/lang/Object;

    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$7:Ljava/lang/Object;

    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$8:Ljava/lang/Object;

    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->L$9:Ljava/lang/Object;

    iput v13, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->I$0:I
    :try_end_24
    .catch Ljava/lang/Exception; {:try_start_24 .. :try_end_24} :catch_a

    const/4 v5, 0x4

    :try_start_25
    iput v5, v0, Lcom/example/ui/BookViewModel$autoCleanAndEnrichExistingBooks$1;->label:I

    invoke-virtual {v1, v8, v4}, Lcom/example/data/BookRepository;->updateBook(Lcom/example/data/Book;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1
    :try_end_25
    .catch Ljava/lang/Exception; {:try_start_25 .. :try_end_25} :catch_b

    if-ne v1, v2, :cond_26

    :goto_15
    return-object v2

    :catch_9
    move-object/from16 v66, v1

    move-object/from16 v16, v4

    :catch_a
    const/4 v5, 0x4

    goto :goto_16

    :cond_24
    move-object/from16 v66, v1

    move-object/from16 v16, v4

    :cond_25
    const/4 v5, 0x4

    :catch_b
    :cond_26
    :goto_16
    move-object v11, v15

    goto :goto_17

    :catch_c
    move-object/from16 v66, v1

    move-object/from16 v16, v4

    goto/16 :goto_7

    :goto_17
    move-object/from16 v4, v16

    move-object/from16 v1, v66

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/4 v10, 0x0

    goto/16 :goto_1

    :cond_27
    move-object/from16 v66, v1

    move-object/from16 v16, v4

    goto/16 :goto_7

    .line 159
    :catch_d
    :cond_28
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method
