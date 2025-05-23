/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps;
/*    */ 
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import kotlin.Unit;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\032\025\020\000\032\0020\0012\006\020\002\032\0020\003H\001¢\006\002\020\004¨\006\005"}, d2 = {"InfoStep", "", "info", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Info;", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Info;Landroidx/compose/runtime/Composer;I)V", "ej-ui"})
/*    */ public final class InfoKt {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public static final void InfoStep(@NotNull TaskStep.Info info, @Nullable Composer $composer, int $changed) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ldc 'info'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_1
/*    */     //   7: ldc -343463759
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
/*    */     //   55: ifne -> 161
/*    */     //   58: invokestatic isTraceInProgress : ()Z
/*    */     //   61: ifeq -> 73
/*    */     //   64: ldc -343463759
/*    */     //   66: iload_3
/*    */     //   67: iconst_m1
/*    */     //   68: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.InfoStep (Info.kt:18)'
/*    */     //   70: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   73: aconst_null
/*    */     //   74: getstatic com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ComposableSingletons$InfoKt.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ComposableSingletons$InfoKt;
/*    */     //   77: invokevirtual getLambda-1$ej_ui : ()Lkotlin/jvm/functions/Function3;
/*    */     //   80: ldc 836113566
/*    */     //   82: iconst_1
/*    */     //   83: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/InfoKt$InfoStep$1
/*    */     //   86: dup
/*    */     //   87: aload_0
/*    */     //   88: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Info;)V
/*    */     //   91: aload_1
/*    */     //   92: bipush #54
/*    */     //   94: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*    */     //   97: checkcast kotlin/jvm/functions/Function3
/*    */     //   100: aconst_null
/*    */     //   101: ldc -1777822476
/*    */     //   103: iconst_1
/*    */     //   104: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/InfoKt$InfoStep$2
/*    */     //   107: dup
/*    */     //   108: aload_0
/*    */     //   109: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Info;)V
/*    */     //   112: aload_1
/*    */     //   113: bipush #54
/*    */     //   115: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*    */     //   118: checkcast kotlin/jvm/functions/Function3
/*    */     //   121: ldc -213428869
/*    */     //   123: iconst_1
/*    */     //   124: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/InfoKt$InfoStep$3
/*    */     //   127: dup
/*    */     //   128: aload_0
/*    */     //   129: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Info;)V
/*    */     //   132: aload_1
/*    */     //   133: bipush #54
/*    */     //   135: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*    */     //   138: checkcast kotlin/jvm/functions/Function3
/*    */     //   141: aload_1
/*    */     //   142: ldc 221616
/*    */     //   144: bipush #9
/*    */     //   146: invokestatic StepCard : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*    */     //   149: invokestatic isTraceInProgress : ()Z
/*    */     //   152: ifeq -> 167
/*    */     //   155: invokestatic traceEventEnd : ()V
/*    */     //   158: goto -> 167
/*    */     //   161: aload_1
/*    */     //   162: invokeinterface skipToGroupEnd : ()V
/*    */     //   167: aload_1
/*    */     //   168: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*    */     //   173: dup
/*    */     //   174: ifnull -> 192
/*    */     //   177: aload_0
/*    */     //   178: iload_2
/*    */     //   179: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Info;I)Lkotlin/jvm/functions/Function2;
/*    */     //   184: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*    */     //   189: goto -> 193
/*    */     //   192: pop
/*    */     //   193: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #19	-> 6
/*    */     //   #22	-> 80
/*    */     //   #29	-> 101
/*    */     //   #35	-> 121
/*    */     //   #20	-> 146
/*    */     //   #46	-> 161
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   17	177	3	$dirty	I
/*    */     //   0	194	0	info	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Info;
/*    */     //   0	194	1	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	194	2	$changed	I
/*    */   }
/*    */   
/*    */   private static final Unit InfoStep$lambda$0(TaskStep.Info $info, int $$changed, Composer $composer, int $force) {
/*    */     InfoStep($info, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class InfoKt$InfoStep$1 implements Function3<RowScope, Composer, Integer, Unit> { @Composable
/*    */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/* 23 */     public final void invoke(RowScope $this$StepCard, Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$StepCard, "$this$StepCard"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(836113566, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.InfoStep.<anonymous> (Info.kt:22)");  TextKt.Text-bAzTDeA(
/* 24 */             this.$info.getName(), null, 0L, 0L, null, 
/* 25 */             FontWeight.Companion.getBold(), 
/* 26 */             MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getMessageFont($composer, MatterhornThemeData.$stable), 0L, null, 0, 0L, 0, false, 0, null, null, $composer, 196608, 0, 65438); if (ComposerKt.isTraceInProgress())
/* 27 */           ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*    */        } InfoKt$InfoStep$1(TaskStep.Info $info) {} } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Info.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/InfoKt$InfoStep$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,46:1\n149#2:47\n*S KotlinDebug\n*F\n+ 1 Info.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/InfoKt$InfoStep$2\n*L\n32#1:47\n*E\n"}) static final class InfoKt$InfoStep$2 implements Function3<ColumnScope, Composer, Integer, Unit> { @Composable
/*    */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/* 30 */     public final void invoke(ColumnScope $this$StepCard, Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$StepCard, "$this$StepCard"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1777822476, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.InfoStep.<anonymous> (Info.kt:29)");  TextContainerKt.TextContainer(this.$info.getDescription(), $composer, 0);
/* 31 */         if (this.$info.getActionApprovalRequestData() != null) {
/* 32 */           int $this$dp$iv = 8, $i$f$getDp = 0; SpacerKt.Spacer(SizeKt.height-3ABfNKs((Modifier)Modifier.Companion, 
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
/* 47 */                 Dp.constructor-impl($this$dp$iv)), $composer, 6);
/*    */         } 
/*    */         if (ComposerKt.isTraceInProgress())
/*    */           ComposerKt.traceEventEnd();  }
/*    */       else
/*    */       { $composer.skipToGroupEnd(); }
/*    */        }
/*    */ 
/*    */     
/*    */     InfoKt$InfoStep$2(TaskStep.Info $info) {} }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class InfoKt$InfoStep$3 implements Function3<RowScope, Composer, Integer, Unit> {
/*    */     @Composable
/*    */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */     public final void invoke(RowScope $this$StepCard, Composer $composer, int $changed) {
/*    */       Intrinsics.checkNotNullParameter($this$StepCard, "$this$StepCard");
/*    */       if (($changed & 0x11) != 16 || !$composer.getSkipping()) {
/*    */         Function0 runCommand;
/*    */         if (ComposerKt.isTraceInProgress())
/*    */           ComposerKt.traceEventStart(-213428869, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.InfoStep.<anonymous> (Info.kt:36)"); 
/*    */         this.$info.getActionApprovalRequestData();
/*    */         Function0 function01 = (this.$info.getActionApprovalRequestData() != null) ? this.$info.getActionApprovalRequestData().getRunAction() : null;
/*    */         $composer.startReplaceGroup(1069298956);
/*    */         int $i$a$-let-InfoKt$InfoStep$3$1 = 0;
/*    */         ButtonKt.RunCommandButton(null, runCommand, $composer, 0, 1);
/*    */         Unit unit = (function01 == null) ? null : Unit.INSTANCE;
/*    */         $composer.endReplaceGroup();
/*    */         this.$info.getActionApprovalRequestData();
/*    */         if (((this.$info.getActionApprovalRequestData() != null) ? this.$info.getActionApprovalRequestData().getSkipAction() : null) == null) {
/*    */           (this.$info.getActionApprovalRequestData() != null) ? this.$info.getActionApprovalRequestData().getSkipAction() : null;
/*    */         } else {
/*    */           Object object;
/*    */           int $i$a$-let-InfoKt$InfoStep$3$2 = 0;
/*    */           ButtonKt.SkipButton(null, (Function0)object, $composer, 0, 1);
/*    */         } 
/*    */         if (ComposerKt.isTraceInProgress())
/*    */           ComposerKt.traceEventEnd(); 
/*    */       } else {
/*    */         $composer.skipToGroupEnd();
/*    */       } 
/*    */     }
/*    */     
/*    */     InfoKt$InfoStep$3(TaskStep.Info $info) {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\InfoKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */