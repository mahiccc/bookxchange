.class final Lcom/example/ui/screens/LoginScreenKt$LoginScreen$googleSignInLauncher$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "LoginScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/screens/LoginScreenKt;->LoginScreen(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.example.ui.screens.LoginScreenKt$LoginScreen$googleSignInLauncher$1$1$1"
    f = "LoginScreen.kt"
    i = {
        0x0
    }
    l = {
        0x53
    }
    m = "invokeSuspend"
    n = {
        "authCredential"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field final synthetic $account:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

.field final synthetic $errorMessage$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $idToken:Ljava/lang/String;

.field final synthetic $isLoading$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onLoginSuccess:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/ui/screens/LoginScreenKt$LoginScreen$googleSignInLauncher$1$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$googleSignInLauncher$1$1$1;->$idToken:Ljava/lang/String;

    iput-object p2, p0, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$googleSignInLauncher$1$1$1;->$account:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    iput-object p3, p0, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$googleSignInLauncher$1$1$1;->$onLoginSuccess:Lkotlin/jvm/functions/Function3;

    iput-object p4, p0, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$googleSignInLauncher$1$1$1;->$errorMessage$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$googleSignInLauncher$1$1$1;->$isLoading$delegate:Landroidx/compose/runtime/MutableState;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$googleSignInLauncher$1$1$1;

    iget-object v1, p0, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$googleSignInLauncher$1$1$1;->$idToken:Ljava/lang/String;

    iget-object v2, p0, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$googleSignInLauncher$1$1$1;->$account:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    iget-object v3, p0, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$googleSignInLauncher$1$1$1;->$onLoginSuccess:Lkotlin/jvm/functions/Function3;

    iget-object v4, p0, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$googleSignInLauncher$1$1$1;->$errorMessage$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v5, p0, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$googleSignInLauncher$1$1$1;->$isLoading$delegate:Landroidx/compose/runtime/MutableState;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$googleSignInLauncher$1$1$1;-><init>(Ljava/lang/String;Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$googleSignInLauncher$1$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$googleSignInLauncher$1$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p0

    check-cast p0, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$googleSignInLauncher$1$1$1;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$googleSignInLauncher$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const-string v0, "Firebase authentication failed: "

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 80
    iget v2, p0, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$googleSignInLauncher$1$1$1;->label:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v1, p0, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$googleSignInLauncher$1$1$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/google/firebase/auth/AuthCredential;

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 82
    :try_start_1
    iget-object p1, p0, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$googleSignInLauncher$1$1$1;->$idToken:Ljava/lang/String;

    invoke-static {p1, v5}, Lcom/google/firebase/auth/GoogleAuthProvider;->getCredential(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/auth/AuthCredential;

    move-result-object p1

    const-string v2, "getCredential(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    invoke-static {}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance()Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/google/firebase/auth/FirebaseAuth;->signInWithCredential(Lcom/google/firebase/auth/AuthCredential;)Lcom/google/android/gms/tasks/Task;

    move-result-object v2

    const-string v6, "signInWithCredential(...)"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, p0

    check-cast v6, Lkotlin/coroutines/Continuation;

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$googleSignInLauncher$1$1$1;->L$0:Ljava/lang/Object;

    iput v3, p0, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$googleSignInLauncher$1$1$1;->label:I

    invoke-static {v2, v6}, Lkotlinx/coroutines/tasks/TasksKt;->await(Lcom/google/android/gms/tasks/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    .line 80
    :cond_2
    :goto_0
    check-cast p1, Lcom/google/firebase/auth/AuthResult;

    .line 84
    invoke-interface {p1}, Lcom/google/firebase/auth/AuthResult;->getUser()Lcom/google/firebase/auth/FirebaseUser;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 85
    invoke-virtual {p1}, Lcom/google/firebase/auth/FirebaseUser;->getEmail()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4

    :cond_3
    iget-object v1, p0, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$googleSignInLauncher$1$1$1;->$account:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    invoke-virtual {v1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->getEmail()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4

    const-string v1, "reader@gmail.com"

    .line 86
    :cond_4
    iget-object v2, p0, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$googleSignInLauncher$1$1$1;->$account:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    invoke-virtual {v2}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->getDisplayName()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_6

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/google/firebase/auth/FirebaseUser;->getDisplayName()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_5
    move-object v2, v5

    :goto_1
    if-nez v2, :cond_6

    const-string v2, "@"

    const/4 v3, 0x2

    invoke-static {v1, v2, v5, v3, v5}, Lkotlin/text/StringsKt;->substringBefore$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 87
    :cond_6
    iget-object v3, p0, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$googleSignInLauncher$1$1$1;->$account:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    invoke-virtual {v3}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->getPhotoUrl()Landroid/net/Uri;

    move-result-object v3

    if-eqz v3, :cond_7

    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_a

    :cond_7
    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lcom/google/firebase/auth/FirebaseUser;->getPhotoUrl()Landroid/net/Uri;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v5

    :cond_8
    if-nez v5, :cond_9

    const-string v3, ""

    goto :goto_2

    :cond_9
    move-object v3, v5

    .line 88
    :cond_a
    :goto_2
    iget-object p1, p0, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$googleSignInLauncher$1$1$1;->$onLoginSuccess:Lkotlin/jvm/functions/Function3;

    invoke-interface {p1, v1, v2, v3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :catch_0
    move-exception p1

    .line 90
    :try_start_2
    const-string v1, "Auth"

    const-string v2, "Firebase credential auth failed"

    move-object v3, p1

    check-cast v3, Ljava/lang/Throwable;

    invoke-static {v1, v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 91
    iget-object v1, p0, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$googleSignInLauncher$1$1$1;->$errorMessage$delegate:Landroidx/compose/runtime/MutableState;

    invoke-virtual {p1}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v0, ". Please try again."

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/example/ui/screens/LoginScreenKt;->access$LoginScreen$lambda$8(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 93
    :goto_3
    iget-object p0, p0, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$googleSignInLauncher$1$1$1;->$isLoading$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p0, v4}, Lcom/example/ui/screens/LoginScreenKt;->access$LoginScreen$lambda$2(Landroidx/compose/runtime/MutableState;Z)V

    .line 95
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0

    .line 93
    :goto_4
    iget-object p0, p0, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$googleSignInLauncher$1$1$1;->$isLoading$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p0, v4}, Lcom/example/ui/screens/LoginScreenKt;->access$LoginScreen$lambda$2(Landroidx/compose/runtime/MutableState;Z)V

    throw p1
.end method
