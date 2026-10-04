package com.example.util;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AudioHelper.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"rememberAudioHelper", "Lcom/example/util/AudioHelper;", "(Landroidx/compose/runtime/Composer;I)Lcom/example/util/AudioHelper;", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class AudioHelperKt {
    public static final AudioHelper rememberAudioHelper(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -157030626, "C(rememberAudioHelper)51@1340L7,52@1365L33,53@1428L67,53@1403L92:AudioHelper.kt#dgmclv");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-157030626, i, -1, "com.example.util.rememberAudioHelper (AudioHelper.kt:50)");
        }
        CompositionLocal localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Context context = (Context) objConsume;
        ComposerKt.sourceInformationMarkerStart(composer, -582572705, "CC(remember):AudioHelper.kt#9igjgp");
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new AudioHelper(context);
            composer.updateRememberedValue(objRememberedValue);
        }
        final AudioHelper audioHelper = (AudioHelper) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, -582570655, "CC(remember):AudioHelper.kt#9igjgp");
        boolean zChangedInstance = composer.changedInstance(audioHelper);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.example.util.AudioHelperKt$$ExternalSyntheticLambda0
                public final Object invoke(Object obj) {
                    return AudioHelperKt.rememberAudioHelper$lambda$3$lambda$2(audioHelper, (DisposableEffectScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        EffectsKt.DisposableEffect(audioHelper, (Function1) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return audioHelper;
    }

    static final DisposableEffectResult rememberAudioHelper$lambda$3$lambda$2(final AudioHelper audioHelper, DisposableEffectScope disposableEffectScope) {
        Intrinsics.checkNotNullParameter(disposableEffectScope, "$this$DisposableEffect");
        return new DisposableEffectResult() { // from class: com.example.util.AudioHelperKt$rememberAudioHelper$lambda$3$lambda$2$$inlined$onDispose$1
            public void dispose() {
                audioHelper.shutdown();
            }
        };
    }
}
