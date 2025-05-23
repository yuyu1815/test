/*    */ package ai.grazie.code.indexing.model.search;
/*    */ import java.util.List;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.JvmField;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.ArrayListSerializer;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.LongSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000R\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\t\n\000\n\002\030\002\n\002\b\r\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 (2\0020\001:\002'(B;\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\016\020\006\032\n\022\004\022\0020\b\030\0010\007\022\006\020\t\032\0020\n\022\b\020\013\032\004\030\0010\f¢\006\002\020\rB#\022\006\020\004\032\0020\005\022\f\020\006\032\b\022\004\022\0020\b0\007\022\006\020\t\032\0020\n¢\006\002\020\016J\t\020\025\032\0020\005HÆ\003J\017\020\026\032\b\022\004\022\0020\b0\007HÆ\003J\t\020\027\032\0020\nHÆ\003J-\020\030\032\0020\0002\b\b\002\020\004\032\0020\0052\016\b\002\020\006\032\b\022\004\022\0020\b0\0072\b\b\002\020\t\032\0020\nHÆ\001J\023\020\031\032\0020\0322\b\020\033\032\004\030\0010\001HÖ\003J\t\020\034\032\0020\003HÖ\001J\t\020\035\032\0020\036HÖ\001J&\020\037\032\0020 2\006\020!\032\0020\0002\006\020\"\032\0020#2\006\020$\032\0020%HÁ\001¢\006\002\b&R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\017\020\020R\027\020\006\032\b\022\004\022\0020\b0\007¢\006\b\n\000\032\004\b\021\020\022R\021\020\t\032\0020\n¢\006\b\n\000\032\004\b\023\020\024¨\006)"}, d2 = {"Lai/grazie/code/indexing/model/search/SearchResults;", "", "seen1", "", "query", "Lai/grazie/code/indexing/model/search/SearchQuestion;", "results", "", "Lai/grazie/code/indexing/model/search/SearchResultWithType;", "totalQueryTime", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/code/indexing/model/search/SearchQuestion;Ljava/util/List;JLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/code/indexing/model/search/SearchQuestion;Ljava/util/List;J)V", "getQuery", "()Lai/grazie/code/indexing/model/search/SearchQuestion;", "getResults", "()Ljava/util/List;", "getTotalQueryTime", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_indexing", "$serializer", "Companion", "model-indexing"})
/*    */ public final class SearchResults {
/*    */   @NotNull
/*    */   private final SearchQuestion query;
/*    */   @NotNull
/*    */   private final List<SearchResultWithType> results;
/*    */   private final long totalQueryTime;
/*    */   @NotNull
/* 37 */   public static final Companion Companion = new Companion(null); @JvmField
/*    */   @NotNull
/*    */   private static final KSerializer<Object>[] $childSerializers; public SearchResults(@NotNull SearchQuestion query, @NotNull List<SearchResultWithType> results, long totalQueryTime) {
/* 40 */     this.query = query;
/* 41 */     this.results = results;
/* 42 */     this.totalQueryTime = totalQueryTime; } public final long getTotalQueryTime() { return this.totalQueryTime; }
/*    */ 
/*    */   
/*    */   static {
/*    */     KSerializer[] arrayOfKSerializer = new KSerializer[3];
/*    */     arrayOfKSerializer[0] = null;
/*    */     arrayOfKSerializer[1] = (KSerializer)new ArrayListSerializer((KSerializer)SearchResultWithType.$serializer.INSTANCE);
/*    */     arrayOfKSerializer[2] = null;
/*    */     $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*    */   }
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/code/indexing/model/search/SearchResults.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/code/indexing/model/search/SearchResults;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-indexing"})
/*    */   public static final class $serializer implements GeneratedSerializer<SearchResults> {
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
/*    */       KSerializer[] arrayOfKSerializer1 = (KSerializer[])SearchResults.$childSerializers, arrayOfKSerializer2 = new KSerializer[3];
/*    */       arrayOfKSerializer2[0] = (KSerializer)SearchQuestion.$serializer.INSTANCE;
/*    */       arrayOfKSerializer2[1] = arrayOfKSerializer1[1];
/*    */       arrayOfKSerializer2[2] = (KSerializer)LongSerializer.INSTANCE;
/*    */       return (KSerializer<?>[])arrayOfKSerializer2;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public SearchResults deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       SearchQuestion searchQuestion = null;
/*    */       List list = null;
/*    */       long l = 0L;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       KSerializer[] arrayOfKSerializer = (KSerializer[])SearchResults.$childSerializers;
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         searchQuestion = (SearchQuestion)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)SearchQuestion.$serializer.INSTANCE, searchQuestion);
/*    */         i |= 0x1;
/*    */         list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], list);
/*    */         i |= 0x2;
/*    */         l = compositeDecoder.decodeLongElement(serialDescriptor, 2);
/*    */         i |= 0x4;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               searchQuestion = (SearchQuestion)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)SearchQuestion.$serializer.INSTANCE, searchQuestion);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], list);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               l = compositeDecoder.decodeLongElement(serialDescriptor, 2);
/*    */               i |= 0x4;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new SearchResults(i, searchQuestion, list, l, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull SearchResults value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       SearchResults.write$Self$model_indexing(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.code.indexing.model.search.SearchResults", INSTANCE, 3);
/*    */       pluginGeneratedSerialDescriptor.addElement("query", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("results", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("totalQueryTime", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/code/indexing/model/search/SearchResults$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/code/indexing/model/search/SearchResults;", "model-indexing"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<SearchResults> serializer() {
/*    */       return (KSerializer<SearchResults>)SearchResults.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SearchQuestion getQuery() {
/*    */     return this.query;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<SearchResultWithType> getResults() {
/*    */     return this.results;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SearchQuestion component1() {
/*    */     return this.query;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<SearchResultWithType> component2() {
/*    */     return this.results;
/*    */   }
/*    */   
/*    */   public final long component3() {
/*    */     return this.totalQueryTime;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SearchResults copy(@NotNull SearchQuestion query, @NotNull List<SearchResultWithType> results, long totalQueryTime) {
/*    */     Intrinsics.checkNotNullParameter(query, "query");
/*    */     Intrinsics.checkNotNullParameter(results, "results");
/*    */     return new SearchResults(query, results, totalQueryTime);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "SearchResults(query=" + this.query + ", results=" + this.results + ", totalQueryTime=" + this.totalQueryTime + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.query.hashCode();
/*    */     result = result * 31 + this.results.hashCode();
/*    */     return result * 31 + Long.hashCode(this.totalQueryTime);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof SearchResults))
/*    */       return false; 
/*    */     SearchResults searchResults = (SearchResults)other;
/*    */     return !Intrinsics.areEqual(this.query, searchResults.query) ? false : (!Intrinsics.areEqual(this.results, searchResults.results) ? false : (!(this.totalQueryTime != searchResults.totalQueryTime)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-indexing-jvm-0.4.32.jar!\ai\grazie\code\indexing\model\search\SearchResults.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */