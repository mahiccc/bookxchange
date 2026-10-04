.class final Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$1$1$5$2$1;
.super Ljava/lang/Object;
.source "DashboardScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/screens/DashboardScreenKt;->DashboardScreen(Ljava/util/List;Ljava/lang/String;Lcom/example/ui/BookViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/String;",
        "Lkotlin/Unit;",
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
.field public static final INSTANCE:Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$1$1$5$2$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$1$1$5$2$1;

    invoke-direct {v0}, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$1$1$5$2$1;-><init>()V

    sput-object v0, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$1$1$5$2$1;->INSTANCE:Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$1$1$5$2$1;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 963
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/example/ui/screens/DashboardScreenKt$DashboardScreen$32$3$4$1$1$5$2$1;->invoke(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke(Ljava/lang/String;)V
    .locals 0

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
