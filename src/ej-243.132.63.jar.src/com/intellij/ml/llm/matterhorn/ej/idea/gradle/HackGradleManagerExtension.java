/*    */ package com.intellij.ml.llm.matterhorn.ej.idea.gradle;
/*    */ 
/*    */ import com.intellij.openapi.externalSystem.model.task.ExternalSystemTaskId;
/*    */ import com.intellij.openapi.externalSystem.model.task.ExternalSystemTaskNotificationListener;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.plugins.gradle.service.task.GradleTaskManagerExtension;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J\030\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\tH\026¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/gradle/HackGradleManagerExtension;", "Lorg/jetbrains/plugins/gradle/service/task/GradleTaskManagerExtension;", "<init>", "()V", "cancelTask", "", "p0", "Lcom/intellij/openapi/externalSystem/model/task/ExternalSystemTaskId;", "p1", "Lcom/intellij/openapi/externalSystem/model/task/ExternalSystemTaskNotificationListener;", "ej-gradle"})
/*    */ public final class HackGradleManagerExtension
/*    */   implements GradleTaskManagerExtension {
/*    */   public boolean cancelTask(@NotNull ExternalSystemTaskId p0, @NotNull ExternalSystemTaskNotificationListener p1) {
/* 14 */     Intrinsics.checkNotNullParameter(p0, "p0"); Intrinsics.checkNotNullParameter(p1, "p1"); return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\gradle\HackGradleManagerExtension.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */