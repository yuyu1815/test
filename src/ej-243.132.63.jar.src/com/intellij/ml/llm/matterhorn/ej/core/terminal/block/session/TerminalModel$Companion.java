/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session;
/*     */ 
/*     */ import com.jediterm.terminal.Terminal;
/*     */ import com.jediterm.terminal.model.TerminalTextBuffer;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.InlineMarker;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\b\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J/\020\007\032\002H\b\"\004\b\000\020\b*\0020\t2\022\020\n\032\016\022\004\022\0020\t\022\004\022\002H\b0\013H\bø\001\000¢\006\002\020\fJ\025\020\r\032\0020\0162\006\020\017\032\0020\020H\000¢\006\002\b\021R\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\005XT¢\006\002\n\000\002\007\n\005\b20\001¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel$Companion;", "", "<init>", "()V", "MIN_WIDTH", "", "MIN_HEIGHT", "withLock", "T", "Lcom/jediterm/terminal/model/TerminalTextBuffer;", "callable", "Lkotlin/Function1;", "(Lcom/jediterm/terminal/model/TerminalTextBuffer;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "clearAllAndMoveCursorToTopLeftCorner", "", "terminal", "Lcom/jediterm/terminal/Terminal;", "clearAllAndMoveCursorToTopLeftCorner$ej_core", "ej-core"})
/*     */ public final class Companion
/*     */ {
/*     */   private Companion() {}
/*     */   
/*     */   public final <T> T withLock(@NotNull TerminalTextBuffer $this$withLock, @NotNull Function1 callable) {
/*     */     Object object;
/* 231 */     Intrinsics.checkNotNullParameter($this$withLock, "<this>"); Intrinsics.checkNotNullParameter(callable, "callable"); int $i$f$withLock = 0; $this$withLock.lock();
/*     */     
/* 233 */     try { object = callable.invoke($this$withLock); }
/*     */     finally
/*     */     
/* 236 */     { InlineMarker.finallyStart(1); $this$withLock.unlock(); InlineMarker.finallyEnd(1); }  return (T)object;
/*     */   }
/*     */ 
/*     */   
/*     */   public final void clearAllAndMoveCursorToTopLeftCorner$ej_core(@NotNull Terminal terminal) {
/* 241 */     Intrinsics.checkNotNullParameter(terminal, "terminal"); terminal.eraseInDisplay(3);
/* 242 */     terminal.cursorPosition(1, 1);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\session\TerminalModel$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */