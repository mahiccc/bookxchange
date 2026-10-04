package com.example.ui.screens;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
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
import androidx.compose.material.icons.filled.EcoKt;
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
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.profileinstaller.ProfileVerifier;
import com.example.BuildConfig;
import com.example.data.Book;
import com.example.data.User;
import com.example.ui.BookViewModel;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: EcoLeaderboardDialog.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a9\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0002\u0010\u000b\u001a/\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0003¢\u0006\u0002\u0010\u0012¨\u0006\u0013²\u0006\f\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u008a\u0084\u0002"}, d2 = {"EcoLeaderboardDialog", "", "books", "", "Lcom/example/data/Book;", "currentUser", "", "viewModel", "Lcom/example/ui/BookViewModel;", "onDismiss", "Lkotlin/Function0;", "(Ljava/util/List;Ljava/lang/String;Lcom/example/ui/BookViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "EcoMetricCard", "title", "value", "icon", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app", "userState", "Lcom/example/data/User;"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class EcoLeaderboardDialogKt {
    static final float EcoLeaderboardDialog$lambda$32$lambda$31$lambda$30$lambda$29$lambda$28$lambda$26$lambda$25$lambda$24$lambda$23$lambda$22(float f) {
        return f;
    }

    static final Unit EcoLeaderboardDialog$lambda$33(List list, String str, BookViewModel bookViewModel, Function0 function0, int i, Composer composer, int i2) {
        EcoLeaderboardDialog(list, str, bookViewModel, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit EcoMetricCard$lambda$36(String str, String str2, String str3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EcoMetricCard(str, str2, str3, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:152:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:153:0x03df  */
    /* JADX WARN: Code duplicated, block: B:155:0x03e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:156:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:157:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:160:0x0434  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void EcoLeaderboardDialog(final List<Book> list, final String str, final BookViewModel bookViewModel, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        State state;
        int i3;
        ArrayList arrayList;
        String str2;
        String str3;
        int i4;
        int i5;
        Composer composer2;
        Intrinsics.checkNotNullParameter(list, "books");
        Intrinsics.checkNotNullParameter(str, "currentUser");
        Intrinsics.checkNotNullParameter(bookViewModel, "viewModel");
        Intrinsics.checkNotNullParameter(function0, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(1604982764);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(EcoLeaderboardDialog)P(!2,3)42@1346L56,43@1433L30,46@1533L257,58@2126L1422,114@4191L13750,111@4068L13873:EcoLeaderboardDialog.kt#2thlc2");
        int i6 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(bookViewModel) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i & 3072) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        int i7 = i6;
        if ((i7 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1604982764, i7, -1, "com.example.ui.screens.EcoLeaderboardDialog (EcoLeaderboardDialog.kt:41)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 495182276, "CC(remember):EcoLeaderboardDialog.kt#9igjgp");
            int i8 = i7 & 112;
            boolean z = i8 == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = bookViewModel.getUser(str);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            State stateCollectAsState = SnapshotStateKt.collectAsState((StateFlow) objRememberedValue, (Object) null, (CoroutineContext) null, composerStartRestartGroup, 48, 2);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 495188461, "CC(remember):EcoLeaderboardDialog.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(list);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                List<Book> list2 = list;
                Iterator<T> it = list2.iterator();
                int rentCount = 0;
                while (it.hasNext()) {
                    rentCount += ((Book) it.next()).getRentCount();
                }
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    i2 = 0;
                } else {
                    i2 = 0;
                    for (Book book : list2) {
                        if ((Intrinsics.areEqual(book.getStatus(), "BORROWED") || Intrinsics.areEqual(book.getStatus(), "PENDING_RETURN")) && (i2 = i2 + 1) < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    }
                }
                objRememberedValue2 = Integer.valueOf(RangesKt.coerceAtLeast(rentCount + i2, 14));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            int iIntValue = ((Number) objRememberedValue2).intValue();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            double d = iIntValue;
            final String str4 = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(0.05d * d)}, 1));
            Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
            final int i9 = iIntValue * 105;
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            final String str5 = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d * 2.7d)}, 1));
            Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 495208602, "CC(remember):EcoLeaderboardDialog.kt#9igjgp");
            boolean zChanged2 = (i8 == 32) | composerStartRestartGroup.changed(list);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            String str6 = "Silver Scholar";
            if (zChanged2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    Iterator it3 = it2;
                    State state2 = stateCollectAsState;
                    String lowerCase = StringsKt.trim(((Book) next).getOwnerName()).toString().toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    Object obj = linkedHashMap.get(lowerCase);
                    if (obj == null) {
                        obj = (List) new ArrayList();
                        linkedHashMap.put(lowerCase, obj);
                    }
                    ((List) obj).add(next);
                    stateCollectAsState = state2;
                    it2 = it3;
                }
                state = stateCollectAsState;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Object key = entry.getKey();
                    int size = ((List) entry.getValue()).size();
                    Iterator it4 = ((Iterable) entry.getValue()).iterator();
                    int rentCount2 = 0;
                    while (it4.hasNext()) {
                        rentCount2 += ((Book) it4.next()).getRentCount();
                    }
                    linkedHashMap2.put(key, Integer.valueOf(size + rentCount2));
                }
                Map mutableMap = MapsKt.toMutableMap(linkedHashMap2);
                String str7 = str;
                String lowerCase2 = StringsKt.trim(str7).toString().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                if (!mutableMap.containsKey(lowerCase2)) {
                    String lowerCase3 = StringsKt.trim(str7).toString().toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
                    mutableMap.put(lowerCase3, 1);
                }
                List listTake = CollectionsKt.take(CollectionsKt.sortedWith(mutableMap.entrySet(), new Comparator() { // from class: com.example.ui.screens.EcoLeaderboardDialogKt$EcoLeaderboardDialog$lambda$11$$inlined$sortedByDescending$1
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues((Integer) ((Map.Entry) t2).getValue(), (Integer) ((Map.Entry) t).getValue());
                    }
                }), 10);
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake, 10));
                Iterator it5 = listTake.iterator();
                int i10 = 0;
                while (it5.hasNext()) {
                    Object next2 = it5.next();
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    Map.Entry entry2 = (Map.Entry) next2;
                    int iIntValue2 = ((Number) entry2.getValue()).intValue();
                    int i12 = 25;
                    if (iIntValue2 >= 25) {
                        str2 = "Emerald Legend";
                    } else {
                        if (iIntValue2 >= 12) {
                            str2 = "Gold Bibliophile";
                        } else {
                            str2 = iIntValue2 >= 5 ? "Silver Scholar" : "Bronze Bookworm";
                        }
                        i12 = 25;
                    }
                    if (iIntValue2 >= i12) {
                        str3 = "💎";
                    } else if (iIntValue2 >= 12) {
                        str3 = "🥇";
                    } else if (iIntValue2 >= 5) {
                        str3 = "🥈";
                    } else {
                        str3 = "🥉";
                    }
                    String str8 = str3;
                    Iterator it6 = it5;
                    String strSubstringBefore$default = StringsKt.substringBefore$default((String) entry2.getKey(), "@", (String) null, 2, (Object) null);
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
                    arrayList2.add(new LeaderboardEntry(i11, strSubstringBefore$default, (String) entry2.getKey(), RangesKt.coerceAtMost(iIntValue2 * 2, 15) + 95, iIntValue2, str2, str8));
                    i10 = i11;
                    it5 = it6;
                }
                i3 = 1;
                arrayList = arrayList2;
                composerStartRestartGroup.updateRememberedValue(arrayList);
            } else {
                state = stateCollectAsState;
                arrayList = objRememberedValue3;
                i3 = 1;
            }
            final List list3 = (List) arrayList;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            User userEcoLeaderboardDialog$lambda$1 = EcoLeaderboardDialog$lambda$1(state);
            int completedSwaps = userEcoLeaderboardDialog$lambda$1 != null ? userEcoLeaderboardDialog$lambda$1.getCompletedSwaps() : i3;
            int i13 = 25;
            if (completedSwaps >= 25) {
                str6 = "Emerald Legend";
                i4 = 12;
            } else {
                i4 = 12;
                if (completedSwaps >= 12) {
                    str6 = "Gold Bibliophile";
                } else {
                    i5 = 5;
                    if (completedSwaps < 5) {
                        str6 = "Bronze Bookworm";
                    }
                }
                if (completedSwaps >= 25) {
                    i13 = 50;
                } else if (completedSwaps < i4) {
                    if (completedSwaps >= i5) {
                        i13 = i4;
                    } else {
                        i13 = i5;
                    }
                }
                final float fCoerceIn = RangesKt.coerceIn(completedSwaps / i13, 0.0f, 1.0f);
                final String str9 = str6;
                final int i14 = i13;
                boolean z2 = i3;
                final int i15 = completedSwaps;
                AndroidDialog_androidKt.Dialog(function0, new DialogProperties(false, false, false, 3, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-1767468541, z2, new Function2() { // from class: com.example.ui.screens.EcoLeaderboardDialogKt$$ExternalSyntheticLambda4
                    public final Object invoke(Object obj2, Object obj3) {
                        return EcoLeaderboardDialogKt.EcoLeaderboardDialog$lambda$32(str4, i9, str5, str9, i15, i14, fCoerceIn, list3, str, function0, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i7 >> 9) & 14) | 432, 0);
                composer2 = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            i5 = 5;
            if (completedSwaps >= 25) {
                i13 = 50;
            } else if (completedSwaps < i4) {
                if (completedSwaps >= i5) {
                    i13 = i4;
                } else {
                    i13 = i5;
                }
            }
            final float fCoerceIn2 = RangesKt.coerceIn(completedSwaps / i13, 0.0f, 1.0f);
            final String str10 = str6;
            final int i16 = i13;
            boolean z3 = i3;
            final int i17 = completedSwaps;
            AndroidDialog_androidKt.Dialog(function0, new DialogProperties(false, false, false, 3, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-1767468541, z3, new Function2() { // from class: com.example.ui.screens.EcoLeaderboardDialogKt$$ExternalSyntheticLambda4
                public final Object invoke(Object obj2, Object obj3) {
                    return EcoLeaderboardDialogKt.EcoLeaderboardDialog$lambda$32(str4, i9, str5, str10, i17, i16, fCoerceIn2, list3, str, function0, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i7 >> 9) & 14) | 432, 0);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.EcoLeaderboardDialogKt$$ExternalSyntheticLambda5
                public final Object invoke(Object obj2, Object obj3) {
                    return EcoLeaderboardDialogKt.EcoLeaderboardDialog$lambda$33(list, str, bookViewModel, function0, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    static final Unit EcoLeaderboardDialog$lambda$32(final String str, final int i, final String str2, final String str3, final int i2, final int i3, final float f, final List list, final String str4, final Function0 function0, Composer composer, int i4) {
        ComposerKt.sourceInformation(composer, "C118@4315L11,119@4374L11,120@4407L13528,115@4201L13734:EcoLeaderboardDialog.kt#2thlc2");
        if ((i4 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1767468541, i4, -1, "com.example.ui.screens.EcoLeaderboardDialog.<anonymous> (EcoLeaderboardDialog.kt:115)");
            }
            SurfaceKt.Surface-T9BRK9s(BackgroundKt.background-bw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getBackground-0d7_KjU(), (Shape) null, 2, (Object) null), (Shape) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getBackground-0d7_KjU(), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(1767815198, true, new Function2() { // from class: com.example.ui.screens.EcoLeaderboardDialogKt$$ExternalSyntheticLambda8
                public final Object invoke(Object obj, Object obj2) {
                    return EcoLeaderboardDialogKt.EcoLeaderboardDialog$lambda$32$lambda$31(str, i, str2, str3, i2, i3, f, list, str4, function0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 12582912, 122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit EcoLeaderboardDialog$lambda$32$lambda$31(final String str, final int i, final String str2, final String str3, final int i2, final int i3, final float f, final List list, final String str4, Function0 function0, Composer composer, int i4) {
        ComposerKt.sourceInformation(composer, "C121@4421L13504:EcoLeaderboardDialog.kt#2thlc2");
        if ((i4 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1767815198, i4, -1, "com.example.ui.screens.EcoLeaderboardDialog.<anonymous>.<anonymous> (EcoLeaderboardDialog.kt:121)");
            }
            Modifier modifier = PaddingKt.padding-VpY3zN4(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(20.0f), Dp.constructor-impl(16.0f));
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
            ComposerKt.sourceInformationMarkerStart(composer, 1149569269, "C127@4625L1783,165@6426L41,170@6640L11271,167@6485L11426:EcoLeaderboardDialog.kt#2thlc2");
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
            ComposerKt.sourceInformationMarkerStart(composer, -954746840, "C132@4863L135,136@5020L1312,162@6354L36:EcoLeaderboardDialog.kt#2thlc2");
            IconButtonKt.IconButton(function0, (Modifier) null, false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableSingletons$EcoLeaderboardDialogKt.INSTANCE.getLambda$1790682887$app(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
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
            ComposerKt.sourceInformationMarkerStart(composer, 25437927, "C137@5098L1212:EcoLeaderboardDialog.kt#2thlc2");
            SurfaceKt.Surface-T9BRK9s((Modifier) null, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(16.0f)), Color.copy-wmQWz5c$default(ColorKt.Color(4279994175L), 0.15f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableSingletons$EcoLeaderboardDialogKt.INSTANCE.getLambda$2089338597$app(), composer, 12583296, 121);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            BoxKt.Box(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(48.0f)), composer, 6);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(12.0f)), composer, 6);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null);
            Arrangement.Vertical vertical = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(16.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -1625422641, "CC(remember):EcoLeaderboardDialog.kt#9igjgp");
            boolean zChanged = composer.changed(str) | composer.changed(i) | composer.changed(str2) | composer.changed(str3) | composer.changed(i2) | composer.changed(i3) | composer.changed(f) | composer.changedInstance(list) | composer.changed(str4);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                Function1 function1 = new Function1() { // from class: com.example.ui.screens.EcoLeaderboardDialogKt$$ExternalSyntheticLambda6
                    public final Object invoke(Object obj) {
                        return EcoLeaderboardDialogKt.EcoLeaderboardDialog$lambda$32$lambda$31$lambda$30$lambda$29$lambda$28(list, str, i, str2, f, str3, i2, i3, str4, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(function1);
                objRememberedValue = function1;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            LazyDslKt.LazyColumn(modifierFillMaxSize$default, (LazyListState) null, (PaddingValues) null, false, vertical, (Alignment.Horizontal) null, (FlingBehavior) null, false, (Function1) objRememberedValue, composer, 24582, 238);
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

    static final Unit EcoLeaderboardDialog$lambda$32$lambda$31$lambda$30$lambda$29$lambda$28(final List list, final String str, final int i, final String str2, final float f, final String str3, final int i2, final int i3, final String str4, LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyColumn");
        LazyListScope.item$default(lazyListScope, (Object) null, (Object) null, ComposableLambdaKt.composableLambdaInstance(1246156116, true, new Function3() { // from class: com.example.ui.screens.EcoLeaderboardDialogKt$$ExternalSyntheticLambda10
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return EcoLeaderboardDialogKt.EcoLeaderboardDialog$lambda$32$lambda$31$lambda$30$lambda$29$lambda$28$lambda$18(str, i, str2, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, (Object) null);
        LazyListScope.item$default(lazyListScope, (Object) null, (Object) null, ComposableLambdaKt.composableLambdaInstance(-516984323, true, new Function3() { // from class: com.example.ui.screens.EcoLeaderboardDialogKt$$ExternalSyntheticLambda11
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return EcoLeaderboardDialogKt.EcoLeaderboardDialog$lambda$32$lambda$31$lambda$30$lambda$29$lambda$28$lambda$26(f, str3, i2, i3, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, (Object) null);
        LazyListScope.item$default(lazyListScope, (Object) null, (Object) null, ComposableSingletons$EcoLeaderboardDialogKt.INSTANCE.getLambda$1148889372$app(), 3, (Object) null);
        lazyListScope.items(list.size(), (Function1) null, new Function1<Integer, Object>() { // from class: com.example.ui.screens.EcoLeaderboardDialogKt$EcoLeaderboardDialog$lambda$32$lambda$31$lambda$30$lambda$29$lambda$28$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i4) {
                list.get(i4);
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.screens.EcoLeaderboardDialogKt$EcoLeaderboardDialog$lambda$32$lambda$31$lambda$30$lambda$29$lambda$28$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, final int i4, Composer composer, int i5) {
                int i6;
                long j;
                int i7;
                Object obj;
                float f2;
                BorderStroke borderStroke;
                ComposerKt.sourceInformation(composer, "C188@8866L26:LazyDsl.kt#428nma");
                if ((i5 & 6) == 0) {
                    i6 = i5 | (composer.changed(lazyItemScope) ? 4 : 2);
                } else {
                    i6 = i5;
                }
                if ((i5 & 48) == 0) {
                    i6 |= composer.changed(i4) ? 32 : 16;
                }
                if ((i6 & BuildConfig.VERSION_CODE) == 146 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1091073711, i6, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:188)");
                }
                final LeaderboardEntry leaderboardEntry = (LeaderboardEntry) list.get(i4);
                composer.startReplaceGroup(634113670);
                ComposerKt.sourceInformation(composer, "CP(1)*315@14798L3073,310@14303L3568:EcoLeaderboardDialog.kt#2thlc2");
                final boolean zEquals = StringsKt.equals(leaderboardEntry.getEmail(), StringsKt.trim(str4).toString(), true);
                Shape shape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f));
                if (zEquals) {
                    composer.startReplaceGroup(1544480985);
                    ComposerKt.sourceInformation(composer, "312@14444L11");
                    j = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU();
                    i7 = 14;
                    obj = null;
                    f2 = 0.6f;
                } else {
                    composer.startReplaceGroup(1544483065);
                    ComposerKt.sourceInformation(composer, "312@14511L11");
                    j = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU();
                    i7 = 14;
                    obj = null;
                    f2 = 0.4f;
                }
                long j2 = Color.copy-wmQWz5c$default(j, f2, 0.0f, 0.0f, 0.0f, i7, obj);
                composer.endReplaceGroup();
                if (zEquals) {
                    composer.startReplaceGroup(1544486430);
                    ComposerKt.sourceInformation(composer, "313@14677L11");
                    borderStroke = BorderStrokeKt.BorderStroke-cXLIe8U(Dp.constructor-impl(1.5f), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU());
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(634498006);
                    composer.endReplaceGroup();
                    borderStroke = null;
                }
                SurfaceKt.Surface-T9BRK9s(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), shape, j2, 0L, 0.0f, 0.0f, borderStroke, ComposableLambdaKt.rememberComposableLambda(903151820, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.ui.screens.EcoLeaderboardDialogKt$EcoLeaderboardDialog$1$1$1$2$1$3$1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        invoke((Composer) obj2, ((Number) obj3).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i8) {
                        String str5;
                        ComposerKt.sourceInformation(composer2, "C316@14828L3017:EcoLeaderboardDialog.kt#2thlc2");
                        if ((i8 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(903151820, i8, -1, "com.example.ui.screens.EcoLeaderboardDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EcoLeaderboardDialog.kt:316)");
                        }
                        Modifier modifier = PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(14.0f), Dp.constructor-impl(10.0f));
                        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                        int i9 = i4;
                        final LeaderboardEntry leaderboardEntry2 = leaderboardEntry;
                        boolean z = zEquals;
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
                        ComposerKt.sourceInformationMarkerStart(composer2, -1023429426, "C328@15498L10,321@15122L567,333@15723L39,335@15796L1255,357@17222L11,358@17276L539,355@17085L730:EcoLeaderboardDialog.kt#2thlc2");
                        if (i9 == 0) {
                            str5 = "🥇";
                        } else if (i9 == 1) {
                            str5 = "🥈";
                        } else if (i9 != 2) {
                            str5 = "#" + leaderboardEntry2.getRank();
                        } else {
                            str5 = "🥉";
                        }
                        TextKt.Text--4IGK_g(str5, SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(32.0f)), 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getTitleSmall(), composer2, 196656, 0, 65500);
                        SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer2, 6);
                        Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.Companion, 1.0f, false, 2, (Object) null);
                        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, 0);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierWeight$default);
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
                        ComposerKt.sourceInformationMarkerStart(composer2, 1201221093, "C336@15873L796,350@16866L10,351@16951L11,348@16706L311:EcoLeaderboardDialog.kt#2thlc2");
                        Alignment.Vertical centerVertically2 = Alignment.Companion.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        Modifier modifier2 = Modifier.Companion;
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer2, 48);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifier2);
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
                        Updater.set-impl(composer5, measurePolicyRowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.set-impl(composer5, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composer5.getInserting() || !Intrinsics.areEqual(composer5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composer5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composer5.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.set-impl(composer5, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScope rowScope2 = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, 1604736353, "C339@16148L10,337@15967L367,342@16375L39,343@16455L176:EcoLeaderboardDialog.kt#2thlc2");
                        String name = leaderboardEntry2.getName();
                        if (z) {
                            name = name + " (You)";
                        }
                        TextStyle bodyMedium = MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodyMedium();
                        FontWeight.Companion companion = FontWeight.Companion;
                        TextKt.Text--4IGK_g(name, (Modifier) null, 0L, 0L, (FontStyle) null, z ? companion.getExtraBold() : companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, bodyMedium, composer2, 0, 0, 65502);
                        SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6.0f)), composer2, 6);
                        TextKt.Text--4IGK_g(leaderboardEntry2.getBadgeIcon(), (Modifier) null, 0L, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer2, 3072, 0, 131062);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        TextKt.Text--4IGK_g(leaderboardEntry2.getTier() + " • Trust " + leaderboardEntry2.getTrustScore(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getLabelSmall(), composer2, 0, 0, 65530);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        SurfaceKt.Surface-T9BRK9s((Modifier) null, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(8.0f)), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(892777995, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.ui.screens.EcoLeaderboardDialogKt$EcoLeaderboardDialog$1$1$1$2$1$3$1$1$2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                invoke((Composer) obj2, ((Number) obj3).intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer6, int i10) {
                                ComposerKt.sourceInformation(composer6, "C361@17463L10,364@17724L11,359@17314L467:EcoLeaderboardDialog.kt#2thlc2");
                                if ((i10 & 3) == 2 && composer6.getSkipping()) {
                                    composer6.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(892777995, i10, -1, "com.example.ui.screens.EcoLeaderboardDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EcoLeaderboardDialog.kt:359)");
                                }
                                TextKt.Text--4IGK_g(leaderboardEntry2.getBooksCirculated() + " books", PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(8.0f), Dp.constructor-impl(4.0f)), MaterialTheme.INSTANCE.getColorScheme(composer6, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer6, MaterialTheme.$stable).getLabelMedium(), composer6, 196656, 0, 65496);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 12582912, 121);
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
                }, composer, 54), composer, 12582918, 56);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    static final Unit EcoLeaderboardDialog$lambda$32$lambda$31$lambda$30$lambda$29$lambda$28$lambda$18(final String str, final int i, final String str2, LazyItemScope lazyItemScope, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(lazyItemScope, "$this$item");
        ComposerKt.sourceInformation(composer, "C174@6783L46,177@6983L3007,173@6727L3263:EcoLeaderboardDialog.kt#2thlc2");
        if ((i2 & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1246156116, i2, -1, "com.example.ui.screens.EcoLeaderboardDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EcoLeaderboardDialog.kt:173)");
            }
            CardColors cardColors = CardDefaults.INSTANCE.cardColors-ro_MJ88(ColorKt.Color(4293457385L), 0L, 0L, 0L, composer, (CardDefaults.$stable << 12) | 6, 14);
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(20.0f)), cardColors, (CardElevation) null, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(1465866402, true, new Function3() { // from class: com.example.ui.screens.EcoLeaderboardDialogKt$$ExternalSyntheticLambda7
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return EcoLeaderboardDialogKt.EcoLeaderboardDialog$lambda$32$lambda$31$lambda$30$lambda$29$lambda$28$lambda$18$lambda$17(str, i, str2, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer, 54), composer, 196614, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit EcoLeaderboardDialog$lambda$32$lambda$31$lambda$30$lambda$29$lambda$28$lambda$18$lambda$17(String str, int i, String str2, ColumnScope columnScope, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(columnScope, "$this$Card");
        ComposerKt.sourceInformation(composer, "C178@7013L2951:EcoLeaderboardDialog.kt#2thlc2");
        if ((i2 & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1465866402, i2, -1, "com.example.ui.screens.EcoLeaderboardDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EcoLeaderboardDialog.kt:178)");
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
            ComposerKt.sourceInformationMarkerStart(composer, 1681615803, "C179@7090L885,196@8200L10,194@8008L410,201@8452L40,203@8526L1408:EcoLeaderboardDialog.kt#2thlc2");
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
            ComposerKt.sourceInformationMarkerStart(composer, 2037487970, "C180@7180L307,186@7524L39,189@7739L10,187@7600L341:EcoLeaderboardDialog.kt#2thlc2");
            IconKt.Icon-ww6aTOc(EcoKt.getEco(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(28.0f)), ColorKt.Color(4281236786L), composer, 3504, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            TextKt.Text--4IGK_g("Community Eco-Impact", (Modifier) null, ColorKt.Color(4279983648L), 0L, (FontStyle) null, FontWeight.Companion.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleMedium(), composer, 196998, 0, 65498);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            TextKt.Text--4IGK_g("Every book shared saves fresh paper, clean water, and reduces landfill emissions.", PaddingKt.padding-VpY3zN4$default(Modifier.Companion, 0.0f, Dp.constructor-impl(6.0f), 1, (Object) null), Color.copy-wmQWz5c$default(ColorKt.Color(4281236786L), 0.9f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 438, 0, 65528);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween, Alignment.Companion.getTop(), composer, 6);
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
            ComposerKt.sourceInformationMarkerStart(composer, -859508098, "C207@8760L299,213@9096L39,214@9172L311,220@9520L39,221@9596L304:EcoLeaderboardDialog.kt#2thlc2");
            EcoMetricCard("Trees Saved", str, "🌳", RowScope.weight$default(rowScope2, Modifier.Companion, 1.0f, false, 2, (Object) null), composer, 390, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            EcoMetricCard("Water Saved", i + "L", "💧", RowScope.weight$default(rowScope2, Modifier.Companion, 1.0f, false, 2, (Object) null), composer, 390, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f)), composer, 6);
            EcoMetricCard("CO2 Cut", str2 + "kg", "📉", RowScope.weight$default(rowScope2, Modifier.Companion, 1.0f, false, 2, (Object) null), composer, 390, 0);
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

    static final Unit EcoLeaderboardDialog$lambda$32$lambda$31$lambda$30$lambda$29$lambda$28$lambda$26(final float f, final String str, final int i, final int i2, LazyItemScope lazyItemScope, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(lazyItemScope, "$this$item");
        ComposerKt.sourceInformation(composer, "C235@10210L11,235@10168L69,238@10391L2723,234@10112L3002:EcoLeaderboardDialog.kt#2thlc2");
        if ((i3 & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-516984323, i3, -1, "com.example.ui.screens.EcoLeaderboardDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EcoLeaderboardDialog.kt:234)");
            }
            CardColors cardColors = CardDefaults.INSTANCE.cardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0L, 0L, 0L, composer, CardDefaults.$stable << 12, 14);
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(16.0f)), cardColors, (CardElevation) null, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(171203019, true, new Function3() { // from class: com.example.ui.screens.EcoLeaderboardDialogKt$$ExternalSyntheticLambda9
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return EcoLeaderboardDialogKt.EcoLeaderboardDialog$lambda$32$lambda$31$lambda$30$lambda$29$lambda$28$lambda$26$lambda$25(f, str, i, i2, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer, 54), composer, 196614, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit EcoLeaderboardDialog$lambda$32$lambda$31$lambda$30$lambda$29$lambda$28$lambda$26$lambda$25(final float f, String str, final int i, final int i2, ColumnScope columnScope, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(columnScope, "$this$Card");
        ComposerKt.sourceInformation(composer, "C239@10421L2667:EcoLeaderboardDialog.kt#2thlc2");
        if ((i3 & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(171203019, i3, -1, "com.example.ui.screens.EcoLeaderboardDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EcoLeaderboardDialog.kt:239)");
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
            ComposerKt.sourceInformationMarkerStart(composer, 323634702, "C240@10498L1990,273@12522L41,276@12669L18,280@12914L11,281@12998L11,275@12597L461:EcoLeaderboardDialog.kt#2thlc2");
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
            ComposerKt.sourceInformationMarkerStart(composer, -1222379700, "C245@10816L797,261@11797L11,262@11864L590,259@11651L803:EcoLeaderboardDialog.kt#2thlc2");
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
            ComposerKt.sourceInformationMarkerStart(composer, 1271473890, "C248@11008L10,249@11098L11,246@10865L303,253@11345L10,255@11514L11,251@11209L366:EcoLeaderboardDialog.kt#2thlc2");
            TextKt.Text--4IGK_g("Your Reader Tier", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelMedium(), composer, 6, 0, 65530);
            TextStyle titleMedium = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleMedium();
            TextKt.Text--4IGK_g(str, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, titleMedium, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            SurfaceKt.Surface-T9BRK9s((Modifier) null, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(10.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-1644307978, true, new Function2() { // from class: com.example.ui.screens.EcoLeaderboardDialogKt$$ExternalSyntheticLambda0
                public final Object invoke(Object obj, Object obj2) {
                    return EcoLeaderboardDialogKt.EcoLeaderboardDialog$lambda$32$lambda$31$lambda$30$lambda$29$lambda$28$lambda$26$lambda$25$lambda$24$lambda$21$lambda$20(i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 12582912, 121);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10.0f)), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, 10506759, "CC(remember):EcoLeaderboardDialog.kt#9igjgp");
            boolean zChanged = composer.changed(f);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.example.ui.screens.EcoLeaderboardDialogKt$$ExternalSyntheticLambda3
                    public final Object invoke() {
                        return Float.valueOf(EcoLeaderboardDialogKt.EcoLeaderboardDialog$lambda$32$lambda$31$lambda$30$lambda$29$lambda$28$lambda$26$lambda$25$lambda$24$lambda$23$lambda$22(f));
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ProgressIndicatorKt.LinearProgressIndicator-GJbTh5U((Function0) objRememberedValue, SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(8.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOutlineVariant-0d7_KjU(), 0, 0.0f, (Function1) null, composer, 48, 112);
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

    static final Unit EcoLeaderboardDialog$lambda$32$lambda$31$lambda$30$lambda$29$lambda$28$lambda$26$lambda$25$lambda$24$lambda$21$lambda$20(int i, int i2, Composer composer, int i3) {
        ComposerKt.sourceInformation(composer, "C265@12072L10,267@12235L11,263@11906L510:EcoLeaderboardDialog.kt#2thlc2");
        if ((i3 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1644307978, i3, -1, "com.example.ui.screens.EcoLeaderboardDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EcoLeaderboardDialog.kt:263)");
            }
            TextStyle labelSmall = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall();
            TextKt.Text--4IGK_g(i + "/" + i2 + " to Next Tier", PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(8.0f), Dp.constructor-impl(4.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnPrimaryContainer-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, labelSmall, composer, 196656, 0, 65496);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    private static final void EcoMetricCard(final String str, final String str2, final String str3, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        Composer composer2;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(382598067);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(EcoMetricCard)P(2,3)387@18197L712,383@18082L827:EcoLeaderboardDialog.kt#2thlc2");
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(str3) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            }
            if ((i3 & 1171) != 1170 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier4 = modifier2;
            } else {
                if (i4 != 0) {
                    modifier3 = (Modifier) Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(382598067, i3, -1, "com.example.ui.screens.EcoMetricCard (EcoLeaderboardDialog.kt:382)");
                }
                int i5 = ((i3 >> 9) & 14) | 12583296;
                composer2 = composerStartRestartGroup;
                Modifier modifier5 = modifier3;
                SurfaceKt.Surface-T9BRK9s(modifier5, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), Color.Companion.getWhite-0d7_KjU(), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(1035546296, true, new Function2() { // from class: com.example.ui.screens.EcoLeaderboardDialogKt$$ExternalSyntheticLambda1
                    public final Object invoke(Object obj, Object obj2) {
                        return EcoLeaderboardDialogKt.EcoMetricCard$lambda$35(str3, str2, str, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composerStartRestartGroup, 54), composer2, i5, 120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier5;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.EcoLeaderboardDialogKt$$ExternalSyntheticLambda2
                    public final Object invoke(Object obj, Object obj2) {
                        return EcoLeaderboardDialogKt.EcoMetricCard$lambda$36(str, str2, str3, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) != 1170) {
            if (i4 != 0) {
                modifier3 = (Modifier) Modifier.Companion;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(382598067, i3, -1, "com.example.ui.screens.EcoMetricCard (EcoLeaderboardDialog.kt:382)");
            }
            int i6 = ((i3 >> 9) & 14) | 12583296;
            composer2 = composerStartRestartGroup;
            Modifier modifier6 = modifier3;
            SurfaceKt.Surface-T9BRK9s(modifier6, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), Color.Companion.getWhite-0d7_KjU(), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(1035546296, true, new Function2() { // from class: com.example.ui.screens.EcoLeaderboardDialogKt$$ExternalSyntheticLambda1
                public final Object invoke(Object obj, Object obj2) {
                    return EcoLeaderboardDialogKt.EcoMetricCard$lambda$35(str3, str2, str, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composer2, i6, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier6;
        } else {
            if (i4 != 0) {
                modifier3 = (Modifier) Modifier.Companion;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(382598067, i3, -1, "com.example.ui.screens.EcoMetricCard (EcoLeaderboardDialog.kt:382)");
            }
            int i7 = ((i3 >> 9) & 14) | 12583296;
            composer2 = composerStartRestartGroup;
            Modifier modifier7 = modifier3;
            SurfaceKt.Surface-T9BRK9s(modifier7, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12.0f)), Color.Companion.getWhite-0d7_KjU(), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(1035546296, true, new Function2() { // from class: com.example.ui.screens.EcoLeaderboardDialogKt$$ExternalSyntheticLambda1
                public final Object invoke(Object obj, Object obj2) {
                    return EcoLeaderboardDialogKt.EcoMetricCard$lambda$35(str3, str2, str, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composer2, i7, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier7;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.EcoLeaderboardDialogKt$$ExternalSyntheticLambda2
                public final Object invoke(Object obj, Object obj2) {
                    return EcoLeaderboardDialogKt.EcoMetricCard$lambda$36(str, str2, str3, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final Unit EcoMetricCard$lambda$35(String str, String str2, String str3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C388@18207L696:EcoLeaderboardDialog.kt#2thlc2");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1035546296, i, -1, "com.example.ui.screens.EcoMetricCard.<anonymous> (EcoLeaderboardDialog.kt:388)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8.0f));
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
            ComposerKt.sourceInformationMarkerStart(composer, -1943974347, "C392@18349L35,393@18397L40,396@18524L10,394@18450L198,402@18735L10,400@18661L232:EcoLeaderboardDialog.kt#2thlc2");
            TextKt.Text--4IGK_g(str, (Modifier) null, 0L, TextUnitKt.getSp(20), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 3072, 0, 131062);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(2.0f)), composer, 6);
            TextStyle titleSmall = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleSmall();
            TextKt.Text--4IGK_g(str2, (Modifier) null, ColorKt.Color(4279983648L), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, titleSmall, composer, 196992, 0, 65498);
            TextKt.Text--4IGK_g(str3, (Modifier) null, ColorKt.Color(4281896508L), TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.box-impl(TextAlign.Companion.getCenter-e0LSkKk()), 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 3456, 0, 65010);
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

    private static final User EcoLeaderboardDialog$lambda$1(State<User> state) {
        return (User) state.getValue();
    }
}
