/*    */ package ai.grazie.gec.model.problem;
/*    */ 
/*    */ import ai.grazie.text.TextRange;
/*    */ import ai.grazie.text.TextRange$;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gec/model/problem/ProblemFix.Part.Change.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gec/model/problem/ProblemFix$Part$Change;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-gec"})
/*    */ public final class $serializer
/*    */   implements GeneratedSerializer<ProblemFix.Part.Change>
/*    */ {
/*    */   @NotNull
/* 92 */   public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = ProblemFix.Part.Change.access$get$childSerializers$cp(), arrayOfKSerializer2 = new KSerializer[4]; arrayOfKSerializer2[0] = (KSerializer)TextRange$.serializer.INSTANCE; arrayOfKSerializer2[1] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer2[2] = arrayOfKSerializer1[2]; arrayOfKSerializer2[3] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public ProblemFix.Part.Change deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; TextRange textRange = null; String str1 = null; ProblemFix.Part.PartKind partKind = null; String str2 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = ProblemFix.Part.Change.access$get$childSerializers$cp(); if (compositeDecoder.decodeSequentially()) { textRange = (TextRange)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)TextRange$.serializer.INSTANCE, textRange); i |= 0x1; str1 = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; partKind = (ProblemFix.Part.PartKind)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], partKind); i |= 0x4; str2 = compositeDecoder.decodeStringElement(serialDescriptor, 3); i |= 0x8; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: textRange = (TextRange)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)TextRange$.serializer.INSTANCE, textRange); i |= 0x1; continue;case 1: str1 = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; continue;case 2: partKind = (ProblemFix.Part.PartKind)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], partKind); i |= 0x4; continue;case 3: str2 = compositeDecoder.decodeStringElement(serialDescriptor, 3); i |= 0x8; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new ProblemFix.Part.Change(i, textRange, str1, partKind, str2, null); } public void serialize(@NotNull Encoder encoder, @NotNull ProblemFix.Part.Change value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); ProblemFix.Part.Change.write$Self$model_gec(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("Change", INSTANCE, 4); pluginGeneratedSerialDescriptor.addElement("range", false); pluginGeneratedSerialDescriptor.addElement("text", false); pluginGeneratedSerialDescriptor.addElement("kind", true); pluginGeneratedSerialDescriptor.addElement("display", true); descriptor = pluginGeneratedSerialDescriptor; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-gec-jvm-0.4.32.jar!\ai\grazie\gec\model\problem\ProblemFix$Part$Change$$serializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */