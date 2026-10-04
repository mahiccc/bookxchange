package com.example.data;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Entities.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/example/data/WishlistRequest;", "", "id", "", "userEmail", "bookTitle", "author", "genre", "timestamp", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getId", "()Ljava/lang/String;", "getUserEmail", "getBookTitle", "getAuthor", "getGenre", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WishlistRequest {
    public static final int $stable = 0;
    private final String author;
    private final String bookTitle;
    private final String genre;
    private final String id;
    private final long timestamp;
    private final String userEmail;

    public WishlistRequest() {
        this(null, null, null, null, null, 0L, 63, null);
    }

    public static /* synthetic */ WishlistRequest copy$default(WishlistRequest wishlistRequest, String str, String str2, String str3, String str4, String str5, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wishlistRequest.id;
        }
        if ((i & 2) != 0) {
            str2 = wishlistRequest.userEmail;
        }
        if ((i & 4) != 0) {
            str3 = wishlistRequest.bookTitle;
        }
        if ((i & 8) != 0) {
            str4 = wishlistRequest.author;
        }
        if ((i & 16) != 0) {
            str5 = wishlistRequest.genre;
        }
        if ((i & 32) != 0) {
            j = wishlistRequest.timestamp;
        }
        long j2 = j;
        String str6 = str5;
        String str7 = str3;
        return wishlistRequest.copy(str, str2, str7, str4, str6, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserEmail() {
        return this.userEmail;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBookTitle() {
        return this.bookTitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAuthor() {
        return this.author;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getGenre() {
        return this.genre;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final WishlistRequest copy(String id, String userEmail, String bookTitle, String author, String genre, long timestamp) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(userEmail, "userEmail");
        Intrinsics.checkNotNullParameter(bookTitle, "bookTitle");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(genre, "genre");
        return new WishlistRequest(id, userEmail, bookTitle, author, genre, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WishlistRequest)) {
            return false;
        }
        WishlistRequest wishlistRequest = (WishlistRequest) other;
        return Intrinsics.areEqual(this.id, wishlistRequest.id) && Intrinsics.areEqual(this.userEmail, wishlistRequest.userEmail) && Intrinsics.areEqual(this.bookTitle, wishlistRequest.bookTitle) && Intrinsics.areEqual(this.author, wishlistRequest.author) && Intrinsics.areEqual(this.genre, wishlistRequest.genre) && this.timestamp == wishlistRequest.timestamp;
    }

    public int hashCode() {
        return (((((((((this.id.hashCode() * 31) + this.userEmail.hashCode()) * 31) + this.bookTitle.hashCode()) * 31) + this.author.hashCode()) * 31) + this.genre.hashCode()) * 31) + Long.hashCode(this.timestamp);
    }

    public String toString() {
        return "WishlistRequest(id=" + this.id + ", userEmail=" + this.userEmail + ", bookTitle=" + this.bookTitle + ", author=" + this.author + ", genre=" + this.genre + ", timestamp=" + this.timestamp + ")";
    }

    public WishlistRequest(String str, String str2, String str3, String str4, String str5, long j) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "userEmail");
        Intrinsics.checkNotNullParameter(str3, "bookTitle");
        Intrinsics.checkNotNullParameter(str4, "author");
        Intrinsics.checkNotNullParameter(str5, "genre");
        this.id = str;
        this.userEmail = str2;
        this.bookTitle = str3;
        this.author = str4;
        this.genre = str5;
        this.timestamp = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WishlistRequest(String str, String str2, String str3, String str4, String str5, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
        }
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? System.currentTimeMillis() : j);
    }

    public final String getId() {
        return this.id;
    }

    public final String getUserEmail() {
        return this.userEmail;
    }

    public final String getBookTitle() {
        return this.bookTitle;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final String getGenre() {
        return this.genre;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }
}
