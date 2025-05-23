/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.ui.TerminalUiUtils;
/*    */ import com.intellij.openapi.Disposable;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.terminal.TerminalTitle;
/*    */ import com.intellij.terminal.TerminalTitleKt;
/*    */ import com.jediterm.core.util.TermSize;
/*    */ import com.jediterm.terminal.TtyConnector;
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ import javax.swing.JComponent;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.plugins.terminal.JBTerminalSystemSettingsProvider;
/*    */ import org.jetbrains.plugins.terminal.ShellTerminalWidget;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000d\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\002\b\000\030\0002\0020\001B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\004\b\b\020\tJ\030\020\022\032\0020\0232\006\020\024\032\0020\0252\006\020\026\032\0020\027H\026J\n\020\030\032\004\030\0010\027H\026J\f\020\031\032\006\022\002\b\0030\032H\026J\b\020\033\032\0020\034H\026J\030\020\035\032\0020\0232\006\020\036\032\0020\0372\006\020 \032\0020!H\026J\020\020\"\032\0020\0232\006\020#\032\0020$H\026J\b\020%\032\0020\023H\026R\016\020\n\032\0020\013X\004¢\006\002\n\000R\024\020\f\032\0020\r8VX\004¢\006\006\032\004\b\016\020\017R\024\020\020\032\0020\r8VX\004¢\006\006\032\004\b\021\020\017¨\006&"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/OldPlainTerminalView;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalContentView;", "project", "Lcom/intellij/openapi/project/Project;", "settings", "Lorg/jetbrains/plugins/terminal/JBTerminalSystemSettingsProvider;", "terminalTitle", "Lcom/intellij/terminal/TerminalTitle;", "<init>", "(Lcom/intellij/openapi/project/Project;Lorg/jetbrains/plugins/terminal/JBTerminalSystemSettingsProvider;Lcom/intellij/terminal/TerminalTitle;)V", "widget", "Lorg/jetbrains/plugins/terminal/ShellTerminalWidget;", "component", "Ljavax/swing/JComponent;", "getComponent", "()Ljavax/swing/JComponent;", "preferredFocusableComponent", "getPreferredFocusableComponent", "connectToTty", "", "ttyConnector", "Lcom/jediterm/terminal/TtyConnector;", "initialTermSize", "Lcom/jediterm/core/util/TermSize;", "getTerminalSize", "getTerminalSizeInitializedFuture", "Ljava/util/concurrent/CompletableFuture;", "isFocused", "", "addTerminationCallback", "onTerminated", "Ljava/lang/Runnable;", "parentDisposable", "Lcom/intellij/openapi/Disposable;", "sendCommandToExecute", "shellCommand", "", "dispose", "ej-core"})
/*    */ public final class OldPlainTerminalView
/*    */   implements TerminalContentView {
/*    */   @NotNull
/*    */   private final ShellTerminalWidget widget;
/*    */   
/*    */   @NotNull
/*    */   public JComponent getComponent() {
/*    */     Intrinsics.checkNotNullExpressionValue(this.widget.getComponent(), "getComponent(...)");
/*    */     return this.widget.getComponent();
/*    */   }
/*    */   
/*    */   public OldPlainTerminalView(@NotNull Project project, @NotNull JBTerminalSystemSettingsProvider settings, @NotNull TerminalTitle terminalTitle) {
/* 32 */     this.widget = new ShellTerminalWidget(project, settings, this);
/* 33 */     Intrinsics.checkNotNullExpressionValue(this.widget.getTerminal(), "getTerminal(...)"); TerminalTitleKt.bindApplicationTitle(terminalTitle, this.widget.getTerminal(), this);
/*    */   }
/*    */   
/*    */   public void connectToTty(@NotNull TtyConnector ttyConnector, @NotNull TermSize initialTermSize) {
/* 37 */     Intrinsics.checkNotNullParameter(ttyConnector, "ttyConnector"); Intrinsics.checkNotNullParameter(initialTermSize, "initialTermSize"); this.widget.asNewWidget().connectToTty(ttyConnector, initialTermSize);
/*    */   } @NotNull
/*    */   public JComponent getPreferredFocusableComponent() { Intrinsics.checkNotNullExpressionValue(this.widget.getPreferredFocusableComponent(), "getPreferredFocusableComponent(...)");
/*    */     return this.widget.getPreferredFocusableComponent(); } @Nullable
/* 41 */   public TermSize getTerminalSize() { return this.widget.getTerminalPanel().getTerminalSizeFromComponent(); }
/*    */   
/*    */   @NotNull
/*    */   public CompletableFuture<?> getTerminalSizeInitializedFuture() {
/* 45 */     return TerminalUiUtils.INSTANCE.getComponentSizeInitializedFuture(getComponent());
/*    */   }
/*    */   
/*    */   public boolean isFocused() {
/* 49 */     return this.widget.getTerminalPanel().hasFocus();
/*    */   }
/*    */   
/*    */   public void addTerminationCallback(@NotNull Runnable onTerminated, @NotNull Disposable parentDisposable) {
/* 53 */     Intrinsics.checkNotNullParameter(onTerminated, "onTerminated"); Intrinsics.checkNotNullParameter(parentDisposable, "parentDisposable"); this.widget.asNewWidget().addTerminationCallback(onTerminated, parentDisposable);
/*    */   }
/*    */   
/*    */   public void sendCommandToExecute(@NotNull String shellCommand) {
/* 57 */     Intrinsics.checkNotNullParameter(shellCommand, "shellCommand"); this.widget.executeCommand(shellCommand);
/*    */   }
/*    */   
/*    */   public void dispose() {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\OldPlainTerminalView.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */