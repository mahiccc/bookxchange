package com.example.ui.screens;

import android.content.SharedPreferences;
import androidx.compose.runtime.State;
import com.example.data.Message;
import com.example.ui.BookViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: ChatScreen.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.screens.ChatScreenKt$ChatScreen$2$1", f = "ChatScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class ChatScreenKt$ChatScreen$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $bookId;
    final /* synthetic */ State<String> $currentUser$delegate;
    final /* synthetic */ State<List<Message>> $messages$delegate;
    final /* synthetic */ SharedPreferences $prefs;
    final /* synthetic */ BookViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChatScreenKt$ChatScreen$2$1(String str, SharedPreferences sharedPreferences, BookViewModel bookViewModel, State<? extends List<Message>> state, State<String> state2, Continuation<? super ChatScreenKt$ChatScreen$2$1> continuation) {
        super(2, continuation);
        this.$bookId = str;
        this.$prefs = sharedPreferences;
        this.$viewModel = bookViewModel;
        this.$messages$delegate = state;
        this.$currentUser$delegate = state2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatScreenKt$ChatScreen$2$1(this.$bookId, this.$prefs, this.$viewModel, this.$messages$delegate, this.$currentUser$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Long l;
        String id;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (!StringsKt.isBlank(this.$bookId)) {
            Iterator it = ChatScreenKt.ChatScreen$lambda$8(this.$messages$delegate).iterator();
            if (it.hasNext()) {
                Long lBoxLong = Boxing.boxLong(((Message) it.next()).getTimestamp());
                while (it.hasNext()) {
                    Long lBoxLong2 = Boxing.boxLong(((Message) it.next()).getTimestamp());
                    if (lBoxLong.compareTo(lBoxLong2) < 0) {
                        lBoxLong = lBoxLong2;
                    }
                }
                l = lBoxLong;
            } else {
                l = null;
            }
            Long l2 = l;
            long jLongValue = l2 != null ? l2.longValue() : 0L;
            Message message = (Message) CollectionsKt.lastOrNull(ChatScreenKt.ChatScreen$lambda$8(this.$messages$delegate));
            if (message == null || (id = message.getId()) == null) {
                id = "";
            }
            this.$prefs.edit().putLong("chat_last_read_" + this.$bookId, Math.max(System.currentTimeMillis(), jLongValue) + 2000).putString("chat_last_read_msg_id_" + this.$bookId, id).commit();
            String strChatScreen$lambda$13 = ChatScreenKt.ChatScreen$lambda$13(this.$currentUser$delegate);
            if (strChatScreen$lambda$13 != null && !StringsKt.isBlank(strChatScreen$lambda$13)) {
                BookViewModel bookViewModel = this.$viewModel;
                String str = this.$bookId;
                String strChatScreen$lambda$14 = ChatScreenKt.ChatScreen$lambda$13(this.$currentUser$delegate);
                Intrinsics.checkNotNull(strChatScreen$lambda$14);
                bookViewModel.markMessagesAsRead(str, strChatScreen$lambda$14);
            }
        }
        return Unit.INSTANCE;
    }
}
