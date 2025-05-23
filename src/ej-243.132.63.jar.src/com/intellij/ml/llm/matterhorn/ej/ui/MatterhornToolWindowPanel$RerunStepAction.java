/*     */ package com.intellij.ml.llm.matterhorn.ej.ui;
/*     */ 
/*     */ import com.intellij.icons.AllIcons;
/*     */ import com.intellij.openapi.actionSystem.ActionUpdateThread;
/*     */ import com.intellij.openapi.actionSystem.AnAction;
/*     */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*     */ import com.intellij.openapi.project.DumbService;
/*     */ import javax.swing.tree.TreePath;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.coroutines.Job;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\007\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\002\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\020\020\f\032\0020\r2\006\020\016\032\0020\017H\026J\b\020\020\032\0020\021H\026J\b\020\022\032\0020\rH\002J\020\020\023\032\0020\r2\006\020\016\032\0020\017H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel$RerunStepAction;", "Lcom/intellij/openapi/actionSystem/AnAction;", "parent", "Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;", "singleStep", "", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;Z)V", "getParent", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;", "getSingleStep", "()Z", "actionPerformed", "", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "getActionUpdateThread", "Lcom/intellij/openapi/actionSystem/ActionUpdateThread;", "performRerunStepAction", "update", "ej-ui"})
/*     */ final class RerunStepAction
/*     */   extends AnAction
/*     */ {
/*     */   @NotNull
/*     */   private final MatterhornToolWindowPanel parent;
/*     */   private final boolean singleStep;
/*     */   
/*     */   public RerunStepAction(@NotNull MatterhornToolWindowPanel parent, boolean singleStep) {
/* 307 */     super(AllIcons.Actions.Rerun); this.parent = parent; this.singleStep = singleStep; } @NotNull public final MatterhornToolWindowPanel getParent() { return this.parent; } public final boolean getSingleStep() { return this.singleStep; }
/*     */    public void actionPerformed(@NotNull AnActionEvent e) {
/* 309 */     Intrinsics.checkNotNullParameter(e, "e"); performRerunStepAction();
/*     */   } @NotNull
/*     */   public ActionUpdateThread getActionUpdateThread() {
/* 312 */     return ActionUpdateThread.EDT;
/*     */   }
/*     */   private final void performRerunStepAction() {
/* 315 */     TreePath[] it = MatterhornToolWindowPanel.access$getTree$p(this.parent).getSelectionPaths(); int $i$a$-let-MatterhornToolWindowPanel$RerunStepAction$performRerunStepAction$1 = 0;
/* 316 */     ArtifactNode selectedNode = MatterhornToolWindowPanel.access$getSelectedArtifactNode(this.parent, it);
/* 317 */     if (selectedNode != null) {
/* 318 */       if (MatterhornToolWindowPanel.access$getCurrentJob$p(this.parent) != null) { Job.DefaultImpls.cancel$default(MatterhornToolWindowPanel.access$getCurrentJob$p(this.parent), null, 1, null); } else { MatterhornToolWindowPanel.access$getCurrentJob$p(this.parent); }
/* 319 */        MatterhornToolWindowPanel.access$setCurrentJob$p(this.parent, null);
/* 320 */       if (!this.singleStep) {
/* 321 */         MatterhornToolWindowPanel.access$deleteDependentsRecursively(this.parent, selectedNode);
/*     */       } else {
/* 323 */         MatterhornToolWindowPanel.access$invalidateNode(this.parent, selectedNode);
/* 324 */       }  MatterhornToolWindowPanel.access$getModel$p(this.parent).invalidateAsync();
/* 325 */       MatterhornToolWindowPanel.access$getTree$p(this.parent).updateUI();
/* 326 */       String str = MatterhornToolWindowPanel.access$getCurrentContext$p(this.parent).getCurrentActionName(); int $i$a$-let-MatterhornToolWindowPanel$RerunStepAction$performRerunStepAction$1$1 = 0;
/* 327 */       MatterhornToolWindowPanelKt.performGenerationAction(this.parent.getProject(), MatterhornToolWindowPanel.access$getProjectDescriptionFile$p(this.parent), str);
/*     */       MatterhornToolWindowPanel.access$getCurrentContext$p(this.parent).getCurrentActionName();
/*     */     } 
/*     */     MatterhornToolWindowPanel.access$getTree$p(this.parent).getSelectionPaths();
/*     */   }
/*     */   
/*     */   public void update(@NotNull AnActionEvent e) {
/* 334 */     Intrinsics.checkNotNullParameter(e, "e"); Intrinsics.checkNotNull(e.getProject()); e.getPresentation().setEnabled(!DumbService.Companion.isDumb(e.getProject()));
/* 335 */     e.getPresentation().setText(this.singleStep ? "Rerun Single Step" : "Rerun Step");
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\MatterhornToolWindowPanel$RerunStepAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */