/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.interaction.MutableInteractionSource;
/*     */ import androidx.compose.foundation.layout.BoxKt;
/*     */ import androidx.compose.foundation.layout.BoxScope;
/*     */ import androidx.compose.foundation.layout.PaddingKt;
/*     */ import androidx.compose.foundation.layout.PaddingValues;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.ComposablesKt;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocalMap;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.Updater;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.node.ComposeUiNode;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.ui.component.styling.IconButtonStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.TooltipStyle;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000D\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\004\032j\020\000\032\0020\0012\f\020\002\032\b\022\004\022\0020\0010\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\0072\b\b\002\020\t\032\0020\n2\b\b\002\020\013\032\0020\f2\b\b\002\020\r\032\0020\0162\021\020\017\032\r\022\004\022\0020\0010\003¢\006\002\b\020H\007¢\006\002\020\021\032\001\020\000\032\0020\0012\f\020\002\032\b\022\004\022\0020\0010\0032\021\020\022\032\r\022\004\022\0020\0010\003¢\006\002\b\0202\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\0072\b\b\002\020\t\032\0020\n2\b\b\002\020\013\032\0020\f2\b\b\002\020\023\032\0020\0242\b\b\002\020\025\032\0020\0262\b\b\002\020\r\032\0020\0162\021\020\017\032\r\022\004\022\0020\0010\003¢\006\002\b\020H\007¢\006\002\020\027\032X\020\030\032\0020\0012\f\020\002\032\b\022\004\022\0020\0010\0032\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020\t\032\0020\n2\006\020\r\032\0020\0162\b\b\002\020\004\032\0020\0052\021\020\017\032\r\022\004\022\0020\0010\003¢\006\002\b\020H\003¢\006\002\020\031¨\006\032"}, d2 = {"ActionButton", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "focusable", "style", "Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "tooltip", "tooltipStyle", "Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;", "tooltipPlacement", "Landroidx/compose/foundation/TooltipPlacement;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/layout/PaddingValues;Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;Landroidx/compose/foundation/TooltipPlacement;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "CoreActionButton", "(Lkotlin/jvm/functions/Function0;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ui"})
/*     */ @SourceDebugExtension({"SMAP\nActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActionButton.kt\norg/jetbrains/jewel/ui/component/ActionButtonKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,89:1\n149#2:90\n149#2:97\n149#2:98\n1225#3,6:91\n1225#3,6:99\n*S KotlinDebug\n*F\n+ 1 ActionButton.kt\norg/jetbrains/jewel/ui/component/ActionButtonKt\n*L\n41#1:90\n58#1:97\n60#1:98\n42#1:91,6\n61#1:99,6\n*E\n"})
/*     */ public final class ActionButtonKt {
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*     */   public static final void ActionButton(@NotNull Function0 onClick, @Nullable Modifier modifier, boolean enabled, boolean focusable, @Nullable IconButtonStyle style, @Nullable PaddingValues contentPadding, @Nullable MutableInteractionSource interactionSource, @NotNull Function2 content, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'onClick'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload #7
/*     */     //   8: ldc 'content'
/*     */     //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   13: aload #8
/*     */     //   15: ldc -953079714
/*     */     //   17: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   22: astore #8
/*     */     //   24: iload #9
/*     */     //   26: istore #11
/*     */     //   28: iload #10
/*     */     //   30: iconst_1
/*     */     //   31: iand
/*     */     //   32: ifeq -> 45
/*     */     //   35: iload #11
/*     */     //   37: bipush #6
/*     */     //   39: ior
/*     */     //   40: istore #11
/*     */     //   42: goto -> 74
/*     */     //   45: iload #9
/*     */     //   47: bipush #6
/*     */     //   49: iand
/*     */     //   50: ifne -> 74
/*     */     //   53: iload #11
/*     */     //   55: aload #8
/*     */     //   57: aload_0
/*     */     //   58: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   63: ifeq -> 70
/*     */     //   66: iconst_4
/*     */     //   67: goto -> 71
/*     */     //   70: iconst_2
/*     */     //   71: ior
/*     */     //   72: istore #11
/*     */     //   74: iload #10
/*     */     //   76: iconst_2
/*     */     //   77: iand
/*     */     //   78: ifeq -> 91
/*     */     //   81: iload #11
/*     */     //   83: bipush #48
/*     */     //   85: ior
/*     */     //   86: istore #11
/*     */     //   88: goto -> 122
/*     */     //   91: iload #9
/*     */     //   93: bipush #48
/*     */     //   95: iand
/*     */     //   96: ifne -> 122
/*     */     //   99: iload #11
/*     */     //   101: aload #8
/*     */     //   103: aload_1
/*     */     //   104: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   109: ifeq -> 117
/*     */     //   112: bipush #32
/*     */     //   114: goto -> 119
/*     */     //   117: bipush #16
/*     */     //   119: ior
/*     */     //   120: istore #11
/*     */     //   122: iload #10
/*     */     //   124: iconst_4
/*     */     //   125: iand
/*     */     //   126: ifeq -> 140
/*     */     //   129: iload #11
/*     */     //   131: sipush #384
/*     */     //   134: ior
/*     */     //   135: istore #11
/*     */     //   137: goto -> 174
/*     */     //   140: iload #9
/*     */     //   142: sipush #384
/*     */     //   145: iand
/*     */     //   146: ifne -> 174
/*     */     //   149: iload #11
/*     */     //   151: aload #8
/*     */     //   153: iload_2
/*     */     //   154: invokeinterface changed : (Z)Z
/*     */     //   159: ifeq -> 168
/*     */     //   162: sipush #256
/*     */     //   165: goto -> 171
/*     */     //   168: sipush #128
/*     */     //   171: ior
/*     */     //   172: istore #11
/*     */     //   174: iload #10
/*     */     //   176: bipush #8
/*     */     //   178: iand
/*     */     //   179: ifeq -> 193
/*     */     //   182: iload #11
/*     */     //   184: sipush #3072
/*     */     //   187: ior
/*     */     //   188: istore #11
/*     */     //   190: goto -> 227
/*     */     //   193: iload #9
/*     */     //   195: sipush #3072
/*     */     //   198: iand
/*     */     //   199: ifne -> 227
/*     */     //   202: iload #11
/*     */     //   204: aload #8
/*     */     //   206: iload_3
/*     */     //   207: invokeinterface changed : (Z)Z
/*     */     //   212: ifeq -> 221
/*     */     //   215: sipush #2048
/*     */     //   218: goto -> 224
/*     */     //   221: sipush #1024
/*     */     //   224: ior
/*     */     //   225: istore #11
/*     */     //   227: iload #9
/*     */     //   229: sipush #24576
/*     */     //   232: iand
/*     */     //   233: ifne -> 270
/*     */     //   236: iload #11
/*     */     //   238: iload #10
/*     */     //   240: bipush #16
/*     */     //   242: iand
/*     */     //   243: ifne -> 264
/*     */     //   246: aload #8
/*     */     //   248: aload #4
/*     */     //   250: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   255: ifeq -> 264
/*     */     //   258: sipush #16384
/*     */     //   261: goto -> 267
/*     */     //   264: sipush #8192
/*     */     //   267: ior
/*     */     //   268: istore #11
/*     */     //   270: iload #10
/*     */     //   272: bipush #32
/*     */     //   274: iand
/*     */     //   275: ifeq -> 288
/*     */     //   278: iload #11
/*     */     //   280: ldc 196608
/*     */     //   282: ior
/*     */     //   283: istore #11
/*     */     //   285: goto -> 320
/*     */     //   288: iload #9
/*     */     //   290: ldc 196608
/*     */     //   292: iand
/*     */     //   293: ifne -> 320
/*     */     //   296: iload #11
/*     */     //   298: aload #8
/*     */     //   300: aload #5
/*     */     //   302: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   307: ifeq -> 315
/*     */     //   310: ldc 131072
/*     */     //   312: goto -> 317
/*     */     //   315: ldc 65536
/*     */     //   317: ior
/*     */     //   318: istore #11
/*     */     //   320: iload #10
/*     */     //   322: bipush #64
/*     */     //   324: iand
/*     */     //   325: ifeq -> 338
/*     */     //   328: iload #11
/*     */     //   330: ldc 1572864
/*     */     //   332: ior
/*     */     //   333: istore #11
/*     */     //   335: goto -> 370
/*     */     //   338: iload #9
/*     */     //   340: ldc 1572864
/*     */     //   342: iand
/*     */     //   343: ifne -> 370
/*     */     //   346: iload #11
/*     */     //   348: aload #8
/*     */     //   350: aload #6
/*     */     //   352: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   357: ifeq -> 365
/*     */     //   360: ldc 1048576
/*     */     //   362: goto -> 367
/*     */     //   365: ldc 524288
/*     */     //   367: ior
/*     */     //   368: istore #11
/*     */     //   370: iload #10
/*     */     //   372: sipush #128
/*     */     //   375: iand
/*     */     //   376: ifeq -> 389
/*     */     //   379: iload #11
/*     */     //   381: ldc 12582912
/*     */     //   383: ior
/*     */     //   384: istore #11
/*     */     //   386: goto -> 421
/*     */     //   389: iload #9
/*     */     //   391: ldc 12582912
/*     */     //   393: iand
/*     */     //   394: ifne -> 421
/*     */     //   397: iload #11
/*     */     //   399: aload #8
/*     */     //   401: aload #7
/*     */     //   403: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   408: ifeq -> 416
/*     */     //   411: ldc 8388608
/*     */     //   413: goto -> 418
/*     */     //   416: ldc 4194304
/*     */     //   418: ior
/*     */     //   419: istore #11
/*     */     //   421: iload #11
/*     */     //   423: ldc 4793491
/*     */     //   425: iand
/*     */     //   426: ldc 4793490
/*     */     //   428: if_icmpne -> 441
/*     */     //   431: aload #8
/*     */     //   433: invokeinterface getSkipping : ()Z
/*     */     //   438: ifne -> 796
/*     */     //   441: aload #8
/*     */     //   443: invokeinterface startDefaults : ()V
/*     */     //   448: iload #9
/*     */     //   450: iconst_1
/*     */     //   451: iand
/*     */     //   452: ifeq -> 465
/*     */     //   455: aload #8
/*     */     //   457: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   462: ifeq -> 649
/*     */     //   465: iload #10
/*     */     //   467: iconst_2
/*     */     //   468: iand
/*     */     //   469: ifeq -> 479
/*     */     //   472: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   475: checkcast androidx/compose/ui/Modifier
/*     */     //   478: astore_1
/*     */     //   479: iload #10
/*     */     //   481: iconst_4
/*     */     //   482: iand
/*     */     //   483: ifeq -> 488
/*     */     //   486: iconst_1
/*     */     //   487: istore_2
/*     */     //   488: iload #10
/*     */     //   490: bipush #8
/*     */     //   492: iand
/*     */     //   493: ifeq -> 498
/*     */     //   496: iconst_1
/*     */     //   497: istore_3
/*     */     //   498: iload #10
/*     */     //   500: bipush #16
/*     */     //   502: iand
/*     */     //   503: ifeq -> 525
/*     */     //   506: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   509: aload #8
/*     */     //   511: bipush #6
/*     */     //   513: invokestatic getIconButtonStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;
/*     */     //   516: astore #4
/*     */     //   518: iload #11
/*     */     //   520: ldc -57345
/*     */     //   522: iand
/*     */     //   523: istore #11
/*     */     //   525: iload #10
/*     */     //   527: bipush #32
/*     */     //   529: iand
/*     */     //   530: ifeq -> 553
/*     */     //   533: iconst_4
/*     */     //   534: istore #12
/*     */     //   536: iconst_0
/*     */     //   537: istore #13
/*     */     //   539: iload #12
/*     */     //   541: i2f
/*     */     //   542: invokestatic constructor-impl : (F)F
/*     */     //   545: fconst_0
/*     */     //   546: iconst_2
/*     */     //   547: aconst_null
/*     */     //   548: invokestatic PaddingValues-YgX7TsA$default : (FFILjava/lang/Object;)Landroidx/compose/foundation/layout/PaddingValues;
/*     */     //   551: astore #5
/*     */     //   553: iload #10
/*     */     //   555: bipush #64
/*     */     //   557: iand
/*     */     //   558: ifeq -> 671
/*     */     //   561: aload #8
/*     */     //   563: ldc -808376787
/*     */     //   565: invokeinterface startReplaceGroup : (I)V
/*     */     //   570: aload #8
/*     */     //   572: astore #13
/*     */     //   574: iconst_0
/*     */     //   575: istore #14
/*     */     //   577: iconst_0
/*     */     //   578: istore #15
/*     */     //   580: aload #13
/*     */     //   582: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   587: astore #16
/*     */     //   589: iconst_0
/*     */     //   590: istore #17
/*     */     //   592: aload #16
/*     */     //   594: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   597: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   600: if_acmpne -> 625
/*     */     //   603: iconst_0
/*     */     //   604: istore #18
/*     */     //   606: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   609: astore #18
/*     */     //   611: aload #13
/*     */     //   613: aload #18
/*     */     //   615: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   620: aload #18
/*     */     //   622: goto -> 627
/*     */     //   625: aload #16
/*     */     //   627: nop
/*     */     //   628: nop
/*     */     //   629: nop
/*     */     //   630: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   633: astore #12
/*     */     //   635: aload #8
/*     */     //   637: invokeinterface endReplaceGroup : ()V
/*     */     //   642: aload #12
/*     */     //   644: astore #6
/*     */     //   646: goto -> 671
/*     */     //   649: aload #8
/*     */     //   651: invokeinterface skipToGroupEnd : ()V
/*     */     //   656: iload #10
/*     */     //   658: bipush #16
/*     */     //   660: iand
/*     */     //   661: ifeq -> 671
/*     */     //   664: iload #11
/*     */     //   666: ldc -57345
/*     */     //   668: iand
/*     */     //   669: istore #11
/*     */     //   671: aload #8
/*     */     //   673: invokeinterface endDefaults : ()V
/*     */     //   678: invokestatic isTraceInProgress : ()Z
/*     */     //   681: ifeq -> 694
/*     */     //   684: ldc -953079714
/*     */     //   686: iload #11
/*     */     //   688: iconst_m1
/*     */     //   689: ldc 'org.jetbrains.jewel.ui.component.ActionButton (ActionButton.kt:43)'
/*     */     //   691: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   694: aload_0
/*     */     //   695: iload_2
/*     */     //   696: iload_3
/*     */     //   697: aload #4
/*     */     //   699: aload #6
/*     */     //   701: aload_1
/*     */     //   702: ldc -1425630152
/*     */     //   704: iconst_1
/*     */     //   705: new org/jetbrains/jewel/ui/component/ActionButtonKt$ActionButton$2
/*     */     //   708: dup
/*     */     //   709: aload #5
/*     */     //   711: aload #7
/*     */     //   713: invokespecial <init> : (Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;)V
/*     */     //   716: aload #8
/*     */     //   718: bipush #54
/*     */     //   720: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   723: checkcast kotlin/jvm/functions/Function2
/*     */     //   726: aload #8
/*     */     //   728: ldc 1572864
/*     */     //   730: bipush #14
/*     */     //   732: iload #11
/*     */     //   734: iand
/*     */     //   735: ior
/*     */     //   736: bipush #112
/*     */     //   738: iload #11
/*     */     //   740: iconst_3
/*     */     //   741: ishr
/*     */     //   742: iand
/*     */     //   743: ior
/*     */     //   744: sipush #896
/*     */     //   747: iload #11
/*     */     //   749: iconst_3
/*     */     //   750: ishr
/*     */     //   751: iand
/*     */     //   752: ior
/*     */     //   753: sipush #7168
/*     */     //   756: iload #11
/*     */     //   758: iconst_3
/*     */     //   759: ishr
/*     */     //   760: iand
/*     */     //   761: ior
/*     */     //   762: ldc 57344
/*     */     //   764: iload #11
/*     */     //   766: bipush #6
/*     */     //   768: ishr
/*     */     //   769: iand
/*     */     //   770: ior
/*     */     //   771: ldc 458752
/*     */     //   773: iload #11
/*     */     //   775: bipush #12
/*     */     //   777: ishl
/*     */     //   778: iand
/*     */     //   779: ior
/*     */     //   780: iconst_0
/*     */     //   781: invokestatic CoreActionButton : (Lkotlin/jvm/functions/Function0;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*     */     //   784: invokestatic isTraceInProgress : ()Z
/*     */     //   787: ifeq -> 803
/*     */     //   790: invokestatic traceEventEnd : ()V
/*     */     //   793: goto -> 803
/*     */     //   796: aload #8
/*     */     //   798: invokeinterface skipToGroupEnd : ()V
/*     */     //   803: aload #8
/*     */     //   805: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   810: dup
/*     */     //   811: ifnull -> 843
/*     */     //   814: aload_0
/*     */     //   815: aload_1
/*     */     //   816: iload_2
/*     */     //   817: iload_3
/*     */     //   818: aload #4
/*     */     //   820: aload #5
/*     */     //   822: aload #6
/*     */     //   824: aload #7
/*     */     //   826: iload #9
/*     */     //   828: iload #10
/*     */     //   830: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;II)Lkotlin/jvm/functions/Function2;
/*     */     //   835: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   840: goto -> 844
/*     */     //   843: pop
/*     */     //   844: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #44	-> 13
/*     */     //   #37	-> 472
/*     */     //   #38	-> 486
/*     */     //   #39	-> 496
/*     */     //   #40	-> 506
/*     */     //   #41	-> 533
/*     */     //   #90	-> 539
/*     */     //   #41	-> 545
/*     */     //   #42	-> 561
/*     */     //   #91	-> 580
/*     */     //   #92	-> 592
/*     */     //   #93	-> 603
/*     */     //   #42	-> 606
/*     */     //   #93	-> 609
/*     */     //   #94	-> 611
/*     */     //   #95	-> 620
/*     */     //   #96	-> 625
/*     */     //   #92	-> 627
/*     */     //   #91	-> 628
/*     */     //   #91	-> 629
/*     */     //   #42	-> 630
/*     */     //   #44	-> 691
/*     */     //   #45	-> 694
/*     */     //   #48	-> 796
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   539	6	13	$i$f$getDp	I
/*     */     //   536	9	12	$this$dp$iv	I
/*     */     //   606	3	18	$i$a$-cache-ActionButtonKt$ActionButton$1	I
/*     */     //   611	11	18	value$iv	Ljava/lang/Object;
/*     */     //   592	36	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   589	39	16	it$iv	Ljava/lang/Object;
/*     */     //   580	50	15	$i$f$cache	I
/*     */     //   577	53	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   577	53	14	invalid$iv	Z
/*     */     //   28	817	11	$dirty	I
/*     */     //   0	845	0	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	845	1	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	845	2	enabled	Z
/*     */     //   0	845	3	focusable	Z
/*     */     //   0	845	4	style	Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;
/*     */     //   0	845	5	contentPadding	Landroidx/compose/foundation/layout/PaddingValues;
/*     */     //   0	845	6	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	845	7	content	Lkotlin/jvm/functions/Function2;
/*     */     //   0	845	8	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	845	9	$changed	I
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActionButton.kt\norg/jetbrains/jewel/ui/component/ActionButtonKt$ActionButton$2\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,89:1\n71#2:90\n68#2,6:91\n74#2:125\n78#2:129\n79#3,6:97\n86#3,4:112\n90#3,2:122\n94#3:128\n368#4,9:103\n377#4:124\n378#4,2:126\n4034#5,6:116\n*S KotlinDebug\n*F\n+ 1 ActionButton.kt\norg/jetbrains/jewel/ui/component/ActionButtonKt$ActionButton$2\n*L\n46#1:90\n46#1:91,6\n46#1:125\n46#1:129\n46#1:97,6\n46#1:112,4\n46#1:122,2\n46#1:128\n46#1:103,9\n46#1:124\n46#1:126,2\n46#1:116,6\n*E\n"})
/*     */   static final class ActionButtonKt$ActionButton$2 implements Function2<Composer, Integer, Unit> { ActionButtonKt$ActionButton$2(PaddingValues $contentPadding, Function2<Composer, Integer, Unit> $content) {}
/*     */     
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*  46 */     public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1425630152, $changed, -1, "org.jetbrains.jewel.ui.component.ActionButton.<anonymous> (ActionButton.kt:45)");  Modifier modifier1 = PaddingKt.padding((Modifier)Modifier.Companion, this.$contentPadding); Function2<Composer, Integer, Unit> function2 = this.$content; int $changed$iv = 0, $i$f$Box = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  90 */         ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
/*  91 */         Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
/*  92 */         boolean propagateMinConstraints$iv = false;
/*     */ 
/*     */         
/*  95 */         MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv); int $changed$iv$iv = 0x70 & $changed$iv << 3;
/*  96 */         int $i$f$Layout = 0;
/*  97 */         ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/*  98 */         int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/*  99 */         CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/* 100 */         Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier1);
/*     */         
/* 102 */         Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0;
/* 103 */         ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 104 */         if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer
/* 105 */           .startReusableNode();
/* 106 */         if ($composer.getInserting()) { $composer
/* 107 */             .createNode(function0); } else { $composer
/*     */             
/* 109 */             .useNode(); }
/*     */         
/* 111 */         Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/* 112 */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 113 */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */         
/* 115 */         Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0;
/* 116 */         Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/* 117 */         if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/* 118 */           $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/* 119 */           $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*     */         } 
/*     */         
/* 122 */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*     */         
/* 124 */         int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-BoxKt$Box$1$iv = 0;
/* 125 */         ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; BoxScope $this$invoke_u24lambda_u240 = (BoxScope)BoxScopeInstance.INSTANCE; int $i$a$-Box-ActionButtonKt$ActionButton$2$1 = 0; function2.invoke(composer1, Integer.valueOf(0)); ComposerKt.sourceInformationMarkerEnd($composer$iv);
/* 126 */         $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer);
/* 127 */         ComposerKt.sourceInformationMarkerEnd($composer);
/* 128 */         ComposerKt.sourceInformationMarkerEnd($composer);
/* 129 */         if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } } @Composable @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]") public static final void ActionButton(@NotNull Function0 onClick, @NotNull Function2 tooltip, @Nullable Modifier modifier, boolean enabled, boolean focusable, @Nullable IconButtonStyle style, @Nullable PaddingValues contentPadding, @Nullable TooltipStyle tooltipStyle, @Nullable TooltipPlacement tooltipPlacement, @Nullable MutableInteractionSource interactionSource, @NotNull Function2 content, @Nullable Composer $composer, int $changed, int $changed1, int paramInt1) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'onClick'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'tooltip'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload #10
/*     */     //   14: ldc 'content'
/*     */     //   16: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   19: aload #11
/*     */     //   21: ldc 664995251
/*     */     //   23: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   28: astore #11
/*     */     //   30: iload #12
/*     */     //   32: istore #15
/*     */     //   34: iload #13
/*     */     //   36: istore #16
/*     */     //   38: iload #14
/*     */     //   40: iconst_1
/*     */     //   41: iand
/*     */     //   42: ifeq -> 55
/*     */     //   45: iload #15
/*     */     //   47: bipush #6
/*     */     //   49: ior
/*     */     //   50: istore #15
/*     */     //   52: goto -> 84
/*     */     //   55: iload #12
/*     */     //   57: bipush #6
/*     */     //   59: iand
/*     */     //   60: ifne -> 84
/*     */     //   63: iload #15
/*     */     //   65: aload #11
/*     */     //   67: aload_0
/*     */     //   68: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   73: ifeq -> 80
/*     */     //   76: iconst_4
/*     */     //   77: goto -> 81
/*     */     //   80: iconst_2
/*     */     //   81: ior
/*     */     //   82: istore #15
/*     */     //   84: iload #14
/*     */     //   86: iconst_2
/*     */     //   87: iand
/*     */     //   88: ifeq -> 101
/*     */     //   91: iload #15
/*     */     //   93: bipush #48
/*     */     //   95: ior
/*     */     //   96: istore #15
/*     */     //   98: goto -> 132
/*     */     //   101: iload #12
/*     */     //   103: bipush #48
/*     */     //   105: iand
/*     */     //   106: ifne -> 132
/*     */     //   109: iload #15
/*     */     //   111: aload #11
/*     */     //   113: aload_1
/*     */     //   114: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   119: ifeq -> 127
/*     */     //   122: bipush #32
/*     */     //   124: goto -> 129
/*     */     //   127: bipush #16
/*     */     //   129: ior
/*     */     //   130: istore #15
/*     */     //   132: iload #14
/*     */     //   134: iconst_4
/*     */     //   135: iand
/*     */     //   136: ifeq -> 150
/*     */     //   139: iload #15
/*     */     //   141: sipush #384
/*     */     //   144: ior
/*     */     //   145: istore #15
/*     */     //   147: goto -> 184
/*     */     //   150: iload #12
/*     */     //   152: sipush #384
/*     */     //   155: iand
/*     */     //   156: ifne -> 184
/*     */     //   159: iload #15
/*     */     //   161: aload #11
/*     */     //   163: aload_2
/*     */     //   164: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   169: ifeq -> 178
/*     */     //   172: sipush #256
/*     */     //   175: goto -> 181
/*     */     //   178: sipush #128
/*     */     //   181: ior
/*     */     //   182: istore #15
/*     */     //   184: iload #14
/*     */     //   186: bipush #8
/*     */     //   188: iand
/*     */     //   189: ifeq -> 203
/*     */     //   192: iload #15
/*     */     //   194: sipush #3072
/*     */     //   197: ior
/*     */     //   198: istore #15
/*     */     //   200: goto -> 237
/*     */     //   203: iload #12
/*     */     //   205: sipush #3072
/*     */     //   208: iand
/*     */     //   209: ifne -> 237
/*     */     //   212: iload #15
/*     */     //   214: aload #11
/*     */     //   216: iload_3
/*     */     //   217: invokeinterface changed : (Z)Z
/*     */     //   222: ifeq -> 231
/*     */     //   225: sipush #2048
/*     */     //   228: goto -> 234
/*     */     //   231: sipush #1024
/*     */     //   234: ior
/*     */     //   235: istore #15
/*     */     //   237: iload #14
/*     */     //   239: bipush #16
/*     */     //   241: iand
/*     */     //   242: ifeq -> 256
/*     */     //   245: iload #15
/*     */     //   247: sipush #24576
/*     */     //   250: ior
/*     */     //   251: istore #15
/*     */     //   253: goto -> 291
/*     */     //   256: iload #12
/*     */     //   258: sipush #24576
/*     */     //   261: iand
/*     */     //   262: ifne -> 291
/*     */     //   265: iload #15
/*     */     //   267: aload #11
/*     */     //   269: iload #4
/*     */     //   271: invokeinterface changed : (Z)Z
/*     */     //   276: ifeq -> 285
/*     */     //   279: sipush #16384
/*     */     //   282: goto -> 288
/*     */     //   285: sipush #8192
/*     */     //   288: ior
/*     */     //   289: istore #15
/*     */     //   291: iload #12
/*     */     //   293: ldc 196608
/*     */     //   295: iand
/*     */     //   296: ifne -> 331
/*     */     //   299: iload #15
/*     */     //   301: iload #14
/*     */     //   303: bipush #32
/*     */     //   305: iand
/*     */     //   306: ifne -> 326
/*     */     //   309: aload #11
/*     */     //   311: aload #5
/*     */     //   313: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   318: ifeq -> 326
/*     */     //   321: ldc 131072
/*     */     //   323: goto -> 328
/*     */     //   326: ldc 65536
/*     */     //   328: ior
/*     */     //   329: istore #15
/*     */     //   331: iload #14
/*     */     //   333: bipush #64
/*     */     //   335: iand
/*     */     //   336: ifeq -> 349
/*     */     //   339: iload #15
/*     */     //   341: ldc 1572864
/*     */     //   343: ior
/*     */     //   344: istore #15
/*     */     //   346: goto -> 381
/*     */     //   349: iload #12
/*     */     //   351: ldc 1572864
/*     */     //   353: iand
/*     */     //   354: ifne -> 381
/*     */     //   357: iload #15
/*     */     //   359: aload #11
/*     */     //   361: aload #6
/*     */     //   363: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   368: ifeq -> 376
/*     */     //   371: ldc 1048576
/*     */     //   373: goto -> 378
/*     */     //   376: ldc 524288
/*     */     //   378: ior
/*     */     //   379: istore #15
/*     */     //   381: iload #12
/*     */     //   383: ldc 12582912
/*     */     //   385: iand
/*     */     //   386: ifne -> 422
/*     */     //   389: iload #15
/*     */     //   391: iload #14
/*     */     //   393: sipush #128
/*     */     //   396: iand
/*     */     //   397: ifne -> 417
/*     */     //   400: aload #11
/*     */     //   402: aload #7
/*     */     //   404: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   409: ifeq -> 417
/*     */     //   412: ldc 8388608
/*     */     //   414: goto -> 419
/*     */     //   417: ldc 4194304
/*     */     //   419: ior
/*     */     //   420: istore #15
/*     */     //   422: iload #12
/*     */     //   424: ldc 100663296
/*     */     //   426: iand
/*     */     //   427: ifne -> 463
/*     */     //   430: iload #15
/*     */     //   432: iload #14
/*     */     //   434: sipush #256
/*     */     //   437: iand
/*     */     //   438: ifne -> 458
/*     */     //   441: aload #11
/*     */     //   443: aload #8
/*     */     //   445: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   450: ifeq -> 458
/*     */     //   453: ldc 67108864
/*     */     //   455: goto -> 460
/*     */     //   458: ldc 33554432
/*     */     //   460: ior
/*     */     //   461: istore #15
/*     */     //   463: iload #14
/*     */     //   465: sipush #512
/*     */     //   468: iand
/*     */     //   469: ifeq -> 482
/*     */     //   472: iload #15
/*     */     //   474: ldc 805306368
/*     */     //   476: ior
/*     */     //   477: istore #15
/*     */     //   479: goto -> 514
/*     */     //   482: iload #12
/*     */     //   484: ldc 805306368
/*     */     //   486: iand
/*     */     //   487: ifne -> 514
/*     */     //   490: iload #15
/*     */     //   492: aload #11
/*     */     //   494: aload #9
/*     */     //   496: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   501: ifeq -> 509
/*     */     //   504: ldc 536870912
/*     */     //   506: goto -> 511
/*     */     //   509: ldc 268435456
/*     */     //   511: ior
/*     */     //   512: istore #15
/*     */     //   514: iload #14
/*     */     //   516: sipush #1024
/*     */     //   519: iand
/*     */     //   520: ifeq -> 533
/*     */     //   523: iload #16
/*     */     //   525: bipush #6
/*     */     //   527: ior
/*     */     //   528: istore #16
/*     */     //   530: goto -> 563
/*     */     //   533: iload #13
/*     */     //   535: bipush #6
/*     */     //   537: iand
/*     */     //   538: ifne -> 563
/*     */     //   541: iload #16
/*     */     //   543: aload #11
/*     */     //   545: aload #10
/*     */     //   547: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   552: ifeq -> 559
/*     */     //   555: iconst_4
/*     */     //   556: goto -> 560
/*     */     //   559: iconst_2
/*     */     //   560: ior
/*     */     //   561: istore #16
/*     */     //   563: iload #15
/*     */     //   565: ldc 306783379
/*     */     //   567: iand
/*     */     //   568: ldc 306783378
/*     */     //   570: if_icmpne -> 591
/*     */     //   573: iload #16
/*     */     //   575: iconst_3
/*     */     //   576: iand
/*     */     //   577: iconst_2
/*     */     //   578: if_icmpne -> 591
/*     */     //   581: aload #11
/*     */     //   583: invokeinterface getSkipping : ()Z
/*     */     //   588: ifne -> 1068
/*     */     //   591: aload #11
/*     */     //   593: invokeinterface startDefaults : ()V
/*     */     //   598: iload #12
/*     */     //   600: iconst_1
/*     */     //   601: iand
/*     */     //   602: ifeq -> 615
/*     */     //   605: aload #11
/*     */     //   607: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   612: ifeq -> 893
/*     */     //   615: iload #14
/*     */     //   617: iconst_4
/*     */     //   618: iand
/*     */     //   619: ifeq -> 629
/*     */     //   622: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   625: checkcast androidx/compose/ui/Modifier
/*     */     //   628: astore_2
/*     */     //   629: iload #14
/*     */     //   631: bipush #8
/*     */     //   633: iand
/*     */     //   634: ifeq -> 639
/*     */     //   637: iconst_1
/*     */     //   638: istore_3
/*     */     //   639: iload #14
/*     */     //   641: bipush #16
/*     */     //   643: iand
/*     */     //   644: ifeq -> 650
/*     */     //   647: iconst_1
/*     */     //   648: istore #4
/*     */     //   650: iload #14
/*     */     //   652: bipush #32
/*     */     //   654: iand
/*     */     //   655: ifeq -> 677
/*     */     //   658: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   661: aload #11
/*     */     //   663: bipush #6
/*     */     //   665: invokestatic getIconButtonStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;
/*     */     //   668: astore #5
/*     */     //   670: iload #15
/*     */     //   672: ldc -458753
/*     */     //   674: iand
/*     */     //   675: istore #15
/*     */     //   677: iload #14
/*     */     //   679: bipush #64
/*     */     //   681: iand
/*     */     //   682: ifeq -> 705
/*     */     //   685: iconst_4
/*     */     //   686: istore #17
/*     */     //   688: iconst_0
/*     */     //   689: istore #18
/*     */     //   691: iload #17
/*     */     //   693: i2f
/*     */     //   694: invokestatic constructor-impl : (F)F
/*     */     //   697: fconst_0
/*     */     //   698: iconst_2
/*     */     //   699: aconst_null
/*     */     //   700: invokestatic PaddingValues-YgX7TsA$default : (FFILjava/lang/Object;)Landroidx/compose/foundation/layout/PaddingValues;
/*     */     //   703: astore #6
/*     */     //   705: iload #14
/*     */     //   707: sipush #128
/*     */     //   710: iand
/*     */     //   711: ifeq -> 733
/*     */     //   714: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   717: aload #11
/*     */     //   719: bipush #6
/*     */     //   721: invokestatic getTooltipStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;
/*     */     //   724: astore #7
/*     */     //   726: iload #15
/*     */     //   728: ldc -29360129
/*     */     //   730: iand
/*     */     //   731: istore #15
/*     */     //   733: iload #14
/*     */     //   735: sipush #256
/*     */     //   738: iand
/*     */     //   739: ifeq -> 795
/*     */     //   742: new org/jetbrains/jewel/ui/component/FixedCursorPoint
/*     */     //   745: dup
/*     */     //   746: iconst_0
/*     */     //   747: istore #17
/*     */     //   749: iconst_0
/*     */     //   750: istore #18
/*     */     //   752: iload #17
/*     */     //   754: i2f
/*     */     //   755: invokestatic constructor-impl : (F)F
/*     */     //   758: bipush #16
/*     */     //   760: istore #17
/*     */     //   762: iconst_0
/*     */     //   763: istore #18
/*     */     //   765: iload #17
/*     */     //   767: i2f
/*     */     //   768: invokestatic constructor-impl : (F)F
/*     */     //   771: invokestatic DpOffset-YgX7TsA : (FF)J
/*     */     //   774: aconst_null
/*     */     //   775: fconst_0
/*     */     //   776: bipush #6
/*     */     //   778: aconst_null
/*     */     //   779: invokespecial <init> : (JLandroidx/compose/ui/Alignment;FILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   782: checkcast androidx/compose/foundation/TooltipPlacement
/*     */     //   785: astore #8
/*     */     //   787: iload #15
/*     */     //   789: ldc_w -234881025
/*     */     //   792: iand
/*     */     //   793: istore #15
/*     */     //   795: iload #14
/*     */     //   797: sipush #512
/*     */     //   800: iand
/*     */     //   801: ifeq -> 948
/*     */     //   804: aload #11
/*     */     //   806: ldc_w -808352499
/*     */     //   809: invokeinterface startReplaceGroup : (I)V
/*     */     //   814: aload #11
/*     */     //   816: astore #18
/*     */     //   818: iconst_0
/*     */     //   819: istore #19
/*     */     //   821: iconst_0
/*     */     //   822: istore #20
/*     */     //   824: aload #18
/*     */     //   826: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   831: astore #21
/*     */     //   833: iconst_0
/*     */     //   834: istore #22
/*     */     //   836: aload #21
/*     */     //   838: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   841: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   844: if_acmpne -> 869
/*     */     //   847: iconst_0
/*     */     //   848: istore #23
/*     */     //   850: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   853: astore #23
/*     */     //   855: aload #18
/*     */     //   857: aload #23
/*     */     //   859: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   864: aload #23
/*     */     //   866: goto -> 871
/*     */     //   869: aload #21
/*     */     //   871: nop
/*     */     //   872: nop
/*     */     //   873: nop
/*     */     //   874: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   877: astore #17
/*     */     //   879: aload #11
/*     */     //   881: invokeinterface endReplaceGroup : ()V
/*     */     //   886: aload #17
/*     */     //   888: astore #9
/*     */     //   890: goto -> 948
/*     */     //   893: aload #11
/*     */     //   895: invokeinterface skipToGroupEnd : ()V
/*     */     //   900: iload #14
/*     */     //   902: bipush #32
/*     */     //   904: iand
/*     */     //   905: ifeq -> 915
/*     */     //   908: iload #15
/*     */     //   910: ldc -458753
/*     */     //   912: iand
/*     */     //   913: istore #15
/*     */     //   915: iload #14
/*     */     //   917: sipush #128
/*     */     //   920: iand
/*     */     //   921: ifeq -> 931
/*     */     //   924: iload #15
/*     */     //   926: ldc -29360129
/*     */     //   928: iand
/*     */     //   929: istore #15
/*     */     //   931: iload #14
/*     */     //   933: sipush #256
/*     */     //   936: iand
/*     */     //   937: ifeq -> 948
/*     */     //   940: iload #15
/*     */     //   942: ldc_w -234881025
/*     */     //   945: iand
/*     */     //   946: istore #15
/*     */     //   948: aload #11
/*     */     //   950: invokeinterface endDefaults : ()V
/*     */     //   955: invokestatic isTraceInProgress : ()Z
/*     */     //   958: ifeq -> 973
/*     */     //   961: ldc 664995251
/*     */     //   963: iload #15
/*     */     //   965: iload #16
/*     */     //   967: ldc_w 'org.jetbrains.jewel.ui.component.ActionButton (ActionButton.kt:62)'
/*     */     //   970: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   973: aload_1
/*     */     //   974: aload_2
/*     */     //   975: iconst_0
/*     */     //   976: aload #7
/*     */     //   978: aload #8
/*     */     //   980: ldc_w 1088882854
/*     */     //   983: iconst_1
/*     */     //   984: new org/jetbrains/jewel/ui/component/ActionButtonKt$ActionButton$5
/*     */     //   987: dup
/*     */     //   988: aload_0
/*     */     //   989: iload_3
/*     */     //   990: iload #4
/*     */     //   992: aload #5
/*     */     //   994: aload #9
/*     */     //   996: aload #6
/*     */     //   998: aload #10
/*     */     //   1000: invokespecial <init> : (Lkotlin/jvm/functions/Function0;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1003: aload #11
/*     */     //   1005: bipush #54
/*     */     //   1007: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   1010: checkcast kotlin/jvm/functions/Function2
/*     */     //   1013: aload #11
/*     */     //   1015: ldc 196608
/*     */     //   1017: bipush #14
/*     */     //   1019: iload #15
/*     */     //   1021: iconst_3
/*     */     //   1022: ishr
/*     */     //   1023: iand
/*     */     //   1024: ior
/*     */     //   1025: bipush #112
/*     */     //   1027: iload #15
/*     */     //   1029: iconst_3
/*     */     //   1030: ishr
/*     */     //   1031: iand
/*     */     //   1032: ior
/*     */     //   1033: sipush #7168
/*     */     //   1036: iload #15
/*     */     //   1038: bipush #12
/*     */     //   1040: ishr
/*     */     //   1041: iand
/*     */     //   1042: ior
/*     */     //   1043: ldc 57344
/*     */     //   1045: iload #15
/*     */     //   1047: bipush #12
/*     */     //   1049: ishr
/*     */     //   1050: iand
/*     */     //   1051: ior
/*     */     //   1052: iconst_4
/*     */     //   1053: invokestatic Tooltip : (Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/component/styling/TooltipStyle;Landroidx/compose/foundation/TooltipPlacement;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1056: invokestatic isTraceInProgress : ()Z
/*     */     //   1059: ifeq -> 1075
/*     */     //   1062: invokestatic traceEventEnd : ()V
/*     */     //   1065: goto -> 1075
/*     */     //   1068: aload #11
/*     */     //   1070: invokeinterface skipToGroupEnd : ()V
/*     */     //   1075: aload #11
/*     */     //   1077: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1082: dup
/*     */     //   1083: ifnull -> 1123
/*     */     //   1086: aload_0
/*     */     //   1087: aload_1
/*     */     //   1088: aload_2
/*     */     //   1089: iload_3
/*     */     //   1090: iload #4
/*     */     //   1092: aload #5
/*     */     //   1094: aload #6
/*     */     //   1096: aload #7
/*     */     //   1098: aload #8
/*     */     //   1100: aload #9
/*     */     //   1102: aload #10
/*     */     //   1104: iload #12
/*     */     //   1106: iload #13
/*     */     //   1108: iload #14
/*     */     //   1110: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/layout/PaddingValues;Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;Landroidx/compose/foundation/TooltipPlacement;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;III)Lkotlin/jvm/functions/Function2;
/*     */     //   1115: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1120: goto -> 1124
/*     */     //   1123: pop
/*     */     //   1124: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #63	-> 19
/*     */     //   #54	-> 622
/*     */     //   #55	-> 637
/*     */     //   #56	-> 647
/*     */     //   #57	-> 658
/*     */     //   #58	-> 685
/*     */     //   #97	-> 691
/*     */     //   #58	-> 697
/*     */     //   #59	-> 714
/*     */     //   #60	-> 742
/*     */     //   #98	-> 752
/*     */     //   #60	-> 758
/*     */     //   #98	-> 765
/*     */     //   #60	-> 771
/*     */     //   #61	-> 804
/*     */     //   #99	-> 824
/*     */     //   #100	-> 836
/*     */     //   #101	-> 847
/*     */     //   #61	-> 850
/*     */     //   #101	-> 853
/*     */     //   #102	-> 855
/*     */     //   #103	-> 864
/*     */     //   #104	-> 869
/*     */     //   #100	-> 871
/*     */     //   #99	-> 872
/*     */     //   #99	-> 873
/*     */     //   #61	-> 874
/*     */     //   #63	-> 970
/*     */     //   #64	-> 973
/*     */     //   #75	-> 1068
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   691	6	18	$i$f$getDp	I
/*     */     //   688	9	17	$this$dp$iv	I
/*     */     //   752	6	18	$i$f$getDp	I
/*     */     //   749	9	17	$this$dp$iv	I
/*     */     //   765	6	18	$i$f$getDp	I
/*     */     //   762	9	17	$this$dp$iv	I
/*     */     //   850	3	23	$i$a$-cache-ActionButtonKt$ActionButton$4	I
/*     */     //   855	11	23	value$iv	Ljava/lang/Object;
/*     */     //   836	36	22	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   833	39	21	it$iv	Ljava/lang/Object;
/*     */     //   824	50	20	$i$f$cache	I
/*     */     //   821	53	18	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   821	53	19	invalid$iv	Z
/*     */     //   34	1091	15	$dirty	I
/*     */     //   38	1087	16	$dirty1	I
/*     */     //   0	1125	0	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	1125	1	tooltip	Lkotlin/jvm/functions/Function2;
/*     */     //   0	1125	2	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1125	3	enabled	Z
/*     */     //   0	1125	4	focusable	Z
/*     */     //   0	1125	5	style	Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;
/*     */     //   0	1125	6	contentPadding	Landroidx/compose/foundation/layout/PaddingValues;
/*     */     //   0	1125	7	tooltipStyle	Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;
/*     */     //   0	1125	8	tooltipPlacement	Landroidx/compose/foundation/TooltipPlacement;
/*     */     //   0	1125	9	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	1125	10	content	Lkotlin/jvm/functions/Function2;
/*     */     //   0	1125	11	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1125	12	$changed	I
/* 129 */     //   0	1125	13	$changed1	I } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) static final class ActionButtonKt$ActionButton$5 implements Function2<Composer, Integer, Unit> { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1088882854, $changed, -1, "org.jetbrains.jewel.ui.component.ActionButton.<anonymous> (ActionButton.kt:64)");  ActionButtonKt.CoreActionButton(this.$onClick, this.$enabled, this.$focusable, this.$style, this.$interactionSource, null, (Function2)ComposableLambdaKt.rememberComposableLambda(1630522508, true, new Function2<Composer, Integer, Unit>(this.$contentPadding, this.$content) { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1630522508, $changed, -1, "org.jetbrains.jewel.ui.component.ActionButton.<anonymous>.<anonymous> (ActionButton.kt:71)");  Modifier modifier1 = PaddingKt.padding((Modifier)Modifier.Companion, this.$contentPadding); Function2<Composer, Integer, Unit> function2 = this.$content; int $changed$iv = 0, $i$f$Box = 0; ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo"); Alignment contentAlignment$iv = Alignment.Companion.getTopStart(); boolean propagateMinConstraints$iv = false; MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv); int $changed$iv$iv = 0x70 & $changed$iv << 3; int $i$f$Layout = 0; ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"); int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0); CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap(); Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier1); Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0; ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"); if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer.startReusableNode(); if ($composer.getInserting()) { $composer.createNode(function0); } else { $composer.useNode(); }  Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0; Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy()); Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals()); Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0; Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0; if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) { $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv)); $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv); }  Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier()); int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-BoxKt$Box$1$iv = 0; ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; BoxScope $this$invoke_u24lambda_u240 = (BoxScope)BoxScopeInstance.INSTANCE; int $i$a$-Box-ActionButtonKt$ActionButton$5$1$1 = 0; function2.invoke(composer1, Integer.valueOf(0)); ComposerKt.sourceInformationMarkerEnd($composer$iv); $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer); ComposerKt.sourceInformationMarkerEnd($composer); ComposerKt.sourceInformationMarkerEnd($composer); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  }
/*     */                   else
/*     */                   { $composer.skipToGroupEnd(); }
/*     */                    }
/*     */                  }
/*     */               $composer, 54), $composer, 1572864, 32);
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventEnd();  }
/*     */       else
/*     */       { $composer.skipToGroupEnd(); }
/*     */        }
/*     */ 
/*     */     
/*     */     ActionButtonKt$ActionButton$5(Function0<Unit> $onClick, boolean $enabled, boolean $focusable, IconButtonStyle $style, MutableInteractionSource $interactionSource, PaddingValues $contentPadding, Function2<Composer, Integer, Unit> $content) {} }
/*     */ 
/*     */   
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*     */   private static final void CoreActionButton(Function0 onClick, boolean enabled, boolean focusable, IconButtonStyle style, MutableInteractionSource interactionSource, Modifier modifier, Function2 content, Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload #7
/*     */     //   2: ldc_w 1216696244
/*     */     //   5: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   10: astore #7
/*     */     //   12: iload #8
/*     */     //   14: istore #10
/*     */     //   16: iload #9
/*     */     //   18: iconst_1
/*     */     //   19: iand
/*     */     //   20: ifeq -> 33
/*     */     //   23: iload #10
/*     */     //   25: bipush #6
/*     */     //   27: ior
/*     */     //   28: istore #10
/*     */     //   30: goto -> 62
/*     */     //   33: iload #8
/*     */     //   35: bipush #6
/*     */     //   37: iand
/*     */     //   38: ifne -> 62
/*     */     //   41: iload #10
/*     */     //   43: aload #7
/*     */     //   45: aload_0
/*     */     //   46: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   51: ifeq -> 58
/*     */     //   54: iconst_4
/*     */     //   55: goto -> 59
/*     */     //   58: iconst_2
/*     */     //   59: ior
/*     */     //   60: istore #10
/*     */     //   62: iload #9
/*     */     //   64: iconst_2
/*     */     //   65: iand
/*     */     //   66: ifeq -> 79
/*     */     //   69: iload #10
/*     */     //   71: bipush #48
/*     */     //   73: ior
/*     */     //   74: istore #10
/*     */     //   76: goto -> 110
/*     */     //   79: iload #8
/*     */     //   81: bipush #48
/*     */     //   83: iand
/*     */     //   84: ifne -> 110
/*     */     //   87: iload #10
/*     */     //   89: aload #7
/*     */     //   91: iload_1
/*     */     //   92: invokeinterface changed : (Z)Z
/*     */     //   97: ifeq -> 105
/*     */     //   100: bipush #32
/*     */     //   102: goto -> 107
/*     */     //   105: bipush #16
/*     */     //   107: ior
/*     */     //   108: istore #10
/*     */     //   110: iload #9
/*     */     //   112: iconst_4
/*     */     //   113: iand
/*     */     //   114: ifeq -> 128
/*     */     //   117: iload #10
/*     */     //   119: sipush #384
/*     */     //   122: ior
/*     */     //   123: istore #10
/*     */     //   125: goto -> 162
/*     */     //   128: iload #8
/*     */     //   130: sipush #384
/*     */     //   133: iand
/*     */     //   134: ifne -> 162
/*     */     //   137: iload #10
/*     */     //   139: aload #7
/*     */     //   141: iload_2
/*     */     //   142: invokeinterface changed : (Z)Z
/*     */     //   147: ifeq -> 156
/*     */     //   150: sipush #256
/*     */     //   153: goto -> 159
/*     */     //   156: sipush #128
/*     */     //   159: ior
/*     */     //   160: istore #10
/*     */     //   162: iload #9
/*     */     //   164: bipush #8
/*     */     //   166: iand
/*     */     //   167: ifeq -> 181
/*     */     //   170: iload #10
/*     */     //   172: sipush #3072
/*     */     //   175: ior
/*     */     //   176: istore #10
/*     */     //   178: goto -> 215
/*     */     //   181: iload #8
/*     */     //   183: sipush #3072
/*     */     //   186: iand
/*     */     //   187: ifne -> 215
/*     */     //   190: iload #10
/*     */     //   192: aload #7
/*     */     //   194: aload_3
/*     */     //   195: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   200: ifeq -> 209
/*     */     //   203: sipush #2048
/*     */     //   206: goto -> 212
/*     */     //   209: sipush #1024
/*     */     //   212: ior
/*     */     //   213: istore #10
/*     */     //   215: iload #9
/*     */     //   217: bipush #16
/*     */     //   219: iand
/*     */     //   220: ifeq -> 234
/*     */     //   223: iload #10
/*     */     //   225: sipush #24576
/*     */     //   228: ior
/*     */     //   229: istore #10
/*     */     //   231: goto -> 269
/*     */     //   234: iload #8
/*     */     //   236: sipush #24576
/*     */     //   239: iand
/*     */     //   240: ifne -> 269
/*     */     //   243: iload #10
/*     */     //   245: aload #7
/*     */     //   247: aload #4
/*     */     //   249: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   254: ifeq -> 263
/*     */     //   257: sipush #16384
/*     */     //   260: goto -> 266
/*     */     //   263: sipush #8192
/*     */     //   266: ior
/*     */     //   267: istore #10
/*     */     //   269: iload #9
/*     */     //   271: bipush #32
/*     */     //   273: iand
/*     */     //   274: ifeq -> 287
/*     */     //   277: iload #10
/*     */     //   279: ldc 196608
/*     */     //   281: ior
/*     */     //   282: istore #10
/*     */     //   284: goto -> 319
/*     */     //   287: iload #8
/*     */     //   289: ldc 196608
/*     */     //   291: iand
/*     */     //   292: ifne -> 319
/*     */     //   295: iload #10
/*     */     //   297: aload #7
/*     */     //   299: aload #5
/*     */     //   301: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   306: ifeq -> 314
/*     */     //   309: ldc 131072
/*     */     //   311: goto -> 316
/*     */     //   314: ldc 65536
/*     */     //   316: ior
/*     */     //   317: istore #10
/*     */     //   319: iload #9
/*     */     //   321: bipush #64
/*     */     //   323: iand
/*     */     //   324: ifeq -> 337
/*     */     //   327: iload #10
/*     */     //   329: ldc 1572864
/*     */     //   331: ior
/*     */     //   332: istore #10
/*     */     //   334: goto -> 369
/*     */     //   337: iload #8
/*     */     //   339: ldc 1572864
/*     */     //   341: iand
/*     */     //   342: ifne -> 369
/*     */     //   345: iload #10
/*     */     //   347: aload #7
/*     */     //   349: aload #6
/*     */     //   351: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   356: ifeq -> 364
/*     */     //   359: ldc 1048576
/*     */     //   361: goto -> 366
/*     */     //   364: ldc 524288
/*     */     //   366: ior
/*     */     //   367: istore #10
/*     */     //   369: iload #10
/*     */     //   371: ldc_w 599187
/*     */     //   374: iand
/*     */     //   375: ldc_w 599186
/*     */     //   378: if_icmpne -> 391
/*     */     //   381: aload #7
/*     */     //   383: invokeinterface getSkipping : ()Z
/*     */     //   388: ifne -> 525
/*     */     //   391: iload #9
/*     */     //   393: bipush #32
/*     */     //   395: iand
/*     */     //   396: ifeq -> 407
/*     */     //   399: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   402: checkcast androidx/compose/ui/Modifier
/*     */     //   405: astore #5
/*     */     //   407: invokestatic isTraceInProgress : ()Z
/*     */     //   410: ifeq -> 425
/*     */     //   413: ldc_w 1216696244
/*     */     //   416: iload #10
/*     */     //   418: iconst_m1
/*     */     //   419: ldc_w 'org.jetbrains.jewel.ui.component.CoreActionButton (ActionButton.kt:85)'
/*     */     //   422: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   425: aload_0
/*     */     //   426: aload #5
/*     */     //   428: iload_1
/*     */     //   429: iload_2
/*     */     //   430: aload_3
/*     */     //   431: aload #4
/*     */     //   433: ldc_w 981470731
/*     */     //   436: iconst_1
/*     */     //   437: new org/jetbrains/jewel/ui/component/ActionButtonKt$CoreActionButton$1
/*     */     //   440: dup
/*     */     //   441: aload #6
/*     */     //   443: invokespecial <init> : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   446: aload #7
/*     */     //   448: bipush #54
/*     */     //   450: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   453: checkcast kotlin/jvm/functions/Function4
/*     */     //   456: aload #7
/*     */     //   458: ldc 1572864
/*     */     //   460: bipush #14
/*     */     //   462: iload #10
/*     */     //   464: iand
/*     */     //   465: ior
/*     */     //   466: bipush #112
/*     */     //   468: iload #10
/*     */     //   470: bipush #12
/*     */     //   472: ishr
/*     */     //   473: iand
/*     */     //   474: ior
/*     */     //   475: sipush #896
/*     */     //   478: iload #10
/*     */     //   480: iconst_3
/*     */     //   481: ishl
/*     */     //   482: iand
/*     */     //   483: ior
/*     */     //   484: sipush #7168
/*     */     //   487: iload #10
/*     */     //   489: iconst_3
/*     */     //   490: ishl
/*     */     //   491: iand
/*     */     //   492: ior
/*     */     //   493: ldc 57344
/*     */     //   495: iload #10
/*     */     //   497: iconst_3
/*     */     //   498: ishl
/*     */     //   499: iand
/*     */     //   500: ior
/*     */     //   501: ldc 458752
/*     */     //   503: iload #10
/*     */     //   505: iconst_3
/*     */     //   506: ishl
/*     */     //   507: iand
/*     */     //   508: ior
/*     */     //   509: iconst_0
/*     */     //   510: invokestatic IconButton : (Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V
/*     */     //   513: invokestatic isTraceInProgress : ()Z
/*     */     //   516: ifeq -> 532
/*     */     //   519: invokestatic traceEventEnd : ()V
/*     */     //   522: goto -> 532
/*     */     //   525: aload #7
/*     */     //   527: invokeinterface skipToGroupEnd : ()V
/*     */     //   532: aload #7
/*     */     //   534: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   539: dup
/*     */     //   540: ifnull -> 570
/*     */     //   543: aload_0
/*     */     //   544: iload_1
/*     */     //   545: iload_2
/*     */     //   546: aload_3
/*     */     //   547: aload #4
/*     */     //   549: aload #5
/*     */     //   551: aload #6
/*     */     //   553: iload #8
/*     */     //   555: iload #9
/*     */     //   557: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function0;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;II)Lkotlin/jvm/functions/Function2;
/*     */     //   562: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   567: goto -> 571
/*     */     //   570: pop
/*     */     //   571: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #86	-> 0
/*     */     //   #84	-> 399
/*     */     //   #86	-> 422
/*     */     //   #87	-> 425
/*     */     //   #88	-> 525
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   16	556	10	$dirty	I
/*     */     //   0	572	0	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	572	1	enabled	Z
/*     */     //   0	572	2	focusable	Z
/*     */     //   0	572	3	style	Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;
/*     */     //   0	572	4	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	572	5	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	572	6	content	Lkotlin/jvm/functions/Function2;
/*     */     //   0	572	7	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	572	8	$changed	I
/*     */   }
/*     */   
/*     */   private static final Unit ActionButton$lambda$1(Function0<Unit> $onClick, Modifier $modifier, boolean $enabled, boolean $focusable, IconButtonStyle $style, PaddingValues $contentPadding, MutableInteractionSource $interactionSource, Function2<? super Composer, ? super Integer, Unit> $content, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     ActionButton($onClick, $modifier, $enabled, $focusable, $style, $contentPadding, $interactionSource, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit ActionButton$lambda$3(Function0<Unit> $onClick, Function2<? super Composer, ? super Integer, Unit> $tooltip, Modifier $modifier, boolean $enabled, boolean $focusable, IconButtonStyle $style, PaddingValues $contentPadding, TooltipStyle $tooltipStyle, TooltipPlacement $tooltipPlacement, MutableInteractionSource $interactionSource, Function2<? super Composer, ? super Integer, Unit> $content, int $$changed, int $$changed1, int $$default, Composer $composer, int $force) {
/*     */     ActionButton($onClick, $tooltip, $modifier, $enabled, $focusable, $style, $contentPadding, $tooltipStyle, $tooltipPlacement, $interactionSource, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), RecomposeScopeImplKt.updateChangedFlags($$changed1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit CoreActionButton$lambda$4(Function0<Unit> $onClick, boolean $enabled, boolean $focusable, IconButtonStyle $style, MutableInteractionSource $interactionSource, Modifier $modifier, Function2<? super Composer, ? super Integer, Unit> $content, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     CoreActionButton($onClick, $enabled, $focusable, $style, $interactionSource, $modifier, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   static final class ActionButtonKt$CoreActionButton$1 implements Function4<BoxScope, IconButtonState, Composer, Integer, Unit> {
/*     */     ActionButtonKt$CoreActionButton$1(Function2<Composer, Integer, Unit> $content) {}
/*     */     
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke-KMTpdl8(BoxScope $this$IconButton, long it, Composer $composer, int $changed) {
/*     */       Intrinsics.checkNotNullParameter($this$IconButton, "$this$IconButton");
/*     */       if (($changed & 0x81) != 128 || !$composer.getSkipping()) {
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventStart(981470731, $changed, -1, "org.jetbrains.jewel.ui.component.CoreActionButton.<anonymous> (ActionButton.kt:86)"); 
/*     */         this.$content.invoke($composer, Integer.valueOf(0));
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventEnd(); 
/*     */       } else {
/*     */         $composer.skipToGroupEnd();
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\ActionButtonKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */