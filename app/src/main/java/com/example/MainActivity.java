package com.example;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import androidx.activity.SystemBarStyle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.example.data.Book;
import com.example.data.BookRepository;
import com.example.data.Message;
import com.example.ui.BookViewModel;
import com.example.ui.NotificationHelper;
import com.example.ui.theme.ThemeKt;
import com.google.firebase.FirebaseApp;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreSettings;
import com.google.firebase.firestore.PersistentCacheSettings;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: MainActivity.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0014R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f²\u0006\f\u0010\u0010\u001a\u0004\u0018\u00010\u0007X\u008a\u0084\u0002²\u0006\u0010\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u008a\u0084\u0002²\u0006\u0010\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012X\u008a\u008e\u0002"}, d2 = {"Lcom/example/MainActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "requestPermissionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "intent", "Landroid/content/Intent;", "app", "currentUser", "allBooks", "", "Lcom/example/data/Book;", "userMessages", "Lcom/example/data/Message;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MainActivity extends ComponentActivity {
    public static final int $stable = 8;
    private final ActivityResultLauncher<String[]> requestPermissionLauncher = registerForActivityResult((ActivityResultContract) new ActivityResultContracts.RequestMultiplePermissions(), new ActivityResultCallback() { // from class: com.example.MainActivity$$ExternalSyntheticLambda3
        public final void onActivityResult(Object obj) {
            Intrinsics.checkNotNullParameter((Map) obj, "permissions");
        }
    });

    /* JADX WARN: Multi-variable type inference failed */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        NotificationHelper.INSTANCE.createNotificationChannel((Context) this);
        List listMutableListOf = CollectionsKt.mutableListOf(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"});
        if (Build.VERSION.SDK_INT >= 33) {
            listMutableListOf.add("android.permission.POST_NOTIFICATIONS");
        }
        this.requestPermissionLauncher.launch(listMutableListOf.toArray(new String[0]));
        MainActivity mainActivity = this;
        EdgeToEdge.enable$default(mainActivity, (SystemBarStyle) null, (SystemBarStyle) null, 3, (Object) null);
        try {
            if (FirebaseApp.getApps((Context) this).isEmpty()) {
                FirebaseApp.initializeApp(getApplicationContext());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        FirebaseFirestore firebaseFirestore = FirebaseFirestore.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseFirestore, "getInstance(...)");
        try {
            FirebaseFirestoreSettings firebaseFirestoreSettingsBuild = new FirebaseFirestoreSettings.Builder().setLocalCacheSettings(PersistentCacheSettings.newBuilder().build()).build();
            Intrinsics.checkNotNullExpressionValue(firebaseFirestoreSettingsBuild, "build(...)");
            firebaseFirestore.setFirestoreSettings(firebaseFirestoreSettingsBuild);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        final BookRepository bookRepository = new BookRepository(firebaseFirestore);
        ComponentActivityKt.setContent$default(mainActivity, (CompositionContext) null, ComposableLambdaKt.composableLambdaInstance(-601144069, true, new Function2() { // from class: com.example.MainActivity$$ExternalSyntheticLambda0
            public final Object invoke(Object obj, Object obj2) {
                return MainActivity.onCreate$lambda$11(bookRepository, this, (Composer) obj, ((Integer) obj2).intValue());
            }
        }), 1, (Object) null);
    }

    static final Unit onCreate$lambda$11(final BookRepository bookRepository, final MainActivity mainActivity, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C104@4000L1776,104@3981L1795:MainActivity.kt#to5c3");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-601144069, i, -1, "com.example.MainActivity.onCreate.<anonymous> (MainActivity.kt:104)");
            }
            ThemeKt.MyApplicationTheme(false, false, ComposableLambdaKt.rememberComposableLambda(434770631, true, new Function2() { // from class: com.example.MainActivity$$ExternalSyntheticLambda2
                public final Object invoke(Object obj, Object obj2) {
                    return MainActivity.onCreate$lambda$11$lambda$10(bookRepository, mainActivity, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit onCreate$lambda$11$lambda$10(final BookRepository bookRepository, final MainActivity mainActivity, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C107@4124L11,108@4165L1597,105@4018L1744:MainActivity.kt#to5c3");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(434770631, i, -1, "com.example.MainActivity.onCreate.<anonymous>.<anonymous> (MainActivity.kt:105)");
            }
            SurfaceKt.Surface-T9BRK9s(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null), (Shape) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getBackground-0d7_KjU(), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-243035316, true, new Function2() { // from class: com.example.MainActivity$$ExternalSyntheticLambda1
                public final Object invoke(Object obj, Object obj2) {
                    return MainActivity.onCreate$lambda$11$lambda$10$lambda$9(bookRepository, mainActivity, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 12582918, 122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit onCreate$lambda$11$lambda$10$lambda$9(BookRepository bookRepository, MainActivity mainActivity, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C110@4315L37,113@4456L16,114@4528L16,116@4624L129,116@4586L167,121@4901L49,122@4999L496,122@4971L524,133@5558L140,133@5537L161,138@5720L24:MainActivity.kt#to5c3");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-243035316, i, -1, "com.example.MainActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:109)");
            }
            Context applicationContext = mainActivity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            BookViewModel.Factory factory = new BookViewModel.Factory(bookRepository, applicationContext);
            composer.startReplaceableGroup(1729797275);
            ComposerKt.sourceInformation(composer, "CC(viewModel)P(3,2,1)*54@2502L7,64@2877L63:ViewModel.kt#3tja67");
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(BookViewModel.class), current, (String) null, factory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer, 0, 0);
            composer.endReplaceableGroup();
            BookViewModel bookViewModel = (BookViewModel) viewModel;
            State stateCollectAsState = SnapshotStateKt.collectAsState(bookViewModel.getCurrentUser(), (CoroutineContext) null, composer, 0, 1);
            State stateCollectAsState2 = SnapshotStateKt.collectAsState(bookViewModel.getAllBooks(), (CoroutineContext) null, composer, 0, 1);
            List<Book> listOnCreate$lambda$11$lambda$10$lambda$9$lambda$2 = onCreate$lambda$11$lambda$10$lambda$9$lambda$2(stateCollectAsState2);
            String strOnCreate$lambda$11$lambda$10$lambda$9$lambda$1 = onCreate$lambda$11$lambda$10$lambda$9$lambda$1(stateCollectAsState);
            ComposerKt.sourceInformationMarkerStart(composer, -1628689875, "CC(remember):MainActivity.kt#9igjgp");
            boolean zChangedInstance = composer.changedInstance(mainActivity) | composer.changed(stateCollectAsState2) | composer.changed(stateCollectAsState);
            MainActivity$onCreate$1$1$1$1$1 mainActivity$onCreate$1$1$1$1$1RememberedValue = composer.rememberedValue();
            if (zChangedInstance || mainActivity$onCreate$1$1$1$1$1RememberedValue == Composer.Companion.getEmpty()) {
                mainActivity$onCreate$1$1$1$1$1RememberedValue = new MainActivity$onCreate$1$1$1$1$1(mainActivity, stateCollectAsState2, stateCollectAsState, null);
                composer.updateRememberedValue(mainActivity$onCreate$1$1$1$1$1RememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            EffectsKt.LaunchedEffect(listOnCreate$lambda$11$lambda$10$lambda$9$lambda$2, strOnCreate$lambda$11$lambda$10$lambda$9$lambda$1, (Function2) mainActivity$onCreate$1$1$1$1$1RememberedValue, composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1628681091, "CC(remember):MainActivity.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), (SnapshotMutationPolicy) null, 2, (Object) null);
                composer.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            String strOnCreate$lambda$11$lambda$10$lambda$9$lambda$2 = onCreate$lambda$11$lambda$10$lambda$9$lambda$1(stateCollectAsState);
            ComposerKt.sourceInformationMarkerStart(composer, -1628677508, "CC(remember):MainActivity.kt#9igjgp");
            boolean zChanged = composer.changed(stateCollectAsState) | composer.changedInstance(bookViewModel) | composer.changedInstance(mainActivity);
            MainActivity$onCreate$1$1$1$2$1 mainActivity$onCreate$1$1$1$2$1RememberedValue = composer.rememberedValue();
            if (zChanged || mainActivity$onCreate$1$1$1$2$1RememberedValue == Composer.Companion.getEmpty()) {
                mainActivity$onCreate$1$1$1$2$1RememberedValue = new MainActivity$onCreate$1$1$1$2$1(bookViewModel, stateCollectAsState, mainActivity, mutableState, null);
                composer.updateRememberedValue(mainActivity$onCreate$1$1$1$2$1RememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            EffectsKt.LaunchedEffect(strOnCreate$lambda$11$lambda$10$lambda$9$lambda$2, (Function2) mainActivity$onCreate$1$1$1$2$1RememberedValue, composer, 0);
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1628659976, "CC(remember):MainActivity.kt#9igjgp");
            MainActivity$onCreate$1$1$1$3$1 mainActivity$onCreate$1$1$1$3$1RememberedValue = composer.rememberedValue();
            if (mainActivity$onCreate$1$1$1$3$1RememberedValue == Composer.Companion.getEmpty()) {
                mainActivity$onCreate$1$1$1$3$1RememberedValue = new MainActivity$onCreate$1$1$1$3$1(null);
                composer.updateRememberedValue(mainActivity$onCreate$1$1$1$3$1RememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            EffectsKt.LaunchedEffect(unit, (Function2) mainActivity$onCreate$1$1$1$3$1RememberedValue, composer, 6);
            MainActivityKt.BookBorrowApp(bookViewModel, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    private static final List<Message> onCreate$lambda$11$lambda$10$lambda$9$lambda$5(MutableState<List<Message>> mutableState) {
        return (List) ((State) mutableState).getValue();
    }

    protected void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCreate$lambda$11$lambda$10$lambda$9$lambda$1(State<String> state) {
        return (String) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Book> onCreate$lambda$11$lambda$10$lambda$9$lambda$2(State<? extends List<Book>> state) {
        return (List) state.getValue();
    }
}
