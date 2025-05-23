/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.TerminalModel;
/*     */ import com.jediterm.terminal.model.TerminalLine;
/*     */ import com.jediterm.terminal.model.TerminalTextBuffer;
/*     */ import com.jediterm.terminal.model.TextBufferChangesListener;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000%\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\b\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\026\020\006\032\0020\0032\f\020\007\032\b\022\004\022\0020\t0\bH\026J\b\020\n\032\0020\003H\026¨\006\013"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputChangesTracker$listener$1", "Lcom/jediterm/terminal/model/TextBufferChangesListener;", "linesChanged", "", "fromIndex", "", "linesDiscardedFromHistory", "lines", "", "Lcom/jediterm/terminal/model/TerminalLine;", "widthResized", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nTerminalOutputChangesTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalOutputChangesTracker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputChangesTracker$listener$1\n+ 2 TerminalModel.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel$Companion\n*L\n1#1,194:1\n231#2,7:195\n231#2,7:202\n231#2,7:209\n*S KotlinDebug\n*F\n+ 1 TerminalOutputChangesTracker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputChangesTracker$listener$1\n*L\n68#1:195,7\n80#1:202,7\n96#1:209,7\n*E\n"})
/*     */ public final class TerminalOutputChangesTracker$listener$1
/*     */   implements TextBufferChangesListener
/*     */ {
/*     */   TerminalOutputChangesTracker$listener$1(Function0<Unit> $onUpdateStart) {}
/*     */   
/*     */   public void linesChanged(int fromIndex) {
/*  68 */     TerminalModel.Companion companion = TerminalModel.Companion; TerminalTextBuffer terminalTextBuffer = TerminalOutputChangesTracker.access$getTextBuffer$p(TerminalOutputChangesTracker.this); Function0<Unit> function0 = this.$onUpdateStart; TerminalOutputChangesTracker terminalOutputChangesTracker = TerminalOutputChangesTracker.this; int $i$f$withLock = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 195 */     terminalTextBuffer.lock();
/*     */     
/* 197 */     try { TerminalTextBuffer it = terminalTextBuffer; int $i$a$-withLock-TerminalOutputChangesTracker$listener$1$linesChanged$1 = 0; function0.invoke(); int line = TerminalOutputChangesTracker.access$getTextBuffer$p(terminalOutputChangesTracker).getHistoryLinesCount() + fromIndex; TerminalOutputChangesTracker.access$setLastChangedVisualLine$p(terminalOutputChangesTracker, Math.min(TerminalOutputChangesTracker.access$getLastChangedVisualLine$p(terminalOutputChangesTracker), line)); TerminalOutputChangesTracker.access$setAnyLineChanged$p(terminalOutputChangesTracker, true); for (Function0 listener : TerminalOutputChangesTracker.access$getChangeListeners$p(terminalOutputChangesTracker)) listener.invoke();  Unit unit = Unit.INSTANCE;
/*     */ 
/*     */       
/* 200 */       terminalTextBuffer.unlock(); } finally { terminalTextBuffer.unlock(); }
/*     */      } public void linesDiscardedFromHistory(List lines) { Intrinsics.checkNotNullParameter(lines, "lines"); TerminalModel.Companion companion = TerminalModel.Companion; TerminalTextBuffer terminalTextBuffer = TerminalOutputChangesTracker.access$getTextBuffer$p(TerminalOutputChangesTracker.this); TerminalOutputChangesTracker terminalOutputChangesTracker = TerminalOutputChangesTracker.this; int $i$f$withLock = 0;
/* 202 */     terminalTextBuffer.lock();
/*     */     
/* 204 */     try { TerminalTextBuffer it = terminalTextBuffer; int $i$a$-withLock-TerminalOutputChangesTracker$listener$1$linesDiscardedFromHistory$1 = 0; if (TerminalOutputChangesTracker.access$getLastChangedVisualLine$p(terminalOutputChangesTracker) >= lines.size()) { TerminalOutputChangesTracker.access$setLastChangedVisualLine$p(terminalOutputChangesTracker, TerminalOutputChangesTracker.access$getLastChangedVisualLine$p(terminalOutputChangesTracker) - lines.size()); } else { TerminalOutputChangesTracker.access$setLastChangedVisualLine$p(terminalOutputChangesTracker, 0); TerminalOutputChangesTracker.access$setChangesDiscarded$p(terminalOutputChangesTracker, true); }  for (TerminalLine line : lines) { if (!line.isWrapped()) { int i = TerminalOutputChangesTracker.access$getDiscardedLogicalLinesCount$p(terminalOutputChangesTracker); TerminalOutputChangesTracker.access$setDiscardedLogicalLinesCount$p(terminalOutputChangesTracker, i + 1); }  }  Unit unit = Unit.INSTANCE;
/*     */ 
/*     */       
/* 207 */       terminalTextBuffer.unlock(); } finally { terminalTextBuffer.unlock(); }
/*     */      } public void widthResized() { TerminalModel.Companion companion = TerminalModel.Companion; TerminalTextBuffer terminalTextBuffer = TerminalOutputChangesTracker.access$getTextBuffer$p(TerminalOutputChangesTracker.this); TerminalOutputChangesTracker terminalOutputChangesTracker = TerminalOutputChangesTracker.this; int $i$f$withLock = 0;
/* 209 */     terminalTextBuffer.lock();
/*     */     
/* 211 */     try { TerminalTextBuffer it = terminalTextBuffer; int $i$a$-withLock-TerminalOutputChangesTracker$listener$1$widthResized$1 = 0; TerminalOutputChangesTracker.access$setLastChangedVisualLine$p(terminalOutputChangesTracker, 0); TerminalOutputChangesTracker.access$setAnyLineChanged$p(terminalOutputChangesTracker, true); TerminalOutputChangesTracker.access$setChangesDiscarded$p(terminalOutputChangesTracker, true); Unit unit = Unit.INSTANCE;
/*     */ 
/*     */       
/* 214 */       terminalTextBuffer.unlock(); } finally { terminalTextBuffer.unlock(); }
/*     */      }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalOutputChangesTracker$listener$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */