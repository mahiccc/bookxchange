package com.example.ui.screens;

import com.google.android.gms.common.Scopes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EcoLeaderboardDialog.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006#"}, d2 = {"Lcom/example/ui/screens/LeaderboardEntry;", "", "rank", "", "name", "", Scopes.EMAIL, "trustScore", "booksCirculated", "tier", "badgeIcon", "<init>", "(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V", "getRank", "()I", "getName", "()Ljava/lang/String;", "getEmail", "getTrustScore", "getBooksCirculated", "getTier", "getBadgeIcon", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LeaderboardEntry {
    public static final int $stable = 0;
    private final String badgeIcon;
    private final int booksCirculated;
    private final String email;
    private final String name;
    private final int rank;
    private final String tier;
    private final int trustScore;

    public static /* synthetic */ LeaderboardEntry copy$default(LeaderboardEntry leaderboardEntry, int i, String str, String str2, int i2, int i3, String str3, String str4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = leaderboardEntry.rank;
        }
        if ((i4 & 2) != 0) {
            str = leaderboardEntry.name;
        }
        if ((i4 & 4) != 0) {
            str2 = leaderboardEntry.email;
        }
        if ((i4 & 8) != 0) {
            i2 = leaderboardEntry.trustScore;
        }
        if ((i4 & 16) != 0) {
            i3 = leaderboardEntry.booksCirculated;
        }
        if ((i4 & 32) != 0) {
            str3 = leaderboardEntry.tier;
        }
        if ((i4 & 64) != 0) {
            str4 = leaderboardEntry.badgeIcon;
        }
        String str5 = str3;
        String str6 = str4;
        int i5 = i3;
        String str7 = str2;
        return leaderboardEntry.copy(i, str, str7, i2, i5, str5, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRank() {
        return this.rank;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTrustScore() {
        return this.trustScore;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getBooksCirculated() {
        return this.booksCirculated;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTier() {
        return this.tier;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getBadgeIcon() {
        return this.badgeIcon;
    }

    public final LeaderboardEntry copy(int rank, String name, String email, int trustScore, int booksCirculated, String tier, String badgeIcon) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(email, Scopes.EMAIL);
        Intrinsics.checkNotNullParameter(tier, "tier");
        Intrinsics.checkNotNullParameter(badgeIcon, "badgeIcon");
        return new LeaderboardEntry(rank, name, email, trustScore, booksCirculated, tier, badgeIcon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeaderboardEntry)) {
            return false;
        }
        LeaderboardEntry leaderboardEntry = (LeaderboardEntry) other;
        return this.rank == leaderboardEntry.rank && Intrinsics.areEqual(this.name, leaderboardEntry.name) && Intrinsics.areEqual(this.email, leaderboardEntry.email) && this.trustScore == leaderboardEntry.trustScore && this.booksCirculated == leaderboardEntry.booksCirculated && Intrinsics.areEqual(this.tier, leaderboardEntry.tier) && Intrinsics.areEqual(this.badgeIcon, leaderboardEntry.badgeIcon);
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.rank) * 31) + this.name.hashCode()) * 31) + this.email.hashCode()) * 31) + Integer.hashCode(this.trustScore)) * 31) + Integer.hashCode(this.booksCirculated)) * 31) + this.tier.hashCode()) * 31) + this.badgeIcon.hashCode();
    }

    public String toString() {
        return "LeaderboardEntry(rank=" + this.rank + ", name=" + this.name + ", email=" + this.email + ", trustScore=" + this.trustScore + ", booksCirculated=" + this.booksCirculated + ", tier=" + this.tier + ", badgeIcon=" + this.badgeIcon + ")";
    }

    public LeaderboardEntry(int i, String str, String str2, int i2, int i3, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, Scopes.EMAIL);
        Intrinsics.checkNotNullParameter(str3, "tier");
        Intrinsics.checkNotNullParameter(str4, "badgeIcon");
        this.rank = i;
        this.name = str;
        this.email = str2;
        this.trustScore = i2;
        this.booksCirculated = i3;
        this.tier = str3;
        this.badgeIcon = str4;
    }

    public final int getRank() {
        return this.rank;
    }

    public final String getName() {
        return this.name;
    }

    public final String getEmail() {
        return this.email;
    }

    public final int getTrustScore() {
        return this.trustScore;
    }

    public final int getBooksCirculated() {
        return this.booksCirculated;
    }

    public final String getTier() {
        return this.tier;
    }

    public final String getBadgeIcon() {
        return this.badgeIcon;
    }
}
