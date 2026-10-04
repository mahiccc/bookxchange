package com.example.api;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.kotlinx.serialization.KotlinSerializationConverterFactory;

/* JADX INFO: compiled from: GeminiApiService.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00172\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0019H\u0086@¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/example/api/RetrofitClient;", "", "<init>", "()V", "BASE_URL", "", "okHttpClient", "Lokhttp3/OkHttpClient;", "service", "Lcom/example/api/GeminiApiService;", "getService", "()Lcom/example/api/GeminiApiService;", "service$delegate", "Lkotlin/Lazy;", "googleBooksService", "Lcom/example/api/GoogleBooksApiService;", "getGoogleBooksService", "()Lcom/example/api/GoogleBooksApiService;", "googleBooksService$delegate", "generateWithResilientModelChain", "Lcom/example/api/GenerateContentResponse;", "apiKey", "request", "Lcom/example/api/GenerateContentRequest;", "preferredModels", "", "(Ljava/lang/String;Lcom/example/api/GenerateContentRequest;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RetrofitClient {
    private static final String BASE_URL = "https://generativelanguage.googleapis.com/";
    public static final RetrofitClient INSTANCE = new RetrofitClient();
    private static final OkHttpClient okHttpClient = new OkHttpClient.Builder().connectTimeout(60, TimeUnit.SECONDS).readTimeout(60, TimeUnit.SECONDS).writeTimeout(60, TimeUnit.SECONDS).build();

    /* JADX INFO: renamed from: service$delegate, reason: from kotlin metadata */
    private static final Lazy service = LazyKt.lazy(new Function0() { // from class: com.example.api.RetrofitClient$$ExternalSyntheticLambda1
        public final Object invoke() {
            return RetrofitClient.service_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: googleBooksService$delegate, reason: from kotlin metadata */
    private static final Lazy googleBooksService = LazyKt.lazy(new Function0() { // from class: com.example.api.RetrofitClient$$ExternalSyntheticLambda2
        public final Object invoke() {
            return RetrofitClient.googleBooksService_delegate$lambda$3();
        }
    });
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.example.api.RetrofitClient$generateWithResilientModelChain$1, reason: invalid class name */
    /* JADX INFO: compiled from: GeminiApiService.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.api.RetrofitClient", f = "GeminiApiService.kt", i = {0, 0, 0, 0, 0}, l = {130}, m = "generateWithResilientModelChain", n = {"apiKey", "request", "preferredModels", "lastException", "model"}, s = {"L$0", "L$1", "L$2", "L$3", "L$5"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RetrofitClient.this.generateWithResilientModelChain(null, null, null, (Continuation) this);
        }
    }

    private RetrofitClient() {
    }

    public final GeminiApiService getService() {
        Object value = service.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (GeminiApiService) value;
    }

    static final GeminiApiService service_delegate$lambda$1() {
        return (GeminiApiService) new Retrofit.Builder().baseUrl(BASE_URL).client(okHttpClient).addConverterFactory(KotlinSerializationConverterFactory.create(JsonKt.Json$default((Json) null, new Function1() { // from class: com.example.api.RetrofitClient$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return RetrofitClient.service_delegate$lambda$1$lambda$0((JsonBuilder) obj);
            }
        }, 1, (Object) null), MediaType.Companion.get("application/json"))).build().create(GeminiApiService.class);
    }

    static final Unit service_delegate$lambda$1$lambda$0(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "$this$Json");
        jsonBuilder.setIgnoreUnknownKeys(true);
        return Unit.INSTANCE;
    }

    public final GoogleBooksApiService getGoogleBooksService() {
        Object value = googleBooksService.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (GoogleBooksApiService) value;
    }

    static final GoogleBooksApiService googleBooksService_delegate$lambda$3() {
        return (GoogleBooksApiService) new Retrofit.Builder().baseUrl("https://www.googleapis.com/").client(okHttpClient).addConverterFactory(KotlinSerializationConverterFactory.create(JsonKt.Json$default((Json) null, new Function1() { // from class: com.example.api.RetrofitClient$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return RetrofitClient.googleBooksService_delegate$lambda$3$lambda$2((JsonBuilder) obj);
            }
        }, 1, (Object) null), MediaType.Companion.get("application/json"))).build().create(GoogleBooksApiService.class);
    }

    static final Unit googleBooksService_delegate$lambda$3$lambda$2(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "$this$Json");
        jsonBuilder.setIgnoreUnknownKeys(true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object generateWithResilientModelChain(String str, GenerateContentRequest generateContentRequest, List<String> list, Continuation<? super GenerateContentResponse> continuation) throws Exception {
        AnonymousClass1 anonymousClass1;
        Exception e;
        String str2;
        Iterator<String> it;
        List<String> list2;
        GenerateContentRequest generateContentRequest2;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            e = null;
            str2 = str;
            it = list.iterator();
            list2 = list;
            generateContentRequest2 = generateContentRequest;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) anonymousClass1.L$4;
            List<String> list3 = (List) anonymousClass1.L$2;
            generateContentRequest2 = (GenerateContentRequest) anonymousClass1.L$1;
            String str3 = (String) anonymousClass1.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                return obj;
            } catch (Exception e2) {
                list2 = list3;
                str2 = str3;
                e = e2;
            }
        }
        while (it.hasNext()) {
            String next = it.next();
            try {
                GeminiApiService service2 = this.getService();
                anonymousClass1.L$0 = str2;
                anonymousClass1.L$1 = generateContentRequest2;
                anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(list2);
                anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(e);
                anonymousClass1.L$4 = it;
                anonymousClass1.L$5 = SpillingKt.nullOutSpilledVariable(next);
                anonymousClass1.label = 1;
                Object objGenerateContentWithModel = service2.generateContentWithModel(next, str2, generateContentRequest2, anonymousClass1);
                return objGenerateContentWithModel == coroutine_suspended ? coroutine_suspended : objGenerateContentWithModel;
            } catch (Exception e3) {
                e = e3;
            }
        }
        if (e != null) {
            throw e;
        }
        throw new RuntimeException("All Gemini models failed");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object generateWithResilientModelChain$default(RetrofitClient retrofitClient, String str, GenerateContentRequest generateContentRequest, List list, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            list = CollectionsKt.listOf(new String[]{"gemini-3.5-flash-lite", "gemini-3.1-flash-lite", "gemini-3.6-flash", "gemini-3.8-flash", "gemini-3.5-flash"});
        }
        return retrofitClient.generateWithResilientModelChain(str, generateContentRequest, list, continuation);
    }
}
