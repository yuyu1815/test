/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*    */ 
/*    */ import androidx.compose.animation.AnimatedVisibilityScope;
/*    */ import androidx.compose.foundation.layout.SizeKt;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.MutableState;
/*    */ import androidx.compose.runtime.State;
/*    */ import androidx.compose.ui.Modifier;
/*    */ import androidx.compose.ui.graphics.Color;
/*    */ import androidx.compose.ui.unit.Dp;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.coroutines.BuildersKt;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.DelayKt;
/*    */ import kotlinx.coroutines.Job;
/*    */ import org.jetbrains.jewel.ui.component.IconKt;
/*    */ import org.jetbrains.jewel.ui.icon.IconKey;
/*    */ import org.jetbrains.jewel.ui.icon.IntelliJIconKey;
/*    */ import org.jetbrains.jewel.ui.icons.AllIconsKeys;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ @SourceDebugExtension({"SMAP\nCopyTextToClipboardButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CopyTextToClipboardButton.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/CopyTextToClipboardButtonKt$CopyTextToClipboardButton$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,86:1\n149#2:87\n149#2:88\n1225#3,6:89\n71#4:95\n68#4,6:96\n74#4:130\n78#4:134\n79#5,6:102\n86#5,4:117\n90#5,2:127\n94#5:133\n368#6,9:108\n377#6:129\n378#6,2:131\n4034#7,6:121\n*S KotlinDebug\n*F\n+ 1 CopyTextToClipboardButton.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/CopyTextToClipboardButtonKt$CopyTextToClipboardButton$1\n*L\n61#1:87\n62#1:88\n63#1:89,6\n59#1:95\n59#1:96,6\n59#1:130\n59#1:134\n59#1:102,6\n59#1:117,4\n59#1:127,2\n59#1:133\n59#1:108,9\n59#1:129\n59#1:131,2\n59#1:121,6\n*E\n"})
/*    */ final class CopyTextToClipboardButtonKt$CopyTextToClipboardButton$1
/*    */   implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit>
/*    */ {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final void invoke(AnimatedVisibilityScope $this$AnimatedVisibility, Composer $composer, int $changed) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc '$this$AnimatedVisibility'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: invokestatic isTraceInProgress : ()Z
/*    */     //   9: ifeq -> 21
/*    */     //   12: ldc 1486856086
/*    */     //   14: iload_3
/*    */     //   15: iconst_m1
/*    */     //   16: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.CopyTextToClipboardButton.<anonymous> (CopyTextToClipboardButton.kt:58)'
/*    */     //   18: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   21: aload_0
/*    */     //   22: getfield $modifier : Landroidx/compose/ui/Modifier;
/*    */     //   25: fconst_0
/*    */     //   26: fconst_0
/*    */     //   27: bipush #12
/*    */     //   29: istore #4
/*    */     //   31: iconst_0
/*    */     //   32: istore #5
/*    */     //   34: iload #4
/*    */     //   36: i2f
/*    */     //   37: invokestatic constructor-impl : (F)F
/*    */     //   40: fconst_0
/*    */     //   41: bipush #11
/*    */     //   43: aconst_null
/*    */     //   44: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*    */     //   47: bipush #6
/*    */     //   49: istore #4
/*    */     //   51: iconst_0
/*    */     //   52: istore #5
/*    */     //   54: iload #4
/*    */     //   56: i2f
/*    */     //   57: invokestatic constructor-impl : (F)F
/*    */     //   60: invokestatic RoundedCornerShape-0680j_4 : (F)Landroidx/compose/foundation/shape/RoundedCornerShape;
/*    */     //   63: checkcast androidx/compose/ui/graphics/Shape
/*    */     //   66: invokestatic clip : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;
/*    */     //   69: iconst_0
/*    */     //   70: aconst_null
/*    */     //   71: aconst_null
/*    */     //   72: aload_2
/*    */     //   73: ldc -701829714
/*    */     //   75: invokeinterface startReplaceGroup : (I)V
/*    */     //   80: aload_2
/*    */     //   81: astore #5
/*    */     //   83: aload_2
/*    */     //   84: aload_0
/*    */     //   85: getfield $scope : Lkotlinx/coroutines/CoroutineScope;
/*    */     //   88: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   93: aload_2
/*    */     //   94: aload_0
/*    */     //   95: getfield $feedbackDuration : J
/*    */     //   98: invokeinterface changed : (J)Z
/*    */     //   103: ior
/*    */     //   104: aload_2
/*    */     //   105: aload_0
/*    */     //   106: getfield $onCopyClicked : Lkotlin/jvm/functions/Function0;
/*    */     //   109: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   114: ior
/*    */     //   115: istore #6
/*    */     //   117: aload_0
/*    */     //   118: getfield $scope : Lkotlinx/coroutines/CoroutineScope;
/*    */     //   121: astore #7
/*    */     //   123: aload_0
/*    */     //   124: getfield $onCopyClicked : Lkotlin/jvm/functions/Function0;
/*    */     //   127: astore #8
/*    */     //   129: aload_0
/*    */     //   130: getfield $flashJob$delegate : Landroidx/compose/runtime/MutableState;
/*    */     //   133: astore #9
/*    */     //   135: aload_0
/*    */     //   136: getfield $feedbackDuration : J
/*    */     //   139: lstore #10
/*    */     //   141: aload_0
/*    */     //   142: getfield $isCopyFeedbackVisible$delegate : Landroidx/compose/runtime/MutableState;
/*    */     //   145: astore #12
/*    */     //   147: iconst_0
/*    */     //   148: istore #13
/*    */     //   150: aload #5
/*    */     //   152: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   157: astore #14
/*    */     //   159: iconst_0
/*    */     //   160: istore #15
/*    */     //   162: iload #6
/*    */     //   164: ifne -> 178
/*    */     //   167: aload #14
/*    */     //   169: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   172: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   175: if_acmpne -> 232
/*    */     //   178: astore #35
/*    */     //   180: astore #34
/*    */     //   182: istore #33
/*    */     //   184: astore #32
/*    */     //   186: iconst_0
/*    */     //   187: istore #16
/*    */     //   189: aload #7
/*    */     //   191: aload #8
/*    */     //   193: aload #9
/*    */     //   195: lload #10
/*    */     //   197: aload #12
/*    */     //   199: <illegal opcode> invoke : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/MutableState;JLandroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function0;
/*    */     //   204: astore #36
/*    */     //   206: aload #32
/*    */     //   208: iload #33
/*    */     //   210: aload #34
/*    */     //   212: aload #35
/*    */     //   214: aload #36
/*    */     //   216: astore #17
/*    */     //   218: aload #5
/*    */     //   220: aload #17
/*    */     //   222: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   227: aload #17
/*    */     //   229: goto -> 234
/*    */     //   232: aload #14
/*    */     //   234: nop
/*    */     //   235: nop
/*    */     //   236: nop
/*    */     //   237: checkcast kotlin/jvm/functions/Function0
/*    */     //   240: astore #4
/*    */     //   242: aload_2
/*    */     //   243: invokeinterface endReplaceGroup : ()V
/*    */     //   248: aload #4
/*    */     //   250: bipush #7
/*    */     //   252: aconst_null
/*    */     //   253: invokestatic clickable-XHw0xAI$default : (Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*    */     //   256: astore #4
/*    */     //   258: aload_0
/*    */     //   259: getfield $iconColor$delegate : Landroidx/compose/runtime/State;
/*    */     //   262: astore #7
/*    */     //   264: iconst_0
/*    */     //   265: istore #8
/*    */     //   267: iconst_0
/*    */     //   268: istore #9
/*    */     //   270: aload_2
/*    */     //   271: ldc 733328855
/*    */     //   273: ldc 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*    */     //   275: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   278: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*    */     //   281: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*    */     //   284: astore #5
/*    */     //   286: iconst_0
/*    */     //   287: istore #6
/*    */     //   289: aload #5
/*    */     //   291: iload #6
/*    */     //   293: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   296: astore #10
/*    */     //   298: bipush #112
/*    */     //   300: iload #8
/*    */     //   302: iconst_3
/*    */     //   303: ishl
/*    */     //   304: iand
/*    */     //   305: istore #11
/*    */     //   307: nop
/*    */     //   308: iconst_0
/*    */     //   309: istore #12
/*    */     //   311: aload_2
/*    */     //   312: ldc -1323940314
/*    */     //   314: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*    */     //   316: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   319: aload_2
/*    */     //   320: iconst_0
/*    */     //   321: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*    */     //   324: istore #13
/*    */     //   326: aload_2
/*    */     //   327: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   332: astore #14
/*    */     //   334: aload_2
/*    */     //   335: aload #4
/*    */     //   337: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*    */     //   340: astore #15
/*    */     //   342: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   345: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*    */     //   348: astore #16
/*    */     //   350: bipush #6
/*    */     //   352: sipush #896
/*    */     //   355: iload #11
/*    */     //   357: bipush #6
/*    */     //   359: ishl
/*    */     //   360: iand
/*    */     //   361: ior
/*    */     //   362: istore #17
/*    */     //   364: nop
/*    */     //   365: iconst_0
/*    */     //   366: istore #18
/*    */     //   368: aload_2
/*    */     //   369: ldc -692256719
/*    */     //   371: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*    */     //   373: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   376: aload_2
/*    */     //   377: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*    */     //   382: instanceof androidx/compose/runtime/Applier
/*    */     //   385: ifne -> 391
/*    */     //   388: invokestatic invalidApplier : ()V
/*    */     //   391: aload_2
/*    */     //   392: invokeinterface startReusableNode : ()V
/*    */     //   397: aload_2
/*    */     //   398: invokeinterface getInserting : ()Z
/*    */     //   403: ifeq -> 417
/*    */     //   406: aload_2
/*    */     //   407: aload #16
/*    */     //   409: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*    */     //   414: goto -> 423
/*    */     //   417: aload_2
/*    */     //   418: invokeinterface useNode : ()V
/*    */     //   423: aload_2
/*    */     //   424: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*    */     //   427: astore #19
/*    */     //   429: iconst_0
/*    */     //   430: istore #20
/*    */     //   432: aload #19
/*    */     //   434: aload #10
/*    */     //   436: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   439: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*    */     //   442: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   445: aload #19
/*    */     //   447: aload #14
/*    */     //   449: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   452: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*    */     //   455: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   458: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   461: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*    */     //   464: astore #21
/*    */     //   466: iconst_0
/*    */     //   467: istore #22
/*    */     //   469: aload #19
/*    */     //   471: astore #23
/*    */     //   473: iconst_0
/*    */     //   474: istore #24
/*    */     //   476: aload #23
/*    */     //   478: invokeinterface getInserting : ()Z
/*    */     //   483: ifne -> 504
/*    */     //   486: aload #23
/*    */     //   488: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   493: iload #13
/*    */     //   495: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   498: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   501: ifne -> 530
/*    */     //   504: aload #23
/*    */     //   506: iload #13
/*    */     //   508: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   511: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   516: aload #19
/*    */     //   518: iload #13
/*    */     //   520: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   523: aload #21
/*    */     //   525: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   530: nop
/*    */     //   531: nop
/*    */     //   532: nop
/*    */     //   533: aload #19
/*    */     //   535: aload #15
/*    */     //   537: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   540: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*    */     //   543: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   546: nop
/*    */     //   547: nop
/*    */     //   548: aload_2
/*    */     //   549: bipush #14
/*    */     //   551: iload #17
/*    */     //   553: bipush #6
/*    */     //   555: ishr
/*    */     //   556: iand
/*    */     //   557: istore #25
/*    */     //   559: astore #26
/*    */     //   561: iconst_0
/*    */     //   562: istore #27
/*    */     //   564: aload #26
/*    */     //   566: ldc_w -2146769399
/*    */     //   569: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*    */     //   572: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   575: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*    */     //   578: aload #26
/*    */     //   580: bipush #6
/*    */     //   582: bipush #112
/*    */     //   584: iload #8
/*    */     //   586: bipush #6
/*    */     //   588: ishr
/*    */     //   589: iand
/*    */     //   590: ior
/*    */     //   591: istore #28
/*    */     //   593: astore #29
/*    */     //   595: checkcast androidx/compose/foundation/layout/BoxScope
/*    */     //   598: astore #30
/*    */     //   600: iconst_0
/*    */     //   601: istore #31
/*    */     //   603: getstatic com/intellij/ml/llm/matterhorn/ej/ui/components/ComposableSingletons$CopyTextToClipboardButtonKt.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/components/ComposableSingletons$CopyTextToClipboardButtonKt;
/*    */     //   606: invokevirtual getLambda-1$ej_ui : ()Lkotlin/jvm/functions/Function2;
/*    */     //   609: aconst_null
/*    */     //   610: iconst_0
/*    */     //   611: aconst_null
/*    */     //   612: aconst_null
/*    */     //   613: ldc_w 298552850
/*    */     //   616: iconst_1
/*    */     //   617: new com/intellij/ml/llm/matterhorn/ej/ui/components/CopyTextToClipboardButtonKt$CopyTextToClipboardButton$1$2$1
/*    */     //   620: dup
/*    */     //   621: aload #7
/*    */     //   623: invokespecial <init> : (Landroidx/compose/runtime/State;)V
/*    */     //   626: aload #29
/*    */     //   628: bipush #54
/*    */     //   630: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*    */     //   633: checkcast kotlin/jvm/functions/Function2
/*    */     //   636: aload #29
/*    */     //   638: ldc_w 196614
/*    */     //   641: bipush #30
/*    */     //   643: invokestatic JunieTooltip : (Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/component/styling/TooltipStyle;Landroidx/compose/foundation/TooltipPlacement;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*    */     //   646: nop
/*    */     //   647: aload #26
/*    */     //   649: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   652: aload_2
/*    */     //   653: invokeinterface endNode : ()V
/*    */     //   658: aload_2
/*    */     //   659: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   662: nop
/*    */     //   663: aload_2
/*    */     //   664: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   667: nop
/*    */     //   668: aload_2
/*    */     //   669: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   672: nop
/*    */     //   673: invokestatic isTraceInProgress : ()Z
/*    */     //   676: ifeq -> 682
/*    */     //   679: invokestatic traceEventEnd : ()V
/*    */     //   682: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #59	-> 18
/*    */     //   #60	-> 21
/*    */     //   #61	-> 25
/*    */     //   #87	-> 34
/*    */     //   #61	-> 40
/*    */     //   #62	-> 47
/*    */     //   #88	-> 54
/*    */     //   #62	-> 60
/*    */     //   #63	-> 69
/*    */     //   #89	-> 150
/*    */     //   #90	-> 162
/*    */     //   #91	-> 178
/*    */     //   #63	-> 189
/*    */     //   #91	-> 216
/*    */     //   #92	-> 218
/*    */     //   #93	-> 227
/*    */     //   #94	-> 232
/*    */     //   #90	-> 234
/*    */     //   #89	-> 235
/*    */     //   #89	-> 236
/*    */     //   #63	-> 237
/*    */     //   #59	-> 258
/*    */     //   #95	-> 275
/*    */     //   #96	-> 278
/*    */     //   #97	-> 286
/*    */     //   #100	-> 289
/*    */     //   #101	-> 307
/*    */     //   #102	-> 316
/*    */     //   #103	-> 321
/*    */     //   #104	-> 327
/*    */     //   #105	-> 335
/*    */     //   #107	-> 342
/*    */     //   #106	-> 364
/*    */     //   #108	-> 373
/*    */     //   #109	-> 376
/*    */     //   #110	-> 392
/*    */     //   #111	-> 397
/*    */     //   #112	-> 407
/*    */     //   #114	-> 418
/*    */     //   #116	-> 423
/*    */     //   #117	-> 432
/*    */     //   #118	-> 445
/*    */     //   #120	-> 458
/*    */     //   #121	-> 469
/*    */     //   #122	-> 476
/*    */     //   #123	-> 504
/*    */     //   #124	-> 516
/*    */     //   #126	-> 530
/*    */     //   #121	-> 531
/*    */     //   #126	-> 532
/*    */     //   #127	-> 533
/*    */     //   #128	-> 546
/*    */     //   #116	-> 547
/*    */     //   #129	-> 548
/*    */     //   #130	-> 572
/*    */     //   #75	-> 613
/*    */     //   #73	-> 643
/*    */     //   #84	-> 646
/*    */     //   #130	-> 647
/*    */     //   #129	-> 652
/*    */     //   #131	-> 653
/*    */     //   #108	-> 659
/*    */     //   #132	-> 662
/*    */     //   #102	-> 664
/*    */     //   #133	-> 667
/*    */     //   #95	-> 669
/*    */     //   #134	-> 672
/*    */     //   #85	-> 682
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   34	6	5	$i$f$getDp	I
/*    */     //   31	9	4	$this$dp$iv	I
/*    */     //   54	6	5	$i$f$getDp	I
/*    */     //   51	9	4	$this$dp$iv	I
/*    */     //   189	15	16	$i$a$-cache-CopyTextToClipboardButtonKt$CopyTextToClipboardButton$1$1	I
/*    */     //   218	11	17	value$iv	Ljava/lang/Object;
/*    */     //   162	73	15	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   159	76	14	it$iv	Ljava/lang/Object;
/*    */     //   150	87	13	$i$f$cache	I
/*    */     //   147	90	5	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   147	90	6	invalid$iv	Z
/*    */     //   603	44	31	$i$a$-Box-CopyTextToClipboardButtonKt$CopyTextToClipboardButton$1$2	I
/*    */     //   600	47	30	$this$invoke_u24lambda_u242	Landroidx/compose/foundation/layout/BoxScope;
/*    */     //   600	47	29	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   600	47	28	$changed	I
/*    */     //   564	88	27	$i$a$-Layout-BoxKt$Box$1$iv	I
/*    */     //   561	91	26	$composer$iv	Landroidx/compose/runtime/Composer;
/*    */     //   561	91	25	$changed$iv	I
/*    */     //   476	55	24	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*    */     //   473	58	23	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   469	64	22	$i$f$set-impl	I
/*    */     //   466	67	21	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*    */     //   432	115	20	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*    */     //   429	118	19	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   368	295	18	$i$f$ReusableComposeNode	I
/*    */     //   365	298	16	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*    */     //   365	298	17	$changed$iv$iv$iv	I
/*    */     //   311	357	12	$i$f$Layout	I
/*    */     //   326	342	13	compositeKeyHash$iv$iv	I
/*    */     //   334	334	14	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   342	326	15	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*    */     //   308	360	11	$changed$iv$iv	I
/*    */     //   270	403	9	$i$f$Box	I
/*    */     //   298	375	10	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   267	406	4	modifier$iv	Landroidx/compose/ui/Modifier;
/*    */     //   286	387	5	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*    */     //   289	384	6	propagateMinConstraints$iv	Z
/*    */     //   267	406	8	$changed$iv	I
/*    */     //   0	683	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/components/CopyTextToClipboardButtonKt$CopyTextToClipboardButton$1;
/*    */     //   0	683	1	$this$AnimatedVisibility	Landroidx/compose/animation/AnimatedVisibilityScope;
/*    */     //   0	683	2	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	683	3	$changed	I
/*    */   }
/*    */   
/*    */   private static final Unit invoke$lambda$1$lambda$0(CoroutineScope $scope, Function0 $onCopyClicked, MutableState $flashJob$delegate, long $feedbackDuration, MutableState<Boolean> $isCopyFeedbackVisible$delegate) {
/* 64 */     if (CopyTextToClipboardButtonKt.access$CopyTextToClipboardButton_SBKQj6I$lambda$4($flashJob$delegate) != null) { Job.DefaultImpls.cancel$default(CopyTextToClipboardButtonKt.access$CopyTextToClipboardButton_SBKQj6I$lambda$4($flashJob$delegate), null, 1, null); } else { CopyTextToClipboardButtonKt.access$CopyTextToClipboardButton_SBKQj6I$lambda$4($flashJob$delegate); }
/* 65 */      CopyTextToClipboardButtonKt.access$CopyTextToClipboardButton_SBKQj6I$lambda$5($flashJob$delegate, BuildersKt.launch$default($scope, null, null, new CopyTextToClipboardButtonKt$CopyTextToClipboardButton$1$1$1$1($feedbackDuration, $isCopyFeedbackVisible$delegate, null), 3, null));
/*    */ 
/*    */ 
/*    */     
/* 69 */     CopyTextToClipboardButtonKt.access$CopyTextToClipboardButton_SBKQj6I$lambda$2($isCopyFeedbackVisible$delegate, true);
/* 70 */     $onCopyClicked.invoke();
/* 71 */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   CopyTextToClipboardButtonKt$CopyTextToClipboardButton$1(Modifier $modifier, CoroutineScope $scope, long $feedbackDuration, Function0<Unit> $onCopyClicked, MutableState<Job> $flashJob$delegate, MutableState<Boolean> $isCopyFeedbackVisible$delegate, State<Color> $iconColor$delegate) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\CopyTextToClipboardButtonKt$CopyTextToClipboardButton$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */