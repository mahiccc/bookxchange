package com.example.ui.screens;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import androidx.compose.runtime.MutableState;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: SafeMeetupDialog.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.screens.SafeMeetupDialogKt$SafeMeetupDialog$1$1", f = "SafeMeetupDialog.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
final class SafeMeetupDialogKt$SafeMeetupDialog$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<String> $detectedCity$delegate;
    final /* synthetic */ MutableState<String> $detectedLocality$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SafeMeetupDialogKt$SafeMeetupDialog$1$1(Context context, MutableState<String> mutableState, MutableState<String> mutableState2, Continuation<? super SafeMeetupDialogKt$SafeMeetupDialog$1$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$detectedCity$delegate = mutableState;
        this.$detectedLocality$delegate = mutableState2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SafeMeetupDialogKt$SafeMeetupDialog$1$1(this.$context, this.$detectedCity$delegate, this.$detectedLocality$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.example.ui.screens.SafeMeetupDialogKt$SafeMeetupDialog$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: SafeMeetupDialog.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.screens.SafeMeetupDialogKt$SafeMeetupDialog$1$1$1", f = "SafeMeetupDialog.kt", i = {}, l = {UserVerificationMethods.USER_VERIFY_EYEPRINT}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ MutableState<String> $detectedCity$delegate;
        final /* synthetic */ MutableState<String> $detectedLocality$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context, MutableState<String> mutableState, MutableState<String> mutableState2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$detectedCity$delegate = mutableState;
            this.$detectedLocality$delegate = mutableState2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$context, this.$detectedCity$delegate, this.$detectedLocality$delegate, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    obj = LocationHelperKt.getCurrentLocation(this.$context, (Continuation) this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Location location = (Location) obj;
                if (location != null) {
                    List<Address> fromLocation = new Geocoder(this.$context, Locale.getDefault()).getFromLocation(location.getLatitude(), location.getLongitude(), 1);
                    Address address = fromLocation != null ? (Address) CollectionsKt.firstOrNull(fromLocation) : null;
                    if (address != null) {
                        MutableState<String> mutableState = this.$detectedCity$delegate;
                        String locality = address.getLocality();
                        if (locality == null && (locality = address.getSubAdminArea()) == null) {
                            locality = address.getAdminArea();
                        }
                        mutableState.setValue(locality);
                        MutableState<String> mutableState2 = this.$detectedLocality$delegate;
                        String subLocality = address.getSubLocality();
                        if (subLocality == null) {
                            subLocality = address.getFeatureName();
                        }
                        mutableState2.setValue(subLocality);
                    }
                }
            } catch (Exception unused) {
            }
            return Unit.INSTANCE;
        }
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.$context, this.$detectedCity$delegate, this.$detectedLocality$delegate, null), (Continuation) this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
