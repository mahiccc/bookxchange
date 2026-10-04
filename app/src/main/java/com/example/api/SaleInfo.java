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

/* JADX INFO: compiled from: GoogleBooksApiService.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002 !B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0005\u0010\u000bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\bHÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J%\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0001¢\u0006\u0002\b\u001fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\""}, d2 = {"Lcom/example/api/SaleInfo;", "", "listPrice", "Lcom/example/api/Price;", "retailPrice", "<init>", "(Lcom/example/api/Price;Lcom/example/api/Price;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/example/api/Price;Lcom/example/api/Price;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getListPrice", "()Lcom/example/api/Price;", "getRetailPrice", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app", "$serializer", "Companion", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@Serializable
public final /* data */ class SaleInfo {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Price listPrice;
    private final Price retailPrice;

    /* JADX WARN: Illegal instructions before constructor call */
    public SaleInfo() {
        Price price = null;
        this(price, price, 3, (DefaultConstructorMarker) price);
    }

    public static /* synthetic */ SaleInfo copy$default(SaleInfo saleInfo, Price price, Price price2, int i, Object obj) {
        if ((i & 1) != 0) {
            price = saleInfo.listPrice;
        }
        if ((i & 2) != 0) {
            price2 = saleInfo.retailPrice;
        }
        return saleInfo.copy(price, price2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Price getListPrice() {
        return this.listPrice;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Price getRetailPrice() {
        return this.retailPrice;
    }

    public final SaleInfo copy(Price listPrice, Price retailPrice) {
        return new SaleInfo(listPrice, retailPrice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SaleInfo)) {
            return false;
        }
        SaleInfo saleInfo = (SaleInfo) other;
        return Intrinsics.areEqual(this.listPrice, saleInfo.listPrice) && Intrinsics.areEqual(this.retailPrice, saleInfo.retailPrice);
    }

    public int hashCode() {
        Price price = this.listPrice;
        int iHashCode = (price == null ? 0 : price.hashCode()) * 31;
        Price price2 = this.retailPrice;
        return iHashCode + (price2 != null ? price2.hashCode() : 0);
    }

    public String toString() {
        return "SaleInfo(listPrice=" + this.listPrice + ", retailPrice=" + this.retailPrice + ")";
    }

    /* JADX INFO: compiled from: GoogleBooksApiService.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/example/api/SaleInfo$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/example/api/SaleInfo;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SaleInfo> serializer() {
            return SaleInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SaleInfo(int i, Price price, Price price2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.listPrice = null;
        } else {
            this.listPrice = price;
        }
        if ((i & 2) == 0) {
            this.retailPrice = null;
        } else {
            this.retailPrice = price2;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$app(SaleInfo self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.listPrice != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, Price$$serializer.INSTANCE, self.listPrice);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.retailPrice == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, Price$$serializer.INSTANCE, self.retailPrice);
    }

    public SaleInfo(Price price, Price price2) {
        this.listPrice = price;
        this.retailPrice = price2;
    }

    public /* synthetic */ SaleInfo(Price price, Price price2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : price, (i & 2) != 0 ? null : price2);
    }

    public final Price getListPrice() {
        return this.listPrice;
    }

    public final Price getRetailPrice() {
        return this.retailPrice;
    }
}
