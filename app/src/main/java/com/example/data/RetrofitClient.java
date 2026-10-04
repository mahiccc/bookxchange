package com.example.data;

import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/example/data/RetrofitClient;", "", "<init>", "()V", "BASE_URL", "", "okHttpClient", "Lokhttp3/OkHttpClient;", "service", "Lcom/example/data/GeminiApiService;", "getService", "()Lcom/example/data/GeminiApiService;", "service$delegate", "Lkotlin/Lazy;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RetrofitClient {
    private static final String BASE_URL = "https://generativelanguage.googleapis.com/";
    public static final RetrofitClient INSTANCE = new RetrofitClient();
    private static final OkHttpClient okHttpClient = new OkHttpClient.Builder().connectTimeout(60, TimeUnit.SECONDS).readTimeout(60, TimeUnit.SECONDS).writeTimeout(60, TimeUnit.SECONDS).build();

    /* JADX INFO: renamed from: service$delegate, reason: from kotlin metadata */
    private static final Lazy service = LazyKt.lazy(new Function0() { // from class: com.example.data.RetrofitClient$$ExternalSyntheticLambda1
        public final Object invoke() {
            return RetrofitClient.service_delegate$lambda$1();
        }
    });
    public static final int $stable = 8;

    private RetrofitClient() {
    }

    public final GeminiApiService getService() {
        Object value = service.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (GeminiApiService) value;
    }

    static final GeminiApiService service_delegate$lambda$1() {
        return (GeminiApiService) new Retrofit.Builder().baseUrl(BASE_URL).client(okHttpClient).addConverterFactory(KotlinSerializationConverterFactory.create(JsonKt.Json$default((Json) null, new Function1() { // from class: com.example.data.RetrofitClient$$ExternalSyntheticLambda0
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
}
