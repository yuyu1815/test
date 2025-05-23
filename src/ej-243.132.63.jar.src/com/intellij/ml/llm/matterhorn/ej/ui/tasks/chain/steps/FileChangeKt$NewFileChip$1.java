/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps;
/*     */ 
/*     */ import androidx.compose.foundation.layout.RowScope;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model.FileChangeView;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @SourceDebugExtension({"SMAP\nFileChange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileChange.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/FileChangeKt$NewFileChip$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,270:1\n1225#2,6:271\n1225#2,6:277\n*S KotlinDebug\n*F\n+ 1 FileChange.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/FileChangeKt$NewFileChip$1\n*L\n164#1:271,6\n171#1:277,6\n*E\n"})
/*     */ final class FileChangeKt$NewFileChip$1
/*     */   implements Function3<RowScope, Composer, Integer, Unit>
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public final void invoke(RowScope $this$FileChangeItem, Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc '$this$FileChangeItem'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: iload_3
/*     */     //   7: bipush #17
/*     */     //   9: iand
/*     */     //   10: bipush #16
/*     */     //   12: if_icmpne -> 24
/*     */     //   15: aload_2
/*     */     //   16: invokeinterface getSkipping : ()Z
/*     */     //   21: ifne -> 413
/*     */     //   24: invokestatic isTraceInProgress : ()Z
/*     */     //   27: ifeq -> 39
/*     */     //   30: ldc -431899
/*     */     //   32: iload_3
/*     */     //   33: iconst_m1
/*     */     //   34: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.NewFileChip.<anonymous> (FileChange.kt:161)'
/*     */     //   36: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   39: aload_0
/*     */     //   40: getfield $change : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;
/*     */     //   43: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   46: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   51: astore #4
/*     */     //   53: getstatic org/jetbrains/jewel/ui/icons/AllIconsKeys$General.INSTANCE : Lorg/jetbrains/jewel/ui/icons/AllIconsKeys$General;
/*     */     //   56: invokevirtual getLocate : ()Lorg/jetbrains/jewel/ui/icon/IntelliJIconKey;
/*     */     //   59: astore #5
/*     */     //   61: aload #4
/*     */     //   63: aload #5
/*     */     //   65: checkcast org/jetbrains/jewel/ui/icon/IconKey
/*     */     //   68: aload_2
/*     */     //   69: ldc -2079599334
/*     */     //   71: invokeinterface startReplaceGroup : (I)V
/*     */     //   76: aload_2
/*     */     //   77: astore #7
/*     */     //   79: aload_2
/*     */     //   80: aload_0
/*     */     //   81: getfield $coroutineScope : Lkotlinx/coroutines/CoroutineScope;
/*     */     //   84: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   89: aload_2
/*     */     //   90: aload_0
/*     */     //   91: getfield $onJumpToSource : Lkotlin/jvm/functions/Function1;
/*     */     //   94: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   99: ior
/*     */     //   100: istore #8
/*     */     //   102: aload_0
/*     */     //   103: getfield $coroutineScope : Lkotlinx/coroutines/CoroutineScope;
/*     */     //   106: astore #9
/*     */     //   108: aload_0
/*     */     //   109: getfield $onJumpToSource : Lkotlin/jvm/functions/Function1;
/*     */     //   112: astore #10
/*     */     //   114: iconst_0
/*     */     //   115: istore #11
/*     */     //   117: aload #7
/*     */     //   119: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   124: astore #12
/*     */     //   126: iconst_0
/*     */     //   127: istore #13
/*     */     //   129: iload #8
/*     */     //   131: ifne -> 145
/*     */     //   134: aload #12
/*     */     //   136: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   139: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   142: if_acmpne -> 185
/*     */     //   145: astore #17
/*     */     //   147: astore #16
/*     */     //   149: iconst_0
/*     */     //   150: istore #14
/*     */     //   152: aload #9
/*     */     //   154: aload #10
/*     */     //   156: <illegal opcode> invoke : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
/*     */     //   161: astore #18
/*     */     //   163: aload #16
/*     */     //   165: aload #17
/*     */     //   167: aload #18
/*     */     //   169: astore #15
/*     */     //   171: aload #7
/*     */     //   173: aload #15
/*     */     //   175: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   180: aload #15
/*     */     //   182: goto -> 187
/*     */     //   185: aload #12
/*     */     //   187: nop
/*     */     //   188: nop
/*     */     //   189: nop
/*     */     //   190: checkcast kotlin/jvm/functions/Function0
/*     */     //   193: astore #6
/*     */     //   195: aload_2
/*     */     //   196: invokeinterface endReplaceGroup : ()V
/*     */     //   201: aload #6
/*     */     //   203: aload_2
/*     */     //   204: getstatic org/jetbrains/jewel/ui/icon/IntelliJIconKey.$stable : I
/*     */     //   207: iconst_3
/*     */     //   208: ishl
/*     */     //   209: invokestatic IconButtonWithTextTooltip : (Ljava/lang/String;Lorg/jetbrains/jewel/ui/icon/IconKey;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
/*     */     //   212: aload_0
/*     */     //   213: getfield $isProjectOnVCS : Z
/*     */     //   216: ifeq -> 401
/*     */     //   219: aload_0
/*     */     //   220: getfield $isCommitted : Z
/*     */     //   223: ifne -> 401
/*     */     //   226: aload_0
/*     */     //   227: getfield $change : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;
/*     */     //   230: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   233: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   238: astore #4
/*     */     //   240: aload_2
/*     */     //   241: iconst_0
/*     */     //   242: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   245: invokevirtual getAddToVcs : ()Lorg/jetbrains/jewel/ui/icon/PathIconKey;
/*     */     //   248: astore #5
/*     */     //   250: aload #4
/*     */     //   252: aload #5
/*     */     //   254: checkcast org/jetbrains/jewel/ui/icon/IconKey
/*     */     //   257: aload_2
/*     */     //   258: ldc -2079592788
/*     */     //   260: invokeinterface startReplaceGroup : (I)V
/*     */     //   265: aload_2
/*     */     //   266: astore #7
/*     */     //   268: aload_2
/*     */     //   269: aload_0
/*     */     //   270: getfield $coroutineScope : Lkotlinx/coroutines/CoroutineScope;
/*     */     //   273: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   278: aload_2
/*     */     //   279: aload_0
/*     */     //   280: getfield $onCommitAction : Lkotlin/jvm/functions/Function1;
/*     */     //   283: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   288: ior
/*     */     //   289: istore #8
/*     */     //   291: aload_0
/*     */     //   292: getfield $coroutineScope : Lkotlinx/coroutines/CoroutineScope;
/*     */     //   295: astore #9
/*     */     //   297: aload_0
/*     */     //   298: getfield $onCommitAction : Lkotlin/jvm/functions/Function1;
/*     */     //   301: astore #10
/*     */     //   303: iconst_0
/*     */     //   304: istore #11
/*     */     //   306: aload #7
/*     */     //   308: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   313: astore #12
/*     */     //   315: iconst_0
/*     */     //   316: istore #13
/*     */     //   318: iload #8
/*     */     //   320: ifne -> 334
/*     */     //   323: aload #12
/*     */     //   325: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   328: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   331: if_acmpne -> 374
/*     */     //   334: astore #17
/*     */     //   336: astore #16
/*     */     //   338: iconst_0
/*     */     //   339: istore #14
/*     */     //   341: aload #9
/*     */     //   343: aload #10
/*     */     //   345: <illegal opcode> invoke : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
/*     */     //   350: astore #18
/*     */     //   352: aload #16
/*     */     //   354: aload #17
/*     */     //   356: aload #18
/*     */     //   358: astore #15
/*     */     //   360: aload #7
/*     */     //   362: aload #15
/*     */     //   364: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   369: aload #15
/*     */     //   371: goto -> 376
/*     */     //   374: aload #12
/*     */     //   376: nop
/*     */     //   377: nop
/*     */     //   378: nop
/*     */     //   379: checkcast kotlin/jvm/functions/Function0
/*     */     //   382: astore #6
/*     */     //   384: aload_2
/*     */     //   385: invokeinterface endReplaceGroup : ()V
/*     */     //   390: aload #6
/*     */     //   392: aload_2
/*     */     //   393: getstatic org/jetbrains/jewel/ui/icon/PathIconKey.$stable : I
/*     */     //   396: iconst_3
/*     */     //   397: ishl
/*     */     //   398: invokestatic IconButtonWithTextTooltip : (Ljava/lang/String;Lorg/jetbrains/jewel/ui/icon/IconKey;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
/*     */     //   401: invokestatic isTraceInProgress : ()Z
/*     */     //   404: ifeq -> 419
/*     */     //   407: invokestatic traceEventEnd : ()V
/*     */     //   410: goto -> 419
/*     */     //   413: aload_2
/*     */     //   414: invokeinterface skipToGroupEnd : ()V
/*     */     //   419: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #162	-> 6
/*     */     //   #163	-> 39
/*     */     //   #167	-> 53
/*     */     //   #163	-> 61
/*     */     //   #167	-> 63
/*     */     //   #164	-> 102
/*     */     //   #271	-> 117
/*     */     //   #272	-> 129
/*     */     //   #273	-> 145
/*     */     //   #164	-> 152
/*     */     //   #273	-> 169
/*     */     //   #274	-> 171
/*     */     //   #275	-> 180
/*     */     //   #276	-> 185
/*     */     //   #272	-> 187
/*     */     //   #271	-> 188
/*     */     //   #271	-> 189
/*     */     //   #164	-> 190
/*     */     //   #162	-> 209
/*     */     //   #169	-> 212
/*     */     //   #172	-> 226
/*     */     //   #173	-> 242
/*     */     //   #172	-> 250
/*     */     //   #173	-> 252
/*     */     //   #171	-> 291
/*     */     //   #277	-> 306
/*     */     //   #278	-> 318
/*     */     //   #279	-> 334
/*     */     //   #171	-> 341
/*     */     //   #279	-> 358
/*     */     //   #280	-> 360
/*     */     //   #281	-> 369
/*     */     //   #282	-> 374
/*     */     //   #278	-> 376
/*     */     //   #277	-> 377
/*     */     //   #277	-> 378
/*     */     //   #171	-> 379
/*     */     //   #170	-> 398
/*     */     //   #175	-> 413
/*     */     //   #176	-> 419
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   152	9	14	$i$a$-cache-FileChangeKt$NewFileChip$1$1	I
/*     */     //   171	11	15	value$iv	Ljava/lang/Object;
/*     */     //   129	59	13	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   126	62	12	it$iv	Ljava/lang/Object;
/*     */     //   117	73	11	$i$f$cache	I
/*     */     //   114	76	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   114	76	8	invalid$iv	Z
/*     */     //   341	9	14	$i$a$-cache-FileChangeKt$NewFileChip$1$2	I
/*     */     //   360	11	15	value$iv	Ljava/lang/Object;
/*     */     //   318	59	13	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   315	62	12	it$iv	Ljava/lang/Object;
/*     */     //   306	73	11	$i$f$cache	I
/*     */     //   303	76	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   303	76	8	invalid$iv	Z
/*     */     //   0	420	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/FileChangeKt$NewFileChip$1;
/*     */     //   0	420	1	$this$FileChangeItem	Landroidx/compose/foundation/layout/RowScope;
/*     */     //   0	420	2	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	420	3	$changed	I
/*     */   }
/*     */   
/*     */   private static final Unit invoke$lambda$1$lambda$0(CoroutineScope $coroutineScope, Function1<? super Continuation<? super Unit>, ? extends Object> $onJumpToSource) {
/* 165 */     BuildersKt.launch$default($coroutineScope, null, null, new FileChangeKt$NewFileChip$1$1$1$1($onJumpToSource, null), 3, null);
/* 166 */     return Unit.INSTANCE;
/*     */   }
/*     */ 
/*     */   
/*     */   private static final Unit invoke$lambda$3$lambda$2(CoroutineScope $coroutineScope, Function1<? super Continuation<? super Unit>, ? extends Object> $onCommitAction) {
/* 171 */     BuildersKt.launch$default($coroutineScope, null, null, new FileChangeKt$NewFileChip$1$2$1$1($onCommitAction, null), 3, null); return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   FileChangeKt$NewFileChip$1(FileChangeView $change, CoroutineScope $coroutineScope, Function1<Continuation<? super Unit>, Object> $onJumpToSource, boolean $isProjectOnVCS, boolean $isCommitted, Function1<Continuation<? super Unit>, Object> $onCommitAction) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\FileChangeKt$NewFileChip$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */