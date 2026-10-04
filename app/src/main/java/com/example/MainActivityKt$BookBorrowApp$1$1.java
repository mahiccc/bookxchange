package com.example;

import android.content.Context;
import android.content.Intent;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.State;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
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

/* JADX INFO: compiled from: MainActivity.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.MainActivityKt$BookBorrowApp$1$1", f = "MainActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class MainActivityKt$BookBorrowApp$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ State<String> $currentUser$delegate;
    final /* synthetic */ NavHostController $navController;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainActivityKt$BookBorrowApp$1$1(Context context, NavHostController navHostController, State<String> state, Continuation<? super MainActivityKt$BookBorrowApp$1$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$navController = navHostController;
        this.$currentUser$delegate = state;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MainActivityKt$BookBorrowApp$1$1(this.$context, this.$navController, this.$currentUser$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Intent intent;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ComponentActivity componentActivity = this.$context;
        String stringExtra = null;
        ComponentActivity componentActivity2 = componentActivity instanceof ComponentActivity ? componentActivity : null;
        if (componentActivity2 != null && (intent = componentActivity2.getIntent()) != null) {
            stringExtra = intent.getStringExtra("extra_book_id");
        }
        String str = stringExtra;
        if (str != null && !StringsKt.isBlank(str) && MainActivityKt.BookBorrowApp$lambda$0(this.$currentUser$delegate) != null) {
            componentActivity2.getIntent().removeExtra("extra_book_id");
            NavController.navigate$default((NavController) this.$navController, "chat/" + stringExtra, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
