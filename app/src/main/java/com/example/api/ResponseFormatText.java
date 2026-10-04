package com.example.api;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;

/* JADX INFO: compiled from: GeminiApiService.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\tHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J%\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0001¢\u0006\u0002\b R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, d2 = {"Lcom/example/api/ResponseFormatText;", "", "mimeType", "", "schema", "Lkotlinx/serialization/json/JsonObject;", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getMimeType", "()Ljava/lang/String;", "getSchema", "()Lkotlinx/serialization/json/JsonObject;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app", "$serializer", "Companion", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@Serializable
public final /* data */ class ResponseFormatText {
    private final String mimeType;
    private final JsonObject schema;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ ResponseFormatText copy$default(ResponseFormatText responseFormatText, String str, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = responseFormatText.mimeType;
        }
        if ((i & 2) != 0) {
            jsonObject = responseFormatText.schema;
        }
        return responseFormatText.copy(str, jsonObject);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final JsonObject getSchema() {
        return this.schema;
    }

    public final ResponseFormatText copy(String mimeType, JsonObject schema) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        return new ResponseFormatText(mimeType, schema);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResponseFormatText)) {
            return false;
        }
        ResponseFormatText responseFormatText = (ResponseFormatText) other;
        return Intrinsics.areEqual(this.mimeType, responseFormatText.mimeType) && Intrinsics.areEqual(this.schema, responseFormatText.schema);
    }

    public int hashCode() {
        int iHashCode = this.mimeType.hashCode() * 31;
        JsonObject jsonObject = this.schema;
        return iHashCode + (jsonObject == null ? 0 : jsonObject.hashCode());
    }

    public String toString() {
        return "ResponseFormatText(mimeType=" + this.mimeType + ", schema=" + this.schema + ")";
    }

    /* JADX INFO: compiled from: GeminiApiService.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/example/api/ResponseFormatText$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/example/api/ResponseFormatText;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ResponseFormatText> serializer() {
            return ResponseFormatText$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ResponseFormatText(int i, String str, JsonObject jsonObject, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, ResponseFormatText$$serializer.INSTANCE.getDescriptor());
        }
        this.mimeType = str;
        if ((i & 2) == 0) {
            this.schema = null;
        } else {
            this.schema = jsonObject;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$app(ResponseFormatText self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.mimeType);
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.schema == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, JsonObjectSerializer.INSTANCE, self.schema);
    }

    public ResponseFormatText(String str, JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(str, "mimeType");
        this.mimeType = str;
        this.schema = jsonObject;
    }

    public /* synthetic */ ResponseFormatText(String str, JsonObject jsonObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : jsonObject);
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final JsonObject getSchema() {
        return this.schema;
    }
}
