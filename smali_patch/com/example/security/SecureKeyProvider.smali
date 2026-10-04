.class public final Lcom/example/security/SecureKeyProvider;
.super Ljava/lang/Object;
.source "SecureKeyProvider.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0015\n\u0002\u0008\n\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J(\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0008H\u0002J\u0008\u0010\u0016\u001a\u00020\u0005H\u0007J\u0008\u0010\u0017\u001a\u00020\u0005H\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/example/security/SecureKeyProvider;",
        "",
        "<init>",
        "()V",
        "cachedRemoteGeminiKey",
        "",
        "cachedRemoteGoogleBooksKey",
        "SEGMENT_ALPHA",
        "",
        "SEGMENT_BETA",
        "SEGMENT_GAMMA",
        "SEGMENT_DELTA",
        "MASK_A",
        "MASK_B",
        "MASK_C",
        "MASK_D",
        "decodeSegment",
        "data",
        "mult",
        "",
        "add",
        "mask",
        "getGeminiApiKey",
        "getGoogleBooksApiKey",
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

.field public static final INSTANCE:Lcom/example/security/SecureKeyProvider;

.field private static final MASK_A:[I

.field private static final MASK_B:[I

.field private static final MASK_C:[I

.field private static final MASK_D:[I

.field private static final SEGMENT_ALPHA:[I

.field private static final SEGMENT_BETA:[I

.field private static final SEGMENT_DELTA:[I

.field private static final SEGMENT_GAMMA:[I

.field private static cachedRemoteGeminiKey:Ljava/lang/String;

.field private static cachedRemoteGoogleBooksKey:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/example/security/SecureKeyProvider;

    invoke-direct {v0}, Lcom/example/security/SecureKeyProvider;-><init>()V

    sput-object v0, Lcom/example/security/SecureKeyProvider;->INSTANCE:Lcom/example/security/SecureKeyProvider;

    const/16 v0, 0xe

    .line 16
    new-array v1, v0, [I

    fill-array-data v1, :array_0

    sput-object v1, Lcom/example/security/SecureKeyProvider;->SEGMENT_ALPHA:[I

    .line 17
    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lcom/example/security/SecureKeyProvider;->SEGMENT_BETA:[I

    const/16 v0, 0xd

    .line 18
    new-array v0, v0, [I

    fill-array-data v0, :array_2

    sput-object v0, Lcom/example/security/SecureKeyProvider;->SEGMENT_GAMMA:[I

    const/16 v0, 0xc

    .line 19
    new-array v0, v0, [I

    fill-array-data v0, :array_3

    sput-object v0, Lcom/example/security/SecureKeyProvider;->SEGMENT_DELTA:[I

    const/16 v0, 0x3f

    const/16 v1, 0x91

    const/16 v2, 0x7a

    const/16 v3, 0x48

    .line 21
    filled-new-array {v2, v0, v1, v3}, [I

    move-result-object v0

    sput-object v0, Lcom/example/security/SecureKeyProvider;->MASK_A:[I

    const/16 v0, 0x1e

    const/16 v1, 0xd4

    const/16 v2, 0x5c

    const/16 v3, 0x82

    .line 22
    filled-new-array {v2, v3, v0, v1}, [I

    move-result-object v0

    sput-object v0, Lcom/example/security/SecureKeyProvider;->MASK_B:[I

    const/16 v0, 0x67

    const/16 v1, 0xf0

    const/16 v2, 0xb3

    const/16 v3, 0x29

    .line 23
    filled-new-array {v2, v0, v1, v3}, [I

    move-result-object v0

    sput-object v0, Lcom/example/security/SecureKeyProvider;->MASK_C:[I

    const/16 v0, 0xc5

    const/16 v1, 0x18

    const/16 v2, 0x41

    const/16 v3, 0x99

    .line 24
    filled-new-array {v2, v3, v0, v1}, [I

    move-result-object v0

    sput-object v0, Lcom/example/security/SecureKeyProvider;->MASK_D:[I

    .line 29
    :try_start_0
    invoke-static {}, Lcom/google/firebase/firestore/FirebaseFirestore;->getInstance()Lcom/google/firebase/firestore/FirebaseFirestore;

    move-result-object v0

    .line 30
    const-string v1, "app_config"

    invoke-virtual {v0, v1}, Lcom/google/firebase/firestore/FirebaseFirestore;->collection(Ljava/lang/String;)Lcom/google/firebase/firestore/CollectionReference;

    move-result-object v0

    .line 31
    const-string v1, "api_keys"

    invoke-virtual {v0, v1}, Lcom/google/firebase/firestore/CollectionReference;->document(Ljava/lang/String;)Lcom/google/firebase/firestore/DocumentReference;

    move-result-object v0

    .line 32
    new-instance v1, Lcom/example/security/SecureKeyProvider$$ExternalSyntheticLambda0;

    invoke-direct {v1}, Lcom/example/security/SecureKeyProvider$$ExternalSyntheticLambda0;-><init>()V

    invoke-virtual {v0, v1}, Lcom/google/firebase/firestore/DocumentReference;->addSnapshotListener(Lcom/google/firebase/firestore/EventListener;)Lcom/google/firebase/firestore/ListenerRegistration;

    move-result-object v0

    .line 28
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/16 v0, 0x8

    .line 45
    sput v0, Lcom/example/security/SecureKeyProvider;->$stable:I

    return-void

    :array_0
    .array-data 4
        0x30
        0x4c
        0x86
        0x59
        0x7f
        0x79
        0x56
        0xaa
        0x8f
        0xae
        0xa
        0x28
        0x23
        0x7a
    .end array-data

    :array_1
    .array-data 4
        0x20
        0xde
        0x10
        0xef
        0x44
        0x7c
        0xce
        0x48
        0x89
        0x65
        0xca
        0x75
        0x65
        0xef
    .end array-data

    :array_2
    .array-data 4
        0xc2
        0x31
        0xc4
        0x33
        0x65
        0x9d
        0x2b
        0x96
        0x3e
        0x1a
        0xe6
        0x14
        0x8c
    .end array-data

    :array_3
    .array-data 4
        0x59
        0x95
        0xc6
        0x9
        0x4f
        0x29
        0x2
        0xd7
        0xaa
        0x6a
        0x47
        0xaf
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static final _init_$lambda$0(Lcom/google/firebase/firestore/DocumentSnapshot;Lcom/google/firebase/firestore/FirebaseFirestoreException;)V
    .locals 2

    const/4 p1, 0x0

    if-eqz p0, :cond_0

    .line 33
    const-string v0, "gemini_api_key"

    invoke-virtual {p0, v0}, Lcom/google/firebase/firestore/DocumentSnapshot;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p1

    .line 34
    :goto_0
    check-cast v0, Ljava/lang/CharSequence;

    if-eqz v0, :cond_2

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    .line 35
    :cond_1
    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/example/security/SecureKeyProvider;->cachedRemoteGeminiKey:Ljava/lang/String;

    :cond_2
    :goto_1
    if-eqz p0, :cond_3

    .line 37
    const-string p1, "google_books_api_key"

    invoke-virtual {p0, p1}, Lcom/google/firebase/firestore/DocumentSnapshot;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 38
    :cond_3
    check-cast p1, Ljava/lang/CharSequence;

    if-eqz p1, :cond_5

    invoke-static {p1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_4

    goto :goto_2

    .line 39
    :cond_4
    invoke-static {p1}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    sput-object p0, Lcom/example/security/SecureKeyProvider;->cachedRemoteGoogleBooksKey:Ljava/lang/String;

    :cond_5
    :goto_2
    return-void
.end method

.method private final decodeSegment([III[I)Ljava/lang/String;
    .locals 5

    .line 48
    array-length p0, p1

    new-array p0, p0, [B

    .line 49
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 50
    array-length v2, p4

    rem-int v2, v1, v2

    aget v2, p4, v2

    mul-int v3, v1, p2

    add-int/2addr v3, p3

    and-int/lit16 v3, v3, 0xff

    .line 52
    aget v4, p1, v1

    xor-int/2addr v2, v4

    xor-int/2addr v2, v3

    int-to-byte v2, v2

    aput-byte v2, p0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 49
    :cond_0
    new-instance p1, Ljava/lang/String;

    .line 54
    sget-object p2, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {p1, p0, p2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object p1
.end method

.method public static final getGeminiApiKey()Ljava/lang/String;
    .locals 8
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 63
    sget-object v0, Lcom/example/security/SecureKeyProvider;->cachedRemoteGeminiKey:Ljava/lang/String;

    .line 64
    move-object v1, v0

    check-cast v1, Ljava/lang/CharSequence;

    if-eqz v1, :cond_1

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    .line 68
    :cond_1
    :goto_0
    sget-object v0, Lcom/example/security/SecureKeyProvider;->INSTANCE:Lcom/example/security/SecureKeyProvider;

    sget-object v1, Lcom/example/security/SecureKeyProvider;->SEGMENT_ALPHA:[I

    const/16 v2, 0xb

    sget-object v3, Lcom/example/security/SecureKeyProvider;->MASK_A:[I

    const/16 v4, 0x17

    invoke-direct {v0, v1, v4, v2, v3}, Lcom/example/security/SecureKeyProvider;->decodeSegment([III[I)Ljava/lang/String;

    move-result-object v1

    .line 69
    sget-object v2, Lcom/example/security/SecureKeyProvider;->SEGMENT_BETA:[I

    const/16 v3, 0x25

    sget-object v4, Lcom/example/security/SecureKeyProvider;->MASK_B:[I

    const/16 v5, 0x13

    invoke-direct {v0, v2, v5, v3, v4}, Lcom/example/security/SecureKeyProvider;->decodeSegment([III[I)Ljava/lang/String;

    move-result-object v2

    .line 70
    sget-object v3, Lcom/example/security/SecureKeyProvider;->SEGMENT_GAMMA:[I

    const/4 v4, 0x5

    sget-object v5, Lcom/example/security/SecureKeyProvider;->MASK_C:[I

    const/16 v6, 0x1f

    invoke-direct {v0, v3, v6, v4, v5}, Lcom/example/security/SecureKeyProvider;->decodeSegment([III[I)Ljava/lang/String;

    move-result-object v3

    .line 71
    sget-object v4, Lcom/example/security/SecureKeyProvider;->SEGMENT_DELTA:[I

    const/16 v5, 0x2b

    sget-object v6, Lcom/example/security/SecureKeyProvider;->MASK_D:[I

    const/16 v7, 0x11

    invoke-direct {v0, v4, v7, v5, v6}, Lcom/example/security/SecureKeyProvider;->decodeSegment([III[I)Ljava/lang/String;

    move-result-object v0

    .line 73
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final getGoogleBooksApiKey()Ljava/lang/String;
    .locals 2
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 82
    sget-object v0, Lcom/example/security/SecureKeyProvider;->cachedRemoteGoogleBooksKey:Ljava/lang/String;

    .line 83
    move-object v1, v0

    check-cast v1, Ljava/lang/CharSequence;

    if-eqz v1, :cond_1

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    .line 86
    :cond_1
    :goto_0
    invoke-static {}, Lcom/example/security/SecureKeyProvider;->getGeminiApiKey()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
