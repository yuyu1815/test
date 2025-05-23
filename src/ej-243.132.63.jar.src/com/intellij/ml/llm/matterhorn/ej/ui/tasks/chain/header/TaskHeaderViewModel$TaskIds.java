/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.header;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskChainId;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskId;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\t\020\f\032\0020\003HÆ\003J\t\020\r\032\0020\005HÆ\003J\035\020\016\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\023HÖ\001J\t\020\024\032\0020\025HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderViewModel$TaskIds;", "", "chainId", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;", "issueId", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;)V", "getChainId", "()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;", "getIssueId", "()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ej-ui"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class TaskIds
/*    */ {
/*    */   @NotNull
/*    */   private final TaskChainId chainId;
/*    */   @NotNull
/*    */   private final TaskId issueId;
/*    */   public static final int $stable = 8;
/*    */   
/*    */   public TaskIds(@NotNull TaskChainId chainId, @NotNull TaskId issueId) {
/* 40 */     this.chainId = chainId; this.issueId = issueId; } @NotNull public final TaskChainId getChainId() { return this.chainId; } @NotNull public final TaskId getIssueId() { return this.issueId; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final TaskChainId component1() {
/*    */     return this.chainId;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TaskId component2() {
/*    */     return this.issueId;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TaskIds copy(@NotNull TaskChainId chainId, @NotNull TaskId issueId) {
/*    */     Intrinsics.checkNotNullParameter(chainId, "chainId");
/*    */     Intrinsics.checkNotNullParameter(issueId, "issueId");
/*    */     return new TaskIds(chainId, issueId);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "TaskIds(chainId=" + this.chainId + ", issueId=" + this.issueId + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.chainId.hashCode();
/*    */     return result * 31 + this.issueId.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof TaskIds))
/*    */       return false; 
/*    */     TaskIds taskIds = (TaskIds)other;
/*    */     return !Intrinsics.areEqual(this.chainId, taskIds.chainId) ? false : (!!Intrinsics.areEqual(this.issueId, taskIds.issueId));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\header\TaskHeaderViewModel$TaskIds.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */