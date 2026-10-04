package com.example.ui;

import com.example.data.Book;
import com.example.ui.screens.DashboardScreenKt;
import com.google.android.gms.actions.SearchIntents;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: BookViewModel.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "Lcom/example/data/Book;", "books", SearchIntents.EXTRA_QUERY, "", "status"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.BookViewModel$filteredBooks$1", f = "BookViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class BookViewModel$filteredBooks$1 extends SuspendLambda implements Function4<List<? extends Book>, String, String, Continuation<? super List<? extends Book>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ BookViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BookViewModel$filteredBooks$1(BookViewModel bookViewModel, Continuation<? super BookViewModel$filteredBooks$1> continuation) {
        super(4, continuation);
        this.this$0 = bookViewModel;
    }

    public final Object invoke(List<Book> list, String str, String str2, Continuation<? super List<Book>> continuation) {
        BookViewModel$filteredBooks$1 bookViewModel$filteredBooks$1 = new BookViewModel$filteredBooks$1(this.this$0, continuation);
        bookViewModel$filteredBooks$1.L$0 = list;
        bookViewModel$filteredBooks$1.L$1 = str;
        bookViewModel$filteredBooks$1.L$2 = str2;
        return bookViewModel$filteredBooks$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final Object invokeSuspend(Object obj) {
        String pickupAddress;
        String genre;
        String categories;
        ArrayList arrayList = (List) this.L$0;
        String str = (String) this.L$1;
        String str2 = (String) this.L$2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String str3 = str;
        if (!StringsKt.isBlank(str3)) {
            String string = StringsKt.trim(str3).toString();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                Book book = (Book) obj2;
                String str4 = string;
                if (StringsKt.contains(book.getTitle(), str4, true) || StringsKt.contains(book.getAuthor(), str4, true) || StringsKt.contains(book.getOwnerDisplayName(), str4, true) || (((pickupAddress = book.getPickupAddress()) != null && StringsKt.contains(pickupAddress, str4, true)) || (((genre = book.getGenre()) != null && StringsKt.contains(genre, str4, true)) || ((categories = book.getCategories()) != null && StringsKt.contains(categories, str4, true))))) {
                    arrayList2.add(obj2);
                }
            }
            arrayList = arrayList2;
        }
        switch (str2.hashCode()) {
            case -704089541:
                if (str2.equals("RECOMMENDED")) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : arrayList) {
                        Book book2 = (Book) obj3;
                        if (Intrinsics.areEqual(book2.getStatus(), "AVAILABLE") || book2.getRentCount() > 0) {
                            arrayList3.add(obj3);
                        }
                    }
                    return arrayList3;
                }
                break;
            case 64897:
                if (str2.equals("ALL")) {
                    return arrayList;
                }
                break;
            case 528814557:
                if (str2.equals("BOOKMARKS")) {
                    BookViewModel bookViewModel = this.this$0;
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj4 : arrayList) {
                        if (CollectionsKt.contains(((Book) obj4).getBookmarkedBy(), bookViewModel._currentUser.getValue())) {
                            arrayList4.add(obj4);
                        }
                    }
                    return arrayList4;
                }
                break;
            case 1219012151:
                if (str2.equals("MY_BOOKS")) {
                    BookViewModel bookViewModel2 = this.this$0;
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj5 : arrayList) {
                        if (DashboardScreenKt.isBookOwner((Book) obj5, (String) bookViewModel2._currentUser.getValue())) {
                            arrayList5.add(obj5);
                        }
                    }
                    return arrayList5;
                }
                break;
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj6 : arrayList) {
            if (StringsKt.equals(((Book) obj6).getStatus(), str2, true)) {
                arrayList6.add(obj6);
            }
        }
        return arrayList6;
    }
}
