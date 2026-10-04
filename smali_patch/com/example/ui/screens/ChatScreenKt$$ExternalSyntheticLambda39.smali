.class public final synthetic Lcom/example/ui/screens/ChatScreenKt$$ExternalSyntheticLambda39;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/example/data/Book;

.field public final synthetic f$1:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lcom/example/data/Book;Landroid/content/Context;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/ChatScreenKt$$ExternalSyntheticLambda39;->f$0:Lcom/example/data/Book;

    iput-object p2, p0, Lcom/example/ui/screens/ChatScreenKt$$ExternalSyntheticLambda39;->f$1:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/ChatScreenKt$$ExternalSyntheticLambda39;->f$0:Lcom/example/data/Book;

    iget-object p0, p0, Lcom/example/ui/screens/ChatScreenKt$$ExternalSyntheticLambda39;->f$1:Landroid/content/Context;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p0, p1, p2}, Lcom/example/ui/screens/ChatScreenKt;->ChatScreen$lambda$272$lambda$271$lambda$228(Lcom/example/data/Book;Landroid/content/Context;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
