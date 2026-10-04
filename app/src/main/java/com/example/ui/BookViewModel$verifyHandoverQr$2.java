package com.example.ui;

import com.example.data.Book;
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

/* JADX INFO: compiled from: BookViewModel.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.BookViewModel$verifyHandoverQr$2", f = "BookViewModel.kt", i = {}, l = {690}, m = "invokeSuspend", n = {}, s = {})
final class BookViewModel$verifyHandoverQr$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Book $book;
    final /* synthetic */ String $borrower;
    final /* synthetic */ Book $updated;
    int label;
    final /* synthetic */ BookViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BookViewModel$verifyHandoverQr$2(BookViewModel bookViewModel, Book book, String str, Book book2, Continuation<? super BookViewModel$verifyHandoverQr$2> continuation) {
        super(2, continuation);
        this.this$0 = bookViewModel;
        this.$updated = book;
        this.$borrower = str;
        this.$book = book2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BookViewModel$verifyHandoverQr$2(this.this$0, this.$updated, this.$borrower, this.$book, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (this.this$0.repository.updateBook(this.$updated, (Continuation) this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (!StringsKt.isBlank(this.$borrower)) {
            this.this$0.sendMessage(this.$book.getId(), this.$borrower, "Handover QR code verified! You can now view the condition photo and tap 'Accept Book' to finalize.");
        }
        return Unit.INSTANCE;
    }
}
