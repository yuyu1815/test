/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.StepType;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.actions.edit.FileChange;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\000\n\002\030\002\n\002\b\f\n\002\030\002\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001BK\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\016\b\002\020\005\032\b\022\004\022\0020\0070\006\022\026\b\002\020\b\032\020\022\004\022\0020\n\022\004\022\0020\013\030\0010\t\022\n\b\002\020\f\032\004\030\0010\r¢\006\004\b\016\020\017J\t\020\035\032\0020\003HÆ\003J\t\020\036\032\0020\003HÆ\003J\017\020\037\032\b\022\004\022\0020\0070\006HÆ\003J\027\020 \032\020\022\004\022\0020\n\022\004\022\0020\013\030\0010\tHÆ\003J\013\020!\032\004\030\0010\rHÆ\003JQ\020\"\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\016\b\002\020\005\032\b\022\004\022\0020\0070\0062\026\b\002\020\b\032\020\022\004\022\0020\n\022\004\022\0020\013\030\0010\t2\n\b\002\020\f\032\004\030\0010\rHÆ\001J\023\020#\032\0020$2\b\020%\032\004\030\0010&HÖ\003J\t\020'\032\0020(HÖ\001J\t\020)\032\0020\003HÖ\001R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\020\020\021R\024\020\004\032\0020\003X\004¢\006\b\n\000\032\004\b\022\020\021R\027\020\005\032\b\022\004\022\0020\0070\006¢\006\b\n\000\032\004\b\023\020\024R\037\020\b\032\020\022\004\022\0020\n\022\004\022\0020\013\030\0010\t¢\006\b\n\000\032\004\b\025\020\026R\023\020\f\032\004\030\0010\r¢\006\b\n\000\032\004\b\027\020\030R\024\020\031\032\0020\032X\004¢\006\b\n\000\032\004\b\033\020\034¨\006*"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Edit;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep;", "name", "", "description", "changes", "", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;", "changeToCommand", "Lkotlin/Function1;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;", "", "editApproval", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/EditApprovalRequestData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/EditApprovalRequestData;)V", "getName", "()Ljava/lang/String;", "getDescription", "getChanges", "()Ljava/util/List;", "getChangeToCommand", "()Lkotlin/jvm/functions/Function1;", "getEditApproval", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/EditApprovalRequestData;", "stepType", "Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;", "getStepType", "()Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ej-ui"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class Edit
/*    */   extends TaskStep
/*    */ {
/*    */   @NotNull
/*    */   private final String name;
/*    */   @NotNull
/*    */   private final String description;
/*    */   @NotNull
/*    */   private final List<FileChangeView> changes;
/*    */   @Nullable
/*    */   private final Function1<FileChange, Unit> changeToCommand;
/*    */   @Nullable
/*    */   private final EditApprovalRequestData editApproval;
/*    */   @NotNull
/*    */   private final StepType stepType;
/*    */   public static final int $stable = 8;
/*    */   
/*    */   @NotNull
/*    */   public String getName() {
/* 74 */     return this.name; } @NotNull
/* 75 */   public String getDescription() { return this.description; } @NotNull
/* 76 */   public final List<FileChangeView> getChanges() { return this.changes; } @Nullable
/* 77 */   public final Function1<FileChange, Unit> getChangeToCommand() { return this.changeToCommand; } @Nullable
/* 78 */   public final EditApprovalRequestData getEditApproval() { return this.editApproval; }
/* 79 */   public Edit(@NotNull String name, @NotNull String description, @NotNull List<FileChangeView> changes, @Nullable Function1<FileChange, Unit> changeToCommand, @Nullable EditApprovalRequestData editApproval) { super(null); this.name = name; this.description = description; this.changes = changes; this.changeToCommand = changeToCommand; this.editApproval = editApproval;
/* 80 */     this.stepType = StepType.Edit; } @NotNull public StepType getStepType() { return this.stepType; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.name;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.description;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<FileChangeView> component3() {
/*    */     return this.changes;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Function1<FileChange, Unit> component4() {
/*    */     return this.changeToCommand;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final EditApprovalRequestData component5() {
/*    */     return this.editApproval;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Edit copy(@NotNull String name, @NotNull String description, @NotNull List<FileChangeView> changes, @Nullable Function1<? super FileChange, Unit> changeToCommand, @Nullable EditApprovalRequestData editApproval) {
/*    */     Intrinsics.checkNotNullParameter(name, "name");
/*    */     Intrinsics.checkNotNullParameter(description, "description");
/*    */     Intrinsics.checkNotNullParameter(changes, "changes");
/*    */     return new Edit(name, description, changes, changeToCommand, editApproval);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Edit(name=" + this.name + ", description=" + this.description + ", changes=" + this.changes + ", changeToCommand=" + this.changeToCommand + ", editApproval=" + this.editApproval + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.name.hashCode();
/*    */     result = result * 31 + this.description.hashCode();
/*    */     result = result * 31 + this.changes.hashCode();
/*    */     result = result * 31 + ((this.changeToCommand == null) ? 0 : this.changeToCommand.hashCode());
/*    */     return result * 31 + ((this.editApproval == null) ? 0 : this.editApproval.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Edit))
/*    */       return false; 
/*    */     Edit edit = (Edit)other;
/*    */     return !Intrinsics.areEqual(this.name, edit.name) ? false : (!Intrinsics.areEqual(this.description, edit.description) ? false : (!Intrinsics.areEqual(this.changes, edit.changes) ? false : (!Intrinsics.areEqual(this.changeToCommand, edit.changeToCommand) ? false : (!!Intrinsics.areEqual(this.editApproval, edit.editApproval)))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\model\TaskStep$Edit.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */