/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*    */ import androidx.compose.foundation.layout.BoxScope;
/*    */ import androidx.compose.foundation.layout.SizeKt;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.ui.Modifier;
/*    */ import androidx.compose.ui.text.font.FontFamily;
/*    */ import androidx.compose.ui.text.style.TextOverflow;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.jewel.ui.component.MenuScope;
/*    */ import org.jetbrains.jewel.ui.component.TextKt;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000&\n\000\n\002\020\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020 \n\000\n\002\030\002\n\002\020\b\n\002\b\002\032E\020\000\032\0020\0012\006\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\016\b\002\020\006\032\b\022\004\022\0020\0030\0072\024\b\002\020\b\032\016\022\004\022\0020\n\022\004\022\0020\0010\tH\007¢\006\002\020\013¨\006\f"}, d2 = {"DisplayCommandWithActions", "", "command", "", "modifier", "Landroidx/compose/ui/Modifier;", "actionNames", "", "onActionPerformed", "Lkotlin/Function1;", "", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "standalone"})
/*    */ @SourceDebugExtension({"SMAP\nDisplayCommandWithActions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DisplayCommandWithActions.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/DisplayCommandWithActionsKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,71:1\n1225#2,6:72\n1225#2,6:118\n149#3:78\n149#3:79\n149#3:116\n149#3:117\n71#4:80\n68#4,6:81\n74#4:115\n78#4:127\n79#5,6:87\n86#5,4:102\n90#5,2:112\n94#5:126\n368#6,9:93\n377#6:114\n378#6,2:124\n4034#7,6:106\n*S KotlinDebug\n*F\n+ 1 DisplayCommandWithActions.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/DisplayCommandWithActionsKt\n*L\n26#1:72,6\n59#1:118,6\n33#1:78\n35#1:79\n56#1:116\n58#1:117\n28#1:80\n28#1:81,6\n28#1:115\n28#1:127\n28#1:87,6\n28#1:102,4\n28#1:112,2\n28#1:126\n28#1:93,9\n28#1:114\n28#1:124,2\n28#1:106,6\n*E\n"})
/*    */ public final class DisplayCommandWithActionsKt {
/*    */   private static final Unit DisplayCommandWithActions$lambda$1$lambda$0(int it) {
/* 26 */     return Unit.INSTANCE;
/*    */   }
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public static final void DisplayCommandWithActions(@NotNull String command, @Nullable Modifier modifier, @Nullable List actionNames, @Nullable Function1 onActionPerformed, @Nullable Composer $composer, int $changed, int paramInt1) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ldc 'command'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload #4
/*    */     //   8: ldc 2024187110
/*    */     //   10: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*    */     //   15: astore #4
/*    */     //   17: iload #5
/*    */     //   19: istore #7
/*    */     //   21: iload #6
/*    */     //   23: iconst_1
/*    */     //   24: iand
/*    */     //   25: ifeq -> 38
/*    */     //   28: iload #7
/*    */     //   30: bipush #6
/*    */     //   32: ior
/*    */     //   33: istore #7
/*    */     //   35: goto -> 67
/*    */     //   38: iload #5
/*    */     //   40: bipush #6
/*    */     //   42: iand
/*    */     //   43: ifne -> 67
/*    */     //   46: iload #7
/*    */     //   48: aload #4
/*    */     //   50: aload_0
/*    */     //   51: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   56: ifeq -> 63
/*    */     //   59: iconst_4
/*    */     //   60: goto -> 64
/*    */     //   63: iconst_2
/*    */     //   64: ior
/*    */     //   65: istore #7
/*    */     //   67: iload #6
/*    */     //   69: iconst_2
/*    */     //   70: iand
/*    */     //   71: ifeq -> 84
/*    */     //   74: iload #7
/*    */     //   76: bipush #48
/*    */     //   78: ior
/*    */     //   79: istore #7
/*    */     //   81: goto -> 115
/*    */     //   84: iload #5
/*    */     //   86: bipush #48
/*    */     //   88: iand
/*    */     //   89: ifne -> 115
/*    */     //   92: iload #7
/*    */     //   94: aload #4
/*    */     //   96: aload_1
/*    */     //   97: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   102: ifeq -> 110
/*    */     //   105: bipush #32
/*    */     //   107: goto -> 112
/*    */     //   110: bipush #16
/*    */     //   112: ior
/*    */     //   113: istore #7
/*    */     //   115: iload #6
/*    */     //   117: iconst_4
/*    */     //   118: iand
/*    */     //   119: ifeq -> 133
/*    */     //   122: iload #7
/*    */     //   124: sipush #384
/*    */     //   127: ior
/*    */     //   128: istore #7
/*    */     //   130: goto -> 167
/*    */     //   133: iload #5
/*    */     //   135: sipush #384
/*    */     //   138: iand
/*    */     //   139: ifne -> 167
/*    */     //   142: iload #7
/*    */     //   144: aload #4
/*    */     //   146: aload_2
/*    */     //   147: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   152: ifeq -> 161
/*    */     //   155: sipush #256
/*    */     //   158: goto -> 164
/*    */     //   161: sipush #128
/*    */     //   164: ior
/*    */     //   165: istore #7
/*    */     //   167: iload #6
/*    */     //   169: bipush #8
/*    */     //   171: iand
/*    */     //   172: ifeq -> 186
/*    */     //   175: iload #7
/*    */     //   177: sipush #3072
/*    */     //   180: ior
/*    */     //   181: istore #7
/*    */     //   183: goto -> 220
/*    */     //   186: iload #5
/*    */     //   188: sipush #3072
/*    */     //   191: iand
/*    */     //   192: ifne -> 220
/*    */     //   195: iload #7
/*    */     //   197: aload #4
/*    */     //   199: aload_3
/*    */     //   200: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   205: ifeq -> 214
/*    */     //   208: sipush #2048
/*    */     //   211: goto -> 217
/*    */     //   214: sipush #1024
/*    */     //   217: ior
/*    */     //   218: istore #7
/*    */     //   220: iload #7
/*    */     //   222: sipush #1171
/*    */     //   225: iand
/*    */     //   226: sipush #1170
/*    */     //   229: if_icmpne -> 242
/*    */     //   232: aload #4
/*    */     //   234: invokeinterface getSkipping : ()Z
/*    */     //   239: ifne -> 1134
/*    */     //   242: iload #6
/*    */     //   244: iconst_2
/*    */     //   245: iand
/*    */     //   246: ifeq -> 256
/*    */     //   249: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   252: checkcast androidx/compose/ui/Modifier
/*    */     //   255: astore_1
/*    */     //   256: iload #6
/*    */     //   258: iconst_4
/*    */     //   259: iand
/*    */     //   260: ifeq -> 267
/*    */     //   263: invokestatic emptyList : ()Ljava/util/List;
/*    */     //   266: astore_2
/*    */     //   267: iload #6
/*    */     //   269: bipush #8
/*    */     //   271: iand
/*    */     //   272: ifeq -> 361
/*    */     //   275: aload #4
/*    */     //   277: ldc 1406149550
/*    */     //   279: invokeinterface startReplaceGroup : (I)V
/*    */     //   284: aload #4
/*    */     //   286: astore #9
/*    */     //   288: iconst_0
/*    */     //   289: istore #10
/*    */     //   291: iconst_0
/*    */     //   292: istore #11
/*    */     //   294: aload #9
/*    */     //   296: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   301: astore #12
/*    */     //   303: iconst_0
/*    */     //   304: istore #13
/*    */     //   306: aload #12
/*    */     //   308: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   311: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   314: if_acmpne -> 341
/*    */     //   317: iconst_0
/*    */     //   318: istore #14
/*    */     //   320: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*    */     //   325: astore #14
/*    */     //   327: aload #9
/*    */     //   329: aload #14
/*    */     //   331: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   336: aload #14
/*    */     //   338: goto -> 343
/*    */     //   341: aload #12
/*    */     //   343: nop
/*    */     //   344: nop
/*    */     //   345: nop
/*    */     //   346: checkcast kotlin/jvm/functions/Function1
/*    */     //   349: astore #8
/*    */     //   351: aload #4
/*    */     //   353: invokeinterface endReplaceGroup : ()V
/*    */     //   358: aload #8
/*    */     //   360: astore_3
/*    */     //   361: invokestatic isTraceInProgress : ()Z
/*    */     //   364: ifeq -> 377
/*    */     //   367: ldc 2024187110
/*    */     //   369: iload #7
/*    */     //   371: iconst_m1
/*    */     //   372: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.DisplayCommandWithActions (DisplayCommandWithActions.kt:26)'
/*    */     //   374: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   377: aload_1
/*    */     //   378: aload #4
/*    */     //   380: iconst_0
/*    */     //   381: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*    */     //   384: invokevirtual getPromptAreaBackgroundColor-0d7_KjU : ()J
/*    */     //   387: bipush #6
/*    */     //   389: istore #8
/*    */     //   391: iconst_0
/*    */     //   392: istore #9
/*    */     //   394: iload #8
/*    */     //   396: i2f
/*    */     //   397: invokestatic constructor-impl : (F)F
/*    */     //   400: invokestatic RoundedCornerShape-0680j_4 : (F)Landroidx/compose/foundation/shape/RoundedCornerShape;
/*    */     //   403: checkcast androidx/compose/ui/graphics/Shape
/*    */     //   406: invokestatic background-bw27NRU : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;
/*    */     //   409: bipush #12
/*    */     //   411: istore #8
/*    */     //   413: iconst_0
/*    */     //   414: istore #9
/*    */     //   416: iload #8
/*    */     //   418: i2f
/*    */     //   419: invokestatic constructor-impl : (F)F
/*    */     //   422: bipush #10
/*    */     //   424: istore #8
/*    */     //   426: iconst_0
/*    */     //   427: istore #9
/*    */     //   429: iload #8
/*    */     //   431: i2f
/*    */     //   432: invokestatic constructor-impl : (F)F
/*    */     //   435: invokestatic padding-VpY3zN4 : (Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;
/*    */     //   438: fconst_0
/*    */     //   439: iconst_1
/*    */     //   440: aconst_null
/*    */     //   441: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*    */     //   444: astore #8
/*    */     //   446: iconst_0
/*    */     //   447: istore #11
/*    */     //   449: nop
/*    */     //   450: iconst_0
/*    */     //   451: istore #12
/*    */     //   453: aload #4
/*    */     //   455: ldc 733328855
/*    */     //   457: ldc 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*    */     //   459: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   462: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*    */     //   465: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*    */     //   468: astore #9
/*    */     //   470: iconst_0
/*    */     //   471: istore #10
/*    */     //   473: aload #9
/*    */     //   475: iload #10
/*    */     //   477: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   480: astore #13
/*    */     //   482: bipush #112
/*    */     //   484: iload #11
/*    */     //   486: iconst_3
/*    */     //   487: ishl
/*    */     //   488: iand
/*    */     //   489: istore #14
/*    */     //   491: nop
/*    */     //   492: iconst_0
/*    */     //   493: istore #15
/*    */     //   495: aload #4
/*    */     //   497: ldc -1323940314
/*    */     //   499: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*    */     //   501: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   504: aload #4
/*    */     //   506: iconst_0
/*    */     //   507: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*    */     //   510: istore #16
/*    */     //   512: aload #4
/*    */     //   514: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   519: astore #17
/*    */     //   521: aload #4
/*    */     //   523: aload #8
/*    */     //   525: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*    */     //   528: astore #18
/*    */     //   530: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   533: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*    */     //   536: astore #19
/*    */     //   538: bipush #6
/*    */     //   540: sipush #896
/*    */     //   543: iload #14
/*    */     //   545: bipush #6
/*    */     //   547: ishl
/*    */     //   548: iand
/*    */     //   549: ior
/*    */     //   550: istore #20
/*    */     //   552: nop
/*    */     //   553: iconst_0
/*    */     //   554: istore #21
/*    */     //   556: aload #4
/*    */     //   558: ldc -692256719
/*    */     //   560: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*    */     //   562: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   565: aload #4
/*    */     //   567: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*    */     //   572: instanceof androidx/compose/runtime/Applier
/*    */     //   575: ifne -> 581
/*    */     //   578: invokestatic invalidApplier : ()V
/*    */     //   581: aload #4
/*    */     //   583: invokeinterface startReusableNode : ()V
/*    */     //   588: aload #4
/*    */     //   590: invokeinterface getInserting : ()Z
/*    */     //   595: ifeq -> 610
/*    */     //   598: aload #4
/*    */     //   600: aload #19
/*    */     //   602: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*    */     //   607: goto -> 617
/*    */     //   610: aload #4
/*    */     //   612: invokeinterface useNode : ()V
/*    */     //   617: aload #4
/*    */     //   619: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*    */     //   622: astore #22
/*    */     //   624: iconst_0
/*    */     //   625: istore #23
/*    */     //   627: aload #22
/*    */     //   629: aload #13
/*    */     //   631: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   634: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*    */     //   637: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   640: aload #22
/*    */     //   642: aload #17
/*    */     //   644: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   647: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*    */     //   650: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   653: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   656: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*    */     //   659: astore #24
/*    */     //   661: iconst_0
/*    */     //   662: istore #25
/*    */     //   664: aload #22
/*    */     //   666: astore #26
/*    */     //   668: iconst_0
/*    */     //   669: istore #27
/*    */     //   671: aload #26
/*    */     //   673: invokeinterface getInserting : ()Z
/*    */     //   678: ifne -> 699
/*    */     //   681: aload #26
/*    */     //   683: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   688: iload #16
/*    */     //   690: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   693: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   696: ifne -> 725
/*    */     //   699: aload #26
/*    */     //   701: iload #16
/*    */     //   703: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   706: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   711: aload #22
/*    */     //   713: iload #16
/*    */     //   715: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   718: aload #24
/*    */     //   720: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   725: nop
/*    */     //   726: nop
/*    */     //   727: nop
/*    */     //   728: aload #22
/*    */     //   730: aload #18
/*    */     //   732: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   735: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*    */     //   738: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   741: nop
/*    */     //   742: nop
/*    */     //   743: aload #4
/*    */     //   745: bipush #14
/*    */     //   747: iload #20
/*    */     //   749: bipush #6
/*    */     //   751: ishr
/*    */     //   752: iand
/*    */     //   753: istore #28
/*    */     //   755: astore #29
/*    */     //   757: iconst_0
/*    */     //   758: istore #30
/*    */     //   760: aload #29
/*    */     //   762: ldc_w -2146769399
/*    */     //   765: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*    */     //   768: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   771: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*    */     //   774: aload #29
/*    */     //   776: bipush #6
/*    */     //   778: bipush #112
/*    */     //   780: iload #11
/*    */     //   782: bipush #6
/*    */     //   784: ishr
/*    */     //   785: iand
/*    */     //   786: ior
/*    */     //   787: istore #31
/*    */     //   789: astore #32
/*    */     //   791: checkcast androidx/compose/foundation/layout/BoxScope
/*    */     //   794: astore #33
/*    */     //   796: iconst_0
/*    */     //   797: istore #34
/*    */     //   799: aconst_null
/*    */     //   800: ldc_w 1971677967
/*    */     //   803: iconst_1
/*    */     //   804: new com/intellij/ml/llm/matterhorn/ej/ui/components/DisplayCommandWithActionsKt$DisplayCommandWithActions$2$1
/*    */     //   807: dup
/*    */     //   808: aload #33
/*    */     //   810: aload_0
/*    */     //   811: invokespecial <init> : (Landroidx/compose/foundation/layout/BoxScope;Ljava/lang/String;)V
/*    */     //   814: aload #32
/*    */     //   816: bipush #54
/*    */     //   818: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*    */     //   821: checkcast kotlin/jvm/functions/Function2
/*    */     //   824: aload #32
/*    */     //   826: bipush #48
/*    */     //   828: iconst_1
/*    */     //   829: invokestatic SelectionContainer : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*    */     //   832: aload #32
/*    */     //   834: ldc_w 467957317
/*    */     //   837: invokeinterface startReplaceGroup : (I)V
/*    */     //   842: aload_2
/*    */     //   843: checkcast java/util/Collection
/*    */     //   846: invokeinterface isEmpty : ()Z
/*    */     //   851: ifne -> 858
/*    */     //   854: iconst_1
/*    */     //   855: goto -> 859
/*    */     //   858: iconst_0
/*    */     //   859: ifeq -> 1084
/*    */     //   862: aload #33
/*    */     //   864: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   867: checkcast androidx/compose/ui/Modifier
/*    */     //   870: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*    */     //   873: invokevirtual getTopEnd : ()Landroidx/compose/ui/Alignment;
/*    */     //   876: invokeinterface align : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;
/*    */     //   881: aload #32
/*    */     //   883: iconst_0
/*    */     //   884: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*    */     //   887: invokevirtual getPromptAreaBackgroundColor-0d7_KjU : ()J
/*    */     //   890: bipush #6
/*    */     //   892: istore #35
/*    */     //   894: iconst_0
/*    */     //   895: istore #36
/*    */     //   897: iload #35
/*    */     //   899: i2f
/*    */     //   900: invokestatic constructor-impl : (F)F
/*    */     //   903: invokestatic RoundedCornerShape-0680j_4 : (F)Landroidx/compose/foundation/shape/RoundedCornerShape;
/*    */     //   906: checkcast androidx/compose/ui/graphics/Shape
/*    */     //   909: invokestatic background-bw27NRU : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;
/*    */     //   912: bipush #20
/*    */     //   914: istore #35
/*    */     //   916: iconst_0
/*    */     //   917: istore #36
/*    */     //   919: iload #35
/*    */     //   921: i2f
/*    */     //   922: invokestatic constructor-impl : (F)F
/*    */     //   925: invokestatic size-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*    */     //   928: iconst_0
/*    */     //   929: aconst_null
/*    */     //   930: aconst_null
/*    */     //   931: aconst_null
/*    */     //   932: aload #32
/*    */     //   934: ldc_w 467967718
/*    */     //   937: invokeinterface startReplaceGroup : (I)V
/*    */     //   942: aload #32
/*    */     //   944: astore #36
/*    */     //   946: aload #4
/*    */     //   948: aload_2
/*    */     //   949: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   954: iload #7
/*    */     //   956: sipush #7168
/*    */     //   959: iand
/*    */     //   960: sipush #2048
/*    */     //   963: if_icmpne -> 970
/*    */     //   966: iconst_1
/*    */     //   967: goto -> 971
/*    */     //   970: iconst_0
/*    */     //   971: ior
/*    */     //   972: istore #37
/*    */     //   974: nop
/*    */     //   975: iconst_0
/*    */     //   976: istore #38
/*    */     //   978: aload #36
/*    */     //   980: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   985: astore #39
/*    */     //   987: iconst_0
/*    */     //   988: istore #40
/*    */     //   990: iload #37
/*    */     //   992: ifne -> 1006
/*    */     //   995: aload #39
/*    */     //   997: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   1000: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   1003: if_acmpne -> 1056
/*    */     //   1006: astore #41
/*    */     //   1008: astore #42
/*    */     //   1010: astore #43
/*    */     //   1012: istore #44
/*    */     //   1014: astore #45
/*    */     //   1016: iconst_0
/*    */     //   1017: istore #46
/*    */     //   1019: aload_2
/*    */     //   1020: aload_3
/*    */     //   1021: <illegal opcode> invoke : (Ljava/util/List;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;
/*    */     //   1026: astore #47
/*    */     //   1028: aload #45
/*    */     //   1030: iload #44
/*    */     //   1032: aload #43
/*    */     //   1034: aload #42
/*    */     //   1036: aload #41
/*    */     //   1038: aload #47
/*    */     //   1040: astore #48
/*    */     //   1042: aload #36
/*    */     //   1044: aload #48
/*    */     //   1046: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   1051: aload #48
/*    */     //   1053: goto -> 1058
/*    */     //   1056: aload #39
/*    */     //   1058: nop
/*    */     //   1059: nop
/*    */     //   1060: nop
/*    */     //   1061: checkcast kotlin/jvm/functions/Function1
/*    */     //   1064: astore #35
/*    */     //   1066: aload #32
/*    */     //   1068: invokeinterface endReplaceGroup : ()V
/*    */     //   1073: aload #35
/*    */     //   1075: aconst_null
/*    */     //   1076: aload #32
/*    */     //   1078: iconst_0
/*    */     //   1079: bipush #94
/*    */     //   1081: invokestatic JunieTreeDotsDropdown : (Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/Outline;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*    */     //   1084: aload #32
/*    */     //   1086: invokeinterface endReplaceGroup : ()V
/*    */     //   1091: nop
/*    */     //   1092: aload #29
/*    */     //   1094: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1097: aload #4
/*    */     //   1099: invokeinterface endNode : ()V
/*    */     //   1104: aload #4
/*    */     //   1106: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1109: nop
/*    */     //   1110: aload #4
/*    */     //   1112: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1115: nop
/*    */     //   1116: aload #4
/*    */     //   1118: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1121: nop
/*    */     //   1122: invokestatic isTraceInProgress : ()Z
/*    */     //   1125: ifeq -> 1141
/*    */     //   1128: invokestatic traceEventEnd : ()V
/*    */     //   1131: goto -> 1141
/*    */     //   1134: aload #4
/*    */     //   1136: invokeinterface skipToGroupEnd : ()V
/*    */     //   1141: aload #4
/*    */     //   1143: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*    */     //   1148: dup
/*    */     //   1149: ifnull -> 1173
/*    */     //   1152: aload_0
/*    */     //   1153: aload_1
/*    */     //   1154: aload_2
/*    */     //   1155: aload_3
/*    */     //   1156: iload #5
/*    */     //   1158: iload #6
/*    */     //   1160: <illegal opcode> invoke : (Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;II)Lkotlin/jvm/functions/Function2;
/*    */     //   1165: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*    */     //   1170: goto -> 1174
/*    */     //   1173: pop
/*    */     //   1174: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #27	-> 6
/*    */     //   #24	-> 249
/*    */     //   #25	-> 263
/*    */     //   #26	-> 275
/*    */     //   #72	-> 294
/*    */     //   #73	-> 306
/*    */     //   #74	-> 317
/*    */     //   #74	-> 325
/*    */     //   #75	-> 327
/*    */     //   #76	-> 336
/*    */     //   #77	-> 341
/*    */     //   #73	-> 343
/*    */     //   #72	-> 344
/*    */     //   #72	-> 345
/*    */     //   #26	-> 346
/*    */     //   #27	-> 374
/*    */     //   #30	-> 377
/*    */     //   #32	-> 381
/*    */     //   #33	-> 387
/*    */     //   #78	-> 394
/*    */     //   #33	-> 400
/*    */     //   #31	-> 406
/*    */     //   #35	-> 409
/*    */     //   #79	-> 416
/*    */     //   #35	-> 422
/*    */     //   #79	-> 429
/*    */     //   #35	-> 435
/*    */     //   #36	-> 438
/*    */     //   #28	-> 449
/*    */     //   #80	-> 459
/*    */     //   #81	-> 462
/*    */     //   #82	-> 470
/*    */     //   #85	-> 473
/*    */     //   #86	-> 491
/*    */     //   #87	-> 501
/*    */     //   #88	-> 507
/*    */     //   #89	-> 514
/*    */     //   #90	-> 523
/*    */     //   #92	-> 530
/*    */     //   #91	-> 552
/*    */     //   #93	-> 562
/*    */     //   #94	-> 565
/*    */     //   #95	-> 583
/*    */     //   #96	-> 588
/*    */     //   #97	-> 600
/*    */     //   #99	-> 612
/*    */     //   #101	-> 617
/*    */     //   #102	-> 627
/*    */     //   #103	-> 640
/*    */     //   #105	-> 653
/*    */     //   #106	-> 664
/*    */     //   #107	-> 671
/*    */     //   #108	-> 699
/*    */     //   #109	-> 711
/*    */     //   #111	-> 725
/*    */     //   #106	-> 726
/*    */     //   #111	-> 727
/*    */     //   #112	-> 728
/*    */     //   #113	-> 741
/*    */     //   #101	-> 742
/*    */     //   #114	-> 743
/*    */     //   #115	-> 768
/*    */     //   #38	-> 800
/*    */     //   #49	-> 842
/*    */     //   #49	-> 859
/*    */     //   #52	-> 862
/*    */     //   #53	-> 870
/*    */     //   #55	-> 884
/*    */     //   #56	-> 890
/*    */     //   #116	-> 897
/*    */     //   #56	-> 903
/*    */     //   #54	-> 909
/*    */     //   #58	-> 912
/*    */     //   #117	-> 919
/*    */     //   #58	-> 925
/*    */     //   #59	-> 974
/*    */     //   #118	-> 978
/*    */     //   #119	-> 990
/*    */     //   #120	-> 1006
/*    */     //   #59	-> 1019
/*    */     //   #120	-> 1040
/*    */     //   #121	-> 1042
/*    */     //   #122	-> 1051
/*    */     //   #123	-> 1056
/*    */     //   #119	-> 1058
/*    */     //   #118	-> 1059
/*    */     //   #118	-> 1060
/*    */     //   #59	-> 1061
/*    */     //   #50	-> 1081
/*    */     //   #69	-> 1091
/*    */     //   #115	-> 1092
/*    */     //   #114	-> 1097
/*    */     //   #124	-> 1099
/*    */     //   #93	-> 1106
/*    */     //   #125	-> 1109
/*    */     //   #87	-> 1112
/*    */     //   #126	-> 1115
/*    */     //   #80	-> 1118
/*    */     //   #127	-> 1121
/*    */     //   #70	-> 1134
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   320	5	14	$i$a$-cache-DisplayCommandWithActionsKt$DisplayCommandWithActions$1	I
/*    */     //   327	11	14	value$iv	Ljava/lang/Object;
/*    */     //   306	38	13	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   303	41	12	it$iv	Ljava/lang/Object;
/*    */     //   294	52	11	$i$f$cache	I
/*    */     //   291	55	9	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   291	55	10	invalid$iv	Z
/*    */     //   394	6	9	$i$f$getDp	I
/*    */     //   391	9	8	$this$dp$iv	I
/*    */     //   416	6	9	$i$f$getDp	I
/*    */     //   413	9	8	$this$dp$iv	I
/*    */     //   429	6	9	$i$f$getDp	I
/*    */     //   426	9	8	$this$dp$iv	I
/*    */     //   897	6	36	$i$f$getDp	I
/*    */     //   894	9	35	$this$dp$iv	I
/*    */     //   919	6	36	$i$f$getDp	I
/*    */     //   916	9	35	$this$dp$iv	I
/*    */     //   1019	7	46	$i$a$-cache-DisplayCommandWithActionsKt$DisplayCommandWithActions$2$2	I
/*    */     //   1042	11	48	value$iv	Ljava/lang/Object;
/*    */     //   990	69	40	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   987	72	39	it$iv	Ljava/lang/Object;
/*    */     //   978	83	38	$i$f$cache	I
/*    */     //   975	86	36	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   975	86	37	invalid$iv	Z
/*    */     //   799	293	34	$i$a$-Box-DisplayCommandWithActionsKt$DisplayCommandWithActions$2	I
/*    */     //   796	296	33	$this$DisplayCommandWithActions_u24lambda_u245	Landroidx/compose/foundation/layout/BoxScope;
/*    */     //   796	296	32	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   796	296	31	$changed	I
/*    */     //   760	337	30	$i$a$-Layout-BoxKt$Box$1$iv	I
/*    */     //   757	340	29	$composer$iv	Landroidx/compose/runtime/Composer;
/*    */     //   757	340	28	$changed$iv	I
/*    */     //   671	55	27	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*    */     //   668	58	26	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   664	64	25	$i$f$set-impl	I
/*    */     //   661	67	24	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*    */     //   627	115	23	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*    */     //   624	118	22	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   556	554	21	$i$f$ReusableComposeNode	I
/*    */     //   553	557	19	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*    */     //   553	557	20	$changed$iv$iv$iv	I
/*    */     //   495	621	15	$i$f$Layout	I
/*    */     //   512	604	16	compositeKeyHash$iv$iv	I
/*    */     //   521	595	17	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   530	586	18	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*    */     //   492	624	14	$changed$iv$iv	I
/*    */     //   453	669	12	$i$f$Box	I
/*    */     //   482	640	13	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   450	672	8	modifier$iv	Landroidx/compose/ui/Modifier;
/*    */     //   470	652	9	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*    */     //   473	649	10	propagateMinConstraints$iv	Z
/*    */     //   450	672	11	$changed$iv	I
/*    */     //   21	1154	7	$dirty	I
/*    */     //   0	1175	0	command	Ljava/lang/String;
/*    */     //   0	1175	1	modifier	Landroidx/compose/ui/Modifier;
/*    */     //   0	1175	2	actionNames	Ljava/util/List;
/*    */     //   0	1175	3	onActionPerformed	Lkotlin/jvm/functions/Function1;
/*    */     //   0	1175	4	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	1175	5	$changed	I
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   @SourceDebugExtension({"SMAP\nDisplayCommandWithActions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DisplayCommandWithActions.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/DisplayCommandWithActionsKt$DisplayCommandWithActions$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,71:1\n149#2:72\n*S KotlinDebug\n*F\n+ 1 DisplayCommandWithActions.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/DisplayCommandWithActionsKt$DisplayCommandWithActions$2$1\n*L\n42#1:72\n*E\n"})
/*    */   static final class DisplayCommandWithActionsKt$DisplayCommandWithActions$2$1 implements Function2<Composer, Integer, Unit> { @Composable
/*    */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */     public final void invoke(Composer $composer, int $changed) {
/* 39 */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1971677967, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.components.DisplayCommandWithActions.<anonymous>.<anonymous> (DisplayCommandWithActions.kt:38)");
/*    */ 
/*    */         
/* 42 */         int $this$dp$iv = 20, $i$f$getDp = 0;
/* 43 */         Modifier modifier = this.$this_Box.align(SizeKt.defaultMinSize-VpY3zN4$default((Modifier)Modifier.Companion, 0.0F, 
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */               
/* 72 */               Dp.constructor-impl($this$dp$iv), 1, null), Alignment.Companion.getCenterStart());
/*    */         FontFamily fontFamily = MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getMessageFont($composer, 0);
/*    */         $i$f$getDp = TextOverflow.Companion.getEllipsis-gIe3tQ8();
/*    */         TextKt.Text-bAzTDeA(this.$command, modifier, 0L, 0L, null, null, fontFamily, 0L, null, 0, 0L, $i$f$getDp, false, 0, null, null, $composer, 0, 48, 63420);
/*    */         if (ComposerKt.isTraceInProgress())
/*    */           ComposerKt.traceEventEnd();  }
/*    */       else
/*    */       { $composer.skipToGroupEnd(); }
/*    */     
/*    */     }
/*    */     
/*    */     DisplayCommandWithActionsKt$DisplayCommandWithActions$2$1(BoxScope $receiver, String $command) {} }
/*    */ 
/*    */   
/*    */   private static final Unit DisplayCommandWithActions$lambda$5$lambda$4$lambda$3(List<String> $actionNames, Function1 $onActionPerformed, MenuScope $this$JunieTreeDotsDropdown) {
/*    */     Intrinsics.checkNotNullParameter($this$JunieTreeDotsDropdown, "$this$JunieTreeDotsDropdown");
/*    */     MenuKt.items($this$JunieTreeDotsDropdown, $actionNames.size(), DisplayCommandWithActionsKt::DisplayCommandWithActions$lambda$5$lambda$4$lambda$3$lambda$2, $onActionPerformed, (Function3)ComposableLambdaKt.composableLambdaInstance(-428148419, true, new DisplayCommandWithActionsKt$DisplayCommandWithActions$2$2$1$2($actionNames)));
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   private static final boolean DisplayCommandWithActions$lambda$5$lambda$4$lambda$3$lambda$2(int it) {
/*    */     return false;
/*    */   }
/*    */   
/*    */   private static final Unit DisplayCommandWithActions$lambda$6(String $command, Modifier $modifier, List<String> $actionNames, Function1<? super Integer, Unit> $onActionPerformed, int $$changed, int $$default, Composer $composer, int $force) {
/*    */     DisplayCommandWithActions($command, $modifier, $actionNames, $onActionPerformed, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class DisplayCommandWithActionsKt$DisplayCommandWithActions$2$2$1$2 implements Function3<Integer, Composer, Integer, Unit> {
/*    */     DisplayCommandWithActionsKt$DisplayCommandWithActions$2$2$1$2(List<String> $actionNames) {}
/*    */     
/*    */     @Composable
/*    */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */     public final void invoke(int index, Composer $composer, int $changed) {
/*    */       int $dirty = $changed;
/*    */       if (($changed & 0x6) == 0)
/*    */         $dirty |= $composer.changed(index) ? 4 : 2; 
/*    */       if (($dirty & 0x13) != 18 || !$composer.getSkipping()) {
/*    */         if (ComposerKt.isTraceInProgress())
/*    */           ComposerKt.traceEventStart(-428148419, $dirty, -1, "com.intellij.ml.llm.matterhorn.ej.ui.components.DisplayCommandWithActions.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DisplayCommandWithActions.kt:63)"); 
/*    */         TextKt.Text-bAzTDeA(this.$actionNames.get(index), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, $composer, 0, 0, 65534);
/*    */         if (ComposerKt.isTraceInProgress())
/*    */           ComposerKt.traceEventEnd(); 
/*    */       } else {
/*    */         $composer.skipToGroupEnd();
/*    */       } 
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\DisplayCommandWithActionsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */