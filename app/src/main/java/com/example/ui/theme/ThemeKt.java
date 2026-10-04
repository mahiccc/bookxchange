package com.example.ui.theme;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.DynamicTonalPaletteKt;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.material3.Shapes;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.view.WindowCompat;
import com.example.BuildConfig;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Theme.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"LightColorScheme", "Landroidx/compose/material3/ColorScheme;", "DarkColorScheme", "MyApplicationTheme", "", "darkTheme", "", "dynamicColor", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class ThemeKt {
    private static final ColorScheme DarkColorScheme;
    private static final ColorScheme LightColorScheme;

    static final Unit MyApplicationTheme$lambda$2(boolean z, boolean z2, Function2 function2, int i, int i2, Composer composer, int i3) {
        MyApplicationTheme(z, z2, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    static {
        long md_theme_light_primary = ColorKt.getMd_theme_light_primary();
        long md_theme_light_onPrimary = ColorKt.getMd_theme_light_onPrimary();
        long md_theme_light_primaryContainer = ColorKt.getMd_theme_light_primaryContainer();
        long md_theme_light_onPrimaryContainer = ColorKt.getMd_theme_light_onPrimaryContainer();
        long md_theme_light_secondary = ColorKt.getMd_theme_light_secondary();
        long md_theme_light_onSecondary = ColorKt.getMd_theme_light_onSecondary();
        long md_theme_light_secondaryContainer = ColorKt.getMd_theme_light_secondaryContainer();
        long md_theme_light_onSecondaryContainer = ColorKt.getMd_theme_light_onSecondaryContainer();
        long md_theme_light_tertiary = ColorKt.getMd_theme_light_tertiary();
        long md_theme_light_onTertiary = ColorKt.getMd_theme_light_onTertiary();
        long md_theme_light_tertiaryContainer = ColorKt.getMd_theme_light_tertiaryContainer();
        long md_theme_light_onTertiaryContainer = ColorKt.getMd_theme_light_onTertiaryContainer();
        long md_theme_light_error = ColorKt.getMd_theme_light_error();
        long md_theme_light_errorContainer = ColorKt.getMd_theme_light_errorContainer();
        long md_theme_light_onError = ColorKt.getMd_theme_light_onError();
        long md_theme_light_onErrorContainer = ColorKt.getMd_theme_light_onErrorContainer();
        long md_theme_light_background = ColorKt.getMd_theme_light_background();
        long md_theme_light_onBackground = ColorKt.getMd_theme_light_onBackground();
        long md_theme_light_surface = ColorKt.getMd_theme_light_surface();
        long md_theme_light_onSurface = ColorKt.getMd_theme_light_onSurface();
        long md_theme_light_surfaceVariant = ColorKt.getMd_theme_light_surfaceVariant();
        long md_theme_light_onSurfaceVariant = ColorKt.getMd_theme_light_onSurfaceVariant();
        long md_theme_light_outline = ColorKt.getMd_theme_light_outline();
        long md_theme_light_inverseOnSurface = ColorKt.getMd_theme_light_inverseOnSurface();
        LightColorScheme = ColorSchemeKt.lightColorScheme-C-Xl9yA$default(md_theme_light_primary, md_theme_light_onPrimary, md_theme_light_primaryContainer, md_theme_light_onPrimaryContainer, ColorKt.getMd_theme_light_inversePrimary(), md_theme_light_secondary, md_theme_light_onSecondary, md_theme_light_secondaryContainer, md_theme_light_onSecondaryContainer, md_theme_light_tertiary, md_theme_light_onTertiary, md_theme_light_tertiaryContainer, md_theme_light_onTertiaryContainer, md_theme_light_background, md_theme_light_onBackground, md_theme_light_surface, md_theme_light_onSurface, md_theme_light_surfaceVariant, md_theme_light_onSurfaceVariant, ColorKt.getMd_theme_light_surfaceTint(), ColorKt.getMd_theme_light_inverseSurface(), md_theme_light_inverseOnSurface, md_theme_light_error, md_theme_light_onError, md_theme_light_errorContainer, md_theme_light_onErrorContainer, md_theme_light_outline, ColorKt.getMd_theme_light_outlineVariant(), ColorKt.getMd_theme_light_scrim(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 15, (Object) null);
        long md_theme_dark_primary = ColorKt.getMd_theme_dark_primary();
        long md_theme_dark_onPrimary = ColorKt.getMd_theme_dark_onPrimary();
        long md_theme_dark_primaryContainer = ColorKt.getMd_theme_dark_primaryContainer();
        long md_theme_dark_onPrimaryContainer = ColorKt.getMd_theme_dark_onPrimaryContainer();
        long md_theme_dark_secondary = ColorKt.getMd_theme_dark_secondary();
        long md_theme_dark_onSecondary = ColorKt.getMd_theme_dark_onSecondary();
        long md_theme_dark_secondaryContainer = ColorKt.getMd_theme_dark_secondaryContainer();
        long md_theme_dark_onSecondaryContainer = ColorKt.getMd_theme_dark_onSecondaryContainer();
        long md_theme_dark_tertiary = ColorKt.getMd_theme_dark_tertiary();
        long md_theme_dark_onTertiary = ColorKt.getMd_theme_dark_onTertiary();
        long md_theme_dark_tertiaryContainer = ColorKt.getMd_theme_dark_tertiaryContainer();
        long md_theme_dark_onTertiaryContainer = ColorKt.getMd_theme_dark_onTertiaryContainer();
        long md_theme_dark_error = ColorKt.getMd_theme_dark_error();
        long md_theme_dark_errorContainer = ColorKt.getMd_theme_dark_errorContainer();
        long md_theme_dark_onError = ColorKt.getMd_theme_dark_onError();
        long md_theme_dark_onErrorContainer = ColorKt.getMd_theme_dark_onErrorContainer();
        long md_theme_dark_background = ColorKt.getMd_theme_dark_background();
        long md_theme_dark_onBackground = ColorKt.getMd_theme_dark_onBackground();
        long md_theme_dark_surface = ColorKt.getMd_theme_dark_surface();
        long md_theme_dark_onSurface = ColorKt.getMd_theme_dark_onSurface();
        long md_theme_dark_surfaceVariant = ColorKt.getMd_theme_dark_surfaceVariant();
        long md_theme_dark_onSurfaceVariant = ColorKt.getMd_theme_dark_onSurfaceVariant();
        long md_theme_dark_outline = ColorKt.getMd_theme_dark_outline();
        long md_theme_dark_inverseOnSurface = ColorKt.getMd_theme_dark_inverseOnSurface();
        DarkColorScheme = ColorSchemeKt.darkColorScheme-C-Xl9yA$default(md_theme_dark_primary, md_theme_dark_onPrimary, md_theme_dark_primaryContainer, md_theme_dark_onPrimaryContainer, ColorKt.getMd_theme_dark_inversePrimary(), md_theme_dark_secondary, md_theme_dark_onSecondary, md_theme_dark_secondaryContainer, md_theme_dark_onSecondaryContainer, md_theme_dark_tertiary, md_theme_dark_onTertiary, md_theme_dark_tertiaryContainer, md_theme_dark_onTertiaryContainer, md_theme_dark_background, md_theme_dark_onBackground, md_theme_dark_surface, md_theme_dark_onSurface, md_theme_dark_surfaceVariant, md_theme_dark_onSurfaceVariant, ColorKt.getMd_theme_dark_surfaceTint(), ColorKt.getMd_theme_dark_inverseSurface(), md_theme_dark_inverseOnSurface, md_theme_dark_error, md_theme_dark_onError, md_theme_dark_errorContainer, md_theme_dark_onErrorContainer, md_theme_dark_outline, ColorKt.getMd_theme_dark_outlineVariant(), ColorKt.getMd_theme_dark_scrim(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 15, (Object) null);
    }

    public static final void MyApplicationTheme(final boolean z, boolean z2, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        ColorScheme colorSchemeDynamicDarkColorScheme;
        Intrinsics.checkNotNullParameter(function2, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(548420513);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(MyApplicationTheme)P(1,2)97@4111L7,106@4421L114:Theme.kt#75kw8w");
        if ((i & 6) == 0) {
            i3 = (((i2 & 1) == 0 && composerStartRestartGroup.changed(z)) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i3 & BuildConfig.VERSION_CODE) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            ComposerKt.sourceInformation(composerStartRestartGroup, "83@3603L21");
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 1) != 0) {
                    z = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                    i3 &= -15;
                }
                if (i4 != 0) {
                    z2 = false;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(548420513, i3, -1, "com.example.ui.theme.MyApplicationTheme (Theme.kt:87)");
            }
            if (z2 && Build.VERSION.SDK_INT >= 31) {
                composerStartRestartGroup.startReplaceGroup(-59777882);
                ComposerKt.sourceInformation(composerStartRestartGroup, "90@3894L7");
                CompositionLocal localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composerStartRestartGroup.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                Context context = (Context) objConsume;
                colorSchemeDynamicDarkColorScheme = z ? DynamicTonalPaletteKt.dynamicDarkColorScheme(context) : DynamicTonalPaletteKt.dynamicLightColorScheme(context);
                composerStartRestartGroup.endReplaceGroup();
            } else if (z) {
                composerStartRestartGroup.startReplaceGroup(-1248848752);
                composerStartRestartGroup.endReplaceGroup();
                colorSchemeDynamicDarkColorScheme = DarkColorScheme;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1248847727);
                composerStartRestartGroup.endReplaceGroup();
                colorSchemeDynamicDarkColorScheme = LightColorScheme;
            }
            CompositionLocal localView = AndroidCompositionLocals_androidKt.getLocalView();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composerStartRestartGroup.consume(localView);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final View view = (View) objConsume2;
            if (view.isInEditMode()) {
                composerStartRestartGroup.startReplaceGroup(-63605855);
            } else {
                composerStartRestartGroup.startReplaceGroup(-59482731);
                ComposerKt.sourceInformation(composerStartRestartGroup, "99@4168L241,99@4157L252");
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1248844142, "CC(remember):Theme.kt#9igjgp");
                boolean zChangedInstance = ((((i3 & 14) ^ 6) > 4 && composerStartRestartGroup.changed(z)) || (i3 & 6) == 4) | composerStartRestartGroup.changedInstance(view);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.example.ui.theme.ThemeKt$$ExternalSyntheticLambda0
                        public final Object invoke() {
                            return ThemeKt.MyApplicationTheme$lambda$1$lambda$0(view, z);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                EffectsKt.SideEffect((Function0) objRememberedValue, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            MaterialThemeKt.MaterialTheme(colorSchemeDynamicDarkColorScheme, (Shapes) null, TypeKt.getTypography(), function2, composerStartRestartGroup, ((i3 << 3) & 7168) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final boolean z3 = z;
        final boolean z4 = z2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.example.ui.theme.ThemeKt$$ExternalSyntheticLambda1
                public final Object invoke(Object obj, Object obj2) {
                    return ThemeKt.MyApplicationTheme$lambda$2(z3, z4, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final Unit MyApplicationTheme$lambda$1$lambda$0(View view, boolean z) {
        Context context = view.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
        Window window = ((Activity) context).getWindow();
        window.setStatusBarColor(0);
        WindowCompat.getInsetsController(window, view).setAppearanceLightStatusBars(!z);
        return Unit.INSTANCE;
    }
}
