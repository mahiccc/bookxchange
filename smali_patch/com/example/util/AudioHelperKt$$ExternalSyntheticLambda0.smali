.class public final synthetic Lcom/example/util/AudioHelperKt$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/example/util/AudioHelper;


# direct methods
.method public synthetic constructor <init>(Lcom/example/util/AudioHelper;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/util/AudioHelperKt$$ExternalSyntheticLambda0;->f$0:Lcom/example/util/AudioHelper;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 0
    iget-object p0, p0, Lcom/example/util/AudioHelperKt$$ExternalSyntheticLambda0;->f$0:Lcom/example/util/AudioHelper;

    check-cast p1, Landroidx/compose/runtime/DisposableEffectScope;

    invoke-static {p0, p1}, Lcom/example/util/AudioHelperKt;->rememberAudioHelper$lambda$3$lambda$2(Lcom/example/util/AudioHelper;Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;

    move-result-object p0

    return-object p0
.end method
