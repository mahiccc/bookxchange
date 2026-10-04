.class public final synthetic Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda20;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Landroid/content/Context;

.field public final synthetic f$1:Lcom/example/ui/BookViewModel;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lcom/example/ui/BookViewModel;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda20;->f$0:Landroid/content/Context;

    iput-object p2, p0, Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda20;->f$1:Lcom/example/ui/BookViewModel;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda20;->f$0:Landroid/content/Context;

    iget-object p0, p0, Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda20;->f$1:Lcom/example/ui/BookViewModel;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, p0, p1}, Lcom/example/ui/screens/ProfileScreenKt;->ProfileScreen$lambda$52$lambda$51(Landroid/content/Context;Lcom/example/ui/BookViewModel;Landroid/net/Uri;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
