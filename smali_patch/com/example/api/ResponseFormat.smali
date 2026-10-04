.class public final Lcom/example/api/ResponseFormat;
.super Ljava/lang/Object;
.source "GeminiApiService.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/example/api/ResponseFormat$$serializer;,
        Lcom/example/api/ResponseFormat$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB\u0013\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B%\u0008\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u0004\u0010\nJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\u000e\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J%\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0001\u00a2\u0006\u0002\u0008\u001cR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/example/api/ResponseFormat;",
        "",
        "text",
        "Lcom/example/api/ResponseFormatText;",
        "<init>",
        "(Lcom/example/api/ResponseFormatText;)V",
        "seen0",
        "",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(ILcom/example/api/ResponseFormatText;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "getText",
        "()Lcom/example/api/ResponseFormatText;",
        "component1",
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

.field public static final Companion:Lcom/example/api/ResponseFormat$Companion;


# instance fields
.field private final text:Lcom/example/api/ResponseFormatText;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/example/api/ResponseFormat$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/example/api/ResponseFormat$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/example/api/ResponseFormat;->Companion:Lcom/example/api/ResponseFormat$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/example/api/ResponseFormat;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/example/api/ResponseFormat;-><init>(Lcom/example/api/ResponseFormatText;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILcom/example/api/ResponseFormatText;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p1, p1, 0x1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/example/api/ResponseFormat;->text:Lcom/example/api/ResponseFormatText;

    return-void

    :cond_0
    iput-object p2, p0, Lcom/example/api/ResponseFormat;->text:Lcom/example/api/ResponseFormatText;

    return-void
.end method

.method public constructor <init>(Lcom/example/api/ResponseFormatText;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Lcom/example/api/ResponseFormat;->text:Lcom/example/api/ResponseFormatText;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/example/api/ResponseFormatText;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 43
    :cond_0
    invoke-direct {p0, p1}, Lcom/example/api/ResponseFormat;-><init>(Lcom/example/api/ResponseFormatText;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/example/api/ResponseFormat;Lcom/example/api/ResponseFormatText;ILjava/lang/Object;)Lcom/example/api/ResponseFormat;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/example/api/ResponseFormat;->text:Lcom/example/api/ResponseFormatText;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/example/api/ResponseFormat;->copy(Lcom/example/api/ResponseFormatText;)Lcom/example/api/ResponseFormat;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$app(Lcom/example/api/ResponseFormat;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 2
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const/4 v0, 0x0

    .line 42
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/example/api/ResponseFormat;->text:Lcom/example/api/ResponseFormatText;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lcom/example/api/ResponseFormatText$$serializer;->INSTANCE:Lcom/example/api/ResponseFormatText$$serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object p0, p0, Lcom/example/api/ResponseFormat;->text:Lcom/example/api/ResponseFormatText;

    invoke-interface {p1, p2, v0, v1, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()Lcom/example/api/ResponseFormatText;
    .locals 0

    iget-object p0, p0, Lcom/example/api/ResponseFormat;->text:Lcom/example/api/ResponseFormatText;

    return-object p0
.end method

.method public final copy(Lcom/example/api/ResponseFormatText;)Lcom/example/api/ResponseFormat;
    .locals 0

    new-instance p0, Lcom/example/api/ResponseFormat;

    invoke-direct {p0, p1}, Lcom/example/api/ResponseFormat;-><init>(Lcom/example/api/ResponseFormatText;)V

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/example/api/ResponseFormat;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/example/api/ResponseFormat;

    iget-object p0, p0, Lcom/example/api/ResponseFormat;->text:Lcom/example/api/ResponseFormatText;

    iget-object p1, p1, Lcom/example/api/ResponseFormat;->text:Lcom/example/api/ResponseFormatText;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getText()Lcom/example/api/ResponseFormatText;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/example/api/ResponseFormat;->text:Lcom/example/api/ResponseFormatText;

    return-object p0
.end method

.method public hashCode()I
    .locals 0

    iget-object p0, p0, Lcom/example/api/ResponseFormat;->text:Lcom/example/api/ResponseFormatText;

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-virtual {p0}, Lcom/example/api/ResponseFormatText;->hashCode()I

    move-result p0

    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget-object p0, p0, Lcom/example/api/ResponseFormat;->text:Lcom/example/api/ResponseFormatText;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ResponseFormat(text="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string v0, ")"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
