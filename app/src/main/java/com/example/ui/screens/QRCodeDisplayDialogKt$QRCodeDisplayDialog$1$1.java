package com.example.ui.screens;

import android.graphics.Bitmap;
import androidx.compose.runtime.MutableState;
import com.example.util.QRCodeHelper;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: QRCodeDisplayDialog.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.screens.QRCodeDisplayDialogKt$QRCodeDisplayDialog$1$1", f = "QRCodeDisplayDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class QRCodeDisplayDialogKt$QRCodeDisplayDialog$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $payload;
    final /* synthetic */ MutableState<Bitmap> $qrBitmap$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    QRCodeDisplayDialogKt$QRCodeDisplayDialog$1$1(String str, MutableState<Bitmap> mutableState, Continuation<? super QRCodeDisplayDialogKt$QRCodeDisplayDialog$1$1> continuation) {
        super(2, continuation);
        this.$payload = str;
        this.$qrBitmap$delegate = mutableState;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new QRCodeDisplayDialogKt$QRCodeDisplayDialog$1$1(this.$payload, this.$qrBitmap$delegate, continuation);
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
        this.$qrBitmap$delegate.setValue(QRCodeHelper.INSTANCE.generateQrCodeBitmap(this.$payload, 600));
        return Unit.INSTANCE;
    }
}
