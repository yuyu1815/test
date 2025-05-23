/*    */ package com.intellij.ml.llm.matterhorn.core.llm.openai;
/*    */ import java.util.List;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000T\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020\t\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\b\n\000\n\002\030\002\n\002\b\027\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 62\0020\001:\00256B9\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\f\020\006\032\b\022\004\022\0020\b0\007\022\n\b\002\020\t\032\004\030\0010\n\022\006\020\013\032\0020\003¢\006\004\b\f\020\rBQ\b\020\022\006\020\016\032\0020\017\022\b\020\002\032\004\030\0010\003\022\006\020\004\032\0020\005\022\016\020\006\032\n\022\004\022\0020\b\030\0010\007\022\b\020\t\032\004\030\0010\n\022\b\020\013\032\004\030\0010\003\022\b\020\020\032\004\030\0010\021¢\006\004\b\f\020\022J\t\020\"\032\0020\003HÆ\003J\t\020#\032\0020\005HÆ\003J\017\020$\032\b\022\004\022\0020\b0\007HÆ\003J\013\020%\032\004\030\0010\nHÆ\003J\t\020&\032\0020\003HÆ\003JC\020'\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\016\b\002\020\006\032\b\022\004\022\0020\b0\0072\n\b\002\020\t\032\004\030\0010\n2\b\b\002\020\013\032\0020\003HÆ\001J\023\020(\032\0020)2\b\020*\032\004\030\0010\001HÖ\003J\t\020+\032\0020\017HÖ\001J\t\020,\032\0020\003HÖ\001J%\020-\032\0020.2\006\020/\032\0020\0002\006\0200\032\002012\006\0202\032\00203H\001¢\006\002\b4R\034\020\002\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\023\020\024\032\004\b\025\020\026R\034\020\004\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\027\020\024\032\004\b\030\020\031R\"\020\006\032\b\022\004\022\0020\b0\0078\006X\004¢\006\016\n\000\022\004\b\032\020\024\032\004\b\033\020\034R\036\020\t\032\004\030\0010\n8\006X\004¢\006\016\n\000\022\004\b\035\020\024\032\004\b\036\020\037R\034\020\013\032\0020\0038\006X\004¢\006\016\n\000\022\004\b \020\024\032\004\b!\020\026¨\0067"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponse;", "", "type", "", "created", "", "choices", "", "Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseChoice;", "usage", "Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseUsage;", "model", "<init>", "(Ljava/lang/String;JLjava/util/List;Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseUsage;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;JLjava/util/List;Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseUsage;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getType$annotations", "()V", "getType", "()Ljava/lang/String;", "getCreated$annotations", "getCreated", "()J", "getChoices$annotations", "getChoices", "()Ljava/util/List;", "getUsage$annotations", "getUsage", "()Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseUsage;", "getModel$annotations", "getModel", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "$serializer", "Companion", "core-llm"})
/*    */ public final class OpenAIResponse {
/*    */   @NotNull
/* 11 */   public static final Companion Companion = new Companion(null); @NotNull private final String type; private final long created; @NotNull private final List<OpenAIResponseChoice> choices; @Nullable private final OpenAIResponseUsage usage; @NotNull private final String model; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[5]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = (KSerializer)new ArrayListSerializer((KSerializer)new OpenAIResponseChoiceDeserializer()); arrayOfKSerializer[3] = null; arrayOfKSerializer[4] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponse;", "core-llm"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<OpenAIResponse> serializer() { return (KSerializer<OpenAIResponse>)OpenAIResponse.$serializer.INSTANCE; }
/*    */      }
/* 13 */    public OpenAIResponse(@NotNull String type, long created, @NotNull List<OpenAIResponseChoice> choices, @Nullable OpenAIResponseUsage usage, @NotNull String model) { this.type = type;
/*    */ 
/*    */     
/* 16 */     this.created = created;
/*    */ 
/*    */     
/* 19 */     this.choices = choices;
/*    */ 
/*    */     
/* 22 */     this.usage = usage;
/*    */ 
/*    */     
/* 25 */     this.model = model; } @NotNull public final String getType() { return this.type; } public final long getCreated() { return this.created; } @NotNull public final List<OpenAIResponseChoice> getChoices() { return this.choices; } @Nullable public final OpenAIResponseUsage getUsage() { return this.usage; } @NotNull public final String getModel() { return this.model; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.type;
/*    */   }
/*    */   
/*    */   public final long component2() {
/*    */     return this.created;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<OpenAIResponseChoice> component3() {
/*    */     return this.choices;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final OpenAIResponseUsage component4() {
/*    */     return this.usage;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component5() {
/*    */     return this.model;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final OpenAIResponse copy(@NotNull String type, long created, @NotNull List<? extends OpenAIResponseChoice> choices, @Nullable OpenAIResponseUsage usage, @NotNull String model) {
/*    */     Intrinsics.checkNotNullParameter(type, "type");
/*    */     Intrinsics.checkNotNullParameter(choices, "choices");
/*    */     Intrinsics.checkNotNullParameter(model, "model");
/*    */     return new OpenAIResponse(type, created, choices, usage, model);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "OpenAIResponse(type=" + this.type + ", created=" + this.created + ", choices=" + this.choices + ", usage=" + this.usage + ", model=" + this.model + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.type.hashCode();
/*    */     result = result * 31 + Long.hashCode(this.created);
/*    */     result = result * 31 + this.choices.hashCode();
/*    */     result = result * 31 + ((this.usage == null) ? 0 : this.usage.hashCode());
/*    */     return result * 31 + this.model.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof OpenAIResponse))
/*    */       return false; 
/*    */     OpenAIResponse openAIResponse = (OpenAIResponse)other;
/*    */     return !Intrinsics.areEqual(this.type, openAIResponse.type) ? false : ((this.created != openAIResponse.created) ? false : (!Intrinsics.areEqual(this.choices, openAIResponse.choices) ? false : (!Intrinsics.areEqual(this.usage, openAIResponse.usage) ? false : (!!Intrinsics.areEqual(this.model, openAIResponse.model)))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\openai\OpenAIResponse.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */