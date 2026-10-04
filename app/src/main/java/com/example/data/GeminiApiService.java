package com.example.data;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: compiled from: GeminiApiService.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/example/data/GeminiApiService;", "", "generateContent", "Lcom/example/data/GenerateContentResponse;", "apiKey", "", "request", "Lcom/example/data/GenerateContentRequest;", "(Ljava/lang/String;Lcom/example/data/GenerateContentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface GeminiApiService {
    @POST("v1beta/models/gemini-3.5-flash-lite:generateContent")
    Object generateContent(@Query("key") String str, @Body GenerateContentRequest generateContentRequest, Continuation<? super GenerateContentResponse> continuation);
}
