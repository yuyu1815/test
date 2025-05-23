/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session;
/*    */ 
/*    */ import com.jediterm.terminal.model.TerminalTextBuffer;
/*    */ import kotlin.Unit;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\002\n\002\b\004\n\002\030\002\n\000\n\002\020\013\n\000\b\000\030\0002\0020\001B/\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\006\020\006\032\0020\007\022\f\020\b\032\b\022\004\022\0020\n0\t¢\006\004\b\013\020\fJ\b\020\020\032\0020\021H\002R\016\020\002\032\0020\003X\004¢\006\002\n\000R\020\020\004\032\004\030\0010\005X\004¢\006\002\n\000R\024\020\b\032\b\022\004\022\0020\n0\tX\004¢\006\002\n\000R\016\020\r\032\0020\007X\004¢\006\002\n\000R\016\020\016\032\0020\017X\004¢\006\002\n\000¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandEndMarkerListener;", "", "terminalTextBuffer", "Lcom/jediterm/terminal/model/TerminalTextBuffer;", "commandEndMarker", "", "parentDisposable", "Lcom/intellij/openapi/Disposable;", "onFound", "Lkotlin/Function0;", "", "<init>", "(Lcom/jediterm/terminal/model/TerminalTextBuffer;Ljava/lang/String;Lcom/intellij/openapi/Disposable;Lkotlin/jvm/functions/Function0;)V", "disposable", "found", "Ljava/util/concurrent/atomic/AtomicBoolean;", "findCommandEndMarker", "", "ej-core"})
/*    */ @SourceDebugExtension({"SMAP\nShellCommandEndMarkerListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShellCommandEndMarkerListener.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandEndMarkerListener\n+ 2 TerminalModel.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel$Companion\n*L\n1#1,49:1\n231#2,7:50\n*S KotlinDebug\n*F\n+ 1 ShellCommandEndMarkerListener.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandEndMarkerListener\n*L\n34#1:50,7\n*E\n"})
/*    */ public final class ShellCommandEndMarkerListener {
/*    */   @NotNull
/*    */   private final TerminalTextBuffer terminalTextBuffer;
/*    */   @Nullable
/*    */   private final String commandEndMarker;
/*    */   
/* 15 */   public ShellCommandEndMarkerListener(@NotNull TerminalTextBuffer terminalTextBuffer, @Nullable String commandEndMarker, @NotNull Disposable parentDisposable, @NotNull Function0<Unit> onFound) { this.terminalTextBuffer = terminalTextBuffer;
/* 16 */     this.commandEndMarker = commandEndMarker;
/*    */     
/* 18 */     this.onFound = onFound;
/*    */ 
/*    */     
/* 21 */     Intrinsics.checkNotNullExpressionValue(Disposer.newDisposable(parentDisposable, ShellCommandEndMarkerListener.class.getSimpleName()), "newDisposable(...)"); this.disposable = Disposer.newDisposable(parentDisposable, ShellCommandEndMarkerListener.class.getSimpleName());
/* 22 */     this.found = new AtomicBoolean(false);
/*    */ 
/*    */     
/* 25 */     if (!findCommandEndMarker())
/* 26 */       ShellCommandOutputScraperImplKt.addModelListener(this.terminalTextBuffer, this.disposable, this::_init_$lambda$0);  } @NotNull private final Function0<Unit> onFound; @NotNull private final Disposable disposable; @NotNull
/* 27 */   private final AtomicBoolean found; private static final void _init_$lambda$0(ShellCommandEndMarkerListener this$0) { this$0.findCommandEndMarker(); }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private final boolean findCommandEndMarker() {
/* 33 */     Ref.BooleanRef commandEndMarkerFound = new Ref.BooleanRef();
/* 34 */     TerminalModel.Companion companion = TerminalModel.Companion; TerminalTextBuffer $this$withLock$iv = this.terminalTextBuffer; int $i$f$withLock = 0;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 50 */     $this$withLock$iv.lock();
/*    */     
/* 52 */     try { TerminalTextBuffer it = $this$withLock$iv; int $i$a$-withLock-ShellCommandEndMarkerListener$findCommandEndMarker$1 = 0; StringCollector stringCollector = (StringCollector)new CommandEndMarkerListeningStringCollector((StringCollector)new SimpleStringCollector(), this.commandEndMarker, commandEndMarkerFound::findCommandEndMarker$lambda$2$lambda$1); ShellCommandOutputScraperImplKt.collectLines$default(this.terminalTextBuffer, (TerminalLinesCollector)new SimpleTerminalLinesCollector(stringCollector), 0, 2, null); Unit unit = Unit.INSTANCE;
/*    */ 
/*    */       
/* 55 */       $this$withLock$iv.unlock(); } finally { $this$withLock$iv.unlock(); }
/*    */     
/*    */     return false;
/*    */   }
/*    */   
/*    */   private static final Unit findCommandEndMarker$lambda$2$lambda$1(Ref.BooleanRef $commandEndMarkerFound) {
/*    */     $commandEndMarkerFound.element = true;
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\session\ShellCommandEndMarkerListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */