package com.example.api;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: GoogleBooksApiService.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"com/example/api/VolumeInfo.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/example/api/VolumeInfo;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
public final /* synthetic */ class VolumeInfo$$serializer implements GeneratedSerializer<VolumeInfo> {
    public static final int $stable;
    public static final VolumeInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    private VolumeInfo$$serializer() {
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        VolumeInfo$$serializer volumeInfo$$serializer = new VolumeInfo$$serializer();
        INSTANCE = volumeInfo$$serializer;
        $stable = 8;
        SerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.example.api.VolumeInfo", volumeInfo$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("subtitle", true);
        pluginGeneratedSerialDescriptor.addElement("authors", true);
        pluginGeneratedSerialDescriptor.addElement("description", true);
        pluginGeneratedSerialDescriptor.addElement("categories", true);
        pluginGeneratedSerialDescriptor.addElement("imageLinks", true);
        pluginGeneratedSerialDescriptor.addElement("publisher", true);
        pluginGeneratedSerialDescriptor.addElement("publishedDate", true);
        pluginGeneratedSerialDescriptor.addElement("pageCount", true);
        pluginGeneratedSerialDescriptor.addElement("language", true);
        pluginGeneratedSerialDescriptor.addElement("averageRating", true);
        pluginGeneratedSerialDescriptor.addElement("ratingsCount", true);
        pluginGeneratedSerialDescriptor.addElement("industryIdentifiers", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer<?>[] childSerializers() {
        Lazy[] lazyArr = VolumeInfo.$childSerializers;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable((KSerializer) lazyArr[2].getValue()), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable((KSerializer) lazyArr[4].getValue()), BuiltinSerializersKt.getNullable(ImageLinks$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(DoubleSerializer.INSTANCE), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable((KSerializer) lazyArr[12].getValue())};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX INFO: renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final VolumeInfo m152deserialize(Decoder decoder) throws UnknownFieldException {
        int i;
        List list;
        String str;
        Integer num;
        String str2;
        Integer num2;
        String str3;
        ImageLinks imageLinks;
        Double d;
        String str4;
        List list2;
        String str5;
        List list3;
        String str6;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = VolumeInfo.$childSerializers;
        String str7 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, (Object) null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, (Object) null);
            List list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), (Object) null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, (Object) null);
            List list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), (Object) null);
            ImageLinks imageLinks2 = (ImageLinks) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, ImageLinks$$serializer.INSTANCE, (Object) null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, (Object) null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, (Object) null);
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, IntSerializer.INSTANCE, (Object) null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, (Object) null);
            Double d2 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, DoubleSerializer.INSTANCE, (Object) null);
            i = 8191;
            str = str9;
            num = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, IntSerializer.INSTANCE, (Object) null);
            str6 = str8;
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, (DeserializationStrategy) lazyArr[12].getValue(), (Object) null);
            d = d2;
            str2 = str13;
            str3 = str12;
            str4 = str11;
            imageLinks = imageLinks2;
            str5 = str10;
            num2 = num3;
            list2 = list5;
            list3 = list4;
        } else {
            int i3 = 12;
            int i4 = 0;
            List list6 = null;
            String str14 = null;
            List list7 = null;
            Integer num4 = null;
            String str15 = null;
            Integer num5 = null;
            String str16 = null;
            ImageLinks imageLinks3 = null;
            Double d3 = null;
            int i5 = 4;
            int i6 = 2;
            boolean z = true;
            String str17 = null;
            List list8 = null;
            String str18 = null;
            while (z) {
                int i7 = i3;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        list7 = list7;
                        list6 = list6;
                        i6 = 2;
                        i5 = 4;
                        i4 = i4;
                        i3 = 12;
                        break;
                    case 0:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str7);
                        i4 |= 1;
                        list7 = list7;
                        list6 = list6;
                        i3 = 12;
                        i6 = 2;
                        i5 = 4;
                        break;
                    case 1:
                        str7 = str7;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str14);
                        i2 = i4 | 2;
                        list7 = list7;
                        i3 = 12;
                        i6 = 2;
                        i5 = 4;
                        i4 = i2;
                        str7 = str7;
                        break;
                    case 2:
                        list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, (DeserializationStrategy) lazyArr[i6].getValue(), list6);
                        i2 = i4 | 4;
                        list7 = list7;
                        i3 = 12;
                        i5 = 4;
                        i4 = i2;
                        str7 = str7;
                        break;
                    case 3:
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str18);
                        i2 = i4 | 8;
                        list7 = list7;
                        i3 = 12;
                        i5 = 4;
                        i4 = i2;
                        str7 = str7;
                        break;
                    case 4:
                        list8 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, (DeserializationStrategy) lazyArr[i5].getValue(), list8);
                        i2 = i4 | 16;
                        list7 = list7;
                        i3 = 12;
                        i4 = i2;
                        str7 = str7;
                        break;
                    case 5:
                        imageLinks3 = (ImageLinks) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, ImageLinks$$serializer.INSTANCE, imageLinks3);
                        i2 = i4 | 32;
                        list7 = list7;
                        i3 = 12;
                        i4 = i2;
                        str7 = str7;
                        break;
                    case 6:
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str17);
                        i2 = i4 | 64;
                        list7 = list7;
                        i3 = 12;
                        i4 = i2;
                        str7 = str7;
                        break;
                    case 7:
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str16);
                        i2 = i4 | UserVerificationMethods.USER_VERIFY_PATTERN;
                        list7 = list7;
                        i3 = 12;
                        i4 = i2;
                        str7 = str7;
                        break;
                    case 8:
                        num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, IntSerializer.INSTANCE, num5);
                        i2 = i4 | UserVerificationMethods.USER_VERIFY_HANDPRINT;
                        list7 = list7;
                        i3 = 12;
                        i4 = i2;
                        str7 = str7;
                        break;
                    case 9:
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str15);
                        i2 = i4 | UserVerificationMethods.USER_VERIFY_NONE;
                        list7 = list7;
                        i3 = 12;
                        i4 = i2;
                        str7 = str7;
                        break;
                    case 10:
                        d3 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, DoubleSerializer.INSTANCE, d3);
                        i2 = i4 | UserVerificationMethods.USER_VERIFY_ALL;
                        list7 = list7;
                        i3 = 12;
                        i4 = i2;
                        str7 = str7;
                        break;
                    case 11:
                        num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, IntSerializer.INSTANCE, num4);
                        i2 = i4 | 2048;
                        list7 = list7;
                        i3 = 12;
                        i4 = i2;
                        str7 = str7;
                        break;
                    case 12:
                        str7 = str7;
                        list7 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i7, (DeserializationStrategy) lazyArr[i7].getValue(), list7);
                        i4 |= 4096;
                        i3 = i7;
                        str7 = str7;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i4;
            list = list7;
            str = str14;
            num = num4;
            str2 = str15;
            num2 = num5;
            str3 = str16;
            imageLinks = imageLinks3;
            d = d3;
            str4 = str17;
            list2 = list8;
            str5 = str18;
            list3 = list6;
            str6 = str7;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new VolumeInfo(i, str6, str, list3, str5, list2, imageLinks, str4, str3, num2, str2, d, num, list, (SerializationConstructorMarker) null);
    }

    public final void serialize(Encoder encoder, VolumeInfo value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        VolumeInfo.write$Self$app(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
