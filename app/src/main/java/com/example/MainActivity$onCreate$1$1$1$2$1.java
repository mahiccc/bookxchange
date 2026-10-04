package com.example;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.example.data.Message;
import com.example.ui.BookViewModel;
import com.example.ui.NotificationService;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: MainActivity.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.MainActivity$onCreate$1$1$1$2$1", f = "MainActivity.kt", i = {0}, l = {126}, m = "invokeSuspend", n = {"user"}, s = {"L$0"})
final class MainActivity$onCreate$1$1$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ State<String> $currentUser$delegate;
    final /* synthetic */ MutableState<List<Message>> $userMessages$delegate;
    final /* synthetic */ BookViewModel $viewModel;
    Object L$0;
    int label;
    final /* synthetic */ MainActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainActivity$onCreate$1$1$1$2$1(BookViewModel bookViewModel, State<String> state, MainActivity mainActivity, MutableState<List<Message>> mutableState, Continuation<? super MainActivity$onCreate$1$1$1$2$1> continuation) {
        super(2, continuation);
        this.$viewModel = bookViewModel;
        this.$currentUser$delegate = state;
        this.this$0 = mainActivity;
        this.$userMessages$delegate = mutableState;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MainActivity$onCreate$1$1$1$2$1(this.$viewModel, this.$currentUser$delegate, this.this$0, this.$userMessages$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final String strOnCreate$lambda$11$lambda$10$lambda$9$lambda$1 = MainActivity.onCreate$lambda$11$lambda$10$lambda$9$lambda$1(this.$currentUser$delegate);
            String str = strOnCreate$lambda$11$lambda$10$lambda$9$lambda$1;
            if (str != null && !StringsKt.isBlank(str)) {
                StateFlow<List<Message>> userChats = this.$viewModel.getUserChats(strOnCreate$lambda$11$lambda$10$lambda$9$lambda$1);
                final MainActivity mainActivity = this.this$0;
                final BookViewModel bookViewModel = this.$viewModel;
                final MutableState<List<Message>> mutableState = this.$userMessages$delegate;
                this.L$0 = SpillingKt.nullOutSpilledVariable(strOnCreate$lambda$11$lambda$10$lambda$9$lambda$1);
                this.label = 1;
                if (userChats.collect(new FlowCollector() { // from class: com.example.MainActivity$onCreate$1$1$1$2$1.1
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((List<Message>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(List<Message> list, Continuation<? super Unit> continuation) {
                        mutableState.setValue(list);
                        NotificationService.INSTANCE.checkAndNotifyMessages((Context) mainActivity, list, strOnCreate$lambda$11$lambda$10$lambda$9$lambda$1);
                        bookViewModel.markMessagesAsDelivered(strOnCreate$lambda$11$lambda$10$lambda$9$lambda$1);
                        return Unit.INSTANCE;
                    }
                }, (Continuation) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
