/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt;
/*     */ 
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.components.FileListEntry;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */ @SourceDebugExtension({"SMAP\nPromptArea.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PromptArea.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptAreaKt$JunieFilePickerButton$5\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,472:1\n1225#2,6:473\n*S KotlinDebug\n*F\n+ 1 PromptArea.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptAreaKt$JunieFilePickerButton$5\n*L\n371#1:473,6\n*E\n"})
/*     */ final class PromptAreaKt$JunieFilePickerButton$5
/*     */   implements Function2<Composer, Integer, Unit>
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public final void invoke(Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: iload_2
/*     */     //   1: iconst_3
/*     */     //   2: iand
/*     */     //   3: iconst_2
/*     */     //   4: if_icmpne -> 16
/*     */     //   7: aload_1
/*     */     //   8: invokeinterface getSkipping : ()Z
/*     */     //   13: ifne -> 225
/*     */     //   16: invokestatic isTraceInProgress : ()Z
/*     */     //   19: ifeq -> 31
/*     */     //   22: ldc -1355594709
/*     */     //   24: iload_2
/*     */     //   25: iconst_m1
/*     */     //   26: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.JunieFilePickerButton.<anonymous> (PromptArea.kt:367)'
/*     */     //   28: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   31: aload_0
/*     */     //   32: getfield $getRecentFiles : Lkotlin/jvm/functions/Function0;
/*     */     //   35: invokeinterface invoke : ()Ljava/lang/Object;
/*     */     //   40: checkcast java/util/List
/*     */     //   43: astore_3
/*     */     //   44: aload_0
/*     */     //   45: getfield $getGuidelines : Lkotlin/jvm/functions/Function0;
/*     */     //   48: invokeinterface invoke : ()Ljava/lang/Object;
/*     */     //   53: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/GuidelinesEntry
/*     */     //   56: astore #4
/*     */     //   58: aload_3
/*     */     //   59: aload #4
/*     */     //   61: aload_0
/*     */     //   62: getfield $onFileChosen : Lkotlin/jvm/functions/Function1;
/*     */     //   65: aload_0
/*     */     //   66: getfield $openProjectFilePicker : Lkotlin/jvm/functions/Function0;
/*     */     //   69: aload_0
/*     */     //   70: getfield $onCreateNewGuidelines : Lkotlin/jvm/functions/Function0;
/*     */     //   73: aload_0
/*     */     //   74: getfield $onSelectGuidelines : Lkotlin/jvm/functions/Function1;
/*     */     //   77: aload_1
/*     */     //   78: ldc 1034469803
/*     */     //   80: invokeinterface startReplaceGroup : (I)V
/*     */     //   85: aload_1
/*     */     //   86: astore #6
/*     */     //   88: iconst_0
/*     */     //   89: istore #7
/*     */     //   91: aload_0
/*     */     //   92: getfield $shouldShowFilePickerDialog$delegate : Landroidx/compose/runtime/MutableState;
/*     */     //   95: astore #8
/*     */     //   97: iconst_0
/*     */     //   98: istore #9
/*     */     //   100: aload #6
/*     */     //   102: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   107: astore #10
/*     */     //   109: iconst_0
/*     */     //   110: istore #11
/*     */     //   112: aload #10
/*     */     //   114: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   117: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   120: if_acmpne -> 177
/*     */     //   123: astore #19
/*     */     //   125: astore #18
/*     */     //   127: astore #17
/*     */     //   129: astore #16
/*     */     //   131: astore #15
/*     */     //   133: astore #14
/*     */     //   135: iconst_0
/*     */     //   136: istore #12
/*     */     //   138: aload #8
/*     */     //   140: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function0;
/*     */     //   145: astore #20
/*     */     //   147: aload #14
/*     */     //   149: aload #15
/*     */     //   151: aload #16
/*     */     //   153: aload #17
/*     */     //   155: aload #18
/*     */     //   157: aload #19
/*     */     //   159: aload #20
/*     */     //   161: astore #13
/*     */     //   163: aload #6
/*     */     //   165: aload #13
/*     */     //   167: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   172: aload #13
/*     */     //   174: goto -> 179
/*     */     //   177: aload #10
/*     */     //   179: nop
/*     */     //   180: nop
/*     */     //   181: nop
/*     */     //   182: checkcast kotlin/jvm/functions/Function0
/*     */     //   185: astore #5
/*     */     //   187: aload_1
/*     */     //   188: invokeinterface endReplaceGroup : ()V
/*     */     //   193: aload #5
/*     */     //   195: aload_0
/*     */     //   196: getfield $onCreateAiIgnoreFile : Lkotlin/jvm/functions/Function0;
/*     */     //   199: aload_0
/*     */     //   200: getfield $onOpenAiIgnoreFile : Lkotlin/jvm/functions/Function0;
/*     */     //   203: aload_0
/*     */     //   204: getfield $hasAIIgnoreFile : Lkotlin/jvm/functions/Function1;
/*     */     //   207: aload_1
/*     */     //   208: ldc 1572864
/*     */     //   210: invokestatic JunieFilePickerDialog : (Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/GuidelinesEntry;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
/*     */     //   213: invokestatic isTraceInProgress : ()Z
/*     */     //   216: ifeq -> 231
/*     */     //   219: invokestatic traceEventEnd : ()V
/*     */     //   222: goto -> 231
/*     */     //   225: aload_1
/*     */     //   226: invokeinterface skipToGroupEnd : ()V
/*     */     //   231: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #368	-> 0
/*     */     //   #369	-> 31
/*     */     //   #370	-> 44
/*     */     //   #369	-> 58
/*     */     //   #370	-> 59
/*     */     //   #372	-> 61
/*     */     //   #373	-> 65
/*     */     //   #374	-> 69
/*     */     //   #375	-> 73
/*     */     //   #371	-> 91
/*     */     //   #473	-> 100
/*     */     //   #474	-> 112
/*     */     //   #475	-> 123
/*     */     //   #371	-> 138
/*     */     //   #475	-> 161
/*     */     //   #476	-> 163
/*     */     //   #477	-> 172
/*     */     //   #478	-> 177
/*     */     //   #474	-> 179
/*     */     //   #473	-> 180
/*     */     //   #473	-> 181
/*     */     //   #371	-> 182
/*     */     //   #376	-> 195
/*     */     //   #377	-> 199
/*     */     //   #378	-> 203
/*     */     //   #368	-> 210
/*     */     //   #379	-> 225
/*     */     //   #380	-> 231
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   138	7	12	$i$a$-cache-PromptAreaKt$JunieFilePickerButton$5$1	I
/*     */     //   163	11	13	value$iv	Ljava/lang/Object;
/*     */     //   112	68	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   109	71	10	it$iv	Ljava/lang/Object;
/*     */     //   100	82	9	$i$f$cache	I
/*     */     //   97	85	6	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   97	85	7	invalid$iv	Z
/*     */     //   0	232	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptAreaKt$JunieFilePickerButton$5;
/*     */     //   0	232	1	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	232	2	$changed	I
/*     */   }
/*     */   
/*     */   private static final Unit invoke$lambda$1$lambda$0(MutableState $shouldShowFilePickerDialog$delegate) {
/* 371 */     PromptAreaKt.access$JunieFilePickerButton$lambda$58($shouldShowFilePickerDialog$delegate, false); return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   PromptAreaKt$JunieFilePickerButton$5(Function0<List<FileListEntry>> $getRecentFiles, Function0<GuidelinesEntry> $getGuidelines, Function1<AttachedFile, Unit> $onFileChosen, Function0<Unit> $openProjectFilePicker, Function0<Unit> $onCreateNewGuidelines, Function1<GuidelinesEntry, Unit> $onSelectGuidelines, Function0<Unit> $onCreateAiIgnoreFile, Function0<Unit> $onOpenAiIgnoreFile, Function1<Continuation<? super Boolean>, Object> $hasAIIgnoreFile, MutableState<Boolean> $shouldShowFilePickerDialog$delegate) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\prompt\PromptAreaKt$JunieFilePickerButton$5.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */