/*     */ package com.intellij.ml.llm.matterhorn.ej.ui;
/*     */ 
/*     */ import com.intellij.icons.AllIcons;
/*     */ import com.intellij.ml.llm.matterhorn.CacheType;
/*     */ import com.intellij.ml.llm.matterhorn.MatterhornCaches;
/*     */ import com.intellij.openapi.actionSystem.ActionUpdateThread;
/*     */ import com.intellij.openapi.actionSystem.AnAction;
/*     */ import com.intellij.openapi.actionSystem.AnActionEvent;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\b\002\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\020\020\b\032\0020\t2\006\020\n\032\0020\013H\026J\020\020\f\032\0020\t2\006\020\n\032\0020\013H\026J\b\020\r\032\0020\016H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel$ClearCachesAction;", "Lcom/intellij/openapi/actionSystem/AnAction;", "parent", "Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;)V", "getParent", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;", "actionPerformed", "", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "update", "getActionUpdateThread", "Lcom/intellij/openapi/actionSystem/ActionUpdateThread;", "ej-ui"})
/*     */ final class ClearCachesAction
/*     */   extends AnAction
/*     */ {
/*     */   @NotNull
/*     */   private final MatterhornToolWindowPanel parent;
/*     */   
/*     */   public ClearCachesAction(@NotNull MatterhornToolWindowPanel parent) {
/* 402 */     super(AllIcons.Actions.ClearCash); this.parent = parent; } @NotNull public final MatterhornToolWindowPanel getParent() { return this.parent; }
/*     */    public void actionPerformed(@NotNull AnActionEvent e) {
/* 404 */     Intrinsics.checkNotNullParameter(e, "e"); MatterhornToolWindowPanel.access$getStructure$p(this.parent).getRootElement().removeChildren();
/* 405 */     MatterhornToolWindowPanel.access$getModel$p(this.parent).invalidateAsync();
/* 406 */     MatterhornToolWindowPanel.access$getTree$p(this.parent).updateUI();
/* 407 */     if (MatterhornToolWindowPanel.access$getCurrentContext$p(this.parent) != null && MatterhornToolWindowPanel.access$getCurrentContext$p(this.parent).getService() != null && MatterhornToolWindowPanel.access$getCurrentContext$p(this.parent).getService().getCaches() != null) { MatterhornToolWindowPanel.access$getCurrentContext$p(this.parent).getService().getCaches().clear(); } else { MatterhornToolWindowPanel.access$getCurrentContext$p(this.parent).getService().getCaches(); }
/*     */   
/*     */   }
/*     */   public void update(@NotNull AnActionEvent e) {
/* 411 */     Intrinsics.checkNotNullParameter(e, "e"); Job currentJob = MatterhornToolWindowPanel.access$getCurrentJob$p(this.parent);
/*     */     
/* 413 */     MatterhornToolWindowPanel.access$getCurrentContext$p(this.parent).getService(); MatterhornCaches cache = (MatterhornToolWindowPanel.access$getCurrentContext$p(this.parent) != null && MatterhornToolWindowPanel.access$getCurrentContext$p(this.parent).getService() != null) ? MatterhornToolWindowPanel.access$getCurrentContext$p(this.parent).getService().getCaches() : null;
/*     */     
/* 415 */     e.getPresentation().setEnabled(((currentJob == null || !currentJob.isActive()) && 
/* 416 */         cache != null && (cache.hasAnyOfType(CacheType.Artifact) || cache.hasAnyOfType(CacheType.Cache))));
/*     */     
/* 418 */     e.getPresentation().setText("Clear Caches");
/*     */   }
/*     */   @NotNull
/*     */   public ActionUpdateThread getActionUpdateThread() {
/* 422 */     return ActionUpdateThread.BGT;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\MatterhornToolWindowPanel$ClearCachesAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */