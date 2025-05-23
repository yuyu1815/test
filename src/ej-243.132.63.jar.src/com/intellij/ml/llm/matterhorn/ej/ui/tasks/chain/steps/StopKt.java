/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps;
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\032\025\020\000\032\0020\0012\006\020\002\032\0020\003H\001¢\006\002\020\004¨\006\005"}, d2 = {"StopStep", "", "stop", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Stop;", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Stop;Landroidx/compose/runtime/Composer;I)V", "ej-ui"})
/*    */ public final class StopKt { @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public static final void StopStep(@NotNull TaskStep.Stop stop, @Nullable Composer $composer, int $changed) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ldc 'stop'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_1
/*    */     //   7: ldc -495524259
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
/*    */     //   27: invokeinterface changed : (Ljava/lang/Object;)Z
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
/*    */     //   55: ifne -> 142
/*    */     //   58: invokestatic isTraceInProgress : ()Z
/*    */     //   61: ifeq -> 73
/*    */     //   64: ldc -495524259
/*    */     //   66: iload_3
/*    */     //   67: iconst_m1
/*    */     //   68: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.StopStep (Stop.kt:12)'
/*    */     //   70: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   73: aconst_null
/*    */     //   74: getstatic com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ComposableSingletons$StopKt.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ComposableSingletons$StopKt;
/*    */     //   77: invokevirtual getLambda-1$ej_ui : ()Lkotlin/jvm/functions/Function3;
/*    */     //   80: ldc 684053066
/*    */     //   82: iconst_1
/*    */     //   83: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/StopKt$StopStep$1
/*    */     //   86: dup
/*    */     //   87: aload_0
/*    */     //   88: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Stop;)V
/*    */     //   91: aload_1
/*    */     //   92: bipush #54
/*    */     //   94: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*    */     //   97: checkcast kotlin/jvm/functions/Function3
/*    */     //   100: aconst_null
/*    */     //   101: aconst_null
/*    */     //   102: ldc -365489369
/*    */     //   104: iconst_1
/*    */     //   105: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/StopKt$StopStep$2
/*    */     //   108: dup
/*    */     //   109: aload_0
/*    */     //   110: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Stop;)V
/*    */     //   113: aload_1
/*    */     //   114: bipush #54
/*    */     //   116: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*    */     //   119: checkcast kotlin/jvm/functions/Function3
/*    */     //   122: aload_1
/*    */     //   123: ldc 197040
/*    */     //   125: bipush #25
/*    */     //   127: invokestatic StepCard : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*    */     //   130: invokestatic isTraceInProgress : ()Z
/*    */     //   133: ifeq -> 148
/*    */     //   136: invokestatic traceEventEnd : ()V
/*    */     //   139: goto -> 148
/*    */     //   142: aload_1
/*    */     //   143: invokeinterface skipToGroupEnd : ()V
/*    */     //   148: aload_1
/*    */     //   149: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*    */     //   154: dup
/*    */     //   155: ifnull -> 173
/*    */     //   158: aload_0
/*    */     //   159: iload_2
/*    */     //   160: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Stop;I)Lkotlin/jvm/functions/Function2;
/*    */     //   165: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*    */     //   170: goto -> 174
/*    */     //   173: pop
/*    */     //   174: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #13	-> 6
/*    */     //   #15	-> 80
/*    */     //   #22	-> 102
/*    */     //   #13	-> 127
/*    */     //   #32	-> 142
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   17	158	3	$dirty	I
/*    */     //   0	175	0	stop	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Stop;
/*    */     //   0	175	1	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	175	2	$changed	I
/*    */   }
/*    */   private static final Unit StopStep$lambda$0(TaskStep.Stop $stop, int $$changed, Composer $composer, int $force) {
/*    */     StopStep($stop, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class StopKt$StopStep$1 implements Function3<RowScope, Composer, Integer, Unit> { @Composable
/*    */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/* 16 */     public final void invoke(RowScope $this$StepCard, Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$StepCard, "$this$StepCard"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(684053066, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.StopStep.<anonymous> (Stop.kt:15)"); 
/* 17 */         String str = this.$stop.getName();
/* 18 */         FontFamily fontFamily = MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getMessageFont($composer, MatterhornThemeData.$stable);
/* 19 */         FontWeight fontWeight = FontWeight.Companion.getBold(); TextKt.Text-bAzTDeA(str, null, 0L, 0L, null, fontWeight, fontFamily, 0L, null, 0, 0L, 0, false, 0, null, null, $composer, 196608, 0, 65438); if (ComposerKt.isTraceInProgress())
/* 20 */           ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*    */        } StopKt$StopStep$1(TaskStep.Stop $stop) {} } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class StopKt$StopStep$2 implements Function3<RowScope, Composer, Integer, Unit> { @Composable
/*    */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/* 23 */     public final void invoke(RowScope $this$StepCard, Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$StepCard, "$this$StepCard"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-365489369, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.StopStep.<anonymous> (Stop.kt:22)");  if (this.$stop.getStartNewTaskAction() != null) {
/*    */           
/* 25 */           String str = this.$stop.getStartNewTaskAction().getName();
/* 26 */           Function0 function0 = this.$stop.getStartNewTaskAction().getAction();
/* 27 */           ButtonKt.Button(str, null, false, function0, ComposableSingletons$StopKt.INSTANCE.getLambda-2$ej_ui(), $composer, 24960, 2);
/*    */         }  if (ComposerKt.isTraceInProgress())
/*    */           ComposerKt.traceEventEnd();  }
/* 30 */       else { $composer.skipToGroupEnd(); }
/*    */        }
/*    */ 
/*    */     
/*    */     StopKt$StopStep$2(TaskStep.Stop $stop) {} }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\StopKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */