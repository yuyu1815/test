/*     */ package org.jetbrains.jewel.foundation.lazy.tree;
/*     */ 
/*     */ import androidx.compose.foundation.layout.PaddingValues;
/*     */ import androidx.compose.foundation.shape.CornerSize;
/*     */ import androidx.compose.foundation.shape.RoundedCornerShape;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.State;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.functions.Function4;
/*     */ import kotlin.jvm.functions.Function5;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
/*     */ import kotlin.time.Duration;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.jewel.foundation.lazy.SelectableLazyItemScope;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */ @SourceDebugExtension({"SMAP\nBasicLazyTree.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicLazyTree.kt\norg/jetbrains/jewel/foundation/lazy/tree/BasicLazyTreeKt$BasicLazyTree$5$1$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,324:1\n1#2:325\n1225#3,6:326\n1225#3,6:333\n1225#3,6:375\n1225#3,6:381\n169#4:332\n99#5:339\n96#5,6:340\n102#5:374\n106#5:430\n79#6,6:346\n86#6,4:361\n90#6,2:371\n79#6,6:394\n86#6,4:409\n90#6,2:419\n94#6:425\n94#6:429\n368#7,9:352\n377#7:373\n368#7,9:400\n377#7:421\n378#7,2:423\n378#7,2:427\n4034#8,6:365\n4034#8,6:413\n71#9:387\n68#9,6:388\n74#9:422\n78#9:426\n81#10:431\n*S KotlinDebug\n*F\n+ 1 BasicLazyTree.kt\norg/jetbrains/jewel/foundation/lazy/tree/BasicLazyTreeKt$BasicLazyTree$5$1$3\n*L\n133#1:326,6\n161#1:333,6\n176#1:375,6\n178#1:381,6\n160#1:332\n147#1:339\n147#1:340,6\n147#1:374\n147#1:430\n147#1:346,6\n147#1:361,4\n147#1:371,2\n173#1:394,6\n173#1:409,4\n173#1:419,2\n173#1:425\n147#1:429\n147#1:352,9\n147#1:373\n173#1:400,9\n173#1:421\n173#1:423,2\n147#1:427,2\n147#1:365,6\n173#1:413,6\n173#1:387\n173#1:388,6\n173#1:422\n173#1:426\n133#1:431\n*E\n"})
/*     */ final class BasicLazyTreeKt$BasicLazyTree$5$1$3
/*     */   implements Function5<SelectableLazyItemScope, Integer, Tree.Element<?>, Composer, Integer, Unit>
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public final void invoke(SelectableLazyItemScope $this$itemsIndexed, int index, Tree.Element element, Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc '$this$itemsIndexed'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_3
/*     */     //   7: ldc 'element'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: iload #5
/*     */     //   14: istore #6
/*     */     //   16: iload #5
/*     */     //   18: bipush #6
/*     */     //   20: iand
/*     */     //   21: ifne -> 45
/*     */     //   24: iload #6
/*     */     //   26: aload #4
/*     */     //   28: aload_1
/*     */     //   29: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   34: ifeq -> 41
/*     */     //   37: iconst_4
/*     */     //   38: goto -> 42
/*     */     //   41: iconst_2
/*     */     //   42: ior
/*     */     //   43: istore #6
/*     */     //   45: iload #5
/*     */     //   47: bipush #48
/*     */     //   49: iand
/*     */     //   50: ifne -> 76
/*     */     //   53: iload #6
/*     */     //   55: aload #4
/*     */     //   57: iload_2
/*     */     //   58: invokeinterface changed : (I)Z
/*     */     //   63: ifeq -> 71
/*     */     //   66: bipush #32
/*     */     //   68: goto -> 73
/*     */     //   71: bipush #16
/*     */     //   73: ior
/*     */     //   74: istore #6
/*     */     //   76: iload #5
/*     */     //   78: sipush #384
/*     */     //   81: iand
/*     */     //   82: ifne -> 130
/*     */     //   85: iload #6
/*     */     //   87: iload #5
/*     */     //   89: sipush #512
/*     */     //   92: iand
/*     */     //   93: ifne -> 107
/*     */     //   96: aload #4
/*     */     //   98: aload_3
/*     */     //   99: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   104: goto -> 115
/*     */     //   107: aload #4
/*     */     //   109: aload_3
/*     */     //   110: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   115: ifeq -> 124
/*     */     //   118: sipush #256
/*     */     //   121: goto -> 127
/*     */     //   124: sipush #128
/*     */     //   127: ior
/*     */     //   128: istore #6
/*     */     //   130: iload #6
/*     */     //   132: sipush #1171
/*     */     //   135: iand
/*     */     //   136: sipush #1170
/*     */     //   139: if_icmpne -> 152
/*     */     //   142: aload #4
/*     */     //   144: invokeinterface getSkipping : ()Z
/*     */     //   149: ifne -> 2109
/*     */     //   152: invokestatic isTraceInProgress : ()Z
/*     */     //   155: ifeq -> 168
/*     */     //   158: ldc -1276486766
/*     */     //   160: iload #6
/*     */     //   162: iconst_m1
/*     */     //   163: ldc 'org.jetbrains.jewel.foundation.lazy.tree.BasicLazyTree.<anonymous>.<anonymous>.<anonymous> (BasicLazyTree.kt:125)'
/*     */     //   165: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   168: getstatic org/jetbrains/jewel/foundation/lazy/tree/TreeElementState.Companion : Lorg/jetbrains/jewel/foundation/lazy/tree/TreeElementState$Companion;
/*     */     //   171: astore #9
/*     */     //   173: aload_1
/*     */     //   174: invokeinterface isActive : ()Z
/*     */     //   179: istore #10
/*     */     //   181: aload_1
/*     */     //   182: invokeinterface isSelected : ()Z
/*     */     //   187: istore #11
/*     */     //   189: aload_3
/*     */     //   190: instanceof org/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node
/*     */     //   193: ifeq -> 203
/*     */     //   196: aload_3
/*     */     //   197: checkcast org/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node
/*     */     //   200: goto -> 204
/*     */     //   203: aconst_null
/*     */     //   204: dup
/*     */     //   205: ifnull -> 242
/*     */     //   208: astore #15
/*     */     //   210: aload_0
/*     */     //   211: getfield $treeState : Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;
/*     */     //   214: astore #16
/*     */     //   216: aload #15
/*     */     //   218: astore #17
/*     */     //   220: iconst_0
/*     */     //   221: istore #18
/*     */     //   223: aload #16
/*     */     //   225: invokevirtual getOpenNodes : ()Ljava/util/Set;
/*     */     //   228: aload #17
/*     */     //   230: invokevirtual getId : ()Ljava/lang/Object;
/*     */     //   233: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   238: nop
/*     */     //   239: goto -> 244
/*     */     //   242: pop
/*     */     //   243: iconst_0
/*     */     //   244: istore #12
/*     */     //   246: aload #9
/*     */     //   248: iconst_0
/*     */     //   249: iconst_0
/*     */     //   250: iload #12
/*     */     //   252: iconst_0
/*     */     //   253: iconst_0
/*     */     //   254: iload #10
/*     */     //   256: iload #11
/*     */     //   258: bipush #27
/*     */     //   260: aconst_null
/*     */     //   261: invokestatic of-do3-xvo$default : (Lorg/jetbrains/jewel/foundation/lazy/tree/TreeElementState$Companion;ZZZZZZZILjava/lang/Object;)J
/*     */     //   264: lstore #7
/*     */     //   266: aload #4
/*     */     //   268: ldc 1816165175
/*     */     //   270: invokeinterface startReplaceGroup : (I)V
/*     */     //   275: aload #4
/*     */     //   277: astore #11
/*     */     //   279: aload #4
/*     */     //   281: aload_0
/*     */     //   282: getfield $flattenedTree : Ljava/util/List;
/*     */     //   285: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   290: iload #6
/*     */     //   292: bipush #112
/*     */     //   294: iand
/*     */     //   295: bipush #32
/*     */     //   297: if_icmpne -> 304
/*     */     //   300: iconst_1
/*     */     //   301: goto -> 305
/*     */     //   304: iconst_0
/*     */     //   305: ior
/*     */     //   306: aload #4
/*     */     //   308: aload_0
/*     */     //   309: getfield $treeState : Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;
/*     */     //   312: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   317: ior
/*     */     //   318: aload #4
/*     */     //   320: aload_0
/*     */     //   321: getfield $elementBackgroundCornerSize : Landroidx/compose/foundation/shape/CornerSize;
/*     */     //   324: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   329: ior
/*     */     //   330: istore #12
/*     */     //   332: aload_0
/*     */     //   333: getfield $flattenedTree : Ljava/util/List;
/*     */     //   336: astore #13
/*     */     //   338: aload_0
/*     */     //   339: getfield $elementBackgroundCornerSize : Landroidx/compose/foundation/shape/CornerSize;
/*     */     //   342: astore #14
/*     */     //   344: aload_0
/*     */     //   345: getfield $treeState : Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;
/*     */     //   348: astore #15
/*     */     //   350: iconst_0
/*     */     //   351: istore #16
/*     */     //   353: aload #11
/*     */     //   355: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   360: astore #17
/*     */     //   362: iconst_0
/*     */     //   363: istore #18
/*     */     //   365: iload #12
/*     */     //   367: ifne -> 381
/*     */     //   370: aload #17
/*     */     //   372: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   375: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   378: if_acmpne -> 412
/*     */     //   381: iconst_0
/*     */     //   382: istore #19
/*     */     //   384: aload #13
/*     */     //   386: iload_2
/*     */     //   387: aload #14
/*     */     //   389: aload #15
/*     */     //   391: <illegal opcode> invoke : (Ljava/util/List;ILandroidx/compose/foundation/shape/CornerSize;Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;)Lkotlin/jvm/functions/Function0;
/*     */     //   396: astore #20
/*     */     //   398: aload #11
/*     */     //   400: aload #20
/*     */     //   402: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   407: aload #20
/*     */     //   409: goto -> 414
/*     */     //   412: aload #17
/*     */     //   414: nop
/*     */     //   415: nop
/*     */     //   416: nop
/*     */     //   417: checkcast kotlin/jvm/functions/Function0
/*     */     //   420: astore #10
/*     */     //   422: aload #4
/*     */     //   424: invokeinterface endReplaceGroup : ()V
/*     */     //   429: aload #10
/*     */     //   431: invokestatic derivedStateOf : (Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/State;
/*     */     //   434: astore #9
/*     */     //   436: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   439: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   442: astore #10
/*     */     //   444: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   447: checkcast androidx/compose/ui/Modifier
/*     */     //   450: fconst_0
/*     */     //   451: aload_0
/*     */     //   452: getfield $elementMinHeight : F
/*     */     //   455: iconst_1
/*     */     //   456: aconst_null
/*     */     //   457: invokestatic defaultMinSize-VpY3zN4$default : (Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   460: aload_0
/*     */     //   461: getfield $elementPadding : Landroidx/compose/foundation/layout/PaddingValues;
/*     */     //   464: invokestatic padding : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;
/*     */     //   467: lload #7
/*     */     //   469: aload_0
/*     */     //   470: getfield $elementBackgroundSelectedFocused : J
/*     */     //   473: aload_0
/*     */     //   474: getfield $elementBackgroundFocused : J
/*     */     //   477: aload_0
/*     */     //   478: getfield $elementBackgroundSelected : J
/*     */     //   481: aload #9
/*     */     //   483: invokestatic invoke$lambda$5 : (Landroidx/compose/runtime/State;)Landroidx/compose/foundation/shape/RoundedCornerShape;
/*     */     //   486: invokestatic access$elementBackground-61ZKQAw : (Landroidx/compose/ui/Modifier;JJJJLandroidx/compose/foundation/shape/RoundedCornerShape;)Landroidx/compose/ui/Modifier;
/*     */     //   489: aload_0
/*     */     //   490: getfield $elementContentPadding : Landroidx/compose/foundation/layout/PaddingValues;
/*     */     //   493: invokestatic padding : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;
/*     */     //   496: aload_3
/*     */     //   497: invokeinterface getDepth : ()I
/*     */     //   502: i2f
/*     */     //   503: aload_0
/*     */     //   504: getfield $indentSize : F
/*     */     //   507: fmul
/*     */     //   508: fstore #12
/*     */     //   510: iconst_0
/*     */     //   511: istore #13
/*     */     //   513: fload #12
/*     */     //   515: invokestatic constructor-impl : (F)F
/*     */     //   518: fconst_0
/*     */     //   519: fconst_0
/*     */     //   520: fconst_0
/*     */     //   521: bipush #14
/*     */     //   523: aconst_null
/*     */     //   524: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   527: aload #4
/*     */     //   529: ldc_w 1816216064
/*     */     //   532: invokeinterface startReplaceGroup : (I)V
/*     */     //   537: aload #4
/*     */     //   539: astore #13
/*     */     //   541: iconst_0
/*     */     //   542: istore #14
/*     */     //   544: nop
/*     */     //   545: iconst_0
/*     */     //   546: istore #15
/*     */     //   548: aload #13
/*     */     //   550: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   555: astore #16
/*     */     //   557: iconst_0
/*     */     //   558: istore #17
/*     */     //   560: aload #16
/*     */     //   562: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   565: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   568: if_acmpne -> 598
/*     */     //   571: astore #76
/*     */     //   573: iconst_0
/*     */     //   574: istore #18
/*     */     //   576: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   579: aload #76
/*     */     //   581: swap
/*     */     //   582: astore #18
/*     */     //   584: aload #13
/*     */     //   586: aload #18
/*     */     //   588: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   593: aload #18
/*     */     //   595: goto -> 600
/*     */     //   598: aload #16
/*     */     //   600: nop
/*     */     //   601: nop
/*     */     //   602: nop
/*     */     //   603: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   606: astore #12
/*     */     //   608: aload #4
/*     */     //   610: invokeinterface endReplaceGroup : ()V
/*     */     //   615: aload #12
/*     */     //   617: aconst_null
/*     */     //   618: iconst_0
/*     */     //   619: aconst_null
/*     */     //   620: aconst_null
/*     */     //   621: aload #4
/*     */     //   623: ldc_w 1816218567
/*     */     //   626: invokeinterface startReplaceGroup : (I)V
/*     */     //   631: aload #4
/*     */     //   633: astore #13
/*     */     //   635: aload #4
/*     */     //   637: aload_0
/*     */     //   638: getfield $pointerEventScopedActions : Lorg/jetbrains/jewel/foundation/lazy/tree/PointerEventActions;
/*     */     //   641: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   646: aload #4
/*     */     //   648: aload_0
/*     */     //   649: getfield $flattenedTree : Ljava/util/List;
/*     */     //   652: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   657: ior
/*     */     //   658: iload #6
/*     */     //   660: bipush #112
/*     */     //   662: iand
/*     */     //   663: bipush #32
/*     */     //   665: if_icmpne -> 672
/*     */     //   668: iconst_1
/*     */     //   669: goto -> 673
/*     */     //   672: iconst_0
/*     */     //   673: ior
/*     */     //   674: aload #4
/*     */     //   676: aload_0
/*     */     //   677: getfield $scope : Lkotlinx/coroutines/CoroutineScope;
/*     */     //   680: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   685: ior
/*     */     //   686: aload #4
/*     */     //   688: aload_0
/*     */     //   689: getfield $platformDoubleClickDelay : J
/*     */     //   692: invokeinterface changed : (J)Z
/*     */     //   697: ior
/*     */     //   698: aload #4
/*     */     //   700: aload_0
/*     */     //   701: getfield $onElementClick : Lkotlin/jvm/functions/Function1;
/*     */     //   704: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   709: ior
/*     */     //   710: aload #4
/*     */     //   712: aload_0
/*     */     //   713: getfield $onElementDoubleClick : Lkotlin/jvm/functions/Function1;
/*     */     //   716: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   721: ior
/*     */     //   722: aload #4
/*     */     //   724: aload_0
/*     */     //   725: getfield $treeState : Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;
/*     */     //   728: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   733: ior
/*     */     //   734: istore #14
/*     */     //   736: aload_0
/*     */     //   737: getfield $pointerEventScopedActions : Lorg/jetbrains/jewel/foundation/lazy/tree/PointerEventActions;
/*     */     //   740: astore #15
/*     */     //   742: aload_0
/*     */     //   743: getfield $flattenedTree : Ljava/util/List;
/*     */     //   746: astore #16
/*     */     //   748: aload_0
/*     */     //   749: getfield $scope : Lkotlinx/coroutines/CoroutineScope;
/*     */     //   752: astore #17
/*     */     //   754: aload_0
/*     */     //   755: getfield $platformDoubleClickDelay : J
/*     */     //   758: lstore #18
/*     */     //   760: aload_0
/*     */     //   761: getfield $onElementClick : Lkotlin/jvm/functions/Function1;
/*     */     //   764: astore #20
/*     */     //   766: aload_0
/*     */     //   767: getfield $onElementDoubleClick : Lkotlin/jvm/functions/Function1;
/*     */     //   770: astore #21
/*     */     //   772: aload_0
/*     */     //   773: getfield $treeState : Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;
/*     */     //   776: astore #22
/*     */     //   778: iconst_0
/*     */     //   779: istore #23
/*     */     //   781: aload #13
/*     */     //   783: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   788: astore #24
/*     */     //   790: iconst_0
/*     */     //   791: istore #25
/*     */     //   793: iload #14
/*     */     //   795: ifne -> 809
/*     */     //   798: aload #24
/*     */     //   800: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   803: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   806: if_acmpne -> 876
/*     */     //   809: astore #81
/*     */     //   811: astore #80
/*     */     //   813: istore #79
/*     */     //   815: astore #78
/*     */     //   817: astore #77
/*     */     //   819: astore #76
/*     */     //   821: iconst_0
/*     */     //   822: istore #26
/*     */     //   824: aload #15
/*     */     //   826: aload #16
/*     */     //   828: iload_2
/*     */     //   829: aload #17
/*     */     //   831: lload #18
/*     */     //   833: aload #20
/*     */     //   835: aload #21
/*     */     //   837: aload #22
/*     */     //   839: <illegal opcode> invoke : (Lorg/jetbrains/jewel/foundation/lazy/tree/PointerEventActions;Ljava/util/List;ILkotlinx/coroutines/CoroutineScope;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;)Lkotlin/jvm/functions/Function0;
/*     */     //   844: astore #82
/*     */     //   846: aload #76
/*     */     //   848: aload #77
/*     */     //   850: aload #78
/*     */     //   852: iload #79
/*     */     //   854: aload #80
/*     */     //   856: aload #81
/*     */     //   858: aload #82
/*     */     //   860: astore #27
/*     */     //   862: aload #13
/*     */     //   864: aload #27
/*     */     //   866: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   871: aload #27
/*     */     //   873: goto -> 878
/*     */     //   876: aload #24
/*     */     //   878: nop
/*     */     //   879: nop
/*     */     //   880: nop
/*     */     //   881: checkcast kotlin/jvm/functions/Function0
/*     */     //   884: astore #12
/*     */     //   886: aload #4
/*     */     //   888: invokeinterface endReplaceGroup : ()V
/*     */     //   893: aload #12
/*     */     //   895: bipush #28
/*     */     //   897: aconst_null
/*     */     //   898: invokestatic clickable-O2vRcR0$default : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   901: astore #11
/*     */     //   903: aload_0
/*     */     //   904: getfield $treeState : Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;
/*     */     //   907: astore #13
/*     */     //   909: aload_0
/*     */     //   910: getfield $onElementDoubleClick : Lkotlin/jvm/functions/Function1;
/*     */     //   913: astore #14
/*     */     //   915: aload_0
/*     */     //   916: getfield $chevronContentGap : F
/*     */     //   919: fstore #15
/*     */     //   921: aload_0
/*     */     //   922: getfield $nodeContent : Lkotlin/jvm/functions/Function4;
/*     */     //   925: astore #16
/*     */     //   927: aload_0
/*     */     //   928: getfield $chevronContent : Lkotlin/jvm/functions/Function3;
/*     */     //   931: astore #17
/*     */     //   933: sipush #384
/*     */     //   936: istore #18
/*     */     //   938: iconst_0
/*     */     //   939: istore #19
/*     */     //   941: aload #4
/*     */     //   943: ldc_w 693286680
/*     */     //   946: ldc_w 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*     */     //   949: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   952: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   955: invokevirtual getStart : ()Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */     //   958: astore #12
/*     */     //   960: aload #12
/*     */     //   962: aload #10
/*     */     //   964: aload #4
/*     */     //   966: bipush #14
/*     */     //   968: iload #18
/*     */     //   970: iconst_3
/*     */     //   971: ishr
/*     */     //   972: iand
/*     */     //   973: bipush #112
/*     */     //   975: iload #18
/*     */     //   977: iconst_3
/*     */     //   978: ishr
/*     */     //   979: iand
/*     */     //   980: ior
/*     */     //   981: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   984: astore #20
/*     */     //   986: bipush #112
/*     */     //   988: iload #18
/*     */     //   990: iconst_3
/*     */     //   991: ishl
/*     */     //   992: iand
/*     */     //   993: istore #21
/*     */     //   995: nop
/*     */     //   996: iconst_0
/*     */     //   997: istore #22
/*     */     //   999: aload #4
/*     */     //   1001: ldc_w -1323940314
/*     */     //   1004: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   1007: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1010: aload #4
/*     */     //   1012: iconst_0
/*     */     //   1013: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   1016: istore #23
/*     */     //   1018: aload #4
/*     */     //   1020: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1025: astore #24
/*     */     //   1027: aload #4
/*     */     //   1029: aload #11
/*     */     //   1031: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1034: astore #25
/*     */     //   1036: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1039: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1042: astore #26
/*     */     //   1044: bipush #6
/*     */     //   1046: sipush #896
/*     */     //   1049: iload #21
/*     */     //   1051: bipush #6
/*     */     //   1053: ishl
/*     */     //   1054: iand
/*     */     //   1055: ior
/*     */     //   1056: istore #27
/*     */     //   1058: nop
/*     */     //   1059: iconst_0
/*     */     //   1060: istore #28
/*     */     //   1062: aload #4
/*     */     //   1064: ldc_w -692256719
/*     */     //   1067: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   1070: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1073: aload #4
/*     */     //   1075: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   1080: instanceof androidx/compose/runtime/Applier
/*     */     //   1083: ifne -> 1089
/*     */     //   1086: invokestatic invalidApplier : ()V
/*     */     //   1089: aload #4
/*     */     //   1091: invokeinterface startReusableNode : ()V
/*     */     //   1096: aload #4
/*     */     //   1098: invokeinterface getInserting : ()Z
/*     */     //   1103: ifeq -> 1118
/*     */     //   1106: aload #4
/*     */     //   1108: aload #26
/*     */     //   1110: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   1115: goto -> 1125
/*     */     //   1118: aload #4
/*     */     //   1120: invokeinterface useNode : ()V
/*     */     //   1125: aload #4
/*     */     //   1127: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   1130: astore #29
/*     */     //   1132: iconst_0
/*     */     //   1133: istore #30
/*     */     //   1135: aload #29
/*     */     //   1137: aload #20
/*     */     //   1139: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1142: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1145: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1148: aload #29
/*     */     //   1150: aload #24
/*     */     //   1152: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1155: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1158: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1161: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1164: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1167: astore #31
/*     */     //   1169: iconst_0
/*     */     //   1170: istore #32
/*     */     //   1172: aload #29
/*     */     //   1174: astore #33
/*     */     //   1176: iconst_0
/*     */     //   1177: istore #34
/*     */     //   1179: aload #33
/*     */     //   1181: invokeinterface getInserting : ()Z
/*     */     //   1186: ifne -> 1207
/*     */     //   1189: aload #33
/*     */     //   1191: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1196: iload #23
/*     */     //   1198: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1201: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1204: ifne -> 1233
/*     */     //   1207: aload #33
/*     */     //   1209: iload #23
/*     */     //   1211: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1214: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1219: aload #29
/*     */     //   1221: iload #23
/*     */     //   1223: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1226: aload #31
/*     */     //   1228: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1233: nop
/*     */     //   1234: nop
/*     */     //   1235: nop
/*     */     //   1236: aload #29
/*     */     //   1238: aload #25
/*     */     //   1240: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1243: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1246: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1249: nop
/*     */     //   1250: nop
/*     */     //   1251: aload #4
/*     */     //   1253: bipush #14
/*     */     //   1255: iload #27
/*     */     //   1257: bipush #6
/*     */     //   1259: ishr
/*     */     //   1260: iand
/*     */     //   1261: istore #35
/*     */     //   1263: astore #36
/*     */     //   1265: iconst_0
/*     */     //   1266: istore #37
/*     */     //   1268: aload #36
/*     */     //   1270: ldc_w -407840262
/*     */     //   1273: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*     */     //   1276: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1279: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*     */     //   1282: aload #36
/*     */     //   1284: bipush #6
/*     */     //   1286: bipush #112
/*     */     //   1288: iload #18
/*     */     //   1290: bipush #6
/*     */     //   1292: ishr
/*     */     //   1293: iand
/*     */     //   1294: ior
/*     */     //   1295: istore #38
/*     */     //   1297: astore #39
/*     */     //   1299: checkcast androidx/compose/foundation/layout/RowScope
/*     */     //   1302: astore #40
/*     */     //   1304: iconst_0
/*     */     //   1305: istore #41
/*     */     //   1307: aload #39
/*     */     //   1309: ldc_w -1690594694
/*     */     //   1312: invokeinterface startReplaceGroup : (I)V
/*     */     //   1317: aload_3
/*     */     //   1318: instanceof org/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node
/*     */     //   1321: ifeq -> 2039
/*     */     //   1324: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1327: checkcast androidx/compose/ui/Modifier
/*     */     //   1330: aload #39
/*     */     //   1332: ldc_w -1690589057
/*     */     //   1335: invokeinterface startReplaceGroup : (I)V
/*     */     //   1340: aload #39
/*     */     //   1342: astore #42
/*     */     //   1344: iconst_0
/*     */     //   1345: istore #43
/*     */     //   1347: nop
/*     */     //   1348: iconst_0
/*     */     //   1349: istore #44
/*     */     //   1351: aload #42
/*     */     //   1353: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1358: astore #45
/*     */     //   1360: iconst_0
/*     */     //   1361: istore #46
/*     */     //   1363: aload #45
/*     */     //   1365: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1368: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1371: if_acmpne -> 1401
/*     */     //   1374: astore #47
/*     */     //   1376: iconst_0
/*     */     //   1377: istore #48
/*     */     //   1379: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   1382: aload #47
/*     */     //   1384: swap
/*     */     //   1385: astore #48
/*     */     //   1387: aload #42
/*     */     //   1389: aload #48
/*     */     //   1391: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1396: aload #48
/*     */     //   1398: goto -> 1403
/*     */     //   1401: aload #45
/*     */     //   1403: nop
/*     */     //   1404: nop
/*     */     //   1405: nop
/*     */     //   1406: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   1409: astore #49
/*     */     //   1411: aload #39
/*     */     //   1413: invokeinterface endReplaceGroup : ()V
/*     */     //   1418: aload #49
/*     */     //   1420: aconst_null
/*     */     //   1421: iconst_0
/*     */     //   1422: aconst_null
/*     */     //   1423: aconst_null
/*     */     //   1424: aload #39
/*     */     //   1426: ldc_w -1690585015
/*     */     //   1429: invokeinterface startReplaceGroup : (I)V
/*     */     //   1434: aload #39
/*     */     //   1436: astore #42
/*     */     //   1438: aload #4
/*     */     //   1440: aload #13
/*     */     //   1442: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   1447: iload #6
/*     */     //   1449: sipush #896
/*     */     //   1452: iand
/*     */     //   1453: sipush #256
/*     */     //   1456: if_icmpeq -> 1479
/*     */     //   1459: iload #6
/*     */     //   1461: sipush #512
/*     */     //   1464: iand
/*     */     //   1465: ifeq -> 1483
/*     */     //   1468: aload #4
/*     */     //   1470: aload_3
/*     */     //   1471: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   1476: ifeq -> 1483
/*     */     //   1479: iconst_1
/*     */     //   1480: goto -> 1484
/*     */     //   1483: iconst_0
/*     */     //   1484: ior
/*     */     //   1485: aload #4
/*     */     //   1487: aload #14
/*     */     //   1489: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   1494: ior
/*     */     //   1495: istore #43
/*     */     //   1497: nop
/*     */     //   1498: iconst_0
/*     */     //   1499: istore #44
/*     */     //   1501: aload #42
/*     */     //   1503: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1508: astore #45
/*     */     //   1510: iconst_0
/*     */     //   1511: istore #46
/*     */     //   1513: iload #43
/*     */     //   1515: ifne -> 1529
/*     */     //   1518: aload #45
/*     */     //   1520: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1523: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1526: if_acmpne -> 1586
/*     */     //   1529: astore #50
/*     */     //   1531: astore #51
/*     */     //   1533: istore #52
/*     */     //   1535: astore #53
/*     */     //   1537: astore #54
/*     */     //   1539: astore #47
/*     */     //   1541: iconst_0
/*     */     //   1542: istore #48
/*     */     //   1544: aload #13
/*     */     //   1546: aload_3
/*     */     //   1547: aload #14
/*     */     //   1549: <illegal opcode> invoke : (Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
/*     */     //   1554: astore #55
/*     */     //   1556: aload #47
/*     */     //   1558: aload #54
/*     */     //   1560: aload #53
/*     */     //   1562: iload #52
/*     */     //   1564: aload #51
/*     */     //   1566: aload #50
/*     */     //   1568: aload #55
/*     */     //   1570: astore #56
/*     */     //   1572: aload #42
/*     */     //   1574: aload #56
/*     */     //   1576: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1581: aload #56
/*     */     //   1583: goto -> 1588
/*     */     //   1586: aload #45
/*     */     //   1588: nop
/*     */     //   1589: nop
/*     */     //   1590: nop
/*     */     //   1591: checkcast kotlin/jvm/functions/Function0
/*     */     //   1594: astore #49
/*     */     //   1596: aload #39
/*     */     //   1598: invokeinterface endReplaceGroup : ()V
/*     */     //   1603: aload #49
/*     */     //   1605: bipush #28
/*     */     //   1607: aconst_null
/*     */     //   1608: invokestatic clickable-O2vRcR0$default : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   1611: astore #49
/*     */     //   1613: iconst_0
/*     */     //   1614: istore #44
/*     */     //   1616: nop
/*     */     //   1617: iconst_0
/*     */     //   1618: istore #45
/*     */     //   1620: aload #39
/*     */     //   1622: ldc_w 733328855
/*     */     //   1625: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   1628: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1631: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1634: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */     //   1637: astore #42
/*     */     //   1639: iconst_0
/*     */     //   1640: istore #43
/*     */     //   1642: aload #42
/*     */     //   1644: iload #43
/*     */     //   1646: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1649: astore #46
/*     */     //   1651: bipush #112
/*     */     //   1653: iload #44
/*     */     //   1655: iconst_3
/*     */     //   1656: ishl
/*     */     //   1657: iand
/*     */     //   1658: istore #48
/*     */     //   1660: nop
/*     */     //   1661: iconst_0
/*     */     //   1662: istore #56
/*     */     //   1664: aload #39
/*     */     //   1666: ldc_w -1323940314
/*     */     //   1669: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   1672: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1675: aload #39
/*     */     //   1677: iconst_0
/*     */     //   1678: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   1681: istore #57
/*     */     //   1683: aload #39
/*     */     //   1685: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1690: astore #58
/*     */     //   1692: aload #39
/*     */     //   1694: aload #49
/*     */     //   1696: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1699: astore #59
/*     */     //   1701: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1704: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1707: astore #60
/*     */     //   1709: bipush #6
/*     */     //   1711: sipush #896
/*     */     //   1714: iload #48
/*     */     //   1716: bipush #6
/*     */     //   1718: ishl
/*     */     //   1719: iand
/*     */     //   1720: ior
/*     */     //   1721: istore #61
/*     */     //   1723: nop
/*     */     //   1724: iconst_0
/*     */     //   1725: istore #62
/*     */     //   1727: aload #39
/*     */     //   1729: ldc_w -692256719
/*     */     //   1732: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   1735: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1738: aload #39
/*     */     //   1740: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   1745: instanceof androidx/compose/runtime/Applier
/*     */     //   1748: ifne -> 1754
/*     */     //   1751: invokestatic invalidApplier : ()V
/*     */     //   1754: aload #39
/*     */     //   1756: invokeinterface startReusableNode : ()V
/*     */     //   1761: aload #39
/*     */     //   1763: invokeinterface getInserting : ()Z
/*     */     //   1768: ifeq -> 1783
/*     */     //   1771: aload #39
/*     */     //   1773: aload #60
/*     */     //   1775: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   1780: goto -> 1790
/*     */     //   1783: aload #39
/*     */     //   1785: invokeinterface useNode : ()V
/*     */     //   1790: aload #39
/*     */     //   1792: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   1795: astore #63
/*     */     //   1797: iconst_0
/*     */     //   1798: istore #64
/*     */     //   1800: aload #63
/*     */     //   1802: aload #46
/*     */     //   1804: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1807: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1810: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1813: aload #63
/*     */     //   1815: aload #58
/*     */     //   1817: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1820: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1823: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1826: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1829: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1832: astore #65
/*     */     //   1834: iconst_0
/*     */     //   1835: istore #66
/*     */     //   1837: aload #63
/*     */     //   1839: astore #67
/*     */     //   1841: iconst_0
/*     */     //   1842: istore #68
/*     */     //   1844: aload #67
/*     */     //   1846: invokeinterface getInserting : ()Z
/*     */     //   1851: ifne -> 1872
/*     */     //   1854: aload #67
/*     */     //   1856: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1861: iload #57
/*     */     //   1863: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1866: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1869: ifne -> 1898
/*     */     //   1872: aload #67
/*     */     //   1874: iload #57
/*     */     //   1876: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1879: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1884: aload #63
/*     */     //   1886: iload #57
/*     */     //   1888: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1891: aload #65
/*     */     //   1893: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1898: nop
/*     */     //   1899: nop
/*     */     //   1900: nop
/*     */     //   1901: aload #63
/*     */     //   1903: aload #59
/*     */     //   1905: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1908: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1911: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1914: nop
/*     */     //   1915: nop
/*     */     //   1916: aload #39
/*     */     //   1918: bipush #14
/*     */     //   1920: iload #61
/*     */     //   1922: bipush #6
/*     */     //   1924: ishr
/*     */     //   1925: iand
/*     */     //   1926: istore #69
/*     */     //   1928: astore #70
/*     */     //   1930: iconst_0
/*     */     //   1931: istore #71
/*     */     //   1933: aload #70
/*     */     //   1935: ldc_w -2146769399
/*     */     //   1938: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   1941: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1944: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   1947: aload #70
/*     */     //   1949: bipush #6
/*     */     //   1951: bipush #112
/*     */     //   1953: iload #44
/*     */     //   1955: bipush #6
/*     */     //   1957: ishr
/*     */     //   1958: iand
/*     */     //   1959: ior
/*     */     //   1960: istore #72
/*     */     //   1962: astore #73
/*     */     //   1964: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   1967: astore #74
/*     */     //   1969: iconst_0
/*     */     //   1970: istore #75
/*     */     //   1972: aload #17
/*     */     //   1974: lload #7
/*     */     //   1976: invokestatic box-impl : (J)Lorg/jetbrains/jewel/foundation/lazy/tree/TreeElementState;
/*     */     //   1979: aload #73
/*     */     //   1981: iconst_0
/*     */     //   1982: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1985: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   1990: pop
/*     */     //   1991: nop
/*     */     //   1992: aload #70
/*     */     //   1994: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1997: aload #39
/*     */     //   1999: invokeinterface endNode : ()V
/*     */     //   2004: aload #39
/*     */     //   2006: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2009: nop
/*     */     //   2010: aload #39
/*     */     //   2012: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2015: nop
/*     */     //   2016: aload #39
/*     */     //   2018: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2021: nop
/*     */     //   2022: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   2025: checkcast androidx/compose/ui/Modifier
/*     */     //   2028: fload #15
/*     */     //   2030: invokestatic width-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   2033: aload #39
/*     */     //   2035: iconst_0
/*     */     //   2036: invokestatic Spacer : (Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
/*     */     //   2039: aload #39
/*     */     //   2041: invokeinterface endReplaceGroup : ()V
/*     */     //   2046: aload #16
/*     */     //   2048: aload_1
/*     */     //   2049: aload_3
/*     */     //   2050: aload #39
/*     */     //   2052: bipush #14
/*     */     //   2054: iload #6
/*     */     //   2056: iand
/*     */     //   2057: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2060: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   2065: pop
/*     */     //   2066: nop
/*     */     //   2067: aload #36
/*     */     //   2069: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2072: aload #4
/*     */     //   2074: invokeinterface endNode : ()V
/*     */     //   2079: aload #4
/*     */     //   2081: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2084: nop
/*     */     //   2085: aload #4
/*     */     //   2087: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2090: nop
/*     */     //   2091: aload #4
/*     */     //   2093: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2096: nop
/*     */     //   2097: invokestatic isTraceInProgress : ()Z
/*     */     //   2100: ifeq -> 2116
/*     */     //   2103: invokestatic traceEventEnd : ()V
/*     */     //   2106: goto -> 2116
/*     */     //   2109: aload #4
/*     */     //   2111: invokeinterface skipToGroupEnd : ()V
/*     */     //   2116: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #126	-> 130
/*     */     //   #127	-> 168
/*     */     //   #128	-> 173
/*     */     //   #129	-> 181
/*     */     //   #130	-> 189
/*     */     //   #325	-> 220
/*     */     //   #130	-> 223
/*     */     //   #130	-> 238
/*     */     //   #130	-> 239
/*     */     //   #127	-> 246
/*     */     //   #130	-> 250
/*     */     //   #127	-> 252
/*     */     //   #128	-> 254
/*     */     //   #129	-> 256
/*     */     //   #127	-> 258
/*     */     //   #126	-> 264
/*     */     //   #133	-> 332
/*     */     //   #326	-> 353
/*     */     //   #327	-> 365
/*     */     //   #328	-> 381
/*     */     //   #133	-> 384
/*     */     //   #328	-> 396
/*     */     //   #329	-> 398
/*     */     //   #330	-> 407
/*     */     //   #331	-> 412
/*     */     //   #327	-> 414
/*     */     //   #326	-> 415
/*     */     //   #326	-> 416
/*     */     //   #133	-> 417
/*     */     //   #148	-> 436
/*     */     //   #150	-> 444
/*     */     //   #151	-> 460
/*     */     //   #153	-> 467
/*     */     //   #154	-> 469
/*     */     //   #155	-> 473
/*     */     //   #156	-> 477
/*     */     //   #157	-> 481
/*     */     //   #152	-> 486
/*     */     //   #159	-> 489
/*     */     //   #160	-> 496
/*     */     //   #332	-> 513
/*     */     //   #160	-> 518
/*     */     //   #161	-> 544
/*     */     //   #333	-> 548
/*     */     //   #334	-> 560
/*     */     //   #335	-> 571
/*     */     //   #161	-> 576
/*     */     //   #335	-> 582
/*     */     //   #336	-> 584
/*     */     //   #337	-> 593
/*     */     //   #338	-> 598
/*     */     //   #334	-> 600
/*     */     //   #333	-> 601
/*     */     //   #333	-> 602
/*     */     //   #161	-> 603
/*     */     //   #333	-> 781
/*     */     //   #334	-> 793
/*     */     //   #335	-> 809
/*     */     //   #161	-> 824
/*     */     //   #335	-> 860
/*     */     //   #336	-> 862
/*     */     //   #337	-> 871
/*     */     //   #338	-> 876
/*     */     //   #334	-> 878
/*     */     //   #333	-> 879
/*     */     //   #333	-> 880
/*     */     //   #161	-> 881
/*     */     //   #147	-> 903
/*     */     //   #339	-> 949
/*     */     //   #340	-> 952
/*     */     //   #344	-> 960
/*     */     //   #345	-> 995
/*     */     //   #346	-> 1007
/*     */     //   #347	-> 1013
/*     */     //   #348	-> 1020
/*     */     //   #349	-> 1029
/*     */     //   #351	-> 1036
/*     */     //   #350	-> 1058
/*     */     //   #352	-> 1070
/*     */     //   #353	-> 1073
/*     */     //   #354	-> 1091
/*     */     //   #355	-> 1096
/*     */     //   #356	-> 1108
/*     */     //   #358	-> 1120
/*     */     //   #360	-> 1125
/*     */     //   #361	-> 1135
/*     */     //   #362	-> 1148
/*     */     //   #364	-> 1161
/*     */     //   #365	-> 1172
/*     */     //   #366	-> 1179
/*     */     //   #367	-> 1207
/*     */     //   #368	-> 1219
/*     */     //   #370	-> 1233
/*     */     //   #365	-> 1234
/*     */     //   #370	-> 1235
/*     */     //   #371	-> 1236
/*     */     //   #372	-> 1249
/*     */     //   #360	-> 1250
/*     */     //   #373	-> 1251
/*     */     //   #374	-> 1276
/*     */     //   #172	-> 1317
/*     */     //   #175	-> 1324
/*     */     //   #176	-> 1347
/*     */     //   #375	-> 1351
/*     */     //   #376	-> 1363
/*     */     //   #377	-> 1374
/*     */     //   #176	-> 1379
/*     */     //   #377	-> 1385
/*     */     //   #378	-> 1387
/*     */     //   #379	-> 1396
/*     */     //   #380	-> 1401
/*     */     //   #376	-> 1403
/*     */     //   #375	-> 1404
/*     */     //   #375	-> 1405
/*     */     //   #176	-> 1406
/*     */     //   #177	-> 1420
/*     */     //   #175	-> 1421
/*     */     //   #178	-> 1497
/*     */     //   #381	-> 1501
/*     */     //   #382	-> 1513
/*     */     //   #383	-> 1529
/*     */     //   #178	-> 1544
/*     */     //   #383	-> 1570
/*     */     //   #384	-> 1572
/*     */     //   #385	-> 1581
/*     */     //   #386	-> 1586
/*     */     //   #382	-> 1588
/*     */     //   #381	-> 1589
/*     */     //   #381	-> 1590
/*     */     //   #178	-> 1591
/*     */     //   #175	-> 1605
/*     */     //   #173	-> 1616
/*     */     //   #387	-> 1628
/*     */     //   #388	-> 1631
/*     */     //   #389	-> 1639
/*     */     //   #392	-> 1642
/*     */     //   #393	-> 1660
/*     */     //   #394	-> 1672
/*     */     //   #395	-> 1678
/*     */     //   #396	-> 1685
/*     */     //   #397	-> 1694
/*     */     //   #399	-> 1701
/*     */     //   #398	-> 1723
/*     */     //   #400	-> 1735
/*     */     //   #401	-> 1738
/*     */     //   #402	-> 1756
/*     */     //   #403	-> 1761
/*     */     //   #404	-> 1773
/*     */     //   #406	-> 1785
/*     */     //   #408	-> 1790
/*     */     //   #409	-> 1800
/*     */     //   #410	-> 1813
/*     */     //   #412	-> 1826
/*     */     //   #413	-> 1837
/*     */     //   #414	-> 1844
/*     */     //   #415	-> 1872
/*     */     //   #416	-> 1884
/*     */     //   #418	-> 1898
/*     */     //   #413	-> 1899
/*     */     //   #418	-> 1900
/*     */     //   #419	-> 1901
/*     */     //   #420	-> 1914
/*     */     //   #408	-> 1915
/*     */     //   #421	-> 1916
/*     */     //   #422	-> 1941
/*     */     //   #183	-> 1972
/*     */     //   #184	-> 1991
/*     */     //   #422	-> 1992
/*     */     //   #421	-> 1997
/*     */     //   #423	-> 1999
/*     */     //   #400	-> 2006
/*     */     //   #424	-> 2009
/*     */     //   #394	-> 2012
/*     */     //   #425	-> 2015
/*     */     //   #387	-> 2018
/*     */     //   #426	-> 2021
/*     */     //   #185	-> 2022
/*     */     //   #187	-> 2046
/*     */     //   #188	-> 2066
/*     */     //   #374	-> 2067
/*     */     //   #373	-> 2072
/*     */     //   #427	-> 2074
/*     */     //   #352	-> 2081
/*     */     //   #428	-> 2084
/*     */     //   #346	-> 2087
/*     */     //   #429	-> 2090
/*     */     //   #339	-> 2093
/*     */     //   #430	-> 2096
/*     */     //   #188	-> 2109
/*     */     //   #189	-> 2116
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   223	15	18	$i$a$-let-BasicLazyTreeKt$BasicLazyTree$5$1$3$elementState$1	I
/*     */     //   220	18	17	it	Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node;
/*     */     //   384	12	19	$i$a$-cache-BasicLazyTreeKt$BasicLazyTree$5$1$3$backgroundShape$2	I
/*     */     //   398	11	20	value$iv	Ljava/lang/Object;
/*     */     //   365	50	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   362	53	17	it$iv	Ljava/lang/Object;
/*     */     //   353	64	16	$i$f$cache	I
/*     */     //   350	67	11	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   350	67	12	invalid$iv	Z
/*     */     //   513	5	13	$i$f$getDp	I
/*     */     //   510	8	12	$this$dp$iv	F
/*     */     //   576	3	18	$i$a$-cache-BasicLazyTreeKt$BasicLazyTree$5$1$3$1	I
/*     */     //   584	11	18	value$iv	Ljava/lang/Object;
/*     */     //   560	41	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   557	44	16	it$iv	Ljava/lang/Object;
/*     */     //   548	55	15	$i$f$cache	I
/*     */     //   545	58	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   545	58	14	invalid$iv	Z
/*     */     //   824	20	26	$i$a$-cache-BasicLazyTreeKt$BasicLazyTree$5$1$3$2	I
/*     */     //   862	11	27	value$iv	Ljava/lang/Object;
/*     */     //   793	86	25	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   790	89	24	it$iv	Ljava/lang/Object;
/*     */     //   781	100	23	$i$f$cache	I
/*     */     //   778	103	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   778	103	14	invalid$iv	Z
/*     */     //   1379	3	48	$i$a$-cache-BasicLazyTreeKt$BasicLazyTree$5$1$3$3$1	I
/*     */     //   1387	11	48	value$iv	Ljava/lang/Object;
/*     */     //   1363	41	46	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1360	44	45	it$iv	Ljava/lang/Object;
/*     */     //   1351	55	44	$i$f$cache	I
/*     */     //   1348	58	42	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1348	58	43	invalid$iv	Z
/*     */     //   1544	10	48	$i$a$-cache-BasicLazyTreeKt$BasicLazyTree$5$1$3$3$2	I
/*     */     //   1572	11	56	value$iv	Ljava/lang/Object;
/*     */     //   1513	76	46	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1510	79	45	it$iv	Ljava/lang/Object;
/*     */     //   1501	90	44	$i$f$cache	I
/*     */     //   1498	93	42	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1498	93	43	invalid$iv	Z
/*     */     //   1972	20	75	$i$a$-Box-BasicLazyTreeKt$BasicLazyTree$5$1$3$3$3	I
/*     */     //   1969	23	74	$this$invoke_u24lambda_u2413_u24lambda_u2412	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   1969	23	73	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1969	23	72	$changed	I
/*     */     //   1933	64	71	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   1930	67	70	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1930	67	69	$changed$iv	I
/*     */     //   1844	55	68	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   1841	58	67	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1837	64	66	$i$f$set-impl	I
/*     */     //   1834	67	65	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   1800	115	64	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   1797	118	63	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1727	283	62	$i$f$ReusableComposeNode	I
/*     */     //   1724	286	60	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   1724	286	61	$changed$iv$iv$iv	I
/*     */     //   1664	352	56	$i$f$Layout	I
/*     */     //   1683	333	57	compositeKeyHash$iv$iv	I
/*     */     //   1692	324	58	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1701	315	59	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1661	355	48	$changed$iv$iv	I
/*     */     //   1620	402	45	$i$f$Box	I
/*     */     //   1651	371	46	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1617	405	49	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1639	383	42	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   1642	380	43	propagateMinConstraints$iv	Z
/*     */     //   1617	405	44	$changed$iv	I
/*     */     //   1307	760	41	$i$a$-Row-BasicLazyTreeKt$BasicLazyTree$5$1$3$3	I
/*     */     //   1304	763	40	$this$invoke_u24lambda_u2413	Landroidx/compose/foundation/layout/RowScope;
/*     */     //   1304	763	39	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1304	763	38	$changed	I
/*     */     //   1268	804	37	$i$a$-Layout-RowKt$Row$1$iv	I
/*     */     //   1265	807	36	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1265	807	35	$changed$iv	I
/*     */     //   1179	55	34	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   1176	58	33	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1172	64	32	$i$f$set-impl	I
/*     */     //   1169	67	31	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   1135	115	30	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   1132	118	29	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1062	1023	28	$i$f$ReusableComposeNode	I
/*     */     //   1059	1026	26	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   1059	1026	27	$changed$iv$iv$iv	I
/*     */     //   999	1092	22	$i$f$Layout	I
/*     */     //   1018	1073	23	compositeKeyHash$iv$iv	I
/*     */     //   1027	1064	24	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1036	1055	25	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   996	1095	21	$changed$iv$iv	I
/*     */     //   941	1156	19	$i$f$Row	I
/*     */     //   986	1111	20	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   960	1137	12	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */     //   938	1159	18	$changed$iv	I
/*     */     //   266	1840	7	elementState	J
/*     */     //   436	1670	9	backgroundShape$delegate	Landroidx/compose/runtime/State;
/*     */     //   16	2101	6	$dirty	I
/*     */     //   0	2117	0	this	Lorg/jetbrains/jewel/foundation/lazy/tree/BasicLazyTreeKt$BasicLazyTree$5$1$3;
/*     */     //   0	2117	1	$this$itemsIndexed	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyItemScope;
/*     */     //   0	2117	2	index	I
/*     */     //   0	2117	3	element	Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;
/*     */     //   0	2117	4	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	2117	5	$changed	I
/*     */   }
/*     */   
/*     */   private static final RoundedCornerShape invoke$lambda$5(State $backgroundShape$delegate) {
/* 133 */     State state = $backgroundShape$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 431 */       (RoundedCornerShape)state.getValue();
/*     */   }
/*     */   
/*     */   private static final RoundedCornerShape invoke$lambda$4$lambda$3(List $flattenedTree, int $index, CornerSize $elementBackgroundCornerSize, TreeState $treeState) {
/*     */     Object it = ((Tree.Element)CollectionsKt.getOrNull($flattenedTree, $index - 1)).getId();
/*     */     int $i$a$-let-BasicLazyTreeKt$BasicLazyTree$5$1$3$backgroundShape$2$1$hasRoundedTopCorners$1 = 0;
/*     */     ((Tree.Element)CollectionsKt.getOrNull($flattenedTree, $index - 1)).getId();
/*     */     boolean hasRoundedTopCorners = ((Tree.Element)CollectionsKt.getOrNull($flattenedTree, $index - 1) != null && ((Tree.Element)CollectionsKt.getOrNull($flattenedTree, $index - 1)).getId() != null) ? (!$treeState.getDelegate$foundation().getSelectedKeys().contains(it)) : true;
/*     */     Object object1 = ((Tree.Element)CollectionsKt.getOrNull($flattenedTree, $index + 1)).getId();
/*     */     int $i$a$-let-BasicLazyTreeKt$BasicLazyTree$5$1$3$backgroundShape$2$1$hasRoundedBottomCorners$1 = 0;
/*     */     ((Tree.Element)CollectionsKt.getOrNull($flattenedTree, $index + 1)).getId();
/*     */     boolean hasRoundedBottomCorners = ((Tree.Element)CollectionsKt.getOrNull($flattenedTree, $index + 1) != null && ((Tree.Element)CollectionsKt.getOrNull($flattenedTree, $index + 1)).getId() != null) ? (!$treeState.getDelegate$foundation().getSelectedKeys().contains(object1)) : true;
/*     */     CornerSize topCornerSize = BasicLazyTreeKt.access$computerCornerSize(hasRoundedTopCorners, $elementBackgroundCornerSize);
/*     */     CornerSize bottomCornerSize = BasicLazyTreeKt.access$computerCornerSize(hasRoundedBottomCorners, $elementBackgroundCornerSize);
/*     */     return new RoundedCornerShape(topCornerSize, topCornerSize, bottomCornerSize, bottomCornerSize);
/*     */   }
/*     */   
/*     */   private static final Unit invoke$lambda$8$lambda$7(PointerEventActions $pointerEventScopedActions, List $flattenedTree, int $index, CoroutineScope $scope, long $platformDoubleClickDelay, Function1<? super Tree.Element<?>, Unit> $onElementClick, Function1<? super Tree.Element<?>, Unit> $onElementDoubleClick, TreeState $treeState) {
/*     */     if ((($pointerEventScopedActions instanceof DefaultTreeViewPointerEventAction) ? $pointerEventScopedActions : null) != null) {
/*     */       Intrinsics.checkNotNull($flattenedTree.get($index), "null cannot be cast to non-null type org.jetbrains.jewel.foundation.lazy.tree.Tree.Element<T of org.jetbrains.jewel.foundation.lazy.tree.BasicLazyTreeKt.BasicLazyTree>");
/*     */       (($pointerEventScopedActions instanceof DefaultTreeViewPointerEventAction) ? $pointerEventScopedActions : null).notifyItemClicked((Tree.Element)$flattenedTree.get($index), $scope, Duration.getInWholeMilliseconds-impl($platformDoubleClickDelay), $onElementClick, $onElementDoubleClick);
/*     */     } else {
/*     */       ($pointerEventScopedActions instanceof DefaultTreeViewPointerEventAction) ? $pointerEventScopedActions : null;
/*     */     } 
/*     */     $treeState.getDelegate$foundation().setLastActiveItemIndex(Integer.valueOf($index));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit invoke$lambda$13$lambda$11$lambda$10(TreeState $treeState, Tree.Element $element, Function1 $onElementDoubleClick) {
/*     */     $treeState.toggleNode(((Tree.Element.Node)$element).getId());
/*     */     Intrinsics.checkNotNull($element, "null cannot be cast to non-null type org.jetbrains.jewel.foundation.lazy.tree.Tree.Element<T of org.jetbrains.jewel.foundation.lazy.tree.BasicLazyTreeKt.BasicLazyTree>");
/*     */     $onElementDoubleClick.invoke($element);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   BasicLazyTreeKt$BasicLazyTree$5$1$3(List<Tree.Element<?>> $flattenedTree, TreeState $treeState, CornerSize $elementBackgroundCornerSize, float $elementMinHeight, PaddingValues $elementPadding, long $elementBackgroundSelectedFocused, long $elementBackgroundFocused, long $elementBackgroundSelected, PaddingValues $elementContentPadding, float $indentSize, PointerEventActions $pointerEventScopedActions, CoroutineScope $scope, long $platformDoubleClickDelay, Function1<Tree.Element<T>, Unit> $onElementClick, Function1<Tree.Element<T>, Unit> $onElementDoubleClick, float $chevronContentGap, Function4<SelectableLazyItemScope, Tree.Element<T>, Composer, Integer, Unit> $nodeContent, Function3<TreeElementState, Composer, Integer, Unit> $chevronContent) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\tree\BasicLazyTreeKt$BasicLazyTree$5$1$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */