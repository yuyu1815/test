/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.animation.AnimatedVisibilityScope;
/*     */ import androidx.compose.foundation.ScrollState;
/*     */ import androidx.compose.foundation.gestures.ScrollableState;
/*     */ import androidx.compose.foundation.layout.SizeKt;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.ui.component.styling.ScrollbarStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.TabStyle;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000*\n\000\n\002\020\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\003\n\002\030\002\0327\020\000\032\0020\0012\f\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\0062\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\nH\007¢\006\002\020\013¨\006\f²\006\n\020\r\032\0020\016X\002"}, d2 = {"TabStrip", "", "tabs", "", "Lorg/jetbrains/jewel/ui/component/TabData;", "style", "Lorg/jetbrains/jewel/ui/component/styling/TabStyle;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "(Ljava/util/List;Lorg/jetbrains/jewel/ui/component/styling/TabStyle;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "ui", "tabStripState", "Lorg/jetbrains/jewel/ui/component/TabStripState;"})
/*     */ @SourceDebugExtension({"SMAP\nTabStrip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabStrip.kt\norg/jetbrains/jewel/ui/component/TabStripKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,150:1\n1225#2,6:151\n1225#2,6:157\n1225#2,6:163\n1225#2,6:206\n71#3:169\n68#3,6:170\n74#3:204\n78#3:257\n79#4,6:176\n86#4,4:191\n90#4,2:201\n79#4,6:219\n86#4,4:234\n90#4,2:244\n94#4:252\n94#4:256\n368#5,9:182\n377#5:203\n368#5,9:225\n377#5:246\n378#5,2:250\n378#5,2:254\n4034#6,6:195\n4034#6,6:238\n77#7:205\n99#8:212\n96#8,6:213\n102#8:247\n106#8:253\n1855#9,2:248\n81#10:258\n107#10,2:259\n*S KotlinDebug\n*F\n+ 1 TabStrip.kt\norg/jetbrains/jewel/ui/component/TabStripKt\n*L\n35#1:151,6\n37#1:157,6\n41#1:163,6\n57#1:206,6\n40#1:169\n40#1:170,6\n40#1:204\n40#1:257\n40#1:176,6\n40#1:191,4\n40#1:201,2\n45#1:219,6\n45#1:234,4\n45#1:244,2\n45#1:252\n40#1:256\n40#1:182,9\n40#1:203\n45#1:225,9\n45#1:246\n45#1:250,2\n40#1:254,2\n40#1:195,6\n45#1:238,6\n52#1:205\n45#1:212\n45#1:213,6\n45#1:247\n45#1:253\n61#1:248,2\n35#1:258\n35#1:259,2\n*E\n"})
/*     */ public final class TabStripKt {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void TabStrip(@NotNull List tabs, @NotNull TabStyle style, @Nullable Modifier modifier, boolean enabled, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'tabs'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'style'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload #4
/*     */     //   14: ldc 675224499
/*     */     //   16: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   21: astore #4
/*     */     //   23: iload #5
/*     */     //   25: istore #7
/*     */     //   27: iload #6
/*     */     //   29: iconst_1
/*     */     //   30: iand
/*     */     //   31: ifeq -> 44
/*     */     //   34: iload #7
/*     */     //   36: bipush #6
/*     */     //   38: ior
/*     */     //   39: istore #7
/*     */     //   41: goto -> 73
/*     */     //   44: iload #5
/*     */     //   46: bipush #6
/*     */     //   48: iand
/*     */     //   49: ifne -> 73
/*     */     //   52: iload #7
/*     */     //   54: aload #4
/*     */     //   56: aload_0
/*     */     //   57: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   62: ifeq -> 69
/*     */     //   65: iconst_4
/*     */     //   66: goto -> 70
/*     */     //   69: iconst_2
/*     */     //   70: ior
/*     */     //   71: istore #7
/*     */     //   73: iload #6
/*     */     //   75: iconst_2
/*     */     //   76: iand
/*     */     //   77: ifeq -> 90
/*     */     //   80: iload #7
/*     */     //   82: bipush #48
/*     */     //   84: ior
/*     */     //   85: istore #7
/*     */     //   87: goto -> 121
/*     */     //   90: iload #5
/*     */     //   92: bipush #48
/*     */     //   94: iand
/*     */     //   95: ifne -> 121
/*     */     //   98: iload #7
/*     */     //   100: aload #4
/*     */     //   102: aload_1
/*     */     //   103: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   108: ifeq -> 116
/*     */     //   111: bipush #32
/*     */     //   113: goto -> 118
/*     */     //   116: bipush #16
/*     */     //   118: ior
/*     */     //   119: istore #7
/*     */     //   121: iload #6
/*     */     //   123: iconst_4
/*     */     //   124: iand
/*     */     //   125: ifeq -> 139
/*     */     //   128: iload #7
/*     */     //   130: sipush #384
/*     */     //   133: ior
/*     */     //   134: istore #7
/*     */     //   136: goto -> 173
/*     */     //   139: iload #5
/*     */     //   141: sipush #384
/*     */     //   144: iand
/*     */     //   145: ifne -> 173
/*     */     //   148: iload #7
/*     */     //   150: aload #4
/*     */     //   152: aload_2
/*     */     //   153: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   158: ifeq -> 167
/*     */     //   161: sipush #256
/*     */     //   164: goto -> 170
/*     */     //   167: sipush #128
/*     */     //   170: ior
/*     */     //   171: istore #7
/*     */     //   173: iload #6
/*     */     //   175: bipush #8
/*     */     //   177: iand
/*     */     //   178: ifeq -> 192
/*     */     //   181: iload #7
/*     */     //   183: sipush #3072
/*     */     //   186: ior
/*     */     //   187: istore #7
/*     */     //   189: goto -> 226
/*     */     //   192: iload #5
/*     */     //   194: sipush #3072
/*     */     //   197: iand
/*     */     //   198: ifne -> 226
/*     */     //   201: iload #7
/*     */     //   203: aload #4
/*     */     //   205: iload_3
/*     */     //   206: invokeinterface changed : (Z)Z
/*     */     //   211: ifeq -> 220
/*     */     //   214: sipush #2048
/*     */     //   217: goto -> 223
/*     */     //   220: sipush #1024
/*     */     //   223: ior
/*     */     //   224: istore #7
/*     */     //   226: iload #7
/*     */     //   228: sipush #1171
/*     */     //   231: iand
/*     */     //   232: sipush #1170
/*     */     //   235: if_icmpne -> 248
/*     */     //   238: aload #4
/*     */     //   240: invokeinterface getSkipping : ()Z
/*     */     //   245: ifne -> 1891
/*     */     //   248: iload #6
/*     */     //   250: iconst_4
/*     */     //   251: iand
/*     */     //   252: ifeq -> 262
/*     */     //   255: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   258: checkcast androidx/compose/ui/Modifier
/*     */     //   261: astore_2
/*     */     //   262: iload #6
/*     */     //   264: bipush #8
/*     */     //   266: iand
/*     */     //   267: ifeq -> 272
/*     */     //   270: iconst_1
/*     */     //   271: istore_3
/*     */     //   272: invokestatic isTraceInProgress : ()Z
/*     */     //   275: ifeq -> 288
/*     */     //   278: ldc 675224499
/*     */     //   280: iload #7
/*     */     //   282: iconst_m1
/*     */     //   283: ldc 'org.jetbrains.jewel.ui.component.TabStrip (TabStrip.kt:33)'
/*     */     //   285: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   288: aload #4
/*     */     //   290: ldc 2140943326
/*     */     //   292: invokeinterface startReplaceGroup : (I)V
/*     */     //   297: aload #4
/*     */     //   299: astore #10
/*     */     //   301: iconst_0
/*     */     //   302: istore #11
/*     */     //   304: nop
/*     */     //   305: iconst_0
/*     */     //   306: istore #12
/*     */     //   308: aload #10
/*     */     //   310: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   315: astore #13
/*     */     //   317: iconst_0
/*     */     //   318: istore #14
/*     */     //   320: aload #13
/*     */     //   322: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   325: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   328: if_acmpne -> 373
/*     */     //   331: iconst_0
/*     */     //   332: istore #15
/*     */     //   334: getstatic org/jetbrains/jewel/ui/component/TabStripState.Companion : Lorg/jetbrains/jewel/ui/component/TabStripState$Companion;
/*     */     //   337: iconst_1
/*     */     //   338: iconst_0
/*     */     //   339: iconst_0
/*     */     //   340: iconst_0
/*     */     //   341: iconst_0
/*     */     //   342: bipush #30
/*     */     //   344: aconst_null
/*     */     //   345: invokestatic of-zFr0jqg$default : (Lorg/jetbrains/jewel/ui/component/TabStripState$Companion;ZZZZZILjava/lang/Object;)J
/*     */     //   348: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/TabStripState;
/*     */     //   351: aconst_null
/*     */     //   352: iconst_2
/*     */     //   353: aconst_null
/*     */     //   354: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   357: astore #15
/*     */     //   359: aload #10
/*     */     //   361: aload #15
/*     */     //   363: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   368: aload #15
/*     */     //   370: goto -> 375
/*     */     //   373: aload #13
/*     */     //   375: nop
/*     */     //   376: nop
/*     */     //   377: nop
/*     */     //   378: checkcast androidx/compose/runtime/MutableState
/*     */     //   381: astore #9
/*     */     //   383: aload #4
/*     */     //   385: invokeinterface endReplaceGroup : ()V
/*     */     //   390: aload #9
/*     */     //   392: astore #8
/*     */     //   394: aload #4
/*     */     //   396: ldc 2140945474
/*     */     //   398: invokeinterface startReplaceGroup : (I)V
/*     */     //   403: aload #4
/*     */     //   405: astore #9
/*     */     //   407: iload #7
/*     */     //   409: sipush #7168
/*     */     //   412: iand
/*     */     //   413: sipush #2048
/*     */     //   416: if_icmpne -> 423
/*     */     //   419: iconst_1
/*     */     //   420: goto -> 424
/*     */     //   423: iconst_0
/*     */     //   424: istore #10
/*     */     //   426: nop
/*     */     //   427: iconst_0
/*     */     //   428: istore #11
/*     */     //   430: aload #9
/*     */     //   432: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   437: astore #12
/*     */     //   439: iconst_0
/*     */     //   440: istore #13
/*     */     //   442: iload #10
/*     */     //   444: ifne -> 458
/*     */     //   447: aload #12
/*     */     //   449: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   452: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   455: if_acmpne -> 501
/*     */     //   458: iconst_0
/*     */     //   459: istore #14
/*     */     //   461: aload #8
/*     */     //   463: aload #8
/*     */     //   465: invokestatic TabStrip$lambda$1 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   468: iload_3
/*     */     //   469: iconst_0
/*     */     //   470: iconst_0
/*     */     //   471: iconst_0
/*     */     //   472: iconst_0
/*     */     //   473: bipush #30
/*     */     //   475: aconst_null
/*     */     //   476: invokestatic copy-zFr0jqg$default : (JZZZZZILjava/lang/Object;)J
/*     */     //   479: invokestatic TabStrip$lambda$2 : (Landroidx/compose/runtime/MutableState;J)V
/*     */     //   482: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   485: astore #15
/*     */     //   487: aload #9
/*     */     //   489: aload #15
/*     */     //   491: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   496: aload #15
/*     */     //   498: goto -> 503
/*     */     //   501: aload #12
/*     */     //   503: nop
/*     */     //   504: nop
/*     */     //   505: nop
/*     */     //   506: pop
/*     */     //   507: aload #4
/*     */     //   509: invokeinterface endReplaceGroup : ()V
/*     */     //   514: iconst_0
/*     */     //   515: aload #4
/*     */     //   517: iconst_0
/*     */     //   518: iconst_1
/*     */     //   519: invokestatic rememberScrollState : (ILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/ScrollState;
/*     */     //   522: astore #9
/*     */     //   524: aload_2
/*     */     //   525: iconst_1
/*     */     //   526: aload #4
/*     */     //   528: ldc 2140950344
/*     */     //   530: invokeinterface startReplaceGroup : (I)V
/*     */     //   535: aload #4
/*     */     //   537: astore #11
/*     */     //   539: iconst_0
/*     */     //   540: istore #12
/*     */     //   542: iconst_0
/*     */     //   543: istore #13
/*     */     //   545: aload #11
/*     */     //   547: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   552: astore #14
/*     */     //   554: iconst_0
/*     */     //   555: istore #15
/*     */     //   557: aload #14
/*     */     //   559: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   562: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   565: if_acmpne -> 602
/*     */     //   568: istore #71
/*     */     //   570: astore #70
/*     */     //   572: iconst_0
/*     */     //   573: istore #16
/*     */     //   575: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   578: astore #72
/*     */     //   580: aload #70
/*     */     //   582: iload #71
/*     */     //   584: aload #72
/*     */     //   586: astore #16
/*     */     //   588: aload #11
/*     */     //   590: aload #16
/*     */     //   592: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   597: aload #16
/*     */     //   599: goto -> 604
/*     */     //   602: aload #14
/*     */     //   604: nop
/*     */     //   605: nop
/*     */     //   606: nop
/*     */     //   607: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   610: astore #10
/*     */     //   612: aload #4
/*     */     //   614: invokeinterface endReplaceGroup : ()V
/*     */     //   619: aload #10
/*     */     //   621: invokestatic focusable : (Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;)Landroidx/compose/ui/Modifier;
/*     */     //   624: aload #4
/*     */     //   626: ldc 2140951945
/*     */     //   628: invokeinterface startReplaceGroup : (I)V
/*     */     //   633: aload #4
/*     */     //   635: astore #11
/*     */     //   637: iconst_0
/*     */     //   638: istore #12
/*     */     //   640: iconst_0
/*     */     //   641: istore #13
/*     */     //   643: aload #11
/*     */     //   645: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   650: astore #14
/*     */     //   652: iconst_0
/*     */     //   653: istore #15
/*     */     //   655: aload #14
/*     */     //   657: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   660: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   663: if_acmpne -> 697
/*     */     //   666: astore #70
/*     */     //   668: iconst_0
/*     */     //   669: istore #16
/*     */     //   671: aload #8
/*     */     //   673: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */     //   678: aload #70
/*     */     //   680: swap
/*     */     //   681: astore #17
/*     */     //   683: aload #11
/*     */     //   685: aload #17
/*     */     //   687: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   692: aload #17
/*     */     //   694: goto -> 699
/*     */     //   697: aload #14
/*     */     //   699: nop
/*     */     //   700: nop
/*     */     //   701: nop
/*     */     //   702: checkcast kotlin/jvm/functions/Function1
/*     */     //   705: astore #10
/*     */     //   707: aload #4
/*     */     //   709: invokeinterface endReplaceGroup : ()V
/*     */     //   714: aload #10
/*     */     //   716: invokestatic onHover : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   719: astore #10
/*     */     //   721: iconst_0
/*     */     //   722: istore #13
/*     */     //   724: nop
/*     */     //   725: iconst_0
/*     */     //   726: istore #14
/*     */     //   728: aload #4
/*     */     //   730: ldc 733328855
/*     */     //   732: ldc 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   734: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   737: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   740: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */     //   743: astore #11
/*     */     //   745: iconst_0
/*     */     //   746: istore #12
/*     */     //   748: aload #11
/*     */     //   750: iload #12
/*     */     //   752: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   755: astore #15
/*     */     //   757: bipush #112
/*     */     //   759: iload #13
/*     */     //   761: iconst_3
/*     */     //   762: ishl
/*     */     //   763: iand
/*     */     //   764: istore #16
/*     */     //   766: nop
/*     */     //   767: iconst_0
/*     */     //   768: istore #17
/*     */     //   770: aload #4
/*     */     //   772: ldc -1323940314
/*     */     //   774: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   776: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   779: aload #4
/*     */     //   781: iconst_0
/*     */     //   782: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   785: istore #18
/*     */     //   787: aload #4
/*     */     //   789: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   794: astore #19
/*     */     //   796: aload #4
/*     */     //   798: aload #10
/*     */     //   800: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   803: astore #20
/*     */     //   805: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   808: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   811: astore #21
/*     */     //   813: bipush #6
/*     */     //   815: sipush #896
/*     */     //   818: iload #16
/*     */     //   820: bipush #6
/*     */     //   822: ishl
/*     */     //   823: iand
/*     */     //   824: ior
/*     */     //   825: istore #22
/*     */     //   827: nop
/*     */     //   828: iconst_0
/*     */     //   829: istore #23
/*     */     //   831: aload #4
/*     */     //   833: ldc -692256719
/*     */     //   835: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   837: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   840: aload #4
/*     */     //   842: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   847: instanceof androidx/compose/runtime/Applier
/*     */     //   850: ifne -> 856
/*     */     //   853: invokestatic invalidApplier : ()V
/*     */     //   856: aload #4
/*     */     //   858: invokeinterface startReusableNode : ()V
/*     */     //   863: aload #4
/*     */     //   865: invokeinterface getInserting : ()Z
/*     */     //   870: ifeq -> 885
/*     */     //   873: aload #4
/*     */     //   875: aload #21
/*     */     //   877: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   882: goto -> 892
/*     */     //   885: aload #4
/*     */     //   887: invokeinterface useNode : ()V
/*     */     //   892: aload #4
/*     */     //   894: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   897: astore #24
/*     */     //   899: iconst_0
/*     */     //   900: istore #25
/*     */     //   902: aload #24
/*     */     //   904: aload #15
/*     */     //   906: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   909: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   912: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   915: aload #24
/*     */     //   917: aload #19
/*     */     //   919: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   922: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   925: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   928: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   931: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   934: astore #26
/*     */     //   936: iconst_0
/*     */     //   937: istore #27
/*     */     //   939: aload #24
/*     */     //   941: astore #28
/*     */     //   943: iconst_0
/*     */     //   944: istore #29
/*     */     //   946: aload #28
/*     */     //   948: invokeinterface getInserting : ()Z
/*     */     //   953: ifne -> 974
/*     */     //   956: aload #28
/*     */     //   958: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   963: iload #18
/*     */     //   965: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   968: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   971: ifne -> 1000
/*     */     //   974: aload #28
/*     */     //   976: iload #18
/*     */     //   978: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   981: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   986: aload #24
/*     */     //   988: iload #18
/*     */     //   990: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   993: aload #26
/*     */     //   995: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1000: nop
/*     */     //   1001: nop
/*     */     //   1002: nop
/*     */     //   1003: aload #24
/*     */     //   1005: aload #20
/*     */     //   1007: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1010: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1013: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1016: nop
/*     */     //   1017: nop
/*     */     //   1018: aload #4
/*     */     //   1020: bipush #14
/*     */     //   1022: iload #22
/*     */     //   1024: bipush #6
/*     */     //   1026: ishr
/*     */     //   1027: iand
/*     */     //   1028: istore #30
/*     */     //   1030: astore #31
/*     */     //   1032: iconst_0
/*     */     //   1033: istore #32
/*     */     //   1035: aload #31
/*     */     //   1037: ldc_w -2146769399
/*     */     //   1040: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   1043: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1046: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   1049: aload #31
/*     */     //   1051: bipush #6
/*     */     //   1053: bipush #112
/*     */     //   1055: iload #13
/*     */     //   1057: bipush #6
/*     */     //   1059: ishr
/*     */     //   1060: iand
/*     */     //   1061: ior
/*     */     //   1062: istore #33
/*     */     //   1064: astore #34
/*     */     //   1066: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   1069: astore #35
/*     */     //   1071: iconst_0
/*     */     //   1072: istore #36
/*     */     //   1074: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1077: checkcast androidx/compose/ui/Modifier
/*     */     //   1080: aload #9
/*     */     //   1082: iconst_0
/*     */     //   1083: aconst_null
/*     */     //   1084: iconst_0
/*     */     //   1085: bipush #14
/*     */     //   1087: aconst_null
/*     */     //   1088: invokestatic horizontalScroll$default : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   1091: astore #37
/*     */     //   1093: getstatic androidx/compose/foundation/gestures/Orientation.Vertical : Landroidx/compose/foundation/gestures/Orientation;
/*     */     //   1096: astore #38
/*     */     //   1098: getstatic androidx/compose/foundation/gestures/ScrollableDefaults.INSTANCE : Landroidx/compose/foundation/gestures/ScrollableDefaults;
/*     */     //   1101: invokestatic getLocalLayoutDirection : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   1104: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   1107: astore #39
/*     */     //   1109: iconst_0
/*     */     //   1110: istore #40
/*     */     //   1112: iconst_0
/*     */     //   1113: istore #41
/*     */     //   1115: aload #34
/*     */     //   1117: ldc_w 2023513938
/*     */     //   1120: ldc_w 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   1123: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1126: aload #34
/*     */     //   1128: aload #39
/*     */     //   1130: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   1135: astore #42
/*     */     //   1137: aload #34
/*     */     //   1139: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1142: aload #42
/*     */     //   1144: checkcast androidx/compose/ui/unit/LayoutDirection
/*     */     //   1147: getstatic androidx/compose/foundation/gestures/Orientation.Vertical : Landroidx/compose/foundation/gestures/Orientation;
/*     */     //   1150: iconst_0
/*     */     //   1151: invokevirtual reverseDirection : (Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/foundation/gestures/Orientation;Z)Z
/*     */     //   1154: istore #43
/*     */     //   1156: aload #34
/*     */     //   1158: ldc_w -487428377
/*     */     //   1161: invokeinterface startReplaceGroup : (I)V
/*     */     //   1166: aload #34
/*     */     //   1168: astore #41
/*     */     //   1170: iconst_0
/*     */     //   1171: istore #42
/*     */     //   1173: nop
/*     */     //   1174: iconst_0
/*     */     //   1175: istore #44
/*     */     //   1177: aload #41
/*     */     //   1179: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1184: astore #45
/*     */     //   1186: iconst_0
/*     */     //   1187: istore #46
/*     */     //   1189: aload #45
/*     */     //   1191: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1194: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1197: if_acmpne -> 1222
/*     */     //   1200: iconst_0
/*     */     //   1201: istore #47
/*     */     //   1203: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   1206: astore #47
/*     */     //   1208: aload #41
/*     */     //   1210: aload #47
/*     */     //   1212: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1217: aload #47
/*     */     //   1219: goto -> 1224
/*     */     //   1222: aload #45
/*     */     //   1224: nop
/*     */     //   1225: nop
/*     */     //   1226: nop
/*     */     //   1227: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   1230: astore #40
/*     */     //   1232: aload #34
/*     */     //   1234: invokeinterface endReplaceGroup : ()V
/*     */     //   1239: aload #40
/*     */     //   1241: astore #39
/*     */     //   1243: aload #37
/*     */     //   1245: aload #9
/*     */     //   1247: checkcast androidx/compose/foundation/gestures/ScrollableState
/*     */     //   1250: aload #38
/*     */     //   1252: iconst_0
/*     */     //   1253: iload #43
/*     */     //   1255: aconst_null
/*     */     //   1256: aload #39
/*     */     //   1258: bipush #20
/*     */     //   1260: aconst_null
/*     */     //   1261: invokestatic scrollable$default : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   1264: invokestatic selectableGroup : (Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1267: astore #37
/*     */     //   1269: iconst_0
/*     */     //   1270: istore #39
/*     */     //   1272: nop
/*     */     //   1273: iconst_0
/*     */     //   1274: istore #40
/*     */     //   1276: aload #34
/*     */     //   1278: ldc_w 693286680
/*     */     //   1281: ldc_w 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*     */     //   1284: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1287: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   1290: invokevirtual getStart : ()Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */     //   1293: astore #38
/*     */     //   1295: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1298: invokevirtual getTop : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   1301: astore #43
/*     */     //   1303: aload #38
/*     */     //   1305: aload #43
/*     */     //   1307: aload #34
/*     */     //   1309: bipush #14
/*     */     //   1311: iload #39
/*     */     //   1313: iconst_3
/*     */     //   1314: ishr
/*     */     //   1315: iand
/*     */     //   1316: bipush #112
/*     */     //   1318: iload #39
/*     */     //   1320: iconst_3
/*     */     //   1321: ishr
/*     */     //   1322: iand
/*     */     //   1323: ior
/*     */     //   1324: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1327: astore #41
/*     */     //   1329: bipush #112
/*     */     //   1331: iload #39
/*     */     //   1333: iconst_3
/*     */     //   1334: ishl
/*     */     //   1335: iand
/*     */     //   1336: istore #42
/*     */     //   1338: nop
/*     */     //   1339: iconst_0
/*     */     //   1340: istore #44
/*     */     //   1342: aload #34
/*     */     //   1344: ldc -1323940314
/*     */     //   1346: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   1348: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1351: aload #34
/*     */     //   1353: iconst_0
/*     */     //   1354: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   1357: istore #45
/*     */     //   1359: aload #34
/*     */     //   1361: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1366: astore #46
/*     */     //   1368: aload #34
/*     */     //   1370: aload #37
/*     */     //   1372: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1375: astore #47
/*     */     //   1377: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1380: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1383: astore #48
/*     */     //   1385: bipush #6
/*     */     //   1387: sipush #896
/*     */     //   1390: iload #42
/*     */     //   1392: bipush #6
/*     */     //   1394: ishl
/*     */     //   1395: iand
/*     */     //   1396: ior
/*     */     //   1397: istore #49
/*     */     //   1399: nop
/*     */     //   1400: iconst_0
/*     */     //   1401: istore #50
/*     */     //   1403: aload #34
/*     */     //   1405: ldc -692256719
/*     */     //   1407: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   1409: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1412: aload #34
/*     */     //   1414: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   1419: instanceof androidx/compose/runtime/Applier
/*     */     //   1422: ifne -> 1428
/*     */     //   1425: invokestatic invalidApplier : ()V
/*     */     //   1428: aload #34
/*     */     //   1430: invokeinterface startReusableNode : ()V
/*     */     //   1435: aload #34
/*     */     //   1437: invokeinterface getInserting : ()Z
/*     */     //   1442: ifeq -> 1457
/*     */     //   1445: aload #34
/*     */     //   1447: aload #48
/*     */     //   1449: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   1454: goto -> 1464
/*     */     //   1457: aload #34
/*     */     //   1459: invokeinterface useNode : ()V
/*     */     //   1464: aload #34
/*     */     //   1466: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   1469: astore #51
/*     */     //   1471: iconst_0
/*     */     //   1472: istore #52
/*     */     //   1474: aload #51
/*     */     //   1476: aload #41
/*     */     //   1478: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1481: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1484: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1487: aload #51
/*     */     //   1489: aload #46
/*     */     //   1491: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1494: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1497: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1500: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1503: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1506: astore #53
/*     */     //   1508: iconst_0
/*     */     //   1509: istore #54
/*     */     //   1511: aload #51
/*     */     //   1513: astore #55
/*     */     //   1515: iconst_0
/*     */     //   1516: istore #56
/*     */     //   1518: aload #55
/*     */     //   1520: invokeinterface getInserting : ()Z
/*     */     //   1525: ifne -> 1546
/*     */     //   1528: aload #55
/*     */     //   1530: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1535: iload #45
/*     */     //   1537: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1540: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1543: ifne -> 1572
/*     */     //   1546: aload #55
/*     */     //   1548: iload #45
/*     */     //   1550: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1553: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1558: aload #51
/*     */     //   1560: iload #45
/*     */     //   1562: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1565: aload #53
/*     */     //   1567: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1572: nop
/*     */     //   1573: nop
/*     */     //   1574: nop
/*     */     //   1575: aload #51
/*     */     //   1577: aload #47
/*     */     //   1579: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1582: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1585: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1588: nop
/*     */     //   1589: nop
/*     */     //   1590: aload #34
/*     */     //   1592: bipush #14
/*     */     //   1594: iload #49
/*     */     //   1596: bipush #6
/*     */     //   1598: ishr
/*     */     //   1599: iand
/*     */     //   1600: istore #57
/*     */     //   1602: astore #58
/*     */     //   1604: iconst_0
/*     */     //   1605: istore #59
/*     */     //   1607: aload #58
/*     */     //   1609: ldc_w -407840262
/*     */     //   1612: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*     */     //   1615: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1618: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*     */     //   1621: aload #58
/*     */     //   1623: bipush #6
/*     */     //   1625: bipush #112
/*     */     //   1627: iload #39
/*     */     //   1629: bipush #6
/*     */     //   1631: ishr
/*     */     //   1632: iand
/*     */     //   1633: ior
/*     */     //   1634: istore #60
/*     */     //   1636: astore #61
/*     */     //   1638: checkcast androidx/compose/foundation/layout/RowScope
/*     */     //   1641: astore #62
/*     */     //   1643: iconst_0
/*     */     //   1644: istore #63
/*     */     //   1646: aload #61
/*     */     //   1648: ldc_w -1629716125
/*     */     //   1651: invokeinterface startReplaceGroup : (I)V
/*     */     //   1656: aload_0
/*     */     //   1657: checkcast java/lang/Iterable
/*     */     //   1660: astore #64
/*     */     //   1662: iconst_0
/*     */     //   1663: istore #65
/*     */     //   1665: aload #64
/*     */     //   1667: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   1672: astore #66
/*     */     //   1674: aload #66
/*     */     //   1676: invokeinterface hasNext : ()Z
/*     */     //   1681: ifeq -> 1727
/*     */     //   1684: aload #66
/*     */     //   1686: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   1691: astore #67
/*     */     //   1693: aload #67
/*     */     //   1695: checkcast org/jetbrains/jewel/ui/component/TabData
/*     */     //   1698: astore #68
/*     */     //   1700: iconst_0
/*     */     //   1701: istore #69
/*     */     //   1703: aconst_null
/*     */     //   1704: aload #8
/*     */     //   1706: invokestatic TabStrip$lambda$1 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1709: invokestatic isActive-impl : (J)Z
/*     */     //   1712: aload #68
/*     */     //   1714: aconst_null
/*     */     //   1715: aload #61
/*     */     //   1717: iconst_0
/*     */     //   1718: bipush #9
/*     */     //   1720: invokestatic TabImpl : (Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/component/TabData;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1723: nop
/*     */     //   1724: goto -> 1674
/*     */     //   1727: nop
/*     */     //   1728: aload #61
/*     */     //   1730: invokeinterface endReplaceGroup : ()V
/*     */     //   1735: nop
/*     */     //   1736: aload #58
/*     */     //   1738: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1741: aload #34
/*     */     //   1743: invokeinterface endNode : ()V
/*     */     //   1748: aload #34
/*     */     //   1750: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1753: nop
/*     */     //   1754: aload #34
/*     */     //   1756: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1759: nop
/*     */     //   1760: aload #34
/*     */     //   1762: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1765: nop
/*     */     //   1766: aload #8
/*     */     //   1768: invokestatic TabStrip$lambda$1 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1771: invokestatic isHovered-impl : (J)Z
/*     */     //   1774: aconst_null
/*     */     //   1775: bipush #125
/*     */     //   1777: iconst_0
/*     */     //   1778: invokestatic getLinearEasing : ()Landroidx/compose/animation/core/Easing;
/*     */     //   1781: invokestatic tween : (IILandroidx/compose/animation/core/Easing;)Landroidx/compose/animation/core/TweenSpec;
/*     */     //   1784: checkcast androidx/compose/animation/core/FiniteAnimationSpec
/*     */     //   1787: fconst_0
/*     */     //   1788: iconst_2
/*     */     //   1789: aconst_null
/*     */     //   1790: invokestatic fadeIn$default : (Landroidx/compose/animation/core/FiniteAnimationSpec;FILjava/lang/Object;)Landroidx/compose/animation/EnterTransition;
/*     */     //   1793: bipush #125
/*     */     //   1795: sipush #700
/*     */     //   1798: invokestatic getLinearEasing : ()Landroidx/compose/animation/core/Easing;
/*     */     //   1801: invokestatic tween : (IILandroidx/compose/animation/core/Easing;)Landroidx/compose/animation/core/TweenSpec;
/*     */     //   1804: checkcast androidx/compose/animation/core/FiniteAnimationSpec
/*     */     //   1807: fconst_0
/*     */     //   1808: iconst_2
/*     */     //   1809: aconst_null
/*     */     //   1810: invokestatic fadeOut$default : (Landroidx/compose/animation/core/FiniteAnimationSpec;FILjava/lang/Object;)Landroidx/compose/animation/ExitTransition;
/*     */     //   1813: aconst_null
/*     */     //   1814: ldc_w -933514091
/*     */     //   1817: iconst_1
/*     */     //   1818: new org/jetbrains/jewel/ui/component/TabStripKt$TabStrip$4$3
/*     */     //   1821: dup
/*     */     //   1822: aload_1
/*     */     //   1823: aload #9
/*     */     //   1825: invokespecial <init> : (Lorg/jetbrains/jewel/ui/component/styling/TabStyle;Landroidx/compose/foundation/ScrollState;)V
/*     */     //   1828: aload #34
/*     */     //   1830: bipush #54
/*     */     //   1832: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   1835: checkcast kotlin/jvm/functions/Function3
/*     */     //   1838: aload #34
/*     */     //   1840: ldc_w 196608
/*     */     //   1843: bipush #18
/*     */     //   1845: invokestatic AnimatedVisibility : (ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1848: nop
/*     */     //   1849: aload #31
/*     */     //   1851: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1854: aload #4
/*     */     //   1856: invokeinterface endNode : ()V
/*     */     //   1861: aload #4
/*     */     //   1863: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1866: nop
/*     */     //   1867: aload #4
/*     */     //   1869: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1872: nop
/*     */     //   1873: aload #4
/*     */     //   1875: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1878: nop
/*     */     //   1879: invokestatic isTraceInProgress : ()Z
/*     */     //   1882: ifeq -> 1898
/*     */     //   1885: invokestatic traceEventEnd : ()V
/*     */     //   1888: goto -> 1898
/*     */     //   1891: aload #4
/*     */     //   1893: invokeinterface skipToGroupEnd : ()V
/*     */     //   1898: aload #4
/*     */     //   1900: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1905: dup
/*     */     //   1906: ifnull -> 1930
/*     */     //   1909: aload_0
/*     */     //   1910: aload_1
/*     */     //   1911: aload_2
/*     */     //   1912: iload_3
/*     */     //   1913: iload #5
/*     */     //   1915: iload #6
/*     */     //   1917: <illegal opcode> invoke : (Ljava/util/List;Lorg/jetbrains/jewel/ui/component/styling/TabStyle;Landroidx/compose/ui/Modifier;ZII)Lkotlin/jvm/functions/Function2;
/*     */     //   1922: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1927: goto -> 1931
/*     */     //   1930: pop
/*     */     //   1931: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #34	-> 12
/*     */     //   #35	-> 304
/*     */     //   #151	-> 308
/*     */     //   #152	-> 320
/*     */     //   #153	-> 331
/*     */     //   #35	-> 334
/*     */     //   #153	-> 357
/*     */     //   #154	-> 359
/*     */     //   #155	-> 368
/*     */     //   #156	-> 373
/*     */     //   #152	-> 375
/*     */     //   #151	-> 376
/*     */     //   #151	-> 377
/*     */     //   #35	-> 378
/*     */     //   #37	-> 426
/*     */     //   #157	-> 430
/*     */     //   #158	-> 442
/*     */     //   #159	-> 458
/*     */     //   #37	-> 461
/*     */     //   #159	-> 485
/*     */     //   #160	-> 487
/*     */     //   #161	-> 496
/*     */     //   #162	-> 501
/*     */     //   #158	-> 503
/*     */     //   #157	-> 504
/*     */     //   #157	-> 505
/*     */     //   #39	-> 519
/*     */     //   #41	-> 524
/*     */     //   #163	-> 545
/*     */     //   #164	-> 557
/*     */     //   #165	-> 568
/*     */     //   #41	-> 575
/*     */     //   #165	-> 586
/*     */     //   #166	-> 588
/*     */     //   #167	-> 597
/*     */     //   #168	-> 602
/*     */     //   #164	-> 604
/*     */     //   #163	-> 605
/*     */     //   #163	-> 606
/*     */     //   #41	-> 607
/*     */     //   #163	-> 643
/*     */     //   #164	-> 655
/*     */     //   #165	-> 666
/*     */     //   #41	-> 671
/*     */     //   #165	-> 681
/*     */     //   #166	-> 683
/*     */     //   #167	-> 692
/*     */     //   #168	-> 697
/*     */     //   #164	-> 699
/*     */     //   #163	-> 700
/*     */     //   #163	-> 701
/*     */     //   #41	-> 702
/*     */     //   #40	-> 724
/*     */     //   #169	-> 734
/*     */     //   #170	-> 737
/*     */     //   #171	-> 745
/*     */     //   #174	-> 748
/*     */     //   #175	-> 766
/*     */     //   #176	-> 776
/*     */     //   #177	-> 782
/*     */     //   #178	-> 789
/*     */     //   #179	-> 798
/*     */     //   #181	-> 805
/*     */     //   #180	-> 827
/*     */     //   #182	-> 837
/*     */     //   #183	-> 840
/*     */     //   #184	-> 858
/*     */     //   #185	-> 863
/*     */     //   #186	-> 875
/*     */     //   #188	-> 887
/*     */     //   #190	-> 892
/*     */     //   #191	-> 902
/*     */     //   #192	-> 915
/*     */     //   #194	-> 928
/*     */     //   #195	-> 939
/*     */     //   #196	-> 946
/*     */     //   #197	-> 974
/*     */     //   #198	-> 986
/*     */     //   #200	-> 1000
/*     */     //   #195	-> 1001
/*     */     //   #200	-> 1002
/*     */     //   #201	-> 1003
/*     */     //   #202	-> 1016
/*     */     //   #190	-> 1017
/*     */     //   #203	-> 1018
/*     */     //   #204	-> 1043
/*     */     //   #47	-> 1074
/*     */     //   #49	-> 1093
/*     */     //   #51	-> 1098
/*     */     //   #52	-> 1101
/*     */     //   #205	-> 1123
/*     */     //   #53	-> 1147
/*     */     //   #54	-> 1150
/*     */     //   #51	-> 1151
/*     */     //   #57	-> 1173
/*     */     //   #206	-> 1177
/*     */     //   #207	-> 1189
/*     */     //   #208	-> 1200
/*     */     //   #57	-> 1203
/*     */     //   #208	-> 1206
/*     */     //   #209	-> 1208
/*     */     //   #210	-> 1217
/*     */     //   #211	-> 1222
/*     */     //   #207	-> 1224
/*     */     //   #206	-> 1225
/*     */     //   #206	-> 1226
/*     */     //   #57	-> 1227
/*     */     //   #47	-> 1243
/*     */     //   #56	-> 1245
/*     */     //   #49	-> 1250
/*     */     //   #48	-> 1252
/*     */     //   #51	-> 1253
/*     */     //   #48	-> 1255
/*     */     //   #57	-> 1256
/*     */     //   #48	-> 1258
/*     */     //   #59	-> 1264
/*     */     //   #45	-> 1272
/*     */     //   #212	-> 1284
/*     */     //   #213	-> 1287
/*     */     //   #214	-> 1295
/*     */     //   #217	-> 1303
/*     */     //   #218	-> 1338
/*     */     //   #219	-> 1348
/*     */     //   #220	-> 1354
/*     */     //   #221	-> 1361
/*     */     //   #222	-> 1370
/*     */     //   #224	-> 1377
/*     */     //   #223	-> 1399
/*     */     //   #225	-> 1409
/*     */     //   #226	-> 1412
/*     */     //   #227	-> 1430
/*     */     //   #228	-> 1435
/*     */     //   #229	-> 1447
/*     */     //   #231	-> 1459
/*     */     //   #233	-> 1464
/*     */     //   #234	-> 1474
/*     */     //   #235	-> 1487
/*     */     //   #237	-> 1500
/*     */     //   #238	-> 1511
/*     */     //   #239	-> 1518
/*     */     //   #240	-> 1546
/*     */     //   #241	-> 1558
/*     */     //   #243	-> 1572
/*     */     //   #238	-> 1573
/*     */     //   #243	-> 1574
/*     */     //   #244	-> 1575
/*     */     //   #245	-> 1588
/*     */     //   #233	-> 1589
/*     */     //   #246	-> 1590
/*     */     //   #247	-> 1615
/*     */     //   #61	-> 1656
/*     */     //   #248	-> 1665
/*     */     //   #61	-> 1704
/*     */     //   #248	-> 1723
/*     */     //   #249	-> 1727
/*     */     //   #62	-> 1735
/*     */     //   #247	-> 1736
/*     */     //   #246	-> 1741
/*     */     //   #250	-> 1743
/*     */     //   #225	-> 1750
/*     */     //   #251	-> 1753
/*     */     //   #219	-> 1756
/*     */     //   #252	-> 1759
/*     */     //   #212	-> 1762
/*     */     //   #253	-> 1765
/*     */     //   #65	-> 1766
/*     */     //   #66	-> 1775
/*     */     //   #67	-> 1793
/*     */     //   #68	-> 1814
/*     */     //   #64	-> 1845
/*     */     //   #71	-> 1848
/*     */     //   #204	-> 1849
/*     */     //   #203	-> 1854
/*     */     //   #254	-> 1856
/*     */     //   #182	-> 1863
/*     */     //   #255	-> 1866
/*     */     //   #176	-> 1869
/*     */     //   #256	-> 1872
/*     */     //   #169	-> 1875
/*     */     //   #257	-> 1878
/*     */     //   #72	-> 1891
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   334	23	15	$i$a$-cache-TabStripKt$TabStrip$tabStripState$2	I
/*     */     //   359	11	15	value$iv	Ljava/lang/Object;
/*     */     //   320	56	14	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   317	59	13	it$iv	Ljava/lang/Object;
/*     */     //   308	70	12	$i$f$cache	I
/*     */     //   305	73	10	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   305	73	11	invalid$iv	Z
/*     */     //   461	21	14	$i$a$-cache-TabStripKt$TabStrip$1	I
/*     */     //   487	11	15	value$iv	Ljava/lang/Object;
/*     */     //   442	62	13	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   439	65	12	it$iv	Ljava/lang/Object;
/*     */     //   430	76	11	$i$f$cache	I
/*     */     //   427	79	9	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   427	79	10	invalid$iv	Z
/*     */     //   575	3	16	$i$a$-cache-TabStripKt$TabStrip$2	I
/*     */     //   588	11	16	value$iv	Ljava/lang/Object;
/*     */     //   557	48	15	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   554	51	14	it$iv	Ljava/lang/Object;
/*     */     //   545	62	13	$i$f$cache	I
/*     */     //   542	65	11	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   542	65	12	invalid$iv	Z
/*     */     //   671	7	16	$i$a$-cache-TabStripKt$TabStrip$3	I
/*     */     //   683	11	17	value$iv	Ljava/lang/Object;
/*     */     //   655	45	15	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   652	48	14	it$iv	Ljava/lang/Object;
/*     */     //   643	59	13	$i$f$cache	I
/*     */     //   640	62	11	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   640	62	12	invalid$iv	Z
/*     */     //   1115	29	41	$i$f$getCurrent	I
/*     */     //   1112	32	39	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   1112	32	40	$changed$iv	I
/*     */     //   1203	3	47	$i$a$-cache-TabStripKt$TabStrip$4$1	I
/*     */     //   1208	11	47	value$iv	Ljava/lang/Object;
/*     */     //   1189	36	46	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1186	39	45	it$iv	Ljava/lang/Object;
/*     */     //   1177	50	44	$i$f$cache	I
/*     */     //   1174	53	41	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1174	53	42	invalid$iv	Z
/*     */     //   1703	20	69	$i$a$-forEach-TabStripKt$TabStrip$4$2$1	I
/*     */     //   1700	23	68	it	Lorg/jetbrains/jewel/ui/component/TabData;
/*     */     //   1693	31	67	element$iv	Ljava/lang/Object;
/*     */     //   1665	63	65	$i$f$forEach	I
/*     */     //   1662	66	64	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   1646	90	63	$i$a$-Row-TabStripKt$TabStrip$4$2	I
/*     */     //   1643	93	62	$this$TabStrip_u24lambda_u2410_u24lambda_u249	Landroidx/compose/foundation/layout/RowScope;
/*     */     //   1643	93	61	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1643	93	60	$changed	I
/*     */     //   1607	134	59	$i$a$-Layout-RowKt$Row$1$iv	I
/*     */     //   1604	137	58	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1604	137	57	$changed$iv	I
/*     */     //   1518	55	56	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   1515	58	55	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1511	64	54	$i$f$set-impl	I
/*     */     //   1508	67	53	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   1474	115	52	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   1471	118	51	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1403	351	50	$i$f$ReusableComposeNode	I
/*     */     //   1400	354	48	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   1400	354	49	$changed$iv$iv$iv	I
/*     */     //   1342	418	44	$i$f$Layout	I
/*     */     //   1359	401	45	compositeKeyHash$iv$iv	I
/*     */     //   1368	392	46	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1377	383	47	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1339	421	42	$changed$iv$iv	I
/*     */     //   1276	490	40	$i$f$Row	I
/*     */     //   1329	437	41	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1273	493	37	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1295	471	38	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */     //   1303	463	43	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   1273	493	39	$changed$iv	I
/*     */     //   1074	775	36	$i$a$-Box-TabStripKt$TabStrip$4	I
/*     */     //   1071	778	35	$this$TabStrip_u24lambda_u2410	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   1071	778	34	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1071	778	33	$changed	I
/*     */     //   1035	819	32	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   1032	822	31	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1032	822	30	$changed$iv	I
/*     */     //   946	55	29	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   943	58	28	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   939	64	27	$i$f$set-impl	I
/*     */     //   936	67	26	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   902	115	25	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   899	118	24	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   831	1036	23	$i$f$ReusableComposeNode	I
/*     */     //   828	1039	21	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   828	1039	22	$changed$iv$iv$iv	I
/*     */     //   770	1103	17	$i$f$Layout	I
/*     */     //   787	1086	18	compositeKeyHash$iv$iv	I
/*     */     //   796	1077	19	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   805	1068	20	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   767	1106	16	$changed$iv$iv	I
/*     */     //   728	1151	14	$i$f$Box	I
/*     */     //   757	1122	15	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   725	1154	10	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   745	1134	11	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   748	1131	12	propagateMinConstraints$iv	Z
/*     */     //   725	1154	13	$changed$iv	I
/*     */     //   394	1494	8	tabStripState$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   524	1364	9	scrollState	Landroidx/compose/foundation/ScrollState;
/*     */     //   27	1905	7	$dirty	I
/*     */     //   0	1932	0	tabs	Ljava/util/List;
/*     */     //   0	1932	1	style	Lorg/jetbrains/jewel/ui/component/styling/TabStyle;
/*     */     //   0	1932	2	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1932	3	enabled	Z
/*     */     //   0	1932	4	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1932	5	$changed	I
/*     */   }
/*     */   
/*  35 */   private static final long TabStrip$lambda$1(MutableState $tabStripState$delegate) { State state = (State)$tabStripState$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (
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
/* 258 */       (TabStripState)state.getValue()).unbox-impl(); } private static final void TabStrip$lambda$2(MutableState $tabStripState$delegate, long <set-?>) { MutableState mutableState = $tabStripState$delegate; Object object1 = null, object2 = null; Object value$iv = TabStripState.box-impl(<set-?>); int $i$f$setValue = 0;
/* 259 */     mutableState.setValue(value$iv); }
/*     */ 
/*     */   
/*     */   private static final Unit TabStrip$lambda$6$lambda$5(MutableState<TabStripState> $tabStripState$delegate, boolean it) {
/*     */     TabStrip$lambda$2($tabStripState$delegate, TabStripState.copy-zFr0jqg$default(TabStrip$lambda$1($tabStripState$delegate), false, false, false, it, false, 23, null));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit TabStrip$lambda$11(List<? extends TabData> $tabs, TabStyle $style, Modifier $modifier, boolean $enabled, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     TabStrip($tabs, $style, $modifier, $enabled, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   static final class TabStripKt$TabStrip$4$3 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(AnimatedVisibilityScope $this$AnimatedVisibility, Composer $composer, int $changed) {
/*     */       Intrinsics.checkNotNullParameter($this$AnimatedVisibility, "$this$AnimatedVisibility");
/*     */       if (ComposerKt.isTraceInProgress())
/*     */         ComposerKt.traceEventStart(-933514091, $changed, -1, "org.jetbrains.jewel.ui.component.TabStrip.<anonymous>.<anonymous> (TabStrip.kt:68)"); 
/*     */       ScrollbarStyle scrollbarStyle = this.$style.getScrollbarStyle();
/*     */       Modifier modifier = SizeKt.fillMaxWidth$default((Modifier)Modifier.Companion, 0.0F, 1, null);
/*     */       ScrollbarKt.HorizontalScrollbar((ScrollableState)this.$scrollState, modifier, false, false, null, scrollbarStyle, false, $composer, 48, 92);
/*     */       if (ComposerKt.isTraceInProgress())
/*     */         ComposerKt.traceEventEnd(); 
/*     */     }
/*     */     
/*     */     TabStripKt$TabStrip$4$3(TabStyle $style, ScrollState $scrollState) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\TabStripKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */