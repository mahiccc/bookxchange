.class final Lcom/example/ui/screens/ProfileScreenKt$ProfileScreen$8$1$1$12$1$1$1;
.super Ljava/lang/Object;
.source "ProfileScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/screens/ProfileScreenKt;->ProfileScreen(Ljava/util/List;Ljava/lang/String;Lcom/example/ui/BookViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic $activeDetailsBook$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/example/data/Book;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $book:Lcom/example/data/Book;


# direct methods
.method constructor <init>(Lcom/example/data/Book;Landroidx/compose/runtime/MutableState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/example/data/Book;",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/example/data/Book;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/screens/ProfileScreenKt$ProfileScreen$8$1$1$12$1$1$1;->$book:Lcom/example/data/Book;

    iput-object p2, p0, Lcom/example/ui/screens/ProfileScreenKt$ProfileScreen$8$1$1$12$1$1$1;->$activeDetailsBook$delegate:Landroidx/compose/runtime/MutableState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 419
    invoke-virtual {p0}, Lcom/example/ui/screens/ProfileScreenKt$ProfileScreen$8$1$1$12$1$1$1;->invoke()V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke()V
    .locals 1

    .line 419
    iget-object v0, p0, Lcom/example/ui/screens/ProfileScreenKt$ProfileScreen$8$1$1$12$1$1$1;->$activeDetailsBook$delegate:Landroidx/compose/runtime/MutableState;

    iget-object p0, p0, Lcom/example/ui/screens/ProfileScreenKt$ProfileScreen$8$1$1$12$1$1$1;->$book:Lcom/example/data/Book;

    invoke-static {v0, p0}, Lcom/example/ui/screens/ProfileScreenKt;->access$ProfileScreen$lambda$11(Landroidx/compose/runtime/MutableState;Lcom/example/data/Book;)V

    return-void
.end method
