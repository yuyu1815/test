/*    */ package ai.grazie.code.indexing.model.search;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000V\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020$\n\002\020\t\n\000\n\002\030\002\n\002\b\020\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 -2\0020\001:\002,-BS\b\021\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\b\020\007\032\004\030\0010\b\022\b\020\t\032\004\030\0010\n\022\024\020\013\032\020\022\004\022\0020\n\022\004\022\0020\r\030\0010\f\022\b\020\016\032\004\030\0010\017¢\006\002\020\020B7\022\f\020\004\032\b\022\004\022\0020\0060\005\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n\022\022\020\013\032\016\022\004\022\0020\n\022\004\022\0020\r0\f¢\006\002\020\021J\017\020\032\032\b\022\004\022\0020\0060\005HÆ\003J\t\020\033\032\0020\bHÆ\003J\t\020\034\032\0020\nHÆ\003J\025\020\035\032\016\022\004\022\0020\n\022\004\022\0020\r0\fHÆ\003JC\020\036\032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\0052\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\n2\024\b\002\020\013\032\016\022\004\022\0020\n\022\004\022\0020\r0\fHÆ\001J\023\020\037\032\0020 2\b\020!\032\004\030\0010\001HÖ\003J\t\020\"\032\0020\003HÖ\001J\t\020#\032\0020\nHÖ\001J&\020$\032\0020%2\006\020&\032\0020\0002\006\020'\032\0020(2\006\020)\032\0020*HÁ\001¢\006\002\b+R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\022\020\023R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\024\020\025R\021\020\t\032\0020\n¢\006\b\n\000\032\004\b\026\020\027R\035\020\013\032\016\022\004\022\0020\n\022\004\022\0020\r0\f¢\006\b\n\000\032\004\b\030\020\031¨\006."}, d2 = {"Lai/grazie/code/indexing/model/search/SearchResponse;", "", "seen1", "", "res", "", "Lai/grazie/code/indexing/model/search/SearchResultWithType;", "indexDescriptor", "Lai/grazie/code/indexing/model/IndexDescriptor;", "revision", "", "timings", "", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lai/grazie/code/indexing/model/IndexDescriptor;Ljava/lang/String;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;Lai/grazie/code/indexing/model/IndexDescriptor;Ljava/lang/String;Ljava/util/Map;)V", "getIndexDescriptor", "()Lai/grazie/code/indexing/model/IndexDescriptor;", "getRes", "()Ljava/util/List;", "getRevision", "()Ljava/lang/String;", "getTimings", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_indexing", "$serializer", "Companion", "model-indexing"})
/*    */ public final class SearchResponse {
/*    */   @NotNull
/*  7 */   public static final Companion Companion = new Companion(null); @NotNull private final List<SearchResultWithType> res; @NotNull private final IndexDescriptor indexDescriptor; @NotNull private final String revision; @NotNull private final Map<String, Long> timings; @JvmField
/*    */   @NotNull
/*  9 */   private static final KSerializer<Object>[] $childSerializers; public SearchResponse(@NotNull List<SearchResultWithType> res, @NotNull IndexDescriptor indexDescriptor, @NotNull String revision, @NotNull Map<String, Long> timings) { this.res = res;
/* 10 */     this.indexDescriptor = indexDescriptor;
/* 11 */     this.revision = revision;
/* 12 */     this.timings = timings; } static { KSerializer[] arrayOfKSerializer = new KSerializer[4]; arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)SearchResultWithType.$serializer.INSTANCE); arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = null; arrayOfKSerializer[3] = (KSerializer)new LinkedHashMapSerializer((KSerializer)StringSerializer.INSTANCE, (KSerializer)LongSerializer.INSTANCE); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @NotNull public final Map<String, Long> getTimings() { return this.timings; }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/code/indexing/model/search/SearchResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/code/indexing/model/search/SearchResponse;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-indexing"})
/*    */   public static final class $serializer implements GeneratedSerializer<SearchResponse> {
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
/*    */       KSerializer[] arrayOfKSerializer1 = (KSerializer[])SearchResponse.$childSerializers, arrayOfKSerializer2 = new KSerializer[4];
/*    */       arrayOfKSerializer2[0] = arrayOfKSerializer1[0];
/*    */       arrayOfKSerializer2[1] = (KSerializer)IndexDescriptor$.serializer.INSTANCE;
/*    */       arrayOfKSerializer2[2] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer2[3] = arrayOfKSerializer1[3];
/*    */       return (KSerializer<?>[])arrayOfKSerializer2;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public SearchResponse deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       List list = null;
/*    */       IndexDescriptor indexDescriptor = null;
/*    */       String str = null;
/*    */       Map map = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       KSerializer[] arrayOfKSerializer = (KSerializer[])SearchResponse.$childSerializers;
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list);
/*    */         i |= 0x1;
/*    */         indexDescriptor = (IndexDescriptor)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)IndexDescriptor$.serializer.INSTANCE, indexDescriptor);
/*    */         i |= 0x2;
/*    */         str = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*    */         i |= 0x4;
/*    */         map = (Map)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)arrayOfKSerializer[3], map);
/*    */         i |= 0x8;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               indexDescriptor = (IndexDescriptor)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)IndexDescriptor$.serializer.INSTANCE, indexDescriptor);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               str = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*    */               i |= 0x4;
/*    */               continue;
/*    */             case 3:
/*    */               map = (Map)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)arrayOfKSerializer[3], map);
/*    */               i |= 0x8;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new SearchResponse(i, list, indexDescriptor, str, map, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull SearchResponse value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       SearchResponse.write$Self$model_indexing(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.code.indexing.model.search.SearchResponse", INSTANCE, 4);
/*    */       pluginGeneratedSerialDescriptor.addElement("res", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("indexDescriptor", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("revision", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("timings", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/code/indexing/model/search/SearchResponse$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/code/indexing/model/search/SearchResponse;", "model-indexing"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<SearchResponse> serializer() {
/*    */       return (KSerializer<SearchResponse>)SearchResponse.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<SearchResultWithType> getRes() {
/*    */     return this.res;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final IndexDescriptor getIndexDescriptor() {
/*    */     return this.indexDescriptor;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getRevision() {
/*    */     return this.revision;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<SearchResultWithType> component1() {
/*    */     return this.res;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final IndexDescriptor component2() {
/*    */     return this.indexDescriptor;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component3() {
/*    */     return this.revision;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Map<String, Long> component4() {
/*    */     return this.timings;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SearchResponse copy(@NotNull List<SearchResultWithType> res, @NotNull IndexDescriptor indexDescriptor, @NotNull String revision, @NotNull Map<String, Long> timings) {
/*    */     Intrinsics.checkNotNullParameter(res, "res");
/*    */     Intrinsics.checkNotNullParameter(indexDescriptor, "indexDescriptor");
/*    */     Intrinsics.checkNotNullParameter(revision, "revision");
/*    */     Intrinsics.checkNotNullParameter(timings, "timings");
/*    */     return new SearchResponse(res, indexDescriptor, revision, timings);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "SearchResponse(res=" + this.res + ", indexDescriptor=" + this.indexDescriptor + ", revision=" + this.revision + ", timings=" + this.timings + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.res.hashCode();
/*    */     result = result * 31 + this.indexDescriptor.hashCode();
/*    */     result = result * 31 + this.revision.hashCode();
/*    */     return result * 31 + this.timings.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof SearchResponse))
/*    */       return false; 
/*    */     SearchResponse searchResponse = (SearchResponse)other;
/*    */     return !Intrinsics.areEqual(this.res, searchResponse.res) ? false : (!Intrinsics.areEqual(this.indexDescriptor, searchResponse.indexDescriptor) ? false : (!Intrinsics.areEqual(this.revision, searchResponse.revision) ? false : (!!Intrinsics.areEqual(this.timings, searchResponse.timings))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-indexing-jvm-0.4.32.jar!\ai\grazie\code\indexing\model\search\SearchResponse.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */