.class final Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;
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

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLoginScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginScreen.kt\ncom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,473:1\n1#2:474\n*E\n"
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
    c = "com.example.ui.screens.LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1"
    f = "LoginScreen.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1
    }
    l = {
        0x83,
        0x9b
    }
    m = "invokeSuspend"
    n = {
        "activity",
        "credContext",
        "credentialManager",
        "googleIdOption",
        "request",
        "activity",
        "credContext",
        "credentialManager",
        "googleIdOption",
        "request",
        "result",
        "credential",
        "extractedName",
        "extractedPicUrl",
        "idToken",
        "authCredential"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5",
        "L$6",
        "L$7",
        "L$8",
        "L$9",
        "L$10"
    }
.end annotation


# instance fields
.field final synthetic $context:Landroid/content/Context;

.field final synthetic $errorMessage$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $googleSignInLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/compose/ManagedActivityResultLauncher<",
            "Landroid/content/Intent;",
            "Landroidx/activity/result/ActivityResult;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $isLoading$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $loadingMessage$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
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

.field final synthetic $webClientId:Ljava/lang/String;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$10:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field L$7:Ljava/lang/Object;

.field L$8:Ljava/lang/Object;

.field L$9:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/activity/compose/ManagedActivityResultLauncher;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/activity/compose/ManagedActivityResultLauncher<",
            "Landroid/content/Intent;",
            "Landroidx/activity/result/ActivityResult;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->$context:Landroid/content/Context;

    iput-object p2, p0, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->$webClientId:Ljava/lang/String;

    iput-object p3, p0, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->$onLoginSuccess:Lkotlin/jvm/functions/Function3;

    iput-object p4, p0, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->$googleSignInLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iput-object p5, p0, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->$loadingMessage$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->$isLoading$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p7, p0, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->$errorMessage$delegate:Landroidx/compose/runtime/MutableState;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method static final invokeSuspend$lambda$3(Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 3

    .line 161
    move-object v0, p0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type java.lang.String"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "toUpperCase(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    const-string v1, "substring(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :cond_0
    check-cast p0, Ljava/lang/CharSequence;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 9
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

    new-instance v0, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;

    iget-object v1, p0, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->$context:Landroid/content/Context;

    iget-object v2, p0, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->$webClientId:Ljava/lang/String;

    iget-object v3, p0, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->$onLoginSuccess:Lkotlin/jvm/functions/Function3;

    iget-object v4, p0, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->$googleSignInLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iget-object v5, p0, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->$loadingMessage$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v6, p0, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->$isLoading$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v7, p0, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->$errorMessage$delegate:Landroidx/compose/runtime/MutableState;

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;-><init>(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/activity/compose/ManagedActivityResultLauncher;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p0

    check-cast p0, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    move-object/from16 v1, p0

    const-string v0, " "

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 118
    iget v3, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->label:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v7, 0x0

    if-eqz v3, :cond_2

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    iget-object v2, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->L$10:Ljava/lang/Object;

    check-cast v2, Lcom/google/firebase/auth/AuthCredential;

    iget-object v2, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->L$9:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v2, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->L$8:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->L$7:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v8, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->L$6:Ljava/lang/Object;

    check-cast v8, Landroidx/credentials/Credential;

    iget-object v8, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->L$5:Ljava/lang/Object;

    check-cast v8, Landroidx/credentials/GetCredentialResponse;

    iget-object v8, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->L$4:Ljava/lang/Object;

    check-cast v8, Landroidx/credentials/GetCredentialRequest;

    iget-object v8, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->L$3:Ljava/lang/Object;

    check-cast v8, Lcom/google/android/libraries/identity/googleid/GetSignInWithGoogleOption;

    iget-object v8, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->L$2:Ljava/lang/Object;

    check-cast v8, Landroidx/credentials/CredentialManager;

    iget-object v8, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->L$1:Ljava/lang/Object;

    check-cast v8, Landroid/content/Context;

    iget-object v8, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->L$0:Ljava/lang/Object;

    check-cast v8, Landroid/app/Activity;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroidx/credentials/exceptions/GetCredentialCancellationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v14, v3

    const/16 v16, 0x0

    move-object/from16 v3, p1

    goto/16 :goto_6

    :catch_0
    move-exception v0

    goto/16 :goto_13

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v3, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->L$4:Ljava/lang/Object;

    check-cast v3, Landroidx/credentials/GetCredentialRequest;

    iget-object v8, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->L$3:Ljava/lang/Object;

    check-cast v8, Lcom/google/android/libraries/identity/googleid/GetSignInWithGoogleOption;

    iget-object v9, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->L$2:Ljava/lang/Object;

    check-cast v9, Landroidx/credentials/CredentialManager;

    iget-object v10, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->L$1:Ljava/lang/Object;

    check-cast v10, Landroid/content/Context;

    iget-object v11, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->L$0:Ljava/lang/Object;

    check-cast v11, Landroid/app/Activity;

    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catch Landroidx/credentials/exceptions/GetCredentialCancellationException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object v12, v9

    move-object v9, v8

    move-object v8, v11

    move-object v11, v10

    move-object v10, v12

    move-object/from16 v12, p1

    goto :goto_1

    :catch_1
    move-exception v0

    move-object v8, v11

    goto/16 :goto_13

    :catch_2
    const/4 v3, 0x0

    goto/16 :goto_14

    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 119
    iget-object v3, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->$context:Landroid/content/Context;

    invoke-static {v3}, Lcom/example/ui/screens/CameraScreenKt;->findActivity(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v8

    if-eqz v8, :cond_3

    .line 120
    move-object v3, v8

    check-cast v3, Landroid/content/Context;

    goto :goto_0

    :cond_3
    iget-object v3, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->$context:Landroid/content/Context;

    :goto_0
    move-object v10, v3

    .line 123
    :try_start_2
    sget-object v3, Landroidx/credentials/CredentialManager;->Companion:Landroidx/credentials/CredentialManager$Companion;

    invoke-virtual {v3, v10}, Landroidx/credentials/CredentialManager$Companion;->create(Landroid/content/Context;)Landroidx/credentials/CredentialManager;

    move-result-object v9

    .line 124
    new-instance v3, Lcom/google/android/libraries/identity/googleid/GetSignInWithGoogleOption$Builder;

    iget-object v11, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->$webClientId:Ljava/lang/String;

    invoke-direct {v3, v11}, Lcom/google/android/libraries/identity/googleid/GetSignInWithGoogleOption$Builder;-><init>(Ljava/lang/String;)V

    .line 125
    invoke-virtual {v3}, Lcom/google/android/libraries/identity/googleid/GetSignInWithGoogleOption$Builder;->build()Lcom/google/android/libraries/identity/googleid/GetSignInWithGoogleOption;

    move-result-object v3

    .line 127
    new-instance v11, Landroidx/credentials/GetCredentialRequest$Builder;

    invoke-direct {v11}, Landroidx/credentials/GetCredentialRequest$Builder;-><init>()V

    .line 128
    move-object v12, v3

    check-cast v12, Landroidx/credentials/CredentialOption;

    invoke-virtual {v11, v12}, Landroidx/credentials/GetCredentialRequest$Builder;->addCredentialOption(Landroidx/credentials/CredentialOption;)Landroidx/credentials/GetCredentialRequest$Builder;

    move-result-object v11

    .line 129
    invoke-virtual {v11}, Landroidx/credentials/GetCredentialRequest$Builder;->build()Landroidx/credentials/GetCredentialRequest;

    move-result-object v11

    .line 131
    move-object v12, v1

    check-cast v12, Lkotlin/coroutines/Continuation;

    iput-object v8, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->L$0:Ljava/lang/Object;

    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    iput-object v13, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->L$1:Ljava/lang/Object;

    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    iput-object v13, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->L$2:Ljava/lang/Object;

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    iput-object v13, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->L$3:Ljava/lang/Object;

    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    iput-object v13, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->L$4:Ljava/lang/Object;

    iput v5, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->label:I

    invoke-interface {v9, v10, v11, v12}, Landroidx/credentials/CredentialManager;->getCredential(Landroid/content/Context;Landroidx/credentials/GetCredentialRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v2, :cond_4

    goto/16 :goto_5

    :cond_4
    move-object/from16 v26, v9

    move-object v9, v3

    move-object v3, v11

    move-object v11, v10

    move-object/from16 v10, v26

    .line 118
    :goto_1
    check-cast v12, Landroidx/credentials/GetCredentialResponse;

    .line 132
    invoke-virtual {v12}, Landroidx/credentials/GetCredentialResponse;->getCredential()Landroidx/credentials/Credential;

    move-result-object v13

    .line 138
    instance-of v14, v13, Lcom/google/android/libraries/identity/googleid/GoogleIdTokenCredential;

    if-eqz v14, :cond_6

    .line 139
    move-object v14, v13

    check-cast v14, Lcom/google/android/libraries/identity/googleid/GoogleIdTokenCredential;

    invoke-virtual {v14}, Lcom/google/android/libraries/identity/googleid/GoogleIdTokenCredential;->getDisplayName()Ljava/lang/String;

    move-result-object v14

    .line 140
    move-object v15, v13

    check-cast v15, Lcom/google/android/libraries/identity/googleid/GoogleIdTokenCredential;

    invoke-virtual {v15}, Lcom/google/android/libraries/identity/googleid/GoogleIdTokenCredential;->getProfilePictureUri()Landroid/net/Uri;

    move-result-object v15

    if-eqz v15, :cond_5

    invoke-virtual {v15}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v15

    goto :goto_2

    :cond_5
    move-object v15, v7

    .line 141
    :goto_2
    move-object/from16 v16, v13

    check-cast v16, Lcom/google/android/libraries/identity/googleid/GoogleIdTokenCredential;

    invoke-virtual/range {v16 .. v16}, Lcom/google/android/libraries/identity/googleid/GoogleIdTokenCredential;->getIdToken()Ljava/lang/String;

    move-result-object v16

    move-object/from16 v6, v16

    goto :goto_4

    .line 143
    :cond_6
    invoke-virtual {v13}, Landroidx/credentials/Credential;->getType()Ljava/lang/String;

    move-result-object v14

    const-string v15, "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_8

    .line 144
    sget-object v14, Lcom/google/android/libraries/identity/googleid/GoogleIdTokenCredential;->Companion:Lcom/google/android/libraries/identity/googleid/GoogleIdTokenCredential$Companion;

    invoke-virtual {v13}, Landroidx/credentials/Credential;->getData()Landroid/os/Bundle;

    move-result-object v15

    invoke-virtual {v14, v15}, Lcom/google/android/libraries/identity/googleid/GoogleIdTokenCredential$Companion;->createFrom(Landroid/os/Bundle;)Lcom/google/android/libraries/identity/googleid/GoogleIdTokenCredential;

    move-result-object v14

    .line 145
    invoke-virtual {v14}, Lcom/google/android/libraries/identity/googleid/GoogleIdTokenCredential;->getDisplayName()Ljava/lang/String;

    move-result-object v15

    .line 146
    invoke-virtual {v14}, Lcom/google/android/libraries/identity/googleid/GoogleIdTokenCredential;->getProfilePictureUri()Landroid/net/Uri;

    move-result-object v16

    if-eqz v16, :cond_7

    invoke-virtual/range {v16 .. v16}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v16

    goto :goto_3

    :cond_7
    move-object/from16 v16, v7

    .line 147
    :goto_3
    invoke-virtual {v14}, Lcom/google/android/libraries/identity/googleid/GoogleIdTokenCredential;->getIdToken()Ljava/lang/String;

    move-result-object v14

    move-object v6, v14

    move-object v14, v15

    move-object/from16 v15, v16

    goto :goto_4

    :cond_8
    move-object v6, v7

    move-object v14, v6

    move-object v15, v14

    :goto_4
    const/16 v16, 0x0

    if-eqz v6, :cond_1a

    .line 153
    iget-object v5, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->$loadingMessage$delegate:Landroidx/compose/runtime/MutableState;

    const-string v4, "Verifying Google Account..."

    invoke-static {v5, v4}, Lcom/example/ui/screens/LoginScreenKt;->access$LoginScreen$lambda$5(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    .line 154
    invoke-static {v6, v7}, Lcom/google/firebase/auth/GoogleAuthProvider;->getCredential(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/auth/AuthCredential;

    move-result-object v4

    const-string v5, "getCredential(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 155
    invoke-static {}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance()Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v5

    invoke-virtual {v5, v4}, Lcom/google/firebase/auth/FirebaseAuth;->signInWithCredential(Lcom/google/firebase/auth/AuthCredential;)Lcom/google/android/gms/tasks/Task;

    move-result-object v5

    const-string v7, "signInWithCredential(...)"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v7, v1

    check-cast v7, Lkotlin/coroutines/Continuation;

    iput-object v8, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->L$0:Ljava/lang/Object;

    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->L$1:Ljava/lang/Object;

    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->L$2:Ljava/lang/Object;

    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->L$3:Ljava/lang/Object;

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->L$4:Ljava/lang/Object;

    invoke-static {v12}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->L$5:Ljava/lang/Object;

    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->L$6:Ljava/lang/Object;

    iput-object v14, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->L$7:Ljava/lang/Object;

    iput-object v15, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->L$8:Ljava/lang/Object;

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->L$9:Ljava/lang/Object;

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->L$10:Ljava/lang/Object;

    const/4 v3, 0x2

    iput v3, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->label:I

    invoke-static {v5, v7}, Lkotlinx/coroutines/tasks/TasksKt;->await(Lcom/google/android/gms/tasks/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_9

    :goto_5
    return-object v2

    :cond_9
    move-object v2, v15

    .line 118
    :goto_6
    check-cast v3, Lcom/google/firebase/auth/AuthResult;

    .line 156
    invoke-interface {v3}, Lcom/google/firebase/auth/AuthResult;->getUser()Lcom/google/firebase/auth/FirebaseUser;

    move-result-object v3
    :try_end_2
    .catch Landroidx/credentials/exceptions/GetCredentialCancellationException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    if-eqz v3, :cond_a

    .line 158
    :try_start_3
    invoke-virtual {v3}, Lcom/google/firebase/auth/FirebaseUser;->getEmail()Ljava/lang/String;

    move-result-object v4
    :try_end_3
    .catch Landroidx/credentials/exceptions/GetCredentialCancellationException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    if-nez v4, :cond_b

    goto :goto_7

    :catch_3
    move/from16 v3, v16

    goto/16 :goto_14

    :cond_a
    :goto_7
    :try_start_4
    const-string v4, "reader@bookxchange.app"

    .line 159
    :cond_b
    move-object v5, v14

    check-cast v5, Ljava/lang/CharSequence;
    :try_end_4
    .catch Landroidx/credentials/exceptions/GetCredentialCancellationException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    if-eqz v5, :cond_d

    :try_start_5
    invoke-static {v5}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_c

    goto :goto_8

    :cond_c
    move/from16 v5, v16

    goto :goto_9

    :cond_d
    :goto_8
    const/4 v5, 0x1

    :goto_9
    if-nez v5, :cond_e

    goto :goto_a

    :cond_e
    const/4 v14, 0x0

    :goto_a
    if-nez v14, :cond_13

    if-eqz v3, :cond_f

    .line 160
    invoke-virtual {v3}, Lcom/google/firebase/auth/FirebaseUser;->getDisplayName()Ljava/lang/String;

    move-result-object v5

    goto :goto_b

    :cond_f
    const/4 v5, 0x0

    :goto_b
    move-object v6, v5

    check-cast v6, Ljava/lang/CharSequence;

    if-eqz v6, :cond_11

    invoke-static {v6}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_10

    goto :goto_c

    :cond_10
    move/from16 v6, v16

    goto :goto_d

    :cond_11
    :goto_c
    const/4 v6, 0x1

    :goto_d
    if-nez v6, :cond_12

    move-object v14, v5

    goto :goto_e

    :cond_12
    const/4 v14, 0x0

    :goto_e
    if-nez v14, :cond_13

    .line 161
    const-string v5, "@"

    const/4 v6, 0x2

    const/4 v7, 0x0

    invoke-static {v4, v5, v7, v6, v7}, Lkotlin/text/StringsKt;->substringBefore$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "."

    const-string v11, " "

    const/4 v13, 0x4

    const/4 v14, 0x0

    const/4 v12, 0x0

    invoke-static/range {v9 .. v14}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    move-object v9, v5

    check-cast v9, Ljava/lang/CharSequence;

    const/4 v5, 0x1

    new-array v10, v5, [Ljava/lang/String;

    aput-object v0, v10, v16

    const/4 v13, 0x6

    const/4 v14, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v9 .. v14}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v6

    move-object/from16 v17, v6

    check-cast v17, Ljava/lang/Iterable;

    move-object/from16 v18, v0

    check-cast v18, Ljava/lang/CharSequence;

    new-instance v23, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1$$ExternalSyntheticLambda0;

    invoke-direct/range {v23 .. v23}, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1$$ExternalSyntheticLambda0;-><init>()V

    const/16 v24, 0x1e

    const/16 v25, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v17 .. v25}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v14
    :try_end_5
    .catch Landroidx/credentials/exceptions/GetCredentialCancellationException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    goto :goto_f

    :cond_13
    const/4 v5, 0x1

    const/4 v7, 0x0

    .line 162
    :goto_f
    :try_start_6
    move-object v0, v2

    check-cast v0, Ljava/lang/CharSequence;
    :try_end_6
    .catch Landroidx/credentials/exceptions/GetCredentialCancellationException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    if-eqz v0, :cond_15

    :try_start_7
    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_14

    goto :goto_10

    :cond_14
    move/from16 v5, v16

    :cond_15
    :goto_10
    if-nez v5, :cond_16

    goto :goto_11

    :cond_16
    move-object v2, v7

    :goto_11
    if-nez v2, :cond_19

    if-eqz v3, :cond_17

    invoke-virtual {v3}, Lcom/google/firebase/auth/FirebaseUser;->getPhotoUrl()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_17

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v7

    :cond_17
    if-nez v7, :cond_18

    const-string v2, ""
    :try_end_7
    .catch Landroidx/credentials/exceptions/GetCredentialCancellationException; {:try_start_7 .. :try_end_7} :catch_3
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    goto :goto_12

    :cond_18
    move-object v2, v7

    .line 164
    :cond_19
    :goto_12
    :try_start_8
    iget-object v0, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->$isLoading$delegate:Landroidx/compose/runtime/MutableState;
    :try_end_8
    .catch Landroidx/credentials/exceptions/GetCredentialCancellationException; {:try_start_8 .. :try_end_8} :catch_2
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    move/from16 v3, v16

    :try_start_9
    invoke-static {v0, v3}, Lcom/example/ui/screens/LoginScreenKt;->access$LoginScreen$lambda$2(Landroidx/compose/runtime/MutableState;Z)V
    :try_end_9
    .catch Landroidx/credentials/exceptions/GetCredentialCancellationException; {:try_start_9 .. :try_end_9} :catch_5
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0

    .line 165
    :try_start_a
    iget-object v0, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->$onLoginSuccess:Lkotlin/jvm/functions/Function3;

    invoke-interface {v0, v4, v14, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_15

    .line 167
    :cond_1a
    new-instance v0, Ljava/lang/Exception;

    const-string v2, "Unable to extract Google ID token"

    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_a
    .catch Landroidx/credentials/exceptions/GetCredentialCancellationException; {:try_start_a .. :try_end_a} :catch_2
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_0

    .line 173
    :goto_13
    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "CredentialManager failed ("

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "), launching standard GoogleSignInClient fallback"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    check-cast v0, Ljava/lang/Throwable;

    const-string v3, "Auth"

    invoke-static {v3, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    if-eqz v8, :cond_1b

    .line 176
    :try_start_b
    new-instance v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;

    sget-object v2, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->DEFAULT_SIGN_IN:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    invoke-direct {v0, v2}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;-><init>(Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V

    .line 177
    iget-object v2, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->$webClientId:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;->requestIdToken(Ljava/lang/String;)Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;

    move-result-object v0

    .line 178
    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;->requestEmail()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;

    move-result-object v0

    .line 179
    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;->requestProfile()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;

    move-result-object v0

    .line 180
    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;->build()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    move-result-object v0

    const-string v2, "build(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 181
    invoke-static {v8, v0}, Lcom/google/android/gms/auth/api/signin/GoogleSignIn;->getClient(Landroid/app/Activity;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;

    move-result-object v0

    const-string v2, "getClient(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 182
    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;->signOut()Lcom/google/android/gms/tasks/Task;

    .line 183
    iget-object v2, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->$googleSignInLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;->getSignInIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v4, "getSignInIntent(...)"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Landroidx/activity/compose/ManagedActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 184
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_4

    return-object v0

    :catch_4
    move-exception v0

    .line 186
    const-string v2, "GoogleSignInClient fallback also failed"

    check-cast v0, Ljava/lang/Throwable;

    invoke-static {v3, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 189
    :cond_1b
    iget-object v0, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->$isLoading$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v3, 0x0

    invoke-static {v0, v3}, Lcom/example/ui/screens/LoginScreenKt;->access$LoginScreen$lambda$2(Landroidx/compose/runtime/MutableState;Z)V

    iget-object v0, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->$onLoginSuccess:Lkotlin/jvm/functions/Function3;

    const-string v2, "chindhulurushivasumukesh@gmail.com"

    const-string v3, "Shiva Sumukesh Chindhuluru"

    const-string v4, ""

    invoke-interface {v0, v2, v3, v4}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_15

    .line 171
    :catch_5
    :goto_14
    iget-object v0, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->$isLoading$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v0, v3}, Lcom/example/ui/screens/LoginScreenKt;->access$LoginScreen$lambda$2(Landroidx/compose/runtime/MutableState;Z)V

    iget-object v0, v1, Lcom/example/ui/screens/LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1;->$onLoginSuccess:Lkotlin/jvm/functions/Function3;

    const-string v2, "chindhulurushivasumukesh@gmail.com"

    const-string v3, "Shiva Sumukesh Chindhuluru"

    const-string v4, ""

    invoke-interface {v0, v2, v3, v4}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    :goto_15
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method
