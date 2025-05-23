/*    */ package ai.grazie.gen.tasks.text.webSearch;
/*    */ 
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerialName;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.IntSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\r\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 #2\0020\001:\002\"#B/\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\b\b\001\020\006\032\0020\003\022\b\020\007\032\004\030\0010\b¢\006\002\020\tB\025\022\006\020\004\032\0020\005\022\006\020\006\032\0020\003¢\006\002\020\nJ\t\020\022\032\0020\005HÆ\003J\t\020\023\032\0020\003HÆ\003J\035\020\024\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\003HÆ\001J\023\020\025\032\0020\0262\b\020\027\032\004\030\0010\001HÖ\003J\t\020\030\032\0020\003HÖ\001J\t\020\031\032\0020\005HÖ\001J&\020\032\032\0020\0332\006\020\034\032\0020\0002\006\020\035\032\0020\0362\006\020\037\032\0020 HÁ\001¢\006\002\b!R\034\020\006\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\013\020\f\032\004\b\r\020\016R\034\020\004\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\017\020\f\032\004\b\020\020\021¨\006$"}, d2 = {"Lai/grazie/gen/tasks/text/webSearch/WebSearchTaskParams;", "", "seen1", "", "query", "", "maxResults", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;I)V", "getMaxResults$annotations", "()V", "getMaxResults", "()I", "getQuery$annotations", "getQuery", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$tasks_provider_proxy_model", "$serializer", "Companion", "tasks-provider-proxy-model"})
/*    */ public final class WebSearchTaskParams {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String query;
/*    */   private final int maxResults;
/*    */   
/* 35 */   public WebSearchTaskParams(@NotNull String query, int maxResults) { this.query = query;
/*    */ 
/*    */ 
/*    */     
/* 39 */     this.maxResults = maxResults; } public final int getMaxResults() {
/* 40 */     return this.maxResults;
/*    */   }
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gen/tasks/text/webSearch/WebSearchTaskParams.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gen/tasks/text/webSearch/WebSearchTaskParams;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "tasks-provider-proxy-model"})
/*    */   public static final class $serializer implements GeneratedSerializer<WebSearchTaskParams> {
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
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[2];
/*    */       arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer[1] = (KSerializer)IntSerializer.INSTANCE;
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public WebSearchTaskParams deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       String str = null;
/*    */       int j = 0;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         str = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */         i |= 0x1;
/*    */         j = compositeDecoder.decodeIntElement(serialDescriptor, 1);
/*    */         i |= 0x2;
/*    */       } else {
/*    */         while (bool) {
/*    */           int k = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (k) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               str = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               j = compositeDecoder.decodeIntElement(serialDescriptor, 1);
/*    */               i |= 0x2;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(k);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new WebSearchTaskParams(i, str, j, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull WebSearchTaskParams value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       WebSearchTaskParams.write$Self$tasks_provider_proxy_model(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gen.tasks.text.webSearch.WebSearchTaskParams", INSTANCE, 2);
/*    */       pluginGeneratedSerialDescriptor.addElement("query", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("maxResults", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gen/tasks/text/webSearch/WebSearchTaskParams$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gen/tasks/text/webSearch/WebSearchTaskParams;", "tasks-provider-proxy-model"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<WebSearchTaskParams> serializer() {
/*    */       return (KSerializer<WebSearchTaskParams>)WebSearchTaskParams.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getQuery() {
/*    */     return this.query;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.query;
/*    */   }
/*    */   
/*    */   public final int component2() {
/*    */     return this.maxResults;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final WebSearchTaskParams copy(@NotNull String query, int maxResults) {
/*    */     Intrinsics.checkNotNullParameter(query, "query");
/*    */     return new WebSearchTaskParams(query, maxResults);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "WebSearchTaskParams(query=" + this.query + ", maxResults=" + this.maxResults + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.query.hashCode();
/*    */     return result * 31 + Integer.hashCode(this.maxResults);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof WebSearchTaskParams))
/*    */       return false; 
/*    */     WebSearchTaskParams webSearchTaskParams = (WebSearchTaskParams)other;
/*    */     return !Intrinsics.areEqual(this.query, webSearchTaskParams.query) ? false : (!(this.maxResults != webSearchTaskParams.maxResults));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-proxy-model-jvm-0.4.32.jar!\ai\grazie\gen\tasks\text\webSearch\WebSearchTaskParams.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */