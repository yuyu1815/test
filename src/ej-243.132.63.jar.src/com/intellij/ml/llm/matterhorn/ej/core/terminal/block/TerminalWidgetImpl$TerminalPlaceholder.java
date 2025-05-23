/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.ui.TerminalUi;
/*     */ import com.intellij.openapi.Disposable;
/*     */ import com.jediterm.core.util.TermSize;
/*     */ import com.jediterm.terminal.TtyConnector;
/*     */ import java.awt.Color;
/*     */ import java.util.List;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.concurrent.CopyOnWriteArrayList;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JPanel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020!\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\005\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\013\n\002\b\n\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J\030\020\021\032\0020\0222\006\020\023\032\0020\0242\006\020\025\032\0020\026H\026J\n\020\027\032\004\030\0010\026H\026J\f\020\030\032\006\022\002\b\0030\031H\026J\b\020\032\032\0020\033H\026J\030\020\034\032\0020\0222\006\020\035\032\0020\0072\006\020\036\032\0020\bH\026J\020\020\037\032\0020\0222\006\020 \032\0020\nH\026J\016\020!\032\0020\0222\006\020\"\032\0020\001J\016\020#\032\0020\0222\006\020\"\032\0020\001J\b\020$\032\0020\022H\026R \020\004\032\024\022\020\022\016\022\004\022\0020\007\022\004\022\0020\b0\0060\005X\004¢\006\002\n\000R\024\020\t\032\b\022\004\022\0020\n0\005X\004¢\006\002\n\000R\024\020\013\032\0020\fX\004¢\006\b\n\000\032\004\b\r\020\016R\024\020\017\032\0020\fX\004¢\006\b\n\000\032\004\b\020\020\016¨\006%"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalWidgetImpl$TerminalPlaceholder;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalContentView;", "<init>", "()V", "postponedTerminationCallbackInfos", "", "Lkotlin/Pair;", "Ljava/lang/Runnable;", "Lcom/intellij/openapi/Disposable;", "postponedShellCommands", "", "component", "Ljavax/swing/JComponent;", "getComponent", "()Ljavax/swing/JComponent;", "preferredFocusableComponent", "getPreferredFocusableComponent", "connectToTty", "", "ttyConnector", "Lcom/jediterm/terminal/TtyConnector;", "initialTermSize", "Lcom/jediterm/core/util/TermSize;", "getTerminalSize", "getTerminalSizeInitializedFuture", "Ljava/util/concurrent/CompletableFuture;", "isFocused", "", "addTerminationCallback", "onTerminated", "parentDisposable", "sendCommandToExecute", "shellCommand", "moveTerminationCallbacksTo", "destView", "executePostponedShellCommands", "dispose", "ej-core"})
/*     */ final class TerminalPlaceholder
/*     */   implements TerminalContentView
/*     */ {
/*     */   @NotNull
/* 142 */   private final List<Pair<Runnable, Disposable>> postponedTerminationCallbackInfos = new CopyOnWriteArrayList<>(); @NotNull
/* 143 */   private final List<String> postponedShellCommands = new CopyOnWriteArrayList<>();
/*     */   @NotNull
/* 145 */   private final JComponent component = new TerminalWidgetImpl$TerminalPlaceholder$component$1(); @NotNull public JComponent getComponent() { return this.component; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\013\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001¨\006\002"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalWidgetImpl$TerminalPlaceholder$component$1", "Ljavax/swing/JPanel;", "ej-core"})
/*     */   public static final class TerminalWidgetImpl$TerminalPlaceholder$component$1 extends JPanel { TerminalWidgetImpl$TerminalPlaceholder$component$1() {
/* 147 */       setBackground((Color)TerminalUi.defaultBackground$default(TerminalUi.INSTANCE, null, 1, null));
/*     */     } }
/*     */   
/*     */   @NotNull
/* 151 */   private final JComponent preferredFocusableComponent = getComponent(); @NotNull public JComponent getPreferredFocusableComponent() { return this.preferredFocusableComponent; }
/*     */   
/*     */   public void connectToTty(@NotNull TtyConnector ttyConnector, @NotNull TermSize initialTermSize) {
/* 154 */     Intrinsics.checkNotNullParameter(ttyConnector, "ttyConnector"); Intrinsics.checkNotNullParameter(initialTermSize, "initialTermSize"); throw new IllegalStateException("Unexpected method call".toString());
/*     */   }
/*     */   @Nullable
/* 157 */   public TermSize getTerminalSize() { return null; } @NotNull
/*     */   public CompletableFuture<?> getTerminalSizeInitializedFuture() {
/* 159 */     Intrinsics.checkNotNullExpressionValue(CompletableFuture.completedFuture(Unit.INSTANCE), "completedFuture(...)"); return CompletableFuture.completedFuture(Unit.INSTANCE);
/*     */   } public boolean isFocused() {
/* 161 */     return false;
/*     */   }
/*     */   public void addTerminationCallback(@NotNull Runnable onTerminated, @NotNull Disposable parentDisposable) {
/* 164 */     Intrinsics.checkNotNullParameter(onTerminated, "onTerminated"); Intrinsics.checkNotNullParameter(parentDisposable, "parentDisposable"); this.postponedTerminationCallbackInfos.add(new Pair(onTerminated, parentDisposable));
/*     */   }
/*     */   
/*     */   public void sendCommandToExecute(@NotNull String shellCommand) {
/* 168 */     Intrinsics.checkNotNullParameter(shellCommand, "shellCommand"); this.postponedShellCommands.add(shellCommand);
/*     */   }
/*     */   
/*     */   public final void moveTerminationCallbacksTo(@NotNull TerminalContentView destView) {
/* 172 */     Intrinsics.checkNotNullParameter(destView, "destView"); for (Pair<Runnable, Disposable> info : this.postponedTerminationCallbackInfos) {
/* 173 */       destView.addTerminationCallback((Runnable)info.getFirst(), (Disposable)info.getSecond());
/*     */     }
/* 175 */     this.postponedTerminationCallbackInfos.clear();
/*     */   }
/*     */   
/*     */   public final void executePostponedShellCommands(@NotNull TerminalContentView destView) {
/* 179 */     Intrinsics.checkNotNullParameter(destView, "destView"); for (String shellCommand : this.postponedShellCommands) {
/* 180 */       destView.sendCommandToExecute(shellCommand);
/*     */     }
/* 182 */     this.postponedShellCommands.clear();
/*     */   }
/*     */   
/*     */   public void dispose() {
/* 186 */     this.postponedTerminationCallbackInfos.clear();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\TerminalWidgetImpl$TerminalPlaceholder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */