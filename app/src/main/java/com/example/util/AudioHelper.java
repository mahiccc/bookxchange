package com.example.util;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: AudioHelper.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u000bJ\u000e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\u000bR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/example/util/AudioHelper;", "Landroid/speech/tts/TextToSpeech$OnInitListener;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "tts", "Landroid/speech/tts/TextToSpeech;", "isInitialized", "", "onInit", "", "status", "", "isSpeaking", "()Z", "speak", "text", "", "stop", "toggle", "shutdown", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AudioHelper implements TextToSpeech.OnInitListener {
    public static final int $stable = 8;
    private boolean isInitialized;
    private TextToSpeech tts;

    public AudioHelper(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.tts = new TextToSpeech(context.getApplicationContext(), this);
    }

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public void onInit(int status) {
        if (status == 0) {
            TextToSpeech textToSpeech = this.tts;
            if (textToSpeech != null) {
                textToSpeech.setLanguage(Locale.getDefault());
            }
            this.isInitialized = true;
        }
    }

    public final boolean isSpeaking() {
        TextToSpeech textToSpeech = this.tts;
        return textToSpeech != null && textToSpeech.isSpeaking();
    }

    public final void speak(String text) {
        TextToSpeech textToSpeech;
        Intrinsics.checkNotNullParameter(text, "text");
        if (this.isInitialized) {
            String str = text;
            if (StringsKt.isBlank(str) || (textToSpeech = this.tts) == null) {
                return;
            }
            textToSpeech.speak(str, 0, null, "BookXchange_TTS_" + System.currentTimeMillis());
        }
    }

    public final void stop() {
        TextToSpeech textToSpeech = this.tts;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
    }

    public final void toggle(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        TextToSpeech textToSpeech = this.tts;
        if (textToSpeech != null && textToSpeech.isSpeaking()) {
            stop();
        } else {
            speak(text);
        }
    }

    public final void shutdown() {
        TextToSpeech textToSpeech = this.tts;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
        TextToSpeech textToSpeech2 = this.tts;
        if (textToSpeech2 != null) {
            textToSpeech2.shutdown();
        }
        this.tts = null;
        this.isInitialized = false;
    }
}
