/*    */ package com.intellij.ml.llm.matterhorn.core.llm.anthropic;
/*    */ 
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\b\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0372\0020\001:\002\036\037B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005B%\b\020\022\006\020\006\032\0020\007\022\b\020\002\032\004\030\0010\003\022\b\020\b\032\004\030\0010\t¢\006\004\b\004\020\nJ\t\020\017\032\0020\003HÆ\003J\023\020\020\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\021\032\0020\0222\b\020\023\032\004\030\0010\001HÖ\003J\t\020\024\032\0020\007HÖ\001J\t\020\025\032\0020\003HÖ\001J%\020\026\032\0020\0272\006\020\030\032\0020\0002\006\020\031\032\0020\0322\006\020\033\032\0020\034H\001¢\006\002\b\035R\034\020\002\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\013\020\f\032\004\b\r\020\016¨\006 "}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicCacheControl;", "", "type", "", "<init>", "(Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getType$annotations", "()V", "getType", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "$serializer", "Companion", "core-llm"})
/*    */ public final class AnthropicCacheControl {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String type;
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicCacheControl$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicCacheControl;", "core-llm"})
/*    */   public static final class Companion { @NotNull
/*    */     public final KSerializer<AnthropicCacheControl> serializer() {
/* 20 */       return (KSerializer<AnthropicCacheControl>)AnthropicCacheControl.$serializer.INSTANCE;
/*    */     } private Companion() {} } public AnthropicCacheControl(@NotNull String type) {
/* 22 */     this.type = type; } @NotNull public final String getType() { return this.type; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.type;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AnthropicCacheControl copy(@NotNull String type) {
/*    */     Intrinsics.checkNotNullParameter(type, "type");
/*    */     return new AnthropicCacheControl(type);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "AnthropicCacheControl(type=" + this.type + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.type.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof AnthropicCacheControl))
/*    */       return false; 
/*    */     AnthropicCacheControl anthropicCacheControl = (AnthropicCacheControl)other;
/*    */     return !!Intrinsics.areEqual(this.type, anthropicCacheControl.type);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\anthropic\AnthropicCacheControl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */