/*    */ package org.jetbrains.jewel.ui.component;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.CompositionLocal;
/*    */ import androidx.compose.ui.Modifier;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.functions.Function4;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.jewel.foundation.lazy.SelectableLazyItemScope;
/*    */ import org.jetbrains.jewel.foundation.lazy.tree.KeyActions;
/*    */ import org.jetbrains.jewel.foundation.lazy.tree.Tree;
/*    */ import org.jetbrains.jewel.foundation.lazy.tree.TreeElementState;
/*    */ import org.jetbrains.jewel.foundation.lazy.tree.TreeState;
/*    */ import org.jetbrains.jewel.ui.component.styling.LazyTreeStyle;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000N\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020 \n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\032Í\001\020\000\032\0020\001\"\004\b\000\020\0022\f\020\003\032\b\022\004\022\002H\0020\0042\b\b\002\020\005\032\0020\0062\032\b\002\020\007\032\024\022\n\022\b\022\004\022\002H\0020\t\022\004\022\0020\0010\b2\b\b\002\020\n\032\0020\0132\032\b\002\020\f\032\024\022\n\022\b\022\004\022\002H\0020\t\022\004\022\0020\0010\b2 \b\002\020\r\032\032\022\020\022\016\022\n\022\b\022\004\022\002H\0020\t0\016\022\004\022\0020\0010\b2\b\b\002\020\017\032\0020\0202\b\b\002\020\021\032\0020\0222(\020\023\032$\022\004\022\0020\025\022\n\022\b\022\004\022\002H\0020\t\022\004\022\0020\0010\024¢\006\002\b\026¢\006\002\b\027H\007¢\006\002\020\030¨\006\031"}, d2 = {"LazyTree", "", "T", "tree", "Lorg/jetbrains/jewel/foundation/lazy/tree/Tree;", "modifier", "Landroidx/compose/ui/Modifier;", "onElementClick", "Lkotlin/Function1;", "Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;", "treeState", "Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;", "onElementDoubleClick", "onSelectionChange", "", "keyActions", "Lorg/jetbrains/jewel/foundation/lazy/tree/KeyActions;", "style", "Lorg/jetbrains/jewel/ui/component/styling/LazyTreeStyle;", "nodeContent", "Lkotlin/Function2;", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyItemScope;", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/runtime/Composable;", "(Lorg/jetbrains/jewel/foundation/lazy/tree/Tree;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lorg/jetbrains/jewel/foundation/lazy/tree/KeyActions;Lorg/jetbrains/jewel/ui/component/styling/LazyTreeStyle;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "ui"})
/*    */ @SourceDebugExtension({"SMAP\nLazyTree.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyTree.kt\norg/jetbrains/jewel/ui/component/LazyTreeKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,69:1\n1225#2,6:70\n1225#2,6:76\n1225#2,6:82\n*S KotlinDebug\n*F\n+ 1 LazyTree.kt\norg/jetbrains/jewel/ui/component/LazyTreeKt\n*L\n27#1:70,6\n29#1:76,6\n30#1:82,6\n*E\n"})
/*    */ public final class LazyTreeKt {
/*    */   private static final Unit LazyTree$lambda$1$lambda$0(Tree.Element it) {
/* 27 */     Intrinsics.checkNotNullParameter(it, "it"); return Unit.INSTANCE;
/*    */   }
/* 29 */   private static final Unit LazyTree$lambda$3$lambda$2(Tree.Element it) { Intrinsics.checkNotNullParameter(it, "it"); return Unit.INSTANCE; } private static final Unit LazyTree$lambda$5$lambda$4(List it) {
/* 30 */     Intrinsics.checkNotNullParameter(it, "it"); return Unit.INSTANCE;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @ExperimentalJewelApi
/*    */   @Composable
/*    */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*    */   public static final <T> void LazyTree(@NotNull Tree tree, @Nullable Modifier modifier, @Nullable Function1 onElementClick, @Nullable TreeState treeState, @Nullable Function1 onElementDoubleClick, @Nullable Function1 onSelectionChange, @Nullable KeyActions keyActions, @Nullable LazyTreeStyle style, @NotNull Function4 nodeContent, @Nullable Composer $composer, int $changed, int paramInt1) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ldc 'tree'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload #8
/*    */     //   8: ldc 'nodeContent'
/*    */     //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   13: aload #9
/*    */     //   15: ldc -1017566563
/*    */     //   17: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*    */     //   22: astore #9
/*    */     //   24: iload #10
/*    */     //   26: istore #12
/*    */     //   28: iload #11
/*    */     //   30: iconst_1
/*    */     //   31: iand
/*    */     //   32: ifeq -> 45
/*    */     //   35: iload #12
/*    */     //   37: bipush #6
/*    */     //   39: ior
/*    */     //   40: istore #12
/*    */     //   42: goto -> 93
/*    */     //   45: iload #10
/*    */     //   47: bipush #6
/*    */     //   49: iand
/*    */     //   50: ifne -> 93
/*    */     //   53: iload #12
/*    */     //   55: iload #10
/*    */     //   57: bipush #8
/*    */     //   59: iand
/*    */     //   60: ifne -> 74
/*    */     //   63: aload #9
/*    */     //   65: aload_0
/*    */     //   66: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   71: goto -> 82
/*    */     //   74: aload #9
/*    */     //   76: aload_0
/*    */     //   77: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   82: ifeq -> 89
/*    */     //   85: iconst_4
/*    */     //   86: goto -> 90
/*    */     //   89: iconst_2
/*    */     //   90: ior
/*    */     //   91: istore #12
/*    */     //   93: iload #11
/*    */     //   95: iconst_2
/*    */     //   96: iand
/*    */     //   97: ifeq -> 110
/*    */     //   100: iload #12
/*    */     //   102: bipush #48
/*    */     //   104: ior
/*    */     //   105: istore #12
/*    */     //   107: goto -> 141
/*    */     //   110: iload #10
/*    */     //   112: bipush #48
/*    */     //   114: iand
/*    */     //   115: ifne -> 141
/*    */     //   118: iload #12
/*    */     //   120: aload #9
/*    */     //   122: aload_1
/*    */     //   123: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   128: ifeq -> 136
/*    */     //   131: bipush #32
/*    */     //   133: goto -> 138
/*    */     //   136: bipush #16
/*    */     //   138: ior
/*    */     //   139: istore #12
/*    */     //   141: iload #11
/*    */     //   143: iconst_4
/*    */     //   144: iand
/*    */     //   145: ifeq -> 159
/*    */     //   148: iload #12
/*    */     //   150: sipush #384
/*    */     //   153: ior
/*    */     //   154: istore #12
/*    */     //   156: goto -> 193
/*    */     //   159: iload #10
/*    */     //   161: sipush #384
/*    */     //   164: iand
/*    */     //   165: ifne -> 193
/*    */     //   168: iload #12
/*    */     //   170: aload #9
/*    */     //   172: aload_2
/*    */     //   173: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   178: ifeq -> 187
/*    */     //   181: sipush #256
/*    */     //   184: goto -> 190
/*    */     //   187: sipush #128
/*    */     //   190: ior
/*    */     //   191: istore #12
/*    */     //   193: iload #10
/*    */     //   195: sipush #3072
/*    */     //   198: iand
/*    */     //   199: ifne -> 255
/*    */     //   202: iload #12
/*    */     //   204: iload #11
/*    */     //   206: bipush #8
/*    */     //   208: iand
/*    */     //   209: ifne -> 249
/*    */     //   212: iload #10
/*    */     //   214: sipush #4096
/*    */     //   217: iand
/*    */     //   218: ifne -> 232
/*    */     //   221: aload #9
/*    */     //   223: aload_3
/*    */     //   224: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   229: goto -> 240
/*    */     //   232: aload #9
/*    */     //   234: aload_3
/*    */     //   235: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   240: ifeq -> 249
/*    */     //   243: sipush #2048
/*    */     //   246: goto -> 252
/*    */     //   249: sipush #1024
/*    */     //   252: ior
/*    */     //   253: istore #12
/*    */     //   255: iload #11
/*    */     //   257: bipush #16
/*    */     //   259: iand
/*    */     //   260: ifeq -> 274
/*    */     //   263: iload #12
/*    */     //   265: sipush #24576
/*    */     //   268: ior
/*    */     //   269: istore #12
/*    */     //   271: goto -> 309
/*    */     //   274: iload #10
/*    */     //   276: sipush #24576
/*    */     //   279: iand
/*    */     //   280: ifne -> 309
/*    */     //   283: iload #12
/*    */     //   285: aload #9
/*    */     //   287: aload #4
/*    */     //   289: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   294: ifeq -> 303
/*    */     //   297: sipush #16384
/*    */     //   300: goto -> 306
/*    */     //   303: sipush #8192
/*    */     //   306: ior
/*    */     //   307: istore #12
/*    */     //   309: iload #11
/*    */     //   311: bipush #32
/*    */     //   313: iand
/*    */     //   314: ifeq -> 327
/*    */     //   317: iload #12
/*    */     //   319: ldc 196608
/*    */     //   321: ior
/*    */     //   322: istore #12
/*    */     //   324: goto -> 359
/*    */     //   327: iload #10
/*    */     //   329: ldc 196608
/*    */     //   331: iand
/*    */     //   332: ifne -> 359
/*    */     //   335: iload #12
/*    */     //   337: aload #9
/*    */     //   339: aload #5
/*    */     //   341: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   346: ifeq -> 354
/*    */     //   349: ldc 131072
/*    */     //   351: goto -> 356
/*    */     //   354: ldc 65536
/*    */     //   356: ior
/*    */     //   357: istore #12
/*    */     //   359: iload #10
/*    */     //   361: ldc 1572864
/*    */     //   363: iand
/*    */     //   364: ifne -> 399
/*    */     //   367: iload #12
/*    */     //   369: iload #11
/*    */     //   371: bipush #64
/*    */     //   373: iand
/*    */     //   374: ifne -> 394
/*    */     //   377: aload #9
/*    */     //   379: aload #6
/*    */     //   381: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   386: ifeq -> 394
/*    */     //   389: ldc 1048576
/*    */     //   391: goto -> 396
/*    */     //   394: ldc 524288
/*    */     //   396: ior
/*    */     //   397: istore #12
/*    */     //   399: iload #10
/*    */     //   401: ldc 12582912
/*    */     //   403: iand
/*    */     //   404: ifne -> 440
/*    */     //   407: iload #12
/*    */     //   409: iload #11
/*    */     //   411: sipush #128
/*    */     //   414: iand
/*    */     //   415: ifne -> 435
/*    */     //   418: aload #9
/*    */     //   420: aload #7
/*    */     //   422: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   427: ifeq -> 435
/*    */     //   430: ldc 8388608
/*    */     //   432: goto -> 437
/*    */     //   435: ldc 4194304
/*    */     //   437: ior
/*    */     //   438: istore #12
/*    */     //   440: iload #11
/*    */     //   442: sipush #256
/*    */     //   445: iand
/*    */     //   446: ifeq -> 459
/*    */     //   449: iload #12
/*    */     //   451: ldc 100663296
/*    */     //   453: ior
/*    */     //   454: istore #12
/*    */     //   456: goto -> 491
/*    */     //   459: iload #10
/*    */     //   461: ldc 100663296
/*    */     //   463: iand
/*    */     //   464: ifne -> 491
/*    */     //   467: iload #12
/*    */     //   469: aload #9
/*    */     //   471: aload #8
/*    */     //   473: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   478: ifeq -> 486
/*    */     //   481: ldc 67108864
/*    */     //   483: goto -> 488
/*    */     //   486: ldc 33554432
/*    */     //   488: ior
/*    */     //   489: istore #12
/*    */     //   491: iload #12
/*    */     //   493: ldc 38347923
/*    */     //   495: iand
/*    */     //   496: ldc 38347922
/*    */     //   498: if_icmpne -> 511
/*    */     //   501: aload #9
/*    */     //   503: invokeinterface getSkipping : ()Z
/*    */     //   508: ifne -> 1206
/*    */     //   511: aload #9
/*    */     //   513: invokeinterface startDefaults : ()V
/*    */     //   518: iload #10
/*    */     //   520: iconst_1
/*    */     //   521: iand
/*    */     //   522: ifeq -> 535
/*    */     //   525: aload #9
/*    */     //   527: invokeinterface getDefaultsInvalid : ()Z
/*    */     //   532: ifeq -> 913
/*    */     //   535: iload #11
/*    */     //   537: iconst_2
/*    */     //   538: iand
/*    */     //   539: ifeq -> 549
/*    */     //   542: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   545: checkcast androidx/compose/ui/Modifier
/*    */     //   548: astore_1
/*    */     //   549: iload #11
/*    */     //   551: iconst_4
/*    */     //   552: iand
/*    */     //   553: ifeq -> 642
/*    */     //   556: aload #9
/*    */     //   558: ldc 1039950386
/*    */     //   560: invokeinterface startReplaceGroup : (I)V
/*    */     //   565: aload #9
/*    */     //   567: astore #14
/*    */     //   569: iconst_0
/*    */     //   570: istore #15
/*    */     //   572: iconst_0
/*    */     //   573: istore #16
/*    */     //   575: aload #14
/*    */     //   577: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   582: astore #17
/*    */     //   584: iconst_0
/*    */     //   585: istore #18
/*    */     //   587: aload #17
/*    */     //   589: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   592: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   595: if_acmpne -> 622
/*    */     //   598: iconst_0
/*    */     //   599: istore #19
/*    */     //   601: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*    */     //   606: astore #19
/*    */     //   608: aload #14
/*    */     //   610: aload #19
/*    */     //   612: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   617: aload #19
/*    */     //   619: goto -> 624
/*    */     //   622: aload #17
/*    */     //   624: nop
/*    */     //   625: nop
/*    */     //   626: nop
/*    */     //   627: checkcast kotlin/jvm/functions/Function1
/*    */     //   630: astore #13
/*    */     //   632: aload #9
/*    */     //   634: invokeinterface endReplaceGroup : ()V
/*    */     //   639: aload #13
/*    */     //   641: astore_2
/*    */     //   642: iload #11
/*    */     //   644: bipush #8
/*    */     //   646: iand
/*    */     //   647: ifeq -> 668
/*    */     //   650: aconst_null
/*    */     //   651: aconst_null
/*    */     //   652: aload #9
/*    */     //   654: iconst_0
/*    */     //   655: iconst_3
/*    */     //   656: invokestatic rememberTreeState : (Landroidx/compose/foundation/lazy/LazyListState;Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;Landroidx/compose/runtime/Composer;II)Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;
/*    */     //   659: astore_3
/*    */     //   660: iload #12
/*    */     //   662: sipush #-7169
/*    */     //   665: iand
/*    */     //   666: istore #12
/*    */     //   668: iload #11
/*    */     //   670: bipush #16
/*    */     //   672: iand
/*    */     //   673: ifeq -> 763
/*    */     //   676: aload #9
/*    */     //   678: ldc 1039953778
/*    */     //   680: invokeinterface startReplaceGroup : (I)V
/*    */     //   685: aload #9
/*    */     //   687: astore #14
/*    */     //   689: iconst_0
/*    */     //   690: istore #15
/*    */     //   692: iconst_0
/*    */     //   693: istore #16
/*    */     //   695: aload #14
/*    */     //   697: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   702: astore #17
/*    */     //   704: iconst_0
/*    */     //   705: istore #18
/*    */     //   707: aload #17
/*    */     //   709: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   712: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   715: if_acmpne -> 742
/*    */     //   718: iconst_0
/*    */     //   719: istore #19
/*    */     //   721: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*    */     //   726: astore #19
/*    */     //   728: aload #14
/*    */     //   730: aload #19
/*    */     //   732: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   737: aload #19
/*    */     //   739: goto -> 744
/*    */     //   742: aload #17
/*    */     //   744: nop
/*    */     //   745: nop
/*    */     //   746: nop
/*    */     //   747: checkcast kotlin/jvm/functions/Function1
/*    */     //   750: astore #13
/*    */     //   752: aload #9
/*    */     //   754: invokeinterface endReplaceGroup : ()V
/*    */     //   759: aload #13
/*    */     //   761: astore #4
/*    */     //   763: iload #11
/*    */     //   765: bipush #32
/*    */     //   767: iand
/*    */     //   768: ifeq -> 858
/*    */     //   771: aload #9
/*    */     //   773: ldc 1039955730
/*    */     //   775: invokeinterface startReplaceGroup : (I)V
/*    */     //   780: aload #9
/*    */     //   782: astore #14
/*    */     //   784: iconst_0
/*    */     //   785: istore #15
/*    */     //   787: iconst_0
/*    */     //   788: istore #16
/*    */     //   790: aload #14
/*    */     //   792: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   797: astore #17
/*    */     //   799: iconst_0
/*    */     //   800: istore #18
/*    */     //   802: aload #17
/*    */     //   804: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   807: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   810: if_acmpne -> 837
/*    */     //   813: iconst_0
/*    */     //   814: istore #19
/*    */     //   816: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*    */     //   821: astore #19
/*    */     //   823: aload #14
/*    */     //   825: aload #19
/*    */     //   827: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   832: aload #19
/*    */     //   834: goto -> 839
/*    */     //   837: aload #17
/*    */     //   839: nop
/*    */     //   840: nop
/*    */     //   841: nop
/*    */     //   842: checkcast kotlin/jvm/functions/Function1
/*    */     //   845: astore #13
/*    */     //   847: aload #9
/*    */     //   849: invokeinterface endReplaceGroup : ()V
/*    */     //   854: aload #13
/*    */     //   856: astore #5
/*    */     //   858: iload #11
/*    */     //   860: bipush #64
/*    */     //   862: iand
/*    */     //   863: ifeq -> 882
/*    */     //   866: aload_3
/*    */     //   867: invokestatic DefaultTreeViewKeyActions : (Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;)Lorg/jetbrains/jewel/foundation/lazy/tree/DefaultTreeViewKeyActions;
/*    */     //   870: checkcast org/jetbrains/jewel/foundation/lazy/tree/KeyActions
/*    */     //   873: astore #6
/*    */     //   875: iload #12
/*    */     //   877: ldc -3670017
/*    */     //   879: iand
/*    */     //   880: istore #12
/*    */     //   882: iload #11
/*    */     //   884: sipush #128
/*    */     //   887: iand
/*    */     //   888: ifeq -> 967
/*    */     //   891: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*    */     //   894: aload #9
/*    */     //   896: bipush #6
/*    */     //   898: invokestatic getTreeStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/LazyTreeStyle;
/*    */     //   901: astore #7
/*    */     //   903: iload #12
/*    */     //   905: ldc -29360129
/*    */     //   907: iand
/*    */     //   908: istore #12
/*    */     //   910: goto -> 967
/*    */     //   913: aload #9
/*    */     //   915: invokeinterface skipToGroupEnd : ()V
/*    */     //   920: iload #11
/*    */     //   922: bipush #8
/*    */     //   924: iand
/*    */     //   925: ifeq -> 936
/*    */     //   928: iload #12
/*    */     //   930: sipush #-7169
/*    */     //   933: iand
/*    */     //   934: istore #12
/*    */     //   936: iload #11
/*    */     //   938: bipush #64
/*    */     //   940: iand
/*    */     //   941: ifeq -> 951
/*    */     //   944: iload #12
/*    */     //   946: ldc -3670017
/*    */     //   948: iand
/*    */     //   949: istore #12
/*    */     //   951: iload #11
/*    */     //   953: sipush #128
/*    */     //   956: iand
/*    */     //   957: ifeq -> 967
/*    */     //   960: iload #12
/*    */     //   962: ldc -29360129
/*    */     //   964: iand
/*    */     //   965: istore #12
/*    */     //   967: aload #9
/*    */     //   969: invokeinterface endDefaults : ()V
/*    */     //   974: invokestatic isTraceInProgress : ()Z
/*    */     //   977: ifeq -> 990
/*    */     //   980: ldc -1017566563
/*    */     //   982: iload #12
/*    */     //   984: iconst_m1
/*    */     //   985: ldc 'org.jetbrains.jewel.ui.component.LazyTree (LazyTree.kt:33)'
/*    */     //   987: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   990: aload #7
/*    */     //   992: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/SimpleListItemColors;
/*    */     //   995: astore #13
/*    */     //   997: aload #7
/*    */     //   999: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/LazyTreeMetrics;
/*    */     //   1002: astore #14
/*    */     //   1004: aload_0
/*    */     //   1005: aconst_null
/*    */     //   1006: aload_2
/*    */     //   1007: aload #13
/*    */     //   1009: invokevirtual getBackgroundFocused-0d7_KjU : ()J
/*    */     //   1012: aload #13
/*    */     //   1014: invokevirtual getBackgroundSelectedFocused-0d7_KjU : ()J
/*    */     //   1017: aload #13
/*    */     //   1019: invokevirtual getBackgroundSelected-0d7_KjU : ()J
/*    */     //   1022: aload #14
/*    */     //   1024: invokevirtual getIndentSize-D9Ej5fM : ()F
/*    */     //   1027: aload #14
/*    */     //   1029: invokevirtual getSimpleListItemMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/SimpleListItemMetrics;
/*    */     //   1032: invokevirtual getSelectionBackgroundCornerSize : ()Landroidx/compose/foundation/shape/CornerSize;
/*    */     //   1035: aload #14
/*    */     //   1037: invokevirtual getSimpleListItemMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/SimpleListItemMetrics;
/*    */     //   1040: invokevirtual getOuterPadding : ()Landroidx/compose/foundation/layout/PaddingValues;
/*    */     //   1043: aload #14
/*    */     //   1045: invokevirtual getSimpleListItemMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/SimpleListItemMetrics;
/*    */     //   1048: invokevirtual getInnerPadding : ()Landroidx/compose/foundation/layout/PaddingValues;
/*    */     //   1051: aload #14
/*    */     //   1053: invokevirtual getElementMinHeight-D9Ej5fM : ()F
/*    */     //   1056: aload #14
/*    */     //   1058: invokevirtual getChevronContentGap-D9Ej5fM : ()F
/*    */     //   1061: aload_3
/*    */     //   1062: aload_1
/*    */     //   1063: aload #4
/*    */     //   1065: aload #5
/*    */     //   1067: lconst_0
/*    */     //   1068: aload #6
/*    */     //   1070: aconst_null
/*    */     //   1071: ldc -1675396453
/*    */     //   1073: iconst_1
/*    */     //   1074: new org/jetbrains/jewel/ui/component/LazyTreeKt$LazyTree$4
/*    */     //   1077: dup
/*    */     //   1078: aload #7
/*    */     //   1080: invokespecial <init> : (Lorg/jetbrains/jewel/ui/component/styling/LazyTreeStyle;)V
/*    */     //   1083: aload #9
/*    */     //   1085: bipush #54
/*    */     //   1087: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*    */     //   1090: checkcast kotlin/jvm/functions/Function3
/*    */     //   1093: ldc 1240032589
/*    */     //   1095: iconst_1
/*    */     //   1096: new org/jetbrains/jewel/ui/component/LazyTreeKt$LazyTree$5
/*    */     //   1099: dup
/*    */     //   1100: aload #7
/*    */     //   1102: aload #8
/*    */     //   1104: invokespecial <init> : (Lorg/jetbrains/jewel/ui/component/styling/LazyTreeStyle;Lkotlin/jvm/functions/Function4;)V
/*    */     //   1107: aload #9
/*    */     //   1109: bipush #54
/*    */     //   1111: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*    */     //   1114: checkcast kotlin/jvm/functions/Function4
/*    */     //   1117: aload #9
/*    */     //   1119: getstatic org/jetbrains/jewel/foundation/lazy/tree/Tree.$stable : I
/*    */     //   1122: bipush #14
/*    */     //   1124: iload #12
/*    */     //   1126: iand
/*    */     //   1127: ior
/*    */     //   1128: sipush #896
/*    */     //   1131: iload #12
/*    */     //   1133: iand
/*    */     //   1134: ior
/*    */     //   1135: ldc 805306368
/*    */     //   1137: getstatic org/jetbrains/jewel/foundation/lazy/tree/TreeState.$stable : I
/*    */     //   1140: bipush #6
/*    */     //   1142: ishl
/*    */     //   1143: ior
/*    */     //   1144: sipush #896
/*    */     //   1147: iload #12
/*    */     //   1149: iconst_3
/*    */     //   1150: ishr
/*    */     //   1151: iand
/*    */     //   1152: ior
/*    */     //   1153: sipush #7168
/*    */     //   1156: iload #12
/*    */     //   1158: bipush #6
/*    */     //   1160: ishl
/*    */     //   1161: iand
/*    */     //   1162: ior
/*    */     //   1163: ldc_w 57344
/*    */     //   1166: iload #12
/*    */     //   1168: iand
/*    */     //   1169: ior
/*    */     //   1170: ldc_w 458752
/*    */     //   1173: iload #12
/*    */     //   1175: iand
/*    */     //   1176: ior
/*    */     //   1177: ldc_w 29360128
/*    */     //   1180: iload #12
/*    */     //   1182: iconst_3
/*    */     //   1183: ishl
/*    */     //   1184: iand
/*    */     //   1185: ior
/*    */     //   1186: bipush #6
/*    */     //   1188: ldc_w 327682
/*    */     //   1191: invokestatic BasicLazyTree-orM9XXQ : (Lorg/jetbrains/jewel/foundation/lazy/tree/Tree;Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;Lkotlin/jvm/functions/Function1;JJJFLandroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/PaddingValues;FFLorg/jetbrains/jewel/foundation/lazy/tree/TreeState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;JLorg/jetbrains/jewel/foundation/lazy/tree/KeyActions;Lorg/jetbrains/jewel/foundation/lazy/tree/PointerEventActions;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;IIII)V
/*    */     //   1194: invokestatic isTraceInProgress : ()Z
/*    */     //   1197: ifeq -> 1213
/*    */     //   1200: invokestatic traceEventEnd : ()V
/*    */     //   1203: goto -> 1213
/*    */     //   1206: aload #9
/*    */     //   1208: invokeinterface skipToGroupEnd : ()V
/*    */     //   1213: aload #9
/*    */     //   1215: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*    */     //   1220: dup
/*    */     //   1221: ifnull -> 1255
/*    */     //   1224: aload_0
/*    */     //   1225: aload_1
/*    */     //   1226: aload_2
/*    */     //   1227: aload_3
/*    */     //   1228: aload #4
/*    */     //   1230: aload #5
/*    */     //   1232: aload #6
/*    */     //   1234: aload #7
/*    */     //   1236: aload #8
/*    */     //   1238: iload #10
/*    */     //   1240: iload #11
/*    */     //   1242: <illegal opcode> invoke : (Lorg/jetbrains/jewel/foundation/lazy/tree/Tree;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lorg/jetbrains/jewel/foundation/lazy/tree/KeyActions;Lorg/jetbrains/jewel/ui/component/styling/LazyTreeStyle;Lkotlin/jvm/functions/Function4;II)Lkotlin/jvm/functions/Function2;
/*    */     //   1247: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*    */     //   1252: goto -> 1256
/*    */     //   1255: pop
/*    */     //   1256: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #34	-> 13
/*    */     //   #26	-> 542
/*    */     //   #27	-> 556
/*    */     //   #70	-> 575
/*    */     //   #71	-> 587
/*    */     //   #72	-> 598
/*    */     //   #72	-> 606
/*    */     //   #73	-> 608
/*    */     //   #74	-> 617
/*    */     //   #75	-> 622
/*    */     //   #71	-> 624
/*    */     //   #70	-> 625
/*    */     //   #70	-> 626
/*    */     //   #27	-> 627
/*    */     //   #28	-> 650
/*    */     //   #29	-> 676
/*    */     //   #76	-> 695
/*    */     //   #77	-> 707
/*    */     //   #78	-> 718
/*    */     //   #78	-> 726
/*    */     //   #79	-> 728
/*    */     //   #80	-> 737
/*    */     //   #81	-> 742
/*    */     //   #77	-> 744
/*    */     //   #76	-> 745
/*    */     //   #76	-> 746
/*    */     //   #29	-> 747
/*    */     //   #30	-> 771
/*    */     //   #82	-> 790
/*    */     //   #83	-> 802
/*    */     //   #84	-> 813
/*    */     //   #84	-> 821
/*    */     //   #85	-> 823
/*    */     //   #86	-> 832
/*    */     //   #87	-> 837
/*    */     //   #83	-> 839
/*    */     //   #82	-> 840
/*    */     //   #82	-> 841
/*    */     //   #30	-> 842
/*    */     //   #31	-> 866
/*    */     //   #32	-> 891
/*    */     //   #34	-> 987
/*    */     //   #35	-> 990
/*    */     //   #36	-> 997
/*    */     //   #39	-> 1004
/*    */     //   #40	-> 1006
/*    */     //   #41	-> 1007
/*    */     //   #42	-> 1012
/*    */     //   #43	-> 1017
/*    */     //   #44	-> 1022
/*    */     //   #45	-> 1027
/*    */     //   #46	-> 1035
/*    */     //   #47	-> 1043
/*    */     //   #48	-> 1051
/*    */     //   #49	-> 1056
/*    */     //   #50	-> 1061
/*    */     //   #51	-> 1062
/*    */     //   #52	-> 1063
/*    */     //   #53	-> 1065
/*    */     //   #54	-> 1068
/*    */     //   #55	-> 1071
/*    */     //   #59	-> 1093
/*    */     //   #38	-> 1191
/*    */     //   #68	-> 1206
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   601	5	19	$i$a$-cache-LazyTreeKt$LazyTree$1	I
/*    */     //   608	11	19	value$iv	Ljava/lang/Object;
/*    */     //   587	38	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   584	41	17	it$iv	Ljava/lang/Object;
/*    */     //   575	52	16	$i$f$cache	I
/*    */     //   572	55	14	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   572	55	15	invalid$iv	Z
/*    */     //   721	5	19	$i$a$-cache-LazyTreeKt$LazyTree$2	I
/*    */     //   728	11	19	value$iv	Ljava/lang/Object;
/*    */     //   707	38	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   704	41	17	it$iv	Ljava/lang/Object;
/*    */     //   695	52	16	$i$f$cache	I
/*    */     //   692	55	14	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   692	55	15	invalid$iv	Z
/*    */     //   816	5	19	$i$a$-cache-LazyTreeKt$LazyTree$3	I
/*    */     //   823	11	19	value$iv	Ljava/lang/Object;
/*    */     //   802	38	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   799	41	17	it$iv	Ljava/lang/Object;
/*    */     //   790	52	16	$i$f$cache	I
/*    */     //   787	55	14	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   787	55	15	invalid$iv	Z
/*    */     //   997	206	13	colors	Lorg/jetbrains/jewel/ui/component/styling/SimpleListItemColors;
/*    */     //   1004	199	14	metrics	Lorg/jetbrains/jewel/ui/component/styling/LazyTreeMetrics;
/*    */     //   28	1229	12	$dirty	I
/*    */     //   0	1257	0	tree	Lorg/jetbrains/jewel/foundation/lazy/tree/Tree;
/*    */     //   0	1257	1	modifier	Landroidx/compose/ui/Modifier;
/*    */     //   0	1257	2	onElementClick	Lkotlin/jvm/functions/Function1;
/*    */     //   0	1257	3	treeState	Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;
/*    */     //   0	1257	4	onElementDoubleClick	Lkotlin/jvm/functions/Function1;
/*    */     //   0	1257	5	onSelectionChange	Lkotlin/jvm/functions/Function1;
/*    */     //   0	1257	6	keyActions	Lorg/jetbrains/jewel/foundation/lazy/tree/KeyActions;
/*    */     //   0	1257	7	style	Lorg/jetbrains/jewel/ui/component/styling/LazyTreeStyle;
/*    */     //   0	1257	8	nodeContent	Lkotlin/jvm/functions/Function4;
/*    */     //   0	1257	9	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	1257	10	$changed	I
/*    */   }
/*    */ 
/*    */   
/*    */   private static final Unit LazyTree$lambda$6(Tree<?> $tree, Modifier $modifier, Function1<? super Tree.Element<?>, Unit> $onElementClick, TreeState $treeState, Function1<? super Tree.Element<?>, Unit> $onElementDoubleClick, Function1<? super List<? extends Tree.Element<?>>, Unit> $onSelectionChange, KeyActions $keyActions, LazyTreeStyle $style, Function4<? super SelectableLazyItemScope, ? super Tree.Element<?>, ? super Composer, ? super Integer, Unit> $nodeContent, int $$changed, int $$default, Composer $composer, int $force) {
/*    */     LazyTree($tree, $modifier, $onElementClick, $treeState, $onElementDoubleClick, $onSelectionChange, $keyActions, $style, $nodeContent, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*    */   static final class LazyTreeKt$LazyTree$4
/*    */     implements Function3<TreeElementState, Composer, Integer, Unit>
/*    */   {
/*    */     @Composable
/*    */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */     public final void invoke-EWxiZrY(long elementState, Composer $composer, int $changed) {
/* 56 */       int $dirty = $changed; if (($changed & 0x6) == 0) $dirty |= $composer.changed(elementState) ? 4 : 2;  if (($dirty & 0x13) != 18 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1675396453, $dirty, -1, "org.jetbrains.jewel.ui.component.LazyTree.<anonymous> (LazyTree.kt:55)");  IconKey iconKey = this.$style.getIcons().chevron(TreeElementState.isExpanded-impl(elementState), TreeElementState.isSelected-impl(elementState), $composer, 0);
/* 57 */         IconKt.Icon-FHprtrg(iconKey, (String)null, (Modifier)null, (Class<?>)null, 0L, new org.jetbrains.jewel.ui.painter.PainterHint[0], $composer, 48, 28); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*    */        } LazyTreeKt$LazyTree$4(LazyTreeStyle $style) {} } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nLazyTree.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyTree.kt\norg/jetbrains/jewel/ui/component/LazyTreeKt$LazyTree$5\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,69:1\n708#2:70\n696#2:71\n77#3:72\n*S KotlinDebug\n*F\n+ 1 LazyTree.kt\norg/jetbrains/jewel/ui/component/LazyTreeKt$LazyTree$5\n*L\n64#1:70\n64#1:71\n64#1:72\n*E\n"}) static final class LazyTreeKt$LazyTree$5 implements Function4<SelectableLazyItemScope, Tree.Element<T>, Composer, Integer, Unit> { @Composable
/*    */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/* 60 */     public final void invoke(SelectableLazyItemScope $this$BasicLazyTree, Tree.Element<T> it, Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$BasicLazyTree, "$this$BasicLazyTree"); Intrinsics.checkNotNullParameter(it, "it"); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1240032589, $changed, -1, "org.jetbrains.jewel.ui.component.LazyTree.<anonymous> (LazyTree.kt:59)");  $composer.startReplaceGroup(-129362953);
/*    */       
/* 62 */       TreeElementState.Companion companion = TreeElementState.Companion; boolean bool1 = $this$BasicLazyTree.isActive(), bool2 = $this$BasicLazyTree.isSelected();
/* 63 */       long $this$takeOrElse_u2dDxMtmZc$iv = ((Color)LazyTreeStylingKt.contentFor-e9js8XA(this.$style.getColors(), TreeElementState.Companion.of-do3-xvo$default(companion, false, bool1, false, false, false, false, bool2, 57, null), $composer, 0).getValue()).unbox-impl();
/* 64 */       int $i$f$takeOrElse-DxMtmZc = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 70 */       long $this$isSpecified$iv$iv = $this$takeOrElse_u2dDxMtmZc$iv; int $i$f$isSpecified-8_81llA = 0;
/* 71 */       if (($this$isSpecified$iv$iv != 16L)) {  }
/* 72 */       else { int $i$a$-takeOrElse-DxMtmZc-LazyTreeKt$LazyTree$5$resolvedContentColor$1 = 0; CompositionLocal compositionLocal = (CompositionLocal)JewelThemeKt.getLocalContentColor(); int $changed$iv = 0, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); }  Object object2 = object;
/*    */       $composer.endReplaceGroup();
/*    */       Object object1 = object2;
/*    */       CompositionLocalKt.CompositionLocalProvider(JewelThemeKt.getLocalContentColor().provides(Color.box-impl(object1)), (Function2)ComposableLambdaKt.rememberComposableLambda(856578573, true, new Function2<Composer, Integer, Unit>(this.$nodeContent, $this$BasicLazyTree, it) {
/*    */               @Composable
/*    */               @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */               public final void invoke(Composer $composer, int $changed) {
/*    */                 if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*    */                   if (ComposerKt.isTraceInProgress())
/*    */                     ComposerKt.traceEventStart(856578573, $changed, -1, "org.jetbrains.jewel.ui.component.LazyTree.<anonymous>.<anonymous> (LazyTree.kt:65)"); 
/*    */                   this.$nodeContent.invoke(this.$this_BasicLazyTree, this.$it, $composer, Integer.valueOf(0));
/*    */                   if (ComposerKt.isTraceInProgress())
/*    */                     ComposerKt.traceEventEnd(); 
/*    */                 } else {
/*    */                   $composer.skipToGroupEnd();
/*    */                 } 
/*    */               }
/*    */             }$composer, 54), $composer, 0x30 | ProvidedValue.$stable);
/*    */       if (ComposerKt.isTraceInProgress())
/*    */         ComposerKt.traceEventEnd();  }
/*    */ 
/*    */     
/*    */     LazyTreeKt$LazyTree$5(LazyTreeStyle $style, Function4<SelectableLazyItemScope, Tree.Element<T>, Composer, Integer, Unit> $nodeContent) {} }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\LazyTreeKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */