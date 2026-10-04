package com.example.ui.screens;

import androidx.compose.runtime.MutableState;
import com.example.api.GoogleBooksResponse;
import com.example.api.VolumeInfo;
import com.example.api.VolumeItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: CameraScreen.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.screens.CameraScreenKt$CameraScreen$processBitmapWithGemini$2$enrichFromExternalAPIs$2", f = "CameraScreen.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {280, 285, 338}, m = "invokeSuspend", n = {"cleanTitle", "cleanAuthor", "cleanIsbn", "queries", "q", "resp", "foundGoogle", "foundOpenLibrary", "cleanTitle", "cleanAuthor", "cleanIsbn", "queries", "q", "resp", "foundGoogle", "foundOpenLibrary", "cleanTitle", "cleanAuthor", "cleanIsbn", "queries", "q", "resp", "book", "fullTitle", "bookAuthors", "bestCover", "bookIsbn", "foundGoogle", "foundOpenLibrary"}, s = {"L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "I$0", "I$1"})
final class CameraScreenKt$CameraScreen$processBitmapWithGemini$2$enrichFromExternalAPIs$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<String> $author$delegate;
    final /* synthetic */ MutableState<Double> $averageRating$delegate;
    final /* synthetic */ MutableState<String> $description$delegate;
    final /* synthetic */ MutableState<String> $detectedIsbn$delegate;
    final /* synthetic */ MutableState<String> $genre$delegate;
    final /* synthetic */ String $googleBooksKey;
    final /* synthetic */ MutableState<List<VolumeInfo>> $googleBooksSearchResults$delegate;
    final /* synthetic */ MutableState<Boolean> $isEnrichedByExternalApis$delegate;
    final /* synthetic */ MutableState<String> $language$delegate;
    final /* synthetic */ MutableState<String> $officialCoverUrl$delegate;
    final /* synthetic */ MutableState<Integer> $pageCount$delegate;
    final /* synthetic */ MutableState<String> $publishedDate$delegate;
    final /* synthetic */ MutableState<String> $publisher$delegate;
    final /* synthetic */ String $searchAuthor;
    final /* synthetic */ String $searchIsbn;
    final /* synthetic */ String $searchTitle;
    final /* synthetic */ MutableState<String> $title$delegate;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
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
    CameraScreenKt$CameraScreen$processBitmapWithGemini$2$enrichFromExternalAPIs$2(String str, String str2, String str3, String str4, MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, MutableState<String> mutableState4, MutableState<String> mutableState5, MutableState<String> mutableState6, MutableState<Integer> mutableState7, MutableState<String> mutableState8, MutableState<Double> mutableState9, MutableState<String> mutableState10, MutableState<String> mutableState11, MutableState<List<VolumeInfo>> mutableState12, MutableState<Boolean> mutableState13, Continuation<? super CameraScreenKt$CameraScreen$processBitmapWithGemini$2$enrichFromExternalAPIs$2> continuation) {
        super(2, continuation);
        this.$searchTitle = str;
        this.$searchAuthor = str2;
        this.$searchIsbn = str3;
        this.$googleBooksKey = str4;
        this.$title$delegate = mutableState;
        this.$author$delegate = mutableState2;
        this.$description$delegate = mutableState3;
        this.$genre$delegate = mutableState4;
        this.$publisher$delegate = mutableState5;
        this.$publishedDate$delegate = mutableState6;
        this.$pageCount$delegate = mutableState7;
        this.$language$delegate = mutableState8;
        this.$averageRating$delegate = mutableState9;
        this.$officialCoverUrl$delegate = mutableState10;
        this.$detectedIsbn$delegate = mutableState11;
        this.$googleBooksSearchResults$delegate = mutableState12;
        this.$isEnrichedByExternalApis$delegate = mutableState13;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CameraScreenKt$CameraScreen$processBitmapWithGemini$2$enrichFromExternalAPIs$2(this.$searchTitle, this.$searchAuthor, this.$searchIsbn, this.$googleBooksKey, this.$title$delegate, this.$author$delegate, this.$description$delegate, this.$genre$delegate, this.$publisher$delegate, this.$publishedDate$delegate, this.$pageCount$delegate, this.$language$delegate, this.$averageRating$delegate, this.$officialCoverUrl$delegate, this.$detectedIsbn$delegate, this.$googleBooksSearchResults$delegate, this.$isEnrichedByExternalApis$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0337 A[Catch: Exception -> 0x0567, TryCatch #18 {Exception -> 0x0567, blocks: (B:101:0x032a, B:103:0x0337, B:104:0x033c, B:106:0x0342, B:108:0x035e, B:110:0x0363, B:113:0x036a, B:114:0x036f, B:116:0x0377, B:119:0x037e, B:121:0x038c, B:123:0x0394, B:126:0x039b, B:127:0x03aa, B:129:0x03b2, B:132:0x03b9, B:133:0x03c2, B:135:0x03ca, B:138:0x03d1, B:139:0x03da, B:141:0x03e0, B:143:0x03ea, B:144:0x03f3, B:146:0x03fd, B:193:0x04a4, B:195:0x04aa, B:197:0x04b8, B:198:0x04c1, B:200:0x04c7, B:202:0x04cd, B:204:0x04d2, B:207:0x04d9, B:208:0x04de, B:210:0x04e7, B:213:0x04ee, B:215:0x04f8, B:217:0x04fe, B:218:0x0503, B:150:0x040a, B:152:0x0412, B:155:0x0419, B:190:0x048f, B:192:0x04a1, B:168:0x044b, B:172:0x0457, B:176:0x0463, B:180:0x046f, B:184:0x047b, B:188:0x0487), top: B:413:0x032a }] */
    /* JADX WARN: Code duplicated, block: B:106:0x0342 A[Catch: Exception -> 0x0567, TryCatch #18 {Exception -> 0x0567, blocks: (B:101:0x032a, B:103:0x0337, B:104:0x033c, B:106:0x0342, B:108:0x035e, B:110:0x0363, B:113:0x036a, B:114:0x036f, B:116:0x0377, B:119:0x037e, B:121:0x038c, B:123:0x0394, B:126:0x039b, B:127:0x03aa, B:129:0x03b2, B:132:0x03b9, B:133:0x03c2, B:135:0x03ca, B:138:0x03d1, B:139:0x03da, B:141:0x03e0, B:143:0x03ea, B:144:0x03f3, B:146:0x03fd, B:193:0x04a4, B:195:0x04aa, B:197:0x04b8, B:198:0x04c1, B:200:0x04c7, B:202:0x04cd, B:204:0x04d2, B:207:0x04d9, B:208:0x04de, B:210:0x04e7, B:213:0x04ee, B:215:0x04f8, B:217:0x04fe, B:218:0x0503, B:150:0x040a, B:152:0x0412, B:155:0x0419, B:190:0x048f, B:192:0x04a1, B:168:0x044b, B:172:0x0457, B:176:0x0463, B:180:0x046f, B:184:0x047b, B:188:0x0487), top: B:413:0x032a }] */
    /* JADX WARN: Code duplicated, block: B:107:0x035d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0363 A[Catch: Exception -> 0x0567, TryCatch #18 {Exception -> 0x0567, blocks: (B:101:0x032a, B:103:0x0337, B:104:0x033c, B:106:0x0342, B:108:0x035e, B:110:0x0363, B:113:0x036a, B:114:0x036f, B:116:0x0377, B:119:0x037e, B:121:0x038c, B:123:0x0394, B:126:0x039b, B:127:0x03aa, B:129:0x03b2, B:132:0x03b9, B:133:0x03c2, B:135:0x03ca, B:138:0x03d1, B:139:0x03da, B:141:0x03e0, B:143:0x03ea, B:144:0x03f3, B:146:0x03fd, B:193:0x04a4, B:195:0x04aa, B:197:0x04b8, B:198:0x04c1, B:200:0x04c7, B:202:0x04cd, B:204:0x04d2, B:207:0x04d9, B:208:0x04de, B:210:0x04e7, B:213:0x04ee, B:215:0x04f8, B:217:0x04fe, B:218:0x0503, B:150:0x040a, B:152:0x0412, B:155:0x0419, B:190:0x048f, B:192:0x04a1, B:168:0x044b, B:172:0x0457, B:176:0x0463, B:180:0x046f, B:184:0x047b, B:188:0x0487), top: B:413:0x032a }] */
    /* JADX WARN: Code duplicated, block: B:116:0x0377 A[Catch: Exception -> 0x0567, TryCatch #18 {Exception -> 0x0567, blocks: (B:101:0x032a, B:103:0x0337, B:104:0x033c, B:106:0x0342, B:108:0x035e, B:110:0x0363, B:113:0x036a, B:114:0x036f, B:116:0x0377, B:119:0x037e, B:121:0x038c, B:123:0x0394, B:126:0x039b, B:127:0x03aa, B:129:0x03b2, B:132:0x03b9, B:133:0x03c2, B:135:0x03ca, B:138:0x03d1, B:139:0x03da, B:141:0x03e0, B:143:0x03ea, B:144:0x03f3, B:146:0x03fd, B:193:0x04a4, B:195:0x04aa, B:197:0x04b8, B:198:0x04c1, B:200:0x04c7, B:202:0x04cd, B:204:0x04d2, B:207:0x04d9, B:208:0x04de, B:210:0x04e7, B:213:0x04ee, B:215:0x04f8, B:217:0x04fe, B:218:0x0503, B:150:0x040a, B:152:0x0412, B:155:0x0419, B:190:0x048f, B:192:0x04a1, B:168:0x044b, B:172:0x0457, B:176:0x0463, B:180:0x046f, B:184:0x047b, B:188:0x0487), top: B:413:0x032a }] */
    /* JADX WARN: Code duplicated, block: B:120:0x038a  */
    /* JADX WARN: Code duplicated, block: B:123:0x0394 A[Catch: Exception -> 0x0567, TryCatch #18 {Exception -> 0x0567, blocks: (B:101:0x032a, B:103:0x0337, B:104:0x033c, B:106:0x0342, B:108:0x035e, B:110:0x0363, B:113:0x036a, B:114:0x036f, B:116:0x0377, B:119:0x037e, B:121:0x038c, B:123:0x0394, B:126:0x039b, B:127:0x03aa, B:129:0x03b2, B:132:0x03b9, B:133:0x03c2, B:135:0x03ca, B:138:0x03d1, B:139:0x03da, B:141:0x03e0, B:143:0x03ea, B:144:0x03f3, B:146:0x03fd, B:193:0x04a4, B:195:0x04aa, B:197:0x04b8, B:198:0x04c1, B:200:0x04c7, B:202:0x04cd, B:204:0x04d2, B:207:0x04d9, B:208:0x04de, B:210:0x04e7, B:213:0x04ee, B:215:0x04f8, B:217:0x04fe, B:218:0x0503, B:150:0x040a, B:152:0x0412, B:155:0x0419, B:190:0x048f, B:192:0x04a1, B:168:0x044b, B:172:0x0457, B:176:0x0463, B:180:0x046f, B:184:0x047b, B:188:0x0487), top: B:413:0x032a }] */
    /* JADX WARN: Code duplicated, block: B:129:0x03b2 A[Catch: Exception -> 0x0567, TryCatch #18 {Exception -> 0x0567, blocks: (B:101:0x032a, B:103:0x0337, B:104:0x033c, B:106:0x0342, B:108:0x035e, B:110:0x0363, B:113:0x036a, B:114:0x036f, B:116:0x0377, B:119:0x037e, B:121:0x038c, B:123:0x0394, B:126:0x039b, B:127:0x03aa, B:129:0x03b2, B:132:0x03b9, B:133:0x03c2, B:135:0x03ca, B:138:0x03d1, B:139:0x03da, B:141:0x03e0, B:143:0x03ea, B:144:0x03f3, B:146:0x03fd, B:193:0x04a4, B:195:0x04aa, B:197:0x04b8, B:198:0x04c1, B:200:0x04c7, B:202:0x04cd, B:204:0x04d2, B:207:0x04d9, B:208:0x04de, B:210:0x04e7, B:213:0x04ee, B:215:0x04f8, B:217:0x04fe, B:218:0x0503, B:150:0x040a, B:152:0x0412, B:155:0x0419, B:190:0x048f, B:192:0x04a1, B:168:0x044b, B:172:0x0457, B:176:0x0463, B:180:0x046f, B:184:0x047b, B:188:0x0487), top: B:413:0x032a }] */
    /* JADX WARN: Code duplicated, block: B:135:0x03ca A[Catch: Exception -> 0x0567, TryCatch #18 {Exception -> 0x0567, blocks: (B:101:0x032a, B:103:0x0337, B:104:0x033c, B:106:0x0342, B:108:0x035e, B:110:0x0363, B:113:0x036a, B:114:0x036f, B:116:0x0377, B:119:0x037e, B:121:0x038c, B:123:0x0394, B:126:0x039b, B:127:0x03aa, B:129:0x03b2, B:132:0x03b9, B:133:0x03c2, B:135:0x03ca, B:138:0x03d1, B:139:0x03da, B:141:0x03e0, B:143:0x03ea, B:144:0x03f3, B:146:0x03fd, B:193:0x04a4, B:195:0x04aa, B:197:0x04b8, B:198:0x04c1, B:200:0x04c7, B:202:0x04cd, B:204:0x04d2, B:207:0x04d9, B:208:0x04de, B:210:0x04e7, B:213:0x04ee, B:215:0x04f8, B:217:0x04fe, B:218:0x0503, B:150:0x040a, B:152:0x0412, B:155:0x0419, B:190:0x048f, B:192:0x04a1, B:168:0x044b, B:172:0x0457, B:176:0x0463, B:180:0x046f, B:184:0x047b, B:188:0x0487), top: B:413:0x032a }] */
    /* JADX WARN: Code duplicated, block: B:141:0x03e0 A[Catch: Exception -> 0x0567, TryCatch #18 {Exception -> 0x0567, blocks: (B:101:0x032a, B:103:0x0337, B:104:0x033c, B:106:0x0342, B:108:0x035e, B:110:0x0363, B:113:0x036a, B:114:0x036f, B:116:0x0377, B:119:0x037e, B:121:0x038c, B:123:0x0394, B:126:0x039b, B:127:0x03aa, B:129:0x03b2, B:132:0x03b9, B:133:0x03c2, B:135:0x03ca, B:138:0x03d1, B:139:0x03da, B:141:0x03e0, B:143:0x03ea, B:144:0x03f3, B:146:0x03fd, B:193:0x04a4, B:195:0x04aa, B:197:0x04b8, B:198:0x04c1, B:200:0x04c7, B:202:0x04cd, B:204:0x04d2, B:207:0x04d9, B:208:0x04de, B:210:0x04e7, B:213:0x04ee, B:215:0x04f8, B:217:0x04fe, B:218:0x0503, B:150:0x040a, B:152:0x0412, B:155:0x0419, B:190:0x048f, B:192:0x04a1, B:168:0x044b, B:172:0x0457, B:176:0x0463, B:180:0x046f, B:184:0x047b, B:188:0x0487), top: B:413:0x032a }] */
    /* JADX WARN: Code duplicated, block: B:146:0x03fd A[Catch: Exception -> 0x0567, TryCatch #18 {Exception -> 0x0567, blocks: (B:101:0x032a, B:103:0x0337, B:104:0x033c, B:106:0x0342, B:108:0x035e, B:110:0x0363, B:113:0x036a, B:114:0x036f, B:116:0x0377, B:119:0x037e, B:121:0x038c, B:123:0x0394, B:126:0x039b, B:127:0x03aa, B:129:0x03b2, B:132:0x03b9, B:133:0x03c2, B:135:0x03ca, B:138:0x03d1, B:139:0x03da, B:141:0x03e0, B:143:0x03ea, B:144:0x03f3, B:146:0x03fd, B:193:0x04a4, B:195:0x04aa, B:197:0x04b8, B:198:0x04c1, B:200:0x04c7, B:202:0x04cd, B:204:0x04d2, B:207:0x04d9, B:208:0x04de, B:210:0x04e7, B:213:0x04ee, B:215:0x04f8, B:217:0x04fe, B:218:0x0503, B:150:0x040a, B:152:0x0412, B:155:0x0419, B:190:0x048f, B:192:0x04a1, B:168:0x044b, B:172:0x0457, B:176:0x0463, B:180:0x046f, B:184:0x047b, B:188:0x0487), top: B:413:0x032a }] */
    /* JADX WARN: Code duplicated, block: B:149:0x0404  */
    /* JADX WARN: Code duplicated, block: B:150:0x040a A[Catch: Exception -> 0x0567, TryCatch #18 {Exception -> 0x0567, blocks: (B:101:0x032a, B:103:0x0337, B:104:0x033c, B:106:0x0342, B:108:0x035e, B:110:0x0363, B:113:0x036a, B:114:0x036f, B:116:0x0377, B:119:0x037e, B:121:0x038c, B:123:0x0394, B:126:0x039b, B:127:0x03aa, B:129:0x03b2, B:132:0x03b9, B:133:0x03c2, B:135:0x03ca, B:138:0x03d1, B:139:0x03da, B:141:0x03e0, B:143:0x03ea, B:144:0x03f3, B:146:0x03fd, B:193:0x04a4, B:195:0x04aa, B:197:0x04b8, B:198:0x04c1, B:200:0x04c7, B:202:0x04cd, B:204:0x04d2, B:207:0x04d9, B:208:0x04de, B:210:0x04e7, B:213:0x04ee, B:215:0x04f8, B:217:0x04fe, B:218:0x0503, B:150:0x040a, B:152:0x0412, B:155:0x0419, B:190:0x048f, B:192:0x04a1, B:168:0x044b, B:172:0x0457, B:176:0x0463, B:180:0x046f, B:184:0x047b, B:188:0x0487), top: B:413:0x032a }] */
    /* JADX WARN: Code duplicated, block: B:152:0x0412 A[Catch: Exception -> 0x0567, TryCatch #18 {Exception -> 0x0567, blocks: (B:101:0x032a, B:103:0x0337, B:104:0x033c, B:106:0x0342, B:108:0x035e, B:110:0x0363, B:113:0x036a, B:114:0x036f, B:116:0x0377, B:119:0x037e, B:121:0x038c, B:123:0x0394, B:126:0x039b, B:127:0x03aa, B:129:0x03b2, B:132:0x03b9, B:133:0x03c2, B:135:0x03ca, B:138:0x03d1, B:139:0x03da, B:141:0x03e0, B:143:0x03ea, B:144:0x03f3, B:146:0x03fd, B:193:0x04a4, B:195:0x04aa, B:197:0x04b8, B:198:0x04c1, B:200:0x04c7, B:202:0x04cd, B:204:0x04d2, B:207:0x04d9, B:208:0x04de, B:210:0x04e7, B:213:0x04ee, B:215:0x04f8, B:217:0x04fe, B:218:0x0503, B:150:0x040a, B:152:0x0412, B:155:0x0419, B:190:0x048f, B:192:0x04a1, B:168:0x044b, B:172:0x0457, B:176:0x0463, B:180:0x046f, B:184:0x047b, B:188:0x0487), top: B:413:0x032a }] */
    /* JADX WARN: Code duplicated, block: B:195:0x04aa A[Catch: Exception -> 0x0567, TryCatch #18 {Exception -> 0x0567, blocks: (B:101:0x032a, B:103:0x0337, B:104:0x033c, B:106:0x0342, B:108:0x035e, B:110:0x0363, B:113:0x036a, B:114:0x036f, B:116:0x0377, B:119:0x037e, B:121:0x038c, B:123:0x0394, B:126:0x039b, B:127:0x03aa, B:129:0x03b2, B:132:0x03b9, B:133:0x03c2, B:135:0x03ca, B:138:0x03d1, B:139:0x03da, B:141:0x03e0, B:143:0x03ea, B:144:0x03f3, B:146:0x03fd, B:193:0x04a4, B:195:0x04aa, B:197:0x04b8, B:198:0x04c1, B:200:0x04c7, B:202:0x04cd, B:204:0x04d2, B:207:0x04d9, B:208:0x04de, B:210:0x04e7, B:213:0x04ee, B:215:0x04f8, B:217:0x04fe, B:218:0x0503, B:150:0x040a, B:152:0x0412, B:155:0x0419, B:190:0x048f, B:192:0x04a1, B:168:0x044b, B:172:0x0457, B:176:0x0463, B:180:0x046f, B:184:0x047b, B:188:0x0487), top: B:413:0x032a }] */
    /* JADX WARN: Code duplicated, block: B:200:0x04c7 A[Catch: Exception -> 0x0567, TryCatch #18 {Exception -> 0x0567, blocks: (B:101:0x032a, B:103:0x0337, B:104:0x033c, B:106:0x0342, B:108:0x035e, B:110:0x0363, B:113:0x036a, B:114:0x036f, B:116:0x0377, B:119:0x037e, B:121:0x038c, B:123:0x0394, B:126:0x039b, B:127:0x03aa, B:129:0x03b2, B:132:0x03b9, B:133:0x03c2, B:135:0x03ca, B:138:0x03d1, B:139:0x03da, B:141:0x03e0, B:143:0x03ea, B:144:0x03f3, B:146:0x03fd, B:193:0x04a4, B:195:0x04aa, B:197:0x04b8, B:198:0x04c1, B:200:0x04c7, B:202:0x04cd, B:204:0x04d2, B:207:0x04d9, B:208:0x04de, B:210:0x04e7, B:213:0x04ee, B:215:0x04f8, B:217:0x04fe, B:218:0x0503, B:150:0x040a, B:152:0x0412, B:155:0x0419, B:190:0x048f, B:192:0x04a1, B:168:0x044b, B:172:0x0457, B:176:0x0463, B:180:0x046f, B:184:0x047b, B:188:0x0487), top: B:413:0x032a }] */
    /* JADX WARN: Code duplicated, block: B:201:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:204:0x04d2 A[Catch: Exception -> 0x0567, TryCatch #18 {Exception -> 0x0567, blocks: (B:101:0x032a, B:103:0x0337, B:104:0x033c, B:106:0x0342, B:108:0x035e, B:110:0x0363, B:113:0x036a, B:114:0x036f, B:116:0x0377, B:119:0x037e, B:121:0x038c, B:123:0x0394, B:126:0x039b, B:127:0x03aa, B:129:0x03b2, B:132:0x03b9, B:133:0x03c2, B:135:0x03ca, B:138:0x03d1, B:139:0x03da, B:141:0x03e0, B:143:0x03ea, B:144:0x03f3, B:146:0x03fd, B:193:0x04a4, B:195:0x04aa, B:197:0x04b8, B:198:0x04c1, B:200:0x04c7, B:202:0x04cd, B:204:0x04d2, B:207:0x04d9, B:208:0x04de, B:210:0x04e7, B:213:0x04ee, B:215:0x04f8, B:217:0x04fe, B:218:0x0503, B:150:0x040a, B:152:0x0412, B:155:0x0419, B:190:0x048f, B:192:0x04a1, B:168:0x044b, B:172:0x0457, B:176:0x0463, B:180:0x046f, B:184:0x047b, B:188:0x0487), top: B:413:0x032a }] */
    /* JADX WARN: Code duplicated, block: B:210:0x04e7 A[Catch: Exception -> 0x0567, TryCatch #18 {Exception -> 0x0567, blocks: (B:101:0x032a, B:103:0x0337, B:104:0x033c, B:106:0x0342, B:108:0x035e, B:110:0x0363, B:113:0x036a, B:114:0x036f, B:116:0x0377, B:119:0x037e, B:121:0x038c, B:123:0x0394, B:126:0x039b, B:127:0x03aa, B:129:0x03b2, B:132:0x03b9, B:133:0x03c2, B:135:0x03ca, B:138:0x03d1, B:139:0x03da, B:141:0x03e0, B:143:0x03ea, B:144:0x03f3, B:146:0x03fd, B:193:0x04a4, B:195:0x04aa, B:197:0x04b8, B:198:0x04c1, B:200:0x04c7, B:202:0x04cd, B:204:0x04d2, B:207:0x04d9, B:208:0x04de, B:210:0x04e7, B:213:0x04ee, B:215:0x04f8, B:217:0x04fe, B:218:0x0503, B:150:0x040a, B:152:0x0412, B:155:0x0419, B:190:0x048f, B:192:0x04a1, B:168:0x044b, B:172:0x0457, B:176:0x0463, B:180:0x046f, B:184:0x047b, B:188:0x0487), top: B:413:0x032a }] */
    /* JADX WARN: Code duplicated, block: B:221:0x0565  */
    /* JADX WARN: Code duplicated, block: B:223:0x056a  */
    /* JADX WARN: Code duplicated, block: B:379:0x0291 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:397:0x0225 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:413:0x032a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0210  */
    /* JADX WARN: Code duplicated, block: B:63:0x0265  */
    /* JADX WARN: Code duplicated, block: B:76:0x029d A[Catch: Exception -> 0x056e, TRY_LEAVE, TryCatch #1 {Exception -> 0x056e, blocks: (B:74:0x0291, B:76:0x029d), top: B:379:0x0291 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:93:0x0314 A[Catch: Exception -> 0x056a, TryCatch #3 {Exception -> 0x056a, blocks: (B:91:0x030e, B:93:0x0314, B:95:0x031a, B:97:0x0322), top: B:383:0x030e }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0327  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 2231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.CameraScreenKt$CameraScreen$processBitmapWithGemini$2$enrichFromExternalAPIs$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: renamed from: com.example.ui.screens.CameraScreenKt$CameraScreen$processBitmapWithGemini$2$enrichFromExternalAPIs$2$3, reason: invalid class name */
    /* JADX INFO: compiled from: CameraScreen.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.screens.CameraScreenKt$CameraScreen$processBitmapWithGemini$2$enrichFromExternalAPIs$2$3", f = "CameraScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableState<List<VolumeInfo>> $googleBooksSearchResults$delegate;
        final /* synthetic */ Ref.ObjectRef<GoogleBooksResponse> $resp;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(Ref.ObjectRef<GoogleBooksResponse> objectRef, MutableState<List<VolumeInfo>> mutableState, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$resp = objectRef;
            this.$googleBooksSearchResults$delegate = mutableState;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$resp, this.$googleBooksSearchResults$delegate, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            ArrayList arrayListEmptyList;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MutableState<List<VolumeInfo>> mutableState = this.$googleBooksSearchResults$delegate;
            List<VolumeItem> items = ((GoogleBooksResponse) this.$resp.element).getItems();
            if (items == null) {
                arrayListEmptyList = CollectionsKt.emptyList();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = items.iterator();
                while (it.hasNext()) {
                    VolumeInfo volumeInfo = ((VolumeItem) it.next()).getVolumeInfo();
                    if (volumeInfo != null) {
                        arrayList.add(volumeInfo);
                    }
                }
                arrayListEmptyList = arrayList;
            }
            mutableState.setValue(arrayListEmptyList);
            return Unit.INSTANCE;
        }
    }
}
