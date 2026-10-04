package com.example.ui.screens;

import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: QRScannerDialog.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.screens.QRScannerDialogKt$QRScannerDialog$1$1", f = "QRScannerDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class QRScannerDialogKt$QRScannerDialog$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $hasCameraPermission$delegate;
    final /* synthetic */ ManagedActivityResultLauncher<String, Boolean> $permissionLauncher;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    QRScannerDialogKt$QRScannerDialog$1$1(ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher, MutableState<Boolean> mutableState, Continuation<? super QRScannerDialogKt$QRScannerDialog$1$1> continuation) {
        super(2, continuation);
        this.$permissionLauncher = managedActivityResultLauncher;
        this.$hasCameraPermission$delegate = mutableState;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new QRScannerDialogKt$QRScannerDialog$1$1(this.$permissionLauncher, this.$hasCameraPermission$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (!QRScannerDialogKt.QRScannerDialog$lambda$1(this.$hasCameraPermission$delegate)) {
                this.$permissionLauncher.launch("android.permission.CAMERA");
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
