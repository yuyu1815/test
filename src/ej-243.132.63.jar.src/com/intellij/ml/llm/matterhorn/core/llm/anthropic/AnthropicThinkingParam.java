/*    */ package com.intellij.ml.llm.matterhorn.core.llm.anthropic;
/*    */ 
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerialName;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020\b\n\002\b\004\n\002\030\002\n\002\b\f\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 $2\0020\001:\002#$B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007B-\b\020\022\006\020\b\032\0020\005\022\b\020\002\032\004\030\0010\003\022\006\020\004\032\0020\005\022\b\020\t\032\004\030\0010\n¢\006\004\b\006\020\013J\t\020\023\032\0020\003HÆ\003J\t\020\024\032\0020\005HÆ\003J\035\020\025\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\026\032\0020\0272\b\020\030\032\004\030\0010\001HÖ\003J\t\020\031\032\0020\005HÖ\001J\t\020\032\032\0020\003HÖ\001J%\020\033\032\0020\0342\006\020\035\032\0020\0002\006\020\036\032\0020\0372\006\020 \032\0020!H\001¢\006\002\b\"R\034\020\002\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\f\020\r\032\004\b\016\020\017R\034\020\004\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\020\020\r\032\004\b\021\020\022¨\006%"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicThinkingParam;", "", "type", "", "budgetTokens", "", "<init>", "(Ljava/lang/String;I)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getType$annotations", "()V", "getType", "()Ljava/lang/String;", "getBudgetTokens$annotations", "getBudgetTokens", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "$serializer", "Companion", "core-llm"})
/*    */ public final class AnthropicThinkingParam {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String type;
/*    */   private final int budgetTokens;
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicThinkingParam$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicThinkingParam;", "core-llm"})
/*    */   public static final class Companion { @NotNull
/*    */     public final KSerializer<AnthropicThinkingParam> serializer() {
/* 34 */       return (KSerializer<AnthropicThinkingParam>)AnthropicThinkingParam.$serializer.INSTANCE;
/*    */     } private Companion() {} } public AnthropicThinkingParam(@NotNull String type, int budgetTokens) {
/* 36 */     this.type = type;
/*    */ 
/*    */     
/* 39 */     this.budgetTokens = budgetTokens; } public final int getBudgetTokens() { return this.budgetTokens; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String getType() {
/*    */     return this.type;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.type;
/*    */   }
/*    */   
/*    */   public final int component2() {
/*    */     return this.budgetTokens;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AnthropicThinkingParam copy(@NotNull String type, int budgetTokens) {
/*    */     Intrinsics.checkNotNullParameter(type, "type");
/*    */     return new AnthropicThinkingParam(type, budgetTokens);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "AnthropicThinkingParam(type=" + this.type + ", budgetTokens=" + this.budgetTokens + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.type.hashCode();
/*    */     return result * 31 + Integer.hashCode(this.budgetTokens);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof AnthropicThinkingParam))
/*    */       return false; 
/*    */     AnthropicThinkingParam anthropicThinkingParam = (AnthropicThinkingParam)other;
/*    */     return !Intrinsics.areEqual(this.type, anthropicThinkingParam.type) ? false : (!(this.budgetTokens != anthropicThinkingParam.budgetTokens));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\anthropic\AnthropicThinkingParam.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */