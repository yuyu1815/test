/*    */ package ai.grazie.user.cfg.model.utils;
/*    */ 
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.BooleanSerializer;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.IntSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/user/cfg/model/utils/Keystroke.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/user/cfg/model/utils/Keystroke;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "user-cfg-model"})
/*    */ public final class $serializer
/*    */   implements GeneratedSerializer<Keystroke>
/*    */ {
/*    */   @NotNull
/* 32 */   public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[6]; arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)IntSerializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)BooleanSerializer.INSTANCE; arrayOfKSerializer[3] = (KSerializer)BooleanSerializer.INSTANCE; arrayOfKSerializer[4] = (KSerializer)BooleanSerializer.INSTANCE; arrayOfKSerializer[5] = (KSerializer)BooleanSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public Keystroke deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str = null; int j = 0; boolean bool1 = false, bool2 = false, bool3 = false, bool4 = false; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { str = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; j = compositeDecoder.decodeIntElement(serialDescriptor, 1); i |= 0x2; bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 2); i |= 0x4; bool2 = compositeDecoder.decodeBooleanElement(serialDescriptor, 3); i |= 0x8; bool3 = compositeDecoder.decodeBooleanElement(serialDescriptor, 4); i |= 0x10; bool4 = compositeDecoder.decodeBooleanElement(serialDescriptor, 5); i |= 0x20; } else { while (bool) { int k = compositeDecoder.decodeElementIndex(serialDescriptor); switch (k) { case -1: bool = false; continue;case 0: str = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; continue;case 1: j = compositeDecoder.decodeIntElement(serialDescriptor, 1); i |= 0x2; continue;case 2: bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 2); i |= 0x4; continue;case 3: bool2 = compositeDecoder.decodeBooleanElement(serialDescriptor, 3); i |= 0x8; continue;case 4: bool3 = compositeDecoder.decodeBooleanElement(serialDescriptor, 4); i |= 0x10; continue;case 5: bool4 = compositeDecoder.decodeBooleanElement(serialDescriptor, 5); i |= 0x20; continue; }  throw new UnknownFieldException(k); }  }  compositeDecoder.endStructure(serialDescriptor); return new Keystroke(i, str, j, bool1, bool2, bool3, bool4, null); } public void serialize(@NotNull Encoder encoder, @NotNull Keystroke value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); Keystroke.write$Self$user_cfg_model(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.user.cfg.model.utils.Keystroke", INSTANCE, 6); pluginGeneratedSerialDescriptor.addElement("key", false); pluginGeneratedSerialDescriptor.addElement("modifiers", true); pluginGeneratedSerialDescriptor.addElement("shift", true); pluginGeneratedSerialDescriptor.addElement("ctrl", true); pluginGeneratedSerialDescriptor.addElement("alt", true); pluginGeneratedSerialDescriptor.addElement("meta", true); descriptor = pluginGeneratedSerialDescriptor; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\user-cfg-model-jvm-0.4.32.jar!\ai\grazi\\user\cfg\mode\\utils\Keystroke$$serializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */