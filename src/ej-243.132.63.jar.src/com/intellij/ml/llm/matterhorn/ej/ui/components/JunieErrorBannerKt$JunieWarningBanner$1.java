package com.intellij.ml.llm.matterhorn.ej.ui.components;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.header.Action;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
@SourceDebugExtension({"SMAP\nJunieErrorBanner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieErrorBanner.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieErrorBannerKt$JunieWarningBanner$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,119:1\n149#2:120\n99#3:121\n95#3,7:122\n102#3:157\n106#3:163\n79#4,6:129\n86#4,4:144\n90#4,2:154\n94#4:162\n368#5,9:135\n377#5:156\n378#5,2:160\n4034#6,6:148\n1863#7,2:158\n*S KotlinDebug\n*F\n+ 1 JunieErrorBanner.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieErrorBannerKt$JunieWarningBanner$1\n*L\n65#1:120\n65#1:121\n65#1:122,7\n65#1:157\n65#1:163\n65#1:129,6\n65#1:144,4\n65#1:154,2\n65#1:162\n65#1:135,9\n65#1:156\n65#1:160,2\n65#1:148,6\n66#1:158,2\n*E\n"})
final class JunieErrorBannerKt$JunieWarningBanner$1 implements Function3<RowScope, Composer, Integer, Unit> {
  @Composable
  @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
  public final void invoke(RowScope $this$JunieBanner, Composer $composer, int $changed) {
    // Byte code:
    //   0: aload_1
    //   1: ldc '$this$JunieBanner'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: iload_3
    //   7: bipush #17
    //   9: iand
    //   10: bipush #16
    //   12: if_icmpne -> 24
    //   15: aload_2
    //   16: invokeinterface getSkipping : ()Z
    //   21: ifne -> 585
    //   24: invokestatic isTraceInProgress : ()Z
    //   27: ifeq -> 39
    //   30: ldc -2059587615
    //   32: iload_3
    //   33: iconst_m1
    //   34: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.JunieWarningBanner.<anonymous> (JunieErrorBanner.kt:63)'
    //   36: invokestatic traceEventStart : (IIILjava/lang/String;)V
    //   39: aload_0
    //   40: getfield $actions : Ljava/util/List;
    //   43: checkcast java/util/Collection
    //   46: invokeinterface isEmpty : ()Z
    //   51: ifne -> 58
    //   54: iconst_1
    //   55: goto -> 59
    //   58: iconst_0
    //   59: ifeq -> 573
    //   62: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
    //   65: bipush #12
    //   67: istore #5
    //   69: iconst_0
    //   70: istore #6
    //   72: iload #5
    //   74: i2f
    //   75: invokestatic constructor-impl : (F)F
    //   78: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
    //   81: checkcast androidx/compose/foundation/layout/Arrangement$Horizontal
    //   84: astore #5
    //   86: aload_0
    //   87: getfield $actions : Ljava/util/List;
    //   90: astore #7
    //   92: bipush #48
    //   94: istore #8
    //   96: iconst_0
    //   97: istore #9
    //   99: aload_2
    //   100: ldc 693286680
    //   102: ldc 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
    //   104: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   107: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   110: checkcast androidx/compose/ui/Modifier
    //   113: astore #4
    //   115: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
    //   118: invokevirtual getTop : ()Landroidx/compose/ui/Alignment$Vertical;
    //   121: astore #6
    //   123: aload #5
    //   125: aload #6
    //   127: aload_2
    //   128: bipush #14
    //   130: iload #8
    //   132: iconst_3
    //   133: ishr
    //   134: iand
    //   135: bipush #112
    //   137: iload #8
    //   139: iconst_3
    //   140: ishr
    //   141: iand
    //   142: ior
    //   143: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
    //   146: astore #10
    //   148: bipush #112
    //   150: iload #8
    //   152: iconst_3
    //   153: ishl
    //   154: iand
    //   155: istore #11
    //   157: nop
    //   158: iconst_0
    //   159: istore #12
    //   161: aload_2
    //   162: ldc -1323940314
    //   164: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
    //   166: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   169: aload_2
    //   170: iconst_0
    //   171: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
    //   174: istore #13
    //   176: aload_2
    //   177: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
    //   182: astore #14
    //   184: aload_2
    //   185: aload #4
    //   187: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    //   190: astore #15
    //   192: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   195: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
    //   198: astore #16
    //   200: bipush #6
    //   202: sipush #896
    //   205: iload #11
    //   207: bipush #6
    //   209: ishl
    //   210: iand
    //   211: ior
    //   212: istore #17
    //   214: nop
    //   215: iconst_0
    //   216: istore #18
    //   218: aload_2
    //   219: ldc -692256719
    //   221: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
    //   223: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   226: aload_2
    //   227: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
    //   232: instanceof androidx/compose/runtime/Applier
    //   235: ifne -> 241
    //   238: invokestatic invalidApplier : ()V
    //   241: aload_2
    //   242: invokeinterface startReusableNode : ()V
    //   247: aload_2
    //   248: invokeinterface getInserting : ()Z
    //   253: ifeq -> 267
    //   256: aload_2
    //   257: aload #16
    //   259: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
    //   264: goto -> 273
    //   267: aload_2
    //   268: invokeinterface useNode : ()V
    //   273: aload_2
    //   274: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
    //   277: astore #19
    //   279: iconst_0
    //   280: istore #20
    //   282: aload #19
    //   284: aload #10
    //   286: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   289: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
    //   292: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   295: aload #19
    //   297: aload #14
    //   299: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   302: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
    //   305: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   308: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   311: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
    //   314: astore #21
    //   316: iconst_0
    //   317: istore #22
    //   319: aload #19
    //   321: astore #23
    //   323: iconst_0
    //   324: istore #24
    //   326: aload #23
    //   328: invokeinterface getInserting : ()Z
    //   333: ifne -> 354
    //   336: aload #23
    //   338: invokeinterface rememberedValue : ()Ljava/lang/Object;
    //   343: iload #13
    //   345: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   348: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   351: ifne -> 380
    //   354: aload #23
    //   356: iload #13
    //   358: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   361: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
    //   366: aload #19
    //   368: iload #13
    //   370: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   373: aload #21
    //   375: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   380: nop
    //   381: nop
    //   382: nop
    //   383: aload #19
    //   385: aload #15
    //   387: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   390: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
    //   393: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   396: nop
    //   397: nop
    //   398: aload_2
    //   399: bipush #14
    //   401: iload #17
    //   403: bipush #6
    //   405: ishr
    //   406: iand
    //   407: istore #25
    //   409: astore #26
    //   411: iconst_0
    //   412: istore #27
    //   414: aload #26
    //   416: ldc -407840262
    //   418: ldc 'C101@5126L9:Row.kt#2w3rfo'
    //   420: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   423: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
    //   426: aload #26
    //   428: bipush #6
    //   430: bipush #112
    //   432: iload #8
    //   434: bipush #6
    //   436: ishr
    //   437: iand
    //   438: ior
    //   439: istore #28
    //   441: astore #29
    //   443: checkcast androidx/compose/foundation/layout/RowScope
    //   446: astore #30
    //   448: iconst_0
    //   449: istore #31
    //   451: aload #29
    //   453: ldc 200178471
    //   455: invokeinterface startReplaceGroup : (I)V
    //   460: aload #7
    //   462: checkcast java/lang/Iterable
    //   465: astore #32
    //   467: iconst_0
    //   468: istore #33
    //   470: aload #32
    //   472: invokeinterface iterator : ()Ljava/util/Iterator;
    //   477: astore #34
    //   479: aload #34
    //   481: invokeinterface hasNext : ()Z
    //   486: ifeq -> 538
    //   489: aload #34
    //   491: invokeinterface next : ()Ljava/lang/Object;
    //   496: astore #35
    //   498: aload #35
    //   500: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action
    //   503: astore #36
    //   505: iconst_0
    //   506: istore #37
    //   508: aload #36
    //   510: invokevirtual getName : ()Ljava/lang/String;
    //   513: aload #36
    //   515: invokevirtual getAction : ()Lkotlin/jvm/functions/Function0;
    //   518: aconst_null
    //   519: iconst_0
    //   520: aconst_null
    //   521: iconst_0
    //   522: aconst_null
    //   523: aconst_null
    //   524: aload #29
    //   526: iconst_0
    //   527: sipush #252
    //   530: invokestatic Link-kye4rC8 : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;Landroidx/compose/runtime/Composer;II)V
    //   533: nop
    //   534: nop
    //   535: goto -> 479
    //   538: nop
    //   539: aload #29
    //   541: invokeinterface endReplaceGroup : ()V
    //   546: nop
    //   547: aload #26
    //   549: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   552: aload_2
    //   553: invokeinterface endNode : ()V
    //   558: aload_2
    //   559: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   562: nop
    //   563: aload_2
    //   564: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   567: nop
    //   568: aload_2
    //   569: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   572: nop
    //   573: invokestatic isTraceInProgress : ()Z
    //   576: ifeq -> 591
    //   579: invokestatic traceEventEnd : ()V
    //   582: goto -> 591
    //   585: aload_2
    //   586: invokeinterface skipToGroupEnd : ()V
    //   591: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #64	-> 6
    //   #64	-> 59
    //   #65	-> 62
    //   #120	-> 72
    //   #65	-> 78
    //   #121	-> 104
    //   #122	-> 107
    //   #124	-> 115
    //   #127	-> 123
    //   #128	-> 157
    //   #129	-> 166
    //   #130	-> 171
    //   #131	-> 177
    //   #132	-> 185
    //   #134	-> 192
    //   #133	-> 214
    //   #135	-> 223
    //   #136	-> 226
    //   #137	-> 242
    //   #138	-> 247
    //   #139	-> 257
    //   #141	-> 268
    //   #143	-> 273
    //   #144	-> 282
    //   #145	-> 295
    //   #147	-> 308
    //   #148	-> 319
    //   #149	-> 326
    //   #150	-> 354
    //   #151	-> 366
    //   #153	-> 380
    //   #148	-> 381
    //   #153	-> 382
    //   #154	-> 383
    //   #155	-> 396
    //   #143	-> 397
    //   #156	-> 398
    //   #157	-> 420
    //   #66	-> 460
    //   #158	-> 470
    //   #67	-> 508
    //   #68	-> 533
    //   #158	-> 534
    //   #159	-> 538
    //   #69	-> 546
    //   #157	-> 547
    //   #156	-> 552
    //   #160	-> 553
    //   #135	-> 559
    //   #161	-> 562
    //   #129	-> 564
    //   #162	-> 567
    //   #121	-> 569
    //   #163	-> 572
    //   #70	-> 585
    //   #71	-> 591
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   72	6	6	$i$f$getDp	I
    //   69	9	5	$this$dp$iv	I
    //   508	26	37	$i$a$-forEach-JunieErrorBannerKt$JunieWarningBanner$1$1$1	I
    //   505	29	36	action	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
    //   498	37	35	element$iv	Ljava/lang/Object;
    //   470	69	33	$i$f$forEach	I
    //   467	72	32	$this$forEach$iv	Ljava/lang/Iterable;
    //   451	96	31	$i$a$-Row-JunieErrorBannerKt$JunieWarningBanner$1$1	I
    //   448	99	30	$this$invoke_u24lambda_u241	Landroidx/compose/foundation/layout/RowScope;
    //   448	99	29	$composer	Landroidx/compose/runtime/Composer;
    //   448	99	28	$changed	I
    //   414	138	27	$i$a$-Layout-RowKt$Row$1$iv	I
    //   411	141	26	$composer$iv	Landroidx/compose/runtime/Composer;
    //   411	141	25	$changed$iv	I
    //   326	55	24	$i$a$-with-Updater$set$1$iv$iv$iv	I
    //   323	58	23	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
    //   319	64	22	$i$f$set-impl	I
    //   316	67	21	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
    //   282	115	20	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
    //   279	118	19	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
    //   218	345	18	$i$f$ReusableComposeNode	I
    //   215	348	16	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
    //   215	348	17	$changed$iv$iv$iv	I
    //   161	407	12	$i$f$Layout	I
    //   176	392	13	compositeKeyHash$iv$iv	I
    //   184	384	14	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
    //   192	376	15	materialized$iv$iv	Landroidx/compose/ui/Modifier;
    //   158	410	11	$changed$iv$iv	I
    //   99	474	9	$i$f$Row	I
    //   148	425	10	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
    //   115	458	4	modifier$iv	Landroidx/compose/ui/Modifier;
    //   96	477	5	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    //   123	450	6	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
    //   96	477	8	$changed$iv	I
    //   0	592	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/components/JunieErrorBannerKt$JunieWarningBanner$1;
    //   0	592	1	$this$JunieBanner	Landroidx/compose/foundation/layout/RowScope;
    //   0	592	2	$composer	Landroidx/compose/runtime/Composer;
    //   0	592	3	$changed	I
  }
  
  JunieErrorBannerKt$JunieWarningBanner$1(List<Action> $actions) {}
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\JunieErrorBannerKt$JunieWarningBanner$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */