/*    */ package com.intellij.ml.llm.matterhorn.core.llm.anthropic;
/*    */ 
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\002\n\002\020\013\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\023\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 (2\0020\001:\002'(B%\022\006\020\002\032\0020\003\022\n\b\002\020\004\032\004\030\0010\003\022\b\b\002\020\005\032\0020\006¢\006\004\b\007\020\bB7\b\020\022\006\020\t\032\0020\n\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\003\022\006\020\005\032\0020\006\022\b\020\013\032\004\030\0010\f¢\006\004\b\007\020\rJ\t\020\027\032\0020\003HÆ\003J\013\020\030\032\004\030\0010\003HÆ\003J\t\020\031\032\0020\006HÆ\003J)\020\032\032\0020\0002\b\b\002\020\002\032\0020\0032\n\b\002\020\004\032\004\030\0010\0032\b\b\002\020\005\032\0020\006HÆ\001J\023\020\033\032\0020\0062\b\020\034\032\004\030\0010\001HÖ\003J\t\020\035\032\0020\nHÖ\001J\t\020\036\032\0020\003HÖ\001J%\020\037\032\0020 2\006\020!\032\0020\0002\006\020\"\032\0020#2\006\020$\032\0020%H\001¢\006\002\b&R\034\020\002\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\016\020\017\032\004\b\020\020\021R\036\020\004\032\004\030\0010\0038\006X\004¢\006\016\n\000\022\004\b\022\020\017\032\004\b\023\020\021R\034\020\005\032\0020\0068\006X\004¢\006\016\n\000\022\004\b\024\020\017\032\004\b\025\020\026¨\006)"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicToolChoiceParam;", "", "type", "", "name", "disableParallelToolUse", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getType$annotations", "()V", "getType", "()Ljava/lang/String;", "getName$annotations", "getName", "getDisableParallelToolUse$annotations", "getDisableParallelToolUse", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "$serializer", "Companion", "core-llm"})
/*    */ public final class AnthropicToolChoiceParam {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String type;
/*    */   @Nullable
/*    */   private final String name;
/*    */   private final boolean disableParallelToolUse;
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicToolChoiceParam$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicToolChoiceParam;", "core-llm"})
/*    */   public static final class Companion { @NotNull
/*    */     public final KSerializer<AnthropicToolChoiceParam> serializer() {
/* 22 */       return (KSerializer<AnthropicToolChoiceParam>)AnthropicToolChoiceParam.$serializer.INSTANCE;
/*    */     } private Companion() {} } public AnthropicToolChoiceParam(@NotNull String type, @Nullable String name, boolean disableParallelToolUse) {
/* 24 */     this.type = type;
/*    */     
/* 26 */     this.name = name;
/*    */ 
/*    */ 
/*    */     
/* 30 */     this.disableParallelToolUse = disableParallelToolUse; } @NotNull public final String getType() { return this.type; } @Nullable public final String getName() { return this.name; } public final boolean getDisableParallelToolUse() { return this.disableParallelToolUse; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.type;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component2() {
/*    */     return this.name;
/*    */   }
/*    */   
/*    */   public final boolean component3() {
/*    */     return this.disableParallelToolUse;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AnthropicToolChoiceParam copy(@NotNull String type, @Nullable String name, boolean disableParallelToolUse) {
/*    */     Intrinsics.checkNotNullParameter(type, "type");
/*    */     return new AnthropicToolChoiceParam(type, name, disableParallelToolUse);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "AnthropicToolChoiceParam(type=" + this.type + ", name=" + this.name + ", disableParallelToolUse=" + this.disableParallelToolUse + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.type.hashCode();
/*    */     result = result * 31 + ((this.name == null) ? 0 : this.name.hashCode());
/*    */     return result * 31 + Boolean.hashCode(this.disableParallelToolUse);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof AnthropicToolChoiceParam))
/*    */       return false; 
/*    */     AnthropicToolChoiceParam anthropicToolChoiceParam = (AnthropicToolChoiceParam)other;
/*    */     return !Intrinsics.areEqual(this.type, anthropicToolChoiceParam.type) ? false : (!Intrinsics.areEqual(this.name, anthropicToolChoiceParam.name) ? false : (!(this.disableParallelToolUse != anthropicToolChoiceParam.disableParallelToolUse)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\anthropic\AnthropicToolChoiceParam.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */