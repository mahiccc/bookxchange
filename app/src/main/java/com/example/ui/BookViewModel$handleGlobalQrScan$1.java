package com.example.ui;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: BookViewModel.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.BookViewModel", f = "BookViewModel.kt", i = {0, 0, 0, 0}, l = {581}, m = "handleGlobalQrScan-gIAlu-s", n = {"rawPayload", "json", "qrType", "bookId"}, s = {"L$0", "L$1", "L$2", "L$3"})
final class BookViewModel$handleGlobalQrScan$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BookViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BookViewModel$handleGlobalQrScan$1(BookViewModel bookViewModel, Continuation<? super BookViewModel$handleGlobalQrScan$1> continuation) {
        super(continuation);
        this.this$0 = bookViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM162handleGlobalQrScangIAlus = this.this$0.m162handleGlobalQrScangIAlus(null, (Continuation) this);
        return objM162handleGlobalQrScangIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM162handleGlobalQrScangIAlus : Result.box-impl(objM162handleGlobalQrScangIAlus);
    }
}
