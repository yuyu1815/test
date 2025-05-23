package com.intellij.ml.llm.matterhorn.ej.ui.components;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000.\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\032K\020\000\032\0020\0012\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\034\020\b\032\030\022\004\022\0020\n\022\004\022\0020\0010\t¢\006\002\b\013¢\006\002\b\fH\007¢\006\004\b\r\020\016¨\006\017"}, d2 = {"Surface", "", "modifier", "Landroidx/compose/ui/Modifier;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "backgroundShape", "Landroidx/compose/ui/graphics/Shape;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "Surface-sW7UJKQ", "(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "standalone"})
@SourceDebugExtension({"SMAP\nSurface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Surface.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/SurfaceKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,31:1\n71#2:32\n68#2,6:33\n74#2:67\n78#2:71\n79#3,6:39\n86#3,4:54\n90#3,2:64\n94#3:70\n368#4,9:45\n377#4:66\n378#4,2:68\n4034#5,6:58\n*S KotlinDebug\n*F\n+ 1 Surface.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/SurfaceKt\n*L\n20#1:32\n20#1:33,6\n20#1:67\n20#1:71\n20#1:39,6\n20#1:54,4\n20#1:64,2\n20#1:70\n20#1:45,9\n20#1:66\n20#1:68,2\n20#1:58,6\n*E\n"})
public final class SurfaceKt {
  @Composable
  @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
  public static final void Surface-sW7UJKQ(@Nullable Modifier modifier, long backgroundColor, @Nullable Shape backgroundShape, @NotNull Function3 content, @Nullable Composer $composer, int $changed, int paramInt1) {
    // Byte code:
    //   0: aload #4
    //   2: ldc 'content'
    //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   7: aload #5
    //   9: ldc 665109704
    //   11: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
    //   16: astore #5
    //   18: iload #6
    //   20: istore #8
    //   22: iload #7
    //   24: iconst_1
    //   25: iand
    //   26: ifeq -> 39
    //   29: iload #8
    //   31: bipush #6
    //   33: ior
    //   34: istore #8
    //   36: goto -> 68
    //   39: iload #6
    //   41: bipush #6
    //   43: iand
    //   44: ifne -> 68
    //   47: iload #8
    //   49: aload #5
    //   51: aload_0
    //   52: invokeinterface changed : (Ljava/lang/Object;)Z
    //   57: ifeq -> 64
    //   60: iconst_4
    //   61: goto -> 65
    //   64: iconst_2
    //   65: ior
    //   66: istore #8
    //   68: iload #6
    //   70: bipush #48
    //   72: iand
    //   73: ifne -> 106
    //   76: iload #8
    //   78: iload #7
    //   80: iconst_2
    //   81: iand
    //   82: ifne -> 101
    //   85: aload #5
    //   87: lload_1
    //   88: invokeinterface changed : (J)Z
    //   93: ifeq -> 101
    //   96: bipush #32
    //   98: goto -> 103
    //   101: bipush #16
    //   103: ior
    //   104: istore #8
    //   106: iload #7
    //   108: iconst_4
    //   109: iand
    //   110: ifeq -> 124
    //   113: iload #8
    //   115: sipush #384
    //   118: ior
    //   119: istore #8
    //   121: goto -> 158
    //   124: iload #6
    //   126: sipush #384
    //   129: iand
    //   130: ifne -> 158
    //   133: iload #8
    //   135: aload #5
    //   137: aload_3
    //   138: invokeinterface changed : (Ljava/lang/Object;)Z
    //   143: ifeq -> 152
    //   146: sipush #256
    //   149: goto -> 155
    //   152: sipush #128
    //   155: ior
    //   156: istore #8
    //   158: iload #7
    //   160: bipush #8
    //   162: iand
    //   163: ifeq -> 177
    //   166: iload #8
    //   168: sipush #3072
    //   171: ior
    //   172: istore #8
    //   174: goto -> 212
    //   177: iload #6
    //   179: sipush #3072
    //   182: iand
    //   183: ifne -> 212
    //   186: iload #8
    //   188: aload #5
    //   190: aload #4
    //   192: invokeinterface changedInstance : (Ljava/lang/Object;)Z
    //   197: ifeq -> 206
    //   200: sipush #2048
    //   203: goto -> 209
    //   206: sipush #1024
    //   209: ior
    //   210: istore #8
    //   212: iload #8
    //   214: sipush #1171
    //   217: iand
    //   218: sipush #1170
    //   221: if_icmpne -> 234
    //   224: aload #5
    //   226: invokeinterface getSkipping : ()Z
    //   231: ifne -> 774
    //   234: aload #5
    //   236: invokeinterface startDefaults : ()V
    //   241: iload #6
    //   243: iconst_1
    //   244: iand
    //   245: ifeq -> 258
    //   248: aload #5
    //   250: invokeinterface getDefaultsInvalid : ()Z
    //   255: ifeq -> 314
    //   258: iload #7
    //   260: iconst_1
    //   261: iand
    //   262: ifeq -> 272
    //   265: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   268: checkcast androidx/compose/ui/Modifier
    //   271: astore_0
    //   272: iload #7
    //   274: iconst_2
    //   275: iand
    //   276: ifeq -> 300
    //   279: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
    //   282: aload #5
    //   284: bipush #6
    //   286: invokevirtual getGlobalColors : (Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/foundation/GlobalColors;
    //   289: invokevirtual getPanelBackground-0d7_KjU : ()J
    //   292: lstore_1
    //   293: iload #8
    //   295: bipush #-113
    //   297: iand
    //   298: istore #8
    //   300: iload #7
    //   302: iconst_4
    //   303: iand
    //   304: ifeq -> 335
    //   307: invokestatic getRectangleShape : ()Landroidx/compose/ui/graphics/Shape;
    //   310: astore_3
    //   311: goto -> 335
    //   314: aload #5
    //   316: invokeinterface skipToGroupEnd : ()V
    //   321: iload #7
    //   323: iconst_2
    //   324: iand
    //   325: ifeq -> 335
    //   328: iload #8
    //   330: bipush #-113
    //   332: iand
    //   333: istore #8
    //   335: aload #5
    //   337: invokeinterface endDefaults : ()V
    //   342: invokestatic isTraceInProgress : ()Z
    //   345: ifeq -> 358
    //   348: ldc 665109704
    //   350: iload #8
    //   352: iconst_m1
    //   353: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.Surface (Surface.kt:18)'
    //   355: invokestatic traceEventStart : (IIILjava/lang/String;)V
    //   358: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   361: checkcast androidx/compose/ui/Modifier
    //   364: lload_1
    //   365: aload_3
    //   366: invokestatic background-bw27NRU : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;
    //   369: aload_0
    //   370: invokeinterface then : (Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    //   375: astore #9
    //   377: sipush #7168
    //   380: iload #8
    //   382: iand
    //   383: istore #12
    //   385: nop
    //   386: iconst_0
    //   387: istore #13
    //   389: aload #5
    //   391: ldc 733328855
    //   393: ldc 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
    //   395: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   398: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
    //   401: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
    //   404: astore #10
    //   406: iconst_0
    //   407: istore #11
    //   409: aload #10
    //   411: iload #11
    //   413: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
    //   416: astore #14
    //   418: bipush #112
    //   420: iload #12
    //   422: iconst_3
    //   423: ishl
    //   424: iand
    //   425: istore #15
    //   427: nop
    //   428: iconst_0
    //   429: istore #16
    //   431: aload #5
    //   433: ldc -1323940314
    //   435: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
    //   437: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   440: aload #5
    //   442: iconst_0
    //   443: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
    //   446: istore #17
    //   448: aload #5
    //   450: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
    //   455: astore #18
    //   457: aload #5
    //   459: aload #9
    //   461: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    //   464: astore #19
    //   466: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   469: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
    //   472: astore #20
    //   474: bipush #6
    //   476: sipush #896
    //   479: iload #15
    //   481: bipush #6
    //   483: ishl
    //   484: iand
    //   485: ior
    //   486: istore #21
    //   488: nop
    //   489: iconst_0
    //   490: istore #22
    //   492: aload #5
    //   494: ldc -692256719
    //   496: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
    //   498: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   501: aload #5
    //   503: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
    //   508: instanceof androidx/compose/runtime/Applier
    //   511: ifne -> 517
    //   514: invokestatic invalidApplier : ()V
    //   517: aload #5
    //   519: invokeinterface startReusableNode : ()V
    //   524: aload #5
    //   526: invokeinterface getInserting : ()Z
    //   531: ifeq -> 546
    //   534: aload #5
    //   536: aload #20
    //   538: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
    //   543: goto -> 553
    //   546: aload #5
    //   548: invokeinterface useNode : ()V
    //   553: aload #5
    //   555: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
    //   558: astore #23
    //   560: iconst_0
    //   561: istore #24
    //   563: aload #23
    //   565: aload #14
    //   567: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   570: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
    //   573: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   576: aload #23
    //   578: aload #18
    //   580: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   583: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
    //   586: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   589: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   592: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
    //   595: astore #25
    //   597: iconst_0
    //   598: istore #26
    //   600: aload #23
    //   602: astore #27
    //   604: iconst_0
    //   605: istore #28
    //   607: aload #27
    //   609: invokeinterface getInserting : ()Z
    //   614: ifne -> 635
    //   617: aload #27
    //   619: invokeinterface rememberedValue : ()Ljava/lang/Object;
    //   624: iload #17
    //   626: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   629: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   632: ifne -> 661
    //   635: aload #27
    //   637: iload #17
    //   639: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   642: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
    //   647: aload #23
    //   649: iload #17
    //   651: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   654: aload #25
    //   656: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   661: nop
    //   662: nop
    //   663: nop
    //   664: aload #23
    //   666: aload #19
    //   668: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   671: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
    //   674: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   677: nop
    //   678: nop
    //   679: aload #5
    //   681: bipush #14
    //   683: iload #21
    //   685: bipush #6
    //   687: ishr
    //   688: iand
    //   689: istore #29
    //   691: astore #30
    //   693: iconst_0
    //   694: istore #31
    //   696: aload #30
    //   698: ldc -2146769399
    //   700: ldc 'C73@3429L9:Box.kt#2w3rfo'
    //   702: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   705: aload #4
    //   707: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
    //   710: aload #30
    //   712: bipush #6
    //   714: bipush #112
    //   716: iload #12
    //   718: bipush #6
    //   720: ishr
    //   721: iand
    //   722: ior
    //   723: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   726: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   731: pop
    //   732: aload #30
    //   734: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   737: aload #5
    //   739: invokeinterface endNode : ()V
    //   744: aload #5
    //   746: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   749: nop
    //   750: aload #5
    //   752: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   755: nop
    //   756: aload #5
    //   758: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   761: nop
    //   762: invokestatic isTraceInProgress : ()Z
    //   765: ifeq -> 781
    //   768: invokestatic traceEventEnd : ()V
    //   771: goto -> 781
    //   774: aload #5
    //   776: invokeinterface skipToGroupEnd : ()V
    //   781: aload #5
    //   783: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
    //   788: dup
    //   789: ifnull -> 814
    //   792: aload_0
    //   793: lload_1
    //   794: aload_3
    //   795: aload #4
    //   797: iload #6
    //   799: iload #7
    //   801: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;Lkotlin/jvm/functions/Function3;II)Lkotlin/jvm/functions/Function2;
    //   806: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
    //   811: goto -> 815
    //   814: pop
    //   815: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #19	-> 7
    //   #15	-> 265
    //   #16	-> 279
    //   #17	-> 307
    //   #19	-> 355
    //   #22	-> 358
    //   #24	-> 364
    //   #25	-> 365
    //   #23	-> 366
    //   #27	-> 369
    //   #20	-> 385
    //   #32	-> 395
    //   #33	-> 398
    //   #34	-> 406
    //   #37	-> 409
    //   #38	-> 427
    //   #39	-> 437
    //   #40	-> 443
    //   #41	-> 450
    //   #42	-> 459
    //   #44	-> 466
    //   #43	-> 488
    //   #45	-> 498
    //   #46	-> 501
    //   #47	-> 519
    //   #48	-> 524
    //   #49	-> 536
    //   #51	-> 548
    //   #53	-> 553
    //   #54	-> 563
    //   #55	-> 576
    //   #57	-> 589
    //   #58	-> 600
    //   #59	-> 607
    //   #60	-> 635
    //   #61	-> 647
    //   #63	-> 661
    //   #58	-> 662
    //   #63	-> 663
    //   #64	-> 664
    //   #65	-> 677
    //   #53	-> 678
    //   #66	-> 679
    //   #67	-> 702
    //   #66	-> 737
    //   #68	-> 739
    //   #45	-> 746
    //   #69	-> 749
    //   #39	-> 752
    //   #70	-> 755
    //   #32	-> 758
    //   #71	-> 761
    //   #30	-> 774
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   696	41	31	$i$a$-Layout-BoxKt$Box$1$iv	I
    //   693	44	30	$composer$iv	Landroidx/compose/runtime/Composer;
    //   693	44	29	$changed$iv	I
    //   607	55	28	$i$a$-with-Updater$set$1$iv$iv$iv	I
    //   604	58	27	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
    //   600	64	26	$i$f$set-impl	I
    //   597	67	25	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
    //   563	115	24	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
    //   560	118	23	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
    //   492	258	22	$i$f$ReusableComposeNode	I
    //   489	261	20	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
    //   489	261	21	$changed$iv$iv$iv	I
    //   431	325	16	$i$f$Layout	I
    //   448	308	17	compositeKeyHash$iv$iv	I
    //   457	299	18	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
    //   466	290	19	materialized$iv$iv	Landroidx/compose/ui/Modifier;
    //   428	328	15	$changed$iv$iv	I
    //   389	373	13	$i$f$Box	I
    //   418	344	14	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
    //   386	376	9	modifier$iv	Landroidx/compose/ui/Modifier;
    //   406	356	10	contentAlignment$iv	Landroidx/compose/ui/Alignment;
    //   409	353	11	propagateMinConstraints$iv	Z
    //   386	376	12	$changed$iv	I
    //   22	794	8	$dirty	I
    //   0	816	0	modifier	Landroidx/compose/ui/Modifier;
    //   0	816	1	backgroundColor	J
    //   0	816	3	backgroundShape	Landroidx/compose/ui/graphics/Shape;
    //   0	816	4	content	Lkotlin/jvm/functions/Function3;
    //   0	816	5	$composer	Landroidx/compose/runtime/Composer;
    //   0	816	6	$changed	I
  }
  
  private static final Unit Surface_sW7UJKQ$lambda$0(Modifier $modifier, long $backgroundColor, Shape $backgroundShape, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> $content, int $$changed, int $$default, Composer $composer, int $force) {
    Surface-sW7UJKQ($modifier, $backgroundColor, $backgroundShape, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
    return Unit.INSTANCE;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\SurfaceKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */