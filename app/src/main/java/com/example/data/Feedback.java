package com.example.data;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Entities.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003JQ\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, d2 = {"Lcom/example/data/Feedback;", "", "id", "", "type", "content", "user", "status", "developerNote", "timestamp", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getId", "()Ljava/lang/String;", "getType", "getContent", "getUser", "getStatus", "getDeveloperNote", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Feedback {
    public static final int $stable = 0;
    private final String content;
    private final String developerNote;
    private final String id;
    private final String status;
    private final long timestamp;
    private final String type;
    private final String user;

    public Feedback() {
        this(null, null, null, null, null, null, 0L, 127, null);
    }

    public static /* synthetic */ Feedback copy$default(Feedback feedback, String str, String str2, String str3, String str4, String str5, String str6, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedback.id;
        }
        if ((i & 2) != 0) {
            str2 = feedback.type;
        }
        if ((i & 4) != 0) {
            str3 = feedback.content;
        }
        if ((i & 8) != 0) {
            str4 = feedback.user;
        }
        if ((i & 16) != 0) {
            str5 = feedback.status;
        }
        if ((i & 32) != 0) {
            str6 = feedback.developerNote;
        }
        if ((i & 64) != 0) {
            j = feedback.timestamp;
        }
        long j2 = j;
        String str7 = str5;
        String str8 = str6;
        return feedback.copy(str, str2, str3, str4, str7, str8, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDeveloperNote() {
        return this.developerNote;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final Feedback copy(String id, String type, String content, String user, String status, String developerNote, long timestamp) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(status, "status");
        return new Feedback(id, type, content, user, status, developerNote, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Feedback)) {
            return false;
        }
        Feedback feedback = (Feedback) other;
        return Intrinsics.areEqual(this.id, feedback.id) && Intrinsics.areEqual(this.type, feedback.type) && Intrinsics.areEqual(this.content, feedback.content) && Intrinsics.areEqual(this.user, feedback.user) && Intrinsics.areEqual(this.status, feedback.status) && Intrinsics.areEqual(this.developerNote, feedback.developerNote) && this.timestamp == feedback.timestamp;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.id.hashCode() * 31) + this.type.hashCode()) * 31) + this.content.hashCode()) * 31) + this.user.hashCode()) * 31) + this.status.hashCode()) * 31;
        String str = this.developerNote;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.timestamp);
    }

    public String toString() {
        return "Feedback(id=" + this.id + ", type=" + this.type + ", content=" + this.content + ", user=" + this.user + ", status=" + this.status + ", developerNote=" + this.developerNote + ", timestamp=" + this.timestamp + ")";
    }

    public Feedback(String str, String str2, String str3, String str4, String str5, String str6, long j) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "type");
        Intrinsics.checkNotNullParameter(str3, "content");
        Intrinsics.checkNotNullParameter(str4, "user");
        Intrinsics.checkNotNullParameter(str5, "status");
        this.id = str;
        this.type = str2;
        this.content = str3;
        this.user = str4;
        this.status = str5;
        this.developerNote = str6;
        this.timestamp = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Feedback(String str, String str2, String str3, String str4, String str5, String str6, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
        }
        this(str, (i & 2) != 0 ? "Bug" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "REPORTED" : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? System.currentTimeMillis() : j);
    }

    public final String getId() {
        return this.id;
    }

    public final String getType() {
        return this.type;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getUser() {
        return this.user;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getDeveloperNote() {
        return this.developerNote;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }
}
