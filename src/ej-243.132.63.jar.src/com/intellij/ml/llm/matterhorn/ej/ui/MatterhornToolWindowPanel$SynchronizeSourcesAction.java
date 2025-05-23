/*     */ package com.intellij.ml.llm.matterhorn.ej.ui;
/*     */ 
/*     */ import com.intellij.icons.AllIcons;
/*     */ import com.intellij.ml.llm.matterhorn.Artifactual;
/*     */ import com.intellij.ml.llm.matterhorn.MatterhornServiceScope;
/*     */ import com.intellij.ml.llm.matterhorn.RootExecutionContext;
/*     */ import com.intellij.openapi.actionSystem.ActionUpdateThread;
/*     */ import com.intellij.openapi.actionSystem.AnAction;
/*     */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*     */ import com.intellij.openapi.project.DumbService;
/*     */ import javax.swing.tree.TreePath;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\002\b\002\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\020\020\b\032\0020\t2\006\020\n\032\0020\013H\026J\b\020\f\032\0020\rH\026J\b\020\016\032\0020\tH\002J\b\020\017\032\0020\020H\002J\020\020\021\032\0020\t2\006\020\n\032\0020\013H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel$SynchronizeSourcesAction;", "Lcom/intellij/openapi/actionSystem/AnAction;", "parent", "Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;)V", "getParent", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;", "actionPerformed", "", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "getActionUpdateThread", "Lcom/intellij/openapi/actionSystem/ActionUpdateThread;", "performSynchronizeSourcesAction", "hasRunConfig", "", "update", "ej-ui"})
/*     */ final class SynchronizeSourcesAction
/*     */   extends AnAction
/*     */ {
/*     */   @NotNull
/*     */   private final MatterhornToolWindowPanel parent;
/*     */   
/*     */   public SynchronizeSourcesAction(@NotNull MatterhornToolWindowPanel parent) {
/* 339 */     super(AllIcons.Actions.Rollback); this.parent = parent; } @NotNull public final MatterhornToolWindowPanel getParent() { return this.parent; }
/*     */    public void actionPerformed(@NotNull AnActionEvent e) {
/* 341 */     Intrinsics.checkNotNullParameter(e, "e"); performSynchronizeSourcesAction();
/*     */   }
/*     */   @NotNull
/* 344 */   public ActionUpdateThread getActionUpdateThread() { return ActionUpdateThread.EDT; } private final void performSynchronizeSourcesAction() { RootExecutionContext context;
/*     */     TreePath[] paths;
/*     */     ArtifactNode selectedNode;
/* 347 */     if (MatterhornToolWindowPanel.access$getCurrentContext$p(this.parent) == null) { MatterhornToolWindowPanel.access$getCurrentContext$p(this.parent); return; }
/* 348 */      if (MatterhornToolWindowPanel.access$getTree$p(this.parent).getSelectionPaths() == null) { MatterhornToolWindowPanel.access$getTree$p(this.parent).getSelectionPaths(); return; }
/* 349 */      if (MatterhornToolWindowPanel.access$getSelectedArtifactNode(this.parent, paths) == null) { MatterhornToolWindowPanel.access$getSelectedArtifactNode(this.parent, paths); return; }
/* 350 */      Artifactual artifact = selectedNode.getArtifact(); int $i$a$-let-MatterhornToolWindowPanel$SynchronizeSourcesAction$performSynchronizeSourcesAction$1 = 0;
/* 351 */     BuildersKt.launch$default(MatterhornServiceScope.Companion.getScope(this.parent.getProject()), null, null, new MatterhornToolWindowPanel$SynchronizeSourcesAction$performSynchronizeSourcesAction$1$1(null), 3, null); selectedNode.getArtifact(); } @DebugMetadata(f = "MatterhornToolWindowPanel.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.MatterhornToolWindowPanel$SynchronizeSourcesAction$performSynchronizeSourcesAction$1$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class MatterhornToolWindowPanel$SynchronizeSourcesAction$performSynchronizeSourcesAction$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { int label; public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 363 */           return Unit.INSTANCE; }
/*     */       
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */     MatterhornToolWindowPanel$SynchronizeSourcesAction$performSynchronizeSourcesAction$1$1(Continuation $completion) { super(2, $completion); }
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super MatterhornToolWindowPanel$SynchronizeSourcesAction$performSynchronizeSourcesAction$1$1> $completion) { return (Continuation<Unit>)new MatterhornToolWindowPanel$SynchronizeSourcesAction$performSynchronizeSourcesAction$1$1($completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((MatterhornToolWindowPanel$SynchronizeSourcesAction$performSynchronizeSourcesAction$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }
/* 368 */    private final boolean hasRunConfig() { return false; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void update(@NotNull AnActionEvent e) {
/* 381 */     Intrinsics.checkNotNullParameter(e, "e"); Intrinsics.checkNotNull(e.getProject()); e.getPresentation().setEnabled((!DumbService.Companion.isDumb(e.getProject()) && hasRunConfig()));
/* 382 */     e.getPresentation().setText("Synchronize Sources");
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\MatterhornToolWindowPanel$SynchronizeSourcesAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */