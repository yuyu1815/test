/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.interaction.Interaction;
/*     */ import androidx.compose.foundation.interaction.MutableInteractionSource;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.input.InputMode;
/*     */ import androidx.compose.ui.input.InputModeManager;
/*     */ import androidx.compose.ui.text.TextStyle;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.flow.FlowCollector;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.ui.component.styling.LinkStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.MenuStyle;
/*     */ import org.jetbrains.jewel.ui.icon.IconKey;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000b\n\000\n\002\020\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\007\n\002\030\002\n\000\n\002\030\002\032a\020\000\032\0020\0012\006\020\002\032\0020\0032\f\020\004\032\b\022\004\022\0020\0010\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\0132\b\b\002\020\f\032\0020\r2\b\b\002\020\016\032\0020\0172\b\b\002\020\020\032\0020\021H\007¢\006\004\b\022\020\023\032a\020\024\032\0020\0012\006\020\002\032\0020\0032\f\020\004\032\b\022\004\022\0020\0010\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\0132\b\b\002\020\f\032\0020\r2\b\b\002\020\016\032\0020\0172\b\b\002\020\020\032\0020\021H\007¢\006\004\b\025\020\023\032\001\020\026\032\0020\0012\006\020\002\032\0020\0032\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\0132\b\b\002\020\f\032\0020\r2\b\b\002\020\016\032\0020\0172\b\b\002\020\020\032\0020\0212\b\b\002\020\027\032\0020\0072\b\b\002\020\030\032\0020\0312\027\020\032\032\023\022\004\022\0020\034\022\004\022\0020\0010\033¢\006\002\b\035H\007¢\006\004\b\036\020\037\032_\020 \032\0020\0012\006\020\002\032\0020\0032\006\020\020\032\0020\0212\f\020\004\032\b\022\004\022\0020\0010\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\r2\006\020\016\032\0020\0172\b\020!\032\004\030\0010\"H\003¢\006\004\b#\020$¨\006%²\006\n\020&\032\0020\tX\002²\006\n\020'\032\0020\tX\002²\006\n\020(\032\0020\tX\002²\006\n\020)\032\0020*X\002²\006\n\020+\032\0020,X\002"}, d2 = {"Link", "", "text", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "style", "Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;", "Link-kye4rC8", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;Landroidx/compose/runtime/Composer;II)V", "ExternalLink", "ExternalLink-kye4rC8", "DropdownLink", "menuModifier", "menuStyle", "Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;", "menuContent", "Lkotlin/Function1;", "Lorg/jetbrains/jewel/ui/component/MenuScope;", "Lkotlin/ExtensionFunctionType;", "DropdownLink-RWo7tUw", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LinkImpl", "icon", "Lorg/jetbrains/jewel/ui/icon/IconKey;", "LinkImpl-5LixHlo", "(Ljava/lang/String;Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/icon/IconKey;Landroidx/compose/runtime/Composer;I)V", "ui", "expanded", "hovered", "skipNextClick", "linkState", "Lorg/jetbrains/jewel/ui/component/LinkState;", "textColor", "Landroidx/compose/ui/graphics/Color;"})
/*     */ @SourceDebugExtension({"SMAP\nLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Link.kt\norg/jetbrains/jewel/ui/component/LinkKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 ModifierExtensions.kt\norg/jetbrains/jewel/ui/util/ModifierExtensionsKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,324:1\n1225#2,6:325\n1225#2,6:332\n1225#2,6:339\n1225#2,6:347\n1225#2,6:353\n1225#2,6:359\n1225#2,6:365\n1225#2,6:407\n1225#2,6:413\n1225#2,6:423\n1225#2,6:429\n1225#2,6:436\n1225#2,6:442\n1225#2,6:449\n77#3:331\n77#3:338\n77#3:345\n77#3:346\n77#3:435\n71#4:371\n68#4,6:372\n74#4:406\n78#4:422\n79#5,6:378\n86#5,4:393\n90#5,2:403\n94#5:421\n79#5,6:458\n86#5,4:473\n90#5,2:483\n94#5:489\n368#6,9:384\n377#6:405\n378#6,2:419\n368#6,9:464\n377#6:485\n378#6,2:487\n4034#7,6:397\n4034#7,6:477\n10#8:448\n99#9,3:455\n102#9:486\n106#9:490\n81#10:491\n107#10,2:492\n81#10:494\n107#10,2:495\n81#10:497\n107#10,2:498\n81#10:500\n107#10,2:501\n81#10:503\n*S KotlinDebug\n*F\n+ 1 Link.kt\norg/jetbrains/jewel/ui/component/LinkKt\n*L\n63#1:325,6\n87#1:332,6\n110#1:339,6\n116#1:347,6\n117#1:353,6\n118#1:359,6\n120#1:365,6\n123#1:407,6\n140#1:413,6\n168#1:423,6\n169#1:429,6\n172#1:436,6\n194#1:442,6\n212#1:449,6\n64#1:331\n88#1:338\n111#1:345\n113#1:346\n171#1:435\n120#1:371\n120#1:372,6\n120#1:406\n120#1:422\n120#1:378,6\n120#1:393,4\n120#1:403,2\n120#1:421\n207#1:458,6\n207#1:473,4\n207#1:483,2\n207#1:489\n120#1:384,9\n120#1:405\n120#1:419,2\n207#1:464,9\n207#1:485\n207#1:487,2\n120#1:397,6\n207#1:477,6\n210#1:448\n207#1:455,3\n207#1:486\n207#1:490\n116#1:491\n116#1:492,2\n117#1:494\n117#1:495,2\n118#1:497\n118#1:498,2\n168#1:500\n168#1:501,2\n192#1:503\n*E\n"})
/*     */ public final class LinkKt
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void Link-kye4rC8(@NotNull String text, @NotNull Function0 onClick, @Nullable Modifier modifier, boolean enabled, @Nullable TextStyle textStyle, int overflow, @Nullable MutableInteractionSource interactionSource, @Nullable LinkStyle style, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'text'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'onClick'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload #8
/*     */     //   14: ldc -1046089813
/*     */     //   16: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   21: astore #8
/*     */     //   23: iload #9
/*     */     //   25: istore #11
/*     */     //   27: iload #10
/*     */     //   29: iconst_1
/*     */     //   30: iand
/*     */     //   31: ifeq -> 44
/*     */     //   34: iload #11
/*     */     //   36: bipush #6
/*     */     //   38: ior
/*     */     //   39: istore #11
/*     */     //   41: goto -> 73
/*     */     //   44: iload #9
/*     */     //   46: bipush #6
/*     */     //   48: iand
/*     */     //   49: ifne -> 73
/*     */     //   52: iload #11
/*     */     //   54: aload #8
/*     */     //   56: aload_0
/*     */     //   57: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   62: ifeq -> 69
/*     */     //   65: iconst_4
/*     */     //   66: goto -> 70
/*     */     //   69: iconst_2
/*     */     //   70: ior
/*     */     //   71: istore #11
/*     */     //   73: iload #10
/*     */     //   75: iconst_2
/*     */     //   76: iand
/*     */     //   77: ifeq -> 90
/*     */     //   80: iload #11
/*     */     //   82: bipush #48
/*     */     //   84: ior
/*     */     //   85: istore #11
/*     */     //   87: goto -> 121
/*     */     //   90: iload #9
/*     */     //   92: bipush #48
/*     */     //   94: iand
/*     */     //   95: ifne -> 121
/*     */     //   98: iload #11
/*     */     //   100: aload #8
/*     */     //   102: aload_1
/*     */     //   103: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   108: ifeq -> 116
/*     */     //   111: bipush #32
/*     */     //   113: goto -> 118
/*     */     //   116: bipush #16
/*     */     //   118: ior
/*     */     //   119: istore #11
/*     */     //   121: iload #10
/*     */     //   123: iconst_4
/*     */     //   124: iand
/*     */     //   125: ifeq -> 139
/*     */     //   128: iload #11
/*     */     //   130: sipush #384
/*     */     //   133: ior
/*     */     //   134: istore #11
/*     */     //   136: goto -> 173
/*     */     //   139: iload #9
/*     */     //   141: sipush #384
/*     */     //   144: iand
/*     */     //   145: ifne -> 173
/*     */     //   148: iload #11
/*     */     //   150: aload #8
/*     */     //   152: aload_2
/*     */     //   153: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   158: ifeq -> 167
/*     */     //   161: sipush #256
/*     */     //   164: goto -> 170
/*     */     //   167: sipush #128
/*     */     //   170: ior
/*     */     //   171: istore #11
/*     */     //   173: iload #10
/*     */     //   175: bipush #8
/*     */     //   177: iand
/*     */     //   178: ifeq -> 192
/*     */     //   181: iload #11
/*     */     //   183: sipush #3072
/*     */     //   186: ior
/*     */     //   187: istore #11
/*     */     //   189: goto -> 226
/*     */     //   192: iload #9
/*     */     //   194: sipush #3072
/*     */     //   197: iand
/*     */     //   198: ifne -> 226
/*     */     //   201: iload #11
/*     */     //   203: aload #8
/*     */     //   205: iload_3
/*     */     //   206: invokeinterface changed : (Z)Z
/*     */     //   211: ifeq -> 220
/*     */     //   214: sipush #2048
/*     */     //   217: goto -> 223
/*     */     //   220: sipush #1024
/*     */     //   223: ior
/*     */     //   224: istore #11
/*     */     //   226: iload #9
/*     */     //   228: sipush #24576
/*     */     //   231: iand
/*     */     //   232: ifne -> 269
/*     */     //   235: iload #11
/*     */     //   237: iload #10
/*     */     //   239: bipush #16
/*     */     //   241: iand
/*     */     //   242: ifne -> 263
/*     */     //   245: aload #8
/*     */     //   247: aload #4
/*     */     //   249: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   254: ifeq -> 263
/*     */     //   257: sipush #16384
/*     */     //   260: goto -> 266
/*     */     //   263: sipush #8192
/*     */     //   266: ior
/*     */     //   267: istore #11
/*     */     //   269: iload #10
/*     */     //   271: bipush #32
/*     */     //   273: iand
/*     */     //   274: ifeq -> 287
/*     */     //   277: iload #11
/*     */     //   279: ldc 196608
/*     */     //   281: ior
/*     */     //   282: istore #11
/*     */     //   284: goto -> 319
/*     */     //   287: iload #9
/*     */     //   289: ldc 196608
/*     */     //   291: iand
/*     */     //   292: ifne -> 319
/*     */     //   295: iload #11
/*     */     //   297: aload #8
/*     */     //   299: iload #5
/*     */     //   301: invokeinterface changed : (I)Z
/*     */     //   306: ifeq -> 314
/*     */     //   309: ldc 131072
/*     */     //   311: goto -> 316
/*     */     //   314: ldc 65536
/*     */     //   316: ior
/*     */     //   317: istore #11
/*     */     //   319: iload #10
/*     */     //   321: bipush #64
/*     */     //   323: iand
/*     */     //   324: ifeq -> 337
/*     */     //   327: iload #11
/*     */     //   329: ldc 1572864
/*     */     //   331: ior
/*     */     //   332: istore #11
/*     */     //   334: goto -> 369
/*     */     //   337: iload #9
/*     */     //   339: ldc 1572864
/*     */     //   341: iand
/*     */     //   342: ifne -> 369
/*     */     //   345: iload #11
/*     */     //   347: aload #8
/*     */     //   349: aload #6
/*     */     //   351: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   356: ifeq -> 364
/*     */     //   359: ldc 1048576
/*     */     //   361: goto -> 366
/*     */     //   364: ldc 524288
/*     */     //   366: ior
/*     */     //   367: istore #11
/*     */     //   369: iload #9
/*     */     //   371: ldc 12582912
/*     */     //   373: iand
/*     */     //   374: ifne -> 410
/*     */     //   377: iload #11
/*     */     //   379: iload #10
/*     */     //   381: sipush #128
/*     */     //   384: iand
/*     */     //   385: ifne -> 405
/*     */     //   388: aload #8
/*     */     //   390: aload #7
/*     */     //   392: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   397: ifeq -> 405
/*     */     //   400: ldc 8388608
/*     */     //   402: goto -> 407
/*     */     //   405: ldc 4194304
/*     */     //   407: ior
/*     */     //   408: istore #11
/*     */     //   410: iload #11
/*     */     //   412: ldc 4793491
/*     */     //   414: iand
/*     */     //   415: ldc 4793490
/*     */     //   417: if_icmpne -> 430
/*     */     //   420: aload #8
/*     */     //   422: invokeinterface getSkipping : ()Z
/*     */     //   427: ifne -> 838
/*     */     //   430: aload #8
/*     */     //   432: invokeinterface startDefaults : ()V
/*     */     //   437: iload #9
/*     */     //   439: iconst_1
/*     */     //   440: iand
/*     */     //   441: ifeq -> 454
/*     */     //   444: aload #8
/*     */     //   446: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   451: ifeq -> 680
/*     */     //   454: iload #10
/*     */     //   456: iconst_4
/*     */     //   457: iand
/*     */     //   458: ifeq -> 468
/*     */     //   461: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   464: checkcast androidx/compose/ui/Modifier
/*     */     //   467: astore_2
/*     */     //   468: iload #10
/*     */     //   470: bipush #8
/*     */     //   472: iand
/*     */     //   473: ifeq -> 478
/*     */     //   476: iconst_1
/*     */     //   477: istore_3
/*     */     //   478: iload #10
/*     */     //   480: bipush #16
/*     */     //   482: iand
/*     */     //   483: ifeq -> 505
/*     */     //   486: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   489: aload #8
/*     */     //   491: bipush #6
/*     */     //   493: invokevirtual getDefaultTextStyle : (Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;
/*     */     //   496: astore #4
/*     */     //   498: iload #11
/*     */     //   500: ldc -57345
/*     */     //   502: iand
/*     */     //   503: istore #11
/*     */     //   505: iload #10
/*     */     //   507: bipush #32
/*     */     //   509: iand
/*     */     //   510: ifeq -> 521
/*     */     //   513: getstatic androidx/compose/ui/text/style/TextOverflow.Companion : Landroidx/compose/ui/text/style/TextOverflow$Companion;
/*     */     //   516: invokevirtual getClip-gIe3tQ8 : ()I
/*     */     //   519: istore #5
/*     */     //   521: iload #10
/*     */     //   523: bipush #64
/*     */     //   525: iand
/*     */     //   526: ifeq -> 614
/*     */     //   529: aload #8
/*     */     //   531: ldc 873404063
/*     */     //   533: invokeinterface startReplaceGroup : (I)V
/*     */     //   538: aload #8
/*     */     //   540: astore #13
/*     */     //   542: iconst_0
/*     */     //   543: istore #14
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
/*     */     //   568: if_acmpne -> 593
/*     */     //   571: iconst_0
/*     */     //   572: istore #18
/*     */     //   574: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   577: astore #18
/*     */     //   579: aload #13
/*     */     //   581: aload #18
/*     */     //   583: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   588: aload #18
/*     */     //   590: goto -> 595
/*     */     //   593: aload #16
/*     */     //   595: nop
/*     */     //   596: nop
/*     */     //   597: nop
/*     */     //   598: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   601: astore #12
/*     */     //   603: aload #8
/*     */     //   605: invokeinterface endReplaceGroup : ()V
/*     */     //   610: aload #12
/*     */     //   612: astore #6
/*     */     //   614: iload #10
/*     */     //   616: sipush #128
/*     */     //   619: iand
/*     */     //   620: ifeq -> 718
/*     */     //   623: invokestatic getLocalLinkStyle : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   626: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   629: astore #12
/*     */     //   631: bipush #6
/*     */     //   633: istore #13
/*     */     //   635: iconst_0
/*     */     //   636: istore #14
/*     */     //   638: aload #8
/*     */     //   640: ldc 2023513938
/*     */     //   642: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   644: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   647: aload #8
/*     */     //   649: aload #12
/*     */     //   651: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   656: astore #15
/*     */     //   658: aload #8
/*     */     //   660: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   663: aload #15
/*     */     //   665: checkcast org/jetbrains/jewel/ui/component/styling/LinkStyle
/*     */     //   668: astore #7
/*     */     //   670: iload #11
/*     */     //   672: ldc -29360129
/*     */     //   674: iand
/*     */     //   675: istore #11
/*     */     //   677: goto -> 718
/*     */     //   680: aload #8
/*     */     //   682: invokeinterface skipToGroupEnd : ()V
/*     */     //   687: iload #10
/*     */     //   689: bipush #16
/*     */     //   691: iand
/*     */     //   692: ifeq -> 702
/*     */     //   695: iload #11
/*     */     //   697: ldc -57345
/*     */     //   699: iand
/*     */     //   700: istore #11
/*     */     //   702: iload #10
/*     */     //   704: sipush #128
/*     */     //   707: iand
/*     */     //   708: ifeq -> 718
/*     */     //   711: iload #11
/*     */     //   713: ldc -29360129
/*     */     //   715: iand
/*     */     //   716: istore #11
/*     */     //   718: aload #8
/*     */     //   720: invokeinterface endDefaults : ()V
/*     */     //   725: invokestatic isTraceInProgress : ()Z
/*     */     //   728: ifeq -> 741
/*     */     //   731: ldc -1046089813
/*     */     //   733: iload #11
/*     */     //   735: iconst_m1
/*     */     //   736: ldc 'org.jetbrains.jewel.ui.component.Link (Link.kt:64)'
/*     */     //   738: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   741: aload_0
/*     */     //   742: aload #7
/*     */     //   744: aload_1
/*     */     //   745: aload_2
/*     */     //   746: iload_3
/*     */     //   747: aload #4
/*     */     //   749: iload #5
/*     */     //   751: aload #6
/*     */     //   753: aconst_null
/*     */     //   754: aload #8
/*     */     //   756: ldc 100663296
/*     */     //   758: bipush #14
/*     */     //   760: iload #11
/*     */     //   762: iand
/*     */     //   763: ior
/*     */     //   764: bipush #112
/*     */     //   766: iload #11
/*     */     //   768: bipush #18
/*     */     //   770: ishr
/*     */     //   771: iand
/*     */     //   772: ior
/*     */     //   773: sipush #896
/*     */     //   776: iload #11
/*     */     //   778: iconst_3
/*     */     //   779: ishl
/*     */     //   780: iand
/*     */     //   781: ior
/*     */     //   782: sipush #7168
/*     */     //   785: iload #11
/*     */     //   787: iconst_3
/*     */     //   788: ishl
/*     */     //   789: iand
/*     */     //   790: ior
/*     */     //   791: ldc 57344
/*     */     //   793: iload #11
/*     */     //   795: iconst_3
/*     */     //   796: ishl
/*     */     //   797: iand
/*     */     //   798: ior
/*     */     //   799: ldc 458752
/*     */     //   801: iload #11
/*     */     //   803: iconst_3
/*     */     //   804: ishl
/*     */     //   805: iand
/*     */     //   806: ior
/*     */     //   807: ldc 3670016
/*     */     //   809: iload #11
/*     */     //   811: iconst_3
/*     */     //   812: ishl
/*     */     //   813: iand
/*     */     //   814: ior
/*     */     //   815: ldc 29360128
/*     */     //   817: iload #11
/*     */     //   819: iconst_3
/*     */     //   820: ishl
/*     */     //   821: iand
/*     */     //   822: ior
/*     */     //   823: invokestatic LinkImpl-5LixHlo : (Ljava/lang/String;Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/icon/IconKey;Landroidx/compose/runtime/Composer;I)V
/*     */     //   826: invokestatic isTraceInProgress : ()Z
/*     */     //   829: ifeq -> 845
/*     */     //   832: invokestatic traceEventEnd : ()V
/*     */     //   835: goto -> 845
/*     */     //   838: aload #8
/*     */     //   840: invokeinterface skipToGroupEnd : ()V
/*     */     //   845: aload #8
/*     */     //   847: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   852: dup
/*     */     //   853: ifnull -> 885
/*     */     //   856: aload_0
/*     */     //   857: aload_1
/*     */     //   858: aload_2
/*     */     //   859: iload_3
/*     */     //   860: aload #4
/*     */     //   862: iload #5
/*     */     //   864: aload #6
/*     */     //   866: aload #7
/*     */     //   868: iload #9
/*     */     //   870: iload #10
/*     */     //   872: <illegal opcode> invoke : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;II)Lkotlin/jvm/functions/Function2;
/*     */     //   877: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   882: goto -> 886
/*     */     //   885: pop
/*     */     //   886: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #65	-> 12
/*     */     //   #59	-> 461
/*     */     //   #60	-> 476
/*     */     //   #61	-> 486
/*     */     //   #62	-> 513
/*     */     //   #63	-> 529
/*     */     //   #325	-> 548
/*     */     //   #326	-> 560
/*     */     //   #327	-> 571
/*     */     //   #63	-> 574
/*     */     //   #327	-> 577
/*     */     //   #328	-> 579
/*     */     //   #329	-> 588
/*     */     //   #330	-> 593
/*     */     //   #326	-> 595
/*     */     //   #325	-> 596
/*     */     //   #325	-> 597
/*     */     //   #63	-> 598
/*     */     //   #64	-> 623
/*     */     //   #331	-> 644
/*     */     //   #65	-> 738
/*     */     //   #67	-> 741
/*     */     //   #73	-> 742
/*     */     //   #68	-> 744
/*     */     //   #69	-> 745
/*     */     //   #70	-> 746
/*     */     //   #74	-> 747
/*     */     //   #71	-> 749
/*     */     //   #72	-> 751
/*     */     //   #75	-> 753
/*     */     //   #66	-> 823
/*     */     //   #77	-> 838
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   574	3	18	$i$a$-cache-LinkKt$Link$1	I
/*     */     //   579	11	18	value$iv	Ljava/lang/Object;
/*     */     //   560	36	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   557	39	16	it$iv	Ljava/lang/Object;
/*     */     //   548	50	15	$i$f$cache	I
/*     */     //   545	53	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   545	53	14	invalid$iv	Z
/*     */     //   638	27	14	$i$f$getCurrent	I
/*     */     //   635	30	12	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   635	30	13	$changed$iv	I
/*     */     //   27	860	11	$dirty	I
/*     */     //   0	887	0	text	Ljava/lang/String;
/*     */     //   0	887	1	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	887	2	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	887	3	enabled	Z
/*     */     //   0	887	4	textStyle	Landroidx/compose/ui/text/TextStyle;
/*     */     //   0	887	5	overflow	I
/*     */     //   0	887	6	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	887	7	style	Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;
/*     */     //   0	887	8	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	887	9	$changed	I
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void ExternalLink-kye4rC8(@NotNull String text, @NotNull Function0 onClick, @Nullable Modifier modifier, boolean enabled, @Nullable TextStyle textStyle, int overflow, @Nullable MutableInteractionSource interactionSource, @Nullable LinkStyle style, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'text'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'onClick'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload #8
/*     */     //   14: ldc 1007177056
/*     */     //   16: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   21: astore #8
/*     */     //   23: iload #9
/*     */     //   25: istore #11
/*     */     //   27: iload #10
/*     */     //   29: iconst_1
/*     */     //   30: iand
/*     */     //   31: ifeq -> 44
/*     */     //   34: iload #11
/*     */     //   36: bipush #6
/*     */     //   38: ior
/*     */     //   39: istore #11
/*     */     //   41: goto -> 73
/*     */     //   44: iload #9
/*     */     //   46: bipush #6
/*     */     //   48: iand
/*     */     //   49: ifne -> 73
/*     */     //   52: iload #11
/*     */     //   54: aload #8
/*     */     //   56: aload_0
/*     */     //   57: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   62: ifeq -> 69
/*     */     //   65: iconst_4
/*     */     //   66: goto -> 70
/*     */     //   69: iconst_2
/*     */     //   70: ior
/*     */     //   71: istore #11
/*     */     //   73: iload #10
/*     */     //   75: iconst_2
/*     */     //   76: iand
/*     */     //   77: ifeq -> 90
/*     */     //   80: iload #11
/*     */     //   82: bipush #48
/*     */     //   84: ior
/*     */     //   85: istore #11
/*     */     //   87: goto -> 121
/*     */     //   90: iload #9
/*     */     //   92: bipush #48
/*     */     //   94: iand
/*     */     //   95: ifne -> 121
/*     */     //   98: iload #11
/*     */     //   100: aload #8
/*     */     //   102: aload_1
/*     */     //   103: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   108: ifeq -> 116
/*     */     //   111: bipush #32
/*     */     //   113: goto -> 118
/*     */     //   116: bipush #16
/*     */     //   118: ior
/*     */     //   119: istore #11
/*     */     //   121: iload #10
/*     */     //   123: iconst_4
/*     */     //   124: iand
/*     */     //   125: ifeq -> 139
/*     */     //   128: iload #11
/*     */     //   130: sipush #384
/*     */     //   133: ior
/*     */     //   134: istore #11
/*     */     //   136: goto -> 173
/*     */     //   139: iload #9
/*     */     //   141: sipush #384
/*     */     //   144: iand
/*     */     //   145: ifne -> 173
/*     */     //   148: iload #11
/*     */     //   150: aload #8
/*     */     //   152: aload_2
/*     */     //   153: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   158: ifeq -> 167
/*     */     //   161: sipush #256
/*     */     //   164: goto -> 170
/*     */     //   167: sipush #128
/*     */     //   170: ior
/*     */     //   171: istore #11
/*     */     //   173: iload #10
/*     */     //   175: bipush #8
/*     */     //   177: iand
/*     */     //   178: ifeq -> 192
/*     */     //   181: iload #11
/*     */     //   183: sipush #3072
/*     */     //   186: ior
/*     */     //   187: istore #11
/*     */     //   189: goto -> 226
/*     */     //   192: iload #9
/*     */     //   194: sipush #3072
/*     */     //   197: iand
/*     */     //   198: ifne -> 226
/*     */     //   201: iload #11
/*     */     //   203: aload #8
/*     */     //   205: iload_3
/*     */     //   206: invokeinterface changed : (Z)Z
/*     */     //   211: ifeq -> 220
/*     */     //   214: sipush #2048
/*     */     //   217: goto -> 223
/*     */     //   220: sipush #1024
/*     */     //   223: ior
/*     */     //   224: istore #11
/*     */     //   226: iload #9
/*     */     //   228: sipush #24576
/*     */     //   231: iand
/*     */     //   232: ifne -> 269
/*     */     //   235: iload #11
/*     */     //   237: iload #10
/*     */     //   239: bipush #16
/*     */     //   241: iand
/*     */     //   242: ifne -> 263
/*     */     //   245: aload #8
/*     */     //   247: aload #4
/*     */     //   249: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   254: ifeq -> 263
/*     */     //   257: sipush #16384
/*     */     //   260: goto -> 266
/*     */     //   263: sipush #8192
/*     */     //   266: ior
/*     */     //   267: istore #11
/*     */     //   269: iload #10
/*     */     //   271: bipush #32
/*     */     //   273: iand
/*     */     //   274: ifeq -> 287
/*     */     //   277: iload #11
/*     */     //   279: ldc 196608
/*     */     //   281: ior
/*     */     //   282: istore #11
/*     */     //   284: goto -> 319
/*     */     //   287: iload #9
/*     */     //   289: ldc 196608
/*     */     //   291: iand
/*     */     //   292: ifne -> 319
/*     */     //   295: iload #11
/*     */     //   297: aload #8
/*     */     //   299: iload #5
/*     */     //   301: invokeinterface changed : (I)Z
/*     */     //   306: ifeq -> 314
/*     */     //   309: ldc 131072
/*     */     //   311: goto -> 316
/*     */     //   314: ldc 65536
/*     */     //   316: ior
/*     */     //   317: istore #11
/*     */     //   319: iload #10
/*     */     //   321: bipush #64
/*     */     //   323: iand
/*     */     //   324: ifeq -> 337
/*     */     //   327: iload #11
/*     */     //   329: ldc 1572864
/*     */     //   331: ior
/*     */     //   332: istore #11
/*     */     //   334: goto -> 369
/*     */     //   337: iload #9
/*     */     //   339: ldc 1572864
/*     */     //   341: iand
/*     */     //   342: ifne -> 369
/*     */     //   345: iload #11
/*     */     //   347: aload #8
/*     */     //   349: aload #6
/*     */     //   351: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   356: ifeq -> 364
/*     */     //   359: ldc 1048576
/*     */     //   361: goto -> 366
/*     */     //   364: ldc 524288
/*     */     //   366: ior
/*     */     //   367: istore #11
/*     */     //   369: iload #9
/*     */     //   371: ldc 12582912
/*     */     //   373: iand
/*     */     //   374: ifne -> 410
/*     */     //   377: iload #11
/*     */     //   379: iload #10
/*     */     //   381: sipush #128
/*     */     //   384: iand
/*     */     //   385: ifne -> 405
/*     */     //   388: aload #8
/*     */     //   390: aload #7
/*     */     //   392: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   397: ifeq -> 405
/*     */     //   400: ldc 8388608
/*     */     //   402: goto -> 407
/*     */     //   405: ldc 4194304
/*     */     //   407: ior
/*     */     //   408: istore #11
/*     */     //   410: iload #11
/*     */     //   412: ldc 4793491
/*     */     //   414: iand
/*     */     //   415: ldc 4793490
/*     */     //   417: if_icmpne -> 430
/*     */     //   420: aload #8
/*     */     //   422: invokeinterface getSkipping : ()Z
/*     */     //   427: ifne -> 846
/*     */     //   430: aload #8
/*     */     //   432: invokeinterface startDefaults : ()V
/*     */     //   437: iload #9
/*     */     //   439: iconst_1
/*     */     //   440: iand
/*     */     //   441: ifeq -> 454
/*     */     //   444: aload #8
/*     */     //   446: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   451: ifeq -> 680
/*     */     //   454: iload #10
/*     */     //   456: iconst_4
/*     */     //   457: iand
/*     */     //   458: ifeq -> 468
/*     */     //   461: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   464: checkcast androidx/compose/ui/Modifier
/*     */     //   467: astore_2
/*     */     //   468: iload #10
/*     */     //   470: bipush #8
/*     */     //   472: iand
/*     */     //   473: ifeq -> 478
/*     */     //   476: iconst_1
/*     */     //   477: istore_3
/*     */     //   478: iload #10
/*     */     //   480: bipush #16
/*     */     //   482: iand
/*     */     //   483: ifeq -> 505
/*     */     //   486: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   489: aload #8
/*     */     //   491: bipush #6
/*     */     //   493: invokevirtual getDefaultTextStyle : (Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;
/*     */     //   496: astore #4
/*     */     //   498: iload #11
/*     */     //   500: ldc -57345
/*     */     //   502: iand
/*     */     //   503: istore #11
/*     */     //   505: iload #10
/*     */     //   507: bipush #32
/*     */     //   509: iand
/*     */     //   510: ifeq -> 521
/*     */     //   513: getstatic androidx/compose/ui/text/style/TextOverflow.Companion : Landroidx/compose/ui/text/style/TextOverflow$Companion;
/*     */     //   516: invokevirtual getClip-gIe3tQ8 : ()I
/*     */     //   519: istore #5
/*     */     //   521: iload #10
/*     */     //   523: bipush #64
/*     */     //   525: iand
/*     */     //   526: ifeq -> 614
/*     */     //   529: aload #8
/*     */     //   531: ldc -459188278
/*     */     //   533: invokeinterface startReplaceGroup : (I)V
/*     */     //   538: aload #8
/*     */     //   540: astore #13
/*     */     //   542: iconst_0
/*     */     //   543: istore #14
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
/*     */     //   568: if_acmpne -> 593
/*     */     //   571: iconst_0
/*     */     //   572: istore #18
/*     */     //   574: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   577: astore #18
/*     */     //   579: aload #13
/*     */     //   581: aload #18
/*     */     //   583: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   588: aload #18
/*     */     //   590: goto -> 595
/*     */     //   593: aload #16
/*     */     //   595: nop
/*     */     //   596: nop
/*     */     //   597: nop
/*     */     //   598: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   601: astore #12
/*     */     //   603: aload #8
/*     */     //   605: invokeinterface endReplaceGroup : ()V
/*     */     //   610: aload #12
/*     */     //   612: astore #6
/*     */     //   614: iload #10
/*     */     //   616: sipush #128
/*     */     //   619: iand
/*     */     //   620: ifeq -> 718
/*     */     //   623: invokestatic getLocalLinkStyle : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   626: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   629: astore #12
/*     */     //   631: bipush #6
/*     */     //   633: istore #13
/*     */     //   635: iconst_0
/*     */     //   636: istore #14
/*     */     //   638: aload #8
/*     */     //   640: ldc 2023513938
/*     */     //   642: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   644: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   647: aload #8
/*     */     //   649: aload #12
/*     */     //   651: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   656: astore #15
/*     */     //   658: aload #8
/*     */     //   660: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   663: aload #15
/*     */     //   665: checkcast org/jetbrains/jewel/ui/component/styling/LinkStyle
/*     */     //   668: astore #7
/*     */     //   670: iload #11
/*     */     //   672: ldc -29360129
/*     */     //   674: iand
/*     */     //   675: istore #11
/*     */     //   677: goto -> 718
/*     */     //   680: aload #8
/*     */     //   682: invokeinterface skipToGroupEnd : ()V
/*     */     //   687: iload #10
/*     */     //   689: bipush #16
/*     */     //   691: iand
/*     */     //   692: ifeq -> 702
/*     */     //   695: iload #11
/*     */     //   697: ldc -57345
/*     */     //   699: iand
/*     */     //   700: istore #11
/*     */     //   702: iload #10
/*     */     //   704: sipush #128
/*     */     //   707: iand
/*     */     //   708: ifeq -> 718
/*     */     //   711: iload #11
/*     */     //   713: ldc -29360129
/*     */     //   715: iand
/*     */     //   716: istore #11
/*     */     //   718: aload #8
/*     */     //   720: invokeinterface endDefaults : ()V
/*     */     //   725: invokestatic isTraceInProgress : ()Z
/*     */     //   728: ifeq -> 741
/*     */     //   731: ldc 1007177056
/*     */     //   733: iload #11
/*     */     //   735: iconst_m1
/*     */     //   736: ldc 'org.jetbrains.jewel.ui.component.ExternalLink (Link.kt:88)'
/*     */     //   738: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   741: aload #7
/*     */     //   743: invokevirtual getIcons : ()Lorg/jetbrains/jewel/ui/component/styling/LinkIcons;
/*     */     //   746: invokevirtual getExternalLink : ()Lorg/jetbrains/jewel/ui/icon/IconKey;
/*     */     //   749: astore #12
/*     */     //   751: aload_0
/*     */     //   752: aload #7
/*     */     //   754: aload_1
/*     */     //   755: aload_2
/*     */     //   756: iload_3
/*     */     //   757: aload #4
/*     */     //   759: iload #5
/*     */     //   761: aload #6
/*     */     //   763: aload #12
/*     */     //   765: aload #8
/*     */     //   767: bipush #14
/*     */     //   769: iload #11
/*     */     //   771: iand
/*     */     //   772: bipush #112
/*     */     //   774: iload #11
/*     */     //   776: bipush #18
/*     */     //   778: ishr
/*     */     //   779: iand
/*     */     //   780: ior
/*     */     //   781: sipush #896
/*     */     //   784: iload #11
/*     */     //   786: iconst_3
/*     */     //   787: ishl
/*     */     //   788: iand
/*     */     //   789: ior
/*     */     //   790: sipush #7168
/*     */     //   793: iload #11
/*     */     //   795: iconst_3
/*     */     //   796: ishl
/*     */     //   797: iand
/*     */     //   798: ior
/*     */     //   799: ldc 57344
/*     */     //   801: iload #11
/*     */     //   803: iconst_3
/*     */     //   804: ishl
/*     */     //   805: iand
/*     */     //   806: ior
/*     */     //   807: ldc 458752
/*     */     //   809: iload #11
/*     */     //   811: iconst_3
/*     */     //   812: ishl
/*     */     //   813: iand
/*     */     //   814: ior
/*     */     //   815: ldc 3670016
/*     */     //   817: iload #11
/*     */     //   819: iconst_3
/*     */     //   820: ishl
/*     */     //   821: iand
/*     */     //   822: ior
/*     */     //   823: ldc 29360128
/*     */     //   825: iload #11
/*     */     //   827: iconst_3
/*     */     //   828: ishl
/*     */     //   829: iand
/*     */     //   830: ior
/*     */     //   831: invokestatic LinkImpl-5LixHlo : (Ljava/lang/String;Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/icon/IconKey;Landroidx/compose/runtime/Composer;I)V
/*     */     //   834: invokestatic isTraceInProgress : ()Z
/*     */     //   837: ifeq -> 853
/*     */     //   840: invokestatic traceEventEnd : ()V
/*     */     //   843: goto -> 853
/*     */     //   846: aload #8
/*     */     //   848: invokeinterface skipToGroupEnd : ()V
/*     */     //   853: aload #8
/*     */     //   855: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   860: dup
/*     */     //   861: ifnull -> 893
/*     */     //   864: aload_0
/*     */     //   865: aload_1
/*     */     //   866: aload_2
/*     */     //   867: iload_3
/*     */     //   868: aload #4
/*     */     //   870: iload #5
/*     */     //   872: aload #6
/*     */     //   874: aload #7
/*     */     //   876: iload #9
/*     */     //   878: iload #10
/*     */     //   880: <illegal opcode> invoke : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;II)Lkotlin/jvm/functions/Function2;
/*     */     //   885: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   890: goto -> 894
/*     */     //   893: pop
/*     */     //   894: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #89	-> 12
/*     */     //   #83	-> 461
/*     */     //   #84	-> 476
/*     */     //   #85	-> 486
/*     */     //   #86	-> 513
/*     */     //   #87	-> 529
/*     */     //   #332	-> 548
/*     */     //   #333	-> 560
/*     */     //   #334	-> 571
/*     */     //   #87	-> 574
/*     */     //   #334	-> 577
/*     */     //   #335	-> 579
/*     */     //   #336	-> 588
/*     */     //   #337	-> 593
/*     */     //   #333	-> 595
/*     */     //   #332	-> 596
/*     */     //   #332	-> 597
/*     */     //   #87	-> 598
/*     */     //   #88	-> 623
/*     */     //   #338	-> 644
/*     */     //   #89	-> 738
/*     */     //   #99	-> 741
/*     */     //   #91	-> 751
/*     */     //   #97	-> 752
/*     */     //   #92	-> 754
/*     */     //   #93	-> 755
/*     */     //   #94	-> 756
/*     */     //   #98	-> 757
/*     */     //   #95	-> 759
/*     */     //   #96	-> 761
/*     */     //   #99	-> 763
/*     */     //   #90	-> 831
/*     */     //   #101	-> 846
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   574	3	18	$i$a$-cache-LinkKt$ExternalLink$1	I
/*     */     //   579	11	18	value$iv	Ljava/lang/Object;
/*     */     //   560	36	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   557	39	16	it$iv	Ljava/lang/Object;
/*     */     //   548	50	15	$i$f$cache	I
/*     */     //   545	53	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   545	53	14	invalid$iv	Z
/*     */     //   638	27	14	$i$f$getCurrent	I
/*     */     //   635	30	12	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   635	30	13	$changed$iv	I
/*     */     //   27	868	11	$dirty	I
/*     */     //   0	895	0	text	Ljava/lang/String;
/*     */     //   0	895	1	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	895	2	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	895	3	enabled	Z
/*     */     //   0	895	4	textStyle	Landroidx/compose/ui/text/TextStyle;
/*     */     //   0	895	5	overflow	I
/*     */     //   0	895	6	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	895	7	style	Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;
/*     */     //   0	895	8	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	895	9	$changed	I
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void DropdownLink-RWo7tUw(@NotNull String text, @Nullable Modifier modifier, boolean enabled, @Nullable TextStyle textStyle, int overflow, @Nullable MutableInteractionSource interactionSource, @Nullable LinkStyle style, @Nullable Modifier menuModifier, @Nullable MenuStyle menuStyle, @NotNull Function1 menuContent, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'text'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload #9
/*     */     //   8: ldc_w 'menuContent'
/*     */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   14: aload #10
/*     */     //   16: ldc_w -561353012
/*     */     //   19: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   24: astore #10
/*     */     //   26: iload #11
/*     */     //   28: istore #13
/*     */     //   30: iload #12
/*     */     //   32: iconst_1
/*     */     //   33: iand
/*     */     //   34: ifeq -> 47
/*     */     //   37: iload #13
/*     */     //   39: bipush #6
/*     */     //   41: ior
/*     */     //   42: istore #13
/*     */     //   44: goto -> 76
/*     */     //   47: iload #11
/*     */     //   49: bipush #6
/*     */     //   51: iand
/*     */     //   52: ifne -> 76
/*     */     //   55: iload #13
/*     */     //   57: aload #10
/*     */     //   59: aload_0
/*     */     //   60: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   65: ifeq -> 72
/*     */     //   68: iconst_4
/*     */     //   69: goto -> 73
/*     */     //   72: iconst_2
/*     */     //   73: ior
/*     */     //   74: istore #13
/*     */     //   76: iload #12
/*     */     //   78: iconst_2
/*     */     //   79: iand
/*     */     //   80: ifeq -> 93
/*     */     //   83: iload #13
/*     */     //   85: bipush #48
/*     */     //   87: ior
/*     */     //   88: istore #13
/*     */     //   90: goto -> 124
/*     */     //   93: iload #11
/*     */     //   95: bipush #48
/*     */     //   97: iand
/*     */     //   98: ifne -> 124
/*     */     //   101: iload #13
/*     */     //   103: aload #10
/*     */     //   105: aload_1
/*     */     //   106: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   111: ifeq -> 119
/*     */     //   114: bipush #32
/*     */     //   116: goto -> 121
/*     */     //   119: bipush #16
/*     */     //   121: ior
/*     */     //   122: istore #13
/*     */     //   124: iload #12
/*     */     //   126: iconst_4
/*     */     //   127: iand
/*     */     //   128: ifeq -> 142
/*     */     //   131: iload #13
/*     */     //   133: sipush #384
/*     */     //   136: ior
/*     */     //   137: istore #13
/*     */     //   139: goto -> 176
/*     */     //   142: iload #11
/*     */     //   144: sipush #384
/*     */     //   147: iand
/*     */     //   148: ifne -> 176
/*     */     //   151: iload #13
/*     */     //   153: aload #10
/*     */     //   155: iload_2
/*     */     //   156: invokeinterface changed : (Z)Z
/*     */     //   161: ifeq -> 170
/*     */     //   164: sipush #256
/*     */     //   167: goto -> 173
/*     */     //   170: sipush #128
/*     */     //   173: ior
/*     */     //   174: istore #13
/*     */     //   176: iload #11
/*     */     //   178: sipush #3072
/*     */     //   181: iand
/*     */     //   182: ifne -> 218
/*     */     //   185: iload #13
/*     */     //   187: iload #12
/*     */     //   189: bipush #8
/*     */     //   191: iand
/*     */     //   192: ifne -> 212
/*     */     //   195: aload #10
/*     */     //   197: aload_3
/*     */     //   198: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   203: ifeq -> 212
/*     */     //   206: sipush #2048
/*     */     //   209: goto -> 215
/*     */     //   212: sipush #1024
/*     */     //   215: ior
/*     */     //   216: istore #13
/*     */     //   218: iload #12
/*     */     //   220: bipush #16
/*     */     //   222: iand
/*     */     //   223: ifeq -> 237
/*     */     //   226: iload #13
/*     */     //   228: sipush #24576
/*     */     //   231: ior
/*     */     //   232: istore #13
/*     */     //   234: goto -> 272
/*     */     //   237: iload #11
/*     */     //   239: sipush #24576
/*     */     //   242: iand
/*     */     //   243: ifne -> 272
/*     */     //   246: iload #13
/*     */     //   248: aload #10
/*     */     //   250: iload #4
/*     */     //   252: invokeinterface changed : (I)Z
/*     */     //   257: ifeq -> 266
/*     */     //   260: sipush #16384
/*     */     //   263: goto -> 269
/*     */     //   266: sipush #8192
/*     */     //   269: ior
/*     */     //   270: istore #13
/*     */     //   272: iload #12
/*     */     //   274: bipush #32
/*     */     //   276: iand
/*     */     //   277: ifeq -> 290
/*     */     //   280: iload #13
/*     */     //   282: ldc 196608
/*     */     //   284: ior
/*     */     //   285: istore #13
/*     */     //   287: goto -> 322
/*     */     //   290: iload #11
/*     */     //   292: ldc 196608
/*     */     //   294: iand
/*     */     //   295: ifne -> 322
/*     */     //   298: iload #13
/*     */     //   300: aload #10
/*     */     //   302: aload #5
/*     */     //   304: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   309: ifeq -> 317
/*     */     //   312: ldc 131072
/*     */     //   314: goto -> 319
/*     */     //   317: ldc 65536
/*     */     //   319: ior
/*     */     //   320: istore #13
/*     */     //   322: iload #11
/*     */     //   324: ldc 1572864
/*     */     //   326: iand
/*     */     //   327: ifne -> 362
/*     */     //   330: iload #13
/*     */     //   332: iload #12
/*     */     //   334: bipush #64
/*     */     //   336: iand
/*     */     //   337: ifne -> 357
/*     */     //   340: aload #10
/*     */     //   342: aload #6
/*     */     //   344: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   349: ifeq -> 357
/*     */     //   352: ldc 1048576
/*     */     //   354: goto -> 359
/*     */     //   357: ldc 524288
/*     */     //   359: ior
/*     */     //   360: istore #13
/*     */     //   362: iload #12
/*     */     //   364: sipush #128
/*     */     //   367: iand
/*     */     //   368: ifeq -> 381
/*     */     //   371: iload #13
/*     */     //   373: ldc 12582912
/*     */     //   375: ior
/*     */     //   376: istore #13
/*     */     //   378: goto -> 413
/*     */     //   381: iload #11
/*     */     //   383: ldc 12582912
/*     */     //   385: iand
/*     */     //   386: ifne -> 413
/*     */     //   389: iload #13
/*     */     //   391: aload #10
/*     */     //   393: aload #7
/*     */     //   395: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   400: ifeq -> 408
/*     */     //   403: ldc 8388608
/*     */     //   405: goto -> 410
/*     */     //   408: ldc 4194304
/*     */     //   410: ior
/*     */     //   411: istore #13
/*     */     //   413: iload #11
/*     */     //   415: ldc 100663296
/*     */     //   417: iand
/*     */     //   418: ifne -> 456
/*     */     //   421: iload #13
/*     */     //   423: iload #12
/*     */     //   425: sipush #256
/*     */     //   428: iand
/*     */     //   429: ifne -> 450
/*     */     //   432: aload #10
/*     */     //   434: aload #8
/*     */     //   436: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   441: ifeq -> 450
/*     */     //   444: ldc_w 67108864
/*     */     //   447: goto -> 453
/*     */     //   450: ldc_w 33554432
/*     */     //   453: ior
/*     */     //   454: istore #13
/*     */     //   456: iload #12
/*     */     //   458: sipush #512
/*     */     //   461: iand
/*     */     //   462: ifeq -> 476
/*     */     //   465: iload #13
/*     */     //   467: ldc_w 805306368
/*     */     //   470: ior
/*     */     //   471: istore #13
/*     */     //   473: goto -> 511
/*     */     //   476: iload #11
/*     */     //   478: ldc_w 805306368
/*     */     //   481: iand
/*     */     //   482: ifne -> 511
/*     */     //   485: iload #13
/*     */     //   487: aload #10
/*     */     //   489: aload #9
/*     */     //   491: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   496: ifeq -> 505
/*     */     //   499: ldc_w 536870912
/*     */     //   502: goto -> 508
/*     */     //   505: ldc_w 268435456
/*     */     //   508: ior
/*     */     //   509: istore #13
/*     */     //   511: iload #13
/*     */     //   513: ldc_w 306783379
/*     */     //   516: iand
/*     */     //   517: ldc_w 306783378
/*     */     //   520: if_icmpne -> 533
/*     */     //   523: aload #10
/*     */     //   525: invokeinterface getSkipping : ()Z
/*     */     //   530: ifne -> 2099
/*     */     //   533: aload #10
/*     */     //   535: invokeinterface startDefaults : ()V
/*     */     //   540: iload #11
/*     */     //   542: iconst_1
/*     */     //   543: iand
/*     */     //   544: ifeq -> 557
/*     */     //   547: aload #10
/*     */     //   549: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   554: ifeq -> 864
/*     */     //   557: iload #12
/*     */     //   559: iconst_2
/*     */     //   560: iand
/*     */     //   561: ifeq -> 571
/*     */     //   564: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   567: checkcast androidx/compose/ui/Modifier
/*     */     //   570: astore_1
/*     */     //   571: iload #12
/*     */     //   573: iconst_4
/*     */     //   574: iand
/*     */     //   575: ifeq -> 580
/*     */     //   578: iconst_1
/*     */     //   579: istore_2
/*     */     //   580: iload #12
/*     */     //   582: bipush #8
/*     */     //   584: iand
/*     */     //   585: ifeq -> 607
/*     */     //   588: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   591: aload #10
/*     */     //   593: bipush #6
/*     */     //   595: invokevirtual getDefaultTextStyle : (Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;
/*     */     //   598: astore_3
/*     */     //   599: iload #13
/*     */     //   601: sipush #-7169
/*     */     //   604: iand
/*     */     //   605: istore #13
/*     */     //   607: iload #12
/*     */     //   609: bipush #16
/*     */     //   611: iand
/*     */     //   612: ifeq -> 623
/*     */     //   615: getstatic androidx/compose/ui/text/style/TextOverflow.Companion : Landroidx/compose/ui/text/style/TextOverflow$Companion;
/*     */     //   618: invokevirtual getClip-gIe3tQ8 : ()I
/*     */     //   621: istore #4
/*     */     //   623: iload #12
/*     */     //   625: bipush #32
/*     */     //   627: iand
/*     */     //   628: ifeq -> 717
/*     */     //   631: aload #10
/*     */     //   633: ldc_w 980663920
/*     */     //   636: invokeinterface startReplaceGroup : (I)V
/*     */     //   641: aload #10
/*     */     //   643: astore #15
/*     */     //   645: iconst_0
/*     */     //   646: istore #16
/*     */     //   648: iconst_0
/*     */     //   649: istore #17
/*     */     //   651: aload #15
/*     */     //   653: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   658: astore #18
/*     */     //   660: iconst_0
/*     */     //   661: istore #19
/*     */     //   663: aload #18
/*     */     //   665: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   668: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   671: if_acmpne -> 696
/*     */     //   674: iconst_0
/*     */     //   675: istore #20
/*     */     //   677: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   680: astore #20
/*     */     //   682: aload #15
/*     */     //   684: aload #20
/*     */     //   686: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   691: aload #20
/*     */     //   693: goto -> 698
/*     */     //   696: aload #18
/*     */     //   698: nop
/*     */     //   699: nop
/*     */     //   700: nop
/*     */     //   701: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   704: astore #14
/*     */     //   706: aload #10
/*     */     //   708: invokeinterface endReplaceGroup : ()V
/*     */     //   713: aload #14
/*     */     //   715: astore #5
/*     */     //   717: iload #12
/*     */     //   719: bipush #64
/*     */     //   721: iand
/*     */     //   722: ifeq -> 780
/*     */     //   725: invokestatic getLocalLinkStyle : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   728: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   731: astore #14
/*     */     //   733: bipush #6
/*     */     //   735: istore #15
/*     */     //   737: iconst_0
/*     */     //   738: istore #16
/*     */     //   740: aload #10
/*     */     //   742: ldc 2023513938
/*     */     //   744: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   746: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   749: aload #10
/*     */     //   751: aload #14
/*     */     //   753: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   758: astore #17
/*     */     //   760: aload #10
/*     */     //   762: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   765: aload #17
/*     */     //   767: checkcast org/jetbrains/jewel/ui/component/styling/LinkStyle
/*     */     //   770: astore #6
/*     */     //   772: iload #13
/*     */     //   774: ldc_w -3670017
/*     */     //   777: iand
/*     */     //   778: istore #13
/*     */     //   780: iload #12
/*     */     //   782: sipush #128
/*     */     //   785: iand
/*     */     //   786: ifeq -> 797
/*     */     //   789: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   792: checkcast androidx/compose/ui/Modifier
/*     */     //   795: astore #7
/*     */     //   797: iload #12
/*     */     //   799: sipush #256
/*     */     //   802: iand
/*     */     //   803: ifeq -> 920
/*     */     //   806: invokestatic getLocalMenuStyle : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   809: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   812: astore #14
/*     */     //   814: bipush #6
/*     */     //   816: istore #15
/*     */     //   818: iconst_0
/*     */     //   819: istore #16
/*     */     //   821: aload #10
/*     */     //   823: ldc 2023513938
/*     */     //   825: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   827: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   830: aload #10
/*     */     //   832: aload #14
/*     */     //   834: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   839: astore #17
/*     */     //   841: aload #10
/*     */     //   843: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   846: aload #17
/*     */     //   848: checkcast org/jetbrains/jewel/ui/component/styling/MenuStyle
/*     */     //   851: astore #8
/*     */     //   853: iload #13
/*     */     //   855: ldc_w -234881025
/*     */     //   858: iand
/*     */     //   859: istore #13
/*     */     //   861: goto -> 920
/*     */     //   864: aload #10
/*     */     //   866: invokeinterface skipToGroupEnd : ()V
/*     */     //   871: iload #12
/*     */     //   873: bipush #8
/*     */     //   875: iand
/*     */     //   876: ifeq -> 887
/*     */     //   879: iload #13
/*     */     //   881: sipush #-7169
/*     */     //   884: iand
/*     */     //   885: istore #13
/*     */     //   887: iload #12
/*     */     //   889: bipush #64
/*     */     //   891: iand
/*     */     //   892: ifeq -> 903
/*     */     //   895: iload #13
/*     */     //   897: ldc_w -3670017
/*     */     //   900: iand
/*     */     //   901: istore #13
/*     */     //   903: iload #12
/*     */     //   905: sipush #256
/*     */     //   908: iand
/*     */     //   909: ifeq -> 920
/*     */     //   912: iload #13
/*     */     //   914: ldc_w -234881025
/*     */     //   917: iand
/*     */     //   918: istore #13
/*     */     //   920: aload #10
/*     */     //   922: invokeinterface endDefaults : ()V
/*     */     //   927: invokestatic isTraceInProgress : ()Z
/*     */     //   930: ifeq -> 945
/*     */     //   933: ldc_w -561353012
/*     */     //   936: iload #13
/*     */     //   938: iconst_m1
/*     */     //   939: ldc_w 'org.jetbrains.jewel.ui.component.DropdownLink (Link.kt:114)'
/*     */     //   942: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   945: aload #10
/*     */     //   947: ldc_w 980671627
/*     */     //   950: invokeinterface startReplaceGroup : (I)V
/*     */     //   955: aload #10
/*     */     //   957: astore #16
/*     */     //   959: iconst_0
/*     */     //   960: istore #17
/*     */     //   962: nop
/*     */     //   963: iconst_0
/*     */     //   964: istore #18
/*     */     //   966: aload #16
/*     */     //   968: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   973: astore #19
/*     */     //   975: iconst_0
/*     */     //   976: istore #20
/*     */     //   978: aload #19
/*     */     //   980: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   983: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   986: if_acmpne -> 1018
/*     */     //   989: iconst_0
/*     */     //   990: istore #21
/*     */     //   992: iconst_0
/*     */     //   993: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   996: aconst_null
/*     */     //   997: iconst_2
/*     */     //   998: aconst_null
/*     */     //   999: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   1002: astore #21
/*     */     //   1004: aload #16
/*     */     //   1006: aload #21
/*     */     //   1008: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1013: aload #21
/*     */     //   1015: goto -> 1020
/*     */     //   1018: aload #19
/*     */     //   1020: nop
/*     */     //   1021: nop
/*     */     //   1022: nop
/*     */     //   1023: checkcast androidx/compose/runtime/MutableState
/*     */     //   1026: astore #15
/*     */     //   1028: aload #10
/*     */     //   1030: invokeinterface endReplaceGroup : ()V
/*     */     //   1035: aload #15
/*     */     //   1037: astore #14
/*     */     //   1039: aload #10
/*     */     //   1041: ldc_w 980673355
/*     */     //   1044: invokeinterface startReplaceGroup : (I)V
/*     */     //   1049: aload #10
/*     */     //   1051: astore #17
/*     */     //   1053: iconst_0
/*     */     //   1054: istore #18
/*     */     //   1056: nop
/*     */     //   1057: iconst_0
/*     */     //   1058: istore #19
/*     */     //   1060: aload #17
/*     */     //   1062: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1067: astore #20
/*     */     //   1069: iconst_0
/*     */     //   1070: istore #21
/*     */     //   1072: aload #20
/*     */     //   1074: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1077: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1080: if_acmpne -> 1112
/*     */     //   1083: iconst_0
/*     */     //   1084: istore #22
/*     */     //   1086: iconst_0
/*     */     //   1087: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   1090: aconst_null
/*     */     //   1091: iconst_2
/*     */     //   1092: aconst_null
/*     */     //   1093: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   1096: astore #22
/*     */     //   1098: aload #17
/*     */     //   1100: aload #22
/*     */     //   1102: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1107: aload #22
/*     */     //   1109: goto -> 1114
/*     */     //   1112: aload #20
/*     */     //   1114: nop
/*     */     //   1115: nop
/*     */     //   1116: nop
/*     */     //   1117: checkcast androidx/compose/runtime/MutableState
/*     */     //   1120: astore #16
/*     */     //   1122: aload #10
/*     */     //   1124: invokeinterface endReplaceGroup : ()V
/*     */     //   1129: aload #16
/*     */     //   1131: astore #15
/*     */     //   1133: aload #10
/*     */     //   1135: ldc_w 980675275
/*     */     //   1138: invokeinterface startReplaceGroup : (I)V
/*     */     //   1143: aload #10
/*     */     //   1145: astore #18
/*     */     //   1147: iconst_0
/*     */     //   1148: istore #19
/*     */     //   1150: nop
/*     */     //   1151: iconst_0
/*     */     //   1152: istore #20
/*     */     //   1154: aload #18
/*     */     //   1156: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1161: astore #21
/*     */     //   1163: iconst_0
/*     */     //   1164: istore #22
/*     */     //   1166: aload #21
/*     */     //   1168: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1171: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1174: if_acmpne -> 1206
/*     */     //   1177: iconst_0
/*     */     //   1178: istore #23
/*     */     //   1180: iconst_0
/*     */     //   1181: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   1184: aconst_null
/*     */     //   1185: iconst_2
/*     */     //   1186: aconst_null
/*     */     //   1187: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   1190: astore #23
/*     */     //   1192: aload #18
/*     */     //   1194: aload #23
/*     */     //   1196: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1201: aload #23
/*     */     //   1203: goto -> 1208
/*     */     //   1206: aload #21
/*     */     //   1208: nop
/*     */     //   1209: nop
/*     */     //   1210: nop
/*     */     //   1211: checkcast androidx/compose/runtime/MutableState
/*     */     //   1214: astore #17
/*     */     //   1216: aload #10
/*     */     //   1218: invokeinterface endReplaceGroup : ()V
/*     */     //   1223: aload #17
/*     */     //   1225: astore #16
/*     */     //   1227: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1230: checkcast androidx/compose/ui/Modifier
/*     */     //   1233: aload #10
/*     */     //   1235: ldc_w 980677209
/*     */     //   1238: invokeinterface startReplaceGroup : (I)V
/*     */     //   1243: aload #10
/*     */     //   1245: astore #18
/*     */     //   1247: iconst_0
/*     */     //   1248: istore #19
/*     */     //   1250: iconst_0
/*     */     //   1251: istore #20
/*     */     //   1253: aload #18
/*     */     //   1255: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1260: astore #21
/*     */     //   1262: iconst_0
/*     */     //   1263: istore #22
/*     */     //   1265: aload #21
/*     */     //   1267: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1270: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1273: if_acmpne -> 1307
/*     */     //   1276: astore #56
/*     */     //   1278: iconst_0
/*     */     //   1279: istore #23
/*     */     //   1281: aload #15
/*     */     //   1283: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */     //   1288: aload #56
/*     */     //   1290: swap
/*     */     //   1291: astore #24
/*     */     //   1293: aload #18
/*     */     //   1295: aload #24
/*     */     //   1297: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1302: aload #24
/*     */     //   1304: goto -> 1309
/*     */     //   1307: aload #21
/*     */     //   1309: nop
/*     */     //   1310: nop
/*     */     //   1311: nop
/*     */     //   1312: checkcast kotlin/jvm/functions/Function1
/*     */     //   1315: astore #17
/*     */     //   1317: aload #10
/*     */     //   1319: invokeinterface endReplaceGroup : ()V
/*     */     //   1324: aload #17
/*     */     //   1326: invokestatic onHover : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   1329: astore #17
/*     */     //   1331: iconst_0
/*     */     //   1332: istore #20
/*     */     //   1334: iconst_0
/*     */     //   1335: istore #21
/*     */     //   1337: aload #10
/*     */     //   1339: ldc_w 733328855
/*     */     //   1342: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   1345: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1348: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1351: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */     //   1354: astore #18
/*     */     //   1356: iconst_0
/*     */     //   1357: istore #19
/*     */     //   1359: aload #18
/*     */     //   1361: iload #19
/*     */     //   1363: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1366: astore #22
/*     */     //   1368: bipush #112
/*     */     //   1370: iload #20
/*     */     //   1372: iconst_3
/*     */     //   1373: ishl
/*     */     //   1374: iand
/*     */     //   1375: istore #23
/*     */     //   1377: nop
/*     */     //   1378: iconst_0
/*     */     //   1379: istore #24
/*     */     //   1381: aload #10
/*     */     //   1383: ldc_w -1323940314
/*     */     //   1386: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   1389: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1392: aload #10
/*     */     //   1394: iconst_0
/*     */     //   1395: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   1398: istore #25
/*     */     //   1400: aload #10
/*     */     //   1402: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1407: astore #26
/*     */     //   1409: aload #10
/*     */     //   1411: aload #17
/*     */     //   1413: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1416: astore #27
/*     */     //   1418: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1421: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1424: astore #28
/*     */     //   1426: bipush #6
/*     */     //   1428: sipush #896
/*     */     //   1431: iload #23
/*     */     //   1433: bipush #6
/*     */     //   1435: ishl
/*     */     //   1436: iand
/*     */     //   1437: ior
/*     */     //   1438: istore #29
/*     */     //   1440: nop
/*     */     //   1441: iconst_0
/*     */     //   1442: istore #30
/*     */     //   1444: aload #10
/*     */     //   1446: ldc_w -692256719
/*     */     //   1449: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   1452: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1455: aload #10
/*     */     //   1457: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   1462: instanceof androidx/compose/runtime/Applier
/*     */     //   1465: ifne -> 1471
/*     */     //   1468: invokestatic invalidApplier : ()V
/*     */     //   1471: aload #10
/*     */     //   1473: invokeinterface startReusableNode : ()V
/*     */     //   1478: aload #10
/*     */     //   1480: invokeinterface getInserting : ()Z
/*     */     //   1485: ifeq -> 1500
/*     */     //   1488: aload #10
/*     */     //   1490: aload #28
/*     */     //   1492: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   1497: goto -> 1507
/*     */     //   1500: aload #10
/*     */     //   1502: invokeinterface useNode : ()V
/*     */     //   1507: aload #10
/*     */     //   1509: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   1512: astore #31
/*     */     //   1514: iconst_0
/*     */     //   1515: istore #32
/*     */     //   1517: aload #31
/*     */     //   1519: aload #22
/*     */     //   1521: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1524: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1527: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1530: aload #31
/*     */     //   1532: aload #26
/*     */     //   1534: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1537: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1540: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1543: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1546: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1549: astore #33
/*     */     //   1551: iconst_0
/*     */     //   1552: istore #34
/*     */     //   1554: aload #31
/*     */     //   1556: astore #35
/*     */     //   1558: iconst_0
/*     */     //   1559: istore #36
/*     */     //   1561: aload #35
/*     */     //   1563: invokeinterface getInserting : ()Z
/*     */     //   1568: ifne -> 1589
/*     */     //   1571: aload #35
/*     */     //   1573: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1578: iload #25
/*     */     //   1580: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1583: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1586: ifne -> 1615
/*     */     //   1589: aload #35
/*     */     //   1591: iload #25
/*     */     //   1593: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1596: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1601: aload #31
/*     */     //   1603: iload #25
/*     */     //   1605: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1608: aload #33
/*     */     //   1610: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1615: nop
/*     */     //   1616: nop
/*     */     //   1617: nop
/*     */     //   1618: aload #31
/*     */     //   1620: aload #27
/*     */     //   1622: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1625: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1628: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1631: nop
/*     */     //   1632: nop
/*     */     //   1633: aload #10
/*     */     //   1635: bipush #14
/*     */     //   1637: iload #29
/*     */     //   1639: bipush #6
/*     */     //   1641: ishr
/*     */     //   1642: iand
/*     */     //   1643: istore #37
/*     */     //   1645: astore #38
/*     */     //   1647: iconst_0
/*     */     //   1648: istore #39
/*     */     //   1650: aload #38
/*     */     //   1652: ldc_w -2146769399
/*     */     //   1655: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   1658: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1661: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   1664: aload #38
/*     */     //   1666: bipush #6
/*     */     //   1668: bipush #112
/*     */     //   1670: iload #20
/*     */     //   1672: bipush #6
/*     */     //   1674: ishr
/*     */     //   1675: iand
/*     */     //   1676: ior
/*     */     //   1677: istore #40
/*     */     //   1679: astore #41
/*     */     //   1681: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   1684: astore #42
/*     */     //   1686: iconst_0
/*     */     //   1687: istore #43
/*     */     //   1689: aload #6
/*     */     //   1691: invokevirtual getIcons : ()Lorg/jetbrains/jewel/ui/component/styling/LinkIcons;
/*     */     //   1694: invokevirtual getDropdownChevron : ()Lorg/jetbrains/jewel/ui/icon/IconKey;
/*     */     //   1697: astore #44
/*     */     //   1699: aload_0
/*     */     //   1700: aload #6
/*     */     //   1702: aload #41
/*     */     //   1704: ldc_w -190723586
/*     */     //   1707: invokeinterface startReplaceGroup : (I)V
/*     */     //   1712: aload #41
/*     */     //   1714: astore #45
/*     */     //   1716: iconst_0
/*     */     //   1717: istore #46
/*     */     //   1719: nop
/*     */     //   1720: iconst_0
/*     */     //   1721: istore #47
/*     */     //   1723: aload #45
/*     */     //   1725: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1730: astore #48
/*     */     //   1732: iconst_0
/*     */     //   1733: istore #49
/*     */     //   1735: aload #48
/*     */     //   1737: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1740: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1743: if_acmpne -> 1786
/*     */     //   1746: astore #50
/*     */     //   1748: astore #51
/*     */     //   1750: iconst_0
/*     */     //   1751: istore #52
/*     */     //   1753: aload #16
/*     */     //   1755: aload #14
/*     */     //   1757: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function0;
/*     */     //   1762: astore #53
/*     */     //   1764: aload #51
/*     */     //   1766: aload #50
/*     */     //   1768: aload #53
/*     */     //   1770: astore #54
/*     */     //   1772: aload #45
/*     */     //   1774: aload #54
/*     */     //   1776: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1781: aload #54
/*     */     //   1783: goto -> 1788
/*     */     //   1786: aload #48
/*     */     //   1788: nop
/*     */     //   1789: nop
/*     */     //   1790: nop
/*     */     //   1791: checkcast kotlin/jvm/functions/Function0
/*     */     //   1794: astore #55
/*     */     //   1796: aload #41
/*     */     //   1798: invokeinterface endReplaceGroup : ()V
/*     */     //   1803: aload #55
/*     */     //   1805: aload_1
/*     */     //   1806: iload_2
/*     */     //   1807: aload_3
/*     */     //   1808: iload #4
/*     */     //   1810: aload #5
/*     */     //   1812: aload #44
/*     */     //   1814: aload #41
/*     */     //   1816: sipush #384
/*     */     //   1819: bipush #14
/*     */     //   1821: iload #13
/*     */     //   1823: iand
/*     */     //   1824: ior
/*     */     //   1825: bipush #112
/*     */     //   1827: iload #13
/*     */     //   1829: bipush #15
/*     */     //   1831: ishr
/*     */     //   1832: iand
/*     */     //   1833: ior
/*     */     //   1834: sipush #7168
/*     */     //   1837: iload #13
/*     */     //   1839: bipush #6
/*     */     //   1841: ishl
/*     */     //   1842: iand
/*     */     //   1843: ior
/*     */     //   1844: ldc 57344
/*     */     //   1846: iload #13
/*     */     //   1848: bipush #6
/*     */     //   1850: ishl
/*     */     //   1851: iand
/*     */     //   1852: ior
/*     */     //   1853: ldc 458752
/*     */     //   1855: iload #13
/*     */     //   1857: bipush #6
/*     */     //   1859: ishl
/*     */     //   1860: iand
/*     */     //   1861: ior
/*     */     //   1862: ldc 3670016
/*     */     //   1864: iload #13
/*     */     //   1866: bipush #6
/*     */     //   1868: ishl
/*     */     //   1869: iand
/*     */     //   1870: ior
/*     */     //   1871: ldc 29360128
/*     */     //   1873: iload #13
/*     */     //   1875: bipush #6
/*     */     //   1877: ishl
/*     */     //   1878: iand
/*     */     //   1879: ior
/*     */     //   1880: invokestatic LinkImpl-5LixHlo : (Ljava/lang/String;Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/icon/IconKey;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1883: aload #41
/*     */     //   1885: ldc_w -190709531
/*     */     //   1888: invokeinterface startReplaceGroup : (I)V
/*     */     //   1893: aload #14
/*     */     //   1895: invokestatic DropdownLink_RWo7tUw$lambda$6 : (Landroidx/compose/runtime/MutableState;)Z
/*     */     //   1898: ifeq -> 2049
/*     */     //   1901: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1904: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   1907: astore #44
/*     */     //   1909: aload #41
/*     */     //   1911: ldc_w -190707432
/*     */     //   1914: invokeinterface startReplaceGroup : (I)V
/*     */     //   1919: aload #41
/*     */     //   1921: astore #45
/*     */     //   1923: iconst_0
/*     */     //   1924: istore #46
/*     */     //   1926: nop
/*     */     //   1927: iconst_0
/*     */     //   1928: istore #47
/*     */     //   1930: aload #45
/*     */     //   1932: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1937: astore #48
/*     */     //   1939: iconst_0
/*     */     //   1940: istore #49
/*     */     //   1942: aload #48
/*     */     //   1944: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1947: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1950: if_acmpne -> 1983
/*     */     //   1953: iconst_0
/*     */     //   1954: istore #52
/*     */     //   1956: aload #14
/*     */     //   1958: aload #15
/*     */     //   1960: aload #16
/*     */     //   1962: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */     //   1967: astore #54
/*     */     //   1969: aload #45
/*     */     //   1971: aload #54
/*     */     //   1973: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1978: aload #54
/*     */     //   1980: goto -> 1985
/*     */     //   1983: aload #48
/*     */     //   1985: nop
/*     */     //   1986: nop
/*     */     //   1987: nop
/*     */     //   1988: checkcast kotlin/jvm/functions/Function1
/*     */     //   1991: astore #55
/*     */     //   1993: aload #41
/*     */     //   1995: invokeinterface endReplaceGroup : ()V
/*     */     //   2000: aload #55
/*     */     //   2002: aload #44
/*     */     //   2004: aload #7
/*     */     //   2006: aload #8
/*     */     //   2008: aconst_null
/*     */     //   2009: aload #9
/*     */     //   2011: aload #41
/*     */     //   2013: bipush #54
/*     */     //   2015: sipush #896
/*     */     //   2018: iload #13
/*     */     //   2020: bipush #15
/*     */     //   2022: ishr
/*     */     //   2023: iand
/*     */     //   2024: ior
/*     */     //   2025: sipush #7168
/*     */     //   2028: iload #13
/*     */     //   2030: bipush #15
/*     */     //   2032: ishr
/*     */     //   2033: iand
/*     */     //   2034: ior
/*     */     //   2035: ldc 458752
/*     */     //   2037: iload #13
/*     */     //   2039: bipush #12
/*     */     //   2041: ishr
/*     */     //   2042: iand
/*     */     //   2043: ior
/*     */     //   2044: bipush #16
/*     */     //   2046: invokestatic PopupMenu : (Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
/*     */     //   2049: aload #41
/*     */     //   2051: invokeinterface endReplaceGroup : ()V
/*     */     //   2056: nop
/*     */     //   2057: aload #38
/*     */     //   2059: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2062: aload #10
/*     */     //   2064: invokeinterface endNode : ()V
/*     */     //   2069: aload #10
/*     */     //   2071: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2074: nop
/*     */     //   2075: aload #10
/*     */     //   2077: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2080: nop
/*     */     //   2081: aload #10
/*     */     //   2083: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2086: nop
/*     */     //   2087: invokestatic isTraceInProgress : ()Z
/*     */     //   2090: ifeq -> 2106
/*     */     //   2093: invokestatic traceEventEnd : ()V
/*     */     //   2096: goto -> 2106
/*     */     //   2099: aload #10
/*     */     //   2101: invokeinterface skipToGroupEnd : ()V
/*     */     //   2106: aload #10
/*     */     //   2108: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   2113: dup
/*     */     //   2114: ifnull -> 2150
/*     */     //   2117: aload_0
/*     */     //   2118: aload_1
/*     */     //   2119: iload_2
/*     */     //   2120: aload_3
/*     */     //   2121: iload #4
/*     */     //   2123: aload #5
/*     */     //   2125: aload #6
/*     */     //   2127: aload #7
/*     */     //   2129: aload #8
/*     */     //   2131: aload #9
/*     */     //   2133: iload #11
/*     */     //   2135: iload #12
/*     */     //   2137: <illegal opcode> invoke : (Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;Lkotlin/jvm/functions/Function1;II)Lkotlin/jvm/functions/Function2;
/*     */     //   2142: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   2147: goto -> 2151
/*     */     //   2150: pop
/*     */     //   2151: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #115	-> 14
/*     */     //   #106	-> 564
/*     */     //   #107	-> 578
/*     */     //   #108	-> 588
/*     */     //   #109	-> 615
/*     */     //   #110	-> 631
/*     */     //   #339	-> 651
/*     */     //   #340	-> 663
/*     */     //   #341	-> 674
/*     */     //   #110	-> 677
/*     */     //   #341	-> 680
/*     */     //   #342	-> 682
/*     */     //   #343	-> 691
/*     */     //   #344	-> 696
/*     */     //   #340	-> 698
/*     */     //   #339	-> 699
/*     */     //   #339	-> 700
/*     */     //   #110	-> 701
/*     */     //   #111	-> 725
/*     */     //   #345	-> 746
/*     */     //   #112	-> 789
/*     */     //   #113	-> 806
/*     */     //   #346	-> 827
/*     */     //   #115	-> 942
/*     */     //   #116	-> 962
/*     */     //   #347	-> 966
/*     */     //   #348	-> 978
/*     */     //   #349	-> 989
/*     */     //   #116	-> 992
/*     */     //   #349	-> 1002
/*     */     //   #350	-> 1004
/*     */     //   #351	-> 1013
/*     */     //   #352	-> 1018
/*     */     //   #348	-> 1020
/*     */     //   #347	-> 1021
/*     */     //   #347	-> 1022
/*     */     //   #116	-> 1023
/*     */     //   #117	-> 1056
/*     */     //   #353	-> 1060
/*     */     //   #354	-> 1072
/*     */     //   #355	-> 1083
/*     */     //   #117	-> 1086
/*     */     //   #355	-> 1096
/*     */     //   #356	-> 1098
/*     */     //   #357	-> 1107
/*     */     //   #358	-> 1112
/*     */     //   #354	-> 1114
/*     */     //   #353	-> 1115
/*     */     //   #353	-> 1116
/*     */     //   #117	-> 1117
/*     */     //   #118	-> 1150
/*     */     //   #359	-> 1154
/*     */     //   #360	-> 1166
/*     */     //   #361	-> 1177
/*     */     //   #118	-> 1180
/*     */     //   #361	-> 1190
/*     */     //   #362	-> 1192
/*     */     //   #363	-> 1201
/*     */     //   #364	-> 1206
/*     */     //   #360	-> 1208
/*     */     //   #359	-> 1209
/*     */     //   #359	-> 1210
/*     */     //   #118	-> 1211
/*     */     //   #120	-> 1227
/*     */     //   #365	-> 1253
/*     */     //   #366	-> 1265
/*     */     //   #367	-> 1276
/*     */     //   #120	-> 1281
/*     */     //   #367	-> 1291
/*     */     //   #368	-> 1293
/*     */     //   #369	-> 1302
/*     */     //   #370	-> 1307
/*     */     //   #366	-> 1309
/*     */     //   #365	-> 1310
/*     */     //   #365	-> 1311
/*     */     //   #120	-> 1312
/*     */     //   #371	-> 1345
/*     */     //   #372	-> 1348
/*     */     //   #373	-> 1356
/*     */     //   #376	-> 1359
/*     */     //   #377	-> 1377
/*     */     //   #378	-> 1389
/*     */     //   #379	-> 1395
/*     */     //   #380	-> 1402
/*     */     //   #381	-> 1411
/*     */     //   #383	-> 1418
/*     */     //   #382	-> 1440
/*     */     //   #384	-> 1452
/*     */     //   #385	-> 1455
/*     */     //   #386	-> 1473
/*     */     //   #387	-> 1478
/*     */     //   #388	-> 1490
/*     */     //   #390	-> 1502
/*     */     //   #392	-> 1507
/*     */     //   #393	-> 1517
/*     */     //   #394	-> 1530
/*     */     //   #396	-> 1543
/*     */     //   #397	-> 1554
/*     */     //   #398	-> 1561
/*     */     //   #399	-> 1589
/*     */     //   #400	-> 1601
/*     */     //   #402	-> 1615
/*     */     //   #397	-> 1616
/*     */     //   #402	-> 1617
/*     */     //   #403	-> 1618
/*     */     //   #404	-> 1631
/*     */     //   #392	-> 1632
/*     */     //   #405	-> 1633
/*     */     //   #406	-> 1658
/*     */     //   #135	-> 1689
/*     */     //   #122	-> 1699
/*     */     //   #133	-> 1700
/*     */     //   #123	-> 1719
/*     */     //   #407	-> 1723
/*     */     //   #408	-> 1735
/*     */     //   #409	-> 1746
/*     */     //   #123	-> 1753
/*     */     //   #409	-> 1770
/*     */     //   #410	-> 1772
/*     */     //   #411	-> 1781
/*     */     //   #412	-> 1786
/*     */     //   #408	-> 1788
/*     */     //   #407	-> 1789
/*     */     //   #407	-> 1790
/*     */     //   #123	-> 1791
/*     */     //   #129	-> 1805
/*     */     //   #130	-> 1806
/*     */     //   #134	-> 1807
/*     */     //   #131	-> 1808
/*     */     //   #132	-> 1810
/*     */     //   #135	-> 1812
/*     */     //   #121	-> 1880
/*     */     //   #138	-> 1893
/*     */     //   #149	-> 1901
/*     */     //   #140	-> 1926
/*     */     //   #413	-> 1930
/*     */     //   #414	-> 1942
/*     */     //   #415	-> 1953
/*     */     //   #140	-> 1956
/*     */     //   #415	-> 1967
/*     */     //   #416	-> 1969
/*     */     //   #417	-> 1978
/*     */     //   #418	-> 1983
/*     */     //   #414	-> 1985
/*     */     //   #413	-> 1986
/*     */     //   #413	-> 1987
/*     */     //   #140	-> 1988
/*     */     //   #149	-> 2002
/*     */     //   #147	-> 2004
/*     */     //   #148	-> 2006
/*     */     //   #150	-> 2009
/*     */     //   #139	-> 2046
/*     */     //   #153	-> 2056
/*     */     //   #406	-> 2057
/*     */     //   #405	-> 2062
/*     */     //   #419	-> 2064
/*     */     //   #384	-> 2071
/*     */     //   #420	-> 2074
/*     */     //   #378	-> 2077
/*     */     //   #421	-> 2080
/*     */     //   #371	-> 2083
/*     */     //   #422	-> 2086
/*     */     //   #154	-> 2099
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   677	3	20	$i$a$-cache-LinkKt$DropdownLink$1	I
/*     */     //   682	11	20	value$iv	Ljava/lang/Object;
/*     */     //   663	36	19	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   660	39	18	it$iv	Ljava/lang/Object;
/*     */     //   651	50	17	$i$f$cache	I
/*     */     //   648	53	15	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   648	53	16	invalid$iv	Z
/*     */     //   740	27	16	$i$f$getCurrent	I
/*     */     //   737	30	14	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   737	30	15	$changed$iv	I
/*     */     //   821	27	16	$i$f$getCurrent	I
/*     */     //   818	30	14	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   818	30	15	$changed$iv	I
/*     */     //   992	10	21	$i$a$-cache-LinkKt$DropdownLink$expanded$2	I
/*     */     //   1004	11	21	value$iv	Ljava/lang/Object;
/*     */     //   978	43	20	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   975	46	19	it$iv	Ljava/lang/Object;
/*     */     //   966	57	18	$i$f$cache	I
/*     */     //   963	60	16	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   963	60	17	invalid$iv	Z
/*     */     //   1086	10	22	$i$a$-cache-LinkKt$DropdownLink$hovered$2	I
/*     */     //   1098	11	22	value$iv	Ljava/lang/Object;
/*     */     //   1072	43	21	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1069	46	20	it$iv	Ljava/lang/Object;
/*     */     //   1060	57	19	$i$f$cache	I
/*     */     //   1057	60	17	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1057	60	18	invalid$iv	Z
/*     */     //   1180	10	23	$i$a$-cache-LinkKt$DropdownLink$skipNextClick$2	I
/*     */     //   1192	11	23	value$iv	Ljava/lang/Object;
/*     */     //   1166	43	22	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1163	46	21	it$iv	Ljava/lang/Object;
/*     */     //   1154	57	20	$i$f$cache	I
/*     */     //   1151	60	18	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1151	60	19	invalid$iv	Z
/*     */     //   1281	7	23	$i$a$-cache-LinkKt$DropdownLink$2	I
/*     */     //   1293	11	24	value$iv	Ljava/lang/Object;
/*     */     //   1265	45	22	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1262	48	21	it$iv	Ljava/lang/Object;
/*     */     //   1253	59	20	$i$f$cache	I
/*     */     //   1250	62	18	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1250	62	19	invalid$iv	Z
/*     */     //   1753	9	52	$i$a$-cache-LinkKt$DropdownLink$3$1	I
/*     */     //   1772	11	54	value$iv	Ljava/lang/Object;
/*     */     //   1735	54	49	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1732	57	48	it$iv	Ljava/lang/Object;
/*     */     //   1723	68	47	$i$f$cache	I
/*     */     //   1720	71	45	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1720	71	46	invalid$iv	Z
/*     */     //   1956	11	52	$i$a$-cache-LinkKt$DropdownLink$3$2	I
/*     */     //   1969	11	54	value$iv	Ljava/lang/Object;
/*     */     //   1942	44	49	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1939	47	48	it$iv	Ljava/lang/Object;
/*     */     //   1930	58	47	$i$f$cache	I
/*     */     //   1927	61	45	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1927	61	46	invalid$iv	Z
/*     */     //   1689	368	43	$i$a$-Box-LinkKt$DropdownLink$3	I
/*     */     //   1686	371	42	$this$DropdownLink_RWo7tUw_u24lambda_u2420	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   1686	371	41	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1686	371	40	$changed	I
/*     */     //   1650	412	39	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   1647	415	38	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1647	415	37	$changed$iv	I
/*     */     //   1561	55	36	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   1558	58	35	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1554	64	34	$i$f$set-impl	I
/*     */     //   1551	67	33	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   1517	115	32	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   1514	118	31	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1444	631	30	$i$f$ReusableComposeNode	I
/*     */     //   1441	634	28	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   1441	634	29	$changed$iv$iv$iv	I
/*     */     //   1381	700	24	$i$f$Layout	I
/*     */     //   1400	681	25	compositeKeyHash$iv$iv	I
/*     */     //   1409	672	26	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1418	663	27	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1378	703	23	$changed$iv$iv	I
/*     */     //   1337	750	21	$i$f$Box	I
/*     */     //   1368	719	22	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1334	753	17	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1356	731	18	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   1359	728	19	propagateMinConstraints$iv	Z
/*     */     //   1334	753	20	$changed$iv	I
/*     */     //   1039	1057	14	expanded$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   1133	963	15	hovered$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   1227	869	16	skipNextClick$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   30	2122	13	$dirty	I
/*     */     //   0	2152	0	text	Ljava/lang/String;
/*     */     //   0	2152	1	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	2152	2	enabled	Z
/*     */     //   0	2152	3	textStyle	Landroidx/compose/ui/text/TextStyle;
/*     */     //   0	2152	4	overflow	I
/*     */     //   0	2152	5	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	2152	6	style	Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;
/*     */     //   0	2152	7	menuModifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	2152	8	menuStyle	Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;
/*     */     //   0	2152	9	menuContent	Lkotlin/jvm/functions/Function1;
/*     */     //   0	2152	10	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	2152	11	$changed	I
/*     */   }
/*     */   
/*     */   private static final boolean DropdownLink_RWo7tUw$lambda$6(MutableState $expanded$delegate) {
/* 116 */     State state = (State)$expanded$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 491 */       (Boolean)state.getValue()).booleanValue(); } private static final void DropdownLink_RWo7tUw$lambda$7(MutableState $expanded$delegate, boolean <set-?>) { MutableState mutableState = $expanded$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 492 */     mutableState.setValue(value$iv); } private static final boolean DropdownLink_RWo7tUw$lambda$9(MutableState $hovered$delegate) { State state = (State)$hovered$delegate; Object object = null; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 494 */     return ((Boolean)state.getValue()).booleanValue(); } private static final void DropdownLink_RWo7tUw$lambda$10(MutableState $hovered$delegate, boolean <set-?>) { MutableState mutableState = $hovered$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 495 */     mutableState.setValue(value$iv); } private static final boolean DropdownLink_RWo7tUw$lambda$12(MutableState $skipNextClick$delegate) { State state = (State)$skipNextClick$delegate; Object object = null; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 497 */     return ((Boolean)state.getValue()).booleanValue(); } private static final void DropdownLink_RWo7tUw$lambda$13(MutableState $skipNextClick$delegate, boolean <set-?>) { MutableState mutableState = $skipNextClick$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 498 */     mutableState.setValue(value$iv); }
/*     */   private static final Unit DropdownLink_RWo7tUw$lambda$15$lambda$14(MutableState<Boolean> $hovered$delegate, boolean it) { DropdownLink_RWo7tUw$lambda$10($hovered$delegate, it); return Unit.INSTANCE; }
/* 500 */   private static final Unit DropdownLink_RWo7tUw$lambda$20$lambda$17$lambda$16(MutableState<Boolean> $skipNextClick$delegate, MutableState<Boolean> $expanded$delegate) { if (!DropdownLink_RWo7tUw$lambda$12($skipNextClick$delegate)) DropdownLink_RWo7tUw$lambda$7($expanded$delegate, !DropdownLink_RWo7tUw$lambda$6($expanded$delegate));  DropdownLink_RWo7tUw$lambda$13($skipNextClick$delegate, false); return Unit.INSTANCE; } private static final long LinkImpl_5LixHlo$lambda$23(MutableState $linkState$delegate) { State state = (State)$linkState$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((LinkState)state.getValue()).unbox-impl(); }
/*     */   private static final boolean DropdownLink_RWo7tUw$lambda$20$lambda$19$lambda$18(MutableState<Boolean> $expanded$delegate, MutableState<Boolean> $hovered$delegate, MutableState<Boolean> $skipNextClick$delegate, InputMode it) { DropdownLink_RWo7tUw$lambda$7($expanded$delegate, false); int i = InputMode.Companion.getTouch-aOaMEAU(); if (((it == null) ? false : InputMode.equals-impl0(it.unbox-impl(), i)) && DropdownLink_RWo7tUw$lambda$9($hovered$delegate)) DropdownLink_RWo7tUw$lambda$13($skipNextClick$delegate, true);  return true; } @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") private static final void LinkImpl-5LixHlo(String text, LinkStyle style, Function0 onClick, Modifier modifier, boolean enabled, TextStyle textStyle, int overflow, MutableInteractionSource interactionSource, IconKey icon, Composer $composer, int $changed) { // Byte code:
/*     */     //   0: aload #9
/*     */     //   2: ldc_w 468608455
/*     */     //   5: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   10: astore #9
/*     */     //   12: iload #10
/*     */     //   14: istore #11
/*     */     //   16: iload #10
/*     */     //   18: bipush #6
/*     */     //   20: iand
/*     */     //   21: ifne -> 45
/*     */     //   24: iload #11
/*     */     //   26: aload #9
/*     */     //   28: aload_0
/*     */     //   29: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   34: ifeq -> 41
/*     */     //   37: iconst_4
/*     */     //   38: goto -> 42
/*     */     //   41: iconst_2
/*     */     //   42: ior
/*     */     //   43: istore #11
/*     */     //   45: iload #10
/*     */     //   47: bipush #48
/*     */     //   49: iand
/*     */     //   50: ifne -> 76
/*     */     //   53: iload #11
/*     */     //   55: aload #9
/*     */     //   57: aload_1
/*     */     //   58: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   63: ifeq -> 71
/*     */     //   66: bipush #32
/*     */     //   68: goto -> 73
/*     */     //   71: bipush #16
/*     */     //   73: ior
/*     */     //   74: istore #11
/*     */     //   76: iload #10
/*     */     //   78: sipush #384
/*     */     //   81: iand
/*     */     //   82: ifne -> 110
/*     */     //   85: iload #11
/*     */     //   87: aload #9
/*     */     //   89: aload_2
/*     */     //   90: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   95: ifeq -> 104
/*     */     //   98: sipush #256
/*     */     //   101: goto -> 107
/*     */     //   104: sipush #128
/*     */     //   107: ior
/*     */     //   108: istore #11
/*     */     //   110: iload #10
/*     */     //   112: sipush #3072
/*     */     //   115: iand
/*     */     //   116: ifne -> 144
/*     */     //   119: iload #11
/*     */     //   121: aload #9
/*     */     //   123: aload_3
/*     */     //   124: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   129: ifeq -> 138
/*     */     //   132: sipush #2048
/*     */     //   135: goto -> 141
/*     */     //   138: sipush #1024
/*     */     //   141: ior
/*     */     //   142: istore #11
/*     */     //   144: iload #10
/*     */     //   146: sipush #24576
/*     */     //   149: iand
/*     */     //   150: ifne -> 179
/*     */     //   153: iload #11
/*     */     //   155: aload #9
/*     */     //   157: iload #4
/*     */     //   159: invokeinterface changed : (Z)Z
/*     */     //   164: ifeq -> 173
/*     */     //   167: sipush #16384
/*     */     //   170: goto -> 176
/*     */     //   173: sipush #8192
/*     */     //   176: ior
/*     */     //   177: istore #11
/*     */     //   179: iload #10
/*     */     //   181: ldc 196608
/*     */     //   183: iand
/*     */     //   184: ifne -> 211
/*     */     //   187: iload #11
/*     */     //   189: aload #9
/*     */     //   191: aload #5
/*     */     //   193: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   198: ifeq -> 206
/*     */     //   201: ldc 131072
/*     */     //   203: goto -> 208
/*     */     //   206: ldc 65536
/*     */     //   208: ior
/*     */     //   209: istore #11
/*     */     //   211: iload #10
/*     */     //   213: ldc 1572864
/*     */     //   215: iand
/*     */     //   216: ifne -> 243
/*     */     //   219: iload #11
/*     */     //   221: aload #9
/*     */     //   223: iload #6
/*     */     //   225: invokeinterface changed : (I)Z
/*     */     //   230: ifeq -> 238
/*     */     //   233: ldc 1048576
/*     */     //   235: goto -> 240
/*     */     //   238: ldc 524288
/*     */     //   240: ior
/*     */     //   241: istore #11
/*     */     //   243: iload #10
/*     */     //   245: ldc 12582912
/*     */     //   247: iand
/*     */     //   248: ifne -> 275
/*     */     //   251: iload #11
/*     */     //   253: aload #9
/*     */     //   255: aload #7
/*     */     //   257: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   262: ifeq -> 270
/*     */     //   265: ldc 8388608
/*     */     //   267: goto -> 272
/*     */     //   270: ldc 4194304
/*     */     //   272: ior
/*     */     //   273: istore #11
/*     */     //   275: iload #10
/*     */     //   277: ldc 100663296
/*     */     //   279: iand
/*     */     //   280: ifne -> 330
/*     */     //   283: iload #11
/*     */     //   285: iload #10
/*     */     //   287: ldc_w 134217728
/*     */     //   290: iand
/*     */     //   291: ifne -> 306
/*     */     //   294: aload #9
/*     */     //   296: aload #8
/*     */     //   298: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   303: goto -> 315
/*     */     //   306: aload #9
/*     */     //   308: aload #8
/*     */     //   310: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   315: ifeq -> 324
/*     */     //   318: ldc_w 67108864
/*     */     //   321: goto -> 327
/*     */     //   324: ldc_w 33554432
/*     */     //   327: ior
/*     */     //   328: istore #11
/*     */     //   330: iload #11
/*     */     //   332: ldc_w 38347923
/*     */     //   335: iand
/*     */     //   336: ldc_w 38347922
/*     */     //   339: if_icmpne -> 352
/*     */     //   342: aload #9
/*     */     //   344: invokeinterface getSkipping : ()Z
/*     */     //   349: ifne -> 1948
/*     */     //   352: invokestatic isTraceInProgress : ()Z
/*     */     //   355: ifeq -> 370
/*     */     //   358: ldc_w 468608455
/*     */     //   361: iload #11
/*     */     //   363: iconst_m1
/*     */     //   364: ldc_w 'org.jetbrains.jewel.ui.component.LinkImpl (Link.kt:166)'
/*     */     //   367: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   370: aload #9
/*     */     //   372: ldc_w 167132464
/*     */     //   375: invokeinterface startReplaceGroup : (I)V
/*     */     //   380: aload #9
/*     */     //   382: astore #14
/*     */     //   384: iload #11
/*     */     //   386: ldc 29360128
/*     */     //   388: iand
/*     */     //   389: ldc 8388608
/*     */     //   391: if_icmpne -> 398
/*     */     //   394: iconst_1
/*     */     //   395: goto -> 399
/*     */     //   398: iconst_0
/*     */     //   399: iload #11
/*     */     //   401: ldc 57344
/*     */     //   403: iand
/*     */     //   404: sipush #16384
/*     */     //   407: if_icmpne -> 414
/*     */     //   410: iconst_1
/*     */     //   411: goto -> 415
/*     */     //   414: iconst_0
/*     */     //   415: ior
/*     */     //   416: istore #15
/*     */     //   418: nop
/*     */     //   419: iconst_0
/*     */     //   420: istore #16
/*     */     //   422: aload #14
/*     */     //   424: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   429: astore #17
/*     */     //   431: iconst_0
/*     */     //   432: istore #18
/*     */     //   434: iload #15
/*     */     //   436: ifne -> 450
/*     */     //   439: aload #17
/*     */     //   441: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   444: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   447: if_acmpne -> 494
/*     */     //   450: iconst_0
/*     */     //   451: istore #19
/*     */     //   453: getstatic org/jetbrains/jewel/ui/component/LinkState.Companion : Lorg/jetbrains/jewel/ui/component/LinkState$Companion;
/*     */     //   456: iload #4
/*     */     //   458: iconst_0
/*     */     //   459: iconst_0
/*     */     //   460: iconst_0
/*     */     //   461: iconst_0
/*     */     //   462: iconst_0
/*     */     //   463: bipush #62
/*     */     //   465: aconst_null
/*     */     //   466: invokestatic of-oSacjZw$default : (Lorg/jetbrains/jewel/ui/component/LinkState$Companion;ZZZZZZILjava/lang/Object;)J
/*     */     //   469: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/LinkState;
/*     */     //   472: aconst_null
/*     */     //   473: iconst_2
/*     */     //   474: aconst_null
/*     */     //   475: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   478: astore #20
/*     */     //   480: aload #14
/*     */     //   482: aload #20
/*     */     //   484: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   489: aload #20
/*     */     //   491: goto -> 496
/*     */     //   494: aload #17
/*     */     //   496: nop
/*     */     //   497: nop
/*     */     //   498: nop
/*     */     //   499: checkcast androidx/compose/runtime/MutableState
/*     */     //   502: astore #13
/*     */     //   504: aload #9
/*     */     //   506: invokeinterface endReplaceGroup : ()V
/*     */     //   511: aload #13
/*     */     //   513: astore #12
/*     */     //   515: aload #9
/*     */     //   517: ldc_w 167135419
/*     */     //   520: invokeinterface startReplaceGroup : (I)V
/*     */     //   525: aload #9
/*     */     //   527: astore #13
/*     */     //   529: iload #11
/*     */     //   531: ldc 57344
/*     */     //   533: iand
/*     */     //   534: sipush #16384
/*     */     //   537: if_icmpne -> 544
/*     */     //   540: iconst_1
/*     */     //   541: goto -> 545
/*     */     //   544: iconst_0
/*     */     //   545: istore #14
/*     */     //   547: nop
/*     */     //   548: iconst_0
/*     */     //   549: istore #15
/*     */     //   551: aload #13
/*     */     //   553: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   558: astore #16
/*     */     //   560: iconst_0
/*     */     //   561: istore #17
/*     */     //   563: iload #14
/*     */     //   565: ifne -> 579
/*     */     //   568: aload #16
/*     */     //   570: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   573: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   576: if_acmpne -> 624
/*     */     //   579: iconst_0
/*     */     //   580: istore #18
/*     */     //   582: aload #12
/*     */     //   584: aload #12
/*     */     //   586: invokestatic LinkImpl_5LixHlo$lambda$23 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   589: iload #4
/*     */     //   591: iconst_0
/*     */     //   592: iconst_0
/*     */     //   593: iconst_0
/*     */     //   594: iconst_0
/*     */     //   595: iconst_0
/*     */     //   596: bipush #62
/*     */     //   598: aconst_null
/*     */     //   599: invokestatic copy-oSacjZw$default : (JZZZZZZILjava/lang/Object;)J
/*     */     //   602: invokestatic LinkImpl_5LixHlo$lambda$24 : (Landroidx/compose/runtime/MutableState;J)V
/*     */     //   605: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   608: astore #19
/*     */     //   610: aload #13
/*     */     //   612: aload #19
/*     */     //   614: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   619: aload #19
/*     */     //   621: goto -> 626
/*     */     //   624: aload #16
/*     */     //   626: nop
/*     */     //   627: nop
/*     */     //   628: nop
/*     */     //   629: pop
/*     */     //   630: aload #9
/*     */     //   632: invokeinterface endReplaceGroup : ()V
/*     */     //   637: invokestatic getLocalInputModeManager : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   640: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   643: astore #14
/*     */     //   645: iconst_0
/*     */     //   646: istore #15
/*     */     //   648: iconst_0
/*     */     //   649: istore #16
/*     */     //   651: aload #9
/*     */     //   653: ldc 2023513938
/*     */     //   655: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   657: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   660: aload #9
/*     */     //   662: aload #14
/*     */     //   664: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   669: astore #17
/*     */     //   671: aload #9
/*     */     //   673: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   676: aload #17
/*     */     //   678: checkcast androidx/compose/ui/input/InputModeManager
/*     */     //   681: astore #13
/*     */     //   683: aload #7
/*     */     //   685: aload #9
/*     */     //   687: ldc_w 167141467
/*     */     //   690: invokeinterface startReplaceGroup : (I)V
/*     */     //   695: aload #9
/*     */     //   697: astore #15
/*     */     //   699: iload #11
/*     */     //   701: ldc 29360128
/*     */     //   703: iand
/*     */     //   704: ldc 8388608
/*     */     //   706: if_icmpne -> 713
/*     */     //   709: iconst_1
/*     */     //   710: goto -> 714
/*     */     //   713: iconst_0
/*     */     //   714: aload #9
/*     */     //   716: aload #12
/*     */     //   718: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   723: ior
/*     */     //   724: aload #9
/*     */     //   726: aload #13
/*     */     //   728: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   733: ior
/*     */     //   734: istore #16
/*     */     //   736: iconst_0
/*     */     //   737: istore #17
/*     */     //   739: aload #15
/*     */     //   741: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   746: astore #18
/*     */     //   748: iconst_0
/*     */     //   749: istore #19
/*     */     //   751: iload #16
/*     */     //   753: ifne -> 767
/*     */     //   756: aload #18
/*     */     //   758: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   761: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   764: if_acmpne -> 808
/*     */     //   767: astore #44
/*     */     //   769: iconst_0
/*     */     //   770: istore #20
/*     */     //   772: new org/jetbrains/jewel/ui/component/LinkKt$LinkImpl$2$1
/*     */     //   775: dup
/*     */     //   776: aload #7
/*     */     //   778: aload #13
/*     */     //   780: aload #12
/*     */     //   782: aconst_null
/*     */     //   783: invokespecial <init> : (Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/input/InputModeManager;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
/*     */     //   786: checkcast kotlin/jvm/functions/Function2
/*     */     //   789: aload #44
/*     */     //   791: swap
/*     */     //   792: astore #21
/*     */     //   794: aload #15
/*     */     //   796: aload #21
/*     */     //   798: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   803: aload #21
/*     */     //   805: goto -> 810
/*     */     //   808: aload #18
/*     */     //   810: nop
/*     */     //   811: nop
/*     */     //   812: nop
/*     */     //   813: checkcast kotlin/jvm/functions/Function2
/*     */     //   816: astore #14
/*     */     //   818: aload #9
/*     */     //   820: invokeinterface endReplaceGroup : ()V
/*     */     //   825: aload #14
/*     */     //   827: aload #9
/*     */     //   829: bipush #14
/*     */     //   831: iload #11
/*     */     //   833: bipush #21
/*     */     //   835: ishr
/*     */     //   836: iand
/*     */     //   837: invokestatic LaunchedEffect : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   840: aload_1
/*     */     //   841: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/LinkColors;
/*     */     //   844: aload #12
/*     */     //   846: invokestatic LinkImpl_5LixHlo$lambda$23 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   849: aload #9
/*     */     //   851: iconst_0
/*     */     //   852: invokevirtual contentFor-Qusrf_U : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   855: astore #14
/*     */     //   857: aload_1
/*     */     //   858: invokevirtual getUnderlineBehavior : ()Lorg/jetbrains/jewel/ui/component/styling/LinkUnderlineBehavior;
/*     */     //   861: astore #16
/*     */     //   863: aload #12
/*     */     //   865: invokestatic LinkImpl_5LixHlo$lambda$23 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   868: lstore #17
/*     */     //   870: aload #14
/*     */     //   872: invokestatic LinkImpl_5LixHlo$lambda$27 : (Landroidx/compose/runtime/State;)J
/*     */     //   875: lstore #19
/*     */     //   877: aload #9
/*     */     //   879: ldc_w 167171757
/*     */     //   882: invokeinterface startReplaceGroup : (I)V
/*     */     //   887: aload #9
/*     */     //   889: astore #22
/*     */     //   891: aload #9
/*     */     //   893: aload #16
/*     */     //   895: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   900: iload #11
/*     */     //   902: ldc 458752
/*     */     //   904: iand
/*     */     //   905: ldc 131072
/*     */     //   907: if_icmpne -> 914
/*     */     //   910: iconst_1
/*     */     //   911: goto -> 915
/*     */     //   914: iconst_0
/*     */     //   915: ior
/*     */     //   916: aload #9
/*     */     //   918: lload #17
/*     */     //   920: invokeinterface changed : (J)Z
/*     */     //   925: ior
/*     */     //   926: aload #9
/*     */     //   928: lload #19
/*     */     //   930: invokeinterface changed : (J)Z
/*     */     //   935: ior
/*     */     //   936: istore #23
/*     */     //   938: iconst_0
/*     */     //   939: istore #24
/*     */     //   941: aload #22
/*     */     //   943: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   948: astore #25
/*     */     //   950: iconst_0
/*     */     //   951: istore #26
/*     */     //   953: iload #23
/*     */     //   955: ifne -> 969
/*     */     //   958: aload #25
/*     */     //   960: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   963: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   966: if_acmpne -> 1088
/*     */     //   969: iconst_0
/*     */     //   970: istore #27
/*     */     //   972: nop
/*     */     //   973: aload_1
/*     */     //   974: invokevirtual getUnderlineBehavior : ()Lorg/jetbrains/jewel/ui/component/styling/LinkUnderlineBehavior;
/*     */     //   977: getstatic org/jetbrains/jewel/ui/component/styling/LinkUnderlineBehavior.ShowAlways : Lorg/jetbrains/jewel/ui/component/styling/LinkUnderlineBehavior;
/*     */     //   980: if_acmpne -> 992
/*     */     //   983: getstatic androidx/compose/ui/text/style/TextDecoration.Companion : Landroidx/compose/ui/text/style/TextDecoration$Companion;
/*     */     //   986: invokevirtual getUnderline : ()Landroidx/compose/ui/text/style/TextDecoration;
/*     */     //   989: goto -> 1028
/*     */     //   992: aload_1
/*     */     //   993: invokevirtual getUnderlineBehavior : ()Lorg/jetbrains/jewel/ui/component/styling/LinkUnderlineBehavior;
/*     */     //   996: getstatic org/jetbrains/jewel/ui/component/styling/LinkUnderlineBehavior.ShowOnHover : Lorg/jetbrains/jewel/ui/component/styling/LinkUnderlineBehavior;
/*     */     //   999: if_acmpne -> 1022
/*     */     //   1002: aload #12
/*     */     //   1004: invokestatic LinkImpl_5LixHlo$lambda$23 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1007: invokestatic isHovered-impl : (J)Z
/*     */     //   1010: ifeq -> 1022
/*     */     //   1013: getstatic androidx/compose/ui/text/style/TextDecoration.Companion : Landroidx/compose/ui/text/style/TextDecoration$Companion;
/*     */     //   1016: invokevirtual getUnderline : ()Landroidx/compose/ui/text/style/TextDecoration;
/*     */     //   1019: goto -> 1028
/*     */     //   1022: getstatic androidx/compose/ui/text/style/TextDecoration.Companion : Landroidx/compose/ui/text/style/TextDecoration$Companion;
/*     */     //   1025: invokevirtual getNone : ()Landroidx/compose/ui/text/style/TextDecoration;
/*     */     //   1028: astore #28
/*     */     //   1030: aload #14
/*     */     //   1032: invokestatic LinkImpl_5LixHlo$lambda$27 : (Landroidx/compose/runtime/State;)J
/*     */     //   1035: lstore #29
/*     */     //   1037: aload #5
/*     */     //   1039: lload #29
/*     */     //   1041: lconst_0
/*     */     //   1042: aconst_null
/*     */     //   1043: aconst_null
/*     */     //   1044: aconst_null
/*     */     //   1045: aconst_null
/*     */     //   1046: aconst_null
/*     */     //   1047: lconst_0
/*     */     //   1048: aconst_null
/*     */     //   1049: aconst_null
/*     */     //   1050: aconst_null
/*     */     //   1051: lconst_0
/*     */     //   1052: aload #28
/*     */     //   1054: aconst_null
/*     */     //   1055: aconst_null
/*     */     //   1056: iconst_0
/*     */     //   1057: iconst_0
/*     */     //   1058: lconst_0
/*     */     //   1059: aconst_null
/*     */     //   1060: aconst_null
/*     */     //   1061: iconst_0
/*     */     //   1062: iconst_0
/*     */     //   1063: aconst_null
/*     */     //   1064: aconst_null
/*     */     //   1065: ldc_w 16773118
/*     */     //   1068: aconst_null
/*     */     //   1069: invokestatic merge-dA7vx0o$default : (Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/TextMotion;ILjava/lang/Object;)Landroidx/compose/ui/text/TextStyle;
/*     */     //   1072: astore #31
/*     */     //   1074: aload #22
/*     */     //   1076: aload #31
/*     */     //   1078: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1083: aload #31
/*     */     //   1085: goto -> 1090
/*     */     //   1088: aload #25
/*     */     //   1090: nop
/*     */     //   1091: nop
/*     */     //   1092: nop
/*     */     //   1093: checkcast androidx/compose/ui/text/TextStyle
/*     */     //   1096: astore #21
/*     */     //   1098: aload #9
/*     */     //   1100: invokeinterface endReplaceGroup : ()V
/*     */     //   1105: aload #21
/*     */     //   1107: astore #15
/*     */     //   1109: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1112: checkcast androidx/compose/ui/Modifier
/*     */     //   1115: new java/awt/Cursor
/*     */     //   1118: dup
/*     */     //   1119: bipush #12
/*     */     //   1121: invokespecial <init> : (I)V
/*     */     //   1124: invokestatic PointerIcon : (Ljava/awt/Cursor;)Landroidx/compose/ui/input/pointer/PointerIcon;
/*     */     //   1127: iconst_0
/*     */     //   1128: iconst_2
/*     */     //   1129: aconst_null
/*     */     //   1130: invokestatic pointerHoverIcon$default : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/input/pointer/PointerIcon;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   1133: astore #16
/*     */     //   1135: aload_3
/*     */     //   1136: astore #18
/*     */     //   1138: aload #12
/*     */     //   1140: invokestatic LinkImpl_5LixHlo$lambda$23 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1143: invokestatic isEnabled-impl : (J)Z
/*     */     //   1146: istore #19
/*     */     //   1148: iconst_0
/*     */     //   1149: istore #20
/*     */     //   1151: iload #19
/*     */     //   1153: ifeq -> 1169
/*     */     //   1156: aload #18
/*     */     //   1158: astore #21
/*     */     //   1160: iconst_0
/*     */     //   1161: istore #22
/*     */     //   1163: aload #16
/*     */     //   1165: nop
/*     */     //   1166: goto -> 1171
/*     */     //   1169: aload #18
/*     */     //   1171: astore #17
/*     */     //   1173: getstatic androidx/compose/ui/semantics/Role.Companion : Landroidx/compose/ui/semantics/Role$Companion;
/*     */     //   1176: invokevirtual getButton-o7Vup1c : ()I
/*     */     //   1179: istore #18
/*     */     //   1181: aload #17
/*     */     //   1183: aload #7
/*     */     //   1185: aconst_null
/*     */     //   1186: iload #4
/*     */     //   1188: aconst_null
/*     */     //   1189: iload #18
/*     */     //   1191: invokestatic box-impl : (I)Landroidx/compose/ui/semantics/Role;
/*     */     //   1194: aload #9
/*     */     //   1196: ldc_w 167195380
/*     */     //   1199: invokeinterface startReplaceGroup : (I)V
/*     */     //   1204: aload #9
/*     */     //   1206: astore #20
/*     */     //   1208: aload #9
/*     */     //   1210: aload #12
/*     */     //   1212: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   1217: iload #11
/*     */     //   1219: sipush #896
/*     */     //   1222: iand
/*     */     //   1223: sipush #256
/*     */     //   1226: if_icmpne -> 1233
/*     */     //   1229: iconst_1
/*     */     //   1230: goto -> 1234
/*     */     //   1233: iconst_0
/*     */     //   1234: ior
/*     */     //   1235: istore #21
/*     */     //   1237: nop
/*     */     //   1238: iconst_0
/*     */     //   1239: istore #22
/*     */     //   1241: aload #20
/*     */     //   1243: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1248: astore #23
/*     */     //   1250: iconst_0
/*     */     //   1251: istore #24
/*     */     //   1253: iload #21
/*     */     //   1255: ifne -> 1269
/*     */     //   1258: aload #23
/*     */     //   1260: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1263: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1266: if_acmpne -> 1324
/*     */     //   1269: astore #49
/*     */     //   1271: astore #48
/*     */     //   1273: istore #47
/*     */     //   1275: astore #46
/*     */     //   1277: astore #45
/*     */     //   1279: astore #44
/*     */     //   1281: iconst_0
/*     */     //   1282: istore #25
/*     */     //   1284: aload_2
/*     */     //   1285: aload #12
/*     */     //   1287: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function0;
/*     */     //   1292: astore #50
/*     */     //   1294: aload #44
/*     */     //   1296: aload #45
/*     */     //   1298: aload #46
/*     */     //   1300: iload #47
/*     */     //   1302: aload #48
/*     */     //   1304: aload #49
/*     */     //   1306: aload #50
/*     */     //   1308: astore #26
/*     */     //   1310: aload #20
/*     */     //   1312: aload #26
/*     */     //   1314: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1319: aload #26
/*     */     //   1321: goto -> 1326
/*     */     //   1324: aload #23
/*     */     //   1326: nop
/*     */     //   1327: nop
/*     */     //   1328: nop
/*     */     //   1329: checkcast kotlin/jvm/functions/Function0
/*     */     //   1332: astore #19
/*     */     //   1334: aload #9
/*     */     //   1336: invokeinterface endReplaceGroup : ()V
/*     */     //   1341: aload #19
/*     */     //   1343: bipush #8
/*     */     //   1345: aconst_null
/*     */     //   1346: invokestatic clickable-O2vRcR0$default : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   1349: aload #12
/*     */     //   1351: invokestatic LinkImpl_5LixHlo$lambda$23 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1354: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/LinkState;
/*     */     //   1357: aload_1
/*     */     //   1358: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/LinkMetrics;
/*     */     //   1361: invokevirtual getFocusHaloCornerSize : ()Landroidx/compose/foundation/shape/CornerSize;
/*     */     //   1364: invokestatic RoundedCornerShape : (Landroidx/compose/foundation/shape/CornerSize;)Landroidx/compose/foundation/shape/RoundedCornerShape;
/*     */     //   1367: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   1370: aconst_null
/*     */     //   1371: fconst_0
/*     */     //   1372: fconst_0
/*     */     //   1373: aload #9
/*     */     //   1375: iconst_0
/*     */     //   1376: bipush #28
/*     */     //   1378: invokestatic focusOutline-AGcomas : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/foundation/state/FocusableComponentState;Landroidx/compose/ui/graphics/Shape;Lorg/jetbrains/jewel/foundation/Stroke$Alignment;FFLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;
/*     */     //   1381: astore #17
/*     */     //   1383: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   1386: aload_1
/*     */     //   1387: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/LinkMetrics;
/*     */     //   1390: invokevirtual getTextIconGap-D9Ej5fM : ()F
/*     */     //   1393: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*     */     //   1396: checkcast androidx/compose/foundation/layout/Arrangement$Horizontal
/*     */     //   1399: astore #18
/*     */     //   1401: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1404: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   1407: astore #19
/*     */     //   1409: sipush #384
/*     */     //   1412: istore #20
/*     */     //   1414: nop
/*     */     //   1415: iconst_0
/*     */     //   1416: istore #21
/*     */     //   1418: aload #9
/*     */     //   1420: ldc_w 693286680
/*     */     //   1423: ldc_w 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*     */     //   1426: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1429: aload #18
/*     */     //   1431: aload #19
/*     */     //   1433: aload #9
/*     */     //   1435: bipush #14
/*     */     //   1437: iload #20
/*     */     //   1439: iconst_3
/*     */     //   1440: ishr
/*     */     //   1441: iand
/*     */     //   1442: bipush #112
/*     */     //   1444: iload #20
/*     */     //   1446: iconst_3
/*     */     //   1447: ishr
/*     */     //   1448: iand
/*     */     //   1449: ior
/*     */     //   1450: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1453: astore #22
/*     */     //   1455: bipush #112
/*     */     //   1457: iload #20
/*     */     //   1459: iconst_3
/*     */     //   1460: ishl
/*     */     //   1461: iand
/*     */     //   1462: istore #23
/*     */     //   1464: nop
/*     */     //   1465: iconst_0
/*     */     //   1466: istore #24
/*     */     //   1468: aload #9
/*     */     //   1470: ldc_w -1323940314
/*     */     //   1473: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   1476: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1479: aload #9
/*     */     //   1481: iconst_0
/*     */     //   1482: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   1485: istore #25
/*     */     //   1487: aload #9
/*     */     //   1489: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1494: astore #26
/*     */     //   1496: aload #9
/*     */     //   1498: aload #17
/*     */     //   1500: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1503: astore #27
/*     */     //   1505: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1508: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1511: astore #28
/*     */     //   1513: bipush #6
/*     */     //   1515: sipush #896
/*     */     //   1518: iload #23
/*     */     //   1520: bipush #6
/*     */     //   1522: ishl
/*     */     //   1523: iand
/*     */     //   1524: ior
/*     */     //   1525: istore #29
/*     */     //   1527: nop
/*     */     //   1528: iconst_0
/*     */     //   1529: istore #30
/*     */     //   1531: aload #9
/*     */     //   1533: ldc_w -692256719
/*     */     //   1536: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   1539: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1542: aload #9
/*     */     //   1544: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   1549: instanceof androidx/compose/runtime/Applier
/*     */     //   1552: ifne -> 1558
/*     */     //   1555: invokestatic invalidApplier : ()V
/*     */     //   1558: aload #9
/*     */     //   1560: invokeinterface startReusableNode : ()V
/*     */     //   1565: aload #9
/*     */     //   1567: invokeinterface getInserting : ()Z
/*     */     //   1572: ifeq -> 1587
/*     */     //   1575: aload #9
/*     */     //   1577: aload #28
/*     */     //   1579: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   1584: goto -> 1594
/*     */     //   1587: aload #9
/*     */     //   1589: invokeinterface useNode : ()V
/*     */     //   1594: aload #9
/*     */     //   1596: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   1599: astore #31
/*     */     //   1601: iconst_0
/*     */     //   1602: istore #32
/*     */     //   1604: aload #31
/*     */     //   1606: aload #22
/*     */     //   1608: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1611: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1614: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1617: aload #31
/*     */     //   1619: aload #26
/*     */     //   1621: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1624: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1627: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1630: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1633: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1636: astore #33
/*     */     //   1638: iconst_0
/*     */     //   1639: istore #34
/*     */     //   1641: aload #31
/*     */     //   1643: astore #35
/*     */     //   1645: iconst_0
/*     */     //   1646: istore #36
/*     */     //   1648: aload #35
/*     */     //   1650: invokeinterface getInserting : ()Z
/*     */     //   1655: ifne -> 1676
/*     */     //   1658: aload #35
/*     */     //   1660: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1665: iload #25
/*     */     //   1667: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1670: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1673: ifne -> 1702
/*     */     //   1676: aload #35
/*     */     //   1678: iload #25
/*     */     //   1680: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1683: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1688: aload #31
/*     */     //   1690: iload #25
/*     */     //   1692: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1695: aload #33
/*     */     //   1697: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1702: nop
/*     */     //   1703: nop
/*     */     //   1704: nop
/*     */     //   1705: aload #31
/*     */     //   1707: aload #27
/*     */     //   1709: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1712: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1715: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1718: nop
/*     */     //   1719: nop
/*     */     //   1720: aload #9
/*     */     //   1722: bipush #14
/*     */     //   1724: iload #29
/*     */     //   1726: bipush #6
/*     */     //   1728: ishr
/*     */     //   1729: iand
/*     */     //   1730: istore #37
/*     */     //   1732: astore #38
/*     */     //   1734: iconst_0
/*     */     //   1735: istore #39
/*     */     //   1737: aload #38
/*     */     //   1739: ldc_w -407840262
/*     */     //   1742: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*     */     //   1745: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1748: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*     */     //   1751: aload #38
/*     */     //   1753: bipush #6
/*     */     //   1755: bipush #112
/*     */     //   1757: iload #20
/*     */     //   1759: bipush #6
/*     */     //   1761: ishr
/*     */     //   1762: iand
/*     */     //   1763: ior
/*     */     //   1764: istore #40
/*     */     //   1766: astore #41
/*     */     //   1768: checkcast androidx/compose/foundation/layout/RowScope
/*     */     //   1771: astore #42
/*     */     //   1773: iconst_0
/*     */     //   1774: istore #43
/*     */     //   1776: aload_0
/*     */     //   1777: aconst_null
/*     */     //   1778: aload #15
/*     */     //   1780: aconst_null
/*     */     //   1781: iload #6
/*     */     //   1783: iconst_1
/*     */     //   1784: iconst_1
/*     */     //   1785: iconst_0
/*     */     //   1786: aconst_null
/*     */     //   1787: aload #41
/*     */     //   1789: ldc_w 1769472
/*     */     //   1792: bipush #14
/*     */     //   1794: iload #11
/*     */     //   1796: iand
/*     */     //   1797: ior
/*     */     //   1798: ldc 57344
/*     */     //   1800: iload #11
/*     */     //   1802: bipush #6
/*     */     //   1804: ishr
/*     */     //   1805: iand
/*     */     //   1806: ior
/*     */     //   1807: sipush #394
/*     */     //   1810: invokestatic BasicText-VhcvRP8 : (Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1813: aload #41
/*     */     //   1815: ldc_w 1658558147
/*     */     //   1818: invokeinterface startReplaceGroup : (I)V
/*     */     //   1823: aload #8
/*     */     //   1825: ifnull -> 1898
/*     */     //   1828: aload #8
/*     */     //   1830: aconst_null
/*     */     //   1831: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1834: checkcast androidx/compose/ui/Modifier
/*     */     //   1837: aload_1
/*     */     //   1838: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/LinkMetrics;
/*     */     //   1841: invokevirtual getIconSize-MYxV2XQ : ()J
/*     */     //   1844: invokestatic size-6HolHcs : (Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;
/*     */     //   1847: aconst_null
/*     */     //   1848: aload #12
/*     */     //   1850: invokestatic LinkImpl_5LixHlo$lambda$23 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1853: invokestatic isEnabled-impl : (J)Z
/*     */     //   1856: ifne -> 1868
/*     */     //   1859: getstatic androidx/compose/ui/graphics/ColorFilter.Companion : Landroidx/compose/ui/graphics/ColorFilter$Companion;
/*     */     //   1862: invokestatic disabled : (Landroidx/compose/ui/graphics/ColorFilter$Companion;)Landroidx/compose/ui/graphics/ColorFilter;
/*     */     //   1865: goto -> 1869
/*     */     //   1868: aconst_null
/*     */     //   1869: aload #12
/*     */     //   1871: invokestatic LinkImpl_5LixHlo$lambda$23 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1874: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/LinkState;
/*     */     //   1877: invokestatic Stateful : (Lorg/jetbrains/jewel/foundation/state/InteractiveComponentState;)Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   1880: aload #41
/*     */     //   1882: bipush #48
/*     */     //   1884: bipush #14
/*     */     //   1886: iload #11
/*     */     //   1888: bipush #24
/*     */     //   1890: ishr
/*     */     //   1891: iand
/*     */     //   1892: ior
/*     */     //   1893: bipush #8
/*     */     //   1895: invokestatic Icon : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Class;Landroidx/compose/ui/graphics/ColorFilter;Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1898: aload #41
/*     */     //   1900: invokeinterface endReplaceGroup : ()V
/*     */     //   1905: nop
/*     */     //   1906: aload #38
/*     */     //   1908: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1911: aload #9
/*     */     //   1913: invokeinterface endNode : ()V
/*     */     //   1918: aload #9
/*     */     //   1920: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1923: nop
/*     */     //   1924: aload #9
/*     */     //   1926: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1929: nop
/*     */     //   1930: aload #9
/*     */     //   1932: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1935: nop
/*     */     //   1936: invokestatic isTraceInProgress : ()Z
/*     */     //   1939: ifeq -> 1955
/*     */     //   1942: invokestatic traceEventEnd : ()V
/*     */     //   1945: goto -> 1955
/*     */     //   1948: aload #9
/*     */     //   1950: invokeinterface skipToGroupEnd : ()V
/*     */     //   1955: aload #9
/*     */     //   1957: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1962: dup
/*     */     //   1963: ifnull -> 1995
/*     */     //   1966: aload_0
/*     */     //   1967: aload_1
/*     */     //   1968: aload_2
/*     */     //   1969: aload_3
/*     */     //   1970: iload #4
/*     */     //   1972: aload #5
/*     */     //   1974: iload #6
/*     */     //   1976: aload #7
/*     */     //   1978: aload #8
/*     */     //   1980: iload #10
/*     */     //   1982: <illegal opcode> invoke : (Ljava/lang/String;Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/icon/IconKey;I)Lkotlin/jvm/functions/Function2;
/*     */     //   1987: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1992: goto -> 1996
/*     */     //   1995: pop
/*     */     //   1996: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #167	-> 0
/*     */     //   #168	-> 418
/*     */     //   #423	-> 422
/*     */     //   #424	-> 434
/*     */     //   #425	-> 450
/*     */     //   #168	-> 453
/*     */     //   #425	-> 478
/*     */     //   #426	-> 480
/*     */     //   #427	-> 489
/*     */     //   #428	-> 494
/*     */     //   #424	-> 496
/*     */     //   #423	-> 497
/*     */     //   #423	-> 498
/*     */     //   #168	-> 499
/*     */     //   #169	-> 547
/*     */     //   #429	-> 551
/*     */     //   #430	-> 563
/*     */     //   #431	-> 579
/*     */     //   #169	-> 582
/*     */     //   #431	-> 608
/*     */     //   #432	-> 610
/*     */     //   #433	-> 619
/*     */     //   #434	-> 624
/*     */     //   #430	-> 626
/*     */     //   #429	-> 627
/*     */     //   #429	-> 628
/*     */     //   #171	-> 637
/*     */     //   #435	-> 657
/*     */     //   #171	-> 678
/*     */     //   #172	-> 683
/*     */     //   #436	-> 739
/*     */     //   #437	-> 751
/*     */     //   #438	-> 767
/*     */     //   #172	-> 772
/*     */     //   #438	-> 792
/*     */     //   #439	-> 794
/*     */     //   #440	-> 803
/*     */     //   #441	-> 808
/*     */     //   #437	-> 810
/*     */     //   #436	-> 811
/*     */     //   #436	-> 812
/*     */     //   #172	-> 813
/*     */     //   #192	-> 840
/*     */     //   #194	-> 857
/*     */     //   #442	-> 941
/*     */     //   #443	-> 953
/*     */     //   #444	-> 969
/*     */     //   #196	-> 972
/*     */     //   #197	-> 973
/*     */     //   #198	-> 992
/*     */     //   #199	-> 1022
/*     */     //   #196	-> 1028
/*     */     //   #195	-> 1028
/*     */     //   #202	-> 1030
/*     */     //   #444	-> 1072
/*     */     //   #445	-> 1074
/*     */     //   #446	-> 1083
/*     */     //   #447	-> 1088
/*     */     //   #443	-> 1090
/*     */     //   #442	-> 1091
/*     */     //   #442	-> 1092
/*     */     //   #194	-> 1093
/*     */     //   #193	-> 1107
/*     */     //   #205	-> 1109
/*     */     //   #209	-> 1135
/*     */     //   #210	-> 1138
/*     */     //   #448	-> 1151
/*     */     //   #210	-> 1165
/*     */     //   #448	-> 1166
/*     */     //   #210	-> 1171
/*     */     //   #217	-> 1173
/*     */     //   #210	-> 1181
/*     */     //   #218	-> 1183
/*     */     //   #219	-> 1185
/*     */     //   #216	-> 1186
/*     */     //   #211	-> 1188
/*     */     //   #217	-> 1189
/*     */     //   #212	-> 1237
/*     */     //   #449	-> 1241
/*     */     //   #450	-> 1253
/*     */     //   #451	-> 1269
/*     */     //   #212	-> 1284
/*     */     //   #451	-> 1308
/*     */     //   #452	-> 1310
/*     */     //   #453	-> 1319
/*     */     //   #454	-> 1324
/*     */     //   #450	-> 1326
/*     */     //   #449	-> 1327
/*     */     //   #449	-> 1328
/*     */     //   #212	-> 1329
/*     */     //   #211	-> 1343
/*     */     //   #221	-> 1349
/*     */     //   #222	-> 1383
/*     */     //   #223	-> 1401
/*     */     //   #207	-> 1414
/*     */     //   #455	-> 1426
/*     */     //   #456	-> 1429
/*     */     //   #457	-> 1464
/*     */     //   #458	-> 1476
/*     */     //   #459	-> 1482
/*     */     //   #460	-> 1489
/*     */     //   #461	-> 1498
/*     */     //   #463	-> 1505
/*     */     //   #462	-> 1527
/*     */     //   #464	-> 1539
/*     */     //   #465	-> 1542
/*     */     //   #466	-> 1560
/*     */     //   #467	-> 1565
/*     */     //   #468	-> 1577
/*     */     //   #470	-> 1589
/*     */     //   #472	-> 1594
/*     */     //   #473	-> 1604
/*     */     //   #474	-> 1617
/*     */     //   #476	-> 1630
/*     */     //   #477	-> 1641
/*     */     //   #478	-> 1648
/*     */     //   #479	-> 1676
/*     */     //   #480	-> 1688
/*     */     //   #482	-> 1702
/*     */     //   #477	-> 1703
/*     */     //   #482	-> 1704
/*     */     //   #483	-> 1705
/*     */     //   #484	-> 1718
/*     */     //   #472	-> 1719
/*     */     //   #485	-> 1720
/*     */     //   #486	-> 1745
/*     */     //   #225	-> 1776
/*     */     //   #227	-> 1823
/*     */     //   #229	-> 1828
/*     */     //   #230	-> 1830
/*     */     //   #231	-> 1831
/*     */     //   #232	-> 1848
/*     */     //   #233	-> 1869
/*     */     //   #228	-> 1895
/*     */     //   #236	-> 1905
/*     */     //   #486	-> 1906
/*     */     //   #485	-> 1911
/*     */     //   #487	-> 1913
/*     */     //   #464	-> 1920
/*     */     //   #488	-> 1923
/*     */     //   #458	-> 1926
/*     */     //   #489	-> 1929
/*     */     //   #455	-> 1932
/*     */     //   #490	-> 1935
/*     */     //   #237	-> 1948
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   453	25	19	$i$a$-cache-LinkKt$LinkImpl$linkState$2	I
/*     */     //   480	11	20	value$iv	Ljava/lang/Object;
/*     */     //   434	63	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   431	66	17	it$iv	Ljava/lang/Object;
/*     */     //   422	77	16	$i$f$cache	I
/*     */     //   419	80	14	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   419	80	15	invalid$iv	Z
/*     */     //   582	23	18	$i$a$-cache-LinkKt$LinkImpl$1	I
/*     */     //   610	11	19	value$iv	Ljava/lang/Object;
/*     */     //   563	64	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   560	67	16	it$iv	Ljava/lang/Object;
/*     */     //   551	78	15	$i$f$cache	I
/*     */     //   548	81	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   548	81	14	invalid$iv	Z
/*     */     //   651	27	16	$i$f$getCurrent	I
/*     */     //   648	30	14	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   648	30	15	$changed$iv	I
/*     */     //   772	17	20	$i$a$-cache-LinkKt$LinkImpl$2	I
/*     */     //   794	11	21	value$iv	Ljava/lang/Object;
/*     */     //   751	60	19	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   748	63	18	it$iv	Ljava/lang/Object;
/*     */     //   739	74	17	$i$f$cache	I
/*     */     //   736	77	15	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   736	77	16	invalid$iv	Z
/*     */     //   972	100	27	$i$a$-cache-LinkKt$LinkImpl$mergedTextStyle$1	I
/*     */     //   1030	42	28	decoration	Landroidx/compose/ui/text/style/TextDecoration;
/*     */     //   1074	11	31	value$iv	Ljava/lang/Object;
/*     */     //   953	138	26	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   950	141	25	it$iv	Ljava/lang/Object;
/*     */     //   941	152	24	$i$f$cache	I
/*     */     //   938	155	22	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   938	155	23	invalid$iv	Z
/*     */     //   1163	3	22	$i$a$-thenIf-LinkKt$LinkImpl$3	I
/*     */     //   1160	6	21	$this$LinkImpl_5LixHlo_u24lambda_u2429	Landroidx/compose/ui/Modifier;
/*     */     //   1151	20	20	$i$f$thenIf	I
/*     */     //   1148	23	18	$this$thenIf$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1148	23	19	precondition$iv	Z
/*     */     //   1284	8	25	$i$a$-cache-LinkKt$LinkImpl$4	I
/*     */     //   1310	11	26	value$iv	Ljava/lang/Object;
/*     */     //   1253	74	24	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1250	77	23	it$iv	Ljava/lang/Object;
/*     */     //   1241	88	22	$i$f$cache	I
/*     */     //   1238	91	20	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1238	91	21	invalid$iv	Z
/*     */     //   1776	130	43	$i$a$-Row-LinkKt$LinkImpl$5	I
/*     */     //   1773	133	42	$this$LinkImpl_5LixHlo_u24lambda_u2432	Landroidx/compose/foundation/layout/RowScope;
/*     */     //   1773	133	41	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1773	133	40	$changed	I
/*     */     //   1737	174	39	$i$a$-Layout-RowKt$Row$1$iv	I
/*     */     //   1734	177	38	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1734	177	37	$changed$iv	I
/*     */     //   1648	55	36	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   1645	58	35	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1641	64	34	$i$f$set-impl	I
/*     */     //   1638	67	33	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   1604	115	32	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   1601	118	31	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1531	393	30	$i$f$ReusableComposeNode	I
/*     */     //   1528	396	28	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   1528	396	29	$changed$iv$iv$iv	I
/*     */     //   1468	462	24	$i$f$Layout	I
/*     */     //   1487	443	25	compositeKeyHash$iv$iv	I
/*     */     //   1496	434	26	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1505	425	27	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1465	465	23	$changed$iv$iv	I
/*     */     //   1418	518	21	$i$f$Row	I
/*     */     //   1455	481	22	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1415	521	17	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1415	521	18	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */     //   1415	521	19	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   1415	521	20	$changed$iv	I
/*     */     //   515	1430	12	linkState$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   683	1262	13	inputModeManager	Landroidx/compose/ui/input/InputModeManager;
/*     */     //   857	1088	14	textColor$delegate	Landroidx/compose/runtime/State;
/*     */     //   1109	836	15	mergedTextStyle	Landroidx/compose/ui/text/TextStyle;
/*     */     //   1135	810	16	pointerChangeModifier	Landroidx/compose/ui/Modifier;
/*     */     //   16	1981	11	$dirty	I
/*     */     //   0	1997	0	text	Ljava/lang/String;
/*     */     //   0	1997	1	style	Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;
/*     */     //   0	1997	2	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	1997	3	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1997	4	enabled	Z
/*     */     //   0	1997	5	textStyle	Landroidx/compose/ui/text/TextStyle;
/*     */     //   0	1997	6	overflow	I
/*     */     //   0	1997	7	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	1997	8	icon	Lorg/jetbrains/jewel/ui/icon/IconKey;
/*     */     //   0	1997	9	$composer	Landroidx/compose/runtime/Composer;
/* 501 */     //   0	1997	10	$changed	I } private static final void LinkImpl_5LixHlo$lambda$24(MutableState $linkState$delegate, long <set-?>) { MutableState mutableState = $linkState$delegate; Object object1 = null, object2 = null; Object value$iv = LinkState.box-impl(<set-?>); int $i$f$setValue = 0; mutableState.setValue(value$iv); } private static final long LinkImpl_5LixHlo$lambda$27(State $textColor$delegate) { State state = $textColor$delegate; Object object = null; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 503 */     return ((Color)state.getValue()).unbox-impl(); }
/*     */ 
/*     */   
/*     */   @DebugMetadata(f = "Link.kt", l = {173}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.LinkKt$LinkImpl$2$1")
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class LinkKt$LinkImpl$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     LinkKt$LinkImpl$2$1(MutableInteractionSource $interactionSource, InputModeManager $inputModeManager, MutableState<LinkState> $linkState$delegate, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           if (this.$interactionSource.getInteractions().collect(new FlowCollector(this.$inputModeManager, this.$linkState$delegate) {
/*     */                 public final Object emit(Interaction interaction, Continuation $completion) {
/*     */                   Interaction interaction1 = interaction;
/*     */                   if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) {
/*     */                     LinkKt.LinkImpl_5LixHlo$lambda$24(this.$linkState$delegate, LinkState.copy-oSacjZw$default(LinkKt.LinkImpl_5LixHlo$lambda$23(this.$linkState$delegate), false, false, false, true, false, false, 55, null));
/*     */                   } else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) {
/*     */                     LinkKt.LinkImpl_5LixHlo$lambda$24(this.$linkState$delegate, LinkState.copy-oSacjZw$default(LinkKt.LinkImpl_5LixHlo$lambda$23(this.$linkState$delegate), false, false, false, false, false, false, 55, null));
/*     */                   } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) {
/*     */                     LinkKt.LinkImpl_5LixHlo$lambda$24(this.$linkState$delegate, LinkState.copy-oSacjZw$default(LinkKt.LinkImpl_5LixHlo$lambda$23(this.$linkState$delegate), false, false, false, false, true, false, 47, null));
/*     */                   } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) {
/*     */                     LinkKt.LinkImpl_5LixHlo$lambda$24(this.$linkState$delegate, LinkState.copy-oSacjZw$default(LinkKt.LinkImpl_5LixHlo$lambda$23(this.$linkState$delegate), false, false, false, false, false, false, 47, null));
/*     */                   } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) {
/*     */                     if (InputMode.equals-impl0(this.$inputModeManager.getInputMode-aOaMEAU(), InputMode.Companion.getKeyboard-aOaMEAU()))
/*     */                       LinkKt.LinkImpl_5LixHlo$lambda$24(this.$linkState$delegate, LinkState.copy-oSacjZw$default(LinkKt.LinkImpl_5LixHlo$lambda$23(this.$linkState$delegate), false, true, false, false, false, false, 61, null)); 
/*     */                   } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) {
/*     */                     LinkKt.LinkImpl_5LixHlo$lambda$24(this.$linkState$delegate, LinkState.copy-oSacjZw$default(LinkKt.LinkImpl_5LixHlo$lambda$23(this.$linkState$delegate), false, false, false, false, false, false, 53, null));
/*     */                   } 
/*     */                   return Unit.INSTANCE;
/*     */                 }
/*     */               }(Continuation)this) == object)
/*     */             return object; 
/*     */           this.$interactionSource.getInteractions().collect(new FlowCollector(this.$inputModeManager, this.$linkState$delegate) {
/*     */                 public final Object emit(Interaction interaction, Continuation $completion) {
/*     */                   Interaction interaction1 = interaction;
/*     */                   if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) {
/*     */                     LinkKt.LinkImpl_5LixHlo$lambda$24(this.$linkState$delegate, LinkState.copy-oSacjZw$default(LinkKt.LinkImpl_5LixHlo$lambda$23(this.$linkState$delegate), false, false, false, true, false, false, 55, null));
/*     */                   } else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) {
/*     */                     LinkKt.LinkImpl_5LixHlo$lambda$24(this.$linkState$delegate, LinkState.copy-oSacjZw$default(LinkKt.LinkImpl_5LixHlo$lambda$23(this.$linkState$delegate), false, false, false, false, false, false, 55, null));
/*     */                   } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) {
/*     */                     LinkKt.LinkImpl_5LixHlo$lambda$24(this.$linkState$delegate, LinkState.copy-oSacjZw$default(LinkKt.LinkImpl_5LixHlo$lambda$23(this.$linkState$delegate), false, false, false, false, true, false, 47, null));
/*     */                   } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) {
/*     */                     LinkKt.LinkImpl_5LixHlo$lambda$24(this.$linkState$delegate, LinkState.copy-oSacjZw$default(LinkKt.LinkImpl_5LixHlo$lambda$23(this.$linkState$delegate), false, false, false, false, false, false, 47, null));
/*     */                   } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) {
/*     */                     if (InputMode.equals-impl0(this.$inputModeManager.getInputMode-aOaMEAU(), InputMode.Companion.getKeyboard-aOaMEAU()))
/*     */                       LinkKt.LinkImpl_5LixHlo$lambda$24(this.$linkState$delegate, LinkState.copy-oSacjZw$default(LinkKt.LinkImpl_5LixHlo$lambda$23(this.$linkState$delegate), false, true, false, false, false, false, 61, null)); 
/*     */                   } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) {
/*     */                     LinkKt.LinkImpl_5LixHlo$lambda$24(this.$linkState$delegate, LinkState.copy-oSacjZw$default(LinkKt.LinkImpl_5LixHlo$lambda$23(this.$linkState$delegate), false, false, false, false, false, false, 53, null));
/*     */                   } 
/*     */                   return Unit.INSTANCE;
/*     */                 }
/*     */               }(Continuation)this);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super LinkKt$LinkImpl$2$1> $completion) {
/*     */       return (Continuation<Unit>)new LinkKt$LinkImpl$2$1(this.$interactionSource, this.$inputModeManager, this.$linkState$delegate, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((LinkKt$LinkImpl$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private static final Unit LinkImpl_5LixHlo$lambda$31$lambda$30(Function0 $onClick, MutableState<LinkState> $linkState$delegate) {
/*     */     LinkImpl_5LixHlo$lambda$24($linkState$delegate, LinkState.copy-oSacjZw$default(LinkImpl_5LixHlo$lambda$23($linkState$delegate), false, false, true, false, false, false, 59, null));
/*     */     $onClick.invoke();
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit Link_kye4rC8$lambda$1(String $text, Function0<Unit> $onClick, Modifier $modifier, boolean $enabled, TextStyle $textStyle, int $overflow, MutableInteractionSource $interactionSource, LinkStyle $style, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     Link-kye4rC8($text, $onClick, $modifier, $enabled, $textStyle, $overflow, $interactionSource, $style, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit ExternalLink_kye4rC8$lambda$3(String $text, Function0<Unit> $onClick, Modifier $modifier, boolean $enabled, TextStyle $textStyle, int $overflow, MutableInteractionSource $interactionSource, LinkStyle $style, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     ExternalLink-kye4rC8($text, $onClick, $modifier, $enabled, $textStyle, $overflow, $interactionSource, $style, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit DropdownLink_RWo7tUw$lambda$21(String $text, Modifier $modifier, boolean $enabled, TextStyle $textStyle, int $overflow, MutableInteractionSource $interactionSource, LinkStyle $style, Modifier $menuModifier, MenuStyle $menuStyle, Function1<? super MenuScope, Unit> $menuContent, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     DropdownLink-RWo7tUw($text, $modifier, $enabled, $textStyle, $overflow, $interactionSource, $style, $menuModifier, $menuStyle, $menuContent, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit LinkImpl_5LixHlo$lambda$33(String $text, LinkStyle $style, Function0<Unit> $onClick, Modifier $modifier, boolean $enabled, TextStyle $textStyle, int $overflow, MutableInteractionSource $interactionSource, IconKey $icon, int $$changed, Composer $composer, int $force) {
/*     */     LinkImpl-5LixHlo($text, $style, $onClick, $modifier, $enabled, $textStyle, $overflow, $interactionSource, $icon, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\LinkKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */