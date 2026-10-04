.class public final Lcom/example/ui/theme/ThemeKt;
.super Ljava/lang/Object;
.source "Theme.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Theme.kt\ncom/example/ui/theme/ThemeKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,113:1\n77#2:114\n77#2:115\n1225#3,6:116\n*S KotlinDebug\n*F\n+ 1 Theme.kt\ncom/example/ui/theme/ThemeKt\n*L\n91#1:114\n98#1:115\n100#1:116,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a4\u0010\u0003\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0011\u0010\u0008\u001a\r\u0012\u0004\u0012\u00020\u00040\t\u00a2\u0006\u0002\u0008\nH\u0007\u00a2\u0006\u0002\u0010\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "LightColorScheme",
        "Landroidx/compose/material3/ColorScheme;",
        "DarkColorScheme",
        "MyApplicationTheme",
        "",
        "darkTheme",
        "",
        "dynamicColor",
        "content",
        "Lkotlin/Function0;",
        "Landroidx/compose/runtime/Composable;",
        "(ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V",
        "app"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final DarkColorScheme:Landroidx/compose/material3/ColorScheme;

.field private static final LightColorScheme:Landroidx/compose/material3/ColorScheme;


# direct methods
.method static constructor <clinit>()V
    .locals 76

    .line 19
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_light_primary()J

    move-result-wide v1

    .line 20
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_light_onPrimary()J

    move-result-wide v3

    .line 21
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_light_primaryContainer()J

    move-result-wide v5

    .line 22
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_light_onPrimaryContainer()J

    move-result-wide v7

    .line 23
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_light_secondary()J

    move-result-wide v11

    .line 24
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_light_onSecondary()J

    move-result-wide v13

    .line 25
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_light_secondaryContainer()J

    move-result-wide v15

    .line 26
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_light_onSecondaryContainer()J

    move-result-wide v17

    .line 27
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_light_tertiary()J

    move-result-wide v19

    .line 28
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_light_onTertiary()J

    move-result-wide v21

    .line 29
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_light_tertiaryContainer()J

    move-result-wide v23

    .line 30
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_light_onTertiaryContainer()J

    move-result-wide v25

    .line 31
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_light_error()J

    move-result-wide v45

    .line 32
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_light_errorContainer()J

    move-result-wide v49

    .line 33
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_light_onError()J

    move-result-wide v47

    .line 34
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_light_onErrorContainer()J

    move-result-wide v51

    .line 35
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_light_background()J

    move-result-wide v27

    .line 36
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_light_onBackground()J

    move-result-wide v29

    .line 37
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_light_surface()J

    move-result-wide v31

    .line 38
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_light_onSurface()J

    move-result-wide v33

    .line 39
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_light_surfaceVariant()J

    move-result-wide v35

    .line 40
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_light_onSurfaceVariant()J

    move-result-wide v37

    .line 41
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_light_outline()J

    move-result-wide v53

    .line 42
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_light_inverseOnSurface()J

    move-result-wide v43

    .line 43
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_light_inverseSurface()J

    move-result-wide v41

    .line 44
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_light_inversePrimary()J

    move-result-wide v9

    .line 45
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_light_surfaceTint()J

    move-result-wide v39

    .line 46
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_light_outlineVariant()J

    move-result-wide v55

    .line 47
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_light_scrim()J

    move-result-wide v57

    const/16 v74, 0xf

    const/16 v75, 0x0

    const-wide/16 v59, 0x0

    const-wide/16 v61, 0x0

    const-wide/16 v63, 0x0

    const-wide/16 v65, 0x0

    const-wide/16 v67, 0x0

    const-wide/16 v69, 0x0

    const-wide/16 v71, 0x0

    const/high16 v73, -0x20000000

    .line 18
    invoke-static/range {v1 .. v75}, Landroidx/compose/material3/ColorSchemeKt;->lightColorScheme-C-Xl9yA$default(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJIILjava/lang/Object;)Landroidx/compose/material3/ColorScheme;

    move-result-object v0

    sput-object v0, Lcom/example/ui/theme/ThemeKt;->LightColorScheme:Landroidx/compose/material3/ColorScheme;

    .line 51
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_dark_primary()J

    move-result-wide v1

    .line 52
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_dark_onPrimary()J

    move-result-wide v3

    .line 53
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_dark_primaryContainer()J

    move-result-wide v5

    .line 54
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_dark_onPrimaryContainer()J

    move-result-wide v7

    .line 55
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_dark_secondary()J

    move-result-wide v11

    .line 56
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_dark_onSecondary()J

    move-result-wide v13

    .line 57
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_dark_secondaryContainer()J

    move-result-wide v15

    .line 58
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_dark_onSecondaryContainer()J

    move-result-wide v17

    .line 59
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_dark_tertiary()J

    move-result-wide v19

    .line 60
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_dark_onTertiary()J

    move-result-wide v21

    .line 61
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_dark_tertiaryContainer()J

    move-result-wide v23

    .line 62
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_dark_onTertiaryContainer()J

    move-result-wide v25

    .line 63
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_dark_error()J

    move-result-wide v45

    .line 64
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_dark_errorContainer()J

    move-result-wide v49

    .line 65
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_dark_onError()J

    move-result-wide v47

    .line 66
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_dark_onErrorContainer()J

    move-result-wide v51

    .line 67
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_dark_background()J

    move-result-wide v27

    .line 68
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_dark_onBackground()J

    move-result-wide v29

    .line 69
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_dark_surface()J

    move-result-wide v31

    .line 70
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_dark_onSurface()J

    move-result-wide v33

    .line 71
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_dark_surfaceVariant()J

    move-result-wide v35

    .line 72
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_dark_onSurfaceVariant()J

    move-result-wide v37

    .line 73
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_dark_outline()J

    move-result-wide v53

    .line 74
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_dark_inverseOnSurface()J

    move-result-wide v43

    .line 75
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_dark_inverseSurface()J

    move-result-wide v41

    .line 76
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_dark_inversePrimary()J

    move-result-wide v9

    .line 77
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_dark_surfaceTint()J

    move-result-wide v39

    .line 78
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_dark_outlineVariant()J

    move-result-wide v55

    .line 79
    invoke-static {}, Lcom/example/ui/theme/ColorKt;->getMd_theme_dark_scrim()J

    move-result-wide v57

    .line 50
    invoke-static/range {v1 .. v75}, Landroidx/compose/material3/ColorSchemeKt;->darkColorScheme-C-Xl9yA$default(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJIILjava/lang/Object;)Landroidx/compose/material3/ColorScheme;

    move-result-object v0

    sput-object v0, Lcom/example/ui/theme/ThemeKt;->DarkColorScheme:Landroidx/compose/material3/ColorScheme;

    return-void
.end method

.method public static final MyApplicationTheme(ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v4, p4

    const-string v0, "content"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x20b03ba1

    .line 88
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v9

    const-string p3, "C(MyApplicationTheme)P(1,2)97@4111L7,106@4421L114:Theme.kt#75kw8w"

    invoke-static {v9, p3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 p3, v4, 0x6

    const/4 v1, 0x4

    if-nez p3, :cond_1

    and-int/lit8 p3, p5, 0x1

    if-nez p3, :cond_0

    invoke-interface {v9, p0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result p3

    if-eqz p3, :cond_0

    move p3, v1

    goto :goto_0

    :cond_0
    const/4 p3, 0x2

    :goto_0
    or-int/2addr p3, v4

    goto :goto_1

    :cond_1
    move p3, v4

    :goto_1
    and-int/lit8 v2, p5, 0x2

    if-eqz v2, :cond_2

    or-int/lit8 p3, p3, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v3, v4, 0x30

    if-nez v3, :cond_4

    invoke-interface {v9, p1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v3, 0x20

    goto :goto_2

    :cond_3
    const/16 v3, 0x10

    :goto_2
    or-int/2addr p3, v3

    :cond_4
    :goto_3
    and-int/lit16 v3, v4, 0x180

    if-nez v3, :cond_6

    invoke-interface {v9, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    const/16 v3, 0x100

    goto :goto_4

    :cond_5
    const/16 v3, 0x80

    :goto_4
    or-int/2addr p3, v3

    :cond_6
    and-int/lit16 v3, p3, 0x93

    const/16 v5, 0x92

    if-ne v3, v5, :cond_9

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v3

    if-nez v3, :cond_7

    goto :goto_6

    .line 82
    :cond_7
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    :cond_8
    :goto_5
    move v1, p0

    move v2, p1

    goto/16 :goto_d

    .line 88
    :cond_9
    :goto_6
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startDefaults()V

    const-string v3, "83@3603L21"

    invoke-static {v9, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v3, v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_b

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v3

    if-eqz v3, :cond_a

    goto :goto_7

    .line 82
    :cond_a
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v2, p5, 0x1

    if-eqz v2, :cond_d

    and-int/lit8 p3, p3, -0xf

    goto :goto_8

    :cond_b
    :goto_7
    and-int/lit8 v3, p5, 0x1

    if-eqz v3, :cond_c

    .line 84
    invoke-static {v9, v5}, Landroidx/compose/foundation/DarkThemeKt;->isSystemInDarkTheme(Landroidx/compose/runtime/Composer;I)Z

    move-result p0

    and-int/lit8 p3, p3, -0xf

    :cond_c
    if-eqz v2, :cond_d

    move p1, v5

    .line 82
    :cond_d
    :goto_8
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_e

    const/4 v2, -0x1

    const-string v3, "com.example.ui.theme.MyApplicationTheme (Theme.kt:87)"

    invoke-static {v0, p3, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 90
    :cond_e
    const-string v0, "CC:CompositionLocal.kt#9igjgp"

    const v2, 0x789c5f52

    if-eqz p1, :cond_10

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1f

    if-lt v3, v6, :cond_10

    const v3, -0x390235a

    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v3, "90@3894L7"

    invoke-static {v9, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 91
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v3

    check-cast v3, Landroidx/compose/runtime/CompositionLocal;

    .line 114
    invoke-static {v9, v2, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 91
    check-cast v3, Landroid/content/Context;

    if-eqz p0, :cond_f

    .line 92
    invoke-static {v3}, Landroidx/compose/material3/DynamicTonalPaletteKt;->dynamicDarkColorScheme(Landroid/content/Context;)Landroidx/compose/material3/ColorScheme;

    move-result-object v3

    goto :goto_9

    :cond_f
    invoke-static {v3}, Landroidx/compose/material3/DynamicTonalPaletteKt;->dynamicLightColorScheme(Landroid/content/Context;)Landroidx/compose/material3/ColorScheme;

    move-result-object v3

    .line 90
    :goto_9
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_a

    :cond_10
    if-eqz p0, :cond_11

    const v3, -0x4a6feb70

    .line 95
    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    sget-object v3, Lcom/example/ui/theme/ThemeKt;->DarkColorScheme:Landroidx/compose/material3/ColorScheme;

    goto :goto_a

    :cond_11
    const v3, -0x4a6fe76f

    .line 96
    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    sget-object v3, Lcom/example/ui/theme/ThemeKt;->LightColorScheme:Landroidx/compose/material3/ColorScheme;

    .line 98
    :goto_a
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalView()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v6

    check-cast v6, Landroidx/compose/runtime/CompositionLocal;

    .line 115
    invoke-static {v9, v2, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v9, v6}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 98
    check-cast v0, Landroid/view/View;

    .line 99
    invoke-virtual {v0}, Landroid/view/View;->isInEditMode()Z

    move-result v2

    if-nez v2, :cond_17

    const v2, -0x38ba26b

    invoke-interface {v9, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v2, "99@4168L241,99@4157L252"

    invoke-static {v9, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    const v2, -0x4a6fd96e

    const-string v6, "CC(remember):Theme.kt#9igjgp"

    .line 100
    invoke-static {v9, v2, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    and-int/lit8 v6, p3, 0xe

    xor-int/lit8 v6, v6, 0x6

    if-le v6, v1, :cond_12

    invoke-interface {v9, p0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v6

    if-nez v6, :cond_13

    :cond_12
    and-int/lit8 v6, p3, 0x6

    if-ne v6, v1, :cond_14

    :cond_13
    const/4 v1, 0x1

    goto :goto_b

    :cond_14
    move v1, v5

    :goto_b
    or-int/2addr v1, v2

    .line 116
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_15

    .line 117
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_16

    .line 100
    :cond_15
    new-instance v2, Lcom/example/ui/theme/ThemeKt$$ExternalSyntheticLambda0;

    invoke-direct {v2, v0, p0}, Lcom/example/ui/theme/ThemeKt$$ExternalSyntheticLambda0;-><init>(Landroid/view/View;Z)V

    .line 119
    invoke-interface {v9, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 100
    :cond_16
    check-cast v2, Lkotlin/jvm/functions/Function0;

    invoke-static {v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {v2, v9, v5}, Landroidx/compose/runtime/EffectsKt;->SideEffect(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    goto :goto_c

    :cond_17
    const v0, -0x3ca8c5f

    .line 99
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    :goto_c
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 109
    invoke-static {}, Lcom/example/ui/theme/TypeKt;->getTypography()Landroidx/compose/material3/Typography;

    move-result-object v7

    shl-int/lit8 p3, p3, 0x3

    and-int/lit16 p3, p3, 0x1c00

    or-int/lit16 v10, p3, 0x180

    const/4 v11, 0x2

    const/4 v6, 0x0

    move-object v8, p2

    move-object v5, v3

    .line 107
    invoke-static/range {v5 .. v11}, Landroidx/compose/material3/MaterialThemeKt;->MaterialTheme(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/Shapes;Landroidx/compose/material3/Typography;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p3

    if-eqz p3, :cond_8

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto/16 :goto_5

    .line 112
    :goto_d
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p0

    if-eqz p0, :cond_18

    new-instance v0, Lcom/example/ui/theme/ThemeKt$$ExternalSyntheticLambda1;

    move-object v3, p2

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/example/ui/theme/ThemeKt$$ExternalSyntheticLambda1;-><init>(ZZLkotlin/jvm/functions/Function2;II)V

    invoke-interface {p0, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_18
    return-void
.end method

.method static final MyApplicationTheme$lambda$1$lambda$0(Landroid/view/View;Z)Lkotlin/Unit;
    .locals 2

    .line 101
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.app.Activity"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    .line 102
    invoke-virtual {v0, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 103
    invoke-static {v0, p0}, Landroidx/core/view/WindowCompat;->getInsetsController(Landroid/view/Window;Landroid/view/View;)Landroidx/core/view/WindowInsetsControllerCompat;

    move-result-object p0

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, Landroidx/core/view/WindowInsetsControllerCompat;->setAppearanceLightStatusBars(Z)V

    .line 104
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method static final MyApplicationTheme$lambda$2(ZZLkotlin/jvm/functions/Function2;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v4

    move v0, p0

    move v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lcom/example/ui/theme/ThemeKt;->MyApplicationTheme(ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method
