package com.example.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import coil.util.Utils;
import com.example.api.Candidate;
import com.example.api.Content;
import com.example.api.GenerateContentRequest;
import com.example.api.GenerateContentResponse;
import com.example.api.GenerationConfig;
import com.example.api.InlineData;
import com.example.api.Part;
import com.example.api.ResponseFormat;
import com.example.api.RetrofitClient;
import com.example.data.Book;
import com.example.data.BookRepository;
import com.example.data.Feedback;
import com.example.data.Message;
import com.example.data.Review;
import com.example.data.User;
import com.example.data.WishlistRequest;
import com.example.security.SecureKeyProvider;
import com.example.util.QRCodeHelper;
import com.example.util.QrPayload;
import com.google.android.gms.actions.SearchIntents;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: BookViewModel.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0004Ë\u0001Ì\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010#\u001a\u00020$H\u0002J\u0018\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\fH\u0002J\b\u0010(\u001a\u00020$H\u0002J \u00107\u001a\u00020$2\u0006\u00108\u001a\u00020\f2\u0006\u00109\u001a\u00020\f2\b\b\u0002\u0010:\u001a\u00020\fJ\u0006\u0010;\u001a\u00020$J\u000e\u0010<\u001a\u00020$2\u0006\u0010=\u001a\u00020\fJ\u000e\u0010>\u001a\u00020$2\u0006\u0010?\u001a\u00020\fJ\u0016\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010A0\u000e2\u0006\u00108\u001a\u00020\fJ\u001a\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0\u00180\u000e2\u0006\u00108\u001a\u00020\fJ\u001a\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0\u00180\u000e2\u0006\u0010E\u001a\u00020\fJ\u0016\u0010F\u001a\u00020$2\u0006\u0010E\u001a\u00020\f2\u0006\u0010G\u001a\u00020\fJ\u000e\u0010H\u001a\u00020$2\u0006\u0010I\u001a\u00020\fJ\u001a\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0\u00180\u000e2\u0006\u0010L\u001a\u00020\fJ\"\u0010M\u001a\u00020$2\u0006\u0010&\u001a\u00020\f2\b\b\u0002\u0010N\u001a\u00020\f2\b\b\u0002\u0010O\u001a\u00020\fJ\u000e\u0010P\u001a\u00020$2\u0006\u0010Q\u001a\u00020\fJ(\u0010R\u001a\u00020$2\u0006\u0010E\u001a\u00020\f2\u0006\u0010S\u001a\u00020\f2\u0006\u0010T\u001a\u00020\u00192\b\b\u0002\u0010U\u001a\u00020VJ\u0016\u0010W\u001a\u00020$2\u0006\u0010X\u001a\u00020C2\u0006\u0010Y\u001a\u00020!J.\u0010Z\u001a\u00020$2\u0006\u0010E\u001a\u00020\f2\u0006\u0010S\u001a\u00020\f2\u0006\u0010[\u001a\u00020\f2\u0006\u0010\\\u001a\u00020\f2\u0006\u0010]\u001a\u00020^J\u0016\u0010_\u001a\u00020$2\u0006\u0010X\u001a\u00020C2\u0006\u0010Y\u001a\u00020!J \u0010`\u001a\u00020$2\u0006\u0010E\u001a\u00020\f2\u0006\u0010a\u001a\u00020V2\b\u0010b\u001a\u0004\u0018\u00010\fJ\u0016\u0010c\u001a\u00020$2\u0006\u0010E\u001a\u00020\f2\u0006\u0010d\u001a\u00020\fJ\u000e\u0010e\u001a\u00020$2\u0006\u0010f\u001a\u00020VJ\u0016\u0010g\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u000e2\u0006\u0010E\u001a\u00020\fJ\u0006\u0010h\u001a\u00020$J¿\u0001\u0010i\u001a\u00020$2\u0006\u0010&\u001a\u00020\f2\u0006\u0010N\u001a\u00020\f2\u0006\u0010j\u001a\u00020\f2\n\b\u0002\u0010k\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010l\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010m\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010n\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010o\u001a\u0004\u0018\u00010p2\n\b\u0002\u0010q\u001a\u0004\u0018\u00010p2\n\b\u0002\u0010r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010s\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010t\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010u\u001a\u0004\u0018\u00010V2\n\b\u0002\u0010v\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010w\u001a\u0004\u0018\u00010p¢\u0006\u0002\u0010xJ\u000e\u0010y\u001a\u00020$2\u0006\u0010z\u001a\u00020\u0019J\u001e\u0010{\u001a\b\u0012\u0004\u0012\u00020\f0|2\u0006\u0010}\u001a\u00020\fH\u0086@¢\u0006\u0004\b~\u0010\u007fJ\u000f\u0010\u0080\u0001\u001a\u00020$2\u0006\u0010z\u001a\u00020\u0019J\u000f\u0010\u0081\u0001\u001a\u00020$2\u0006\u0010z\u001a\u00020\u0019J\u000f\u0010\u0082\u0001\u001a\u00020$2\u0006\u0010z\u001a\u00020\u0019J6\u0010\u0083\u0001\u001a\u00020$2\u0006\u0010z\u001a\u00020\u00192\u000b\b\u0002\u0010\u0084\u0001\u001a\u0004\u0018\u00010\f2\u000b\b\u0002\u0010\u0085\u0001\u001a\u0004\u0018\u00010\f2\u000b\b\u0002\u0010\u0086\u0001\u001a\u0004\u0018\u00010\fJ&\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020\f0|2\u0006\u0010z\u001a\u00020\u00192\u0006\u0010}\u001a\u00020\f¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u000f\u0010\u008a\u0001\u001a\u00020$2\u0006\u0010z\u001a\u00020\u0019J\u000f\u0010\u008b\u0001\u001a\u00020$2\u0006\u0010z\u001a\u00020\u0019J\u000f\u0010\u008c\u0001\u001a\u00020$2\u0006\u0010z\u001a\u00020\u0019J6\u0010\u008d\u0001\u001a\u00020$2\u0006\u0010z\u001a\u00020\u00192\u000b\b\u0002\u0010\u0084\u0001\u001a\u0004\u0018\u00010\f2\u000b\b\u0002\u0010\u0085\u0001\u001a\u0004\u0018\u00010\f2\u000b\b\u0002\u0010\u0086\u0001\u001a\u0004\u0018\u00010\fJ&\u0010\u008e\u0001\u001a\b\u0012\u0004\u0012\u00020\f0|2\u0006\u0010z\u001a\u00020\u00192\u0006\u0010}\u001a\u00020\f¢\u0006\u0006\b\u008f\u0001\u0010\u0089\u0001J\u000f\u0010\u0090\u0001\u001a\u00020$2\u0006\u0010z\u001a\u00020\u0019J8\u0010\u0091\u0001\u001a\b\u0012\u0004\u0012\u00020\f0|2\u0006\u0010z\u001a\u00020\u00192\u000b\b\u0002\u0010\u0092\u0001\u001a\u0004\u0018\u00010V2\u000b\b\u0002\u0010\u0093\u0001\u001a\u0004\u0018\u00010\f¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J&\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u00020\f0|2\u0006\u0010z\u001a\u00020\u00192\u0006\u0010}\u001a\u00020\f¢\u0006\u0006\b\u0097\u0001\u0010\u0089\u0001J@\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00020\f0|2\u0006\u0010z\u001a\u00020\u00192\u0006\u0010}\u001a\u00020\f2\u000b\b\u0002\u0010\u0092\u0001\u001a\u0004\u0018\u00010V2\u000b\b\u0002\u0010\u0093\u0001\u001a\u0004\u0018\u00010\f¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u000f\u0010\u009b\u0001\u001a\u00020$2\u0006\u0010z\u001a\u00020\u0019J.\u0010\u009c\u0001\u001a\u00020$2\u0006\u0010z\u001a\u00020\u00192\n\b\u0002\u0010j\u001a\u0004\u0018\u00010\f2\u000b\b\u0002\u0010\u0092\u0001\u001a\u0004\u0018\u00010V¢\u0006\u0003\u0010\u009d\u0001J8\u0010\u009e\u0001\u001a\u000f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u009f\u00012\u0007\u0010 \u0001\u001a\u00020\f2\u0007\u0010¡\u0001\u001a\u00020\f2\u0007\u0010¢\u0001\u001a\u00020\fH\u0086@¢\u0006\u0003\u0010£\u0001J\u000f\u0010¤\u0001\u001a\u00020$2\u0006\u0010E\u001a\u00020\fJ#\u0010¥\u0001\u001a\u00020$2\u0007\u0010¦\u0001\u001a\u00020\f2\u0006\u0010'\u001a\u00020\f2\t\b\u0002\u0010§\u0001\u001a\u00020\fJ\u0018\u0010¨\u0001\u001a\u00020$2\u0007\u0010©\u0001\u001a\u00020\f2\u0006\u0010'\u001a\u00020\fJD\u0010ª\u0001\u001a\u00020$2\u0006\u0010z\u001a\u00020\u00192\u0007\u0010«\u0001\u001a\u00020V2\u0007\u0010¬\u0001\u001a\u00020\f2\u0007\u0010\u00ad\u0001\u001a\u00020V2\u0007\u0010®\u0001\u001a\u00020\f2\u000f\b\u0002\u0010¯\u0001\u001a\b\u0012\u0004\u0012\u00020\f0\u0018J2\u0010°\u0001\u001a\u00020$2\u0006\u0010z\u001a\u00020\u00192\u0007\u0010±\u0001\u001a\u00020V2\u0007\u0010²\u0001\u001a\u00020\f2\u000f\b\u0002\u0010¯\u0001\u001a\b\u0012\u0004\u0012\u00020\f0\u0018J\u0010\u0010³\u0001\u001a\u00020$2\u0007\u0010´\u0001\u001a\u00020\fJ\u001f\u0010µ\u0001\u001a\u00020$2\u0006\u0010E\u001a\u00020\f2\u0006\u0010S\u001a\u00020\f2\u0006\u0010'\u001a\u00020\fJ!\u0010¶\u0001\u001a\u00020V2\u0006\u00108\u001a\u00020\f2\u0007\u0010·\u0001\u001a\u00020VH\u0086@¢\u0006\u0003\u0010¸\u0001J_\u0010¹\u0001\u001a\u00020$2\u0006\u0010E\u001a\u00020\f2\u0006\u0010S\u001a\u00020\f2\u0006\u0010'\u001a\u00020\f2>\u0010º\u0001\u001a9\u0012\u0016\u0012\u00140!¢\u0006\u000f\b¼\u0001\u0012\n\b½\u0001\u0012\u0005\b\b(¾\u0001\u0012\u0016\u0012\u00140\f¢\u0006\u000f\b¼\u0001\u0012\n\b½\u0001\u0012\u0005\b\b(¿\u0001\u0012\u0004\u0012\u00020$0»\u0001J\u001d\u0010À\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Â\u00010\u00180Á\u00012\u0006\u00108\u001a\u00020\fJ\u001d\u0010Ã\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Â\u00010\u00180Á\u00012\u0006\u0010E\u001a\u00020\fJ<\u0010Ä\u0001\u001a\u00030Å\u00012\r\u0010Æ\u0001\u001a\b\u0012\u0004\u0012\u00020C0\u00182\u0007\u0010Ç\u0001\u001a\u00020\f2\u0007\u0010È\u0001\u001a\u00020\f2\b\b\u0002\u0010E\u001a\u00020\fH\u0086@¢\u0006\u0003\u0010É\u0001J\u0019\u0010Ê\u0001\u001a\u00030Å\u00012\r\u0010Æ\u0001\u001a\b\u0012\u0004\u0012\u00020C0\u0018H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010R#\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001e0\u001d0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0010R\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0010R\u0019\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0010R\u001d\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u00180\u000e¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u0010R\u001d\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u000e¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u0010¨\u0006Í\u0001"}, d2 = {"Lcom/example/ui/BookViewModel;", "Landroidx/lifecycle/ViewModel;", "appContext", "Landroid/content/Context;", "repository", "Lcom/example/data/BookRepository;", "sharedPrefs", "Landroid/content/SharedPreferences;", "<init>", "(Landroid/content/Context;Lcom/example/data/BookRepository;Landroid/content/SharedPreferences;)V", "_currentUser", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "currentUser", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentUser", "()Lkotlinx/coroutines/flow/StateFlow;", "_currentDisplayName", "currentDisplayName", "getCurrentDisplayName", "_currentProfilePic", "currentProfilePic", "getCurrentProfilePic", "_localOptimisticBooks", "", "Lcom/example/data/Book;", "allBooks", "getAllBooks", "systemControl", "", "", "getSystemControl", "isInitialBooksLoad", "", "isInitialMessagesLoad", "createNotificationChannel", "", "showNotification", "title", "content", "autoCleanAndEnrichExistingBooks", "_searchQuery", "searchQuery", "getSearchQuery", "insertError", "getInsertError", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "_filterStatus", "filterStatus", "getFilterStatus", "allFeedback", "Lcom/example/data/Feedback;", "getAllFeedback", "filteredBooks", "getFilteredBooks", "login", "username", "displayName", "pictureUrl", "logout", "updateSearchQuery", SearchIntents.EXTRA_QUERY, "updateFilterStatus", "status", "getUser", "Lcom/example/data/User;", "getUserChats", "Lcom/example/data/Message;", "getMessages", "bookId", "markMessagesAsRead", "readerUsername", "markMessagesAsDelivered", "recipientUsername", "getWishlist", "Lcom/example/data/WishlistRequest;", "userEmail", "addToWishlist", "author", "genre", "removeFromWishlist", "id", "sendSwapProposal", "receiver", "offeredBook", "durationDays", "", "respondToSwapProposal", "message", "accept", "sendMeetupProposal", "spotName", "address", "meetupTime", "", "respondToMeetupProposal", "updateReadingProgress", "currentPage", "notes", "confirmHandover", "otherPartyEmail", "updateReadingGoal", "goal", "getBook", "clearInsertError", "addBook", "condition", "imageUrl", "description", "pickupAddress", "mobileNumber", "latitude", "", "longitude", "remarks", "publisher", "publishedDate", "pageCount", "language", "averageRating", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;)V", "toggleBookmark", "book", "handleGlobalQrScan", "Lkotlin/Result;", "rawPayload", "handleGlobalQrScan-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestBook", "acceptRequest", "declineRequest", "transferBookInitiated", "base64Str", "aiCondition", "aiAssessment", "verifyHandoverQr", "verifyHandoverQr-gIAlu-s", "(Lcom/example/data/Book;Ljava/lang/String;)Ljava/lang/Object;", "cancelHandover", "cancelBorrowRequest", "acceptTransfer", "initiateReturn", "verifyReturnQr", "verifyReturnQr-gIAlu-s", "cancelReturn", "confirmAndCompleteReturn", "rating", "review", "confirmAndCompleteReturn-0E7RQCE", "(Lcom/example/data/Book;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/Object;", "verifyAndCompleteHandover", "verifyAndCompleteHandover-gIAlu-s", "verifyAndCompleteReturn", "verifyAndCompleteReturn-BWLJW6A", "(Lcom/example/data/Book;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/Object;", "reportStolen", "returnBook", "(Lcom/example/data/Book;Ljava/lang/String;Ljava/lang/Integer;)V", "verifyBookConditionWithAI", "Lkotlin/Pair;", "bookTitle", "expectedCondition", "imageBase64", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteBook", "addFeedback", "type", "targetUsername", "addReviewForOwner", "ownerName", "submitBorrowerFeedback", "bookRating", "bookReview", "lenderRating", "lenderReview", "tags", "submitLenderFeedback", "borrowerRating", "borrowerReview", "updateProfilePic", "base64", "sendMessage", "deductTrustScore", "pointsToDeduct", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validateAndSendMessage", "onResult", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "isAppropriate", "reason", "getReviews", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/data/Review;", "getReviewsForBook", "analyzeChat", "Lcom/example/ui/BookViewModel$ChatAnalysis;", "messages", "currentUserName", "otherUserName", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFallbackChatAnalysis", "Factory", "ChatAnalysis", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BookViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<String> _currentDisplayName;
    private final MutableStateFlow<String> _currentProfilePic;
    private final MutableStateFlow<String> _currentUser;
    private final MutableStateFlow<String> _filterStatus;
    private final MutableStateFlow<List<Book>> _localOptimisticBooks;
    private final MutableStateFlow<String> _searchQuery;
    private final StateFlow<List<Book>> allBooks;
    private final StateFlow<List<Feedback>> allFeedback;
    private final Context appContext;
    private final StateFlow<String> currentDisplayName;
    private final StateFlow<String> currentProfilePic;
    private final StateFlow<String> currentUser;
    private final StateFlow<String> filterStatus;
    private final StateFlow<List<Book>> filteredBooks;
    private final MutableStateFlow<String> insertError;
    private boolean isInitialBooksLoad;
    private boolean isInitialMessagesLoad;
    private final BookRepository repository;
    private final StateFlow<String> searchQuery;
    private final SharedPreferences sharedPrefs;
    private final StateFlow<Map<String, Object>> systemControl;

    /* JADX INFO: renamed from: com.example.ui.BookViewModel$analyzeChat$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookViewModel.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.BookViewModel", f = "BookViewModel.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {1300, 1334}, m = "analyzeChat", n = {"messages", "currentUserName", "otherUserName", "bookId", "chatHistory", "messages", "currentUserName", "otherUserName", "bookId", "chatHistory", "book", "overdueNote", "prompt", "request", "apiKey"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9"})
    static final class C01021 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        C01021(Continuation<? super C01021> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BookViewModel.this.analyzeChat(null, null, null, null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.example.ui.BookViewModel$deductTrustScore$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookViewModel.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.BookViewModel", f = "BookViewModel.kt", i = {0, 0, 1, 1, 1, 1}, l = {1155, 1158}, m = "deductTrustScore", n = {"username", "pointsToDeduct", "username", "existing", "pointsToDeduct", "newScore"}, s = {"L$0", "I$0", "L$0", "L$1", "I$0", "I$1"})
    static final class C01091 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C01091(Continuation<? super C01091> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BookViewModel.this.deductTrustScore(null, 0, (Continuation) this);
        }
    }

    public final void updateProfilePic(String base64) {
        Intrinsics.checkNotNullParameter(base64, "base64");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x011a  */
    public BookViewModel(Context context, BookRepository bookRepository, SharedPreferences sharedPreferences) {
        String lowerCase;
        CharSequence charSequence;
        String string;
        Intrinsics.checkNotNullParameter(context, "appContext");
        Intrinsics.checkNotNullParameter(bookRepository, "repository");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPrefs");
        this.appContext = context;
        this.repository = bookRepository;
        this.sharedPrefs = sharedPreferences;
        String string2 = sharedPreferences.getString("auth_token", null);
        if (string2 == null || (string = StringsKt.trim(string2).toString()) == null) {
            lowerCase = null;
        } else {
            lowerCase = string.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        }
        MutableStateFlow<String> MutableStateFlow = StateFlowKt.MutableStateFlow(lowerCase);
        this._currentUser = MutableStateFlow;
        this.currentUser = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<String> MutableStateFlow2 = StateFlowKt.MutableStateFlow(sharedPreferences.getString("display_name", null));
        this._currentDisplayName = MutableStateFlow2;
        this.currentDisplayName = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<String> MutableStateFlow3 = StateFlowKt.MutableStateFlow(sharedPreferences.getString("profile_pic", ""));
        this._currentProfilePic = MutableStateFlow3;
        this.currentProfilePic = FlowKt.asStateFlow(MutableStateFlow3);
        Flow flowMutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._localOptimisticBooks = flowMutableStateFlow;
        BookViewModel bookViewModel = this;
        Flow flowStateIn = FlowKt.stateIn(FlowKt.combine(bookRepository.getAllBooks(), flowMutableStateFlow, new BookViewModel$allBooks$1(null)), ViewModelKt.getViewModelScope(bookViewModel), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 5000L, 0L, 2, (Object) null), CollectionsKt.emptyList());
        this.allBooks = flowStateIn;
        this.systemControl = FlowKt.stateIn(bookRepository.getSystemControl(), ViewModelKt.getViewModelScope(bookViewModel), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 5000L, 0L, 2, (Object) null), MapsKt.emptyMap());
        this.isInitialBooksLoad = true;
        this.isInitialMessagesLoad = true;
        createNotificationChannel();
        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
        if (currentUser != null) {
            String displayName = currentUser.getDisplayName();
            String str = displayName;
            if (str != null && !StringsKt.isBlank(str)) {
                CharSequence charSequence2 = (CharSequence) MutableStateFlow2.getValue();
                if (charSequence2 == null || StringsKt.isBlank(charSequence2)) {
                    MutableStateFlow2.setValue(displayName);
                    sharedPreferences.edit().putString("display_name", displayName).apply();
                } else {
                    Object value = MutableStateFlow2.getValue();
                    String str2 = (String) MutableStateFlow.getValue();
                    if (Intrinsics.areEqual(value, str2 != null ? StringsKt.substringBefore$default(str2, "@", (String) null, 2, (Object) null) : null)) {
                        MutableStateFlow2.setValue(displayName);
                        sharedPreferences.edit().putString("display_name", displayName).apply();
                    }
                }
            }
            Uri photoUrl = currentUser.getPhotoUrl();
            String string3 = photoUrl != null ? photoUrl.toString() : null;
            String str3 = string3;
            if (str3 != null && !StringsKt.isBlank(str3) && ((charSequence = (CharSequence) MutableStateFlow3.getValue()) == null || StringsKt.isBlank(charSequence))) {
                MutableStateFlow3.setValue(string3);
                sharedPreferences.edit().putString("profile_pic", string3).apply();
            }
        }
        autoCleanAndEnrichExistingBooks();
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(bookViewModel), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(null), 3, (Object) null);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(bookViewModel), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(null), 3, (Object) null);
        MutableStateFlow<String> MutableStateFlow4 = StateFlowKt.MutableStateFlow("");
        this._searchQuery = MutableStateFlow4;
        Flow flowAsStateFlow = FlowKt.asStateFlow(MutableStateFlow4);
        this.searchQuery = flowAsStateFlow;
        this.insertError = StateFlowKt.MutableStateFlow((Object) null);
        MutableStateFlow<String> MutableStateFlow5 = StateFlowKt.MutableStateFlow("ALL");
        this._filterStatus = MutableStateFlow5;
        Flow flowAsStateFlow2 = FlowKt.asStateFlow(MutableStateFlow5);
        this.filterStatus = flowAsStateFlow2;
        this.allFeedback = FlowKt.stateIn(bookRepository.getAllFeedback(), ViewModelKt.getViewModelScope(bookViewModel), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 5000L, 0L, 2, (Object) null), CollectionsKt.emptyList());
        this.filteredBooks = FlowKt.stateIn(FlowKt.combine(flowStateIn, flowAsStateFlow, flowAsStateFlow2, new BookViewModel$filteredBooks$1(this, null)), ViewModelKt.getViewModelScope(bookViewModel), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 5000L, 0L, 2, (Object) null), CollectionsKt.emptyList());
    }

    public final StateFlow<String> getCurrentUser() {
        return this.currentUser;
    }

    public final StateFlow<String> getCurrentDisplayName() {
        return this.currentDisplayName;
    }

    public final StateFlow<String> getCurrentProfilePic() {
        return this.currentProfilePic;
    }

    public final StateFlow<List<Book>> getAllBooks() {
        return this.allBooks;
    }

    public final StateFlow<Map<String, Object>> getSystemControl() {
        return this.systemControl;
    }

    /* JADX INFO: renamed from: com.example.ui.BookViewModel$1, reason: invalid class name */
    /* JADX INFO: compiled from: BookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.BookViewModel$1", f = "BookViewModel.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BookViewModel.this.new AnonymousClass1(continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<List<Book>> allBooks = BookViewModel.this.getAllBooks();
                final BookViewModel bookViewModel = BookViewModel.this;
                this.label = 1;
                if (allBooks.collect(new FlowCollector() { // from class: com.example.ui.BookViewModel.1.1
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((List<Book>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(List<Book> list, Continuation<? super Unit> continuation) {
                        NotificationService.INSTANCE.checkAndNotifyBooks(bookViewModel.appContext, list, (String) bookViewModel._currentUser.getValue());
                        return Unit.INSTANCE;
                    }
                }, (Continuation) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.example.ui.BookViewModel$2, reason: invalid class name */
    /* JADX INFO: compiled from: BookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.BookViewModel$2", f = "BookViewModel.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BookViewModel.this.new AnonymousClass2(continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow mutableStateFlow = BookViewModel.this._currentUser;
                final BookViewModel bookViewModel = BookViewModel.this;
                this.label = 1;
                if (mutableStateFlow.collect(new FlowCollector() { // from class: com.example.ui.BookViewModel.2.1
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((String) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final String str, Continuation<? super Unit> continuation) {
                        String str2 = str;
                        if (str2 != null && !StringsKt.isBlank(str2)) {
                            Flow<List<Message>> messagesForUser = bookViewModel.repository.getMessagesForUser(str);
                            final BookViewModel bookViewModel2 = bookViewModel;
                            Object objCollect = messagesForUser.collect(new FlowCollector() { // from class: com.example.ui.BookViewModel.2.1.1
                                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation2) {
                                    return emit((List<Message>) obj2, (Continuation<? super Unit>) continuation2);
                                }

                                public final Object emit(List<Message> list, Continuation<? super Unit> continuation2) {
                                    NotificationService.INSTANCE.checkAndNotifyMessages(bookViewModel2.appContext, list, str);
                                    return Unit.INSTANCE;
                                }
                            }, continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    }
                }, (Continuation) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    private final void createNotificationChannel() {
        NotificationHelper.INSTANCE.createNotificationChannel(this.appContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotification(String title, String content) {
        NotificationHelper.INSTANCE.showNotification(this.appContext, title, content);
    }

    /* JADX INFO: renamed from: com.example.ui.BookViewModel$autoCleanAndEnrichExistingBooks$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.BookViewModel$autoCleanAndEnrichExistingBooks$1", f = "BookViewModel.kt", i = {1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, l = {103, 127, 132, 151}, m = "invokeSuspend", n = {"books", "googleBooksKey", "b", "cleanQuery", "needsCleaning", "books", "googleBooksKey", "b", "cleanQuery", "resp", "needsCleaning", "books", "googleBooksKey", "b", "cleanQuery", "resp", "vol", "newTitle", "newAuthor", "updated", "needsCleaning"}, s = {"L$0", "L$1", "L$3", "L$4", "I$0", "L$0", "L$1", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "I$0"})
    static final class C01031 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;

        C01031(Continuation<? super C01031> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BookViewModel.this.new C01031(continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0293 A[Catch: Exception -> 0x026a, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x026a, blocks: (B:82:0x0257, B:84:0x025d, B:86:0x0265, B:94:0x027f, B:96:0x0285, B:100:0x0293, B:110:0x02d1, B:117:0x02e9, B:120:0x02f0, B:125:0x0301, B:130:0x0315, B:134:0x0321, B:138:0x032d, B:142:0x0339), top: B:196:0x0257 }] */
        /* JADX WARN: Code duplicated, block: B:102:0x02af A[Catch: Exception -> 0x0441, TRY_ENTER, TryCatch #13 {Exception -> 0x0441, blocks: (B:92:0x0273, B:97:0x0289, B:103:0x02b3, B:107:0x02c6, B:115:0x02e1, B:123:0x02f9, B:128:0x030d, B:132:0x031b, B:136:0x0327, B:140:0x0333, B:145:0x0359, B:144:0x0355, B:127:0x0309, B:122:0x02f5, B:114:0x02db, B:106:0x02c0, B:102:0x02af), top: B:214:0x0273 }] */
        /* JADX WARN: Code duplicated, block: B:105:0x02bd  */
        /* JADX WARN: Code duplicated, block: B:106:0x02c0 A[Catch: Exception -> 0x0441, TryCatch #13 {Exception -> 0x0441, blocks: (B:92:0x0273, B:97:0x0289, B:103:0x02b3, B:107:0x02c6, B:115:0x02e1, B:123:0x02f9, B:128:0x030d, B:132:0x031b, B:136:0x0327, B:140:0x0333, B:145:0x0359, B:144:0x0355, B:127:0x0309, B:122:0x02f5, B:114:0x02db, B:106:0x02c0, B:102:0x02af), top: B:214:0x0273 }] */
        /* JADX WARN: Code duplicated, block: B:109:0x02d0  */
        /* JADX WARN: Code duplicated, block: B:113:0x02da A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:117:0x02e9 A[Catch: Exception -> 0x026a, TRY_ENTER, TryCatch #4 {Exception -> 0x026a, blocks: (B:82:0x0257, B:84:0x025d, B:86:0x0265, B:94:0x027f, B:96:0x0285, B:100:0x0293, B:110:0x02d1, B:117:0x02e9, B:120:0x02f0, B:125:0x0301, B:130:0x0315, B:134:0x0321, B:138:0x032d, B:142:0x0339), top: B:196:0x0257 }] */
        /* JADX WARN: Code duplicated, block: B:122:0x02f5 A[Catch: Exception -> 0x0441, TRY_ENTER, TryCatch #13 {Exception -> 0x0441, blocks: (B:92:0x0273, B:97:0x0289, B:103:0x02b3, B:107:0x02c6, B:115:0x02e1, B:123:0x02f9, B:128:0x030d, B:132:0x031b, B:136:0x0327, B:140:0x0333, B:145:0x0359, B:144:0x0355, B:127:0x0309, B:122:0x02f5, B:114:0x02db, B:106:0x02c0, B:102:0x02af), top: B:214:0x0273 }] */
        /* JADX WARN: Code duplicated, block: B:125:0x0301 A[Catch: Exception -> 0x026a, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x026a, blocks: (B:82:0x0257, B:84:0x025d, B:86:0x0265, B:94:0x027f, B:96:0x0285, B:100:0x0293, B:110:0x02d1, B:117:0x02e9, B:120:0x02f0, B:125:0x0301, B:130:0x0315, B:134:0x0321, B:138:0x032d, B:142:0x0339), top: B:196:0x0257 }] */
        /* JADX WARN: Code duplicated, block: B:127:0x0309 A[Catch: Exception -> 0x0441, TRY_ENTER, TryCatch #13 {Exception -> 0x0441, blocks: (B:92:0x0273, B:97:0x0289, B:103:0x02b3, B:107:0x02c6, B:115:0x02e1, B:123:0x02f9, B:128:0x030d, B:132:0x031b, B:136:0x0327, B:140:0x0333, B:145:0x0359, B:144:0x0355, B:127:0x0309, B:122:0x02f5, B:114:0x02db, B:106:0x02c0, B:102:0x02af), top: B:214:0x0273 }] */
        /* JADX WARN: Code duplicated, block: B:130:0x0315 A[Catch: Exception -> 0x026a, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x026a, blocks: (B:82:0x0257, B:84:0x025d, B:86:0x0265, B:94:0x027f, B:96:0x0285, B:100:0x0293, B:110:0x02d1, B:117:0x02e9, B:120:0x02f0, B:125:0x0301, B:130:0x0315, B:134:0x0321, B:138:0x032d, B:142:0x0339), top: B:196:0x0257 }] */
        /* JADX WARN: Code duplicated, block: B:134:0x0321 A[Catch: Exception -> 0x026a, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x026a, blocks: (B:82:0x0257, B:84:0x025d, B:86:0x0265, B:94:0x027f, B:96:0x0285, B:100:0x0293, B:110:0x02d1, B:117:0x02e9, B:120:0x02f0, B:125:0x0301, B:130:0x0315, B:134:0x0321, B:138:0x032d, B:142:0x0339), top: B:196:0x0257 }] */
        /* JADX WARN: Code duplicated, block: B:138:0x032d A[Catch: Exception -> 0x026a, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x026a, blocks: (B:82:0x0257, B:84:0x025d, B:86:0x0265, B:94:0x027f, B:96:0x0285, B:100:0x0293, B:110:0x02d1, B:117:0x02e9, B:120:0x02f0, B:125:0x0301, B:130:0x0315, B:134:0x0321, B:138:0x032d, B:142:0x0339), top: B:196:0x0257 }] */
        /* JADX WARN: Code duplicated, block: B:142:0x0339 A[Catch: Exception -> 0x026a, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x026a, blocks: (B:82:0x0257, B:84:0x025d, B:86:0x0265, B:94:0x027f, B:96:0x0285, B:100:0x0293, B:110:0x02d1, B:117:0x02e9, B:120:0x02f0, B:125:0x0301, B:130:0x0315, B:134:0x0321, B:138:0x032d, B:142:0x0339), top: B:196:0x0257 }] */
        /* JADX WARN: Code duplicated, block: B:144:0x0355 A[Catch: Exception -> 0x0441, TRY_ENTER, TryCatch #13 {Exception -> 0x0441, blocks: (B:92:0x0273, B:97:0x0289, B:103:0x02b3, B:107:0x02c6, B:115:0x02e1, B:123:0x02f9, B:128:0x030d, B:132:0x031b, B:136:0x0327, B:140:0x0333, B:145:0x0359, B:144:0x0355, B:127:0x0309, B:122:0x02f5, B:114:0x02db, B:106:0x02c0, B:102:0x02af), top: B:214:0x0273 }] */
        /* JADX WARN: Code duplicated, block: B:149:0x0369  */
        /* JADX WARN: Code duplicated, block: B:150:0x036a A[Catch: Exception -> 0x0382, TRY_LEAVE, TryCatch #11 {Exception -> 0x0382, blocks: (B:147:0x0363, B:150:0x036a), top: B:210:0x0363 }] */
        /* JADX WARN: Code duplicated, block: B:154:0x037c  */
        /* JADX WARN: Code duplicated, block: B:155:0x037d A[Catch: Exception -> 0x026e, TRY_LEAVE, TryCatch #1 {Exception -> 0x026e, blocks: (B:152:0x0376, B:161:0x0395, B:155:0x037d), top: B:190:0x0376 }] */
        /* JADX WARN: Code duplicated, block: B:161:0x0395 A[Catch: Exception -> 0x026e, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x026e, blocks: (B:152:0x0376, B:161:0x0395, B:155:0x037d), top: B:190:0x0376 }] */
        /* JADX WARN: Code duplicated, block: B:163:0x039b A[Catch: Exception -> 0x0445, TRY_ENTER, TryCatch #8 {Exception -> 0x0445, blocks: (B:159:0x038f, B:164:0x039f, B:166:0x03f8, B:163:0x039b), top: B:204:0x038f }] */
        /* JADX WARN: Code duplicated, block: B:166:0x03f8 A[Catch: Exception -> 0x0445, TRY_LEAVE, TryCatch #8 {Exception -> 0x0445, blocks: (B:159:0x038f, B:164:0x039f, B:166:0x03f8, B:163:0x039b), top: B:204:0x038f }] */
        /* JADX WARN: Code duplicated, block: B:173:0x0447  */
        /* JADX WARN: Code duplicated, block: B:192:0x017d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:196:0x0257 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:200:0x0186 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:208:0x01ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:210:0x0363 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:214:0x0273 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:28:0x00cb A[Catch: Exception -> 0x0465, TRY_LEAVE, TryCatch #9 {Exception -> 0x0465, blocks: (B:26:0x00c5, B:28:0x00cb, B:31:0x00e6, B:33:0x00f2, B:35:0x0101, B:37:0x0109, B:40:0x0110, B:42:0x011c, B:44:0x0126, B:50:0x0132, B:19:0x0093, B:25:0x00b8, B:22:0x009c), top: B:206:0x0012 }] */
        /* JADX WARN: Code duplicated, block: B:31:0x00e6 A[Catch: Exception -> 0x0465, TRY_ENTER, TryCatch #9 {Exception -> 0x0465, blocks: (B:26:0x00c5, B:28:0x00cb, B:31:0x00e6, B:33:0x00f2, B:35:0x0101, B:37:0x0109, B:40:0x0110, B:42:0x011c, B:44:0x0126, B:50:0x0132, B:19:0x0093, B:25:0x00b8, B:22:0x009c), top: B:206:0x0012 }] */
        /* JADX WARN: Code duplicated, block: B:48:0x012f  */
        /* JADX WARN: Code duplicated, block: B:50:0x0132 A[Catch: Exception -> 0x0465, TRY_LEAVE, TryCatch #9 {Exception -> 0x0465, blocks: (B:26:0x00c5, B:28:0x00cb, B:31:0x00e6, B:33:0x00f2, B:35:0x0101, B:37:0x0109, B:40:0x0110, B:42:0x011c, B:44:0x0126, B:50:0x0132, B:19:0x0093, B:25:0x00b8, B:22:0x009c), top: B:206:0x0012 }] */
        /* JADX WARN: Code duplicated, block: B:57:0x01cd  */
        /* JADX WARN: Code duplicated, block: B:67:0x01f7 A[Catch: Exception -> 0x0203, TRY_LEAVE, TryCatch #10 {Exception -> 0x0203, blocks: (B:65:0x01ef, B:67:0x01f7), top: B:208:0x01ef }] */
        /* JADX WARN: Code duplicated, block: B:76:0x023e  */
        /* JADX WARN: Code duplicated, block: B:84:0x025d A[Catch: Exception -> 0x026a, TryCatch #4 {Exception -> 0x026a, blocks: (B:82:0x0257, B:84:0x025d, B:86:0x0265, B:94:0x027f, B:96:0x0285, B:100:0x0293, B:110:0x02d1, B:117:0x02e9, B:120:0x02f0, B:125:0x0301, B:130:0x0315, B:134:0x0321, B:138:0x032d, B:142:0x0339), top: B:196:0x0257 }] */
        /* JADX WARN: Code duplicated, block: B:94:0x027f A[Catch: Exception -> 0x026a, TRY_ENTER, TryCatch #4 {Exception -> 0x026a, blocks: (B:82:0x0257, B:84:0x025d, B:86:0x0265, B:94:0x027f, B:96:0x0285, B:100:0x0293, B:110:0x02d1, B:117:0x02e9, B:120:0x02f0, B:125:0x0301, B:130:0x0315, B:134:0x0321, B:138:0x032d, B:142:0x0339), top: B:196:0x0257 }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v10, types: [com.example.api.GoogleBooksResponse, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v13 */
        /* JADX WARN: Type inference failed for: r11v14 */
        /* JADX WARN: Type inference failed for: r11v15 */
        /* JADX WARN: Type inference failed for: r11v16, types: [com.example.api.GoogleBooksResponse, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v21 */
        /* JADX WARN: Type inference failed for: r11v26, types: [com.example.api.GoogleBooksResponse] */
        /* JADX WARN: Type inference failed for: r11v29 */
        /* JADX WARN: Type inference failed for: r11v30 */
        /* JADX WARN: Type inference failed for: r11v31 */
        /* JADX WARN: Type inference failed for: r11v32 */
        /* JADX WARN: Type inference failed for: r11v33 */
        /* JADX WARN: Type inference failed for: r11v8 */
        /* JADX WARN: Type inference failed for: r13v11 */
        /* JADX WARN: Type inference failed for: r13v46 */
        /* JADX WARN: Type inference failed for: r13v47 */
        /* JADX WARN: Type inference failed for: r13v48 */
        /* JADX WARN: Type inference failed for: r13v7, types: [int] */
        /* JADX WARN: Type inference failed for: r13v9 */
        /* JADX WARN: Type inference failed for: r5v16, types: [com.example.api.VolumeInfo, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v24 */
        /* JADX WARN: Type inference failed for: r5v40 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:175:0x044c -> B:177:0x0454). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0208 -> B:177:0x0454). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public final java.lang.Object invokeSuspend(java.lang.Object r68) {
            /*
                Method dump skipped, instruction units count: 1128
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.example.ui.BookViewModel.C01031.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private final void autoCleanAndEnrichExistingBooks() {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new C01031(null), 2, (Object) null);
    }

    public final StateFlow<String> getSearchQuery() {
        return this.searchQuery;
    }

    public final MutableStateFlow<String> getInsertError() {
        return this.insertError;
    }

    public final StateFlow<String> getFilterStatus() {
        return this.filterStatus;
    }

    public final StateFlow<List<Feedback>> getAllFeedback() {
        return this.allFeedback;
    }

    public final StateFlow<List<Book>> getFilteredBooks() {
        return this.filteredBooks;
    }

    public static /* synthetic */ void login$default(BookViewModel bookViewModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = "";
        }
        bookViewModel.login(str, str2, str3);
    }

    public final void login(String username, String displayName, String pictureUrl) {
        String displayName2;
        String strJoinToString$default = displayName;
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(strJoinToString$default, "displayName");
        Intrinsics.checkNotNullParameter(pictureUrl, "pictureUrl");
        String lowerCase = StringsKt.trim(username).toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (StringsKt.isBlank(strJoinToString$default)) {
            strJoinToString$default = null;
        }
        if (strJoinToString$default == null) {
            FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
            if (currentUser == null || (displayName2 = currentUser.getDisplayName()) == null) {
                strJoinToString$default = null;
            } else {
                if (StringsKt.isBlank(displayName2)) {
                    displayName2 = null;
                }
                strJoinToString$default = displayName2;
            }
            if (strJoinToString$default == null) {
                strJoinToString$default = CollectionsKt.joinToString$default(StringsKt.split$default(StringsKt.replace$default(StringsKt.substringBefore$default(lowerCase, "@", (String) null, 2, (Object) null), ".", " ", false, 4, (Object) null), new String[]{" "}, false, 0, 6, (Object) null), " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: com.example.ui.BookViewModel$$ExternalSyntheticLambda1
                    public final Object invoke(Object obj) {
                        return BookViewModel.login$lambda$3((String) obj);
                    }
                }, 30, (Object) null);
            }
        }
        String str = strJoinToString$default;
        this._currentUser.setValue(lowerCase);
        this._currentDisplayName.setValue(str);
        this._currentProfilePic.setValue(pictureUrl);
        this.sharedPrefs.edit().putString("auth_token", lowerCase).putString("display_name", str).putString("profile_pic", pictureUrl).apply();
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new C01121(lowerCase, str, pictureUrl, null), 3, (Object) null);
    }

    static final CharSequence login$lambda$3(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        if (str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            String strValueOf = String.valueOf(str.charAt(0));
            Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            StringBuilder sbAppend = sb.append((Object) upperCase);
            String strSubstring = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            str = sbAppend.append(strSubstring).toString();
        }
        return str;
    }

    /* JADX INFO: renamed from: com.example.ui.BookViewModel$login$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.BookViewModel$login$1", f = "BookViewModel.kt", i = {1, 1, 2}, l = {218, 222, 225}, m = "invokeSuspend", n = {"existingUser", "updatedName", "existingUser"}, s = {"L$0", "L$1", "L$0"})
    static final class C01121 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $authenticName;
        final /* synthetic */ String $normalizedUser;
        final /* synthetic */ String $pictureUrl;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01121(String str, String str2, String str3, Continuation<? super C01121> continuation) {
            super(2, continuation);
            this.$normalizedUser = str;
            this.$authenticName = str2;
            this.$pictureUrl = str3;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BookViewModel.this.new C01121(this.$normalizedUser, this.$authenticName, this.$pictureUrl, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x00da, code lost:
        
            if (r21.this$0.repository.insertUser(new com.example.data.User(r21.$normalizedUser, r21.$authenticName, 0, 0, r21.$pictureUrl, null, false, null, 0, 0, 0.0d, 2028, null), (kotlin.coroutines.Continuation) r21) == r1) goto L36;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instruction units count: 228
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.example.ui.BookViewModel.C01121.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void logout() {
        this.sharedPrefs.edit().clear().apply();
        this._currentUser.setValue((Object) null);
        this._currentDisplayName.setValue((Object) null);
        this._currentProfilePic.setValue((Object) null);
    }

    public final void updateSearchQuery(String query) {
        Intrinsics.checkNotNullParameter(query, SearchIntents.EXTRA_QUERY);
        this._searchQuery.setValue(query);
    }

    public final void updateFilterStatus(String status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this._filterStatus.setValue(status);
    }

    public final StateFlow<User> getUser(String username) {
        Intrinsics.checkNotNullParameter(username, "username");
        return FlowKt.stateIn(this.repository.getUser(username), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 5000L, 0L, 2, (Object) null), (Object) null);
    }

    public final StateFlow<List<Message>> getUserChats(String username) {
        Intrinsics.checkNotNullParameter(username, "username");
        return FlowKt.stateIn(this.repository.getMessagesForUser(username), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 5000L, 0L, 2, (Object) null), CollectionsKt.emptyList());
    }

    public final StateFlow<List<Message>> getMessages(String bookId) {
        Intrinsics.checkNotNullParameter(bookId, "bookId");
        return FlowKt.stateIn(this.repository.getMessagesForBook(bookId), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 5000L, 0L, 2, (Object) null), CollectionsKt.emptyList());
    }

    /* JADX INFO: renamed from: com.example.ui.BookViewModel$markMessagesAsRead$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.BookViewModel$markMessagesAsRead$1", f = "BookViewModel.kt", i = {}, l = {261}, m = "invokeSuspend", n = {}, s = {})
    static final class C01141 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $bookId;
        final /* synthetic */ String $readerUsername;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01141(String str, String str2, Continuation<? super C01141> continuation) {
            super(2, continuation);
            this.$bookId = str;
            this.$readerUsername = str2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BookViewModel.this.new C01141(this.$bookId, this.$readerUsername, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (BookViewModel.this.repository.markMessagesAsRead(this.$bookId, this.$readerUsername, (Continuation) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void markMessagesAsRead(String bookId, String readerUsername) {
        Intrinsics.checkNotNullParameter(bookId, "bookId");
        Intrinsics.checkNotNullParameter(readerUsername, "readerUsername");
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new C01141(bookId, readerUsername, null), 3, (Object) null);
    }

    /* JADX INFO: renamed from: com.example.ui.BookViewModel$markMessagesAsDelivered$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.BookViewModel$markMessagesAsDelivered$1", f = "BookViewModel.kt", i = {}, l = {267}, m = "invokeSuspend", n = {}, s = {})
    static final class C01131 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $recipientUsername;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01131(String str, Continuation<? super C01131> continuation) {
            super(2, continuation);
            this.$recipientUsername = str;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BookViewModel.this.new C01131(this.$recipientUsername, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (BookViewModel.this.repository.markMessagesAsDelivered(this.$recipientUsername, (Continuation) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void markMessagesAsDelivered(String recipientUsername) {
        Intrinsics.checkNotNullParameter(recipientUsername, "recipientUsername");
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new C01131(recipientUsername, null), 3, (Object) null);
    }

    public final StateFlow<List<WishlistRequest>> getWishlist(String userEmail) {
        Intrinsics.checkNotNullParameter(userEmail, "userEmail");
        return FlowKt.stateIn(this.repository.getWishlistForUser(userEmail), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 5000L, 0L, 2, (Object) null), CollectionsKt.emptyList());
    }

    public static /* synthetic */ void addToWishlist$default(BookViewModel bookViewModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        bookViewModel.addToWishlist(str, str2, str3);
    }

    public final void addToWishlist(String title, String author, String genre) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(genre, "genre");
        String str = (String) this.currentUser.getValue();
        if (str == null) {
            return;
        }
        String str2 = title;
        if (StringsKt.isBlank(str2)) {
            return;
        }
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new C01011(new WishlistRequest(null, str, StringsKt.trim(str2).toString(), StringsKt.trim(author).toString(), StringsKt.trim(genre).toString(), 0L, 33, null), title, null), 3, (Object) null);
    }

    /* JADX INFO: renamed from: com.example.ui.BookViewModel$addToWishlist$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.BookViewModel$addToWishlist$1", f = "BookViewModel.kt", i = {}, l = {286}, m = "invokeSuspend", n = {}, s = {})
    static final class C01011 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ WishlistRequest $item;
        final /* synthetic */ String $title;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01011(WishlistRequest wishlistRequest, String str, Continuation<? super C01011> continuation) {
            super(2, continuation);
            this.$item = wishlistRequest;
            this.$title = str;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BookViewModel.this.new C01011(this.$item, this.$title, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (BookViewModel.this.repository.insertWishlist(this.$item, (Continuation) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            BookViewModel.this.showNotification("Added to Wishlist", "'" + StringsKt.trim(this.$title).toString() + "' has been saved! You'll be notified when it's nearby.");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.example.ui.BookViewModel$removeFromWishlist$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.BookViewModel$removeFromWishlist$1", f = "BookViewModel.kt", i = {}, l = {293}, m = "invokeSuspend", n = {}, s = {})
    static final class C01151 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01151(String str, Continuation<? super C01151> continuation) {
            super(2, continuation);
            this.$id = str;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BookViewModel.this.new C01151(this.$id, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (BookViewModel.this.repository.deleteWishlist(this.$id, (Continuation) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void removeFromWishlist(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new C01151(id, null), 3, (Object) null);
    }

    public static /* synthetic */ void sendSwapProposal$default(BookViewModel bookViewModel, String str, String str2, Book book, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = 14;
        }
        bookViewModel.sendSwapProposal(str, str2, book, i);
    }

    public final void sendSwapProposal(String bookId, String receiver, Book offeredBook, int durationDays) {
        Intrinsics.checkNotNullParameter(bookId, "bookId");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(offeredBook, "offeredBook");
        String str = (String) this.currentUser.getValue();
        if (str == null) {
            return;
        }
        String lowerCase = StringsKt.trim(str).toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String lowerCase2 = StringsKt.trim(receiver).toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new C01221(new Message(null, bookId, lowerCase, lowerCase2, CollectionsKt.distinct(CollectionsKt.listOf(new String[]{lowerCase, lowerCase2})), "Proposed a book swap with '" + offeredBook.getTitle() + "' for " + durationDays + " days!", 0L, null, "SWAP_PROPOSAL", offeredBook.getId(), offeredBook.getTitle(), offeredBook.getImageUrl(), Integer.valueOf(durationDays), "PENDING", null, null, null, null, 245953, null), null), 3, (Object) null);
    }

    /* JADX INFO: renamed from: com.example.ui.BookViewModel$sendSwapProposal$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.BookViewModel$sendSwapProposal$1", f = "BookViewModel.kt", i = {}, l = {321}, m = "invokeSuspend", n = {}, s = {})
    static final class C01221 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Message $message;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01221(Message message, Continuation<? super C01221> continuation) {
            super(2, continuation);
            this.$message = message;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BookViewModel.this.new C01221(this.$message, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (BookViewModel.this.repository.insertMessage(this.$message, (Continuation) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void respondToSwapProposal(Message message, boolean accept) {
        String str;
        Intrinsics.checkNotNullParameter(message, "message");
        String str2 = accept ? "ACCEPTED" : "DECLINED";
        if (accept) {
            str = "Accepted the swap proposal for '" + message.getSwapOfferedBookTitle() + "'!";
        } else {
            str = "Declined the swap proposal.";
        }
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new C01191(Message.copy$default(message, null, null, null, null, null, str, 0L, null, null, null, null, null, null, str2, null, null, null, null, 253919, null), accept, message, null), 3, (Object) null);
    }

    /* JADX INFO: renamed from: com.example.ui.BookViewModel$respondToSwapProposal$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.BookViewModel$respondToSwapProposal$1", f = "BookViewModel.kt", i = {2, 2}, l = {331, 333, 341}, m = "invokeSuspend", n = {"book", "updatedBook"}, s = {"L$0", "L$1"})
    static final class C01191 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $accept;
        final /* synthetic */ Message $message;
        final /* synthetic */ Message $updated;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01191(Message message, boolean z, Message message2, Continuation<? super C01191> continuation) {
            super(2, continuation);
            this.$updated = message;
            this.$accept = z;
            this.$message = message2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BookViewModel.this.new C01191(this.$updated, this.$accept, this.$message, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x007e  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00f9, code lost:
        
            if (r52.this$0.repository.updateBook(r2, (kotlin.coroutines.Continuation) r52) == r1) goto L26;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r53) {
            /*
                Method dump skipped, instruction units count: 255
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.example.ui.BookViewModel.C01191.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void sendMeetupProposal(String bookId, String receiver, String spotName, String address, long meetupTime) {
        long j;
        String str;
        Intrinsics.checkNotNullParameter(bookId, "bookId");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(spotName, "spotName");
        Intrinsics.checkNotNullParameter(address, "address");
        String str2 = (String) this.currentUser.getValue();
        if (str2 == null) {
            return;
        }
        String lowerCase = StringsKt.trim(str2).toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String lowerCase2 = StringsKt.trim(receiver).toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        try {
            j = meetupTime;
            try {
                str = new SimpleDateFormat("EEE, MMM d 'at' h:mm a", Locale.getDefault()).format(new Date(j));
            } catch (Exception unused) {
                str = "Upcoming Meetup";
            }
        } catch (Exception unused2) {
            j = meetupTime;
        }
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new C01201(new Message(null, bookId, lowerCase, lowerCase2, CollectionsKt.distinct(CollectionsKt.listOf(new String[]{lowerCase, lowerCase2})), "Proposed a Safe Meetup at '" + spotName + "' on " + str, 0L, null, "SAFE_MEETUP_PROPOSAL", null, null, null, null, null, spotName, address, Long.valueOf(j), "PROPOSED", 16065, null), null), 3, (Object) null);
    }

    /* JADX INFO: renamed from: com.example.ui.BookViewModel$sendMeetupProposal$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.BookViewModel$sendMeetupProposal$1", f = "BookViewModel.kt", i = {}, l = {373}, m = "invokeSuspend", n = {}, s = {})
    static final class C01201 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Message $message;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01201(Message message, Continuation<? super C01201> continuation) {
            super(2, continuation);
            this.$message = message;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BookViewModel.this.new C01201(this.$message, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (BookViewModel.this.repository.insertMessage(this.$message, (Continuation) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void respondToMeetupProposal(Message message, boolean accept) {
        String str;
        Intrinsics.checkNotNullParameter(message, "message");
        String str2 = accept ? "ACCEPTED" : "DECLINED";
        if (accept) {
            String meetupLocation = message.getMeetupLocation();
            if (meetupLocation == null) {
                meetupLocation = "Agreed Spot";
            }
            str = "🤝 Mutually agreed on safe meetup at '" + meetupLocation + "'! See you there.";
        } else {
            str = "Could not make the proposed meetup time/spot. Let's suggest another spot.";
        }
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new C01181(Message.copy$default(message, null, null, null, null, null, str, 0L, null, null, null, null, null, null, null, null, null, null, str2, 131039, null), accept, message, null), 3, (Object) null);
    }

    /* JADX INFO: renamed from: com.example.ui.BookViewModel$respondToMeetupProposal$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.BookViewModel$respondToMeetupProposal$1", f = "BookViewModel.kt", i = {2, 2}, l = {383, 385, 393}, m = "invokeSuspend", n = {"book", "updatedBook"}, s = {"L$0", "L$1"})
    static final class C01181 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $accept;
        final /* synthetic */ Message $message;
        final /* synthetic */ Message $updated;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01181(Message message, boolean z, Message message2, Continuation<? super C01181> continuation) {
            super(2, continuation);
            this.$updated = message;
            this.$accept = z;
            this.$message = message2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BookViewModel.this.new C01181(this.$updated, this.$accept, this.$message, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x007e  */
        /* JADX WARN: Code duplicated, block: B:27:0x0108  */
        /* JADX WARN: Code duplicated, block: B:36:0x011d A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:38:0x0102 A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0147, code lost:
        
            if (r52.this$0.repository.updateBook(r2, (kotlin.coroutines.Continuation) r52) == r1) goto L32;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r53) {
            /*
                Method dump skipped, instruction units count: 333
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.example.ui.BookViewModel.C01181.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.example.ui.BookViewModel$updateReadingProgress$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.BookViewModel$updateReadingProgress$1", f = "BookViewModel.kt", i = {1, 1}, l = {401, 406}, m = "invokeSuspend", n = {"book", "updated"}, s = {"L$0", "L$1"})
    static final class C01281 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $bookId;
        final /* synthetic */ int $currentPage;
        final /* synthetic */ String $notes;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01281(String str, int i, String str2, Continuation<? super C01281> continuation) {
            super(2, continuation);
            this.$bookId = str;
            this.$currentPage = i;
            this.$notes = str2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BookViewModel.this.new C01281(this.$bookId, this.$currentPage, this.$notes, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x00c3, code lost:
        
            if (r52.this$0.repository.updateBook(r2, (kotlin.coroutines.Continuation) r52) == r1) goto L19;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r53) {
            /*
                Method dump skipped, instruction units count: 201
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.example.ui.BookViewModel.C01281.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void updateReadingProgress(String bookId, int currentPage, String notes) {
        Intrinsics.checkNotNullParameter(bookId, "bookId");
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new C01281(bookId, currentPage, notes, null), 3, (Object) null);
    }

    /* JADX INFO: renamed from: com.example.ui.BookViewModel$confirmHandover$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.BookViewModel$confirmHandover$1", f = "BookViewModel.kt", i = {1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 6}, l = {413, 421, 423, 425, 431, 433, 447}, m = "invokeSuspend", n = {"book", "updatedBook", "book", "updatedBook", "book", "updatedBook", "user", "book", "updatedBook", "user", "book", "updatedBook", "user", "owner", "book", "updatedBook", "user", "owner", "msg"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4"})
    static final class C01071 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $bookId;
        final /* synthetic */ String $otherPartyEmail;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01071(String str, String str2, Continuation<? super C01071> continuation) {
            super(2, continuation);
            this.$bookId = str;
            this.$otherPartyEmail = str2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BookViewModel.this.new C01071(this.$bookId, this.$otherPartyEmail, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x00b3  */
        /* JADX WARN: Code duplicated, block: B:20:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:23:0x0136 A[PHI: r2 r7
          0x0136: PHI (r2v10 com.example.data.Book) = (r2v8 com.example.data.Book), (r2v13 com.example.data.Book) binds: [B:21:0x0132, B:11:0x007f] A[DONT_GENERATE, DONT_INLINE]
          0x0136: PHI (r7v5 com.example.data.Book) = (r7v4 com.example.data.Book), (r7v8 com.example.data.Book) binds: [B:21:0x0132, B:11:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:26:0x0158  */
        /* JADX WARN: Code duplicated, block: B:29:0x0162  */
        /* JADX WARN: Code duplicated, block: B:32:0x01a9  */
        /* JADX WARN: Code duplicated, block: B:34:0x01ad A[PHI: r2 r7 r9
          0x01ad: PHI (r2v19 com.example.data.Book) = (r2v14 com.example.data.Book), (r2v22 com.example.data.Book) binds: [B:28:0x0160, B:33:0x01ab] A[DONT_GENERATE, DONT_INLINE]
          0x01ad: PHI (r7v13 com.example.data.Book) = (r7v9 com.example.data.Book), (r7v14 com.example.data.Book) binds: [B:28:0x0160, B:33:0x01ab] A[DONT_GENERATE, DONT_INLINE]
          0x01ad: PHI (r9v8 com.example.data.User) = (r9v7 com.example.data.User), (r9v10 com.example.data.User) binds: [B:28:0x0160, B:33:0x01ab] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:37:0x01db  */
        /* JADX WARN: Code duplicated, block: B:40:0x01e5  */
        /* JADX WARN: Code duplicated, block: B:43:0x0233  */
        /* JADX WARN: Code duplicated, block: B:45:0x023b A[PHI: r2 r7 r9 r10
          0x023b: PHI (r2v29 com.example.data.User) = (r2v25 com.example.data.User), (r2v35 com.example.data.User) binds: [B:39:0x01e3, B:44:0x0237] A[DONT_GENERATE, DONT_INLINE]
          0x023b: PHI (r7v21 com.example.data.Book) = (r7v17 com.example.data.Book), (r7v23 com.example.data.Book) binds: [B:39:0x01e3, B:44:0x0237] A[DONT_GENERATE, DONT_INLINE]
          0x023b: PHI (r9v13 com.example.data.Book) = (r9v11 com.example.data.Book), (r9v14 com.example.data.Book) binds: [B:39:0x01e3, B:44:0x0237] A[DONT_GENERATE, DONT_INLINE]
          0x023b: PHI (r10v14 com.example.data.User) = (r10v13 com.example.data.User), (r10v15 com.example.data.User) binds: [B:39:0x01e3, B:44:0x0237] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:47:0x024f  */
        /* JADX WARN: Code duplicated, block: B:51:0x0277  */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x02ec, code lost:
        
            if (r56.this$0.repository.insertMessage(r11, (kotlin.coroutines.Continuation) r56) == r1) goto L54;
         */
        /* JADX WARN: Instruction removed from duplicated block: B:45:0x023b, please report this as an issue */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r57) {
            /*
                Method dump skipped, instruction units count: 774
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.example.ui.BookViewModel.C01071.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void confirmHandover(String bookId, String otherPartyEmail) {
        Intrinsics.checkNotNullParameter(bookId, "bookId");
        Intrinsics.checkNotNullParameter(otherPartyEmail, "otherPartyEmail");
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new C01071(bookId, otherPartyEmail, null), 3, (Object) null);
    }

    /* JADX INFO: renamed from: com.example.ui.BookViewModel$updateReadingGoal$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.BookViewModel$updateReadingGoal$1", f = "BookViewModel.kt", i = {1, 2}, l = {454, 456, 458}, m = "invokeSuspend", n = {"user", "user"}, s = {"L$0", "L$0"})
    static final class C01271 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $email;
        final /* synthetic */ int $goal;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01271(String str, int i, Continuation<? super C01271> continuation) {
            super(2, continuation);
            this.$email = str;
            this.$goal = i;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BookViewModel.this.new C01271(this.$email, this.$goal, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
        
            if (r2.repository.updateUser(com.example.data.User.copy$default(r5, null, null, 0, 0, null, null, false, null, r21.$goal, 0, 0.0d, 1791, null), (kotlin.coroutines.Continuation) r21) == r1) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00a3, code lost:
        
            if (r2.repository.insertUser(new com.example.data.User(r21.$email, null, 0, 0, null, null, false, null, r21.$goal, 0, 0.0d, 1790, null), (kotlin.coroutines.Continuation) r21) == r1) goto L22;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                r21 = this;
                r0 = r21
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L2b
                if (r2 == r5) goto L25
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                goto L1c
            L14:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L1c:
                java.lang.Object r0 = r0.L$0
                com.example.data.User r0 = (com.example.data.User) r0
                kotlin.ResultKt.throwOnFailure(r22)
                goto La6
            L25:
                kotlin.ResultKt.throwOnFailure(r22)
                r2 = r22
                goto L46
            L2b:
                kotlin.ResultKt.throwOnFailure(r22)
                com.example.ui.BookViewModel r2 = com.example.ui.BookViewModel.this
                com.example.data.BookRepository r2 = com.example.ui.BookViewModel.access$getRepository$p(r2)
                java.lang.String r6 = r0.$email
                kotlinx.coroutines.flow.Flow r2 = r2.getUser(r6)
                r6 = r0
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                r0.label = r5
                java.lang.Object r2 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r2, r6)
                if (r2 != r1) goto L46
                goto La5
            L46:
                r5 = r2
                com.example.data.User r5 = (com.example.data.User) r5
                com.example.ui.BookViewModel r2 = com.example.ui.BookViewModel.this
                if (r5 == 0) goto L78
                com.example.data.BookRepository r2 = com.example.ui.BookViewModel.access$getRepository$p(r2)
                int r14 = r0.$goal
                r18 = 1791(0x6ff, float:2.51E-42)
                r19 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r15 = 0
                r16 = 0
                com.example.data.User r3 = com.example.data.User.copy$default(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19)
                r6 = r0
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
                r0.L$0 = r5
                r0.label = r4
                java.lang.Object r0 = r2.updateUser(r3, r6)
                if (r0 != r1) goto La6
                goto La5
            L78:
                com.example.data.BookRepository r2 = com.example.ui.BookViewModel.access$getRepository$p(r2)
                com.example.data.User r6 = new com.example.data.User
                java.lang.String r7 = r0.$email
                int r15 = r0.$goal
                r19 = 1790(0x6fe, float:2.508E-42)
                r20 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r16 = 0
                r17 = 0
                r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r20)
                r4 = r0
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
                r0.L$0 = r5
                r0.label = r3
                java.lang.Object r0 = r2.insertUser(r6, r4)
                if (r0 != r1) goto La6
            La5:
                return r1
            La6:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.example.ui.BookViewModel.C01271.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void updateReadingGoal(int goal) {
        String str = (String) this.currentUser.getValue();
        if (str == null) {
            return;
        }
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new C01271(str, goal, null), 3, (Object) null);
    }

    public final StateFlow<Book> getBook(String bookId) {
        Intrinsics.checkNotNullParameter(bookId, "bookId");
        return FlowKt.stateIn(this.repository.getBookById(bookId), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 5000L, 0L, 2, (Object) null), (Object) null);
    }

    public final void clearInsertError() {
        this.insertError.setValue((Object) null);
    }

    public final void addBook(String title, String author, String condition, String imageUrl, String description, String genre, String pickupAddress, String mobileNumber, Double latitude, Double longitude, String remarks, String publisher, String publishedDate, Integer pageCount, String language, Double averageRating) {
        String string;
        String string2;
        Uri photoUrl;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(condition, "condition");
        String string3 = (String) this.currentUser.getValue();
        if (string3 == null && (string3 = this.sharedPrefs.getString("auth_token", null)) == null) {
            FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
            string3 = currentUser != null ? currentUser.getEmail() : null;
            if (string3 == null) {
                string3 = "community_member";
            }
        }
        String str = string3;
        CharSequence charSequence = (CharSequence) this._currentUser.getValue();
        if (charSequence == null || StringsKt.isBlank(charSequence)) {
            this._currentUser.setValue(str);
        }
        CharSequence charSequence2 = (CharSequence) this.currentDisplayName.getValue();
        if (charSequence2 != null && !StringsKt.isBlank(charSequence2)) {
            Object value = this.currentDisplayName.getValue();
            Intrinsics.checkNotNull(value);
            string = (String) value;
        } else {
            string = this.sharedPrefs.getString("display_name", null);
            if (string == null) {
                FirebaseUser currentUser2 = FirebaseAuth.getInstance().getCurrentUser();
                string = currentUser2 != null ? currentUser2.getDisplayName() : null;
                if (string == null) {
                    string = StringsKt.substringBefore$default(str, "@", (String) null, 2, (Object) null);
                }
            }
        }
        String str2 = string;
        CharSequence charSequence3 = (CharSequence) this.currentProfilePic.getValue();
        if (charSequence3 != null && !StringsKt.isBlank(charSequence3)) {
            string2 = (String) this.currentProfilePic.getValue();
        } else {
            string2 = this.sharedPrefs.getString("profile_pic", null);
            if (string2 == null) {
                FirebaseUser currentUser3 = FirebaseAuth.getInstance().getCurrentUser();
                string2 = (currentUser3 == null || (photoUrl = currentUser3.getPhotoUrl()) == null) ? null : photoUrl.toString();
            }
        }
        String str3 = (string2 == null || string2.length() <= 500000) ? string2 : null;
        String string4 = StringsKt.trim(title).toString();
        String string5 = StringsKt.trim(author).toString();
        String str4 = !StringsKt.isBlank(condition) ? condition : "Good";
        String str5 = (imageUrl == null || imageUrl.length() <= 800000) ? imageUrl : null;
        String string6 = description != null ? StringsKt.trim(description).toString() : null;
        String str6 = pickupAddress;
        Book book = new Book(null, string4, string5, str4, str, str2, str3, false, null, null, null, System.currentTimeMillis(), str5, null, (str6 == null || StringsKt.isBlank(str6)) ? "Available for Pickup" : StringsKt.trim(str6).toString(), mobileNumber != null ? StringsKt.trim(mobileNumber).toString() : null, latitude, longitude, genre, string6, null, null, null, null, null, null, false, false, 0, publisher != null ? StringsKt.trim(publisher).toString() : null, publishedDate != null ? StringsKt.trim(publishedDate).toString() : null, pageCount, language != null ? StringsKt.trim(language).toString() : null, averageRating, genre, remarks != null ? StringsKt.trim(remarks).toString() : null, null, null, 0, null, null, null, null, 535832449, 2032, null);
        MutableStateFlow<List<Book>> mutableStateFlow = this._localOptimisticBooks;
        List listListOf = CollectionsKt.listOf(book);
        Iterable iterable = (Iterable) this._localOptimisticBooks.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!Intrinsics.areEqual(((Book) obj).getId(), book.getId())) {
                arrayList.add(obj);
            }
        }
        mutableStateFlow.setValue(CollectionsKt.plus(listListOf, arrayList));
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new C00982(book, mobileNumber, str, null), 3, (Object) null);
    }

    /* JADX INFO: renamed from: com.example.ui.BookViewModel$addBook$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.BookViewModel$addBook$2", f = "BookViewModel.kt", i = {0, 1, 2, 3, 3}, l = {531, 537, 541, 543}, m = "invokeSuspend", n = {"auth", "auth", "auth", "auth", "existingUser"}, s = {"L$0", "L$0", "L$0", "L$0", "L$1"})
    static final class C00982 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Book $book;
        final /* synthetic */ String $mobileNumber;
        final /* synthetic */ String $user;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C00982(Book book, String str, String str2, Continuation<? super C00982> continuation) {
            super(2, continuation);
            this.$book = book;
            this.$mobileNumber = str;
            this.$user = str2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BookViewModel.this.new C00982(this.$book, this.$mobileNumber, this.$user, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:37:0x00b3  */
        /* JADX WARN: Code duplicated, block: B:38:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:41:0x00bb A[Catch: Exception -> 0x0126, TryCatch #2 {Exception -> 0x0126, blocks: (B:9:0x0020, B:14:0x0031, B:47:0x00e1, B:49:0x00e6, B:17:0x003c, B:39:0x00b5, B:41:0x00bb, B:44:0x00c3, B:35:0x009a, B:34:0x007f, B:25:0x004f), top: B:67:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:46:0x00e0  */
        /* JADX WARN: Code duplicated, block: B:47:0x00e1 A[Catch: Exception -> 0x0126, PHI: r0 r2
          0x00e1: PHI (r0v18 com.google.firebase.auth.FirebaseAuth) = (r0v17 com.google.firebase.auth.FirebaseAuth), (r0v27 com.google.firebase.auth.FirebaseAuth) binds: [B:45:0x00de, B:15:0x0034] A[DONT_GENERATE, DONT_INLINE]
          0x00e1: PHI (r2v16 java.lang.Object) = (r2v15 java.lang.Object), (r2v19 java.lang.Object) binds: [B:45:0x00de, B:15:0x0034] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {Exception -> 0x0126, blocks: (B:9:0x0020, B:14:0x0031, B:47:0x00e1, B:49:0x00e6, B:17:0x003c, B:39:0x00b5, B:41:0x00bb, B:44:0x00c3, B:35:0x009a, B:34:0x007f, B:25:0x004f), top: B:67:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:49:0x00e6 A[Catch: Exception -> 0x0126, TRY_LEAVE, TryCatch #2 {Exception -> 0x0126, blocks: (B:9:0x0020, B:14:0x0031, B:47:0x00e1, B:49:0x00e6, B:17:0x003c, B:39:0x00b5, B:41:0x00bb, B:44:0x00c3, B:35:0x009a, B:34:0x007f, B:25:0x004f), top: B:67:0x000e }] */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0123, code lost:
        
            if (r23.this$0.repository.updateUser(com.example.data.User.copy$default(r8, null, null, 0, 0, null, kotlin.text.StringsKt.trim(r23.$mobileNumber).toString(), false, null, 0, 0, 0.0d, 2015, null), (kotlin.coroutines.Continuation) r23) == r3) goto L51;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                Method dump skipped, instruction units count: 353
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.example.ui.BookViewModel.C00982.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void toggleBookmark(Book book) {
        Intrinsics.checkNotNullParameter(book, "book");
        String str = (String) this.currentUser.getValue();
        if (str == null) {
            return;
        }
        List mutableList = CollectionsKt.toMutableList(book.getBookmarkedBy());
        if (mutableList.contains(str)) {
            mutableList.remove(str);
        } else {
            mutableList.add(str);
        }
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new C01251(book, mutableList, null), 3, (Object) null);
    }

    /* JADX INFO: renamed from: com.example.ui.BookViewModel$toggleBookmark$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.BookViewModel$toggleBookmark$1", f = "BookViewModel.kt", i = {}, l = {566}, m = "invokeSuspend", n = {}, s = {})
    static final class C01251 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Book $book;
        final /* synthetic */ List<String> $currentBookmarks;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01251(Book book, List<String> list, Continuation<? super C01251> continuation) {
            super(2, continuation);
            this.$book = book;
            this.$currentBookmarks = list;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BookViewModel.this.new C01251(this.$book, this.$currentBookmarks, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (BookViewModel.this.repository.updateBook(Book.copy$default(this.$book, null, null, null, null, null, null, null, false, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, null, null, null, null, null, null, null, this.$currentBookmarks, 0, null, null, null, null, -1, 2015, null), (Continuation) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX INFO: renamed from: handleGlobalQrScan-gIAlu-s, reason: not valid java name */
    public final Object m162handleGlobalQrScangIAlus(String str, Continuation<? super Result<String>> continuation) {
        BookViewModel$handleGlobalQrScan$1 bookViewModel$handleGlobalQrScan$1;
        String strOptString;
        String strOptString2;
        Object obj;
        String str2;
        String str3;
        if (continuation instanceof BookViewModel$handleGlobalQrScan$1) {
            bookViewModel$handleGlobalQrScan$1 = (BookViewModel$handleGlobalQrScan$1) continuation;
            if ((bookViewModel$handleGlobalQrScan$1.label & Integer.MIN_VALUE) != 0) {
                bookViewModel$handleGlobalQrScan$1.label -= Integer.MIN_VALUE;
            } else {
                bookViewModel$handleGlobalQrScan$1 = new BookViewModel$handleGlobalQrScan$1(this, continuation);
            }
        } else {
            bookViewModel$handleGlobalQrScan$1 = new BookViewModel$handleGlobalQrScan$1(this, continuation);
        }
        Object objFirstOrNull = bookViewModel$handleGlobalQrScan$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = bookViewModel$handleGlobalQrScan$1.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(objFirstOrNull);
                QrPayload qrPayload = QRCodeHelper.INSTANCE.parseQrPayload(str);
                if (qrPayload != null) {
                    strOptString = qrPayload.getType();
                    strOptString2 = qrPayload.getBookId();
                    obj = qrPayload;
                } else {
                    JSONObject jSONObject = new JSONObject(str);
                    strOptString = jSONObject.optString("type");
                    strOptString2 = jSONObject.optString("bookId");
                    obj = jSONObject;
                }
                String str4 = strOptString2;
                if (str4 != null && !StringsKt.isBlank(str4)) {
                    Flow<Book> bookById = this.repository.getBookById(strOptString2);
                    bookViewModel$handleGlobalQrScan$1.L$0 = str;
                    bookViewModel$handleGlobalQrScan$1.L$1 = SpillingKt.nullOutSpilledVariable(obj);
                    bookViewModel$handleGlobalQrScan$1.L$2 = strOptString;
                    bookViewModel$handleGlobalQrScan$1.L$3 = SpillingKt.nullOutSpilledVariable(strOptString2);
                    bookViewModel$handleGlobalQrScan$1.label = 1;
                    objFirstOrNull = FlowKt.firstOrNull(bookById, bookViewModel$handleGlobalQrScan$1);
                    if (objFirstOrNull == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str2 = str;
                    str3 = strOptString;
                }
                Result.Companion companion = Result.Companion;
                return Result.constructor-impl(ResultKt.createFailure(new Exception("Invalid QR code: missing book ID")));
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = (String) bookViewModel$handleGlobalQrScan$1.L$2;
            str2 = (String) bookViewModel$handleGlobalQrScan$1.L$0;
            ResultKt.throwOnFailure(objFirstOrNull);
            Book book = (Book) objFirstOrNull;
            if (book == null) {
                Result.Companion companion2 = Result.Companion;
                return Result.constructor-impl(ResultKt.createFailure(new Exception("Book not found!")));
            }
            if (Intrinsics.areEqual(str3, "HANDOVER")) {
                return m165verifyHandoverQrgIAlus(book, str2);
            }
            if (Intrinsics.areEqual(str3, "RETURN")) {
                return m166verifyReturnQrgIAlus(book, str2);
            }
            Result.Companion companion3 = Result.Companion;
            return Result.constructor-impl(ResultKt.createFailure(new Exception("Unknown QR Type")));
        } catch (Exception unused) {
            Result.Companion companion4 = Result.Companion;
            return Result.constructor-impl(ResultKt.createFailure(new Exception("Invalid QR format")));
        }
    }

    public final void requestBook(Book book) {
        String string;
        Intrinsics.checkNotNullParameter(book, "book");
        String str = (String) this.currentUser.getValue();
        if (str == null || (string = StringsKt.trim(str).toString()) == null) {
            return;
        }
        String lowerCase = string.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (lowerCase == null) {
            return;
        }
        Book bookCopy$default = Book.copy$default(book, null, null, null, null, null, null, null, false, null, lowerCase, "REQUESTED", 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, -1537, 2047, null);
        MutableStateFlow<List<Book>> mutableStateFlow = this._localOptimisticBooks;
        List listListOf = CollectionsKt.listOf(bookCopy$default);
        Iterable iterable = (Iterable) this._localOptimisticBooks.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!Intrinsics.areEqual(((Book) obj).getId(), bookCopy$default.getId())) {
                arrayList.add(obj);
            }
        }
        mutableStateFlow.setValue(CollectionsKt.plus(listListOf, arrayList));
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new C01172(bookCopy$default, book, lowerCase, null), 3, (Object) null);
    }

    /* JADX INFO: renamed from: com.example.ui.BookViewModel$requestBook$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.BookViewModel$requestBook$2", f = "BookViewModel.kt", i = {}, l = {601}, m = "invokeSuspend", n = {}, s = {})
    static final class C01172 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Book $book;
        final /* synthetic */ Book $updated;
        final /* synthetic */ String $user;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01172(Book book, Book book2, String str, Continuation<? super C01172> continuation) {
            super(2, continuation);
            this.$updated = book;
            this.$book = book2;
            this.$user = str;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BookViewModel.this.new C01172(this.$updated, this.$book, this.$user, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (BookViewModel.this.repository.updateBook(this.$updated, (Continuation) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            String string = StringsKt.trim(this.$book.getOwnerName()).toString();
            if (!StringsKt.isBlank(string) && !StringsKt.equals(string, this.$user, true)) {
                BookViewModel.this.sendMessage(this.$book.getId(), string, "Hi! I just requested to borrow '" + this.$book.getTitle() + "'. Can we coordinate?");
            }
            return Unit.INSTANCE;
        }
    }

    public final void acceptRequest(Book book) {
        String string;
        Intrinsics.checkNotNullParameter(book, "book");
        String requestedByName = book.getRequestedByName();
        if (requestedByName == null) {
            requestedByName = book.getBorrowerName();
        }
        if (requestedByName == null || (string = StringsKt.trim(requestedByName).toString()) == null) {
            return;
        }
        String lowerCase = string.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (lowerCase == null) {
            return;
        }
        Book bookCopy$default = Book.copy$default(book, null, null, null, null, null, null, null, false, lowerCase, null, "PENDING_TRANSFER", 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, -1281, 2047, null);
        MutableStateFlow<List<Book>> mutableStateFlow = this._localOptimisticBooks;
        List listListOf = CollectionsKt.listOf(bookCopy$default);
        Iterable iterable = (Iterable) this._localOptimisticBooks.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!Intrinsics.areEqual(((Book) obj).getId(), bookCopy$default.getId())) {
                arrayList.add(obj);
            }
        }
        mutableStateFlow.setValue(CollectionsKt.plus(listListOf, arrayList));
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new C00962(bookCopy$default, book, lowerCase, null), 3, (Object) null);
    }

    /* JADX INFO: renamed from: com.example.ui.BookViewModel$acceptRequest$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.BookViewModel$acceptRequest$2", f = "BookViewModel.kt", i = {}, l = {618}, m = "invokeSuspend", n = {}, s = {})
    static final class C00962 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Book $book;
        final /* synthetic */ String $requestedBy;
        final /* synthetic */ Book $updated;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C00962(Book book, Book book2, String str, Continuation<? super C00962> continuation) {
            super(2, continuation);
            this.$updated = book;
            this.$book = book2;
            this.$requestedBy = str;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BookViewModel.this.new C00962(this.$updated, this.$book, this.$requestedBy, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (BookViewModel.this.repository.updateBook(this.$updated, (Continuation) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            BookViewModel.this.sendMessage(this.$book.getId(), this.$requestedBy, "I accepted your request to borrow '" + this.$book.getTitle() + "'! Let's arrange a handover.");
            return Unit.INSTANCE;
        }
    }

    public final void declineRequest(Book book) {
        String lowerCase;
        String string;
        Intrinsics.checkNotNullParameter(book, "book");
        String requestedByName = book.getRequestedByName();
        if (requestedByName == null) {
            requestedByName = book.getBorrowerName();
        }
        if (requestedByName == null || (string = StringsKt.trim(requestedByName).toString()) == null) {
            lowerCase = null;
        } else {
            lowerCase = string.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        }
        Book bookCopy$default = Book.copy$default(book, null, null, null, null, null, null, null, false, null, null, "AVAILABLE", 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, -1537, 2047, null);
        MutableStateFlow<List<Book>> mutableStateFlow = this._localOptimisticBooks;
        List listListOf = CollectionsKt.listOf(bookCopy$default);
        Iterable iterable = (Iterable) this._localOptimisticBooks.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!Intrinsics.areEqual(((Book) obj).getId(), bookCopy$default.getId())) {
                arrayList.add(obj);
            }
        }
        mutableStateFlow.setValue(CollectionsKt.plus(listListOf, arrayList));
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new C01082(bookCopy$default, lowerCase, book, null), 3, (Object) null);
    }

    /* JADX INFO: renamed from: com.example.ui.BookViewModel$declineRequest$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.BookViewModel$declineRequest$2", f = "BookViewModel.kt", i = {}, l = {632}, m = "invokeSuspend", n = {}, s = {})
    static final class C01082 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Book $book;
        final /* synthetic */ String $requestedBy;
        final /* synthetic */ Book $updated;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01082(Book book, String str, Book book2, Continuation<? super C01082> continuation) {
            super(2, continuation);
            this.$updated = book;
            this.$requestedBy = str;
            this.$book = book2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BookViewModel.this.new C01082(this.$updated, this.$requestedBy, this.$book, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (BookViewModel.this.repository.updateBook(this.$updated, (Continuation) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            String str = this.$requestedBy;
            if (str != null && !StringsKt.isBlank(str)) {
                BookViewModel.this.sendMessage(this.$book.getId(), this.$requestedBy, "Your borrow request for '" + this.$book.getTitle() + "' was declined.");
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void transferBookInitiated$default(BookViewModel bookViewModel, Book book, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        bookViewModel.transferBookInitiated(book, str, str2, str3);
    }

    public final void transferBookInitiated(Book book, String base64Str, String aiCondition, String aiAssessment) {
        Intrinsics.checkNotNullParameter(book, "book");
        Book bookCopy$default = Book.copy$default(book, null, null, null, null, null, null, null, false, null, null, "PENDING_RECEIPT", 0L, null, null, null, null, null, null, null, null, base64Str, null, aiCondition, aiAssessment, null, null, false, false, 0, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, -80741377, 2047, null);
        MutableStateFlow<List<Book>> mutableStateFlow = this._localOptimisticBooks;
        List listListOf = CollectionsKt.listOf(bookCopy$default);
        Iterable iterable = (Iterable) this._localOptimisticBooks.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!Intrinsics.areEqual(((Book) obj).getId(), bookCopy$default.getId())) {
                arrayList.add(obj);
            }
        }
        mutableStateFlow.setValue(CollectionsKt.plus(listListOf, arrayList));
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new C01262(bookCopy$default, book, aiCondition, null), 3, (Object) null);
    }

    /* JADX INFO: renamed from: com.example.ui.BookViewModel$transferBookInitiated$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.BookViewModel$transferBookInitiated$2", f = "BookViewModel.kt", i = {}, l = {658}, m = "invokeSuspend", n = {}, s = {})
    static final class C01262 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $aiCondition;
        final /* synthetic */ Book $book;
        final /* synthetic */ Book $updated;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01262(Book book, Book book2, String str, Continuation<? super C01262> continuation) {
            super(2, continuation);
            this.$updated = book;
            this.$book = book2;
            this.$aiCondition = str;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BookViewModel.this.new C01262(this.$updated, this.$book, this.$aiCondition, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (BookViewModel.this.repository.updateBook(this.$updated, (Continuation) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            String borrowerName = this.$book.getBorrowerName();
            if (borrowerName == null) {
                borrowerName = this.$book.getRequestedByName();
            }
            String str = borrowerName;
            if (str != null && !StringsKt.isBlank(str)) {
                BookViewModel bookViewModel = BookViewModel.this;
                String id = this.$book.getId();
                String title = this.$book.getTitle();
                String str2 = this.$aiCondition;
                if (str2 == null) {
                    str2 = "Verified";
                }
                bookViewModel.sendMessage(id, borrowerName, "Lender scanned '" + title + "' for handover! AI Condition: " + str2 + ". Lender will now show their Handover QR code for you to scan.");
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: verifyHandoverQr-gIAlu-s, reason: not valid java name */
    public final Object m165verifyHandoverQrgIAlus(Book book, String rawPayload) {
        Intrinsics.checkNotNullParameter(book, "book");
        Intrinsics.checkNotNullParameter(rawPayload, "rawPayload");
        QrPayload qrPayload = QRCodeHelper.INSTANCE.parseQrPayload(rawPayload);
        if (qrPayload == null) {
            Result.Companion companion = Result.Companion;
            return Result.constructor-impl(ResultKt.createFailure(new Exception("Invalid QR code format. Please ensure the QR code was generated by BookXchange.")));
        }
        if (!Intrinsics.areEqual(qrPayload.getType(), "HANDOVER")) {
            Result.Companion companion2 = Result.Companion;
            return Result.constructor-impl(ResultKt.createFailure(new Exception("Scanned code type is " + qrPayload.getType() + ", expected BookXchange transfer QR.")));
        }
        if (!StringsKt.equals(qrPayload.getBookId(), book.getId(), true)) {
            Result.Companion companion3 = Result.Companion;
            return Result.constructor-impl(ResultKt.createFailure(new Exception("QR code belongs to a different book!")));
        }
        if (qrPayload.getUserEmail() == null) {
            Result.Companion companion4 = Result.Companion;
            return Result.constructor-impl(ResultKt.createFailure(new Exception("QR code belongs to a different user. Expected borrower's QR.")));
        }
        acceptTransfer(book);
        Result.Companion companion5 = Result.Companion;
        return Result.constructor-impl("Handover QR verified! Handover completed successfully.");
    }

    public final void cancelHandover(Book book) {
        Intrinsics.checkNotNullParameter(book, "book");
        String requestedByName = book.getRequestedByName();
        if (requestedByName == null) {
            requestedByName = book.getBorrowerName();
        }
        Book bookCopy$default = Book.copy$default(book, null, null, null, null, null, null, null, false, null, null, "AVAILABLE", 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, -80742145, 2047, null);
        MutableStateFlow<List<Book>> mutableStateFlow = this._localOptimisticBooks;
        List listListOf = CollectionsKt.listOf(bookCopy$default);
        Iterable iterable = (Iterable) this._localOptimisticBooks.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!Intrinsics.areEqual(((Book) obj).getId(), bookCopy$default.getId())) {
                arrayList.add(obj);
            }
        }
        mutableStateFlow.setValue(CollectionsKt.plus(listListOf, arrayList));
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new C01052(bookCopy$default, requestedByName, book, null), 3, (Object) null);
    }

    /* JADX INFO: renamed from: com.example.ui.BookViewModel$cancelHandover$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.BookViewModel$cancelHandover$2", f = "BookViewModel.kt", i = {}, l = {715}, m = "invokeSuspend", n = {}, s = {})
    static final class C01052 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Book $book;
        final /* synthetic */ String $borrower;
        final /* synthetic */ Book $updated;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01052(Book book, String str, Book book2, Continuation<? super C01052> continuation) {
            super(2, continuation);
            this.$updated = book;
            this.$borrower = str;
            this.$book = book2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BookViewModel.this.new C01052(this.$updated, this.$borrower, this.$book, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (BookViewModel.this.repository.updateBook(this.$updated, (Continuation) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            String str = this.$borrower;
            if (str != null && !StringsKt.isBlank(str)) {
                BookViewModel.this.sendMessage(this.$book.getId(), this.$borrower, "Handover for '" + this.$book.getTitle() + "' was canceled. The book is now available for borrowing again.");
            }
            return Unit.INSTANCE;
        }
    }

    public final void cancelBorrowRequest(Book book) {
        Intrinsics.checkNotNullParameter(book, "book");
        Book bookCopy$default = Book.copy$default(book, null, null, null, null, null, null, null, false, null, null, "AVAILABLE", 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, -80741889, 2047, null);
        MutableStateFlow<List<Book>> mutableStateFlow = this._localOptimisticBooks;
        List listListOf = CollectionsKt.listOf(bookCopy$default);
        Iterable iterable = (Iterable) this._localOptimisticBooks.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!Intrinsics.areEqual(((Book) obj).getId(), bookCopy$default.getId())) {
                arrayList.add(obj);
            }
        }
        mutableStateFlow.setValue(CollectionsKt.plus(listListOf, arrayList));
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new C01042(bookCopy$default, book, null), 3, (Object) null);
    }

    /* JADX INFO: renamed from: com.example.ui.BookViewModel$cancelBorrowRequest$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.BookViewModel$cancelBorrowRequest$2", f = "BookViewModel.kt", i = {}, l = {733}, m = "invokeSuspend", n = {}, s = {})
    static final class C01042 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Book $book;
        final /* synthetic */ Book $updated;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01042(Book book, Book book2, Continuation<? super C01042> continuation) {
            super(2, continuation);
            this.$updated = book;
            this.$book = book2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BookViewModel.this.new C01042(this.$updated, this.$book, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (BookViewModel.this.repository.updateBook(this.$updated, (Continuation) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (!StringsKt.isBlank(this.$book.getOwnerName())) {
                BookViewModel.this.sendMessage(this.$book.getId(), this.$book.getOwnerName(), "The borrow request for '" + this.$book.getTitle() + "' was canceled by the requester.");
            }
            return Unit.INSTANCE;
        }
    }

    public final void acceptTransfer(Book book) {
        Intrinsics.checkNotNullParameter(book, "book");
        String borrowerName = book.getBorrowerName();
        if (borrowerName == null && (borrowerName = book.getRequestedByName()) == null && (borrowerName = (String) this._currentUser.getValue()) == null) {
            borrowerName = "";
        }
        String str = borrowerName;
        Book bookCopy$default = Book.copy$default(book, null, null, null, null, null, null, null, false, str, null, "BORROWED", 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, false, book.getRentCount() + 1, null, null, null, null, null, null, null, Long.valueOf(System.currentTimeMillis()), null, 0, null, null, null, null, -335545601, 2031, null);
        MutableStateFlow<List<Book>> mutableStateFlow = this._localOptimisticBooks;
        List listListOf = CollectionsKt.listOf(bookCopy$default);
        Iterable iterable = (Iterable) this._localOptimisticBooks.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!Intrinsics.areEqual(((Book) obj).getId(), bookCopy$default.getId())) {
                arrayList.add(obj);
            }
        }
        mutableStateFlow.setValue(CollectionsKt.plus(listListOf, arrayList));
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new C00972(bookCopy$default, book, str, null), 3, (Object) null);
    }

    /* JADX INFO: renamed from: com.example.ui.BookViewModel$acceptTransfer$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.BookViewModel$acceptTransfer$2", f = "BookViewModel.kt", i = {2, 3, 4, 4}, l = {751, 752, 754, 756, 758}, m = "invokeSuspend", n = {"ownerUser", "ownerUser", "ownerUser", "borrowerUser"}, s = {"L$0", "L$0", "L$0", "L$1"})
    static final class C00972 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Book $book;
        final /* synthetic */ String $borrower;
        final /* synthetic */ Book $updated;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C00972(Book book, Book book2, String str, Continuation<? super C00972> continuation) {
            super(2, continuation);
            this.$updated = book;
            this.$book = book2;
            this.$borrower = str;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BookViewModel.this.new C00972(this.$updated, this.$book, this.$borrower, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0086  */
        /* JADX WARN: Code duplicated, block: B:31:0x00d9 A[PHI: r2 r4
          0x00d9: PHI (r2v14 com.example.data.User) = (r2v13 com.example.data.User), (r2v24 com.example.data.User) binds: [B:29:0x00d6, B:12:0x002e] A[DONT_GENERATE, DONT_INLINE]
          0x00d9: PHI (r4v2 java.lang.Object) = (r4v1 java.lang.Object), (r4v7 java.lang.Object) binds: [B:29:0x00d6, B:12:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:33:0x00de  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00b7, code lost:
        
            if (r23.this$0.repository.updateUser(com.example.data.User.copy$default(r8, null, null, r8.getTrustScore() + 3, 0, null, null, false, null, 0, 0, 0.0d, 2043, null), (kotlin.coroutines.Continuation) r23) == r1) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0115, code lost:
        
            if (r23.this$0.repository.updateUser(com.example.data.User.copy$default(r8, null, null, r8.getTrustScore() + 3, 0, null, null, false, null, 0, 0, 0.0d, 2043, null), (kotlin.coroutines.Continuation) r23) == r1) goto L35;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                Method dump skipped, instruction units count: 327
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.example.ui.BookViewModel.C00972.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static /* synthetic */ void initiateReturn$default(BookViewModel bookViewModel, Book book, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        bookViewModel.initiateReturn(book, str, str2, str3);
    }

    public final void initiateReturn(Book book, String base64Str, String aiCondition, String aiAssessment) {
        Intrinsics.checkNotNullParameter(book, "book");
        Book bookCopy$default = Book.copy$default(book, null, null, null, null, null, null, null, false, null, null, "PENDING_RETURN", 0L, null, null, null, null, null, null, null, null, null, base64Str, null, null, aiCondition, aiAssessment, false, false, 0, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, -186647553, 2047, null);
        MutableStateFlow<List<Book>> mutableStateFlow = this._localOptimisticBooks;
        List listListOf = CollectionsKt.listOf(bookCopy$default);
        Iterable iterable = (Iterable) this._localOptimisticBooks.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!Intrinsics.areEqual(((Book) obj).getId(), bookCopy$default.getId())) {
                arrayList.add(obj);
            }
        }
        mutableStateFlow.setValue(CollectionsKt.plus(listListOf, arrayList));
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new C01112(bookCopy$default, book, aiCondition, null), 3, (Object) null);
    }

    /* JADX INFO: renamed from: com.example.ui.BookViewModel$initiateReturn$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.BookViewModel$initiateReturn$2", f = "BookViewModel.kt", i = {}, l = {783}, m = "invokeSuspend", n = {}, s = {})
    static final class C01112 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $aiCondition;
        final /* synthetic */ Book $book;
        final /* synthetic */ Book $updated;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01112(Book book, Book book2, String str, Continuation<? super C01112> continuation) {
            super(2, continuation);
            this.$updated = book;
            this.$book = book2;
            this.$aiCondition = str;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BookViewModel.this.new C01112(this.$updated, this.$book, this.$aiCondition, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (BookViewModel.this.repository.updateBook(this.$updated, (Continuation) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            BookViewModel bookViewModel = BookViewModel.this;
            String id = this.$book.getId();
            String ownerName = this.$book.getOwnerName();
            String title = this.$book.getTitle();
            String str = this.$aiCondition;
            if (str == null) {
                str = "Verified";
            }
            bookViewModel.sendMessage(id, ownerName, "Borrower took a return photo of '" + title + "'! AI Condition: " + str + ". Borrower will now show their Return QR.");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: verifyReturnQr-gIAlu-s, reason: not valid java name */
    public final Object m166verifyReturnQrgIAlus(Book book, String rawPayload) {
        Intrinsics.checkNotNullParameter(book, "book");
        Intrinsics.checkNotNullParameter(rawPayload, "rawPayload");
        QrPayload qrPayload = QRCodeHelper.INSTANCE.parseQrPayload(rawPayload);
        if (qrPayload == null) {
            Result.Companion companion = Result.Companion;
            return Result.constructor-impl(ResultKt.createFailure(new Exception("Invalid QR code format. Please ensure the QR code was generated by BookXchange.")));
        }
        if (!Intrinsics.areEqual(qrPayload.getType(), "RETURN")) {
            Result.Companion companion2 = Result.Companion;
            return Result.constructor-impl(ResultKt.createFailure(new Exception("Scanned code type is " + qrPayload.getType() + ", expected RETURN QR.")));
        }
        if (!StringsKt.equals(qrPayload.getBookId(), book.getId(), true)) {
            Result.Companion companion3 = Result.Companion;
            return Result.constructor-impl(ResultKt.createFailure(new Exception("QR code belongs to a different book!")));
        }
        if (qrPayload.getUserEmail() != null) {
            return m159confirmAndCompleteReturn0E7RQCE$default(this, book, null, null, 6, null);
        }
        Result.Companion companion4 = Result.Companion;
        return Result.constructor-impl(ResultKt.createFailure(new Exception("QR code belongs to a different user. Expected lender's return QR.")));
    }

    public final void cancelReturn(Book book) {
        Intrinsics.checkNotNullParameter(book, "book");
        Book bookCopy$default = Book.copy$default(book, null, null, null, null, null, null, null, false, null, null, "BORROWED", 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, -186647553, 2047, null);
        MutableStateFlow<List<Book>> mutableStateFlow = this._localOptimisticBooks;
        List listListOf = CollectionsKt.listOf(bookCopy$default);
        Iterable iterable = (Iterable) this._localOptimisticBooks.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!Intrinsics.areEqual(((Book) obj).getId(), bookCopy$default.getId())) {
                arrayList.add(obj);
            }
        }
        mutableStateFlow.setValue(CollectionsKt.plus(listListOf, arrayList));
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new C01062(bookCopy$default, null), 3, (Object) null);
    }

    /* JADX INFO: renamed from: com.example.ui.BookViewModel$cancelReturn$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.BookViewModel$cancelReturn$2", f = "BookViewModel.kt", i = {}, l = {840}, m = "invokeSuspend", n = {}, s = {})
    static final class C01062 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Book $updated;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01062(Book book, Continuation<? super C01062> continuation) {
            super(2, continuation);
            this.$updated = book;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BookViewModel.this.new C01062(this.$updated, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (BookViewModel.this.repository.updateBook(this.$updated, (Continuation) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: confirmAndCompleteReturn-0E7RQCE$default, reason: not valid java name */
    public static /* synthetic */ Object m159confirmAndCompleteReturn0E7RQCE$default(BookViewModel bookViewModel, Book book, Integer num, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        return bookViewModel.m161confirmAndCompleteReturn0E7RQCE(book, num, str);
    }

    /* JADX INFO: renamed from: confirmAndCompleteReturn-0E7RQCE, reason: not valid java name */
    public final Object m161confirmAndCompleteReturn0E7RQCE(Book book, Integer rating, String review) {
        Intrinsics.checkNotNullParameter(book, "book");
        String borrowerName = book.getBorrowerName();
        if (borrowerName == null) {
            borrowerName = "";
        }
        Book bookCopy$default = Book.copy$default(book, null, null, null, null, null, null, null, false, null, null, "AVAILABLE", 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, -267388673, 2031, null);
        MutableStateFlow<List<Book>> mutableStateFlow = this._localOptimisticBooks;
        List listListOf = CollectionsKt.listOf(bookCopy$default);
        Iterable iterable = (Iterable) this._localOptimisticBooks.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!Intrinsics.areEqual(((Book) obj).getId(), bookCopy$default.getId())) {
                arrayList.add(obj);
            }
        }
        mutableStateFlow.setValue(CollectionsKt.plus(listListOf, arrayList));
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new BookViewModel$confirmAndCompleteReturn$2(this, bookCopy$default, book, borrowerName, rating, review, null), 3, (Object) null);
        Result.Companion companion = Result.Companion;
        return Result.constructor-impl("Return confirmed! '" + book.getTitle() + "' is now back in your library.");
    }

    /* JADX INFO: renamed from: verifyAndCompleteHandover-gIAlu-s, reason: not valid java name */
    public final Object m163verifyAndCompleteHandovergIAlus(Book book, String rawPayload) {
        Intrinsics.checkNotNullParameter(book, "book");
        Intrinsics.checkNotNullParameter(rawPayload, "rawPayload");
        return m165verifyHandoverQrgIAlus(book, rawPayload);
    }

    /* JADX INFO: renamed from: verifyAndCompleteReturn-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ Object m160verifyAndCompleteReturnBWLJW6A$default(BookViewModel bookViewModel, Book book, String str, Integer num, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        return bookViewModel.m164verifyAndCompleteReturnBWLJW6A(book, str, num, str2);
    }

    /* JADX INFO: renamed from: verifyAndCompleteReturn-BWLJW6A, reason: not valid java name */
    public final Object m164verifyAndCompleteReturnBWLJW6A(Book book, String rawPayload, Integer rating, String review) {
        Intrinsics.checkNotNullParameter(book, "book");
        Intrinsics.checkNotNullParameter(rawPayload, "rawPayload");
        return m166verifyReturnQrgIAlus(book, rawPayload);
    }

    /* JADX INFO: renamed from: com.example.ui.BookViewModel$reportStolen$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.BookViewModel$reportStolen$1", f = "BookViewModel.kt", i = {0, 1, 1, 2, 2, 2}, l = {921, 923, 927}, m = "invokeSuspend", n = {"borrower", "borrower", "bUser", "borrower", "bUser", "updated"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2"})
    static final class C01161 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Book $book;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ BookViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01161(Book book, BookViewModel bookViewModel, Continuation<? super C01161> continuation) {
            super(2, continuation);
            this.$book = book;
            this.this$0 = bookViewModel;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C01161(this.$book, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x012f  */
        /* JADX WARN: Code duplicated, block: B:38:0x0144 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:40:0x0129 A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0174, code lost:
        
            if (r55.this$0.repository.updateBook(r4, (kotlin.coroutines.Continuation) r55) == r1) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r56) {
            /*
                Method dump skipped, instruction units count: 378
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.example.ui.BookViewModel.C01161.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void reportStolen(Book book) {
        Intrinsics.checkNotNullParameter(book, "book");
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new C01161(book, this, null), 3, (Object) null);
    }

    public static /* synthetic */ void returnBook$default(BookViewModel bookViewModel, Book book, String str, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        bookViewModel.returnBook(book, str, num);
    }

    public final void returnBook(Book book, String condition, Integer rating) {
        Intrinsics.checkNotNullParameter(book, "book");
        m159confirmAndCompleteReturn0E7RQCE$default(this, book, rating, null, 4, null);
    }

    /* JADX INFO: renamed from: com.example.ui.BookViewModel$verifyBookConditionWithAI$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookViewModel.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u001e\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.BookViewModel$verifyBookConditionWithAI$2", f = "BookViewModel.kt", i = {0, 0, 0, 0}, l = {969}, m = "invokeSuspend", n = {"apiKey", "cleanBase64", "prompt", "request"}, s = {"L$0", "L$1", "L$2", "L$3"})
    static final class C01302 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends String, ? extends String>>, Object> {
        final /* synthetic */ String $bookTitle;
        final /* synthetic */ String $expectedCondition;
        final /* synthetic */ String $imageBase64;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01302(String str, String str2, String str3, Continuation<? super C01302> continuation) {
            super(2, continuation);
            this.$imageBase64 = str;
            this.$bookTitle = str2;
            this.$expectedCondition = str3;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C01302(this.$imageBase64, this.$bookTitle, this.$expectedCondition, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<String, String>> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objGenerateWithResilientModelChain$default;
            Content content;
            List<Part> parts;
            Part part;
            String text;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            String string = null;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    String geminiApiKey = SecureKeyProvider.getGeminiApiKey();
                    boolean zContains$default = StringsKt.contains$default(this.$imageBase64, ",", false, 2, (Object) null);
                    String strSubstringAfter$default = this.$imageBase64;
                    if (zContains$default) {
                        strSubstringAfter$default = StringsKt.substringAfter$default(strSubstringAfter$default, ",", (String) null, 2, (Object) null);
                    }
                    String strTrimIndent = StringsKt.trimIndent("\n                    You are an expert book verification AI for BookXchange.\n                    A user took a scan photo of the book '" + this.$bookTitle + "' during a handover or return transfer.\n                    The book was originally listed in condition: '" + this.$expectedCondition + "'.\n                    \n                    Tasks:\n                    1. Inspect the visible cover and physical condition:\n                       - Is it \"Mint\" (like new, pristine corners, crisp spine)?\n                       - Is it \"Good\" (intact, minor shelf wear, clean)?\n                       - Is it \"Fair\" (noticeable creases, bent edges, slight wear)?\n                       - Is it \"Poor\" (torn, heavily worn, stained, damaged)?\n                    2. Provide a 1-sentence verification assessment (e.g. \"Condition verified: book cover and spine are intact with minor shelf wear.\").\n                    \n                    Respond strictly in valid JSON format:\n                    {\"condition\": \"...\", \"assessment\": \"...\"}\n                ");
                    GenerateContentRequest generateContentRequest = new GenerateContentRequest(CollectionsKt.listOf(new Content(CollectionsKt.listOf(new Part[]{new Part(strTrimIndent, (InlineData) null, 2, (DefaultConstructorMarker) null), new Part((String) null, new InlineData(Utils.MIME_TYPE_JPEG, strSubstringAfter$default), 1, (DefaultConstructorMarker) null)}))), new GenerationConfig((ResponseFormat) null, "application/json", Boxing.boxFloat(0.1f), (Float) null, (Integer) null, (List) null, 57, (DefaultConstructorMarker) null), (List) null, (Content) null, 12, (DefaultConstructorMarker) null);
                    this.L$0 = SpillingKt.nullOutSpilledVariable(geminiApiKey);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(strSubstringAfter$default);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(strTrimIndent);
                    this.L$3 = SpillingKt.nullOutSpilledVariable(generateContentRequest);
                    this.label = 1;
                    objGenerateWithResilientModelChain$default = RetrofitClient.generateWithResilientModelChain$default(RetrofitClient.INSTANCE, geminiApiKey, generateContentRequest, null, (Continuation) this, 4, null);
                    if (objGenerateWithResilientModelChain$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    objGenerateWithResilientModelChain$default = obj;
                }
                Candidate candidate = (Candidate) CollectionsKt.firstOrNull(((GenerateContentResponse) objGenerateWithResilientModelChain$default).getCandidates());
                if (candidate != null && (content = candidate.getContent()) != null && (parts = content.getParts()) != null && (part = (Part) CollectionsKt.firstOrNull(parts)) != null && (text = part.getText()) != null) {
                    string = StringsKt.trim(text).toString();
                }
                if (string != null) {
                    int iIndexOf$default = StringsKt.indexOf$default(string, '{', 0, false, 6, (Object) null);
                    int iLastIndexOf$default = StringsKt.lastIndexOf$default(string, '}', 0, false, 6, (Object) null);
                    if (iIndexOf$default != -1 && iLastIndexOf$default != -1 && iLastIndexOf$default > iIndexOf$default) {
                        String strSubstring = string.substring(iIndexOf$default, iLastIndexOf$default + 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        string = StringsKt.trim(strSubstring).toString();
                    }
                }
                if (string != null) {
                    JSONObject jSONObject = new JSONObject(string);
                    return new Pair(jSONObject.optString("condition", this.$expectedCondition), jSONObject.optString("assessment", "Condition verified successfully against original listing."));
                }
                String str = this.$expectedCondition;
                return new Pair(str, "Condition matches expected condition (" + str + ").");
            } catch (Exception unused) {
                return new Pair(this.$expectedCondition, "Photo recorded. Condition verified.");
            }
        }
    }

    public final Object verifyBookConditionWithAI(String str, String str2, String str3, Continuation<? super Pair<String, String>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C01302(str3, str, str2, null), continuation);
    }

    /* JADX INFO: renamed from: com.example.ui.BookViewModel$deleteBook$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.BookViewModel$deleteBook$2", f = "BookViewModel.kt", i = {}, l = {996}, m = "invokeSuspend", n = {}, s = {})
    static final class C01102 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $bookId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01102(String str, Continuation<? super C01102> continuation) {
            super(2, continuation);
            this.$bookId = str;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BookViewModel.this.new C01102(this.$bookId, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (BookViewModel.this.repository.deleteBookById(this.$bookId, (Continuation) this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return Unit.INSTANCE;
        }
    }

    public final void deleteBook(String bookId) {
        Intrinsics.checkNotNullParameter(bookId, "bookId");
        MutableStateFlow<List<Book>> mutableStateFlow = this._localOptimisticBooks;
        Iterable iterable = (Iterable) mutableStateFlow.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!Intrinsics.areEqual(((Book) obj).getId(), bookId)) {
                arrayList.add(obj);
            }
        }
        mutableStateFlow.setValue(arrayList);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new C01102(bookId, null), 3, (Object) null);
    }

    public static /* synthetic */ void addFeedback$default(BookViewModel bookViewModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = "";
        }
        bookViewModel.addFeedback(str, str2, str3);
    }

    /* JADX INFO: renamed from: com.example.ui.BookViewModel$addFeedback$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.BookViewModel$addFeedback$1", f = "BookViewModel.kt", i = {}, l = {1007, 1013}, m = "invokeSuspend", n = {}, s = {})
    static final class C00991 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $content;
        final /* synthetic */ String $reviewer;
        final /* synthetic */ String $targetUsername;
        final /* synthetic */ String $type;
        int label;
        final /* synthetic */ BookViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C00991(String str, String str2, BookViewModel bookViewModel, String str3, String str4, Continuation<? super C00991> continuation) {
            super(2, continuation);
            this.$type = str;
            this.$targetUsername = str2;
            this.this$0 = bookViewModel;
            this.$reviewer = str3;
            this.$content = str4;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C00991(this.$type, this.$targetUsername, this.this$0, this.$reviewer, this.$content, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:
        
            if (r20.this$0.repository.insertReview(new com.example.data.Review(null, r20.$targetUsername, r20.$reviewer, null, r20.$content, 0, null, null, null, null, 0, 2025, null), (kotlin.coroutines.Continuation) r20) == r1) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0081, code lost:
        
            if (r20.this$0.repository.insertFeedback(new com.example.data.Feedback(null, r20.$type, r20.$content, r20.$reviewer, "REPORTED", null, 0, 97, null), (kotlin.coroutines.Continuation) r20) == r1) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0083, code lost:
        
            return r1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                r0 = r20
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L1d
                if (r2 == r4) goto L19
                if (r2 != r3) goto L11
                goto L19
            L11:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L19:
                kotlin.ResultKt.throwOnFailure(r21)
                goto L84
            L1d:
                kotlin.ResultKt.throwOnFailure(r21)
                java.lang.String r2 = r0.$type
                java.lang.String r5 = "USER_REVIEW"
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r5)
                if (r2 == 0) goto L5e
                java.lang.String r2 = r0.$targetUsername
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                boolean r2 = kotlin.text.StringsKt.isBlank(r2)
                if (r2 != 0) goto L5e
                com.example.ui.BookViewModel r2 = r0.this$0
                com.example.data.BookRepository r2 = com.example.ui.BookViewModel.access$getRepository$p(r2)
                com.example.data.Review r5 = new com.example.data.Review
                java.lang.String r7 = r0.$targetUsername
                java.lang.String r8 = r0.$reviewer
                java.lang.String r10 = r0.$content
                r18 = 2025(0x7e9, float:2.838E-42)
                r19 = 0
                r6 = 0
                r9 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19)
                r3 = r0
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                r0.label = r4
                java.lang.Object r0 = r2.insertReview(r5, r3)
                if (r0 != r1) goto L84
                goto L83
            L5e:
                com.example.ui.BookViewModel r2 = r0.this$0
                com.example.data.BookRepository r2 = com.example.ui.BookViewModel.access$getRepository$p(r2)
                com.example.data.Feedback r4 = new com.example.data.Feedback
                java.lang.String r6 = r0.$type
                java.lang.String r7 = r0.$content
                java.lang.String r8 = r0.$reviewer
                r13 = 97
                r14 = 0
                r5 = 0
                java.lang.String r9 = "REPORTED"
                r10 = 0
                r11 = 0
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r13, r14)
                r5 = r0
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r0.label = r3
                java.lang.Object r0 = r2.insertFeedback(r4, r5)
                if (r0 != r1) goto L84
            L83:
                return r1
            L84:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.example.ui.BookViewModel.C00991.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void addFeedback(String type, String content, String targetUsername) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(targetUsername, "targetUsername");
        String str = (String) this.currentUser.getValue();
        if (str == null) {
            str = "Anonymous";
        }
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new C00991(type, targetUsername, this, str, content, null), 3, (Object) null);
    }

    /* JADX INFO: renamed from: com.example.ui.BookViewModel$addReviewForOwner$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.BookViewModel$addReviewForOwner$1", f = "BookViewModel.kt", i = {0, 1, 2, 2, 2}, l = {1032, 1035, 1039}, m = "invokeSuspend", n = {"review", "review", "review", "ownerUser", "points"}, s = {"L$0", "L$0", "L$0", "L$1", "I$0"})
    static final class C01001 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $content;
        final /* synthetic */ String $ownerName;
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ BookViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01001(String str, BookViewModel bookViewModel, String str2, Continuation<? super C01001> continuation) {
            super(2, continuation);
            this.$ownerName = str;
            this.this$0 = bookViewModel;
            this.$content = str2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C01001(this.$ownerName, this.this$0, this.$content, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00bd A[Catch: Exception -> 0x0119, TryCatch #0 {Exception -> 0x0119, blocks: (B:8:0x001c, B:13:0x002d, B:34:0x00b8, B:36:0x00bd, B:38:0x00cc, B:43:0x00de, B:16:0x0038, B:31:0x009a, B:19:0x003f, B:21:0x0051, B:23:0x005f, B:27:0x006b), top: B:50:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:40:0x00da  */
        /* JADX WARN: Code duplicated, block: B:43:0x00de A[Catch: Exception -> 0x0119, TRY_LEAVE, TryCatch #0 {Exception -> 0x0119, blocks: (B:8:0x001c, B:13:0x002d, B:34:0x00b8, B:36:0x00bd, B:38:0x00cc, B:43:0x00de, B:16:0x0038, B:31:0x009a, B:19:0x003f, B:21:0x0051, B:23:0x005f, B:27:0x006b), top: B:50:0x000c }] */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0116, code lost:
        
            if (r22.this$0.repository.updateUser(com.example.data.User.copy$default(r7, null, null, r7.getTrustScore() + r4, 0, null, null, false, null, 0, 0, 0.0d, 2043, null), (kotlin.coroutines.Continuation) r22) == r1) goto L45;
         */
        /* JADX WARN: Instruction removed from duplicated block: B:36:0x00bd, please report this as an issue */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instruction units count: 288
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.example.ui.BookViewModel.C01001.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void addReviewForOwner(String ownerName, String content) {
        Intrinsics.checkNotNullParameter(ownerName, "ownerName");
        Intrinsics.checkNotNullParameter(content, "content");
        if (((String) this.currentUser.getValue()) == null) {
            return;
        }
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new C01001(ownerName, this, content, null), 3, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void submitBorrowerFeedback$default(BookViewModel bookViewModel, Book book, int i, String str, int i2, String str2, List list, int i3, Object obj) {
        if ((i3 & 32) != 0) {
            list = CollectionsKt.emptyList();
        }
        bookViewModel.submitBorrowerFeedback(book, i, str, i2, str2, list);
    }

    public final void submitBorrowerFeedback(Book book, int bookRating, String bookReview, int lenderRating, String lenderReview, List<String> tags) {
        Intrinsics.checkNotNullParameter(book, "book");
        Intrinsics.checkNotNullParameter(bookReview, "bookReview");
        Intrinsics.checkNotNullParameter(lenderReview, "lenderReview");
        Intrinsics.checkNotNullParameter(tags, "tags");
        String str = (String) this.currentUser.getValue();
        if (str == null) {
            return;
        }
        String strSubstringBefore$default = (String) this._currentDisplayName.getValue();
        if (strSubstringBefore$default == null) {
            strSubstringBefore$default = StringsKt.substringBefore$default(str, "@", (String) null, 2, (Object) null);
        }
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new C01231(book, strSubstringBefore$default, str, bookReview, bookRating, tags, this, lenderReview, lenderRating, null), 3, (Object) null);
    }

    /* JADX INFO: renamed from: com.example.ui.BookViewModel$submitBorrowerFeedback$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.BookViewModel$submitBorrowerFeedback$1", f = "BookViewModel.kt", i = {0, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4}, l = {1072, 1078, 1092, 1095, 1098}, m = "invokeSuspend", n = {"bReview", "bReview", "updatedBook", "newAvg", "bReview", "updatedBook", "lReview", "newAvg", "bReview", "updatedBook", "lReview", "newAvg", "bReview", "updatedBook", "lReview", "lenderUser", "newAvg", "points"}, s = {"L$0", "L$0", "L$1", "D$0", "L$0", "L$1", "L$2", "D$0", "L$0", "L$1", "L$2", "D$0", "L$0", "L$1", "L$2", "L$3", "D$0", "I$0"})
    static final class C01231 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Book $book;
        final /* synthetic */ int $bookRating;
        final /* synthetic */ String $bookReview;
        final /* synthetic */ int $lenderRating;
        final /* synthetic */ String $lenderReview;
        final /* synthetic */ String $reviewer;
        final /* synthetic */ String $reviewerDisplayName;
        final /* synthetic */ List<String> $tags;
        double D$0;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ BookViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01231(Book book, String str, String str2, String str3, int i, List<String> list, BookViewModel bookViewModel, String str4, int i2, Continuation<? super C01231> continuation) {
            super(2, continuation);
            this.$book = book;
            this.$reviewerDisplayName = str;
            this.$reviewer = str2;
            this.$bookReview = str3;
            this.$bookRating = i;
            this.$tags = list;
            this.this$0 = bookViewModel;
            this.$lenderReview = str4;
            this.$lenderRating = i2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C01231(this.$book, this.$reviewerDisplayName, this.$reviewer, this.$bookReview, this.$bookRating, this.$tags, this.this$0, this.$lenderReview, this.$lenderRating, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:50:0x01ef A[Catch: Exception -> 0x033f, TryCatch #0 {Exception -> 0x033f, blocks: (B:10:0x002b, B:68:0x02f6, B:71:0x0314, B:15:0x0046, B:58:0x028f, B:60:0x0295, B:65:0x029f, B:18:0x005b, B:55:0x025e, B:21:0x006a, B:48:0x01d9, B:50:0x01ef, B:51:0x0206, B:24:0x0073, B:34:0x00e1, B:36:0x00e9, B:38:0x00fe, B:39:0x018b, B:41:0x0191, B:43:0x01a7, B:45:0x01ad, B:37:0x00fb, B:27:0x007b, B:29:0x0091, B:30:0x00a4), top: B:77:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:53:0x0258  */
        /* JADX WARN: Code duplicated, block: B:54:0x025a  */
        /* JADX WARN: Code duplicated, block: B:57:0x028e  */
        /* JADX WARN: Code duplicated, block: B:58:0x028f A[Catch: Exception -> 0x033f, PHI: r2 r4 r5 r8 r9
          0x028f: PHI (r2v25 double) = (r2v24 double), (r2v35 double) binds: [B:56:0x028c, B:16:0x0049] A[DONT_GENERATE, DONT_INLINE]
          0x028f: PHI (r4v6 com.example.data.Review) = (r4v5 com.example.data.Review), (r4v21 com.example.data.Review) binds: [B:56:0x028c, B:16:0x0049] A[DONT_GENERATE, DONT_INLINE]
          0x028f: PHI (r5v15 java.lang.Object) = (r5v14 java.lang.Object), (r5v21 java.lang.Object) binds: [B:56:0x028c, B:16:0x0049] A[DONT_GENERATE, DONT_INLINE]
          0x028f: PHI (r8v9 com.example.data.Book) = (r8v8 com.example.data.Book), (r8v14 com.example.data.Book) binds: [B:56:0x028c, B:16:0x0049] A[DONT_GENERATE, DONT_INLINE]
          0x028f: PHI (r9v11 com.example.data.Review) = (r9v10 com.example.data.Review), (r9v17 com.example.data.Review) binds: [B:56:0x028c, B:16:0x0049] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x033f, blocks: (B:10:0x002b, B:68:0x02f6, B:71:0x0314, B:15:0x0046, B:58:0x028f, B:60:0x0295, B:65:0x029f, B:18:0x005b, B:55:0x025e, B:21:0x006a, B:48:0x01d9, B:50:0x01ef, B:51:0x0206, B:24:0x0073, B:34:0x00e1, B:36:0x00e9, B:38:0x00fe, B:39:0x018b, B:41:0x0191, B:43:0x01a7, B:45:0x01ad, B:37:0x00fb, B:27:0x007b, B:29:0x0091, B:30:0x00a4), top: B:77:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:60:0x0295 A[Catch: Exception -> 0x033f, TryCatch #0 {Exception -> 0x033f, blocks: (B:10:0x002b, B:68:0x02f6, B:71:0x0314, B:15:0x0046, B:58:0x028f, B:60:0x0295, B:65:0x029f, B:18:0x005b, B:55:0x025e, B:21:0x006a, B:48:0x01d9, B:50:0x01ef, B:51:0x0206, B:24:0x0073, B:34:0x00e1, B:36:0x00e9, B:38:0x00fe, B:39:0x018b, B:41:0x0191, B:43:0x01a7, B:45:0x01ad, B:37:0x00fb, B:27:0x007b, B:29:0x0091, B:30:0x00a4), top: B:77:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:62:0x029a  */
        /* JADX WARN: Code duplicated, block: B:63:0x029c A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:64:0x029e  */
        /* JADX WARN: Code duplicated, block: B:70:0x0312  */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x02f3, code lost:
        
            if (r59.this$0.repository.updateUser(com.example.data.User.copy$default(r18, null, null, kotlin.ranges.RangesKt.coerceIn(r18.getTrustScore() + r7, 0, 100), 0, null, null, false, null, 0, 0, 0.0d, 2043, null), (kotlin.coroutines.Continuation) r59) == r1) goto L67;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r60) {
            /*
                Method dump skipped, instruction units count: 838
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.example.ui.BookViewModel.C01231.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void submitLenderFeedback$default(BookViewModel bookViewModel, Book book, int i, String str, List list, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            list = CollectionsKt.emptyList();
        }
        bookViewModel.submitLenderFeedback(book, i, str, list);
    }

    public final void submitLenderFeedback(Book book, int borrowerRating, String borrowerReview, List<String> tags) {
        Intrinsics.checkNotNullParameter(book, "book");
        Intrinsics.checkNotNullParameter(borrowerReview, "borrowerReview");
        Intrinsics.checkNotNullParameter(tags, "tags");
        String str = (String) this.currentUser.getValue();
        if (str == null) {
            return;
        }
        String strSubstringBefore$default = (String) this._currentDisplayName.getValue();
        if (strSubstringBefore$default == null) {
            strSubstringBefore$default = StringsKt.substringBefore$default(str, "@", (String) null, 2, (Object) null);
        }
        String str2 = strSubstringBefore$default;
        String borrowerName = book.getBorrowerName();
        if (borrowerName == null) {
            return;
        }
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new C01241(borrowerName, str2, str, borrowerReview, borrowerRating, book, tags, this, null), 3, (Object) null);
    }

    /* JADX INFO: renamed from: com.example.ui.BookViewModel$submitLenderFeedback$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.BookViewModel$submitLenderFeedback$1", f = "BookViewModel.kt", i = {0, 1, 2, 2, 2}, l = {1130, 1133, 1136}, m = "invokeSuspend", n = {"bReview", "bReview", "bReview", "borrowerUser", "points"}, s = {"L$0", "L$0", "L$0", "L$1", "I$0"})
    static final class C01241 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Book $book;
        final /* synthetic */ String $borrower;
        final /* synthetic */ int $borrowerRating;
        final /* synthetic */ String $borrowerReview;
        final /* synthetic */ String $reviewer;
        final /* synthetic */ String $reviewerDisplayName;
        final /* synthetic */ List<String> $tags;
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ BookViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01241(String str, String str2, String str3, String str4, int i, Book book, List<String> list, BookViewModel bookViewModel, Continuation<? super C01241> continuation) {
            super(2, continuation);
            this.$borrower = str;
            this.$reviewerDisplayName = str2;
            this.$reviewer = str3;
            this.$borrowerReview = str4;
            this.$borrowerRating = i;
            this.$book = book;
            this.$tags = list;
            this.this$0 = bookViewModel;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C01241(this.$borrower, this.$reviewerDisplayName, this.$reviewer, this.$borrowerReview, this.$borrowerRating, this.$book, this.$tags, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x00c4 A[Catch: Exception -> 0x0154, TryCatch #0 {Exception -> 0x0154, blocks: (B:8:0x001d, B:39:0x010f, B:42:0x0129, B:13:0x002e, B:29:0x00bf, B:31:0x00c4, B:36:0x00ce, B:16:0x0039, B:26:0x00a1, B:19:0x0040, B:21:0x0052, B:22:0x0065), top: B:48:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:33:0x00c9  */
        /* JADX WARN: Code duplicated, block: B:34:0x00cb A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:35:0x00cd  */
        /* JADX WARN: Code duplicated, block: B:41:0x0127  */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x010c, code lost:
        
            if (r22.this$0.repository.updateUser(com.example.data.User.copy$default(r7, null, null, kotlin.ranges.RangesKt.coerceIn(r7.getTrustScore() + r6, 0, 100), 0, null, null, false, null, 0, 0, 0.0d, 2043, null), (kotlin.coroutines.Continuation) r22) == r2) goto L38;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instruction units count: 347
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.example.ui.BookViewModel.C01241.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void sendMessage(String bookId, String receiver, String content) {
        Intrinsics.checkNotNullParameter(bookId, "bookId");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(content, "content");
        String str = (String) this.currentUser.getValue();
        if (str == null) {
            return;
        }
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new C01211(new Message(null, bookId, str, receiver, null, content, 0L, null, null, null, null, null, null, null, null, null, null, null, 262097, null), null), 3, (Object) null);
    }

    /* JADX INFO: renamed from: com.example.ui.BookViewModel$sendMessage$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.BookViewModel$sendMessage$1", f = "BookViewModel.kt", i = {}, l = {1151}, m = "invokeSuspend", n = {}, s = {})
    static final class C01211 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Message $message;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01211(Message message, Continuation<? super C01211> continuation) {
            super(2, continuation);
            this.$message = message;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BookViewModel.this.new C01211(this.$message, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (BookViewModel.this.repository.insertMessage(this.$message, (Continuation) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public final Object deductTrustScore(String str, int i, Continuation<? super Integer> continuation) {
        C01091 c01091;
        String str2;
        int i2;
        int i3;
        if (continuation instanceof C01091) {
            c01091 = (C01091) continuation;
            if ((c01091.label & Integer.MIN_VALUE) != 0) {
                c01091.label -= Integer.MIN_VALUE;
            } else {
                c01091 = new C01091(continuation);
            }
        } else {
            c01091 = new C01091(continuation);
        }
        Object objFirstOrNull = c01091.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c01091.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(objFirstOrNull);
            Flow<User> user = this.repository.getUser(str);
            c01091.L$0 = str;
            c01091.I$0 = i;
            c01091.label = 1;
            objFirstOrNull = FlowKt.firstOrNull(user, c01091);
            if (objFirstOrNull != coroutine_suspended) {
                str2 = str;
                i2 = i;
            }
            return coroutine_suspended;
        }
        if (i4 == 1) {
            i2 = c01091.I$0;
            String str3 = (String) c01091.L$0;
            ResultKt.throwOnFailure(objFirstOrNull);
            str2 = str3;
        } else {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = c01091.I$1;
            int i5 = c01091.I$0;
            ResultKt.throwOnFailure(objFirstOrNull);
        }
        return Boxing.boxInt(i3);
        User user2 = (User) objFirstOrNull;
        User user3 = user2 == null ? new User(str2, StringsKt.substringBefore$default(str2, "@", (String) null, 2, (Object) null), 100, 0, null, null, false, null, 0, 0, 0.0d, 2040, null) : user2;
        int iCoerceAtLeast = RangesKt.coerceAtLeast(user3.getTrustScore() - i2, 0);
        BookRepository bookRepository = this.repository;
        User userCopy$default = User.copy$default(user3, null, null, iCoerceAtLeast, 0, null, null, false, null, 0, 0, 0.0d, 2043, null);
        c01091.L$0 = SpillingKt.nullOutSpilledVariable(str2);
        c01091.L$1 = SpillingKt.nullOutSpilledVariable(user3);
        c01091.I$0 = i2;
        c01091.I$1 = iCoerceAtLeast;
        c01091.label = 2;
        if (bookRepository.updateUser(userCopy$default, c01091) != coroutine_suspended) {
            i3 = iCoerceAtLeast;
            return Boxing.boxInt(i3);
        }
        return coroutine_suspended;
    }

    public final void validateAndSendMessage(String bookId, String receiver, String content, Function2<? super Boolean, ? super String, Unit> onResult) {
        Intrinsics.checkNotNullParameter(bookId, "bookId");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        String str = (String) this.currentUser.getValue();
        String str2 = str;
        if (str2 == null || StringsKt.isBlank(str2)) {
            onResult.invoke(false, "User not authenticated");
        } else if (StringsKt.isBlank(content)) {
            onResult.invoke(false, "Message cannot be empty");
        } else {
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new C01291(receiver, bookId, this, str, content, onResult, null), 3, (Object) null);
        }
    }

    /* JADX INFO: renamed from: com.example.ui.BookViewModel$validateAndSendMessage$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BookViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.BookViewModel$validateAndSendMessage$1", f = "BookViewModel.kt", i = {1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5}, l = {1181, 1192, 1217, 1252, 1255, 1271}, m = "invokeSuspend", n = {"targetReceiver", "apiKey", "targetReceiver", "apiKey", "book", "overdueNote", "prompt", "req", "targetReceiver", "apiKey", "reason", "normalizedSender", "normalizedReceiver", "participants", "message", "isSafe", "targetReceiver", "apiKey", "reason", "isSafe", "t", "normalizedSender", "normalizedReceiver", "participants", "fallbackMsg"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4"})
    static final class C01291 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $bookId;
        final /* synthetic */ String $content;
        final /* synthetic */ Function2<Boolean, String, Unit> $onResult;
        final /* synthetic */ String $receiver;
        final /* synthetic */ String $sender;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        boolean Z$0;
        int label;
        final /* synthetic */ BookViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C01291(String str, String str2, BookViewModel bookViewModel, String str3, String str4, Function2<? super Boolean, ? super String, Unit> function2, Continuation<? super C01291> continuation) {
            super(2, continuation);
            this.$receiver = str;
            this.$bookId = str2;
            this.this$0 = bookViewModel;
            this.$sender = str3;
            this.$content = str4;
            this.$onResult = function2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C01291(this.$receiver, this.$bookId, this.this$0, this.$sender, this.$content, this.$onResult, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:108:0x0300  */
        /* JADX WARN: Code duplicated, block: B:111:0x0305  */
        /* JADX WARN: Code duplicated, block: B:115:0x0325 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:116:0x0327 A[Catch: all -> 0x00d9, Exception -> 0x037c, TryCatch #2 {Exception -> 0x037c, blocks: (B:96:0x02cd, B:98:0x02db, B:100:0x02e1, B:102:0x02e7, B:104:0x02ef, B:106:0x02f5, B:112:0x0308, B:114:0x030e, B:120:0x0349, B:124:0x035e, B:125:0x036d, B:116:0x0327, B:118:0x0330, B:89:0x022c, B:93:0x023d), top: B:182:0x022c }] */
        /* JADX WARN: Code duplicated, block: B:120:0x0349 A[Catch: all -> 0x00d9, Exception -> 0x037c, TryCatch #2 {Exception -> 0x037c, blocks: (B:96:0x02cd, B:98:0x02db, B:100:0x02e1, B:102:0x02e7, B:104:0x02ef, B:106:0x02f5, B:112:0x0308, B:114:0x030e, B:120:0x0349, B:124:0x035e, B:125:0x036d, B:116:0x0327, B:118:0x0330, B:89:0x022c, B:93:0x023d), top: B:182:0x022c }] */
        /* JADX WARN: Code duplicated, block: B:122:0x035a  */
        /* JADX WARN: Code duplicated, block: B:123:0x035c  */
        /* JADX WARN: Code duplicated, block: B:125:0x036d A[Catch: all -> 0x00d9, Exception -> 0x037c, TRY_LEAVE, TryCatch #2 {Exception -> 0x037c, blocks: (B:96:0x02cd, B:98:0x02db, B:100:0x02e1, B:102:0x02e7, B:104:0x02ef, B:106:0x02f5, B:112:0x0308, B:114:0x030e, B:120:0x0349, B:124:0x035e, B:125:0x036d, B:116:0x0327, B:118:0x0330, B:89:0x022c, B:93:0x023d), top: B:182:0x022c }] */
        /* JADX WARN: Code duplicated, block: B:136:0x03c6 A[Catch: all -> 0x00d9, TryCatch #4 {all -> 0x00d9, blocks: (B:8:0x0061, B:162:0x053a, B:11:0x0082, B:158:0x0501, B:14:0x009f, B:96:0x02cd, B:98:0x02db, B:100:0x02e1, B:102:0x02e7, B:104:0x02ef, B:106:0x02f5, B:112:0x0308, B:114:0x030e, B:120:0x0349, B:124:0x035e, B:147:0x040e, B:149:0x0420, B:150:0x0465, B:152:0x046b, B:154:0x047a, B:155:0x047e, B:159:0x050e, B:125:0x036d, B:116:0x0327, B:118:0x0330, B:134:0x0388, B:136:0x03c6, B:145:0x0402, B:139:0x03d0, B:140:0x03d4, B:142:0x03da, B:144:0x03f6, B:19:0x00bd, B:83:0x021d, B:89:0x022c, B:93:0x023d, B:24:0x00d3, B:37:0x0111, B:43:0x011d, B:45:0x0125, B:59:0x0148, B:60:0x014c, B:62:0x0155, B:64:0x018c, B:76:0x01e4, B:67:0x019a, B:68:0x019e, B:70:0x01a4, B:72:0x01c4, B:74:0x01ca, B:77:0x01ef, B:79:0x01fd, B:50:0x0133, B:55:0x013e, B:29:0x00df, B:31:0x00e9, B:32:0x00ee, B:34:0x00f8), top: B:185:0x0031 }] */
        /* JADX WARN: Code duplicated, block: B:139:0x03d0 A[Catch: all -> 0x00d9, TryCatch #4 {all -> 0x00d9, blocks: (B:8:0x0061, B:162:0x053a, B:11:0x0082, B:158:0x0501, B:14:0x009f, B:96:0x02cd, B:98:0x02db, B:100:0x02e1, B:102:0x02e7, B:104:0x02ef, B:106:0x02f5, B:112:0x0308, B:114:0x030e, B:120:0x0349, B:124:0x035e, B:147:0x040e, B:149:0x0420, B:150:0x0465, B:152:0x046b, B:154:0x047a, B:155:0x047e, B:159:0x050e, B:125:0x036d, B:116:0x0327, B:118:0x0330, B:134:0x0388, B:136:0x03c6, B:145:0x0402, B:139:0x03d0, B:140:0x03d4, B:142:0x03da, B:144:0x03f6, B:19:0x00bd, B:83:0x021d, B:89:0x022c, B:93:0x023d, B:24:0x00d3, B:37:0x0111, B:43:0x011d, B:45:0x0125, B:59:0x0148, B:60:0x014c, B:62:0x0155, B:64:0x018c, B:76:0x01e4, B:67:0x019a, B:68:0x019e, B:70:0x01a4, B:72:0x01c4, B:74:0x01ca, B:77:0x01ef, B:79:0x01fd, B:50:0x0133, B:55:0x013e, B:29:0x00df, B:31:0x00e9, B:32:0x00ee, B:34:0x00f8), top: B:185:0x0031 }] */
        /* JADX WARN: Code duplicated, block: B:142:0x03da A[Catch: all -> 0x00d9, TryCatch #4 {all -> 0x00d9, blocks: (B:8:0x0061, B:162:0x053a, B:11:0x0082, B:158:0x0501, B:14:0x009f, B:96:0x02cd, B:98:0x02db, B:100:0x02e1, B:102:0x02e7, B:104:0x02ef, B:106:0x02f5, B:112:0x0308, B:114:0x030e, B:120:0x0349, B:124:0x035e, B:147:0x040e, B:149:0x0420, B:150:0x0465, B:152:0x046b, B:154:0x047a, B:155:0x047e, B:159:0x050e, B:125:0x036d, B:116:0x0327, B:118:0x0330, B:134:0x0388, B:136:0x03c6, B:145:0x0402, B:139:0x03d0, B:140:0x03d4, B:142:0x03da, B:144:0x03f6, B:19:0x00bd, B:83:0x021d, B:89:0x022c, B:93:0x023d, B:24:0x00d3, B:37:0x0111, B:43:0x011d, B:45:0x0125, B:59:0x0148, B:60:0x014c, B:62:0x0155, B:64:0x018c, B:76:0x01e4, B:67:0x019a, B:68:0x019e, B:70:0x01a4, B:72:0x01c4, B:74:0x01ca, B:77:0x01ef, B:79:0x01fd, B:50:0x0133, B:55:0x013e, B:29:0x00df, B:31:0x00e9, B:32:0x00ee, B:34:0x00f8), top: B:185:0x0031 }] */
        /* JADX WARN: Code duplicated, block: B:149:0x0420 A[Catch: all -> 0x00d9, TryCatch #4 {all -> 0x00d9, blocks: (B:8:0x0061, B:162:0x053a, B:11:0x0082, B:158:0x0501, B:14:0x009f, B:96:0x02cd, B:98:0x02db, B:100:0x02e1, B:102:0x02e7, B:104:0x02ef, B:106:0x02f5, B:112:0x0308, B:114:0x030e, B:120:0x0349, B:124:0x035e, B:147:0x040e, B:149:0x0420, B:150:0x0465, B:152:0x046b, B:154:0x047a, B:155:0x047e, B:159:0x050e, B:125:0x036d, B:116:0x0327, B:118:0x0330, B:134:0x0388, B:136:0x03c6, B:145:0x0402, B:139:0x03d0, B:140:0x03d4, B:142:0x03da, B:144:0x03f6, B:19:0x00bd, B:83:0x021d, B:89:0x022c, B:93:0x023d, B:24:0x00d3, B:37:0x0111, B:43:0x011d, B:45:0x0125, B:59:0x0148, B:60:0x014c, B:62:0x0155, B:64:0x018c, B:76:0x01e4, B:67:0x019a, B:68:0x019e, B:70:0x01a4, B:72:0x01c4, B:74:0x01ca, B:77:0x01ef, B:79:0x01fd, B:50:0x0133, B:55:0x013e, B:29:0x00df, B:31:0x00e9, B:32:0x00ee, B:34:0x00f8), top: B:185:0x0031 }] */
        /* JADX WARN: Code duplicated, block: B:152:0x046b A[Catch: all -> 0x00d9, TryCatch #4 {all -> 0x00d9, blocks: (B:8:0x0061, B:162:0x053a, B:11:0x0082, B:158:0x0501, B:14:0x009f, B:96:0x02cd, B:98:0x02db, B:100:0x02e1, B:102:0x02e7, B:104:0x02ef, B:106:0x02f5, B:112:0x0308, B:114:0x030e, B:120:0x0349, B:124:0x035e, B:147:0x040e, B:149:0x0420, B:150:0x0465, B:152:0x046b, B:154:0x047a, B:155:0x047e, B:159:0x050e, B:125:0x036d, B:116:0x0327, B:118:0x0330, B:134:0x0388, B:136:0x03c6, B:145:0x0402, B:139:0x03d0, B:140:0x03d4, B:142:0x03da, B:144:0x03f6, B:19:0x00bd, B:83:0x021d, B:89:0x022c, B:93:0x023d, B:24:0x00d3, B:37:0x0111, B:43:0x011d, B:45:0x0125, B:59:0x0148, B:60:0x014c, B:62:0x0155, B:64:0x018c, B:76:0x01e4, B:67:0x019a, B:68:0x019e, B:70:0x01a4, B:72:0x01c4, B:74:0x01ca, B:77:0x01ef, B:79:0x01fd, B:50:0x0133, B:55:0x013e, B:29:0x00df, B:31:0x00e9, B:32:0x00ee, B:34:0x00f8), top: B:185:0x0031 }] */
        /* JADX WARN: Code duplicated, block: B:157:0x04ff  */
        /* JADX WARN: Code duplicated, block: B:159:0x050e A[Catch: all -> 0x00d9, TryCatch #4 {all -> 0x00d9, blocks: (B:8:0x0061, B:162:0x053a, B:11:0x0082, B:158:0x0501, B:14:0x009f, B:96:0x02cd, B:98:0x02db, B:100:0x02e1, B:102:0x02e7, B:104:0x02ef, B:106:0x02f5, B:112:0x0308, B:114:0x030e, B:120:0x0349, B:124:0x035e, B:147:0x040e, B:149:0x0420, B:150:0x0465, B:152:0x046b, B:154:0x047a, B:155:0x047e, B:159:0x050e, B:125:0x036d, B:116:0x0327, B:118:0x0330, B:134:0x0388, B:136:0x03c6, B:145:0x0402, B:139:0x03d0, B:140:0x03d4, B:142:0x03da, B:144:0x03f6, B:19:0x00bd, B:83:0x021d, B:89:0x022c, B:93:0x023d, B:24:0x00d3, B:37:0x0111, B:43:0x011d, B:45:0x0125, B:59:0x0148, B:60:0x014c, B:62:0x0155, B:64:0x018c, B:76:0x01e4, B:67:0x019a, B:68:0x019e, B:70:0x01a4, B:72:0x01c4, B:74:0x01ca, B:77:0x01ef, B:79:0x01fd, B:50:0x0133, B:55:0x013e, B:29:0x00df, B:31:0x00e9, B:32:0x00ee, B:34:0x00f8), top: B:185:0x0031 }] */
        /* JADX WARN: Code duplicated, block: B:161:0x0538  */
        /* JADX WARN: Code duplicated, block: B:182:0x022c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:186:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:193:0x047a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:195:0x0465 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:197:0x0402 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:198:0x03f6 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:199:? A[LOOP:1: B:140:0x03d4->B:199:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:200:0x0195 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:201:0x01ca A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:45:0x0125 A[Catch: all -> 0x00d9, TryCatch #4 {all -> 0x00d9, blocks: (B:8:0x0061, B:162:0x053a, B:11:0x0082, B:158:0x0501, B:14:0x009f, B:96:0x02cd, B:98:0x02db, B:100:0x02e1, B:102:0x02e7, B:104:0x02ef, B:106:0x02f5, B:112:0x0308, B:114:0x030e, B:120:0x0349, B:124:0x035e, B:147:0x040e, B:149:0x0420, B:150:0x0465, B:152:0x046b, B:154:0x047a, B:155:0x047e, B:159:0x050e, B:125:0x036d, B:116:0x0327, B:118:0x0330, B:134:0x0388, B:136:0x03c6, B:145:0x0402, B:139:0x03d0, B:140:0x03d4, B:142:0x03da, B:144:0x03f6, B:19:0x00bd, B:83:0x021d, B:89:0x022c, B:93:0x023d, B:24:0x00d3, B:37:0x0111, B:43:0x011d, B:45:0x0125, B:59:0x0148, B:60:0x014c, B:62:0x0155, B:64:0x018c, B:76:0x01e4, B:67:0x019a, B:68:0x019e, B:70:0x01a4, B:72:0x01c4, B:74:0x01ca, B:77:0x01ef, B:79:0x01fd, B:50:0x0133, B:55:0x013e, B:29:0x00df, B:31:0x00e9, B:32:0x00ee, B:34:0x00f8), top: B:185:0x0031 }] */
        /* JADX WARN: Code duplicated, block: B:48:0x012f  */
        /* JADX WARN: Code duplicated, block: B:50:0x0133 A[Catch: all -> 0x00d9, TryCatch #4 {all -> 0x00d9, blocks: (B:8:0x0061, B:162:0x053a, B:11:0x0082, B:158:0x0501, B:14:0x009f, B:96:0x02cd, B:98:0x02db, B:100:0x02e1, B:102:0x02e7, B:104:0x02ef, B:106:0x02f5, B:112:0x0308, B:114:0x030e, B:120:0x0349, B:124:0x035e, B:147:0x040e, B:149:0x0420, B:150:0x0465, B:152:0x046b, B:154:0x047a, B:155:0x047e, B:159:0x050e, B:125:0x036d, B:116:0x0327, B:118:0x0330, B:134:0x0388, B:136:0x03c6, B:145:0x0402, B:139:0x03d0, B:140:0x03d4, B:142:0x03da, B:144:0x03f6, B:19:0x00bd, B:83:0x021d, B:89:0x022c, B:93:0x023d, B:24:0x00d3, B:37:0x0111, B:43:0x011d, B:45:0x0125, B:59:0x0148, B:60:0x014c, B:62:0x0155, B:64:0x018c, B:76:0x01e4, B:67:0x019a, B:68:0x019e, B:70:0x01a4, B:72:0x01c4, B:74:0x01ca, B:77:0x01ef, B:79:0x01fd, B:50:0x0133, B:55:0x013e, B:29:0x00df, B:31:0x00e9, B:32:0x00ee, B:34:0x00f8), top: B:185:0x0031 }] */
        /* JADX WARN: Code duplicated, block: B:54:0x013c A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:55:0x013e A[Catch: all -> 0x00d9, TryCatch #4 {all -> 0x00d9, blocks: (B:8:0x0061, B:162:0x053a, B:11:0x0082, B:158:0x0501, B:14:0x009f, B:96:0x02cd, B:98:0x02db, B:100:0x02e1, B:102:0x02e7, B:104:0x02ef, B:106:0x02f5, B:112:0x0308, B:114:0x030e, B:120:0x0349, B:124:0x035e, B:147:0x040e, B:149:0x0420, B:150:0x0465, B:152:0x046b, B:154:0x047a, B:155:0x047e, B:159:0x050e, B:125:0x036d, B:116:0x0327, B:118:0x0330, B:134:0x0388, B:136:0x03c6, B:145:0x0402, B:139:0x03d0, B:140:0x03d4, B:142:0x03da, B:144:0x03f6, B:19:0x00bd, B:83:0x021d, B:89:0x022c, B:93:0x023d, B:24:0x00d3, B:37:0x0111, B:43:0x011d, B:45:0x0125, B:59:0x0148, B:60:0x014c, B:62:0x0155, B:64:0x018c, B:76:0x01e4, B:67:0x019a, B:68:0x019e, B:70:0x01a4, B:72:0x01c4, B:74:0x01ca, B:77:0x01ef, B:79:0x01fd, B:50:0x0133, B:55:0x013e, B:29:0x00df, B:31:0x00e9, B:32:0x00ee, B:34:0x00f8), top: B:185:0x0031 }] */
        /* JADX WARN: Code duplicated, block: B:56:0x0143  */
        /* JADX WARN: Code duplicated, block: B:58:0x0146  */
        /* JADX WARN: Code duplicated, block: B:62:0x0155 A[Catch: all -> 0x00d9, Exception -> 0x0382, TryCatch #4 {all -> 0x00d9, blocks: (B:8:0x0061, B:162:0x053a, B:11:0x0082, B:158:0x0501, B:14:0x009f, B:96:0x02cd, B:98:0x02db, B:100:0x02e1, B:102:0x02e7, B:104:0x02ef, B:106:0x02f5, B:112:0x0308, B:114:0x030e, B:120:0x0349, B:124:0x035e, B:147:0x040e, B:149:0x0420, B:150:0x0465, B:152:0x046b, B:154:0x047a, B:155:0x047e, B:159:0x050e, B:125:0x036d, B:116:0x0327, B:118:0x0330, B:134:0x0388, B:136:0x03c6, B:145:0x0402, B:139:0x03d0, B:140:0x03d4, B:142:0x03da, B:144:0x03f6, B:19:0x00bd, B:83:0x021d, B:89:0x022c, B:93:0x023d, B:24:0x00d3, B:37:0x0111, B:43:0x011d, B:45:0x0125, B:59:0x0148, B:60:0x014c, B:62:0x0155, B:64:0x018c, B:76:0x01e4, B:67:0x019a, B:68:0x019e, B:70:0x01a4, B:72:0x01c4, B:74:0x01ca, B:77:0x01ef, B:79:0x01fd, B:50:0x0133, B:55:0x013e, B:29:0x00df, B:31:0x00e9, B:32:0x00ee, B:34:0x00f8), top: B:185:0x0031 }] */
        /* JADX WARN: Code duplicated, block: B:64:0x018c A[Catch: all -> 0x00d9, Exception -> 0x0382, TryCatch #4 {all -> 0x00d9, blocks: (B:8:0x0061, B:162:0x053a, B:11:0x0082, B:158:0x0501, B:14:0x009f, B:96:0x02cd, B:98:0x02db, B:100:0x02e1, B:102:0x02e7, B:104:0x02ef, B:106:0x02f5, B:112:0x0308, B:114:0x030e, B:120:0x0349, B:124:0x035e, B:147:0x040e, B:149:0x0420, B:150:0x0465, B:152:0x046b, B:154:0x047a, B:155:0x047e, B:159:0x050e, B:125:0x036d, B:116:0x0327, B:118:0x0330, B:134:0x0388, B:136:0x03c6, B:145:0x0402, B:139:0x03d0, B:140:0x03d4, B:142:0x03da, B:144:0x03f6, B:19:0x00bd, B:83:0x021d, B:89:0x022c, B:93:0x023d, B:24:0x00d3, B:37:0x0111, B:43:0x011d, B:45:0x0125, B:59:0x0148, B:60:0x014c, B:62:0x0155, B:64:0x018c, B:76:0x01e4, B:67:0x019a, B:68:0x019e, B:70:0x01a4, B:72:0x01c4, B:74:0x01ca, B:77:0x01ef, B:79:0x01fd, B:50:0x0133, B:55:0x013e, B:29:0x00df, B:31:0x00e9, B:32:0x00ee, B:34:0x00f8), top: B:185:0x0031 }] */
        /* JADX WARN: Code duplicated, block: B:67:0x019a A[Catch: all -> 0x00d9, Exception -> 0x0382, TryCatch #4 {all -> 0x00d9, blocks: (B:8:0x0061, B:162:0x053a, B:11:0x0082, B:158:0x0501, B:14:0x009f, B:96:0x02cd, B:98:0x02db, B:100:0x02e1, B:102:0x02e7, B:104:0x02ef, B:106:0x02f5, B:112:0x0308, B:114:0x030e, B:120:0x0349, B:124:0x035e, B:147:0x040e, B:149:0x0420, B:150:0x0465, B:152:0x046b, B:154:0x047a, B:155:0x047e, B:159:0x050e, B:125:0x036d, B:116:0x0327, B:118:0x0330, B:134:0x0388, B:136:0x03c6, B:145:0x0402, B:139:0x03d0, B:140:0x03d4, B:142:0x03da, B:144:0x03f6, B:19:0x00bd, B:83:0x021d, B:89:0x022c, B:93:0x023d, B:24:0x00d3, B:37:0x0111, B:43:0x011d, B:45:0x0125, B:59:0x0148, B:60:0x014c, B:62:0x0155, B:64:0x018c, B:76:0x01e4, B:67:0x019a, B:68:0x019e, B:70:0x01a4, B:72:0x01c4, B:74:0x01ca, B:77:0x01ef, B:79:0x01fd, B:50:0x0133, B:55:0x013e, B:29:0x00df, B:31:0x00e9, B:32:0x00ee, B:34:0x00f8), top: B:185:0x0031 }] */
        /* JADX WARN: Code duplicated, block: B:70:0x01a4 A[Catch: all -> 0x00d9, Exception -> 0x0382, TRY_LEAVE, TryCatch #4 {all -> 0x00d9, blocks: (B:8:0x0061, B:162:0x053a, B:11:0x0082, B:158:0x0501, B:14:0x009f, B:96:0x02cd, B:98:0x02db, B:100:0x02e1, B:102:0x02e7, B:104:0x02ef, B:106:0x02f5, B:112:0x0308, B:114:0x030e, B:120:0x0349, B:124:0x035e, B:147:0x040e, B:149:0x0420, B:150:0x0465, B:152:0x046b, B:154:0x047a, B:155:0x047e, B:159:0x050e, B:125:0x036d, B:116:0x0327, B:118:0x0330, B:134:0x0388, B:136:0x03c6, B:145:0x0402, B:139:0x03d0, B:140:0x03d4, B:142:0x03da, B:144:0x03f6, B:19:0x00bd, B:83:0x021d, B:89:0x022c, B:93:0x023d, B:24:0x00d3, B:37:0x0111, B:43:0x011d, B:45:0x0125, B:59:0x0148, B:60:0x014c, B:62:0x0155, B:64:0x018c, B:76:0x01e4, B:67:0x019a, B:68:0x019e, B:70:0x01a4, B:72:0x01c4, B:74:0x01ca, B:77:0x01ef, B:79:0x01fd, B:50:0x0133, B:55:0x013e, B:29:0x00df, B:31:0x00e9, B:32:0x00ee, B:34:0x00f8), top: B:185:0x0031 }] */
        /* JADX WARN: Code duplicated, block: B:75:0x01d7 A[LOOP:2: B:68:0x019e->B:75:0x01d7, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:77:0x01ef A[Catch: all -> 0x00d9, Exception -> 0x0380, TryCatch #0 {Exception -> 0x0380, blocks: (B:76:0x01e4, B:72:0x01c4, B:74:0x01ca, B:77:0x01ef, B:79:0x01fd), top: B:179:0x0153 }] */
        /* JADX WARN: Code duplicated, block: B:79:0x01fd A[Catch: all -> 0x00d9, Exception -> 0x0380, TRY_LEAVE, TryCatch #0 {Exception -> 0x0380, blocks: (B:76:0x01e4, B:72:0x01c4, B:74:0x01ca, B:77:0x01ef, B:79:0x01fd), top: B:179:0x0153 }] */
        /* JADX WARN: Code duplicated, block: B:82:0x021b  */
        /* JADX WARN: Code duplicated, block: B:87:0x0227  */
        /* JADX WARN: Code duplicated, block: B:91:0x0238  */
        /* JADX WARN: Code duplicated, block: B:92:0x023b  */
        /* JADX WARN: Code duplicated, block: B:95:0x02cb  */
        /* JADX WARN: Code duplicated, block: B:96:0x02cd A[Catch: all -> 0x00d9, Exception -> 0x037c, PHI: r2 r4 r25 r30
          0x02cd: PHI (r2v39 java.lang.Object) = (r2v28 java.lang.Object), (r2v71 java.lang.Object) binds: [B:94:0x02c9, B:15:0x00a2] A[DONT_GENERATE, DONT_INLINE]
          0x02cd: PHI (r4v47 java.lang.String) = (r4v36 java.lang.String), (r4v49 java.lang.String) binds: [B:94:0x02c9, B:15:0x00a2] A[DONT_GENERATE, DONT_INLINE]
          0x02cd: PHI (r25v14 boolean) = (r25v8 boolean), (r25v16 boolean) binds: [B:94:0x02c9, B:15:0x00a2] A[DONT_GENERATE, DONT_INLINE]
          0x02cd: PHI (r30v5 java.lang.String) = (r30v2 java.lang.String), (r30v6 java.lang.String) binds: [B:94:0x02c9, B:15:0x00a2] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {Exception -> 0x037c, blocks: (B:96:0x02cd, B:98:0x02db, B:100:0x02e1, B:102:0x02e7, B:104:0x02ef, B:106:0x02f5, B:112:0x0308, B:114:0x030e, B:120:0x0349, B:124:0x035e, B:125:0x036d, B:116:0x0327, B:118:0x0330, B:89:0x022c, B:93:0x023d), top: B:182:0x022c }] */
        /* JADX WARN: Code duplicated, block: B:98:0x02db A[Catch: all -> 0x00d9, Exception -> 0x037c, TryCatch #2 {Exception -> 0x037c, blocks: (B:96:0x02cd, B:98:0x02db, B:100:0x02e1, B:102:0x02e7, B:104:0x02ef, B:106:0x02f5, B:112:0x0308, B:114:0x030e, B:120:0x0349, B:124:0x035e, B:125:0x036d, B:116:0x0327, B:118:0x0330, B:89:0x022c, B:93:0x023d), top: B:182:0x022c }] */
        /* JADX WARN: Code restructure failed: missing block: B:174:0x062b, code lost:
        
            if (r48.this$0.repository.insertMessage(r26, (kotlin.coroutines.Continuation) r48) == r3) goto L175;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r49) {
            /*
                Method dump skipped, instruction units count: 1614
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.example.ui.BookViewModel.C01291.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: BookViewModel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\b\u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\fH\u0016¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/example/ui/BookViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "repository", "Lcom/example/data/BookRepository;", "appContext", "Landroid/content/Context;", "<init>", "(Lcom/example/data/BookRepository;Landroid/content/Context;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Factory implements ViewModelProvider.Factory {
        public static final int $stable = 8;
        private final Context appContext;
        private final BookRepository repository;

        public Factory(BookRepository bookRepository, Context context) {
            Intrinsics.checkNotNullParameter(bookRepository, "repository");
            Intrinsics.checkNotNullParameter(context, "appContext");
            this.repository = bookRepository;
            this.appContext = context;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> cls, CreationExtras creationExtras) {
            return (T) super.create(cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(KClass<T> kClass, CreationExtras creationExtras) {
            return (T) super.create(kClass, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            if (modelClass.isAssignableFrom(BookViewModel.class)) {
                SharedPreferences sharedPreferences = this.appContext.getSharedPreferences("book_borrow_prefs", 0);
                Context context = this.appContext;
                BookRepository bookRepository = this.repository;
                Intrinsics.checkNotNull(sharedPreferences);
                return new BookViewModel(context, bookRepository, sharedPreferences);
            }
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
    }

    public final Flow<List<Review>> getReviews(String username) {
        Intrinsics.checkNotNullParameter(username, "username");
        return this.repository.getReviewsForUser(username);
    }

    public final Flow<List<Review>> getReviewsForBook(String bookId) {
        Intrinsics.checkNotNullParameter(bookId, "bookId");
        return this.repository.getReviewsForBook(bookId);
    }

    /* JADX INFO: compiled from: BookViewModel.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/example/ui/BookViewModel$ChatAnalysis;", "", "suggestion", "", "meetingRecommendation", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSuggestion", "()Ljava/lang/String;", "getMeetingRecommendation", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChatAnalysis {
        public static final int $stable = 0;
        private final String meetingRecommendation;
        private final String suggestion;

        public static /* synthetic */ ChatAnalysis copy$default(ChatAnalysis chatAnalysis, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = chatAnalysis.suggestion;
            }
            if ((i & 2) != 0) {
                str2 = chatAnalysis.meetingRecommendation;
            }
            return chatAnalysis.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSuggestion() {
            return this.suggestion;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMeetingRecommendation() {
            return this.meetingRecommendation;
        }

        public final ChatAnalysis copy(String suggestion, String meetingRecommendation) {
            return new ChatAnalysis(suggestion, meetingRecommendation);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChatAnalysis)) {
                return false;
            }
            ChatAnalysis chatAnalysis = (ChatAnalysis) other;
            return Intrinsics.areEqual(this.suggestion, chatAnalysis.suggestion) && Intrinsics.areEqual(this.meetingRecommendation, chatAnalysis.meetingRecommendation);
        }

        public int hashCode() {
            String str = this.suggestion;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.meetingRecommendation;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "ChatAnalysis(suggestion=" + this.suggestion + ", meetingRecommendation=" + this.meetingRecommendation + ")";
        }

        public ChatAnalysis(String str, String str2) {
            this.suggestion = str;
            this.meetingRecommendation = str2;
        }

        public final String getMeetingRecommendation() {
            return this.meetingRecommendation;
        }

        public final String getSuggestion() {
            return this.suggestion;
        }
    }

    public static /* synthetic */ Object analyzeChat$default(BookViewModel bookViewModel, List list, String str, String str2, String str3, Continuation continuation, int i, Object obj) {
        if ((i & 8) != 0) {
            str3 = "";
        }
        return bookViewModel.analyzeChat(list, str, str2, str3, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x010d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01dc, code lost:
    
        if (r5 == r9) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object analyzeChat(java.util.List<com.example.data.Message> r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, kotlin.coroutines.Continuation<? super com.example.ui.BookViewModel.ChatAnalysis> r40) {
        /*
            Method dump skipped, instruction units count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.BookViewModel.analyzeChat(java.util.List, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    static final CharSequence analyzeChat$lambda$18(BookViewModel bookViewModel, String str, String str2, Message message) {
        Intrinsics.checkNotNullParameter(message, "it");
        if (!StringsKt.equals(message.getSender(), (String) bookViewModel.currentUser.getValue(), true)) {
            str = str2;
        }
        return str + ": " + message.getContent();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    private final ChatAnalysis getFallbackChatAnalysis(List<Message> messages) {
        String lowerCase;
        String str;
        String content;
        Message message = (Message) CollectionsKt.lastOrNull(messages);
        if (message == null || (content = message.getContent()) == null) {
            lowerCase = "";
        } else {
            lowerCase = content.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (lowerCase == null) {
                lowerCase = "";
            }
        }
        String str2 = lowerCase;
        if (StringsKt.contains$default(str2, "meet", false, 2, (Object) null) || StringsKt.contains$default(str2, "when", false, 2, (Object) null) || StringsKt.contains$default(str2, "time", false, 2, (Object) null)) {
            str = "Sounds good! Where should we meet?";
        } else if (StringsKt.contains$default(str2, "where", false, 2, (Object) null) || StringsKt.contains$default(str2, "location", false, 2, (Object) null) || StringsKt.contains$default(str2, "place", false, 2, (Object) null)) {
            str = "How about near the local library or metro station?";
        } else if (StringsKt.contains$default(str2, "available", false, 2, (Object) null) || StringsKt.contains$default(str2, "have", false, 2, (Object) null)) {
            str = "Yes, it is available! Let's arrange pickup.";
        } else if (StringsKt.contains$default(str2, "condition", false, 2, (Object) null) || StringsKt.contains$default(str2, "photo", false, 2, (Object) null)) {
            str = "You can click on the book photo above to inspect its full condition!";
        } else if (StringsKt.contains$default(str2, "thank", false, 2, (Object) null) || StringsKt.contains$default(str2, "thx", false, 2, (Object) null)) {
            str = "You're very welcome! Happy reading!";
        } else {
            str = "Okay, understood.";
        }
        return new ChatAnalysis(str, null);
    }
}
