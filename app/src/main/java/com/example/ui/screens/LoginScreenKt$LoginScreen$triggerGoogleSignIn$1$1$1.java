package com.example.ui.screens;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.ActivityResult;
import androidx.compose.runtime.MutableState;
import androidx.credentials.CredentialManager;
import androidx.credentials.CredentialOption;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption;
import com.google.android.libraries.identity.googleid.GoogleIdTokenCredential;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.tasks.TasksKt;

/* JADX INFO: compiled from: LoginScreen.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.screens.LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1", f = "LoginScreen.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {131, 155}, m = "invokeSuspend", n = {"activity", "credContext", "credentialManager", "googleIdOption", "request", "activity", "credContext", "credentialManager", "googleIdOption", "request", "result", "credential", "extractedName", "extractedPicUrl", "idToken", "authCredential"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10"})
final class LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<String> $errorMessage$delegate;
    final /* synthetic */ ManagedActivityResultLauncher<Intent, ActivityResult> $googleSignInLauncher;
    final /* synthetic */ MutableState<Boolean> $isLoading$delegate;
    final /* synthetic */ MutableState<String> $loadingMessage$delegate;
    final /* synthetic */ Function3<String, String, String, Unit> $onLoginSuccess;
    final /* synthetic */ String $webClientId;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1(Context context, String str, Function3<? super String, ? super String, ? super String, Unit> function3, ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher, MutableState<String> mutableState, MutableState<Boolean> mutableState2, MutableState<String> mutableState3, Continuation<? super LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$webClientId = str;
        this.$onLoginSuccess = function3;
        this.$googleSignInLauncher = managedActivityResultLauncher;
        this.$loadingMessage$delegate = mutableState;
        this.$isLoading$delegate = mutableState2;
        this.$errorMessage$delegate = mutableState3;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1(this.$context, this.$webClientId, this.$onLoginSuccess, this.$googleSignInLauncher, this.$loadingMessage$delegate, this.$isLoading$delegate, this.$errorMessage$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0250  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b8 A[Catch: Exception -> 0x0049, GetCredentialCancellationException -> 0x01ad, TRY_ENTER, TryCatch #1 {Exception -> 0x0049, blocks: (B:7:0x003f, B:49:0x019e, B:51:0x01a6, B:56:0x01b3, B:58:0x01b8, B:68:0x01cb, B:70:0x01d1, B:72:0x01d6, B:81:0x01e8, B:84:0x022b, B:86:0x0230, B:95:0x0241, B:97:0x0247, B:102:0x0251, B:104:0x0255, B:105:0x0258, B:28:0x00db, B:30:0x00e5, B:32:0x00f5, B:34:0x00fb, B:45:0x013d, B:106:0x025f, B:107:0x0266, B:35:0x0106, B:37:0x0112, B:39:0x0126, B:41:0x012d, B:24:0x008c), top: B:119:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x01cb A[Catch: Exception -> 0x0049, GetCredentialCancellationException -> 0x01ad, TryCatch #1 {Exception -> 0x0049, blocks: (B:7:0x003f, B:49:0x019e, B:51:0x01a6, B:56:0x01b3, B:58:0x01b8, B:68:0x01cb, B:70:0x01d1, B:72:0x01d6, B:81:0x01e8, B:84:0x022b, B:86:0x0230, B:95:0x0241, B:97:0x0247, B:102:0x0251, B:104:0x0255, B:105:0x0258, B:28:0x00db, B:30:0x00e5, B:32:0x00f5, B:34:0x00fb, B:45:0x013d, B:106:0x025f, B:107:0x0266, B:35:0x0106, B:37:0x0112, B:39:0x0126, B:41:0x012d, B:24:0x008c), top: B:119:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d6 A[Catch: Exception -> 0x0049, GetCredentialCancellationException -> 0x01ad, TryCatch #1 {Exception -> 0x0049, blocks: (B:7:0x003f, B:49:0x019e, B:51:0x01a6, B:56:0x01b3, B:58:0x01b8, B:68:0x01cb, B:70:0x01d1, B:72:0x01d6, B:81:0x01e8, B:84:0x022b, B:86:0x0230, B:95:0x0241, B:97:0x0247, B:102:0x0251, B:104:0x0255, B:105:0x0258, B:28:0x00db, B:30:0x00e5, B:32:0x00f5, B:34:0x00fb, B:45:0x013d, B:106:0x025f, B:107:0x0266, B:35:0x0106, B:37:0x0112, B:39:0x0126, B:41:0x012d, B:24:0x008c), top: B:119:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e8 A[Catch: Exception -> 0x0049, GetCredentialCancellationException -> 0x01ad, TRY_LEAVE, TryCatch #1 {Exception -> 0x0049, blocks: (B:7:0x003f, B:49:0x019e, B:51:0x01a6, B:56:0x01b3, B:58:0x01b8, B:68:0x01cb, B:70:0x01d1, B:72:0x01d6, B:81:0x01e8, B:84:0x022b, B:86:0x0230, B:95:0x0241, B:97:0x0247, B:102:0x0251, B:104:0x0255, B:105:0x0258, B:28:0x00db, B:30:0x00e5, B:32:0x00f5, B:34:0x00fb, B:45:0x013d, B:106:0x025f, B:107:0x0266, B:35:0x0106, B:37:0x0112, B:39:0x0126, B:41:0x012d, B:24:0x008c), top: B:119:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0229 A[PHI: r14
      0x0229: PHI (r14v15 java.lang.String) = (r14v14 java.lang.String), (r14v18 java.lang.String) binds: [B:66:0x01c7, B:80:0x01e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x0230 A[Catch: Exception -> 0x0049, GetCredentialCancellationException -> 0x01ad, TRY_ENTER, TryCatch #1 {Exception -> 0x0049, blocks: (B:7:0x003f, B:49:0x019e, B:51:0x01a6, B:56:0x01b3, B:58:0x01b8, B:68:0x01cb, B:70:0x01d1, B:72:0x01d6, B:81:0x01e8, B:84:0x022b, B:86:0x0230, B:95:0x0241, B:97:0x0247, B:102:0x0251, B:104:0x0255, B:105:0x0258, B:28:0x00db, B:30:0x00e5, B:32:0x00f5, B:34:0x00fb, B:45:0x013d, B:106:0x025f, B:107:0x0266, B:35:0x0106, B:37:0x0112, B:39:0x0126, B:41:0x012d, B:24:0x008c), top: B:119:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:91:0x023b  */
    /* JADX WARN: Code duplicated, block: B:92:0x023c  */
    /* JADX WARN: Code duplicated, block: B:94:0x023f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0241 A[Catch: Exception -> 0x0049, GetCredentialCancellationException -> 0x01ad, TryCatch #1 {Exception -> 0x0049, blocks: (B:7:0x003f, B:49:0x019e, B:51:0x01a6, B:56:0x01b3, B:58:0x01b8, B:68:0x01cb, B:70:0x01d1, B:72:0x01d6, B:81:0x01e8, B:84:0x022b, B:86:0x0230, B:95:0x0241, B:97:0x0247, B:102:0x0251, B:104:0x0255, B:105:0x0258, B:28:0x00db, B:30:0x00e5, B:32:0x00f5, B:34:0x00fb, B:45:0x013d, B:106:0x025f, B:107:0x0266, B:35:0x0106, B:37:0x0112, B:39:0x0126, B:41:0x012d, B:24:0x008c), top: B:119:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:99:0x024d  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Activity activityFindActivity;
        Object credential;
        GetSignInWithGoogleOption getSignInWithGoogleOption;
        GetCredentialRequest getCredentialRequest;
        Context context;
        CredentialManager credentialManager;
        String idToken;
        String displayName;
        String string;
        char c;
        Object objAwait;
        String str;
        FirebaseUser user;
        String email;
        String str2;
        char c2;
        char c3;
        String string2;
        String str3;
        Uri photoUrl;
        String displayName2;
        String str4;
        char c4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    activityFindActivity = CameraScreenKt.findActivity(this.$context);
                    Context context2 = activityFindActivity != null ? activityFindActivity : this.$context;
                    CredentialManager credentialManagerCreate = CredentialManager.Companion.create(context2);
                    GetSignInWithGoogleOption getSignInWithGoogleOptionBuild = new GetSignInWithGoogleOption.Builder(this.$webClientId).build();
                    GetCredentialRequest getCredentialRequestBuild = new GetCredentialRequest.Builder().addCredentialOption((CredentialOption) getSignInWithGoogleOptionBuild).build();
                    this.L$0 = activityFindActivity;
                    this.L$1 = SpillingKt.nullOutSpilledVariable(context2);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(credentialManagerCreate);
                    this.L$3 = SpillingKt.nullOutSpilledVariable(getSignInWithGoogleOptionBuild);
                    this.L$4 = SpillingKt.nullOutSpilledVariable(getCredentialRequestBuild);
                    this.label = 1;
                    credential = credentialManagerCreate.getCredential(context2, getCredentialRequestBuild, (Continuation) this);
                    if (credential != coroutine_suspended) {
                        getSignInWithGoogleOption = getSignInWithGoogleOptionBuild;
                        getCredentialRequest = getCredentialRequestBuild;
                        context = context2;
                        credentialManager = credentialManagerCreate;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    getCredentialRequest = (GetCredentialRequest) this.L$4;
                    GetSignInWithGoogleOption getSignInWithGoogleOption2 = (GetSignInWithGoogleOption) this.L$3;
                    CredentialManager credentialManager2 = (CredentialManager) this.L$2;
                    Context context3 = (Context) this.L$1;
                    Activity activity = (Activity) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        getSignInWithGoogleOption = getSignInWithGoogleOption2;
                        activityFindActivity = activity;
                        context = context3;
                        credentialManager = credentialManager2;
                        credential = obj;
                    } catch (Exception e) {
                        e = e;
                        Log.w("Auth", "CredentialManager failed (" + e.getMessage() + "), launching standard GoogleSignInClient fallback", e);
                        if (activity != null) {
                            try {
                                GoogleSignInOptions googleSignInOptionsBuild = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestIdToken(this.$webClientId).requestEmail().requestProfile().build();
                                Intrinsics.checkNotNullExpressionValue(googleSignInOptionsBuild, "build(...)");
                                GoogleSignInClient client = GoogleSignIn.getClient(activity, googleSignInOptionsBuild);
                                Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
                                client.signOut();
                                ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher = this.$googleSignInLauncher;
                                Intent signInIntent = client.getSignInIntent();
                                Intrinsics.checkNotNullExpressionValue(signInIntent, "getSignInIntent(...)");
                                managedActivityResultLauncher.launch(signInIntent);
                                return Unit.INSTANCE;
                            } catch (Exception e2) {
                                Log.e("Auth", "GoogleSignInClient fallback also failed", e2);
                                LoginScreenKt.LoginScreen$lambda$2(this.$isLoading$delegate, false);
                                this.$errorMessage$delegate.setValue("Google Sign-In was cancelled or encountered a network issue. Please try again.");
                                return Unit.INSTANCE;
                            }
                        }
                        LoginScreenKt.LoginScreen$lambda$2(this.$isLoading$delegate, false);
                        this.$errorMessage$delegate.setValue("Google Sign-In was cancelled or encountered a network issue. Please try again.");
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) this.L$8;
                    String str5 = (String) this.L$7;
                    ResultKt.throwOnFailure(obj);
                    displayName = str5;
                    c = 0;
                    objAwait = obj;
                }
                user = ((AuthResult) objAwait).getUser();
                if (user != null) {
                    try {
                        email = user.getEmail();
                        if (email == null) {
                            email = "reader@bookxchange.app";
                        }
                        str2 = displayName;
                        if (str2 != null || StringsKt.isBlank(str2)) {
                            c2 = 1;
                        } else {
                            c2 = c;
                        }
                        if (c2 == 0) {
                            displayName = null;
                        }
                        if (displayName != null) {
                            c3 = 1;
                            string2 = null;
                        } else {
                            if (user != null) {
                                displayName2 = user.getDisplayName();
                            } else {
                                displayName2 = null;
                            }
                            str4 = displayName2;
                            if (str4 != null || StringsKt.isBlank(str4)) {
                                c4 = 1;
                            } else {
                                c4 = c;
                            }
                            if (c4 == 0) {
                                displayName = displayName2;
                            } else {
                                displayName = null;
                            }
                            if (displayName == null) {
                                string2 = null;
                                String strReplace$default = StringsKt.replace$default(StringsKt.substringBefore$default(email, "@", (String) null, 2, (Object) null), ".", " ", false, 4, (Object) null);
                                c3 = 1;
                                String[] strArr = new String[1];
                                strArr[c] = " ";
                                displayName = CollectionsKt.joinToString$default(StringsKt.split$default(strReplace$default, strArr, false, 0, 6, (Object) null), " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: com.example.ui.screens.LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1$$ExternalSyntheticLambda0
                                    public final Object invoke(Object obj2) {
                                        return LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1.invokeSuspend$lambda$3((String) obj2);
                                    }
                                }, 30, (Object) null);
                            } else {
                                c3 = 1;
                                string2 = null;
                            }
                        }
                        str3 = str;
                        if (str3 != null && !StringsKt.isBlank(str3)) {
                            c3 = c;
                        }
                        if (c3 == 0) {
                            str = string2;
                        }
                        if (str == null) {
                            if (user != null && (photoUrl = user.getPhotoUrl()) != null) {
                                string2 = photoUrl.toString();
                            }
                            if (string2 == null) {
                                str = "";
                            } else {
                                str = string2;
                            }
                        }
                        z = c;
                        try {
                            LoginScreenKt.LoginScreen$lambda$2(this.$isLoading$delegate, z);
                            this.$onLoginSuccess.invoke(email, displayName, str);
                        } catch (GetCredentialCancellationException unused) {
                            LoginScreenKt.LoginScreen$lambda$2(this.$isLoading$delegate, z);
                        }
                    } catch (GetCredentialCancellationException unused2) {
                        z = c;
                        LoginScreenKt.LoginScreen$lambda$2(this.$isLoading$delegate, z);
                        return Unit.INSTANCE;
                    }
                } else {
                    email = "reader@bookxchange.app";
                    str2 = displayName;
                    if (str2 != null) {
                        c2 = 1;
                    } else {
                        c2 = 1;
                    }
                    if (c2 == 0) {
                        displayName = null;
                    }
                    if (displayName != null) {
                        c3 = 1;
                        string2 = null;
                    } else {
                        if (user != null) {
                            displayName2 = user.getDisplayName();
                        } else {
                            displayName2 = null;
                        }
                        str4 = displayName2;
                        if (str4 != null) {
                            c4 = 1;
                        } else {
                            c4 = 1;
                        }
                        if (c4 == 0) {
                            displayName = displayName2;
                        } else {
                            displayName = null;
                        }
                        if (displayName == null) {
                            string2 = null;
                            String strReplace$default2 = StringsKt.replace$default(StringsKt.substringBefore$default(email, "@", (String) null, 2, (Object) null), ".", " ", false, 4, (Object) null);
                            c3 = 1;
                            String[] strArr2 = new String[1];
                            strArr2[c] = " ";
                            displayName = CollectionsKt.joinToString$default(StringsKt.split$default(strReplace$default2, strArr2, false, 0, 6, (Object) null), " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: com.example.ui.screens.LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1$$ExternalSyntheticLambda0
                                public final Object invoke(Object obj2) {
                                    return LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1.invokeSuspend$lambda$3((String) obj2);
                                }
                            }, 30, (Object) null);
                        } else {
                            c3 = 1;
                            string2 = null;
                        }
                    }
                    str3 = str;
                    if (str3 != null) {
                        c3 = c;
                    }
                    if (c3 == 0) {
                        str = string2;
                    }
                    if (str == null) {
                        if (user != null) {
                            string2 = photoUrl.toString();
                        }
                        if (string2 == null) {
                            str = "";
                        } else {
                            str = string2;
                        }
                    }
                    z = c;
                    LoginScreenKt.LoginScreen$lambda$2(this.$isLoading$delegate, z);
                    this.$onLoginSuccess.invoke(email, displayName, str);
                }
                return Unit.INSTANCE;
                GetCredentialResponse getCredentialResponse = (GetCredentialResponse) credential;
                GoogleIdTokenCredential credential2 = getCredentialResponse.getCredential();
                if (credential2 instanceof GoogleIdTokenCredential) {
                    displayName = credential2.getDisplayName();
                    Uri profilePictureUri = credential2.getProfilePictureUri();
                    string = profilePictureUri != null ? profilePictureUri.toString() : null;
                    idToken = credential2.getIdToken();
                } else if (Intrinsics.areEqual(credential2.getType(), "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL")) {
                    GoogleIdTokenCredential googleIdTokenCredentialCreateFrom = GoogleIdTokenCredential.Companion.createFrom(credential2.getData());
                    String displayName3 = googleIdTokenCredentialCreateFrom.getDisplayName();
                    Uri profilePictureUri2 = googleIdTokenCredentialCreateFrom.getProfilePictureUri();
                    String string3 = profilePictureUri2 != null ? profilePictureUri2.toString() : null;
                    idToken = googleIdTokenCredentialCreateFrom.getIdToken();
                    displayName = displayName3;
                    string = string3;
                } else {
                    idToken = null;
                    displayName = null;
                    string = null;
                }
                c = 0;
                if (idToken == null) {
                    throw new Exception("Unable to extract Google ID token");
                }
                this.$loadingMessage$delegate.setValue("Verifying Google Account...");
                AuthCredential credential3 = GoogleAuthProvider.getCredential(idToken, (String) null);
                Intrinsics.checkNotNullExpressionValue(credential3, "getCredential(...)");
                Task taskSignInWithCredential = FirebaseAuth.getInstance().signInWithCredential(credential3);
                Intrinsics.checkNotNullExpressionValue(taskSignInWithCredential, "signInWithCredential(...)");
                this.L$0 = activityFindActivity;
                this.L$1 = SpillingKt.nullOutSpilledVariable(context);
                this.L$2 = SpillingKt.nullOutSpilledVariable(credentialManager);
                this.L$3 = SpillingKt.nullOutSpilledVariable(getSignInWithGoogleOption);
                this.L$4 = SpillingKt.nullOutSpilledVariable(getCredentialRequest);
                this.L$5 = SpillingKt.nullOutSpilledVariable(getCredentialResponse);
                this.L$6 = SpillingKt.nullOutSpilledVariable(credential2);
                this.L$7 = displayName;
                this.L$8 = string;
                this.L$9 = SpillingKt.nullOutSpilledVariable(idToken);
                this.L$10 = SpillingKt.nullOutSpilledVariable(credential3);
                this.label = 2;
                objAwait = TasksKt.await(taskSignInWithCredential, (Continuation) this);
                if (objAwait != coroutine_suspended) {
                    str = string;
                    user = ((AuthResult) objAwait).getUser();
                    if (user != null) {
                        email = user.getEmail();
                        if (email == null) {
                            email = "reader@bookxchange.app";
                        }
                        str2 = displayName;
                        if (str2 != null) {
                            c2 = 1;
                        } else {
                            c2 = 1;
                        }
                        if (c2 == 0) {
                            displayName = null;
                        }
                        if (displayName != null) {
                            c3 = 1;
                            string2 = null;
                        } else {
                            if (user != null) {
                                displayName2 = user.getDisplayName();
                            } else {
                                displayName2 = null;
                            }
                            str4 = displayName2;
                            if (str4 != null) {
                                c4 = 1;
                            } else {
                                c4 = 1;
                            }
                            if (c4 == 0) {
                                displayName = displayName2;
                            } else {
                                displayName = null;
                            }
                            if (displayName == null) {
                                string2 = null;
                                String strReplace$default3 = StringsKt.replace$default(StringsKt.substringBefore$default(email, "@", (String) null, 2, (Object) null), ".", " ", false, 4, (Object) null);
                                c3 = 1;
                                String[] strArr3 = new String[1];
                                strArr3[c] = " ";
                                displayName = CollectionsKt.joinToString$default(StringsKt.split$default(strReplace$default3, strArr3, false, 0, 6, (Object) null), " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: com.example.ui.screens.LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1$$ExternalSyntheticLambda0
                                    public final Object invoke(Object obj2) {
                                        return LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1.invokeSuspend$lambda$3((String) obj2);
                                    }
                                }, 30, (Object) null);
                            } else {
                                c3 = 1;
                                string2 = null;
                            }
                        }
                        str3 = str;
                        if (str3 != null) {
                            c3 = c;
                        }
                        if (c3 == 0) {
                            str = string2;
                        }
                        if (str == null) {
                            if (user != null) {
                                string2 = photoUrl.toString();
                            }
                            if (string2 == null) {
                                str = "";
                            } else {
                                str = string2;
                            }
                        }
                        z = c;
                        LoginScreenKt.LoginScreen$lambda$2(this.$isLoading$delegate, z);
                        this.$onLoginSuccess.invoke(email, displayName, str);
                    } else {
                        email = "reader@bookxchange.app";
                        str2 = displayName;
                        if (str2 != null) {
                            c2 = 1;
                        } else {
                            c2 = 1;
                        }
                        if (c2 == 0) {
                            displayName = null;
                        }
                        if (displayName != null) {
                            c3 = 1;
                            string2 = null;
                        } else {
                            if (user != null) {
                                displayName2 = user.getDisplayName();
                            } else {
                                displayName2 = null;
                            }
                            str4 = displayName2;
                            if (str4 != null) {
                                c4 = 1;
                            } else {
                                c4 = 1;
                            }
                            if (c4 == 0) {
                                displayName = displayName2;
                            } else {
                                displayName = null;
                            }
                            if (displayName == null) {
                                string2 = null;
                                String strReplace$default4 = StringsKt.replace$default(StringsKt.substringBefore$default(email, "@", (String) null, 2, (Object) null), ".", " ", false, 4, (Object) null);
                                c3 = 1;
                                String[] strArr4 = new String[1];
                                strArr4[c] = " ";
                                displayName = CollectionsKt.joinToString$default(StringsKt.split$default(strReplace$default4, strArr4, false, 0, 6, (Object) null), " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: com.example.ui.screens.LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1$$ExternalSyntheticLambda0
                                    public final Object invoke(Object obj2) {
                                        return LoginScreenKt$LoginScreen$triggerGoogleSignIn$1$1$1.invokeSuspend$lambda$3((String) obj2);
                                    }
                                }, 30, (Object) null);
                            } else {
                                c3 = 1;
                                string2 = null;
                            }
                        }
                        str3 = str;
                        if (str3 != null) {
                            c3 = c;
                        }
                        if (c3 == 0) {
                            str = string2;
                        }
                        if (str == null) {
                            if (user != null) {
                                string2 = photoUrl.toString();
                            }
                            if (string2 == null) {
                                str = "";
                            } else {
                                str = string2;
                            }
                        }
                        z = c;
                        LoginScreenKt.LoginScreen$lambda$2(this.$isLoading$delegate, z);
                        this.$onLoginSuccess.invoke(email, displayName, str);
                    }
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            } catch (GetCredentialCancellationException unused3) {
                z = 0;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    static final CharSequence invokeSuspend$lambda$3(String str) {
        if (str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            String strValueOf = String.valueOf(str.charAt(0));
            Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            StringBuilder sbAppend = sb.append((Object) upperCase);
            String strSubstring = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            str = sbAppend.append(strSubstring).toString();
        }
        return str;
    }
}
