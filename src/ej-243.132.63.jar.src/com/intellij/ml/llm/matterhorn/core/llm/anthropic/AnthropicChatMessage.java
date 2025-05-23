/*    */ package com.intellij.ml.llm.matterhorn.core.llm.anthropic;
/*    */ import java.util.List;
/*    */ import kotlin.reflect.KClass;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020 \n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\f\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 &2\0020\001:\002%&B\035\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0060\005¢\006\004\b\007\020\bB5\b\020\022\006\020\t\032\0020\n\022\b\020\002\032\004\030\0010\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\b\020\013\032\004\030\0010\f¢\006\004\b\007\020\rJ\t\020\025\032\0020\003HÆ\003J\017\020\026\032\b\022\004\022\0020\0060\005HÆ\003J#\020\027\032\0020\0002\b\b\002\020\002\032\0020\0032\016\b\002\020\004\032\b\022\004\022\0020\0060\005HÆ\001J\023\020\030\032\0020\0312\b\020\032\032\004\030\0010\001HÖ\003J\t\020\033\032\0020\nHÖ\001J\t\020\034\032\0020\003HÖ\001J%\020\035\032\0020\0362\006\020\037\032\0020\0002\006\020 \032\0020!2\006\020\"\032\0020#H\001¢\006\002\b$R\034\020\002\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\016\020\017\032\004\b\020\020\021R\"\020\004\032\b\022\004\022\0020\0060\0058\006X\004¢\006\016\n\000\022\004\b\022\020\017\032\004\b\023\020\024¨\006'"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatMessage;", "", "role", "", "content", "", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicContent;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getRole$annotations", "()V", "getRole", "()Ljava/lang/String;", "getContent$annotations", "getContent", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "$serializer", "Companion", "core-llm"})
/*    */ public final class AnthropicChatMessage {
/*    */   @NotNull
/* 13 */   public static final Companion Companion = new Companion(null); @NotNull private final String role; @NotNull private final List<AnthropicContent> content; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer1 = new KSerializer[2]; arrayOfKSerializer1[0] = null; KClass[] arrayOfKClass = new KClass[6]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(AnthropicImageContent.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(AnthropicRedactedThinkingContent.class); arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(AnthropicTextContent.class); arrayOfKClass[3] = Reflection.getOrCreateKotlinClass(AnthropicThinkingContent.class); arrayOfKClass[4] = Reflection.getOrCreateKotlinClass(AnthropicToolContent.class); arrayOfKClass[5] = Reflection.getOrCreateKotlinClass(AnthropicToolResultContent.class); KSerializer[] arrayOfKSerializer2 = new KSerializer[6]; arrayOfKSerializer2[0] = (KSerializer)AnthropicImageContent.$serializer.INSTANCE; arrayOfKSerializer2[1] = (KSerializer)AnthropicRedactedThinkingContent.$serializer.INSTANCE; arrayOfKSerializer2[2] = (KSerializer)AnthropicTextContent.$serializer.INSTANCE; arrayOfKSerializer2[3] = (KSerializer)AnthropicThinkingContent.$serializer.INSTANCE; arrayOfKSerializer2[4] = (KSerializer)AnthropicToolContent.$serializer.INSTANCE; arrayOfKSerializer2[5] = (KSerializer)AnthropicToolResultContent.$serializer.INSTANCE; arrayOfKSerializer1[1] = (KSerializer)new ArrayListSerializer((KSerializer)new SealedClassSerializer("com.intellij.ml.llm.matterhorn.core.llm.anthropic.AnthropicContent", Reflection.getOrCreateKotlinClass(AnthropicContent.class), arrayOfKClass, arrayOfKSerializer2, new java.lang.annotation.Annotation[0])); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer1; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatMessage$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatMessage;", "core-llm"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<AnthropicChatMessage> serializer() { return (KSerializer<AnthropicChatMessage>)AnthropicChatMessage.$serializer.INSTANCE; }
/*    */      }
/* 15 */    public AnthropicChatMessage(@NotNull String role, @NotNull List<AnthropicContent> content) { this.role = role;
/*    */ 
/*    */     
/* 18 */     this.content = content; } @NotNull public final String getRole() { return this.role; } @NotNull public final List<AnthropicContent> getContent() { return this.content; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.role;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<AnthropicContent> component2() {
/*    */     return this.content;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AnthropicChatMessage copy(@NotNull String role, @NotNull List<? extends AnthropicContent> content) {
/*    */     Intrinsics.checkNotNullParameter(role, "role");
/*    */     Intrinsics.checkNotNullParameter(content, "content");
/*    */     return new AnthropicChatMessage(role, content);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "AnthropicChatMessage(role=" + this.role + ", content=" + this.content + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.role.hashCode();
/*    */     return result * 31 + this.content.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof AnthropicChatMessage))
/*    */       return false; 
/*    */     AnthropicChatMessage anthropicChatMessage = (AnthropicChatMessage)other;
/*    */     return !Intrinsics.areEqual(this.role, anthropicChatMessage.role) ? false : (!!Intrinsics.areEqual(this.content, anthropicChatMessage.content));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\anthropic\AnthropicChatMessage.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */