package com.example.ui.screens;

import androidx.compose.runtime.MutableState;
import com.example.data.User;
import com.example.ui.BookViewModel;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: ChatScreen.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.screens.ChatScreenKt$ChatScreen$1$1", f = "ChatScreen.kt", i = {}, l = {173}, m = "invokeSuspend", n = {}, s = {})
final class ChatScreenKt$ChatScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $otherUserEmail;
    final /* synthetic */ MutableState<String> $otherUserName$delegate;
    final /* synthetic */ MutableState<String> $otherUserPhoto$delegate;
    final /* synthetic */ BookViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChatScreenKt$ChatScreen$1$1(String str, BookViewModel bookViewModel, MutableState<String> mutableState, MutableState<String> mutableState2, Continuation<? super ChatScreenKt$ChatScreen$1$1> continuation) {
        super(2, continuation);
        this.$otherUserEmail = str;
        this.$viewModel = bookViewModel;
        this.$otherUserName$delegate = mutableState;
        this.$otherUserPhoto$delegate = mutableState2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatScreenKt$ChatScreen$1$1(this.$otherUserEmail, this.$viewModel, this.$otherUserName$delegate, this.$otherUserPhoto$delegate, continuation);
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
            if (!StringsKt.isBlank(this.$otherUserEmail)) {
                StateFlow<User> user = this.$viewModel.getUser(this.$otherUserEmail);
                final MutableState<String> mutableState = this.$otherUserName$delegate;
                final MutableState<String> mutableState2 = this.$otherUserPhoto$delegate;
                this.label = 1;
                if (user.collect(new FlowCollector() { // from class: com.example.ui.screens.ChatScreenKt$ChatScreen$1$1.1
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((User) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(User user2, Continuation<? super Unit> continuation) {
                        if (user2 != null) {
                            if (!StringsKt.isBlank(user2.getDisplayName())) {
                                mutableState.setValue(user2.getDisplayName());
                            }
                            String profilePicBase64 = user2.getProfilePicBase64();
                            if (profilePicBase64 != null && !StringsKt.isBlank(profilePicBase64)) {
                                mutableState2.setValue(user2.getProfilePicBase64());
                            }
                        }
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
