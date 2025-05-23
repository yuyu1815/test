/*    */ package ai.grazie.gec.model.problem;
/*    */ 
/*    */ import ai.grazie.gec.model.CorrectionServiceType;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
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
/*    */ @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gec/model/problem/Problem.KindInfo.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gec/model/problem/Problem$KindInfo;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-gec"})
/*    */ public final class $serializer
/*    */   implements GeneratedSerializer<Problem.KindInfo>
/*    */ {
/*    */   @NotNull
/* 51 */   public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[6]; arrayOfKSerializer[0] = (KSerializer)ProblemKindID.Serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)Category.Serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)CorrectionServiceType.Serializer.INSTANCE; arrayOfKSerializer[3] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer[4] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer[5] = (KSerializer)Problem.Confidence.Serializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public Problem.KindInfo deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; ProblemKindID problemKindID = null; Category category = null; CorrectionServiceType correctionServiceType = null; String str1 = null, str2 = null; Problem.Confidence confidence = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { problemKindID = (ProblemKindID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)ProblemKindID.Serializer.INSTANCE, problemKindID); i |= 0x1; category = (Category)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Category.Serializer.INSTANCE, category); i |= 0x2; correctionServiceType = (CorrectionServiceType)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)CorrectionServiceType.Serializer.INSTANCE, correctionServiceType); i |= 0x4; str1 = compositeDecoder.decodeStringElement(serialDescriptor, 3); i |= 0x8; str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)StringSerializer.INSTANCE, str2); i |= 0x10; confidence = (Problem.Confidence)compositeDecoder.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy)Problem.Confidence.Serializer.INSTANCE, confidence); i |= 0x20; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: problemKindID = (ProblemKindID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)ProblemKindID.Serializer.INSTANCE, problemKindID); i |= 0x1; continue;case 1: category = (Category)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Category.Serializer.INSTANCE, category); i |= 0x2; continue;case 2: correctionServiceType = (CorrectionServiceType)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)CorrectionServiceType.Serializer.INSTANCE, correctionServiceType); i |= 0x4; continue;case 3: str1 = compositeDecoder.decodeStringElement(serialDescriptor, 3); i |= 0x8; continue;case 4: str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)StringSerializer.INSTANCE, str2); i |= 0x10; continue;case 5: confidence = (Problem.Confidence)compositeDecoder.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy)Problem.Confidence.Serializer.INSTANCE, confidence); i |= 0x20; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new Problem.KindInfo(i, problemKindID, category, correctionServiceType, str1, str2, confidence, null); } public void serialize(@NotNull Encoder encoder, @NotNull Problem.KindInfo value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); Problem.KindInfo.write$Self$model_gec(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gec.model.problem.Problem.KindInfo", INSTANCE, 6); pluginGeneratedSerialDescriptor.addElement("id", false); pluginGeneratedSerialDescriptor.addElement("category", false); pluginGeneratedSerialDescriptor.addElement("service", false); pluginGeneratedSerialDescriptor.addElement("displayName", false); pluginGeneratedSerialDescriptor.addElement("ruleSettingsId", true); pluginGeneratedSerialDescriptor.addElement("confidence", true); descriptor = pluginGeneratedSerialDescriptor; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-gec-jvm-0.4.32.jar!\ai\grazie\gec\model\problem\Problem$KindInfo$$serializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */