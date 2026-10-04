.class public final Lcom/example/data/GenerateContentRequest;
.super Ljava/lang/Object;
.source "GeminiApiService.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/example/data/GenerateContentRequest$$serializer;,
        Lcom/example/data/GenerateContentRequest$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u0000 #2\u00020\u0001:\u0002\"#B!\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007B5\u0008\u0010\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u0006\u0010\u000cJ\u000f\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J%\u0010\u0013\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\tH\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J%\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0001\u00a2\u0006\u0002\u0008!R\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006$"
    }
    d2 = {
        "Lcom/example/data/GenerateContentRequest;",
        "",
        "contents",
        "",
        "Lcom/example/data/Content;",
        "systemInstruction",
        "<init>",
        "(Ljava/util/List;Lcom/example/data/Content;)V",
        "seen0",
        "",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(ILjava/util/List;Lcom/example/data/Content;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "getContents",
        "()Ljava/util/List;",
        "getSystemInstruction",
        "()Lcom/example/data/Content;",
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
.field private static final $childSerializers:[Lkotlin/Lazy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/Lazy<",
            "Lkotlinx/serialization/KSerializer<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/example/data/GenerateContentRequest$Companion;


# instance fields
.field private final contents:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/example/data/Content;",
            ">;"
        }
    .end annotation
.end field

.field private final systemInstruction:Lcom/example/data/Content;


# direct methods
.method public static synthetic $r8$lambda$j0A97UywgSBNxP1G261Gji3tAhA()Lkotlinx/serialization/KSerializer;
    .locals 1

    invoke-static {}, Lcom/example/data/GenerateContentRequest;->_childSerializers$_anonymous_()Lkotlinx/serialization/KSerializer;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/example/data/GenerateContentRequest$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/example/data/GenerateContentRequest$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/example/data/GenerateContentRequest;->Companion:Lcom/example/data/GenerateContentRequest$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/example/data/GenerateContentRequest;->$stable:I

    const/4 v0, 0x2

    .line 14
    new-array v0, v0, [Lkotlin/Lazy;

    sget-object v2, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    new-instance v3, Lcom/example/data/GenerateContentRequest$$ExternalSyntheticLambda0;

    invoke-direct {v3}, Lcom/example/data/GenerateContentRequest$$ExternalSyntheticLambda0;-><init>()V

    invoke-static {v2, v3}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v0, v3

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lcom/example/data/GenerateContentRequest;->$childSerializers:[Lkotlin/Lazy;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;Lcom/example/data/Content;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p4, :cond_0

    .line 14
    sget-object p4, Lcom/example/data/GenerateContentRequest$$serializer;->INSTANCE:Lcom/example/data/GenerateContentRequest$$serializer;

    invoke-virtual {p4}, Lcom/example/data/GenerateContentRequest$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object p4

    invoke-static {p1, v0, p4}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/example/data/GenerateContentRequest;->contents:Ljava/util/List;

    and-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/example/data/GenerateContentRequest;->systemInstruction:Lcom/example/data/Content;

    return-void

    :cond_1
    iput-object p3, p0, Lcom/example/data/GenerateContentRequest;->systemInstruction:Lcom/example/data/Content;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lcom/example/data/Content;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/example/data/Content;",
            ">;",
            "Lcom/example/data/Content;",
            ")V"
        }
    .end annotation

    const-string v0, "contents"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/example/data/GenerateContentRequest;->contents:Ljava/util/List;

    .line 17
    iput-object p2, p0, Lcom/example/data/GenerateContentRequest;->systemInstruction:Lcom/example/data/Content;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lcom/example/data/Content;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 15
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/example/data/GenerateContentRequest;-><init>(Ljava/util/List;Lcom/example/data/Content;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lkotlinx/serialization/KSerializer;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/example/data/Content$$serializer;->INSTANCE:Lcom/example/data/Content$$serializer;

    check-cast v1, Lkotlinx/serialization/KSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lkotlinx/serialization/KSerializer;)V

    check-cast v0, Lkotlinx/serialization/KSerializer;

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Lkotlin/Lazy;
    .locals 1

    .line 14
    sget-object v0, Lcom/example/data/GenerateContentRequest;->$childSerializers:[Lkotlin/Lazy;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/example/data/GenerateContentRequest;Ljava/util/List;Lcom/example/data/Content;ILjava/lang/Object;)Lcom/example/data/GenerateContentRequest;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/example/data/GenerateContentRequest;->contents:Ljava/util/List;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/example/data/GenerateContentRequest;->systemInstruction:Lcom/example/data/Content;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/example/data/GenerateContentRequest;->copy(Ljava/util/List;Lcom/example/data/Content;)Lcom/example/data/GenerateContentRequest;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$app(Lcom/example/data/GenerateContentRequest;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 3
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 14
    sget-object v0, Lcom/example/data/GenerateContentRequest;->$childSerializers:[Lkotlin/Lazy;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/example/data/GenerateContentRequest;->contents:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/example/data/GenerateContentRequest;->systemInstruction:Lcom/example/data/Content;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lcom/example/data/Content$$serializer;->INSTANCE:Lcom/example/data/Content$$serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object p0, p0, Lcom/example/data/GenerateContentRequest;->systemInstruction:Lcom/example/data/Content;

    invoke-interface {p1, p2, v0, v1, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/example/data/Content;",
            ">;"
        }
    .end annotation

    iget-object p0, p0, Lcom/example/data/GenerateContentRequest;->contents:Ljava/util/List;

    return-object p0
.end method

.method public final component2()Lcom/example/data/Content;
    .locals 0

    iget-object p0, p0, Lcom/example/data/GenerateContentRequest;->systemInstruction:Lcom/example/data/Content;

    return-object p0
.end method

.method public final copy(Ljava/util/List;Lcom/example/data/Content;)Lcom/example/data/GenerateContentRequest;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/example/data/Content;",
            ">;",
            "Lcom/example/data/Content;",
            ")",
            "Lcom/example/data/GenerateContentRequest;"
        }
    .end annotation

    const-string p0, "contents"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lcom/example/data/GenerateContentRequest;

    invoke-direct {p0, p1, p2}, Lcom/example/data/GenerateContentRequest;-><init>(Ljava/util/List;Lcom/example/data/Content;)V

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/example/data/GenerateContentRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/example/data/GenerateContentRequest;

    iget-object v1, p0, Lcom/example/data/GenerateContentRequest;->contents:Ljava/util/List;

    iget-object v3, p1, Lcom/example/data/GenerateContentRequest;->contents:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object p0, p0, Lcom/example/data/GenerateContentRequest;->systemInstruction:Lcom/example/data/Content;

    iget-object p1, p1, Lcom/example/data/GenerateContentRequest;->systemInstruction:Lcom/example/data/Content;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getContents()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/example/data/Content;",
            ">;"
        }
    .end annotation

    .line 16
    iget-object p0, p0, Lcom/example/data/GenerateContentRequest;->contents:Ljava/util/List;

    return-object p0
.end method

.method public final getSystemInstruction()Lcom/example/data/Content;
    .locals 0

    .line 17
    iget-object p0, p0, Lcom/example/data/GenerateContentRequest;->systemInstruction:Lcom/example/data/Content;

    return-object p0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/example/data/GenerateContentRequest;->contents:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object p0, p0, Lcom/example/data/GenerateContentRequest;->systemInstruction:Lcom/example/data/Content;

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/example/data/Content;->hashCode()I

    move-result p0

    :goto_0
    add-int/2addr v0, p0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/example/data/GenerateContentRequest;->contents:Ljava/util/List;

    iget-object p0, p0, Lcom/example/data/GenerateContentRequest;->systemInstruction:Lcom/example/data/Content;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "GenerateContentRequest(contents="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", systemInstruction="

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
