.class public final Lcom/example/api/SaleInfo;
.super Ljava/lang/Object;
.source "GoogleBooksApiService.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/example/api/SaleInfo$$serializer;,
        Lcom/example/api/SaleInfo$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u0000 !2\u00020\u0001:\u0002 !B\u001f\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006B/\u0008\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u0005\u0010\u000bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J!\u0010\u0011\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0008H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J%\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0001\u00a2\u0006\u0002\u0008\u001fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\r\u00a8\u0006\""
    }
    d2 = {
        "Lcom/example/api/SaleInfo;",
        "",
        "listPrice",
        "Lcom/example/api/Price;",
        "retailPrice",
        "<init>",
        "(Lcom/example/api/Price;Lcom/example/api/Price;)V",
        "seen0",
        "",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(ILcom/example/api/Price;Lcom/example/api/Price;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "getListPrice",
        "()Lcom/example/api/Price;",
        "getRetailPrice",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "",
        "write$Self",
        "",
        "self",
        "output",
        "Lkotlinx/serialization/encoding/CompositeEncoder;",
        "serialDesc",
        "Lkotlinx/serialization/descriptors/SerialDescriptor;",
        "write$Self$app",
        "$serializer",
        "Companion",
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

.annotation runtime Lkotlinx/serialization/Serializable;
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/example/api/SaleInfo$Companion;


# instance fields
.field private final listPrice:Lcom/example/api/Price;

.field private final retailPrice:Lcom/example/api/Price;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/example/api/SaleInfo$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/example/api/SaleInfo$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/example/api/SaleInfo;->Companion:Lcom/example/api/SaleInfo$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Lcom/example/api/SaleInfo;-><init>(Lcom/example/api/Price;Lcom/example/api/Price;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILcom/example/api/Price;Lcom/example/api/Price;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p4, p1, 0x1

    const/4 v0, 0x0

    if-nez p4, :cond_0

    iput-object v0, p0, Lcom/example/api/SaleInfo;->listPrice:Lcom/example/api/Price;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/example/api/SaleInfo;->listPrice:Lcom/example/api/Price;

    :goto_0
    and-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_1

    iput-object v0, p0, Lcom/example/api/SaleInfo;->retailPrice:Lcom/example/api/Price;

    return-void

    :cond_1
    iput-object p3, p0, Lcom/example/api/SaleInfo;->retailPrice:Lcom/example/api/Price;

    return-void
.end method

.method public constructor <init>(Lcom/example/api/Price;Lcom/example/api/Price;)V
    .locals 0

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    iput-object p1, p0, Lcom/example/api/SaleInfo;->listPrice:Lcom/example/api/Price;

    .line 74
    iput-object p2, p0, Lcom/example/api/SaleInfo;->retailPrice:Lcom/example/api/Price;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/example/api/Price;Lcom/example/api/Price;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    .line 72
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/example/api/SaleInfo;-><init>(Lcom/example/api/Price;Lcom/example/api/Price;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/example/api/SaleInfo;Lcom/example/api/Price;Lcom/example/api/Price;ILjava/lang/Object;)Lcom/example/api/SaleInfo;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/example/api/SaleInfo;->listPrice:Lcom/example/api/Price;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/example/api/SaleInfo;->retailPrice:Lcom/example/api/Price;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/example/api/SaleInfo;->copy(Lcom/example/api/Price;Lcom/example/api/Price;)Lcom/example/api/SaleInfo;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$app(Lcom/example/api/SaleInfo;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 3
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const/4 v0, 0x0

    .line 71
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/example/api/SaleInfo;->listPrice:Lcom/example/api/Price;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lcom/example/api/Price$$serializer;->INSTANCE:Lcom/example/api/Price$$serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/example/api/SaleInfo;->listPrice:Lcom/example/api/Price;

    invoke-interface {p1, p2, v0, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/example/api/SaleInfo;->retailPrice:Lcom/example/api/Price;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lcom/example/api/Price$$serializer;->INSTANCE:Lcom/example/api/Price$$serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object p0, p0, Lcom/example/api/SaleInfo;->retailPrice:Lcom/example/api/Price;

    invoke-interface {p1, p2, v0, v1, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final component1()Lcom/example/api/Price;
    .locals 0

    iget-object p0, p0, Lcom/example/api/SaleInfo;->listPrice:Lcom/example/api/Price;

    return-object p0
.end method

.method public final component2()Lcom/example/api/Price;
    .locals 0

    iget-object p0, p0, Lcom/example/api/SaleInfo;->retailPrice:Lcom/example/api/Price;

    return-object p0
.end method

.method public final copy(Lcom/example/api/Price;Lcom/example/api/Price;)Lcom/example/api/SaleInfo;
    .locals 0

    new-instance p0, Lcom/example/api/SaleInfo;

    invoke-direct {p0, p1, p2}, Lcom/example/api/SaleInfo;-><init>(Lcom/example/api/Price;Lcom/example/api/Price;)V

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/example/api/SaleInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/example/api/SaleInfo;

    iget-object v1, p0, Lcom/example/api/SaleInfo;->listPrice:Lcom/example/api/Price;

    iget-object v3, p1, Lcom/example/api/SaleInfo;->listPrice:Lcom/example/api/Price;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object p0, p0, Lcom/example/api/SaleInfo;->retailPrice:Lcom/example/api/Price;

    iget-object p1, p1, Lcom/example/api/SaleInfo;->retailPrice:Lcom/example/api/Price;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getListPrice()Lcom/example/api/Price;
    .locals 0

    .line 73
    iget-object p0, p0, Lcom/example/api/SaleInfo;->listPrice:Lcom/example/api/Price;

    return-object p0
.end method

.method public final getRetailPrice()Lcom/example/api/Price;
    .locals 0

    .line 74
    iget-object p0, p0, Lcom/example/api/SaleInfo;->retailPrice:Lcom/example/api/Price;

    return-object p0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/example/api/SaleInfo;->listPrice:Lcom/example/api/Price;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/example/api/Price;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object p0, p0, Lcom/example/api/SaleInfo;->retailPrice:Lcom/example/api/Price;

    if-nez p0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lcom/example/api/Price;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/example/api/SaleInfo;->listPrice:Lcom/example/api/Price;

    iget-object p0, p0, Lcom/example/api/SaleInfo;->retailPrice:Lcom/example/api/Price;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "SaleInfo(listPrice="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", retailPrice="

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
