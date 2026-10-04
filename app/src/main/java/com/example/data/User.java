package com.example.data;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Entities.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\u0010HÆ\u0003J}\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u0010-\u001a\u00020\u000b2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0006HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00061"}, d2 = {"Lcom/example/data/User;", "", "username", "", "displayName", "trustScore", "", "completedSwaps", "profilePicBase64", "mobileNumber", "isBanned", "", "banReason", "readingGoal", "booksReadThisYear", "totalMoneySaved", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;IID)V", "getUsername", "()Ljava/lang/String;", "getDisplayName", "getTrustScore", "()I", "getCompletedSwaps", "getProfilePicBase64", "getMobileNumber", "()Z", "getBanReason", "getReadingGoal", "getBooksReadThisYear", "getTotalMoneySaved", "()D", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class User {
    public static final int $stable = 0;
    private final String banReason;
    private final int booksReadThisYear;
    private final int completedSwaps;
    private final String displayName;
    private final boolean isBanned;
    private final String mobileNumber;
    private final String profilePicBase64;
    private final int readingGoal;
    private final double totalMoneySaved;
    private final int trustScore;
    private final String username;

    public User() {
        this(null, null, 0, 0, null, null, false, null, 0, 0, 0.0d, 2047, null);
    }

    public static /* synthetic */ User copy$default(User user, String str, String str2, int i, int i2, String str3, String str4, boolean z, String str5, int i3, int i4, double d, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = user.username;
        }
        if ((i5 & 2) != 0) {
            str2 = user.displayName;
        }
        if ((i5 & 4) != 0) {
            i = user.trustScore;
        }
        if ((i5 & 8) != 0) {
            i2 = user.completedSwaps;
        }
        if ((i5 & 16) != 0) {
            str3 = user.profilePicBase64;
        }
        if ((i5 & 32) != 0) {
            str4 = user.mobileNumber;
        }
        if ((i5 & 64) != 0) {
            z = user.isBanned;
        }
        if ((i5 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str5 = user.banReason;
        }
        if ((i5 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
            i3 = user.readingGoal;
        }
        if ((i5 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            i4 = user.booksReadThisYear;
        }
        if ((i5 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            d = user.totalMoneySaved;
        }
        double d2 = d;
        int i6 = i3;
        int i7 = i4;
        boolean z2 = z;
        String str6 = str5;
        String str7 = str3;
        String str8 = str4;
        return user.copy(str, str2, i, i2, str7, str8, z2, str6, i6, i7, d2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getBooksReadThisYear() {
        return this.booksReadThisYear;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final double getTotalMoneySaved() {
        return this.totalMoneySaved;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTrustScore() {
        return this.trustScore;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getCompletedSwaps() {
        return this.completedSwaps;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getProfilePicBase64() {
        return this.profilePicBase64;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsBanned() {
        return this.isBanned;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getBanReason() {
        return this.banReason;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getReadingGoal() {
        return this.readingGoal;
    }

    public final User copy(String username, String displayName, int trustScore, int completedSwaps, String profilePicBase64, String mobileNumber, boolean isBanned, String banReason, int readingGoal, int booksReadThisYear, double totalMoneySaved) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        return new User(username, displayName, trustScore, completedSwaps, profilePicBase64, mobileNumber, isBanned, banReason, readingGoal, booksReadThisYear, totalMoneySaved);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof User)) {
            return false;
        }
        User user = (User) other;
        return Intrinsics.areEqual(this.username, user.username) && Intrinsics.areEqual(this.displayName, user.displayName) && this.trustScore == user.trustScore && this.completedSwaps == user.completedSwaps && Intrinsics.areEqual(this.profilePicBase64, user.profilePicBase64) && Intrinsics.areEqual(this.mobileNumber, user.mobileNumber) && this.isBanned == user.isBanned && Intrinsics.areEqual(this.banReason, user.banReason) && this.readingGoal == user.readingGoal && this.booksReadThisYear == user.booksReadThisYear && Double.compare(this.totalMoneySaved, user.totalMoneySaved) == 0;
    }

    public int hashCode() {
        int iHashCode = ((((((this.username.hashCode() * 31) + this.displayName.hashCode()) * 31) + Integer.hashCode(this.trustScore)) * 31) + Integer.hashCode(this.completedSwaps)) * 31;
        String str = this.profilePicBase64;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mobileNumber;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.isBanned)) * 31;
        String str3 = this.banReason;
        return ((((((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.hashCode(this.readingGoal)) * 31) + Integer.hashCode(this.booksReadThisYear)) * 31) + Double.hashCode(this.totalMoneySaved);
    }

    public String toString() {
        return "User(username=" + this.username + ", displayName=" + this.displayName + ", trustScore=" + this.trustScore + ", completedSwaps=" + this.completedSwaps + ", profilePicBase64=" + this.profilePicBase64 + ", mobileNumber=" + this.mobileNumber + ", isBanned=" + this.isBanned + ", banReason=" + this.banReason + ", readingGoal=" + this.readingGoal + ", booksReadThisYear=" + this.booksReadThisYear + ", totalMoneySaved=" + this.totalMoneySaved + ")";
    }

    public User(String str, String str2, int i, int i2, String str3, String str4, boolean z, String str5, int i3, int i4, double d) {
        Intrinsics.checkNotNullParameter(str, "username");
        Intrinsics.checkNotNullParameter(str2, "displayName");
        this.username = str;
        this.displayName = str2;
        this.trustScore = i;
        this.completedSwaps = i2;
        this.profilePicBase64 = str3;
        this.mobileNumber = str4;
        this.isBanned = z;
        this.banReason = str5;
        this.readingGoal = i3;
        this.booksReadThisYear = i4;
        this.totalMoneySaved = d;
    }

    public /* synthetic */ User(String str, String str2, int i, int i2, String str3, String str4, boolean z, String str5, int i3, int i4, double d, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? "" : str2, (i5 & 4) != 0 ? 100 : i, (i5 & 8) != 0 ? 0 : i2, (i5 & 16) != 0 ? null : str3, (i5 & 32) != 0 ? null : str4, (i5 & 64) != 0 ? false : z, (i5 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0 ? str5 : null, (i5 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? 12 : i3, (i5 & UserVerificationMethods.USER_VERIFY_NONE) == 0 ? i4 : 0, (i5 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? 0.0d : d);
    }

    public final String getUsername() {
        return this.username;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final int getTrustScore() {
        return this.trustScore;
    }

    public final int getCompletedSwaps() {
        return this.completedSwaps;
    }

    public final String getProfilePicBase64() {
        return this.profilePicBase64;
    }

    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    public final boolean isBanned() {
        return this.isBanned;
    }

    public final String getBanReason() {
        return this.banReason;
    }

    public final int getReadingGoal() {
        return this.readingGoal;
    }

    public final int getBooksReadThisYear() {
        return this.booksReadThisYear;
    }

    public final double getTotalMoneySaved() {
        return this.totalMoneySaved;
    }
}
