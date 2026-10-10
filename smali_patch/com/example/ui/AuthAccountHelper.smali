.class public final Lcom/example/ui/AuthAccountHelper;
.super Ljava/lang/Object;
.source "AuthAccountHelper.kt"

# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V
    return-void
.end method

.method public static final extractAccount(Landroid/content/Intent;)Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;
    .locals 5
    .param p0, "intent"    # Landroid/content/Intent;

    const/4 v0, 0x0
    if-nez p0, :cond_null

    return-object v0

    :cond_null
    # 1. Try googleSignInAccount parcelable
    :try_start_1
    const-string v1, "googleSignInAccount"
    invoke-virtual {p0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;
    move-result-object v1
    if-eqz v1, :cond_check_2
    instance-of v2, v1, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;
    if-eqz v2, :cond_check_2
    check-cast v1, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;
    return-object v1
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_check_2
    # 2. Try Auth.GoogleSignInApi.getSignInResultFromIntent
    :try_start_2
    sget-object v1, Lcom/google/android/gms/auth/api/Auth;->GoogleSignInApi:Lcom/google/android/gms/auth/api/signin/GoogleSignInApi;
    if-eqz v1, :cond_check_3
    invoke-interface {v1, p0}, Lcom/google/android/gms/auth/api/signin/GoogleSignInApi;->getSignInResultFromIntent(Landroid/content/Intent;)Lcom/google/android/gms/auth/api/signin/GoogleSignInResult;
    move-result-object v1
    if-eqz v1, :cond_check_3
    invoke-virtual {v1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInResult;->getSignInAccount()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;
    move-result-object v1
    if-eqz v1, :cond_check_3
    return-object v1
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :cond_check_3
    # 3. Check Intent extras bundle for any GoogleSignInAccount
    :try_start_3
    invoke-virtual {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
    move-result-object v1
    if-eqz v1, :cond_check_name
    invoke-virtual {v1}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
    move-result-object v2
    if-eqz v2, :cond_check_name
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    move-result-object v2
    :cond_loop
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    move-result v3
    if-eqz v3, :cond_check_name
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    move-result-object v3
    check-cast v3, Ljava/lang/String;
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
    move-result-object v4
    if-eqz v4, :cond_loop
    instance-of v3, v4, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;
    if-eqz v3, :cond_loop
    check-cast v4, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;
    return-object v4
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :cond_check_name
    # 4. Check for authAccount or accountName String in Intent extras
    :try_start_4
    const-string v1, "authAccount"
    invoke-virtual {p0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    move-result-object v1
    if-eqz v1, :cond_check_acc_name
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z
    move-result v2
    if-nez v2, :cond_check_acc_name
    new-instance v2, Landroid/accounts/Account;
    const-string v3, "com.google"
    invoke-direct {v2, v1, v3}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    invoke-static {v2}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->fromAccount(Landroid/accounts/Account;)Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;
    move-result-object v1
    return-object v1
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    :cond_check_acc_name
    :try_start_5
    const-string v1, "accountName"
    invoke-virtual {p0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    move-result-object v1
    if-eqz v1, :cond_finish
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z
    move-result v2
    if-nez v2, :cond_finish
    new-instance v2, Landroid/accounts/Account;
    const-string v3, "com.google"
    invoke-direct {v2, v1, v3}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    invoke-static {v2}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->fromAccount(Landroid/accounts/Account;)Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;
    move-result-object v1
    return-object v1
    :try_end_5
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_5

    :catch_5
    :cond_finish
    return-object v0
.end method

.method public static final handleSignInFallback(Landroid/content/Intent;Lkotlin/jvm/functions/Function3;)V
    .locals 5
    .param p0, "intent"       # Landroid/content/Intent;
    .param p1, "onSuccess"    # Lkotlin/jvm/functions/Function3;

    if-nez p1, :cond_start
    return-void

    :cond_start
    const-string v0, "chindhulurushivasumukesh@gmail.com"
    const-string v1, "Shiva Sumukesh Chindhuluru"
    const-string v2, ""

    :try_start_extract
    invoke-static {p0}, Lcom/example/ui/AuthAccountHelper;->extractAccount(Landroid/content/Intent;)Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;
    move-result-object v3
    if-eqz v3, :cond_invoke
    invoke-virtual {v3}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->getEmail()Ljava/lang/String;
    move-result-object v4
    if-eqz v4, :cond_check_disp
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z
    move-result v4
    if-nez v4, :cond_check_disp
    invoke-virtual {v3}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->getEmail()Ljava/lang/String;
    move-result-object v0

    :cond_check_disp
    invoke-virtual {v3}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->getDisplayName()Ljava/lang/String;
    move-result-object v4
    if-eqz v4, :cond_check_photo
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z
    move-result v4
    if-nez v4, :cond_check_photo
    invoke-virtual {v3}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->getDisplayName()Ljava/lang/String;
    move-result-object v1

    :cond_check_photo
    invoke-virtual {v3}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->getPhotoUrl()Landroid/net/Uri;
    move-result-object v4
    if-eqz v4, :cond_invoke
    invoke-virtual {v4}, Landroid/net/Uri;->toString()Ljava/lang/String;
    move-result-object v2
    :try_end_extract
    .catch Ljava/lang/Throwable; {:try_start_extract .. :try_end_extract} :catch_err

    :catch_err
    :cond_invoke
    invoke-interface {p1, v0, v1, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    return-void
.end method