.class public final Lcom/example/api/GenerateContentRequest;
.super Ljava/lang/Object;
.source "GeminiApiService.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/example/api/GenerateContentRequest$$serializer;,
        Lcom/example/api/GenerateContentRequest$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u0000 ,2\u00020\u0001:\u0002+,B?\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\u0008\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\n\u0010\u000bBO\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0003\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\n\u0010\u0010J\u000f\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003JC\u0010\u001c\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\u0008\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00032\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020\rH\u00d6\u0001J\t\u0010!\u001a\u00020\"H\u00d6\u0001J%\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)H\u0001\u00a2\u0006\u0002\u0008*R\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006-"
    }
    d2 = {
        "Lcom/example/api/GenerateContentRequest;",
        "",
        "contents",
        "",
        "Lcom/example/api/Content;",
        "generationConfig",
        "Lcom/example/api/GenerationConfig;",
        "tools",
        "Lkotlinx/serialization/json/JsonObject;",
        "systemInstruction",
        "<init>",
        "(Ljava/util/List;Lcom/example/api/GenerationConfig;Ljava/util/List;Lcom/example/api/Content;)V",
        "seen0",
        "",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(ILjava/util/List;Lcom/example/api/GenerationConfig;Ljava/util/List;Lcom/example/api/Content;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "getContents",
        "()Ljava/util/List;",
        "getGenerationConfig",
        "()Lcom/example/api/GenerationConfig;",
        "getTools",
        "getSystemInstruction",
        "()Lcom/example/api/Content;",
        "component1",
        "component2",
        "component3",
        "component4",
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

.field public static final Companion:Lcom/example/api/GenerateContentRequest$Companion;


# instance fields
.field private final contents:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/example/api/Content;",
            ">;"
        }
    .end annotation
.end field

.field private final generationConfig:Lcom/example/api/GenerationConfig;

.field private final systemInstruction:Lcom/example/api/Content;

.field private final tools:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkotlinx/serialization/json/JsonObject;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$09CE8pq1AG1-JLaZWOf-LWpd_Wg()Lkotlinx/serialization/KSerializer;
    .locals 1

    invoke-static {}, Lcom/example/api/GenerateContentRequest;->_childSerializers$_anonymous_()Lkotlinx/serialization/KSerializer;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $r8$lambda$YT-VvkDFIfTybnOBVU9A6FEc7Uc()Lkotlinx/serialization/KSerializer;
    .locals 1

    invoke-static {}, Lcom/example/api/GenerateContentRequest;->_childSerializers$_anonymous_$0()Lkotlinx/serialization/KSerializer;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/example/api/GenerateContentRequest$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/example/api/GenerateContentRequest$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/example/api/GenerateContentRequest;->Companion:Lcom/example/api/GenerateContentRequest$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/example/api/GenerateContentRequest;->$stable:I

    const/4 v0, 0x4

    .line 17
    new-array v0, v0, [Lkotlin/Lazy;

    sget-object v2, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    new-instance v3, Lcom/example/api/GenerateContentRequest$$ExternalSyntheticLambda0;

    invoke-direct {v3}, Lcom/example/api/GenerateContentRequest$$ExternalSyntheticLambda0;-><init>()V

    invoke-static {v2, v3}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v0, v3

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v2, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    new-instance v3, Lcom/example/api/GenerateContentRequest$$ExternalSyntheticLambda1;

    invoke-direct {v3}, Lcom/example/api/GenerateContentRequest$$ExternalSyntheticLambda1;-><init>()V

    invoke-static {v2, v3}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v0, v3

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lcom/example/api/GenerateContentRequest;->$childSerializers:[Lkotlin/Lazy;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;Lcom/example/api/GenerationConfig;Ljava/util/List;Lcom/example/api/Content;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p6, :cond_0

    .line 17
    sget-object p6, Lcom/example/api/GenerateContentRequest$$serializer;->INSTANCE:Lcom/example/api/GenerateContentRequest$$serializer;

    invoke-virtual {p6}, Lcom/example/api/GenerateContentRequest$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/example/api/GenerateContentRequest;->contents:Ljava/util/List;

    and-int/lit8 p2, p1, 0x2

    const/4 p6, 0x0

    if-nez p2, :cond_1

    iput-object p6, p0, Lcom/example/api/GenerateContentRequest;->generationConfig:Lcom/example/api/GenerationConfig;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/example/api/GenerateContentRequest;->generationConfig:Lcom/example/api/GenerationConfig;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object p6, p0, Lcom/example/api/GenerateContentRequest;->tools:Ljava/util/List;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/example/api/GenerateContentRequest;->tools:Ljava/util/List;

    :goto_1
    and-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_3

    iput-object p6, p0, Lcom/example/api/GenerateContentRequest;->systemInstruction:Lcom/example/api/Content;

    return-void

    :cond_3
    iput-object p5, p0, Lcom/example/api/GenerateContentRequest;->systemInstruction:Lcom/example/api/Content;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lcom/example/api/GenerationConfig;Ljava/util/List;Lcom/example/api/Content;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/example/api/Content;",
            ">;",
            "Lcom/example/api/GenerationConfig;",
            "Ljava/util/List<",
            "Lkotlinx/serialization/json/JsonObject;",
            ">;",
            "Lcom/example/api/Content;",
            ")V"
        }
    .end annotation

    const-string v0, "contents"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/example/api/GenerateContentRequest;->contents:Ljava/util/List;

    .line 20
    iput-object p2, p0, Lcom/example/api/GenerateContentRequest;->generationConfig:Lcom/example/api/GenerationConfig;

    .line 21
    iput-object p3, p0, Lcom/example/api/GenerateContentRequest;->tools:Ljava/util/List;

    .line 22
    iput-object p4, p0, Lcom/example/api/GenerateContentRequest;->systemInstruction:Lcom/example/api/Content;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lcom/example/api/GenerationConfig;Ljava/util/List;Lcom/example/api/Content;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    move-object p4, v0

    .line 18
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/example/api/GenerateContentRequest;-><init>(Ljava/util/List;Lcom/example/api/GenerationConfig;Ljava/util/List;Lcom/example/api/Content;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lkotlinx/serialization/KSerializer;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/example/api/Content$$serializer;->INSTANCE:Lcom/example/api/Content$$serializer;

    check-cast v1, Lkotlinx/serialization/KSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lkotlinx/serialization/KSerializer;)V

    check-cast v0, Lkotlinx/serialization/KSerializer;

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lkotlinx/serialization/KSerializer;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/json/JsonObjectSerializer;->INSTANCE:Lkotlinx/serialization/json/JsonObjectSerializer;

    check-cast v1, Lkotlinx/serialization/KSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lkotlinx/serialization/KSerializer;)V

    check-cast v0, Lkotlinx/serialization/KSerializer;

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Lkotlin/Lazy;
    .locals 1

    .line 17
    sget-object v0, Lcom/example/api/GenerateContentRequest;->$childSerializers:[Lkotlin/Lazy;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/example/api/GenerateContentRequest;Ljava/util/List;Lcom/example/api/GenerationConfig;Ljava/util/List;Lcom/example/api/Content;ILjava/lang/Object;)Lcom/example/api/GenerateContentRequest;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/example/api/GenerateContentRequest;->contents:Ljava/util/List;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/example/api/GenerateContentRequest;->generationConfig:Lcom/example/api/GenerationConfig;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/example/api/GenerateContentRequest;->tools:Ljava/util/List;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/example/api/GenerateContentRequest;->systemInstruction:Lcom/example/api/Content;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/example/api/GenerateContentRequest;->copy(Ljava/util/List;Lcom/example/api/GenerationConfig;Ljava/util/List;Lcom/example/api/Content;)Lcom/example/api/GenerateContentRequest;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$app(Lcom/example/api/GenerateContentRequest;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 4
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 17
    sget-object v0, Lcom/example/api/GenerateContentRequest;->$childSerializers:[Lkotlin/Lazy;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    invoke-interface {v2}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    iget-object v3, p0, Lcom/example/api/GenerateContentRequest;->contents:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/example/api/GenerateContentRequest;->generationConfig:Lcom/example/api/GenerationConfig;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lcom/example/api/GenerationConfig$$serializer;->INSTANCE:Lcom/example/api/GenerationConfig$$serializer;

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    iget-object v3, p0, Lcom/example/api/GenerateContentRequest;->generationConfig:Lcom/example/api/GenerationConfig;

    invoke-interface {p1, p2, v1, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/example/api/GenerateContentRequest;->tools:Ljava/util/List;

    if-eqz v2, :cond_3

    :goto_1
    aget-object v0, v0, v1

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/example/api/GenerateContentRequest;->tools:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/example/api/GenerateContentRequest;->systemInstruction:Lcom/example/api/Content;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lcom/example/api/Content$$serializer;->INSTANCE:Lcom/example/api/Content$$serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object p0, p0, Lcom/example/api/GenerateContentRequest;->systemInstruction:Lcom/example/api/Content;

    invoke-interface {p1, p2, v0, v1, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_5
    return-void
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/example/api/Content;",
            ">;"
        }
    .end annotation

    iget-object p0, p0, Lcom/example/api/GenerateContentRequest;->contents:Ljava/util/List;

    return-object p0
.end method

.method public final component2()Lcom/example/api/GenerationConfig;
    .locals 0

    iget-object p0, p0, Lcom/example/api/GenerateContentRequest;->generationConfig:Lcom/example/api/GenerationConfig;

    return-object p0
.end method

.method public final component3()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkotlinx/serialization/json/JsonObject;",
            ">;"
        }
    .end annotation

    iget-object p0, p0, Lcom/example/api/GenerateContentRequest;->tools:Ljava/util/List;

    return-object p0
.end method

.method public final component4()Lcom/example/api/Content;
    .locals 0

    iget-object p0, p0, Lcom/example/api/GenerateContentRequest;->systemInstruction:Lcom/example/api/Content;

    return-object p0
.end method

.method public final copy(Ljava/util/List;Lcom/example/api/GenerationConfig;Ljava/util/List;Lcom/example/api/Content;)Lcom/example/api/GenerateContentRequest;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/example/api/Content;",
            ">;",
            "Lcom/example/api/GenerationConfig;",
            "Ljava/util/List<",
            "Lkotlinx/serialization/json/JsonObject;",
            ">;",
            "Lcom/example/api/Content;",
            ")",
            "Lcom/example/api/GenerateContentRequest;"
        }
    .end annotation

    const-string p0, "contents"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lcom/example/api/GenerateContentRequest;

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/example/api/GenerateContentRequest;-><init>(Ljava/util/List;Lcom/example/api/GenerationConfig;Ljava/util/List;Lcom/example/api/Content;)V

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/example/api/GenerateContentRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/example/api/GenerateContentRequest;

    iget-object v1, p0, Lcom/example/api/GenerateContentRequest;->contents:Ljava/util/List;

    iget-object v3, p1, Lcom/example/api/GenerateContentRequest;->contents:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/example/api/GenerateContentRequest;->generationConfig:Lcom/example/api/GenerationConfig;

    iget-object v3, p1, Lcom/example/api/GenerateContentRequest;->generationConfig:Lcom/example/api/GenerationConfig;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/example/api/GenerateContentRequest;->tools:Ljava/util/List;

    iget-object v3, p1, Lcom/example/api/GenerateContentRequest;->tools:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object p0, p0, Lcom/example/api/GenerateContentRequest;->systemInstruction:Lcom/example/api/Content;

    iget-object p1, p1, Lcom/example/api/GenerateContentRequest;->systemInstruction:Lcom/example/api/Content;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getContents()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/example/api/Content;",
            ">;"
        }
    .end annotation

    .line 19
    iget-object p0, p0, Lcom/example/api/GenerateContentRequest;->contents:Ljava/util/List;

    return-object p0
.end method

.method public final getGenerationConfig()Lcom/example/api/GenerationConfig;
    .locals 0

    .line 20
    iget-object p0, p0, Lcom/example/api/GenerateContentRequest;->generationConfig:Lcom/example/api/GenerationConfig;

    return-object p0
.end method

.method public final getSystemInstruction()Lcom/example/api/Content;
    .locals 0

    .line 22
    iget-object p0, p0, Lcom/example/api/GenerateContentRequest;->systemInstruction:Lcom/example/api/Content;

    return-object p0
.end method

.method public final getTools()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkotlinx/serialization/json/JsonObject;",
            ">;"
        }
    .end annotation

    .line 21
    iget-object p0, p0, Lcom/example/api/GenerateContentRequest;->tools:Ljava/util/List;

    return-object p0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/example/api/GenerateContentRequest;->contents:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/example/api/GenerateContentRequest;->generationConfig:Lcom/example/api/GenerationConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/example/api/GenerationConfig;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/example/api/GenerateContentRequest;->tools:Ljava/util/List;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object p0, p0, Lcom/example/api/GenerateContentRequest;->systemInstruction:Lcom/example/api/Content;

    if-nez p0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Lcom/example/api/Content;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/example/api/GenerateContentRequest;->contents:Ljava/util/List;

    iget-object v1, p0, Lcom/example/api/GenerateContentRequest;->generationConfig:Lcom/example/api/GenerationConfig;

    iget-object v2, p0, Lcom/example/api/GenerateContentRequest;->tools:Ljava/util/List;

    iget-object p0, p0, Lcom/example/api/GenerateContentRequest;->systemInstruction:Lcom/example/api/Content;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "GenerateContentRequest(contents="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", generationConfig="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", tools="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

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
