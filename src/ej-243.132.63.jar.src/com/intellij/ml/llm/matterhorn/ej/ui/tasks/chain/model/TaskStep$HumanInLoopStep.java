/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.header.Action;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\020 \n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b7\030\0002\0020\001B\t\b\004¢\006\004\b\002\020\003R\024\020\004\032\004\030\0010\005X¦\004¢\006\006\032\004\b\006\020\007R\036\020\b\032\016\022\n\022\b\022\004\022\0020\0130\n0\tX¦\004¢\006\006\032\004\b\f\020\rR\021\020\016\032\0020\0178F¢\006\006\032\004\b\020\020\021\001\004\022\023\024\025¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$HumanInLoopStep;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep;", "<init>", "()V", "actionApprovalRequestData", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/ActionApprovalRequestData;", "getActionApprovalRequestData", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/ActionApprovalRequestData;", "retrieveAdditionalActions", "Lkotlin/Function0;", "", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;", "getRetrieveAdditionalActions", "()Lkotlin/jvm/functions/Function0;", "waitingForApproval", "", "getWaitingForApproval", "()Z", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Build;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Info;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Terminal;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Test;", "ej-ui"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public abstract class HumanInLoopStep
/*    */   extends TaskStep
/*    */ {
/*    */   public static final int $stable;
/*    */   
/*    */   private HumanInLoopStep() {
/* 20 */     super(null);
/*    */   }
/*    */   
/*    */   public final boolean getWaitingForApproval() {
/* 24 */     return (getActionApprovalRequestData() != null);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public abstract ActionApprovalRequestData getActionApprovalRequestData();
/*    */   
/*    */   @NotNull
/*    */   public abstract Function0<List<Action>> getRetrieveAdditionalActions();
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\model\TaskStep$HumanInLoopStep.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */