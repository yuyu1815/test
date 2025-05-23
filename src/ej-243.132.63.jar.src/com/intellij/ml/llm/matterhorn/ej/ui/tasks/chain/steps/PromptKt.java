/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps;
/*    */ 
/*    */ import androidx.compose.foundation.layout.BoxScope;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.Updater;
/*    */ import androidx.compose.ui.Modifier;
/*    */ import androidx.compose.ui.node.ComposeUiNode;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.AttachedFile;
/*    */ import java.util.List;
/*    */ import kotlin.Unit;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\034\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\002\032\025\020\000\032\0020\0012\006\020\002\032\0020\003H\001¢\006\002\020\004\032\033\020\005\032\0020\0012\f\020\006\032\b\022\004\022\0020\b0\007H\003¢\006\002\020\t¨\006\n"}, d2 = {"PromptStep", "", "prompt", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Prompt;", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Prompt;Landroidx/compose/runtime/Composer;I)V", "showFileAttachments", "attachedFiles", "", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFile;", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "ej-ui"})
/*    */ public final class PromptKt {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public static final void PromptStep(@NotNull TaskStep.Prompt prompt, @Nullable Composer $composer, int $changed) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ldc 'prompt'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_1
/*    */     //   7: ldc -790470533
/*    */     //   9: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*    */     //   14: astore_1
/*    */     //   15: iload_2
/*    */     //   16: istore_3
/*    */     //   17: iload_2
/*    */     //   18: bipush #6
/*    */     //   20: iand
/*    */     //   21: ifne -> 42
/*    */     //   24: iload_3
/*    */     //   25: aload_1
/*    */     //   26: aload_0
/*    */     //   27: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   32: ifeq -> 39
/*    */     //   35: iconst_4
/*    */     //   36: goto -> 40
/*    */     //   39: iconst_2
/*    */     //   40: ior
/*    */     //   41: istore_3
/*    */     //   42: iload_3
/*    */     //   43: iconst_3
/*    */     //   44: iand
/*    */     //   45: iconst_2
/*    */     //   46: if_icmpne -> 58
/*    */     //   49: aload_1
/*    */     //   50: invokeinterface getSkipping : ()Z
/*    */     //   55: ifne -> 143
/*    */     //   58: invokestatic isTraceInProgress : ()Z
/*    */     //   61: ifeq -> 73
/*    */     //   64: ldc -790470533
/*    */     //   66: iload_3
/*    */     //   67: iconst_m1
/*    */     //   68: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.PromptStep (Prompt.kt:21)'
/*    */     //   70: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   73: aconst_null
/*    */     //   74: getstatic com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ComposableSingletons$PromptKt.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ComposableSingletons$PromptKt;
/*    */     //   77: invokevirtual getLambda-1$ej_ui : ()Lkotlin/jvm/functions/Function3;
/*    */     //   80: ldc -163977560
/*    */     //   82: iconst_1
/*    */     //   83: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/PromptKt$PromptStep$1
/*    */     //   86: dup
/*    */     //   87: aload_0
/*    */     //   88: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Prompt;)V
/*    */     //   91: aload_1
/*    */     //   92: bipush #54
/*    */     //   94: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*    */     //   97: checkcast kotlin/jvm/functions/Function3
/*    */     //   100: aconst_null
/*    */     //   101: ldc -807121282
/*    */     //   103: iconst_1
/*    */     //   104: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/PromptKt$PromptStep$2
/*    */     //   107: dup
/*    */     //   108: aload_0
/*    */     //   109: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Prompt;)V
/*    */     //   112: aload_1
/*    */     //   113: bipush #54
/*    */     //   115: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*    */     //   118: checkcast kotlin/jvm/functions/Function3
/*    */     //   121: aconst_null
/*    */     //   122: aload_1
/*    */     //   123: sipush #25008
/*    */     //   126: bipush #41
/*    */     //   128: invokestatic StepCard : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*    */     //   131: invokestatic isTraceInProgress : ()Z
/*    */     //   134: ifeq -> 149
/*    */     //   137: invokestatic traceEventEnd : ()V
/*    */     //   140: goto -> 149
/*    */     //   143: aload_1
/*    */     //   144: invokeinterface skipToGroupEnd : ()V
/*    */     //   149: aload_1
/*    */     //   150: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*    */     //   155: dup
/*    */     //   156: ifnull -> 174
/*    */     //   159: aload_0
/*    */     //   160: iload_2
/*    */     //   161: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Prompt;I)Lkotlin/jvm/functions/Function2;
/*    */     //   166: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*    */     //   171: goto -> 175
/*    */     //   174: pop
/*    */     //   175: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #22	-> 6
/*    */     //   #25	-> 80
/*    */     //   #28	-> 101
/*    */     //   #23	-> 128
/*    */     //   #35	-> 143
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   17	159	3	$dirty	I
/*    */     //   0	176	0	prompt	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Prompt;
/*    */     //   0	176	1	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	176	2	$changed	I
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class PromptKt$PromptStep$1 implements Function3<RowScope, Composer, Integer, Unit> { @Composable
/*    */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/* 26 */     public final void invoke(RowScope $this$StepCard, Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$StepCard, "$this$StepCard"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-163977560, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.PromptStep.<anonymous> (Prompt.kt:25)");  TextContainerKt.TextContainer(this.$prompt.getDescription(), $composer, 0); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*    */        } PromptKt$PromptStep$1(TaskStep.Prompt $prompt) {} } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class PromptKt$PromptStep$2 implements Function3<ColumnScope, Composer, Integer, Unit> { @Composable
/*    */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/* 29 */     public final void invoke(ColumnScope $this$StepCard, Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$StepCard, "$this$StepCard"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-807121282, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.PromptStep.<anonymous> (Prompt.kt:28)");  List attachedFiles = (List)this.$prompt.getAttachedFilesVm().getAttachedFiles().getValue();
/* 30 */         if (!attachedFiles.isEmpty())
/* 31 */           PromptKt.showFileAttachments(attachedFiles, $composer, 0);  if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  }
/* 32 */       else { $composer.skipToGroupEnd(); }
/*    */        } PromptKt$PromptStep$2(TaskStep.Prompt $prompt) {} }
/*    */    @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") private static final void showFileAttachments(List<AttachedFile> attachedFiles, Composer $composer, int $changed) { // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 1019486988
/*    */     //   3: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*    */     //   8: astore_1
/*    */     //   9: iload_2
/*    */     //   10: istore_3
/*    */     //   11: iload_2
/*    */     //   12: bipush #6
/*    */     //   14: iand
/*    */     //   15: ifne -> 36
/*    */     //   18: iload_3
/*    */     //   19: aload_1
/*    */     //   20: aload_0
/*    */     //   21: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   26: ifeq -> 33
/*    */     //   29: iconst_4
/*    */     //   30: goto -> 34
/*    */     //   33: iconst_2
/*    */     //   34: ior
/*    */     //   35: istore_3
/*    */     //   36: iload_3
/*    */     //   37: iconst_3
/*    */     //   38: iand
/*    */     //   39: iconst_2
/*    */     //   40: if_icmpne -> 52
/*    */     //   43: aload_1
/*    */     //   44: invokeinterface getSkipping : ()Z
/*    */     //   49: ifne -> 113
/*    */     //   52: invokestatic isTraceInProgress : ()Z
/*    */     //   55: ifeq -> 67
/*    */     //   58: ldc 1019486988
/*    */     //   60: iload_3
/*    */     //   61: iconst_m1
/*    */     //   62: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.showFileAttachments (Prompt.kt:38)'
/*    */     //   64: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   67: aconst_null
/*    */     //   68: aconst_null
/*    */     //   69: aconst_null
/*    */     //   70: iconst_0
/*    */     //   71: iconst_0
/*    */     //   72: aconst_null
/*    */     //   73: ldc 1721144753
/*    */     //   75: iconst_1
/*    */     //   76: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/PromptKt$showFileAttachments$1
/*    */     //   79: dup
/*    */     //   80: aload_0
/*    */     //   81: invokespecial <init> : (Ljava/util/List;)V
/*    */     //   84: aload_1
/*    */     //   85: bipush #54
/*    */     //   87: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*    */     //   90: checkcast kotlin/jvm/functions/Function3
/*    */     //   93: aload_1
/*    */     //   94: ldc 1572864
/*    */     //   96: bipush #63
/*    */     //   98: invokestatic FlowRow : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;IILandroidx/compose/foundation/layout/FlowRowOverflow;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*    */     //   101: invokestatic isTraceInProgress : ()Z
/*    */     //   104: ifeq -> 119
/*    */     //   107: invokestatic traceEventEnd : ()V
/*    */     //   110: goto -> 119
/*    */     //   113: aload_1
/*    */     //   114: invokeinterface skipToGroupEnd : ()V
/*    */     //   119: aload_1
/*    */     //   120: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*    */     //   125: dup
/*    */     //   126: ifnull -> 144
/*    */     //   129: aload_0
/*    */     //   130: iload_2
/*    */     //   131: <illegal opcode> invoke : (Ljava/util/List;I)Lkotlin/jvm/functions/Function2;
/*    */     //   136: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*    */     //   141: goto -> 145
/*    */     //   144: pop
/*    */     //   145: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #39	-> 0
/*    */     //   #40	-> 73
/*    */     //   #55	-> 113
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   11	135	3	$dirty	I
/*    */     //   0	146	0	attachedFiles	Ljava/util/List;
/*    */     //   0	146	1	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	146	2	$changed	I } private static final Unit PromptStep$lambda$0(TaskStep.Prompt $prompt, int $$changed, Composer $composer, int $force) { PromptStep($prompt, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*    */     return Unit.INSTANCE; } private static final Unit showFileAttachments$lambda$1(List<AttachedFile> $attachedFiles, int $$changed, Composer $composer, int $force) { showFileAttachments($attachedFiles, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*    */     return Unit.INSTANCE; } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nPrompt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Prompt.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/PromptKt$showFileAttachments$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,55:1\n1872#2,3:56\n*S KotlinDebug\n*F\n+ 1 Prompt.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/PromptKt$showFileAttachments$1\n*L\n41#1:56,3\n*E\n"}) static final class PromptKt$showFileAttachments$1 implements Function3<FlowRowScope, Composer, Integer, Unit>
/*    */   {
/*    */     @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */     public final void invoke(FlowRowScope $this$FlowRow, Composer $composer, int $changed) { int index$iv;
/*    */       Iterator<AttachedFile> iterator;
/* 41 */       Intrinsics.checkNotNullParameter($this$FlowRow, "$this$FlowRow"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1721144753, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.showFileAttachments.<anonymous> (Prompt.kt:40)");  Iterable<AttachedFile> $this$forEachIndexed$iv = this.$attachedFiles; int $i$f$forEachIndexed = 0;
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
/* 56 */         index$iv = 0;
/* 57 */         iterator = $this$forEachIndexed$iv.iterator(); } else { $composer.skipToGroupEnd(); return; }  if (iterator.hasNext()) { Object item$iv = iterator.next(); int i = index$iv++; if (i < 0) CollectionsKt.throwIndexOverflow();  AttachedFile attachedFile = (AttachedFile)item$iv; int index = i, $i$a$-forEachIndexed-PromptKt$showFileAttachments$1$1 = 0; }
/* 58 */        if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  }
/*    */ 
/*    */     
/*    */     PromptKt$showFileAttachments$1(List<AttachedFile> $attachedFiles) {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\PromptKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */