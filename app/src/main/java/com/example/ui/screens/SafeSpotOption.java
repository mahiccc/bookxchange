package com.example.ui.screens;

import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SafeMeetupDialog.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/example/ui/screens/SafeSpotOption;", "", "category", "", "name", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "defaultAddress", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;)V", "getCategory", "()Ljava/lang/String;", "getName", "getIcon", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "getDefaultAddress", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SafeSpotOption {
    public static final int $stable = 0;
    private final String category;
    private final String defaultAddress;
    private final ImageVector icon;
    private final String name;

    public static /* synthetic */ SafeSpotOption copy$default(SafeSpotOption safeSpotOption, String str, String str2, ImageVector imageVector, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = safeSpotOption.category;
        }
        if ((i & 2) != 0) {
            str2 = safeSpotOption.name;
        }
        if ((i & 4) != 0) {
            imageVector = safeSpotOption.icon;
        }
        if ((i & 8) != 0) {
            str3 = safeSpotOption.defaultAddress;
        }
        return safeSpotOption.copy(str, str2, imageVector, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ImageVector getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDefaultAddress() {
        return this.defaultAddress;
    }

    public final SafeSpotOption copy(String category, String name, ImageVector icon, String defaultAddress) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(defaultAddress, "defaultAddress");
        return new SafeSpotOption(category, name, icon, defaultAddress);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SafeSpotOption)) {
            return false;
        }
        SafeSpotOption safeSpotOption = (SafeSpotOption) other;
        return Intrinsics.areEqual(this.category, safeSpotOption.category) && Intrinsics.areEqual(this.name, safeSpotOption.name) && Intrinsics.areEqual(this.icon, safeSpotOption.icon) && Intrinsics.areEqual(this.defaultAddress, safeSpotOption.defaultAddress);
    }

    public int hashCode() {
        return (((((this.category.hashCode() * 31) + this.name.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.defaultAddress.hashCode();
    }

    public String toString() {
        return "SafeSpotOption(category=" + this.category + ", name=" + this.name + ", icon=" + this.icon + ", defaultAddress=" + this.defaultAddress + ")";
    }

    public SafeSpotOption(String str, String str2, ImageVector imageVector, String str3) {
        Intrinsics.checkNotNullParameter(str, "category");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(imageVector, "icon");
        Intrinsics.checkNotNullParameter(str3, "defaultAddress");
        this.category = str;
        this.name = str2;
        this.icon = imageVector;
        this.defaultAddress = str3;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getName() {
        return this.name;
    }

    public final ImageVector getIcon() {
        return this.icon;
    }

    public final String getDefaultAddress() {
        return this.defaultAddress;
    }
}
