.class public final synthetic Lcom/example/data/BookRepository$getMessagesForUser$1$$ExternalSyntheticLambda5;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Lcom/google/firebase/firestore/ListenerRegistration;

.field public final synthetic f$1:Lcom/google/firebase/firestore/ListenerRegistration;

.field public final synthetic f$2:Lcom/google/firebase/firestore/ListenerRegistration;

.field public final synthetic f$3:Lcom/google/firebase/firestore/ListenerRegistration;

.field public final synthetic f$4:Lcom/google/firebase/firestore/ListenerRegistration;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/firestore/ListenerRegistration;Lcom/google/firebase/firestore/ListenerRegistration;Lcom/google/firebase/firestore/ListenerRegistration;Lcom/google/firebase/firestore/ListenerRegistration;Lcom/google/firebase/firestore/ListenerRegistration;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/data/BookRepository$getMessagesForUser$1$$ExternalSyntheticLambda5;->f$0:Lcom/google/firebase/firestore/ListenerRegistration;

    iput-object p2, p0, Lcom/example/data/BookRepository$getMessagesForUser$1$$ExternalSyntheticLambda5;->f$1:Lcom/google/firebase/firestore/ListenerRegistration;

    iput-object p3, p0, Lcom/example/data/BookRepository$getMessagesForUser$1$$ExternalSyntheticLambda5;->f$2:Lcom/google/firebase/firestore/ListenerRegistration;

    iput-object p4, p0, Lcom/example/data/BookRepository$getMessagesForUser$1$$ExternalSyntheticLambda5;->f$3:Lcom/google/firebase/firestore/ListenerRegistration;

    iput-object p5, p0, Lcom/example/data/BookRepository$getMessagesForUser$1$$ExternalSyntheticLambda5;->f$4:Lcom/google/firebase/firestore/ListenerRegistration;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 0
    iget-object v0, p0, Lcom/example/data/BookRepository$getMessagesForUser$1$$ExternalSyntheticLambda5;->f$0:Lcom/google/firebase/firestore/ListenerRegistration;

    iget-object v1, p0, Lcom/example/data/BookRepository$getMessagesForUser$1$$ExternalSyntheticLambda5;->f$1:Lcom/google/firebase/firestore/ListenerRegistration;

    iget-object v2, p0, Lcom/example/data/BookRepository$getMessagesForUser$1$$ExternalSyntheticLambda5;->f$2:Lcom/google/firebase/firestore/ListenerRegistration;

    iget-object v3, p0, Lcom/example/data/BookRepository$getMessagesForUser$1$$ExternalSyntheticLambda5;->f$3:Lcom/google/firebase/firestore/ListenerRegistration;

    iget-object p0, p0, Lcom/example/data/BookRepository$getMessagesForUser$1$$ExternalSyntheticLambda5;->f$4:Lcom/google/firebase/firestore/ListenerRegistration;

    invoke-static {v0, v1, v2, v3, p0}, Lcom/example/data/BookRepository$getMessagesForUser$1;->invokeSuspend$lambda$16(Lcom/google/firebase/firestore/ListenerRegistration;Lcom/google/firebase/firestore/ListenerRegistration;Lcom/google/firebase/firestore/ListenerRegistration;Lcom/google/firebase/firestore/ListenerRegistration;Lcom/google/firebase/firestore/ListenerRegistration;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method
