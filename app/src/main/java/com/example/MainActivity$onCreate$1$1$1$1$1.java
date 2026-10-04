package com.example;

import android.content.Context;
import androidx.compose.runtime.State;
import com.example.data.Book;
import com.example.ui.NotificationService;
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

/* JADX INFO: compiled from: MainActivity.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.MainActivity$onCreate$1$1$1$1$1", f = "MainActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class MainActivity$onCreate$1$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ State<List<Book>> $allBooks$delegate;
    final /* synthetic */ State<String> $currentUser$delegate;
    int label;
    final /* synthetic */ MainActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MainActivity$onCreate$1$1$1$1$1(MainActivity mainActivity, State<? extends List<Book>> state, State<String> state2, Continuation<? super MainActivity$onCreate$1$1$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = mainActivity;
        this.$allBooks$delegate = state;
        this.$currentUser$delegate = state2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MainActivity$onCreate$1$1$1$1$1(this.this$0, this.$allBooks$delegate, this.$currentUser$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            NotificationService.INSTANCE.checkAndNotifyBooks((Context) this.this$0, MainActivity.onCreate$lambda$11$lambda$10$lambda$9$lambda$2(this.$allBooks$delegate), MainActivity.onCreate$lambda$11$lambda$10$lambda$9$lambda$1(this.$currentUser$delegate));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
