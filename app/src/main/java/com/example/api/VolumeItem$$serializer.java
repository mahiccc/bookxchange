package com.example.api;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: GoogleBooksApiService.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"com/example/api/VolumeItem.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/example/api/VolumeItem;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
public final /* synthetic */ class VolumeItem$$serializer implements GeneratedSerializer<VolumeItem> {
    public static final int $stable;
    public static final VolumeItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    private VolumeItem$$serializer() {
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        VolumeItem$$serializer volumeItem$$serializer = new VolumeItem$$serializer();
        INSTANCE = volumeItem$$serializer;
        $stable = 8;
        SerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.example.api.VolumeItem", volumeItem$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("volumeInfo", true);
        pluginGeneratedSerialDescriptor.addElement("saleInfo", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(VolumeInfo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(SaleInfo$$serializer.INSTANCE)};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX INFO: renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final VolumeItem m153deserialize(Decoder decoder) throws UnknownFieldException {
        int i;
        String str;
        VolumeInfo volumeInfo;
        SaleInfo saleInfo;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String str2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, (Object) null);
            VolumeInfo volumeInfo2 = (VolumeInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, VolumeInfo$$serializer.INSTANCE, (Object) null);
            str = str3;
            saleInfo = (SaleInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, SaleInfo$$serializer.INSTANCE, (Object) null);
            volumeInfo = volumeInfo2;
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            VolumeInfo volumeInfo3 = null;
            SaleInfo saleInfo2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    volumeInfo3 = (VolumeInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, VolumeInfo$$serializer.INSTANCE, volumeInfo3);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    saleInfo2 = (SaleInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, SaleInfo$$serializer.INSTANCE, saleInfo2);
                    i2 |= 4;
                }
            }
            i = i2;
            str = str2;
            volumeInfo = volumeInfo3;
            saleInfo = saleInfo2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new VolumeItem(i, str, volumeInfo, saleInfo, (SerializationConstructorMarker) null);
    }

    public final void serialize(Encoder encoder, VolumeItem value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        VolumeItem.write$Self$app(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
