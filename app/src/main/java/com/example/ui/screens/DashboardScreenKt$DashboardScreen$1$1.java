package com.example.ui.screens;

import android.content.Context;
import android.location.Location;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: DashboardScreen.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.screens.DashboardScreenKt$DashboardScreen$1$1", f = "DashboardScreen.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
final class DashboardScreenKt$DashboardScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<Location> $userLocation$delegate;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DashboardScreenKt$DashboardScreen$1$1(Context context, MutableState<Location> mutableState, Continuation<? super DashboardScreenKt$DashboardScreen$1$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$userLocation$delegate = mutableState;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DashboardScreenKt$DashboardScreen$1$1(this.$context, this.$userLocation$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        MutableState<Location> mutableState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MutableState<Location> mutableState2 = this.$userLocation$delegate;
            this.L$0 = mutableState2;
            this.label = 1;
            Object currentLocation = LocationHelperKt.getCurrentLocation(this.$context, (Continuation) this);
            if (currentLocation == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = currentLocation;
            mutableState = mutableState2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableState = (MutableState) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        mutableState.setValue((Location) obj);
        return Unit.INSTANCE;
    }
}
