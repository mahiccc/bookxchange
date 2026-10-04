package com.example.ui.screens;

import com.example.api.GoogleBooksResponse;
import com.example.api.RetrofitClient;
import com.example.api.VolumeItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: CameraScreen.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/example/api/GoogleBooksResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.screens.CameraScreenKt$CameraScreen$searchGoogleBooksManually$1$resp$1", f = "CameraScreen.kt", i = {1}, l = {130, 135}, m = "invokeSuspend", n = {"r"}, s = {"L$0"})
final class CameraScreenKt$CameraScreen$searchGoogleBooksManually$1$resp$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super GoogleBooksResponse>, Object> {
    final /* synthetic */ String $key;
    final /* synthetic */ String $query;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraScreenKt$CameraScreen$searchGoogleBooksManually$1$resp$1(String str, String str2, Continuation<? super CameraScreenKt$CameraScreen$searchGoogleBooksManually$1$resp$1> continuation) {
        super(2, continuation);
        this.$key = str;
        this.$query = str2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CameraScreenKt$CameraScreen$searchGoogleBooksManually$1$resp$1(this.$key, this.$query, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super GoogleBooksResponse> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    public final Object invokeSuspend(Object obj) {
        GoogleBooksResponse googleBooksResponse;
        GoogleBooksResponse googleBooksResponse2;
        Object objSearchBooks;
        List<VolumeItem> items;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (StringsKt.isBlank(this.$key)) {
                        googleBooksResponse = null;
                        if (googleBooksResponse == null && (items = googleBooksResponse.getItems()) != null && !items.isEmpty()) {
                            return googleBooksResponse;
                        }
                        this.L$0 = googleBooksResponse;
                        this.label = 2;
                        objSearchBooks = RetrofitClient.INSTANCE.getGoogleBooksService().searchBooks(StringsKt.trim(this.$query).toString(), 5, null, (Continuation) this);
                        if (objSearchBooks != coroutine_suspended) {
                            GoogleBooksResponse googleBooksResponse3 = googleBooksResponse;
                            obj = objSearchBooks;
                            googleBooksResponse2 = googleBooksResponse3;
                            return (GoogleBooksResponse) obj;
                        }
                    } else {
                        this.label = 1;
                        obj = RetrofitClient.INSTANCE.getGoogleBooksService().searchBooks(StringsKt.trim(this.$query).toString(), 5, this.$key, (Continuation) this);
                        if (obj == coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    googleBooksResponse2 = (GoogleBooksResponse) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        return (GoogleBooksResponse) obj;
                    } catch (Exception unused) {
                        return googleBooksResponse2;
                    }
                }
                ResultKt.throwOnFailure(obj);
                googleBooksResponse = (GoogleBooksResponse) obj;
            } catch (Exception unused2) {
            }
            this.L$0 = googleBooksResponse;
            this.label = 2;
            objSearchBooks = RetrofitClient.INSTANCE.getGoogleBooksService().searchBooks(StringsKt.trim(this.$query).toString(), 5, null, (Continuation) this);
            if (objSearchBooks != coroutine_suspended) {
                GoogleBooksResponse googleBooksResponse4 = googleBooksResponse;
                obj = objSearchBooks;
                googleBooksResponse2 = googleBooksResponse4;
                return (GoogleBooksResponse) obj;
            }
            return coroutine_suspended;
        } catch (Exception unused3) {
            googleBooksResponse2 = googleBooksResponse;
            return googleBooksResponse2;
        }
        if (googleBooksResponse == null) {
        }
    }
}
