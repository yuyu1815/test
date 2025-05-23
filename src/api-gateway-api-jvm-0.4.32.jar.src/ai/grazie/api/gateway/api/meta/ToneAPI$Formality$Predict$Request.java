/*    */ package ai.grazie.api.gateway.api.meta;
/*    */ import ai.grazie.tone.MergeStrategyId;
/*    */ import java.util.List;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020 \n\002\020\016\n\000\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\030\002\n\002\b\030\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 /2\0020\001:\002./BU\b\021\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\b\020\007\032\004\030\0010\b\022\016\020\t\032\n\022\004\022\0020\003\030\0010\005\022\b\020\n\032\004\030\0010\003\022\006\020\013\032\0020\f\022\b\020\r\032\004\030\0010\016¢\006\002\020\017B;\022\f\020\004\032\b\022\004\022\0020\0060\005\022\006\020\007\032\0020\b\022\f\020\t\032\b\022\004\022\0020\0030\005\022\b\020\n\032\004\030\0010\003\022\006\020\013\032\0020\f¢\006\002\020\020J\017\020\033\032\b\022\004\022\0020\0060\005HÆ\003J\t\020\034\032\0020\bHÆ\003J\017\020\035\032\b\022\004\022\0020\0030\005HÆ\003J\020\020\036\032\004\030\0010\003HÆ\003¢\006\002\020\022J\t\020\037\032\0020\fHÆ\003JN\020 \032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\0052\b\b\002\020\007\032\0020\b2\016\b\002\020\t\032\b\022\004\022\0020\0030\0052\n\b\002\020\n\032\004\030\0010\0032\b\b\002\020\013\032\0020\fHÆ\001¢\006\002\020!J\023\020\"\032\0020\f2\b\020#\032\004\030\0010\001HÖ\003J\t\020$\032\0020\003HÖ\001J\t\020%\032\0020\006HÖ\001J&\020&\032\0020'2\006\020(\032\0020\0002\006\020)\032\0020*2\006\020+\032\0020,HÁ\001¢\006\002\b-R\025\020\n\032\004\030\0010\003¢\006\n\n\002\020\023\032\004\b\021\020\022R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\024\020\025R\027\020\t\032\b\022\004\022\0020\0030\005¢\006\b\n\000\032\004\b\026\020\027R\021\020\013\032\0020\f¢\006\b\n\000\032\004\b\030\020\031R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\032\020\027¨\0060"}, d2 = {"Lai/grazie/api/gateway/api/meta/ToneAPI$Formality$Predict$Request;", "", "seen1", "", "texts", "", "", "mergeStrategyId", "Lai/grazie/tone/MergeStrategyId;", "percentages", "batchSize", "returnSentenceScores", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lai/grazie/tone/MergeStrategyId;Ljava/util/List;Ljava/lang/Integer;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;Lai/grazie/tone/MergeStrategyId;Ljava/util/List;Ljava/lang/Integer;Z)V", "getBatchSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMergeStrategyId", "()Lai/grazie/tone/MergeStrategyId;", "getPercentages", "()Ljava/util/List;", "getReturnSentenceScores", "()Z", "getTexts", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/List;Lai/grazie/tone/MergeStrategyId;Ljava/util/List;Ljava/lang/Integer;Z)Lai/grazie/api/gateway/api/meta/ToneAPI$Formality$Predict$Request;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*    */ public final class Request {
/*    */   @NotNull
/* 16 */   public static final Companion Companion = new Companion(null); @NotNull private final List<String> texts; @NotNull private final MergeStrategyId mergeStrategyId; @NotNull private final List<Integer> percentages; @Nullable private final Integer batchSize; private final boolean returnSentenceScores; @JvmField
/*    */   @NotNull
/* 18 */   private static final KSerializer<Object>[] $childSerializers; public Request(@NotNull List<String> texts, @NotNull MergeStrategyId mergeStrategyId, @NotNull List<Integer> percentages, @Nullable Integer batchSize, boolean returnSentenceScores) { this.texts = texts;
/* 19 */     this.mergeStrategyId = mergeStrategyId;
/* 20 */     this.percentages = percentages;
/* 21 */     this.batchSize = batchSize;
/* 22 */     this.returnSentenceScores = returnSentenceScores; } static { KSerializer[] arrayOfKSerializer = new KSerializer[5]; arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = (KSerializer)new ArrayListSerializer((KSerializer)IntSerializer.INSTANCE); arrayOfKSerializer[3] = null; arrayOfKSerializer[4] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } public final boolean getReturnSentenceScores() { return this.returnSentenceScores; }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/meta/ToneAPI.Formality.Predict.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/meta/ToneAPI$Formality$Predict$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
/*    */   public static final class $serializer implements GeneratedSerializer<Request> {
/*    */     @NotNull
/*    */     public static final $serializer INSTANCE = new $serializer();
/*    */     
/*    */     @NotNull
/*    */     public KSerializer<?>[] typeParametersSerializers() {
/*    */       return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public SerialDescriptor getDescriptor() {
/*    */       return (SerialDescriptor)descriptor;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public KSerializer<?>[] childSerializers() {
/*    */       KSerializer[] arrayOfKSerializer1 = (KSerializer[])ToneAPI.Formality.Predict.Request.$childSerializers, arrayOfKSerializer2 = new KSerializer[5];
/*    */       arrayOfKSerializer2[0] = arrayOfKSerializer1[0];
/*    */       arrayOfKSerializer2[1] = (KSerializer)MergeStrategyIdSerializer.INSTANCE;
/*    */       arrayOfKSerializer2[2] = arrayOfKSerializer1[2];
/*    */       arrayOfKSerializer2[3] = BuiltinSerializersKt.getNullable((KSerializer)IntSerializer.INSTANCE);
/*    */       arrayOfKSerializer2[4] = (KSerializer)BooleanSerializer.INSTANCE;
/*    */       return (KSerializer<?>[])arrayOfKSerializer2;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public ToneAPI.Formality.Predict.Request deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       List list1 = null;
/*    */       MergeStrategyId mergeStrategyId = null;
/*    */       List list2 = null;
/*    */       Integer integer = null;
/*    */       boolean bool1 = false;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       KSerializer[] arrayOfKSerializer = (KSerializer[])ToneAPI.Formality.Predict.Request.$childSerializers;
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         list1 = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list1);
/*    */         i |= 0x1;
/*    */         mergeStrategyId = (MergeStrategyId)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)MergeStrategyIdSerializer.INSTANCE, mergeStrategyId);
/*    */         i |= 0x2;
/*    */         list2 = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], list2);
/*    */         i |= 0x4;
/*    */         integer = (Integer)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)IntSerializer.INSTANCE, integer);
/*    */         i |= 0x8;
/*    */         bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 4);
/*    */         i |= 0x10;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               list1 = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list1);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               mergeStrategyId = (MergeStrategyId)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)MergeStrategyIdSerializer.INSTANCE, mergeStrategyId);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               list2 = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], list2);
/*    */               i |= 0x4;
/*    */               continue;
/*    */             case 3:
/*    */               integer = (Integer)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)IntSerializer.INSTANCE, integer);
/*    */               i |= 0x8;
/*    */               continue;
/*    */             case 4:
/*    */               bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 4);
/*    */               i |= 0x10;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new ToneAPI.Formality.Predict.Request(i, list1, mergeStrategyId, list2, integer, bool1, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull ToneAPI.Formality.Predict.Request value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       ToneAPI.Formality.Predict.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.meta.ToneAPI.Formality.Predict.Request", INSTANCE, 5);
/*    */       pluginGeneratedSerialDescriptor.addElement("texts", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("mergeStrategyId", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("percentages", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("batchSize", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("returnSentenceScores", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/meta/ToneAPI$Formality$Predict$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/meta/ToneAPI$Formality$Predict$Request;", "api-gateway-api"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<ToneAPI.Formality.Predict.Request> serializer() {
/*    */       return (KSerializer<ToneAPI.Formality.Predict.Request>)ToneAPI.Formality.Predict.Request.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<String> getTexts() {
/*    */     return this.texts;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final MergeStrategyId getMergeStrategyId() {
/*    */     return this.mergeStrategyId;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<Integer> getPercentages() {
/*    */     return this.percentages;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Integer getBatchSize() {
/*    */     return this.batchSize;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<String> component1() {
/*    */     return this.texts;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final MergeStrategyId component2() {
/*    */     return this.mergeStrategyId;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<Integer> component3() {
/*    */     return this.percentages;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Integer component4() {
/*    */     return this.batchSize;
/*    */   }
/*    */   
/*    */   public final boolean component5() {
/*    */     return this.returnSentenceScores;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Request copy(@NotNull List<String> texts, @NotNull MergeStrategyId mergeStrategyId, @NotNull List<Integer> percentages, @Nullable Integer batchSize, boolean returnSentenceScores) {
/*    */     Intrinsics.checkNotNullParameter(texts, "texts");
/*    */     Intrinsics.checkNotNullParameter(mergeStrategyId, "mergeStrategyId");
/*    */     Intrinsics.checkNotNullParameter(percentages, "percentages");
/*    */     return new Request(texts, mergeStrategyId, percentages, batchSize, returnSentenceScores);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Request(texts=" + this.texts + ", mergeStrategyId=" + this.mergeStrategyId + ", percentages=" + this.percentages + ", batchSize=" + this.batchSize + ", returnSentenceScores=" + this.returnSentenceScores + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.texts.hashCode();
/*    */     result = result * 31 + this.mergeStrategyId.hashCode();
/*    */     result = result * 31 + this.percentages.hashCode();
/*    */     result = result * 31 + ((this.batchSize == null) ? 0 : this.batchSize.hashCode());
/*    */     return result * 31 + Boolean.hashCode(this.returnSentenceScores);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Request))
/*    */       return false; 
/*    */     Request request = (Request)other;
/*    */     return !Intrinsics.areEqual(this.texts, request.texts) ? false : ((this.mergeStrategyId != request.mergeStrategyId) ? false : (!Intrinsics.areEqual(this.percentages, request.percentages) ? false : (!Intrinsics.areEqual(this.batchSize, request.batchSize) ? false : (!(this.returnSentenceScores != request.returnSentenceScores)))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\meta\ToneAPI$Formality$Predict$Request.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */