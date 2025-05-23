package com.intellij.ml.llm.matterhorn.ej.core.terminal;

import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.BlockTerminalSession;
import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.ShellCommandOutputListener;
import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.StyledCommandOutput;
import com.jediterm.terminal.model.TerminalTextBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$2", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandOutputListener;", "commandOutputChanged", "", "output", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/StyledCommandOutput;", "ej-core"})
@SourceDebugExtension({"SMAP\nBlockTerminalShellExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockTerminalShellExecutor.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$2\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,342:1\n24#2:343\n61#2,5:344\n*S KotlinDebug\n*F\n+ 1 BlockTerminalShellExecutor.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$2\n*L\n290#1:343\n290#1:344,5\n*E\n"})
public final class BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$2 implements ShellCommandOutputListener {
  BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$2(TerminalTextBuffer $textBuffer, BlockTerminalSession $session) {}
  
  public void commandOutputChanged(StyledCommandOutput output) {
    // Byte code:
    //   0: aload_1
    //   1: ldc 'output'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;
    //   10: invokevirtual getOutputFlow : ()Lkotlinx/coroutines/flow/MutableStateFlow;
    //   13: aload_1
    //   14: invokevirtual getText : ()Ljava/lang/String;
    //   17: invokeinterface tryEmit : (Ljava/lang/Object;)Z
    //   22: pop
    //   23: aload_1
    //   24: invokevirtual getText : ()Ljava/lang/String;
    //   27: astore_2
    //   28: aload_2
    //   29: checkcast java/lang/CharSequence
    //   32: invokestatic countNewLines : (Ljava/lang/CharSequence;)I
    //   35: istore_3
    //   36: iload_3
    //   37: aload_0
    //   38: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;
    //   41: invokestatic access$getOutputLinesLimit$p : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;)I
    //   44: if_icmpge -> 66
    //   47: aload_0
    //   48: getfield $textBuffer : Lcom/jediterm/terminal/model/TerminalTextBuffer;
    //   51: invokevirtual getHistoryLinesCount : ()I
    //   54: iconst_1
    //   55: iadd
    //   56: aload_0
    //   57: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;
    //   60: invokestatic access$getHistoryLinesLimit$p : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;)I
    //   63: if_icmplt -> 70
    //   66: iconst_1
    //   67: goto -> 71
    //   70: iconst_0
    //   71: istore #4
    //   73: iload #4
    //   75: ifeq -> 243
    //   78: aload_0
    //   79: astore #5
    //   81: iconst_0
    //   82: istore #6
    //   84: ldc com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$2
    //   86: invokestatic getInstance : (Ljava/lang/Class;)Lcom/intellij/openapi/diagnostic/Logger;
    //   89: dup
    //   90: ldc 'getInstance(...)'
    //   92: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   95: astore #5
    //   97: aload_0
    //   98: getfield $textBuffer : Lcom/jediterm/terminal/model/TerminalTextBuffer;
    //   101: astore #7
    //   103: aload_0
    //   104: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;
    //   107: astore #8
    //   109: aconst_null
    //   110: astore #6
    //   112: iconst_0
    //   113: istore #9
    //   115: aload #5
    //   117: invokevirtual isDebugEnabled : ()Z
    //   120: ifeq -> 173
    //   123: aload #5
    //   125: astore #13
    //   127: iconst_0
    //   128: istore #10
    //   130: aload #7
    //   132: invokevirtual getHistoryLinesCount : ()I
    //   135: istore #11
    //   137: aload #7
    //   139: invokevirtual getScreenLinesCount : ()I
    //   142: istore #12
    //   144: aload #8
    //   146: aload_2
    //   147: invokestatic access$toDebug : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;Ljava/lang/String;)Ljava/lang/String;
    //   150: iload_3
    //   151: aload #8
    //   153: invokestatic access$getHistoryLinesLimit$p : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;)I
    //   156: iload #11
    //   158: iload #12
    //   160: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;IIII)Ljava/lang/String;
    //   165: aload #13
    //   167: swap
    //   168: aload #6
    //   170: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   173: nop
    //   174: aload_0
    //   175: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;
    //   178: aload_2
    //   179: invokestatic access$normalizeActualOutput : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;Ljava/lang/String;)Ljava/lang/String;
    //   182: getstatic com/intellij/ml/llm/matterhorn/ShellExecutor$Companion$CompletionStatus.LINE_LIMIT_EXCEEDED : Lcom/intellij/ml/llm/matterhorn/ShellExecutor$Companion$CompletionStatus;
    //   185: invokevirtual getAgentMessage : ()Ljava/lang/String;
    //   188: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   193: astore #5
    //   195: aload_0
    //   196: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;
    //   199: invokevirtual getPromisedResult : ()Lkotlinx/coroutines/CompletableDeferred;
    //   202: new com/intellij/ml/llm/matterhorn/ShellExecutor$CommandResult
    //   205: dup
    //   206: aload #5
    //   208: iconst_m1
    //   209: invokespecial <init> : (Ljava/lang/String;I)V
    //   212: invokeinterface complete : (Ljava/lang/Object;)Z
    //   217: pop
    //   218: aload_0
    //   219: getfield $session : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;
    //   222: invokevirtual getTerminalOutputStream$ej_core : ()Lcom/jediterm/terminal/TerminalOutputStream;
    //   225: iconst_1
    //   226: newarray byte
    //   228: astore #6
    //   230: aload #6
    //   232: iconst_0
    //   233: iconst_3
    //   234: bastore
    //   235: aload #6
    //   237: iconst_0
    //   238: invokeinterface sendBytes : ([BZ)V
    //   243: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #283	-> 6
    //   #285	-> 23
    //   #286	-> 28
    //   #287	-> 36
    //   #289	-> 73
    //   #290	-> 78
    //   #343	-> 84
    //   #290	-> 97
    //   #344	-> 109
    //   #345	-> 115
    //   #346	-> 123
    //   #291	-> 130
    //   #292	-> 137
    //   #293	-> 144
    //   #294	-> 150
    //   #295	-> 156
    //   #346	-> 168
    //   #348	-> 173
    //   #299	-> 174
    //   #300	-> 182
    //   #299	-> 193
    //   #301	-> 195
    //   #303	-> 218
    //   #306	-> 243
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   84	11	6	$i$f$thisLogger	I
    //   81	14	5	$this$thisLogger$iv	Ljava/lang/Object;
    //   130	35	10	$i$a$-debug$default-BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$2$commandOutputChanged$1	I
    //   137	28	11	historyLines	I
    //   144	21	12	screenLines	I
    //   115	59	9	$i$f$debug	I
    //   109	65	5	$this$debug_u24default$iv	Lcom/intellij/openapi/diagnostic/Logger;
    //   112	62	6	e$iv	Ljava/lang/Exception;
    //   195	48	5	normalizedText	Ljava/lang/String;
    //   28	216	2	text	Ljava/lang/String;
    //   36	208	3	newLines	I
    //   73	171	4	reachedTheLimit	Z
    //   0	244	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$2;
    //   0	244	1	output	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/StyledCommandOutput;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */