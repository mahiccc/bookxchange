package com.example.ui.screens;

import android.content.Context;
import android.location.Address;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: SafeMeetupDialog.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.screens.SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1", f = "SafeMeetupDialog.kt", i = {0, 0, 0, 0, 1}, l = {139, 144}, m = "invokeSuspend", n = {"geocoder", "citySuffix", "results", "mapped", "<unused var>"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0"})
final class SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<String> $detectedCity$delegate;
    final /* synthetic */ MutableState<List<SafeSpotOption>> $geocodedResults$delegate;
    final /* synthetic */ MutableState<Boolean> $isSearchingPlaces$delegate;
    final /* synthetic */ String $query;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1(Context context, String str, MutableState<String> mutableState, MutableState<List<SafeSpotOption>> mutableState2, MutableState<Boolean> mutableState3, Continuation<? super SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$query = str;
        this.$detectedCity$delegate = mutableState;
        this.$geocodedResults$delegate = mutableState2;
        this.$isSearchingPlaces$delegate = mutableState3;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1(this.$context, this.$query, this.$detectedCity$delegate, this.$geocodedResults$delegate, this.$isSearchingPlaces$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0154, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.example.ui.screens.SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1.AnonymousClass1(r11, r25.$geocodedResults$delegate, r25.$isSearchingPlaces$delegate, null), (kotlin.coroutines.Continuation) r25) == r2) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x017d, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.example.ui.screens.SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1.AnonymousClass3(r25.$isSearchingPlaces$delegate, null), (kotlin.coroutines.Continuation) r25) == r2) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x017f, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    static final CharSequence invokeSuspend$lambda$2$lambda$0(Address address, int i) {
        String addressLine = address.getAddressLine(i);
        Intrinsics.checkNotNullExpressionValue(addressLine, "getAddressLine(...)");
        return addressLine;
    }

    /* JADX INFO: renamed from: com.example.ui.screens.SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: SafeMeetupDialog.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.screens.SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1$1", f = "SafeMeetupDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableState<List<SafeSpotOption>> $geocodedResults$delegate;
        final /* synthetic */ MutableState<Boolean> $isSearchingPlaces$delegate;
        final /* synthetic */ List<SafeSpotOption> $mapped;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(List<SafeSpotOption> list, MutableState<List<SafeSpotOption>> mutableState, MutableState<Boolean> mutableState2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$mapped = list;
            this.$geocodedResults$delegate = mutableState;
            this.$isSearchingPlaces$delegate = mutableState2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$mapped, this.$geocodedResults$delegate, this.$isSearchingPlaces$delegate, continuation);
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
            this.$geocodedResults$delegate.setValue(this.$mapped);
            SafeMeetupDialogKt.SafeMeetupDialog$lambda$14(this.$isSearchingPlaces$delegate, false);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.example.ui.screens.SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1$3, reason: invalid class name */
    /* JADX INFO: compiled from: SafeMeetupDialog.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.screens.SafeMeetupDialogKt$SafeMeetupDialog$performPlaceSearch$1$3", f = "SafeMeetupDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableState<Boolean> $isSearchingPlaces$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(MutableState<Boolean> mutableState, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$isSearchingPlaces$delegate = mutableState;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$isSearchingPlaces$delegate, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                SafeMeetupDialogKt.SafeMeetupDialog$lambda$14(this.$isSearchingPlaces$delegate, false);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
