package com.example.ui.screens;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Base64;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
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
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.ChatKt;
import androidx.compose.material.icons.automirrored.filled.MenuBookKt;
import androidx.compose.material.icons.filled.AccountCircleKt;
import androidx.compose.material.icons.filled.AutoStoriesKt;
import androidx.compose.material.icons.filled.BookKt;
import androidx.compose.material.icons.filled.BookmarkAddKt;
import androidx.compose.material.icons.filled.GppGoodKt;
import androidx.compose.material.icons.filled.SavingsKt;
import androidx.compose.material.icons.filled.StarKt;
import androidx.compose.material.icons.filled.SwapHorizKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.BadgeKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonElevation;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.IconButtonColors;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TabKt;
import androidx.compose.material3.TabRowKt;
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
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
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
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.fragment.app.FragmentTransaction;
import androidx.profileinstaller.ProfileVerifier;
import coil.compose.SingletonAsyncImageKt;
import com.example.BuildConfig;
import com.example.data.Book;
import com.example.data.Message;
import com.example.data.Review;
import com.example.data.User;
import com.example.data.WishlistRequest;
import com.example.ui.BookViewModel;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: ProfileScreen.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000b\u001aM\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0007¢\u0006\u0002\u0010\r\u001aI\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0007¢\u0006\u0002\u0010\u0014\u001a/\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a%\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010!\u001a\u001b\u0010\"\u001a\u00020\u00012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0007¢\u0006\u0002\u0010$\u001a#\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0007¢\u0006\u0002\u0010)\u001a7\u0010*\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010+\u001a\u00020\u00062\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0002\u0010-\u001a#\u0010.\u001a\u00020\u00012\u0006\u0010/\u001a\u00020\u00042\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0007¢\u0006\u0002\u00101\u001aE\u00102\u001a\u00020\u00012\f\u00103\u001a\b\u0012\u0004\u0012\u0002040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0002\u00105\u001a\u0015\u00106\u001a\u00020\u00012\u0006\u00107\u001a\u000208H\u0007¢\u0006\u0002\u00109\u001a\u001d\u0010:\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010;\u001a=\u0010<\u001a\u00020\u00012\f\u0010=\u001a\b\u0012\u0004\u0012\u00020'0\u00032\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00010\nH\u0003¢\u0006\u0002\u0010>\u001a9\u0010?\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0007¢\u0006\u0002\u0010A¨\u0006B²\u0006\n\u0010C\u001a\u00020\u0006X\u008a\u008e\u0002²\u0006\f\u0010D\u001a\u0004\u0018\u00010\u0010X\u008a\u0084\u0002²\u0006\f\u0010E\u001a\u0004\u0018\u00010\u0006X\u008a\u0084\u0002²\u0006\f\u0010\u0011\u001a\u0004\u0018\u00010\u0006X\u008a\u0084\u0002²\u0006\u0010\u0010F\u001a\b\u0012\u0004\u0012\u0002040\u0003X\u008a\u0084\u0002²\u0006\f\u0010G\u001a\u0004\u0018\u00010\u0004X\u008a\u008e\u0002²\u0006\n\u0010H\u001a\u00020IX\u008a\u008e\u0002²\u0006\u0010\u0010J\u001a\b\u0012\u0004\u0012\u00020'0\u0003X\u008a\u0084\u0002²\u0006\u0010\u0010K\u001a\b\u0012\u0004\u0012\u0002080\u0003X\u008a\u0084\u0002²\u0006\n\u0010L\u001a\u00020IX\u008a\u008e\u0002²\u0006\n\u0010M\u001a\u00020IX\u008a\u008e\u0002²\u0006\n\u0010N\u001a\u00020IX\u008a\u008e\u0002²\u0006\n\u0010O\u001a\u00020IX\u008a\u008e\u0002²\u0006\n\u0010P\u001a\u00020\u0006X\u008a\u008e\u0002²\u0006\n\u0010Q\u001a\u00020\u0006X\u008a\u008e\u0002²\u0006\n\u0010R\u001a\u00020\u0006X\u008a\u008e\u0002²\u0006\n\u0010S\u001a\u00020IX\u008a\u008e\u0002²\u0006\n\u0010T\u001a\u00020IX\u008a\u008e\u0002²\u0006\u0010\u0010K\u001a\b\u0012\u0004\u0012\u0002080\u0003X\u008a\u0084\u0002"}, d2 = {"ProfileScreen", "", "books", "", "Lcom/example/data/Book;", "currentUser", "", "viewModel", "Lcom/example/ui/BookViewModel;", "onChatClick", "Lkotlin/Function1;", "onLogoutClick", "Lkotlin/Function0;", "(Ljava/util/List;Ljava/lang/String;Lcom/example/ui/BookViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "UserProfileHeader", "user", "Lcom/example/data/User;", "currentProfilePic", "onUploadPic", "onEditGoal", "(Lcom/example/data/User;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "StatItem", "label", "value", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "color", "Landroidx/compose/ui/graphics/Color;", "StatItem-Bx497Mc", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;JLandroidx/compose/runtime/Composer;I)V", "ProfileEmptyState", "title", "subtitle", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "WishlistHeader", "onAddClick", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "WishlistItemRow", "item", "Lcom/example/data/WishlistRequest;", "onDelete", "(Lcom/example/data/WishlistRequest;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "BookListSection", "emptyText", "onBookClick", "(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ProfileBookRow", "book", "onClick", "(Lcom/example/data/Book;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ChatsSection", "messages", "Lcom/example/data/Message;", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ReviewItemCard", "review", "Lcom/example/data/Review;", "(Lcom/example/data/Review;Landroidx/compose/runtime/Composer;I)V", "ReviewsSection", "(Ljava/lang/String;Lcom/example/ui/BookViewModel;Landroidx/compose/runtime/Composer;I)V", "WishlistSection", "items", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "EcoImpactSection", "onOpenLeaderboard", "(Lcom/example/data/User;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app", "selectedTab", "userState", "currentDisplayName", "userChatsState", "activeDetailsBook", "showDeveloperDialog", "", "wishlistState", "reviews", "showImagePickerDialog", "showClaimRewardDialog", "showReadingGoalDialog", "showAddWishlistDialog", "newWishlistTitle", "newWishlistAuthor", "goalInput", "showProfileEcoDialog", "showLogoutConfirmDialog"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class ProfileScreenKt {
    static final Unit BookListSection$lambda$204(List list, String str, Function1 function1, int i, Composer composer, int i2) {
        BookListSection(list, str, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit ChatsSection$lambda$227(List list, List list2, String str, Function1 function1, int i, Composer composer, int i2) {
        ChatsSection(list, list2, str, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit EcoImpactSection$lambda$286(User user, List list, String str, Function0 function0, int i, Composer composer, int i2) {
        EcoImpactSection(user, list, str, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit ProfileBookRow$lambda$213(Book book, Function0 function0, int i, Composer composer, int i2) {
        ProfileBookRow(book, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit ProfileEmptyState$lambda$188(ImageVector imageVector, String str, String str2, int i, Composer composer, int i2) {
        ProfileEmptyState(imageVector, str, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$164(List list, String str, BookViewModel bookViewModel, Function1 function1, Function0 function0, int i, Composer composer, int i2) {
        ProfileScreen(list, str, bookViewModel, function1, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit ReviewItemCard$lambda$240(Review review, int i, Composer composer, int i2) {
        ReviewItemCard(review, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit ReviewsSection$lambda$247(String str, BookViewModel bookViewModel, int i, Composer composer, int i2) {
        ReviewsSection(str, bookViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit StatItem_Bx497Mc$lambda$183(String str, String str2, ImageVector imageVector, long j, int i, Composer composer, int i2) {
        m387StatItemBx497Mc(str, str2, imageVector, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final float UserProfileHeader$lambda$180$lambda$179$lambda$178$lambda$177$lambda$175$lambda$174(float f) {
        return f;
    }

    static final Unit UserProfileHeader$lambda$181(User user, String str, Function0 function0, Function0 function1, Function0 function2, int i, Composer composer, int i2) {
        UserProfileHeader(user, str, function0, function1, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit WishlistHeader$lambda$191(Function0 function0, int i, Composer composer, int i2) {
        WishlistHeader(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit WishlistItemRow$lambda$196(WishlistRequest wishlistRequest, Function0 function0, int i, Composer composer, int i2) {
        WishlistItemRow(wishlistRequest, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit WishlistSection$lambda$262(List list, Function0 function0, Function1 function1, int i, Composer composer, int i2) {
        WishlistSection(list, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v16 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.ModVisitor.anonymousCallArgMod(ModVisitor.java:535)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.ModVisitor.processAnonymousConstructor(ModVisitor.java:528)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:111)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static final void ProfileScreen(final java.util.List<com.example.data.Book> r57, final java.lang.String r58, final com.example.ui.BookViewModel r59, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r60, final kotlin.jvm.functions.Function0<kotlin.Unit> r61, androidx.compose.runtime.Composer r62, final int r63) {
        /*
            Method dump skipped, instruction units count: 2440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.ProfileScreenKt.ProfileScreen(java.util.List, java.lang.String, com.example.ui.BookViewModel, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    private static final String ProfileScreen$lambda$1(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final Book ProfileScreen$lambda$10(MutableState<Book> mutableState) {
        return (Book) ((State) mutableState).getValue();
    }

    private static final boolean ProfileScreen$lambda$13(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void ProfileScreen$lambda$14(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean ProfileScreen$lambda$26(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void ProfileScreen$lambda$27(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean ProfileScreen$lambda$32(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void ProfileScreen$lambda$33(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean ProfileScreen$lambda$35(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void ProfileScreen$lambda$36(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String ProfileScreen$lambda$38(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final String ProfileScreen$lambda$41(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final String ProfileScreen$lambda$44(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final boolean ProfileScreen$lambda$47(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void ProfileScreen$lambda$48(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    static final Unit ProfileScreen$lambda$50$lambda$49(BookViewModel bookViewModel, Bitmap bitmap) {
        if (bitmap != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            float width = bitmap.getWidth() / bitmap.getHeight();
            int width2 = bitmap.getWidth() <= 200 ? bitmap.getWidth() : 200;
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, width2, (int) (width2 / width), true);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
            bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 70, byteArrayOutputStream);
            bookViewModel.updateProfilePic("data:image/jpeg;base64," + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2));
        }
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$52$lambda$51(Context context, BookViewModel bookViewModel, Uri uri) {
        if (uri != null) {
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context.getContentResolver().openInputStream(uri));
                if (bitmapDecodeStream != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    float width = bitmapDecodeStream.getWidth() / bitmapDecodeStream.getHeight();
                    int width2 = 200;
                    if (bitmapDecodeStream.getWidth() <= 200) {
                        width2 = bitmapDecodeStream.getWidth();
                    }
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeStream, width2, (int) (width2 / width), true);
                    Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
                    bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 70, byteArrayOutputStream);
                    bookViewModel.updateProfilePic("data:image/jpeg;base64," + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$54$lambda$53(MutableState mutableState) {
        ProfileScreen$lambda$27(mutableState, false);
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$63(final ManagedActivityResultLauncher managedActivityResultLauncher, final ManagedActivityResultLauncher managedActivityResultLauncher2, final MutableState mutableState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C133@6404L766:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1980897607, i, -1, "com.example.ui.screens.ProfileScreen.<anonymous> (ProfileScreen.kt:133)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier = Modifier.Companion;
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
            ComposerKt.sourceInformationMarkerStart(composer, -176169999, "C135@6479L147,134@6433L344,144@6844L150,143@6798L354:ProfileScreen.kt#2thlc2");
            ComposerKt.sourceInformationMarkerStart(composer, 1379791318, "CC(remember):ProfileScreen.kt#9igjgp");
            boolean zChangedInstance = composer.changedInstance(managedActivityResultLauncher);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda1
                    public final Object invoke() {
                        return ProfileScreenKt.ProfileScreen$lambda$63$lambda$62$lambda$59$lambda$58(managedActivityResultLauncher, mutableState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ButtonKt.TextButton((Function0) objRememberedValue, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$ProfileScreenKt.INSTANCE.m333getLambda$1888712666$app(), composer, 805306416, 508);
            ComposerKt.sourceInformationMarkerStart(composer, 1379803001, "CC(remember):ProfileScreen.kt#9igjgp");
            boolean zChangedInstance2 = composer.changedInstance(managedActivityResultLauncher2);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda2
                    public final Object invoke() {
                        return ProfileScreenKt.ProfileScreen$lambda$63$lambda$62$lambda$61$lambda$60(managedActivityResultLauncher2, mutableState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ButtonKt.TextButton((Function0) objRememberedValue2, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$ProfileScreenKt.INSTANCE.getLambda$571825871$app(), composer, 805306416, 508);
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

    static final Unit ProfileScreen$lambda$63$lambda$62$lambda$59$lambda$58(ManagedActivityResultLauncher managedActivityResultLauncher, MutableState mutableState) {
        ProfileScreen$lambda$27(mutableState, false);
        managedActivityResultLauncher.launch((Object) null);
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$63$lambda$62$lambda$61$lambda$60(ManagedActivityResultLauncher managedActivityResultLauncher, MutableState mutableState) {
        ProfileScreen$lambda$27(mutableState, false);
        managedActivityResultLauncher.launch("image/*");
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$57(final MutableState mutableState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C155@7253L33,155@7232L110:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1327049758, i, -1, "com.example.ui.screens.ProfileScreen.<anonymous> (ProfileScreen.kt:155)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, -310468193, "CC(remember):ProfileScreen.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda71
                    public final Object invoke() {
                        return ProfileScreenKt.ProfileScreen$lambda$57$lambda$56$lambda$55(mutableState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ButtonKt.TextButton((Function0) objRememberedValue, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$ProfileScreenKt.INSTANCE.getLambda$457126465$app(), composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$57$lambda$56$lambda$55(MutableState mutableState) {
        ProfileScreen$lambda$27(mutableState, false);
        return Unit.INSTANCE;
    }

    private static final boolean ProfileScreen$lambda$65(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void ProfileScreen$lambda$66(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    static final Unit ProfileScreen$lambda$68$lambda$67(MutableState mutableState) {
        ProfileScreen$lambda$66(mutableState, false);
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$71(final Function0 function0, final MutableState mutableState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C183@8150L119,187@8359L11,187@8315L62,182@8112L339:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1550083179, i, -1, "com.example.ui.screens.ProfileScreen.<anonymous> (ProfileScreen.kt:182)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, 723718604, "CC(remember):ProfileScreen.kt#9igjgp");
            boolean zChanged = composer.changed(function0);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda7
                    public final Object invoke() {
                        return ProfileScreenKt.ProfileScreen$lambda$71$lambda$70$lambda$69(function0, mutableState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ButtonKt.Button((Function0) objRememberedValue, (Modifier) null, false, (Shape) null, ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU(), 0L, 0L, 0L, composer, ButtonDefaults.$stable << 12, 14), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$ProfileScreenKt.INSTANCE.getLambda$1260382629$app(), composer, 805306368, 494);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$71$lambda$70$lambda$69(Function0 function0, MutableState mutableState) {
        ProfileScreen$lambda$66(mutableState, false);
        function0.invoke();
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$74(final MutableState mutableState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C193@8534L35,193@8513L112:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1814730669, i, -1, "com.example.ui.screens.ProfileScreen.<anonymous> (ProfileScreen.kt:193)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, -199449450, "CC(remember):ProfileScreen.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda74
                    public final Object invoke() {
                        return ProfileScreenKt.ProfileScreen$lambda$74$lambda$73$lambda$72(mutableState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ButtonKt.TextButton((Function0) objRememberedValue, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$ProfileScreenKt.INSTANCE.m339getLambda$292392522$app(), composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$74$lambda$73$lambda$72(MutableState mutableState) {
        ProfileScreen$lambda$66(mutableState, false);
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$80(final MutableState mutableState, final MutableState mutableState2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C204@8849L704,221@9679L11,222@9754L11,220@9598L194,202@8702L1104:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1758739407, i, -1, "com.example.ui.screens.ProfileScreen.<anonymous> (ProfileScreen.kt:202)");
            }
            AppBarKt.CenterAlignedTopAppBar-GHTll3U(ComposableSingletons$ProfileScreenKt.INSTANCE.m345getLambda$705636684$app(), (Modifier) null, (Function2) null, ComposableLambdaKt.rememberComposableLambda(732108767, true, new Function3() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda75
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ProfileScreenKt.ProfileScreen$lambda$80$lambda$79(mutableState, mutableState2, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer, 54), 0.0f, (WindowInsets) null, TopAppBarDefaults.INSTANCE.centerAlignedTopAppBarColors-zjMxDiM(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0L, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0L, composer, TopAppBarDefaults.$stable << 15, 22), (TopAppBarScrollBehavior) null, composer, 3078, 182);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$80$lambda$79(final MutableState mutableState, final MutableState mutableState2, RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$CenterAlignedTopAppBar");
        ComposerKt.sourceInformation(composer, "C205@8892L30,205@8871L318,212@9231L34,212@9210L325:ProfileScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(732108767, i, -1, "com.example.ui.screens.ProfileScreen.<anonymous>.<anonymous> (ProfileScreen.kt:205)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, -818110051, "CC(remember):ProfileScreen.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda80
                    public final Object invoke() {
                        return ProfileScreenKt.ProfileScreen$lambda$80$lambda$79$lambda$76$lambda$75(mutableState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            IconButtonKt.IconButton((Function0) objRememberedValue, (Modifier) null, false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableSingletons$ProfileScreenKt.INSTANCE.m331getLambda$1343009822$app(), composer, 196614, 30);
            ComposerKt.sourceInformationMarkerStart(composer, -818099199, "CC(remember):ProfileScreen.kt#9igjgp");
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda81
                    public final Object invoke() {
                        return ProfileScreenKt.ProfileScreen$lambda$80$lambda$79$lambda$78$lambda$77(mutableState2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            IconButtonKt.IconButton((Function0) objRememberedValue2, (Modifier) null, false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableSingletons$ProfileScreenKt.INSTANCE.getLambda$797395595$app(), composer, 196614, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$80$lambda$79$lambda$76$lambda$75(MutableState mutableState) {
        ProfileScreen$lambda$14(mutableState, true);
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$80$lambda$79$lambda$78$lambda$77(MutableState mutableState) {
        ProfileScreen$lambda$66(mutableState, true);
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$127(final String str, final State state, final List list, final State state2, final BookViewModel bookViewModel, final List list2, final List list3, final List list4, final State state3, State state4, State state5, final MutableState mutableState, final MutableState mutableState2, final MutableState mutableState3, final MutableState mutableState4, final MutableState mutableState5, final MutableState mutableState6, final MutableState mutableState7, final MutableState mutableState8, final MutableState mutableState9, PaddingValues paddingValues, Composer composer, int i) {
        int i2;
        String str2;
        String str3;
        User user;
        char c;
        Intrinsics.checkNotNullParameter(paddingValues, "innerPadding");
        ComposerKt.sourceInformation(composer, "C255@11011L9455,250@10826L9640:ProfileScreen.kt#2thlc2");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(paddingValues) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1207350042, i2, -1, "com.example.ui.screens.ProfileScreen.<anonymous> (ProfileScreen.kt:227)");
            }
            User userProfileScreen$lambda$4 = ProfileScreen$lambda$4(state4);
            if (userProfileScreen$lambda$4 == null) {
                String strProfileScreen$lambda$5 = ProfileScreen$lambda$5(state5);
                if (strProfileScreen$lambda$5 == null) {
                    strProfileScreen$lambda$5 = StringsKt.substringBefore$default(str, "@", (String) null, 2, (Object) null);
                }
                str2 = "@";
                str3 = null;
                user = new User(str, strProfileScreen$lambda$5, 100, 0, ProfileScreen$lambda$6(state), null, false, null, 0, 0, 0.0d, 2016, null);
            } else {
                str2 = "@";
                str3 = null;
                user = userProfileScreen$lambda$4;
            }
            String displayName = user.getDisplayName();
            if (StringsKt.isBlank(displayName)) {
                displayName = str3;
            }
            if (displayName == null && (displayName = ProfileScreen$lambda$5(state5)) == null) {
                c = 2;
                displayName = StringsKt.substringBefore$default(user.getUsername(), str2, str3, 2, str3);
            } else {
                c = 2;
            }
            String str4 = displayName;
            String profilePicBase64 = user.getProfilePicBase64();
            String str5 = profilePicBase64;
            if (str5 == null || StringsKt.isBlank(str5)) {
                profilePicBase64 = str3;
            }
            if (profilePicBase64 == null) {
                profilePicBase64 = ProfileScreen$lambda$6(state);
            }
            final User userCopy$default = User.copy$default(user, null, str4, 0, 0, profilePicBase64, null, false, null, 0, 0, 0.0d, 2029, null);
            Pair[] pairArr = new Pair[6];
            pairArr[0] = TuplesKt.to("MY_BOOKS", "My Books");
            pairArr[1] = TuplesKt.to("WISHLIST", "Wishlist");
            pairArr[c] = TuplesKt.to("ECO_IMPACT", "🌱 Eco Impact");
            pairArr[3] = TuplesKt.to("LENT", "Lent Out");
            pairArr[4] = TuplesKt.to("BORROWED", "Borrowed");
            pairArr[5] = TuplesKt.to("REVIEWS", "Reviews");
            final List listListOf = CollectionsKt.listOf(pairArr);
            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, str3), paddingValues);
            PaddingValues paddingValues2 = PaddingKt.PaddingValues-a9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.constructor-impl(124.0f), 7, (Object) null);
            Composer composer2 = composer;
            ComposerKt.sourceInformationMarkerStart(composer2, 622267913, "CC(remember):ProfileScreen.kt#9igjgp");
            boolean zChanged = composer2.changed(userCopy$default) | composer2.changed(state) | composer2.changedInstance(list) | composer2.changed(state2) | composer2.changedInstance(bookViewModel) | composer2.changedInstance(list2) | composer2.changed(str) | composer2.changedInstance(list3) | composer2.changedInstance(list4) | composer2.changed(state3);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                Function1 function1 = new Function1() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda22
                    public final Object invoke(Object obj) {
                        return ProfileScreenKt.ProfileScreen$lambda$127$lambda$126$lambda$125(list, list3, list4, userCopy$default, state, mutableState, mutableState2, mutableState3, mutableState4, mutableState5, listListOf, mutableState6, mutableState7, mutableState8, state2, bookViewModel, list2, str, mutableState9, state3, (LazyListScope) obj);
                    }
                };
                composer2 = composer;
                composer2.updateRememberedValue(function1);
                objRememberedValue = function1;
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            LazyDslKt.LazyColumn(modifierPadding, (LazyListState) null, paddingValues2, false, (Arrangement.Vertical) null, (Alignment.Horizontal) null, (FlingBehavior) null, false, (Function1) objRememberedValue, composer2, 384, 250);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    static final Unit ProfileScreen$lambda$127$lambda$126$lambda$125(final List list, final List list2, final List list3, final User user, final State state, final MutableState mutableState, final MutableState mutableState2, final MutableState mutableState3, final MutableState mutableState4, final MutableState mutableState5, final List list4, final MutableState mutableState6, final MutableState mutableState7, final MutableState mutableState8, State state2, final BookViewModel bookViewModel, final List list5, final String str, final MutableState mutableState9, State state3, LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyColumn");
        LazyListScope.item$default(lazyListScope, "user_profile_header", (Object) null, ComposableLambdaKt.composableLambdaInstance(1312471558, true, new Function3() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda89
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ProfileScreenKt.ProfileScreen$lambda$127$lambda$126$lambda$125$lambda$91(user, state, mutableState, mutableState2, mutableState3, mutableState4, mutableState5, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 2, (Object) null);
        LazyListScope.stickyHeader$default(lazyListScope, "profile_tabs_sticky", (Object) null, ComposableLambdaKt.composableLambdaInstance(-1194486045, true, new Function3() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda90
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ProfileScreenKt.ProfileScreen$lambda$127$lambda$126$lambda$125$lambda$99(list4, mutableState6, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 2, (Object) null);
        LazyListScope.item$default(lazyListScope, "tab_content_spacer", (Object) null, ComposableSingletons$ProfileScreenKt.INSTANCE.getLambda$1443702511$app(), 2, (Object) null);
        String strProfileScreen$lambda$1 = ProfileScreen$lambda$1(mutableState6);
        switch (strProfileScreen$lambda$1.hashCode()) {
            case -1414529708:
                if (strProfileScreen$lambda$1.equals("BORROWED")) {
                    if (!list3.isEmpty()) {
                        final Function1 function1 = new Function1() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda96
                            public final Object invoke(Object obj) {
                                return ProfileScreenKt.ProfileScreen$lambda$127$lambda$126$lambda$125$lambda$118((Book) obj);
                            }
                        };
                        final ProfileScreenKt$ProfileScreen$lambda$127$lambda$126$lambda$125$$inlined$items$default$13 profileScreenKt$ProfileScreen$lambda$127$lambda$126$lambda$125$$inlined$items$default$13 = new Function1() { // from class: com.example.ui.screens.ProfileScreenKt$ProfileScreen$lambda$127$lambda$126$lambda$125$$inlined$items$default$13
                            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                            public final Void m397invoke(Book book) {
                                return null;
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return m397invoke((Book) obj);
                            }
                        };
                        lazyListScope.items(list3.size(), new Function1<Integer, Object>() { // from class: com.example.ui.screens.ProfileScreenKt$ProfileScreen$lambda$127$lambda$126$lambda$125$$inlined$items$default$14
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return invoke(((Number) obj).intValue());
                            }

                            public final Object invoke(int i) {
                                return function1.invoke(list3.get(i));
                            }
                        }, new Function1<Integer, Object>() { // from class: com.example.ui.screens.ProfileScreenKt$ProfileScreen$lambda$127$lambda$126$lambda$125$$inlined$items$default$15
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return invoke(((Number) obj).intValue());
                            }

                            public final Object invoke(int i) {
                                return profileScreenKt$ProfileScreen$lambda$127$lambda$126$lambda$125$$inlined$items$default$13.invoke(list3.get(i));
                            }
                        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.screens.ProfileScreenKt$ProfileScreen$lambda$127$lambda$126$lambda$125$$inlined$items$default$16
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
                                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
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
                                final Book book = (Book) list3.get(i);
                                composer.startReplaceGroup(-172285711);
                                ComposerKt.sourceInformation(composer, "C*417@19350L201:ProfileScreen.kt#2thlc2");
                                Modifier modifier = PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(16.0f), Dp.constructor-impl(5.0f));
                                ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
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
                                ComposerKt.sourceInformationMarkerStart(composer, 660730737, "C418@19492L28,418@19454L67:ProfileScreen.kt#2thlc2");
                                ComposerKt.sourceInformationMarkerStart(composer, -671421589, "CC(remember):ProfileScreen.kt#9igjgp");
                                boolean zChangedInstance = composer.changedInstance(book);
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                                    final MutableState mutableState10 = mutableState7;
                                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.ProfileScreenKt$ProfileScreen$8$1$1$12$1$1$1
                                        public /* bridge */ /* synthetic */ Object invoke() {
                                            m393invoke();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                        public final void m393invoke() {
                                            mutableState10.setValue(book);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ProfileScreenKt.ProfileBookRow(book, (Function0) objRememberedValue, composer, 0);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                composer.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                composer.endReplaceGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }));
                    } else {
                        LazyListScope.item$default(lazyListScope, "empty_borrowed", (Object) null, ComposableSingletons$ProfileScreenKt.INSTANCE.getLambda$32836749$app(), 2, (Object) null);
                    }
                }
                break;
            case -694840876:
                if (strProfileScreen$lambda$1.equals("ECO_IMPACT")) {
                    LazyListScope.item$default(lazyListScope, "eco_impact_content", (Object) null, ComposableLambdaKt.composableLambdaInstance(767382022, true, new Function3() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda94
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return ProfileScreenKt.ProfileScreen$lambda$127$lambda$126$lambda$125$lambda$113(user, list5, str, mutableState9, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    }), 2, (Object) null);
                }
                break;
            case -186014267:
                if (strProfileScreen$lambda$1.equals("WISHLIST")) {
                    LazyListScope.item$default(lazyListScope, "wishlist_header", (Object) null, ComposableLambdaKt.composableLambdaInstance(119154565, true, new Function3() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda92
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return ProfileScreenKt.ProfileScreen$lambda$127$lambda$126$lambda$125$lambda$106(mutableState8, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    }), 2, (Object) null);
                    if (!ProfileScreen$lambda$22(state2).isEmpty()) {
                        final List<WishlistRequest> listProfileScreen$lambda$22 = ProfileScreen$lambda$22(state2);
                        final Function1 function2 = new Function1() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda93
                            public final Object invoke(Object obj) {
                                return ProfileScreenKt.ProfileScreen$lambda$127$lambda$126$lambda$125$lambda$107((WishlistRequest) obj);
                            }
                        };
                        final ProfileScreenKt$ProfileScreen$lambda$127$lambda$126$lambda$125$$inlined$items$default$5 profileScreenKt$ProfileScreen$lambda$127$lambda$126$lambda$125$$inlined$items$default$5 = new Function1() { // from class: com.example.ui.screens.ProfileScreenKt$ProfileScreen$lambda$127$lambda$126$lambda$125$$inlined$items$default$5
                            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                            public final Void m399invoke(WishlistRequest wishlistRequest) {
                                return null;
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return m399invoke((WishlistRequest) obj);
                            }
                        };
                        lazyListScope.items(listProfileScreen$lambda$22.size(), new Function1<Integer, Object>() { // from class: com.example.ui.screens.ProfileScreenKt$ProfileScreen$lambda$127$lambda$126$lambda$125$$inlined$items$default$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return invoke(((Number) obj).intValue());
                            }

                            public final Object invoke(int i) {
                                return function2.invoke(listProfileScreen$lambda$22.get(i));
                            }
                        }, new Function1<Integer, Object>() { // from class: com.example.ui.screens.ProfileScreenKt$ProfileScreen$lambda$127$lambda$126$lambda$125$$inlined$items$default$7
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return invoke(((Number) obj).intValue());
                            }

                            public final Object invoke(int i) {
                                return profileScreenKt$ProfileScreen$lambda$127$lambda$126$lambda$125$$inlined$items$default$5.invoke(listProfileScreen$lambda$22.get(i));
                            }
                        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.screens.ProfileScreenKt$ProfileScreen$lambda$127$lambda$126$lambda$125$$inlined$items$default$8
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
                                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
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
                                final WishlistRequest wishlistRequest = (WishlistRequest) listProfileScreen$lambda$22.get(i);
                                composer.startReplaceGroup(1781748622);
                                ComposerKt.sourceInformation(composer, "C*373@17135L216:ProfileScreen.kt#2thlc2");
                                Modifier modifier = PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(16.0f), Dp.constructor-impl(4.0f));
                                ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
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
                                ComposerKt.sourceInformationMarkerStart(composer, -2124383910, "C374@17279L41,374@17239L82:ProfileScreen.kt#2thlc2");
                                ComposerKt.sourceInformationMarkerStart(composer, -1869642592, "CC(remember):ProfileScreen.kt#9igjgp");
                                boolean zChangedInstance = composer.changedInstance(bookViewModel) | composer.changed(wishlistRequest);
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                                    final BookViewModel bookViewModel2 = bookViewModel;
                                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.ProfileScreenKt$ProfileScreen$8$1$1$7$1$1$1
                                        public /* bridge */ /* synthetic */ Object invoke() {
                                            m395invoke();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                        public final void m395invoke() {
                                            bookViewModel2.removeFromWishlist(wishlistRequest.getId());
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ProfileScreenKt.WishlistItemRow(wishlistRequest, (Function0) objRememberedValue, composer, 0);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                composer.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                composer.endReplaceGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }));
                    } else {
                        LazyListScope.item$default(lazyListScope, "empty_wishlist", (Object) null, ComposableSingletons$ProfileScreenKt.INSTANCE.m334getLambda$1911845622$app(), 2, (Object) null);
                    }
                }
                break;
            case 2332927:
                if (strProfileScreen$lambda$1.equals("LENT")) {
                    if (!list2.isEmpty()) {
                        final Function1 function3 = new Function1() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda95
                            public final Object invoke(Object obj) {
                                return ProfileScreenKt.ProfileScreen$lambda$127$lambda$126$lambda$125$lambda$114((Book) obj);
                            }
                        };
                        final ProfileScreenKt$ProfileScreen$lambda$127$lambda$126$lambda$125$$inlined$items$default$9 profileScreenKt$ProfileScreen$lambda$127$lambda$126$lambda$125$$inlined$items$default$9 = new Function1() { // from class: com.example.ui.screens.ProfileScreenKt$ProfileScreen$lambda$127$lambda$126$lambda$125$$inlined$items$default$9
                            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                            public final Void m400invoke(Book book) {
                                return null;
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return m400invoke((Book) obj);
                            }
                        };
                        lazyListScope.items(list2.size(), new Function1<Integer, Object>() { // from class: com.example.ui.screens.ProfileScreenKt$ProfileScreen$lambda$127$lambda$126$lambda$125$$inlined$items$default$10
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return invoke(((Number) obj).intValue());
                            }

                            public final Object invoke(int i) {
                                return function3.invoke(list2.get(i));
                            }
                        }, new Function1<Integer, Object>() { // from class: com.example.ui.screens.ProfileScreenKt$ProfileScreen$lambda$127$lambda$126$lambda$125$$inlined$items$default$11
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return invoke(((Number) obj).intValue());
                            }

                            public final Object invoke(int i) {
                                return profileScreenKt$ProfileScreen$lambda$127$lambda$126$lambda$125$$inlined$items$default$9.invoke(list2.get(i));
                            }
                        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.screens.ProfileScreenKt$ProfileScreen$lambda$127$lambda$126$lambda$125$$inlined$items$default$12
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
                                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
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
                                final Book book = (Book) list2.get(i);
                                composer.startReplaceGroup(-1343494382);
                                ComposerKt.sourceInformation(composer, "C*400@18424L201:ProfileScreen.kt#2thlc2");
                                Modifier modifier = PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(16.0f), Dp.constructor-impl(5.0f));
                                ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
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
                                ComposerKt.sourceInformationMarkerStart(composer, -510477934, "C401@18566L28,401@18528L67:ProfileScreen.kt#2thlc2");
                                ComposerKt.sourceInformationMarkerStart(composer, -847749846, "CC(remember):ProfileScreen.kt#9igjgp");
                                boolean zChangedInstance = composer.changedInstance(book);
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                                    final MutableState mutableState10 = mutableState7;
                                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.ProfileScreenKt$ProfileScreen$8$1$1$10$1$1$1
                                        public /* bridge */ /* synthetic */ Object invoke() {
                                            m392invoke();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                        public final void m392invoke() {
                                            mutableState10.setValue(book);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ProfileScreenKt.ProfileBookRow(book, (Function0) objRememberedValue, composer, 0);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                composer.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                composer.endReplaceGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }));
                    } else {
                        LazyListScope.item$default(lazyListScope, "empty_lent", (Object) null, ComposableSingletons$ProfileScreenKt.INSTANCE.m343getLambda$615390708$app(), 2, (Object) null);
                    }
                }
                break;
            case 1219012151:
                if (strProfileScreen$lambda$1.equals("MY_BOOKS")) {
                    if (!list.isEmpty()) {
                        final Function1 function4 = new Function1() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda91
                            public final Object invoke(Object obj) {
                                return ProfileScreenKt.ProfileScreen$lambda$127$lambda$126$lambda$125$lambda$100((Book) obj);
                            }
                        };
                        final ProfileScreenKt$ProfileScreen$lambda$127$lambda$126$lambda$125$$inlined$items$default$1 profileScreenKt$ProfileScreen$lambda$127$lambda$126$lambda$125$$inlined$items$default$1 = new Function1() { // from class: com.example.ui.screens.ProfileScreenKt$ProfileScreen$lambda$127$lambda$126$lambda$125$$inlined$items$default$1
                            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                            public final Void m396invoke(Book book) {
                                return null;
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return m396invoke((Book) obj);
                            }
                        };
                        lazyListScope.items(list.size(), new Function1<Integer, Object>() { // from class: com.example.ui.screens.ProfileScreenKt$ProfileScreen$lambda$127$lambda$126$lambda$125$$inlined$items$default$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return invoke(((Number) obj).intValue());
                            }

                            public final Object invoke(int i) {
                                return function4.invoke(list.get(i));
                            }
                        }, new Function1<Integer, Object>() { // from class: com.example.ui.screens.ProfileScreenKt$ProfileScreen$lambda$127$lambda$126$lambda$125$$inlined$items$default$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return invoke(((Number) obj).intValue());
                            }

                            public final Object invoke(int i) {
                                return profileScreenKt$ProfileScreen$lambda$127$lambda$126$lambda$125$$inlined$items$default$1.invoke(list.get(i));
                            }
                        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.screens.ProfileScreenKt$ProfileScreen$lambda$127$lambda$126$lambda$125$$inlined$items$default$4
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
                                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
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
                                composer.startReplaceGroup(-1401341205);
                                ComposerKt.sourceInformation(composer, "C*353@16057L201:ProfileScreen.kt#2thlc2");
                                Modifier modifier = PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(16.0f), Dp.constructor-impl(5.0f));
                                ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
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
                                ComposerKt.sourceInformationMarkerStart(composer, -372550677, "C354@16199L28,354@16161L67:ProfileScreen.kt#2thlc2");
                                ComposerKt.sourceInformationMarkerStart(composer, -150563919, "CC(remember):ProfileScreen.kt#9igjgp");
                                boolean zChangedInstance = composer.changedInstance(book);
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                                    final MutableState mutableState10 = mutableState7;
                                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.ProfileScreenKt$ProfileScreen$8$1$1$4$1$1$1
                                        public /* bridge */ /* synthetic */ Object invoke() {
                                            m394invoke();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                        public final void m394invoke() {
                                            mutableState10.setValue(book);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ProfileScreenKt.ProfileBookRow(book, (Function0) objRememberedValue, composer, 0);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                composer.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                composer.endReplaceGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }));
                    } else {
                        LazyListScope.item$default(lazyListScope, "empty_my_books", (Object) null, ComposableSingletons$ProfileScreenKt.INSTANCE.getLambda$120362451$app(), 2, (Object) null);
                    }
                }
                break;
            case 1817935867:
                if (strProfileScreen$lambda$1.equals("REVIEWS")) {
                    if (!ProfileScreen$lambda$24(state3).isEmpty()) {
                        final List<Review> listProfileScreen$lambda$24 = ProfileScreen$lambda$24(state3);
                        final Function1 function5 = new Function1() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda97
                            public final Object invoke(Object obj) {
                                return ProfileScreenKt.ProfileScreen$lambda$127$lambda$126$lambda$125$lambda$122((Review) obj);
                            }
                        };
                        final ProfileScreenKt$ProfileScreen$lambda$127$lambda$126$lambda$125$$inlined$items$default$17 profileScreenKt$ProfileScreen$lambda$127$lambda$126$lambda$125$$inlined$items$default$17 = new Function1() { // from class: com.example.ui.screens.ProfileScreenKt$ProfileScreen$lambda$127$lambda$126$lambda$125$$inlined$items$default$17
                            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                            public final Void m398invoke(Review review) {
                                return null;
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return m398invoke((Review) obj);
                            }
                        };
                        lazyListScope.items(listProfileScreen$lambda$24.size(), new Function1<Integer, Object>() { // from class: com.example.ui.screens.ProfileScreenKt$ProfileScreen$lambda$127$lambda$126$lambda$125$$inlined$items$default$18
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return invoke(((Number) obj).intValue());
                            }

                            public final Object invoke(int i) {
                                return function5.invoke(listProfileScreen$lambda$24.get(i));
                            }
                        }, new Function1<Integer, Object>() { // from class: com.example.ui.screens.ProfileScreenKt$ProfileScreen$lambda$127$lambda$126$lambda$125$$inlined$items$default$19
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return invoke(((Number) obj).intValue());
                            }

                            public final Object invoke(int i) {
                                return profileScreenKt$ProfileScreen$lambda$127$lambda$126$lambda$125$$inlined$items$default$17.invoke(listProfileScreen$lambda$24.get(i));
                            }
                        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.screens.ProfileScreenKt$ProfileScreen$lambda$127$lambda$126$lambda$125$$inlined$items$default$20
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
                                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
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
                                Review review = (Review) listProfileScreen$lambda$24.get(i);
                                composer.startReplaceGroup(951561827);
                                ComposerKt.sourceInformation(composer, "C*434@20211L165:ProfileScreen.kt#2thlc2");
                                Modifier modifier = PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(16.0f), Dp.constructor-impl(5.0f));
                                ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
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
                                ComposerKt.sourceInformationMarkerStart(composer, -1670720861, "C435@20315L31:ProfileScreen.kt#2thlc2");
                                ProfileScreenKt.ReviewItemCard(review, composer, 0);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                composer.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                composer.endReplaceGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }));
                    } else {
                        LazyListScope.item$default(lazyListScope, "empty_reviews", (Object) null, ComposableSingletons$ProfileScreenKt.INSTANCE.getLambda$681064206$app(), 2, (Object) null);
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$127$lambda$126$lambda$125$lambda$91(final User user, State state, final MutableState mutableState, final MutableState mutableState2, final MutableState mutableState3, final MutableState mutableState4, final MutableState mutableState5, LazyItemScope lazyItemScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(lazyItemScope, "$this$item");
        ComposerKt.sourceInformation(composer, "C260@11230L34,261@11300L32,262@11367L188,257@11077L496,267@11590L40,272@11799L11,276@12034L30,270@11693L1741,299@13451L40:ProfileScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1312471558, i, -1, "com.example.ui.screens.ProfileScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:257)");
            }
            String strProfileScreen$lambda$6 = ProfileScreen$lambda$6(state);
            ComposerKt.sourceInformationMarkerStart(composer, -1435212280, "CC(remember):ProfileScreen.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda64
                    public final Object invoke() {
                        return ProfileScreenKt.ProfileScreen$lambda$127$lambda$126$lambda$125$lambda$91$lambda$84$lambda$83(mutableState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, -1435210042, "CC(remember):ProfileScreen.kt#9igjgp");
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda65
                    public final Object invoke() {
                        return ProfileScreenKt.ProfileScreen$lambda$127$lambda$126$lambda$125$lambda$91$lambda$86$lambda$85(mutableState2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function1 = (Function0) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, -1435207742, "CC(remember):ProfileScreen.kt#9igjgp");
            boolean zChanged = composer.changed(user);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda67
                    public final Object invoke() {
                        return ProfileScreenKt.ProfileScreen$lambda$127$lambda$126$lambda$125$lambda$91$lambda$88$lambda$87(user, mutableState3, mutableState4);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            UserProfileHeader(user, strProfileScreen$lambda$6, function0, function1, (Function0) objRememberedValue3, composer, 3456);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            Shape shape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(16.0f));
            long j = Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), 0.45f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
            Modifier modifier = PaddingKt.padding-VpY3zN4(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(16.0f), Dp.constructor-impl(4.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -1435186556, "CC(remember):ProfileScreen.kt#9igjgp");
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda68
                    public final Object invoke() {
                        return ProfileScreenKt.ProfileScreen$lambda$127$lambda$126$lambda$125$lambda$91$lambda$90$lambda$89(mutableState5);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            SurfaceKt.Surface-T9BRK9s(ClickableKt.clickable-XHw0xAI$default(modifier, false, (String) null, (Role) null, (Function0) objRememberedValue4, 7, (Object) null), shape, j, 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableSingletons$ProfileScreenKt.INSTANCE.getLambda$406723659$app(), composer, 12582912, 120);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$127$lambda$126$lambda$125$lambda$91$lambda$84$lambda$83(MutableState mutableState) {
        ProfileScreen$lambda$66(mutableState, true);
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$127$lambda$126$lambda$125$lambda$91$lambda$86$lambda$85(MutableState mutableState) {
        ProfileScreen$lambda$27(mutableState, true);
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$127$lambda$126$lambda$125$lambda$91$lambda$88$lambda$87(User user, MutableState mutableState, MutableState mutableState2) {
        mutableState.setValue(String.valueOf(user.getReadingGoal() > 0 ? user.getReadingGoal() : 12));
        ProfileScreen$lambda$33(mutableState2, true);
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$127$lambda$126$lambda$125$lambda$91$lambda$90$lambda$89(MutableState mutableState) {
        ProfileScreen$lambda$14(mutableState, true);
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$127$lambda$126$lambda$125$lambda$99(final List list, final MutableState mutableState, LazyItemScope lazyItemScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(lazyItemScope, "$this$stickyHeader");
        ComposerKt.sourceInformation(composer, "C304@13630L11,308@13811L1425,303@13579L1657:ProfileScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1194486045, i, -1, "com.example.ui.screens.ProfileScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:303)");
            }
            SurfaceKt.Surface-T9BRK9s(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), (Shape) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, Dp.constructor-impl(3.0f), Dp.constructor-impl(2.0f), (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-121576408, true, new Function2() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda50
                public final Object invoke(Object obj, Object obj2) {
                    return ProfileScreenKt.ProfileScreen$lambda$127$lambda$126$lambda$125$lambda$99$lambda$98(list, mutableState, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 12804102, 74);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$127$lambda$126$lambda$125$lambda$99$lambda$98(final List list, final MutableState mutableState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C311@14013L11,312@14087L11,317@14352L866,309@13833L1385:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            int i2 = -1;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-121576408, i, -1, "com.example.ui.screens.ProfileScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:309)");
            }
            Iterator it = list.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((Pair) it.next()).getFirst(), ProfileScreen$lambda$1(mutableState))) {
                    i2 = i3;
                    break;
                }
                i3++;
            }
            TabRowKt.ScrollableTabRow-sKfQg0A(RangesKt.coerceAtLeast(i2, 0), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface-0d7_KjU(), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), Dp.constructor-impl(16.0f), (Function3) null, ComposableSingletons$ProfileScreenKt.INSTANCE.m337getLambda$2143663289$app(), ComposableLambdaKt.rememberComposableLambda(-1325767928, true, new Function2() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda53
                public final Object invoke(Object obj, Object obj2) {
                    return ProfileScreenKt.ProfileScreen$lambda$127$lambda$126$lambda$125$lambda$99$lambda$98$lambda$97(list, mutableState, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 14180352, 34);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$127$lambda$126$lambda$125$lambda$99$lambda$98$lambda$97(List list, final MutableState mutableState, Composer composer, int i) {
        Composer composer2 = composer;
        ComposerKt.sourceInformation(composer2, "C*322@14603L21,323@14665L475,320@14501L669:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1325767928, i, -1, "com.example.ui.screens.ProfileScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:318)");
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                final String str = (String) pair.component1();
                final String str2 = (String) pair.component2();
                final boolean zAreEqual = Intrinsics.areEqual(ProfileScreen$lambda$1(mutableState), str);
                ComposerKt.sourceInformationMarkerStart(composer2, 400001654, "CC(remember):ProfileScreen.kt#9igjgp");
                boolean zChanged = composer2.changed(str);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda60
                        public final Object invoke() {
                            return ProfileScreenKt.ProfileScreen$lambda$127$lambda$126$lambda$125$lambda$99$lambda$98$lambda$97$lambda$96$lambda$94$lambda$93(str, mutableState);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer2);
                TabKt.Tab-wqdebIU(zAreEqual, (Function0) objRememberedValue, (Modifier) null, false, ComposableLambdaKt.rememberComposableLambda(-1283158661, true, new Function2() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda61
                    public final Object invoke(Object obj, Object obj2) {
                        return ProfileScreenKt.ProfileScreen$lambda$127$lambda$126$lambda$125$lambda$99$lambda$98$lambda$97$lambda$96$lambda$95(zAreEqual, str2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer2, 54), (Function2) null, 0L, 0L, (MutableInteractionSource) null, composer2, 24576, 492);
                composer2 = composer;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$127$lambda$126$lambda$125$lambda$99$lambda$98$lambda$97$lambda$96$lambda$94$lambda$93(String str, MutableState mutableState) {
        mutableState.setValue(str);
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$127$lambda$126$lambda$125$lambda$99$lambda$98$lambda$97$lambda$96$lambda$95(boolean z, String str, Composer composer, int i) {
        long j;
        ComposerKt.sourceInformation(composer, "C324@14703L403:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1283158661, i, -1, "com.example.ui.screens.ProfileScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:324)");
            }
            FontWeight.Companion companion = FontWeight.Companion;
            FontWeight bold = z ? companion.getBold() : companion.getMedium();
            long sp = TextUnitKt.getSp(13);
            if (z) {
                composer.startReplaceGroup(-459848126);
                ComposerKt.sourceInformation(composer, "328@15001L11");
                j = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU();
            } else {
                composer.startReplaceGroup(-459846869);
                ComposerKt.sourceInformation(composer, "328@15040L11");
                j = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU();
            }
            composer.endReplaceGroup();
            TextKt.Text--4IGK_g(str, (Modifier) null, j, sp, (FontStyle) null, bold, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 3072, 0, 131026);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Object ProfileScreen$lambda$127$lambda$126$lambda$125$lambda$100(Book book) {
        Intrinsics.checkNotNullParameter(book, "it");
        return "my_" + book.getId();
    }

    static final Unit ProfileScreen$lambda$127$lambda$126$lambda$125$lambda$106(final MutableState mutableState, LazyItemScope lazyItemScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(lazyItemScope, "$this$item");
        ComposerKt.sourceInformation(composer, "C361@16461L32,361@16433L61:ProfileScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(119154565, i, -1, "com.example.ui.screens.ProfileScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:361)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, -1456578267, "CC(remember):ProfileScreen.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda49
                    public final Object invoke() {
                        return ProfileScreenKt.ProfileScreen$lambda$127$lambda$126$lambda$125$lambda$106$lambda$105$lambda$104(mutableState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            WishlistHeader((Function0) objRememberedValue, composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$127$lambda$126$lambda$125$lambda$106$lambda$105$lambda$104(MutableState mutableState) {
        ProfileScreen$lambda$36(mutableState, true);
        return Unit.INSTANCE;
    }

    static final Object ProfileScreen$lambda$127$lambda$126$lambda$125$lambda$107(WishlistRequest wishlistRequest) {
        Intrinsics.checkNotNullParameter(wishlistRequest, "it");
        return "wish_" + wishlistRequest.getId();
    }

    static final Unit ProfileScreen$lambda$127$lambda$126$lambda$125$lambda$113(User user, List list, String str, final MutableState mutableState, LazyItemScope lazyItemScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(lazyItemScope, "$this$item");
        ComposerKt.sourceInformation(composer, "C385@17742L31,381@17531L268:ProfileScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(767382022, i, -1, "com.example.ui.screens.ProfileScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:381)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, -1280244155, "CC(remember):ProfileScreen.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda78
                    public final Object invoke() {
                        return ProfileScreenKt.ProfileScreen$lambda$127$lambda$126$lambda$125$lambda$113$lambda$112$lambda$111(mutableState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            EcoImpactSection(user, list, str, (Function0) objRememberedValue, composer, 3072);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$127$lambda$126$lambda$125$lambda$113$lambda$112$lambda$111(MutableState mutableState) {
        ProfileScreen$lambda$48(mutableState, true);
        return Unit.INSTANCE;
    }

    static final Object ProfileScreen$lambda$127$lambda$126$lambda$125$lambda$114(Book book) {
        Intrinsics.checkNotNullParameter(book, "it");
        return "lent_" + book.getId();
    }

    static final Object ProfileScreen$lambda$127$lambda$126$lambda$125$lambda$118(Book book) {
        Intrinsics.checkNotNullParameter(book, "it");
        return "borrowed_" + book.getId();
    }

    static final Object ProfileScreen$lambda$127$lambda$126$lambda$125$lambda$122(Review review) {
        Intrinsics.checkNotNullParameter(review, "it");
        return "rev_" + review.getId();
    }

    static final Unit ProfileScreen$lambda$129$lambda$128(MutableState mutableState) {
        ProfileScreen$lambda$48(mutableState, false);
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$131$lambda$130(MutableState mutableState) {
        ProfileScreen$lambda$14(mutableState, false);
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$133$lambda$132(MutableState mutableState) {
        ProfileScreen$lambda$33(mutableState, false);
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$144(final MutableState mutableState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C470@21303L606:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(160006963, i, -1, "com.example.ui.screens.ProfileScreen.<anonymous> (ProfileScreen.kt:470)");
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
            ComposerKt.sourceInformationMarkerStart(composer, 325760585, "C471@21458L10,471@21382L98,474@21603L46,472@21501L390:ProfileScreen.kt#2thlc2");
            TextKt.Text--4IGK_g("How many books do you want to read this year?", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 6, 0, 65534);
            String strProfileScreen$lambda$44 = ProfileScreen$lambda$44(mutableState);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            Shape shape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f));
            ComposerKt.sourceInformationMarkerStart(composer, 149062347, "CC(remember):ProfileScreen.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda62
                    public final Object invoke(Object obj) {
                        return ProfileScreenKt.ProfileScreen$lambda$144$lambda$143$lambda$142$lambda$141(mutableState, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            OutlinedTextFieldKt.OutlinedTextField(strProfileScreen$lambda$44, (Function1) objRememberedValue, modifierFillMaxWidth$default, false, false, (TextStyle) null, ComposableSingletons$ProfileScreenKt.INSTANCE.getLambda$2146071203$app(), (Function2) null, (Function2) null, (Function2) null, (Function2) null, (Function2) null, (Function2) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, shape, (TextFieldColors) null, composer, 1573296, 12582912, 0, 6160312);
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

    static final Unit ProfileScreen$lambda$136(final BookViewModel bookViewModel, final MutableState mutableState, final MutableState mutableState2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C484@22009L198,483@21971L312:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(821625688, i, -1, "com.example.ui.screens.ProfileScreen.<anonymous> (ProfileScreen.kt:483)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, -691694306, "CC(remember):ProfileScreen.kt#9igjgp");
            boolean zChangedInstance = composer.changedInstance(bookViewModel);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda33
                    public final Object invoke() {
                        return ProfileScreenKt.ProfileScreen$lambda$136$lambda$135$lambda$134(bookViewModel, mutableState, mutableState2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ButtonKt.Button((Function0) objRememberedValue, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$ProfileScreenKt.INSTANCE.m344getLambda$662875800$app(), composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$136$lambda$135$lambda$134(BookViewModel bookViewModel, MutableState mutableState, MutableState mutableState2) {
        Integer intOrNull = StringsKt.toIntOrNull(ProfileScreen$lambda$44(mutableState));
        bookViewModel.updateReadingGoal(intOrNull != null ? intOrNull.intValue() : 12);
        ProfileScreen$lambda$33(mutableState2, false);
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$139(final MutableState mutableState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C494@22366L33,494@22345L110:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(556978198, i, -1, "com.example.ui.screens.ProfileScreen.<anonymous> (ProfileScreen.kt:494)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, -1614862441, "CC(remember):ProfileScreen.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda43
                    public final Object invoke() {
                        return ProfileScreenKt.ProfileScreen$lambda$139$lambda$138$lambda$137(mutableState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ButtonKt.TextButton((Function0) objRememberedValue, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$ProfileScreenKt.INSTANCE.getLambda$2079316345$app(), composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$139$lambda$138$lambda$137(MutableState mutableState) {
        ProfileScreen$lambda$33(mutableState, false);
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$146$lambda$145(MutableState mutableState) {
        ProfileScreen$lambda$36(mutableState, false);
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$158(final MutableState mutableState, final MutableState mutableState2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C512@22972L1172:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-481079180, i, -1, "com.example.ui.screens.ProfileScreen.<anonymous> (ProfileScreen.kt:512)");
            }
            Arrangement.Vertical vertical = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(10.0f));
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
            ComposerKt.sourceInformationMarkerStart(composer, 1448057299, "C513@23165L10,513@23052L135,516@23317L25,514@23208L440,525@23779L26,523@23669L457:ProfileScreen.kt#2thlc2");
            TextKt.Text--4IGK_g("Enter the book you want to read. We'll alert you whenever someone lists it nearby!", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 6, 0, 65534);
            String strProfileScreen$lambda$38 = ProfileScreen$lambda$38(mutableState);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            Shape shape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -1754396361, "CC(remember):ProfileScreen.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda45
                    public final Object invoke(Object obj) {
                        return ProfileScreenKt.ProfileScreen$lambda$158$lambda$157$lambda$154$lambda$153(mutableState, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            OutlinedTextFieldKt.OutlinedTextField(strProfileScreen$lambda$38, (Function1) objRememberedValue, modifierFillMaxWidth$default, false, false, (TextStyle) null, ComposableSingletons$ProfileScreenKt.INSTANCE.getLambda$1504985060$app(), ComposableSingletons$ProfileScreenKt.INSTANCE.m340getLambda$300518235$app(), (Function2) null, (Function2) null, (Function2) null, (Function2) null, (Function2) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, shape, (TextFieldColors) null, composer, 14156208, 12582912, 0, 6160184);
            String strProfileScreen$lambda$41 = ProfileScreen$lambda$41(mutableState2);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            Shape shape2 = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -1754381576, "CC(remember):ProfileScreen.kt#9igjgp");
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda46
                    public final Object invoke(Object obj) {
                        return ProfileScreenKt.ProfileScreen$lambda$158$lambda$157$lambda$156$lambda$155(mutableState2, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            OutlinedTextFieldKt.OutlinedTextField(strProfileScreen$lambda$41, (Function1) objRememberedValue2, modifierFillMaxWidth$default2, false, false, (TextStyle) null, ComposableSingletons$ProfileScreenKt.INSTANCE.getLambda$2014956429$app(), ComposableSingletons$ProfileScreenKt.INSTANCE.getLambda$2093077518$app(), (Function2) null, (Function2) null, (Function2) null, (Function2) null, (Function2) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, shape2, (TextFieldColors) null, composer, 14156208, 12582912, 0, 6160184);
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

    static final Unit ProfileScreen$lambda$158$lambda$157$lambda$154$lambda$153(MutableState mutableState, String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        mutableState.setValue(str);
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$158$lambda$157$lambda$156$lambda$155(MutableState mutableState, String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        mutableState.setValue(str);
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$149(final BookViewModel bookViewModel, final MutableState mutableState, final MutableState mutableState2, final MutableState mutableState3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C536@24244L358,535@24206L540:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(180539545, i, -1, "com.example.ui.screens.ProfileScreen.<anonymous> (ProfileScreen.kt:535)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, 1699813055, "CC(remember):ProfileScreen.kt#9igjgp");
            boolean zChangedInstance = composer.changedInstance(bookViewModel);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda44
                    public final Object invoke() {
                        return ProfileScreenKt.ProfileScreen$lambda$149$lambda$148$lambda$147(bookViewModel, mutableState, mutableState2, mutableState3);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ButtonKt.Button((Function0) objRememberedValue, (Modifier) null, !StringsKt.isBlank(ProfileScreen$lambda$38(mutableState)), (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$ProfileScreenKt.INSTANCE.m329getLambda$1303961943$app(), composer, 805306368, 506);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$149$lambda$148$lambda$147(BookViewModel bookViewModel, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        if (!StringsKt.isBlank(ProfileScreen$lambda$38(mutableState))) {
            BookViewModel.addToWishlist$default(bookViewModel, ProfileScreen$lambda$38(mutableState), ProfileScreen$lambda$41(mutableState2), null, 4, null);
            mutableState.setValue("");
            mutableState2.setValue("");
            ProfileScreen$lambda$36(mutableState3, false);
        }
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$152(final MutableState mutableState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C550@24829L33,550@24808L110:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-84107945, i, -1, "com.example.ui.screens.ProfileScreen.<anonymous> (ProfileScreen.kt:550)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, 776644760, "CC(remember):ProfileScreen.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda38
                    public final Object invoke() {
                        return ProfileScreenKt.ProfileScreen$lambda$152$lambda$151$lambda$150(mutableState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ButtonKt.TextButton((Function0) objRememberedValue, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$ProfileScreenKt.INSTANCE.getLambda$1438230202$app(), composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$152$lambda$151$lambda$150(MutableState mutableState) {
        ProfileScreen$lambda$36(mutableState, false);
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$163$lambda$160$lambda$159(MutableState mutableState) {
        mutableState.setValue(null);
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$163$lambda$162$lambda$161(Function1 function1, Book book, MutableState mutableState) {
        mutableState.setValue(null);
        function1.invoke(book.getId());
        return Unit.INSTANCE;
    }

    public static final void UserProfileHeader(final User user, final String str, final Function0<Unit> function0, final Function0<Unit> function1, final Function0<Unit> function2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(function0, "onLogoutClick");
        Intrinsics.checkNotNullParameter(function1, "onUploadPic");
        Intrinsics.checkNotNullParameter(function2, "onEditGoal");
        Composer composerStartRestartGroup = composer.startRestartGroup(914087504);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(UserProfileHeader)P(4!1,2,3)586@25866L11,586@25816L70,587@25921L46,588@25974L8565,581@25614L8925:ProfileScreen.kt#2thlc2");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(user) ? 4 : 2) | i;
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
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 16384 : FragmentTransaction.TRANSIT_EXIT_MASK;
        }
        if ((i2 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(914087504, i2, -1, "com.example.ui.screens.UserProfileHeader (ProfileScreen.kt:580)");
            }
            CardKt.ElevatedCard(PaddingKt.padding-VpY3zN4(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(16.0f), Dp.constructor-impl(8.0f)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(24.0f)), CardDefaults.INSTANCE.elevatedCardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0L, 0L, composerStartRestartGroup, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.elevatedCardElevation-aqJV_2Y(Dp.constructor-impl(2.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, (CardDefaults.$stable << 18) | 6, 62), ComposableLambdaKt.rememberComposableLambda(-281268725, true, new Function3() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ProfileScreenKt.UserProfileHeader$lambda$180(user, function0, function1, str, function2, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 24582, 0);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda4
                public final Object invoke(Object obj, Object obj2) {
                    return ProfileScreenKt.UserProfileHeader$lambda$181(user, str, function0, function1, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final Unit UserProfileHeader$lambda$180(final User user, Function0 function0, final Function0 function1, String str, final Function0 function2, ColumnScope columnScope, Composer composer, int i) {
        int i2;
        BoxScope boxScope;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z;
        boolean z2;
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(columnScope, "$this$ElevatedCard");
        ComposerKt.sourceInformation(composer2, "C589@25984L8549:ProfileScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-281268725, i, -1, "com.example.ui.screens.UserProfileHeader.<anonymous> (ProfileScreen.kt:589)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(20.0f));
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
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
            Updater.set-impl(composer3, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer3, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composer3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composer3.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.set-impl(composer3, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScope columnScope2 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, 271700583, "C595@26176L2647,646@28849L41,650@29076L10,652@29183L11,648@28916L302,656@29313L10,657@29373L11,654@29231L184,660@29441L41,663@29554L1206,686@30774L41,693@31045L11,695@31149L2585,689@30872L2862,738@33748L41,743@33983L11,742@33912L106,745@34106L11,740@33815L708:ProfileScreen.kt#2thlc2");
            Modifier modifier2 = SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(88.0f));
            Alignment center = Alignment.Companion.getCenter();
            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifier2);
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
            BoxScope boxScope2 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, -1003431427, "C603@26489L11,604@26554L17,599@26314L1713,628@28136L11,629@28206L11,634@28437L17,626@28044L765:ProfileScreen.kt#2thlc2");
            Modifier modifier3 = BackgroundKt.background-bw27NRU$default(ClipKt.clip(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(80.0f)), RoundedCornerShapeKt.getCircleShape()), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), (Shape) null, 2, (Object) null);
            ComposerKt.sourceInformationMarkerStart(composer2, 1907299096, "CC(remember):ProfileScreen.kt#9igjgp");
            boolean zChanged = composer2.changed(function1);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda39
                    public final Object invoke() {
                        return ProfileScreenKt.UserProfileHeader$lambda$180$lambda$179$lambda$170$lambda$166$lambda$165(function1);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Modifier modifier4 = ClickableKt.clickable-XHw0xAI$default(modifier3, false, (String) null, (Role) null, (Function0) objRememberedValue, 7, (Object) null);
            Alignment center2 = Alignment.Companion.getCenter();
            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifier4);
            Function0 constructor3 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
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
            Updater.set-impl(composer5, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer5, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer5.getInserting() || !Intrinsics.areEqual(composer5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composer5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composer5.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.set-impl(composer5, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScope boxScope3 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, -1387731750, "C:ProfileScreen.kt#2thlc2");
            String profilePicBase64 = (str == null || StringsKt.isBlank(str)) ? user.getProfilePicBase64() : str;
            if (profilePicBase64 == null || !StringsKt.startsWith$default(profilePicBase64, "http", false, 2, (Object) null)) {
                i2 = 2;
                boxScope = boxScope2;
                str2 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                str3 = "CC(remember):ProfileScreen.kt#9igjgp";
                str4 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                if (profilePicBase64 != null) {
                    str5 = null;
                    if (StringsKt.startsWith$default(profilePicBase64, "data:image/jpeg;base64,", false, 2, (Object) null)) {
                        composer2.startReplaceGroup(-1387202674);
                        ComposerKt.sourceInformation(composer2, "618@27558L229");
                        byte[] bArrDecode = Base64.decode(StringsKt.removePrefix(profilePicBase64, "data:image/jpeg;base64,"), 0);
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                        Intrinsics.checkNotNull(bitmapDecodeByteArray);
                        z = true;
                        z2 = false;
                        ImageKt.Image-5h-nEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmapDecodeByteArray), "Profile Picture", SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null), (Alignment) null, ContentScale.Companion.getCrop(), 0.0f, (ColorFilter) null, 0, composer, 25008, 232);
                        composer2 = composer;
                        composer2.endReplaceGroup();
                    }
                } else {
                    str5 = null;
                }
                z = true;
                z2 = false;
                composer2.startReplaceGroup(-1386630445);
                ComposerKt.sourceInformation(composer2, "623@27956L11,623@27841L146");
                IconKt.Icon-ww6aTOc(AccountCircleKt.getAccountCircle(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(48.0f)), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnPrimaryContainer-0d7_KjU(), composer2, 432, 0);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-1387548820);
                ComposerKt.sourceInformation(composer2, "610@26913L217");
                boxScope = boxScope2;
                i2 = 2;
                str2 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                str3 = "CC(remember):ProfileScreen.kt#9igjgp";
                str4 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                SingletonAsyncImageKt.m108AsyncImagegl8XCv8(profilePicBase64, "Profile Picture", SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null), null, null, null, ContentScale.Companion.getCrop(), 0.0f, null, 0, false, null, composer, 1573296, 0, 4024);
                composer2 = composer;
                composer2.endReplaceGroup();
                z = true;
                str5 = null;
                z2 = false;
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Shape circleShape = RoundedCornerShapeKt.getCircleShape();
            long j = MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getPrimary-0d7_KjU();
            long j2 = MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnPrimary-0d7_KjU();
            float f = Dp.constructor-impl(2.0f);
            Modifier modifierAlign = boxScope.align(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(26.0f)), Alignment.Companion.getBottomEnd());
            ComposerKt.sourceInformationMarkerStart(composer2, 1907359352, str3);
            boolean zChanged2 = composer2.changed(function1);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda40
                    public final Object invoke() {
                        return ProfileScreenKt.UserProfileHeader$lambda$180$lambda$179$lambda$170$lambda$169$lambda$168(function1);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            int i3 = i2;
            SurfaceKt.Surface-T9BRK9s(ClickableKt.clickable-XHw0xAI$default(modifierAlign, false, (String) null, (Role) null, (Function0) objRememberedValue2, 7, (Object) null), circleShape, j, j2, 0.0f, f, (BorderStroke) null, ComposableSingletons$ProfileScreenKt.INSTANCE.getLambda$297010338$app(), composer2, 12779520, 80);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(12.0f)), composer2, 6);
            TextKt.Text--4IGK_g(!StringsKt.isBlank(user.getDisplayName()) ? user.getDisplayName() : StringsKt.substringBefore$default(user.getUsername(), "@", str5, i3, str5), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurface-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getTitleLarge(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
            TextKt.Text--4IGK_g(user.getUsername(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 0, 0, 65530);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), composer, 6);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            Arrangement.Horizontal spaceEvenly = Arrangement.INSTANCE.getSpaceEvenly();
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceEvenly, centerVertically, composer, 54);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, str2);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
            Function0 constructor4 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, str4);
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
            Updater.set-impl(composer6, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer6, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer6.getInserting() || !Intrinsics.areEqual(composer6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composer6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composer6.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.set-impl(composer6, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1330011983, "C668@29861L11,668@29771L110,673@30069L11,669@29898L235,675@30247L11,675@30150L119,680@30457L11,676@30286L235,683@30664L82:ProfileScreen.kt#2thlc2");
            m387StatItemBx497Mc("Trust Points", String.valueOf(user.getTrustScore()), GppGoodKt.getGppGood(Icons.INSTANCE.getDefault()), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), composer, 6);
            BoxKt.Box(BackgroundKt.background-bw27NRU$default(SizeKt.height-3ABfNKs(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(1.0f)), Dp.constructor-impl(36.0f)), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOutlineVariant-0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null), (Shape) null, 2, (Object) null), composer, 0);
            m387StatItemBx497Mc("Books Swapped", String.valueOf(user.getCompletedSwaps()), SwapHorizKt.getSwapHoriz(Icons.INSTANCE.getDefault()), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSecondary-0d7_KjU(), composer, 6);
            BoxKt.Box(BackgroundKt.background-bw27NRU$default(SizeKt.height-3ABfNKs(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(1.0f)), Dp.constructor-impl(36.0f)), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOutlineVariant-0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null), (Shape) null, 2, (Object) null), composer, 0);
            m387StatItemBx497Mc("Money Saved", "₹" + (user.getTotalMoneySaved() > 0.0d ? (int) user.getTotalMoneySaved() : user.getCompletedSwaps() * 350), SavingsKt.getSavings(Icons.INSTANCE.getDefault()), ColorKt.Color(4279994175L), composer, 3078);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(14.0f)), composer, 6);
            SurfaceKt.Surface-T9BRK9s(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(16.0f))), (Shape) null, Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSecondaryContainer-0d7_KjU(), 0.45f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, Dp.constructor-impl(1.0f), 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(325426780, true, new Function2() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda41
                public final Object invoke(Object obj, Object obj2) {
                    return ProfileScreenKt.UserProfileHeader$lambda$180$lambda$179$lambda$178(user, function2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 12607488, 106);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(14.0f)), composer, 6);
            ButtonKt.OutlinedButton(function0, SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(42.0f)), false, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), ButtonDefaults.INSTANCE.outlinedButtonColors-ro_MJ88(0L, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU(), 0L, 0L, composer, ButtonDefaults.$stable << 12, 13), (ButtonElevation) null, BorderStrokeKt.BorderStroke-cXLIe8U(Dp.constructor-impl(1.0f), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError-0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$ProfileScreenKt.INSTANCE.m328getLambda$1198244877$app(), composer, 805306416, 420);
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

    static final Unit UserProfileHeader$lambda$180$lambda$179$lambda$170$lambda$166$lambda$165(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    static final Unit UserProfileHeader$lambda$180$lambda$179$lambda$170$lambda$169$lambda$168(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    static final Unit UserProfileHeader$lambda$180$lambda$179$lambda$178(User user, Function0 function0, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C696@31167L2553:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(325426780, i, -1, "com.example.ui.screens.UserProfileHeader.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:696)");
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
            ComposerKt.sourceInformationMarkerStart(composer, 610249079, "C697@31232L1007,711@32260L40,716@32638L12,718@32802L11,719@32876L11,715@32578L346,721@32945L40,722@33006L696:ProfileScreen.kt#2thlc2");
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
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
            ComposerKt.sourceInformationMarkerStart(composer, 1410781514, "C702@31490L445,707@31960L257:ProfileScreen.kt#2thlc2");
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
            ComposerKt.sourceInformationMarkerStart(composer, -1604170252, "C703@31652L11,703@31572L135,704@31736L39,705@31857L10,705@31804L105:ProfileScreen.kt#2thlc2");
            IconKt.Icon-ww6aTOc(AutoStoriesKt.getAutoStories(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(20.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSecondary-0d7_KjU(), composer, 432, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            TextKt.Text--4IGK_g("2026 Reading Challenge", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleSmall(), composer, 196614, 0, 65502);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            IconButtonKt.IconButton(function0, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(28.0f)), false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableSingletons$ProfileScreenKt.INSTANCE.getLambda$837332741$app(), composer, 196656, 28);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            int readingGoal = user.getReadingGoal() > 0 ? user.getReadingGoal() : 12;
            int iCoerceAtLeast = RangesKt.coerceAtLeast(user.getBooksReadThisYear(), user.getCompletedSwaps());
            final float fCoerceIn = RangesKt.coerceIn(iCoerceAtLeast / readingGoal, 0.0f, 1.0f);
            ComposerKt.sourceInformationMarkerStart(composer, 2097937970, "CC(remember):ProfileScreen.kt#9igjgp");
            boolean zChanged = composer.changed(fCoerceIn);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda52
                    public final Object invoke() {
                        return Float.valueOf(ProfileScreenKt.UserProfileHeader$lambda$180$lambda$179$lambda$178$lambda$177$lambda$175$lambda$174(fCoerceIn));
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ProgressIndicatorKt.LinearProgressIndicator-GJbTh5U((Function0) objRememberedValue, ClipKt.clip(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(8.0f)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(4.0f))), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSecondary-0d7_KjU(), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0, 0.0f, (Function1) null, composer, 0, 112);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            Arrangement.Horizontal spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(spaceBetween2, Alignment.Companion.getTop(), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default2);
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
            ComposerKt.sourceInformationMarkerStart(composer, 1296992202, "C725@33245L10,723@33122L229,730@33502L10,732@33633L11,728@33376L304:ProfileScreen.kt#2thlc2");
            TextKt.Text--4IGK_g(iCoerceAtLeast + " of " + readingGoal + " books read this year", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
            TextKt.Text--4IGK_g(((int) (100.0f * fCoerceIn)) + "% completed", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSecondary-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
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

    /* JADX INFO: renamed from: StatItem-Bx497Mc, reason: not valid java name */
    public static final void m387StatItemBx497Mc(final String str, final String str2, final ImageVector imageVector, final long j, Composer composer, final int i) {
        int i2;
        long j2;
        Intrinsics.checkNotNullParameter(str, "label");
        Intrinsics.checkNotNullParameter(str2, "value");
        Intrinsics.checkNotNullParameter(imageVector, "icon");
        Composer composerStartRestartGroup = composer.startRestartGroup(1522909063);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(StatItem)P(2,3,1,0:c#ui.graphics.Color)761@34704L464:ProfileScreen.kt#2thlc2");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(imageVector) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i & 3072) == 0) {
            j2 = j;
            i2 |= composerStartRestartGroup.changed(j2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        } else {
            j2 = j;
        }
        int i3 = i2;
        if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1522909063, i3, -1, "com.example.ui.screens.StatItem (ProfileScreen.kt:760)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier = Modifier.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1535599251, "C762@34773L84,763@34866L40,764@34949L10,764@35024L11,764@34915L131,765@35089L10,765@35133L11,765@35055L107:ProfileScreen.kt#2thlc2");
            IconKt.Icon-ww6aTOc(imageVector, (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(28.0f)), j2, composerStartRestartGroup, (i3 & 7168) | ((i3 >> 6) & 14) | 432, 0);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composerStartRestartGroup, 6);
            TextKt.Text--4IGK_g(str2, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurface-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getTitleLarge(), composerStartRestartGroup, ((i3 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
            TextKt.Text--4IGK_g(str, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodySmall(), composerStartRestartGroup, i3 & 14, 0, 65530);
            composerStartRestartGroup = composerStartRestartGroup;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda42
                public final Object invoke(Object obj, Object obj2) {
                    return ProfileScreenKt.StatItem_Bx497Mc$lambda$183(str, str2, imageVector, j, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ProfileEmptyState(final ImageVector imageVector, String str, String str2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        final String str3;
        final String str4;
        Intrinsics.checkNotNullParameter(imageVector, "icon");
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(str2, "subtitle");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1576742502);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ProfileEmptyState)P(!1,2)775@35314L1524:ProfileScreen.kt#2thlc2");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(imageVector) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i2 & BuildConfig.VERSION_CODE) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            str3 = str;
            str4 = str2;
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1576742502, i2, -1, "com.example.ui.screens.ProfileEmptyState (ProfileScreen.kt:774)");
            }
            Modifier modifier = PaddingKt.padding-VpY3zN4(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(24.0f), Dp.constructor-impl(32.0f));
            Alignment center = Alignment.Companion.getCenter();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
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
            Composer composer3 = Updater.constructor-impl(composerStartRestartGroup);
            Updater.set-impl(composer3, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer3, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composer3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composer3.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.set-impl(composer3, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScope boxScope = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 929525514, "C781@35495L1337:ProfileScreen.kt#2thlc2");
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            Arrangement.Vertical center2 = Arrangement.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier2 = Modifier.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center2, centerHorizontally, composerStartRestartGroup, 54);
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
            Composer composer4 = Updater.constructor-impl(composerStartRestartGroup);
            Updater.set-impl(composer4, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer4, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer4.getInserting() || !Intrinsics.areEqual(composer4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composer4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composer4.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.set-impl(composer4, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -971115117, "C787@35728L11,789@35837L343,785@35644L536,799@36193L41,802@36321L10,804@36429L11,800@36247L217,806@36477L40,809@36607L10,810@36667L11,807@36530L292:ProfileScreen.kt#2thlc2");
            int i3 = i2;
            SurfaceKt.Surface-T9BRK9s(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(64.0f)), RoundedCornerShapeKt.getCircleShape(), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(473192817, true, new Function2() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda36
                public final Object invoke(Object obj, Object obj2) {
                    return ProfileScreenKt.ProfileEmptyState$lambda$187$lambda$186$lambda$185(imageVector, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 12582918, 120);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(14.0f)), composerStartRestartGroup, 6);
            composer2 = composerStartRestartGroup;
            TextKt.Text--4IGK_g(str, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurface-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getTitleMedium(), composer2, ((i3 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer2, 6);
            TextStyle bodySmall = MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodySmall();
            long j = MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU();
            int i4 = TextAlign.Companion.getCenter-e0LSkKk();
            str3 = str;
            str4 = str2;
            TextKt.Text--4IGK_g(str4, (Modifier) null, j, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.box-impl(i4), TextUnitKt.getSp(18), 0, false, 0, 0, (Function1) null, bodySmall, composer2, (i3 >> 6) & 14, 6, 63994);
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
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda37
                public final Object invoke(Object obj, Object obj2) {
                    return ProfileScreenKt.ProfileEmptyState$lambda$188(imageVector, str3, str4, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final Unit ProfileEmptyState$lambda$187$lambda$186$lambda$185(ImageVector imageVector, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C790@35855L311:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(473192817, i, -1, "com.example.ui.screens.ProfileEmptyState.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:790)");
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
            ComposerKt.sourceInformationMarkerStart(composer, -1060563054, "C795@36107L11,791@35918L230:ProfileScreen.kt#2thlc2");
            IconKt.Icon-ww6aTOc(imageVector, (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(32.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOutline-0d7_KjU(), composer, 432, 0);
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

    public static final void WishlistHeader(final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(function0, "onAddClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(806752789);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(WishlistHeader)820@36903L1052:ProfileScreen.kt#2thlc2");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(806752789, i2, -1, "com.example.ui.screens.WishlistHeader (ProfileScreen.kt:819)");
            }
            Modifier modifier = PaddingKt.padding-VpY3zN4(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(16.0f), Dp.constructor-impl(8.0f));
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composerStartRestartGroup, 54);
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
            Updater.set-impl(composer2, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer2, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer2.getInserting() || !Intrinsics.areEqual(composer2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composer2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composer2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.set-impl(composer2, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2068276363, "C827@37152L325,831@37486L39,832@37534L415:ProfileScreen.kt#2thlc2");
            Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.Companion, 1.0f, false, 2, (Object) null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default);
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
            Updater.set-impl(composer3, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer3, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composer3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composer3.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.set-impl(composer3, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2083274718, "C828@37258L10,828@37205L106,829@37394L10,829@37438L11,829@37324L143:ProfileScreen.kt#2thlc2");
            TextKt.Text--4IGK_g("Books You Want to Read", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getTitleMedium(), composerStartRestartGroup, 196614, 0, 65502);
            TextKt.Text--4IGK_g("You'll get an alert when listed nearby.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodySmall(), composerStartRestartGroup, 6, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composerStartRestartGroup, 6);
            ButtonKt.Button(function0, (Modifier) null, false, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, PaddingKt.PaddingValues-YgX7TsA(Dp.constructor-impl(12.0f), Dp.constructor-impl(6.0f)), (MutableInteractionSource) null, ComposableSingletons$ProfileScreenKt.INSTANCE.getLambda$883711041$app(), composerStartRestartGroup, (i2 & 14) | 817889280, 374);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda51
                public final Object invoke(Object obj, Object obj2) {
                    return ProfileScreenKt.WishlistHeader$lambda$191(function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void WishlistItemRow(final WishlistRequest wishlistRequest, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(wishlistRequest, "item");
        Intrinsics.checkNotNullParameter(function0, "onDelete");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1936102841);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(WishlistItemRow)852@38195L11,854@38253L2281,849@38069L2465:ProfileScreen.kt#2thlc2");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(wishlistRequest) ? 4 : 2) | i;
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
                ComposerKt.traceEventStart(-1936102841, i2, -1, "com.example.ui.screens.WishlistItemRow (ProfileScreen.kt:848)");
            }
            SurfaceKt.Surface-T9BRK9s(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(16.0f)), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0.0f, Dp.constructor-impl(1.0f), (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-613888606, true, new Function2() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda88
                public final Object invoke(Object obj, Object obj2) {
                    return ProfileScreenKt.WishlistItemRow$lambda$195(function0, wishlistRequest, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 12779526, 88);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda98
                public final Object invoke(Object obj, Object obj2) {
                    return ProfileScreenKt.WishlistItemRow$lambda$196(wishlistRequest, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final Unit WishlistItemRow$lambda$195(Function0 function0, WishlistRequest wishlistRequest, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C855@38263L2265:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-613888606, i, -1, "com.example.ui.screens.WishlistItemRow.<anonymous> (ProfileScreen.kt:855)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(14.0f));
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
            ComposerKt.sourceInformationMarkerStart(composer, -393725429, "C860@38476L1782,902@40271L247:ProfileScreen.kt#2thlc2");
            Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.Companion, 1.0f, false, 2, (Object) null);
            Alignment.Vertical centerVertically2 = Alignment.Companion.getCenterVertically();
            Arrangement.Horizontal horizontal = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(12.0f));
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontal, centerVertically2, composer, 54);
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
            ComposerKt.sourceInformationMarkerStart(composer, -1784179590, "C867@38785L11,865@38693L589,879@39299L945:ProfileScreen.kt#2thlc2");
            SurfaceKt.Surface-T9BRK9s(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(40.0f)), RoundedCornerShapeKt.getCircleShape(), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableSingletons$ProfileScreenKt.INSTANCE.getLambda$520156255$app(), composer, 12582918, 120);
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
            ComposerKt.sourceInformationMarkerStart(composer, 859327709, "C882@39427L10,880@39328L234,896@40074L10,894@39962L264:ProfileScreen.kt#2thlc2");
            TextKt.Text--4IGK_g(wishlistRequest.getBookTitle(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleSmall(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 3072, 57310);
            Composer composer5 = composer;
            if (StringsKt.isBlank(wishlistRequest.getAuthor())) {
                composer5.startReplaceGroup(820285502);
            } else {
                composer5.startReplaceGroup(859592758);
                ComposerKt.sourceInformation(composer5, "889@39751L10,890@39823L11,887@39639L280");
                TextKt.Text--4IGK_g("by " + wishlistRequest.getAuthor(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer5, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer5, MaterialTheme.$stable).getBodySmall(), composer, 0, 3072, 57338);
                composer5 = composer;
            }
            composer5.endReplaceGroup();
            TextKt.Text--4IGK_g("📡 Proximity alert active", (Modifier) null, ColorKt.Color(4279994175L), 0L, (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer5, MaterialTheme.$stable).getLabelSmall(), composer, 196998, 0, 65498);
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
            IconButtonKt.IconButton(function0, (Modifier) null, false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableSingletons$ProfileScreenKt.INSTANCE.m342getLambda$390328063$app(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
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

    public static final void BookListSection(final List<Book> list, final String str, Function1<? super Book, Unit> function1, Composer composer, final int i) {
        int i2;
        final Function1<? super Book, Unit> function2;
        Intrinsics.checkNotNullParameter(list, "books");
        Intrinsics.checkNotNullParameter(str, "emptyText");
        Intrinsics.checkNotNullParameter(function1, "onBookClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1154267385);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BookListSection):ProfileScreen.kt#2thlc2");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i3 = i2;
        if ((i3 & BuildConfig.VERSION_CODE) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function2 = function1;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1154267385, i3, -1, "com.example.ui.screens.BookListSection (ProfileScreen.kt:918)");
            }
            if (list.isEmpty()) {
                composerStartRestartGroup.startReplaceGroup(1271660115);
                ComposerKt.sourceInformation(composerStartRestartGroup, "920@40688L838");
                Modifier modifier = PaddingKt.padding-3ABfNKs(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(32.0f));
                Alignment center = Alignment.Companion.getCenter();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
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
                Updater.set-impl(composer2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl(composer2, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composer2.getInserting() || !Intrinsics.areEqual(composer2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composer2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composer2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.set-impl(composer2, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScope boxScope = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1319683770, "C926@40861L655:ProfileScreen.kt#2thlc2");
                Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                Modifier modifier2 = Modifier.Companion;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
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
                Updater.set-impl(composer3, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl(composer3, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composer3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composer3.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.set-impl(composer3, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 790438015, "C931@41141L11,927@40938L240,933@41195L41,936@41339L10,937@41404L11,934@41253L249:ProfileScreen.kt#2thlc2");
                IconKt.Icon-ww6aTOc(MenuBookKt.getMenuBook(Icons.AutoMirrored.Filled.INSTANCE), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(48.0f)), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOutline-0d7_KjU(), composerStartRestartGroup, 432, 0);
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(12.0f)), composerStartRestartGroup, 6);
                TextKt.Text--4IGK_g(str, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodyMedium(), composerStartRestartGroup, ((i3 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
                composerStartRestartGroup = composerStartRestartGroup;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceGroup();
                function2 = function1;
            } else {
                composerStartRestartGroup.startReplaceGroup(1272497673);
                ComposerKt.sourceInformation(composerStartRestartGroup, "947@41730L154,943@41548L336");
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null);
                PaddingValues paddingValues = PaddingKt.PaddingValues-0680j_4(Dp.constructor-impl(16.0f));
                Arrangement.Vertical vertical = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(12.0f));
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1149432915, "CC(remember):ProfileScreen.kt#9igjgp");
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(list) | ((i3 & 896) == 256);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                    function2 = function1;
                    objRememberedValue = new Function1() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda0
                        public final Object invoke(Object obj) {
                            return ProfileScreenKt.BookListSection$lambda$203$lambda$202(list, function2, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    function2 = function1;
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                LazyDslKt.LazyColumn(modifierFillMaxSize$default, (LazyListState) null, paddingValues, false, vertical, (Alignment.Horizontal) null, (FlingBehavior) null, false, (Function1) objRememberedValue, composerStartRestartGroup, 24966, 234);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda11
                public final Object invoke(Object obj, Object obj2) {
                    return ProfileScreenKt.BookListSection$lambda$204(list, str, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final Unit BookListSection$lambda$203$lambda$202(final List list, final Function1 function1, LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyColumn");
        final Function1 function2 = new Function1() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda76
            public final Object invoke(Object obj) {
                return ProfileScreenKt.BookListSection$lambda$203$lambda$202$lambda$199((Book) obj);
            }
        };
        final ProfileScreenKt$BookListSection$lambda$203$lambda$202$$inlined$items$default$1 profileScreenKt$BookListSection$lambda$203$lambda$202$$inlined$items$default$1 = new Function1() { // from class: com.example.ui.screens.ProfileScreenKt$BookListSection$lambda$203$lambda$202$$inlined$items$default$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final Void m389invoke(Book book) {
                return null;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m389invoke((Book) obj);
            }
        };
        lazyListScope.items(list.size(), new Function1<Integer, Object>() { // from class: com.example.ui.screens.ProfileScreenKt$BookListSection$lambda$203$lambda$202$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i) {
                return function2.invoke(list.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: com.example.ui.screens.ProfileScreenKt$BookListSection$lambda$203$lambda$202$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i) {
                return profileScreenKt$BookListSection$lambda$203$lambda$202$$inlined$items$default$1.invoke(list.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.screens.ProfileScreenKt$BookListSection$lambda$203$lambda$202$$inlined$items$default$4
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
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
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
                composer.startReplaceGroup(1387710043);
                ComposerKt.sourceInformation(composer, "C*949@41838L21,949@41800L60:ProfileScreen.kt#2thlc2");
                ComposerKt.sourceInformationMarkerStart(composer, 44766017, "CC(remember):ProfileScreen.kt#9igjgp");
                boolean zChanged = composer.changed(function1) | composer.changedInstance(book);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    final Function1 function3 = function1;
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.ProfileScreenKt$BookListSection$2$1$2$1$1
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m388invoke();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m388invoke() {
                            function3.invoke(book);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                ProfileScreenKt.ProfileBookRow(book, (Function0) objRememberedValue, composer, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    static final Object BookListSection$lambda$203$lambda$202$lambda$199(Book book) {
        Intrinsics.checkNotNullParameter(book, "it");
        return book.getId();
    }

    public static final void ProfileBookRow(final Book book, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(book, "book");
        Intrinsics.checkNotNullParameter(function0, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1656462036);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ProfileBookRow)960@42049L13,962@42179L11,962@42137L62,963@42279L11,964@42313L5348,957@41964L5697:ProfileScreen.kt#2thlc2");
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
                ComposerKt.traceEventStart(-1656462036, i2, -1, "com.example.ui.screens.ProfileBookRow (ProfileScreen.kt:956)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1572855193, "CC(remember):ProfileScreen.kt#9igjgp");
            boolean z = (i2 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda55
                    public final Object invoke() {
                        return ProfileScreenKt.ProfileBookRow$lambda$206$lambda$205(function0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            CardKt.Card(ClickableKt.clickable-XHw0xAI$default(modifierFillMaxWidth$default, false, (String) null, (Role) null, (Function0) objRememberedValue, 7, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), CardDefaults.INSTANCE.cardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0L, 0L, composerStartRestartGroup, CardDefaults.$stable << 12, 14), (CardElevation) null, BorderStrokeKt.BorderStroke-cXLIe8U(Dp.constructor-impl(1.0f), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOutlineVariant-0d7_KjU()), ComposableLambdaKt.rememberComposableLambda(1304096030, true, new Function3() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda66
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ProfileScreenKt.ProfileBookRow$lambda$212(book, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda77
                public final Object invoke(Object obj, Object obj2) {
                    return ProfileScreenKt.ProfileBookRow$lambda$213(book, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final Unit ProfileBookRow$lambda$206$lambda$205(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:102:0x06f9  */
    /* JADX WARN: Code duplicated, block: B:103:0x0714  */
    static final Unit ProfileBookRow$lambda$212(final Book book, ColumnScope columnScope, Composer composer, int i) {
        int i2;
        String str;
        int i3;
        String str2;
        int i4;
        byte b;
        Object obj;
        long j;
        String str3;
        String str4;
        Composer composer2;
        Composer composer3 = composer;
        Intrinsics.checkNotNullParameter(columnScope, "$this$Card");
        ComposerKt.sourceInformation(composer3, "C965@42323L5332:ProfileScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer3.getSkipping()) {
            composer3.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1304096030, i, -1, "com.example.ui.screens.ProfileBookRow.<anonymous> (ProfileScreen.kt:965)");
            }
            Bitmap bitmapDecodeByteArray = null;
            Modifier modifier = PaddingKt.padding-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(12.0f));
            Arrangement.Horizontal horizontal = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(12.0f));
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontal, centerVertically, composer3, 54);
            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifier);
            Function0 constructor = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor);
            } else {
                composer3.useNode();
            }
            Composer composer4 = Updater.constructor-impl(composer3);
            Updater.set-impl(composer4, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer4, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer4.getInserting() || !Intrinsics.areEqual(composer4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composer4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composer4.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.set-impl(composer4, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer3, -1616383086, "C1022@44755L2053,1074@47293L352,1074@47258L387:ProfileScreen.kt#2thlc2");
            String imageUrl = book.getImageUrl();
            if (imageUrl == null || StringsKt.isBlank(imageUrl)) {
                composer3.startReplaceGroup(-1615049839);
                ComposerKt.sourceInformation(composer3, "1009@44301L11,1005@44106L591");
                Modifier modifier2 = BackgroundKt.background-bw27NRU$default(ClipKt.clip(SizeKt.size-VpY3zN4(Modifier.Companion, Dp.constructor-impl(48.0f), Dp.constructor-impl(72.0f)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(6.0f))), MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), (Shape) null, 2, (Object) null);
                Alignment center = Alignment.Companion.getCenter();
                ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                i2 = 0;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                str = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                i3 = -1323940314;
                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, str);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifier2);
                Function0 constructor2 = ComposeUiNode.Companion.getConstructor();
                str2 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                i4 = -692256719;
                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str2);
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor2);
                } else {
                    composer3.useNode();
                }
                Composer composer5 = Updater.constructor-impl(composer3);
                Updater.set-impl(composer5, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl(composer5, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composer5.getInserting() || !Intrinsics.areEqual(composer5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composer5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composer5.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.set-impl(composer5, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScope boxScope = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer3, -481930566, "C1016@44629L11,1012@44426L253:ProfileScreen.kt#2thlc2");
                IconKt.Icon-ww6aTOc(BookKt.getBook(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(24.0f)), MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), composer3, 432, 0);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                composer3.endReplaceGroup();
            } else {
                composer3.startReplaceGroup(-1616458944);
                ComposerKt.sourceInformation(composer3, "");
                if (StringsKt.startsWith$default(book.getImageUrl(), "data:image", false, 2, (Object) null)) {
                    composer3.startReplaceGroup(-1616412041);
                    ComposerKt.sourceInformation(composer3, "975@42739L445");
                    String imageUrl2 = book.getImageUrl();
                    ComposerKt.sourceInformationMarkerStart(composer3, -1160520385, "CC(remember):ProfileScreen.kt#9igjgp");
                    boolean zChanged = composer3.changed(imageUrl2);
                    Object objRememberedValue = composer3.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                        try {
                            byte[] bArrDecode = Base64.decode(StringsKt.substringAfter$default(book.getImageUrl(), ",", (String) null, 2, (Object) null), 0);
                            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                        } catch (Exception unused) {
                        }
                        composer3.updateRememberedValue(bitmapDecodeByteArray);
                        objRememberedValue = bitmapDecodeByteArray;
                    }
                    Bitmap bitmap = (Bitmap) objRememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    if (bitmap != null) {
                        composer3.startReplaceGroup(-1615911918);
                        ComposerKt.sourceInformation(composer3, "985@43251L382");
                        ImageKt.Image-5h-nEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmap), "Book Cover", ClipKt.clip(SizeKt.size-VpY3zN4(Modifier.Companion, Dp.constructor-impl(48.0f), Dp.constructor-impl(72.0f)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(6.0f))), (Alignment) null, ContentScale.Companion.getCrop(), 0.0f, (ColorFilter) null, 0, composer3, 24624, 232);
                        composer2 = composer3;
                    } else {
                        composer2 = composer3;
                        composer2.startReplaceGroup(-1658805440);
                    }
                    composer2.endReplaceGroup();
                    composer2.endReplaceGroup();
                    str3 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                    str4 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                    composer3 = composer2;
                } else {
                    composer3.startReplaceGroup(-1615462821);
                    ComposerKt.sourceInformation(composer3, "995@43701L349");
                    str3 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                    str4 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                    composer3 = composer;
                    SingletonAsyncImageKt.m108AsyncImagegl8XCv8(book.getImageUrl(), "Book Cover", ClipKt.clip(SizeKt.size-VpY3zN4(Modifier.Companion, Dp.constructor-impl(48.0f), Dp.constructor-impl(72.0f)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(6.0f))), null, null, null, ContentScale.Companion.getCrop(), 0.0f, null, 0, false, null, composer3, 1572912, 0, 4024);
                    composer3.endReplaceGroup();
                }
                composer3.endReplaceGroup();
                str2 = str3;
                str = str4;
                i2 = 0;
                i3 = -1323940314;
                i4 = -692256719;
            }
            Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.Companion, 1.0f, false, 2, (Object) null);
            ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer3, i2);
            ComposerKt.sourceInformationMarkerStart(composer3, i3, str);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, i2);
            CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, modifierWeight$default);
            Function0 constructor3 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer3, i4, str2);
            if (!(composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor3);
            } else {
                composer3.useNode();
            }
            Composer composer6 = Updater.constructor-impl(composer3);
            Updater.set-impl(composer6, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer6, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer6.getInserting() || !Intrinsics.areEqual(composer6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composer6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composer6.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.set-impl(composer6, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScope columnScope2 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer3, -1310540211, "C1025@44899L10,1027@45013L11,1023@44812L274,1032@45199L10,1033@45263L11,1030@45103L240,1050@46075L10,1051@46140L11,1048@45979L207:ProfileScreen.kt#2thlc2");
            TextKt.Text--4IGK_g(book.getTitle(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getOnSurface-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodyLarge(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 3072, 57306);
            TextKt.Text--4IGK_g("by " + book.getAuthor(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 0, 3072, 57338);
            Composer composer7 = composer;
            String genre = book.getGenre();
            if (genre == null || StringsKt.isBlank(genre)) {
                b = -1355056150;
                composer7.startReplaceGroup(-1355056150);
                composer7.endReplaceGroup();
            } else {
                composer7.startReplaceGroup(-1310013770);
                ComposerKt.sourceInformation(composer7, "1037@45415L40,1040@45583L10,1041@45652L11,1038@45476L271");
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer7, 6);
                TextKt.Text--4IGK_g("Genre: " + book.getGenre(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer7, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer7, MaterialTheme.$stable).getLabelSmall(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
                composer7 = composer;
                composer7.endReplaceGroup();
                b = -1355056150;
            }
            TextKt.Text--4IGK_g("Added: " + new SimpleDateFormat("MMM dd, yyyy", Locale.getDefault()).format(new Date(book.getTimestamp())), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer7, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer7, MaterialTheme.$stable).getLabelSmall(), composer, 0, 0, 65530);
            Composer composer8 = composer;
            if (!Intrinsics.areEqual(book.getStatus(), "BORROWED") || book.getBorrowedDate() == null) {
                obj = "BORROWED";
                composer8.startReplaceGroup(-1355056150);
            } else {
                composer8.startReplaceGroup(-1309076609);
                ComposerKt.sourceInformation(composer8, "1059@46614L10,1060@46683L11,1057@46496L280");
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long jCurrentTimeMillis = System.currentTimeMillis();
                Long borrowedDate = book.getBorrowedDate();
                Intrinsics.checkNotNull(borrowedDate);
                obj = "BORROWED";
                TextKt.Text--4IGK_g("Borrowed for " + timeUnit.toDays(jCurrentTimeMillis - borrowedDate.longValue()) + " days", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer8, MaterialTheme.$stable).getError-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer8, MaterialTheme.$stable).getLabelSmall(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
                composer8 = composer;
            }
            composer8.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer8);
            ComposerKt.sourceInformationMarkerEnd(composer8);
            composer8.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer8);
            ComposerKt.sourceInformationMarkerEnd(composer8);
            ComposerKt.sourceInformationMarkerEnd(composer8);
            String status = book.getStatus();
            switch (status.hashCode()) {
                case -1494985904:
                    if (!status.equals("PENDING_RECEIPT")) {
                        composer8.startReplaceGroup(-1160377303);
                        ComposerKt.sourceInformation(composer8, "1072@47212L11");
                        j = MaterialTheme.INSTANCE.getColorScheme(composer8, MaterialTheme.$stable).getOutline-0d7_KjU();
                        composer8.endReplaceGroup();
                    } else {
                        composer8.startReplaceGroup(-1160381205);
                        ComposerKt.sourceInformation(composer8, "1070@47090L11");
                        j = MaterialTheme.INSTANCE.getColorScheme(composer8, MaterialTheme.$stable).getSecondary-0d7_KjU();
                        composer8.endReplaceGroup();
                    }
                    break;
                case -1414529708:
                    if (!status.equals(obj)) {
                        composer8.startReplaceGroup(-1160377303);
                        ComposerKt.sourceInformation(composer8, "1072@47212L11");
                        j = MaterialTheme.INSTANCE.getColorScheme(composer8, MaterialTheme.$stable).getOutline-0d7_KjU();
                        composer8.endReplaceGroup();
                    } else {
                        composer8.startReplaceGroup(-1160379097);
                        ComposerKt.sourceInformation(composer8, "1071@47156L11");
                        j = MaterialTheme.INSTANCE.getColorScheme(composer8, MaterialTheme.$stable).getError-0d7_KjU();
                        composer8.endReplaceGroup();
                    }
                    break;
                case -1305282125:
                    if (!status.equals("PENDING_TRANSFER")) {
                        composer8.startReplaceGroup(-1160377303);
                        ComposerKt.sourceInformation(composer8, "1072@47212L11");
                        j = MaterialTheme.INSTANCE.getColorScheme(composer8, MaterialTheme.$stable).getOutline-0d7_KjU();
                        composer8.endReplaceGroup();
                    } else {
                        composer8.startReplaceGroup(-1160381205);
                        ComposerKt.sourceInformation(composer8, "1070@47090L11");
                        j = MaterialTheme.INSTANCE.getColorScheme(composer8, MaterialTheme.$stable).getSecondary-0d7_KjU();
                        composer8.endReplaceGroup();
                    }
                    break;
                case -814438578:
                    if (!status.equals("REQUESTED")) {
                        composer8.startReplaceGroup(-1160377303);
                        ComposerKt.sourceInformation(composer8, "1072@47212L11");
                        j = MaterialTheme.INSTANCE.getColorScheme(composer8, MaterialTheme.$stable).getOutline-0d7_KjU();
                        composer8.endReplaceGroup();
                    } else {
                        composer8.startReplaceGroup(-1160384150);
                        ComposerKt.sourceInformation(composer8, "1069@46998L11");
                        j = MaterialTheme.INSTANCE.getColorScheme(composer8, MaterialTheme.$stable).getTertiary-0d7_KjU();
                        composer8.endReplaceGroup();
                    }
                    break;
                case 2052692649:
                    if (!status.equals("AVAILABLE")) {
                        composer8.startReplaceGroup(-1160377303);
                        ComposerKt.sourceInformation(composer8, "1072@47212L11");
                        j = MaterialTheme.INSTANCE.getColorScheme(composer8, MaterialTheme.$stable).getOutline-0d7_KjU();
                        composer8.endReplaceGroup();
                    } else {
                        composer8.startReplaceGroup(-1160386231);
                        ComposerKt.sourceInformation(composer8, "1068@46933L11");
                        j = MaterialTheme.INSTANCE.getColorScheme(composer8, MaterialTheme.$stable).getPrimary-0d7_KjU();
                        composer8.endReplaceGroup();
                    }
                    break;
                default:
                    composer8.startReplaceGroup(-1160377303);
                    ComposerKt.sourceInformation(composer8, "1072@47212L11");
                    j = MaterialTheme.INSTANCE.getColorScheme(composer8, MaterialTheme.$stable).getOutline-0d7_KjU();
                    composer8.endReplaceGroup();
                    break;
            }
            BadgeKt.Badge-eopBjH0((Modifier) null, j, 0L, ComposableLambdaKt.rememberComposableLambda(-67215505, true, new Function3() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda54
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return ProfileScreenKt.ProfileBookRow$lambda$212$lambda$211$lambda$210(book, (RowScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, composer8, 54), composer8, 3072, 5);
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

    static final Unit ProfileBookRow$lambda$212$lambda$211$lambda$210(Book book, RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$Badge");
        ComposerKt.sourceInformation(composer, "C1078@47542L10,1075@47311L320:ProfileScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-67215505, i, -1, "com.example.ui.screens.ProfileBookRow.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:1075)");
            }
            TextKt.Text--4IGK_g(Intrinsics.areEqual(book.getStatus(), "PENDING_RECEIPT") ? "Transferring" : book.getStatus(), PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(6.0f), Dp.constructor-impl(2.0f)), 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 196656, 0, 65500);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void ChatsSection(final List<Message> list, final List<Book> list2, final String str, final Function1<? super String, Unit> function1, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(list, "messages");
        Intrinsics.checkNotNullParameter(list2, "books");
        Intrinsics.checkNotNullParameter(str, "currentUser");
        Intrinsics.checkNotNullParameter(function1, "onChatClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(975753235);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ChatsSection)P(2)1094@47865L172:ProfileScreen.kt#2thlc2");
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(list2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i2 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(975753235, i2, -1, "com.example.ui.screens.ChatsSection (ProfileScreen.kt:1092)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1395994879, "CC(remember):ProfileScreen.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(list);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : list) {
                    String bookId = ((Message) obj).getBookId();
                    Object obj2 = linkedHashMap.get(bookId);
                    if (obj2 == null) {
                        obj2 = (List) new ArrayList();
                        linkedHashMap.put(bookId, obj2);
                    }
                    ((List) obj2).add(obj);
                }
                objRememberedValue = CollectionsKt.sortedWith(MapsKt.toList(linkedHashMap), new Comparator() { // from class: com.example.ui.screens.ProfileScreenKt$ChatsSection$lambda$217$$inlined$sortedByDescending$1
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        Long lValueOf;
                        Iterator<T> it = ((Iterable) ((Pair) t2).getSecond()).iterator();
                        Long l = null;
                        if (it.hasNext()) {
                            lValueOf = Long.valueOf(((Message) it.next()).getTimestamp());
                            while (it.hasNext()) {
                                Long lValueOf2 = Long.valueOf(((Message) it.next()).getTimestamp());
                                if (lValueOf.compareTo(lValueOf2) < 0) {
                                    lValueOf = lValueOf2;
                                }
                            }
                        } else {
                            lValueOf = null;
                        }
                        Long l2 = lValueOf;
                        Long lValueOf3 = Long.valueOf(l2 != null ? l2.longValue() : 0L);
                        Iterator<T> it2 = ((Iterable) ((Pair) t).getSecond()).iterator();
                        if (it2.hasNext()) {
                            Long lValueOf4 = Long.valueOf(((Message) it2.next()).getTimestamp());
                            loop0: while (true) {
                                l = lValueOf4;
                                do {
                                    if (!it2.hasNext()) {
                                        break loop0;
                                    }
                                    lValueOf4 = Long.valueOf(((Message) it2.next()).getTimestamp());
                                } while (l.compareTo(lValueOf4) >= 0);
                            }
                        }
                        Long l3 = l;
                        return ComparisonsKt.compareValues(lValueOf3, Long.valueOf(l3 != null ? l3.longValue() : 0L));
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final List list3 = (List) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (list3.isEmpty()) {
                composerStartRestartGroup.startReplaceGroup(326394188);
                ComposerKt.sourceInformation(composerStartRestartGroup, "1101@48081L851");
                Modifier modifier = PaddingKt.padding-3ABfNKs(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(32.0f));
                Alignment center = Alignment.Companion.getCenter();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
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
                Updater.set-impl(composer2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl(composer2, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composer2.getInserting() || !Intrinsics.areEqual(composer2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composer2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composer2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.set-impl(composer2, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScope boxScope = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -641863885, "C1107@48254L668:ProfileScreen.kt#2thlc2");
                Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                Modifier modifier2 = Modifier.Companion;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
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
                Updater.set-impl(composer3, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl(composer3, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composer3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composer3.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.set-impl(composer3, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1852972664, "C1112@48530L11,1108@48331L236,1114@48584L41,1117@48745L10,1118@48810L11,1115@48642L266:ProfileScreen.kt#2thlc2");
                IconKt.Icon-ww6aTOc(ChatKt.getChat(Icons.AutoMirrored.Filled.INSTANCE), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(48.0f)), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOutline-0d7_KjU(), composerStartRestartGroup, 432, 0);
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(12.0f)), composerStartRestartGroup, 6);
                TextKt.Text--4IGK_g("No active chat messages.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodyMedium(), composerStartRestartGroup, 196614, 0, 65498);
                composerStartRestartGroup = composerStartRestartGroup;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(327428007);
                ComposerKt.sourceInformation(composerStartRestartGroup, "1128@49136L6082,1124@48954L6264");
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null);
                PaddingValues paddingValues = PaddingKt.PaddingValues-0680j_4(Dp.constructor-impl(16.0f));
                Arrangement.Vertical vertical = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(12.0f));
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1396041461, "CC(remember):ProfileScreen.kt#9igjgp");
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(list3) | composerStartRestartGroup.changedInstance(list2) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda5
                        public final Object invoke(Object obj3) {
                            return ProfileScreenKt.ChatsSection$lambda$226$lambda$225(list3, list2, str, function1, (LazyListScope) obj3);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                LazyDslKt.LazyColumn(modifierFillMaxSize$default, (LazyListState) null, paddingValues, false, vertical, (Alignment.Horizontal) null, (FlingBehavior) null, false, (Function1) objRememberedValue2, composerStartRestartGroup, 24966, 234);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda6
                public final Object invoke(Object obj3, Object obj4) {
                    return ProfileScreenKt.ChatsSection$lambda$227(list, list2, str, function1, i, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    public static final void ReviewItemCard(final Review review, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(review, "review");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1358800132);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ReviewItemCard)1247@55376L11,1247@55334L88,1250@55516L6719,1246@55298L6937:ProfileScreen.kt#2thlc2");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(review) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1358800132, i2, -1, "com.example.ui.screens.ReviewItemCard (ProfileScreen.kt:1245)");
            }
            composer2 = composerStartRestartGroup;
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(14.0f)), CardDefaults.INSTANCE.cardColors-ro_MJ88(Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0L, 0L, composer2, CardDefaults.$stable << 12, 14), (CardElevation) null, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-1636764434, true, new Function3() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda56
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ProfileScreenKt.ReviewItemCard$lambda$239(review, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer2, 54), composer2, 196614, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda57
                public final Object invoke(Object obj, Object obj2) {
                    return ProfileScreenKt.ReviewItemCard$lambda$240(review, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:87:0x04a4  */
    static final Unit ReviewItemCard$lambda$239(Review review, ColumnScope columnScope, Composer composer, int i) {
        String str;
        final String str2;
        long j;
        final long j2;
        int i2;
        final Review review2;
        long jColor;
        Intrinsics.checkNotNullParameter(columnScope, "$this$Card");
        ComposerKt.sourceInformation(composer, "C1251@55526L6703:ProfileScreen.kt#2thlc2");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1636764434, i, -1, "com.example.ui.screens.ReviewItemCard.<anonymous> (ProfileScreen.kt:1251)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f));
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
            ComposerKt.sourceInformationMarkerStart(composer, -549880077, "C1252@55583L3397,1324@59021L40,1325@59074L814:ProfileScreen.kt#2thlc2");
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
            ComposerKt.sourceInformationMarkerStart(composer, -2054228674, "C1257@55801L1721,1312@58598L368,1309@58481L485:ProfileScreen.kt#2thlc2");
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
            ComposerKt.sourceInformationMarkerStart(composer, -995736358, "C1260@55975L11,1258@55875L639,1272@56535L40,1273@56596L908:ProfileScreen.kt#2thlc2");
            SurfaceKt.Surface-T9BRK9s(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(32.0f)), RoundedCornerShapeKt.getCircleShape(), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableSingletons$ProfileScreenKt.INSTANCE.getLambda$1614291527$app(), composer, 12582918, 120);
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
            ColumnScope columnScope3 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1788341036, "C1277@56827L10,1274@56629L245:ProfileScreen.kt#2thlc2");
            String reviewerName = review.getReviewerName();
            if (StringsKt.isBlank(reviewerName)) {
                reviewerName = "Fellow Reader";
            }
            TextKt.Text--4IGK_g(reviewerName, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
            Composer composer6 = composer;
            try {
                str = new SimpleDateFormat("MMM dd, yyyy", Locale.getDefault()).format(new Date(review.getTimestamp()));
            } catch (Exception unused) {
                str = "";
            }
            Intrinsics.checkNotNull(str);
            if (StringsKt.isBlank(str)) {
                composer6.startReplaceGroup(1732137632);
            } else {
                composer6.startReplaceGroup(1788868624);
                ComposerKt.sourceInformation(composer6, "1285@57322L10,1286@57398L11,1283@57208L248");
                TextKt.Text--4IGK_g(str, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer6, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer6, MaterialTheme.$stable).getBodySmall(), composer, 0, 0, 65530);
                composer6 = composer;
            }
            composer6.endReplaceGroup();
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
            String upperCase = review.getReviewType().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            int iHashCode = upperCase.hashCode();
            if (iHashCode != -2053037604) {
                if (iHashCode != -1414529694) {
                    if (iHashCode == 2044649 && upperCase.equals("BOOK")) {
                        str2 = "Book Review";
                    } else {
                        str2 = "Community";
                    }
                } else if (upperCase.equals("BORROWER")) {
                    str2 = "From Borrower";
                } else {
                    str2 = "Community";
                }
            } else if (upperCase.equals("LENDER")) {
                str2 = "From Lender";
            } else {
                str2 = "Community";
            }
            String upperCase2 = review.getReviewType().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            if (Intrinsics.areEqual(upperCase2, "LENDER")) {
                composer6.startReplaceGroup(-2005862214);
                ComposerKt.sourceInformation(composer6, "1300@57946L11");
                j = MaterialTheme.INSTANCE.getColorScheme(composer6, MaterialTheme.$stable).getSecondaryContainer-0d7_KjU();
                composer6.endReplaceGroup();
            } else if (Intrinsics.areEqual(upperCase2, "BORROWER")) {
                composer6.startReplaceGroup(-2005859688);
                ComposerKt.sourceInformation(composer6, "1301@58025L11");
                j = MaterialTheme.INSTANCE.getColorScheme(composer6, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU();
                composer6.endReplaceGroup();
            } else {
                composer6.startReplaceGroup(-2005857412);
                ComposerKt.sourceInformation(composer6, "1302@58096L11");
                j = MaterialTheme.INSTANCE.getColorScheme(composer6, MaterialTheme.$stable).getSurfaceContainerHigh-0d7_KjU();
                composer6.endReplaceGroup();
            }
            String upperCase3 = review.getReviewType().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
            if (Intrinsics.areEqual(upperCase3, "LENDER")) {
                composer6.startReplaceGroup(-2005852036);
                ComposerKt.sourceInformation(composer6, "1305@58264L11");
                j2 = MaterialTheme.INSTANCE.getColorScheme(composer6, MaterialTheme.$stable).getOnSecondaryContainer-0d7_KjU();
                composer6.endReplaceGroup();
            } else if (Intrinsics.areEqual(upperCase3, "BORROWER")) {
                composer6.startReplaceGroup(-2005849446);
                ComposerKt.sourceInformation(composer6, "1306@58345L11");
                j2 = MaterialTheme.INSTANCE.getColorScheme(composer6, MaterialTheme.$stable).getOnPrimaryContainer-0d7_KjU();
                composer6.endReplaceGroup();
            } else {
                composer6.startReplaceGroup(-2005847112);
                ComposerKt.sourceInformation(composer6, "1307@58418L11");
                j2 = MaterialTheme.INSTANCE.getColorScheme(composer6, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU();
                composer6.endReplaceGroup();
            }
            int i3 = 1;
            SurfaceKt.Surface-T9BRK9s((Modifier) null, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(8.0f)), j, 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-35508701, true, new Function2() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda72
                public final Object invoke(Object obj, Object obj2) {
                    return ProfileScreenKt.ReviewItemCard$lambda$239$lambda$238$lambda$232$lambda$231(str2, j2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer6, 54), composer, 12582912, 121);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            Alignment.Vertical centerVertically3 = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier4 = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3, composer, 48);
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
            Updater.set-impl(composer7, measurePolicyRowMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer7, currentCompositionLocalMap5, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash5 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer7.getInserting() || !Intrinsics.areEqual(composer7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                composer7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                composer7.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
            }
            Updater.set-impl(composer7, modifierMaterializeModifier5, ComposeUiNode.Companion.getSetModifier());
            String str3 = "C101@5126L9:Row.kt#2w3rfo";
            byte b = -407840262;
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, str3);
            RowScope rowScope3 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 2124859338, "C1335@59572L39,1338@59719L10,1340@59835L11,1336@59628L246:ProfileScreen.kt#2thlc2");
            int iCoerceIn = RangesKt.coerceIn(review.getRating(), 1, 5);
            composer.startReplaceGroup(-485643907);
            ComposerKt.sourceInformation(composer, "*1328@59243L294");
            while (i3 < 6) {
                ImageVector star = StarKt.getStar(Icons.INSTANCE.getDefault());
                Modifier modifier5 = SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f));
                if (i3 <= iCoerceIn) {
                    composer.startReplaceGroup(-485636336);
                    composer.endReplaceGroup();
                    jColor = ColorKt.Color(4294948864L);
                } else {
                    composer.startReplaceGroup(-485634771);
                    ComposerKt.sourceInformation(composer, "1332@59489L11");
                    jColor = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOutlineVariant-0d7_KjU();
                    composer.endReplaceGroup();
                }
                IconKt.Icon-ww6aTOc(star, (String) null, modifier5, jColor, composer, 432, 0);
                i3++;
                iCoerceIn = iCoerceIn;
                str3 = str3;
                b = -407840262;
            }
            String str4 = str3;
            composer.endReplaceGroup();
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer, 6);
            TextKt.Text--4IGK_g(iCoerceIn + "/5", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelMedium(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
            Composer composer8 = composer;
            ComposerKt.sourceInformationMarkerEnd(composer8);
            ComposerKt.sourceInformationMarkerEnd(composer8);
            composer8.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer8);
            ComposerKt.sourceInformationMarkerEnd(composer8);
            ComposerKt.sourceInformationMarkerEnd(composer8);
            String bookTitle = review.getBookTitle();
            if (bookTitle == null || StringsKt.isBlank(bookTitle)) {
                i2 = -605225122;
                composer8.startReplaceGroup(-605225122);
            } else {
                composer8.startReplaceGroup(-545701960);
                ComposerKt.sourceInformation(composer8, "1346@59996L40,1347@60053L685");
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer8, 6);
                Alignment.Vertical centerVertically4 = Alignment.Companion.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(composer8, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                Modifier modifier6 = Modifier.Companion;
                MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically4, composer8, 48);
                ComposerKt.sourceInformationMarkerStart(composer8, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer8, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composer8.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer8, modifier6);
                Function0 constructor6 = ComposeUiNode.Companion.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer8, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer8.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer8.startReusableNode();
                if (composer8.getInserting()) {
                    composer8.createNode(constructor6);
                } else {
                    composer8.useNode();
                }
                Composer composer9 = Updater.constructor-impl(composer8);
                Updater.set-impl(composer9, measurePolicyRowMeasurePolicy4, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl(composer9, currentCompositionLocalMap6, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash6 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composer9.getInserting() || !Intrinsics.areEqual(composer9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                    composer9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                    composer9.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                }
                Updater.set-impl(composer9, modifierMaterializeModifier6, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer8, -407840262, str4);
                RowScope rowScope4 = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer8, -841502705, "C1352@60330L11,1348@60127L245,1354@60393L39,1357@60554L10,1359@60678L11,1355@60453L267:ProfileScreen.kt#2thlc2");
                IconKt.Icon-ww6aTOc(BookKt.getBook(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(14.0f)), MaterialTheme.INSTANCE.getColorScheme(composer8, MaterialTheme.$stable).getTertiary-0d7_KjU(), composer8, 432, 0);
                SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer8, 6);
                i2 = -605225122;
                TextKt.Text--4IGK_g(review.getBookTitle(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer8, MaterialTheme.$stable).getTertiary-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer8, MaterialTheme.$stable).getBodySmall(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
                composer8 = composer;
                ComposerKt.sourceInformationMarkerEnd(composer8);
                ComposerKt.sourceInformationMarkerEnd(composer8);
                composer8.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer8);
                ComposerKt.sourceInformationMarkerEnd(composer8);
                ComposerKt.sourceInformationMarkerEnd(composer8);
            }
            composer8.endReplaceGroup();
            if (review.getTags().isEmpty()) {
                review2 = review;
                composer8.startReplaceGroup(i2);
            } else {
                composer8.startReplaceGroup(-544862139);
                ComposerKt.sourceInformation(composer8, "1366@60834L40,1369@61022L829,1367@60924L927");
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer8, 6);
                Arrangement.Horizontal horizontal = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(6.0f));
                ComposerKt.sourceInformationMarkerStart(composer8, -987401151, "CC(remember):ProfileScreen.kt#9igjgp");
                review2 = review;
                boolean zChangedInstance = composer8.changedInstance(review2);
                Object objRememberedValue = composer8.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda73
                        public final Object invoke(Object obj) {
                            return ProfileScreenKt.ReviewItemCard$lambda$239$lambda$238$lambda$237$lambda$236(review2, (LazyListScope) obj);
                        }
                    };
                    composer8.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer8);
                LazyDslKt.LazyRow((Modifier) null, (LazyListState) null, (PaddingValues) null, false, horizontal, (Alignment.Vertical) null, (FlingBehavior) null, false, (Function1) objRememberedValue, composer, 24576, 239);
                composer8 = composer;
            }
            composer8.endReplaceGroup();
            if (StringsKt.isBlank(review2.getContent())) {
                composer8.startReplaceGroup(i2);
            } else {
                composer8.startReplaceGroup(-543775806);
                ComposerKt.sourceInformation(composer8, "1389@61953L40,1392@62101L10,1393@62166L11,1390@62010L195");
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer8, 6);
                TextKt.Text--4IGK_g(review2.getContent(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer8, MaterialTheme.$stable).getOnSurface-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer8, MaterialTheme.$stable).getBodyMedium(), composer, 0, 0, 65530);
                composer8 = composer;
            }
            composer8.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer8);
            ComposerKt.sourceInformationMarkerEnd(composer8);
            composer8.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer8);
            ComposerKt.sourceInformationMarkerEnd(composer8);
            ComposerKt.sourceInformationMarkerEnd(composer8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ReviewItemCard$lambda$239$lambda$238$lambda$232$lambda$231(String str, long j, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1315@58715L10,1313@58620L328:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-35508701, i, -1, "com.example.ui.screens.ReviewItemCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:1313)");
            }
            TextStyle labelSmall = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall();
            TextKt.Text--4IGK_g(str, PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(8.0f), Dp.constructor-impl(4.0f)), j, 0L, (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, labelSmall, composer, 196656, 0, 65496);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ReviewItemCard$lambda$239$lambda$238$lambda$237$lambda$236(Review review, LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyRow");
        final List<String> tags = review.getTags();
        final ProfileScreenKt$ReviewItemCard$lambda$239$lambda$238$lambda$237$lambda$236$$inlined$items$default$1 profileScreenKt$ReviewItemCard$lambda$239$lambda$238$lambda$237$lambda$236$$inlined$items$default$1 = new Function1() { // from class: com.example.ui.screens.ProfileScreenKt$ReviewItemCard$lambda$239$lambda$238$lambda$237$lambda$236$$inlined$items$default$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final Void m401invoke(String str) {
                return null;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m401invoke((String) obj);
            }
        };
        lazyListScope.items(tags.size(), (Function1) null, new Function1<Integer, Object>() { // from class: com.example.ui.screens.ProfileScreenKt$ReviewItemCard$lambda$239$lambda$238$lambda$237$lambda$236$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i) {
                return profileScreenKt$ReviewItemCard$lambda$239$lambda$238$lambda$237$lambda$236$$inlined$items$default$1.invoke(tags.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.screens.ProfileScreenKt$ReviewItemCard$lambda$239$lambda$238$lambda$237$lambda$236$$inlined$items$default$4
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
                final String str = (String) tags.get(i);
                composer.startReplaceGroup(-1471283961);
                ComposerKt.sourceInformation(composer, "C*1373@61217L11,1374@61360L11,1375@61414L397,1371@61096L715:ProfileScreen.kt#2thlc2");
                SurfaceKt.Surface-T9BRK9s((Modifier) null, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(6.0f)), ColorSchemeKt.surfaceColorAtElevation-3ABfNKs(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable), Dp.constructor-impl(3.0f)), 0L, 0.0f, 0.0f, BorderStrokeKt.BorderStroke-cXLIe8U(Dp.constructor-impl(0.5f), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOutlineVariant-0d7_KjU()), ComposableLambdaKt.rememberComposableLambda(-1022475988, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.ui.screens.ProfileScreenKt$ReviewItemCard$1$1$4$1$1$1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i4) {
                        ComposerKt.sourceInformation(composer2, "C1378@61553L10,1379@61630L11,1376@61444L341:ProfileScreen.kt#2thlc2");
                        if ((i4 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1022475988, i4, -1, "com.example.ui.screens.ReviewItemCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:1376)");
                        }
                        TextKt.Text--4IGK_g("• " + str, PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(6.0f), Dp.constructor-impl(2.0f)), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getLabelSmall(), composer2, 48, 0, 65528);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 12582912, 57);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    public static final void ReviewsSection(final String str, final BookViewModel bookViewModel, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(str, "currentUser");
        Intrinsics.checkNotNullParameter(bookViewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-965314027);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ReviewsSection)1402@62341L59,1403@62432L37:ProfileScreen.kt#2thlc2");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(bookViewModel) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-965314027, i2, -1, "com.example.ui.screens.ReviewsSection (ProfileScreen.kt:1401)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 46159312, "CC(remember):ProfileScreen.kt#9igjgp");
            boolean z = (i2 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = bookViewModel.getReviews(str);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final State stateCollectAsState = SnapshotStateKt.collectAsState((Flow) objRememberedValue, CollectionsKt.emptyList(), (CoroutineContext) null, composerStartRestartGroup, 48, 2);
            if (ReviewsSection$lambda$242(stateCollectAsState).isEmpty()) {
                composerStartRestartGroup.startReplaceGroup(1431103997);
                ComposerKt.sourceInformation(composerStartRestartGroup, "1406@62512L224");
                Modifier modifier = PaddingKt.padding-3ABfNKs(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(32.0f));
                Alignment center = Alignment.Companion.getCenter();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
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
                Updater.set-impl(composer2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl(composer2, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composer2.getInserting() || !Intrinsics.areEqual(composer2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composer2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composer2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.set-impl(composer2, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScope boxScope = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 40959394, "C1410@62697L11,1410@62651L75:ProfileScreen.kt#2thlc2");
                TextKt.Text--4IGK_g("No reviews yet.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composerStartRestartGroup, 6, 0, 131066);
                composerStartRestartGroup = composerStartRestartGroup;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1431350137);
                ComposerKt.sourceInformation(composerStartRestartGroup, "1416@62926L124,1413@62791L259");
                PaddingValues paddingValues = PaddingKt.PaddingValues-0680j_4(Dp.constructor-impl(16.0f));
                Arrangement.Vertical vertical = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(10.0f));
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 46178097, "CC(remember):ProfileScreen.kt#9igjgp");
                boolean zChanged = composerStartRestartGroup.changed(stateCollectAsState);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda47
                        public final Object invoke(Object obj) {
                            return ProfileScreenKt.ReviewsSection$lambda$246$lambda$245(stateCollectAsState, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                LazyDslKt.LazyColumn((Modifier) null, (LazyListState) null, paddingValues, false, vertical, (Alignment.Horizontal) null, (FlingBehavior) null, false, (Function1) objRememberedValue2, composerStartRestartGroup, 24960, 235);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda48
                public final Object invoke(Object obj, Object obj2) {
                    return ProfileScreenKt.ReviewsSection$lambda$247(str, bookViewModel, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final Unit ReviewsSection$lambda$246$lambda$245(final State state, LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyColumn");
        LazyListScope.items$default(lazyListScope, ReviewsSection$lambda$242(state).size(), (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(-766167658, true, new Function4() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda35
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return ProfileScreenKt.ReviewsSection$lambda$246$lambda$245$lambda$244(state, (LazyItemScope) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 6, (Object) null);
        return Unit.INSTANCE;
    }

    static final Unit ReviewsSection$lambda$246$lambda$245$lambda$244(State state, LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(lazyItemScope, "$this$items");
        ComposerKt.sourceInformation(composer, "C1418@62987L39:ProfileScreen.kt#2thlc2");
        if ((i2 & 48) == 0) {
            i2 |= composer.changed(i) ? 32 : 16;
        }
        if ((i2 & 145) == 144 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-766167658, i2, -1, "com.example.ui.screens.ReviewsSection.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:1418)");
            }
            ReviewItemCard(ReviewsSection$lambda$242(state).get(i), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    private static final void WishlistSection(List<WishlistRequest> list, final Function0<Unit> function0, Function1<? super WishlistRequest, Unit> function1, Composer composer, final int i) {
        int i2;
        final List<WishlistRequest> list2 = list;
        final Function1<? super WishlistRequest, Unit> function2 = function1;
        Composer composerStartRestartGroup = composer.startRestartGroup(-823473486);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(WishlistSection)1430@63245L6388:ProfileScreen.kt#2thlc2");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i2 & BuildConfig.VERSION_CODE) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-823473486, i2, -1, "com.example.ui.screens.WishlistSection (ProfileScreen.kt:1429)");
            }
            Modifier modifier = PaddingKt.padding-VpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(16.0f), 0.0f, 2, (Object) null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            int i3 = i2;
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2025190807, "C1431@63325L1030:ProfileScreen.kt#2thlc2");
            Modifier modifier2 = PaddingKt.padding-VpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), 0.0f, Dp.constructor-impl(8.0f), 1, (Object) null);
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composerStartRestartGroup, 54);
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1859360850, "C1436@63548L337,1440@63898L447:ProfileScreen.kt#2thlc2");
            Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.Companion, 1.0f, false, 2, (Object) null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default);
            Function0 constructor3 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composer4 = Updater.constructor-impl(composerStartRestartGroup);
            Updater.set-impl(composer4, measurePolicyColumnMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer4, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer4.getInserting() || !Intrinsics.areEqual(composer4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composer4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composer4.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.set-impl(composer4, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScope columnScope2 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 734851543, "C1437@63658L10,1437@63605L106,1438@63798L10,1438@63842L11,1438@63728L143:ProfileScreen.kt#2thlc2");
            TextKt.Text--4IGK_g("Books You Want to Read", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getTitleMedium(), composerStartRestartGroup, 196614, 0, 65502);
            TextKt.Text--4IGK_g("You'll get an alert when listed nearby.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodySmall(), composerStartRestartGroup, 6, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup = composerStartRestartGroup;
            ButtonKt.Button(function0, (Modifier) null, false, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, PaddingKt.PaddingValues-YgX7TsA(Dp.constructor-impl(12.0f), Dp.constructor-impl(6.0f)), (MutableInteractionSource) null, ComposableSingletons$ProfileScreenKt.INSTANCE.getLambda$286751272$app(), composerStartRestartGroup, ((i3 >> 3) & 14) | 817889280, 374);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (list.isEmpty()) {
                composerStartRestartGroup.startReplaceGroup(-2024290971);
                ComposerKt.sourceInformation(composerStartRestartGroup, "1452@64400L1353");
                Modifier modifier3 = PaddingKt.padding-qDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null), 0.0f, Dp.constructor-impl(40.0f), 0.0f, 0.0f, 13, (Object) null);
                Alignment center = Alignment.Companion.getCenter();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                Function0 constructor4 = ComposeUiNode.Companion.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composer5 = Updater.constructor-impl(composerStartRestartGroup);
                Updater.set-impl(composer5, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl(composer5, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composer5.getInserting() || !Intrinsics.areEqual(composer5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composer5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composer5.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.set-impl(composer5, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScope boxScope = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2062534990, "C1456@64561L1178:ProfileScreen.kt#2thlc2");
                Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                Modifier modifier4 = Modifier.Companion;
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier4);
                Function0 constructor5 = ComposeUiNode.Companion.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor5);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composer6 = Updater.constructor-impl(composerStartRestartGroup);
                Updater.set-impl(composer6, measurePolicyColumnMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl(composer6, currentCompositionLocalMap5, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash5 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composer6.getInserting() || !Intrinsics.areEqual(composer6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    composer6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    composer6.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                Updater.set-impl(composer6, modifierMaterializeModifier5, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScope columnScope3 = ColumnScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1959539641, "C1461@64852L11,1457@64642L270,1463@64933L41,1466@65098L10,1464@64995L205,1469@65221L40,1472@65445L10,1473@65513L11,1470@65282L439:ProfileScreen.kt#2thlc2");
                IconKt.Icon-ww6aTOc(BookmarkAddKt.getBookmarkAdd(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(56.0f)), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOutline-0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null), composerStartRestartGroup, 432, 0);
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(12.0f)), composerStartRestartGroup, 6);
                TextKt.Text--4IGK_g("Your wishlist is empty.", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getTitleMedium(), composerStartRestartGroup, 196614, 0, 65502);
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composerStartRestartGroup, 6);
                TextKt.Text--4IGK_g("Tap 'Add Book' above to get notified whenever your favorite books are added nearby!", PaddingKt.padding-VpY3zN4$default(Modifier.Companion, Dp.constructor-impl(24.0f), 0.0f, 2, (Object) null), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.box-impl(TextAlign.Companion.getCenter-e0LSkKk()), 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodySmall(), composerStartRestartGroup, 54, 0, 65016);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceGroup();
                list2 = list;
                function2 = function1;
            } else {
                composerStartRestartGroup.startReplaceGroup(-2022842124);
                ComposerKt.sourceInformation(composerStartRestartGroup, "1484@66023L3594,1480@65816L3801");
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null);
                Arrangement.Vertical vertical = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(8.0f));
                PaddingValues paddingValues = PaddingKt.PaddingValues-YgX7TsA$default(0.0f, Dp.constructor-impl(8.0f), 1, (Object) null);
                Arrangement.Vertical vertical2 = vertical;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1874417542, "CC(remember):ProfileScreen.kt#9igjgp");
                list2 = list;
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(list2) | ((i3 & 896) == 256);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                    function2 = function1;
                    objRememberedValue = new Function1() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda58
                        public final Object invoke(Object obj) {
                            return ProfileScreenKt.WishlistSection$lambda$261$lambda$260$lambda$259(list2, function2, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    function2 = function1;
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                LazyDslKt.LazyColumn(modifierFillMaxSize$default, (LazyListState) null, paddingValues, false, vertical2, (Alignment.Horizontal) null, (FlingBehavior) null, false, (Function1) objRememberedValue, composerStartRestartGroup, 24966, 234);
                composerStartRestartGroup.endReplaceGroup();
            }
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda59
                public final Object invoke(Object obj, Object obj2) {
                    return ProfileScreenKt.WishlistSection$lambda$262(list2, function0, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final Unit WishlistSection$lambda$261$lambda$260$lambda$259(final List list, final Function1 function1, LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyColumn");
        LazyListScope.items$default(lazyListScope, list.size(), (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(2134888859, true, new Function4() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda63
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return ProfileScreenKt.WishlistSection$lambda$261$lambda$260$lambda$259$lambda$258(list, function1, (LazyItemScope) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 6, (Object) null);
        return Unit.INSTANCE;
    }

    static final Unit WishlistSection$lambda$261$lambda$260$lambda$259$lambda$258(List list, final Function1 function1, LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(lazyItemScope, "$this$items");
        ComposerKt.sourceInformation(composer, "C1490@66308L11,1492@66398L3187,1487@66134L3451:ProfileScreen.kt#2thlc2");
        if ((i2 & 48) == 0) {
            i3 = i2 | (composer.changed(i) ? 32 : 16);
        } else {
            i3 = i2;
        }
        if ((i3 & 145) == 144 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2134888859, i3, -1, "com.example.ui.screens.WishlistSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:1486)");
            }
            final WishlistRequest wishlistRequest = (WishlistRequest) list.get(i);
            SurfaceKt.Surface-T9BRK9s(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(16.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0.0f, Dp.constructor-impl(1.0f), (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-821602784, true, new Function2() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda34
                public final Object invoke(Object obj, Object obj2) {
                    return ProfileScreenKt.WishlistSection$lambda$261$lambda$260$lambda$259$lambda$258$lambda$257(function1, wishlistRequest, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 12779526, 88);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit WishlistSection$lambda$261$lambda$260$lambda$259$lambda$258$lambda$257(final Function1 function1, final WishlistRequest wishlistRequest, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1493@66424L3139:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-821602784, i, -1, "com.example.ui.screens.WishlistSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:1493)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(14.0f));
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
            ComposerKt.sourceInformationMarkerStart(composer, -1338532677, "C1498@66717L2438,1540@69205L18,1540@69184L353:ProfileScreen.kt#2thlc2");
            Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.Companion, 1.0f, false, 2, (Object) null);
            Alignment.Vertical centerVertically2 = Alignment.Companion.getCenterVertically();
            Arrangement.Horizontal horizontal = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(12.0f));
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontal, centerVertically2, composer, 54);
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
            ComposerKt.sourceInformationMarkerStart(composer, 1416569468, "C1505@67138L11,1503@67014L797,1517@67844L1281:ProfileScreen.kt#2thlc2");
            SurfaceKt.Surface-T9BRK9s(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(40.0f)), RoundedCornerShapeKt.getCircleShape(), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableSingletons$ProfileScreenKt.INSTANCE.getLambda$118443651$app(), composer, 12582918, 120);
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
            ComposerKt.sourceInformationMarkerStart(composer, 555656115, "C1520@68020L10,1518@67889L314,1534@68891L10,1532@68747L344:ProfileScreen.kt#2thlc2");
            TextKt.Text--4IGK_g(wishlistRequest.getBookTitle(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleSmall(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 3072, 57310);
            Composer composer5 = composer;
            if (StringsKt.isBlank(wishlistRequest.getAuthor())) {
                composer5.startReplaceGroup(488271972);
            } else {
                composer5.startReplaceGroup(556010444);
                ComposerKt.sourceInformation(composer5, "1527@68456L10,1528@68544L11,1525@68312L360");
                TextKt.Text--4IGK_g("by " + wishlistRequest.getAuthor(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer5, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer5, MaterialTheme.$stable).getBodySmall(), composer, 0, 3072, 57338);
                composer5 = composer;
            }
            composer5.endReplaceGroup();
            TextKt.Text--4IGK_g("📡 Proximity alert active", (Modifier) null, ColorKt.Color(4279994175L), 0L, (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer5, MaterialTheme.$stable).getLabelSmall(), composer, 196998, 0, 65498);
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
            ComposerKt.sourceInformationMarkerStart(composer, 1619466326, "CC(remember):ProfileScreen.kt#9igjgp");
            boolean zChanged = composer.changed(function1) | composer.changed(wishlistRequest);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda79
                    public final Object invoke() {
                        return ProfileScreenKt.WishlistSection$lambda$261$lambda$260$lambda$259$lambda$258$lambda$257$lambda$256$lambda$255$lambda$254(function1, wishlistRequest);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            IconButtonKt.IconButton((Function0) objRememberedValue, (Modifier) null, false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableSingletons$ProfileScreenKt.INSTANCE.getLambda$806449441$app(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
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

    static final Unit WishlistSection$lambda$261$lambda$260$lambda$259$lambda$258$lambda$257$lambda$256$lambda$255$lambda$254(Function1 function1, WishlistRequest wishlistRequest) {
        function1.invoke(wishlistRequest);
        return Unit.INSTANCE;
    }

    public static final void EcoImpactSection(final User user, final List<Book> list, final String str, final Function0<Unit> function0, Composer composer, final int i) {
        String str2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(list, "books");
        Intrinsics.checkNotNullParameter(str, "currentUser");
        Intrinsics.checkNotNullParameter(function0, "onOpenLeaderboard");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1688351333);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(EcoImpactSection)P(3)1563@69797L231,1582@70538L7,1584@70551L7249:ProfileScreen.kt#2thlc2");
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changed(user) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i2 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1688351333, i2, -1, "com.example.ui.screens.EcoImpactSection (ProfileScreen.kt:1562)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 992012194, "CC(remember):ProfileScreen.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(list) | ((i2 & 896) == 256) | ((i2 & 14) == 4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (DashboardScreenKt.isBookOwner((Book) obj, str)) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                int rentCount = 0;
                while (it.hasNext()) {
                    rentCount += ((Book) it.next()).getRentCount();
                }
                objRememberedValue = Integer.valueOf(Math.max(user.getCompletedSwaps(), Math.max(rentCount, 1)));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            int iIntValue = ((Number) objRememberedValue).intValue();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            double d = iIntValue;
            final String str3 = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(0.05d * d)}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
            final int i3 = iIntValue * 105;
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            final String str4 = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d * 2.7d)}, 1));
            Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
            final int i4 = iIntValue * 350;
            if (iIntValue >= 20) {
                str2 = "🌳 Forest Guardian";
            } else if (iIntValue >= 10) {
                str2 = "🌿 Eco Scholar";
            } else if (iIntValue >= 5) {
                str2 = "🌱 Seedling Reader";
            } else {
                str2 = "🌱 Green Starter";
            }
            CompositionLocal localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final Context context = (Context) objConsume;
            Modifier modifier = PaddingKt.padding-VpY3zN4(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(16.0f), Dp.constructor-impl(8.0f));
            Arrangement.Vertical vertical = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(14.0f));
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(vertical, Alignment.Companion.getStart(), composerStartRestartGroup, 6);
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
            Composer composer3 = Updater.constructor-impl(composerStartRestartGroup);
            Updater.set-impl(composer3, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer3, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composer3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composer3.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.set-impl(composer3, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1821839583, "C1593@70856L66,1596@71090L6704,1591@70769L7025:ProfileScreen.kt#2thlc2");
            final String str5 = str2;
            composer2 = composerStartRestartGroup;
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(20.0f)), CardDefaults.INSTANCE.cardColors-ro_MJ88(Color.copy-wmQWz5c$default(ColorKt.Color(4279193906L), 0.15f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0L, 0L, composerStartRestartGroup, (CardDefaults.$stable << 12) | 6, 14), (CardElevation) null, BorderStrokeKt.BorderStroke-cXLIe8U(Dp.constructor-impl(1.5f), Color.copy-wmQWz5c$default(ColorKt.Color(4279286145L), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), ComposableLambdaKt.rememberComposableLambda(1976211843, true, new Function3() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda69
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return ProfileScreenKt.EcoImpactSection$lambda$285$lambda$284(str5, str3, str4, i3, i4, context, function0, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, composerStartRestartGroup, 54), composer2, 221190, 8);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda70
                public final Object invoke(Object obj2, Object obj3) {
                    return ProfileScreenKt.EcoImpactSection$lambda$286(user, list, str, function0, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    static final Unit EcoImpactSection$lambda$285$lambda$284(final String str, final String str2, final String str3, final int i, final int i2, final Context context, Function0 function0, ColumnScope columnScope, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(columnScope, "$this$Card");
        ComposerKt.sourceInformation(composer, "C1597@71104L6680:ProfileScreen.kt#2thlc2");
        if ((i3 & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1976211843, i3, -1, "com.example.ui.screens.EcoImpactSection.<anonymous>.<anonymous> (ProfileScreen.kt:1597)");
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
            ComposerKt.sourceInformationMarkerStart(composer, 572317053, "C1598@71165L1397,1629@72580L41,1632@72671L1644,1659@74333L41,1661@74392L1654,1688@76064L41,1690@76123L1647:ProfileScreen.kt#2thlc2");
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
            ComposerKt.sourceInformationMarkerStart(composer, -225156275, "C1599@71239L28,1600@71288L40,1601@71349L610,1614@71980L38,1618@72179L365,1615@72039L505:ProfileScreen.kt#2thlc2");
            TextKt.Text--4IGK_g("🌱", (Modifier) null, 0L, TextUnitKt.getSp(28), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 3078, 0, 131062);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f)), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier3 = Modifier.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
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
            ComposerKt.sourceInformationMarkerStart(composer, -203793979, "C1604@71499L10,1602@71382L278,1610@71811L10,1611@71883L11,1608@71685L252:ProfileScreen.kt#2thlc2");
            TextStyle titleMedium = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleMedium();
            TextKt.Text--4IGK_g("Certified Green Reader", (Modifier) null, ColorKt.Color(4278556265L), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, titleMedium, composer, 196998, 0, 65498);
            TextKt.Text--4IGK_g("Your Sustainable Reading Impact", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            SpacerKt.Spacer(RowScope.weight$default(rowScope, Modifier.Companion, 1.0f, false, 2, (Object) null), composer, 0);
            SurfaceKt.Surface-T9BRK9s((Modifier) null, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), ColorKt.Color(4279286145L), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(1854893176, true, new Function2() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda82
                public final Object invoke(Object obj, Object obj2) {
                    return ProfileScreenKt.EcoImpactSection$lambda$285$lambda$284$lambda$283$lambda$268$lambda$267(str, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 12583296, 121);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), composer, 6);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            Arrangement.Horizontal horizontal = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(10.0f));
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontal, Alignment.Companion.getTop(), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
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
            Updater.set-impl(composer5, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer5.getInserting() || !Intrinsics.areEqual(composer5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composer5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composer5.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.set-impl(composer5, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope2 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1202830952, "C1636@72956L11,1637@72998L530,1633@72786L742,1648@73719L11,1649@73761L536,1645@73549L748:ProfileScreen.kt#2thlc2");
            SurfaceKt.Surface-T9BRK9s(RowScope.weight$default(rowScope2, Modifier.Companion, 1.0f, false, 2, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(14.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-1567258577, true, new Function2() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda83
                public final Object invoke(Object obj, Object obj2) {
                    return ProfileScreenKt.EcoImpactSection$lambda$285$lambda$284$lambda$283$lambda$273$lambda$270(str2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 12582912, 120);
            SurfaceKt.Surface-T9BRK9s(RowScope.weight$default(rowScope2, Modifier.Companion, 1.0f, false, 2, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(14.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-156388634, true, new Function2() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda84
                public final Object invoke(Object obj, Object obj2) {
                    return ProfileScreenKt.EcoImpactSection$lambda$285$lambda$284$lambda$283$lambda$273$lambda$272(str3, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 12582912, 120);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f)), composer, 6);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            Arrangement.Horizontal horizontal2 = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(10.0f));
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(horizontal2, Alignment.Companion.getTop(), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default2);
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
            Updater.set-impl(composer6, measurePolicyRowMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer6, currentCompositionLocalMap5, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash5 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer6.getInserting() || !Intrinsics.areEqual(composer6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                composer6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                composer6.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
            }
            Updater.set-impl(composer6, modifierMaterializeModifier5, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope3 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1746381827, "C1665@74677L11,1666@74719L537,1662@74507L749,1677@75447L11,1678@75489L539,1674@75277L751:ProfileScreen.kt#2thlc2");
            SurfaceKt.Surface-T9BRK9s(RowScope.weight$default(rowScope3, Modifier.Companion, 1.0f, false, 2, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(14.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-1961662416, true, new Function2() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda85
                public final Object invoke(Object obj, Object obj2) {
                    return ProfileScreenKt.EcoImpactSection$lambda$285$lambda$284$lambda$283$lambda$278$lambda$275(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 12582912, 120);
            SurfaceKt.Surface-T9BRK9s(RowScope.weight$default(rowScope3, Modifier.Companion, 1.0f, false, 2, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(14.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-550792473, true, new Function2() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda86
                public final Object invoke(Object obj, Object obj2) {
                    return ProfileScreenKt.EcoImpactSection$lambda$285$lambda$284$lambda$283$lambda$278$lambda$277(i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 12582912, 120);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16.0f)), composer, 6);
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            Arrangement.Horizontal horizontal3 = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(8.0f));
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(horizontal3, Alignment.Companion.getTop(), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default3);
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
            Composer composer7 = Updater.constructor-impl(composer);
            Updater.set-impl(composer7, measurePolicyRowMeasurePolicy4, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer7, currentCompositionLocalMap6, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash6 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer7.getInserting() || !Intrinsics.areEqual(composer7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                composer7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                composer7.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
            }
            Updater.set-impl(composer7, modifierMaterializeModifier6, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScope rowScope4 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -400629604, "C1695@76337L640,1705@77142L48,1694@76295L1160,1712@77477L275:ProfileScreen.kt#2thlc2");
            ComposerKt.sourceInformationMarkerStart(composer, -1398396330, "CC(remember):ProfileScreen.kt#9igjgp");
            boolean zChanged = composer.changed(str) | composer.changed(str2) | composer.changed(str3) | composer.changedInstance(context);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda87
                    public final Object invoke() {
                        return ProfileScreenKt.EcoImpactSection$lambda$285$lambda$284$lambda$283$lambda$282$lambda$281$lambda$280(str, str2, str3, context);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ButtonKt.Button((Function0) objRememberedValue, RowScope.weight$default(rowScope4, Modifier.Companion, 1.0f, false, 2, (Object) null), false, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(ColorKt.Color(4279286145L), 0L, 0L, 0L, composer, (ButtonDefaults.$stable << 12) | 6, 14), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$ProfileScreenKt.INSTANCE.m332getLambda$1676766906$app(), composer, 805306368, 484);
            ButtonKt.OutlinedButton(function0, RowScope.weight$default(rowScope4, Modifier.Companion, 1.0f, false, 2, (Object) null), false, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$ProfileScreenKt.INSTANCE.getLambda$1897988936$app(), composer, 805306368, 500);
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

    static final Unit EcoImpactSection$lambda$285$lambda$284$lambda$283$lambda$268$lambda$267(String str, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1619@72205L317:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1854893176, i, -1, "com.example.ui.screens.EcoImpactSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:1619)");
            }
            long j = Color.Companion.getWhite-0d7_KjU();
            FontWeight bold = FontWeight.Companion.getBold();
            TextKt.Text--4IGK_g(str, PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(8.0f), Dp.constructor-impl(4.0f)), j, TextUnitKt.getSp(11), (FontStyle) null, bold, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 200112, 0, 131024);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit EcoImpactSection$lambda$285$lambda$284$lambda$283$lambda$273$lambda$270(String str, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1638@73024L482:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1567258577, i, -1, "com.example.ui.screens.EcoImpactSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:1638)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(12.0f));
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
            ComposerKt.sourceInformationMarkerStart(composer, 460961215, "C1639@73149L28,1640@73206L40,1641@73309L10,1641@73275L87,1642@73451L11,1642@73391L89:ProfileScreen.kt#2thlc2");
            TextKt.Text--4IGK_g("🌳", (Modifier) null, 0L, TextUnitKt.getSp(22), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 3078, 0, 131062);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleMedium(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
            TextKt.Text--4IGK_g("Trees Saved", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 3078, 0, 131058);
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

    static final Unit EcoImpactSection$lambda$285$lambda$284$lambda$283$lambda$273$lambda$272(String str, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1650@73787L488:ProfileScreen.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-156388634, i, -1, "com.example.ui.screens.EcoImpactSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:1650)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(12.0f));
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
            ComposerKt.sourceInformationMarkerStart(composer, 1263228642, "C1651@73912L28,1652@73969L40,1653@74079L10,1653@74038L94,1654@74220L11,1654@74161L88:ProfileScreen.kt#2thlc2");
            TextKt.Text--4IGK_g("☁️", (Modifier) null, 0L, TextUnitKt.getSp(22), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 3078, 0, 131062);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g(str + "kg", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleMedium(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
            TextKt.Text--4IGK_g("CO₂ Offset", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 3078, 0, 131058);
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

    static final Unit EcoImpactSection$lambda$285$lambda$284$lambda$283$lambda$278$lambda$275(int i, Composer composer, int i2) {
        ComposerKt.sourceInformation(composer, "C1667@74745L489:ProfileScreen.kt#2thlc2");
        if ((i2 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1961662416, i2, -1, "com.example.ui.screens.EcoImpactSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:1667)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(12.0f));
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
            ComposerKt.sourceInformationMarkerStart(composer, 1806715639, "C1668@74870L28,1669@74927L40,1670@75037L10,1670@74996L94,1671@75179L11,1671@75119L89:ProfileScreen.kt#2thlc2");
            TextKt.Text--4IGK_g("💧", (Modifier) null, 0L, TextUnitKt.getSp(22), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 3078, 0, 131062);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g(i + "L", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleMedium(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
            TextKt.Text--4IGK_g("Water Saved", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 3078, 0, 131058);
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

    static final Unit EcoImpactSection$lambda$285$lambda$284$lambda$283$lambda$278$lambda$277(int i, Composer composer, int i2) {
        ComposerKt.sourceInformation(composer, "C1679@75515L491:ProfileScreen.kt#2thlc2");
        if ((i2 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-550792473, i2, -1, "com.example.ui.screens.EcoImpactSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:1679)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(12.0f));
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
            ComposerKt.sourceInformationMarkerStart(composer, -1685984354, "C1680@75640L28,1681@75697L40,1682@75809L10,1682@75766L96,1683@75951L11,1683@75891L89:ProfileScreen.kt#2thlc2");
            TextKt.Text--4IGK_g("💰", (Modifier) null, 0L, TextUnitKt.getSp(22), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 3078, 0, 131062);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer, 6);
            TextKt.Text--4IGK_g("₹" + i, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleMedium(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
            TextKt.Text--4IGK_g("Money Saved", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 3078, 0, 131058);
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

    static final Unit EcoImpactSection$lambda$285$lambda$284$lambda$283$lambda$282$lambda$281$lambda$280(String str, String str2, String str3, Context context) {
        String str4 = "🌱 I'm a " + str + " on BookXchange! By borrowing and sharing books, I've saved " + str2 + " trees and offset " + str3 + "kg of CO2! Join the green reading revolution on BookXchange:\nDownload on Google Play: https://play.google.com/store/apps/details?id=com.BookXchange.app";
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str4);
        context.startActivity(Intent.createChooser(intent, "Share Eco Impact"));
        return Unit.INSTANCE;
    }

    private static final User ProfileScreen$lambda$4(State<User> state) {
        return (User) state.getValue();
    }

    private static final String ProfileScreen$lambda$5(State<String> state) {
        return (String) state.getValue();
    }

    private static final String ProfileScreen$lambda$6(State<String> state) {
        return (String) state.getValue();
    }

    private static final List<Message> ProfileScreen$lambda$8(State<? extends List<Message>> state) {
        return (List) state.getValue();
    }

    private static final List<WishlistRequest> ProfileScreen$lambda$22(State<? extends List<WishlistRequest>> state) {
        return (List) state.getValue();
    }

    private static final List<Review> ProfileScreen$lambda$24(State<? extends List<Review>> state) {
        return (List) state.getValue();
    }

    static final Unit ProfileScreen$lambda$144$lambda$143$lambda$142$lambda$141(MutableState mutableState, String str) throws IOException {
        Intrinsics.checkNotNullParameter(str, "it");
        String str2 = str;
        StringBuilder sb = new StringBuilder();
        int length = str2.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str2.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        mutableState.setValue(sb.toString());
        return Unit.INSTANCE;
    }

    static final Unit ChatsSection$lambda$226$lambda$225(final List list, final List list2, final String str, final Function1 function1, LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyColumn");
        final ProfileScreenKt$ChatsSection$lambda$226$lambda$225$$inlined$items$default$1 profileScreenKt$ChatsSection$lambda$226$lambda$225$$inlined$items$default$1 = new Function1() { // from class: com.example.ui.screens.ProfileScreenKt$ChatsSection$lambda$226$lambda$225$$inlined$items$default$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final Void m391invoke(Pair<? extends String, ? extends List<? extends Message>> pair) {
                return null;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m391invoke((Pair<? extends String, ? extends List<? extends Message>>) obj);
            }
        };
        lazyListScope.items(list.size(), (Function1) null, new Function1<Integer, Object>() { // from class: com.example.ui.screens.ProfileScreenKt$ChatsSection$lambda$226$lambda$225$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i) {
                return profileScreenKt$ChatsSection$lambda$226$lambda$225$$inlined$items$default$1.invoke(list.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.screens.ProfileScreenKt$ChatsSection$lambda$226$lambda$225$$inlined$items$default$4
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
                Object next;
                String receiver;
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
                Pair pair = (Pair) list.get(i);
                composer.startReplaceGroup(-1075459568);
                ComposerKt.sourceInformation(composer, "C*1134@49445L238,1143@49899L23,1145@50063L11,1145@50021L62,1146@50175L11,1147@50221L4973,1140@49778L5416:ProfileScreen.kt#2thlc2");
                final String str2 = (String) pair.component1();
                List list3 = (List) pair.component2();
                Iterator it = list2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(((Book) next).getId(), str2));
                final Book book = (Book) next;
                final Message message = (Message) CollectionsKt.firstOrNull(CollectionsKt.sortedWith(list3, new Comparator() { // from class: com.example.ui.screens.ProfileScreenKt$ChatsSection$lambda$226$lambda$225$lambda$224$$inlined$sortedByDescending$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(Long.valueOf(((Message) t2).getTimestamp()), Long.valueOf(((Message) t).getTimestamp()));
                    }
                }));
                ComposerKt.sourceInformationMarkerStart(composer, -865974587, "CC(remember):ProfileScreen.kt#9igjgp");
                boolean zChanged = composer.changed(list3) | composer.changed(str);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    Message message2 = (Message) CollectionsKt.firstOrNull(list3);
                    if (message2 == null) {
                        receiver = "User";
                    } else {
                        receiver = Intrinsics.areEqual(message2.getSender(), str) ? message2.getReceiver() : message2.getSender();
                    }
                    objRememberedValue = receiver;
                    composer.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                final String strSubstringBefore$default = StringsKt.substringBefore$default((String) objRememberedValue, "@", (String) null, 2, (Object) null);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
                ComposerKt.sourceInformationMarkerStart(composer, -865960274, "CC(remember):ProfileScreen.kt#9igjgp");
                boolean zChanged2 = composer.changed(function1) | composer.changed(str2);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    final Function1 function2 = function1;
                    objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.ProfileScreenKt$ChatsSection$2$1$1$1$1
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m390invoke();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m390invoke() {
                            function2.invoke(str2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                CardKt.Card(ClickableKt.clickable-XHw0xAI$default(modifierFillMaxWidth$default, false, (String) null, (Role) null, (Function0) objRememberedValue2, 7, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), CardDefaults.INSTANCE.cardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0L, 0L, composer, CardDefaults.$stable << 12, 14), (CardElevation) null, BorderStrokeKt.BorderStroke-cXLIe8U(Dp.constructor-impl(1.0f), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOutlineVariant-0d7_KjU()), ComposableLambdaKt.rememberComposableLambda(778720389, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.example.ui.screens.ProfileScreenKt$ChatsSection$2$1$1$2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(ColumnScope columnScope, Composer composer2, int i4) {
                        String str3;
                        String str4;
                        Message message3;
                        String str5;
                        Book book2;
                        int i5;
                        String str6;
                        int i6;
                        String str7;
                        int i7;
                        String title;
                        String content;
                        String imageUrl;
                        String str8;
                        Composer composer3;
                        String str9;
                        Composer composer4 = composer2;
                        Intrinsics.checkNotNullParameter(columnScope, "$this$Card");
                        ComposerKt.sourceInformation(composer4, "C1148@50243L4933:ProfileScreen.kt#2thlc2");
                        if ((i4 & 17) == 16 && composer4.getSkipping()) {
                            composer4.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(778720389, i4, -1, "com.example.ui.screens.ChatsSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:1148)");
                        }
                        Modifier modifier = PaddingKt.padding-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(12.0f));
                        Arrangement.Horizontal horizontal = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(12.0f));
                        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                        Book book3 = book;
                        Message message4 = message;
                        String str10 = strSubstringBefore$default;
                        ComposerKt.sourceInformationMarkerStart(composer4, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontal, centerVertically, composer4, 54);
                        String str11 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
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
                        Updater.set-impl(composer5, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.set-impl(composer5, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composer5.getInserting() || !Intrinsics.areEqual(composer5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composer5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composer5.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.set-impl(composer5, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer4, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScope rowScope = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer4, 1896883630, "C1205@53364L1790:ProfileScreen.kt#2thlc2");
                        if (book3 == null || (imageUrl = book3.getImageUrl()) == null || StringsKt.isBlank(imageUrl)) {
                            str3 = str10;
                            str4 = "C101@5126L9:Row.kt#2w3rfo";
                            message3 = message4;
                            str5 = "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo";
                            book2 = book3;
                            composer4.startReplaceGroup(1898623070);
                            ComposerKt.sourceInformation(composer4, "1192@52765L11,1188@52522L747");
                            Modifier modifier2 = BackgroundKt.background-bw27NRU$default(ClipKt.clip(SizeKt.size-VpY3zN4(Modifier.Companion, Dp.constructor-impl(48.0f), Dp.constructor-impl(72.0f)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(6.0f))), MaterialTheme.INSTANCE.getColorScheme(composer4, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), (Shape) null, 2, (Object) null);
                            Alignment center = Alignment.Companion.getCenter();
                            ComposerKt.sourceInformationMarkerStart(composer4, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                            i5 = 0;
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                            str6 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                            i6 = -1323940314;
                            ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, str6);
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifier2);
                            Function0 constructor2 = ComposeUiNode.Companion.getConstructor();
                            str7 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                            i7 = -692256719;
                            ComposerKt.sourceInformationMarkerStart(composer4, -692256719, str7);
                            if (!(composer4.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor2);
                            } else {
                                composer4.useNode();
                            }
                            Composer composer6 = Updater.constructor-impl(composer4);
                            Updater.set-impl(composer6, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                            Updater.set-impl(composer6, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                            Function2 setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                            if (composer6.getInserting() || !Intrinsics.areEqual(composer6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composer6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composer6.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.set-impl(composer6, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                            BoxScope boxScope = BoxScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer4, 2134950291, "C1199@53177L11,1195@52926L313:ProfileScreen.kt#2thlc2");
                            IconKt.Icon-ww6aTOc(BookKt.getBook(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(24.0f)), MaterialTheme.INSTANCE.getColorScheme(composer4, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), composer4, 432, 0);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            composer4.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            composer4.endReplaceGroup();
                        } else {
                            composer4.startReplaceGroup(1896850893);
                            ComposerKt.sourceInformation(composer4, "");
                            if (StringsKt.startsWith$default(book3.getImageUrl(), "data:image", false, 2, (Object) null)) {
                                composer4.startReplaceGroup(1896905608);
                                ComposerKt.sourceInformation(composer4, "1158@50795L541");
                                String imageUrl2 = book3.getImageUrl();
                                ComposerKt.sourceInformationMarkerStart(composer4, -1462829314, "CC(remember):ProfileScreen.kt#9igjgp");
                                boolean zChanged3 = composer4.changed(imageUrl2);
                                Object objRememberedValue3 = composer4.rememberedValue();
                                if (zChanged3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                                    try {
                                        byte[] bArrDecode = Base64.decode(StringsKt.substringAfter$default(book3.getImageUrl(), ",", (String) null, 2, (Object) null), 0);
                                        objRememberedValue3 = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                                    } catch (Exception unused) {
                                        objRememberedValue3 = null;
                                    }
                                    composer4.updateRememberedValue(objRememberedValue3);
                                }
                                Bitmap bitmap = (Bitmap) objRememberedValue3;
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                if (bitmap != null) {
                                    composer4.startReplaceGroup(1897520679);
                                    ComposerKt.sourceInformation(composer4, "1168@51427L466");
                                    str9 = str10;
                                    message3 = message4;
                                    str4 = "C101@5126L9:Row.kt#2w3rfo";
                                    str5 = "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo";
                                    ImageKt.Image-5h-nEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmap), "Book Cover", ClipKt.clip(SizeKt.size-VpY3zN4(Modifier.Companion, Dp.constructor-impl(48.0f), Dp.constructor-impl(72.0f)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(6.0f))), (Alignment) null, ContentScale.Companion.getCrop(), 0.0f, (ColorFilter) null, 0, composer4, 24624, 232);
                                    composer3 = composer4;
                                } else {
                                    str4 = "C101@5126L9:Row.kt#2w3rfo";
                                    message3 = message4;
                                    str5 = "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo";
                                    composer3 = composer4;
                                    str9 = str10;
                                    composer3.startReplaceGroup(1846525121);
                                }
                                composer3.endReplaceGroup();
                                composer3.endReplaceGroup();
                                str3 = str9;
                                str8 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                                book2 = book3;
                                composer4 = composer3;
                            } else {
                                str4 = "C101@5126L9:Row.kt#2w3rfo";
                                message3 = message4;
                                str5 = "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo";
                                str11 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                                composer4.startReplaceGroup(1898088816);
                                ComposerKt.sourceInformation(composer4, "1178@51997L433");
                                book2 = book3;
                                str3 = str10;
                                str8 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                                composer4 = composer2;
                                SingletonAsyncImageKt.m108AsyncImagegl8XCv8(book3.getImageUrl(), "Book Cover", ClipKt.clip(SizeKt.size-VpY3zN4(Modifier.Companion, Dp.constructor-impl(48.0f), Dp.constructor-impl(72.0f)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(6.0f))), null, null, null, ContentScale.Companion.getCrop(), 0.0f, null, 0, false, null, composer4, 1572912, 0, 4024);
                                composer4.endReplaceGroup();
                            }
                            composer4.endReplaceGroup();
                            str6 = str11;
                            str7 = str8;
                            i5 = 0;
                            i6 = -1323940314;
                            i7 = -692256719;
                        }
                        Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.Companion, 1.0f, false, 2, (Object) null);
                        ComposerKt.sourceInformationMarkerStart(composer4, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer4, i5);
                        ComposerKt.sourceInformationMarkerStart(composer4, i6, str6);
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, i5);
                        CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer4, modifierWeight$default);
                        Function0 constructor3 = ComposeUiNode.Companion.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer4, i7, str7);
                        if (!(composer4.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor3);
                        } else {
                            composer4.useNode();
                        }
                        Composer composer7 = Updater.constructor-impl(composer4);
                        Updater.set-impl(composer7, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.set-impl(composer7, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composer7.getInserting() || !Intrinsics.areEqual(composer7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composer7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composer7.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.set-impl(composer7, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer4, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScope columnScope2 = ColumnScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer4, 24567865, "C1206@53433L1157,1227@54648L40,1231@54884L10,1232@54960L11,1229@54746L382:ProfileScreen.kt#2thlc2");
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
                        Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                        Alignment.Vertical centerVertically2 = Alignment.Companion.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart(composer4, 693286680, str5);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween, centerVertically2, composer4, 54);
                        ComposerKt.sourceInformationMarkerStart(composer4, i6, str6);
                        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer4, i5);
                        CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default2);
                        Function0 constructor4 = ComposeUiNode.Companion.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer4, i7, str7);
                        if (!(composer4.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor4);
                        } else {
                            composer4.useNode();
                        }
                        Composer composer8 = Updater.constructor-impl(composer4);
                        Updater.set-impl(composer8, measurePolicyRowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.set-impl(composer8, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composer8.getInserting() || !Intrinsics.areEqual(composer8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            composer8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            composer8.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        Updater.set-impl(composer8, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer4, -407840262, str4);
                        RowScope rowScope2 = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer4, 1766627903, "C1213@53869L10,1215@54016L11,1211@53731L458,1221@54360L10,1222@54441L11,1219@54222L338:ProfileScreen.kt#2thlc2");
                        if (book2 == null || (title = book2.getTitle()) == null) {
                            title = "Unknown Book";
                        }
                        TextKt.Text--4IGK_g(title, RowScope.weight$default(rowScope2, Modifier.Companion, 1.0f, false, 2, (Object) null), MaterialTheme.INSTANCE.getColorScheme(composer4, MaterialTheme.$stable).getOnSurface-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getBodyMedium(), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 3072, 57304);
                        TextKt.Text--4IGK_g("Chat with " + str3, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getLabelSmall(), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4.0f)), composer2, 6);
                        if (message3 == null || (content = message3.getContent()) == null) {
                            content = "No messages";
                        }
                        TextKt.Text--4IGK_g(content, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 2, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodySmall(), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 3072, 57306);
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
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 8);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    private static final List<Review> ReviewsSection$lambda$242(State<? extends List<Review>> state) {
        return (List) state.getValue();
    }
}
