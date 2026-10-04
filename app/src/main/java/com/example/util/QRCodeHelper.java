package com.example.util;

import android.graphics.Bitmap;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.util.EnumMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: QRCodeHelper.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005J\u0016\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0005J\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0011¨\u0006\u0012"}, d2 = {"Lcom/example/util/QRCodeHelper;", "", "<init>", "()V", "buildHandoverPayload", "", "bookId", "ownerEmail", "buildReturnPayload", "borrowerEmail", "parseQrPayload", "Lcom/example/util/QrPayload;", "raw", "generateQrCodeBitmap", "Landroid/graphics/Bitmap;", "content", "size", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class QRCodeHelper {
    public static final int $stable = 0;
    public static final QRCodeHelper INSTANCE = new QRCodeHelper();

    private QRCodeHelper() {
    }

    public final String buildHandoverPayload(String bookId, String ownerEmail) {
        Intrinsics.checkNotNullParameter(bookId, "bookId");
        Intrinsics.checkNotNullParameter(ownerEmail, "ownerEmail");
        return "BOOKXCHANGE:HANDOVER:" + bookId + ":" + ownerEmail + ":" + System.currentTimeMillis();
    }

    public final String buildReturnPayload(String bookId, String borrowerEmail) {
        Intrinsics.checkNotNullParameter(bookId, "bookId");
        Intrinsics.checkNotNullParameter(borrowerEmail, "borrowerEmail");
        return "BOOKXCHANGE:RETURN:" + bookId + ":" + borrowerEmail + ":" + System.currentTimeMillis();
    }

    public final QrPayload parseQrPayload(String raw) {
        String string;
        Long longOrNull;
        Intrinsics.checkNotNullParameter(raw, "raw");
        String string2 = StringsKt.trim(raw).toString();
        int iIndexOf$default = StringsKt.indexOf$default(string2, "BOOKXCHANGE", 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            return null;
        }
        String strSubstring = string2.substring(iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        List listSplit$default = StringsKt.split$default(StringsKt.trim(strSubstring).toString(), new String[]{":"}, false, 0, 6, (Object) null);
        if (listSplit$default.size() < 4 || !Intrinsics.areEqual(listSplit$default.get(0), "BOOKXCHANGE")) {
            return null;
        }
        String upperCase = StringsKt.trim((String) listSplit$default.get(1)).toString().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        String string3 = StringsKt.trim((String) listSplit$default.get(2)).toString();
        String string4 = StringsKt.trim((String) listSplit$default.get(3)).toString();
        String str = (String) CollectionsKt.getOrNull(listSplit$default, 4);
        return new QrPayload(upperCase, string3, string4, (str == null || (string = StringsKt.trim(str).toString()) == null || (longOrNull = StringsKt.toLongOrNull(string)) == null) ? System.currentTimeMillis() : longOrNull.longValue());
    }

    public static /* synthetic */ Bitmap generateQrCodeBitmap$default(QRCodeHelper qRCodeHelper, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = UserVerificationMethods.USER_VERIFY_NONE;
        }
        return qRCodeHelper.generateQrCodeBitmap(str, i);
    }

    public final Bitmap generateQrCodeBitmap(String content, int size) {
        Intrinsics.checkNotNullParameter(content, "content");
        try {
            EnumMap enumMap = new EnumMap(EncodeHintType.class);
            enumMap.put(EncodeHintType.CHARACTER_SET, "UTF-8");
            enumMap.put(EncodeHintType.MARGIN, 1);
            enumMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
            BitMatrix bitMatrixEncode = new QRCodeWriter().encode(content, BarcodeFormat.QR_CODE, size, size, enumMap);
            int width = bitMatrixEncode.getWidth();
            int height = bitMatrixEncode.getHeight();
            int[] iArr = new int[width * height];
            for (int i = 0; i < height; i++) {
                int i2 = i * width;
                for (int i3 = 0; i3 < width; i3++) {
                    iArr[i2 + i3] = bitMatrixEncode.get(i3, i) ? -16777216 : -1;
                }
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            bitmapCreateBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
            return bitmapCreateBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
