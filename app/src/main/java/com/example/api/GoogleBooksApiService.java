package com.example.api;

import com.google.android.gms.actions.SearchIntents;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: compiled from: GoogleBooksApiService.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0002\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/example/api/GoogleBooksApiService;", "", "searchBooks", "Lcom/example/api/GoogleBooksResponse;", SearchIntents.EXTRA_QUERY, "", "maxResults", "", "apiKey", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface GoogleBooksApiService {
    @GET("books/v1/volumes")
    Object searchBooks(@Query("q") String str, @Query("maxResults") int i, @Query("key") String str2, Continuation<? super GoogleBooksResponse> continuation);

    /* JADX INFO: compiled from: GoogleBooksApiService.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object searchBooks$default(GoogleBooksApiService googleBooksApiService, String str, int i, String str2, Continuation continuation, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: searchBooks");
        }
        if ((i2 & 2) != 0) {
            i = 3;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        return googleBooksApiService.searchBooks(str, i, str2, continuation);
    }
}
