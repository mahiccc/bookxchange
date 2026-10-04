.class public final Lcom/example/ui/screens/LeaderboardEntry;
.super Ljava/lang/Object;
.source "EcoLeaderboardDialog.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0019\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003JO\u0010\u001d\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\u00052\u0008\u0008\u0002\u0010\n\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\u0008\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\"\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u000eR\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0010\u00a8\u0006#"
    }
    d2 = {
        "Lcom/example/ui/screens/LeaderboardEntry;",
        "",
        "rank",
        "",
        "name",
        "",
        "email",
        "trustScore",
        "booksCirculated",
        "tier",
        "badgeIcon",
        "<init>",
        "(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V",
        "getRank",
        "()I",
        "getName",
        "()Ljava/lang/String;",
        "getEmail",
        "getTrustScore",
        "getBooksCirculated",
        "getTier",
        "getBadgeIcon",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
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
.field public static final $stable:I


# instance fields
.field private final badgeIcon:Ljava/lang/String;

.field private final booksCirculated:I

.field private final email:Ljava/lang/String;

.field private final name:Ljava/lang/String;

.field private final rank:I

.field private final tier:Ljava/lang/String;

.field private final trustScore:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "email"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tier"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "badgeIcon"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput p1, p0, Lcom/example/ui/screens/LeaderboardEntry;->rank:I

    .line 28
    iput-object p2, p0, Lcom/example/ui/screens/LeaderboardEntry;->name:Ljava/lang/String;

    .line 29
    iput-object p3, p0, Lcom/example/ui/screens/LeaderboardEntry;->email:Ljava/lang/String;

    .line 30
    iput p4, p0, Lcom/example/ui/screens/LeaderboardEntry;->trustScore:I

    .line 31
    iput p5, p0, Lcom/example/ui/screens/LeaderboardEntry;->booksCirculated:I

    .line 32
    iput-object p6, p0, Lcom/example/ui/screens/LeaderboardEntry;->tier:Ljava/lang/String;

    .line 33
    iput-object p7, p0, Lcom/example/ui/screens/LeaderboardEntry;->badgeIcon:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/example/ui/screens/LeaderboardEntry;ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/example/ui/screens/LeaderboardEntry;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget p1, p0, Lcom/example/ui/screens/LeaderboardEntry;->rank:I

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/example/ui/screens/LeaderboardEntry;->name:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/example/ui/screens/LeaderboardEntry;->email:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget p4, p0, Lcom/example/ui/screens/LeaderboardEntry;->trustScore:I

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget p5, p0, Lcom/example/ui/screens/LeaderboardEntry;->booksCirculated:I

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/example/ui/screens/LeaderboardEntry;->tier:Ljava/lang/String;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/example/ui/screens/LeaderboardEntry;->badgeIcon:Ljava/lang/String;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move p6, p4

    move p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/example/ui/screens/LeaderboardEntry;->copy(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)Lcom/example/ui/screens/LeaderboardEntry;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 0

    iget p0, p0, Lcom/example/ui/screens/LeaderboardEntry;->rank:I

    return p0
.end method

.method public final component2()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/example/ui/screens/LeaderboardEntry;->name:Ljava/lang/String;

    return-object p0
.end method

.method public final component3()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/example/ui/screens/LeaderboardEntry;->email:Ljava/lang/String;

    return-object p0
.end method

.method public final component4()I
    .locals 0

    iget p0, p0, Lcom/example/ui/screens/LeaderboardEntry;->trustScore:I

    return p0
.end method

.method public final component5()I
    .locals 0

    iget p0, p0, Lcom/example/ui/screens/LeaderboardEntry;->booksCirculated:I

    return p0
.end method

.method public final component6()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/example/ui/screens/LeaderboardEntry;->tier:Ljava/lang/String;

    return-object p0
.end method

.method public final component7()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/example/ui/screens/LeaderboardEntry;->badgeIcon:Ljava/lang/String;

    return-object p0
.end method

.method public final copy(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)Lcom/example/ui/screens/LeaderboardEntry;
    .locals 8

    const-string p0, "name"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "email"

    invoke-static {p3, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "tier"

    invoke-static {p6, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "badgeIcon"

    invoke-static {p7, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/example/ui/screens/LeaderboardEntry;

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    move-object v6, p6

    move-object v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/example/ui/screens/LeaderboardEntry;-><init>(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/example/ui/screens/LeaderboardEntry;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/example/ui/screens/LeaderboardEntry;

    iget v1, p0, Lcom/example/ui/screens/LeaderboardEntry;->rank:I

    iget v3, p1, Lcom/example/ui/screens/LeaderboardEntry;->rank:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/example/ui/screens/LeaderboardEntry;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/example/ui/screens/LeaderboardEntry;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/example/ui/screens/LeaderboardEntry;->email:Ljava/lang/String;

    iget-object v3, p1, Lcom/example/ui/screens/LeaderboardEntry;->email:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/example/ui/screens/LeaderboardEntry;->trustScore:I

    iget v3, p1, Lcom/example/ui/screens/LeaderboardEntry;->trustScore:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/example/ui/screens/LeaderboardEntry;->booksCirculated:I

    iget v3, p1, Lcom/example/ui/screens/LeaderboardEntry;->booksCirculated:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/example/ui/screens/LeaderboardEntry;->tier:Ljava/lang/String;

    iget-object v3, p1, Lcom/example/ui/screens/LeaderboardEntry;->tier:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object p0, p0, Lcom/example/ui/screens/LeaderboardEntry;->badgeIcon:Ljava/lang/String;

    iget-object p1, p1, Lcom/example/ui/screens/LeaderboardEntry;->badgeIcon:Ljava/lang/String;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getBadgeIcon()Ljava/lang/String;
    .locals 0

    .line 33
    iget-object p0, p0, Lcom/example/ui/screens/LeaderboardEntry;->badgeIcon:Ljava/lang/String;

    return-object p0
.end method

.method public final getBooksCirculated()I
    .locals 0

    .line 31
    iget p0, p0, Lcom/example/ui/screens/LeaderboardEntry;->booksCirculated:I

    return p0
.end method

.method public final getEmail()Ljava/lang/String;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/example/ui/screens/LeaderboardEntry;->email:Ljava/lang/String;

    return-object p0
.end method

.method public final getName()Ljava/lang/String;
    .locals 0

    .line 28
    iget-object p0, p0, Lcom/example/ui/screens/LeaderboardEntry;->name:Ljava/lang/String;

    return-object p0
.end method

.method public final getRank()I
    .locals 0

    .line 27
    iget p0, p0, Lcom/example/ui/screens/LeaderboardEntry;->rank:I

    return p0
.end method

.method public final getTier()Ljava/lang/String;
    .locals 0

    .line 32
    iget-object p0, p0, Lcom/example/ui/screens/LeaderboardEntry;->tier:Ljava/lang/String;

    return-object p0
.end method

.method public final getTrustScore()I
    .locals 0

    .line 30
    iget p0, p0, Lcom/example/ui/screens/LeaderboardEntry;->trustScore:I

    return p0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/example/ui/screens/LeaderboardEntry;->rank:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/example/ui/screens/LeaderboardEntry;->name:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/example/ui/screens/LeaderboardEntry;->email:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/example/ui/screens/LeaderboardEntry;->trustScore:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/example/ui/screens/LeaderboardEntry;->booksCirculated:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/example/ui/screens/LeaderboardEntry;->tier:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object p0, p0, Lcom/example/ui/screens/LeaderboardEntry;->badgeIcon:Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget v0, p0, Lcom/example/ui/screens/LeaderboardEntry;->rank:I

    iget-object v1, p0, Lcom/example/ui/screens/LeaderboardEntry;->name:Ljava/lang/String;

    iget-object v2, p0, Lcom/example/ui/screens/LeaderboardEntry;->email:Ljava/lang/String;

    iget v3, p0, Lcom/example/ui/screens/LeaderboardEntry;->trustScore:I

    iget v4, p0, Lcom/example/ui/screens/LeaderboardEntry;->booksCirculated:I

    iget-object v5, p0, Lcom/example/ui/screens/LeaderboardEntry;->tier:Ljava/lang/String;

    iget-object p0, p0, Lcom/example/ui/screens/LeaderboardEntry;->badgeIcon:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "LeaderboardEntry(rank="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v6, ", name="

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", email="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", trustScore="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", booksCirculated="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", tier="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", badgeIcon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string v0, ")"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
