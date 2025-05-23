/*    */ package ai.grazie.code.indexing.model.search;
/*    */ 
/*    */ import ai.grazie.code.indexing.model.snapshot.Snapshot;
/*    */ import ai.grazie.code.indexing.model.snapshot.Snapshot$;
/*    */ import java.util.List;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.JvmField;
/*    */ import kotlin.jvm.JvmStatic;
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
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\r\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 '2\0020\001:\002&'B=\b\021\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\b\020\007\032\004\030\0010\b\022\b\020\t\032\004\030\0010\n\022\b\020\013\032\004\030\0010\f¢\006\002\020\rB#\022\f\020\004\032\b\022\004\022\0020\0060\005\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n¢\006\002\020\016J\017\020\025\032\b\022\004\022\0020\0060\005HÆ\003J\t\020\026\032\0020\bHÆ\003J\t\020\027\032\0020\nHÆ\003J-\020\030\032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\0052\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\nHÆ\001J\023\020\031\032\0020\0322\b\020\033\032\004\030\0010\001HÖ\003J\t\020\034\032\0020\003HÖ\001J\t\020\035\032\0020\bHÖ\001J&\020\036\032\0020\0372\006\020 \032\0020\0002\006\020!\032\0020\"2\006\020#\032\0020$HÁ\001¢\006\002\b%R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\017\020\020R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\021\020\022R\021\020\t\032\0020\n¢\006\b\n\000\032\004\b\023\020\024¨\006("}, d2 = {"Lai/grazie/code/indexing/model/search/SearchResponseInRepository;", "", "seen1", "", "searches", "", "Lai/grazie/code/indexing/model/search/SearchResults;", "indexDescriptor", "", "snapshot", "Lai/grazie/code/indexing/model/snapshot/Snapshot;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/lang/String;Lai/grazie/code/indexing/model/snapshot/Snapshot;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;Ljava/lang/String;Lai/grazie/code/indexing/model/snapshot/Snapshot;)V", "getIndexDescriptor", "()Ljava/lang/String;", "getSearches", "()Ljava/util/List;", "getSnapshot", "()Lai/grazie/code/indexing/model/snapshot/Snapshot;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_indexing", "$serializer", "Companion", "model-indexing"})
/*    */ public final class SearchResponseInRepository
/*    */ {
/*    */   @NotNull
/*    */   private final List<SearchResults> searches;
/*    */   @NotNull
/*    */   private final String indexDescriptor;
/*    */   @NotNull
/*    */   private final Snapshot snapshot;
/*    */   @NotNull
/* 45 */   public static final Companion Companion = new Companion(null); @JvmField
/*    */   @NotNull
/*    */   private static final KSerializer<Object>[] $childSerializers; public SearchResponseInRepository(@NotNull List<SearchResults> searches, @NotNull String indexDescriptor, @NotNull Snapshot snapshot) {
/* 48 */     this.searches = searches;
/* 49 */     this.indexDescriptor = indexDescriptor;
/* 50 */     this.snapshot = snapshot; } @NotNull public final Snapshot getSnapshot() { return this.snapshot; }
/*    */ 
/*    */   
/*    */   static {
/*    */     KSerializer[] arrayOfKSerializer = new KSerializer[3];
/*    */     arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)SearchResults.$serializer.INSTANCE);
/*    */     arrayOfKSerializer[1] = null;
/*    */     arrayOfKSerializer[2] = null;
/*    */     $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*    */   }
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/code/indexing/model/search/SearchResponseInRepository.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/code/indexing/model/search/SearchResponseInRepository;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-indexing"})
/*    */   public static final class $serializer implements GeneratedSerializer<SearchResponseInRepository> {
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
/*    */       KSerializer[] arrayOfKSerializer1 = (KSerializer[])SearchResponseInRepository.$childSerializers, arrayOfKSerializer2 = new KSerializer[3];
/*    */       arrayOfKSerializer2[0] = arrayOfKSerializer1[0];
/*    */       arrayOfKSerializer2[1] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer2[2] = (KSerializer)Snapshot$.serializer.INSTANCE;
/*    */       return (KSerializer<?>[])arrayOfKSerializer2;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public SearchResponseInRepository deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       List list = null;
/*    */       String str = null;
/*    */       Snapshot snapshot = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       KSerializer[] arrayOfKSerializer = (KSerializer[])SearchResponseInRepository.$childSerializers;
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list);
/*    */         i |= 0x1;
/*    */         str = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*    */         i |= 0x2;
/*    */         snapshot = (Snapshot)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Snapshot$.serializer.INSTANCE, snapshot);
/*    */         i |= 0x4;
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
/*    */               str = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               snapshot = (Snapshot)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Snapshot$.serializer.INSTANCE, snapshot);
/*    */               i |= 0x4;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new SearchResponseInRepository(i, list, str, snapshot, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull SearchResponseInRepository value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       SearchResponseInRepository.write$Self$model_indexing(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.code.indexing.model.search.SearchResponseInRepository", INSTANCE, 3);
/*    */       pluginGeneratedSerialDescriptor.addElement("searches", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("indexDescriptor", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("snapshot", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/code/indexing/model/search/SearchResponseInRepository$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/code/indexing/model/search/SearchResponseInRepository;", "model-indexing"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<SearchResponseInRepository> serializer() {
/*    */       return (KSerializer<SearchResponseInRepository>)SearchResponseInRepository.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<SearchResults> getSearches() {
/*    */     return this.searches;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getIndexDescriptor() {
/*    */     return this.indexDescriptor;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<SearchResults> component1() {
/*    */     return this.searches;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.indexDescriptor;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Snapshot component3() {
/*    */     return this.snapshot;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SearchResponseInRepository copy(@NotNull List<SearchResults> searches, @NotNull String indexDescriptor, @NotNull Snapshot snapshot) {
/*    */     Intrinsics.checkNotNullParameter(searches, "searches");
/*    */     Intrinsics.checkNotNullParameter(indexDescriptor, "indexDescriptor");
/*    */     Intrinsics.checkNotNullParameter(snapshot, "snapshot");
/*    */     return new SearchResponseInRepository(searches, indexDescriptor, snapshot);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "SearchResponseInRepository(searches=" + this.searches + ", indexDescriptor=" + this.indexDescriptor + ", snapshot=" + this.snapshot + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.searches.hashCode();
/*    */     result = result * 31 + this.indexDescriptor.hashCode();
/*    */     return result * 31 + this.snapshot.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof SearchResponseInRepository))
/*    */       return false; 
/*    */     SearchResponseInRepository searchResponseInRepository = (SearchResponseInRepository)other;
/*    */     return !Intrinsics.areEqual(this.searches, searchResponseInRepository.searches) ? false : (!Intrinsics.areEqual(this.indexDescriptor, searchResponseInRepository.indexDescriptor) ? false : (!!Intrinsics.areEqual(this.snapshot, searchResponseInRepository.snapshot)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-indexing-jvm-0.4.32.jar!\ai\grazie\code\indexing\model\search\SearchResponseInRepository.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */