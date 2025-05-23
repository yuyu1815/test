/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session;
/*     */ import com.intellij.openapi.Disposable;
/*     */ import com.jediterm.terminal.CursorShape;
/*     */ import com.jediterm.terminal.emulator.mouse.MouseFormat;
/*     */ import com.jediterm.terminal.emulator.mouse.MouseMode;
/*     */ import com.jediterm.terminal.model.TerminalTextBuffer;
/*     */ import java.util.Iterator;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\001\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\005\n\002\020\b\n\002\b\t\n\002\020\013\n\002\b\004\n\002\030\002\n\002\b\t\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\005\n\002\020\016\n\002\b\r\n\002\020\002\n\002\b\003\n\002\020\f\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\016\n\002\030\002\n\002\b\002\n\002\020!\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\007\b\000\030\000 j2\0020\001:\004ghijB\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\026\020;\032\0020<2\006\020=\032\0020\t2\006\020>\032\0020\tJ\026\020?\032\0020@2\006\020=\032\0020\t2\006\020>\032\0020\tJ\016\020A\032\0020B2\006\020C\032\0020\tJ\036\020D\032\0020<2\006\020E\032\0020\t2\006\020F\032\0020\t2\006\020G\032\0020HJ\036\020I\032\0020<2\006\020J\032\0020\t2\006\020K\032\0020\t2\006\020G\032\0020HJ\032\020L\032\0020.2\b\b\002\020M\032\0020\t2\b\b\002\020N\032\0020\tJ(\020O\032\0020.2\006\020P\032\0020\t2\006\020Q\032\0020\t2\006\020M\032\0020\t2\006\020N\032\0020\tH\002J\006\020R\032\0020<J\006\020S\032\0020<J%\020T\032\002HU\"\004\b\000\020U2\f\020V\032\b\022\004\022\002HU0WH\bø\001\000¢\006\002\020XJ\032\020`\032\0020<2\006\020a\032\0020b2\n\b\002\020c\032\004\030\0010dJ\032\020e\032\0020<2\006\020a\032\0020[2\n\b\002\020c\032\004\030\0010dJ\032\020f\032\0020<2\006\020a\032\0020_2\n\b\002\020c\032\004\030\0010dR\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\006\020\007R\021\020\b\032\0020\t8F¢\006\006\032\004\b\n\020\013R\021\020\f\032\0020\t8F¢\006\006\032\004\b\r\020\013R\036\020\017\032\0020\t2\006\020\016\032\0020\t@BX\016¢\006\b\n\000\032\004\b\020\020\013R\036\020\021\032\0020\t2\006\020\016\032\0020\t@BX\016¢\006\b\n\000\032\004\b\022\020\013R$\020\024\032\0020\0232\006\020\016\032\0020\023@FX\016¢\006\016\n\000\032\004\b\024\020\025\"\004\b\026\020\027R(\020\031\032\004\030\0010\0302\b\020\016\032\004\030\0010\030@FX\016¢\006\016\n\000\032\004\b\032\020\033\"\004\b\034\020\035R$\020\036\032\0020\0232\006\020\016\032\0020\023@FX\016¢\006\016\n\000\032\004\b\036\020\025\"\004\b\037\020\027R$\020 \032\0020\0232\006\020\016\032\0020\023@FX\016¢\006\016\n\000\032\004\b \020\025\"\004\b!\020\027R$\020#\032\0020\"2\006\020\016\032\0020\"@FX\016¢\006\016\n\000\032\004\b$\020%\"\004\b&\020'R$\020)\032\0020(2\006\020\016\032\0020(@FX\016¢\006\016\n\000\032\004\b*\020+\"\004\b,\020-R$\020/\032\0020.2\006\020\016\032\0020.@FX\016¢\006\016\n\000\032\004\b0\0201\"\004\b2\0203R$\0204\032\0020\0232\006\020\016\032\0020\023@FX\016¢\006\016\n\000\032\004\b5\020\025\"\004\b6\020\027R\021\0207\032\0020\t8F¢\006\006\032\004\b8\020\013R\021\0209\032\0020\t8F¢\006\006\032\004\b:\020\013R\032\020Y\032\b\022\004\022\0020[0ZX\004¢\006\b\n\000\032\004\b\\\020]R\024\020^\032\b\022\004\022\0020_0ZX\004¢\006\002\n\000\002\007\n\005\b20\001¨\006k"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel;", "", "textBuffer", "Lcom/jediterm/terminal/model/TerminalTextBuffer;", "<init>", "(Lcom/jediterm/terminal/model/TerminalTextBuffer;)V", "getTextBuffer$ej_core", "()Lcom/jediterm/terminal/model/TerminalTextBuffer;", "width", "", "getWidth", "()I", "height", "getHeight", "value", "cursorX", "getCursorX", "cursorY", "getCursorY", "", "isCommandRunning", "()Z", "setCommandRunning", "(Z)V", "Lcom/jediterm/terminal/CursorShape;", "cursorShape", "getCursorShape", "()Lcom/jediterm/terminal/CursorShape;", "setCursorShape", "(Lcom/jediterm/terminal/CursorShape;)V", "isCursorVisible", "setCursorVisible", "isBracketedPasteMode", "setBracketedPasteMode", "Lcom/jediterm/terminal/emulator/mouse/MouseMode;", "mouseMode", "getMouseMode", "()Lcom/jediterm/terminal/emulator/mouse/MouseMode;", "setMouseMode", "(Lcom/jediterm/terminal/emulator/mouse/MouseMode;)V", "Lcom/jediterm/terminal/emulator/mouse/MouseFormat;", "mouseFormat", "getMouseFormat", "()Lcom/jediterm/terminal/emulator/mouse/MouseFormat;", "setMouseFormat", "(Lcom/jediterm/terminal/emulator/mouse/MouseFormat;)V", "", "windowTitle", "getWindowTitle", "()Ljava/lang/String;", "setWindowTitle", "(Ljava/lang/String;)V", "useAlternateBuffer", "getUseAlternateBuffer", "setUseAlternateBuffer", "historyLinesCount", "getHistoryLinesCount", "screenLinesCount", "getScreenLinesCount", "setCursor", "", "x", "y", "charAt", "", "getLine", "Lcom/jediterm/terminal/model/TerminalLine;", "index", "processHistoryAndScreenLines", "scrollOrigin", "maxLinesToProcess", "consumer", "Lcom/jediterm/terminal/StyledTextConsumer;", "processScreenLines", "yStart", "count", "getAllText", "updatedCursorX", "updatedCursorY", "getLinesText", "fromLine", "toLine", "lockContent", "unlockContent", "withContentLock", "T", "callable", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "terminalListeners", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel$TerminalListener;", "getTerminalListeners$ej_core", "()Ljava/util/List;", "cursorListeners", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel$CursorListener;", "addContentListener", "listener", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel$ContentListener;", "parentDisposable", "Lcom/intellij/openapi/Disposable;", "addTerminalListener", "addCursorListener", "ContentListener", "TerminalListener", "CursorListener", "Companion", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nTerminalModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalModel.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,246:1\n1863#2,2:247\n1863#2,2:249\n1863#2,2:251\n1863#2,2:253\n1863#2,2:255\n1863#2,2:257\n1863#2,2:259\n1863#2,2:261\n1863#2,2:263\n*S KotlinDebug\n*F\n+ 1 TerminalModel.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel\n*L\n39#1:247,2\n48#1:249,2\n56#1:251,2\n64#1:253,2\n72#1:255,2\n80#1:257,2\n88#1:259,2\n96#1:261,2\n110#1:263,2\n*E\n"})
/*     */ public final class TerminalModel {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final TerminalTextBuffer textBuffer;
/*     */   
/*     */   public TerminalModel(@NotNull TerminalTextBuffer textBuffer) {
/*  22 */     this.textBuffer = textBuffer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  52 */     this.isCursorVisible = true;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  68 */     this.mouseMode = MouseMode.MOUSE_REPORTING_NONE;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  76 */     this.mouseFormat = MouseFormat.MOUSE_FORMAT_XTERM;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  84 */     this.windowTitle = "Terminal";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  92 */     this.useAlternateBuffer = this.textBuffer.isUsingAlternateBuffer();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 167 */     this.terminalListeners = new CopyOnWriteArrayList<>();
/* 168 */     this.cursorListeners = new CopyOnWriteArrayList<>();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private volatile int cursorX;
/*     */ 
/*     */   
/*     */   private volatile int cursorY;
/*     */ 
/*     */   
/*     */   private boolean isCommandRunning;
/*     */   
/*     */   @Nullable
/*     */   private volatile CursorShape cursorShape;
/*     */   
/*     */   private boolean isCursorVisible;
/*     */   
/*     */   private boolean isBracketedPasteMode;
/*     */   
/*     */   @NotNull
/*     */   private MouseMode mouseMode;
/*     */   
/*     */   @NotNull
/*     */   private MouseFormat mouseFormat;
/*     */   
/*     */   @NotNull
/*     */   private String windowTitle;
/*     */   
/*     */   private boolean useAlternateBuffer;
/*     */   
/*     */   @NotNull
/*     */   private final List<TerminalListener> terminalListeners;
/*     */   
/*     */   @NotNull
/*     */   private final List<CursorListener> cursorListeners;
/*     */   
/*     */   public static final int MIN_WIDTH = 5;
/*     */   
/*     */   public static final int MIN_HEIGHT = 2;
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final TerminalTextBuffer getTextBuffer$ej_core() {
/*     */     return this.textBuffer;
/*     */   }
/*     */ 
/*     */   
/*     */   public final int getWidth() {
/*     */     return this.textBuffer.getWidth();
/*     */   }
/*     */ 
/*     */   
/*     */   public final int getHeight() {
/*     */     return this.textBuffer.getHeight();
/*     */   }
/*     */ 
/*     */   
/*     */   public final int getCursorX() {
/*     */     return this.cursorX;
/*     */   }
/*     */ 
/*     */   
/*     */   public final int getCursorY() {
/*     */     return this.cursorY;
/*     */   }
/*     */ 
/*     */   
/*     */   public final boolean isCommandRunning() {
/*     */     return this.isCommandRunning;
/*     */   }
/*     */ 
/*     */   
/*     */   public final void setCommandRunning(boolean value) {
/*     */     Iterator<TerminalListener> iterator;
/*     */     if (value != this.isCommandRunning)
/*     */     { this.isCommandRunning = value;
/*     */       Iterable<TerminalListener> $this$forEach$iv = this.terminalListeners;
/*     */       int $i$f$forEach = 0;
/* 247 */       iterator = $this$forEach$iv.iterator(); } else { return; }  if (iterator.hasNext()) { Object element$iv = iterator.next(); TerminalListener it = (TerminalListener)element$iv; int $i$a$-forEach-TerminalModel$isCommandRunning$1 = 0; it.onCommandRunningChanged(value); }
/*     */   
/* 249 */   } @Nullable public final CursorShape getCursorShape() { return this.cursorShape; } public final void setCursorShape(@Nullable CursorShape value) { Iterator<CursorListener> iterator; if (value != this.cursorShape) { this.cursorShape = value; Iterable<CursorListener> $this$forEach$iv = this.cursorListeners; int $i$f$forEach = 0; iterator = $this$forEach$iv.iterator(); } else { return; }  if (iterator.hasNext()) { Object element$iv = iterator.next(); CursorListener it = (CursorListener)element$iv; int $i$a$-forEach-TerminalModel$cursorShape$1 = 0; it.onShapeChanged(value); }
/*     */      } public final boolean isCursorVisible() { return this.isCursorVisible; }
/* 251 */   public final void setCursorVisible(boolean value) { Iterator<CursorListener> iterator; if (value != this.isCursorVisible) { this.isCursorVisible = value; Iterable<CursorListener> $this$forEach$iv = this.cursorListeners; int $i$f$forEach = 0; iterator = $this$forEach$iv.iterator(); } else { return; }  if (iterator.hasNext()) { Object element$iv = iterator.next(); CursorListener it = (CursorListener)element$iv; int $i$a$-forEach-TerminalModel$isCursorVisible$1 = 0; it.onVisibilityChanged(value); }  }
/*     */   public final boolean isBracketedPasteMode() { return this.isBracketedPasteMode; }
/* 253 */   @NotNull public final MouseMode getMouseMode() { return this.mouseMode; } public final void setBracketedPasteMode(boolean value) { Iterator<TerminalListener> iterator; if (value != this.isBracketedPasteMode) { this.isBracketedPasteMode = value; Iterable<TerminalListener> $this$forEach$iv = this.terminalListeners; int $i$f$forEach = 0; iterator = $this$forEach$iv.iterator(); } else { return; }  if (iterator.hasNext()) { Object element$iv = iterator.next(); TerminalListener it = (TerminalListener)element$iv; int $i$a$-forEach-TerminalModel$isBracketedPasteMode$1 = 0; it.onBracketedPasteModeChanged(value); }
/*     */      } public final void setMouseMode(@NotNull MouseMode value) { Iterator<CursorListener> iterator; Intrinsics.checkNotNullParameter(value, "value"); if (value != this.mouseMode)
/* 255 */     { this.mouseMode = value; Iterable<CursorListener> $this$forEach$iv = this.cursorListeners; int $i$f$forEach = 0; iterator = $this$forEach$iv.iterator(); } else { return; }  if (iterator.hasNext()) { Object element$iv = iterator.next(); CursorListener it = (CursorListener)element$iv; int $i$a$-forEach-TerminalModel$mouseMode$1 = 0; it.onMouseModeChanged(value); }
/*     */      } @NotNull public final MouseFormat getMouseFormat() { return this.mouseFormat; }
/* 257 */   public final void setMouseFormat(@NotNull MouseFormat value) { Iterator<CursorListener> iterator; Intrinsics.checkNotNullParameter(value, "value"); if (value != this.mouseFormat) { this.mouseFormat = value; Iterable<CursorListener> $this$forEach$iv = this.cursorListeners; int $i$f$forEach = 0; iterator = $this$forEach$iv.iterator(); } else { return; }  if (iterator.hasNext()) { Object element$iv = iterator.next(); CursorListener it = (CursorListener)element$iv; int $i$a$-forEach-TerminalModel$mouseFormat$1 = 0; it.onMouseFormatChanged(value); }
/*     */      } @NotNull public final String getWindowTitle() { return this.windowTitle; }
/* 259 */   public final void setWindowTitle(@NotNull String value) { Iterator<TerminalListener> iterator; Intrinsics.checkNotNullParameter(value, "value"); if (!Intrinsics.areEqual(value, this.windowTitle)) { this.windowTitle = value; Iterable<TerminalListener> $this$forEach$iv = this.terminalListeners; int $i$f$forEach = 0; iterator = $this$forEach$iv.iterator(); } else { return; }  if (iterator.hasNext()) { Object element$iv = iterator.next(); TerminalListener it = (TerminalListener)element$iv; int $i$a$-forEach-TerminalModel$windowTitle$1 = 0; it.onWindowTitleChanged(value); }
/*     */      } public final boolean getUseAlternateBuffer() { return this.useAlternateBuffer; }
/* 261 */   public final void setUseAlternateBuffer(boolean value) { Iterator<TerminalListener> iterator; if (this.useAlternateBuffer != value) { this.useAlternateBuffer = value; Iterable<TerminalListener> $this$forEach$iv = this.terminalListeners; int $i$f$forEach = 0; iterator = $this$forEach$iv.iterator(); } else { return; }  if (iterator.hasNext()) { Object element$iv = iterator.next(); TerminalListener it = (TerminalListener)element$iv; int $i$a$-forEach-TerminalModel$useAlternateBuffer$1 = 0; it.onAlternateBufferChanged(value); }
/*     */      } public final int getHistoryLinesCount() { return this.textBuffer.getHistoryLinesCount(); }
/* 263 */   public final void setCursor(int x, int y) { Iterator<CursorListener> iterator; if (x != this.cursorX || y != this.cursorY) { this.cursorX = x; this.cursorY = y; Iterable<CursorListener> $this$forEach$iv = this.cursorListeners; int $i$f$forEach = 0; iterator = $this$forEach$iv.iterator(); } else { return; }  if (iterator.hasNext()) { Object element$iv = iterator.next(); CursorListener it = (CursorListener)element$iv; int $i$a$-forEach-TerminalModel$setCursor$1 = 0;
/*     */       it.onPositionChanged(x, y); }
/*     */      }
/*     */ 
/*     */   
/*     */   public final int getScreenLinesCount() {
/*     */     return this.textBuffer.getScreenLinesCount();
/*     */   }
/*     */   
/*     */   public final char charAt(int x, int y) {
/*     */     return this.textBuffer.getCharAt(x, y);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final TerminalLine getLine(int index) {
/*     */     return this.textBuffer.getLine(index);
/*     */   }
/*     */   
/*     */   public final void processHistoryAndScreenLines(int scrollOrigin, int maxLinesToProcess, @NotNull StyledTextConsumer consumer) {
/*     */     Intrinsics.checkNotNullParameter(consumer, "consumer");
/*     */     this.textBuffer.processHistoryAndScreenLines(scrollOrigin, maxLinesToProcess, consumer);
/*     */   }
/*     */   
/*     */   public final void processScreenLines(int yStart, int count, @NotNull StyledTextConsumer consumer) {
/*     */     Intrinsics.checkNotNullParameter(consumer, "consumer");
/*     */     this.textBuffer.processScreenLines(yStart, count, consumer);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String getAllText(int updatedCursorX, int updatedCursorY) {
/*     */     return getLinesText(-getHistoryLinesCount(), getScreenLinesCount(), updatedCursorX, updatedCursorY);
/*     */   }
/*     */   
/*     */   private final String getLinesText(int fromLine, int toLine, int updatedCursorX, int updatedCursorY) {
/*     */     StringBuilder builder = new StringBuilder();
/*     */     for (int ind = fromLine; ind < toLine; ind++) {
/*     */       Intrinsics.checkNotNullExpressionValue(getLine(ind).getText(), "getText(...)");
/*     */       String text = getLine(ind).getText();
/*     */       if (ind == updatedCursorY - 1) {
/*     */         Intrinsics.checkNotNullExpressionValue(text.substring(0, Math.min(updatedCursorX, text.length())), "substring(...)");
/*     */         text = text.substring(0, Math.min(updatedCursorX, text.length()));
/*     */       } 
/*     */       builder.append(text);
/*     */       if ((text.length() > 0))
/*     */         builder.append('\n'); 
/*     */     } 
/*     */     Intrinsics.checkNotNullExpressionValue(builder.toString(), "toString(...)");
/*     */     return ((builder.length() > 0)) ? StringsKt.dropLast(builder, 1).toString() : builder.toString();
/*     */   }
/*     */   
/*     */   public final void lockContent() {
/*     */     this.textBuffer.lock();
/*     */   }
/*     */   
/*     */   public final void unlockContent() {
/*     */     this.textBuffer.unlock();
/*     */   }
/*     */   
/*     */   public final <T> T withContentLock(@NotNull Function0 callable) {
/*     */     Object object;
/*     */     Intrinsics.checkNotNullParameter(callable, "callable");
/*     */     int $i$f$withContentLock = 0;
/*     */     lockContent();
/*     */     try {
/*     */       object = callable.invoke();
/*     */     } finally {
/*     */       InlineMarker.finallyStart(1);
/*     */       unlockContent();
/*     */       InlineMarker.finallyEnd(1);
/*     */     } 
/*     */     return (T)object;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<TerminalListener> getTerminalListeners$ej_core() {
/*     */     return this.terminalListeners;
/*     */   }
/*     */   
/*     */   public final void addContentListener(@NotNull ContentListener listener, @Nullable Disposable parentDisposable) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc_w 'listener'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_1
/*     */     //   8: <illegal opcode> modelChanged : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel$ContentListener;)Lcom/jediterm/terminal/model/TerminalModelListener;
/*     */     //   13: astore_3
/*     */     //   14: aload_0
/*     */     //   15: getfield textBuffer : Lcom/jediterm/terminal/model/TerminalTextBuffer;
/*     */     //   18: aload_3
/*     */     //   19: invokevirtual addModelListener : (Lcom/jediterm/terminal/model/TerminalModelListener;)V
/*     */     //   22: aload_2
/*     */     //   23: ifnull -> 37
/*     */     //   26: aload_2
/*     */     //   27: aload_0
/*     */     //   28: aload_3
/*     */     //   29: <illegal opcode> dispose : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel;Lcom/jediterm/terminal/model/TerminalModelListener;)Lcom/intellij/openapi/Disposable;
/*     */     //   34: invokestatic register : (Lcom/intellij/openapi/Disposable;Lcom/intellij/openapi/Disposable;)V
/*     */     //   37: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #171	-> 7
/*     */     //   #172	-> 14
/*     */     //   #173	-> 22
/*     */     //   #174	-> 26
/*     */     //   #178	-> 37
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   14	24	3	terminalListener	Lcom/jediterm/terminal/model/TerminalModelListener;
/*     */     //   0	38	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel;
/*     */     //   0	38	1	listener	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel$ContentListener;
/*     */     //   0	38	2	parentDisposable	Lcom/intellij/openapi/Disposable;
/*     */   }
/*     */   
/*     */   private static final void addContentListener$lambda$9(ContentListener $listener) {
/*     */     $listener.onContentChanged();
/*     */   }
/*     */   
/*     */   private static final void addContentListener$lambda$10(TerminalModel this$0, TerminalModelListener $terminalListener) {
/*     */     this$0.textBuffer.removeModelListener($terminalListener);
/*     */   }
/*     */   
/*     */   public final void addTerminalListener(@NotNull TerminalListener listener, @Nullable Disposable parentDisposable) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc_w 'listener'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_0
/*     */     //   8: getfield terminalListeners : Ljava/util/List;
/*     */     //   11: aload_1
/*     */     //   12: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   17: pop
/*     */     //   18: aload_2
/*     */     //   19: ifnull -> 33
/*     */     //   22: aload_2
/*     */     //   23: aload_0
/*     */     //   24: aload_1
/*     */     //   25: <illegal opcode> dispose : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel$TerminalListener;)Lcom/intellij/openapi/Disposable;
/*     */     //   30: invokestatic register : (Lcom/intellij/openapi/Disposable;Lcom/intellij/openapi/Disposable;)V
/*     */     //   33: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #181	-> 7
/*     */     //   #182	-> 18
/*     */     //   #183	-> 22
/*     */     //   #187	-> 33
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	34	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel;
/*     */     //   0	34	1	listener	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel$TerminalListener;
/*     */     //   0	34	2	parentDisposable	Lcom/intellij/openapi/Disposable;
/*     */   }
/*     */   
/*     */   private static final void addTerminalListener$lambda$11(TerminalModel this$0, TerminalListener $listener) {
/*     */     this$0.terminalListeners.remove($listener);
/*     */   }
/*     */   
/*     */   public final void addCursorListener(@NotNull CursorListener listener, @Nullable Disposable parentDisposable) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc_w 'listener'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_0
/*     */     //   8: getfield cursorListeners : Ljava/util/List;
/*     */     //   11: aload_1
/*     */     //   12: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   17: pop
/*     */     //   18: aload_2
/*     */     //   19: ifnull -> 33
/*     */     //   22: aload_2
/*     */     //   23: aload_0
/*     */     //   24: aload_1
/*     */     //   25: <illegal opcode> dispose : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel$CursorListener;)Lcom/intellij/openapi/Disposable;
/*     */     //   30: invokestatic register : (Lcom/intellij/openapi/Disposable;Lcom/intellij/openapi/Disposable;)V
/*     */     //   33: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #190	-> 7
/*     */     //   #191	-> 18
/*     */     //   #192	-> 22
/*     */     //   #196	-> 33
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	34	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel;
/*     */     //   0	34	1	listener	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel$CursorListener;
/*     */     //   0	34	2	parentDisposable	Lcom/intellij/openapi/Disposable;
/*     */   }
/*     */   
/*     */   private static final void addCursorListener$lambda$12(TerminalModel this$0, CursorListener $listener) {
/*     */     this$0.cursorListeners.remove($listener);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\bf\030\0002\0020\001J\b\020\002\032\0020\003H\026¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel$ContentListener;", "", "onContentChanged", "", "ej-core"})
/*     */   public static interface ContentListener {
/*     */     void onContentChanged();
/*     */     
/*     */     @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */     public static final class DefaultImpls {
/*     */       public static void onContentChanged(@NotNull TerminalModel.ContentListener $this) {}
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\020\b\n\002\b\003\n\002\020\016\n\002\b\002\n\002\020\013\n\002\b\005\bf\030\0002\0020\001J\030\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\005H\026J\020\020\007\032\0020\0032\006\020\b\032\0020\tH\026J\020\020\n\032\0020\0032\006\020\013\032\0020\fH\026J\020\020\r\032\0020\0032\006\020\016\032\0020\fH\026J\020\020\017\032\0020\0032\006\020\020\032\0020\fH\026¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel$TerminalListener;", "", "onSizeChanged", "", "width", "", "height", "onWindowTitleChanged", "title", "", "onCommandRunningChanged", "isRunning", "", "onAlternateBufferChanged", "enabled", "onBracketedPasteModeChanged", "bracketed", "ej-core"})
/*     */   public static interface TerminalListener {
/*     */     void onSizeChanged(int param1Int1, int param1Int2);
/*     */     
/*     */     void onWindowTitleChanged(@NotNull String param1String);
/*     */     
/*     */     void onCommandRunningChanged(boolean param1Boolean);
/*     */     
/*     */     void onAlternateBufferChanged(boolean param1Boolean);
/*     */     
/*     */     void onBracketedPasteModeChanged(boolean param1Boolean);
/*     */     
/*     */     @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */     public static final class DefaultImpls {
/*     */       public static void onSizeChanged(@NotNull TerminalModel.TerminalListener $this, int width, int height) {}
/*     */       
/*     */       public static void onWindowTitleChanged(@NotNull TerminalModel.TerminalListener $this, @NotNull String title) {
/*     */         Intrinsics.checkNotNullParameter(title, "title");
/*     */       }
/*     */       
/*     */       public static void onCommandRunningChanged(@NotNull TerminalModel.TerminalListener $this, boolean isRunning) {}
/*     */       
/*     */       public static void onAlternateBufferChanged(@NotNull TerminalModel.TerminalListener $this, boolean enabled) {}
/*     */       
/*     */       public static void onBracketedPasteModeChanged(@NotNull TerminalModel.TerminalListener $this, boolean bracketed) {}
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\bf\030\0002\0020\001J\030\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\005H\026J\022\020\007\032\0020\0032\b\020\b\032\004\030\0010\tH\026J\020\020\n\032\0020\0032\006\020\013\032\0020\fH\026J\020\020\r\032\0020\0032\006\020\016\032\0020\017H\026J\020\020\020\032\0020\0032\006\020\021\032\0020\022H\026¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel$CursorListener;", "", "onPositionChanged", "", "cursorX", "", "cursorY", "onShapeChanged", "shape", "Lcom/jediterm/terminal/CursorShape;", "onVisibilityChanged", "visible", "", "onMouseModeChanged", "mode", "Lcom/jediterm/terminal/emulator/mouse/MouseMode;", "onMouseFormatChanged", "format", "Lcom/jediterm/terminal/emulator/mouse/MouseFormat;", "ej-core"})
/*     */   public static interface CursorListener {
/*     */     void onPositionChanged(int param1Int1, int param1Int2);
/*     */     
/*     */     void onShapeChanged(@Nullable CursorShape param1CursorShape);
/*     */     
/*     */     void onVisibilityChanged(boolean param1Boolean);
/*     */     
/*     */     void onMouseModeChanged(@NotNull MouseMode param1MouseMode);
/*     */     
/*     */     void onMouseFormatChanged(@NotNull MouseFormat param1MouseFormat);
/*     */     
/*     */     @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */     public static final class DefaultImpls {
/*     */       public static void onPositionChanged(@NotNull TerminalModel.CursorListener $this, int cursorX, int cursorY) {}
/*     */       
/*     */       public static void onShapeChanged(@NotNull TerminalModel.CursorListener $this, @Nullable CursorShape shape) {}
/*     */       
/*     */       public static void onVisibilityChanged(@NotNull TerminalModel.CursorListener $this, boolean visible) {}
/*     */       
/*     */       public static void onMouseModeChanged(@NotNull TerminalModel.CursorListener $this, @NotNull MouseMode mode) {
/*     */         Intrinsics.checkNotNullParameter(mode, "mode");
/*     */       }
/*     */       
/*     */       public static void onMouseFormatChanged(@NotNull TerminalModel.CursorListener $this, @NotNull MouseFormat format) {
/*     */         Intrinsics.checkNotNullParameter(format, "format");
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\b\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J/\020\007\032\002H\b\"\004\b\000\020\b*\0020\t2\022\020\n\032\016\022\004\022\0020\t\022\004\022\002H\b0\013H\bø\001\000¢\006\002\020\fJ\025\020\r\032\0020\0162\006\020\017\032\0020\020H\000¢\006\002\b\021R\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\005XT¢\006\002\n\000\002\007\n\005\b20\001¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel$Companion;", "", "<init>", "()V", "MIN_WIDTH", "", "MIN_HEIGHT", "withLock", "T", "Lcom/jediterm/terminal/model/TerminalTextBuffer;", "callable", "Lkotlin/Function1;", "(Lcom/jediterm/terminal/model/TerminalTextBuffer;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "clearAllAndMoveCursorToTopLeftCorner", "", "terminal", "Lcom/jediterm/terminal/Terminal;", "clearAllAndMoveCursorToTopLeftCorner$ej_core", "ej-core"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     public final <T> T withLock(@NotNull TerminalTextBuffer $this$withLock, @NotNull Function1 callable) {
/*     */       Object object;
/*     */       Intrinsics.checkNotNullParameter($this$withLock, "<this>");
/*     */       Intrinsics.checkNotNullParameter(callable, "callable");
/*     */       int $i$f$withLock = 0;
/*     */       $this$withLock.lock();
/*     */       try {
/*     */         object = callable.invoke($this$withLock);
/*     */       } finally {
/*     */         InlineMarker.finallyStart(1);
/*     */         $this$withLock.unlock();
/*     */         InlineMarker.finallyEnd(1);
/*     */       } 
/*     */       return (T)object;
/*     */     }
/*     */     
/*     */     public final void clearAllAndMoveCursorToTopLeftCorner$ej_core(@NotNull Terminal terminal) {
/*     */       Intrinsics.checkNotNullParameter(terminal, "terminal");
/*     */       terminal.eraseInDisplay(3);
/*     */       terminal.cursorPosition(1, 1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\session\TerminalModel.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */