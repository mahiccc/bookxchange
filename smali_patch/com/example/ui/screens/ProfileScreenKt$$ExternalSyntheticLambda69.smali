.class public final synthetic Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda69;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Ljava/lang/String;

.field public final synthetic f$1:Ljava/lang/String;

.field public final synthetic f$2:Ljava/lang/String;

.field public final synthetic f$3:I

.field public final synthetic f$4:I

.field public final synthetic f$5:Landroid/content/Context;

.field public final synthetic f$6:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILandroid/content/Context;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda69;->f$0:Ljava/lang/String;

    iput-object p2, p0, Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda69;->f$1:Ljava/lang/String;

    iput-object p3, p0, Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda69;->f$2:Ljava/lang/String;

    iput p4, p0, Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda69;->f$3:I

    iput p5, p0, Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda69;->f$4:I

    iput-object p6, p0, Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda69;->f$5:Landroid/content/Context;

    iput-object p7, p0, Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda69;->f$6:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 0
    iget-object v0, p0, Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda69;->f$0:Ljava/lang/String;

    iget-object v1, p0, Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda69;->f$1:Ljava/lang/String;

    iget-object v2, p0, Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda69;->f$2:Ljava/lang/String;

    iget v3, p0, Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda69;->f$3:I

    iget v4, p0, Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda69;->f$4:I

    iget-object v5, p0, Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda69;->f$5:Landroid/content/Context;

    iget-object v6, p0, Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda69;->f$6:Lkotlin/jvm/functions/Function0;

    move-object v7, p1

    check-cast v7, Landroidx/compose/foundation/layout/ColumnScope;

    move-object v8, p2

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lcom/example/ui/screens/ProfileScreenKt;->EcoImpactSection$lambda$285$lambda$284(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILandroid/content/Context;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
