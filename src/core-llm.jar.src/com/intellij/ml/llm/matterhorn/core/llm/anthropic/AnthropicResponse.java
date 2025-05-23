/*    */ package com.intellij.ml.llm.matterhorn.core.llm.anthropic;
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000X\n\002\030\002\n\002\020\000\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b \n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 B2\0020\001:\002ABBU\022\f\020\002\032\b\022\004\022\0020\0040\003\022\006\020\005\032\0020\006\022\006\020\007\032\0020\006\022\006\020\b\032\0020\006\022\006\020\t\032\0020\n\022\n\b\002\020\013\032\004\030\0010\006\022\006\020\f\032\0020\006\022\n\b\002\020\r\032\004\030\0010\016¢\006\004\b\017\020\020Bq\b\020\022\006\020\021\032\0020\022\022\016\020\002\032\n\022\004\022\0020\004\030\0010\003\022\b\020\005\032\004\030\0010\006\022\b\020\007\032\004\030\0010\006\022\b\020\b\032\004\030\0010\006\022\b\020\t\032\004\030\0010\n\022\b\020\013\032\004\030\0010\006\022\b\020\f\032\004\030\0010\006\022\b\020\r\032\004\030\0010\016\022\b\020\023\032\004\030\0010\024¢\006\004\b\017\020\025J\017\020+\032\b\022\004\022\0020\0040\003HÆ\003J\t\020,\032\0020\006HÆ\003J\t\020-\032\0020\006HÆ\003J\t\020.\032\0020\006HÆ\003J\t\020/\032\0020\nHÆ\003J\013\0200\032\004\030\0010\006HÆ\003J\t\0201\032\0020\006HÆ\003J\013\0202\032\004\030\0010\016HÆ\003Jc\0203\032\0020\0002\016\b\002\020\002\032\b\022\004\022\0020\0040\0032\b\b\002\020\005\032\0020\0062\b\b\002\020\007\032\0020\0062\b\b\002\020\b\032\0020\0062\b\b\002\020\t\032\0020\n2\n\b\002\020\013\032\004\030\0010\0062\b\b\002\020\f\032\0020\0062\n\b\002\020\r\032\004\030\0010\016HÆ\001J\023\0204\032\002052\b\0206\032\004\030\0010\001HÖ\003J\t\0207\032\0020\022HÖ\001J\t\0208\032\0020\006HÖ\001J%\0209\032\0020:2\006\020;\032\0020\0002\006\020<\032\0020=2\006\020>\032\0020?H\001¢\006\002\b@R\"\020\002\032\b\022\004\022\0020\0040\0038\006X\004¢\006\016\n\000\022\004\b\026\020\027\032\004\b\030\020\031R\034\020\005\032\0020\0068\006X\004¢\006\016\n\000\022\004\b\032\020\027\032\004\b\033\020\034R\034\020\007\032\0020\0068\006X\004¢\006\016\n\000\022\004\b\035\020\027\032\004\b\036\020\034R\034\020\b\032\0020\0068\006X\004¢\006\016\n\000\022\004\b\037\020\027\032\004\b \020\034R\034\020\t\032\0020\n8\006X\004¢\006\016\n\000\022\004\b!\020\027\032\004\b\"\020#R\036\020\013\032\004\030\0010\0068\006X\004¢\006\016\n\000\022\004\b$\020\027\032\004\b%\020\034R\034\020\f\032\0020\0068\006X\004¢\006\016\n\000\022\004\b&\020\027\032\004\b'\020\034R\036\020\r\032\004\030\0010\0168\006X\004¢\006\016\n\000\022\004\b(\020\027\032\004\b)\020*¨\006C"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicResponse;", "", "content", "", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicContent;", "id", "", "model", "role", "stopReason", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStopReason;", "stopSequence", "type", "usage", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicResponseUsage;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStopReason;Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicResponseUsage;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStopReason;Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicResponseUsage;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getContent$annotations", "()V", "getContent", "()Ljava/util/List;", "getId$annotations", "getId", "()Ljava/lang/String;", "getModel$annotations", "getModel", "getRole$annotations", "getRole", "getStopReason$annotations", "getStopReason", "()Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStopReason;", "getStopSequence$annotations", "getStopSequence", "getType$annotations", "getType", "getUsage$annotations", "getUsage", "()Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicResponseUsage;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "$serializer", "Companion", "core-llm"})
/*    */ public final class AnthropicResponse {
/*    */   @NotNull
/*  6 */   public static final Companion Companion = new Companion(null); @NotNull private final List<AnthropicContent> content; @NotNull private final String id; @NotNull private final String model; @NotNull private final String role; @NotNull private final AnthropicStopReason stopReason; @Nullable private final String stopSequence; @NotNull private final String type; @Nullable private final AnthropicResponseUsage usage; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer1 = new KSerializer[8]; KClass[] arrayOfKClass = new KClass[6]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(AnthropicImageContent.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(AnthropicRedactedThinkingContent.class); arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(AnthropicTextContent.class); arrayOfKClass[3] = Reflection.getOrCreateKotlinClass(AnthropicThinkingContent.class); arrayOfKClass[4] = Reflection.getOrCreateKotlinClass(AnthropicToolContent.class); arrayOfKClass[5] = Reflection.getOrCreateKotlinClass(AnthropicToolResultContent.class); KSerializer[] arrayOfKSerializer2 = new KSerializer[6]; arrayOfKSerializer2[0] = (KSerializer)AnthropicImageContent.$serializer.INSTANCE; arrayOfKSerializer2[1] = (KSerializer)AnthropicRedactedThinkingContent.$serializer.INSTANCE; arrayOfKSerializer2[2] = (KSerializer)AnthropicTextContent.$serializer.INSTANCE; arrayOfKSerializer2[3] = (KSerializer)AnthropicThinkingContent.$serializer.INSTANCE; arrayOfKSerializer2[4] = (KSerializer)AnthropicToolContent.$serializer.INSTANCE; arrayOfKSerializer2[5] = (KSerializer)AnthropicToolResultContent.$serializer.INSTANCE; arrayOfKSerializer1[0] = (KSerializer)new ArrayListSerializer((KSerializer)new SealedClassSerializer("com.intellij.ml.llm.matterhorn.core.llm.anthropic.AnthropicContent", Reflection.getOrCreateKotlinClass(AnthropicContent.class), arrayOfKClass, arrayOfKSerializer2, new java.lang.annotation.Annotation[0])); arrayOfKSerializer1[1] = null; arrayOfKSerializer1[2] = null; arrayOfKSerializer1[3] = null; arrayOfKSerializer1[4] = AnthropicStopReason.Companion.serializer(); arrayOfKSerializer1[5] = null; arrayOfKSerializer1[6] = null; arrayOfKSerializer1[7] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer1; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicResponse;", "core-llm"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<AnthropicResponse> serializer() { return (KSerializer<AnthropicResponse>)AnthropicResponse.$serializer.INSTANCE; }
/*    */      }
/*  8 */   public AnthropicResponse(@NotNull List<AnthropicContent> content, @NotNull String id, @NotNull String model, @NotNull String role, @NotNull AnthropicStopReason stopReason, @Nullable String stopSequence, @NotNull String type, @Nullable AnthropicResponseUsage usage) { this.content = content;
/*    */ 
/*    */     
/* 11 */     this.id = id;
/*    */ 
/*    */     
/* 14 */     this.model = model;
/*    */ 
/*    */     
/* 17 */     this.role = role;
/*    */ 
/*    */     
/* 20 */     this.stopReason = stopReason;
/*    */ 
/*    */     
/* 23 */     this.stopSequence = stopSequence;
/*    */ 
/*    */     
/* 26 */     this.type = type;
/*    */ 
/*    */     
/* 29 */     this.usage = usage; } @NotNull public final List<AnthropicContent> getContent() { return this.content; } @NotNull public final String getId() { return this.id; } @NotNull public final String getModel() { return this.model; } @Nullable public final AnthropicResponseUsage getUsage() { return this.usage; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String getRole() {
/*    */     return this.role;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AnthropicStopReason getStopReason() {
/*    */     return this.stopReason;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String getStopSequence() {
/*    */     return this.stopSequence;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getType() {
/*    */     return this.type;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<AnthropicContent> component1() {
/*    */     return this.content;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.id;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component3() {
/*    */     return this.model;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component4() {
/*    */     return this.role;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AnthropicStopReason component5() {
/*    */     return this.stopReason;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component6() {
/*    */     return this.stopSequence;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component7() {
/*    */     return this.type;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final AnthropicResponseUsage component8() {
/*    */     return this.usage;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AnthropicResponse copy(@NotNull List<? extends AnthropicContent> content, @NotNull String id, @NotNull String model, @NotNull String role, @NotNull AnthropicStopReason stopReason, @Nullable String stopSequence, @NotNull String type, @Nullable AnthropicResponseUsage usage) {
/*    */     Intrinsics.checkNotNullParameter(content, "content");
/*    */     Intrinsics.checkNotNullParameter(id, "id");
/*    */     Intrinsics.checkNotNullParameter(model, "model");
/*    */     Intrinsics.checkNotNullParameter(role, "role");
/*    */     Intrinsics.checkNotNullParameter(stopReason, "stopReason");
/*    */     Intrinsics.checkNotNullParameter(type, "type");
/*    */     return new AnthropicResponse(content, id, model, role, stopReason, stopSequence, type, usage);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "AnthropicResponse(content=" + this.content + ", id=" + this.id + ", model=" + this.model + ", role=" + this.role + ", stopReason=" + this.stopReason + ", stopSequence=" + this.stopSequence + ", type=" + this.type + ", usage=" + this.usage + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.content.hashCode();
/*    */     result = result * 31 + this.id.hashCode();
/*    */     result = result * 31 + this.model.hashCode();
/*    */     result = result * 31 + this.role.hashCode();
/*    */     result = result * 31 + this.stopReason.hashCode();
/*    */     result = result * 31 + ((this.stopSequence == null) ? 0 : this.stopSequence.hashCode());
/*    */     result = result * 31 + this.type.hashCode();
/*    */     return result * 31 + ((this.usage == null) ? 0 : this.usage.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof AnthropicResponse))
/*    */       return false; 
/*    */     AnthropicResponse anthropicResponse = (AnthropicResponse)other;
/*    */     return !Intrinsics.areEqual(this.content, anthropicResponse.content) ? false : (!Intrinsics.areEqual(this.id, anthropicResponse.id) ? false : (!Intrinsics.areEqual(this.model, anthropicResponse.model) ? false : (!Intrinsics.areEqual(this.role, anthropicResponse.role) ? false : ((this.stopReason != anthropicResponse.stopReason) ? false : (!Intrinsics.areEqual(this.stopSequence, anthropicResponse.stopSequence) ? false : (!Intrinsics.areEqual(this.type, anthropicResponse.type) ? false : (!!Intrinsics.areEqual(this.usage, anthropicResponse.usage))))))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\anthropic\AnthropicResponse.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */