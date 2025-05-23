/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.BlockTerminalSession;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.ui.TerminalUiUtils;
/*    */ import com.intellij.openapi.Disposable;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.util.Disposer;
/*    */ import com.intellij.terminal.JBTerminalSystemSettingsProviderBase;
/*    */ import com.jediterm.core.util.TermSize;
/*    */ import com.jediterm.terminal.TtyConnector;
/*    */ import java.awt.Dimension;
/*    */ import java.awt.event.ComponentAdapter;
/*    */ import java.awt.event.ComponentEvent;
/*    */ import javax.swing.JComponent;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000d\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\002\b\000\030\0002\0020\001B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\004\b\b\020\tJ\030\020\022\032\0020\0232\006\020\024\032\0020\0252\006\020\026\032\0020\027H\026J\n\020\030\032\004\030\0010\027H\026J\f\020\031\032\006\022\002\b\0030\032H\026J\b\020\033\032\0020\034H\026J\030\020\035\032\0020\0232\006\020\036\032\0020\0372\006\020 \032\0020!H\026J\020\020\"\032\0020\0232\006\020#\032\0020$H\026J\b\020%\032\0020\023H\026R\016\020\004\032\0020\005X\004¢\006\002\n\000R\024\020\n\032\0020\0138VX\004¢\006\006\032\004\b\f\020\rR\024\020\016\032\0020\0138VX\004¢\006\006\032\004\b\017\020\rR\016\020\020\032\0020\021X\004¢\006\002\n\000¨\006&"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/PlainTerminalView;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalContentView;", "project", "Lcom/intellij/openapi/project/Project;", "session", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;", "settings", "Lcom/intellij/terminal/JBTerminalSystemSettingsProviderBase;", "<init>", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;Lcom/intellij/terminal/JBTerminalSystemSettingsProviderBase;)V", "component", "Ljavax/swing/JComponent;", "getComponent", "()Ljavax/swing/JComponent;", "preferredFocusableComponent", "getPreferredFocusableComponent", "view", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/SimpleTerminalView;", "connectToTty", "", "ttyConnector", "Lcom/jediterm/terminal/TtyConnector;", "initialTermSize", "Lcom/jediterm/core/util/TermSize;", "getTerminalSize", "getTerminalSizeInitializedFuture", "Ljava/util/concurrent/CompletableFuture;", "isFocused", "", "addTerminationCallback", "onTerminated", "Ljava/lang/Runnable;", "parentDisposable", "Lcom/intellij/openapi/Disposable;", "sendCommandToExecute", "shellCommand", "", "dispose", "ej-core"})
/*    */ public final class PlainTerminalView implements TerminalContentView {
/*    */   @NotNull
/*    */   private final BlockTerminalSession session;
/*    */   @NotNull
/*    */   private final SimpleTerminalView view;
/*    */   
/* 26 */   public PlainTerminalView(@NotNull Project project, @NotNull BlockTerminalSession session, @NotNull JBTerminalSystemSettingsProviderBase settings) { this.session = session;
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
/* 37 */     this.view = new SimpleTerminalView(project, settings, this.session, false, 8, null);
/* 38 */     this.view.getComponent().addComponentListener(new ComponentAdapter() { public void componentResized(ComponentEvent e) {
/*    */             TermSize newSize;
/* 40 */             if (PlainTerminalView.this.getTerminalSize() == null) { PlainTerminalView.this.getTerminalSize(); return; }
/* 41 */              PlainTerminalView.this.session.postResize(newSize);
/*    */           } }
/*    */       );
/*    */     
/* 45 */     Disposer.register(this, this.view); }
/*    */   @NotNull
/*    */   public JComponent getComponent() {
/*    */     return this.view.getComponent();
/* 49 */   } public void connectToTty(@NotNull TtyConnector ttyConnector, @NotNull TermSize initialTermSize) { Intrinsics.checkNotNullParameter(ttyConnector, "ttyConnector"); Intrinsics.checkNotNullParameter(initialTermSize, "initialTermSize"); this.session.getController$ej_core().resize(initialTermSize, RequestOrigin.User);
/* 50 */     this.session.start(ttyConnector); } @NotNull
/*    */   public JComponent getPreferredFocusableComponent() {
/*    */     return this.view.getPreferredFocusableComponent();
/*    */   } @Nullable
/*    */   public TermSize getTerminalSize() {
/* 55 */     if (this.view.getComponent().getBounds().isEmpty()) return null; 
/* 56 */     Dimension contentSize = new Dimension(this.view.getTerminalWidth(), this.view.getComponent().getHeight());
/* 57 */     return TerminalUiUtils.INSTANCE.calculateTerminalSize(contentSize, this.view.getCharSize());
/*    */   }
/*    */   @NotNull
/*    */   public CompletableFuture<?> getTerminalSizeInitializedFuture() {
/* 61 */     return TerminalUiUtils.INSTANCE.getComponentSizeInitializedFuture(getComponent());
/*    */   }
/*    */   
/*    */   public boolean isFocused() {
/* 65 */     return this.view.isFocused();
/*    */   }
/*    */   
/*    */   public void addTerminationCallback(@NotNull Runnable onTerminated, @NotNull Disposable parentDisposable) {
/* 69 */     Intrinsics.checkNotNullParameter(onTerminated, "onTerminated"); Intrinsics.checkNotNullParameter(parentDisposable, "parentDisposable"); this.session.addTerminationCallback(onTerminated, parentDisposable);
/*    */   }
/*    */   
/*    */   public void sendCommandToExecute(@NotNull String shellCommand) {
/* 73 */     Intrinsics.checkNotNullParameter(shellCommand, "shellCommand"); this.session.getCommandExecutionManager$ej_core().sendCommandToExecute(shellCommand);
/*    */   }
/*    */   
/*    */   public void dispose() {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\PlainTerminalView.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */