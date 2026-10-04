.class final Lcom/example/ui/screens/ProfileScreenKt$BookListSection$2$1$2$1$1;
.super Ljava/lang/Object;
.source "ProfileScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/screens/ProfileScreenKt;->BookListSection(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic $book:Lcom/example/data/Book;

.field final synthetic $onBookClick:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/example/data/Book;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/example/data/Book;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/example/data/Book;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/example/data/Book;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/screens/ProfileScreenKt$BookListSection$2$1$2$1$1;->$onBookClick:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/example/ui/screens/ProfileScreenKt$BookListSection$2$1$2$1$1;->$book:Lcom/example/data/Book;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 950
    invoke-virtual {p0}, Lcom/example/ui/screens/ProfileScreenKt$BookListSection$2$1$2$1$1;->invoke()V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke()V
    .locals 1

    .line 950
    iget-object v0, p0, Lcom/example/ui/screens/ProfileScreenKt$BookListSection$2$1$2$1$1;->$onBookClick:Lkotlin/jvm/functions/Function1;

    iget-object p0, p0, Lcom/example/ui/screens/ProfileScreenKt$BookListSection$2$1$2$1$1;->$book:Lcom/example/data/Book;

    invoke-interface {v0, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
