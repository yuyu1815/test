/*    */ package ai.grazie.qa;
/*    */ import ai.grazie.model.cloud.sse.continuous.Data;
/*    */ import ai.grazie.model.cloud.sse.continuous.events.type.ContinuousSSEEventType;
/*    */ import java.util.Arrays;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.ReferenceArraySerializer;
/*    */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000T\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\021\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\022\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 /2\0020\001:\002./BY\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\016\020\006\032\n\022\004\022\0020\b\030\0010\007\022\016\020\t\032\n\022\004\022\0020\n\030\0010\007\022\b\020\013\032\004\030\0010\n\022\b\020\f\032\004\030\0010\n\022\b\020\r\032\004\030\0010\016¢\006\002\020\017B9\022\016\020\006\032\n\022\004\022\0020\b\030\0010\007\022\016\020\t\032\n\022\004\022\0020\n\030\0010\007\022\b\020\013\032\004\030\0010\n\022\b\020\f\032\004\030\0010\n¢\006\002\020\020J\026\020\032\032\n\022\004\022\0020\b\030\0010\007HÆ\003¢\006\002\020\022J\026\020\033\032\n\022\004\022\0020\n\030\0010\007HÆ\003¢\006\002\020\030J\013\020\034\032\004\030\0010\nHÆ\003J\013\020\035\032\004\030\0010\nHÆ\003JJ\020\036\032\0020\0002\020\b\002\020\006\032\n\022\004\022\0020\b\030\0010\0072\020\b\002\020\t\032\n\022\004\022\0020\n\030\0010\0072\n\b\002\020\013\032\004\030\0010\n2\n\b\002\020\f\032\004\030\0010\nHÆ\001¢\006\002\020\037J\023\020 \032\0020!2\b\020\"\032\004\030\0010#H\002J\b\020$\032\0020\003H\026J\t\020%\032\0020\nHÖ\001J&\020&\032\0020'2\006\020(\032\0020\0002\006\020)\032\0020*2\006\020+\032\0020,HÁ\001¢\006\002\b-R\033\020\006\032\n\022\004\022\0020\b\030\0010\007¢\006\n\n\002\020\023\032\004\b\021\020\022R\023\020\013\032\004\030\0010\n¢\006\b\n\000\032\004\b\024\020\025R\023\020\f\032\004\030\0010\n¢\006\b\n\000\032\004\b\026\020\025R\033\020\t\032\n\022\004\022\0020\n\030\0010\007¢\006\n\n\002\020\031\032\004\b\027\020\030¨\0060"}, d2 = {"Lai/grazie/qa/QAAnswersChunk;", "Lai/grazie/model/cloud/sse/continuous/Data;", "seen1", "", "type", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;", "documents", "", "Lai/grazie/qa/QADocument;", "summaryReferences", "", "summaryChunk", "summaryChunkType", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;[Lai/grazie/qa/QADocument;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "([Lai/grazie/qa/QADocument;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDocuments", "()[Lai/grazie/qa/QADocument;", "[Lai/grazie/qa/QADocument;", "getSummaryChunk", "()Ljava/lang/String;", "getSummaryChunkType", "getSummaryReferences", "()[Ljava/lang/String;", "[Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "([Lai/grazie/qa/QADocument;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lai/grazie/qa/QAAnswersChunk;", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_qa", "$serializer", "Companion", "model-qa"})
/*    */ public final class QAAnswersChunk extends Data {
/*    */   @NotNull
/* 32 */   public static final Companion Companion = new Companion(null); @Nullable private final QADocument[] documents; @Nullable private final String[] summaryReferences; static { KSerializer[] arrayOfKSerializer = new KSerializer[5]; arrayOfKSerializer[0] = ContinuousSSEEventType.Companion.serializer(); arrayOfKSerializer[1] = (KSerializer)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(QADocument.class), (KSerializer)QADocument.$serializer.INSTANCE); arrayOfKSerializer[2] = (KSerializer)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(String.class), (KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer[3] = null; arrayOfKSerializer[4] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Nullable private final String summaryChunk; @Nullable private final String summaryChunkType; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/qa/QAAnswersChunk.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/qa/QAAnswersChunk;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-qa"}) public static final class $serializer implements GeneratedSerializer<QAAnswersChunk> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])QAAnswersChunk.$childSerializers, arrayOfKSerializer2 = new KSerializer[5]; arrayOfKSerializer2[0] = arrayOfKSerializer1[0]; arrayOfKSerializer2[1] = BuiltinSerializersKt.getNullable(arrayOfKSerializer1[1]); arrayOfKSerializer2[2] = BuiltinSerializersKt.getNullable(arrayOfKSerializer1[2]); arrayOfKSerializer2[3] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer2[4] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE); return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public QAAnswersChunk deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; ContinuousSSEEventType continuousSSEEventType = null; QADocument[] arrayOfQADocument = null; String arrayOfString[] = null, str1 = null, str2 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])QAAnswersChunk.$childSerializers; if (compositeDecoder.decodeSequentially()) { continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType); i |= 0x1; arrayOfQADocument = (QADocument[])compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], arrayOfQADocument); i |= 0x2; arrayOfString = (String[])compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], arrayOfString); i |= 0x4; str1 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)StringSerializer.INSTANCE, str1); i |= 0x8; str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)StringSerializer.INSTANCE, str2); i |= 0x10; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType); i |= 0x1; continue;case 1: arrayOfQADocument = (QADocument[])compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], arrayOfQADocument); i |= 0x2; continue;case 2: arrayOfString = (String[])compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], arrayOfString); i |= 0x4; continue;case 3: str1 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)StringSerializer.INSTANCE, str1); i |= 0x8; continue;case 4: str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)StringSerializer.INSTANCE, str2); i |= 0x10; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new QAAnswersChunk(i, continuousSSEEventType, arrayOfQADocument, arrayOfString, str1, str2, null); } public void serialize(@NotNull Encoder encoder, @NotNull QAAnswersChunk value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); QAAnswersChunk.write$Self$model_qa(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.qa.QAAnswersChunk", INSTANCE, 5); pluginGeneratedSerialDescriptor.addElement("event_type", true); pluginGeneratedSerialDescriptor.addElement("documents", false); pluginGeneratedSerialDescriptor.addElement("summaryReferences", false); pluginGeneratedSerialDescriptor.addElement("summaryChunk", false); pluginGeneratedSerialDescriptor.addElement("summaryChunkType", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/qa/QAAnswersChunk$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/qa/QAAnswersChunk;", "model-qa"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<QAAnswersChunk> serializer() { return (KSerializer<QAAnswersChunk>)QAAnswersChunk.$serializer.INSTANCE; }
/*    */      }
/*    */   @Nullable
/* 35 */   public final QADocument[] getDocuments() { return this.documents; } @Nullable
/* 36 */   public final String[] getSummaryReferences() { return this.summaryReferences; } @Nullable
/* 37 */   public final String getSummaryChunk() { return this.summaryChunk; } @Nullable
/* 38 */   public final String getSummaryChunkType() { return this.summaryChunkType; } public QAAnswersChunk(@Nullable QADocument[] documents, @Nullable String[] summaryReferences, @Nullable String summaryChunk, @Nullable String summaryChunkType) { this.documents = documents; this.summaryReferences = summaryReferences; this.summaryChunk = summaryChunk; this.summaryChunkType = summaryChunkType; }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/* 41 */     if (this == other) return true; 
/* 42 */     if (other == null || getClass() != other.getClass()) return false;
/*    */     
/* 44 */     (QAAnswersChunk)other;
/*    */     
/* 46 */     if (this.documents != null)
/* 47 */     { if (((QAAnswersChunk)other).documents == null) return false; 
/* 48 */       if (!Arrays.equals((Object[])this.documents, (Object[])((QAAnswersChunk)other).documents)) return false;  }
/* 49 */     else if (((QAAnswersChunk)other).documents != null) { return false; }
/* 50 */      if (this.summaryReferences != null)
/* 51 */     { if (((QAAnswersChunk)other).summaryReferences == null) return false; 
/* 52 */       if (!Arrays.equals((Object[])this.summaryReferences, (Object[])((QAAnswersChunk)other).summaryReferences)) return false;  }
/* 53 */     else if (((QAAnswersChunk)other).summaryReferences != null) { return false; }
/* 54 */      if (!Intrinsics.areEqual(this.summaryChunk, ((QAAnswersChunk)other).summaryChunk)) return false; 
/* 55 */     if (!Intrinsics.areEqual(this.summaryChunkType, ((QAAnswersChunk)other).summaryChunkType)) return false; 
/* 56 */     return true;
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 60 */     int result = (this.documents != null) ? Arrays.hashCode((Object[])this.documents) : 0;
/* 61 */     result = 31 * result + ((this.summaryReferences != null) ? Arrays.hashCode((Object[])this.summaryReferences) : 0);
/* 62 */     result = 31 * result + ((this.summaryChunk != null) ? this.summaryChunk.hashCode() : 0);
/* 63 */     result = 31 * result + ((this.summaryChunkType != null) ? this.summaryChunkType.hashCode() : 0);
/* 64 */     return result;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final QADocument[] component1() {
/*    */     return this.documents;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String[] component2() {
/*    */     return this.summaryReferences;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component3() {
/*    */     return this.summaryChunk;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component4() {
/*    */     return this.summaryChunkType;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final QAAnswersChunk copy(@Nullable QADocument[] documents, @Nullable String[] summaryReferences, @Nullable String summaryChunk, @Nullable String summaryChunkType) {
/*    */     return new QAAnswersChunk(documents, summaryReferences, summaryChunk, summaryChunkType);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "QAAnswersChunk(documents=" + Arrays.toString((Object[])this.documents) + ", summaryReferences=" + Arrays.toString((Object[])this.summaryReferences) + ", summaryChunk=" + this.summaryChunk + ", summaryChunkType=" + this.summaryChunkType + ")";
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-qa-jvm-0.4.32.jar!\ai\grazie\qa\QAAnswersChunk.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */