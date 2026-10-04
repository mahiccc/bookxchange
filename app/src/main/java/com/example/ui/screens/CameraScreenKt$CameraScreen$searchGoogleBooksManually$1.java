package com.example.ui.screens;

import androidx.compose.runtime.MutableState;
import com.example.api.GoogleBooksResponse;
import com.example.api.VolumeInfo;
import com.example.api.VolumeItem;
import com.example.security.SecureKeyProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: CameraScreen.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.screens.CameraScreenKt$CameraScreen$searchGoogleBooksManually$1", f = "CameraScreen.kt", i = {0}, l = {126}, m = "invokeSuspend", n = {"key"}, s = {"L$0"})
final class CameraScreenKt$CameraScreen$searchGoogleBooksManually$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<List<VolumeInfo>> $googleBooksSearchResults$delegate;
    final /* synthetic */ MutableState<Boolean> $isSearchingGoogleBooks$delegate;
    final /* synthetic */ String $query;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraScreenKt$CameraScreen$searchGoogleBooksManually$1(String str, MutableState<List<VolumeInfo>> mutableState, MutableState<Boolean> mutableState2, Continuation<? super CameraScreenKt$CameraScreen$searchGoogleBooksManually$1> continuation) {
        super(2, continuation);
        this.$query = str;
        this.$googleBooksSearchResults$delegate = mutableState;
        this.$isSearchingGoogleBooks$delegate = mutableState2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CameraScreenKt$CameraScreen$searchGoogleBooksManually$1(this.$query, this.$googleBooksSearchResults$delegate, this.$isSearchingGoogleBooks$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ArrayList arrayListEmptyList;
        List<VolumeItem> items;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String googleBooksApiKey = SecureKeyProvider.getGoogleBooksApiKey();
                this.L$0 = SpillingKt.nullOutSpilledVariable(googleBooksApiKey);
                this.label = 1;
                obj = BuildersKt.withContext(Dispatchers.getIO(), new CameraScreenKt$CameraScreen$searchGoogleBooksManually$1$resp$1(googleBooksApiKey, this.$query, null), (Continuation) this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            GoogleBooksResponse googleBooksResponse = (GoogleBooksResponse) obj;
            MutableState<List<VolumeInfo>> mutableState = this.$googleBooksSearchResults$delegate;
            if (googleBooksResponse == null || (items = googleBooksResponse.getItems()) == null) {
                arrayListEmptyList = CollectionsKt.emptyList();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = items.iterator();
                while (it.hasNext()) {
                    VolumeInfo volumeInfo = ((VolumeItem) it.next()).getVolumeInfo();
                    if (volumeInfo != null) {
                        arrayList.add(volumeInfo);
                    }
                }
                arrayListEmptyList = arrayList;
            }
            mutableState.setValue(arrayListEmptyList);
        } catch (Exception unused) {
            this.$googleBooksSearchResults$delegate.setValue(CollectionsKt.emptyList());
        } finally {
            CameraScreenKt.CameraScreen$lambda$74(this.$isSearchingGoogleBooks$delegate, false);
        }
        return Unit.INSTANCE;
    }
}
