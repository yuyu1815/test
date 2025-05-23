/*    */ package com.intellij.ml.llm.matterhorn.ej.core.run;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.RootExecutionContext;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.AgentAction;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.run.local.LocalExecutionEnvironment;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J\020\020\n\032\0020\0132\006\020\f\032\0020\rH\026R\024\020\004\032\0020\0058VX\004¢\006\006\032\004\b\006\020\007R\024\020\b\032\0020\0058VX\004¢\006\006\032\004\b\t\020\007¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionMode$UnsafeLocal;", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionMode;", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", "messageBundleKey", "getMessageBundleKey", "createExecutionEnvironment", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionEnvironment;", "root", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;", "ej-core"})
/*    */ public final class UnsafeLocal
/*    */   implements ExecutionMode
/*    */ {
/*    */   @NotNull
/*    */   public String getId() {
/* 33 */     return "UnsafeLocal"; } @NotNull
/*    */   public String getMessageBundleKey() {
/* 35 */     return "settings.execution.mode.unsafe.local";
/*    */   } @NotNull
/*    */   public ExecutionEnvironment createExecutionEnvironment(@NotNull RootExecutionContext root) {
/* 38 */     Intrinsics.checkNotNullParameter(root, "root"); return (ExecutionEnvironment)new LocalExecutionEnvironment(AgentAction.Companion.getShell(root));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\run\ExecutionMode$UnsafeLocal.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */