/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ShellExecutor;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.TerminalPromptState;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.BlockTerminalSession;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.CommandFinishedEvent;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.GeneratorFinishedEvent;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.ShellCommandListener;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.ShellCommandOutputListener;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.ShellCommandOutputScraperImpl;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.StyledCommandOutput;
/*     */ import com.intellij.openapi.Disposable;
/*     */ import com.intellij.openapi.util.Disposer;
/*     */ import com.intellij.openapi.util.text.StringUtil;
/*     */ import com.jediterm.terminal.model.TerminalTextBuffer;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.ArraysKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.Regex;
/*     */ import kotlin.text.StringsKt;
/*     */ import kotlinx.coroutines.CompletableDeferred;
/*     */ import kotlinx.coroutines.CompletableDeferredKt;
/*     */ import kotlinx.coroutines.Deferred;
/*     */ import kotlinx.coroutines.Job;
/*     */ import kotlinx.coroutines.flow.MutableStateFlow;
/*     */ import kotlinx.coroutines.flow.StateFlow;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\007\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\002\030\0002\0020\001B-\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\f\020\007\032\b\022\004\022\0020\0030\b¢\006\004\b\t\020\nJ\f\020\026\032\0020\003*\0020\003H\002J\016\020\027\032\0020\0302\006\020\031\032\0020\032J\020\020\033\032\0020\0032\006\020\034\032\0020\003H\002R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\013\020\fR\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\005X\004¢\006\002\n\000R\032\020\007\032\b\022\004\022\0020\0030\bX\004¢\006\b\n\000\032\004\b\r\020\016R\032\020\017\032\b\022\004\022\0020\0210\020X\004¢\006\b\n\000\032\004\b\022\020\023R\016\020\024\032\0020\025X.¢\006\002\n\000¨\006\035"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$ShellCommand;", "command", "", "outputLinesLimit", "", "historyLinesLimit", "outputFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "<init>", "(Ljava/lang/String;IILkotlinx/coroutines/flow/MutableStateFlow;)V", "getCommand", "()Ljava/lang/String;", "getOutputFlow", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "promisedResult", "Lkotlinx/coroutines/CompletableDeferred;", "Lcom/intellij/ml/llm/matterhorn/ShellExecutor$CommandResult;", "getPromisedResult", "()Lkotlinx/coroutines/CompletableDeferred;", "disposable", "Lcom/intellij/openapi/Disposable;", "toDebug", "launchInSession", "Lkotlinx/coroutines/Job;", "session", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;", "normalizeActualOutput", "output", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nBlockTerminalShellExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockTerminalShellExecutor.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,342:1\n24#2:343\n61#2,5:344\n*S KotlinDebug\n*F\n+ 1 BlockTerminalShellExecutor.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand\n*L\n275#1:343\n275#1:344,5\n*E\n"})
/*     */ final class PreparedShellCommand
/*     */   implements BlockTerminalShellExecutor.ShellCommand
/*     */ {
/*     */   @NotNull
/*     */   private final String command;
/*     */   private final int outputLinesLimit;
/*     */   private final int historyLinesLimit;
/*     */   @NotNull
/*     */   private final MutableStateFlow<String> outputFlow;
/*     */   @NotNull
/*     */   private final CompletableDeferred<ShellExecutor.CommandResult> promisedResult;
/*     */   private Disposable disposable;
/*     */   
/*     */   @NotNull
/*     */   public String getCommand() {
/*     */     return this.command;
/*     */   }
/*     */   
/*     */   public PreparedShellCommand(@NotNull String command, int outputLinesLimit, int historyLinesLimit, @NotNull MutableStateFlow<String> outputFlow) {
/* 244 */     this.command = command;
/* 245 */     this.outputLinesLimit = outputLinesLimit;
/* 246 */     this.historyLinesLimit = historyLinesLimit;
/* 247 */     this.outputFlow = outputFlow;
/*     */ 
/*     */     
/* 250 */     this.promisedResult = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
/*     */ 
/*     */ 
/*     */     
/* 254 */     getPromisedResult().invokeOnCompletion(this::_init_$lambda$0); } private static final Unit _init_$lambda$0(PreparedShellCommand this$0, Throwable it) {
/* 255 */     if (this$0.disposable != null) {
/* 256 */       if (this$0.disposable == null) Intrinsics.throwUninitializedPropertyAccessException("disposable");  Disposer.dispose(null);
/*     */     } 
/* 258 */     return Unit.INSTANCE;
/*     */   }
/*     */   @NotNull
/*     */   public MutableStateFlow<String> getOutputFlow() {
/*     */     return this.outputFlow;
/*     */   }
/*     */   
/*     */   private final String toDebug(String $this$toDebug) {
/* 266 */     int length = $this$toDebug.length();
/* 267 */     CharSequence charSequence = $this$toDebug; Regex regex = new Regex("[\r\n]"); String str1 = "\\n"; charSequence = regex.replace(charSequence, str1); regex = new Regex("\\s{3,}"); str1 = " . "; String noSpaces = regex.replace(charSequence, str1);
/* 268 */     String safeText = "{" + length + "}:`" + StringUtil.firstLast(noSpaces, 30) + "`";
/* 269 */     return ((((CharSequence)$this$toDebug).length() == 0)) ? "<empty>" : (StringsKt.isBlank($this$toDebug) ? "<blank>" : safeText);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public CompletableDeferred<ShellExecutor.CommandResult> getPromisedResult() {
/*     */     return this.promisedResult;
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final Job launchInSession(@NotNull BlockTerminalSession session) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'session'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: astore_2
/*     */     //   8: iconst_0
/*     */     //   9: istore_3
/*     */     //   10: ldc com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand
/*     */     //   12: invokestatic getInstance : (Ljava/lang/Class;)Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   15: dup
/*     */     //   16: ldc 'getInstance(...)'
/*     */     //   18: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   21: astore_2
/*     */     //   22: nop
/*     */     //   23: aconst_null
/*     */     //   24: astore_3
/*     */     //   25: iconst_0
/*     */     //   26: istore #4
/*     */     //   28: aload_2
/*     */     //   29: invokevirtual isDebugEnabled : ()Z
/*     */     //   32: ifeq -> 57
/*     */     //   35: aload_2
/*     */     //   36: astore #6
/*     */     //   38: iconst_0
/*     */     //   39: istore #5
/*     */     //   41: aload_0
/*     */     //   42: invokevirtual getCommand : ()Ljava/lang/String;
/*     */     //   45: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   50: aload #6
/*     */     //   52: swap
/*     */     //   53: aload_3
/*     */     //   54: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   57: nop
/*     */     //   58: aload_0
/*     */     //   59: aload_1
/*     */     //   60: checkcast com/intellij/openapi/Disposable
/*     */     //   63: invokestatic newDisposable : (Lcom/intellij/openapi/Disposable;)Lcom/intellij/openapi/Disposable;
/*     */     //   66: putfield disposable : Lcom/intellij/openapi/Disposable;
/*     */     //   69: new com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandOutputScraperImpl
/*     */     //   72: dup
/*     */     //   73: aload_1
/*     */     //   74: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;)V
/*     */     //   77: astore_2
/*     */     //   78: aload_1
/*     */     //   79: invokevirtual getModel : ()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel;
/*     */     //   82: invokevirtual getTextBuffer$ej_core : ()Lcom/jediterm/terminal/model/TerminalTextBuffer;
/*     */     //   85: astore_3
/*     */     //   86: aload_2
/*     */     //   87: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandOutputScraper
/*     */     //   90: new com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$2
/*     */     //   93: dup
/*     */     //   94: aload_0
/*     */     //   95: aload_3
/*     */     //   96: aload_1
/*     */     //   97: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;Lcom/jediterm/terminal/model/TerminalTextBuffer;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;)V
/*     */     //   100: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandOutputListener
/*     */     //   103: aload_0
/*     */     //   104: getfield disposable : Lcom/intellij/openapi/Disposable;
/*     */     //   107: dup
/*     */     //   108: ifnonnull -> 118
/*     */     //   111: pop
/*     */     //   112: ldc 'disposable'
/*     */     //   114: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
/*     */     //   117: aconst_null
/*     */     //   118: iconst_0
/*     */     //   119: iconst_4
/*     */     //   120: aconst_null
/*     */     //   121: invokestatic addListener$default : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandOutputScraper;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandOutputListener;Lcom/intellij/openapi/Disposable;ZILjava/lang/Object;)V
/*     */     //   124: aload_1
/*     */     //   125: invokevirtual getCommandManager$ej_core : ()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager;
/*     */     //   128: new com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$3
/*     */     //   131: dup
/*     */     //   132: aload_2
/*     */     //   133: aload_0
/*     */     //   134: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandOutputScraperImpl;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;)V
/*     */     //   137: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandListener
/*     */     //   140: aload_0
/*     */     //   141: getfield disposable : Lcom/intellij/openapi/Disposable;
/*     */     //   144: dup
/*     */     //   145: ifnonnull -> 155
/*     */     //   148: pop
/*     */     //   149: ldc 'disposable'
/*     */     //   151: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
/*     */     //   154: aconst_null
/*     */     //   155: invokevirtual addListener : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandListener;Lcom/intellij/openapi/Disposable;)V
/*     */     //   158: aload_1
/*     */     //   159: invokevirtual getCommandExecutionManager$ej_core : ()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManager;
/*     */     //   162: aload_0
/*     */     //   163: invokevirtual getCommand : ()Ljava/lang/String;
/*     */     //   166: invokeinterface sendCommandToExecute : (Ljava/lang/String;)V
/*     */     //   171: aload_0
/*     */     //   172: invokevirtual getPromisedResult : ()Lkotlinx/coroutines/CompletableDeferred;
/*     */     //   175: checkcast kotlinx/coroutines/Job
/*     */     //   178: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #275	-> 6
/*     */     //   #343	-> 10
/*     */     //   #275	-> 22
/*     */     //   #344	-> 23
/*     */     //   #345	-> 28
/*     */     //   #346	-> 35
/*     */     //   #276	-> 41
/*     */     //   #346	-> 53
/*     */     //   #348	-> 57
/*     */     //   #278	-> 58
/*     */     //   #279	-> 69
/*     */     //   #280	-> 78
/*     */     //   #281	-> 86
/*     */     //   #307	-> 103
/*     */     //   #281	-> 118
/*     */     //   #309	-> 124
/*     */     //   #318	-> 140
/*     */     //   #309	-> 155
/*     */     //   #320	-> 158
/*     */     //   #322	-> 171
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   10	11	3	$i$f$thisLogger	I
/*     */     //   8	13	2	$this$thisLogger$iv	Ljava/lang/Object;
/*     */     //   41	9	5	$i$a$-debug$default-BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$1	I
/*     */     //   28	30	4	$i$f$debug	I
/*     */     //   23	35	2	$this$debug_u24default$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   25	33	3	e$iv	Ljava/lang/Exception;
/*     */     //   78	101	2	scraper	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandOutputScraperImpl;
/*     */     //   86	93	3	textBuffer	Lcom/jediterm/terminal/model/TerminalTextBuffer;
/*     */     //   0	179	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;
/*     */     //   0	179	1	session	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;
/*     */   }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$2", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandOutputListener;", "commandOutputChanged", "", "output", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/StyledCommandOutput;", "ej-core"})
/*     */   @SourceDebugExtension({"SMAP\nBlockTerminalShellExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockTerminalShellExecutor.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$2\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,342:1\n24#2:343\n61#2,5:344\n*S KotlinDebug\n*F\n+ 1 BlockTerminalShellExecutor.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$2\n*L\n290#1:343\n290#1:344,5\n*E\n"})
/*     */   public static final class BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$2
/*     */     implements ShellCommandOutputListener
/*     */   {
/*     */     BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$2(TerminalTextBuffer $textBuffer, BlockTerminalSession $session) {}
/*     */ 
/*     */     
/*     */     public void commandOutputChanged(StyledCommandOutput output) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'output'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_0
/*     */       //   7: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;
/*     */       //   10: invokevirtual getOutputFlow : ()Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */       //   13: aload_1
/*     */       //   14: invokevirtual getText : ()Ljava/lang/String;
/*     */       //   17: invokeinterface tryEmit : (Ljava/lang/Object;)Z
/*     */       //   22: pop
/*     */       //   23: aload_1
/*     */       //   24: invokevirtual getText : ()Ljava/lang/String;
/*     */       //   27: astore_2
/*     */       //   28: aload_2
/*     */       //   29: checkcast java/lang/CharSequence
/*     */       //   32: invokestatic countNewLines : (Ljava/lang/CharSequence;)I
/*     */       //   35: istore_3
/*     */       //   36: iload_3
/*     */       //   37: aload_0
/*     */       //   38: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;
/*     */       //   41: invokestatic access$getOutputLinesLimit$p : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;)I
/*     */       //   44: if_icmpge -> 66
/*     */       //   47: aload_0
/*     */       //   48: getfield $textBuffer : Lcom/jediterm/terminal/model/TerminalTextBuffer;
/*     */       //   51: invokevirtual getHistoryLinesCount : ()I
/*     */       //   54: iconst_1
/*     */       //   55: iadd
/*     */       //   56: aload_0
/*     */       //   57: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;
/*     */       //   60: invokestatic access$getHistoryLinesLimit$p : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;)I
/*     */       //   63: if_icmplt -> 70
/*     */       //   66: iconst_1
/*     */       //   67: goto -> 71
/*     */       //   70: iconst_0
/*     */       //   71: istore #4
/*     */       //   73: iload #4
/*     */       //   75: ifeq -> 243
/*     */       //   78: aload_0
/*     */       //   79: astore #5
/*     */       //   81: iconst_0
/*     */       //   82: istore #6
/*     */       //   84: ldc com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$2
/*     */       //   86: invokestatic getInstance : (Ljava/lang/Class;)Lcom/intellij/openapi/diagnostic/Logger;
/*     */       //   89: dup
/*     */       //   90: ldc 'getInstance(...)'
/*     */       //   92: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   95: astore #5
/*     */       //   97: aload_0
/*     */       //   98: getfield $textBuffer : Lcom/jediterm/terminal/model/TerminalTextBuffer;
/*     */       //   101: astore #7
/*     */       //   103: aload_0
/*     */       //   104: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;
/*     */       //   107: astore #8
/*     */       //   109: aconst_null
/*     */       //   110: astore #6
/*     */       //   112: iconst_0
/*     */       //   113: istore #9
/*     */       //   115: aload #5
/*     */       //   117: invokevirtual isDebugEnabled : ()Z
/*     */       //   120: ifeq -> 173
/*     */       //   123: aload #5
/*     */       //   125: astore #13
/*     */       //   127: iconst_0
/*     */       //   128: istore #10
/*     */       //   130: aload #7
/*     */       //   132: invokevirtual getHistoryLinesCount : ()I
/*     */       //   135: istore #11
/*     */       //   137: aload #7
/*     */       //   139: invokevirtual getScreenLinesCount : ()I
/*     */       //   142: istore #12
/*     */       //   144: aload #8
/*     */       //   146: aload_2
/*     */       //   147: invokestatic access$toDebug : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;Ljava/lang/String;)Ljava/lang/String;
/*     */       //   150: iload_3
/*     */       //   151: aload #8
/*     */       //   153: invokestatic access$getHistoryLinesLimit$p : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;)I
/*     */       //   156: iload #11
/*     */       //   158: iload #12
/*     */       //   160: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;IIII)Ljava/lang/String;
/*     */       //   165: aload #13
/*     */       //   167: swap
/*     */       //   168: aload #6
/*     */       //   170: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */       //   173: nop
/*     */       //   174: aload_0
/*     */       //   175: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;
/*     */       //   178: aload_2
/*     */       //   179: invokestatic access$normalizeActualOutput : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;Ljava/lang/String;)Ljava/lang/String;
/*     */       //   182: getstatic com/intellij/ml/llm/matterhorn/ShellExecutor$Companion$CompletionStatus.LINE_LIMIT_EXCEEDED : Lcom/intellij/ml/llm/matterhorn/ShellExecutor$Companion$CompletionStatus;
/*     */       //   185: invokevirtual getAgentMessage : ()Ljava/lang/String;
/*     */       //   188: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */       //   193: astore #5
/*     */       //   195: aload_0
/*     */       //   196: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;
/*     */       //   199: invokevirtual getPromisedResult : ()Lkotlinx/coroutines/CompletableDeferred;
/*     */       //   202: new com/intellij/ml/llm/matterhorn/ShellExecutor$CommandResult
/*     */       //   205: dup
/*     */       //   206: aload #5
/*     */       //   208: iconst_m1
/*     */       //   209: invokespecial <init> : (Ljava/lang/String;I)V
/*     */       //   212: invokeinterface complete : (Ljava/lang/Object;)Z
/*     */       //   217: pop
/*     */       //   218: aload_0
/*     */       //   219: getfield $session : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;
/*     */       //   222: invokevirtual getTerminalOutputStream$ej_core : ()Lcom/jediterm/terminal/TerminalOutputStream;
/*     */       //   225: iconst_1
/*     */       //   226: newarray byte
/*     */       //   228: astore #6
/*     */       //   230: aload #6
/*     */       //   232: iconst_0
/*     */       //   233: iconst_3
/*     */       //   234: bastore
/*     */       //   235: aload #6
/*     */       //   237: iconst_0
/*     */       //   238: invokeinterface sendBytes : ([BZ)V
/*     */       //   243: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #283	-> 6
/*     */       //   #285	-> 23
/*     */       //   #286	-> 28
/*     */       //   #287	-> 36
/*     */       //   #289	-> 73
/*     */       //   #290	-> 78
/*     */       //   #343	-> 84
/*     */       //   #290	-> 97
/*     */       //   #344	-> 109
/*     */       //   #345	-> 115
/*     */       //   #346	-> 123
/*     */       //   #291	-> 130
/*     */       //   #292	-> 137
/*     */       //   #293	-> 144
/*     */       //   #294	-> 150
/*     */       //   #295	-> 156
/*     */       //   #346	-> 168
/*     */       //   #348	-> 173
/*     */       //   #299	-> 174
/*     */       //   #300	-> 182
/*     */       //   #299	-> 193
/*     */       //   #301	-> 195
/*     */       //   #303	-> 218
/*     */       //   #306	-> 243
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   84	11	6	$i$f$thisLogger	I
/*     */       //   81	14	5	$this$thisLogger$iv	Ljava/lang/Object;
/*     */       //   130	35	10	$i$a$-debug$default-BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$2$commandOutputChanged$1	I
/*     */       //   137	28	11	historyLines	I
/*     */       //   144	21	12	screenLines	I
/*     */       //   115	59	9	$i$f$debug	I
/*     */       //   109	65	5	$this$debug_u24default$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */       //   112	62	6	e$iv	Ljava/lang/Exception;
/*     */       //   195	48	5	normalizedText	Ljava/lang/String;
/*     */       //   28	216	2	text	Ljava/lang/String;
/*     */       //   36	208	3	newLines	I
/*     */       //   73	171	4	reachedTheLimit	Z
/*     */       //   0	244	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$2;
/*     */       //   0	244	1	output	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/StyledCommandOutput;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$3", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandListener;", "commandFinished", "", "event", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/CommandFinishedEvent;", "ej-core"})
/*     */   @SourceDebugExtension({"SMAP\nBlockTerminalShellExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockTerminalShellExecutor.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$3\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,342:1\n24#2:343\n61#2,5:344\n*S KotlinDebug\n*F\n+ 1 BlockTerminalShellExecutor.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$3\n*L\n312#1:343\n312#1:344,5\n*E\n"})
/*     */   public static final class BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$3
/*     */     implements ShellCommandListener
/*     */   {
/*     */     BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$3(BlockTerminalShellExecutor.PreparedShellCommand $receiver) {}
/*     */ 
/*     */     
/*     */     public void initialized() {
/* 309 */       ShellCommandListener.DefaultImpls.initialized(this); } public void promptShown() { ShellCommandListener.DefaultImpls.promptShown(this); } public void commandStarted(String command) { ShellCommandListener.DefaultImpls.commandStarted(this, command); } public void promptStateUpdated(TerminalPromptState newState) { ShellCommandListener.DefaultImpls.promptStateUpdated(this, newState); } public void commandHistoryReceived(String history) { ShellCommandListener.DefaultImpls.commandHistoryReceived(this, history); } public void commandBufferReceived(String buffer) { ShellCommandListener.DefaultImpls.commandBufferReceived(this, buffer); } public void shellInfoReceived(String rawShellInfo) { ShellCommandListener.DefaultImpls.shellInfoReceived(this, rawShellInfo); } public void generatorFinished(GeneratorFinishedEvent event) { ShellCommandListener.DefaultImpls.generatorFinished(this, event); } public void clearInvoked() { ShellCommandListener.DefaultImpls.clearInvoked(this); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void commandFinished(CommandFinishedEvent event) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'event'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_0
/*     */       //   7: getfield $scraper : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandOutputScraperImpl;
/*     */       //   10: invokevirtual scrapeOutput : ()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/StyledCommandOutput;
/*     */       //   13: invokevirtual component1 : ()Ljava/lang/String;
/*     */       //   16: astore_2
/*     */       //   17: aload_0
/*     */       //   18: astore_3
/*     */       //   19: iconst_0
/*     */       //   20: istore #4
/*     */       //   22: ldc com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$3
/*     */       //   24: invokestatic getInstance : (Ljava/lang/Class;)Lcom/intellij/openapi/diagnostic/Logger;
/*     */       //   27: dup
/*     */       //   28: ldc 'getInstance(...)'
/*     */       //   30: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   33: astore_3
/*     */       //   34: aload_0
/*     */       //   35: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;
/*     */       //   38: astore #5
/*     */       //   40: aconst_null
/*     */       //   41: astore #4
/*     */       //   43: iconst_0
/*     */       //   44: istore #6
/*     */       //   46: aload_3
/*     */       //   47: invokevirtual isDebugEnabled : ()Z
/*     */       //   50: ifeq -> 79
/*     */       //   53: aload_3
/*     */       //   54: astore #8
/*     */       //   56: iconst_0
/*     */       //   57: istore #7
/*     */       //   59: aload_1
/*     */       //   60: aload #5
/*     */       //   62: aload_2
/*     */       //   63: invokestatic access$toDebug : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;Ljava/lang/String;)Ljava/lang/String;
/*     */       //   66: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/CommandFinishedEvent;Ljava/lang/String;)Ljava/lang/String;
/*     */       //   71: aload #8
/*     */       //   73: swap
/*     */       //   74: aload #4
/*     */       //   76: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */       //   79: nop
/*     */       //   80: aload_0
/*     */       //   81: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;
/*     */       //   84: aload_2
/*     */       //   85: invokestatic access$normalizeActualOutput : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;Ljava/lang/String;)Ljava/lang/String;
/*     */       //   88: astore_3
/*     */       //   89: aload_0
/*     */       //   90: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;
/*     */       //   93: invokevirtual getPromisedResult : ()Lkotlinx/coroutines/CompletableDeferred;
/*     */       //   96: new com/intellij/ml/llm/matterhorn/ShellExecutor$CommandResult
/*     */       //   99: dup
/*     */       //   100: aload_3
/*     */       //   101: aload_1
/*     */       //   102: invokevirtual getExitCode : ()I
/*     */       //   105: invokespecial <init> : (Ljava/lang/String;I)V
/*     */       //   108: invokeinterface complete : (Ljava/lang/Object;)Z
/*     */       //   113: pop
/*     */       //   114: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #311	-> 6
/*     */       //   #312	-> 17
/*     */       //   #343	-> 22
/*     */       //   #312	-> 34
/*     */       //   #344	-> 40
/*     */       //   #345	-> 46
/*     */       //   #346	-> 53
/*     */       //   #313	-> 59
/*     */       //   #346	-> 74
/*     */       //   #348	-> 79
/*     */       //   #315	-> 80
/*     */       //   #316	-> 89
/*     */       //   #317	-> 114
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   22	11	4	$i$f$thisLogger	I
/*     */       //   19	14	3	$this$thisLogger$iv	Ljava/lang/Object;
/*     */       //   59	12	7	$i$a$-debug$default-BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$3$commandFinished$1	I
/*     */       //   46	34	6	$i$f$debug	I
/*     */       //   40	40	3	$this$debug_u24default$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */       //   43	37	4	e$iv	Ljava/lang/Exception;
/*     */       //   17	98	2	text	Ljava/lang/String;
/*     */       //   89	26	3	normalizedText	Ljava/lang/String;
/*     */       //   0	115	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$3;
/*     */       //   0	115	1	event	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/CommandFinishedEvent;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final String normalizeActualOutput(String output)
/*     */   {
/* 330 */     Intrinsics.checkNotNullExpressionValue(StringUtil.splitByLinesDontTrim(output), "splitByLinesDontTrim(...)"); return ArraysKt.joinToString$default((Object[])StringUtil.splitByLinesDontTrim(output), "\n", null, null, 0, null, PreparedShellCommand::normalizeActualOutput$lambda$2, 30, null); } private static final CharSequence normalizeActualOutput$lambda$2(String it) { Intrinsics.checkNotNull(it); return StringsKt.trimEnd(it).toString(); }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\BlockTerminalShellExecutor$PreparedShellCommand.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */