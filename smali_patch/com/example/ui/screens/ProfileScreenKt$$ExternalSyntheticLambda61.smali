.class public final synthetic Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda61;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Z

.field public final synthetic f$1:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(ZLjava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda61;->f$0:Z

    iput-object p2, p0, Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda61;->f$1:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-boolean v0, p0, Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda61;->f$0:Z

    iget-object p0, p0, Lcom/example/ui/screens/ProfileScreenKt$$ExternalSyntheticLambda61;->f$1:Ljava/lang/String;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p0, p1, p2}, Lcom/example/ui/screens/ProfileScreenKt;->ProfileScreen$lambda$127$lambda$126$lambda$125$lambda$99$lambda$98$lambda$97$lambda$96$lambda$95(ZLjava/lang/String;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
