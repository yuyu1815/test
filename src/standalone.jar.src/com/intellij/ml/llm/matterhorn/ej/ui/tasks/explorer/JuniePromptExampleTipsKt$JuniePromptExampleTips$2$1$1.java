/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.explorer;
/*    */ 
/*    */ import androidx.compose.animation.AnimatedVisibilityScope;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.ExamplePromptChipStyle;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ @SourceDebugExtension({"SMAP\nJuniePromptExampleTips.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JuniePromptExampleTips.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/JuniePromptExampleTipsKt$JuniePromptExampleTips$2$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,123:1\n1225#2,6:124\n1225#2,6:130\n*S KotlinDebug\n*F\n+ 1 JuniePromptExampleTips.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/JuniePromptExampleTipsKt$JuniePromptExampleTips$2$1$1\n*L\n75#1:124,6\n77#1:130,6\n*E\n"})
/*    */ final class JuniePromptExampleTipsKt$JuniePromptExampleTips$2$1$1
/*    */   implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit>
/*    */ {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final void invoke(AnimatedVisibilityScope $this$AnimatedVisibility, Composer $composer, int $changed) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc '$this$AnimatedVisibility'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: invokestatic isTraceInProgress : ()Z
/*    */     //   9: ifeq -> 21
/*    */     //   12: ldc 28645453
/*    */     //   14: iload_3
/*    */     //   15: iconst_m1
/*    */     //   16: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.explorer.JuniePromptExampleTips.<anonymous>.<anonymous>.<anonymous> (JuniePromptExampleTips.kt:69)'
/*    */     //   18: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   21: aload_0
/*    */     //   22: getfield $tip : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/Tip;
/*    */     //   25: invokevirtual getDisplayText : ()Ljava/lang/String;
/*    */     //   28: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   31: checkcast androidx/compose/ui/Modifier
/*    */     //   34: aload_2
/*    */     //   35: ldc -772240035
/*    */     //   37: invokeinterface startReplaceGroup : (I)V
/*    */     //   42: aload_2
/*    */     //   43: astore #5
/*    */     //   45: iconst_0
/*    */     //   46: istore #6
/*    */     //   48: nop
/*    */     //   49: iconst_0
/*    */     //   50: istore #7
/*    */     //   52: aload #5
/*    */     //   54: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   59: astore #8
/*    */     //   61: iconst_0
/*    */     //   62: istore #9
/*    */     //   64: aload #8
/*    */     //   66: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   69: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   72: if_acmpne -> 109
/*    */     //   75: astore #15
/*    */     //   77: astore #14
/*    */     //   79: iconst_0
/*    */     //   80: istore #10
/*    */     //   82: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*    */     //   85: astore #16
/*    */     //   87: aload #14
/*    */     //   89: aload #15
/*    */     //   91: aload #16
/*    */     //   93: astore #10
/*    */     //   95: aload #5
/*    */     //   97: aload #10
/*    */     //   99: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   104: aload #10
/*    */     //   106: goto -> 111
/*    */     //   109: aload #8
/*    */     //   111: nop
/*    */     //   112: nop
/*    */     //   113: nop
/*    */     //   114: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*    */     //   117: astore #4
/*    */     //   119: aload_2
/*    */     //   120: invokeinterface endReplaceGroup : ()V
/*    */     //   125: aload #4
/*    */     //   127: aconst_null
/*    */     //   128: iconst_0
/*    */     //   129: aconst_null
/*    */     //   130: aconst_null
/*    */     //   131: aload_2
/*    */     //   132: ldc -772236784
/*    */     //   134: invokeinterface startReplaceGroup : (I)V
/*    */     //   139: aload_2
/*    */     //   140: astore #5
/*    */     //   142: aload_2
/*    */     //   143: aload_0
/*    */     //   144: getfield $onTipClick : Lkotlin/jvm/functions/Function1;
/*    */     //   147: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   152: aload_2
/*    */     //   153: aload_0
/*    */     //   154: getfield $tip : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/Tip;
/*    */     //   157: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   162: ior
/*    */     //   163: istore #6
/*    */     //   165: aload_0
/*    */     //   166: getfield $onTipClick : Lkotlin/jvm/functions/Function1;
/*    */     //   169: astore #7
/*    */     //   171: aload_0
/*    */     //   172: getfield $tip : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/Tip;
/*    */     //   175: astore #8
/*    */     //   177: iconst_0
/*    */     //   178: istore #9
/*    */     //   180: aload #5
/*    */     //   182: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   187: astore #10
/*    */     //   189: iconst_0
/*    */     //   190: istore #11
/*    */     //   192: iload #6
/*    */     //   194: ifne -> 208
/*    */     //   197: aload #10
/*    */     //   199: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   202: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   205: if_acmpne -> 268
/*    */     //   208: astore #20
/*    */     //   210: astore #19
/*    */     //   212: istore #18
/*    */     //   214: astore #17
/*    */     //   216: astore #16
/*    */     //   218: astore #15
/*    */     //   220: astore #14
/*    */     //   222: iconst_0
/*    */     //   223: istore #12
/*    */     //   225: aload #7
/*    */     //   227: aload #8
/*    */     //   229: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/Tip;)Lkotlin/jvm/functions/Function0;
/*    */     //   234: astore #21
/*    */     //   236: aload #14
/*    */     //   238: aload #15
/*    */     //   240: aload #16
/*    */     //   242: aload #17
/*    */     //   244: iload #18
/*    */     //   246: aload #19
/*    */     //   248: aload #20
/*    */     //   250: aload #21
/*    */     //   252: astore #13
/*    */     //   254: aload #5
/*    */     //   256: aload #13
/*    */     //   258: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   263: aload #13
/*    */     //   265: goto -> 270
/*    */     //   268: aload #10
/*    */     //   270: nop
/*    */     //   271: nop
/*    */     //   272: nop
/*    */     //   273: checkcast kotlin/jvm/functions/Function0
/*    */     //   276: astore #4
/*    */     //   278: aload_2
/*    */     //   279: invokeinterface endReplaceGroup : ()V
/*    */     //   284: aload #4
/*    */     //   286: bipush #28
/*    */     //   288: aconst_null
/*    */     //   289: invokestatic clickable-O2vRcR0$default : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*    */     //   292: aload_0
/*    */     //   293: getfield $examplePromptChipStyle : Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipStyle;
/*    */     //   296: aload_2
/*    */     //   297: iconst_0
/*    */     //   298: iconst_0
/*    */     //   299: invokestatic JunieExamplePromptChip : (Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipStyle;Landroidx/compose/runtime/Composer;II)V
/*    */     //   302: invokestatic isTraceInProgress : ()Z
/*    */     //   305: ifeq -> 311
/*    */     //   308: invokestatic traceEventEnd : ()V
/*    */     //   311: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #70	-> 18
/*    */     //   #71	-> 21
/*    */     //   #73	-> 28
/*    */     //   #75	-> 48
/*    */     //   #124	-> 52
/*    */     //   #125	-> 64
/*    */     //   #126	-> 75
/*    */     //   #75	-> 82
/*    */     //   #126	-> 93
/*    */     //   #127	-> 95
/*    */     //   #128	-> 104
/*    */     //   #129	-> 109
/*    */     //   #125	-> 111
/*    */     //   #124	-> 112
/*    */     //   #124	-> 113
/*    */     //   #75	-> 114
/*    */     //   #76	-> 127
/*    */     //   #74	-> 128
/*    */     //   #77	-> 165
/*    */     //   #130	-> 180
/*    */     //   #131	-> 192
/*    */     //   #132	-> 208
/*    */     //   #77	-> 225
/*    */     //   #132	-> 252
/*    */     //   #133	-> 254
/*    */     //   #134	-> 263
/*    */     //   #135	-> 268
/*    */     //   #131	-> 270
/*    */     //   #130	-> 271
/*    */     //   #130	-> 272
/*    */     //   #77	-> 273
/*    */     //   #74	-> 286
/*    */     //   #79	-> 292
/*    */     //   #70	-> 299
/*    */     //   #81	-> 311
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   82	3	10	$i$a$-cache-JuniePromptExampleTipsKt$JuniePromptExampleTips$2$1$1$1	I
/*    */     //   95	11	10	value$iv	Ljava/lang/Object;
/*    */     //   64	48	9	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   61	51	8	it$iv	Ljava/lang/Object;
/*    */     //   52	62	7	$i$f$cache	I
/*    */     //   49	65	5	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   49	65	6	invalid$iv	Z
/*    */     //   225	9	12	$i$a$-cache-JuniePromptExampleTipsKt$JuniePromptExampleTips$2$1$1$2	I
/*    */     //   254	11	13	value$iv	Ljava/lang/Object;
/*    */     //   192	79	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   189	82	10	it$iv	Ljava/lang/Object;
/*    */     //   180	93	9	$i$f$cache	I
/*    */     //   177	96	5	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   177	96	6	invalid$iv	Z
/*    */     //   0	312	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/JuniePromptExampleTipsKt$JuniePromptExampleTips$2$1$1;
/*    */     //   0	312	1	$this$AnimatedVisibility	Landroidx/compose/animation/AnimatedVisibilityScope;
/*    */     //   0	312	2	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	312	3	$changed	I
/*    */   }
/*    */   
/*    */   private static final Unit invoke$lambda$2$lambda$1(Function1 $onTipClick, Tip $tip) {
/* 77 */     $onTipClick.invoke($tip.getPrompt()); return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   JuniePromptExampleTipsKt$JuniePromptExampleTips$2$1$1(Tip $tip, Function1<String, Unit> $onTipClick, ExamplePromptChipStyle $examplePromptChipStyle) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\explorer\JuniePromptExampleTipsKt$JuniePromptExampleTips$2$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */