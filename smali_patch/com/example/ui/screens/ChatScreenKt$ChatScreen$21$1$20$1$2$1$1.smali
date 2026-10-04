.class final Lcom/example/ui/screens/ChatScreenKt$ChatScreen$21$1$20$1$2$1$1;
.super Ljava/lang/Object;
.source "ChatScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/screens/ChatScreenKt;->ChatScreen(Ljava/lang/String;Lcom/example/ui/BookViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/example/ui/screens/ChatScreenKt$ChatScreen$21$1$20$1$2$1$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$21$1$20$1$2$1$1;

    invoke-direct {v0}, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$21$1$20$1$2$1$1;-><init>()V

    sput-object v0, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$21$1$20$1$2$1$1;->INSTANCE:Lcom/example/ui/screens/ChatScreenKt$ChatScreen$21$1$20$1$2$1$1;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(I)Ljava/lang/Integer;
    .locals 0

    const/16 p0, 0x1e

    .line 1161
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1161
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/example/ui/screens/ChatScreenKt$ChatScreen$21$1$20$1$2$1$1;->invoke(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method
