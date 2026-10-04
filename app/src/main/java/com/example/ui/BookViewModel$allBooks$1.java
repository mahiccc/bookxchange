package com.example.ui;

import com.example.data.Book;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: BookViewModel.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lcom/example/data/Book;", "remote", ImagesContract.LOCAL}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.BookViewModel$allBooks$1", f = "BookViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class BookViewModel$allBooks$1 extends SuspendLambda implements Function3<List<? extends Book>, List<? extends Book>, Continuation<? super List<? extends Book>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    BookViewModel$allBooks$1(Continuation<? super BookViewModel$allBooks$1> continuation) {
        super(3, continuation);
    }

    public final Object invoke(List<Book> list, List<Book> list2, Continuation<? super List<Book>> continuation) {
        BookViewModel$allBooks$1 bookViewModel$allBooks$1 = new BookViewModel$allBooks$1(continuation);
        bookViewModel$allBooks$1.L$0 = list;
        bookViewModel$allBooks$1.L$1 = list2;
        return bookViewModel$allBooks$1.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        List list2 = (List) this.L$1;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List listPlus = CollectionsKt.plus(list2, list);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listPlus) {
            if (hashSet.add(((Book) obj2).getId())) {
                arrayList.add(obj2);
            }
        }
        return CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.example.ui.BookViewModel$allBooks$1$invokeSuspend$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Long.valueOf(((Book) t2).getTimestamp()), Long.valueOf(((Book) t).getTimestamp()));
            }
        });
    }
}
