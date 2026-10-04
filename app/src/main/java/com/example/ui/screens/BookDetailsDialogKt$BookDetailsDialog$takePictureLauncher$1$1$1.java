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
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: BookDetailsDialog.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.screens.BookDetailsDialogKt$BookDetailsDialog$takePictureLauncher$1$1$1", f = "BookDetailsDialog.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
final class BookDetailsDialogKt$BookDetailsDialog$takePictureLauncher$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<String> $aiAssessmentResult$delegate;
    final /* synthetic */ MutableState<String> $aiConditionResult$delegate;
    final /* synthetic */ String $base64Str;
    final /* synthetic */ Book $book;
    final /* synthetic */ MutableState<Boolean> $isAnalyzingAi$delegate;
    final /* synthetic */ BookViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BookDetailsDialogKt$BookDetailsDialog$takePictureLauncher$1$1$1(BookViewModel bookViewModel, Book book, String str, MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<Boolean> mutableState3, Continuation<? super BookDetailsDialogKt$BookDetailsDialog$takePictureLauncher$1$1$1> continuation) {
        super(2, continuation);
        this.$viewModel = bookViewModel;
        this.$book = book;
        this.$base64Str = str;
        this.$aiConditionResult$delegate = mutableState;
        this.$aiAssessmentResult$delegate = mutableState2;
        this.$isAnalyzingAi$delegate = mutableState3;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BookDetailsDialogKt$BookDetailsDialog$takePictureLauncher$1$1$1(this.$viewModel, this.$book, this.$base64Str, this.$aiConditionResult$delegate, this.$aiAssessmentResult$delegate, this.$isAnalyzingAi$delegate, continuation);
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
                this.label = 1;
                obj = this.$viewModel.verifyBookConditionWithAI(this.$book.getTitle(), this.$book.getCondition(), this.$base64Str, (Continuation) this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Pair pair = (Pair) obj;
            String str = (String) pair.component1();
            String str2 = (String) pair.component2();
            this.$aiConditionResult$delegate.setValue(str);
            this.$aiAssessmentResult$delegate.setValue(str2);
        } catch (Exception unused) {
            this.$aiConditionResult$delegate.setValue(this.$book.getCondition());
            this.$aiAssessmentResult$delegate.setValue("Condition inspected and photo recorded.");
        } finally {
            BookDetailsDialogKt.BookDetailsDialog$lambda$26(this.$isAnalyzingAi$delegate, false);
        }
        return Unit.INSTANCE;
    }
}
