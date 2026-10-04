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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;

/* JADX INFO: compiled from: GeminiApiService.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002+,B?\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bBO\b\u0010\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\n\u0010\u0010J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003JC\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\rHÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001J%\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0001¢\u0006\u0002\b*R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006-"}, d2 = {"Lcom/example/api/GenerateContentRequest;", "", "contents", "", "Lcom/example/api/Content;", "generationConfig", "Lcom/example/api/GenerationConfig;", "tools", "Lkotlinx/serialization/json/JsonObject;", "systemInstruction", "<init>", "(Ljava/util/List;Lcom/example/api/GenerationConfig;Ljava/util/List;Lcom/example/api/Content;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lcom/example/api/GenerationConfig;Ljava/util/List;Lcom/example/api/Content;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getContents", "()Ljava/util/List;", "getGenerationConfig", "()Lcom/example/api/GenerationConfig;", "getTools", "getSystemInstruction", "()Lcom/example/api/Content;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app", "$serializer", "Companion", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@Serializable
public final /* data */ class GenerateContentRequest {
    private final List<Content> contents;
    private final GenerationConfig generationConfig;
    private final Content systemInstruction;
    private final List<JsonObject> tools;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.example.api.GenerateContentRequest$$ExternalSyntheticLambda0
        public final Object invoke() {
            return GenerateContentRequest._childSerializers$_anonymous_();
        }
    }), null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.example.api.GenerateContentRequest$$ExternalSyntheticLambda1
        public final Object invoke() {
            return GenerateContentRequest._childSerializers$_anonymous_$0();
        }
    }), null};

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new ArrayListSerializer(Content$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(JsonObjectSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GenerateContentRequest copy$default(GenerateContentRequest generateContentRequest, List list, GenerationConfig generationConfig, List list2, Content content, int i, Object obj) {
        if ((i & 1) != 0) {
            list = generateContentRequest.contents;
        }
        if ((i & 2) != 0) {
            generationConfig = generateContentRequest.generationConfig;
        }
        if ((i & 4) != 0) {
            list2 = generateContentRequest.tools;
        }
        if ((i & 8) != 0) {
            content = generateContentRequest.systemInstruction;
        }
        return generateContentRequest.copy(list, generationConfig, list2, content);
    }

    public final List<Content> component1() {
        return this.contents;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final GenerationConfig getGenerationConfig() {
        return this.generationConfig;
    }

    public final List<JsonObject> component3() {
        return this.tools;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Content getSystemInstruction() {
        return this.systemInstruction;
    }

    public final GenerateContentRequest copy(List<Content> contents, GenerationConfig generationConfig, List<JsonObject> tools, Content systemInstruction) {
        Intrinsics.checkNotNullParameter(contents, "contents");
        return new GenerateContentRequest(contents, generationConfig, tools, systemInstruction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenerateContentRequest)) {
            return false;
        }
        GenerateContentRequest generateContentRequest = (GenerateContentRequest) other;
        return Intrinsics.areEqual(this.contents, generateContentRequest.contents) && Intrinsics.areEqual(this.generationConfig, generateContentRequest.generationConfig) && Intrinsics.areEqual(this.tools, generateContentRequest.tools) && Intrinsics.areEqual(this.systemInstruction, generateContentRequest.systemInstruction);
    }

    public int hashCode() {
        int iHashCode = this.contents.hashCode() * 31;
        GenerationConfig generationConfig = this.generationConfig;
        int iHashCode2 = (iHashCode + (generationConfig == null ? 0 : generationConfig.hashCode())) * 31;
        List<JsonObject> list = this.tools;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Content content = this.systemInstruction;
        return iHashCode3 + (content != null ? content.hashCode() : 0);
    }

    public String toString() {
        return "GenerateContentRequest(contents=" + this.contents + ", generationConfig=" + this.generationConfig + ", tools=" + this.tools + ", systemInstruction=" + this.systemInstruction + ")";
    }

    /* JADX INFO: compiled from: GeminiApiService.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/example/api/GenerateContentRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/example/api/GenerateContentRequest;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GenerateContentRequest> serializer() {
            return GenerateContentRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GenerateContentRequest(int i, List list, GenerationConfig generationConfig, List list2, Content content, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, GenerateContentRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.contents = list;
        if ((i & 2) == 0) {
            this.generationConfig = null;
        } else {
            this.generationConfig = generationConfig;
        }
        if ((i & 4) == 0) {
            this.tools = null;
        } else {
            this.tools = list2;
        }
        if ((i & 8) == 0) {
            this.systemInstruction = null;
        } else {
            this.systemInstruction = content;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$app(GenerateContentRequest self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, (SerializationStrategy) lazyArr[0].getValue(), self.contents);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.generationConfig != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, GenerationConfig$$serializer.INSTANCE, self.generationConfig);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.tools != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, (SerializationStrategy) lazyArr[2].getValue(), self.tools);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.systemInstruction == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, Content$$serializer.INSTANCE, self.systemInstruction);
    }

    public GenerateContentRequest(List<Content> list, GenerationConfig generationConfig, List<JsonObject> list2, Content content) {
        Intrinsics.checkNotNullParameter(list, "contents");
        this.contents = list;
        this.generationConfig = generationConfig;
        this.tools = list2;
        this.systemInstruction = content;
    }

    public /* synthetic */ GenerateContentRequest(List list, GenerationConfig generationConfig, List list2, Content content, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : generationConfig, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : content);
    }

    public final List<Content> getContents() {
        return this.contents;
    }

    public final GenerationConfig getGenerationConfig() {
        return this.generationConfig;
    }

    public final List<JsonObject> getTools() {
        return this.tools;
    }

    public final Content getSystemInstruction() {
        return this.systemInstruction;
    }
}
