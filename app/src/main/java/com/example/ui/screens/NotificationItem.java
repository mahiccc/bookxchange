package com.example.ui.screens;

import com.example.data.Book;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NotificationsScreen.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/example/ui/screens/NotificationItem;", "", "id", "", "title", "message", "book", "Lcom/example/data/Book;", "type", "Lcom/example/ui/screens/NotificationType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/data/Book;Lcom/example/ui/screens/NotificationType;)V", "getId", "()Ljava/lang/String;", "getTitle", "getMessage", "getBook", "()Lcom/example/data/Book;", "getType", "()Lcom/example/ui/screens/NotificationType;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NotificationItem {
    public static final int $stable = 8;
    private final Book book;
    private final String id;
    private final String message;
    private final String title;
    private final NotificationType type;

    public static /* synthetic */ NotificationItem copy$default(NotificationItem notificationItem, String str, String str2, String str3, Book book, NotificationType notificationType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = notificationItem.id;
        }
        if ((i & 2) != 0) {
            str2 = notificationItem.title;
        }
        if ((i & 4) != 0) {
            str3 = notificationItem.message;
        }
        if ((i & 8) != 0) {
            book = notificationItem.book;
        }
        if ((i & 16) != 0) {
            notificationType = notificationItem.type;
        }
        NotificationType notificationType2 = notificationType;
        String str4 = str3;
        return notificationItem.copy(str, str2, str4, book, notificationType2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Book getBook() {
        return this.book;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final NotificationType getType() {
        return this.type;
    }

    public final NotificationItem copy(String id, String title, String message, Book book, NotificationType type) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(book, "book");
        Intrinsics.checkNotNullParameter(type, "type");
        return new NotificationItem(id, title, message, book, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationItem)) {
            return false;
        }
        NotificationItem notificationItem = (NotificationItem) other;
        return Intrinsics.areEqual(this.id, notificationItem.id) && Intrinsics.areEqual(this.title, notificationItem.title) && Intrinsics.areEqual(this.message, notificationItem.message) && Intrinsics.areEqual(this.book, notificationItem.book) && this.type == notificationItem.type;
    }

    public int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.message.hashCode()) * 31) + this.book.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "NotificationItem(id=" + this.id + ", title=" + this.title + ", message=" + this.message + ", book=" + this.book + ", type=" + this.type + ")";
    }

    public NotificationItem(String str, String str2, String str3, Book book, NotificationType notificationType) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "title");
        Intrinsics.checkNotNullParameter(str3, "message");
        Intrinsics.checkNotNullParameter(book, "book");
        Intrinsics.checkNotNullParameter(notificationType, "type");
        this.id = str;
        this.title = str2;
        this.message = str3;
        this.book = book;
        this.type = notificationType;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Book getBook() {
        return this.book;
    }

    public final NotificationType getType() {
        return this.type;
    }
}
