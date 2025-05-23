/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.TerminalPromptState;
/*     */ import com.intellij.openapi.Disposable;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.jediterm.terminal.Terminal;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.StringsKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000f\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020 \n\002\b\f\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\f\b\000\030\000 52\0020\001:\00256B1\022\b\020\002\032\004\030\0010\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\006\020\n\032\0020\013¢\006\004\b\f\020\rB\021\b\026\022\006\020\016\032\0020\017¢\006\004\b\f\020\020J\026\020\030\032\0020\0312\f\020\032\032\b\022\004\022\0020\0030\033H\002J\026\020\034\032\0020\0312\f\020\032\032\b\022\004\022\0020\0030\033H\002J\026\020\035\032\0020\0312\f\020\032\032\b\022\004\022\0020\0030\033H\002J\026\020\036\032\0020\0312\f\020\032\032\b\022\004\022\0020\0030\033H\002J\026\020\037\032\0020\0312\f\020\032\032\b\022\004\022\0020\0030\033H\002J\026\020 \032\0020\0312\f\020\032\032\b\022\004\022\0020\0030\033H\002J\b\020!\032\0020\031H\002J\020\020\"\032\0020\0312\006\020#\032\0020\003H\002J\b\020$\032\0020\031H\002J\020\020%\032\0020\0312\006\020\026\032\0020\027H\002J\032\020&\032\0020\0312\b\020\026\032\004\030\0010\0272\006\020'\032\0020(H\002J\020\020)\032\0020\0312\006\020*\032\0020+H\002J\020\020,\032\0020\0312\006\020-\032\0020\003H\002J\026\020.\032\0020\0312\f\020\032\032\b\022\004\022\0020\0030\033H\002J \020/\032\0020\0312\006\0200\032\0020(2\006\0201\032\0020\0032\006\020'\032\0020(H\002J\b\0202\032\0020\031H\002J\026\0203\032\0020\0312\006\0204\032\0020\0232\006\020\b\032\0020\tR\020\020\002\032\004\030\0010\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000R\016\020\b\032\0020\tX\004¢\006\002\n\000R\016\020\n\032\0020\013X\004¢\006\002\n\000R!\020\021\032\025\022\f\022\n \024*\004\030\0010\0230\0230\022¢\006\002\b\025X\004¢\006\002\n\000R\020\020\026\032\004\030\0010\027X\016¢\006\002\n\000¨\0067"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager;", "", "commandEndMarker", "", "terminal", "Lcom/jediterm/terminal/Terminal;", "shellIntegration", "Lorg/jetbrains/plugins/terminal/util/ShellIntegration;", "parentDisposable", "Lcom/intellij/openapi/Disposable;", "terminalTextBuffer", "Lcom/jediterm/terminal/model/TerminalTextBuffer;", "<init>", "(Ljava/lang/String;Lcom/jediterm/terminal/Terminal;Lorg/jetbrains/plugins/terminal/util/ShellIntegration;Lcom/intellij/openapi/Disposable;Lcom/jediterm/terminal/model/TerminalTextBuffer;)V", "session", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;)V", "dispatcher", "Lcom/intellij/util/EventDispatcher;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandListener;", "kotlin.jvm.PlatformType", "Lorg/jetbrains/annotations/NotNull;", "startedCommand", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/StartedCommand;", "processInitialized", "", "event", "", "processCommandStartedEvent", "processCommandFinishedEvent", "processPromptStateUpdatedEvent", "processCommandHistoryEvent", "processGeneratorFinishedEvent", "clearTerminal", "fireInitialized", "rawShellInfo", "firePromptShown", "fireCommandStarted", "fireCommandFinished", "exitCode", "", "firePromptStateUpdated", "state", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptState;", "fireCommandHistoryReceived", "history", "fireShellEditorBufferReported", "fireGeneratorFinished", "requestId", "result", "fireClearInvoked", "addListener", "listener", "Companion", "Param", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nShellCommandManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShellCommandManager.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager\n+ 2 ShellCommandManager.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Companion\n+ 3 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,306:1\n215#2,2:307\n217#2:313\n215#2,2:314\n217#2:320\n215#2,2:321\n217#2:327\n215#2,2:328\n217#2:334\n215#2,2:335\n217#2:341\n215#2,2:342\n217#2:348\n215#2,2:349\n217#2:355\n215#2,2:356\n217#2:362\n215#2,2:363\n217#2:369\n215#2,2:370\n217#2:376\n215#2,2:377\n217#2:383\n215#2,2:384\n217#2:390\n215#2,2:391\n217#2:397\n62#3,4:309\n62#3,4:316\n62#3,4:323\n62#3,4:330\n62#3,4:337\n62#3,4:344\n62#3,4:351\n62#3,4:358\n62#3,4:365\n62#3,4:372\n62#3,4:379\n62#3,4:386\n62#3,4:393\n14#3:398\n*S KotlinDebug\n*F\n+ 1 ShellCommandManager.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager\n*L\n66#1:307,2\n66#1:313\n88#1:314,2\n88#1:320\n125#1:321,2\n125#1:327\n148#1:328,2\n148#1:334\n153#1:335,2\n153#1:341\n160#1:342,2\n160#1:348\n165#1:349,2\n165#1:355\n175#1:356,2\n175#1:362\n183#1:363,2\n183#1:369\n187#1:370,2\n187#1:376\n193#1:377,2\n193#1:383\n198#1:384,2\n198#1:390\n204#1:391,2\n204#1:397\n66#1:309,4\n88#1:316,4\n125#1:323,4\n148#1:330,4\n153#1:337,4\n160#1:344,4\n165#1:351,4\n175#1:358,4\n183#1:365,4\n187#1:372,4\n193#1:379,4\n198#1:386,4\n204#1:393,4\n213#1:398\n*E\n"})
/*     */ public final class ShellCommandManager {
/*  21 */   public ShellCommandManager(@Nullable String commandEndMarker, @NotNull Terminal terminal, @NotNull ShellIntegration shellIntegration, @NotNull Disposable parentDisposable, @NotNull TerminalTextBuffer terminalTextBuffer) { this.commandEndMarker = commandEndMarker;
/*  22 */     this.terminal = terminal;
/*  23 */     this.shellIntegration = shellIntegration;
/*  24 */     this.parentDisposable = parentDisposable;
/*  25 */     this.terminalTextBuffer = terminalTextBuffer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  36 */     Intrinsics.checkNotNullExpressionValue(EventDispatcher.create(ShellCommandListener.class), "create(...)"); this.dispatcher = EventDispatcher.create(ShellCommandListener.class);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  42 */     this.terminal.addCustomCommandListener(this::_init_$lambda$0); } public ShellCommandManager(@NotNull BlockTerminalSession session) { this(session.getCommandBlockIntegration().getCommandEndMarker(), (Terminal)session.getController$ej_core(), session.getShellIntegration(), session, session.getModel().getTextBuffer$ej_core()); }
/*  43 */   private static final void _init_$lambda$0(ShellCommandManager this$0, List<String> it) { Intrinsics.checkNotNullParameter(it, "it"); try {
/*  44 */       String str = (String)CollectionsKt.getOrNull(it, 0); if (str != null) switch (str.hashCode()) { case 424089318: if (!str.equals("command_finished")) {
/*     */               break;
/*     */             }
/*     */             
/*  48 */             this$0.processCommandFinishedEvent(it);
/*     */             return;
/*     */           case -779416838:
/*     */             if (!str.equals("clear_invoked"))
/*     */               break; 
/*  53 */             this$0.fireClearInvoked(); return;case -1808601184: if (!str.equals("command_history")) break;  this$0.processCommandHistoryEvent(it); return;case -337753203: if (!str.equals("command_started")) break;  this$0.processCommandStartedEvent(it); return;case -872176010: if (!str.equals("prompt_shown")) break;  this$0.firePromptShown(); return;case 140169743: if (!str.equals("shell_editor_buffer_reported")) break;  this$0.fireShellEditorBufferReported(it); return;case -268905378: if (!str.equals("generator_finished")) break;  this$0.processGeneratorFinishedEvent(it); return;case 1234020052: if (!str.equals("initialized")) break;  this$0.processInitialized(it); return;case 1940723570: if (!str.equals("prompt_state_updated"))
/*  54 */               break;  this$0.processPromptStateUpdatedEvent(it); return; }   LOG.warn("Unknown custom command: " + it);
/*     */     
/*     */     }
/*  57 */     catch (Throwable t) {
/*  58 */       LOG.warn("Error while processing custom command: " + it, t);
/*     */     }  }
/*     */ 
/*     */ 
/*     */   
/*     */   private final void processInitialized(List event) {
/*     */     // Byte code:
/*     */     //   0: getstatic com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Param.SHELL_INFO : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Param;
/*     */     //   3: aload_1
/*     */     //   4: iconst_1
/*     */     //   5: invokestatic getOrNull : (Ljava/util/List;I)Ljava/lang/Object;
/*     */     //   8: checkcast java/lang/String
/*     */     //   11: invokevirtual getDecodedValueOrNull : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   14: dup
/*     */     //   15: ifnonnull -> 21
/*     */     //   18: pop
/*     */     //   19: ldc '{}'
/*     */     //   21: astore_2
/*     */     //   22: aload_0
/*     */     //   23: getfield commandEndMarker : Ljava/lang/String;
/*     */     //   26: ifnull -> 104
/*     */     //   29: getstatic com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Companion;
/*     */     //   32: astore_3
/*     */     //   33: aconst_null
/*     */     //   34: astore #4
/*     */     //   36: iconst_0
/*     */     //   37: istore #5
/*     */     //   39: aload_3
/*     */     //   40: invokevirtual getLOG$ej_core : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   43: astore #6
/*     */     //   45: iconst_0
/*     */     //   46: istore #7
/*     */     //   48: aload #6
/*     */     //   50: invokevirtual isDebugEnabled : ()Z
/*     */     //   53: ifeq -> 73
/*     */     //   56: aload #6
/*     */     //   58: astore #9
/*     */     //   60: iconst_0
/*     */     //   61: istore #8
/*     */     //   63: ldc 'Received initialized event, waiting for command end marker'
/*     */     //   65: aload #9
/*     */     //   67: swap
/*     */     //   68: aload #4
/*     */     //   70: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   73: nop
/*     */     //   74: nop
/*     */     //   75: new com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandEndMarkerListener
/*     */     //   78: dup
/*     */     //   79: aload_0
/*     */     //   80: getfield terminalTextBuffer : Lcom/jediterm/terminal/model/TerminalTextBuffer;
/*     */     //   83: aload_0
/*     */     //   84: getfield commandEndMarker : Ljava/lang/String;
/*     */     //   87: aload_0
/*     */     //   88: getfield parentDisposable : Lcom/intellij/openapi/Disposable;
/*     */     //   91: aload_0
/*     */     //   92: aload_2
/*     */     //   93: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager;Ljava/lang/String;)Lkotlin/jvm/functions/Function0;
/*     */     //   98: invokespecial <init> : (Lcom/jediterm/terminal/model/TerminalTextBuffer;Ljava/lang/String;Lcom/intellij/openapi/Disposable;Lkotlin/jvm/functions/Function0;)V
/*     */     //   101: goto -> 112
/*     */     //   104: aload_0
/*     */     //   105: aload_2
/*     */     //   106: invokespecial fireInitialized : (Ljava/lang/String;)V
/*     */     //   109: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   112: pop
/*     */     //   113: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #64	-> 0
/*     */     //   #65	-> 22
/*     */     //   #66	-> 29
/*     */     //   #307	-> 33
/*     */     //   #308	-> 39
/*     */     //   #309	-> 48
/*     */     //   #310	-> 56
/*     */     //   #66	-> 63
/*     */     //   #310	-> 68
/*     */     //   #312	-> 73
/*     */     //   #313	-> 74
/*     */     //   #67	-> 75
/*     */     //   #72	-> 104
/*     */     //   #74	-> 113
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   63	2	8	$i$a$-debug$ej_core$default-ShellCommandManager$processInitialized$1	I
/*     */     //   48	26	7	$i$f$debug	I
/*     */     //   45	29	6	$this$debug$iv$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   39	36	5	$i$f$debug$ej_core	I
/*     */     //   33	42	3	$this$iv	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Companion;
/*     */     //   36	39	4	e$iv	Ljava/lang/Exception;
/*     */     //   22	92	2	shellInfo	Ljava/lang/String;
/*     */     //   0	114	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager;
/*     */     //   0	114	1	event	Ljava/util/List;
/*     */   }
/*     */   
/*     */   private static final Unit processInitialized$lambda$2(ShellCommandManager this$0, String $shellInfo) {
/*  68 */     this$0.fireInitialized($shellInfo);
/*  69 */     return Unit.INSTANCE;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void processCommandStartedEvent(List event) {
/*  77 */     String command = Param.COMMAND.getDecodedValue((String)CollectionsKt.getOrNull(event, 1));
/*  78 */     String currentDirectory = Param.CURRENT_DIRECTORY.getDecodedValue((String)CollectionsKt.getOrNull(event, 2));
/*  79 */     StartedCommand startedCommand = new StartedCommand(command, currentDirectory, (TimeMark)TimeSource.Monotonic.ValueTimeMark.box-impl(TimeSource.Monotonic.INSTANCE.markNow-z9LOYto()));
/*  80 */     this.startedCommand = startedCommand;
/*  81 */     fireCommandStarted(startedCommand);
/*     */   }
/*     */ 
/*     */   
/*     */   private final void processCommandFinishedEvent(List event) {
/*     */     // Byte code:
/*     */     //   0: getstatic com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Param.EXIT_CODE : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Param;
/*     */     //   3: aload_1
/*     */     //   4: iconst_1
/*     */     //   5: invokestatic getOrNull : (Ljava/util/List;I)Ljava/lang/Object;
/*     */     //   8: checkcast java/lang/String
/*     */     //   11: invokevirtual getIntValue : (Ljava/lang/String;)I
/*     */     //   14: istore_2
/*     */     //   15: aload_0
/*     */     //   16: getfield startedCommand : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/StartedCommand;
/*     */     //   19: astore_3
/*     */     //   20: aload_0
/*     */     //   21: getfield commandEndMarker : Ljava/lang/String;
/*     */     //   24: ifnull -> 106
/*     */     //   27: getstatic com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Companion;
/*     */     //   30: astore #4
/*     */     //   32: aconst_null
/*     */     //   33: astore #5
/*     */     //   35: iconst_0
/*     */     //   36: istore #6
/*     */     //   38: aload #4
/*     */     //   40: invokevirtual getLOG$ej_core : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   43: astore #7
/*     */     //   45: iconst_0
/*     */     //   46: istore #8
/*     */     //   48: aload #7
/*     */     //   50: invokevirtual isDebugEnabled : ()Z
/*     */     //   53: ifeq -> 74
/*     */     //   56: aload #7
/*     */     //   58: astore #10
/*     */     //   60: iconst_0
/*     */     //   61: istore #9
/*     */     //   63: ldc_w 'Received command_finished event, waiting for command end marker'
/*     */     //   66: aload #10
/*     */     //   68: swap
/*     */     //   69: aload #5
/*     */     //   71: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   74: nop
/*     */     //   75: nop
/*     */     //   76: new com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandEndMarkerListener
/*     */     //   79: dup
/*     */     //   80: aload_0
/*     */     //   81: getfield terminalTextBuffer : Lcom/jediterm/terminal/model/TerminalTextBuffer;
/*     */     //   84: aload_0
/*     */     //   85: getfield commandEndMarker : Ljava/lang/String;
/*     */     //   88: aload_0
/*     */     //   89: getfield parentDisposable : Lcom/intellij/openapi/Disposable;
/*     */     //   92: aload_0
/*     */     //   93: aload_3
/*     */     //   94: iload_2
/*     */     //   95: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/StartedCommand;I)Lkotlin/jvm/functions/Function0;
/*     */     //   100: invokespecial <init> : (Lcom/jediterm/terminal/model/TerminalTextBuffer;Ljava/lang/String;Lcom/intellij/openapi/Disposable;Lkotlin/jvm/functions/Function0;)V
/*     */     //   103: goto -> 120
/*     */     //   106: aload_0
/*     */     //   107: aload_3
/*     */     //   108: iload_2
/*     */     //   109: invokespecial fireCommandFinished : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/StartedCommand;I)V
/*     */     //   112: aload_0
/*     */     //   113: aconst_null
/*     */     //   114: putfield startedCommand : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/StartedCommand;
/*     */     //   117: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   120: pop
/*     */     //   121: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #85	-> 0
/*     */     //   #86	-> 15
/*     */     //   #87	-> 20
/*     */     //   #88	-> 27
/*     */     //   #314	-> 32
/*     */     //   #315	-> 38
/*     */     //   #316	-> 48
/*     */     //   #317	-> 56
/*     */     //   #88	-> 63
/*     */     //   #317	-> 69
/*     */     //   #319	-> 74
/*     */     //   #320	-> 75
/*     */     //   #89	-> 76
/*     */     //   #95	-> 106
/*     */     //   #96	-> 112
/*     */     //   #98	-> 121
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   63	3	9	$i$a$-debug$ej_core$default-ShellCommandManager$processCommandFinishedEvent$1	I
/*     */     //   48	27	8	$i$f$debug	I
/*     */     //   45	30	7	$this$debug$iv$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   38	38	6	$i$f$debug$ej_core	I
/*     */     //   32	44	4	$this$iv	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Companion;
/*     */     //   35	41	5	e$iv	Ljava/lang/Exception;
/*     */     //   15	107	2	exitCode	I
/*     */     //   20	102	3	startedCommand	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/StartedCommand;
/*     */     //   0	122	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager;
/*     */     //   0	122	1	event	Ljava/util/List;
/*     */   }
/*     */   
/*     */   private static final Unit processCommandFinishedEvent$lambda$4(ShellCommandManager this$0, StartedCommand $startedCommand, int $exitCode) {
/*  90 */     this$0.fireCommandFinished($startedCommand, $exitCode);
/*  91 */     this$0.startedCommand = null;
/*  92 */     return Unit.INSTANCE;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void processPromptStateUpdatedEvent(List event) {
/* 110 */     Intrinsics.checkNotNullExpressionValue(this.shellIntegration.getShellType().toString().toLowerCase(Locale.ROOT), "toLowerCase(...)"); TerminalPromptState state = new TerminalPromptState(Param.CURRENT_DIRECTORY.getDecodedValue((String)CollectionsKt.getOrNull(event, 1)), Param.USER_NAME.getDecodedNotEmptyValueOrNull((String)CollectionsKt.getOrNull(event, 2)), Param.USER_HOME.getDecodedNotEmptyValueOrNull((String)CollectionsKt.getOrNull(event, 3)), Param.GIT_BRANCH.getDecodedNotEmptyValueOrNull((String)CollectionsKt.getOrNull(event, 4)), Param.VIRTUAL_ENV.getDecodedNotEmptyValueOrNull((String)CollectionsKt.getOrNull(event, 5)), Param.CONDA_ENV.getDecodedNotEmptyValueOrNull((String)CollectionsKt.getOrNull(event, 6)), Param.ORIGINAL_PROMPT.getDecodedNotEmptyValueOrNull((String)CollectionsKt.getOrNull(event, 7)), Param.ORIGINAL_RIGHT_PROMPT.getDecodedNotEmptyValueOrNull((String)CollectionsKt.getOrNull(event, 8)), this.shellIntegration.getShellType().toString().toLowerCase(Locale.ROOT));
/*     */     
/* 112 */     firePromptStateUpdated(state);
/*     */   }
/*     */   
/*     */   private final void processCommandHistoryEvent(List event) {
/* 116 */     String history = Param.HISTORY_STRING.getDecodedValue((String)CollectionsKt.getOrNull(event, 1));
/* 117 */     fireCommandHistoryReceived(history);
/*     */   }
/*     */ 
/*     */   
/*     */   private final void processGeneratorFinishedEvent(List event) {
/*     */     // Byte code:
/*     */     //   0: getstatic com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Param.REQUEST_ID : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Param;
/*     */     //   3: aload_1
/*     */     //   4: iconst_1
/*     */     //   5: invokestatic getOrNull : (Ljava/util/List;I)Ljava/lang/Object;
/*     */     //   8: checkcast java/lang/String
/*     */     //   11: invokevirtual getIntValue : (Ljava/lang/String;)I
/*     */     //   14: istore_2
/*     */     //   15: getstatic com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Param.RESULT : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Param;
/*     */     //   18: aload_1
/*     */     //   19: iconst_2
/*     */     //   20: invokestatic getOrNull : (Ljava/util/List;I)Ljava/lang/Object;
/*     */     //   23: checkcast java/lang/String
/*     */     //   26: invokevirtual getDecodedValue : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   29: astore_3
/*     */     //   30: getstatic com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Param.EXIT_CODE : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Param;
/*     */     //   33: aload_1
/*     */     //   34: iconst_3
/*     */     //   35: invokestatic getOrNull : (Ljava/util/List;I)Ljava/lang/Object;
/*     */     //   38: checkcast java/lang/String
/*     */     //   41: invokevirtual getIntValue : (Ljava/lang/String;)I
/*     */     //   44: istore #4
/*     */     //   46: aload_0
/*     */     //   47: getfield commandEndMarker : Ljava/lang/String;
/*     */     //   50: ifnull -> 134
/*     */     //   53: getstatic com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Companion;
/*     */     //   56: astore #5
/*     */     //   58: aconst_null
/*     */     //   59: astore #6
/*     */     //   61: iconst_0
/*     */     //   62: istore #7
/*     */     //   64: aload #5
/*     */     //   66: invokevirtual getLOG$ej_core : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   69: astore #8
/*     */     //   71: iconst_0
/*     */     //   72: istore #9
/*     */     //   74: aload #8
/*     */     //   76: invokevirtual isDebugEnabled : ()Z
/*     */     //   79: ifeq -> 100
/*     */     //   82: aload #8
/*     */     //   84: astore #11
/*     */     //   86: iconst_0
/*     */     //   87: istore #10
/*     */     //   89: ldc_w 'Received generator_finished event, waiting for command end marker'
/*     */     //   92: aload #11
/*     */     //   94: swap
/*     */     //   95: aload #6
/*     */     //   97: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   100: nop
/*     */     //   101: nop
/*     */     //   102: new com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandEndMarkerListener
/*     */     //   105: dup
/*     */     //   106: aload_0
/*     */     //   107: getfield terminalTextBuffer : Lcom/jediterm/terminal/model/TerminalTextBuffer;
/*     */     //   110: aload_0
/*     */     //   111: getfield commandEndMarker : Ljava/lang/String;
/*     */     //   114: aload_0
/*     */     //   115: getfield parentDisposable : Lcom/intellij/openapi/Disposable;
/*     */     //   118: aload_0
/*     */     //   119: iload_2
/*     */     //   120: aload_3
/*     */     //   121: iload #4
/*     */     //   123: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager;ILjava/lang/String;I)Lkotlin/jvm/functions/Function0;
/*     */     //   128: invokespecial <init> : (Lcom/jediterm/terminal/model/TerminalTextBuffer;Ljava/lang/String;Lcom/intellij/openapi/Disposable;Lkotlin/jvm/functions/Function0;)V
/*     */     //   131: goto -> 145
/*     */     //   134: aload_0
/*     */     //   135: iload_2
/*     */     //   136: aload_3
/*     */     //   137: iload #4
/*     */     //   139: invokespecial fireGeneratorFinished : (ILjava/lang/String;I)V
/*     */     //   142: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   145: pop
/*     */     //   146: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #121	-> 0
/*     */     //   #122	-> 15
/*     */     //   #123	-> 30
/*     */     //   #124	-> 46
/*     */     //   #125	-> 53
/*     */     //   #321	-> 58
/*     */     //   #322	-> 64
/*     */     //   #323	-> 74
/*     */     //   #324	-> 82
/*     */     //   #125	-> 89
/*     */     //   #324	-> 95
/*     */     //   #326	-> 100
/*     */     //   #327	-> 101
/*     */     //   #126	-> 102
/*     */     //   #131	-> 134
/*     */     //   #133	-> 146
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   89	3	10	$i$a$-debug$ej_core$default-ShellCommandManager$processGeneratorFinishedEvent$1	I
/*     */     //   74	27	9	$i$f$debug	I
/*     */     //   71	30	8	$this$debug$iv$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   64	38	7	$i$f$debug$ej_core	I
/*     */     //   58	44	5	$this$iv	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Companion;
/*     */     //   61	41	6	e$iv	Ljava/lang/Exception;
/*     */     //   15	132	2	requestId	I
/*     */     //   30	117	3	result	Ljava/lang/String;
/*     */     //   46	101	4	exitCode	I
/*     */     //   0	147	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager;
/*     */     //   0	147	1	event	Ljava/util/List;
/*     */   }
/*     */ 
/*     */   
/*     */   private static final Unit processGeneratorFinishedEvent$lambda$6(ShellCommandManager this$0, int $requestId, String $result, int $exitCode) {
/* 127 */     this$0.fireGeneratorFinished($requestId, $result, $exitCode);
/* 128 */     return Unit.INSTANCE;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void clearTerminal() {
/*     */     // Byte code:
/*     */     //   0: getstatic com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Companion;
/*     */     //   3: astore_1
/*     */     //   4: aconst_null
/*     */     //   5: astore_2
/*     */     //   6: iconst_0
/*     */     //   7: istore_3
/*     */     //   8: aload_1
/*     */     //   9: invokevirtual getLOG$ej_core : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   12: astore #4
/*     */     //   14: iconst_0
/*     */     //   15: istore #5
/*     */     //   17: aload #4
/*     */     //   19: invokevirtual isDebugEnabled : ()Z
/*     */     //   22: ifeq -> 42
/*     */     //   25: aload #4
/*     */     //   27: astore #7
/*     */     //   29: iconst_0
/*     */     //   30: istore #6
/*     */     //   32: ldc_w 'force clearing terminal'
/*     */     //   35: aload #7
/*     */     //   37: swap
/*     */     //   38: aload_2
/*     */     //   39: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   42: nop
/*     */     //   43: nop
/*     */     //   44: getstatic com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel$Companion;
/*     */     //   47: aload_0
/*     */     //   48: getfield terminal : Lcom/jediterm/terminal/Terminal;
/*     */     //   51: invokevirtual clearAllAndMoveCursorToTopLeftCorner$ej_core : (Lcom/jediterm/terminal/Terminal;)V
/*     */     //   54: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #148	-> 0
/*     */     //   #328	-> 4
/*     */     //   #329	-> 8
/*     */     //   #330	-> 17
/*     */     //   #331	-> 25
/*     */     //   #148	-> 32
/*     */     //   #331	-> 38
/*     */     //   #333	-> 42
/*     */     //   #334	-> 43
/*     */     //   #149	-> 44
/*     */     //   #150	-> 54
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   32	3	6	$i$a$-debug$ej_core$default-ShellCommandManager$clearTerminal$1	I
/*     */     //   17	26	5	$i$f$debug	I
/*     */     //   14	29	4	$this$debug$iv$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   8	36	3	$i$f$debug$ej_core	I
/*     */     //   4	40	1	$this$iv	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Companion;
/*     */     //   6	38	2	e$iv	Ljava/lang/Exception;
/*     */     //   0	55	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void fireInitialized(String rawShellInfo) {
/*     */     // Byte code:
/*     */     //   0: getstatic com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Companion;
/*     */     //   3: astore_2
/*     */     //   4: aconst_null
/*     */     //   5: astore_3
/*     */     //   6: iconst_0
/*     */     //   7: istore #4
/*     */     //   9: aload_2
/*     */     //   10: invokevirtual getLOG$ej_core : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   13: astore #5
/*     */     //   15: iconst_0
/*     */     //   16: istore #6
/*     */     //   18: aload #5
/*     */     //   20: invokevirtual isDebugEnabled : ()Z
/*     */     //   23: ifeq -> 46
/*     */     //   26: aload #5
/*     */     //   28: astore #8
/*     */     //   30: iconst_0
/*     */     //   31: istore #7
/*     */     //   33: aload_1
/*     */     //   34: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   39: aload #8
/*     */     //   41: swap
/*     */     //   42: aload_3
/*     */     //   43: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   46: nop
/*     */     //   47: nop
/*     */     //   48: aload_0
/*     */     //   49: getfield dispatcher : Lcom/intellij/util/EventDispatcher;
/*     */     //   52: invokevirtual getMulticaster : ()Ljava/util/EventListener;
/*     */     //   55: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandListener
/*     */     //   58: aload_1
/*     */     //   59: invokeinterface shellInfoReceived : (Ljava/lang/String;)V
/*     */     //   64: aload_0
/*     */     //   65: getfield dispatcher : Lcom/intellij/util/EventDispatcher;
/*     */     //   68: invokevirtual getMulticaster : ()Ljava/util/EventListener;
/*     */     //   71: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandListener
/*     */     //   74: invokeinterface initialized : ()V
/*     */     //   79: aload_0
/*     */     //   80: invokespecial clearTerminal : ()V
/*     */     //   83: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #153	-> 0
/*     */     //   #335	-> 4
/*     */     //   #336	-> 9
/*     */     //   #337	-> 18
/*     */     //   #338	-> 26
/*     */     //   #153	-> 33
/*     */     //   #338	-> 42
/*     */     //   #340	-> 46
/*     */     //   #341	-> 47
/*     */     //   #154	-> 48
/*     */     //   #155	-> 64
/*     */     //   #156	-> 79
/*     */     //   #157	-> 83
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   33	6	7	$i$a$-debug$ej_core$default-ShellCommandManager$fireInitialized$1	I
/*     */     //   18	29	6	$i$f$debug	I
/*     */     //   15	32	5	$this$debug$iv$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   9	39	4	$i$f$debug$ej_core	I
/*     */     //   4	44	2	$this$iv	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Companion;
/*     */     //   6	42	3	e$iv	Ljava/lang/Exception;
/*     */     //   0	84	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager;
/*     */     //   0	84	1	rawShellInfo	Ljava/lang/String;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void firePromptShown() {
/*     */     // Byte code:
/*     */     //   0: getstatic com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Companion;
/*     */     //   3: astore_1
/*     */     //   4: aconst_null
/*     */     //   5: astore_2
/*     */     //   6: iconst_0
/*     */     //   7: istore_3
/*     */     //   8: aload_1
/*     */     //   9: invokevirtual getLOG$ej_core : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   12: astore #4
/*     */     //   14: iconst_0
/*     */     //   15: istore #5
/*     */     //   17: aload #4
/*     */     //   19: invokevirtual isDebugEnabled : ()Z
/*     */     //   22: ifeq -> 42
/*     */     //   25: aload #4
/*     */     //   27: astore #7
/*     */     //   29: iconst_0
/*     */     //   30: istore #6
/*     */     //   32: ldc_w 'Shell event: prompt_shown'
/*     */     //   35: aload #7
/*     */     //   37: swap
/*     */     //   38: aload_2
/*     */     //   39: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   42: nop
/*     */     //   43: nop
/*     */     //   44: aload_0
/*     */     //   45: getfield dispatcher : Lcom/intellij/util/EventDispatcher;
/*     */     //   48: invokevirtual getMulticaster : ()Ljava/util/EventListener;
/*     */     //   51: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandListener
/*     */     //   54: invokeinterface promptShown : ()V
/*     */     //   59: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #160	-> 0
/*     */     //   #342	-> 4
/*     */     //   #343	-> 8
/*     */     //   #344	-> 17
/*     */     //   #345	-> 25
/*     */     //   #160	-> 32
/*     */     //   #345	-> 38
/*     */     //   #347	-> 42
/*     */     //   #348	-> 43
/*     */     //   #161	-> 44
/*     */     //   #162	-> 59
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   32	3	6	$i$a$-debug$ej_core$default-ShellCommandManager$firePromptShown$1	I
/*     */     //   17	26	5	$i$f$debug	I
/*     */     //   14	29	4	$this$debug$iv$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   8	36	3	$i$f$debug$ej_core	I
/*     */     //   4	40	1	$this$iv	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Companion;
/*     */     //   6	38	2	e$iv	Ljava/lang/Exception;
/*     */     //   0	60	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void fireCommandStarted(StartedCommand startedCommand) {
/*     */     // Byte code:
/*     */     //   0: getstatic com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Companion;
/*     */     //   3: astore_2
/*     */     //   4: aconst_null
/*     */     //   5: astore_3
/*     */     //   6: iconst_0
/*     */     //   7: istore #4
/*     */     //   9: aload_2
/*     */     //   10: invokevirtual getLOG$ej_core : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   13: astore #5
/*     */     //   15: iconst_0
/*     */     //   16: istore #6
/*     */     //   18: aload #5
/*     */     //   20: invokevirtual isDebugEnabled : ()Z
/*     */     //   23: ifeq -> 46
/*     */     //   26: aload #5
/*     */     //   28: astore #8
/*     */     //   30: iconst_0
/*     */     //   31: istore #7
/*     */     //   33: aload_1
/*     */     //   34: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/StartedCommand;)Ljava/lang/String;
/*     */     //   39: aload #8
/*     */     //   41: swap
/*     */     //   42: aload_3
/*     */     //   43: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   46: nop
/*     */     //   47: nop
/*     */     //   48: aload_0
/*     */     //   49: getfield dispatcher : Lcom/intellij/util/EventDispatcher;
/*     */     //   52: invokevirtual getMulticaster : ()Ljava/util/EventListener;
/*     */     //   55: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandListener
/*     */     //   58: aload_1
/*     */     //   59: invokevirtual getCommand : ()Ljava/lang/String;
/*     */     //   62: invokeinterface commandStarted : (Ljava/lang/String;)V
/*     */     //   67: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #165	-> 0
/*     */     //   #349	-> 4
/*     */     //   #350	-> 9
/*     */     //   #351	-> 18
/*     */     //   #352	-> 26
/*     */     //   #165	-> 33
/*     */     //   #352	-> 42
/*     */     //   #354	-> 46
/*     */     //   #355	-> 47
/*     */     //   #166	-> 48
/*     */     //   #167	-> 67
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   33	6	7	$i$a$-debug$ej_core$default-ShellCommandManager$fireCommandStarted$1	I
/*     */     //   18	29	6	$i$f$debug	I
/*     */     //   15	32	5	$this$debug$iv$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   9	39	4	$i$f$debug$ej_core	I
/*     */     //   4	44	2	$this$iv	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Companion;
/*     */     //   6	42	3	e$iv	Ljava/lang/Exception;
/*     */     //   0	68	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager;
/*     */     //   0	68	1	startedCommand	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/StartedCommand;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void fireCommandFinished(StartedCommand startedCommand, int exitCode) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ifnonnull -> 16
/*     */     //   4: getstatic com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager.LOG : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   7: ldc_w 'Shell event: received command_finished without preceding command_started - skipping'
/*     */     //   10: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   13: goto -> 107
/*     */     //   16: new com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/CommandFinishedEvent
/*     */     //   19: dup
/*     */     //   20: aload_1
/*     */     //   21: invokevirtual getCommand : ()Ljava/lang/String;
/*     */     //   24: iload_2
/*     */     //   25: aload_1
/*     */     //   26: invokevirtual getCommandStarted : ()Lkotlin/time/TimeMark;
/*     */     //   29: invokeinterface elapsedNow-UwyO8pc : ()J
/*     */     //   34: aconst_null
/*     */     //   35: invokespecial <init> : (Ljava/lang/String;IJLkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   38: astore_3
/*     */     //   39: getstatic com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Companion;
/*     */     //   42: astore #4
/*     */     //   44: aconst_null
/*     */     //   45: astore #5
/*     */     //   47: iconst_0
/*     */     //   48: istore #6
/*     */     //   50: aload #4
/*     */     //   52: invokevirtual getLOG$ej_core : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   55: astore #7
/*     */     //   57: iconst_0
/*     */     //   58: istore #8
/*     */     //   60: aload #7
/*     */     //   62: invokevirtual isDebugEnabled : ()Z
/*     */     //   65: ifeq -> 89
/*     */     //   68: aload #7
/*     */     //   70: astore #10
/*     */     //   72: iconst_0
/*     */     //   73: istore #9
/*     */     //   75: aload_3
/*     */     //   76: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/CommandFinishedEvent;)Ljava/lang/String;
/*     */     //   81: aload #10
/*     */     //   83: swap
/*     */     //   84: aload #5
/*     */     //   86: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   89: nop
/*     */     //   90: nop
/*     */     //   91: aload_0
/*     */     //   92: getfield dispatcher : Lcom/intellij/util/EventDispatcher;
/*     */     //   95: invokevirtual getMulticaster : ()Ljava/util/EventListener;
/*     */     //   98: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandListener
/*     */     //   101: aload_3
/*     */     //   102: invokeinterface commandFinished : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/CommandFinishedEvent;)V
/*     */     //   107: aload_0
/*     */     //   108: invokespecial clearTerminal : ()V
/*     */     //   111: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #170	-> 0
/*     */     //   #171	-> 4
/*     */     //   #174	-> 16
/*     */     //   #175	-> 39
/*     */     //   #356	-> 44
/*     */     //   #357	-> 50
/*     */     //   #358	-> 60
/*     */     //   #359	-> 68
/*     */     //   #175	-> 75
/*     */     //   #359	-> 84
/*     */     //   #361	-> 89
/*     */     //   #362	-> 90
/*     */     //   #176	-> 91
/*     */     //   #178	-> 107
/*     */     //   #179	-> 111
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   75	6	9	$i$a$-debug$ej_core$default-ShellCommandManager$fireCommandFinished$1	I
/*     */     //   60	30	8	$i$f$debug	I
/*     */     //   57	33	7	$this$debug$iv$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   50	41	6	$i$f$debug$ej_core	I
/*     */     //   44	47	4	$this$iv	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Companion;
/*     */     //   47	44	5	e$iv	Ljava/lang/Exception;
/*     */     //   39	68	3	event	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/CommandFinishedEvent;
/*     */     //   0	112	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager;
/*     */     //   0	112	1	startedCommand	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/StartedCommand;
/*     */     //   0	112	2	exitCode	I
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void firePromptStateUpdated(TerminalPromptState state) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield dispatcher : Lcom/intellij/util/EventDispatcher;
/*     */     //   4: invokevirtual getMulticaster : ()Ljava/util/EventListener;
/*     */     //   7: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandListener
/*     */     //   10: aload_1
/*     */     //   11: invokeinterface promptStateUpdated : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptState;)V
/*     */     //   16: getstatic com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Companion;
/*     */     //   19: astore_2
/*     */     //   20: aconst_null
/*     */     //   21: astore_3
/*     */     //   22: iconst_0
/*     */     //   23: istore #4
/*     */     //   25: aload_2
/*     */     //   26: invokevirtual getLOG$ej_core : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   29: astore #5
/*     */     //   31: iconst_0
/*     */     //   32: istore #6
/*     */     //   34: aload #5
/*     */     //   36: invokevirtual isDebugEnabled : ()Z
/*     */     //   39: ifeq -> 62
/*     */     //   42: aload #5
/*     */     //   44: astore #8
/*     */     //   46: iconst_0
/*     */     //   47: istore #7
/*     */     //   49: aload_1
/*     */     //   50: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptState;)Ljava/lang/String;
/*     */     //   55: aload #8
/*     */     //   57: swap
/*     */     //   58: aload_3
/*     */     //   59: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   62: nop
/*     */     //   63: nop
/*     */     //   64: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #182	-> 0
/*     */     //   #183	-> 16
/*     */     //   #363	-> 20
/*     */     //   #364	-> 25
/*     */     //   #365	-> 34
/*     */     //   #366	-> 42
/*     */     //   #183	-> 49
/*     */     //   #366	-> 58
/*     */     //   #368	-> 62
/*     */     //   #369	-> 63
/*     */     //   #184	-> 64
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   49	6	7	$i$a$-debug$ej_core$default-ShellCommandManager$firePromptStateUpdated$1	I
/*     */     //   34	29	6	$i$f$debug	I
/*     */     //   31	32	5	$this$debug$iv$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   25	39	4	$i$f$debug$ej_core	I
/*     */     //   20	44	2	$this$iv	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Companion;
/*     */     //   22	42	3	e$iv	Ljava/lang/Exception;
/*     */     //   0	65	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager;
/*     */     //   0	65	1	state	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptState;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void fireCommandHistoryReceived(String history) {
/*     */     // Byte code:
/*     */     //   0: getstatic com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Companion;
/*     */     //   3: astore_2
/*     */     //   4: aconst_null
/*     */     //   5: astore_3
/*     */     //   6: iconst_0
/*     */     //   7: istore #4
/*     */     //   9: aload_2
/*     */     //   10: invokevirtual getLOG$ej_core : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   13: astore #5
/*     */     //   15: iconst_0
/*     */     //   16: istore #6
/*     */     //   18: aload #5
/*     */     //   20: invokevirtual isDebugEnabled : ()Z
/*     */     //   23: ifeq -> 49
/*     */     //   26: aload #5
/*     */     //   28: astore #8
/*     */     //   30: iconst_0
/*     */     //   31: istore #7
/*     */     //   33: aload_1
/*     */     //   34: invokevirtual length : ()I
/*     */     //   37: <illegal opcode> makeConcatWithConstants : (I)Ljava/lang/String;
/*     */     //   42: aload #8
/*     */     //   44: swap
/*     */     //   45: aload_3
/*     */     //   46: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   49: nop
/*     */     //   50: nop
/*     */     //   51: aload_0
/*     */     //   52: getfield dispatcher : Lcom/intellij/util/EventDispatcher;
/*     */     //   55: invokevirtual getMulticaster : ()Ljava/util/EventListener;
/*     */     //   58: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandListener
/*     */     //   61: aload_1
/*     */     //   62: invokeinterface commandHistoryReceived : (Ljava/lang/String;)V
/*     */     //   67: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #187	-> 0
/*     */     //   #370	-> 4
/*     */     //   #371	-> 9
/*     */     //   #372	-> 18
/*     */     //   #373	-> 26
/*     */     //   #187	-> 33
/*     */     //   #373	-> 45
/*     */     //   #375	-> 49
/*     */     //   #376	-> 50
/*     */     //   #188	-> 51
/*     */     //   #189	-> 67
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   33	9	7	$i$a$-debug$ej_core$default-ShellCommandManager$fireCommandHistoryReceived$1	I
/*     */     //   18	32	6	$i$f$debug	I
/*     */     //   15	35	5	$this$debug$iv$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   9	42	4	$i$f$debug$ej_core	I
/*     */     //   4	47	2	$this$iv	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Companion;
/*     */     //   6	45	3	e$iv	Ljava/lang/Exception;
/*     */     //   0	68	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager;
/*     */     //   0	68	1	history	Ljava/lang/String;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void fireShellEditorBufferReported(List event) {
/*     */     // Byte code:
/*     */     //   0: getstatic com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Param.SHELL_EDITOR_BUFFER : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Param;
/*     */     //   3: aload_1
/*     */     //   4: iconst_1
/*     */     //   5: invokestatic getOrNull : (Ljava/util/List;I)Ljava/lang/Object;
/*     */     //   8: checkcast java/lang/String
/*     */     //   11: invokevirtual getDecodedValue : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   14: astore_2
/*     */     //   15: getstatic com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Companion;
/*     */     //   18: astore_3
/*     */     //   19: aconst_null
/*     */     //   20: astore #4
/*     */     //   22: iconst_0
/*     */     //   23: istore #5
/*     */     //   25: aload_3
/*     */     //   26: invokevirtual getLOG$ej_core : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   29: astore #6
/*     */     //   31: iconst_0
/*     */     //   32: istore #7
/*     */     //   34: aload #6
/*     */     //   36: invokevirtual isDebugEnabled : ()Z
/*     */     //   39: ifeq -> 66
/*     */     //   42: aload #6
/*     */     //   44: astore #9
/*     */     //   46: iconst_0
/*     */     //   47: istore #8
/*     */     //   49: aload_2
/*     */     //   50: invokevirtual length : ()I
/*     */     //   53: <illegal opcode> makeConcatWithConstants : (I)Ljava/lang/String;
/*     */     //   58: aload #9
/*     */     //   60: swap
/*     */     //   61: aload #4
/*     */     //   63: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   66: nop
/*     */     //   67: nop
/*     */     //   68: aload_0
/*     */     //   69: getfield dispatcher : Lcom/intellij/util/EventDispatcher;
/*     */     //   72: invokevirtual getMulticaster : ()Ljava/util/EventListener;
/*     */     //   75: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandListener
/*     */     //   78: aload_2
/*     */     //   79: invokeinterface commandBufferReceived : (Ljava/lang/String;)V
/*     */     //   84: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #192	-> 0
/*     */     //   #193	-> 15
/*     */     //   #377	-> 19
/*     */     //   #378	-> 25
/*     */     //   #379	-> 34
/*     */     //   #380	-> 42
/*     */     //   #193	-> 49
/*     */     //   #380	-> 61
/*     */     //   #382	-> 66
/*     */     //   #383	-> 67
/*     */     //   #194	-> 68
/*     */     //   #195	-> 84
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   49	9	8	$i$a$-debug$ej_core$default-ShellCommandManager$fireShellEditorBufferReported$1	I
/*     */     //   34	33	7	$i$f$debug	I
/*     */     //   31	36	6	$this$debug$iv$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   25	43	5	$i$f$debug$ej_core	I
/*     */     //   19	49	3	$this$iv	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Companion;
/*     */     //   22	46	4	e$iv	Ljava/lang/Exception;
/*     */     //   15	70	2	buffer	Ljava/lang/String;
/*     */     //   0	85	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager;
/*     */     //   0	85	1	event	Ljava/util/List;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void fireGeneratorFinished(int requestId, String result, int exitCode) {
/*     */     // Byte code:
/*     */     //   0: getstatic com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Companion;
/*     */     //   3: astore #4
/*     */     //   5: aconst_null
/*     */     //   6: astore #5
/*     */     //   8: iconst_0
/*     */     //   9: istore #6
/*     */     //   11: aload #4
/*     */     //   13: invokevirtual getLOG$ej_core : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   16: astore #7
/*     */     //   18: iconst_0
/*     */     //   19: istore #8
/*     */     //   21: aload #7
/*     */     //   23: invokevirtual isDebugEnabled : ()Z
/*     */     //   26: ifeq -> 54
/*     */     //   29: aload #7
/*     */     //   31: astore #10
/*     */     //   33: iconst_0
/*     */     //   34: istore #9
/*     */     //   36: iload_1
/*     */     //   37: aload_2
/*     */     //   38: invokevirtual length : ()I
/*     */     //   41: <illegal opcode> makeConcatWithConstants : (II)Ljava/lang/String;
/*     */     //   46: aload #10
/*     */     //   48: swap
/*     */     //   49: aload #5
/*     */     //   51: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   54: nop
/*     */     //   55: nop
/*     */     //   56: aload_0
/*     */     //   57: getfield dispatcher : Lcom/intellij/util/EventDispatcher;
/*     */     //   60: invokevirtual getMulticaster : ()Ljava/util/EventListener;
/*     */     //   63: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandListener
/*     */     //   66: new com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/GeneratorFinishedEvent
/*     */     //   69: dup
/*     */     //   70: iload_1
/*     */     //   71: aload_2
/*     */     //   72: iload_3
/*     */     //   73: invokespecial <init> : (ILjava/lang/String;I)V
/*     */     //   76: invokeinterface generatorFinished : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/GeneratorFinishedEvent;)V
/*     */     //   81: aload_0
/*     */     //   82: invokespecial clearTerminal : ()V
/*     */     //   85: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #198	-> 0
/*     */     //   #384	-> 5
/*     */     //   #385	-> 11
/*     */     //   #386	-> 21
/*     */     //   #387	-> 29
/*     */     //   #198	-> 36
/*     */     //   #387	-> 49
/*     */     //   #389	-> 54
/*     */     //   #390	-> 55
/*     */     //   #199	-> 56
/*     */     //   #200	-> 81
/*     */     //   #201	-> 85
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   36	10	9	$i$a$-debug$ej_core$default-ShellCommandManager$fireGeneratorFinished$1	I
/*     */     //   21	34	8	$i$f$debug	I
/*     */     //   18	37	7	$this$debug$iv$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   11	45	6	$i$f$debug$ej_core	I
/*     */     //   5	51	4	$this$iv	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Companion;
/*     */     //   8	48	5	e$iv	Ljava/lang/Exception;
/*     */     //   0	86	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager;
/*     */     //   0	86	1	requestId	I
/*     */     //   0	86	2	result	Ljava/lang/String;
/*     */     //   0	86	3	exitCode	I
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void fireClearInvoked() {
/*     */     // Byte code:
/*     */     //   0: getstatic com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Companion;
/*     */     //   3: astore_1
/*     */     //   4: aconst_null
/*     */     //   5: astore_2
/*     */     //   6: iconst_0
/*     */     //   7: istore_3
/*     */     //   8: aload_1
/*     */     //   9: invokevirtual getLOG$ej_core : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   12: astore #4
/*     */     //   14: iconst_0
/*     */     //   15: istore #5
/*     */     //   17: aload #4
/*     */     //   19: invokevirtual isDebugEnabled : ()Z
/*     */     //   22: ifeq -> 42
/*     */     //   25: aload #4
/*     */     //   27: astore #7
/*     */     //   29: iconst_0
/*     */     //   30: istore #6
/*     */     //   32: ldc_w 'Shell event: clear_invoked'
/*     */     //   35: aload #7
/*     */     //   37: swap
/*     */     //   38: aload_2
/*     */     //   39: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   42: nop
/*     */     //   43: nop
/*     */     //   44: aload_0
/*     */     //   45: getfield dispatcher : Lcom/intellij/util/EventDispatcher;
/*     */     //   48: invokevirtual getMulticaster : ()Ljava/util/EventListener;
/*     */     //   51: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandListener
/*     */     //   54: invokeinterface clearInvoked : ()V
/*     */     //   59: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #204	-> 0
/*     */     //   #391	-> 4
/*     */     //   #392	-> 8
/*     */     //   #393	-> 17
/*     */     //   #394	-> 25
/*     */     //   #204	-> 32
/*     */     //   #394	-> 38
/*     */     //   #396	-> 42
/*     */     //   #397	-> 43
/*     */     //   #205	-> 44
/*     */     //   #206	-> 59
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   32	3	6	$i$a$-debug$ej_core$default-ShellCommandManager$fireClearInvoked$1	I
/*     */     //   17	26	5	$i$f$debug	I
/*     */     //   14	29	4	$this$debug$iv$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   8	36	3	$i$f$debug$ej_core	I
/*     */     //   4	40	1	$this$iv	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Companion;
/*     */     //   6	38	2	e$iv	Ljava/lang/Exception;
/*     */     //   0	60	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void addListener(@NotNull ShellCommandListener listener, @NotNull Disposable parentDisposable)
/*     */   {
/* 209 */     Intrinsics.checkNotNullParameter(listener, "listener"); Intrinsics.checkNotNullParameter(parentDisposable, "parentDisposable"); this.dispatcher.addListener(listener, parentDisposable); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\020\016\n\002\030\002\n\002\b\004\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J6\020\b\032\0020\t2\020\b\002\020\n\032\n\030\0010\013j\004\030\001`\f2\021\020\r\032\r\022\t\022\0070\017¢\006\002\b\0200\016H\bø\001\000¢\006\002\b\021J\020\020\022\032\0020\0172\006\020\023\032\0020\017H\002R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\006\020\007\002\007\n\005\b20\001¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Companion;", "", "<init>", "()V", "LOG", "Lcom/intellij/openapi/diagnostic/Logger;", "getLOG$ej_core", "()Lcom/intellij/openapi/diagnostic/Logger;", "debug", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "lazyMessage", "Lkotlin/Function0;", "", "Lorg/jetbrains/annotations/NonNls;", "debug$ej_core", "decodeHex", "hexStr", "ej-core"})
/*     */   @SourceDebugExtension({"SMAP\nShellCommandManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShellCommandManager.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Companion\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,306:1\n62#2,4:307\n*S KotlinDebug\n*F\n+ 1 ShellCommandManager.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Companion\n*L\n216#1:307,4\n*E\n"})
/*     */   public static final class Companion { private Companion() {} @NotNull
/*     */     public final Logger getLOG$ej_core() {
/* 213 */       return ShellCommandManager.LOG;
/*     */     }
/*     */     public final void debug$ej_core(@Nullable Exception e, @NotNull Function0 lazyMessage) {
/* 216 */       Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage"); int $i$f$debug$ej_core = 0; Logger $this$debug$iv = getLOG$ej_core(); int $i$f$debug = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 307 */       if ($this$debug$iv.isDebugEnabled()) {
/* 308 */         $this$debug$iv.debug((String)lazyMessage.invoke(), e);
/*     */       }
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private final String decodeHex(String hexStr) throws IllegalArgumentException {
/*     */       byte[] bytes = HexFormat.of().parseHex(hexStr);
/*     */       Intrinsics.checkNotNull(bytes);
/*     */       return new String(bytes, Charsets.UTF_8);
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   private final String commandEndMarker;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private final Terminal terminal;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private final ShellIntegration shellIntegration;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private final Disposable parentDisposable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private final TerminalTextBuffer terminalTextBuffer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private final EventDispatcher<ShellCommandListener> dispatcher;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   private volatile StartedCommand startedCommand;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static
/*     */   {
/*     */     int $i$f$logger = 0;
/* 398 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(ShellCommandManager.class), "getInstance(...)"); } @NotNull private static final Logger LOG = Logger.getInstance(ShellCommandManager.class);
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\020\n\002\b\022\n\002\020\016\n\002\b\002\n\002\020\b\n\002\b\t\b\002\030\0002\b\022\004\022\0020\0000\001B\t\b\002¢\006\004\b\002\020\003J\b\020\025\032\0020\024H\002J\020\020\026\032\0020\0272\b\020\030\032\004\030\0010\024J\020\020\031\032\0020\0242\b\020\030\032\004\030\0010\024J\022\020\032\032\004\030\0010\0242\b\020\030\032\004\030\0010\024J\022\020\033\032\004\030\0010\0242\b\020\030\032\004\030\0010\024J\024\020\034\032\004\030\0010\0242\b\020\030\032\004\030\0010\024H\002J\023\020\035\032\002H\036\"\004\b\000\020\036H\002¢\006\002\020\037R\016\020\023\032\0020\024X\004¢\006\002\n\000j\002\b\004j\002\b\005j\002\b\006j\002\b\007j\002\b\bj\002\b\tj\002\b\nj\002\b\013j\002\b\fj\002\b\rj\002\b\016j\002\b\017j\002\b\020j\002\b\021j\002\b\022¨\006 "}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Param;", "", "<init>", "(Ljava/lang/String;I)V", "EXIT_CODE", "COMMAND", "HISTORY_STRING", "REQUEST_ID", "RESULT", "CURRENT_DIRECTORY", "USER_NAME", "USER_HOME", "GIT_BRANCH", "VIRTUAL_ENV", "CONDA_ENV", "SHELL_EDITOR_BUFFER", "ORIGINAL_PROMPT", "ORIGINAL_RIGHT_PROMPT", "SHELL_INFO", "paramNameWithSeparator", "", "paramName", "getIntValue", "", "nameAndValue", "getDecodedValue", "getDecodedNotEmptyValueOrNull", "getDecodedValueOrNull", "getValueOrNull", "fail", "T", "()Ljava/lang/Object;", "ej-core"})
/*     */   @SourceDebugExtension({"SMAP\nShellCommandManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShellCommandManager.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager$Param\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,306:1\n1#2:307\n*E\n"})
/*     */   private enum Param {
/*     */     EXIT_CODE, COMMAND, HISTORY_STRING, REQUEST_ID, RESULT, CURRENT_DIRECTORY, USER_NAME, USER_HOME, GIT_BRANCH, VIRTUAL_ENV, CONDA_ENV, SHELL_EDITOR_BUFFER, ORIGINAL_PROMPT, ORIGINAL_RIGHT_PROMPT, SHELL_INFO;
/*     */     @NotNull
/*     */     private final String paramNameWithSeparator;
/*     */     
/*     */     Param() {
/*     */       this.paramNameWithSeparator = paramName() + "=";
/*     */     }
/*     */     
/*     */     private final String paramName() {
/*     */       String str = name();
/*     */       Intrinsics.checkNotNullExpressionValue(Locale.ENGLISH, "ENGLISH");
/*     */       Intrinsics.checkNotNullExpressionValue(str.toLowerCase(Locale.ENGLISH), "toLowerCase(...)");
/*     */       return str.toLowerCase(Locale.ENGLISH);
/*     */     }
/*     */     
/*     */     public final int getIntValue(@Nullable String nameAndValue) {
/*     */       StringsKt.toIntOrNull(getValueOrNull(nameAndValue));
/*     */       return (getValueOrNull(nameAndValue) != null && StringsKt.toIntOrNull(getValueOrNull(nameAndValue)) != null) ? StringsKt.toIntOrNull(getValueOrNull(nameAndValue)).intValue() : ((Number)fail()).intValue();
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String getDecodedValue(@Nullable String nameAndValue) {
/*     */       if (getDecodedValueOrNull(nameAndValue) == null)
/*     */         getDecodedValueOrNull(nameAndValue); 
/*     */       return fail();
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final String getDecodedNotEmptyValueOrNull(@Nullable String nameAndValue) {
/*     */       String str1 = getDecodedValueOrNull(nameAndValue), it = str1;
/*     */       int $i$a$-takeIf-ShellCommandManager$Param$getDecodedNotEmptyValueOrNull$1 = 0;
/*     */       getDecodedValueOrNull(nameAndValue);
/*     */       return (getDecodedValueOrNull(nameAndValue) != null) ? (((((CharSequence)it).length() > 0)) ? str1 : null) : null;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final String getDecodedValueOrNull(@Nullable String nameAndValue) {
/*     */       String encodedValue;
/*     */       if (getValueOrNull(nameAndValue) == null) {
/*     */         getValueOrNull(nameAndValue);
/*     */         return null;
/*     */       } 
/*     */       return ShellCommandManager.Companion.decodeHex(encodedValue);
/*     */     }
/*     */     
/*     */     private final String getValueOrNull(String nameAndValue) {
/*     */       if (nameAndValue != null) {
/*     */         String str1 = nameAndValue, it = str1;
/*     */         int $i$a$-takeIf-ShellCommandManager$Param$getValueOrNull$1 = 0;
/*     */         if ((StringsKt.startsWith$default(it, this.paramNameWithSeparator, false, 2, null) ? str1 : null) != null) {
/*     */           Intrinsics.checkNotNullExpressionValue((StringsKt.startsWith$default(it, this.paramNameWithSeparator, false, 2, null) ? str1 : null).substring(this.paramNameWithSeparator.length()), "substring(...)");
/*     */           return (StringsKt.startsWith$default(it, this.paramNameWithSeparator, false, 2, null) ? str1 : null).substring(this.paramNameWithSeparator.length());
/*     */         } 
/*     */       } 
/*     */       StringsKt.startsWith$default(it, this.paramNameWithSeparator, false, 2, null) ? str1 : null;
/*     */       return null;
/*     */     }
/*     */     
/*     */     private final <T> T fail() {
/*     */       throw new IllegalStateException("Cannot parse " + paramName());
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public static EnumEntries<Param> getEntries() {
/*     */       return $ENTRIES;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\session\ShellCommandManager.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */