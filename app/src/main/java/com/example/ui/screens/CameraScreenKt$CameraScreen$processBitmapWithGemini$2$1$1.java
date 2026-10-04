package com.example.ui.screens;

import androidx.compose.runtime.MutableState;
import com.example.api.VolumeInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: CameraScreen.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.screens.CameraScreenKt$CameraScreen$processBitmapWithGemini$2$1$1", f = "CameraScreen.kt", i = {}, l = {538}, m = "invokeSuspend", n = {}, s = {})
final class CameraScreenKt$CameraScreen$processBitmapWithGemini$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<String> $author$delegate;
    final /* synthetic */ MutableState<Double> $averageRating$delegate;
    final /* synthetic */ MutableState<String> $description$delegate;
    final /* synthetic */ MutableState<String> $detectedIsbn$delegate;
    final /* synthetic */ MutableState<String> $genre$delegate;
    final /* synthetic */ String $googleBooksKey;
    final /* synthetic */ MutableState<List<VolumeInfo>> $googleBooksSearchResults$delegate;
    final /* synthetic */ MutableState<Boolean> $isEnrichedByExternalApis$delegate;
    final /* synthetic */ MutableState<Boolean> $isScanning$delegate;
    final /* synthetic */ MutableState<String> $language$delegate;
    final /* synthetic */ MutableState<String> $officialCoverUrl$delegate;
    final /* synthetic */ MutableState<Integer> $pageCount$delegate;
    final /* synthetic */ MutableState<String> $publishedDate$delegate;
    final /* synthetic */ MutableState<String> $publisher$delegate;
    final /* synthetic */ MutableState<String> $scanStatusMessage$delegate;
    final /* synthetic */ MutableState<String> $title$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraScreenKt$CameraScreen$processBitmapWithGemini$2$1$1(MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, String str, MutableState<String> mutableState4, MutableState<String> mutableState5, MutableState<String> mutableState6, MutableState<String> mutableState7, MutableState<Integer> mutableState8, MutableState<String> mutableState9, MutableState<Double> mutableState10, MutableState<String> mutableState11, MutableState<List<VolumeInfo>> mutableState12, MutableState<Boolean> mutableState13, MutableState<Boolean> mutableState14, MutableState<String> mutableState15, Continuation<? super CameraScreenKt$CameraScreen$processBitmapWithGemini$2$1$1> continuation) {
        super(2, continuation);
        this.$title$delegate = mutableState;
        this.$author$delegate = mutableState2;
        this.$detectedIsbn$delegate = mutableState3;
        this.$googleBooksKey = str;
        this.$description$delegate = mutableState4;
        this.$genre$delegate = mutableState5;
        this.$publisher$delegate = mutableState6;
        this.$publishedDate$delegate = mutableState7;
        this.$pageCount$delegate = mutableState8;
        this.$language$delegate = mutableState9;
        this.$averageRating$delegate = mutableState10;
        this.$officialCoverUrl$delegate = mutableState11;
        this.$googleBooksSearchResults$delegate = mutableState12;
        this.$isEnrichedByExternalApis$delegate = mutableState13;
        this.$isScanning$delegate = mutableState14;
        this.$scanStatusMessage$delegate = mutableState15;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CameraScreenKt$CameraScreen$processBitmapWithGemini$2$1$1(this.$title$delegate, this.$author$delegate, this.$detectedIsbn$delegate, this.$googleBooksKey, this.$description$delegate, this.$genre$delegate, this.$publisher$delegate, this.$publishedDate$delegate, this.$pageCount$delegate, this.$language$delegate, this.$averageRating$delegate, this.$officialCoverUrl$delegate, this.$googleBooksSearchResults$delegate, this.$isEnrichedByExternalApis$delegate, this.$isScanning$delegate, this.$scanStatusMessage$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = this.$googleBooksKey;
            MutableState<String> mutableState = this.$title$delegate;
            MutableState<String> mutableState2 = this.$author$delegate;
            MutableState<String> mutableState3 = this.$description$delegate;
            MutableState<String> mutableState4 = this.$genre$delegate;
            MutableState<String> mutableState5 = this.$publisher$delegate;
            MutableState<String> mutableState6 = this.$publishedDate$delegate;
            MutableState<Integer> mutableState7 = this.$pageCount$delegate;
            MutableState<String> mutableState8 = this.$language$delegate;
            MutableState<Double> mutableState9 = this.$averageRating$delegate;
            MutableState<String> mutableState10 = this.$officialCoverUrl$delegate;
            MutableState<String> mutableState11 = this.$detectedIsbn$delegate;
            MutableState<List<VolumeInfo>> mutableState12 = this.$googleBooksSearchResults$delegate;
            MutableState<Boolean> mutableState13 = this.$isEnrichedByExternalApis$delegate;
            String strCameraScreen$lambda$1 = CameraScreenKt.CameraScreen$lambda$1(mutableState);
            String strCameraScreen$lambda$4 = CameraScreenKt.CameraScreen$lambda$4(this.$author$delegate);
            String strCameraScreen$lambda$28 = CameraScreenKt.CameraScreen$lambda$28(this.$detectedIsbn$delegate);
            if (strCameraScreen$lambda$28 == null) {
                strCameraScreen$lambda$28 = "";
            }
            String str2 = strCameraScreen$lambda$28;
            this.label = 1;
            if (CameraScreenKt$CameraScreen$processBitmapWithGemini$2.invokeSuspend$enrichFromExternalAPIs(str, mutableState, mutableState2, mutableState3, mutableState4, mutableState5, mutableState6, mutableState7, mutableState8, mutableState9, mutableState10, mutableState11, mutableState12, mutableState13, strCameraScreen$lambda$1, strCameraScreen$lambda$4, str2, (Continuation) this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        CameraScreenKt.CameraScreen$lambda$17(this.$isScanning$delegate, false);
        this.$scanStatusMessage$delegate.setValue(null);
        return Unit.INSTANCE;
    }
}
