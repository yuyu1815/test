/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.ShellCommandOutputScraperImpl;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.StyledCommandOutput;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.TerminalModel;
/*     */ import com.intellij.openapi.Disposable;
/*     */ import com.jediterm.terminal.model.TerminalLine;
/*     */ import com.jediterm.terminal.model.TerminalTextBuffer;
/*     */ import com.jediterm.terminal.model.TextBufferChangesListener;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.CompletableDeferred;
/*     */ import kotlinx.coroutines.CompletableDeferredKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.plugins.terminal.util.ShellIntegration;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\002\n\002\b\003\n\002\020\b\n\002\b\002\n\002\020\013\n\002\b\002\n\002\020!\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\b\000\030\0002\0020\001B-\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\f\020\b\032\b\022\004\022\0020\n0\t¢\006\004\b\013\020\fJ\016\020\025\032\0020\026H@¢\006\002\020\027J\b\020\030\032\004\030\0010\026J\016\020\031\032\b\022\004\022\0020\0260\032H\002J\b\020\033\032\0020\026H\002J\020\020\034\032\0020\0162\006\020\035\032\0020\016H\002R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\r\032\0020\016X\016¢\006\002\n\000R\016\020\017\032\0020\016X\016¢\006\002\n\000R\016\020\020\032\0020\021X\016¢\006\002\n\000R\016\020\022\032\0020\021X\016¢\006\002\n\000R\032\020\023\032\016\022\n\022\b\022\004\022\0020\n0\t0\024X\004¢\006\002\n\000¨\006\036"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputChangesTracker;", "", "textBuffer", "Lcom/jediterm/terminal/model/TerminalTextBuffer;", "shellIntegration", "Lorg/jetbrains/plugins/terminal/util/ShellIntegration;", "parentDisposable", "Lcom/intellij/openapi/Disposable;", "onUpdateStart", "Lkotlin/Function0;", "", "<init>", "(Lcom/jediterm/terminal/model/TerminalTextBuffer;Lorg/jetbrains/plugins/terminal/util/ShellIntegration;Lcom/intellij/openapi/Disposable;Lkotlin/jvm/functions/Function0;)V", "lastChangedVisualLine", "", "discardedLogicalLinesCount", "isAnyLineChanged", "", "isChangesDiscarded", "changeListeners", "", "collectChangedOutputOrWait", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/PartialCommandOutput;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectChangedOutputOrNull", "getChangedOutputDeferred", "Lkotlinx/coroutines/CompletableDeferred;", "collectOutput", "getLogicalLineIndex", "visualLine", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nTerminalOutputChangesTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalOutputChangesTracker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputChangesTracker\n+ 2 TerminalModel.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,194:1\n231#2,7:195\n231#2,7:202\n1#3:209\n*S KotlinDebug\n*F\n+ 1 TerminalOutputChangesTracker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputChangesTracker\n*L\n118#1:195,7\n132#1:202,7\n*E\n"})
/*     */ public final class TerminalOutputChangesTracker
/*     */ {
/*     */   @NotNull
/*     */   private final TerminalTextBuffer textBuffer;
/*     */   @NotNull
/*     */   private final ShellIntegration shellIntegration;
/*     */   private int lastChangedVisualLine;
/*     */   private int discardedLogicalLinesCount;
/*     */   private boolean isAnyLineChanged;
/*     */   private boolean isChangesDiscarded;
/*     */   @NotNull
/*     */   private final List<Function0<Unit>> changeListeners;
/*     */   
/*     */   public TerminalOutputChangesTracker(@NotNull TerminalTextBuffer textBuffer, @NotNull ShellIntegration shellIntegration, @NotNull Disposable parentDisposable, @NotNull Function0<Unit> onUpdateStart) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'textBuffer'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'shellIntegration'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_3
/*     */     //   13: ldc 'parentDisposable'
/*     */     //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   18: aload #4
/*     */     //   20: ldc 'onUpdateStart'
/*     */     //   22: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   25: aload_0
/*     */     //   26: invokespecial <init> : ()V
/*     */     //   29: aload_0
/*     */     //   30: aload_1
/*     */     //   31: putfield textBuffer : Lcom/jediterm/terminal/model/TerminalTextBuffer;
/*     */     //   34: aload_0
/*     */     //   35: aload_2
/*     */     //   36: putfield shellIntegration : Lorg/jetbrains/plugins/terminal/util/ShellIntegration;
/*     */     //   39: aload_0
/*     */     //   40: iconst_1
/*     */     //   41: putfield isAnyLineChanged : Z
/*     */     //   44: aload_0
/*     */     //   45: new java/util/concurrent/CopyOnWriteArrayList
/*     */     //   48: dup
/*     */     //   49: invokespecial <init> : ()V
/*     */     //   52: checkcast java/util/List
/*     */     //   55: putfield changeListeners : Ljava/util/List;
/*     */     //   58: nop
/*     */     //   59: new com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputChangesTracker$listener$1
/*     */     //   62: dup
/*     */     //   63: aload_0
/*     */     //   64: aload #4
/*     */     //   66: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputChangesTracker;Lkotlin/jvm/functions/Function0;)V
/*     */     //   69: astore #5
/*     */     //   71: aload_0
/*     */     //   72: getfield textBuffer : Lcom/jediterm/terminal/model/TerminalTextBuffer;
/*     */     //   75: aload #5
/*     */     //   77: checkcast com/jediterm/terminal/model/TextBufferChangesListener
/*     */     //   80: invokevirtual addChangesListener : (Lcom/jediterm/terminal/model/TextBufferChangesListener;)V
/*     */     //   83: aload_3
/*     */     //   84: aload_0
/*     */     //   85: aload #5
/*     */     //   87: <illegal opcode> dispose : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputChangesTracker;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputChangesTracker$listener$1;)Lcom/intellij/openapi/Disposable;
/*     */     //   92: invokestatic register : (Lcom/intellij/openapi/Disposable;Lcom/intellij/openapi/Disposable;)V
/*     */     //   95: nop
/*     */     //   96: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #24	-> 25
/*     */     //   #25	-> 29
/*     */     //   #26	-> 34
/*     */     //   #48	-> 39
/*     */     //   #64	-> 44
/*     */     //   #66	-> 58
/*     */     //   #67	-> 59
/*     */     //   #107	-> 71
/*     */     //   #108	-> 83
/*     */     //   #111	-> 95
/*     */     //   #24	-> 96
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   71	24	5	listener	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputChangesTracker$listener$1;
/*     */     //   0	97	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputChangesTracker;
/*     */     //   0	97	1	textBuffer	Lcom/jediterm/terminal/model/TerminalTextBuffer;
/*     */     //   0	97	2	shellIntegration	Lorg/jetbrains/plugins/terminal/util/ShellIntegration;
/*     */     //   0	97	3	parentDisposable	Lcom/intellij/openapi/Disposable;
/*     */     //   0	97	4	onUpdateStart	Lkotlin/jvm/functions/Function0;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000%\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\b\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\026\020\006\032\0020\0032\f\020\007\032\b\022\004\022\0020\t0\bH\026J\b\020\n\032\0020\003H\026¨\006\013"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputChangesTracker$listener$1", "Lcom/jediterm/terminal/model/TextBufferChangesListener;", "linesChanged", "", "fromIndex", "", "linesDiscardedFromHistory", "lines", "", "Lcom/jediterm/terminal/model/TerminalLine;", "widthResized", "ej-core"})
/*     */   @SourceDebugExtension({"SMAP\nTerminalOutputChangesTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalOutputChangesTracker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputChangesTracker$listener$1\n+ 2 TerminalModel.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel$Companion\n*L\n1#1,194:1\n231#2,7:195\n231#2,7:202\n231#2,7:209\n*S KotlinDebug\n*F\n+ 1 TerminalOutputChangesTracker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputChangesTracker$listener$1\n*L\n68#1:195,7\n80#1:202,7\n96#1:209,7\n*E\n"})
/*     */   public static final class TerminalOutputChangesTracker$listener$1
/*     */     implements TextBufferChangesListener
/*     */   {
/*     */     TerminalOutputChangesTracker$listener$1(Function0<Unit> $onUpdateStart) {}
/*     */     
/*     */     public void linesChanged(int fromIndex) {
/*  68 */       TerminalModel.Companion companion = TerminalModel.Companion; TerminalTextBuffer terminalTextBuffer = TerminalOutputChangesTracker.this.textBuffer; Function0<Unit> function0 = this.$onUpdateStart; TerminalOutputChangesTracker terminalOutputChangesTracker = TerminalOutputChangesTracker.this; int $i$f$withLock = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 195 */       terminalTextBuffer.lock();
/*     */       
/* 197 */       try { TerminalTextBuffer it = terminalTextBuffer; int $i$a$-withLock-TerminalOutputChangesTracker$listener$1$linesChanged$1 = 0; function0.invoke(); int line = terminalOutputChangesTracker.textBuffer.getHistoryLinesCount() + fromIndex; terminalOutputChangesTracker.lastChangedVisualLine = Math.min(terminalOutputChangesTracker.lastChangedVisualLine, line); terminalOutputChangesTracker.isAnyLineChanged = true; for (Function0 listener : terminalOutputChangesTracker.changeListeners) listener.invoke();  Unit unit = Unit.INSTANCE;
/*     */ 
/*     */         
/* 200 */         terminalTextBuffer.unlock(); } finally { terminalTextBuffer.unlock(); }
/*     */        } public void linesDiscardedFromHistory(List lines) { Intrinsics.checkNotNullParameter(lines, "lines"); TerminalModel.Companion companion = TerminalModel.Companion; TerminalTextBuffer terminalTextBuffer = TerminalOutputChangesTracker.this.textBuffer; TerminalOutputChangesTracker terminalOutputChangesTracker = TerminalOutputChangesTracker.this; int $i$f$withLock = 0;
/* 202 */       terminalTextBuffer.lock();
/*     */       
/* 204 */       try { TerminalTextBuffer it = terminalTextBuffer; int $i$a$-withLock-TerminalOutputChangesTracker$listener$1$linesDiscardedFromHistory$1 = 0; if (terminalOutputChangesTracker.lastChangedVisualLine >= lines.size()) { terminalOutputChangesTracker.lastChangedVisualLine = terminalOutputChangesTracker.lastChangedVisualLine - lines.size(); } else { terminalOutputChangesTracker.lastChangedVisualLine = 0; terminalOutputChangesTracker.isChangesDiscarded = true; }  for (TerminalLine line : lines) { if (!line.isWrapped()) { int i = terminalOutputChangesTracker.discardedLogicalLinesCount; terminalOutputChangesTracker.discardedLogicalLinesCount = i + 1; }  }  Unit unit = Unit.INSTANCE;
/*     */ 
/*     */         
/* 207 */         terminalTextBuffer.unlock(); } finally { terminalTextBuffer.unlock(); }
/*     */        } public void widthResized() { TerminalModel.Companion companion = TerminalModel.Companion; TerminalTextBuffer terminalTextBuffer = TerminalOutputChangesTracker.this.textBuffer; TerminalOutputChangesTracker terminalOutputChangesTracker = TerminalOutputChangesTracker.this; int $i$f$withLock = 0;
/* 209 */       terminalTextBuffer.lock();
/*     */       
/* 211 */       try { TerminalTextBuffer it = terminalTextBuffer; int $i$a$-withLock-TerminalOutputChangesTracker$listener$1$widthResized$1 = 0; terminalOutputChangesTracker.lastChangedVisualLine = 0; terminalOutputChangesTracker.isAnyLineChanged = true; terminalOutputChangesTracker.isChangesDiscarded = true; Unit unit = Unit.INSTANCE;
/*     */ 
/*     */         
/* 214 */         terminalTextBuffer.unlock(); } finally { terminalTextBuffer.unlock(); }
/*     */        }
/*     */   
/*     */   }
/*     */   
/*     */   private static final void _init_$lambda$0(TerminalOutputChangesTracker this$0, TerminalOutputChangesTracker$listener$1 $listener) {
/*     */     this$0.textBuffer.removeChangesListener($listener);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object collectChangedOutputOrWait(@NotNull Continuation $completion) {
/*     */     CompletableDeferred completableDeferred1;
/*     */     TerminalModel.Companion companion = TerminalModel.Companion;
/*     */     TerminalTextBuffer $this$withLock$iv = this.textBuffer;
/*     */     int $i$f$withLock = 0;
/*     */     $this$withLock$iv.lock();
/*     */     try {
/*     */       TerminalTextBuffer it = $this$withLock$iv;
/*     */       int $i$a$-withLock-TerminalOutputChangesTracker$collectChangedOutputOrWait$deferred$1 = 0;
/*     */       completableDeferred1 = this.isAnyLineChanged ? CompletableDeferredKt.CompletableDeferred(collectOutput()) : getChangedOutputDeferred();
/*     */     } finally {
/*     */       $this$withLock$iv.unlock();
/*     */     } 
/*     */     CompletableDeferred deferred = completableDeferred1;
/*     */     return deferred.await($completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final PartialCommandOutput collectChangedOutputOrNull() {
/*     */     PartialCommandOutput partialCommandOutput;
/*     */     TerminalModel.Companion companion = TerminalModel.Companion;
/*     */     TerminalTextBuffer $this$withLock$iv = this.textBuffer;
/*     */     int $i$f$withLock = 0;
/*     */     $this$withLock$iv.lock();
/*     */     try {
/*     */       TerminalTextBuffer it = $this$withLock$iv;
/*     */       int $i$a$-withLock-TerminalOutputChangesTracker$collectChangedOutputOrNull$1 = 0;
/*     */       partialCommandOutput = this.isAnyLineChanged ? collectOutput() : null;
/*     */     } finally {
/*     */       $this$withLock$iv.unlock();
/*     */     } 
/*     */     return partialCommandOutput;
/*     */   }
/*     */   
/*     */   private final CompletableDeferred<PartialCommandOutput> getChangedOutputDeferred() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield isAnyLineChanged : Z
/*     */     //   4: ifne -> 11
/*     */     //   7: iconst_1
/*     */     //   8: goto -> 12
/*     */     //   11: iconst_0
/*     */     //   12: ifne -> 32
/*     */     //   15: iconst_0
/*     */     //   16: istore_2
/*     */     //   17: ldc 'Something was changed already, no need to wait for next change'
/*     */     //   19: astore_2
/*     */     //   20: new java/lang/IllegalStateException
/*     */     //   23: dup
/*     */     //   24: aload_2
/*     */     //   25: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   28: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   31: athrow
/*     */     //   32: aconst_null
/*     */     //   33: iconst_1
/*     */     //   34: aconst_null
/*     */     //   35: invokestatic CompletableDeferred$default : (Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/CompletableDeferred;
/*     */     //   38: astore_1
/*     */     //   39: aload_0
/*     */     //   40: aload_1
/*     */     //   41: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputChangesTracker;Lkotlinx/coroutines/CompletableDeferred;)Lkotlin/jvm/functions/Function0;
/*     */     //   46: astore_2
/*     */     //   47: aload_1
/*     */     //   48: aload_0
/*     */     //   49: aload_2
/*     */     //   50: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputChangesTracker;Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function1;
/*     */     //   55: invokeinterface invokeOnCompletion : (Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;
/*     */     //   60: pop
/*     */     //   61: aload_0
/*     */     //   62: getfield changeListeners : Ljava/util/List;
/*     */     //   65: aload_2
/*     */     //   66: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   71: pop
/*     */     //   72: aload_1
/*     */     //   73: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #141	-> 0
/*     */     //   #209	-> 15
/*     */     //   #141	-> 17
/*     */     //   #141	-> 19
/*     */     //   #143	-> 32
/*     */     //   #144	-> 39
/*     */     //   #148	-> 47
/*     */     //   #151	-> 61
/*     */     //   #153	-> 72
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   17	2	2	$i$a$-check-TerminalOutputChangesTracker$getChangedOutputDeferred$1	I
/*     */     //   39	35	1	deferred	Lkotlinx/coroutines/CompletableDeferred;
/*     */     //   47	27	2	listener	Lkotlin/jvm/functions/Function0;
/*     */     //   0	74	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputChangesTracker;
/*     */   }
/*     */   
/*     */   private static final Unit getChangedOutputDeferred$lambda$5(TerminalOutputChangesTracker this$0, CompletableDeferred $deferred) {
/*     */     if (!this$0.isAnyLineChanged) {
/*     */       int $i$a$-check-TerminalOutputChangesTracker$getChangedOutputDeferred$listener$1$1 = 0;
/*     */       String str = "Nothing was changed, but change event fired";
/*     */       throw new IllegalStateException(str.toString());
/*     */     } 
/*     */     $deferred.complete(this$0.collectOutput());
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit getChangedOutputDeferred$lambda$6(TerminalOutputChangesTracker this$0, Function0 $listener, Throwable it) {
/*     */     this$0.changeListeners.remove($listener);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private final PartialCommandOutput collectOutput() {
/*     */     int startLine = this.lastChangedVisualLine - this.textBuffer.getHistoryLinesCount();
/*     */     while (startLine - 1 >= -this.textBuffer.getHistoryLinesCount() && this.textBuffer.getLine(startLine - 1).isWrapped())
/*     */       startLine--; 
/*     */     this.shellIntegration.getCommandBlockIntegration();
/*     */     StyledCommandOutput output = ShellCommandOutputScraperImpl.Companion.scrapeOutput(this.textBuffer, (this.shellIntegration.getCommandBlockIntegration() != null) ? this.shellIntegration.getCommandBlockIntegration().getCommandEndMarker() : null, startLine);
/*     */     int logicalLineIndex = getLogicalLineIndex(startLine) + this.discardedLogicalLinesCount;
/*     */     boolean anyDiscarded = this.isChangesDiscarded;
/*     */     this.lastChangedVisualLine = this.textBuffer.getHistoryLinesCount();
/*     */     this.isAnyLineChanged = false;
/*     */     this.isChangesDiscarded = false;
/*     */     return new PartialCommandOutput(output.getText(), output.getStyleRanges(), logicalLineIndex, this.textBuffer.getWidth(), anyDiscarded);
/*     */   }
/*     */   
/*     */   private final int getLogicalLineIndex(int visualLine) {
/*     */     int count = 0;
/*     */     for (int ind = -this.textBuffer.getHistoryLinesCount(); ind < visualLine; ind++) {
/*     */       if (!this.textBuffer.getLine(ind).isWrapped())
/*     */         count++; 
/*     */     } 
/*     */     return count;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalOutputChangesTracker.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */