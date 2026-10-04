.class public final synthetic Lcom/example/ui/screens/BookMatchmakerDialogKt$$ExternalSyntheticLambda11;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Ljava/util/List;

.field public final synthetic f$1:Ljava/util/List;

.field public final synthetic f$2:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$3:Landroidx/compose/runtime/MutableIntState;

.field public final synthetic f$4:Lcom/example/ui/BookViewModel;

.field public final synthetic f$5:Landroid/content/Context;

.field public final synthetic f$6:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/MutableIntState;Lcom/example/ui/BookViewModel;Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/BookMatchmakerDialogKt$$ExternalSyntheticLambda11;->f$0:Ljava/util/List;

    iput-object p2, p0, Lcom/example/ui/screens/BookMatchmakerDialogKt$$ExternalSyntheticLambda11;->f$1:Ljava/util/List;

    iput-object p3, p0, Lcom/example/ui/screens/BookMatchmakerDialogKt$$ExternalSyntheticLambda11;->f$2:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, Lcom/example/ui/screens/BookMatchmakerDialogKt$$ExternalSyntheticLambda11;->f$3:Landroidx/compose/runtime/MutableIntState;

    iput-object p5, p0, Lcom/example/ui/screens/BookMatchmakerDialogKt$$ExternalSyntheticLambda11;->f$4:Lcom/example/ui/BookViewModel;

    iput-object p6, p0, Lcom/example/ui/screens/BookMatchmakerDialogKt$$ExternalSyntheticLambda11;->f$5:Landroid/content/Context;

    iput-object p7, p0, Lcom/example/ui/screens/BookMatchmakerDialogKt$$ExternalSyntheticLambda11;->f$6:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/BookMatchmakerDialogKt$$ExternalSyntheticLambda11;->f$0:Ljava/util/List;

    iget-object v1, p0, Lcom/example/ui/screens/BookMatchmakerDialogKt$$ExternalSyntheticLambda11;->f$1:Ljava/util/List;

    iget-object v2, p0, Lcom/example/ui/screens/BookMatchmakerDialogKt$$ExternalSyntheticLambda11;->f$2:Lkotlin/jvm/functions/Function0;

    iget-object v3, p0, Lcom/example/ui/screens/BookMatchmakerDialogKt$$ExternalSyntheticLambda11;->f$3:Landroidx/compose/runtime/MutableIntState;

    iget-object v4, p0, Lcom/example/ui/screens/BookMatchmakerDialogKt$$ExternalSyntheticLambda11;->f$4:Lcom/example/ui/BookViewModel;

    iget-object v5, p0, Lcom/example/ui/screens/BookMatchmakerDialogKt$$ExternalSyntheticLambda11;->f$5:Landroid/content/Context;

    iget-object v6, p0, Lcom/example/ui/screens/BookMatchmakerDialogKt$$ExternalSyntheticLambda11;->f$6:Lkotlin/jvm/functions/Function1;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, Lcom/example/ui/screens/BookMatchmakerDialogKt;->BookMatchmakerDialog$lambda$44(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/MutableIntState;Lcom/example/ui/BookViewModel;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
