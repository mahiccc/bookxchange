package com.example.ui;

import com.example.data.Book;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: BookViewModel.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.BookViewModel$confirmAndCompleteReturn$2", f = "BookViewModel.kt", i = {1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}, l = {861, 873, 876, 880, 886}, m = "invokeSuspend", n = {"conditions", "originalCond", "retCond", "origIdx", "retIdx", "isDegraded", "conditions", "originalCond", "retCond", "owner", "origIdx", "retIdx", "isDegraded", "ownerScoreChange", "conditions", "originalCond", "retCond", "owner", "origIdx", "retIdx", "isDegraded", "conditions", "originalCond", "retCond", "owner", "borrowerUser", "origIdx", "retIdx", "isDegraded", "ratingScore", "borrowerScoreChange", "estPrice"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3", "I$4", "D$0"})
final class BookViewModel$confirmAndCompleteReturn$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Book $book;
    final /* synthetic */ String $borrower;
    final /* synthetic */ Integer $rating;
    final /* synthetic */ String $review;
    final /* synthetic */ Book $updated;
    double D$0;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ BookViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BookViewModel$confirmAndCompleteReturn$2(BookViewModel bookViewModel, Book book, Book book2, String str, Integer num, String str2, Continuation<? super BookViewModel$confirmAndCompleteReturn$2> continuation) {
        super(2, continuation);
        this.this$0 = bookViewModel;
        this.$updated = book;
        this.$book = book2;
        this.$borrower = str;
        this.$rating = num;
        this.$review = str2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BookViewModel$confirmAndCompleteReturn$2(this.this$0, this.$updated, this.$book, this.$borrower, this.$rating, this.$review, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x016d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x016f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0172  */
    /* JADX WARN: Code duplicated, block: B:52:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:56:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:59:0x021e A[PHI: r2 r3 r8 r9 r10 r11 r12 r13
      0x021e: PHI (r2v9 int) = (r2v8 int), (r2v21 int) binds: [B:57:0x021a, B:12:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r3v11 java.lang.Object) = (r3v10 java.lang.Object), (r3v25 java.lang.Object) binds: [B:57:0x021a, B:12:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r8v14 int) = (r8v13 int), (r8v17 int) binds: [B:57:0x021a, B:12:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r9v8 int) = (r9v7 int), (r9v11 int) binds: [B:57:0x021a, B:12:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r10v13 com.example.data.User) = (r10v12 com.example.data.User), (r10v22 com.example.data.User) binds: [B:57:0x021a, B:12:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r11v7 java.lang.String) = (r11v6 java.lang.String), (r11v16 java.lang.String) binds: [B:57:0x021a, B:12:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r12v12 java.lang.String) = (r12v11 java.lang.String), (r12v20 java.lang.String) binds: [B:57:0x021a, B:12:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r13v13 java.util.List) = (r13v12 java.util.List), (r13v20 java.util.List) binds: [B:57:0x021a, B:12:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0224  */
    /* JADX WARN: Code duplicated, block: B:63:0x0228  */
    /* JADX WARN: Code duplicated, block: B:66:0x0230  */
    /* JADX WARN: Code duplicated, block: B:68:0x0234  */
    /* JADX WARN: Code duplicated, block: B:72:0x023e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0241  */
    /* JADX WARN: Code duplicated, block: B:76:0x024a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0266  */
    /* JADX WARN: Code duplicated, block: B:85:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:89:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:94:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:95:0x0304  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01d9, code lost:
    
        if (r47.this$0.repository.updateUser(com.example.data.User.copy$default(r14, null, null, r14.getTrustScore() + r13, r14.getCompletedSwaps() + 1, null, null, false, null, 0, 0, 0.0d, 2035, null), (kotlin.coroutines.Continuation) r47) == r1) goto L84;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r48) {
        /*
            Method dump skipped, instruction units count: 815
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.BookViewModel$confirmAndCompleteReturn$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
