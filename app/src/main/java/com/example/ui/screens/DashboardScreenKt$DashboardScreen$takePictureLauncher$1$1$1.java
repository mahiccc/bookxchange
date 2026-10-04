package com.example.ui.screens;

import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import com.example.data.Book;
import com.example.ui.BookViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: DashboardScreen.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.screens.DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1", f = "DashboardScreen.kt", i = {0, 0, 1, 1, 2, 2, 3, 3}, l = {175, 183, 186, 189}, m = "invokeSuspend", n = {"aiCond", "aiNote", "aiCond", "aiNote", "aiCond", "aiNote", "aiCond", "aiNote"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
final class DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $base64Str;
    final /* synthetic */ Book $bookToScan;
    final /* synthetic */ MutableIntState $returnRating$delegate;
    final /* synthetic */ MutableState<String> $scanMode$delegate;
    final /* synthetic */ SnackbarHostState $snackbarHostState;
    final /* synthetic */ BookViewModel $viewModel;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1(Book book, BookViewModel bookViewModel, String str, SnackbarHostState snackbarHostState, MutableState<String> mutableState, MutableIntState mutableIntState, Continuation<? super DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1> continuation) {
        super(2, continuation);
        this.$bookToScan = book;
        this.$viewModel = bookViewModel;
        this.$base64Str = str;
        this.$snackbarHostState = snackbarHostState;
        this.$scanMode$delegate = mutableState;
        this.$returnRating$delegate = mutableIntState;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1(this.$bookToScan, this.$viewModel, this.$base64Str, this.$snackbarHostState, this.$scanMode$delegate, this.$returnRating$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:37:0x0121  */
    /* JADX WARN: Code duplicated, block: B:39:0x012f  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d0, code lost:
    
        if (androidx.compose.material3.SnackbarHostState.showSnackbar$default(r24.$snackbarHostState, "Handover scan analyzed by AI (" + r8 + ")! Please show your Handover QR.", (java.lang.String) null, false, (androidx.compose.material3.SnackbarDuration) null, (kotlin.coroutines.Continuation) r24, 14, (java.lang.Object) null) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x011e, code lost:
    
        if (androidx.compose.material3.SnackbarHostState.showSnackbar$default(r24.$snackbarHostState, "Return scan analyzed by AI (" + r8 + ")! Please show your Return QR.", (java.lang.String) null, false, (androidx.compose.material3.SnackbarDuration) null, (kotlin.coroutines.Continuation) r24, 14, (java.lang.Object) null) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0167, code lost:
    
        if (androidx.compose.material3.SnackbarHostState.showSnackbar$default(r24.$snackbarHostState, "Return confirmed successfully!", (java.lang.String) null, false, (androidx.compose.material3.SnackbarDuration) null, (kotlin.coroutines.Continuation) r24, 14, (java.lang.Object) null) == r1) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
