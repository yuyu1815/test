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
/*     */ import kotlin.jvm.functions.Function0;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */ @SourceDebugExtension({"SMAP\nFileChange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileChange.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/FileChangeKt$FileChangeChipPrivate$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,270:1\n1225#2,6:271\n1225#2,6:277\n*S KotlinDebug\n*F\n+ 1 FileChange.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/FileChangeKt$FileChangeChipPrivate$2\n*L\n119#1:271,6\n125#1:277,6\n*E\n"})
/*     */ final class FileChangeKt$FileChangeChipPrivate$2
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
/*     */     //   21: ifne -> 474
/*     */     //   24: invokestatic isTraceInProgress : ()Z
/*     */     //   27: ifeq -> 39
/*     */     //   30: ldc -1922590140
/*     */     //   32: iload_3
/*     */     //   33: iconst_m1
/*     */     //   34: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.FileChangeChipPrivate.<anonymous> (FileChange.kt:115)'
/*     */     //   36: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   39: aload_0
/*     */     //   40: getfield $onRollBack : Lkotlin/jvm/functions/Function1;
/*     */     //   43: ifnull -> 462
/*     */     //   46: aload_0
/*     */     //   47: getfield $change : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;
/*     */     //   50: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   53: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   58: astore #4
/*     */     //   60: getstatic org/jetbrains/jewel/ui/icons/AllIconsKeys$Actions.INSTANCE : Lorg/jetbrains/jewel/ui/icons/AllIconsKeys$Actions;
/*     */     //   63: invokevirtual getRollback : ()Lorg/jetbrains/jewel/ui/icon/IntelliJIconKey;
/*     */     //   66: astore #5
/*     */     //   68: aload #4
/*     */     //   70: aload #5
/*     */     //   72: checkcast org/jetbrains/jewel/ui/icon/IconKey
/*     */     //   75: aload_2
/*     */     //   76: ldc 481981803
/*     */     //   78: invokeinterface startReplaceGroup : (I)V
/*     */     //   83: aload_2
/*     */     //   84: astore #7
/*     */     //   86: aload_2
/*     */     //   87: aload_0
/*     */     //   88: getfield $coroutineScope : Lkotlinx/coroutines/CoroutineScope;
/*     */     //   91: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   96: aload_2
/*     */     //   97: aload_0
/*     */     //   98: getfield $onRollBack : Lkotlin/jvm/functions/Function1;
/*     */     //   101: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   106: ior
/*     */     //   107: istore #8
/*     */     //   109: aload_0
/*     */     //   110: getfield $coroutineScope : Lkotlinx/coroutines/CoroutineScope;
/*     */     //   113: astore #9
/*     */     //   115: aload_0
/*     */     //   116: getfield $onRollBack : Lkotlin/jvm/functions/Function1;
/*     */     //   119: astore #10
/*     */     //   121: iconst_0
/*     */     //   122: istore #11
/*     */     //   124: aload #7
/*     */     //   126: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   131: astore #12
/*     */     //   133: iconst_0
/*     */     //   134: istore #13
/*     */     //   136: iload #8
/*     */     //   138: ifne -> 152
/*     */     //   141: aload #12
/*     */     //   143: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   146: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   149: if_acmpne -> 192
/*     */     //   152: astore #17
/*     */     //   154: astore #16
/*     */     //   156: iconst_0
/*     */     //   157: istore #14
/*     */     //   159: aload #9
/*     */     //   161: aload #10
/*     */     //   163: <illegal opcode> invoke : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
/*     */     //   168: astore #18
/*     */     //   170: aload #16
/*     */     //   172: aload #17
/*     */     //   174: aload #18
/*     */     //   176: astore #15
/*     */     //   178: aload #7
/*     */     //   180: aload #15
/*     */     //   182: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   187: aload #15
/*     */     //   189: goto -> 194
/*     */     //   192: aload #12
/*     */     //   194: nop
/*     */     //   195: nop
/*     */     //   196: nop
/*     */     //   197: checkcast kotlin/jvm/functions/Function0
/*     */     //   200: astore #6
/*     */     //   202: aload_2
/*     */     //   203: invokeinterface endReplaceGroup : ()V
/*     */     //   208: aload #6
/*     */     //   210: aload_2
/*     */     //   211: getstatic org/jetbrains/jewel/ui/icon/IntelliJIconKey.$stable : I
/*     */     //   214: iconst_3
/*     */     //   215: ishl
/*     */     //   216: invokestatic IconButtonWithTextTooltip : (Ljava/lang/String;Lorg/jetbrains/jewel/ui/icon/IconKey;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
/*     */     //   219: aload_2
/*     */     //   220: ldc 481985600
/*     */     //   222: invokeinterface startReplaceGroup : (I)V
/*     */     //   227: aload_0
/*     */     //   228: getfield $onLocate : Lkotlin/jvm/functions/Function1;
/*     */     //   231: ifnull -> 407
/*     */     //   234: aload_0
/*     */     //   235: getfield $change : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;
/*     */     //   238: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   241: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   246: astore #4
/*     */     //   248: getstatic org/jetbrains/jewel/ui/icons/AllIconsKeys$General.INSTANCE : Lorg/jetbrains/jewel/ui/icons/AllIconsKeys$General;
/*     */     //   251: invokevirtual getLocate : ()Lorg/jetbrains/jewel/ui/icon/IntelliJIconKey;
/*     */     //   254: astore #5
/*     */     //   256: aload #4
/*     */     //   258: aload #5
/*     */     //   260: checkcast org/jetbrains/jewel/ui/icon/IconKey
/*     */     //   263: aload_2
/*     */     //   264: ldc 481989929
/*     */     //   266: invokeinterface startReplaceGroup : (I)V
/*     */     //   271: aload_2
/*     */     //   272: astore #7
/*     */     //   274: aload_2
/*     */     //   275: aload_0
/*     */     //   276: getfield $coroutineScope : Lkotlinx/coroutines/CoroutineScope;
/*     */     //   279: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   284: aload_2
/*     */     //   285: aload_0
/*     */     //   286: getfield $onLocate : Lkotlin/jvm/functions/Function1;
/*     */     //   289: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   294: ior
/*     */     //   295: istore #8
/*     */     //   297: aload_0
/*     */     //   298: getfield $coroutineScope : Lkotlinx/coroutines/CoroutineScope;
/*     */     //   301: astore #9
/*     */     //   303: aload_0
/*     */     //   304: getfield $onLocate : Lkotlin/jvm/functions/Function1;
/*     */     //   307: astore #10
/*     */     //   309: iconst_0
/*     */     //   310: istore #11
/*     */     //   312: aload #7
/*     */     //   314: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   319: astore #12
/*     */     //   321: iconst_0
/*     */     //   322: istore #13
/*     */     //   324: iload #8
/*     */     //   326: ifne -> 340
/*     */     //   329: aload #12
/*     */     //   331: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   334: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   337: if_acmpne -> 380
/*     */     //   340: astore #17
/*     */     //   342: astore #16
/*     */     //   344: iconst_0
/*     */     //   345: istore #14
/*     */     //   347: aload #9
/*     */     //   349: aload #10
/*     */     //   351: <illegal opcode> invoke : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
/*     */     //   356: astore #18
/*     */     //   358: aload #16
/*     */     //   360: aload #17
/*     */     //   362: aload #18
/*     */     //   364: astore #15
/*     */     //   366: aload #7
/*     */     //   368: aload #15
/*     */     //   370: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   375: aload #15
/*     */     //   377: goto -> 382
/*     */     //   380: aload #12
/*     */     //   382: nop
/*     */     //   383: nop
/*     */     //   384: nop
/*     */     //   385: checkcast kotlin/jvm/functions/Function0
/*     */     //   388: astore #6
/*     */     //   390: aload_2
/*     */     //   391: invokeinterface endReplaceGroup : ()V
/*     */     //   396: aload #6
/*     */     //   398: aload_2
/*     */     //   399: getstatic org/jetbrains/jewel/ui/icon/IntelliJIconKey.$stable : I
/*     */     //   402: iconst_3
/*     */     //   403: ishl
/*     */     //   404: invokestatic IconButtonWithTextTooltip : (Ljava/lang/String;Lorg/jetbrains/jewel/ui/icon/IconKey;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
/*     */     //   407: aload_2
/*     */     //   408: invokeinterface endReplaceGroup : ()V
/*     */     //   413: aload_0
/*     */     //   414: getfield $onShowDiff : Lkotlin/jvm/functions/Function0;
/*     */     //   417: ifnull -> 462
/*     */     //   420: aload_0
/*     */     //   421: getfield $change : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;
/*     */     //   424: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   427: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   432: astore #4
/*     */     //   434: getstatic org/jetbrains/jewel/ui/icons/AllIconsKeys$Actions.INSTANCE : Lorg/jetbrains/jewel/ui/icons/AllIconsKeys$Actions;
/*     */     //   437: invokevirtual getDiff : ()Lorg/jetbrains/jewel/ui/icon/IntelliJIconKey;
/*     */     //   440: astore #5
/*     */     //   442: aload #4
/*     */     //   444: aload #5
/*     */     //   446: checkcast org/jetbrains/jewel/ui/icon/IconKey
/*     */     //   449: aload_0
/*     */     //   450: getfield $onShowDiff : Lkotlin/jvm/functions/Function0;
/*     */     //   453: aload_2
/*     */     //   454: getstatic org/jetbrains/jewel/ui/icon/IntelliJIconKey.$stable : I
/*     */     //   457: iconst_3
/*     */     //   458: ishl
/*     */     //   459: invokestatic IconButtonWithTextTooltip : (Ljava/lang/String;Lorg/jetbrains/jewel/ui/icon/IconKey;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
/*     */     //   462: invokestatic isTraceInProgress : ()Z
/*     */     //   465: ifeq -> 480
/*     */     //   468: invokestatic traceEventEnd : ()V
/*     */     //   471: goto -> 480
/*     */     //   474: aload_2
/*     */     //   475: invokeinterface skipToGroupEnd : ()V
/*     */     //   480: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #116	-> 6
/*     */     //   #118	-> 46
/*     */     //   #120	-> 60
/*     */     //   #118	-> 68
/*     */     //   #120	-> 70
/*     */     //   #119	-> 109
/*     */     //   #271	-> 124
/*     */     //   #272	-> 136
/*     */     //   #273	-> 152
/*     */     //   #119	-> 159
/*     */     //   #273	-> 176
/*     */     //   #274	-> 178
/*     */     //   #275	-> 187
/*     */     //   #276	-> 192
/*     */     //   #272	-> 194
/*     */     //   #271	-> 195
/*     */     //   #271	-> 196
/*     */     //   #119	-> 197
/*     */     //   #117	-> 216
/*     */     //   #122	-> 227
/*     */     //   #124	-> 234
/*     */     //   #126	-> 248
/*     */     //   #124	-> 256
/*     */     //   #126	-> 258
/*     */     //   #125	-> 297
/*     */     //   #277	-> 312
/*     */     //   #278	-> 324
/*     */     //   #279	-> 340
/*     */     //   #125	-> 347
/*     */     //   #279	-> 364
/*     */     //   #280	-> 366
/*     */     //   #281	-> 375
/*     */     //   #282	-> 380
/*     */     //   #278	-> 382
/*     */     //   #277	-> 383
/*     */     //   #277	-> 384
/*     */     //   #125	-> 385
/*     */     //   #123	-> 404
/*     */     //   #129	-> 413
/*     */     //   #131	-> 420
/*     */     //   #133	-> 434
/*     */     //   #131	-> 442
/*     */     //   #133	-> 444
/*     */     //   #132	-> 449
/*     */     //   #130	-> 459
/*     */     //   #136	-> 474
/*     */     //   #137	-> 480
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   159	9	14	$i$a$-cache-FileChangeKt$FileChangeChipPrivate$2$1	I
/*     */     //   178	11	15	value$iv	Ljava/lang/Object;
/*     */     //   136	59	13	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   133	62	12	it$iv	Ljava/lang/Object;
/*     */     //   124	73	11	$i$f$cache	I
/*     */     //   121	76	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   121	76	8	invalid$iv	Z
/*     */     //   347	9	14	$i$a$-cache-FileChangeKt$FileChangeChipPrivate$2$2	I
/*     */     //   366	11	15	value$iv	Ljava/lang/Object;
/*     */     //   324	59	13	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   321	62	12	it$iv	Ljava/lang/Object;
/*     */     //   312	73	11	$i$f$cache	I
/*     */     //   309	76	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   309	76	8	invalid$iv	Z
/*     */     //   0	481	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/FileChangeKt$FileChangeChipPrivate$2;
/*     */     //   0	481	1	$this$FileChangeItem	Landroidx/compose/foundation/layout/RowScope;
/*     */     //   0	481	2	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	481	3	$changed	I
/*     */   }
/*     */   
/*     */   private static final Unit invoke$lambda$1$lambda$0(CoroutineScope $coroutineScope, Function1<? super Continuation<? super Unit>, ? extends Object> $onRollBack) {
/* 119 */     BuildersKt.launch$default($coroutineScope, null, null, new FileChangeKt$FileChangeChipPrivate$2$1$1$1($onRollBack, null), 3, null); return Unit.INSTANCE;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static final Unit invoke$lambda$3$lambda$2(CoroutineScope $coroutineScope, Function1<? super Continuation<? super Unit>, ? extends Object> $onLocate) {
/* 125 */     BuildersKt.launch$default($coroutineScope, null, null, new FileChangeKt$FileChangeChipPrivate$2$2$1$1($onLocate, null), 3, null); return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   FileChangeKt$FileChangeChipPrivate$2(Function1<Continuation<? super Unit>, Object> $onRollBack, FileChangeView $change, CoroutineScope $coroutineScope, Function1<Continuation<? super Unit>, Object> $onLocate, Function0<Unit> $onShowDiff) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\FileChangeKt$FileChangeChipPrivate$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */