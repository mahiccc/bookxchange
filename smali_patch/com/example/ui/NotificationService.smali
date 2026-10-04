.class public final Lcom/example/ui/NotificationService;
.super Ljava/lang/Object;
.source "NotificationService.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNotificationService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationService.kt\ncom/example/ui/NotificationService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n1563#2:186\n1634#2,3:187\n1563#2:190\n1634#2,3:191\n774#2:194\n865#2,2:195\n1869#2,2:197\n1#3:199\n*S KotlinDebug\n*F\n+ 1 NotificationService.kt\ncom/example/ui/NotificationService\n*L\n24#1:186\n24#1:187,3\n28#1:190\n28#1:191,3\n33#1:194\n33#1:195,2\n89#1:197,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J&\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00132\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0008J&\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00132\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0008J\u0006\u0010\u0019\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00080\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/example/ui/NotificationService;",
        "",
        "<init>",
        "()V",
        "appStartTime",
        "",
        "lastMessageIds",
        "",
        "",
        "lastKnownBookStatuses",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "isMessagesInitialized",
        "",
        "isBooksInitialized",
        "checkAndNotifyMessages",
        "",
        "context",
        "Landroid/content/Context;",
        "messages",
        "",
        "Lcom/example/data/Message;",
        "currentUser",
        "checkAndNotifyBooks",
        "books",
        "Lcom/example/data/Book;",
        "markInitialized",
        "app"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/example/ui/NotificationService;

.field private static appStartTime:J

.field private static isBooksInitialized:Z

.field private static isMessagesInitialized:Z

