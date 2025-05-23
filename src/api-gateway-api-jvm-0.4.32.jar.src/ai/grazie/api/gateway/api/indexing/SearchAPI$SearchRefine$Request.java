/*     */ package ai.grazie.api.gateway.api.indexing;
/*     */ 
/*     */ import ai.grazie.code.indexing.model.IndexDescriptor;
/*     */ import ai.grazie.code.indexing.model.IndexDescriptor$;
/*     */ import ai.grazie.code.indexing.model.request.IndexDescriptorRequest;
/*     */ import ai.grazie.code.indexing.model.search.SearchDescriptor;
/*     */ import ai.grazie.code.indexing.model.search.SearchDescriptor$;
/*     */ import ai.grazie.code.indexing.model.search.SearchResultWithContent;
/*     */ import ai.grazie.code.indexing.model.search.SearchResultWithContent$;
/*     */ import ai.grazie.code.indexing.model.snapshot.Snapshot;
/*     */ import ai.grazie.code.indexing.model.snapshot.Snapshot$;
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
/*     */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.ArrayListSerializer;
/*     */ import kotlinx.serialization.internal.DoubleSerializer;
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
/*     */ import kotlinx.serialization.internal.IntSerializer;
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
/*     */ @Serializable
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000j\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\020\006\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\035\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 A2\0020\001:\002@ABs\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\006\020\b\032\0020\003\022\006\020\t\032\0020\n\022\b\020\013\032\004\030\0010\f\022\b\020\r\032\004\030\0010\005\022\b\020\016\032\004\030\0010\017\022\006\020\020\032\0020\003\022\016\020\021\032\n\022\004\022\0020\023\030\0010\022\022\b\020\024\032\004\030\0010\025¢\006\002\020\026B[\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\003\022\006\020\t\032\0020\n\022\006\020\013\032\0020\f\022\n\b\002\020\r\032\004\030\0010\005\022\006\020\016\032\0020\017\022\006\020\020\032\0020\003\022\020\b\002\020\021\032\n\022\004\022\0020\023\030\0010\022¢\006\002\020\027J\t\020(\032\0020\005HÆ\003J\t\020)\032\0020\007HÆ\003J\t\020*\032\0020\003HÆ\003J\t\020+\032\0020\nHÆ\003J\t\020,\032\0020\fHÆ\003J\013\020-\032\004\030\0010\005HÆ\003J\t\020.\032\0020\017HÆ\003J\t\020/\032\0020\003HÆ\003J\021\0200\032\n\022\004\022\0020\023\030\0010\022HÆ\003Jm\0201\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\0032\b\b\002\020\t\032\0020\n2\b\b\002\020\013\032\0020\f2\n\b\002\020\r\032\004\030\0010\0052\b\b\002\020\016\032\0020\0172\b\b\002\020\020\032\0020\0032\020\b\002\020\021\032\n\022\004\022\0020\023\030\0010\022HÆ\001J\023\0202\032\002032\b\0204\032\004\030\00105HÖ\003J\t\0206\032\0020\003HÖ\001J\t\0207\032\0020\005HÖ\001J&\0208\032\002092\006\020:\032\0020\0002\006\020;\032\0020<2\006\020=\032\0020>HÁ\001¢\006\002\b?R\031\020\021\032\n\022\004\022\0020\023\030\0010\022¢\006\b\n\000\032\004\b\030\020\031R\024\020\013\032\0020\fX\004¢\006\b\n\000\032\004\b\032\020\033R\021\020\b\032\0020\003¢\006\b\n\000\032\004\b\034\020\035R\021\020\t\032\0020\n¢\006\b\n\000\032\004\b\036\020\037R\023\020\r\032\004\030\0010\005¢\006\b\n\000\032\004\b \020!R\021\020\016\032\0020\017¢\006\b\n\000\032\004\b\"\020#R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b$\020%R\021\020\020\032\0020\003¢\006\b\n\000\032\004\b&\020\035R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b'\020!¨\006B"}, d2 = {"Lai/grazie/api/gateway/api/indexing/SearchAPI$SearchRefine$Request;", "Lai/grazie/code/indexing/model/request/IndexDescriptorRequest;", "seen1", "", "text", "", "snapshot", "Lai/grazie/code/indexing/model/snapshot/Snapshot;", "maxResults", "minScore", "", "descriptor", "Lai/grazie/code/indexing/model/IndexDescriptor;", "pathFilter", "searchDescriptor", "Lai/grazie/code/indexing/model/search/SearchDescriptor;", "step", "candidatesWithContent", "", "Lai/grazie/code/indexing/model/search/SearchResultWithContent;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lai/grazie/code/indexing/model/snapshot/Snapshot;IDLai/grazie/code/indexing/model/IndexDescriptor;Ljava/lang/String;Lai/grazie/code/indexing/model/search/SearchDescriptor;ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lai/grazie/code/indexing/model/snapshot/Snapshot;IDLai/grazie/code/indexing/model/IndexDescriptor;Ljava/lang/String;Lai/grazie/code/indexing/model/search/SearchDescriptor;ILjava/util/List;)V", "getCandidatesWithContent", "()Ljava/util/List;", "getDescriptor", "()Lai/grazie/code/indexing/model/IndexDescriptor;", "getMaxResults", "()I", "getMinScore", "()D", "getPathFilter", "()Ljava/lang/String;", "getSearchDescriptor", "()Lai/grazie/code/indexing/model/search/SearchDescriptor;", "getSnapshot", "()Lai/grazie/code/indexing/model/snapshot/Snapshot;", "getStep", "getText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*     */ public final class Request
/*     */   implements IndexDescriptorRequest
/*     */ {
/*     */   @NotNull
/*     */   private final String text;
/*     */   @NotNull
/*     */   private final Snapshot snapshot;
/*     */   private final int maxResults;
/*     */   private final double minScore;
/*     */   @NotNull
/*     */   private final IndexDescriptor descriptor;
/*     */   @Nullable
/*     */   private final String pathFilter;
/*     */   @NotNull
/*     */   private final SearchDescriptor searchDescriptor;
/*     */   private final int step;
/*     */   @Nullable
/*     */   private final List<SearchResultWithContent> candidatesWithContent;
/*     */   @NotNull
/*  95 */   public static final Companion Companion = new Companion(null); @JvmField
/*     */   @NotNull
/*  97 */   private static final KSerializer<Object>[] $childSerializers; public Request(@NotNull String text, @NotNull Snapshot snapshot, int maxResults, double minScore, @NotNull IndexDescriptor descriptor, @Nullable String pathFilter, @NotNull SearchDescriptor searchDescriptor, int step, @Nullable List<SearchResultWithContent> candidatesWithContent) { this.text = text;
/*  98 */     this.snapshot = snapshot;
/*  99 */     this.maxResults = maxResults;
/* 100 */     this.minScore = minScore;
/* 101 */     this.descriptor = descriptor;
/* 102 */     this.pathFilter = pathFilter;
/* 103 */     this.searchDescriptor = searchDescriptor;
/* 104 */     this.step = step;
/* 105 */     this.candidatesWithContent = candidatesWithContent; } @Nullable public final List<SearchResultWithContent> getCandidatesWithContent() { return this.candidatesWithContent; }
/*     */ 
/*     */   
/*     */   static {
/*     */     KSerializer[] arrayOfKSerializer = new KSerializer[9];
/*     */     arrayOfKSerializer[0] = null;
/*     */     arrayOfKSerializer[1] = null;
/*     */     arrayOfKSerializer[2] = null;
/*     */     arrayOfKSerializer[3] = null;
/*     */     arrayOfKSerializer[4] = null;
/*     */     arrayOfKSerializer[5] = null;
/*     */     arrayOfKSerializer[6] = null;
/*     */     arrayOfKSerializer[7] = null;
/*     */     arrayOfKSerializer[8] = (KSerializer)new ArrayListSerializer((KSerializer)SearchResultWithContent$.serializer.INSTANCE);
/*     */     $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*     */   }
/*     */   
/*     */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/indexing/SearchAPI.SearchRefine.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/indexing/SearchAPI$SearchRefine$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
/*     */   public static final class $serializer implements GeneratedSerializer<Request> {
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
/*     */       KSerializer[] arrayOfKSerializer1 = (KSerializer[])SearchAPI.SearchRefine.Request.$childSerializers, arrayOfKSerializer2 = new KSerializer[9];
/*     */       arrayOfKSerializer2[0] = (KSerializer)StringSerializer.INSTANCE;
/*     */       arrayOfKSerializer2[1] = (KSerializer)Snapshot$.serializer.INSTANCE;
/*     */       arrayOfKSerializer2[2] = (KSerializer)IntSerializer.INSTANCE;
/*     */       arrayOfKSerializer2[3] = (KSerializer)DoubleSerializer.INSTANCE;
/*     */       arrayOfKSerializer2[4] = (KSerializer)IndexDescriptor$.serializer.INSTANCE;
/*     */       arrayOfKSerializer2[5] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*     */       arrayOfKSerializer2[6] = (KSerializer)SearchDescriptor$.serializer.INSTANCE;
/*     */       arrayOfKSerializer2[7] = (KSerializer)IntSerializer.INSTANCE;
/*     */       arrayOfKSerializer2[8] = BuiltinSerializersKt.getNullable(arrayOfKSerializer1[8]);
/*     */       return (KSerializer<?>[])arrayOfKSerializer2;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public SearchAPI.SearchRefine.Request deserialize(@NotNull Decoder decoder) {
/*     */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */       SerialDescriptor serialDescriptor = getDescriptor();
/*     */       boolean bool = true;
/*     */       int i = 0;
/*     */       String str1 = null;
/*     */       Snapshot snapshot = null;
/*     */       int j = 0;
/*     */       double d = 0.0D;
/*     */       IndexDescriptor indexDescriptor = null;
/*     */       String str2 = null;
/*     */       SearchDescriptor searchDescriptor = null;
/*     */       int k = 0;
/*     */       List list = null;
/*     */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */       KSerializer[] arrayOfKSerializer = (KSerializer[])SearchAPI.SearchRefine.Request.$childSerializers;
/*     */       if (compositeDecoder.decodeSequentially()) {
/*     */         str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*     */         i |= 0x1;
/*     */         snapshot = (Snapshot)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Snapshot$.serializer.INSTANCE, snapshot);
/*     */         i |= 0x2;
/*     */         j = compositeDecoder.decodeIntElement(serialDescriptor, 2);
/*     */         i |= 0x4;
/*     */         d = compositeDecoder.decodeDoubleElement(serialDescriptor, 3);
/*     */         i |= 0x8;
/*     */         indexDescriptor = (IndexDescriptor)compositeDecoder.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy)IndexDescriptor$.serializer.INSTANCE, indexDescriptor);
/*     */         i |= 0x10;
/*     */         str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy)StringSerializer.INSTANCE, str2);
/*     */         i |= 0x20;
/*     */         searchDescriptor = (SearchDescriptor)compositeDecoder.decodeSerializableElement(serialDescriptor, 6, (DeserializationStrategy)SearchDescriptor$.serializer.INSTANCE, searchDescriptor);
/*     */         i |= 0x40;
/*     */         k = compositeDecoder.decodeIntElement(serialDescriptor, 7);
/*     */         i |= 0x80;
/*     */         list = (List)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 8, (DeserializationStrategy)arrayOfKSerializer[8], list);
/*     */         i |= 0x100;
/*     */       } else {
/*     */         while (bool) {
/*     */           int m = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */           switch (m) {
/*     */             case -1:
/*     */               bool = false;
/*     */               continue;
/*     */             case 0:
/*     */               str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*     */               i |= 0x1;
/*     */               continue;
/*     */             case 1:
/*     */               snapshot = (Snapshot)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Snapshot$.serializer.INSTANCE, snapshot);
/*     */               i |= 0x2;
/*     */               continue;
/*     */             case 2:
/*     */               j = compositeDecoder.decodeIntElement(serialDescriptor, 2);
/*     */               i |= 0x4;
/*     */               continue;
/*     */             case 3:
/*     */               d = compositeDecoder.decodeDoubleElement(serialDescriptor, 3);
/*     */               i |= 0x8;
/*     */               continue;
/*     */             case 4:
/*     */               indexDescriptor = (IndexDescriptor)compositeDecoder.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy)IndexDescriptor$.serializer.INSTANCE, indexDescriptor);
/*     */               i |= 0x10;
/*     */               continue;
/*     */             case 5:
/*     */               str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy)StringSerializer.INSTANCE, str2);
/*     */               i |= 0x20;
/*     */               continue;
/*     */             case 6:
/*     */               searchDescriptor = (SearchDescriptor)compositeDecoder.decodeSerializableElement(serialDescriptor, 6, (DeserializationStrategy)SearchDescriptor$.serializer.INSTANCE, searchDescriptor);
/*     */               i |= 0x40;
/*     */               continue;
/*     */             case 7:
/*     */               k = compositeDecoder.decodeIntElement(serialDescriptor, 7);
/*     */               i |= 0x80;
/*     */               continue;
/*     */             case 8:
/*     */               list = (List)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 8, (DeserializationStrategy)arrayOfKSerializer[8], list);
/*     */               i |= 0x100;
/*     */               continue;
/*     */           } 
/*     */           throw new UnknownFieldException(m);
/*     */         } 
/*     */       } 
/*     */       compositeDecoder.endStructure(serialDescriptor);
/*     */       return new SearchAPI.SearchRefine.Request(i, str1, snapshot, j, d, indexDescriptor, str2, searchDescriptor, k, list, null);
/*     */     }
/*     */     
/*     */     public void serialize(@NotNull Encoder encoder, @NotNull SearchAPI.SearchRefine.Request value) {
/*     */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */       Intrinsics.checkNotNullParameter(value, "value");
/*     */       SerialDescriptor serialDescriptor = getDescriptor();
/*     */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */       SearchAPI.SearchRefine.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*     */       compositeEncoder.endStructure(serialDescriptor);
/*     */     }
/*     */     
/*     */     static {
/*     */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.indexing.SearchAPI.SearchRefine.Request", INSTANCE, 9);
/*     */       pluginGeneratedSerialDescriptor.addElement("text", false);
/*     */       pluginGeneratedSerialDescriptor.addElement("snapshot", false);
/*     */       pluginGeneratedSerialDescriptor.addElement("maxResults", false);
/*     */       pluginGeneratedSerialDescriptor.addElement("minScore", false);
/*     */       pluginGeneratedSerialDescriptor.addElement("descriptor", false);
/*     */       pluginGeneratedSerialDescriptor.addElement("pathFilter", true);
/*     */       pluginGeneratedSerialDescriptor.addElement("searchDescriptor", false);
/*     */       pluginGeneratedSerialDescriptor.addElement("step", false);
/*     */       pluginGeneratedSerialDescriptor.addElement("candidatesWithContent", true);
/*     */       descriptor = pluginGeneratedSerialDescriptor;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/indexing/SearchAPI$SearchRefine$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/indexing/SearchAPI$SearchRefine$Request;", "api-gateway-api"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final KSerializer<SearchAPI.SearchRefine.Request> serializer() {
/*     */       return (KSerializer<SearchAPI.SearchRefine.Request>)SearchAPI.SearchRefine.Request.$serializer.INSTANCE;
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String getText() {
/*     */     return this.text;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Snapshot getSnapshot() {
/*     */     return this.snapshot;
/*     */   }
/*     */   
/*     */   public final int getMaxResults() {
/*     */     return this.maxResults;
/*     */   }
/*     */   
/*     */   public final double getMinScore() {
/*     */     return this.minScore;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public IndexDescriptor getDescriptor() {
/*     */     return this.descriptor;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final String getPathFilter() {
/*     */     return this.pathFilter;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final SearchDescriptor getSearchDescriptor() {
/*     */     return this.searchDescriptor;
/*     */   }
/*     */   
/*     */   public final int getStep() {
/*     */     return this.step;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component1() {
/*     */     return this.text;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Snapshot component2() {
/*     */     return this.snapshot;
/*     */   }
/*     */   
/*     */   public final int component3() {
/*     */     return this.maxResults;
/*     */   }
/*     */   
/*     */   public final double component4() {
/*     */     return this.minScore;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final IndexDescriptor component5() {
/*     */     return this.descriptor;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final String component6() {
/*     */     return this.pathFilter;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final SearchDescriptor component7() {
/*     */     return this.searchDescriptor;
/*     */   }
/*     */   
/*     */   public final int component8() {
/*     */     return this.step;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final List<SearchResultWithContent> component9() {
/*     */     return this.candidatesWithContent;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Request copy(@NotNull String text, @NotNull Snapshot snapshot, int maxResults, double minScore, @NotNull IndexDescriptor descriptor, @Nullable String pathFilter, @NotNull SearchDescriptor searchDescriptor, int step, @Nullable List<SearchResultWithContent> candidatesWithContent) {
/*     */     Intrinsics.checkNotNullParameter(text, "text");
/*     */     Intrinsics.checkNotNullParameter(snapshot, "snapshot");
/*     */     Intrinsics.checkNotNullParameter(descriptor, "descriptor");
/*     */     Intrinsics.checkNotNullParameter(searchDescriptor, "searchDescriptor");
/*     */     return new Request(text, snapshot, maxResults, minScore, descriptor, pathFilter, searchDescriptor, step, candidatesWithContent);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "Request(text=" + this.text + ", snapshot=" + this.snapshot + ", maxResults=" + this.maxResults + ", minScore=" + this.minScore + ", descriptor=" + this.descriptor + ", pathFilter=" + this.pathFilter + ", searchDescriptor=" + this.searchDescriptor + ", step=" + this.step + ", candidatesWithContent=" + this.candidatesWithContent + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.text.hashCode();
/*     */     result = result * 31 + this.snapshot.hashCode();
/*     */     result = result * 31 + Integer.hashCode(this.maxResults);
/*     */     result = result * 31 + Double.hashCode(this.minScore);
/*     */     result = result * 31 + this.descriptor.hashCode();
/*     */     result = result * 31 + ((this.pathFilter == null) ? 0 : this.pathFilter.hashCode());
/*     */     result = result * 31 + this.searchDescriptor.hashCode();
/*     */     result = result * 31 + Integer.hashCode(this.step);
/*     */     return result * 31 + ((this.candidatesWithContent == null) ? 0 : this.candidatesWithContent.hashCode());
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof Request))
/*     */       return false; 
/*     */     Request request = (Request)other;
/*     */     return !Intrinsics.areEqual(this.text, request.text) ? false : (!Intrinsics.areEqual(this.snapshot, request.snapshot) ? false : ((this.maxResults != request.maxResults) ? false : ((Double.compare(this.minScore, request.minScore) != 0) ? false : (!Intrinsics.areEqual(this.descriptor, request.descriptor) ? false : (!Intrinsics.areEqual(this.pathFilter, request.pathFilter) ? false : (!Intrinsics.areEqual(this.searchDescriptor, request.searchDescriptor) ? false : ((this.step != request.step) ? false : (!!Intrinsics.areEqual(this.candidatesWithContent, request.candidatesWithContent)))))))));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\indexing\SearchAPI$SearchRefine$Request.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */