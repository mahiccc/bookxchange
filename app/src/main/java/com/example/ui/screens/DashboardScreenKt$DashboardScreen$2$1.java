package com.example.ui.screens;

import androidx.compose.material3.SnackbarDuration;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.State;
import com.example.ui.BookViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: DashboardScreen.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.screens.DashboardScreenKt$DashboardScreen$2$1", f = "DashboardScreen.kt", i = {0, 0}, l = {203}, m = "invokeSuspend", n = {"it", "$i$a$-let-DashboardScreenKt$DashboardScreen$2$1$1"}, s = {"L$1", "I$0"})
final class DashboardScreenKt$DashboardScreen$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ State<String> $insertError$delegate;
    final /* synthetic */ SnackbarHostState $snackbarHostState;
    final /* synthetic */ BookViewModel $viewModel;
    int I$0;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DashboardScreenKt$DashboardScreen$2$1(State<String> state, SnackbarHostState snackbarHostState, BookViewModel bookViewModel, Continuation<? super DashboardScreenKt$DashboardScreen$2$1> continuation) {
        super(2, continuation);
        this.$insertError$delegate = state;
        this.$snackbarHostState = snackbarHostState;
        this.$viewModel = bookViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DashboardScreenKt$DashboardScreen$2$1(this.$insertError$delegate, this.$snackbarHostState, this.$viewModel, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        BookViewModel bookViewModel;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String strDashboardScreen$lambda$3 = DashboardScreenKt.DashboardScreen$lambda$3(this.$insertError$delegate);
            if (strDashboardScreen$lambda$3 != null) {
                SnackbarHostState snackbarHostState = this.$snackbarHostState;
                BookViewModel bookViewModel2 = this.$viewModel;
                String str = "Failed to add book: " + strDashboardScreen$lambda$3;
                this.L$0 = bookViewModel2;
                this.L$1 = SpillingKt.nullOutSpilledVariable(strDashboardScreen$lambda$3);
                this.I$0 = 0;
                this.label = 1;
                if (SnackbarHostState.showSnackbar$default(snackbarHostState, str, (String) null, false, (SnackbarDuration) null, this, 14, (Object) null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                bookViewModel = bookViewModel2;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bookViewModel = (BookViewModel) this.L$0;
        ResultKt.throwOnFailure(obj);
        bookViewModel.clearInsertError();
        return Unit.INSTANCE;
    }
}
