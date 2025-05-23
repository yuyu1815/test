/*    */ package ai.grazie.api.gateway.api.indexing;
/*    */ 
/*    */ import ai.grazie.code.indexing.model.IndexDescriptor;
/*    */ import ai.grazie.code.indexing.model.IndexDescriptor$;
/*    */ import ai.grazie.code.indexing.model.request.IndexDescriptorRequest;
/*    */ import ai.grazie.code.indexing.model.snapshot.Snapshot;
/*    */ import ai.grazie.code.indexing.model.snapshot.Snapshot$;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.DoubleSerializer;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.IntSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000X\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\020\006\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\025\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 32\0020\001:\00223BQ\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\006\020\b\032\0020\003\022\006\020\t\032\0020\n\022\b\020\013\032\004\030\0010\f\022\b\020\r\032\004\030\0010\005\022\b\020\016\032\004\030\0010\017¢\006\002\020\020B9\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\003\022\006\020\t\032\0020\n\022\006\020\013\032\0020\f\022\n\b\002\020\r\032\004\030\0010\005¢\006\002\020\021J\t\020\035\032\0020\005HÆ\003J\t\020\036\032\0020\007HÆ\003J\t\020\037\032\0020\003HÆ\003J\t\020 \032\0020\nHÆ\003J\t\020!\032\0020\fHÆ\003J\013\020\"\032\004\030\0010\005HÆ\003JG\020#\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\0032\b\b\002\020\t\032\0020\n2\b\b\002\020\013\032\0020\f2\n\b\002\020\r\032\004\030\0010\005HÆ\001J\023\020$\032\0020%2\b\020&\032\004\030\0010'HÖ\003J\t\020(\032\0020\003HÖ\001J\t\020)\032\0020\005HÖ\001J&\020*\032\0020+2\006\020,\032\0020\0002\006\020-\032\0020.2\006\020/\032\00200HÁ\001¢\006\002\b1R\024\020\013\032\0020\fX\004¢\006\b\n\000\032\004\b\022\020\023R\021\020\b\032\0020\003¢\006\b\n\000\032\004\b\024\020\025R\021\020\t\032\0020\n¢\006\b\n\000\032\004\b\026\020\027R\023\020\r\032\004\030\0010\005¢\006\b\n\000\032\004\b\030\020\031R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\032\020\033R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\034\020\031¨\0064"}, d2 = {"Lai/grazie/api/gateway/api/indexing/SearchAPI$SearchByDescriptor$Request;", "Lai/grazie/code/indexing/model/request/IndexDescriptorRequest;", "seen1", "", "text", "", "snapshot", "Lai/grazie/code/indexing/model/snapshot/Snapshot;", "maxResults", "minScore", "", "descriptor", "Lai/grazie/code/indexing/model/IndexDescriptor;", "pathFilter", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lai/grazie/code/indexing/model/snapshot/Snapshot;IDLai/grazie/code/indexing/model/IndexDescriptor;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lai/grazie/code/indexing/model/snapshot/Snapshot;IDLai/grazie/code/indexing/model/IndexDescriptor;Ljava/lang/String;)V", "getDescriptor", "()Lai/grazie/code/indexing/model/IndexDescriptor;", "getMaxResults", "()I", "getMinScore", "()D", "getPathFilter", "()Ljava/lang/String;", "getSnapshot", "()Lai/grazie/code/indexing/model/snapshot/Snapshot;", "getText", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*    */ public final class Request
/*    */   implements IndexDescriptorRequest
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String text;
/*    */   @NotNull
/*    */   private final Snapshot snapshot;
/*    */   private final int maxResults;
/*    */   private final double minScore;
/*    */   @NotNull
/*    */   private final IndexDescriptor descriptor;
/*    */   @Nullable
/*    */   private final String pathFilter;
/*    */   
/*    */   public Request(@NotNull String text, @NotNull Snapshot snapshot, int maxResults, double minScore, @NotNull IndexDescriptor descriptor, @Nullable String pathFilter) {
/* 75 */     this.text = text;
/* 76 */     this.snapshot = snapshot;
/* 77 */     this.maxResults = maxResults;
/* 78 */     this.minScore = minScore;
/* 79 */     this.descriptor = descriptor;
/* 80 */     this.pathFilter = pathFilter; } @Nullable public final String getPathFilter() { return this.pathFilter; }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/indexing/SearchAPI.SearchByDescriptor.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/indexing/SearchAPI$SearchByDescriptor$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
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
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[6];
/*    */       arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer[1] = (KSerializer)Snapshot$.serializer.INSTANCE;
/*    */       arrayOfKSerializer[2] = (KSerializer)IntSerializer.INSTANCE;
/*    */       arrayOfKSerializer[3] = (KSerializer)DoubleSerializer.INSTANCE;
/*    */       arrayOfKSerializer[4] = (KSerializer)IndexDescriptor$.serializer.INSTANCE;
/*    */       arrayOfKSerializer[5] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public SearchAPI.SearchByDescriptor.Request deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       String str1 = null;
/*    */       Snapshot snapshot = null;
/*    */       int j = 0;
/*    */       double d = 0.0D;
/*    */       IndexDescriptor indexDescriptor = null;
/*    */       String str2 = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */         i |= 0x1;
/*    */         snapshot = (Snapshot)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Snapshot$.serializer.INSTANCE, snapshot);
/*    */         i |= 0x2;
/*    */         j = compositeDecoder.decodeIntElement(serialDescriptor, 2);
/*    */         i |= 0x4;
/*    */         d = compositeDecoder.decodeDoubleElement(serialDescriptor, 3);
/*    */         i |= 0x8;
/*    */         indexDescriptor = (IndexDescriptor)compositeDecoder.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy)IndexDescriptor$.serializer.INSTANCE, indexDescriptor);
/*    */         i |= 0x10;
/*    */         str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy)StringSerializer.INSTANCE, str2);
/*    */         i |= 0x20;
/*    */       } else {
/*    */         while (bool) {
/*    */           int k = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (k) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               snapshot = (Snapshot)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Snapshot$.serializer.INSTANCE, snapshot);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               j = compositeDecoder.decodeIntElement(serialDescriptor, 2);
/*    */               i |= 0x4;
/*    */               continue;
/*    */             case 3:
/*    */               d = compositeDecoder.decodeDoubleElement(serialDescriptor, 3);
/*    */               i |= 0x8;
/*    */               continue;
/*    */             case 4:
/*    */               indexDescriptor = (IndexDescriptor)compositeDecoder.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy)IndexDescriptor$.serializer.INSTANCE, indexDescriptor);
/*    */               i |= 0x10;
/*    */               continue;
/*    */             case 5:
/*    */               str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy)StringSerializer.INSTANCE, str2);
/*    */               i |= 0x20;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(k);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new SearchAPI.SearchByDescriptor.Request(i, str1, snapshot, j, d, indexDescriptor, str2, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull SearchAPI.SearchByDescriptor.Request value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       SearchAPI.SearchByDescriptor.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.indexing.SearchAPI.SearchByDescriptor.Request", INSTANCE, 6);
/*    */       pluginGeneratedSerialDescriptor.addElement("text", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("snapshot", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("maxResults", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("minScore", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("descriptor", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("pathFilter", true);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/indexing/SearchAPI$SearchByDescriptor$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/indexing/SearchAPI$SearchByDescriptor$Request;", "api-gateway-api"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<SearchAPI.SearchByDescriptor.Request> serializer() {
/*    */       return (KSerializer<SearchAPI.SearchByDescriptor.Request>)SearchAPI.SearchByDescriptor.Request.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getText() {
/*    */     return this.text;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Snapshot getSnapshot() {
/*    */     return this.snapshot;
/*    */   }
/*    */   
/*    */   public final int getMaxResults() {
/*    */     return this.maxResults;
/*    */   }
/*    */   
/*    */   public final double getMinScore() {
/*    */     return this.minScore;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public IndexDescriptor getDescriptor() {
/*    */     return this.descriptor;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.text;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Snapshot component2() {
/*    */     return this.snapshot;
/*    */   }
/*    */   
/*    */   public final int component3() {
/*    */     return this.maxResults;
/*    */   }
/*    */   
/*    */   public final double component4() {
/*    */     return this.minScore;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final IndexDescriptor component5() {
/*    */     return this.descriptor;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component6() {
/*    */     return this.pathFilter;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Request copy(@NotNull String text, @NotNull Snapshot snapshot, int maxResults, double minScore, @NotNull IndexDescriptor descriptor, @Nullable String pathFilter) {
/*    */     Intrinsics.checkNotNullParameter(text, "text");
/*    */     Intrinsics.checkNotNullParameter(snapshot, "snapshot");
/*    */     Intrinsics.checkNotNullParameter(descriptor, "descriptor");
/*    */     return new Request(text, snapshot, maxResults, minScore, descriptor, pathFilter);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Request(text=" + this.text + ", snapshot=" + this.snapshot + ", maxResults=" + this.maxResults + ", minScore=" + this.minScore + ", descriptor=" + this.descriptor + ", pathFilter=" + this.pathFilter + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.text.hashCode();
/*    */     result = result * 31 + this.snapshot.hashCode();
/*    */     result = result * 31 + Integer.hashCode(this.maxResults);
/*    */     result = result * 31 + Double.hashCode(this.minScore);
/*    */     result = result * 31 + this.descriptor.hashCode();
/*    */     return result * 31 + ((this.pathFilter == null) ? 0 : this.pathFilter.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Request))
/*    */       return false; 
/*    */     Request request = (Request)other;
/*    */     return !Intrinsics.areEqual(this.text, request.text) ? false : (!Intrinsics.areEqual(this.snapshot, request.snapshot) ? false : ((this.maxResults != request.maxResults) ? false : ((Double.compare(this.minScore, request.minScore) != 0) ? false : (!Intrinsics.areEqual(this.descriptor, request.descriptor) ? false : (!!Intrinsics.areEqual(this.pathFilter, request.pathFilter))))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\indexing\SearchAPI$SearchByDescriptor$Request.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */