package com.example.ui.screens;

import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.compose.runtime.MutableState;
import com.example.api.VolumeInfo;
import com.google.mlkit.vision.text.Text;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: CameraScreen.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.screens.CameraScreenKt$CameraScreen$processBitmapWithGemini$2", f = "CameraScreen.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {1300, 457, 585}, m = "invokeSuspend", n = {"inputImg", "barcodeScanner", "$i$f$suspendCancellableCoroutine", "apiKey", "googleBooksKey", "prompt", "requestBody", "apiKey", "googleBooksKey", "prompt", "result", "json", "extractedTitle", "extractedAuthor", "extractedDesc", "extractedGenre", "extractedPub", "extractedDate", "extractedLang", "extractedIsbn", "scannedCondition"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13"})
final class CameraScreenKt$CameraScreen$processBitmapWithGemini$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<String> $author$delegate;
    final /* synthetic */ MutableState<Double> $averageRating$delegate;
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ MutableState<String> $condition$delegate;
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ MutableState<String> $description$delegate;
    final /* synthetic */ MutableState<String> $detectedIsbn$delegate;
    final /* synthetic */ MutableState<String> $genre$delegate;
    final /* synthetic */ MutableState<List<VolumeInfo>> $googleBooksSearchResults$delegate;
    final /* synthetic */ MutableState<Boolean> $isEnrichedByExternalApis$delegate;
    final /* synthetic */ MutableState<Boolean> $isScanning$delegate;
    final /* synthetic */ MutableState<String> $language$delegate;
    final /* synthetic */ MutableState<String> $officialCoverUrl$delegate;
    final /* synthetic */ MutableState<Integer> $pageCount$delegate;
    final /* synthetic */ MutableState<String> $publishedDate$delegate;
    final /* synthetic */ MutableState<String> $publisher$delegate;
    final /* synthetic */ MutableState<String> $scanError$delegate;
    final /* synthetic */ MutableState<String> $scanStatusMessage$delegate;
    final /* synthetic */ MutableState<String> $title$delegate;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraScreenKt$CameraScreen$processBitmapWithGemini$2(Bitmap bitmap, MutableState<String> mutableState, MutableState<String> mutableState2, CoroutineScope coroutineScope, MutableState<String> mutableState3, MutableState<String> mutableState4, MutableState<String> mutableState5, MutableState<String> mutableState6, MutableState<String> mutableState7, MutableState<String> mutableState8, MutableState<Integer> mutableState9, MutableState<String> mutableState10, MutableState<Double> mutableState11, MutableState<String> mutableState12, MutableState<List<VolumeInfo>> mutableState13, MutableState<Boolean> mutableState14, MutableState<Boolean> mutableState15, MutableState<String> mutableState16, MutableState<String> mutableState17, Continuation<? super CameraScreenKt$CameraScreen$processBitmapWithGemini$2> continuation) {
        super(2, continuation);
        this.$bitmap = bitmap;
        this.$detectedIsbn$delegate = mutableState;
        this.$scanStatusMessage$delegate = mutableState2;
        this.$coroutineScope = coroutineScope;
        this.$title$delegate = mutableState3;
        this.$author$delegate = mutableState4;
        this.$description$delegate = mutableState5;
        this.$genre$delegate = mutableState6;
        this.$publisher$delegate = mutableState7;
        this.$publishedDate$delegate = mutableState8;
        this.$pageCount$delegate = mutableState9;
        this.$language$delegate = mutableState10;
        this.$averageRating$delegate = mutableState11;
        this.$officialCoverUrl$delegate = mutableState12;
        this.$googleBooksSearchResults$delegate = mutableState13;
        this.$isEnrichedByExternalApis$delegate = mutableState14;
        this.$isScanning$delegate = mutableState15;
        this.$condition$delegate = mutableState16;
        this.$scanError$delegate = mutableState17;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CameraScreenKt$CameraScreen$processBitmapWithGemini$2(this.$bitmap, this.$detectedIsbn$delegate, this.$scanStatusMessage$delegate, this.$coroutineScope, this.$title$delegate, this.$author$delegate, this.$description$delegate, this.$genre$delegate, this.$publisher$delegate, this.$publishedDate$delegate, this.$pageCount$delegate, this.$language$delegate, this.$averageRating$delegate, this.$officialCoverUrl$delegate, this.$googleBooksSearchResults$delegate, this.$isEnrichedByExternalApis$delegate, this.$isScanning$delegate, this.$condition$delegate, this.$scanError$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:110:0x0390 A[Catch: all -> 0x005a, Exception -> 0x0632, TRY_ENTER, TRY_LEAVE, TryCatch #7 {Exception -> 0x0632, blocks: (B:8:0x0055, B:110:0x0390, B:114:0x043d, B:116:0x0443, B:118:0x0449, B:119:0x044e, B:121:0x0457, B:123:0x045e, B:125:0x0464, B:126:0x0469, B:128:0x0472, B:130:0x0479, B:132:0x047f, B:133:0x0484, B:135:0x048d, B:137:0x0494, B:139:0x049a, B:140:0x049f, B:142:0x04a8, B:144:0x04af, B:146:0x04b5, B:147:0x04ba, B:149:0x04c3, B:151:0x04ca, B:153:0x04d0, B:154:0x04d5, B:156:0x04de, B:158:0x04e5, B:160:0x04eb, B:161:0x04f0, B:163:0x04f9, B:165:0x0500, B:167:0x0506, B:169:0x0510, B:171:0x0516, B:172:0x051b, B:173:0x053d, B:191:0x0570, B:195:0x05ba, B:175:0x0541, B:179:0x054d, B:182:0x0556, B:186:0x0562), top: B:214:0x0015, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x043c  */
    /* JADX WARN: Code duplicated, block: B:121:0x0457 A[Catch: all -> 0x005a, Exception -> 0x0632, TryCatch #7 {Exception -> 0x0632, blocks: (B:8:0x0055, B:110:0x0390, B:114:0x043d, B:116:0x0443, B:118:0x0449, B:119:0x044e, B:121:0x0457, B:123:0x045e, B:125:0x0464, B:126:0x0469, B:128:0x0472, B:130:0x0479, B:132:0x047f, B:133:0x0484, B:135:0x048d, B:137:0x0494, B:139:0x049a, B:140:0x049f, B:142:0x04a8, B:144:0x04af, B:146:0x04b5, B:147:0x04ba, B:149:0x04c3, B:151:0x04ca, B:153:0x04d0, B:154:0x04d5, B:156:0x04de, B:158:0x04e5, B:160:0x04eb, B:161:0x04f0, B:163:0x04f9, B:165:0x0500, B:167:0x0506, B:169:0x0510, B:171:0x0516, B:172:0x051b, B:173:0x053d, B:191:0x0570, B:195:0x05ba, B:175:0x0541, B:179:0x054d, B:182:0x0556, B:186:0x0562), top: B:214:0x0015, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x0472 A[Catch: all -> 0x005a, Exception -> 0x0632, TryCatch #7 {Exception -> 0x0632, blocks: (B:8:0x0055, B:110:0x0390, B:114:0x043d, B:116:0x0443, B:118:0x0449, B:119:0x044e, B:121:0x0457, B:123:0x045e, B:125:0x0464, B:126:0x0469, B:128:0x0472, B:130:0x0479, B:132:0x047f, B:133:0x0484, B:135:0x048d, B:137:0x0494, B:139:0x049a, B:140:0x049f, B:142:0x04a8, B:144:0x04af, B:146:0x04b5, B:147:0x04ba, B:149:0x04c3, B:151:0x04ca, B:153:0x04d0, B:154:0x04d5, B:156:0x04de, B:158:0x04e5, B:160:0x04eb, B:161:0x04f0, B:163:0x04f9, B:165:0x0500, B:167:0x0506, B:169:0x0510, B:171:0x0516, B:172:0x051b, B:173:0x053d, B:191:0x0570, B:195:0x05ba, B:175:0x0541, B:179:0x054d, B:182:0x0556, B:186:0x0562), top: B:214:0x0015, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x048d A[Catch: all -> 0x005a, Exception -> 0x0632, TryCatch #7 {Exception -> 0x0632, blocks: (B:8:0x0055, B:110:0x0390, B:114:0x043d, B:116:0x0443, B:118:0x0449, B:119:0x044e, B:121:0x0457, B:123:0x045e, B:125:0x0464, B:126:0x0469, B:128:0x0472, B:130:0x0479, B:132:0x047f, B:133:0x0484, B:135:0x048d, B:137:0x0494, B:139:0x049a, B:140:0x049f, B:142:0x04a8, B:144:0x04af, B:146:0x04b5, B:147:0x04ba, B:149:0x04c3, B:151:0x04ca, B:153:0x04d0, B:154:0x04d5, B:156:0x04de, B:158:0x04e5, B:160:0x04eb, B:161:0x04f0, B:163:0x04f9, B:165:0x0500, B:167:0x0506, B:169:0x0510, B:171:0x0516, B:172:0x051b, B:173:0x053d, B:191:0x0570, B:195:0x05ba, B:175:0x0541, B:179:0x054d, B:182:0x0556, B:186:0x0562), top: B:214:0x0015, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x04a8 A[Catch: all -> 0x005a, Exception -> 0x0632, TryCatch #7 {Exception -> 0x0632, blocks: (B:8:0x0055, B:110:0x0390, B:114:0x043d, B:116:0x0443, B:118:0x0449, B:119:0x044e, B:121:0x0457, B:123:0x045e, B:125:0x0464, B:126:0x0469, B:128:0x0472, B:130:0x0479, B:132:0x047f, B:133:0x0484, B:135:0x048d, B:137:0x0494, B:139:0x049a, B:140:0x049f, B:142:0x04a8, B:144:0x04af, B:146:0x04b5, B:147:0x04ba, B:149:0x04c3, B:151:0x04ca, B:153:0x04d0, B:154:0x04d5, B:156:0x04de, B:158:0x04e5, B:160:0x04eb, B:161:0x04f0, B:163:0x04f9, B:165:0x0500, B:167:0x0506, B:169:0x0510, B:171:0x0516, B:172:0x051b, B:173:0x053d, B:191:0x0570, B:195:0x05ba, B:175:0x0541, B:179:0x054d, B:182:0x0556, B:186:0x0562), top: B:214:0x0015, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x04c3 A[Catch: all -> 0x005a, Exception -> 0x0632, TryCatch #7 {Exception -> 0x0632, blocks: (B:8:0x0055, B:110:0x0390, B:114:0x043d, B:116:0x0443, B:118:0x0449, B:119:0x044e, B:121:0x0457, B:123:0x045e, B:125:0x0464, B:126:0x0469, B:128:0x0472, B:130:0x0479, B:132:0x047f, B:133:0x0484, B:135:0x048d, B:137:0x0494, B:139:0x049a, B:140:0x049f, B:142:0x04a8, B:144:0x04af, B:146:0x04b5, B:147:0x04ba, B:149:0x04c3, B:151:0x04ca, B:153:0x04d0, B:154:0x04d5, B:156:0x04de, B:158:0x04e5, B:160:0x04eb, B:161:0x04f0, B:163:0x04f9, B:165:0x0500, B:167:0x0506, B:169:0x0510, B:171:0x0516, B:172:0x051b, B:173:0x053d, B:191:0x0570, B:195:0x05ba, B:175:0x0541, B:179:0x054d, B:182:0x0556, B:186:0x0562), top: B:214:0x0015, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x04de A[Catch: all -> 0x005a, Exception -> 0x0632, TryCatch #7 {Exception -> 0x0632, blocks: (B:8:0x0055, B:110:0x0390, B:114:0x043d, B:116:0x0443, B:118:0x0449, B:119:0x044e, B:121:0x0457, B:123:0x045e, B:125:0x0464, B:126:0x0469, B:128:0x0472, B:130:0x0479, B:132:0x047f, B:133:0x0484, B:135:0x048d, B:137:0x0494, B:139:0x049a, B:140:0x049f, B:142:0x04a8, B:144:0x04af, B:146:0x04b5, B:147:0x04ba, B:149:0x04c3, B:151:0x04ca, B:153:0x04d0, B:154:0x04d5, B:156:0x04de, B:158:0x04e5, B:160:0x04eb, B:161:0x04f0, B:163:0x04f9, B:165:0x0500, B:167:0x0506, B:169:0x0510, B:171:0x0516, B:172:0x051b, B:173:0x053d, B:191:0x0570, B:195:0x05ba, B:175:0x0541, B:179:0x054d, B:182:0x0556, B:186:0x0562), top: B:214:0x0015, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x04f9 A[Catch: all -> 0x005a, Exception -> 0x0632, TryCatch #7 {Exception -> 0x0632, blocks: (B:8:0x0055, B:110:0x0390, B:114:0x043d, B:116:0x0443, B:118:0x0449, B:119:0x044e, B:121:0x0457, B:123:0x045e, B:125:0x0464, B:126:0x0469, B:128:0x0472, B:130:0x0479, B:132:0x047f, B:133:0x0484, B:135:0x048d, B:137:0x0494, B:139:0x049a, B:140:0x049f, B:142:0x04a8, B:144:0x04af, B:146:0x04b5, B:147:0x04ba, B:149:0x04c3, B:151:0x04ca, B:153:0x04d0, B:154:0x04d5, B:156:0x04de, B:158:0x04e5, B:160:0x04eb, B:161:0x04f0, B:163:0x04f9, B:165:0x0500, B:167:0x0506, B:169:0x0510, B:171:0x0516, B:172:0x051b, B:173:0x053d, B:191:0x0570, B:195:0x05ba, B:175:0x0541, B:179:0x054d, B:182:0x0556, B:186:0x0562), top: B:214:0x0015, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x0540  */
    /* JADX WARN: Code duplicated, block: B:175:0x0541 A[Catch: all -> 0x005a, Exception -> 0x0632, TryCatch #7 {Exception -> 0x0632, blocks: (B:8:0x0055, B:110:0x0390, B:114:0x043d, B:116:0x0443, B:118:0x0449, B:119:0x044e, B:121:0x0457, B:123:0x045e, B:125:0x0464, B:126:0x0469, B:128:0x0472, B:130:0x0479, B:132:0x047f, B:133:0x0484, B:135:0x048d, B:137:0x0494, B:139:0x049a, B:140:0x049f, B:142:0x04a8, B:144:0x04af, B:146:0x04b5, B:147:0x04ba, B:149:0x04c3, B:151:0x04ca, B:153:0x04d0, B:154:0x04d5, B:156:0x04de, B:158:0x04e5, B:160:0x04eb, B:161:0x04f0, B:163:0x04f9, B:165:0x0500, B:167:0x0506, B:169:0x0510, B:171:0x0516, B:172:0x051b, B:173:0x053d, B:191:0x0570, B:195:0x05ba, B:175:0x0541, B:179:0x054d, B:182:0x0556, B:186:0x0562), top: B:214:0x0015, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x0549  */
    /* JADX WARN: Code duplicated, block: B:178:0x054a  */
    /* JADX WARN: Code duplicated, block: B:179:0x054d A[Catch: all -> 0x005a, Exception -> 0x0632, TryCatch #7 {Exception -> 0x0632, blocks: (B:8:0x0055, B:110:0x0390, B:114:0x043d, B:116:0x0443, B:118:0x0449, B:119:0x044e, B:121:0x0457, B:123:0x045e, B:125:0x0464, B:126:0x0469, B:128:0x0472, B:130:0x0479, B:132:0x047f, B:133:0x0484, B:135:0x048d, B:137:0x0494, B:139:0x049a, B:140:0x049f, B:142:0x04a8, B:144:0x04af, B:146:0x04b5, B:147:0x04ba, B:149:0x04c3, B:151:0x04ca, B:153:0x04d0, B:154:0x04d5, B:156:0x04de, B:158:0x04e5, B:160:0x04eb, B:161:0x04f0, B:163:0x04f9, B:165:0x0500, B:167:0x0506, B:169:0x0510, B:171:0x0516, B:172:0x051b, B:173:0x053d, B:191:0x0570, B:195:0x05ba, B:175:0x0541, B:179:0x054d, B:182:0x0556, B:186:0x0562), top: B:214:0x0015, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:181:0x0555  */
    /* JADX WARN: Code duplicated, block: B:182:0x0556 A[Catch: all -> 0x005a, Exception -> 0x0632, TryCatch #7 {Exception -> 0x0632, blocks: (B:8:0x0055, B:110:0x0390, B:114:0x043d, B:116:0x0443, B:118:0x0449, B:119:0x044e, B:121:0x0457, B:123:0x045e, B:125:0x0464, B:126:0x0469, B:128:0x0472, B:130:0x0479, B:132:0x047f, B:133:0x0484, B:135:0x048d, B:137:0x0494, B:139:0x049a, B:140:0x049f, B:142:0x04a8, B:144:0x04af, B:146:0x04b5, B:147:0x04ba, B:149:0x04c3, B:151:0x04ca, B:153:0x04d0, B:154:0x04d5, B:156:0x04de, B:158:0x04e5, B:160:0x04eb, B:161:0x04f0, B:163:0x04f9, B:165:0x0500, B:167:0x0506, B:169:0x0510, B:171:0x0516, B:172:0x051b, B:173:0x053d, B:191:0x0570, B:195:0x05ba, B:175:0x0541, B:179:0x054d, B:182:0x0556, B:186:0x0562), top: B:214:0x0015, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:184:0x055e  */
    /* JADX WARN: Code duplicated, block: B:185:0x055f  */
    /* JADX WARN: Code duplicated, block: B:186:0x0562 A[Catch: all -> 0x005a, Exception -> 0x0632, TryCatch #7 {Exception -> 0x0632, blocks: (B:8:0x0055, B:110:0x0390, B:114:0x043d, B:116:0x0443, B:118:0x0449, B:119:0x044e, B:121:0x0457, B:123:0x045e, B:125:0x0464, B:126:0x0469, B:128:0x0472, B:130:0x0479, B:132:0x047f, B:133:0x0484, B:135:0x048d, B:137:0x0494, B:139:0x049a, B:140:0x049f, B:142:0x04a8, B:144:0x04af, B:146:0x04b5, B:147:0x04ba, B:149:0x04c3, B:151:0x04ca, B:153:0x04d0, B:154:0x04d5, B:156:0x04de, B:158:0x04e5, B:160:0x04eb, B:161:0x04f0, B:163:0x04f9, B:165:0x0500, B:167:0x0506, B:169:0x0510, B:171:0x0516, B:172:0x051b, B:173:0x053d, B:191:0x0570, B:195:0x05ba, B:175:0x0541, B:179:0x054d, B:182:0x0556, B:186:0x0562), top: B:214:0x0015, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:188:0x056a  */
    /* JADX WARN: Code duplicated, block: B:189:0x056b  */
    /* JADX WARN: Code duplicated, block: B:193:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:194:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:77:0x025b  */
    /* JADX WARN: Code duplicated, block: B:78:0x025d A[Catch: Exception -> 0x02da, PHI: r0 r12 r13 r14 r16 r26
      0x025d: PHI (r0v85 java.lang.Object) = (r0v11 java.lang.Object), (r0v131 java.lang.Object) binds: [B:76:0x0259, B:16:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x025d: PHI (r12v6 java.lang.String) = (r12v0 java.lang.String), (r12v23 java.lang.String) binds: [B:76:0x0259, B:16:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x025d: PHI (r13v11 java.lang.String) = (r13v0 java.lang.String), (r13v20 java.lang.String) binds: [B:76:0x0259, B:16:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x025d: PHI (r14v6 java.lang.String) = (r14v0 java.lang.String), (r14v12 java.lang.String) binds: [B:76:0x0259, B:16:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x025d: PHI (r16v7 int) = (r16v1 int), (r16v13 int) binds: [B:76:0x0259, B:16:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x025d: PHI (r26v5 boolean) = (r26v0 boolean), (r26v6 boolean) binds: [B:76:0x0259, B:16:0x007b] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {Exception -> 0x02da, blocks: (B:78:0x025d, B:80:0x026b, B:82:0x0271, B:84:0x0277, B:86:0x027f, B:88:0x0285, B:91:0x0293, B:95:0x02be, B:75:0x01db), top: B:210:0x01db }] */
    /* JADX WARN: Code duplicated, block: B:80:0x026b A[Catch: Exception -> 0x02da, TryCatch #2 {Exception -> 0x02da, blocks: (B:78:0x025d, B:80:0x026b, B:82:0x0271, B:84:0x0277, B:86:0x027f, B:88:0x0285, B:91:0x0293, B:95:0x02be, B:75:0x01db), top: B:210:0x01db }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0290  */
    /* JADX WARN: Code duplicated, block: B:91:0x0293 A[Catch: Exception -> 0x02da, TryCatch #2 {Exception -> 0x02da, blocks: (B:78:0x025d, B:80:0x026b, B:82:0x0271, B:84:0x0277, B:86:0x027f, B:88:0x0285, B:91:0x0293, B:95:0x02be, B:75:0x01db), top: B:210:0x01db }] */
    /* JADX WARN: Code duplicated, block: B:93:0x02ba A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x02d7  */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0622, code lost:
    
        if (invokeSuspend$enrichFromExternalAPIs(r32, r0, r3, r15, r0, r0, r0, r0, r0, r0, r0, r0, r0, r0, r41, r42, r43, (kotlin.coroutines.Continuation) r45) == r4) goto L197;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r46) {
        /*
            Method dump skipped, instruction units count: 1630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.CameraScreenKt$CameraScreen$processBitmapWithGemini$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object invokeSuspend$enrichFromExternalAPIs(String str, MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, MutableState<String> mutableState4, MutableState<String> mutableState5, MutableState<String> mutableState6, MutableState<Integer> mutableState7, MutableState<String> mutableState8, MutableState<Double> mutableState9, MutableState<String> mutableState10, MutableState<String> mutableState11, MutableState<List<VolumeInfo>> mutableState12, MutableState<Boolean> mutableState13, String str2, String str3, String str4, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new CameraScreenKt$CameraScreen$processBitmapWithGemini$2$enrichFromExternalAPIs$2(str2, str3, str4, str, mutableState, mutableState2, mutableState3, mutableState4, mutableState5, mutableState6, mutableState7, mutableState8, mutableState9, mutableState10, mutableState11, mutableState12, mutableState13, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:137:0x039f  */
    /* JADX WARN: Code duplicated, block: B:30:0x011d  */
    static final Unit invokeSuspend$lambda$14(CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, String str, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, MutableState mutableState12, MutableState mutableState13, MutableState mutableState14, MutableState mutableState15, Text text) throws IOException {
        MutableState mutableState16;
        Object next;
        Object next2;
        Object next3;
        MutableState mutableState17;
        MutableState mutableState18;
        String str2;
        String str3;
        String str4;
        boolean z;
        List textBlocks = text.getTextBlocks();
        Intrinsics.checkNotNullExpressionValue(textBlocks, "getTextBlocks(...)");
        if (textBlocks.isEmpty()) {
            CameraScreenKt.CameraScreen$lambda$17(mutableState14, false);
            mutableState15.setValue(null);
            Unit unit = Unit.INSTANCE;
        } else {
            Set of = SetsKt.setOf(new String[]{"bestseller", "international", "times", "national", "edition", "revised", "special", "foreword", "praise", "copies", "sold", "publisher", "rs.", "inr", "price", "isbn", "paperback", "hardcover", "reprint", "authorized", "classic", "volume", "vol"});
            List<Text.TextBlock> list = textBlocks;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (Text.TextBlock textBlock : list) {
                String text2 = textBlock.getText();
                Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                String string = StringsKt.trim(text2).toString();
                Rect boundingBox = textBlock.getBoundingBox();
                int iWidth = boundingBox != null ? boundingBox.width() : 1;
                Rect boundingBox2 = textBlock.getBoundingBox();
                int iHeight = iWidth * (boundingBox2 != null ? boundingBox2.height() : 1);
                Set set = of;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator it = set.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (StringsKt.contains(string, (String) it.next(), true)) {
                            }
                        } else if (string.length() >= 3) {
                            z = false;
                        }
                        z = true;
                    }
                } else if (string.length() >= 3) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    iHeight /= 5;
                }
                arrayList.add(new Triple(textBlock, string, Integer.valueOf(iHeight)));
            }
            List listSortedWith = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.example.ui.screens.CameraScreenKt$CameraScreen$processBitmapWithGemini$2$invokeSuspend$lambda$14$$inlined$sortedByDescending$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues((Integer) ((Triple) t2).getThird(), (Integer) ((Triple) t).getThird());
                }
            });
            Triple triple = (Triple) CollectionsKt.firstOrNull(listSortedWith);
            String str5 = (triple == null || (str4 = (String) triple.getSecond()) == null) ? "" : str4;
            List listLines = StringsKt.lines(str5);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listLines) {
                String str6 = (String) obj;
                Set set2 = of;
                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                    Iterator it2 = set2.iterator();
                    do {
                        if (it2.hasNext()) {
                        }
                    } while (!StringsKt.contains(str6, (String) it2.next(), true));
                }
                arrayList2.add(obj);
            }
            String string2 = StringsKt.trim(new Regex("\\s+").replace(CollectionsKt.joinToString$default(arrayList2, " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null), " ")).toString();
            if (StringsKt.isBlank(string2)) {
                string2 = StringsKt.trim(StringsKt.replace$default(str5, "\n", " ", false, 4, (Object) null)).toString();
            }
            if (!StringsKt.isBlank(CameraScreenKt.CameraScreen$lambda$1(mutableState)) || StringsKt.isBlank(string2)) {
                mutableState16 = mutableState;
            } else {
                mutableState16 = mutableState;
                mutableState16.setValue(string2);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                List lines = ((Text.TextBlock) it3.next()).getLines();
                Intrinsics.checkNotNullExpressionValue(lines, "getLines(...)");
                CollectionsKt.addAll(arrayList3, lines);
            }
            ArrayList arrayList4 = arrayList3;
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                String text3 = ((Text.Line) it4.next()).getText();
                Intrinsics.checkNotNullExpressionValue(text3, "getText(...)");
                arrayList5.add(StringsKt.trim(text3).toString());
            }
            ArrayList arrayList6 = arrayList5;
            Iterator it5 = arrayList6.iterator();
            do {
                if (!it5.hasNext()) {
                    next = null;
                    break;
                }
                next = it5.next();
                str3 = (String) next;
                if (StringsKt.startsWith(str3, "by ", true)) {
                    break;
                }
            } while (!StringsKt.contains(str3, "by ", true));
            String str7 = (String) next;
            Iterator it6 = arrayList6.iterator();
            do {
                if (!it6.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it6.next();
                str2 = (String) next2;
                if (StringsKt.contains(str2, "NCERT", true) || StringsKt.contains(str2, "CBSE", true) || StringsKt.contains(str2, "Oxford", true) || StringsKt.contains(str2, "Pearson", true) || StringsKt.contains(str2, "Cambridge", true)) {
                    break;
                }
            } while (!StringsKt.contains(str2, "McGraw", true));
            String string3 = (String) next2;
            if (str7 != null) {
                string3 = StringsKt.trim(new Regex("(?i)^.*by\\s+").replace(str7, "")).toString();
            } else if (string3 == null) {
                string3 = "Unknown";
                if (listSortedWith.size() > 1) {
                    Iterator it7 = StringsKt.lines((String) ((Triple) listSortedWith.get(1)).getSecond()).iterator();
                    loop9: while (true) {
                        if (!it7.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it7.next();
                        String str8 = (String) next3;
                        if (str8.length() > 2) {
                            Set set3 = of;
                            if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                                Iterator it8 = set3.iterator();
                                do {
                                    if (!it8.hasNext()) {
                                        break loop9;
                                    }
                                } while (!StringsKt.contains(str8, (String) it8.next(), true));
                            } else {
                                break;
                            }
                        }
                    }
                    String str9 = (String) next3;
                    if (str9 != null) {
                        string3 = str9;
                    }
                }
            }
            if (StringsKt.isBlank(CameraScreenKt.CameraScreen$lambda$4(mutableState2))) {
                mutableState17 = mutableState2;
                mutableState17.setValue(string3);
            } else {
                mutableState17 = mutableState2;
            }
            String strCameraScreen$lambda$28 = CameraScreenKt.CameraScreen$lambda$28(mutableState3);
            if (strCameraScreen$lambda$28 == null || StringsKt.isBlank(strCameraScreen$lambda$28)) {
                Regex regex = new Regex("(?i)isbn(?:-1[03])?:?\\s*([0-9Xx\\-]{10,17})");
                String text4 = text.getText();
                Intrinsics.checkNotNullExpressionValue(text4, "getText(...)");
                MatchResult matchResultFind$default = Regex.find$default(regex, text4, 0, 2, (Object) null);
                if (matchResultFind$default != null) {
                    String str10 = (String) matchResultFind$default.getGroupValues().get(1);
                    StringBuilder sb = new StringBuilder();
                    int length = str10.length();
                    for (int i = 0; i < length; i++) {
                        char cCharAt = str10.charAt(i);
                        if (Character.isDigit(cCharAt) || cCharAt == 'X' || cCharAt == 'x') {
                            sb.append(cCharAt);
                        }
                    }
                    String string4 = sb.toString();
                    int length2 = string4.length();
                    if (10 > length2 || length2 >= 14) {
                        mutableState18 = mutableState3;
                    } else {
                        mutableState18 = mutableState3;
                        mutableState18.setValue(string4);
                    }
                } else {
                    mutableState18 = mutableState3;
                }
            } else {
                mutableState18 = mutableState3;
            }
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new CameraScreenKt$CameraScreen$processBitmapWithGemini$2$1$1(mutableState16, mutableState17, mutableState18, str, mutableState4, mutableState5, mutableState6, mutableState7, mutableState8, mutableState9, mutableState10, mutableState11, mutableState12, mutableState13, mutableState14, mutableState15, null), 3, (Object) null);
        }
        return Unit.INSTANCE;
    }

    static final void invokeSuspend$lambda$16(MutableState mutableState, MutableState mutableState2, Exception exc) {
        CameraScreenKt.CameraScreen$lambda$17(mutableState, false);
        mutableState2.setValue(null);
    }
}
