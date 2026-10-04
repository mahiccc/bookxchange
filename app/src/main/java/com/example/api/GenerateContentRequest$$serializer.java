package com.example.api;

import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: compiled from: GeminiApiService.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"com/example/api/GenerateContentRequest.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/example/api/GenerateContentRequest;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
public final /* synthetic */ class GenerateContentRequest$$serializer implements GeneratedSerializer<GenerateContentRequest> {
    public static final int $stable;
    public static final GenerateContentRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    private GenerateContentRequest$$serializer() {
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        GenerateContentRequest$$serializer generateContentRequest$$serializer = new GenerateContentRequest$$serializer();
        INSTANCE = generateContentRequest$$serializer;
        $stable = 8;
        SerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.example.api.GenerateContentRequest", generateContentRequest$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("contents", false);
        pluginGeneratedSerialDescriptor.addElement("generationConfig", true);
        pluginGeneratedSerialDescriptor.addElement("tools", true);
        pluginGeneratedSerialDescriptor.addElement("systemInstruction", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        Lazy[] lazyArr = GenerateContentRequest.$childSerializers;
        return new KSerializer[]{lazyArr[0].getValue(), BuiltinSerializersKt.getNullable(GenerationConfig$$serializer.INSTANCE), BuiltinSerializersKt.getNullable((KSerializer) lazyArr[2].getValue()), BuiltinSerializersKt.getNullable(Content$$serializer.INSTANCE)};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX INFO: renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final GenerateContentRequest m138deserialize(Decoder decoder) throws UnknownFieldException {
        int i;
        List list;
        GenerationConfig generationConfig;
        List list2;
        Content content;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = GenerateContentRequest.$childSerializers;
        List list3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), (Object) null);
            GenerationConfig generationConfig2 = (GenerationConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, GenerationConfig$$serializer.INSTANCE, (Object) null);
            list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), (Object) null);
            list = list4;
            content = (Content) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, Content$$serializer.INSTANCE, (Object) null);
            i = 15;
            generationConfig = generationConfig2;
        } else {
            boolean z = true;
            int i2 = 0;
            GenerationConfig generationConfig3 = null;
            List list5 = null;
            Content content2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), list3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    generationConfig3 = (GenerationConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, GenerationConfig$$serializer.INSTANCE, generationConfig3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), list5);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    content2 = (Content) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, Content$$serializer.INSTANCE, content2);
                    i2 |= 8;
                }
            }
            i = i2;
            list = list3;
            generationConfig = generationConfig3;
            list2 = list5;
            content = content2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new GenerateContentRequest(i, list, generationConfig, list2, content, (SerializationConstructorMarker) null);
    }

    public final void serialize(Encoder encoder, GenerateContentRequest value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        GenerateContentRequest.write$Self$app(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
