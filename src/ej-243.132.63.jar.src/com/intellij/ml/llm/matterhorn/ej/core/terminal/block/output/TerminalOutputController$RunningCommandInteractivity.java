/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.BlockTerminalScopeProvider;
/*     */ import com.intellij.openapi.Disposable;
/*     */ import com.intellij.openapi.util.Disposer;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.CoroutineScopeKt;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\b\004\030\0002\0020\001B\021\022\b\020\002\032\004\030\0010\003¢\006\004\b\004\020\005J\b\020\026\032\0020\023H\002R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\b\020\tR\021\020\n\032\0020\013¢\006\b\n\000\032\004\b\f\020\rR\021\020\016\032\0020\017¢\006\b\n\000\032\004\b\020\020\021R\021\020\022\032\0020\023¢\006\b\n\000\032\004\b\024\020\025¨\006\027"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController$RunningCommandInteractivity;", "", "command", "", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController;Ljava/lang/String;)V", "disposable", "Lcom/intellij/openapi/Disposable;", "getDisposable", "()Lcom/intellij/openapi/Disposable;", "caretModel", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalCaretModel;", "getCaretModel", "()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalCaretModel;", "caretPainter", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalCaretPainter;", "getCaretPainter", "()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalCaretPainter;", "contentUpdatesScheduler", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputContentUpdatesScheduler;", "getContentUpdatesScheduler", "()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputContentUpdatesScheduler;", "setupContentUpdating", "ej-core"})
/*     */ final class RunningCommandInteractivity
/*     */ {
/*     */   @NotNull
/*     */   private final Disposable disposable;
/*     */   @NotNull
/*     */   private final TerminalCaretModel caretModel;
/*     */   
/*     */   public RunningCommandInteractivity(String command) {
/* 454 */     Intrinsics.checkNotNullExpressionValue(Disposer.newDisposable((Disposable)TerminalOutputController.access$getSession$p(TerminalOutputController.this), "command " + command), "newDisposable(...)"); this.disposable = Disposer.newDisposable((Disposable)TerminalOutputController.access$getSession$p(TerminalOutputController.this), "command " + command);
/* 455 */     this.caretModel = new TerminalCaretModel(TerminalOutputController.access$getSession$p(TerminalOutputController.this), TerminalOutputController.this.getOutputModel(), TerminalOutputController.access$getEditor$p(TerminalOutputController.this), this.disposable);
/* 456 */     this.caretPainter = new TerminalCaretPainter(this.caretModel, TerminalOutputController.this.getOutputModel(), TerminalOutputController.this.getSelectionModel(), TerminalOutputController.access$getEditor$p(TerminalOutputController.this));
/*     */ 
/*     */ 
/*     */     
/* 460 */     Disposer.register((Disposable)TerminalOutputController.access$getSession$p(TerminalOutputController.this), this.disposable);
/* 461 */     Disposer.register(this.disposable, this.caretPainter);
/* 462 */     BlockTerminalEventsHandler eventsHandler = new BlockTerminalEventsHandler(TerminalOutputController.access$getSession$p(TerminalOutputController.this), TerminalOutputController.access$getSettings$p(TerminalOutputController.this), TerminalOutputController.this);
/* 463 */     TerminalEventDispatcherKt.setupKeyEventDispatcher(TerminalOutputController.access$getEditor$p(TerminalOutputController.this), (TerminalEventsHandler)eventsHandler, this.disposable);
/* 464 */     TerminalEventDispatcherKt.setupMouseListener(TerminalOutputController.access$getEditor$p(TerminalOutputController.this), TerminalOutputController.access$getSettings$p(TerminalOutputController.this), TerminalOutputController.access$getSession$p(TerminalOutputController.this).getModel(), (TerminalEventsHandler)eventsHandler, this.disposable);
/* 465 */     (new TerminalOutputEditorInputMethodSupport(TerminalOutputController.access$getEditor$p(TerminalOutputController.this), TerminalOutputController.access$getSession$p(TerminalOutputController.this), this.caretModel)).install(this.disposable);
/* 466 */     this.contentUpdatesScheduler = setupContentUpdating();
/*     */   } @NotNull
/*     */   private final TerminalCaretPainter caretPainter; @NotNull
/*     */   private final TerminalOutputContentUpdatesScheduler contentUpdatesScheduler; private final TerminalOutputContentUpdatesScheduler setupContentUpdating() {
/* 470 */     CoroutineScope scope = BlockTerminalScopeProvider.childScope$default(BlockTerminalScopeProvider.Companion.getInstance(TerminalOutputController.access$getProject$p(TerminalOutputController.this)), "Command block content update", null, false, 6, null);
/* 471 */     Disposer.register(this.disposable, scope::setupContentUpdating$lambda$0);
/*     */ 
/*     */     
/* 474 */     TerminalOutputContentUpdatesScheduler collector = new TerminalOutputContentUpdatesScheduler(TerminalOutputController.access$getSession$p(TerminalOutputController.this).getModel().getTextBuffer$ej_core(), TerminalOutputController.access$getSession$p(TerminalOutputController.this).getShellIntegration(), scope, TerminalOutputController.this::setupContentUpdating$lambda$1);
/*     */ 
/*     */     
/* 477 */     collector.startUpdating();
/* 478 */     return collector;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Disposable getDisposable() {
/*     */     return this.disposable;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final TerminalCaretModel getCaretModel() {
/*     */     return this.caretModel;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final TerminalCaretPainter getCaretPainter() {
/*     */     return this.caretPainter;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final TerminalOutputContentUpdatesScheduler getContentUpdatesScheduler() {
/*     */     return this.contentUpdatesScheduler;
/*     */   }
/*     */   
/*     */   private static final void setupContentUpdating$lambda$0(CoroutineScope $scope) {
/*     */     CoroutineScopeKt.cancel$default($scope, null, 1, null);
/*     */   }
/*     */   
/*     */   private static final Unit setupContentUpdating$lambda$1(TerminalOutputController this$0, PartialCommandOutput output) {
/*     */     Intrinsics.checkNotNullParameter(output, "output");
/*     */     TerminalOutputController.access$updateCommandOutput(TerminalOutputController.this, output);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalOutputController$RunningCommandInteractivity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */