package com.example.ui.screens;

import androidx.compose.material3.SnackbarDuration;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.MutableIntState;
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
@DebugMetadata(c = "com.example.ui.screens.DashboardScreenKt$DashboardScreen$32$3$onLogReading$1$1$1", f = "DashboardScreen.kt", i = {}, l = {836}, m = "invokeSuspend", n = {}, s = {})
final class DashboardScreenKt$DashboardScreen$32$3$onLogReading$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $newMins;
    final /* synthetic */ SnackbarHostState $snackbarHostState;
    final /* synthetic */ MutableIntState $streakDays$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DashboardScreenKt$DashboardScreen$32$3$onLogReading$1$1$1(SnackbarHostState snackbarHostState, int i, MutableIntState mutableIntState, Continuation<? super DashboardScreenKt$DashboardScreen$32$3$onLogReading$1$1$1> continuation) {
        super(2, continuation);
        this.$snackbarHostState = snackbarHostState;
        this.$newMins = i;
        this.$streakDays$delegate = mutableIntState;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DashboardScreenKt$DashboardScreen$32$3$onLogReading$1$1$1(this.$snackbarHostState, this.$newMins, this.$streakDays$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SnackbarHostState snackbarHostState = this.$snackbarHostState;
            int i2 = this.$newMins;
            int iDashboardScreen$lambda$276$lambda$275$lambda$220 = DashboardScreenKt.DashboardScreen$lambda$276$lambda$275$lambda$220(this.$streakDays$delegate);
            this.label = 1;
            if (SnackbarHostState.showSnackbar$default(snackbarHostState, "🔥 Awesome! Logged 10 mins reading. Total today: " + i2 + "m (" + iDashboardScreen$lambda$276$lambda$275$lambda$220 + "-day streak!)", (String) null, false, (SnackbarDuration) null, (Continuation) this, 14, (Object) null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
