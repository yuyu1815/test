/*     */ package com.intellij.ml.llm.matterhorn.core.llm.anthropic;
/*     */ 
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Serializable
/*     */ @SerialName("text")
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\f\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 &2\0020\001:\002%&B\033\022\006\020\002\032\0020\003\022\n\b\002\020\004\032\004\030\0010\005¢\006\004\b\006\020\007B/\b\020\022\006\020\b\032\0020\t\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\005\022\b\020\n\032\004\030\0010\013¢\006\004\b\006\020\fJ\t\020\024\032\0020\003HÆ\003J\013\020\025\032\004\030\0010\005HÆ\003J\037\020\026\032\0020\0002\b\b\002\020\002\032\0020\0032\n\b\002\020\004\032\004\030\0010\005HÆ\001J\023\020\027\032\0020\0302\b\020\031\032\004\030\0010\032HÖ\003J\t\020\033\032\0020\tHÖ\001J\t\020\034\032\0020\003HÖ\001J%\020\035\032\0020\0362\006\020\037\032\0020\0002\006\020 \032\0020!2\006\020\"\032\0020#H\001¢\006\002\b$R\034\020\002\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\r\020\016\032\004\b\017\020\020R\036\020\004\032\004\030\0010\0058\026X\004¢\006\016\n\000\022\004\b\021\020\016\032\004\b\022\020\023¨\006'"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicTextContent;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicContent;", "text", "", "cache", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicCacheControl;", "<init>", "(Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicCacheControl;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicCacheControl;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getText$annotations", "()V", "getText", "()Ljava/lang/String;", "getCache$annotations", "getCache", "()Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicCacheControl;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "$serializer", "Companion", "core-llm"})
/*     */ @SourceDebugExtension({"SMAP\nAnthropicBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnthropicBase.kt\ncom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicTextContent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,181:1\n1#2:182\n*E\n"})
/*     */ public final class AnthropicTextContent implements AnthropicContent {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final String text;
/*     */   @Nullable
/*     */   private final AnthropicCacheControl cache;
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicTextContent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicTextContent;", "core-llm"})
/*     */   public static final class Companion { @NotNull
/*     */     public final KSerializer<AnthropicTextContent> serializer() {
/*  26 */       return (KSerializer<AnthropicTextContent>)AnthropicTextContent.$serializer.INSTANCE;
/*     */     } private Companion() {} }
/*     */   public AnthropicTextContent(@NotNull String text, @Nullable AnthropicCacheControl cache) {
/*  29 */     this.text = text;
/*     */ 
/*     */     
/*  32 */     this.cache = cache;
/*     */ 
/*     */ 
/*     */     
/*  36 */     boolean bool = (((CharSequence)this.text).length() > 0) ? true : false; if (_Assertions.ENABLED && !bool) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 182 */       int $i$a$-assert-AnthropicTextContent$1 = 0;
/*     */       String str = "Text must not be empty";
/*     */       throw new AssertionError(str);
/*     */     } 
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String getText() {
/*     */     return this.text;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public AnthropicCacheControl getCache() {
/*     */     return this.cache;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component1() {
/*     */     return this.text;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final AnthropicCacheControl component2() {
/*     */     return this.cache;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final AnthropicTextContent copy(@NotNull String text, @Nullable AnthropicCacheControl cache) {
/*     */     Intrinsics.checkNotNullParameter(text, "text");
/*     */     return new AnthropicTextContent(text, cache);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "AnthropicTextContent(text=" + this.text + ", cache=" + this.cache + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.text.hashCode();
/*     */     return result * 31 + ((this.cache == null) ? 0 : this.cache.hashCode());
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof AnthropicTextContent))
/*     */       return false; 
/*     */     AnthropicTextContent anthropicTextContent = (AnthropicTextContent)other;
/*     */     return !Intrinsics.areEqual(this.text, anthropicTextContent.text) ? false : (!!Intrinsics.areEqual(this.cache, anthropicTextContent.cache));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\anthropic\AnthropicTextContent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */