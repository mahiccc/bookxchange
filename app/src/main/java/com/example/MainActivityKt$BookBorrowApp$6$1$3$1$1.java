package com.example;

import androidx.navigation.NavHostController;
import androidx.navigation.NavOptionsBuilder;
import androidx.navigation.PopUpToBuilder;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: MainActivity.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.MainActivityKt$BookBorrowApp$6$1$3$1$1", f = "MainActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class MainActivityKt$BookBorrowApp$6$1$3$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ NavHostController $navController;
    final /* synthetic */ String $user;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainActivityKt$BookBorrowApp$6$1$3$1$1(String str, NavHostController navHostController, Continuation<? super MainActivityKt$BookBorrowApp$6$1$3$1$1> continuation) {
        super(2, continuation);
        this.$user = str;
        this.$navController = navHostController;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MainActivityKt$BookBorrowApp$6$1$3$1$1(this.$user, this.$navController, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$user == null) {
            this.$navController.navigate("login", new Function1() { // from class: com.example.MainActivityKt$BookBorrowApp$6$1$3$1$1$$ExternalSyntheticLambda0
                public final Object invoke(Object obj2) {
                    return MainActivityKt$BookBorrowApp$6$1$3$1$1.invokeSuspend$lambda$1((NavOptionsBuilder) obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    static final Unit invokeSuspend$lambda$1(NavOptionsBuilder navOptionsBuilder) {
        navOptionsBuilder.popUpTo("main", new Function1() { // from class: com.example.MainActivityKt$BookBorrowApp$6$1$3$1$1$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return MainActivityKt$BookBorrowApp$6$1$3$1$1.invokeSuspend$lambda$1$lambda$0((PopUpToBuilder) obj);
            }
        });
        return Unit.INSTANCE;
    }

    static final Unit invokeSuspend$lambda$1$lambda$0(PopUpToBuilder popUpToBuilder) {
        popUpToBuilder.setInclusive(true);
        return Unit.INSTANCE;
    }
}
