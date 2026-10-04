package com.example.ui.screens;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.State;
import com.example.data.Message;
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

/* JADX INFO: compiled from: ChatScreen.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.screens.ChatScreenKt$ChatScreen$21$1$18$1", f = "ChatScreen.kt", i = {}, l = {1067}, m = "invokeSuspend", n = {}, s = {})
final class ChatScreenKt$ChatScreen$21$1$18$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $chatListState;
    final /* synthetic */ State<List<Message>> $messages$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChatScreenKt$ChatScreen$21$1$18$1(LazyListState lazyListState, State<? extends List<Message>> state, Continuation<? super ChatScreenKt$ChatScreen$21$1$18$1> continuation) {
        super(2, continuation);
        this.$chatListState = lazyListState;
        this.$messages$delegate = state;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatScreenKt$ChatScreen$21$1$18$1(this.$chatListState, this.$messages$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!ChatScreenKt.ChatScreen$lambda$8(this.$messages$delegate).isEmpty()) {
                this.label = 1;
                if (LazyListState.animateScrollToItem$default(this.$chatListState, 0, 0, (Continuation) this, 2, (Object) null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
