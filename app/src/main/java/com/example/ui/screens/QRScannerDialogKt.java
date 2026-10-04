package com.example.ui.screens;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CameraAltKt;
import androidx.compose.material.icons.filled.QrCodeScannerKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonElevation;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonColors;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.profileinstaller.ProfileVerifier;
import coil.compose.SingletonAsyncImageKt;
import com.example.data.Book;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.BarcodeScanning;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.InputImage;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: QRScannerDialog.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u001aN\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0007¢\u0006\u0002\u0010\r\u001a>\u0010\u000e\u001a\u00020\u00012!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0007¢\u0006\u0002\u0010\u000f\u001a9\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0007¢\u0006\u0002\u0010\u0013¨\u0006\u0014²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u008e\u0002²\u0006\f\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u008a\u008e\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0016X\u008a\u008e\u0002²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u0084\u0002²\u0006\n\u0010\u001b\u001a\u00020\u0016X\u008a\u008e\u0002"}, d2 = {"QRScannerDialog", "", "book", "Lcom/example/data/Book;", "expectedType", "", "onQrScanned", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "rawPayload", "onDismiss", "Lkotlin/Function0;", "(Lcom/example/data/Book;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "GlobalQRScannerDialog", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ConfirmTransferDialog", "type", "onConfirm", "(Lcom/example/data/Book;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app", "hasCameraPermission", "", "scanError", "isProcessing", "alphaAnim", "", "hasCamPermission"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class QRScannerDialogKt {
    static final Unit ConfirmTransferDialog$lambda$74(Book book, String str, Function0 function0, Function0 function1, int i, Composer composer, int i2) {
        ConfirmTransferDialog(book, str, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit GlobalQRScannerDialog$lambda$68(Function1 function1, Function0 function0, int i, Composer composer, int i2) {
        GlobalQRScannerDialog(function1, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit QRScannerDialog$lambda$49(Book book, String str, Function1 function1, Function0 function0, int i, Composer composer, int i2) {
        QRScannerDialog(book, str, function1, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void QRScannerDialog(final Book book, final String str, final Function1<? super String, Unit> function1, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(book, "book");
        Intrinsics.checkNotNullParameter(str, "expectedType");
        Intrinsics.checkNotNullParameter(function1, "onQrScanned");
        Intrinsics.checkNotNullParameter(function0, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1140865711);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(QRScannerDialog)P(!2,3)57@2364L7,58@2417L7,60@2457L170,68@2762L60,66@2658L164,72@2845L42,73@2912L34,77@3080L1343,75@2975L1448,107@4450L119,107@4429L140,114@4634L43,115@4718L257,128@5104L11765,125@4981L11888:QRScannerDialog.kt#2thlc2");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(book) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i2 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1140865711, i2, -1, "com.example.ui.screens.QRScannerDialog (QRScannerDialog.kt:56)");
            }
            CompositionLocal localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Context context = (Context) objConsume;
            CompositionLocal localLifecycleOwner = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composerStartRestartGroup.consume(localLifecycleOwner);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final LifecycleOwner lifecycleOwner = (LifecycleOwner) objConsume2;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1155276805, "CC(remember):QRScannerDialog.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(ContextCompat.checkSelfPermission(context, "android.permission.CAMERA") == 0), (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ActivityResultContract requestPermission = new ActivityResultContracts.RequestPermission();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1155267155, "CC(remember):QRScannerDialog.kt#9igjgp");
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.example.ui.screens.QRScannerDialogKt$$ExternalSyntheticLambda11
                    public final Object invoke(Object obj) {
                        return QRScannerDialogKt.QRScannerDialog$lambda$4$lambda$3(mutableState, ((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestPermission, (Function1) objRememberedValue2, composerStartRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1155264517, "CC(remember):QRScannerDialog.kt#9igjgp");
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final MutableState mutableState2 = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1155262381, "CC(remember):QRScannerDialog.kt#9igjgp");
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final MutableState mutableState3 = (MutableState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ActivityResultContract takePicturePreview = new ActivityResultContracts.TakePicturePreview();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1155255696, "CC(remember):QRScannerDialog.kt#9igjgp");
            boolean z = (i2 & 896) == 256;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = new Function1() { // from class: com.example.ui.screens.QRScannerDialogKt$$ExternalSyntheticLambda22
                    public final Object invoke(Object obj) {
                        return QRScannerDialogKt.QRScannerDialog$lambda$16$lambda$15(mutableState3, function1, mutableState2, (Bitmap) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult2 = ActivityResultRegistryKt.rememberLauncherForActivityResult(takePicturePreview, (Function1) objRememberedValue5, composerStartRestartGroup, 0);
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1155213080, "CC(remember):QRScannerDialog.kt#9igjgp");
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult);
            QRScannerDialogKt$QRScannerDialog$1$1 qRScannerDialogKt$QRScannerDialog$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || qRScannerDialogKt$QRScannerDialog$1$1RememberedValue == Composer.Companion.getEmpty()) {
                qRScannerDialogKt$QRScannerDialog$1$1RememberedValue = new QRScannerDialogKt$QRScannerDialog$1$1(managedActivityResultLauncherRememberLauncherForActivityResult, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(qRScannerDialogKt$QRScannerDialog$1$1RememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            EffectsKt.LaunchedEffect(unit, (Function2) qRScannerDialogKt$QRScannerDialog$1$1RememberedValue, composerStartRestartGroup, 6);
            final State stateAnimateFloat = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition("pulse", composerStartRestartGroup, 6, 0), 0.4f, 1.0f, AnimationSpecKt.infiniteRepeatable-9IiC70o$default(AnimationSpecKt.tween$default(1200, 0, EasingKt.getLinearEasing(), 2, (Object) null), RepeatMode.Reverse, 0L, 4, (Object) null), "alpha", composerStartRestartGroup, InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9), 0);
            composer2 = composerStartRestartGroup;
            AndroidDialog_androidKt.Dialog(function0, new DialogProperties(false, false, false, 3, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(1535615912, true, new Function2() { // from class: com.example.ui.screens.QRScannerDialogKt$$ExternalSyntheticLambda26
                public final Object invoke(Object obj, Object obj2) {
                    return QRScannerDialogKt.QRScannerDialog$lambda$48(function1, lifecycleOwner, mutableState, mutableState3, managedActivityResultLauncherRememberLauncherForActivityResult, stateAnimateFloat, managedActivityResultLauncherRememberLauncherForActivityResult2, str, function0, book, mutableState2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer2, 54), composer2, ((i2 >> 9) & 14) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.QRScannerDialogKt$$ExternalSyntheticLambda27
                public final Object invoke(Object obj, Object obj2) {
                    return QRScannerDialogKt.QRScannerDialog$lambda$49(book, str, function1, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean QRScannerDialog$lambda$1(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void QRScannerDialog$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    static final Unit QRScannerDialog$lambda$4$lambda$3(MutableState mutableState, boolean z) {
        QRScannerDialog$lambda$2(mutableState, z);
        return Unit.INSTANCE;
    }

    private static final String QRScannerDialog$lambda$6(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final void QRScannerDialog$lambda$10(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean QRScannerDialog$lambda$9(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    static final Unit QRScannerDialog$lambda$16$lambda$15(final MutableState mutableState, final Function1 function1, final MutableState mutableState2, Bitmap bitmap) {
        if (bitmap != null) {
            QRScannerDialog$lambda$10(mutableState, true);
            InputImage inputImageFromBitmap = InputImage.fromBitmap(bitmap, 0);
            Intrinsics.checkNotNullExpressionValue(inputImageFromBitmap, "fromBitmap(...)");
            BarcodeScanner client = BarcodeScanning.getClient(new BarcodeScannerOptions.Builder().setBarcodeFormats(UserVerificationMethods.USER_VERIFY_HANDPRINT, new int[0]).build());
            Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
            Task taskProcess = client.process(inputImageFromBitmap);
            final Function1 function2 = new Function1() { // from class: com.example.ui.screens.QRScannerDialogKt$$ExternalSyntheticLambda20
                public final Object invoke(Object obj) {
                    return QRScannerDialogKt.QRScannerDialog$lambda$16$lambda$15$lambda$12(function1, mutableState2, mutableState, (List) obj);
                }
            };
            taskProcess.addOnSuccessListener(new OnSuccessListener() { // from class: com.example.ui.screens.QRScannerDialogKt$$ExternalSyntheticLambda21
                public final void onSuccess(Object obj) {
                    function2.invoke(obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: com.example.ui.screens.QRScannerDialogKt$$ExternalSyntheticLambda23
                public final void onFailure(Exception exc) {
                    QRScannerDialogKt.QRScannerDialog$lambda$16$lambda$15$lambda$14(mutableState2, mutableState, exc);
                }
            });
        }
        return Unit.INSTANCE;
    }

    static final Unit QRScannerDialog$lambda$16$lambda$15$lambda$12(Function1 function1, MutableState mutableState, MutableState mutableState2, List list) {
        Object next;
        Intrinsics.checkNotNull(list);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            String rawValue = ((Barcode) next).getRawValue();
            if (rawValue != null && StringsKt.contains$default(rawValue, "BOOKXCHANGE", false, 2, (Object) null)) {
                break;
            }
        }
        Barcode barcode = (Barcode) next;
        if ((barcode != null ? barcode.getRawValue() : null) != null) {
            String rawValue2 = barcode.getRawValue();
            Intrinsics.checkNotNull(rawValue2);
            String strSubstring = rawValue2.substring(StringsKt.indexOf$default(rawValue2, "BOOKXCHANGE", 0, false, 6, (Object) null));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            function1.invoke(StringsKt.trim(strSubstring).toString());
        } else if (!list.isEmpty() && ((Barcode) list.get(0)).getRawValue() != null) {
            String rawValue3 = ((Barcode) list.get(0)).getRawValue();
            Intrinsics.checkNotNull(rawValue3);
            function1.invoke(StringsKt.trim(rawValue3).toString());
        } else {
            mutableState.setValue("No valid BookXchange QR detected. Please ensure the QR code fills the frame.");
            QRScannerDialog$lambda$10(mutableState2, false);
        }
        return Unit.INSTANCE;
    }

    static final void QRScannerDialog$lambda$16$lambda$15$lambda$14(MutableState mutableState, MutableState mutableState2, Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "it");
        mutableState.setValue("Failed to scan photo: " + exc.getLocalizedMessage());
        QRScannerDialog$lambda$10(mutableState2, false);
    }

    static final Unit QRScannerDialog$lambda$48(final Function1 function1, final LifecycleOwner lifecycleOwner, final MutableState mutableState, final MutableState mutableState2, final ManagedActivityResultLauncher managedActivityResultLauncher, final State state, final ManagedActivityResultLauncher managedActivityResultLauncher2, final String str, final Function0 function0, final Book book, final MutableState mutableState3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C134@5351L11,134@5309L62,135@5410L39,136@5460L11403,129@5114L11749:QRScannerDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1535615912, i, -1, "com.example.ui.screens.QRScannerDialog.<anonymous> (QRScannerDialog.kt:129)");
            }
            CardKt.Card(SizeKt.fillMaxHeight(SizeKt.fillMaxWidth(Modifier.Companion, 0.95f), 0.85f), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(24.0f)), CardDefaults.INSTANCE.cardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0L, 0L, composer, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.cardElevation-aqJV_2Y(Dp.constructor-impl(10.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer, (CardDefaults.$stable << 18) | 6, 62), (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(1372808346, true, new Function3() { // from class: com.example.ui.screens.QRScannerDialogKt$$ExternalSyntheticLambda3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return QRScannerDialogKt.QRScannerDialog$lambda$48$lambda$47(function1, lifecycleOwner, mutableState, mutableState2, managedActivityResultLauncher, state, managedActivityResultLauncher2, str, function0, book, mutableState3, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer, 54), composer, 196614, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit QRScannerDialog$lambda$48$lambda$47(final Function1 function1, final LifecycleOwner lifecycleOwner, MutableState mutableState, final MutableState mutableState2, final ManagedActivityResultLauncher managedActivityResultLauncher, State state, final ManagedActivityResultLauncher managedActivityResultLauncher2, final String str, Function0 function0, Book book, final MutableState mutableState3, ColumnScope columnScope, Composer composer, int i) {
        BoxScope boxScope;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Composer composer2;
        int i2;
        Intrinsics.checkNotNullParameter(columnScope, "$this$Card");
        ComposerKt.sourceInformation(composer, "C137@5474L11379:QRScannerDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1372808346, i, -1, "com.example.ui.screens.QRScannerDialog.<anonymous>.<anonymous> (QRScannerDialog.kt:137)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null);
            ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxSize$default);
            Function0 constructor = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composer3 = Updater.constructor-impl(composer);
            Updater.set-impl(composer3, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer3, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composer3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composer3.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.set-impl(composer3, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScope boxScope2 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1180001673, "C241@11118L2669,297@13839L1700:QRScannerDialog.kt#2thlc2");
            if (QRScannerDialog$lambda$1(mutableState)) {
                composer.startReplaceGroup(-1180203453);
                ComposerKt.sourceInformation(composer, "139@5599L48,140@5691L139,140@5668L162,147@5899L3557,146@5852L3685");
                ComposerKt.sourceInformationMarkerStart(composer, -1977736304, "CC(remember):QRScannerDialog.kt#9igjgp");
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = Executors.newSingleThreadExecutor();
                    composer.updateRememberedValue(objRememberedValue);
                }
                final ExecutorService executorService = (ExecutorService) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composer);
                Unit unit = Unit.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, -1977733269, "CC(remember):QRScannerDialog.kt#9igjgp");
                boolean zChangedInstance = composer.changedInstance(executorService);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.example.ui.screens.QRScannerDialogKt$$ExternalSyntheticLambda14
                        public final Object invoke(Object obj) {
                            return QRScannerDialogKt.QRScannerDialog$lambda$48$lambda$47$lambda$46$lambda$22$lambda$21(executorService, (DisposableEffectScope) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                EffectsKt.DisposableEffect(unit, (Function1) objRememberedValue2, composer, 6);
                ComposerKt.sourceInformationMarkerStart(composer, -1977723195, "CC(remember):QRScannerDialog.kt#9igjgp");
                boolean zChangedInstance2 = composer.changedInstance(executorService) | composer.changed(function1) | composer.changedInstance(lifecycleOwner);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.example.ui.screens.QRScannerDialogKt$$ExternalSyntheticLambda15
                        public final Object invoke(Object obj) {
                            return QRScannerDialogKt.QRScannerDialog$lambda$48$lambda$47$lambda$46$lambda$31$lambda$30(executorService, lifecycleOwner, mutableState2, function1, (Context) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                AndroidView_androidKt.AndroidView((Function1) objRememberedValue3, SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null), (Function1) null, composer, 48, 4);
                composer2 = composer;
                composer2.endReplaceGroup();
                boxScope = boxScope2;
                str4 = "C73@3429L9:Box.kt#2w3rfo";
                str7 = "C88@4444L9:Column.kt#2w3rfo";
                str6 = "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo";
                str3 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                str2 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                str5 = "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo";
                str8 = "CC(remember):QRScannerDialog.kt#9igjgp";
            } else {
                composer.startReplaceGroup(-1176308830);
                ComposerKt.sourceInformation(composer, "210@9633L1382");
                Modifier modifier = BackgroundKt.background-bw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null), Color.Companion.getBlack-0d7_KjU(), (Shape) null, 2, (Object) null);
                Alignment center = Alignment.Companion.getCenter();
                ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifier);
                Function0 constructor2 = ComposeUiNode.Companion.getConstructor();
                boxScope = boxScope2;
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                Composer composer4 = Updater.constructor-impl(composer);
                Updater.set-impl(composer4, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl(composer4, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composer4.getInserting() || !Intrinsics.areEqual(composer4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composer4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composer4.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.set-impl(composer4, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScope boxScope3 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, 261387431, "C216@9887L1106:QRScannerDialog.kt#2thlc2");
                Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
                Modifier modifier2 = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(24.0f));
                ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifier2);
                Function0 constructor3 = ComposeUiNode.Companion.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor3);
                } else {
                    composer.useNode();
                }
                Composer composer5 = Updater.constructor-impl(composer);
                Updater.set-impl(composer5, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl(composer5, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composer5.getInserting() || !Intrinsics.areEqual(composer5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composer5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composer5.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.set-impl(composer5, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScope columnScope2 = ColumnScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, -1979244870, "C220@10094L267,226@10390L41,227@10460L244,232@10733L41,233@10820L57,233@10803L164:QRScannerDialog.kt#2thlc2");
                IconKt.Icon-ww6aTOc(CameraAltKt.getCameraAlt(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(64.0f)), Color.Companion.getWhite-0d7_KjU(), composer, 3504, 0);
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), composer, 6);
                str2 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                str3 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                str4 = "C73@3429L9:Box.kt#2w3rfo";
                str5 = "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo";
                str6 = "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo";
                str7 = "C88@4444L9:Column.kt#2w3rfo";
                TextKt.Text--4IGK_g("Camera permission is needed to scan the borrower's QR code.", (Modifier) null, Color.Companion.getWhite-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.box-impl(TextAlign.Companion.getCenter-e0LSkKk()), 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 390, 0, 130554);
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), composer, 6);
                ComposerKt.sourceInformationMarkerStart(composer, 1875838457, "CC(remember):QRScannerDialog.kt#9igjgp");
                boolean zChangedInstance3 = composer.changedInstance(managedActivityResultLauncher);
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.example.ui.screens.QRScannerDialogKt$$ExternalSyntheticLambda16
                        public final Object invoke() {
                            return QRScannerDialogKt.QRScannerDialog$lambda$48$lambda$47$lambda$46$lambda$35$lambda$34$lambda$33$lambda$32(managedActivityResultLauncher);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                str8 = "CC(remember):QRScannerDialog.kt#9igjgp";
                ButtonKt.Button((Function0) objRememberedValue4, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$QRScannerDialogKt.INSTANCE.getLambda$584615728$app(), composer, 805306368, 510);
                composer2 = composer;
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endReplaceGroup();
            }
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null);
            Alignment center2 = Alignment.Companion.getCenter();
            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, str6);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
            String str9 = str3;
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str9);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxSize$default2);
            Function0 constructor4 = ComposeUiNode.Companion.getConstructor();
            String str10 = str6;
            String str11 = str2;
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str11);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor4);
            } else {
                composer2.useNode();
            }
            Composer composer6 = Updater.constructor-impl(composer2);
            Updater.set-impl(composer6, measurePolicyMaybeCachedBoxMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer6, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer6.getInserting() || !Intrinsics.areEqual(composer6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composer6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composer6.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.set-impl(composer6, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, str4);
            BoxScope boxScope4 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, -1508102037, "C250@11512L11,246@11319L356,256@11747L2022:QRScannerDialog.kt#2thlc2");
            BoxKt.Box(BorderKt.border(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(260.0f)), BorderStrokeKt.BorderStroke-cXLIe8U(Dp.constructor-impl(3.0f), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getPrimary-0d7_KjU(), QRScannerDialog$lambda$18(state), 0.0f, 0.0f, 0.0f, 14, (Object) null)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(16.0f))), composer2, 0);
            Modifier modifier3 = PaddingKt.padding-qDBjuR0$default(boxScope4.align(Modifier.Companion, Alignment.Companion.getBottomCenter()), 0.0f, 0.0f, 0.0f, Dp.constructor-impl(32.0f), 7, (Object) null);
            Alignment.Horizontal centerHorizontally2 = Alignment.Companion.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, str5);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, composer2, 48);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str9);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifier3);
            Function0 constructor5 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str11);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor5);
            } else {
                composer2.useNode();
            }
            Composer composer7 = Updater.constructor-impl(composer2);
            Updater.set-impl(composer7, measurePolicyColumnMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer7, currentCompositionLocalMap5, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash5 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer7.getInserting() || !Intrinsics.areEqual(composer7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                composer7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                composer7.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
            }
            Updater.set-impl(composer7, modifierMaterializeModifier5, ComposeUiNode.Companion.getSetModifier());
            String str12 = str7;
            ComposerKt.sourceInformationMarkerStart(composer2, -384784025, str12);
            ColumnScope columnScope3 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, -676439817, "C266@12278L605,262@12035L848,278@12909L41,282@13082L33,283@13169L191,281@13028L719:QRScannerDialog.kt#2thlc2");
            String str13 = str5;
            String str14 = str4;
            SurfaceKt.Surface-T9BRK9s(PaddingKt.padding-VpY3zN4$default(Modifier.Companion, Dp.constructor-impl(16.0f), 0.0f, 2, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(20.0f)), Color.copy-wmQWz5c$default(Color.Companion.getBlack-0d7_KjU(), 0.75f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-1061628873, true, new Function2() { // from class: com.example.ui.screens.QRScannerDialogKt$$ExternalSyntheticLambda17
                public final Object invoke(Object obj, Object obj2) {
                    return QRScannerDialogKt.QRScannerDialog$lambda$48$lambda$47$lambda$46$lambda$40$lambda$39$lambda$36(str, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer2, 54), composer, 12583302, 120);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(12.0f)), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -714525475, str8);
            boolean zChangedInstance4 = composer.changedInstance(managedActivityResultLauncher2);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = new Function0() { // from class: com.example.ui.screens.QRScannerDialogKt$$ExternalSyntheticLambda18
                    public final Object invoke() {
                        return QRScannerDialogKt.QRScannerDialog$lambda$48$lambda$47$lambda$46$lambda$40$lambda$39$lambda$38$lambda$37(managedActivityResultLauncher2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ButtonKt.OutlinedButton((Function0) objRememberedValue5, (Modifier) null, false, (Shape) null, ButtonDefaults.INSTANCE.outlinedButtonColors-ro_MJ88(Color.copy-wmQWz5c$default(Color.Companion.getBlack-0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, (Object) null), Color.Companion.getWhite-0d7_KjU(), 0L, 0L, composer, (ButtonDefaults.$stable << 12) | 54, 12), (ButtonElevation) null, BorderStrokeKt.BorderStroke-cXLIe8U(Dp.constructor-impl(1.0f), Color.copy-wmQWz5c$default(Color.Companion.getWhite-0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$QRScannerDialogKt.INSTANCE.m348getLambda$558201330$app(), composer, 806879232, 430);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier modifier4 = PaddingKt.padding-VpY3zN4(BackgroundKt.background-bw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Color.copy-wmQWz5c$default(Color.Companion.getBlack-0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null), (Shape) null, 2, (Object) null), Dp.constructor-impl(16.0f), Dp.constructor-impl(12.0f));
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer, 54);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, str9);
            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer, modifier4);
            Function0 constructor6 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, str11);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor6);
            } else {
                composer.useNode();
            }
            Composer composer8 = Updater.constructor-impl(composer);
            Updater.set-impl(composer8, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer8, currentCompositionLocalMap6, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash6 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer8.getInserting() || !Intrinsics.areEqual(composer8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                composer8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                composer8.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
            }
            Updater.set-impl(composer8, modifierMaterializeModifier6, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1608634945, "C305@14241L1104,327@15366L155:QRScannerDialog.kt#2thlc2");
            Alignment.Vertical centerVertically2 = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier5 = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer, 48);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, str9);
            int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer, modifier5);
            Function0 constructor7 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, str11);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor7);
            } else {
                composer.useNode();
            }
            Composer composer9 = Updater.constructor-impl(composer);
            Updater.set-impl(composer9, measurePolicyRowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer9, currentCompositionLocalMap7, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash7 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer9.getInserting() || !Intrinsics.areEqual(composer9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                composer9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                composer9.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
            }
            Updater.set-impl(composer9, modifierMaterializeModifier7, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope2 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1271860463, "C306@14319L251,312@14595L39,313@14659L664:QRScannerDialog.kt#2thlc2");
            IconKt.Icon-ww6aTOc(QrCodeScannerKt.getQrCodeScanner(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(24.0f)), Color.Companion.getWhite-0d7_KjU(), composer, 3504, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, str13);
            Modifier modifier6 = Modifier.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, str9);
            int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap8 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer, modifier6);
            Function0 constructor8 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, str11);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor8);
            } else {
                composer.useNode();
            }
            Composer composer10 = Updater.constructor-impl(composer);
            Updater.set-impl(composer10, measurePolicyColumnMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer10, currentCompositionLocalMap8, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash8 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer10.getInserting() || !Intrinsics.areEqual(composer10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                composer10.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                composer10.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
            }
            Updater.set-impl(composer10, modifierMaterializeModifier8, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384784025, str12);
            ColumnScope columnScope4 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1421067540, "C318@14984L10,314@14696L339,323@15247L10,320@15064L233:QRScannerDialog.kt#2thlc2");
            BoxScope boxScope5 = boxScope;
            TextKt.Text--4IGK_g(Intrinsics.areEqual(str, "HANDOVER") ? "Scan Handover QR" : "Scan Return QR", (Modifier) null, Color.Companion.getWhite-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleSmall(), composer, 196992, 0, 65498);
            TextKt.Text--4IGK_g(book.getTitle(), (Modifier) null, Color.copy-wmQWz5c$default(Color.Companion.getWhite-0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 384, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            IconButtonKt.IconButton(function0, (Modifier) null, false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableSingletons$QRScannerDialogKt.INSTANCE.m349getLambda$748619679$app(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (QRScannerDialog$lambda$6(mutableState3) != null) {
                composer.startReplaceGroup(-1170321676);
                ComposerKt.sourceInformation(composer, "335@15695L11,340@15982L400,334@15640L742");
                i2 = 1;
                SurfaceKt.Surface-T9BRK9s(PaddingKt.padding-qDBjuR0$default(boxScope5.align(Modifier.Companion, Alignment.Companion.getTopCenter()), Dp.constructor-impl(16.0f), Dp.constructor-impl(64.0f), Dp.constructor-impl(16.0f), 0.0f, 8, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getErrorContainer-0d7_KjU(), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(1822373837, true, new Function2() { // from class: com.example.ui.screens.QRScannerDialogKt$$ExternalSyntheticLambda19
                    public final Object invoke(Object obj, Object obj2) {
                        return QRScannerDialogKt.QRScannerDialog$lambda$48$lambda$47$lambda$46$lambda$44(mutableState3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer, 54), composer, 12582912, 120);
            } else {
                i2 = 1;
                composer.startReplaceGroup(-1185839966);
            }
            composer.endReplaceGroup();
            if (QRScannerDialog$lambda$9(mutableState2)) {
                composer.startReplaceGroup(-1169521969);
                ComposerKt.sourceInformation(composer, "352@16458L363");
                Modifier modifier7 = BackgroundKt.background-bw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, i2, (Object) null), Color.copy-wmQWz5c$default(Color.Companion.getBlack-0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, (Object) null), (Shape) null, 2, (Object) null);
                Alignment center3 = Alignment.Companion.getCenter();
                ComposerKt.sourceInformationMarkerStart(composer, 733328855, str10);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(center3, false);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, str9);
                int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap9 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer, modifier7);
                Function0 constructor9 = ComposeUiNode.Companion.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, str11);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor9);
                } else {
                    composer.useNode();
                }
                Composer composer11 = Updater.constructor-impl(composer);
                Updater.set-impl(composer11, measurePolicyMaybeCachedBoxMeasurePolicy4, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl(composer11, currentCompositionLocalMap9, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash9 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composer11.getInserting() || !Intrinsics.areEqual(composer11.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                    composer11.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
                    composer11.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash9);
                }
                Updater.set-impl(composer11, modifierMaterializeModifier9, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -2146769399, str14);
                BoxScope boxScope6 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, -62123674, "C358@16779L11,358@16731L68:QRScannerDialog.kt#2thlc2");
                ProgressIndicatorKt.CircularProgressIndicator-LxG7B9w((Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0.0f, 0L, 0, composer, 0, 29);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
            } else {
                composer.startReplaceGroup(-1185839966);
            }
            composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final PreviewView QRScannerDialog$lambda$48$lambda$47$lambda$46$lambda$31$lambda$30(final ExecutorService executorService, final LifecycleOwner lifecycleOwner, final MutableState mutableState, final Function1 function1, final Context context) {
        Intrinsics.checkNotNullParameter(context, "ctx");
        final PreviewView previewView = new PreviewView(context);
        final ListenableFuture companion = ProcessCameraProvider.Companion.getInstance(context);
        companion.addListener(new Runnable() { // from class: com.example.ui.screens.QRScannerDialogKt$$ExternalSyntheticLambda30
            @Override // java.lang.Runnable
            public final void run() {
                QRScannerDialogKt.QRScannerDialog$lambda$48$lambda$47$lambda$46$lambda$31$lambda$30$lambda$29(companion, executorService, lifecycleOwner, previewView, mutableState, context, function1);
            }
        }, ContextCompat.getMainExecutor(context));
        return previewView;
    }

    static final void QRScannerDialog$lambda$48$lambda$47$lambda$46$lambda$31$lambda$30$lambda$29(ListenableFuture listenableFuture, ExecutorService executorService, LifecycleOwner lifecycleOwner, PreviewView previewView, final MutableState mutableState, final Context context, final Function1 function1) {
        ProcessCameraProvider processCameraProvider = (ProcessCameraProvider) listenableFuture.get();
        UseCase useCaseBuild = new Preview.Builder().build();
        useCaseBuild.setSurfaceProvider(previewView.getSurfaceProvider());
        Intrinsics.checkNotNullExpressionValue(useCaseBuild, "also(...)");
        final BarcodeScanner client = BarcodeScanning.getClient(new BarcodeScannerOptions.Builder().setBarcodeFormats(UserVerificationMethods.USER_VERIFY_HANDPRINT, new int[0]).build());
        Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
        UseCase useCaseBuild2 = new ImageAnalysis.Builder().setBackpressureStrategy(0).build();
        Intrinsics.checkNotNullExpressionValue(useCaseBuild2, "build(...)");
        useCaseBuild2.setAnalyzer(executorService, new ImageAnalysis.Analyzer() { // from class: com.example.ui.screens.QRScannerDialogKt$$ExternalSyntheticLambda7
            public final void analyze(ImageProxy imageProxy) {
                QRScannerDialogKt.QRScannerDialog$lambda$48$lambda$47$lambda$46$lambda$31$lambda$30$lambda$29$lambda$28(client, mutableState, context, function1, imageProxy);
            }
        });
        try {
            processCameraProvider.unbindAll();
            CameraSelector cameraSelector = CameraSelector.DEFAULT_BACK_CAMERA;
            Intrinsics.checkNotNullExpressionValue(cameraSelector, "DEFAULT_BACK_CAMERA");
            processCameraProvider.bindToLifecycle(lifecycleOwner, cameraSelector, new UseCase[]{useCaseBuild, useCaseBuild2});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static final void QRScannerDialog$lambda$48$lambda$47$lambda$46$lambda$31$lambda$30$lambda$29$lambda$28(BarcodeScanner barcodeScanner, final MutableState mutableState, final Context context, final Function1 function1, final ImageProxy imageProxy) {
        Intrinsics.checkNotNullParameter(imageProxy, "imageProxy");
        Image image = imageProxy.getImage();
        if (image != null && !QRScannerDialog$lambda$9(mutableState)) {
            InputImage inputImageFromMediaImage = InputImage.fromMediaImage(image, imageProxy.getImageInfo().getRotationDegrees());
            Intrinsics.checkNotNullExpressionValue(inputImageFromMediaImage, "fromMediaImage(...)");
            Task taskProcess = barcodeScanner.process(inputImageFromMediaImage);
            final Function1 function2 = new Function1() { // from class: com.example.ui.screens.QRScannerDialogKt$$ExternalSyntheticLambda32
                public final Object invoke(Object obj) {
                    return QRScannerDialogKt.QRScannerDialog$lambda$48$lambda$47$lambda$46$lambda$31$lambda$30$lambda$29$lambda$28$lambda$25(context, mutableState, function1, (List) obj);
                }
            };
            taskProcess.addOnSuccessListener(new OnSuccessListener() { // from class: com.example.ui.screens.QRScannerDialogKt$$ExternalSyntheticLambda1
                public final void onSuccess(Object obj) {
                    function2.invoke(obj);
                }
            }).addOnCompleteListener(new OnCompleteListener() { // from class: com.example.ui.screens.QRScannerDialogKt$$ExternalSyntheticLambda2
                public final void onComplete(Task task) {
                    QRScannerDialogKt.QRScannerDialog$lambda$48$lambda$47$lambda$46$lambda$31$lambda$30$lambda$29$lambda$28$lambda$27(imageProxy, task);
                }
            });
            return;
        }
        imageProxy.close();
    }

    static final Unit QRScannerDialog$lambda$48$lambda$47$lambda$46$lambda$31$lambda$30$lambda$29$lambda$28$lambda$25(Context context, MutableState mutableState, final Function1 function1, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String rawValue = ((Barcode) it.next()).getRawValue();
            String str = rawValue;
            if (str != null && !StringsKt.isBlank(str) && StringsKt.contains$default(str, "BOOKXCHANGE", false, 2, (Object) null)) {
                QRScannerDialog$lambda$10(mutableState, true);
                String strSubstring = rawValue.substring(StringsKt.indexOf$default(str, "BOOKXCHANGE", 0, false, 6, (Object) null));
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                final String string = StringsKt.trim(strSubstring).toString();
                ContextCompat.getMainExecutor(context).execute(new Runnable() { // from class: com.example.ui.screens.QRScannerDialogKt$$ExternalSyntheticLambda12
                    @Override // java.lang.Runnable
                    public final void run() {
                        function1.invoke(string);
                    }
                });
                break;
            }
        }
        return Unit.INSTANCE;
    }

    static final void QRScannerDialog$lambda$48$lambda$47$lambda$46$lambda$31$lambda$30$lambda$29$lambda$28$lambda$27(ImageProxy imageProxy, Task task) {
        Intrinsics.checkNotNullParameter(task, "it");
        imageProxy.close();
    }

    static final Unit QRScannerDialog$lambda$48$lambda$47$lambda$46$lambda$35$lambda$34$lambda$33$lambda$32(ManagedActivityResultLauncher managedActivityResultLauncher) {
        managedActivityResultLauncher.launch("android.permission.CAMERA");
        return Unit.INSTANCE;
    }

    static final Unit QRScannerDialog$lambda$48$lambda$47$lambda$46$lambda$40$lambda$39$lambda$36(String str, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C272@12642L10,267@12308L549:QRScannerDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1061628873, i, -1, "com.example.ui.screens.QRScannerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QRScannerDialog.kt:267)");
            }
            String str2 = Intrinsics.areEqual(str, "HANDOVER") ? "Point at borrower's Handover QR code" : "Point at lender's Return QR code";
            String str3 = str2;
            TextKt.Text--4IGK_g(str3, PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(16.0f), Dp.constructor-impl(8.0f)), Color.Companion.getWhite-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 197040, 0, 65496);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit QRScannerDialog$lambda$48$lambda$47$lambda$46$lambda$40$lambda$39$lambda$38$lambda$37(ManagedActivityResultLauncher managedActivityResultLauncher) {
        managedActivityResultLauncher.launch((Object) null);
        return Unit.INSTANCE;
    }

    static final Unit QRScannerDialog$lambda$48$lambda$47$lambda$46$lambda$44(MutableState mutableState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C343@16112L11,344@16192L10,341@16008L352:QRScannerDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1822373837, i, -1, "com.example.ui.screens.QRScannerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QRScannerDialog.kt:341)");
            }
            String strQRScannerDialog$lambda$6 = QRScannerDialog$lambda$6(mutableState);
            Intrinsics.checkNotNull(strQRScannerDialog$lambda$6);
            TextKt.Text--4IGK_g(strQRScannerDialog$lambda$6, PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(12.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnErrorContainer-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.box-impl(TextAlign.Companion.getCenter-e0LSkKk()), 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 48, 0, 65016);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void GlobalQRScannerDialog(final Function1<? super String, Unit> function1, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        final Function0<Unit> function2;
        Intrinsics.checkNotNullParameter(function1, "onQrScanned");
        Intrinsics.checkNotNullParameter(function0, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1230709210);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(GlobalQRScannerDialog)P(1)371@17020L7,372@17073L7,377@17240L5112,374@17086L5266:QRScannerDialog.kt#2thlc2");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function2 = function0;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1230709210, i2, -1, "com.example.ui.screens.GlobalQRScannerDialog (QRScannerDialog.kt:370)");
            }
            CompositionLocal localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final Context context = (Context) objConsume;
            CompositionLocal localLifecycleOwner = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composerStartRestartGroup.consume(localLifecycleOwner);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final LifecycleOwner lifecycleOwner = (LifecycleOwner) objConsume2;
            function2 = function0;
            AndroidDialog_androidKt.Dialog(function2, new DialogProperties(false, false, false, 1, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-1750332995, true, new Function2() { // from class: com.example.ui.screens.QRScannerDialogKt$$ExternalSyntheticLambda24
                public final Object invoke(Object obj, Object obj2) {
                    return QRScannerDialogKt.GlobalQRScannerDialog$lambda$67(function1, lifecycleOwner, function0, context, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 3) & 14) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.QRScannerDialogKt$$ExternalSyntheticLambda25
                public final Object invoke(Object obj, Object obj2) {
                    return QRScannerDialogKt.GlobalQRScannerDialog$lambda$68(function1, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final Unit GlobalQRScannerDialog$lambda$67(final Function1 function1, final LifecycleOwner lifecycleOwner, final Function0 function0, final Context context, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C381@17348L4998,378@17250L5096:QRScannerDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1750332995, i, -1, "com.example.ui.screens.GlobalQRScannerDialog.<anonymous> (QRScannerDialog.kt:378)");
            }
            SurfaceKt.Surface-T9BRK9s(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null), (Shape) null, Color.Companion.getBlack-0d7_KjU(), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-1076753576, true, new Function2() { // from class: com.example.ui.screens.QRScannerDialogKt$$ExternalSyntheticLambda13
                public final Object invoke(Object obj, Object obj2) {
                    return QRScannerDialogKt.GlobalQRScannerDialog$lambda$67$lambda$66(function1, lifecycleOwner, function0, context, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 12583302, 122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit GlobalQRScannerDialog$lambda$67$lambda$66(final Function1 function1, final LifecycleOwner lifecycleOwner, Function0 function0, Context context, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C382@17362L4974:QRScannerDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1076753576, i, -1, "com.example.ui.screens.GlobalQRScannerDialog.<anonymous>.<anonymous> (QRScannerDialog.kt:382)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null);
            ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxSize$default);
            Function0 constructor = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composer2 = Updater.constructor-impl(composer);
            Updater.set-impl(composer2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer2, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer2.getInserting() || !Intrinsics.areEqual(composer2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composer2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composer2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.set-impl(composer2, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScope boxScope = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -651795926, "C383@17443L218,391@17836L41,389@17694L201,394@17934L154,394@17913L175,463@21581L396,473@22011L311:QRScannerDialog.kt#2thlc2");
            ComposerKt.sourceInformationMarkerStart(composer, 117517740, "CC(remember):QRScannerDialog.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(ContextCompat.checkSelfPermission(context, "android.permission.CAMERA") == 0), (SnapshotMutationPolicy) null, 2, (Object) null);
                composer.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ActivityResultContract requestPermission = new ActivityResultContracts.RequestPermission();
            ComposerKt.sourceInformationMarkerStart(composer, 117530139, "CC(remember):QRScannerDialog.kt#9igjgp");
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.example.ui.screens.QRScannerDialogKt$$ExternalSyntheticLambda28
                    public final Object invoke(Object obj) {
                        return QRScannerDialogKt.GlobalQRScannerDialog$lambda$67$lambda$66$lambda$65$lambda$54$lambda$53(mutableState, ((Boolean) obj).booleanValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestPermission, (Function1) objRememberedValue2, composer, 48);
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 117533388, "CC(remember):QRScannerDialog.kt#9igjgp");
            boolean zChangedInstance = composer.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult);
            QRScannerDialogKt$GlobalQRScannerDialog$1$1$1$1$1 qRScannerDialogKt$GlobalQRScannerDialog$1$1$1$1$1RememberedValue = composer.rememberedValue();
            if (zChangedInstance || qRScannerDialogKt$GlobalQRScannerDialog$1$1$1$1$1RememberedValue == Composer.Companion.getEmpty()) {
                qRScannerDialogKt$GlobalQRScannerDialog$1$1$1$1$1RememberedValue = new QRScannerDialogKt$GlobalQRScannerDialog$1$1$1$1$1(managedActivityResultLauncherRememberLauncherForActivityResult, mutableState, null);
                composer.updateRememberedValue(qRScannerDialogKt$GlobalQRScannerDialog$1$1$1$1$1RememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            EffectsKt.LaunchedEffect(unit, (Function2) qRScannerDialogKt$GlobalQRScannerDialog$1$1$1$1$1RememberedValue, composer, 6);
            if (GlobalQRScannerDialog$lambda$67$lambda$66$lambda$65$lambda$51(mutableState)) {
                composer.startReplaceGroup(-651138107);
                ComposerKt.sourceInformation(composer, "402@18197L2978,401@18150L3106,455@21298L247");
                ComposerKt.sourceInformationMarkerStart(composer, 117544628, "CC(remember):QRScannerDialog.kt#9igjgp");
                boolean zChanged = composer.changed(function1) | composer.changedInstance(lifecycleOwner);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChanged || objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.example.ui.screens.QRScannerDialogKt$$ExternalSyntheticLambda29
                        public final Object invoke(Object obj) {
                            return QRScannerDialogKt.GlobalQRScannerDialog$lambda$67$lambda$66$lambda$65$lambda$64$lambda$63(lifecycleOwner, function1, (Context) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                AndroidView_androidKt.AndroidView((Function1) objRememberedValue3, SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null), (Function1) null, composer, 48, 4);
                BoxKt.Box(BorderKt.border-xT4_qwU(SizeKt.size-3ABfNKs(boxScope.align(Modifier.Companion, Alignment.Companion.getCenter()), Dp.constructor-impl(250.0f)), Dp.constructor-impl(2.0f), Color.Companion.getWhite-0d7_KjU(), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f))), composer, 0);
            } else {
                composer.startReplaceGroup(-669228560);
            }
            composer.endReplaceGroup();
            IconButtonKt.IconButton(function0, BackgroundKt.background-bw27NRU(PaddingKt.padding-3ABfNKs(boxScope.align(Modifier.Companion, Alignment.Companion.getTopEnd()), Dp.constructor-impl(16.0f)), Color.copy-wmQWz5c$default(Color.Companion.getBlack-0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null), RoundedCornerShapeKt.getCircleShape()), false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableSingletons$QRScannerDialogKt.INSTANCE.m347getLambda$1825939819$app(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
            TextKt.Text--4IGK_g("Scan Any BookXchange QR Code", PaddingKt.padding-qDBjuR0$default(boxScope.align(Modifier.Companion, Alignment.Companion.getTopCenter()), 0.0f, Dp.constructor-impl(24.0f), 0.0f, 0.0f, 13, (Object) null), Color.Companion.getWhite-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 196998, 0, 131032);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean GlobalQRScannerDialog$lambda$67$lambda$66$lambda$65$lambda$51(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void GlobalQRScannerDialog$lambda$67$lambda$66$lambda$65$lambda$52(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    static final Unit GlobalQRScannerDialog$lambda$67$lambda$66$lambda$65$lambda$54$lambda$53(MutableState mutableState, boolean z) {
        GlobalQRScannerDialog$lambda$67$lambda$66$lambda$65$lambda$52(mutableState, z);
        return Unit.INSTANCE;
    }

    static final PreviewView GlobalQRScannerDialog$lambda$67$lambda$66$lambda$65$lambda$64$lambda$63(final LifecycleOwner lifecycleOwner, final Function1 function1, final Context context) {
        Intrinsics.checkNotNullParameter(context, "ctx");
        final PreviewView previewView = new PreviewView(context);
        final ListenableFuture companion = ProcessCameraProvider.Companion.getInstance(context);
        companion.addListener(new Runnable() { // from class: com.example.ui.screens.QRScannerDialogKt$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                QRScannerDialogKt.GlobalQRScannerDialog$lambda$67$lambda$66$lambda$65$lambda$64$lambda$63$lambda$62(companion, lifecycleOwner, previewView, context, function1);
            }
        }, ContextCompat.getMainExecutor(context));
        return previewView;
    }

    static final void GlobalQRScannerDialog$lambda$67$lambda$66$lambda$65$lambda$64$lambda$63$lambda$62(ListenableFuture listenableFuture, LifecycleOwner lifecycleOwner, PreviewView previewView, Context context, final Function1 function1) {
        ProcessCameraProvider processCameraProvider = (ProcessCameraProvider) listenableFuture.get();
        UseCase useCaseBuild = new Preview.Builder().build();
        useCaseBuild.setSurfaceProvider(previewView.getSurfaceProvider());
        Intrinsics.checkNotNullExpressionValue(useCaseBuild, "also(...)");
        UseCase useCaseBuild2 = new ImageAnalysis.Builder().setBackpressureStrategy(0).build();
        useCaseBuild2.setAnalyzer(ContextCompat.getMainExecutor(context), new ImageAnalysis.Analyzer() { // from class: com.example.ui.screens.QRScannerDialogKt$$ExternalSyntheticLambda0
            public final void analyze(ImageProxy imageProxy) {
                QRScannerDialogKt.GlobalQRScannerDialog$lambda$67$lambda$66$lambda$65$lambda$64$lambda$63$lambda$62$lambda$61$lambda$60(function1, imageProxy);
            }
        });
        Intrinsics.checkNotNullExpressionValue(useCaseBuild2, "also(...)");
        try {
            processCameraProvider.unbindAll();
            CameraSelector cameraSelector = CameraSelector.DEFAULT_BACK_CAMERA;
            Intrinsics.checkNotNullExpressionValue(cameraSelector, "DEFAULT_BACK_CAMERA");
            processCameraProvider.bindToLifecycle(lifecycleOwner, cameraSelector, new UseCase[]{useCaseBuild, useCaseBuild2});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static final void GlobalQRScannerDialog$lambda$67$lambda$66$lambda$65$lambda$64$lambda$63$lambda$62$lambda$61$lambda$60(final Function1 function1, final ImageProxy imageProxy) {
        Intrinsics.checkNotNullParameter(imageProxy, "imageProxy");
        Image image = imageProxy.getImage();
        if (image != null) {
            InputImage inputImageFromMediaImage = InputImage.fromMediaImage(image, imageProxy.getImageInfo().getRotationDegrees());
            Intrinsics.checkNotNullExpressionValue(inputImageFromMediaImage, "fromMediaImage(...)");
            BarcodeScanner client = BarcodeScanning.getClient();
            Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
            Task taskProcess = client.process(inputImageFromMediaImage);
            final Function1 function2 = new Function1() { // from class: com.example.ui.screens.QRScannerDialogKt$$ExternalSyntheticLambda4
                public final Object invoke(Object obj) {
                    return QRScannerDialogKt.GlobalQRScannerDialog$lambda$67$lambda$66$lambda$65$lambda$64$lambda$63$lambda$62$lambda$61$lambda$60$lambda$57(function1, (List) obj);
                }
            };
            taskProcess.addOnSuccessListener(new OnSuccessListener() { // from class: com.example.ui.screens.QRScannerDialogKt$$ExternalSyntheticLambda5
                public final void onSuccess(Object obj) {
                    function2.invoke(obj);
                }
            }).addOnCompleteListener(new OnCompleteListener() { // from class: com.example.ui.screens.QRScannerDialogKt$$ExternalSyntheticLambda6
                public final void onComplete(Task task) {
                    QRScannerDialogKt.GlobalQRScannerDialog$lambda$67$lambda$66$lambda$65$lambda$64$lambda$63$lambda$62$lambda$61$lambda$60$lambda$59(imageProxy, task);
                }
            });
            return;
        }
        imageProxy.close();
    }

    static final Unit GlobalQRScannerDialog$lambda$67$lambda$66$lambda$65$lambda$64$lambda$63$lambda$62$lambda$61$lambda$60$lambda$57(Function1 function1, List list) {
        Intrinsics.checkNotNull(list);
        Barcode barcode = (Barcode) CollectionsKt.firstOrNull(list);
        String rawValue = barcode != null ? barcode.getRawValue() : null;
        if (rawValue != null) {
            function1.invoke(rawValue);
        }
        return Unit.INSTANCE;
    }

    static final void GlobalQRScannerDialog$lambda$67$lambda$66$lambda$65$lambda$64$lambda$63$lambda$62$lambda$61$lambda$60$lambda$59(ImageProxy imageProxy, Task task) {
        Intrinsics.checkNotNullParameter(task, "it");
        imageProxy.close();
    }

    public static final void ConfirmTransferDialog(final Book book, final String str, final Function0<Unit> function0, final Function0<Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(book, "book");
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(function0, "onConfirm");
        Intrinsics.checkNotNullParameter(function1, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(1579199902);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ConfirmTransferDialog)P(!1,3)497@22955L1757,497@22918L1794:QRScannerDialog.kt#2thlc2");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(book) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        int i3 = i2;
        if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1579199902, i3, -1, "com.example.ui.screens.ConfirmTransferDialog (QRScannerDialog.kt:492)");
            }
            final String transferImageUrl = Intrinsics.areEqual(str, "HANDOVER") ? book.getTransferImageUrl() : book.getReturnImageUrl();
            String str2 = Intrinsics.areEqual(str, "HANDOVER") ? "Confirm Book Handover" : "Confirm Book Return";
            final String str3 = Intrinsics.areEqual(str, "HANDOVER") ? "Please verify the book condition matches the photo before accepting." : "Please verify the book condition matches the photo before confirming return.";
            final String str4 = str2;
            composer2 = composerStartRestartGroup;
            AndroidDialog_androidKt.Dialog(function1, (DialogProperties) null, ComposableLambdaKt.rememberComposableLambda(-1643630923, true, new Function2() { // from class: com.example.ui.screens.QRScannerDialogKt$$ExternalSyntheticLambda9
                public final Object invoke(Object obj, Object obj2) {
                    return QRScannerDialogKt.ConfirmTransferDialog$lambda$73(str4, str3, transferImageUrl, function1, function0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composer2, ((i3 >> 9) & 14) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.QRScannerDialogKt$$ExternalSyntheticLambda10
                public final Object invoke(Object obj, Object obj2) {
                    return QRScannerDialogKt.ConfirmTransferDialog$lambda$74(book, str, function0, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final Unit ConfirmTransferDialog$lambda$73(final String str, final String str2, final String str3, final Function0 function0, final Function0 function1, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C501@23090L1616,498@22965L1741:QRScannerDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1643630923, i, -1, "com.example.ui.screens.ConfirmTransferDialog.<anonymous> (QRScannerDialog.kt:498)");
            }
            CardKt.Card(PaddingKt.padding-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(16.0f)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(16.0f)), (CardColors) null, (CardElevation) null, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(505934375, true, new Function3() { // from class: com.example.ui.screens.QRScannerDialogKt$$ExternalSyntheticLambda31
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return QRScannerDialogKt.ConfirmTransferDialog$lambda$73$lambda$72(str, str2, str3, function0, function1, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer, 54), composer, 196614, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ConfirmTransferDialog$lambda$73$lambda$72(String str, String str2, String str3, Function0 function0, Function0 function1, ColumnScope columnScope, Composer composer, int i) {
        String str4;
        String str5;
        Composer composer2;
        Intrinsics.checkNotNullParameter(columnScope, "$this$Card");
        ComposerKt.sourceInformation(composer, "C502@23104L1592:QRScannerDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(505934375, i, -1, "com.example.ui.screens.ConfirmTransferDialog.<anonymous>.<anonymous> (QRScannerDialog.kt:502)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f));
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifier);
            Function0 constructor = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composer3 = Updater.constructor-impl(composer);
            Updater.set-impl(composer3, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer3, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composer3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composer3.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.set-impl(composer3, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScope columnScope2 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -387406867, "C503@23311L10,503@23217L116,504@23350L40,505@23444L10,505@23407L120,506@23544L41,521@24330L41,522@24388L294:QRScannerDialog.kt#2thlc2");
            TextKt.Text--4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleLarge(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            TextKt.Text--4IGK_g(str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.box-impl(TextAlign.Companion.getCenter-e0LSkKk()), 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 0, 0, 65022);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), composer, 6);
            String str6 = str3;
            if (str6 == null || StringsKt.isBlank(str6)) {
                composer.startReplaceGroup(-386629853);
                ComposerKt.sourceInformation(composer, "516@24139L11,516@24060L218");
                Modifier modifier2 = BackgroundKt.background-bw27NRU$default(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(150.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), (Shape) null, 2, (Object) null);
                Alignment center = Alignment.Companion.getCenter();
                ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifier2);
                Function0 constructor2 = ComposeUiNode.Companion.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                Composer composer4 = Updater.constructor-impl(composer);
                Updater.set-impl(composer4, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl(composer4, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composer4.getInserting() || !Intrinsics.areEqual(composer4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composer4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composer4.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.set-impl(composer4, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScope boxScope = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, 943157795, "C517@24231L25:QRScannerDialog.kt#2thlc2");
                str4 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                str5 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                TextKt.Text--4IGK_g("No photo provided", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131070);
                composer2 = composer;
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-387010905);
                ComposerKt.sourceInformation(composer, "509@23685L329");
                SingletonAsyncImageKt.m108AsyncImagegl8XCv8(str3, "Condition Photo", ClipKt.clip(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(250.0f)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(8.0f))), null, null, null, ContentScale.Companion.getCrop(), 0.0f, null, 0, false, null, composer, 1572912, 0, 4024);
                composer2 = composer;
                composer2.endReplaceGroup();
                str4 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                str5 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
            }
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), composer2, 6);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(end, Alignment.Companion.getTop(), composer2, 6);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str5);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
            Function0 constructor3 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str4);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            Composer composer5 = Updater.constructor-impl(composer2);
            Updater.set-impl(composer5, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer5, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer5.getInserting() || !Intrinsics.areEqual(composer5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composer5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composer5.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.set-impl(composer5, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, -1184755947, "C523@24491L50,524@24562L39,525@24622L42:QRScannerDialog.kt#2thlc2");
            ButtonKt.TextButton(function0, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$QRScannerDialogKt.INSTANCE.getLambda$1314557374$app(), composer2, 805306368, 510);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer2, 6);
            ButtonKt.Button(function1, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$QRScannerDialogKt.INSTANCE.getLambda$1659064177$app(), composer2, 805306368, 510);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    private static final float QRScannerDialog$lambda$18(State<Float> state) {
        return ((Number) state.getValue()).floatValue();
    }

    static final DisposableEffectResult QRScannerDialog$lambda$48$lambda$47$lambda$46$lambda$22$lambda$21(final ExecutorService executorService, DisposableEffectScope disposableEffectScope) {
        Intrinsics.checkNotNullParameter(disposableEffectScope, "$this$DisposableEffect");
        return new DisposableEffectResult() { // from class: com.example.ui.screens.QRScannerDialogKt$QRScannerDialog$lambda$48$lambda$47$lambda$46$lambda$22$lambda$21$$inlined$onDispose$1
            public void dispose() {
                executorService.shutdown();
            }
        };
    }
}
