/*   */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model;
/*   */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\002\n\002\b\t\b\007\030\0002\0020\001B3\022\006\020\002\032\0020\003\022\020\b\002\020\004\032\n\022\004\022\0020\006\030\0010\005\022\020\b\002\020\007\032\n\022\004\022\0020\006\030\0010\005¢\006\004\b\b\020\tR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\n\020\013R\031\020\004\032\n\022\004\022\0020\006\030\0010\005¢\006\b\n\000\032\004\b\f\020\rR\031\020\007\032\n\022\004\022\0020\006\030\0010\005¢\006\b\n\000\032\004\b\016\020\r¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/ActionApprovalRequestData;", "", "action", "Lcom/intellij/ml/llm/matterhorn/ej/core/ActionApprovalRequest;", "runAction", "Lkotlin/Function0;", "", "skipAction", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/ActionApprovalRequest;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getAction", "()Lcom/intellij/ml/llm/matterhorn/ej/core/ActionApprovalRequest;", "getRunAction", "()Lkotlin/jvm/functions/Function0;", "getSkipAction", "ej-ui"})
/*   */ @StabilityInferred(parameters = 0)
/*   */ public final class ActionApprovalRequestData { @NotNull
/*   */   private final ActionApprovalRequest action; @Nullable
/* 6 */   private final Function0<Unit> runAction; public ActionApprovalRequestData(@NotNull ActionApprovalRequest action, @Nullable Function0<Unit> runAction, @Nullable Function0<Unit> skipAction) { this.action = action;
/* 7 */     this.runAction = runAction;
/* 8 */     this.skipAction = skipAction; } @Nullable private final Function0<Unit> skipAction; public static final int $stable = 8; @NotNull public final ActionApprovalRequest getAction() { return this.action; } @Nullable public final Function0<Unit> getRunAction() { return this.runAction; } @Nullable public final Function0<Unit> getSkipAction() { return this.skipAction; }
/*   */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\model\ActionApprovalRequestData.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */