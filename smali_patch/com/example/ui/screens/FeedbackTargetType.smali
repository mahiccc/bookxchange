.class public final enum Lcom/example/ui/screens/FeedbackTargetType;
.super Ljava/lang/Enum;
.source "MutualFeedbackDialog.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/example/ui/screens/FeedbackTargetType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0005\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/example/ui/screens/FeedbackTargetType;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "BORROWER_TO_LENDER_AND_BOOK",
        "LENDER_TO_BORROWER",
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

.field private static final synthetic $VALUES:[Lcom/example/ui/screens/FeedbackTargetType;

.field public static final enum BORROWER_TO_LENDER_AND_BOOK:Lcom/example/ui/screens/FeedbackTargetType;

.field public static final enum LENDER_TO_BORROWER:Lcom/example/ui/screens/FeedbackTargetType;


# direct methods
.method private static final synthetic $values()[Lcom/example/ui/screens/FeedbackTargetType;
    .locals 2

    sget-object v0, Lcom/example/ui/screens/FeedbackTargetType;->BORROWER_TO_LENDER_AND_BOOK:Lcom/example/ui/screens/FeedbackTargetType;

    sget-object v1, Lcom/example/ui/screens/FeedbackTargetType;->LENDER_TO_BORROWER:Lcom/example/ui/screens/FeedbackTargetType;

    filled-new-array {v0, v1}, [Lcom/example/ui/screens/FeedbackTargetType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 30
    new-instance v0, Lcom/example/ui/screens/FeedbackTargetType;

    const-string v1, "BORROWER_TO_LENDER_AND_BOOK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/example/ui/screens/FeedbackTargetType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/example/ui/screens/FeedbackTargetType;->BORROWER_TO_LENDER_AND_BOOK:Lcom/example/ui/screens/FeedbackTargetType;

    .line 31
    new-instance v0, Lcom/example/ui/screens/FeedbackTargetType;

    const-string v1, "LENDER_TO_BORROWER"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/example/ui/screens/FeedbackTargetType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/example/ui/screens/FeedbackTargetType;->LENDER_TO_BORROWER:Lcom/example/ui/screens/FeedbackTargetType;

    invoke-static {}, Lcom/example/ui/screens/FeedbackTargetType;->$values()[Lcom/example/ui/screens/FeedbackTargetType;

    move-result-object v0

    sput-object v0, Lcom/example/ui/screens/FeedbackTargetType;->$VALUES:[Lcom/example/ui/screens/FeedbackTargetType;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/example/ui/screens/FeedbackTargetType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 29
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/example/ui/screens/FeedbackTargetType;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/example/ui/screens/FeedbackTargetType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/example/ui/screens/FeedbackTargetType;
    .locals 1

    const-class v0, Lcom/example/ui/screens/FeedbackTargetType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/example/ui/screens/FeedbackTargetType;

    return-object p0
.end method

.method public static values()[Lcom/example/ui/screens/FeedbackTargetType;
    .locals 1

    sget-object v0, Lcom/example/ui/screens/FeedbackTargetType;->$VALUES:[Lcom/example/ui/screens/FeedbackTargetType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/example/ui/screens/FeedbackTargetType;

    return-object v0
.end method
