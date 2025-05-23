/*    */ package ai.grazie.model.llm.chat.caching;
/*    */ import java.util.List;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020 \n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\006\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 \0302\0020\001:\002\027\030B9\b\021\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\016\020\007\032\n\022\004\022\0020\006\030\0010\005\022\b\020\b\032\004\030\0010\t¢\006\002\020\nB!\022\f\020\004\032\b\022\004\022\0020\0060\005\022\f\020\007\032\b\022\004\022\0020\0060\005¢\006\002\020\013J&\020\017\032\0020\0202\006\020\021\032\0020\0002\006\020\022\032\0020\0232\006\020\024\032\0020\025HÁ\001¢\006\002\b\026R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\f\020\rR\027\020\007\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\016\020\r¨\006\031"}, d2 = {"Lai/grazie/model/llm/chat/caching/LLMCachePoints;", "", "seen1", "", "functions", "", "Lai/grazie/model/llm/chat/caching/LLMCachePoint;", "messages", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;Ljava/util/List;)V", "getFunctions", "()Ljava/util/List;", "getMessages", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_llm", "$serializer", "Companion", "model-llm"})
/*    */ public final class LLMCachePoints {
/*    */   @NotNull
/* 12 */   public static final Companion Companion = new Companion(null); @NotNull private final List<LLMCachePoint> functions; @NotNull
/*    */   private final List<LLMCachePoint> messages; @JvmField
/*    */   @NotNull
/* 15 */   private static final KSerializer<Object>[] $childSerializers; public LLMCachePoints(@NotNull List<LLMCachePoint> functions, @NotNull List<LLMCachePoint> messages) { this.functions = functions;
/* 16 */     this.messages = messages; } static { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)LLMCachePoint.$serializer.INSTANCE); arrayOfKSerializer[1] = (KSerializer)new ArrayListSerializer((KSerializer)LLMCachePoint.$serializer.INSTANCE); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @NotNull public final List<LLMCachePoint> getMessages() { return this.messages; }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/model/llm/chat/caching/LLMCachePoints.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/model/llm/chat/caching/LLMCachePoints;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-llm"})
/*    */   public static final class $serializer implements GeneratedSerializer<LLMCachePoints> {
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
/*    */       KSerializer[] arrayOfKSerializer1 = (KSerializer[])LLMCachePoints.$childSerializers, arrayOfKSerializer2 = new KSerializer[2];
/*    */       arrayOfKSerializer2[0] = arrayOfKSerializer1[0];
/*    */       arrayOfKSerializer2[1] = arrayOfKSerializer1[1];
/*    */       return (KSerializer<?>[])arrayOfKSerializer2;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public LLMCachePoints deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       List list1 = null, list2 = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       KSerializer[] arrayOfKSerializer = (KSerializer[])LLMCachePoints.$childSerializers;
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         list1 = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list1);
/*    */         i |= 0x1;
/*    */         list2 = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], list2);
/*    */         i |= 0x2;
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
/*    */               list2 = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], list2);
/*    */               i |= 0x2;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new LLMCachePoints(i, list1, list2, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull LLMCachePoints value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       LLMCachePoints.write$Self$model_llm(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.model.llm.chat.caching.LLMCachePoints", INSTANCE, 2);
/*    */       pluginGeneratedSerialDescriptor.addElement("functions", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("messages", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/llm/chat/caching/LLMCachePoints$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/llm/chat/caching/LLMCachePoints;", "model-llm"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<LLMCachePoints> serializer() {
/*    */       return (KSerializer<LLMCachePoints>)LLMCachePoints.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<LLMCachePoint> getFunctions() {
/*    */     return this.functions;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\chat\caching\LLMCachePoints.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */