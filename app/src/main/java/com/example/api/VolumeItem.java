package com.example.api;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: GoogleBooksApiService.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002&'B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J%\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0001¢\u0006\u0002\b%R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006("}, d2 = {"Lcom/example/api/VolumeItem;", "", "id", "", "volumeInfo", "Lcom/example/api/VolumeInfo;", "saleInfo", "Lcom/example/api/SaleInfo;", "<init>", "(Ljava/lang/String;Lcom/example/api/VolumeInfo;Lcom/example/api/SaleInfo;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/example/api/VolumeInfo;Lcom/example/api/SaleInfo;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId", "()Ljava/lang/String;", "getVolumeInfo", "()Lcom/example/api/VolumeInfo;", "getSaleInfo", "()Lcom/example/api/SaleInfo;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app", "$serializer", "Companion", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@Serializable
public final /* data */ class VolumeItem {
    private final String id;
    private final SaleInfo saleInfo;
    private final VolumeInfo volumeInfo;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public VolumeItem() {
        this((String) null, (VolumeInfo) null, (SaleInfo) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ VolumeItem copy$default(VolumeItem volumeItem, String str, VolumeInfo volumeInfo, SaleInfo saleInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = volumeItem.id;
        }
        if ((i & 2) != 0) {
            volumeInfo = volumeItem.volumeInfo;
        }
        if ((i & 4) != 0) {
            saleInfo = volumeItem.saleInfo;
        }
        return volumeItem.copy(str, volumeInfo, saleInfo);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final VolumeInfo getVolumeInfo() {
        return this.volumeInfo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SaleInfo getSaleInfo() {
        return this.saleInfo;
    }

    public final VolumeItem copy(String id, VolumeInfo volumeInfo, SaleInfo saleInfo) {
        return new VolumeItem(id, volumeInfo, saleInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VolumeItem)) {
            return false;
        }
        VolumeItem volumeItem = (VolumeItem) other;
        return Intrinsics.areEqual(this.id, volumeItem.id) && Intrinsics.areEqual(this.volumeInfo, volumeItem.volumeInfo) && Intrinsics.areEqual(this.saleInfo, volumeItem.saleInfo);
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        VolumeInfo volumeInfo = this.volumeInfo;
        int iHashCode2 = (iHashCode + (volumeInfo == null ? 0 : volumeInfo.hashCode())) * 31;
        SaleInfo saleInfo = this.saleInfo;
        return iHashCode2 + (saleInfo != null ? saleInfo.hashCode() : 0);
    }

    public String toString() {
        return "VolumeItem(id=" + this.id + ", volumeInfo=" + this.volumeInfo + ", saleInfo=" + this.saleInfo + ")";
    }

    /* JADX INFO: compiled from: GoogleBooksApiService.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/example/api/VolumeItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/example/api/VolumeItem;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<VolumeItem> serializer() {
            return VolumeItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ VolumeItem(int i, String str, VolumeInfo volumeInfo, SaleInfo saleInfo, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.volumeInfo = null;
        } else {
            this.volumeInfo = volumeInfo;
        }
        if ((i & 4) == 0) {
            this.saleInfo = null;
        } else {
            this.saleInfo = saleInfo;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$app(VolumeItem self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.id != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.volumeInfo != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, VolumeInfo$$serializer.INSTANCE, self.volumeInfo);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.saleInfo == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, SaleInfo$$serializer.INSTANCE, self.saleInfo);
    }

    public VolumeItem(String str, VolumeInfo volumeInfo, SaleInfo saleInfo) {
        this.id = str;
        this.volumeInfo = volumeInfo;
        this.saleInfo = saleInfo;
    }

    public /* synthetic */ VolumeItem(String str, VolumeInfo volumeInfo, SaleInfo saleInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : volumeInfo, (i & 4) != 0 ? null : saleInfo);
    }

    public final String getId() {
        return this.id;
    }

    public final VolumeInfo getVolumeInfo() {
        return this.volumeInfo;
    }

    public final SaleInfo getSaleInfo() {
        return this.saleInfo;
    }
}
