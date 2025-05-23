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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\030\002\n\002\030\002\n\000\bw\030\000 \0062\0020\001:\001\006R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005\001\003\007\b\t¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessagePart;", "", "representation", "", "getRepresentation", "()Ljava/lang/String;", "Companion", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageImagePart;", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageTextPart;", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageToolResultPart;", "core"})
/*    */ public interface MatterhornChatMessagePart
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE;
/*    */   
/*    */   @NotNull
/*    */   String getRepresentation();
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessagePart$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessagePart;", "core"})
/*    */   public static final class Companion
/*    */   {
/*    */     @NotNull
/*    */     public final KSerializer<MatterhornChatMessagePart> serializer() {
/* 65 */       KClass[] arrayOfKClass = new KClass[3]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(MatterhornChatMessageImagePart.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(MatterhornChatMessageTextPart.class); arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(MatterhornChatMessageToolResultPart.class); KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = (KSerializer)MatterhornChatMessageImagePart.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)MatterhornChatMessageTextPart.$serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)MatterhornChatMessageToolResultPart.$serializer.INSTANCE; return (KSerializer<MatterhornChatMessagePart>)new SealedClassSerializer("com.intellij.ml.llm.matterhorn.llm.MatterhornChatMessagePart", Reflection.getOrCreateKotlinClass(MatterhornChatMessagePart.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\llm\MatterhornChatMessagePart.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */