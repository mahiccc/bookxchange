package com.example.ui.screens;

import androidx.compose.material3.SnackbarHostState;
import com.example.ui.BookViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: DashboardScreen.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.screens.DashboardScreenKt$DashboardScreen$32$1$1$1", f = "DashboardScreen.kt", i = {1, 2, 3}, l = {694, 696, 698, 701}, m = "invokeSuspend", n = {"res", "res", "e"}, s = {"L$0", "L$0", "L$0"})
final class DashboardScreenKt$DashboardScreen$32$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $raw;
    final /* synthetic */ SnackbarHostState $snackbarHostState;
    final /* synthetic */ BookViewModel $viewModel;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DashboardScreenKt$DashboardScreen$32$1$1$1(BookViewModel bookViewModel, String str, SnackbarHostState snackbarHostState, Continuation<? super DashboardScreenKt$DashboardScreen$32$1$1$1> continuation) {
        super(2, continuation);
        this.$viewModel = bookViewModel;
        this.$raw = str;
        this.$snackbarHostState = snackbarHostState;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DashboardScreenKt$DashboardScreen$32$1$1$1(this.$viewModel, this.$raw, this.$snackbarHostState, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cf, code lost:
    
        if (r15 == r1) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.DashboardScreenKt$DashboardScreen$32$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
