package com.example.ui.screens;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.util.Base64;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
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
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.AutoAwesomeKt;
import androidx.compose.material.icons.filled.BookKt;
import androidx.compose.material.icons.filled.DocumentScannerKt;
import androidx.compose.material.icons.filled.InfoKt;
import androidx.compose.material.icons.filled.StarKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonElevation;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonColors;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
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
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.core.content.FileProvider;
import androidx.profileinstaller.ProfileVerifier;
import coil.compose.SingletonAsyncImageKt;
import com.example.BuildConfig;
import com.example.api.ImageLinks;
import com.example.api.IndustryIdentifier;
import com.example.api.VolumeInfo;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.documentscanner.GmsDocumentScanner;
import com.google.mlkit.vision.documentscanner.GmsDocumentScannerOptions;
import com.google.mlkit.vision.documentscanner.GmsDocumentScanning;
import com.google.mlkit.vision.documentscanner.GmsDocumentScanningResult;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: CameraScreen.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\u0093\u0003\u0010\u0003\u001a\u00020\u00042ï\u0002\u0010\u0005\u001aê\u0002\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0010\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0011\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0013\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0014\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0015\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0016\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0017\u0012\u0015\u0012\u0013\u0018\u00010\u0018¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0019\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u001a\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\u001f\u001a\f\u0010 \u001a\u00020\u0007*\u00020!H\u0002\u001a\f\u0010\"\u001a\u00020\u0007*\u00020!H\u0002\u001a\u0018\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020&H\u0002¨\u0006'²\u0006\n\u0010\n\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u0010\u000b\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u0010\f\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u0010\r\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u0010\u000e\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u0010(\u001a\u00020)X\u008a\u008e\u0002²\u0006\f\u0010*\u001a\u0004\u0018\u00010\u0007X\u008a\u008e\u0002²\u0006\f\u0010+\u001a\u0004\u0018\u00010\u0007X\u008a\u008e\u0002²\u0006\f\u0010,\u001a\u0004\u0018\u00010!X\u008a\u008e\u0002²\u0006\f\u0010-\u001a\u0004\u0018\u00010\u0007X\u008a\u008e\u0002²\u0006\f\u0010.\u001a\u0004\u0018\u00010\u0007X\u008a\u008e\u0002²\u0006\n\u0010/\u001a\u00020)X\u008a\u008e\u0002²\u0006\n\u00100\u001a\u00020)X\u008a\u008e\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u0010\u0010\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u0010\u0015\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\f\u00101\u001a\u0004\u0018\u00010\u0012X\u008a\u008e\u0002²\u0006\f\u00102\u001a\u0004\u0018\u00010\u0012X\u008a\u008e\u0002²\u0006\f\u0010\u0016\u001a\u0004\u0018\u00010\u0007X\u008a\u008e\u0002²\u0006\f\u0010\u0017\u001a\u0004\u0018\u00010\u0007X\u008a\u008e\u0002²\u0006\f\u0010\u0019\u001a\u0004\u0018\u00010\u0018X\u008a\u008e\u0002²\u0006\f\u0010\u001a\u001a\u0004\u0018\u00010\u0007X\u008a\u008e\u0002²\u0006\f\u0010\u001b\u001a\u0004\u0018\u00010\u0012X\u008a\u008e\u0002²\u0006\u0010\u00103\u001a\b\u0012\u0004\u0012\u00020504X\u008a\u008e\u0002²\u0006\n\u00106\u001a\u00020)X\u008a\u008e\u0002²\u0006\f\u00107\u001a\u0004\u0018\u00010&X\u008a\u008e\u0002"}, d2 = {"findActivity", "Landroid/app/Activity;", "Landroid/content/Context;", "CameraScreen", "", "onBookScanned", "Lkotlin/Function16;", "", "Lkotlin/ParameterName;", "name", "title", "author", "condition", "description", "genre", "pickupAddress", "mobileNumber", "base64Image", "", "lat", "lng", "remarks", "publisher", "publishedDate", "", "pageCount", "language", "averageRating", "modifier", "Landroidx/compose/ui/Modifier;", "initialMobileNumber", "(Lkotlin/jvm/functions/Function16;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "toBase64Str", "Landroid/graphics/Bitmap;", "toGeminiVisionBase64", "loadRotatedCorrectedBitmap", "context", "uri", "Landroid/net/Uri;", "app", "isScanning", "", "scanStatusMessage", "scanError", "scannedBitmap", "detectedIsbn", "officialCoverUrl", "isEnrichedByExternalApis", "hasAttemptedSubmit", "latitude", "longitude", "googleBooksSearchResults", "", "Lcom/example/api/VolumeInfo;", "isSearchingGoogleBooks", "tempCameraImageUri"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class CameraScreenKt {
    static final Unit CameraScreen$lambda$171(Function16 function16, Modifier modifier, String str, int i, int i2, Composer composer, int i3) {
        CameraScreen(function16, modifier, str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Activity findActivity(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        Intrinsics.checkNotNullExpressionValue(baseContext, "getBaseContext(...)");
        return findActivity(baseContext);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0304  */
    /* JADX WARN: Code duplicated, block: B:104:0x0324  */
    /* JADX WARN: Code duplicated, block: B:107:0x0344  */
    /* JADX WARN: Code duplicated, block: B:110:0x0364  */
    /* JADX WARN: Code duplicated, block: B:113:0x0384  */
    /* JADX WARN: Code duplicated, block: B:116:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:119:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:122:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:125:0x0408  */
    /* JADX WARN: Code duplicated, block: B:128:0x0438  */
    /* JADX WARN: Code duplicated, block: B:132:0x0451  */
    /* JADX WARN: Code duplicated, block: B:135:0x0486  */
    /* JADX WARN: Code duplicated, block: B:136:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:139:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:142:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:145:0x0513  */
    /* JADX WARN: Code duplicated, block: B:148:0x051e  */
    /* JADX WARN: Code duplicated, block: B:149:0x0525  */
    /* JADX WARN: Code duplicated, block: B:153:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:155:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:158:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:162:0x061d  */
    /* JADX WARN: Code duplicated, block: B:165:0x0674  */
    /* JADX WARN: Code duplicated, block: B:169:0x0681  */
    /* JADX WARN: Code duplicated, block: B:172:0x0706  */
    /* JADX WARN: Code duplicated, block: B:176:0x0712  */
    /* JADX WARN: Code duplicated, block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x004b  */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:40:0x007e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:47:0x008d  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:56:0x0119  */
    /* JADX WARN: Code duplicated, block: B:59:0x0139  */
    /* JADX WARN: Code duplicated, block: B:62:0x015b  */
    /* JADX WARN: Code duplicated, block: B:65:0x017b  */
    /* JADX WARN: Code duplicated, block: B:68:0x019c  */
    /* JADX WARN: Code duplicated, block: B:71:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:74:0x01de  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:80:0x021d  */
    /* JADX WARN: Code duplicated, block: B:83:0x023d  */
    /* JADX WARN: Code duplicated, block: B:86:0x025d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0281  */
    /* JADX WARN: Code duplicated, block: B:92:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:95:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:98:0x02e5  */
    public static final void CameraScreen(final Function16<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Double, ? super Double, ? super String, ? super String, ? super String, ? super Integer, ? super String, ? super Double, Unit> function16, Modifier modifier, String str, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        String str2;
        int i5;
        Modifier modifier3;
        String str3;
        final Context context;
        Object objRememberedValue;
        final CoroutineScope coroutineScope;
        Object objRememberedValue2;
        final MutableState mutableState;
        Object objRememberedValue3;
        final MutableState mutableState2;
        Object objRememberedValue4;
        final MutableState mutableState3;
        Object objRememberedValue5;
        final MutableState mutableState4;
        Object objRememberedValue6;
        final MutableState mutableState5;
        Object objRememberedValue7;
        MutableState mutableState6;
        Object objRememberedValue8;
        final MutableState mutableState7;
        Object objRememberedValue9;
        MutableState mutableState8;
        Object objRememberedValue10;
        MutableState mutableState9;
        Object objRememberedValue11;
        final MutableState mutableState10;
        Object objRememberedValue12;
        final MutableState mutableState11;
        Object objRememberedValue13;
        MutableState mutableState12;
        Object objRememberedValue14;
        Object objRememberedValue15;
        final MutableState mutableState13;
        Object objRememberedValue16;
        Object objRememberedValue17;
        Object objRememberedValue18;
        MutableState mutableState14;
        Object objRememberedValue19;
        final MutableState mutableState15;
        Object objRememberedValue20;
        final MutableState mutableState16;
        Object objRememberedValue21;
        final MutableState mutableState17;
        Object objRememberedValue22;
        final MutableState mutableState18;
        Object objRememberedValue23;
        final MutableState mutableState19;
        Object objRememberedValue24;
        MutableState mutableState20;
        Object objRememberedValue25;
        final MutableState mutableState21;
        Object objRememberedValue26;
        boolean zChangedInstance;
        Object obj;
        String str4;
        final MutableState mutableState22;
        final MutableState mutableState23;
        final MutableState mutableState24;
        final MutableState mutableState25;
        final MutableState mutableState26;
        final MutableState mutableState27;
        Object objRememberedValue27;
        GmsDocumentScannerOptions gmsDocumentScannerOptions;
        Object objRememberedValue28;
        final GmsDocumentScanner gmsDocumentScanner;
        Object objRememberedValue29;
        MutableState mutableState28;
        boolean zChangedInstance2;
        Object objRememberedValue30;
        int i6;
        final MutableState mutableState29;
        Object obj2;
        ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult;
        boolean zChangedInstance3;
        MutableState mutableState30;
        Object objRememberedValue31;
        final ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult2;
        boolean zChangedInstance4;
        Object obj3;
        final ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult3;
        boolean zChangedInstance5;
        Object objRememberedValue32;
        final ManagedActivityResultLauncher managedActivityResultLauncher;
        final MutableState mutableState31;
        Composer composer2;
        final Modifier modifier4;
        final String str5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(function16, "onBookScanned");
        Composer composerStartRestartGroup = composer.startRestartGroup(-287508125);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(CameraScreen)P(2,1)87@3885L7,88@3918L24,90@3965L31,91@4015L31,92@4068L35,94@4132L31,95@4181L31,96@4235L34,97@4299L42,98@4363L42,99@4431L42,100@4498L42,101@4569L42,102@4648L34,103@4713L34,106@4808L31,107@4864L48,108@4932L31,109@4984L42,110@5048L42,111@5112L42,112@5180L42,113@5244L39,114@5304L42,115@5372L42,116@5451L74,117@5560L34,597@36897L322,595@36811L408,608@37246L250,616@37515L58,618@37605L39,622@37761L395,620@37674L482,637@38280L101,635@38186L195,664@39133L569,662@39031L671,681@39835L772,679@39733L874,720@41272L29195,709@40859L29608:CameraScreen.kt#2thlc2");
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function16) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    str2 = str;
                    if (composerStartRestartGroup.changed(str2)) {
                        i5 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
                    } else {
                        i5 = UserVerificationMethods.USER_VERIFY_PATTERN;
                    }
                    i3 |= i5;
                }
                if ((i3 & BuildConfig.VERSION_CODE) != 146 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier4 = modifier2;
                    str5 = str2;
                } else {
                    if (i7 != 0) {
                        modifier3 = (Modifier) Modifier.Companion;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        str3 = "";
                    } else {
                        str3 = str2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-287508125, i3, -1, "com.example.ui.screens.CameraScreen (CameraScreen.kt:86)");
                    }
                    CompositionLocal localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume = composerStartRestartGroup.consume(localContext);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    context = (Context) objConsume;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller;
                    }
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417382302, "CC(remember):CameraScreen.kt#9igjgp");
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    mutableState = (MutableState) objRememberedValue2;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417380702, "CC(remember):CameraScreen.kt#9igjgp");
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                        objRememberedValue3 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    mutableState2 = (MutableState) objRememberedValue3;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417379002, "CC(remember):CameraScreen.kt#9igjgp");
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                        objRememberedValue4 = SnapshotStateKt.mutableStateOf$default("Good", (SnapshotMutationPolicy) null, 2, (Object) null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    mutableState3 = (MutableState) objRememberedValue4;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417376958, "CC(remember):CameraScreen.kt#9igjgp");
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                        objRememberedValue5 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    mutableState4 = (MutableState) objRememberedValue5;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417375390, "CC(remember):CameraScreen.kt#9igjgp");
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == Composer.Companion.getEmpty()) {
                        objRememberedValue6 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    mutableState5 = (MutableState) objRememberedValue6;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417373659, "CC(remember):CameraScreen.kt#9igjgp");
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == Composer.Companion.getEmpty()) {
                        objRememberedValue7 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    mutableState6 = (MutableState) objRememberedValue7;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417371603, "CC(remember):CameraScreen.kt#9igjgp");
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue8 == Composer.Companion.getEmpty()) {
                        objRememberedValue8 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    mutableState7 = (MutableState) objRememberedValue8;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417369555, "CC(remember):CameraScreen.kt#9igjgp");
                    objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue9 == Composer.Companion.getEmpty()) {
                        objRememberedValue9 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    mutableState8 = (MutableState) objRememberedValue9;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417367379, "CC(remember):CameraScreen.kt#9igjgp");
                    objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue10 == Composer.Companion.getEmpty()) {
                        objRememberedValue10 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    }
                    mutableState9 = (MutableState) objRememberedValue10;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417365235, "CC(remember):CameraScreen.kt#9igjgp");
                    objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue11 == Composer.Companion.getEmpty()) {
                        objRememberedValue11 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    }
                    mutableState10 = (MutableState) objRememberedValue11;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417362963, "CC(remember):CameraScreen.kt#9igjgp");
                    objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue12 == Composer.Companion.getEmpty()) {
                        objRememberedValue12 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                    }
                    mutableState11 = (MutableState) objRememberedValue12;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417360443, "CC(remember):CameraScreen.kt#9igjgp");
                    objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue13 == Composer.Companion.getEmpty()) {
                        objRememberedValue13 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                    }
                    mutableState12 = (MutableState) objRememberedValue13;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417358363, "CC(remember):CameraScreen.kt#9igjgp");
                    objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue14 == Composer.Companion.getEmpty()) {
                        objRememberedValue14 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                    }
                    final MutableState mutableState32 = (MutableState) objRememberedValue14;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417355326, "CC(remember):CameraScreen.kt#9igjgp");
                    objRememberedValue15 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue15 == Composer.Companion.getEmpty()) {
                        objRememberedValue15 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
                    }
                    mutableState13 = (MutableState) objRememberedValue15;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417353517, "CC(remember):CameraScreen.kt#9igjgp");
                    objRememberedValue16 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue16 == Composer.Companion.getEmpty()) {
                        objRememberedValue16 = SnapshotStateKt.mutableStateOf$default(str3, (SnapshotMutationPolicy) null, 2, (Object) null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue16);
                    }
                    final MutableState mutableState33 = (MutableState) objRememberedValue16;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417351358, "CC(remember):CameraScreen.kt#9igjgp");
                    objRememberedValue17 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue17 == Composer.Companion.getEmpty()) {
                        objRememberedValue17 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue17);
                    }
                    final MutableState mutableState34 = (MutableState) objRememberedValue17;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417349683, "CC(remember):CameraScreen.kt#9igjgp");
                    objRememberedValue18 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue18 == Composer.Companion.getEmpty()) {
                        objRememberedValue18 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue18);
                    }
                    mutableState14 = (MutableState) objRememberedValue18;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417347635, "CC(remember):CameraScreen.kt#9igjgp");
                    objRememberedValue19 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue19 == Composer.Companion.getEmpty()) {
                        objRememberedValue19 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue19);
                    }
                    mutableState15 = (MutableState) objRememberedValue19;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417345587, "CC(remember):CameraScreen.kt#9igjgp");
                    objRememberedValue20 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue20 == Composer.Companion.getEmpty()) {
                        objRememberedValue20 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue20);
                    }
                    mutableState16 = (MutableState) objRememberedValue20;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417343411, "CC(remember):CameraScreen.kt#9igjgp");
                    objRememberedValue21 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue21 == Composer.Companion.getEmpty()) {
                        objRememberedValue21 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue21);
                    }
                    mutableState17 = (MutableState) objRememberedValue21;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417341366, "CC(remember):CameraScreen.kt#9igjgp");
                    objRememberedValue22 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue22 == Composer.Companion.getEmpty()) {
                        objRememberedValue22 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue22);
                    }
                    mutableState18 = (MutableState) objRememberedValue22;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417339443, "CC(remember):CameraScreen.kt#9igjgp");
                    objRememberedValue23 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue23 == Composer.Companion.getEmpty()) {
                        objRememberedValue23 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue23);
                    }
                    mutableState19 = (MutableState) objRememberedValue23;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417337267, "CC(remember):CameraScreen.kt#9igjgp");
                    objRememberedValue24 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue24 == Composer.Companion.getEmpty()) {
                        objRememberedValue24 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue24);
                    }
                    mutableState20 = (MutableState) objRememberedValue24;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417334707, "CC(remember):CameraScreen.kt#9igjgp");
                    objRememberedValue25 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue25 == Composer.Companion.getEmpty()) {
                        MutableState mutableStateMutableStateOf$default = SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), (SnapshotMutationPolicy) null, 2, (Object) null);
                        composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default);
                        objRememberedValue25 = mutableStateMutableStateOf$default;
                    }
                    mutableState21 = (MutableState) objRememberedValue25;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417331259, "CC(remember):CameraScreen.kt#9igjgp");
                    objRememberedValue26 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue26 == Composer.Companion.getEmpty()) {
                        objRememberedValue26 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue26);
                    }
                    final MutableState mutableState35 = (MutableState) objRememberedValue26;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ActivityResultContract getContent = new ActivityResultContracts.GetContent();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416328187, "CC(remember):CameraScreen.kt#9igjgp");
                    zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
                    Object objRememberedValue33 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue33 == Composer.Companion.getEmpty()) {
                        str4 = "CC(remember):CameraScreen.kt#9igjgp";
                        mutableState22 = mutableState8;
                        mutableState23 = mutableState12;
                        mutableState24 = mutableState14;
                        mutableState25 = mutableState20;
                        mutableState26 = mutableState6;
                        mutableState27 = mutableState9;
                        obj = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda21
                            public final Object invoke(Object obj4) {
                                return CameraScreenKt.CameraScreen$lambda$76$lambda$75(context, coroutineScope, mutableState27, mutableState26, mutableState22, mutableState7, mutableState23, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (Uri) obj4);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(obj);
                    } else {
                        obj = objRememberedValue33;
                        mutableState22 = mutableState8;
                        mutableState23 = mutableState12;
                        mutableState24 = mutableState14;
                        mutableState25 = mutableState20;
                        str4 = "CC(remember):CameraScreen.kt#9igjgp";
                        mutableState26 = mutableState6;
                        mutableState27 = mutableState9;
                    }
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    final ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult4 = ActivityResultRegistryKt.rememberLauncherForActivityResult(getContent, (Function1) obj, composerStartRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416317091, str4);
                    objRememberedValue27 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue27 == Composer.Companion.getEmpty()) {
                        objRememberedValue27 = new GmsDocumentScannerOptions.Builder().setGalleryImportAllowed(true).setPageLimit(1).setResultFormats(101, new int[0]).setScannerMode(1).build();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue27);
                    }
                    gmsDocumentScannerOptions = (GmsDocumentScannerOptions) objRememberedValue27;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    Intrinsics.checkNotNull(gmsDocumentScannerOptions);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416308675, str4);
                    objRememberedValue28 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue28 == Composer.Companion.getEmpty()) {
                        objRememberedValue28 = GmsDocumentScanning.getClient(gmsDocumentScannerOptions);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue28);
                    }
                    gmsDocumentScanner = (GmsDocumentScanner) objRememberedValue28;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    Intrinsics.checkNotNull(gmsDocumentScanner);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416305814, str4);
                    objRememberedValue29 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue29 == Composer.Companion.getEmpty()) {
                        objRememberedValue29 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue29);
                    }
                    mutableState28 = (MutableState) objRememberedValue29;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ActivityResultContract takePicture = new ActivityResultContracts.TakePicture();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416300466, str4);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
                    objRememberedValue30 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2) {
                        i6 = i3;
                    } else {
                        i6 = i3;
                        if (objRememberedValue30 != Composer.Companion.getEmpty()) {
                            obj2 = objRememberedValue30;
                            mutableState29 = mutableState28;
                        }
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(takePicture, (Function1) obj2, composerStartRestartGroup, 0);
                        ActivityResultContract takePicturePreview = new ActivityResultContracts.TakePicturePreview();
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416284152, str4);
                        zChangedInstance3 = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(context);
                        mutableState30 = mutableState29;
                        objRememberedValue31 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance3 || objRememberedValue31 == Composer.Companion.getEmpty()) {
                            final MutableState mutableState36 = mutableState23;
                            final Context context2 = context;
                            final CoroutineScope coroutineScope2 = coroutineScope;
                            final MutableState mutableState37 = mutableState27;
                            final MutableState mutableState38 = mutableState26;
                            final MutableState mutableState39 = mutableState22;
                            final MutableState mutableState40 = mutableState7;
                            Function1 function1 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda24
                                public final Object invoke(Object obj4) {
                                    return CameraScreenKt.CameraScreen$lambda$86$lambda$85(coroutineScope2, mutableState37, mutableState38, mutableState39, mutableState40, mutableState36, context2, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (Bitmap) obj4);
                                }
                            };
                            coroutineScope = coroutineScope2;
                            context = context2;
                            mutableState23 = mutableState36;
                            mutableState7 = mutableState40;
                            mutableState22 = mutableState39;
                            mutableState26 = mutableState38;
                            mutableState27 = mutableState37;
                            composerStartRestartGroup.updateRememberedValue(function1);
                            objRememberedValue31 = function1;
                        }
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        managedActivityResultLauncherRememberLauncherForActivityResult2 = ActivityResultRegistryKt.rememberLauncherForActivityResult(takePicturePreview, (Function1) objRememberedValue31, composerStartRestartGroup, 0);
                        ActivityResultContract startIntentSenderForResult = new ActivityResultContracts.StartIntentSenderForResult();
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416256388, str4);
                        zChangedInstance4 = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
                        Object objRememberedValue34 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance4 || objRememberedValue34 == Composer.Companion.getEmpty()) {
                            obj3 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda25
                                public final Object invoke(Object obj4) {
                                    return CameraScreenKt.CameraScreen$lambda$89$lambda$88(context, coroutineScope, mutableState27, mutableState26, mutableState22, mutableState7, mutableState23, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (ActivityResult) obj4);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(obj3);
                        } else {
                            obj3 = objRememberedValue34;
                        }
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        managedActivityResultLauncherRememberLauncherForActivityResult3 = ActivityResultRegistryKt.rememberLauncherForActivityResult(startIntentSenderForResult, (Function1) obj3, composerStartRestartGroup, 0);
                        ActivityResultContract requestMultiplePermissions = new ActivityResultContracts.RequestMultiplePermissions();
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416233721, str4);
                        zChangedInstance5 = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(gmsDocumentScanner) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult3) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult2);
                        objRememberedValue32 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance5 || objRememberedValue32 == Composer.Companion.getEmpty()) {
                            managedActivityResultLauncher = managedActivityResultLauncherRememberLauncherForActivityResult;
                            final MutableState mutableState41 = mutableState22;
                            mutableState31 = mutableState30;
                            objRememberedValue32 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda26
                                public final Object invoke(Object obj4) {
                                    return CameraScreenKt.CameraScreen$lambda$94$lambda$93(context, gmsDocumentScanner, managedActivityResultLauncherRememberLauncherForActivityResult3, managedActivityResultLauncher, managedActivityResultLauncherRememberLauncherForActivityResult2, mutableState31, mutableState41, (Map) obj4);
                                }
                            };
                            mutableState22 = mutableState41;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue32);
                        } else {
                            managedActivityResultLauncher = managedActivityResultLauncherRememberLauncherForActivityResult;
                            mutableState31 = mutableState30;
                        }
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        final ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult5 = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestMultiplePermissions, (Function1) objRememberedValue32, composerStartRestartGroup, 0);
                        Function2<Composer, Integer, Unit> function2M231getLambda$2075333601$app = ComposableSingletons$CameraScreenKt.INSTANCE.m231getLambda$2075333601$app();
                        final Context context3 = context;
                        final ManagedActivityResultLauncher managedActivityResultLauncher2 = managedActivityResultLauncher;
                        final MutableState mutableState42 = mutableState22;
                        final MutableState mutableState43 = mutableState31;
                        final MutableState mutableState44 = mutableState23;
                        final MutableState mutableState45 = mutableState10;
                        final MutableState mutableState46 = mutableState;
                        final MutableState mutableState47 = mutableState18;
                        final MutableState mutableState48 = mutableState19;
                        final MutableState mutableState49 = mutableState25;
                        final MutableState mutableState50 = mutableState21;
                        final MutableState mutableState51 = mutableState26;
                        final MutableState mutableState52 = mutableState4;
                        final MutableState mutableState53 = mutableState16;
                        final MutableState mutableState54 = mutableState11;
                        String str6 = str3;
                        final MutableState mutableState55 = mutableState15;
                        final MutableState mutableState56 = mutableState5;
                        final MutableState mutableState57 = mutableState17;
                        final MutableState mutableState58 = mutableState3;
                        Function3 function3 = new Function3() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda27
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                return CameraScreenKt.CameraScreen$lambda$170(managedActivityResultLauncherRememberLauncherForActivityResult5, context3, managedActivityResultLauncher2, managedActivityResultLauncherRememberLauncherForActivityResult2, managedActivityResultLauncherRememberLauncherForActivityResult4, function16, mutableState27, mutableState43, mutableState51, mutableState42, mutableState44, mutableState49, mutableState47, mutableState48, mutableState45, mutableState46, mutableState32, coroutineScope, mutableState35, mutableState50, mutableState2, mutableState53, mutableState57, mutableState56, mutableState54, mutableState58, mutableState52, mutableState24, mutableState55, mutableState13, mutableState33, mutableState34, (PaddingValues) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                            }
                        };
                        composer2 = composerStartRestartGroup;
                        Modifier modifier5 = modifier3;
                        ScaffoldKt.Scaffold-TvnljyQ(modifier5, function2M231getLambda$2075333601$app, (Function2) null, (Function2) null, (Function2) null, 0, 0L, 0L, (WindowInsets) null, ComposableLambdaKt.rememberComposableLambda(349314036, true, function3, composer2, 54), composer2, ((i6 >> 3) & 14) | 805306416, 508);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier5;
                        str5 = str6;
                    }
                    mutableState29 = mutableState28;
                    final MutableState mutableState59 = mutableState25;
                    final MutableState mutableState60 = mutableState24;
                    final MutableState mutableState61 = mutableState23;
                    final MutableState mutableState62 = mutableState22;
                    final MutableState mutableState63 = mutableState26;
                    final MutableState mutableState64 = mutableState27;
                    obj2 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda23
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$84$lambda$83(mutableState29, context, coroutineScope, mutableState64, mutableState63, mutableState62, mutableState7, mutableState61, mutableState60, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState59, mutableState11, mutableState21, mutableState3, ((Boolean) obj4).booleanValue());
                        }
                    };
                    context = context;
                    coroutineScope = coroutineScope;
                    mutableState27 = mutableState64;
                    mutableState26 = mutableState63;
                    mutableState22 = mutableState62;
                    mutableState7 = mutableState7;
                    mutableState23 = mutableState61;
                    mutableState24 = mutableState60;
                    mutableState15 = mutableState15;
                    mutableState13 = mutableState13;
                    mutableState10 = mutableState10;
                    mutableState = mutableState;
                    mutableState2 = mutableState2;
                    mutableState4 = mutableState4;
                    mutableState5 = mutableState5;
                    mutableState16 = mutableState16;
                    mutableState17 = mutableState17;
                    mutableState18 = mutableState18;
                    mutableState19 = mutableState19;
                    mutableState25 = mutableState59;
                    mutableState11 = mutableState11;
                    mutableState21 = mutableState21;
                    mutableState3 = mutableState3;
                    composerStartRestartGroup.updateRememberedValue(obj2);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(takePicture, (Function1) obj2, composerStartRestartGroup, 0);
                    ActivityResultContract takePicturePreview2 = new ActivityResultContracts.TakePicturePreview();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416284152, str4);
                    zChangedInstance3 = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(context);
                    mutableState30 = mutableState29;
                    objRememberedValue31 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance3) {
                        final MutableState mutableState310 = mutableState23;
                        final Context context4 = context;
                        final CoroutineScope coroutineScope3 = coroutineScope;
                        final MutableState mutableState311 = mutableState27;
                        final MutableState mutableState312 = mutableState26;
                        final MutableState mutableState313 = mutableState22;
                        final MutableState mutableState410 = mutableState7;
                        Function1 function2 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda24
                            public final Object invoke(Object obj4) {
                                return CameraScreenKt.CameraScreen$lambda$86$lambda$85(coroutineScope3, mutableState311, mutableState312, mutableState313, mutableState410, mutableState310, context4, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (Bitmap) obj4);
                            }
                        };
                        coroutineScope = coroutineScope3;
                        context = context4;
                        mutableState23 = mutableState310;
                        mutableState7 = mutableState410;
                        mutableState22 = mutableState313;
                        mutableState26 = mutableState312;
                        mutableState27 = mutableState311;
                        composerStartRestartGroup.updateRememberedValue(function2);
                        objRememberedValue31 = function2;
                    } else {
                        final MutableState mutableState314 = mutableState23;
                        final Context context5 = context;
                        final CoroutineScope coroutineScope4 = coroutineScope;
                        final MutableState mutableState315 = mutableState27;
                        final MutableState mutableState316 = mutableState26;
                        final MutableState mutableState317 = mutableState22;
                        final MutableState mutableState411 = mutableState7;
                        Function1 function4 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda24
                            public final Object invoke(Object obj4) {
                                return CameraScreenKt.CameraScreen$lambda$86$lambda$85(coroutineScope4, mutableState315, mutableState316, mutableState317, mutableState411, mutableState314, context5, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (Bitmap) obj4);
                            }
                        };
                        coroutineScope = coroutineScope4;
                        context = context5;
                        mutableState23 = mutableState314;
                        mutableState7 = mutableState411;
                        mutableState22 = mutableState317;
                        mutableState26 = mutableState316;
                        mutableState27 = mutableState315;
                        composerStartRestartGroup.updateRememberedValue(function4);
                        objRememberedValue31 = function4;
                    }
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    managedActivityResultLauncherRememberLauncherForActivityResult2 = ActivityResultRegistryKt.rememberLauncherForActivityResult(takePicturePreview2, (Function1) objRememberedValue31, composerStartRestartGroup, 0);
                    ActivityResultContract startIntentSenderForResult2 = new ActivityResultContracts.StartIntentSenderForResult();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416256388, str4);
                    zChangedInstance4 = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
                    Object objRememberedValue35 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance4) {
                        obj3 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda25
                            public final Object invoke(Object obj4) {
                                return CameraScreenKt.CameraScreen$lambda$89$lambda$88(context, coroutineScope, mutableState27, mutableState26, mutableState22, mutableState7, mutableState23, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (ActivityResult) obj4);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(obj3);
                    } else {
                        obj3 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda25
                            public final Object invoke(Object obj4) {
                                return CameraScreenKt.CameraScreen$lambda$89$lambda$88(context, coroutineScope, mutableState27, mutableState26, mutableState22, mutableState7, mutableState23, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (ActivityResult) obj4);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(obj3);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    managedActivityResultLauncherRememberLauncherForActivityResult3 = ActivityResultRegistryKt.rememberLauncherForActivityResult(startIntentSenderForResult2, (Function1) obj3, composerStartRestartGroup, 0);
                    ActivityResultContract requestMultiplePermissions2 = new ActivityResultContracts.RequestMultiplePermissions();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416233721, str4);
                    zChangedInstance5 = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(gmsDocumentScanner) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult3) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult2);
                    objRememberedValue32 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance5) {
                        managedActivityResultLauncher = managedActivityResultLauncherRememberLauncherForActivityResult;
                        final MutableState mutableState412 = mutableState22;
                        mutableState31 = mutableState30;
                        objRememberedValue32 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda26
                            public final Object invoke(Object obj4) {
                                return CameraScreenKt.CameraScreen$lambda$94$lambda$93(context, gmsDocumentScanner, managedActivityResultLauncherRememberLauncherForActivityResult3, managedActivityResultLauncher, managedActivityResultLauncherRememberLauncherForActivityResult2, mutableState31, mutableState412, (Map) obj4);
                            }
                        };
                        mutableState22 = mutableState412;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue32);
                    } else {
                        managedActivityResultLauncher = managedActivityResultLauncherRememberLauncherForActivityResult;
                        final MutableState mutableState413 = mutableState22;
                        mutableState31 = mutableState30;
                        objRememberedValue32 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda26
                            public final Object invoke(Object obj4) {
                                return CameraScreenKt.CameraScreen$lambda$94$lambda$93(context, gmsDocumentScanner, managedActivityResultLauncherRememberLauncherForActivityResult3, managedActivityResultLauncher, managedActivityResultLauncherRememberLauncherForActivityResult2, mutableState31, mutableState413, (Map) obj4);
                            }
                        };
                        mutableState22 = mutableState413;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue32);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    final ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult6 = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestMultiplePermissions2, (Function1) objRememberedValue32, composerStartRestartGroup, 0);
                    Function2<Composer, Integer, Unit> function2M231getLambda$2075333601$app2 = ComposableSingletons$CameraScreenKt.INSTANCE.m231getLambda$2075333601$app();
                    final Context context6 = context;
                    final ManagedActivityResultLauncher managedActivityResultLauncher3 = managedActivityResultLauncher;
                    final MutableState mutableState414 = mutableState22;
                    final MutableState mutableState415 = mutableState31;
                    final MutableState mutableState416 = mutableState23;
                    final MutableState mutableState417 = mutableState10;
                    final MutableState mutableState418 = mutableState;
                    final MutableState mutableState419 = mutableState18;
                    final MutableState mutableState420 = mutableState19;
                    final MutableState mutableState421 = mutableState25;
                    final MutableState mutableState510 = mutableState21;
                    final MutableState mutableState511 = mutableState26;
                    final MutableState mutableState512 = mutableState4;
                    final MutableState mutableState513 = mutableState16;
                    final MutableState mutableState514 = mutableState11;
                    String str7 = str3;
                    final MutableState mutableState515 = mutableState15;
                    final MutableState mutableState516 = mutableState5;
                    final MutableState mutableState517 = mutableState17;
                    final MutableState mutableState518 = mutableState3;
                    Function3 function5 = new Function3() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda27
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            return CameraScreenKt.CameraScreen$lambda$170(managedActivityResultLauncherRememberLauncherForActivityResult6, context6, managedActivityResultLauncher3, managedActivityResultLauncherRememberLauncherForActivityResult2, managedActivityResultLauncherRememberLauncherForActivityResult4, function16, mutableState27, mutableState415, mutableState511, mutableState414, mutableState416, mutableState421, mutableState419, mutableState420, mutableState417, mutableState418, mutableState32, coroutineScope, mutableState35, mutableState510, mutableState2, mutableState513, mutableState517, mutableState516, mutableState514, mutableState518, mutableState512, mutableState24, mutableState515, mutableState13, mutableState33, mutableState34, (PaddingValues) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                        }
                    };
                    composer2 = composerStartRestartGroup;
                    Modifier modifier6 = modifier3;
                    ScaffoldKt.Scaffold-TvnljyQ(modifier6, function2M231getLambda$2075333601$app2, (Function2) null, (Function2) null, (Function2) null, 0, 0L, 0L, (WindowInsets) null, ComposableLambdaKt.rememberComposableLambda(349314036, true, function5, composer2, 54), composer2, ((i6 >> 3) & 14) | 805306416, 508);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier6;
                    str5 = str7;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda28
                        public final Object invoke(Object obj4, Object obj5) {
                            return CameraScreenKt.CameraScreen$lambda$171(function16, modifier4, str5, i, i2, (Composer) obj4, ((Integer) obj5).intValue());
                        }
                    });
                }
            }
            i3 |= 384;
            str2 = str;
            if ((i3 & BuildConfig.VERSION_CODE) != 146) {
                if (i7 != 0) {
                    modifier3 = (Modifier) Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-287508125, i3, -1, "com.example.ui.screens.CameraScreen (CameraScreen.kt:86)");
                }
                CompositionLocal localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume2 = composerStartRestartGroup.consume(localContext2);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                context = (Context) objConsume2;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller2 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller2);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller2;
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417382302, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                mutableState = (MutableState) objRememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417380702, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                mutableState2 = (MutableState) objRememberedValue3;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417379002, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                    objRememberedValue4 = SnapshotStateKt.mutableStateOf$default("Good", (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                mutableState3 = (MutableState) objRememberedValue4;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417376958, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                    objRememberedValue5 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                mutableState4 = (MutableState) objRememberedValue5;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417375390, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == Composer.Companion.getEmpty()) {
                    objRememberedValue6 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                mutableState5 = (MutableState) objRememberedValue6;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417373659, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == Composer.Companion.getEmpty()) {
                    objRememberedValue7 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                mutableState6 = (MutableState) objRememberedValue7;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417371603, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == Composer.Companion.getEmpty()) {
                    objRememberedValue8 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                mutableState7 = (MutableState) objRememberedValue8;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417369555, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue9 == Composer.Companion.getEmpty()) {
                    objRememberedValue9 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                mutableState8 = (MutableState) objRememberedValue9;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417367379, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue10 == Composer.Companion.getEmpty()) {
                    objRememberedValue10 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                }
                mutableState9 = (MutableState) objRememberedValue10;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417365235, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue11 == Composer.Companion.getEmpty()) {
                    objRememberedValue11 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                }
                mutableState10 = (MutableState) objRememberedValue11;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417362963, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue12 == Composer.Companion.getEmpty()) {
                    objRememberedValue12 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                }
                mutableState11 = (MutableState) objRememberedValue12;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417360443, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue13 == Composer.Companion.getEmpty()) {
                    objRememberedValue13 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                }
                mutableState12 = (MutableState) objRememberedValue13;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417358363, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue14 == Composer.Companion.getEmpty()) {
                    objRememberedValue14 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                }
                final MutableState mutableState318 = (MutableState) objRememberedValue14;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417355326, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue15 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue15 == Composer.Companion.getEmpty()) {
                    objRememberedValue15 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
                }
                mutableState13 = (MutableState) objRememberedValue15;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417353517, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue16 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue16 == Composer.Companion.getEmpty()) {
                    objRememberedValue16 = SnapshotStateKt.mutableStateOf$default(str3, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue16);
                }
                final MutableState mutableState319 = (MutableState) objRememberedValue16;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417351358, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue17 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue17 == Composer.Companion.getEmpty()) {
                    objRememberedValue17 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue17);
                }
                final MutableState mutableState320 = (MutableState) objRememberedValue17;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417349683, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue18 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue18 == Composer.Companion.getEmpty()) {
                    objRememberedValue18 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue18);
                }
                mutableState14 = (MutableState) objRememberedValue18;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417347635, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue19 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue19 == Composer.Companion.getEmpty()) {
                    objRememberedValue19 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue19);
                }
                mutableState15 = (MutableState) objRememberedValue19;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417345587, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue20 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue20 == Composer.Companion.getEmpty()) {
                    objRememberedValue20 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue20);
                }
                mutableState16 = (MutableState) objRememberedValue20;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417343411, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue21 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue21 == Composer.Companion.getEmpty()) {
                    objRememberedValue21 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue21);
                }
                mutableState17 = (MutableState) objRememberedValue21;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417341366, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue22 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue22 == Composer.Companion.getEmpty()) {
                    objRememberedValue22 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue22);
                }
                mutableState18 = (MutableState) objRememberedValue22;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417339443, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue23 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue23 == Composer.Companion.getEmpty()) {
                    objRememberedValue23 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue23);
                }
                mutableState19 = (MutableState) objRememberedValue23;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417337267, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue24 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue24 == Composer.Companion.getEmpty()) {
                    objRememberedValue24 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue24);
                }
                mutableState20 = (MutableState) objRememberedValue24;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417334707, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue25 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue25 == Composer.Companion.getEmpty()) {
                    MutableState mutableStateMutableStateOf$default2 = SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default2);
                    objRememberedValue25 = mutableStateMutableStateOf$default2;
                }
                mutableState21 = (MutableState) objRememberedValue25;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417331259, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue26 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue26 == Composer.Companion.getEmpty()) {
                    objRememberedValue26 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue26);
                }
                final MutableState mutableState321 = (MutableState) objRememberedValue26;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ActivityResultContract getContent2 = new ActivityResultContracts.GetContent();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416328187, "CC(remember):CameraScreen.kt#9igjgp");
                zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
                Object objRememberedValue36 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    str4 = "CC(remember):CameraScreen.kt#9igjgp";
                    mutableState22 = mutableState8;
                    mutableState23 = mutableState12;
                    mutableState24 = mutableState14;
                    mutableState25 = mutableState20;
                    mutableState26 = mutableState6;
                    mutableState27 = mutableState9;
                    obj = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda21
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$76$lambda$75(context, coroutineScope, mutableState27, mutableState26, mutableState22, mutableState7, mutableState23, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (Uri) obj4);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(obj);
                } else {
                    str4 = "CC(remember):CameraScreen.kt#9igjgp";
                    mutableState22 = mutableState8;
                    mutableState23 = mutableState12;
                    mutableState24 = mutableState14;
                    mutableState25 = mutableState20;
                    mutableState26 = mutableState6;
                    mutableState27 = mutableState9;
                    obj = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda21
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$76$lambda$75(context, coroutineScope, mutableState27, mutableState26, mutableState22, mutableState7, mutableState23, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (Uri) obj4);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(obj);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                final ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult7 = ActivityResultRegistryKt.rememberLauncherForActivityResult(getContent2, (Function1) obj, composerStartRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416317091, str4);
                objRememberedValue27 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue27 == Composer.Companion.getEmpty()) {
                    objRememberedValue27 = new GmsDocumentScannerOptions.Builder().setGalleryImportAllowed(true).setPageLimit(1).setResultFormats(101, new int[0]).setScannerMode(1).build();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue27);
                }
                gmsDocumentScannerOptions = (GmsDocumentScannerOptions) objRememberedValue27;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                Intrinsics.checkNotNull(gmsDocumentScannerOptions);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416308675, str4);
                objRememberedValue28 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue28 == Composer.Companion.getEmpty()) {
                    objRememberedValue28 = GmsDocumentScanning.getClient(gmsDocumentScannerOptions);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue28);
                }
                gmsDocumentScanner = (GmsDocumentScanner) objRememberedValue28;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                Intrinsics.checkNotNull(gmsDocumentScanner);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416305814, str4);
                objRememberedValue29 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue29 == Composer.Companion.getEmpty()) {
                    objRememberedValue29 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue29);
                }
                mutableState28 = (MutableState) objRememberedValue29;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ActivityResultContract takePicture2 = new ActivityResultContracts.TakePicture();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416300466, str4);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
                objRememberedValue30 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2) {
                    i6 = i3;
                    if (objRememberedValue30 != Composer.Companion.getEmpty()) {
                        obj2 = objRememberedValue30;
                        mutableState29 = mutableState28;
                    }
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(takePicture2, (Function1) obj2, composerStartRestartGroup, 0);
                    ActivityResultContract takePicturePreview3 = new ActivityResultContracts.TakePicturePreview();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416284152, str4);
                    zChangedInstance3 = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(context);
                    mutableState30 = mutableState29;
                    objRememberedValue31 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance3) {
                        final MutableState mutableState3110 = mutableState23;
                        final Context context7 = context;
                        final CoroutineScope coroutineScope5 = coroutineScope;
                        final MutableState mutableState3111 = mutableState27;
                        final MutableState mutableState3112 = mutableState26;
                        final MutableState mutableState3113 = mutableState22;
                        final MutableState mutableState4110 = mutableState7;
                        Function1 function6 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda24
                            public final Object invoke(Object obj4) {
                                return CameraScreenKt.CameraScreen$lambda$86$lambda$85(coroutineScope5, mutableState3111, mutableState3112, mutableState3113, mutableState4110, mutableState3110, context7, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (Bitmap) obj4);
                            }
                        };
                        coroutineScope = coroutineScope5;
                        context = context7;
                        mutableState23 = mutableState3110;
                        mutableState7 = mutableState4110;
                        mutableState22 = mutableState3113;
                        mutableState26 = mutableState3112;
                        mutableState27 = mutableState3111;
                        composerStartRestartGroup.updateRememberedValue(function6);
                        objRememberedValue31 = function6;
                    } else {
                        final MutableState mutableState3114 = mutableState23;
                        final Context context8 = context;
                        final CoroutineScope coroutineScope6 = coroutineScope;
                        final MutableState mutableState3115 = mutableState27;
                        final MutableState mutableState3116 = mutableState26;
                        final MutableState mutableState3117 = mutableState22;
                        final MutableState mutableState4111 = mutableState7;
                        Function1 function7 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda24
                            public final Object invoke(Object obj4) {
                                return CameraScreenKt.CameraScreen$lambda$86$lambda$85(coroutineScope6, mutableState3115, mutableState3116, mutableState3117, mutableState4111, mutableState3114, context8, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (Bitmap) obj4);
                            }
                        };
                        coroutineScope = coroutineScope6;
                        context = context8;
                        mutableState23 = mutableState3114;
                        mutableState7 = mutableState4111;
                        mutableState22 = mutableState3117;
                        mutableState26 = mutableState3116;
                        mutableState27 = mutableState3115;
                        composerStartRestartGroup.updateRememberedValue(function7);
                        objRememberedValue31 = function7;
                    }
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    managedActivityResultLauncherRememberLauncherForActivityResult2 = ActivityResultRegistryKt.rememberLauncherForActivityResult(takePicturePreview3, (Function1) objRememberedValue31, composerStartRestartGroup, 0);
                    ActivityResultContract startIntentSenderForResult3 = new ActivityResultContracts.StartIntentSenderForResult();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416256388, str4);
                    zChangedInstance4 = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
                    Object objRememberedValue37 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance4) {
                        obj3 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda25
                            public final Object invoke(Object obj4) {
                                return CameraScreenKt.CameraScreen$lambda$89$lambda$88(context, coroutineScope, mutableState27, mutableState26, mutableState22, mutableState7, mutableState23, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (ActivityResult) obj4);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(obj3);
                    } else {
                        obj3 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda25
                            public final Object invoke(Object obj4) {
                                return CameraScreenKt.CameraScreen$lambda$89$lambda$88(context, coroutineScope, mutableState27, mutableState26, mutableState22, mutableState7, mutableState23, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (ActivityResult) obj4);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(obj3);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    managedActivityResultLauncherRememberLauncherForActivityResult3 = ActivityResultRegistryKt.rememberLauncherForActivityResult(startIntentSenderForResult3, (Function1) obj3, composerStartRestartGroup, 0);
                    ActivityResultContract requestMultiplePermissions3 = new ActivityResultContracts.RequestMultiplePermissions();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416233721, str4);
                    zChangedInstance5 = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(gmsDocumentScanner) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult3) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult2);
                    objRememberedValue32 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance5) {
                        managedActivityResultLauncher = managedActivityResultLauncherRememberLauncherForActivityResult;
                        final MutableState mutableState4112 = mutableState22;
                        mutableState31 = mutableState30;
                        objRememberedValue32 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda26
                            public final Object invoke(Object obj4) {
                                return CameraScreenKt.CameraScreen$lambda$94$lambda$93(context, gmsDocumentScanner, managedActivityResultLauncherRememberLauncherForActivityResult3, managedActivityResultLauncher, managedActivityResultLauncherRememberLauncherForActivityResult2, mutableState31, mutableState4112, (Map) obj4);
                            }
                        };
                        mutableState22 = mutableState4112;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue32);
                    } else {
                        managedActivityResultLauncher = managedActivityResultLauncherRememberLauncherForActivityResult;
                        final MutableState mutableState4113 = mutableState22;
                        mutableState31 = mutableState30;
                        objRememberedValue32 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda26
                            public final Object invoke(Object obj4) {
                                return CameraScreenKt.CameraScreen$lambda$94$lambda$93(context, gmsDocumentScanner, managedActivityResultLauncherRememberLauncherForActivityResult3, managedActivityResultLauncher, managedActivityResultLauncherRememberLauncherForActivityResult2, mutableState31, mutableState4113, (Map) obj4);
                            }
                        };
                        mutableState22 = mutableState4113;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue32);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    final ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult8 = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestMultiplePermissions3, (Function1) objRememberedValue32, composerStartRestartGroup, 0);
                    Function2<Composer, Integer, Unit> function2M231getLambda$2075333601$app3 = ComposableSingletons$CameraScreenKt.INSTANCE.m231getLambda$2075333601$app();
                    final Context context9 = context;
                    final ManagedActivityResultLauncher managedActivityResultLauncher4 = managedActivityResultLauncher;
                    final MutableState mutableState4114 = mutableState22;
                    final MutableState mutableState4115 = mutableState31;
                    final MutableState mutableState4116 = mutableState23;
                    final MutableState mutableState4117 = mutableState10;
                    final MutableState mutableState4118 = mutableState;
                    final MutableState mutableState4119 = mutableState18;
                    final MutableState mutableState422 = mutableState19;
                    final MutableState mutableState423 = mutableState25;
                    final MutableState mutableState519 = mutableState21;
                    final MutableState mutableState5110 = mutableState26;
                    final MutableState mutableState5111 = mutableState4;
                    final MutableState mutableState5112 = mutableState16;
                    final MutableState mutableState5113 = mutableState11;
                    String str8 = str3;
                    final MutableState mutableState5114 = mutableState15;
                    final MutableState mutableState5115 = mutableState5;
                    final MutableState mutableState5116 = mutableState17;
                    final MutableState mutableState5117 = mutableState3;
                    Function3 function8 = new Function3() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda27
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            return CameraScreenKt.CameraScreen$lambda$170(managedActivityResultLauncherRememberLauncherForActivityResult8, context9, managedActivityResultLauncher4, managedActivityResultLauncherRememberLauncherForActivityResult2, managedActivityResultLauncherRememberLauncherForActivityResult7, function16, mutableState27, mutableState4115, mutableState5110, mutableState4114, mutableState4116, mutableState423, mutableState4119, mutableState422, mutableState4117, mutableState4118, mutableState318, coroutineScope, mutableState321, mutableState519, mutableState2, mutableState5112, mutableState5116, mutableState5115, mutableState5113, mutableState5117, mutableState5111, mutableState24, mutableState5114, mutableState13, mutableState319, mutableState320, (PaddingValues) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                        }
                    };
                    composer2 = composerStartRestartGroup;
                    Modifier modifier7 = modifier3;
                    ScaffoldKt.Scaffold-TvnljyQ(modifier7, function2M231getLambda$2075333601$app3, (Function2) null, (Function2) null, (Function2) null, 0, 0L, 0L, (WindowInsets) null, ComposableLambdaKt.rememberComposableLambda(349314036, true, function8, composer2, 54), composer2, ((i6 >> 3) & 14) | 805306416, 508);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier7;
                    str5 = str8;
                } else {
                    i6 = i3;
                }
                mutableState29 = mutableState28;
                final MutableState mutableState520 = mutableState25;
                final MutableState mutableState65 = mutableState24;
                final MutableState mutableState66 = mutableState23;
                final MutableState mutableState67 = mutableState22;
                final MutableState mutableState68 = mutableState26;
                final MutableState mutableState69 = mutableState27;
                obj2 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda23
                    public final Object invoke(Object obj4) {
                        return CameraScreenKt.CameraScreen$lambda$84$lambda$83(mutableState29, context, coroutineScope, mutableState69, mutableState68, mutableState67, mutableState7, mutableState66, mutableState65, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState520, mutableState11, mutableState21, mutableState3, ((Boolean) obj4).booleanValue());
                    }
                };
                context = context;
                coroutineScope = coroutineScope;
                mutableState27 = mutableState69;
                mutableState26 = mutableState68;
                mutableState22 = mutableState67;
                mutableState7 = mutableState7;
                mutableState23 = mutableState66;
                mutableState24 = mutableState65;
                mutableState15 = mutableState15;
                mutableState13 = mutableState13;
                mutableState10 = mutableState10;
                mutableState = mutableState;
                mutableState2 = mutableState2;
                mutableState4 = mutableState4;
                mutableState5 = mutableState5;
                mutableState16 = mutableState16;
                mutableState17 = mutableState17;
                mutableState18 = mutableState18;
                mutableState19 = mutableState19;
                mutableState25 = mutableState520;
                mutableState11 = mutableState11;
                mutableState21 = mutableState21;
                mutableState3 = mutableState3;
                composerStartRestartGroup.updateRememberedValue(obj2);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(takePicture2, (Function1) obj2, composerStartRestartGroup, 0);
                ActivityResultContract takePicturePreview4 = new ActivityResultContracts.TakePicturePreview();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416284152, str4);
                zChangedInstance3 = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(context);
                mutableState30 = mutableState29;
                objRememberedValue31 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance3) {
                    final MutableState mutableState3118 = mutableState23;
                    final Context context10 = context;
                    final CoroutineScope coroutineScope7 = coroutineScope;
                    final MutableState mutableState3119 = mutableState27;
                    final MutableState mutableState31110 = mutableState26;
                    final MutableState mutableState31111 = mutableState22;
                    final MutableState mutableState41110 = mutableState7;
                    Function1 function9 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda24
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$86$lambda$85(coroutineScope7, mutableState3119, mutableState31110, mutableState31111, mutableState41110, mutableState3118, context10, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (Bitmap) obj4);
                        }
                    };
                    coroutineScope = coroutineScope7;
                    context = context10;
                    mutableState23 = mutableState3118;
                    mutableState7 = mutableState41110;
                    mutableState22 = mutableState31111;
                    mutableState26 = mutableState31110;
                    mutableState27 = mutableState3119;
                    composerStartRestartGroup.updateRememberedValue(function9);
                    objRememberedValue31 = function9;
                } else {
                    final MutableState mutableState31112 = mutableState23;
                    final Context context11 = context;
                    final CoroutineScope coroutineScope8 = coroutineScope;
                    final MutableState mutableState31113 = mutableState27;
                    final MutableState mutableState31114 = mutableState26;
                    final MutableState mutableState31115 = mutableState22;
                    final MutableState mutableState41111 = mutableState7;
                    Function1 function10 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda24
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$86$lambda$85(coroutineScope8, mutableState31113, mutableState31114, mutableState31115, mutableState41111, mutableState31112, context11, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (Bitmap) obj4);
                        }
                    };
                    coroutineScope = coroutineScope8;
                    context = context11;
                    mutableState23 = mutableState31112;
                    mutableState7 = mutableState41111;
                    mutableState22 = mutableState31115;
                    mutableState26 = mutableState31114;
                    mutableState27 = mutableState31113;
                    composerStartRestartGroup.updateRememberedValue(function10);
                    objRememberedValue31 = function10;
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                managedActivityResultLauncherRememberLauncherForActivityResult2 = ActivityResultRegistryKt.rememberLauncherForActivityResult(takePicturePreview4, (Function1) objRememberedValue31, composerStartRestartGroup, 0);
                ActivityResultContract startIntentSenderForResult4 = new ActivityResultContracts.StartIntentSenderForResult();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416256388, str4);
                zChangedInstance4 = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
                Object objRememberedValue38 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance4) {
                    obj3 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda25
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$89$lambda$88(context, coroutineScope, mutableState27, mutableState26, mutableState22, mutableState7, mutableState23, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (ActivityResult) obj4);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(obj3);
                } else {
                    obj3 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda25
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$89$lambda$88(context, coroutineScope, mutableState27, mutableState26, mutableState22, mutableState7, mutableState23, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (ActivityResult) obj4);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(obj3);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                managedActivityResultLauncherRememberLauncherForActivityResult3 = ActivityResultRegistryKt.rememberLauncherForActivityResult(startIntentSenderForResult4, (Function1) obj3, composerStartRestartGroup, 0);
                ActivityResultContract requestMultiplePermissions4 = new ActivityResultContracts.RequestMultiplePermissions();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416233721, str4);
                zChangedInstance5 = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(gmsDocumentScanner) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult3) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult2);
                objRememberedValue32 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance5) {
                    managedActivityResultLauncher = managedActivityResultLauncherRememberLauncherForActivityResult;
                    final MutableState mutableState41112 = mutableState22;
                    mutableState31 = mutableState30;
                    objRememberedValue32 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda26
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$94$lambda$93(context, gmsDocumentScanner, managedActivityResultLauncherRememberLauncherForActivityResult3, managedActivityResultLauncher, managedActivityResultLauncherRememberLauncherForActivityResult2, mutableState31, mutableState41112, (Map) obj4);
                        }
                    };
                    mutableState22 = mutableState41112;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue32);
                } else {
                    managedActivityResultLauncher = managedActivityResultLauncherRememberLauncherForActivityResult;
                    final MutableState mutableState41113 = mutableState22;
                    mutableState31 = mutableState30;
                    objRememberedValue32 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda26
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$94$lambda$93(context, gmsDocumentScanner, managedActivityResultLauncherRememberLauncherForActivityResult3, managedActivityResultLauncher, managedActivityResultLauncherRememberLauncherForActivityResult2, mutableState31, mutableState41113, (Map) obj4);
                        }
                    };
                    mutableState22 = mutableState41113;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue32);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                final ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult9 = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestMultiplePermissions4, (Function1) objRememberedValue32, composerStartRestartGroup, 0);
                Function2<Composer, Integer, Unit> function2M231getLambda$2075333601$app4 = ComposableSingletons$CameraScreenKt.INSTANCE.m231getLambda$2075333601$app();
                final Context context12 = context;
                final ManagedActivityResultLauncher managedActivityResultLauncher5 = managedActivityResultLauncher;
                final MutableState mutableState41114 = mutableState22;
                final MutableState mutableState41115 = mutableState31;
                final MutableState mutableState41116 = mutableState23;
                final MutableState mutableState41117 = mutableState10;
                final MutableState mutableState41118 = mutableState;
                final MutableState mutableState41119 = mutableState18;
                final MutableState mutableState424 = mutableState19;
                final MutableState mutableState425 = mutableState25;
                final MutableState mutableState5118 = mutableState21;
                final MutableState mutableState5119 = mutableState26;
                final MutableState mutableState51110 = mutableState4;
                final MutableState mutableState51111 = mutableState16;
                final MutableState mutableState51112 = mutableState11;
                String str9 = str3;
                final MutableState mutableState51113 = mutableState15;
                final MutableState mutableState51114 = mutableState5;
                final MutableState mutableState51115 = mutableState17;
                final MutableState mutableState51116 = mutableState3;
                Function3 function11 = new Function3() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda27
                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                        return CameraScreenKt.CameraScreen$lambda$170(managedActivityResultLauncherRememberLauncherForActivityResult9, context12, managedActivityResultLauncher5, managedActivityResultLauncherRememberLauncherForActivityResult2, managedActivityResultLauncherRememberLauncherForActivityResult7, function16, mutableState27, mutableState41115, mutableState5119, mutableState41114, mutableState41116, mutableState425, mutableState41119, mutableState424, mutableState41117, mutableState41118, mutableState318, coroutineScope, mutableState321, mutableState5118, mutableState2, mutableState51111, mutableState51115, mutableState51114, mutableState51112, mutableState51116, mutableState51110, mutableState24, mutableState51113, mutableState13, mutableState319, mutableState320, (PaddingValues) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                    }
                };
                composer2 = composerStartRestartGroup;
                Modifier modifier8 = modifier3;
                ScaffoldKt.Scaffold-TvnljyQ(modifier8, function2M231getLambda$2075333601$app4, (Function2) null, (Function2) null, (Function2) null, 0, 0L, 0L, (WindowInsets) null, ComposableLambdaKt.rememberComposableLambda(349314036, true, function11, composer2, 54), composer2, ((i6 >> 3) & 14) | 805306416, 508);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier8;
                str5 = str9;
            } else {
                if (i7 != 0) {
                    modifier3 = (Modifier) Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-287508125, i3, -1, "com.example.ui.screens.CameraScreen (CameraScreen.kt:86)");
                }
                CompositionLocal localContext3 = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume3 = composerStartRestartGroup.consume(localContext3);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                context = (Context) objConsume3;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller3 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller3);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller3;
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417382302, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                mutableState = (MutableState) objRememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417380702, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                mutableState2 = (MutableState) objRememberedValue3;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417379002, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                    objRememberedValue4 = SnapshotStateKt.mutableStateOf$default("Good", (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                mutableState3 = (MutableState) objRememberedValue4;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417376958, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                    objRememberedValue5 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                mutableState4 = (MutableState) objRememberedValue5;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417375390, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == Composer.Companion.getEmpty()) {
                    objRememberedValue6 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                mutableState5 = (MutableState) objRememberedValue6;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417373659, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == Composer.Companion.getEmpty()) {
                    objRememberedValue7 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                mutableState6 = (MutableState) objRememberedValue7;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417371603, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == Composer.Companion.getEmpty()) {
                    objRememberedValue8 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                mutableState7 = (MutableState) objRememberedValue8;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417369555, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue9 == Composer.Companion.getEmpty()) {
                    objRememberedValue9 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                mutableState8 = (MutableState) objRememberedValue9;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417367379, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue10 == Composer.Companion.getEmpty()) {
                    objRememberedValue10 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                }
                mutableState9 = (MutableState) objRememberedValue10;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417365235, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue11 == Composer.Companion.getEmpty()) {
                    objRememberedValue11 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                }
                mutableState10 = (MutableState) objRememberedValue11;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417362963, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue12 == Composer.Companion.getEmpty()) {
                    objRememberedValue12 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                }
                mutableState11 = (MutableState) objRememberedValue12;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417360443, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue13 == Composer.Companion.getEmpty()) {
                    objRememberedValue13 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                }
                mutableState12 = (MutableState) objRememberedValue13;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417358363, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue14 == Composer.Companion.getEmpty()) {
                    objRememberedValue14 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                }
                final MutableState mutableState3120 = (MutableState) objRememberedValue14;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417355326, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue15 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue15 == Composer.Companion.getEmpty()) {
                    objRememberedValue15 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
                }
                mutableState13 = (MutableState) objRememberedValue15;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417353517, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue16 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue16 == Composer.Companion.getEmpty()) {
                    objRememberedValue16 = SnapshotStateKt.mutableStateOf$default(str3, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue16);
                }
                final MutableState mutableState3121 = (MutableState) objRememberedValue16;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417351358, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue17 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue17 == Composer.Companion.getEmpty()) {
                    objRememberedValue17 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue17);
                }
                final MutableState mutableState322 = (MutableState) objRememberedValue17;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417349683, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue18 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue18 == Composer.Companion.getEmpty()) {
                    objRememberedValue18 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue18);
                }
                mutableState14 = (MutableState) objRememberedValue18;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417347635, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue19 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue19 == Composer.Companion.getEmpty()) {
                    objRememberedValue19 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue19);
                }
                mutableState15 = (MutableState) objRememberedValue19;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417345587, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue20 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue20 == Composer.Companion.getEmpty()) {
                    objRememberedValue20 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue20);
                }
                mutableState16 = (MutableState) objRememberedValue20;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417343411, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue21 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue21 == Composer.Companion.getEmpty()) {
                    objRememberedValue21 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue21);
                }
                mutableState17 = (MutableState) objRememberedValue21;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417341366, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue22 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue22 == Composer.Companion.getEmpty()) {
                    objRememberedValue22 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue22);
                }
                mutableState18 = (MutableState) objRememberedValue22;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417339443, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue23 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue23 == Composer.Companion.getEmpty()) {
                    objRememberedValue23 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue23);
                }
                mutableState19 = (MutableState) objRememberedValue23;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417337267, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue24 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue24 == Composer.Companion.getEmpty()) {
                    objRememberedValue24 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue24);
                }
                mutableState20 = (MutableState) objRememberedValue24;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417334707, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue25 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue25 == Composer.Companion.getEmpty()) {
                    MutableState mutableStateMutableStateOf$default3 = SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default3);
                    objRememberedValue25 = mutableStateMutableStateOf$default3;
                }
                mutableState21 = (MutableState) objRememberedValue25;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417331259, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue26 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue26 == Composer.Companion.getEmpty()) {
                    objRememberedValue26 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue26);
                }
                final MutableState mutableState323 = (MutableState) objRememberedValue26;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ActivityResultContract getContent3 = new ActivityResultContracts.GetContent();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416328187, "CC(remember):CameraScreen.kt#9igjgp");
                zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
                Object objRememberedValue39 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    str4 = "CC(remember):CameraScreen.kt#9igjgp";
                    mutableState22 = mutableState8;
                    mutableState23 = mutableState12;
                    mutableState24 = mutableState14;
                    mutableState25 = mutableState20;
                    mutableState26 = mutableState6;
                    mutableState27 = mutableState9;
                    obj = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda21
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$76$lambda$75(context, coroutineScope, mutableState27, mutableState26, mutableState22, mutableState7, mutableState23, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (Uri) obj4);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(obj);
                } else {
                    str4 = "CC(remember):CameraScreen.kt#9igjgp";
                    mutableState22 = mutableState8;
                    mutableState23 = mutableState12;
                    mutableState24 = mutableState14;
                    mutableState25 = mutableState20;
                    mutableState26 = mutableState6;
                    mutableState27 = mutableState9;
                    obj = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda21
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$76$lambda$75(context, coroutineScope, mutableState27, mutableState26, mutableState22, mutableState7, mutableState23, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (Uri) obj4);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(obj);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                final ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult10 = ActivityResultRegistryKt.rememberLauncherForActivityResult(getContent3, (Function1) obj, composerStartRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416317091, str4);
                objRememberedValue27 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue27 == Composer.Companion.getEmpty()) {
                    objRememberedValue27 = new GmsDocumentScannerOptions.Builder().setGalleryImportAllowed(true).setPageLimit(1).setResultFormats(101, new int[0]).setScannerMode(1).build();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue27);
                }
                gmsDocumentScannerOptions = (GmsDocumentScannerOptions) objRememberedValue27;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                Intrinsics.checkNotNull(gmsDocumentScannerOptions);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416308675, str4);
                objRememberedValue28 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue28 == Composer.Companion.getEmpty()) {
                    objRememberedValue28 = GmsDocumentScanning.getClient(gmsDocumentScannerOptions);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue28);
                }
                gmsDocumentScanner = (GmsDocumentScanner) objRememberedValue28;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                Intrinsics.checkNotNull(gmsDocumentScanner);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416305814, str4);
                objRememberedValue29 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue29 == Composer.Companion.getEmpty()) {
                    objRememberedValue29 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue29);
                }
                mutableState28 = (MutableState) objRememberedValue29;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ActivityResultContract takePicture3 = new ActivityResultContracts.TakePicture();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416300466, str4);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
                objRememberedValue30 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2) {
                    i6 = i3;
                    if (objRememberedValue30 != Composer.Companion.getEmpty()) {
                        obj2 = objRememberedValue30;
                        mutableState29 = mutableState28;
                    }
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(takePicture3, (Function1) obj2, composerStartRestartGroup, 0);
                    ActivityResultContract takePicturePreview5 = new ActivityResultContracts.TakePicturePreview();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416284152, str4);
                    zChangedInstance3 = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(context);
                    mutableState30 = mutableState29;
                    objRememberedValue31 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance3) {
                        final MutableState mutableState31116 = mutableState23;
                        final Context context13 = context;
                        final CoroutineScope coroutineScope9 = coroutineScope;
                        final MutableState mutableState31117 = mutableState27;
                        final MutableState mutableState31118 = mutableState26;
                        final MutableState mutableState31119 = mutableState22;
                        final MutableState mutableState411110 = mutableState7;
                        Function1 function12 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda24
                            public final Object invoke(Object obj4) {
                                return CameraScreenKt.CameraScreen$lambda$86$lambda$85(coroutineScope9, mutableState31117, mutableState31118, mutableState31119, mutableState411110, mutableState31116, context13, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (Bitmap) obj4);
                            }
                        };
                        coroutineScope = coroutineScope9;
                        context = context13;
                        mutableState23 = mutableState31116;
                        mutableState7 = mutableState411110;
                        mutableState22 = mutableState31119;
                        mutableState26 = mutableState31118;
                        mutableState27 = mutableState31117;
                        composerStartRestartGroup.updateRememberedValue(function12);
                        objRememberedValue31 = function12;
                    } else {
                        final MutableState mutableState311110 = mutableState23;
                        final Context context14 = context;
                        final CoroutineScope coroutineScope10 = coroutineScope;
                        final MutableState mutableState311111 = mutableState27;
                        final MutableState mutableState311112 = mutableState26;
                        final MutableState mutableState311113 = mutableState22;
                        final MutableState mutableState411111 = mutableState7;
                        Function1 function13 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda24
                            public final Object invoke(Object obj4) {
                                return CameraScreenKt.CameraScreen$lambda$86$lambda$85(coroutineScope10, mutableState311111, mutableState311112, mutableState311113, mutableState411111, mutableState311110, context14, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (Bitmap) obj4);
                            }
                        };
                        coroutineScope = coroutineScope10;
                        context = context14;
                        mutableState23 = mutableState311110;
                        mutableState7 = mutableState411111;
                        mutableState22 = mutableState311113;
                        mutableState26 = mutableState311112;
                        mutableState27 = mutableState311111;
                        composerStartRestartGroup.updateRememberedValue(function13);
                        objRememberedValue31 = function13;
                    }
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    managedActivityResultLauncherRememberLauncherForActivityResult2 = ActivityResultRegistryKt.rememberLauncherForActivityResult(takePicturePreview5, (Function1) objRememberedValue31, composerStartRestartGroup, 0);
                    ActivityResultContract startIntentSenderForResult5 = new ActivityResultContracts.StartIntentSenderForResult();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416256388, str4);
                    zChangedInstance4 = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
                    Object objRememberedValue310 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance4) {
                        obj3 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda25
                            public final Object invoke(Object obj4) {
                                return CameraScreenKt.CameraScreen$lambda$89$lambda$88(context, coroutineScope, mutableState27, mutableState26, mutableState22, mutableState7, mutableState23, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (ActivityResult) obj4);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(obj3);
                    } else {
                        obj3 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda25
                            public final Object invoke(Object obj4) {
                                return CameraScreenKt.CameraScreen$lambda$89$lambda$88(context, coroutineScope, mutableState27, mutableState26, mutableState22, mutableState7, mutableState23, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (ActivityResult) obj4);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(obj3);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    managedActivityResultLauncherRememberLauncherForActivityResult3 = ActivityResultRegistryKt.rememberLauncherForActivityResult(startIntentSenderForResult5, (Function1) obj3, composerStartRestartGroup, 0);
                    ActivityResultContract requestMultiplePermissions5 = new ActivityResultContracts.RequestMultiplePermissions();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416233721, str4);
                    zChangedInstance5 = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(gmsDocumentScanner) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult3) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult2);
                    objRememberedValue32 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance5) {
                        managedActivityResultLauncher = managedActivityResultLauncherRememberLauncherForActivityResult;
                        final MutableState mutableState411112 = mutableState22;
                        mutableState31 = mutableState30;
                        objRememberedValue32 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda26
                            public final Object invoke(Object obj4) {
                                return CameraScreenKt.CameraScreen$lambda$94$lambda$93(context, gmsDocumentScanner, managedActivityResultLauncherRememberLauncherForActivityResult3, managedActivityResultLauncher, managedActivityResultLauncherRememberLauncherForActivityResult2, mutableState31, mutableState411112, (Map) obj4);
                            }
                        };
                        mutableState22 = mutableState411112;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue32);
                    } else {
                        managedActivityResultLauncher = managedActivityResultLauncherRememberLauncherForActivityResult;
                        final MutableState mutableState411113 = mutableState22;
                        mutableState31 = mutableState30;
                        objRememberedValue32 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda26
                            public final Object invoke(Object obj4) {
                                return CameraScreenKt.CameraScreen$lambda$94$lambda$93(context, gmsDocumentScanner, managedActivityResultLauncherRememberLauncherForActivityResult3, managedActivityResultLauncher, managedActivityResultLauncherRememberLauncherForActivityResult2, mutableState31, mutableState411113, (Map) obj4);
                            }
                        };
                        mutableState22 = mutableState411113;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue32);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    final ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult11 = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestMultiplePermissions5, (Function1) objRememberedValue32, composerStartRestartGroup, 0);
                    Function2<Composer, Integer, Unit> function2M231getLambda$2075333601$app5 = ComposableSingletons$CameraScreenKt.INSTANCE.m231getLambda$2075333601$app();
                    final Context context15 = context;
                    final ManagedActivityResultLauncher managedActivityResultLauncher6 = managedActivityResultLauncher;
                    final MutableState mutableState411114 = mutableState22;
                    final MutableState mutableState411115 = mutableState31;
                    final MutableState mutableState411116 = mutableState23;
                    final MutableState mutableState411117 = mutableState10;
                    final MutableState mutableState411118 = mutableState;
                    final MutableState mutableState411119 = mutableState18;
                    final MutableState mutableState426 = mutableState19;
                    final MutableState mutableState427 = mutableState25;
                    final MutableState mutableState51117 = mutableState21;
                    final MutableState mutableState51118 = mutableState26;
                    final MutableState mutableState51119 = mutableState4;
                    final MutableState mutableState511110 = mutableState16;
                    final MutableState mutableState511111 = mutableState11;
                    String str10 = str3;
                    final MutableState mutableState511112 = mutableState15;
                    final MutableState mutableState511113 = mutableState5;
                    final MutableState mutableState511114 = mutableState17;
                    final MutableState mutableState511115 = mutableState3;
                    Function3 function14 = new Function3() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda27
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            return CameraScreenKt.CameraScreen$lambda$170(managedActivityResultLauncherRememberLauncherForActivityResult11, context15, managedActivityResultLauncher6, managedActivityResultLauncherRememberLauncherForActivityResult2, managedActivityResultLauncherRememberLauncherForActivityResult10, function16, mutableState27, mutableState411115, mutableState51118, mutableState411114, mutableState411116, mutableState427, mutableState411119, mutableState426, mutableState411117, mutableState411118, mutableState3120, coroutineScope, mutableState323, mutableState51117, mutableState2, mutableState511110, mutableState511114, mutableState511113, mutableState511111, mutableState511115, mutableState51119, mutableState24, mutableState511112, mutableState13, mutableState3121, mutableState322, (PaddingValues) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                        }
                    };
                    composer2 = composerStartRestartGroup;
                    Modifier modifier9 = modifier3;
                    ScaffoldKt.Scaffold-TvnljyQ(modifier9, function2M231getLambda$2075333601$app5, (Function2) null, (Function2) null, (Function2) null, 0, 0L, 0L, (WindowInsets) null, ComposableLambdaKt.rememberComposableLambda(349314036, true, function14, composer2, 54), composer2, ((i6 >> 3) & 14) | 805306416, 508);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier9;
                    str5 = str10;
                } else {
                    i6 = i3;
                }
                mutableState29 = mutableState28;
                final MutableState mutableState521 = mutableState25;
                final MutableState mutableState610 = mutableState24;
                final MutableState mutableState611 = mutableState23;
                final MutableState mutableState612 = mutableState22;
                final MutableState mutableState613 = mutableState26;
                final MutableState mutableState614 = mutableState27;
                obj2 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda23
                    public final Object invoke(Object obj4) {
                        return CameraScreenKt.CameraScreen$lambda$84$lambda$83(mutableState29, context, coroutineScope, mutableState614, mutableState613, mutableState612, mutableState7, mutableState611, mutableState610, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState521, mutableState11, mutableState21, mutableState3, ((Boolean) obj4).booleanValue());
                    }
                };
                context = context;
                coroutineScope = coroutineScope;
                mutableState27 = mutableState614;
                mutableState26 = mutableState613;
                mutableState22 = mutableState612;
                mutableState7 = mutableState7;
                mutableState23 = mutableState611;
                mutableState24 = mutableState610;
                mutableState15 = mutableState15;
                mutableState13 = mutableState13;
                mutableState10 = mutableState10;
                mutableState = mutableState;
                mutableState2 = mutableState2;
                mutableState4 = mutableState4;
                mutableState5 = mutableState5;
                mutableState16 = mutableState16;
                mutableState17 = mutableState17;
                mutableState18 = mutableState18;
                mutableState19 = mutableState19;
                mutableState25 = mutableState521;
                mutableState11 = mutableState11;
                mutableState21 = mutableState21;
                mutableState3 = mutableState3;
                composerStartRestartGroup.updateRememberedValue(obj2);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(takePicture3, (Function1) obj2, composerStartRestartGroup, 0);
                ActivityResultContract takePicturePreview6 = new ActivityResultContracts.TakePicturePreview();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416284152, str4);
                zChangedInstance3 = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(context);
                mutableState30 = mutableState29;
                objRememberedValue31 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance3) {
                    final MutableState mutableState311114 = mutableState23;
                    final Context context16 = context;
                    final CoroutineScope coroutineScope11 = coroutineScope;
                    final MutableState mutableState311115 = mutableState27;
                    final MutableState mutableState311116 = mutableState26;
                    final MutableState mutableState311117 = mutableState22;
                    final MutableState mutableState4111110 = mutableState7;
                    Function1 function15 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda24
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$86$lambda$85(coroutineScope11, mutableState311115, mutableState311116, mutableState311117, mutableState4111110, mutableState311114, context16, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (Bitmap) obj4);
                        }
                    };
                    coroutineScope = coroutineScope11;
                    context = context16;
                    mutableState23 = mutableState311114;
                    mutableState7 = mutableState4111110;
                    mutableState22 = mutableState311117;
                    mutableState26 = mutableState311116;
                    mutableState27 = mutableState311115;
                    composerStartRestartGroup.updateRememberedValue(function15);
                    objRememberedValue31 = function15;
                } else {
                    final MutableState mutableState311118 = mutableState23;
                    final Context context17 = context;
                    final CoroutineScope coroutineScope12 = coroutineScope;
                    final MutableState mutableState311119 = mutableState27;
                    final MutableState mutableState3111110 = mutableState26;
                    final MutableState mutableState3111111 = mutableState22;
                    final MutableState mutableState4111111 = mutableState7;
                    Function1 function17 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda24
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$86$lambda$85(coroutineScope12, mutableState311119, mutableState3111110, mutableState3111111, mutableState4111111, mutableState311118, context17, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (Bitmap) obj4);
                        }
                    };
                    coroutineScope = coroutineScope12;
                    context = context17;
                    mutableState23 = mutableState311118;
                    mutableState7 = mutableState4111111;
                    mutableState22 = mutableState3111111;
                    mutableState26 = mutableState3111110;
                    mutableState27 = mutableState311119;
                    composerStartRestartGroup.updateRememberedValue(function17);
                    objRememberedValue31 = function17;
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                managedActivityResultLauncherRememberLauncherForActivityResult2 = ActivityResultRegistryKt.rememberLauncherForActivityResult(takePicturePreview6, (Function1) objRememberedValue31, composerStartRestartGroup, 0);
                ActivityResultContract startIntentSenderForResult6 = new ActivityResultContracts.StartIntentSenderForResult();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416256388, str4);
                zChangedInstance4 = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
                Object objRememberedValue311 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance4) {
                    obj3 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda25
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$89$lambda$88(context, coroutineScope, mutableState27, mutableState26, mutableState22, mutableState7, mutableState23, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (ActivityResult) obj4);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(obj3);
                } else {
                    obj3 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda25
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$89$lambda$88(context, coroutineScope, mutableState27, mutableState26, mutableState22, mutableState7, mutableState23, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (ActivityResult) obj4);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(obj3);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                managedActivityResultLauncherRememberLauncherForActivityResult3 = ActivityResultRegistryKt.rememberLauncherForActivityResult(startIntentSenderForResult6, (Function1) obj3, composerStartRestartGroup, 0);
                ActivityResultContract requestMultiplePermissions6 = new ActivityResultContracts.RequestMultiplePermissions();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416233721, str4);
                zChangedInstance5 = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(gmsDocumentScanner) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult3) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult2);
                objRememberedValue32 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance5) {
                    managedActivityResultLauncher = managedActivityResultLauncherRememberLauncherForActivityResult;
                    final MutableState mutableState4111112 = mutableState22;
                    mutableState31 = mutableState30;
                    objRememberedValue32 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda26
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$94$lambda$93(context, gmsDocumentScanner, managedActivityResultLauncherRememberLauncherForActivityResult3, managedActivityResultLauncher, managedActivityResultLauncherRememberLauncherForActivityResult2, mutableState31, mutableState4111112, (Map) obj4);
                        }
                    };
                    mutableState22 = mutableState4111112;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue32);
                } else {
                    managedActivityResultLauncher = managedActivityResultLauncherRememberLauncherForActivityResult;
                    final MutableState mutableState4111113 = mutableState22;
                    mutableState31 = mutableState30;
                    objRememberedValue32 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda26
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$94$lambda$93(context, gmsDocumentScanner, managedActivityResultLauncherRememberLauncherForActivityResult3, managedActivityResultLauncher, managedActivityResultLauncherRememberLauncherForActivityResult2, mutableState31, mutableState4111113, (Map) obj4);
                        }
                    };
                    mutableState22 = mutableState4111113;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue32);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                final ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult12 = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestMultiplePermissions6, (Function1) objRememberedValue32, composerStartRestartGroup, 0);
                Function2<Composer, Integer, Unit> function2M231getLambda$2075333601$app6 = ComposableSingletons$CameraScreenKt.INSTANCE.m231getLambda$2075333601$app();
                final Context context18 = context;
                final ManagedActivityResultLauncher managedActivityResultLauncher7 = managedActivityResultLauncher;
                final MutableState mutableState4111114 = mutableState22;
                final MutableState mutableState4111115 = mutableState31;
                final MutableState mutableState4111116 = mutableState23;
                final MutableState mutableState4111117 = mutableState10;
                final MutableState mutableState4111118 = mutableState;
                final MutableState mutableState4111119 = mutableState18;
                final MutableState mutableState428 = mutableState19;
                final MutableState mutableState429 = mutableState25;
                final MutableState mutableState511116 = mutableState21;
                final MutableState mutableState511117 = mutableState26;
                final MutableState mutableState511118 = mutableState4;
                final MutableState mutableState511119 = mutableState16;
                final MutableState mutableState5111110 = mutableState11;
                String str11 = str3;
                final MutableState mutableState5111111 = mutableState15;
                final MutableState mutableState5111112 = mutableState5;
                final MutableState mutableState5111113 = mutableState17;
                final MutableState mutableState5111114 = mutableState3;
                Function3 function18 = new Function3() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda27
                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                        return CameraScreenKt.CameraScreen$lambda$170(managedActivityResultLauncherRememberLauncherForActivityResult12, context18, managedActivityResultLauncher7, managedActivityResultLauncherRememberLauncherForActivityResult2, managedActivityResultLauncherRememberLauncherForActivityResult10, function16, mutableState27, mutableState4111115, mutableState511117, mutableState4111114, mutableState4111116, mutableState429, mutableState4111119, mutableState428, mutableState4111117, mutableState4111118, mutableState3120, coroutineScope, mutableState323, mutableState511116, mutableState2, mutableState511119, mutableState5111113, mutableState5111112, mutableState5111110, mutableState5111114, mutableState511118, mutableState24, mutableState5111111, mutableState13, mutableState3121, mutableState322, (PaddingValues) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                    }
                };
                composer2 = composerStartRestartGroup;
                Modifier modifier10 = modifier3;
                ScaffoldKt.Scaffold-TvnljyQ(modifier10, function2M231getLambda$2075333601$app6, (Function2) null, (Function2) null, (Function2) null, 0, 0L, 0L, (WindowInsets) null, ComposableLambdaKt.rememberComposableLambda(349314036, true, function18, composer2, 54), composer2, ((i6 >> 3) & 14) | 805306416, 508);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier10;
                str5 = str11;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda28
                    public final Object invoke(Object obj4, Object obj5) {
                        return CameraScreenKt.CameraScreen$lambda$171(function16, modifier4, str5, i, i2, (Composer) obj4, ((Integer) obj5).intValue());
                    }
                });
            }
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                str2 = str;
                if (composerStartRestartGroup.changed(str2)) {
                    i5 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
                } else {
                    i5 = UserVerificationMethods.USER_VERIFY_PATTERN;
                }
                i3 |= i5;
            }
            if ((i3 & BuildConfig.VERSION_CODE) != 146) {
                if (i7 != 0) {
                    modifier3 = (Modifier) Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-287508125, i3, -1, "com.example.ui.screens.CameraScreen (CameraScreen.kt:86)");
                }
                CompositionLocal localContext4 = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume4 = composerStartRestartGroup.consume(localContext4);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                context = (Context) objConsume4;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller4 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller4);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller4;
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417382302, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                mutableState = (MutableState) objRememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417380702, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                mutableState2 = (MutableState) objRememberedValue3;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417379002, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                    objRememberedValue4 = SnapshotStateKt.mutableStateOf$default("Good", (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                mutableState3 = (MutableState) objRememberedValue4;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417376958, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                    objRememberedValue5 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                mutableState4 = (MutableState) objRememberedValue5;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417375390, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == Composer.Companion.getEmpty()) {
                    objRememberedValue6 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                mutableState5 = (MutableState) objRememberedValue6;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417373659, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == Composer.Companion.getEmpty()) {
                    objRememberedValue7 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                mutableState6 = (MutableState) objRememberedValue7;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417371603, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == Composer.Companion.getEmpty()) {
                    objRememberedValue8 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                mutableState7 = (MutableState) objRememberedValue8;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417369555, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue9 == Composer.Companion.getEmpty()) {
                    objRememberedValue9 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                mutableState8 = (MutableState) objRememberedValue9;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417367379, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue10 == Composer.Companion.getEmpty()) {
                    objRememberedValue10 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                }
                mutableState9 = (MutableState) objRememberedValue10;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417365235, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue11 == Composer.Companion.getEmpty()) {
                    objRememberedValue11 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                }
                mutableState10 = (MutableState) objRememberedValue11;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417362963, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue12 == Composer.Companion.getEmpty()) {
                    objRememberedValue12 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                }
                mutableState11 = (MutableState) objRememberedValue12;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417360443, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue13 == Composer.Companion.getEmpty()) {
                    objRememberedValue13 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                }
                mutableState12 = (MutableState) objRememberedValue13;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417358363, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue14 == Composer.Companion.getEmpty()) {
                    objRememberedValue14 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                }
                final MutableState mutableState3122 = (MutableState) objRememberedValue14;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417355326, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue15 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue15 == Composer.Companion.getEmpty()) {
                    objRememberedValue15 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
                }
                mutableState13 = (MutableState) objRememberedValue15;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417353517, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue16 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue16 == Composer.Companion.getEmpty()) {
                    objRememberedValue16 = SnapshotStateKt.mutableStateOf$default(str3, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue16);
                }
                final MutableState mutableState3123 = (MutableState) objRememberedValue16;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417351358, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue17 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue17 == Composer.Companion.getEmpty()) {
                    objRememberedValue17 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue17);
                }
                final MutableState mutableState324 = (MutableState) objRememberedValue17;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417349683, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue18 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue18 == Composer.Companion.getEmpty()) {
                    objRememberedValue18 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue18);
                }
                mutableState14 = (MutableState) objRememberedValue18;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417347635, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue19 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue19 == Composer.Companion.getEmpty()) {
                    objRememberedValue19 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue19);
                }
                mutableState15 = (MutableState) objRememberedValue19;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417345587, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue20 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue20 == Composer.Companion.getEmpty()) {
                    objRememberedValue20 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue20);
                }
                mutableState16 = (MutableState) objRememberedValue20;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417343411, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue21 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue21 == Composer.Companion.getEmpty()) {
                    objRememberedValue21 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue21);
                }
                mutableState17 = (MutableState) objRememberedValue21;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417341366, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue22 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue22 == Composer.Companion.getEmpty()) {
                    objRememberedValue22 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue22);
                }
                mutableState18 = (MutableState) objRememberedValue22;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417339443, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue23 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue23 == Composer.Companion.getEmpty()) {
                    objRememberedValue23 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue23);
                }
                mutableState19 = (MutableState) objRememberedValue23;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417337267, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue24 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue24 == Composer.Companion.getEmpty()) {
                    objRememberedValue24 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue24);
                }
                mutableState20 = (MutableState) objRememberedValue24;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417334707, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue25 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue25 == Composer.Companion.getEmpty()) {
                    MutableState mutableStateMutableStateOf$default4 = SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default4);
                    objRememberedValue25 = mutableStateMutableStateOf$default4;
                }
                mutableState21 = (MutableState) objRememberedValue25;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417331259, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue26 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue26 == Composer.Companion.getEmpty()) {
                    objRememberedValue26 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue26);
                }
                final MutableState mutableState325 = (MutableState) objRememberedValue26;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ActivityResultContract getContent4 = new ActivityResultContracts.GetContent();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416328187, "CC(remember):CameraScreen.kt#9igjgp");
                zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
                Object objRememberedValue312 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    str4 = "CC(remember):CameraScreen.kt#9igjgp";
                    mutableState22 = mutableState8;
                    mutableState23 = mutableState12;
                    mutableState24 = mutableState14;
                    mutableState25 = mutableState20;
                    mutableState26 = mutableState6;
                    mutableState27 = mutableState9;
                    obj = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda21
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$76$lambda$75(context, coroutineScope, mutableState27, mutableState26, mutableState22, mutableState7, mutableState23, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (Uri) obj4);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(obj);
                } else {
                    str4 = "CC(remember):CameraScreen.kt#9igjgp";
                    mutableState22 = mutableState8;
                    mutableState23 = mutableState12;
                    mutableState24 = mutableState14;
                    mutableState25 = mutableState20;
                    mutableState26 = mutableState6;
                    mutableState27 = mutableState9;
                    obj = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda21
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$76$lambda$75(context, coroutineScope, mutableState27, mutableState26, mutableState22, mutableState7, mutableState23, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (Uri) obj4);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(obj);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                final ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult13 = ActivityResultRegistryKt.rememberLauncherForActivityResult(getContent4, (Function1) obj, composerStartRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416317091, str4);
                objRememberedValue27 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue27 == Composer.Companion.getEmpty()) {
                    objRememberedValue27 = new GmsDocumentScannerOptions.Builder().setGalleryImportAllowed(true).setPageLimit(1).setResultFormats(101, new int[0]).setScannerMode(1).build();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue27);
                }
                gmsDocumentScannerOptions = (GmsDocumentScannerOptions) objRememberedValue27;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                Intrinsics.checkNotNull(gmsDocumentScannerOptions);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416308675, str4);
                objRememberedValue28 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue28 == Composer.Companion.getEmpty()) {
                    objRememberedValue28 = GmsDocumentScanning.getClient(gmsDocumentScannerOptions);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue28);
                }
                gmsDocumentScanner = (GmsDocumentScanner) objRememberedValue28;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                Intrinsics.checkNotNull(gmsDocumentScanner);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416305814, str4);
                objRememberedValue29 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue29 == Composer.Companion.getEmpty()) {
                    objRememberedValue29 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue29);
                }
                mutableState28 = (MutableState) objRememberedValue29;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ActivityResultContract takePicture4 = new ActivityResultContracts.TakePicture();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416300466, str4);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
                objRememberedValue30 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2) {
                    i6 = i3;
                    if (objRememberedValue30 != Composer.Companion.getEmpty()) {
                        obj2 = objRememberedValue30;
                        mutableState29 = mutableState28;
                    }
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(takePicture4, (Function1) obj2, composerStartRestartGroup, 0);
                    ActivityResultContract takePicturePreview7 = new ActivityResultContracts.TakePicturePreview();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416284152, str4);
                    zChangedInstance3 = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(context);
                    mutableState30 = mutableState29;
                    objRememberedValue31 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance3) {
                        final MutableState mutableState3111112 = mutableState23;
                        final Context context19 = context;
                        final CoroutineScope coroutineScope13 = coroutineScope;
                        final MutableState mutableState3111113 = mutableState27;
                        final MutableState mutableState3111114 = mutableState26;
                        final MutableState mutableState3111115 = mutableState22;
                        final MutableState mutableState41111110 = mutableState7;
                        Function1 function19 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda24
                            public final Object invoke(Object obj4) {
                                return CameraScreenKt.CameraScreen$lambda$86$lambda$85(coroutineScope13, mutableState3111113, mutableState3111114, mutableState3111115, mutableState41111110, mutableState3111112, context19, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (Bitmap) obj4);
                            }
                        };
                        coroutineScope = coroutineScope13;
                        context = context19;
                        mutableState23 = mutableState3111112;
                        mutableState7 = mutableState41111110;
                        mutableState22 = mutableState3111115;
                        mutableState26 = mutableState3111114;
                        mutableState27 = mutableState3111113;
                        composerStartRestartGroup.updateRememberedValue(function19);
                        objRememberedValue31 = function19;
                    } else {
                        final MutableState mutableState3111116 = mutableState23;
                        final Context context110 = context;
                        final CoroutineScope coroutineScope14 = coroutineScope;
                        final MutableState mutableState3111117 = mutableState27;
                        final MutableState mutableState3111118 = mutableState26;
                        final MutableState mutableState3111119 = mutableState22;
                        final MutableState mutableState41111111 = mutableState7;
                        Function1 function110 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda24
                            public final Object invoke(Object obj4) {
                                return CameraScreenKt.CameraScreen$lambda$86$lambda$85(coroutineScope14, mutableState3111117, mutableState3111118, mutableState3111119, mutableState41111111, mutableState3111116, context110, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (Bitmap) obj4);
                            }
                        };
                        coroutineScope = coroutineScope14;
                        context = context110;
                        mutableState23 = mutableState3111116;
                        mutableState7 = mutableState41111111;
                        mutableState22 = mutableState3111119;
                        mutableState26 = mutableState3111118;
                        mutableState27 = mutableState3111117;
                        composerStartRestartGroup.updateRememberedValue(function110);
                        objRememberedValue31 = function110;
                    }
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    managedActivityResultLauncherRememberLauncherForActivityResult2 = ActivityResultRegistryKt.rememberLauncherForActivityResult(takePicturePreview7, (Function1) objRememberedValue31, composerStartRestartGroup, 0);
                    ActivityResultContract startIntentSenderForResult7 = new ActivityResultContracts.StartIntentSenderForResult();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416256388, str4);
                    zChangedInstance4 = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
                    Object objRememberedValue313 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance4) {
                        obj3 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda25
                            public final Object invoke(Object obj4) {
                                return CameraScreenKt.CameraScreen$lambda$89$lambda$88(context, coroutineScope, mutableState27, mutableState26, mutableState22, mutableState7, mutableState23, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (ActivityResult) obj4);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(obj3);
                    } else {
                        obj3 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda25
                            public final Object invoke(Object obj4) {
                                return CameraScreenKt.CameraScreen$lambda$89$lambda$88(context, coroutineScope, mutableState27, mutableState26, mutableState22, mutableState7, mutableState23, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (ActivityResult) obj4);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(obj3);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    managedActivityResultLauncherRememberLauncherForActivityResult3 = ActivityResultRegistryKt.rememberLauncherForActivityResult(startIntentSenderForResult7, (Function1) obj3, composerStartRestartGroup, 0);
                    ActivityResultContract requestMultiplePermissions7 = new ActivityResultContracts.RequestMultiplePermissions();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416233721, str4);
                    zChangedInstance5 = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(gmsDocumentScanner) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult3) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult2);
                    objRememberedValue32 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance5) {
                        managedActivityResultLauncher = managedActivityResultLauncherRememberLauncherForActivityResult;
                        final MutableState mutableState41111112 = mutableState22;
                        mutableState31 = mutableState30;
                        objRememberedValue32 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda26
                            public final Object invoke(Object obj4) {
                                return CameraScreenKt.CameraScreen$lambda$94$lambda$93(context, gmsDocumentScanner, managedActivityResultLauncherRememberLauncherForActivityResult3, managedActivityResultLauncher, managedActivityResultLauncherRememberLauncherForActivityResult2, mutableState31, mutableState41111112, (Map) obj4);
                            }
                        };
                        mutableState22 = mutableState41111112;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue32);
                    } else {
                        managedActivityResultLauncher = managedActivityResultLauncherRememberLauncherForActivityResult;
                        final MutableState mutableState41111113 = mutableState22;
                        mutableState31 = mutableState30;
                        objRememberedValue32 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda26
                            public final Object invoke(Object obj4) {
                                return CameraScreenKt.CameraScreen$lambda$94$lambda$93(context, gmsDocumentScanner, managedActivityResultLauncherRememberLauncherForActivityResult3, managedActivityResultLauncher, managedActivityResultLauncherRememberLauncherForActivityResult2, mutableState31, mutableState41111113, (Map) obj4);
                            }
                        };
                        mutableState22 = mutableState41111113;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue32);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    final ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult14 = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestMultiplePermissions7, (Function1) objRememberedValue32, composerStartRestartGroup, 0);
                    Function2<Composer, Integer, Unit> function2M231getLambda$2075333601$app7 = ComposableSingletons$CameraScreenKt.INSTANCE.m231getLambda$2075333601$app();
                    final Context context111 = context;
                    final ManagedActivityResultLauncher managedActivityResultLauncher8 = managedActivityResultLauncher;
                    final MutableState mutableState41111114 = mutableState22;
                    final MutableState mutableState41111115 = mutableState31;
                    final MutableState mutableState41111116 = mutableState23;
                    final MutableState mutableState41111117 = mutableState10;
                    final MutableState mutableState41111118 = mutableState;
                    final MutableState mutableState41111119 = mutableState18;
                    final MutableState mutableState4210 = mutableState19;
                    final MutableState mutableState4211 = mutableState25;
                    final MutableState mutableState5111115 = mutableState21;
                    final MutableState mutableState5111116 = mutableState26;
                    final MutableState mutableState5111117 = mutableState4;
                    final MutableState mutableState5111118 = mutableState16;
                    final MutableState mutableState5111119 = mutableState11;
                    String str12 = str3;
                    final MutableState mutableState51111110 = mutableState15;
                    final MutableState mutableState51111111 = mutableState5;
                    final MutableState mutableState51111112 = mutableState17;
                    final MutableState mutableState51111113 = mutableState3;
                    Function3 function111 = new Function3() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda27
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            return CameraScreenKt.CameraScreen$lambda$170(managedActivityResultLauncherRememberLauncherForActivityResult14, context111, managedActivityResultLauncher8, managedActivityResultLauncherRememberLauncherForActivityResult2, managedActivityResultLauncherRememberLauncherForActivityResult13, function16, mutableState27, mutableState41111115, mutableState5111116, mutableState41111114, mutableState41111116, mutableState4211, mutableState41111119, mutableState4210, mutableState41111117, mutableState41111118, mutableState3122, coroutineScope, mutableState325, mutableState5111115, mutableState2, mutableState5111118, mutableState51111112, mutableState51111111, mutableState5111119, mutableState51111113, mutableState5111117, mutableState24, mutableState51111110, mutableState13, mutableState3123, mutableState324, (PaddingValues) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                        }
                    };
                    composer2 = composerStartRestartGroup;
                    Modifier modifier11 = modifier3;
                    ScaffoldKt.Scaffold-TvnljyQ(modifier11, function2M231getLambda$2075333601$app7, (Function2) null, (Function2) null, (Function2) null, 0, 0L, 0L, (WindowInsets) null, ComposableLambdaKt.rememberComposableLambda(349314036, true, function111, composer2, 54), composer2, ((i6 >> 3) & 14) | 805306416, 508);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier11;
                    str5 = str12;
                } else {
                    i6 = i3;
                }
                mutableState29 = mutableState28;
                final MutableState mutableState522 = mutableState25;
                final MutableState mutableState615 = mutableState24;
                final MutableState mutableState616 = mutableState23;
                final MutableState mutableState617 = mutableState22;
                final MutableState mutableState618 = mutableState26;
                final MutableState mutableState619 = mutableState27;
                obj2 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda23
                    public final Object invoke(Object obj4) {
                        return CameraScreenKt.CameraScreen$lambda$84$lambda$83(mutableState29, context, coroutineScope, mutableState619, mutableState618, mutableState617, mutableState7, mutableState616, mutableState615, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState522, mutableState11, mutableState21, mutableState3, ((Boolean) obj4).booleanValue());
                    }
                };
                context = context;
                coroutineScope = coroutineScope;
                mutableState27 = mutableState619;
                mutableState26 = mutableState618;
                mutableState22 = mutableState617;
                mutableState7 = mutableState7;
                mutableState23 = mutableState616;
                mutableState24 = mutableState615;
                mutableState15 = mutableState15;
                mutableState13 = mutableState13;
                mutableState10 = mutableState10;
                mutableState = mutableState;
                mutableState2 = mutableState2;
                mutableState4 = mutableState4;
                mutableState5 = mutableState5;
                mutableState16 = mutableState16;
                mutableState17 = mutableState17;
                mutableState18 = mutableState18;
                mutableState19 = mutableState19;
                mutableState25 = mutableState522;
                mutableState11 = mutableState11;
                mutableState21 = mutableState21;
                mutableState3 = mutableState3;
                composerStartRestartGroup.updateRememberedValue(obj2);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(takePicture4, (Function1) obj2, composerStartRestartGroup, 0);
                ActivityResultContract takePicturePreview8 = new ActivityResultContracts.TakePicturePreview();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416284152, str4);
                zChangedInstance3 = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(context);
                mutableState30 = mutableState29;
                objRememberedValue31 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance3) {
                    final MutableState mutableState31111110 = mutableState23;
                    final Context context112 = context;
                    final CoroutineScope coroutineScope15 = coroutineScope;
                    final MutableState mutableState31111111 = mutableState27;
                    final MutableState mutableState31111112 = mutableState26;
                    final MutableState mutableState31111113 = mutableState22;
                    final MutableState mutableState411111110 = mutableState7;
                    Function1 function112 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda24
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$86$lambda$85(coroutineScope15, mutableState31111111, mutableState31111112, mutableState31111113, mutableState411111110, mutableState31111110, context112, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (Bitmap) obj4);
                        }
                    };
                    coroutineScope = coroutineScope15;
                    context = context112;
                    mutableState23 = mutableState31111110;
                    mutableState7 = mutableState411111110;
                    mutableState22 = mutableState31111113;
                    mutableState26 = mutableState31111112;
                    mutableState27 = mutableState31111111;
                    composerStartRestartGroup.updateRememberedValue(function112);
                    objRememberedValue31 = function112;
                } else {
                    final MutableState mutableState31111114 = mutableState23;
                    final Context context113 = context;
                    final CoroutineScope coroutineScope16 = coroutineScope;
                    final MutableState mutableState31111115 = mutableState27;
                    final MutableState mutableState31111116 = mutableState26;
                    final MutableState mutableState31111117 = mutableState22;
                    final MutableState mutableState411111111 = mutableState7;
                    Function1 function113 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda24
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$86$lambda$85(coroutineScope16, mutableState31111115, mutableState31111116, mutableState31111117, mutableState411111111, mutableState31111114, context113, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (Bitmap) obj4);
                        }
                    };
                    coroutineScope = coroutineScope16;
                    context = context113;
                    mutableState23 = mutableState31111114;
                    mutableState7 = mutableState411111111;
                    mutableState22 = mutableState31111117;
                    mutableState26 = mutableState31111116;
                    mutableState27 = mutableState31111115;
                    composerStartRestartGroup.updateRememberedValue(function113);
                    objRememberedValue31 = function113;
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                managedActivityResultLauncherRememberLauncherForActivityResult2 = ActivityResultRegistryKt.rememberLauncherForActivityResult(takePicturePreview8, (Function1) objRememberedValue31, composerStartRestartGroup, 0);
                ActivityResultContract startIntentSenderForResult8 = new ActivityResultContracts.StartIntentSenderForResult();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416256388, str4);
                zChangedInstance4 = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
                Object objRememberedValue314 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance4) {
                    obj3 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda25
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$89$lambda$88(context, coroutineScope, mutableState27, mutableState26, mutableState22, mutableState7, mutableState23, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (ActivityResult) obj4);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(obj3);
                } else {
                    obj3 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda25
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$89$lambda$88(context, coroutineScope, mutableState27, mutableState26, mutableState22, mutableState7, mutableState23, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (ActivityResult) obj4);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(obj3);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                managedActivityResultLauncherRememberLauncherForActivityResult3 = ActivityResultRegistryKt.rememberLauncherForActivityResult(startIntentSenderForResult8, (Function1) obj3, composerStartRestartGroup, 0);
                ActivityResultContract requestMultiplePermissions8 = new ActivityResultContracts.RequestMultiplePermissions();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416233721, str4);
                zChangedInstance5 = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(gmsDocumentScanner) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult3) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult2);
                objRememberedValue32 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance5) {
                    managedActivityResultLauncher = managedActivityResultLauncherRememberLauncherForActivityResult;
                    final MutableState mutableState411111112 = mutableState22;
                    mutableState31 = mutableState30;
                    objRememberedValue32 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda26
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$94$lambda$93(context, gmsDocumentScanner, managedActivityResultLauncherRememberLauncherForActivityResult3, managedActivityResultLauncher, managedActivityResultLauncherRememberLauncherForActivityResult2, mutableState31, mutableState411111112, (Map) obj4);
                        }
                    };
                    mutableState22 = mutableState411111112;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue32);
                } else {
                    managedActivityResultLauncher = managedActivityResultLauncherRememberLauncherForActivityResult;
                    final MutableState mutableState411111113 = mutableState22;
                    mutableState31 = mutableState30;
                    objRememberedValue32 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda26
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$94$lambda$93(context, gmsDocumentScanner, managedActivityResultLauncherRememberLauncherForActivityResult3, managedActivityResultLauncher, managedActivityResultLauncherRememberLauncherForActivityResult2, mutableState31, mutableState411111113, (Map) obj4);
                        }
                    };
                    mutableState22 = mutableState411111113;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue32);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                final ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult15 = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestMultiplePermissions8, (Function1) objRememberedValue32, composerStartRestartGroup, 0);
                Function2<Composer, Integer, Unit> function2M231getLambda$2075333601$app8 = ComposableSingletons$CameraScreenKt.INSTANCE.m231getLambda$2075333601$app();
                final Context context114 = context;
                final ManagedActivityResultLauncher managedActivityResultLauncher9 = managedActivityResultLauncher;
                final MutableState mutableState411111114 = mutableState22;
                final MutableState mutableState411111115 = mutableState31;
                final MutableState mutableState411111116 = mutableState23;
                final MutableState mutableState411111117 = mutableState10;
                final MutableState mutableState411111118 = mutableState;
                final MutableState mutableState411111119 = mutableState18;
                final MutableState mutableState4212 = mutableState19;
                final MutableState mutableState4213 = mutableState25;
                final MutableState mutableState51111114 = mutableState21;
                final MutableState mutableState51111115 = mutableState26;
                final MutableState mutableState51111116 = mutableState4;
                final MutableState mutableState51111117 = mutableState16;
                final MutableState mutableState51111118 = mutableState11;
                String str13 = str3;
                final MutableState mutableState51111119 = mutableState15;
                final MutableState mutableState511111110 = mutableState5;
                final MutableState mutableState511111111 = mutableState17;
                final MutableState mutableState511111112 = mutableState3;
                Function3 function114 = new Function3() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda27
                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                        return CameraScreenKt.CameraScreen$lambda$170(managedActivityResultLauncherRememberLauncherForActivityResult15, context114, managedActivityResultLauncher9, managedActivityResultLauncherRememberLauncherForActivityResult2, managedActivityResultLauncherRememberLauncherForActivityResult13, function16, mutableState27, mutableState411111115, mutableState51111115, mutableState411111114, mutableState411111116, mutableState4213, mutableState411111119, mutableState4212, mutableState411111117, mutableState411111118, mutableState3122, coroutineScope, mutableState325, mutableState51111114, mutableState2, mutableState51111117, mutableState511111111, mutableState511111110, mutableState51111118, mutableState511111112, mutableState51111116, mutableState24, mutableState51111119, mutableState13, mutableState3123, mutableState324, (PaddingValues) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                    }
                };
                composer2 = composerStartRestartGroup;
                Modifier modifier12 = modifier3;
                ScaffoldKt.Scaffold-TvnljyQ(modifier12, function2M231getLambda$2075333601$app8, (Function2) null, (Function2) null, (Function2) null, 0, 0L, 0L, (WindowInsets) null, ComposableLambdaKt.rememberComposableLambda(349314036, true, function114, composer2, 54), composer2, ((i6 >> 3) & 14) | 805306416, 508);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier12;
                str5 = str13;
            } else {
                if (i7 != 0) {
                    modifier3 = (Modifier) Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-287508125, i3, -1, "com.example.ui.screens.CameraScreen (CameraScreen.kt:86)");
                }
                CompositionLocal localContext5 = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume5 = composerStartRestartGroup.consume(localContext5);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                context = (Context) objConsume5;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller5 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller5);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller5;
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417382302, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                mutableState = (MutableState) objRememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417380702, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                mutableState2 = (MutableState) objRememberedValue3;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417379002, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                    objRememberedValue4 = SnapshotStateKt.mutableStateOf$default("Good", (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                mutableState3 = (MutableState) objRememberedValue4;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417376958, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                    objRememberedValue5 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                mutableState4 = (MutableState) objRememberedValue5;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417375390, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == Composer.Companion.getEmpty()) {
                    objRememberedValue6 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                mutableState5 = (MutableState) objRememberedValue6;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417373659, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == Composer.Companion.getEmpty()) {
                    objRememberedValue7 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                mutableState6 = (MutableState) objRememberedValue7;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417371603, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == Composer.Companion.getEmpty()) {
                    objRememberedValue8 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                mutableState7 = (MutableState) objRememberedValue8;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417369555, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue9 == Composer.Companion.getEmpty()) {
                    objRememberedValue9 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                mutableState8 = (MutableState) objRememberedValue9;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417367379, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue10 == Composer.Companion.getEmpty()) {
                    objRememberedValue10 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                }
                mutableState9 = (MutableState) objRememberedValue10;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417365235, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue11 == Composer.Companion.getEmpty()) {
                    objRememberedValue11 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                }
                mutableState10 = (MutableState) objRememberedValue11;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417362963, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue12 == Composer.Companion.getEmpty()) {
                    objRememberedValue12 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                }
                mutableState11 = (MutableState) objRememberedValue12;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417360443, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue13 == Composer.Companion.getEmpty()) {
                    objRememberedValue13 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                }
                mutableState12 = (MutableState) objRememberedValue13;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417358363, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue14 == Composer.Companion.getEmpty()) {
                    objRememberedValue14 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                }
                final MutableState mutableState3124 = (MutableState) objRememberedValue14;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417355326, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue15 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue15 == Composer.Companion.getEmpty()) {
                    objRememberedValue15 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
                }
                mutableState13 = (MutableState) objRememberedValue15;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417353517, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue16 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue16 == Composer.Companion.getEmpty()) {
                    objRememberedValue16 = SnapshotStateKt.mutableStateOf$default(str3, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue16);
                }
                final MutableState mutableState3125 = (MutableState) objRememberedValue16;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417351358, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue17 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue17 == Composer.Companion.getEmpty()) {
                    objRememberedValue17 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue17);
                }
                final MutableState mutableState326 = (MutableState) objRememberedValue17;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417349683, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue18 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue18 == Composer.Companion.getEmpty()) {
                    objRememberedValue18 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue18);
                }
                mutableState14 = (MutableState) objRememberedValue18;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417347635, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue19 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue19 == Composer.Companion.getEmpty()) {
                    objRememberedValue19 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue19);
                }
                mutableState15 = (MutableState) objRememberedValue19;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417345587, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue20 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue20 == Composer.Companion.getEmpty()) {
                    objRememberedValue20 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue20);
                }
                mutableState16 = (MutableState) objRememberedValue20;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417343411, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue21 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue21 == Composer.Companion.getEmpty()) {
                    objRememberedValue21 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue21);
                }
                mutableState17 = (MutableState) objRememberedValue21;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417341366, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue22 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue22 == Composer.Companion.getEmpty()) {
                    objRememberedValue22 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue22);
                }
                mutableState18 = (MutableState) objRememberedValue22;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417339443, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue23 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue23 == Composer.Companion.getEmpty()) {
                    objRememberedValue23 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue23);
                }
                mutableState19 = (MutableState) objRememberedValue23;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417337267, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue24 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue24 == Composer.Companion.getEmpty()) {
                    objRememberedValue24 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue24);
                }
                mutableState20 = (MutableState) objRememberedValue24;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417334707, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue25 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue25 == Composer.Companion.getEmpty()) {
                    MutableState mutableStateMutableStateOf$default5 = SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default5);
                    objRememberedValue25 = mutableStateMutableStateOf$default5;
                }
                mutableState21 = (MutableState) objRememberedValue25;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417331259, "CC(remember):CameraScreen.kt#9igjgp");
                objRememberedValue26 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue26 == Composer.Companion.getEmpty()) {
                    objRememberedValue26 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue26);
                }
                final MutableState mutableState327 = (MutableState) objRememberedValue26;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ActivityResultContract getContent5 = new ActivityResultContracts.GetContent();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416328187, "CC(remember):CameraScreen.kt#9igjgp");
                zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
                Object objRememberedValue315 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    str4 = "CC(remember):CameraScreen.kt#9igjgp";
                    mutableState22 = mutableState8;
                    mutableState23 = mutableState12;
                    mutableState24 = mutableState14;
                    mutableState25 = mutableState20;
                    mutableState26 = mutableState6;
                    mutableState27 = mutableState9;
                    obj = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda21
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$76$lambda$75(context, coroutineScope, mutableState27, mutableState26, mutableState22, mutableState7, mutableState23, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (Uri) obj4);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(obj);
                } else {
                    str4 = "CC(remember):CameraScreen.kt#9igjgp";
                    mutableState22 = mutableState8;
                    mutableState23 = mutableState12;
                    mutableState24 = mutableState14;
                    mutableState25 = mutableState20;
                    mutableState26 = mutableState6;
                    mutableState27 = mutableState9;
                    obj = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda21
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$76$lambda$75(context, coroutineScope, mutableState27, mutableState26, mutableState22, mutableState7, mutableState23, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (Uri) obj4);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(obj);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                final ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult16 = ActivityResultRegistryKt.rememberLauncherForActivityResult(getContent5, (Function1) obj, composerStartRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416317091, str4);
                objRememberedValue27 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue27 == Composer.Companion.getEmpty()) {
                    objRememberedValue27 = new GmsDocumentScannerOptions.Builder().setGalleryImportAllowed(true).setPageLimit(1).setResultFormats(101, new int[0]).setScannerMode(1).build();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue27);
                }
                gmsDocumentScannerOptions = (GmsDocumentScannerOptions) objRememberedValue27;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                Intrinsics.checkNotNull(gmsDocumentScannerOptions);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416308675, str4);
                objRememberedValue28 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue28 == Composer.Companion.getEmpty()) {
                    objRememberedValue28 = GmsDocumentScanning.getClient(gmsDocumentScannerOptions);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue28);
                }
                gmsDocumentScanner = (GmsDocumentScanner) objRememberedValue28;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                Intrinsics.checkNotNull(gmsDocumentScanner);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416305814, str4);
                objRememberedValue29 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue29 == Composer.Companion.getEmpty()) {
                    objRememberedValue29 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue29);
                }
                mutableState28 = (MutableState) objRememberedValue29;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ActivityResultContract takePicture5 = new ActivityResultContracts.TakePicture();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416300466, str4);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
                objRememberedValue30 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2) {
                    i6 = i3;
                    if (objRememberedValue30 != Composer.Companion.getEmpty()) {
                        obj2 = objRememberedValue30;
                        mutableState29 = mutableState28;
                    }
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(takePicture5, (Function1) obj2, composerStartRestartGroup, 0);
                    ActivityResultContract takePicturePreview9 = new ActivityResultContracts.TakePicturePreview();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416284152, str4);
                    zChangedInstance3 = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(context);
                    mutableState30 = mutableState29;
                    objRememberedValue31 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance3) {
                        final MutableState mutableState31111118 = mutableState23;
                        final Context context115 = context;
                        final CoroutineScope coroutineScope17 = coroutineScope;
                        final MutableState mutableState31111119 = mutableState27;
                        final MutableState mutableState311111110 = mutableState26;
                        final MutableState mutableState311111111 = mutableState22;
                        final MutableState mutableState4111111110 = mutableState7;
                        Function1 function115 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda24
                            public final Object invoke(Object obj4) {
                                return CameraScreenKt.CameraScreen$lambda$86$lambda$85(coroutineScope17, mutableState31111119, mutableState311111110, mutableState311111111, mutableState4111111110, mutableState31111118, context115, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (Bitmap) obj4);
                            }
                        };
                        coroutineScope = coroutineScope17;
                        context = context115;
                        mutableState23 = mutableState31111118;
                        mutableState7 = mutableState4111111110;
                        mutableState22 = mutableState311111111;
                        mutableState26 = mutableState311111110;
                        mutableState27 = mutableState31111119;
                        composerStartRestartGroup.updateRememberedValue(function115);
                        objRememberedValue31 = function115;
                    } else {
                        final MutableState mutableState311111112 = mutableState23;
                        final Context context116 = context;
                        final CoroutineScope coroutineScope18 = coroutineScope;
                        final MutableState mutableState311111113 = mutableState27;
                        final MutableState mutableState311111114 = mutableState26;
                        final MutableState mutableState311111115 = mutableState22;
                        final MutableState mutableState4111111111 = mutableState7;
                        Function1 function116 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda24
                            public final Object invoke(Object obj4) {
                                return CameraScreenKt.CameraScreen$lambda$86$lambda$85(coroutineScope18, mutableState311111113, mutableState311111114, mutableState311111115, mutableState4111111111, mutableState311111112, context116, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (Bitmap) obj4);
                            }
                        };
                        coroutineScope = coroutineScope18;
                        context = context116;
                        mutableState23 = mutableState311111112;
                        mutableState7 = mutableState4111111111;
                        mutableState22 = mutableState311111115;
                        mutableState26 = mutableState311111114;
                        mutableState27 = mutableState311111113;
                        composerStartRestartGroup.updateRememberedValue(function116);
                        objRememberedValue31 = function116;
                    }
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    managedActivityResultLauncherRememberLauncherForActivityResult2 = ActivityResultRegistryKt.rememberLauncherForActivityResult(takePicturePreview9, (Function1) objRememberedValue31, composerStartRestartGroup, 0);
                    ActivityResultContract startIntentSenderForResult9 = new ActivityResultContracts.StartIntentSenderForResult();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416256388, str4);
                    zChangedInstance4 = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
                    Object objRememberedValue316 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance4) {
                        obj3 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda25
                            public final Object invoke(Object obj4) {
                                return CameraScreenKt.CameraScreen$lambda$89$lambda$88(context, coroutineScope, mutableState27, mutableState26, mutableState22, mutableState7, mutableState23, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (ActivityResult) obj4);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(obj3);
                    } else {
                        obj3 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda25
                            public final Object invoke(Object obj4) {
                                return CameraScreenKt.CameraScreen$lambda$89$lambda$88(context, coroutineScope, mutableState27, mutableState26, mutableState22, mutableState7, mutableState23, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (ActivityResult) obj4);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(obj3);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    managedActivityResultLauncherRememberLauncherForActivityResult3 = ActivityResultRegistryKt.rememberLauncherForActivityResult(startIntentSenderForResult9, (Function1) obj3, composerStartRestartGroup, 0);
                    ActivityResultContract requestMultiplePermissions9 = new ActivityResultContracts.RequestMultiplePermissions();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416233721, str4);
                    zChangedInstance5 = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(gmsDocumentScanner) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult3) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult2);
                    objRememberedValue32 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance5) {
                        managedActivityResultLauncher = managedActivityResultLauncherRememberLauncherForActivityResult;
                        final MutableState mutableState4111111112 = mutableState22;
                        mutableState31 = mutableState30;
                        objRememberedValue32 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda26
                            public final Object invoke(Object obj4) {
                                return CameraScreenKt.CameraScreen$lambda$94$lambda$93(context, gmsDocumentScanner, managedActivityResultLauncherRememberLauncherForActivityResult3, managedActivityResultLauncher, managedActivityResultLauncherRememberLauncherForActivityResult2, mutableState31, mutableState4111111112, (Map) obj4);
                            }
                        };
                        mutableState22 = mutableState4111111112;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue32);
                    } else {
                        managedActivityResultLauncher = managedActivityResultLauncherRememberLauncherForActivityResult;
                        final MutableState mutableState4111111113 = mutableState22;
                        mutableState31 = mutableState30;
                        objRememberedValue32 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda26
                            public final Object invoke(Object obj4) {
                                return CameraScreenKt.CameraScreen$lambda$94$lambda$93(context, gmsDocumentScanner, managedActivityResultLauncherRememberLauncherForActivityResult3, managedActivityResultLauncher, managedActivityResultLauncherRememberLauncherForActivityResult2, mutableState31, mutableState4111111113, (Map) obj4);
                            }
                        };
                        mutableState22 = mutableState4111111113;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue32);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    final ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult17 = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestMultiplePermissions9, (Function1) objRememberedValue32, composerStartRestartGroup, 0);
                    Function2<Composer, Integer, Unit> function2M231getLambda$2075333601$app9 = ComposableSingletons$CameraScreenKt.INSTANCE.m231getLambda$2075333601$app();
                    final Context context117 = context;
                    final ManagedActivityResultLauncher managedActivityResultLauncher10 = managedActivityResultLauncher;
                    final MutableState mutableState4111111114 = mutableState22;
                    final MutableState mutableState4111111115 = mutableState31;
                    final MutableState mutableState4111111116 = mutableState23;
                    final MutableState mutableState4111111117 = mutableState10;
                    final MutableState mutableState4111111118 = mutableState;
                    final MutableState mutableState4111111119 = mutableState18;
                    final MutableState mutableState4214 = mutableState19;
                    final MutableState mutableState4215 = mutableState25;
                    final MutableState mutableState511111113 = mutableState21;
                    final MutableState mutableState511111114 = mutableState26;
                    final MutableState mutableState511111115 = mutableState4;
                    final MutableState mutableState511111116 = mutableState16;
                    final MutableState mutableState511111117 = mutableState11;
                    String str14 = str3;
                    final MutableState mutableState511111118 = mutableState15;
                    final MutableState mutableState511111119 = mutableState5;
                    final MutableState mutableState5111111110 = mutableState17;
                    final MutableState mutableState5111111111 = mutableState3;
                    Function3 function117 = new Function3() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda27
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            return CameraScreenKt.CameraScreen$lambda$170(managedActivityResultLauncherRememberLauncherForActivityResult17, context117, managedActivityResultLauncher10, managedActivityResultLauncherRememberLauncherForActivityResult2, managedActivityResultLauncherRememberLauncherForActivityResult16, function16, mutableState27, mutableState4111111115, mutableState511111114, mutableState4111111114, mutableState4111111116, mutableState4215, mutableState4111111119, mutableState4214, mutableState4111111117, mutableState4111111118, mutableState3124, coroutineScope, mutableState327, mutableState511111113, mutableState2, mutableState511111116, mutableState5111111110, mutableState511111119, mutableState511111117, mutableState5111111111, mutableState511111115, mutableState24, mutableState511111118, mutableState13, mutableState3125, mutableState326, (PaddingValues) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                        }
                    };
                    composer2 = composerStartRestartGroup;
                    Modifier modifier13 = modifier3;
                    ScaffoldKt.Scaffold-TvnljyQ(modifier13, function2M231getLambda$2075333601$app9, (Function2) null, (Function2) null, (Function2) null, 0, 0L, 0L, (WindowInsets) null, ComposableLambdaKt.rememberComposableLambda(349314036, true, function117, composer2, 54), composer2, ((i6 >> 3) & 14) | 805306416, 508);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier13;
                    str5 = str14;
                } else {
                    i6 = i3;
                }
                mutableState29 = mutableState28;
                final MutableState mutableState523 = mutableState25;
                final MutableState mutableState6110 = mutableState24;
                final MutableState mutableState6111 = mutableState23;
                final MutableState mutableState6112 = mutableState22;
                final MutableState mutableState6113 = mutableState26;
                final MutableState mutableState6114 = mutableState27;
                obj2 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda23
                    public final Object invoke(Object obj4) {
                        return CameraScreenKt.CameraScreen$lambda$84$lambda$83(mutableState29, context, coroutineScope, mutableState6114, mutableState6113, mutableState6112, mutableState7, mutableState6111, mutableState6110, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState523, mutableState11, mutableState21, mutableState3, ((Boolean) obj4).booleanValue());
                    }
                };
                context = context;
                coroutineScope = coroutineScope;
                mutableState27 = mutableState6114;
                mutableState26 = mutableState6113;
                mutableState22 = mutableState6112;
                mutableState7 = mutableState7;
                mutableState23 = mutableState6111;
                mutableState24 = mutableState6110;
                mutableState15 = mutableState15;
                mutableState13 = mutableState13;
                mutableState10 = mutableState10;
                mutableState = mutableState;
                mutableState2 = mutableState2;
                mutableState4 = mutableState4;
                mutableState5 = mutableState5;
                mutableState16 = mutableState16;
                mutableState17 = mutableState17;
                mutableState18 = mutableState18;
                mutableState19 = mutableState19;
                mutableState25 = mutableState523;
                mutableState11 = mutableState11;
                mutableState21 = mutableState21;
                mutableState3 = mutableState3;
                composerStartRestartGroup.updateRememberedValue(obj2);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(takePicture5, (Function1) obj2, composerStartRestartGroup, 0);
                ActivityResultContract takePicturePreview10 = new ActivityResultContracts.TakePicturePreview();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416284152, str4);
                zChangedInstance3 = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(context);
                mutableState30 = mutableState29;
                objRememberedValue31 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance3) {
                    final MutableState mutableState311111116 = mutableState23;
                    final Context context118 = context;
                    final CoroutineScope coroutineScope19 = coroutineScope;
                    final MutableState mutableState311111117 = mutableState27;
                    final MutableState mutableState311111118 = mutableState26;
                    final MutableState mutableState311111119 = mutableState22;
                    final MutableState mutableState41111111110 = mutableState7;
                    Function1 function118 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda24
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$86$lambda$85(coroutineScope19, mutableState311111117, mutableState311111118, mutableState311111119, mutableState41111111110, mutableState311111116, context118, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (Bitmap) obj4);
                        }
                    };
                    coroutineScope = coroutineScope19;
                    context = context118;
                    mutableState23 = mutableState311111116;
                    mutableState7 = mutableState41111111110;
                    mutableState22 = mutableState311111119;
                    mutableState26 = mutableState311111118;
                    mutableState27 = mutableState311111117;
                    composerStartRestartGroup.updateRememberedValue(function118);
                    objRememberedValue31 = function118;
                } else {
                    final MutableState mutableState3111111110 = mutableState23;
                    final Context context119 = context;
                    final CoroutineScope coroutineScope110 = coroutineScope;
                    final MutableState mutableState3111111111 = mutableState27;
                    final MutableState mutableState3111111112 = mutableState26;
                    final MutableState mutableState3111111113 = mutableState22;
                    final MutableState mutableState41111111111 = mutableState7;
                    Function1 function119 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda24
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$86$lambda$85(coroutineScope110, mutableState3111111111, mutableState3111111112, mutableState3111111113, mutableState41111111111, mutableState3111111110, context119, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (Bitmap) obj4);
                        }
                    };
                    coroutineScope = coroutineScope110;
                    context = context119;
                    mutableState23 = mutableState3111111110;
                    mutableState7 = mutableState41111111111;
                    mutableState22 = mutableState3111111113;
                    mutableState26 = mutableState3111111112;
                    mutableState27 = mutableState3111111111;
                    composerStartRestartGroup.updateRememberedValue(function119);
                    objRememberedValue31 = function119;
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                managedActivityResultLauncherRememberLauncherForActivityResult2 = ActivityResultRegistryKt.rememberLauncherForActivityResult(takePicturePreview10, (Function1) objRememberedValue31, composerStartRestartGroup, 0);
                ActivityResultContract startIntentSenderForResult10 = new ActivityResultContracts.StartIntentSenderForResult();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416256388, str4);
                zChangedInstance4 = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
                Object objRememberedValue317 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance4) {
                    obj3 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda25
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$89$lambda$88(context, coroutineScope, mutableState27, mutableState26, mutableState22, mutableState7, mutableState23, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (ActivityResult) obj4);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(obj3);
                } else {
                    obj3 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda25
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$89$lambda$88(context, coroutineScope, mutableState27, mutableState26, mutableState22, mutableState7, mutableState23, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (ActivityResult) obj4);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(obj3);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                managedActivityResultLauncherRememberLauncherForActivityResult3 = ActivityResultRegistryKt.rememberLauncherForActivityResult(startIntentSenderForResult10, (Function1) obj3, composerStartRestartGroup, 0);
                ActivityResultContract requestMultiplePermissions10 = new ActivityResultContracts.RequestMultiplePermissions();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416233721, str4);
                zChangedInstance5 = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(gmsDocumentScanner) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult3) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult2);
                objRememberedValue32 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance5) {
                    managedActivityResultLauncher = managedActivityResultLauncherRememberLauncherForActivityResult;
                    final MutableState mutableState41111111112 = mutableState22;
                    mutableState31 = mutableState30;
                    objRememberedValue32 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda26
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$94$lambda$93(context, gmsDocumentScanner, managedActivityResultLauncherRememberLauncherForActivityResult3, managedActivityResultLauncher, managedActivityResultLauncherRememberLauncherForActivityResult2, mutableState31, mutableState41111111112, (Map) obj4);
                        }
                    };
                    mutableState22 = mutableState41111111112;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue32);
                } else {
                    managedActivityResultLauncher = managedActivityResultLauncherRememberLauncherForActivityResult;
                    final MutableState mutableState41111111113 = mutableState22;
                    mutableState31 = mutableState30;
                    objRememberedValue32 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda26
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$94$lambda$93(context, gmsDocumentScanner, managedActivityResultLauncherRememberLauncherForActivityResult3, managedActivityResultLauncher, managedActivityResultLauncherRememberLauncherForActivityResult2, mutableState31, mutableState41111111113, (Map) obj4);
                        }
                    };
                    mutableState22 = mutableState41111111113;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue32);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                final ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult18 = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestMultiplePermissions10, (Function1) objRememberedValue32, composerStartRestartGroup, 0);
                Function2<Composer, Integer, Unit> function2M231getLambda$2075333601$app10 = ComposableSingletons$CameraScreenKt.INSTANCE.m231getLambda$2075333601$app();
                final Context context1110 = context;
                final ManagedActivityResultLauncher managedActivityResultLauncher11 = managedActivityResultLauncher;
                final MutableState mutableState41111111114 = mutableState22;
                final MutableState mutableState41111111115 = mutableState31;
                final MutableState mutableState41111111116 = mutableState23;
                final MutableState mutableState41111111117 = mutableState10;
                final MutableState mutableState41111111118 = mutableState;
                final MutableState mutableState41111111119 = mutableState18;
                final MutableState mutableState4216 = mutableState19;
                final MutableState mutableState4217 = mutableState25;
                final MutableState mutableState5111111112 = mutableState21;
                final MutableState mutableState5111111113 = mutableState26;
                final MutableState mutableState5111111114 = mutableState4;
                final MutableState mutableState5111111115 = mutableState16;
                final MutableState mutableState5111111116 = mutableState11;
                String str15 = str3;
                final MutableState mutableState5111111117 = mutableState15;
                final MutableState mutableState5111111118 = mutableState5;
                final MutableState mutableState5111111119 = mutableState17;
                final MutableState mutableState51111111110 = mutableState3;
                Function3 function1110 = new Function3() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda27
                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                        return CameraScreenKt.CameraScreen$lambda$170(managedActivityResultLauncherRememberLauncherForActivityResult18, context1110, managedActivityResultLauncher11, managedActivityResultLauncherRememberLauncherForActivityResult2, managedActivityResultLauncherRememberLauncherForActivityResult16, function16, mutableState27, mutableState41111111115, mutableState5111111113, mutableState41111111114, mutableState41111111116, mutableState4217, mutableState41111111119, mutableState4216, mutableState41111111117, mutableState41111111118, mutableState3124, coroutineScope, mutableState327, mutableState5111111112, mutableState2, mutableState5111111115, mutableState5111111119, mutableState5111111118, mutableState5111111116, mutableState51111111110, mutableState5111111114, mutableState24, mutableState5111111117, mutableState13, mutableState3125, mutableState326, (PaddingValues) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                    }
                };
                composer2 = composerStartRestartGroup;
                Modifier modifier14 = modifier3;
                ScaffoldKt.Scaffold-TvnljyQ(modifier14, function2M231getLambda$2075333601$app10, (Function2) null, (Function2) null, (Function2) null, 0, 0L, 0L, (WindowInsets) null, ComposableLambdaKt.rememberComposableLambda(349314036, true, function1110, composer2, 54), composer2, ((i6 >> 3) & 14) | 805306416, 508);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier14;
                str5 = str15;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda28
                    public final Object invoke(Object obj4, Object obj5) {
                        return CameraScreenKt.CameraScreen$lambda$171(function16, modifier4, str5, i, i2, (Composer) obj4, ((Integer) obj5).intValue());
                    }
                });
            }
        }
        i3 |= 384;
        str2 = str;
        if ((i3 & BuildConfig.VERSION_CODE) != 146) {
            if (i7 != 0) {
                modifier3 = (Modifier) Modifier.Companion;
            } else {
                modifier3 = modifier2;
            }
            if (i4 != 0) {
                str3 = "";
            } else {
                str3 = str2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-287508125, i3, -1, "com.example.ui.screens.CameraScreen (CameraScreen.kt:86)");
            }
            CompositionLocal localContext6 = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume6 = composerStartRestartGroup.consume(localContext6);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            context = (Context) objConsume6;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller6 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller6);
                objRememberedValue = compositionScopedCoroutineScopeCanceller6;
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417382302, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            mutableState = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417380702, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            mutableState2 = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417379002, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt.mutableStateOf$default("Good", (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            mutableState3 = (MutableState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417376958, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            mutableState4 = (MutableState) objRememberedValue5;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417375390, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == Composer.Companion.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            mutableState5 = (MutableState) objRememberedValue6;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417373659, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == Composer.Companion.getEmpty()) {
                objRememberedValue7 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            mutableState6 = (MutableState) objRememberedValue7;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417371603, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == Composer.Companion.getEmpty()) {
                objRememberedValue8 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            mutableState7 = (MutableState) objRememberedValue8;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417369555, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue9 == Composer.Companion.getEmpty()) {
                objRememberedValue9 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            mutableState8 = (MutableState) objRememberedValue9;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417367379, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue10 == Composer.Companion.getEmpty()) {
                objRememberedValue10 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            mutableState9 = (MutableState) objRememberedValue10;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417365235, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue11 == Composer.Companion.getEmpty()) {
                objRememberedValue11 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
            }
            mutableState10 = (MutableState) objRememberedValue11;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417362963, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue12 == Composer.Companion.getEmpty()) {
                objRememberedValue12 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
            }
            mutableState11 = (MutableState) objRememberedValue12;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417360443, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue13 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue13 == Composer.Companion.getEmpty()) {
                objRememberedValue13 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
            }
            mutableState12 = (MutableState) objRememberedValue13;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417358363, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue14 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue14 == Composer.Companion.getEmpty()) {
                objRememberedValue14 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
            }
            final MutableState mutableState3126 = (MutableState) objRememberedValue14;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417355326, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue15 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue15 == Composer.Companion.getEmpty()) {
                objRememberedValue15 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
            }
            mutableState13 = (MutableState) objRememberedValue15;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417353517, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue16 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue16 == Composer.Companion.getEmpty()) {
                objRememberedValue16 = SnapshotStateKt.mutableStateOf$default(str3, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue16);
            }
            final MutableState mutableState3127 = (MutableState) objRememberedValue16;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417351358, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue17 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue17 == Composer.Companion.getEmpty()) {
                objRememberedValue17 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue17);
            }
            final MutableState mutableState328 = (MutableState) objRememberedValue17;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417349683, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue18 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue18 == Composer.Companion.getEmpty()) {
                objRememberedValue18 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue18);
            }
            mutableState14 = (MutableState) objRememberedValue18;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417347635, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue19 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue19 == Composer.Companion.getEmpty()) {
                objRememberedValue19 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue19);
            }
            mutableState15 = (MutableState) objRememberedValue19;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417345587, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue20 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue20 == Composer.Companion.getEmpty()) {
                objRememberedValue20 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue20);
            }
            mutableState16 = (MutableState) objRememberedValue20;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417343411, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue21 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue21 == Composer.Companion.getEmpty()) {
                objRememberedValue21 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue21);
            }
            mutableState17 = (MutableState) objRememberedValue21;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417341366, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue22 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue22 == Composer.Companion.getEmpty()) {
                objRememberedValue22 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue22);
            }
            mutableState18 = (MutableState) objRememberedValue22;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417339443, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue23 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue23 == Composer.Companion.getEmpty()) {
                objRememberedValue23 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue23);
            }
            mutableState19 = (MutableState) objRememberedValue23;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417337267, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue24 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue24 == Composer.Companion.getEmpty()) {
                objRememberedValue24 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue24);
            }
            mutableState20 = (MutableState) objRememberedValue24;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417334707, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue25 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue25 == Composer.Companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default6 = SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default6);
                objRememberedValue25 = mutableStateMutableStateOf$default6;
            }
            mutableState21 = (MutableState) objRememberedValue25;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417331259, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue26 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue26 == Composer.Companion.getEmpty()) {
                objRememberedValue26 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue26);
            }
            final MutableState mutableState329 = (MutableState) objRememberedValue26;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ActivityResultContract getContent6 = new ActivityResultContracts.GetContent();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416328187, "CC(remember):CameraScreen.kt#9igjgp");
            zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
            Object objRememberedValue318 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                str4 = "CC(remember):CameraScreen.kt#9igjgp";
                mutableState22 = mutableState8;
                mutableState23 = mutableState12;
                mutableState24 = mutableState14;
                mutableState25 = mutableState20;
                mutableState26 = mutableState6;
                mutableState27 = mutableState9;
                obj = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda21
                    public final Object invoke(Object obj4) {
                        return CameraScreenKt.CameraScreen$lambda$76$lambda$75(context, coroutineScope, mutableState27, mutableState26, mutableState22, mutableState7, mutableState23, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (Uri) obj4);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                str4 = "CC(remember):CameraScreen.kt#9igjgp";
                mutableState22 = mutableState8;
                mutableState23 = mutableState12;
                mutableState24 = mutableState14;
                mutableState25 = mutableState20;
                mutableState26 = mutableState6;
                mutableState27 = mutableState9;
                obj = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda21
                    public final Object invoke(Object obj4) {
                        return CameraScreenKt.CameraScreen$lambda$76$lambda$75(context, coroutineScope, mutableState27, mutableState26, mutableState22, mutableState7, mutableState23, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (Uri) obj4);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(obj);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult19 = ActivityResultRegistryKt.rememberLauncherForActivityResult(getContent6, (Function1) obj, composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416317091, str4);
            objRememberedValue27 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue27 == Composer.Companion.getEmpty()) {
                objRememberedValue27 = new GmsDocumentScannerOptions.Builder().setGalleryImportAllowed(true).setPageLimit(1).setResultFormats(101, new int[0]).setScannerMode(1).build();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue27);
            }
            gmsDocumentScannerOptions = (GmsDocumentScannerOptions) objRememberedValue27;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Intrinsics.checkNotNull(gmsDocumentScannerOptions);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416308675, str4);
            objRememberedValue28 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue28 == Composer.Companion.getEmpty()) {
                objRememberedValue28 = GmsDocumentScanning.getClient(gmsDocumentScannerOptions);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue28);
            }
            gmsDocumentScanner = (GmsDocumentScanner) objRememberedValue28;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Intrinsics.checkNotNull(gmsDocumentScanner);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416305814, str4);
            objRememberedValue29 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue29 == Composer.Companion.getEmpty()) {
                objRememberedValue29 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue29);
            }
            mutableState28 = (MutableState) objRememberedValue29;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ActivityResultContract takePicture6 = new ActivityResultContracts.TakePicture();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416300466, str4);
            zChangedInstance2 = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
            objRememberedValue30 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2) {
                i6 = i3;
                if (objRememberedValue30 != Composer.Companion.getEmpty()) {
                    obj2 = objRememberedValue30;
                    mutableState29 = mutableState28;
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(takePicture6, (Function1) obj2, composerStartRestartGroup, 0);
                ActivityResultContract takePicturePreview11 = new ActivityResultContracts.TakePicturePreview();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416284152, str4);
                zChangedInstance3 = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(context);
                mutableState30 = mutableState29;
                objRememberedValue31 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance3) {
                    final MutableState mutableState3111111114 = mutableState23;
                    final Context context1111 = context;
                    final CoroutineScope coroutineScope111 = coroutineScope;
                    final MutableState mutableState3111111115 = mutableState27;
                    final MutableState mutableState3111111116 = mutableState26;
                    final MutableState mutableState3111111117 = mutableState22;
                    final MutableState mutableState411111111110 = mutableState7;
                    Function1 function1111 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda24
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$86$lambda$85(coroutineScope111, mutableState3111111115, mutableState3111111116, mutableState3111111117, mutableState411111111110, mutableState3111111114, context1111, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (Bitmap) obj4);
                        }
                    };
                    coroutineScope = coroutineScope111;
                    context = context1111;
                    mutableState23 = mutableState3111111114;
                    mutableState7 = mutableState411111111110;
                    mutableState22 = mutableState3111111117;
                    mutableState26 = mutableState3111111116;
                    mutableState27 = mutableState3111111115;
                    composerStartRestartGroup.updateRememberedValue(function1111);
                    objRememberedValue31 = function1111;
                } else {
                    final MutableState mutableState3111111118 = mutableState23;
                    final Context context1112 = context;
                    final CoroutineScope coroutineScope112 = coroutineScope;
                    final MutableState mutableState3111111119 = mutableState27;
                    final MutableState mutableState31111111110 = mutableState26;
                    final MutableState mutableState31111111111 = mutableState22;
                    final MutableState mutableState411111111111 = mutableState7;
                    Function1 function1112 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda24
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$86$lambda$85(coroutineScope112, mutableState3111111119, mutableState31111111110, mutableState31111111111, mutableState411111111111, mutableState3111111118, context1112, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (Bitmap) obj4);
                        }
                    };
                    coroutineScope = coroutineScope112;
                    context = context1112;
                    mutableState23 = mutableState3111111118;
                    mutableState7 = mutableState411111111111;
                    mutableState22 = mutableState31111111111;
                    mutableState26 = mutableState31111111110;
                    mutableState27 = mutableState3111111119;
                    composerStartRestartGroup.updateRememberedValue(function1112);
                    objRememberedValue31 = function1112;
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                managedActivityResultLauncherRememberLauncherForActivityResult2 = ActivityResultRegistryKt.rememberLauncherForActivityResult(takePicturePreview11, (Function1) objRememberedValue31, composerStartRestartGroup, 0);
                ActivityResultContract startIntentSenderForResult11 = new ActivityResultContracts.StartIntentSenderForResult();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416256388, str4);
                zChangedInstance4 = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
                Object objRememberedValue319 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance4) {
                    obj3 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda25
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$89$lambda$88(context, coroutineScope, mutableState27, mutableState26, mutableState22, mutableState7, mutableState23, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (ActivityResult) obj4);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(obj3);
                } else {
                    obj3 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda25
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$89$lambda$88(context, coroutineScope, mutableState27, mutableState26, mutableState22, mutableState7, mutableState23, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (ActivityResult) obj4);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(obj3);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                managedActivityResultLauncherRememberLauncherForActivityResult3 = ActivityResultRegistryKt.rememberLauncherForActivityResult(startIntentSenderForResult11, (Function1) obj3, composerStartRestartGroup, 0);
                ActivityResultContract requestMultiplePermissions11 = new ActivityResultContracts.RequestMultiplePermissions();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416233721, str4);
                zChangedInstance5 = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(gmsDocumentScanner) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult3) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult2);
                objRememberedValue32 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance5) {
                    managedActivityResultLauncher = managedActivityResultLauncherRememberLauncherForActivityResult;
                    final MutableState mutableState411111111112 = mutableState22;
                    mutableState31 = mutableState30;
                    objRememberedValue32 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda26
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$94$lambda$93(context, gmsDocumentScanner, managedActivityResultLauncherRememberLauncherForActivityResult3, managedActivityResultLauncher, managedActivityResultLauncherRememberLauncherForActivityResult2, mutableState31, mutableState411111111112, (Map) obj4);
                        }
                    };
                    mutableState22 = mutableState411111111112;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue32);
                } else {
                    managedActivityResultLauncher = managedActivityResultLauncherRememberLauncherForActivityResult;
                    final MutableState mutableState411111111113 = mutableState22;
                    mutableState31 = mutableState30;
                    objRememberedValue32 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda26
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$94$lambda$93(context, gmsDocumentScanner, managedActivityResultLauncherRememberLauncherForActivityResult3, managedActivityResultLauncher, managedActivityResultLauncherRememberLauncherForActivityResult2, mutableState31, mutableState411111111113, (Map) obj4);
                        }
                    };
                    mutableState22 = mutableState411111111113;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue32);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                final ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult110 = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestMultiplePermissions11, (Function1) objRememberedValue32, composerStartRestartGroup, 0);
                Function2<Composer, Integer, Unit> function2M231getLambda$2075333601$app11 = ComposableSingletons$CameraScreenKt.INSTANCE.m231getLambda$2075333601$app();
                final Context context1113 = context;
                final ManagedActivityResultLauncher managedActivityResultLauncher12 = managedActivityResultLauncher;
                final MutableState mutableState411111111114 = mutableState22;
                final MutableState mutableState411111111115 = mutableState31;
                final MutableState mutableState411111111116 = mutableState23;
                final MutableState mutableState411111111117 = mutableState10;
                final MutableState mutableState411111111118 = mutableState;
                final MutableState mutableState411111111119 = mutableState18;
                final MutableState mutableState4218 = mutableState19;
                final MutableState mutableState4219 = mutableState25;
                final MutableState mutableState51111111111 = mutableState21;
                final MutableState mutableState51111111112 = mutableState26;
                final MutableState mutableState51111111113 = mutableState4;
                final MutableState mutableState51111111114 = mutableState16;
                final MutableState mutableState51111111115 = mutableState11;
                String str16 = str3;
                final MutableState mutableState51111111116 = mutableState15;
                final MutableState mutableState51111111117 = mutableState5;
                final MutableState mutableState51111111118 = mutableState17;
                final MutableState mutableState51111111119 = mutableState3;
                Function3 function1113 = new Function3() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda27
                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                        return CameraScreenKt.CameraScreen$lambda$170(managedActivityResultLauncherRememberLauncherForActivityResult110, context1113, managedActivityResultLauncher12, managedActivityResultLauncherRememberLauncherForActivityResult2, managedActivityResultLauncherRememberLauncherForActivityResult19, function16, mutableState27, mutableState411111111115, mutableState51111111112, mutableState411111111114, mutableState411111111116, mutableState4219, mutableState411111111119, mutableState4218, mutableState411111111117, mutableState411111111118, mutableState3126, coroutineScope, mutableState329, mutableState51111111111, mutableState2, mutableState51111111114, mutableState51111111118, mutableState51111111117, mutableState51111111115, mutableState51111111119, mutableState51111111113, mutableState24, mutableState51111111116, mutableState13, mutableState3127, mutableState328, (PaddingValues) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                    }
                };
                composer2 = composerStartRestartGroup;
                Modifier modifier15 = modifier3;
                ScaffoldKt.Scaffold-TvnljyQ(modifier15, function2M231getLambda$2075333601$app11, (Function2) null, (Function2) null, (Function2) null, 0, 0L, 0L, (WindowInsets) null, ComposableLambdaKt.rememberComposableLambda(349314036, true, function1113, composer2, 54), composer2, ((i6 >> 3) & 14) | 805306416, 508);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier15;
                str5 = str16;
            } else {
                i6 = i3;
            }
            mutableState29 = mutableState28;
            final MutableState mutableState524 = mutableState25;
            final MutableState mutableState6115 = mutableState24;
            final MutableState mutableState6116 = mutableState23;
            final MutableState mutableState6117 = mutableState22;
            final MutableState mutableState6118 = mutableState26;
            final MutableState mutableState6119 = mutableState27;
            obj2 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda23
                public final Object invoke(Object obj4) {
                    return CameraScreenKt.CameraScreen$lambda$84$lambda$83(mutableState29, context, coroutineScope, mutableState6119, mutableState6118, mutableState6117, mutableState7, mutableState6116, mutableState6115, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState524, mutableState11, mutableState21, mutableState3, ((Boolean) obj4).booleanValue());
                }
            };
            context = context;
            coroutineScope = coroutineScope;
            mutableState27 = mutableState6119;
            mutableState26 = mutableState6118;
            mutableState22 = mutableState6117;
            mutableState7 = mutableState7;
            mutableState23 = mutableState6116;
            mutableState24 = mutableState6115;
            mutableState15 = mutableState15;
            mutableState13 = mutableState13;
            mutableState10 = mutableState10;
            mutableState = mutableState;
            mutableState2 = mutableState2;
            mutableState4 = mutableState4;
            mutableState5 = mutableState5;
            mutableState16 = mutableState16;
            mutableState17 = mutableState17;
            mutableState18 = mutableState18;
            mutableState19 = mutableState19;
            mutableState25 = mutableState524;
            mutableState11 = mutableState11;
            mutableState21 = mutableState21;
            mutableState3 = mutableState3;
            composerStartRestartGroup.updateRememberedValue(obj2);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(takePicture6, (Function1) obj2, composerStartRestartGroup, 0);
            ActivityResultContract takePicturePreview12 = new ActivityResultContracts.TakePicturePreview();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416284152, str4);
            zChangedInstance3 = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(context);
            mutableState30 = mutableState29;
            objRememberedValue31 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance3) {
                final MutableState mutableState31111111112 = mutableState23;
                final Context context1114 = context;
                final CoroutineScope coroutineScope113 = coroutineScope;
                final MutableState mutableState31111111113 = mutableState27;
                final MutableState mutableState31111111114 = mutableState26;
                final MutableState mutableState31111111115 = mutableState22;
                final MutableState mutableState4111111111110 = mutableState7;
                Function1 function1114 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda24
                    public final Object invoke(Object obj4) {
                        return CameraScreenKt.CameraScreen$lambda$86$lambda$85(coroutineScope113, mutableState31111111113, mutableState31111111114, mutableState31111111115, mutableState4111111111110, mutableState31111111112, context1114, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (Bitmap) obj4);
                    }
                };
                coroutineScope = coroutineScope113;
                context = context1114;
                mutableState23 = mutableState31111111112;
                mutableState7 = mutableState4111111111110;
                mutableState22 = mutableState31111111115;
                mutableState26 = mutableState31111111114;
                mutableState27 = mutableState31111111113;
                composerStartRestartGroup.updateRememberedValue(function1114);
                objRememberedValue31 = function1114;
            } else {
                final MutableState mutableState31111111116 = mutableState23;
                final Context context1115 = context;
                final CoroutineScope coroutineScope114 = coroutineScope;
                final MutableState mutableState31111111117 = mutableState27;
                final MutableState mutableState31111111118 = mutableState26;
                final MutableState mutableState31111111119 = mutableState22;
                final MutableState mutableState4111111111111 = mutableState7;
                Function1 function1115 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda24
                    public final Object invoke(Object obj4) {
                        return CameraScreenKt.CameraScreen$lambda$86$lambda$85(coroutineScope114, mutableState31111111117, mutableState31111111118, mutableState31111111119, mutableState4111111111111, mutableState31111111116, context1115, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (Bitmap) obj4);
                    }
                };
                coroutineScope = coroutineScope114;
                context = context1115;
                mutableState23 = mutableState31111111116;
                mutableState7 = mutableState4111111111111;
                mutableState22 = mutableState31111111119;
                mutableState26 = mutableState31111111118;
                mutableState27 = mutableState31111111117;
                composerStartRestartGroup.updateRememberedValue(function1115);
                objRememberedValue31 = function1115;
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            managedActivityResultLauncherRememberLauncherForActivityResult2 = ActivityResultRegistryKt.rememberLauncherForActivityResult(takePicturePreview12, (Function1) objRememberedValue31, composerStartRestartGroup, 0);
            ActivityResultContract startIntentSenderForResult12 = new ActivityResultContracts.StartIntentSenderForResult();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416256388, str4);
            zChangedInstance4 = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
            Object objRememberedValue3110 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance4) {
                obj3 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda25
                    public final Object invoke(Object obj4) {
                        return CameraScreenKt.CameraScreen$lambda$89$lambda$88(context, coroutineScope, mutableState27, mutableState26, mutableState22, mutableState7, mutableState23, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (ActivityResult) obj4);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(obj3);
            } else {
                obj3 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda25
                    public final Object invoke(Object obj4) {
                        return CameraScreenKt.CameraScreen$lambda$89$lambda$88(context, coroutineScope, mutableState27, mutableState26, mutableState22, mutableState7, mutableState23, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (ActivityResult) obj4);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(obj3);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            managedActivityResultLauncherRememberLauncherForActivityResult3 = ActivityResultRegistryKt.rememberLauncherForActivityResult(startIntentSenderForResult12, (Function1) obj3, composerStartRestartGroup, 0);
            ActivityResultContract requestMultiplePermissions12 = new ActivityResultContracts.RequestMultiplePermissions();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416233721, str4);
            zChangedInstance5 = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(gmsDocumentScanner) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult3) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult2);
            objRememberedValue32 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance5) {
                managedActivityResultLauncher = managedActivityResultLauncherRememberLauncherForActivityResult;
                final MutableState mutableState4111111111112 = mutableState22;
                mutableState31 = mutableState30;
                objRememberedValue32 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda26
                    public final Object invoke(Object obj4) {
                        return CameraScreenKt.CameraScreen$lambda$94$lambda$93(context, gmsDocumentScanner, managedActivityResultLauncherRememberLauncherForActivityResult3, managedActivityResultLauncher, managedActivityResultLauncherRememberLauncherForActivityResult2, mutableState31, mutableState4111111111112, (Map) obj4);
                    }
                };
                mutableState22 = mutableState4111111111112;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue32);
            } else {
                managedActivityResultLauncher = managedActivityResultLauncherRememberLauncherForActivityResult;
                final MutableState mutableState4111111111113 = mutableState22;
                mutableState31 = mutableState30;
                objRememberedValue32 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda26
                    public final Object invoke(Object obj4) {
                        return CameraScreenKt.CameraScreen$lambda$94$lambda$93(context, gmsDocumentScanner, managedActivityResultLauncherRememberLauncherForActivityResult3, managedActivityResultLauncher, managedActivityResultLauncherRememberLauncherForActivityResult2, mutableState31, mutableState4111111111113, (Map) obj4);
                    }
                };
                mutableState22 = mutableState4111111111113;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue32);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult111 = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestMultiplePermissions12, (Function1) objRememberedValue32, composerStartRestartGroup, 0);
            Function2<Composer, Integer, Unit> function2M231getLambda$2075333601$app12 = ComposableSingletons$CameraScreenKt.INSTANCE.m231getLambda$2075333601$app();
            final Context context1116 = context;
            final ManagedActivityResultLauncher managedActivityResultLauncher13 = managedActivityResultLauncher;
            final MutableState mutableState4111111111114 = mutableState22;
            final MutableState mutableState4111111111115 = mutableState31;
            final MutableState mutableState4111111111116 = mutableState23;
            final MutableState mutableState4111111111117 = mutableState10;
            final MutableState mutableState4111111111118 = mutableState;
            final MutableState mutableState4111111111119 = mutableState18;
            final MutableState mutableState42110 = mutableState19;
            final MutableState mutableState42111 = mutableState25;
            final MutableState mutableState511111111110 = mutableState21;
            final MutableState mutableState511111111111 = mutableState26;
            final MutableState mutableState511111111112 = mutableState4;
            final MutableState mutableState511111111113 = mutableState16;
            final MutableState mutableState511111111114 = mutableState11;
            String str17 = str3;
            final MutableState mutableState511111111115 = mutableState15;
            final MutableState mutableState511111111116 = mutableState5;
            final MutableState mutableState511111111117 = mutableState17;
            final MutableState mutableState511111111118 = mutableState3;
            Function3 function1116 = new Function3() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda27
                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                    return CameraScreenKt.CameraScreen$lambda$170(managedActivityResultLauncherRememberLauncherForActivityResult111, context1116, managedActivityResultLauncher13, managedActivityResultLauncherRememberLauncherForActivityResult2, managedActivityResultLauncherRememberLauncherForActivityResult19, function16, mutableState27, mutableState4111111111115, mutableState511111111111, mutableState4111111111114, mutableState4111111111116, mutableState42111, mutableState4111111111119, mutableState42110, mutableState4111111111117, mutableState4111111111118, mutableState3126, coroutineScope, mutableState329, mutableState511111111110, mutableState2, mutableState511111111113, mutableState511111111117, mutableState511111111116, mutableState511111111114, mutableState511111111118, mutableState511111111112, mutableState24, mutableState511111111115, mutableState13, mutableState3127, mutableState328, (PaddingValues) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                }
            };
            composer2 = composerStartRestartGroup;
            Modifier modifier16 = modifier3;
            ScaffoldKt.Scaffold-TvnljyQ(modifier16, function2M231getLambda$2075333601$app12, (Function2) null, (Function2) null, (Function2) null, 0, 0L, 0L, (WindowInsets) null, ComposableLambdaKt.rememberComposableLambda(349314036, true, function1116, composer2, 54), composer2, ((i6 >> 3) & 14) | 805306416, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier16;
            str5 = str17;
        } else {
            if (i7 != 0) {
                modifier3 = (Modifier) Modifier.Companion;
            } else {
                modifier3 = modifier2;
            }
            if (i4 != 0) {
                str3 = "";
            } else {
                str3 = str2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-287508125, i3, -1, "com.example.ui.screens.CameraScreen (CameraScreen.kt:86)");
            }
            CompositionLocal localContext7 = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume7 = composerStartRestartGroup.consume(localContext7);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            context = (Context) objConsume7;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller7 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller7);
                objRememberedValue = compositionScopedCoroutineScopeCanceller7;
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417382302, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            mutableState = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417380702, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            mutableState2 = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417379002, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt.mutableStateOf$default("Good", (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            mutableState3 = (MutableState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417376958, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            mutableState4 = (MutableState) objRememberedValue5;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417375390, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == Composer.Companion.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            mutableState5 = (MutableState) objRememberedValue6;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417373659, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == Composer.Companion.getEmpty()) {
                objRememberedValue7 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            mutableState6 = (MutableState) objRememberedValue7;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417371603, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == Composer.Companion.getEmpty()) {
                objRememberedValue8 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            mutableState7 = (MutableState) objRememberedValue8;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417369555, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue9 == Composer.Companion.getEmpty()) {
                objRememberedValue9 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            mutableState8 = (MutableState) objRememberedValue9;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417367379, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue10 == Composer.Companion.getEmpty()) {
                objRememberedValue10 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            mutableState9 = (MutableState) objRememberedValue10;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417365235, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue11 == Composer.Companion.getEmpty()) {
                objRememberedValue11 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
            }
            mutableState10 = (MutableState) objRememberedValue11;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417362963, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue12 == Composer.Companion.getEmpty()) {
                objRememberedValue12 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
            }
            mutableState11 = (MutableState) objRememberedValue12;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417360443, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue13 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue13 == Composer.Companion.getEmpty()) {
                objRememberedValue13 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
            }
            mutableState12 = (MutableState) objRememberedValue13;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417358363, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue14 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue14 == Composer.Companion.getEmpty()) {
                objRememberedValue14 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
            }
            final MutableState mutableState3128 = (MutableState) objRememberedValue14;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417355326, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue15 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue15 == Composer.Companion.getEmpty()) {
                objRememberedValue15 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
            }
            mutableState13 = (MutableState) objRememberedValue15;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417353517, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue16 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue16 == Composer.Companion.getEmpty()) {
                objRememberedValue16 = SnapshotStateKt.mutableStateOf$default(str3, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue16);
            }
            final MutableState mutableState3129 = (MutableState) objRememberedValue16;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417351358, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue17 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue17 == Composer.Companion.getEmpty()) {
                objRememberedValue17 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue17);
            }
            final MutableState mutableState3210 = (MutableState) objRememberedValue17;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417349683, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue18 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue18 == Composer.Companion.getEmpty()) {
                objRememberedValue18 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue18);
            }
            mutableState14 = (MutableState) objRememberedValue18;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417347635, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue19 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue19 == Composer.Companion.getEmpty()) {
                objRememberedValue19 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue19);
            }
            mutableState15 = (MutableState) objRememberedValue19;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417345587, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue20 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue20 == Composer.Companion.getEmpty()) {
                objRememberedValue20 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue20);
            }
            mutableState16 = (MutableState) objRememberedValue20;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417343411, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue21 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue21 == Composer.Companion.getEmpty()) {
                objRememberedValue21 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue21);
            }
            mutableState17 = (MutableState) objRememberedValue21;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417341366, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue22 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue22 == Composer.Companion.getEmpty()) {
                objRememberedValue22 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue22);
            }
            mutableState18 = (MutableState) objRememberedValue22;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417339443, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue23 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue23 == Composer.Companion.getEmpty()) {
                objRememberedValue23 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue23);
            }
            mutableState19 = (MutableState) objRememberedValue23;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417337267, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue24 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue24 == Composer.Companion.getEmpty()) {
                objRememberedValue24 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue24);
            }
            mutableState20 = (MutableState) objRememberedValue24;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417334707, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue25 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue25 == Composer.Companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default7 = SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default7);
                objRememberedValue25 = mutableStateMutableStateOf$default7;
            }
            mutableState21 = (MutableState) objRememberedValue25;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1417331259, "CC(remember):CameraScreen.kt#9igjgp");
            objRememberedValue26 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue26 == Composer.Companion.getEmpty()) {
                objRememberedValue26 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue26);
            }
            final MutableState mutableState3211 = (MutableState) objRememberedValue26;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ActivityResultContract getContent7 = new ActivityResultContracts.GetContent();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416328187, "CC(remember):CameraScreen.kt#9igjgp");
            zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
            Object objRememberedValue3111 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                str4 = "CC(remember):CameraScreen.kt#9igjgp";
                mutableState22 = mutableState8;
                mutableState23 = mutableState12;
                mutableState24 = mutableState14;
                mutableState25 = mutableState20;
                mutableState26 = mutableState6;
                mutableState27 = mutableState9;
                obj = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda21
                    public final Object invoke(Object obj4) {
                        return CameraScreenKt.CameraScreen$lambda$76$lambda$75(context, coroutineScope, mutableState27, mutableState26, mutableState22, mutableState7, mutableState23, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (Uri) obj4);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                str4 = "CC(remember):CameraScreen.kt#9igjgp";
                mutableState22 = mutableState8;
                mutableState23 = mutableState12;
                mutableState24 = mutableState14;
                mutableState25 = mutableState20;
                mutableState26 = mutableState6;
                mutableState27 = mutableState9;
                obj = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda21
                    public final Object invoke(Object obj4) {
                        return CameraScreenKt.CameraScreen$lambda$76$lambda$75(context, coroutineScope, mutableState27, mutableState26, mutableState22, mutableState7, mutableState23, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (Uri) obj4);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(obj);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult112 = ActivityResultRegistryKt.rememberLauncherForActivityResult(getContent7, (Function1) obj, composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416317091, str4);
            objRememberedValue27 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue27 == Composer.Companion.getEmpty()) {
                objRememberedValue27 = new GmsDocumentScannerOptions.Builder().setGalleryImportAllowed(true).setPageLimit(1).setResultFormats(101, new int[0]).setScannerMode(1).build();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue27);
            }
            gmsDocumentScannerOptions = (GmsDocumentScannerOptions) objRememberedValue27;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Intrinsics.checkNotNull(gmsDocumentScannerOptions);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416308675, str4);
            objRememberedValue28 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue28 == Composer.Companion.getEmpty()) {
                objRememberedValue28 = GmsDocumentScanning.getClient(gmsDocumentScannerOptions);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue28);
            }
            gmsDocumentScanner = (GmsDocumentScanner) objRememberedValue28;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Intrinsics.checkNotNull(gmsDocumentScanner);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416305814, str4);
            objRememberedValue29 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue29 == Composer.Companion.getEmpty()) {
                objRememberedValue29 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue29);
            }
            mutableState28 = (MutableState) objRememberedValue29;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ActivityResultContract takePicture7 = new ActivityResultContracts.TakePicture();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416300466, str4);
            zChangedInstance2 = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
            objRememberedValue30 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2) {
                i6 = i3;
                if (objRememberedValue30 != Composer.Companion.getEmpty()) {
                    obj2 = objRememberedValue30;
                    mutableState29 = mutableState28;
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(takePicture7, (Function1) obj2, composerStartRestartGroup, 0);
                ActivityResultContract takePicturePreview13 = new ActivityResultContracts.TakePicturePreview();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416284152, str4);
                zChangedInstance3 = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(context);
                mutableState30 = mutableState29;
                objRememberedValue31 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance3) {
                    final MutableState mutableState311111111110 = mutableState23;
                    final Context context1117 = context;
                    final CoroutineScope coroutineScope115 = coroutineScope;
                    final MutableState mutableState311111111111 = mutableState27;
                    final MutableState mutableState311111111112 = mutableState26;
                    final MutableState mutableState311111111113 = mutableState22;
                    final MutableState mutableState41111111111110 = mutableState7;
                    Function1 function1117 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda24
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$86$lambda$85(coroutineScope115, mutableState311111111111, mutableState311111111112, mutableState311111111113, mutableState41111111111110, mutableState311111111110, context1117, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (Bitmap) obj4);
                        }
                    };
                    coroutineScope = coroutineScope115;
                    context = context1117;
                    mutableState23 = mutableState311111111110;
                    mutableState7 = mutableState41111111111110;
                    mutableState22 = mutableState311111111113;
                    mutableState26 = mutableState311111111112;
                    mutableState27 = mutableState311111111111;
                    composerStartRestartGroup.updateRememberedValue(function1117);
                    objRememberedValue31 = function1117;
                } else {
                    final MutableState mutableState311111111114 = mutableState23;
                    final Context context1118 = context;
                    final CoroutineScope coroutineScope116 = coroutineScope;
                    final MutableState mutableState311111111115 = mutableState27;
                    final MutableState mutableState311111111116 = mutableState26;
                    final MutableState mutableState311111111117 = mutableState22;
                    final MutableState mutableState41111111111111 = mutableState7;
                    Function1 function1118 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda24
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$86$lambda$85(coroutineScope116, mutableState311111111115, mutableState311111111116, mutableState311111111117, mutableState41111111111111, mutableState311111111114, context1118, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (Bitmap) obj4);
                        }
                    };
                    coroutineScope = coroutineScope116;
                    context = context1118;
                    mutableState23 = mutableState311111111114;
                    mutableState7 = mutableState41111111111111;
                    mutableState22 = mutableState311111111117;
                    mutableState26 = mutableState311111111116;
                    mutableState27 = mutableState311111111115;
                    composerStartRestartGroup.updateRememberedValue(function1118);
                    objRememberedValue31 = function1118;
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                managedActivityResultLauncherRememberLauncherForActivityResult2 = ActivityResultRegistryKt.rememberLauncherForActivityResult(takePicturePreview13, (Function1) objRememberedValue31, composerStartRestartGroup, 0);
                ActivityResultContract startIntentSenderForResult13 = new ActivityResultContracts.StartIntentSenderForResult();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416256388, str4);
                zChangedInstance4 = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
                Object objRememberedValue3112 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance4) {
                    obj3 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda25
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$89$lambda$88(context, coroutineScope, mutableState27, mutableState26, mutableState22, mutableState7, mutableState23, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (ActivityResult) obj4);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(obj3);
                } else {
                    obj3 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda25
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$89$lambda$88(context, coroutineScope, mutableState27, mutableState26, mutableState22, mutableState7, mutableState23, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (ActivityResult) obj4);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(obj3);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                managedActivityResultLauncherRememberLauncherForActivityResult3 = ActivityResultRegistryKt.rememberLauncherForActivityResult(startIntentSenderForResult13, (Function1) obj3, composerStartRestartGroup, 0);
                ActivityResultContract requestMultiplePermissions13 = new ActivityResultContracts.RequestMultiplePermissions();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416233721, str4);
                zChangedInstance5 = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(gmsDocumentScanner) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult3) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult2);
                objRememberedValue32 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance5) {
                    managedActivityResultLauncher = managedActivityResultLauncherRememberLauncherForActivityResult;
                    final MutableState mutableState41111111111112 = mutableState22;
                    mutableState31 = mutableState30;
                    objRememberedValue32 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda26
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$94$lambda$93(context, gmsDocumentScanner, managedActivityResultLauncherRememberLauncherForActivityResult3, managedActivityResultLauncher, managedActivityResultLauncherRememberLauncherForActivityResult2, mutableState31, mutableState41111111111112, (Map) obj4);
                        }
                    };
                    mutableState22 = mutableState41111111111112;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue32);
                } else {
                    managedActivityResultLauncher = managedActivityResultLauncherRememberLauncherForActivityResult;
                    final MutableState mutableState41111111111113 = mutableState22;
                    mutableState31 = mutableState30;
                    objRememberedValue32 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda26
                        public final Object invoke(Object obj4) {
                            return CameraScreenKt.CameraScreen$lambda$94$lambda$93(context, gmsDocumentScanner, managedActivityResultLauncherRememberLauncherForActivityResult3, managedActivityResultLauncher, managedActivityResultLauncherRememberLauncherForActivityResult2, mutableState31, mutableState41111111111113, (Map) obj4);
                        }
                    };
                    mutableState22 = mutableState41111111111113;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue32);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                final ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult113 = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestMultiplePermissions13, (Function1) objRememberedValue32, composerStartRestartGroup, 0);
                Function2<Composer, Integer, Unit> function2M231getLambda$2075333601$app13 = ComposableSingletons$CameraScreenKt.INSTANCE.m231getLambda$2075333601$app();
                final Context context1119 = context;
                final ManagedActivityResultLauncher managedActivityResultLauncher14 = managedActivityResultLauncher;
                final MutableState mutableState41111111111114 = mutableState22;
                final MutableState mutableState41111111111115 = mutableState31;
                final MutableState mutableState41111111111116 = mutableState23;
                final MutableState mutableState41111111111117 = mutableState10;
                final MutableState mutableState41111111111118 = mutableState;
                final MutableState mutableState41111111111119 = mutableState18;
                final MutableState mutableState42112 = mutableState19;
                final MutableState mutableState42113 = mutableState25;
                final MutableState mutableState511111111119 = mutableState21;
                final MutableState mutableState5111111111110 = mutableState26;
                final MutableState mutableState5111111111111 = mutableState4;
                final MutableState mutableState5111111111112 = mutableState16;
                final MutableState mutableState5111111111113 = mutableState11;
                String str18 = str3;
                final MutableState mutableState5111111111114 = mutableState15;
                final MutableState mutableState5111111111115 = mutableState5;
                final MutableState mutableState5111111111116 = mutableState17;
                final MutableState mutableState5111111111117 = mutableState3;
                Function3 function1119 = new Function3() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda27
                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                        return CameraScreenKt.CameraScreen$lambda$170(managedActivityResultLauncherRememberLauncherForActivityResult113, context1119, managedActivityResultLauncher14, managedActivityResultLauncherRememberLauncherForActivityResult2, managedActivityResultLauncherRememberLauncherForActivityResult112, function16, mutableState27, mutableState41111111111115, mutableState5111111111110, mutableState41111111111114, mutableState41111111111116, mutableState42113, mutableState41111111111119, mutableState42112, mutableState41111111111117, mutableState41111111111118, mutableState3128, coroutineScope, mutableState3211, mutableState511111111119, mutableState2, mutableState5111111111112, mutableState5111111111116, mutableState5111111111115, mutableState5111111111113, mutableState5111111111117, mutableState5111111111111, mutableState24, mutableState5111111111114, mutableState13, mutableState3129, mutableState3210, (PaddingValues) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                    }
                };
                composer2 = composerStartRestartGroup;
                Modifier modifier17 = modifier3;
                ScaffoldKt.Scaffold-TvnljyQ(modifier17, function2M231getLambda$2075333601$app13, (Function2) null, (Function2) null, (Function2) null, 0, 0L, 0L, (WindowInsets) null, ComposableLambdaKt.rememberComposableLambda(349314036, true, function1119, composer2, 54), composer2, ((i6 >> 3) & 14) | 805306416, 508);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier17;
                str5 = str18;
            } else {
                i6 = i3;
            }
            mutableState29 = mutableState28;
            final MutableState mutableState525 = mutableState25;
            final MutableState mutableState61110 = mutableState24;
            final MutableState mutableState61111 = mutableState23;
            final MutableState mutableState61112 = mutableState22;
            final MutableState mutableState61113 = mutableState26;
            final MutableState mutableState61114 = mutableState27;
            obj2 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda23
                public final Object invoke(Object obj4) {
                    return CameraScreenKt.CameraScreen$lambda$84$lambda$83(mutableState29, context, coroutineScope, mutableState61114, mutableState61113, mutableState61112, mutableState7, mutableState61111, mutableState61110, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState525, mutableState11, mutableState21, mutableState3, ((Boolean) obj4).booleanValue());
                }
            };
            context = context;
            coroutineScope = coroutineScope;
            mutableState27 = mutableState61114;
            mutableState26 = mutableState61113;
            mutableState22 = mutableState61112;
            mutableState7 = mutableState7;
            mutableState23 = mutableState61111;
            mutableState24 = mutableState61110;
            mutableState15 = mutableState15;
            mutableState13 = mutableState13;
            mutableState10 = mutableState10;
            mutableState = mutableState;
            mutableState2 = mutableState2;
            mutableState4 = mutableState4;
            mutableState5 = mutableState5;
            mutableState16 = mutableState16;
            mutableState17 = mutableState17;
            mutableState18 = mutableState18;
            mutableState19 = mutableState19;
            mutableState25 = mutableState525;
            mutableState11 = mutableState11;
            mutableState21 = mutableState21;
            mutableState3 = mutableState3;
            composerStartRestartGroup.updateRememberedValue(obj2);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(takePicture7, (Function1) obj2, composerStartRestartGroup, 0);
            ActivityResultContract takePicturePreview14 = new ActivityResultContracts.TakePicturePreview();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416284152, str4);
            zChangedInstance3 = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(context);
            mutableState30 = mutableState29;
            objRememberedValue31 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance3) {
                final MutableState mutableState311111111118 = mutableState23;
                final Context context11110 = context;
                final CoroutineScope coroutineScope117 = coroutineScope;
                final MutableState mutableState311111111119 = mutableState27;
                final MutableState mutableState3111111111110 = mutableState26;
                final MutableState mutableState3111111111111 = mutableState22;
                final MutableState mutableState411111111111110 = mutableState7;
                Function1 function11110 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda24
                    public final Object invoke(Object obj4) {
                        return CameraScreenKt.CameraScreen$lambda$86$lambda$85(coroutineScope117, mutableState311111111119, mutableState3111111111110, mutableState3111111111111, mutableState411111111111110, mutableState311111111118, context11110, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (Bitmap) obj4);
                    }
                };
                coroutineScope = coroutineScope117;
                context = context11110;
                mutableState23 = mutableState311111111118;
                mutableState7 = mutableState411111111111110;
                mutableState22 = mutableState3111111111111;
                mutableState26 = mutableState3111111111110;
                mutableState27 = mutableState311111111119;
                composerStartRestartGroup.updateRememberedValue(function11110);
                objRememberedValue31 = function11110;
            } else {
                final MutableState mutableState3111111111112 = mutableState23;
                final Context context11111 = context;
                final CoroutineScope coroutineScope118 = coroutineScope;
                final MutableState mutableState3111111111113 = mutableState27;
                final MutableState mutableState3111111111114 = mutableState26;
                final MutableState mutableState3111111111115 = mutableState22;
                final MutableState mutableState411111111111111 = mutableState7;
                Function1 function11111 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda24
                    public final Object invoke(Object obj4) {
                        return CameraScreenKt.CameraScreen$lambda$86$lambda$85(coroutineScope118, mutableState3111111111113, mutableState3111111111114, mutableState3111111111115, mutableState411111111111111, mutableState3111111111112, context11111, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (Bitmap) obj4);
                    }
                };
                coroutineScope = coroutineScope118;
                context = context11111;
                mutableState23 = mutableState3111111111112;
                mutableState7 = mutableState411111111111111;
                mutableState22 = mutableState3111111111115;
                mutableState26 = mutableState3111111111114;
                mutableState27 = mutableState3111111111113;
                composerStartRestartGroup.updateRememberedValue(function11111);
                objRememberedValue31 = function11111;
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            managedActivityResultLauncherRememberLauncherForActivityResult2 = ActivityResultRegistryKt.rememberLauncherForActivityResult(takePicturePreview14, (Function1) objRememberedValue31, composerStartRestartGroup, 0);
            ActivityResultContract startIntentSenderForResult14 = new ActivityResultContracts.StartIntentSenderForResult();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416256388, str4);
            zChangedInstance4 = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
            Object objRememberedValue3113 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance4) {
                obj3 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda25
                    public final Object invoke(Object obj4) {
                        return CameraScreenKt.CameraScreen$lambda$89$lambda$88(context, coroutineScope, mutableState27, mutableState26, mutableState22, mutableState7, mutableState23, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (ActivityResult) obj4);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(obj3);
            } else {
                obj3 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda25
                    public final Object invoke(Object obj4) {
                        return CameraScreenKt.CameraScreen$lambda$89$lambda$88(context, coroutineScope, mutableState27, mutableState26, mutableState22, mutableState7, mutableState23, mutableState24, mutableState15, mutableState13, mutableState10, mutableState, mutableState2, mutableState4, mutableState5, mutableState16, mutableState17, mutableState18, mutableState19, mutableState25, mutableState11, mutableState21, mutableState3, (ActivityResult) obj4);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(obj3);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            managedActivityResultLauncherRememberLauncherForActivityResult3 = ActivityResultRegistryKt.rememberLauncherForActivityResult(startIntentSenderForResult14, (Function1) obj3, composerStartRestartGroup, 0);
            ActivityResultContract requestMultiplePermissions14 = new ActivityResultContracts.RequestMultiplePermissions();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416233721, str4);
            zChangedInstance5 = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(gmsDocumentScanner) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult3) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult2);
            objRememberedValue32 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance5) {
                managedActivityResultLauncher = managedActivityResultLauncherRememberLauncherForActivityResult;
                final MutableState mutableState411111111111112 = mutableState22;
                mutableState31 = mutableState30;
                objRememberedValue32 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda26
                    public final Object invoke(Object obj4) {
                        return CameraScreenKt.CameraScreen$lambda$94$lambda$93(context, gmsDocumentScanner, managedActivityResultLauncherRememberLauncherForActivityResult3, managedActivityResultLauncher, managedActivityResultLauncherRememberLauncherForActivityResult2, mutableState31, mutableState411111111111112, (Map) obj4);
                    }
                };
                mutableState22 = mutableState411111111111112;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue32);
            } else {
                managedActivityResultLauncher = managedActivityResultLauncherRememberLauncherForActivityResult;
                final MutableState mutableState411111111111113 = mutableState22;
                mutableState31 = mutableState30;
                objRememberedValue32 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda26
                    public final Object invoke(Object obj4) {
                        return CameraScreenKt.CameraScreen$lambda$94$lambda$93(context, gmsDocumentScanner, managedActivityResultLauncherRememberLauncherForActivityResult3, managedActivityResultLauncher, managedActivityResultLauncherRememberLauncherForActivityResult2, mutableState31, mutableState411111111111113, (Map) obj4);
                    }
                };
                mutableState22 = mutableState411111111111113;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue32);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult114 = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestMultiplePermissions14, (Function1) objRememberedValue32, composerStartRestartGroup, 0);
            Function2<Composer, Integer, Unit> function2M231getLambda$2075333601$app14 = ComposableSingletons$CameraScreenKt.INSTANCE.m231getLambda$2075333601$app();
            final Context context11112 = context;
            final ManagedActivityResultLauncher managedActivityResultLauncher15 = managedActivityResultLauncher;
            final MutableState mutableState411111111111114 = mutableState22;
            final MutableState mutableState411111111111115 = mutableState31;
            final MutableState mutableState411111111111116 = mutableState23;
            final MutableState mutableState411111111111117 = mutableState10;
            final MutableState mutableState411111111111118 = mutableState;
            final MutableState mutableState411111111111119 = mutableState18;
            final MutableState mutableState42114 = mutableState19;
            final MutableState mutableState42115 = mutableState25;
            final MutableState mutableState5111111111118 = mutableState21;
            final MutableState mutableState5111111111119 = mutableState26;
            final MutableState mutableState51111111111110 = mutableState4;
            final MutableState mutableState51111111111111 = mutableState16;
            final MutableState mutableState51111111111112 = mutableState11;
            String str19 = str3;
            final MutableState mutableState51111111111113 = mutableState15;
            final MutableState mutableState51111111111114 = mutableState5;
            final MutableState mutableState51111111111115 = mutableState17;
            final MutableState mutableState51111111111116 = mutableState3;
            Function3 function11112 = new Function3() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda27
                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                    return CameraScreenKt.CameraScreen$lambda$170(managedActivityResultLauncherRememberLauncherForActivityResult114, context11112, managedActivityResultLauncher15, managedActivityResultLauncherRememberLauncherForActivityResult2, managedActivityResultLauncherRememberLauncherForActivityResult112, function16, mutableState27, mutableState411111111111115, mutableState5111111111119, mutableState411111111111114, mutableState411111111111116, mutableState42115, mutableState411111111111119, mutableState42114, mutableState411111111111117, mutableState411111111111118, mutableState3128, coroutineScope, mutableState3211, mutableState5111111111118, mutableState2, mutableState51111111111111, mutableState51111111111115, mutableState51111111111114, mutableState51111111111112, mutableState51111111111116, mutableState51111111111110, mutableState24, mutableState51111111111113, mutableState13, mutableState3129, mutableState3210, (PaddingValues) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                }
            };
            composer2 = composerStartRestartGroup;
            Modifier modifier18 = modifier3;
            ScaffoldKt.Scaffold-TvnljyQ(modifier18, function2M231getLambda$2075333601$app14, (Function2) null, (Function2) null, (Function2) null, 0, 0L, 0L, (WindowInsets) null, ComposableLambdaKt.rememberComposableLambda(349314036, true, function11112, composer2, 54), composer2, ((i6 >> 3) & 14) | 805306416, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier18;
            str5 = str19;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda28
                public final Object invoke(Object obj4, Object obj5) {
                    return CameraScreenKt.CameraScreen$lambda$171(function16, modifier4, str5, i, i2, (Composer) obj4, ((Integer) obj5).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String CameraScreen$lambda$1(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String CameraScreen$lambda$4(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String CameraScreen$lambda$7(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final String CameraScreen$lambda$10(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final String CameraScreen$lambda$13(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final boolean CameraScreen$lambda$16(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CameraScreen$lambda$17(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String CameraScreen$lambda$19(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final String CameraScreen$lambda$22(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final Bitmap CameraScreen$lambda$25(MutableState<Bitmap> mutableState) {
        return (Bitmap) ((State) mutableState).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String CameraScreen$lambda$28(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String CameraScreen$lambda$31(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final boolean CameraScreen$lambda$34(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CameraScreen$lambda$35(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean CameraScreen$lambda$37(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void CameraScreen$lambda$38(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String CameraScreen$lambda$40(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final String CameraScreen$lambda$43(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final String CameraScreen$lambda$46(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final Double CameraScreen$lambda$49(MutableState<Double> mutableState) {
        return (Double) ((State) mutableState).getValue();
    }

    private static final Double CameraScreen$lambda$52(MutableState<Double> mutableState) {
        return (Double) ((State) mutableState).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String CameraScreen$lambda$55(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String CameraScreen$lambda$58(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer CameraScreen$lambda$61(MutableState<Integer> mutableState) {
        return (Integer) ((State) mutableState).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String CameraScreen$lambda$64(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final Double CameraScreen$lambda$67(MutableState<Double> mutableState) {
        return (Double) ((State) mutableState).getValue();
    }

    private static final List<VolumeInfo> CameraScreen$lambda$70(MutableState<List<VolumeInfo>> mutableState) {
        return (List) ((State) mutableState).getValue();
    }

    private static final boolean CameraScreen$lambda$73(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CameraScreen$lambda$74(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final void CameraScreen$searchGoogleBooksManually(CoroutineScope coroutineScope, MutableState<Boolean> mutableState, MutableState<List<VolumeInfo>> mutableState2, String str) {
        if (StringsKt.isBlank(str)) {
            return;
        }
        CameraScreen$lambda$74(mutableState, true);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new CameraScreenKt$CameraScreen$searchGoogleBooksManually$1(str, mutableState2, mutableState, null), 3, (Object) null);
    }

    private static final void CameraScreen$processBitmapWithGemini(CoroutineScope coroutineScope, MutableState<Bitmap> mutableState, MutableState<Boolean> mutableState2, MutableState<String> mutableState3, MutableState<String> mutableState4, MutableState<Boolean> mutableState5, Context context, MutableState<Double> mutableState6, MutableState<Double> mutableState7, MutableState<String> mutableState8, MutableState<String> mutableState9, MutableState<String> mutableState10, MutableState<String> mutableState11, MutableState<String> mutableState12, MutableState<String> mutableState13, MutableState<String> mutableState14, MutableState<String> mutableState15, MutableState<Integer> mutableState16, MutableState<String> mutableState17, MutableState<Double> mutableState18, MutableState<String> mutableState19, MutableState<List<VolumeInfo>> mutableState20, MutableState<String> mutableState21, Bitmap bitmap) {
        mutableState.setValue(bitmap);
        CameraScreen$lambda$17(mutableState2, true);
        mutableState3.setValue(null);
        mutableState4.setValue("Analyzing book cover & barcode...");
        CameraScreen$lambda$35(mutableState5, false);
        BuildersKt.launch$default(coroutineScope, Dispatchers.getIO(), (CoroutineStart) null, new CameraScreenKt$CameraScreen$processBitmapWithGemini$1(context, mutableState6, mutableState7, mutableState8, null), 2, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new CameraScreenKt$CameraScreen$processBitmapWithGemini$2(bitmap, mutableState9, mutableState4, coroutineScope, mutableState10, mutableState11, mutableState12, mutableState13, mutableState14, mutableState15, mutableState16, mutableState17, mutableState18, mutableState19, mutableState20, mutableState5, mutableState2, mutableState21, mutableState3, null), 3, (Object) null);
    }

    static final Unit CameraScreen$lambda$76$lambda$75(Context context, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, MutableState mutableState12, MutableState mutableState13, MutableState mutableState14, MutableState mutableState15, MutableState mutableState16, MutableState mutableState17, MutableState mutableState18, MutableState mutableState19, MutableState mutableState20, MutableState mutableState21, Uri uri) {
        if (uri != null) {
            try {
                CameraScreen$processBitmapWithGemini(coroutineScope, mutableState, mutableState2, mutableState3, mutableState4, mutableState5, context, mutableState6, mutableState7, mutableState8, mutableState9, mutableState10, mutableState11, mutableState12, mutableState13, mutableState14, mutableState15, mutableState16, mutableState17, mutableState18, mutableState19, mutableState20, mutableState21, loadRotatedCorrectedBitmap(context, uri));
            } catch (Exception e) {
                mutableState3.setValue("Failed to load image from gallery: " + e.getMessage());
            }
        }
        return Unit.INSTANCE;
    }

    private static final Uri CameraScreen$lambda$80(MutableState<Uri> mutableState) {
        return (Uri) ((State) mutableState).getValue();
    }

    static final Unit CameraScreen$lambda$84$lambda$83(MutableState mutableState, Context context, CoroutineScope coroutineScope, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, MutableState mutableState12, MutableState mutableState13, MutableState mutableState14, MutableState mutableState15, MutableState mutableState16, MutableState mutableState17, MutableState mutableState18, MutableState mutableState19, MutableState mutableState20, MutableState mutableState21, MutableState mutableState22, boolean z) {
        Uri uriCameraScreen$lambda$80;
        if (z && (uriCameraScreen$lambda$80 = CameraScreen$lambda$80(mutableState)) != null) {
            try {
                CameraScreen$processBitmapWithGemini(coroutineScope, mutableState2, mutableState3, mutableState4, mutableState5, mutableState6, context, mutableState7, mutableState8, mutableState9, mutableState10, mutableState11, mutableState12, mutableState13, mutableState14, mutableState15, mutableState16, mutableState17, mutableState18, mutableState19, mutableState20, mutableState21, mutableState22, loadRotatedCorrectedBitmap(context, uriCameraScreen$lambda$80));
            } catch (Exception e) {
                mutableState4.setValue("Failed to load captured photo: " + e.getMessage());
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit CameraScreen$lambda$86$lambda$85(CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, Context context, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, MutableState mutableState12, MutableState mutableState13, MutableState mutableState14, MutableState mutableState15, MutableState mutableState16, MutableState mutableState17, MutableState mutableState18, MutableState mutableState19, MutableState mutableState20, MutableState mutableState21, Bitmap bitmap) {
        if (bitmap != null) {
            CameraScreen$processBitmapWithGemini(coroutineScope, mutableState, mutableState2, mutableState3, mutableState4, mutableState5, context, mutableState6, mutableState7, mutableState8, mutableState9, mutableState10, mutableState11, mutableState12, mutableState13, mutableState14, mutableState15, mutableState16, mutableState17, mutableState18, mutableState19, mutableState20, mutableState21, bitmap);
        }
        return Unit.INSTANCE;
    }

    private static final void CameraScreen$launchQuickPhoto(Context context, ManagedActivityResultLauncher<Uri, Boolean> managedActivityResultLauncher, ManagedActivityResultLauncher<Void, Bitmap> managedActivityResultLauncher2, MutableState<Uri> mutableState) {
        try {
            File fileCreateTempFile = File.createTempFile("book_scan_", ".jpg", context.getCacheDir());
            fileCreateTempFile.createNewFile();
            fileCreateTempFile.deleteOnExit();
            Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", fileCreateTempFile);
            mutableState.setValue(uriForFile);
            Intrinsics.checkNotNull(uriForFile);
            managedActivityResultLauncher.launch(uriForFile);
        } catch (Exception unused) {
            managedActivityResultLauncher2.launch((Object) null);
        }
    }

    static final Unit CameraScreen$lambda$89$lambda$88(Context context, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, MutableState mutableState12, MutableState mutableState13, MutableState mutableState14, MutableState mutableState15, MutableState mutableState16, MutableState mutableState17, MutableState mutableState18, MutableState mutableState19, MutableState mutableState20, MutableState mutableState21, ActivityResult activityResult) {
        List pages;
        GmsDocumentScanningResult.Page page;
        Intrinsics.checkNotNullParameter(activityResult, "result");
        if (activityResult.getResultCode() == -1) {
            GmsDocumentScanningResult gmsDocumentScanningResultFromActivityResultIntent = GmsDocumentScanningResult.fromActivityResultIntent(activityResult.getData());
            Uri imageUri = (gmsDocumentScanningResultFromActivityResultIntent == null || (pages = gmsDocumentScanningResultFromActivityResultIntent.getPages()) == null || (page = (GmsDocumentScanningResult.Page) CollectionsKt.firstOrNull(pages)) == null) ? null : page.getImageUri();
            if (imageUri != null) {
                try {
                    CameraScreen$processBitmapWithGemini(coroutineScope, mutableState, mutableState2, mutableState3, mutableState4, mutableState5, context, mutableState6, mutableState7, mutableState8, mutableState9, mutableState10, mutableState11, mutableState12, mutableState13, mutableState14, mutableState15, mutableState16, mutableState17, mutableState18, mutableState19, mutableState20, mutableState21, loadRotatedCorrectedBitmap(context, imageUri));
                } catch (Exception e) {
                    mutableState3.setValue("Failed to process scan: " + e.getMessage());
                }
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit CameraScreen$lambda$94$lambda$93(final Context context, GmsDocumentScanner gmsDocumentScanner, final ManagedActivityResultLauncher managedActivityResultLauncher, final ManagedActivityResultLauncher managedActivityResultLauncher2, final ManagedActivityResultLauncher managedActivityResultLauncher3, final MutableState mutableState, MutableState mutableState2, Map map) {
        Intrinsics.checkNotNullParameter(map, "permissions");
        if (Intrinsics.areEqual(map.get("android.permission.CAMERA"), true)) {
            Activity activityFindActivity = findActivity(context);
            if (activityFindActivity != null) {
                try {
                    Task startScanIntent = gmsDocumentScanner.getStartScanIntent(activityFindActivity);
                    final Function1 function1 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda6
                        public final Object invoke(Object obj) {
                            return CameraScreenKt.CameraScreen$lambda$94$lambda$93$lambda$90(managedActivityResultLauncher, (IntentSender) obj);
                        }
                    };
                    startScanIntent.addOnSuccessListener(new OnSuccessListener() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda7
                        public final void onSuccess(Object obj) {
                            function1.invoke(obj);
                        }
                    }).addOnFailureListener(new OnFailureListener() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda8
                        public final void onFailure(Exception exc) {
                            CameraScreenKt.CameraScreen$lambda$94$lambda$93$lambda$92(context, managedActivityResultLauncher2, managedActivityResultLauncher3, mutableState, exc);
                        }
                    });
                } catch (Exception scanErr) {
                    CameraScreen$launchQuickPhoto(context, managedActivityResultLauncher2, managedActivityResultLauncher3, mutableState);
                }
            }
        } else {
            mutableState2.setValue("Camera permission is required.");
        }
        return Unit.INSTANCE;
    }

    static final Unit CameraScreen$lambda$94$lambda$93$lambda$90(ManagedActivityResultLauncher managedActivityResultLauncher, IntentSender intentSender) {
        Intrinsics.checkNotNull(intentSender);
        managedActivityResultLauncher.launch(new IntentSenderRequest.Builder(intentSender).build());
        return Unit.INSTANCE;
    }

    static final void CameraScreen$lambda$94$lambda$93$lambda$92(Context context, ManagedActivityResultLauncher managedActivityResultLauncher, ManagedActivityResultLauncher managedActivityResultLauncher2, MutableState mutableState, Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "it");
        CameraScreen$launchQuickPhoto(context, managedActivityResultLauncher, managedActivityResultLauncher2, mutableState);
    }

    private static final void CameraScreen$launchCameraAndLocation(ManagedActivityResultLauncher<String[], Map<String, Boolean>> managedActivityResultLauncher) {
        managedActivityResultLauncher.launch(new String[]{"android.permission.CAMERA", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"});
    }

    static final Unit CameraScreen$lambda$170(final ManagedActivityResultLauncher managedActivityResultLauncher, final Context context, final ManagedActivityResultLauncher managedActivityResultLauncher2, final ManagedActivityResultLauncher managedActivityResultLauncher3, final ManagedActivityResultLauncher managedActivityResultLauncher4, final Function16 function16, final MutableState mutableState, final MutableState mutableState2, MutableState mutableState3, final MutableState mutableState4, final MutableState mutableState5, final MutableState mutableState6, final MutableState mutableState7, final MutableState mutableState8, final MutableState mutableState9, final MutableState mutableState10, final MutableState mutableState11, final CoroutineScope coroutineScope, final MutableState mutableState12, final MutableState mutableState13, final MutableState mutableState14, final MutableState mutableState15, final MutableState mutableState16, final MutableState mutableState17, final MutableState mutableState18, final MutableState mutableState19, final MutableState mutableState20, final MutableState mutableState21, final MutableState mutableState22, final MutableState mutableState23, final MutableState mutableState24, final MutableState mutableState25, PaddingValues paddingValues, Composer composer, int i) {
        int i2;
        String str;
        String str2;
        String str3;
        int i3;
        char c;
        String str4;
        int i4;
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(paddingValues, "innerPadding");
        ComposerKt.sourceInformation(composer2, "C726@41472L21,721@41298L29163:CameraScreen.kt#2thlc2");
        if ((i & 6) == 0) {
            i2 = i | (composer2.changed(paddingValues) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(349314036, i2, -1, "com.example.ui.screens.CameraScreen.<anonymous> (CameraScreen.kt:721)");
            }
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.padding-3ABfNKs(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null), paddingValues), Dp.constructor-impl(20.0f)), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, (FlingBehavior) null, false, 14, (Object) null);
            Arrangement.Vertical vertical = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(14.0f));
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(vertical, centerHorizontally, composer2, 54);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierVerticalScroll$default);
            Function0 constructor = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composer3 = Updater.constructor-impl(composer2);
            Updater.set-impl(composer3, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer3, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composer3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composer3.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.set-impl(composer3, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, -819651788, "C:CameraScreen.kt#2thlc2");
            if (CameraScreen$lambda$25(mutableState) != null) {
                composer2.startReplaceGroup(-816937925);
                ComposerKt.sourceInformation(composer2, "868@48723L11,868@48681L62,869@48790L38,870@48847L17136,865@48522L17461,1146@66017L40,1151@66292L11,1151@66250L62,1152@66359L38,1153@66416L2222,1148@66091L2547,1197@68672L41,1200@68785L1246,1199@68747L1614,1233@70395L42");
                if (CameraScreen$lambda$16(mutableState3)) {
                    composer2.startReplaceGroup(-817677616);
                    ComposerKt.sourceInformation(composer2, "794@44704L11,794@44662L71,792@44526L992");
                    str2 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                    str = "C88@4444L9:Column.kt#2w3rfo";
                    str3 = "CC(remember):CameraScreen.kt#9igjgp";
                    i3 = -861858568;
                    CardKt.Card(PaddingKt.padding-qDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), 0.0f, 0.0f, 0.0f, Dp.constructor-impl(16.0f), 7, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(16.0f)), CardDefaults.INSTANCE.cardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), 0L, 0L, 0L, composer, CardDefaults.$stable << 12, 14), (CardElevation) null, (BorderStroke) null, ComposableSingletons$CameraScreenKt.INSTANCE.m235getLambda$581009893$app(), composer, 196614, 24);
                    composer2 = composer;
                } else {
                    str = "C88@4444L9:Column.kt#2w3rfo";
                    str2 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                    str3 = "CC(remember):CameraScreen.kt#9igjgp";
                    i3 = -861858568;
                    composer2.startReplaceGroup(-861858568);
                }
                composer2.endReplaceGroup();
                if (CameraScreen$lambda$22(mutableState4) != null) {
                    composer2.startReplaceGroup(-816597638);
                    ComposerKt.sourceInformation(composer2, "811@45670L11,814@45866L731,810@45615L982");
                    c = '6';
                    SurfaceKt.Surface-T9BRK9s(PaddingKt.padding-qDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), 0.0f, 0.0f, 0.0f, Dp.constructor-impl(16.0f), 7, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getSecondaryContainer-0d7_KjU(), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(588531643, true, new Function2() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda15
                        public final Object invoke(Object obj, Object obj2) {
                            return CameraScreenKt.CameraScreen$lambda$170$lambda$169$lambda$102(mutableState4, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    }, composer2, 54), composer, 12582918, 120);
                    composer2 = composer;
                } else {
                    c = '6';
                    composer2.startReplaceGroup(i3);
                }
                composer2.endReplaceGroup();
                if (CameraScreen$lambda$25(mutableState) != null) {
                    composer2.startReplaceGroup(-815498812);
                    ComposerKt.sourceInformation(composer2, "831@46698L1772");
                    Alignment.Horizontal centerHorizontally2 = Alignment.Companion.getCenterHorizontally();
                    Modifier modifier = PaddingKt.padding-qDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), 0.0f, 0.0f, 0.0f, Dp.constructor-impl(8.0f), 7, (Object) null);
                    ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, composer2, 48);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifier);
                    Function0 constructor2 = ComposeUiNode.Companion.getConstructor();
                    String str5 = str2;
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str5);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composer4 = Updater.constructor-impl(composer2);
                    Updater.set-impl(composer4, measurePolicyColumnMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.set-impl(composer4, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (composer4.getInserting() || !Intrinsics.areEqual(composer4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composer4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composer4.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.set-impl(composer4, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -384784025, str);
                    ColumnScope columnScope2 = ColumnScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, 930006540, "C835@46912L388,843@47325L41,844@47391L1057:CameraScreen.kt#2thlc2");
                    Bitmap bitmapCameraScreen$lambda$25 = CameraScreen$lambda$25(mutableState);
                    Intrinsics.checkNotNull(bitmapCameraScreen$lambda$25);
                    ImageKt.Image-5h-nEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmapCameraScreen$lambda$25), "Cover Image", ClipKt.clip(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(180.0f)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f))), (Alignment) null, ContentScale.Companion.getFit(), 0.0f, (ColorFilter) null, 0, composer, 24624, 232);
                    SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f)), composer, 6);
                    Arrangement.Horizontal horizontal = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(12.0f));
                    ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    Modifier modifier2 = Modifier.Companion;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontal, Alignment.Companion.getTop(), composer, 6);
                    ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifier2);
                    Function0 constructor3 = ComposeUiNode.Companion.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer, -692256719, str5);
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
                    Updater.set-impl(composer5, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.set-impl(composer5, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (composer5.getInserting() || !Intrinsics.areEqual(composer5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composer5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composer5.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.set-impl(composer5, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScope rowScope = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer, -1611177992, "C846@47536L29,845@47478L452,854@48017L37,853@47959L463:CameraScreen.kt#2thlc2");
                    String str6 = str3;
                    ComposerKt.sourceInformationMarkerStart(composer, -1437445864, str6);
                    boolean zChangedInstance = composer.changedInstance(managedActivityResultLauncher);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda16
                            public final Object invoke() {
                                return CameraScreenKt.CameraScreen$lambda$170$lambda$169$lambda$108$lambda$107$lambda$104$lambda$103(managedActivityResultLauncher);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ButtonKt.OutlinedButton((Function0) objRememberedValue, (Modifier) null, false, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$CameraScreenKt.INSTANCE.m230getLambda$1980000723$app(), composer, 805306368, 502);
                    ComposerKt.sourceInformationMarkerStart(composer, -1437430464, str6);
                    boolean zChangedInstance2 = composer.changedInstance(managedActivityResultLauncher4);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda17
                            public final Object invoke() {
                                return CameraScreenKt.CameraScreen$lambda$170$lambda$169$lambda$108$lambda$107$lambda$106$lambda$105(managedActivityResultLauncher4);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    str4 = str6;
                    i4 = 6;
                    ButtonKt.OutlinedButton((Function0) objRememberedValue2, (Modifier) null, false, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$CameraScreenKt.INSTANCE.getLambda$914728804$app(), composer, 805306368, 502);
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
                } else {
                    str4 = str3;
                    i4 = 6;
                    composer2.startReplaceGroup(i3);
                }
                composer2.endReplaceGroup();
                CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(16.0f)), CardDefaults.INSTANCE.cardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0L, 0L, composer, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.cardElevation-aqJV_2Y(Dp.constructor-impl(2.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer, (CardDefaults.$stable << 18) | 6, 62), (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(172756352, true, new Function3() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda18
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return CameraScreenKt.CameraScreen$lambda$170$lambda$169$lambda$158(mutableState5, mutableState6, mutableState7, mutableState8, mutableState9, mutableState10, mutableState11, coroutineScope, mutableState12, mutableState13, mutableState14, mutableState15, mutableState16, mutableState17, mutableState18, mutableState19, mutableState20, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, composer, c), composer, 196614, 16);
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, i4);
                composer2 = composer;
                CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(16.0f)), CardDefaults.INSTANCE.cardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0L, 0L, composer, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.cardElevation-aqJV_2Y(Dp.constructor-impl(2.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer, (CardDefaults.$stable << 18) | 6, 62), (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(339627767, true, new Function3() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda19
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return CameraScreenKt.CameraScreen$lambda$170$lambda$169$lambda$165(mutableState21, mutableState22, mutableState23, mutableState24, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, composer2, c), composer2, 196614, 16);
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), composer2, i4);
                Modifier modifier3 = SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(50.0f));
                Shape shape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(16.0f));
                boolean z = !CameraScreen$lambda$16(mutableState3);
                ComposerKt.sourceInformationMarkerStart(composer2, -718336152, str4);
                boolean zChanged = composer2.changed(function16);
                Object objRememberedValue3 = composer2.rememberedValue();
                if (zChanged || objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda20
                        public final Object invoke() {
                            return CameraScreenKt.CameraScreen$lambda$170$lambda$169$lambda$168$lambda$167(function16, mutableState10, mutableState14, mutableState11, mutableState, mutableState18, mutableState23, mutableState19, mutableState20, mutableState17, mutableState24, mutableState21, mutableState22, mutableState25, mutableState15, mutableState16, mutableState7, mutableState8, mutableState6);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ButtonKt.Button((Function0) objRememberedValue3, modifier3, z, shape, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$CameraScreenKt.INSTANCE.m229getLambda$1897981826$app(), composer2, 805306416, 496);
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), composer2, i4);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-820379545);
                ComposerKt.sourceInformation(composer2, "733@41745L38,738@41999L11,734@41800L255,740@42072L41,743@42239L10,745@42354L11,741@42130L263,749@42520L10,750@42585L11,747@42410L221,752@42648L41,755@42761L29,754@42723L466,764@43223L41,767@43328L22,766@43282L453,776@43769L41,779@43890L37,778@43844L475,788@44353L38,789@44408L42");
                SpacerKt.Spacer(ColumnScope.weight$default(columnScope, Modifier.Companion, 0.01f, false, 2, (Object) null), composer2, 0);
                IconKt.Icon-ww6aTOc(DocumentScannerKt.getDocumentScanner(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(80.0f)), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null), composer2, 432, 0);
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(12.0f)), composer2, 6);
                TextKt.Text--4IGK_g("Scan a book to add it to your library", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurface-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getTitleLarge(), composer2, 196614, 0, 65498);
                TextKt.Text--4IGK_g("AI will auto-fill the details for you.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodyMedium(), composer2, 6, 0, 65530);
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(12.0f)), composer2, 6);
                ComposerKt.sourceInformationMarkerStart(composer2, -719170137, "CC(remember):CameraScreen.kt#9igjgp");
                boolean zChangedInstance3 = composer2.changedInstance(managedActivityResultLauncher);
                Object objRememberedValue4 = composer2.rememberedValue();
                if (zChangedInstance3 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda12
                        public final Object invoke() {
                            return CameraScreenKt.CameraScreen$lambda$170$lambda$169$lambda$96$lambda$95(managedActivityResultLauncher);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ButtonKt.Button((Function0) objRememberedValue4, SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(50.0f)), true, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(16.0f)), (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$CameraScreenKt.INSTANCE.getLambda$1693687029$app(), composer2, 805306416, 496);
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), composer2, 6);
                composer2.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit CameraScreen$lambda$170$lambda$169$lambda$96$lambda$95(ManagedActivityResultLauncher managedActivityResultLauncher) {
        CameraScreen$launchCameraAndLocation(managedActivityResultLauncher);
        return Unit.INSTANCE;
    }

    static final Unit CameraScreen$lambda$170$lambda$169$lambda$98$lambda$97(Context context, ManagedActivityResultLauncher managedActivityResultLauncher, ManagedActivityResultLauncher managedActivityResultLauncher2, MutableState mutableState) {
        CameraScreen$launchQuickPhoto(context, managedActivityResultLauncher, managedActivityResultLauncher2, mutableState);
        return Unit.INSTANCE;
    }

    static final Unit CameraScreen$lambda$170$lambda$169$lambda$100$lambda$99(ManagedActivityResultLauncher managedActivityResultLauncher) {
        managedActivityResultLauncher.launch("image/*");
        return Unit.INSTANCE;
    }

    static final Unit CameraScreen$lambda$170$lambda$169$lambda$102(MutableState mutableState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C815@45892L683:CameraScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(588531643, i, -1, "com.example.ui.screens.CameraScreen.<anonymous>.<anonymous>.<anonymous> (CameraScreen.kt:815)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(14.0f));
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
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
            Composer composer2 = Updater.constructor-impl(composer);
            Updater.set-impl(composer2, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer2, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer2.getInserting() || !Intrinsics.areEqual(composer2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composer2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composer2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.set-impl(composer2, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1169330845, "C819@46165L11,819@46092L106,820@46227L40,823@46409L11,824@46498L10,821@46296L253:CameraScreen.kt#2thlc2");
            IconKt.Icon-ww6aTOc(InfoKt.getInfo(Icons.INSTANCE.getDefault()), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSecondaryContainer-0d7_KjU(), composer, 48, 4);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f)), composer, 6);
            String strCameraScreen$lambda$22 = CameraScreen$lambda$22(mutableState);
            Intrinsics.checkNotNull(strCameraScreen$lambda$22);
            TextKt.Text--4IGK_g(strCameraScreen$lambda$22, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSecondaryContainer-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 0, 0, 65530);
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

    static final Unit CameraScreen$lambda$170$lambda$169$lambda$108$lambda$107$lambda$104$lambda$103(ManagedActivityResultLauncher managedActivityResultLauncher) {
        CameraScreen$launchCameraAndLocation(managedActivityResultLauncher);
        return Unit.INSTANCE;
    }

    static final Unit CameraScreen$lambda$170$lambda$169$lambda$108$lambda$107$lambda$106$lambda$105(ManagedActivityResultLauncher managedActivityResultLauncher) {
        managedActivityResultLauncher.launch("image/*");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Failed to calculate best type for var: r26v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r26v1 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r26v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r26v1 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r26v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r26v2 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r26v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r26v9 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r26v1 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    static final kotlin.Unit CameraScreen$lambda$170$lambda$169$lambda$158(androidx.compose.runtime.MutableState r60, androidx.compose.runtime.MutableState r61, androidx.compose.runtime.MutableState r62, androidx.compose.runtime.MutableState r63, androidx.compose.runtime.MutableState r64, androidx.compose.runtime.MutableState r65, androidx.compose.runtime.MutableState r66, kotlinx.coroutines.CoroutineScope r67, androidx.compose.runtime.MutableState r68, androidx.compose.runtime.MutableState r69, androidx.compose.runtime.MutableState r70, androidx.compose.runtime.MutableState r71, androidx.compose.runtime.MutableState r72, androidx.compose.runtime.MutableState r73, androidx.compose.runtime.MutableState r74, androidx.compose.runtime.MutableState r75, androidx.compose.runtime.MutableState r76, androidx.compose.foundation.layout.ColumnScope r77, androidx.compose.runtime.Composer r78, int r79) {
        /*
            Method dump skipped, instruction units count: 2691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.CameraScreenKt.CameraScreen$lambda$170$lambda$169$lambda$158(androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, kotlinx.coroutines.CoroutineScope, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    static final Unit CameraScreen$lambda$170$lambda$169$lambda$158$lambda$157$lambda$115$lambda$111(MutableState mutableState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C925@52099L649:CameraScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-600385465, i, -1, "com.example.ui.screens.CameraScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CameraScreen.kt:925)");
            }
            Modifier modifier = PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(8.0f), Dp.constructor-impl(4.0f));
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
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
            Composer composer2 = Updater.constructor-impl(composer);
            Updater.set-impl(composer2, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer2, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer2.getInserting() || !Intrinsics.areEqual(composer2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composer2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composer2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.set-impl(composer2, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1718404850, "C929@52376L110,930@52527L39,931@52658L10,931@52607L103:CameraScreen.kt#2thlc2");
            IconKt.Icon-ww6aTOc(StarKt.getStar(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(13.0f)), ColorKt.Color(4294286859L), composer, 3504, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g(CameraScreen$lambda$67(mutableState) + "/5.0", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
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

    static final Unit CameraScreen$lambda$170$lambda$169$lambda$158$lambda$157$lambda$115$lambda$112(MutableState mutableState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C942@53288L10,940@53153L371:CameraScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-552237698, i, -1, "com.example.ui.screens.CameraScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CameraScreen.kt:940)");
            }
            TextKt.Text--4IGK_g(CameraScreen$lambda$61(mutableState) + " Pages", PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(8.0f), Dp.constructor-impl(4.0f)), 0L, 0L, (FontStyle) null, FontWeight.Companion.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 196656, 0, 65500);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit CameraScreen$lambda$170$lambda$169$lambda$158$lambda$157$lambda$115$lambda$113(MutableState mutableState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C955@54045L10,953@53918L363:CameraScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1030114367, i, -1, "com.example.ui.screens.CameraScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CameraScreen.kt:953)");
            }
            String strCameraScreen$lambda$64 = CameraScreen$lambda$64(mutableState);
            Intrinsics.checkNotNull(strCameraScreen$lambda$64);
            TextStyle labelSmall = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall();
            TextKt.Text--4IGK_g(strCameraScreen$lambda$64, PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(8.0f), Dp.constructor-impl(4.0f)), 0L, 0L, (FontStyle) null, FontWeight.Companion.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, labelSmall, composer, 196656, 0, 65500);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit CameraScreen$lambda$170$lambda$169$lambda$158$lambda$157$lambda$115$lambda$114(MutableState mutableState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C968@54817L10,966@54679L374:CameraScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1682500864, i, -1, "com.example.ui.screens.CameraScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CameraScreen.kt:966)");
            }
            TextKt.Text--4IGK_g("ISBN: " + CameraScreen$lambda$28(mutableState), PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(8.0f), Dp.constructor-impl(4.0f)), 0L, 0L, (FontStyle) null, FontWeight.Companion.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 196656, 0, 65500);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit CameraScreen$lambda$170$lambda$169$lambda$158$lambda$157$lambda$117$lambda$116(MutableState mutableState, String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        mutableState.setValue(str);
        return Unit.INSTANCE;
    }

    static final Unit CameraScreen$lambda$170$lambda$169$lambda$158$lambda$157$lambda$120(final CoroutineScope coroutineScope, final MutableState mutableState, final MutableState mutableState2, final MutableState mutableState3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C:CameraScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2016337517, i, -1, "com.example.ui.screens.CameraScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CameraScreen.kt:986)");
            }
            if (CameraScreen$lambda$73(mutableState)) {
                composer.startReplaceGroup(-701566753);
                ComposerKt.sourceInformation(composer, "987@55847L78");
                ProgressIndicatorKt.CircularProgressIndicator-LxG7B9w(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(20.0f)), 0L, Dp.constructor-impl(2.0f), 0L, 0, composer, 390, 26);
                composer.endReplaceGroup();
            } else {
                if (StringsKt.isBlank(CameraScreen$lambda$1(mutableState2))) {
                    composer.startReplaceGroup(-756934923);
                } else {
                    composer.startReplaceGroup(-701384132);
                    ComposerKt.sourceInformation(composer, "989@56048L36,989@56027L209");
                    ComposerKt.sourceInformationMarkerStart(composer, 670113009, "CC(remember):CameraScreen.kt#9igjgp");
                    boolean zChangedInstance = composer.changedInstance(coroutineScope);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda10
                            public final Object invoke() {
                                return CameraScreenKt.CameraScreen$lambda$170$lambda$169$lambda$158$lambda$157$lambda$120$lambda$119$lambda$118(mutableState2, coroutineScope, mutableState, mutableState3);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    IconButtonKt.IconButton((Function0) objRememberedValue, (Modifier) null, false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableSingletons$CameraScreenKt.INSTANCE.m225getLambda$1317418132$app(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                }
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit CameraScreen$lambda$170$lambda$169$lambda$158$lambda$157$lambda$120$lambda$119$lambda$118(MutableState mutableState, CoroutineScope coroutineScope, MutableState mutableState2, MutableState mutableState3) {
        CameraScreen$searchGoogleBooksManually(coroutineScope, mutableState2, mutableState3, CameraScreen$lambda$1(mutableState));
        return Unit.INSTANCE;
    }

    static final Unit CameraScreen$lambda$170$lambda$169$lambda$158$lambda$157$lambda$121(MutableState mutableState, MutableState mutableState2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C:CameraScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-738129891, i, -1, "com.example.ui.screens.CameraScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CameraScreen.kt:995)");
            }
            if (CameraScreen$lambda$37(mutableState) && StringsKt.isBlank(CameraScreen$lambda$1(mutableState2))) {
                composer.startReplaceGroup(605053403);
                ComposerKt.sourceInformation(composer, "996@56510L11,996@56462L66");
                TextKt.Text--4IGK_g("Title is required", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131066);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(605197398);
                ComposerKt.sourceInformation(composer, "998@56688L10,998@56606L103");
                TextKt.Text--4IGK_g("Tap search icon to verify with Google Books catalog", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 65534);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit CameraScreen$lambda$170$lambda$169$lambda$158$lambda$157$lambda$142(MutableState mutableState, final MutableState mutableState2, final MutableState mutableState3, final MutableState mutableState4, final MutableState mutableState5, final MutableState mutableState6, final MutableState mutableState7, final MutableState mutableState8, final MutableState mutableState9, final MutableState mutableState10, final MutableState mutableState11, ColumnScope columnScope, Composer composer, int i) {
        final MutableState mutableState12;
        Intrinsics.checkNotNullParameter(columnScope, "$this$Card");
        ComposerKt.sourceInformation(composer, "C1009@57246L5458:CameraScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(679088954, i, -1, "com.example.ui.screens.CameraScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CameraScreen.kt:1009)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(12.0f));
            Arrangement.Vertical vertical = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(8.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(vertical, Alignment.Companion.getStart(), composer, 6);
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
            Composer composer2 = Updater.constructor-impl(composer);
            Updater.set-impl(composer2, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer2, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer2.getInserting() || !Intrinsics.areEqual(composer2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composer2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composer2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.set-impl(composer2, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScope columnScope2 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -938132474, "C1010@57377L907:CameraScreen.kt#2thlc2");
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer, 54);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
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
            Composer composer3 = Updater.constructor-impl(composer);
            Updater.set-impl(composer3, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer3, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composer3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composer3.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.set-impl(composer3, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1542420228, "C1017@57855L10,1015@57715L277,1020@58054L42,1020@58033L213:CameraScreen.kt#2thlc2");
            TextKt.Text--4IGK_g("Google Books Matches", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleSmall(), composer, 196614, 0, 65502);
            Composer composer4 = composer;
            String str = "CC(remember):CameraScreen.kt#9igjgp";
            ComposerKt.sourceInformationMarkerStart(composer4, -1850860450, "CC(remember):CameraScreen.kt#9igjgp");
            Object objRememberedValue = composer4.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                mutableState12 = mutableState;
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda29
                    public final Object invoke() {
                        return CameraScreenKt.CameraScreen$lambda$170$lambda$169$lambda$158$lambda$157$lambda$142$lambda$141$lambda$124$lambda$123$lambda$122(mutableState12);
                    }
                };
                composer4.updateRememberedValue(objRememberedValue);
            } else {
                mutableState12 = mutableState;
            }
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ButtonKt.TextButton((Function0) objRememberedValue, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$CameraScreenKt.INSTANCE.m224getLambda$1273333679$app(), composer4, 805306374, 510);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            composer4.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            composer4.startReplaceGroup(-1138610708);
            ComposerKt.sourceInformation(composer4, "*1028@58645L11,1029@58720L1347,1046@60110L2522,1025@58412L4220");
            for (final VolumeInfo volumeInfo : CollectionsKt.take(CameraScreen$lambda$70(mutableState12), 3)) {
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
                Shape shape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(8.0f));
                long j = MaterialTheme.INSTANCE.getColorScheme(composer4, MaterialTheme.$stable).getSurface-0d7_KjU();
                ComposerKt.sourceInformationMarkerStart(composer4, -1861848934, str);
                boolean zChangedInstance = composer4.changedInstance(volumeInfo);
                Object objRememberedValue2 = composer4.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    final MutableState mutableState13 = mutableState12;
                    objRememberedValue2 = new Function0() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda30
                        public final Object invoke() {
                            return CameraScreenKt.CameraScreen$lambda$170$lambda$169$lambda$158$lambda$157$lambda$142$lambda$141$lambda$140$lambda$136$lambda$135(volumeInfo, mutableState2, mutableState3, mutableState4, mutableState5, mutableState6, mutableState7, mutableState8, mutableState9, mutableState10, mutableState11, mutableState13);
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(composer4);
                SurfaceKt.Surface-o_FOJdg((Function0) objRememberedValue2, modifierFillMaxWidth$default2, false, shape, j, 0L, 0.0f, 0.0f, (BorderStroke) null, (MutableInteractionSource) null, ComposableLambdaKt.rememberComposableLambda(1984692332, true, new Function2() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda31
                    public final Object invoke(Object obj, Object obj2) {
                        return CameraScreenKt.CameraScreen$lambda$170$lambda$169$lambda$158$lambda$157$lambda$142$lambda$141$lambda$140$lambda$139(volumeInfo, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer4, 54), composer, 48, 6, 996);
                mutableState12 = mutableState;
                composer4 = composer;
                str = str;
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

    static final Unit CameraScreen$lambda$170$lambda$169$lambda$158$lambda$157$lambda$142$lambda$141$lambda$124$lambda$123$lambda$122(MutableState mutableState) {
        mutableState.setValue(CollectionsKt.emptyList());
        return Unit.INSTANCE;
    }

    static final Unit CameraScreen$lambda$170$lambda$169$lambda$158$lambda$157$lambda$142$lambda$141$lambda$140$lambda$136$lambda$135(VolumeInfo volumeInfo, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11) {
        Object obj;
        String identifier;
        String thumbnail;
        String strReplace$default;
        String str;
        String strJoinToString$default;
        String title = volumeInfo.getTitle();
        if (title != null) {
            mutableState.setValue(title);
        }
        List<String> authors = volumeInfo.getAuthors();
        if (authors != null && (strJoinToString$default = CollectionsKt.joinToString$default(authors, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null)) != null) {
            mutableState2.setValue(strJoinToString$default);
        }
        String publisher = volumeInfo.getPublisher();
        if (publisher != null) {
            mutableState3.setValue(publisher);
        }
        String publishedDate = volumeInfo.getPublishedDate();
        if (publishedDate != null) {
            mutableState4.setValue(publishedDate);
        }
        Integer pageCount = volumeInfo.getPageCount();
        if (pageCount != null) {
            mutableState5.setValue(Integer.valueOf(pageCount.intValue()));
        }
        String language = volumeInfo.getLanguage();
        if (language != null) {
            mutableState6.setValue(language);
        }
        List<String> categories = volumeInfo.getCategories();
        if (categories != null && (str = (String) CollectionsKt.firstOrNull(categories)) != null) {
            mutableState7.setValue(str);
        }
        ImageLinks imageLinks = volumeInfo.getImageLinks();
        if (imageLinks != null && (thumbnail = imageLinks.getThumbnail()) != null && (strReplace$default = StringsKt.replace$default(thumbnail, "http://", "https://", false, 4, (Object) null)) != null) {
            mutableState8.setValue(strReplace$default);
        }
        List<IndustryIdentifier> industryIdentifiers = volumeInfo.getIndustryIdentifiers();
        if (industryIdentifiers != null) {
            Iterator<T> it = industryIdentifiers.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                String type = ((IndustryIdentifier) next).getType();
                if (type != null && StringsKt.contains$default(type, "13", false, 2, (Object) null)) {
                    obj = next;
                    break;
                }
            }
            IndustryIdentifier industryIdentifier = (IndustryIdentifier) obj;
            if (industryIdentifier != null && (identifier = industryIdentifier.getIdentifier()) != null) {
                mutableState9.setValue(identifier);
            }
        }
        CameraScreen$lambda$35(mutableState10, true);
        mutableState11.setValue(CollectionsKt.emptyList());
        return Unit.INSTANCE;
    }

    static final Unit CameraScreen$lambda$170$lambda$169$lambda$158$lambda$157$lambda$142$lambda$141$lambda$140$lambda$139(VolumeInfo volumeInfo, Composer composer, int i) {
        String str;
        String str2;
        String strJoinToString$default;
        String thumbnail;
        Composer composer2 = composer;
        ComposerKt.sourceInformation(composer2, "C1047@60156L2434:CameraScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1984692332, i, -1, "com.example.ui.screens.CameraScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CameraScreen.kt:1047)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f));
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Arrangement.Horizontal horizontal = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(10.0f));
            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontal, centerVertically, composer2, 54);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifier);
            Function0 constructor = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composer3 = Updater.constructor-impl(composer2);
            Updater.set-impl(composer3, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer3, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composer3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composer3.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.set-impl(composer3, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, -1309166493, "C1063@61482L1062:CameraScreen.kt#2thlc2");
            ImageLinks imageLinks = volumeInfo.getImageLinks();
            String strReplace$default = (imageLinks == null || (thumbnail = imageLinks.getThumbnail()) == null) ? null : StringsKt.replace$default(thumbnail, "http://", "https://", false, 4, (Object) null);
            String str3 = strReplace$default;
            if (str3 == null || StringsKt.isBlank(str3)) {
                str = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                str2 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                composer2.startReplaceGroup(-1308519586);
                ComposerKt.sourceInformation(composer2, "1061@61299L84");
                IconKt.Icon-ww6aTOc(BookKt.getBook(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(32.0f)), 0L, composer2, 432, 8);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-1309065682);
                ComposerKt.sourceInformation(composer2, "1054@60737L452");
                str2 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                str = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                SingletonAsyncImageKt.m108AsyncImagegl8XCv8(strReplace$default, null, ClipKt.clip(SizeKt.size-VpY3zN4(Modifier.Companion, Dp.constructor-impl(32.0f), Dp.constructor-impl(46.0f)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(4.0f))), null, null, null, ContentScale.Companion.getCrop(), 0.0f, null, 0, false, null, composer, 1572912, 0, 4024);
                composer2 = composer;
                composer2.endReplaceGroup();
            }
            Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.Companion, 1.0f, false, 2, (Object) null);
            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, 0);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierWeight$default);
            Function0 constructor2 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str2);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer composer4 = Updater.constructor-impl(composer2);
            Updater.set-impl(composer4, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer4, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer4.getInserting() || !Intrinsics.areEqual(composer4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composer4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composer4.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.set-impl(composer4, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, -889020038, "C1066@61753L10,1064@61575L413,1072@62242L10,1073@62342L11,1070@62041L453:CameraScreen.kt#2thlc2");
            String title = volumeInfo.getTitle();
            if (title == null) {
                title = "Unknown Title";
            }
            TextKt.Text--4IGK_g(title, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodyMedium(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 3072, 57310);
            List<String> authors = volumeInfo.getAuthors();
            if (authors == null || (strJoinToString$default = CollectionsKt.joinToString$default(authors, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null)) == null) {
                strJoinToString$default = "Unknown Author";
            }
            TextKt.Text--4IGK_g(strJoinToString$default, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 0, 3072, 57338);
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

    static final Unit CameraScreen$lambda$170$lambda$169$lambda$158$lambda$157$lambda$144$lambda$143(MutableState mutableState, String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        mutableState.setValue(str);
        return Unit.INSTANCE;
    }

    static final Unit CameraScreen$lambda$170$lambda$169$lambda$158$lambda$157$lambda$145(MutableState mutableState, MutableState mutableState2, Composer composer, int i) {
        Composer composer2 = composer;
        ComposerKt.sourceInformation(composer2, "C:CameraScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1786210068, i, -1, "com.example.ui.screens.CameraScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CameraScreen.kt:1094)");
            }
            if (CameraScreen$lambda$37(mutableState) && StringsKt.isBlank(CameraScreen$lambda$4(mutableState2))) {
                composer2.startReplaceGroup(-1660579531);
                ComposerKt.sourceInformation(composer2, "1095@63549L11,1095@63486L81");
                TextKt.Text--4IGK_g("Author or board name is required", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getError-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131066);
                composer2 = composer;
            } else {
                composer2.startReplaceGroup(-1723525682);
            }
            composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit CameraScreen$lambda$170$lambda$169$lambda$158$lambda$157$lambda$147$lambda$146(MutableState mutableState, String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        mutableState.setValue(str);
        return Unit.INSTANCE;
    }

    static final Unit CameraScreen$lambda$170$lambda$169$lambda$158$lambda$157$lambda$149$lambda$148(MutableState mutableState, String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        mutableState.setValue(str);
        return Unit.INSTANCE;
    }

    static final Unit CameraScreen$lambda$170$lambda$169$lambda$158$lambda$157$lambda$154$lambda$153$lambda$151$lambda$150(String str, MutableState mutableState) {
        mutableState.setValue(str);
        return Unit.INSTANCE;
    }

    static final Unit CameraScreen$lambda$170$lambda$169$lambda$158$lambda$157$lambda$154$lambda$153$lambda$152(String str, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1129@65328L10:CameraScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-309651953, i, -1, "com.example.ui.screens.CameraScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CameraScreen.kt:1129)");
            }
            TextKt.Text--4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit CameraScreen$lambda$170$lambda$169$lambda$158$lambda$157$lambda$156$lambda$155(MutableState mutableState, String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        mutableState.setValue(str);
        return Unit.INSTANCE;
    }

    static final Unit CameraScreen$lambda$170$lambda$169$lambda$165(MutableState mutableState, MutableState mutableState2, final MutableState mutableState3, final MutableState mutableState4, ColumnScope columnScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(columnScope, "$this$Card");
        ComposerKt.sourceInformation(composer, "C1154@66438L2182:CameraScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(339627767, i, -1, "com.example.ui.screens.CameraScreen.<anonymous>.<anonymous>.<anonymous> (CameraScreen.kt:1154)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f));
            Arrangement.Vertical vertical = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(16.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(vertical, Alignment.Companion.getStart(), composer, 6);
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
            Composer composer2 = Updater.constructor-impl(composer);
            Updater.set-impl(composer2, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer2, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer2.getInserting() || !Intrinsics.areEqual(composer2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composer2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composer2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.set-impl(composer2, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScope columnScope2 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -615115196, "C1160@66738L10,1158@66628L217,1178@67754L22,1176@67640L500,1188@68303L21,1186@68190L408:CameraScreen.kt#2thlc2");
            TextKt.Text--4IGK_g("Pickup & Contact Info", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleMedium(), composer, 196614, 0, 65502);
            Composer composer3 = composer;
            if (CameraScreen$lambda$49(mutableState) == null || CameraScreen$lambda$52(mutableState2) == null) {
                composer3.startReplaceGroup(-681272235);
            } else {
                composer3.startReplaceGroup(-614871599);
                ComposerKt.sourceInformation(composer3, "1165@66944L620");
                Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                Modifier modifier2 = Modifier.Companion;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifier2);
                Function0 constructor2 = ComposeUiNode.Companion.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor2);
                } else {
                    composer3.useNode();
                }
                Composer composer4 = Updater.constructor-impl(composer3);
                Updater.set-impl(composer4, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl(composer4, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composer4.getInserting() || !Intrinsics.areEqual(composer4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composer4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composer4.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.set-impl(composer4, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScope rowScope = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer3, 2075636959, "C1166@67110L11,1166@67030L133,1167@67196L39,1170@67400L11,1171@67479L10,1168@67268L266:CameraScreen.kt#2thlc2");
                IconKt.Icon-ww6aTOc(AutoAwesomeKt.getAutoAwesome(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer3, 432, 0);
                SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer3, 6);
                TextKt.Text--4IGK_g("GPS Location attached", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodyMedium(), composer, 6, 0, 65530);
                composer3 = composer;
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
            }
            composer3.endReplaceGroup();
            String strCameraScreen$lambda$40 = CameraScreen$lambda$40(mutableState3);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            Shape shape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f));
            ComposerKt.sourceInformationMarkerStart(composer3, 811475651, "CC(remember):CameraScreen.kt#9igjgp");
            Object objRememberedValue = composer3.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda32
                    public final Object invoke(Object obj) {
                        return CameraScreenKt.CameraScreen$lambda$170$lambda$169$lambda$165$lambda$164$lambda$161$lambda$160(mutableState3, (String) obj);
                    }
                };
                composer3.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer3);
            OutlinedTextFieldKt.OutlinedTextField(strCameraScreen$lambda$40, (Function1) objRememberedValue, modifierFillMaxWidth$default, false, false, (TextStyle) null, ComposableSingletons$CameraScreenKt.INSTANCE.m234getLambda$540009081$app(), ComposableSingletons$CameraScreenKt.INSTANCE.m237getLambda$960128026$app(), (Function2) null, (Function2) null, (Function2) null, (Function2) null, (Function2) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, shape, (TextFieldColors) null, composer, 14156208, 12582912, 0, 6160184);
            String strCameraScreen$lambda$43 = CameraScreen$lambda$43(mutableState4);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            Shape shape2 = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f));
            ComposerKt.sourceInformationMarkerStart(composer, 811493218, "CC(remember):CameraScreen.kt#9igjgp");
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda34
                    public final Object invoke(Object obj) {
                        return CameraScreenKt.CameraScreen$lambda$170$lambda$169$lambda$165$lambda$164$lambda$163$lambda$162(mutableState4, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            OutlinedTextFieldKt.OutlinedTextField(strCameraScreen$lambda$43, (Function1) objRememberedValue2, modifierFillMaxWidth$default2, false, false, (TextStyle) null, ComposableSingletons$CameraScreenKt.INSTANCE.m226getLambda$1442473474$app(), (Function2) null, (Function2) null, (Function2) null, (Function2) null, (Function2) null, (Function2) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, shape2, (TextFieldColors) null, composer, 1573296, 12582912, 0, 6160312);
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

    static final Unit CameraScreen$lambda$170$lambda$169$lambda$165$lambda$164$lambda$161$lambda$160(MutableState mutableState, String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        mutableState.setValue(str);
        return Unit.INSTANCE;
    }

    static final Unit CameraScreen$lambda$170$lambda$169$lambda$165$lambda$164$lambda$163$lambda$162(MutableState mutableState, String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        mutableState.setValue(str);
        return Unit.INSTANCE;
    }

    static final Unit CameraScreen$lambda$170$lambda$169$lambda$168$lambda$167(Function16 function16, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, MutableState mutableState12, MutableState mutableState13, MutableState mutableState14, MutableState mutableState15, MutableState mutableState16, MutableState mutableState17, MutableState mutableState18) {
        String strCameraScreen$lambda$31;
        String base64Str;
        if (StringsKt.isBlank(CameraScreen$lambda$1(mutableState)) || StringsKt.isBlank(CameraScreen$lambda$4(mutableState2))) {
            CameraScreen$lambda$38(mutableState3, true);
            return Unit.INSTANCE;
        }
        Bitmap bitmapCameraScreen$lambda$25 = CameraScreen$lambda$25(mutableState4);
        if (bitmapCameraScreen$lambda$25 == null || (base64Str = toBase64Str(bitmapCameraScreen$lambda$25)) == null || (strCameraScreen$lambda$31 = "data:image/jpeg;base64," + base64Str) == null) {
            strCameraScreen$lambda$31 = CameraScreen$lambda$31(mutableState5);
        }
        function16.invoke(StringsKt.trim(CameraScreen$lambda$1(mutableState)).toString(), StringsKt.trim(CameraScreen$lambda$4(mutableState2)).toString(), !StringsKt.isBlank(CameraScreen$lambda$7(mutableState7)) ? StringsKt.trim(CameraScreen$lambda$7(mutableState7)).toString() : "Good", StringsKt.trim(CameraScreen$lambda$10(mutableState8)).toString(), StringsKt.trim(CameraScreen$lambda$13(mutableState9)).toString(), StringsKt.trim(!StringsKt.isBlank(CameraScreen$lambda$40(mutableState6)) ? CameraScreen$lambda$40(mutableState6) : "Contact owner for pickup").toString(), StringsKt.trim(CameraScreen$lambda$43(mutableState10)).toString(), strCameraScreen$lambda$31, CameraScreen$lambda$49(mutableState11), CameraScreen$lambda$52(mutableState12), StringsKt.trim(CameraScreen$lambda$46(mutableState13)).toString(), CameraScreen$lambda$55(mutableState14), CameraScreen$lambda$58(mutableState15), CameraScreen$lambda$61(mutableState16), CameraScreen$lambda$64(mutableState17), CameraScreen$lambda$67(mutableState18));
        return Unit.INSTANCE;
    }

    private static final String toBase64Str(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, 300, 400, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 75, byteArrayOutputStream);
        String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toGeminiVisionBase64(Bitmap bitmap) {
        Pair pair;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > 800 || height > 800) {
            float f = width / height;
            pair = f > 1.0f ? TuplesKt.to(800, Integer.valueOf((int) (800.0f / f))) : TuplesKt.to(Integer.valueOf((int) (800.0f * f)), 800);
        } else {
            pair = TuplesKt.to(Integer.valueOf(width), Integer.valueOf(height));
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, ((Number) pair.component1()).intValue(), ((Number) pair.component2()).intValue(), true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 75, byteArrayOutputStream);
        String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    private static final Bitmap loadRotatedCorrectedBitmap(Context context, Uri uri) throws IOException {
        Bitmap bitmap;
        float f;
        if (Build.VERSION.SDK_INT >= 28) {
            bitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(context.getContentResolver(), uri), new ImageDecoder.OnHeaderDecodedListener() { // from class: com.example.ui.screens.CameraScreenKt$$ExternalSyntheticLambda9
                @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                    CameraScreenKt.loadRotatedCorrectedBitmap$lambda$172(imageDecoder, imageInfo, source);
                }
            });
        } else {
            bitmap = MediaStore.Images.Media.getBitmap(context.getContentResolver(), uri);
        }
        Bitmap bitmap2 = bitmap;
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                InputStream inputStream = inputStreamOpenInputStream;
                try {
                    int attributeInt = new ExifInterface(inputStream).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
                    if (attributeInt == 3) {
                        f = 180.0f;
                    } else if (attributeInt != 6) {
                        f = attributeInt != 8 ? 0.0f : 270.0f;
                    } else {
                        f = 90.0f;
                    }
                    CloseableKt.closeFinally(inputStream, (Throwable) null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(inputStream, th);
                        throw th2;
                    }
                }
            } else {
                f = 0.0f;
            }
        } catch (Exception unused) {
        }
        if (f != 0.0f) {
            Matrix matrix = new Matrix();
            matrix.postRotate(f);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), matrix, true);
            Intrinsics.checkNotNull(bitmapCreateBitmap);
            return bitmapCreateBitmap;
        }
        Intrinsics.checkNotNull(bitmap2);
        return bitmap2;
    }

    static final void loadRotatedCorrectedBitmap$lambda$172(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        Intrinsics.checkNotNullParameter(imageDecoder, "decoder");
        Intrinsics.checkNotNullParameter(imageInfo, "<unused var>");
        Intrinsics.checkNotNullParameter(source, "<unused var>");
        imageDecoder.setAllocator(1);
        imageDecoder.setMutableRequired(true);
    }
}
