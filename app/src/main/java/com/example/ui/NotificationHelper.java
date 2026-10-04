package com.example.ui;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.app.Person;
import androidx.core.graphics.drawable.IconCompat;
import com.example.MainActivity;
import com.example.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: NotificationHelper.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001 B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010JD\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u0018J\u001e\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005J\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u0002J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R \u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/example/ui/NotificationHelper;", "", "<init>", "()V", "CHANNEL_ID", "", "CHAT_GROUP_KEY", "SUMMARY_NOTIFICATION_ID", "", "conversationHistory", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/example/ui/NotificationHelper$ChatMessageItem;", "createNotificationChannel", "", "context", "Landroid/content/Context;", "showChatNotification", "bookId", "senderEmail", "senderDisplayName", "messageText", "senderAvatarBase64OrUrl", "timestamp", "", "showNotification", "title", "content", "decodeAvatar", "Landroid/graphics/Bitmap;", "urlOrBase64", "decodeAppIcon", "ChatMessageItem", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NotificationHelper {
    private static final String CHANNEL_ID = "book_alerts_v4";
    private static final String CHAT_GROUP_KEY = "com.example.bookxchange.CHAT_ALERTS";
    private static final int SUMMARY_NOTIFICATION_ID = 99999;
    public static final NotificationHelper INSTANCE = new NotificationHelper();
    private static final ConcurrentHashMap<String, List<ChatMessageItem>> conversationHistory = new ConcurrentHashMap<>();
    public static final int $stable = 8;

    private NotificationHelper() {
    }

    /* JADX INFO: compiled from: NotificationHelper.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/example/ui/NotificationHelper$ChatMessageItem;", "", "text", "", "timestamp", "", "senderName", "senderKey", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getTimestamp", "()J", "getSenderName", "getSenderKey", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChatMessageItem {
        public static final int $stable = 0;
        private final String senderKey;
        private final String senderName;
        private final String text;
        private final long timestamp;

        public static /* synthetic */ ChatMessageItem copy$default(ChatMessageItem chatMessageItem, String str, long j, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = chatMessageItem.text;
            }
            if ((i & 2) != 0) {
                j = chatMessageItem.timestamp;
            }
            if ((i & 4) != 0) {
                str2 = chatMessageItem.senderName;
            }
            if ((i & 8) != 0) {
                str3 = chatMessageItem.senderKey;
            }
            return chatMessageItem.copy(str, j, str2, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getSenderName() {
            return this.senderName;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getSenderKey() {
            return this.senderKey;
        }

        public final ChatMessageItem copy(String text, long timestamp, String senderName, String senderKey) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(senderName, "senderName");
            Intrinsics.checkNotNullParameter(senderKey, "senderKey");
            return new ChatMessageItem(text, timestamp, senderName, senderKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChatMessageItem)) {
                return false;
            }
            ChatMessageItem chatMessageItem = (ChatMessageItem) other;
            return Intrinsics.areEqual(this.text, chatMessageItem.text) && this.timestamp == chatMessageItem.timestamp && Intrinsics.areEqual(this.senderName, chatMessageItem.senderName) && Intrinsics.areEqual(this.senderKey, chatMessageItem.senderKey);
        }

        public int hashCode() {
            return (((((this.text.hashCode() * 31) + Long.hashCode(this.timestamp)) * 31) + this.senderName.hashCode()) * 31) + this.senderKey.hashCode();
        }

        public String toString() {
            return "ChatMessageItem(text=" + this.text + ", timestamp=" + this.timestamp + ", senderName=" + this.senderName + ", senderKey=" + this.senderKey + ")";
        }

        public ChatMessageItem(String str, long j, String str2, String str3) {
            Intrinsics.checkNotNullParameter(str, "text");
            Intrinsics.checkNotNullParameter(str2, "senderName");
            Intrinsics.checkNotNullParameter(str3, "senderKey");
            this.text = str;
            this.timestamp = j;
            this.senderName = str2;
            this.senderKey = str3;
        }

        public final String getText() {
            return this.text;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public final String getSenderName() {
            return this.senderName;
        }

        public final String getSenderKey() {
            return this.senderKey;
        }
    }

    public final void createNotificationChannel(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 26) {
            Uri defaultUri = RingtoneManager.getDefaultUri(2);
            AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID, "BookXchange Alerts", 4);
            notificationChannel.setDescription("Notifications for chat messages, requests, and book updates");
            notificationChannel.setSound(defaultUri, audioAttributesBuild);
            notificationChannel.enableVibration(true);
            notificationChannel.setVibrationPattern(new long[]{0, 250, 150, 250});
            notificationChannel.enableLights(true);
            Object systemService = context.getSystemService("notification");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
        }
    }

    public final void showChatNotification(Context context, String bookId, String senderEmail, String senderDisplayName, String messageText, String senderAvatarBase64OrUrl, long timestamp) {
        List<ChatMessageItem> listPutIfAbsent;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bookId, "bookId");
        Intrinsics.checkNotNullParameter(senderEmail, "senderEmail");
        Intrinsics.checkNotNullParameter(senderDisplayName, "senderDisplayName");
        Intrinsics.checkNotNullParameter(messageText, "messageText");
        if (Build.VERSION.SDK_INT < 33 || ActivityCompat.checkSelfPermission(context, "android.permission.POST_NOTIFICATIONS") == 0) {
            String str = bookId + ":" + senderEmail;
            ConcurrentHashMap<String, List<ChatMessageItem>> concurrentHashMap = conversationHistory;
            ArrayList arrayList = concurrentHashMap.get(str);
            if (arrayList == null && (listPutIfAbsent = concurrentHashMap.putIfAbsent(str, (arrayList = new ArrayList()))) != null) {
                arrayList = listPutIfAbsent;
            }
            List<ChatMessageItem> list = arrayList;
            Intrinsics.checkNotNull(list);
            synchronized (list) {
                list.add(new ChatMessageItem(messageText, timestamp, senderDisplayName, senderEmail));
                if (list.size() > 10) {
                    list.remove(0);
                }
                Unit unit = Unit.INSTANCE;
            }
            Intent intent = new Intent(context, (Class<?>) MainActivity.class);
            intent.setFlags(335544320);
            intent.putExtra("extra_book_id", bookId);
            intent.putExtra("extra_sender_email", senderEmail);
            PendingIntent activity = PendingIntent.getActivity(context, str.hashCode(), intent, 201326592);
            Bitmap bitmapDecodeAvatar = decodeAvatar(context, senderAvatarBase64OrUrl);
            if (bitmapDecodeAvatar == null) {
                bitmapDecodeAvatar = decodeAppIcon(context);
            }
            String str2 = senderDisplayName;
            Person.Builder key = new Person.Builder().setName(str2).setKey(senderEmail);
            Intrinsics.checkNotNullExpressionValue(key, "setKey(...)");
            if (bitmapDecodeAvatar != null) {
                key.setIcon(IconCompat.createWithBitmap(bitmapDecodeAvatar));
            }
            Intrinsics.checkNotNullExpressionValue(key.build(), "build(...)");
            Person personBuild = new Person.Builder().setName("Me").build();
            Intrinsics.checkNotNullExpressionValue(personBuild, "build(...)");
            NotificationCompat.Style conversationTitle = new NotificationCompat.MessagingStyle(personBuild).setConversationTitle(str2);
            Intrinsics.checkNotNullExpressionValue(conversationTitle, "setConversationTitle(...)");
            synchronized (list) {
                for (ChatMessageItem chatMessageItem : list) {
                    Person personBuild2 = new Person.Builder().setName(chatMessageItem.getSenderName()).setKey(chatMessageItem.getSenderKey()).build();
                    Intrinsics.checkNotNullExpressionValue(personBuild2, "build(...)");
                    conversationTitle.addMessage(chatMessageItem.getText(), chatMessageItem.getTimestamp(), personBuild2);
                }
                Unit unit2 = Unit.INSTANCE;
            }
            Uri defaultUri = RingtoneManager.getDefaultUri(2);
            int iHashCode = str.hashCode();
            NotificationCompat.Builder color = new NotificationCompat.Builder(context, CHANNEL_ID).setSmallIcon(R.drawable.ic_notification).setColor(-14796150);
            if (bitmapDecodeAvatar == null) {
                bitmapDecodeAvatar = decodeAppIcon(context);
            }
            Notification notificationBuild = color.setLargeIcon(bitmapDecodeAvatar).setStyle(conversationTitle).setContentTitle(str2).setContentText(messageText).setContentIntent(activity).setGroup(CHAT_GROUP_KEY).setCategory("msg").setPriority(1).setSound(defaultUri).setVibrate(new long[]{0, 250, 150, 250}).setDefaults(-1).setAutoCancel(true).build();
            Intrinsics.checkNotNullExpressionValue(notificationBuild, "build(...)");
            Notification notificationBuild2 = new NotificationCompat.Builder(context, CHANNEL_ID).setSmallIcon(R.drawable.ic_notification).setColor(-14796150).setGroup(CHAT_GROUP_KEY).setGroupSummary(true).setAutoCancel(true).build();
            Intrinsics.checkNotNullExpressionValue(notificationBuild2, "build(...)");
            NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(context);
            notificationManagerCompatFrom.notify(iHashCode, notificationBuild);
            notificationManagerCompatFrom.notify(99999, notificationBuild2);
        }
    }

    public final void showNotification(Context context, String title, String content) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        if (Build.VERSION.SDK_INT < 33 || ActivityCompat.checkSelfPermission(context, "android.permission.POST_NOTIFICATIONS") == 0) {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage != null) {
                launchIntentForPackage.setFlags(268468224);
            } else {
                launchIntentForPackage = null;
            }
            PendingIntent activity = PendingIntent.getActivity(context, 0, launchIntentForPackage, 201326592);
            Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
            NotificationCompat.Builder autoCancel = new NotificationCompat.Builder(context, CHANNEL_ID).setSmallIcon(R.drawable.ic_notification).setColor(-14796150).setLargeIcon(decodeAppIcon(context)).setContentTitle(title).setContentText(content).setPriority(1).setSound(RingtoneManager.getDefaultUri(2)).setVibrate(new long[]{0, 250, 150, 250}).setDefaults(-1).setContentIntent(activity).setAutoCancel(true);
            Intrinsics.checkNotNullExpressionValue(autoCancel, "setAutoCancel(...)");
            NotificationManagerCompat.from(context).notify((int) System.currentTimeMillis(), autoCancel.build());
        }
    }

    private final Bitmap decodeAvatar(Context context, String urlOrBase64) {
        String str = urlOrBase64;
        if (str != null && !StringsKt.isBlank(str)) {
            try {
                if (StringsKt.startsWith$default(urlOrBase64, "data:image", false, 2, (Object) null)) {
                    byte[] bArrDecode = Base64.decode(StringsKt.substringAfter$default(urlOrBase64, ",", (String) null, 2, (Object) null), 0);
                    return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private final Bitmap decodeAppIcon(Context context) {
        try {
            try {
                Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.app_icon);
                return bitmapDecodeResource == null ? BitmapFactory.decodeResource(context.getResources(), R.mipmap.ic_launcher) : bitmapDecodeResource;
            } catch (Exception unused) {
                return BitmapFactory.decodeResource(context.getResources(), R.mipmap.ic_launcher);
            }
        } catch (Exception unused2) {
            return null;
        }
        return null;
    }
}
