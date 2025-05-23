/*    */ package com.intellij.ml.llm.matterhorn;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlin.reflect.KClass;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\004\n\002\020\016\n\000\n\002\030\002\n\002\030\002\n\000\bw\030\000 \t2\0020\001:\001\tJ\020\020\006\032\0020\0002\006\020\007\032\0020\bH&R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005\001\002\n\013¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;", "", "subagent", "Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;", "getSubagent", "()Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;", "withId", "agentId", "", "Companion", "Lcom/intellij/ml/llm/matterhorn/AssistantTrajectoryElement;", "Lcom/intellij/ml/llm/matterhorn/UserTrajectoryElement;", "core"})
/*    */ public interface TrajectoryElement {
/*    */   @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE;
/*    */   
/*    */   @NotNull
/*    */   TrajectoryElementAgent getSubagent();
/*    */   
/*    */   @NotNull
/*    */   TrajectoryElement withId(@NotNull String paramString);
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/TrajectoryElement$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;", "core"})
/*    */   public static final class Companion {
/*    */     @NotNull
/*    */     public final KSerializer<TrajectoryElement> serializer() {
/* 24 */       KClass[] arrayOfKClass = new KClass[2]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(AssistantTrajectoryElement.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(UserTrajectoryElement.class); KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)AssistantTrajectoryElement.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)UserTrajectoryElement.$serializer.INSTANCE; return (KSerializer<TrajectoryElement>)new SealedClassSerializer("com.intellij.ml.llm.matterhorn.TrajectoryElement", Reflection.getOrCreateKotlinClass(TrajectoryElement.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\TrajectoryElement.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */