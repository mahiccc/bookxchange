.class public final synthetic Lcom/example/data/BookRepository$getMessagesForUser$1$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lcom/google/firebase/firestore/EventListener;


# instance fields
.field public final synthetic f$0:Ljava/util/concurrent/ConcurrentHashMap;

.field public final synthetic f$1:Lkotlinx/coroutines/channels/ProducerScope;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/ConcurrentHashMap;Lkotlinx/coroutines/channels/ProducerScope;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/data/BookRepository$getMessagesForUser$1$$ExternalSyntheticLambda1;->f$0:Ljava/util/concurrent/ConcurrentHashMap;

    iput-object p2, p0, Lcom/example/data/BookRepository$getMessagesForUser$1$$ExternalSyntheticLambda1;->f$1:Lkotlinx/coroutines/channels/ProducerScope;

    return-void
.end method


# virtual methods
.method public final onEvent(Ljava/lang/Object;Lcom/google/firebase/firestore/FirebaseFirestoreException;)V
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/example/data/BookRepository$getMessagesForUser$1$$ExternalSyntheticLambda1;->f$0:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object p0, p0, Lcom/example/data/BookRepository$getMessagesForUser$1$$ExternalSyntheticLambda1;->f$1:Lkotlinx/coroutines/channels/ProducerScope;

    check-cast p1, Lcom/google/firebase/firestore/QuerySnapshot;

    invoke-static {v0, p0, p1, p2}, Lcom/example/data/BookRepository$getMessagesForUser$1;->invokeSuspend$lambda$6(Ljava/util/concurrent/ConcurrentHashMap;Lkotlinx/coroutines/channels/ProducerScope;Lcom/google/firebase/firestore/QuerySnapshot;Lcom/google/firebase/firestore/FirebaseFirestoreException;)V

    return-void
.end method
