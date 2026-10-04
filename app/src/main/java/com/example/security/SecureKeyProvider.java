package com.example.security;

import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: SecureKeyProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\bH\u0002J\b\u0010\u0016\u001a\u00020\u0005H\u0007J\b\u0010\u0017\u001a\u00020\u0005H\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/example/security/SecureKeyProvider;", "", "<init>", "()V", "cachedRemoteGeminiKey", "", "cachedRemoteGoogleBooksKey", "SEGMENT_ALPHA", "", "SEGMENT_BETA", "SEGMENT_GAMMA", "SEGMENT_DELTA", "MASK_A", "MASK_B", "MASK_C", "MASK_D", "decodeSegment", "data", "mult", "", "add", "mask", "getGeminiApiKey", "getGoogleBooksApiKey", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SecureKeyProvider {
    public static final int $stable;
    private static String cachedRemoteGeminiKey;
    private static String cachedRemoteGoogleBooksKey;
    public static final SecureKeyProvider INSTANCE = new SecureKeyProvider();
    private static final int[] SEGMENT_ALPHA = {48, 76, 134, 89, 127, 121, 86, 170, 143, 174, 10, 40, 35, 122};
    private static final int[] SEGMENT_BETA = {32, 222, 16, 239, 68, 124, 206, 72, 137, 101, 202, 117, 101, 239};
    private static final int[] SEGMENT_GAMMA = {194, 49, 196, 51, 101, 157, 43, 150, 62, 26, 230, 20, 140};
    private static final int[] SEGMENT_DELTA = {89, 149, 198, 9, 79, 41, 2, 215, 170, 106, 71, 175};
    private static final int[] MASK_A = {122, 63, 145, 72};
    private static final int[] MASK_B = {92, 130, 30, 212};
    private static final int[] MASK_C = {179, 103, 240, 41};
    private static final int[] MASK_D = {65, 153, 197, 24};

    private SecureKeyProvider() {
    }

    static {
        try {
            Intrinsics.checkNotNull(FirebaseFirestore.getInstance().collection("app_config").document("api_keys").addSnapshotListener(new EventListener() { // from class: com.example.security.SecureKeyProvider$$ExternalSyntheticLambda0
                public final void onEvent(Object obj, FirebaseFirestoreException firebaseFirestoreException) {
                    SecureKeyProvider._init_$lambda$0((DocumentSnapshot) obj, firebaseFirestoreException);
                }
            }));
        } catch (Exception unused) {
        }
        $stable = 8;
    }

    static final void _init_$lambda$0(DocumentSnapshot documentSnapshot, FirebaseFirestoreException firebaseFirestoreException) {
        String string = documentSnapshot != null ? documentSnapshot.getString("gemini_api_key") : null;
        if (string != null && !StringsKt.isBlank(string)) {
            cachedRemoteGeminiKey = StringsKt.trim(string).toString();
        }
        String string2 = documentSnapshot != null ? documentSnapshot.getString("google_books_api_key") : null;
        if (string2 == null || StringsKt.isBlank(string2)) {
            return;
        }
        cachedRemoteGoogleBooksKey = StringsKt.trim(string2).toString();
    }

    private final String decodeSegment(int[] data, int mult, int add, int[] mask) {
        byte[] bArr = new byte[data.length];
        int length = data.length;
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) ((mask[i % mask.length] ^ data[i]) ^ (((i * mult) + add) & 255));
        }
        return new String(bArr, Charsets.UTF_8);
    }

    @JvmStatic
    public static final String getGeminiApiKey() {
        String str = cachedRemoteGeminiKey;
        String str2 = str;
        if (str2 != null && !StringsKt.isBlank(str2)) {
            return str;
        }
        SecureKeyProvider secureKeyProvider = INSTANCE;
        return secureKeyProvider.decodeSegment(SEGMENT_ALPHA, 23, 11, MASK_A) + secureKeyProvider.decodeSegment(SEGMENT_BETA, 19, 37, MASK_B) + secureKeyProvider.decodeSegment(SEGMENT_GAMMA, 31, 5, MASK_C) + secureKeyProvider.decodeSegment(SEGMENT_DELTA, 17, 43, MASK_D);
    }

    @JvmStatic
    public static final String getGoogleBooksApiKey() {
        String str = cachedRemoteGoogleBooksKey;
        String str2 = str;
        return (str2 == null || StringsKt.isBlank(str2)) ? getGeminiApiKey() : str;
    }
}
