/*    */ package org.jetbrains.jewel.ui.component;
/*    */ 
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*    */ import androidx.compose.ui.Modifier;
/*    */ import androidx.compose.ui.semantics.SemanticsPropertiesKt;
/*    */ import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.jewel.ui.component.styling.SimpleListItemStyle;
/*    */ import org.jetbrains.jewel.ui.icon.IconKey;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000.\n\000\n\002\020\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\032U\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\0132\n\b\002\020\f\032\004\030\0010\r2\n\b\002\020\016\032\004\030\0010\003H\007¢\006\004\b\017\020\020¨\006\021"}, d2 = {"SimpleListItem", "", "text", "", "state", "Lorg/jetbrains/jewel/ui/component/ListItemState;", "modifier", "Landroidx/compose/ui/Modifier;", "style", "Lorg/jetbrains/jewel/ui/component/styling/SimpleListItemStyle;", "height", "Landroidx/compose/ui/unit/Dp;", "icon", "Lorg/jetbrains/jewel/ui/icon/IconKey;", "contentDescription", "SimpleListItem-iHT-50w", "(Ljava/lang/String;Lorg/jetbrains/jewel/ui/component/ListItemState;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/SimpleListItemStyle;FLorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "ui"})
/*    */ @SourceDebugExtension({"SMAP\nSimpleListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleListItem.kt\norg/jetbrains/jewel/ui/component/SimpleListItemKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,66:1\n1225#2,6:67\n99#3:73\n96#3,6:74\n102#3:108\n106#3:113\n79#4,6:80\n86#4,4:95\n90#4,2:105\n94#4:112\n368#5,9:86\n377#5:107\n378#5,2:110\n4034#6,6:99\n149#7:109\n*S KotlinDebug\n*F\n+ 1 SimpleListItem.kt\norg/jetbrains/jewel/ui/component/SimpleListItemKt\n*L\n46#1:67,6\n42#1:73\n42#1:74,6\n42#1:108\n42#1:113\n42#1:80,6\n42#1:95,4\n42#1:105,2\n42#1:112\n42#1:86,9\n42#1:107\n42#1:110,2\n42#1:99,6\n54#1:109\n*E\n"})
/*    */ public final class SimpleListItemKt
/*    */ {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public static final void SimpleListItem-iHT-50w(@NotNull String text, @NotNull ListItemState state, @Nullable Modifier modifier, @Nullable SimpleListItemStyle style, float height, @Nullable IconKey icon, @Nullable String contentDescription, @Nullable Composer $composer, int $changed, int paramInt1) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ldc 'text'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_1
/*    */     //   7: ldc 'state'
/*    */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   12: aload #7
/*    */     //   14: ldc -1066520181
/*    */     //   16: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*    */     //   21: astore #7
/*    */     //   23: iload #8
/*    */     //   25: istore #10
/*    */     //   27: iload #9
/*    */     //   29: iconst_1
/*    */     //   30: iand
/*    */     //   31: ifeq -> 44
/*    */     //   34: iload #10
/*    */     //   36: bipush #6
/*    */     //   38: ior
/*    */     //   39: istore #10
/*    */     //   41: goto -> 73
/*    */     //   44: iload #8
/*    */     //   46: bipush #6
/*    */     //   48: iand
/*    */     //   49: ifne -> 73
/*    */     //   52: iload #10
/*    */     //   54: aload #7
/*    */     //   56: aload_0
/*    */     //   57: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   62: ifeq -> 69
/*    */     //   65: iconst_4
/*    */     //   66: goto -> 70
/*    */     //   69: iconst_2
/*    */     //   70: ior
/*    */     //   71: istore #10
/*    */     //   73: iload #9
/*    */     //   75: iconst_2
/*    */     //   76: iand
/*    */     //   77: ifeq -> 90
/*    */     //   80: iload #10
/*    */     //   82: bipush #48
/*    */     //   84: ior
/*    */     //   85: istore #10
/*    */     //   87: goto -> 121
/*    */     //   90: iload #8
/*    */     //   92: bipush #48
/*    */     //   94: iand
/*    */     //   95: ifne -> 121
/*    */     //   98: iload #10
/*    */     //   100: aload #7
/*    */     //   102: aload_1
/*    */     //   103: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   108: ifeq -> 116
/*    */     //   111: bipush #32
/*    */     //   113: goto -> 118
/*    */     //   116: bipush #16
/*    */     //   118: ior
/*    */     //   119: istore #10
/*    */     //   121: iload #9
/*    */     //   123: iconst_4
/*    */     //   124: iand
/*    */     //   125: ifeq -> 139
/*    */     //   128: iload #10
/*    */     //   130: sipush #384
/*    */     //   133: ior
/*    */     //   134: istore #10
/*    */     //   136: goto -> 173
/*    */     //   139: iload #8
/*    */     //   141: sipush #384
/*    */     //   144: iand
/*    */     //   145: ifne -> 173
/*    */     //   148: iload #10
/*    */     //   150: aload #7
/*    */     //   152: aload_2
/*    */     //   153: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   158: ifeq -> 167
/*    */     //   161: sipush #256
/*    */     //   164: goto -> 170
/*    */     //   167: sipush #128
/*    */     //   170: ior
/*    */     //   171: istore #10
/*    */     //   173: iload #8
/*    */     //   175: sipush #3072
/*    */     //   178: iand
/*    */     //   179: ifne -> 215
/*    */     //   182: iload #10
/*    */     //   184: iload #9
/*    */     //   186: bipush #8
/*    */     //   188: iand
/*    */     //   189: ifne -> 209
/*    */     //   192: aload #7
/*    */     //   194: aload_3
/*    */     //   195: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   200: ifeq -> 209
/*    */     //   203: sipush #2048
/*    */     //   206: goto -> 212
/*    */     //   209: sipush #1024
/*    */     //   212: ior
/*    */     //   213: istore #10
/*    */     //   215: iload #8
/*    */     //   217: sipush #24576
/*    */     //   220: iand
/*    */     //   221: ifne -> 258
/*    */     //   224: iload #10
/*    */     //   226: iload #9
/*    */     //   228: bipush #16
/*    */     //   230: iand
/*    */     //   231: ifne -> 252
/*    */     //   234: aload #7
/*    */     //   236: fload #4
/*    */     //   238: invokeinterface changed : (F)Z
/*    */     //   243: ifeq -> 252
/*    */     //   246: sipush #16384
/*    */     //   249: goto -> 255
/*    */     //   252: sipush #8192
/*    */     //   255: ior
/*    */     //   256: istore #10
/*    */     //   258: iload #9
/*    */     //   260: bipush #32
/*    */     //   262: iand
/*    */     //   263: ifeq -> 276
/*    */     //   266: iload #10
/*    */     //   268: ldc 196608
/*    */     //   270: ior
/*    */     //   271: istore #10
/*    */     //   273: goto -> 328
/*    */     //   276: iload #8
/*    */     //   278: ldc 196608
/*    */     //   280: iand
/*    */     //   281: ifne -> 328
/*    */     //   284: iload #10
/*    */     //   286: iload #8
/*    */     //   288: ldc 262144
/*    */     //   290: iand
/*    */     //   291: ifne -> 306
/*    */     //   294: aload #7
/*    */     //   296: aload #5
/*    */     //   298: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   303: goto -> 315
/*    */     //   306: aload #7
/*    */     //   308: aload #5
/*    */     //   310: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   315: ifeq -> 323
/*    */     //   318: ldc 131072
/*    */     //   320: goto -> 325
/*    */     //   323: ldc 65536
/*    */     //   325: ior
/*    */     //   326: istore #10
/*    */     //   328: iload #9
/*    */     //   330: bipush #64
/*    */     //   332: iand
/*    */     //   333: ifeq -> 346
/*    */     //   336: iload #10
/*    */     //   338: ldc 1572864
/*    */     //   340: ior
/*    */     //   341: istore #10
/*    */     //   343: goto -> 378
/*    */     //   346: iload #8
/*    */     //   348: ldc 1572864
/*    */     //   350: iand
/*    */     //   351: ifne -> 378
/*    */     //   354: iload #10
/*    */     //   356: aload #7
/*    */     //   358: aload #6
/*    */     //   360: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   365: ifeq -> 373
/*    */     //   368: ldc 1048576
/*    */     //   370: goto -> 375
/*    */     //   373: ldc 524288
/*    */     //   375: ior
/*    */     //   376: istore #10
/*    */     //   378: iload #10
/*    */     //   380: ldc 599187
/*    */     //   382: iand
/*    */     //   383: ldc 599186
/*    */     //   385: if_icmpne -> 398
/*    */     //   388: aload #7
/*    */     //   390: invokeinterface getSkipping : ()Z
/*    */     //   395: ifne -> 1375
/*    */     //   398: aload #7
/*    */     //   400: invokeinterface startDefaults : ()V
/*    */     //   405: iload #8
/*    */     //   407: iconst_1
/*    */     //   408: iand
/*    */     //   409: ifeq -> 422
/*    */     //   412: aload #7
/*    */     //   414: invokeinterface getDefaultsInvalid : ()Z
/*    */     //   419: ifeq -> 518
/*    */     //   422: iload #9
/*    */     //   424: iconst_4
/*    */     //   425: iand
/*    */     //   426: ifeq -> 436
/*    */     //   429: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   432: checkcast androidx/compose/ui/Modifier
/*    */     //   435: astore_2
/*    */     //   436: iload #9
/*    */     //   438: bipush #8
/*    */     //   440: iand
/*    */     //   441: ifeq -> 463
/*    */     //   444: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*    */     //   447: aload #7
/*    */     //   449: bipush #6
/*    */     //   451: invokestatic getSimpleListItemStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/SimpleListItemStyle;
/*    */     //   454: astore_3
/*    */     //   455: iload #10
/*    */     //   457: sipush #-7169
/*    */     //   460: iand
/*    */     //   461: istore #10
/*    */     //   463: iload #9
/*    */     //   465: bipush #16
/*    */     //   467: iand
/*    */     //   468: ifeq -> 493
/*    */     //   471: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*    */     //   474: aload #7
/*    */     //   476: bipush #6
/*    */     //   478: invokevirtual getGlobalMetrics : (Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/foundation/GlobalMetrics;
/*    */     //   481: invokevirtual getRowHeight-D9Ej5fM : ()F
/*    */     //   484: fstore #4
/*    */     //   486: iload #10
/*    */     //   488: ldc -57345
/*    */     //   490: iand
/*    */     //   491: istore #10
/*    */     //   493: iload #9
/*    */     //   495: bipush #32
/*    */     //   497: iand
/*    */     //   498: ifeq -> 504
/*    */     //   501: aconst_null
/*    */     //   502: astore #5
/*    */     //   504: iload #9
/*    */     //   506: bipush #64
/*    */     //   508: iand
/*    */     //   509: ifeq -> 556
/*    */     //   512: aconst_null
/*    */     //   513: astore #6
/*    */     //   515: goto -> 556
/*    */     //   518: aload #7
/*    */     //   520: invokeinterface skipToGroupEnd : ()V
/*    */     //   525: iload #9
/*    */     //   527: bipush #8
/*    */     //   529: iand
/*    */     //   530: ifeq -> 541
/*    */     //   533: iload #10
/*    */     //   535: sipush #-7169
/*    */     //   538: iand
/*    */     //   539: istore #10
/*    */     //   541: iload #9
/*    */     //   543: bipush #16
/*    */     //   545: iand
/*    */     //   546: ifeq -> 556
/*    */     //   549: iload #10
/*    */     //   551: ldc -57345
/*    */     //   553: iand
/*    */     //   554: istore #10
/*    */     //   556: aload #7
/*    */     //   558: invokeinterface endDefaults : ()V
/*    */     //   563: invokestatic isTraceInProgress : ()Z
/*    */     //   566: ifeq -> 579
/*    */     //   569: ldc -1066520181
/*    */     //   571: iload #10
/*    */     //   573: iconst_m1
/*    */     //   574: ldc 'org.jetbrains.jewel.ui.component.SimpleListItem (SimpleListItem.kt:33)'
/*    */     //   576: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   579: nop
/*    */     //   580: aload_1
/*    */     //   581: invokevirtual getPreviewSelection : ()Z
/*    */     //   584: ifeq -> 604
/*    */     //   587: aload_1
/*    */     //   588: invokevirtual isHovered : ()Z
/*    */     //   591: ifeq -> 604
/*    */     //   594: aload_3
/*    */     //   595: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/SimpleListItemColors;
/*    */     //   598: invokevirtual getBackgroundSelectedFocused-0d7_KjU : ()J
/*    */     //   601: goto -> 634
/*    */     //   604: aload_1
/*    */     //   605: invokevirtual isSelected : ()Z
/*    */     //   608: ifeq -> 628
/*    */     //   611: aload_1
/*    */     //   612: invokevirtual getPreviewSelection : ()Z
/*    */     //   615: ifne -> 628
/*    */     //   618: aload_3
/*    */     //   619: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/SimpleListItemColors;
/*    */     //   622: invokevirtual getBackgroundSelectedFocused-0d7_KjU : ()J
/*    */     //   625: goto -> 634
/*    */     //   628: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
/*    */     //   631: invokevirtual getTransparent-0d7_KjU : ()J
/*    */     //   634: lstore #11
/*    */     //   636: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*    */     //   639: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*    */     //   642: astore #13
/*    */     //   644: aload_2
/*    */     //   645: iconst_0
/*    */     //   646: aload #7
/*    */     //   648: ldc 153807136
/*    */     //   650: invokeinterface startReplaceGroup : (I)V
/*    */     //   655: aload #7
/*    */     //   657: astore #16
/*    */     //   659: iload #10
/*    */     //   661: bipush #112
/*    */     //   663: iand
/*    */     //   664: bipush #32
/*    */     //   666: if_icmpne -> 673
/*    */     //   669: iconst_1
/*    */     //   670: goto -> 674
/*    */     //   673: iconst_0
/*    */     //   674: istore #17
/*    */     //   676: iconst_0
/*    */     //   677: istore #18
/*    */     //   679: aload #16
/*    */     //   681: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   686: astore #19
/*    */     //   688: iconst_0
/*    */     //   689: istore #20
/*    */     //   691: iload #17
/*    */     //   693: ifne -> 707
/*    */     //   696: aload #19
/*    */     //   698: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   701: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   704: if_acmpne -> 744
/*    */     //   707: istore #44
/*    */     //   709: astore #43
/*    */     //   711: iconst_0
/*    */     //   712: istore #21
/*    */     //   714: aload_1
/*    */     //   715: <illegal opcode> invoke : (Lorg/jetbrains/jewel/ui/component/ListItemState;)Lkotlin/jvm/functions/Function1;
/*    */     //   720: astore #45
/*    */     //   722: aload #43
/*    */     //   724: iload #44
/*    */     //   726: aload #45
/*    */     //   728: astore #22
/*    */     //   730: aload #16
/*    */     //   732: aload #22
/*    */     //   734: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   739: aload #22
/*    */     //   741: goto -> 746
/*    */     //   744: aload #19
/*    */     //   746: nop
/*    */     //   747: nop
/*    */     //   748: nop
/*    */     //   749: checkcast kotlin/jvm/functions/Function1
/*    */     //   752: astore #15
/*    */     //   754: aload #7
/*    */     //   756: invokeinterface endReplaceGroup : ()V
/*    */     //   761: aload #15
/*    */     //   763: iconst_1
/*    */     //   764: aconst_null
/*    */     //   765: invokestatic semantics$default : (Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*    */     //   768: fconst_0
/*    */     //   769: iconst_1
/*    */     //   770: aconst_null
/*    */     //   771: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*    */     //   774: fload #4
/*    */     //   776: invokestatic height-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*    */     //   779: aload_3
/*    */     //   780: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/SimpleListItemMetrics;
/*    */     //   783: invokevirtual getOuterPadding : ()Landroidx/compose/foundation/layout/PaddingValues;
/*    */     //   786: invokestatic padding : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;
/*    */     //   789: lload #11
/*    */     //   791: aload_3
/*    */     //   792: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/SimpleListItemMetrics;
/*    */     //   795: invokevirtual getSelectionBackgroundCornerSize : ()Landroidx/compose/foundation/shape/CornerSize;
/*    */     //   798: invokestatic RoundedCornerShape : (Landroidx/compose/foundation/shape/CornerSize;)Landroidx/compose/foundation/shape/RoundedCornerShape;
/*    */     //   801: checkcast androidx/compose/ui/graphics/Shape
/*    */     //   804: invokestatic background-bw27NRU : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;
/*    */     //   807: aload_3
/*    */     //   808: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/SimpleListItemMetrics;
/*    */     //   811: invokevirtual getInnerPadding : ()Landroidx/compose/foundation/layout/PaddingValues;
/*    */     //   814: invokestatic padding : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;
/*    */     //   817: astore #14
/*    */     //   819: sipush #384
/*    */     //   822: istore #16
/*    */     //   824: nop
/*    */     //   825: iconst_0
/*    */     //   826: istore #17
/*    */     //   828: aload #7
/*    */     //   830: ldc 693286680
/*    */     //   832: ldc 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*    */     //   834: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   837: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*    */     //   840: invokevirtual getStart : ()Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*    */     //   843: astore #15
/*    */     //   845: aload #15
/*    */     //   847: aload #13
/*    */     //   849: aload #7
/*    */     //   851: bipush #14
/*    */     //   853: iload #16
/*    */     //   855: iconst_3
/*    */     //   856: ishr
/*    */     //   857: iand
/*    */     //   858: bipush #112
/*    */     //   860: iload #16
/*    */     //   862: iconst_3
/*    */     //   863: ishr
/*    */     //   864: iand
/*    */     //   865: ior
/*    */     //   866: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   869: astore #18
/*    */     //   871: bipush #112
/*    */     //   873: iload #16
/*    */     //   875: iconst_3
/*    */     //   876: ishl
/*    */     //   877: iand
/*    */     //   878: istore #19
/*    */     //   880: nop
/*    */     //   881: iconst_0
/*    */     //   882: istore #20
/*    */     //   884: aload #7
/*    */     //   886: ldc_w -1323940314
/*    */     //   889: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*    */     //   892: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   895: aload #7
/*    */     //   897: iconst_0
/*    */     //   898: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*    */     //   901: istore #21
/*    */     //   903: aload #7
/*    */     //   905: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   910: astore #22
/*    */     //   912: aload #7
/*    */     //   914: aload #14
/*    */     //   916: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*    */     //   919: astore #23
/*    */     //   921: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   924: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*    */     //   927: astore #24
/*    */     //   929: bipush #6
/*    */     //   931: sipush #896
/*    */     //   934: iload #19
/*    */     //   936: bipush #6
/*    */     //   938: ishl
/*    */     //   939: iand
/*    */     //   940: ior
/*    */     //   941: istore #25
/*    */     //   943: nop
/*    */     //   944: iconst_0
/*    */     //   945: istore #26
/*    */     //   947: aload #7
/*    */     //   949: ldc_w -692256719
/*    */     //   952: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*    */     //   955: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   958: aload #7
/*    */     //   960: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*    */     //   965: instanceof androidx/compose/runtime/Applier
/*    */     //   968: ifne -> 974
/*    */     //   971: invokestatic invalidApplier : ()V
/*    */     //   974: aload #7
/*    */     //   976: invokeinterface startReusableNode : ()V
/*    */     //   981: aload #7
/*    */     //   983: invokeinterface getInserting : ()Z
/*    */     //   988: ifeq -> 1003
/*    */     //   991: aload #7
/*    */     //   993: aload #24
/*    */     //   995: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*    */     //   1000: goto -> 1010
/*    */     //   1003: aload #7
/*    */     //   1005: invokeinterface useNode : ()V
/*    */     //   1010: aload #7
/*    */     //   1012: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*    */     //   1015: astore #27
/*    */     //   1017: iconst_0
/*    */     //   1018: istore #28
/*    */     //   1020: aload #27
/*    */     //   1022: aload #18
/*    */     //   1024: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   1027: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*    */     //   1030: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   1033: aload #27
/*    */     //   1035: aload #22
/*    */     //   1037: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   1040: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*    */     //   1043: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   1046: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   1049: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*    */     //   1052: astore #29
/*    */     //   1054: iconst_0
/*    */     //   1055: istore #30
/*    */     //   1057: aload #27
/*    */     //   1059: astore #31
/*    */     //   1061: iconst_0
/*    */     //   1062: istore #32
/*    */     //   1064: aload #31
/*    */     //   1066: invokeinterface getInserting : ()Z
/*    */     //   1071: ifne -> 1092
/*    */     //   1074: aload #31
/*    */     //   1076: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   1081: iload #21
/*    */     //   1083: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   1086: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   1089: ifne -> 1118
/*    */     //   1092: aload #31
/*    */     //   1094: iload #21
/*    */     //   1096: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   1099: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   1104: aload #27
/*    */     //   1106: iload #21
/*    */     //   1108: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   1111: aload #29
/*    */     //   1113: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   1118: nop
/*    */     //   1119: nop
/*    */     //   1120: nop
/*    */     //   1121: aload #27
/*    */     //   1123: aload #23
/*    */     //   1125: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   1128: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*    */     //   1131: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   1134: nop
/*    */     //   1135: nop
/*    */     //   1136: aload #7
/*    */     //   1138: bipush #14
/*    */     //   1140: iload #25
/*    */     //   1142: bipush #6
/*    */     //   1144: ishr
/*    */     //   1145: iand
/*    */     //   1146: istore #33
/*    */     //   1148: astore #34
/*    */     //   1150: iconst_0
/*    */     //   1151: istore #35
/*    */     //   1153: aload #34
/*    */     //   1155: ldc_w -407840262
/*    */     //   1158: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*    */     //   1161: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   1164: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*    */     //   1167: aload #34
/*    */     //   1169: bipush #6
/*    */     //   1171: bipush #112
/*    */     //   1173: iload #16
/*    */     //   1175: bipush #6
/*    */     //   1177: ishr
/*    */     //   1178: iand
/*    */     //   1179: ior
/*    */     //   1180: istore #36
/*    */     //   1182: astore #37
/*    */     //   1184: checkcast androidx/compose/foundation/layout/RowScope
/*    */     //   1187: astore #38
/*    */     //   1189: iconst_0
/*    */     //   1190: istore #39
/*    */     //   1192: aload #37
/*    */     //   1194: ldc_w 617179620
/*    */     //   1197: invokeinterface startReplaceGroup : (I)V
/*    */     //   1202: aload #5
/*    */     //   1204: ifnull -> 1271
/*    */     //   1207: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   1210: checkcast androidx/compose/ui/Modifier
/*    */     //   1213: bipush #16
/*    */     //   1215: istore #40
/*    */     //   1217: iconst_0
/*    */     //   1218: istore #41
/*    */     //   1220: iload #40
/*    */     //   1222: i2f
/*    */     //   1223: invokestatic constructor-impl : (F)F
/*    */     //   1226: invokestatic size-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*    */     //   1229: astore #42
/*    */     //   1231: aload #5
/*    */     //   1233: aload #6
/*    */     //   1235: aload #42
/*    */     //   1237: aconst_null
/*    */     //   1238: lconst_0
/*    */     //   1239: iconst_0
/*    */     //   1240: anewarray org/jetbrains/jewel/ui/painter/PainterHint
/*    */     //   1243: aload #37
/*    */     //   1245: sipush #384
/*    */     //   1248: bipush #14
/*    */     //   1250: iload #10
/*    */     //   1252: bipush #15
/*    */     //   1254: ishr
/*    */     //   1255: iand
/*    */     //   1256: ior
/*    */     //   1257: bipush #112
/*    */     //   1259: iload #10
/*    */     //   1261: bipush #15
/*    */     //   1263: ishr
/*    */     //   1264: iand
/*    */     //   1265: ior
/*    */     //   1266: bipush #24
/*    */     //   1268: invokestatic Icon-FHprtrg : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Class;J[Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;II)V
/*    */     //   1271: aload #37
/*    */     //   1273: invokeinterface endReplaceGroup : ()V
/*    */     //   1278: getstatic androidx/compose/ui/text/style/TextOverflow.Companion : Landroidx/compose/ui/text/style/TextOverflow$Companion;
/*    */     //   1281: invokevirtual getEllipsis-gIe3tQ8 : ()I
/*    */     //   1284: istore #42
/*    */     //   1286: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*    */     //   1289: aload #37
/*    */     //   1291: bipush #6
/*    */     //   1293: invokevirtual getDefaultTextStyle : (Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;
/*    */     //   1296: astore #40
/*    */     //   1298: aload_0
/*    */     //   1299: aconst_null
/*    */     //   1300: lconst_0
/*    */     //   1301: lconst_0
/*    */     //   1302: aconst_null
/*    */     //   1303: aconst_null
/*    */     //   1304: aconst_null
/*    */     //   1305: lconst_0
/*    */     //   1306: aconst_null
/*    */     //   1307: iconst_0
/*    */     //   1308: lconst_0
/*    */     //   1309: iload #42
/*    */     //   1311: iconst_0
/*    */     //   1312: iconst_1
/*    */     //   1313: aconst_null
/*    */     //   1314: aload #40
/*    */     //   1316: aload #37
/*    */     //   1318: bipush #14
/*    */     //   1320: iload #10
/*    */     //   1322: iand
/*    */     //   1323: sipush #3120
/*    */     //   1326: sipush #22526
/*    */     //   1329: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*    */     //   1332: nop
/*    */     //   1333: aload #34
/*    */     //   1335: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1338: aload #7
/*    */     //   1340: invokeinterface endNode : ()V
/*    */     //   1345: aload #7
/*    */     //   1347: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1350: nop
/*    */     //   1351: aload #7
/*    */     //   1353: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1356: nop
/*    */     //   1357: aload #7
/*    */     //   1359: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1362: nop
/*    */     //   1363: invokestatic isTraceInProgress : ()Z
/*    */     //   1366: ifeq -> 1382
/*    */     //   1369: invokestatic traceEventEnd : ()V
/*    */     //   1372: goto -> 1382
/*    */     //   1375: aload #7
/*    */     //   1377: invokeinterface skipToGroupEnd : ()V
/*    */     //   1382: aload #7
/*    */     //   1384: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*    */     //   1389: dup
/*    */     //   1390: ifnull -> 1420
/*    */     //   1393: aload_0
/*    */     //   1394: aload_1
/*    */     //   1395: aload_2
/*    */     //   1396: aload_3
/*    */     //   1397: fload #4
/*    */     //   1399: aload #5
/*    */     //   1401: aload #6
/*    */     //   1403: iload #8
/*    */     //   1405: iload #9
/*    */     //   1407: <illegal opcode> invoke : (Ljava/lang/String;Lorg/jetbrains/jewel/ui/component/ListItemState;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/SimpleListItemStyle;FLorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;II)Lkotlin/jvm/functions/Function2;
/*    */     //   1412: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*    */     //   1417: goto -> 1421
/*    */     //   1420: pop
/*    */     //   1421: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #34	-> 12
/*    */     //   #29	-> 429
/*    */     //   #30	-> 444
/*    */     //   #31	-> 471
/*    */     //   #32	-> 501
/*    */     //   #33	-> 512
/*    */     //   #34	-> 576
/*    */     //   #36	-> 579
/*    */     //   #37	-> 580
/*    */     //   #38	-> 604
/*    */     //   #39	-> 628
/*    */     //   #36	-> 634
/*    */     //   #35	-> 634
/*    */     //   #43	-> 636
/*    */     //   #45	-> 644
/*    */     //   #46	-> 645
/*    */     //   #67	-> 679
/*    */     //   #68	-> 691
/*    */     //   #69	-> 707
/*    */     //   #46	-> 714
/*    */     //   #69	-> 728
/*    */     //   #70	-> 730
/*    */     //   #71	-> 739
/*    */     //   #72	-> 744
/*    */     //   #68	-> 746
/*    */     //   #67	-> 747
/*    */     //   #67	-> 748
/*    */     //   #46	-> 749
/*    */     //   #47	-> 768
/*    */     //   #48	-> 774
/*    */     //   #49	-> 779
/*    */     //   #50	-> 789
/*    */     //   #51	-> 807
/*    */     //   #42	-> 824
/*    */     //   #73	-> 834
/*    */     //   #74	-> 837
/*    */     //   #78	-> 845
/*    */     //   #79	-> 880
/*    */     //   #80	-> 892
/*    */     //   #81	-> 898
/*    */     //   #82	-> 905
/*    */     //   #83	-> 914
/*    */     //   #85	-> 921
/*    */     //   #84	-> 943
/*    */     //   #86	-> 955
/*    */     //   #87	-> 958
/*    */     //   #88	-> 976
/*    */     //   #89	-> 981
/*    */     //   #90	-> 993
/*    */     //   #92	-> 1005
/*    */     //   #94	-> 1010
/*    */     //   #95	-> 1020
/*    */     //   #96	-> 1033
/*    */     //   #98	-> 1046
/*    */     //   #99	-> 1057
/*    */     //   #100	-> 1064
/*    */     //   #101	-> 1092
/*    */     //   #102	-> 1104
/*    */     //   #104	-> 1118
/*    */     //   #99	-> 1119
/*    */     //   #104	-> 1120
/*    */     //   #105	-> 1121
/*    */     //   #106	-> 1134
/*    */     //   #94	-> 1135
/*    */     //   #107	-> 1136
/*    */     //   #108	-> 1161
/*    */     //   #53	-> 1202
/*    */     //   #54	-> 1207
/*    */     //   #109	-> 1220
/*    */     //   #54	-> 1226
/*    */     //   #56	-> 1278
/*    */     //   #57	-> 1332
/*    */     //   #108	-> 1333
/*    */     //   #107	-> 1338
/*    */     //   #110	-> 1340
/*    */     //   #86	-> 1347
/*    */     //   #111	-> 1350
/*    */     //   #80	-> 1353
/*    */     //   #112	-> 1356
/*    */     //   #73	-> 1359
/*    */     //   #113	-> 1362
/*    */     //   #58	-> 1375
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   714	6	21	$i$a$-cache-SimpleListItemKt$SimpleListItem$1	I
/*    */     //   730	11	22	value$iv	Ljava/lang/Object;
/*    */     //   691	56	20	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   688	59	19	it$iv	Ljava/lang/Object;
/*    */     //   679	70	18	$i$f$cache	I
/*    */     //   676	73	16	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   676	73	17	invalid$iv	Z
/*    */     //   1220	6	41	$i$f$getDp	I
/*    */     //   1217	9	40	$this$dp$iv	I
/*    */     //   1192	141	39	$i$a$-Row-SimpleListItemKt$SimpleListItem$2	I
/*    */     //   1189	144	38	$this$SimpleListItem_iHT_50w_u24lambda_u242	Landroidx/compose/foundation/layout/RowScope;
/*    */     //   1189	144	37	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   1189	144	36	$changed	I
/*    */     //   1153	185	35	$i$a$-Layout-RowKt$Row$1$iv	I
/*    */     //   1150	188	34	$composer$iv	Landroidx/compose/runtime/Composer;
/*    */     //   1150	188	33	$changed$iv	I
/*    */     //   1064	55	32	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*    */     //   1061	58	31	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   1057	64	30	$i$f$set-impl	I
/*    */     //   1054	67	29	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*    */     //   1020	115	28	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*    */     //   1017	118	27	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   947	404	26	$i$f$ReusableComposeNode	I
/*    */     //   944	407	24	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*    */     //   944	407	25	$changed$iv$iv$iv	I
/*    */     //   884	473	20	$i$f$Layout	I
/*    */     //   903	454	21	compositeKeyHash$iv$iv	I
/*    */     //   912	445	22	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   921	436	23	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*    */     //   881	476	19	$changed$iv$iv	I
/*    */     //   828	535	17	$i$f$Row	I
/*    */     //   871	492	18	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   845	518	15	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*    */     //   825	538	16	$changed$iv	I
/*    */     //   636	736	11	color	J
/*    */     //   27	1395	10	$dirty	I
/*    */     //   0	1422	0	text	Ljava/lang/String;
/*    */     //   0	1422	1	state	Lorg/jetbrains/jewel/ui/component/ListItemState;
/*    */     //   0	1422	2	modifier	Landroidx/compose/ui/Modifier;
/*    */     //   0	1422	3	style	Lorg/jetbrains/jewel/ui/component/styling/SimpleListItemStyle;
/*    */     //   0	1422	4	height	F
/*    */     //   0	1422	5	icon	Lorg/jetbrains/jewel/ui/icon/IconKey;
/*    */     //   0	1422	6	contentDescription	Ljava/lang/String;
/*    */     //   0	1422	7	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	1422	8	$changed	I
/*    */   }
/*    */   
/*    */   private static final Unit SimpleListItem_iHT_50w$lambda$1$lambda$0(ListItemState $state, SemanticsPropertyReceiver $this$semantics) {
/* 46 */     Intrinsics.checkNotNullParameter($this$semantics, "$this$semantics"); SemanticsPropertiesKt.setSelected($this$semantics, $state.isSelected()); return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   private static final Unit SimpleListItem_iHT_50w$lambda$3(String $text, ListItemState $state, Modifier $modifier, SimpleListItemStyle $style, float $height, IconKey $icon, String $contentDescription, int $$changed, int $$default, Composer $composer, int $force) {
/*    */     SimpleListItem-iHT-50w($text, $state, $modifier, $style, $height, $icon, $contentDescription, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\SimpleListItemKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */