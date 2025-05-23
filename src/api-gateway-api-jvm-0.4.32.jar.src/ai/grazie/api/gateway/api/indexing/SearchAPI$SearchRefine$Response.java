/*     */ package ai.grazie.api.gateway.api.indexing;
/*     */ 
/*     */ import ai.grazie.code.indexing.model.search.SearchResultWithType;
/*     */ import ai.grazie.code.indexing.model.search.SearchResultWithType$;
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
/*     */ import kotlinx.serialization.internal.BooleanSerializer;
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import kotlinx.serialization.internal.SerializationConstructorMarker;
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
/*     */ @Serializable
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\f\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 !2\0020\001:\002 !B1\b\021\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\006\020\007\032\0020\b\022\b\020\t\032\004\030\0010\n¢\006\002\020\013B\033\022\f\020\004\032\b\022\004\022\0020\0060\005\022\006\020\007\032\0020\b¢\006\002\020\fJ\017\020\020\032\b\022\004\022\0020\0060\005HÆ\003J\t\020\021\032\0020\bHÆ\003J#\020\022\032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\0052\b\b\002\020\007\032\0020\bHÆ\001J\023\020\023\032\0020\b2\b\020\024\032\004\030\0010\001HÖ\003J\t\020\025\032\0020\003HÖ\001J\t\020\026\032\0020\027HÖ\001J&\020\030\032\0020\0312\006\020\032\032\0020\0002\006\020\033\032\0020\0342\006\020\035\032\0020\036HÁ\001¢\006\002\b\037R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\007\020\rR\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\016\020\017¨\006\""}, d2 = {"Lai/grazie/api/gateway/api/indexing/SearchAPI$SearchRefine$Response;", "", "seen1", "", "res", "", "Lai/grazie/code/indexing/model/search/SearchResultWithType;", "isFinished", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;Z)V", "()Z", "getRes", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*     */ public final class Response
/*     */ {
/*     */   @NotNull
/*     */   private final List<SearchResultWithType> res;
/*     */   private final boolean isFinished;
/*     */   @JvmField
/*     */   @NotNull
/*     */   private static final KSerializer<Object>[] $childSerializers;
/*     */   @NotNull
/* 108 */   public static final Companion Companion = new Companion(null);
/*     */   public Response(@NotNull List<SearchResultWithType> res, boolean isFinished) {
/* 110 */     this.res = res;
/* 111 */     this.isFinished = isFinished; } public final boolean isFinished() { return this.isFinished; }
/*     */ 
/*     */   
/*     */   static {
/*     */     KSerializer[] arrayOfKSerializer = new KSerializer[2];
/*     */     arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)SearchResultWithType$.serializer.INSTANCE);
/*     */     arrayOfKSerializer[1] = null;
/*     */     $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*     */   }
/*     */   
/*     */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/indexing/SearchAPI.SearchRefine.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/indexing/SearchAPI$SearchRefine$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
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
/*     */       KSerializer[] arrayOfKSerializer1 = (KSerializer[])SearchAPI.SearchRefine.Response.$childSerializers, arrayOfKSerializer2 = new KSerializer[2];
/*     */       arrayOfKSerializer2[0] = arrayOfKSerializer1[0];
/*     */       arrayOfKSerializer2[1] = (KSerializer)BooleanSerializer.INSTANCE;
/*     */       return (KSerializer<?>[])arrayOfKSerializer2;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public SearchAPI.SearchRefine.Response deserialize(@NotNull Decoder decoder) {
/*     */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */       SerialDescriptor serialDescriptor = getDescriptor();
/*     */       boolean bool = true;
/*     */       int i = 0;
/*     */       List list = null;
/*     */       boolean bool1 = false;
/*     */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */       KSerializer[] arrayOfKSerializer = (KSerializer[])SearchAPI.SearchRefine.Response.$childSerializers;
/*     */       if (compositeDecoder.decodeSequentially()) {
/*     */         list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list);
/*     */         i |= 0x1;
/*     */         bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 1);
/*     */         i |= 0x2;
/*     */       } else {
/*     */         while (bool) {
/*     */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */           switch (j) {
/*     */             case -1:
/*     */               bool = false;
/*     */               continue;
/*     */             case 0:
/*     */               list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list);
/*     */               i |= 0x1;
/*     */               continue;
/*     */             case 1:
/*     */               bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 1);
/*     */               i |= 0x2;
/*     */               continue;
/*     */           } 
/*     */           throw new UnknownFieldException(j);
/*     */         } 
/*     */       } 
/*     */       compositeDecoder.endStructure(serialDescriptor);
/*     */       return new SearchAPI.SearchRefine.Response(i, list, bool1, null);
/*     */     }
/*     */     
/*     */     public void serialize(@NotNull Encoder encoder, @NotNull SearchAPI.SearchRefine.Response value) {
/*     */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */       Intrinsics.checkNotNullParameter(value, "value");
/*     */       SerialDescriptor serialDescriptor = getDescriptor();
/*     */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */       SearchAPI.SearchRefine.Response.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*     */       compositeEncoder.endStructure(serialDescriptor);
/*     */     }
/*     */     
/*     */     static {
/*     */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.indexing.SearchAPI.SearchRefine.Response", INSTANCE, 2);
/*     */       pluginGeneratedSerialDescriptor.addElement("res", false);
/*     */       pluginGeneratedSerialDescriptor.addElement("isFinished", false);
/*     */       descriptor = pluginGeneratedSerialDescriptor;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/indexing/SearchAPI$SearchRefine$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/indexing/SearchAPI$SearchRefine$Response;", "api-gateway-api"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final KSerializer<SearchAPI.SearchRefine.Response> serializer() {
/*     */       return (KSerializer<SearchAPI.SearchRefine.Response>)SearchAPI.SearchRefine.Response.$serializer.INSTANCE;
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<SearchResultWithType> getRes() {
/*     */     return this.res;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<SearchResultWithType> component1() {
/*     */     return this.res;
/*     */   }
/*     */   
/*     */   public final boolean component2() {
/*     */     return this.isFinished;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Response copy(@NotNull List<SearchResultWithType> res, boolean isFinished) {
/*     */     Intrinsics.checkNotNullParameter(res, "res");
/*     */     return new Response(res, isFinished);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "Response(res=" + this.res + ", isFinished=" + this.isFinished + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.res.hashCode();
/*     */     return result * 31 + Boolean.hashCode(this.isFinished);
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof Response))
/*     */       return false; 
/*     */     Response response = (Response)other;
/*     */     return !Intrinsics.areEqual(this.res, response.res) ? false : (!(this.isFinished != response.isFinished));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\indexing\SearchAPI$SearchRefine$Response.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */