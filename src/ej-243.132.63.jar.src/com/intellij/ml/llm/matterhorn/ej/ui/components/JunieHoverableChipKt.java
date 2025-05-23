/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*     */ 
/*     */ import androidx.compose.foundation.layout.BoxScope;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableInferredTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000.\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\004\n\002\020\013\032O\020\000\032\0020\0012\f\020\002\032\b\022\004\022\0020\0010\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0052\034\020\007\032\030\022\004\022\0020\t\022\004\022\0020\0010\b¢\006\002\b\n¢\006\002\b\013H\007¢\006\004\b\f\020\r¨\006\016²\006\n\020\017\032\0020\020X\002"}, d2 = {"JunieHoverableChip", "", "onClick", "Lkotlin/Function0;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "backgroundHoveredColor", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "JunieHoverableChip-eopBjH0", "(Lkotlin/jvm/functions/Function0;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ej-ui", "isHovered", ""})
/*     */ @SourceDebugExtension({"SMAP\nJunieHoverableChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieHoverableChip.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieHoverableChipKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,40:1\n1225#2,6:41\n1225#2,6:49\n1225#2,6:56\n149#3:47\n149#3:48\n149#3:55\n71#4:62\n68#4,6:63\n74#4:97\n78#4:101\n79#5,6:69\n86#5,4:84\n90#5,2:94\n94#5:100\n368#6,9:75\n377#6:96\n378#6,2:98\n4034#7,6:88\n81#8:102\n107#8,2:103\n*S KotlinDebug\n*F\n+ 1 JunieHoverableChip.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieHoverableChipKt\n*L\n29#1:41,6\n34#1:49,6\n37#1:56,6\n32#1:47\n33#1:48\n36#1:55\n30#1:62\n30#1:63,6\n30#1:97\n30#1:101\n30#1:69,6\n30#1:84,4\n30#1:94,2\n30#1:100\n30#1:75,9\n30#1:96\n30#1:98,2\n30#1:88,6\n29#1:102\n29#1:103,2\n*E\n"})
/*     */ public final class JunieHoverableChipKt {
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*     */   public static final void JunieHoverableChip-eopBjH0(@NotNull Function0 onClick, long backgroundColor, long backgroundHoveredColor, @NotNull Function3 content, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'onClick'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload #5
/*     */     //   8: ldc 'content'
/*     */     //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   13: aload #6
/*     */     //   15: ldc -1196947591
/*     */     //   17: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   22: astore #6
/*     */     //   24: iload #7
/*     */     //   26: istore #9
/*     */     //   28: iload #8
/*     */     //   30: iconst_1
/*     */     //   31: iand
/*     */     //   32: ifeq -> 45
/*     */     //   35: iload #9
/*     */     //   37: bipush #6
/*     */     //   39: ior
/*     */     //   40: istore #9
/*     */     //   42: goto -> 74
/*     */     //   45: iload #7
/*     */     //   47: bipush #6
/*     */     //   49: iand
/*     */     //   50: ifne -> 74
/*     */     //   53: iload #9
/*     */     //   55: aload #6
/*     */     //   57: aload_0
/*     */     //   58: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   63: ifeq -> 70
/*     */     //   66: iconst_4
/*     */     //   67: goto -> 71
/*     */     //   70: iconst_2
/*     */     //   71: ior
/*     */     //   72: istore #9
/*     */     //   74: iload #7
/*     */     //   76: bipush #48
/*     */     //   78: iand
/*     */     //   79: ifne -> 112
/*     */     //   82: iload #9
/*     */     //   84: iload #8
/*     */     //   86: iconst_2
/*     */     //   87: iand
/*     */     //   88: ifne -> 107
/*     */     //   91: aload #6
/*     */     //   93: lload_1
/*     */     //   94: invokeinterface changed : (J)Z
/*     */     //   99: ifeq -> 107
/*     */     //   102: bipush #32
/*     */     //   104: goto -> 109
/*     */     //   107: bipush #16
/*     */     //   109: ior
/*     */     //   110: istore #9
/*     */     //   112: iload #7
/*     */     //   114: sipush #384
/*     */     //   117: iand
/*     */     //   118: ifne -> 153
/*     */     //   121: iload #9
/*     */     //   123: iload #8
/*     */     //   125: iconst_4
/*     */     //   126: iand
/*     */     //   127: ifne -> 147
/*     */     //   130: aload #6
/*     */     //   132: lload_3
/*     */     //   133: invokeinterface changed : (J)Z
/*     */     //   138: ifeq -> 147
/*     */     //   141: sipush #256
/*     */     //   144: goto -> 150
/*     */     //   147: sipush #128
/*     */     //   150: ior
/*     */     //   151: istore #9
/*     */     //   153: iload #8
/*     */     //   155: bipush #8
/*     */     //   157: iand
/*     */     //   158: ifeq -> 172
/*     */     //   161: iload #9
/*     */     //   163: sipush #3072
/*     */     //   166: ior
/*     */     //   167: istore #9
/*     */     //   169: goto -> 207
/*     */     //   172: iload #7
/*     */     //   174: sipush #3072
/*     */     //   177: iand
/*     */     //   178: ifne -> 207
/*     */     //   181: iload #9
/*     */     //   183: aload #6
/*     */     //   185: aload #5
/*     */     //   187: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   192: ifeq -> 201
/*     */     //   195: sipush #2048
/*     */     //   198: goto -> 204
/*     */     //   201: sipush #1024
/*     */     //   204: ior
/*     */     //   205: istore #9
/*     */     //   207: iload #9
/*     */     //   209: sipush #1171
/*     */     //   212: iand
/*     */     //   213: sipush #1170
/*     */     //   216: if_icmpne -> 229
/*     */     //   219: aload #6
/*     */     //   221: invokeinterface getSkipping : ()Z
/*     */     //   226: ifne -> 1172
/*     */     //   229: aload #6
/*     */     //   231: invokeinterface startDefaults : ()V
/*     */     //   236: iload #7
/*     */     //   238: iconst_1
/*     */     //   239: iand
/*     */     //   240: ifeq -> 253
/*     */     //   243: aload #6
/*     */     //   245: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   250: ifeq -> 305
/*     */     //   253: iload #8
/*     */     //   255: iconst_2
/*     */     //   256: iand
/*     */     //   257: ifeq -> 277
/*     */     //   260: aload #6
/*     */     //   262: iconst_0
/*     */     //   263: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   266: invokevirtual getChipBackground-0d7_KjU : ()J
/*     */     //   269: lstore_1
/*     */     //   270: iload #9
/*     */     //   272: bipush #-113
/*     */     //   274: iand
/*     */     //   275: istore #9
/*     */     //   277: iload #8
/*     */     //   279: iconst_4
/*     */     //   280: iand
/*     */     //   281: ifeq -> 341
/*     */     //   284: aload #6
/*     */     //   286: iconst_0
/*     */     //   287: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   290: invokevirtual getChipBackgroundHovered-0d7_KjU : ()J
/*     */     //   293: lstore_3
/*     */     //   294: iload #9
/*     */     //   296: sipush #-897
/*     */     //   299: iand
/*     */     //   300: istore #9
/*     */     //   302: goto -> 341
/*     */     //   305: aload #6
/*     */     //   307: invokeinterface skipToGroupEnd : ()V
/*     */     //   312: iload #8
/*     */     //   314: iconst_2
/*     */     //   315: iand
/*     */     //   316: ifeq -> 326
/*     */     //   319: iload #9
/*     */     //   321: bipush #-113
/*     */     //   323: iand
/*     */     //   324: istore #9
/*     */     //   326: iload #8
/*     */     //   328: iconst_4
/*     */     //   329: iand
/*     */     //   330: ifeq -> 341
/*     */     //   333: iload #9
/*     */     //   335: sipush #-897
/*     */     //   338: iand
/*     */     //   339: istore #9
/*     */     //   341: aload #6
/*     */     //   343: invokeinterface endDefaults : ()V
/*     */     //   348: invokestatic isTraceInProgress : ()Z
/*     */     //   351: ifeq -> 364
/*     */     //   354: ldc -1196947591
/*     */     //   356: iload #9
/*     */     //   358: iconst_m1
/*     */     //   359: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.JunieHoverableChip (JunieHoverableChip.kt:27)'
/*     */     //   361: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   364: aload #6
/*     */     //   366: ldc 1787880936
/*     */     //   368: invokeinterface startReplaceGroup : (I)V
/*     */     //   373: aload #6
/*     */     //   375: astore #12
/*     */     //   377: iconst_0
/*     */     //   378: istore #13
/*     */     //   380: nop
/*     */     //   381: iconst_0
/*     */     //   382: istore #14
/*     */     //   384: aload #12
/*     */     //   386: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   391: astore #15
/*     */     //   393: iconst_0
/*     */     //   394: istore #16
/*     */     //   396: aload #15
/*     */     //   398: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   401: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   404: if_acmpne -> 436
/*     */     //   407: iconst_0
/*     */     //   408: istore #17
/*     */     //   410: iconst_0
/*     */     //   411: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   414: aconst_null
/*     */     //   415: iconst_2
/*     */     //   416: aconst_null
/*     */     //   417: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   420: astore #17
/*     */     //   422: aload #12
/*     */     //   424: aload #17
/*     */     //   426: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   431: aload #17
/*     */     //   433: goto -> 438
/*     */     //   436: aload #15
/*     */     //   438: nop
/*     */     //   439: nop
/*     */     //   440: nop
/*     */     //   441: checkcast androidx/compose/runtime/MutableState
/*     */     //   444: astore #11
/*     */     //   446: aload #6
/*     */     //   448: invokeinterface endReplaceGroup : ()V
/*     */     //   453: aload #11
/*     */     //   455: astore #10
/*     */     //   457: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   460: checkcast androidx/compose/ui/Modifier
/*     */     //   463: fconst_0
/*     */     //   464: iconst_5
/*     */     //   465: istore #11
/*     */     //   467: iconst_0
/*     */     //   468: istore #12
/*     */     //   470: iload #11
/*     */     //   472: i2f
/*     */     //   473: invokestatic constructor-impl : (F)F
/*     */     //   476: iconst_1
/*     */     //   477: aconst_null
/*     */     //   478: invokestatic padding-VpY3zN4$default : (Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   481: bipush #10
/*     */     //   483: istore #11
/*     */     //   485: iconst_0
/*     */     //   486: istore #12
/*     */     //   488: iload #11
/*     */     //   490: i2f
/*     */     //   491: invokestatic constructor-impl : (F)F
/*     */     //   494: invokestatic RoundedCornerShape-0680j_4 : (F)Landroidx/compose/foundation/shape/RoundedCornerShape;
/*     */     //   497: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   500: invokestatic clip : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;
/*     */     //   503: aload #6
/*     */     //   505: ldc 1787885432
/*     */     //   507: invokeinterface startReplaceGroup : (I)V
/*     */     //   512: aload #6
/*     */     //   514: astore #12
/*     */     //   516: iconst_0
/*     */     //   517: istore #13
/*     */     //   519: nop
/*     */     //   520: iconst_0
/*     */     //   521: istore #14
/*     */     //   523: aload #12
/*     */     //   525: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   530: astore #15
/*     */     //   532: iconst_0
/*     */     //   533: istore #16
/*     */     //   535: aload #15
/*     */     //   537: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   540: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   543: if_acmpne -> 577
/*     */     //   546: astore #34
/*     */     //   548: iconst_0
/*     */     //   549: istore #17
/*     */     //   551: aload #10
/*     */     //   553: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */     //   558: aload #34
/*     */     //   560: swap
/*     */     //   561: astore #18
/*     */     //   563: aload #12
/*     */     //   565: aload #18
/*     */     //   567: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   572: aload #18
/*     */     //   574: goto -> 579
/*     */     //   577: aload #15
/*     */     //   579: nop
/*     */     //   580: nop
/*     */     //   581: nop
/*     */     //   582: checkcast kotlin/jvm/functions/Function1
/*     */     //   585: astore #11
/*     */     //   587: aload #6
/*     */     //   589: invokeinterface endReplaceGroup : ()V
/*     */     //   594: aload #11
/*     */     //   596: invokestatic onHover : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   599: aload #10
/*     */     //   601: invokestatic JunieHoverableChip_eopBjH0$lambda$1 : (Landroidx/compose/runtime/MutableState;)Z
/*     */     //   604: ifne -> 611
/*     */     //   607: lload_1
/*     */     //   608: goto -> 612
/*     */     //   611: lload_3
/*     */     //   612: aconst_null
/*     */     //   613: iconst_2
/*     */     //   614: aconst_null
/*     */     //   615: invokestatic background-bw27NRU$default : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   618: iconst_4
/*     */     //   619: istore #11
/*     */     //   621: iconst_0
/*     */     //   622: istore #12
/*     */     //   624: iload #11
/*     */     //   626: i2f
/*     */     //   627: invokestatic constructor-impl : (F)F
/*     */     //   630: fconst_0
/*     */     //   631: iconst_2
/*     */     //   632: aconst_null
/*     */     //   633: invokestatic padding-VpY3zN4$default : (Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   636: iconst_0
/*     */     //   637: aconst_null
/*     */     //   638: aconst_null
/*     */     //   639: aload #6
/*     */     //   641: ldc 1787890195
/*     */     //   643: invokeinterface startReplaceGroup : (I)V
/*     */     //   648: aload #6
/*     */     //   650: astore #12
/*     */     //   652: iload #9
/*     */     //   654: bipush #14
/*     */     //   656: iand
/*     */     //   657: iconst_4
/*     */     //   658: if_icmpne -> 665
/*     */     //   661: iconst_1
/*     */     //   662: goto -> 666
/*     */     //   665: iconst_0
/*     */     //   666: istore #13
/*     */     //   668: iconst_0
/*     */     //   669: istore #14
/*     */     //   671: aload #12
/*     */     //   673: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   678: astore #15
/*     */     //   680: iconst_0
/*     */     //   681: istore #16
/*     */     //   683: iload #13
/*     */     //   685: ifne -> 699
/*     */     //   688: aload #15
/*     */     //   690: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   693: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   696: if_acmpne -> 744
/*     */     //   699: astore #37
/*     */     //   701: astore #36
/*     */     //   703: istore #35
/*     */     //   705: astore #34
/*     */     //   707: iconst_0
/*     */     //   708: istore #17
/*     */     //   710: aload_0
/*     */     //   711: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function0;
/*     */     //   716: astore #38
/*     */     //   718: aload #34
/*     */     //   720: iload #35
/*     */     //   722: aload #36
/*     */     //   724: aload #37
/*     */     //   726: aload #38
/*     */     //   728: astore #18
/*     */     //   730: aload #12
/*     */     //   732: aload #18
/*     */     //   734: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   739: aload #18
/*     */     //   741: goto -> 746
/*     */     //   744: aload #15
/*     */     //   746: nop
/*     */     //   747: nop
/*     */     //   748: nop
/*     */     //   749: checkcast kotlin/jvm/functions/Function0
/*     */     //   752: astore #11
/*     */     //   754: aload #6
/*     */     //   756: invokeinterface endReplaceGroup : ()V
/*     */     //   761: aload #11
/*     */     //   763: bipush #7
/*     */     //   765: aconst_null
/*     */     //   766: invokestatic clickable-XHw0xAI$default : (Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   769: astore #11
/*     */     //   771: sipush #7168
/*     */     //   774: iload #9
/*     */     //   776: iand
/*     */     //   777: istore #14
/*     */     //   779: nop
/*     */     //   780: iconst_0
/*     */     //   781: istore #15
/*     */     //   783: aload #6
/*     */     //   785: ldc 733328855
/*     */     //   787: ldc 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   789: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   792: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   795: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */     //   798: astore #12
/*     */     //   800: iconst_0
/*     */     //   801: istore #13
/*     */     //   803: aload #12
/*     */     //   805: iload #13
/*     */     //   807: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   810: astore #16
/*     */     //   812: bipush #112
/*     */     //   814: iload #14
/*     */     //   816: iconst_3
/*     */     //   817: ishl
/*     */     //   818: iand
/*     */     //   819: istore #17
/*     */     //   821: nop
/*     */     //   822: iconst_0
/*     */     //   823: istore #18
/*     */     //   825: aload #6
/*     */     //   827: ldc -1323940314
/*     */     //   829: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   831: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   834: aload #6
/*     */     //   836: iconst_0
/*     */     //   837: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   840: istore #19
/*     */     //   842: aload #6
/*     */     //   844: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   849: astore #20
/*     */     //   851: aload #6
/*     */     //   853: aload #11
/*     */     //   855: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   858: astore #21
/*     */     //   860: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   863: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   866: astore #22
/*     */     //   868: bipush #6
/*     */     //   870: sipush #896
/*     */     //   873: iload #17
/*     */     //   875: bipush #6
/*     */     //   877: ishl
/*     */     //   878: iand
/*     */     //   879: ior
/*     */     //   880: istore #23
/*     */     //   882: nop
/*     */     //   883: iconst_0
/*     */     //   884: istore #24
/*     */     //   886: aload #6
/*     */     //   888: ldc_w -692256719
/*     */     //   891: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   894: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   897: aload #6
/*     */     //   899: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   904: instanceof androidx/compose/runtime/Applier
/*     */     //   907: ifne -> 913
/*     */     //   910: invokestatic invalidApplier : ()V
/*     */     //   913: aload #6
/*     */     //   915: invokeinterface startReusableNode : ()V
/*     */     //   920: aload #6
/*     */     //   922: invokeinterface getInserting : ()Z
/*     */     //   927: ifeq -> 942
/*     */     //   930: aload #6
/*     */     //   932: aload #22
/*     */     //   934: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   939: goto -> 949
/*     */     //   942: aload #6
/*     */     //   944: invokeinterface useNode : ()V
/*     */     //   949: aload #6
/*     */     //   951: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   954: astore #25
/*     */     //   956: iconst_0
/*     */     //   957: istore #26
/*     */     //   959: aload #25
/*     */     //   961: aload #16
/*     */     //   963: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   966: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   969: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   972: aload #25
/*     */     //   974: aload #20
/*     */     //   976: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   979: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   982: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   985: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   988: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   991: astore #27
/*     */     //   993: iconst_0
/*     */     //   994: istore #28
/*     */     //   996: aload #25
/*     */     //   998: astore #29
/*     */     //   1000: iconst_0
/*     */     //   1001: istore #30
/*     */     //   1003: aload #29
/*     */     //   1005: invokeinterface getInserting : ()Z
/*     */     //   1010: ifne -> 1031
/*     */     //   1013: aload #29
/*     */     //   1015: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1020: iload #19
/*     */     //   1022: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1025: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1028: ifne -> 1057
/*     */     //   1031: aload #29
/*     */     //   1033: iload #19
/*     */     //   1035: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1038: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1043: aload #25
/*     */     //   1045: iload #19
/*     */     //   1047: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1050: aload #27
/*     */     //   1052: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1057: nop
/*     */     //   1058: nop
/*     */     //   1059: nop
/*     */     //   1060: aload #25
/*     */     //   1062: aload #21
/*     */     //   1064: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1067: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1070: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1073: nop
/*     */     //   1074: nop
/*     */     //   1075: aload #6
/*     */     //   1077: bipush #14
/*     */     //   1079: iload #23
/*     */     //   1081: bipush #6
/*     */     //   1083: ishr
/*     */     //   1084: iand
/*     */     //   1085: istore #31
/*     */     //   1087: astore #32
/*     */     //   1089: iconst_0
/*     */     //   1090: istore #33
/*     */     //   1092: aload #32
/*     */     //   1094: ldc_w -2146769399
/*     */     //   1097: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   1100: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1103: aload #5
/*     */     //   1105: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   1108: aload #32
/*     */     //   1110: bipush #6
/*     */     //   1112: bipush #112
/*     */     //   1114: iload #14
/*     */     //   1116: bipush #6
/*     */     //   1118: ishr
/*     */     //   1119: iand
/*     */     //   1120: ior
/*     */     //   1121: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1124: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   1129: pop
/*     */     //   1130: aload #32
/*     */     //   1132: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1135: aload #6
/*     */     //   1137: invokeinterface endNode : ()V
/*     */     //   1142: aload #6
/*     */     //   1144: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1147: nop
/*     */     //   1148: aload #6
/*     */     //   1150: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1153: nop
/*     */     //   1154: aload #6
/*     */     //   1156: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1159: nop
/*     */     //   1160: invokestatic isTraceInProgress : ()Z
/*     */     //   1163: ifeq -> 1179
/*     */     //   1166: invokestatic traceEventEnd : ()V
/*     */     //   1169: goto -> 1179
/*     */     //   1172: aload #6
/*     */     //   1174: invokeinterface skipToGroupEnd : ()V
/*     */     //   1179: aload #6
/*     */     //   1181: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1186: dup
/*     */     //   1187: ifnull -> 1212
/*     */     //   1190: aload_0
/*     */     //   1191: lload_1
/*     */     //   1192: lload_3
/*     */     //   1193: aload #5
/*     */     //   1195: iload #7
/*     */     //   1197: iload #8
/*     */     //   1199: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function0;JJLkotlin/jvm/functions/Function3;II)Lkotlin/jvm/functions/Function2;
/*     */     //   1204: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1209: goto -> 1213
/*     */     //   1212: pop
/*     */     //   1213: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #28	-> 13
/*     */     //   #25	-> 260
/*     */     //   #26	-> 284
/*     */     //   #28	-> 361
/*     */     //   #29	-> 380
/*     */     //   #41	-> 384
/*     */     //   #42	-> 396
/*     */     //   #43	-> 407
/*     */     //   #29	-> 410
/*     */     //   #43	-> 420
/*     */     //   #44	-> 422
/*     */     //   #45	-> 431
/*     */     //   #46	-> 436
/*     */     //   #42	-> 438
/*     */     //   #41	-> 439
/*     */     //   #41	-> 440
/*     */     //   #29	-> 441
/*     */     //   #31	-> 457
/*     */     //   #32	-> 463
/*     */     //   #47	-> 470
/*     */     //   #32	-> 476
/*     */     //   #33	-> 481
/*     */     //   #48	-> 488
/*     */     //   #33	-> 494
/*     */     //   #34	-> 519
/*     */     //   #49	-> 523
/*     */     //   #50	-> 535
/*     */     //   #51	-> 546
/*     */     //   #34	-> 551
/*     */     //   #51	-> 561
/*     */     //   #52	-> 563
/*     */     //   #53	-> 572
/*     */     //   #54	-> 577
/*     */     //   #50	-> 579
/*     */     //   #49	-> 580
/*     */     //   #49	-> 581
/*     */     //   #34	-> 582
/*     */     //   #35	-> 599
/*     */     //   #36	-> 618
/*     */     //   #55	-> 624
/*     */     //   #36	-> 630
/*     */     //   #37	-> 636
/*     */     //   #56	-> 671
/*     */     //   #57	-> 683
/*     */     //   #58	-> 699
/*     */     //   #37	-> 710
/*     */     //   #58	-> 728
/*     */     //   #59	-> 730
/*     */     //   #60	-> 739
/*     */     //   #61	-> 744
/*     */     //   #57	-> 746
/*     */     //   #56	-> 747
/*     */     //   #56	-> 748
/*     */     //   #37	-> 749
/*     */     //   #30	-> 779
/*     */     //   #62	-> 789
/*     */     //   #63	-> 792
/*     */     //   #64	-> 800
/*     */     //   #67	-> 803
/*     */     //   #68	-> 821
/*     */     //   #69	-> 831
/*     */     //   #70	-> 837
/*     */     //   #71	-> 844
/*     */     //   #72	-> 853
/*     */     //   #74	-> 860
/*     */     //   #73	-> 882
/*     */     //   #75	-> 894
/*     */     //   #76	-> 897
/*     */     //   #77	-> 915
/*     */     //   #78	-> 920
/*     */     //   #79	-> 932
/*     */     //   #81	-> 944
/*     */     //   #83	-> 949
/*     */     //   #84	-> 959
/*     */     //   #85	-> 972
/*     */     //   #87	-> 985
/*     */     //   #88	-> 996
/*     */     //   #89	-> 1003
/*     */     //   #90	-> 1031
/*     */     //   #91	-> 1043
/*     */     //   #93	-> 1057
/*     */     //   #88	-> 1058
/*     */     //   #93	-> 1059
/*     */     //   #94	-> 1060
/*     */     //   #95	-> 1073
/*     */     //   #83	-> 1074
/*     */     //   #96	-> 1075
/*     */     //   #97	-> 1100
/*     */     //   #96	-> 1135
/*     */     //   #98	-> 1137
/*     */     //   #75	-> 1144
/*     */     //   #99	-> 1147
/*     */     //   #69	-> 1150
/*     */     //   #100	-> 1153
/*     */     //   #62	-> 1156
/*     */     //   #101	-> 1159
/*     */     //   #40	-> 1172
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   410	10	17	$i$a$-cache-JunieHoverableChipKt$JunieHoverableChip$isHovered$2	I
/*     */     //   422	11	17	value$iv	Ljava/lang/Object;
/*     */     //   396	43	16	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   393	46	15	it$iv	Ljava/lang/Object;
/*     */     //   384	57	14	$i$f$cache	I
/*     */     //   381	60	12	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   381	60	13	invalid$iv	Z
/*     */     //   470	6	12	$i$f$getDp	I
/*     */     //   467	9	11	$this$dp$iv	I
/*     */     //   488	6	12	$i$f$getDp	I
/*     */     //   485	9	11	$this$dp$iv	I
/*     */     //   551	7	17	$i$a$-cache-JunieHoverableChipKt$JunieHoverableChip$1	I
/*     */     //   563	11	18	value$iv	Ljava/lang/Object;
/*     */     //   535	45	16	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   532	48	15	it$iv	Ljava/lang/Object;
/*     */     //   523	59	14	$i$f$cache	I
/*     */     //   520	62	12	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   520	62	13	invalid$iv	Z
/*     */     //   624	6	12	$i$f$getDp	I
/*     */     //   621	9	11	$this$dp$iv	I
/*     */     //   710	6	17	$i$a$-cache-JunieHoverableChipKt$JunieHoverableChip$2	I
/*     */     //   730	11	18	value$iv	Ljava/lang/Object;
/*     */     //   683	64	16	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   680	67	15	it$iv	Ljava/lang/Object;
/*     */     //   671	78	14	$i$f$cache	I
/*     */     //   668	81	12	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   668	81	13	invalid$iv	Z
/*     */     //   1092	43	33	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   1089	46	32	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1089	46	31	$changed$iv	I
/*     */     //   1003	55	30	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   1000	58	29	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   996	64	28	$i$f$set-impl	I
/*     */     //   993	67	27	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   959	115	26	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   956	118	25	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   886	262	24	$i$f$ReusableComposeNode	I
/*     */     //   883	265	22	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   883	265	23	$changed$iv$iv$iv	I
/*     */     //   825	329	18	$i$f$Layout	I
/*     */     //   842	312	19	compositeKeyHash$iv$iv	I
/*     */     //   851	303	20	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   860	294	21	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   822	332	17	$changed$iv$iv	I
/*     */     //   783	377	15	$i$f$Box	I
/*     */     //   812	348	16	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   780	380	11	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   800	360	12	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   803	357	13	propagateMinConstraints$iv	Z
/*     */     //   780	380	14	$changed$iv	I
/*     */     //   457	712	10	isHovered$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   28	1186	9	$dirty	I
/*     */     //   0	1214	0	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	1214	1	backgroundColor	J
/*     */     //   0	1214	3	backgroundHoveredColor	J
/*     */     //   0	1214	5	content	Lkotlin/jvm/functions/Function3;
/*     */     //   0	1214	6	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1214	7	$changed	I
/*     */   }
/*     */   
/*     */   private static final boolean JunieHoverableChip_eopBjH0$lambda$1(MutableState $isHovered$delegate) {
/*  29 */     State state = (State)$isHovered$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 102 */       (Boolean)state.getValue()).booleanValue(); } private static final void JunieHoverableChip_eopBjH0$lambda$2(MutableState $isHovered$delegate, boolean <set-?>) { MutableState mutableState = $isHovered$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 103 */     mutableState.setValue(value$iv); }
/*     */ 
/*     */   
/*     */   private static final Unit JunieHoverableChip_eopBjH0$lambda$4$lambda$3(MutableState<Boolean> $isHovered$delegate, boolean it) {
/*     */     JunieHoverableChip_eopBjH0$lambda$2($isHovered$delegate, it);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit JunieHoverableChip_eopBjH0$lambda$6$lambda$5(Function0 $onClick) {
/*     */     $onClick.invoke();
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit JunieHoverableChip_eopBjH0$lambda$7(Function0<Unit> $onClick, long $backgroundColor, long $backgroundHoveredColor, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> $content, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     JunieHoverableChip-eopBjH0($onClick, $backgroundColor, $backgroundHoveredColor, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\JunieHoverableChipKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */