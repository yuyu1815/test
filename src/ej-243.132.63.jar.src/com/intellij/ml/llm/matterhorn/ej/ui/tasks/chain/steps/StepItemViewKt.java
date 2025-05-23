package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model.TaskStep;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\026\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\004\032-\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0052\006\020\007\032\0020\005H\007¢\006\002\020\b¨\006\t"}, d2 = {"Step", "", "step", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep;", "isChainRunning", "", "showPlanAsStep", "isProjectOnVCS", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep;ZZZLandroidx/compose/runtime/Composer;I)V", "ej-ui"})
public final class StepItemViewKt {
  @Composable
  @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
  public static final void Step(@NotNull TaskStep step, boolean isChainRunning, boolean showPlanAsStep, boolean isProjectOnVCS, @Nullable Composer $composer, int $changed) {
    // Byte code:
    //   0: aload_0
    //   1: ldc 'step'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload #4
    //   8: ldc 2071831830
    //   10: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
    //   15: astore #4
    //   17: iload #5
    //   19: istore #6
    //   21: iload #5
    //   23: bipush #6
    //   25: iand
    //   26: ifne -> 50
    //   29: iload #6
    //   31: aload #4
    //   33: aload_0
    //   34: invokeinterface changed : (Ljava/lang/Object;)Z
    //   39: ifeq -> 46
    //   42: iconst_4
    //   43: goto -> 47
    //   46: iconst_2
    //   47: ior
    //   48: istore #6
    //   50: iload #5
    //   52: bipush #48
    //   54: iand
    //   55: ifne -> 81
    //   58: iload #6
    //   60: aload #4
    //   62: iload_1
    //   63: invokeinterface changed : (Z)Z
    //   68: ifeq -> 76
    //   71: bipush #32
    //   73: goto -> 78
    //   76: bipush #16
    //   78: ior
    //   79: istore #6
    //   81: iload #5
    //   83: sipush #384
    //   86: iand
    //   87: ifne -> 115
    //   90: iload #6
    //   92: aload #4
    //   94: iload_2
    //   95: invokeinterface changed : (Z)Z
    //   100: ifeq -> 109
    //   103: sipush #256
    //   106: goto -> 112
    //   109: sipush #128
    //   112: ior
    //   113: istore #6
    //   115: iload #5
    //   117: sipush #3072
    //   120: iand
    //   121: ifne -> 149
    //   124: iload #6
    //   126: aload #4
    //   128: iload_3
    //   129: invokeinterface changed : (Z)Z
    //   134: ifeq -> 143
    //   137: sipush #2048
    //   140: goto -> 146
    //   143: sipush #1024
    //   146: ior
    //   147: istore #6
    //   149: iload #6
    //   151: sipush #1171
    //   154: iand
    //   155: sipush #1170
    //   158: if_icmpne -> 171
    //   161: aload #4
    //   163: invokeinterface getSkipping : ()Z
    //   168: ifne -> 700
    //   171: invokestatic isTraceInProgress : ()Z
    //   174: ifeq -> 187
    //   177: ldc 2071831830
    //   179: iload #6
    //   181: iconst_m1
    //   182: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.Step (StepItemView.kt:8)'
    //   184: invokestatic traceEventStart : (IIILjava/lang/String;)V
    //   187: aload_0
    //   188: astore #7
    //   190: aload #7
    //   192: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Prompt
    //   195: ifeq -> 227
    //   198: aload #4
    //   200: ldc 446591205
    //   202: invokeinterface startReplaceGroup : (I)V
    //   207: aload_0
    //   208: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Prompt
    //   211: aload #4
    //   213: iconst_0
    //   214: invokestatic PromptStep : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Prompt;Landroidx/compose/runtime/Composer;I)V
    //   217: aload #4
    //   219: invokeinterface endReplaceGroup : ()V
    //   224: goto -> 688
    //   227: aload #7
    //   229: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Plan
    //   232: ifeq -> 273
    //   235: aload #4
    //   237: ldc 959467722
    //   239: invokeinterface startReplaceGroup : (I)V
    //   244: iload_2
    //   245: ifeq -> 263
    //   248: aload_0
    //   249: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Plan
    //   252: iload_1
    //   253: aload #4
    //   255: bipush #112
    //   257: iload #6
    //   259: iand
    //   260: invokestatic PlanStep : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Plan;ZLandroidx/compose/runtime/Composer;I)V
    //   263: aload #4
    //   265: invokeinterface endReplaceGroup : ()V
    //   270: goto -> 688
    //   273: aload #7
    //   275: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Info
    //   278: ifeq -> 310
    //   281: aload #4
    //   283: ldc 446595459
    //   285: invokeinterface startReplaceGroup : (I)V
    //   290: aload_0
    //   291: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Info
    //   294: aload #4
    //   296: iconst_0
    //   297: invokestatic InfoStep : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Info;Landroidx/compose/runtime/Composer;I)V
    //   300: aload #4
    //   302: invokeinterface endReplaceGroup : ()V
    //   307: goto -> 688
    //   310: aload #7
    //   312: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Edit
    //   315: ifeq -> 347
    //   318: aload #4
    //   320: ldc 446596707
    //   322: invokeinterface startReplaceGroup : (I)V
    //   327: aload_0
    //   328: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Edit
    //   331: aload #4
    //   333: iconst_0
    //   334: invokestatic EditStep : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Edit;Landroidx/compose/runtime/Composer;I)V
    //   337: aload #4
    //   339: invokeinterface endReplaceGroup : ()V
    //   344: goto -> 688
    //   347: aload #7
    //   349: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Progress
    //   352: ifeq -> 384
    //   355: aload #4
    //   357: ldc 446598087
    //   359: invokeinterface startReplaceGroup : (I)V
    //   364: aload_0
    //   365: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Progress
    //   368: aload #4
    //   370: iconst_0
    //   371: invokestatic ProgressStep : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Progress;Landroidx/compose/runtime/Composer;I)V
    //   374: aload #4
    //   376: invokeinterface endReplaceGroup : ()V
    //   381: goto -> 688
    //   384: aload #7
    //   386: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Test
    //   389: ifeq -> 421
    //   392: aload #4
    //   394: ldc 446599459
    //   396: invokeinterface startReplaceGroup : (I)V
    //   401: aload_0
    //   402: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Test
    //   405: aload #4
    //   407: iconst_0
    //   408: invokestatic TestStep : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Test;Landroidx/compose/runtime/Composer;I)V
    //   411: aload #4
    //   413: invokeinterface endReplaceGroup : ()V
    //   418: goto -> 688
    //   421: aload #7
    //   423: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Build
    //   426: ifeq -> 458
    //   429: aload #4
    //   431: ldc 446600740
    //   433: invokeinterface startReplaceGroup : (I)V
    //   438: aload_0
    //   439: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Build
    //   442: aload #4
    //   444: iconst_0
    //   445: invokestatic BuildStep : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Build;Landroidx/compose/runtime/Composer;I)V
    //   448: aload #4
    //   450: invokeinterface endReplaceGroup : ()V
    //   455: goto -> 688
    //   458: aload #7
    //   460: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Terminal
    //   463: ifeq -> 495
    //   466: aload #4
    //   468: ldc 446602151
    //   470: invokeinterface startReplaceGroup : (I)V
    //   475: aload_0
    //   476: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Terminal
    //   479: aload #4
    //   481: iconst_0
    //   482: invokestatic TerminalStep : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Terminal;Landroidx/compose/runtime/Composer;I)V
    //   485: aload #4
    //   487: invokeinterface endReplaceGroup : ()V
    //   492: goto -> 688
    //   495: aload #7
    //   497: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Stop
    //   500: ifeq -> 532
    //   503: aload #4
    //   505: ldc 446603523
    //   507: invokeinterface startReplaceGroup : (I)V
    //   512: aload_0
    //   513: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Stop
    //   516: aload #4
    //   518: iconst_0
    //   519: invokestatic StopStep : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Stop;Landroidx/compose/runtime/Composer;I)V
    //   522: aload #4
    //   524: invokeinterface endReplaceGroup : ()V
    //   529: goto -> 688
    //   532: aload #7
    //   534: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Report
    //   537: ifeq -> 577
    //   540: aload #4
    //   542: ldc 446604853
    //   544: invokeinterface startReplaceGroup : (I)V
    //   549: aload_0
    //   550: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Report
    //   553: iload_3
    //   554: aload #4
    //   556: bipush #112
    //   558: iload #6
    //   560: bipush #6
    //   562: ishr
    //   563: iand
    //   564: invokestatic ReportStep : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Report;ZLandroidx/compose/runtime/Composer;I)V
    //   567: aload #4
    //   569: invokeinterface endReplaceGroup : ()V
    //   574: goto -> 688
    //   577: aload #7
    //   579: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$ChatResponse
    //   582: ifeq -> 664
    //   585: aload #4
    //   587: ldc 446607274
    //   589: invokeinterface startReplaceGroup : (I)V
    //   594: aload_0
    //   595: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$ChatResponse
    //   598: invokevirtual getName : ()Ljava/lang/String;
    //   601: aload_0
    //   602: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$ChatResponse
    //   605: invokevirtual getDescription : ()Ljava/lang/String;
    //   608: aload_0
    //   609: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$ChatResponse
    //   612: invokevirtual getOnOpenMarkdownInEditorAction : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
    //   615: invokevirtual getName : ()Ljava/lang/String;
    //   618: aload_0
    //   619: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$ChatResponse
    //   622: invokevirtual getOnOpenMarkdownInEditorAction : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
    //   625: invokevirtual getAction : ()Lkotlin/jvm/functions/Function0;
    //   628: aload_0
    //   629: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$ChatResponse
    //   632: invokevirtual getStartNewTaskAction : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
    //   635: invokevirtual getName : ()Ljava/lang/String;
    //   638: aload_0
    //   639: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$ChatResponse
    //   642: invokevirtual getStartNewTaskAction : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
    //   645: invokevirtual getAction : ()Lkotlin/jvm/functions/Function0;
    //   648: aload #4
    //   650: iconst_0
    //   651: invokestatic ChatResponseStep : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
    //   654: aload #4
    //   656: invokeinterface endReplaceGroup : ()V
    //   661: goto -> 688
    //   664: aload #4
    //   666: ldc 446590817
    //   668: invokeinterface startReplaceGroup : (I)V
    //   673: aload #4
    //   675: invokeinterface endReplaceGroup : ()V
    //   680: new kotlin/NoWhenBranchMatchedException
    //   683: dup
    //   684: invokespecial <init> : ()V
    //   687: athrow
    //   688: invokestatic isTraceInProgress : ()Z
    //   691: ifeq -> 707
    //   694: invokestatic traceEventEnd : ()V
    //   697: goto -> 707
    //   700: aload #4
    //   702: invokeinterface skipToGroupEnd : ()V
    //   707: aload #4
    //   709: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
    //   714: dup
    //   715: ifnull -> 737
    //   718: aload_0
    //   719: iload_1
    //   720: iload_2
    //   721: iload_3
    //   722: iload #5
    //   724: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep;ZZZI)Lkotlin/jvm/functions/Function2;
    //   729: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
    //   734: goto -> 738
    //   737: pop
    //   738: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #9	-> 6
    //   #10	-> 187
    //   #11	-> 190
    //   #12	-> 227
    //   #13	-> 273
    //   #14	-> 310
    //   #15	-> 347
    //   #16	-> 384
    //   #17	-> 421
    //   #18	-> 458
    //   #19	-> 495
    //   #20	-> 532
    //   #21	-> 577
    //   #22	-> 594
    //   #23	-> 601
    //   #24	-> 608
    //   #25	-> 618
    //   #26	-> 628
    //   #27	-> 638
    //   #21	-> 651
    //   #10	-> 664
    //   #30	-> 700
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   21	718	6	$dirty	I
    //   0	739	0	step	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep;
    //   0	739	1	isChainRunning	Z
    //   0	739	2	showPlanAsStep	Z
    //   0	739	3	isProjectOnVCS	Z
    //   0	739	4	$composer	Landroidx/compose/runtime/Composer;
    //   0	739	5	$changed	I
  }
  
  private static final Unit Step$lambda$0(TaskStep $step, boolean $isChainRunning, boolean $showPlanAsStep, boolean $isProjectOnVCS, int $$changed, Composer $composer, int $force) {
    Step($step, $isChainRunning, $showPlanAsStep, $isProjectOnVCS, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
    return Unit.INSTANCE;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\StepItemViewKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */