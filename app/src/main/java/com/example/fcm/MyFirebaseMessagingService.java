package com.example.fcm;

import android.content.Context;
import com.example.ui.NotificationHelper;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: MyFirebaseMessagingService.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/example/fcm/MyFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "onNewToken", "", "token", "", "onMessageReceived", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MyFirebaseMessagingService extends FirebaseMessagingService {
    public static final int $stable = 8;

    public void onNewToken(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        super.onNewToken(token);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMessageReceived(RemoteMessage remoteMessage) {
        String body;
        String title;
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        super.onMessageReceived(remoteMessage);
        String str = (String) remoteMessage.getData().get("bookId");
        String str2 = str == null ? "" : str;
        String str3 = (String) remoteMessage.getData().get("sender");
        String str4 = str3 == null ? "" : str3;
        String strSubstringBefore$default = (String) remoteMessage.getData().get("senderName");
        if (strSubstringBefore$default == null) {
            strSubstringBefore$default = StringsKt.substringBefore$default(str4, "@", (String) null, 2, (Object) null);
            if (strSubstringBefore$default.length() > 0) {
                StringBuilder sb = new StringBuilder();
                String strValueOf = String.valueOf(strSubstringBefore$default.charAt(0));
                Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
                String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                StringBuilder sbAppend = sb.append((Object) upperCase);
                String strSubstring = strSubstringBefore$default.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                strSubstringBefore$default = sbAppend.append(strSubstring).toString();
            }
        }
        String str5 = strSubstringBefore$default;
        RemoteMessage.Notification notification = remoteMessage.getNotification();
        if ((notification == null || (body = notification.getBody()) == null) && (body = (String) remoteMessage.getData().get("content")) == null && (body = (String) remoteMessage.getData().get("body")) == null) {
            body = "You have a new notification.";
        }
        String str6 = body;
        RemoteMessage.Notification notification2 = remoteMessage.getNotification();
        if ((notification2 == null || (title = notification2.getTitle()) == null) && (title = (String) remoteMessage.getData().get("title")) == null) {
            title = "BookXchange";
        }
        if (StringsKt.isBlank(str2) || StringsKt.isBlank(str4)) {
            NotificationHelper.INSTANCE.showNotification((Context) this, title, str6);
        } else {
            NotificationHelper.INSTANCE.showChatNotification((Context) this, str2, str4, str5, str6, (96 & 32) != 0 ? null : null, (96 & 64) != 0 ? System.currentTimeMillis() : 0L);
        }
    }
}
