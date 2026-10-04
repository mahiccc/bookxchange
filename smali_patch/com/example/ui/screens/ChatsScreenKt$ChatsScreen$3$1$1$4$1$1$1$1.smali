.class final Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$3$1$1$4$1$1$1$1;
.super Ljava/lang/Object;
.source "ChatsScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/screens/ChatsScreenKt;->ChatsScreen(Lcom/example/ui/BookViewModel;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function0<",
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


# instance fields
.field final synthetic $filter:Ljava/lang/String;

.field final synthetic $selectedFilter$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/String;Landroidx/compose/runtime/MutableState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$3$1$1$4$1$1$1$1;->$filter:Ljava/lang/String;

    iput-object p2, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$3$1$1$4$1$1$1$1;->$selectedFilter$delegate:Landroidx/compose/runtime/MutableState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 269
    invoke-virtual {p0}, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$3$1$1$4$1$1$1$1;->invoke()V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke()V
    .locals 1

    .line 269
    iget-object v0, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$3$1$1$4$1$1$1$1;->$selectedFilter$delegate:Landroidx/compose/runtime/MutableState;

    iget-object p0, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$3$1$1$4$1$1$1$1;->$filter:Ljava/lang/String;

    invoke-static {v0, p0}, Lcom/example/ui/screens/ChatsScreenKt;->access$ChatsScreen$lambda$8(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    return-void
.end method
