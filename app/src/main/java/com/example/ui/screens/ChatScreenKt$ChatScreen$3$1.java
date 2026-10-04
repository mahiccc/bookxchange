package com.example.ui.screens;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.example.data.Message;
import com.example.ui.BookViewModel;
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
@DebugMetadata(c = "com.example.ui.screens.ChatScreenKt$ChatScreen$3$1", f = "ChatScreen.kt", i = {}, l = {230}, m = "invokeSuspend", n = {}, s = {})
final class ChatScreenKt$ChatScreen$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<String> $aiMeetingRecommendation$delegate;
    final /* synthetic */ MutableState<Boolean> $aiProcessing$delegate;
    final /* synthetic */ MutableState<String> $aiSuggestion$delegate;
    final /* synthetic */ String $bookId;
    final /* synthetic */ State<String> $currentUser$delegate;
    final /* synthetic */ State<List<Message>> $messages$delegate;
    final /* synthetic */ MutableState<String> $otherUserName$delegate;
    final /* synthetic */ BookViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChatScreenKt$ChatScreen$3$1(BookViewModel bookViewModel, String str, State<? extends List<Message>> state, MutableState<Boolean> mutableState, State<String> state2, MutableState<String> mutableState2, MutableState<String> mutableState3, MutableState<String> mutableState4, Continuation<? super ChatScreenKt$ChatScreen$3$1> continuation) {
        super(2, continuation);
        this.$viewModel = bookViewModel;
        this.$bookId = str;
        this.$messages$delegate = state;
        this.$aiProcessing$delegate = mutableState;
        this.$currentUser$delegate = state2;
        this.$otherUserName$delegate = mutableState2;
        this.$aiSuggestion$delegate = mutableState3;
        this.$aiMeetingRecommendation$delegate = mutableState4;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatScreenKt$ChatScreen$3$1(this.$viewModel, this.$bookId, this.$messages$delegate, this.$aiProcessing$delegate, this.$currentUser$delegate, this.$otherUserName$delegate, this.$aiSuggestion$delegate, this.$aiMeetingRecommendation$delegate, continuation);
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
                if (!ChatScreenKt.ChatScreen$lambda$8(this.$messages$delegate).isEmpty()) {
                    ChatScreenKt.ChatScreen$lambda$95(this.$aiProcessing$delegate, true);
                    BookViewModel bookViewModel = this.$viewModel;
                    List<Message> listChatScreen$lambda$8 = ChatScreenKt.ChatScreen$lambda$8(this.$messages$delegate);
                    String strChatScreen$lambda$13 = ChatScreenKt.ChatScreen$lambda$13(this.$currentUser$delegate);
                    if (strChatScreen$lambda$13 == null) {
                        strChatScreen$lambda$13 = "";
                    }
                    this.label = 1;
                    obj = bookViewModel.analyzeChat(listChatScreen$lambda$8, strChatScreen$lambda$13, ChatScreenKt.ChatScreen$lambda$71(this.$otherUserName$delegate), this.$bookId, (Continuation) this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BookViewModel.ChatAnalysis chatAnalysis = (BookViewModel.ChatAnalysis) obj;
            this.$aiSuggestion$delegate.setValue(chatAnalysis.getSuggestion());
            this.$aiMeetingRecommendation$delegate.setValue(chatAnalysis.getMeetingRecommendation());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ChatScreenKt.ChatScreen$lambda$95(this.$aiProcessing$delegate, false);
        }
        return Unit.INSTANCE;
    }
}
