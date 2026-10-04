package com.example.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AdminBridge.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/example/util/AdminBridge;", "", "<init>", "()V", "ADMIN_PACKAGE", "", "ADMIN_MAIN_ACTIVITY", "isAdminAppInstalled", "", "context", "Landroid/content/Context;", "launchAdminApp", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AdminBridge {
    public static final int $stable = 0;
    public static final String ADMIN_MAIN_ACTIVITY = "com.bookxchange.admin.MainActivity";
    public static final String ADMIN_PACKAGE = "com.BookXchange.admin";
    public static final AdminBridge INSTANCE = new AdminBridge();

    private AdminBridge() {
    }

    public final boolean isAdminAppInstalled(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            return context.getPackageManager().getPackageInfo(ADMIN_PACKAGE, 0) != null;
        } catch (Exception unused) {
            return context.getPackageManager().getLaunchIntentForPackage(ADMIN_PACKAGE) != null;
        }
    }

    public final boolean launchAdminApp(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(ADMIN_PACKAGE);
        if (launchIntentForPackage == null) {
            launchIntentForPackage = new Intent("android.intent.action.MAIN");
            launchIntentForPackage.setComponent(new ComponentName(ADMIN_PACKAGE, ADMIN_MAIN_ACTIVITY));
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
            launchIntentForPackage.addFlags(268435456);
        } else {
            Intrinsics.checkNotNull(launchIntentForPackage.addFlags(268435456));
        }
        try {
            try {
                context.startActivity(launchIntentForPackage);
                return true;
            } catch (Exception unused) {
                return false;
            }
        } catch (Exception unused2) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("bookxchange-admin://open"));
            intent.addFlags(268435456);
            context.startActivity(intent);
            return true;
        }
    }
}
