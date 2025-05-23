/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.actions;
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\b\007\030\0002\0020\001B\021\022\b\020\002\032\004\030\0010\003¢\006\004\b\004\020\005J\020\020\006\032\0020\0072\006\020\b\032\0020\tH\026R\020\020\002\032\004\030\0010\003X\004¢\006\002\n\000¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/actions/ShowSettingsAction;", "Lcom/intellij/openapi/project/DumbAwareAction;", "project", "Lcom/intellij/openapi/project/Project;", "<init>", "(Lcom/intellij/openapi/project/Project;)V", "actionPerformed", "", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "ej-ui"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class ShowSettingsAction extends DumbAwareAction {
/*    */   @Nullable
/*    */   private final Project project;
/*    */   
/*    */   public ShowSettingsAction(@Nullable Project project) {
/*  9 */     super("Settings..."); this.project = project;
/*    */   } public static final int $stable = 8;
/*    */   public void actionPerformed(@NotNull AnActionEvent e) {
/* 12 */     Intrinsics.checkNotNullParameter(e, "e"); ShowSettingsUtil showSettingsUtil = ShowSettingsUtil.getInstance();
/* 13 */     showSettingsUtil.showSettingsDialog(this.project, MatterhornBundle.message("junie.configurable.top.level.name", new Object[0]));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\actions\ShowSettingsAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */