/*    */ package com.intellij.ml.llm.matterhorn;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlin.reflect.KClass;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SealedClassSerializer;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/TrajectoryElement$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;", "core"})
/*    */ public final class Companion
/*    */ {
/*    */   @NotNull
/*    */   public final KSerializer<TrajectoryElement> serializer() {
/* 24 */     KClass[] arrayOfKClass = new KClass[2]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(AssistantTrajectoryElement.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(UserTrajectoryElement.class); KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)AssistantTrajectoryElement.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)UserTrajectoryElement.$serializer.INSTANCE; return (KSerializer<TrajectoryElement>)new SealedClassSerializer("com.intellij.ml.llm.matterhorn.TrajectoryElement", Reflection.getOrCreateKotlinClass(TrajectoryElement.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\TrajectoryElement$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */