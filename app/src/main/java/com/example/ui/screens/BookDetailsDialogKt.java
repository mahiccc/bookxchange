package com.example.ui.screens;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Base64;
import android.widget.Toast;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.gestures.FlingBehavior;
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
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.ChatKt;
import androidx.compose.material.icons.automirrored.filled.MenuBookKt;
import androidx.compose.material.icons.filled.AutoStoriesKt;
import androidx.compose.material.icons.filled.BookmarkBorderKt;
import androidx.compose.material.icons.filled.BookmarkKt;
import androidx.compose.material.icons.filled.BrokenImageKt;
import androidx.compose.material.icons.filled.CalendarMonthKt;
import androidx.compose.material.icons.filled.CameraAltKt;
import androidx.compose.material.icons.filled.CheckCircleKt;
import androidx.compose.material.icons.filled.GppGoodKt;
import androidx.compose.material.icons.filled.InfoKt;
import androidx.compose.material.icons.filled.LanguageKt;
import androidx.compose.material.icons.filled.StarKt;
import androidx.compose.material.icons.filled.StarOutlineKt;
import androidx.compose.material.icons.filled.VerifiedKt;
import androidx.compose.material.icons.filled.VolumeOffKt;
import androidx.compose.material.icons.filled.VolumeUpKt;
import androidx.compose.material.icons.filled.WarningKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonElevation;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.ChipColors;
import androidx.compose.material3.ChipElevation;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.FilterChipDefaults;
import androidx.compose.material3.IconButtonColors;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SelectableChipElevation;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TabKt;
import androidx.compose.material3.TabRowKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.IntState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
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
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.fragment.app.FragmentTransaction;
import androidx.profileinstaller.ProfileVerifier;
import coil.compose.SingletonAsyncImageKt;
import com.example.BuildConfig;
import com.example.data.Book;
import com.example.data.Review;
import com.example.data.User;
import com.example.ui.BookViewModel;
import com.example.util.AudioHelper;
import com.example.util.AudioHelperKt;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: compiled from: BookDetailsDialog.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0002\u0010\r\u001a\u001d\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\u0011\u001a\n\u0010\u0012\u001a\u00020\u0007*\u00020\u0013\u001a#\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0002\u0010\u0015\u001a\u001d\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\u0019¨\u0006\u001a²\u0006\n\u0010\u001b\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010\u001c\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010\u001e\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u0010\u001f\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\f\u0010 \u001a\u0004\u0018\u00010\u0007X\u008a\u008e\u0002²\u0006\f\u0010!\u001a\u0004\u0018\u00010\u0013X\u008a\u008e\u0002²\u0006\f\u0010\"\u001a\u0004\u0018\u00010\u0007X\u008a\u008e\u0002²\u0006\n\u0010#\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\f\u0010$\u001a\u0004\u0018\u00010\u0007X\u008a\u008e\u0002²\u0006\f\u0010%\u001a\u0004\u0018\u00010\u0007X\u008a\u008e\u0002²\u0006\n\u0010&\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010'\u001a\u00020(X\u008a\u008e\u0002²\u0006\n\u0010)\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u0010*\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010+\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010,\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u0010-\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010.\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u0010/\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u00100\u001a\u000201X\u008a\u008e\u0002²\u0006\n\u00102\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u00103\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\f\u00104\u001a\u0004\u0018\u000105X\u008a\u0084\u0002²\u0006\u0010\u00106\u001a\b\u0012\u0004\u0012\u00020807X\u008a\u0084\u0002²\u0006\u0010\u00109\u001a\b\u0012\u0004\u0012\u00020807X\u008a\u0084\u0002²\u0006\n\u0010:\u001a\u00020(X\u008a\u008e\u0002"}, d2 = {"BookDetailsDialog", "", "book", "Lcom/example/data/Book;", "isOwner", "", "currentUser", "", "viewModel", "Lcom/example/ui/BookViewModel;", "onDismiss", "Lkotlin/Function0;", "onChatClick", "(Lcom/example/data/Book;ZLjava/lang/String;Lcom/example/ui/BookViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "MetadataRow", "label", "value", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "toBase64", "Landroid/graphics/Bitmap;", "BookConditionPhotoDialog", "(Lcom/example/data/Book;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ConditionMetaPill", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "app", "isSpeaking", "showReturnDialog", "showBorrowerReturnScanDialog", "scannedCondition", "showTransferScanDialog", "scanMode", "capturedPhotoBitmap", "capturedPhotoBase64", "isAnalyzingAi", "aiConditionResult", "aiAssessmentResult", "showPhotoAiPreviewDialog", "rating", "", "reviewText", "showConditionViewerDialog", "showQrDisplayDialog", "qrDisplayType", "showQrScannerDialog", "qrScannerType", "showMutualFeedbackDialog", "mutualFeedbackMode", "Lcom/example/ui/screens/FeedbackTargetType;", "showReadingCompanionDialog", "showSafeMeetupDialog", "ownerUserState", "Lcom/example/data/User;", "ownerReviews", "", "Lcom/example/data/Review;", "bookReviews", "selectedTab"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class BookDetailsDialogKt {
    static final Unit BookConditionPhotoDialog$lambda$377(Book book, Function0 function0, int i, Composer composer, int i2) {
        BookConditionPhotoDialog(book, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$344(Book book, boolean z, String str, BookViewModel bookViewModel, Function0 function0, Function0 function1, int i, int i2, Composer composer, int i3) {
        BookDetailsDialog(book, z, str, bookViewModel, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    static final Unit ConditionMetaPill$lambda$380(ImageVector imageVector, String str, int i, Composer composer, int i2) {
        ConditionMetaPill(imageVector, str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit MetadataRow$lambda$346(String str, String str2, int i, Composer composer, int i2) {
        MetadataRow(str, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0218  */
    /* JADX WARN: Code duplicated, block: B:104:0x0238  */
    /* JADX WARN: Code duplicated, block: B:107:0x0259  */
    /* JADX WARN: Code duplicated, block: B:110:0x0278  */
    /* JADX WARN: Code duplicated, block: B:113:0x029f  */
    /* JADX WARN: Code duplicated, block: B:116:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:119:0x02df  */
    /* JADX WARN: Code duplicated, block: B:120:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:123:0x0308  */
    /* JADX WARN: Code duplicated, block: B:124:0x0319  */
    /* JADX WARN: Code duplicated, block: B:127:0x0336  */
    /* JADX WARN: Code duplicated, block: B:128:0x0343  */
    /* JADX WARN: Code duplicated, block: B:131:0x0360  */
    /* JADX WARN: Code duplicated, block: B:134:0x0384  */
    /* JADX WARN: Code duplicated, block: B:135:0x0394  */
    /* JADX WARN: Code duplicated, block: B:138:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:139:0x03be  */
    /* JADX WARN: Code duplicated, block: B:142:0x03db  */
    /* JADX WARN: Code duplicated, block: B:145:0x0401  */
    /* JADX WARN: Code duplicated, block: B:148:0x0423  */
    /* JADX WARN: Code duplicated, block: B:151:0x0447  */
    /* JADX WARN: Code duplicated, block: B:154:0x046b  */
    /* JADX WARN: Code duplicated, block: B:157:0x048f  */
    /* JADX WARN: Code duplicated, block: B:158:0x049f  */
    /* JADX WARN: Code duplicated, block: B:161:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:165:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:168:0x0535  */
    /* JADX WARN: Code duplicated, block: B:174:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:177:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:179:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:180:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:182:0x061e  */
    /* JADX WARN: Code duplicated, block: B:185:0x062c  */
    /* JADX WARN: Code duplicated, block: B:187:0x0649  */
    /* JADX WARN: Code duplicated, block: B:188:0x0654  */
    /* JADX WARN: Code duplicated, block: B:190:0x0682  */
    /* JADX WARN: Code duplicated, block: B:193:0x0690  */
    /* JADX WARN: Code duplicated, block: B:195:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:196:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:198:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:201:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:203:0x0718  */
    /* JADX WARN: Code duplicated, block: B:205:0x073e  */
    /* JADX WARN: Code duplicated, block: B:208:0x0753  */
    /* JADX WARN: Code duplicated, block: B:210:0x077c  */
    /* JADX WARN: Code duplicated, block: B:214:0x078f  */
    /* JADX WARN: Code duplicated, block: B:217:0x07c0  */
    /* JADX WARN: Code duplicated, block: B:219:0x07db  */
    /* JADX WARN: Code duplicated, block: B:222:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:224:0x080d  */
    /* JADX WARN: Code duplicated, block: B:227:0x0815  */
    /* JADX WARN: Code duplicated, block: B:231:0x0821  */
    /* JADX WARN: Code duplicated, block: B:233:0x0842  */
    /* JADX WARN: Code duplicated, block: B:236:0x0854  */
    /* JADX WARN: Code duplicated, block: B:238:0x0871  */
    /* JADX WARN: Code duplicated, block: B:239:0x087c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:241:0x088b  */
    /* JADX WARN: Code duplicated, block: B:244:0x0899  */
    /* JADX WARN: Code duplicated, block: B:246:0x08b6  */
    /* JADX WARN: Code duplicated, block: B:247:0x08c1  */
    /* JADX WARN: Code duplicated, block: B:249:0x08d6  */
    /* JADX WARN: Code duplicated, block: B:252:0x08e4  */
    /* JADX WARN: Code duplicated, block: B:254:0x08f1  */
    /* JADX WARN: Code duplicated, block: B:256:0x08f7  */
    /* JADX WARN: Code duplicated, block: B:259:0x0900  */
    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:263:0x091f  */
    /* JADX WARN: Code duplicated, block: B:264:0x092a  */
    /* JADX WARN: Code duplicated, block: B:266:0x0949  */
    /* JADX WARN: Code duplicated, block: B:269:0x09b6  */
    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX WARN: Code duplicated, block: B:273:0x09c1  */
    /* JADX WARN: Code duplicated, block: B:275:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:32:0x007a  */
    /* JADX WARN: Code duplicated, block: B:33:0x007d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0084  */
    /* JADX WARN: Code duplicated, block: B:39:0x008a  */
    /* JADX WARN: Code duplicated, block: B:40:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0095  */
    /* JADX WARN: Code duplicated, block: B:46:0x009b  */
    /* JADX WARN: Code duplicated, block: B:47:0x009e  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00be  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:67:0x0110  */
    /* JADX WARN: Code duplicated, block: B:71:0x011a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0122  */
    /* JADX WARN: Code duplicated, block: B:77:0x012b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0133  */
    /* JADX WARN: Code duplicated, block: B:83:0x013c  */
    /* JADX WARN: Code duplicated, block: B:86:0x015a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0189  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f6  */
    public static final void BookDetailsDialog(final Book book, boolean z, final String str, final BookViewModel bookViewModel, final Function0<Unit> function0, final Function0<Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        boolean z3;
        Object objRememberedValue;
        boolean z4;
        String requestedByName;
        boolean z5;
        String borrowerName;
        boolean z6;
        Object objRememberedValue2;
        final CoroutineScope coroutineScope;
        Object objRememberedValue3;
        MutableState mutableState;
        Object objRememberedValue4;
        final MutableState mutableState2;
        Object objRememberedValue5;
        final MutableState mutableState3;
        Object objRememberedValue6;
        MutableState mutableState4;
        Object objRememberedValue7;
        final MutableState mutableState5;
        Object objRememberedValue8;
        int i4;
        final MutableState mutableState6;
        Object objRememberedValue9;
        final MutableState mutableState7;
        Object objRememberedValue10;
        final MutableState mutableState8;
        Object objRememberedValue11;
        final MutableState mutableState9;
        Object objRememberedValue12;
        MutableState mutableState10;
        Object objRememberedValue13;
        final MutableState mutableState11;
        Object objRememberedValue14;
        final MutableState mutableState12;
        Object objRememberedValue15;
        String str2;
        final MutableState mutableState13;
        Object objRememberedValue16;
        MutableState mutableState14;
        Object objRememberedValue17;
        MutableState mutableState15;
        Object objRememberedValue18;
        MutableState mutableState16;
        Object objRememberedValue19;
        final MutableState mutableState17;
        Object objRememberedValue20;
        final MutableState mutableState18;
        Object objRememberedValue21;
        MutableState mutableState19;
        Object objRememberedValue22;
        final MutableState mutableState20;
        Object objRememberedValue23;
        MutableState mutableState21;
        Object objRememberedValue24;
        MutableState mutableState22;
        Context context;
        boolean zChangedInstance;
        Object obj;
        Composer composer2;
        final MutableState mutableState23;
        final MutableState mutableState24;
        final MutableState mutableState25;
        final MutableState mutableState26;
        ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult;
        MutableState mutableState27;
        ManagedActivityResultLauncher managedActivityResultLauncher;
        final MutableState mutableState28;
        final MutableState mutableState29;
        final Context context2;
        int i5;
        int i6;
        final MutableState mutableState30;
        MutableState mutableState31;
        Composer composer3;
        boolean z7;
        Book book2;
        Composer composer4;
        int i7;
        Composer composer5;
        Context context3;
        final MutableState mutableState32;
        final MutableState mutableState33;
        Book book3;
        BookViewModel bookViewModel2;
        final MutableState mutableState34;
        final MutableState mutableState35;
        final MutableState mutableState36;
        final MutableState mutableState37;
        Composer composer6;
        final boolean z8;
        String ownerName;
        String str3;
        Object objRememberedValue25;
        Object objRememberedValue26;
        Object objRememberedValue27;
        boolean z9;
        Object objRememberedValue28;
        boolean zChangedInstance2;
        Object objRememberedValue29;
        Composer composer7;
        Object objRememberedValue30;
        Object objRememberedValue31;
        Object objRememberedValue32;
        final MutableState mutableState38;
        Object objRememberedValue33;
        final MutableState mutableState39;
        Object objRememberedValue34;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i8;
        int i9;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(book, "book");
        Intrinsics.checkNotNullParameter(str, "currentUser");
        Intrinsics.checkNotNullParameter(bookViewModel, "viewModel");
        Intrinsics.checkNotNullParameter(function0, "onDismiss");
        Intrinsics.checkNotNullParameter(function1, "onChatClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-48278397);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BookDetailsDialog)P(!1,2!1,5,4)49@1798L21,50@1842L34,55@2259L24,56@2312L34,57@2387L34,58@2450L43,59@2528L34,60@2583L42,61@2657L59,62@2748L42,63@2816L34,64@2880L42,65@2953L42,66@3032L34,67@3085L30,68@3138L31,69@3207L34,70@3273L34,71@3333L39,72@3404L34,73@3464L39,74@3540L34,75@3605L75,76@3719L34,77@3786L34,78@3852L7,82@4045L1142,80@3917L1270,673@35568L83169,673@35531L83206:BookDetailsDialog.kt#2thlc2");
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(book) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 == 0) {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (composerStartRestartGroup.changed(str)) {
                    i11 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
                } else {
                    i11 = UserVerificationMethods.USER_VERIFY_PATTERN;
                }
                i3 |= i11;
            }
            if ((i & 3072) == 0) {
                if (composerStartRestartGroup.changedInstance(bookViewModel)) {
                    i10 = 2048;
                } else {
                    i10 = UserVerificationMethods.USER_VERIFY_ALL;
                }
                i3 |= i10;
            }
            if ((i & 24576) == 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i9 = 16384;
                } else {
                    i9 = FragmentTransaction.TRANSIT_EXIT_MASK;
                }
                i3 |= i9;
            }
            if ((196608 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i8 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i8 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i3 |= i8;
            }
            if ((74899 & i3) != 74898 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer6 = composerStartRestartGroup;
                z8 = z2;
            } else {
                if (i12 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-48278397, i3, -1, "com.example.ui.screens.BookDetailsDialog (BookDetailsDialog.kt:48)");
                }
                final AudioHelper audioHelperRememberAudioHelper = AudioHelperKt.rememberAudioHelper(composerStartRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849110405, "CC(remember):BookDetailsDialog.kt#9igjgp");
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final MutableState mutableState40 = (MutableState) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                Intrinsics.checkNotNullExpressionValue(StringsKt.trim(str).toString().toLowerCase(Locale.ROOT), "toLowerCase(...)");
                if (!z3 || DashboardScreenKt.isBookOwner(book, str)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                requestedByName = book.getRequestedByName();
                if (requestedByName == null && DashboardScreenKt.isUserMatch(requestedByName, str)) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                borrowerName = book.getBorrowerName();
                if (borrowerName == null && DashboardScreenKt.isUserMatch(borrowerName, str)) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                    objRememberedValue2 = compositionScopedCoroutineScopeCanceller;
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849125445, "CC(remember):BookDetailsDialog.kt#9igjgp");
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                mutableState = (MutableState) objRememberedValue3;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849127845, "CC(remember):BookDetailsDialog.kt#9igjgp");
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                    objRememberedValue4 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                mutableState2 = (MutableState) objRememberedValue4;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849129870, "CC(remember):BookDetailsDialog.kt#9igjgp");
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                    objRememberedValue5 = SnapshotStateKt.mutableStateOf$default(book.getCondition(), (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                mutableState3 = (MutableState) objRememberedValue5;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849132357, "CC(remember):BookDetailsDialog.kt#9igjgp");
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == Composer.Companion.getEmpty()) {
                    objRememberedValue6 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                mutableState4 = (MutableState) objRememberedValue6;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849134125, "CC(remember):BookDetailsDialog.kt#9igjgp");
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == Composer.Companion.getEmpty()) {
                    objRememberedValue7 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                mutableState5 = (MutableState) objRememberedValue7;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849136510, "CC(remember):BookDetailsDialog.kt#9igjgp");
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                i4 = i3;
                if (objRememberedValue8 == Composer.Companion.getEmpty()) {
                    objRememberedValue8 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                mutableState6 = (MutableState) objRememberedValue8;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849139405, "CC(remember):BookDetailsDialog.kt#9igjgp");
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue9 == Composer.Companion.getEmpty()) {
                    objRememberedValue9 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                mutableState7 = (MutableState) objRememberedValue9;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849141573, "CC(remember):BookDetailsDialog.kt#9igjgp");
                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue10 == Composer.Companion.getEmpty()) {
                    MutableState mutableStateMutableStateOf$default = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default);
                    objRememberedValue10 = mutableStateMutableStateOf$default;
                }
                mutableState8 = (MutableState) objRememberedValue10;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849143629, "CC(remember):BookDetailsDialog.kt#9igjgp");
                objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue11 == Composer.Companion.getEmpty()) {
                    objRememberedValue11 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                }
                mutableState9 = (MutableState) objRememberedValue11;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849145965, "CC(remember):BookDetailsDialog.kt#9igjgp");
                objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue12 == Composer.Companion.getEmpty()) {
                    objRememberedValue12 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                }
                mutableState10 = (MutableState) objRememberedValue12;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849148485, "CC(remember):BookDetailsDialog.kt#9igjgp");
                objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue13 == Composer.Companion.getEmpty()) {
                    objRememberedValue13 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                }
                mutableState11 = (MutableState) objRememberedValue13;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849150177, "CC(remember):BookDetailsDialog.kt#9igjgp");
                objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue14 == Composer.Companion.getEmpty()) {
                    objRememberedValue14 = SnapshotStateKt.mutableStateOf$default(5, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                }
                mutableState12 = (MutableState) objRememberedValue14;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849151874, "CC(remember):BookDetailsDialog.kt#9igjgp");
                objRememberedValue15 = composerStartRestartGroup.rememberedValue();
                str2 = "";
                if (objRememberedValue15 == Composer.Companion.getEmpty()) {
                    MutableState mutableStateMutableStateOf$default2 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default2);
                    objRememberedValue15 = mutableStateMutableStateOf$default2;
                }
                mutableState13 = (MutableState) objRememberedValue15;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849154085, "CC(remember):BookDetailsDialog.kt#9igjgp");
                objRememberedValue16 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue16 == Composer.Companion.getEmpty()) {
                    objRememberedValue16 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue16);
                }
                mutableState14 = (MutableState) objRememberedValue16;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849156197, "CC(remember):BookDetailsDialog.kt#9igjgp");
                objRememberedValue17 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue17 == Composer.Companion.getEmpty()) {
                    objRememberedValue17 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue17);
                }
                mutableState15 = (MutableState) objRememberedValue17;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849158122, "CC(remember):BookDetailsDialog.kt#9igjgp");
                objRememberedValue18 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue18 == Composer.Companion.getEmpty()) {
                    MutableState mutableStateMutableStateOf$default3 = SnapshotStateKt.mutableStateOf$default("HANDOVER", (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default3);
                    objRememberedValue18 = mutableStateMutableStateOf$default3;
                }
                mutableState16 = (MutableState) objRememberedValue18;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849160389, "CC(remember):BookDetailsDialog.kt#9igjgp");
                objRememberedValue19 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue19 == Composer.Companion.getEmpty()) {
                    objRememberedValue19 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue19);
                }
                mutableState17 = (MutableState) objRememberedValue19;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849162314, "CC(remember):BookDetailsDialog.kt#9igjgp");
                objRememberedValue20 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue20 == Composer.Companion.getEmpty()) {
                    objRememberedValue20 = SnapshotStateKt.mutableStateOf$default("HANDOVER", (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue20);
                }
                mutableState18 = (MutableState) objRememberedValue20;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849164741, "CC(remember):BookDetailsDialog.kt#9igjgp");
                objRememberedValue21 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue21 == Composer.Companion.getEmpty()) {
                    objRememberedValue21 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue21);
                }
                mutableState19 = (MutableState) objRememberedValue21;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849166862, "CC(remember):BookDetailsDialog.kt#9igjgp");
                objRememberedValue22 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue22 == Composer.Companion.getEmpty()) {
                    objRememberedValue22 = SnapshotStateKt.mutableStateOf$default(FeedbackTargetType.BORROWER_TO_LENDER_AND_BOOK, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue22);
                }
                mutableState20 = (MutableState) objRememberedValue22;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849170469, "CC(remember):BookDetailsDialog.kt#9igjgp");
                objRememberedValue23 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue23 == Composer.Companion.getEmpty()) {
                    objRememberedValue23 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue23);
                }
                mutableState21 = (MutableState) objRememberedValue23;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849172613, "CC(remember):BookDetailsDialog.kt#9igjgp");
                objRememberedValue24 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue24 == Composer.Companion.getEmpty()) {
                    objRememberedValue24 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue24);
                }
                mutableState22 = (MutableState) objRememberedValue24;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                CompositionLocal localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composerStartRestartGroup.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                context = (Context) objConsume;
                ActivityResultContract takePicturePreview = new ActivityResultContracts.TakePicturePreview();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849182009, "CC(remember):BookDetailsDialog.kt#9igjgp");
                zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(bookViewModel) | composerStartRestartGroup.changedInstance(book);
                Object objRememberedValue35 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue35 == Composer.Companion.getEmpty()) {
                    composer2 = composerStartRestartGroup;
                    mutableState23 = mutableState10;
                    mutableState24 = mutableState4;
                    obj = new Function1() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda23
                        public final Object invoke(Object obj2) {
                            return BookDetailsDialogKt.BookDetailsDialog$lambda$70$lambda$69(coroutineScope, mutableState6, mutableState7, mutableState11, mutableState8, mutableState9, mutableState23, bookViewModel, book, mutableState24, mutableState2, (Bitmap) obj2);
                        }
                    };
                    mutableState25 = mutableState11;
                    mutableState26 = mutableState9;
                    composer2.updateRememberedValue(obj);
                } else {
                    composer2 = composerStartRestartGroup;
                    obj = objRememberedValue35;
                    mutableState26 = mutableState9;
                    mutableState23 = mutableState10;
                    mutableState25 = mutableState11;
                    mutableState24 = mutableState4;
                }
                ComposerKt.sourceInformationMarkerEnd(composer2);
                managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(takePicturePreview, (Function1) obj, composer2, 0);
                if (BookDetailsDialog$lambda$34(mutableState25) || BookDetailsDialog$lambda$19(mutableState6) == null) {
                    mutableState27 = mutableState5;
                    managedActivityResultLauncher = managedActivityResultLauncherRememberLauncherForActivityResult;
                    mutableState28 = mutableState15;
                    mutableState29 = mutableState16;
                    context2 = context;
                    i5 = 54;
                    i6 = 550789471;
                    composer2.startReplaceGroup(550789471);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(556347120);
                    ComposerKt.sourceInformation(composer2, "115@5304L97,119@5412L10924,114@5265L11071");
                    ComposerKt.sourceInformationMarkerStart(composer2, 849221252, "CC(remember):BookDetailsDialog.kt#9igjgp");
                    Object objRememberedValue36 = composer2.rememberedValue();
                    if (objRememberedValue36 == Composer.Companion.getEmpty()) {
                        objRememberedValue36 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda33
                            public final Object invoke() {
                                return BookDetailsDialogKt.BookDetailsDialog$lambda$72$lambda$71(mutableState25, mutableState5);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue36);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    i5 = 54;
                    managedActivityResultLauncher = managedActivityResultLauncherRememberLauncherForActivityResult;
                    final MutableState mutableState41 = mutableState23;
                    mutableState29 = mutableState16;
                    context2 = context;
                    mutableState28 = mutableState15;
                    mutableState27 = mutableState5;
                    AndroidDialog_androidKt.Dialog((Function0) objRememberedValue36, (DialogProperties) null, ComposableLambdaKt.rememberComposableLambda(-692609611, true, new Function2() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda34
                        public final Object invoke(Object obj2, Object obj3) {
                            return BookDetailsDialogKt.BookDetailsDialog$lambda$92(mutableState5, mutableState25, mutableState6, mutableState8, mutableState26, mutableState41, book, bookViewModel, context2, mutableState7, mutableState29, mutableState28, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    }, composer2, 54), composer2, 390, 2);
                    composer2.endReplaceGroup();
                    i6 = 550789471;
                }
                if (!BookDetailsDialog$lambda$4(mutableState)) {
                    mutableState30 = mutableState;
                    composer2.startReplaceGroup(i6);
                } else {
                    composer2.startReplaceGroup(567310084);
                    ComposerKt.sourceInformation(composer2, "307@16406L28,307@16436L8979,307@16380L9035");
                    ComposerKt.sourceInformationMarkerStart(composer2, 849576447, (String) r5);
                    objRememberedValue34 = composer2.rememberedValue();
                    if (objRememberedValue34 == Composer.Companion.getEmpty()) {
                        mutableState30 = mutableState;
                        objRememberedValue34 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda35
                            public final Object invoke() {
                                return BookDetailsDialogKt.BookDetailsDialog$lambda$94$lambda$93(mutableState30);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue34);
                    } else {
                        mutableState30 = mutableState;
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    final Context context4 = context2;
                    AndroidDialog_androidKt.Dialog((Function0) objRememberedValue34, (DialogProperties) null, ComposableLambdaKt.rememberComposableLambda(-64900244, true, new Function2() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda36
                        public final Object invoke(Object obj2, Object obj3) {
                            return BookDetailsDialogKt.BookDetailsDialog$lambda$117(book, mutableState3, mutableState12, bookViewModel, function0, context4, mutableState13, mutableState30, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    }, composer2, i5), composer2, 390, 2);
                }
                composer2.endReplaceGroup();
                if (!BookDetailsDialog$lambda$7(mutableState2)) {
                    mutableState31 = mutableState2;
                    composer2.startReplaceGroup(i6);
                } else {
                    composer2.startReplaceGroup(576164273);
                    ComposerKt.sourceInformation(composer2, "464@25497L40,464@25539L3674,464@25471L3742");
                    ComposerKt.sourceInformationMarkerStart(composer2, 849867371, (String) r5);
                    objRememberedValue33 = composer2.rememberedValue();
                    if (objRememberedValue33 == Composer.Companion.getEmpty()) {
                        mutableState39 = mutableState2;
                        objRememberedValue33 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda38
                            public final Object invoke() {
                                return BookDetailsDialogKt.BookDetailsDialog$lambda$119$lambda$118(mutableState39);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue33);
                    } else {
                        mutableState39 = mutableState2;
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    final ManagedActivityResultLauncher managedActivityResultLauncher2 = managedActivityResultLauncher;
                    final MutableState mutableState42 = mutableState27;
                    mutableState31 = mutableState39;
                    AndroidDialog_androidKt.Dialog((Function0) objRememberedValue33, (DialogProperties) null, ComposableLambdaKt.rememberComposableLambda(-1512907091, true, new Function2() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda39
                        public final Object invoke(Object obj2, Object obj3) {
                            return BookDetailsDialogKt.BookDetailsDialog$lambda$130(bookViewModel, book, function0, managedActivityResultLauncher2, mutableState39, mutableState42, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    }, composer2, i5), composer2, 390, 2);
                }
                composer2.endReplaceGroup();
                if (!BookDetailsDialog$lambda$13(mutableState24)) {
                    composer3 = composer2;
                    z7 = true;
                    composer3.startReplaceGroup(i6);
                } else {
                    composer2.startReplaceGroup(579926154);
                    ComposerKt.sourceInformation(composer2, "534@29289L34,534@29325L3687,534@29263L3749");
                    ComposerKt.sourceInformationMarkerStart(composer2, 849988709, (String) r5);
                    objRememberedValue32 = composer2.rememberedValue();
                    if (objRememberedValue32 == Composer.Companion.getEmpty()) {
                        mutableState38 = mutableState24;
                        objRememberedValue32 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda40
                            public final Object invoke() {
                                return BookDetailsDialogKt.BookDetailsDialog$lambda$132$lambda$131(mutableState38);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue32);
                    } else {
                        mutableState38 = mutableState24;
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    final ManagedActivityResultLauncher managedActivityResultLauncher3 = managedActivityResultLauncher;
                    final MutableState mutableState43 = mutableState27;
                    mutableState24 = mutableState38;
                    Function2 function2RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1334053358, true, new Function2() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda41
                        public final Object invoke(Object obj2, Object obj3) {
                            return BookDetailsDialogKt.BookDetailsDialog$lambda$143(book, bookViewModel, function0, managedActivityResultLauncher3, mutableState38, mutableState43, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    }, composer2, i5);
                    z7 = true;
                    composer3 = composer2;
                    AndroidDialog_androidKt.Dialog((Function0) objRememberedValue32, (DialogProperties) null, function2RememberComposableLambda, composer3, 390, 2);
                }
                composer3.endReplaceGroup();
                if (!BookDetailsDialog$lambda$46(mutableState28)) {
                    book2 = book;
                    composer4 = composer3;
                    i7 = i4;
                    composer4.startReplaceGroup(i6);
                } else {
                    composer3.startReplaceGroup(583581426);
                    ComposerKt.sourceInformation(composer3, "608@33207L31,604@33059L189");
                    String strBookDetailsDialog$lambda$49 = BookDetailsDialog$lambda$49(mutableState29);
                    ComposerKt.sourceInformationMarkerStart(composer3, 850114082, (String) r5);
                    objRememberedValue31 = composer3.rememberedValue();
                    if (objRememberedValue31 == Composer.Companion.getEmpty()) {
                        objRememberedValue31 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda42
                            public final Object invoke() {
                                return BookDetailsDialogKt.BookDetailsDialog$lambda$145$lambda$144(mutableState28);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue31);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    i7 = i4;
                    QRCodeDisplayDialogKt.QRCodeDisplayDialog(book, strBookDetailsDialog$lambda$49, str, (Function0) objRememberedValue31, composer3, (i4 & 14) | 3072 | (i7 & 896));
                    book2 = book;
                    composer4 = composer3;
                }
                composer4.endReplaceGroup();
                if (!BookDetailsDialog$lambda$52(mutableState17)) {
                    composer5 = composer4;
                    context3 = context2;
                    str2 = str2;
                    mutableState32 = mutableState17;
                    mutableState33 = mutableState18;
                    composer5.startReplaceGroup(i6);
                } else {
                    composer4.startReplaceGroup(583846414);
                    ComposerKt.sourceInformation(composer4, "616@33405L1008,634@34439L31,613@33295L1185");
                    String strBookDetailsDialog$lambda$55 = BookDetailsDialog$lambda$55(mutableState18);
                    ComposerKt.sourceInformationMarkerStart(composer4, 850121395, (String) r5);
                    zChangedInstance2 = composer4.changedInstance(bookViewModel) | composer4.changedInstance(book2) | composer4.changedInstance(context2);
                    objRememberedValue29 = composer4.rememberedValue();
                    if (!zChangedInstance2 || objRememberedValue29 == Composer.Companion.getEmpty()) {
                        final Book book4 = book2;
                        final Context context5 = context2;
                        composer7 = composer4;
                        Function1 function2 = new Function1() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda24
                            public final Object invoke(Object obj2) {
                                return BookDetailsDialogKt.BookDetailsDialog$lambda$147$lambda$146(bookViewModel, book4, context5, mutableState18, mutableState17, (String) obj2);
                            }
                        };
                        context3 = context5;
                        mutableState32 = mutableState17;
                        mutableState33 = mutableState18;
                        composer7.updateRememberedValue(function2);
                        objRememberedValue29 = function2;
                    } else {
                        composer7 = composer4;
                        context3 = context2;
                        mutableState32 = mutableState17;
                        mutableState33 = mutableState18;
                    }
                    Function1 function3 = (Function1) objRememberedValue29;
                    ComposerKt.sourceInformationMarkerEnd(composer7);
                    ComposerKt.sourceInformationMarkerStart(composer7, 850153506, (String) r5);
                    objRememberedValue30 = composer7.rememberedValue();
                    if (objRememberedValue30 == Composer.Companion.getEmpty()) {
                        objRememberedValue30 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda25
                            public final Object invoke() {
                                return BookDetailsDialogKt.BookDetailsDialog$lambda$149$lambda$148(mutableState32);
                            }
                        };
                        composer7.updateRememberedValue(objRememberedValue30);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer7);
                    composer5 = composer7;
                    QRScannerDialogKt.QRScannerDialog(book, strBookDetailsDialog$lambda$55, function3, (Function0) objRememberedValue30, composer5, (i7 & 14) | 3072);
                }
                composer5.endReplaceGroup();
                if (!BookDetailsDialog$lambda$58(mutableState19)) {
                    book3 = book;
                    bookViewModel2 = bookViewModel;
                    mutableState34 = mutableState19;
                    composer5.startReplaceGroup(i6);
                } else {
                    composer5.startReplaceGroup(585044688);
                    ComposerKt.sourceInformation(composer5, "643@34685L92,639@34532L255");
                    FeedbackTargetType feedbackTargetTypeBookDetailsDialog$lambda$61 = BookDetailsDialog$lambda$61(mutableState20);
                    ComposerKt.sourceInformationMarkerStart(composer5, 850161439, (String) r5);
                    z9 = (57344 & i7) == 16384 ? z7 : false;
                    objRememberedValue28 = composer5.rememberedValue();
                    if (!z9 || objRememberedValue28 == Composer.Companion.getEmpty()) {
                        mutableState34 = mutableState19;
                        objRememberedValue28 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda27
                            public final Object invoke() {
                                return BookDetailsDialogKt.BookDetailsDialog$lambda$151$lambda$150(function0, mutableState34);
                            }
                        };
                        composer5.updateRememberedValue(objRememberedValue28);
                    } else {
                        mutableState34 = mutableState19;
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer5);
                    book3 = book;
                    MutualFeedbackDialogKt.MutualFeedbackDialog(book3, feedbackTargetTypeBookDetailsDialog$lambda$61, bookViewModel, (Function0) objRememberedValue28, composer5, (i7 & 14) | ((i7 >> 3) & 896));
                    bookViewModel2 = bookViewModel;
                }
                composer5.endReplaceGroup();
                if (!BookDetailsDialog$lambda$43(mutableState14)) {
                    mutableState35 = mutableState14;
                    composer5.startReplaceGroup(i6);
                } else {
                    composer5.startReplaceGroup(585345047);
                    ComposerKt.sourceInformation(composer5, "651@34890L37,651@34840L88");
                    ComposerKt.sourceInformationMarkerStart(composer5, 850167944, (String) r5);
                    objRememberedValue27 = composer5.rememberedValue();
                    if (objRememberedValue27 == Composer.Companion.getEmpty()) {
                        mutableState35 = mutableState14;
                        objRememberedValue27 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda28
                            public final Object invoke() {
                                return BookDetailsDialogKt.BookDetailsDialog$lambda$153$lambda$152(mutableState35);
                            }
                        };
                        composer5.updateRememberedValue(objRememberedValue27);
                    } else {
                        mutableState35 = mutableState14;
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer5);
                    BookConditionPhotoDialog(book3, (Function0) objRememberedValue27, composer5, (i7 & 14) | 48);
                }
                composer5.endReplaceGroup();
                if (!BookDetailsDialog$lambda$64(mutableState21)) {
                    mutableState36 = mutableState21;
                    composer5.startReplaceGroup(i6);
                } else {
                    composer5.startReplaceGroup(585488019);
                    ComposerKt.sourceInformation(composer5, "658@35090L38,655@34982L156");
                    ComposerKt.sourceInformationMarkerStart(composer5, 850174345, (String) r5);
                    objRememberedValue26 = composer5.rememberedValue();
                    if (objRememberedValue26 == Composer.Companion.getEmpty()) {
                        mutableState36 = mutableState21;
                        objRememberedValue26 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda29
                            public final Object invoke() {
                                return BookDetailsDialogKt.BookDetailsDialog$lambda$155$lambda$154(mutableState36);
                            }
                        };
                        composer5.updateRememberedValue(objRememberedValue26);
                    } else {
                        mutableState36 = mutableState21;
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer5);
                    ReadingCompanionDialogKt.ReadingCompanionDialog(book3, bookViewModel2, (Function0) objRememberedValue26, composer5, (i7 & 14) | 384 | ((i7 >> 6) & 112));
                }
                composer5.endReplaceGroup();
                if (BookDetailsDialog$lambda$67(mutableState22)) {
                    composer5.startReplaceGroup(585695874);
                    ComposerKt.sourceInformation(composer5, "669@35477L32,664@35294L225");
                    if (z4) {
                        ownerName = book3.getBorrowerName();
                        if (ownerName != null && (ownerName = book3.getRequestedByName()) == null) {
                            str3 = str2;
                        }
                        String id = book.getId();
                        String title = book.getTitle();
                        ComposerKt.sourceInformationMarkerStart(composer5, 850186723, (String) r5);
                        objRememberedValue25 = composer5.rememberedValue();
                        if (objRememberedValue25 == Composer.Companion.getEmpty()) {
                            mutableState37 = mutableState22;
                            objRememberedValue25 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda30
                                public final Object invoke() {
                                    return BookDetailsDialogKt.BookDetailsDialog$lambda$157$lambda$156(mutableState37);
                                }
                            };
                            composer5.updateRememberedValue(objRememberedValue25);
                        } else {
                            mutableState37 = mutableState22;
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        Composer composer8 = composer5;
                        SafeMeetupDialogKt.SafeMeetupDialog(id, title, str3, bookViewModel, (Function0) objRememberedValue25, composer8, (i7 & 7168) | 24576);
                        composer8.endReplaceGroup();
                        composer5 = composer8;
                    } else {
                        ownerName = book3.getOwnerName();
                    }
                    str3 = ownerName;
                    String id2 = book.getId();
                    String title2 = book.getTitle();
                    ComposerKt.sourceInformationMarkerStart(composer5, 850186723, (String) r5);
                    objRememberedValue25 = composer5.rememberedValue();
                    if (objRememberedValue25 == Composer.Companion.getEmpty()) {
                        mutableState37 = mutableState22;
                        objRememberedValue25 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda30
                            public final Object invoke() {
                                return BookDetailsDialogKt.BookDetailsDialog$lambda$157$lambda$156(mutableState37);
                            }
                        };
                        composer5.updateRememberedValue(objRememberedValue25);
                    } else {
                        mutableState37 = mutableState22;
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer5);
                    Composer composer9 = composer5;
                    SafeMeetupDialogKt.SafeMeetupDialog(id2, title2, str3, bookViewModel, (Function0) objRememberedValue25, composer9, (i7 & 7168) | 24576);
                    composer9.endReplaceGroup();
                    composer5 = composer9;
                } else {
                    mutableState37 = mutableState22;
                    Composer composer10 = composer5;
                    composer10.startReplaceGroup(i6);
                    composer10.endReplaceGroup();
                }
                final ManagedActivityResultLauncher managedActivityResultLauncher4 = managedActivityResultLauncher;
                int i13 = i7;
                final boolean z10 = z4;
                final MutableState mutableState44 = mutableState31;
                final MutableState mutableState45 = mutableState28;
                Composer composer11 = composer5;
                final MutableState mutableState46 = mutableState30;
                final MutableState mutableState47 = mutableState32;
                final boolean z11 = z5;
                final boolean z12 = z6;
                final Context context6 = context3;
                final MutableState mutableState48 = mutableState34;
                final MutableState mutableState49 = mutableState36;
                final MutableState mutableState50 = mutableState35;
                final MutableState mutableState51 = mutableState27;
                final MutableState mutableState52 = mutableState29;
                final MutableState mutableState53 = mutableState24;
                AndroidDialog_androidKt.Dialog(function0, (DialogProperties) null, ComposableLambdaKt.rememberComposableLambda(2029675546, true, new Function2() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda31
                    public final Object invoke(Object obj2, Object obj3) {
                        return BookDetailsDialogKt.BookDetailsDialog$lambda$343(book, audioHelperRememberAudioHelper, function0, function1, bookViewModel, mutableState40, z10, str, z11, z12, mutableState53, mutableState44, mutableState50, context6, mutableState37, mutableState20, mutableState48, managedActivityResultLauncher4, mutableState51, mutableState52, mutableState45, mutableState33, mutableState47, mutableState46, mutableState49, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, composer11, 54), composer11, ((i13 >> 12) & 14) | 384, 2);
                composer6 = composer11;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z8 = z3;
            }
            scopeUpdateScopeEndRestartGroup = composer6.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda32
                    public final Object invoke(Object obj2, Object obj3) {
                        return BookDetailsDialogKt.BookDetailsDialog$lambda$344(book, z8, str, bookViewModel, function0, function1, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i3 |= 48;
        z2 = z;
        if ((i & 384) == 0) {
            if (composerStartRestartGroup.changed(str)) {
                i11 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
            } else {
                i11 = UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            i3 |= i11;
        }
        if ((i & 3072) == 0) {
            if (composerStartRestartGroup.changedInstance(bookViewModel)) {
                i10 = 2048;
            } else {
                i10 = UserVerificationMethods.USER_VERIFY_ALL;
            }
            i3 |= i10;
        }
        if ((i & 24576) == 0) {
            if (composerStartRestartGroup.changedInstance(function0)) {
                i9 = 16384;
            } else {
                i9 = FragmentTransaction.TRANSIT_EXIT_MASK;
            }
            i3 |= i9;
        }
        if ((196608 & i) == 0) {
            if (composerStartRestartGroup.changedInstance(function1)) {
                i8 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i8 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i3 |= i8;
        }
        if ((74899 & i3) != 74898) {
            if (i12 != 0) {
                z3 = false;
            } else {
                z3 = z2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-48278397, i3, -1, "com.example.ui.screens.BookDetailsDialog (BookDetailsDialog.kt:48)");
            }
            final AudioHelper audioHelperRememberAudioHelper2 = AudioHelperKt.rememberAudioHelper(composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849110405, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState410 = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Intrinsics.checkNotNullExpressionValue(StringsKt.trim(str).toString().toLowerCase(Locale.ROOT), "toLowerCase(...)");
            if (z3) {
                z4 = true;
            } else {
                z4 = true;
            }
            requestedByName = book.getRequestedByName();
            if (requestedByName == null) {
                z5 = false;
            } else {
                z5 = false;
            }
            borrowerName = book.getBorrowerName();
            if (borrowerName == null) {
                z6 = false;
            } else {
                z6 = false;
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller2 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller2);
                objRememberedValue2 = compositionScopedCoroutineScopeCanceller2;
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849125445, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            mutableState = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849127845, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            mutableState2 = (MutableState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849129870, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt.mutableStateOf$default(book.getCondition(), (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            mutableState3 = (MutableState) objRememberedValue5;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849132357, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == Composer.Companion.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            mutableState4 = (MutableState) objRememberedValue6;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849134125, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == Composer.Companion.getEmpty()) {
                objRememberedValue7 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            mutableState5 = (MutableState) objRememberedValue7;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849136510, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            i4 = i3;
            if (objRememberedValue8 == Composer.Companion.getEmpty()) {
                objRememberedValue8 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            mutableState6 = (MutableState) objRememberedValue8;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849139405, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue9 == Composer.Companion.getEmpty()) {
                objRememberedValue9 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            mutableState7 = (MutableState) objRememberedValue9;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849141573, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue10 == Composer.Companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default4 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default4);
                objRememberedValue10 = mutableStateMutableStateOf$default4;
            }
            mutableState8 = (MutableState) objRememberedValue10;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849143629, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue11 == Composer.Companion.getEmpty()) {
                objRememberedValue11 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
            }
            mutableState9 = (MutableState) objRememberedValue11;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849145965, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue12 == Composer.Companion.getEmpty()) {
                objRememberedValue12 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
            }
            mutableState10 = (MutableState) objRememberedValue12;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849148485, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue13 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue13 == Composer.Companion.getEmpty()) {
                objRememberedValue13 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
            }
            mutableState11 = (MutableState) objRememberedValue13;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849150177, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue14 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue14 == Composer.Companion.getEmpty()) {
                objRememberedValue14 = SnapshotStateKt.mutableStateOf$default(5, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
            }
            mutableState12 = (MutableState) objRememberedValue14;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849151874, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue15 = composerStartRestartGroup.rememberedValue();
            str2 = "";
            if (objRememberedValue15 == Composer.Companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default5 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default5);
                objRememberedValue15 = mutableStateMutableStateOf$default5;
            }
            mutableState13 = (MutableState) objRememberedValue15;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849154085, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue16 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue16 == Composer.Companion.getEmpty()) {
                objRememberedValue16 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue16);
            }
            mutableState14 = (MutableState) objRememberedValue16;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849156197, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue17 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue17 == Composer.Companion.getEmpty()) {
                objRememberedValue17 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue17);
            }
            mutableState15 = (MutableState) objRememberedValue17;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849158122, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue18 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue18 == Composer.Companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default6 = SnapshotStateKt.mutableStateOf$default("HANDOVER", (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default6);
                objRememberedValue18 = mutableStateMutableStateOf$default6;
            }
            mutableState16 = (MutableState) objRememberedValue18;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849160389, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue19 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue19 == Composer.Companion.getEmpty()) {
                objRememberedValue19 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue19);
            }
            mutableState17 = (MutableState) objRememberedValue19;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849162314, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue20 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue20 == Composer.Companion.getEmpty()) {
                objRememberedValue20 = SnapshotStateKt.mutableStateOf$default("HANDOVER", (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue20);
            }
            mutableState18 = (MutableState) objRememberedValue20;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849164741, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue21 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue21 == Composer.Companion.getEmpty()) {
                objRememberedValue21 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue21);
            }
            mutableState19 = (MutableState) objRememberedValue21;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849166862, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue22 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue22 == Composer.Companion.getEmpty()) {
                objRememberedValue22 = SnapshotStateKt.mutableStateOf$default(FeedbackTargetType.BORROWER_TO_LENDER_AND_BOOK, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue22);
            }
            mutableState20 = (MutableState) objRememberedValue22;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849170469, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue23 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue23 == Composer.Companion.getEmpty()) {
                objRememberedValue23 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue23);
            }
            mutableState21 = (MutableState) objRememberedValue23;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849172613, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue24 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue24 == Composer.Companion.getEmpty()) {
                objRememberedValue24 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue24);
            }
            mutableState22 = (MutableState) objRememberedValue24;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            CompositionLocal localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composerStartRestartGroup.consume(localContext2);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            context = (Context) objConsume2;
            ActivityResultContract takePicturePreview2 = new ActivityResultContracts.TakePicturePreview();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849182009, "CC(remember):BookDetailsDialog.kt#9igjgp");
            zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(bookViewModel) | composerStartRestartGroup.changedInstance(book);
            Object objRememberedValue37 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance) {
                composer2 = composerStartRestartGroup;
                mutableState23 = mutableState10;
                mutableState24 = mutableState4;
                obj = new Function1() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda23
                    public final Object invoke(Object obj2) {
                        return BookDetailsDialogKt.BookDetailsDialog$lambda$70$lambda$69(coroutineScope, mutableState6, mutableState7, mutableState11, mutableState8, mutableState9, mutableState23, bookViewModel, book, mutableState24, mutableState2, (Bitmap) obj2);
                    }
                };
                mutableState25 = mutableState11;
                mutableState26 = mutableState9;
                composer2.updateRememberedValue(obj);
            } else {
                composer2 = composerStartRestartGroup;
                mutableState23 = mutableState10;
                mutableState24 = mutableState4;
                obj = new Function1() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda23
                    public final Object invoke(Object obj2) {
                        return BookDetailsDialogKt.BookDetailsDialog$lambda$70$lambda$69(coroutineScope, mutableState6, mutableState7, mutableState11, mutableState8, mutableState9, mutableState23, bookViewModel, book, mutableState24, mutableState2, (Bitmap) obj2);
                    }
                };
                mutableState25 = mutableState11;
                mutableState26 = mutableState9;
                composer2.updateRememberedValue(obj);
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(takePicturePreview2, (Function1) obj, composer2, 0);
            if (BookDetailsDialog$lambda$34(mutableState25)) {
                mutableState27 = mutableState5;
                managedActivityResultLauncher = managedActivityResultLauncherRememberLauncherForActivityResult;
                mutableState28 = mutableState15;
                mutableState29 = mutableState16;
                context2 = context;
                i5 = 54;
                i6 = 550789471;
                composer2.startReplaceGroup(550789471);
                composer2.endReplaceGroup();
            } else {
                mutableState27 = mutableState5;
                managedActivityResultLauncher = managedActivityResultLauncherRememberLauncherForActivityResult;
                mutableState28 = mutableState15;
                mutableState29 = mutableState16;
                context2 = context;
                i5 = 54;
                i6 = 550789471;
                composer2.startReplaceGroup(550789471);
                composer2.endReplaceGroup();
            }
            if (!BookDetailsDialog$lambda$4(mutableState)) {
                mutableState30 = mutableState;
                composer2.startReplaceGroup(i6);
            } else {
                composer2.startReplaceGroup(567310084);
                ComposerKt.sourceInformation(composer2, "307@16406L28,307@16436L8979,307@16380L9035");
                ComposerKt.sourceInformationMarkerStart(composer2, 849576447, (String) r5);
                objRememberedValue34 = composer2.rememberedValue();
                if (objRememberedValue34 == Composer.Companion.getEmpty()) {
                    mutableState30 = mutableState;
                    objRememberedValue34 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda35
                        public final Object invoke() {
                            return BookDetailsDialogKt.BookDetailsDialog$lambda$94$lambda$93(mutableState30);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue34);
                } else {
                    mutableState30 = mutableState;
                }
                ComposerKt.sourceInformationMarkerEnd(composer2);
                final Context context7 = context2;
                AndroidDialog_androidKt.Dialog((Function0) objRememberedValue34, (DialogProperties) null, ComposableLambdaKt.rememberComposableLambda(-64900244, true, new Function2() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda36
                    public final Object invoke(Object obj2, Object obj3) {
                        return BookDetailsDialogKt.BookDetailsDialog$lambda$117(book, mutableState3, mutableState12, bookViewModel, function0, context7, mutableState13, mutableState30, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, composer2, i5), composer2, 390, 2);
            }
            composer2.endReplaceGroup();
            if (!BookDetailsDialog$lambda$7(mutableState2)) {
                mutableState31 = mutableState2;
                composer2.startReplaceGroup(i6);
            } else {
                composer2.startReplaceGroup(576164273);
                ComposerKt.sourceInformation(composer2, "464@25497L40,464@25539L3674,464@25471L3742");
                ComposerKt.sourceInformationMarkerStart(composer2, 849867371, (String) r5);
                objRememberedValue33 = composer2.rememberedValue();
                if (objRememberedValue33 == Composer.Companion.getEmpty()) {
                    mutableState39 = mutableState2;
                    objRememberedValue33 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda38
                        public final Object invoke() {
                            return BookDetailsDialogKt.BookDetailsDialog$lambda$119$lambda$118(mutableState39);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue33);
                } else {
                    mutableState39 = mutableState2;
                }
                ComposerKt.sourceInformationMarkerEnd(composer2);
                final ManagedActivityResultLauncher managedActivityResultLauncher5 = managedActivityResultLauncher;
                final MutableState mutableState411 = mutableState27;
                mutableState31 = mutableState39;
                AndroidDialog_androidKt.Dialog((Function0) objRememberedValue33, (DialogProperties) null, ComposableLambdaKt.rememberComposableLambda(-1512907091, true, new Function2() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda39
                    public final Object invoke(Object obj2, Object obj3) {
                        return BookDetailsDialogKt.BookDetailsDialog$lambda$130(bookViewModel, book, function0, managedActivityResultLauncher5, mutableState39, mutableState411, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, composer2, i5), composer2, 390, 2);
            }
            composer2.endReplaceGroup();
            if (!BookDetailsDialog$lambda$13(mutableState24)) {
                composer3 = composer2;
                z7 = true;
                composer3.startReplaceGroup(i6);
            } else {
                composer2.startReplaceGroup(579926154);
                ComposerKt.sourceInformation(composer2, "534@29289L34,534@29325L3687,534@29263L3749");
                ComposerKt.sourceInformationMarkerStart(composer2, 849988709, (String) r5);
                objRememberedValue32 = composer2.rememberedValue();
                if (objRememberedValue32 == Composer.Companion.getEmpty()) {
                    mutableState38 = mutableState24;
                    objRememberedValue32 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda40
                        public final Object invoke() {
                            return BookDetailsDialogKt.BookDetailsDialog$lambda$132$lambda$131(mutableState38);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue32);
                } else {
                    mutableState38 = mutableState24;
                }
                ComposerKt.sourceInformationMarkerEnd(composer2);
                final ManagedActivityResultLauncher managedActivityResultLauncher6 = managedActivityResultLauncher;
                final MutableState mutableState412 = mutableState27;
                mutableState24 = mutableState38;
                Function2 function2RememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(1334053358, true, new Function2() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda41
                    public final Object invoke(Object obj2, Object obj3) {
                        return BookDetailsDialogKt.BookDetailsDialog$lambda$143(book, bookViewModel, function0, managedActivityResultLauncher6, mutableState38, mutableState412, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, composer2, i5);
                z7 = true;
                composer3 = composer2;
                AndroidDialog_androidKt.Dialog((Function0) objRememberedValue32, (DialogProperties) null, function2RememberComposableLambda2, composer3, 390, 2);
            }
            composer3.endReplaceGroup();
            if (!BookDetailsDialog$lambda$46(mutableState28)) {
                book2 = book;
                composer4 = composer3;
                i7 = i4;
                composer4.startReplaceGroup(i6);
            } else {
                composer3.startReplaceGroup(583581426);
                ComposerKt.sourceInformation(composer3, "608@33207L31,604@33059L189");
                String strBookDetailsDialog$lambda$410 = BookDetailsDialog$lambda$49(mutableState29);
                ComposerKt.sourceInformationMarkerStart(composer3, 850114082, (String) r5);
                objRememberedValue31 = composer3.rememberedValue();
                if (objRememberedValue31 == Composer.Companion.getEmpty()) {
                    objRememberedValue31 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda42
                        public final Object invoke() {
                            return BookDetailsDialogKt.BookDetailsDialog$lambda$145$lambda$144(mutableState28);
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue31);
                }
                ComposerKt.sourceInformationMarkerEnd(composer3);
                i7 = i4;
                QRCodeDisplayDialogKt.QRCodeDisplayDialog(book, strBookDetailsDialog$lambda$410, str, (Function0) objRememberedValue31, composer3, (i4 & 14) | 3072 | (i7 & 896));
                book2 = book;
                composer4 = composer3;
            }
            composer4.endReplaceGroup();
            if (!BookDetailsDialog$lambda$52(mutableState17)) {
                composer5 = composer4;
                context3 = context2;
                str2 = str2;
                mutableState32 = mutableState17;
                mutableState33 = mutableState18;
                composer5.startReplaceGroup(i6);
            } else {
                composer4.startReplaceGroup(583846414);
                ComposerKt.sourceInformation(composer4, "616@33405L1008,634@34439L31,613@33295L1185");
                String strBookDetailsDialog$lambda$56 = BookDetailsDialog$lambda$55(mutableState18);
                ComposerKt.sourceInformationMarkerStart(composer4, 850121395, (String) r5);
                zChangedInstance2 = composer4.changedInstance(bookViewModel) | composer4.changedInstance(book2) | composer4.changedInstance(context2);
                objRememberedValue29 = composer4.rememberedValue();
                if (zChangedInstance2) {
                    final Book book5 = book2;
                    final Context context8 = context2;
                    composer7 = composer4;
                    Function1 function4 = new Function1() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda24
                        public final Object invoke(Object obj2) {
                            return BookDetailsDialogKt.BookDetailsDialog$lambda$147$lambda$146(bookViewModel, book5, context8, mutableState18, mutableState17, (String) obj2);
                        }
                    };
                    context3 = context8;
                    mutableState32 = mutableState17;
                    mutableState33 = mutableState18;
                    composer7.updateRememberedValue(function4);
                    objRememberedValue29 = function4;
                } else {
                    final Book book6 = book2;
                    final Context context9 = context2;
                    composer7 = composer4;
                    Function1 function5 = new Function1() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda24
                        public final Object invoke(Object obj2) {
                            return BookDetailsDialogKt.BookDetailsDialog$lambda$147$lambda$146(bookViewModel, book6, context9, mutableState18, mutableState17, (String) obj2);
                        }
                    };
                    context3 = context9;
                    mutableState32 = mutableState17;
                    mutableState33 = mutableState18;
                    composer7.updateRememberedValue(function5);
                    objRememberedValue29 = function5;
                }
                Function1 function6 = (Function1) objRememberedValue29;
                ComposerKt.sourceInformationMarkerEnd(composer7);
                ComposerKt.sourceInformationMarkerStart(composer7, 850153506, (String) r5);
                objRememberedValue30 = composer7.rememberedValue();
                if (objRememberedValue30 == Composer.Companion.getEmpty()) {
                    objRememberedValue30 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda25
                        public final Object invoke() {
                            return BookDetailsDialogKt.BookDetailsDialog$lambda$149$lambda$148(mutableState32);
                        }
                    };
                    composer7.updateRememberedValue(objRememberedValue30);
                }
                ComposerKt.sourceInformationMarkerEnd(composer7);
                composer5 = composer7;
                QRScannerDialogKt.QRScannerDialog(book, strBookDetailsDialog$lambda$56, function6, (Function0) objRememberedValue30, composer5, (i7 & 14) | 3072);
            }
            composer5.endReplaceGroup();
            if (!BookDetailsDialog$lambda$58(mutableState19)) {
                book3 = book;
                bookViewModel2 = bookViewModel;
                mutableState34 = mutableState19;
                composer5.startReplaceGroup(i6);
            } else {
                composer5.startReplaceGroup(585044688);
                ComposerKt.sourceInformation(composer5, "643@34685L92,639@34532L255");
                FeedbackTargetType feedbackTargetTypeBookDetailsDialog$lambda$62 = BookDetailsDialog$lambda$61(mutableState20);
                ComposerKt.sourceInformationMarkerStart(composer5, 850161439, (String) r5);
                if ((57344 & i7) == 16384) {
                }
                objRememberedValue28 = composer5.rememberedValue();
                if (z9) {
                    mutableState34 = mutableState19;
                    objRememberedValue28 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda27
                        public final Object invoke() {
                            return BookDetailsDialogKt.BookDetailsDialog$lambda$151$lambda$150(function0, mutableState34);
                        }
                    };
                    composer5.updateRememberedValue(objRememberedValue28);
                } else {
                    mutableState34 = mutableState19;
                    objRememberedValue28 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda27
                        public final Object invoke() {
                            return BookDetailsDialogKt.BookDetailsDialog$lambda$151$lambda$150(function0, mutableState34);
                        }
                    };
                    composer5.updateRememberedValue(objRememberedValue28);
                }
                ComposerKt.sourceInformationMarkerEnd(composer5);
                book3 = book;
                MutualFeedbackDialogKt.MutualFeedbackDialog(book3, feedbackTargetTypeBookDetailsDialog$lambda$62, bookViewModel, (Function0) objRememberedValue28, composer5, (i7 & 14) | ((i7 >> 3) & 896));
                bookViewModel2 = bookViewModel;
            }
            composer5.endReplaceGroup();
            if (!BookDetailsDialog$lambda$43(mutableState14)) {
                mutableState35 = mutableState14;
                composer5.startReplaceGroup(i6);
            } else {
                composer5.startReplaceGroup(585345047);
                ComposerKt.sourceInformation(composer5, "651@34890L37,651@34840L88");
                ComposerKt.sourceInformationMarkerStart(composer5, 850167944, (String) r5);
                objRememberedValue27 = composer5.rememberedValue();
                if (objRememberedValue27 == Composer.Companion.getEmpty()) {
                    mutableState35 = mutableState14;
                    objRememberedValue27 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda28
                        public final Object invoke() {
                            return BookDetailsDialogKt.BookDetailsDialog$lambda$153$lambda$152(mutableState35);
                        }
                    };
                    composer5.updateRememberedValue(objRememberedValue27);
                } else {
                    mutableState35 = mutableState14;
                }
                ComposerKt.sourceInformationMarkerEnd(composer5);
                BookConditionPhotoDialog(book3, (Function0) objRememberedValue27, composer5, (i7 & 14) | 48);
            }
            composer5.endReplaceGroup();
            if (!BookDetailsDialog$lambda$64(mutableState21)) {
                mutableState36 = mutableState21;
                composer5.startReplaceGroup(i6);
            } else {
                composer5.startReplaceGroup(585488019);
                ComposerKt.sourceInformation(composer5, "658@35090L38,655@34982L156");
                ComposerKt.sourceInformationMarkerStart(composer5, 850174345, (String) r5);
                objRememberedValue26 = composer5.rememberedValue();
                if (objRememberedValue26 == Composer.Companion.getEmpty()) {
                    mutableState36 = mutableState21;
                    objRememberedValue26 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda29
                        public final Object invoke() {
                            return BookDetailsDialogKt.BookDetailsDialog$lambda$155$lambda$154(mutableState36);
                        }
                    };
                    composer5.updateRememberedValue(objRememberedValue26);
                } else {
                    mutableState36 = mutableState21;
                }
                ComposerKt.sourceInformationMarkerEnd(composer5);
                ReadingCompanionDialogKt.ReadingCompanionDialog(book3, bookViewModel2, (Function0) objRememberedValue26, composer5, (i7 & 14) | 384 | ((i7 >> 6) & 112));
            }
            composer5.endReplaceGroup();
            if (BookDetailsDialog$lambda$67(mutableState22)) {
                composer5.startReplaceGroup(585695874);
                ComposerKt.sourceInformation(composer5, "669@35477L32,664@35294L225");
                if (z4) {
                    ownerName = book3.getBorrowerName();
                    if (ownerName != null) {
                    }
                    String id3 = book.getId();
                    String title3 = book.getTitle();
                    ComposerKt.sourceInformationMarkerStart(composer5, 850186723, (String) r5);
                    objRememberedValue25 = composer5.rememberedValue();
                    if (objRememberedValue25 == Composer.Companion.getEmpty()) {
                        mutableState37 = mutableState22;
                        objRememberedValue25 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda30
                            public final Object invoke() {
                                return BookDetailsDialogKt.BookDetailsDialog$lambda$157$lambda$156(mutableState37);
                            }
                        };
                        composer5.updateRememberedValue(objRememberedValue25);
                    } else {
                        mutableState37 = mutableState22;
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer5);
                    Composer composer12 = composer5;
                    SafeMeetupDialogKt.SafeMeetupDialog(id3, title3, str3, bookViewModel, (Function0) objRememberedValue25, composer12, (i7 & 7168) | 24576);
                    composer12.endReplaceGroup();
                    composer5 = composer12;
                } else {
                    ownerName = book3.getOwnerName();
                }
                str3 = ownerName;
                String id4 = book.getId();
                String title4 = book.getTitle();
                ComposerKt.sourceInformationMarkerStart(composer5, 850186723, (String) r5);
                objRememberedValue25 = composer5.rememberedValue();
                if (objRememberedValue25 == Composer.Companion.getEmpty()) {
                    mutableState37 = mutableState22;
                    objRememberedValue25 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda30
                        public final Object invoke() {
                            return BookDetailsDialogKt.BookDetailsDialog$lambda$157$lambda$156(mutableState37);
                        }
                    };
                    composer5.updateRememberedValue(objRememberedValue25);
                } else {
                    mutableState37 = mutableState22;
                }
                ComposerKt.sourceInformationMarkerEnd(composer5);
                Composer composer13 = composer5;
                SafeMeetupDialogKt.SafeMeetupDialog(id4, title4, str3, bookViewModel, (Function0) objRememberedValue25, composer13, (i7 & 7168) | 24576);
                composer13.endReplaceGroup();
                composer5 = composer13;
            } else {
                mutableState37 = mutableState22;
                Composer composer14 = composer5;
                composer14.startReplaceGroup(i6);
                composer14.endReplaceGroup();
            }
            final ManagedActivityResultLauncher managedActivityResultLauncher7 = managedActivityResultLauncher;
            int i14 = i7;
            final boolean z13 = z4;
            final MutableState mutableState413 = mutableState31;
            final MutableState mutableState414 = mutableState28;
            Composer composer15 = composer5;
            final MutableState mutableState415 = mutableState30;
            final MutableState mutableState416 = mutableState32;
            final boolean z14 = z5;
            final boolean z15 = z6;
            final Context context10 = context3;
            final MutableState mutableState417 = mutableState34;
            final MutableState mutableState418 = mutableState36;
            final MutableState mutableState54 = mutableState35;
            final MutableState mutableState55 = mutableState27;
            final MutableState mutableState56 = mutableState29;
            final MutableState mutableState57 = mutableState24;
            AndroidDialog_androidKt.Dialog(function0, (DialogProperties) null, ComposableLambdaKt.rememberComposableLambda(2029675546, true, new Function2() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda31
                public final Object invoke(Object obj2, Object obj3) {
                    return BookDetailsDialogKt.BookDetailsDialog$lambda$343(book, audioHelperRememberAudioHelper2, function0, function1, bookViewModel, mutableState410, z13, str, z14, z15, mutableState57, mutableState413, mutableState54, context10, mutableState37, mutableState20, mutableState417, managedActivityResultLauncher7, mutableState55, mutableState56, mutableState414, mutableState33, mutableState416, mutableState415, mutableState418, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer15, 54), composer15, ((i14 >> 12) & 14) | 384, 2);
            composer6 = composer15;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z8 = z3;
        } else {
            if (i12 != 0) {
                z3 = false;
            } else {
                z3 = z2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-48278397, i3, -1, "com.example.ui.screens.BookDetailsDialog (BookDetailsDialog.kt:48)");
            }
            final AudioHelper audioHelperRememberAudioHelper3 = AudioHelperKt.rememberAudioHelper(composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849110405, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState419 = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Intrinsics.checkNotNullExpressionValue(StringsKt.trim(str).toString().toLowerCase(Locale.ROOT), "toLowerCase(...)");
            if (z3) {
                z4 = true;
            } else {
                z4 = true;
            }
            requestedByName = book.getRequestedByName();
            if (requestedByName == null) {
                z5 = false;
            } else {
                z5 = false;
            }
            borrowerName = book.getBorrowerName();
            if (borrowerName == null) {
                z6 = false;
            } else {
                z6 = false;
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller3 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller3);
                objRememberedValue2 = compositionScopedCoroutineScopeCanceller3;
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849125445, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            mutableState = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849127845, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            mutableState2 = (MutableState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849129870, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt.mutableStateOf$default(book.getCondition(), (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            mutableState3 = (MutableState) objRememberedValue5;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849132357, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == Composer.Companion.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            mutableState4 = (MutableState) objRememberedValue6;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849134125, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == Composer.Companion.getEmpty()) {
                objRememberedValue7 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            mutableState5 = (MutableState) objRememberedValue7;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849136510, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            i4 = i3;
            if (objRememberedValue8 == Composer.Companion.getEmpty()) {
                objRememberedValue8 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            mutableState6 = (MutableState) objRememberedValue8;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849139405, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue9 == Composer.Companion.getEmpty()) {
                objRememberedValue9 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            mutableState7 = (MutableState) objRememberedValue9;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849141573, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue10 == Composer.Companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default7 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default7);
                objRememberedValue10 = mutableStateMutableStateOf$default7;
            }
            mutableState8 = (MutableState) objRememberedValue10;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849143629, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue11 == Composer.Companion.getEmpty()) {
                objRememberedValue11 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
            }
            mutableState9 = (MutableState) objRememberedValue11;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849145965, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue12 == Composer.Companion.getEmpty()) {
                objRememberedValue12 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
            }
            mutableState10 = (MutableState) objRememberedValue12;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849148485, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue13 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue13 == Composer.Companion.getEmpty()) {
                objRememberedValue13 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
            }
            mutableState11 = (MutableState) objRememberedValue13;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849150177, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue14 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue14 == Composer.Companion.getEmpty()) {
                objRememberedValue14 = SnapshotStateKt.mutableStateOf$default(5, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
            }
            mutableState12 = (MutableState) objRememberedValue14;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849151874, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue15 = composerStartRestartGroup.rememberedValue();
            str2 = "";
            if (objRememberedValue15 == Composer.Companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default8 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default8);
                objRememberedValue15 = mutableStateMutableStateOf$default8;
            }
            mutableState13 = (MutableState) objRememberedValue15;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849154085, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue16 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue16 == Composer.Companion.getEmpty()) {
                objRememberedValue16 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue16);
            }
            mutableState14 = (MutableState) objRememberedValue16;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849156197, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue17 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue17 == Composer.Companion.getEmpty()) {
                objRememberedValue17 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue17);
            }
            mutableState15 = (MutableState) objRememberedValue17;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849158122, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue18 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue18 == Composer.Companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default9 = SnapshotStateKt.mutableStateOf$default("HANDOVER", (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default9);
                objRememberedValue18 = mutableStateMutableStateOf$default9;
            }
            mutableState16 = (MutableState) objRememberedValue18;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849160389, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue19 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue19 == Composer.Companion.getEmpty()) {
                objRememberedValue19 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue19);
            }
            mutableState17 = (MutableState) objRememberedValue19;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849162314, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue20 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue20 == Composer.Companion.getEmpty()) {
                objRememberedValue20 = SnapshotStateKt.mutableStateOf$default("HANDOVER", (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue20);
            }
            mutableState18 = (MutableState) objRememberedValue20;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849164741, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue21 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue21 == Composer.Companion.getEmpty()) {
                objRememberedValue21 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue21);
            }
            mutableState19 = (MutableState) objRememberedValue21;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849166862, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue22 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue22 == Composer.Companion.getEmpty()) {
                objRememberedValue22 = SnapshotStateKt.mutableStateOf$default(FeedbackTargetType.BORROWER_TO_LENDER_AND_BOOK, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue22);
            }
            mutableState20 = (MutableState) objRememberedValue22;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849170469, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue23 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue23 == Composer.Companion.getEmpty()) {
                objRememberedValue23 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue23);
            }
            mutableState21 = (MutableState) objRememberedValue23;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849172613, "CC(remember):BookDetailsDialog.kt#9igjgp");
            objRememberedValue24 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue24 == Composer.Companion.getEmpty()) {
                objRememberedValue24 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue24);
            }
            mutableState22 = (MutableState) objRememberedValue24;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            CompositionLocal localContext3 = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume3 = composerStartRestartGroup.consume(localContext3);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            context = (Context) objConsume3;
            ActivityResultContract takePicturePreview3 = new ActivityResultContracts.TakePicturePreview();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 849182009, "CC(remember):BookDetailsDialog.kt#9igjgp");
            zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(bookViewModel) | composerStartRestartGroup.changedInstance(book);
            Object objRememberedValue38 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance) {
                composer2 = composerStartRestartGroup;
                mutableState23 = mutableState10;
                mutableState24 = mutableState4;
                obj = new Function1() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda23
                    public final Object invoke(Object obj2) {
                        return BookDetailsDialogKt.BookDetailsDialog$lambda$70$lambda$69(coroutineScope, mutableState6, mutableState7, mutableState11, mutableState8, mutableState9, mutableState23, bookViewModel, book, mutableState24, mutableState2, (Bitmap) obj2);
                    }
                };
                mutableState25 = mutableState11;
                mutableState26 = mutableState9;
                composer2.updateRememberedValue(obj);
            } else {
                composer2 = composerStartRestartGroup;
                mutableState23 = mutableState10;
                mutableState24 = mutableState4;
                obj = new Function1() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda23
                    public final Object invoke(Object obj2) {
                        return BookDetailsDialogKt.BookDetailsDialog$lambda$70$lambda$69(coroutineScope, mutableState6, mutableState7, mutableState11, mutableState8, mutableState9, mutableState23, bookViewModel, book, mutableState24, mutableState2, (Bitmap) obj2);
                    }
                };
                mutableState25 = mutableState11;
                mutableState26 = mutableState9;
                composer2.updateRememberedValue(obj);
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(takePicturePreview3, (Function1) obj, composer2, 0);
            if (BookDetailsDialog$lambda$34(mutableState25)) {
                mutableState27 = mutableState5;
                managedActivityResultLauncher = managedActivityResultLauncherRememberLauncherForActivityResult;
                mutableState28 = mutableState15;
                mutableState29 = mutableState16;
                context2 = context;
                i5 = 54;
                i6 = 550789471;
                composer2.startReplaceGroup(550789471);
                composer2.endReplaceGroup();
            } else {
                mutableState27 = mutableState5;
                managedActivityResultLauncher = managedActivityResultLauncherRememberLauncherForActivityResult;
                mutableState28 = mutableState15;
                mutableState29 = mutableState16;
                context2 = context;
                i5 = 54;
                i6 = 550789471;
                composer2.startReplaceGroup(550789471);
                composer2.endReplaceGroup();
            }
            if (!BookDetailsDialog$lambda$4(mutableState)) {
                mutableState30 = mutableState;
                composer2.startReplaceGroup(i6);
            } else {
                composer2.startReplaceGroup(567310084);
                ComposerKt.sourceInformation(composer2, "307@16406L28,307@16436L8979,307@16380L9035");
                ComposerKt.sourceInformationMarkerStart(composer2, 849576447, (String) r5);
                objRememberedValue34 = composer2.rememberedValue();
                if (objRememberedValue34 == Composer.Companion.getEmpty()) {
                    mutableState30 = mutableState;
                    objRememberedValue34 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda35
                        public final Object invoke() {
                            return BookDetailsDialogKt.BookDetailsDialog$lambda$94$lambda$93(mutableState30);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue34);
                } else {
                    mutableState30 = mutableState;
                }
                ComposerKt.sourceInformationMarkerEnd(composer2);
                final Context context11 = context2;
                AndroidDialog_androidKt.Dialog((Function0) objRememberedValue34, (DialogProperties) null, ComposableLambdaKt.rememberComposableLambda(-64900244, true, new Function2() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda36
                    public final Object invoke(Object obj2, Object obj3) {
                        return BookDetailsDialogKt.BookDetailsDialog$lambda$117(book, mutableState3, mutableState12, bookViewModel, function0, context11, mutableState13, mutableState30, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, composer2, i5), composer2, 390, 2);
            }
            composer2.endReplaceGroup();
            if (!BookDetailsDialog$lambda$7(mutableState2)) {
                mutableState31 = mutableState2;
                composer2.startReplaceGroup(i6);
            } else {
                composer2.startReplaceGroup(576164273);
                ComposerKt.sourceInformation(composer2, "464@25497L40,464@25539L3674,464@25471L3742");
                ComposerKt.sourceInformationMarkerStart(composer2, 849867371, (String) r5);
                objRememberedValue33 = composer2.rememberedValue();
                if (objRememberedValue33 == Composer.Companion.getEmpty()) {
                    mutableState39 = mutableState2;
                    objRememberedValue33 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda38
                        public final Object invoke() {
                            return BookDetailsDialogKt.BookDetailsDialog$lambda$119$lambda$118(mutableState39);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue33);
                } else {
                    mutableState39 = mutableState2;
                }
                ComposerKt.sourceInformationMarkerEnd(composer2);
                final ManagedActivityResultLauncher managedActivityResultLauncher8 = managedActivityResultLauncher;
                final MutableState mutableState4110 = mutableState27;
                mutableState31 = mutableState39;
                AndroidDialog_androidKt.Dialog((Function0) objRememberedValue33, (DialogProperties) null, ComposableLambdaKt.rememberComposableLambda(-1512907091, true, new Function2() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda39
                    public final Object invoke(Object obj2, Object obj3) {
                        return BookDetailsDialogKt.BookDetailsDialog$lambda$130(bookViewModel, book, function0, managedActivityResultLauncher8, mutableState39, mutableState4110, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, composer2, i5), composer2, 390, 2);
            }
            composer2.endReplaceGroup();
            if (!BookDetailsDialog$lambda$13(mutableState24)) {
                composer3 = composer2;
                z7 = true;
                composer3.startReplaceGroup(i6);
            } else {
                composer2.startReplaceGroup(579926154);
                ComposerKt.sourceInformation(composer2, "534@29289L34,534@29325L3687,534@29263L3749");
                ComposerKt.sourceInformationMarkerStart(composer2, 849988709, (String) r5);
                objRememberedValue32 = composer2.rememberedValue();
                if (objRememberedValue32 == Composer.Companion.getEmpty()) {
                    mutableState38 = mutableState24;
                    objRememberedValue32 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda40
                        public final Object invoke() {
                            return BookDetailsDialogKt.BookDetailsDialog$lambda$132$lambda$131(mutableState38);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue32);
                } else {
                    mutableState38 = mutableState24;
                }
                ComposerKt.sourceInformationMarkerEnd(composer2);
                final ManagedActivityResultLauncher managedActivityResultLauncher9 = managedActivityResultLauncher;
                final MutableState mutableState4111 = mutableState27;
                mutableState24 = mutableState38;
                Function2 function2RememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(1334053358, true, new Function2() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda41
                    public final Object invoke(Object obj2, Object obj3) {
                        return BookDetailsDialogKt.BookDetailsDialog$lambda$143(book, bookViewModel, function0, managedActivityResultLauncher9, mutableState38, mutableState4111, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, composer2, i5);
                z7 = true;
                composer3 = composer2;
                AndroidDialog_androidKt.Dialog((Function0) objRememberedValue32, (DialogProperties) null, function2RememberComposableLambda3, composer3, 390, 2);
            }
            composer3.endReplaceGroup();
            if (!BookDetailsDialog$lambda$46(mutableState28)) {
                book2 = book;
                composer4 = composer3;
                i7 = i4;
                composer4.startReplaceGroup(i6);
            } else {
                composer3.startReplaceGroup(583581426);
                ComposerKt.sourceInformation(composer3, "608@33207L31,604@33059L189");
                String strBookDetailsDialog$lambda$411 = BookDetailsDialog$lambda$49(mutableState29);
                ComposerKt.sourceInformationMarkerStart(composer3, 850114082, (String) r5);
                objRememberedValue31 = composer3.rememberedValue();
                if (objRememberedValue31 == Composer.Companion.getEmpty()) {
                    objRememberedValue31 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda42
                        public final Object invoke() {
                            return BookDetailsDialogKt.BookDetailsDialog$lambda$145$lambda$144(mutableState28);
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue31);
                }
                ComposerKt.sourceInformationMarkerEnd(composer3);
                i7 = i4;
                QRCodeDisplayDialogKt.QRCodeDisplayDialog(book, strBookDetailsDialog$lambda$411, str, (Function0) objRememberedValue31, composer3, (i4 & 14) | 3072 | (i7 & 896));
                book2 = book;
                composer4 = composer3;
            }
            composer4.endReplaceGroup();
            if (!BookDetailsDialog$lambda$52(mutableState17)) {
                composer5 = composer4;
                context3 = context2;
                str2 = str2;
                mutableState32 = mutableState17;
                mutableState33 = mutableState18;
                composer5.startReplaceGroup(i6);
            } else {
                composer4.startReplaceGroup(583846414);
                ComposerKt.sourceInformation(composer4, "616@33405L1008,634@34439L31,613@33295L1185");
                String strBookDetailsDialog$lambda$57 = BookDetailsDialog$lambda$55(mutableState18);
                ComposerKt.sourceInformationMarkerStart(composer4, 850121395, (String) r5);
                zChangedInstance2 = composer4.changedInstance(bookViewModel) | composer4.changedInstance(book2) | composer4.changedInstance(context2);
                objRememberedValue29 = composer4.rememberedValue();
                if (zChangedInstance2) {
                    final Book book7 = book2;
                    final Context context12 = context2;
                    composer7 = composer4;
                    Function1 function7 = new Function1() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda24
                        public final Object invoke(Object obj2) {
                            return BookDetailsDialogKt.BookDetailsDialog$lambda$147$lambda$146(bookViewModel, book7, context12, mutableState18, mutableState17, (String) obj2);
                        }
                    };
                    context3 = context12;
                    mutableState32 = mutableState17;
                    mutableState33 = mutableState18;
                    composer7.updateRememberedValue(function7);
                    objRememberedValue29 = function7;
                } else {
                    final Book book8 = book2;
                    final Context context13 = context2;
                    composer7 = composer4;
                    Function1 function8 = new Function1() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda24
                        public final Object invoke(Object obj2) {
                            return BookDetailsDialogKt.BookDetailsDialog$lambda$147$lambda$146(bookViewModel, book8, context13, mutableState18, mutableState17, (String) obj2);
                        }
                    };
                    context3 = context13;
                    mutableState32 = mutableState17;
                    mutableState33 = mutableState18;
                    composer7.updateRememberedValue(function8);
                    objRememberedValue29 = function8;
                }
                Function1 function9 = (Function1) objRememberedValue29;
                ComposerKt.sourceInformationMarkerEnd(composer7);
                ComposerKt.sourceInformationMarkerStart(composer7, 850153506, (String) r5);
                objRememberedValue30 = composer7.rememberedValue();
                if (objRememberedValue30 == Composer.Companion.getEmpty()) {
                    objRememberedValue30 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda25
                        public final Object invoke() {
                            return BookDetailsDialogKt.BookDetailsDialog$lambda$149$lambda$148(mutableState32);
                        }
                    };
                    composer7.updateRememberedValue(objRememberedValue30);
                }
                ComposerKt.sourceInformationMarkerEnd(composer7);
                composer5 = composer7;
                QRScannerDialogKt.QRScannerDialog(book, strBookDetailsDialog$lambda$57, function9, (Function0) objRememberedValue30, composer5, (i7 & 14) | 3072);
            }
            composer5.endReplaceGroup();
            if (!BookDetailsDialog$lambda$58(mutableState19)) {
                book3 = book;
                bookViewModel2 = bookViewModel;
                mutableState34 = mutableState19;
                composer5.startReplaceGroup(i6);
            } else {
                composer5.startReplaceGroup(585044688);
                ComposerKt.sourceInformation(composer5, "643@34685L92,639@34532L255");
                FeedbackTargetType feedbackTargetTypeBookDetailsDialog$lambda$63 = BookDetailsDialog$lambda$61(mutableState20);
                ComposerKt.sourceInformationMarkerStart(composer5, 850161439, (String) r5);
                if ((57344 & i7) == 16384) {
                }
                objRememberedValue28 = composer5.rememberedValue();
                if (z9) {
                    mutableState34 = mutableState19;
                    objRememberedValue28 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda27
                        public final Object invoke() {
                            return BookDetailsDialogKt.BookDetailsDialog$lambda$151$lambda$150(function0, mutableState34);
                        }
                    };
                    composer5.updateRememberedValue(objRememberedValue28);
                } else {
                    mutableState34 = mutableState19;
                    objRememberedValue28 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda27
                        public final Object invoke() {
                            return BookDetailsDialogKt.BookDetailsDialog$lambda$151$lambda$150(function0, mutableState34);
                        }
                    };
                    composer5.updateRememberedValue(objRememberedValue28);
                }
                ComposerKt.sourceInformationMarkerEnd(composer5);
                book3 = book;
                MutualFeedbackDialogKt.MutualFeedbackDialog(book3, feedbackTargetTypeBookDetailsDialog$lambda$63, bookViewModel, (Function0) objRememberedValue28, composer5, (i7 & 14) | ((i7 >> 3) & 896));
                bookViewModel2 = bookViewModel;
            }
            composer5.endReplaceGroup();
            if (!BookDetailsDialog$lambda$43(mutableState14)) {
                mutableState35 = mutableState14;
                composer5.startReplaceGroup(i6);
            } else {
                composer5.startReplaceGroup(585345047);
                ComposerKt.sourceInformation(composer5, "651@34890L37,651@34840L88");
                ComposerKt.sourceInformationMarkerStart(composer5, 850167944, (String) r5);
                objRememberedValue27 = composer5.rememberedValue();
                if (objRememberedValue27 == Composer.Companion.getEmpty()) {
                    mutableState35 = mutableState14;
                    objRememberedValue27 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda28
                        public final Object invoke() {
                            return BookDetailsDialogKt.BookDetailsDialog$lambda$153$lambda$152(mutableState35);
                        }
                    };
                    composer5.updateRememberedValue(objRememberedValue27);
                } else {
                    mutableState35 = mutableState14;
                }
                ComposerKt.sourceInformationMarkerEnd(composer5);
                BookConditionPhotoDialog(book3, (Function0) objRememberedValue27, composer5, (i7 & 14) | 48);
            }
            composer5.endReplaceGroup();
            if (!BookDetailsDialog$lambda$64(mutableState21)) {
                mutableState36 = mutableState21;
                composer5.startReplaceGroup(i6);
            } else {
                composer5.startReplaceGroup(585488019);
                ComposerKt.sourceInformation(composer5, "658@35090L38,655@34982L156");
                ComposerKt.sourceInformationMarkerStart(composer5, 850174345, (String) r5);
                objRememberedValue26 = composer5.rememberedValue();
                if (objRememberedValue26 == Composer.Companion.getEmpty()) {
                    mutableState36 = mutableState21;
                    objRememberedValue26 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda29
                        public final Object invoke() {
                            return BookDetailsDialogKt.BookDetailsDialog$lambda$155$lambda$154(mutableState36);
                        }
                    };
                    composer5.updateRememberedValue(objRememberedValue26);
                } else {
                    mutableState36 = mutableState21;
                }
                ComposerKt.sourceInformationMarkerEnd(composer5);
                ReadingCompanionDialogKt.ReadingCompanionDialog(book3, bookViewModel2, (Function0) objRememberedValue26, composer5, (i7 & 14) | 384 | ((i7 >> 6) & 112));
            }
            composer5.endReplaceGroup();
            if (BookDetailsDialog$lambda$67(mutableState22)) {
                composer5.startReplaceGroup(585695874);
                ComposerKt.sourceInformation(composer5, "669@35477L32,664@35294L225");
                if (z4) {
                    ownerName = book3.getBorrowerName();
                    if (ownerName != null) {
                    }
                    String id5 = book.getId();
                    String title5 = book.getTitle();
                    ComposerKt.sourceInformationMarkerStart(composer5, 850186723, (String) r5);
                    objRememberedValue25 = composer5.rememberedValue();
                    if (objRememberedValue25 == Composer.Companion.getEmpty()) {
                        mutableState37 = mutableState22;
                        objRememberedValue25 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda30
                            public final Object invoke() {
                                return BookDetailsDialogKt.BookDetailsDialog$lambda$157$lambda$156(mutableState37);
                            }
                        };
                        composer5.updateRememberedValue(objRememberedValue25);
                    } else {
                        mutableState37 = mutableState22;
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer5);
                    Composer composer16 = composer5;
                    SafeMeetupDialogKt.SafeMeetupDialog(id5, title5, str3, bookViewModel, (Function0) objRememberedValue25, composer16, (i7 & 7168) | 24576);
                    composer16.endReplaceGroup();
                    composer5 = composer16;
                } else {
                    ownerName = book3.getOwnerName();
                }
                str3 = ownerName;
                String id6 = book.getId();
                String title6 = book.getTitle();
                ComposerKt.sourceInformationMarkerStart(composer5, 850186723, (String) r5);
                objRememberedValue25 = composer5.rememberedValue();
                if (objRememberedValue25 == Composer.Companion.getEmpty()) {
                    mutableState37 = mutableState22;
                    objRememberedValue25 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda30
                        public final Object invoke() {
                            return BookDetailsDialogKt.BookDetailsDialog$lambda$157$lambda$156(mutableState37);
                        }
                    };
                    composer5.updateRememberedValue(objRememberedValue25);
                } else {
                    mutableState37 = mutableState22;
                }
                ComposerKt.sourceInformationMarkerEnd(composer5);
                Composer composer17 = composer5;
                SafeMeetupDialogKt.SafeMeetupDialog(id6, title6, str3, bookViewModel, (Function0) objRememberedValue25, composer17, (i7 & 7168) | 24576);
                composer17.endReplaceGroup();
                composer5 = composer17;
            } else {
                mutableState37 = mutableState22;
                Composer composer18 = composer5;
                composer18.startReplaceGroup(i6);
                composer18.endReplaceGroup();
            }
            final ManagedActivityResultLauncher managedActivityResultLauncher10 = managedActivityResultLauncher;
            int i15 = i7;
            final boolean z16 = z4;
            final MutableState mutableState4112 = mutableState31;
            final MutableState mutableState4113 = mutableState28;
            Composer composer19 = composer5;
            final MutableState mutableState4114 = mutableState30;
            final MutableState mutableState4115 = mutableState32;
            final boolean z17 = z5;
            final boolean z18 = z6;
            final Context context14 = context3;
            final MutableState mutableState4116 = mutableState34;
            final MutableState mutableState4117 = mutableState36;
            final MutableState mutableState58 = mutableState35;
            final MutableState mutableState59 = mutableState27;
            final MutableState mutableState510 = mutableState29;
            final MutableState mutableState511 = mutableState24;
            AndroidDialog_androidKt.Dialog(function0, (DialogProperties) null, ComposableLambdaKt.rememberComposableLambda(2029675546, true, new Function2() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda31
                public final Object invoke(Object obj2, Object obj3) {
                    return BookDetailsDialogKt.BookDetailsDialog$lambda$343(book, audioHelperRememberAudioHelper3, function0, function1, bookViewModel, mutableState419, z16, str, z17, z18, mutableState511, mutableState4112, mutableState58, context14, mutableState37, mutableState20, mutableState4116, managedActivityResultLauncher10, mutableState59, mutableState510, mutableState4113, mutableState33, mutableState4115, mutableState4114, mutableState4117, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer19, 54), composer19, ((i15 >> 12) & 14) | 384, 2);
            composer6 = composer19;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z8 = z3;
        }
        scopeUpdateScopeEndRestartGroup = composer6.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda32
                public final Object invoke(Object obj2, Object obj3) {
                    return BookDetailsDialogKt.BookDetailsDialog$lambda$344(book, z8, str, bookViewModel, function0, function1, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final boolean BookDetailsDialog$lambda$1(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void BookDetailsDialog$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean BookDetailsDialog$lambda$4(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void BookDetailsDialog$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean BookDetailsDialog$lambda$7(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void BookDetailsDialog$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String BookDetailsDialog$lambda$10(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final boolean BookDetailsDialog$lambda$13(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void BookDetailsDialog$lambda$14(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String BookDetailsDialog$lambda$16(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final Bitmap BookDetailsDialog$lambda$19(MutableState<Bitmap> mutableState) {
        return (Bitmap) ((State) mutableState).getValue();
    }

    private static final String BookDetailsDialog$lambda$22(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final boolean BookDetailsDialog$lambda$25(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BookDetailsDialog$lambda$26(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String BookDetailsDialog$lambda$28(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final String BookDetailsDialog$lambda$31(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final boolean BookDetailsDialog$lambda$34(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void BookDetailsDialog$lambda$35(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final int BookDetailsDialog$lambda$37(MutableState<Integer> mutableState) {
        return ((Number) ((State) mutableState).getValue()).intValue();
    }

    private static final void BookDetailsDialog$lambda$38(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    private static final String BookDetailsDialog$lambda$40(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final boolean BookDetailsDialog$lambda$43(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void BookDetailsDialog$lambda$44(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean BookDetailsDialog$lambda$46(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void BookDetailsDialog$lambda$47(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String BookDetailsDialog$lambda$49(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final boolean BookDetailsDialog$lambda$52(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void BookDetailsDialog$lambda$53(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String BookDetailsDialog$lambda$55(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final boolean BookDetailsDialog$lambda$58(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void BookDetailsDialog$lambda$59(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final FeedbackTargetType BookDetailsDialog$lambda$61(MutableState<FeedbackTargetType> mutableState) {
        return (FeedbackTargetType) ((State) mutableState).getValue();
    }

    private static final boolean BookDetailsDialog$lambda$64(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void BookDetailsDialog$lambda$65(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean BookDetailsDialog$lambda$67(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void BookDetailsDialog$lambda$68(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    static final Unit BookDetailsDialog$lambda$70$lambda$69(CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, BookViewModel bookViewModel, Book book, MutableState mutableState7, MutableState mutableState8, Bitmap bitmap) {
        if (bitmap != null) {
            String base64 = toBase64(bitmap);
            mutableState.setValue(bitmap);
            mutableState2.setValue(base64);
            BookDetailsDialog$lambda$35(mutableState3, true);
            BookDetailsDialog$lambda$26(mutableState4, true);
            mutableState5.setValue(null);
            mutableState6.setValue(null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new BookDetailsDialogKt$BookDetailsDialog$takePictureLauncher$1$1$1(bookViewModel, book, base64, mutableState5, mutableState6, mutableState4, null), 3, (Object) null);
        }
        BookDetailsDialog$lambda$14(mutableState7, false);
        BookDetailsDialog$lambda$8(mutableState8, false);
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$72$lambda$71(MutableState mutableState, MutableState mutableState2) {
        BookDetailsDialog$lambda$35(mutableState, false);
        mutableState2.setValue(null);
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$92(final MutableState mutableState, final MutableState mutableState2, final MutableState mutableState3, final MutableState mutableState4, final MutableState mutableState5, final MutableState mutableState6, final Book book, final BookViewModel bookViewModel, final Context context, final MutableState mutableState7, final MutableState mutableState8, final MutableState mutableState9, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C122@5563L11,122@5521L62,123@5626L38,125@5758L10568,120@5426L10900:BookDetailsDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-692609611, i, -1, "com.example.ui.screens.BookDetailsDialog.<anonymous> (BookDetailsDialog.kt:120)");
            }
            CardKt.Card(PaddingKt.padding-VpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(8.0f), 0.0f, 2, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(24.0f)), CardDefaults.INSTANCE.cardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0L, 0L, composer, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.cardElevation-aqJV_2Y(Dp.constructor-impl(8.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer, (CardDefaults.$stable << 18) | 6, 62), (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(919162279, true, new Function3() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda9
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return BookDetailsDialogKt.BookDetailsDialog$lambda$92$lambda$91(mutableState, mutableState2, mutableState3, mutableState4, mutableState5, mutableState6, book, bookViewModel, context, mutableState7, mutableState8, mutableState9, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer, 54), composer, 196614, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$92$lambda$91(final MutableState mutableState, final MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, final MutableState mutableState5, final MutableState mutableState6, final Book book, final BookViewModel bookViewModel, final Context context, final MutableState mutableState7, final MutableState mutableState8, final MutableState mutableState9, ColumnScope columnScope, Composer composer, int i) {
        Composer composer2;
        Book book2;
        Intrinsics.checkNotNullParameter(columnScope, "$this$Card");
        ComposerKt.sourceInformation(composer, "C126@5776L10536:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(919162279, i, -1, "com.example.ui.screens.BookDetailsDialog.<anonymous>.<anonymous> (BookDetailsDialog.kt:126)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
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
            ComposerKt.sourceInformationMarkerStart(composer, -1602828745, "C129@5879L1282,152@7183L41,157@7396L21,154@7246L3943,222@11211L41,225@11319L4975:BookDetailsDialog.kt#2thlc2");
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
            Composer composer4 = Updater.constructor-impl(composer);
            Updater.set-impl(composer4, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer4, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer4.getInserting() || !Intrinsics.areEqual(composer4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composer4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composer4.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.set-impl(composer4, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -492814088, "C134@6137L790,147@6973L53,147@6952L187:BookDetailsDialog.kt#2thlc2");
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier2 = Modifier.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
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
            Updater.set-impl(composer5, measurePolicyColumnMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer5, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer5.getInserting() || !Intrinsics.areEqual(composer5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composer5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composer5.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.set-impl(composer5, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScope columnScope3 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 2146218869, "C137@6355L10,135@6174L295,142@6709L10,143@6786L11,140@6498L403:BookDetailsDialog.kt#2thlc2");
            TextKt.Text--4IGK_g(Intrinsics.areEqual(BookDetailsDialog$lambda$16(mutableState), "HANDOVER") ? "Handover Scan Verified" : "Return Scan Verified", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleMedium(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
            TextKt.Text--4IGK_g(Intrinsics.areEqual(BookDetailsDialog$lambda$16(mutableState), "HANDOVER") ? "Step 1 of 3: AI Condition Inspection" : "Step 1 of 2: AI Condition Inspection", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, -292966090, "CC(remember):BookDetailsDialog.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda10
                    public final Object invoke() {
                        return BookDetailsDialogKt.BookDetailsDialog$lambda$92$lambda$91$lambda$90$lambda$76$lambda$75$lambda$74(mutableState2, mutableState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            IconButtonKt.IconButton((Function0) objRememberedValue, (Modifier) null, false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.m216getLambda$650591842$app(), composer, 196614, 30);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f)), composer, 6);
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(columnScope2.weight(Modifier.Companion, 1.0f, false), ScrollKt.rememberScrollState(0, composer, 0, 1), false, (FlingBehavior) null, false, 14, (Object) null);
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, modifierVerticalScroll$default);
            Function0 constructor4 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor4);
            } else {
                composer.useNode();
            }
            Composer composer6 = Updater.constructor-impl(composer);
            Updater.set-impl(composer6, measurePolicyColumnMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer6, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer6.getInserting() || !Intrinsics.areEqual(composer6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composer6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composer6.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.set-impl(composer6, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScope columnScope4 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -92621528, "C168@8026L11,160@7543L536,171@8105L41:BookDetailsDialog.kt#2thlc2");
            Bitmap bitmapBookDetailsDialog$lambda$19 = BookDetailsDialog$lambda$19(mutableState3);
            Intrinsics.checkNotNull(bitmapBookDetailsDialog$lambda$19);
            ImageKt.Image-5h-nEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmapBookDetailsDialog$lambda$19), "Captured Book Photo", BackgroundKt.background-bw27NRU$default(ClipKt.clip(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(140.0f)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f))), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), (Shape) null, 2, (Object) null), (Alignment) null, ContentScale.Companion.getFit(), 0.0f, (ColorFilter) null, 0, composer, 24624, 232);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f)), composer, 6);
            if (BookDetailsDialog$lambda$25(mutableState4)) {
                composer.startReplaceGroup(-92055345);
                ComposerKt.sourceInformation(composer, "175@8284L11,174@8221L1096");
                SurfaceKt.Surface-T9BRK9s(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.m197getLambda$1522665015$app(), composer, 12582918, 120);
                composer2 = composer;
                composer2.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-90885963);
                ComposerKt.sourceInformation(composer, "194@9442L11,197@9656L1485,193@9379L1762");
                SurfaceKt.Surface-T9BRK9s(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), 0.35f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-1493894830, true, new Function2() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda12
                    public final Object invoke(Object obj, Object obj2) {
                        return BookDetailsDialogKt.BookDetailsDialog$lambda$92$lambda$91$lambda$90$lambda$80$lambda$79(mutableState5, mutableState6, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer, 54), composer, 12582918, 120);
                composer2 = composer;
                composer2.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(14.0f)), composer2, 6);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            Arrangement.Vertical vertical = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(8.0f));
            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(vertical, Alignment.Companion.getStart(), composer2, 6);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default2);
            Function0 constructor5 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
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
            Updater.set-impl(composer7, measurePolicyColumnMeasurePolicy4, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer7, currentCompositionLocalMap5, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash5 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer7.getInserting() || !Intrinsics.areEqual(composer7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                composer7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                composer7.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
            }
            Updater.set-impl(composer7, modifierMaterializeModifier5, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScope columnScope5 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, 172892189, "C:BookDetailsDialog.kt#2thlc2");
            if (Intrinsics.areEqual(BookDetailsDialog$lambda$16(mutableState), "HANDOVER")) {
                composer2.startReplaceGroup(172845750);
                ComposerKt.sourceInformation(composer2, "242@12376L48,231@11616L562,230@11566L1284,250@12937L609,249@12879L1001");
                boolean z = !BookDetailsDialog$lambda$25(mutableState4);
                Modifier modifier3 = SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(48.0f));
                ButtonColors buttonColors = ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(ColorKt.Color(4279994175L), 0L, 0L, 0L, composer, (ButtonDefaults.$stable << 12) | 6, 14);
                Shape shape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f));
                ComposerKt.sourceInformationMarkerStart(composer, -1379896900, "CC(remember):BookDetailsDialog.kt#9igjgp");
                boolean zChangedInstance = composer.changedInstance(book) | composer.changedInstance(bookViewModel);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    Function0 function0 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda13
                        public final Object invoke() {
                            return BookDetailsDialogKt.BookDetailsDialog$lambda$92$lambda$91$lambda$90$lambda$89$lambda$82$lambda$81(book, bookViewModel, mutableState5, mutableState6, mutableState7, mutableState2, mutableState, mutableState8, mutableState9);
                        }
                    };
                    composer.updateRememberedValue(function0);
                    objRememberedValue2 = function0;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                ButtonKt.Button((Function0) objRememberedValue2, modifier3, z, shape, buttonColors, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.getLambda$2111266901$app(), composer, 805306416, 480);
                boolean z2 = !BookDetailsDialog$lambda$25(mutableState4);
                Modifier modifier4 = SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(42.0f));
                Shape shape2 = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f));
                ComposerKt.sourceInformationMarkerStart(composer, -1379854581, "CC(remember):BookDetailsDialog.kt#9igjgp");
                boolean zChangedInstance2 = composer.changedInstance(book) | composer.changedInstance(bookViewModel) | composer.changedInstance(context);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                    Function0 function1 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda14
                        public final Object invoke() {
                            return BookDetailsDialogKt.BookDetailsDialog$lambda$92$lambda$91$lambda$90$lambda$89$lambda$84$lambda$83(book, bookViewModel, context, mutableState5, mutableState6, mutableState7, mutableState2, mutableState);
                        }
                    };
                    composer.updateRememberedValue(function1);
                    objRememberedValue3 = function1;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                ButtonKt.OutlinedButton((Function0) objRememberedValue3, modifier4, z2, shape2, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.m206getLambda$1821991209$app(), composer, 805306416, 496);
                composer.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(175202432);
                ComposerKt.sourceInformation(composer2, "277@14743L48,266@13992L553,265@13942L1273,285@15302L613,284@15244L1002");
                boolean z3 = !BookDetailsDialog$lambda$25(mutableState4);
                Modifier modifier5 = SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(48.0f));
                ButtonColors buttonColors2 = ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(ColorKt.Color(4279994175L), 0L, 0L, 0L, composer, (ButtonDefaults.$stable << 12) | 6, 14);
                Shape shape3 = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f));
                ComposerKt.sourceInformationMarkerStart(composer, -1379820877, "CC(remember):BookDetailsDialog.kt#9igjgp");
                boolean zChangedInstance3 = composer.changedInstance(book) | composer.changedInstance(bookViewModel);
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                    Function0 function2 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda15
                        public final Object invoke() {
                            return BookDetailsDialogKt.BookDetailsDialog$lambda$92$lambda$91$lambda$90$lambda$89$lambda$86$lambda$85(book, bookViewModel, mutableState5, mutableState6, mutableState7, mutableState2, mutableState, mutableState8, mutableState9);
                        }
                    };
                    book2 = book;
                    composer.updateRememberedValue(function2);
                    objRememberedValue4 = function2;
                } else {
                    book2 = book;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                ButtonKt.Button((Function0) objRememberedValue4, modifier5, z3, shape3, buttonColors2, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.getLambda$1204138718$app(), composer, 805306416, 480);
                boolean z4 = !BookDetailsDialog$lambda$25(mutableState4);
                Modifier modifier6 = SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(42.0f));
                Shape shape4 = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f));
                ComposerKt.sourceInformationMarkerStart(composer, -1379778897, "CC(remember):BookDetailsDialog.kt#9igjgp");
                boolean zChangedInstance4 = composer.changedInstance(book2) | composer.changedInstance(bookViewModel) | composer.changedInstance(context);
                Object objRememberedValue5 = composer.rememberedValue();
                if (zChangedInstance4 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                    final Book book3 = book2;
                    Function0 function3 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda16
                        public final Object invoke() {
                            return BookDetailsDialogKt.BookDetailsDialog$lambda$92$lambda$91$lambda$90$lambda$89$lambda$88$lambda$87(book3, bookViewModel, context, mutableState5, mutableState6, mutableState7, mutableState2, mutableState);
                        }
                    };
                    composer.updateRememberedValue(function3);
                    objRememberedValue5 = function3;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                ButtonKt.OutlinedButton((Function0) objRememberedValue5, modifier6, z4, shape4, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.getLambda$364292576$app(), composer, 805306416, 496);
                composer.endReplaceGroup();
            }
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

    static final Unit BookDetailsDialog$lambda$92$lambda$91$lambda$90$lambda$76$lambda$75$lambda$74(MutableState mutableState, MutableState mutableState2) {
        BookDetailsDialog$lambda$35(mutableState, false);
        mutableState2.setValue(null);
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$92$lambda$91$lambda$90$lambda$80$lambda$79(MutableState mutableState, MutableState mutableState2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C198@9690L1421:BookDetailsDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1493894830, i, -1, "com.example.ui.screens.BookDetailsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BookDetailsDialog.kt:198)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(12.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
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
            ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1350185139, "C199@9771L771:BookDetailsDialog.kt#2thlc2");
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier2 = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
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
            ComposerKt.sourceInformationMarkerStart(composer, -1438947732, "C200@9942L11,200@9865L130,201@10036L39,204@10280L10,206@10443L11,202@10116L388:BookDetailsDialog.kt#2thlc2");
            IconKt.Icon-ww6aTOc(VerifiedKt.getVerified(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 432, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            String strBookDetailsDialog$lambda$28 = BookDetailsDialog$lambda$28(mutableState);
            if (strBookDetailsDialog$lambda$28 == null) {
                strBookDetailsDialog$lambda$28 = "Good";
            }
            TextKt.Text--4IGK_g("AI Condition: " + strBookDetailsDialog$lambda$28, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleSmall(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
            Composer composer4 = composer;
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            composer4.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            String strBookDetailsDialog$lambda$31 = BookDetailsDialog$lambda$31(mutableState2);
            if (strBookDetailsDialog$lambda$31 == null || StringsKt.isBlank(strBookDetailsDialog$lambda$31)) {
                composer4.startReplaceGroup(-1359919450);
            } else {
                composer4.startReplaceGroup(-1349369251);
                ComposerKt.sourceInformation(composer4, "210@10662L40,213@10881L10,214@10969L11,211@10743L296");
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer4, 6);
                String strBookDetailsDialog$lambda$32 = BookDetailsDialog$lambda$31(mutableState2);
                Intrinsics.checkNotNull(strBookDetailsDialog$lambda$32);
                TextKt.Text--4IGK_g(strBookDetailsDialog$lambda$32, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer4, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getBodySmall(), composer, 0, 0, 65530);
                composer4 = composer;
            }
            composer4.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            composer4.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$92$lambda$91$lambda$90$lambda$89$lambda$82$lambda$81(Book book, BookViewModel bookViewModel, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7) {
        String strBookDetailsDialog$lambda$28 = BookDetailsDialog$lambda$28(mutableState);
        if (strBookDetailsDialog$lambda$28 == null) {
            strBookDetailsDialog$lambda$28 = book.getCondition();
        }
        String strBookDetailsDialog$lambda$31 = BookDetailsDialog$lambda$31(mutableState2);
        if (strBookDetailsDialog$lambda$31 == null) {
            strBookDetailsDialog$lambda$31 = "Condition verified";
        }
        bookViewModel.transferBookInitiated(book, BookDetailsDialog$lambda$22(mutableState3), strBookDetailsDialog$lambda$28, strBookDetailsDialog$lambda$31);
        BookDetailsDialog$lambda$35(mutableState4, false);
        mutableState5.setValue(null);
        mutableState6.setValue("HANDOVER");
        BookDetailsDialog$lambda$47(mutableState7, true);
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$92$lambda$91$lambda$90$lambda$89$lambda$84$lambda$83(Book book, BookViewModel bookViewModel, Context context, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5) {
        String strBookDetailsDialog$lambda$28 = BookDetailsDialog$lambda$28(mutableState);
        if (strBookDetailsDialog$lambda$28 == null) {
            strBookDetailsDialog$lambda$28 = book.getCondition();
        }
        String strBookDetailsDialog$lambda$31 = BookDetailsDialog$lambda$31(mutableState2);
        if (strBookDetailsDialog$lambda$31 == null) {
            strBookDetailsDialog$lambda$31 = "Condition verified";
        }
        bookViewModel.transferBookInitiated(book, BookDetailsDialog$lambda$22(mutableState3), strBookDetailsDialog$lambda$28, strBookDetailsDialog$lambda$31);
        BookDetailsDialog$lambda$35(mutableState4, false);
        mutableState5.setValue(null);
        Toast.makeText(context, "Handover photo saved! Next, tap 'Show QR' when ready.", 1).show();
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$92$lambda$91$lambda$90$lambda$89$lambda$86$lambda$85(Book book, BookViewModel bookViewModel, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7) {
        String strBookDetailsDialog$lambda$28 = BookDetailsDialog$lambda$28(mutableState);
        if (strBookDetailsDialog$lambda$28 == null) {
            strBookDetailsDialog$lambda$28 = book.getCondition();
        }
        String strBookDetailsDialog$lambda$31 = BookDetailsDialog$lambda$31(mutableState2);
        if (strBookDetailsDialog$lambda$31 == null) {
            strBookDetailsDialog$lambda$31 = "Condition verified";
        }
        bookViewModel.initiateReturn(book, BookDetailsDialog$lambda$22(mutableState3), strBookDetailsDialog$lambda$28, strBookDetailsDialog$lambda$31);
        BookDetailsDialog$lambda$35(mutableState4, false);
        mutableState5.setValue(null);
        mutableState6.setValue("RETURN");
        BookDetailsDialog$lambda$47(mutableState7, true);
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$92$lambda$91$lambda$90$lambda$89$lambda$88$lambda$87(Book book, BookViewModel bookViewModel, Context context, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5) {
        String strBookDetailsDialog$lambda$28 = BookDetailsDialog$lambda$28(mutableState);
        if (strBookDetailsDialog$lambda$28 == null) {
            strBookDetailsDialog$lambda$28 = book.getCondition();
        }
        String strBookDetailsDialog$lambda$31 = BookDetailsDialog$lambda$31(mutableState2);
        if (strBookDetailsDialog$lambda$31 == null) {
            strBookDetailsDialog$lambda$31 = "Condition verified";
        }
        bookViewModel.initiateReturn(book, BookDetailsDialog$lambda$22(mutableState3), strBookDetailsDialog$lambda$28, strBookDetailsDialog$lambda$31);
        BookDetailsDialog$lambda$35(mutableState4, false);
        mutableState5.setValue(null);
        Toast.makeText(context, "Return photo saved! Show your QR code to the owner when meeting.", 1).show();
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$117(final Book book, final MutableState mutableState, final MutableState mutableState2, final BookViewModel bookViewModel, final Function0 function0, final Context context, final MutableState mutableState3, final MutableState mutableState4, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C310@16587L11,310@16545L62,311@16650L38,313@16782L8623,308@16450L8955:BookDetailsDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-64900244, i, -1, "com.example.ui.screens.BookDetailsDialog.<anonymous> (BookDetailsDialog.kt:308)");
            }
            CardKt.Card(PaddingKt.padding-VpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(8.0f), 0.0f, 2, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(24.0f)), CardDefaults.INSTANCE.cardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0L, 0L, composer, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.cardElevation-aqJV_2Y(Dp.constructor-impl(8.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer, (CardDefaults.$stable << 18) | 6, 62), (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-1635307810, true, new Function3() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda80
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return BookDetailsDialogKt.BookDetailsDialog$lambda$117$lambda$116(book, mutableState, mutableState2, bookViewModel, function0, context, mutableState3, mutableState4, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer, 54), composer, 196614, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$94$lambda$93(MutableState mutableState) {
        BookDetailsDialog$lambda$5(mutableState, false);
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$117$lambda$116(final Book book, final MutableState mutableState, final MutableState mutableState2, final BookViewModel bookViewModel, final Function0 function0, final Context context, final MutableState mutableState3, final MutableState mutableState4, ColumnScope columnScope, Composer composer, int i) {
        long jColor;
        Intrinsics.checkNotNullParameter(columnScope, "$this$Card");
        ComposerKt.sourceInformation(composer, "C317@16928L21,314@16800L8591:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1635307810, i, -1, "com.example.ui.screens.BookDetailsDialog.<anonymous>.<anonymous> (BookDetailsDialog.kt:314)");
            }
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(24.0f)), ScrollKt.rememberScrollState(0, composer, 0, 1), false, (FlingBehavior) null, false, 14, (Object) null);
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierVerticalScroll$default);
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
            ComposerKt.sourceInformationMarkerStart(composer, 1049806065, "C319@16991L1042,335@18075L41,374@20371L10,374@20315L112,375@20448L40,377@20645L513,377@20585L573,388@21200L41,392@21411L89,395@21642L1153,391@21359L1436,413@22817L41,415@22957L10,415@22900L113,416@23034L797,432@23853L41,434@23936L1437:BookDetailsDialog.kt#2thlc2");
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifier);
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
            ComposerKt.sourceInformationMarkerStart(composer, -1396582499, "C323@17225L11,320@17069L491,328@17585L40,329@17650L361:BookDetailsDialog.kt#2thlc2");
            Modifier modifier2 = BackgroundKt.background-bw27NRU(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(48.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)));
            Alignment center = Alignment.Companion.getCenter();
            ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
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
            Composer composer4 = Updater.constructor-impl(composer);
            Updater.set-impl(composer4, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer4, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer4.getInserting() || !Intrinsics.areEqual(composer4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composer4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composer4.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.set-impl(composer4, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScope boxScope = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1747183906, "C326@17481L11,326@17403L131:BookDetailsDialog.kt#2thlc2");
            IconKt.Icon-ww6aTOc(CameraAltKt.getCameraAlt(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(24.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 432, 0);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier3 = Modifier.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, modifier3);
            Function0 constructor4 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor4);
            } else {
                composer.useNode();
            }
            Composer composer5 = Updater.constructor-impl(composer);
            Updater.set-impl(composer5, measurePolicyColumnMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer5, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer5.getInserting() || !Intrinsics.areEqual(composer5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composer5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composer5.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.set-impl(composer5, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScope columnScope3 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 687747819, "C330@17732L10,330@17807L11,330@17687L142,331@17911L10,331@17956L11,331@17858L127:BookDetailsDialog.kt#2thlc2");
            TextKt.Text--4IGK_g("Confirm Return", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleLarge(), composer, 196614, 0, 65498);
            TextKt.Text--4IGK_g("Confirm book condition", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 6, 0, 65530);
            Composer composer6 = composer;
            ComposerKt.sourceInformationMarkerEnd(composer6);
            ComposerKt.sourceInformationMarkerEnd(composer6);
            composer6.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer6);
            ComposerKt.sourceInformationMarkerEnd(composer6);
            ComposerKt.sourceInformationMarkerEnd(composer6);
            ComposerKt.sourceInformationMarkerEnd(composer6);
            ComposerKt.sourceInformationMarkerEnd(composer6);
            composer6.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer6);
            ComposerKt.sourceInformationMarkerEnd(composer6);
            ComposerKt.sourceInformationMarkerEnd(composer6);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), composer6, 6);
            String returnImageUrl = book.getReturnImageUrl();
            if (returnImageUrl == null) {
                returnImageUrl = book.getImageUrl();
            }
            String str = returnImageUrl;
            String str2 = str;
            if (str2 == null || StringsKt.isBlank(str2)) {
                composer6.startReplaceGroup(1032690158);
            } else {
                composer6.startReplaceGroup(1050854980);
                ComposerKt.sourceInformation(composer6, "341@18465L10,339@18273L297,344@18595L40,350@18932L11,345@18660L1525,371@20210L41");
                String returnImageUrl2 = book.getReturnImageUrl();
                TextKt.Text--4IGK_g((returnImageUrl2 == null || StringsKt.isBlank(returnImageUrl2)) ? "Book Reference Photo:" : "Scanned Photo by Borrower:", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer6, MaterialTheme.$stable).getLabelLarge(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
                Modifier modifier4 = BackgroundKt.background-bw27NRU$default(ClipKt.clip(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(190.0f)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(14.0f))), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), (Shape) null, 2, (Object) null);
                ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer, modifier4);
                Function0 constructor5 = ComposeUiNode.Companion.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor5);
                } else {
                    composer.useNode();
                }
                Composer composer7 = Updater.constructor-impl(composer);
                Updater.set-impl(composer7, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl(composer7, currentCompositionLocalMap5, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash5 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composer7.getInserting() || !Intrinsics.areEqual(composer7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    composer7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    composer7.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                Updater.set-impl(composer7, modifierMaterializeModifier5, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScope boxScope2 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, -276965353, "C352@19016L247,358@19355L11,361@19608L551,357@19292L867:BookDetailsDialog.kt#2thlc2");
                BookImageDisplayKt.BookImageDisplay(str, "Borrower Return Image", SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null), null, null, composer, 432, 24);
                SurfaceKt.Surface-T9BRK9s(boxScope2.align(Modifier.Companion, Alignment.Companion.getTopStart()), RoundedCornerShapeKt.RoundedCornerShape-a9UjIt4$default(Dp.constructor-impl(0.0f), 0.0f, Dp.constructor-impl(10.0f), 0.0f, 10, (Object) null), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-1940616624, true, new Function2() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda11
                    public final Object invoke(Object obj, Object obj2) {
                        return BookDetailsDialogKt.BookDetailsDialog$lambda$117$lambda$116$lambda$115$lambda$99$lambda$98(book, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer, 54), composer, 12582912, 120);
                composer6 = composer;
                ComposerKt.sourceInformationMarkerEnd(composer6);
                ComposerKt.sourceInformationMarkerEnd(composer6);
                composer6.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer6);
                ComposerKt.sourceInformationMarkerEnd(composer6);
                ComposerKt.sourceInformationMarkerEnd(composer6);
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), composer6, 6);
            }
            composer6.endReplaceGroup();
            TextKt.Text--4IGK_g("Select Scanned Condition:", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer6, MaterialTheme.$stable).getLabelLarge(), composer, 196614, 0, 65502);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            final List listListOf = CollectionsKt.listOf(new String[]{"Mint", "Good", "Fair", "Poor"});
            Arrangement.Horizontal horizontal = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(8.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -1767141547, "CC(remember):BookDetailsDialog.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda17
                    public final Object invoke(Object obj) {
                        return BookDetailsDialogKt.BookDetailsDialog$lambda$117$lambda$116$lambda$115$lambda$103$lambda$102(listListOf, mutableState, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            String str3 = "CC(remember):BookDetailsDialog.kt#9igjgp";
            LazyDslKt.LazyRow((Modifier) null, (LazyListState) null, (PaddingValues) null, false, horizontal, (Alignment.Vertical) null, (FlingBehavior) null, false, (Function1) objRememberedValue, composer, 100687872, 239);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), composer, 6);
            final boolean zAreEqual = Intrinsics.areEqual(BookDetailsDialog$lambda$10(mutableState), book.getCondition());
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), CardDefaults.INSTANCE.cardColors-ro_MJ88(ColorKt.Color(zAreEqual ? 4293457385L : 4294962158L), 0L, 0L, 0L, composer, CardDefaults.$stable << 12, 14), (CardElevation) null, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(2110713030, true, new Function3() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda18
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return BookDetailsDialogKt.BookDetailsDialog$lambda$117$lambda$116$lambda$115$lambda$105(zAreEqual, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer, 54), composer, 196614, 24);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(24.0f)), composer, 6);
            TextKt.Text--4IGK_g("Rate Borrower Reliability:", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelLarge(), composer, 196614, 0, 65502);
            Arrangement.Horizontal horizontal2 = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(4.0f));
            Modifier modifier5 = PaddingKt.padding-VpY3zN4$default(Modifier.Companion, 0.0f, Dp.constructor-impl(8.0f), 1, (Object) null);
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontal2, Alignment.Companion.getTop(), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer, modifier5);
            Function0 constructor6 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
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
            Updater.set-impl(composer8, measurePolicyRowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer8, currentCompositionLocalMap6, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash6 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer8.getInserting() || !Intrinsics.areEqual(composer8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                composer8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                composer8.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
            }
            Updater.set-impl(composer8, modifierMaterializeModifier6, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope2 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 333711763, "C:BookDetailsDialog.kt#2thlc2");
            composer.startReplaceGroup(564954224);
            ComposerKt.sourceInformation(composer, "*427@23739L14,421@23278L505");
            final int i2 = 1;
            while (i2 < 6) {
                ImageVector star = i2 <= BookDetailsDialog$lambda$37(mutableState2) ? StarKt.getStar(Icons.INSTANCE.getDefault()) : StarOutlineKt.getStarOutline(Icons.INSTANCE.getDefault());
                String str4 = "Rate " + i2 + " stars";
                if (i2 <= BookDetailsDialog$lambda$37(mutableState2)) {
                    composer.startReplaceGroup(564963008);
                    composer.endReplaceGroup();
                    jColor = ColorKt.Color(4294947584L);
                } else {
                    composer.startReplaceGroup(564964575);
                    ComposerKt.sourceInformation(composer, "424@23561L11");
                    jColor = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU();
                    composer.endReplaceGroup();
                }
                long j = jColor;
                Modifier modifier6 = SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(36.0f));
                String str5 = str3;
                ComposerKt.sourceInformationMarkerStart(composer, 564969885, str5);
                boolean zChanged = composer.changed(i2);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda19
                        public final Object invoke() {
                            return BookDetailsDialogKt.BookDetailsDialog$lambda$117$lambda$116$lambda$115$lambda$108$lambda$107$lambda$106(i2, mutableState2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                str3 = str5;
                IconKt.Icon-ww6aTOc(star, str4, ClickableKt.clickable-XHw0xAI$default(modifier6, false, (String) null, (Role) null, (Function0) objRememberedValue2, 7, (Object) null), j, composer, 0, 0);
                i2++;
            }
            String str6 = str3;
            composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(24.0f)), composer, 6);
            Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(end, Alignment.Companion.getTop(), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
            Function0 constructor7 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
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
            Updater.set-impl(composer9, measurePolicyRowMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer9, currentCompositionLocalMap7, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash7 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer9.getInserting() || !Intrinsics.areEqual(composer9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                composer9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                composer9.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
            }
            Updater.set-impl(composer9, modifierMaterializeModifier7, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope3 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 2010755581, "C438@24134L338,438@24113L488,446@24626L39,447@24707L382,447@24690L661:BookDetailsDialog.kt#2thlc2");
            ComposerKt.sourceInformationMarkerStart(composer, -1182063134, str6);
            boolean zChangedInstance = composer.changedInstance(book) | composer.changedInstance(bookViewModel) | composer.changed(function0);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.Companion.getEmpty()) {
                Function0 function1 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda20
                    public final Object invoke() {
                        return BookDetailsDialogKt.BookDetailsDialog$lambda$117$lambda$116$lambda$115$lambda$114$lambda$111$lambda$110(book, bookViewModel, function0, mutableState3, mutableState, mutableState2, mutableState4);
                    }
                };
                composer.updateRememberedValue(function1);
                objRememberedValue3 = function1;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ButtonKt.TextButton((Function0) objRememberedValue3, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.m189getLambda$1090049619$app(), composer, 805306368, 510);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -1182044754, str6);
            boolean zChangedInstance2 = composer.changedInstance(bookViewModel) | composer.changedInstance((Object) r1) | composer.changedInstance(context) | composer.changed(function0);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                Function0 function2 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda21
                    public final Object invoke() {
                        return BookDetailsDialogKt.BookDetailsDialog$lambda$117$lambda$116$lambda$115$lambda$114$lambda$113$lambda$112(bookViewModel, book, context, function0, mutableState2, mutableState3, mutableState4);
                    }
                };
                composer.updateRememberedValue(function2);
                objRememberedValue4 = function2;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ButtonKt.Button((Function0) objRememberedValue4, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.getLambda$61718176$app(), composer, 805306368, 510);
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

    static final Unit BookDetailsDialog$lambda$117$lambda$116$lambda$115$lambda$99$lambda$98(Book book, Composer composer, int i) {
        String strSubstringBefore$default;
        ComposerKt.sourceInformation(composer, "C364@19813L10,367@20065L11,362@19642L487:BookDetailsDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1940616624, i, -1, "com.example.ui.screens.BookDetailsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BookDetailsDialog.kt:362)");
            }
            String borrowerName = book.getBorrowerName();
            if (borrowerName == null || (strSubstringBefore$default = StringsKt.substringBefore$default(borrowerName, "@", (String) null, 2, (Object) null)) == null) {
                strSubstringBefore$default = "Borrower";
            }
            TextKt.Text--4IGK_g("Scanned by " + strSubstringBefore$default, PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(8.0f), Dp.constructor-impl(4.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnPrimaryContainer-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 196656, 0, 65496);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$117$lambda$116$lambda$115$lambda$105(boolean z, ColumnScope columnScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(columnScope, "$this$Card");
        ComposerKt.sourceInformation(composer, "C396@21668L1105:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2110713030, i, -1, "com.example.ui.screens.BookDetailsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BookDetailsDialog.kt:396)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(12.0f));
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
            ComposerKt.sourceInformationMarkerStart(composer, 2076985144, "C397@21786L375,403@22190L40,406@22531L10,404@22259L488:BookDetailsDialog.kt#2thlc2");
            Icons.Filled filled = Icons.INSTANCE.getDefault();
            IconKt.Icon-ww6aTOc(z ? GppGoodKt.getGppGood(filled) : WarningKt.getWarning(filled), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(24.0f)), ColorKt.Color(z ? 4281236786L : 4291176488L), composer, 432, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(12.0f)), composer, 6);
            TextKt.Text--4IGK_g(z ? "Perfect! Condition matches originally listed condition.\nBorrower gets +10 Trust Points." : "Condition degraded!\nBorrower loses -20 Trust Points.", (Modifier) null, ColorKt.Color(z ? 4279983648L : 4290190364L), 0L, (FontStyle) null, FontWeight.Companion.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
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

    static final Unit BookDetailsDialog$lambda$117$lambda$116$lambda$115$lambda$108$lambda$107$lambda$106(int i, MutableState mutableState) {
        BookDetailsDialog$lambda$38(mutableState, i);
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$117$lambda$116$lambda$115$lambda$114$lambda$111$lambda$110(Book book, BookViewModel bookViewModel, Function0 function0, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4) {
        String borrowerName;
        if (!StringsKt.isBlank(BookDetailsDialog$lambda$40(mutableState)) && (borrowerName = book.getBorrowerName()) != null) {
            bookViewModel.addFeedback("USER_REVIEW", BookDetailsDialog$lambda$40(mutableState), borrowerName);
        }
        bookViewModel.returnBook(book, BookDetailsDialog$lambda$10(mutableState2), Integer.valueOf(BookDetailsDialog$lambda$37(mutableState3)));
        BookDetailsDialog$lambda$5(mutableState4, false);
        function0.invoke();
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$117$lambda$116$lambda$115$lambda$114$lambda$113$lambda$112(BookViewModel bookViewModel, Book book, Context context, Function0 function0, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        bookViewModel.m161confirmAndCompleteReturn0E7RQCE(book, Integer.valueOf(BookDetailsDialog$lambda$37(mutableState)), BookDetailsDialog$lambda$40(mutableState2));
        BookDetailsDialog$lambda$5(mutableState3, false);
        Toast.makeText(context, "Return accepted! '" + book.getTitle() + "' is now back in your library.", 1).show();
        function0.invoke();
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$119$lambda$118(MutableState mutableState) {
        BookDetailsDialog$lambda$8(mutableState, false);
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$130(final BookViewModel bookViewModel, final Book book, final Function0 function0, final ManagedActivityResultLauncher managedActivityResultLauncher, final MutableState mutableState, final MutableState mutableState2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C467@25690L11,467@25648L62,468@25753L38,470@25885L3318,465@25553L3650:BookDetailsDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1512907091, i, -1, "com.example.ui.screens.BookDetailsDialog.<anonymous> (BookDetailsDialog.kt:465)");
            }
            CardKt.Card(PaddingKt.padding-VpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(8.0f), 0.0f, 2, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(24.0f)), CardDefaults.INSTANCE.cardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0L, 0L, composer, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.cardElevation-aqJV_2Y(Dp.constructor-impl(8.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer, (CardDefaults.$stable << 18) | 6, 62), (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(1211652639, true, new Function3() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda49
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return BookDetailsDialogKt.BookDetailsDialog$lambda$130$lambda$129(bookViewModel, book, function0, managedActivityResultLauncher, mutableState, mutableState2, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer, 54), composer, 196614, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$130$lambda$129(final BookViewModel bookViewModel, final Book book, final Function0 function0, final ManagedActivityResultLauncher managedActivityResultLauncher, final MutableState mutableState, final MutableState mutableState2, ColumnScope columnScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(columnScope, "$this$Card");
        ComposerKt.sourceInformation(composer, "C471@25903L3286:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1211652639, i, -1, "com.example.ui.screens.BookDetailsDialog.<anonymous>.<anonymous> (BookDetailsDialog.kt:471)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(24.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
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
            ComposerKt.sourceInformationMarkerStart(composer, 2129187563, "C472@25968L1058,488@27068L41,492@27368L10,493@27437L11,490@27151L336,496@27529L41,498@27612L1559:BookDetailsDialog.kt#2thlc2");
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier2 = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
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
            ComposerKt.sourceInformationMarkerStart(composer, -317039956, "C476@26202L11,473@26046L495,481@26566L40,482@26631L373:BookDetailsDialog.kt#2thlc2");
            Modifier modifier3 = BackgroundKt.background-bw27NRU(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(48.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSecondaryContainer-0d7_KjU(), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)));
            Alignment center = Alignment.Companion.getCenter();
            ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifier3);
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
            Composer composer4 = Updater.constructor-impl(composer);
            Updater.set-impl(composer4, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer4, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer4.getInserting() || !Intrinsics.areEqual(composer4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composer4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composer4.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.set-impl(composer4, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScope boxScope = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1468241281, "C479@26460L11,479@26382L133:BookDetailsDialog.kt#2thlc2");
            IconKt.Icon-ww6aTOc(CameraAltKt.getCameraAlt(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(24.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSecondary-0d7_KjU(), composer, 432, 0);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier4 = Modifier.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, modifier4);
            Function0 constructor4 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor4);
            } else {
                composer.useNode();
            }
            Composer composer5 = Updater.constructor-impl(composer);
            Updater.set-impl(composer5, measurePolicyColumnMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer5, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer5.getInserting() || !Intrinsics.areEqual(composer5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composer5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composer5.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.set-impl(composer5, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScope columnScope3 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1767290238, "C483@26719L10,483@26794L11,483@26668L148,484@26904L10,484@26949L11,484@26845L133:BookDetailsDialog.kt#2thlc2");
            TextStyle titleLarge = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleLarge();
            TextKt.Text--4IGK_g("Initiate Return Scan", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, titleLarge, composer, 196614, 0, 65498);
            TextKt.Text--4IGK_g("Take photo of book condition", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 6, 0, 65530);
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
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), composer, 6);
            TextKt.Text--4IGK_g("Scan the book to let AI analyze its condition. The lender will then review the condition at the meetup spot to confirm the return.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 6, 0, 65530);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(24.0f)), composer, 6);
            Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(end, Alignment.Companion.getTop(), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
            Function0 constructor5 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor5);
            } else {
                composer.useNode();
            }
            Composer composer6 = Updater.constructor-impl(composer);
            Updater.set-impl(composer6, measurePolicyRowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer6, currentCompositionLocalMap5, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash5 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer6.getInserting() || !Intrinsics.areEqual(composer6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                composer6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                composer6.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
            }
            Updater.set-impl(composer6, modifierMaterializeModifier5, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope2 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1413278083, "C502@27810L191,502@27789L341,509@28155L39,511@28265L478,521@28841L11,521@28797L66,510@28219L930:BookDetailsDialog.kt#2thlc2");
            ComposerKt.sourceInformationMarkerStart(composer, 599778447, "CC(remember):BookDetailsDialog.kt#9igjgp");
            boolean zChangedInstance = composer.changedInstance(bookViewModel) | composer.changedInstance(book) | composer.changed(function0);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda71
                    public final Object invoke() {
                        return BookDetailsDialogKt.BookDetailsDialog$lambda$130$lambda$129$lambda$128$lambda$127$lambda$124$lambda$123(bookViewModel, book, function0, mutableState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ButtonKt.TextButton((Function0) objRememberedValue, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.getLambda$1910683885$app(), composer, 805306368, 510);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, 599793294, "CC(remember):BookDetailsDialog.kt#9igjgp");
            boolean zChangedInstance2 = composer.changedInstance(managedActivityResultLauncher) | composer.changedInstance(bookViewModel) | composer.changedInstance(book) | composer.changed(function0);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                Function0 function1 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda72
                    public final Object invoke() {
                        return BookDetailsDialogKt.BookDetailsDialog$lambda$130$lambda$129$lambda$128$lambda$127$lambda$126$lambda$125(managedActivityResultLauncher, bookViewModel, book, function0, mutableState2, mutableState);
                    }
                };
                composer.updateRememberedValue(function1);
                objRememberedValue2 = function1;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ButtonKt.Button((Function0) objRememberedValue2, (Modifier) null, false, (Shape) null, ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSecondary-0d7_KjU(), 0L, 0L, 0L, composer, ButtonDefaults.$stable << 12, 14), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.m193getLambda$1232515616$app(), composer, 805306368, 494);
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

    static final Unit BookDetailsDialog$lambda$130$lambda$129$lambda$128$lambda$127$lambda$124$lambda$123(BookViewModel bookViewModel, Book book, Function0 function0, MutableState mutableState) {
        BookViewModel.initiateReturn$default(bookViewModel, book, null, null, null, 14, null);
        BookDetailsDialog$lambda$8(mutableState, false);
        function0.invoke();
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$130$lambda$129$lambda$128$lambda$127$lambda$126$lambda$125(ManagedActivityResultLauncher managedActivityResultLauncher, BookViewModel bookViewModel, Book book, Function0 function0, MutableState mutableState, MutableState mutableState2) {
        mutableState.setValue("BORROWER_RETURN");
        try {
            managedActivityResultLauncher.launch((Object) null);
        } catch (Exception unused) {
            BookViewModel.initiateReturn$default(bookViewModel, book, null, null, null, 14, null);
            BookDetailsDialog$lambda$8(mutableState2, false);
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$132$lambda$131(MutableState mutableState) {
        BookDetailsDialog$lambda$14(mutableState, false);
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$143(final Book book, final BookViewModel bookViewModel, final Function0 function0, final ManagedActivityResultLauncher managedActivityResultLauncher, final MutableState mutableState, final MutableState mutableState2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C537@29476L11,537@29434L62,538@29539L38,540@29671L3331,535@29339L3663:BookDetailsDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1334053358, i, -1, "com.example.ui.screens.BookDetailsDialog.<anonymous> (BookDetailsDialog.kt:535)");
            }
            CardKt.Card(PaddingKt.padding-VpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(8.0f), 0.0f, 2, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(24.0f)), CardDefaults.INSTANCE.cardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0L, 0L, composer, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.cardElevation-aqJV_2Y(Dp.constructor-impl(8.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer, (CardDefaults.$stable << 18) | 6, 62), (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-236354208, true, new Function3() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda50
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return BookDetailsDialogKt.BookDetailsDialog$lambda$143$lambda$142(book, bookViewModel, function0, managedActivityResultLauncher, mutableState, mutableState2, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer, 54), composer, 196614, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$143$lambda$142(final Book book, final BookViewModel bookViewModel, final Function0 function0, final ManagedActivityResultLauncher managedActivityResultLauncher, final MutableState mutableState, final MutableState mutableState2, ColumnScope columnScope, Composer composer, int i) {
        String strSubstringBefore$default;
        Intrinsics.checkNotNullParameter(columnScope, "$this$Card");
        ComposerKt.sourceInformation(composer, "C541@29689L3299:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-236354208, i, -1, "com.example.ui.screens.BookDetailsDialog.<anonymous>.<anonymous> (BookDetailsDialog.kt:541)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(24.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
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
            ComposerKt.sourceInformationMarkerStart(composer, -1086237283, "C542@29754L1043,558@30839L41,562@31166L10,563@31235L11,560@30922L363,566@31327L41,568@31410L1560:BookDetailsDialog.kt#2thlc2");
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier2 = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
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
            ComposerKt.sourceInformationMarkerStart(composer, 762501626, "C546@29988L11,543@29832L495,551@30352L40,552@30417L358:BookDetailsDialog.kt#2thlc2");
            Modifier modifier3 = BackgroundKt.background-bw27NRU(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(48.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSecondaryContainer-0d7_KjU(), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)));
            Alignment center = Alignment.Companion.getCenter();
            ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifier3);
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
            Composer composer4 = Updater.constructor-impl(composer);
            Updater.set-impl(composer4, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer4, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer4.getInserting() || !Intrinsics.areEqual(composer4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composer4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composer4.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.set-impl(composer4, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScope boxScope = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -388699234, "C549@30246L11,549@30168L133:BookDetailsDialog.kt#2thlc2");
            IconKt.Icon-ww6aTOc(CameraAltKt.getCameraAlt(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(24.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSecondary-0d7_KjU(), composer, 432, 0);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier4 = Modifier.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, modifier4);
            Function0 constructor4 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor4);
            } else {
                composer.useNode();
            }
            Composer composer5 = Updater.constructor-impl(composer);
            Updater.set-impl(composer5, measurePolicyColumnMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer5, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer5.getInserting() || !Intrinsics.areEqual(composer5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composer5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composer5.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.set-impl(composer5, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScope columnScope3 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1448135476, "C553@30498L10,553@30573L11,553@30454L141,554@30675L10,554@30720L11,554@30624L125:BookDetailsDialog.kt#2thlc2");
            TextKt.Text--4IGK_g("Handover Scan", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleLarge(), composer, 196614, 0, 65498);
            TextKt.Text--4IGK_g("Secure your transfer", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 6, 0, 65530);
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
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), composer, 6);
            String requestedByName = book.getRequestedByName();
            if (requestedByName == null || (strSubstringBefore$default = StringsKt.substringBefore$default(requestedByName, "@", (String) null, 2, (Object) null)) == null) {
                strSubstringBefore$default = "the borrower";
            }
            TextKt.Text--4IGK_g("Take a photo of the book being handed over to " + strSubstringBefore$default + ". This provides proof of transfer and condition.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 0, 0, 65530);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(24.0f)), composer, 6);
            Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(end, Alignment.Companion.getTop(), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
            Function0 constructor5 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor5);
            } else {
                composer.useNode();
            }
            Composer composer6 = Updater.constructor-impl(composer);
            Updater.set-impl(composer6, measurePolicyRowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer6, currentCompositionLocalMap5, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash5 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer6.getInserting() || !Intrinsics.areEqual(composer6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                composer6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                composer6.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
            }
            Updater.set-impl(composer6, modifierMaterializeModifier5, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope2 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1802147135, "C572@31608L192,572@31587L342,579@31954L39,581@32064L472,591@32634L11,591@32590L66,580@32018L930:BookDetailsDialog.kt#2thlc2");
            ComposerKt.sourceInformationMarkerStart(composer, 634602385, "CC(remember):BookDetailsDialog.kt#9igjgp");
            boolean zChangedInstance = composer.changedInstance(bookViewModel) | composer.changedInstance(book) | composer.changed(function0);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda46
                    public final Object invoke() {
                        return BookDetailsDialogKt.BookDetailsDialog$lambda$143$lambda$142$lambda$141$lambda$140$lambda$137$lambda$136(bookViewModel, book, function0, mutableState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ButtonKt.TextButton((Function0) objRememberedValue, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.getLambda$462677038$app(), composer, 805306368, 510);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, 634617257, "CC(remember):BookDetailsDialog.kt#9igjgp");
            boolean zChangedInstance2 = composer.changedInstance(managedActivityResultLauncher) | composer.changedInstance(bookViewModel) | composer.changedInstance(book) | composer.changed(function0);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                Function0 function1 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda47
                    public final Object invoke() {
                        return BookDetailsDialogKt.BookDetailsDialog$lambda$143$lambda$142$lambda$141$lambda$140$lambda$139$lambda$138(managedActivityResultLauncher, bookViewModel, book, function0, mutableState2, mutableState);
                    }
                };
                composer.updateRememberedValue(function1);
                objRememberedValue2 = function1;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ButtonKt.Button((Function0) objRememberedValue2, (Modifier) null, false, (Shape) null, ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSecondary-0d7_KjU(), 0L, 0L, 0L, composer, ButtonDefaults.$stable << 12, 14), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.getLambda$1614444833$app(), composer, 805306368, 494);
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

    static final Unit BookDetailsDialog$lambda$143$lambda$142$lambda$141$lambda$140$lambda$137$lambda$136(BookViewModel bookViewModel, Book book, Function0 function0, MutableState mutableState) {
        BookViewModel.transferBookInitiated$default(bookViewModel, book, null, null, null, 14, null);
        BookDetailsDialog$lambda$14(mutableState, false);
        function0.invoke();
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$143$lambda$142$lambda$141$lambda$140$lambda$139$lambda$138(ManagedActivityResultLauncher managedActivityResultLauncher, BookViewModel bookViewModel, Book book, Function0 function0, MutableState mutableState, MutableState mutableState2) {
        mutableState.setValue("HANDOVER");
        try {
            managedActivityResultLauncher.launch((Object) null);
        } catch (Exception unused) {
            BookViewModel.transferBookInitiated$default(bookViewModel, book, null, null, null, 14, null);
            BookDetailsDialog$lambda$14(mutableState2, false);
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$145$lambda$144(MutableState mutableState) {
        BookDetailsDialog$lambda$47(mutableState, false);
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$147$lambda$146(BookViewModel bookViewModel, Book book, Context context, MutableState mutableState, MutableState mutableState2, String str) {
        Object objM165verifyHandoverQrgIAlus;
        String message;
        Intrinsics.checkNotNullParameter(str, "raw");
        if (Intrinsics.areEqual(BookDetailsDialog$lambda$55(mutableState), "RETURN")) {
            objM165verifyHandoverQrgIAlus = bookViewModel.m166verifyReturnQrgIAlus(book, str);
        } else {
            objM165verifyHandoverQrgIAlus = bookViewModel.m165verifyHandoverQrgIAlus(book, str);
        }
        BookDetailsDialog$lambda$53(mutableState2, false);
        if (Result.isSuccess-impl(objM165verifyHandoverQrgIAlus)) {
            if (Result.isFailure-impl(objM165verifyHandoverQrgIAlus)) {
                objM165verifyHandoverQrgIAlus = null;
            }
            String str2 = (String) objM165verifyHandoverQrgIAlus;
            if (str2 == null) {
                str2 = "QR verified successfully!";
            }
            Toast.makeText(context, str2, 1).show();
        } else {
            Throwable th = Result.exceptionOrNull-impl(objM165verifyHandoverQrgIAlus);
            if (th == null || (message = th.getMessage()) == null) {
                message = "Verification failed. Please ensure the QR is for this book.";
            }
            Toast.makeText(context, message, 1).show();
        }
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$149$lambda$148(MutableState mutableState) {
        BookDetailsDialog$lambda$53(mutableState, false);
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$151$lambda$150(Function0 function0, MutableState mutableState) {
        BookDetailsDialog$lambda$59(mutableState, false);
        function0.invoke();
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$153$lambda$152(MutableState mutableState) {
        BookDetailsDialog$lambda$44(mutableState, false);
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$155$lambda$154(MutableState mutableState) {
        BookDetailsDialog$lambda$65(mutableState, false);
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$157$lambda$156(MutableState mutableState) {
        BookDetailsDialog$lambda$68(mutableState, false);
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343(final Book book, final AudioHelper audioHelper, final Function0 function0, final Function0 function1, final BookViewModel bookViewModel, final MutableState mutableState, final boolean z, final String str, final boolean z2, final boolean z3, final MutableState mutableState2, final MutableState mutableState3, final MutableState mutableState4, final Context context, final MutableState mutableState5, final MutableState mutableState6, final MutableState mutableState7, final ManagedActivityResultLauncher managedActivityResultLauncher, final MutableState mutableState8, final MutableState mutableState9, final MutableState mutableState10, final MutableState mutableState11, final MutableState mutableState12, final MutableState mutableState13, final MutableState mutableState14, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C680@35841L11,680@35799L62,681@35900L38,682@35949L82782,674@35578L83153:BookDetailsDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2029675546, i, -1, "com.example.ui.screens.BookDetailsDialog.<anonymous> (BookDetailsDialog.kt:674)");
            }
            CardKt.Card(PaddingKt.padding-3ABfNKs(SizeKt.fillMaxHeight(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), 0.85f), Dp.constructor-impl(4.0f)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(24.0f)), CardDefaults.INSTANCE.cardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0L, 0L, composer, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.cardElevation-aqJV_2Y(Dp.constructor-impl(8.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer, (CardDefaults.$stable << 18) | 6, 62), (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-759694708, true, new Function3() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda26
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return BookDetailsDialogKt.BookDetailsDialog$lambda$343$lambda$342(book, audioHelper, function0, function1, bookViewModel, mutableState, z, str, z2, z3, mutableState2, mutableState3, mutableState4, context, mutableState5, mutableState6, mutableState7, managedActivityResultLauncher, mutableState8, mutableState9, mutableState10, mutableState11, mutableState12, mutableState13, mutableState14, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer, 54), composer, 196614, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.ModVisitor.anonymousCallArgMod(ModVisitor.java:535)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.ModVisitor.processAnonymousConstructor(ModVisitor.java:528)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:111)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    static final kotlin.Unit BookDetailsDialog$lambda$343$lambda$342(final com.example.data.Book r54, com.example.util.AudioHelper r55, kotlin.jvm.functions.Function0 r56, kotlin.jvm.functions.Function0 r57, com.example.ui.BookViewModel r58, final androidx.compose.runtime.MutableState r59, final boolean r60, final java.lang.String r61, boolean r62, boolean r63, androidx.compose.runtime.MutableState r64, androidx.compose.runtime.MutableState r65, androidx.compose.runtime.MutableState r66, android.content.Context r67, androidx.compose.runtime.MutableState r68, androidx.compose.runtime.MutableState r69, androidx.compose.runtime.MutableState r70, androidx.activity.compose.ManagedActivityResultLauncher r71, androidx.compose.runtime.MutableState r72, androidx.compose.runtime.MutableState r73, androidx.compose.runtime.MutableState r74, androidx.compose.runtime.MutableState r75, androidx.compose.runtime.MutableState r76, androidx.compose.runtime.MutableState r77, androidx.compose.runtime.MutableState r78, androidx.compose.foundation.layout.ColumnScope r79, androidx.compose.runtime.Composer r80, int r81) {
        /*
            Method dump skipped, instruction units count: 5610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.BookDetailsDialogKt.BookDetailsDialog$lambda$343$lambda$342(com.example.data.Book, com.example.util.AudioHelper, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, com.example.ui.BookViewModel, androidx.compose.runtime.MutableState, boolean, java.lang.String, boolean, boolean, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, android.content.Context, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.activity.compose.ManagedActivityResultLauncher, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$169$lambda$158(Book book, RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Badge");
        ComposerKt.sourceInformation(composer, "C705@37162L10,702@36907L361:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1556882579, i, -1, "com.example.ui.screens.BookDetailsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BookDetailsDialog.kt:702)");
            }
            TextKt.Text--4IGK_g(Intrinsics.areEqual(book.getStatus(), "PENDING_RECEIPT") ? "Transferring" : book.getStatus(), PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(8.0f), Dp.constructor-impl(4.0f)), 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelMedium(), composer, 196656, 0, 65500);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$169$lambda$168$lambda$160$lambda$159(Book book, AudioHelper audioHelper, MutableState mutableState) {
        String title = book.getTitle();
        String author = book.getAuthor();
        String status = book.getStatus();
        String condition = book.getCondition();
        String description = book.getDescription();
        if (description == null) {
            description = "";
        }
        audioHelper.toggle(title + ", written by " + author + ". Current status: " + status + ". Condition is " + condition + ". " + description);
        BookDetailsDialog$lambda$2(mutableState, audioHelper.isSpeaking());
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$169$lambda$168$lambda$161(MutableState mutableState, Composer composer, int i) {
        long j;
        ComposerKt.sourceInformation(composer, "C716@37764L341:BookDetailsDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(308412647, i, -1, "com.example.ui.screens.BookDetailsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BookDetailsDialog.kt:716)");
            }
            ImageVector volumeOff = BookDetailsDialog$lambda$1(mutableState) ? VolumeOffKt.getVolumeOff(Icons.INSTANCE.getDefault()) : VolumeUpKt.getVolumeUp(Icons.INSTANCE.getDefault());
            if (BookDetailsDialog$lambda$1(mutableState)) {
                composer.startReplaceGroup(31819852);
                ComposerKt.sourceInformation(composer, "719@38019L11");
                j = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU();
            } else {
                composer.startReplaceGroup(31821038);
                ComposerKt.sourceInformation(composer, "719@38056L11");
                j = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU();
            }
            composer.endReplaceGroup();
            IconKt.Icon-ww6aTOc(volumeOff, "Listen to book details", (Modifier) null, j, composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$169$lambda$168$lambda$163$lambda$162(Function0 function0, Function0 function1) {
        function0.invoke();
        function1.invoke();
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$169$lambda$168$lambda$164(boolean z, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C729@38547L11,726@38318L278:BookDetailsDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1237103842, i, -1, "com.example.ui.screens.BookDetailsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BookDetailsDialog.kt:726)");
            }
            IconKt.Icon-ww6aTOc(ChatKt.getChat(Icons.AutoMirrored.Filled.INSTANCE), "Chat with ".concat(z ? "Borrower" : "Owner"), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$169$lambda$168$lambda$166$lambda$165(BookViewModel bookViewModel, Book book) {
        bookViewModel.toggleBookmark(book);
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$169$lambda$168$lambda$167(Book book, String str, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C736@39057L11,733@38734L372:BookDetailsDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(200949023, i, -1, "com.example.ui.screens.BookDetailsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BookDetailsDialog.kt:733)");
            }
            IconKt.Icon-ww6aTOc(book.getBookmarkedBy().contains(str) ? BookmarkKt.getBookmark(Icons.INSTANCE.getDefault()) : BookmarkBorderKt.getBookmarkBorder(Icons.INSTANCE.getDefault()), "Bookmark", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$176$lambda$171$lambda$170(boolean z, Book book, String str, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        if (z && Intrinsics.areEqual(book.getStatus(), "PENDING_TRANSFER")) {
            BookDetailsDialog$lambda$14(mutableState, true);
        } else if (!z && Intrinsics.areEqual(book.getStatus(), "BORROWED") && Intrinsics.areEqual(book.getBorrowerName(), str)) {
            BookDetailsDialog$lambda$8(mutableState2, true);
        } else {
            BookDetailsDialog$lambda$44(mutableState3, true);
        }
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$183(final Book book, final Context context, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C881@46863L3222:BookDetailsDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(82643246, i, -1, "com.example.ui.screens.BookDetailsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BookDetailsDialog.kt:881)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(12.0f));
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer, 54);
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
            ComposerKt.sourceInformationMarkerStart(composer, 1930512555, "C886@47161L1140,913@49457L48,899@48388L937,898@48334L1721:BookDetailsDialog.kt#2thlc2");
            Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.Companion, 1.0f, false, 2, (Object) null);
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierWeight$default);
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
            Updater.set-impl(composer3, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer3, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composer3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composer3.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.set-impl(composer3, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1903255114, "C887@47238L507,892@47782L40,893@47915L10,893@47859L112:BookDetailsDialog.kt#2thlc2");
            Alignment.Vertical centerVertically2 = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier2 = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer, 48);
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
            Composer composer4 = Updater.constructor-impl(composer);
            Updater.set-impl(composer4, measurePolicyRowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer4, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer4.getInserting() || !Intrinsics.areEqual(composer4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composer4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composer4.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.set-impl(composer4, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope2 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 291867644, "C888@47332L117,889@47490L39,890@47627L10,890@47570L137:BookDetailsDialog.kt#2thlc2");
            IconKt.Icon-ww6aTOc(CheckCircleKt.getCheckCircle(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), ColorKt.Color(4279994175L), composer, 3504, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextStyle labelMedium = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelMedium();
            TextKt.Text--4IGK_g("Confirmed Safe Meetup Spot", (Modifier) null, ColorKt.Color(4279994175L), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, labelMedium, composer, 196998, 0, 65498);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(2.0f)), composer, 6);
            String agreedMeetupSpot = book.getAgreedMeetupSpot();
            if (agreedMeetupSpot == null) {
                agreedMeetupSpot = "";
            }
            TextKt.Text--4IGK_g(agreedMeetupSpot, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
            Composer composer5 = composer;
            String agreedMeetupAddress = book.getAgreedMeetupAddress();
            if (agreedMeetupAddress == null || StringsKt.isBlank(agreedMeetupAddress)) {
                composer5.startReplaceGroup(1856362126);
            } else {
                composer5.startReplaceGroup(1904040250);
                ComposerKt.sourceInformation(composer5, "895@48156L10,895@48200L11,895@48097L132");
                String agreedMeetupAddress2 = book.getAgreedMeetupAddress();
                if (agreedMeetupAddress2 == null) {
                    agreedMeetupAddress2 = "";
                }
                TextKt.Text--4IGK_g(agreedMeetupAddress2, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer5, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer5, MaterialTheme.$stable).getBodySmall(), composer, 0, 0, 65530);
                composer5 = composer;
            }
            composer5.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer5);
            ComposerKt.sourceInformationMarkerEnd(composer5);
            composer5.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer5);
            ComposerKt.sourceInformationMarkerEnd(composer5);
            ComposerKt.sourceInformationMarkerEnd(composer5);
            Shape shape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(8.0f));
            ButtonColors buttonColors = ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(ColorKt.Color(4279994175L), 0L, 0L, 0L, composer, (ButtonDefaults.$stable << 12) | 6, 14);
            PaddingValues paddingValues = PaddingKt.PaddingValues-YgX7TsA(Dp.constructor-impl(10.0f), Dp.constructor-impl(4.0f));
            Modifier modifier3 = SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(32.0f));
            ComposerKt.sourceInformationMarkerStart(composer, 1724879891, "CC(remember):BookDetailsDialog.kt#9igjgp");
            boolean zChangedInstance = composer.changedInstance(book) | composer.changedInstance(context);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda22
                    public final Object invoke() {
                        return BookDetailsDialogKt.BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$183$lambda$182$lambda$181$lambda$180(book, context);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ButtonKt.Button((Function0) objRememberedValue, modifier3, false, shape, buttonColors, (ButtonElevation) null, (BorderStroke) null, paddingValues, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.m218getLambda$681887910$app(), composer, 817889328, 356);
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

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$183$lambda$182$lambda$181$lambda$180(Book book, Context context) {
        String agreedMeetupAddress = book.getAgreedMeetupAddress();
        if (agreedMeetupAddress == null && (agreedMeetupAddress = book.getAgreedMeetupSpot()) == null) {
            agreedMeetupAddress = "";
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + Uri.encode(agreedMeetupAddress)));
        intent.setPackage("com.google.android.apps.maps");
        try {
            context.startActivity(intent);
        } catch (Exception unused) {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.google.com/maps/search/?api=1&query=" + Uri.encode(agreedMeetupAddress))));
        }
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$185$lambda$184(MutableState mutableState) {
        BookDetailsDialog$lambda$68(mutableState, true);
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$195$lambda$193$lambda$192(Book book, AudioHelper audioHelper, MutableState mutableState) {
        String title = book.getTitle();
        String author = book.getAuthor();
        String description = book.getDescription();
        if (description == null) {
            description = "No description available.";
        }
        audioHelper.toggle(title + " by " + author + ". " + description);
        BookDetailsDialog$lambda$2(mutableState, audioHelper.isSpeaking());
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$195$lambda$194(MutableState mutableState, RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$FilledTonalButton");
        ComposerKt.sourceInformation(composer, "C994@54064L259,999@54352L39,1000@54494L10,1000@54420L96:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1520510939, i, -1, "com.example.ui.screens.BookDetailsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BookDetailsDialog.kt:994)");
            }
            IconKt.Icon-ww6aTOc(BookDetailsDialog$lambda$1(mutableState) ? VolumeOffKt.getVolumeOff(Icons.INSTANCE.getDefault()) : VolumeUpKt.getVolumeUp(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(14.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g(BookDetailsDialog$lambda$1(mutableState) ? "Stop Audio" : "🔊 Listen", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 0, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x012e  */
    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$199(Book book, boolean z, ColumnScope columnScope, Composer composer, int i) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(columnScope, "$this$Card");
        ComposerKt.sourceInformation(composer, "C1026@55722L1232:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(685926762, i, -1, "com.example.ui.screens.BookDetailsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BookDetailsDialog.kt:1026)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(12.0f));
            Arrangement.Vertical vertical = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(6.0f));
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
            ComposerKt.sourceInformationMarkerStart(composer, -316758374, "C1030@55927L69,1031@56025L78,1032@56132L91,1033@56252L80,1034@56361L137:BookDetailsDialog.kt#2thlc2");
            String publisher = book.getPublisher();
            String str3 = "Unknown";
            if (publisher == null) {
                publisher = "Unknown";
            }
            MetadataRow("Publisher", publisher, composer, 6);
            String publishedDate = book.getPublishedDate();
            if (publishedDate == null) {
                publishedDate = "Unknown";
            }
            MetadataRow("Published Date", publishedDate, composer, 6);
            Integer pageCount = book.getPageCount();
            if (pageCount != null) {
                str = pageCount.intValue() + " pages";
                if (str == null) {
                    str = "Unknown";
                }
            } else {
                str = "Unknown";
            }
            MetadataRow("Page Count", str, composer, 6);
            String language = book.getLanguage();
            if (language != null) {
                String upperCase = language.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                if (upperCase != null) {
                    str3 = upperCase;
                }
            }
            MetadataRow("Language", str3, composer, 6);
            if (z) {
                str2 = "You";
            } else {
                String ownerDisplayName = book.getOwnerDisplayName();
                if (StringsKt.isBlank(ownerDisplayName)) {
                    ownerDisplayName = StringsKt.substringBefore$default(book.getOwnerName(), "@", (String) null, 2, (Object) null);
                }
                str2 = ownerDisplayName;
            }
            MetadataRow("Shared By", str2, composer, 6);
            String pickupAddress = book.getPickupAddress();
            if (pickupAddress == null || StringsKt.isBlank(pickupAddress)) {
                composer.startReplaceGroup(-372269982);
            } else {
                composer.startReplaceGroup(-316148481);
                ComposerKt.sourceInformation(composer, "1036@56602L66");
                MetadataRow("Pickup Location", book.getPickupAddress(), composer, 6);
            }
            composer.endReplaceGroup();
            String mobileNumber = book.getMobileNumber();
            if (mobileNumber == null || StringsKt.isBlank(mobileNumber)) {
                composer.startReplaceGroup(-372269982);
            } else {
                composer.startReplaceGroup(-315919422);
                ComposerKt.sourceInformation(composer, "1040@56834L64");
                MetadataRow("Contact Number", book.getMobileNumber(), composer, 6);
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

    /* JADX WARN: Code duplicated, block: B:102:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:106:0x072d A[LOOP:0: B:104:0x0727->B:106:0x072d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:110:0x07aa  */
    /* JADX WARN: Code duplicated, block: B:80:0x0498  */
    /* JADX WARN: Code duplicated, block: B:82:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:84:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:86:0x0509  */
    /* JADX WARN: Code duplicated, block: B:87:0x0544  */
    /* JADX WARN: Code duplicated, block: B:90:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:91:0x0645  */
    /* JADX WARN: Code duplicated, block: B:93:0x069d  */
    /* JADX WARN: Code duplicated, block: B:96:0x06a9  */
    /* JADX WARN: Code duplicated, block: B:97:0x06ad  */
    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$221(boolean z, boolean z2, final Book book, Function0 function0, final State state, final MutableState mutableState, final MutableState mutableState2, State state2, ColumnScope columnScope, Composer composer, int i) {
        Object obj;
        String str;
        boolean z3;
        boolean z4;
        Composer composer2;
        int currentCompositeKeyHash;
        Function0 constructor;
        Composer composer3;
        Function2 setCompositeKeyHash;
        Object objRememberedValue;
        Intrinsics.checkNotNullParameter(columnScope, "$this$Card");
        ComposerKt.sourceInformation(composer, "C1058@57939L8889:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-883722911, i, -1, "com.example.ui.screens.BookDetailsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BookDetailsDialog.kt:1058)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(14.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifier);
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
            Updater.set-impl(composer4, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer4, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer4.getInserting() || !Intrinsics.areEqual(composer4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composer4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composer4.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.set-impl(composer4, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScope columnScope2 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1806182390, "C1059@58012L5118,1133@63188L41,1136@63413L10,1138@63557L11,1134@63258L357,1140@63644L40:BookDetailsDialog.kt#2thlc2");
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer, 54);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
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
            Updater.set-impl(composer5, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer5, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer5.getInserting() || !Intrinsics.areEqual(composer5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composer5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composer5.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.set-impl(composer5, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -230726862, "C1064@58310L2678:BookDetailsDialog.kt#2thlc2");
            Alignment.Vertical centerVertically2 = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier2 = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer, 48);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifier2);
            Function0 constructor4 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor4);
            } else {
                composer.useNode();
            }
            Composer composer6 = Updater.constructor-impl(composer);
            Updater.set-impl(composer6, measurePolicyRowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer6, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer6.getInserting() || !Intrinsics.areEqual(composer6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composer6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composer6.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.set-impl(composer6, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope2 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1356309258, "C1067@58532L11,1069@58663L1281,1065@58400L1544,1088@59981L40,1089@60058L896:BookDetailsDialog.kt#2thlc2");
            SurfaceKt.Surface-T9BRK9s(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(38.0f)), RoundedCornerShapeKt.getCircleShape(), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(667203962, true, new Function2() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda73
                public final Object invoke(Object obj2, Object obj3) {
                    return BookDetailsDialogKt.BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$221$lambda$220$lambda$212$lambda$209$lambda$206(book, state, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer, 54), composer, 12582918, 120);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f)), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier3 = Modifier.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, modifier3);
            Function0 constructor5 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor5);
            } else {
                composer.useNode();
            }
            Composer composer7 = Updater.constructor-impl(composer);
            Updater.set-impl(composer7, measurePolicyColumnMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer7, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash5 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer7.getInserting() || !Intrinsics.areEqual(composer7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                composer7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                composer7.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
            }
            Updater.set-impl(composer7, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScope columnScope3 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 256734085, "C1092@60340L10,1090@60107L370,1097@60704L10,1095@60518L398:BookDetailsDialog.kt#2thlc2");
            if (z) {
                str = "You (Book Owner)";
                obj = null;
            } else {
                String ownerDisplayName = book.getOwnerDisplayName();
                if (StringsKt.isBlank(ownerDisplayName)) {
                    obj = null;
                    ownerDisplayName = StringsKt.substringBefore$default(book.getOwnerName(), "@", (String) null, 2, (Object) null);
                } else {
                    obj = null;
                }
                str = ownerDisplayName;
            }
            TextKt.Text--4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleSmall(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
            User userBookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$201 = BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$201(state);
            TextKt.Text--4IGK_g("🛡️ Trust Score: " + (userBookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$201 != null ? userBookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$201.getTrustScore() : 100) + " / 100", (Modifier) null, ColorKt.Color(4279994175L), 0L, (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 196992, 0, 65498);
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
            if (z || !z2) {
                z3 = false;
            } else {
                z3 = false;
                if (CollectionsKt.listOf(new String[]{"BORROWED", "LENT", "PENDING_RETURN", "RETURNED"}).contains(book.getStatus())) {
                    z4 = true;
                }
                if (z) {
                    composer.startReplaceGroup(-288719865);
                } else {
                    composer.startReplaceGroup(-227920743);
                    ComposerKt.sourceInformation(composer, "");
                    if (z4) {
                        composer.startReplaceGroup(-227885992);
                        ComposerKt.sourceInformation(composer, "1108@61408L243,1107@61335L895");
                        ComposerKt.sourceInformationMarkerStart(composer, -977179538, "CC(remember):BookDetailsDialog.kt#9igjgp");
                        objRememberedValue = composer.rememberedValue();
                        if (objRememberedValue == Composer.Companion.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda74
                                public final Object invoke() {
                                    return BookDetailsDialogKt.BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$221$lambda$220$lambda$212$lambda$211$lambda$210(mutableState, mutableState2);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ButtonKt.FilledTonalButton((Function0) objRememberedValue, (Modifier) null, false, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, PaddingKt.PaddingValues-YgX7TsA(Dp.constructor-impl(10.0f), Dp.constructor-impl(4.0f)), (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.getLambda$700596995$app(), composer, 817889286, 374);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(-226918513);
                        ComposerKt.sourceInformation(composer, "1120@62316L712");
                        ButtonKt.OutlinedButton(function0, (Modifier) null, false, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, PaddingKt.PaddingValues-YgX7TsA(Dp.constructor-impl(10.0f), Dp.constructor-impl(4.0f)), (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.getLambda$391803308$app(), composer, 817889280, 374);
                        composer.endReplaceGroup();
                    }
                }
                composer.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f)), composer, 6);
                TextKt.Text--4IGK_g("Lender Reputation & Feedback (" + BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$203(state2).size() + "):", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelMedium(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
                composer2 = composer;
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer2, 6);
                if (BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$203(state2).isEmpty()) {
                    composer2.startReplaceGroup(1811604568);
                    ComposerKt.sourceInformation(composer2, "1144@63949L10,1145@64029L11,1142@63775L307");
                    TextKt.Text--4IGK_g("No lender reviews yet. Exchanged 0 books with verified returns.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOutline-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 65530);
                    composer.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(1812050255);
                    ComposerKt.sourceInformation(composer2, "1148@64152L2620");
                    Arrangement.Vertical vertical = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(6.0f));
                    ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    Modifier modifier4 = Modifier.Companion;
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(vertical, Alignment.Companion.getStart(), composer2, 6);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifier4);
                    constructor = ComposeUiNode.Companion.getConstructor();
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
                    composer3 = Updater.constructor-impl(composer2);
                    Updater.set-impl(composer3, measurePolicyColumnMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.set-impl(composer3, currentCompositionLocalMap5, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composer3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composer3.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.set-impl(composer3, modifierMaterializeModifier5, ComposeUiNode.Companion.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScope columnScope4 = ColumnScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, -1306966185, "C:BookDetailsDialog.kt#2thlc2");
                    composer2.startReplaceGroup(-457801545);
                    ComposerKt.sourceInformation(composer2, "*1151@64400L11,1154@64621L2079,1150@64325L2375");
                    for (final Review review : CollectionsKt.take(BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$203(state2), 3)) {
                        SurfaceKt.Surface-T9BRK9s(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(10.0f)), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(1911607885, true, new Function2() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda75
                            public final Object invoke(Object obj2, Object obj3) {
                                return BookDetailsDialogKt.BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$221$lambda$220$lambda$219$lambda$218$lambda$217(review, (Composer) obj2, ((Integer) obj3).intValue());
                            }
                        }, composer2, 54), composer2, 12582918, 120);
                        composer2 = composer;
                    }
                    composer.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    composer.endReplaceGroup();
                }
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
            z4 = z3;
            if (z) {
                composer.startReplaceGroup(-227920743);
                ComposerKt.sourceInformation(composer, "");
                if (z4) {
                    composer.startReplaceGroup(-227885992);
                    ComposerKt.sourceInformation(composer, "1108@61408L243,1107@61335L895");
                    ComposerKt.sourceInformationMarkerStart(composer, -977179538, "CC(remember):BookDetailsDialog.kt#9igjgp");
                    objRememberedValue = composer.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda74
                            public final Object invoke() {
                                return BookDetailsDialogKt.BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$221$lambda$220$lambda$212$lambda$211$lambda$210(mutableState, mutableState2);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ButtonKt.FilledTonalButton((Function0) objRememberedValue, (Modifier) null, false, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, PaddingKt.PaddingValues-YgX7TsA(Dp.constructor-impl(10.0f), Dp.constructor-impl(4.0f)), (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.getLambda$700596995$app(), composer, 817889286, 374);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-226918513);
                    ComposerKt.sourceInformation(composer, "1120@62316L712");
                    ButtonKt.OutlinedButton(function0, (Modifier) null, false, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, PaddingKt.PaddingValues-YgX7TsA(Dp.constructor-impl(10.0f), Dp.constructor-impl(4.0f)), (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.getLambda$391803308$app(), composer, 817889280, 374);
                    composer.endReplaceGroup();
                }
            } else {
                composer.startReplaceGroup(-288719865);
            }
            composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f)), composer, 6);
            TextKt.Text--4IGK_g("Lender Reputation & Feedback (" + BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$203(state2).size() + "):", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelMedium(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
            composer2 = composer;
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer2, 6);
            if (BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$203(state2).isEmpty()) {
                composer2.startReplaceGroup(1811604568);
                ComposerKt.sourceInformation(composer2, "1144@63949L10,1145@64029L11,1142@63775L307");
                TextKt.Text--4IGK_g("No lender reviews yet. Exchanged 0 books with verified returns.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOutline-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 65530);
                composer.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(1812050255);
                ComposerKt.sourceInformation(composer2, "1148@64152L2620");
                Arrangement.Vertical vertical2 = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(6.0f));
                ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                Modifier modifier5 = Modifier.Companion;
                MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(vertical2, Alignment.Companion.getStart(), composer2, 6);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer2, modifier5);
                constructor = ComposeUiNode.Companion.getConstructor();
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
                composer3 = Updater.constructor-impl(composer2);
                Updater.set-impl(composer3, measurePolicyColumnMeasurePolicy4, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl(composer3, currentCompositionLocalMap6, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composer3.getInserting()) {
                    composer3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composer3.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                } else {
                    composer3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composer3.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.set-impl(composer3, modifierMaterializeModifier6, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScope columnScope5 = ColumnScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, -1306966185, "C:BookDetailsDialog.kt#2thlc2");
                composer2.startReplaceGroup(-457801545);
                ComposerKt.sourceInformation(composer2, "*1151@64400L11,1154@64621L2079,1150@64325L2375");
                while (r13.hasNext()) {
                    SurfaceKt.Surface-T9BRK9s(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(10.0f)), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(1911607885, true, new Function2() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda75
                        public final Object invoke(Object obj2, Object obj3) {
                            return BookDetailsDialogKt.BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$221$lambda$220$lambda$219$lambda$218$lambda$217(review, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    }, composer2, 54), composer2, 12582918, 120);
                    composer2 = composer;
                }
                composer.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceGroup();
            }
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

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$221$lambda$220$lambda$212$lambda$209$lambda$206(Book book, State state, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1070@58705L1201:BookDetailsDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(667203962, i, -1, "com.example.ui.screens.BookDetailsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BookDetailsDialog.kt:1070)");
            }
            Alignment center = Alignment.Companion.getCenter();
            ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            Modifier modifier = Modifier.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
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
            ComposerKt.sourceInformationMarkerStart(composer, -1390055713, "C:BookDetailsDialog.kt#2thlc2");
            User userBookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$201 = BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$201(state);
            String profilePicBase64 = userBookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$201 != null ? userBookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$201.getProfilePicBase64() : null;
            String str = profilePicBase64;
            if (str == null || StringsKt.isBlank(str) || !StringsKt.startsWith$default(profilePicBase64, "http", false, 2, (Object) null)) {
                composer.startReplaceGroup(-1389444518);
                ComposerKt.sourceInformation(composer, "1080@59478L340");
                String ownerDisplayName = book.getOwnerDisplayName();
                if (StringsKt.isBlank(ownerDisplayName)) {
                    ownerDisplayName = book.getOwnerName();
                }
                String upperCase = StringsKt.take(ownerDisplayName, 1).toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                TextKt.Text--4IGK_g(upperCase, (Modifier) null, Color.Companion.getWhite-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 196992, 0, 131034);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1389935837);
                ComposerKt.sourceInformation(composer, "1073@58981L395");
                SingletonAsyncImageKt.m108AsyncImagegl8XCv8(profilePicBase64, null, ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.getCircleShape()), null, null, null, ContentScale.Companion.getCrop(), 0.0f, null, 0, false, null, composer, 1572912, 0, 4024);
                composer.endReplaceGroup();
            }
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

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$221$lambda$220$lambda$212$lambda$211$lambda$210(MutableState mutableState, MutableState mutableState2) {
        mutableState.setValue(FeedbackTargetType.BORROWER_TO_LENDER_AND_BOOK);
        BookDetailsDialog$lambda$59(mutableState2, true);
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$221$lambda$220$lambda$219$lambda$218$lambda$217(Review review, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1155@64667L1991:BookDetailsDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1911607885, i, -1, "com.example.ui.screens.BookDetailsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BookDetailsDialog.kt:1155)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
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
            ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1105215741, "C1156@64759L1235:BookDetailsDialog.kt#2thlc2");
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
            ComposerKt.sourceInformationMarkerStart(composer, 119005577, "C1164@65429L10,1161@65157L348,1166@65558L386:BookDetailsDialog.kt#2thlc2");
            String reviewerName = review.getReviewerName();
            if (StringsKt.isBlank(reviewerName)) {
                reviewerName = "Reader";
            }
            TextKt.Text--4IGK_g(reviewerName, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelMedium(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
            Composer composer4 = composer;
            ComposerKt.sourceInformationMarkerStart(composer4, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier2 = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer4, 0);
            ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer4, modifier2);
            Function0 constructor3 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer4.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer4.startReusableNode();
            if (composer4.getInserting()) {
                composer4.createNode(constructor3);
            } else {
                composer4.useNode();
            }
            Composer composer5 = Updater.constructor-impl(composer4);
            Updater.set-impl(composer5, measurePolicyRowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer5, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer5.getInserting() || !Intrinsics.areEqual(composer5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composer5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composer5.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.set-impl(composer5, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer4, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope2 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer4, -712411766, "C:BookDetailsDialog.kt#2thlc2");
            composer4.startReplaceGroup(1916681625);
            ComposerKt.sourceInformation(composer4, "*1168@65722L110");
            int iCoerceIn = RangesKt.coerceIn(review.getRating(), 1, 5);
            if (1 <= iCoerceIn) {
                int i2 = 1;
                while (true) {
                    IconKt.Icon-ww6aTOc(StarKt.getStar(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(12.0f)), ColorKt.Color(4294947584L), composer4, 3504, 0);
                    if (i2 == iCoerceIn) {
                        break;
                    }
                    i2++;
                }
            }
            composer4.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            composer4.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            composer4.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            if (StringsKt.isBlank(review.getContent())) {
                composer4.startReplaceGroup(-1169515105);
            } else {
                composer4.startReplaceGroup(-1103952988);
                ComposerKt.sourceInformation(composer4, "1173@66127L40,1176@66380L10,1177@66480L11,1174@66220L342");
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(2.0f)), composer4, 6);
                TextKt.Text--4IGK_g(review.getContent(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer4, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getBodySmall(), composer, 0, 0, 65530);
                composer4 = composer;
            }
            composer4.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            composer4.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0403  */
    /* JADX WARN: Code duplicated, block: B:64:0x0450  */
    /* JADX WARN: Code duplicated, block: B:66:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:69:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:75:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:79:0x0537 A[LOOP:0: B:77:0x0531->B:79:0x0537, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x05b6  */
    /* JADX WARN: Type inference failed for: r15v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$236(boolean z, boolean z2, Book book, State state, final MutableState mutableState, final MutableState mutableState2, ColumnScope columnScope, Composer composer, int i) {
        int i2;
        boolean z3;
        ?? r15;
        int currentCompositeKeyHash;
        Function0 constructor;
        Composer composer2;
        Function2 setCompositeKeyHash;
        Intrinsics.checkNotNullParameter(columnScope, "$this$Card");
        ComposerKt.sourceInformation(composer, "C1200@67619L5506:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1342358430, i, -1, "com.example.ui.screens.BookDetailsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BookDetailsDialog.kt:1200)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(14.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifier);
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
            Updater.set-impl(composer3, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer3, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composer3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composer3.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.set-impl(composer3, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScope columnScope2 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 886299564, "C1201@67692L2572,1239@70322L40:BookDetailsDialog.kt#2thlc2");
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer, 54);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
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
            Composer composer4 = Updater.constructor-impl(composer);
            Updater.set-impl(composer4, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer4, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer4.getInserting() || !Intrinsics.areEqual(composer4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composer4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composer4.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.set-impl(composer4, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1150583741, "C1206@67990L466:BookDetailsDialog.kt#2thlc2");
            Alignment.Vertical centerVertically2 = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier2 = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer, 48);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifier2);
            Function0 constructor4 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor4);
            } else {
                composer.useNode();
            }
            Composer composer5 = Updater.constructor-impl(composer);
            Updater.set-impl(composer5, measurePolicyRowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer5, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer5.getInserting() || !Intrinsics.areEqual(composer5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composer5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composer5.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.set-impl(composer5, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope2 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 436462733, "C1207@68080L110,1208@68227L39,1209@68370L10,1209@68303L119:BookDetailsDialog.kt#2thlc2");
            IconKt.Icon-ww6aTOc(StarKt.getStar(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(20.0f)), ColorKt.Color(4294947584L), composer, 3504, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextKt.Text--4IGK_g("Reader Reviews (" + BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$223(state).size() + ")", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleSmall(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
            Composer composer6 = composer;
            ComposerKt.sourceInformationMarkerEnd(composer6);
            ComposerKt.sourceInformationMarkerEnd(composer6);
            composer6.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer6);
            ComposerKt.sourceInformationMarkerEnd(composer6);
            ComposerKt.sourceInformationMarkerEnd(composer6);
            if (z || !z2) {
                i2 = 0;
                z3 = true;
            } else {
                i2 = 0;
                z3 = true;
                r15 = 1;
                if (CollectionsKt.listOf(new String[]{"BORROWED", "LENT", "PENDING_RETURN", "RETURNED"}).contains(book.getStatus())) {
                    composer6.startReplaceGroup(-1149929239);
                    ComposerKt.sourceInformation(composer6, "1215@68797L231,1214@68735L661");
                    ComposerKt.sourceInformationMarkerStart(composer6, 655644867, "CC(remember):BookDetailsDialog.kt#9igjgp");
                    Object objRememberedValue = composer6.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda43
                            public final Object invoke() {
                                return BookDetailsDialogKt.BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$236$lambda$235$lambda$227$lambda$226$lambda$225(mutableState, mutableState2);
                            }
                        };
                        composer6.updateRememberedValue(objRememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer6);
                    ButtonKt.TextButton((Function0) objRememberedValue, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.getLambda$1830029076$app(), composer6, 805306374, 510);
                    composer6.endReplaceGroup();
                }
                ComposerKt.sourceInformationMarkerEnd(composer6);
                ComposerKt.sourceInformationMarkerEnd(composer6);
                composer6.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer6);
                ComposerKt.sourceInformationMarkerEnd(composer6);
                ComposerKt.sourceInformationMarkerEnd(composer6);
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer6, 6);
                if (BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$223(state).isEmpty()) {
                    composer6.startReplaceGroup(888848569);
                    ComposerKt.sourceInformation(composer6, "1243@70656L10,1244@70736L11,1241@70452L337");
                    TextKt.Text--4IGK_g("No reader reviews for this book yet. Borrow it to read and unlock verified community reviews!", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer6, MaterialTheme.$stable).getOutline-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer6, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 65530);
                    composer.endReplaceGroup();
                } else {
                    composer6.startReplaceGroup(889310376);
                    ComposerKt.sourceInformation(composer6, "1247@70859L2210");
                    Arrangement.Vertical vertical = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(8.0f));
                    ComposerKt.sourceInformationMarkerStart(composer6, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    Modifier modifier3 = Modifier.Companion;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(vertical, Alignment.Companion.getStart(), composer6, 6);
                    ComposerKt.sourceInformationMarkerStart(composer6, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer6, i2);
                    CompositionLocalMap currentCompositionLocalMap4 = composer6.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer6, modifier3);
                    constructor = ComposeUiNode.Companion.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer6, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer6.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer6.startReusableNode();
                    if (composer6.getInserting()) {
                        composer6.createNode(constructor);
                    } else {
                        composer6.useNode();
                    }
                    composer2 = Updater.constructor-impl(composer6);
                    Updater.set-impl(composer2, measurePolicyColumnMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.set-impl(composer2, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (composer2.getInserting() || !Intrinsics.areEqual(composer2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composer2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composer2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.set-impl(composer2, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer6, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScope columnScope3 = ColumnScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer6, 2068210448, "C:BookDetailsDialog.kt#2thlc2");
                    composer6.startReplaceGroup(1175095743);
                    ComposerKt.sourceInformation(composer6, "*1250@71106L11,1253@71327L1670,1249@71031L1966");
                    for (final Review review : CollectionsKt.take(BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$223(state), 5)) {
                        SurfaceKt.Surface-T9BRK9s(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, (int) r15, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(10.0f)), MaterialTheme.INSTANCE.getColorScheme(composer6, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(1452972366, (boolean) r15, new Function2() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda44
                            public final Object invoke(Object obj, Object obj2) {
                                return BookDetailsDialogKt.BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$236$lambda$235$lambda$234$lambda$233$lambda$232(review, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        }, composer6, 54), composer6, 12582918, 120);
                        composer6 = composer;
                    }
                    composer.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    composer.endReplaceGroup();
                }
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
            if (z) {
                composer6.startReplaceGroup(-1218100378);
            } else {
                composer6.startReplaceGroup(-1149180682);
                ComposerKt.sourceInformation(composer6, "1226@69559L11,1225@69488L712");
                SurfaceKt.Surface-T9BRK9s((Modifier) null, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(8.0f)), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer6, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.getLambda$1849759323$app(), composer6, 12582912, 121);
            }
            composer6.endReplaceGroup();
            r15 = z3;
            ComposerKt.sourceInformationMarkerEnd(composer6);
            ComposerKt.sourceInformationMarkerEnd(composer6);
            composer6.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer6);
            ComposerKt.sourceInformationMarkerEnd(composer6);
            ComposerKt.sourceInformationMarkerEnd(composer6);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer6, 6);
            if (BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$223(state).isEmpty()) {
                composer6.startReplaceGroup(888848569);
                ComposerKt.sourceInformation(composer6, "1243@70656L10,1244@70736L11,1241@70452L337");
                TextKt.Text--4IGK_g("No reader reviews for this book yet. Borrow it to read and unlock verified community reviews!", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer6, MaterialTheme.$stable).getOutline-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer6, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 65530);
                composer.endReplaceGroup();
            } else {
                composer6.startReplaceGroup(889310376);
                ComposerKt.sourceInformation(composer6, "1247@70859L2210");
                Arrangement.Vertical vertical2 = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(8.0f));
                ComposerKt.sourceInformationMarkerStart(composer6, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                Modifier modifier4 = Modifier.Companion;
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(vertical2, Alignment.Companion.getStart(), composer6, 6);
                ComposerKt.sourceInformationMarkerStart(composer6, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer6, i2);
                CompositionLocalMap currentCompositionLocalMap5 = composer6.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer6, modifier4);
                constructor = ComposeUiNode.Companion.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer6, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer6.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer6.startReusableNode();
                if (composer6.getInserting()) {
                    composer6.createNode(constructor);
                } else {
                    composer6.useNode();
                }
                composer2 = Updater.constructor-impl(composer6);
                Updater.set-impl(composer2, measurePolicyColumnMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl(composer2, currentCompositionLocalMap5, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composer2.getInserting()) {
                    composer2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composer2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                } else {
                    composer2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composer2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.set-impl(composer2, modifierMaterializeModifier5, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer6, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScope columnScope4 = ColumnScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer6, 2068210448, "C:BookDetailsDialog.kt#2thlc2");
                composer6.startReplaceGroup(1175095743);
                ComposerKt.sourceInformation(composer6, "*1250@71106L11,1253@71327L1670,1249@71031L1966");
                while (r13.hasNext()) {
                    SurfaceKt.Surface-T9BRK9s(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, (int) r15, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(10.0f)), MaterialTheme.INSTANCE.getColorScheme(composer6, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(1452972366, (boolean) r15, new Function2() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda44
                        public final Object invoke(Object obj, Object obj2) {
                            return BookDetailsDialogKt.BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$236$lambda$235$lambda$234$lambda$233$lambda$232(review, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    }, composer6, 54), composer6, 12582918, 120);
                    composer6 = composer;
                }
                composer.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceGroup();
            }
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

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$236$lambda$235$lambda$227$lambda$226$lambda$225(MutableState mutableState, MutableState mutableState2) {
        mutableState.setValue(FeedbackTargetType.BORROWER_TO_LENDER_AND_BOOK);
        BookDetailsDialog$lambda$59(mutableState2, true);
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$236$lambda$235$lambda$234$lambda$233$lambda$232(Review review, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1254@71373L1582:BookDetailsDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1452972366, i, -1, "com.example.ui.screens.BookDetailsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BookDetailsDialog.kt:1254)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
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
            ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -2025006404, "C1255@71466L1054:BookDetailsDialog.kt#2thlc2");
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
            ComposerKt.sourceInformationMarkerStart(composer, -800777987, "C1260@71960L10,1260@71864L119,1261@72036L434:BookDetailsDialog.kt#2thlc2");
            String reviewerName = review.getReviewerName();
            if (StringsKt.isBlank(reviewerName)) {
                reviewerName = "Reader";
            }
            TextKt.Text--4IGK_g(reviewerName, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelMedium(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
            Composer composer4 = composer;
            Alignment.Vertical centerVertically2 = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer4, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier2 = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer4, 48);
            ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer4, modifier2);
            Function0 constructor3 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer4.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer4.startReusableNode();
            if (composer4.getInserting()) {
                composer4.createNode(constructor3);
            } else {
                composer4.useNode();
            }
            Composer composer5 = Updater.constructor-impl(composer4);
            Updater.set-impl(composer5, measurePolicyRowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer5, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer5.getInserting() || !Intrinsics.areEqual(composer5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composer5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composer5.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.set-impl(composer5, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer4, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope2 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer4, -1632189719, "C:BookDetailsDialog.kt#2thlc2");
            composer4.startReplaceGroup(-745387942);
            ComposerKt.sourceInformation(composer4, "*1263@72248L110");
            int iCoerceIn = RangesKt.coerceIn(review.getRating(), 1, 5);
            if (1 <= iCoerceIn) {
                int i2 = 1;
                while (true) {
                    IconKt.Icon-ww6aTOc(StarKt.getStar(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(13.0f)), ColorKt.Color(4294947584L), composer4, 3504, 0);
                    if (i2 == iCoerceIn) {
                        break;
                    }
                    i2++;
                }
            }
            composer4.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            composer4.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            composer4.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            if (StringsKt.isBlank(review.getContent())) {
                composer4.startReplaceGroup(-2095946402);
            } else {
                composer4.startReplaceGroup(-2023917592);
                ComposerKt.sourceInformation(composer4, "1268@72653L40,1269@72786L10,1269@72830L11,1269@72746L113");
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer4, 6);
                TextKt.Text--4IGK_g(review.getContent(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer4, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getBodySmall(), composer, 0, 0, 65530);
                composer4 = composer;
            }
            composer4.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            composer4.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:537:0x2c89 A[PHI: r12
      0x2c89: PHI (r12v33 androidx.compose.runtime.Composer) = 
      (r12v2 androidx.compose.runtime.Composer)
      (r12v9 androidx.compose.runtime.Composer)
      (r12v15 androidx.compose.runtime.Composer)
      (r12v20 androidx.compose.runtime.Composer)
      (r12v26 androidx.compose.runtime.Composer)
      (r12v34 androidx.compose.runtime.Composer)
     binds: [B:466:0x265e, B:396:0x20de, B:362:0x1dfb, B:319:0x1a3b, B:276:0x1665, B:265:0x154a] A[DONT_GENERATE, DONT_INLINE]] */
    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340(boolean z, final Book book, final BookViewModel bookViewModel, final Function0 function0, boolean z2, boolean z3, final ManagedActivityResultLauncher managedActivityResultLauncher, final Function0 function1, final MutableState mutableState, final MutableState mutableState2, final MutableState mutableState3, final MutableState mutableState4, final MutableState mutableState5, final Context context, final MutableState mutableState6, final MutableState mutableState7, final MutableState mutableState8, final MutableState mutableState9, final MutableState mutableState10, Composer composer, int i) {
        Composer composer2;
        final Book book2;
        Composer composer3;
        Composer composer4;
        Composer composer5;
        ComposerKt.sourceInformation(composer, "C1290@73584L45105:BookDetailsDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1362418467, i, -1, "com.example.ui.screens.BookDetailsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BookDetailsDialog.kt:1290)");
            }
            Modifier modifier = PaddingKt.padding-VpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), 0.0f, Dp.constructor-impl(4.0f), 1, (Object) null);
            Arrangement.Horizontal horizontal = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(8.0f));
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontal, Alignment.Companion.getTop(), composer, 6);
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
            Composer composer6 = Updater.constructor-impl(composer);
            Updater.set-impl(composer6, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer6, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer6.getInserting() || !Intrinsics.areEqual(composer6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composer6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composer6.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.set-impl(composer6, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1891002346, "C:BookDetailsDialog.kt#2thlc2");
            if (z) {
                composer.startReplaceGroup(-1891747773);
                ComposerKt.sourceInformation(composer, "");
                switch (book.getStatus()) {
                    case "PENDING_RETURN":
                        composer.startReplaceGroup(-1879270676);
                        ComposerKt.sourceInformation(composer, "1479@86883L7261");
                        Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.Companion, 1.0f, false, 2, (Object) null);
                        ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
                        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierWeight$default);
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
                        Composer composer7 = Updater.constructor-impl(composer);
                        Updater.set-impl(composer7, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.set-impl(composer7, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composer7.getInserting() || !Intrinsics.areEqual(composer7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composer7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composer7.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.set-impl(composer7, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer, 2137578730, "C1506@89151L3337,1549@92525L40,1561@93638L11,1561@93592L64,1551@92664L862,1550@92602L1508:BookDetailsDialog.kt#2thlc2");
                        String returnImageUrl = book.getReturnImageUrl();
                        if (returnImageUrl == null || StringsKt.isBlank(returnImageUrl)) {
                            book2 = book;
                            composer3 = composer;
                            composer3.startReplaceGroup(2051091767);
                        } else {
                            composer.startReplaceGroup(2137464215);
                            ComposerKt.sourceInformation(composer, "1482@87119L11,1485@87392L1684,1481@87044L2032");
                            long j = Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getTertiaryContainer-0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
                            book2 = book;
                            SurfaceKt.Surface-T9BRK9s(PaddingKt.padding-qDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), 0.0f, 0.0f, 0.0f, Dp.constructor-impl(8.0f), 7, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(14.0f)), j, 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-1203729963, true, new Function2() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda84
                                public final Object invoke(Object obj, Object obj2) {
                                    return BookDetailsDialogKt.BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$283$lambda$270(book2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            }, composer, 54), composer, 12582918, 120);
                            composer3 = composer;
                        }
                        composer3.endReplaceGroup();
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
                        Arrangement.Horizontal horizontal2 = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(4.0f));
                        ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontal2, Alignment.Companion.getTop(), composer3, 6);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default);
                        Function0 constructor3 = ComposeUiNode.Companion.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor3);
                        } else {
                            composer3.useNode();
                        }
                        Composer composer8 = Updater.constructor-impl(composer3);
                        Updater.set-impl(composer8, measurePolicyRowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.set-impl(composer8, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composer8.getInserting() || !Intrinsics.areEqual(composer8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composer8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composer8.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.set-impl(composer8, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScope rowScope2 = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer3, 2048713279, "C1508@89347L195,1513@89734L11,1513@89690L65,1507@89285L877,1520@90273L195,1519@90203L756,1531@91062L27,1533@91237L48,1530@91000L695,1539@91757L222,1539@91736L444,1545@92221L229:BookDetailsDialog.kt#2thlc2");
                        ComposerKt.sourceInformationMarkerStart(composer3, -1042292118, "CC(remember):BookDetailsDialog.kt#9igjgp");
                        Object objRememberedValue = composer3.rememberedValue();
                        if (objRememberedValue == Composer.Companion.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda85
                                public final Object invoke() {
                                    return BookDetailsDialogKt.BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$283$lambda$279$lambda$272$lambda$271(mutableState2, mutableState3);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ButtonKt.Button((Function0) objRememberedValue, RowScope.weight$default(rowScope2, Modifier.Companion, 1.1f, false, 2, (Object) null), false, (Shape) null, ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getTertiary-0d7_KjU(), 0L, 0L, 0L, composer3, ButtonDefaults.$stable << 12, 14), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.getLambda$1823208567$app(), composer, 805306374, 492);
                        ComposerKt.sourceInformationMarkerStart(composer, -1042262486, "CC(remember):BookDetailsDialog.kt#9igjgp");
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda86
                                public final Object invoke() {
                                    return BookDetailsDialogKt.BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$283$lambda$279$lambda$274$lambda$273(mutableState4, mutableState5);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ButtonKt.OutlinedButton((Function0) objRememberedValue2, RowScope.weight$default(rowScope2, Modifier.Companion, 1.1f, false, 2, (Object) null), false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.getLambda$838983605$app(), composer, 805306374, 508);
                        ComposerKt.sourceInformationMarkerStart(composer, -1042237406, "CC(remember):BookDetailsDialog.kt#9igjgp");
                        Object objRememberedValue3 = composer.rememberedValue();
                        if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda87
                                public final Object invoke() {
                                    return BookDetailsDialogKt.BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$283$lambda$279$lambda$276$lambda$275(mutableState6);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ButtonKt.Button((Function0) objRememberedValue3, RowScope.weight$default(rowScope2, Modifier.Companion, 1.1f, false, 2, (Object) null), false, (Shape) null, ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(ColorKt.Color(4279994175L), 0L, 0L, 0L, composer, (ButtonDefaults.$stable << 12) | 6, 14), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.getLambda$1973659488$app(), composer, 805306374, 492);
                        ComposerKt.sourceInformationMarkerStart(composer, -1042214971, "CC(remember):BookDetailsDialog.kt#9igjgp");
                        Object objRememberedValue4 = composer.rememberedValue();
                        if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                            objRememberedValue4 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda88
                                public final Object invoke() {
                                    return BookDetailsDialogKt.BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$283$lambda$279$lambda$278$lambda$277(mutableState7, mutableState8);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue4);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        IconButtonKt.IconButton((Function0) objRememberedValue4, (Modifier) null, false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.m204getLambda$1749750550$app(), composer, 196614, 30);
                        IconButtonKt.IconButton(function0, (Modifier) null, false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.getLambda$38817555$app(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
                        ButtonColors buttonColors = ButtonDefaults.INSTANCE.textButtonColors-ro_MJ88(0L, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU(), 0L, 0L, composer, ButtonDefaults.$stable << 12, 13);
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
                        ComposerKt.sourceInformationMarkerStart(composer, 623319721, "CC(remember):BookDetailsDialog.kt#9igjgp");
                        boolean zChangedInstance = composer.changedInstance(bookViewModel) | composer.changedInstance(book2) | composer.changedInstance(context) | composer.changed(function1);
                        Object objRememberedValue5 = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue5 == Composer.Companion.getEmpty()) {
                            objRememberedValue5 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda89
                                public final Object invoke() {
                                    return BookDetailsDialogKt.BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$283$lambda$282$lambda$281(bookViewModel, book2, context, function1);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue5);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ButtonKt.TextButton((Function0) objRememberedValue5, modifierFillMaxWidth$default2, false, (Shape) null, buttonColors, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.getLambda$506971822$app(), composer, 805306416, 492);
                        composer4 = composer;
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        composer4.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                    case "PENDING_RECEIPT":
                        composer.startReplaceGroup(-1883910167);
                        ComposerKt.sourceInformation(composer, "1417@82355L2496");
                        Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
                        Arrangement.Vertical vertical = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(6.0f));
                        ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(vertical, Alignment.Companion.getStart(), composer, 6);
                        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default3);
                        Function0 constructor4 = ComposeUiNode.Companion.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor4);
                        } else {
                            composer.useNode();
                        }
                        Composer composer9 = Updater.constructor-impl(composer);
                        Updater.set-impl(composer9, measurePolicyColumnMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.set-impl(composer9, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composer9.getInserting() || !Intrinsics.areEqual(composer9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            composer9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            composer9.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        Updater.set-impl(composer9, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScope columnScope2 = ColumnScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer, 644245023, "C1418@82486L1582,1443@84284L11,1443@84345L11,1443@84240L138,1441@84105L712:BookDetailsDialog.kt#2thlc2");
                        Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
                        Arrangement.Horizontal horizontal3 = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(6.0f));
                        ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(horizontal3, Alignment.Companion.getTop(), composer, 6);
                        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default4);
                        Function0 constructor5 = ComposeUiNode.Companion.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor5);
                        } else {
                            composer.useNode();
                        }
                        Composer composer10 = Updater.constructor-impl(composer);
                        Updater.set-impl(composer10, measurePolicyRowMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.set-impl(composer10, currentCompositionLocalMap5, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash5 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composer10.getInserting() || !Intrinsics.areEqual(composer10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                            composer10.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                            composer10.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                        }
                        Updater.set-impl(composer10, modifierMaterializeModifier5, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScope rowScope3 = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer, 555474556, "C1420@82682L197,1419@82620L713,1431@83444L186,1436@83826L11,1436@83776L68,1430@83374L656:BookDetailsDialog.kt#2thlc2");
                        ComposerKt.sourceInformationMarkerStart(composer, 1126297962, "CC(remember):BookDetailsDialog.kt#9igjgp");
                        Object objRememberedValue6 = composer.rememberedValue();
                        if (objRememberedValue6 == Composer.Companion.getEmpty()) {
                            objRememberedValue6 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda6
                                public final Object invoke() {
                                    return BookDetailsDialogKt.BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$262$lambda$261$lambda$258$lambda$257(mutableState4, mutableState5);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue6);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ButtonKt.Button((Function0) objRememberedValue6, RowScope.weight$default(rowScope3, Modifier.Companion, 1.3f, false, 2, (Object) null), false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.m208getLambda$1937659147$app(), composer, 805306374, 508);
                        ComposerKt.sourceInformationMarkerStart(composer, 1126322335, "CC(remember):BookDetailsDialog.kt#9igjgp");
                        boolean zChangedInstance2 = composer.changedInstance(bookViewModel) | composer.changedInstance(book) | composer.changed(function1);
                        Object objRememberedValue7 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue7 == Composer.Companion.getEmpty()) {
                            objRememberedValue7 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda7
                                public final Object invoke() {
                                    return BookDetailsDialogKt.BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$262$lambda$261$lambda$260$lambda$259(bookViewModel, book, function1);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue7);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ButtonKt.OutlinedButton((Function0) objRememberedValue7, RowScope.weight$default(rowScope3, Modifier.Companion, 1.0f, false, 2, (Object) null), false, (Shape) null, ButtonDefaults.INSTANCE.outlinedButtonColors-ro_MJ88(0L, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU(), 0L, 0L, composer, ButtonDefaults.$stable << 12, 13), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.getLambda$1373083187$app(), composer, 805306368, 492);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ButtonKt.Button(function0, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), false, (Shape) null, ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSecondaryContainer-0d7_KjU(), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSecondaryContainer-0d7_KjU(), 0L, 0L, composer, ButtonDefaults.$stable << 12, 12), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.m187getLambda$104848167$app(), composer, 805306416, 492);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        composer.endReplaceGroup();
                        Unit unit = Unit.INSTANCE;
                        composer4 = composer;
                        break;
                    case "BORROWED":
                        composer.startReplaceGroup(-1881349195);
                        ComposerKt.sourceInformation(composer, "1453@84958L1812");
                        Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
                        Arrangement.Vertical vertical2 = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(6.0f));
                        ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(vertical2, Alignment.Companion.getStart(), composer, 6);
                        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap6 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default5);
                        Function0 constructor6 = ComposeUiNode.Companion.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor6);
                        } else {
                            composer.useNode();
                        }
                        Composer composer11 = Updater.constructor-impl(composer);
                        Updater.set-impl(composer11, measurePolicyColumnMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.set-impl(composer11, currentCompositionLocalMap6, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash6 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composer11.getInserting() || !Intrinsics.areEqual(composer11.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                            composer11.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                            composer11.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                        }
                        Updater.set-impl(composer11, modifierMaterializeModifier6, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScope columnScope3 = ColumnScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer, -756667670, "C1454@85089L1647:BookDetailsDialog.kt#2thlc2");
                        Modifier modifierFillMaxWidth$default6 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
                        Arrangement.Horizontal horizontal4 = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(8.0f));
                        ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(horizontal4, Alignment.Companion.getTop(), composer, 6);
                        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap7 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default6);
                        Function0 constructor7 = ComposeUiNode.Companion.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor7);
                        } else {
                            composer.useNode();
                        }
                        Composer composer12 = Updater.constructor-impl(composer);
                        Updater.set-impl(composer12, measurePolicyRowMeasurePolicy4, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.set-impl(composer12, currentCompositionLocalMap7, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash7 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composer12.getInserting() || !Intrinsics.areEqual(composer12.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                            composer12.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                            composer12.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                        }
                        Updater.set-impl(composer12, modifierMaterializeModifier7, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScope rowScope4 = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer, -845414918, "C1458@85488L11,1458@85444L64,1459@85551L391,1455@85223L719,1465@86053L195,1464@85983L715:BookDetailsDialog.kt#2thlc2");
                        ButtonKt.Button(function0, RowScope.weight$default(rowScope4, Modifier.Companion, 1.5f, false, 2, (Object) null), false, (Shape) null, ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0L, 0L, 0L, composer, ButtonDefaults.$stable << 12, 14), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableLambdaKt.rememberComposableLambda(2090258358, true, new Function3() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda8
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                return BookDetailsDialogKt.BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$267$lambda$266$lambda$263(book, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                            }
                        }, composer, 54), composer, 805306368, 492);
                        composer5 = composer;
                        ComposerKt.sourceInformationMarkerStart(composer5, -2105456151, "CC(remember):BookDetailsDialog.kt#9igjgp");
                        Object objRememberedValue8 = composer5.rememberedValue();
                        if (objRememberedValue8 == Composer.Companion.getEmpty()) {
                            objRememberedValue8 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda83
                                public final Object invoke() {
                                    return BookDetailsDialogKt.BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$267$lambda$266$lambda$265$lambda$264(mutableState4, mutableState5);
                                }
                            };
                            composer5.updateRememberedValue(objRememberedValue8);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ButtonKt.OutlinedButton((Function0) objRememberedValue8, RowScope.weight$default(rowScope4, Modifier.Companion, 1.1f, false, 2, (Object) null), false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.getLambda$1106033396$app(), composer5, 805306374, 508);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        composer5.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        composer5.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        composer5.endReplaceGroup();
                        Unit unit2 = Unit.INSTANCE;
                        composer4 = composer5;
                        break;
                    case "PENDING_TRANSFER":
                        composer.startReplaceGroup(-1887530440);
                        ComposerKt.sourceInformation(composer, "1367@78672L3569");
                        Modifier modifierFillMaxWidth$default7 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
                        Arrangement.Vertical vertical3 = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(6.0f));
                        ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(vertical3, Alignment.Companion.getStart(), composer, 6);
                        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap8 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default7);
                        Function0 constructor8 = ComposeUiNode.Companion.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor8);
                        } else {
                            composer.useNode();
                        }
                        Composer composer13 = Updater.constructor-impl(composer);
                        Updater.set-impl(composer13, measurePolicyColumnMeasurePolicy4, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.set-impl(composer13, currentCompositionLocalMap8, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash8 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composer13.getInserting() || !Intrinsics.areEqual(composer13.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                            composer13.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                            composer13.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                        }
                        Updater.set-impl(composer13, modifierMaterializeModifier8, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScope columnScope4 = ColumnScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer, 2045169775, "C1368@78803L1761,1393@80601L1606:BookDetailsDialog.kt#2thlc2");
                        Modifier modifierFillMaxWidth$default8 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
                        Arrangement.Horizontal horizontal5 = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(6.0f));
                        ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(horizontal5, Alignment.Companion.getTop(), composer, 6);
                        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap9 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default8);
                        Function0 constructor9 = ComposeUiNode.Companion.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor9);
                        } else {
                            composer.useNode();
                        }
                        Composer composer14 = Updater.constructor-impl(composer);
                        Updater.set-impl(composer14, measurePolicyRowMeasurePolicy5, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.set-impl(composer14, currentCompositionLocalMap9, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash9 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composer14.getInserting() || !Intrinsics.areEqual(composer14.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                            composer14.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
                            composer14.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash9);
                        }
                        Updater.set-impl(composer14, modifierMaterializeModifier9, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScope rowScope5 = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer, 1956371594, "C1370@78999L198,1369@78937L716,1381@79756L197,1386@80143L11,1386@80099L65,1380@79694L832:BookDetailsDialog.kt#2thlc2");
                        ComposerKt.sourceInformationMarkerStart(composer, 63109354, "CC(remember):BookDetailsDialog.kt#9igjgp");
                        boolean zChangedInstance3 = composer.changedInstance(managedActivityResultLauncher);
                        Object objRememberedValue9 = composer.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue9 == Composer.Companion.getEmpty()) {
                            objRememberedValue9 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda3
                                public final Object invoke() {
                                    return BookDetailsDialogKt.BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$256$lambda$252$lambda$249$lambda$248(managedActivityResultLauncher, mutableState);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue9);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ButtonKt.Button((Function0) objRememberedValue9, RowScope.weight$default(rowScope5, Modifier.Companion, 1.3f, false, 2, (Object) null), false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.m202getLambda$1670609356$app(), composer, 805306368, 508);
                        ComposerKt.sourceInformationMarkerStart(composer, 63133577, "CC(remember):BookDetailsDialog.kt#9igjgp");
                        Object objRememberedValue10 = composer.rememberedValue();
                        if (objRememberedValue10 == Composer.Companion.getEmpty()) {
                            objRememberedValue10 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda4
                                public final Object invoke() {
                                    return BookDetailsDialogKt.BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$256$lambda$252$lambda$251$lambda$250(mutableState2, mutableState3);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue10);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ButtonKt.Button((Function0) objRememberedValue10, RowScope.weight$default(rowScope5, Modifier.Companion, 1.0f, false, 2, (Object) null), false, (Shape) null, ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getTertiary-0d7_KjU(), 0L, 0L, 0L, composer, ButtonDefaults.$stable << 12, 14), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.m196getLambda$1520158435$app(), composer, 805306374, 492);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        Modifier modifierFillMaxWidth$default9 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
                        Arrangement.Horizontal horizontal6 = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(6.0f));
                        ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        MeasurePolicy measurePolicyRowMeasurePolicy6 = RowKt.rowMeasurePolicy(horizontal6, Alignment.Companion.getTop(), composer, 6);
                        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap10 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default9);
                        Function0 constructor10 = ComposeUiNode.Companion.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor10);
                        } else {
                            composer.useNode();
                        }
                        Composer composer15 = Updater.constructor-impl(composer);
                        Updater.set-impl(composer15, measurePolicyRowMeasurePolicy6, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.set-impl(composer15, currentCompositionLocalMap10, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash10 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composer15.getInserting() || !Intrinsics.areEqual(composer15.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                            composer15.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash10));
                            composer15.apply(Integer.valueOf(currentCompositeKeyHash10), setCompositeKeyHash10);
                        }
                        Updater.set-impl(composer15, modifierMaterializeModifier10, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScope rowScope6 = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer, 607985020, "C1397@81000L11,1397@81061L11,1397@80956L138,1394@80735L737,1404@81583L186,1409@81965L11,1409@81915L68,1403@81513L656:BookDetailsDialog.kt#2thlc2");
                        ButtonKt.Button(function0, RowScope.weight$default(rowScope6, Modifier.Companion, 1.5f, false, 2, (Object) null), false, (Shape) null, ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSecondaryContainer-0d7_KjU(), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSecondaryContainer-0d7_KjU(), 0L, 0L, composer, ButtonDefaults.$stable << 12, 12), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.getLambda$2022662621$app(), composer, 805306368, 492);
                        ComposerKt.sourceInformationMarkerStart(composer, -950193017, "CC(remember):BookDetailsDialog.kt#9igjgp");
                        boolean zChangedInstance4 = composer.changedInstance(bookViewModel) | composer.changedInstance(book) | composer.changed(function1);
                        Object objRememberedValue11 = composer.rememberedValue();
                        if (zChangedInstance4 || objRememberedValue11 == Composer.Companion.getEmpty()) {
                            objRememberedValue11 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda5
                                public final Object invoke() {
                                    return BookDetailsDialogKt.BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$256$lambda$255$lambda$254$lambda$253(bookViewModel, book, function1);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue11);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ButtonKt.OutlinedButton((Function0) objRememberedValue11, RowScope.weight$default(rowScope6, Modifier.Companion, 1.0f, false, 2, (Object) null), false, (Shape) null, ButtonDefaults.INSTANCE.outlinedButtonColors-ro_MJ88(0L, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU(), 0L, 0L, composer, ButtonDefaults.$stable << 12, 13), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.getLambda$1075279259$app(), composer, 805306368, 492);
                        composer5 = composer;
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        composer5.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        composer5.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        composer5.endReplaceGroup();
                        Unit unit3 = Unit.INSTANCE;
                        composer4 = composer5;
                        break;
                    case "REQUESTED":
                        composer.startReplaceGroup(-1890385416);
                        ComposerKt.sourceInformation(composer, "1327@75820L2737");
                        Modifier modifierFillMaxWidth$default10 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
                        Arrangement.Vertical vertical4 = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(6.0f));
                        ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(vertical4, Alignment.Companion.getStart(), composer, 6);
                        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash11 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap11 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default10);
                        Function0 constructor11 = ComposeUiNode.Companion.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor11);
                        } else {
                            composer.useNode();
                        }
                        Composer composer16 = Updater.constructor-impl(composer);
                        Updater.set-impl(composer16, measurePolicyColumnMeasurePolicy5, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.set-impl(composer16, currentCompositionLocalMap11, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash11 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composer16.getInserting() || !Intrinsics.areEqual(composer16.rememberedValue(), Integer.valueOf(currentCompositeKeyHash11))) {
                            composer16.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash11));
                            composer16.apply(Integer.valueOf(currentCompositeKeyHash11), setCompositeKeyHash11);
                        }
                        Updater.set-impl(composer16, modifierMaterializeModifier11, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScope columnScope5 = ColumnScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer, -848931824, "C1328@75951L1763,1357@77930L11,1357@77991L11,1357@77886L138,1359@78139L384,1355@77751L772:BookDetailsDialog.kt#2thlc2");
                        Modifier modifierFillMaxWidth$default11 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
                        Arrangement.Horizontal horizontal7 = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(8.0f));
                        ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        MeasurePolicy measurePolicyRowMeasurePolicy7 = RowKt.rowMeasurePolicy(horizontal7, Alignment.Companion.getTop(), composer, 6);
                        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash12 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap12 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier12 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default11);
                        Function0 constructor12 = ComposeUiNode.Companion.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor12);
                        } else {
                            composer.useNode();
                        }
                        Composer composer17 = Updater.constructor-impl(composer);
                        Updater.set-impl(composer17, measurePolicyRowMeasurePolicy7, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.set-impl(composer17, currentCompositionLocalMap12, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash12 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composer17.getInserting() || !Intrinsics.areEqual(composer17.rememberedValue(), Integer.valueOf(currentCompositeKeyHash12))) {
                            composer17.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash12));
                            composer17.apply(Integer.valueOf(currentCompositeKeyHash12), setCompositeKeyHash12);
                        }
                        Updater.set-impl(composer17, modifierMaterializeModifier12, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScope rowScope7 = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer, -937707809, "C1337@76520L48,1333@76265L185,1332@76203L816,1345@77130L186,1350@77512L11,1350@77462L68,1344@77060L616:BookDetailsDialog.kt#2thlc2");
                        ButtonColors buttonColors2 = ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(ColorKt.Color(4279994175L), 0L, 0L, 0L, composer, (ButtonDefaults.$stable << 12) | 6, 14);
                        Modifier modifierWeight$default2 = RowScope.weight$default(rowScope7, Modifier.Companion, 1.2f, false, 2, (Object) null);
                        ComposerKt.sourceInformationMarkerStart(composer, -1000079268, "CC(remember):BookDetailsDialog.kt#9igjgp");
                        boolean zChangedInstance5 = composer.changedInstance(bookViewModel) | composer.changedInstance(book) | composer.changed(function1);
                        Object objRememberedValue12 = composer.rememberedValue();
                        if (zChangedInstance5 || objRememberedValue12 == Composer.Companion.getEmpty()) {
                            objRememberedValue12 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda94
                                public final Object invoke() {
                                    return BookDetailsDialogKt.BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$247$lambda$245$lambda$242$lambda$241(bookViewModel, book, function1);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue12);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ButtonKt.Button((Function0) objRememberedValue12, modifierWeight$default2, false, (Shape) null, buttonColors2, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.m194getLambda$1403559565$app(), composer, 805306368, 492);
                        ComposerKt.sourceInformationMarkerStart(composer, -1000051587, "CC(remember):BookDetailsDialog.kt#9igjgp");
                        boolean zChangedInstance6 = composer.changedInstance(bookViewModel) | composer.changedInstance(book) | composer.changed(function1);
                        Object objRememberedValue13 = composer.rememberedValue();
                        if (zChangedInstance6 || objRememberedValue13 == Composer.Companion.getEmpty()) {
                            objRememberedValue13 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda106
                                public final Object invoke() {
                                    return BookDetailsDialogKt.BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$247$lambda$245$lambda$244$lambda$243(bookViewModel, book, function1);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue13);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ButtonKt.OutlinedButton((Function0) objRememberedValue13, RowScope.weight$default(rowScope7, Modifier.Companion, 1.0f, false, 2, (Object) null), false, (Shape) null, ButtonDefaults.INSTANCE.outlinedButtonColors-ro_MJ88(0L, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU(), 0L, 0L, composer, ButtonDefaults.$stable << 12, 13), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.getLambda$1907182769$app(), composer, 805306368, 492);
                        composer5 = composer;
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        composer5.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ButtonKt.Button(function0, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), false, (Shape) null, ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer5, MaterialTheme.$stable).getSecondaryContainer-0d7_KjU(), MaterialTheme.INSTANCE.getColorScheme(composer5, MaterialTheme.$stable).getOnSecondaryContainer-0d7_KjU(), 0L, 0L, composer5, ButtonDefaults.$stable << 12, 12), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableLambdaKt.rememberComposableLambda(429251415, true, new Function3() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda2
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                return BookDetailsDialogKt.BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$247$lambda$246(book, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                            }
                        }, composer5, 54), composer5, 805306416, 492);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        composer5.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        composer5.endReplaceGroup();
                        Unit unit4 = Unit.INSTANCE;
                        composer4 = composer5;
                        break;
                    case "AVAILABLE":
                        composer.startReplaceGroup(-1892234163);
                        ComposerKt.sourceInformation(composer, "1299@73988L1724");
                        Modifier modifierFillMaxWidth$default12 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
                        Arrangement.Horizontal horizontal8 = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(8.0f));
                        ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        MeasurePolicy measurePolicyRowMeasurePolicy8 = RowKt.rowMeasurePolicy(horizontal8, Alignment.Companion.getTop(), composer, 6);
                        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash13 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap13 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier13 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default12);
                        Function0 constructor13 = ComposeUiNode.Companion.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor13);
                        } else {
                            composer.useNode();
                        }
                        Composer composer18 = Updater.constructor-impl(composer);
                        Updater.set-impl(composer18, measurePolicyRowMeasurePolicy8, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.set-impl(composer18, currentCompositionLocalMap13, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash13 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composer18.getInserting() || !Intrinsics.areEqual(composer18.rememberedValue(), Integer.valueOf(currentCompositeKeyHash13))) {
                            composer18.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash13));
                            composer18.apply(Integer.valueOf(currentCompositeKeyHash13), setCompositeKeyHash13);
                        }
                        Updater.set-impl(composer18, modifierMaterializeModifier13, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScope rowScope8 = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer, 1074277107, "C1305@74403L11,1305@74359L64,1303@74224L632,1317@75248L11,1317@75198L68,1313@74959L173,1312@74893L785:BookDetailsDialog.kt#2thlc2");
                        ButtonKt.Button(function0, RowScope.weight$default(rowScope8, Modifier.Companion, 1.5f, false, 2, (Object) null), false, (Shape) null, ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0L, 0L, 0L, composer, ButtonDefaults.$stable << 12, 14), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.m209getLambda$1961379022$app(), composer, 805306368, 492);
                        ButtonColors buttonColors3 = ButtonDefaults.INSTANCE.outlinedButtonColors-ro_MJ88(0L, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU(), 0L, 0L, composer, ButtonDefaults.$stable << 12, 13);
                        composer5 = composer;
                        Modifier modifierWeight$default3 = RowScope.weight$default(rowScope8, Modifier.Companion, 1.0f, false, 2, (Object) null);
                        ComposerKt.sourceInformationMarkerStart(composer5, -103870993, "CC(remember):BookDetailsDialog.kt#9igjgp");
                        boolean zChangedInstance7 = composer5.changedInstance(bookViewModel) | composer5.changedInstance(book) | composer5.changed(function1);
                        Object objRememberedValue14 = composer5.rememberedValue();
                        if (zChangedInstance7 || objRememberedValue14 == Composer.Companion.getEmpty()) {
                            objRememberedValue14 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda82
                                public final Object invoke() {
                                    return BookDetailsDialogKt.BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$240$lambda$239$lambda$238(bookViewModel, book, function1);
                                }
                            };
                            composer5.updateRememberedValue(objRememberedValue14);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ButtonKt.OutlinedButton((Function0) objRememberedValue14, modifierWeight$default3, false, (Shape) null, buttonColors3, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.getLambda$187965680$app(), composer5, 805306368, 492);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        composer5.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        composer5.endReplaceGroup();
                        Unit unit5 = Unit.INSTANCE;
                        composer4 = composer5;
                        break;
                    default:
                        composer4 = composer;
                        composer4.startReplaceGroup(-1965652951);
                        composer4.endReplaceGroup();
                        Unit unit6 = Unit.INSTANCE;
                        break;
                }
                composer4.endReplaceGroup();
                composer2 = composer4;
            } else {
                composer.startReplaceGroup(-1871420050);
                ComposerKt.sourceInformation(composer, "");
                String status = book.getStatus();
                switch (status.hashCode()) {
                    case -1710271240:
                        composer2 = composer;
                        if (status.equals("PENDING_RETURN")) {
                            composer2.startReplaceGroup(-1853709347);
                            ComposerKt.sourceInformation(composer2, "");
                            if (z3) {
                                composer2.startReplaceGroup(-1853698745);
                                ComposerKt.sourceInformation(composer2, "1838@112747L4634");
                                Modifier modifierWeight$default4 = RowScope.weight$default(rowScope, Modifier.Companion, 1.0f, false, 2, (Object) null);
                                ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                MeasurePolicy measurePolicyColumnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, 0);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash14 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap14 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier14 = ComposedModifierKt.materializeModifier(composer2, modifierWeight$default4);
                                Function0 constructor14 = ComposeUiNode.Companion.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor14);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composer19 = Updater.constructor-impl(composer2);
                                Updater.set-impl(composer19, measurePolicyColumnMeasurePolicy6, ComposeUiNode.Companion.getSetMeasurePolicy());
                                Updater.set-impl(composer19, currentCompositionLocalMap14, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                Function2 setCompositeKeyHash14 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                if (composer19.getInserting() || !Intrinsics.areEqual(composer19.rememberedValue(), Integer.valueOf(currentCompositeKeyHash14))) {
                                    composer19.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash14));
                                    composer19.apply(Integer.valueOf(currentCompositeKeyHash14), setCompositeKeyHash14);
                                }
                                Updater.set-impl(composer19, modifierMaterializeModifier14, ComposeUiNode.Companion.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                ColumnScope columnScope6 = ColumnScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer2, -2087523079, "C1839@112828L2722,1874@115591L40,1875@115672L1671:BookDetailsDialog.kt#2thlc2");
                                Modifier modifierFillMaxWidth$default13 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
                                Arrangement.Horizontal horizontal9 = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(6.0f));
                                ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                MeasurePolicy measurePolicyRowMeasurePolicy9 = RowKt.rowMeasurePolicy(horizontal9, Alignment.Companion.getTop(), composer2, 6);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash15 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap15 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier15 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default13);
                                Function0 constructor15 = ComposeUiNode.Companion.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor15);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composer20 = Updater.constructor-impl(composer2);
                                Updater.set-impl(composer20, measurePolicyRowMeasurePolicy9, ComposeUiNode.Companion.getSetMeasurePolicy());
                                Updater.set-impl(composer20, currentCompositionLocalMap15, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                Function2 setCompositeKeyHash15 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                if (composer20.getInserting() || !Intrinsics.areEqual(composer20.rememberedValue(), Integer.valueOf(currentCompositeKeyHash15))) {
                                    composer20.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash15));
                                    composer20.apply(Integer.valueOf(currentCompositeKeyHash15), setCompositeKeyHash15);
                                }
                                Updater.set-impl(composer20, modifierMaterializeModifier15, ComposeUiNode.Companion.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                RowScope rowScope9 = RowScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer2, -1582611982, "C1841@113032L207,1846@113439L11,1846@113395L65,1840@112966L927,1853@114012L207,1852@113938L790,1864@114847L196,1869@115247L11,1869@115197L68,1863@114773L735:BookDetailsDialog.kt#2thlc2");
                                ComposerKt.sourceInformationMarkerStart(composer2, 503137106, "CC(remember):BookDetailsDialog.kt#9igjgp");
                                Object objRememberedValue15 = composer2.rememberedValue();
                                if (objRememberedValue15 == Composer.Companion.getEmpty()) {
                                    objRememberedValue15 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda110
                                        public final Object invoke() {
                                            return BookDetailsDialogKt.BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$335$lambda$331$lambda$326$lambda$325(mutableState4, mutableState5);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue15);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ButtonKt.Button((Function0) objRememberedValue15, RowScope.weight$default(rowScope9, Modifier.Companion, 1.2f, false, 2, (Object) null), false, (Shape) null, ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getTertiary-0d7_KjU(), 0L, 0L, 0L, composer2, ButtonDefaults.$stable << 12, 14), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.m199getLambda$1625519277$app(), composer, 805306374, 492);
                                ComposerKt.sourceInformationMarkerStart(composer, 503168466, "CC(remember):BookDetailsDialog.kt#9igjgp");
                                Object objRememberedValue16 = composer.rememberedValue();
                                if (objRememberedValue16 == Composer.Companion.getEmpty()) {
                                    objRememberedValue16 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda111
                                        public final Object invoke() {
                                            return BookDetailsDialogKt.BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$335$lambda$331$lambda$328$lambda$327(mutableState2, mutableState3);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue16);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ButtonKt.OutlinedButton((Function0) objRememberedValue16, RowScope.weight$default(rowScope9, Modifier.Companion, 1.2f, false, 2, (Object) null), false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.m186getLambda$102082415$app(), composer, 805306374, 508);
                                ComposerKt.sourceInformationMarkerStart(composer, 503195175, "CC(remember):BookDetailsDialog.kt#9igjgp");
                                boolean zChangedInstance8 = composer.changedInstance(bookViewModel) | composer.changedInstance(book) | composer.changed(function1);
                                Object objRememberedValue17 = composer.rememberedValue();
                                if (zChangedInstance8 || objRememberedValue17 == Composer.Companion.getEmpty()) {
                                    objRememberedValue17 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda112
                                        public final Object invoke() {
                                            return BookDetailsDialogKt.BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$335$lambda$331$lambda$330$lambda$329(bookViewModel, book, function1);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue17);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ButtonKt.OutlinedButton((Function0) objRememberedValue17, RowScope.weight$default(rowScope9, Modifier.Companion, 1.0f, false, 2, (Object) null), false, (Shape) null, ButtonDefaults.INSTANCE.outlinedButtonColors-ro_MJ88(0L, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU(), 0L, 0L, composer, ButtonDefaults.$stable << 12, 13), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.getLambda$656063226$app(), composer, 805306368, 492);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                composer.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
                                Modifier modifierFillMaxWidth$default14 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
                                Arrangement.Horizontal horizontal10 = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(8.0f));
                                ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                MeasurePolicy measurePolicyRowMeasurePolicy10 = RowKt.rowMeasurePolicy(horizontal10, Alignment.Companion.getTop(), composer, 6);
                                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash16 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                                CompositionLocalMap currentCompositionLocalMap16 = composer.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier16 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default14);
                                Function0 constructor16 = ComposeUiNode.Companion.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(composer.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer.startReusableNode();
                                if (composer.getInserting()) {
                                    composer.createNode(constructor16);
                                } else {
                                    composer.useNode();
                                }
                                Composer composer21 = Updater.constructor-impl(composer);
                                Updater.set-impl(composer21, measurePolicyRowMeasurePolicy10, ComposeUiNode.Companion.getSetMeasurePolicy());
                                Updater.set-impl(composer21, currentCompositionLocalMap16, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                Function2 setCompositeKeyHash16 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                if (composer21.getInserting() || !Intrinsics.areEqual(composer21.rememberedValue(), Integer.valueOf(currentCompositeKeyHash16))) {
                                    composer21.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash16));
                                    composer21.apply(Integer.valueOf(currentCompositeKeyHash16), setCompositeKeyHash16);
                                }
                                Updater.set-impl(composer21, modifierMaterializeModifier16, ComposeUiNode.Companion.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                RowScope rowScope10 = RowScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer, 1295277990, "C1879@115940L520,1888@116582L255,1887@116505L796:BookDetailsDialog.kt#2thlc2");
                                ButtonKt.OutlinedButton(function0, RowScope.weight$default(rowScope10, Modifier.Companion, 1.0f, false, 2, (Object) null), false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.m213getLambda$2081348678$app(), composer, 805306368, 508);
                                composer2 = composer;
                                ComposerKt.sourceInformationMarkerStart(composer2, 180349931, "CC(remember):BookDetailsDialog.kt#9igjgp");
                                Object objRememberedValue18 = composer2.rememberedValue();
                                if (objRememberedValue18 == Composer.Companion.getEmpty()) {
                                    objRememberedValue18 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda113
                                        public final Object invoke() {
                                            return BookDetailsDialogKt.BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$335$lambda$334$lambda$333$lambda$332(mutableState7, mutableState8);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue18);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ButtonKt.FilledTonalButton((Function0) objRememberedValue18, RowScope.weight$default(rowScope10, Modifier.Companion, 1.2f, false, 2, (Object) null), false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.getLambda$1877443034$app(), composer2, 805306374, 508);
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
                            } else {
                                composer2.startReplaceGroup(-1849133995);
                                ComposerKt.sourceInformation(composer2, "1901@117459L1100");
                                Modifier modifierFillMaxWidth$default15 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
                                Arrangement.Horizontal horizontal11 = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(8.0f));
                                ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                MeasurePolicy measurePolicyRowMeasurePolicy11 = RowKt.rowMeasurePolicy(horizontal11, Alignment.Companion.getTop(), composer2, 6);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash17 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap17 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier17 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default15);
                                Function0 constructor17 = ComposeUiNode.Companion.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor17);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composer22 = Updater.constructor-impl(composer2);
                                Updater.set-impl(composer22, measurePolicyRowMeasurePolicy11, ComposeUiNode.Companion.getSetMeasurePolicy());
                                Updater.set-impl(composer22, currentCompositionLocalMap17, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                Function2 setCompositeKeyHash17 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                if (composer22.getInserting() || !Intrinsics.areEqual(composer22.rememberedValue(), Integer.valueOf(currentCompositeKeyHash17))) {
                                    composer22.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash17));
                                    composer22.apply(Integer.valueOf(currentCompositeKeyHash17), setCompositeKeyHash17);
                                }
                                Updater.set-impl(composer22, modifierMaterializeModifier17, ComposeUiNode.Companion.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                RowScope rowScope11 = RowScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer2, -56047597, "C1903@117663L2,1902@117593L364,1909@117998L523:BookDetailsDialog.kt#2thlc2");
                                Modifier modifierWeight$default5 = RowScope.weight$default(rowScope11, Modifier.Companion, 1.0f, false, 2, (Object) null);
                                ComposerKt.sourceInformationMarkerStart(composer2, -971637998, "CC(remember):BookDetailsDialog.kt#9igjgp");
                                Object objRememberedValue19 = composer2.rememberedValue();
                                if (objRememberedValue19 == Composer.Companion.getEmpty()) {
                                    objRememberedValue19 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda1
                                        public final Object invoke() {
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue19);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ButtonKt.OutlinedButton((Function0) objRememberedValue19, modifierWeight$default5, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.getLambda$372963038$app(), composer2, 805306758, 504);
                                ButtonKt.Button(function0, RowScope.weight$default(rowScope11, Modifier.Companion, 1.0f, false, 2, (Object) null), false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.getLambda$1737043744$app(), composer, 805306368, 508);
                                composer2 = composer;
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endReplaceGroup();
                            }
                        } else {
                            composer2.startReplaceGroup(-1965652951);
                        }
                        composer2.endReplaceGroup();
                        Unit unit7 = Unit.INSTANCE;
                        break;
                    case -1494985904:
                        composer2 = composer;
                        if (!status.equals("PENDING_RECEIPT")) {
                            composer2.startReplaceGroup(-1965652951);
                            composer2.endReplaceGroup();
                            Unit unit8 = Unit.INSTANCE;
                        } else {
                            composer2.startReplaceGroup(-1863920065);
                            ComposerKt.sourceInformation(composer2, "");
                            if (z2) {
                                composer2.startReplaceGroup(-1863908378);
                                ComposerKt.sourceInformation(composer2, "1698@102419L5787");
                                Modifier modifierWeight$default6 = RowScope.weight$default(rowScope, Modifier.Companion, 1.0f, false, 2, (Object) null);
                                ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                MeasurePolicy measurePolicyColumnMeasurePolicy7 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, 0);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash18 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap18 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier18 = ComposedModifierKt.materializeModifier(composer2, modifierWeight$default6);
                                Function0 constructor18 = ComposeUiNode.Companion.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor18);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composer23 = Updater.constructor-impl(composer2);
                                Updater.set-impl(composer23, measurePolicyColumnMeasurePolicy7, ComposeUiNode.Companion.getSetMeasurePolicy());
                                Updater.set-impl(composer23, currentCompositionLocalMap18, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                Function2 setCompositeKeyHash18 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                if (composer23.getInserting() || !Intrinsics.areEqual(composer23.rememberedValue(), Integer.valueOf(currentCompositeKeyHash18))) {
                                    composer23.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash18));
                                    composer23.apply(Integer.valueOf(currentCompositeKeyHash18), setCompositeKeyHash18);
                                }
                                Updater.set-impl(composer23, modifierMaterializeModifier18, ComposeUiNode.Companion.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                ColumnScope columnScope7 = ColumnScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer2, 1584697818, "C1731@105322L2846:BookDetailsDialog.kt#2thlc2");
                                final String transferImageUrl = book.getTransferImageUrl();
                                if (transferImageUrl == null) {
                                    transferImageUrl = book.getImageUrl();
                                }
                                String str = transferImageUrl;
                                if (str == null || StringsKt.isBlank(str)) {
                                    composer2.startReplaceGroup(1482841117);
                                } else {
                                    composer2.startReplaceGroup(1584738055);
                                    ComposerKt.sourceInformation(composer2, "1702@102760L11,1705@103044L2195,1701@102681L2558");
                                    long j2 = Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
                                    SurfaceKt.Surface-T9BRK9s(PaddingKt.padding-qDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), 0.0f, 0.0f, 0.0f, Dp.constructor-impl(8.0f), 7, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(14.0f)), j2, 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(1385832623, true, new Function2() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda99
                                        public final Object invoke(Object obj, Object obj2) {
                                            return BookDetailsDialogKt.BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$312$lambda$304(transferImageUrl, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    }, composer2, 54), composer2, 12582918, 120);
                                }
                                composer2.endReplaceGroup();
                                Modifier modifierFillMaxWidth$default16 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
                                Arrangement.Horizontal horizontal12 = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(6.0f));
                                ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                MeasurePolicy measurePolicyRowMeasurePolicy12 = RowKt.rowMeasurePolicy(horizontal12, Alignment.Companion.getTop(), composer2, 6);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash19 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap19 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier19 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default16);
                                Function0 constructor19 = ComposeUiNode.Companion.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor19);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composer24 = Updater.constructor-impl(composer2);
                                Updater.set-impl(composer24, measurePolicyRowMeasurePolicy12, ComposeUiNode.Companion.getSetMeasurePolicy());
                                Updater.set-impl(composer24, currentCompositionLocalMap19, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                Function2 setCompositeKeyHash19 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                if (composer24.getInserting() || !Intrinsics.areEqual(composer24.rememberedValue(), Integer.valueOf(currentCompositeKeyHash19))) {
                                    composer24.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash19));
                                    composer24.apply(Integer.valueOf(currentCompositeKeyHash19), setCompositeKeyHash19);
                                }
                                Updater.set-impl(composer24, modifierMaterializeModifier19, ComposeUiNode.Companion.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                RowScope rowScope12 = RowScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer2, 2089577016, "C1733@105526L209,1732@105460L712,1744@106283L384,1750@106821L48,1743@106217L1012,1757@107348L198,1761@107670L11,1761@107620L68,1756@107274L612,1765@107931L195:BookDetailsDialog.kt#2thlc2");
                                ComposerKt.sourceInformationMarkerStart(composer2, 1037236690, "CC(remember):BookDetailsDialog.kt#9igjgp");
                                Object objRememberedValue20 = composer2.rememberedValue();
                                if (objRememberedValue20 == Composer.Companion.getEmpty()) {
                                    objRememberedValue20 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda100
                                        public final Object invoke() {
                                            return BookDetailsDialogKt.BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$312$lambda$311$lambda$306$lambda$305(mutableState2, mutableState3);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue20);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ButtonKt.Button((Function0) objRememberedValue20, RowScope.weight$default(rowScope12, Modifier.Companion, 1.0f, false, 2, (Object) null), false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.m205getLambda$1790326447$app(), composer2, 805306374, 508);
                                ComposerKt.sourceInformationMarkerStart(composer2, 1037261089, "CC(remember):BookDetailsDialog.kt#9igjgp");
                                boolean zChangedInstance9 = composer2.changedInstance(bookViewModel) | composer2.changedInstance(book) | composer2.changedInstance(context) | composer2.changed(function1);
                                Object objRememberedValue21 = composer2.rememberedValue();
                                if (zChangedInstance9 || objRememberedValue21 == Composer.Companion.getEmpty()) {
                                    objRememberedValue21 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda101
                                        public final Object invoke() {
                                            return BookDetailsDialogKt.BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$312$lambda$311$lambda$308$lambda$307(bookViewModel, book, context, function1);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue21);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ButtonKt.Button((Function0) objRememberedValue21, RowScope.weight$default(rowScope12, Modifier.Companion, 1.0f, false, 2, (Object) null), false, (Shape) null, ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(ColorKt.Color(4279994175L), 0L, 0L, 0L, composer, (ButtonDefaults.$stable << 12) | 6, 14), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.getLambda$1052279610$app(), composer, 805306368, 492);
                                ComposerKt.sourceInformationMarkerStart(composer, 1037294983, "CC(remember):BookDetailsDialog.kt#9igjgp");
                                boolean zChangedInstance10 = composer.changedInstance(bookViewModel) | composer.changedInstance(book) | composer.changed(function1);
                                Object objRememberedValue22 = composer.rememberedValue();
                                if (zChangedInstance10 || objRememberedValue22 == Composer.Companion.getEmpty()) {
                                    objRememberedValue22 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda102
                                        public final Object invoke() {
                                            return BookDetailsDialogKt.BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$312$lambda$311$lambda$310$lambda$309(bookViewModel, book, function1);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue22);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ButtonKt.OutlinedButton((Function0) objRememberedValue22, (Modifier) null, false, (Shape) null, ButtonDefaults.INSTANCE.outlinedButtonColors-ro_MJ88(0L, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU(), 0L, 0L, composer, ButtonDefaults.$stable << 12, 13), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.m214getLambda$266889585$app(), composer, 805306368, 494);
                                IconButtonKt.IconButton(function0, (Modifier) null, false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.getLambda$513318596$app(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
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
                            } else {
                                composer2.startReplaceGroup(-1858235719);
                                ComposerKt.sourceInformation(composer2, "1771@108284L1096");
                                Modifier modifierFillMaxWidth$default17 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
                                Arrangement.Horizontal horizontal13 = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(8.0f));
                                ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                MeasurePolicy measurePolicyRowMeasurePolicy13 = RowKt.rowMeasurePolicy(horizontal13, Alignment.Companion.getTop(), composer2, 6);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash20 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap20 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier20 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default17);
                                Function0 constructor20 = ComposeUiNode.Companion.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor20);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composer25 = Updater.constructor-impl(composer2);
                                Updater.set-impl(composer25, measurePolicyRowMeasurePolicy13, ComposeUiNode.Companion.getSetMeasurePolicy());
                                Updater.set-impl(composer25, currentCompositionLocalMap20, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                Function2 setCompositeKeyHash20 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                if (composer25.getInserting() || !Intrinsics.areEqual(composer25.rememberedValue(), Integer.valueOf(currentCompositeKeyHash20))) {
                                    composer25.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash20));
                                    composer25.apply(Integer.valueOf(currentCompositeKeyHash20), setCompositeKeyHash20);
                                }
                                Updater.set-impl(composer25, modifierMaterializeModifier20, ComposeUiNode.Companion.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                RowScope rowScope13 = RowScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer2, -678829863, "C1773@108488L2,1772@108418L360,1779@108819L523:BookDetailsDialog.kt#2thlc2");
                                Modifier modifierWeight$default7 = RowScope.weight$default(rowScope13, Modifier.Companion, 1.0f, false, 2, (Object) null);
                                ComposerKt.sourceInformationMarkerStart(composer2, -437538416, "CC(remember):BookDetailsDialog.kt#9igjgp");
                                Object objRememberedValue23 = composer2.rememberedValue();
                                if (objRememberedValue23 == Composer.Companion.getEmpty()) {
                                    objRememberedValue23 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda104
                                        public final Object invoke() {
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue23);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ButtonKt.OutlinedButton((Function0) objRememberedValue23, modifierWeight$default7, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.getLambda$208155868$app(), composer2, 805306758, 504);
                                ButtonKt.Button(function0, RowScope.weight$default(rowScope13, Modifier.Companion, 1.0f, false, 2, (Object) null), false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.getLambda$1572236574$app(), composer, 805306368, 508);
                                composer2 = composer;
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endReplaceGroup();
                            }
                            composer2.endReplaceGroup();
                            Unit unit9 = Unit.INSTANCE;
                        }
                        break;
                    case -1414529708:
                        composer2 = composer;
                        if (!status.equals("BORROWED")) {
                            composer2.startReplaceGroup(-1965652951);
                            composer2.endReplaceGroup();
                            Unit unit10 = Unit.INSTANCE;
                        } else {
                            composer2.startReplaceGroup(-1856944042);
                            ComposerKt.sourceInformation(composer2, "");
                            if (z3) {
                                composer2.startReplaceGroup(-1856933192);
                                ComposerKt.sourceInformation(composer2, "1793@109633L193,1798@110010L11,1798@109966L65,1792@109575L779,1804@110391L221,1807@110670L37,1807@110649L251,1810@110958L219,1810@110937L439");
                                ComposerKt.sourceInformationMarkerStart(composer2, 771384314, "CC(remember):BookDetailsDialog.kt#9igjgp");
                                boolean zChangedInstance11 = composer2.changedInstance(managedActivityResultLauncher);
                                Object objRememberedValue24 = composer2.rememberedValue();
                                if (zChangedInstance11 || objRememberedValue24 == Composer.Companion.getEmpty()) {
                                    objRememberedValue24 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda105
                                        public final Object invoke() {
                                            return BookDetailsDialogKt.BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$317$lambda$316(managedActivityResultLauncher, mutableState);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue24);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ButtonKt.Button((Function0) objRememberedValue24, RowScope.weight$default(rowScope, Modifier.Companion, 1.5f, false, 2, (Object) null), false, (Shape) null, ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getTertiary-0d7_KjU(), 0L, 0L, 0L, composer, ButtonDefaults.$stable << 12, 14), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.m195getLambda$1411350804$app(), composer, 805306368, 492);
                                IconButtonKt.IconButton(function0, (Modifier) null, false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.getLambda$712292639$app(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                                composer2 = composer;
                                ComposerKt.sourceInformationMarkerStart(composer2, 771417342, "CC(remember):BookDetailsDialog.kt#9igjgp");
                                Object objRememberedValue25 = composer2.rememberedValue();
                                if (objRememberedValue25 == Composer.Companion.getEmpty()) {
                                    objRememberedValue25 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda107
                                        public final Object invoke() {
                                            return BookDetailsDialogKt.BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$319$lambda$318(mutableState10);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue25);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                IconButtonKt.IconButton((Function0) objRememberedValue25, (Modifier) null, false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.getLambda$1258144904$app(), composer2, 196614, 30);
                                ComposerKt.sourceInformationMarkerStart(composer2, 771426740, "CC(remember):BookDetailsDialog.kt#9igjgp");
                                Object objRememberedValue26 = composer2.rememberedValue();
                                if (objRememberedValue26 == Composer.Companion.getEmpty()) {
                                    objRememberedValue26 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda108
                                        public final Object invoke() {
                                            return BookDetailsDialogKt.BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$321$lambda$320(mutableState7, mutableState8);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue26);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                IconButtonKt.IconButton((Function0) objRememberedValue26, (Modifier) null, false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.m200getLambda$1655662105$app(), composer2, 196614, 30);
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(-1855091203);
                                ComposerKt.sourceInformation(composer2, "1817@111454L1092");
                                Modifier modifierFillMaxWidth$default18 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
                                Arrangement.Horizontal horizontal14 = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(8.0f));
                                ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                MeasurePolicy measurePolicyRowMeasurePolicy14 = RowKt.rowMeasurePolicy(horizontal14, Alignment.Companion.getTop(), composer2, 6);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash21 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap21 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier21 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default18);
                                Function0 constructor21 = ComposeUiNode.Companion.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor21);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composer26 = Updater.constructor-impl(composer2);
                                Updater.set-impl(composer26, measurePolicyRowMeasurePolicy14, ComposeUiNode.Companion.getSetMeasurePolicy());
                                Updater.set-impl(composer26, currentCompositionLocalMap21, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                Function2 setCompositeKeyHash21 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                if (composer26.getInserting() || !Intrinsics.areEqual(composer26.rememberedValue(), Integer.valueOf(currentCompositeKeyHash21))) {
                                    composer26.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash21));
                                    composer26.apply(Integer.valueOf(currentCompositeKeyHash21), setCompositeKeyHash21);
                                }
                                Updater.set-impl(composer26, modifierMaterializeModifier21, ComposeUiNode.Companion.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                RowScope rowScope14 = RowScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer2, -367438916, "C1819@111658L2,1818@111588L356,1825@111985L523:BookDetailsDialog.kt#2thlc2");
                                Modifier modifierWeight$default8 = RowScope.weight$default(rowScope14, Modifier.Companion, 1.0f, false, 2, (Object) null);
                                ComposerKt.sourceInformationMarkerStart(composer2, -704588207, "CC(remember):BookDetailsDialog.kt#9igjgp");
                                Object objRememberedValue27 = composer2.rememberedValue();
                                if (objRememberedValue27 == Composer.Companion.getEmpty()) {
                                    objRememberedValue27 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda109
                                        public final Object invoke() {
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue27);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ButtonKt.OutlinedButton((Function0) objRememberedValue27, modifierWeight$default8, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.m207getLambda$1856924195$app(), composer2, 805306758, 504);
                                ButtonKt.Button(function0, RowScope.weight$default(rowScope14, Modifier.Companion, 1.0f, false, 2, (Object) null), false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.m215getLambda$492843489$app(), composer, 805306368, 508);
                                composer2 = composer;
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endReplaceGroup();
                            }
                            composer2.endReplaceGroup();
                            Unit unit11 = Unit.INSTANCE;
                        }
                        break;
                    case -1305282125:
                        composer2 = composer;
                        if (!status.equals("PENDING_TRANSFER")) {
                            composer2.startReplaceGroup(-1965652951);
                            composer2.endReplaceGroup();
                            Unit unit12 = Unit.INSTANCE;
                        } else {
                            composer2.startReplaceGroup(-1867477780);
                            ComposerKt.sourceInformation(composer2, "");
                            if (z2) {
                                composer2.startReplaceGroup(-1867465969);
                                ComposerKt.sourceInformation(composer2, "1646@98948L2098");
                                Modifier modifierFillMaxWidth$default19 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
                                Arrangement.Horizontal horizontal15 = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(8.0f));
                                ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                MeasurePolicy measurePolicyRowMeasurePolicy15 = RowKt.rowMeasurePolicy(horizontal15, Alignment.Companion.getTop(), composer2, 6);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash22 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier22 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default19);
                                Function0 constructor22 = ComposeUiNode.Companion.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor22);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composer27 = Updater.constructor-impl(composer2);
                                Updater.set-impl(composer27, measurePolicyRowMeasurePolicy15, ComposeUiNode.Companion.getSetMeasurePolicy());
                                Updater.set-impl(composer27, currentCompositionLocalMap22, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                Function2 setCompositeKeyHash22 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                if (composer27.getInserting() || !Intrinsics.areEqual(composer27.rememberedValue(), Integer.valueOf(currentCompositeKeyHash22))) {
                                    composer27.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash22));
                                    composer27.apply(Integer.valueOf(currentCompositeKeyHash22), setCompositeKeyHash22);
                                }
                                Updater.set-impl(composer27, modifierMaterializeModifier22, ComposeUiNode.Companion.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                RowScope rowScope15 = RowScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer2, -454816003, "C1650@99200L492,1659@99806L31,1660@99907L113,1658@99733L649,1667@100493L191,1671@100804L11,1671@100754L68,1666@100423L585:BookDetailsDialog.kt#2thlc2");
                                ButtonKt.Button(function0, RowScope.weight$default(rowScope15, Modifier.Companion, 1.2f, false, 2, (Object) null), false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.m190getLambda$1130758906$app(), composer2, 805306368, 508);
                                ComposerKt.sourceInformationMarkerStart(composer2, -2092863851, "CC(remember):BookDetailsDialog.kt#9igjgp");
                                Object objRememberedValue28 = composer2.rememberedValue();
                                if (objRememberedValue28 == Composer.Companion.getEmpty()) {
                                    objRememberedValue28 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda96
                                        public final Object invoke() {
                                            return BookDetailsDialogKt.BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$298$lambda$295$lambda$294(mutableState9);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue28);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ButtonKt.FilledTonalButton((Function0) objRememberedValue28, (Modifier) null, false, (Shape) null, ButtonDefaults.INSTANCE.filledTonalButtonColors-ro_MJ88(Color.copy-wmQWz5c$default(ColorKt.Color(4279994175L), 0.15f, 0.0f, 0.0f, 0.0f, 14, (Object) null), ColorKt.Color(4279994175L), 0L, 0L, composer2, 54 | (ButtonDefaults.$stable << 12), 12), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.getLambda$1902707556$app(), composer, 805306374, 494);
                                ComposerKt.sourceInformationMarkerStart(composer, -2092841707, "CC(remember):BookDetailsDialog.kt#9igjgp");
                                boolean zChangedInstance12 = composer.changedInstance(bookViewModel) | composer.changedInstance(book) | composer.changed(function1);
                                Object objRememberedValue29 = composer.rememberedValue();
                                if (zChangedInstance12 || objRememberedValue29 == Composer.Companion.getEmpty()) {
                                    objRememberedValue29 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda97
                                        public final Object invoke() {
                                            return BookDetailsDialogKt.BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$298$lambda$297$lambda$296(bookViewModel, book, function1);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue29);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ButtonKt.OutlinedButton((Function0) objRememberedValue29, (Modifier) null, false, (Shape) null, ButtonDefaults.INSTANCE.outlinedButtonColors-ro_MJ88(0L, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU(), 0L, 0L, composer, ButtonDefaults.$stable << 12, 13), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.m211getLambda$2047292092$app(), composer, 805306368, 494);
                                composer2 = composer;
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(-1865338563);
                                ComposerKt.sourceInformation(composer2, "1677@101124L1092");
                                Modifier modifierFillMaxWidth$default20 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
                                Arrangement.Horizontal horizontal16 = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(8.0f));
                                ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                MeasurePolicy measurePolicyRowMeasurePolicy16 = RowKt.rowMeasurePolicy(horizontal16, Alignment.Companion.getTop(), composer2, 6);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash23 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap23 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier23 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default20);
                                Function0 constructor23 = ComposeUiNode.Companion.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor23);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composer28 = Updater.constructor-impl(composer2);
                                Updater.set-impl(composer28, measurePolicyRowMeasurePolicy16, ComposeUiNode.Companion.getSetMeasurePolicy());
                                Updater.set-impl(composer28, currentCompositionLocalMap23, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                Function2 setCompositeKeyHash23 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                if (composer28.getInserting() || !Intrinsics.areEqual(composer28.rememberedValue(), Integer.valueOf(currentCompositeKeyHash23))) {
                                    composer28.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash23));
                                    composer28.apply(Integer.valueOf(currentCompositeKeyHash23), setCompositeKeyHash23);
                                }
                                Updater.set-impl(composer28, modifierMaterializeModifier23, ComposeUiNode.Companion.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                RowScope rowScope16 = RowScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer2, -990221058, "C1679@101328L2,1678@101258L356,1685@101655L523:BookDetailsDialog.kt#2thlc2");
                                Modifier modifierWeight$default9 = RowScope.weight$default(rowScope16, Modifier.Companion, 1.0f, false, 2, (Object) null);
                                ComposerKt.sourceInformationMarkerStart(composer2, -170488625, "CC(remember):BookDetailsDialog.kt#9igjgp");
                                Object objRememberedValue30 = composer2.rememberedValue();
                                if (objRememberedValue30 == Composer.Companion.getEmpty()) {
                                    objRememberedValue30 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda98
                                        public final Object invoke() {
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue30);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ButtonKt.OutlinedButton((Function0) objRememberedValue30, modifierWeight$default9, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.m210getLambda$2021731365$app(), composer2, 805306758, 504);
                                ButtonKt.Button(function0, RowScope.weight$default(rowScope16, Modifier.Companion, 1.0f, false, 2, (Object) null), false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.m217getLambda$657650659$app(), composer, 805306368, 508);
                                composer2 = composer;
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endReplaceGroup();
                            }
                            composer2.endReplaceGroup();
                            Unit unit13 = Unit.INSTANCE;
                        }
                        break;
                    case -814438578:
                        composer2 = composer;
                        if (!status.equals("REQUESTED")) {
                            composer2.startReplaceGroup(-1965652951);
                            composer2.endReplaceGroup();
                            Unit unit14 = Unit.INSTANCE;
                        } else {
                            composer2.startReplaceGroup(-1870601991);
                            ComposerKt.sourceInformation(composer2, "");
                            if (z2) {
                                composer2.startReplaceGroup(-1870590211);
                                ComposerKt.sourceInformation(composer2, "1597@95809L1227,1616@97073L500");
                                Modifier modifierWeight$default10 = RowScope.weight$default(rowScope, Modifier.Companion, 1.0f, false, 2, (Object) null);
                                Arrangement.Horizontal horizontal17 = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(8.0f));
                                ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                MeasurePolicy measurePolicyRowMeasurePolicy17 = RowKt.rowMeasurePolicy(horizontal17, Alignment.Companion.getTop(), composer2, 6);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash24 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap24 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier24 = ComposedModifierKt.materializeModifier(composer2, modifierWeight$default10);
                                Function0 constructor24 = ComposeUiNode.Companion.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor24);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composer29 = Updater.constructor-impl(composer2);
                                Updater.set-impl(composer29, measurePolicyRowMeasurePolicy17, ComposeUiNode.Companion.getSetMeasurePolicy());
                                Updater.set-impl(composer29, currentCompositionLocalMap24, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                Function2 setCompositeKeyHash24 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                if (composer29.getInserting() || !Intrinsics.areEqual(composer29.rememberedValue(), Integer.valueOf(currentCompositeKeyHash24))) {
                                    composer29.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash24));
                                    composer29.apply(Integer.valueOf(currentCompositeKeyHash24), setCompositeKeyHash24);
                                }
                                Updater.set-impl(composer29, modifierMaterializeModifier24, ComposeUiNode.Companion.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                RowScope rowScope17 = RowScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer2, -766230293, "C1599@96009L2,1598@95939L357,1606@96407L191,1611@96794L11,1611@96744L68,1605@96337L661:BookDetailsDialog.kt#2thlc2");
                                Modifier modifierWeight$default11 = RowScope.weight$default(rowScope17, Modifier.Companion, 1.0f, false, 2, (Object) null);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1825831241, "CC(remember):BookDetailsDialog.kt#9igjgp");
                                Object objRememberedValue31 = composer2.rememberedValue();
                                if (objRememberedValue31 == Composer.Companion.getEmpty()) {
                                    objRememberedValue31 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda91
                                        public final Object invoke() {
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue31);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ButtonKt.OutlinedButton((Function0) objRememberedValue31, modifierWeight$default11, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.getLambda$17787971$app(), composer2, 805306758, 504);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1825818316, "CC(remember):BookDetailsDialog.kt#9igjgp");
                                boolean zChangedInstance13 = composer2.changedInstance(bookViewModel) | composer2.changedInstance(book) | composer2.changed(function1);
                                Object objRememberedValue32 = composer2.rememberedValue();
                                if (zChangedInstance13 || objRememberedValue32 == Composer.Companion.getEmpty()) {
                                    objRememberedValue32 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda93
                                        public final Object invoke() {
                                            return BookDetailsDialogKt.BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$290$lambda$289$lambda$288(bookViewModel, book, function1);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue32);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ButtonKt.OutlinedButton((Function0) objRememberedValue32, RowScope.weight$default(rowScope17, Modifier.Companion, 1.0f, false, 2, (Object) null), false, (Shape) null, ButtonDefaults.INSTANCE.outlinedButtonColors-ro_MJ88(0L, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getError-0d7_KjU(), 0L, 0L, composer2, ButtonDefaults.$stable << 12, 13), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.m188getLambda$1076477652$app(), composer, 805306368, 492);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                composer.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ButtonKt.Button(function0, PaddingKt.padding-qDBjuR0$default(Modifier.Companion, Dp.constructor-impl(8.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null), false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.getLambda$488922089$app(), composer, 805306416, 508);
                                composer2 = composer;
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(-1868783748);
                                ComposerKt.sourceInformation(composer2, "1625@97651L1093");
                                Modifier modifierFillMaxWidth$default21 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
                                Arrangement.Horizontal horizontal18 = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(8.0f));
                                ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                MeasurePolicy measurePolicyRowMeasurePolicy18 = RowKt.rowMeasurePolicy(horizontal18, Alignment.Companion.getTop(), composer2, 6);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash25 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap25 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier25 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default21);
                                Function0 constructor25 = ComposeUiNode.Companion.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor25);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composer30 = Updater.constructor-impl(composer2);
                                Updater.set-impl(composer30, measurePolicyRowMeasurePolicy18, ComposeUiNode.Companion.getSetMeasurePolicy());
                                Updater.set-impl(composer30, currentCompositionLocalMap25, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                Function2 setCompositeKeyHash25 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                if (composer30.getInserting() || !Intrinsics.areEqual(composer30.rememberedValue(), Integer.valueOf(currentCompositeKeyHash25))) {
                                    composer30.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash25));
                                    composer30.apply(Integer.valueOf(currentCompositeKeyHash25), setCompositeKeyHash25);
                                }
                                Updater.set-impl(composer30, modifierMaterializeModifier25, ComposeUiNode.Companion.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                RowScope rowScope18 = RowScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer2, -1301612098, "C1627@97855L2,1626@97785L357,1633@98183L523:BookDetailsDialog.kt#2thlc2");
                                Modifier modifierWeight$default12 = RowScope.weight$default(rowScope18, Modifier.Companion, 1.0f, false, 2, (Object) null);
                                ComposerKt.sourceInformationMarkerStart(composer2, 96561166, "CC(remember):BookDetailsDialog.kt#9igjgp");
                                Object objRememberedValue33 = composer2.rememberedValue();
                                if (objRememberedValue33 == Composer.Companion.getEmpty()) {
                                    objRememberedValue33 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda95
                                        public final Object invoke() {
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue33);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ButtonKt.OutlinedButton((Function0) objRememberedValue33, modifierWeight$default12, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.getLambda$43348698$app(), composer2, 805306758, 504);
                                ButtonKt.Button(function0, RowScope.weight$default(rowScope18, Modifier.Companion, 1.0f, false, 2, (Object) null), false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.getLambda$1407429404$app(), composer, 805306368, 508);
                                composer2 = composer;
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endReplaceGroup();
                            }
                            composer2.endReplaceGroup();
                            Unit unit15 = Unit.INSTANCE;
                        }
                        break;
                    case 2052692649:
                        if (status.equals("AVAILABLE")) {
                            composer.startReplaceGroup(-1872002199);
                            ComposerKt.sourceInformation(composer, "1576@94452L298,1575@94398L554,1587@95156L11,1587@95217L11,1587@95112L138,1585@94985L661");
                            ComposerKt.sourceInformationMarkerStart(composer, 770898627, "CC(remember):BookDetailsDialog.kt#9igjgp");
                            boolean zChangedInstance14 = composer.changedInstance(bookViewModel) | composer.changedInstance(book) | composer.changed(function0);
                            Object objRememberedValue34 = composer.rememberedValue();
                            if (zChangedInstance14 || objRememberedValue34 == Composer.Companion.getEmpty()) {
                                objRememberedValue34 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda90
                                    public final Object invoke() {
                                        return BookDetailsDialogKt.BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$285$lambda$284(bookViewModel, book, function0);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue34);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ButtonKt.Button((Function0) objRememberedValue34, RowScope.weight$default(rowScope, Modifier.Companion, 1.5f, false, 2, (Object) null), false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.m212getLambda$2069959315$app(), composer, 805306368, 508);
                            ButtonKt.Button(function0, RowScope.weight$default(rowScope, Modifier.Companion, 1.0f, false, 2, (Object) null), false, (Shape) null, ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSecondaryContainer-0d7_KjU(), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSecondaryContainer-0d7_KjU(), 0L, 0L, composer, ButtonDefaults.$stable << 12, 12), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.m192getLambda$1220022506$app(), composer, 805306368, 492);
                            composer2 = composer;
                            composer2.endReplaceGroup();
                            Unit unit16 = Unit.INSTANCE;
                            break;
                        }
                    default:
                        composer2 = composer;
                        composer2.startReplaceGroup(-1965652951);
                        composer2.endReplaceGroup();
                        Unit unit17 = Unit.INSTANCE;
                        break;
                }
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

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$240$lambda$239$lambda$238(BookViewModel bookViewModel, Book book, Function0 function0) {
        bookViewModel.deleteBook(book.getId());
        function0.invoke();
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$247$lambda$245$lambda$242$lambda$241(BookViewModel bookViewModel, Book book, Function0 function0) {
        bookViewModel.acceptRequest(book);
        function0.invoke();
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$247$lambda$245$lambda$244$lambda$243(BookViewModel bookViewModel, Book book, Function0 function0) {
        bookViewModel.declineRequest(book);
        function0.invoke();
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$247$lambda$246(Book book, RowScope rowScope, Composer composer, int i) {
        String strSubstringBefore$default;
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1360@78181L96,1361@78318L39,1362@78398L87:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(429251415, i, -1, "com.example.ui.screens.BookDetailsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BookDetailsDialog.kt:1360)");
            }
            IconKt.Icon-ww6aTOc(ChatKt.getChat(Icons.AutoMirrored.Filled.INSTANCE), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            String requestedByName = book.getRequestedByName();
            if (requestedByName == null || (strSubstringBefore$default = StringsKt.substringBefore$default(requestedByName, "@", (String) null, 2, (Object) null)) == null) {
                strSubstringBefore$default = "Reader";
            }
            TextKt.Text--4IGK_g("Chat with Requester (" + strSubstringBefore$default + ")", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$256$lambda$252$lambda$249$lambda$248(ManagedActivityResultLauncher managedActivityResultLauncher, MutableState mutableState) {
        mutableState.setValue("HANDOVER");
        managedActivityResultLauncher.launch((Object) null);
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$256$lambda$252$lambda$251$lambda$250(MutableState mutableState, MutableState mutableState2) {
        mutableState.setValue("HANDOVER");
        BookDetailsDialog$lambda$47(mutableState2, true);
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$256$lambda$255$lambda$254$lambda$253(BookViewModel bookViewModel, Book book, Function0 function0) {
        bookViewModel.cancelHandover(book);
        function0.invoke();
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$262$lambda$261$lambda$258$lambda$257(MutableState mutableState, MutableState mutableState2) {
        mutableState.setValue("HANDOVER");
        BookDetailsDialog$lambda$53(mutableState2, true);
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$262$lambda$261$lambda$260$lambda$259(BookViewModel bookViewModel, Book book, Function0 function0) {
        bookViewModel.cancelHandover(book);
        function0.invoke();
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$267$lambda$266$lambda$263(Book book, RowScope rowScope, Composer composer, int i) {
        String strSubstringBefore$default;
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C1460@85597L96,1461@85738L39,1462@85822L78:BookDetailsDialog.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2090258358, i, -1, "com.example.ui.screens.BookDetailsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BookDetailsDialog.kt:1460)");
            }
            IconKt.Icon-ww6aTOc(ChatKt.getChat(Icons.AutoMirrored.Filled.INSTANCE), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            String borrowerName = book.getBorrowerName();
            if (borrowerName == null || (strSubstringBefore$default = StringsKt.substringBefore$default(borrowerName, "@", (String) null, 2, (Object) null)) == null) {
                strSubstringBefore$default = "Reader";
            }
            TextKt.Text--4IGK_g("Chat Borrower (" + strSubstringBefore$default + ")", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$267$lambda$266$lambda$265$lambda$264(MutableState mutableState, MutableState mutableState2) {
        mutableState.setValue("RETURN");
        BookDetailsDialog$lambda$53(mutableState2, true);
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$283$lambda$270(Book book, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1486@87438L1596:BookDetailsDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1203729963, i, -1, "com.example.ui.screens.BookDetailsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BookDetailsDialog.kt:1486)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
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
            ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1502208775, "C1487@87531L548,1492@88128L40,1501@88911L11,1493@88230L758:BookDetailsDialog.kt#2thlc2");
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier2 = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
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
            ComposerKt.sourceInformationMarkerStart(composer, 261869740, "C1488@87715L11,1488@87637L132,1489@87822L39,1490@87976L10,1490@87914L115:BookDetailsDialog.kt#2thlc2");
            IconKt.Icon-ww6aTOc(CameraAltKt.getCameraAlt(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getTertiary-0d7_KjU(), composer, 432, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextKt.Text--4IGK_g("Borrower's Scanned Return Photo", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelMedium(), composer, 196614, 0, 65502);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            SingletonAsyncImageKt.m108AsyncImagegl8XCv8(book.getReturnImageUrl(), "Return Image", BackgroundKt.background-bw27NRU$default(ClipKt.clip(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(140.0f)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(10.0f))), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), (Shape) null, 2, (Object) null), null, null, null, ContentScale.Companion.getFit(), 0.0f, null, 0, false, null, composer, 1572912, 0, 4024);
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

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$283$lambda$279$lambda$272$lambda$271(MutableState mutableState, MutableState mutableState2) {
        mutableState.setValue("RETURN");
        BookDetailsDialog$lambda$47(mutableState2, true);
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$283$lambda$279$lambda$274$lambda$273(MutableState mutableState, MutableState mutableState2) {
        mutableState.setValue("RETURN");
        BookDetailsDialog$lambda$53(mutableState2, true);
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$283$lambda$279$lambda$276$lambda$275(MutableState mutableState) {
        BookDetailsDialog$lambda$5(mutableState, true);
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$283$lambda$279$lambda$278$lambda$277(MutableState mutableState, MutableState mutableState2) {
        mutableState.setValue(FeedbackTargetType.LENDER_TO_BORROWER);
        BookDetailsDialog$lambda$59(mutableState2, true);
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$283$lambda$282$lambda$281(BookViewModel bookViewModel, Book book, Context context, Function0 function0) {
        bookViewModel.reportStolen(book);
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:admin@bookexchange.exchange.com"));
        intent.putExtra("android.intent.extra.SUBJECT", "Report Overdue/Stolen Book");
        intent.putExtra("android.intent.extra.TEXT", "Hello Admin, the user " + book.getBorrowerName() + " has not returned my book '" + book.getTitle() + "'. Please investigate.");
        context.startActivity(intent);
        function0.invoke();
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$285$lambda$284(BookViewModel bookViewModel, Book book, Function0 function0) {
        bookViewModel.requestBook(book);
        bookViewModel.sendMessage(book.getId(), book.getOwnerName(), "Hi! I just requested to borrow " + book.getTitle() + ".");
        function0.invoke();
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$290$lambda$289$lambda$288(BookViewModel bookViewModel, Book book, Function0 function0) {
        bookViewModel.cancelBorrowRequest(book);
        function0.invoke();
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$298$lambda$295$lambda$294(MutableState mutableState) {
        BookDetailsDialog$lambda$68(mutableState, true);
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$298$lambda$297$lambda$296(BookViewModel bookViewModel, Book book, Function0 function0) {
        bookViewModel.cancelBorrowRequest(book);
        function0.invoke();
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$312$lambda$304(String str, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1706@103094L2099:BookDetailsDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1385832623, i, -1, "com.example.ui.screens.BookDetailsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BookDetailsDialog.kt:1706)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
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
            ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 83724126, "C1707@103191L556,1714@104007L10,1715@104107L11,1712@103800L491,1726@105062L11,1718@104344L799:BookDetailsDialog.kt#2thlc2");
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier2 = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
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
            ComposerKt.sourceInformationMarkerStart(composer, 633101586, "C1708@103378L11,1708@103301L130,1709@103488L39,1710@103640L10,1710@103584L109:BookDetailsDialog.kt#2thlc2");
            IconKt.Icon-ww6aTOc(VerifiedKt.getVerified(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 432, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextKt.Text--4IGK_g("Owner Handover Scan Photo", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelMedium(), composer, 196614, 0, 65502);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            TextStyle bodySmall = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall();
            TextKt.Text--4IGK_g("The owner photographed this book at handover. Verify condition:", PaddingKt.padding-VpY3zN4$default(Modifier.Companion, 0.0f, Dp.constructor-impl(4.0f), 1, (Object) null), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, bodySmall, composer, 54, 0, 65528);
            BookImageDisplayKt.BookImageDisplay(str, "Handover Photo", BackgroundKt.background-bw27NRU$default(ClipKt.clip(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(140.0f)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(10.0f))), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), (Shape) null, 2, (Object) null), ContentScale.Companion.getFit(), null, composer, 3120, 16);
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

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$312$lambda$311$lambda$306$lambda$305(MutableState mutableState, MutableState mutableState2) {
        mutableState.setValue("HANDOVER");
        BookDetailsDialog$lambda$47(mutableState2, true);
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$312$lambda$311$lambda$308$lambda$307(BookViewModel bookViewModel, Book book, Context context, Function0 function0) {
        bookViewModel.acceptTransfer(book);
        Toast.makeText(context, "Handover accepted! Enjoy reading '" + book.getTitle() + "'!", 1).show();
        function0.invoke();
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$312$lambda$311$lambda$310$lambda$309(BookViewModel bookViewModel, Book book, Function0 function0) {
        bookViewModel.cancelHandover(book);
        function0.invoke();
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$317$lambda$316(ManagedActivityResultLauncher managedActivityResultLauncher, MutableState mutableState) {
        mutableState.setValue("BORROWER_RETURN");
        managedActivityResultLauncher.launch((Object) null);
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$319$lambda$318(MutableState mutableState) {
        BookDetailsDialog$lambda$65(mutableState, true);
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$321$lambda$320(MutableState mutableState, MutableState mutableState2) {
        mutableState.setValue(FeedbackTargetType.BORROWER_TO_LENDER_AND_BOOK);
        BookDetailsDialog$lambda$59(mutableState2, true);
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$335$lambda$331$lambda$326$lambda$325(MutableState mutableState, MutableState mutableState2) {
        mutableState.setValue("RETURN");
        BookDetailsDialog$lambda$53(mutableState2, true);
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$335$lambda$331$lambda$328$lambda$327(MutableState mutableState, MutableState mutableState2) {
        mutableState.setValue("RETURN");
        BookDetailsDialog$lambda$47(mutableState2, true);
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$335$lambda$331$lambda$330$lambda$329(BookViewModel bookViewModel, Book book, Function0 function0) {
        bookViewModel.cancelReturn(book);
        function0.invoke();
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$340$lambda$339$lambda$335$lambda$334$lambda$333$lambda$332(MutableState mutableState, MutableState mutableState2) {
        mutableState.setValue(FeedbackTargetType.BORROWER_TO_LENDER_AND_BOOK);
        BookDetailsDialog$lambda$59(mutableState2, true);
        return Unit.INSTANCE;
    }

    public static final void MetadataRow(final String str, String str2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        final String str3;
        Intrinsics.checkNotNullParameter(str, "label");
        Intrinsics.checkNotNullParameter(str2, "value");
        Composer composerStartRestartGroup = composer.startRestartGroup(192519546);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(MetadataRow)1931@118805L542:BookDetailsDialog.kt#2thlc2");
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            str3 = str2;
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(192519546, i2, -1, "com.example.ui.screens.MetadataRow (BookDetailsDialog.kt:1930)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.Companion.getTop(), composerStartRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            Function0 constructor = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composer3 = Updater.constructor-impl(composerStartRestartGroup);
            Updater.set-impl(composer3, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer3, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composer3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composer3.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.set-impl(composer3, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -916187833, "C1937@118993L10,1939@119096L11,1935@118927L207,1943@119209L10,1944@119266L11,1941@119143L198:BookDetailsDialog.kt#2thlc2");
            TextStyle bodyMedium = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodyMedium();
            composer2 = composerStartRestartGroup;
            TextKt.Text--4IGK_g(str, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, bodyMedium, composer2, (i2 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
            str3 = str2;
            TextKt.Text--4IGK_g(str3, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurface-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodyMedium(), composer2, ((i2 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
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
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda45
                public final Object invoke(Object obj, Object obj2) {
                    return BookDetailsDialogKt.MetadataRow$lambda$346(str, str3, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final String toBase64(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, 300, 400, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 70, byteArrayOutputStream);
        String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    public static final void BookConditionPhotoDialog(final Book book, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        final Function0<Unit> function1 = function0;
        Intrinsics.checkNotNullParameter(book, "book");
        Intrinsics.checkNotNullParameter(function1, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(1699764640);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BookConditionPhotoDialog)1962@119823L33,1974@120384L16182,1971@120234L16332:BookDetailsDialog.kt#2thlc2");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(book) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1699764640, i3, -1, "com.example.ui.screens.BookConditionPhotoDialog (BookDetailsDialog.kt:1961)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1386250145, "CC(remember):BookDetailsDialog.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableIntState mutableIntState = (MutableIntState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            String transferImageUrl = book.getTransferImageUrl();
            boolean z = transferImageUrl == null || StringsKt.isBlank(transferImageUrl);
            String returnImageUrl = book.getReturnImageUrl();
            boolean z2 = (z && (returnImageUrl == null || StringsKt.isBlank(returnImageUrl))) ? false : true;
            final String transferImageUrl2 = !z ? book.getTransferImageUrl() : book.getReturnImageUrl();
            final String str = !z ? "Handover Scan" : "Return Scan";
            final boolean z3 = z2;
            function1 = function0;
            composer2 = composerStartRestartGroup;
            AndroidDialog_androidKt.Dialog(function1, new DialogProperties(false, false, false, 3, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(1180140855, true, new Function2() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda76
                public final Object invoke(Object obj, Object obj2) {
                    return BookDetailsDialogKt.BookConditionPhotoDialog$lambda$376(z3, function0, mutableIntState, str, transferImageUrl2, book, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composer2, ((i3 >> 3) & 14) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda77
                public final Object invoke(Object obj, Object obj2) {
                    return BookDetailsDialogKt.BookConditionPhotoDialog$lambda$377(book, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final int BookConditionPhotoDialog$lambda$348(MutableIntState mutableIntState) {
        return ((IntState) mutableIntState).getIntValue();
    }

    static final Unit BookConditionPhotoDialog$lambda$376(final boolean z, final Function0 function0, final MutableIntState mutableIntState, final String str, final String str2, final Book book, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1980@120592L11,1983@120694L15866,1975@120394L16166:BookDetailsDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1180140855, i, -1, "com.example.ui.screens.BookConditionPhotoDialog.<anonymous> (BookDetailsDialog.kt:1975)");
            }
            SurfaceKt.Surface-T9BRK9s(SizeKt.fillMaxHeight(SizeKt.fillMaxWidth(Modifier.Companion, 0.92f), 0.88f), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(24.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, Dp.constructor-impl(6.0f), Dp.constructor-impl(16.0f), (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(1853720274, true, new Function2() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda51
                public final Object invoke(Object obj, Object obj2) {
                    return BookDetailsDialogKt.BookConditionPhotoDialog$lambda$376$lambda$375(z, function0, mutableIntState, str, str2, book, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 12804102, 72);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:109:0x07e1  */
    /* JADX WARN: Code duplicated, block: B:113:0x081d  */
    /* JADX WARN: Code duplicated, block: B:114:0x0850  */
    /* JADX WARN: Code duplicated, block: B:95:0x0757  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r51v0 */
    static final Unit BookConditionPhotoDialog$lambda$376$lambda$375(boolean z, Function0 function0, MutableIntState mutableIntState, final String str, String str2, final Book book, Composer composer, int i) {
        final MutableIntState mutableIntState2;
        ?? r14;
        Triple triple;
        ComposerKt.sourceInformation(composer, "C1984@120708L15842:BookDetailsDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1853720274, i, -1, "com.example.ui.screens.BookConditionPhotoDialog.<anonymous>.<anonymous> (BookDetailsDialog.kt:1984)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(20.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
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
            ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1441227270, "C1989@120855L2518,2041@123391L41,2068@124732L21,2065@124608L11402,2268@136028L41,2273@136235L48,2270@136087L449:BookDetailsDialog.kt#2thlc2");
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
            ComposerKt.sourceInformationMarkerStart(composer, -2124626187, "C1994@121093L1603,2030@122914L11,2026@122718L637:BookDetailsDialog.kt#2thlc2");
            Alignment.Vertical centerVertically2 = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier2 = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer, 48);
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
            Composer composer4 = Updater.constructor-impl(composer);
            Updater.set-impl(composer4, measurePolicyRowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer4, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer4.getInserting() || !Intrinsics.areEqual(composer4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composer4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composer4.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.set-impl(composer4, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope2 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1219585552, "C1995@121171L706,2009@121902L40,2010@121967L707:BookDetailsDialog.kt#2thlc2");
            SurfaceKt.Surface-T9BRK9s(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(36.0f)), RoundedCornerShapeKt.getCircleShape(), Color.copy-wmQWz5c$default(ColorKt.Color(4279994175L), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.m198getLambda$1545109735$app(), composer, 12583302, 120);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f)), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier3 = Modifier.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, modifier3);
            Function0 constructor4 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor4);
            } else {
                composer.useNode();
            }
            Composer composer5 = Updater.constructor-impl(composer);
            Updater.set-impl(composer5, measurePolicyColumnMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer5, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer5.getInserting() || !Intrinsics.areEqual(composer5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composer5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composer5.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.set-impl(composer5, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScope columnScope2 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 878622433, "C2013@122122L10,2015@122262L11,2011@122004L309,2019@122472L10,2017@122342L306:BookDetailsDialog.kt#2thlc2");
            TextKt.Text--4IGK_g("Book Inspection", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleMedium(), composer, 196614, 0, 65498);
            TextKt.Text--4IGK_g("Verified Physical Condition", (Modifier) null, ColorKt.Color(4279994175L), 0L, (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 196998, 0, 65498);
            Composer composer6 = composer;
            ComposerKt.sourceInformationMarkerEnd(composer6);
            ComposerKt.sourceInformationMarkerEnd(composer6);
            composer6.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer6);
            ComposerKt.sourceInformationMarkerEnd(composer6);
            ComposerKt.sourceInformationMarkerEnd(composer6);
            ComposerKt.sourceInformationMarkerEnd(composer6);
            ComposerKt.sourceInformationMarkerEnd(composer6);
            composer6.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer6);
            ComposerKt.sourceInformationMarkerEnd(composer6);
            ComposerKt.sourceInformationMarkerEnd(composer6);
            IconButtonKt.IconButton(function0, BackgroundKt.background-bw27NRU(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(36.0f)), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer6, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, (Object) null), RoundedCornerShapeKt.getCircleShape()), false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.m219getLambda$941734853$app(), composer6, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
            ComposerKt.sourceInformationMarkerEnd(composer6);
            ComposerKt.sourceInformationMarkerEnd(composer6);
            composer6.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer6);
            ComposerKt.sourceInformationMarkerEnd(composer6);
            ComposerKt.sourceInformationMarkerEnd(composer6);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(14.0f)), composer6, 6);
            if (z) {
                composer6.startReplaceGroup(1443373802);
                ComposerKt.sourceInformation(composer6, "2046@123615L11,2047@123715L11,2050@123872L638,2044@123496L1014,2062@124531L41");
                mutableIntState2 = mutableIntState;
                r14 = 1;
                TabRowKt.TabRow-pAZo6Ak(BookConditionPhotoDialog$lambda$348(mutableIntState), ClipKt.clip(Modifier.Companion, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f))), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer6, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, (Object) null), MaterialTheme.INSTANCE.getColorScheme(composer6, MaterialTheme.$stable).getPrimary-0d7_KjU(), (Function3) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.m203getLambda$1728767254$app(), ComposableLambdaKt.rememberComposableLambda(-1070384375, true, new Function2() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda81
                    public final Object invoke(Object obj, Object obj2) {
                        return BookDetailsDialogKt.BookConditionPhotoDialog$lambda$376$lambda$375$lambda$374$lambda$359(mutableIntState2, str, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer6, 54), composer, 1769472, 16);
                composer6 = composer;
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(12.0f)), composer6, 6);
            } else {
                mutableIntState2 = mutableIntState;
                r14 = 1;
                composer6.startReplaceGroup(1320852006);
            }
            composer6.endReplaceGroup();
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(ColumnScope.weight$default(columnScope, Modifier.Companion, 1.0f, false, 2, (Object) null), ScrollKt.rememberScrollState(0, composer6, 0, (int) r14), false, (FlingBehavior) null, false, 14, (Object) null);
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(composer6, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer6, 48);
            ComposerKt.sourceInformationMarkerStart(composer6, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composer6.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer6, modifierVerticalScroll$default);
            Function0 constructor5 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer6, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer6.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer6.startReusableNode();
            if (composer6.getInserting()) {
                composer6.createNode(constructor5);
            } else {
                composer6.useNode();
            }
            Composer composer7 = Updater.constructor-impl(composer6);
            Updater.set-impl(composer7, measurePolicyColumnMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer7, currentCompositionLocalMap5, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash5 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer7.getInserting() || !Intrinsics.areEqual(composer7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                composer7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                composer7.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
            }
            Updater.set-impl(composer7, modifierMaterializeModifier5, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer6, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScope columnScope3 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer6, -753394616, "C2075@125103L11,2080@125352L3397,2073@124989L3760,2135@128771L41,2139@128929L10,2142@129137L11,2137@128834L346,2146@129305L10,2147@129374L11,2144@129201L308,2151@129531L41,2186@131519L1704,2182@131330L1893,2251@135128L41,2252@135190L802:BookDetailsDialog.kt#2thlc2");
            final String imageUrl = (BookConditionPhotoDialog$lambda$348(mutableIntState2) == r14 && z) ? str2 : book.getImageUrl();
            SurfaceKt.Surface-T9BRK9s(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, (int) r14, (Object) null), Dp.constructor-impl(280.0f)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(16.0f)), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer6, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, Dp.constructor-impl(4.0f), (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-817081813, (boolean) r14, new Function2() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda92
                public final Object invoke(Object obj, Object obj2) {
                    return BookDetailsDialogKt.BookConditionPhotoDialog$lambda$376$lambda$375$lambda$374$lambda$373$lambda$363(imageUrl, book, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer6, 54), composer6, 12779526, 88);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), composer6, 6);
            TextKt.Text--4IGK_g(book.getTitle(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer6, MaterialTheme.$stable).getOnSurface-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.box-impl(TextAlign.Companion.getCenter-e0LSkKk()), 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer6, MaterialTheme.$stable).getTitleLarge(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 64986);
            TextKt.Text--4IGK_g("by " + book.getAuthor(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.box-impl(TextAlign.Companion.getCenter-e0LSkKk()), 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 0, 0, 65018);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(14.0f)), composer, 6);
            String condition = book.getCondition();
            if (StringsKt.isBlank(condition)) {
                condition = null;
            }
            if (condition == null) {
                condition = "Good";
            }
            final String upperCase = condition.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            switch (upperCase) {
                case "ACCEPTABLE":
                    triple = new Triple(Color.box-impl(ColorKt.Color(4293284096L)), Color.box-impl(Color.copy-wmQWz5c$default(ColorKt.Color(4293284096L), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), "Fair / Readable: Fully intact text, may have visible cover creasing, notes, or highlights.");
                    break;
                case "NEW":
                    triple = new Triple(Color.box-impl(ColorKt.Color(4281236786L)), Color.box-impl(Color.copy-wmQWz5c$default(ColorKt.Color(4281236786L), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), "Pristine Condition: Looks brand new, unopened, crisp unbent pages with zero markings or shelf wear.");
                    break;
                case "FAIR":
                    triple = new Triple(Color.box-impl(ColorKt.Color(4293284096L)), Color.box-impl(Color.copy-wmQWz5c$default(ColorKt.Color(4293284096L), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), "Fair / Readable: Fully intact text, may have visible cover creasing, notes, or highlights.");
                    break;
                case "GOOD":
                    triple = new Triple(Color.box-impl(ColorKt.Color(4279193906L)), Color.box-impl(Color.copy-wmQWz5c$default(ColorKt.Color(4279994175L), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), "Good Condition: Gently read, clean intact spine, all pages present, may show slight natural paper toning.");
                    break;
                case "MINT":
                    triple = new Triple(Color.box-impl(ColorKt.Color(4281236786L)), Color.box-impl(Color.copy-wmQWz5c$default(ColorKt.Color(4281236786L), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), "Pristine Condition: Looks brand new, unopened, crisp unbent pages with zero markings or shelf wear.");
                    break;
                case "VERY GOOD":
                case "VERY_GOOD":
                    triple = new Triple(Color.box-impl(ColorKt.Color(4279592384L)), Color.box-impl(Color.copy-wmQWz5c$default(ColorKt.Color(4279592384L), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), "Very Good: Minimal shelf handling, no missing pages, tight binding, no dog-ears.");
                    break;
                default:
                    triple = new Triple(Color.box-impl(ColorKt.Color(4284572001L)), Color.box-impl(Color.copy-wmQWz5c$default(ColorKt.Color(4284572001L), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), "Standard reader copy in acceptable condition for exchange.");
                    break;
            }
            final long j = ((Color) triple.component1()).unbox-impl();
            long j2 = ((Color) triple.component2()).unbox-impl();
            final String str3 = (String) triple.component3();
            SurfaceKt.Surface-T9BRK9s(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(16.0f)), j2, 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(498362004, true, new Function2() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda103
                public final Object invoke(Object obj, Object obj2) {
                    return BookDetailsDialogKt.BookConditionPhotoDialog$lambda$376$lambda$375$lambda$374$lambda$373$lambda$368(str3, j, upperCase, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 12582918, 120);
            String remarks = book.getRemarks();
            if (remarks == null || StringsKt.isBlank(remarks)) {
                composer.startReplaceGroup(-877608548);
            } else {
                composer.startReplaceGroup(-745337190);
                ComposerKt.sourceInformation(composer, "2219@133306L41,2223@133558L11,2224@133631L1453,2220@133372L1712");
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(12.0f)), composer, 6);
                SurfaceKt.Surface-T9BRK9s(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(14.0f)), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0.45f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-2065886736, true, new Function2() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda114
                    public final Object invoke(Object obj, Object obj2) {
                        return BookDetailsDialogKt.BookConditionPhotoDialog$lambda$376$lambda$375$lambda$374$lambda$373$lambda$371(book, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer, 54), composer, 12582918, 120);
            }
            composer.endReplaceGroup();
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(12.0f)), composer, 6);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            Arrangement.Horizontal spaceEvenly = Arrangement.INSTANCE.getSpaceEvenly();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(spaceEvenly, Alignment.Companion.getTop(), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default2);
            Function0 constructor6 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
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
            Updater.set-impl(composer8, measurePolicyRowMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer8, currentCompositionLocalMap6, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash6 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer8.getInserting() || !Intrinsics.areEqual(composer8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                composer8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                composer8.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
            }
            Updater.set-impl(composer8, modifierMaterializeModifier6, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope3 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -694078194, "C:BookDetailsDialog.kt#2thlc2");
            if (book.getPageCount() == null || book.getPageCount().intValue() <= 0) {
                composer.startReplaceGroup(-828389632);
            } else {
                composer.startReplaceGroup(-694042638);
                ComposerKt.sourceInformation(composer, "2257@135455L86");
                ConditionMetaPill(AutoStoriesKt.getAutoStories(Icons.INSTANCE.getDefault()), book.getPageCount() + " Pages", composer, 0);
            }
            composer.endReplaceGroup();
            String language = book.getLanguage();
            if (language == null || StringsKt.isBlank(language)) {
                composer.startReplaceGroup(-828389632);
            } else {
                composer.startReplaceGroup(-693841355);
                ComposerKt.sourceInformation(composer, "2260@135658L83");
                ImageVector language2 = LanguageKt.getLanguage(Icons.INSTANCE.getDefault());
                String upperCase2 = book.getLanguage().toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                ConditionMetaPill(language2, upperCase2, composer, 0);
            }
            composer.endReplaceGroup();
            String publishedDate = book.getPublishedDate();
            if (publishedDate == null || StringsKt.isBlank(publishedDate)) {
                composer.startReplaceGroup(-828389632);
            } else {
                composer.startReplaceGroup(-693638057);
                ComposerKt.sourceInformation(composer, "2263@135863L81");
                ConditionMetaPill(CalendarMonthKt.getCalendarMonth(Icons.INSTANCE.getDefault()), book.getPublishedDate(), composer, 0);
            }
            composer.endReplaceGroup();
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
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(12.0f)), composer, 6);
            ButtonKt.Button(function0, SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(48.0f)), false, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(24.0f)), ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(ColorKt.Color(4279994175L), 0L, 0L, 0L, composer, (ButtonDefaults.$stable << 12) | 6, 14), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$BookDetailsDialogKt.INSTANCE.m191getLambda$1196572884$app(), composer, 805306416, 484);
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

    static final Unit BookConditionPhotoDialog$lambda$376$lambda$375$lambda$374$lambda$359(final MutableIntState mutableIntState, final String str, Composer composer, int i) {
        final MutableIntState mutableIntState2;
        ComposerKt.sourceInformation(composer, "C2053@123998L19,2054@124054L101,2051@123898L283,2058@124306L19,2059@124362L100,2056@124206L282:BookDetailsDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1070384375, i, -1, "com.example.ui.screens.BookConditionPhotoDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BookDetailsDialog.kt:2051)");
            }
            boolean z = BookConditionPhotoDialog$lambda$348(mutableIntState) == 0;
            ComposerKt.sourceInformationMarkerStart(composer, -2142196580, "CC(remember):BookDetailsDialog.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda37
                    public final Object invoke() {
                        return BookDetailsDialogKt.BookConditionPhotoDialog$lambda$376$lambda$375$lambda$374$lambda$359$lambda$354$lambda$353(mutableIntState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            TabKt.Tab-wqdebIU(z, (Function0) objRememberedValue, (Modifier) null, false, ComposableLambdaKt.rememberComposableLambda(1049590243, true, new Function2() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda48
                public final Object invoke(Object obj, Object obj2) {
                    return BookDetailsDialogKt.BookConditionPhotoDialog$lambda$376$lambda$375$lambda$374$lambda$359$lambda$355(mutableIntState, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), (Function2) null, 0L, 0L, (MutableInteractionSource) null, composer, 24624, 492);
            boolean z2 = BookConditionPhotoDialog$lambda$348(mutableIntState) == 1;
            ComposerKt.sourceInformationMarkerStart(composer, -2142186724, "CC(remember):BookDetailsDialog.kt#9igjgp");
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                mutableIntState2 = mutableIntState;
                objRememberedValue2 = new Function0() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda59
                    public final Object invoke() {
                        return BookDetailsDialogKt.BookConditionPhotoDialog$lambda$376$lambda$375$lambda$374$lambda$359$lambda$357$lambda$356(mutableIntState2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            } else {
                mutableIntState2 = mutableIntState;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            TabKt.Tab-wqdebIU(z2, (Function0) objRememberedValue2, (Modifier) null, false, ComposableLambdaKt.rememberComposableLambda(-186354868, true, new Function2() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda70
                public final Object invoke(Object obj, Object obj2) {
                    return BookDetailsDialogKt.BookConditionPhotoDialog$lambda$376$lambda$375$lambda$374$lambda$359$lambda$358(str, mutableIntState2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), (Function2) null, 0L, 0L, (MutableInteractionSource) null, composer, 24624, 492);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit BookConditionPhotoDialog$lambda$376$lambda$375$lambda$374$lambda$359$lambda$354$lambda$353(MutableIntState mutableIntState) {
        mutableIntState.setIntValue(0);
        return Unit.INSTANCE;
    }

    static final Unit BookConditionPhotoDialog$lambda$376$lambda$375$lambda$374$lambda$359$lambda$355(MutableIntState mutableIntState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2054@124056L97:BookDetailsDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1049590243, i, -1, "com.example.ui.screens.BookConditionPhotoDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BookDetailsDialog.kt:2054)");
            }
            TextKt.Text--4IGK_g("Original Cover", (Modifier) null, 0L, 0L, (FontStyle) null, BookConditionPhotoDialog$lambda$348(mutableIntState) == 0 ? FontWeight.Companion.getBold() : FontWeight.Companion.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 6, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit BookConditionPhotoDialog$lambda$376$lambda$375$lambda$374$lambda$359$lambda$357$lambda$356(MutableIntState mutableIntState) {
        mutableIntState.setIntValue(1);
        return Unit.INSTANCE;
    }

    static final Unit BookConditionPhotoDialog$lambda$376$lambda$375$lambda$374$lambda$359$lambda$358(String str, MutableIntState mutableIntState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2059@124364L96:BookDetailsDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-186354868, i, -1, "com.example.ui.screens.BookConditionPhotoDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BookDetailsDialog.kt:2059)");
            }
            TextKt.Text--4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, BookConditionPhotoDialog$lambda$348(mutableIntState) == 1 ? FontWeight.Companion.getBold() : FontWeight.Companion.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 0, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit BookConditionPhotoDialog$lambda$376$lambda$375$lambda$374$lambda$373$lambda$363(String str, Book book, Composer composer, int i) {
        Composer composer2 = composer;
        ComposerKt.sourceInformation(composer2, "C2081@125378L3349:BookDetailsDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-817081813, i, -1, "com.example.ui.screens.BookConditionPhotoDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BookDetailsDialog.kt:2081)");
            }
            Alignment center = Alignment.Companion.getCenter();
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null);
            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxSize$default);
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
            Updater.set-impl(composer3, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer3, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composer3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composer3.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.set-impl(composer3, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScope boxScope = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, 2142800769, "C:BookDetailsDialog.kt#2thlc2");
            String str2 = str;
            if (str2 == null || StringsKt.isBlank(str2)) {
                composer2.startReplaceGroup(2145004341);
                ComposerKt.sourceInformation(composer2, "2118@127811L860");
                Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
                Arrangement.Vertical center2 = Arrangement.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                Modifier modifier = Modifier.Companion;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center2, centerHorizontally, composer2, 54);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifier);
                Function0 constructor2 = ComposeUiNode.Companion.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
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
                ComposerKt.sourceInformationMarkerStart(composer2, -256368141, "C2125@128266L11,2122@128056L340,2128@128433L40,2129@128564L10,2129@128608L11,2129@128510L127:BookDetailsDialog.kt#2thlc2");
                IconKt.Icon-ww6aTOc(MenuBookKt.getMenuBook(Icons.AutoMirrored.Filled.INSTANCE), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(54.0f)), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer2, 432, 0);
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer2, 6);
                TextKt.Text--4IGK_g("No Cover Photo Provided", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 65530);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(2142808456);
                ComposerKt.sourceInformation(composer2, "");
                if (StringsKt.startsWith$default(str, "data:image", false, 2, (Object) null)) {
                    composer2.startReplaceGroup(2142866023);
                    ComposerKt.sourceInformation(composer2, "2084@125653L571");
                    ComposerKt.sourceInformationMarkerStart(composer2, 761862028, "CC(remember):BookDetailsDialog.kt#9igjgp");
                    boolean zChanged = composer2.changed(str);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                        try {
                            byte[] bArrDecode = Base64.decode(StringsKt.substringAfter$default(str, "base64,", (String) null, 2, (Object) null), 0);
                            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                            objRememberedValue = bitmapDecodeByteArray != null ? AndroidImageBitmap_androidKt.asImageBitmap(bitmapDecodeByteArray) : null;
                        } catch (Exception unused) {
                            objRememberedValue = null;
                        }
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    ImageBitmap imageBitmap = (ImageBitmap) objRememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (imageBitmap != null) {
                        composer2.startReplaceGroup(2143510699);
                        ComposerKt.sourceInformation(composer2, "2094@126323L534");
                        ImageKt.Image-5h-nEew(imageBitmap, book.getTitle(), ClipKt.clip(PaddingKt.padding-3ABfNKs(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(6.0f)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f))), (Alignment) null, ContentScale.Companion.getFit(), 0.0f, (ColorFilter) null, 0, composer, 24576, 232);
                        composer2 = composer;
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(2144113308);
                        ComposerKt.sourceInformation(composer2, "2104@127023L11,2104@126943L133");
                        IconKt.Icon-ww6aTOc(BrokenImageKt.getBrokenImage(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(48.0f)), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOutline-0d7_KjU(), composer2, 432, 0);
                        composer2.endReplaceGroup();
                    }
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(2144375878);
                    ComposerKt.sourceInformation(composer2, "2107@127192L515");
                    SingletonAsyncImageKt.m108AsyncImagegl8XCv8(str, book.getTitle(), ClipKt.clip(PaddingKt.padding-3ABfNKs(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(6.0f)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f))), null, null, null, ContentScale.Companion.getFit(), 0.0f, null, 0, false, null, composer, 1572864, 0, 4024);
                    composer2 = composer;
                    composer2.endReplaceGroup();
                }
                composer2.endReplaceGroup();
            }
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

    static final Unit BookConditionPhotoDialog$lambda$376$lambda$375$lambda$374$lambda$373$lambda$368(String str, long j, final String str2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2187@131545L1656:BookDetailsDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(498362004, i, -1, "com.example.ui.screens.BookConditionPhotoDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BookDetailsDialog.kt:2187)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(14.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
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
            ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1564254076, "C2188@131618L1216,2209@132863L40,2212@133048L10,2213@133124L11,2210@132932L243:BookDetailsDialog.kt#2thlc2");
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier2 = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
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
            ComposerKt.sourceInformationMarkerStart(composer, -683227191, "C2192@131876L507,2189@131704L679,2201@132416L40,2204@132618L10,2202@132489L315:BookDetailsDialog.kt#2thlc2");
            SurfaceKt.Surface-T9BRK9s((Modifier) null, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(8.0f)), j, 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-103603511, true, new Function2() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda0
                public final Object invoke(Object obj, Object obj2) {
                    return BookDetailsDialogKt.BookConditionPhotoDialog$lambda$376$lambda$375$lambda$374$lambda$373$lambda$368$lambda$367$lambda$366$lambda$365(str2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 12582912, 121);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f)), composer, 6);
            TextKt.Text--4IGK_g("Grading Assessment", (Modifier) null, j, 0L, (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelMedium(), composer, 196614, 0, 65498);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            TextKt.Text--4IGK_g(str, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 0, 0, 65530);
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

    static final Unit BookConditionPhotoDialog$lambda$376$lambda$375$lambda$374$lambda$373$lambda$368$lambda$367$lambda$366$lambda$365(String str, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2196@132114L10,2193@131914L435:BookDetailsDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-103603511, i, -1, "com.example.ui.screens.BookConditionPhotoDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BookDetailsDialog.kt:2193)");
            }
            String strReplace$default = StringsKt.replace$default(str, "_", " ", false, 4, (Object) null);
            long j = Color.Companion.getWhite-0d7_KjU();
            TextStyle labelMedium = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelMedium();
            TextKt.Text--4IGK_g(strReplace$default, PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(8.0f), Dp.constructor-impl(4.0f)), j, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, labelMedium, composer, 197040, 0, 65496);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit BookConditionPhotoDialog$lambda$376$lambda$375$lambda$374$lambda$373$lambda$371(Book book, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2225@133661L1397:BookDetailsDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2065886736, i, -1, "com.example.ui.screens.BookConditionPhotoDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BookDetailsDialog.kt:2225)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(14.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
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
            ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -275632941, "C2226@133738L921,2241@134692L40,2244@134886L10,2245@134966L11,2242@134765L263:BookDetailsDialog.kt#2thlc2");
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier2 = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
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
            ComposerKt.sourceInformationMarkerStart(composer, 1653781436, "C2230@134022L11,2227@133828L324,2233@134189L39,2236@134412L10,2238@134568L11,2234@134265L360:BookDetailsDialog.kt#2thlc2");
            IconKt.Icon-ww6aTOc(InfoKt.getInfo(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 432, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextStyle labelMedium = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelMedium();
            TextKt.Text--4IGK_g("Owner Notes & Copy Specifics", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, labelMedium, composer, 196614, 0, 65498);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextKt.Text--4IGK_g(book.getRemarks(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 0, 0, 65530);
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

    public static final void ConditionMetaPill(final ImageVector imageVector, final String str, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(imageVector, "icon");
        Intrinsics.checkNotNullParameter(str, "label");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1624015307);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ConditionMetaPill)2289@136762L11,2290@136814L457,2287@136680L591:BookDetailsDialog.kt#2thlc2");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(imageVector) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1624015307, i2, -1, "com.example.ui.screens.ConditionMetaPill (BookDetailsDialog.kt:2286)");
            }
            SurfaceKt.Surface-T9BRK9s((Modifier) null, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-611531910, true, new Function2() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda78
                public final Object invoke(Object obj, Object obj2) {
                    return BookDetailsDialogKt.ConditionMetaPill$lambda$379(imageVector, str, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 12582912, 121);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.BookDetailsDialogKt$$ExternalSyntheticLambda79
                public final Object invoke(Object obj, Object obj2) {
                    return BookDetailsDialogKt.ConditionMetaPill$lambda$380(imageVector, str, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final Unit ConditionMetaPill$lambda$379(ImageVector imageVector, String str, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2291@136824L441:BookDetailsDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-611531910, i, -1, "com.example.ui.screens.ConditionMetaPill.<anonymous> (BookDetailsDialog.kt:2291)");
            }
            Modifier modifier = PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(10.0f), Dp.constructor-impl(6.0f));
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
            ComposerKt.sourceInformationMarkerStart(composer, -1251436868, "C2295@137082L11,2295@136990L112,2296@137115L39,2297@137201L10,2297@137167L88:BookDetailsDialog.kt#2thlc2");
            IconKt.Icon-ww6aTOc(imageVector, (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(14.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 432, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextKt.Text--4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
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

    static final Unit BookDetailsDialog$lambda$117$lambda$116$lambda$115$lambda$103$lambda$102(final List list, final MutableState mutableState, LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyRow");
        final BookDetailsDialogKt$BookDetailsDialog$lambda$117$lambda$116$lambda$115$lambda$103$lambda$102$$inlined$items$default$1 bookDetailsDialogKt$BookDetailsDialog$lambda$117$lambda$116$lambda$115$lambda$103$lambda$102$$inlined$items$default$1 = new Function1() { // from class: com.example.ui.screens.BookDetailsDialogKt$BookDetailsDialog$lambda$117$lambda$116$lambda$115$lambda$103$lambda$102$$inlined$items$default$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final Void m169invoke(String str) {
                return null;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m169invoke((String) obj);
            }
        };
        lazyListScope.items(list.size(), (Function1) null, new Function1<Integer, Object>() { // from class: com.example.ui.screens.BookDetailsDialogKt$BookDetailsDialog$lambda$117$lambda$116$lambda$115$lambda$103$lambda$102$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i) {
                return bookDetailsDialogKt$BookDetailsDialog$lambda$117$lambda$116$lambda$115$lambda$103$lambda$102$$inlined$items$default$1.invoke(list.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.screens.BookDetailsDialogKt$BookDetailsDialog$lambda$117$lambda$116$lambda$115$lambda$103$lambda$102$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                ComposerKt.sourceInformation(composer, "C152@7074L22:LazyDsl.kt#428nma");
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if ((i3 & BuildConfig.VERSION_CODE) == 146 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                }
                final String str = (String) list.get(i);
                composer.startReplaceGroup(-934636523);
                ComposerKt.sourceInformation(composer, "C*381@20850L27,382@20919L14,383@21051L11,383@20995L85,379@20727L383:BookDetailsDialog.kt#2thlc2");
                boolean zAreEqual = Intrinsics.areEqual(BookDetailsDialogKt.BookDetailsDialog$lambda$10(mutableState), str);
                ComposerKt.sourceInformationMarkerStart(composer, -722882646, "CC(remember):BookDetailsDialog.kt#9igjgp");
                boolean zChanged = composer.changed(str);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    final MutableState mutableState2 = mutableState;
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.BookDetailsDialogKt$BookDetailsDialog$4$1$1$3$1$1$1$1
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m168invoke();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m168invoke() {
                            mutableState2.setValue(str);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                ChipKt.FilterChip(zAreEqual, (Function0) objRememberedValue, ComposableLambdaKt.rememberComposableLambda(-2066473758, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.ui.screens.BookDetailsDialogKt$BookDetailsDialog$4$1$1$3$1$1$2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i4) {
                        ComposerKt.sourceInformation(composer2, "C382@20921L10:BookDetailsDialog.kt#2thlc2");
                        if ((i4 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2066473758, i4, -1, "com.example.ui.screens.BookDetailsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BookDetailsDialog.kt:382)");
                        }
                        TextKt.Text--4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer2, 0, 0, 131070);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), (Modifier) null, false, (Function2) null, (Function2) null, (Shape) null, FilterChipDefaults.INSTANCE.filterChipColors-XqyqHi0(0L, 0L, 0L, 0L, 0L, 0L, 0L, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), 0L, 0L, 0L, 0L, composer, 0, FilterChipDefaults.$stable << 6, 3967), (SelectableChipElevation) null, (BorderStroke) null, (MutableInteractionSource) null, composer, 384, 0, 3832);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    static final Unit BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$191$lambda$190(final List list, LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyRow");
        final BookDetailsDialogKt$BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$191$lambda$190$$inlined$items$default$1 bookDetailsDialogKt$BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$191$lambda$190$$inlined$items$default$1 = new Function1() { // from class: com.example.ui.screens.BookDetailsDialogKt$BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$191$lambda$190$$inlined$items$default$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final Void m170invoke(String str) {
                return null;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m170invoke((String) obj);
            }
        };
        lazyListScope.items(list.size(), (Function1) null, new Function1<Integer, Object>() { // from class: com.example.ui.screens.BookDetailsDialogKt$BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$191$lambda$190$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i) {
                return bookDetailsDialogKt$BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$191$lambda$190$$inlined$items$default$1.invoke(list.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.screens.BookDetailsDialogKt$BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$191$lambda$190$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                ComposerKt.sourceInformation(composer, "C152@7074L22:LazyDsl.kt#428nma");
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if ((i3 & BuildConfig.VERSION_CODE) == 146 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                }
                final String str = (String) list.get(i);
                composer.startReplaceGroup(-741169990);
                ComposerKt.sourceInformation(composer, "C*965@52631L2,966@52679L13,964@52569L228:BookDetailsDialog.kt#2thlc2");
                ComposerKt.sourceInformationMarkerStart(composer, -1686474937, "CC(remember):BookDetailsDialog.kt#9igjgp");
                BookDetailsDialogKt$BookDetailsDialog$16$1$1$2$4$1$1$1$1 bookDetailsDialogKt$BookDetailsDialog$16$1$1$2$4$1$1$1$1RememberedValue = composer.rememberedValue();
                if (bookDetailsDialogKt$BookDetailsDialog$16$1$1$2$4$1$1$1$1RememberedValue == Composer.Companion.getEmpty()) {
                    bookDetailsDialogKt$BookDetailsDialog$16$1$1$2$4$1$1$1$1RememberedValue = new Function0<Unit>() { // from class: com.example.ui.screens.BookDetailsDialogKt$BookDetailsDialog$16$1$1$2$4$1$1$1$1
                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m167invoke() {
                        }

                        public /* bridge */ /* synthetic */ Object invoke() {
                            m167invoke();
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(bookDetailsDialogKt$BookDetailsDialog$16$1$1$2$4$1$1$1$1RememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                ChipKt.SuggestionChip((Function0) bookDetailsDialogKt$BookDetailsDialog$16$1$1$2$4$1$1$1$1RememberedValue, ComposableLambdaKt.rememberComposableLambda(139578787, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.ui.screens.BookDetailsDialogKt$BookDetailsDialog$16$1$1$2$4$1$1$2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i4) {
                        ComposerKt.sourceInformation(composer2, "C966@52681L9:BookDetailsDialog.kt#2thlc2");
                        if ((i4 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(139578787, i4, -1, "com.example.ui.screens.BookDetailsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BookDetailsDialog.kt:966)");
                        }
                        TextKt.Text--4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer2, 0, 0, 131070);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), (Modifier) null, false, (Function2) null, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(16.0f)), (ChipColors) null, (ChipElevation) null, (BorderStroke) null, (MutableInteractionSource) null, composer, 54, 988);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    private static final User BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$201(State<User> state) {
        return (User) state.getValue();
    }

    private static final List<Review> BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$203(State<? extends List<Review>> state) {
        return (List) state.getValue();
    }

    private static final List<Review> BookDetailsDialog$lambda$343$lambda$342$lambda$341$lambda$237$lambda$223(State<? extends List<Review>> state) {
        return (List) state.getValue();
    }
}
