package com.example.ui.screens;

import android.net.Uri;
import android.util.Log;
import androidx.compose.runtime.MutableState;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.tasks.TasksKt;

/* JADX INFO: compiled from: LoginScreen.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.screens.LoginScreenKt$LoginScreen$googleSignInLauncher$1$1$1", f = "LoginScreen.kt", i = {0}, l = {83}, m = "invokeSuspend", n = {"authCredential"}, s = {"L$0"})
final class LoginScreenKt$LoginScreen$googleSignInLauncher$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ GoogleSignInAccount $account;
    final /* synthetic */ MutableState<String> $errorMessage$delegate;
    final /* synthetic */ String $idToken;
    final /* synthetic */ MutableState<Boolean> $isLoading$delegate;
    final /* synthetic */ Function3<String, String, String, Unit> $onLoginSuccess;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    LoginScreenKt$LoginScreen$googleSignInLauncher$1$1$1(String str, GoogleSignInAccount googleSignInAccount, Function3<? super String, ? super String, ? super String, Unit> function3, MutableState<String> mutableState, MutableState<Boolean> mutableState2, Continuation<? super LoginScreenKt$LoginScreen$googleSignInLauncher$1$1$1> continuation) {
        super(2, continuation);
        this.$idToken = str;
        this.$account = googleSignInAccount;
        this.$onLoginSuccess = function3;
        this.$errorMessage$delegate = mutableState;
        this.$isLoading$delegate = mutableState2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LoginScreenKt$LoginScreen$googleSignInLauncher$1$1$1(this.$idToken, this.$account, this.$onLoginSuccess, this.$errorMessage$delegate, this.$isLoading$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        String email;
        String string;
        Uri photoUrl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        String string2 = null;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AuthCredential credential = GoogleAuthProvider.getCredential(this.$idToken, (String) null);
                Intrinsics.checkNotNullExpressionValue(credential, "getCredential(...)");
                Task taskSignInWithCredential = FirebaseAuth.getInstance().signInWithCredential(credential);
                Intrinsics.checkNotNullExpressionValue(taskSignInWithCredential, "signInWithCredential(...)");
                this.L$0 = SpillingKt.nullOutSpilledVariable(credential);
                this.label = 1;
                obj = TasksKt.await(taskSignInWithCredential, (Continuation) this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            FirebaseUser user = ((AuthResult) obj).getUser();
            if ((user == null || (email = user.getEmail()) == null) && (email = this.$account.getEmail()) == null) {
                email = "reader@gmail.com";
            }
            String displayName = this.$account.getDisplayName();
            if (displayName == null) {
                displayName = user != null ? user.getDisplayName() : null;
                if (displayName == null) {
                    displayName = StringsKt.substringBefore$default(email, "@", (String) null, 2, (Object) null);
                }
            }
            Uri photoUrl2 = this.$account.getPhotoUrl();
            if (photoUrl2 == null || (string = photoUrl2.toString()) == null) {
                if (user != null && (photoUrl = user.getPhotoUrl()) != null) {
                    string2 = photoUrl.toString();
                }
                string = string2 == null ? "" : string2;
            }
            this.$onLoginSuccess.invoke(email, displayName, string);
        } catch (Exception e) {
            Log.e("Auth", "Firebase credential auth failed", e);
            this.$errorMessage$delegate.setValue("Firebase authentication failed: " + e.getLocalizedMessage() + ". Please try again.");
        } finally {
            LoginScreenKt.LoginScreen$lambda$2(this.$isLoading$delegate, false);
        }
        return Unit.INSTANCE;
    }
}
