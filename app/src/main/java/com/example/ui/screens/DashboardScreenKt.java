package com.example.ui.screens;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.net.Uri;
import android.util.Base64;
import android.widget.Toast;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
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
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemScope;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells;
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.LibraryBooksKt;
import androidx.compose.material.icons.automirrored.filled.ViewListKt;
import androidx.compose.material.icons.filled.AutoAwesomeKt;
import androidx.compose.material.icons.filled.AutoStoriesKt;
import androidx.compose.material.icons.filled.BookKt;
import androidx.compose.material.icons.filled.BookmarkAddKt;
import androidx.compose.material.icons.filled.BookmarkBorderKt;
import androidx.compose.material.icons.filled.BookmarkKt;
import androidx.compose.material.icons.filled.CheckCircleKt;
import androidx.compose.material.icons.filled.ChevronRightKt;
import androidx.compose.material.icons.filled.EmailKt;
import androidx.compose.material.icons.filled.GppGoodKt;
import androidx.compose.material.icons.filled.GridViewKt;
import androidx.compose.material.icons.filled.PersonKt;
import androidx.compose.material.icons.filled.StarKt;
import androidx.compose.material.icons.filled.VerifiedKt;
import androidx.compose.material.icons.filled.WarningKt;
import androidx.compose.material.icons.outlined.StarOutlineKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.BadgeKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonElevation;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.ExposedDropdownMenuBoxScope;
import androidx.compose.material3.ExposedDropdownMenuDefaults;
import androidx.compose.material3.ExposedDropdownMenu_androidKt;
import androidx.compose.material3.FilterChipDefaults;
import androidx.compose.material3.FloatingActionButtonElevation;
import androidx.compose.material3.FloatingActionButtonKt;
import androidx.compose.material3.IconButtonColors;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MenuAnchorType;
import androidx.compose.material3.MenuItemColors;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.SelectableChipColors;
import androidx.compose.material3.SelectableChipElevation;
import androidx.compose.material3.SnackbarHostKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.CompositionLocalMap;
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
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.fragment.app.FragmentTransaction;
import androidx.profileinstaller.ProfileVerifier;
import coil.compose.SingletonAsyncImageKt;
import com.example.BuildConfig;
import com.example.R;
import com.example.data.Book;
import com.example.data.User;
import com.example.data.WishlistRequest;
import com.example.ui.BookViewModel;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: compiled from: DashboardScreen.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0007\n\u0002\b\u0005\u001ai\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0002\u0010\u000f\u001aq\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\r2\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0017H\u0007¢\u0006\u0002\u0010\u0018\u001aq\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\r2\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0017H\u0007¢\u0006\u0002\u0010\u0018\u001a+\u0010\u001a\u001a\u00020\u00012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u001c\u001a\u001b\u0010\u001d\u001a\u00020\u00012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0002\u0010\u001e\u001a\u001d\u0010\u001f\u001a\u00020\u00012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0002\u0010!\u001aA\u0010\"\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00062\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0002\u0010)\u001a3\u0010*\u001a\u00020\u00012\u0006\u0010+\u001a\u00020%2\u0006\u0010,\u001a\u00020%2\u0006\u0010-\u001a\u00020%2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0002\u0010/\u001a\u001b\u00100\u001a\u00020\u00012\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0002\u0010\u001e\u001a#\u00102\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00042\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0002\u00103\u001a/\u00104\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\rH\u0007¢\u0006\u0002\u00106¨\u00067²\u0006\n\u00108\u001a\u00020\u0006X\u008a\u0084\u0002²\u0006\n\u00109\u001a\u00020\u0006X\u008a\u0084\u0002²\u0006\u0010\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u008a\u0084\u0002²\u0006\f\u0010;\u001a\u0004\u0018\u00010\u0006X\u008a\u0084\u0002²\u0006\f\u0010<\u001a\u0004\u0018\u00010=X\u008a\u0084\u0002²\u0006\f\u0010>\u001a\u0004\u0018\u00010\u0006X\u008a\u0084\u0002²\u0006\f\u0010?\u001a\u0004\u0018\u00010@X\u008a\u008e\u0002²\u0006\n\u0010A\u001a\u00020\u0006X\u008a\u008e\u0002²\u0006\n\u0010B\u001a\u00020\u0013X\u008a\u0084\u0002²\u0006\n\u0010C\u001a\u00020\u0013X\u008a\u0084\u0002²\u0006\u0010\u0010D\u001a\b\u0012\u0004\u0012\u00020E0\u0003X\u008a\u0084\u0002²\u0006\n\u0010F\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u0010G\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u0010H\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u0010I\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\f\u0010J\u001a\u0004\u0018\u00010\u0004X\u008a\u008e\u0002²\u0006\f\u0010K\u001a\u0004\u0018\u00010\u0004X\u008a\u008e\u0002²\u0006\f\u0010L\u001a\u0004\u0018\u00010\u0006X\u008a\u008e\u0002²\u0006\f\u0010M\u001a\u0004\u0018\u00010\u0004X\u008a\u008e\u0002²\u0006\n\u0010N\u001a\u00020\u0006X\u008a\u008e\u0002²\u0006\n\u0010O\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u0010P\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u0010Q\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u0010R\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u0010S\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u0010T\u001a\u00020\u0006X\u008a\u008e\u0002²\u0006\n\u0010U\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u0010V\u001a\u00020\u0006X\u008a\u008e\u0002²\u0006\n\u0010W\u001a\u00020%X\u008a\u008e\u0002²\u0006\f\u0010X\u001a\u0004\u0018\u00010\u0006X\u008a\u008e\u0002²\u0006\n\u0010Y\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u0010Z\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u0010+\u001a\u00020%X\u008a\u008e\u0002²\u0006\n\u0010,\u001a\u00020%X\u008a\u008e\u0002²\u0006\n\u0010[\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u0010\\\u001a\u00020]X\u008a\u0084\u0002²\u0006\n\u0010[\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u0010^\u001a\u00020]X\u008a\u0084\u0002²\u0006\n\u0010_\u001a\u00020\u0006X\u008a\u008e\u0002²\u0006\n\u0010`\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u0010a\u001a\u00020\u0006X\u008a\u008e\u0002²\u0006\n\u0010b\u001a\u00020]X\u008a\u0084\u0002"}, d2 = {"DashboardScreen", "", "books", "", "Lcom/example/data/Book;", "currentUser", "", "viewModel", "Lcom/example/ui/BookViewModel;", "onAddBookClick", "Lkotlin/Function0;", "onLogoutClick", "onChatClick", "Lkotlin/Function1;", "onProfileClick", "(Ljava/util/List;Ljava/lang/String;Lcom/example/ui/BookViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "BookCard", "book", "isOwner", "", "distanceStr", "onOwnerClick", "onActionClick", "Lkotlin/Function2;", "(Lcom/example/data/Book;ZLjava/lang/String;Lcom/example/ui/BookViewModel;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "BookCardGrid", "FeedbackDialog", "onDismiss", "(Lkotlin/jvm/functions/Function0;Lcom/example/ui/BookViewModel;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "DeveloperDialog", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "DeveloperCard", "onClose", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "EcoImpactLiveRibbon", "ecoTreesSaved", "ecoWaterSaved", "", "ecoCo2Saved", "onLeaderboardClick", "onShareEcoClick", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ReadingStreakBanner", "streakDays", "minutesReadToday", "dailyGoalMinutes", "onLogReadingClick", "(IIILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "AIMatchmakerBanner", "onClick", "ReadingCompanionBanner", "(Lcom/example/data/Book;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "CuratedForYouSection", "onBookClick", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "app", "searchQuery", "filterStatus", "filteredBooks", "insertError", "userState", "Lcom/example/data/User;", "currentProfilePic", "userLocation", "Landroid/location/Location;", "viewMode", "isListScrolledDown", "isGridScrolledDown", "userWishlist", "Lcom/example/data/WishlistRequest;", "showFeedbackDialog", "showMatchmakerDialog", "showEcoLeaderboardDialog", "showDeveloperDialog", "readingCompanionBook", "activeBookForDetails", "scanMode", "currentBookForScan", "scannedCondition", "showReturnDialog", "showTransferScanDialog", "showAcceptTransferDialog", "showBorrowerScanDialog", "showQrDisplayDialog", "qrDisplayType", "showQrScannerDialog", "qrScannerType", "returnRating", "aiVerificationAssessment", "isVerifyingAI", "showGlobalQrScanner", "showDetailsDialog", "bookmarkScale", "", "bookmarkGridScale", "type", "expanded", "content", "borderAlpha"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class DashboardScreenKt {
    static final Unit AIMatchmakerBanner$lambda$502(Function0 function0, int i, Composer composer, int i2) {
        AIMatchmakerBanner(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit BookCard$lambda$373(Book book, boolean z, String str, BookViewModel bookViewModel, String str2, Function0 function0, Function1 function1, Function2 function2, int i, Composer composer, int i2) {
        BookCard(book, z, str, bookViewModel, str2, function0, function1, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit BookCardGrid$lambda$442(Book book, boolean z, String str, BookViewModel bookViewModel, String str2, Function0 function0, Function1 function1, Function2 function2, int i, Composer composer, int i2) {
        BookCardGrid(book, z, str, bookViewModel, str2, function0, function1, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit CuratedForYouSection$lambda$513(List list, Function1 function1, int i, Composer composer, int i2) {
        CuratedForYouSection(list, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$281(List list, String str, BookViewModel bookViewModel, Function0 function0, Function0 function1, Function1 function2, Function0 function3, int i, Composer composer, int i2) {
        DashboardScreen(list, str, bookViewModel, function0, function1, function2, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit DeveloperCard$lambda$487(Function0 function0, int i, int i2, Composer composer, int i3) {
        DeveloperCard(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    static final Unit DeveloperDialog$lambda$478(Function0 function0, int i, Composer composer, int i2) {
        DeveloperDialog(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit EcoImpactLiveRibbon$lambda$494(String str, int i, String str2, Function0 function0, Function0 function1, int i2, Composer composer, int i3) {
        EcoImpactLiveRibbon(str, i, str2, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    static final Unit FeedbackDialog$lambda$476(Function0 function0, BookViewModel bookViewModel, String str, int i, Composer composer, int i2) {
        FeedbackDialog(function0, bookViewModel, str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit ReadingCompanionBanner$lambda$506(Book book, Function0 function0, int i, Composer composer, int i2) {
        ReadingCompanionBanner(book, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit ReadingStreakBanner$lambda$501(int i, int i2, int i3, Function0 function0, int i4, Composer composer, int i5) {
        ReadingStreakBanner(i, i2, i3, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1));
        return Unit.INSTANCE;
    }

    public static boolean isBookOwner(Book book, String str) {
        if (book == null || str == null) {
            return false;
        }
        if (isUserMatch(book.getOwnerName(), str)) {
            return true;
        }
        return isUserMatch(book.getOwnerDisplayName(), str);
    }

    public static boolean isUserMatch(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String strTrim = str.trim();
        String strTrim2 = str2.trim();
        if (strTrim.equalsIgnoreCase(strTrim2)) {
            return true;
        }
        String lowerCase = strTrim.toLowerCase(Locale.ROOT);
        String lowerCase2 = strTrim2.toLowerCase(Locale.ROOT);
        if (lowerCase.contains("sumukesh") && lowerCase2.contains("sumukesh")) {
            return true;
        }
        return lowerCase.contains("shiva") && lowerCase2.contains("shiva");
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v87 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public static final void DashboardScreen(java.util.List<com.example.data.Book> r70, java.lang.String r71, com.example.ui.BookViewModel r72, kotlin.jvm.functions.Function0<kotlin.Unit> r73, kotlin.jvm.functions.Function0<kotlin.Unit> r74, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r75, kotlin.jvm.functions.Function0<kotlin.Unit> r76, androidx.compose.runtime.Composer r77, int r78) {
        /*
            Method dump skipped, instruction units count: 4104
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.DashboardScreenKt.DashboardScreen(java.util.List, java.lang.String, com.example.ui.BookViewModel, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Location DashboardScreen$lambda$8(MutableState<Location> mutableState) {
        return (Location) ((State) mutableState).getValue();
    }

    private static final String DashboardScreen$lambda$14(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    static final boolean DashboardScreen$lambda$17$lambda$16(LazyListState lazyListState) {
        return lazyListState.getFirstVisibleItemIndex() > 0 || lazyListState.getFirstVisibleItemScrollOffset() > 25;
    }

    static final boolean DashboardScreen$lambda$20$lambda$19(LazyStaggeredGridState lazyStaggeredGridState) {
        return lazyStaggeredGridState.getFirstVisibleItemIndex() > 0 || lazyStaggeredGridState.getFirstVisibleItemScrollOffset() > 25;
    }

    private static final boolean DashboardScreen$lambda$32(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void DashboardScreen$lambda$33(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean DashboardScreen$lambda$35(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void DashboardScreen$lambda$36(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean DashboardScreen$lambda$38(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void DashboardScreen$lambda$39(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean DashboardScreen$lambda$41(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void DashboardScreen$lambda$42(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final Book DashboardScreen$lambda$44(MutableState<Book> mutableState) {
        return (Book) ((State) mutableState).getValue();
    }

    private static final Book DashboardScreen$lambda$47(MutableState<Book> mutableState) {
        return (Book) ((State) mutableState).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String DashboardScreen$lambda$50(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Book DashboardScreen$lambda$53(MutableState<Book> mutableState) {
        return (Book) ((State) mutableState).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String DashboardScreen$lambda$56(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DashboardScreen$lambda$59(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DashboardScreen$lambda$60(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean DashboardScreen$lambda$62(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DashboardScreen$lambda$63(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean DashboardScreen$lambda$65(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DashboardScreen$lambda$66(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean DashboardScreen$lambda$68(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DashboardScreen$lambda$69(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean DashboardScreen$lambda$71(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DashboardScreen$lambda$72(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String DashboardScreen$lambda$74(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final boolean DashboardScreen$lambda$77(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DashboardScreen$lambda$78(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String DashboardScreen$lambda$80(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int DashboardScreen$lambda$83(MutableIntState mutableIntState) {
        return ((IntState) mutableIntState).getIntValue();
    }

    private static final String DashboardScreen$lambda$86(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final boolean DashboardScreen$lambda$89(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DashboardScreen$lambda$90(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean DashboardScreen$lambda$92(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void DashboardScreen$lambda$93(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    static final Unit DashboardScreen$lambda$95$lambda$94(CoroutineScope coroutineScope, MutableState mutableState, BookViewModel bookViewModel, SnackbarHostState snackbarHostState, MutableState mutableState2, MutableIntState mutableIntState, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, Bitmap bitmap) {
        if (bitmap != null && DashboardScreen$lambda$53(mutableState) != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
            String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            Book bookDashboardScreen$lambda$53 = DashboardScreen$lambda$53(mutableState);
            Intrinsics.checkNotNull(bookDashboardScreen$lambda$53);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new DashboardScreenKt$DashboardScreen$takePictureLauncher$1$1$1(bookDashboardScreen$lambda$53, bookViewModel, strEncodeToString, snackbarHostState, mutableState2, mutableIntState, null), 3, (Object) null);
        }
        mutableState2.setValue(null);
        mutableState.setValue(null);
        DashboardScreen$lambda$60(mutableState3, false);
        DashboardScreen$lambda$63(mutableState4, false);
        DashboardScreen$lambda$66(mutableState5, false);
        DashboardScreen$lambda$69(mutableState6, false);
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$99$lambda$98(MutableState mutableState) {
        DashboardScreen$lambda$60(mutableState, false);
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$120(String str, final MutableState mutableState, MutableState mutableState2, final MutableState mutableState3, final MutableState mutableState4, final MutableIntState mutableIntState, Composer composer, int i) {
        boolean z;
        long jColor;
        String str2;
        String strSubstringBefore$default;
        Composer composer2 = composer;
        ComposerKt.sourceInformation(composer2, "C244@11812L21,244@11770L7551:DashboardScreen.kt#2thlc2");
        char c = 2;
        if ((i & 3) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1442041841, i, -1, "com.example.ui.screens.DashboardScreen.<anonymous> (DashboardScreen.kt:244)");
            }
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Modifier.Companion, ScrollKt.rememberScrollState(0, composer2, 0, 1), false, (FlingBehavior) null, false, 14, (Object) null);
            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, 0);
            String str3 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierVerticalScroll$default);
            Function0 constructor = ComposeUiNode.Companion.getConstructor();
            String str4 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
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
            ComposerKt.sourceInformationMarkerStart(composer2, -94899149, "C309@15989L10,309@15934L112,310@16067L40,312@16264L366,312@16204L426,321@16651L40,324@16856L89,327@17087L1181,323@16804L1464,345@18290L41,346@18409L10,346@18352L114,347@18487L816:DashboardScreen.kt#2thlc2");
            String str5 = str;
            int i2 = -106894073;
            float f = 0.0f;
            Object obj = null;
            if (str5 == null || StringsKt.isBlank(str5)) {
                composer2.startReplaceGroup(i2);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-95027645);
                ComposerKt.sourceInformation(composer2, "250@12263L10,246@11918L450,253@12393L40,259@12730L11,254@12458L1558,280@14041L41");
                Book bookDashboardScreen$lambda$53 = DashboardScreen$lambda$53(mutableState);
                Intrinsics.checkNotNull(bookDashboardScreen$lambda$53);
                String returnImageUrl = bookDashboardScreen$lambda$53.getReturnImageUrl();
                if (returnImageUrl == null || StringsKt.isBlank(returnImageUrl)) {
                    str2 = "Book Reference Photo:";
                } else {
                    Book bookDashboardScreen$lambda$54 = DashboardScreen$lambda$53(mutableState);
                    Intrinsics.checkNotNull(bookDashboardScreen$lambda$54);
                    String borrowerName = bookDashboardScreen$lambda$54.getBorrowerName();
                    if (borrowerName == null || (strSubstringBefore$default = StringsKt.substringBefore$default(borrowerName, "@", (String) null, 2, (Object) null)) == null) {
                        strSubstringBefore$default = "Borrower";
                    }
                    str2 = "Photo Scanned by Borrower (" + strSubstringBefore$default + "):";
                }
                c = 2;
                TextKt.Text--4IGK_g(str2, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getLabelLarge(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
                f = 0.0f;
                obj = null;
                Modifier modifier = BackgroundKt.background-bw27NRU$default(ClipKt.clip(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(200.0f)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(14.0f))), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), (Shape) null, 2, (Object) null);
                ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
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
                ComposerKt.sourceInformationMarkerStart(composer, 589908017, "C261@12814L247,267@13153L11,270@13406L584,266@13090L900:DashboardScreen.kt#2thlc2");
                str4 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                BookImageDisplayKt.BookImageDisplay(str, "Borrower Return Image", SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null), null, null, composer, 432, 24);
                composer2 = composer;
                str3 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                SurfaceKt.Surface-T9BRK9s(boxScope.align(Modifier.Companion, Alignment.Companion.getTopStart()), RoundedCornerShapeKt.RoundedCornerShape-a9UjIt4$default(Dp.constructor-impl(0.0f), 0.0f, Dp.constructor-impl(10.0f), 0.0f, 10, (Object) null), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(1942440127, true, new Function2() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda26
                    public final Object invoke(Object obj2, Object obj3) {
                        return DashboardScreenKt.DashboardScreen$lambda$120$lambda$119$lambda$107$lambda$106(mutableState, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, composer, 54), composer2, 12582912, 120);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f)), composer2, 6);
                composer2.endReplaceGroup();
                i2 = -106894073;
            }
            if (DashboardScreen$lambda$89(mutableState2)) {
                composer2.startReplaceGroup(-92836193);
                ComposerKt.sourceInformation(composer2, "285@14230L11,284@14171L760");
                z = true;
                SurfaceKt.Surface-T9BRK9s(PaddingKt.padding-qDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, f, 1, obj), 0.0f, 0.0f, 0.0f, Dp.constructor-impl(10.0f), 7, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(10.0f)), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableSingletons$DashboardScreenKt.INSTANCE.getLambda$1457579438$app(), composer2, 12582918, 120);
                composer2.endReplaceGroup();
            } else {
                z = true;
                String strDashboardScreen$lambda$86 = DashboardScreen$lambda$86(mutableState3);
                if (strDashboardScreen$lambda$86 == null || StringsKt.isBlank(strDashboardScreen$lambda$86)) {
                    composer2.startReplaceGroup(i2);
                } else {
                    composer2.startReplaceGroup(-91979043);
                    ComposerKt.sourceInformation(composer2, "297@15091L11,300@15318L572,296@15032L858");
                    SurfaceKt.Surface-T9BRK9s(PaddingKt.padding-qDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, f, 1, obj), 0.0f, 0.0f, 0.0f, Dp.constructor-impl(10.0f), 7, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(10.0f)), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getSecondaryContainer-0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-1763671835, true, new Function2() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda27
                        public final Object invoke(Object obj2, Object obj3) {
                            return DashboardScreenKt.DashboardScreen$lambda$120$lambda$119$lambda$109(mutableState3, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    }, composer2, 54), composer2, 12582918, 120);
                }
                composer2.endReplaceGroup();
            }
            TextKt.Text--4IGK_g("Verify Return Condition:", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getLabelMedium(), composer, 196614, 0, 65502);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            String[] strArr = new String[4];
            strArr[0] = "Mint";
            strArr[1] = "Good";
            strArr[c] = "Fair";
            strArr[3] = "Poor";
            final List listListOf = CollectionsKt.listOf(strArr);
            Arrangement.Horizontal horizontal = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(8.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -1111306007, "CC(remember):DashboardScreen.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda28
                    public final Object invoke(Object obj2) {
                        return DashboardScreenKt.DashboardScreen$lambda$120$lambda$119$lambda$113$lambda$112(listListOf, mutableState4, (LazyListScope) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            LazyDslKt.LazyRow((Modifier) null, (LazyListState) null, (PaddingValues) null, false, horizontal, (Alignment.Vertical) null, (FlingBehavior) null, false, (Function1) objRememberedValue, composer, 100687872, 239);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            String strDashboardScreen$lambda$56 = DashboardScreen$lambda$56(mutableState4);
            Book bookDashboardScreen$lambda$55 = DashboardScreen$lambda$53(mutableState);
            Intrinsics.checkNotNull(bookDashboardScreen$lambda$55);
            final boolean zAreEqual = Intrinsics.areEqual(strDashboardScreen$lambda$56, bookDashboardScreen$lambda$55.getCondition());
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(10.0f)), CardDefaults.INSTANCE.cardColors-ro_MJ88(ColorKt.Color(zAreEqual ? 4293457385L : 4294962158L), 0L, 0L, 0L, composer, CardDefaults.$stable << 12, 14), (CardElevation) null, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-316487927, true, new Function3() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda29
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return DashboardScreenKt.DashboardScreen$lambda$120$lambda$119$lambda$115(zAreEqual, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, composer, 54), composer, 196614, 24);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(12.0f)), composer, 6);
            String str6 = "CC(remember):DashboardScreen.kt#9igjgp";
            TextKt.Text--4IGK_g("Rate Borrower Reliability:", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelMedium(), composer, 196614, 0, 65502);
            Composer composer5 = composer;
            Arrangement.Horizontal horizontal2 = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(4.0f));
            final int i3 = 1;
            Modifier modifier2 = PaddingKt.padding-VpY3zN4$default(Modifier.Companion, 0.0f, Dp.constructor-impl(4.0f), 1, (Object) null);
            ComposerKt.sourceInformationMarkerStart(composer5, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontal2, Alignment.Companion.getTop(), composer5, 6);
            ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, str3);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer5, modifier2);
            Function0 constructor3 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer5, -692256719, str4);
            if (!(composer5.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer5.startReusableNode();
            if (composer5.getInserting()) {
                composer5.createNode(constructor3);
            } else {
                composer5.useNode();
            }
            Composer composer6 = Updater.constructor-impl(composer5);
            Updater.set-impl(composer6, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer6, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer6.getInserting() || !Intrinsics.areEqual(composer6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composer6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composer6.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.set-impl(composer6, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer5, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer5, 779974072, "C:DashboardScreen.kt#2thlc2");
            composer5.startReplaceGroup(1272086443);
            ComposerKt.sourceInformation(composer5, "*358@19205L20,352@18731L524");
            while (i3 < 6) {
                ImageVector star = i3 <= DashboardScreen$lambda$83(mutableIntState) ? StarKt.getStar(Icons.INSTANCE.getDefault()) : StarOutlineKt.getStarOutline(Icons.Outlined.INSTANCE);
                String str7 = "Rate " + i3 + " stars";
                if (i3 <= DashboardScreen$lambda$83(mutableIntState)) {
                    composer5.startReplaceGroup(1272095624);
                    composer5.endReplaceGroup();
                    jColor = ColorKt.Color(4294947584L);
                } else {
                    composer5.startReplaceGroup(1272097191);
                    ComposerKt.sourceInformation(composer5, "355@19027L11");
                    jColor = MaterialTheme.INSTANCE.getColorScheme(composer5, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU();
                    composer5.endReplaceGroup();
                }
                long j = jColor;
                Modifier modifier3 = SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(32.0f));
                String str8 = str6;
                ComposerKt.sourceInformationMarkerStart(composer5, 1272102507, str8);
                boolean zChanged = composer5.changed(i3);
                Object objRememberedValue2 = composer5.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda30
                        public final Object invoke() {
                            return DashboardScreenKt.DashboardScreen$lambda$120$lambda$119$lambda$118$lambda$117$lambda$116(i3, mutableIntState);
                        }
                    };
                    composer5.updateRememberedValue(objRememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(composer5);
                IconKt.Icon-ww6aTOc(star, str7, ClickableKt.clickable-XHw0xAI$default(modifier3, false, (String) null, (Role) null, (Function0) objRememberedValue2, 7, (Object) null), j, composer5, 0, 0);
                i3++;
                composer5 = composer;
                str6 = str8;
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
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$120$lambda$119$lambda$107$lambda$106(MutableState mutableState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C273@13644L10,276@13896L11,271@13440L520:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1942440127, i, -1, "com.example.ui.screens.DashboardScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:271)");
            }
            Book bookDashboardScreen$lambda$53 = DashboardScreen$lambda$53(mutableState);
            Intrinsics.checkNotNull(bookDashboardScreen$lambda$53);
            String returnImageUrl = bookDashboardScreen$lambda$53.getReturnImageUrl();
            String str = (returnImageUrl == null || StringsKt.isBlank(returnImageUrl)) ? "Cover Photo" : "Live Return Scan";
            String str2 = str;
            TextKt.Text--4IGK_g(str2, PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(8.0f), Dp.constructor-impl(4.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnPrimaryContainer-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 196656, 0, 65496);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$120$lambda$119$lambda$109(MutableState mutableState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C301@15348L516:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1763671835, i, -1, "com.example.ui.screens.DashboardScreen.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:301)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f));
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
            ComposerKt.sourceInformationMarkerStart(composer, -1838212882, "C302@15550L11,302@15470L133,303@15636L39,304@15781L10,304@15708L126:DashboardScreen.kt#2thlc2");
            IconKt.Icon-ww6aTOc(CheckCircleKt.getCheckCircle(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 432, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            TextKt.Text--4IGK_g("AI Verification: " + DashboardScreen$lambda$86(mutableState), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
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

    static final Unit DashboardScreen$lambda$120$lambda$119$lambda$115(boolean z, ColumnScope columnScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(columnScope, "$this$Card");
        ComposerKt.sourceInformation(composer, "C328@17113L1133:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-316487927, i, -1, "com.example.ui.screens.DashboardScreen.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:328)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f));
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
            ComposerKt.sourceInformationMarkerStart(composer, 401566401, "C329@17231L375,335@17635L39,338@18004L10,336@17703L517:DashboardScreen.kt#2thlc2");
            Icons.Filled filled = Icons.INSTANCE.getDefault();
            IconKt.Icon-ww6aTOc(z ? GppGoodKt.getGppGood(filled) : WarningKt.getWarning(filled), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(20.0f)), ColorKt.Color(z ? 4281236786L : 4291176488L), composer, 432, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            TextKt.Text--4IGK_g(z ? "Condition verified! Both Lender and Borrower receive trust score rewards." : "Condition degraded! Borrower loses 10 trust points, Lender receives 10 trust points compensation.", (Modifier) null, ColorKt.Color(z ? 4279983648L : 4290190364L), 0L, (FontStyle) null, FontWeight.Companion.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
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

    static final Unit DashboardScreen$lambda$120$lambda$119$lambda$118$lambda$117$lambda$116(int i, MutableIntState mutableIntState) {
        mutableIntState.setIntValue(i);
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$102(final BookViewModel bookViewModel, final MutableState mutableState, final MutableIntState mutableIntState, final MutableState mutableState2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C365@19400L201,365@19383L448:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(904820310, i, -1, "com.example.ui.screens.DashboardScreen.<anonymous> (DashboardScreen.kt:365)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, 1948925439, "CC(remember):DashboardScreen.kt#9igjgp");
            boolean zChangedInstance = composer.changedInstance(bookViewModel);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda105
                    public final Object invoke() {
                        return DashboardScreenKt.DashboardScreen$lambda$102$lambda$101$lambda$100(bookViewModel, mutableState, mutableIntState, mutableState2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ButtonKt.Button((Function0) objRememberedValue, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.getLambda$1648220262$app(), composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$102$lambda$101$lambda$100(BookViewModel bookViewModel, MutableState mutableState, MutableIntState mutableIntState, MutableState mutableState2) {
        Book bookDashboardScreen$lambda$53 = DashboardScreen$lambda$53(mutableState);
        Intrinsics.checkNotNull(bookDashboardScreen$lambda$53);
        BookViewModel.m159confirmAndCompleteReturn0E7RQCE$default(bookViewModel, bookDashboardScreen$lambda$53, Integer.valueOf(DashboardScreen$lambda$83(mutableIntState)), null, 4, null);
        DashboardScreen$lambda$60(mutableState2, false);
        mutableState.setValue(null);
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$105(final MutableState mutableState, final MutableState mutableState2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C376@19914L112,376@19893L153:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-598277996, i, -1, "com.example.ui.screens.DashboardScreen.<anonymous> (DashboardScreen.kt:376)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, 580464868, "CC(remember):DashboardScreen.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda18
                    public final Object invoke() {
                        return DashboardScreenKt.DashboardScreen$lambda$105$lambda$104$lambda$103(mutableState, mutableState2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ButtonKt.TextButton((Function0) objRememberedValue, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.getLambda$1256558007$app(), composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$105$lambda$104$lambda$103(MutableState mutableState, MutableState mutableState2) {
        DashboardScreen$lambda$60(mutableState, false);
        mutableState2.setValue(null);
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$122$lambda$121(MutableState mutableState) {
        DashboardScreen$lambda$63(mutableState, false);
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$129(MutableState mutableState, Composer composer, int i) {
        String strSubstringBefore$default;
        ComposerKt.sourceInformation(composer, "C396@20648L222:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1012731816, i, -1, "com.example.ui.screens.DashboardScreen.<anonymous> (DashboardScreen.kt:396)");
            }
            Book bookDashboardScreen$lambda$53 = DashboardScreen$lambda$53(mutableState);
            Intrinsics.checkNotNull(bookDashboardScreen$lambda$53);
            String title = bookDashboardScreen$lambda$53.getTitle();
            Book bookDashboardScreen$lambda$54 = DashboardScreen$lambda$53(mutableState);
            Intrinsics.checkNotNull(bookDashboardScreen$lambda$54);
            String requestedByName = bookDashboardScreen$lambda$54.getRequestedByName();
            if (requestedByName == null || (strSubstringBefore$default = StringsKt.substringBefore$default(requestedByName, "@", (String) null, 2, (Object) null)) == null) {
                strSubstringBefore$default = "Borrower";
            }
            TextKt.Text--4IGK_g("Take a photo of '" + title + "' being handed over to " + strSubstringBefore$default + ". The borrower will verify this photo on their phone before accepting.", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$125(final ManagedActivityResultLauncher managedActivityResultLauncher, final MutableState mutableState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C399@20950L114,399@20933L366:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(138916045, i, -1, "com.example.ui.screens.DashboardScreen.<anonymous> (DashboardScreen.kt:399)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, 354334303, "CC(remember):DashboardScreen.kt#9igjgp");
            boolean zChangedInstance = composer.changedInstance(managedActivityResultLauncher);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda84
                    public final Object invoke() {
                        return DashboardScreenKt.DashboardScreen$lambda$125$lambda$124$lambda$123(managedActivityResultLauncher, mutableState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ButtonKt.Button((Function0) objRememberedValue, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.getLambda$1581698781$app(), composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$125$lambda$124$lambda$123(ManagedActivityResultLauncher managedActivityResultLauncher, MutableState mutableState) {
        mutableState.setValue("HANDOVER");
        managedActivityResultLauncher.launch((Object) null);
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$128(final BookViewModel bookViewModel, final MutableState mutableState, final MutableState mutableState2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C409@21382L146,409@21361L191:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1229544565, i, -1, "com.example.ui.screens.DashboardScreen.<anonymous> (DashboardScreen.kt:409)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, -476319171, "CC(remember):DashboardScreen.kt#9igjgp");
            boolean zChangedInstance = composer.changedInstance(bookViewModel);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda36
                    public final Object invoke() {
                        return DashboardScreenKt.DashboardScreen$lambda$128$lambda$127$lambda$126(bookViewModel, mutableState, mutableState2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ButtonKt.TextButton((Function0) objRememberedValue, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.m278getLambda$1143573522$app(), composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$128$lambda$127$lambda$126(BookViewModel bookViewModel, MutableState mutableState, MutableState mutableState2) {
        Book bookDashboardScreen$lambda$53 = DashboardScreen$lambda$53(mutableState);
        Intrinsics.checkNotNull(bookDashboardScreen$lambda$53);
        BookViewModel.transferBookInitiated$default(bookViewModel, bookDashboardScreen$lambda$53, null, null, null, 14, null);
        DashboardScreen$lambda$63(mutableState2, false);
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$131$lambda$130(MutableState mutableState) {
        DashboardScreen$lambda$69(mutableState, false);
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$138(MutableState mutableState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C429@22170L166:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-921474583, i, -1, "com.example.ui.screens.DashboardScreen.<anonymous> (DashboardScreen.kt:429)");
            }
            Book bookDashboardScreen$lambda$53 = DashboardScreen$lambda$53(mutableState);
            Intrinsics.checkNotNull(bookDashboardScreen$lambda$53);
            TextKt.Text--4IGK_g("Take a photo of '" + bookDashboardScreen$lambda$53.getTitle() + "' to document its current condition. The book owner will review this photo on their phone to confirm the return.", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$134(final ManagedActivityResultLauncher managedActivityResultLauncher, final MutableState mutableState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C433@22436L133,437@22659L11,437@22615L65,432@22398L536:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1795290354, i, -1, "com.example.ui.screens.DashboardScreen.<anonymous> (DashboardScreen.kt:432)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, 1302824723, "CC(remember):DashboardScreen.kt#9igjgp");
            boolean zChangedInstance = composer.changedInstance(managedActivityResultLauncher);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda101
                    public final Object invoke() {
                        return DashboardScreenKt.DashboardScreen$lambda$134$lambda$133$lambda$132(managedActivityResultLauncher, mutableState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ButtonKt.Button((Function0) objRememberedValue, (Modifier) null, false, (Shape) null, ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getTertiary-0d7_KjU(), 0L, 0L, 0L, composer, ButtonDefaults.$stable << 12, 14), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.m301getLambda$352507618$app(), composer, 805306368, 494);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$134$lambda$133$lambda$132(ManagedActivityResultLauncher managedActivityResultLauncher, MutableState mutableState) {
        mutableState.setValue("BORROWER_RETURN");
        managedActivityResultLauncher.launch((Object) null);
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$137(final BookViewModel bookViewModel, final MutableState mutableState, final MutableState mutableState2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C445@23017L137,445@22996L218:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1131216332, i, -1, "com.example.ui.screens.DashboardScreen.<anonymous> (DashboardScreen.kt:445)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, 472170549, "CC(remember):DashboardScreen.kt#9igjgp");
            boolean zChangedInstance = composer.changedInstance(bookViewModel);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda21
                    public final Object invoke() {
                        return DashboardScreenKt.DashboardScreen$lambda$137$lambda$136$lambda$135(bookViewModel, mutableState, mutableState2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ButtonKt.TextButton((Function0) objRememberedValue, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.getLambda$1217187375$app(), composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$137$lambda$136$lambda$135(BookViewModel bookViewModel, MutableState mutableState, MutableState mutableState2) {
        Book bookDashboardScreen$lambda$53 = DashboardScreen$lambda$53(mutableState);
        Intrinsics.checkNotNull(bookDashboardScreen$lambda$53);
        BookViewModel.initiateReturn$default(bookViewModel, bookDashboardScreen$lambda$53, null, null, null, 14, null);
        DashboardScreen$lambda$69(mutableState2, false);
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$140$lambda$139(MutableState mutableState) {
        DashboardScreen$lambda$66(mutableState, false);
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$151(MutableState mutableState, Composer composer, int i) {
        final MutableState mutableState2;
        ComposerKt.sourceInformation(composer, "C467@23910L21,467@23868L2977:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1439286314, i, -1, "com.example.ui.screens.DashboardScreen.<anonymous> (DashboardScreen.kt:467)");
            }
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Modifier.Companion, ScrollKt.rememberScrollState(0, composer, 0, 1), false, (FlingBehavior) null, false, 14, (Object) null);
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
            ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1205708296, "C470@24225L10,468@23956L312,472@24289L41,511@26806L10,511@26690L137:DashboardScreen.kt#2thlc2");
            Book bookDashboardScreen$lambda$53 = DashboardScreen$lambda$53(mutableState);
            Intrinsics.checkNotNull(bookDashboardScreen$lambda$53);
            String ownerDisplayName = bookDashboardScreen$lambda$53.getOwnerDisplayName();
            if (StringsKt.isBlank(ownerDisplayName)) {
                Book bookDashboardScreen$lambda$54 = DashboardScreen$lambda$53(mutableState);
                Intrinsics.checkNotNull(bookDashboardScreen$lambda$54);
                ownerDisplayName = StringsKt.substringBefore$default(bookDashboardScreen$lambda$54.getOwnerName(), "@", (String) null, 2, (Object) null);
            }
            TextKt.Text--4IGK_g("The owner (" + ((Object) ownerDisplayName) + ") photographed this book during handover. Please inspect before accepting:", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 0, 0, 65534);
            Composer composer3 = composer;
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f)), composer3, 6);
            Book bookDashboardScreen$lambda$55 = DashboardScreen$lambda$53(mutableState);
            Intrinsics.checkNotNull(bookDashboardScreen$lambda$55);
            String transferImageUrl = bookDashboardScreen$lambda$55.getTransferImageUrl();
            if (transferImageUrl == null) {
                Book bookDashboardScreen$lambda$56 = DashboardScreen$lambda$53(mutableState);
                Intrinsics.checkNotNull(bookDashboardScreen$lambda$56);
                transferImageUrl = bookDashboardScreen$lambda$56.getImageUrl();
            }
            String str = transferImageUrl;
            String str2 = str;
            if (str2 == null || StringsKt.isBlank(str2)) {
                mutableState2 = mutableState;
                composer3.startReplaceGroup(-1229562642);
            } else {
                composer3.startReplaceGroup(-1205192333);
                ComposerKt.sourceInformation(composer3, "479@24819L10,475@24524L404,482@24953L40,488@25290L11,483@25018L1563,509@26606L41");
                Book bookDashboardScreen$lambda$57 = DashboardScreen$lambda$53(mutableState);
                Intrinsics.checkNotNull(bookDashboardScreen$lambda$57);
                String transferImageUrl2 = bookDashboardScreen$lambda$57.getTransferImageUrl();
                TextKt.Text--4IGK_g((transferImageUrl2 == null || StringsKt.isBlank(transferImageUrl2)) ? "Book Reference Photo (No handover photo taken):" : "Owner's Handover Photo:", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getLabelSmall(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
                Modifier modifier = BackgroundKt.background-bw27NRU$default(ClipKt.clip(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(220.0f)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(14.0f))), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), (Shape) null, 2, (Object) null);
                ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
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
                ComposerKt.sourceInformationMarkerStart(composer, -56929229, "C490@25374L248,496@25714L11,499@25967L588,495@25651L904:DashboardScreen.kt#2thlc2");
                BookImageDisplayKt.BookImageDisplay(str, "Owner Handover Photo", SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null), null, null, composer, 432, 24);
                mutableState2 = mutableState;
                SurfaceKt.Surface-T9BRK9s(boxScope.align(Modifier.Companion, Alignment.Companion.getTopStart()), RoundedCornerShapeKt.RoundedCornerShape-a9UjIt4$default(Dp.constructor-impl(0.0f), 0.0f, Dp.constructor-impl(10.0f), 0.0f, 10, (Object) null), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(1285702008, true, new Function2() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda37
                    public final Object invoke(Object obj, Object obj2) {
                        return DashboardScreenKt.DashboardScreen$lambda$151$lambda$150$lambda$149$lambda$148(mutableState2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer, 54), composer, 12582912, 120);
                composer3 = composer;
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f)), composer3, 6);
            }
            composer3.endReplaceGroup();
            Book bookDashboardScreen$lambda$58 = DashboardScreen$lambda$53(mutableState2);
            Intrinsics.checkNotNull(bookDashboardScreen$lambda$58);
            TextKt.Text--4IGK_g("Listed Condition: " + bookDashboardScreen$lambda$58.getCondition(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodySmall(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
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

    static final Unit DashboardScreen$lambda$151$lambda$150$lambda$149$lambda$148(MutableState mutableState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C502@26209L10,505@26461L11,500@26001L524:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1285702008, i, -1, "com.example.ui.screens.DashboardScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:500)");
            }
            Book bookDashboardScreen$lambda$53 = DashboardScreen$lambda$53(mutableState);
            Intrinsics.checkNotNull(bookDashboardScreen$lambda$53);
            String transferImageUrl = bookDashboardScreen$lambda$53.getTransferImageUrl();
            String str = (transferImageUrl == null || StringsKt.isBlank(transferImageUrl)) ? "Cover Photo" : "Live Transfer Scan";
            String str2 = str;
            TextKt.Text--4IGK_g(str2, PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(8.0f), Dp.constructor-impl(4.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnPrimaryContainer-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 196656, 0, 65496);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$143(final BookViewModel bookViewModel, final MutableState mutableState, final MutableState mutableState2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C515@26924L185,515@26907L276:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(565470543, i, -1, "com.example.ui.screens.DashboardScreen.<anonymous> (DashboardScreen.kt:515)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, -2043653464, "CC(remember):DashboardScreen.kt#9igjgp");
            boolean zChangedInstance = composer.changedInstance(bookViewModel);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda138
                    public final Object invoke() {
                        return DashboardScreenKt.DashboardScreen$lambda$143$lambda$142$lambda$141(bookViewModel, mutableState, mutableState2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ButtonKt.Button((Function0) objRememberedValue, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.getLambda$2008253279$app(), composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$143$lambda$142$lambda$141(BookViewModel bookViewModel, MutableState mutableState, MutableState mutableState2) {
        Book bookDashboardScreen$lambda$53 = DashboardScreen$lambda$53(mutableState);
        Intrinsics.checkNotNull(bookDashboardScreen$lambda$53);
        bookViewModel.acceptTransfer(bookDashboardScreen$lambda$53);
        DashboardScreen$lambda$66(mutableState2, false);
        mutableState.setValue(null);
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$146(final MutableState mutableState, final MutableState mutableState2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C524@27266L120,524@27245L161:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-802990067, i, -1, "com.example.ui.screens.DashboardScreen.<anonymous> (DashboardScreen.kt:524)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, 1420660261, "CC(remember):DashboardScreen.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda4
                    public final Object invoke() {
                        return DashboardScreenKt.DashboardScreen$lambda$146$lambda$145$lambda$144(mutableState, mutableState2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ButtonKt.TextButton((Function0) objRememberedValue, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.m312getLambda$717019024$app(), composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$146$lambda$145$lambda$144(MutableState mutableState, MutableState mutableState2) {
        DashboardScreen$lambda$66(mutableState, false);
        mutableState2.setValue(null);
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$153$lambda$152(MutableState mutableState, MutableState mutableState2) {
        DashboardScreen$lambda$72(mutableState, false);
        mutableState2.setValue(null);
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$155$lambda$154(BookViewModel bookViewModel, Book book, Context context, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, String str) {
        Object objM165verifyHandoverQrgIAlus;
        Intrinsics.checkNotNullParameter(str, "raw");
        if (Intrinsics.areEqual(DashboardScreen$lambda$80(mutableState), "RETURN")) {
            objM165verifyHandoverQrgIAlus = bookViewModel.m166verifyReturnQrgIAlus(book, str);
        } else {
            objM165verifyHandoverQrgIAlus = bookViewModel.m165verifyHandoverQrgIAlus(book, str);
        }
        if (Result.isFailure-impl(objM165verifyHandoverQrgIAlus)) {
            Object objM165verifyHandoverQrgIAlus2 = Intrinsics.areEqual(DashboardScreen$lambda$80(mutableState), "RETURN") ? bookViewModel.m165verifyHandoverQrgIAlus(book, str) : bookViewModel.m166verifyReturnQrgIAlus(book, str);
            if (Result.isSuccess-impl(objM165verifyHandoverQrgIAlus2)) {
                objM165verifyHandoverQrgIAlus = objM165verifyHandoverQrgIAlus2;
            }
        }
        DashboardScreen$lambda$78(mutableState2, false);
        mutableState3.setValue(null);
        String str2 = (String) (Result.isFailure-impl(objM165verifyHandoverQrgIAlus) ? null : objM165verifyHandoverQrgIAlus);
        if (str2 == null) {
            Throwable th = Result.exceptionOrNull-impl(objM165verifyHandoverQrgIAlus);
            String message = th != null ? th.getMessage() : null;
            str2 = message == null ? "QR verified successfully" : message;
        }
        Toast.makeText(context, str2, 1).show();
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$157$lambda$156(MutableState mutableState, MutableState mutableState2) {
        DashboardScreen$lambda$78(mutableState, false);
        mutableState2.setValue(null);
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$159$lambda$158(MutableState mutableState) {
        DashboardScreen$lambda$33(mutableState, false);
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$161$lambda$160(MutableState mutableState) {
        DashboardScreen$lambda$36(mutableState, false);
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$163$lambda$162(BookViewModel bookViewModel, Function1 function1, Book book) {
        Intrinsics.checkNotNullParameter(book, "b");
        bookViewModel.requestBook(book);
        bookViewModel.sendMessage(book.getId(), book.getOwnerName(), "Hi! I matched with '" + book.getTitle() + "' via AI Matchmaker and would love to borrow it.");
        function1.invoke(book.getId());
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$165$lambda$164(MutableState mutableState) {
        DashboardScreen$lambda$39(mutableState, false);
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$167$lambda$166(MutableState mutableState) {
        DashboardScreen$lambda$42(mutableState, false);
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$169$lambda$168(MutableState mutableState) {
        mutableState.setValue(null);
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$184(SnackbarHostState snackbarHostState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C611@30265L31:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-585143287, i, -1, "com.example.ui.screens.DashboardScreen.<anonymous> (DashboardScreen.kt:611)");
            }
            SnackbarHostKt.SnackbarHost(snackbarHostState, (Modifier) null, (Function3) null, composer, 6, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$183(final String str, final State state, final Function0 function0, final MutableState mutableState, final MutableState mutableState2, final MutableState mutableState3, final State state2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C632@31379L11,631@31298L119,614@30379L874,634@31445L2693,613@30331L3821:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-929971449, i, -1, "com.example.ui.screens.DashboardScreen.<anonymous> (DashboardScreen.kt:613)");
            }
            AppBarKt.CenterAlignedTopAppBar-GHTll3U(ComposableLambdaKt.rememberComposableLambda(-281723156, true, new Function2() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda106
                public final Object invoke(Object obj, Object obj2) {
                    return DashboardScreenKt.DashboardScreen$lambda$183$lambda$173(str, state, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), (Modifier) null, (Function2) null, ComposableLambdaKt.rememberComposableLambda(1183936279, true, new Function3() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda107
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return DashboardScreenKt.DashboardScreen$lambda$183$lambda$182(function0, mutableState, mutableState2, mutableState3, state2, state, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer, 54), 0.0f, (WindowInsets) null, TopAppBarDefaults.INSTANCE.centerAlignedTopAppBarColors-zjMxDiM(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0L, 0L, 0L, composer, TopAppBarDefaults.$stable << 15, 30), (TopAppBarScrollBehavior) null, composer, 3078, 182);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0156  */
    /* JADX WARN: Code duplicated, block: B:34:0x0168  */
    static final Unit DashboardScreen$lambda$183$lambda$173(String str, State state, Composer composer, int i) {
        String strSubstringBefore$default;
        ComposerKt.sourceInformation(composer, "C615@30401L834:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-281723156, i, -1, "com.example.ui.screens.DashboardScreen.<anonymous>.<anonymous> (DashboardScreen.kt:615)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier = Modifier.Companion;
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
            ComposerKt.sourceInformationMarkerStart(composer, -94220886, "C618@30585L10,620@30721L11,616@30486L280,626@31096L10,627@31168L11,624@30985L228:DashboardScreen.kt#2thlc2");
            TextKt.Text--4IGK_g("BookXchange", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleLarge(), composer, 196614, 0, 65498);
            User userDashboardScreen$lambda$5 = DashboardScreen$lambda$5(state);
            if (userDashboardScreen$lambda$5 == null || (strSubstringBefore$default = userDashboardScreen$lambda$5.getDisplayName()) == null) {
                strSubstringBefore$default = StringsKt.substringBefore$default(str, "@", (String) null, 2, (Object) null);
                if (strSubstringBefore$default.length() > 0) {
                    StringBuilder sb = new StringBuilder();
                    String strValueOf = String.valueOf(strSubstringBefore$default.charAt(0));
                    Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
                    String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    StringBuilder sbAppend = sb.append((Object) upperCase);
                    String strSubstring = strSubstringBefore$default.substring(1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    strSubstringBefore$default = sbAppend.append(strSubstring).toString();
                }
            } else {
                if (StringsKt.isBlank(strSubstringBefore$default)) {
                    strSubstringBefore$default = null;
                }
                if (strSubstringBefore$default == null) {
                    strSubstringBefore$default = StringsKt.substringBefore$default(str, "@", (String) null, 2, (Object) null);
                    if (strSubstringBefore$default.length() > 0) {
                        StringBuilder sb2 = new StringBuilder();
                        String strValueOf2 = String.valueOf(strSubstringBefore$default.charAt(0));
                        Intrinsics.checkNotNull(strValueOf2, "null cannot be cast to non-null type java.lang.String");
                        String upperCase2 = strValueOf2.toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                        StringBuilder sbAppend2 = sb2.append((Object) upperCase2);
                        String strSubstring2 = strSubstringBefore$default.substring(1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                        strSubstringBefore$default = sbAppend2.append(strSubstring2).toString();
                    }
                }
            }
            TextKt.Text--4IGK_g("Hello, " + strSubstringBefore$default + " 👋", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOutline-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 0, 0, 65530);
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

    static final Unit DashboardScreen$lambda$183$lambda$182(Function0 function0, final MutableState mutableState, final MutableState mutableState2, final MutableState mutableState3, final State state, final State state2, RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$CenterAlignedTopAppBar");
        ComposerKt.sourceInformation(composer, "C635@31488L30,635@31467L207,638@31716L35,638@31695L191,641@31928L29,641@31907L161,644@32126L1994,644@32089L2031:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1183936279, i, -1, "com.example.ui.screens.DashboardScreen.<anonymous>.<anonymous> (DashboardScreen.kt:635)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, -403567915, "CC(remember):DashboardScreen.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda112
                    public final Object invoke() {
                        return DashboardScreenKt.DashboardScreen$lambda$183$lambda$182$lambda$175$lambda$174(mutableState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            IconButtonKt.IconButton((Function0) objRememberedValue, (Modifier) null, false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.getLambda$924224026$app(), composer, 196614, 30);
            ComposerKt.sourceInformationMarkerStart(composer, -403560614, "CC(remember):DashboardScreen.kt#9igjgp");
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda113
                    public final Object invoke() {
                        return DashboardScreenKt.DashboardScreen$lambda$183$lambda$182$lambda$177$lambda$176(mutableState2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            IconButtonKt.IconButton((Function0) objRememberedValue2, (Modifier) null, false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.getLambda$502488515$app(), composer, 196614, 30);
            ComposerKt.sourceInformationMarkerStart(composer, -403553836, "CC(remember):DashboardScreen.kt#9igjgp");
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda114
                    public final Object invoke() {
                        return DashboardScreenKt.DashboardScreen$lambda$183$lambda$182$lambda$179$lambda$178(mutableState3);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            IconButtonKt.IconButton((Function0) objRememberedValue3, (Modifier) null, false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.getLambda$1275530466$app(), composer, 196614, 30);
            IconButtonKt.IconButton(function0, (Modifier) null, false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableLambdaKt.rememberComposableLambda(2048572417, true, new Function2() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda116
                public final Object invoke(Object obj, Object obj2) {
                    return DashboardScreenKt.DashboardScreen$lambda$183$lambda$182$lambda$181(state, state2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$183$lambda$182$lambda$175$lambda$174(MutableState mutableState) {
        DashboardScreen$lambda$42(mutableState, true);
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$183$lambda$182$lambda$177$lambda$176(MutableState mutableState) {
        DashboardScreen$lambda$39(mutableState, true);
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$183$lambda$182$lambda$179$lambda$178(MutableState mutableState) {
        DashboardScreen$lambda$33(mutableState, true);
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$183$lambda$182$lambda$181(State state, State state2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2048572417, i, -1, "com.example.ui.screens.DashboardScreen.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:645)");
            }
            String strDashboardScreen$lambda$6 = DashboardScreen$lambda$6(state);
            if (strDashboardScreen$lambda$6 == null || StringsKt.isBlank(strDashboardScreen$lambda$6)) {
                User userDashboardScreen$lambda$5 = DashboardScreen$lambda$5(state2);
                strDashboardScreen$lambda$6 = userDashboardScreen$lambda$5 != null ? userDashboardScreen$lambda$5.getProfilePicBase64() : null;
            }
            if (strDashboardScreen$lambda$6 != null && StringsKt.startsWith$default(strDashboardScreen$lambda$6, "http", false, 2, (Object) null)) {
                composer.startReplaceGroup(1830834290);
                ComposerKt.sourceInformation(composer, "648@32414L343");
                SingletonAsyncImageKt.m108AsyncImagegl8XCv8(strDashboardScreen$lambda$6, "Profile Picture", ClipKt.clip(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(36.0f)), RoundedCornerShapeKt.getCircleShape()), null, null, null, ContentScale.Companion.getCrop(), 0.0f, null, 0, false, null, composer, 1572912, 0, 4024);
                composer.endReplaceGroup();
            } else if (strDashboardScreen$lambda$6 == null || !StringsKt.startsWith$default(strDashboardScreen$lambda$6, "data:image/jpeg;base64,", false, 2, (Object) null)) {
                composer.startReplaceGroup(1832035943);
                ComposerKt.sourceInformation(composer, "666@33768L11,665@33622L450");
                Modifier modifier = BackgroundKt.background-bw27NRU$default(ClipKt.clip(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(36.0f)), RoundedCornerShapeKt.getCircleShape()), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), (Shape) null, 2, (Object) null);
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
                ComposerKt.sourceInformationMarkerStart(composer, 2130308925, "C669@34011L11,669@33931L111:DashboardScreen.kt#2thlc2");
                IconKt.Icon-ww6aTOc(PersonKt.getPerson(Icons.INSTANCE.getDefault()), "Profile", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnPrimaryContainer-0d7_KjU(), composer, 48, 4);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1831313736);
                ComposerKt.sourceInformation(composer, "658@33205L355");
                byte[] bArrDecode = Base64.decode(StringsKt.removePrefix(strDashboardScreen$lambda$6, "data:image/jpeg;base64,"), 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                Intrinsics.checkNotNull(bitmapDecodeByteArray);
                ImageKt.Image-5h-nEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmapDecodeByteArray), "Profile Picture", ClipKt.clip(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(36.0f)), RoundedCornerShapeKt.getCircleShape()), (Alignment) null, ContentScale.Companion.getCrop(), 0.0f, (ColorFilter) null, 0, composer, 24624, 232);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$187(final MutableState mutableState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C678@34257L30,679@34336L11,677@34209L307:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-412729206, i, -1, "com.example.ui.screens.DashboardScreen.<anonymous> (DashboardScreen.kt:677)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, -1495773720, "CC(remember):DashboardScreen.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda76
                    public final Object invoke() {
                        return DashboardScreenKt.DashboardScreen$lambda$187$lambda$186$lambda$185(mutableState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            FloatingActionButtonKt.FloatingActionButton-X-z6DiA((Function0) objRememberedValue, (Modifier) null, (Shape) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), Color.Companion.getWhite-0d7_KjU(), (FloatingActionButtonElevation) null, (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.m309getLambda$557896308$app(), composer, 12607494, 102);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$187$lambda$186$lambda$185(MutableState mutableState) {
        DashboardScreen$lambda$93(mutableState, true);
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$276(final CoroutineScope coroutineScope, final BookViewModel bookViewModel, final MutableState mutableState, final SnackbarHostState snackbarHostState, final List list, String str, final Context context, final List list2, final State state, final State state2, final State state3, final MutableState mutableState2, State state4, final MutableState mutableState3, Function0 function0, final LazyStaggeredGridState lazyStaggeredGridState, final Function1 function1, final LazyListState lazyListState, final MutableState mutableState4, final MutableState mutableState5, final MutableState mutableState6, final MutableState mutableState7, final MutableState mutableState8, final MutableState mutableState9, final MutableState mutableState10, final MutableState mutableState11, final MutableState mutableState12, final MutableState mutableState13, final MutableState mutableState14, final MutableState mutableState15, final MutableState mutableState16, PaddingValues paddingValues, Composer composer, int i) {
        char c;
        char c2;
        Object obj;
        int i2;
        int i3;
        Object obj2;
        Object next;
        String str2;
        Object obj3;
        final BookViewModel bookViewModel2;
        Composer composer2;
        final String str3 = str;
        Intrinsics.checkNotNullParameter(paddingValues, "innerPadding");
        ComposerKt.sourceInformation(composer, "C708@35496L23126:DashboardScreen.kt#2thlc2");
        int i4 = (i & 6) == 0 ? i | (composer.changed(paddingValues) ? 4 : 2) : i;
        if ((i4 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                c = 2;
                ComposerKt.traceEventStart(262523218, i4, -1, "com.example.ui.screens.DashboardScreen.<anonymous> (DashboardScreen.kt:687)");
            } else {
                c = 2;
            }
            if (DashboardScreen$lambda$92(mutableState)) {
                composer.startReplaceGroup(-306171621);
                ComposerKt.sourceInformation(composer, "689@34660L733,704@35423L31,688@34607L861");
                ComposerKt.sourceInformationMarkerStart(composer, -1118253169, "CC(remember):DashboardScreen.kt#9igjgp");
                boolean zChangedInstance = composer.changedInstance(coroutineScope) | composer.changedInstance(bookViewModel);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda120
                        public final Object invoke(Object obj4) {
                            return DashboardScreenKt.DashboardScreen$lambda$276$lambda$189$lambda$188(coroutineScope, mutableState, bookViewModel, snackbarHostState, (String) obj4);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function1 function2 = (Function1) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composer);
                c2 = 4;
                ComposerKt.sourceInformationMarkerStart(composer, -1118229455, "CC(remember):DashboardScreen.kt#9igjgp");
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda125
                        public final Object invoke() {
                            return DashboardScreenKt.DashboardScreen$lambda$276$lambda$191$lambda$190(mutableState);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                QRScannerDialogKt.GlobalQRScannerDialog(function2, (Function0) objRememberedValue2, composer, 48);
            } else {
                c2 = 4;
                composer.startReplaceGroup(-340516304);
            }
            composer.endReplaceGroup();
            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null), paddingValues);
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierPadding);
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
            ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -2006239098, "C714@35667L5589,808@41337L241,813@41611L106,814@41750L61,815@41842L105,817@41986L140,821@42158L110,822@42299L68,823@42404L71,826@42558L615,839@43222L745,851@44110L266:DashboardScreen.kt#2thlc2");
            Modifier modifier = PaddingKt.padding-VpY3zN4(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(16.0f), Dp.constructor-impl(8.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
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
            Composer composer4 = Updater.constructor-impl(composer);
            Updater.set-impl(composer4, measurePolicyColumnMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer4, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer4.getInserting() || !Intrinsics.areEqual(composer4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composer4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composer4.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.set-impl(composer4, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScope columnScope2 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1851831209, "C719@35845L2269,755@38148L41,760@38449L2760,758@38351L2858:DashboardScreen.kt#2thlc2");
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
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
            Updater.set-impl(composer5, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer5.getInserting() || !Intrinsics.areEqual(composer5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composer5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composer5.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.set-impl(composer5, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1463041468, "C736@37034L11,737@37120L11,738@37214L11,739@37303L11,735@36963L393,722@36059L35,726@36407L393,720@35955L1423,742@37399L39,744@37505L57,745@37645L11,746@37754L342,743@37459L637:DashboardScreen.kt#2thlc2");
            String strDashboardScreen$lambda$0 = DashboardScreen$lambda$0(state3);
            Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.Companion, 1.0f, false, 2, (Object) null);
            Shape shape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(28.0f));
            TextFieldColors textFieldColors = OutlinedTextFieldDefaults.INSTANCE.colors-0hiis_0(0L, 0L, 0L, 0L, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface-0d7_KjU(), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0L, 0L, 0L, 0L, (TextSelectionColors) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 0, 0, 0, 0, 3072, 2147477455, 4095);
            ComposerKt.sourceInformationMarkerStart(composer, 1199732325, "CC(remember):DashboardScreen.kt#9igjgp");
            boolean zChangedInstance2 = composer.changedInstance(bookViewModel);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda127
                    public final Object invoke(Object obj4) {
                        return DashboardScreenKt.DashboardScreen$lambda$276$lambda$275$lambda$209$lambda$200$lambda$193$lambda$192(bookViewModel, (String) obj4);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            OutlinedTextFieldKt.OutlinedTextField(strDashboardScreen$lambda$0, (Function1) objRememberedValue3, modifierWeight$default, false, false, (TextStyle) null, (Function2) null, ComposableSingletons$DashboardScreenKt.INSTANCE.m313getLambda$841294359$app(), ComposableSingletons$DashboardScreenKt.INSTANCE.m294getLambda$1851960406$app(), ComposableLambdaKt.rememberComposableLambda(1432340843, true, new Function2() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda128
                public final Object invoke(Object obj4, Object obj5) {
                    return DashboardScreenKt.DashboardScreen$lambda$276$lambda$275$lambda$209$lambda$200$lambda$196(bookViewModel, state3, (Composer) obj4, ((Integer) obj5).intValue());
                }
            }, composer, 54), (Function2) null, (Function2) null, (Function2) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, shape, textFieldColors, composer, 918552576, 12582912, 0, 1965176);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, 1199778619, "CC(remember):DashboardScreen.kt#9igjgp");
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda129
                    public final Object invoke() {
                        return DashboardScreenKt.DashboardScreen$lambda$276$lambda$275$lambda$209$lambda$200$lambda$198$lambda$197(mutableState2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            IconButtonKt.IconButton((Function0) objRememberedValue4, BackgroundKt.background-bw27NRU(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(48.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSecondaryContainer-0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableLambdaKt.rememberComposableLambda(-1713168059, true, new Function2() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda130
                public final Object invoke(Object obj4, Object obj5) {
                    return DashboardScreenKt.DashboardScreen$lambda$276$lambda$275$lambda$209$lambda$200$lambda$199(mutableState2, (Composer) obj4, ((Integer) obj5).intValue());
                }
            }, composer, 54), composer, 196614, 28);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(12.0f)), composer, 6);
            String[] strArr = new String[7];
            strArr[0] = "ALL";
            strArr[1] = "MY_BOOKS";
            strArr[c] = "RECOMMENDED";
            strArr[3] = "AVAILABLE";
            strArr[c2] = "REQUESTED";
            strArr[5] = "BORROWED";
            strArr[6] = "BOOKMARKS";
            final List listListOf = CollectionsKt.listOf(strArr);
            Arrangement.Horizontal horizontal = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(8.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -494372114, "CC(remember):DashboardScreen.kt#9igjgp");
            boolean zChangedInstance3 = composer.changedInstance(list) | composer.changed(str3) | composer.changedInstance(list2) | composer.changed(state) | composer.changed(state2) | composer.changedInstance(bookViewModel);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                i2 = 18;
                obj = new Function1() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda131
                    public final Object invoke(Object obj4) {
                        return DashboardScreenKt.DashboardScreen$lambda$276$lambda$275$lambda$209$lambda$208$lambda$207(listListOf, list, list2, bookViewModel, str3, state, state2, (LazyListScope) obj4);
                    }
                };
                str3 = str3;
                composer.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue5;
                i2 = 18;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            LazyDslKt.LazyRow((Modifier) null, (LazyListState) null, (PaddingValues) null, false, horizontal, (Alignment.Vertical) null, (FlingBehavior) null, false, (Function1) obj, composer, 24576, 239);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, -757295315, r10);
            boolean zChanged = composer.changed(list);
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChanged || objRememberedValue6 == Composer.Companion.getEmpty()) {
                List<Book> list3 = list;
                Iterator it = list3.iterator();
                int rentCount = 0;
                while (it.hasNext()) {
                    rentCount += ((Book) it.next()).getRentCount();
                }
                if ((list3 instanceof Collection) && list3.isEmpty()) {
                    i3 = 0;
                } else {
                    i3 = 0;
                    for (Book book : list3) {
                        if (Intrinsics.areEqual(book.getStatus(), "BORROWED") || Intrinsics.areEqual(book.getStatus(), "PENDING_RETURN")) {
                            i3++;
                            if (i3 < 0) {
                                CollectionsKt.throwCountOverflow();
                            }
                        }
                    }
                }
                objRememberedValue6 = Integer.valueOf(RangesKt.coerceAtLeast(rentCount + i3, i2));
                composer.updateRememberedValue(objRememberedValue6);
            }
            int iIntValue = ((Number) objRememberedValue6).intValue();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, -757286682, r10);
            boolean zChanged2 = composer.changed(iIntValue);
            Object objRememberedValue7 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue7 == Composer.Companion.getEmpty()) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                objRememberedValue7 = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(((double) iIntValue) * 0.05d)}, 1));
                Intrinsics.checkNotNullExpressionValue(objRememberedValue7, "format(...)");
                composer.updateRememberedValue(objRememberedValue7);
            }
            final String str4 = (String) objRememberedValue7;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, -757282279, r10);
            boolean zChanged3 = composer.changed(iIntValue);
            Object objRememberedValue8 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue8 == Composer.Companion.getEmpty()) {
                objRememberedValue8 = Integer.valueOf(iIntValue * 105);
                composer.updateRememberedValue(objRememberedValue8);
            }
            final int iIntValue2 = ((Number) objRememberedValue8).intValue();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, -757279291, r10);
            boolean zChanged4 = composer.changed(iIntValue);
            Object objRememberedValue9 = composer.rememberedValue();
            if (zChanged4 || objRememberedValue9 == Composer.Companion.getEmpty()) {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                obj2 = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(((double) iIntValue) * 2.7d)}, 1));
                Intrinsics.checkNotNullExpressionValue(obj2, "format(...)");
                composer.updateRememberedValue(obj2);
            } else {
                obj2 = objRememberedValue9;
            }
            final String str5 = (String) obj2;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, -757274648, r10);
            boolean zChanged5 = composer.changed(list) | composer.changed(str3);
            Object objRememberedValue10 = composer.rememberedValue();
            if (zChanged5 || objRememberedValue10 == Composer.Companion.getEmpty()) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    Book book2 = (Book) next;
                    if (Intrinsics.areEqual(book2.getBorrowerName(), str3) && Intrinsics.areEqual(book2.getStatus(), "BORROWED")) {
                        break;
                    }
                }
                objRememberedValue10 = (Book) next;
                composer.updateRememberedValue(objRememberedValue10);
            }
            final Book book3 = (Book) objRememberedValue10;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, -757269174, r10);
            boolean zChanged6 = composer.changed(context);
            Object objRememberedValue11 = composer.rememberedValue();
            if (zChanged6 || objRememberedValue11 == Composer.Companion.getEmpty()) {
                objRememberedValue11 = context.getSharedPreferences("bookxchange_streak", 0);
                composer.updateRememberedValue(objRememberedValue11);
            }
            final SharedPreferences sharedPreferences = (SharedPreferences) objRememberedValue11;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, -757264704, r10);
            Object objRememberedValue12 = composer.rememberedValue();
            if (objRememberedValue12 == Composer.Companion.getEmpty()) {
                objRememberedValue12 = SnapshotIntStateKt.mutableIntStateOf(sharedPreferences.getInt("streak_days", 4));
                composer.updateRememberedValue(objRememberedValue12);
            }
            final MutableIntState mutableIntState = (MutableIntState) objRememberedValue12;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, -757261341, r10);
            Object objRememberedValue13 = composer.rememberedValue();
            if (objRememberedValue13 == Composer.Companion.getEmpty()) {
                objRememberedValue13 = SnapshotIntStateKt.mutableIntStateOf(sharedPreferences.getInt("minutes_today", 15));
                composer.updateRememberedValue(objRememberedValue13);
            }
            final MutableIntState mutableIntState2 = (MutableIntState) objRememberedValue13;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, -757255869, r10);
            boolean zChangedInstance4 = composer.changedInstance(sharedPreferences) | composer.changedInstance(coroutineScope);
            Object objRememberedValue14 = composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue14 == Composer.Companion.getEmpty()) {
                final int i5 = 20;
                str2 = "CC(remember):DashboardScreen.kt#9igjgp";
                obj3 = null;
                Function0 function3 = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda132
                    public final Object invoke() {
                        return DashboardScreenKt.DashboardScreen$lambda$276$lambda$275$lambda$226$lambda$225(i5, sharedPreferences, coroutineScope, mutableIntState2, mutableIntState, snackbarHostState);
                    }
                };
                composer.updateRememberedValue(function3);
                objRememberedValue14 = function3;
            } else {
                str2 = r10;
                obj3 = null;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, -757234491, str2);
            boolean zChanged7 = composer.changed(str4) | composer.changed(iIntValue2) | composer.changed(str5) | composer.changedInstance(context);
            Object objRememberedValue15 = composer.rememberedValue();
            if (zChanged7 || objRememberedValue15 == Composer.Companion.getEmpty()) {
                objRememberedValue15 = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda133
                    public final Object invoke() {
                        return DashboardScreenKt.DashboardScreen$lambda$276$lambda$275$lambda$229$lambda$228(context, str4, iIntValue2, str5);
                    }
                };
                composer.updateRememberedValue(objRememberedValue15);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            List<Book> listDashboardScreen$lambda$2 = DashboardScreen$lambda$2(state4);
            Location locationDashboardScreen$lambda$8 = DashboardScreen$lambda$8(mutableState3);
            ComposerKt.sourceInformationMarkerStart(composer, -757206554, str2);
            boolean zChanged8 = composer.changed(listDashboardScreen$lambda$2) | composer.changed(locationDashboardScreen$lambda$8) | composer.changed(str3);
            Object objRememberedValue16 = composer.rememberedValue();
            if (zChanged8 || objRememberedValue16 == Composer.Companion.getEmpty()) {
                List<Book> listDashboardScreen$lambda$3 = DashboardScreen$lambda$2(state4);
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : listDashboardScreen$lambda$3) {
                    Intrinsics.areEqual(((Book) obj4).getOwnerName(), str3);
                    arrayList.add(obj4);
                }
                objRememberedValue16 = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.example.ui.screens.DashboardScreenKt$DashboardScreen$lambda$276$lambda$275$lambda$232$$inlined$sortedByDescending$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(Long.valueOf(((Book) t2).getTimestamp()), Long.valueOf(((Book) t).getTimestamp()));
                    }
                });
                composer.updateRememberedValue(objRememberedValue16);
            }
            final List list4 = (List) objRememberedValue16;
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (list4.isEmpty()) {
                composer.startReplaceGroup(-1998149959);
                ComposerKt.sourceInformation(composer, "859@44435L3853");
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, obj3);
                Alignment center = Alignment.Companion.getCenter();
                ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxSize$default);
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
                Updater.set-impl(composer6, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl(composer6, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composer6.getInserting() || !Intrinsics.areEqual(composer6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composer6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composer6.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.set-impl(composer6, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScope boxScope = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, -1321869745, "C860@44533L3737:DashboardScreen.kt#2thlc2");
                Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
                Modifier modifier2 = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(32.0f));
                ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer, modifier2);
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
                Updater.set-impl(composer7, measurePolicyColumnMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl(composer7, currentCompositionLocalMap5, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash5 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composer7.getInserting() || !Intrinsics.areEqual(composer7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    composer7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    composer7.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                Updater.set-impl(composer7, modifierMaterializeModifier5, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScope columnScope3 = ColumnScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, 1560180, "C865@44943L11,861@44654L353:DashboardScreen.kt#2thlc2");
                IconKt.Icon-ww6aTOc(BookKt.getBook(Icons.INSTANCE.getDefault()), "Empty Library", PaddingKt.padding-qDBjuR0$default(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(100.0f)), 0.0f, 0.0f, 0.0f, Dp.constructor-impl(24.0f), 7, (Object) null), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, (Object) null), composer, 432, 0);
                if (StringsKt.isBlank(DashboardScreen$lambda$0(state3)) && Intrinsics.areEqual(DashboardScreen$lambda$1(state2), "ALL")) {
                    composer.startReplaceGroup(3606148);
                    ComposerKt.sourceInformation(composer, "890@46865L10,890@46943L11,890@46813L152,891@46994L41,892@47198L10,892@47242L11,892@47064L237,893@47330L41,898@47746L11,898@47702L64,894@47400L751,904@48180L42");
                    TextKt.Text--4IGK_g("Your Library is Empty", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getHeadlineSmall(), composer, 196614, 0, 65498);
                    SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(12.0f)), composer, 6);
                    TextKt.Text--4IGK_g("There are no books available right now. Be the first in your area to share a book and start exchanging!", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.box-impl(TextAlign.Companion.getCenter-e0LSkKk()), 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyLarge(), composer, 6, 0, 65018);
                    SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(32.0f)), composer, 6);
                    ButtonKt.Button(function0, SizeKt.fillMaxWidth(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(56.0f)), 0.8f), false, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(28.0f)), ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0L, 0L, 0L, composer, ButtonDefaults.$stable << 12, 14), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.m283getLambda$155646895$app(), composer, 805306416, 484);
                    SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(100.0f)), composer, 6);
                    composer.endReplaceGroup();
                    composer2 = composer;
                } else {
                    composer.startReplaceGroup(1930691);
                    ComposerKt.sourceInformation(composer, "868@45164L10,868@45242L11,868@45117L147,869@45293L41,870@45506L10,870@45550L11,870@45363L246,871@45638L41,886@46592L72,886@46567L184");
                    TextKt.Text--4IGK_g("No Matches Found", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getHeadlineSmall(), composer, 196614, 0, 65498);
                    SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(12.0f)), composer, 6);
                    TextKt.Text--4IGK_g("This book isn't available right now. Add it to your Wishlist to get notified the second someone nearby lists it!", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.box-impl(TextAlign.Companion.getCenter-e0LSkKk()), 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyLarge(), composer, 6, 0, 65018);
                    SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), composer, 6);
                    if (StringsKt.isBlank(DashboardScreen$lambda$0(state3))) {
                        bookViewModel2 = bookViewModel;
                        composer.startReplaceGroup(-42848995);
                    } else {
                        composer.startReplaceGroup(2548893);
                        ComposerKt.sourceInformation(composer, "874@45826L188,879@46120L314,873@45772L662,884@46467L41");
                        ComposerKt.sourceInformationMarkerStart(composer, -1385388895, str2);
                        bookViewModel2 = bookViewModel;
                        boolean zChangedInstance5 = composer.changedInstance(bookViewModel2) | composer.changed(state3);
                        Object objRememberedValue17 = composer.rememberedValue();
                        if (zChangedInstance5 || objRememberedValue17 == Composer.Companion.getEmpty()) {
                            objRememberedValue17 = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda134
                                public final Object invoke() {
                                    return DashboardScreenKt.DashboardScreen$lambda$276$lambda$275$lambda$239$lambda$238$lambda$234$lambda$233(bookViewModel2, state3);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue17);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ButtonKt.Button((Function0) objRememberedValue17, (Modifier) null, false, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableLambdaKt.rememberComposableLambda(-285253697, true, new Function3() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda121
                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                return DashboardScreenKt.DashboardScreen$lambda$276$lambda$275$lambda$239$lambda$238$lambda$235(state3, (RowScope) obj5, (Composer) obj6, ((Integer) obj7).intValue());
                            }
                        }, composer, 54), composer, 805306368, 502);
                        SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(12.0f)), composer, 6);
                    }
                    composer.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerStart(composer, -1385364499, str2);
                    boolean zChangedInstance6 = composer.changedInstance(bookViewModel2);
                    Object objRememberedValue18 = composer.rememberedValue();
                    if (zChangedInstance6 || objRememberedValue18 == Composer.Companion.getEmpty()) {
                        objRememberedValue18 = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda122
                            public final Object invoke() {
                                return DashboardScreenKt.DashboardScreen$lambda$276$lambda$275$lambda$239$lambda$238$lambda$237$lambda$236(bookViewModel2);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue18);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ButtonKt.OutlinedButton((Function0) objRememberedValue18, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.getLambda$2073061752$app(), composer, 805306368, 510);
                    composer2 = composer;
                    composer2.endReplaceGroup();
                }
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
                composer.startReplaceGroup(-1994091098);
                ComposerKt.sourceInformation(composer, "911@48424L283,916@48776L9822,909@48326L10272");
                String strDashboardScreen$lambda$14 = DashboardScreen$lambda$14(mutableState2);
                ComposerKt.sourceInformationMarkerStart(composer, -757068489, str2);
                Object objRememberedValue19 = composer.rememberedValue();
                if (objRememberedValue19 == Composer.Companion.getEmpty()) {
                    objRememberedValue19 = new Function1() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda123
                        public final Object invoke(Object obj5) {
                            return DashboardScreenKt.DashboardScreen$lambda$276$lambda$275$lambda$241$lambda$240((AnimatedContentTransitionScope) obj5);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue19);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                AnimatedContentKt.AnimatedContent(strDashboardScreen$lambda$14, (Modifier) null, (Function1) objRememberedValue19, (Alignment) null, "ViewModeTransition", (Function1) null, ComposableLambdaKt.rememberComposableLambda(2079797902, true, new Function4() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda124
                    public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                        return DashboardScreenKt.DashboardScreen$lambda$276$lambda$275$lambda$274(lazyStaggeredGridState, state3, state2, book3, list2, list4, str3, bookViewModel, function1, lazyListState, mutableState4, mutableState5, mutableState6, mutableState3, mutableState7, mutableState8, mutableState9, mutableState10, mutableState11, mutableState12, mutableState13, mutableState14, mutableState15, mutableState16, (AnimatedContentScope) obj5, (String) obj6, (Composer) obj7, ((Integer) obj8).intValue());
                    }
                }, composer, 54), composer, 1597824, 42);
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

    static final Unit DashboardScreen$lambda$276$lambda$189$lambda$188(CoroutineScope coroutineScope, MutableState mutableState, BookViewModel bookViewModel, SnackbarHostState snackbarHostState, String str) {
        Intrinsics.checkNotNullParameter(str, "raw");
        DashboardScreen$lambda$93(mutableState, false);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new DashboardScreenKt$DashboardScreen$32$1$1$1(bookViewModel, str, snackbarHostState, null), 3, (Object) null);
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$276$lambda$191$lambda$190(MutableState mutableState) {
        DashboardScreen$lambda$93(mutableState, false);
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$276$lambda$275$lambda$209$lambda$200$lambda$193$lambda$192(BookViewModel bookViewModel, String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        bookViewModel.updateSearchQuery(str);
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$276$lambda$275$lambda$209$lambda$200$lambda$196(final BookViewModel bookViewModel, State state, Composer composer, int i) {
        Composer composer2;
        ComposerKt.sourceInformation(composer, "C:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1432340843, i, -1, "com.example.ui.screens.DashboardScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:727)");
            }
            if (StringsKt.isBlank(DashboardScreen$lambda$0(state))) {
                composer2 = composer;
                composer2.startReplaceGroup(329851319);
            } else {
                composer.startReplaceGroup(366037092);
                ComposerKt.sourceInformation(composer, "728@36522L35,728@36501L243");
                ComposerKt.sourceInformationMarkerStart(composer, 2090019118, "CC(remember):DashboardScreen.kt#9igjgp");
                boolean zChangedInstance = composer.changedInstance(bookViewModel);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda5
                        public final Object invoke() {
                            return DashboardScreenKt.DashboardScreen$lambda$276$lambda$275$lambda$209$lambda$200$lambda$196$lambda$195$lambda$194(bookViewModel);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer2 = composer;
                IconButtonKt.IconButton((Function0) objRememberedValue, (Modifier) null, false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.m308getLambda$494412445$app(), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            }
            composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$276$lambda$275$lambda$209$lambda$200$lambda$196$lambda$195$lambda$194(BookViewModel bookViewModel) {
        bookViewModel.updateSearchQuery("");
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$276$lambda$275$lambda$209$lambda$200$lambda$198$lambda$197(MutableState mutableState) {
        mutableState.setValue(Intrinsics.areEqual(DashboardScreen$lambda$14(mutableState), "LIST") ? "GRID" : "LIST");
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$276$lambda$275$lambda$209$lambda$200$lambda$199(MutableState mutableState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C750@38016L11,747@37780L294:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1713168059, i, -1, "com.example.ui.screens.DashboardScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:747)");
            }
            IconKt.Icon-ww6aTOc(Intrinsics.areEqual(DashboardScreen$lambda$14(mutableState), "LIST") ? GridViewKt.getGridView(Icons.INSTANCE.getDefault()) : ViewListKt.getViewList(Icons.AutoMirrored.Filled.INSTANCE), "Toggle View", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSecondaryContainer-0d7_KjU(), composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int DashboardScreen$lambda$276$lambda$275$lambda$220(MutableIntState mutableIntState) {
        return ((IntState) mutableIntState).getIntValue();
    }

    private static final int DashboardScreen$lambda$276$lambda$275$lambda$223(MutableIntState mutableIntState) {
        return ((IntState) mutableIntState).getIntValue();
    }

    static final Unit DashboardScreen$lambda$276$lambda$275$lambda$226$lambda$225(int i, SharedPreferences sharedPreferences, CoroutineScope coroutineScope, MutableIntState mutableIntState, MutableIntState mutableIntState2, SnackbarHostState snackbarHostState) {
        int iDashboardScreen$lambda$276$lambda$275$lambda$223 = DashboardScreen$lambda$276$lambda$275$lambda$223(mutableIntState) + 10;
        mutableIntState.setIntValue(iDashboardScreen$lambda$276$lambda$275$lambda$223);
        if (iDashboardScreen$lambda$276$lambda$275$lambda$223 >= i && DashboardScreen$lambda$276$lambda$275$lambda$223(mutableIntState) - 10 < i) {
            mutableIntState2.setIntValue(DashboardScreen$lambda$276$lambda$275$lambda$220(mutableIntState2) + 1);
            sharedPreferences.edit().putInt("streak_days", DashboardScreen$lambda$276$lambda$275$lambda$220(mutableIntState2)).apply();
        }
        sharedPreferences.edit().putInt("minutes_today", iDashboardScreen$lambda$276$lambda$275$lambda$223).apply();
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new DashboardScreenKt$DashboardScreen$32$3$onLogReading$1$1$1(snackbarHostState, iDashboardScreen$lambda$276$lambda$275$lambda$223, mutableIntState2, null), 3, (Object) null);
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$276$lambda$275$lambda$229$lambda$228(Context context, String str, int i, String str2) {
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", "My Green Reader Impact on BookXchange");
            intent.putExtra("android.intent.extra.TEXT", "🌱 My Eco-Impact on BookXchange:\n• " + str + " Trees Saved\n• " + i + "L Water Conserved\n• " + str2 + "kg CO₂ Offset\n\nJoin me in sharing and reading books sustainably on BookXchange!\nDownload on Google Play: https://play.google.com/store/apps/details?id=com.BookXchange.app");
            context.startActivity(Intent.createChooser(intent, "Share Eco Impact"));
        } catch (Exception unused) {
        }
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$276$lambda$275$lambda$239$lambda$238$lambda$234$lambda$233(BookViewModel bookViewModel, State state) {
        BookViewModel.addToWishlist$default(bookViewModel, DashboardScreen$lambda$0(state), null, null, 6, null);
        bookViewModel.updateSearchQuery("");
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$276$lambda$275$lambda$239$lambda$238$lambda$235(State state, RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Button");
        ComposerKt.sourceInformation(composer, "C880@46158L91,881@46286L39,882@46362L38:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-285253697, i, -1, "com.example.ui.screens.DashboardScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:880)");
            }
            IconKt.Icon-ww6aTOc(BookmarkAddKt.getBookmarkAdd(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), 0L, composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextKt.Text--4IGK_g("Add '" + DashboardScreen$lambda$0(state) + "' to Wishlist", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$276$lambda$275$lambda$239$lambda$238$lambda$237$lambda$236(BookViewModel bookViewModel) {
        bookViewModel.updateSearchQuery("");
        bookViewModel.updateFilterStatus("ALL");
        return Unit.INSTANCE;
    }

    static final ContentTransform DashboardScreen$lambda$276$lambda$275$lambda$241$lambda$240(AnimatedContentTransitionScope animatedContentTransitionScope) {
        Intrinsics.checkNotNullParameter(animatedContentTransitionScope, "$this$AnimatedContent");
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(280, 0, (Easing) null, 6, (Object) null), 0.0f, 2, (Object) null).plus(EnterExitTransitionKt.scaleIn-L8ZKh-E$default(AnimationSpecKt.tween$default(280, 0, (Easing) null, 6, (Object) null), 0.97f, 0L, 4, (Object) null)), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(180, 0, (Easing) null, 6, (Object) null), 0.0f, 2, (Object) null).plus(EnterExitTransitionKt.scaleOut-L8ZKh-E$default(AnimationSpecKt.tween$default(180, 0, (Easing) null, 6, (Object) null), 0.97f, 0L, 4, (Object) null)));
    }

    static final Unit DashboardScreen$lambda$276$lambda$275$lambda$274(LazyStaggeredGridState lazyStaggeredGridState, final State state, final State state2, final Book book, final List list, final List list2, final String str, final BookViewModel bookViewModel, final Function1 function1, LazyListState lazyListState, final MutableState mutableState, final MutableState mutableState2, final MutableState mutableState3, final MutableState mutableState4, final MutableState mutableState5, final MutableState mutableState6, final MutableState mutableState7, final MutableState mutableState8, final MutableState mutableState9, final MutableState mutableState10, final MutableState mutableState11, final MutableState mutableState12, final MutableState mutableState13, final MutableState mutableState14, AnimatedContentScope animatedContentScope, String str2, Composer composer, int i) {
        Composer composer2;
        Composer composer3 = composer;
        Intrinsics.checkNotNullParameter(animatedContentScope, "$this$AnimatedContent");
        Intrinsics.checkNotNullParameter(str2, "currentMode");
        ComposerKt.sourceInformation(composer3, "C:DashboardScreen.kt#2thlc2");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2079797902, i, -1, "com.example.ui.screens.DashboardScreen.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:917)");
        }
        if (Intrinsics.areEqual(str2, "GRID")) {
            composer3.startReplaceGroup(61304814);
            ComposerKt.sourceInformation(composer3, "925@49356L4460,918@48866L4950");
            StaggeredGridCells fixed = new StaggeredGridCells.Fixed(2);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null);
            PaddingValues paddingValues = PaddingKt.PaddingValues-a9UjIt4(Dp.constructor-impl(16.0f), Dp.constructor-impl(4.0f), Dp.constructor-impl(16.0f), Dp.constructor-impl(16.0f));
            Arrangement.Horizontal horizontal = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(14.0f));
            float f = Dp.constructor-impl(14.0f);
            StaggeredGridCells staggeredGridCells = fixed;
            Arrangement.Horizontal horizontal2 = horizontal;
            ComposerKt.sourceInformationMarkerStart(composer3, 1526014202, "CC(remember):DashboardScreen.kt#9igjgp");
            boolean zChanged = composer3.changed(state) | composer3.changed(state2) | composer3.changedInstance(book) | composer3.changedInstance(list) | composer3.changedInstance(list2) | composer3.changed(str) | composer3.changedInstance(bookViewModel) | composer3.changed(function1);
            Object objRememberedValue = composer3.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                Function1 function2 = new Function1() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda118
                    public final Object invoke(Object obj) {
                        return DashboardScreenKt.DashboardScreen$lambda$276$lambda$275$lambda$274$lambda$257$lambda$256(book, list, list2, state, state2, mutableState, mutableState2, mutableState3, str, bookViewModel, function1, mutableState4, mutableState5, mutableState6, mutableState7, mutableState8, mutableState9, mutableState10, mutableState11, mutableState12, mutableState13, mutableState14, (LazyStaggeredGridScope) obj);
                    }
                };
                composer3 = composer;
                composer3.updateRememberedValue(function2);
                objRememberedValue = function2;
            }
            ComposerKt.sourceInformationMarkerEnd(composer3);
            Composer composer4 = composer3;
            LazyStaggeredGridDslKt.LazyVerticalStaggeredGrid-zadm560(staggeredGridCells, modifierFillMaxSize$default, lazyStaggeredGridState, paddingValues, false, f, horizontal2, (FlingBehavior) null, false, (Function1) objRememberedValue, composer4, (LazyStaggeredGridState.$stable << 6) | 1769520, 400);
            composer4.endReplaceGroup();
        } else {
            composer3.startReplaceGroup(66260660);
            ComposerKt.sourceInformation(composer3, "989@54219L4339,984@53870L4688");
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null);
            PaddingValues paddingValues2 = PaddingKt.PaddingValues-a9UjIt4(Dp.constructor-impl(16.0f), Dp.constructor-impl(4.0f), Dp.constructor-impl(16.0f), Dp.constructor-impl(16.0f));
            Arrangement.Vertical vertical = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(12.0f));
            ComposerKt.sourceInformationMarkerStart(composer3, 1526169697, "CC(remember):DashboardScreen.kt#9igjgp");
            boolean zChanged2 = composer3.changed(state) | composer3.changed(state2) | composer3.changedInstance(book) | composer3.changedInstance(list) | composer3.changedInstance(list2) | composer3.changed(str) | composer3.changedInstance(bookViewModel) | composer3.changed(function1);
            Object objRememberedValue2 = composer3.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                Function1 function3 = new Function1() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda119
                    public final Object invoke(Object obj) {
                        return DashboardScreenKt.DashboardScreen$lambda$276$lambda$275$lambda$274$lambda$273$lambda$272(book, list, list2, state, state2, mutableState, mutableState2, mutableState3, str, bookViewModel, function1, mutableState4, mutableState5, mutableState6, mutableState7, mutableState8, mutableState9, mutableState10, mutableState11, mutableState12, mutableState13, mutableState14, (LazyListScope) obj);
                    }
                };
                composer2 = composer;
                composer2.updateRememberedValue(function3);
                objRememberedValue2 = function3;
            } else {
                composer2 = composer3;
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            LazyDslKt.LazyColumn(modifierFillMaxSize$default2, lazyListState, paddingValues2, false, vertical, (Alignment.Horizontal) null, (FlingBehavior) null, false, (Function1) objRememberedValue2, composer2, 24582, 232);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$276$lambda$275$lambda$274$lambda$257$lambda$256(final Book book, final List list, final List list2, State state, State state2, final MutableState mutableState, final MutableState mutableState2, final MutableState mutableState3, final String str, final BookViewModel bookViewModel, final Function1 function1, final MutableState mutableState4, final MutableState mutableState5, final MutableState mutableState6, final MutableState mutableState7, final MutableState mutableState8, final MutableState mutableState9, final MutableState mutableState10, final MutableState mutableState11, final MutableState mutableState12, final MutableState mutableState13, final MutableState mutableState14, LazyStaggeredGridScope lazyStaggeredGridScope) {
        Intrinsics.checkNotNullParameter(lazyStaggeredGridScope, "$this$LazyVerticalStaggeredGrid");
        if (StringsKt.isBlank(DashboardScreen$lambda$0(state)) && Intrinsics.areEqual(DashboardScreen$lambda$1(state2), "ALL")) {
            LazyStaggeredGridScope.item$default(lazyStaggeredGridScope, (Object) null, (Object) null, StaggeredGridItemSpan.Companion.getFullLine(), ComposableLambdaKt.composableLambdaInstance(732155444, true, new Function3() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda7
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return DashboardScreenKt.DashboardScreen$lambda$276$lambda$275$lambda$274$lambda$257$lambda$256$lambda$244(mutableState, (LazyStaggeredGridItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 3, (Object) null);
            if (book != null) {
                LazyStaggeredGridScope.item$default(lazyStaggeredGridScope, (Object) null, (Object) null, StaggeredGridItemSpan.Companion.getFullLine(), ComposableLambdaKt.composableLambdaInstance(-1613335367, true, new Function3() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda8
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return DashboardScreenKt.DashboardScreen$lambda$276$lambda$275$lambda$274$lambda$257$lambda$256$lambda$247(book, mutableState2, (LazyStaggeredGridItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }), 3, (Object) null);
            }
            if (!list.isEmpty()) {
                LazyStaggeredGridScope.item$default(lazyStaggeredGridScope, (Object) null, (Object) null, StaggeredGridItemSpan.Companion.getFullLine(), ComposableLambdaKt.composableLambdaInstance(1522663330, true, new Function3() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda9
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return DashboardScreenKt.DashboardScreen$lambda$276$lambda$275$lambda$274$lambda$257$lambda$256$lambda$250(list, mutableState3, (LazyStaggeredGridItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }), 3, (Object) null);
            }
        }
        final Function1 function2 = new Function1() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda10
            public final Object invoke(Object obj) {
                return DashboardScreenKt.DashboardScreen$lambda$276$lambda$275$lambda$274$lambda$257$lambda$256$lambda$251((Book) obj);
            }
        };
        lazyStaggeredGridScope.items(list2.size(), new Function1<Integer, Object>() { // from class: com.example.ui.screens.DashboardScreenKt$DashboardScreen$lambda$276$lambda$275$lambda$274$lambda$257$lambda$256$$inlined$items$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Object invoke(int i) {
                return function2.invoke(list2.get(i));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new Function1<Integer, Object>() { // from class: com.example.ui.screens.DashboardScreenKt$DashboardScreen$lambda$276$lambda$275$lambda$274$lambda$257$lambda$256$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i) {
                list2.get(i);
                return null;
            }
        }, (Function1) null, ComposableLambdaKt.composableLambdaInstance(-886456479, true, new Function4<LazyStaggeredGridItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.screens.DashboardScreenKt$DashboardScreen$lambda$276$lambda$275$lambda$274$lambda$257$lambda$256$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((LazyStaggeredGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, int i, Composer composer, int i2) {
                int i3;
                String str2;
                ComposerKt.sourceInformation(composer, "C345@15356L25:LazyStaggeredGridDsl.kt#fzvcnm");
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer.changed(lazyStaggeredGridItemScope) ? 4 : 2);
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
                    ComposerKt.traceEventStart(-886456479, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.items.<anonymous> (LazyStaggeredGridDsl.kt:345)");
                }
                final Book book2 = (Book) list2.get(i);
                composer.startReplaceGroup(-1957522947);
                ComposerKt.sourceInformation(composer, "C*961@51768L24,962@51846L2,963@51902L1824,955@51350L2410:DashboardScreen.kt#2thlc2");
                if (DashboardScreenKt.DashboardScreen$lambda$8(mutableState4) != null && book2.getLatitude() != null && book2.getLongitude() != null) {
                    float[] fArr = new float[1];
                    Location locationDashboardScreen$lambda$8 = DashboardScreenKt.DashboardScreen$lambda$8(mutableState4);
                    Intrinsics.checkNotNull(locationDashboardScreen$lambda$8);
                    double latitude = locationDashboardScreen$lambda$8.getLatitude();
                    Location locationDashboardScreen$lambda$9 = DashboardScreenKt.DashboardScreen$lambda$8(mutableState4);
                    Intrinsics.checkNotNull(locationDashboardScreen$lambda$9);
                    Location.distanceBetween(latitude, locationDashboardScreen$lambda$9.getLongitude(), book2.getLatitude().doubleValue(), book2.getLongitude().doubleValue(), fArr);
                    float f = fArr[0] / 1000.0f;
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    str2 = String.format("%.1f km away", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
                    Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                } else {
                    str2 = "";
                }
                String str3 = str2;
                boolean zIsBookOwner = DashboardScreenKt.isBookOwner(book2, str);
                String str4 = str;
                BookViewModel bookViewModel2 = bookViewModel;
                ComposerKt.sourceInformationMarkerStart(composer, -478758990, "CC(remember):DashboardScreen.kt#9igjgp");
                boolean zChanged = composer.changed(function1) | composer.changedInstance(book2);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    final Function1 function3 = function1;
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.DashboardScreenKt$DashboardScreen$32$3$4$1$1$5$1$1
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m367invoke();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m367invoke() {
                            function3.invoke(book2.getId());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerStart(composer, -478756516, "CC(remember):DashboardScreen.kt#9igjgp");
                DashboardScreenKt$DashboardScreen$32$3$4$1$1$5$2$1 dashboardScreenKt$DashboardScreen$32$3$4$1$1$5$2$1RememberedValue = composer.rememberedValue();
                if (dashboardScreenKt$DashboardScreen$32$3$4$1$1$5$2$1RememberedValue == Composer.Companion.getEmpty()) {
                    dashboardScreenKt$DashboardScreen$32$3$4$1$1$5$2$1RememberedValue = new Function1<String, Unit>() { // from class: com.example.ui.screens.DashboardScreenKt$DashboardScreen$32$3$4$1$1$5$2$1
                        public final void invoke(String str5) {
                            Intrinsics.checkNotNullParameter(str5, "it");
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((String) obj);
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(dashboardScreenKt$DashboardScreen$32$3$4$1$1$5$2$1RememberedValue);
                }
                Function1 function4 = (Function1) dashboardScreenKt$DashboardScreen$32$3$4$1$1$5$2$1RememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerStart(composer, -478752902, "CC(remember):DashboardScreen.kt#9igjgp");
                boolean zChangedInstance = composer.changedInstance(bookViewModel);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    final BookViewModel bookViewModel3 = bookViewModel;
                    final MutableState mutableState15 = mutableState5;
                    final MutableState mutableState16 = mutableState6;
                    final MutableState mutableState17 = mutableState7;
                    final MutableState mutableState18 = mutableState8;
                    final MutableState mutableState19 = mutableState9;
                    final MutableState mutableState20 = mutableState10;
                    final MutableState mutableState21 = mutableState11;
                    final MutableState mutableState22 = mutableState12;
                    final MutableState mutableState23 = mutableState13;
                    final MutableState mutableState24 = mutableState14;
                    objRememberedValue2 = (Function2) new Function2<String, Book, Unit>() { // from class: com.example.ui.screens.DashboardScreenKt$DashboardScreen$32$3$4$1$1$5$3$1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((String) obj, (Book) obj2);
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                        public final void invoke(String str5, Book book3) {
                            Intrinsics.checkNotNullParameter(str5, "action");
                            Intrinsics.checkNotNullParameter(book3, "bookItem");
                            switch (str5.hashCode()) {
                                case -1881067216:
                                    if (!str5.equals("RETURN")) {
                                        return;
                                    }
                                    break;
                                case -1706593317:
                                    if (str5.equals("SHOW_HANDOVER_QR")) {
                                        mutableState15.setValue(book3);
                                        mutableState18.setValue("HANDOVER");
                                        DashboardScreenKt.DashboardScreen$lambda$72(mutableState19, true);
                                        return;
                                    }
                                    return;
                                case -1662854846:
                                    if (str5.equals("ACCEPT_TRANSFER")) {
                                        bookViewModel3.acceptTransfer(book3);
                                        return;
                                    }
                                    return;
                                case -1410781547:
                                    if (str5.equals("CANCEL_RETURN")) {
                                        bookViewModel3.cancelReturn(book3);
                                        return;
                                    }
                                    return;
                                case -787337814:
                                    if (str5.equals("CANCEL_REQUEST")) {
                                        bookViewModel3.cancelBorrowRequest(book3);
                                        return;
                                    }
                                    return;
                                case -503346302:
                                    if (str5.equals("ACCEPT_TRANSFER_VIEW")) {
                                        mutableState15.setValue(book3);
                                        DashboardScreenKt.DashboardScreen$lambda$66(mutableState16, true);
                                        return;
                                    }
                                    return;
                                case 253358158:
                                    if (str5.equals("SCAN_RETURN_QR")) {
                                        mutableState15.setValue(book3);
                                        mutableState20.setValue("RETURN");
                                        DashboardScreenKt.DashboardScreen$lambda$78(mutableState21, true);
                                        return;
                                    }
                                    return;
                                case 474095451:
                                    if (str5.equals("SCAN_HANDOVER_QR")) {
                                        mutableState15.setValue(book3);
                                        mutableState20.setValue("HANDOVER");
                                        DashboardScreenKt.DashboardScreen$lambda$78(mutableState21, true);
                                        return;
                                    }
                                    return;
                                case 541965997:
                                    if (!str5.equals("BORROWER_RETURN")) {
                                        return;
                                    }
                                    break;
                                case 784801219:
                                    if (str5.equals("HANDOVER")) {
                                        mutableState15.setValue(book3);
                                        DashboardScreenKt.DashboardScreen$lambda$63(mutableState17, true);
                                        return;
                                    }
                                    return;
                                case 1561102255:
                                    if (str5.equals("CONFIRM_RETURN")) {
                                        mutableState15.setValue(book3);
                                        mutableState23.setValue(book3.getCondition());
                                        DashboardScreenKt.DashboardScreen$lambda$60(mutableState24, true);
                                        return;
                                    }
                                    return;
                                case 1600808142:
                                    if (str5.equals("SHOW_RETURN_QR")) {
                                        mutableState15.setValue(book3);
                                        mutableState18.setValue("RETURN");
                                        DashboardScreenKt.DashboardScreen$lambda$72(mutableState19, true);
                                        return;
                                    }
                                    return;
                                case 1757763048:
                                    if (str5.equals("CANCEL_HANDOVER")) {
                                        bookViewModel3.cancelHandover(book3);
                                        return;
                                    }
                                    return;
                                case 1813675631:
                                    if (str5.equals("REQUEST")) {
                                        bookViewModel3.requestBook(book3);
                                        return;
                                    }
                                    return;
                                default:
                                    return;
                            }
                            mutableState15.setValue(book3);
                            DashboardScreenKt.DashboardScreen$lambda$69(mutableState22, true);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                DashboardScreenKt.BookCardGrid(book2, zIsBookOwner, str4, bookViewModel2, str3, function0, function4, (Function2) objRememberedValue2, composer, 1572864);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$276$lambda$275$lambda$274$lambda$257$lambda$256$lambda$244(final MutableState mutableState, LazyStaggeredGridItemScope lazyStaggeredGridItemScope, Composer composer, int i) {
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$276$lambda$275$lambda$274$lambda$257$lambda$256$lambda$244$lambda$243$lambda$242(MutableState mutableState) {
        DashboardScreen$lambda$36(mutableState, true);
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$276$lambda$275$lambda$274$lambda$257$lambda$256$lambda$247(final Book book, final MutableState mutableState, LazyStaggeredGridItemScope lazyStaggeredGridItemScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(lazyStaggeredGridItemScope, "$this$item");
        ComposerKt.sourceInformation(composer, "C934@49987L45,932@49838L236:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1613335367, i, -1, "com.example.ui.screens.DashboardScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:932)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, 67912326, "CC(remember):DashboardScreen.kt#9igjgp");
            boolean zChangedInstance = composer.changedInstance(book);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda17
                    public final Object invoke() {
                        return DashboardScreenKt.DashboardScreen$lambda$276$lambda$275$lambda$274$lambda$257$lambda$256$lambda$247$lambda$246$lambda$245(book, mutableState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ReadingCompanionBanner(book, (Function0) objRememberedValue, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$276$lambda$275$lambda$274$lambda$257$lambda$256$lambda$247$lambda$246$lambda$245(Book book, MutableState mutableState) {
        mutableState.setValue(book);
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$276$lambda$275$lambda$274$lambda$257$lambda$256$lambda$250(List list, final MutableState mutableState, LazyStaggeredGridItemScope lazyStaggeredGridItemScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(lazyStaggeredGridItemScope, "$this$item");
        ComposerKt.sourceInformation(composer, "C942@50492L29,940@50340L223:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1522663330, i, -1, "com.example.ui.screens.DashboardScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:940)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, -1304381569, "CC(remember):DashboardScreen.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda117
                    public final Object invoke(Object obj) {
                        return DashboardScreenKt.DashboardScreen$lambda$276$lambda$275$lambda$274$lambda$257$lambda$256$lambda$250$lambda$249$lambda$248(mutableState, (Book) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            CuratedForYouSection(list, (Function1) objRememberedValue, composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$276$lambda$275$lambda$274$lambda$257$lambda$256$lambda$250$lambda$249$lambda$248(MutableState mutableState, Book book) {
        Intrinsics.checkNotNullParameter(book, "it");
        mutableState.setValue(book);
        return Unit.INSTANCE;
    }

    static final Object DashboardScreen$lambda$276$lambda$275$lambda$274$lambda$257$lambda$256$lambda$251(Book book) {
        Intrinsics.checkNotNullParameter(book, "it");
        return book.getId();
    }

    static final Unit DashboardScreen$lambda$276$lambda$275$lambda$274$lambda$273$lambda$272(final Book book, final List list, final List list2, State state, State state2, final MutableState mutableState, final MutableState mutableState2, final MutableState mutableState3, final String str, final BookViewModel bookViewModel, final Function1 function1, final MutableState mutableState4, final MutableState mutableState5, final MutableState mutableState6, final MutableState mutableState7, final MutableState mutableState8, final MutableState mutableState9, final MutableState mutableState10, final MutableState mutableState11, final MutableState mutableState12, final MutableState mutableState13, final MutableState mutableState14, LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyColumn");
        if (StringsKt.isBlank(DashboardScreen$lambda$0(state)) && Intrinsics.areEqual(DashboardScreen$lambda$1(state2), "ALL")) {
            LazyListScope.item$default(lazyListScope, (Object) null, (Object) null, ComposableLambdaKt.composableLambdaInstance(-67233381, true, new Function3() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda63
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return DashboardScreenKt.DashboardScreen$lambda$276$lambda$275$lambda$274$lambda$273$lambda$272$lambda$260(mutableState, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 3, (Object) null);
            if (book != null) {
                LazyListScope.item$default(lazyListScope, (Object) null, (Object) null, ComposableLambdaKt.composableLambdaInstance(-1168338784, true, new Function3() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda64
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return DashboardScreenKt.DashboardScreen$lambda$276$lambda$275$lambda$274$lambda$273$lambda$272$lambda$263(book, mutableState2, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }), 3, (Object) null);
            }
            if (!list.isEmpty()) {
                LazyListScope.item$default(lazyListScope, (Object) null, (Object) null, ComposableLambdaKt.composableLambdaInstance(1998902281, true, new Function3() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda65
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return DashboardScreenKt.DashboardScreen$lambda$276$lambda$275$lambda$274$lambda$273$lambda$272$lambda$266(list, mutableState3, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }), 3, (Object) null);
            }
        }
        final Function1 function2 = new Function1() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda67
            public final Object invoke(Object obj) {
                return DashboardScreenKt.DashboardScreen$lambda$276$lambda$275$lambda$274$lambda$273$lambda$272$lambda$267((Book) obj);
            }
        };
        final DashboardScreenKt$DashboardScreen$lambda$276$lambda$275$lambda$274$lambda$273$lambda$272$$inlined$items$default$1 dashboardScreenKt$DashboardScreen$lambda$276$lambda$275$lambda$274$lambda$273$lambda$272$$inlined$items$default$1 = new Function1() { // from class: com.example.ui.screens.DashboardScreenKt$DashboardScreen$lambda$276$lambda$275$lambda$274$lambda$273$lambda$272$$inlined$items$default$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final Void m372invoke(Book book2) {
                return null;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m372invoke((Book) obj);
            }
        };
        lazyListScope.items(list2.size(), new Function1<Integer, Object>() { // from class: com.example.ui.screens.DashboardScreenKt$DashboardScreen$lambda$276$lambda$275$lambda$274$lambda$273$lambda$272$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i) {
                return function2.invoke(list2.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: com.example.ui.screens.DashboardScreenKt$DashboardScreen$lambda$276$lambda$275$lambda$274$lambda$273$lambda$272$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i) {
                return dashboardScreenKt$DashboardScreen$lambda$276$lambda$275$lambda$274$lambda$273$lambda$272$$inlined$items$default$1.invoke(list2.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.screens.DashboardScreenKt$DashboardScreen$lambda$276$lambda$275$lambda$274$lambda$273$lambda$272$$inlined$items$default$4
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
                String str2;
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
                final Book book2 = (Book) list2.get(i);
                composer.startReplaceGroup(-335037952);
                ComposerKt.sourceInformation(composer, "C*1025@56510L24,1026@56588L2,1027@56644L1824,1019@56096L2406:DashboardScreen.kt#2thlc2");
                if (DashboardScreenKt.DashboardScreen$lambda$8(mutableState4) != null && book2.getLatitude() != null && book2.getLongitude() != null) {
                    float[] fArr = new float[1];
                    Location locationDashboardScreen$lambda$8 = DashboardScreenKt.DashboardScreen$lambda$8(mutableState4);
                    Intrinsics.checkNotNull(locationDashboardScreen$lambda$8);
                    double latitude = locationDashboardScreen$lambda$8.getLatitude();
                    Location locationDashboardScreen$lambda$9 = DashboardScreenKt.DashboardScreen$lambda$8(mutableState4);
                    Intrinsics.checkNotNull(locationDashboardScreen$lambda$9);
                    Location.distanceBetween(latitude, locationDashboardScreen$lambda$9.getLongitude(), book2.getLatitude().doubleValue(), book2.getLongitude().doubleValue(), fArr);
                    float f = fArr[0] / 1000.0f;
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    str2 = String.format("%.1f km away", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
                    Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                } else {
                    str2 = "";
                }
                String str3 = str2;
                boolean zIsBookOwner = DashboardScreenKt.isBookOwner(book2, str);
                String str4 = str;
                BookViewModel bookViewModel2 = bookViewModel;
                ComposerKt.sourceInformationMarkerStart(composer, -1119157549, "CC(remember):DashboardScreen.kt#9igjgp");
                boolean zChanged = composer.changed(function1) | composer.changedInstance(book2);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    final Function1 function3 = function1;
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.DashboardScreenKt$DashboardScreen$32$3$4$2$1$5$1$1
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m368invoke();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m368invoke() {
                            function3.invoke(book2.getId());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerStart(composer, -1119155075, "CC(remember):DashboardScreen.kt#9igjgp");
                DashboardScreenKt$DashboardScreen$32$3$4$2$1$5$2$1 dashboardScreenKt$DashboardScreen$32$3$4$2$1$5$2$1RememberedValue = composer.rememberedValue();
                if (dashboardScreenKt$DashboardScreen$32$3$4$2$1$5$2$1RememberedValue == Composer.Companion.getEmpty()) {
                    dashboardScreenKt$DashboardScreen$32$3$4$2$1$5$2$1RememberedValue = new Function1<String, Unit>() { // from class: com.example.ui.screens.DashboardScreenKt$DashboardScreen$32$3$4$2$1$5$2$1
                        public final void invoke(String str5) {
                            Intrinsics.checkNotNullParameter(str5, "it");
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((String) obj);
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(dashboardScreenKt$DashboardScreen$32$3$4$2$1$5$2$1RememberedValue);
                }
                Function1 function4 = (Function1) dashboardScreenKt$DashboardScreen$32$3$4$2$1$5$2$1RememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerStart(composer, -1119151461, "CC(remember):DashboardScreen.kt#9igjgp");
                boolean zChangedInstance = composer.changedInstance(bookViewModel);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    final BookViewModel bookViewModel3 = bookViewModel;
                    final MutableState mutableState15 = mutableState5;
                    final MutableState mutableState16 = mutableState6;
                    final MutableState mutableState17 = mutableState7;
                    final MutableState mutableState18 = mutableState8;
                    final MutableState mutableState19 = mutableState9;
                    final MutableState mutableState20 = mutableState10;
                    final MutableState mutableState21 = mutableState11;
                    final MutableState mutableState22 = mutableState12;
                    final MutableState mutableState23 = mutableState13;
                    final MutableState mutableState24 = mutableState14;
                    objRememberedValue2 = (Function2) new Function2<String, Book, Unit>() { // from class: com.example.ui.screens.DashboardScreenKt$DashboardScreen$32$3$4$2$1$5$3$1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((String) obj, (Book) obj2);
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                        public final void invoke(String str5, Book book3) {
                            Intrinsics.checkNotNullParameter(str5, "action");
                            Intrinsics.checkNotNullParameter(book3, "bookItem");
                            switch (str5.hashCode()) {
                                case -1881067216:
                                    if (!str5.equals("RETURN")) {
                                        return;
                                    }
                                    break;
                                case -1706593317:
                                    if (str5.equals("SHOW_HANDOVER_QR")) {
                                        mutableState15.setValue(book3);
                                        mutableState18.setValue("HANDOVER");
                                        DashboardScreenKt.DashboardScreen$lambda$72(mutableState19, true);
                                        return;
                                    }
                                    return;
                                case -1662854846:
                                    if (str5.equals("ACCEPT_TRANSFER")) {
                                        bookViewModel3.acceptTransfer(book3);
                                        return;
                                    }
                                    return;
                                case -1410781547:
                                    if (str5.equals("CANCEL_RETURN")) {
                                        bookViewModel3.cancelReturn(book3);
                                        return;
                                    }
                                    return;
                                case -787337814:
                                    if (str5.equals("CANCEL_REQUEST")) {
                                        bookViewModel3.cancelBorrowRequest(book3);
                                        return;
                                    }
                                    return;
                                case -503346302:
                                    if (str5.equals("ACCEPT_TRANSFER_VIEW")) {
                                        mutableState15.setValue(book3);
                                        DashboardScreenKt.DashboardScreen$lambda$66(mutableState16, true);
                                        return;
                                    }
                                    return;
                                case 253358158:
                                    if (str5.equals("SCAN_RETURN_QR")) {
                                        mutableState15.setValue(book3);
                                        mutableState20.setValue("RETURN");
                                        DashboardScreenKt.DashboardScreen$lambda$78(mutableState21, true);
                                        return;
                                    }
                                    return;
                                case 474095451:
                                    if (str5.equals("SCAN_HANDOVER_QR")) {
                                        mutableState15.setValue(book3);
                                        mutableState20.setValue("HANDOVER");
                                        DashboardScreenKt.DashboardScreen$lambda$78(mutableState21, true);
                                        return;
                                    }
                                    return;
                                case 541965997:
                                    if (!str5.equals("BORROWER_RETURN")) {
                                        return;
                                    }
                                    break;
                                case 784801219:
                                    if (str5.equals("HANDOVER")) {
                                        mutableState15.setValue(book3);
                                        DashboardScreenKt.DashboardScreen$lambda$63(mutableState17, true);
                                        return;
                                    }
                                    return;
                                case 1561102255:
                                    if (str5.equals("CONFIRM_RETURN")) {
                                        mutableState15.setValue(book3);
                                        mutableState23.setValue(book3.getCondition());
                                        DashboardScreenKt.DashboardScreen$lambda$60(mutableState24, true);
                                        return;
                                    }
                                    return;
                                case 1600808142:
                                    if (str5.equals("SHOW_RETURN_QR")) {
                                        mutableState15.setValue(book3);
                                        mutableState18.setValue("RETURN");
                                        DashboardScreenKt.DashboardScreen$lambda$72(mutableState19, true);
                                        return;
                                    }
                                    return;
                                case 1757763048:
                                    if (str5.equals("CANCEL_HANDOVER")) {
                                        bookViewModel3.cancelHandover(book3);
                                        return;
                                    }
                                    return;
                                case 1813675631:
                                    if (str5.equals("REQUEST")) {
                                        bookViewModel3.requestBook(book3);
                                        return;
                                    }
                                    return;
                                default:
                                    return;
                            }
                            mutableState15.setValue(book3);
                            DashboardScreenKt.DashboardScreen$lambda$69(mutableState22, true);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                DashboardScreenKt.BookCard(book2, zIsBookOwner, str4, bookViewModel2, str3, function0, function4, (Function2) objRememberedValue2, composer, 1572864);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$276$lambda$275$lambda$274$lambda$273$lambda$272$lambda$260(final MutableState mutableState, LazyItemScope lazyItemScope, Composer composer, int i) {
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$276$lambda$275$lambda$274$lambda$273$lambda$272$lambda$260$lambda$259$lambda$258(MutableState mutableState) {
        DashboardScreen$lambda$36(mutableState, true);
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$276$lambda$275$lambda$274$lambda$273$lambda$272$lambda$263(final Book book, final MutableState mutableState, LazyItemScope lazyItemScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(lazyItemScope, "$this$item");
        ComposerKt.sourceInformation(composer, "C998@54772L45,996@54623L236:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1168338784, i, -1, "com.example.ui.screens.DashboardScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:996)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, -1787101011, "CC(remember):DashboardScreen.kt#9igjgp");
            boolean zChangedInstance = composer.changedInstance(book);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda83
                    public final Object invoke() {
                        return DashboardScreenKt.DashboardScreen$lambda$276$lambda$275$lambda$274$lambda$273$lambda$272$lambda$263$lambda$262$lambda$261(book, mutableState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ReadingCompanionBanner(book, (Function0) objRememberedValue, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$276$lambda$275$lambda$274$lambda$273$lambda$272$lambda$263$lambda$262$lambda$261(Book book, MutableState mutableState) {
        mutableState.setValue(book);
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$276$lambda$275$lambda$274$lambda$273$lambda$272$lambda$266(List list, final MutableState mutableState, LazyItemScope lazyItemScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(lazyItemScope, "$this$item");
        ComposerKt.sourceInformation(composer, "C1006@55238L29,1004@55086L223:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1998902281, i, -1, "com.example.ui.screens.DashboardScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:1004)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, 1094716966, "CC(remember):DashboardScreen.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda6
                    public final Object invoke(Object obj) {
                        return DashboardScreenKt.DashboardScreen$lambda$276$lambda$275$lambda$274$lambda$273$lambda$272$lambda$266$lambda$265$lambda$264(mutableState, (Book) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            CuratedForYouSection(list, (Function1) objRememberedValue, composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$276$lambda$275$lambda$274$lambda$273$lambda$272$lambda$266$lambda$265$lambda$264(MutableState mutableState, Book book) {
        Intrinsics.checkNotNullParameter(book, "it");
        mutableState.setValue(book);
        return Unit.INSTANCE;
    }

    static final Object DashboardScreen$lambda$276$lambda$275$lambda$274$lambda$273$lambda$272$lambda$267(Book book) {
        Intrinsics.checkNotNullParameter(book, "it");
        return book.getId();
    }

    static final Unit DashboardScreen$lambda$278$lambda$277(MutableState mutableState) {
        mutableState.setValue(null);
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$280$lambda$279(Function1 function1, MutableState mutableState) {
        Book bookDashboardScreen$lambda$47 = DashboardScreen$lambda$47(mutableState);
        Intrinsics.checkNotNull(bookDashboardScreen$lambda$47);
        String id = bookDashboardScreen$lambda$47.getId();
        mutableState.setValue(null);
        function1.invoke(id);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    public static final void BookCard(final Book book, final boolean z, final String str, final BookViewModel bookViewModel, final String str2, final Function0<Unit> function0, final Function1<? super String, Unit> function1, final Function2<? super String, ? super Book, Unit> function2, Composer composer, final int i) {
        int i2;
        boolean z2;
        final MutableState mutableState;
        ?? r9;
        Intrinsics.checkNotNullParameter(book, "book");
        Intrinsics.checkNotNullParameter(str, "currentUser");
        Intrinsics.checkNotNullParameter(bookViewModel, "viewModel");
        Intrinsics.checkNotNullParameter(str2, "distanceStr");
        Intrinsics.checkNotNullParameter(function0, "onChatClick");
        Intrinsics.checkNotNullParameter(function1, "onOwnerClick");
        Intrinsics.checkNotNullParameter(function2, "onActionClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1654254872);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BookCard)P(!1,3!1,7!1,5,6)1080@59456L34,1099@59978L11,1101@60120L28,1103@60273L11,1103@60223L70,1104@60328L71,1105@60406L36878,1096@59868L37416:DashboardScreen.kt#2thlc2");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(book) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i2 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(bookViewModel) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 16384 : FragmentTransaction.TRANSIT_EXIT_MASK;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
        }
        if ((4793491 & i2) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1654254872, i2, -1, "com.example.ui.screens.BookCard (DashboardScreen.kt:1079)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 601041658, "CC(remember):DashboardScreen.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState2 = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (!BookCard$lambda$283(mutableState2)) {
                mutableState = mutableState2;
                r9 = 1;
                composerStartRestartGroup.startReplaceGroup(1393439818);
            } else {
                composerStartRestartGroup.startReplaceGroup(1452494291);
                ComposerKt.sourceInformation(composerStartRestartGroup, "1088@59702L29,1089@59759L87,1083@59529L327");
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 601049525, "CC(remember):DashboardScreen.kt#9igjgp");
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda12
                        public final Object invoke() {
                            return DashboardScreenKt.BookCard$lambda$286$lambda$285(mutableState2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function0 function3 = (Function0) objRememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 601051407, "CC(remember):DashboardScreen.kt#9igjgp");
                boolean z3 = (458752 & i2) == 131072;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda13
                        public final Object invoke() {
                            return DashboardScreenKt.BookCard$lambda$288$lambda$287(function0, mutableState2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                mutableState = mutableState2;
                r9 = 1;
                BookDetailsDialogKt.BookDetailsDialog(book, z2, str, bookViewModel, function3, (Function0) objRememberedValue3, composerStartRestartGroup, (i2 & 896) | (i2 & 14) | 24576 | (i2 & 112) | (i2 & 7168), 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierTestTag = TestTagKt.testTag(BorderKt.border-xT4_qwU(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, (int) r9, (Object) null), Dp.constructor-impl(1.0f), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOutlineVariant-0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(22.0f))), "book_card_" + book.getId());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 601062900, "CC(remember):DashboardScreen.kt#9igjgp");
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda14
                    public final Object invoke() {
                        return DashboardScreenKt.BookCard$lambda$290$lambda$289(mutableState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifier = ClickableKt.clickable-XHw0xAI$default(modifierTestTag, false, (String) null, (Role) null, (Function0) objRememberedValue4, 7, (Object) null);
            Shape shape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(22.0f));
            CardColors cardColors = CardDefaults.INSTANCE.elevatedCardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0L, 0L, composerStartRestartGroup, CardDefaults.$stable << 12, 14);
            CardElevation cardElevation = CardDefaults.INSTANCE.elevatedCardElevation-aqJV_2Y(Dp.constructor-impl(2.0f), Dp.constructor-impl(6.0f), 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, (CardDefaults.$stable << 18) | 54, 60);
            Function3 function3RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1948258669, (boolean) r9, new Function3() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda15
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return DashboardScreenKt.BookCard$lambda$372(book, str2, str, function0, bookViewModel, z, function1, function2, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composerStartRestartGroup, 54);
            composerStartRestartGroup = composerStartRestartGroup;
            CardKt.ElevatedCard(modifier, shape, cardColors, cardElevation, function3RememberComposableLambda, composerStartRestartGroup, 24576, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda16
                public final Object invoke(Object obj, Object obj2) {
                    return DashboardScreenKt.BookCard$lambda$373(book, z, str, bookViewModel, str2, function0, function1, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean BookCard$lambda$283(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void BookCard$lambda$284(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    static final Unit BookCard$lambda$286$lambda$285(MutableState mutableState) {
        BookCard$lambda$284(mutableState, false);
        return Unit.INSTANCE;
    }

    static final Unit BookCard$lambda$288$lambda$287(Function0 function0, MutableState mutableState) {
        BookCard$lambda$284(mutableState, false);
        function0.invoke();
        return Unit.INSTANCE;
    }

    static final Unit BookCard$lambda$290$lambda$289(MutableState mutableState) {
        BookCard$lambda$284(mutableState, true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:166:0x0a64  */
    /* JADX WARN: Code duplicated, block: B:171:0x0a93  */
    /* JADX WARN: Code duplicated, block: B:476:0x2182  */
    /* JADX WARN: Code duplicated, block: B:80:0x0414  */
    /* JADX WARN: Code duplicated, block: B:81:0x041e  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v62 */
    static final Unit BookCard$lambda$372(final Book book, String str, String str2, Function0 function0, final BookViewModel bookViewModel, boolean z, final Function1 function1, final Function2 function2, ColumnScope columnScope, Composer composer, int i) {
        String str3;
        BoxScope boxScope;
        String str4;
        Composer composer2;
        String str5;
        ?? r4;
        float f;
        long jColor;
        int i2;
        String str6;
        String str7;
        long jColor2;
        Intrinsics.checkNotNullParameter(columnScope, "$this$ElevatedCard");
        ComposerKt.sourceInformation(composer, "C1106@60416L10941,1326@71401L25877:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1948258669, i, -1, "com.example.ui.screens.BookCard.<anonymous> (DashboardScreen.kt:1106)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(16.0f));
            Arrangement.Horizontal horizontal = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(16.0f));
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontal, centerVertically, composer, 54);
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
            Updater.set-impl(composer3, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer3, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composer3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composer3.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.set-impl(composer3, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1750156461, "C1113@60666L2729,1171@63409L3488,1239@66911L4436:DashboardScreen.kt#2thlc2");
            Alignment topStart = Alignment.Companion.getTopStart();
            ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            Modifier modifier2 = Modifier.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(topStart, false);
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
            BoxScope boxScope2 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -2078275704, "C:DashboardScreen.kt#2thlc2");
            String imageUrl = book.getImageUrl();
            if (imageUrl == null || StringsKt.isBlank(imageUrl)) {
                str3 = "C101@5126L9:Row.kt#2w3rfo";
                boxScope = boxScope2;
                str4 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                composer.startReplaceGroup(-2077898280);
                ComposerKt.sourceInformation(composer, "1128@61404L11,1124@61191L645");
                Modifier modifier3 = BackgroundKt.background-bw27NRU$default(ClipKt.clip(SizeKt.size-VpY3zN4(Modifier.Companion, Dp.constructor-impl(68.0f), Dp.constructor-impl(100.0f)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(10.0f))), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), (Shape) null, 2, (Object) null);
                Alignment center = Alignment.Companion.getCenter();
                ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifier3);
                Function0 constructor3 = ComposeUiNode.Companion.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, str4);
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
                Updater.set-impl(composer5, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl(composer5, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composer5.getInserting() || !Intrinsics.areEqual(composer5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composer5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composer5.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.set-impl(composer5, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScope boxScope3 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, 1079475787, "C1135@61760L11,1131@61541L273:DashboardScreen.kt#2thlc2");
                IconKt.Icon-ww6aTOc(BookKt.getBook(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(28.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), composer, 432, 0);
                composer2 = composer;
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-2078309867);
                ComposerKt.sourceInformation(composer, "1115@60785L360");
                str4 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                str3 = "C101@5126L9:Row.kt#2w3rfo";
                boxScope = boxScope2;
                BookImageDisplayKt.BookImageDisplay(book.getImageUrl(), "Book Cover", ClipKt.clip(SizeKt.size-VpY3zN4(Modifier.Companion, Dp.constructor-impl(68.0f), Dp.constructor-impl(100.0f)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(10.0f))), ContentScale.Companion.getCrop(), null, composer, 3120, 16);
                composer2 = composer;
                composer2.endReplaceGroup();
            }
            if (book.getRentCount() > 0) {
                composer2.startReplaceGroup(-2077187233);
                ComposerKt.sourceInformation(composer2, "1141@62006L11,1143@62108L159,1140@61944L323");
                str5 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                r4 = 1;
                BadgeKt.Badge-eopBjH0(PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getTertiary-0d7_KjU(), 0L, ComposableLambdaKt.rememberComposableLambda(-1275436164, true, new Function3() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda93
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return DashboardScreenKt.BookCard$lambda$372$lambda$312$lambda$295$lambda$292(book, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, composer2, 54), composer, 3078, 4);
                composer2 = composer;
            } else {
                str5 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                r4 = 1;
                composer2.startReplaceGroup(-2138600155);
            }
            composer2.endReplaceGroup();
            String condition = book.getCondition();
            if (condition == null || StringsKt.isBlank(condition)) {
                f = 0.0f;
                composer2.startReplaceGroup(-2138600155);
            } else {
                composer2.startReplaceGroup(-2076726573);
                ComposerKt.sourceInformation(composer2, "1159@62951L412,1155@62701L662");
                final String condition2 = book.getCondition();
                String upperCase = condition2.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                switch (upperCase) {
                    case "NEW":
                        jColor2 = ColorKt.Color(4281236786L);
                        break;
                    case "FAIR":
                        jColor2 = ColorKt.Color(4293880832L);
                        break;
                    case "GOOD":
                        jColor2 = ColorKt.Color(4279592384L);
                        break;
                    case "MINT":
                        jColor2 = ColorKt.Color(4281236786L);
                        break;
                    default:
                        jColor2 = ColorKt.Color(4285887861L);
                        break;
                }
                f = 0.0f;
                SurfaceKt.Surface-T9BRK9s(boxScope.align(Modifier.Companion, Alignment.Companion.getBottomStart()), RoundedCornerShapeKt.RoundedCornerShape-a9UjIt4$default(0.0f, Dp.constructor-impl(6.0f), 0.0f, Dp.constructor-impl(8.0f), 5, (Object) null), Color.copy-wmQWz5c$default(jColor2, 0.9f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(52142763, (boolean) r4, new Function2() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda33
                    public final Object invoke(Object obj, Object obj2) {
                        return DashboardScreenKt.BookCard$lambda$372$lambda$312$lambda$295$lambda$294(condition2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer2, 54), composer, 12582912, 120);
                composer2 = composer;
            }
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.Companion, 1.0f, false, 2, (Object) null);
            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, 0);
            String str8 = str5;
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str8);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierWeight$default);
            Function0 constructor4 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str4);
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
            Updater.set-impl(composer6, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer6, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer6.getInserting() || !Intrinsics.areEqual(composer6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composer6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composer6.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.set-impl(composer6, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScope columnScope2 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, -1419842179, "C1172@63466L2528,1218@66011L40,1221@66164L10,1222@66229L11,1219@66068L326:DashboardScreen.kt#2thlc2");
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, f, (int) r4, (Object) null);
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical top = Alignment.Companion.getTop();
            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween, top, composer2, 54);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str8);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
            Function0 constructor5 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str4);
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
            Updater.set-impl(composer7, measurePolicyRowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer7, currentCompositionLocalMap5, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash5 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer7.getInserting() || !Intrinsics.areEqual(composer7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                composer7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                composer7.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
            }
            Updater.set-impl(composer7, modifierMaterializeModifier5, ComposeUiNode.Companion.getSetModifier());
            String str9 = str3;
            ComposerKt.sourceInformationMarkerStart(composer2, -407840262, str9);
            RowScope rowScope2 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, 1510285286, "C1179@63787L10,1181@63911L11,1177@63692L445,1187@64258L375,1195@64654L1322:DashboardScreen.kt#2thlc2");
            TextKt.Text--4IGK_g(book.getTitle(), RowScope.weight$default(rowScope2, Modifier.Companion, 1.0f, false, 2, (Object) null), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurface-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.getEllipsis-gIe3tQ8(), false, 2, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getTitleMedium(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 3120, 55256);
            final boolean zContains = book.getBookmarkedBy().contains(str2);
            final State stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(zContains ? 1.25f : 1.0f, AnimationSpecKt.spring$default(0.5f, 200.0f, (Object) null, 4, (Object) null), 0.0f, "BookmarkBounce", (Function1) null, composer, 3120, 20);
            Alignment.Vertical centerVertically2 = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier4 = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer, 48);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, str8);
            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer, modifier4);
            Function0 constructor6 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, str4);
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
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, str9);
            RowScope rowScope3 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1094355432, "C1196@64732L421,1204@65178L39,1205@65263L34,1205@65332L622,1205@65242L712:DashboardScreen.kt#2thlc2");
            SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(24.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -1073061065, "CC(remember):DashboardScreen.kt#9igjgp");
            boolean zChangedInstance = composer.changedInstance(bookViewModel) | composer.changedInstance(book);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda92
                    public final Object invoke() {
                        return DashboardScreenKt.BookCard$lambda$372$lambda$312$lambda$304$lambda$303$lambda$302$lambda$298$lambda$297(bookViewModel, book);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            IconButtonKt.IconButton((Function0) objRememberedValue, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(24.0f)), false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableLambdaKt.rememberComposableLambda(315892873, true, new Function2() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda94
                public final Object invoke(Object obj, Object obj2) {
                    return DashboardScreenKt.BookCard$lambda$372$lambda$312$lambda$304$lambda$303$lambda$302$lambda$301(zContains, stateAnimateFloatAsState, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 196656, 28);
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
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(3.0f)), composer, -407840262);
            TextKt.Text--4IGK_g("by " + book.getAuthor(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.getEllipsis-gIe3tQ8(), false, 1, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 0, 3120, 55290);
            Composer composer9 = composer;
            if (StringsKt.isBlank(str)) {
                composer9.startReplaceGroup(-1482907371);
            } else {
                composer9.startReplaceGroup(-1416982244);
                ComposerKt.sourceInformation(composer9, "1228@66464L40,1231@66627L10,1232@66695L11,1229@66525L340");
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer9, -407840262);
                TextKt.Text--4IGK_g("📍 " + str, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer9, MaterialTheme.$stable).getSecondary-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.getEllipsis-gIe3tQ8(), false, 1, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer9, MaterialTheme.$stable).getBodySmall(), composer, 0, 3120, 55290);
                composer9 = composer;
            }
            composer9.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer9);
            ComposerKt.sourceInformationMarkerEnd(composer9);
            composer9.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer9);
            ComposerKt.sourceInformationMarkerEnd(composer9);
            ComposerKt.sourceInformationMarkerEnd(composer9);
            Modifier modifier5 = SizeKt.widthIn-VpY3zN4$default(Modifier.Companion, 0.0f, Dp.constructor-impl(75.0f), 1, (Object) null);
            Alignment.Horizontal end = Alignment.Companion.getEnd();
            Arrangement.Vertical vertical = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(6.0f));
            ComposerKt.sourceInformationMarkerStart(composer9, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(vertical, end, composer9, 54);
            ComposerKt.sourceInformationMarkerStart(composer9, -1323940314, str2);
            int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer9, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composer9.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer9, modifier5);
            Function0 constructor7 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer9, -692256719, str4);
            if (!(composer9.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer9.startReusableNode();
            if (composer9.getInserting()) {
                composer9.createNode(constructor7);
            } else {
                composer9.useNode();
            }
            Composer composer10 = Updater.constructor-impl(composer9);
            Updater.set-impl(composer10, measurePolicyColumnMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer10, currentCompositionLocalMap7, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash7 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer10.getInserting() || !Intrinsics.areEqual(composer10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                composer10.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                composer10.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
            }
            Updater.set-impl(composer10, modifierMaterializeModifier7, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer9, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScope columnScope3 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer9, 1717875876, "C1272@68302L493,1269@68181L614,1287@69074L32,1285@68951L2382:DashboardScreen.kt#2thlc2");
            switch (book.getStatus()) {
                case "PENDING_RETURN":
                    composer9.startReplaceGroup(332514261);
                    composer9.endReplaceGroup();
                    jColor = ColorKt.Color(4285143962L);
                    break;
                case "PENDING_RECEIPT":
                    composer9.startReplaceGroup(332512405);
                    composer9.endReplaceGroup();
                    jColor = ColorKt.Color(4278356177L);
                    break;
                case "BORROWED":
                    composer9.startReplaceGroup(332515925);
                    composer9.endReplaceGroup();
                    jColor = ColorKt.Color(4290910299L);
                    break;
                case "PENDING_TRANSFER":
                    composer9.startReplaceGroup(332512405);
                    composer9.endReplaceGroup();
                    jColor = ColorKt.Color(4278356177L);
                    break;
                case "REQUESTED":
                    composer9.startReplaceGroup(332509877);
                    composer9.endReplaceGroup();
                    jColor = ColorKt.Color(4293284096L);
                    break;
                case "AVAILABLE":
                    composer9.startReplaceGroup(332508181);
                    composer9.endReplaceGroup();
                    jColor = ColorKt.Color(4281236786L);
                    break;
                default:
                    composer9.startReplaceGroup(332518219);
                    ComposerKt.sourceInformation(composer9, "1252@67521L11");
                    jColor = MaterialTheme.INSTANCE.getColorScheme(composer9, MaterialTheme.$stable).getOutline-0d7_KjU();
                    composer9.endReplaceGroup();
                    break;
            }
            long j = jColor;
            String status = book.getStatus();
            final String status2 = Intrinsics.areEqual(status, "PENDING_RECEIPT") ? "Transferring" : Intrinsics.areEqual(status, "PENDING_RETURN") ? "Return Pending" : book.getStatus();
            if (z) {
                composer9.startReplaceGroup(1718419553);
                ComposerKt.sourceInformation(composer9, "1262@67882L33,1261@67836L309");
                ComposerKt.sourceInformationMarkerStart(composer9, 332529413, "CC(remember):DashboardScreen.kt#9igjgp");
                boolean zChangedInstance2 = composer9.changedInstance(bookViewModel) | composer9.changedInstance(book);
                Object objRememberedValue2 = composer9.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda95
                        public final Object invoke() {
                            return DashboardScreenKt.BookCard$lambda$372$lambda$312$lambda$311$lambda$306$lambda$305(bookViewModel, book);
                        }
                    };
                    composer9.updateRememberedValue(objRememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(composer9);
                i2 = -483455358;
                IconButtonKt.IconButton((Function0) objRememberedValue2, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(24.0f)), false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.getLambda$824727388$app(), composer, 196656, 28);
                composer9 = composer;
            } else {
                i2 = -483455358;
                composer9.startReplaceGroup(1651136254);
            }
            composer9.endReplaceGroup();
            SurfaceKt.Surface-T9BRK9s((Modifier) null, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), j, 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(2055934591, true, new Function2() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda96
                public final Object invoke(Object obj, Object obj2) {
                    return DashboardScreenKt.BookCard$lambda$372$lambda$312$lambda$311$lambda$307(status2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer9, 54), composer, 12582912, 121);
            Composer composer11 = composer;
            String ownerDisplayName = !StringsKt.isBlank(book.getOwnerDisplayName()) ? book.getOwnerDisplayName() : StringsKt.substringBefore$default(book.getOwnerName(), "@", (String) null, 2, (Object) null);
            Alignment.Vertical centerVertically3 = Alignment.Companion.getCenterVertically();
            Modifier modifier6 = Modifier.Companion;
            ComposerKt.sourceInformationMarkerStart(composer11, 332567556, "CC(remember):DashboardScreen.kt#9igjgp");
            boolean zChanged = composer11.changed(function1) | composer11.changedInstance(book);
            Object objRememberedValue3 = composer11.rememberedValue();
            if (zChanged || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda97
                    public final Object invoke() {
                        return DashboardScreenKt.BookCard$lambda$372$lambda$312$lambda$311$lambda$309$lambda$308(function1, book);
                    }
                };
                composer11.updateRememberedValue(objRememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(composer11);
            Modifier modifier7 = PaddingKt.padding-qDBjuR0$default(ClickableKt.clickable-XHw0xAI$default(modifier6, false, (String) null, (Role) null, (Function0) objRememberedValue3, 7, (Object) null), 0.0f, Dp.constructor-impl(2.0f), 0.0f, 0.0f, 13, (Object) null);
            ComposerKt.sourceInformationMarkerStart(composer11, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3, composer11, 48);
            ComposerKt.sourceInformationMarkerStart(composer11, -1323940314, str2);
            int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer11, 0);
            CompositionLocalMap currentCompositionLocalMap8 = composer11.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer11, modifier7);
            Function0 constructor8 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer11, -692256719, str4);
            if (!(composer11.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer11.startReusableNode();
            if (composer11.getInserting()) {
                composer11.createNode(constructor8);
            } else {
                composer11.useNode();
            }
            Composer composer12 = Updater.constructor-impl(composer11);
            Updater.set-impl(composer12, measurePolicyRowMeasurePolicy4, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer12, currentCompositionLocalMap8, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash8 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer12.getInserting() || !Intrinsics.areEqual(composer12.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                composer12.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                composer12.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
            }
            Updater.set-impl(composer12, modifierMaterializeModifier8, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer11, -407840262, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            RowScope rowScope4 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer11, 101686423, "C1315@71023L10,1316@71091L11,1313@70902L413:DashboardScreen.kt#2thlc2");
            if (book.getOwnerProfilePicUrl() == null || StringsKt.isBlank(book.getOwnerProfilePicUrl())) {
                str6 = "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo";
                str7 = "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo";
                composer11.startReplaceGroup(103089482);
                ComposerKt.sourceInformation(composer11, "1310@70775L11,1310@70667L128,1311@70820L39");
                IconKt.Icon-ww6aTOc(PersonKt.getPerson(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(20.0f)), MaterialTheme.INSTANCE.getColorScheme(composer11, MaterialTheme.$stable).getOutline-0d7_KjU(), composer, 432, 0);
                composer11 = composer;
                SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer11, 6);
                composer11.endReplaceGroup();
            } else {
                composer11.startReplaceGroup(101739339);
                ComposerKt.sourceInformation(composer11, "1308@70574L39");
                if (StringsKt.startsWith$default(book.getOwnerProfilePicUrl(), "http", false, 2, (Object) null)) {
                    composer11.startReplaceGroup(101782460);
                    ComposerKt.sourceInformation(composer11, "1291@69348L358");
                    str7 = "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo";
                    str6 = "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo";
                    SingletonAsyncImageKt.m108AsyncImagegl8XCv8(book.getOwnerProfilePicUrl(), "Owner Profile", ClipKt.clip(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(24.0f)), RoundedCornerShapeKt.getCircleShape()), null, null, null, ContentScale.Companion.getCrop(), 0.0f, null, 0, false, null, composer, 1572912, 0, 4024);
                    composer11 = composer;
                    composer11.endReplaceGroup();
                } else {
                    str6 = "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo";
                    str7 = "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo";
                    if (StringsKt.startsWith$default(book.getOwnerProfilePicUrl(), "data:image/jpeg;base64,", false, 2, (Object) null)) {
                        composer11.startReplaceGroup(102275794);
                        ComposerKt.sourceInformation(composer11, "1301@70170L353");
                        byte[] bArrDecode = Base64.decode(StringsKt.removePrefix(book.getOwnerProfilePicUrl(), "data:image/jpeg;base64,"), 0);
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                        Intrinsics.checkNotNull(bitmapDecodeByteArray);
                        ImageKt.Image-5h-nEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmapDecodeByteArray), "Owner Profile", ClipKt.clip(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(24.0f)), RoundedCornerShapeKt.getCircleShape()), (Alignment) null, ContentScale.Companion.getCrop(), 0.0f, (ColorFilter) null, 0, composer, 24624, 232);
                        composer11 = composer;
                    } else {
                        composer11.startReplaceGroup(33005178);
                    }
                    composer11.endReplaceGroup();
                }
                SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer11, 6);
                composer11.endReplaceGroup();
            }
            if (z) {
                ownerDisplayName = "You";
            }
            TextKt.Text--4IGK_g(ownerDisplayName, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer11, MaterialTheme.$stable).getOutline-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.getEllipsis-gIe3tQ8(), false, 1, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer11, MaterialTheme.$stable).getBodySmall(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 3120, 55258);
            Composer composer13 = composer;
            ComposerKt.sourceInformationMarkerEnd(composer13);
            ComposerKt.sourceInformationMarkerEnd(composer13);
            composer13.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer13);
            ComposerKt.sourceInformationMarkerEnd(composer13);
            ComposerKt.sourceInformationMarkerEnd(composer13);
            ComposerKt.sourceInformationMarkerEnd(composer13);
            ComposerKt.sourceInformationMarkerEnd(composer13);
            composer13.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer13);
            ComposerKt.sourceInformationMarkerEnd(composer13);
            ComposerKt.sourceInformationMarkerEnd(composer13);
            ComposerKt.sourceInformationMarkerEnd(composer13);
            ComposerKt.sourceInformationMarkerEnd(composer13);
            composer13.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer13);
            ComposerKt.sourceInformationMarkerEnd(composer13);
            ComposerKt.sourceInformationMarkerEnd(composer13);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(16.0f), Dp.constructor-impl(8.0f)), 0.0f, 1, (Object) null);
            ComposerKt.sourceInformationMarkerStart(composer13, i2, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer13, 0);
            ComposerKt.sourceInformationMarkerStart(composer13, -1323940314, str2);
            int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer13, 0);
            CompositionLocalMap currentCompositionLocalMap9 = composer13.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer13, modifierFillMaxWidth$default2);
            Function0 constructor9 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer13, -692256719, str4);
            if (!(composer13.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer13.startReusableNode();
            if (composer13.getInserting()) {
                composer13.createNode(constructor9);
            } else {
                composer13.useNode();
            }
            Composer composer14 = Updater.constructor-impl(composer13);
            Updater.set-impl(composer14, measurePolicyColumnMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer14, currentCompositionLocalMap9, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash9 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer14.getInserting() || !Intrinsics.areEqual(composer14.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                composer14.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
                composer14.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash9);
            }
            Updater.set-impl(composer14, modifierMaterializeModifier9, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer13, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScope columnScope4 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer13, 431435413, "C:DashboardScreen.kt#2thlc2");
            String status3 = book.getStatus();
            switch (status3.hashCode()) {
                case -1710271240:
                    String str10 = str6;
                    String str11 = str7;
                    if (status3.equals("PENDING_RETURN")) {
                        composer13.startReplaceGroup(448094874);
                        ComposerKt.sourceInformation(composer13, "");
                        if (z) {
                            composer13.startReplaceGroup(448003734);
                            ComposerKt.sourceInformation(composer13, "1599@88959L11,1602@89186L2016,1598@88900L2302,1633@91227L1980");
                            SurfaceKt.Surface-T9BRK9s(PaddingKt.padding-VpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), 0.0f, Dp.constructor-impl(4.0f), 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer13, MaterialTheme.$stable).getTertiaryContainer-0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(985785372, true, new Function2() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda55
                                public final Object invoke(Object obj, Object obj2) {
                                    return DashboardScreenKt.BookCard$lambda$372$lambda$371$lambda$354(book, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            }, composer13, 54), composer, 12582918, 120);
                            Modifier modifier8 = PaddingKt.padding-qDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), 0.0f, Dp.constructor-impl(4.0f), 0.0f, 0.0f, 13, (Object) null);
                            Arrangement.Horizontal horizontal2 = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(6.0f));
                            ComposerKt.sourceInformationMarkerStart(composer, 693286680, str11);
                            MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(horizontal2, Alignment.Companion.getTop(), composer, 6);
                            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, str2);
                            int currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap10 = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer, modifier8);
                            Function0 constructor10 = ComposeUiNode.Companion.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer, -692256719, str4);
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
                            Updater.set-impl(composer15, measurePolicyRowMeasurePolicy5, ComposeUiNode.Companion.getSetMeasurePolicy());
                            Updater.set-impl(composer15, currentCompositionLocalMap10, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                            Function2 setCompositeKeyHash10 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                            if (composer15.getInserting() || !Intrinsics.areEqual(composer15.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                                composer15.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash10));
                                composer15.apply(Integer.valueOf(currentCompositeKeyHash10), setCompositeKeyHash10);
                            }
                            Updater.set-impl(composer15, modifierMaterializeModifier10, ComposeUiNode.Companion.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer, -407840262, str10);
                            RowScope rowScope5 = RowScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer, -618097366, "C1636@91563L11,1636@91519L65,1635@91419L41,1634@91369L626,1644@92082L41,1643@92024L516,1653@92719L48,1652@92619L41,1651@92569L612:DashboardScreen.kt#2thlc2");
                            ButtonColors buttonColors = ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getTertiary-0d7_KjU(), 0L, 0L, 0L, composer, ButtonDefaults.$stable << 12, 14);
                            Modifier modifierWeight$default2 = RowScope.weight$default(rowScope5, Modifier.Companion, 1.0f, false, 2, (Object) null);
                            ComposerKt.sourceInformationMarkerStart(composer, 1919723854, "CC(remember):DashboardScreen.kt#9igjgp");
                            boolean zChanged2 = composer.changed(function2) | composer.changedInstance(book);
                            Object objRememberedValue4 = composer.rememberedValue();
                            if (zChanged2 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                                objRememberedValue4 = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda66
                                    public final Object invoke() {
                                        return DashboardScreenKt.BookCard$lambda$372$lambda$371$lambda$361$lambda$356$lambda$355(function2, book);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue4);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ButtonKt.Button((Function0) objRememberedValue4, modifierWeight$default2, false, (Shape) null, buttonColors, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.getLambda$1588901973$app(), composer, 805306368, 492);
                            ComposerKt.sourceInformationMarkerStart(composer, 1919745070, "CC(remember):DashboardScreen.kt#9igjgp");
                            boolean zChanged3 = composer.changed(function2) | composer.changedInstance(book);
                            Object objRememberedValue5 = composer.rememberedValue();
                            if (zChanged3 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                                objRememberedValue5 = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda77
                                    public final Object invoke() {
                                        return DashboardScreenKt.BookCard$lambda$372$lambda$371$lambda$361$lambda$358$lambda$357(function2, book);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue5);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ButtonKt.OutlinedButton((Function0) objRememberedValue5, RowScope.weight$default(rowScope5, Modifier.Companion, 1.0f, false, 2, (Object) null), false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.getLambda$368502359$app(), composer, 805306368, 508);
                            ButtonColors buttonColors2 = ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(ColorKt.Color(4279994175L), 0L, 0L, 0L, composer, (ButtonDefaults.$stable << 12) | 6, 14);
                            composer13 = composer;
                            Modifier modifierWeight$default3 = RowScope.weight$default(rowScope5, Modifier.Companion, 1.0f, false, 2, (Object) null);
                            ComposerKt.sourceInformationMarkerStart(composer13, 1919762254, "CC(remember):DashboardScreen.kt#9igjgp");
                            boolean zChanged4 = composer13.changed(function2) | composer13.changedInstance(book);
                            Object objRememberedValue6 = composer13.rememberedValue();
                            if (zChanged4 || objRememberedValue6 == Composer.Companion.getEmpty()) {
                                objRememberedValue6 = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda88
                                    public final Object invoke() {
                                        return DashboardScreenKt.BookCard$lambda$372$lambda$371$lambda$361$lambda$360$lambda$359(function2, book);
                                    }
                                };
                                composer13.updateRememberedValue(objRememberedValue6);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer13);
                            ButtonKt.Button((Function0) objRememberedValue6, modifierWeight$default3, false, (Shape) null, buttonColors2, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.m314getLambda$972872756$app(), composer13, 805306368, 492);
                            ComposerKt.sourceInformationMarkerEnd(composer13);
                            ComposerKt.sourceInformationMarkerEnd(composer13);
                            composer13.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer13);
                            ComposerKt.sourceInformationMarkerEnd(composer13);
                            ComposerKt.sourceInformationMarkerEnd(composer13);
                            composer13.endReplaceGroup();
                        } else {
                            if (Intrinsics.areEqual(book.getBorrowerName(), str2)) {
                                composer13.startReplaceGroup(452355390);
                                ComposerKt.sourceInformation(composer13, "1663@93358L11,1666@93563L3651,1662@93299L3915");
                                SurfaceKt.Surface-T9BRK9s(PaddingKt.padding-VpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), 0.0f, Dp.constructor-impl(4.0f), 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), MaterialTheme.INSTANCE.getColorScheme(composer13, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(14449221, true, new Function2() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda91
                                    public final Object invoke(Object obj, Object obj2) {
                                        return DashboardScreenKt.BookCard$lambda$372$lambda$371$lambda$370(book, function2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                }, composer13, 54), composer13, 12582918, 120);
                            } else {
                                composer13.startReplaceGroup(359704729);
                            }
                            composer13.endReplaceGroup();
                        }
                    } else {
                        composer13.startReplaceGroup(359704729);
                    }
                    composer13.endReplaceGroup();
                    Unit unit = Unit.INSTANCE;
                    break;
                case -1494985904:
                    String str12 = str6;
                    String str13 = str7;
                    if (!status3.equals("PENDING_RECEIPT")) {
                        composer13.startReplaceGroup(359704729);
                        composer13.endReplaceGroup();
                        Unit unit2 = Unit.INSTANCE;
                    } else {
                        composer13.startReplaceGroup(441094640);
                        ComposerKt.sourceInformation(composer13, "");
                        if (z || !Intrinsics.areEqual(book.getRequestedByName(), str2)) {
                            if (z) {
                                composer13.startReplaceGroup(445842383);
                                ComposerKt.sourceInformation(composer13, "1566@86818L1210");
                                Modifier modifier9 = PaddingKt.padding-qDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), 0.0f, Dp.constructor-impl(4.0f), 0.0f, 0.0f, 13, (Object) null);
                                Arrangement.Horizontal horizontal3 = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(8.0f));
                                ComposerKt.sourceInformationMarkerStart(composer13, 693286680, str13);
                                MeasurePolicy measurePolicyRowMeasurePolicy6 = RowKt.rowMeasurePolicy(horizontal3, Alignment.Companion.getTop(), composer13, 6);
                                ComposerKt.sourceInformationMarkerStart(composer13, -1323940314, str2);
                                int currentCompositeKeyHash11 = ComposablesKt.getCurrentCompositeKeyHash(composer13, 0);
                                CompositionLocalMap currentCompositionLocalMap11 = composer13.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composer13, modifier9);
                                Function0 constructor11 = ComposeUiNode.Companion.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer13, -692256719, str4);
                                if (!(composer13.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer13.startReusableNode();
                                if (composer13.getInserting()) {
                                    composer13.createNode(constructor11);
                                } else {
                                    composer13.useNode();
                                }
                                Composer composer16 = Updater.constructor-impl(composer13);
                                Updater.set-impl(composer16, measurePolicyRowMeasurePolicy6, ComposeUiNode.Companion.getSetMeasurePolicy());
                                Updater.set-impl(composer16, currentCompositionLocalMap11, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                Function2 setCompositeKeyHash11 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                if (composer16.getInserting() || !Intrinsics.areEqual(composer16.rememberedValue(), Integer.valueOf(currentCompositeKeyHash11))) {
                                    composer16.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash11));
                                    composer16.apply(Integer.valueOf(currentCompositeKeyHash11), setCompositeKeyHash11);
                                }
                                Updater.set-impl(composer16, modifierMaterializeModifier11, ComposeUiNode.Companion.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer13, -407840262, str12);
                                RowScope rowScope6 = RowScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer13, -804957215, "C1567@86977L43,1567@86960L461,1573@87508L42,1576@87789L11,1576@87739L68,1572@87450L552:DashboardScreen.kt#2thlc2");
                                ComposerKt.sourceInformationMarkerStart(composer13, -164514149, "CC(remember):DashboardScreen.kt#9igjgp");
                                boolean zChanged5 = composer13.changed(function2) | composer13.changedInstance(book);
                                Object objRememberedValue7 = composer13.rememberedValue();
                                if (zChanged5 || objRememberedValue7 == Composer.Companion.getEmpty()) {
                                    objRememberedValue7 = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda11
                                        public final Object invoke() {
                                            return DashboardScreenKt.BookCard$lambda$372$lambda$371$lambda$349$lambda$346$lambda$345(function2, book);
                                        }
                                    };
                                    composer13.updateRememberedValue(objRememberedValue7);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer13);
                                ButtonKt.Button((Function0) objRememberedValue7, RowScope.weight$default(rowScope6, Modifier.Companion, 1.5f, false, 2, (Object) null), false, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.getLambda$922741888$app(), composer, 805306368, 500);
                                ComposerKt.sourceInformationMarkerStart(composer, -164497158, "CC(remember):DashboardScreen.kt#9igjgp");
                                boolean zChanged6 = composer.changed(function2) | composer.changedInstance(book);
                                Object objRememberedValue8 = composer.rememberedValue();
                                if (zChanged6 || objRememberedValue8 == Composer.Companion.getEmpty()) {
                                    objRememberedValue8 = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda22
                                        public final Object invoke() {
                                            return DashboardScreenKt.BookCard$lambda$372$lambda$371$lambda$349$lambda$348$lambda$347(function2, book);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue8);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                composer13 = composer;
                                ButtonKt.OutlinedButton((Function0) objRememberedValue8, RowScope.weight$default(rowScope6, Modifier.Companion, 1.0f, false, 2, (Object) null), false, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), ButtonDefaults.INSTANCE.outlinedButtonColors-ro_MJ88(0L, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU(), 0L, 0L, composer, ButtonDefaults.$stable << 12, 13), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.getLambda$644784642$app(), composer13, 805306368, 484);
                                ComposerKt.sourceInformationMarkerEnd(composer13);
                                ComposerKt.sourceInformationMarkerEnd(composer13);
                                composer13.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer13);
                                ComposerKt.sourceInformationMarkerEnd(composer13);
                                ComposerKt.sourceInformationMarkerEnd(composer13);
                            } else {
                                composer13.startReplaceGroup(359704729);
                            }
                            composer13.endReplaceGroup();
                        } else {
                            composer13.startReplaceGroup(441126570);
                            ComposerKt.sourceInformation(composer13, "1499@82011L11,1500@82098L11,1503@82307L2226,1498@81952L2581,1538@84558L2193");
                            SurfaceKt.Surface-T9BRK9s(PaddingKt.padding-VpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), 0.0f, Dp.constructor-impl(4.0f), 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), MaterialTheme.INSTANCE.getColorScheme(composer13, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), MaterialTheme.INSTANCE.getColorScheme(composer13, MaterialTheme.$stable).getOnPrimaryContainer-0d7_KjU(), 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(2119609438, true, new Function2() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda148
                                public final Object invoke(Object obj, Object obj2) {
                                    return DashboardScreenKt.BookCard$lambda$372$lambda$371$lambda$337(book, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            }, composer13, 54), composer, 12582918, 112);
                            Modifier modifier10 = PaddingKt.padding-qDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), 0.0f, Dp.constructor-impl(4.0f), 0.0f, 0.0f, 13, (Object) null);
                            Arrangement.Horizontal horizontal4 = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(6.0f));
                            ComposerKt.sourceInformationMarkerStart(composer, 693286680, str13);
                            MeasurePolicy measurePolicyRowMeasurePolicy7 = RowKt.rowMeasurePolicy(horizontal4, Alignment.Companion.getTop(), composer, 6);
                            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, str2);
                            int currentCompositeKeyHash12 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap12 = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier12 = ComposedModifierKt.materializeModifier(composer, modifier10);
                            Function0 constructor12 = ComposeUiNode.Companion.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer, -692256719, str4);
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
                            ComposerKt.sourceInformationMarkerStart(composer, -407840262, str12);
                            RowScope rowScope7 = RowScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer, 1511843699, "C1539@84717L43,1539@84700L523,1545@85302L42,1548@85536L48,1544@85252L790,1556@86129L42,1559@86412L11,1559@86362L68,1555@86071L654:DashboardScreen.kt#2thlc2");
                            ComposerKt.sourceInformationMarkerStart(composer, 602957042, "CC(remember):DashboardScreen.kt#9igjgp");
                            boolean zChanged7 = composer.changed(function2) | composer.changedInstance(book);
                            Object objRememberedValue9 = composer.rememberedValue();
                            if (zChanged7 || objRememberedValue9 == Composer.Companion.getEmpty()) {
                                objRememberedValue9 = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda159
                                    public final Object invoke() {
                                        return DashboardScreenKt.BookCard$lambda$372$lambda$371$lambda$344$lambda$339$lambda$338(function2, book);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue9);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ButtonKt.Button((Function0) objRememberedValue9, RowScope.weight$default(rowScope7, Modifier.Companion, 1.1f, false, 2, (Object) null), false, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, PaddingKt.PaddingValues-YgX7TsA(Dp.constructor-impl(6.0f), Dp.constructor-impl(6.0f)), (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.m285getLambda$1572241257$app(), composer, 817889280, 372);
                            ComposerKt.sourceInformationMarkerStart(composer, 602975761, "CC(remember):DashboardScreen.kt#9igjgp");
                            boolean zChanged8 = composer.changed(function2) | composer.changedInstance(book);
                            Object objRememberedValue10 = composer.rememberedValue();
                            if (zChanged8 || objRememberedValue10 == Composer.Companion.getEmpty()) {
                                objRememberedValue10 = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda170
                                    public final Object invoke() {
                                        return DashboardScreenKt.BookCard$lambda$372$lambda$371$lambda$344$lambda$341$lambda$340(function2, book);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue10);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ButtonKt.Button((Function0) objRememberedValue10, RowScope.weight$default(rowScope7, Modifier.Companion, 1.1f, false, 2, (Object) null), false, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(ColorKt.Color(4279994175L), 0L, 0L, 0L, composer, (ButtonDefaults.$stable << 12) | 6, 14), (ButtonElevation) null, (BorderStroke) null, PaddingKt.PaddingValues-YgX7TsA(Dp.constructor-impl(6.0f), Dp.constructor-impl(6.0f)), (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.getLambda$160951310$app(), composer, 817889280, 356);
                            ComposerKt.sourceInformationMarkerStart(composer, 603002225, "CC(remember):DashboardScreen.kt#9igjgp");
                            boolean zChanged9 = composer.changed(function2) | composer.changedInstance(book);
                            Object objRememberedValue11 = composer.rememberedValue();
                            if (zChanged9 || objRememberedValue11 == Composer.Companion.getEmpty()) {
                                objRememberedValue11 = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda181
                                    public final Object invoke() {
                                        return DashboardScreenKt.BookCard$lambda$372$lambda$371$lambda$344$lambda$343$lambda$342(function2, book);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue11);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            composer13 = composer;
                            ButtonKt.OutlinedButton((Function0) objRememberedValue11, RowScope.weight$default(rowScope7, Modifier.Companion, 0.8f, false, 2, (Object) null), false, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), ButtonDefaults.INSTANCE.outlinedButtonColors-ro_MJ88(0L, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU(), 0L, 0L, composer, ButtonDefaults.$stable << 12, 13), (ButtonElevation) null, (BorderStroke) null, PaddingKt.PaddingValues-YgX7TsA(Dp.constructor-impl(6.0f), Dp.constructor-impl(6.0f)), (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.getLambda$1502326425$app(), composer13, 817889280, 356);
                            ComposerKt.sourceInformationMarkerEnd(composer13);
                            ComposerKt.sourceInformationMarkerEnd(composer13);
                            composer13.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer13);
                            ComposerKt.sourceInformationMarkerEnd(composer13);
                            ComposerKt.sourceInformationMarkerEnd(composer13);
                            composer13.endReplaceGroup();
                        }
                        composer13.endReplaceGroup();
                        Unit unit3 = Unit.INSTANCE;
                    }
                    break;
                case -1414529708:
                    if (!status3.equals("BORROWED")) {
                        composer13.startReplaceGroup(359704729);
                        composer13.endReplaceGroup();
                        Unit unit4 = Unit.INSTANCE;
                    } else {
                        composer13.startReplaceGroup(447121722);
                        ComposerKt.sourceInformation(composer13, "");
                        if (z || !Intrinsics.areEqual(book.getBorrowerName(), str2)) {
                            composer13.startReplaceGroup(359704729);
                        } else {
                            composer13.startReplaceGroup(447190356);
                            ComposerKt.sourceInformation(composer13, "1587@88384L11,1587@88340L65,1586@88243L42,1585@88197L565");
                            ButtonColors buttonColors3 = ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer13, MaterialTheme.$stable).getTertiary-0d7_KjU(), 0L, 0L, 0L, composer, ButtonDefaults.$stable << 12, 14);
                            composer13 = composer;
                            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
                            ComposerKt.sourceInformationMarkerStart(composer13, -1371046093, "CC(remember):DashboardScreen.kt#9igjgp");
                            boolean zChanged10 = composer13.changed(function2) | composer13.changedInstance(book);
                            Object objRememberedValue12 = composer13.rememberedValue();
                            if (zChanged10 || objRememberedValue12 == Composer.Companion.getEmpty()) {
                                objRememberedValue12 = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda44
                                    public final Object invoke() {
                                        return DashboardScreenKt.BookCard$lambda$372$lambda$371$lambda$351$lambda$350(function2, book);
                                    }
                                };
                                composer13.updateRememberedValue(objRememberedValue12);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer13);
                            ButtonKt.Button((Function0) objRememberedValue12, modifierFillMaxWidth$default3, false, (Shape) null, buttonColors3, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.getLambda$1221080082$app(), composer13, 805306416, 492);
                        }
                        composer13.endReplaceGroup();
                        composer13.endReplaceGroup();
                        Unit unit5 = Unit.INSTANCE;
                    }
                    break;
                case -1305282125:
                    String str14 = str6;
                    String str15 = str7;
                    if (!status3.equals("PENDING_TRANSFER")) {
                        composer13.startReplaceGroup(359704729);
                        composer13.endReplaceGroup();
                        Unit unit6 = Unit.INSTANCE;
                    } else {
                        composer13.startReplaceGroup(438038877);
                        ComposerKt.sourceInformation(composer13, "");
                        if (z) {
                            composer13.startReplaceGroup(438018479);
                            ComposerKt.sourceInformation(composer13, "1453@78934L1114");
                            Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
                            Arrangement.Horizontal horizontal5 = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(8.0f));
                            ComposerKt.sourceInformationMarkerStart(composer13, 693286680, str15);
                            MeasurePolicy measurePolicyRowMeasurePolicy8 = RowKt.rowMeasurePolicy(horizontal5, Alignment.Companion.getTop(), composer13, 6);
                            ComposerKt.sourceInformationMarkerStart(composer13, -1323940314, str2);
                            int currentCompositeKeyHash13 = ComposablesKt.getCurrentCompositeKeyHash(composer13, 0);
                            CompositionLocalMap currentCompositionLocalMap13 = composer13.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier13 = ComposedModifierKt.materializeModifier(composer13, modifierFillMaxWidth$default4);
                            Function0 constructor13 = ComposeUiNode.Companion.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer13, -692256719, str4);
                            if (!(composer13.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer13.startReusableNode();
                            if (composer13.getInserting()) {
                                composer13.createNode(constructor13);
                            } else {
                                composer13.useNode();
                            }
                            Composer composer18 = Updater.constructor-impl(composer13);
                            Updater.set-impl(composer18, measurePolicyRowMeasurePolicy8, ComposeUiNode.Companion.getSetMeasurePolicy());
                            Updater.set-impl(composer18, currentCompositionLocalMap13, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                            Function2 setCompositeKeyHash13 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                            if (composer18.getInserting() || !Intrinsics.areEqual(composer18.rememberedValue(), Integer.valueOf(currentCompositeKeyHash13))) {
                                composer18.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash13));
                                composer18.apply(Integer.valueOf(currentCompositeKeyHash13), setCompositeKeyHash13);
                            }
                            Updater.set-impl(composer18, modifierMaterializeModifier13, ComposeUiNode.Companion.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer13, -407840262, str14);
                            RowScope rowScope8 = RowScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer13, -1718189195, "C1454@79073L35,1454@79056L416,1460@79559L42,1463@79840L11,1463@79790L68,1459@79501L521:DashboardScreen.kt#2thlc2");
                            ComposerKt.sourceInformationMarkerStart(composer13, -55425845, "CC(remember):DashboardScreen.kt#9igjgp");
                            boolean zChanged11 = composer13.changed(function2) | composer13.changedInstance(book);
                            Object objRememberedValue13 = composer13.rememberedValue();
                            if (zChanged11 || objRememberedValue13 == Composer.Companion.getEmpty()) {
                                objRememberedValue13 = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda115
                                    public final Object invoke() {
                                        return DashboardScreenKt.BookCard$lambda$372$lambda$371$lambda$329$lambda$326$lambda$325(function2, book);
                                    }
                                };
                                composer13.updateRememberedValue(objRememberedValue13);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer13);
                            ButtonKt.Button((Function0) objRememberedValue13, RowScope.weight$default(rowScope8, Modifier.Companion, 1.5f, false, 2, (Object) null), false, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.m274getLambda$1005329224$app(), composer, 805306368, 500);
                            ComposerKt.sourceInformationMarkerStart(composer, -55410286, "CC(remember):DashboardScreen.kt#9igjgp");
                            boolean zChanged12 = composer.changed(function2) | composer.changedInstance(book);
                            Object objRememberedValue14 = composer.rememberedValue();
                            if (zChanged12 || objRememberedValue14 == Composer.Companion.getEmpty()) {
                                objRememberedValue14 = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda126
                                    public final Object invoke() {
                                        return DashboardScreenKt.BookCard$lambda$372$lambda$371$lambda$329$lambda$328$lambda$327(function2, book);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue14);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            composer13 = composer;
                            ButtonKt.OutlinedButton((Function0) objRememberedValue14, RowScope.weight$default(rowScope8, Modifier.Companion, 1.0f, false, 2, (Object) null), false, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), ButtonDefaults.INSTANCE.outlinedButtonColors-ro_MJ88(0L, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU(), 0L, 0L, composer, ButtonDefaults.$stable << 12, 13), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.getLambda$2069238458$app(), composer13, 805306368, 484);
                            ComposerKt.sourceInformationMarkerEnd(composer13);
                            ComposerKt.sourceInformationMarkerEnd(composer13);
                            composer13.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer13);
                            ComposerKt.sourceInformationMarkerEnd(composer13);
                            ComposerKt.sourceInformationMarkerEnd(composer13);
                            composer13.endReplaceGroup();
                        } else {
                            if (Intrinsics.areEqual(book.getRequestedByName(), str2)) {
                                composer13.startReplaceGroup(439233803);
                                ComposerKt.sourceInformation(composer13, "1470@80202L11,1473@80430L1343,1469@80143L1630");
                                SurfaceKt.Surface-T9BRK9s(PaddingKt.padding-VpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), 0.0f, Dp.constructor-impl(4.0f), 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(10.0f)), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer13, MaterialTheme.$stable).getSecondaryContainer-0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(1715185320, true, new Function2() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda137
                                    public final Object invoke(Object obj, Object obj2) {
                                        return DashboardScreenKt.BookCard$lambda$372$lambda$371$lambda$333(function2, book, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                }, composer13, 54), composer13, 12582918, 120);
                            } else {
                                composer13.startReplaceGroup(359704729);
                            }
                            composer13.endReplaceGroup();
                        }
                        composer13.endReplaceGroup();
                        Unit unit7 = Unit.INSTANCE;
                    }
                    break;
                case -814438578:
                    String str16 = str6;
                    String str17 = str7;
                    if (!status3.equals("REQUESTED")) {
                        composer13.startReplaceGroup(359704729);
                        composer13.endReplaceGroup();
                        Unit unit8 = Unit.INSTANCE;
                    } else {
                        composer13.startReplaceGroup(433443282);
                        ComposerKt.sourceInformation(composer13, "");
                        if (z) {
                            composer13.startReplaceGroup(433381344);
                            ComposerKt.sourceInformation(composer13, "1375@74248L1481");
                            Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
                            Arrangement.Horizontal horizontal6 = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(8.0f));
                            ComposerKt.sourceInformationMarkerStart(composer13, 693286680, str17);
                            MeasurePolicy measurePolicyRowMeasurePolicy9 = RowKt.rowMeasurePolicy(horizontal6, Alignment.Companion.getTop(), composer13, 6);
                            ComposerKt.sourceInformationMarkerStart(composer13, -1323940314, str2);
                            int currentCompositeKeyHash14 = ComposablesKt.getCurrentCompositeKeyHash(composer13, 0);
                            CompositionLocalMap currentCompositionLocalMap14 = composer13.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier14 = ComposedModifierKt.materializeModifier(composer13, modifierFillMaxWidth$default5);
                            Function0 constructor14 = ComposeUiNode.Companion.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer13, -692256719, str4);
                            if (!(composer13.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer13.startReusableNode();
                            if (composer13.getInserting()) {
                                composer13.createNode(constructor14);
                            } else {
                                composer13.useNode();
                            }
                            Composer composer19 = Updater.constructor-impl(composer13);
                            Updater.set-impl(composer19, measurePolicyRowMeasurePolicy9, ComposeUiNode.Companion.getSetMeasurePolicy());
                            Updater.set-impl(composer19, currentCompositionLocalMap14, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                            Function2 setCompositeKeyHash14 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                            if (composer19.getInserting() || !Intrinsics.areEqual(composer19.rememberedValue(), Integer.valueOf(currentCompositeKeyHash14))) {
                                composer19.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash14));
                                composer19.apply(Integer.valueOf(currentCompositeKeyHash14), setCompositeKeyHash14);
                            }
                            Updater.set-impl(composer19, modifierMaterializeModifier14, ComposeUiNode.Companion.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer13, -407840262, str16);
                            RowScope rowScope9 = RowScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer13, -653213129, "C1382@74659L48,1380@74502L33,1379@74452L641,1390@75180L34,1389@75122L347,1396@75498L205:DashboardScreen.kt#2thlc2");
                            Modifier modifierWeight$default4 = RowScope.weight$default(rowScope9, Modifier.Companion, 1.2f, false, 2, (Object) null);
                            ButtonColors buttonColors4 = ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(ColorKt.Color(4279994175L), 0L, 0L, 0L, composer, (ButtonDefaults.$stable << 12) | 6, 14);
                            Shape shape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f));
                            ComposerKt.sourceInformationMarkerStart(composer, -713807670, "CC(remember):DashboardScreen.kt#9igjgp");
                            boolean zChangedInstance3 = composer.changedInstance(bookViewModel) | composer.changedInstance(book);
                            Object objRememberedValue15 = composer.rememberedValue();
                            if (zChangedInstance3 || objRememberedValue15 == Composer.Companion.getEmpty()) {
                                objRememberedValue15 = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda99
                                    public final Object invoke() {
                                        return DashboardScreenKt.BookCard$lambda$372$lambda$371$lambda$321$lambda$318$lambda$317(bookViewModel, book);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue15);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ButtonKt.Button((Function0) objRememberedValue15, modifierWeight$default4, false, shape, buttonColors4, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.m304getLambda$438417191$app(), composer, 805306368, 484);
                            ComposerKt.sourceInformationMarkerStart(composer, -713785973, "CC(remember):DashboardScreen.kt#9igjgp");
                            boolean zChangedInstance4 = composer.changedInstance(bookViewModel) | composer.changedInstance(book);
                            Object objRememberedValue16 = composer.rememberedValue();
                            if (zChangedInstance4 || objRememberedValue16 == Composer.Companion.getEmpty()) {
                                objRememberedValue16 = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda100
                                    public final Object invoke() {
                                        return DashboardScreenKt.BookCard$lambda$372$lambda$371$lambda$321$lambda$320$lambda$319(bookViewModel, book);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue16);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ButtonKt.OutlinedButton((Function0) objRememberedValue16, RowScope.weight$default(rowScope9, Modifier.Companion, 1.0f, false, 2, (Object) null), false, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.m288getLambda$1658816805$app(), composer, 805306368, 500);
                            IconButtonKt.IconButton(function0, (Modifier) null, false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.m293getLambda$1847830394$app(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                            composer13 = composer;
                            ComposerKt.sourceInformationMarkerEnd(composer13);
                            ComposerKt.sourceInformationMarkerEnd(composer13);
                            composer13.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer13);
                            ComposerKt.sourceInformationMarkerEnd(composer13);
                            ComposerKt.sourceInformationMarkerEnd(composer13);
                            composer13.endReplaceGroup();
                        } else if (Intrinsics.areEqual(book.getRequestedByName(), str2)) {
                            composer13.startReplaceGroup(434970032);
                            ComposerKt.sourceInformation(composer13, "1401@75824L2297");
                            Modifier modifierFillMaxWidth$default6 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
                            Arrangement.Horizontal horizontal7 = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(8.0f));
                            Alignment.Vertical centerVertically4 = Alignment.Companion.getCenterVertically();
                            ComposerKt.sourceInformationMarkerStart(composer13, 693286680, str17);
                            MeasurePolicy measurePolicyRowMeasurePolicy10 = RowKt.rowMeasurePolicy(horizontal7, centerVertically4, composer13, 54);
                            ComposerKt.sourceInformationMarkerStart(composer13, -1323940314, str2);
                            int currentCompositeKeyHash15 = ComposablesKt.getCurrentCompositeKeyHash(composer13, 0);
                            CompositionLocalMap currentCompositionLocalMap15 = composer13.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier15 = ComposedModifierKt.materializeModifier(composer13, modifierFillMaxWidth$default6);
                            Function0 constructor15 = ComposeUiNode.Companion.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer13, -692256719, str4);
                            if (!(composer13.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer13.startReusableNode();
                            if (composer13.getInserting()) {
                                composer13.createNode(constructor15);
                            } else {
                                composer13.useNode();
                            }
                            Composer composer20 = Updater.constructor-impl(composer13);
                            Updater.set-impl(composer20, measurePolicyRowMeasurePolicy10, ComposeUiNode.Companion.getSetMeasurePolicy());
                            Updater.set-impl(composer20, currentCompositionLocalMap15, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                            Function2 setCompositeKeyHash15 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                            if (composer20.getInserting() || !Intrinsics.areEqual(composer20.rememberedValue(), Integer.valueOf(currentCompositeKeyHash15))) {
                                composer20.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash15));
                                composer20.apply(Integer.valueOf(currentCompositeKeyHash15), setCompositeKeyHash15);
                            }
                            Updater.set-impl(composer20, modifierMaterializeModifier15, ComposeUiNode.Companion.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer13, -407840262, str16);
                            RowScope rowScope10 = RowScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer13, 1325006666, "C1406@76104L1019,1420@77152L458,1429@77697L41,1431@77913L11,1431@77863L68,1428@77639L456:DashboardScreen.kt#2thlc2");
                            SurfaceKt.Surface-T9BRK9s(RowScope.weight$default(rowScope10, Modifier.Companion, 1.0f, false, 2, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(10.0f)), Color.copy-wmQWz5c$default(ColorKt.Color(4293284096L), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableSingletons$DashboardScreenKt.INSTANCE.getLambda$578660077$app(), composer, 12583296, 120);
                            ButtonKt.OutlinedButton(function0, (Modifier) null, false, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.getLambda$1778608708$app(), composer, 805306368, 502);
                            ComposerKt.sourceInformationMarkerStart(composer, -1481229477, "CC(remember):DashboardScreen.kt#9igjgp");
                            boolean zChanged13 = composer.changed(function2) | composer.changedInstance(book);
                            Object objRememberedValue17 = composer.rememberedValue();
                            if (zChanged13 || objRememberedValue17 == Composer.Companion.getEmpty()) {
                                objRememberedValue17 = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda104
                                    public final Object invoke() {
                                        return DashboardScreenKt.BookCard$lambda$372$lambda$371$lambda$324$lambda$323$lambda$322(function2, book);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue17);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            composer13 = composer;
                            ButtonKt.OutlinedButton((Function0) objRememberedValue17, (Modifier) null, false, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), ButtonDefaults.INSTANCE.outlinedButtonColors-ro_MJ88(0L, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU(), 0L, 0L, composer, ButtonDefaults.$stable << 12, 13), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.getLambda$378370939$app(), composer13, 805306368, 486);
                            ComposerKt.sourceInformationMarkerEnd(composer13);
                            ComposerKt.sourceInformationMarkerEnd(composer13);
                            composer13.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer13);
                            ComposerKt.sourceInformationMarkerEnd(composer13);
                            ComposerKt.sourceInformationMarkerEnd(composer13);
                            composer13.endReplaceGroup();
                        } else {
                            composer13.startReplaceGroup(437250206);
                            ComposerKt.sourceInformation(composer13, "1438@78234L11,1437@78175L619");
                            SurfaceKt.Surface-T9BRK9s(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(10.0f)), MaterialTheme.INSTANCE.getColorScheme(composer13, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableSingletons$DashboardScreenKt.INSTANCE.m302getLambda$366714007$app(), composer13, 12582918, 120);
                            composer13.endReplaceGroup();
                        }
                        composer13.endReplaceGroup();
                        Unit unit9 = Unit.INSTANCE;
                    }
                    break;
                case 2052692649:
                    if (!status3.equals("AVAILABLE")) {
                        composer13.startReplaceGroup(359704729);
                        composer13.endReplaceGroup();
                        Unit unit10 = Unit.INSTANCE;
                    } else {
                        composer13.startReplaceGroup(430768881);
                        ComposerKt.sourceInformation(composer13, "");
                        if (z) {
                            String str18 = str6;
                            composer13.startReplaceGroup(432125255);
                            ComposerKt.sourceInformation(composer13, "1354@72993L1122");
                            Modifier modifierFillMaxWidth$default7 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
                            Arrangement.Horizontal spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
                            Alignment.Vertical centerVertically5 = Alignment.Companion.getCenterVertically();
                            ComposerKt.sourceInformationMarkerStart(composer13, 693286680, str7);
                            MeasurePolicy measurePolicyRowMeasurePolicy11 = RowKt.rowMeasurePolicy(spaceBetween2, centerVertically5, composer13, 54);
                            ComposerKt.sourceInformationMarkerStart(composer13, -1323940314, str2);
                            int currentCompositeKeyHash16 = ComposablesKt.getCurrentCompositeKeyHash(composer13, 0);
                            CompositionLocalMap currentCompositionLocalMap16 = composer13.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier16 = ComposedModifierKt.materializeModifier(composer13, modifierFillMaxWidth$default7);
                            Function0 constructor16 = ComposeUiNode.Companion.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer13, -692256719, str4);
                            if (!(composer13.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer13.startReusableNode();
                            if (composer13.getInserting()) {
                                composer13.createNode(constructor16);
                            } else {
                                composer13.useNode();
                            }
                            Composer composer21 = Updater.constructor-impl(composer13);
                            Updater.set-impl(composer21, measurePolicyRowMeasurePolicy11, ComposeUiNode.Companion.getSetMeasurePolicy());
                            Updater.set-impl(composer21, currentCompositionLocalMap16, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                            Function2 setCompositeKeyHash16 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                            if (composer21.getInserting() || !Intrinsics.areEqual(composer21.rememberedValue(), Integer.valueOf(currentCompositeKeyHash16))) {
                                composer21.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash16));
                                composer21.apply(Integer.valueOf(currentCompositeKeyHash16), setCompositeKeyHash16);
                            }
                            Updater.set-impl(composer21, modifierMaterializeModifier16, ComposeUiNode.Companion.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer13, -407840262, str18);
                            RowScope rowScope11 = RowScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer13, -378552024, "C1359@73325L10,1359@73369L11,1359@73271L127,1360@73427L662:DashboardScreen.kt#2thlc2");
                            TextKt.Text--4IGK_g("Waiting for requests...", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer13, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer13, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 65530);
                            composer13 = composer;
                            ButtonKt.OutlinedButton(function0, SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(32.0f)), false, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, PaddingKt.PaddingValues-YgX7TsA(Dp.constructor-impl(10.0f), Dp.constructor-impl(4.0f)), (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.m277getLambda$1109407621$app(), composer13, 817889328, 372);
                            ComposerKt.sourceInformationMarkerEnd(composer13);
                            ComposerKt.sourceInformationMarkerEnd(composer13);
                            composer13.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer13);
                            ComposerKt.sourceInformationMarkerEnd(composer13);
                            ComposerKt.sourceInformationMarkerEnd(composer13);
                            composer13.endReplaceGroup();
                        } else {
                            composer13.startReplaceGroup(430766463);
                            ComposerKt.sourceInformation(composer13, "1330@71617L1322");
                            Modifier modifierFillMaxWidth$default8 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
                            Arrangement.Horizontal horizontal8 = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(8.0f));
                            ComposerKt.sourceInformationMarkerStart(composer13, 693286680, str7);
                            MeasurePolicy measurePolicyRowMeasurePolicy12 = RowKt.rowMeasurePolicy(horizontal8, Alignment.Companion.getTop(), composer13, 6);
                            ComposerKt.sourceInformationMarkerStart(composer13, -1323940314, str2);
                            int currentCompositeKeyHash17 = ComposablesKt.getCurrentCompositeKeyHash(composer13, 0);
                            CompositionLocalMap currentCompositionLocalMap17 = composer13.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier17 = ComposedModifierKt.materializeModifier(composer13, modifierFillMaxWidth$default8);
                            Function0 constructor17 = ComposeUiNode.Companion.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer13, -692256719, str4);
                            if (!(composer13.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer13.startReusableNode();
                            if (composer13.getInserting()) {
                                composer13.createNode(constructor17);
                            } else {
                                composer13.useNode();
                            }
                            Composer composer22 = Updater.constructor-impl(composer13);
                            Updater.set-impl(composer22, measurePolicyRowMeasurePolicy12, ComposeUiNode.Companion.getSetMeasurePolicy());
                            Updater.set-impl(composer22, currentCompositionLocalMap17, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                            Function2 setCompositeKeyHash17 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                            if (composer22.getInserting() || !Intrinsics.areEqual(composer22.rememberedValue(), Integer.valueOf(currentCompositeKeyHash17))) {
                                composer22.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash17));
                                composer22.apply(Integer.valueOf(currentCompositeKeyHash17), setCompositeKeyHash17);
                            }
                            Updater.set-impl(composer22, modifierMaterializeModifier17, ComposeUiNode.Companion.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer13, -407840262, str6);
                            RowScope rowScope12 = RowScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer13, -1831817665, "C1334@71821L622,1345@72522L34,1344@72472L441:DashboardScreen.kt#2thlc2");
                            ButtonKt.OutlinedButton(function0, RowScope.weight$default(rowScope12, Modifier.Companion, 1.0f, false, 2, (Object) null), false, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, PaddingKt.PaddingValues-YgX7TsA(Dp.constructor-impl(8.0f), Dp.constructor-impl(6.0f)), (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.m296getLambda$1914652494$app(), composer, 817889280, 372);
                            composer13 = composer;
                            ComposerKt.sourceInformationMarkerStart(composer13, 495119810, "CC(remember):DashboardScreen.kt#9igjgp");
                            boolean zChanged14 = composer13.changed(function2) | composer13.changedInstance(book);
                            Object objRememberedValue18 = composer13.rememberedValue();
                            if (zChanged14 || objRememberedValue18 == Composer.Companion.getEmpty()) {
                                objRememberedValue18 = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda98
                                    public final Object invoke() {
                                        return DashboardScreenKt.BookCard$lambda$372$lambda$371$lambda$315$lambda$314$lambda$313(function2, book);
                                    }
                                };
                                composer13.updateRememberedValue(objRememberedValue18);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer13);
                            ButtonKt.Button((Function0) objRememberedValue18, RowScope.weight$default(rowScope12, Modifier.Companion, 1.5f, false, 2, (Object) null), false, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, PaddingKt.PaddingValues-YgX7TsA(Dp.constructor-impl(8.0f), Dp.constructor-impl(6.0f)), (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.m290getLambda$1756958160$app(), composer13, 817889280, 372);
                            ComposerKt.sourceInformationMarkerEnd(composer13);
                            ComposerKt.sourceInformationMarkerEnd(composer13);
                            composer13.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer13);
                            ComposerKt.sourceInformationMarkerEnd(composer13);
                            ComposerKt.sourceInformationMarkerEnd(composer13);
                            composer13.endReplaceGroup();
                        }
                        composer13.endReplaceGroup();
                        Unit unit11 = Unit.INSTANCE;
                    }
                    break;
                default:
                    composer13.startReplaceGroup(359704729);
                    composer13.endReplaceGroup();
                    Unit unit12 = Unit.INSTANCE;
                    break;
            }
            ComposerKt.sourceInformationMarkerEnd(composer13);
            ComposerKt.sourceInformationMarkerEnd(composer13);
            composer13.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer13);
            ComposerKt.sourceInformationMarkerEnd(composer13);
            ComposerKt.sourceInformationMarkerEnd(composer13);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit BookCard$lambda$372$lambda$312$lambda$295$lambda$292(Book book, RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Badge");
        ComposerKt.sourceInformation(composer, "C1144@62223L10,1144@62134L111:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1275436164, i, -1, "com.example.ui.screens.BookCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:1144)");
            }
            TextKt.Text--4IGK_g(book.getRentCount() + " Rents", PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(2.0f)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 48, 0, 65532);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit BookCard$lambda$372$lambda$312$lambda$295$lambda$294(String str, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1160@62977L364:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(52142763, i, -1, "com.example.ui.screens.BookCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:1160)");
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
            TextKt.Text--4IGK_g(str2, PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(4.0f), Dp.constructor-impl(2.0f)), Color.Companion.getWhite-0d7_KjU(), TextUnitKt.getSp(9), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 200112, 0, 131024);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit BookCard$lambda$372$lambda$312$lambda$304$lambda$303$lambda$302$lambda$298$lambda$297(BookViewModel bookViewModel, Book book) {
        bookViewModel.toggleBookmark(book);
        return Unit.INSTANCE;
    }

    static final Unit BookCard$lambda$372$lambda$312$lambda$304$lambda$303$lambda$302$lambda$301(boolean z, final State state, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1209@65658L11,1210@65745L153,1206@65362L566:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(315892873, i, -1, "com.example.ui.screens.BookCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:1206)");
            }
            ImageVector bookmark = z ? BookmarkKt.getBookmark(Icons.INSTANCE.getDefault()) : BookmarkBorderKt.getBookmarkBorder(Icons.INSTANCE.getDefault());
            long j = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU();
            Modifier modifier = Modifier.Companion;
            ComposerKt.sourceInformationMarkerStart(composer, -1369613694, "CC(remember):DashboardScreen.kt#9igjgp");
            boolean zChanged = composer.changed(state);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda0
                    public final Object invoke(Object obj) {
                        return DashboardScreenKt.BookCard$lambda$372$lambda$312$lambda$304$lambda$303$lambda$302$lambda$301$lambda$300$lambda$299(state, (GraphicsLayerScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            IconKt.Icon-ww6aTOc(bookmark, "Bookmark", GraphicsLayerModifierKt.graphicsLayer(modifier, (Function1) objRememberedValue), j, composer, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit BookCard$lambda$372$lambda$312$lambda$304$lambda$303$lambda$302$lambda$301$lambda$300$lambda$299(State state, GraphicsLayerScope graphicsLayerScope) {
        Intrinsics.checkNotNullParameter(graphicsLayerScope, "$this$graphicsLayer");
        graphicsLayerScope.setScaleX(BookCard$lambda$372$lambda$312$lambda$304$lambda$303$lambda$296(state));
        graphicsLayerScope.setScaleY(BookCard$lambda$372$lambda$312$lambda$304$lambda$303$lambda$296(state));
        return Unit.INSTANCE;
    }

    static final Unit BookCard$lambda$372$lambda$312$lambda$311$lambda$306$lambda$305(BookViewModel bookViewModel, Book book) {
        bookViewModel.deleteBook(book.getId());
        return Unit.INSTANCE;
    }

    static final Unit BookCard$lambda$372$lambda$312$lambda$311$lambda$307(String str, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1276@68508L10,1273@68324L453:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2055934591, i, -1, "com.example.ui.screens.BookCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:1273)");
            }
            Modifier modifier = PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(8.0f), Dp.constructor-impl(2.0f));
            TextStyle labelSmall = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall();
            TextKt.Text--4IGK_g(str, modifier, Color.Companion.getWhite-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.getEllipsis-gIe3tQ8(), false, 1, 0, (Function1) null, labelSmall, composer, 197040, 3120, 55256);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit BookCard$lambda$372$lambda$312$lambda$311$lambda$309$lambda$308(Function1 function1, Book book) {
        function1.invoke(book.getOwnerName());
        return Unit.INSTANCE;
    }

    static final Unit BookCard$lambda$372$lambda$371$lambda$315$lambda$314$lambda$313(Function2 function2, Book book) {
        function2.invoke("REQUEST", book);
        return Unit.INSTANCE;
    }

    static final Unit BookCard$lambda$372$lambda$371$lambda$321$lambda$318$lambda$317(BookViewModel bookViewModel, Book book) {
        bookViewModel.acceptRequest(book);
        return Unit.INSTANCE;
    }

    static final Unit BookCard$lambda$372$lambda$371$lambda$321$lambda$320$lambda$319(BookViewModel bookViewModel, Book book) {
        bookViewModel.declineRequest(book);
        return Unit.INSTANCE;
    }

    static final Unit BookCard$lambda$372$lambda$371$lambda$324$lambda$323$lambda$322(Function2 function2, Book book) {
        function2.invoke("CANCEL_REQUEST", book);
        return Unit.INSTANCE;
    }

    static final Unit BookCard$lambda$372$lambda$371$lambda$329$lambda$326$lambda$325(Function2 function2, Book book) {
        function2.invoke("HANDOVER", book);
        return Unit.INSTANCE;
    }

    static final Unit BookCard$lambda$372$lambda$371$lambda$329$lambda$328$lambda$327(Function2 function2, Book book) {
        function2.invoke("CANCEL_HANDOVER", book);
        return Unit.INSTANCE;
    }

    static final Unit BookCard$lambda$372$lambda$371$lambda$333(final Function2 function2, final Book book, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1474@80460L1287:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1715185320, i, -1, "com.example.ui.screens.BookCard.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:1474)");
            }
            Modifier modifier = PaddingKt.padding-VpY3zN4(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(10.0f), Dp.constructor-impl(6.0f));
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
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
            ComposerKt.sourceInformationMarkerStart(composer, -1664800723, "C1481@80948L10,1479@80803L267,1485@81165L41,1487@81388L11,1487@81338L68,1484@81103L614:DashboardScreen.kt#2thlc2");
            TextKt.Text--4IGK_g("Request Accepted! Meet for handover scan.", RowScope.weight$default(rowScope, Modifier.Companion, 1.0f, false, 2, (Object) null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 65532);
            ComposerKt.sourceInformationMarkerStart(composer, -884976531, "CC(remember):DashboardScreen.kt#9igjgp");
            boolean zChanged = composer.changed(function2) | composer.changedInstance(book);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda111
                    public final Object invoke() {
                        return DashboardScreenKt.BookCard$lambda$372$lambda$371$lambda$333$lambda$332$lambda$331$lambda$330(function2, book);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ButtonKt.OutlinedButton((Function0) objRememberedValue, (Modifier) null, false, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(8.0f)), ButtonDefaults.INSTANCE.outlinedButtonColors-ro_MJ88(0L, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU(), 0L, 0L, composer, ButtonDefaults.$stable << 12, 13), (ButtonElevation) null, (BorderStroke) null, PaddingKt.PaddingValues-YgX7TsA(Dp.constructor-impl(8.0f), Dp.constructor-impl(4.0f)), (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.getLambda$2085371538$app(), composer, 817889280, 358);
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

    static final Unit BookCard$lambda$372$lambda$371$lambda$333$lambda$332$lambda$331$lambda$330(Function2 function2, Book book) {
        function2.invoke("CANCEL_REQUEST", book);
        return Unit.INSTANCE;
    }

    static final Unit BookCard$lambda$372$lambda$371$lambda$337(Book book, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1504@82337L2170:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2119609438, i, -1, "com.example.ui.screens.BookCard.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:1504)");
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
            ComposerKt.sourceInformationMarkerStart(composer, 1911718636, "C1505@82414L636,1516@83270L10,1514@83083L323:DashboardScreen.kt#2thlc2");
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
            ComposerKt.sourceInformationMarkerStart(composer, -1103269121, "C1506@82581L11,1506@82504L130,1507@82671L39,1510@82887L10,1508@82747L269:DashboardScreen.kt#2thlc2");
            IconKt.Icon-ww6aTOc(VerifiedKt.getVerified(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 432, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextKt.Text--4IGK_g("Owner Scanned Handover Photo", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleSmall(), composer, 196614, 0, 65502);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            TextKt.Text--4IGK_g("Owner photographed this book at handover. Please inspect before confirming receipt:", PaddingKt.padding-VpY3zN4$default(Modifier.Companion, 0.0f, Dp.constructor-impl(4.0f), 1, (Object) null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 54, 0, 65532);
            String transferImageUrl = book.getTransferImageUrl();
            if (transferImageUrl == null) {
                transferImageUrl = book.getImageUrl();
            }
            String str = transferImageUrl;
            if (str == null || StringsKt.isBlank(str)) {
                composer.startReplaceGroup(1829899002);
            } else {
                composer.startReplaceGroup(1912821863);
                ComposerKt.sourceInformation(composer, "1521@83600L40,1527@84009L11,1522@83677L766");
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
                Modifier modifier3 = BackgroundKt.background-bw27NRU$default(ClipKt.clip(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(160.0f)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(10.0f))), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), (Shape) null, 2, (Object) null);
                ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
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
                ComposerKt.sourceInformationMarkerStart(composer, 1443916892, "C1529@84117L288:DashboardScreen.kt#2thlc2");
                BookImageDisplayKt.BookImageDisplay(transferImageUrl, "Transfer Image", SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null), null, null, composer, 432, 24);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
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

    static final Unit BookCard$lambda$372$lambda$371$lambda$344$lambda$339$lambda$338(Function2 function2, Book book) {
        function2.invoke("SHOW_HANDOVER_QR", book);
        return Unit.INSTANCE;
    }

    static final Unit BookCard$lambda$372$lambda$371$lambda$344$lambda$341$lambda$340(Function2 function2, Book book) {
        function2.invoke("ACCEPT_TRANSFER", book);
        return Unit.INSTANCE;
    }

    static final Unit BookCard$lambda$372$lambda$371$lambda$344$lambda$343$lambda$342(Function2 function2, Book book) {
        function2.invoke("CANCEL_HANDOVER", book);
        return Unit.INSTANCE;
    }

    static final Unit BookCard$lambda$372$lambda$371$lambda$349$lambda$346$lambda$345(Function2 function2, Book book) {
        function2.invoke("SCAN_HANDOVER_QR", book);
        return Unit.INSTANCE;
    }

    static final Unit BookCard$lambda$372$lambda$371$lambda$349$lambda$348$lambda$347(Function2 function2, Book book) {
        function2.invoke("CANCEL_HANDOVER", book);
        return Unit.INSTANCE;
    }

    static final Unit BookCard$lambda$372$lambda$371$lambda$351$lambda$350(Function2 function2, Book book) {
        function2.invoke("BORROWER_RETURN", book);
        return Unit.INSTANCE;
    }

    static final Unit BookCard$lambda$372$lambda$371$lambda$354(Book book, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1603@89216L1960:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(985785372, i, -1, "com.example.ui.screens.BookCard.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:1603)");
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
            ComposerKt.sourceInformationMarkerStart(composer, -218222336, "C1604@89293L609,1615@90115L10,1613@89935L316:DashboardScreen.kt#2thlc2");
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
            ComposerKt.sourceInformationMarkerStart(composer, 1061762876, "C1605@89463L11,1605@89383L101,1606@89521L39,1609@89739L10,1607@89597L271:DashboardScreen.kt#2thlc2");
            IconKt.Icon-ww6aTOc(CheckCircleKt.getCheckCircle(Icons.INSTANCE.getDefault()), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getTertiary-0d7_KjU(), composer, 48, 4);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextKt.Text--4IGK_g("Borrower Return Scan Submitted", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleSmall(), composer, 196614, 0, 65502);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            TextKt.Text--4IGK_g("Borrower has submitted a return scan photo. Review below and confirm return:", PaddingKt.padding-VpY3zN4$default(Modifier.Companion, 0.0f, Dp.constructor-impl(4.0f), 1, (Object) null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 54, 0, 65532);
            Composer composer4 = composer;
            String returnImageUrl = book.getReturnImageUrl();
            if (returnImageUrl == null || StringsKt.isBlank(returnImageUrl)) {
                composer4.startReplaceGroup(-306859428);
            } else {
                composer4.startReplaceGroup(-217229624);
                ComposerKt.sourceInformation(composer4, "1619@90364L40,1628@91047L11,1620@90454L658");
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer4, 6);
                SingletonAsyncImageKt.m108AsyncImagegl8XCv8(book.getReturnImageUrl(), "Scanned Return Image", BackgroundKt.background-bw27NRU$default(ClipKt.clip(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(160.0f)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(10.0f))), MaterialTheme.INSTANCE.getColorScheme(composer4, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), (Shape) null, 2, (Object) null), null, null, null, ContentScale.Companion.getFit(), 0.0f, null, 0, false, null, composer, 1572912, 0, 4024);
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

    static final Unit BookCard$lambda$372$lambda$371$lambda$361$lambda$356$lambda$355(Function2 function2, Book book) {
        function2.invoke("SHOW_RETURN_QR", book);
        return Unit.INSTANCE;
    }

    static final Unit BookCard$lambda$372$lambda$371$lambda$361$lambda$358$lambda$357(Function2 function2, Book book) {
        function2.invoke("SCAN_RETURN_QR", book);
        return Unit.INSTANCE;
    }

    static final Unit BookCard$lambda$372$lambda$371$lambda$361$lambda$360$lambda$359(Function2 function2, Book book) {
        function2.invoke("CONFIRM_RETURN", book);
        return Unit.INSTANCE;
    }

    static final Unit BookCard$lambda$372$lambda$371$lambda$370(final Book book, final Function2 function2, Composer composer, int i) {
        int i2;
        int i3;
        ComposerKt.sourceInformation(composer, "C1667@93593L3595:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(14449221, i, -1, "com.example.ui.screens.BookCard.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:1667)");
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
            ComposerKt.sourceInformationMarkerStart(composer, -912032076, "C1670@93839L10,1671@93919L11,1668@93670L311,1685@94806L40,1686@94879L2279:DashboardScreen.kt#2thlc2");
            TextKt.Text--4IGK_g("Return scan submitted. Scan owner's QR or display your Return QR:", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 65530);
            Composer composer3 = composer;
            String returnImageUrl = book.getReturnImageUrl();
            if (returnImageUrl == null || StringsKt.isBlank(returnImageUrl)) {
                i2 = 1;
                i3 = 6;
                composer3.startReplaceGroup(-1005061837);
            } else {
                composer3.startReplaceGroup(-911735066);
                ComposerKt.sourceInformation(composer3, "1674@94094L40,1675@94184L555");
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer3, 6);
                i3 = 6;
                i2 = 1;
                SingletonAsyncImageKt.m108AsyncImagegl8XCv8(book.getReturnImageUrl(), "Your Return Scan", ClipKt.clip(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(120.0f)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(8.0f))), null, null, null, ContentScale.Companion.getFit(), 0.0f, null, 0, false, null, composer, 1572912, 0, 4024);
                composer3 = composer;
            }
            composer3.endReplaceGroup();
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer3, i3);
            Modifier modifier2 = PaddingKt.padding-qDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, i2, (Object) null), 0.0f, Dp.constructor-impl(4.0f), 0.0f, 0.0f, 13, (Object) null);
            Arrangement.Horizontal horizontal = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(6.0f));
            ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontal, Alignment.Companion.getTop(), composer3, i3);
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
            ComposerKt.sourceInformationMarkerStart(composer3, 830011625, "C1689@95238L11,1689@95194L65,1688@95087L41,1687@95029L772,1698@95904L41,1697@95838L643,1707@96584L40,1710@96887L11,1710@96837L68,1706@96518L606:DashboardScreen.kt#2thlc2");
            Composer composer5 = composer3;
            ButtonColors buttonColors = ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getTertiary-0d7_KjU(), 0L, 0L, 0L, composer5, ButtonDefaults.$stable << 12, 14);
            Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.Companion, 1.2f, false, 2, (Object) null);
            Shape shape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f));
            ComposerKt.sourceInformationMarkerStart(composer5, 1689342356, "CC(remember):DashboardScreen.kt#9igjgp");
            boolean zChanged = composer5.changed(function2) | composer5.changedInstance(book);
            Object objRememberedValue = composer5.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda68
                    public final Object invoke() {
                        return DashboardScreenKt.BookCard$lambda$372$lambda$371$lambda$370$lambda$369$lambda$368$lambda$363$lambda$362(function2, book);
                    }
                };
                composer5.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer5);
            ButtonKt.Button((Function0) objRememberedValue, modifierWeight$default, false, shape, buttonColors, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.m286getLambda$1574301125$app(), composer5, 805306368, 484);
            ComposerKt.sourceInformationMarkerStart(composer5, 1689368500, "CC(remember):DashboardScreen.kt#9igjgp");
            boolean zChanged2 = composer5.changed(function2) | composer5.changedInstance(book);
            Object objRememberedValue2 = composer5.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda69
                    public final Object invoke() {
                        return DashboardScreenKt.BookCard$lambda$372$lambda$371$lambda$370$lambda$369$lambda$368$lambda$365$lambda$364(function2, book);
                    }
                };
                composer5.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composer5);
            ButtonKt.OutlinedButton((Function0) objRememberedValue2, RowScope.weight$default(rowScope, Modifier.Companion, 1.2f, false, 2, (Object) null), false, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.m282getLambda$1516915719$app(), composer5, 805306368, 500);
            ComposerKt.sourceInformationMarkerStart(composer5, 1689390259, "CC(remember):DashboardScreen.kt#9igjgp");
            boolean zChanged3 = composer5.changed(function2) | composer5.changedInstance(book);
            Object objRememberedValue3 = composer5.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda70
                    public final Object invoke() {
                        return DashboardScreenKt.BookCard$lambda$372$lambda$371$lambda$370$lambda$369$lambda$368$lambda$367$lambda$366(function2, book);
                    }
                };
                composer5.updateRememberedValue(objRememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(composer5);
            ButtonKt.OutlinedButton((Function0) objRememberedValue3, RowScope.weight$default(rowScope, Modifier.Companion, 1.0f, false, 2, (Object) null), false, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), ButtonDefaults.INSTANCE.outlinedButtonColors-ro_MJ88(0L, MaterialTheme.INSTANCE.getColorScheme(composer5, MaterialTheme.$stable).getError-0d7_KjU(), 0L, 0L, composer5, ButtonDefaults.$stable << 12, 13), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.m280getLambda$1291560414$app(), composer, 805306368, 484);
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

    static final Unit BookCard$lambda$372$lambda$371$lambda$370$lambda$369$lambda$368$lambda$363$lambda$362(Function2 function2, Book book) {
        function2.invoke("SCAN_RETURN_QR", book);
        return Unit.INSTANCE;
    }

    static final Unit BookCard$lambda$372$lambda$371$lambda$370$lambda$369$lambda$368$lambda$365$lambda$364(Function2 function2, Book book) {
        function2.invoke("SHOW_RETURN_QR", book);
        return Unit.INSTANCE;
    }

    static final Unit BookCard$lambda$372$lambda$371$lambda$370$lambda$369$lambda$368$lambda$367$lambda$366(Function2 function2, Book book) {
        function2.invoke("CANCEL_RETURN", book);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v4 */
    public static final void BookCardGrid(final Book book, final boolean z, final String str, final BookViewModel bookViewModel, final String str2, final Function0<Unit> function0, final Function1<? super String, Unit> function1, final Function2<? super String, ? super Book, Unit> function2, Composer composer, final int i) {
        int i2;
        boolean z2;
        Composer composer2;
        Object obj;
        ?? r9;
        Composer composer3;
        Intrinsics.checkNotNullParameter(book, "book");
        Intrinsics.checkNotNullParameter(str, "currentUser");
        Intrinsics.checkNotNullParameter(bookViewModel, "viewModel");
        Intrinsics.checkNotNullParameter(str2, "distanceStr");
        Intrinsics.checkNotNullParameter(function0, "onChatClick");
        Intrinsics.checkNotNullParameter(function1, "onOwnerClick");
        Intrinsics.checkNotNullParameter(function2, "onActionClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(78623858);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BookCardGrid)P(!1,3!1,7!1,5,6)1735@97578L34,1754@98100L11,1755@98197L28,1757@98303L71,1758@98456L11,1758@98406L70,1759@98483L20057,1751@97990L20550:DashboardScreen.kt#2thlc2");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(book) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i2 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(bookViewModel) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 16384 : FragmentTransaction.TRANSIT_EXIT_MASK;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 131072 : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
        }
        if ((4793491 & i2) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer3 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(78623858, i2, -1, "com.example.ui.screens.BookCardGrid (DashboardScreen.kt:1734)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1751874476, "CC(remember):DashboardScreen.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (!BookCardGrid$lambda$375(mutableState)) {
                composer2 = composerStartRestartGroup;
                obj = null;
                r9 = 1;
                composer2.startReplaceGroup(1429666672);
            } else {
                composerStartRestartGroup.startReplaceGroup(1526538169);
                ComposerKt.sourceInformation(composerStartRestartGroup, "1743@97824L29,1744@97881L87,1738@97651L327");
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1751866609, "CC(remember):DashboardScreen.kt#9igjgp");
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda71
                        public final Object invoke() {
                            return DashboardScreenKt.BookCardGrid$lambda$378$lambda$377(mutableState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function0 function3 = (Function0) objRememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1751864727, "CC(remember):DashboardScreen.kt#9igjgp");
                boolean z3 = (458752 & i2) == 131072;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda72
                        public final Object invoke() {
                            return DashboardScreenKt.BookCardGrid$lambda$380$lambda$379(function0, mutableState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composer2 = composerStartRestartGroup;
                r9 = 1;
                obj = null;
                BookDetailsDialogKt.BookDetailsDialog(book, z2, str, bookViewModel, function3, (Function0) objRememberedValue3, composer2, (i2 & 7168) | (i2 & 896) | (i2 & 14) | 24576 | (i2 & 112), 0);
            }
            composer2.endReplaceGroup();
            Modifier modifier = BorderKt.border-xT4_qwU(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, (int) r9, obj), Dp.constructor-impl(1.0f), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOutlineVariant-0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(20.0f)));
            ComposerKt.sourceInformationMarkerStart(composer2, -1751854674, "CC(remember):DashboardScreen.kt#9igjgp");
            Object objRememberedValue4 = composer2.rememberedValue();
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda73
                    public final Object invoke() {
                        return DashboardScreenKt.BookCardGrid$lambda$382$lambda$381(mutableState);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Modifier modifier2 = ClickableKt.clickable-XHw0xAI$default(modifier, false, (String) null, (Role) null, (Function0) objRememberedValue4, 7, (Object) null);
            Shape shape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(20.0f));
            CardElevation cardElevation = CardDefaults.INSTANCE.elevatedCardElevation-aqJV_2Y(Dp.constructor-impl(2.0f), Dp.constructor-impl(6.0f), 0.0f, 0.0f, 0.0f, 0.0f, composer2, (CardDefaults.$stable << 18) | 54, 60);
            Composer composer4 = composer2;
            composer3 = composer4;
            CardKt.ElevatedCard(modifier2, shape, CardDefaults.INSTANCE.elevatedCardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0L, 0L, composer4, CardDefaults.$stable << 12, 14), cardElevation, ComposableLambdaKt.rememberComposableLambda(802324589, (boolean) r9, new Function3() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda74
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return DashboardScreenKt.BookCardGrid$lambda$441(book, z, function1, str2, function0, str, function2, bookViewModel, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, composer4, 54), composer3, 24576, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda75
                public final Object invoke(Object obj2, Object obj3) {
                    return DashboardScreenKt.BookCardGrid$lambda$442(book, z, str, bookViewModel, str2, function0, function1, function2, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final boolean BookCardGrid$lambda$375(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void BookCardGrid$lambda$376(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    static final Unit BookCardGrid$lambda$378$lambda$377(MutableState mutableState) {
        BookCardGrid$lambda$376(mutableState, false);
        return Unit.INSTANCE;
    }

    static final Unit BookCardGrid$lambda$380$lambda$379(Function0 function0, MutableState mutableState) {
        BookCardGrid$lambda$376(mutableState, false);
        function0.invoke();
        return Unit.INSTANCE;
    }

    static final Unit BookCardGrid$lambda$382$lambda$381(MutableState mutableState) {
        BookCardGrid$lambda$376(mutableState, true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:80:0x0413  */
    /* JADX WARN: Code duplicated, block: B:81:0x041d  */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x1ad7, code lost:
    
        if (r2.equals(r12) == false) goto L388;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:386:0x1a65. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static final kotlin.Unit BookCardGrid$lambda$441(final com.example.data.Book r60, boolean r61, final kotlin.jvm.functions.Function1 r62, java.lang.String r63, kotlin.jvm.functions.Function0 r64, java.lang.String r65, final kotlin.jvm.functions.Function2 r66, final com.example.ui.BookViewModel r67, androidx.compose.foundation.layout.ColumnScope r68, androidx.compose.runtime.Composer r69, int r70) {
        /*
            Method dump skipped, instruction units count: 7294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.DashboardScreenKt.BookCardGrid$lambda$441(com.example.data.Book, boolean, kotlin.jvm.functions.Function1, java.lang.String, kotlin.jvm.functions.Function0, java.lang.String, kotlin.jvm.functions.Function2, com.example.ui.BookViewModel, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    static final Unit BookCardGrid$lambda$441$lambda$440$lambda$387$lambda$384(Book book, RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Badge");
        ComposerKt.sourceInformation(composer, "C1793@99947L66:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1356351016, i, -1, "com.example.ui.screens.BookCardGrid.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:1793)");
            }
            TextKt.Text--4IGK_g(book.getRentCount() + " Rents", PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(2.0f)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 48, 0, 131068);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit BookCardGrid$lambda$441$lambda$440$lambda$387$lambda$386(String str, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1809@100745L364:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2001496425, i, -1, "com.example.ui.screens.BookCardGrid.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:1809)");
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
            TextKt.Text--4IGK_g(str2, PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(4.0f), Dp.constructor-impl(2.0f)), Color.Companion.getWhite-0d7_KjU(), TextUnitKt.getSp(9), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 200112, 0, 131024);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit BookCardGrid$lambda$441$lambda$440$lambda$439$lambda$395$lambda$394$lambda$390$lambda$389(BookViewModel bookViewModel, Book book) {
        bookViewModel.toggleBookmark(book);
        return Unit.INSTANCE;
    }

    static final Unit BookCardGrid$lambda$441$lambda$440$lambda$439$lambda$395$lambda$394$lambda$393(boolean z, final State state, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1857@103396L11,1858@103483L161,1854@103096L578:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1361978635, i, -1, "com.example.ui.screens.BookCardGrid.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:1854)");
            }
            ImageVector bookmark = z ? BookmarkKt.getBookmark(Icons.INSTANCE.getDefault()) : BookmarkBorderKt.getBookmarkBorder(Icons.INSTANCE.getDefault());
            long j = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU();
            Modifier modifier = Modifier.Companion;
            ComposerKt.sourceInformationMarkerStart(composer, 1103570550, "CC(remember):DashboardScreen.kt#9igjgp");
            boolean zChanged = composer.changed(state);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda78
                    public final Object invoke(Object obj) {
                        return DashboardScreenKt.BookCardGrid$lambda$441$lambda$440$lambda$439$lambda$395$lambda$394$lambda$393$lambda$392$lambda$391(state, (GraphicsLayerScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            IconKt.Icon-ww6aTOc(bookmark, "Bookmark", GraphicsLayerModifierKt.graphicsLayer(modifier, (Function1) objRememberedValue), j, composer, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit BookCardGrid$lambda$441$lambda$440$lambda$439$lambda$395$lambda$394$lambda$393$lambda$392$lambda$391(State state, GraphicsLayerScope graphicsLayerScope) {
        Intrinsics.checkNotNullParameter(graphicsLayerScope, "$this$graphicsLayer");
        graphicsLayerScope.setScaleX(BookCardGrid$lambda$441$lambda$440$lambda$439$lambda$395$lambda$388(state));
        graphicsLayerScope.setScaleY(BookCardGrid$lambda$441$lambda$440$lambda$439$lambda$395$lambda$388(state));
        return Unit.INSTANCE;
    }

    static final Unit BookCardGrid$lambda$441$lambda$440$lambda$439$lambda$397$lambda$396(Function1 function1, Book book) {
        function1.invoke(book.getOwnerName());
        return Unit.INSTANCE;
    }

    static final Unit BookCardGrid$lambda$441$lambda$440$lambda$439$lambda$400$lambda$399$lambda$398(Function2 function2, Book book) {
        function2.invoke("REQUEST", book);
        return Unit.INSTANCE;
    }

    static final Unit BookCardGrid$lambda$441$lambda$440$lambda$439$lambda$405$lambda$402$lambda$401(BookViewModel bookViewModel, Book book) {
        bookViewModel.acceptRequest(book);
        return Unit.INSTANCE;
    }

    static final Unit BookCardGrid$lambda$441$lambda$440$lambda$439$lambda$405$lambda$404$lambda$403(BookViewModel bookViewModel, Book book) {
        bookViewModel.declineRequest(book);
        return Unit.INSTANCE;
    }

    static final Unit BookCardGrid$lambda$441$lambda$440$lambda$439$lambda$408$lambda$407$lambda$406(Function2 function2, Book book) {
        function2.invoke("CANCEL_REQUEST", book);
        return Unit.INSTANCE;
    }

    static final Unit BookCardGrid$lambda$441$lambda$440$lambda$439$lambda$410$lambda$409(Function2 function2, Book book) {
        function2.invoke("HANDOVER", book);
        return Unit.INSTANCE;
    }

    static final Unit BookCardGrid$lambda$441$lambda$440$lambda$439$lambda$415$lambda$412$lambda$411(Function2 function2, Book book) {
        function2.invoke("SHOW_HANDOVER_QR", book);
        return Unit.INSTANCE;
    }

    static final Unit BookCardGrid$lambda$441$lambda$440$lambda$439$lambda$415$lambda$414$lambda$413(Function2 function2, Book book) {
        function2.invoke("CANCEL_HANDOVER", book);
        return Unit.INSTANCE;
    }

    static final Unit BookCardGrid$lambda$441$lambda$440$lambda$439$lambda$420$lambda$417$lambda$416(Function2 function2, Book book) {
        function2.invoke("SCAN_HANDOVER_QR", book);
        return Unit.INSTANCE;
    }

    static final Unit BookCardGrid$lambda$441$lambda$440$lambda$439$lambda$420$lambda$419$lambda$418(Function2 function2, Book book) {
        function2.invoke("CANCEL_HANDOVER", book);
        return Unit.INSTANCE;
    }

    static final Unit BookCardGrid$lambda$441$lambda$440$lambda$439$lambda$422$lambda$421(Function2 function2, Book book) {
        function2.invoke("BORROWER_RETURN", book);
        return Unit.INSTANCE;
    }

    static final Unit BookCardGrid$lambda$441$lambda$440$lambda$439$lambda$427$lambda$424$lambda$423(Function2 function2, Book book) {
        function2.invoke("SHOW_RETURN_QR", book);
        return Unit.INSTANCE;
    }

    static final Unit BookCardGrid$lambda$441$lambda$440$lambda$439$lambda$427$lambda$426$lambda$425(Function2 function2, Book book) {
        function2.invoke("SCAN_RETURN_QR", book);
        return Unit.INSTANCE;
    }

    static final Unit BookCardGrid$lambda$441$lambda$440$lambda$439$lambda$434$lambda$429$lambda$428(Function2 function2, Book book) {
        function2.invoke("SCAN_RETURN_QR", book);
        return Unit.INSTANCE;
    }

    static final Unit BookCardGrid$lambda$441$lambda$440$lambda$439$lambda$434$lambda$431$lambda$430(Function2 function2, Book book) {
        function2.invoke("SHOW_RETURN_QR", book);
        return Unit.INSTANCE;
    }

    static final Unit BookCardGrid$lambda$441$lambda$440$lambda$439$lambda$434$lambda$433$lambda$432(Function2 function2, Book book) {
        function2.invoke("CANCEL_RETURN", book);
        return Unit.INSTANCE;
    }

    static final Unit BookCardGrid$lambda$441$lambda$440$lambda$439$lambda$438$lambda$435(String str, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2083@117685L10,2080@117489L485:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(43762063, i, -1, "com.example.ui.screens.BookCardGrid.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:2080)");
            }
            Modifier modifier = PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(6.0f), Dp.constructor-impl(2.0f));
            TextStyle labelSmall = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall();
            TextKt.Text--4IGK_g(str, modifier, Color.Companion.getWhite-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.getEllipsis-gIe3tQ8(), false, 1, 0, (Function1) null, labelSmall, composer, 197040, 3120, 55256);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit BookCardGrid$lambda$441$lambda$440$lambda$439$lambda$438$lambda$437$lambda$436(BookViewModel bookViewModel, Book book) {
        bookViewModel.deleteBook(book.getId());
        return Unit.INSTANCE;
    }

    public static final void FeedbackDialog(final Function0<Unit> function0, final BookViewModel bookViewModel, final String str, Composer composer, final int i) {
        int i2;
        Composer composer2;
        final Function0<Unit> function1 = function0;
        Intrinsics.checkNotNullParameter(function1, "onDismiss");
        Intrinsics.checkNotNullParameter(bookViewModel, "viewModel");
        Intrinsics.checkNotNullParameter(str, "currentUser");
        Composer composerStartRestartGroup = composer.startRestartGroup(2006513341);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(FeedbackDialog)P(1,2)2109@118703L52,2110@118776L34,2111@118830L31,2112@118893L7,2180@121822L839,2200@122687L101,2119@119071L2725,2114@118906L3888:DashboardScreen.kt#2thlc2");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(bookViewModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i3 = i2;
        if ((i3 & BuildConfig.VERSION_CODE) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2006513341, i3, -1, "com.example.ui.screens.FeedbackDialog (DashboardScreen.kt:2108)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -180990063, "CC(remember):DashboardScreen.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateOf$default("Feedback / Suggestion", (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -180987745, "CC(remember):DashboardScreen.kt#9igjgp");
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final MutableState mutableState2 = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -180986020, "CC(remember):DashboardScreen.kt#9igjgp");
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final MutableState mutableState3 = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            CompositionLocal localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final Context context = (Context) objConsume;
            function1 = function0;
            composer2 = composerStartRestartGroup;
            AndroidAlertDialog_androidKt.AlertDialog-Oix01E0(function1, ComposableLambdaKt.rememberComposableLambda(646347637, true, new Function2() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda85
                public final Object invoke(Object obj, Object obj2) {
                    return DashboardScreenKt.FeedbackDialog$lambda$455(bookViewModel, str, context, function0, mutableState, mutableState3, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), (Modifier) null, ComposableLambdaKt.rememberComposableLambda(1593385523, true, new Function2() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda86
                public final Object invoke(Object obj, Object obj2) {
                    return DashboardScreenKt.FeedbackDialog$lambda$456(function1, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), (Function2) null, ComposableSingletons$DashboardScreenKt.INSTANCE.m289getLambda$1754543887$app(), ComposableLambdaKt.rememberComposableLambda(-1281024944, true, new Function2() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda87
                public final Object invoke(Object obj, Object obj2) {
                    return DashboardScreenKt.FeedbackDialog$lambda$475(context, mutableState2, mutableState, mutableState3, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), (Shape) null, 0L, 0L, 0L, 0L, 0.0f, (DialogProperties) null, composer2, (i3 & 14) | 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda89
                public final Object invoke(Object obj, Object obj2) {
                    return DashboardScreenKt.FeedbackDialog$lambda$476(function1, bookViewModel, str, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final String FeedbackDialog$lambda$444(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final boolean FeedbackDialog$lambda$447(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void FeedbackDialog$lambda$448(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String FeedbackDialog$lambda$450(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    static final Unit FeedbackDialog$lambda$475(final Context context, final MutableState mutableState, final MutableState mutableState2, final MutableState mutableState3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2120@119085L2701:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1281024944, i, -1, "com.example.ui.screens.FeedbackDialog.<anonymous> (DashboardScreen.kt:2120)");
            }
            Arrangement.Vertical vertical = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(12.0f));
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
            ComposerKt.sourceInformationMarkerStart(composer, 662838550, "C2122@119199L505,2121@119161L805,2138@119984L19,2140@120021L65,2144@120208L24,2145@120251L1174,2142@120104L1321,2172@121535L16,2170@121443L329:DashboardScreen.kt#2thlc2");
            ComposerKt.sourceInformationMarkerStart(composer, 437022995, "CC(remember):DashboardScreen.kt#9igjgp");
            boolean zChangedInstance = composer.changedInstance(context);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda79
                    public final Object invoke() {
                        return DashboardScreenKt.FeedbackDialog$lambda$475$lambda$474$lambda$458$lambda$457(context);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ButtonKt.Button((Function0) objRememberedValue, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.getLambda$679296170$app(), composer, 805306416, 508);
            DividerKt.HorizontalDivider-9IZ8Weo((Modifier) null, 0.0f, 0L, composer, 0, 7);
            TextKt.Text--4IGK_g("Send Feedback or Suggestion", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 196614, 0, 131038);
            boolean zFeedbackDialog$lambda$447 = FeedbackDialog$lambda$447(mutableState);
            ComposerKt.sourceInformationMarkerStart(composer, 437054802, "CC(remember):DashboardScreen.kt#9igjgp");
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda80
                    public final Object invoke(Object obj) {
                        return DashboardScreenKt.FeedbackDialog$lambda$475$lambda$474$lambda$460$lambda$459(mutableState, ((Boolean) obj).booleanValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox(zFeedbackDialog$lambda$447, (Function1) objRememberedValue2, (Modifier) null, ComposableLambdaKt.rememberComposableLambda(1865558596, true, new Function3() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda81
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return DashboardScreenKt.FeedbackDialog$lambda$475$lambda$474$lambda$471(mutableState2, mutableState, (ExposedDropdownMenuBoxScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer, 54), composer, 3120, 4);
            String strFeedbackDialog$lambda$450 = FeedbackDialog$lambda$450(mutableState3);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            ComposerKt.sourceInformationMarkerStart(composer, 437097258, "CC(remember):DashboardScreen.kt#9igjgp");
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda82
                    public final Object invoke(Object obj) {
                        return DashboardScreenKt.FeedbackDialog$lambda$475$lambda$474$lambda$473$lambda$472(mutableState3, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            OutlinedTextFieldKt.OutlinedTextField(strFeedbackDialog$lambda$450, (Function1) objRememberedValue3, modifierFillMaxWidth$default, false, false, (TextStyle) null, ComposableSingletons$DashboardScreenKt.INSTANCE.m291getLambda$1779344448$app(), (Function2) null, (Function2) null, (Function2) null, (Function2) null, (Function2) null, (Function2) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 5, 3, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, composer, 1573296, 905969664, 0, 7602104);
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

    static final Unit FeedbackDialog$lambda$475$lambda$474$lambda$458$lambda$457(Context context) {
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + context.getPackageName())));
        } catch (Exception unused) {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + context.getPackageName())));
        }
        return Unit.INSTANCE;
    }

    static final Unit FeedbackDialog$lambda$475$lambda$474$lambda$460$lambda$459(MutableState mutableState, boolean z) {
        FeedbackDialog$lambda$448(mutableState, !FeedbackDialog$lambda$447(mutableState));
        return Unit.INSTANCE;
    }

    static final Unit FeedbackDialog$lambda$475$lambda$474$lambda$471(final MutableState mutableState, final MutableState mutableState2, ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Composer composer, int i) {
        int i2;
        final MutableState mutableState3;
        Intrinsics.checkNotNullParameter(exposedDropdownMenuBoxScope, "$this$ExposedDropdownMenuBox");
        ComposerKt.sourceInformation(composer, "C2148@120370L2,2150@120454L65,2146@120273L374,2155@120777L20,2156@120820L587,2153@120668L739:DashboardScreen.kt#2thlc2");
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? composer.changed(exposedDropdownMenuBoxScope) : composer.changedInstance(exposedDropdownMenuBoxScope) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1865558596, i2, -1, "com.example.ui.screens.FeedbackDialog.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:2146)");
            }
            String strFeedbackDialog$lambda$444 = FeedbackDialog$lambda$444(mutableState);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ExposedDropdownMenuBoxScope.menuAnchor-fsE2BvY$default(exposedDropdownMenuBoxScope, Modifier.Companion, MenuAnchorType.Companion.getPrimaryNotEditable-Mg6Rgbw(), false, 2, (Object) null), 0.0f, 1, (Object) null);
            ComposerKt.sourceInformationMarkerStart(composer, 1800452134, "CC(remember):DashboardScreen.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda31
                    public final Object invoke(Object obj) {
                        return DashboardScreenKt.FeedbackDialog$lambda$475$lambda$474$lambda$471$lambda$462$lambda$461((String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            int i3 = i2;
            OutlinedTextFieldKt.OutlinedTextField(strFeedbackDialog$lambda$444, (Function1) objRememberedValue, modifierFillMaxWidth$default, false, true, (TextStyle) null, (Function2) null, (Function2) null, (Function2) null, ComposableLambdaKt.rememberComposableLambda(-355844051, true, new Function2() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda32
                public final Object invoke(Object obj, Object obj2) {
                    return DashboardScreenKt.FeedbackDialog$lambda$475$lambda$474$lambda$471$lambda$463(mutableState2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), (Function2) null, (Function2) null, (Function2) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, composer, 805330992, 0, 0, 8388072);
            boolean zFeedbackDialog$lambda$447 = FeedbackDialog$lambda$447(mutableState2);
            ComposerKt.sourceInformationMarkerStart(composer, 1800465176, "CC(remember):DashboardScreen.kt#9igjgp");
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                mutableState3 = mutableState2;
                objRememberedValue2 = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda34
                    public final Object invoke() {
                        return DashboardScreenKt.FeedbackDialog$lambda$475$lambda$474$lambda$471$lambda$465$lambda$464(mutableState3);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            } else {
                mutableState3 = mutableState2;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            exposedDropdownMenuBoxScope.ExposedDropdownMenu-vNxi1II(zFeedbackDialog$lambda$447, (Function0) objRememberedValue2, (Modifier) null, (ScrollState) null, false, (Shape) null, 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(1096649286, true, new Function3() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda35
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return DashboardScreenKt.FeedbackDialog$lambda$475$lambda$474$lambda$471$lambda$470(mutableState, mutableState3, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer, 54), composer, 48, (ExposedDropdownMenuBoxScope.$stable << 3) | 6 | ((i3 << 3) & 112), 1020);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit FeedbackDialog$lambda$475$lambda$474$lambda$471$lambda$462$lambda$461(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return Unit.INSTANCE;
    }

    static final Unit FeedbackDialog$lambda$475$lambda$474$lambda$471$lambda$463(MutableState mutableState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2150@120484L33:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-355844051, i, -1, "com.example.ui.screens.FeedbackDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:2150)");
            }
            ExposedDropdownMenuDefaults.INSTANCE.TrailingIcon(FeedbackDialog$lambda$447(mutableState), (Modifier) null, composer, ExposedDropdownMenuDefaults.$stable << 6, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit FeedbackDialog$lambda$475$lambda$474$lambda$471$lambda$465$lambda$464(MutableState mutableState) {
        FeedbackDialog$lambda$448(mutableState, false);
        return Unit.INSTANCE;
    }

    static final Unit FeedbackDialog$lambda$475$lambda$474$lambda$471$lambda$470(final MutableState mutableState, final MutableState mutableState2, ColumnScope columnScope, Composer composer, int i) {
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(columnScope, "$this$ExposedDropdownMenu");
        ComposerKt.sourceInformation(composer2, "C*2160@121113L25,2161@121182L147,2159@121056L303:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1096649286, i, -1, "com.example.ui.screens.FeedbackDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:2157)");
            }
            for (final String str : CollectionsKt.listOf(new String[]{"Feedback / Suggestion", "Feature Request", "UI Improvement", "Report an Issue", "Contact Support"})) {
                Function2 function2RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1207292870, true, new Function2() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda179
                    public final Object invoke(Object obj, Object obj2) {
                        return DashboardScreenKt.FeedbackDialog$lambda$475$lambda$474$lambda$471$lambda$470$lambda$469$lambda$466(str, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer2, 54);
                ComposerKt.sourceInformationMarkerStart(composer2, 592609513, "CC(remember):DashboardScreen.kt#9igjgp");
                boolean zChanged = composer2.changed(str);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda180
                        public final Object invoke() {
                            return DashboardScreenKt.FeedbackDialog$lambda$475$lambda$474$lambda$471$lambda$470$lambda$469$lambda$468$lambda$467(str, mutableState, mutableState2);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer2);
                AndroidMenu_androidKt.DropdownMenuItem(function2RememberComposableLambda, (Function0) objRememberedValue, (Modifier) null, (Function2) null, (Function2) null, false, (MenuItemColors) null, (PaddingValues) null, (MutableInteractionSource) null, composer2, 6, 508);
                composer2 = composer;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit FeedbackDialog$lambda$475$lambda$474$lambda$471$lambda$470$lambda$469$lambda$466(String str, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2160@121115L21:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1207292870, i, -1, "com.example.ui.screens.FeedbackDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:2160)");
            }
            TextKt.Text--4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit FeedbackDialog$lambda$475$lambda$474$lambda$471$lambda$470$lambda$469$lambda$468$lambda$467(String str, MutableState mutableState, MutableState mutableState2) {
        mutableState.setValue(str);
        FeedbackDialog$lambda$448(mutableState2, false);
        return Unit.INSTANCE;
    }

    static final Unit FeedbackDialog$lambda$475$lambda$474$lambda$473$lambda$472(MutableState mutableState, String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        mutableState.setValue(str);
        return Unit.INSTANCE;
    }

    static final Unit FeedbackDialog$lambda$455(final BookViewModel bookViewModel, final String str, final Context context, final Function0 function0, final MutableState mutableState, final MutableState mutableState2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2181@121853L718,2181@121836L815:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(646347637, i, -1, "com.example.ui.screens.FeedbackDialog.<anonymous> (DashboardScreen.kt:2181)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, -1630177053, "CC(remember):DashboardScreen.kt#9igjgp");
            boolean zChangedInstance = composer.changedInstance(bookViewModel) | composer.changed(str) | composer.changedInstance(context) | composer.changed(function0);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda135
                    public final Object invoke() {
                        return DashboardScreenKt.FeedbackDialog$lambda$455$lambda$454$lambda$453(bookViewModel, context, function0, mutableState, mutableState2, str);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ButtonKt.Button((Function0) objRememberedValue, (Modifier) null, !StringsKt.isBlank(FeedbackDialog$lambda$450(mutableState2)), (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.m276getLambda$1071646331$app(), composer, 805306368, 506);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit FeedbackDialog$lambda$455$lambda$454$lambda$453(BookViewModel bookViewModel, Context context, Function0 function0, MutableState mutableState, MutableState mutableState2, String str) {
        BookViewModel.addFeedback$default(bookViewModel, FeedbackDialog$lambda$444(mutableState), FeedbackDialog$lambda$450(mutableState2), null, 4, null);
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra("android.intent.extra.EMAIL", new String[]{"bookxchange.care@gmail.com"});
        intent.putExtra("android.intent.extra.SUBJECT", "BookXchange Feedback: " + FeedbackDialog$lambda$444(mutableState));
        intent.putExtra("android.intent.extra.TEXT", FeedbackDialog$lambda$450(mutableState2) + "\n\nSubmitted by: " + str);
        try {
            context.startActivity(Intent.createChooser(intent, "Send email..."));
        } catch (Exception unused) {
        }
        function0.invoke();
        return Unit.INSTANCE;
    }

    static final Unit FeedbackDialog$lambda$456(Function0 function0, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2201@122701L77:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1593385523, i, -1, "com.example.ui.screens.FeedbackDialog.<anonymous> (DashboardScreen.kt:2201)");
            }
            ButtonKt.TextButton(function0, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.getLambda$909010070$app(), composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void DeveloperDialog(final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        final Function0<Unit> function1;
        Intrinsics.checkNotNullParameter(function0, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(-810301906);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DeveloperDialog)2213@123036L50,2210@122886L200:DashboardScreen.kt#2thlc2");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function1 = function0;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-810301906, i2, -1, "com.example.ui.screens.DeveloperDialog (DashboardScreen.kt:2209)");
            }
            function1 = function0;
            AndroidDialog_androidKt.Dialog(function1, new DialogProperties(false, false, false, 3, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-132448315, true, new Function2() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda19
                public final Object invoke(Object obj, Object obj2) {
                    return DashboardScreenKt.DeveloperDialog$lambda$477(function0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i2 & 14) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda20
                public final Object invoke(Object obj, Object obj2) {
                    return DashboardScreenKt.DeveloperDialog$lambda$478(function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final Unit DeveloperDialog$lambda$477(Function0 function0, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2214@123046L34:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-132448315, i, -1, "com.example.ui.screens.DeveloperDialog.<anonymous> (DashboardScreen.kt:2214)");
            }
            DeveloperCard(function0, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void DeveloperCard(Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Function0<Unit> function1;
        int i3;
        final Function0<Unit> function2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2036023050);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DeveloperCard)2219@123142L2,2220@123179L7,2226@123408L11,2226@123366L62,2227@123463L38,2228@123508L10708,2221@123191L11025:DashboardScreen.kt#2thlc2");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            function1 = function0;
        } else if ((i & 6) == 0) {
            function1 = function0;
            i3 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            function1 = function0;
            i3 = i;
        }
        if ((i3 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function2 = function1;
        } else {
            if (i4 != 0) {
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1886937592, "CC(remember):DashboardScreen.kt#9igjgp");
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda108
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                function2 = (Function0) objRememberedValue;
            } else {
                function2 = function1;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2036023050, i3, -1, "com.example.ui.screens.DeveloperCard (DashboardScreen.kt:2219)");
            }
            CompositionLocal localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierFillMaxHeight = SizeKt.fillMaxHeight(SizeKt.fillMaxWidth(Modifier.Companion, 0.94f), 0.88f);
            Shape shape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(24.0f));
            CardColors cardColors = CardDefaults.INSTANCE.cardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0L, 0L, composerStartRestartGroup, CardDefaults.$stable << 12, 14);
            CardElevation cardElevation = CardDefaults.INSTANCE.cardElevation-aqJV_2Y(Dp.constructor-impl(8.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, (CardDefaults.$stable << 18) | 6, 62);
            composerStartRestartGroup = composerStartRestartGroup;
            CardKt.Card(modifierFillMaxHeight, shape, cardColors, cardElevation, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-2005855768, true, new Function3() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda109
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return DashboardScreenKt.DeveloperCard$lambda$486(function2, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda110
                public final Object invoke(Object obj, Object obj2) {
                    return DashboardScreenKt.DeveloperCard$lambda$487(function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final Unit DeveloperCard$lambda$486(final Function0 function0, ColumnScope columnScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(columnScope, "$this$Card");
        ComposerKt.sourceInformation(composer, "C2229@123518L10692:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2005855768, i, -1, "com.example.ui.screens.DeveloperCard.<anonymous> (DashboardScreen.kt:2229)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null);
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
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
            ComposerKt.sourceInformationMarkerStart(composer, -946696926, "C2233@123637L883,2257@124656L11,2255@124534L181,2265@124916L21,2261@124768L8877,2447@133814L386,2444@133701L499:DashboardScreen.kt#2thlc2");
            Modifier modifier = PaddingKt.padding-qDBjuR0(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(24.0f), Dp.constructor-impl(20.0f), Dp.constructor-impl(12.0f), Dp.constructor-impl(12.0f));
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer, 54);
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
            ComposerKt.sourceInformationMarkerStart(composer, 116481441, "C2242@124053L10,2244@124168L11,2240@123962L243,2246@124222L284:DashboardScreen.kt#2thlc2");
            TextStyle titleLarge = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleLarge();
            TextKt.Text--4IGK_g("About the Developer", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, titleLarge, composer, 196614, 0, 65498);
            IconButtonKt.IconButton(function0, (Modifier) null, false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.getLambda$1225387359$app(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            DividerKt.HorizontalDivider-9IZ8Weo(PaddingKt.padding-VpY3zN4$default(Modifier.Companion, Dp.constructor-impl(24.0f), 0.0f, 2, (Object) null), 0.0f, Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOutlineVariant-0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null), composer, 6, 2);
            Modifier modifier2 = PaddingKt.padding-VpY3zN4(ScrollKt.verticalScroll$default(ColumnScope.weight$default(columnScope2, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), 1.0f, false, 2, (Object) null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, (FlingBehavior) null, false, 14, (Object) null), Dp.constructor-impl(24.0f), Dp.constructor-impl(20.0f));
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            Arrangement.Vertical vertical = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(16.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(vertical, centerHorizontally, composer, 54);
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
            Updater.set-impl(composer4, measurePolicyColumnMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer4, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer4.getInserting() || !Intrinsics.areEqual(composer4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composer4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composer4.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.set-impl(composer4, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScope columnScope3 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1029144997, "C2270@125198L51,2271@125304L366,2282@125749L60,2290@126207L11,2281@125688L691,2297@126495L10,2300@126661L11,2295@126397L303,2306@126864L11,2304@126758L1117,2331@128034L11,2329@127928L1700,2362@129788L11,2360@129682L1211,2387@131053L11,2385@130947L1511,2420@132628L11,2418@132522L1109:DashboardScreen.kt#2thlc2");
            State stateAnimateFloat = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition("devPhotoPulse", composer, 6, 0), 0.5f, 1.0f, AnimationSpecKt.infiniteRepeatable-9IiC70o$default(AnimationSpecKt.tween$default(1800, 0, EasingKt.getFastOutSlowInEasing(), 2, (Object) null), RepeatMode.Reverse, 0L, 4, (Object) null), "borderAlpha", composer, InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9), 0);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.developer_photo, composer, 0), "Developer Photo", BorderKt.border-xT4_qwU(ClipKt.clip(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(120.0f)), RoundedCornerShapeKt.getCircleShape()), Dp.constructor-impl(3.5f), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), DeveloperCard$lambda$486$lambda$485$lambda$483$lambda$482(stateAnimateFloat), 0.0f, 0.0f, 0.0f, 14, (Object) null), RoundedCornerShapeKt.getCircleShape()), (Alignment) null, ContentScale.Companion.getCrop(), 0.0f, (ColorFilter) null, composer, 24624, 104);
            TextStyle titleMedium = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleMedium();
            TextKt.Text--4IGK_g("SHIVA SUMUKESH CHINDHULURU", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.box-impl(TextAlign.Companion.getCenter-e0LSkKk()), 0L, 0, false, 0, 0, (Function1) null, titleMedium, composer, 196614, 0, 64986);
            SurfaceKt.Surface-T9BRK9s((Modifier) null, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(16.0f)), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableSingletons$DashboardScreenKt.INSTANCE.getLambda$495501679$app(), composer, 12582912, 121);
            SurfaceKt.Surface-T9BRK9s(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(16.0f)), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableSingletons$DashboardScreenKt.INSTANCE.getLambda$1332307430$app(), composer, 12582918, 120);
            SurfaceKt.Surface-T9BRK9s(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(16.0f)), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableSingletons$DashboardScreenKt.INSTANCE.getLambda$1508635687$app(), composer, 12582918, 120);
            SurfaceKt.Surface-T9BRK9s(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(16.0f)), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), 0.35f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableSingletons$DashboardScreenKt.INSTANCE.getLambda$1684963944$app(), composer, 12582918, 120);
            SurfaceKt.Surface-T9BRK9s(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(16.0f)), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableSingletons$DashboardScreenKt.INSTANCE.getLambda$1861292201$app(), composer, 12582918, 120);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            SurfaceKt.Surface-T9BRK9s(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), (Shape) null, 0L, 0L, Dp.constructor-impl(2.0f), 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(1967982457, true, new Function2() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda1
                public final Object invoke(Object obj, Object obj2) {
                    return DashboardScreenKt.DeveloperCard$lambda$486$lambda$485$lambda$484(function0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 12607494, 110);
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

    static final Unit DeveloperCard$lambda$486$lambda$485$lambda$484(Function0 function0, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2448@133832L354:DashboardScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1967982457, i, -1, "com.example.ui.screens.DeveloperCard.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:2448)");
            }
            ButtonKt.Button(function0, PaddingKt.padding-VpY3zN4(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(20.0f), Dp.constructor-impl(12.0f)), false, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.m311getLambda$661557879$app(), composer, 805306416, 500);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void EcoImpactLiveRibbon(final String str, final int i, final String str2, final Function0<Unit> function0, final Function0<Unit> function1, Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(str, "ecoTreesSaved");
        Intrinsics.checkNotNullParameter(str2, "ecoCo2Saved");
        Intrinsics.checkNotNullParameter(function0, "onLeaderboardClick");
        Intrinsics.checkNotNullParameter(function1, "onShareEcoClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1432705506);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(EcoImpactLiveRibbon)P(1,2)2473@134526L66,2476@134772L3303,2470@134409L3666:DashboardScreen.kt#2thlc2");
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : FragmentTransaction.TRANSIT_EXIT_MASK;
        }
        if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1432705506, i3, -1, "com.example.ui.screens.EcoImpactLiveRibbon (DashboardScreen.kt:2469)");
            }
            CardColors cardColors = CardDefaults.INSTANCE.cardColors-ro_MJ88(Color.copy-wmQWz5c$default(ColorKt.Color(4279193906L), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0L, 0L, composerStartRestartGroup, (CardDefaults.$stable << 12) | 6, 14);
            composerStartRestartGroup = composerStartRestartGroup;
            CardKt.Card(function0, PaddingKt.padding-VpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), 0.0f, Dp.constructor-impl(4.0f), 1, (Object) null), false, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(18.0f)), cardColors, (CardElevation) null, BorderStrokeKt.BorderStroke-cXLIe8U(Dp.constructor-impl(1.0f), Color.copy-wmQWz5c$default(ColorKt.Color(4279286145L), 0.45f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), (MutableInteractionSource) null, ComposableLambdaKt.rememberComposableLambda(-646641005, true, new Function3() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda2
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return DashboardScreenKt.EcoImpactLiveRibbon$lambda$493(i, str2, str, function1, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 9) & 14) | 102236208, 164);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda3
                public final Object invoke(Object obj, Object obj2) {
                    return DashboardScreenKt.EcoImpactLiveRibbon$lambda$494(str, i, str2, function0, function1, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final Unit EcoImpactLiveRibbon$lambda$493(int i, String str, String str2, Function0 function0, ColumnScope columnScope, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(columnScope, "$this$Card");
        ComposerKt.sourceInformation(composer, "C2477@134782L3287:DashboardScreen.kt#2thlc2");
        if ((i2 & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-646641005, i2, -1, "com.example.ui.screens.EcoImpactLiveRibbon.<anonymous> (DashboardScreen.kt:2477)");
            }
            Modifier modifier = PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(14.0f), Dp.constructor-impl(12.0f));
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
            ComposerKt.sourceInformationMarkerStart(composer, 868195332, "C2482@135011L1969,2524@136994L1065:DashboardScreen.kt#2thlc2");
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
            ComposerKt.sourceInformationMarkerStart(composer, -960317973, "C2483@135113L324,2492@135454L40,2493@135511L1455:DashboardScreen.kt#2thlc2");
            SurfaceKt.Surface-T9BRK9s(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(38.0f)), RoundedCornerShapeKt.getCircleShape(), ColorKt.Color(4279286145L), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableSingletons$DashboardScreenKt.INSTANCE.m303getLambda$397961802$app(), composer, 12583302, 120);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f)), composer, 6);
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
            ColumnScope columnScope2 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1177308626, "C2494@135540L1061,2517@136788L10,2518@136856L11,2515@136622L326:DashboardScreen.kt#2thlc2");
            Alignment.Vertical centerVertically3 = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier3 = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3, composer, 48);
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
            Updater.set-impl(composer5, measurePolicyRowMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer5, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer5.getInserting() || !Intrinsics.areEqual(composer5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composer5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composer5.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.set-impl(composer5, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope3 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -594601139, "C2497@135751L10,2495@135618L293,2501@135936L39,2502@136000L579:DashboardScreen.kt#2thlc2");
            TextKt.Text--4IGK_g("Eco Impact: " + str2 + " Trees Saved", (Modifier) null, ColorKt.Color(4278556265L), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleSmall(), composer, 196992, 0, 65498);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            SurfaceKt.Surface-T9BRK9s((Modifier) null, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(6.0f)), Color.copy-wmQWz5c$default(ColorKt.Color(4279286145L), 0.2f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableSingletons$DashboardScreenKt.INSTANCE.m306getLambda$461865392$app(), composer, 12583296, 121);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            TextKt.Text--4IGK_g(i + "L water conserved • " + str + "kg CO₂ offset • Tap for Ranks", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 3072, 0, 65522);
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
            Alignment.Vertical centerVertically4 = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier4 = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically4, composer, 48);
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
            Composer composer6 = Updater.constructor-impl(composer);
            Updater.set-impl(composer6, measurePolicyRowMeasurePolicy4, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer6, currentCompositionLocalMap5, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash5 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer6.getInserting() || !Intrinsics.areEqual(composer6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                composer6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                composer6.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
            }
            Updater.set-impl(composer6, modifierMaterializeModifier5, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope4 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -751607364, "C2525@137064L412,2536@137493L39,2537@137549L496:DashboardScreen.kt#2thlc2");
            IconButtonKt.IconButton(function0, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(34.0f)), false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.getLambda$1925528431$app(), composer, 196656, 28);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            SurfaceKt.Surface-T9BRK9s((Modifier) null, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(20.0f)), ColorKt.Color(4279286145L), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableSingletons$DashboardScreenKt.INSTANCE.m275getLambda$1049938387$app(), composer, 12583296, 121);
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

    public static final void ReadingStreakBanner(final int i, final int i2, final int i3, final Function0<Unit> function0, Composer composer, final int i4) {
        int i5;
        Composer composer2;
        Intrinsics.checkNotNullParameter(function0, "onLogReadingClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-797998309);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ReadingStreakBanner)P(3,1)2564@138349L46,2567@138575L2863,2561@138233L3205:DashboardScreen.kt#2thlc2");
        if ((i4 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(i2) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= composerStartRestartGroup.changed(i3) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i4 & 3072) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i5 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-797998309, i5, -1, "com.example.ui.screens.ReadingStreakBanner (DashboardScreen.kt:2560)");
            }
            CardKt.Card(function0, PaddingKt.padding-VpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), 0.0f, Dp.constructor-impl(4.0f), 1, (Object) null), false, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(18.0f)), CardDefaults.INSTANCE.cardColors-ro_MJ88(ColorKt.Color(4294965229L), 0L, 0L, 0L, composerStartRestartGroup, (CardDefaults.$stable << 12) | 6, 14), (CardElevation) null, BorderStrokeKt.BorderStroke-cXLIe8U(Dp.constructor-impl(1.0f), Color.copy-wmQWz5c$default(ColorKt.Color(4294538006L), 0.35f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), (MutableInteractionSource) null, ComposableLambdaKt.rememberComposableLambda(994275728, true, new Function3() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda24
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return DashboardScreenKt.ReadingStreakBanner$lambda$500(i2, i3, i, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i5 >> 9) & 14) | 102236208, 164);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda25
                public final Object invoke(Object obj, Object obj2) {
                    return DashboardScreenKt.ReadingStreakBanner$lambda$501(i, i2, i3, function0, i4, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final Unit ReadingStreakBanner$lambda$500(final int i, final int i2, int i3, ColumnScope columnScope, Composer composer, int i4) {
        Intrinsics.checkNotNullParameter(columnScope, "$this$Card");
        ComposerKt.sourceInformation(composer, "C2568@138585L2847:DashboardScreen.kt#2thlc2");
        if ((i4 & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(994275728, i4, -1, "com.example.ui.screens.ReadingStreakBanner.<anonymous> (DashboardScreen.kt:2568)");
            }
            Modifier modifier = PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(14.0f), Dp.constructor-impl(11.0f));
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
            ComposerKt.sourceInformationMarkerStart(composer, -1070204257, "C2573@138814L2144,2616@140972L450:DashboardScreen.kt#2thlc2");
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
            ComposerKt.sourceInformationMarkerStart(composer, -139782401, "C2574@138916L324,2583@139257L40,2584@139314L1630:DashboardScreen.kt#2thlc2");
            SurfaceKt.Surface-T9BRK9s(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(36.0f)), RoundedCornerShapeKt.getCircleShape(), ColorKt.Color(4293548044L), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableSingletons$DashboardScreenKt.INSTANCE.getLambda$1432265395$app(), composer, 12583302, 120);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f)), composer, 6);
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
            ColumnScope columnScope2 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 190743270, "C2585@139343L1095,2609@140791L10,2607@140580L346:DashboardScreen.kt#2thlc2");
            Alignment.Vertical centerVertically3 = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier3 = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3, composer, 48);
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
            Updater.set-impl(composer5, measurePolicyRowMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer5, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer5.getInserting() || !Intrinsics.areEqual(composer5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composer5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composer5.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.set-impl(composer5, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope3 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1174079666, "C2588@139547L10,2586@139421L291,2592@139737L39,2596@139971L445,2593@139801L615:DashboardScreen.kt#2thlc2");
            TextKt.Text--4IGK_g(i3 + "-Day Reading Streak!", (Modifier) null, ColorKt.Color(4288295954L), 0L, (FontStyle) null, FontWeight.Companion.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleSmall(), composer, 196992, 0, 65498);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            SurfaceKt.Surface-T9BRK9s((Modifier) null, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(6.0f)), Color.copy-wmQWz5c$default(ColorKt.Color(4294538006L), 0.2f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(1368915789, true, new Function2() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda90
                public final Object invoke(Object obj, Object obj2) {
                    return DashboardScreenKt.ReadingStreakBanner$lambda$500$lambda$499$lambda$498$lambda$497$lambda$496$lambda$495(i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 12583296, 121);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            int iCoerceIn = RangesKt.coerceIn((int) ((i / i2) * 100.0f), 0, 100);
            TextKt.Text--4IGK_g(iCoerceIn >= 100 ? "Goal completed today! 🎉 • Tap to log more" : iCoerceIn + "% of daily " + i2 + "m goal • Tap to log +10m", (Modifier) null, ColorKt.Color(4286328082L), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 3456, 0, 65522);
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
            SurfaceKt.Surface-T9BRK9s((Modifier) null, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(20.0f)), ColorKt.Color(4293548044L), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableSingletons$DashboardScreenKt.INSTANCE.getLambda$1814009743$app(), composer, 12583296, 121);
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

    static final Unit ReadingStreakBanner$lambda$500$lambda$499$lambda$498$lambda$497$lambda$496$lambda$495(int i, int i2, Composer composer, int i3) {
        ComposerKt.sourceInformation(composer, "C2597@140001L389:DashboardScreen.kt#2thlc2");
        if ((i3 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1368915789, i3, -1, "com.example.ui.screens.ReadingStreakBanner.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:2597)");
            }
            TextKt.Text--4IGK_g(i + "/" + i2 + "m", PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(5.0f), Dp.constructor-impl(1.0f)), ColorKt.Color(4290920716L), TextUnitKt.getSp(9), (FontStyle) null, FontWeight.Companion.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 200112, 0, 131024);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void AIMatchmakerBanner(final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(function0, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(218180267);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(AIMatchmakerBanner)2637@141652L11,2637@141610L91,2638@141781L11,2634@141504L2554:DashboardScreen.kt#2thlc2");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(218180267, i2, -1, "com.example.ui.screens.AIMatchmakerBanner (DashboardScreen.kt:2633)");
            }
            CardKt.Card(function0, PaddingKt.padding-VpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), 0.0f, Dp.constructor-impl(4.0f), 1, (Object) null), false, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(18.0f)), CardDefaults.INSTANCE.cardColors-ro_MJ88(Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), 0.45f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0L, 0L, composerStartRestartGroup, CardDefaults.$stable << 12, 14), (CardElevation) null, BorderStrokeKt.BorderStroke-cXLIe8U(Dp.constructor-impl(1.0f), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0.25f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), (MutableInteractionSource) null, ComposableSingletons$DashboardScreenKt.INSTANCE.m292getLambda$1795038698$app(), composerStartRestartGroup, (i2 & 14) | 100663344, 164);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda62
                public final Object invoke(Object obj, Object obj2) {
                    return DashboardScreenKt.AIMatchmakerBanner$lambda$502(function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ReadingCompanionBanner(final Book book, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(book, "book");
        Intrinsics.checkNotNullParameter(function0, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1642080957);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ReadingCompanionBanner)2699@144288L11,2699@144246L92,2700@144418L11,2702@144535L1857,2696@144140L2252:DashboardScreen.kt#2thlc2");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(book) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1642080957, i2, -1, "com.example.ui.screens.ReadingCompanionBanner (DashboardScreen.kt:2695)");
            }
            CardKt.Card(function0, PaddingKt.padding-VpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), 0.0f, Dp.constructor-impl(4.0f), 1, (Object) null), false, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(18.0f)), CardDefaults.INSTANCE.cardColors-ro_MJ88(Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSecondaryContainer-0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0L, 0L, composerStartRestartGroup, CardDefaults.$stable << 12, 14), (CardElevation) null, BorderStrokeKt.BorderStroke-cXLIe8U(Dp.constructor-impl(1.0f), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSecondary-0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), (MutableInteractionSource) null, ComposableLambdaKt.rememberComposableLambda(1953471410, true, new Function3() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda102
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return DashboardScreenKt.ReadingCompanionBanner$lambda$505(book, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 3) & 14) | 100663344, 164);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda103
                public final Object invoke(Object obj, Object obj2) {
                    return DashboardScreenKt.ReadingCompanionBanner$lambda$506(book, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final Unit ReadingCompanionBanner$lambda$505(Book book, ColumnScope columnScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(columnScope, "$this$Card");
        ComposerKt.sourceInformation(composer, "C2703@144545L1841:DashboardScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1953471410, i, -1, "com.example.ui.screens.ReadingCompanionBanner.<anonymous> (DashboardScreen.kt:2703)");
            }
            Modifier modifier = PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(14.0f), Dp.constructor-impl(10.0f));
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
            ComposerKt.sourceInformationMarkerStart(composer, -1027669779, "C2709@144796L11,2707@144712L534,2721@145259L40,2722@145312L886,2743@146341L11,2740@146211L165:DashboardScreen.kt#2thlc2");
            SurfaceKt.Surface-T9BRK9s(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(36.0f)), RoundedCornerShapeKt.getCircleShape(), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSecondary-0d7_KjU(), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableSingletons$DashboardScreenKt.INSTANCE.m284getLambda$1558931151$app(), composer, 12582918, 120);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f)), composer, 6);
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
            ColumnScope columnScope2 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -790445464, "C2725@145480L10,2723@145369L319,2735@146032L10,2736@146096L11,2733@145901L283:DashboardScreen.kt#2thlc2");
            TextKt.Text--4IGK_g("Currently Reading: " + book.getTitle(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.getEllipsis-gIe3tQ8(), false, 1, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 3120, 55262);
            Integer pageCount = book.getPageCount();
            int iCoerceAtLeast = RangesKt.coerceAtLeast(pageCount != null ? pageCount.intValue() : 300, 10);
            int borrowerCurrentPage = book.getBorrowerCurrentPage();
            TextKt.Text--4IGK_g("Page " + borrowerCurrentPage + " of " + iCoerceAtLeast + " (" + RangesKt.coerceIn((borrowerCurrentPage * 100) / iCoerceAtLeast, 0, 100) + "%) • Tap for Bookmark", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSecondaryContainer-0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 3072, 0, 65522);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            IconKt.Icon-ww6aTOc(ChevronRightKt.getChevronRight(Icons.INSTANCE.getDefault()), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSecondary-0d7_KjU(), composer, 48, 4);
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

    public static final void CuratedForYouSection(final List<Book> list, final Function1<? super Book, Unit> function1, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(list, "books");
        Intrinsics.checkNotNullParameter(function1, "onBookClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1593622910);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(CuratedForYouSection)2754@146497L2335:DashboardScreen.kt#2thlc2");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1593622910, i3, -1, "com.example.ui.screens.CuratedForYouSection (DashboardScreen.kt:2753)");
            }
            Modifier modifier = PaddingKt.padding-VpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), 0.0f, Dp.constructor-impl(6.0f), 1, (Object) null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            Composer composer2 = Updater.constructor-impl(composerStartRestartGroup);
            Updater.set-impl(composer2, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer2, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer2.getInserting() || !Intrinsics.areEqual(composer2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composer2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composer2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.set-impl(composer2, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1402932448, "C2755@146575L512,2769@147096L40,2770@147206L1620,2770@147145L1681:DashboardScreen.kt#2thlc2");
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier2 = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier2);
            Function0 constructor2 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composer3 = Updater.constructor-impl(composerStartRestartGroup);
            Updater.set-impl(composer3, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer3, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composer3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composer3.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.set-impl(composer3, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1315230387, "C2759@146770L11,2756@146641L211,2762@146865L39,2765@146996L10,2763@146917L160:DashboardScreen.kt#2thlc2");
            IconKt.Icon-ww6aTOc(AutoAwesomeKt.getAutoAwesome(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getPrimary-0d7_KjU(), composerStartRestartGroup, 432, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composerStartRestartGroup, 6);
            TextKt.Text--4IGK_g("Curated For You", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getTitleSmall(), composerStartRestartGroup, 196614, 0, 65502);
            composerStartRestartGroup = composerStartRestartGroup;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composerStartRestartGroup, 6);
            Arrangement.Horizontal horizontal = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(10.0f));
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1846390764, "CC(remember):DashboardScreen.kt#9igjgp");
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(list) | ((i3 & 112) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda177
                    public final Object invoke(Object obj) {
                        return DashboardScreenKt.CuratedForYouSection$lambda$512$lambda$511$lambda$510(list, function1, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            LazyDslKt.LazyRow((Modifier) null, (LazyListState) null, (PaddingValues) null, false, horizontal, (Alignment.Vertical) null, (FlingBehavior) null, false, (Function1) objRememberedValue, composerStartRestartGroup, 24576, 239);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.DashboardScreenKt$$ExternalSyntheticLambda178
                public final Object invoke(Object obj, Object obj2) {
                    return DashboardScreenKt.CuratedForYouSection$lambda$513(list, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final String DashboardScreen$lambda$0(State<String> state) {
        return (String) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String DashboardScreen$lambda$1(State<String> state) {
        return (String) state.getValue();
    }

    private static final List<Book> DashboardScreen$lambda$2(State<? extends List<Book>> state) {
        return (List) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String DashboardScreen$lambda$3(State<String> state) {
        return (String) state.getValue();
    }

    private static final User DashboardScreen$lambda$5(State<User> state) {
        return (User) state.getValue();
    }

    private static final String DashboardScreen$lambda$6(State<String> state) {
        return (String) state.getValue();
    }

    private static final boolean DashboardScreen$lambda$18(State<Boolean> state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    private static final boolean DashboardScreen$lambda$21(State<Boolean> state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<WishlistRequest> DashboardScreen$lambda$23(State<? extends List<WishlistRequest>> state) {
        return (List) state.getValue();
    }

    static final Unit DashboardScreen$lambda$120$lambda$119$lambda$113$lambda$112(final List list, final MutableState mutableState, LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyRow");
        final DashboardScreenKt$DashboardScreen$lambda$120$lambda$119$lambda$113$lambda$112$$inlined$items$default$1 dashboardScreenKt$DashboardScreen$lambda$120$lambda$119$lambda$113$lambda$112$$inlined$items$default$1 = new Function1() { // from class: com.example.ui.screens.DashboardScreenKt$DashboardScreen$lambda$120$lambda$119$lambda$113$lambda$112$$inlined$items$default$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final Void m370invoke(String str) {
                return null;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m370invoke((String) obj);
            }
        };
        lazyListScope.items(list.size(), (Function1) null, new Function1<Integer, Object>() { // from class: com.example.ui.screens.DashboardScreenKt$DashboardScreen$lambda$120$lambda$119$lambda$113$lambda$112$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i) {
                return dashboardScreenKt$DashboardScreen$lambda$120$lambda$119$lambda$113$lambda$112$$inlined$items$default$1.invoke(list.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.screens.DashboardScreenKt$DashboardScreen$lambda$120$lambda$119$lambda$113$lambda$112$$inlined$items$default$4
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
                composer.startReplaceGroup(729341719);
                ComposerKt.sourceInformation(composer, "C*316@16469L27,317@16538L14,314@16346L236:DashboardScreen.kt#2thlc2");
                boolean zAreEqual = Intrinsics.areEqual(DashboardScreenKt.DashboardScreen$lambda$56(mutableState), str);
                ComposerKt.sourceInformationMarkerStart(composer, -115016453, "CC(remember):DashboardScreen.kt#9igjgp");
                boolean zChanged = composer.changed(str);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    final MutableState mutableState2 = mutableState;
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.DashboardScreenKt$DashboardScreen$7$1$3$1$1$1$1
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m369invoke();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m369invoke() {
                            mutableState2.setValue(str);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                ChipKt.FilterChip(zAreEqual, (Function0) objRememberedValue, ComposableLambdaKt.rememberComposableLambda(1443221101, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.ui.screens.DashboardScreenKt$DashboardScreen$7$1$3$1$1$2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i4) {
                        ComposerKt.sourceInformation(composer2, "C317@16540L10:DashboardScreen.kt#2thlc2");
                        if ((i4 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1443221101, i4, -1, "com.example.ui.screens.DashboardScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:317)");
                        }
                        TextKt.Text--4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer2, 0, 0, 131070);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), (Modifier) null, false, (Function2) null, (Function2) null, (Shape) null, (SelectableChipColors) null, (SelectableChipElevation) null, (BorderStroke) null, (MutableInteractionSource) null, composer, 384, 0, 4088);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    static final Unit DashboardScreen$lambda$276$lambda$275$lambda$209$lambda$208$lambda$207(final List list, final List list2, final List list3, final BookViewModel bookViewModel, final String str, final State state, final State state2, LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyRow");
        final DashboardScreenKt$DashboardScreen$lambda$276$lambda$275$lambda$209$lambda$208$lambda$207$$inlined$items$default$1 dashboardScreenKt$DashboardScreen$lambda$276$lambda$275$lambda$209$lambda$208$lambda$207$$inlined$items$default$1 = new Function1() { // from class: com.example.ui.screens.DashboardScreenKt$DashboardScreen$lambda$276$lambda$275$lambda$209$lambda$208$lambda$207$$inlined$items$default$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final Void m371invoke(String str2) {
                return null;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m371invoke((String) obj);
            }
        };
        lazyListScope.items(list.size(), (Function1) null, new Function1<Integer, Object>() { // from class: com.example.ui.screens.DashboardScreenKt$DashboardScreen$lambda$276$lambda$275$lambda$209$lambda$208$lambda$207$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i) {
                return dashboardScreenKt$DashboardScreen$lambda$276$lambda$275$lambda$209$lambda$208$lambda$207$$inlined$items$default$1.invoke(list.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.screens.DashboardScreenKt$DashboardScreen$lambda$276$lambda$275$lambda$209$lambda$208$lambda$207$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                final ImageVector book;
                ComposerKt.sourceInformation(composer, "C152@7074L22:LazyDsl.kt#428nma");
                int i3 = (i2 & 6) == 0 ? i2 | (composer.changed(lazyItemScope) ? 4 : 2) : i2;
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
                final String str2 = (String) list.get(i);
                composer.startReplaceGroup(-1219944953);
                ComposerKt.sourceInformation(composer, "C*799@40986L11,800@41083L11,798@40897L246,784@39846L40,788@40134L642,782@39733L1436:DashboardScreen.kt#2thlc2");
                int size = 0;
                switch (str2.hashCode()) {
                    case -1414529708:
                        if (str2.equals("BORROWED")) {
                            List list4 = list2;
                            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                                Iterator it = list4.iterator();
                                while (it.hasNext()) {
                                    if (Intrinsics.areEqual(((Book) it.next()).getStatus(), "BORROWED") && (size = size + 1) < 0) {
                                        CollectionsKt.throwCountOverflow();
                                    }
                                }
                            }
                        }
                        break;
                    case -814438578:
                        if (str2.equals("REQUESTED")) {
                            List list5 = list2;
                            if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                                Iterator it2 = list5.iterator();
                                while (it2.hasNext()) {
                                    if (Intrinsics.areEqual(((Book) it2.next()).getStatus(), "REQUESTED") && (size = size + 1) < 0) {
                                        CollectionsKt.throwCountOverflow();
                                    }
                                }
                            }
                        }
                        break;
                    case -704089541:
                        if (str2.equals("RECOMMENDED")) {
                            size = list3.size();
                        }
                        break;
                    case 64897:
                        if (str2.equals("ALL")) {
                            size = list2.size();
                        }
                        break;
                    case 528814557:
                        if (str2.equals("BOOKMARKS")) {
                            size = DashboardScreenKt.DashboardScreen$lambda$23(state).size();
                        }
                        break;
                    case 1219012151:
                        if (str2.equals("MY_BOOKS")) {
                            List list6 = list2;
                            if (!(list6 instanceof Collection) || !list6.isEmpty()) {
                                Iterator it3 = list6.iterator();
                                while (it3.hasNext()) {
                                    if (DashboardScreenKt.isBookOwner((Book) it3.next(), str) && (size = size + 1) < 0) {
                                        CollectionsKt.throwCountOverflow();
                                    }
                                }
                            }
                        }
                        break;
                    case 2052692649:
                        if (str2.equals("AVAILABLE")) {
                            List list7 = list2;
                            if (!(list7 instanceof Collection) || !list7.isEmpty()) {
                                Iterator it4 = list7.iterator();
                                while (it4.hasNext()) {
                                    if (((Book) it4.next()).isAvailable() && (size = size + 1) < 0) {
                                        CollectionsKt.throwCountOverflow();
                                    }
                                }
                            }
                        }
                        break;
                }
                Function2 function2 = null;
                switch (str2) {
                    case "BORROWED":
                        book = BookKt.getBook(Icons.INSTANCE.getDefault());
                        break;
                    case "REQUESTED":
                        book = EmailKt.getEmail(Icons.INSTANCE.getDefault());
                        break;
                    case "RECOMMENDED":
                        book = StarKt.getStar(Icons.INSTANCE.getDefault());
                        break;
                    case "ALL":
                        book = AutoStoriesKt.getAutoStories(Icons.INSTANCE.getDefault());
                        break;
                    case "BOOKMARKS":
                        book = BookmarkKt.getBookmark(Icons.INSTANCE.getDefault());
                        break;
                    case "MY_BOOKS":
                        book = LibraryBooksKt.getLibraryBooks(Icons.AutoMirrored.Filled.INSTANCE);
                        break;
                    case "AVAILABLE":
                        book = CheckCircleKt.getCheckCircle(Icons.INSTANCE.getDefault());
                        break;
                    default:
                        book = null;
                        break;
                }
                boolean zAreEqual = Intrinsics.areEqual(DashboardScreenKt.DashboardScreen$lambda$1(state2), str2);
                if (book != null) {
                    composer.startReplaceGroup(-1218613907);
                    ComposerKt.sourceInformation(composer, "786@39982L74");
                    function2 = (Function2) ComposableLambdaKt.rememberComposableLambda(385521584, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.ui.screens.DashboardScreenKt$DashboardScreen$32$3$1$2$1$1$1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i4) {
                            ComposerKt.sourceInformation(composer2, "C786@39984L70:DashboardScreen.kt#2thlc2");
                            if ((i4 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(385521584, i4, -1, "com.example.ui.screens.DashboardScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:786)");
                            }
                            IconKt.Icon-ww6aTOc(book, (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), 0L, composer2, 432, 8);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer, 54);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-1218475214);
                    composer.endReplaceGroup();
                }
                Function2 function3 = function2;
                Shape shape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(16.0f));
                final int i4 = size;
                SelectableChipColors selectableChipColors = FilterChipDefaults.INSTANCE.filterChipColors-XqyqHi0(0L, 0L, 0L, 0L, 0L, 0L, 0L, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), 0L, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnPrimaryContainer-0d7_KjU(), 0L, 0L, composer, 0, FilterChipDefaults.$stable << 6, 3455);
                ComposerKt.sourceInformationMarkerStart(composer, -1009144813, "CC(remember):DashboardScreen.kt#9igjgp");
                boolean zChangedInstance = composer.changedInstance(bookViewModel) | composer.changed(str2);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                    final BookViewModel bookViewModel2 = bookViewModel;
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.DashboardScreenKt$DashboardScreen$32$3$1$2$1$1$2$1
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m366invoke();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m366invoke() {
                            bookViewModel2.updateFilterStatus(str2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                final State state3 = state2;
                ChipKt.FilterChip(zAreEqual, (Function0) objRememberedValue, ComposableLambdaKt.rememberComposableLambda(-1947805032, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.ui.screens.DashboardScreenKt$DashboardScreen$32$3$1$2$1$1$3
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Code duplicated, block: B:29:0x008a  */
                    /* JADX WARN: Code duplicated, block: B:31:0x00a0  */
                    /* JADX WARN: Code duplicated, block: B:33:0x00b0  */
                    /* JADX WARN: Code duplicated, block: B:34:0x00be  */
                    public final void invoke(Composer composer2, int i5) {
                        String str3;
                        String lowerCase;
                        char cCharAt;
                        String strValueOf;
                        ComposerKt.sourceInformation(composer2, "C795@40653L92:DashboardScreen.kt#2thlc2");
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1947805032, i5, -1, "com.example.ui.screens.DashboardScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:789)");
                        }
                        String str4 = str2;
                        int iHashCode = str4.hashCode();
                        if (iHashCode != -704089541) {
                            if (iHashCode != 64897) {
                                if (iHashCode == 1219012151 && str4.equals("MY_BOOKS")) {
                                    str3 = "My Books (" + i4 + ")";
                                } else {
                                    lowerCase = str2.toLowerCase(Locale.ROOT);
                                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                                    if (lowerCase.length() > 0) {
                                        StringBuilder sb = new StringBuilder();
                                        cCharAt = lowerCase.charAt(0);
                                        if (Character.isLowerCase(cCharAt)) {
                                            Locale locale = Locale.getDefault();
                                            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                                            strValueOf = CharsKt.titlecase(cCharAt, locale);
                                        } else {
                                            strValueOf = String.valueOf(cCharAt);
                                        }
                                        StringBuilder sbAppend = sb.append((Object) strValueOf);
                                        String strSubstring = lowerCase.substring(1);
                                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                                        lowerCase = sbAppend.append(strSubstring).toString();
                                    }
                                    str3 = lowerCase + " (" + i4 + ")";
                                }
                            } else if (str4.equals("ALL")) {
                                str3 = "All Books (" + i4 + ")";
                            } else {
                                lowerCase = str2.toLowerCase(Locale.ROOT);
                                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                                if (lowerCase.length() > 0) {
                                    StringBuilder sb2 = new StringBuilder();
                                    cCharAt = lowerCase.charAt(0);
                                    if (Character.isLowerCase(cCharAt)) {
                                        Locale locale2 = Locale.getDefault();
                                        Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
                                        strValueOf = CharsKt.titlecase(cCharAt, locale2);
                                    } else {
                                        strValueOf = String.valueOf(cCharAt);
                                    }
                                    StringBuilder sbAppend2 = sb2.append((Object) strValueOf);
                                    String strSubstring2 = lowerCase.substring(1);
                                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                                    lowerCase = sbAppend2.append(strSubstring2).toString();
                                }
                                str3 = lowerCase + " (" + i4 + ")";
                            }
                        } else if (str4.equals("RECOMMENDED")) {
                            str3 = "For You (" + i4 + ")";
                        } else {
                            lowerCase = str2.toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                            if (lowerCase.length() > 0) {
                                StringBuilder sb3 = new StringBuilder();
                                cCharAt = lowerCase.charAt(0);
                                if (Character.isLowerCase(cCharAt)) {
                                    Locale locale3 = Locale.getDefault();
                                    Intrinsics.checkNotNullExpressionValue(locale3, "getDefault(...)");
                                    strValueOf = CharsKt.titlecase(cCharAt, locale3);
                                } else {
                                    strValueOf = String.valueOf(cCharAt);
                                }
                                StringBuilder sbAppend3 = sb3.append((Object) strValueOf);
                                String strSubstring3 = lowerCase.substring(1);
                                Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                                lowerCase = sbAppend3.append(strSubstring3).toString();
                            }
                            str3 = lowerCase + " (" + i4 + ")";
                        }
                        TextKt.Text--4IGK_g(str3, (Modifier) null, 0L, 0L, (FontStyle) null, Intrinsics.areEqual(DashboardScreenKt.DashboardScreen$lambda$1(state3), str2) ? FontWeight.Companion.getBold() : FontWeight.Companion.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer2, 0, 0, 131038);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), (Modifier) null, false, function3, (Function2) null, shape, selectableChipColors, (SelectableChipElevation) null, (BorderStroke) null, (MutableInteractionSource) null, composer, 384, 0, 3672);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    private static final float BookCard$lambda$372$lambda$312$lambda$304$lambda$303$lambda$296(State<Float> state) {
        return ((Number) state.getValue()).floatValue();
    }

    private static final float BookCardGrid$lambda$441$lambda$440$lambda$439$lambda$395$lambda$388(State<Float> state) {
        return ((Number) state.getValue()).floatValue();
    }

    private static final float DeveloperCard$lambda$486$lambda$485$lambda$483$lambda$482(State<Float> state) {
        return ((Number) state.getValue()).floatValue();
    }

    static final Unit CuratedForYouSection$lambda$512$lambda$511$lambda$510(final List list, final Function1 function1, LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyRow");
        final DashboardScreenKt$CuratedForYouSection$lambda$512$lambda$511$lambda$510$$inlined$items$default$1 dashboardScreenKt$CuratedForYouSection$lambda$512$lambda$511$lambda$510$$inlined$items$default$1 = new Function1() { // from class: com.example.ui.screens.DashboardScreenKt$CuratedForYouSection$lambda$512$lambda$511$lambda$510$$inlined$items$default$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final Void m365invoke(Book book) {
                return null;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m365invoke((Book) obj);
            }
        };
        lazyListScope.items(list.size(), (Function1) null, new Function1<Integer, Object>() { // from class: com.example.ui.screens.DashboardScreenKt$CuratedForYouSection$lambda$512$lambda$511$lambda$510$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i) {
                return dashboardScreenKt$CuratedForYouSection$lambda$512$lambda$511$lambda$510$$inlined$items$default$1.invoke(list.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.screens.DashboardScreenKt$CuratedForYouSection$lambda$512$lambda$511$lambda$510$$inlined$items$default$4
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
                final Book book = (Book) list.get(i);
                composer.startReplaceGroup(204483649);
                ComposerKt.sourceInformation(composer, "C*2774@147365L11,2775@147476L21,2776@147516L1286,2772@147259L1543:DashboardScreen.kt#2thlc2");
                Shape shape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(14.0f));
                long j = Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
                Modifier modifier = SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(130.0f));
                ComposerKt.sourceInformationMarkerStart(composer, -686134992, "CC(remember):DashboardScreen.kt#9igjgp");
                boolean zChanged = composer.changed(function1) | composer.changedInstance(book);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    final Function1 function2 = function1;
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.DashboardScreenKt$CuratedForYouSection$1$2$1$1$1$1
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m364invoke();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m364invoke() {
                            function2.invoke(book);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                SurfaceKt.Surface-T9BRK9s(ClickableKt.clickable-XHw0xAI$default(modifier, false, (String) null, (Role) null, (Function0) objRememberedValue, 7, (Object) null), shape, j, 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(330712278, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.ui.screens.DashboardScreenKt$CuratedForYouSection$1$2$1$1$2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i4) {
                        ComposerKt.sourceInformation(composer2, "C2777@147538L1246:DashboardScreen.kt#2thlc2");
                        if ((i4 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(330712278, i4, -1, "com.example.ui.screens.CuratedForYouSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:2777)");
                        }
                        Modifier modifier2 = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f));
                        Book book2 = book;
                        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, 0);
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
                        ComposerKt.sourceInformationMarkerStart(composer2, 1396363551, "C2790@148438L40,2791@148586L10,2791@148503L106,2792@148688L10,2792@148733L11,2792@148634L128:DashboardScreen.kt#2thlc2");
                        String imageUrl = book2.getImageUrl();
                        if (imageUrl == null || StringsKt.isBlank(imageUrl)) {
                            composer2.startReplaceGroup(1396782298);
                            ComposerKt.sourceInformation(composer2, "2786@148162L11,2786@148083L304");
                            Modifier modifier3 = BackgroundKt.background-bw27NRU$default(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(110.0f)), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), (Shape) null, 2, (Object) null);
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
                            ComposerKt.sourceInformationMarkerStart(composer2, 1177111696, "C2787@148337L11,2787@148264L93:DashboardScreen.kt#2thlc2");
                            IconKt.Icon-ww6aTOc(BookKt.getBook(Icons.INSTANCE.getDefault()), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer2, 48, 4);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(1396375981);
                            ComposerKt.sourceInformation(composer2, "2779@147672L349");
                            BookImageDisplayKt.BookImageDisplay(book2.getImageUrl(), book2.getTitle(), ClipKt.clip(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(110.0f)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(8.0f))), ContentScale.Companion.getCrop(), null, composer2, 3072, 16);
                            composer2.endReplaceGroup();
                        }
                        SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer2, 6);
                        TextKt.Text--4IGK_g(book2.getTitle(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getLabelMedium(), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 3072, 57310);
                        TextKt.Text--4IGK_g(book2.getAuthor(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getLabelSmall(), composer2, 0, 3072, 57338);
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
                }, composer, 54), composer, 12582912, 120);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }
}
