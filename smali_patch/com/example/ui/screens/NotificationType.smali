.class public final enum Lcom/example/ui/screens/NotificationType;
.super Ljava/lang/Enum;
.source "NotificationsScreen.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/example/ui/screens/NotificationType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/example/ui/screens/NotificationType;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "OWNER_REQUESTED",
        "REQUESTER_ACCEPTED",
        "REQUESTER_CONFIRM_RECEIPT",
        "OWNER_PENDING_RETURN",
        "CHAT_MESSAGE",
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
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/example/ui/screens/NotificationType;

.field public static final enum CHAT_MESSAGE:Lcom/example/ui/screens/NotificationType;

.field public static final enum OWNER_PENDING_RETURN:Lcom/example/ui/screens/NotificationType;

.field public static final enum OWNER_REQUESTED:Lcom/example/ui/screens/NotificationType;

.field public static final enum REQUESTER_ACCEPTED:Lcom/example/ui/screens/NotificationType;

.field public static final enum REQUESTER_CONFIRM_RECEIPT:Lcom/example/ui/screens/NotificationType;


# direct methods
.method private static final synthetic $values()[Lcom/example/ui/screens/NotificationType;
    .locals 5

    sget-object v0, Lcom/example/ui/screens/NotificationType;->OWNER_REQUESTED:Lcom/example/ui/screens/NotificationType;

    sget-object v1, Lcom/example/ui/screens/NotificationType;->REQUESTER_ACCEPTED:Lcom/example/ui/screens/NotificationType;

    sget-object v2, Lcom/example/ui/screens/NotificationType;->REQUESTER_CONFIRM_RECEIPT:Lcom/example/ui/screens/NotificationType;

    sget-object v3, Lcom/example/ui/screens/NotificationType;->OWNER_PENDING_RETURN:Lcom/example/ui/screens/NotificationType;

    sget-object v4, Lcom/example/ui/screens/NotificationType;->CHAT_MESSAGE:Lcom/example/ui/screens/NotificationType;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/example/ui/screens/NotificationType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 279
    new-instance v0, Lcom/example/ui/screens/NotificationType;

    const-string v1, "OWNER_REQUESTED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/example/ui/screens/NotificationType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/example/ui/screens/NotificationType;->OWNER_REQUESTED:Lcom/example/ui/screens/NotificationType;

    .line 280
    new-instance v0, Lcom/example/ui/screens/NotificationType;

    const-string v1, "REQUESTER_ACCEPTED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/example/ui/screens/NotificationType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/example/ui/screens/NotificationType;->REQUESTER_ACCEPTED:Lcom/example/ui/screens/NotificationType;

    .line 281
    new-instance v0, Lcom/example/ui/screens/NotificationType;

    const-string v1, "REQUESTER_CONFIRM_RECEIPT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/example/ui/screens/NotificationType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/example/ui/screens/NotificationType;->REQUESTER_CONFIRM_RECEIPT:Lcom/example/ui/screens/NotificationType;

    .line 282
    new-instance v0, Lcom/example/ui/screens/NotificationType;

    const-string v1, "OWNER_PENDING_RETURN"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/example/ui/screens/NotificationType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/example/ui/screens/NotificationType;->OWNER_PENDING_RETURN:Lcom/example/ui/screens/NotificationType;

    .line 283
    new-instance v0, Lcom/example/ui/screens/NotificationType;

    const-string v1, "CHAT_MESSAGE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/example/ui/screens/NotificationType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/example/ui/screens/NotificationType;->CHAT_MESSAGE:Lcom/example/ui/screens/NotificationType;

    invoke-static {}, Lcom/example/ui/screens/NotificationType;->$values()[Lcom/example/ui/screens/NotificationType;

    move-result-object v0

    sput-object v0, Lcom/example/ui/screens/NotificationType;->$VALUES:[Lcom/example/ui/screens/NotificationType;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/example/ui/screens/NotificationType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 278
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/example/ui/screens/NotificationType;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/example/ui/screens/NotificationType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/example/ui/screens/NotificationType;
    .locals 1

    const-class v0, Lcom/example/ui/screens/NotificationType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/example/ui/screens/NotificationType;

    return-object p0
.end method

.method public static values()[Lcom/example/ui/screens/NotificationType;
    .locals 1

    sget-object v0, Lcom/example/ui/screens/NotificationType;->$VALUES:[Lcom/example/ui/screens/NotificationType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/example/ui/screens/NotificationType;

    return-object v0
.end method
