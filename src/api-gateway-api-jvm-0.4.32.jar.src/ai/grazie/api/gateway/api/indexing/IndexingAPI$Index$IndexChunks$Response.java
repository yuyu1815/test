/*     */ package ai.grazie.api.gateway.api.indexing;
/*     */ 
/*     */ import java.util.List;
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
/*     */ import kotlinx.serialization.Serializable;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.UnknownFieldException;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.ArrayListSerializer;
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
/*     */ import kotlinx.serialization.internal.LongSerializer;
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
/*     */ @Serializable
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\t\n\000\n\002\020 \n\002\020\016\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \"2\0020\001:\002!\"B1\b\021\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\016\020\006\032\n\022\004\022\0020\b\030\0010\007\022\b\020\t\032\004\030\0010\n¢\006\002\020\013B\033\022\006\020\004\032\0020\005\022\f\020\006\032\b\022\004\022\0020\b0\007¢\006\002\020\fJ\t\020\021\032\0020\005HÆ\003J\017\020\022\032\b\022\004\022\0020\b0\007HÆ\003J#\020\023\032\0020\0002\b\b\002\020\004\032\0020\0052\016\b\002\020\006\032\b\022\004\022\0020\b0\007HÆ\001J\023\020\024\032\0020\0252\b\020\026\032\004\030\0010\001HÖ\003J\t\020\027\032\0020\003HÖ\001J\t\020\030\032\0020\bHÖ\001J&\020\031\032\0020\0322\006\020\033\032\0020\0002\006\020\034\032\0020\0352\006\020\036\032\0020\037HÁ\001¢\006\002\b R\027\020\006\032\b\022\004\022\0020\b0\007¢\006\b\n\000\032\004\b\r\020\016R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\017\020\020¨\006#"}, d2 = {"Lai/grazie/api/gateway/api/indexing/IndexingAPI$Index$IndexChunks$Response;", "", "seen1", "", "vectorFetchingTime", "", "chunkSample", "", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IJLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(JLjava/util/List;)V", "getChunkSample", "()Ljava/util/List;", "getVectorFetchingTime", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*     */ public final class Response
/*     */ {
/*     */   private final long vectorFetchingTime;
/*     */   @NotNull
/*     */   private final List<String> chunkSample;
/*     */   @NotNull
/* 102 */   public static final Companion Companion = new Companion(null); @JvmField
/*     */   @NotNull
/* 104 */   private static final KSerializer<Object>[] $childSerializers; public Response(long vectorFetchingTime, @NotNull List<String> chunkSample) { this.vectorFetchingTime = vectorFetchingTime;
/* 105 */     this.chunkSample = chunkSample; } @NotNull public final List<String> getChunkSample() { return this.chunkSample; }
/*     */ 
/*     */   
/*     */   static {
/*     */     KSerializer[] arrayOfKSerializer = new KSerializer[2];
/*     */     arrayOfKSerializer[0] = null;
/*     */     arrayOfKSerializer[1] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE);
/*     */     $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*     */   }
/*     */   
/*     */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/indexing/IndexingAPI.Index.IndexChunks.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/indexing/IndexingAPI$Index$IndexChunks$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
/*     */   public static final class $serializer implements GeneratedSerializer<Response> {
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
/*     */       KSerializer[] arrayOfKSerializer1 = (KSerializer[])IndexingAPI.Index.IndexChunks.Response.$childSerializers, arrayOfKSerializer2 = new KSerializer[2];
/*     */       arrayOfKSerializer2[0] = (KSerializer)LongSerializer.INSTANCE;
/*     */       arrayOfKSerializer2[1] = arrayOfKSerializer1[1];
/*     */       return (KSerializer<?>[])arrayOfKSerializer2;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public IndexingAPI.Index.IndexChunks.Response deserialize(@NotNull Decoder decoder) {
/*     */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */       SerialDescriptor serialDescriptor = getDescriptor();
/*     */       boolean bool = true;
/*     */       int i = 0;
/*     */       long l = 0L;
/*     */       List list = null;
/*     */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */       KSerializer[] arrayOfKSerializer = (KSerializer[])IndexingAPI.Index.IndexChunks.Response.$childSerializers;
/*     */       if (compositeDecoder.decodeSequentially()) {
/*     */         l = compositeDecoder.decodeLongElement(serialDescriptor, 0);
/*     */         i |= 0x1;
/*     */         list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], list);
/*     */         i |= 0x2;
/*     */       } else {
/*     */         while (bool) {
/*     */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */           switch (j) {
/*     */             case -1:
/*     */               bool = false;
/*     */               continue;
/*     */             case 0:
/*     */               l = compositeDecoder.decodeLongElement(serialDescriptor, 0);
/*     */               i |= 0x1;
/*     */               continue;
/*     */             case 1:
/*     */               list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], list);
/*     */               i |= 0x2;
/*     */               continue;
/*     */           } 
/*     */           throw new UnknownFieldException(j);
/*     */         } 
/*     */       } 
/*     */       compositeDecoder.endStructure(serialDescriptor);
/*     */       return new IndexingAPI.Index.IndexChunks.Response(i, l, list, null);
/*     */     }
/*     */     
/*     */     public void serialize(@NotNull Encoder encoder, @NotNull IndexingAPI.Index.IndexChunks.Response value) {
/*     */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */       Intrinsics.checkNotNullParameter(value, "value");
/*     */       SerialDescriptor serialDescriptor = getDescriptor();
/*     */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */       IndexingAPI.Index.IndexChunks.Response.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*     */       compositeEncoder.endStructure(serialDescriptor);
/*     */     }
/*     */     
/*     */     static {
/*     */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.indexing.IndexingAPI.Index.IndexChunks.Response", INSTANCE, 2);
/*     */       pluginGeneratedSerialDescriptor.addElement("vectorFetchingTime", false);
/*     */       pluginGeneratedSerialDescriptor.addElement("chunkSample", false);
/*     */       descriptor = pluginGeneratedSerialDescriptor;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/indexing/IndexingAPI$Index$IndexChunks$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/indexing/IndexingAPI$Index$IndexChunks$Response;", "api-gateway-api"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final KSerializer<IndexingAPI.Index.IndexChunks.Response> serializer() {
/*     */       return (KSerializer<IndexingAPI.Index.IndexChunks.Response>)IndexingAPI.Index.IndexChunks.Response.$serializer.INSTANCE;
/*     */     }
/*     */   }
/*     */   
/*     */   public final long getVectorFetchingTime() {
/*     */     return this.vectorFetchingTime;
/*     */   }
/*     */   
/*     */   public final long component1() {
/*     */     return this.vectorFetchingTime;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<String> component2() {
/*     */     return this.chunkSample;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Response copy(long vectorFetchingTime, @NotNull List<String> chunkSample) {
/*     */     Intrinsics.checkNotNullParameter(chunkSample, "chunkSample");
/*     */     return new Response(vectorFetchingTime, chunkSample);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "Response(vectorFetchingTime=" + this.vectorFetchingTime + ", chunkSample=" + this.chunkSample + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = Long.hashCode(this.vectorFetchingTime);
/*     */     return result * 31 + this.chunkSample.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof Response))
/*     */       return false; 
/*     */     Response response = (Response)other;
/*     */     return (this.vectorFetchingTime != response.vectorFetchingTime) ? false : (!!Intrinsics.areEqual(this.chunkSample, response.chunkSample));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\indexing\IndexingAPI$Index$IndexChunks$Response.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */