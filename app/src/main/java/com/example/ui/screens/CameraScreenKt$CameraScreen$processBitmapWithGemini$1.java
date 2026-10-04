package com.example.ui.screens;

import android.content.Context;
import android.location.Location;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: CameraScreen.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.screens.CameraScreenKt$CameraScreen$processBitmapWithGemini$1", f = "CameraScreen.kt", i = {1, 2, 2, 2, 2}, l = {159, 161, 171}, m = "invokeSuspend", n = {"loc", "loc", "geocoder", "addresses", "addressStr"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3"})
final class CameraScreenKt$CameraScreen$processBitmapWithGemini$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<Double> $latitude$delegate;
    final /* synthetic */ MutableState<Double> $longitude$delegate;
    final /* synthetic */ MutableState<String> $pickupAddress$delegate;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraScreenKt$CameraScreen$processBitmapWithGemini$1(Context context, MutableState<Double> mutableState, MutableState<Double> mutableState2, MutableState<String> mutableState3, Continuation<? super CameraScreenKt$CameraScreen$processBitmapWithGemini$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$latitude$delegate = mutableState;
        this.$longitude$delegate = mutableState2;
        this.$pickupAddress$delegate = mutableState3;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CameraScreenKt$CameraScreen$processBitmapWithGemini$1(this.$context, this.$latitude$delegate, this.$longitude$delegate, this.$pickupAddress$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e0, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.example.ui.screens.CameraScreenKt$CameraScreen$processBitmapWithGemini$1.AnonymousClass2(r5, r10.$pickupAddress$delegate, null), (kotlin.coroutines.Continuation) r10) == r0) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.CameraScreenKt$CameraScreen$processBitmapWithGemini$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: renamed from: com.example.ui.screens.CameraScreenKt$CameraScreen$processBitmapWithGemini$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: CameraScreen.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.screens.CameraScreenKt$CameraScreen$processBitmapWithGemini$1$1", f = "CameraScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableState<Double> $latitude$delegate;
        final /* synthetic */ Location $loc;
        final /* synthetic */ MutableState<Double> $longitude$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Location location, MutableState<Double> mutableState, MutableState<Double> mutableState2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$loc = location;
            this.$latitude$delegate = mutableState;
            this.$longitude$delegate = mutableState2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$loc, this.$latitude$delegate, this.$longitude$delegate, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$latitude$delegate.setValue(Boxing.boxDouble(this.$loc.getLatitude()));
            this.$longitude$delegate.setValue(Boxing.boxDouble(this.$loc.getLongitude()));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.example.ui.screens.CameraScreenKt$CameraScreen$processBitmapWithGemini$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: CameraScreen.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.screens.CameraScreenKt$CameraScreen$processBitmapWithGemini$1$2", f = "CameraScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $addressStr;
        final /* synthetic */ MutableState<String> $pickupAddress$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, MutableState<String> mutableState, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$addressStr = str;
            this.$pickupAddress$delegate = mutableState;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$addressStr, this.$pickupAddress$delegate, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$pickupAddress$delegate.setValue(this.$addressStr);
            return Unit.INSTANCE;
        }
    }
}
