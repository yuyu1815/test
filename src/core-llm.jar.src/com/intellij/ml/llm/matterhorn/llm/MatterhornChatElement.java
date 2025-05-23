/*    */ package com.intellij.ml.llm.matterhorn.llm;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlin.reflect.KClass;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SealedClassSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\bw\030\000 \n2\0020\001:\001\nR\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\007X¦\004¢\006\006\032\004\b\b\020\t\001\004\013\f\r\016¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;", "", "content", "", "getContent", "()Ljava/lang/String;", "kind", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;", "getKind", "()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;", "Companion", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornAssistantChatMessageWithToolUses;", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornMultiPartChatMessage;", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornUserChatMessageWithToolResults;", "core"})
/*    */ public interface MatterhornChatElement
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE;
/*    */   
/*    */   @NotNull
/*    */   String getContent();
/*    */   
/*    */   @NotNull
/*    */   MatterhornChatMessageKind getKind();
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;", "core"})
/*    */   public static final class Companion
/*    */   {
/*    */     @NotNull
/*    */     public final KSerializer<MatterhornChatElement> serializer() {
/* 39 */       KClass[] arrayOfKClass = new KClass[4]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(MatterhornAssistantChatMessageWithToolUses.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(MatterhornChatMessage.class); arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(MatterhornMultiPartChatMessage.class); arrayOfKClass[3] = Reflection.getOrCreateKotlinClass(MatterhornUserChatMessageWithToolResults.class); KSerializer[] arrayOfKSerializer = new KSerializer[4]; arrayOfKSerializer[0] = (KSerializer)MatterhornAssistantChatMessageWithToolUses.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)MatterhornChatMessage.$serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)MatterhornMultiPartChatMessage.$serializer.INSTANCE; arrayOfKSerializer[3] = (KSerializer)MatterhornUserChatMessageWithToolResults.$serializer.INSTANCE; return (KSerializer<MatterhornChatElement>)new SealedClassSerializer("com.intellij.ml.llm.matterhorn.llm.MatterhornChatElement", Reflection.getOrCreateKotlinClass(MatterhornChatElement.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\llm\MatterhornChatElement.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */