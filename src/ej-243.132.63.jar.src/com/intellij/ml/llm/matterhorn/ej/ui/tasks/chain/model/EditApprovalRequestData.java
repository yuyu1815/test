/*   */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model;
/*   */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\002\n\002\b\t\b\007\030\0002\0020\001B3\022\006\020\002\032\0020\003\022\020\b\002\020\004\032\n\022\004\022\0020\006\030\0010\005\022\020\b\002\020\007\032\n\022\004\022\0020\006\030\0010\005¢\006\004\b\b\020\tR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\n\020\013R\031\020\004\032\n\022\004\022\0020\006\030\0010\005¢\006\b\n\000\032\004\b\f\020\rR\031\020\007\032\n\022\004\022\0020\006\030\0010\005¢\006\b\n\000\032\004\b\016\020\r¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/EditApprovalRequestData;", "", "change", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;", "approveEditAction", "Lkotlin/Function0;", "", "declineEditAction", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getChange", "()Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;", "getApproveEditAction", "()Lkotlin/jvm/functions/Function0;", "getDeclineEditAction", "ej-ui"})
/*   */ @StabilityInferred(parameters = 0)
/*   */ public final class EditApprovalRequestData { @NotNull
/*   */   private final FileChange change; @Nullable
/* 6 */   private final Function0<Unit> approveEditAction; public EditApprovalRequestData(@NotNull FileChange change, @Nullable Function0<Unit> approveEditAction, @Nullable Function0<Unit> declineEditAction) { this.change = change;
/* 7 */     this.approveEditAction = approveEditAction;
/* 8 */     this.declineEditAction = declineEditAction; } @Nullable private final Function0<Unit> declineEditAction; public static final int $stable = 8; @NotNull public final FileChange getChange() { return this.change; } @Nullable public final Function0<Unit> getApproveEditAction() { return this.approveEditAction; } @Nullable public final Function0<Unit> getDeclineEditAction() { return this.declineEditAction; }
/*   */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\model\EditApprovalRequestData.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */