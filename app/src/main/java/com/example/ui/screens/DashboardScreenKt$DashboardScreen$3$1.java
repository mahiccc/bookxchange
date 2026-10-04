package com.example.ui.screens;

import androidx.compose.runtime.MutableState;
import com.example.data.Book;
import com.example.ui.BookViewModel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: DashboardScreen.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.screens.DashboardScreenKt$DashboardScreen$3$1", f = "DashboardScreen.kt", i = {0}, l = {216}, m = "invokeSuspend", n = {"photo"}, s = {"L$0"})
final class DashboardScreenKt$DashboardScreen$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<String> $aiVerificationAssessment$delegate;
    final /* synthetic */ MutableState<Book> $currentBookForScan$delegate;
    final /* synthetic */ MutableState<Boolean> $isVerifyingAI$delegate;
    final /* synthetic */ MutableState<String> $scannedCondition$delegate;
    final /* synthetic */ MutableState<Boolean> $showReturnDialog$delegate;
    final /* synthetic */ BookViewModel $viewModel;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DashboardScreenKt$DashboardScreen$3$1(BookViewModel bookViewModel, MutableState<Boolean> mutableState, MutableState<Book> mutableState2, MutableState<Boolean> mutableState3, MutableState<String> mutableState4, MutableState<String> mutableState5, Continuation<? super DashboardScreenKt$DashboardScreen$3$1> continuation) {
        super(2, continuation);
        this.$viewModel = bookViewModel;
        this.$showReturnDialog$delegate = mutableState;
        this.$currentBookForScan$delegate = mutableState2;
        this.$isVerifyingAI$delegate = mutableState3;
        this.$aiVerificationAssessment$delegate = mutableState4;
        this.$scannedCondition$delegate = mutableState5;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DashboardScreenKt$DashboardScreen$3$1(this.$viewModel, this.$showReturnDialog$delegate, this.$currentBookForScan$delegate, this.$isVerifyingAI$delegate, this.$aiVerificationAssessment$delegate, this.$scannedCondition$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (DashboardScreenKt.DashboardScreen$lambda$59(this.$showReturnDialog$delegate) && DashboardScreenKt.DashboardScreen$lambda$53(this.$currentBookForScan$delegate) != null) {
                    Book bookDashboardScreen$lambda$53 = DashboardScreenKt.DashboardScreen$lambda$53(this.$currentBookForScan$delegate);
                    Intrinsics.checkNotNull(bookDashboardScreen$lambda$53);
                    String returnImageUrl = bookDashboardScreen$lambda$53.getReturnImageUrl();
                    if (returnImageUrl == null) {
                        Book bookDashboardScreen$lambda$54 = DashboardScreenKt.DashboardScreen$lambda$53(this.$currentBookForScan$delegate);
                        Intrinsics.checkNotNull(bookDashboardScreen$lambda$54);
                        returnImageUrl = bookDashboardScreen$lambda$54.getImageUrl();
                    }
                    String str = returnImageUrl;
                    if (str != null && !StringsKt.isBlank(str)) {
                        DashboardScreenKt.DashboardScreen$lambda$90(this.$isVerifyingAI$delegate, true);
                        this.$aiVerificationAssessment$delegate.setValue(null);
                        BookViewModel bookViewModel = this.$viewModel;
                        Book bookDashboardScreen$lambda$55 = DashboardScreenKt.DashboardScreen$lambda$53(this.$currentBookForScan$delegate);
                        Intrinsics.checkNotNull(bookDashboardScreen$lambda$55);
                        String title = bookDashboardScreen$lambda$55.getTitle();
                        Book bookDashboardScreen$lambda$56 = DashboardScreenKt.DashboardScreen$lambda$53(this.$currentBookForScan$delegate);
                        Intrinsics.checkNotNull(bookDashboardScreen$lambda$56);
                        this.L$0 = SpillingKt.nullOutSpilledVariable(returnImageUrl);
                        this.label = 1;
                        obj = bookViewModel.verifyBookConditionWithAI(title, bookDashboardScreen$lambda$56.getCondition(), returnImageUrl, (Continuation) this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Pair pair = (Pair) obj;
            String str2 = (String) pair.component1();
            String str3 = (String) pair.component2();
            this.$scannedCondition$delegate.setValue(str2);
            this.$aiVerificationAssessment$delegate.setValue(str3);
        } catch (Exception unused) {
            this.$aiVerificationAssessment$delegate.setValue(null);
        } finally {
            DashboardScreenKt.DashboardScreen$lambda$90(this.$isVerifyingAI$delegate, false);
        }
        return Unit.INSTANCE;
    }
}
