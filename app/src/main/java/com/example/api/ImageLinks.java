package com.example.api;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: GoogleBooksApiService.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002,-BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nBW\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u000fJ\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\fHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J%\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0001¢\u0006\u0002\b+R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011¨\u0006."}, d2 = {"Lcom/example/api/ImageLinks;", "", "smallThumbnail", "", "thumbnail", "small", "medium", "large", "extraLarge", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getSmallThumbnail", "()Ljava/lang/String;", "getThumbnail", "getSmall", "getMedium", "getLarge", "getExtraLarge", "getBestHighResUrl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app", "$serializer", "Companion", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@Serializable
public final /* data */ class ImageLinks {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String extraLarge;
    private final String large;
    private final String medium;
    private final String small;
    private final String smallThumbnail;
    private final String thumbnail;

    public ImageLinks() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ImageLinks copy$default(ImageLinks imageLinks, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = imageLinks.smallThumbnail;
        }
        if ((i & 2) != 0) {
            str2 = imageLinks.thumbnail;
        }
        if ((i & 4) != 0) {
            str3 = imageLinks.small;
        }
        if ((i & 8) != 0) {
            str4 = imageLinks.medium;
        }
        if ((i & 16) != 0) {
            str5 = imageLinks.large;
        }
        if ((i & 32) != 0) {
            str6 = imageLinks.extraLarge;
        }
        String str7 = str5;
        String str8 = str6;
        return imageLinks.copy(str, str2, str3, str4, str7, str8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSmallThumbnail() {
        return this.smallThumbnail;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getThumbnail() {
        return this.thumbnail;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSmall() {
        return this.small;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMedium() {
        return this.medium;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLarge() {
        return this.large;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getExtraLarge() {
        return this.extraLarge;
    }

    public final ImageLinks copy(String smallThumbnail, String thumbnail, String small, String medium, String large, String extraLarge) {
        return new ImageLinks(smallThumbnail, thumbnail, small, medium, large, extraLarge);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageLinks)) {
            return false;
        }
        ImageLinks imageLinks = (ImageLinks) other;
        return Intrinsics.areEqual(this.smallThumbnail, imageLinks.smallThumbnail) && Intrinsics.areEqual(this.thumbnail, imageLinks.thumbnail) && Intrinsics.areEqual(this.small, imageLinks.small) && Intrinsics.areEqual(this.medium, imageLinks.medium) && Intrinsics.areEqual(this.large, imageLinks.large) && Intrinsics.areEqual(this.extraLarge, imageLinks.extraLarge);
    }

    public int hashCode() {
        String str = this.smallThumbnail;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.thumbnail;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.small;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.medium;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.large;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.extraLarge;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "ImageLinks(smallThumbnail=" + this.smallThumbnail + ", thumbnail=" + this.thumbnail + ", small=" + this.small + ", medium=" + this.medium + ", large=" + this.large + ", extraLarge=" + this.extraLarge + ")";
    }

    /* JADX INFO: compiled from: GoogleBooksApiService.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/example/api/ImageLinks$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/example/api/ImageLinks;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ImageLinks> serializer() {
            return ImageLinks$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ImageLinks(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.smallThumbnail = null;
        } else {
            this.smallThumbnail = str;
        }
        if ((i & 2) == 0) {
            this.thumbnail = null;
        } else {
            this.thumbnail = str2;
        }
        if ((i & 4) == 0) {
            this.small = null;
        } else {
            this.small = str3;
        }
        if ((i & 8) == 0) {
            this.medium = null;
        } else {
            this.medium = str4;
        }
        if ((i & 16) == 0) {
            this.large = null;
        } else {
            this.large = str5;
        }
        if ((i & 32) == 0) {
            this.extraLarge = null;
        } else {
            this.extraLarge = str6;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$app(ImageLinks self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.smallThumbnail != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.smallThumbnail);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.thumbnail != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.thumbnail);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.small != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.small);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.medium != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.medium);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.large != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.large);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.extraLarge == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.extraLarge);
    }

    public ImageLinks(String str, String str2, String str3, String str4, String str5, String str6) {
        this.smallThumbnail = str;
        this.thumbnail = str2;
        this.small = str3;
        this.medium = str4;
        this.large = str5;
        this.extraLarge = str6;
    }

    public /* synthetic */ ImageLinks(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }

    public final String getSmallThumbnail() {
        return this.smallThumbnail;
    }

    public final String getThumbnail() {
        return this.thumbnail;
    }

    public final String getSmall() {
        return this.small;
    }

    public final String getMedium() {
        return this.medium;
    }

    public final String getLarge() {
        return this.large;
    }

    public final String getExtraLarge() {
        return this.extraLarge;
    }

    public final String getBestHighResUrl() {
        String strReplace$default;
        String str = this.extraLarge;
        if (str == null && (str = this.large) == null && (str = this.medium) == null && (str = this.small) == null && (str = this.thumbnail) == null) {
            str = this.smallThumbnail;
        }
        String str2 = str;
        if (str2 == null || (strReplace$default = StringsKt.replace$default(str2, "http://", "https://", false, 4, (Object) null)) == null) {
            return null;
        }
        return StringsKt.replace$default(strReplace$default, "&edge=curl", "", false, 4, (Object) null);
    }
}