.field private static final lastKnownBookStatuses:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final lastMessageIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/example/ui/NotificationService;

    invoke-direct {v0}, Lcom/example/ui/NotificationService;-><init>()V

    sput-object v0, Lcom/example/ui/NotificationService;->INSTANCE:Lcom/example/ui/NotificationService;

    .line 11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lcom/example/ui/NotificationService;->appStartTime:J

    .line 12
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    move-result-object v0

    const-string v1, "newKeySet(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/Set;

    sput-object v0, Lcom/example/ui/NotificationService;->lastMessageIds:Ljava/util/Set;

    .line 13
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lcom/example/ui/NotificationService;->lastKnownBookStatuses:Ljava/util/concurrent/ConcurrentHashMap;

    const/16 v0, 0x8

    sput v0, Lcom/example/ui/NotificationService;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static final checkAndNotifyMessages$lambda$5(Ljava/lang/String;Landroid/content/Context;Lcom/example/data/Message;Lcom/google/firebase/firestore/DocumentSnapshot;)Lkotlin/Unit;
    .locals 11

    .line 45
    const-class v0, Lcom/example/data/User;

    invoke-virtual {p3, v0}, Lcom/google/firebase/firestore/DocumentSnapshot;->toObject(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/example/data/User;

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    .line 46
    invoke-virtual {p3}, Lcom/example/data/User;->getDisplayName()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    move-object v2, v1

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-nez v1, :cond_2

    :cond_1
    const-string v1, "@"

    const/4 v2, 0x2

    invoke-static {p0, v1, v0, v2, v0}, Lkotlin/text/StringsKt;->substringBefore$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type java.lang.String"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v4}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "toUpperCase(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    const-string v3, "substring(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_2
    move-object v6, v1

    .line 47
    sget-object v2, Lcom/example/ui/NotificationHelper;->INSTANCE:Lcom/example/ui/NotificationHelper;

    .line 49
    invoke-virtual {p2}, Lcom/example/data/Message;->getBookId()Ljava/lang/String;

    move-result-object v4

    .line 52
    invoke-virtual {p2}, Lcom/example/data/Message;->getContent()Ljava/lang/String;

    move-result-object v7

    if-eqz p3, :cond_3

    .line 53
    invoke-virtual {p3}, Lcom/example/data/User;->getProfilePicBase64()Ljava/lang/String;

    move-result-object v0

    :cond_3
    move-object v8, v0

    .line 54
    invoke-virtual {p2}, Lcom/example/data/Message;->getTimestamp()J

    move-result-wide v9

    move-object v5, p0

    move-object v3, p1

    .line 47
    invoke-virtual/range {v2 .. v10}, Lcom/example/ui/NotificationHelper;->showChatNotification(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 56
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method static final checkAndNotifyMessages$lambda$6(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 44
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method static final checkAndNotifyMessages$lambda$8(Ljava/lang/String;Landroid/content/Context;Lcom/example/data/Message;Ljava/lang/Exception;)V
    .locals 11

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x0

    const/4 v0, 0x2

    .line 58
    const-string v1, "@"

    invoke-static {p0, v1, p3, v0, p3}, Lkotlin/text/StringsKt;->substringBefore$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    move-object v0, p3

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {p3, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type java.lang.String"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "toUpperCase(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p3, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p3

    const-string v1, "substring(...)"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    :cond_0
    move-object v4, p3

    .line 59
    sget-object v0, Lcom/example/ui/NotificationHelper;->INSTANCE:Lcom/example/ui/NotificationHelper;

    .line 61
    invoke-virtual {p2}, Lcom/example/data/Message;->getBookId()Ljava/lang/String;

    move-result-object v2

    .line 64
    invoke-virtual {p2}, Lcom/example/data/Message;->getContent()Ljava/lang/String;

    move-result-object v5

    .line 65
    invoke-virtual {p2}, Lcom/example/data/Message;->getTimestamp()J

    move-result-wide v7

    const/16 v9, 0x20

    const/4 v10, 0x0

    const/4 v6, 0x0

    move-object v3, p0

    move-object v1, p1

    .line 59
    invoke-static/range {v0 .. v10}, Lcom/example/ui/NotificationHelper;->showChatNotification$default(Lcom/example/ui/NotificationHelper;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final checkAndNotifyBooks(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/example/data/Book;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "context"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "books"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_d

    .line 87
    :cond_0
    sget-boolean v2, Lcom/example/ui/NotificationService;->isBooksInitialized:Z

    const/4 v3, 0x1

    if-nez v2, :cond_1

    .line 88
    sput-boolean v3, Lcom/example/ui/NotificationService;->isBooksInitialized:Z

    .line 89
    move-object v0, v1

    check-cast v0, Ljava/lang/Iterable;

    .line 197
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_18

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/example/data/Book;

    .line 90
    sget-object v2, Lcom/example/ui/NotificationService;->lastKnownBookStatuses:Ljava/util/concurrent/ConcurrentHashMap;

    check-cast v2, Ljava/util/Map;

    invoke-virtual {v1}, Lcom/example/data/Book;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/example/data/Book;->getStatus()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 95
    :cond_1
    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/CharSequence;

    if-eqz v2, :cond_18

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_d

    .line 96
    :cond_2
    invoke-static {v2}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "toLowerCase(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    sget-wide v4, Lcom/example/ui/NotificationService;->appStartTime:J

    const-wide/32 v6, 0x493e0

    sub-long/2addr v4, v6

    .line 99
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_18

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/example/data/Book;

    .line 100
    sget-object v7, Lcom/example/ui/NotificationService;->lastKnownBookStatuses:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v6}, Lcom/example/data/Book;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    .line 101
    invoke-virtual {v6}, Lcom/example/data/Book;->getStatus()Ljava/lang/String;

    move-result-object v9

    .line 103
    invoke-virtual {v6}, Lcom/example/data/Book;->getOwnerName()Ljava/lang/String;

    move-result-object v10

    check-cast v10, Ljava/lang/CharSequence;

    invoke-static {v10}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v2, v3}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v10

    .line 104
    invoke-virtual {v6}, Lcom/example/data/Book;->getBorrowerName()Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_3

    check-cast v11, Ljava/lang/CharSequence;

    invoke-static {v11}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_3

    invoke-static {v11, v2, v3}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v11

    if-ne v11, v3, :cond_3

    goto :goto_2

    .line 105
    :cond_3
    invoke-virtual {v6}, Lcom/example/data/Book;->getRequestedByName()Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_4

    check-cast v11, Ljava/lang/CharSequence;

    invoke-static {v11}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_4

    invoke-static {v11, v2, v3}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v11

    if-ne v11, v3, :cond_4

    :goto_2
    move v11, v3

    goto :goto_3

    :cond_4
    const/4 v11, 0x0

    .line 107
    :goto_3
    const-string v13, "substring(...)"

    const-string v14, "toUpperCase(...)"

    const-string v15, "null cannot be cast to non-null type java.lang.String"

    const-string v3, "@"

    const-string v12, "\'"

    move-object/from16 p3, v1

    const/4 v1, 0x0

    if-nez v8, :cond_7

    .line 109
    check-cast v7, Ljava/util/Map;

    invoke-virtual {v6}, Lcom/example/data/Book;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v7, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-nez v10, :cond_17

    .line 110
    invoke-virtual {v6}, Lcom/example/data/Book;->getTimestamp()J

    move-result-wide v7

    cmp-long v7, v7, v4

    if-ltz v7, :cond_17

    .line 111
    invoke-virtual {v6}, Lcom/example/data/Book;->getOwnerDisplayName()Ljava/lang/String;

    move-result-object v7

    check-cast v7, Ljava/lang/CharSequence;

    invoke-static {v7}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_5

    invoke-virtual {v6}, Lcom/example/data/Book;->getOwnerDisplayName()Ljava/lang/String;

    move-result-object v1

    goto :goto_4

    :cond_5
    invoke-virtual {v6}, Lcom/example/data/Book;->getOwnerName()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x2

    invoke-static {v7, v3, v1, v8, v1}, Lkotlin/text/StringsKt;->substringBefore$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/lang/CharSequence;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-lez v3, :cond_6

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v7, 0x0

    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    invoke-static {v7}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v7, v8}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Ljava/lang/CharSequence;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    const/4 v7, 0x1

    invoke-virtual {v1, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 112
    :cond_6
    :goto_4
    sget-object v3, Lcom/example/ui/NotificationHelper;->INSTANCE:Lcom/example/ui/NotificationHelper;

    .line 115
    invoke-virtual {v6}, Lcom/example/data/Book;->getTitle()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "\' by "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v6, " was just added to BookXchange!"

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 112
    const-string v6, "New Book Added!"

    invoke-virtual {v3, v0, v6, v1}, Lcom/example/ui/NotificationHelper;->showNotification(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_b

    .line 118
    :cond_7
    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v17

    if-nez v17, :cond_17

    .line 120
    check-cast v7, Ljava/util/Map;

    invoke-virtual {v6}, Lcom/example/data/Book;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v1, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    move-result v1

    const-string v7, "LENT"

    move/from16 v18, v1

    const-string v1, "BORROWED"

    move-object/from16 v19, v2

    const-string v2, "PENDING_RETURN"

    sparse-switch v18, :sswitch_data_0

    :goto_5
    const/4 v7, 0x1

    goto/16 :goto_a

    :sswitch_0
    const-string v3, "AVAILABLE"

    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    goto/16 :goto_9

    :cond_8
    const/4 v3, 0x3

    .line 168
    new-array v3, v3, [Ljava/lang/String;

    const/4 v9, 0x0

    aput-object v2, v3, v9

    const/4 v2, 0x1

    aput-object v1, v3, v2

    const/16 v16, 0x2

    aput-object v7, v3, v16

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_16

    .line 169
    sget-object v1, Lcom/example/ui/NotificationHelper;->INSTANCE:Lcom/example/ui/NotificationHelper;

    .line 172
    invoke-virtual {v6}, Lcom/example/data/Book;->getTitle()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\' return has been verified and completed! Community credits updated."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 169
    const-string v3, "Return Completed! \u2728"

    invoke-virtual {v1, v0, v3, v2}, Lcom/example/ui/NotificationHelper;->showNotification(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    .line 121
    :sswitch_1
    invoke-virtual {v9, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    goto/16 :goto_9

    :sswitch_2
    const-string v1, "REQUESTED"

    invoke-virtual {v9, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    goto/16 :goto_9

    :cond_9
    if-eqz v10, :cond_16

    .line 124
    invoke-virtual {v6}, Lcom/example/data/Book;->getRequestedByName()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_b

    const/4 v2, 0x0

    const/4 v8, 0x2

    invoke-static {v1, v3, v2, v8, v2}, Lkotlin/text/StringsKt;->substringBefore$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_b

    move-object v2, v1

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_a

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v7, 0x0

    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v7}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v7, 0x1

    invoke-virtual {v1, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_a
    if-nez v1, :cond_c

    :cond_b
    const-string v1, "A reader"

    .line 125
    :cond_c
    sget-object v2, Lcom/example/ui/NotificationHelper;->INSTANCE:Lcom/example/ui/NotificationHelper;

    .line 128
    invoke-virtual {v6}, Lcom/example/data/Book;->getTitle()Ljava/lang/String;

    move-result-object v3

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v6, " requested to borrow \'"

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 125
    const-string v3, "Book Requested! \ud83d\udcd6"

    invoke-virtual {v2, v0, v3, v1}, Lcom/example/ui/NotificationHelper;->showNotification(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_9

    .line 121
    :sswitch_3
    const-string v1, "PENDING_TRANSFER"

    invoke-virtual {v9, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    goto/16 :goto_9

    :sswitch_4
    invoke-virtual {v9, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    goto/16 :goto_9

    :cond_d
    if-eqz v11, :cond_e

    .line 144
    sget-object v1, Lcom/example/ui/NotificationHelper;->INSTANCE:Lcom/example/ui/NotificationHelper;

    .line 147
    invoke-virtual {v6}, Lcom/example/data/Book;->getTitle()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\' is now in your active reads. Happy reading!"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 144
    const-string v3, "Handover Complete! \ud83d\udcda"

    invoke-virtual {v1, v0, v3, v2}, Lcom/example/ui/NotificationHelper;->showNotification(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_9

    :cond_e
    if-eqz v10, :cond_16

    .line 150
    sget-object v1, Lcom/example/ui/NotificationHelper;->INSTANCE:Lcom/example/ui/NotificationHelper;

    .line 153
    invoke-virtual {v6}, Lcom/example/data/Book;->getTitle()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, "Handover complete for \'"

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\'."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 150
    const-string v3, "Book Lent Out! \ud83e\udd1d"

    invoke-virtual {v1, v0, v3, v2}, Lcom/example/ui/NotificationHelper;->showNotification(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_9

    .line 121
    :sswitch_5
    const-string v1, "PENDING_RECEIPT"

    invoke-virtual {v9, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    goto/16 :goto_9

    :cond_f
    if-eqz v11, :cond_16

    .line 134
    invoke-virtual {v6}, Lcom/example/data/Book;->getOwnerDisplayName()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_10

    invoke-virtual {v6}, Lcom/example/data/Book;->getOwnerDisplayName()Ljava/lang/String;

    move-result-object v1

    goto :goto_6

    :cond_10
    invoke-virtual {v6}, Lcom/example/data/Book;->getOwnerName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v8, 0x2

    invoke-static {v1, v3, v2, v8, v2}, Lkotlin/text/StringsKt;->substringBefore$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_11

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v7, 0x0

    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v7}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v7, 0x1

    invoke-virtual {v1, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 135
    :cond_11
    :goto_6
    sget-object v2, Lcom/example/ui/NotificationHelper;->INSTANCE:Lcom/example/ui/NotificationHelper;

    .line 138
    invoke-virtual {v6}, Lcom/example/data/Book;->getTitle()Ljava/lang/String;

    move-result-object v3

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v6, " accepted your request for \'"

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, "\'. Tap to coordinate handover."

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 135
    const-string v3, "Request Accepted! \ud83c\udf89"

    invoke-virtual {v2, v0, v3, v1}, Lcom/example/ui/NotificationHelper;->showNotification(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_9

    .line 121
    :sswitch_6
    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    goto/16 :goto_9

    :cond_12
    if-eqz v10, :cond_16

    .line 159
    invoke-virtual {v6}, Lcom/example/data/Book;->getBorrowerName()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_14

    const/4 v2, 0x0

    const/4 v8, 0x2

    invoke-static {v1, v3, v2, v8, v2}, Lkotlin/text/StringsKt;->substringBefore$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_14

    move-object v2, v1

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_13

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v7, 0x0

    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v7}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v7, 0x1

    invoke-virtual {v1, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_7

    :cond_13
    const/4 v7, 0x1

    :goto_7
    if-nez v1, :cond_15

    goto :goto_8

    :cond_14
    const/4 v7, 0x1

    :goto_8
    const-string v1, "Borrower"

    .line 160
    :cond_15
    sget-object v2, Lcom/example/ui/NotificationHelper;->INSTANCE:Lcom/example/ui/NotificationHelper;

    .line 163
    invoke-virtual {v6}, Lcom/example/data/Book;->getTitle()Ljava/lang/String;

    move-result-object v3

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v6, " has initiated return for \'"

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, "\'. Tap to inspect & confirm receipt."

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 160
    const-string v3, "Return Initiated \ud83d\udce6"

    invoke-virtual {v2, v0, v3, v1}, Lcom/example/ui/NotificationHelper;->showNotification(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_a

    :cond_16
    :goto_9
    move-object/from16 v1, p3

    move-object/from16 v2, v19

    goto :goto_c

    :goto_a
    move-object/from16 v1, p3

    move v3, v7

    move-object/from16 v2, v19

    goto/16 :goto_1

    :cond_17
    :goto_b
    move-object/from16 v1, p3

    :goto_c
    const/4 v3, 0x1

    goto/16 :goto_1

    :cond_18
    :goto_d
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x65f0ab08 -> :sswitch_6
        -0x591bacb0 -> :sswitch_5
        -0x545002ac -> :sswitch_4
        -0x4dcd064d -> :sswitch_3
        -0x308b58b2 -> :sswitch_2
        0x2398ff -> :sswitch_1
        0x7a599aa9 -> :sswitch_0
    .end sparse-switch
.end method

.method public final checkAndNotifyMessages(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/example/data/Message;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string p0, "context"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "messages"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    check-cast p3, Ljava/lang/CharSequence;

    if-eqz p3, :cond_8

    invoke-static {p3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto/16 :goto_4

    .line 19
    :cond_0
    invoke-static {p3}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    sget-object p3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, p3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string p3, "toLowerCase(...)"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    sget-boolean p3, Lcom/example/ui/NotificationService;->isMessagesInitialized:Z

    const/16 v0, 0xa

    const/4 v1, 0x1

    if-nez p3, :cond_2

    .line 23
    sput-boolean v1, Lcom/example/ui/NotificationService;->isMessagesInitialized:Z

    .line 24
    sget-object p0, Lcom/example/ui/NotificationService;->lastMessageIds:Ljava/util/Set;

    check-cast p2, Ljava/lang/Iterable;

    .line 186
    new-instance p1, Ljava/util/ArrayList;

    invoke-static {p2, v0}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result p3

    invoke-direct {p1, p3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast p1, Ljava/util/Collection;

    .line 187
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    .line 188
    check-cast p3, Lcom/example/data/Message;

    .line 24
    invoke-virtual {p3}, Lcom/example/data/Message;->getId()Ljava/lang/String;

    move-result-object p3

    .line 188
    invoke-interface {p1, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 189
    :cond_1
    check-cast p1, Ljava/util/List;

    .line 186
    check-cast p1, Ljava/util/Collection;

    .line 24
    invoke-interface {p0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-void

    .line 28
    :cond_2
    check-cast p2, Ljava/lang/Iterable;

    .line 190
    new-instance p3, Ljava/util/ArrayList;

    invoke-static {p2, v0}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p3, v0}, Ljava/util/ArrayList;-><init>(I)V

    check-cast p3, Ljava/util/Collection;

    .line 191
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 192
    check-cast v2, Lcom/example/data/Message;

    .line 28
    invoke-virtual {v2}, Lcom/example/data/Message;->getId()Ljava/lang/String;

    move-result-object v2

    .line 192
    invoke-interface {p3, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 193
    :cond_3
    check-cast p3, Ljava/util/List;

    .line 190
    check-cast p3, Ljava/lang/Iterable;

    .line 28
    invoke-static {p3}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p3

    .line 29
    sget-object v0, Lcom/example/ui/NotificationService;->lastMessageIds:Ljava/util/Set;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {p3, v0}, Lkotlin/collections/SetsKt;->minus(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    .line 30
    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_8

    .line 32
    sget-wide v2, Lcom/example/ui/NotificationService;->appStartTime:J

    const-wide/32 v4, 0x493e0

    sub-long/2addr v2, v4

    .line 194
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/Collection;

    .line 195
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_4
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/example/data/Message;

    .line 34
    invoke-virtual {v6}, Lcom/example/data/Message;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v0, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    .line 35
    invoke-virtual {v6}, Lcom/example/data/Message;->getReceiver()Ljava/lang/String;

    move-result-object v7

    check-cast v7, Ljava/lang/CharSequence;

    invoke-static {v7}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, p0, v1}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v7

    if-eqz v7, :cond_4

    .line 36
    invoke-virtual {v6}, Lcom/example/data/Message;->getSender()Ljava/lang/String;

    move-result-object v7

    check-cast v7, Ljava/lang/CharSequence;

    invoke-static {v7}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, p0, v1}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v7

    if-nez v7, :cond_4

    .line 37
    invoke-virtual {v6}, Lcom/example/data/Message;->getTimestamp()J

    move-result-wide v6

    cmp-long v6, v6, v2

    if-ltz v6, :cond_4

    .line 195
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 196
    :cond_5
    check-cast v4, Ljava/util/List;

    .line 40
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_7

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/example/data/Message;

    .line 41
    invoke-virtual {p2}, Lcom/example/data/Message;->getSender()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 42
    move-object v1, v0

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_6

    .line 43
    invoke-static {}, Lcom/google/firebase/firestore/FirebaseFirestore;->getInstance()Lcom/google/firebase/firestore/FirebaseFirestore;

    move-result-object v1

    const-string v2, "users"

    invoke-virtual {v1, v2}, Lcom/google/firebase/firestore/FirebaseFirestore;->collection(Ljava/lang/String;)Lcom/google/firebase/firestore/CollectionReference;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/firebase/firestore/CollectionReference;->document(Ljava/lang/String;)Lcom/google/firebase/firestore/DocumentReference;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/firebase/firestore/DocumentReference;->get()Lcom/google/android/gms/tasks/Task;

    move-result-object v1

    .line 44
    new-instance v2, Lcom/example/ui/NotificationService$$ExternalSyntheticLambda0;

    invoke-direct {v2, v0, p1, p2}, Lcom/example/ui/NotificationService$$ExternalSyntheticLambda0;-><init>(Ljava/lang/String;Landroid/content/Context;Lcom/example/data/Message;)V

    new-instance v3, Lcom/example/ui/NotificationService$$ExternalSyntheticLambda1;

    invoke-direct {v3, v2}, Lcom/example/ui/NotificationService$$ExternalSyntheticLambda1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v3}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object v1

    .line 57
    new-instance v2, Lcom/example/ui/NotificationService$$ExternalSyntheticLambda2;

    invoke-direct {v2, v0, p1, p2}, Lcom/example/ui/NotificationService$$ExternalSyntheticLambda2;-><init>(Ljava/lang/String;Landroid/content/Context;Lcom/example/data/Message;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object p2

    .line 44
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    goto :goto_3

    .line 69
    :cond_6
    sget-object v0, Lcom/example/ui/NotificationHelper;->INSTANCE:Lcom/example/ui/NotificationHelper;

    .line 71
    invoke-virtual {p2}, Lcom/example/data/Message;->getBookId()Ljava/lang/String;

    move-result-object v2

    .line 74
    invoke-virtual {p2}, Lcom/example/data/Message;->getContent()Ljava/lang/String;

    move-result-object v5

    .line 75
    invoke-virtual {p2}, Lcom/example/data/Message;->getTimestamp()J

    move-result-wide v7

    const/16 v9, 0x20

    const/4 v10, 0x0

    .line 69
    const-string v3, "reader"

    const-string v4, "Book Reader"

    const/4 v6, 0x0

    move-object v1, p1

    invoke-static/range {v0 .. v10}, Lcom/example/ui/NotificationHelper;->showChatNotification$default(Lcom/example/ui/NotificationHelper;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/Object;)V

    goto :goto_3

    .line 79
    :cond_7
    sget-object p0, Lcom/example/ui/NotificationService;->lastMessageIds:Ljava/util/Set;

    check-cast p3, Ljava/util/Collection;

    invoke-interface {p0, p3}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_8
    :goto_4
    return-void
.end method

.method public final markInitialized()V
    .locals 0

    return-void
.end method
