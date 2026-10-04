.class public final synthetic Lcom/example/ui/screens/ChatScreenKt$$ExternalSyntheticLambda45;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Landroidx/compose/runtime/State;

.field public final synthetic f$1:Z

.field public final synthetic f$2:Landroidx/compose/foundation/layout/ColumnScope;

.field public final synthetic f$3:Landroidx/compose/runtime/State;

.field public final synthetic f$4:Ljava/text/SimpleDateFormat;

.field public final synthetic f$5:Lcom/example/ui/BookViewModel;

.field public final synthetic f$6:Landroid/content/Context;

.field public final synthetic f$7:Lcom/example/data/Book;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/runtime/State;ZLandroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/State;Ljava/text/SimpleDateFormat;Lcom/example/ui/BookViewModel;Landroid/content/Context;Lcom/example/data/Book;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/ChatScreenKt$$ExternalSyntheticLambda45;->f$0:Landroidx/compose/runtime/State;

    iput-boolean p2, p0, Lcom/example/ui/screens/ChatScreenKt$$ExternalSyntheticLambda45;->f$1:Z

    iput-object p3, p0, Lcom/example/ui/screens/ChatScreenKt$$ExternalSyntheticLambda45;->f$2:Landroidx/compose/foundation/layout/ColumnScope;

    iput-object p4, p0, Lcom/example/ui/screens/ChatScreenKt$$ExternalSyntheticLambda45;->f$3:Landroidx/compose/runtime/State;

    iput-object p5, p0, Lcom/example/ui/screens/ChatScreenKt$$ExternalSyntheticLambda45;->f$4:Ljava/text/SimpleDateFormat;

    iput-object p6, p0, Lcom/example/ui/screens/ChatScreenKt$$ExternalSyntheticLambda45;->f$5:Lcom/example/ui/BookViewModel;

    iput-object p7, p0, Lcom/example/ui/screens/ChatScreenKt$$ExternalSyntheticLambda45;->f$6:Landroid/content/Context;

    iput-object p8, p0, Lcom/example/ui/screens/ChatScreenKt$$ExternalSyntheticLambda45;->f$7:Lcom/example/data/Book;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/ChatScreenKt$$ExternalSyntheticLambda45;->f$0:Landroidx/compose/runtime/State;

    iget-boolean v1, p0, Lcom/example/ui/screens/ChatScreenKt$$ExternalSyntheticLambda45;->f$1:Z

    iget-object v2, p0, Lcom/example/ui/screens/ChatScreenKt$$ExternalSyntheticLambda45;->f$2:Landroidx/compose/foundation/layout/ColumnScope;

    iget-object v3, p0, Lcom/example/ui/screens/ChatScreenKt$$ExternalSyntheticLambda45;->f$3:Landroidx/compose/runtime/State;

    iget-object v4, p0, Lcom/example/ui/screens/ChatScreenKt$$ExternalSyntheticLambda45;->f$4:Ljava/text/SimpleDateFormat;

    iget-object v5, p0, Lcom/example/ui/screens/ChatScreenKt$$ExternalSyntheticLambda45;->f$5:Lcom/example/ui/BookViewModel;

    iget-object v6, p0, Lcom/example/ui/screens/ChatScreenKt$$ExternalSyntheticLambda45;->f$6:Landroid/content/Context;

    iget-object v7, p0, Lcom/example/ui/screens/ChatScreenKt$$ExternalSyntheticLambda45;->f$7:Lcom/example/data/Book;

    move-object v8, p1

    check-cast v8, Landroidx/compose/foundation/lazy/LazyListScope;

    invoke-static/range {v0 .. v8}, Lcom/example/ui/screens/ChatScreenKt;->ChatScreen$lambda$272$lambda$271$lambda$246$lambda$245(Landroidx/compose/runtime/State;ZLandroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/State;Ljava/text/SimpleDateFormat;Lcom/example/ui/BookViewModel;Landroid/content/Context;Lcom/example/data/Book;Landroidx/compose/foundation/lazy/LazyListScope;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
