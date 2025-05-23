/*     */ package ai.grazie.qa;
/*     */ 
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ReplaceWith;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\003\n\002\020\006\n\002\b\003\n\002\030\002\n\002\b\025\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 02\0020\001:\002/0BW\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\005\022\b\020\007\032\004\030\0010\005\022\006\020\b\032\0020\t\022\n\b\001\020\n\032\004\030\0010\005\022\n\b\001\020\013\032\004\030\0010\005\022\b\020\f\032\004\030\0010\r¢\006\002\020\016B=\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\006\020\007\032\0020\005\022\006\020\b\032\0020\t\022\n\b\002\020\n\032\004\030\0010\005\022\n\b\002\020\013\032\004\030\0010\005¢\006\002\020\017J\t\020\033\032\0020\005HÆ\003J\t\020\034\032\0020\005HÆ\003J\t\020\035\032\0020\005HÆ\003J\t\020\036\032\0020\tHÆ\003J\013\020\037\032\004\030\0010\005HÆ\003J\013\020 \032\004\030\0010\005HÆ\003JI\020!\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0052\b\b\002\020\007\032\0020\0052\b\b\002\020\b\032\0020\t2\n\b\002\020\n\032\004\030\0010\0052\n\b\002\020\013\032\004\030\0010\005HÆ\001J\023\020\"\032\0020#2\b\020$\032\004\030\0010\001HÖ\003J\t\020%\032\0020\003HÖ\001J\t\020&\032\0020\005HÖ\001J&\020'\032\0020(2\006\020)\032\0020\0002\006\020*\032\0020+2\006\020,\032\0020-HÁ\001¢\006\002\b.R\021\020\007\032\0020\005¢\006\b\n\000\032\004\b\020\020\021R\036\020\013\032\004\030\0010\0058\006X\004¢\006\016\n\000\022\004\b\022\020\023\032\004\b\024\020\021R\036\020\n\032\004\030\0010\0058\006X\004¢\006\016\n\000\022\004\b\025\020\023\032\004\b\026\020\021R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\027\020\030R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\031\020\021R\021\020\006\032\0020\005¢\006\b\n\000\032\004\b\032\020\021¨\0061"}, d2 = {"Lai/grazie/qa/SearchWebResult;", "", "seen1", "", "title", "", "url", "content", "score", "", "rawContent", "publishedDate", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getPublishedDate$annotations", "()V", "getPublishedDate", "getRawContent$annotations", "getRawContent", "getScore", "()D", "getTitle", "getUrl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_qa", "$serializer", "Companion", "model-qa"})
/*     */ public final class SearchWebResult
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final String title;
/*     */   @NotNull
/*     */   private final String url;
/*     */   @NotNull
/*     */   private final String content;
/*     */   private final double score;
/*     */   @Nullable
/*     */   private final String rawContent;
/*     */   @Nullable
/*     */   private final String publishedDate;
/*     */   
/*     */   public SearchWebResult(@NotNull String title, @NotNull String url, @NotNull String content, double score, @Nullable String rawContent, @Nullable String publishedDate) {
/* 138 */     this.title = title;
/* 139 */     this.url = url;
/* 140 */     this.content = content;
/* 141 */     this.score = score;
/* 142 */     this.rawContent = rawContent;
/* 143 */     this.publishedDate = publishedDate; } @Nullable public final String getPublishedDate() { return this.publishedDate; }
/*     */ 
/*     */   
/*     */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/qa/SearchWebResult.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/qa/SearchWebResult;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-qa"})
/*     */   public static final class $serializer implements GeneratedSerializer<SearchWebResult> {
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
/*     */       KSerializer[] arrayOfKSerializer = new KSerializer[6];
/*     */       arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE;
/*     */       arrayOfKSerializer[1] = (KSerializer)StringSerializer.INSTANCE;
/*     */       arrayOfKSerializer[2] = (KSerializer)StringSerializer.INSTANCE;
/*     */       arrayOfKSerializer[3] = (KSerializer)DoubleSerializer.INSTANCE;
/*     */       arrayOfKSerializer[4] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*     */       arrayOfKSerializer[5] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*     */       return (KSerializer<?>[])arrayOfKSerializer;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public SearchWebResult deserialize(@NotNull Decoder decoder) {
/*     */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */       SerialDescriptor serialDescriptor = getDescriptor();
/*     */       boolean bool = true;
/*     */       int i = 0;
/*     */       String str1 = null, str2 = null, str3 = null;
/*     */       double d = 0.0D;
/*     */       String str4 = null, str5 = null;
/*     */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */       if (compositeDecoder.decodeSequentially()) {
/*     */         str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*     */         i |= 0x1;
/*     */         str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*     */         i |= 0x2;
/*     */         str3 = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*     */         i |= 0x4;
/*     */         d = compositeDecoder.decodeDoubleElement(serialDescriptor, 3);
/*     */         i |= 0x8;
/*     */         str4 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)StringSerializer.INSTANCE, str4);
/*     */         i |= 0x10;
/*     */         str5 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy)StringSerializer.INSTANCE, str5);
/*     */         i |= 0x20;
/*     */       } else {
/*     */         while (bool) {
/*     */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */           switch (j) {
/*     */             case -1:
/*     */               bool = false;
/*     */               continue;
/*     */             case 0:
/*     */               str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*     */               i |= 0x1;
/*     */               continue;
/*     */             case 1:
/*     */               str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*     */               i |= 0x2;
/*     */               continue;
/*     */             case 2:
/*     */               str3 = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*     */               i |= 0x4;
/*     */               continue;
/*     */             case 3:
/*     */               d = compositeDecoder.decodeDoubleElement(serialDescriptor, 3);
/*     */               i |= 0x8;
/*     */               continue;
/*     */             case 4:
/*     */               str4 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)StringSerializer.INSTANCE, str4);
/*     */               i |= 0x10;
/*     */               continue;
/*     */             case 5:
/*     */               str5 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy)StringSerializer.INSTANCE, str5);
/*     */               i |= 0x20;
/*     */               continue;
/*     */           } 
/*     */           throw new UnknownFieldException(j);
/*     */         } 
/*     */       } 
/*     */       compositeDecoder.endStructure(serialDescriptor);
/*     */       return new SearchWebResult(i, str1, str2, str3, d, str4, str5, null);
/*     */     }
/*     */     
/*     */     public void serialize(@NotNull Encoder encoder, @NotNull SearchWebResult value) {
/*     */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */       Intrinsics.checkNotNullParameter(value, "value");
/*     */       SerialDescriptor serialDescriptor = getDescriptor();
/*     */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */       SearchWebResult.write$Self$model_qa(value, compositeEncoder, serialDescriptor);
/*     */       compositeEncoder.endStructure(serialDescriptor);
/*     */     }
/*     */     
/*     */     static {
/*     */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.qa.SearchWebResult", INSTANCE, 6);
/*     */       pluginGeneratedSerialDescriptor.addElement("title", false);
/*     */       pluginGeneratedSerialDescriptor.addElement("url", false);
/*     */       pluginGeneratedSerialDescriptor.addElement("content", false);
/*     */       pluginGeneratedSerialDescriptor.addElement("score", false);
/*     */       pluginGeneratedSerialDescriptor.addElement("raw_content", true);
/*     */       pluginGeneratedSerialDescriptor.addElement("published_date", true);
/*     */       descriptor = pluginGeneratedSerialDescriptor;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/qa/SearchWebResult$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/qa/SearchWebResult;", "model-qa"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final KSerializer<SearchWebResult> serializer() {
/*     */       return (KSerializer<SearchWebResult>)SearchWebResult.$serializer.INSTANCE;
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String getTitle() {
/*     */     return this.title;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String getUrl() {
/*     */     return this.url;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String getContent() {
/*     */     return this.content;
/*     */   }
/*     */   
/*     */   public final double getScore() {
/*     */     return this.score;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final String getRawContent() {
/*     */     return this.rawContent;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component1() {
/*     */     return this.title;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component2() {
/*     */     return this.url;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component3() {
/*     */     return this.content;
/*     */   }
/*     */   
/*     */   public final double component4() {
/*     */     return this.score;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final String component5() {
/*     */     return this.rawContent;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final String component6() {
/*     */     return this.publishedDate;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final SearchWebResult copy(@NotNull String title, @NotNull String url, @NotNull String content, double score, @Nullable String rawContent, @Nullable String publishedDate) {
/*     */     Intrinsics.checkNotNullParameter(title, "title");
/*     */     Intrinsics.checkNotNullParameter(url, "url");
/*     */     Intrinsics.checkNotNullParameter(content, "content");
/*     */     return new SearchWebResult(title, url, content, score, rawContent, publishedDate);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "SearchWebResult(title=" + this.title + ", url=" + this.url + ", content=" + this.content + ", score=" + this.score + ", rawContent=" + this.rawContent + ", publishedDate=" + this.publishedDate + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.title.hashCode();
/*     */     result = result * 31 + this.url.hashCode();
/*     */     result = result * 31 + this.content.hashCode();
/*     */     result = result * 31 + Double.hashCode(this.score);
/*     */     result = result * 31 + ((this.rawContent == null) ? 0 : this.rawContent.hashCode());
/*     */     return result * 31 + ((this.publishedDate == null) ? 0 : this.publishedDate.hashCode());
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof SearchWebResult))
/*     */       return false; 
/*     */     SearchWebResult searchWebResult = (SearchWebResult)other;
/*     */     return !Intrinsics.areEqual(this.title, searchWebResult.title) ? false : (!Intrinsics.areEqual(this.url, searchWebResult.url) ? false : (!Intrinsics.areEqual(this.content, searchWebResult.content) ? false : ((Double.compare(this.score, searchWebResult.score) != 0) ? false : (!Intrinsics.areEqual(this.rawContent, searchWebResult.rawContent) ? false : (!!Intrinsics.areEqual(this.publishedDate, searchWebResult.publishedDate))))));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-qa-jvm-0.4.32.jar!\ai\grazie\qa\SearchWebResult.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */