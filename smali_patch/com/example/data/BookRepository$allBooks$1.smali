.class final Lcom/example/data/BookRepository$allBooks$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "BookRepository.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/data/BookRepository;-><init>(Lcom/google/firebase/firestore/FirebaseFirestore;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/channels/ProducerScope<",
        "-",
        "Ljava/util/List<",
        "+",
        "Lcom/example/data/Book;",
        ">;>;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBookRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BookRepository.kt\ncom/example/data/BookRepository$allBooks$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,444:1\n1617#2,9:445\n1869#2:454\n1870#2:457\n1626#2:458\n1068#2:459\n1#3:455\n1#3:456\n*S KotlinDebug\n*F\n+ 1 BookRepository.kt\ncom/example/data/BookRepository$allBooks$1\n*L\n22#1:445,9\n22#1:454\n22#1:457\n22#1:458\n90#1:459\n22#1:456\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/channels/ProducerScope;",
        "",
        "Lcom/example/data/Book;"
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
    c = "com.example.data.BookRepository$allBooks$1"
    f = "BookRepository.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0x5d
    }
    m = "invokeSuspend"
    n = {
        "$this$callbackFlow",
        "listener"
    }
    s = {
        "L$0",
        "L$1"
    }
.end annotation


# instance fields
.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/example/data/BookRepository;


