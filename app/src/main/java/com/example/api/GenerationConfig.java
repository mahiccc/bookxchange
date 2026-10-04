package com.example.api;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: GeminiApiService.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000256BU\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eB]\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0012J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fHÆ\u0003J\\\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\nHÖ\u0001J\t\u0010,\u001a\u00020\u0005HÖ\u0001J%\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0001¢\u0006\u0002\b4R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00067"}, d2 = {"Lcom/example/api/GenerationConfig;", "", "responseFormat", "Lcom/example/api/ResponseFormat;", "responseMimeType", "", "temperature", "", "topP", "topK", "", "responseModalities", "", "<init>", "(Lcom/example/api/ResponseFormat;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/util/List;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/example/api/ResponseFormat;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getResponseFormat", "()Lcom/example/api/ResponseFormat;", "getResponseMimeType", "()Ljava/lang/String;", "getTemperature", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getTopP", "getTopK", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getResponseModalities", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/example/api/ResponseFormat;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/util/List;)Lcom/example/api/GenerationConfig;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app", "$serializer", "Companion", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@Serializable
public final /* data */ class GenerationConfig {
    private final ResponseFormat responseFormat;
    private final String responseMimeType;
    private final List<String> responseModalities;
    private final Float temperature;
    private final Integer topK;
    private final Float topP;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.example.api.GenerationConfig$$ExternalSyntheticLambda0
        public final Object invoke() {
            return GenerationConfig._childSerializers$_anonymous_();
        }
    })};

    public GenerationConfig() {
        this((ResponseFormat) null, (String) null, (Float) null, (Float) null, (Integer) null, (List) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GenerationConfig copy$default(GenerationConfig generationConfig, ResponseFormat responseFormat, String str, Float f, Float f2, Integer num, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            responseFormat = generationConfig.responseFormat;
        }
        if ((i & 2) != 0) {
            str = generationConfig.responseMimeType;
        }
        if ((i & 4) != 0) {
            f = generationConfig.temperature;
        }
        if ((i & 8) != 0) {
            f2 = generationConfig.topP;
        }
        if ((i & 16) != 0) {
            num = generationConfig.topK;
        }
        if ((i & 32) != 0) {
            list = generationConfig.responseModalities;
        }
        Integer num2 = num;
        List list2 = list;
        return generationConfig.copy(responseFormat, str, f, f2, num2, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ResponseFormat getResponseFormat() {
        return this.responseFormat;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getResponseMimeType() {
        return this.responseMimeType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Float getTemperature() {
        return this.temperature;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Float getTopP() {
        return this.topP;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getTopK() {
        return this.topK;
    }

    public final List<String> component6() {
        return this.responseModalities;
    }

    public final GenerationConfig copy(ResponseFormat responseFormat, String responseMimeType, Float temperature, Float topP, Integer topK, List<String> responseModalities) {
        return new GenerationConfig(responseFormat, responseMimeType, temperature, topP, topK, responseModalities);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenerationConfig)) {
            return false;
        }
        GenerationConfig generationConfig = (GenerationConfig) other;
        return Intrinsics.areEqual(this.responseFormat, generationConfig.responseFormat) && Intrinsics.areEqual(this.responseMimeType, generationConfig.responseMimeType) && Intrinsics.areEqual(this.temperature, generationConfig.temperature) && Intrinsics.areEqual(this.topP, generationConfig.topP) && Intrinsics.areEqual(this.topK, generationConfig.topK) && Intrinsics.areEqual(this.responseModalities, generationConfig.responseModalities);
    }

    public int hashCode() {
        ResponseFormat responseFormat = this.responseFormat;
        int iHashCode = (responseFormat == null ? 0 : responseFormat.hashCode()) * 31;
        String str = this.responseMimeType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Float f = this.temperature;
        int iHashCode3 = (iHashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.topP;
        int iHashCode4 = (iHashCode3 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Integer num = this.topK;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        List<String> list = this.responseModalities;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "GenerationConfig(responseFormat=" + this.responseFormat + ", responseMimeType=" + this.responseMimeType + ", temperature=" + this.temperature + ", topP=" + this.topP + ", topK=" + this.topK + ", responseModalities=" + this.responseModalities + ")";
    }

    /* JADX INFO: compiled from: GeminiApiService.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/example/api/GenerationConfig$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/example/api/GenerationConfig;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GenerationConfig> serializer() {
            return GenerationConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GenerationConfig(int i, ResponseFormat responseFormat, String str, Float f, Float f2, Integer num, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.responseFormat = null;
        } else {
            this.responseFormat = responseFormat;
        }
        if ((i & 2) == 0) {
            this.responseMimeType = null;
        } else {
            this.responseMimeType = str;
        }
        if ((i & 4) == 0) {
            this.temperature = null;
        } else {
            this.temperature = f;
        }
        if ((i & 8) == 0) {
            this.topP = null;
        } else {
            this.topP = f2;
        }
        if ((i & 16) == 0) {
            this.topK = null;
        } else {
            this.topK = num;
        }
        if ((i & 32) == 0) {
            this.responseModalities = null;
        } else {
            this.responseModalities = list;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$app(GenerationConfig self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.responseFormat != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, ResponseFormat$$serializer.INSTANCE, self.responseFormat);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.responseMimeType != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.responseMimeType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.temperature != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, FloatSerializer.INSTANCE, self.temperature);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.topP != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, FloatSerializer.INSTANCE, self.topP);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.topK != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, IntSerializer.INSTANCE, self.topK);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.responseModalities == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, (SerializationStrategy) lazyArr[5].getValue(), self.responseModalities);
    }

    public GenerationConfig(ResponseFormat responseFormat, String str, Float f, Float f2, Integer num, List<String> list) {
        this.responseFormat = responseFormat;
        this.responseMimeType = str;
        this.temperature = f;
        this.topP = f2;
        this.topK = num;
        this.responseModalities = list;
    }

    public /* synthetic */ GenerationConfig(ResponseFormat responseFormat, String str, Float f, Float f2, Integer num, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : responseFormat, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : f, (i & 8) != 0 ? null : f2, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : list);
    }

    public final ResponseFormat getResponseFormat() {
        return this.responseFormat;
    }

    public final String getResponseMimeType() {
        return this.responseMimeType;
    }

    public final Float getTemperature() {
        return this.temperature;
    }

    public final Float getTopP() {
        return this.topP;
    }

    public final Integer getTopK() {
        return this.topK;
    }

    public final List<String> getResponseModalities() {
        return this.responseModalities;
    }
}
