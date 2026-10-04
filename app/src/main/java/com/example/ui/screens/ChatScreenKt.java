package com.example.ui.screens;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.CalendarContract;
import android.util.Base64;
import android.widget.Toast;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.BackHandlerKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.DarkThemeKt;
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
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.SendKt;
import androidx.compose.material.icons.filled.AutoAwesomeKt;
import androidx.compose.material.icons.filled.BookKt;
import androidx.compose.material.icons.filled.ChevronRightKt;
import androidx.compose.material.icons.filled.InfoKt;
import androidx.compose.material.icons.filled.PlaceKt;
import androidx.compose.material.icons.filled.ScheduleKt;
import androidx.compose.material.icons.filled.SecurityKt;
import androidx.compose.material.icons.filled.VerifiedKt;
import androidx.compose.material.icons.filled.VolumeOffKt;
import androidx.compose.material.icons.filled.VolumeUpKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonElevation;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonColors;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.material3.TopAppBarScrollBehavior;
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
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.profileinstaller.ProfileVerifier;
import coil.compose.SingletonAsyncImageKt;
import com.example.BuildConfig;
import com.example.data.Book;
import com.example.data.Message;
import com.example.data.Review;
import com.example.ui.BookViewModel;
import com.example.util.AudioHelper;
import com.example.util.AudioHelperKt;
import com.example.util.QRCodeHelper;
import com.example.util.QrPayload;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: ChatScreen.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\u0015\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u000b\u001aå\u0001\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\"¨\u0006#²\u0006\n\u0010$\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010%\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\u0010\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'X\u008a\u0084\u0002²\u0006\u0010\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000e0'X\u008a\u0084\u0002²\u0006\f\u0010*\u001a\u0004\u0018\u00010\u000eX\u008a\u0084\u0002²\u0006\f\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u008a\u0084\u0002²\u0006\n\u0010+\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010,\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010-\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010.\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010/\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u00100\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u00101\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u00102\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\f\u00103\u001a\u0004\u0018\u00010\u0003X\u008a\u008e\u0002²\u0006\f\u00104\u001a\u0004\u0018\u000105X\u008a\u008e\u0002²\u0006\f\u00106\u001a\u0004\u0018\u00010\u0003X\u008a\u008e\u0002²\u0006\n\u00107\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\f\u00108\u001a\u0004\u0018\u00010\u0003X\u008a\u008e\u0002²\u0006\f\u00109\u001a\u0004\u0018\u00010\u0003X\u008a\u008e\u0002²\u0006\n\u0010:\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010;\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010<\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\f\u0010=\u001a\u0004\u0018\u00010\u0003X\u008a\u008e\u0002²\u0006\n\u0010>\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010?\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\f\u0010@\u001a\u0004\u0018\u00010\u0003X\u008a\u008e\u0002²\u0006\f\u0010A\u001a\u0004\u0018\u00010\u0003X\u008a\u008e\u0002²\u0006\n\u0010B\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010C\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010D\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010E\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010F\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\u0010\u0010G\u001a\b\u0012\u0004\u0012\u00020H0'X\u008a\u0084\u0002"}, d2 = {"ChatScreen", "", "bookId", "", "viewModel", "Lcom/example/ui/BookViewModel;", "onBack", "Lkotlin/Function0;", "(Ljava/lang/String;Lcom/example/ui/BookViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "PartnerAvatarCircle", "name", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "ExchangeHubBar", "book", "Lcom/example/data/Book;", "isOwner", "", "currentUser", "requesterRating", "", "requesterReviewCount", "", "onRequestBook", "onAcceptRequest", "onDeclineRequest", "onStartHandoverScan", "onShowHandoverQr", "onScanHandoverQr", "onAcceptTransfer", "onStartReturnScan", "onShowReturnQr", "onScanReturnQr", "onAcceptReturn", "onSafeMeetupClick", "(Lcom/example/data/Book;ZLjava/lang/String;Ljava/lang/Float;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "app", "hasAcceptedGuidelines", "showGuidelinesDialog", "messages", "", "Lcom/example/data/Message;", "allBooks", "directBook", "showBookDetailsDialog", "showConditionPhotoViewer", "showSafeMeetupDialog", "isSpeaking", "showQrDisplayDialog", "qrDisplayType", "showQrScannerDialog", "qrScannerType", "scanMode", "capturedPhotoBitmap", "Landroid/graphics/Bitmap;", "capturedPhotoBase64", "isAnalyzingAi", "aiConditionResult", "aiAssessmentResult", "showPhotoAiPreviewDialog", "showMutualFeedbackDialog", "otherUserName", "otherUserPhoto", "messageText", "isSending", "aiSuggestion", "aiMeetingRecommendation", "aiProcessing", "showViolationDialog", "violationReason", "showConfirmTransferDialog", "confirmTransferRawQr", "requesterReviews", "Lcom/example/data/Review;"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class ChatScreenKt {
    static final Unit ChatScreen$lambda$273(String str, BookViewModel bookViewModel, Function0 function0, int i, Composer composer, int i2) {
        ChatScreen(str, bookViewModel, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit ExchangeHubBar$lambda$293(Book book, boolean z, String str, Float f, int i, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, Function0 function5, Function0 function6, Function0 function7, Function0 function8, Function0 function9, Function0 function10, Function0 function11, int i2, int i3, int i4, Composer composer, int i5) {
        ExchangeHubBar(book, z, str, f, i, function0, function1, function2, function3, function4, function5, function6, function7, function8, function9, function10, function11, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    static final Unit PartnerAvatarCircle$lambda$276(String str, int i, Composer composer, int i2) {
        PartnerAvatarCircle(str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:185:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:190:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:196:0x0601  */
    /* JADX WARN: Code duplicated, block: B:80:0x01f9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v36 */
    public static final void ChatScreen(final String str, final BookViewModel bookViewModel, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Object next;
        boolean z;
        Object obj;
        Composer composer2;
        MutableState mutableState;
        MutableState mutableState2;
        MutableState mutableState3;
        MutableState mutableState4;
        MutableState mutableState5;
        Book book;
        String string;
        Object next2;
        Object next3;
        String ownerName;
        String borrowerName;
        String ownerProfilePicUrl;
        State state;
        String str2;
        SharedPreferences sharedPreferences;
        Object obj2;
        final BookViewModel bookViewModel2;
        final SharedPreferences sharedPreferences2;
        Composer composer3;
        State state2;
        State state3;
        String str3;
        State state4;
        MutableState mutableState6;
        MutableState mutableState7;
        String str4;
        final MutableState mutableState8;
        boolean z2;
        Composer composer4;
        Composer composer5;
        String str5;
        boolean z3;
        final MutableState mutableState9;
        Book book2;
        int i3;
        boolean z4;
        final MutableState mutableState10;
        String str6;
        final BookViewModel bookViewModel3;
        final Book book3;
        Composer composer6;
        int i4;
        Object obj3;
        Composer composer7;
        MutableState mutableState11;
        Context context;
        Context context2;
        Composer composer8;
        MutableState mutableState12;
        final MutableState mutableState13;
        MutableState mutableState14;
        Book book4;
        MutableState mutableState15;
        ?? r8;
        Composer composer9;
        final MutableState mutableState16;
        final BookViewModel bookViewModel4;
        final MutableState mutableState17;
        final MutableState mutableState18;
        String strSubstringBefore$default;
        String strValueOf;
        String string2;
        final String str7 = str;
        final BookViewModel bookViewModel5 = bookViewModel;
        Intrinsics.checkNotNullParameter(str7, "bookId");
        Intrinsics.checkNotNullParameter(bookViewModel5, "viewModel");
        Intrinsics.checkNotNullParameter(function0, "onBack");
        Composer composerStartRestartGroup = composer.startRestartGroup(704824078);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ChatScreen)P(!1,2)75@3191L7,76@3215L100,77@3349L80,78@3462L51,80@3538L50,81@3622L37,82@3699L16,84@3797L46,85@3881L30,88@4003L16,91@4163L34,92@4234L34,93@4301L34,95@4359L21,96@4403L34,98@4470L34,99@4530L39,100@4601L34,101@4661L39,102@4721L42,103@4795L59,104@4886L42,105@4954L34,106@5018L42,107@5091L42,108@5170L34,109@5241L34,111@5302L24,115@5512L1074,113@5384L1202,143@6613L733,158@7377L380,166@7784L172,170@7997L479,170@7966L510,185@8533L579,185@8482L630,200@9154L596,216@9782L39,218@9846L31,219@9899L34,221@9959L42,222@10037L42,223@10104L34,225@10169L481,225@10144L506,243@10739L34,244@10801L31,246@10859L59,422@18173L34,423@18240L31,654@31095L21,659@31267L6320,767@37594L58728,657@31197L65125:ChatScreen.kt#2thlc2");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str7) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(bookViewModel5) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i2 & BuildConfig.VERSION_CODE) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            bookViewModel4 = bookViewModel5;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(704824078, i2, -1, "com.example.ui.screens.ChatScreen (ChatScreen.kt:74)");
            }
            CompositionLocal localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final Context context3 = (Context) objConsume;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1268887310, "CC(remember):ChatScreen.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = context3.getSharedPreferences("book_borrow_prefs", 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SharedPreferences sharedPreferences3 = (SharedPreferences) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1268883042, "CC(remember):ChatScreen.kt#9igjgp");
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(sharedPreferences3.getBoolean("accepted_chat_guidelines", false)), (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState19 = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1268879455, "CC(remember):ChatScreen.kt#9igjgp");
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(!ChatScreen$lambda$2(mutableState19)), (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            MutableState mutableState20 = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1268877024, "CC(remember):ChatScreen.kt#9igjgp");
            int i5 = i2 & 14;
            boolean z5 = i5 == 4;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z5 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = bookViewModel5.getMessages(str7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final State stateCollectAsState = SnapshotStateKt.collectAsState((StateFlow) objRememberedValue4, CollectionsKt.emptyList(), (CoroutineContext) null, composerStartRestartGroup, 48, 2);
            Iterator<T> it = ChatScreen$lambda$9(SnapshotStateKt.collectAsState(bookViewModel5.getAllBooks(), (CoroutineContext) null, composerStartRestartGroup, 0, 1)).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((Book) next).getId(), str7));
            Book bookChatScreen$lambda$12 = (Book) next;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1268868740, "CC(remember):ChatScreen.kt#9igjgp");
            Object[] objArr = i5 == 4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objArr != false || objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = bookViewModel5.getBook(str7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            State stateCollectAsState2 = SnapshotStateKt.collectAsState((StateFlow) objRememberedValue5, (Object) null, (CoroutineContext) null, composerStartRestartGroup, 48, 2);
            if (bookChatScreen$lambda$12 == null) {
                bookChatScreen$lambda$12 = ChatScreen$lambda$12(stateCollectAsState2);
            }
            final Book book5 = bookChatScreen$lambda$12;
            State stateCollectAsState3 = SnapshotStateKt.collectAsState(bookViewModel5.getCurrentUser(), (CoroutineContext) null, composerStartRestartGroup, 0, 1);
            if (book5 != null) {
                String string3 = StringsKt.trim(book5.getOwnerName()).toString();
                String strChatScreen$lambda$13 = ChatScreen$lambda$13(stateCollectAsState3);
                if (strChatScreen$lambda$13 == null || (string2 = StringsKt.trim(strChatScreen$lambda$13).toString()) == null) {
                    string2 = "";
                }
                if (StringsKt.equals(string3, string2, true)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1268857040, "CC(remember):ChatScreen.kt#9igjgp");
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == Composer.Companion.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            MutableState mutableState21 = (MutableState) objRememberedValue6;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1268854768, "CC(remember):ChatScreen.kt#9igjgp");
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == Composer.Companion.getEmpty()) {
                objRememberedValue7 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            MutableState mutableState22 = (MutableState) objRememberedValue7;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1268852624, "CC(remember):ChatScreen.kt#9igjgp");
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == Composer.Companion.getEmpty()) {
                objRememberedValue8 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            final MutableState mutableState23 = (MutableState) objRememberedValue8;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final AudioHelper audioHelperRememberAudioHelper = AudioHelperKt.rememberAudioHelper(composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1268849360, "CC(remember):ChatScreen.kt#9igjgp");
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue9 == Composer.Companion.getEmpty()) {
                objRememberedValue9 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            final MutableState mutableState24 = (MutableState) objRememberedValue9;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1268847216, "CC(remember):ChatScreen.kt#9igjgp");
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue10 == Composer.Companion.getEmpty()) {
                objRememberedValue10 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            final MutableState mutableState25 = (MutableState) objRememberedValue10;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1268845291, "CC(remember):ChatScreen.kt#9igjgp");
            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue11 == Composer.Companion.getEmpty()) {
                objRememberedValue11 = SnapshotStateKt.mutableStateOf$default("HANDOVER", (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
            }
            final MutableState mutableState26 = (MutableState) objRememberedValue11;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1268843024, "CC(remember):ChatScreen.kt#9igjgp");
            Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue12 == Composer.Companion.getEmpty()) {
                objRememberedValue12 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
            }
            final MutableState mutableState27 = (MutableState) objRememberedValue12;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1268841099, "CC(remember):ChatScreen.kt#9igjgp");
            Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue13 == Composer.Companion.getEmpty()) {
                objRememberedValue13 = SnapshotStateKt.mutableStateOf$default("HANDOVER", (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
            }
            final MutableState mutableState28 = (MutableState) objRememberedValue13;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1268839176, "CC(remember):ChatScreen.kt#9igjgp");
            Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue14 == Composer.Companion.getEmpty()) {
                objRememberedValue14 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
            }
            final MutableState mutableState29 = (MutableState) objRememberedValue14;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1268836791, "CC(remember):ChatScreen.kt#9igjgp");
            Object objRememberedValue15 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue15 == Composer.Companion.getEmpty()) {
                objRememberedValue15 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
            }
            final MutableState mutableState30 = (MutableState) objRememberedValue15;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1268833896, "CC(remember):ChatScreen.kt#9igjgp");
            Object objRememberedValue16 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue16 == Composer.Companion.getEmpty()) {
                objRememberedValue16 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue16);
            }
            final MutableState mutableState31 = (MutableState) objRememberedValue16;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1268831728, "CC(remember):ChatScreen.kt#9igjgp");
            Object objRememberedValue17 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue17 == Composer.Companion.getEmpty()) {
                objRememberedValue17 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue17);
            }
            final MutableState mutableState32 = (MutableState) objRememberedValue17;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1268829672, "CC(remember):ChatScreen.kt#9igjgp");
            Object objRememberedValue18 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue18 == Composer.Companion.getEmpty()) {
                objRememberedValue18 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue18);
            }
            final MutableState mutableState33 = (MutableState) objRememberedValue18;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1268827336, "CC(remember):ChatScreen.kt#9igjgp");
            Object objRememberedValue19 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue19 == Composer.Companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default);
                objRememberedValue19 = mutableStateMutableStateOf$default;
            }
            final MutableState mutableState34 = (MutableState) objRememberedValue19;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1268824816, "CC(remember):ChatScreen.kt#9igjgp");
            Object objRememberedValue20 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue20 == Composer.Companion.getEmpty()) {
                objRememberedValue20 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue20);
            }
            final MutableState mutableState35 = (MutableState) objRememberedValue20;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1268822544, "CC(remember):ChatScreen.kt#9igjgp");
            Object objRememberedValue21 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue21 == Composer.Companion.getEmpty()) {
                objRememberedValue21 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue21);
            }
            final MutableState mutableState36 = (MutableState) objRememberedValue21;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
            Object objRememberedValue22 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue22 == Composer.Companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                objRememberedValue22 = compositionScopedCoroutineScopeCanceller;
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue22).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ActivityResultContract takePicturePreview = new ActivityResultContracts.TakePicturePreview();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1268812832, "CC(remember):ChatScreen.kt#9igjgp");
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(book5) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(bookViewModel5);
            Object objRememberedValue23 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue23 == Composer.Companion.getEmpty()) {
                composer2 = composerStartRestartGroup;
                obj = new Function1() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda33
                    public final Object invoke(Object obj4) {
                        return ChatScreenKt.ChatScreen$lambda$63$lambda$62(book5, coroutineScope, mutableState30, mutableState31, mutableState35, mutableState32, mutableState33, mutableState34, bookViewModel5, (Bitmap) obj4);
                    }
                };
                mutableState = mutableState30;
                mutableState2 = mutableState31;
                mutableState3 = mutableState32;
                mutableState4 = mutableState33;
                mutableState5 = mutableState34;
                bookViewModel5 = bookViewModel5;
                book = book5;
                composer2.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue23;
                composer2 = composerStartRestartGroup;
                mutableState2 = mutableState31;
                mutableState = mutableState30;
                mutableState3 = mutableState32;
                mutableState5 = mutableState34;
                mutableState4 = mutableState33;
                book = book5;
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            final ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(takePicturePreview, (Function1) obj, composer2, 0);
            List<Message> listChatScreen$lambda$8 = ChatScreen$lambda$8(stateCollectAsState);
            String strChatScreen$lambda$14 = ChatScreen$lambda$13(stateCollectAsState3);
            ComposerKt.sourceInformationMarkerStart(composer2, -1268777941, r10);
            boolean zChanged = composer2.changed(listChatScreen$lambda$8) | composer2.changed(book) | composer2.changed(strChatScreen$lambda$14);
            Object objRememberedValue24 = composer2.rememberedValue();
            if (zChanged || objRememberedValue24 == Composer.Companion.getEmpty()) {
                String strChatScreen$lambda$15 = ChatScreen$lambda$13(stateCollectAsState3);
                if (strChatScreen$lambda$15 == null || (string = StringsKt.trim(strChatScreen$lambda$15).toString()) == null) {
                    string = r4;
                }
                Iterator<T> it2 = ChatScreen$lambda$8(stateCollectAsState).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    Message message = (Message) next2;
                    if (!StringsKt.equals(StringsKt.trim(message.getSender()).toString(), string, true) && !StringsKt.isBlank(message.getSender())) {
                        break;
                    }
                }
                Message message2 = (Message) next2;
                Iterator<T> it3 = ChatScreen$lambda$8(stateCollectAsState).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                    Message message3 = (Message) next3;
                    if (!StringsKt.equals(StringsKt.trim(message3.getReceiver()).toString(), string, true) && !StringsKt.isBlank(message3.getReceiver())) {
                        break;
                    }
                }
                Message message4 = (Message) next3;
                if (message2 != null) {
                    ownerName = message2.getSender();
                } else if (message4 != null) {
                    ownerName = message4.getReceiver();
                } else if (book != null && z) {
                    String requestedByName = book.getRequestedByName();
                    if (requestedByName == null) {
                        borrowerName = book.getBorrowerName();
                        if (borrowerName != null || StringsKt.isBlank(borrowerName)) {
                            requestedByName = null;
                        } else {
                            requestedByName = borrowerName;
                        }
                        if (requestedByName == null) {
                            ownerName = r4;
                        }
                    } else {
                        if (StringsKt.isBlank(requestedByName)) {
                            requestedByName = null;
                        }
                        if (requestedByName == null) {
                            borrowerName = book.getBorrowerName();
                            if (borrowerName != null) {
                                requestedByName = null;
                            } else {
                                requestedByName = null;
                            }
                            if (requestedByName == null) {
                                ownerName = r4;
                            }
                        }
                    }
                    ownerName = requestedByName;
                } else if (book != null) {
                    ownerName = book.getOwnerName();
                } else {
                    ownerName = r4;
                }
                composer2.updateRememberedValue(ownerName);
                objRememberedValue24 = ownerName;
            }
            final String str8 = (String) objRememberedValue24;
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerStart(composer2, -1268753846, r10);
            Object objRememberedValue25 = composer2.rememberedValue();
            if (objRememberedValue25 == Composer.Companion.getEmpty()) {
                if (book != null && !z && !StringsKt.isBlank(book.getOwnerDisplayName())) {
                    strSubstringBefore$default = book.getOwnerDisplayName();
                } else if (!StringsKt.isBlank(str8)) {
                    strSubstringBefore$default = StringsKt.substringBefore$default(str8, "@", (String) null, 2, (Object) null);
                    if (strSubstringBefore$default.length() > 0) {
                        StringBuilder sb = new StringBuilder();
                        char cCharAt = strSubstringBefore$default.charAt(0);
                        if (Character.isLowerCase(cCharAt)) {
                            Locale locale = Locale.getDefault();
                            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                            strValueOf = CharsKt.titlecase(cCharAt, locale);
                        } else {
                            strValueOf = String.valueOf(cCharAt);
                        }
                        StringBuilder sbAppend = sb.append((Object) strValueOf);
                        String strSubstring = strSubstringBefore$default.substring(1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        strSubstringBefore$default = sbAppend.append(strSubstring).toString();
                    }
                } else {
                    strSubstringBefore$default = "Reader";
                }
                objRememberedValue25 = SnapshotStateKt.mutableStateOf$default(strSubstringBefore$default, (SnapshotMutationPolicy) null, 2, (Object) null);
                composer2.updateRememberedValue(objRememberedValue25);
            }
            MutableState mutableState37 = (MutableState) objRememberedValue25;
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerStart(composer2, -1268741030, r10);
            boolean zChanged2 = composer2.changed(str8) | composer2.changed(book);
            Object objRememberedValue26 = composer2.rememberedValue();
            if (zChanged2 || objRememberedValue26 == Composer.Companion.getEmpty()) {
                objRememberedValue26 = SnapshotStateKt.mutableStateOf$default((z || book == null || (ownerProfilePicUrl = book.getOwnerProfilePicUrl()) == null || StringsKt.isBlank(ownerProfilePicUrl)) ? null : book.getOwnerProfilePicUrl(), (SnapshotMutationPolicy) null, 2, (Object) null);
                composer2.updateRememberedValue(objRememberedValue26);
            }
            final MutableState mutableState38 = (MutableState) objRememberedValue26;
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerStart(composer2, -1268733907, r10);
            boolean zChanged3 = composer2.changed(str8) | composer2.changedInstance(bookViewModel5) | composer2.changed(mutableState38);
            ChatScreenKt$ChatScreen$1$1 chatScreenKt$ChatScreen$1$1RememberedValue = composer2.rememberedValue();
            if (zChanged3 || chatScreenKt$ChatScreen$1$1RememberedValue == Composer.Companion.getEmpty()) {
                chatScreenKt$ChatScreen$1$1RememberedValue = new ChatScreenKt$ChatScreen$1$1(str8, bookViewModel5, mutableState37, mutableState38, null);
                composer2.updateRememberedValue(chatScreenKt$ChatScreen$1$1RememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            EffectsKt.LaunchedEffect(str8, (Function2) chatScreenKt$ChatScreen$1$1RememberedValue, composer2, 0);
            Integer numValueOf = Integer.valueOf(ChatScreen$lambda$8(stateCollectAsState).size());
            String strChatScreen$lambda$16 = ChatScreen$lambda$13(stateCollectAsState3);
            ComposerKt.sourceInformationMarkerStart(composer2, -1268716655, r10);
            boolean zChanged4 = (i5 == 4) | composer2.changed(stateCollectAsState) | composer2.changedInstance(sharedPreferences3) | composer2.changed(stateCollectAsState3) | composer2.changedInstance(bookViewModel5);
            ChatScreenKt$ChatScreen$2$1 chatScreenKt$ChatScreen$2$1RememberedValue = composer2.rememberedValue();
            if (zChanged4 || chatScreenKt$ChatScreen$2$1RememberedValue == Composer.Companion.getEmpty()) {
                state = stateCollectAsState3;
                str2 = "";
                sharedPreferences = sharedPreferences3;
                chatScreenKt$ChatScreen$2$1RememberedValue = new ChatScreenKt$ChatScreen$2$1(str, sharedPreferences, bookViewModel5, stateCollectAsState, state, null);
                composer2.updateRememberedValue(chatScreenKt$ChatScreen$2$1RememberedValue);
            } else {
                str2 = "";
                sharedPreferences = sharedPreferences3;
                state = stateCollectAsState3;
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Composer composer10 = composer2;
            SharedPreferences sharedPreferences4 = sharedPreferences;
            final State state5 = state;
            EffectsKt.LaunchedEffect(str, numValueOf, strChatScreen$lambda$16, (Function2) chatScreenKt$ChatScreen$2$1RememberedValue, composer10, i5);
            ComposerKt.sourceInformationMarkerStart(composer10, -1268696766, r10);
            boolean zChanged5 = (i5 == 4) | composer10.changed(stateCollectAsState) | composer10.changedInstance(sharedPreferences4) | composer10.changed(state5) | composer10.changedInstance(bookViewModel5) | ((i2 & 896) == 256);
            Object objRememberedValue27 = composer10.rememberedValue();
            if (zChanged5 || objRememberedValue27 == Composer.Companion.getEmpty()) {
                bookViewModel2 = bookViewModel5;
                sharedPreferences2 = sharedPreferences4;
                composer3 = composer10;
                obj2 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda5
                    public final Object invoke() {
                        return ChatScreenKt.ChatScreen$lambda$80$lambda$79(str, sharedPreferences2, bookViewModel2, function0, stateCollectAsState, state5);
                    }
                };
                state2 = stateCollectAsState;
                state3 = state5;
                composer3.updateRememberedValue(obj2);
            } else {
                state3 = state5;
                sharedPreferences2 = sharedPreferences4;
                state2 = stateCollectAsState;
                composer3 = composer10;
                obj2 = objRememberedValue27;
                bookViewModel2 = bookViewModel5;
            }
            final Function0 function1 = (Function0) obj2;
            ComposerKt.sourceInformationMarkerEnd(composer3);
            BackHandlerKt.BackHandler(false, function1, composer3, 0, 1);
            ComposerKt.sourceInformationMarkerStart(composer3, -1268675187, r10);
            Object objRememberedValue28 = composer3.rememberedValue();
            if (objRememberedValue28 == Composer.Companion.getEmpty()) {
                objRememberedValue28 = SnapshotStateKt.mutableStateOf$default(str2, (SnapshotMutationPolicy) null, 2, (Object) null);
                composer3.updateRememberedValue(objRememberedValue28);
            }
            final MutableState mutableState39 = (MutableState) objRememberedValue28;
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerStart(composer3, -1268673488, r10);
            Object objRememberedValue29 = composer3.rememberedValue();
            if (objRememberedValue29 == Composer.Companion.getEmpty()) {
                objRememberedValue29 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composer3.updateRememberedValue(objRememberedValue29);
            }
            final MutableState mutableState40 = (MutableState) objRememberedValue29;
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerStart(composer3, -1268671560, r10);
            Object objRememberedValue30 = composer3.rememberedValue();
            if (objRememberedValue30 == Composer.Companion.getEmpty()) {
                objRememberedValue30 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composer3.updateRememberedValue(objRememberedValue30);
            }
            MutableState mutableState41 = (MutableState) objRememberedValue30;
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerStart(composer3, -1268669064, r10);
            Object objRememberedValue31 = composer3.rememberedValue();
            if (objRememberedValue31 == Composer.Companion.getEmpty()) {
                objRememberedValue31 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                composer3.updateRememberedValue(objRememberedValue31);
            }
            final MutableState mutableState42 = (MutableState) objRememberedValue31;
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerStart(composer3, -1268666928, r10);
            Object objRememberedValue32 = composer3.rememberedValue();
            if (objRememberedValue32 == Composer.Companion.getEmpty()) {
                objRememberedValue32 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composer3.updateRememberedValue(objRememberedValue32);
            }
            MutableState mutableState43 = (MutableState) objRememberedValue32;
            ComposerKt.sourceInformationMarkerEnd(composer3);
            List<Message> listChatScreen$lambda$9 = ChatScreen$lambda$8(state2);
            ComposerKt.sourceInformationMarkerStart(composer3, -1268664401, r10);
            boolean zChanged6 = (r1 == 4) | composer3.changed(state2) | composer3.changedInstance(bookViewModel2) | composer3.changed(state3);
            ChatScreenKt$ChatScreen$3$1 chatScreenKt$ChatScreen$3$1RememberedValue = composer3.rememberedValue();
            if (zChanged6 || chatScreenKt$ChatScreen$3$1RememberedValue == Composer.Companion.getEmpty()) {
                State state6 = state2;
                str3 = str2;
                state4 = state6;
                mutableState6 = mutableState37;
                mutableState7 = mutableState41;
                chatScreenKt$ChatScreen$3$1RememberedValue = new ChatScreenKt$ChatScreen$3$1(bookViewModel2, str, state6, mutableState43, state3, mutableState37, mutableState41, mutableState42, null);
                composer3.updateRememberedValue(chatScreenKt$ChatScreen$3$1RememberedValue);
            } else {
                state4 = state2;
                mutableState6 = mutableState37;
                mutableState7 = mutableState41;
                str3 = str2;
            }
            ComposerKt.sourceInformationMarkerEnd(composer3);
            EffectsKt.LaunchedEffect(listChatScreen$lambda$9, (Function2) chatScreenKt$ChatScreen$3$1RememberedValue, composer3, 0);
            ComposerKt.sourceInformationMarkerStart(composer3, -1268646608, r10);
            Object objRememberedValue33 = composer3.rememberedValue();
            if (objRememberedValue33 == Composer.Companion.getEmpty()) {
                objRememberedValue33 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composer3.updateRememberedValue(objRememberedValue33);
            }
            final MutableState mutableState44 = (MutableState) objRememberedValue33;
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerStart(composer3, -1268644627, r10);
            Object objRememberedValue34 = composer3.rememberedValue();
            if (objRememberedValue34 == Composer.Companion.getEmpty()) {
                objRememberedValue34 = SnapshotStateKt.mutableStateOf$default(str3, (SnapshotMutationPolicy) null, 2, (Object) null);
                composer3.updateRememberedValue(objRememberedValue34);
            }
            final MutableState mutableState45 = (MutableState) objRememberedValue34;
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerStart(composer3, -1268642743, r10);
            Object objRememberedValue35 = composer3.rememberedValue();
            if (objRememberedValue35 == Composer.Companion.getEmpty()) {
                objRememberedValue35 = new SimpleDateFormat("HH:mm", Locale.getDefault());
                composer3.updateRememberedValue(objRememberedValue35);
            }
            final SimpleDateFormat simpleDateFormat = (SimpleDateFormat) objRememberedValue35;
            ComposerKt.sourceInformationMarkerEnd(composer3);
            if (!ChatScreen$lambda$5(mutableState20)) {
                str4 = r10;
                mutableState8 = mutableState20;
                z2 = true;
                composer4 = composer3;
                composer4.startReplaceGroup(-683994316);
            } else {
                composer3.startReplaceGroup(-672989967);
                ComposerKt.sourceInformation(composer3, "251@11034L189,312@14174L377,250@10990L3571");
                ComposerKt.sourceInformationMarkerStart(composer3, -1268637013, r10);
                boolean zChangedInstance2 = composer3.changedInstance(sharedPreferences2);
                Object objRememberedValue36 = composer3.rememberedValue();
                if (zChangedInstance2 || objRememberedValue36 == Composer.Companion.getEmpty()) {
                    mutableState18 = mutableState19;
                    mutableState8 = mutableState20;
                    objRememberedValue36 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda7
                        public final Object invoke() {
                            return ChatScreenKt.ChatScreen$lambda$105$lambda$104(sharedPreferences2, mutableState8, mutableState18);
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue36);
                } else {
                    mutableState18 = mutableState19;
                    mutableState8 = mutableState20;
                }
                ComposerKt.sourceInformationMarkerEnd(composer3);
                str4 = "CC(remember):ChatScreen.kt#9igjgp";
                Composer composer11 = composer3;
                z2 = true;
                AndroidAlertDialog_androidKt.AlertDialog-Oix01E0((Function0) objRememberedValue36, ComposableLambdaKt.rememberComposableLambda(-1179168229, true, new Function2() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda8
                    public final Object invoke(Object obj4, Object obj5) {
                        return ChatScreenKt.ChatScreen$lambda$108(sharedPreferences2, mutableState8, mutableState18, (Composer) obj4, ((Integer) obj5).intValue());
                    }
                }, composer3, 54), (Modifier) null, (Function2) null, ComposableSingletons$ChatScreenKt.INSTANCE.m264getLambda$91579490$app(), ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$1702605855$app(), ComposableSingletons$ChatScreenKt.INSTANCE.m261getLambda$798176096$app(), (Shape) null, 0L, 0L, 0L, 0L, 0.0f, (DialogProperties) null, composer11, 1794096, 0, 16268);
                composer4 = composer11;
            }
            composer4.endReplaceGroup();
            if (!ChatScreen$lambda$98(mutableState44)) {
                composer5 = composer4;
                composer5.startReplaceGroup(-683994316);
            } else {
                composer4.startReplaceGroup(-669408165);
                ComposerKt.sourceInformation(composer4, "329@14682L31,373@16717L288,346@15338L1349,328@14638L2377");
                ComposerKt.sourceInformationMarkerStart(composer4, -1268520435, str4);
                Object objRememberedValue37 = composer4.rememberedValue();
                if (objRememberedValue37 == Composer.Companion.getEmpty()) {
                    objRememberedValue37 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda9
                        public final Object invoke() {
                            return ChatScreenKt.ChatScreen$lambda$110$lambda$109(mutableState44);
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue37);
                }
                ComposerKt.sourceInformationMarkerEnd(composer4);
                Composer composer12 = composer4;
                AndroidAlertDialog_androidKt.AlertDialog-Oix01E0((Function0) objRememberedValue37, ComposableLambdaKt.rememberComposableLambda(-746568124, z2, new Function2() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda10
                    public final Object invoke(Object obj4, Object obj5) {
                        return ChatScreenKt.ChatScreen$lambda$113(mutableState44, (Composer) obj4, ((Integer) obj5).intValue());
                    }
                }, composer4, 54), (Modifier) null, (Function2) null, ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$749157127$app(), ComposableSingletons$ChatScreenKt.INSTANCE.m249getLambda$1615579320$app(), ComposableLambdaKt.rememberComposableLambda(314651529, z2, new Function2() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda12
                    public final Object invoke(Object obj4, Object obj5) {
                        return ChatScreenKt.ChatScreen$lambda$116(mutableState45, (Composer) obj4, ((Integer) obj5).intValue());
                    }
                }, composer4, 54), (Shape) null, 0L, 0L, 0L, 0L, 0.0f, (DialogProperties) null, composer12, 1794102, 0, 16268);
                composer5 = composer12;
            }
            composer5.endReplaceGroup();
            if (!ChatScreen$lambda$15(mutableState21) || book == 0) {
                str5 = str4;
                z3 = z;
                mutableState9 = mutableState21;
                book2 = book;
                i3 = -683994316;
                z4 = false;
                composer5.startReplaceGroup(-683994316);
            } else {
                composer5.startReplaceGroup(-667050615);
                ComposerKt.sourceInformation(composer5, "390@17259L33,391@17320L33,385@17080L283");
                String strChatScreen$lambda$17 = ChatScreen$lambda$13(state3);
                if (strChatScreen$lambda$17 == null) {
                    strChatScreen$lambda$17 = str3;
                }
                ComposerKt.sourceInformationMarkerStart(composer5, -1268437969, str4);
                Object objRememberedValue38 = composer5.rememberedValue();
                if (objRememberedValue38 == Composer.Companion.getEmpty()) {
                    mutableState9 = mutableState21;
                    objRememberedValue38 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda13
                        public final Object invoke() {
                            return ChatScreenKt.ChatScreen$lambda$118$lambda$117(mutableState9);
                        }
                    };
                    composer5.updateRememberedValue(objRememberedValue38);
                } else {
                    mutableState9 = mutableState21;
                }
                Function0 function2 = (Function0) objRememberedValue38;
                ComposerKt.sourceInformationMarkerEnd(composer5);
                ComposerKt.sourceInformationMarkerStart(composer5, -1268436017, str4);
                Object objRememberedValue39 = composer5.rememberedValue();
                if (objRememberedValue39 == Composer.Companion.getEmpty()) {
                    objRememberedValue39 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda14
                        public final Object invoke() {
                            return ChatScreenKt.ChatScreen$lambda$120$lambda$119(mutableState9);
                        }
                    };
                    composer5.updateRememberedValue(objRememberedValue39);
                }
                ComposerKt.sourceInformationMarkerEnd(composer5);
                str5 = str4;
                Book book6 = book;
                i3 = -683994316;
                z4 = false;
                boolean z6 = z;
                BookDetailsDialogKt.BookDetailsDialog(book6, z6, strChatScreen$lambda$17, bookViewModel, function2, (Function0) objRememberedValue39, composer5, ((i2 << 6) & 7168) | 221184, 0);
                book2 = book6;
                z3 = z6;
            }
            composer5.endReplaceGroup();
            if (!ChatScreen$lambda$18(mutableState22) || book2 == null) {
                mutableState10 = mutableState22;
                str6 = str5;
                composer5.startReplaceGroup(i3);
            } else {
                composer5.startReplaceGroup(-666707445);
                ComposerKt.sourceInformation(composer5, "398@17506L36,396@17431L121");
                str6 = str5;
                ComposerKt.sourceInformationMarkerStart(composer5, -1268430062, str6);
                Object objRememberedValue40 = composer5.rememberedValue();
                if (objRememberedValue40 == Composer.Companion.getEmpty()) {
                    mutableState10 = mutableState22;
                    objRememberedValue40 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda15
                        public final Object invoke() {
                            return ChatScreenKt.ChatScreen$lambda$122$lambda$121(mutableState10);
                        }
                    };
                    composer5.updateRememberedValue(objRememberedValue40);
                } else {
                    mutableState10 = mutableState22;
                }
                ComposerKt.sourceInformationMarkerEnd(composer5);
                BookDetailsDialogKt.BookConditionPhotoDialog(book2, (Function0) objRememberedValue40, composer5, 48);
            }
            composer5.endReplaceGroup();
            if (!ChatScreen$lambda$21(mutableState23) || book2 == null) {
                bookViewModel3 = bookViewModel;
                composer5.startReplaceGroup(i3);
            } else {
                composer5.startReplaceGroup(-666494816);
                ComposerKt.sourceInformation(composer5, "409@17828L32,404@17642L228");
                String title = book2.getTitle();
                ComposerKt.sourceInformationMarkerStart(composer5, -1268419762, str6);
                Object objRememberedValue41 = composer5.rememberedValue();
                if (objRememberedValue41 == Composer.Companion.getEmpty()) {
                    objRememberedValue41 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda44
                        public final Object invoke() {
                            return ChatScreenKt.ChatScreen$lambda$124$lambda$123(mutableState23);
                        }
                    };
                    composer5.updateRememberedValue(objRememberedValue41);
                }
                ComposerKt.sourceInformationMarkerEnd(composer5);
                Composer composer13 = composer5;
                SafeMeetupDialogKt.SafeMeetupDialog(str, title, str8, bookViewModel, (Function0) objRememberedValue41, composer13, i5 | 24576 | ((i2 << 6) & 7168));
                bookViewModel3 = bookViewModel;
                composer5 = composer13;
            }
            composer5.endReplaceGroup();
            if (!ChatScreen$lambda$27(mutableState25) || book2 == null) {
                book3 = book2;
                composer6 = composer5;
                composer6.startReplaceGroup(i3);
            } else {
                composer5.startReplaceGroup(-666207167);
                ComposerKt.sourceInformation(composer5, "418@18087L31,414@17933L195");
                String strChatScreen$lambda$30 = ChatScreen$lambda$30(mutableState26);
                String strChatScreen$lambda$18 = ChatScreen$lambda$13(state3);
                if (strChatScreen$lambda$18 == null) {
                    strChatScreen$lambda$18 = str3;
                }
                ComposerKt.sourceInformationMarkerStart(composer5, -1268411475, str6);
                Object objRememberedValue42 = composer5.rememberedValue();
                if (objRememberedValue42 == Composer.Companion.getEmpty()) {
                    objRememberedValue42 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda55
                        public final Object invoke() {
                            return ChatScreenKt.ChatScreen$lambda$126$lambda$125(mutableState25);
                        }
                    };
                    composer5.updateRememberedValue(objRememberedValue42);
                }
                ComposerKt.sourceInformationMarkerEnd(composer5);
                book3 = book2;
                QRCodeDisplayDialogKt.QRCodeDisplayDialog(book3, strChatScreen$lambda$30, strChatScreen$lambda$18, (Function0) objRememberedValue42, composer5, 3072);
                composer6 = composer5;
            }
            composer6.endReplaceGroup();
            ComposerKt.sourceInformationMarkerStart(composer6, -1268408720, str6);
            Object objRememberedValue43 = composer6.rememberedValue();
            if (objRememberedValue43 == Composer.Companion.getEmpty()) {
                i4 = 2;
                objRememberedValue43 = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z4), (SnapshotMutationPolicy) null, 2, (Object) null);
                composer6.updateRememberedValue(objRememberedValue43);
            } else {
                i4 = 2;
            }
            final MutableState mutableState46 = (MutableState) objRememberedValue43;
            ComposerKt.sourceInformationMarkerEnd(composer6);
            ComposerKt.sourceInformationMarkerStart(composer6, -1268406579, str6);
            Object objRememberedValue44 = composer6.rememberedValue();
            if (objRememberedValue44 == Composer.Companion.getEmpty()) {
                obj3 = null;
                objRememberedValue44 = SnapshotStateKt.mutableStateOf$default(str3, (SnapshotMutationPolicy) null, i4, (Object) null);
                composer6.updateRememberedValue(objRememberedValue44);
            } else {
                obj3 = null;
            }
            final MutableState mutableState47 = (MutableState) objRememberedValue44;
            ComposerKt.sourceInformationMarkerEnd(composer6);
            if (!ChatScreen$lambda$128(mutableState46) || book3 == null) {
                composer7 = composer6;
                mutableState11 = mutableState28;
                context = context3;
                composer7.startReplaceGroup(i3);
            } else {
                composer6.startReplaceGroup(-665792573);
                ComposerKt.sourceInformation(composer6, "429@18463L535,438@19024L37,426@18357L714");
                String strChatScreen$lambda$36 = ChatScreen$lambda$36(mutableState28);
                ComposerKt.sourceInformationMarkerStart(composer6, -1268398939, str6);
                boolean zChangedInstance3 = composer6.changedInstance(bookViewModel3) | composer6.changedInstance(book3) | composer6.changedInstance(context3);
                Object objRememberedValue45 = composer6.rememberedValue();
                if (zChangedInstance3 || objRememberedValue45 == Composer.Companion.getEmpty()) {
                    Function0 function3 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda66
                        public final Object invoke() {
                            return ChatScreenKt.ChatScreen$lambda$134$lambda$133(bookViewModel3, book3, context3, mutableState46, mutableState28, mutableState47);
                        }
                    };
                    context = context3;
                    mutableState11 = mutableState28;
                    composer6.updateRememberedValue(function3);
                    objRememberedValue45 = function3;
                } else {
                    context = context3;
                    mutableState11 = mutableState28;
                }
                Function0 function4 = (Function0) objRememberedValue45;
                ComposerKt.sourceInformationMarkerEnd(composer6);
                ComposerKt.sourceInformationMarkerStart(composer6, -1268381485, str6);
                Object objRememberedValue46 = composer6.rememberedValue();
                if (objRememberedValue46 == Composer.Companion.getEmpty()) {
                    objRememberedValue46 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda77
                        public final Object invoke() {
                            return ChatScreenKt.ChatScreen$lambda$136$lambda$135(mutableState46);
                        }
                    };
                    composer6.updateRememberedValue(objRememberedValue46);
                }
                ComposerKt.sourceInformationMarkerEnd(composer6);
                composer7 = composer6;
                QRScannerDialogKt.ConfirmTransferDialog(book3, strChatScreen$lambda$36, function4, (Function0) objRememberedValue46, composer7, 3072);
            }
            composer7.endReplaceGroup();
            if (!ChatScreen$lambda$33(mutableState27) || book3 == null) {
                context2 = context;
                composer8 = composer7;
                mutableState12 = mutableState11;
                mutableState13 = mutableState27;
                composer8.startReplaceGroup(i3);
            } else {
                composer7.startReplaceGroup(-664997206);
                ComposerKt.sourceInformation(composer7, "446@19244L617,457@19887L31,443@19134L794");
                String strChatScreen$lambda$37 = ChatScreen$lambda$36(mutableState11);
                ComposerKt.sourceInformationMarkerStart(composer7, -1268373865, str6);
                boolean zChangedInstance4 = composer7.changedInstance(book3) | composer7.changedInstance(context);
                Object objRememberedValue47 = composer7.rememberedValue();
                if (zChangedInstance4 || objRememberedValue47 == Composer.Companion.getEmpty()) {
                    final Context context4 = context;
                    final MutableState mutableState48 = mutableState11;
                    final Book book7 = book3;
                    objRememberedValue47 = new Function1() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda83
                        public final Object invoke(Object obj4) {
                            return ChatScreenKt.ChatScreen$lambda$138$lambda$137(book7, context4, mutableState48, mutableState27, mutableState47, mutableState46, (String) obj4);
                        }
                    };
                    context2 = context4;
                    mutableState12 = mutableState48;
                    mutableState13 = mutableState27;
                    composer7.updateRememberedValue(objRememberedValue47);
                } else {
                    context2 = context;
                    mutableState12 = mutableState11;
                    mutableState13 = mutableState27;
                }
                Function1 function5 = (Function1) objRememberedValue47;
                ComposerKt.sourceInformationMarkerEnd(composer7);
                ComposerKt.sourceInformationMarkerStart(composer7, -1268353875, str6);
                Object objRememberedValue48 = composer7.rememberedValue();
                if (objRememberedValue48 == Composer.Companion.getEmpty()) {
                    objRememberedValue48 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda84
                        public final Object invoke() {
                            return ChatScreenKt.ChatScreen$lambda$140$lambda$139(mutableState13);
                        }
                    };
                    composer7.updateRememberedValue(objRememberedValue48);
                }
                ComposerKt.sourceInformationMarkerEnd(composer7);
                QRScannerDialogKt.QRScannerDialog(book3, strChatScreen$lambda$37, function5, (Function0) objRememberedValue48, composer7, 3072);
                composer8 = composer7;
            }
            composer8.endReplaceGroup();
            if (!ChatScreen$lambda$57(mutableState35) || ChatScreen$lambda$42(mutableState) == null || book3 == null) {
                mutableState14 = mutableState13;
                book4 = book3;
                mutableState15 = mutableState26;
                r8 = 1;
                composer9 = composer8;
                mutableState16 = mutableState29;
                composer9.startReplaceGroup(i3);
            } else {
                composer8.startReplaceGroup(-663793786);
                ComposerKt.sourceInformation(composer8, "463@20093L97,467@20201L10864,462@20054L11011");
                ComposerKt.sourceInformationMarkerStart(composer8, -1268347217, str6);
                Object objRememberedValue49 = composer8.rememberedValue();
                if (objRememberedValue49 == Composer.Companion.getEmpty()) {
                    mutableState17 = mutableState35;
                    objRememberedValue49 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda1
                        public final Object invoke() {
                            return ChatScreenKt.ChatScreen$lambda$142$lambda$141(mutableState17, mutableState29);
                        }
                    };
                    composer8.updateRememberedValue(objRememberedValue49);
                } else {
                    mutableState17 = mutableState35;
                }
                Function0 function6 = (Function0) objRememberedValue49;
                ComposerKt.sourceInformationMarkerEnd(composer8);
                Composer composer14 = composer8;
                mutableState16 = mutableState29;
                final Book book8 = book3;
                final MutableState mutableState49 = mutableState17;
                mutableState14 = mutableState13;
                final Context context5 = context2;
                final MutableState mutableState50 = mutableState;
                final MutableState mutableState51 = mutableState2;
                final MutableState mutableState52 = mutableState3;
                final MutableState mutableState53 = mutableState4;
                final MutableState mutableState54 = mutableState5;
                Function2 function7 = new Function2() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda2
                    public final Object invoke(Object obj4, Object obj5) {
                        return ChatScreenKt.ChatScreen$lambda$162(mutableState16, mutableState49, mutableState50, mutableState52, mutableState53, mutableState54, book8, bookViewModel, context5, mutableState51, mutableState26, mutableState25, (Composer) obj4, ((Integer) obj5).intValue());
                    }
                };
                book4 = book8;
                mutableState15 = mutableState26;
                mutableState25 = mutableState25;
                r8 = 1;
                AndroidDialog_androidKt.Dialog(function6, (DialogProperties) null, ComposableLambdaKt.rememberComposableLambda(217556830, true, function7, composer14, 54), composer14, 390, 2);
                composer9 = composer14;
            }
            composer9.endReplaceGroup();
            final boolean zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composer9, z4 ? 1 : 0);
            final long jColor = ColorKt.Color(zIsSystemInDarkTheme ? 4278916122L : 4293913314L);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, (int) r8, (Object) null);
            final MutableState mutableState55 = mutableState9;
            final State state7 = state4;
            final State state8 = state3;
            final MutableState mutableState56 = mutableState6;
            final Book book9 = book4;
            Function2 function2RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1083001398, (boolean) r8, new Function2() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda3
                public final Object invoke(Object obj4, Object obj5) {
                    return ChatScreenKt.ChatScreen$lambda$179(mutableState38, mutableState56, book9, function1, state7, state8, audioHelperRememberAudioHelper, mutableState24, mutableState23, mutableState55, mutableState8, (Composer) obj4, ((Integer) obj5).intValue());
                }
            }, composer9, 54);
            final Book book10 = book4;
            final MutableState mutableState57 = mutableState16;
            Composer composer15 = composer9;
            final MutableState mutableState58 = mutableState15;
            final MutableState mutableState59 = mutableState12;
            final MutableState mutableState60 = mutableState8;
            final boolean z7 = z3;
            final MutableState mutableState61 = mutableState14;
            final Context context6 = context2;
            final MutableState mutableState62 = mutableState10;
            final MutableState mutableState63 = mutableState6;
            final MutableState mutableState64 = mutableState7;
            final MutableState mutableState65 = mutableState25;
            bookViewModel4 = bookViewModel;
            str7 = str;
            ScaffoldKt.Scaffold-TvnljyQ(modifierFillMaxSize$default, function2RememberComposableLambda, (Function2) null, (Function2) null, (Function2) null, 0, 0L, 0L, (WindowInsets) null, ComposableLambdaKt.rememberComposableLambda(1341646239, true, new Function3() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda4
                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                    return ChatScreenKt.ChatScreen$lambda$272(jColor, book10, bookViewModel, z7, context6, managedActivityResultLauncherRememberLauncherForActivityResult, zIsSystemInDarkTheme, state7, state8, simpleDateFormat, mutableState55, mutableState62, mutableState57, mutableState58, mutableState65, mutableState59, mutableState61, mutableState36, mutableState23, mutableState60, mutableState63, mutableState39, mutableState42, mutableState64, str8, str, mutableState40, mutableState45, mutableState44, (PaddingValues) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                }
            }, composer15, 54), composer15, 805306422, 508);
            composerStartRestartGroup = composer15;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda6
                public final Object invoke(Object obj4, Object obj5) {
                    return ChatScreenKt.ChatScreen$lambda$273(str7, bookViewModel4, function0, i, (Composer) obj4, ((Integer) obj5).intValue());
                }
            });
        }
    }

    private static final boolean ChatScreen$lambda$2(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void ChatScreen$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean ChatScreen$lambda$5(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void ChatScreen$lambda$6(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean ChatScreen$lambda$15(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void ChatScreen$lambda$16(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean ChatScreen$lambda$18(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void ChatScreen$lambda$19(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean ChatScreen$lambda$21(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void ChatScreen$lambda$22(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean ChatScreen$lambda$24(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void ChatScreen$lambda$25(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean ChatScreen$lambda$27(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void ChatScreen$lambda$28(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String ChatScreen$lambda$30(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final boolean ChatScreen$lambda$33(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void ChatScreen$lambda$34(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String ChatScreen$lambda$36(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final String ChatScreen$lambda$39(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final Bitmap ChatScreen$lambda$42(MutableState<Bitmap> mutableState) {
        return (Bitmap) ((State) mutableState).getValue();
    }

    private static final String ChatScreen$lambda$45(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final boolean ChatScreen$lambda$48(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChatScreen$lambda$49(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String ChatScreen$lambda$51(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final String ChatScreen$lambda$54(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final boolean ChatScreen$lambda$57(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void ChatScreen$lambda$58(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean ChatScreen$lambda$60(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void ChatScreen$lambda$61(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    static final Unit ChatScreen$lambda$63$lambda$62(Book book, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, BookViewModel bookViewModel, Bitmap bitmap) {
        if (bitmap != null && book != null) {
            String base64 = BookDetailsDialogKt.toBase64(bitmap);
            mutableState.setValue(bitmap);
            mutableState2.setValue(base64);
            ChatScreen$lambda$58(mutableState3, true);
            ChatScreen$lambda$49(mutableState4, true);
            mutableState5.setValue(null);
            mutableState6.setValue(null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new ChatScreenKt$ChatScreen$takePictureLauncher$1$1$1(bookViewModel, book, base64, mutableState5, mutableState6, mutableState4, null), 3, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ChatScreen$lambda$71(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final String ChatScreen$lambda$74(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    static final Unit ChatScreen$lambda$80$lambda$79(String str, SharedPreferences sharedPreferences, BookViewModel bookViewModel, Function0 function0, State state, State state2) {
        Long l;
        String id;
        if (!StringsKt.isBlank(str)) {
            Iterator<T> it = ChatScreen$lambda$8(state).iterator();
            if (it.hasNext()) {
                Long lValueOf = Long.valueOf(((Message) it.next()).getTimestamp());
                while (it.hasNext()) {
                    Long lValueOf2 = Long.valueOf(((Message) it.next()).getTimestamp());
                    if (lValueOf.compareTo(lValueOf2) < 0) {
                        lValueOf = lValueOf2;
                    }
                }
                l = lValueOf;
            } else {
                l = null;
            }
            Long l2 = l;
            long jLongValue = l2 != null ? l2.longValue() : 0L;
            Message message = (Message) CollectionsKt.lastOrNull(ChatScreen$lambda$8(state));
            if (message == null || (id = message.getId()) == null) {
                id = "";
            }
            sharedPreferences.edit().putLong("chat_last_read_" + str, Math.max(System.currentTimeMillis(), jLongValue) + 2000).putString("chat_last_read_msg_id_" + str, id).commit();
            String strChatScreen$lambda$13 = ChatScreen$lambda$13(state2);
            if (strChatScreen$lambda$13 != null && !StringsKt.isBlank(strChatScreen$lambda$13)) {
                String strChatScreen$lambda$14 = ChatScreen$lambda$13(state2);
                Intrinsics.checkNotNull(strChatScreen$lambda$14);
                bookViewModel.markMessagesAsRead(str, strChatScreen$lambda$14);
            }
        }
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final String ChatScreen$lambda$82(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final boolean ChatScreen$lambda$85(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void ChatScreen$lambda$86(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String ChatScreen$lambda$88(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final String ChatScreen$lambda$91(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChatScreen$lambda$95(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean ChatScreen$lambda$98(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void ChatScreen$lambda$99(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String ChatScreen$lambda$101(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    static final Unit ChatScreen$lambda$105$lambda$104(SharedPreferences sharedPreferences, MutableState mutableState, MutableState mutableState2) {
        ChatScreen$lambda$6(mutableState, false);
        ChatScreen$lambda$3(mutableState2, true);
        sharedPreferences.edit().putBoolean("accepted_chat_guidelines", true).apply();
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$108(final SharedPreferences sharedPreferences, final MutableState mutableState, final MutableState mutableState2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C314@14230L219,313@14192L345:ChatScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1179168229, i, -1, "com.example.ui.screens.ChatScreen.<anonymous> (ChatScreen.kt:313)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, 690700086, "CC(remember):ChatScreen.kt#9igjgp");
            boolean zChangedInstance = composer.changedInstance(sharedPreferences);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda0
                    public final Object invoke() {
                        return ChatScreenKt.ChatScreen$lambda$108$lambda$107$lambda$106(sharedPreferences, mutableState, mutableState2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ButtonKt.Button((Function0) objRememberedValue, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$1397593611$app(), composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$108$lambda$107$lambda$106(SharedPreferences sharedPreferences, MutableState mutableState, MutableState mutableState2) {
        ChatScreen$lambda$6(mutableState, false);
        ChatScreen$lambda$3(mutableState2, true);
        sharedPreferences.edit().putBoolean("accepted_chat_guidelines", true).apply();
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$110$lambda$109(MutableState mutableState) {
        ChatScreen$lambda$99(mutableState, false);
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$116(final MutableState mutableState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C347@15356L1317:ChatScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(314651529, i, -1, "com.example.ui.screens.ChatScreen.<anonymous> (ChatScreen.kt:347)");
            }
            Arrangement.Vertical vertical = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(8.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier = Modifier.Companion;
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
            ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 364988320, "C350@15595L10,348@15435L203,353@15714L11,356@15900L413,352@15659L654,367@16494L10,368@16562L11,365@16334L321:ChatScreen.kt#2thlc2");
            TextKt.Text--4IGK_g("Your message was blocked because it violates community safety guidelines:", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 6, 0, 65534);
            long j = Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getErrorContainer-0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
            SurfaceKt.Surface-T9BRK9s(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(8.0f)), j, 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-1984711014, true, new Function2() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda22
                public final Object invoke(Object obj, Object obj2) {
                    return ChatScreenKt.ChatScreen$lambda$116$lambda$115$lambda$114(mutableState, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 12582918, 120);
            TextKt.Text--4IGK_g("⚠️ Penalty Applied: 10 Trust Points have been deducted from your profile.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 196614, 0, 65498);
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

    static final Unit ChatScreen$lambda$116$lambda$115$lambda$114(MutableState mutableState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C359@16041L10,360@16113L11,357@15926L365:ChatScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1984711014, i, -1, "com.example.ui.screens.ChatScreen.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:357)");
            }
            TextKt.Text--4IGK_g("\"" + ChatScreen$lambda$101(mutableState) + "\"", PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnErrorContainer-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 196656, 0, 65496);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$113(final MutableState mutableState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C375@16773L31,376@16894L11,376@16850L62,374@16735L256:ChatScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-746568124, i, -1, "com.example.ui.screens.ChatScreen.<anonymous> (ChatScreen.kt:374)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, -192426909, "CC(remember):ChatScreen.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda81
                    public final Object invoke() {
                        return ChatScreenKt.ChatScreen$lambda$113$lambda$112$lambda$111(mutableState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ButtonKt.Button((Function0) objRememberedValue, (Modifier) null, false, (Shape) null, ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU(), 0L, 0L, 0L, composer, ButtonDefaults.$stable << 12, 14), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$1620397620$app(), composer, 805306374, 494);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$113$lambda$112$lambda$111(MutableState mutableState) {
        ChatScreen$lambda$99(mutableState, false);
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$118$lambda$117(MutableState mutableState) {
        ChatScreen$lambda$16(mutableState, false);
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$120$lambda$119(MutableState mutableState) {
        ChatScreen$lambda$16(mutableState, false);
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$122$lambda$121(MutableState mutableState) {
        ChatScreen$lambda$19(mutableState, false);
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$124$lambda$123(MutableState mutableState) {
        ChatScreen$lambda$22(mutableState, false);
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$126$lambda$125(MutableState mutableState) {
        ChatScreen$lambda$28(mutableState, false);
        return Unit.INSTANCE;
    }

    private static final boolean ChatScreen$lambda$128(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void ChatScreen$lambda$129(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String ChatScreen$lambda$131(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    static final Unit ChatScreen$lambda$134$lambda$133(BookViewModel bookViewModel, Book book, Context context, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        String message;
        ChatScreen$lambda$129(mutableState, false);
        Object objM166verifyReturnQrgIAlus = Intrinsics.areEqual(ChatScreen$lambda$36(mutableState2), "RETURN") ? bookViewModel.m166verifyReturnQrgIAlus(book, ChatScreen$lambda$131(mutableState3)) : bookViewModel.m165verifyHandoverQrgIAlus(book, ChatScreen$lambda$131(mutableState3));
        if (Result.isSuccess-impl(objM166verifyReturnQrgIAlus)) {
            Toast.makeText(context, "Transfer confirmed successfully!", 1).show();
        } else {
            Throwable th = Result.exceptionOrNull-impl(objM166verifyReturnQrgIAlus);
            if (th == null || (message = th.getMessage()) == null) {
                message = "Failed";
            }
            Toast.makeText(context, message, 1).show();
        }
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$136$lambda$135(MutableState mutableState) {
        ChatScreen$lambda$129(mutableState, false);
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$138$lambda$137(Book book, Context context, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, String str) {
        Intrinsics.checkNotNullParameter(str, "raw");
        QrPayload qrPayload = QRCodeHelper.INSTANCE.parseQrPayload(str);
        if (qrPayload != null && StringsKt.equals(qrPayload.getBookId(), book.getId(), true) && (Intrinsics.areEqual(qrPayload.getType(), ChatScreen$lambda$36(mutableState)) || Intrinsics.areEqual(qrPayload.getType(), "RETURN") || Intrinsics.areEqual(qrPayload.getType(), "HANDOVER"))) {
            ChatScreen$lambda$34(mutableState2, false);
            mutableState3.setValue(str);
            ChatScreen$lambda$129(mutableState4, true);
        } else {
            ChatScreen$lambda$34(mutableState2, false);
            Toast.makeText(context, "Invalid QR Code for this transfer.", 1).show();
        }
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$140$lambda$139(MutableState mutableState) {
        ChatScreen$lambda$34(mutableState, false);
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$142$lambda$141(MutableState mutableState, MutableState mutableState2) {
        ChatScreen$lambda$58(mutableState, false);
        mutableState2.setValue(null);
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$162(final MutableState mutableState, final MutableState mutableState2, final MutableState mutableState3, final MutableState mutableState4, final MutableState mutableState5, final MutableState mutableState6, final Book book, final BookViewModel bookViewModel, final Context context, final MutableState mutableState7, final MutableState mutableState8, final MutableState mutableState9, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C470@20352L11,470@20310L62,471@20415L38,473@20547L10508,468@20215L10840:ChatScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(217556830, i, -1, "com.example.ui.screens.ChatScreen.<anonymous> (ChatScreen.kt:468)");
            }
            CardKt.Card(PaddingKt.padding-VpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(8.0f), 0.0f, 2, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(24.0f)), CardDefaults.INSTANCE.cardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0L, 0L, composer, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.cardElevation-aqJV_2Y(Dp.constructor-impl(8.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer, (CardDefaults.$stable << 18) | 6, 62), (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-534510420, true, new Function3() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda82
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ChatScreenKt.ChatScreen$lambda$162$lambda$161(mutableState, mutableState2, mutableState3, mutableState4, mutableState5, mutableState6, book, bookViewModel, context, mutableState7, mutableState8, mutableState9, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer, 54), composer, 196614, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$162$lambda$161(final MutableState mutableState, final MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, final MutableState mutableState5, final MutableState mutableState6, final Book book, final BookViewModel bookViewModel, final Context context, final MutableState mutableState7, final MutableState mutableState8, final MutableState mutableState9, ColumnScope columnScope, Composer composer, int i) {
        Composer composer2;
        Book book2;
        Intrinsics.checkNotNullParameter(columnScope, "$this$Card");
        ComposerKt.sourceInformation(composer, "C474@20565L10476:ChatScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-534510420, i, -1, "com.example.ui.screens.ChatScreen.<anonymous>.<anonymous> (ChatScreen.kt:474)");
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
            ComposerKt.sourceInformationMarkerStart(composer, -186729350, "C477@20668L1282,500@21972L41,505@22185L21,502@22035L3943,570@26000L41,573@26108L4915:ChatScreen.kt#2thlc2");
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
            ComposerKt.sourceInformationMarkerStart(composer, -1047214649, "C482@20926L790,495@21762L53,495@21741L187:ChatScreen.kt#2thlc2");
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
            ComposerKt.sourceInformationMarkerStart(composer, 1374354416, "C485@21144L10,483@20963L295,490@21498L10,491@21575L11,488@21287L403:ChatScreen.kt#2thlc2");
            TextKt.Text--4IGK_g(Intrinsics.areEqual(ChatScreen$lambda$39(mutableState), "HANDOVER") ? "Handover Scan Verified" : "Return Scan Verified", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleMedium(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
            TextKt.Text--4IGK_g(Intrinsics.areEqual(ChatScreen$lambda$39(mutableState), "HANDOVER") ? "Step 1 of 3: AI Condition Inspection" : "Step 1 of 2: AI Condition Inspection", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 1905907335, "CC(remember):ChatScreen.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda18
                    public final Object invoke() {
                        return ChatScreenKt.ChatScreen$lambda$162$lambda$161$lambda$160$lambda$146$lambda$145$lambda$144(mutableState2, mutableState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            IconButtonKt.IconButton((Function0) objRememberedValue, (Modifier) null, false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableSingletons$ChatScreenKt.INSTANCE.m245getLambda$132722667$app(), composer, 196614, 30);
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
            ComposerKt.sourceInformationMarkerStart(composer, 1417069403, "C516@22815L11,508@22332L536,519@22894L41:ChatScreen.kt#2thlc2");
            Bitmap bitmapChatScreen$lambda$42 = ChatScreen$lambda$42(mutableState3);
            Intrinsics.checkNotNull(bitmapChatScreen$lambda$42);
            ImageKt.Image-5h-nEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmapChatScreen$lambda$42), "Captured Book Photo", BackgroundKt.background-bw27NRU$default(ClipKt.clip(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(140.0f)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f))), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), (Shape) null, 2, (Object) null), (Alignment) null, ContentScale.Companion.getFit(), 0.0f, (ColorFilter) null, 0, composer, 24624, 232);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f)), composer, 6);
            if (ChatScreen$lambda$48(mutableState4)) {
                composer.startReplaceGroup(1417635586);
                ComposerKt.sourceInformation(composer, "523@23073L11,522@23010L1096");
                SurfaceKt.Surface-T9BRK9s(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$133534666$app(), composer, 12582918, 120);
                composer2 = composer;
                composer2.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1418804968);
                ComposerKt.sourceInformation(composer, "542@24231L11,545@24445L1485,541@24168L1762");
                SurfaceKt.Surface-T9BRK9s(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), 0.35f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-852556575, true, new Function2() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda19
                    public final Object invoke(Object obj, Object obj2) {
                        return ChatScreenKt.ChatScreen$lambda$162$lambda$161$lambda$160$lambda$150$lambda$149(mutableState5, mutableState6, (Composer) obj, ((Integer) obj2).intValue());
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
            ComposerKt.sourceInformationMarkerStart(composer2, 1731318234, "C:ChatScreen.kt#2thlc2");
            if (Intrinsics.areEqual(ChatScreen$lambda$39(mutableState), "HANDOVER")) {
                composer2.startReplaceGroup(1731272725);
                ComposerKt.sourceInformation(composer2, "590@27165L48,579@26405L562,578@26355L1284,598@27726L579,597@27668L971");
                boolean z = !ChatScreen$lambda$48(mutableState4);
                Modifier modifier3 = SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(48.0f));
                ButtonColors buttonColors = ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(ColorKt.Color(4279994175L), 0L, 0L, 0L, composer, (ButtonDefaults.$stable << 12) | 6, 14);
                Shape shape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f));
                ComposerKt.sourceInformationMarkerStart(composer, 1995510939, "CC(remember):ChatScreen.kt#9igjgp");
                boolean zChangedInstance = composer.changedInstance(book) | composer.changedInstance(bookViewModel);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    Function0 function0 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda20
                        public final Object invoke() {
                            return ChatScreenKt.ChatScreen$lambda$162$lambda$161$lambda$160$lambda$159$lambda$152$lambda$151(book, bookViewModel, mutableState5, mutableState6, mutableState7, mutableState2, mutableState, mutableState8, mutableState9);
                        }
                    };
                    composer.updateRememberedValue(function0);
                    objRememberedValue2 = function0;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                ButtonKt.Button((Function0) objRememberedValue2, modifier3, z, shape, buttonColors, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$2062379198$app(), composer, 805306416, 480);
                boolean z2 = !ChatScreen$lambda$48(mutableState4);
                Modifier modifier4 = SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(42.0f));
                Shape shape2 = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f));
                ComposerKt.sourceInformationMarkerStart(composer, 1995553228, "CC(remember):ChatScreen.kt#9igjgp");
                boolean zChangedInstance2 = composer.changedInstance(book) | composer.changedInstance(bookViewModel) | composer.changedInstance(context);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                    Function0 function1 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda21
                        public final Object invoke() {
                            return ChatScreenKt.ChatScreen$lambda$162$lambda$161$lambda$160$lambda$159$lambda$154$lambda$153(book, bookViewModel, context, mutableState5, mutableState6, mutableState7, mutableState2, mutableState);
                        }
                    };
                    composer.updateRememberedValue(function1);
                    objRememberedValue3 = function1;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                ButtonKt.OutlinedButton((Function0) objRememberedValue3, modifier4, z2, shape2, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$1369637244$app(), composer, 805306416, 496);
                composer.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(1733599647);
                ComposerKt.sourceInformation(composer2, "625@29502L48,614@28751L553,613@28701L1273,633@30061L583,632@30003L972");
                boolean z3 = !ChatScreen$lambda$48(mutableState4);
                Modifier modifier5 = SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(48.0f));
                ButtonColors buttonColors2 = ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(ColorKt.Color(4279994175L), 0L, 0L, 0L, composer, (ButtonDefaults.$stable << 12) | 6, 14);
                Shape shape3 = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f));
                ComposerKt.sourceInformationMarkerStart(composer, 1995586002, "CC(remember):ChatScreen.kt#9igjgp");
                boolean zChangedInstance3 = composer.changedInstance(book) | composer.changedInstance(bookViewModel);
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                    Function0 function2 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda23
                        public final Object invoke() {
                            return ChatScreenKt.ChatScreen$lambda$162$lambda$161$lambda$160$lambda$159$lambda$156$lambda$155(book, bookViewModel, mutableState5, mutableState6, mutableState7, mutableState2, mutableState, mutableState8, mutableState9);
                        }
                    };
                    book2 = book;
                    composer.updateRememberedValue(function2);
                    objRememberedValue4 = function2;
                } else {
                    book2 = book;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                ButtonKt.Button((Function0) objRememberedValue4, modifier5, z3, shape3, buttonColors2, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$98330325$app(), composer, 805306416, 480);
                boolean z4 = !ChatScreen$lambda$48(mutableState4);
                Modifier modifier6 = SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(42.0f));
                Shape shape4 = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f));
                ComposerKt.sourceInformationMarkerStart(composer, 1995627952, "CC(remember):ChatScreen.kt#9igjgp");
                boolean zChangedInstance4 = composer.changedInstance(book2) | composer.changedInstance(bookViewModel) | composer.changedInstance(context);
                Object objRememberedValue5 = composer.rememberedValue();
                if (zChangedInstance4 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                    final Book book3 = book2;
                    Function0 function3 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda24
                        public final Object invoke() {
                            return ChatScreenKt.ChatScreen$lambda$162$lambda$161$lambda$160$lambda$159$lambda$158$lambda$157(book3, bookViewModel, context, mutableState5, mutableState6, mutableState7, mutableState2, mutableState);
                        }
                    };
                    composer.updateRememberedValue(function3);
                    objRememberedValue5 = function3;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                ButtonKt.OutlinedButton((Function0) objRememberedValue5, modifier6, z4, shape4, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$1643976467$app(), composer, 805306416, 496);
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

    static final Unit ChatScreen$lambda$162$lambda$161$lambda$160$lambda$146$lambda$145$lambda$144(MutableState mutableState, MutableState mutableState2) {
        ChatScreen$lambda$58(mutableState, false);
        mutableState2.setValue(null);
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$162$lambda$161$lambda$160$lambda$150$lambda$149(MutableState mutableState, MutableState mutableState2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C546@24479L1421:ChatScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-852556575, i, -1, "com.example.ui.screens.ChatScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:546)");
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
            ComposerKt.sourceInformationMarkerStart(composer, -188518350, "C547@24560L771:ChatScreen.kt#2thlc2");
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
            ComposerKt.sourceInformationMarkerStart(composer, 1728987401, "C548@24731L11,548@24654L130,549@24825L39,552@25069L10,554@25232L11,550@24905L388:ChatScreen.kt#2thlc2");
            IconKt.Icon-ww6aTOc(VerifiedKt.getVerified(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 432, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            String strChatScreen$lambda$51 = ChatScreen$lambda$51(mutableState);
            if (strChatScreen$lambda$51 == null) {
                strChatScreen$lambda$51 = "Good";
            }
            TextKt.Text--4IGK_g("AI Condition: " + strChatScreen$lambda$51, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleSmall(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
            Composer composer4 = composer;
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            composer4.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            String strChatScreen$lambda$54 = ChatScreen$lambda$54(mutableState2);
            if (strChatScreen$lambda$54 == null || StringsKt.isBlank(strChatScreen$lambda$54)) {
                composer4.startReplaceGroup(-212923349);
            } else {
                composer4.startReplaceGroup(-187702462);
                ComposerKt.sourceInformation(composer4, "558@25451L40,561@25670L10,562@25758L11,559@25532L296");
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer4, 6);
                String strChatScreen$lambda$55 = ChatScreen$lambda$54(mutableState2);
                Intrinsics.checkNotNull(strChatScreen$lambda$55);
                TextKt.Text--4IGK_g(strChatScreen$lambda$55, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer4, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getBodySmall(), composer, 0, 0, 65530);
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

    static final Unit ChatScreen$lambda$162$lambda$161$lambda$160$lambda$159$lambda$152$lambda$151(Book book, BookViewModel bookViewModel, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7) {
        String strChatScreen$lambda$51 = ChatScreen$lambda$51(mutableState);
        if (strChatScreen$lambda$51 == null) {
            strChatScreen$lambda$51 = book.getCondition();
        }
        String strChatScreen$lambda$54 = ChatScreen$lambda$54(mutableState2);
        if (strChatScreen$lambda$54 == null) {
            strChatScreen$lambda$54 = "Condition verified";
        }
        bookViewModel.transferBookInitiated(book, ChatScreen$lambda$45(mutableState3), strChatScreen$lambda$51, strChatScreen$lambda$54);
        ChatScreen$lambda$58(mutableState4, false);
        mutableState5.setValue(null);
        mutableState6.setValue("HANDOVER");
        ChatScreen$lambda$28(mutableState7, true);
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$162$lambda$161$lambda$160$lambda$159$lambda$154$lambda$153(Book book, BookViewModel bookViewModel, Context context, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5) {
        String strChatScreen$lambda$51 = ChatScreen$lambda$51(mutableState);
        if (strChatScreen$lambda$51 == null) {
            strChatScreen$lambda$51 = book.getCondition();
        }
        String strChatScreen$lambda$54 = ChatScreen$lambda$54(mutableState2);
        if (strChatScreen$lambda$54 == null) {
            strChatScreen$lambda$54 = "Condition verified";
        }
        bookViewModel.transferBookInitiated(book, ChatScreen$lambda$45(mutableState3), strChatScreen$lambda$51, strChatScreen$lambda$54);
        ChatScreen$lambda$58(mutableState4, false);
        mutableState5.setValue(null);
        Toast.makeText(context, "Handover photo saved! Next, tap 'Show QR' when ready.", 1).show();
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$162$lambda$161$lambda$160$lambda$159$lambda$156$lambda$155(Book book, BookViewModel bookViewModel, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7) {
        String strChatScreen$lambda$51 = ChatScreen$lambda$51(mutableState);
        if (strChatScreen$lambda$51 == null) {
            strChatScreen$lambda$51 = book.getCondition();
        }
        String strChatScreen$lambda$54 = ChatScreen$lambda$54(mutableState2);
        if (strChatScreen$lambda$54 == null) {
            strChatScreen$lambda$54 = "Condition verified";
        }
        bookViewModel.initiateReturn(book, ChatScreen$lambda$45(mutableState3), strChatScreen$lambda$51, strChatScreen$lambda$54);
        ChatScreen$lambda$58(mutableState4, false);
        mutableState5.setValue(null);
        mutableState6.setValue("RETURN");
        ChatScreen$lambda$28(mutableState7, true);
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$162$lambda$161$lambda$160$lambda$159$lambda$158$lambda$157(Book book, BookViewModel bookViewModel, Context context, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5) {
        String strChatScreen$lambda$51 = ChatScreen$lambda$51(mutableState);
        if (strChatScreen$lambda$51 == null) {
            strChatScreen$lambda$51 = book.getCondition();
        }
        String strChatScreen$lambda$54 = ChatScreen$lambda$54(mutableState2);
        if (strChatScreen$lambda$54 == null) {
            strChatScreen$lambda$54 = "Condition verified";
        }
        bookViewModel.initiateReturn(book, ChatScreen$lambda$45(mutableState3), strChatScreen$lambda$51, strChatScreen$lambda$54);
        ChatScreen$lambda$58(mutableState4, false);
        mutableState5.setValue(null);
        Toast.makeText(context, "Return photo saved! Show your QR code to the owner when meeting.", 1).show();
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$179(final MutableState mutableState, final MutableState mutableState2, final Book book, final Function0 function0, final State state, final State state2, final AudioHelper audioHelper, final MutableState mutableState3, final MutableState mutableState4, final MutableState mutableState5, final MutableState mutableState6, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C661@31316L2813,708@34164L198,713@34390L2860,761@37363L11,762@37438L11,763@37524L11,760@37295L268,660@31281L6296:ChatScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1083001398, i, -1, "com.example.ui.screens.ChatScreen.<anonymous> (ChatScreen.kt:660)");
            }
            AppBarKt.TopAppBar-GHTll3U(ComposableLambdaKt.rememberComposableLambda(1335259278, true, new Function2() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda72
                public final Object invoke(Object obj, Object obj2) {
                    return ChatScreenKt.ChatScreen$lambda$179$lambda$165(mutableState, mutableState2, book, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), (Modifier) null, ComposableLambdaKt.rememberComposableLambda(-434212336, true, new Function2() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda73
                public final Object invoke(Object obj, Object obj2) {
                    return ChatScreenKt.ChatScreen$lambda$179$lambda$166(function0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), ComposableLambdaKt.rememberComposableLambda(1716481145, true, new Function3() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda74
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ChatScreenKt.ChatScreen$lambda$179$lambda$178(state, state2, book, audioHelper, mutableState2, mutableState3, mutableState4, mutableState5, mutableState6, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer, 54), 0.0f, (WindowInsets) null, TopAppBarDefaults.INSTANCE.topAppBarColors-zjMxDiM(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface-0d7_KjU(), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface-0d7_KjU(), 0L, composer, TopAppBarDefaults.$stable << 15, 18), (TopAppBarScrollBehavior) null, composer, 3462, 178);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x017a  */
    /* JADX WARN: Code duplicated, block: B:44:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:45:0x01e8  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v9 */
    static final Unit ChatScreen$lambda$179$lambda$165(MutableState mutableState, MutableState mutableState2, Book book, Composer composer, int i) {
        RowScope rowScope;
        String str;
        ?? r13;
        String str2;
        boolean z;
        byte[] bArrDecode;
        ImageBitmap imageBitmap;
        Bitmap bitmapDecodeByteArray;
        ComposerKt.sourceInformation(composer, "C662@31339L2772:ChatScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1335259278, i, -1, "com.example.ui.screens.ChatScreen.<anonymous>.<anonymous> (ChatScreen.kt:662)");
            }
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier = Modifier.Companion;
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
            RowScope rowScope2 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1512886305, "C689@33071L40,690@33136L953:ChatScreen.kt#2thlc2");
            String strChatScreen$lambda$74 = ChatScreen$lambda$74(mutableState);
            if (strChatScreen$lambda$74 == null || StringsKt.isBlank(strChatScreen$lambda$74)) {
                rowScope = rowScope2;
                str = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                r13 = 0;
                str2 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                composer.startReplaceGroup(1514332950);
                ComposerKt.sourceInformation(composer, "687@32986L34");
                PartnerAvatarCircle(ChatScreen$lambda$71(mutableState2), composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1512886552);
                ComposerKt.sourceInformation(composer, "");
                String strChatScreen$lambda$75 = ChatScreen$lambda$74(mutableState);
                Intrinsics.checkNotNull(strChatScreen$lambda$75);
                ImageBitmap imageBitmapAsImageBitmap = null;
                if (StringsKt.startsWith$default(strChatScreen$lambda$75, "data:image", false, 2, (Object) null)) {
                    rowScope = rowScope2;
                    str = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                    str2 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                    composer.startReplaceGroup(1512978963);
                    ComposerKt.sourceInformation(composer, "");
                    String strChatScreen$lambda$76 = ChatScreen$lambda$74(mutableState);
                    Intrinsics.checkNotNull(strChatScreen$lambda$76);
                    z = false;
                    bArrDecode = Base64.decode(StringsKt.substringAfter$default(strChatScreen$lambda$76, "base64,", (String) null, 2, (Object) null), 0);
                    if (bArrDecode != null) {
                        imageBitmapAsImageBitmap = AndroidImageBitmap_androidKt.asImageBitmap(bitmapDecodeByteArray);
                    }
                    imageBitmap = imageBitmapAsImageBitmap;
                    if (imageBitmap != null) {
                        composer.startReplaceGroup(1513360883);
                        ComposerKt.sourceInformation(composer, "669@32004L341");
                        ImageKt.Image-5h-nEew(imageBitmap, ChatScreen$lambda$71(mutableState2), ClipKt.clip(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(38.0f)), RoundedCornerShapeKt.getCircleShape()), (Alignment) null, ContentScale.Companion.getCrop(), 0.0f, (ColorFilter) null, 0, composer, 24576, 232);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(1513767014);
                        ComposerKt.sourceInformation(composer, "676@32423L34");
                        PartnerAvatarCircle(ChatScreen$lambda$71(mutableState2), composer, 0);
                        composer.endReplaceGroup();
                    }
                    composer.endReplaceGroup();
                } else {
                    String strChatScreen$lambda$77 = ChatScreen$lambda$74(mutableState);
                    Intrinsics.checkNotNull(strChatScreen$lambda$77);
                    if (strChatScreen$lambda$77.length() > 200) {
                        rowScope = rowScope2;
                        str = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                        str2 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                        composer.startReplaceGroup(1512978963);
                        ComposerKt.sourceInformation(composer, "");
                        String strChatScreen$lambda$78 = ChatScreen$lambda$74(mutableState);
                        Intrinsics.checkNotNull(strChatScreen$lambda$78);
                        z = false;
                        try {
                            bArrDecode = Base64.decode(StringsKt.substringAfter$default(strChatScreen$lambda$78, "base64,", (String) null, 2, (Object) null), 0);
                        } catch (Exception unused) {
                            bArrDecode = null;
                        }
                        if (bArrDecode != null && (bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length)) != null) {
                            imageBitmapAsImageBitmap = AndroidImageBitmap_androidKt.asImageBitmap(bitmapDecodeByteArray);
                        }
                        imageBitmap = imageBitmapAsImageBitmap;
                        if (imageBitmap != null) {
                            composer.startReplaceGroup(1513360883);
                            ComposerKt.sourceInformation(composer, "669@32004L341");
                            ImageKt.Image-5h-nEew(imageBitmap, ChatScreen$lambda$71(mutableState2), ClipKt.clip(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(38.0f)), RoundedCornerShapeKt.getCircleShape()), (Alignment) null, ContentScale.Companion.getCrop(), 0.0f, (ColorFilter) null, 0, composer, 24576, 232);
                            composer.endReplaceGroup();
                        } else {
                            composer.startReplaceGroup(1513767014);
                            ComposerKt.sourceInformation(composer, "676@32423L34");
                            PartnerAvatarCircle(ChatScreen$lambda$71(mutableState2), composer, 0);
                            composer.endReplaceGroup();
                        }
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(1513916899);
                        ComposerKt.sourceInformation(composer, "679@32561L333");
                        rowScope = rowScope2;
                        str2 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                        str = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                        SingletonAsyncImageKt.m108AsyncImagegl8XCv8(ChatScreen$lambda$74(mutableState), ChatScreen$lambda$71(mutableState2), ClipKt.clip(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(38.0f)), RoundedCornerShapeKt.getCircleShape()), null, null, null, ContentScale.Companion.getCrop(), 0.0f, null, 0, false, null, composer, 1572864, 0, 4024);
                        composer.endReplaceGroup();
                        z = false;
                    }
                }
                composer.endReplaceGroup();
                r13 = z;
            }
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f)), composer, 6);
            Modifier modifierWeight = rowScope.weight(Modifier.Companion, 1.0f, (boolean) r13);
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, (int) r13);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, str);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, (int) r13);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierWeight);
            Function0 constructor2 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, str2);
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
            ComposerKt.sourceInformationMarkerStart(composer, 1481730191, "C693@33334L10,691@33219L372,700@33784L10,701@33862L11,698@33620L443:ChatScreen.kt#2thlc2");
            TextKt.Text--4IGK_g(ChatScreen$lambda$71(mutableState2), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.getEllipsis-gIe3tQ8(), false, 1, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleMedium(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 3120, 55262);
            TextKt.Text--4IGK_g(book != null ? "📖 " + book.getTitle() : "Book Exchange Chat", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.getEllipsis-gIe3tQ8(), false, 1, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 0, 3120, 55290);
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

    static final Unit ChatScreen$lambda$179$lambda$166(Function0 function0, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C709@34186L158:ChatScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-434212336, i, -1, "com.example.ui.screens.ChatScreen.<anonymous>.<anonymous> (ChatScreen.kt:709)");
            }
            IconButtonKt.IconButton(function0, (Modifier) null, false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableSingletons$ChatScreenKt.INSTANCE.m243getLambda$1147841043$app(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$179$lambda$178(final State state, final State state2, final Book book, final AudioHelper audioHelper, final MutableState mutableState, final MutableState mutableState2, final MutableState mutableState3, final MutableState mutableState4, final MutableState mutableState5, RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$TopAppBar");
        ComposerKt.sourceInformation(composer, "C714@34433L689,724@35124L365,714@34412L1077,756@37045L31,756@37024L208:ChatScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1716481145, i, -1, "com.example.ui.screens.ChatScreen.<anonymous>.<anonymous> (ChatScreen.kt:714)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, 270940746, "CC(remember):ChatScreen.kt#9igjgp");
            boolean zChanged = composer.changed(state) | composer.changed(state2) | composer.changedInstance(book) | composer.changedInstance(audioHelper);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                Function0 function0 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda60
                    public final Object invoke() {
                        return ChatScreenKt.ChatScreen$lambda$179$lambda$178$lambda$168$lambda$167(book, audioHelper, state, state2, mutableState, mutableState2);
                    }
                };
                composer.updateRememberedValue(function0);
                objRememberedValue = function0;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            IconButtonKt.IconButton((Function0) objRememberedValue, (Modifier) null, false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableLambdaKt.rememberComposableLambda(1481543996, true, new Function2() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda61
                public final Object invoke(Object obj, Object obj2) {
                    return ChatScreenKt.ChatScreen$lambda$179$lambda$178$lambda$169(mutableState2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            if (book != null) {
                composer.startReplaceGroup(-189660858);
                ComposerKt.sourceInformation(composer, "732@35575L31,732@35554L203,735@35803L32,735@35837L1144,735@35782L1199");
                ComposerKt.sourceInformationMarkerStart(composer, 270976632, "CC(remember):ChatScreen.kt#9igjgp");
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda62
                        public final Object invoke() {
                            return ChatScreenKt.ChatScreen$lambda$179$lambda$178$lambda$171$lambda$170(mutableState3);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                IconButtonKt.IconButton((Function0) objRememberedValue2, (Modifier) null, false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableSingletons$ChatScreenKt.INSTANCE.m250getLambda$1689933951$app(), composer, 196614, 30);
                ComposerKt.sourceInformationMarkerStart(composer, 270983929, "CC(remember):ChatScreen.kt#9igjgp");
                Object objRememberedValue3 = composer.rememberedValue();
                if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda63
                        public final Object invoke() {
                            return ChatScreenKt.ChatScreen$lambda$179$lambda$178$lambda$173$lambda$172(mutableState4);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                IconButtonKt.IconButton((Function0) objRememberedValue3, (Modifier) null, false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableLambdaKt.rememberComposableLambda(1856098602, true, new Function2() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda64
                    public final Object invoke(Object obj, Object obj2) {
                        return ChatScreenKt.ChatScreen$lambda$179$lambda$178$lambda$175(book, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer, 54), composer, 196614, 30);
            } else {
                composer.startReplaceGroup(-224951351);
            }
            composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerStart(composer, 271023672, "CC(remember):ChatScreen.kt#9igjgp");
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda65
                    public final Object invoke() {
                        return ChatScreenKt.ChatScreen$lambda$179$lambda$178$lambda$177$lambda$176(mutableState5);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            IconButtonKt.IconButton((Function0) objRememberedValue4, (Modifier) null, false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableSingletons$ChatScreenKt.INSTANCE.m246getLambda$1384510939$app(), composer, 196614, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$179$lambda$178$lambda$168$lambda$167(Book book, AudioHelper audioHelper, State state, State state2, MutableState mutableState, MutableState mutableState2) {
        String str;
        String title;
        String status;
        String title2;
        String str2 = "book";
        if (!ChatScreen$lambda$8(state).isEmpty()) {
            Message message = (Message) CollectionsKt.last(ChatScreen$lambda$8(state));
            String strChatScreen$lambda$71 = Intrinsics.areEqual(message.getSender(), ChatScreen$lambda$13(state2)) ? "You" : ChatScreen$lambda$71(mutableState);
            String strChatScreen$lambda$72 = ChatScreen$lambda$71(mutableState);
            if (book != null && (title2 = book.getTitle()) != null) {
                str2 = title2;
            }
            if (book == null || (status = book.getStatus()) == null) {
                status = "";
            }
            str = "Chat with " + strChatScreen$lambda$72 + " about " + str2 + ". Status is " + status + ". Latest message from " + strChatScreen$lambda$71 + ": " + message.getContent();
        } else {
            String strChatScreen$lambda$73 = ChatScreen$lambda$71(mutableState);
            if (book != null && (title = book.getTitle()) != null) {
                str2 = title;
            }
            str = "Chat with " + strChatScreen$lambda$73 + " about " + str2 + ". No messages yet.";
        }
        audioHelper.toggle(str);
        ChatScreen$lambda$25(mutableState2, audioHelper.isSpeaking());
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$179$lambda$178$lambda$169(MutableState mutableState, Composer composer, int i) {
        long j;
        ComposerKt.sourceInformation(composer, "C725@35150L317:ChatScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1481543996, i, -1, "com.example.ui.screens.ChatScreen.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:725)");
            }
            ImageVector volumeOff = ChatScreen$lambda$24(mutableState) ? VolumeOffKt.getVolumeOff(Icons.INSTANCE.getDefault()) : VolumeUpKt.getVolumeUp(Icons.INSTANCE.getDefault());
            if (ChatScreen$lambda$24(mutableState)) {
                composer.startReplaceGroup(2129613921);
                ComposerKt.sourceInformation(composer, "728@35385L11");
                j = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU();
            } else {
                composer.startReplaceGroup(2129615107);
                ComposerKt.sourceInformation(composer, "728@35422L11");
                j = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU();
            }
            composer.endReplaceGroup();
            IconKt.Icon-ww6aTOc(volumeOff, "Listen to chat", (Modifier) null, j, composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$179$lambda$178$lambda$171$lambda$170(MutableState mutableState) {
        ChatScreen$lambda$22(mutableState, true);
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$179$lambda$178$lambda$173$lambda$172(MutableState mutableState) {
        ChatScreen$lambda$16(mutableState, true);
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$179$lambda$178$lambda$175(Book book, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C740@36110L11,736@35867L1088:ChatScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1856098602, i, -1, "com.example.ui.screens.ChatScreen.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:736)");
            }
            Modifier modifier = BackgroundKt.background-bw27NRU$default(ClipKt.clip(SizeKt.size-VpY3zN4(Modifier.Companion, Dp.constructor-impl(30.0f), Dp.constructor-impl(40.0f)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(4.0f))), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), (Shape) null, 2, (Object) null);
            Alignment center = Alignment.Companion.getCenter();
            ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
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
            ComposerKt.sourceInformationMarkerStart(composer, 674692753, "C:ChatScreen.kt#2thlc2");
            String imageUrl = book.getImageUrl();
            if (imageUrl == null || StringsKt.isBlank(imageUrl)) {
                composer.startReplaceGroup(675130968);
                ComposerKt.sourceInformation(composer, "751@36871L11,751@36765L126");
                IconKt.Icon-ww6aTOc(BookKt.getBook(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 432, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(674721024);
                ComposerKt.sourceInformation(composer, "744@36345L342");
                BookImageDisplayKt.BookImageDisplay(book.getImageUrl(), book.getTitle(), SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null), ContentScale.Companion.getCrop(), null, composer, 3456, 16);
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

    static final Unit ChatScreen$lambda$179$lambda$178$lambda$177$lambda$176(MutableState mutableState) {
        ChatScreen$lambda$6(mutableState, true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0410  */
    /* JADX WARN: Code duplicated, block: B:104:0x042f  */
    /* JADX WARN: Code duplicated, block: B:107:0x044e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0459  */
    /* JADX WARN: Code duplicated, block: B:111:0x0472  */
    /* JADX WARN: Code duplicated, block: B:112:0x047d  */
    /* JADX WARN: Code duplicated, block: B:115:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:117:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:118:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:119:0x0558  */
    /* JADX WARN: Code duplicated, block: B:207:0x0d05  */
    /* JADX WARN: Code duplicated, block: B:209:0x0d0d  */
    /* JADX WARN: Code duplicated, block: B:220:0x0d81  */
    /* JADX WARN: Code duplicated, block: B:98:0x03f1  */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v52 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [boolean, int] */
    static final Unit ChatScreen$lambda$272(long j, final Book book, final BookViewModel bookViewModel, final boolean z, final Context context, final ManagedActivityResultLauncher managedActivityResultLauncher, final boolean z2, final State state, final State state2, final SimpleDateFormat simpleDateFormat, final MutableState mutableState, final MutableState mutableState2, final MutableState mutableState3, final MutableState mutableState4, final MutableState mutableState5, final MutableState mutableState6, final MutableState mutableState7, final MutableState mutableState8, final MutableState mutableState9, final MutableState mutableState10, MutableState mutableState11, final MutableState mutableState12, final MutableState mutableState13, MutableState mutableState14, final String str, final String str2, final MutableState mutableState15, final MutableState mutableState16, final MutableState mutableState17, PaddingValues paddingValues, Composer composer, int i) {
        String str3;
        int i2;
        String str4;
        int i3;
        String str5;
        Composer composer2;
        String str6;
        ?? r13;
        float f;
        Continuation continuation;
        Object obj;
        Object obj2;
        boolean z3;
        boolean z4;
        char c;
        int i4;
        List listListOf;
        boolean zChanged;
        Object objRememberedValue;
        String strChatScreen$lambda$88;
        final List list;
        boolean zChangedInstance;
        Object objRememberedValue2;
        String str7;
        Composer composer3;
        Float fValueOf;
        String str8;
        boolean zChangedInstance2;
        Object objRememberedValue3;
        Object objRememberedValue4;
        Object objRememberedValue5;
        Object objRememberedValue6;
        Object objRememberedValue7;
        String agreedMeetupSpot;
        boolean z5;
        Composer composer4 = composer;
        Intrinsics.checkNotNullParameter(paddingValues, "innerPadding");
        ComposerKt.sourceInformation(composer4, "C768@37620L58700:ChatScreen.kt#2thlc2");
        int i5 = (i & 6) == 0 ? i | (composer4.changed(paddingValues) ? 4 : 2) : i;
        if ((i5 & 19) == 18 && composer4.getSkipping()) {
            composer4.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1341646239, i5, -1, "com.example.ui.screens.ChatScreen.<anonymous> (ChatScreen.kt:768)");
            }
            Modifier modifier = BackgroundKt.background-bw27NRU$default(WindowInsetsPadding_androidKt.imePadding(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null), paddingValues)), j, (Shape) null, 2, (Object) null);
            ComposerKt.sourceInformationMarkerStart(composer4, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer4, 0);
            ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifier);
            Function0 constructor = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer4.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer4.startReusableNode();
            if (composer4.getInserting()) {
                composer4.createNode(constructor);
            } else {
                composer4.useNode();
            }
            Composer composer5 = Updater.constructor-impl(composer4);
            Updater.set-impl(composer5, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer5, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer5.getInserting() || !Intrinsics.areEqual(composer5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composer5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composer5.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.set-impl(composer5, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer4, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            final ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer4, -509895266, "C1039@52616L31,1040@52662L975,1037@52444L1193,1063@53672L23,1064@53738L135,1064@53708L165:ChatScreen.kt#2thlc2");
            if (book != null) {
                composer4.startReplaceGroup(-511450909);
                ComposerKt.sourceInformation(composer4, "778@37985L11,783@38208L32,784@38259L7301,777@37934L7626");
                long j2 = MaterialTheme.INSTANCE.getColorScheme(composer4, MaterialTheme.$stable).getSurface-0d7_KjU();
                float f2 = Dp.constructor-impl(2.0f);
                float f3 = Dp.constructor-impl(2.0f);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
                ComposerKt.sourceInformationMarkerStart(composer4, -570686027, "CC(remember):ChatScreen.kt#9igjgp");
                Object objRememberedValue8 = composer4.rememberedValue();
                if (objRememberedValue8 == Composer.Companion.getEmpty()) {
                    objRememberedValue8 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda34
                        public final Object invoke() {
                            return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$181$lambda$180(mutableState);
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue8);
                }
                ComposerKt.sourceInformationMarkerEnd(composer4);
                str3 = "CC(remember):ChatScreen.kt#9igjgp";
                i2 = -549301971;
                SurfaceKt.Surface-T9BRK9s(ClickableKt.clickable-XHw0xAI$default(modifierFillMaxWidth$default, false, (String) null, (Role) null, (Function0) objRememberedValue8, 7, (Object) null), (Shape) null, j2, 0L, f2, f3, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(1696351563, true, new Function2() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda46
                    public final Object invoke(Object obj3, Object obj4) {
                        return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$194(mutableState2, book, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                }, composer4, 54), composer4, 12804096, 74);
                composer4 = composer4;
            } else {
                str3 = "CC(remember):ChatScreen.kt#9igjgp";
                i2 = -549301971;
                composer4.startReplaceGroup(-549301971);
            }
            composer4.endReplaceGroup();
            if (book != null) {
                composer4.startReplaceGroup(-503849678);
                ComposerKt.sourceInformation(composer4, "918@45749L37,929@46395L188,933@46623L178,937@46842L179,941@47065L126,945@47232L125,949@47398L125,953@47564L205,957@47811L133,961@47983L123,965@48145L123,969@48307L79,972@48428L75,923@46098L2423");
                String requestedByName = book.getRequestedByName();
                if (requestedByName == null) {
                    requestedByName = "";
                }
                List<Review> listChatScreen$lambda$272$lambda$271$lambda$195 = ChatScreen$lambda$272$lambda$271$lambda$195(SnapshotStateKt.collectAsState(bookViewModel.getReviews(requestedByName), CollectionsKt.emptyList(), (CoroutineContext) null, composer4, 48, 2));
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : listChatScreen$lambda$272$lambda$271$lambda$195) {
                    if (Intrinsics.areEqual(((Review) obj3).getReviewType(), "BORROWER")) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2.isEmpty()) {
                    fValueOf = null;
                } else {
                    ArrayList arrayList3 = arrayList2;
                    ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(Integer.valueOf(((Review) it.next()).getRating()));
                    }
                    fValueOf = Float.valueOf((float) CollectionsKt.averageOfInt(arrayList4));
                }
                int size = arrayList2.size();
                String strChatScreen$lambda$13 = ChatScreen$lambda$13(state2);
                if (strChatScreen$lambda$13 == null) {
                    strChatScreen$lambda$13 = "";
                }
                String str9 = str3;
                ComposerKt.sourceInformationMarkerStart(composer4, -570423887, str9);
                boolean zChangedInstance3 = composer4.changedInstance(bookViewModel) | composer4.changedInstance(book) | composer4.changedInstance(context);
                Object objRememberedValue9 = composer4.rememberedValue();
                if (zChangedInstance3 || objRememberedValue9 == Composer.Companion.getEmpty()) {
                    objRememberedValue9 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda51
                        public final Object invoke() {
                            return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$199$lambda$198(bookViewModel, book, context);
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue9);
                }
                Function0 function0 = (Function0) objRememberedValue9;
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerStart(composer4, -570416601, str9);
                boolean zChangedInstance4 = composer4.changedInstance(bookViewModel) | composer4.changedInstance(book) | composer4.changedInstance(context);
                Object objRememberedValue10 = composer4.rememberedValue();
                if (zChangedInstance4 || objRememberedValue10 == Composer.Companion.getEmpty()) {
                    objRememberedValue10 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda52
                        public final Object invoke() {
                            return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$201$lambda$200(bookViewModel, book, context);
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue10);
                }
                Function0 function1 = (Function0) objRememberedValue10;
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerStart(composer4, -570409592, str9);
                boolean zChangedInstance5 = composer4.changedInstance(bookViewModel) | composer4.changedInstance(book) | composer4.changedInstance(context);
                Object objRememberedValue11 = composer4.rememberedValue();
                if (zChangedInstance5 || objRememberedValue11 == Composer.Companion.getEmpty()) {
                    objRememberedValue11 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda53
                        public final Object invoke() {
                            return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$203$lambda$202(bookViewModel, book, context);
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue11);
                }
                Function0 function2 = (Function0) objRememberedValue11;
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerStart(composer4, -570402509, str9);
                boolean zChangedInstance6 = composer4.changedInstance(managedActivityResultLauncher);
                Object objRememberedValue12 = composer4.rememberedValue();
                if (zChangedInstance6 || objRememberedValue12 == Composer.Companion.getEmpty()) {
                    objRememberedValue12 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda54
                        public final Object invoke() {
                            return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$205$lambda$204(managedActivityResultLauncher, mutableState3);
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue12);
                }
                Function0 function3 = (Function0) objRememberedValue12;
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerStart(composer4, -570397166, str9);
                Object objRememberedValue13 = composer4.rememberedValue();
                if (objRememberedValue13 == Composer.Companion.getEmpty()) {
                    objRememberedValue13 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda56
                        public final Object invoke() {
                            return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$207$lambda$206(mutableState4, mutableState5);
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue13);
                }
                Function0 function4 = (Function0) objRememberedValue13;
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerStart(composer4, -570391854, str9);
                Object objRememberedValue14 = composer4.rememberedValue();
                if (objRememberedValue14 == Composer.Companion.getEmpty()) {
                    objRememberedValue14 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda57
                        public final Object invoke() {
                            return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$209$lambda$208(mutableState6, mutableState7);
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue14);
                }
                Function0 function5 = (Function0) objRememberedValue14;
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerStart(composer4, -570386462, str9);
                boolean zChangedInstance7 = composer4.changedInstance(bookViewModel) | composer4.changedInstance(book) | composer4.changedInstance(context);
                Object objRememberedValue15 = composer4.rememberedValue();
                if (zChangedInstance7) {
                    str8 = strChatScreen$lambda$13;
                } else {
                    str8 = strChatScreen$lambda$13;
                    if (objRememberedValue15 == Composer.Companion.getEmpty()) {
                    }
                    Function0 function6 = (Function0) objRememberedValue15;
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    ComposerKt.sourceInformationMarkerStart(composer4, -570378630, str9);
                    zChangedInstance2 = composer4.changedInstance(managedActivityResultLauncher);
                    objRememberedValue3 = composer4.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda59
                            public final Object invoke() {
                                return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$213$lambda$212(managedActivityResultLauncher, mutableState3);
                            }
                        };
                        composer4.updateRememberedValue(objRememberedValue3);
                    }
                    Function0 function7 = (Function0) objRememberedValue3;
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    ComposerKt.sourceInformationMarkerStart(composer4, -570373136, str9);
                    objRememberedValue4 = composer4.rememberedValue();
                    if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda35
                            public final Object invoke() {
                                return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$215$lambda$214(mutableState4, mutableState5);
                            }
                        };
                        composer4.updateRememberedValue(objRememberedValue4);
                    }
                    Function0 function8 = (Function0) objRememberedValue4;
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    ComposerKt.sourceInformationMarkerStart(composer4, -570367952, str9);
                    objRememberedValue5 = composer4.rememberedValue();
                    if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                        objRememberedValue5 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda36
                            public final Object invoke() {
                                return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$217$lambda$216(mutableState6, mutableState7);
                            }
                        };
                        composer4.updateRememberedValue(objRememberedValue5);
                    }
                    Function0 function9 = (Function0) objRememberedValue5;
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    ComposerKt.sourceInformationMarkerStart(composer4, -570362812, str9);
                    objRememberedValue6 = composer4.rememberedValue();
                    if (objRememberedValue6 == Composer.Companion.getEmpty()) {
                        objRememberedValue6 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda37
                            public final Object invoke() {
                                return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$219$lambda$218(mutableState8);
                            }
                        };
                        composer4.updateRememberedValue(objRememberedValue6);
                    }
                    Function0 function10 = (Function0) objRememberedValue6;
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    ComposerKt.sourceInformationMarkerStart(composer4, -570358944, str9);
                    objRememberedValue7 = composer4.rememberedValue();
                    if (objRememberedValue7 == Composer.Companion.getEmpty()) {
                        objRememberedValue7 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda38
                            public final Object invoke() {
                                return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$221$lambda$220(mutableState9);
                            }
                        };
                        composer4.updateRememberedValue(objRememberedValue7);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    str5 = "C88@4444L9:Column.kt#2w3rfo";
                    str4 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                    str6 = str9;
                    Composer composer6 = composer4;
                    ExchangeHubBar(book, z, str8, fValueOf, size, function0, function1, function2, function3, function4, function5, function6, function7, function8, function9, function10, (Function0) objRememberedValue7, composer6, 805306368, 1797126, 0);
                    composer2 = composer6;
                    agreedMeetupSpot = book.getAgreedMeetupSpot();
                    if (agreedMeetupSpot != null) {
                        z5 = true;
                        f = 0.0f;
                        continuation = null;
                        i3 = -549301971;
                    } else if (StringsKt.isBlank(agreedMeetupSpot)) {
                        i3 = -549301971;
                        z5 = true;
                        f = 0.0f;
                        continuation = null;
                    } else {
                        composer2.startReplaceGroup(-500922906);
                        ComposerKt.sourceInformation(composer2, "984@49031L3322,979@48674L3679");
                        f = 0.0f;
                        continuation = null;
                        r13 = 1;
                        SurfaceKt.Surface-T9BRK9s(PaddingKt.padding-VpY3zN4(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(12.0f), Dp.constructor-impl(4.0f)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), Color.copy-wmQWz5c$default(ColorKt.Color(4279994175L), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, 0.0f, BorderStrokeKt.BorderStroke-cXLIe8U(Dp.constructor-impl(1.0f), Color.copy-wmQWz5c$default(ColorKt.Color(4279994175L), 0.35f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), ComposableLambdaKt.rememberComposableLambda(2046961821, true, new Function2() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda39
                            public final Object invoke(Object obj4, Object obj5) {
                                return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$228(book, context, (Composer) obj4, ((Integer) obj5).intValue());
                            }
                        }, composer2, 54), composer2, 14156166, 56);
                        composer2.endReplaceGroup();
                        i3 = -549301971;
                    }
                    composer2.startReplaceGroup(i3);
                    composer2.endReplaceGroup();
                    r13 = z5;
                }
                objRememberedValue15 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda58
                    public final Object invoke() {
                        return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$211$lambda$210(bookViewModel, book, context);
                    }
                };
                composer4.updateRememberedValue(objRememberedValue15);
                Function0 function11 = (Function0) objRememberedValue15;
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerStart(composer4, -570378630, str9);
                zChangedInstance2 = composer4.changedInstance(managedActivityResultLauncher);
                objRememberedValue3 = composer4.rememberedValue();
                if (zChangedInstance2) {
                    objRememberedValue3 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda59
                        public final Object invoke() {
                            return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$213$lambda$212(managedActivityResultLauncher, mutableState3);
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda59
                        public final Object invoke() {
                            return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$213$lambda$212(managedActivityResultLauncher, mutableState3);
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue3);
                }
                Function0 function12 = (Function0) objRememberedValue3;
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerStart(composer4, -570373136, str9);
                objRememberedValue4 = composer4.rememberedValue();
                if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda35
                        public final Object invoke() {
                            return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$215$lambda$214(mutableState4, mutableState5);
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue4);
                }
                Function0 function13 = (Function0) objRememberedValue4;
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerStart(composer4, -570367952, str9);
                objRememberedValue5 = composer4.rememberedValue();
                if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                    objRememberedValue5 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda36
                        public final Object invoke() {
                            return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$217$lambda$216(mutableState6, mutableState7);
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue5);
                }
                Function0 function14 = (Function0) objRememberedValue5;
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerStart(composer4, -570362812, str9);
                objRememberedValue6 = composer4.rememberedValue();
                if (objRememberedValue6 == Composer.Companion.getEmpty()) {
                    objRememberedValue6 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda37
                        public final Object invoke() {
                            return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$219$lambda$218(mutableState8);
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue6);
                }
                Function0 function15 = (Function0) objRememberedValue6;
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerStart(composer4, -570358944, str9);
                objRememberedValue7 = composer4.rememberedValue();
                if (objRememberedValue7 == Composer.Companion.getEmpty()) {
                    objRememberedValue7 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda38
                        public final Object invoke() {
                            return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$221$lambda$220(mutableState9);
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue7);
                }
                ComposerKt.sourceInformationMarkerEnd(composer4);
                str5 = "C88@4444L9:Column.kt#2w3rfo";
                str4 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                str6 = str9;
                Composer composer7 = composer4;
                ExchangeHubBar(book, z, str8, fValueOf, size, function0, function1, function2, function3, function4, function5, function11, function12, function13, function14, function15, (Function0) objRememberedValue7, composer7, 805306368, 1797126, 0);
                composer2 = composer7;
                agreedMeetupSpot = book.getAgreedMeetupSpot();
                if (agreedMeetupSpot != null) {
                    z5 = true;
                    f = 0.0f;
                    continuation = null;
                    i3 = -549301971;
                } else if (StringsKt.isBlank(agreedMeetupSpot)) {
                    i3 = -549301971;
                    z5 = true;
                    f = 0.0f;
                    continuation = null;
                } else {
                    composer2.startReplaceGroup(-500922906);
                    ComposerKt.sourceInformation(composer2, "984@49031L3322,979@48674L3679");
                    f = 0.0f;
                    continuation = null;
                    r13 = 1;
                    SurfaceKt.Surface-T9BRK9s(PaddingKt.padding-VpY3zN4(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(12.0f), Dp.constructor-impl(4.0f)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), Color.copy-wmQWz5c$default(ColorKt.Color(4279994175L), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, 0.0f, BorderStrokeKt.BorderStroke-cXLIe8U(Dp.constructor-impl(1.0f), Color.copy-wmQWz5c$default(ColorKt.Color(4279994175L), 0.35f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), ComposableLambdaKt.rememberComposableLambda(2046961821, true, new Function2() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda39
                        public final Object invoke(Object obj4, Object obj5) {
                            return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$228(book, context, (Composer) obj4, ((Integer) obj5).intValue());
                        }
                    }, composer2, 54), composer2, 14156166, 56);
                    composer2.endReplaceGroup();
                    i3 = -549301971;
                }
                composer2.startReplaceGroup(i3);
                composer2.endReplaceGroup();
                r13 = z5;
            } else {
                str4 = r9;
                i3 = i2;
                str5 = r11;
                composer2 = composer4;
                str6 = str3;
                r13 = 1;
                f = 0.0f;
                continuation = null;
                composer2.startReplaceGroup(i3);
            }
            composer2.endReplaceGroup();
            long j3 = z2 ? Color.copy-wmQWz5c$default(ColorKt.Color(4279193906L), 0.3f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : ColorKt.Color(4291946461L);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.Companion, f, (int) r13, continuation);
            String str10 = str6;
            ComposerKt.sourceInformationMarkerStart(composer2, -570224972, str10);
            Object objRememberedValue16 = composer2.rememberedValue();
            if (objRememberedValue16 == Composer.Companion.getEmpty()) {
                objRememberedValue16 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda40
                    public final Object invoke() {
                        return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$230$lambda$229(mutableState10);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue16);
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            SurfaceKt.Surface-T9BRK9s(ClickableKt.clickable-XHw0xAI$default(modifierFillMaxWidth$default2, false, (String) null, (Role) null, (Function0) objRememberedValue16, 7, (Object) null), (Shape) null, j3, 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(1763834096, (boolean) r13, new Function2() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda41
                public final Object invoke(Object obj4, Object obj5) {
                    return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$232(z2, (Composer) obj4, ((Integer) obj5).intValue());
                }
            }, composer2, 54), composer2, 12582912, 122);
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composer2, 0, 3);
            Integer numValueOf = Integer.valueOf(ChatScreen$lambda$8(state).size());
            ComposerKt.sourceInformationMarkerStart(composer2, -570188964, str10);
            boolean zChanged2 = composer2.changed(state) | composer2.changed(lazyListStateRememberLazyListState);
            ChatScreenKt$ChatScreen$21$1$18$1 chatScreenKt$ChatScreen$21$1$18$1RememberedValue = composer2.rememberedValue();
            if (zChanged2 || chatScreenKt$ChatScreen$21$1$18$1RememberedValue == Composer.Companion.getEmpty()) {
                chatScreenKt$ChatScreen$21$1$18$1RememberedValue = new ChatScreenKt$ChatScreen$21$1$18$1(lazyListStateRememberLazyListState, state, continuation);
                composer2.updateRememberedValue(chatScreenKt$ChatScreen$21$1$18$1RememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            EffectsKt.LaunchedEffect(numValueOf, (Function2) chatScreenKt$ChatScreen$21$1$18$1RememberedValue, composer2, 0);
            if (ChatScreen$lambda$8(state).isEmpty()) {
                composer2.startReplaceGroup(-495713046);
                ComposerKt.sourceInformation(composer2, "1071@53929L3459");
                Modifier modifier2 = PaddingKt.padding-3ABfNKs(SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScope, Modifier.Companion, 1.0f, false, 2, (Object) null), f, 1, continuation), Dp.constructor-impl(24.0f));
                Alignment center = Alignment.Companion.getCenter();
                ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifier2);
                Function0 constructor2 = ComposeUiNode.Companion.getConstructor();
                String str11 = str4;
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str11);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                Composer composer8 = Updater.constructor-impl(composer2);
                Updater.set-impl(composer8, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl(composer8, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composer8.getInserting() || !Intrinsics.areEqual(composer8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composer8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composer8.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.set-impl(composer8, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScope boxScope = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, -1141773818, "C1078@54187L3183:ChatScreen.kt#2thlc2");
                Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
                Arrangement.Vertical center2 = Arrangement.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                Modifier modifier3 = Modifier.Companion;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(center2, centerHorizontally, composer2, 54);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifier3);
                Function0 constructor3 = ComposeUiNode.Companion.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str11);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                Composer composer9 = Updater.constructor-impl(composer2);
                Updater.set-impl(composer9, measurePolicyColumnMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl(composer9, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composer9.getInserting() || !Intrinsics.areEqual(composer9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composer9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composer9.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.set-impl(composer9, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -384784025, str5);
                ColumnScope columnScope2 = ColumnScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, 132461259, "C1082@54384L667,1096@55076L41,1099@55317L10,1101@55449L11,1097@55142L443,1104@55610L40,1107@55874L10,1108@55946L11,1105@55675L414,1111@56114L41,1117@56477L871:ChatScreen.kt#2thlc2");
                String str12 = str5;
                SurfaceKt.Surface-T9BRK9s(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(68.0f)), RoundedCornerShapeKt.getCircleShape(), Color.copy-wmQWz5c$default(ColorKt.Color(4279994175L), 0.1f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$1316021119$app(), composer2, 12583302, 120);
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(14.0f)), composer2, 6);
                String str13 = str10;
                TextKt.Text--4IGK_g(book != null ? "Chatting about \"" + book.getTitle() + "\"" : "Start the conversation", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurface-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.box-impl(TextAlign.Companion.getCenter-e0LSkKk()), 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getTitleMedium(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 64986);
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
                TextKt.Text--4IGK_g("Say hello to " + ChatScreen$lambda$71(mutableState11) + "! You can coordinate book pickup, ask questions, or discuss exchange details.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.box-impl(TextAlign.Companion.getCenter-e0LSkKk()), 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 0, 0, 65018);
                composer3 = composer;
                float f4 = 16.0f;
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), composer3, 6);
                List<String> listListOf2 = CollectionsKt.listOf(new String[]{"Hi " + ChatScreen$lambda$71(mutableState11) + "! Is this book available?", "Hello! Where would you like to meet up?", "Hi! Can you tell me more about its condition?"});
                Arrangement.Vertical vertical = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(6.0f));
                ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                Modifier modifier4 = Modifier.Companion;
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(vertical, Alignment.Companion.getStart(), composer3, 6);
                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer3, modifier4);
                Function0 constructor4 = ComposeUiNode.Companion.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str11);
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor4);
                } else {
                    composer3.useNode();
                }
                Composer composer10 = Updater.constructor-impl(composer3);
                Updater.set-impl(composer10, measurePolicyColumnMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl(composer10, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composer10.getInserting() || !Intrinsics.areEqual(composer10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composer10.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composer10.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.set-impl(composer10, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer3, -384784025, str12);
                ColumnScope columnScope3 = ColumnScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer3, -936109581, "C:ChatScreen.kt#2thlc2");
                composer3.startReplaceGroup(-722933372);
                ComposerKt.sourceInformation(composer3, "*1120@56687L21,1123@56934L11,1122@56841L169,1126@57150L142,1119@56625L667");
                for (final String str14 : listListOf2) {
                    String str15 = str13;
                    ComposerKt.sourceInformationMarkerStart(composer3, -1878142305, str15);
                    boolean zChanged3 = composer3.changed(str14);
                    Object objRememberedValue17 = composer3.rememberedValue();
                    if (zChanged3 || objRememberedValue17 == Composer.Companion.getEmpty()) {
                        objRememberedValue17 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda42
                            public final Object invoke() {
                                return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$240$lambda$239$lambda$238$lambda$237$lambda$235$lambda$234(str14, mutableState12);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue17);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    Shape shape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(f4));
                    ButtonColors buttonColors = ButtonDefaults.INSTANCE.outlinedButtonColors-ro_MJ88(Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getSurface-0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0L, 0L, composer, ButtonDefaults.$stable << 12, 14);
                    composer3 = composer;
                    ButtonKt.OutlinedButton((Function0) objRememberedValue17, (Modifier) null, false, shape, buttonColors, (ButtonElevation) null, (BorderStroke) null, PaddingKt.PaddingValues-YgX7TsA(Dp.constructor-impl(12.0f), Dp.constructor-impl(6.0f)), (MutableInteractionSource) null, ComposableLambdaKt.rememberComposableLambda(1375785848, true, new Function3() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda43
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$240$lambda$239$lambda$238$lambda$237$lambda$236(str14, (RowScope) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                        }
                    }, composer3, 54), composer3, 817889280, 358);
                    str13 = str15;
                    f4 = 16.0f;
                }
                composer3.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                composer3.endReplaceGroup();
                z4 = true;
                str7 = str13;
            } else {
                composer2.startReplaceGroup(-491168198);
                ComposerKt.sourceInformation(composer2, "1143@57850L25706,1134@57426L26130,1529@85264L242,1543@85846L3286,1537@85553L3579,1608@89236L11,1614@89462L6131,1607@89189L6404");
                Modifier modifier5 = PaddingKt.padding-VpY3zN4$default(SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScope, Modifier.Companion, 1.0f, false, 2, (Object) null), f, 1, (Object) null), Dp.constructor-impl(12.0f), f, 2, (Object) null);
                PaddingValues paddingValues2 = PaddingKt.PaddingValues-YgX7TsA$default(f, Dp.constructor-impl(12.0f), 1, (Object) null);
                Arrangement.Vertical vertical2 = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(8.0f));
                ComposerKt.sourceInformationMarkerStart(composer2, -570031809, str10);
                boolean zChanged4 = composer2.changed(state) | composer2.changed(state2) | composer2.changed(z2) | composer2.changedInstance(bookViewModel) | composer2.changedInstance(simpleDateFormat) | composer2.changedInstance(context) | composer2.changedInstance(book);
                Object objRememberedValue18 = composer2.rememberedValue();
                if (zChanged4 || objRememberedValue18 == Composer.Companion.getEmpty()) {
                    obj2 = null;
                    z3 = true;
                    obj = new Function1() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda45
                        public final Object invoke(Object obj4) {
                            return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$246$lambda$245(state, z2, columnScope, state2, simpleDateFormat, bookViewModel, context, book, (LazyListScope) obj4);
                        }
                    };
                    composer2.updateRememberedValue(obj);
                } else {
                    obj = objRememberedValue18;
                    obj2 = null;
                    z3 = true;
                }
                ComposerKt.sourceInformationMarkerEnd(composer2);
                z4 = z3;
                LazyDslKt.LazyColumn(modifier5, lazyListStateRememberLazyListState, paddingValues2, true, vertical2, (Alignment.Horizontal) null, (FlingBehavior) null, false, (Function1) obj, composer, 28032, 224);
                String strChatScreen$lambda$91 = ChatScreen$lambda$91(mutableState13);
                if (strChatScreen$lambda$91 != null) {
                    if (StringsKt.isBlank(strChatScreen$lambda$91)) {
                        i4 = -549301971;
                        c = 0;
                    } else {
                        composer.startReplaceGroup(-466258241);
                        ComposerKt.sourceInformation(composer, "1495@83743L11,1500@84015L875,1494@83692L1198");
                        obj2 = obj2;
                        c = 0;
                        SurfaceKt.Surface-T9BRK9s(PaddingKt.padding-VpY3zN4(SizeKt.fillMaxWidth$default(Modifier.Companion, f, z4 ? 1 : 0, obj2), Dp.constructor-impl(12.0f), Dp.constructor-impl(4.0f)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(79334887, z4, new Function2() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda47
                            public final Object invoke(Object obj4, Object obj5) {
                                return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$248(mutableState13, (Composer) obj4, ((Integer) obj5).intValue());
                            }
                        }, composer, 54), composer, 12582918, 120);
                        composer.endReplaceGroup();
                        i4 = -549301971;
                    }
                    String[] strArr = new String[5];
                    strArr[c] = "Okay, understood. 👍";
                    strArr[z4 ? 1 : 0] = "Sounds great! When can we meet?";
                    strArr[2] = "Can I inspect the condition?";
                    strArr[3] = "Is the book available?";
                    strArr[4] = "Thank you so much! 📚";
                    listListOf = CollectionsKt.listOf(strArr);
                    String strChatScreen$lambda$89 = ChatScreen$lambda$88(mutableState14);
                    ComposerKt.sourceInformationMarkerStart(composer, -569180025, str10);
                    zChanged = composer.changed(strChatScreen$lambda$89);
                    objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                        strChatScreen$lambda$88 = ChatScreen$lambda$88(mutableState14);
                        if (strChatScreen$lambda$88 != null && !StringsKt.isBlank(strChatScreen$lambda$88)) {
                            listListOf = CollectionsKt.plus(CollectionsKt.listOf("✨ " + ChatScreen$lambda$88(mutableState14)), listListOf);
                        }
                        composer.updateRememberedValue(listListOf);
                        objRememberedValue = listListOf;
                    }
                    list = (List) objRememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    Modifier modifier6 = PaddingKt.padding-VpY3zN4(SizeKt.fillMaxWidth$default(Modifier.Companion, f, z4 ? 1 : 0, obj2), Dp.constructor-impl(10.0f), Dp.constructor-impl(4.0f));
                    Arrangement.Horizontal horizontal = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(8.0f));
                    Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart(composer, -569158357, str10);
                    zChangedInstance = composer.changedInstance(list);
                    objRememberedValue2 = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda48
                            public final Object invoke(Object obj4) {
                                return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$256$lambda$255(list, mutableState9, mutableState12, (LazyListScope) obj4);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    str7 = str10;
                    LazyDslKt.LazyRow(modifier6, (LazyListState) null, (PaddingValues) null, false, horizontal, centerVertically, (FlingBehavior) null, false, (Function1) objRememberedValue2, composer, 221190, 206);
                    composer3 = composer;
                    SurfaceKt.Surface-T9BRK9s(WindowInsetsPadding_androidKt.imePadding(WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.fillMaxWidth$default(Modifier.Companion, f, z4 ? 1 : 0, obj2))), (Shape) null, MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0.0f, Dp.constructor-impl(4.0f), (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(1726199628, z4, new Function2() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda49
                        public final Object invoke(Object obj4, Object obj5) {
                            return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$268(str, z, book, bookViewModel, str2, mutableState12, mutableState15, mutableState16, mutableState17, (Composer) obj4, ((Integer) obj5).intValue());
                        }
                    }, composer3, 54), composer3, 12779520, 90);
                    composer3.endReplaceGroup();
                } else {
                    c = 0;
                    i4 = -549301971;
                }
                composer.startReplaceGroup(i4);
                composer.endReplaceGroup();
                String[] strArr2 = new String[5];
                strArr2[c] = "Okay, understood. 👍";
                strArr2[z4 ? 1 : 0] = "Sounds great! When can we meet?";
                strArr2[2] = "Can I inspect the condition?";
                strArr2[3] = "Is the book available?";
                strArr2[4] = "Thank you so much! 📚";
                listListOf = CollectionsKt.listOf(strArr2);
                String strChatScreen$lambda$810 = ChatScreen$lambda$88(mutableState14);
                ComposerKt.sourceInformationMarkerStart(composer, -569180025, str10);
                zChanged = composer.changed(strChatScreen$lambda$810);
                objRememberedValue = composer.rememberedValue();
                if (zChanged) {
                    strChatScreen$lambda$88 = ChatScreen$lambda$88(mutableState14);
                    if (strChatScreen$lambda$88 != null) {
                        listListOf = CollectionsKt.plus(CollectionsKt.listOf("✨ " + ChatScreen$lambda$88(mutableState14)), listListOf);
                    }
                    composer.updateRememberedValue(listListOf);
                    objRememberedValue = listListOf;
                } else {
                    strChatScreen$lambda$88 = ChatScreen$lambda$88(mutableState14);
                    if (strChatScreen$lambda$88 != null) {
                        listListOf = CollectionsKt.plus(CollectionsKt.listOf("✨ " + ChatScreen$lambda$88(mutableState14)), listListOf);
                    }
                    composer.updateRememberedValue(listListOf);
                    objRememberedValue = listListOf;
                }
                list = (List) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composer);
                Modifier modifier7 = PaddingKt.padding-VpY3zN4(SizeKt.fillMaxWidth$default(Modifier.Companion, f, z4 ? 1 : 0, obj2), Dp.constructor-impl(10.0f), Dp.constructor-impl(4.0f));
                Arrangement.Horizontal horizontal2 = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(8.0f));
                Alignment.Vertical centerVertically2 = Alignment.Companion.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(composer, -569158357, str10);
                zChangedInstance = composer.changedInstance(list);
                objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance) {
                    objRememberedValue2 = new Function1() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda48
                        public final Object invoke(Object obj4) {
                            return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$256$lambda$255(list, mutableState9, mutableState12, (LazyListScope) obj4);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda48
                        public final Object invoke(Object obj4) {
                            return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$256$lambda$255(list, mutableState9, mutableState12, (LazyListScope) obj4);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                str7 = str10;
                LazyDslKt.LazyRow(modifier7, (LazyListState) null, (PaddingValues) null, false, horizontal2, centerVertically2, (FlingBehavior) null, false, (Function1) objRememberedValue2, composer, 221190, 206);
                composer3 = composer;
                SurfaceKt.Surface-T9BRK9s(WindowInsetsPadding_androidKt.imePadding(WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.fillMaxWidth$default(Modifier.Companion, f, z4 ? 1 : 0, obj2))), (Shape) null, MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0.0f, Dp.constructor-impl(4.0f), (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(1726199628, z4, new Function2() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda49
                    public final Object invoke(Object obj4, Object obj5) {
                        return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$268(str, z, book, bookViewModel, str2, mutableState12, mutableState15, mutableState16, mutableState17, (Composer) obj4, ((Integer) obj5).intValue());
                    }
                }, composer3, 54), composer3, 12779520, 90);
                composer3.endReplaceGroup();
            }
            if (!ChatScreen$lambda$60(mutableState8) || book == 0) {
                composer3.startReplaceGroup(-549301971);
            } else {
                composer3.startReplaceGroup(-454379258);
                ComposerKt.sourceInformation(composer3, "1725@96041L249,1721@95681L623");
                String strChatScreen$lambda$14 = ChatScreen$lambda$13(state2);
                FeedbackTargetType feedbackTargetType = StringsKt.equals(strChatScreen$lambda$14 != null ? StringsKt.trim(strChatScreen$lambda$14).toString() : null, StringsKt.trim(book.getOwnerName()).toString(), z4) ? FeedbackTargetType.LENDER_TO_BORROWER : FeedbackTargetType.BORROWER_TO_LENDER_AND_BOOK;
                ComposerKt.sourceInformationMarkerStart(composer3, -568835154, str7);
                boolean zChangedInstance8 = composer3.changedInstance(bookViewModel) | composer3.changedInstance(book) | composer3.changedInstance(context);
                Object objRememberedValue19 = composer3.rememberedValue();
                if (zChangedInstance8 || objRememberedValue19 == Composer.Companion.getEmpty()) {
                    objRememberedValue19 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda50
                        public final Object invoke() {
                            return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$270$lambda$269(bookViewModel, book, context, mutableState8);
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue19);
                }
                ComposerKt.sourceInformationMarkerEnd(composer3);
                MutualFeedbackDialogKt.MutualFeedbackDialog(book, feedbackTargetType, bookViewModel, (Function0) objRememberedValue19, composer3, 0);
            }
            composer3.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$272$lambda$271$lambda$181$lambda$180(MutableState mutableState) {
        ChatScreen$lambda$16(mutableState, true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:91:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:92:0x05c3  */
    static final Unit ChatScreen$lambda$272$lambda$271$lambda$194(final MutableState mutableState, Book book, Composer composer, int i) {
        String str;
        String str2;
        String str3;
        int i2;
        final MutableState mutableState2;
        String str4;
        long jColor;
        final MutableState mutableState3;
        Composer composer2 = composer;
        ComposerKt.sourceInformation(composer2, "C785@38281L7261:ChatScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1696351563, i, -1, "com.example.ui.screens.ChatScreen.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:785)");
            }
            Modifier modifier = PaddingKt.padding-VpY3zN4(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(14.0f), Dp.constructor-impl(8.0f));
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
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
            ComposerKt.sourceInformationMarkerStart(composer2, -679399128, "C796@38879L11,797@38950L35,792@38652L2250,834@40928L40,836@40994L4218,909@45414L11,906@45238L282:ChatScreen.kt#2thlc2");
            Modifier modifier2 = BackgroundKt.background-bw27NRU$default(ClipKt.clip(SizeKt.size-VpY3zN4(Modifier.Companion, Dp.constructor-impl(46.0f), Dp.constructor-impl(64.0f)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(8.0f))), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), (Shape) null, 2, (Object) null);
            ComposerKt.sourceInformationMarkerStart(composer2, -21913398, "CC(remember):ChatScreen.kt#9igjgp");
            Object objRememberedValue = composer2.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda25
                    public final Object invoke() {
                        return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$194$lambda$193$lambda$183$lambda$182(mutableState);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Modifier modifier3 = ClickableKt.clickable-XHw0xAI$default(modifier2, false, (String) null, (Role) null, (Function0) objRememberedValue, 7, (Object) null);
            Alignment center = Alignment.Companion.getCenter();
            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifier3);
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
            Updater.set-impl(composer4, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer4, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer4.getInserting() || !Intrinsics.areEqual(composer4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composer4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composer4.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.set-impl(composer4, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScope boxScope = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, -911976903, "C:ChatScreen.kt#2thlc2");
            String imageUrl = book.getImageUrl();
            if (imageUrl == null || StringsKt.isBlank(imageUrl)) {
                str = "C101@5126L9:Row.kt#2w3rfo";
                str2 = "CC(remember):ChatScreen.kt#9igjgp";
                str3 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                i2 = 0;
                composer2.startReplaceGroup(-910630543);
                ComposerKt.sourceInformation(composer2, "828@40724L11,825@40542L304");
                IconKt.Icon-ww6aTOc(BookKt.getBook(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(24.0f)), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer2, 432, 0);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-911953902);
                ComposerKt.sourceInformation(composer2, "801@39177L322,807@39532L940");
                BookImageDisplayKt.BookImageDisplay(book.getImageUrl(), book.getTitle(), SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null), ContentScale.Companion.getCrop(), null, composer2, 3456, 16);
                str = "C101@5126L9:Row.kt#2w3rfo";
                str2 = "CC(remember):ChatScreen.kt#9igjgp";
                str3 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                i2 = 0;
                SurfaceKt.Surface-T9BRK9s(PaddingKt.padding-3ABfNKs(boxScope.align(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(20.0f)), Alignment.Companion.getBottomEnd()), Dp.constructor-impl(2.0f)), RoundedCornerShapeKt.getCircleShape(), Color.copy-wmQWz5c$default(Color.Companion.getBlack-0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableSingletons$ChatScreenKt.INSTANCE.m258getLambda$340319957$app(), composer, 12583296, 120);
                composer2 = composer;
                composer2.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(12.0f)), composer2, 6);
            Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.Companion, 1.0f, false, 2, (Object) null);
            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, i2);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, (String) r11);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, i2);
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierWeight$default);
            Function0 constructor3 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str3);
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
            Updater.set-impl(composer5, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer5, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer5.getInserting() || !Intrinsics.areEqual(composer5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composer5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composer5.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.set-impl(composer5, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, 1122241463, "C839@41174L10,837@41063L367,846@41579L10,847@41655L11,844@41459L397,851@41885L40,852@41954L3232:ChatScreen.kt#2thlc2");
            TextKt.Text--4IGK_g(book.getTitle(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.getEllipsis-gIe3tQ8(), false, 1, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getTitleSmall(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 3120, 55262);
            TextKt.Text--4IGK_g("by " + book.getAuthor(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.getEllipsis-gIe3tQ8(), false, 1, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 0, 3120, 55290);
            Composer composer6 = composer;
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(3.0f)), composer6, 6);
            Arrangement.Horizontal horizontal = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(6.0f));
            Alignment.Vertical centerVertically2 = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer6, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier4 = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontal, centerVertically2, composer6, 54);
            ComposerKt.sourceInformationMarkerStart(composer6, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer6.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer6, modifier4);
            Function0 constructor4 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer6, -692256719, str3);
            if (!(composer6.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer6.startReusableNode();
            if (composer6.getInserting()) {
                composer6.createNode(constructor4);
            } else {
                composer6.useNode();
            }
            Composer composer7 = Updater.constructor-impl(composer6);
            Updater.set-impl(composer7, measurePolicyRowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer7, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer7.getInserting() || !Intrinsics.areEqual(composer7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composer7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composer7.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.set-impl(composer7, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer6, -407840262, str);
            RowScope rowScope2 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer6, 141880060, "C880@43687L11,882@43873L35,879@43620L1536:ChatScreen.kt#2thlc2");
            String condition = book.getCondition();
            if (condition == null || StringsKt.isBlank(condition)) {
                mutableState2 = mutableState;
                str4 = str2;
                composer6.startReplaceGroup(99938485);
            } else {
                composer6.startReplaceGroup(141866946);
                ComposerKt.sourceInformation(composer6, "867@42942L35,868@43016L536,864@42713L839");
                final String condition2 = book.getCondition();
                String upperCase = condition2.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                switch (upperCase) {
                    case "NEW":
                        jColor = ColorKt.Color(4281236786L);
                        break;
                    case "FAIR":
                        jColor = ColorKt.Color(4293880832L);
                        break;
                    case "GOOD":
                        jColor = ColorKt.Color(4279592384L);
                        break;
                    case "MINT":
                        jColor = ColorKt.Color(4281236786L);
                        break;
                    default:
                        jColor = ColorKt.Color(4285887861L);
                        break;
                }
                final long j = jColor;
                long j2 = Color.copy-wmQWz5c$default(j, 0.15f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
                Shape shape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(4.0f));
                Modifier modifier5 = Modifier.Companion;
                String str5 = str2;
                ComposerKt.sourceInformationMarkerStart(composer6, -1103780624, str5);
                Object objRememberedValue2 = composer6.rememberedValue();
                if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                    mutableState3 = mutableState;
                    objRememberedValue2 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda26
                        public final Object invoke() {
                            return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$194$lambda$193$lambda$192$lambda$191$lambda$186$lambda$185(mutableState3);
                        }
                    };
                    composer6.updateRememberedValue(objRememberedValue2);
                } else {
                    mutableState3 = mutableState;
                }
                ComposerKt.sourceInformationMarkerEnd(composer6);
                Function2 function2RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(843680983, true, new Function2() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda27
                    public final Object invoke(Object obj, Object obj2) {
                        return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$194$lambda$193$lambda$192$lambda$191$lambda$188(condition2, j, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer6, 54);
                mutableState2 = mutableState3;
                str4 = str5;
                SurfaceKt.Surface-T9BRK9s(ClickableKt.clickable-XHw0xAI$default(modifier5, false, (String) null, (Role) null, (Function0) objRememberedValue2, 7, (Object) null), shape, j2, 0L, 0.0f, 0.0f, (BorderStroke) null, function2RememberComposableLambda, composer, 12582912, 120);
                composer6 = composer;
            }
            composer6.endReplaceGroup();
            long j3 = Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer6, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), 0.85f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
            Shape shape2 = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(4.0f));
            Modifier modifier6 = Modifier.Companion;
            ComposerKt.sourceInformationMarkerStart(composer6, -1103750832, str4);
            Object objRememberedValue3 = composer6.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda28
                    public final Object invoke() {
                        return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$194$lambda$193$lambda$192$lambda$191$lambda$190$lambda$189(mutableState2);
                    }
                };
                composer6.updateRememberedValue(objRememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(composer6);
            SurfaceKt.Surface-T9BRK9s(ClickableKt.clickable-XHw0xAI$default(modifier6, false, (String) null, (Role) null, (Function0) objRememberedValue3, 7, (Object) null), shape2, j3, 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableSingletons$ChatScreenKt.INSTANCE.m257getLambda$333450478$app(), composer, 12582912, 120);
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
            IconKt.Icon-ww6aTOc(ChevronRightKt.getChevronRight(Icons.INSTANCE.getDefault()), "View Details", SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(20.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOutline-0d7_KjU(), composer, 432, 0);
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

    static final Unit ChatScreen$lambda$272$lambda$271$lambda$194$lambda$193$lambda$183$lambda$182(MutableState mutableState) {
        ChatScreen$lambda$19(mutableState, true);
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$272$lambda$271$lambda$194$lambda$193$lambda$192$lambda$191$lambda$186$lambda$185(MutableState mutableState) {
        ChatScreen$lambda$19(mutableState, true);
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$272$lambda$271$lambda$194$lambda$193$lambda$192$lambda$191$lambda$188(String str, long j, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C869@43058L456:ChatScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(843680983, i, -1, "com.example.ui.screens.ChatScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:869)");
            }
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (lowerCase.length() > 0) {
                StringBuilder sb = new StringBuilder();
                String strValueOf = String.valueOf(lowerCase.charAt(0));
                Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
                String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                StringBuilder sbAppend = sb.append((Object) upperCase);
                String strSubstring = lowerCase.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                lowerCase = sbAppend.append(strSubstring).toString();
            }
            String str2 = lowerCase;
            TextKt.Text--4IGK_g(str2, PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(4.0f), Dp.constructor-impl(1.0f)), j, TextUnitKt.getSp(10), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 199728, 0, 131024);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$272$lambda$271$lambda$194$lambda$193$lambda$192$lambda$191$lambda$190$lambda$189(MutableState mutableState) {
        ChatScreen$lambda$19(mutableState, true);
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$272$lambda$271$lambda$199$lambda$198(BookViewModel bookViewModel, Book book, Context context) {
        bookViewModel.requestBook(book);
        Toast.makeText(context, "Borrow request submitted to owner!", 0).show();
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$272$lambda$271$lambda$201$lambda$200(BookViewModel bookViewModel, Book book, Context context) {
        bookViewModel.acceptRequest(book);
        Toast.makeText(context, "Swap request accepted!", 0).show();
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$272$lambda$271$lambda$203$lambda$202(BookViewModel bookViewModel, Book book, Context context) {
        bookViewModel.declineRequest(book);
        Toast.makeText(context, "Swap request declined.", 0).show();
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$272$lambda$271$lambda$205$lambda$204(ManagedActivityResultLauncher managedActivityResultLauncher, MutableState mutableState) {
        mutableState.setValue("HANDOVER");
        managedActivityResultLauncher.launch((Object) null);
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$272$lambda$271$lambda$207$lambda$206(MutableState mutableState, MutableState mutableState2) {
        mutableState.setValue("HANDOVER");
        ChatScreen$lambda$28(mutableState2, true);
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$272$lambda$271$lambda$209$lambda$208(MutableState mutableState, MutableState mutableState2) {
        mutableState.setValue("HANDOVER");
        ChatScreen$lambda$34(mutableState2, true);
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$272$lambda$271$lambda$211$lambda$210(BookViewModel bookViewModel, Book book, Context context) {
        bookViewModel.acceptTransfer(book);
        Toast.makeText(context, "Handover accepted! Enjoy reading '" + book.getTitle() + "'!", 1).show();
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$272$lambda$271$lambda$213$lambda$212(ManagedActivityResultLauncher managedActivityResultLauncher, MutableState mutableState) {
        mutableState.setValue("BORROWER_RETURN");
        managedActivityResultLauncher.launch((Object) null);
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$272$lambda$271$lambda$215$lambda$214(MutableState mutableState, MutableState mutableState2) {
        mutableState.setValue("RETURN");
        ChatScreen$lambda$28(mutableState2, true);
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$272$lambda$271$lambda$217$lambda$216(MutableState mutableState, MutableState mutableState2) {
        mutableState.setValue("RETURN");
        ChatScreen$lambda$34(mutableState2, true);
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$272$lambda$271$lambda$219$lambda$218(MutableState mutableState) {
        ChatScreen$lambda$61(mutableState, true);
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$272$lambda$271$lambda$221$lambda$220(MutableState mutableState) {
        ChatScreen$lambda$22(mutableState, true);
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$272$lambda$271$lambda$228(final Book book, final Context context, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C985@49057L3274:ChatScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2046961821, i, -1, "com.example.ui.screens.ChatScreen.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:985)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f));
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
            ComposerKt.sourceInformationMarkerStart(composer, -1967181680, "C990@49335L1434,1023@51735L48,1012@50848L763,1011@50798L1507:ChatScreen.kt#2thlc2");
            Alignment.Vertical centerVertically2 = Alignment.Companion.getCenterVertically();
            Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.Companion, 1.0f, false, 2, (Object) null);
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer, 48);
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
            Updater.set-impl(composer3, measurePolicyRowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer3, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composer3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composer3.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.set-impl(composer3, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope2 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1061551224, "C991@49453L111,992@49597L39,993@49669L1070:ChatScreen.kt#2thlc2");
            IconKt.Icon-ww6aTOc(PlaceKt.getPlace(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(20.0f)), ColorKt.Color(4279994175L), composer, 3504, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier2 = Modifier.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
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
            Updater.set-impl(composer4, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer4, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer4.getInserting() || !Intrinsics.areEqual(composer4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composer4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composer4.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.set-impl(composer4, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1742271291, "C997@49943L10,994@49714L356,1003@50338L10,1005@50480L11,1001@50211L494:ChatScreen.kt#2thlc2");
            TextKt.Text--4IGK_g("🤝 Agreed Spot: " + book.getAgreedMeetupSpot(), (Modifier) null, ColorKt.Color(4279994175L), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelMedium(), composer, 196992, 0, 65498);
            String agreedMeetupAddress = book.getAgreedMeetupAddress();
            if (agreedMeetupAddress == null) {
                agreedMeetupAddress = "Public Verified Spot";
            }
            TextKt.Text--4IGK_g(agreedMeetupAddress, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.getEllipsis-gIe3tQ8(), false, 1, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 3072, 3120, 55282);
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
            Shape shape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(8.0f));
            ButtonColors buttonColors = ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(ColorKt.Color(4279994175L), 0L, 0L, 0L, composer, (ButtonDefaults.$stable << 12) | 6, 14);
            PaddingValues paddingValues = PaddingKt.PaddingValues-YgX7TsA(Dp.constructor-impl(10.0f), Dp.constructor-impl(4.0f));
            Modifier modifier3 = SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(32.0f));
            ComposerKt.sourceInformationMarkerStart(composer, 629325396, "CC(remember):ChatScreen.kt#9igjgp");
            boolean zChangedInstance = composer.changedInstance(book) | composer.changedInstance(context);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda17
                    public final Object invoke() {
                        return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$228$lambda$227$lambda$226$lambda$225(book, context);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ButtonKt.Button((Function0) objRememberedValue, modifier3, false, shape, buttonColors, (ButtonElevation) null, (BorderStroke) null, paddingValues, (MutableInteractionSource) null, ComposableSingletons$ChatScreenKt.INSTANCE.m244getLambda$1240121655$app(), composer, 817889328, 356);
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

    static final Unit ChatScreen$lambda$272$lambda$271$lambda$228$lambda$227$lambda$226$lambda$225(Book book, Context context) {
        String agreedMeetupSpot = book.getAgreedMeetupSpot();
        String agreedMeetupAddress = book.getAgreedMeetupAddress();
        if (agreedMeetupAddress == null) {
            agreedMeetupAddress = "";
        }
        String str = agreedMeetupSpot + ", " + agreedMeetupAddress;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + Uri.encode(str)));
        intent.setPackage("com.google.android.apps.maps");
        try {
            context.startActivity(intent);
        } catch (Exception unused) {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.google.com/maps/search/?api=1&query=" + Uri.encode(str))));
        }
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$272$lambda$271$lambda$230$lambda$229(MutableState mutableState) {
        ChatScreen$lambda$6(mutableState, true);
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$272$lambda$271$lambda$232(boolean z, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1041@52680L943:ChatScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1763834096, i, -1, "com.example.ui.screens.ChatScreen.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:1041)");
            }
            Modifier modifier = PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(12.0f), Dp.constructor-impl(6.0f));
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Arrangement.Horizontal center = Arrangement.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer, 54);
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
            ComposerKt.sourceInformationMarkerStart(composer, 1358481408, "C1046@52942L274,1052@53237L39,1053@53297L308:ChatScreen.kt#2thlc2");
            IconKt.Icon-ww6aTOc(SecurityKt.getSecurity(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(14.0f)), z ? ColorKt.Color(4280669030L) : ColorKt.Color(4279193906L), composer, 432, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextKt.Text--4IGK_g("AI safety active. Keep messages respectful. Tap for rules.", (Modifier) null, z ? ColorKt.Color(4280669030L) : ColorKt.Color(4279193906L), TextUnitKt.getSp(11), (FontStyle) null, FontWeight.Companion.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 199686, 0, 131026);
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

    static final Unit ChatScreen$lambda$272$lambda$271$lambda$240$lambda$239$lambda$238$lambda$237$lambda$235$lambda$234(String str, MutableState mutableState) {
        mutableState.setValue(str);
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$272$lambda$271$lambda$240$lambda$239$lambda$238$lambda$237$lambda$236(String str, RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$OutlinedButton");
        ComposerKt.sourceInformation(composer, "C1127@57238L11,1127@57188L70:ChatScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1375785848, i, -1, "com.example.ui.screens.ChatScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:1127)");
            }
            TextKt.Text--4IGK_g(str, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 3072, 0, 131058);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$272$lambda$271$lambda$246$lambda$245(State state, final boolean z, final ColumnScope columnScope, final State state2, final SimpleDateFormat simpleDateFormat, final BookViewModel bookViewModel, final Context context, final Book book, LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyColumn");
        final List listReversed = CollectionsKt.reversed(ChatScreen$lambda$8(state));
        final Function1 function1 = new Function1() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda80
            public final Object invoke(Object obj) {
                return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$246$lambda$245$lambda$242((Message) obj);
            }
        };
        final ChatScreenKt$ChatScreen$lambda$272$lambda$271$lambda$246$lambda$245$$inlined$items$default$1 chatScreenKt$ChatScreen$lambda$272$lambda$271$lambda$246$lambda$245$$inlined$items$default$1 = new Function1() { // from class: com.example.ui.screens.ChatScreenKt$ChatScreen$lambda$272$lambda$271$lambda$246$lambda$245$$inlined$items$default$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final Void m178invoke(Message message) {
                return null;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m178invoke((Message) obj);
            }
        };
        lazyListScope.items(listReversed.size(), new Function1<Integer, Object>() { // from class: com.example.ui.screens.ChatScreenKt$ChatScreen$lambda$272$lambda$271$lambda$246$lambda$245$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i) {
                return function1.invoke(listReversed.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: com.example.ui.screens.ChatScreenKt$ChatScreen$lambda$272$lambda$271$lambda$246$lambda$245$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i) {
                return chatScreenKt$ChatScreen$lambda$272$lambda$271$lambda$246$lambda$245$$inlined$items$default$1.invoke(listReversed.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.screens.ChatScreenKt$ChatScreen$lambda$272$lambda$271$lambda$246$lambda$245$$inlined$items$default$4
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
                long jColor;
                RoundedCornerShape roundedCornerShape;
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
                final Message message = (Message) listReversed.get(i);
                composer.startReplaceGroup(-1966324046);
                ComposerKt.sourceInformation(composer, "C*1160@58899L6,1161@58928L24596,1158@58756L24768:ChatScreen.kt#2thlc2");
                final boolean zAreEqual = Intrinsics.areEqual(message.getSender(), ChatScreenKt.ChatScreen$lambda$13(state2));
                boolean z2 = z;
                if (zAreEqual) {
                    jColor = ColorKt.Color(z2 ? 4278213707L : 4292476371L);
                } else {
                    jColor = z2 ? ColorKt.Color(4280298547L) : Color.Companion.getWhite-0d7_KjU();
                }
                final long j = jColor;
                final long jColor2 = ColorKt.Color(z ? 4293520879L : 4279311137L);
                if (zAreEqual) {
                    roundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape-a9UjIt4(Dp.constructor-impl(16.0f), Dp.constructor-impl(4.0f), Dp.constructor-impl(16.0f), Dp.constructor-impl(16.0f));
                } else {
                    roundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape-a9UjIt4(Dp.constructor-impl(4.0f), Dp.constructor-impl(16.0f), Dp.constructor-impl(16.0f), Dp.constructor-impl(16.0f));
                }
                final RoundedCornerShape roundedCornerShape2 = roundedCornerShape;
                ColumnScope columnScope2 = columnScope;
                EnterTransition enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(220, 0, (Easing) null, 6, (Object) null), 0.0f, 2, (Object) null);
                FiniteAnimationSpec finiteAnimationSpecTween$default = AnimationSpecKt.tween$default(220, 0, (Easing) null, 6, (Object) null);
                ComposerKt.sourceInformationMarkerStart(composer, 1044951820, "CC(remember):ChatScreen.kt#9igjgp");
                ChatScreenKt$ChatScreen$21$1$20$1$2$1$1 chatScreenKt$ChatScreen$21$1$20$1$2$1$1RememberedValue = composer.rememberedValue();
                if (chatScreenKt$ChatScreen$21$1$20$1$2$1$1RememberedValue == Composer.Companion.getEmpty()) {
                    chatScreenKt$ChatScreen$21$1$20$1$2$1$1RememberedValue = new Function1<Integer, Integer>() { // from class: com.example.ui.screens.ChatScreenKt$ChatScreen$21$1$20$1$2$1$1
                        public final Integer invoke(int i4) {
                            return 30;
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return invoke(((Number) obj).intValue());
                        }
                    };
                    composer.updateRememberedValue(chatScreenKt$ChatScreen$21$1$20$1$2$1$1RememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                EnterTransition enterTransitionPlus = enterTransitionFadeIn$default.plus(EnterExitTransitionKt.slideInVertically(finiteAnimationSpecTween$default, (Function1) chatScreenKt$ChatScreen$21$1$20$1$2$1$1RememberedValue));
                final SimpleDateFormat simpleDateFormat2 = simpleDateFormat;
                final BookViewModel bookViewModel2 = bookViewModel;
                final Context context2 = context;
                final Book book2 = book;
                AnimatedVisibilityKt.AnimatedVisibility(columnScope2, true, (Modifier) null, enterTransitionPlus, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(-59455362, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.example.ui.screens.ChatScreenKt$ChatScreen$21$1$20$1$2$2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, int i4) {
                        long j2;
                        long j3;
                        Intrinsics.checkNotNullParameter(animatedVisibilityScope, "$this$AnimatedVisibility");
                        ComposerKt.sourceInformation(composer2, "C1162@58954L24548:ChatScreen.kt#2thlc2");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-59455362, i4, -1, "com.example.ui.screens.ChatScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:1162)");
                        }
                        Modifier modifier = PaddingKt.padding-VpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), 0.0f, Dp.constructor-impl(4.0f), 1, (Object) null);
                        Alignment centerEnd = zAreEqual ? Alignment.Companion.getCenterEnd() : Alignment.Companion.getCenterStart();
                        final Message message2 = message;
                        final boolean z3 = zAreEqual;
                        Shape shape = roundedCornerShape2;
                        long j4 = j;
                        final SimpleDateFormat simpleDateFormat3 = simpleDateFormat2;
                        final BookViewModel bookViewModel3 = bookViewModel2;
                        final Context context3 = context2;
                        final Book book3 = book2;
                        final long j5 = jColor2;
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(centerEnd, false);
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
                        ComposerKt.sourceInformationMarkerStart(composer2, -1320779467, "C:ChatScreen.kt#2thlc2");
                        if (Intrinsics.areEqual(message2.getMessageType(), "SWAP_PROPOSAL")) {
                            composer2.startReplaceGroup(-1321329966);
                            ComposerKt.sourceInformation(composer2, "1172@59686L4762,1167@59284L5164");
                            Shape shape2 = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(16.0f));
                            if (z3) {
                                composer2.startReplaceGroup(-735359148);
                                ComposerKt.sourceInformation(composer2, "1169@59434L11");
                                j3 = MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU();
                            } else {
                                composer2.startReplaceGroup(-735357610);
                                ComposerKt.sourceInformation(composer2, "1169@59482L11");
                                j3 = MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getSecondaryContainer-0d7_KjU();
                            }
                            composer2.endReplaceGroup();
                            SurfaceKt.Surface-T9BRK9s(SizeKt.widthIn-VpY3zN4$default(Modifier.Companion, 0.0f, Dp.constructor-impl(280.0f), 1, (Object) null), shape2, j3, 0L, 0.0f, Dp.constructor-impl(2.0f), (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(419037242, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.ui.screens.ChatScreenKt$ChatScreen$21$1$20$1$2$2$1$1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i5) {
                                    long jColor3;
                                    final Message message3;
                                    ComposerKt.sourceInformation(composer4, "C1173@59724L4690:ChatScreen.kt#2thlc2");
                                    if ((i5 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(419037242, i5, -1, "com.example.ui.screens.ChatScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:1173)");
                                    }
                                    Modifier modifier2 = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(12.0f));
                                    boolean z4 = z3;
                                    final Message message4 = message2;
                                    SimpleDateFormat simpleDateFormat4 = simpleDateFormat3;
                                    final BookViewModel bookViewModel4 = bookViewModel3;
                                    ComposerKt.sourceInformationMarkerStart(composer4, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer4, 0);
                                    ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifier2);
                                    Function0 constructor2 = ComposeUiNode.Companion.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                    if (!(composer4.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor2);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composer5 = Updater.constructor-impl(composer4);
                                    Updater.set-impl(composer5, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                                    Updater.set-impl(composer5, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                    Function2 setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                    if (composer5.getInserting() || !Intrinsics.areEqual(composer5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composer5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composer5.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.set-impl(composer5, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer4, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                    ColumnScope columnScope3 = ColumnScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer4, -59329208, "C1174@59809L503,1179@60353L40,1180@60434L1985,1220@63896L40,1223@64140L11,1221@63977L399:ChatScreen.kt#2thlc2");
                                    Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                                    ComposerKt.sourceInformationMarkerStart(composer4, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                    Modifier modifier3 = Modifier.Companion;
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer4, 48);
                                    ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer4, modifier3);
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
                                    Composer composer6 = Updater.constructor-impl(composer4);
                                    Updater.set-impl(composer6, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                                    Updater.set-impl(composer6, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                    Function2 setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                    if (composer6.getInserting() || !Intrinsics.areEqual(composer6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                        composer6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        composer6.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    }
                                    Updater.set-impl(composer6, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer4, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                    RowScope rowScope = RowScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer4, -311636712, "C1175@60020L11,1175@59907L133,1176@60085L39,1177@60248L10,1177@60169L101:ChatScreen.kt#2thlc2");
                                    IconKt.Icon-ww6aTOc(AutoAwesomeKt.getAutoAwesome(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), MaterialTheme.INSTANCE.getColorScheme(composer4, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer4, 432, 0);
                                    SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer4, 6);
                                    TextKt.Text--4IGK_g("Book Swap Proposal", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getTitleSmall(), composer4, 196614, 0, 65502);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    composer4.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer4, 6);
                                    Alignment.Vertical centerVertically2 = Alignment.Companion.getCenterVertically();
                                    ComposerKt.sourceInformationMarkerStart(composer4, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                    Modifier modifier4 = Modifier.Companion;
                                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer4, 48);
                                    ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer4, modifier4);
                                    Function0 constructor4 = ComposeUiNode.Companion.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                    if (!(composer4.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor4);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composer7 = Updater.constructor-impl(composer4);
                                    Updater.set-impl(composer7, measurePolicyRowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                                    Updater.set-impl(composer7, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                    Function2 setCompositeKeyHash4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                    if (composer7.getInserting() || !Intrinsics.areEqual(composer7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                        composer7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                        composer7.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                    }
                                    Updater.set-impl(composer7, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer4, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                    RowScope rowScope2 = RowScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer4, -1893970683, "C1191@61292L1085:ChatScreen.kt#2thlc2");
                                    String swapOfferedBookImageUrl = message4.getSwapOfferedBookImageUrl();
                                    String str = swapOfferedBookImageUrl;
                                    if (str == null || StringsKt.isBlank(str)) {
                                        composer4.startReplaceGroup(-1954076615);
                                    } else {
                                        composer4.startReplaceGroup(-1893901926);
                                        ComposerKt.sourceInformation(composer4, "1183@60690L422,1189@61161L40");
                                        BookImageDisplayKt.BookImageDisplay(swapOfferedBookImageUrl, null, ClipKt.clip(SizeKt.size-VpY3zN4(Modifier.Companion, Dp.constructor-impl(44.0f), Dp.constructor-impl(60.0f)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(6.0f))), ContentScale.Companion.getCrop(), null, composer4, 3120, 16);
                                        SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f)), composer4, 6);
                                    }
                                    composer4.endReplaceGroup();
                                    Modifier modifierWeight$default = RowScope.weight$default(rowScope2, Modifier.Companion, 1.0f, false, 2, (Object) null);
                                    ComposerKt.sourceInformationMarkerStart(composer4, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer4, 0);
                                    ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap5 = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer4, modifierWeight$default);
                                    Function0 constructor5 = ComposeUiNode.Companion.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                    if (!(composer4.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor5);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composer8 = Updater.constructor-impl(composer4);
                                    Updater.set-impl(composer8, measurePolicyColumnMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                                    Updater.set-impl(composer8, currentCompositionLocalMap5, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                    Function2 setCompositeKeyHash5 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                    if (composer8.getInserting() || !Intrinsics.areEqual(composer8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                        composer8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                        composer8.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                    }
                                    Updater.set-impl(composer8, modifierMaterializeModifier5, ComposeUiNode.Companion.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer4, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                    ColumnScope columnScope4 = ColumnScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer4, -1945597670, "C1192@61486L10,1192@61381L141,1193@61648L10,1193@61692L11,1193@61571L150,1199@62287L10,1199@62187L144:ChatScreen.kt#2thlc2");
                                    String swapOfferedBookTitle = message4.getSwapOfferedBookTitle();
                                    if (swapOfferedBookTitle == null) {
                                        swapOfferedBookTitle = "Offered Book";
                                    }
                                    TextKt.Text--4IGK_g(swapOfferedBookTitle, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getBodyMedium(), composer4, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 3072, 57310);
                                    Integer borrowDurationDays = message4.getBorrowDurationDays();
                                    TextKt.Text--4IGK_g("Duration: " + (borrowDurationDays != null ? borrowDurationDays.intValue() : 14) + " days", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer4, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getBodySmall(), composer4, 0, 0, 65530);
                                    String offerStatus = message4.getOfferStatus();
                                    if (Intrinsics.areEqual(offerStatus, "ACCEPTED")) {
                                        composer4.startReplaceGroup(214348452);
                                        composer4.endReplaceGroup();
                                        jColor3 = ColorKt.Color(4279994175L);
                                    } else if (Intrinsics.areEqual(offerStatus, "DECLINED")) {
                                        composer4.startReplaceGroup(214351960);
                                        ComposerKt.sourceInformation(composer4, "1196@61977L11");
                                        jColor3 = MaterialTheme.INSTANCE.getColorScheme(composer4, MaterialTheme.$stable).getError-0d7_KjU();
                                        composer4.endReplaceGroup();
                                    } else {
                                        composer4.startReplaceGroup(214354906);
                                        ComposerKt.sourceInformation(composer4, "1197@62069L11");
                                        jColor3 = MaterialTheme.INSTANCE.getColorScheme(composer4, MaterialTheme.$stable).getPrimary-0d7_KjU();
                                        composer4.endReplaceGroup();
                                    }
                                    long j6 = jColor3;
                                    String offerStatus2 = message4.getOfferStatus();
                                    if (offerStatus2 == null) {
                                        offerStatus2 = "PENDING";
                                    }
                                    TextKt.Text--4IGK_g("Status: " + offerStatus2, (Modifier) null, j6, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getLabelMedium(), composer4, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
                                    Composer composer9 = composer4;
                                    ComposerKt.sourceInformationMarkerEnd(composer9);
                                    ComposerKt.sourceInformationMarkerEnd(composer9);
                                    composer9.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer9);
                                    ComposerKt.sourceInformationMarkerEnd(composer9);
                                    ComposerKt.sourceInformationMarkerEnd(composer9);
                                    ComposerKt.sourceInformationMarkerEnd(composer9);
                                    ComposerKt.sourceInformationMarkerEnd(composer9);
                                    composer9.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer9);
                                    ComposerKt.sourceInformationMarkerEnd(composer9);
                                    ComposerKt.sourceInformationMarkerEnd(composer9);
                                    if (z4 || !(message4.getOfferStatus() == null || Intrinsics.areEqual(message4.getOfferStatus(), "PENDING"))) {
                                        message3 = message4;
                                        composer9.startReplaceGroup(-118802306);
                                    } else {
                                        composer9.startReplaceGroup(-56726635);
                                        ComposerKt.sourceInformation(composer9, "1203@62580L41,1204@62666L1147");
                                        SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f)), composer9, 6);
                                        Arrangement.Horizontal horizontal = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(8.0f));
                                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
                                        ComposerKt.sourceInformationMarkerStart(composer9, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                        MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(horizontal, Alignment.Companion.getTop(), composer9, 6);
                                        ComposerKt.sourceInformationMarkerStart(composer9, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer9, 0);
                                        CompositionLocalMap currentCompositionLocalMap6 = composer9.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer9, modifierFillMaxWidth$default);
                                        Function0 constructor6 = ComposeUiNode.Companion.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer9, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                        if (!(composer9.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer9.startReusableNode();
                                        if (composer9.getInserting()) {
                                            composer9.createNode(constructor6);
                                        } else {
                                            composer9.useNode();
                                        }
                                        Composer composer10 = Updater.constructor-impl(composer9);
                                        Updater.set-impl(composer10, measurePolicyRowMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
                                        Updater.set-impl(composer10, currentCompositionLocalMap6, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                        Function2 setCompositeKeyHash6 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                        if (composer10.getInserting() || !Intrinsics.areEqual(composer10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                            composer10.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                            composer10.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                                        }
                                        Updater.set-impl(composer10, modifierMaterializeModifier6, ComposeUiNode.Companion.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer9, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                        RowScope rowScope3 = RowScopeInstance.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(composer9, -2077814689, "C1206@62878L46,1208@63086L48,1205@62808L513,1213@63448L47,1212@63370L397:ChatScreen.kt#2thlc2");
                                        ComposerKt.sourceInformationMarkerStart(composer9, 348617043, "CC(remember):ChatScreen.kt#9igjgp");
                                        boolean zChangedInstance = composer9.changedInstance(bookViewModel4) | composer9.changedInstance(message4);
                                        Object objRememberedValue = composer9.rememberedValue();
                                        if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.ChatScreenKt$ChatScreen$21$1$20$1$2$2$1$1$1$3$1$1
                                                public /* bridge */ /* synthetic */ Object invoke() {
                                                    m171invoke();
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                                public final void m171invoke() {
                                                    bookViewModel4.respondToSwapProposal(message4, true);
                                                }
                                            };
                                            composer9.updateRememberedValue(objRememberedValue);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(composer9);
                                        message3 = message4;
                                        ButtonKt.Button((Function0) objRememberedValue, RowScope.weight$default(rowScope3, Modifier.Companion, 1.0f, false, 2, (Object) null), false, (Shape) null, ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(ColorKt.Color(4279994175L), 0L, 0L, 0L, composer4, (ButtonDefaults.$stable << 12) | 6, 14), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$648401269$app(), composer4, 805306368, 492);
                                        ComposerKt.sourceInformationMarkerStart(composer4, 348635284, "CC(remember):ChatScreen.kt#9igjgp");
                                        boolean zChangedInstance2 = composer4.changedInstance(bookViewModel4) | composer4.changedInstance(message3);
                                        Object objRememberedValue2 = composer4.rememberedValue();
                                        if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                                            objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.ChatScreenKt$ChatScreen$21$1$20$1$2$2$1$1$1$3$2$1
                                                public /* bridge */ /* synthetic */ Object invoke() {
                                                    m172invoke();
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                                public final void m172invoke() {
                                                    bookViewModel4.respondToSwapProposal(message3, false);
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue2);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ButtonKt.OutlinedButton((Function0) objRememberedValue2, RowScope.weight$default(rowScope3, Modifier.Companion, 1.0f, false, 2, (Object) null), false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$176807091$app(), composer4, 805306368, 508);
                                        composer9 = composer4;
                                        ComposerKt.sourceInformationMarkerEnd(composer9);
                                        ComposerKt.sourceInformationMarkerEnd(composer9);
                                        composer9.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer9);
                                        ComposerKt.sourceInformationMarkerEnd(composer9);
                                        ComposerKt.sourceInformationMarkerEnd(composer9);
                                    }
                                    composer9.endReplaceGroup();
                                    SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer9, 6);
                                    String str2 = simpleDateFormat4.format(new Date(message3.getTimestamp()));
                                    Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                                    TextKt.Text--4IGK_g(str2, columnScope3.align(Modifier.Companion, Alignment.Companion.getEnd()), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer9, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, (Object) null), TextUnitKt.getSp(9), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer4, 3072, 0, 131056);
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
                            }, composer2, 54), composer2, 12779526, 88);
                            composer2.endReplaceGroup();
                        } else if (Intrinsics.areEqual(message2.getMessageType(), "SAFE_MEETUP_PROPOSAL")) {
                            composer2.startReplaceGroup(-1315757158);
                            ComposerKt.sourceInformation(composer2, "1235@64967L15538,1230@64565L15940");
                            Shape shape3 = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(16.0f));
                            if (z3) {
                                composer2.startReplaceGroup(-735190156);
                                ComposerKt.sourceInformation(composer2, "1232@64715L11");
                                j2 = MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU();
                            } else {
                                composer2.startReplaceGroup(-735188618);
                                ComposerKt.sourceInformation(composer2, "1232@64763L11");
                                j2 = MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getSecondaryContainer-0d7_KjU();
                            }
                            composer2.endReplaceGroup();
                            SurfaceKt.Surface-T9BRK9s(SizeKt.widthIn-VpY3zN4$default(Modifier.Companion, 0.0f, Dp.constructor-impl(300.0f), 1, (Object) null), shape3, j2, 0L, 0.0f, Dp.constructor-impl(2.0f), (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-937511773, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.ui.screens.ChatScreenKt$ChatScreen$21$1$20$1$2$2$1$2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: Code duplicated, block: B:109:0x0913  */
                                /* JADX WARN: Code duplicated, block: B:112:0x091f  */
                                /* JADX WARN: Code duplicated, block: B:113:0x0923  */
                                /* JADX WARN: Code duplicated, block: B:118:0x0956  */
                                /* JADX WARN: Code duplicated, block: B:123:0x09a1  */
                                /* JADX WARN: Code duplicated, block: B:128:0x0a2c  */
                                /* JADX WARN: Code duplicated, block: B:131:0x0b08  */
                                /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
                                public final void invoke(Composer composer4, int i5) {
                                    int i6;
                                    String str;
                                    String str2;
                                    String str3;
                                    String str4;
                                    String str5;
                                    String str6;
                                    final Message message3;
                                    String str7;
                                    String str8;
                                    String str9;
                                    String str10;
                                    String str11;
                                    int currentCompositeKeyHash2;
                                    Function0 constructor2;
                                    Composer composer5;
                                    Function2 setCompositeKeyHash2;
                                    boolean zChangedInstance;
                                    Object objRememberedValue;
                                    boolean zChangedInstance2;
                                    Object objRememberedValue2;
                                    String str12;
                                    ComposerKt.sourceInformation(composer4, "C1236@65005L15466:ChatScreen.kt#2thlc2");
                                    if ((i5 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-937511773, i5, -1, "com.example.ui.screens.ChatScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:1236)");
                                    }
                                    Modifier modifier2 = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(14.0f));
                                    final Message message4 = message2;
                                    boolean z4 = z3;
                                    SimpleDateFormat simpleDateFormat4 = simpleDateFormat3;
                                    final BookViewModel bookViewModel4 = bookViewModel3;
                                    final Context context4 = context3;
                                    final Book book4 = book3;
                                    ComposerKt.sourceInformationMarkerStart(composer4, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer4, 0);
                                    ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifier2);
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
                                    Composer composer6 = Updater.constructor-impl(composer4);
                                    Updater.set-impl(composer6, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                                    Updater.set-impl(composer6, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                    Function2 setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                    if (composer6.getInserting() || !Intrinsics.areEqual(composer6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                        composer6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        composer6.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    }
                                    Updater.set-impl(composer6, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer4, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                    ColumnScope columnScope3 = ColumnScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer4, 103231399, "C1237@65090L911,1252@66043L40,1257@66366L10,1254@66125L304,1292@68779L40,1379@75494L40,1382@75653L4258,1433@79953L40,1436@80197L11,1434@80034L399:ChatScreen.kt#2thlc2");
                                    Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                                    ComposerKt.sourceInformationMarkerStart(composer4, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                    Modifier modifier3 = Modifier.Companion;
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer4, 48);
                                    ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer4, modifier3);
                                    Function0 constructor4 = ComposeUiNode.Companion.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                    if (!(composer4.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor4);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composer7 = Updater.constructor-impl(composer4);
                                    Updater.set-impl(composer7, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                                    Updater.set-impl(composer7, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                    Function2 setCompositeKeyHash4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                    if (composer7.getInserting() || !Intrinsics.areEqual(composer7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                        composer7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                        composer7.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                    }
                                    Updater.set-impl(composer7, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer4, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                    RowScope rowScope = RowScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer4, -1725131017, "C1238@65188L349,1244@65582L39,1248@65892L10,1245@65666L293:ChatScreen.kt#2thlc2");
                                    IconKt.Icon-ww6aTOc(PlaceKt.getPlace(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), ColorKt.Color(4279994175L), composer4, 3504, 0);
                                    SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer4, 6);
                                    TextKt.Text--4IGK_g("Safe Meetup Proposal", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getTitleSmall(), composer4, 196614, 0, 65502);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    composer4.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer4, 6);
                                    String meetupLocation = message4.getMeetupLocation();
                                    if (meetupLocation == null) {
                                        meetupLocation = "Verified Safe Spot";
                                    }
                                    TextKt.Text--4IGK_g(meetupLocation, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getBodyMedium(), composer4, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
                                    Composer composer8 = composer4;
                                    String meetupAddress = message4.getMeetupAddress();
                                    if (meetupAddress == null || StringsKt.isBlank(meetupAddress)) {
                                        i6 = 38185493;
                                        composer8.startReplaceGroup(38185493);
                                        composer8.endReplaceGroup();
                                    } else {
                                        composer8.startReplaceGroup(104177921);
                                        ComposerKt.sourceInformation(composer8, "1263@66707L10,1264@66799L11,1261@66557L316");
                                        TextKt.Text--4IGK_g(message4.getMeetupAddress(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer8, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer8, MaterialTheme.$stable).getBodySmall(), composer4, 0, 0, 65530);
                                        composer8 = composer4;
                                        composer8.endReplaceGroup();
                                        i6 = 38185493;
                                    }
                                    if (message4.getMeetupTime() != null) {
                                        composer8.startReplaceGroup(104689917);
                                        ComposerKt.sourceInformation(composer8, "");
                                        try {
                                            str12 = new SimpleDateFormat("EEE, MMM d 'at' h:mm a", Locale.getDefault()).format(new Date(message4.getMeetupTime().longValue()));
                                        } catch (Exception unused) {
                                            str12 = "";
                                        }
                                        Intrinsics.checkNotNull(str12);
                                        if (StringsKt.isBlank(str12)) {
                                            str = "";
                                            str2 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                                            str3 = "C101@5126L9:Row.kt#2w3rfo";
                                            str4 = "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo";
                                            str5 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                                            composer8.startReplaceGroup(i6);
                                        } else {
                                            composer8.startReplaceGroup(105060522);
                                            ComposerKt.sourceInformation(composer8, "1273@67422L40,1274@67511L1138");
                                            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer8, 6);
                                            Alignment.Vertical centerVertically2 = Alignment.Companion.getCenterVertically();
                                            ComposerKt.sourceInformationMarkerStart(composer8, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                            Modifier modifier4 = Modifier.Companion;
                                            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer8, 48);
                                            ComposerKt.sourceInformationMarkerStart(composer8, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer8, 0);
                                            CompositionLocalMap currentCompositionLocalMap4 = composer8.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer8, modifier4);
                                            Function0 constructor5 = ComposeUiNode.Companion.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(composer8, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                            if (!(composer8.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer8.startReusableNode();
                                            if (composer8.getInserting()) {
                                                composer8.createNode(constructor5);
                                            } else {
                                                composer8.useNode();
                                            }
                                            Composer composer9 = Updater.constructor-impl(composer8);
                                            Updater.set-impl(composer9, measurePolicyRowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                                            Updater.set-impl(composer9, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                            Function2 setCompositeKeyHash5 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                            if (composer9.getInserting() || !Intrinsics.areEqual(composer9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                                composer9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                                composer9.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                            }
                                            Updater.set-impl(composer9, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composer8, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                            RowScope rowScope2 = RowScopeInstance.INSTANCE;
                                            ComposerKt.sourceInformationMarkerStart(composer8, -972357455, "C1279@67952L11,1275@67617L408,1281@68078L39,1284@68334L10,1286@68526L11,1282@68170L429:ChatScreen.kt#2thlc2");
                                            IconKt.Icon-ww6aTOc(ScheduleKt.getSchedule(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(14.0f)), MaterialTheme.INSTANCE.getColorScheme(composer8, MaterialTheme.$stable).getOutline-0d7_KjU(), composer8, 432, 0);
                                            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer8, 6);
                                            TextStyle labelMedium = MaterialTheme.INSTANCE.getTypography(composer8, MaterialTheme.$stable).getLabelMedium();
                                            str = "";
                                            str2 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                                            str4 = "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo";
                                            str3 = "C101@5126L9:Row.kt#2w3rfo";
                                            str5 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                                            TextKt.Text--4IGK_g(str12, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer8, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, labelMedium, composer4, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
                                            composer8 = composer4;
                                            ComposerKt.sourceInformationMarkerEnd(composer8);
                                            ComposerKt.sourceInformationMarkerEnd(composer8);
                                            composer8.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer8);
                                            ComposerKt.sourceInformationMarkerEnd(composer8);
                                            ComposerKt.sourceInformationMarkerEnd(composer8);
                                        }
                                        composer8.endReplaceGroup();
                                    } else {
                                        str = "";
                                        str2 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                                        str3 = "C101@5126L9:Row.kt#2w3rfo";
                                        str4 = "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo";
                                        str5 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                                        composer8.startReplaceGroup(i6);
                                    }
                                    composer8.endReplaceGroup();
                                    SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer8, 6);
                                    String meetupStatus = message4.getMeetupStatus();
                                    if (meetupStatus == null) {
                                        meetupStatus = "PROPOSED";
                                    }
                                    if (!Intrinsics.areEqual(meetupStatus, "ACCEPTED")) {
                                        str6 = "CC(remember):ChatScreen.kt#9igjgp";
                                        if (Intrinsics.areEqual(meetupStatus, "DECLINED")) {
                                            composer8.startReplaceGroup(108295837);
                                            ComposerKt.sourceInformation(composer8, "1320@70852L11,1318@70691L864");
                                            SurfaceKt.Surface-T9BRK9s((Modifier) null, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(6.0f)), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer8, MaterialTheme.$stable).getError-0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$196675702$app(), composer8, 12582912, 121);
                                            composer8.endReplaceGroup();
                                        } else {
                                            composer8.startReplaceGroup(109335980);
                                            ComposerKt.sourceInformation(composer8, str);
                                            if (z4) {
                                                message3 = message4;
                                                str7 = str3;
                                                str8 = str4;
                                                str9 = str5;
                                                str10 = str2;
                                                str11 = str6;
                                                composer8.startReplaceGroup(112035088);
                                                ComposerKt.sourceInformation(composer8, "1364@74463L901");
                                                SurfaceKt.Surface-T9BRK9s((Modifier) null, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(6.0f)), Color.copy-wmQWz5c$default(ColorKt.Color(4293880832L), 0.15f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$710772658$app(), composer8, 12583296, 121);
                                                composer8.endReplaceGroup();
                                            } else {
                                                composer8.startReplaceGroup(109360284);
                                                ComposerKt.sourceInformation(composer8, "1332@71712L897,1344@72658L40,1345@72747L1614");
                                                SurfaceKt.Surface-T9BRK9s((Modifier) null, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(6.0f)), Color.copy-wmQWz5c$default(ColorKt.Color(4293880832L), 0.15f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableSingletons$ChatScreenKt.INSTANCE.m254getLambda$1976948901$app(), composer8, 12583296, 121);
                                                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer8, 6);
                                                Arrangement.Horizontal horizontal = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(8.0f));
                                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
                                                String str13 = str4;
                                                ComposerKt.sourceInformationMarkerStart(composer8, 693286680, str13);
                                                MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(horizontal, Alignment.Companion.getTop(), composer8, 6);
                                                String str14 = str2;
                                                ComposerKt.sourceInformationMarkerStart(composer8, -1323940314, str14);
                                                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer8, 0);
                                                CompositionLocalMap currentCompositionLocalMap5 = composer8.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer8, modifierFillMaxWidth$default);
                                                Function0 constructor6 = ComposeUiNode.Companion.getConstructor();
                                                String str15 = str5;
                                                ComposerKt.sourceInformationMarkerStart(composer8, -692256719, str15);
                                                if (!(composer8.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer8.startReusableNode();
                                                if (composer8.getInserting()) {
                                                    composer8.createNode(constructor6);
                                                } else {
                                                    composer8.useNode();
                                                }
                                                Composer composer10 = Updater.constructor-impl(composer8);
                                                Updater.set-impl(composer10, measurePolicyRowMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
                                                Updater.set-impl(composer10, currentCompositionLocalMap5, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                                Function2 setCompositeKeyHash6 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                                if (composer10.getInserting() || !Intrinsics.areEqual(composer10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                                    composer10.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                                    composer10.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                                                }
                                                Updater.set-impl(composer10, modifierMaterializeModifier5, ComposeUiNode.Companion.getSetModifier());
                                                String str16 = str3;
                                                ComposerKt.sourceInformationMarkerStart(composer8, -407840262, str16);
                                                RowScope rowScope3 = RowScopeInstance.INSTANCE;
                                                ComposerKt.sourceInformationMarkerStart(composer8, -1175514745, "C1347@72967L48,1349@73187L48,1346@72893L794,1356@73822L49,1358@74093L11,1358@74043L68,1355@73740L571:ChatScreen.kt#2thlc2");
                                                ComposerKt.sourceInformationMarkerStart(composer8, -1561939486, str6);
                                                boolean zChangedInstance3 = composer8.changedInstance(bookViewModel4) | composer8.changedInstance(message4);
                                                Object objRememberedValue3 = composer8.rememberedValue();
                                                if (zChangedInstance3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                                                    objRememberedValue3 = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.ChatScreenKt$ChatScreen$21$1$20$1$2$2$1$2$1$3$1$1
                                                        public /* bridge */ /* synthetic */ Object invoke() {
                                                            m173invoke();
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                                        public final void m173invoke() {
                                                            bookViewModel4.respondToMeetupProposal(message4, true);
                                                        }
                                                    };
                                                    composer8.updateRememberedValue(objRememberedValue3);
                                                }
                                                ComposerKt.sourceInformationMarkerEnd(composer8);
                                                str8 = str13;
                                                message3 = message4;
                                                str7 = str16;
                                                str10 = str14;
                                                str9 = str15;
                                                str11 = str6;
                                                ButtonKt.Button((Function0) objRememberedValue3, RowScope.weight$default(rowScope3, Modifier.Companion, 1.3f, false, 2, (Object) null), false, (Shape) null, ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(ColorKt.Color(4279994175L), 0L, 0L, 0L, composer8, (ButtonDefaults.$stable << 12) | 6, 14), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$ChatScreenKt.INSTANCE.m260getLambda$513478590$app(), composer4, 805306368, 492);
                                                ComposerKt.sourceInformationMarkerStart(composer4, -1561912125, str11);
                                                boolean zChangedInstance4 = composer4.changedInstance(bookViewModel4) | composer4.changedInstance(message3);
                                                Object objRememberedValue4 = composer4.rememberedValue();
                                                if (zChangedInstance4 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                                                    objRememberedValue4 = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.ChatScreenKt$ChatScreen$21$1$20$1$2$2$1$2$1$3$2$1
                                                        public /* bridge */ /* synthetic */ Object invoke() {
                                                            m174invoke();
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                                        public final void m174invoke() {
                                                            bookViewModel4.respondToMeetupProposal(message3, false);
                                                        }
                                                    };
                                                    composer4.updateRememberedValue(objRememberedValue4);
                                                }
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                composer8 = composer4;
                                                ButtonKt.OutlinedButton((Function0) objRememberedValue4, RowScope.weight$default(rowScope3, Modifier.Companion, 0.9f, false, 2, (Object) null), false, (Shape) null, ButtonDefaults.INSTANCE.outlinedButtonColors-ro_MJ88(0L, MaterialTheme.INSTANCE.getColorScheme(composer4, MaterialTheme.$stable).getError-0d7_KjU(), 0L, 0L, composer4, ButtonDefaults.$stable << 12, 13), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$1951141504$app(), composer8, 805306368, 492);
                                                ComposerKt.sourceInformationMarkerEnd(composer8);
                                                ComposerKt.sourceInformationMarkerEnd(composer8);
                                                composer8.endNode();
                                                ComposerKt.sourceInformationMarkerEnd(composer8);
                                                ComposerKt.sourceInformationMarkerEnd(composer8);
                                                ComposerKt.sourceInformationMarkerEnd(composer8);
                                                composer8.endReplaceGroup();
                                            }
                                            composer8.endReplaceGroup();
                                        }
                                        SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer8, 6);
                                        Arrangement.Horizontal horizontal2 = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(6.0f));
                                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
                                        ComposerKt.sourceInformationMarkerStart(composer8, 693286680, str8);
                                        MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(horizontal2, Alignment.Companion.getTop(), composer8, 6);
                                        ComposerKt.sourceInformationMarkerStart(composer8, -1323940314, str10);
                                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer8, 0);
                                        CompositionLocalMap currentCompositionLocalMap6 = composer8.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer8, modifierFillMaxWidth$default2);
                                        constructor2 = ComposeUiNode.Companion.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer8, -692256719, str9);
                                        if (!(composer8.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer8.startReusableNode();
                                        if (composer8.getInserting()) {
                                            composer8.createNode(constructor2);
                                        } else {
                                            composer8.useNode();
                                        }
                                        composer5 = Updater.constructor-impl(composer8);
                                        Updater.set-impl(composer5, measurePolicyRowMeasurePolicy4, ComposeUiNode.Companion.getSetMeasurePolicy());
                                        Updater.set-impl(composer5, currentCompositionLocalMap6, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                        if (composer5.getInserting() || !Intrinsics.areEqual(composer5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            composer5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composer5.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        Updater.set-impl(composer5, modifierMaterializeModifier6, ComposeUiNode.Companion.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer8, -407840262, str7);
                                        RowScope rowScope4 = RowScopeInstance.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(composer8, -1973706139, "C1387@75987L945,1399@77088L48,1386@75921L1734,1408@77775L1495,1407@77701L2168:ChatScreen.kt#2thlc2");
                                        ComposerKt.sourceInformationMarkerStart(composer8, -2141878813, str11);
                                        zChangedInstance = composer8.changedInstance(message3) | composer8.changedInstance(context4);
                                        objRememberedValue = composer8.rememberedValue();
                                        if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.ChatScreenKt$ChatScreen$21$1$20$1$2$2$1$2$1$4$1$1
                                                public /* bridge */ /* synthetic */ Object invoke() {
                                                    m175invoke();
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                                public final void m175invoke() {
                                                    String meetupLocation2 = message3.getMeetupLocation();
                                                    if (meetupLocation2 == null) {
                                                        meetupLocation2 = "safe spot";
                                                    }
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + Uri.encode(meetupLocation2)));
                                                        intent.setPackage("com.google.android.apps.maps");
                                                        context4.startActivity(intent);
                                                    } catch (Exception unused2) {
                                                        context4.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.google.com/maps/search/?api=1&query=" + Uri.encode(meetupLocation2))));
                                                    }
                                                }
                                            };
                                            composer8.updateRememberedValue(objRememberedValue);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(composer8);
                                        ButtonKt.Button((Function0) objRememberedValue, RowScope.weight$default(rowScope4, Modifier.Companion, 1.2f, false, 2, (Object) null), false, (Shape) null, ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(ColorKt.Color(4279592384L), 0L, 0L, 0L, composer4, (ButtonDefaults.$stable << 12) | 6, 14), (ButtonElevation) null, (BorderStroke) null, PaddingKt.PaddingValues-YgX7TsA(Dp.constructor-impl(6.0f), Dp.constructor-impl(4.0f)), (MutableInteractionSource) null, ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$1499449026$app(), composer4, 817889280, 364);
                                        ComposerKt.sourceInformationMarkerStart(composer4, -2141821047, str11);
                                        zChangedInstance2 = composer4.changedInstance(book4) | composer4.changedInstance(message3) | composer4.changedInstance(context4);
                                        objRememberedValue2 = composer4.rememberedValue();
                                        if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                                            objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.ChatScreenKt$ChatScreen$21$1$20$1$2$2$1$2$1$4$2$1
                                                public /* bridge */ /* synthetic */ Object invoke() {
                                                    m176invoke();
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                                public final void m176invoke() {
                                                    String title;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.INSERT");
                                                        Book book5 = book4;
                                                        Message message5 = message3;
                                                        intent.setData(CalendarContract.Events.CONTENT_URI);
                                                        if (book5 == null || (title = book5.getTitle()) == null) {
                                                            title = "Book Swap";
                                                        }
                                                        intent.putExtra("title", "BookXchange: " + title);
                                                        String meetupLocation2 = message5.getMeetupLocation();
                                                        if (meetupLocation2 == null) {
                                                            meetupLocation2 = "";
                                                        }
                                                        intent.putExtra("eventLocation", meetupLocation2);
                                                        Long meetupTime = message5.getMeetupTime();
                                                        if (meetupTime != null) {
                                                            long jLongValue = meetupTime.longValue();
                                                            intent.putExtra("beginTime", jLongValue);
                                                            intent.putExtra("endTime", jLongValue + 1800000);
                                                        }
                                                        context4.startActivity(intent);
                                                    } catch (Exception unused2) {
                                                        Toast.makeText(context4, "Cannot launch Calendar", 0).show();
                                                    }
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue2);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ButtonKt.OutlinedButton((Function0) objRememberedValue2, RowScope.weight$default(rowScope4, Modifier.Companion, 1.0f, false, 2, (Object) null), false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, PaddingKt.PaddingValues-YgX7TsA(Dp.constructor-impl(6.0f), Dp.constructor-impl(4.0f)), (MutableInteractionSource) null, ComposableSingletons$ChatScreenKt.INSTANCE.m262getLambda$821782400$app(), composer4, 817889280, 380);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        composer4.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer4, 6);
                                        String str17 = simpleDateFormat4.format(new Date(message3.getTimestamp()));
                                        Intrinsics.checkNotNullExpressionValue(str17, "format(...)");
                                        TextKt.Text--4IGK_g(str17, columnScope3.align(Modifier.Companion, Alignment.Companion.getEnd()), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer4, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, (Object) null), TextUnitKt.getSp(9), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer4, 3072, 0, 131056);
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
                                    composer8.startReplaceGroup(106730430);
                                    ComposerKt.sourceInformation(composer8, "1298@69094L1471");
                                    str6 = "CC(remember):ChatScreen.kt#9igjgp";
                                    SurfaceKt.Surface-T9BRK9s(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(8.0f)), Color.copy-wmQWz5c$default(ColorKt.Color(4279994175L), 0.15f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$707411071$app(), composer8, 12583302, 120);
                                    composer8.endReplaceGroup();
                                    message3 = message4;
                                    str7 = str3;
                                    str8 = str4;
                                    str9 = str5;
                                    str10 = str2;
                                    str11 = str6;
                                    SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer8, 6);
                                    Arrangement.Horizontal horizontal3 = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(6.0f));
                                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
                                    ComposerKt.sourceInformationMarkerStart(composer8, 693286680, str8);
                                    MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(horizontal3, Alignment.Companion.getTop(), composer8, 6);
                                    ComposerKt.sourceInformationMarkerStart(composer8, -1323940314, str10);
                                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer8, 0);
                                    CompositionLocalMap currentCompositionLocalMap7 = composer8.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer8, modifierFillMaxWidth$default3);
                                    constructor2 = ComposeUiNode.Companion.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer8, -692256719, str9);
                                    if (!(composer8.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer8.startReusableNode();
                                    if (composer8.getInserting()) {
                                        composer8.createNode(constructor2);
                                    } else {
                                        composer8.useNode();
                                    }
                                    composer5 = Updater.constructor-impl(composer8);
                                    Updater.set-impl(composer5, measurePolicyRowMeasurePolicy5, ComposeUiNode.Companion.getSetMeasurePolicy());
                                    Updater.set-impl(composer5, currentCompositionLocalMap7, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                    if (composer5.getInserting()) {
                                        composer5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composer5.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    } else {
                                        composer5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composer5.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.set-impl(composer5, modifierMaterializeModifier7, ComposeUiNode.Companion.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer8, -407840262, str7);
                                    RowScope rowScope5 = RowScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer8, -1973706139, "C1387@75987L945,1399@77088L48,1386@75921L1734,1408@77775L1495,1407@77701L2168:ChatScreen.kt#2thlc2");
                                    ComposerKt.sourceInformationMarkerStart(composer8, -2141878813, str11);
                                    zChangedInstance = composer8.changedInstance(message3) | composer8.changedInstance(context4);
                                    objRememberedValue = composer8.rememberedValue();
                                    if (zChangedInstance) {
                                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.ChatScreenKt$ChatScreen$21$1$20$1$2$2$1$2$1$4$1$1
                                            public /* bridge */ /* synthetic */ Object invoke() {
                                                m175invoke();
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                            public final void m175invoke() {
                                                String meetupLocation2 = message3.getMeetupLocation();
                                                if (meetupLocation2 == null) {
                                                    meetupLocation2 = "safe spot";
                                                }
                                                try {
                                                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + Uri.encode(meetupLocation2)));
                                                    intent.setPackage("com.google.android.apps.maps");
                                                    context4.startActivity(intent);
                                                } catch (Exception unused2) {
                                                    context4.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.google.com/maps/search/?api=1&query=" + Uri.encode(meetupLocation2))));
                                                }
                                            }
                                        };
                                        composer8.updateRememberedValue(objRememberedValue);
                                    } else {
                                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.ChatScreenKt$ChatScreen$21$1$20$1$2$2$1$2$1$4$1$1
                                            public /* bridge */ /* synthetic */ Object invoke() {
                                                m175invoke();
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                            public final void m175invoke() {
                                                String meetupLocation2 = message3.getMeetupLocation();
                                                if (meetupLocation2 == null) {
                                                    meetupLocation2 = "safe spot";
                                                }
                                                try {
                                                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + Uri.encode(meetupLocation2)));
                                                    intent.setPackage("com.google.android.apps.maps");
                                                    context4.startActivity(intent);
                                                } catch (Exception unused2) {
                                                    context4.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.google.com/maps/search/?api=1&query=" + Uri.encode(meetupLocation2))));
                                                }
                                            }
                                        };
                                        composer8.updateRememberedValue(objRememberedValue);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composer8);
                                    ButtonKt.Button((Function0) objRememberedValue, RowScope.weight$default(rowScope5, Modifier.Companion, 1.2f, false, 2, (Object) null), false, (Shape) null, ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(ColorKt.Color(4279592384L), 0L, 0L, 0L, composer4, (ButtonDefaults.$stable << 12) | 6, 14), (ButtonElevation) null, (BorderStroke) null, PaddingKt.PaddingValues-YgX7TsA(Dp.constructor-impl(6.0f), Dp.constructor-impl(4.0f)), (MutableInteractionSource) null, ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$1499449026$app(), composer4, 817889280, 364);
                                    ComposerKt.sourceInformationMarkerStart(composer4, -2141821047, str11);
                                    zChangedInstance2 = composer4.changedInstance(book4) | composer4.changedInstance(message3) | composer4.changedInstance(context4);
                                    objRememberedValue2 = composer4.rememberedValue();
                                    if (zChangedInstance2) {
                                        objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.ChatScreenKt$ChatScreen$21$1$20$1$2$2$1$2$1$4$2$1
                                            public /* bridge */ /* synthetic */ Object invoke() {
                                                m176invoke();
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                            public final void m176invoke() {
                                                String title;
                                                try {
                                                    Intent intent = new Intent("android.intent.action.INSERT");
                                                    Book book5 = book4;
                                                    Message message5 = message3;
                                                    intent.setData(CalendarContract.Events.CONTENT_URI);
                                                    if (book5 == null || (title = book5.getTitle()) == null) {
                                                        title = "Book Swap";
                                                    }
                                                    intent.putExtra("title", "BookXchange: " + title);
                                                    String meetupLocation2 = message5.getMeetupLocation();
                                                    if (meetupLocation2 == null) {
                                                        meetupLocation2 = "";
                                                    }
                                                    intent.putExtra("eventLocation", meetupLocation2);
                                                    Long meetupTime = message5.getMeetupTime();
                                                    if (meetupTime != null) {
                                                        long jLongValue = meetupTime.longValue();
                                                        intent.putExtra("beginTime", jLongValue);
                                                        intent.putExtra("endTime", jLongValue + 1800000);
                                                    }
                                                    context4.startActivity(intent);
                                                } catch (Exception unused2) {
                                                    Toast.makeText(context4, "Cannot launch Calendar", 0).show();
                                                }
                                            }
                                        };
                                        composer4.updateRememberedValue(objRememberedValue2);
                                    } else {
                                        objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.ChatScreenKt$ChatScreen$21$1$20$1$2$2$1$2$1$4$2$1
                                            public /* bridge */ /* synthetic */ Object invoke() {
                                                m176invoke();
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                            public final void m176invoke() {
                                                String title;
                                                try {
                                                    Intent intent = new Intent("android.intent.action.INSERT");
                                                    Book book5 = book4;
                                                    Message message5 = message3;
                                                    intent.setData(CalendarContract.Events.CONTENT_URI);
                                                    if (book5 == null || (title = book5.getTitle()) == null) {
                                                        title = "Book Swap";
                                                    }
                                                    intent.putExtra("title", "BookXchange: " + title);
                                                    String meetupLocation2 = message5.getMeetupLocation();
                                                    if (meetupLocation2 == null) {
                                                        meetupLocation2 = "";
                                                    }
                                                    intent.putExtra("eventLocation", meetupLocation2);
                                                    Long meetupTime = message5.getMeetupTime();
                                                    if (meetupTime != null) {
                                                        long jLongValue = meetupTime.longValue();
                                                        intent.putExtra("beginTime", jLongValue);
                                                        intent.putExtra("endTime", jLongValue + 1800000);
                                                    }
                                                    context4.startActivity(intent);
                                                } catch (Exception unused2) {
                                                    Toast.makeText(context4, "Cannot launch Calendar", 0).show();
                                                }
                                            }
                                        };
                                        composer4.updateRememberedValue(objRememberedValue2);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    ButtonKt.OutlinedButton((Function0) objRememberedValue2, RowScope.weight$default(rowScope5, Modifier.Companion, 1.0f, false, 2, (Object) null), false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, PaddingKt.PaddingValues-YgX7TsA(Dp.constructor-impl(6.0f), Dp.constructor-impl(4.0f)), (MutableInteractionSource) null, ComposableSingletons$ChatScreenKt.INSTANCE.m262getLambda$821782400$app(), composer4, 817889280, 380);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    composer4.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer4, 6);
                                    String str18 = simpleDateFormat4.format(new Date(message3.getTimestamp()));
                                    Intrinsics.checkNotNullExpressionValue(str18, "format(...)");
                                    TextKt.Text--4IGK_g(str18, columnScope3.align(Modifier.Companion, Alignment.Companion.getEnd()), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer4, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, (Object) null), TextUnitKt.getSp(9), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer4, 3072, 0, 131056);
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
                            }, composer2, 54), composer2, 12779526, 88);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-1300280377);
                            ComposerKt.sourceInformation(composer2, "1447@80788L2658,1443@80575L2871");
                            SurfaceKt.Surface-T9BRK9s((Modifier) null, shape, j4, 0L, 0.0f, Dp.constructor-impl(1.0f), (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-1606699709, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.ui.screens.ChatScreenKt$ChatScreen$21$1$20$1$2$2$1$3
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i5) {
                                    Pair pair;
                                    ComposerKt.sourceInformation(composer4, "C1448@80826L2586:ChatScreen.kt#2thlc2");
                                    if ((i5 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1606699709, i5, -1, "com.example.ui.screens.ChatScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:1448)");
                                    }
                                    Modifier modifier2 = PaddingKt.padding-qDBjuR0(Modifier.Companion, Dp.constructor-impl(12.0f), Dp.constructor-impl(8.0f), Dp.constructor-impl(10.0f), Dp.constructor-impl(8.0f));
                                    Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                    Alignment.Vertical bottom = Alignment.Companion.getBottom();
                                    Message message3 = message2;
                                    long j6 = j5;
                                    SimpleDateFormat simpleDateFormat4 = simpleDateFormat3;
                                    boolean z4 = z3;
                                    ComposerKt.sourceInformationMarkerStart(composer4, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(end, bottom, composer4, 54);
                                    ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifier2);
                                    Function0 constructor2 = ComposeUiNode.Companion.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                    if (!(composer4.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor2);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composer5 = Updater.constructor-impl(composer4);
                                    Updater.set-impl(composer5, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                                    Updater.set-impl(composer5, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                    Function2 setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                    if (composer5.getInserting() || !Intrinsics.areEqual(composer5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composer5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composer5.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.set-impl(composer5, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer4, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                    RowScope rowScope = RowScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer4, 1124926239, "C1456@81392L10,1453@81193L351,1459@81585L39,1460@81665L1709:ChatScreen.kt#2thlc2");
                                    TextKt.Text--4IGK_g(message3.getContent(), rowScope.weight(Modifier.Companion, 1.0f, false), j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getBodyLarge(), composer4, 0, 0, 65528);
                                    SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer4, 6);
                                    Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                                    Modifier modifier3 = PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, Dp.constructor-impl(1.0f), 7, (Object) null);
                                    ComposerKt.sourceInformationMarkerStart(composer4, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer4, 48);
                                    ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer4, modifier3);
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
                                    Composer composer6 = Updater.constructor-impl(composer4);
                                    Updater.set-impl(composer6, measurePolicyRowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                                    Updater.set-impl(composer6, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                    Function2 setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                    if (composer6.getInserting() || !Intrinsics.areEqual(composer6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                        composer6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        composer6.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    }
                                    Updater.set-impl(composer6, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer4, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                    RowScope rowScope2 = RowScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer4, -519938859, "C1464@81937L297:ChatScreen.kt#2thlc2");
                                    String str = simpleDateFormat4.format(new Date(message3.getTimestamp()));
                                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                                    TextKt.Text--4IGK_g(str, (Modifier) null, Color.copy-wmQWz5c$default(j6, 0.6f, 0.0f, 0.0f, 0.0f, 14, (Object) null), TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer4, 3072, 0, 131058);
                                    Composer composer7 = composer4;
                                    if (z4) {
                                        composer7.startReplaceGroup(-519598666);
                                        ComposerKt.sourceInformation(composer7, "1470@82341L39,1476@82940L346");
                                        SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(3.0f)), composer7, 6);
                                        String upperCase = message3.getStatus().toUpperCase(Locale.ROOT);
                                        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                        if (Intrinsics.areEqual(upperCase, "READ")) {
                                            pair = TuplesKt.to("✓✓", Color.box-impl(ColorKt.Color(4283678187L)));
                                        } else {
                                            pair = Intrinsics.areEqual(upperCase, "DELIVERED") ? TuplesKt.to("✓✓", Color.box-impl(ColorKt.Color(4287010464L))) : TuplesKt.to("✓", Color.box-impl(ColorKt.Color(4287010464L)));
                                        }
                                        TextKt.Text--4IGK_g((String) pair.component1(), (Modifier) null, ((Color) pair.component2()).unbox-impl(), TextUnitKt.getSp(11), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer4, 199680, 0, 131026);
                                        composer7 = composer4;
                                    } else {
                                        composer7.startReplaceGroup(-601264601);
                                    }
                                    composer7.endReplaceGroup();
                                    ComposerKt.sourceInformationMarkerEnd(composer7);
                                    ComposerKt.sourceInformationMarkerEnd(composer7);
                                    composer7.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer7);
                                    ComposerKt.sourceInformationMarkerEnd(composer7);
                                    ComposerKt.sourceInformationMarkerEnd(composer7);
                                    ComposerKt.sourceInformationMarkerEnd(composer7);
                                    ComposerKt.sourceInformationMarkerEnd(composer7);
                                    composer7.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer7);
                                    ComposerKt.sourceInformationMarkerEnd(composer7);
                                    ComposerKt.sourceInformationMarkerEnd(composer7);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, 12779520, 89);
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
                }, composer, 54), composer, 1575984, 26);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    static final Object ChatScreen$lambda$272$lambda$271$lambda$246$lambda$245$lambda$242(Message message) {
        Intrinsics.checkNotNullParameter(message, "it");
        String id = message.getId();
        if (!StringsKt.isBlank(id)) {
            return id;
        }
        return message.getTimestamp() + "_" + message.getSender() + "_" + message.getContent().hashCode();
    }

    static final Unit ChatScreen$lambda$272$lambda$271$lambda$248(MutableState mutableState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1501@84037L835:ChatScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(79334887, i, -1, "com.example.ui.screens.ChatScreen.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:1501)");
            }
            Modifier modifier = PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(12.0f), Dp.constructor-impl(8.0f));
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
            ComposerKt.sourceInformationMarkerStart(composer, -825398935, "C1508@84409L11,1505@84251L264,1511@84540L39,1514@84722L10,1515@84794L11,1512@84604L246:ChatScreen.kt#2thlc2");
            IconKt.Icon-ww6aTOc(InfoKt.getInfo(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 432, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            String strChatScreen$lambda$91 = ChatScreen$lambda$91(mutableState);
            Intrinsics.checkNotNull(strChatScreen$lambda$91);
            TextKt.Text--4IGK_g(strChatScreen$lambda$91, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnPrimaryContainer-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 0, 0, 65530);
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

    static final Unit ChatScreen$lambda$272$lambda$271$lambda$256$lambda$255(final List list, final MutableState mutableState, final MutableState mutableState2, LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyRow");
        LazyListScope.item$default(lazyListScope, (Object) null, (Object) null, ComposableLambdaKt.composableLambdaInstance(-616032049, true, new Function3() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda11
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$256$lambda$255$lambda$252(mutableState, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, (Object) null);
        final ChatScreenKt$ChatScreen$lambda$272$lambda$271$lambda$256$lambda$255$$inlined$items$default$1 chatScreenKt$ChatScreen$lambda$272$lambda$271$lambda$256$lambda$255$$inlined$items$default$1 = new Function1() { // from class: com.example.ui.screens.ChatScreenKt$ChatScreen$lambda$272$lambda$271$lambda$256$lambda$255$$inlined$items$default$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final Void m179invoke(String str) {
                return null;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m179invoke((String) obj);
            }
        };
        lazyListScope.items(list.size(), (Function1) null, new Function1<Integer, Object>() { // from class: com.example.ui.screens.ChatScreenKt$ChatScreen$lambda$272$lambda$271$lambda$256$lambda$255$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i) {
                return chatScreenKt$ChatScreen$lambda$272$lambda$271$lambda$256$lambda$255$$inlined$items$default$1.invoke(list.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.screens.ChatScreenKt$ChatScreen$lambda$272$lambda$271$lambda$256$lambda$255$$inlined$items$default$4
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
                long j;
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
                composer.startReplaceGroup(-2033554107);
                ComposerKt.sourceInformation(composer, "C*1578@87754L79,1581@87856L1244,1574@87415L1685:ChatScreen.kt#2thlc2");
                final String strRemovePrefix = StringsKt.removePrefix(str, "✨ ");
                Shape shape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(18.0f));
                if (StringsKt.startsWith$default(str, "✨", false, 2, (Object) null)) {
                    composer.startReplaceGroup(1735521916);
                    ComposerKt.sourceInformation(composer, "1576@87556L11");
                    j = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU();
                } else {
                    composer.startReplaceGroup(1735523935);
                    ComposerKt.sourceInformation(composer, "1576@87604L11");
                    j = Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0.85f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
                }
                composer.endReplaceGroup();
                float f = Dp.constructor-impl(1.0f);
                Modifier modifier = Modifier.Companion;
                ComposerKt.sourceInformationMarkerStart(composer, 1735527931, "CC(remember):ChatScreen.kt#9igjgp");
                boolean zChanged = composer.changed(strRemovePrefix);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    final MutableState mutableState3 = mutableState2;
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.ChatScreenKt$ChatScreen$21$1$22$1$2$1$1
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m177invoke();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m177invoke() {
                            mutableState3.setValue(strRemovePrefix);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                SurfaceKt.Surface-T9BRK9s(ClickableKt.clickable-XHw0xAI$default(modifier, false, (String) null, (Role) null, (Function0) objRememberedValue, 7, (Object) null), shape, j, 0L, 0.0f, f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(699032743, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.ui.screens.ChatScreenKt$ChatScreen$21$1$22$1$2$2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i4) {
                        long j2;
                        ComposerKt.sourceInformation(composer2, "C1582@87882L1196:ChatScreen.kt#2thlc2");
                        if ((i4 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(699032743, i4, -1, "com.example.ui.screens.ChatScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:1582)");
                        }
                        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                        Modifier modifier2 = PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(12.0f), Dp.constructor-impl(6.0f));
                        String str2 = str;
                        String str3 = strRemovePrefix;
                        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifier2);
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
                        ComposerKt.sourceInformationMarkerStart(composer2, 330170228, "C1597@88725L10,1595@88615L437:ChatScreen.kt#2thlc2");
                        if (StringsKt.startsWith$default(str2, "✨", false, 2, (Object) null)) {
                            composer2.startReplaceGroup(330181728);
                            ComposerKt.sourceInformation(composer2, "1590@88362L11,1587@88173L311,1593@88517L39");
                            IconKt.Icon-ww6aTOc(AutoAwesomeKt.getAutoAwesome(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(14.0f)), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer2, 432, 0);
                            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer2, 6);
                        } else {
                            composer2.startReplaceGroup(242732991);
                        }
                        composer2.endReplaceGroup();
                        TextStyle bodySmall = MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodySmall();
                        if (StringsKt.startsWith$default(str2, "✨", false, 2, (Object) null)) {
                            composer2.startReplaceGroup(-1513347627);
                            ComposerKt.sourceInformation(composer2, "1598@88828L11");
                            j2 = MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnPrimaryContainer-0d7_KjU();
                        } else {
                            composer2.startReplaceGroup(-1513346029);
                            ComposerKt.sourceInformation(composer2, "1598@88878L11");
                            j2 = MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU();
                        }
                        composer2.endReplaceGroup();
                        TextKt.Text--4IGK_g(str3, (Modifier) null, j2, 0L, (FontStyle) null, StringsKt.startsWith$default(str2, "✨", false, 2, (Object) null) ? FontWeight.Companion.getSemiBold() : FontWeight.Companion.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, bodySmall, composer2, 0, 0, 65498);
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
                }, composer, 54), composer, 12779520, 88);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$272$lambda$271$lambda$256$lambda$255$lambda$252(final MutableState mutableState, LazyItemScope lazyItemScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(lazyItemScope, "$this$item");
        ComposerKt.sourceInformation(composer, "C1550@86251L31,1545@85891L1379:ChatScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-616032049, i, -1, "com.example.ui.screens.ChatScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:1545)");
            }
            Shape shape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(18.0f));
            long j = Color.copy-wmQWz5c$default(ColorKt.Color(4279994175L), 0.15f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
            BorderStroke borderStroke = BorderStrokeKt.BorderStroke-cXLIe8U(Dp.constructor-impl(1.0f), Color.copy-wmQWz5c$default(ColorKt.Color(4279994175L), 0.4f, 0.0f, 0.0f, 0.0f, 14, (Object) null));
            float f = Dp.constructor-impl(1.0f);
            Modifier modifier = Modifier.Companion;
            ComposerKt.sourceInformationMarkerStart(composer, 698700014, "CC(remember):ChatScreen.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda76
                    public final Object invoke() {
                        return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$256$lambda$255$lambda$252$lambda$251$lambda$250(mutableState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            SurfaceKt.Surface-T9BRK9s(ClickableKt.clickable-XHw0xAI$default(modifier, false, (String) null, (Role) null, (Function0) objRememberedValue, 7, (Object) null), shape, j, 0L, 0.0f, f, borderStroke, ComposableSingletons$ChatScreenKt.INSTANCE.m251getLambda$1762353324$app(), composer, 14352768, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$272$lambda$271$lambda$256$lambda$255$lambda$252$lambda$251$lambda$250(MutableState mutableState) {
        ChatScreen$lambda$22(mutableState, true);
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$272$lambda$271$lambda$268(final String str, final boolean z, final Book book, final BookViewModel bookViewModel, final String str2, final MutableState mutableState, final MutableState mutableState2, final MutableState mutableState3, final MutableState mutableState4, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1615@89480L6099:ChatScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1726199628, i, -1, "com.example.ui.screens.ChatScreen.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:1615)");
            }
            Modifier modifier = PaddingKt.padding-VpY3zN4(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(10.0f), Dp.constructor-impl(8.0f));
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            boolean z2 = false;
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
            ComposerKt.sourceInformationMarkerStart(composer, -534044831, "C1623@89857L11,1625@89982L3579,1621@89743L3818,1681@93582L39,1683@93688L1119,1705@95070L491,1682@93642L1919:ChatScreen.kt#2thlc2");
            SurfaceKt.Surface-T9BRK9s(RowScope.weight$default(rowScope, Modifier.Companion, 1.0f, false, 2, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(26.0f)), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0.65f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(1225873517, true, new Function2() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda30
                public final Object invoke(Object obj, Object obj2) {
                    return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$268$lambda$267$lambda$262(str, z, book, bookViewModel, str2, mutableState, mutableState2, mutableState3, mutableState4, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 12582912, 120);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -1402579033, "CC(remember):ChatScreen.kt#9igjgp");
            boolean zChanged = composer.changed(str) | composer.changed(z) | composer.changedInstance(book) | composer.changedInstance(bookViewModel) | composer.changed(str2);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda31
                    public final Object invoke() {
                        return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$268$lambda$267$lambda$265$lambda$264(str, z, book, bookViewModel, str2, mutableState, mutableState2, mutableState3, mutableState4);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier modifier2 = BackgroundKt.background-bw27NRU(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(46.0f)), ColorKt.Color(4279994175L), RoundedCornerShapeKt.getCircleShape());
            if (!ChatScreen$lambda$85(mutableState2) && !StringsKt.isBlank(ChatScreen$lambda$82(mutableState))) {
                z2 = true;
            }
            IconButtonKt.IconButton(function0, modifier2, z2, (IconButtonColors) null, (MutableInteractionSource) null, ComposableLambdaKt.rememberComposableLambda(837012715, true, new Function2() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda32
                public final Object invoke(Object obj, Object obj2) {
                    return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$268$lambda$267$lambda$266(mutableState2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 24);
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

    static final Unit ChatScreen$lambda$272$lambda$271$lambda$268$lambda$267$lambda$262(final String str, final boolean z, final Book book, final BookViewModel bookViewModel, final String str2, final MutableState mutableState, final MutableState mutableState2, final MutableState mutableState3, final MutableState mutableState4, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1636@90580L10,1637@90662L11,1641@90893L11,1642@90983L11,1648@91446L11,1640@90820L675,1656@92024L1255,1628@90112L20,1626@90008L3531:ChatScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1225873517, i, -1, "com.example.ui.screens.ChatScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:1626)");
            }
            String strChatScreen$lambda$82 = ChatScreen$lambda$82(mutableState);
            TextStyle textStyle = TextStyle.copy-p1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface-0d7_KjU(), TextUnitKt.getSp(15), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (Object) null);
            TextFieldColors textFieldColors = TextFieldDefaults.INSTANCE.colors-0hiis_0(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface-0d7_KjU(), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface-0d7_KjU(), 0L, 0L, Color.Companion.getTransparent-0d7_KjU(), Color.Companion.getTransparent-0d7_KjU(), 0L, 0L, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0L, (TextSelectionColors) null, Color.Companion.getTransparent-0d7_KjU(), Color.Companion.getTransparent-0d7_KjU(), Color.Companion.getTransparent-0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 221184, 3504, 0, 0, 3072, 2147469004, 4095);
            KeyboardOptions keyboardOptions = new KeyboardOptions(KeyboardCapitalization.Companion.getSentences-IUNYP9k(), true, 0, ImeAction.Companion.getSend-eUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 116, (DefaultConstructorMarker) null);
            ComposerKt.sourceInformationMarkerStart(composer, 1243477332, "CC(remember):ChatScreen.kt#9igjgp");
            boolean zChanged = composer.changed(str) | composer.changed(z) | composer.changedInstance(book) | composer.changedInstance(bookViewModel) | composer.changed(str2);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda78
                    public final Object invoke(Object obj) {
                        return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$268$lambda$267$lambda$262$lambda$259$lambda$258(str, z, book, bookViewModel, str2, mutableState, mutableState2, mutableState3, mutableState4, (KeyboardActionScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            KeyboardActions keyboardActions = new KeyboardActions((Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) objRememberedValue, 31, (DefaultConstructorMarker) null);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            boolean z2 = !ChatScreen$lambda$85(mutableState2);
            ComposerKt.sourceInformationMarkerStart(composer, 1243414913, "CC(remember):ChatScreen.kt#9igjgp");
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda79
                    public final Object invoke(Object obj) {
                        return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$268$lambda$267$lambda$262$lambda$261$lambda$260(mutableState, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            TextFieldKt.TextField(strChatScreen$lambda$82, (Function1) objRememberedValue2, modifierFillMaxWidth$default, z2, false, textStyle, (Function2) null, ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$1871148776$app(), (Function2) null, (Function2) null, (Function2) null, (Function2) null, (Function2) null, false, (VisualTransformation) null, keyboardOptions, keyboardActions, false, 4, 0, (MutableInteractionSource) null, (Shape) null, textFieldColors, composer, 12583344, 113442816, 0, 3702608);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$272$lambda$271$lambda$268$lambda$267$lambda$262$lambda$261$lambda$260(MutableState mutableState, String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        mutableState.setValue(str);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004f A[PHI: r2
      0x004f: PHI (r2v7 java.lang.String) = (r2v6 java.lang.String), (r2v9 java.lang.String), (r2v11 java.lang.String) binds: [B:21:0x004c, B:17:0x0043, B:13:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    static final Unit ChatScreen$lambda$272$lambda$271$lambda$268$lambda$267$lambda$262$lambda$259$lambda$258(String str, boolean z, Book book, BookViewModel bookViewModel, String str2, final MutableState mutableState, final MutableState mutableState2, final MutableState mutableState3, final MutableState mutableState4, KeyboardActionScope keyboardActionScope) {
        String ownerName;
        Intrinsics.checkNotNullParameter(keyboardActionScope, "$this$KeyboardActions");
        if (!StringsKt.isBlank(ChatScreen$lambda$82(mutableState)) && !ChatScreen$lambda$85(mutableState2)) {
            String string = StringsKt.trim(ChatScreen$lambda$82(mutableState)).toString();
            if (StringsKt.isBlank(str)) {
                str = "";
                if (z) {
                    if (book == null || (ownerName = book.getRequestedByName()) == null) {
                        ownerName = book != null ? book.getBorrowerName() : null;
                        if (ownerName != null) {
                            str = ownerName;
                        }
                    } else {
                        str = ownerName;
                    }
                } else if (book != null && (ownerName = book.getOwnerName()) != null) {
                    str = ownerName;
                }
            }
            if (!StringsKt.isBlank(str)) {
                ChatScreen$lambda$86(mutableState2, true);
                bookViewModel.validateAndSendMessage(str2, str, string, new Function2() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda29
                    public final Object invoke(Object obj, Object obj2) {
                        return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$268$lambda$267$lambda$262$lambda$259$lambda$258$lambda$257(mutableState2, mutableState, mutableState3, mutableState4, ((Boolean) obj).booleanValue(), (String) obj2);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$272$lambda$271$lambda$268$lambda$267$lambda$262$lambda$259$lambda$258$lambda$257(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, boolean z, String str) {
        Intrinsics.checkNotNullParameter(str, "reason");
        ChatScreen$lambda$86(mutableState, false);
        if (z) {
            mutableState2.setValue("");
        } else {
            mutableState3.setValue(str);
            ChatScreen$lambda$99(mutableState4, true);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a A[PHI: r3
      0x004a: PHI (r3v7 java.lang.String) = (r3v6 java.lang.String), (r3v9 java.lang.String), (r3v11 java.lang.String) binds: [B:21:0x0047, B:17:0x003e, B:13:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    static final Unit ChatScreen$lambda$272$lambda$271$lambda$268$lambda$267$lambda$265$lambda$264(String str, boolean z, Book book, BookViewModel bookViewModel, String str2, final MutableState mutableState, final MutableState mutableState2, final MutableState mutableState3, final MutableState mutableState4) {
        String ownerName;
        if (!StringsKt.isBlank(ChatScreen$lambda$82(mutableState)) && !ChatScreen$lambda$85(mutableState2)) {
            String string = StringsKt.trim(ChatScreen$lambda$82(mutableState)).toString();
            if (StringsKt.isBlank(str)) {
                str = "";
                if (z) {
                    if (book == null || (ownerName = book.getRequestedByName()) == null) {
                        ownerName = book != null ? book.getBorrowerName() : null;
                        if (ownerName != null) {
                            str = ownerName;
                        }
                    } else {
                        str = ownerName;
                    }
                } else if (book != null && (ownerName = book.getOwnerName()) != null) {
                    str = ownerName;
                }
            }
            if (!StringsKt.isBlank(str)) {
                ChatScreen$lambda$86(mutableState2, true);
                bookViewModel.validateAndSendMessage(str2, str, string, new Function2() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda75
                    public final Object invoke(Object obj, Object obj2) {
                        return ChatScreenKt.ChatScreen$lambda$272$lambda$271$lambda$268$lambda$267$lambda$265$lambda$264$lambda$263(mutableState2, mutableState, mutableState3, mutableState4, ((Boolean) obj).booleanValue(), (String) obj2);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$272$lambda$271$lambda$268$lambda$267$lambda$265$lambda$264$lambda$263(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, boolean z, String str) {
        Intrinsics.checkNotNullParameter(str, "reason");
        ChatScreen$lambda$86(mutableState, false);
        if (z) {
            mutableState2.setValue("");
        } else {
            mutableState3.setValue(str);
            ChatScreen$lambda$99(mutableState4, true);
        }
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$272$lambda$271$lambda$268$lambda$267$lambda$266(MutableState mutableState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C:ChatScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(837012715, i, -1, "com.example.ui.screens.ChatScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:1706)");
            }
            if (ChatScreen$lambda$85(mutableState)) {
                composer.startReplaceGroup(-1134278626);
                ComposerKt.sourceInformation(composer, "1707@95141L225");
                ProgressIndicatorKt.CircularProgressIndicator-LxG7B9w(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(20.0f)), Color.Companion.getWhite-0d7_KjU(), Dp.constructor-impl(2.0f), 0L, 0, composer, 438, 24);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1133998262);
                ComposerKt.sourceInformation(composer, "1713@95428L85");
                IconKt.Icon-ww6aTOc(SendKt.getSend(Icons.AutoMirrored.Filled.INSTANCE), "Send", (Modifier) null, Color.Companion.getWhite-0d7_KjU(), composer, 3120, 4);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$272$lambda$271$lambda$270$lambda$269(BookViewModel bookViewModel, Book book, Context context, MutableState mutableState) {
        ChatScreen$lambda$61(mutableState, false);
        BookViewModel.m159confirmAndCompleteReturn0E7RQCE$default(bookViewModel, book, null, null, 6, null);
        Toast.makeText(context, "Return confirmed! Book is available again.", 1).show();
        return Unit.INSTANCE;
    }

    private static final void PartnerAvatarCircle(final String str, Composer composer, final int i) {
        int i2;
        final String string;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1038057926);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(PartnerAvatarCircle)1743@96582L248,1739@96463L367:ChatScreen.kt#2thlc2");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1038057926, i2, -1, "com.example.ui.screens.PartnerAvatarCircle (ChatScreen.kt:1737)");
            }
            Character chFirstOrNull = StringsKt.firstOrNull(str);
            if (chFirstOrNull == null || (string = Character.valueOf(Character.toUpperCase(chFirstOrNull.charValue())).toString()) == null) {
                string = "R";
            }
            SurfaceKt.Surface-T9BRK9s(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(38.0f)), RoundedCornerShapeKt.getCircleShape(), ColorKt.Color(4279994175L), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-179006891, true, new Function2() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda70
                public final Object invoke(Object obj, Object obj2) {
                    return ChatScreenKt.PartnerAvatarCircle$lambda$275(string, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 12583302, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda71
                public final Object invoke(Object obj, Object obj2) {
                    return ChatScreenKt.PartnerAvatarCircle$lambda$276(str, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final Unit PartnerAvatarCircle$lambda$275(String str, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1744@96592L232:ChatScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-179006891, i, -1, "com.example.ui.screens.PartnerAvatarCircle.<anonymous> (ChatScreen.kt:1744)");
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
            ComposerKt.sourceInformationMarkerStart(composer, 1078201869, "C1745@96647L167:ChatScreen.kt#2thlc2");
            TextKt.Text--4IGK_g(str, (Modifier) null, Color.Companion.getWhite-0d7_KjU(), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 200064, 0, 131026);
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

    /* JADX WARN: Code duplicated, block: B:101:0x0183  */
    /* JADX WARN: Code duplicated, block: B:104:0x018a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0192  */
    /* JADX WARN: Code duplicated, block: B:111:0x0199  */
    /* JADX WARN: Code duplicated, block: B:115:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:118:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:122:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:125:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:129:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:131:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:132:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:134:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:137:0x01df  */
    /* JADX WARN: Code duplicated, block: B:143:0x01fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:144:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:145:0x0200  */
    /* JADX WARN: Code duplicated, block: B:147:0x0204  */
    /* JADX WARN: Code duplicated, block: B:148:0x0207  */
    /* JADX WARN: Code duplicated, block: B:150:0x020b  */
    /* JADX WARN: Code duplicated, block: B:152:0x0221  */
    /* JADX WARN: Code duplicated, block: B:154:0x022f  */
    /* JADX WARN: Code duplicated, block: B:157:0x0239  */
    /* JADX WARN: Code duplicated, block: B:158:0x0244  */
    /* JADX WARN: Code duplicated, block: B:161:0x024c  */
    /* JADX WARN: Code duplicated, block: B:162:0x0257  */
    /* JADX WARN: Code duplicated, block: B:165:0x026f  */
    /* JADX WARN: Code duplicated, block: B:166:0x027a  */
    /* JADX WARN: Code duplicated, block: B:169:0x0308  */
    /* JADX WARN: Code duplicated, block: B:173:0x0314  */
    /* JADX WARN: Code duplicated, block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00da  */
    /* JADX WARN: Code duplicated, block: B:40:0x00de  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:51:0x0105  */
    /* JADX WARN: Code duplicated, block: B:53:0x010b  */
    /* JADX WARN: Code duplicated, block: B:54:0x010e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0118  */
    /* JADX WARN: Code duplicated, block: B:60:0x011e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0121  */
    /* JADX WARN: Code duplicated, block: B:65:0x012b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0131  */
    /* JADX WARN: Code duplicated, block: B:68:0x0134  */
    /* JADX WARN: Code duplicated, block: B:72:0x013e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0144  */
    /* JADX WARN: Code duplicated, block: B:75:0x0147  */
    /* JADX WARN: Code duplicated, block: B:79:0x0151  */
    /* JADX WARN: Code duplicated, block: B:81:0x0157  */
    /* JADX WARN: Code duplicated, block: B:82:0x015a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0162  */
    /* JADX WARN: Code duplicated, block: B:89:0x0169  */
    /* JADX WARN: Code duplicated, block: B:91:0x016e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0174  */
    /* JADX WARN: Code duplicated, block: B:97:0x017b  */
    public static final void ExchangeHubBar(final Book book, final boolean z, final String str, Float f, int i, Function0<Unit> function0, final Function0<Unit> function1, final Function0<Unit> function2, final Function0<Unit> function3, final Function0<Unit> function4, final Function0<Unit> function5, final Function0<Unit> function6, final Function0<Unit> function7, final Function0<Unit> function8, final Function0<Unit> function9, final Function0<Unit> function10, final Function0<Unit> function11, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Float f2;
        int i13;
        Function0<Unit> function12;
        String requestedByName;
        String string;
        String borrowerName;
        String string2;
        Composer composer2;
        final Function0<Unit> function13;
        final Float f3;
        final int i14;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Intrinsics.checkNotNullParameter(book, "book");
        Intrinsics.checkNotNullParameter(str, "currentUser");
        Intrinsics.checkNotNullParameter(function1, "onAcceptRequest");
        Intrinsics.checkNotNullParameter(function2, "onDeclineRequest");
        Intrinsics.checkNotNullParameter(function3, "onStartHandoverScan");
        Intrinsics.checkNotNullParameter(function4, "onShowHandoverQr");
        Intrinsics.checkNotNullParameter(function5, "onScanHandoverQr");
        Intrinsics.checkNotNullParameter(function6, "onAcceptTransfer");
        Intrinsics.checkNotNullParameter(function7, "onStartReturnScan");
        Intrinsics.checkNotNullParameter(function8, "onShowReturnQr");
        Intrinsics.checkNotNullParameter(function9, "onScanReturnQr");
        Intrinsics.checkNotNullParameter(function10, "onAcceptReturn");
        Intrinsics.checkNotNullParameter(function11, "onSafeMeetupClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(2005406062);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ExchangeHubBar)P(!1,2!1,15,16,7!1,6,13,11,9,5,14,12,10)1762@97032L2,1779@97645L11,1782@97773L20834,1778@97606L21001:ChatScreen.kt#2thlc2");
        if ((i2 & 6) == 0) {
            i5 = (composerStartRestartGroup.changedInstance(book) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        int i20 = i2 & 384;
        int i21 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
        if (i20 == 0) {
            i5 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        int i22 = i4 & 8;
        if (i22 == 0) {
            if ((i2 & 3072) == 0) {
                i5 |= composerStartRestartGroup.changed(f) ? 2048 : 1024;
            }
            i6 = i4 & 16;
            if (i6 != 0) {
                if ((i2 & 24576) == 0) {
                    if (composerStartRestartGroup.changed(i)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i5 |= i7;
                }
                i8 = i4 & 32;
                i9 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                if (i8 != 0) {
                    i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changedInstance(function0)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i5 |= i10;
                }
                if ((i2 & 1572864) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i5 |= i19;
                }
                if ((i2 & 12582912) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i5 |= i18;
                }
                if ((i2 & 100663296) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i17 = 67108864;
                    } else {
                        i17 = 33554432;
                    }
                    i5 |= i17;
                }
                if ((i2 & 805306368) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i5 |= i16;
                }
                if ((i3 & 6) == 0) {
                    i11 = i3 | (composerStartRestartGroup.changedInstance(function5) ? 4 : 2);
                } else {
                    i11 = i3;
                }
                if ((i3 & 48) == 0) {
                    i11 |= composerStartRestartGroup.changedInstance(function6) ? 32 : 16;
                }
                if ((i3 & 384) == 0) {
                    if (!composerStartRestartGroup.changedInstance(function7)) {
                        i21 = 128;
                    }
                    i11 |= i21;
                }
                if ((i3 & 3072) == 0) {
                    i11 |= composerStartRestartGroup.changedInstance(function8) ? 2048 : 1024;
                }
                if ((i3 & 24576) == 0) {
                    i11 |= composerStartRestartGroup.changedInstance(function9) ? 16384 : 8192;
                }
                if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (!composerStartRestartGroup.changedInstance(function10)) {
                        i9 = 65536;
                    }
                    i11 |= i9;
                }
                if ((i3 & 1572864) != 0) {
                    if (composerStartRestartGroup.changedInstance(function11)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i11 |= i15;
                }
                i12 = i11;
                if ((i5 & 306783379) != 306783378 && (599187 & i12) == 599186 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    f3 = f;
                    i14 = i;
                    composer2 = composerStartRestartGroup;
                    function13 = function0;
                } else {
                    if (i22 != 0) {
                        f2 = null;
                    } else {
                        f2 = f;
                    }
                    if (i6 != 0) {
                        i13 = 0;
                    } else {
                        i13 = i;
                    }
                    if (i8 != 0) {
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1245083984, "CC(remember):ChatScreen.kt#9igjgp");
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.Companion.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda67
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        function12 = (Function0) objRememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    } else {
                        function12 = function0;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2005406062, i5, i12, "com.example.ui.screens.ExchangeHubBar (ChatScreen.kt:1774)");
                    }
                    requestedByName = book.getRequestedByName();
                    if (requestedByName != null) {
                        string = StringsKt.trim(requestedByName).toString();
                    } else {
                        string = null;
                    }
                    String str2 = str;
                    final boolean zEquals = StringsKt.equals(string, StringsKt.trim(str2).toString(), true);
                    borrowerName = book.getBorrowerName();
                    if (borrowerName != null) {
                        string2 = StringsKt.trim(borrowerName).toString();
                    } else {
                        string2 = null;
                    }
                    final boolean zEquals2 = StringsKt.equals(string2, StringsKt.trim(str2).toString(), true);
                    final Float f4 = f2;
                    final int i23 = i13;
                    final Function0<Unit> function14 = function12;
                    SurfaceKt.Surface-T9BRK9s(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), (Shape) null, Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0.65f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, Dp.constructor-impl(2.0f), 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-1278128183, true, new Function2() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda68
                        public final Object invoke(Object obj, Object obj2) {
                            return ChatScreenKt.ExchangeHubBar$lambda$292(book, z, zEquals2, function14, f4, function11, zEquals, i23, function1, function2, function3, function4, function6, function5, function7, function8, function9, function10, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 12607494, 106);
                    composer2 = composerStartRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function13 = function14;
                    f3 = f4;
                    i14 = i23;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda69
                        public final Object invoke(Object obj, Object obj2) {
                            return ChatScreenKt.ExchangeHubBar$lambda$293(book, z, str, f3, i14, function13, function1, function2, function3, function4, function5, function6, function7, function8, function9, function10, function11, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i5 |= 24576;
            i8 = i4 & 32;
            i9 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            if (i8 != 0) {
                i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i5 |= i10;
            }
            if ((i2 & 1572864) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i5 |= i19;
            }
            if ((i2 & 12582912) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i5 |= i18;
            }
            if ((i2 & 100663296) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i17 = 67108864;
                } else {
                    i17 = 33554432;
                }
                i5 |= i17;
            }
            if ((i2 & 805306368) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i16 = 536870912;
                } else {
                    i16 = 268435456;
                }
                i5 |= i16;
            }
            if ((i3 & 6) == 0) {
                i11 = i3 | (composerStartRestartGroup.changedInstance(function5) ? 4 : 2);
            } else {
                i11 = i3;
            }
            if ((i3 & 48) == 0) {
                i11 |= composerStartRestartGroup.changedInstance(function6) ? 32 : 16;
            }
            if ((i3 & 384) == 0) {
                if (!composerStartRestartGroup.changedInstance(function7)) {
                    i21 = 128;
                }
                i11 |= i21;
            }
            if ((i3 & 3072) == 0) {
                i11 |= composerStartRestartGroup.changedInstance(function8) ? 2048 : 1024;
            }
            if ((i3 & 24576) == 0) {
                i11 |= composerStartRestartGroup.changedInstance(function9) ? 16384 : 8192;
            }
            if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                if (!composerStartRestartGroup.changedInstance(function10)) {
                    i9 = 65536;
                }
                i11 |= i9;
            }
            if ((i3 & 1572864) != 0) {
                if (composerStartRestartGroup.changedInstance(function11)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i11 |= i15;
            }
            i12 = i11;
            if ((i5 & 306783379) != 306783378) {
                if (i22 != 0) {
                    f2 = null;
                } else {
                    f2 = f;
                }
                if (i6 != 0) {
                    i13 = 0;
                } else {
                    i13 = i;
                }
                if (i8 != 0) {
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1245083984, "CC(remember):ChatScreen.kt#9igjgp");
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda67
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    function12 = (Function0) objRememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                } else {
                    function12 = function0;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2005406062, i5, i12, "com.example.ui.screens.ExchangeHubBar (ChatScreen.kt:1774)");
                }
                requestedByName = book.getRequestedByName();
                if (requestedByName != null) {
                    string = StringsKt.trim(requestedByName).toString();
                } else {
                    string = null;
                }
                String str3 = str;
                final boolean zEquals3 = StringsKt.equals(string, StringsKt.trim(str3).toString(), true);
                borrowerName = book.getBorrowerName();
                if (borrowerName != null) {
                    string2 = StringsKt.trim(borrowerName).toString();
                } else {
                    string2 = null;
                }
                final boolean zEquals4 = StringsKt.equals(string2, StringsKt.trim(str3).toString(), true);
                final Float f5 = f2;
                final int i24 = i13;
                final Function0 function15 = function12;
                SurfaceKt.Surface-T9BRK9s(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), (Shape) null, Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0.65f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, Dp.constructor-impl(2.0f), 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-1278128183, true, new Function2() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda68
                    public final Object invoke(Object obj, Object obj2) {
                        return ChatScreenKt.ExchangeHubBar$lambda$292(book, z, zEquals4, function15, f5, function11, zEquals3, i24, function1, function2, function3, function4, function6, function5, function7, function8, function9, function10, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 12607494, 106);
                composer2 = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function13 = function15;
                f3 = f5;
                i14 = i24;
            } else {
                if (i22 != 0) {
                    f2 = null;
                } else {
                    f2 = f;
                }
                if (i6 != 0) {
                    i13 = 0;
                } else {
                    i13 = i;
                }
                if (i8 != 0) {
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1245083984, "CC(remember):ChatScreen.kt#9igjgp");
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda67
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    function12 = (Function0) objRememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                } else {
                    function12 = function0;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2005406062, i5, i12, "com.example.ui.screens.ExchangeHubBar (ChatScreen.kt:1774)");
                }
                requestedByName = book.getRequestedByName();
                if (requestedByName != null) {
                    string = StringsKt.trim(requestedByName).toString();
                } else {
                    string = null;
                }
                String str4 = str;
                final boolean zEquals5 = StringsKt.equals(string, StringsKt.trim(str4).toString(), true);
                borrowerName = book.getBorrowerName();
                if (borrowerName != null) {
                    string2 = StringsKt.trim(borrowerName).toString();
                } else {
                    string2 = null;
                }
                final boolean zEquals6 = StringsKt.equals(string2, StringsKt.trim(str4).toString(), true);
                final Float f6 = f2;
                final int i25 = i13;
                final Function0 function16 = function12;
                SurfaceKt.Surface-T9BRK9s(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), (Shape) null, Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0.65f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, Dp.constructor-impl(2.0f), 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-1278128183, true, new Function2() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda68
                    public final Object invoke(Object obj, Object obj2) {
                        return ChatScreenKt.ExchangeHubBar$lambda$292(book, z, zEquals6, function16, f6, function11, zEquals5, i25, function1, function2, function3, function4, function6, function5, function7, function8, function9, function10, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 12607494, 106);
                composer2 = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function13 = function16;
                f3 = f6;
                i14 = i25;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda69
                    public final Object invoke(Object obj, Object obj2) {
                        return ChatScreenKt.ExchangeHubBar$lambda$293(book, z, str, f3, i14, function13, function1, function2, function3, function4, function5, function6, function7, function8, function9, function10, function11, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i5 |= 3072;
        i6 = i4 & 16;
        if (i6 != 0) {
            if ((i2 & 24576) == 0) {
                if (composerStartRestartGroup.changed(i)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i5 |= i7;
            }
            i8 = i4 & 32;
            i9 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            if (i8 != 0) {
                i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i5 |= i10;
            }
            if ((i2 & 1572864) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i5 |= i19;
            }
            if ((i2 & 12582912) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i5 |= i18;
            }
            if ((i2 & 100663296) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i17 = 67108864;
                } else {
                    i17 = 33554432;
                }
                i5 |= i17;
            }
            if ((i2 & 805306368) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i16 = 536870912;
                } else {
                    i16 = 268435456;
                }
                i5 |= i16;
            }
            if ((i3 & 6) == 0) {
                i11 = i3 | (composerStartRestartGroup.changedInstance(function5) ? 4 : 2);
            } else {
                i11 = i3;
            }
            if ((i3 & 48) == 0) {
                i11 |= composerStartRestartGroup.changedInstance(function6) ? 32 : 16;
            }
            if ((i3 & 384) == 0) {
                if (!composerStartRestartGroup.changedInstance(function7)) {
                    i21 = 128;
                }
                i11 |= i21;
            }
            if ((i3 & 3072) == 0) {
                i11 |= composerStartRestartGroup.changedInstance(function8) ? 2048 : 1024;
            }
            if ((i3 & 24576) == 0) {
                i11 |= composerStartRestartGroup.changedInstance(function9) ? 16384 : 8192;
            }
            if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                if (!composerStartRestartGroup.changedInstance(function10)) {
                    i9 = 65536;
                }
                i11 |= i9;
            }
            if ((i3 & 1572864) != 0) {
                if (composerStartRestartGroup.changedInstance(function11)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i11 |= i15;
            }
            i12 = i11;
            if ((i5 & 306783379) != 306783378) {
                if (i22 != 0) {
                    f2 = null;
                } else {
                    f2 = f;
                }
                if (i6 != 0) {
                    i13 = 0;
                } else {
                    i13 = i;
                }
                if (i8 != 0) {
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1245083984, "CC(remember):ChatScreen.kt#9igjgp");
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda67
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    function12 = (Function0) objRememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                } else {
                    function12 = function0;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2005406062, i5, i12, "com.example.ui.screens.ExchangeHubBar (ChatScreen.kt:1774)");
                }
                requestedByName = book.getRequestedByName();
                if (requestedByName != null) {
                    string = StringsKt.trim(requestedByName).toString();
                } else {
                    string = null;
                }
                String str5 = str;
                final boolean zEquals7 = StringsKt.equals(string, StringsKt.trim(str5).toString(), true);
                borrowerName = book.getBorrowerName();
                if (borrowerName != null) {
                    string2 = StringsKt.trim(borrowerName).toString();
                } else {
                    string2 = null;
                }
                final boolean zEquals8 = StringsKt.equals(string2, StringsKt.trim(str5).toString(), true);
                final Float f7 = f2;
                final int i26 = i13;
                final Function0 function17 = function12;
                SurfaceKt.Surface-T9BRK9s(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), (Shape) null, Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0.65f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, Dp.constructor-impl(2.0f), 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-1278128183, true, new Function2() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda68
                    public final Object invoke(Object obj, Object obj2) {
                        return ChatScreenKt.ExchangeHubBar$lambda$292(book, z, zEquals8, function17, f7, function11, zEquals7, i26, function1, function2, function3, function4, function6, function5, function7, function8, function9, function10, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 12607494, 106);
                composer2 = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function13 = function17;
                f3 = f7;
                i14 = i26;
            } else {
                if (i22 != 0) {
                    f2 = null;
                } else {
                    f2 = f;
                }
                if (i6 != 0) {
                    i13 = 0;
                } else {
                    i13 = i;
                }
                if (i8 != 0) {
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1245083984, "CC(remember):ChatScreen.kt#9igjgp");
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda67
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    function12 = (Function0) objRememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                } else {
                    function12 = function0;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2005406062, i5, i12, "com.example.ui.screens.ExchangeHubBar (ChatScreen.kt:1774)");
                }
                requestedByName = book.getRequestedByName();
                if (requestedByName != null) {
                    string = StringsKt.trim(requestedByName).toString();
                } else {
                    string = null;
                }
                String str6 = str;
                final boolean zEquals9 = StringsKt.equals(string, StringsKt.trim(str6).toString(), true);
                borrowerName = book.getBorrowerName();
                if (borrowerName != null) {
                    string2 = StringsKt.trim(borrowerName).toString();
                } else {
                    string2 = null;
                }
                final boolean zEquals10 = StringsKt.equals(string2, StringsKt.trim(str6).toString(), true);
                final Float f8 = f2;
                final int i27 = i13;
                final Function0 function18 = function12;
                SurfaceKt.Surface-T9BRK9s(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), (Shape) null, Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0.65f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, Dp.constructor-impl(2.0f), 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-1278128183, true, new Function2() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda68
                    public final Object invoke(Object obj, Object obj2) {
                        return ChatScreenKt.ExchangeHubBar$lambda$292(book, z, zEquals10, function18, f8, function11, zEquals9, i27, function1, function2, function3, function4, function6, function5, function7, function8, function9, function10, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 12607494, 106);
                composer2 = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function13 = function18;
                f3 = f8;
                i14 = i27;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda69
                    public final Object invoke(Object obj, Object obj2) {
                        return ChatScreenKt.ExchangeHubBar$lambda$293(book, z, str, f3, i14, function13, function1, function2, function3, function4, function5, function6, function7, function8, function9, function10, function11, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i5 |= 24576;
        i8 = i4 & 32;
        i9 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
        if (i8 != 0) {
            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            if (composerStartRestartGroup.changedInstance(function0)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i5 |= i10;
        }
        if ((i2 & 1572864) == 0) {
            if (composerStartRestartGroup.changedInstance(function1)) {
                i19 = 1048576;
            } else {
                i19 = 524288;
            }
            i5 |= i19;
        }
        if ((i2 & 12582912) == 0) {
            if (composerStartRestartGroup.changedInstance(function2)) {
                i18 = 8388608;
            } else {
                i18 = 4194304;
            }
            i5 |= i18;
        }
        if ((i2 & 100663296) == 0) {
            if (composerStartRestartGroup.changedInstance(function3)) {
                i17 = 67108864;
            } else {
                i17 = 33554432;
            }
            i5 |= i17;
        }
        if ((i2 & 805306368) == 0) {
            if (composerStartRestartGroup.changedInstance(function4)) {
                i16 = 536870912;
            } else {
                i16 = 268435456;
            }
            i5 |= i16;
        }
        if ((i3 & 6) == 0) {
            i11 = i3 | (composerStartRestartGroup.changedInstance(function5) ? 4 : 2);
        } else {
            i11 = i3;
        }
        if ((i3 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function6) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            if (!composerStartRestartGroup.changedInstance(function7)) {
                i21 = 128;
            }
            i11 |= i21;
        }
        if ((i3 & 3072) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function8) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function9) ? 16384 : 8192;
        }
        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            if (!composerStartRestartGroup.changedInstance(function10)) {
                i9 = 65536;
            }
            i11 |= i9;
        }
        if ((i3 & 1572864) != 0) {
            if (composerStartRestartGroup.changedInstance(function11)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i11 |= i15;
        }
        i12 = i11;
        if ((i5 & 306783379) != 306783378) {
            if (i22 != 0) {
                f2 = null;
            } else {
                f2 = f;
            }
            if (i6 != 0) {
                i13 = 0;
            } else {
                i13 = i;
            }
            if (i8 != 0) {
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1245083984, "CC(remember):ChatScreen.kt#9igjgp");
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda67
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                function12 = (Function0) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            } else {
                function12 = function0;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2005406062, i5, i12, "com.example.ui.screens.ExchangeHubBar (ChatScreen.kt:1774)");
            }
            requestedByName = book.getRequestedByName();
            if (requestedByName != null) {
                string = StringsKt.trim(requestedByName).toString();
            } else {
                string = null;
            }
            String str7 = str;
            final boolean zEquals11 = StringsKt.equals(string, StringsKt.trim(str7).toString(), true);
            borrowerName = book.getBorrowerName();
            if (borrowerName != null) {
                string2 = StringsKt.trim(borrowerName).toString();
            } else {
                string2 = null;
            }
            final boolean zEquals12 = StringsKt.equals(string2, StringsKt.trim(str7).toString(), true);
            final Float f9 = f2;
            final int i28 = i13;
            final Function0 function19 = function12;
            SurfaceKt.Surface-T9BRK9s(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), (Shape) null, Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0.65f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, Dp.constructor-impl(2.0f), 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-1278128183, true, new Function2() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda68
                public final Object invoke(Object obj, Object obj2) {
                    return ChatScreenKt.ExchangeHubBar$lambda$292(book, z, zEquals12, function19, f9, function11, zEquals11, i28, function1, function2, function3, function4, function6, function5, function7, function8, function9, function10, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 12607494, 106);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function13 = function19;
            f3 = f9;
            i14 = i28;
        } else {
            if (i22 != 0) {
                f2 = null;
            } else {
                f2 = f;
            }
            if (i6 != 0) {
                i13 = 0;
            } else {
                i13 = i;
            }
            if (i8 != 0) {
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1245083984, "CC(remember):ChatScreen.kt#9igjgp");
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda67
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                function12 = (Function0) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            } else {
                function12 = function0;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2005406062, i5, i12, "com.example.ui.screens.ExchangeHubBar (ChatScreen.kt:1774)");
            }
            requestedByName = book.getRequestedByName();
            if (requestedByName != null) {
                string = StringsKt.trim(requestedByName).toString();
            } else {
                string = null;
            }
            String str8 = str;
            final boolean zEquals13 = StringsKt.equals(string, StringsKt.trim(str8).toString(), true);
            borrowerName = book.getBorrowerName();
            if (borrowerName != null) {
                string2 = StringsKt.trim(borrowerName).toString();
            } else {
                string2 = null;
            }
            final boolean zEquals14 = StringsKt.equals(string2, StringsKt.trim(str8).toString(), true);
            final Float f10 = f2;
            final int i29 = i13;
            final Function0 function110 = function12;
            SurfaceKt.Surface-T9BRK9s(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), (Shape) null, Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0.65f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, Dp.constructor-impl(2.0f), 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-1278128183, true, new Function2() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda68
                public final Object invoke(Object obj, Object obj2) {
                    return ChatScreenKt.ExchangeHubBar$lambda$292(book, z, zEquals14, function110, f10, function11, zEquals13, i29, function1, function2, function3, function4, function6, function5, function7, function8, function9, function10, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 12607494, 106);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function13 = function110;
            f3 = f10;
            i14 = i29;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.ChatScreenKt$$ExternalSyntheticLambda69
                public final Object invoke(Object obj, Object obj2) {
                    return ChatScreenKt.ExchangeHubBar$lambda$293(book, z, str, f3, i14, function13, function1, function2, function3, function4, function5, function6, function7, function8, function9, function10, function11, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:102:0x042b  */
    /* JADX WARN: Code duplicated, block: B:257:0x13bb  */
    /* JADX WARN: Code duplicated, block: B:62:0x02ac  */
    /*  JADX ERROR: UnsupportedOperationException in pass: SwitchBreakVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor$BaseSwitchRegionVisitor.leaveRegion(SwitchBreakVisitor.java:210)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor$IterativeSwitchRegionVisitor.leaveRegion(SwitchBreakVisitor.java:177)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor.runSwitchTraverse(SwitchBreakVisitor.java:52)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor.visit(SwitchBreakVisitor.java:45)
        */
    static final kotlin.Unit ExchangeHubBar$lambda$292(com.example.data.Book r52, boolean r53, boolean r54, kotlin.jvm.functions.Function0 r55, java.lang.Float r56, kotlin.jvm.functions.Function0 r57, boolean r58, int r59, kotlin.jvm.functions.Function0 r60, kotlin.jvm.functions.Function0 r61, kotlin.jvm.functions.Function0 r62, kotlin.jvm.functions.Function0 r63, kotlin.jvm.functions.Function0 r64, kotlin.jvm.functions.Function0 r65, kotlin.jvm.functions.Function0 r66, kotlin.jvm.functions.Function0 r67, kotlin.jvm.functions.Function0 r68, kotlin.jvm.functions.Function0 r69, androidx.compose.runtime.Composer r70, int r71) {
        /*
            Method dump skipped, instruction units count: 6048
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.ChatScreenKt.ExchangeHubBar$lambda$292(com.example.data.Book, boolean, boolean, kotlin.jvm.functions.Function0, java.lang.Float, kotlin.jvm.functions.Function0, boolean, int, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    static final Unit ExchangeHubBar$lambda$292$lambda$291$lambda$280$lambda$279(String str, long j, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1806@99115L10,1804@99019L328:ChatScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-882123148, i, -1, "com.example.ui.screens.ExchangeHubBar.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:1804)");
            }
            TextStyle labelMedium = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelMedium();
            TextKt.Text--4IGK_g(str, PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(8.0f), Dp.constructor-impl(4.0f)), j, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, labelMedium, composer, 196656, 0, 65496);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Message> ChatScreen$lambda$8(State<? extends List<Message>> state) {
        return (List) state.getValue();
    }

    private static final List<Book> ChatScreen$lambda$9(State<? extends List<Book>> state) {
        return (List) state.getValue();
    }

    private static final Book ChatScreen$lambda$12(State<Book> state) {
        return (Book) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ChatScreen$lambda$13(State<String> state) {
        return (String) state.getValue();
    }

    private static final List<Review> ChatScreen$lambda$272$lambda$271$lambda$195(State<? extends List<Review>> state) {
        return (List) state.getValue();
    }
}
