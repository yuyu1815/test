/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.scraper.TerminalLinesCollector;
/*     */ import com.intellij.openapi.Disposable;
/*     */ import com.jediterm.terminal.model.TerminalModelListener;
/*     */ import com.jediterm.terminal.model.TerminalTextBuffer;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\0002\n\000\n\002\020\f\n\000\n\002\020\016\n\000\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\032\036\020\004\032\0020\005*\0020\0062\006\020\007\032\0020\b2\b\b\002\020\t\032\0020\nH\000\032\034\020\013\032\0020\005*\0020\0062\006\020\f\032\0020\r2\006\020\016\032\0020\017H\000\"\016\020\000\032\0020\001XT¢\006\002\n\000\"\016\020\002\032\0020\003XT¢\006\002\n\000¨\006\020"}, d2 = {"NEW_LINE", "", "NEW_LINE_STRING", "", "collectLines", "", "Lcom/jediterm/terminal/model/TerminalTextBuffer;", "terminalLinesCollector", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/scraper/TerminalLinesCollector;", "startLine", "", "addModelListener", "parentDisposable", "Lcom/intellij/openapi/Disposable;", "listener", "Lcom/jediterm/terminal/model/TerminalModelListener;", "ej-core"})
/*     */ public final class ShellCommandOutputScraperImplKt
/*     */ {
/*     */   public static final char NEW_LINE = '\n';
/*     */   @NotNull
/*     */   public static final String NEW_LINE_STRING = "\n";
/*     */   
/*     */   public static final void collectLines(@NotNull TerminalTextBuffer $this$collectLines, @NotNull TerminalLinesCollector terminalLinesCollector, int startLine) {
/* 117 */     Intrinsics.checkNotNullParameter($this$collectLines, "<this>"); Intrinsics.checkNotNullParameter(terminalLinesCollector, "terminalLinesCollector"); int adjustedStartLine = $this$collectLines.isUsingAlternateBuffer() ? Math.max(0, startLine) : startLine;
/* 118 */     for (int ind = adjustedStartLine, i = $this$collectLines.getScreenLinesCount(); ind < i; ind++) {
/* 119 */       terminalLinesCollector.addLine($this$collectLines.getLine(ind));
/*     */     }
/* 121 */     terminalLinesCollector.flush();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static final void addModelListener$lambda$0(TerminalTextBuffer $this_addModelListener, TerminalModelListener $listener) {
/* 127 */     $this_addModelListener.removeModelListener($listener);
/*     */   }
/*     */   
/*     */   public static final void addModelListener(@NotNull TerminalTextBuffer $this$addModelListener, @NotNull Disposable parentDisposable, @NotNull TerminalModelListener listener) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc '<this>'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'parentDisposable'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_2
/*     */     //   13: ldc 'listener'
/*     */     //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   18: aload_0
/*     */     //   19: aload_2
/*     */     //   20: invokevirtual addModelListener : (Lcom/jediterm/terminal/model/TerminalModelListener;)V
/*     */     //   23: aload_1
/*     */     //   24: aload_0
/*     */     //   25: aload_2
/*     */     //   26: <illegal opcode> dispose : (Lcom/jediterm/terminal/model/TerminalTextBuffer;Lcom/jediterm/terminal/model/TerminalModelListener;)Lcom/intellij/openapi/Disposable;
/*     */     //   31: invokestatic register : (Lcom/intellij/openapi/Disposable;Lcom/intellij/openapi/Disposable;)V
/*     */     //   34: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #125	-> 18
/*     */     //   #126	-> 23
/*     */     //   #129	-> 34
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	35	0	$this$addModelListener	Lcom/jediterm/terminal/model/TerminalTextBuffer;
/*     */     //   0	35	1	parentDisposable	Lcom/intellij/openapi/Disposable;
/*     */     //   0	35	2	listener	Lcom/jediterm/terminal/model/TerminalModelListener;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\session\ShellCommandOutputScraperImplKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */