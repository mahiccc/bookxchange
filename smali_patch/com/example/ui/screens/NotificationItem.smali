.class public final Lcom/example/ui/screens/NotificationItem;
.super Ljava/lang/Object;
.source "NotificationsScreen.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\tH\u00c6\u0003J;\u0010\u0019\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006 "
    }
    d2 = {
        "Lcom/example/ui/screens/NotificationItem;",
        "",
        "id",
        "",
        "title",
        "message",
        "book",
        "Lcom/example/data/Book;",
        "type",
        "Lcom/example/ui/screens/NotificationType;",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/data/Book;Lcom/example/ui/screens/NotificationType;)V",
        "getId",
        "()Ljava/lang/String;",
        "getTitle",
        "getMessage",
        "getBook",
        "()Lcom/example/data/Book;",
        "getType",
        "()Lcom/example/ui/screens/NotificationType;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final book:Lcom/example/data/Book;

.field private final id:Ljava/lang/String;

.field private final message:Ljava/lang/String;

.field private final title:Ljava/lang/String;

.field private final type:Lcom/example/ui/screens/NotificationType;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/data/Book;Lcom/example/ui/screens/NotificationType;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "book"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 270
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 271
    iput-object p1, p0, Lcom/example/ui/screens/NotificationItem;->id:Ljava/lang/String;

    .line 272
    iput-object p2, p0, Lcom/example/ui/screens/NotificationItem;->title:Ljava/lang/String;

    .line 273
    iput-object p3, p0, Lcom/example/ui/screens/NotificationItem;->message:Ljava/lang/String;

    .line 274
    iput-object p4, p0, Lcom/example/ui/screens/NotificationItem;->book:Lcom/example/data/Book;

    .line 275
    iput-object p5, p0, Lcom/example/ui/screens/NotificationItem;->type:Lcom/example/ui/screens/NotificationType;

    return-void
.end method

.method public static synthetic copy$default(Lcom/example/ui/screens/NotificationItem;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/data/Book;Lcom/example/ui/screens/NotificationType;ILjava/lang/Object;)Lcom/example/ui/screens/NotificationItem;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/example/ui/screens/NotificationItem;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/example/ui/screens/NotificationItem;->title:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/example/ui/screens/NotificationItem;->message:Ljava/lang/String;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/example/ui/screens/NotificationItem;->book:Lcom/example/data/Book;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/example/ui/screens/NotificationItem;->type:Lcom/example/ui/screens/NotificationType;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/example/ui/screens/NotificationItem;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/data/Book;Lcom/example/ui/screens/NotificationType;)Lcom/example/ui/screens/NotificationItem;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/example/ui/screens/NotificationItem;->id:Ljava/lang/String;

    return-object p0
.end method

.method public final component2()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/example/ui/screens/NotificationItem;->title:Ljava/lang/String;

    return-object p0
.end method

.method public final component3()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/example/ui/screens/NotificationItem;->message:Ljava/lang/String;

    return-object p0
.end method

.method public final component4()Lcom/example/data/Book;
    .locals 0

    iget-object p0, p0, Lcom/example/ui/screens/NotificationItem;->book:Lcom/example/data/Book;

    return-object p0
.end method

.method public final component5()Lcom/example/ui/screens/NotificationType;
    .locals 0

    iget-object p0, p0, Lcom/example/ui/screens/NotificationItem;->type:Lcom/example/ui/screens/NotificationType;

    return-object p0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/data/Book;Lcom/example/ui/screens/NotificationType;)Lcom/example/ui/screens/NotificationItem;
    .locals 6

    const-string p0, "id"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "title"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "message"

    invoke-static {p3, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "book"

    invoke-static {p4, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "type"

    invoke-static {p5, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/example/ui/screens/NotificationItem;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/example/ui/screens/NotificationItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/data/Book;Lcom/example/ui/screens/NotificationType;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/example/ui/screens/NotificationItem;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/example/ui/screens/NotificationItem;

    iget-object v1, p0, Lcom/example/ui/screens/NotificationItem;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/example/ui/screens/NotificationItem;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/example/ui/screens/NotificationItem;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/example/ui/screens/NotificationItem;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/example/ui/screens/NotificationItem;->message:Ljava/lang/String;

    iget-object v3, p1, Lcom/example/ui/screens/NotificationItem;->message:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/example/ui/screens/NotificationItem;->book:Lcom/example/data/Book;

    iget-object v3, p1, Lcom/example/ui/screens/NotificationItem;->book:Lcom/example/data/Book;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object p0, p0, Lcom/example/ui/screens/NotificationItem;->type:Lcom/example/ui/screens/NotificationType;

    iget-object p1, p1, Lcom/example/ui/screens/NotificationItem;->type:Lcom/example/ui/screens/NotificationType;

    if-eq p0, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getBook()Lcom/example/data/Book;
    .locals 0

    .line 274
    iget-object p0, p0, Lcom/example/ui/screens/NotificationItem;->book:Lcom/example/data/Book;

    return-object p0
.end method

.method public final getId()Ljava/lang/String;
    .locals 0

    .line 271
    iget-object p0, p0, Lcom/example/ui/screens/NotificationItem;->id:Ljava/lang/String;

    return-object p0
.end method

.method public final getMessage()Ljava/lang/String;
    .locals 0

    .line 273
    iget-object p0, p0, Lcom/example/ui/screens/NotificationItem;->message:Ljava/lang/String;

    return-object p0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 0

    .line 272
    iget-object p0, p0, Lcom/example/ui/screens/NotificationItem;->title:Ljava/lang/String;

    return-object p0
.end method

.method public final getType()Lcom/example/ui/screens/NotificationType;
    .locals 0

    .line 275
    iget-object p0, p0, Lcom/example/ui/screens/NotificationItem;->type:Lcom/example/ui/screens/NotificationType;

    return-object p0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/example/ui/screens/NotificationItem;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/example/ui/screens/NotificationItem;->title:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/example/ui/screens/NotificationItem;->message:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/example/ui/screens/NotificationItem;->book:Lcom/example/data/Book;

    invoke-virtual {v1}, Lcom/example/data/Book;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object p0, p0, Lcom/example/ui/screens/NotificationItem;->type:Lcom/example/ui/screens/NotificationType;

    invoke-virtual {p0}, Lcom/example/ui/screens/NotificationType;->hashCode()I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/example/ui/screens/NotificationItem;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/example/ui/screens/NotificationItem;->title:Ljava/lang/String;

    iget-object v2, p0, Lcom/example/ui/screens/NotificationItem;->message:Ljava/lang/String;

    iget-object v3, p0, Lcom/example/ui/screens/NotificationItem;->book:Lcom/example/data/Book;

    iget-object p0, p0, Lcom/example/ui/screens/NotificationItem;->type:Lcom/example/ui/screens/NotificationType;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "NotificationItem(id="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ", title="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", book="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string v0, ")"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