# direct methods
.method constructor <init>(Lcom/example/data/BookRepository;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/data/BookRepository;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/data/BookRepository$allBooks$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/data/BookRepository$allBooks$1;->this$0:Lcom/example/data/BookRepository;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method static final invokeSuspend$lambda$5(Lkotlinx/coroutines/channels/ProducerScope;Lcom/google/firebase/firestore/QuerySnapshot;Lcom/google/firebase/firestore/FirebaseFirestoreException;)V
    .locals 55

    .line 15
    const-string v1, "longitude"

    const-string v2, "latitude"

    if-eqz p2, :cond_0

    .line 16
    invoke-virtual/range {p2 .. p2}, Lcom/google/firebase/firestore/FirebaseFirestoreException;->printStackTrace()V

    return-void

    :cond_0
    if-eqz p1, :cond_15

    .line 22
    invoke-virtual/range {p1 .. p1}, Lcom/google/firebase/firestore/QuerySnapshot;->getDocuments()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_15

    check-cast v0, Ljava/lang/Iterable;

    .line 445
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    check-cast v3, Ljava/util/Collection;

    .line 454
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 453
    check-cast v0, Lcom/google/firebase/firestore/DocumentSnapshot;

    .line 24
    :try_start_0
    invoke-virtual {v0}, Lcom/google/firebase/firestore/DocumentSnapshot;->getData()Ljava/util/Map;

    move-result-object v6

    if-nez v6, :cond_1

    move-object/from16 p1, v4

    :goto_1
    const/4 v5, 0x0

    goto/16 :goto_13

    .line 39
    :cond_1
    invoke-virtual {v0}, Lcom/google/firebase/firestore/DocumentSnapshot;->getId()Ljava/lang/String;

    move-result-object v8

    const-string v0, "getId(...)"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    const-string v0, "title"

    invoke-static {v6, v0}, Lcom/example/data/BookRepository$allBooks$1;->invokeSuspend$lambda$5$lambda$3$getString(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    const-string v7, ""

    if-nez v0, :cond_2

    move-object v9, v7

    goto :goto_2

    :cond_2
    move-object v9, v0

    .line 41
    :goto_2
    :try_start_1
    const-string v0, "author"

    invoke-static {v6, v0}, Lcom/example/data/BookRepository$allBooks$1;->invokeSuspend$lambda$5$lambda$3$getString(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    move-object v10, v7

    goto :goto_3

    :cond_3
    move-object v10, v0

    .line 42
    :goto_3
    const-string v0, "condition"

    invoke-static {v6, v0}, Lcom/example/data/BookRepository$allBooks$1;->invokeSuspend$lambda$5$lambda$3$getString(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_4

    const-string v0, "Good"

    :cond_4
    move-object v11, v0

    .line 43
    const-string v0, "ownerName"

    invoke-static {v6, v0}, Lcom/example/data/BookRepository$allBooks$1;->invokeSuspend$lambda$5$lambda$3$getString(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_5

    move-object v12, v7

    goto :goto_4

    :cond_5
    move-object v12, v0

    .line 44
    :goto_4
    const-string v0, "ownerDisplayName"

    invoke-static {v6, v0}, Lcom/example/data/BookRepository$allBooks$1;->invokeSuspend$lambda$5$lambda$3$getString(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_6

    move-object v13, v7

    goto :goto_5

    :cond_6
    move-object v13, v0

    .line 45
    :goto_5
    const-string v0, "ownerProfilePicUrl"

    invoke-static {v6, v0}, Lcom/example/data/BookRepository$allBooks$1;->invokeSuspend$lambda$5$lambda$3$getString(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 46
    const-string v0, "isAvailable"

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v7, v0, Ljava/lang/Boolean;

    if-eqz v7, :cond_7

    check-cast v0, Ljava/lang/Boolean;

    goto :goto_6

    :cond_7
    const/4 v0, 0x0

    :goto_6
    if-eqz v0, :cond_8

    :goto_7
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :goto_8
    move v15, v0

    goto :goto_a

    :cond_8
    const-string v0, "available"

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v7, v0, Ljava/lang/Boolean;

    if-eqz v7, :cond_9

    check-cast v0, Ljava/lang/Boolean;

    goto :goto_9

    :cond_9
    const/4 v0, 0x0

    :goto_9
    if-eqz v0, :cond_a

    goto :goto_7

    :cond_a
    const/4 v0, 0x1

    goto :goto_8

    .line 47
    :goto_a
    const-string v0, "borrowerName"

    invoke-static {v6, v0}, Lcom/example/data/BookRepository$allBooks$1;->invokeSuspend$lambda$5$lambda$3$getString(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 48
    const-string v0, "requestedByName"

    invoke-static {v6, v0}, Lcom/example/data/BookRepository$allBooks$1;->invokeSuspend$lambda$5$lambda$3$getString(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    .line 49
    const-string v0, "status"

    invoke-static {v6, v0}, Lcom/example/data/BookRepository$allBooks$1;->invokeSuspend$lambda$5$lambda$3$getString(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_b

    const-string v0, "AVAILABLE"

    :cond_b
    move-object/from16 v18, v0

    .line 50
    const-string v0, "timestamp"
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object/from16 p1, v4

    :try_start_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-static {v6, v0, v4, v5}, Lcom/example/data/BookRepository$allBooks$1;->invokeSuspend$lambda$5$lambda$3$getLong(Ljava/util/Map;Ljava/lang/String;J)J

    move-result-wide v19

    .line 51
    const-string v0, "imageUrl"

    invoke-static {v6, v0}, Lcom/example/data/BookRepository$allBooks$1;->invokeSuspend$lambda$5$lambda$3$getString(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v21

    .line 52
    const-string v0, "estimatedPrice"

    invoke-static {v6, v0}, Lcom/example/data/BookRepository$allBooks$1;->invokeSuspend$lambda$5$lambda$3$getString(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v22

    .line 53
    const-string v0, "pickupAddress"

    invoke-static {v6, v0}, Lcom/example/data/BookRepository$allBooks$1;->invokeSuspend$lambda$5$lambda$3$getString(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v23

    .line 54
    const-string v0, "mobileNumber"

    invoke-static {v6, v0}, Lcom/example/data/BookRepository$allBooks$1;->invokeSuspend$lambda$5$lambda$3$getString(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v24

    .line 55
    invoke-static {v6, v2}, Lcom/example/data/BookRepository$allBooks$1;->invokeSuspend$lambda$5$lambda$3$getDouble(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    if-nez v0, :cond_d

    invoke-static {v6, v2}, Lcom/example/data/BookRepository$allBooks$1;->invokeSuspend$lambda$5$lambda$3$getString(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-static {v0}, Lkotlin/text/StringsKt;->toDoubleOrNull(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    goto :goto_b

    :cond_c
    const/16 v25, 0x0

    goto :goto_c

    :cond_d
    :goto_b
    move-object/from16 v25, v0

    .line 56
    :goto_c
    invoke-static {v6, v1}, Lcom/example/data/BookRepository$allBooks$1;->invokeSuspend$lambda$5$lambda$3$getDouble(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    if-nez v0, :cond_f

    invoke-static {v6, v1}, Lcom/example/data/BookRepository$allBooks$1;->invokeSuspend$lambda$5$lambda$3$getString(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-static {v0}, Lkotlin/text/StringsKt;->toDoubleOrNull(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    goto :goto_d

    :cond_e
    const/16 v26, 0x0

    goto :goto_e

    :cond_f
    :goto_d
    move-object/from16 v26, v0

    .line 57
    :goto_e
    const-string v0, "genre"

    invoke-static {v6, v0}, Lcom/example/data/BookRepository$allBooks$1;->invokeSuspend$lambda$5$lambda$3$getString(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v27

    .line 58
    const-string v0, "description"

    invoke-static {v6, v0}, Lcom/example/data/BookRepository$allBooks$1;->invokeSuspend$lambda$5$lambda$3$getString(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v28

    .line 59
    const-string v0, "transferImageUrl"

    invoke-static {v6, v0}, Lcom/example/data/BookRepository$allBooks$1;->invokeSuspend$lambda$5$lambda$3$getString(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v29

    .line 60
    const-string v0, "returnImageUrl"

    invoke-static {v6, v0}, Lcom/example/data/BookRepository$allBooks$1;->invokeSuspend$lambda$5$lambda$3$getString(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v30

    .line 61
    const-string v0, "transferCondition"

    invoke-static {v6, v0}, Lcom/example/data/BookRepository$allBooks$1;->invokeSuspend$lambda$5$lambda$3$getString(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v31

    .line 62
    const-string v0, "transferAiAssessment"

    invoke-static {v6, v0}, Lcom/example/data/BookRepository$allBooks$1;->invokeSuspend$lambda$5$lambda$3$getString(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v32

    .line 63
    const-string v0, "returnCondition"

    invoke-static {v6, v0}, Lcom/example/data/BookRepository$allBooks$1;->invokeSuspend$lambda$5$lambda$3$getString(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v33

    .line 64
    const-string v0, "returnAiAssessment"

    invoke-static {v6, v0}, Lcom/example/data/BookRepository$allBooks$1;->invokeSuspend$lambda$5$lambda$3$getString(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v34

    .line 65
    const-string v0, "isTransferQrVerified"

    const/4 v4, 0x0

    invoke-static {v6, v0, v4}, Lcom/example/data/BookRepository$allBooks$1;->invokeSuspend$lambda$5$lambda$3$getBoolean(Ljava/util/Map;Ljava/lang/String;Z)Z

    move-result v35

    .line 66
    const-string v0, "isReturnQrVerified"

    invoke-static {v6, v0, v4}, Lcom/example/data/BookRepository$allBooks$1;->invokeSuspend$lambda$5$lambda$3$getBoolean(Ljava/util/Map;Ljava/lang/String;Z)Z

    move-result v36

    .line 67
    const-string v0, "rentCount"

    invoke-static {v6, v0, v4}, Lcom/example/data/BookRepository$allBooks$1;->invokeSuspend$lambda$5$lambda$3$getInt(Ljava/util/Map;Ljava/lang/String;I)I

    move-result v37

    .line 68
    const-string v0, "publisher"

    invoke-static {v6, v0}, Lcom/example/data/BookRepository$allBooks$1;->invokeSuspend$lambda$5$lambda$3$getString(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v38

    .line 69
    const-string v0, "publishedDate"

    invoke-static {v6, v0}, Lcom/example/data/BookRepository$allBooks$1;->invokeSuspend$lambda$5$lambda$3$getString(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v39

    .line 70
    const-string v0, "pageCount"

    invoke-static {v6, v0, v4}, Lcom/example/data/BookRepository$allBooks$1;->invokeSuspend$lambda$5$lambda$3$getInt(Ljava/util/Map;Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    if-lez v5, :cond_10

    move-object/from16 v40, v0

    goto :goto_f

    :cond_10
    const/16 v40, 0x0

    .line 71
    :goto_f
    const-string v0, "language"

    invoke-static {v6, v0}, Lcom/example/data/BookRepository$allBooks$1;->invokeSuspend$lambda$5$lambda$3$getString(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v41

    .line 72
    const-string v0, "averageRating"

    invoke-static {v6, v0}, Lcom/example/data/BookRepository$allBooks$1;->invokeSuspend$lambda$5$lambda$3$getDouble(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v42

    .line 73
    const-string v0, "categories"

    invoke-static {v6, v0}, Lcom/example/data/BookRepository$allBooks$1;->invokeSuspend$lambda$5$lambda$3$getString(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v43

    .line 74
    const-string v0, "remarks"

    invoke-static {v6, v0}, Lcom/example/data/BookRepository$allBooks$1;->invokeSuspend$lambda$5$lambda$3$getString(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v44

    .line 75
    const-string v0, "borrowedDate"

    const-wide/16 v4, 0x0

    invoke-static {v6, v0, v4, v5}, Lcom/example/data/BookRepository$allBooks$1;->invokeSuspend$lambda$5$lambda$3$getLong(Ljava/util/Map;Ljava/lang/String;J)J

    move-result-wide v45

    invoke-static/range {v45 .. v46}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    move-object/from16 v45, v0

    check-cast v45, Ljava/lang/Number;

    invoke-virtual/range {v45 .. v45}, Ljava/lang/Number;->longValue()J

    move-result-wide v45

    cmp-long v45, v45, v4

    if-lez v45, :cond_11

    move-object/from16 v45, v0

    goto :goto_10

    :cond_11
    const/16 v45, 0x0

    .line 76
    :goto_10
    const-string v0, "borrowerCurrentPage"

    const/4 v7, 0x0

    invoke-static {v6, v0, v7}, Lcom/example/data/BookRepository$allBooks$1;->invokeSuspend$lambda$5$lambda$3$getInt(Ljava/util/Map;Ljava/lang/String;I)I

    move-result v47

    .line 77
    const-string v0, "borrowerNotes"

    invoke-static {v6, v0}, Lcom/example/data/BookRepository$allBooks$1;->invokeSuspend$lambda$5$lambda$3$getString(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v48

    .line 78
    const-string v0, "agreedMeetupSpot"

    invoke-static {v6, v0}, Lcom/example/data/BookRepository$allBooks$1;->invokeSuspend$lambda$5$lambda$3$getString(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v49

    .line 79
    const-string v0, "agreedMeetupAddress"

    invoke-static {v6, v0}, Lcom/example/data/BookRepository$allBooks$1;->invokeSuspend$lambda$5$lambda$3$getString(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v50

    .line 80
    const-string v0, "agreedMeetupTime"

    invoke-static {v6, v0, v4, v5}, Lcom/example/data/BookRepository$allBooks$1;->invokeSuspend$lambda$5$lambda$3$getLong(Ljava/util/Map;Ljava/lang/String;J)J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    move-result-wide v6

    cmp-long v4, v6, v4

    if-lez v4, :cond_12

    move-object/from16 v51, v0

    goto :goto_11

    :cond_12
    const/16 v51, 0x0

    .line 38
    :goto_11
    new-instance v7, Lcom/example/data/Book;

    const/16 v46, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x20

    const/16 v54, 0x0

    invoke-direct/range {v7 .. v54}, Lcom/example/data/Book;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    move-object v5, v7

    goto :goto_13

    :catch_0
    move-exception v0

    goto :goto_12

    :catch_1
    move-exception v0

    move-object/from16 p1, v4

    .line 83
    :goto_12
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_1

    :goto_13
    if-eqz v5, :cond_13

    .line 453
    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_13
    move-object/from16 v4, p1

    goto/16 :goto_0

    .line 458
    :cond_14
    check-cast v3, Ljava/util/List;

    goto :goto_14

    .line 86
    :cond_15
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v3

    .line 90
    :goto_14
    check-cast v3, Ljava/lang/Iterable;

    .line 459
    new-instance v0, Lcom/example/data/BookRepository$allBooks$1$invokeSuspend$lambda$5$$inlined$sortedByDescending$1;

    invoke-direct {v0}, Lcom/example/data/BookRepository$allBooks$1$invokeSuspend$lambda$5$$inlined$sortedByDescending$1;-><init>()V

    check-cast v0, Ljava/util/Comparator;

    invoke-static {v3, v0}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    move-object/from16 v1, p0

    .line 91
    invoke-interface {v1, v0}, Lkotlinx/coroutines/channels/ProducerScope;->trySend-JP2dKIU(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlinx/coroutines/channels/ChannelResult;->isSuccess-impl(Ljava/lang/Object;)Z

    return-void
.end method

.method private static final invokeSuspend$lambda$5$lambda$3$getBoolean(Ljava/util/Map;Ljava/lang/String;Z)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            "Z)Z"
        }
    .end annotation

    .line 28
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    instance-of p1, p0, Ljava/lang/Boolean;

    if-eqz p1, :cond_0

    check-cast p0, Ljava/lang/Boolean;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0

    :cond_1
    return p2
.end method

.method private static final invokeSuspend$lambda$5$lambda$3$getDouble(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Double;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Double;"
        }
    .end annotation

    .line 35
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    instance-of p1, p0, Ljava/lang/Number;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    check-cast p0, Ljava/lang/Number;

    goto :goto_0

    :cond_0
    move-object p0, v0

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    return-object p0

    :cond_1
    return-object v0
.end method

.method private static final invokeSuspend$lambda$5$lambda$3$getInt(Ljava/util/Map;Ljava/lang/String;I)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            "I)I"
        }
    .end annotation

    .line 36
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    instance-of p1, p0, Ljava/lang/Number;

    if-eqz p1, :cond_0

    check-cast p0, Ljava/lang/Number;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0

    :cond_1
    return p2
.end method

.method private static final invokeSuspend$lambda$5$lambda$3$getLong(Ljava/util/Map;Ljava/lang/String;J)J
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            "J)J"
        }
    .end annotation

    .line 30
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 31
    instance-of p1, p0, Ljava/lang/Number;

    if-eqz p1, :cond_0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide p0

    return-wide p0

    .line 32
    :cond_0
    instance-of p1, p0, Lcom/google/firebase/Timestamp;

    if-eqz p1, :cond_1

    check-cast p0, Lcom/google/firebase/Timestamp;

    invoke-virtual {p0}, Lcom/google/firebase/Timestamp;->toDate()Ljava/util/Date;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide p0

    return-wide p0

    :cond_1
    return-wide p2
.end method

.method private static final invokeSuspend$lambda$5$lambda$3$getString(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 27
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method static final invokeSuspend$lambda$6(Lcom/google/firebase/firestore/ListenerRegistration;)Lkotlin/Unit;
    .locals 0

    .line 93
    invoke-interface {p0}, Lcom/google/firebase/firestore/ListenerRegistration;->remove()V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1
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

    new-instance v0, Lcom/example/data/BookRepository$allBooks$1;

    iget-object p0, p0, Lcom/example/data/BookRepository$allBooks$1;->this$0:Lcom/example/data/BookRepository;

    invoke-direct {v0, p0, p2}, Lcom/example/data/BookRepository$allBooks$1;-><init>(Lcom/example/data/BookRepository;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/example/data/BookRepository$allBooks$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/channels/ProducerScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/data/BookRepository$allBooks$1;->invoke(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invoke(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/channels/ProducerScope<",
            "-",
            "Ljava/util/List<",
            "Lcom/example/data/Book;",
            ">;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/example/data/BookRepository$allBooks$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p0

    check-cast p0, Lcom/example/data/BookRepository$allBooks$1;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lcom/example/data/BookRepository$allBooks$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lcom/example/data/BookRepository$allBooks$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlinx/coroutines/channels/ProducerScope;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 12
    iget v2, p0, Lcom/example/data/BookRepository$allBooks$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object p0, p0, Lcom/example/data/BookRepository$allBooks$1;->L$1:Ljava/lang/Object;

    check-cast p0, Lcom/google/firebase/firestore/ListenerRegistration;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 13
    iget-object p1, p0, Lcom/example/data/BookRepository$allBooks$1;->this$0:Lcom/example/data/BookRepository;

    invoke-static {p1}, Lcom/example/data/BookRepository;->access$getFirestore$p(Lcom/example/data/BookRepository;)Lcom/google/firebase/firestore/FirebaseFirestore;

    move-result-object p1

    const-string v2, "books_v2"

    invoke-virtual {p1, v2}, Lcom/google/firebase/firestore/FirebaseFirestore;->collection(Ljava/lang/String;)Lcom/google/firebase/firestore/CollectionReference;

    move-result-object p1

    .line 14
    sget-object v2, Lcom/google/firebase/firestore/MetadataChanges;->INCLUDE:Lcom/google/firebase/firestore/MetadataChanges;

    new-instance v4, Lcom/example/data/BookRepository$allBooks$1$$ExternalSyntheticLambda0;

    invoke-direct {v4, v0}, Lcom/example/data/BookRepository$allBooks$1$$ExternalSyntheticLambda0;-><init>(Lkotlinx/coroutines/channels/ProducerScope;)V

    invoke-virtual {p1, v2, v4}, Lcom/google/firebase/firestore/CollectionReference;->addSnapshotListener(Lcom/google/firebase/firestore/MetadataChanges;Lcom/google/firebase/firestore/EventListener;)Lcom/google/firebase/firestore/ListenerRegistration;

    move-result-object p1

    const-string v2, "addSnapshotListener(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    new-instance v2, Lcom/example/data/BookRepository$allBooks$1$$ExternalSyntheticLambda1;

    invoke-direct {v2, p1}, Lcom/example/data/BookRepository$allBooks$1$$ExternalSyntheticLambda1;-><init>(Lcom/google/firebase/firestore/ListenerRegistration;)V

    move-object v4, p0

    check-cast v4, Lkotlin/coroutines/Continuation;

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, p0, Lcom/example/data/BookRepository$allBooks$1;->L$0:Ljava/lang/Object;

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/example/data/BookRepository$allBooks$1;->L$1:Ljava/lang/Object;

    iput v3, p0, Lcom/example/data/BookRepository$allBooks$1;->label:I

    invoke-static {v0, v2, v4}, Lkotlinx/coroutines/channels/ProduceKt;->awaitClose(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_2

    return-object v1

    .line 94
    :cond_2
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method
