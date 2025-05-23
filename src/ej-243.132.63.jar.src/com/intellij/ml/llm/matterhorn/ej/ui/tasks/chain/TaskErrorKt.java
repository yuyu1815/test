package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\026\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\032!\020\000\032\0020\0012\b\b\002\020\002\032\0020\0032\b\020\004\032\004\030\0010\005H\001¢\006\002\020\006¨\006\007"}, d2 = {"TaskError", "", "modifier", "Landroidx/compose/ui/Modifier;", "errorMessage", "", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "ej-ui"})
@SourceDebugExtension({"SMAP\nTaskError.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskError.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskErrorKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,20:1\n149#2:21\n71#3:22\n68#3,6:23\n74#3:57\n78#3:61\n79#4,6:29\n86#4,4:44\n90#4,2:54\n94#4:60\n368#5,9:35\n377#5:56\n378#5,2:58\n4034#6,6:48\n*S KotlinDebug\n*F\n+ 1 TaskError.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskErrorKt\n*L\n14#1:21\n14#1:22\n14#1:23,6\n14#1:57\n14#1:61\n14#1:29,6\n14#1:44,4\n14#1:54,2\n14#1:60\n14#1:35,9\n14#1:56\n14#1:58,2\n14#1:48,6\n*E\n"})
public final class TaskErrorKt {
  @Composable
  @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
  public static final void TaskError(@Nullable Modifier modifier, @Nullable String errorMessage, @Nullable Composer $composer, int $changed, int paramInt1) {
    // Byte code:
    //   0: aload_2
    //   1: ldc 55264952
    //   3: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
    //   8: astore_2
    //   9: iload_3
    //   10: istore #5
    //   12: iload #4
    //   14: iconst_2
    //   15: iand
    //   16: ifeq -> 29
    //   19: iload #5
    //   21: bipush #48
    //   23: ior
    //   24: istore #5
    //   26: goto -> 58
    //   29: iload_3
    //   30: bipush #48
    //   32: iand
    //   33: ifne -> 58
    //   36: iload #5
    //   38: aload_2
    //   39: aload_1
    //   40: invokeinterface changed : (Ljava/lang/Object;)Z
    //   45: ifeq -> 53
    //   48: bipush #32
    //   50: goto -> 55
    //   53: bipush #16
    //   55: ior
    //   56: istore #5
    //   58: iload #5
    //   60: bipush #17
    //   62: iand
    //   63: bipush #16
    //   65: if_icmpne -> 77
    //   68: aload_2
    //   69: invokeinterface getSkipping : ()Z
    //   74: ifne -> 539
    //   77: iload #4
    //   79: iconst_1
    //   80: iand
    //   81: ifeq -> 91
    //   84: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   87: checkcast androidx/compose/ui/Modifier
    //   90: astore_0
    //   91: invokestatic isTraceInProgress : ()Z
    //   94: ifeq -> 107
    //   97: ldc 55264952
    //   99: iload #5
    //   101: iconst_m1
    //   102: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskError (TaskError.kt:11)'
    //   104: invokestatic traceEventStart : (IIILjava/lang/String;)V
    //   107: aload_1
    //   108: ifnull -> 527
    //   111: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   114: checkcast androidx/compose/ui/Modifier
    //   117: fconst_0
    //   118: fconst_0
    //   119: bipush #12
    //   121: istore #6
    //   123: iconst_0
    //   124: istore #7
    //   126: iload #6
    //   128: i2f
    //   129: invokestatic constructor-impl : (F)F
    //   132: fconst_0
    //   133: bipush #11
    //   135: aconst_null
    //   136: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    //   139: astore #6
    //   141: bipush #6
    //   143: istore #9
    //   145: iconst_0
    //   146: istore #10
    //   148: aload_2
    //   149: ldc 733328855
    //   151: ldc 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
    //   153: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   156: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
    //   159: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
    //   162: astore #7
    //   164: iconst_0
    //   165: istore #8
    //   167: aload #7
    //   169: iload #8
    //   171: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
    //   174: astore #11
    //   176: bipush #112
    //   178: iload #9
    //   180: iconst_3
    //   181: ishl
    //   182: iand
    //   183: istore #12
    //   185: nop
    //   186: iconst_0
    //   187: istore #13
    //   189: aload_2
    //   190: ldc -1323940314
    //   192: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
    //   194: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   197: aload_2
    //   198: iconst_0
    //   199: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
    //   202: istore #14
    //   204: aload_2
    //   205: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
    //   210: astore #15
    //   212: aload_2
    //   213: aload #6
    //   215: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    //   218: astore #16
    //   220: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   223: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
    //   226: astore #17
    //   228: bipush #6
    //   230: sipush #896
    //   233: iload #12
    //   235: bipush #6
    //   237: ishl
    //   238: iand
    //   239: ior
    //   240: istore #18
    //   242: nop
    //   243: iconst_0
    //   244: istore #19
    //   246: aload_2
    //   247: ldc -692256719
    //   249: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
    //   251: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   254: aload_2
    //   255: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
    //   260: instanceof androidx/compose/runtime/Applier
    //   263: ifne -> 269
    //   266: invokestatic invalidApplier : ()V
    //   269: aload_2
    //   270: invokeinterface startReusableNode : ()V
    //   275: aload_2
    //   276: invokeinterface getInserting : ()Z
    //   281: ifeq -> 295
    //   284: aload_2
    //   285: aload #17
    //   287: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
    //   292: goto -> 301
    //   295: aload_2
    //   296: invokeinterface useNode : ()V
    //   301: aload_2
    //   302: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
    //   305: astore #20
    //   307: iconst_0
    //   308: istore #21
    //   310: aload #20
    //   312: aload #11
    //   314: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   317: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
    //   320: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   323: aload #20
    //   325: aload #15
    //   327: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   330: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
    //   333: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   336: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   339: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
    //   342: astore #22
    //   344: iconst_0
    //   345: istore #23
    //   347: aload #20
    //   349: astore #24
    //   351: iconst_0
    //   352: istore #25
    //   354: aload #24
    //   356: invokeinterface getInserting : ()Z
    //   361: ifne -> 382
    //   364: aload #24
    //   366: invokeinterface rememberedValue : ()Ljava/lang/Object;
    //   371: iload #14
    //   373: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   376: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   379: ifne -> 408
    //   382: aload #24
    //   384: iload #14
    //   386: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   389: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
    //   394: aload #20
    //   396: iload #14
    //   398: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   401: aload #22
    //   403: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   408: nop
    //   409: nop
    //   410: nop
    //   411: aload #20
    //   413: aload #16
    //   415: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   418: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
    //   421: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   424: nop
    //   425: nop
    //   426: aload_2
    //   427: bipush #14
    //   429: iload #18
    //   431: bipush #6
    //   433: ishr
    //   434: iand
    //   435: istore #26
    //   437: astore #27
    //   439: iconst_0
    //   440: istore #28
    //   442: aload #27
    //   444: ldc -2146769399
    //   446: ldc 'C73@3429L9:Box.kt#2w3rfo'
    //   448: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   451: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
    //   454: aload #27
    //   456: bipush #6
    //   458: bipush #112
    //   460: iload #9
    //   462: bipush #6
    //   464: ishr
    //   465: iand
    //   466: ior
    //   467: istore #29
    //   469: astore #30
    //   471: checkcast androidx/compose/foundation/layout/BoxScope
    //   474: astore #31
    //   476: iconst_0
    //   477: istore #32
    //   479: aconst_null
    //   480: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/ErrorInfo
    //   483: dup
    //   484: aload_1
    //   485: aconst_null
    //   486: aconst_null
    //   487: bipush #6
    //   489: aconst_null
    //   490: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   493: aload #30
    //   495: iconst_0
    //   496: iconst_1
    //   497: invokestatic ErrorComponent : (Landroidx/compose/ui/Modifier;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/ErrorInfo;Landroidx/compose/runtime/Composer;II)V
    //   500: nop
    //   501: aload #27
    //   503: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   506: aload_2
    //   507: invokeinterface endNode : ()V
    //   512: aload_2
    //   513: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   516: nop
    //   517: aload_2
    //   518: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   521: nop
    //   522: aload_2
    //   523: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   526: nop
    //   527: invokestatic isTraceInProgress : ()Z
    //   530: ifeq -> 545
    //   533: invokestatic traceEventEnd : ()V
    //   536: goto -> 545
    //   539: aload_2
    //   540: invokeinterface skipToGroupEnd : ()V
    //   545: aload_2
    //   546: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
    //   551: dup
    //   552: ifnull -> 573
    //   555: aload_0
    //   556: aload_1
    //   557: iload_3
    //   558: iload #4
    //   560: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;Ljava/lang/String;II)Lkotlin/jvm/functions/Function2;
    //   565: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
    //   570: goto -> 574
    //   573: pop
    //   574: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #12	-> 0
    //   #13	-> 107
    //   #14	-> 111
    //   #21	-> 126
    //   #14	-> 132
    //   #22	-> 153
    //   #23	-> 156
    //   #24	-> 164
    //   #27	-> 167
    //   #28	-> 185
    //   #29	-> 194
    //   #30	-> 199
    //   #31	-> 205
    //   #32	-> 213
    //   #34	-> 220
    //   #33	-> 242
    //   #35	-> 251
    //   #36	-> 254
    //   #37	-> 270
    //   #38	-> 275
    //   #39	-> 285
    //   #41	-> 296
    //   #43	-> 301
    //   #44	-> 310
    //   #45	-> 323
    //   #47	-> 336
    //   #48	-> 347
    //   #49	-> 354
    //   #50	-> 382
    //   #51	-> 394
    //   #53	-> 408
    //   #48	-> 409
    //   #53	-> 410
    //   #54	-> 411
    //   #55	-> 424
    //   #43	-> 425
    //   #56	-> 426
    //   #57	-> 448
    //   #16	-> 480
    //   #15	-> 497
    //   #18	-> 500
    //   #57	-> 501
    //   #56	-> 506
    //   #58	-> 507
    //   #35	-> 513
    //   #59	-> 516
    //   #29	-> 518
    //   #60	-> 521
    //   #22	-> 523
    //   #61	-> 526
    //   #20	-> 539
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   126	6	7	$i$f$getDp	I
    //   123	9	6	$this$dp$iv	I
    //   479	22	32	$i$a$-Box-TaskErrorKt$TaskError$1	I
    //   476	25	31	$this$TaskError_u24lambda_u240	Landroidx/compose/foundation/layout/BoxScope;
    //   476	25	30	$composer	Landroidx/compose/runtime/Composer;
    //   476	25	29	$changed	I
    //   442	64	28	$i$a$-Layout-BoxKt$Box$1$iv	I
    //   439	67	27	$composer$iv	Landroidx/compose/runtime/Composer;
    //   439	67	26	$changed$iv	I
    //   354	55	25	$i$a$-with-Updater$set$1$iv$iv$iv	I
    //   351	58	24	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
    //   347	64	23	$i$f$set-impl	I
    //   344	67	22	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
    //   310	115	21	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
    //   307	118	20	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
    //   246	271	19	$i$f$ReusableComposeNode	I
    //   243	274	17	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
    //   243	274	18	$changed$iv$iv$iv	I
    //   189	333	13	$i$f$Layout	I
    //   204	318	14	compositeKeyHash$iv$iv	I
    //   212	310	15	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
    //   220	302	16	materialized$iv$iv	Landroidx/compose/ui/Modifier;
    //   186	336	12	$changed$iv$iv	I
    //   148	379	10	$i$f$Box	I
    //   176	351	11	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
    //   145	382	6	modifier$iv	Landroidx/compose/ui/Modifier;
    //   164	363	7	contentAlignment$iv	Landroidx/compose/ui/Alignment;
    //   167	360	8	propagateMinConstraints$iv	Z
    //   145	382	9	$changed$iv	I
    //   12	563	5	$dirty	I
    //   0	575	0	modifier	Landroidx/compose/ui/Modifier;
    //   0	575	1	errorMessage	Ljava/lang/String;
    //   0	575	2	$composer	Landroidx/compose/runtime/Composer;
    //   0	575	3	$changed	I
  }
  
  private static final Unit TaskError$lambda$1(Modifier $modifier, String $errorMessage, int $$changed, int $$default, Composer $composer, int $force) {
    TaskError($modifier, $errorMessage, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
    return Unit.INSTANCE;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\TaskErrorKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */