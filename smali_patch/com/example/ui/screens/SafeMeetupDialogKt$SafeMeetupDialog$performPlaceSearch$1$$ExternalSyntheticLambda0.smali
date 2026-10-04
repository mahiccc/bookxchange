.class public final synthetic Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Landroid/location/Address;


# direct methods
.method public synthetic constructor <init>(Landroid/location/Address;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1$$ExternalSyntheticLambda0;->f$0:Landroid/location/Address;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 0
    iget-object p0, p0, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1$$ExternalSyntheticLambda0;->f$0:Landroid/location/Address;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p0, p1}, Lcom/example/ui/screens/SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1;->invokeSuspend$lambda$2$lambda$0(Landroid/location/Address;I)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method
