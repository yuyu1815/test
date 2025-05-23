/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps;
/*    */ 
/*    */ import androidx.compose.foundation.layout.RowScope;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.MutableState;
/*    */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*    */ import androidx.compose.runtime.State;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model.TaskStep;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.reflect.KProperty;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\024\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\003\n\002\020\013\032\025\020\000\032\0020\0012\006\020\002\032\0020\003H\001¢\006\002\020\004¨\006\005²\006\n\020\006\032\0020\007X\002"}, d2 = {"ProgressStep", "", "step", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Progress;", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Progress;Landroidx/compose/runtime/Composer;I)V", "ej-ui", "isStopping", ""})
/*    */ @SourceDebugExtension({"SMAP\nProgress.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Progress.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ProgressKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,47:1\n1225#2,6:48\n81#3:54\n107#3,2:55\n*S KotlinDebug\n*F\n+ 1 Progress.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ProgressKt\n*L\n20#1:48,6\n20#1:54\n20#1:55,2\n*E\n"})
/*    */ public final class ProgressKt {
/* 20 */   private static final boolean ProgressStep$lambda$1(MutableState $isStopping$delegate) { State state = (State)$isStopping$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (
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
/*    */ 
/*    */ 
/*    */       
/* 54 */       (Boolean)state.getValue()).booleanValue(); }
/*    */   @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public static final void ProgressStep(@NotNull TaskStep.Progress step, @Nullable Composer $composer, int $changed) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ldc 'step'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_1
/*    */     //   7: ldc 598950258
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
/*    */     //   55: ifne -> 216
/*    */     //   58: invokestatic isTraceInProgress : ()Z
/*    */     //   61: ifeq -> 73
/*    */     //   64: ldc 598950258
/*    */     //   66: iload_3
/*    */     //   67: iconst_m1
/*    */     //   68: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.ProgressStep (Progress.kt:18)'
/*    */     //   70: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   73: aload_1
/*    */     //   74: ldc 533015172
/*    */     //   76: invokeinterface startReplaceGroup : (I)V
/*    */     //   81: aload_1
/*    */     //   82: astore #6
/*    */     //   84: iconst_0
/*    */     //   85: istore #7
/*    */     //   87: nop
/*    */     //   88: iconst_0
/*    */     //   89: istore #8
/*    */     //   91: aload #6
/*    */     //   93: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   98: astore #9
/*    */     //   100: iconst_0
/*    */     //   101: istore #10
/*    */     //   103: aload #9
/*    */     //   105: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   108: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   111: if_acmpne -> 143
/*    */     //   114: iconst_0
/*    */     //   115: istore #11
/*    */     //   117: iconst_0
/*    */     //   118: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*    */     //   121: aconst_null
/*    */     //   122: iconst_2
/*    */     //   123: aconst_null
/*    */     //   124: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*    */     //   127: astore #11
/*    */     //   129: aload #6
/*    */     //   131: aload #11
/*    */     //   133: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   138: aload #11
/*    */     //   140: goto -> 145
/*    */     //   143: aload #9
/*    */     //   145: nop
/*    */     //   146: nop
/*    */     //   147: nop
/*    */     //   148: checkcast androidx/compose/runtime/MutableState
/*    */     //   151: astore #5
/*    */     //   153: aload_1
/*    */     //   154: invokeinterface endReplaceGroup : ()V
/*    */     //   159: aload #5
/*    */     //   161: astore #4
/*    */     //   163: aconst_null
/*    */     //   164: getstatic com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ComposableSingletons$ProgressKt.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ComposableSingletons$ProgressKt;
/*    */     //   167: invokevirtual getLambda-1$ej_ui : ()Lkotlin/jvm/functions/Function3;
/*    */     //   170: ldc 2068230623
/*    */     //   172: iconst_1
/*    */     //   173: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ProgressKt$ProgressStep$1
/*    */     //   176: dup
/*    */     //   177: aload_0
/*    */     //   178: aload #4
/*    */     //   180: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Progress;Landroidx/compose/runtime/MutableState;)V
/*    */     //   183: aload_1
/*    */     //   184: bipush #54
/*    */     //   186: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*    */     //   189: checkcast kotlin/jvm/functions/Function3
/*    */     //   192: aconst_null
/*    */     //   193: aconst_null
/*    */     //   194: aconst_null
/*    */     //   195: aload_1
/*    */     //   196: sipush #432
/*    */     //   199: bipush #57
/*    */     //   201: invokestatic StepCard : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*    */     //   204: invokestatic isTraceInProgress : ()Z
/*    */     //   207: ifeq -> 222
/*    */     //   210: invokestatic traceEventEnd : ()V
/*    */     //   213: goto -> 222
/*    */     //   216: aload_1
/*    */     //   217: invokeinterface skipToGroupEnd : ()V
/*    */     //   222: aload_1
/*    */     //   223: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*    */     //   228: dup
/*    */     //   229: ifnull -> 247
/*    */     //   232: aload_0
/*    */     //   233: iload_2
/*    */     //   234: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Progress;I)Lkotlin/jvm/functions/Function2;
/*    */     //   239: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*    */     //   244: goto -> 248
/*    */     //   247: pop
/*    */     //   248: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #19	-> 6
/*    */     //   #20	-> 87
/*    */     //   #48	-> 91
/*    */     //   #49	-> 103
/*    */     //   #50	-> 114
/*    */     //   #20	-> 117
/*    */     //   #50	-> 127
/*    */     //   #51	-> 129
/*    */     //   #52	-> 138
/*    */     //   #53	-> 143
/*    */     //   #49	-> 145
/*    */     //   #48	-> 146
/*    */     //   #48	-> 147
/*    */     //   #20	-> 148
/*    */     //   #23	-> 170
/*    */     //   #21	-> 201
/*    */     //   #47	-> 216
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   117	10	11	$i$a$-cache-ProgressKt$ProgressStep$isStopping$2	I
/*    */     //   129	11	11	value$iv	Ljava/lang/Object;
/*    */     //   103	43	10	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   100	46	9	it$iv	Ljava/lang/Object;
/*    */     //   91	57	8	$i$f$cache	I
/*    */     //   88	60	6	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   88	60	7	invalid$iv	Z
/*    */     //   163	50	4	isStopping$delegate	Landroidx/compose/runtime/MutableState;
/*    */     //   17	232	3	$dirty	I
/*    */     //   0	249	0	step	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Progress;
/*    */     //   0	249	1	$composer	Landroidx/compose/runtime/Composer;
/* 55 */     //   0	249	2	$changed	I } private static final void ProgressStep$lambda$2(MutableState $isStopping$delegate, boolean <set-?>) { MutableState mutableState = $isStopping$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0; mutableState.setValue(value$iv); }
/*    */ 
/*    */   
/*    */   private static final Unit ProgressStep$lambda$3(TaskStep.Progress $step, int $$changed, Composer $composer, int $force) {
/*    */     ProgressStep($step, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   @SourceDebugExtension({"SMAP\nProgress.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Progress.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ProgressKt$ProgressStep$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,47:1\n1225#2,6:48\n1225#2,6:54\n*S KotlinDebug\n*F\n+ 1 Progress.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ProgressKt$ProgressStep$1\n*L\n33#1:48,6\n40#1:54,6\n*E\n"})
/*    */   static final class ProgressKt$ProgressStep$1 implements Function3<RowScope, Composer, Integer, Unit> {
/*    */     @Composable
/*    */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */     public final void invoke(RowScope $this$StepCard, Composer $composer, int $changed) {
/*    */       // Byte code:
/*    */       //   0: aload_1
/*    */       //   1: ldc '$this$StepCard'
/*    */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */       //   6: iload_3
/*    */       //   7: istore #4
/*    */       //   9: iload_3
/*    */       //   10: bipush #6
/*    */       //   12: iand
/*    */       //   13: ifne -> 36
/*    */       //   16: iload #4
/*    */       //   18: aload_2
/*    */       //   19: aload_1
/*    */       //   20: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */       //   25: ifeq -> 32
/*    */       //   28: iconst_4
/*    */       //   29: goto -> 33
/*    */       //   32: iconst_2
/*    */       //   33: ior
/*    */       //   34: istore #4
/*    */       //   36: iload #4
/*    */       //   38: bipush #19
/*    */       //   40: iand
/*    */       //   41: bipush #18
/*    */       //   43: if_icmpne -> 55
/*    */       //   46: aload_2
/*    */       //   47: invokeinterface getSkipping : ()Z
/*    */       //   52: ifne -> 464
/*    */       //   55: invokestatic isTraceInProgress : ()Z
/*    */       //   58: ifeq -> 71
/*    */       //   61: ldc 2068230623
/*    */       //   63: iload #4
/*    */       //   65: iconst_m1
/*    */       //   66: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.ProgressStep.<anonymous> (Progress.kt:23)'
/*    */       //   68: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */       //   71: aload_1
/*    */       //   72: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */       //   75: checkcast androidx/compose/ui/Modifier
/*    */       //   78: fconst_1
/*    */       //   79: iconst_1
/*    */       //   80: invokeinterface weight : (Landroidx/compose/ui/Modifier;FZ)Landroidx/compose/ui/Modifier;
/*    */       //   85: astore #5
/*    */       //   87: aload_0
/*    */       //   88: getfield $step : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Progress;
/*    */       //   91: invokevirtual getDescription : ()Ljava/lang/String;
/*    */       //   94: astore #6
/*    */       //   96: aload_2
/*    */       //   97: iconst_0
/*    */       //   98: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*    */       //   101: aload_2
/*    */       //   102: getstatic com/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData.$stable : I
/*    */       //   105: invokevirtual getMessageFont : (Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/font/FontFamily;
/*    */       //   108: astore #7
/*    */       //   110: getstatic androidx/compose/ui/text/font/FontWeight.Companion : Landroidx/compose/ui/text/font/FontWeight$Companion;
/*    */       //   113: invokevirtual getBold : ()Landroidx/compose/ui/text/font/FontWeight;
/*    */       //   116: astore #8
/*    */       //   118: getstatic androidx/compose/ui/text/style/TextOverflow.Companion : Landroidx/compose/ui/text/style/TextOverflow$Companion;
/*    */       //   121: invokevirtual getEllipsis-gIe3tQ8 : ()I
/*    */       //   124: istore #9
/*    */       //   126: aload #6
/*    */       //   128: aload #5
/*    */       //   130: lconst_0
/*    */       //   131: lconst_0
/*    */       //   132: aconst_null
/*    */       //   133: aload #8
/*    */       //   135: aload #7
/*    */       //   137: lconst_0
/*    */       //   138: aconst_null
/*    */       //   139: iconst_0
/*    */       //   140: lconst_0
/*    */       //   141: iload #9
/*    */       //   143: iconst_0
/*    */       //   144: iconst_0
/*    */       //   145: aconst_null
/*    */       //   146: aconst_null
/*    */       //   147: aload_2
/*    */       //   148: ldc 196608
/*    */       //   150: bipush #48
/*    */       //   152: ldc 63388
/*    */       //   154: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*    */       //   157: aload_0
/*    */       //   158: getfield $step : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Progress;
/*    */       //   161: invokevirtual getOnStop : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
/*    */       //   164: ifnull -> 452
/*    */       //   167: aload_0
/*    */       //   168: getfield $isStopping$delegate : Landroidx/compose/runtime/MutableState;
/*    */       //   171: invokestatic access$ProgressStep$lambda$1 : (Landroidx/compose/runtime/MutableState;)Z
/*    */       //   174: istore #6
/*    */       //   176: aload_2
/*    */       //   177: ldc 161719921
/*    */       //   179: invokeinterface startReplaceGroup : (I)V
/*    */       //   184: aload_2
/*    */       //   185: astore #8
/*    */       //   187: aload_2
/*    */       //   188: iload #6
/*    */       //   190: invokeinterface changed : (Z)Z
/*    */       //   195: istore #9
/*    */       //   197: aload_0
/*    */       //   198: getfield $step : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Progress;
/*    */       //   201: astore #10
/*    */       //   203: aload_0
/*    */       //   204: getfield $isStopping$delegate : Landroidx/compose/runtime/MutableState;
/*    */       //   207: astore #11
/*    */       //   209: iconst_0
/*    */       //   210: istore #12
/*    */       //   212: aload #8
/*    */       //   214: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */       //   219: astore #13
/*    */       //   221: iconst_0
/*    */       //   222: istore #14
/*    */       //   224: iload #9
/*    */       //   226: ifne -> 240
/*    */       //   229: aload #13
/*    */       //   231: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */       //   234: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */       //   237: if_acmpne -> 281
/*    */       //   240: iconst_0
/*    */       //   241: istore #15
/*    */       //   243: aload #11
/*    */       //   245: invokestatic access$ProgressStep$lambda$1 : (Landroidx/compose/runtime/MutableState;)Z
/*    */       //   248: ifne -> 262
/*    */       //   251: aload #10
/*    */       //   253: invokevirtual getOnStop : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
/*    */       //   256: invokevirtual getName : ()Ljava/lang/String;
/*    */       //   259: goto -> 264
/*    */       //   262: ldc 'Cancelling'
/*    */       //   264: nop
/*    */       //   265: astore #16
/*    */       //   267: aload #8
/*    */       //   269: aload #16
/*    */       //   271: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */       //   276: aload #16
/*    */       //   278: goto -> 283
/*    */       //   281: aload #13
/*    */       //   283: nop
/*    */       //   284: nop
/*    */       //   285: nop
/*    */       //   286: checkcast java/lang/String
/*    */       //   289: astore #7
/*    */       //   291: aload_2
/*    */       //   292: invokeinterface endReplaceGroup : ()V
/*    */       //   297: aload #7
/*    */       //   299: astore #5
/*    */       //   301: aload_0
/*    */       //   302: getfield $isStopping$delegate : Landroidx/compose/runtime/MutableState;
/*    */       //   305: invokestatic access$ProgressStep$lambda$1 : (Landroidx/compose/runtime/MutableState;)Z
/*    */       //   308: ifne -> 315
/*    */       //   311: iconst_1
/*    */       //   312: goto -> 316
/*    */       //   315: iconst_0
/*    */       //   316: istore #6
/*    */       //   318: aload #5
/*    */       //   320: aload_2
/*    */       //   321: ldc 161728643
/*    */       //   323: invokeinterface startReplaceGroup : (I)V
/*    */       //   328: aload_2
/*    */       //   329: astore #8
/*    */       //   331: aload_2
/*    */       //   332: aload_0
/*    */       //   333: getfield $step : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Progress;
/*    */       //   336: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */       //   341: istore #9
/*    */       //   343: aload_0
/*    */       //   344: getfield $step : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Progress;
/*    */       //   347: astore #10
/*    */       //   349: aload_0
/*    */       //   350: getfield $isStopping$delegate : Landroidx/compose/runtime/MutableState;
/*    */       //   353: astore #11
/*    */       //   355: iconst_0
/*    */       //   356: istore #12
/*    */       //   358: aload #8
/*    */       //   360: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */       //   365: astore #13
/*    */       //   367: iconst_0
/*    */       //   368: istore #14
/*    */       //   370: iload #9
/*    */       //   372: ifne -> 386
/*    */       //   375: aload #13
/*    */       //   377: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */       //   380: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */       //   383: if_acmpne -> 419
/*    */       //   386: astore #17
/*    */       //   388: iconst_0
/*    */       //   389: istore #15
/*    */       //   391: aload #10
/*    */       //   393: aload #11
/*    */       //   395: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Progress;Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function0;
/*    */       //   400: aload #17
/*    */       //   402: swap
/*    */       //   403: astore #16
/*    */       //   405: aload #8
/*    */       //   407: aload #16
/*    */       //   409: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */       //   414: aload #16
/*    */       //   416: goto -> 421
/*    */       //   419: aload #13
/*    */       //   421: nop
/*    */       //   422: nop
/*    */       //   423: nop
/*    */       //   424: checkcast kotlin/jvm/functions/Function0
/*    */       //   427: astore #7
/*    */       //   429: aload_2
/*    */       //   430: invokeinterface endReplaceGroup : ()V
/*    */       //   435: aload #7
/*    */       //   437: aconst_null
/*    */       //   438: iload #6
/*    */       //   440: aconst_null
/*    */       //   441: iconst_0
/*    */       //   442: aconst_null
/*    */       //   443: aconst_null
/*    */       //   444: aload_2
/*    */       //   445: iconst_0
/*    */       //   446: sipush #244
/*    */       //   449: invokestatic Link-kye4rC8 : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;Landroidx/compose/runtime/Composer;II)V
/*    */       //   452: invokestatic isTraceInProgress : ()Z
/*    */       //   455: ifeq -> 470
/*    */       //   458: invokestatic traceEventEnd : ()V
/*    */       //   461: goto -> 470
/*    */       //   464: aload_2
/*    */       //   465: invokeinterface skipToGroupEnd : ()V
/*    */       //   470: return
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #24	-> 36
/*    */       //   #25	-> 71
/*    */       //   #26	-> 87
/*    */       //   #27	-> 98
/*    */       //   #28	-> 110
/*    */       //   #29	-> 118
/*    */       //   #26	-> 126
/*    */       //   #25	-> 128
/*    */       //   #28	-> 133
/*    */       //   #27	-> 135
/*    */       //   #29	-> 141
/*    */       //   #24	-> 154
/*    */       //   #32	-> 157
/*    */       //   #33	-> 167
/*    */       //   #48	-> 212
/*    */       //   #49	-> 224
/*    */       //   #50	-> 240
/*    */       //   #34	-> 243
/*    */       //   #35	-> 251
/*    */       //   #37	-> 262
/*    */       //   #38	-> 264
/*    */       //   #50	-> 265
/*    */       //   #51	-> 267
/*    */       //   #52	-> 276
/*    */       //   #53	-> 281
/*    */       //   #49	-> 283
/*    */       //   #48	-> 284
/*    */       //   #48	-> 285
/*    */       //   #33	-> 286
/*    */       //   #40	-> 301
/*    */       //   #54	-> 358
/*    */       //   #55	-> 370
/*    */       //   #56	-> 386
/*    */       //   #40	-> 391
/*    */       //   #56	-> 403
/*    */       //   #57	-> 405
/*    */       //   #58	-> 414
/*    */       //   #59	-> 419
/*    */       //   #55	-> 421
/*    */       //   #54	-> 422
/*    */       //   #54	-> 423
/*    */       //   #40	-> 424
/*    */       //   #44	-> 464
/*    */       //   #45	-> 470
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   243	22	15	$i$a$-cache-ProgressKt$ProgressStep$1$text$1	I
/*    */       //   267	11	16	value$iv	Ljava/lang/Object;
/*    */       //   224	60	14	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */       //   221	63	13	it$iv	Ljava/lang/Object;
/*    */       //   212	74	12	$i$f$cache	I
/*    */       //   209	77	8	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */       //   209	77	9	invalid$iv	Z
/*    */       //   391	9	15	$i$a$-cache-ProgressKt$ProgressStep$1$1	I
/*    */       //   405	11	16	value$iv	Ljava/lang/Object;
/*    */       //   370	52	14	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */       //   367	55	13	it$iv	Ljava/lang/Object;
/*    */       //   358	66	12	$i$f$cache	I
/*    */       //   355	69	8	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */       //   355	69	9	invalid$iv	Z
/*    */       //   301	151	5	text	Ljava/lang/String;
/*    */       //   9	462	4	$dirty	I
/*    */       //   0	471	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ProgressKt$ProgressStep$1;
/*    */       //   0	471	1	$this$StepCard	Landroidx/compose/foundation/layout/RowScope;
/*    */       //   0	471	2	$composer	Landroidx/compose/runtime/Composer;
/*    */       //   0	471	3	$changed	I
/*    */     }
/*    */     
/*    */     private static final Unit invoke$lambda$2$lambda$1(TaskStep.Progress $step, MutableState $isStopping$delegate) {
/*    */       ProgressKt.ProgressStep$lambda$2($isStopping$delegate, true);
/*    */       $step.getOnStop().getAction().invoke();
/*    */       return Unit.INSTANCE;
/*    */     }
/*    */     
/*    */     ProgressKt$ProgressStep$1(TaskStep.Progress $step, MutableState<Boolean> $isStopping$delegate) {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\ProgressKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */