package com.example.ui.screens;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.BookKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.fragment.app.FragmentTransaction;
import coil.compose.SingletonAsyncImageKt;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: BookImageDisplay.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aA\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"BookImageDisplay", "", "imageUrl", "", "contentDescription", "modifier", "Landroidx/compose/ui/Modifier;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "placeholderIcon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/ui/graphics/vector/ImageVector;Landroidx/compose/runtime/Composer;II)V", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class BookImageDisplayKt {
    static final Unit BookImageDisplay$lambda$1(String str, String str2, Modifier modifier, ContentScale contentScale, ImageVector imageVector, int i, int i2, Composer composer, int i3) {
        BookImageDisplay(str, str2, modifier, contentScale, imageVector, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    static final Unit BookImageDisplay$lambda$4(String str, String str2, Modifier modifier, ContentScale contentScale, ImageVector imageVector, int i, int i2, Composer composer, int i3) {
        BookImageDisplay(str, str2, modifier, contentScale, imageVector, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:133:0x0328  */
    /* JADX WARN: Code duplicated, block: B:136:0x0395  */
    /* JADX WARN: Code duplicated, block: B:139:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:140:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:143:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:145:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:148:0x0401  */
    /* JADX WARN: Code duplicated, block: B:149:0x0447  */
    /* JADX WARN: Code duplicated, block: B:152:0x046d  */
    /* JADX WARN: Code duplicated, block: B:155:0x0476  */
    /* JADX WARN: Code duplicated, block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b9 A[PHI: r3 r9 r11
      0x00b9: PHI (r3v24 int) = (r3v10 int), (r3v10 int), (r3v25 int) binds: [B:71:0x00d0, B:63:0x00b6, B:64:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x00b9: PHI (r9v16 androidx.compose.ui.Modifier) = (r9v3 androidx.compose.ui.Modifier), (r9v2 androidx.compose.ui.Modifier), (r9v2 androidx.compose.ui.Modifier) binds: [B:71:0x00d0, B:63:0x00b6, B:64:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x00b9: PHI (r11v9 androidx.compose.ui.layout.ContentScale) = 
      (r11v3 androidx.compose.ui.layout.ContentScale)
      (r11v2 androidx.compose.ui.layout.ContentScale)
      (r11v2 androidx.compose.ui.layout.ContentScale)
     binds: [B:71:0x00d0, B:63:0x00b6, B:64:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:78:0x0104  */
    public static final void BookImageDisplay(final String str, final String str2, Modifier modifier, ContentScale contentScale, ImageVector imageVector, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        ContentScale fit;
        int i5;
        ImageVector imageVector2;
        ImageVector book;
        Modifier modifier3;
        ContentScale contentScale2;
        String str3;
        final ContentScale contentScale3;
        int currentCompositeKeyHash;
        Function0 constructor;
        Composer composer2;
        Function2 setCompositeKeyHash;
        ImageVector imageVector3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        ContentScale contentScale4;
        final ContentScale contentScale5;
        final Modifier modifier4;
        final ImageVector imageVector4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2;
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-777337130);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BookImageDisplay)P(2!1,3)56@2105L443:BookImageDisplay.kt#2thlc2");
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    fit = contentScale;
                    if (composerStartRestartGroup.changed(fit)) {
                        i5 = 2048;
                    } else {
                        i5 = UserVerificationMethods.USER_VERIFY_ALL;
                    }
                    i3 |= i5;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        imageVector2 = imageVector;
                        if (composerStartRestartGroup.changed(imageVector2)) {
                            i6 = 16384;
                        }
                        i3 |= i6;
                    } else {
                        imageVector2 = imageVector;
                    }
                    i6 = FragmentTransaction.TRANSIT_EXIT_MASK;
                    i3 |= i6;
                } else {
                    imageVector2 = imageVector;
                }
                if ((i3 & 9363) != 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    contentScale5 = fit;
                    imageVector4 = imageVector2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i7 != 0) {
                            modifier2 = (Modifier) Modifier.Companion;
                        }
                        if (i4 != 0) {
                            fit = ContentScale.Companion.getFit();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            book = BookKt.getBook(Icons.INSTANCE.getDefault());
                            modifier3 = modifier2;
                            contentScale2 = fit;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-777337130, i3, -1, "com.example.ui.screens.BookImageDisplay (BookImageDisplay.kt:36)");
                        }
                        str3 = str;
                        if (str3 != null || StringsKt.isBlank(str3)) {
                            contentScale3 = contentScale2;
                            composerStartRestartGroup.startReplaceGroup(813503854);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "39@1494L11,38@1432L511");
                            Modifier modifier5 = BackgroundKt.background-bw27NRU$default(modifier3, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), (Shape) null, 2, (Object) null);
                            Alignment center = Alignment.Companion.getCenter();
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier5);
                            constructor = ComposeUiNode.Companion.getConstructor();
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
                            composer2 = Updater.constructor-impl(composerStartRestartGroup);
                            Updater.set-impl(composer2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                            Updater.set-impl(composer2, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                            if (!composer2.getInserting() || !Intrinsics.areEqual(composer2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composer2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composer2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.set-impl(composer2, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                            BoxScope boxScope = BoxScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -789098214, "C:BookImageDisplay.kt#2thlc2");
                            if (book != null) {
                                imageVector3 = book;
                                composerStartRestartGroup.startReplaceGroup(-790691925);
                            } else {
                                composerStartRestartGroup.startReplaceGroup(-789070346);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "46@1801L11,43@1642L277");
                                int i8 = ((i3 >> 12) & 14) | 384 | (i3 & 112);
                                imageVector3 = book;
                                IconKt.Icon-ww6aTOc(imageVector3, str2, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(36.0f)), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null), composerStartRestartGroup, i8, 0);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            composerStartRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            composerStartRestartGroup.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                                final ImageVector imageVector5 = imageVector3;
                                final Modifier modifier6 = modifier3;
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.BookImageDisplayKt$$ExternalSyntheticLambda0
                                    public final Object invoke(Object obj, Object obj2) {
                                        return BookImageDisplayKt.BookImageDisplay$lambda$1(str, str2, modifier6, contentScale3, imageVector5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        composerStartRestartGroup.startReplaceGroup(812075436);
                        composerStartRestartGroup.endReplaceGroup();
                        boolean z = StringsKt.startsWith(str, "http://", true) || StringsKt.startsWith(str, "https://", true);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 303358481, "CC(remember):BookImageDisplay.kt#9igjgp");
                        boolean z2 = (i3 & 14) == 4;
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
                            objRememberedValue = null;
                            if (!z) {
                                try {
                                    byte[] bArrDecode = Base64.decode(StringsKt.trim(StringsKt.contains$default(str, ",", false, 2, (Object) null) ? StringsKt.substringAfter$default(str, ",", (String) null, 2, (Object) null) : str).toString(), 0);
                                    objRememberedValue = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                                } catch (Exception unused) {
                                }
                            }
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        Bitmap bitmap = (Bitmap) objRememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        if (bitmap != null) {
                            composerStartRestartGroup.startReplaceGroup(814636129);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "71@2584L187");
                            Modifier modifier7 = modifier3;
                            ImageKt.Image-5h-nEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmap), str2, modifier7, (Alignment) null, contentScale2, 0.0f, (ColorFilter) null, 0, composerStartRestartGroup, (i3 & 1008) | ((i3 << 3) & 57344), 232);
                            modifier3 = modifier7;
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.endReplaceGroup();
                            contentScale4 = contentScale2;
                        } else {
                            ContentScale contentScale6 = contentScale2;
                            if (z) {
                                composerStartRestartGroup.startReplaceGroup(814855051);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "78@2805L177");
                                Modifier modifier8 = modifier3;
                                SingletonAsyncImageKt.m108AsyncImagegl8XCv8(str, str2, modifier8, null, null, null, contentScale6, 0.0f, null, 0, false, null, composerStartRestartGroup, (i3 & 1022) | ((i3 << 9) & 3670016), 0, 4024);
                                contentScale4 = contentScale6;
                                composerStartRestartGroup = composerStartRestartGroup;
                                modifier3 = modifier8;
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                contentScale4 = contentScale6;
                                composerStartRestartGroup.startReplaceGroup(815062813);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "86@3066L11,85@3004L511");
                                Modifier modifier9 = BackgroundKt.background-bw27NRU$default(modifier3, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), (Shape) null, 2, (Object) null);
                                Alignment center2 = Alignment.Companion.getCenter();
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier9);
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
                                Updater.set-impl(composer3, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                                Updater.set-impl(composer3, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                Function2 setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composer3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composer3.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.set-impl(composer3, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                BoxScope boxScope2 = BoxScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1847098778, "C:BookImageDisplay.kt#2thlc2");
                                if (book == null) {
                                    composerStartRestartGroup.startReplaceGroup(1843945643);
                                } else {
                                    composerStartRestartGroup.startReplaceGroup(1847126646);
                                    ComposerKt.sourceInformation(composerStartRestartGroup, "93@3373L11,90@3214L277");
                                    IconKt.Icon-ww6aTOc(book, str2, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(36.0f)), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null), composerStartRestartGroup, ((i3 >> 12) & 14) | 384 | (i3 & 112), 0);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                composerStartRestartGroup.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                composerStartRestartGroup.endReplaceGroup();
                            }
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        contentScale5 = contentScale4;
                        modifier4 = modifier3;
                        imageVector4 = book;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                    }
                    contentScale2 = fit;
                    book = imageVector2;
                    modifier3 = modifier2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-777337130, i3, -1, "com.example.ui.screens.BookImageDisplay (BookImageDisplay.kt:36)");
                    }
                    str3 = str;
                    if (str3 != null) {
                    }
                    contentScale3 = contentScale2;
                    composerStartRestartGroup.startReplaceGroup(813503854);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "39@1494L11,38@1432L511");
                    Modifier modifier10 = BackgroundKt.background-bw27NRU$default(modifier3, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), (Shape) null, 2, (Object) null);
                    Alignment center3 = Alignment.Companion.getCenter();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(center3, false);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier10);
                    constructor = ComposeUiNode.Companion.getConstructor();
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
                    composer2 = Updater.constructor-impl(composerStartRestartGroup);
                    Updater.set-impl(composer2, measurePolicyMaybeCachedBoxMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.set-impl(composer2, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (!composer2.getInserting()) {
                        composer2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composer2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    } else {
                        composer2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composer2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.set-impl(composer2, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScope boxScope3 = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -789098214, "C:BookImageDisplay.kt#2thlc2");
                    if (book != null) {
                        imageVector3 = book;
                        composerStartRestartGroup.startReplaceGroup(-790691925);
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-789070346);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "46@1801L11,43@1642L277");
                        int i9 = ((i3 >> 12) & 14) | 384 | (i3 & 112);
                        imageVector3 = book;
                        IconKt.Icon-ww6aTOc(imageVector3, str2, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(36.0f)), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null), composerStartRestartGroup, i9, 0);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final ImageVector imageVector6 = imageVector3;
                        final Modifier modifier11 = modifier3;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.BookImageDisplayKt$$ExternalSyntheticLambda0
                            public final Object invoke(Object obj, Object obj2) {
                                return BookImageDisplayKt.BookImageDisplay$lambda$1(str, str2, modifier11, contentScale3, imageVector6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 != null) {
                    scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.example.ui.screens.BookImageDisplayKt$$ExternalSyntheticLambda1
                        public final Object invoke(Object obj, Object obj2) {
                            return BookImageDisplayKt.BookImageDisplay$lambda$4(str, str2, modifier4, contentScale5, imageVector4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 3072;
            fit = contentScale;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    imageVector2 = imageVector;
                    if (composerStartRestartGroup.changed(imageVector2)) {
                        i6 = 16384;
                    }
                    i3 |= i6;
                } else {
                    imageVector2 = imageVector;
                }
                i6 = FragmentTransaction.TRANSIT_EXIT_MASK;
                i3 |= i6;
            } else {
                imageVector2 = imageVector;
            }
            if ((i3 & 9363) != 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        modifier2 = (Modifier) Modifier.Companion;
                    }
                    if (i4 != 0) {
                        fit = ContentScale.Companion.getFit();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        book = BookKt.getBook(Icons.INSTANCE.getDefault());
                        modifier3 = modifier2;
                        contentScale2 = fit;
                    } else {
                        contentScale2 = fit;
                        book = imageVector2;
                        modifier3 = modifier2;
                    }
                } else {
                    if (i7 != 0) {
                        modifier2 = (Modifier) Modifier.Companion;
                    }
                    if (i4 != 0) {
                        fit = ContentScale.Companion.getFit();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        book = BookKt.getBook(Icons.INSTANCE.getDefault());
                        modifier3 = modifier2;
                        contentScale2 = fit;
                    } else {
                        contentScale2 = fit;
                        book = imageVector2;
                        modifier3 = modifier2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-777337130, i3, -1, "com.example.ui.screens.BookImageDisplay (BookImageDisplay.kt:36)");
                }
                str3 = str;
                if (str3 != null) {
                }
                contentScale3 = contentScale2;
                composerStartRestartGroup.startReplaceGroup(813503854);
                ComposerKt.sourceInformation(composerStartRestartGroup, "39@1494L11,38@1432L511");
                Modifier modifier12 = BackgroundKt.background-bw27NRU$default(modifier3, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), (Shape) null, 2, (Object) null);
                Alignment center4 = Alignment.Companion.getCenter();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(center4, false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier12);
                constructor = ComposeUiNode.Companion.getConstructor();
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
                composer2 = Updater.constructor-impl(composerStartRestartGroup);
                Updater.set-impl(composer2, measurePolicyMaybeCachedBoxMeasurePolicy4, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl(composer2, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (!composer2.getInserting()) {
                    composer2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composer2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                } else {
                    composer2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composer2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.set-impl(composer2, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScope boxScope4 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -789098214, "C:BookImageDisplay.kt#2thlc2");
                if (book != null) {
                    imageVector3 = book;
                    composerStartRestartGroup.startReplaceGroup(-790691925);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-789070346);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "46@1801L11,43@1642L277");
                    int i10 = ((i3 >> 12) & 14) | 384 | (i3 & 112);
                    imageVector3 = book;
                    IconKt.Icon-ww6aTOc(imageVector3, str2, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(36.0f)), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null), composerStartRestartGroup, i10, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final ImageVector imageVector7 = imageVector3;
                    final Modifier modifier13 = modifier3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.BookImageDisplayKt$$ExternalSyntheticLambda0
                        public final Object invoke(Object obj, Object obj2) {
                            return BookImageDisplayKt.BookImageDisplay$lambda$1(str, str2, modifier13, contentScale3, imageVector7, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    modifier2 = (Modifier) Modifier.Companion;
                }
                if (i4 != 0) {
                    fit = ContentScale.Companion.getFit();
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    book = BookKt.getBook(Icons.INSTANCE.getDefault());
                    modifier3 = modifier2;
                    contentScale2 = fit;
                } else {
                    contentScale2 = fit;
                    book = imageVector2;
                    modifier3 = modifier2;
                }
            } else {
                if (i7 != 0) {
                    modifier2 = (Modifier) Modifier.Companion;
                }
                if (i4 != 0) {
                    fit = ContentScale.Companion.getFit();
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    book = BookKt.getBook(Icons.INSTANCE.getDefault());
                    modifier3 = modifier2;
                    contentScale2 = fit;
                } else {
                    contentScale2 = fit;
                    book = imageVector2;
                    modifier3 = modifier2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-777337130, i3, -1, "com.example.ui.screens.BookImageDisplay (BookImageDisplay.kt:36)");
            }
            str3 = str;
            if (str3 != null) {
            }
            contentScale3 = contentScale2;
            composerStartRestartGroup.startReplaceGroup(813503854);
            ComposerKt.sourceInformation(composerStartRestartGroup, "39@1494L11,38@1432L511");
            Modifier modifier14 = BackgroundKt.background-bw27NRU$default(modifier3, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), (Shape) null, 2, (Object) null);
            Alignment center5 = Alignment.Companion.getCenter();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(center5, false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier14);
            constructor = ComposeUiNode.Companion.getConstructor();
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
            composer2 = Updater.constructor-impl(composerStartRestartGroup);
            Updater.set-impl(composer2, measurePolicyMaybeCachedBoxMeasurePolicy5, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer2, currentCompositionLocalMap5, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (!composer2.getInserting()) {
                composer2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composer2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            } else {
                composer2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composer2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.set-impl(composer2, modifierMaterializeModifier5, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScope boxScope5 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -789098214, "C:BookImageDisplay.kt#2thlc2");
            if (book != null) {
                imageVector3 = book;
                composerStartRestartGroup.startReplaceGroup(-790691925);
            } else {
                composerStartRestartGroup.startReplaceGroup(-789070346);
                ComposerKt.sourceInformation(composerStartRestartGroup, "46@1801L11,43@1642L277");
                int i11 = ((i3 >> 12) & 14) | 384 | (i3 & 112);
                imageVector3 = book;
                IconKt.Icon-ww6aTOc(imageVector3, str2, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(36.0f)), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null), composerStartRestartGroup, i11, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final ImageVector imageVector8 = imageVector3;
                final Modifier modifier15 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.BookImageDisplayKt$$ExternalSyntheticLambda0
                    public final Object invoke(Object obj, Object obj2) {
                        return BookImageDisplayKt.BookImageDisplay$lambda$1(str, str2, modifier15, contentScale3, imageVector8, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
            scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup2 != null) {
                scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.example.ui.screens.BookImageDisplayKt$$ExternalSyntheticLambda1
                    public final Object invoke(Object obj, Object obj2) {
                        return BookImageDisplayKt.BookImageDisplay$lambda$4(str, str2, modifier4, contentScale5, imageVector4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 384;
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                fit = contentScale;
                if (composerStartRestartGroup.changed(fit)) {
                    i5 = 2048;
                } else {
                    i5 = UserVerificationMethods.USER_VERIFY_ALL;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    imageVector2 = imageVector;
                    if (composerStartRestartGroup.changed(imageVector2)) {
                        i6 = 16384;
                    }
                    i3 |= i6;
                } else {
                    imageVector2 = imageVector;
                }
                i6 = FragmentTransaction.TRANSIT_EXIT_MASK;
                i3 |= i6;
            } else {
                imageVector2 = imageVector;
            }
            if ((i3 & 9363) != 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        modifier2 = (Modifier) Modifier.Companion;
                    }
                    if (i4 != 0) {
                        fit = ContentScale.Companion.getFit();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        book = BookKt.getBook(Icons.INSTANCE.getDefault());
                        modifier3 = modifier2;
                        contentScale2 = fit;
                    } else {
                        contentScale2 = fit;
                        book = imageVector2;
                        modifier3 = modifier2;
                    }
                } else {
                    if (i7 != 0) {
                        modifier2 = (Modifier) Modifier.Companion;
                    }
                    if (i4 != 0) {
                        fit = ContentScale.Companion.getFit();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        book = BookKt.getBook(Icons.INSTANCE.getDefault());
                        modifier3 = modifier2;
                        contentScale2 = fit;
                    } else {
                        contentScale2 = fit;
                        book = imageVector2;
                        modifier3 = modifier2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-777337130, i3, -1, "com.example.ui.screens.BookImageDisplay (BookImageDisplay.kt:36)");
                }
                str3 = str;
                if (str3 != null) {
                }
                contentScale3 = contentScale2;
                composerStartRestartGroup.startReplaceGroup(813503854);
                ComposerKt.sourceInformation(composerStartRestartGroup, "39@1494L11,38@1432L511");
                Modifier modifier16 = BackgroundKt.background-bw27NRU$default(modifier3, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), (Shape) null, 2, (Object) null);
                Alignment center6 = Alignment.Companion.getCenter();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(center6, false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier16);
                constructor = ComposeUiNode.Companion.getConstructor();
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
                composer2 = Updater.constructor-impl(composerStartRestartGroup);
                Updater.set-impl(composer2, measurePolicyMaybeCachedBoxMeasurePolicy6, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl(composer2, currentCompositionLocalMap6, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (!composer2.getInserting()) {
                    composer2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composer2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                } else {
                    composer2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composer2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.set-impl(composer2, modifierMaterializeModifier6, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScope boxScope6 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -789098214, "C:BookImageDisplay.kt#2thlc2");
                if (book != null) {
                    imageVector3 = book;
                    composerStartRestartGroup.startReplaceGroup(-790691925);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-789070346);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "46@1801L11,43@1642L277");
                    int i12 = ((i3 >> 12) & 14) | 384 | (i3 & 112);
                    imageVector3 = book;
                    IconKt.Icon-ww6aTOc(imageVector3, str2, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(36.0f)), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null), composerStartRestartGroup, i12, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final ImageVector imageVector9 = imageVector3;
                    final Modifier modifier17 = modifier3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.BookImageDisplayKt$$ExternalSyntheticLambda0
                        public final Object invoke(Object obj, Object obj2) {
                            return BookImageDisplayKt.BookImageDisplay$lambda$1(str, str2, modifier17, contentScale3, imageVector9, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    modifier2 = (Modifier) Modifier.Companion;
                }
                if (i4 != 0) {
                    fit = ContentScale.Companion.getFit();
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    book = BookKt.getBook(Icons.INSTANCE.getDefault());
                    modifier3 = modifier2;
                    contentScale2 = fit;
                } else {
                    contentScale2 = fit;
                    book = imageVector2;
                    modifier3 = modifier2;
                }
            } else {
                if (i7 != 0) {
                    modifier2 = (Modifier) Modifier.Companion;
                }
                if (i4 != 0) {
                    fit = ContentScale.Companion.getFit();
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    book = BookKt.getBook(Icons.INSTANCE.getDefault());
                    modifier3 = modifier2;
                    contentScale2 = fit;
                } else {
                    contentScale2 = fit;
                    book = imageVector2;
                    modifier3 = modifier2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-777337130, i3, -1, "com.example.ui.screens.BookImageDisplay (BookImageDisplay.kt:36)");
            }
            str3 = str;
            if (str3 != null) {
            }
            contentScale3 = contentScale2;
            composerStartRestartGroup.startReplaceGroup(813503854);
            ComposerKt.sourceInformation(composerStartRestartGroup, "39@1494L11,38@1432L511");
            Modifier modifier18 = BackgroundKt.background-bw27NRU$default(modifier3, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), (Shape) null, 2, (Object) null);
            Alignment center7 = Alignment.Companion.getCenter();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy7 = BoxKt.maybeCachedBoxMeasurePolicy(center7, false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier18);
            constructor = ComposeUiNode.Companion.getConstructor();
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
            composer2 = Updater.constructor-impl(composerStartRestartGroup);
            Updater.set-impl(composer2, measurePolicyMaybeCachedBoxMeasurePolicy7, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer2, currentCompositionLocalMap7, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (!composer2.getInserting()) {
                composer2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composer2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            } else {
                composer2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composer2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.set-impl(composer2, modifierMaterializeModifier7, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScope boxScope7 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -789098214, "C:BookImageDisplay.kt#2thlc2");
            if (book != null) {
                imageVector3 = book;
                composerStartRestartGroup.startReplaceGroup(-790691925);
            } else {
                composerStartRestartGroup.startReplaceGroup(-789070346);
                ComposerKt.sourceInformation(composerStartRestartGroup, "46@1801L11,43@1642L277");
                int i13 = ((i3 >> 12) & 14) | 384 | (i3 & 112);
                imageVector3 = book;
                IconKt.Icon-ww6aTOc(imageVector3, str2, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(36.0f)), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null), composerStartRestartGroup, i13, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final ImageVector imageVector10 = imageVector3;
                final Modifier modifier19 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.BookImageDisplayKt$$ExternalSyntheticLambda0
                    public final Object invoke(Object obj, Object obj2) {
                        return BookImageDisplayKt.BookImageDisplay$lambda$1(str, str2, modifier19, contentScale3, imageVector10, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
            scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup2 != null) {
                scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.example.ui.screens.BookImageDisplayKt$$ExternalSyntheticLambda1
                    public final Object invoke(Object obj, Object obj2) {
                        return BookImageDisplayKt.BookImageDisplay$lambda$4(str, str2, modifier4, contentScale5, imageVector4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 3072;
        fit = contentScale;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                imageVector2 = imageVector;
                if (composerStartRestartGroup.changed(imageVector2)) {
                    i6 = 16384;
                }
                i3 |= i6;
            } else {
                imageVector2 = imageVector;
            }
            i6 = FragmentTransaction.TRANSIT_EXIT_MASK;
            i3 |= i6;
        } else {
            imageVector2 = imageVector;
        }
        if ((i3 & 9363) != 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    modifier2 = (Modifier) Modifier.Companion;
                }
                if (i4 != 0) {
                    fit = ContentScale.Companion.getFit();
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    book = BookKt.getBook(Icons.INSTANCE.getDefault());
                    modifier3 = modifier2;
                    contentScale2 = fit;
                } else {
                    contentScale2 = fit;
                    book = imageVector2;
                    modifier3 = modifier2;
                }
            } else {
                if (i7 != 0) {
                    modifier2 = (Modifier) Modifier.Companion;
                }
                if (i4 != 0) {
                    fit = ContentScale.Companion.getFit();
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    book = BookKt.getBook(Icons.INSTANCE.getDefault());
                    modifier3 = modifier2;
                    contentScale2 = fit;
                } else {
                    contentScale2 = fit;
                    book = imageVector2;
                    modifier3 = modifier2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-777337130, i3, -1, "com.example.ui.screens.BookImageDisplay (BookImageDisplay.kt:36)");
            }
            str3 = str;
            if (str3 != null) {
            }
            contentScale3 = contentScale2;
            composerStartRestartGroup.startReplaceGroup(813503854);
            ComposerKt.sourceInformation(composerStartRestartGroup, "39@1494L11,38@1432L511");
            Modifier modifier110 = BackgroundKt.background-bw27NRU$default(modifier3, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), (Shape) null, 2, (Object) null);
            Alignment center8 = Alignment.Companion.getCenter();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy8 = BoxKt.maybeCachedBoxMeasurePolicy(center8, false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier110);
            constructor = ComposeUiNode.Companion.getConstructor();
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
            composer2 = Updater.constructor-impl(composerStartRestartGroup);
            Updater.set-impl(composer2, measurePolicyMaybeCachedBoxMeasurePolicy8, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer2, currentCompositionLocalMap8, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (!composer2.getInserting()) {
                composer2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composer2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            } else {
                composer2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composer2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.set-impl(composer2, modifierMaterializeModifier8, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScope boxScope8 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -789098214, "C:BookImageDisplay.kt#2thlc2");
            if (book != null) {
                imageVector3 = book;
                composerStartRestartGroup.startReplaceGroup(-790691925);
            } else {
                composerStartRestartGroup.startReplaceGroup(-789070346);
                ComposerKt.sourceInformation(composerStartRestartGroup, "46@1801L11,43@1642L277");
                int i14 = ((i3 >> 12) & 14) | 384 | (i3 & 112);
                imageVector3 = book;
                IconKt.Icon-ww6aTOc(imageVector3, str2, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(36.0f)), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null), composerStartRestartGroup, i14, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final ImageVector imageVector11 = imageVector3;
                final Modifier modifier111 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.BookImageDisplayKt$$ExternalSyntheticLambda0
                    public final Object invoke(Object obj, Object obj2) {
                        return BookImageDisplayKt.BookImageDisplay$lambda$1(str, str2, modifier111, contentScale3, imageVector11, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        composerStartRestartGroup.startDefaults();
        if ((i & 1) != 0) {
            if (i7 != 0) {
                modifier2 = (Modifier) Modifier.Companion;
            }
            if (i4 != 0) {
                fit = ContentScale.Companion.getFit();
            }
            if ((i2 & 16) != 0) {
                i3 &= -57345;
                book = BookKt.getBook(Icons.INSTANCE.getDefault());
                modifier3 = modifier2;
                contentScale2 = fit;
            } else {
                contentScale2 = fit;
                book = imageVector2;
                modifier3 = modifier2;
            }
        } else {
            if (i7 != 0) {
                modifier2 = (Modifier) Modifier.Companion;
            }
            if (i4 != 0) {
                fit = ContentScale.Companion.getFit();
            }
            if ((i2 & 16) != 0) {
                i3 &= -57345;
                book = BookKt.getBook(Icons.INSTANCE.getDefault());
                modifier3 = modifier2;
                contentScale2 = fit;
            } else {
                contentScale2 = fit;
                book = imageVector2;
                modifier3 = modifier2;
            }
        }
        composerStartRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-777337130, i3, -1, "com.example.ui.screens.BookImageDisplay (BookImageDisplay.kt:36)");
        }
        str3 = str;
        if (str3 != null) {
        }
        contentScale3 = contentScale2;
        composerStartRestartGroup.startReplaceGroup(813503854);
        ComposerKt.sourceInformation(composerStartRestartGroup, "39@1494L11,38@1432L511");
        Modifier modifier112 = BackgroundKt.background-bw27NRU$default(modifier3, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), (Shape) null, 2, (Object) null);
        Alignment center9 = Alignment.Companion.getCenter();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy9 = BoxKt.maybeCachedBoxMeasurePolicy(center9, false);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier112);
        constructor = ComposeUiNode.Companion.getConstructor();
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
        composer2 = Updater.constructor-impl(composerStartRestartGroup);
        Updater.set-impl(composer2, measurePolicyMaybeCachedBoxMeasurePolicy9, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.set-impl(composer2, currentCompositionLocalMap9, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (!composer2.getInserting()) {
            composer2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composer2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        } else {
            composer2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composer2.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.set-impl(composer2, modifierMaterializeModifier9, ComposeUiNode.Companion.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScope boxScope9 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -789098214, "C:BookImageDisplay.kt#2thlc2");
        if (book != null) {
            imageVector3 = book;
            composerStartRestartGroup.startReplaceGroup(-790691925);
        } else {
            composerStartRestartGroup.startReplaceGroup(-789070346);
            ComposerKt.sourceInformation(composerStartRestartGroup, "46@1801L11,43@1642L277");
            int i15 = ((i3 >> 12) & 14) | 384 | (i3 & 112);
            imageVector3 = book;
            IconKt.Icon-ww6aTOc(imageVector3, str2, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(36.0f)), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null), composerStartRestartGroup, i15, 0);
        }
        composerStartRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        composerStartRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        composerStartRestartGroup.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final ImageVector imageVector12 = imageVector3;
            final Modifier modifier113 = modifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.BookImageDisplayKt$$ExternalSyntheticLambda0
                public final Object invoke(Object obj, Object obj2) {
                    return BookImageDisplayKt.BookImageDisplay$lambda$1(str, str2, modifier113, contentScale3, imageVector12, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
            return;
        }
        return;
        scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.example.ui.screens.BookImageDisplayKt$$ExternalSyntheticLambda1
                public final Object invoke(Object obj, Object obj2) {
                    return BookImageDisplayKt.BookImageDisplay$lambda$4(str, str2, modifier4, contentScale5, imageVector4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
