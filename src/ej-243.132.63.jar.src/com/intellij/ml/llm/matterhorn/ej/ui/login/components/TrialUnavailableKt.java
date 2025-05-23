package com.intellij.ml.llm.matterhorn.ej.ui.login.components;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.header.Action;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\034\n\000\n\002\020\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\032-\020\000\032\0020\0012\006\020\002\032\0020\0032\b\020\004\032\004\030\0010\0052\f\020\006\032\b\022\004\022\0020\0010\007H\001¢\006\002\020\b¨\006\t"}, d2 = {"TrialUnavailable", "", "reason", "", "action", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;", "onRetry", "Lkotlin/Function0;", "(Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ej-ui"})
@SourceDebugExtension({"SMAP\nTrialUnavailable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrialUnavailable.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/components/TrialUnavailableKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,28:1\n149#2:29\n86#3:30\n84#3,5:31\n89#3:64\n93#3:68\n79#4,6:36\n86#4,4:51\n90#4,2:61\n94#4:67\n368#5,9:42\n377#5:63\n378#5,2:65\n4034#6,6:55\n*S KotlinDebug\n*F\n+ 1 TrialUnavailable.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/components/TrialUnavailableKt\n*L\n20#1:29\n18#1:30\n18#1:31,5\n18#1:64\n18#1:68\n18#1:36,6\n18#1:51,4\n18#1:61,2\n18#1:67\n18#1:42,9\n18#1:63\n18#1:65,2\n18#1:55,6\n*E\n"})
public final class TrialUnavailableKt {
  @Composable
  @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
  public static final void TrialUnavailable(@NotNull String reason, @Nullable Action action, @NotNull Function0 onRetry, @Nullable Composer $composer, int $changed) {
    // Byte code:
    //   0: aload_0
    //   1: ldc 'reason'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_2
    //   7: ldc 'onRetry'
    //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   12: aload_3
    //   13: ldc -528860501
    //   15: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
    //   20: astore_3
    //   21: iload #4
    //   23: istore #5
    //   25: iload #4
    //   27: bipush #6
    //   29: iand
    //   30: ifne -> 53
    //   33: iload #5
    //   35: aload_3
    //   36: aload_0
    //   37: invokeinterface changed : (Ljava/lang/Object;)Z
    //   42: ifeq -> 49
    //   45: iconst_4
    //   46: goto -> 50
    //   49: iconst_2
    //   50: ior
    //   51: istore #5
    //   53: iload #4
    //   55: bipush #48
    //   57: iand
    //   58: ifne -> 83
    //   61: iload #5
    //   63: aload_3
    //   64: aload_1
    //   65: invokeinterface changed : (Ljava/lang/Object;)Z
    //   70: ifeq -> 78
    //   73: bipush #32
    //   75: goto -> 80
    //   78: bipush #16
    //   80: ior
    //   81: istore #5
    //   83: iload #4
    //   85: sipush #384
    //   88: iand
    //   89: ifne -> 116
    //   92: iload #5
    //   94: aload_3
    //   95: aload_2
    //   96: invokeinterface changedInstance : (Ljava/lang/Object;)Z
    //   101: ifeq -> 110
    //   104: sipush #256
    //   107: goto -> 113
    //   110: sipush #128
    //   113: ior
    //   114: istore #5
    //   116: iload #5
    //   118: sipush #147
    //   121: iand
    //   122: sipush #146
    //   125: if_icmpne -> 137
    //   128: aload_3
    //   129: invokeinterface getSkipping : ()Z
    //   134: ifne -> 667
    //   137: invokestatic isTraceInProgress : ()Z
    //   140: ifeq -> 153
    //   143: ldc -528860501
    //   145: iload #5
    //   147: iconst_m1
    //   148: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.login.components.TrialUnavailable (TrialUnavailable.kt:16)'
    //   150: invokestatic traceEventStart : (IIILjava/lang/String;)V
    //   153: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   156: checkcast androidx/compose/ui/Modifier
    //   159: fconst_0
    //   160: invokestatic getActivationMinHeight : ()F
    //   163: iconst_1
    //   164: aconst_null
    //   165: invokestatic defaultMinSize-VpY3zN4$default : (Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    //   168: astore #6
    //   170: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
    //   173: bipush #16
    //   175: istore #7
    //   177: iconst_0
    //   178: istore #8
    //   180: iload #7
    //   182: i2f
    //   183: invokestatic constructor-impl : (F)F
    //   186: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
    //   189: invokevirtual getTop : ()Landroidx/compose/ui/Alignment$Vertical;
    //   192: invokevirtual spacedBy-D5KLDUw : (FLandroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/foundation/layout/Arrangement$Vertical;
    //   195: astore #7
    //   197: bipush #54
    //   199: istore #9
    //   201: nop
    //   202: iconst_0
    //   203: istore #10
    //   205: aload_3
    //   206: ldc -483455358
    //   208: ldc 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
    //   210: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   213: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
    //   216: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
    //   219: astore #8
    //   221: aload #7
    //   223: aload #8
    //   225: aload_3
    //   226: bipush #14
    //   228: iload #9
    //   230: iconst_3
    //   231: ishr
    //   232: iand
    //   233: bipush #112
    //   235: iload #9
    //   237: iconst_3
    //   238: ishr
    //   239: iand
    //   240: ior
    //   241: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
    //   244: astore #11
    //   246: bipush #112
    //   248: iload #9
    //   250: iconst_3
    //   251: ishl
    //   252: iand
    //   253: istore #12
    //   255: nop
    //   256: iconst_0
    //   257: istore #13
    //   259: aload_3
    //   260: ldc -1323940314
    //   262: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
    //   264: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   267: aload_3
    //   268: iconst_0
    //   269: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
    //   272: istore #14
    //   274: aload_3
    //   275: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
    //   280: astore #15
    //   282: aload_3
    //   283: aload #6
    //   285: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    //   288: astore #16
    //   290: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   293: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
    //   296: astore #17
    //   298: bipush #6
    //   300: sipush #896
    //   303: iload #12
    //   305: bipush #6
    //   307: ishl
    //   308: iand
    //   309: ior
    //   310: istore #18
    //   312: nop
    //   313: iconst_0
    //   314: istore #19
    //   316: aload_3
    //   317: ldc -692256719
    //   319: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
    //   321: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   324: aload_3
    //   325: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
    //   330: instanceof androidx/compose/runtime/Applier
    //   333: ifne -> 339
    //   336: invokestatic invalidApplier : ()V
    //   339: aload_3
    //   340: invokeinterface startReusableNode : ()V
    //   345: aload_3
    //   346: invokeinterface getInserting : ()Z
    //   351: ifeq -> 365
    //   354: aload_3
    //   355: aload #17
    //   357: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
    //   362: goto -> 371
    //   365: aload_3
    //   366: invokeinterface useNode : ()V
    //   371: aload_3
    //   372: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
    //   375: astore #20
    //   377: iconst_0
    //   378: istore #21
    //   380: aload #20
    //   382: aload #11
    //   384: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   387: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
    //   390: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   393: aload #20
    //   395: aload #15
    //   397: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   400: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
    //   403: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   406: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   409: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
    //   412: astore #22
    //   414: iconst_0
    //   415: istore #23
    //   417: aload #20
    //   419: astore #24
    //   421: iconst_0
    //   422: istore #25
    //   424: aload #24
    //   426: invokeinterface getInserting : ()Z
    //   431: ifne -> 452
    //   434: aload #24
    //   436: invokeinterface rememberedValue : ()Ljava/lang/Object;
    //   441: iload #14
    //   443: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   446: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   449: ifne -> 478
    //   452: aload #24
    //   454: iload #14
    //   456: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   459: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
    //   464: aload #20
    //   466: iload #14
    //   468: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   471: aload #22
    //   473: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   478: nop
    //   479: nop
    //   480: nop
    //   481: aload #20
    //   483: aload #16
    //   485: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   488: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
    //   491: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   494: nop
    //   495: nop
    //   496: aload_3
    //   497: bipush #14
    //   499: iload #18
    //   501: bipush #6
    //   503: ishr
    //   504: iand
    //   505: istore #26
    //   507: astore #27
    //   509: iconst_0
    //   510: istore #28
    //   512: aload #27
    //   514: ldc -384784025
    //   516: ldc 'C88@4444L9:Column.kt#2w3rfo'
    //   518: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   521: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
    //   524: aload #27
    //   526: bipush #6
    //   528: bipush #112
    //   530: iload #9
    //   532: bipush #6
    //   534: ishr
    //   535: iand
    //   536: ior
    //   537: istore #29
    //   539: astore #30
    //   541: checkcast androidx/compose/foundation/layout/ColumnScope
    //   544: astore #31
    //   546: iconst_0
    //   547: istore #32
    //   549: aload_0
    //   550: lconst_0
    //   551: aload #30
    //   553: bipush #14
    //   555: iload #5
    //   557: iand
    //   558: iconst_2
    //   559: invokestatic Title-iJQMabo : (Ljava/lang/String;JLandroidx/compose/runtime/Composer;II)V
    //   562: aload #30
    //   564: ldc 80867884
    //   566: invokeinterface startReplaceGroup : (I)V
    //   571: aload_1
    //   572: ifnull -> 594
    //   575: aload_1
    //   576: invokevirtual getName : ()Ljava/lang/String;
    //   579: aconst_null
    //   580: iconst_0
    //   581: aload_1
    //   582: invokevirtual getAction : ()Lkotlin/jvm/functions/Function0;
    //   585: aconst_null
    //   586: aload #30
    //   588: iconst_0
    //   589: bipush #22
    //   591: invokestatic Button : (Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    //   594: aload #30
    //   596: invokeinterface endReplaceGroup : ()V
    //   601: ldc 'Retry'
    //   603: aload_2
    //   604: aconst_null
    //   605: iconst_0
    //   606: aconst_null
    //   607: iconst_0
    //   608: aconst_null
    //   609: aconst_null
    //   610: aload #30
    //   612: bipush #6
    //   614: bipush #112
    //   616: iload #5
    //   618: iconst_3
    //   619: ishr
    //   620: iand
    //   621: ior
    //   622: sipush #252
    //   625: invokestatic Link-kye4rC8 : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;Landroidx/compose/runtime/Composer;II)V
    //   628: nop
    //   629: aload #27
    //   631: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   634: aload_3
    //   635: invokeinterface endNode : ()V
    //   640: aload_3
    //   641: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   644: nop
    //   645: aload_3
    //   646: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   649: nop
    //   650: aload_3
    //   651: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   654: nop
    //   655: invokestatic isTraceInProgress : ()Z
    //   658: ifeq -> 673
    //   661: invokestatic traceEventEnd : ()V
    //   664: goto -> 673
    //   667: aload_3
    //   668: invokeinterface skipToGroupEnd : ()V
    //   673: aload_3
    //   674: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
    //   679: dup
    //   680: ifnull -> 701
    //   683: aload_0
    //   684: aload_1
    //   685: aload_2
    //   686: iload #4
    //   688: <illegal opcode> invoke : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;Lkotlin/jvm/functions/Function0;I)Lkotlin/jvm/functions/Function2;
    //   693: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
    //   698: goto -> 702
    //   701: pop
    //   702: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #17	-> 12
    //   #19	-> 153
    //   #20	-> 170
    //   #29	-> 180
    //   #20	-> 186
    //   #18	-> 201
    //   #30	-> 210
    //   #31	-> 213
    //   #34	-> 221
    //   #35	-> 255
    //   #36	-> 264
    //   #37	-> 269
    //   #38	-> 275
    //   #39	-> 283
    //   #41	-> 290
    //   #40	-> 312
    //   #42	-> 321
    //   #43	-> 324
    //   #44	-> 340
    //   #45	-> 345
    //   #46	-> 355
    //   #48	-> 366
    //   #50	-> 371
    //   #51	-> 380
    //   #52	-> 393
    //   #54	-> 406
    //   #55	-> 417
    //   #56	-> 424
    //   #57	-> 452
    //   #58	-> 464
    //   #60	-> 478
    //   #55	-> 479
    //   #60	-> 480
    //   #61	-> 481
    //   #62	-> 494
    //   #50	-> 495
    //   #63	-> 496
    //   #64	-> 518
    //   #22	-> 549
    //   #23	-> 571
    //   #24	-> 575
    //   #26	-> 601
    //   #27	-> 628
    //   #64	-> 629
    //   #63	-> 634
    //   #65	-> 635
    //   #42	-> 641
    //   #66	-> 644
    //   #36	-> 646
    //   #67	-> 649
    //   #30	-> 651
    //   #68	-> 654
    //   #28	-> 667
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   180	6	8	$i$f$getDp	I
    //   177	9	7	$this$dp$iv	I
    //   549	80	32	$i$a$-Column-TrialUnavailableKt$TrialUnavailable$1	I
    //   546	83	31	$this$TrialUnavailable_u24lambda_u240	Landroidx/compose/foundation/layout/ColumnScope;
    //   546	83	30	$composer	Landroidx/compose/runtime/Composer;
    //   546	83	29	$changed	I
    //   512	122	28	$i$a$-Layout-ColumnKt$Column$1$iv	I
    //   509	125	27	$composer$iv	Landroidx/compose/runtime/Composer;
    //   509	125	26	$changed$iv	I
    //   424	55	25	$i$a$-with-Updater$set$1$iv$iv$iv	I
    //   421	58	24	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
    //   417	64	23	$i$f$set-impl	I
    //   414	67	22	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
    //   380	115	21	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
    //   377	118	20	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
    //   316	329	19	$i$f$ReusableComposeNode	I
    //   313	332	17	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
    //   313	332	18	$changed$iv$iv$iv	I
    //   259	391	13	$i$f$Layout	I
    //   274	376	14	compositeKeyHash$iv$iv	I
    //   282	368	15	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
    //   290	360	16	materialized$iv$iv	Landroidx/compose/ui/Modifier;
    //   256	394	12	$changed$iv$iv	I
    //   205	450	10	$i$f$Column	I
    //   246	409	11	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
    //   202	453	6	modifier$iv	Landroidx/compose/ui/Modifier;
    //   202	453	7	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
    //   221	434	8	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
    //   202	453	9	$changed$iv	I
    //   25	678	5	$dirty	I
    //   0	703	0	reason	Ljava/lang/String;
    //   0	703	1	action	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
    //   0	703	2	onRetry	Lkotlin/jvm/functions/Function0;
    //   0	703	3	$composer	Landroidx/compose/runtime/Composer;
    //   0	703	4	$changed	I
  }
  
  private static final Unit TrialUnavailable$lambda$1(String $reason, Action $action, Function0<Unit> $onRetry, int $$changed, Composer $composer, int $force) {
    TrialUnavailable($reason, $action, $onRetry, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
    return Unit.INSTANCE;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\components\TrialUnavailableKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */