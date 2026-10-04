package com.example.data;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Entities.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eHÆ\u0003J\t\u0010,\u001a\u00020\u0010HÆ\u0003J\u0081\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\tHÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00063"}, d2 = {"Lcom/example/data/Review;", "", "id", "", "targetUsername", "reviewerName", "reviewerEmail", "content", "rating", "", "reviewType", "bookId", "bookTitle", "tags", "", "timestamp", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;J)V", "getId", "()Ljava/lang/String;", "getTargetUsername", "getReviewerName", "getReviewerEmail", "getContent", "getRating", "()I", "getReviewType", "getBookId", "getBookTitle", "getTags", "()Ljava/util/List;", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Review {
    public static final int $stable = 8;
    private final String bookId;
    private final String bookTitle;
    private final String content;
    private final String id;
    private final int rating;
    private final String reviewType;
    private final String reviewerEmail;
    private final String reviewerName;
    private final List<String> tags;
    private final String targetUsername;
    private final long timestamp;

    public Review() {
        this(null, null, null, null, null, 0, null, null, null, null, 0L, 2047, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Review copy$default(Review review, String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, String str8, List list, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = review.id;
        }
        if ((i2 & 2) != 0) {
            str2 = review.targetUsername;
        }
        if ((i2 & 4) != 0) {
            str3 = review.reviewerName;
        }
        if ((i2 & 8) != 0) {
            str4 = review.reviewerEmail;
        }
        if ((i2 & 16) != 0) {
            str5 = review.content;
        }
        if ((i2 & 32) != 0) {
            i = review.rating;
        }
        if ((i2 & 64) != 0) {
            str6 = review.reviewType;
        }
        if ((i2 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str7 = review.bookId;
        }
        if ((i2 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
            str8 = review.bookTitle;
        }
        if ((i2 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            list = review.tags;
        }
        if ((i2 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            j = review.timestamp;
        }
        long j2 = j;
        String str9 = str8;
        List list2 = list;
        String str10 = str6;
        String str11 = str7;
        String str12 = str5;
        int i3 = i;
        return review.copy(str, str2, str3, str4, str12, i3, str10, str11, str9, list2, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<String> component10() {
        return this.tags;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTargetUsername() {
        return this.targetUsername;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getReviewerName() {
        return this.reviewerName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getReviewerEmail() {
        return this.reviewerEmail;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getRating() {
        return this.rating;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getReviewType() {
        return this.reviewType;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getBookId() {
        return this.bookId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getBookTitle() {
        return this.bookTitle;
    }

    public final Review copy(String id, String targetUsername, String reviewerName, String reviewerEmail, String content, int rating, String reviewType, String bookId, String bookTitle, List<String> tags, long timestamp) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(targetUsername, "targetUsername");
        Intrinsics.checkNotNullParameter(reviewerName, "reviewerName");
        Intrinsics.checkNotNullParameter(reviewerEmail, "reviewerEmail");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(reviewType, "reviewType");
        Intrinsics.checkNotNullParameter(tags, "tags");
        return new Review(id, targetUsername, reviewerName, reviewerEmail, content, rating, reviewType, bookId, bookTitle, tags, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Review)) {
            return false;
        }
        Review review = (Review) other;
        return Intrinsics.areEqual(this.id, review.id) && Intrinsics.areEqual(this.targetUsername, review.targetUsername) && Intrinsics.areEqual(this.reviewerName, review.reviewerName) && Intrinsics.areEqual(this.reviewerEmail, review.reviewerEmail) && Intrinsics.areEqual(this.content, review.content) && this.rating == review.rating && Intrinsics.areEqual(this.reviewType, review.reviewType) && Intrinsics.areEqual(this.bookId, review.bookId) && Intrinsics.areEqual(this.bookTitle, review.bookTitle) && Intrinsics.areEqual(this.tags, review.tags) && this.timestamp == review.timestamp;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.id.hashCode() * 31) + this.targetUsername.hashCode()) * 31) + this.reviewerName.hashCode()) * 31) + this.reviewerEmail.hashCode()) * 31) + this.content.hashCode()) * 31) + Integer.hashCode(this.rating)) * 31) + this.reviewType.hashCode()) * 31;
        String str = this.bookId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bookTitle;
        return ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.tags.hashCode()) * 31) + Long.hashCode(this.timestamp);
    }

    public String toString() {
        return "Review(id=" + this.id + ", targetUsername=" + this.targetUsername + ", reviewerName=" + this.reviewerName + ", reviewerEmail=" + this.reviewerEmail + ", content=" + this.content + ", rating=" + this.rating + ", reviewType=" + this.reviewType + ", bookId=" + this.bookId + ", bookTitle=" + this.bookTitle + ", tags=" + this.tags + ", timestamp=" + this.timestamp + ")";
    }

    public Review(String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, String str8, List<String> list, long j) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "targetUsername");
        Intrinsics.checkNotNullParameter(str3, "reviewerName");
        Intrinsics.checkNotNullParameter(str4, "reviewerEmail");
        Intrinsics.checkNotNullParameter(str5, "content");
        Intrinsics.checkNotNullParameter(str6, "reviewType");
        Intrinsics.checkNotNullParameter(list, "tags");
        this.id = str;
        this.targetUsername = str2;
        this.reviewerName = str3;
        this.reviewerEmail = str4;
        this.content = str5;
        this.rating = i;
        this.reviewType = str6;
        this.bookId = str7;
        this.bookTitle = str8;
        this.tags = list;
        this.timestamp = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Review(String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, String str8, List list, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
        }
        this(str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) == 0 ? str5 : "", (i2 & 32) != 0 ? 5 : i, (i2 & 64) != 0 ? "USER" : str6, (i2 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str7, (i2 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0 ? str8 : null, (i2 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? CollectionsKt.emptyList() : list, (i2 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? System.currentTimeMillis() : j);
    }

    public final String getId() {
        return this.id;
    }

    public final String getTargetUsername() {
        return this.targetUsername;
    }

    public final String getReviewerName() {
        return this.reviewerName;
    }

    public final String getReviewerEmail() {
        return this.reviewerEmail;
    }

    public final String getContent() {
        return this.content;
    }

    public final int getRating() {
        return this.rating;
    }

    public final String getReviewType() {
        return this.reviewType;
    }

    public final String getBookId() {
        return this.bookId;
    }

    public final String getBookTitle() {
        return this.bookTitle;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }
}
