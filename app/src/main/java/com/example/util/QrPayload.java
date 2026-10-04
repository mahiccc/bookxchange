package com.example.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: QRCodeHelper.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/example/util/QrPayload;", "", "type", "", "bookId", "userEmail", "timestamp", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getType", "()Ljava/lang/String;", "getBookId", "getUserEmail", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class QrPayload {
    public static final int $stable = 0;
    private final String bookId;
    private final long timestamp;
    private final String type;
    private final String userEmail;

    public static /* synthetic */ QrPayload copy$default(QrPayload qrPayload, String str, String str2, String str3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qrPayload.type;
        }
        if ((i & 2) != 0) {
            str2 = qrPayload.bookId;
        }
        if ((i & 4) != 0) {
            str3 = qrPayload.userEmail;
        }
        if ((i & 8) != 0) {
            j = qrPayload.timestamp;
        }
        String str4 = str3;
        return qrPayload.copy(str, str2, str4, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBookId() {
        return this.bookId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserEmail() {
        return this.userEmail;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final QrPayload copy(String type, String bookId, String userEmail, long timestamp) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(bookId, "bookId");
        Intrinsics.checkNotNullParameter(userEmail, "userEmail");
        return new QrPayload(type, bookId, userEmail, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QrPayload)) {
            return false;
        }
        QrPayload qrPayload = (QrPayload) other;
        return Intrinsics.areEqual(this.type, qrPayload.type) && Intrinsics.areEqual(this.bookId, qrPayload.bookId) && Intrinsics.areEqual(this.userEmail, qrPayload.userEmail) && this.timestamp == qrPayload.timestamp;
    }

    public int hashCode() {
        return (((((this.type.hashCode() * 31) + this.bookId.hashCode()) * 31) + this.userEmail.hashCode()) * 31) + Long.hashCode(this.timestamp);
    }

    public String toString() {
        return "QrPayload(type=" + this.type + ", bookId=" + this.bookId + ", userEmail=" + this.userEmail + ", timestamp=" + this.timestamp + ")";
    }

    public QrPayload(String str, String str2, String str3, long j) {
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(str2, "bookId");
        Intrinsics.checkNotNullParameter(str3, "userEmail");
        this.type = str;
        this.bookId = str2;
        this.userEmail = str3;
        this.timestamp = j;
    }

    public final String getType() {
        return this.type;
    }

    public final String getBookId() {
        return this.bookId;
    }

    public final String getUserEmail() {
        return this.userEmail;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }
}
