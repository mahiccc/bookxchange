.class public final synthetic Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda21;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Z

.field public final synthetic f$1:Ljava/lang/String;

.field public final synthetic f$2:Ljava/lang/String;

.field public final synthetic f$3:Landroidx/navigation/NavHostController;

.field public final synthetic f$4:Landroidx/compose/runtime/State;

.field public final synthetic f$5:Landroidx/compose/runtime/State;

.field public final synthetic f$6:Lcom/example/ui/BookViewModel;

.field public final synthetic f$7:Landroidx/compose/runtime/State;

.field public final synthetic f$8:Landroid/content/Context;

.field public final synthetic f$9:Landroidx/navigation/NavHostController;


# direct methods
.method public synthetic constructor <init>(ZLjava/lang/String;Ljava/lang/String;Landroidx/navigation/NavHostController;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Lcom/example/ui/BookViewModel;Landroidx/compose/runtime/State;Landroid/content/Context;Landroidx/navigation/NavHostController;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda21;->f$0:Z

    iput-object p2, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda21;->f$1:Ljava/lang/String;

    iput-object p3, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda21;->f$2:Ljava/lang/String;

    iput-object p4, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda21;->f$3:Landroidx/navigation/NavHostController;

    iput-object p5, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda21;->f$4:Landroidx/compose/runtime/State;

    iput-object p6, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda21;->f$5:Landroidx/compose/runtime/State;

    iput-object p7, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda21;->f$6:Lcom/example/ui/BookViewModel;

    iput-object p8, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda21;->f$7:Landroidx/compose/runtime/State;

    iput-object p9, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda21;->f$8:Landroid/content/Context;

    iput-object p10, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda21;->f$9:Landroidx/navigation/NavHostController;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 0
    iget-boolean v0, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda21;->f$0:Z

    iget-object v1, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda21;->f$1:Ljava/lang/String;

    iget-object v2, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda21;->f$2:Ljava/lang/String;

    iget-object v3, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda21;->f$3:Landroidx/navigation/NavHostController;

    iget-object v4, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda21;->f$4:Landroidx/compose/runtime/State;

    iget-object v5, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda21;->f$5:Landroidx/compose/runtime/State;

    iget-object v6, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda21;->f$6:Lcom/example/ui/BookViewModel;

    iget-object v7, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda21;->f$7:Landroidx/compose/runtime/State;

    iget-object v8, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda21;->f$8:Landroid/content/Context;

    iget-object v9, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda21;->f$9:Landroidx/navigation/NavHostController;

    move-object v10, p1

    check-cast v10, Landroidx/compose/foundation/layout/PaddingValues;

    move-object v11, p2

    check-cast v11, Landroidx/compose/runtime/Composer;

    move-object/from16 p0, p3

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v12

    invoke-static/range {v0 .. v12}, Lcom/example/ui/screens/MainScreenKt;->MainScreen$lambda$94(ZLjava/lang/String;Ljava/lang/String;Landroidx/navigation/NavHostController;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Lcom/example/ui/BookViewModel;Landroidx/compose/runtime/State;Landroid/content/Context;Landroidx/navigation/NavHostController;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
