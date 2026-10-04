.class public final synthetic Lcom/example/ui/screens/ChatScreenKt$$ExternalSyntheticLambda51;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Lcom/example/ui/BookViewModel;

.field public final synthetic f$1:Lcom/example/data/Book;

.field public final synthetic f$2:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lcom/example/ui/BookViewModel;Lcom/example/data/Book;Landroid/content/Context;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/ChatScreenKt$$ExternalSyntheticLambda51;->f$0:Lcom/example/ui/BookViewModel;

    iput-object p2, p0, Lcom/example/ui/screens/ChatScreenKt$$ExternalSyntheticLambda51;->f$1:Lcom/example/data/Book;

    iput-object p3, p0, Lcom/example/ui/screens/ChatScreenKt$$ExternalSyntheticLambda51;->f$2:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/ChatScreenKt$$ExternalSyntheticLambda51;->f$0:Lcom/example/ui/BookViewModel;

    iget-object v1, p0, Lcom/example/ui/screens/ChatScreenKt$$ExternalSyntheticLambda51;->f$1:Lcom/example/data/Book;

    iget-object p0, p0, Lcom/example/ui/screens/ChatScreenKt$$ExternalSyntheticLambda51;->f$2:Landroid/content/Context;

    invoke-static {v0, v1, p0}, Lcom/example/ui/screens/ChatScreenKt;->ChatScreen$lambda$272$lambda$271$lambda$199$lambda$198(Lcom/example/ui/BookViewModel;Lcom/example/data/Book;Landroid/content/Context;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
