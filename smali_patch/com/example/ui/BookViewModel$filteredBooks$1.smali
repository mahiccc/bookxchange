.class final Lcom/example/ui/BookViewModel$filteredBooks$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "BookViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/BookViewModel;-><init>(Landroid/content/Context;Lcom/example/data/BookRepository;Landroid/content/SharedPreferences;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function4<",
        "Ljava/util/List<",
        "+",
        "Lcom/example/data/Book;",
        ">;",
        "Ljava/lang/String;",
        "Ljava/lang/String;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Ljava/util/List<",
        "+",
        "Lcom/example/data/Book;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBookViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BookViewModel.kt\ncom/example/ui/BookViewModel$filteredBooks$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1363:1\n774#2:1364\n865#2,2:1365\n774#2:1367\n865#2,2:1368\n774#2:1370\n865#2,2:1371\n774#2:1373\n865#2,2:1374\n774#2:1376\n865#2,2:1377\n*S KotlinDebug\n*F\n+ 1 BookViewModel.kt\ncom/example/ui/BookViewModel$filteredBooks$1\n*L\n177#1:1364\n177#1:1365,2\n189#1:1367\n189#1:1368,2\n190#1:1370\n190#1:1371,2\n191#1:1373\n191#1:1374,2\n192#1:1376\n192#1:1377,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lcom/example/data/Book;",
        "books",
        "query",
        "",
        "status"
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
    c = "com.example.ui.BookViewModel$filteredBooks$1"
    f = "BookViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field synthetic L$2:Ljava/lang/Object;

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
            "Lcom/example/ui/BookViewModel$filteredBooks$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/BookViewModel$filteredBooks$1;->this$0:Lcom/example/ui/BookViewModel;

    const/4 p1, 0x4

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/lang/String;

    check-cast p3, Ljava/lang/String;

    check-cast p4, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/example/ui/BookViewModel$filteredBooks$1;->invoke(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invoke(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/example/data/Book;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/example/data/Book;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lcom/example/ui/BookViewModel$filteredBooks$1;

    iget-object p0, p0, Lcom/example/ui/BookViewModel$filteredBooks$1;->this$0:Lcom/example/ui/BookViewModel;

    invoke-direct {v0, p0, p4}, Lcom/example/ui/BookViewModel$filteredBooks$1;-><init>(Lcom/example/ui/BookViewModel;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/example/ui/BookViewModel$filteredBooks$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/example/ui/BookViewModel$filteredBooks$1;->L$1:Ljava/lang/Object;

    iput-object p3, v0, Lcom/example/ui/BookViewModel$filteredBooks$1;->L$2:Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, p0}, Lcom/example/ui/BookViewModel$filteredBooks$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lcom/example/ui/BookViewModel$filteredBooks$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lcom/example/ui/BookViewModel$filteredBooks$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/example/ui/BookViewModel$filteredBooks$1;->L$2:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 173
    iget v3, p0, Lcom/example/ui/BookViewModel$filteredBooks$1;->label:I

    if-nez v3, :cond_13

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 175
    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p1

    const/4 v3, 0x1

    if-nez p1, :cond_5

    .line 176
    invoke-static {v1}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 177
    check-cast v0, Ljava/lang/Iterable;

    .line 1364
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 1365
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lcom/example/data/Book;

    .line 178
    invoke-virtual {v5}, Lcom/example/data/Book;->getTitle()Ljava/lang/String;

    move-result-object v6

    check-cast v6, Ljava/lang/CharSequence;

    move-object v7, p1

    check-cast v7, Ljava/lang/CharSequence;

    invoke-static {v6, v7, v3}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v6

    if-nez v6, :cond_3

    .line 179
    invoke-virtual {v5}, Lcom/example/data/Book;->getAuthor()Ljava/lang/String;

    move-result-object v6

    check-cast v6, Ljava/lang/CharSequence;

    invoke-static {v6, v7, v3}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v6

    if-nez v6, :cond_3

    .line 180
    invoke-virtual {v5}, Lcom/example/data/Book;->getOwnerDisplayName()Ljava/lang/String;

    move-result-object v6

    check-cast v6, Ljava/lang/CharSequence;

    invoke-static {v6, v7, v3}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v6

    if-nez v6, :cond_3

    .line 181
    invoke-virtual {v5}, Lcom/example/data/Book;->getPickupAddress()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_1

    check-cast v6, Ljava/lang/CharSequence;

    invoke-static {v6, v7, v3}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v6

    if-ne v6, v3, :cond_1

    goto :goto_1

    .line 182
    :cond_1
    invoke-virtual {v5}, Lcom/example/data/Book;->getGenre()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_2

    check-cast v6, Ljava/lang/CharSequence;

    invoke-static {v6, v7, v3}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v6

    if-ne v6, v3, :cond_2

    goto :goto_1

    .line 183
    :cond_2
    invoke-virtual {v5}, Lcom/example/data/Book;->getCategories()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_0

    check-cast v5, Ljava/lang/CharSequence;

    invoke-static {v5, v7, v3}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v5

    if-ne v5, v3, :cond_0

    .line 1365
    :cond_3
    :goto_1
    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1366
    :cond_4
    move-object v0, v1

    check-cast v0, Ljava/util/List;

    .line 187
    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result p1

    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_5

    :sswitch_0
    const-string p1, "MY_BOOKS"

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto/16 :goto_5

    .line 189
    :cond_6
    check-cast v0, Ljava/lang/Iterable;

    iget-object p0, p0, Lcom/example/ui/BookViewModel$filteredBooks$1;->this$0:Lcom/example/ui/BookViewModel;

    .line 1367
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/Collection;

    .line 1368
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_7
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/example/data/Book;

    .line 189
    invoke-static {p0}, Lcom/example/ui/BookViewModel;->access$get_currentUser$p(Lcom/example/ui/BookViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v3

    invoke-interface {v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/example/ui/screens/DashboardScreenKt;->isBookOwner(Lcom/example/data/Book;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 1368
    invoke-interface {p1, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 1369
    :cond_8
    check-cast p1, Ljava/util/List;

    return-object p1

    .line 187
    :sswitch_1
    const-string p1, "BOOKMARKS"

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto/16 :goto_5

    .line 191
    :cond_9
    check-cast v0, Ljava/lang/Iterable;

    iget-object p0, p0, Lcom/example/ui/BookViewModel$filteredBooks$1;->this$0:Lcom/example/ui/BookViewModel;

    .line 1373
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/Collection;

    .line 1374
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_a
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/example/data/Book;

    .line 191
    invoke-virtual {v2}, Lcom/example/data/Book;->getBookmarkedBy()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {p0}, Lcom/example/ui/BookViewModel;->access$get_currentUser$p(Lcom/example/ui/BookViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v3

    invoke-interface {v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/collections/CollectionsKt;->contains(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    .line 1374
    invoke-interface {p1, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 1375
    :cond_b
    check-cast p1, Ljava/util/List;

    return-object p1

    .line 187
    :sswitch_2
    const-string p0, "ALL"

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_c

    goto :goto_5

    :cond_c
    return-object v0

    :sswitch_3
    const-string p0, "RECOMMENDED"

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_d

    goto :goto_5

    .line 190
    :cond_d
    check-cast v0, Ljava/lang/Iterable;

    .line 1370
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    check-cast p0, Ljava/util/Collection;

    .line 1371
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_e
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/example/data/Book;

    .line 190
    invoke-virtual {v1}, Lcom/example/data/Book;->getStatus()Ljava/lang/String;

    move-result-object v2

    const-string v3, "AVAILABLE"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    invoke-virtual {v1}, Lcom/example/data/Book;->getRentCount()I

    move-result v1

    if-lez v1, :cond_e

    .line 1371
    :cond_f
    invoke-interface {p0, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 1372
    :cond_10
    check-cast p0, Ljava/util/List;

    return-object p0

    .line 192
    :goto_5
    check-cast v0, Ljava/lang/Iterable;

    .line 1376
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    check-cast p0, Ljava/util/Collection;

    .line 1377
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_11
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/example/data/Book;

    .line 192
    invoke-virtual {v1}, Lcom/example/data/Book;->getStatus()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2, v3}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_11

    .line 1377
    invoke-interface {p0, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 1378
    :cond_12
    check-cast p0, Ljava/util/List;

    return-object p0

    .line 173
    :cond_13
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x29f78dc5 -> :sswitch_3
        0xfd81 -> :sswitch_2
        0x1f8511dd -> :sswitch_1
        0x48a8a637 -> :sswitch_0
    .end sparse-switch
.end method
