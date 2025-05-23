/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.header.Action;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b7\030\0002\0020\001B\t\b\004¢\006\004\b\002\020\003R\024\020\004\032\004\030\0010\005X¦\004¢\006\006\032\004\b\006\020\007\001\003\b\t\n¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$EndStep;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep;", "<init>", "()V", "startNewTaskAction", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;", "getStartNewTaskAction", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$ChatResponse;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Report;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Stop;", "ej-ui"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public abstract class EndStep
/*    */   extends TaskStep
/*    */ {
/*    */   public static final int $stable;
/*    */   
/*    */   private EndStep() {
/* 27 */     super(null);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public abstract Action getStartNewTaskAction();
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\model\TaskStep$EndStep.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */