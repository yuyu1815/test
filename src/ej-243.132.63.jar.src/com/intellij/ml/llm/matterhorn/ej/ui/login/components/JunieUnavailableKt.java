package com.intellij.ml.llm.matterhorn.ej.ui.login.components;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\026\n\000\n\002\020\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\032%\020\000\032\0020\0012\006\020\002\032\0020\0032\016\020\004\032\n\022\004\022\0020\001\030\0010\005H\001¢\006\002\020\006¨\006\007"}, d2 = {"JunieUnavailable", "", "reason", "", "onRefresh", "Lkotlin/Function0;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ej-ui"})
@SourceDebugExtension({"SMAP\nJunieUnavailable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieUnavailable.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/components/JunieUnavailableKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,36:1\n149#2:37\n86#3:38\n84#3,5:39\n89#3:72\n93#3:76\n79#4,6:44\n86#4,4:59\n90#4,2:69\n94#4:75\n368#5,9:50\n377#5:71\n378#5,2:73\n4034#6,6:63\n*S KotlinDebug\n*F\n+ 1 JunieUnavailable.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/components/JunieUnavailableKt\n*L\n19#1:37\n16#1:38\n16#1:39,5\n16#1:72\n16#1:76\n16#1:44,6\n16#1:59,4\n16#1:69,2\n16#1:75\n16#1:50,9\n16#1:71\n16#1:73,2\n16#1:63,6\n*E\n"})
public final class JunieUnavailableKt {
  @Composable
  @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
  public static final void JunieUnavailable(@NotNull String reason, @Nullable Function0 onRefresh, @Nullable Composer $composer, int $changed) {
    // Byte code:
    //   0: aload_0
    //   1: ldc 'reason'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_2
    //   7: ldc 737137213
    //   9: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
    //   14: astore_2
    //   15: iload_3
    //   16: istore #4
    //   18: iload_3
    //   19: bipush #6
    //   21: iand
    //   22: ifne -> 45
    //   25: iload #4
    //   27: aload_2
    //   28: aload_0
    //   29: invokeinterface changed : (Ljava/lang/Object;)Z
    //   34: ifeq -> 41
    //   37: iconst_4
    //   38: goto -> 42
    //   41: iconst_2
    //   42: ior
    //   43: istore #4
    //   45: iload_3
    //   46: bipush #48
    //   48: iand
    //   49: ifne -> 74
    //   52: iload #4
    //   54: aload_2
    //   55: aload_1
    //   56: invokeinterface changedInstance : (Ljava/lang/Object;)Z
    //   61: ifeq -> 69
    //   64: bipush #32
    //   66: goto -> 71
    //   69: bipush #16
    //   71: ior
    //   72: istore #4
    //   74: iload #4
    //   76: bipush #19
    //   78: iand
    //   79: bipush #18
    //   81: if_icmpne -> 93
    //   84: aload_2
    //   85: invokeinterface getSkipping : ()Z
    //   90: ifne -> 634
    //   93: invokestatic isTraceInProgress : ()Z
    //   96: ifeq -> 109
    //   99: ldc 737137213
    //   101: iload #4
    //   103: iconst_m1
    //   104: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.login.components.JunieUnavailable (JunieUnavailable.kt:14)'
    //   106: invokestatic traceEventStart : (IIILjava/lang/String;)V
    //   109: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   112: checkcast androidx/compose/ui/Modifier
    //   115: fconst_0
    //   116: invokestatic getActivationMinHeight : ()F
    //   119: iconst_1
    //   120: aconst_null
    //   121: invokestatic defaultMinSize-VpY3zN4$default : (Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    //   124: astore #5
    //   126: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
    //   129: bipush #16
    //   131: istore #6
    //   133: iconst_0
    //   134: istore #7
    //   136: iload #6
    //   138: i2f
    //   139: invokestatic constructor-impl : (F)F
    //   142: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
    //   145: checkcast androidx/compose/foundation/layout/Arrangement$Vertical
    //   148: astore #6
    //   150: bipush #54
    //   152: istore #8
    //   154: nop
    //   155: iconst_0
    //   156: istore #9
    //   158: aload_2
    //   159: ldc -483455358
    //   161: ldc 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
    //   163: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   166: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
    //   169: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
    //   172: astore #7
    //   174: aload #6
    //   176: aload #7
    //   178: aload_2
    //   179: bipush #14
    //   181: iload #8
    //   183: iconst_3
    //   184: ishr
    //   185: iand
    //   186: bipush #112
    //   188: iload #8
    //   190: iconst_3
    //   191: ishr
    //   192: iand
    //   193: ior
    //   194: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
    //   197: astore #10
    //   199: bipush #112
    //   201: iload #8
    //   203: iconst_3
    //   204: ishl
    //   205: iand
    //   206: istore #11
    //   208: nop
    //   209: iconst_0
    //   210: istore #12
    //   212: aload_2
    //   213: ldc -1323940314
    //   215: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
    //   217: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   220: aload_2
    //   221: iconst_0
    //   222: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
    //   225: istore #13
    //   227: aload_2
    //   228: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
    //   233: astore #14
    //   235: aload_2
    //   236: aload #5
    //   238: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    //   241: astore #15
    //   243: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   246: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
    //   249: astore #16
    //   251: bipush #6
    //   253: sipush #896
    //   256: iload #11
    //   258: bipush #6
    //   260: ishl
    //   261: iand
    //   262: ior
    //   263: istore #17
    //   265: nop
    //   266: iconst_0
    //   267: istore #18
    //   269: aload_2
    //   270: ldc -692256719
    //   272: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
    //   274: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   277: aload_2
    //   278: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
    //   283: instanceof androidx/compose/runtime/Applier
    //   286: ifne -> 292
    //   289: invokestatic invalidApplier : ()V
    //   292: aload_2
    //   293: invokeinterface startReusableNode : ()V
    //   298: aload_2
    //   299: invokeinterface getInserting : ()Z
    //   304: ifeq -> 318
    //   307: aload_2
    //   308: aload #16
    //   310: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
    //   315: goto -> 324
    //   318: aload_2
    //   319: invokeinterface useNode : ()V
    //   324: aload_2
    //   325: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
    //   328: astore #19
    //   330: iconst_0
    //   331: istore #20
    //   333: aload #19
    //   335: aload #10
    //   337: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   340: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
    //   343: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   346: aload #19
    //   348: aload #14
    //   350: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   353: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
    //   356: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   359: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   362: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
    //   365: astore #21
    //   367: iconst_0
    //   368: istore #22
    //   370: aload #19
    //   372: astore #23
    //   374: iconst_0
    //   375: istore #24
    //   377: aload #23
    //   379: invokeinterface getInserting : ()Z
    //   384: ifne -> 405
    //   387: aload #23
    //   389: invokeinterface rememberedValue : ()Ljava/lang/Object;
    //   394: iload #13
    //   396: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   399: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   402: ifne -> 431
    //   405: aload #23
    //   407: iload #13
    //   409: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   412: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
    //   417: aload #19
    //   419: iload #13
    //   421: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   424: aload #21
    //   426: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   431: nop
    //   432: nop
    //   433: nop
    //   434: aload #19
    //   436: aload #15
    //   438: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   441: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
    //   444: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   447: nop
    //   448: nop
    //   449: aload_2
    //   450: bipush #14
    //   452: iload #17
    //   454: bipush #6
    //   456: ishr
    //   457: iand
    //   458: istore #25
    //   460: astore #26
    //   462: iconst_0
    //   463: istore #27
    //   465: aload #26
    //   467: ldc -384784025
    //   469: ldc 'C88@4444L9:Column.kt#2w3rfo'
    //   471: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   474: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
    //   477: aload #26
    //   479: bipush #6
    //   481: bipush #112
    //   483: iload #8
    //   485: bipush #6
    //   487: ishr
    //   488: iand
    //   489: ior
    //   490: istore #28
    //   492: astore #29
    //   494: checkcast androidx/compose/foundation/layout/ColumnScope
    //   497: astore #30
    //   499: iconst_0
    //   500: istore #31
    //   502: aload_0
    //   503: aconst_null
    //   504: lconst_0
    //   505: bipush #18
    //   507: invokestatic getSp : (I)J
    //   510: aconst_null
    //   511: getstatic androidx/compose/ui/text/font/FontWeight.Companion : Landroidx/compose/ui/text/font/FontWeight$Companion;
    //   514: invokevirtual getW400 : ()Landroidx/compose/ui/text/font/FontWeight;
    //   517: aconst_null
    //   518: lconst_0
    //   519: aconst_null
    //   520: iconst_0
    //   521: ldc2_w 25.2
    //   524: invokestatic getSp : (D)J
    //   527: iconst_0
    //   528: iconst_0
    //   529: iconst_0
    //   530: aconst_null
    //   531: aconst_null
    //   532: aload #29
    //   534: ldc 199680
    //   536: bipush #14
    //   538: iload #4
    //   540: iand
    //   541: ior
    //   542: bipush #6
    //   544: ldc 64470
    //   546: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
    //   549: aload #29
    //   551: ldc -340834380
    //   553: invokeinterface startReplaceGroup : (I)V
    //   558: aload_1
    //   559: ifnull -> 588
    //   562: ldc_w 'Retry'
    //   565: aload_1
    //   566: aconst_null
    //   567: iconst_0
    //   568: aconst_null
    //   569: iconst_0
    //   570: aconst_null
    //   571: aconst_null
    //   572: aload #29
    //   574: bipush #6
    //   576: bipush #112
    //   578: iload #4
    //   580: iand
    //   581: ior
    //   582: sipush #252
    //   585: invokestatic Link-kye4rC8 : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;Landroidx/compose/runtime/Composer;II)V
    //   588: aload #29
    //   590: invokeinterface endReplaceGroup : ()V
    //   595: nop
    //   596: aload #26
    //   598: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   601: aload_2
    //   602: invokeinterface endNode : ()V
    //   607: aload_2
    //   608: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   611: nop
    //   612: aload_2
    //   613: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   616: nop
    //   617: aload_2
    //   618: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   621: nop
    //   622: invokestatic isTraceInProgress : ()Z
    //   625: ifeq -> 640
    //   628: invokestatic traceEventEnd : ()V
    //   631: goto -> 640
    //   634: aload_2
    //   635: invokeinterface skipToGroupEnd : ()V
    //   640: aload_2
    //   641: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
    //   646: dup
    //   647: ifnull -> 666
    //   650: aload_0
    //   651: aload_1
    //   652: iload_3
    //   653: <illegal opcode> invoke : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;I)Lkotlin/jvm/functions/Function2;
    //   658: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
    //   663: goto -> 667
    //   666: pop
    //   667: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #15	-> 6
    //   #17	-> 109
    //   #18	-> 115
    //   #19	-> 126
    //   #37	-> 136
    //   #19	-> 142
    //   #16	-> 154
    //   #38	-> 163
    //   #39	-> 166
    //   #42	-> 174
    //   #43	-> 208
    //   #44	-> 217
    //   #45	-> 222
    //   #46	-> 228
    //   #47	-> 236
    //   #49	-> 243
    //   #48	-> 265
    //   #50	-> 274
    //   #51	-> 277
    //   #52	-> 293
    //   #53	-> 298
    //   #54	-> 308
    //   #56	-> 319
    //   #58	-> 324
    //   #59	-> 333
    //   #60	-> 346
    //   #62	-> 359
    //   #63	-> 370
    //   #64	-> 377
    //   #65	-> 405
    //   #66	-> 417
    //   #68	-> 431
    //   #63	-> 432
    //   #68	-> 433
    //   #69	-> 434
    //   #70	-> 447
    //   #58	-> 448
    //   #71	-> 449
    //   #72	-> 471
    //   #22	-> 502
    //   #23	-> 505
    //   #24	-> 511
    //   #25	-> 521
    //   #21	-> 546
    //   #27	-> 558
    //   #29	-> 562
    //   #30	-> 565
    //   #28	-> 585
    //   #33	-> 595
    //   #72	-> 596
    //   #71	-> 601
    //   #73	-> 602
    //   #50	-> 608
    //   #74	-> 611
    //   #44	-> 613
    //   #75	-> 616
    //   #38	-> 618
    //   #76	-> 621
    //   #35	-> 634
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   136	6	7	$i$f$getDp	I
    //   133	9	6	$this$dp$iv	I
    //   502	94	31	$i$a$-Column-JunieUnavailableKt$JunieUnavailable$1	I
    //   499	97	30	$this$JunieUnavailable_u24lambda_u240	Landroidx/compose/foundation/layout/ColumnScope;
    //   499	97	29	$composer	Landroidx/compose/runtime/Composer;
    //   499	97	28	$changed	I
    //   465	136	27	$i$a$-Layout-ColumnKt$Column$1$iv	I
    //   462	139	26	$composer$iv	Landroidx/compose/runtime/Composer;
    //   462	139	25	$changed$iv	I
    //   377	55	24	$i$a$-with-Updater$set$1$iv$iv$iv	I
    //   374	58	23	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
    //   370	64	22	$i$f$set-impl	I
    //   367	67	21	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
    //   333	115	20	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
    //   330	118	19	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
    //   269	343	18	$i$f$ReusableComposeNode	I
    //   266	346	16	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
    //   266	346	17	$changed$iv$iv$iv	I
    //   212	405	12	$i$f$Layout	I
    //   227	390	13	compositeKeyHash$iv$iv	I
    //   235	382	14	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
    //   243	374	15	materialized$iv$iv	Landroidx/compose/ui/Modifier;
    //   209	408	11	$changed$iv$iv	I
    //   158	464	9	$i$f$Column	I
    //   199	423	10	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
    //   155	467	5	modifier$iv	Landroidx/compose/ui/Modifier;
    //   155	467	6	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
    //   174	448	7	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
    //   155	467	8	$changed$iv	I
    //   18	650	4	$dirty	I
    //   0	668	0	reason	Ljava/lang/String;
    //   0	668	1	onRefresh	Lkotlin/jvm/functions/Function0;
    //   0	668	2	$composer	Landroidx/compose/runtime/Composer;
    //   0	668	3	$changed	I
  }
  
  private static final Unit JunieUnavailable$lambda$1(String $reason, Function0<Unit> $onRefresh, int $$changed, Composer $composer, int $force) {
    JunieUnavailable($reason, $onRefresh, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
    return Unit.INSTANCE;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\components\JunieUnavailableKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */