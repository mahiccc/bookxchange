.class public final synthetic Lcom/example/data/BookRepository$getUser$1$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Lcom/google/firebase/firestore/ListenerRegistration;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/firestore/ListenerRegistration;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/data/BookRepository$getUser$1$$ExternalSyntheticLambda1;->f$0:Lcom/google/firebase/firestore/ListenerRegistration;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 0

    .line 0
    iget-object p0, p0, Lcom/example/data/BookRepository$getUser$1$$ExternalSyntheticLambda1;->f$0:Lcom/google/firebase/firestore/ListenerRegistration;

    invoke-static {p0}, Lcom/example/data/BookRepository$getUser$1;->invokeSuspend$lambda$1(Lcom/google/firebase/firestore/ListenerRegistration;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
