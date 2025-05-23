/*     */ package ai.grazie.qa;
/*     */ 
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ReplaceWith;
/*     */ import kotlin.jvm.JvmField;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.SerialName;
/*     */ import kotlinx.serialization.Serializable;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.UnknownFieldException;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.ArrayListSerializer;
/*     */ import kotlinx.serialization.internal.DoubleSerializer;
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
/*     */ import kotlinx.serialization.internal.LinkedHashMapSerializer;
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*     */ import kotlinx.serialization.internal.StringSerializer;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Serializable
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020 \n\002\020$\n\002\020\016\n\002\b\002\n\002\020\006\n\000\n\002\030\002\n\002\b\017\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 )2\0020\001:\002()B]\b\021\022\006\020\002\032\0020\003\022\032\020\004\032\026\022\020\022\016\022\004\022\0020\007\022\004\022\0020\0070\006\030\0010\005\022\034\b\001\020\b\032\026\022\020\022\016\022\004\022\0020\007\022\004\022\0020\0070\006\030\0010\005\022\b\b\001\020\t\032\0020\n\022\b\020\013\032\004\030\0010\f¢\006\002\020\rBA\022\030\020\004\032\024\022\020\022\016\022\004\022\0020\007\022\004\022\0020\0070\0060\005\022\030\020\b\032\024\022\020\022\016\022\004\022\0020\007\022\004\022\0020\0070\0060\005\022\006\020\t\032\0020\n¢\006\002\020\016J\033\020\027\032\024\022\020\022\016\022\004\022\0020\007\022\004\022\0020\0070\0060\005HÆ\003J\033\020\030\032\024\022\020\022\016\022\004\022\0020\007\022\004\022\0020\0070\0060\005HÆ\003J\t\020\031\032\0020\nHÆ\003JK\020\032\032\0020\0002\032\b\002\020\004\032\024\022\020\022\016\022\004\022\0020\007\022\004\022\0020\0070\0060\0052\032\b\002\020\b\032\024\022\020\022\016\022\004\022\0020\007\022\004\022\0020\0070\0060\0052\b\b\002\020\t\032\0020\nHÆ\001J\023\020\033\032\0020\0342\b\020\035\032\004\030\0010\001HÖ\003J\t\020\036\032\0020\003HÖ\001J\t\020\037\032\0020\007HÖ\001J&\020 \032\0020!2\006\020\"\032\0020\0002\006\020#\032\0020$2\006\020%\032\0020&HÁ\001¢\006\002\b'R.\020\b\032\024\022\020\022\016\022\004\022\0020\007\022\004\022\0020\0070\0060\0058\006X\004¢\006\016\n\000\022\004\b\017\020\020\032\004\b\021\020\022R\034\020\t\032\0020\n8\006X\004¢\006\016\n\000\022\004\b\023\020\020\032\004\b\024\020\025R#\020\004\032\024\022\020\022\016\022\004\022\0020\007\022\004\022\0020\0070\0060\005¢\006\b\n\000\032\004\b\026\020\022¨\006*"}, d2 = {"Lai/grazie/qa/ExtractWebResponse;", "", "seen1", "", "results", "", "", "", "failedResults", "responseTime", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/util/List;DLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;Ljava/util/List;D)V", "getFailedResults$annotations", "()V", "getFailedResults", "()Ljava/util/List;", "getResponseTime$annotations", "getResponseTime", "()D", "getResults", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_qa", "$serializer", "Companion", "model-qa"})
/*     */ public final class ExtractWebResponse
/*     */ {
/*     */   @NotNull
/*     */   private final List<Map<String, String>> results;
/*     */   @NotNull
/*     */   private final List<Map<String, String>> failedResults;
/*     */   private final double responseTime;
/*     */   @NotNull
/* 126 */   public static final Companion Companion = new Companion(null); @JvmField
/*     */   @NotNull
/*     */   private static final KSerializer<Object>[] $childSerializers; public ExtractWebResponse(@NotNull List<Map<String, String>> results, @NotNull List<Map<String, String>> failedResults, double responseTime) {
/* 129 */     this.results = results;
/* 130 */     this.failedResults = failedResults;
/* 131 */     this.responseTime = responseTime; } public final double getResponseTime() { return this.responseTime; }
/*     */ 
/*     */   
/*     */   static {
/*     */     KSerializer[] arrayOfKSerializer = new KSerializer[3];
/*     */     arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)new LinkedHashMapSerializer((KSerializer)StringSerializer.INSTANCE, (KSerializer)StringSerializer.INSTANCE));
/*     */     arrayOfKSerializer[1] = (KSerializer)new ArrayListSerializer((KSerializer)new LinkedHashMapSerializer((KSerializer)StringSerializer.INSTANCE, (KSerializer)StringSerializer.INSTANCE));
/*     */     arrayOfKSerializer[2] = null;
/*     */     $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*     */   }
/*     */   
/*     */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/qa/ExtractWebResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/qa/ExtractWebResponse;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-qa"})
/*     */   public static final class $serializer implements GeneratedSerializer<ExtractWebResponse> {
/*     */     @NotNull
/*     */     public static final $serializer INSTANCE = new $serializer();
/*     */     
/*     */     @NotNull
/*     */     public KSerializer<?>[] typeParametersSerializers() {
/*     */       return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public SerialDescriptor getDescriptor() {
/*     */       return (SerialDescriptor)descriptor;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public KSerializer<?>[] childSerializers() {
/*     */       KSerializer[] arrayOfKSerializer1 = (KSerializer[])ExtractWebResponse.$childSerializers, arrayOfKSerializer2 = new KSerializer[3];
/*     */       arrayOfKSerializer2[0] = arrayOfKSerializer1[0];
/*     */       arrayOfKSerializer2[1] = arrayOfKSerializer1[1];
/*     */       arrayOfKSerializer2[2] = (KSerializer)DoubleSerializer.INSTANCE;
/*     */       return (KSerializer<?>[])arrayOfKSerializer2;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public ExtractWebResponse deserialize(@NotNull Decoder decoder) {
/*     */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */       SerialDescriptor serialDescriptor = getDescriptor();
/*     */       boolean bool = true;
/*     */       int i = 0;
/*     */       List list1 = null, list2 = null;
/*     */       double d = 0.0D;
/*     */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */       KSerializer[] arrayOfKSerializer = (KSerializer[])ExtractWebResponse.$childSerializers;
/*     */       if (compositeDecoder.decodeSequentially()) {
/*     */         list1 = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list1);
/*     */         i |= 0x1;
/*     */         list2 = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], list2);
/*     */         i |= 0x2;
/*     */         d = compositeDecoder.decodeDoubleElement(serialDescriptor, 2);
/*     */         i |= 0x4;
/*     */       } else {
/*     */         while (bool) {
/*     */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */           switch (j) {
/*     */             case -1:
/*     */               bool = false;
/*     */               continue;
/*     */             case 0:
/*     */               list1 = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list1);
/*     */               i |= 0x1;
/*     */               continue;
/*     */             case 1:
/*     */               list2 = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], list2);
/*     */               i |= 0x2;
/*     */               continue;
/*     */             case 2:
/*     */               d = compositeDecoder.decodeDoubleElement(serialDescriptor, 2);
/*     */               i |= 0x4;
/*     */               continue;
/*     */           } 
/*     */           throw new UnknownFieldException(j);
/*     */         } 
/*     */       } 
/*     */       compositeDecoder.endStructure(serialDescriptor);
/*     */       return new ExtractWebResponse(i, list1, list2, d, null);
/*     */     }
/*     */     
/*     */     public void serialize(@NotNull Encoder encoder, @NotNull ExtractWebResponse value) {
/*     */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */       Intrinsics.checkNotNullParameter(value, "value");
/*     */       SerialDescriptor serialDescriptor = getDescriptor();
/*     */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */       ExtractWebResponse.write$Self$model_qa(value, compositeEncoder, serialDescriptor);
/*     */       compositeEncoder.endStructure(serialDescriptor);
/*     */     }
/*     */     
/*     */     static {
/*     */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.qa.ExtractWebResponse", INSTANCE, 3);
/*     */       pluginGeneratedSerialDescriptor.addElement("results", false);
/*     */       pluginGeneratedSerialDescriptor.addElement("failed_results", false);
/*     */       pluginGeneratedSerialDescriptor.addElement("response_time", false);
/*     */       descriptor = pluginGeneratedSerialDescriptor;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/qa/ExtractWebResponse$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/qa/ExtractWebResponse;", "model-qa"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final KSerializer<ExtractWebResponse> serializer() {
/*     */       return (KSerializer<ExtractWebResponse>)ExtractWebResponse.$serializer.INSTANCE;
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<Map<String, String>> getResults() {
/*     */     return this.results;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<Map<String, String>> getFailedResults() {
/*     */     return this.failedResults;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<Map<String, String>> component1() {
/*     */     return this.results;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<Map<String, String>> component2() {
/*     */     return this.failedResults;
/*     */   }
/*     */   
/*     */   public final double component3() {
/*     */     return this.responseTime;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ExtractWebResponse copy(@NotNull List<? extends Map<String, String>> results, @NotNull List<? extends Map<String, String>> failedResults, double responseTime) {
/*     */     Intrinsics.checkNotNullParameter(results, "results");
/*     */     Intrinsics.checkNotNullParameter(failedResults, "failedResults");
/*     */     return new ExtractWebResponse(results, failedResults, responseTime);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "ExtractWebResponse(results=" + this.results + ", failedResults=" + this.failedResults + ", responseTime=" + this.responseTime + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.results.hashCode();
/*     */     result = result * 31 + this.failedResults.hashCode();
/*     */     return result * 31 + Double.hashCode(this.responseTime);
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof ExtractWebResponse))
/*     */       return false; 
/*     */     ExtractWebResponse extractWebResponse = (ExtractWebResponse)other;
/*     */     return !Intrinsics.areEqual(this.results, extractWebResponse.results) ? false : (!Intrinsics.areEqual(this.failedResults, extractWebResponse.failedResults) ? false : (!(Double.compare(this.responseTime, extractWebResponse.responseTime) != 0)));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-qa-jvm-0.4.32.jar!\ai\grazie\qa\ExtractWebResponse.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */