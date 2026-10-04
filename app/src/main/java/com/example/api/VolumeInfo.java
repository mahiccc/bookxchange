package com.example.api;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: GoogleBooksApiService.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 N2\u00020\u0001:\u0002MNBµ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0006¢\u0006\u0004\b\u0015\u0010\u0016B¯\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001aJ\u0006\u0010/\u001a\u00020\u0003J\b\u00100\u001a\u0004\u0018\u00010\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00105\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010'J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010+J\u0010\u0010<\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010'J\u0011\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0006HÆ\u0003J¼\u0001\u0010>\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010?J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020\u000eHÖ\u0001J\t\u0010D\u001a\u00020\u0003HÖ\u0001J%\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u00002\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020KH\u0001¢\u0006\u0002\bLR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010(\u001a\u0004\b-\u0010'R\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001f¨\u0006O"}, d2 = {"Lcom/example/api/VolumeInfo;", "", "title", "", "subtitle", "authors", "", "description", "categories", "imageLinks", "Lcom/example/api/ImageLinks;", "publisher", "publishedDate", "pageCount", "", "language", "averageRating", "", "ratingsCount", "industryIdentifiers", "Lcom/example/api/IndustryIdentifier;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/example/api/ImageLinks;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/util/List;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/example/api/ImageLinks;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getAuthors", "()Ljava/util/List;", "getDescription", "getCategories", "getImageLinks", "()Lcom/example/api/ImageLinks;", "getPublisher", "getPublishedDate", "getPageCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLanguage", "getAverageRating", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getRatingsCount", "getIndustryIdentifiers", "getFullTitle", "getIsbn", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/example/api/ImageLinks;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/util/List;)Lcom/example/api/VolumeInfo;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app", "$serializer", "Companion", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@Serializable
public final /* data */ class VolumeInfo {
    private final List<String> authors;
    private final Double averageRating;
    private final List<String> categories;
    private final String description;
    private final ImageLinks imageLinks;
    private final List<IndustryIdentifier> industryIdentifiers;
    private final String language;
    private final Integer pageCount;
    private final String publishedDate;
    private final String publisher;
    private final Integer ratingsCount;
    private final String subtitle;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.example.api.VolumeInfo$$ExternalSyntheticLambda0
        public final Object invoke() {
            return VolumeInfo._childSerializers$_anonymous_();
        }
    }), null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.example.api.VolumeInfo$$ExternalSyntheticLambda1
        public final Object invoke() {
            return VolumeInfo._childSerializers$_anonymous_$2();
        }
    }), null, null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.example.api.VolumeInfo$$ExternalSyntheticLambda2
        public final Object invoke() {
            return VolumeInfo._childSerializers$_anonymous_$3();
        }
    })};

    public VolumeInfo() {
        this((String) null, (String) null, (List) null, (String) null, (List) null, (ImageLinks) null, (String) null, (String) null, (Integer) null, (String) null, (Double) null, (Integer) null, (List) null, 8191, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
        return new ArrayListSerializer(IndustryIdentifier$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VolumeInfo copy$default(VolumeInfo volumeInfo, String str, String str2, List list, String str3, List list2, ImageLinks imageLinks, String str4, String str5, Integer num, String str6, Double d, Integer num2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = volumeInfo.title;
        }
        return volumeInfo.copy(str, (i & 2) != 0 ? volumeInfo.subtitle : str2, (i & 4) != 0 ? volumeInfo.authors : list, (i & 8) != 0 ? volumeInfo.description : str3, (i & 16) != 0 ? volumeInfo.categories : list2, (i & 32) != 0 ? volumeInfo.imageLinks : imageLinks, (i & 64) != 0 ? volumeInfo.publisher : str4, (i & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? volumeInfo.publishedDate : str5, (i & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? volumeInfo.pageCount : num, (i & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? volumeInfo.language : str6, (i & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? volumeInfo.averageRating : d, (i & 2048) != 0 ? volumeInfo.ratingsCount : num2, (i & 4096) != 0 ? volumeInfo.industryIdentifiers : list3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Double getAverageRating() {
        return this.averageRating;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getRatingsCount() {
        return this.ratingsCount;
    }

    public final List<IndustryIdentifier> component13() {
        return this.industryIdentifiers;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<String> component3() {
        return this.authors;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final List<String> component5() {
        return this.categories;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ImageLinks getImageLinks() {
        return this.imageLinks;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPublisher() {
        return this.publisher;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPublishedDate() {
        return this.publishedDate;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getPageCount() {
        return this.pageCount;
    }

    public final VolumeInfo copy(String title, String subtitle, List<String> authors, String description, List<String> categories, ImageLinks imageLinks, String publisher, String publishedDate, Integer pageCount, String language, Double averageRating, Integer ratingsCount, List<IndustryIdentifier> industryIdentifiers) {
        return new VolumeInfo(title, subtitle, authors, description, categories, imageLinks, publisher, publishedDate, pageCount, language, averageRating, ratingsCount, industryIdentifiers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VolumeInfo)) {
            return false;
        }
        VolumeInfo volumeInfo = (VolumeInfo) other;
        return Intrinsics.areEqual(this.title, volumeInfo.title) && Intrinsics.areEqual(this.subtitle, volumeInfo.subtitle) && Intrinsics.areEqual(this.authors, volumeInfo.authors) && Intrinsics.areEqual(this.description, volumeInfo.description) && Intrinsics.areEqual(this.categories, volumeInfo.categories) && Intrinsics.areEqual(this.imageLinks, volumeInfo.imageLinks) && Intrinsics.areEqual(this.publisher, volumeInfo.publisher) && Intrinsics.areEqual(this.publishedDate, volumeInfo.publishedDate) && Intrinsics.areEqual(this.pageCount, volumeInfo.pageCount) && Intrinsics.areEqual(this.language, volumeInfo.language) && Intrinsics.areEqual(this.averageRating, volumeInfo.averageRating) && Intrinsics.areEqual(this.ratingsCount, volumeInfo.ratingsCount) && Intrinsics.areEqual(this.industryIdentifiers, volumeInfo.industryIdentifiers);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.authors;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list2 = this.categories;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ImageLinks imageLinks = this.imageLinks;
        int iHashCode6 = (iHashCode5 + (imageLinks == null ? 0 : imageLinks.hashCode())) * 31;
        String str4 = this.publisher;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.publishedDate;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.pageCount;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.language;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Double d = this.averageRating;
        int iHashCode11 = (iHashCode10 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num2 = this.ratingsCount;
        int iHashCode12 = (iHashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<IndustryIdentifier> list3 = this.industryIdentifiers;
        return iHashCode12 + (list3 != null ? list3.hashCode() : 0);
    }

    public String toString() {
        return "VolumeInfo(title=" + this.title + ", subtitle=" + this.subtitle + ", authors=" + this.authors + ", description=" + this.description + ", categories=" + this.categories + ", imageLinks=" + this.imageLinks + ", publisher=" + this.publisher + ", publishedDate=" + this.publishedDate + ", pageCount=" + this.pageCount + ", language=" + this.language + ", averageRating=" + this.averageRating + ", ratingsCount=" + this.ratingsCount + ", industryIdentifiers=" + this.industryIdentifiers + ")";
    }

    /* JADX INFO: compiled from: GoogleBooksApiService.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/example/api/VolumeInfo$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/example/api/VolumeInfo;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<VolumeInfo> serializer() {
            return VolumeInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ VolumeInfo(int i, String str, String str2, List list, String str3, List list2, ImageLinks imageLinks, String str4, String str5, Integer num, String str6, Double d, Integer num2, List list3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str2;
        }
        if ((i & 4) == 0) {
            this.authors = null;
        } else {
            this.authors = list;
        }
        if ((i & 8) == 0) {
            this.description = null;
        } else {
            this.description = str3;
        }
        if ((i & 16) == 0) {
            this.categories = null;
        } else {
            this.categories = list2;
        }
        if ((i & 32) == 0) {
            this.imageLinks = null;
        } else {
            this.imageLinks = imageLinks;
        }
        if ((i & 64) == 0) {
            this.publisher = null;
        } else {
            this.publisher = str4;
        }
        if ((i & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
            this.publishedDate = null;
        } else {
            this.publishedDate = str5;
        }
        if ((i & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0) {
            this.pageCount = null;
        } else {
            this.pageCount = num;
        }
        if ((i & UserVerificationMethods.USER_VERIFY_NONE) == 0) {
            this.language = null;
        } else {
            this.language = str6;
        }
        if ((i & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
            this.averageRating = null;
        } else {
            this.averageRating = d;
        }
        if ((i & 2048) == 0) {
            this.ratingsCount = null;
        } else {
            this.ratingsCount = num2;
        }
        if ((i & 4096) == 0) {
            this.industryIdentifiers = null;
        } else {
            this.industryIdentifiers = list3;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$app(VolumeInfo self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.title != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.subtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.subtitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.authors != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, (SerializationStrategy) lazyArr[2].getValue(), self.authors);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.description != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.description);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.categories != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, (SerializationStrategy) lazyArr[4].getValue(), self.categories);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.imageLinks != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, ImageLinks$$serializer.INSTANCE, self.imageLinks);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.publisher != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.publisher);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.publishedDate != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.publishedDate);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.pageCount != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, IntSerializer.INSTANCE, self.pageCount);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.language != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, self.language);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.averageRating != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, DoubleSerializer.INSTANCE, self.averageRating);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.ratingsCount != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, IntSerializer.INSTANCE, self.ratingsCount);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 12) && self.industryIdentifiers == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 12, (SerializationStrategy) lazyArr[12].getValue(), self.industryIdentifiers);
    }

    public VolumeInfo(String str, String str2, List<String> list, String str3, List<String> list2, ImageLinks imageLinks, String str4, String str5, Integer num, String str6, Double d, Integer num2, List<IndustryIdentifier> list3) {
        this.title = str;
        this.subtitle = str2;
        this.authors = list;
        this.description = str3;
        this.categories = list2;
        this.imageLinks = imageLinks;
        this.publisher = str4;
        this.publishedDate = str5;
        this.pageCount = num;
        this.language = str6;
        this.averageRating = d;
        this.ratingsCount = num2;
        this.industryIdentifiers = list3;
    }

    public /* synthetic */ VolumeInfo(String str, String str2, List list, String str3, List list2, ImageLinks imageLinks, String str4, String str5, Integer num, String str6, Double d, Integer num2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : imageLinks, (i & 64) != 0 ? null : str4, (i & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str5, (i & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : num, (i & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str6, (i & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : d, (i & 2048) != 0 ? null : num2, (i & 4096) != 0 ? null : list3);
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<String> getAuthors() {
        return this.authors;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<String> getCategories() {
        return this.categories;
    }

    public final ImageLinks getImageLinks() {
        return this.imageLinks;
    }

    public final String getPublisher() {
        return this.publisher;
    }

    public final String getPublishedDate() {
        return this.publishedDate;
    }

    public final Integer getPageCount() {
        return this.pageCount;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final Double getAverageRating() {
        return this.averageRating;
    }

    public final Integer getRatingsCount() {
        return this.ratingsCount;
    }

    public final List<IndustryIdentifier> getIndustryIdentifiers() {
        return this.industryIdentifiers;
    }

    public final String getFullTitle() {
        String str;
        String str2 = this.subtitle;
        if (str2 != null && !StringsKt.isBlank(str2) && (str = this.title) != null && !StringsKt.isBlank(str) && !StringsKt.contains(this.title, this.subtitle, true)) {
            return this.title + ": " + this.subtitle;
        }
        String str3 = this.title;
        return str3 == null ? "" : str3;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    public final String getIsbn() {
        String identifier;
        Object next;
        Object next2;
        List<IndustryIdentifier> list = this.industryIdentifiers;
        String identifier2 = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (!Intrinsics.areEqual(((IndustryIdentifier) next2).getType(), "ISBN_13"));
            IndustryIdentifier industryIdentifier = (IndustryIdentifier) next2;
            if (industryIdentifier != null) {
                identifier = industryIdentifier.getIdentifier();
            } else {
                identifier = null;
            }
        } else {
            identifier = null;
        }
        List<IndustryIdentifier> list2 = this.industryIdentifiers;
        if (list2 != null) {
            Iterator<T> it2 = list2.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!Intrinsics.areEqual(((IndustryIdentifier) next).getType(), "ISBN_10"));
            IndustryIdentifier industryIdentifier2 = (IndustryIdentifier) next;
            if (industryIdentifier2 != null) {
                identifier2 = industryIdentifier2.getIdentifier();
            }
        }
        return identifier == null ? identifier2 : identifier;
    }
}
