/*     */ package ai.grazie.qa;
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
/*     */ import kotlinx.serialization.SerialName;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Serializable
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\020\006\n\002\b\002\n\002\030\002\n\002\b\023\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 /2\0020\001:\002./BW\b\021\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\b\020\007\032\004\030\0010\b\022\b\020\t\032\004\030\0010\b\022\b\b\001\020\n\032\0020\013\022\016\020\f\032\n\022\004\022\0020\b\030\0010\005\022\b\020\r\032\004\030\0010\016¢\006\002\020\017B;\022\f\020\004\032\b\022\004\022\0020\0060\005\022\006\020\007\032\0020\b\022\b\020\t\032\004\030\0010\b\022\006\020\n\032\0020\013\022\f\020\f\032\b\022\004\022\0020\b0\005¢\006\002\020\020J\017\020\033\032\b\022\004\022\0020\0060\005HÆ\003J\t\020\034\032\0020\bHÆ\003J\013\020\035\032\004\030\0010\bHÆ\003J\t\020\036\032\0020\013HÆ\003J\017\020\037\032\b\022\004\022\0020\b0\005HÆ\003JI\020 \032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\0052\b\b\002\020\007\032\0020\b2\n\b\002\020\t\032\004\030\0010\b2\b\b\002\020\n\032\0020\0132\016\b\002\020\f\032\b\022\004\022\0020\b0\005HÆ\001J\023\020!\032\0020\"2\b\020#\032\004\030\0010\001HÖ\003J\t\020$\032\0020\003HÖ\001J\t\020%\032\0020\bHÖ\001J&\020&\032\0020'2\006\020(\032\0020\0002\006\020)\032\0020*2\006\020+\032\0020,HÁ\001¢\006\002\b-R\023\020\t\032\004\030\0010\b¢\006\b\n\000\032\004\b\021\020\022R\027\020\f\032\b\022\004\022\0020\b0\005¢\006\b\n\000\032\004\b\023\020\024R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\025\020\022R\034\020\n\032\0020\0138\006X\004¢\006\016\n\000\022\004\b\026\020\027\032\004\b\030\020\031R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\032\020\024¨\0060"}, d2 = {"Lai/grazie/qa/SearchWebResponse;", "", "seen1", "", "results", "", "Lai/grazie/qa/SearchWebResult;", "query", "", "answer", "responseTime", "", "images", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;DLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;DLjava/util/List;)V", "getAnswer", "()Ljava/lang/String;", "getImages", "()Ljava/util/List;", "getQuery", "getResponseTime$annotations", "()V", "getResponseTime", "()D", "getResults", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_qa", "$serializer", "Companion", "model-qa"})
/*     */ public final class SearchWebResponse
/*     */ {
/*     */   @NotNull
/*     */   private final List<SearchWebResult> results;
/*     */   @NotNull
/*     */   private final String query;
/*     */   @Nullable
/*     */   private final String answer;
/*     */   private final double responseTime;
/*     */   @NotNull
/*     */   private final List<String> images;
/*     */   @NotNull
/* 115 */   public static final Companion Companion = new Companion(null); @JvmField
/*     */   @NotNull
/*     */   private static final KSerializer<Object>[] $childSerializers; public SearchWebResponse(@NotNull List<SearchWebResult> results, @NotNull String query, @Nullable String answer, double responseTime, @NotNull List<String> images) {
/* 118 */     this.results = results;
/* 119 */     this.query = query;
/* 120 */     this.answer = answer;
/* 121 */     this.responseTime = responseTime;
/* 122 */     this.images = images; } @NotNull public final List<String> getImages() { return this.images; }
/*     */ 
/*     */   
/*     */   static {
/*     */     KSerializer[] arrayOfKSerializer = new KSerializer[5];
/*     */     arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)SearchWebResult.$serializer.INSTANCE);
/*     */     arrayOfKSerializer[1] = null;
/*     */     arrayOfKSerializer[2] = null;
/*     */     arrayOfKSerializer[3] = null;
/*     */     arrayOfKSerializer[4] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE);
/*     */     $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*     */   }
/*     */   
/*     */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/qa/SearchWebResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/qa/SearchWebResponse;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-qa"})
/*     */   public static final class $serializer implements GeneratedSerializer<SearchWebResponse> {
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
/*     */       KSerializer[] arrayOfKSerializer1 = (KSerializer[])SearchWebResponse.$childSerializers, arrayOfKSerializer2 = new KSerializer[5];
/*     */       arrayOfKSerializer2[0] = arrayOfKSerializer1[0];
/*     */       arrayOfKSerializer2[1] = (KSerializer)StringSerializer.INSTANCE;
/*     */       arrayOfKSerializer2[2] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*     */       arrayOfKSerializer2[3] = (KSerializer)DoubleSerializer.INSTANCE;
/*     */       arrayOfKSerializer2[4] = arrayOfKSerializer1[4];
/*     */       return (KSerializer<?>[])arrayOfKSerializer2;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public SearchWebResponse deserialize(@NotNull Decoder decoder) {
/*     */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */       SerialDescriptor serialDescriptor = getDescriptor();
/*     */       boolean bool = true;
/*     */       int i = 0;
/*     */       List list1 = null;
/*     */       String str1 = null, str2 = null;
/*     */       double d = 0.0D;
/*     */       List list2 = null;
/*     */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */       KSerializer[] arrayOfKSerializer = (KSerializer[])SearchWebResponse.$childSerializers;
/*     */       if (compositeDecoder.decodeSequentially()) {
/*     */         list1 = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list1);
/*     */         i |= 0x1;
/*     */         str1 = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*     */         i |= 0x2;
/*     */         str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)StringSerializer.INSTANCE, str2);
/*     */         i |= 0x4;
/*     */         d = compositeDecoder.decodeDoubleElement(serialDescriptor, 3);
/*     */         i |= 0x8;
/*     */         list2 = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy)arrayOfKSerializer[4], list2);
/*     */         i |= 0x10;
/*     */       } else {
/*     */         while (bool) {
/*     */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */           switch (j) {
/*     */             case -1:
/*     */               bool = false;
/*     */               continue;
/*     */             case 0:
/*     */               list1 = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list1);
/*     */               i |= 0x1;
/*     */               continue;
/*     */             case 1:
/*     */               str1 = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*     */               i |= 0x2;
/*     */               continue;
/*     */             case 2:
/*     */               str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)StringSerializer.INSTANCE, str2);
/*     */               i |= 0x4;
/*     */               continue;
/*     */             case 3:
/*     */               d = compositeDecoder.decodeDoubleElement(serialDescriptor, 3);
/*     */               i |= 0x8;
/*     */               continue;
/*     */             case 4:
/*     */               list2 = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy)arrayOfKSerializer[4], list2);
/*     */               i |= 0x10;
/*     */               continue;
/*     */           } 
/*     */           throw new UnknownFieldException(j);
/*     */         } 
/*     */       } 
/*     */       compositeDecoder.endStructure(serialDescriptor);
/*     */       return new SearchWebResponse(i, list1, str1, str2, d, list2, null);
/*     */     }
/*     */     
/*     */     public void serialize(@NotNull Encoder encoder, @NotNull SearchWebResponse value) {
/*     */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */       Intrinsics.checkNotNullParameter(value, "value");
/*     */       SerialDescriptor serialDescriptor = getDescriptor();
/*     */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */       SearchWebResponse.write$Self$model_qa(value, compositeEncoder, serialDescriptor);
/*     */       compositeEncoder.endStructure(serialDescriptor);
/*     */     }
/*     */     
/*     */     static {
/*     */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.qa.SearchWebResponse", INSTANCE, 5);
/*     */       pluginGeneratedSerialDescriptor.addElement("results", false);
/*     */       pluginGeneratedSerialDescriptor.addElement("query", false);
/*     */       pluginGeneratedSerialDescriptor.addElement("answer", false);
/*     */       pluginGeneratedSerialDescriptor.addElement("response_time", false);
/*     */       pluginGeneratedSerialDescriptor.addElement("images", false);
/*     */       descriptor = pluginGeneratedSerialDescriptor;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/qa/SearchWebResponse$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/qa/SearchWebResponse;", "model-qa"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final KSerializer<SearchWebResponse> serializer() {
/*     */       return (KSerializer<SearchWebResponse>)SearchWebResponse.$serializer.INSTANCE;
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<SearchWebResult> getResults() {
/*     */     return this.results;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String getQuery() {
/*     */     return this.query;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final String getAnswer() {
/*     */     return this.answer;
/*     */   }
/*     */   
/*     */   public final double getResponseTime() {
/*     */     return this.responseTime;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<SearchWebResult> component1() {
/*     */     return this.results;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component2() {
/*     */     return this.query;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final String component3() {
/*     */     return this.answer;
/*     */   }
/*     */   
/*     */   public final double component4() {
/*     */     return this.responseTime;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<String> component5() {
/*     */     return this.images;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final SearchWebResponse copy(@NotNull List<SearchWebResult> results, @NotNull String query, @Nullable String answer, double responseTime, @NotNull List<String> images) {
/*     */     Intrinsics.checkNotNullParameter(results, "results");
/*     */     Intrinsics.checkNotNullParameter(query, "query");
/*     */     Intrinsics.checkNotNullParameter(images, "images");
/*     */     return new SearchWebResponse(results, query, answer, responseTime, images);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "SearchWebResponse(results=" + this.results + ", query=" + this.query + ", answer=" + this.answer + ", responseTime=" + this.responseTime + ", images=" + this.images + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.results.hashCode();
/*     */     result = result * 31 + this.query.hashCode();
/*     */     result = result * 31 + ((this.answer == null) ? 0 : this.answer.hashCode());
/*     */     result = result * 31 + Double.hashCode(this.responseTime);
/*     */     return result * 31 + this.images.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof SearchWebResponse))
/*     */       return false; 
/*     */     SearchWebResponse searchWebResponse = (SearchWebResponse)other;
/*     */     return !Intrinsics.areEqual(this.results, searchWebResponse.results) ? false : (!Intrinsics.areEqual(this.query, searchWebResponse.query) ? false : (!Intrinsics.areEqual(this.answer, searchWebResponse.answer) ? false : ((Double.compare(this.responseTime, searchWebResponse.responseTime) != 0) ? false : (!!Intrinsics.areEqual(this.images, searchWebResponse.images)))));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-qa-jvm-0.4.32.jar!\ai\grazie\qa\SearchWebResponse.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */