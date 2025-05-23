/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.layout.PaddingValues;
/*     */ import androidx.compose.foundation.lazy.LazyListState;
/*     */ import androidx.compose.foundation.text.input.TextFieldState;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableInferredTarget;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.IntState;
/*     */ import androidx.compose.runtime.MutableIntState;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function7;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.ranges.RangesKt;
/*     */ import kotlin.reflect.KProperty;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.foundation.lazy.SelectableLazyItemScope;
/*     */ import org.jetbrains.jewel.foundation.lazy.SelectableLazyListScope;
/*     */ import org.jetbrains.jewel.foundation.lazy.SelectableLazyListState;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000H\n\000\n\002\020\002\n\000\n\002\020 \n\002\020\016\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\b\n\002\b\006\032Î\001\020\000\032\0020\0012\f\020\002\032\b\022\004\022\0020\0040\0032\b\b\002\020\005\032\0020\0062\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\b2\b\b\002\020\n\032\0020\0132\024\b\002\020\f\032\016\022\004\022\0020\004\022\004\022\0020\0010\r2\024\b\002\020\016\032\016\022\004\022\0020\004\022\004\022\0020\0010\r2\024\b\002\020\017\032\016\022\004\022\0020\b\022\004\022\0020\0010\r2\024\b\002\020\020\032\016\022\004\022\0020\b\022\004\022\0020\0010\r2/\020\021\032+\022\004\022\0020\004\022\004\022\0020\b\022\004\022\0020\b\022\004\022\0020\b\022\004\022\0020\b\022\004\022\0020\0010\022¢\006\002\b\023H\007¢\006\004\b\024\020\025\032\032\020\026\032\0020\001*\0020\0272\006\020\030\032\0020\031H@¢\006\002\020\032¨\006\033²\006\n\020\034\032\0020\031X\002²\006\n\020\035\032\0020\bX\002²\006\f\020\036\032\004\030\0010\031X\002²\006\n\020\037\032\0020\bX\002"}, d2 = {"ListComboBox", "", "items", "", "", "modifier", "Landroidx/compose/ui/Modifier;", "isEditable", "", "isEnabled", "maxPopupHeight", "Landroidx/compose/ui/unit/Dp;", "onSelectedItemChange", "Lkotlin/Function1;", "onHoverItemChange", "onListHoverChange", "onPopupStateChange", "listItemContent", "Lkotlin/Function5;", "Landroidx/compose/runtime/Composable;", "ListComboBox-Fsagccs", "(Ljava/util/List;Landroidx/compose/ui/Modifier;ZZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function7;Landroidx/compose/runtime/Composer;II)V", "scrollToIndex", "Landroidx/compose/foundation/lazy/LazyListState;", "itemIndex", "", "(Landroidx/compose/foundation/lazy/LazyListState;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui", "selectedItem", "isListHovered", "hoverItemIndex", "isItemHovered"})
/*     */ @SourceDebugExtension({"SMAP\nListComboBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListComboBox.kt\norg/jetbrains/jewel/ui/component/ListComboBoxKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,238:1\n1225#2,6:239\n1225#2,6:245\n1225#2,6:251\n1225#2,6:257\n1225#2,6:263\n1225#2,6:269\n1225#2,6:275\n1225#2,3:286\n1228#2,3:292\n1225#2,6:296\n1225#2,6:302\n1225#2,6:308\n1225#2,6:314\n1225#2,6:320\n1225#2,6:326\n1225#2,6:341\n481#3:281\n480#3,4:282\n484#3,2:289\n488#3:295\n480#4:291\n78#5:332\n111#5,2:333\n81#6:335\n107#6,2:336\n81#6:338\n107#6,2:339\n*S KotlinDebug\n*F\n+ 1 ListComboBox.kt\norg/jetbrains/jewel/ui/component/ListComboBoxKt\n*L\n42#1:239,6\n43#1:245,6\n44#1:251,6\n45#1:257,6\n51#1:263,6\n52#1:269,6\n53#1:275,6\n54#1:286,3\n54#1:292,3\n56#1:296,6\n65#1:302,6\n73#1:308,6\n81#1:314,6\n162#1:320,6\n187#1:326,6\n138#1:341,6\n54#1:281\n54#1:282,4\n54#1:289,2\n54#1:295\n54#1:291\n51#1:332\n51#1:333,2\n52#1:335\n52#1:336,2\n53#1:338\n53#1:339,2\n*E\n"})
/*     */ public final class ListComboBoxKt {
/*  42 */   private static final Unit ListComboBox_Fsagccs$lambda$1$lambda$0(String it) { Intrinsics.checkNotNullParameter(it, "it"); return Unit.INSTANCE; }
/*  43 */   private static final Unit ListComboBox_Fsagccs$lambda$3$lambda$2(String it) { Intrinsics.checkNotNullParameter(it, "it"); return Unit.INSTANCE; }
/*  44 */   private static final Unit ListComboBox_Fsagccs$lambda$5$lambda$4(boolean it) { return Unit.INSTANCE; } private static final Unit ListComboBox_Fsagccs$lambda$7$lambda$6(boolean it) {
/*  45 */     return Unit.INSTANCE;
/*     */   }
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*     */   public static final void ListComboBox-Fsagccs(@NotNull List items, @Nullable Modifier modifier, boolean isEditable, boolean isEnabled, float maxPopupHeight, @Nullable Function1 onSelectedItemChange, @Nullable Function1 onHoverItemChange, @Nullable Function1 onListHoverChange, @Nullable Function1 onPopupStateChange, @NotNull Function7 listItemContent, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'items'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload #9
/*     */     //   8: ldc 'listItemContent'
/*     */     //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   13: aload #10
/*     */     //   15: ldc 761713909
/*     */     //   17: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   22: astore #10
/*     */     //   24: iload #11
/*     */     //   26: istore #13
/*     */     //   28: iload #12
/*     */     //   30: iconst_1
/*     */     //   31: iand
/*     */     //   32: ifeq -> 45
/*     */     //   35: iload #13
/*     */     //   37: bipush #6
/*     */     //   39: ior
/*     */     //   40: istore #13
/*     */     //   42: goto -> 74
/*     */     //   45: iload #11
/*     */     //   47: bipush #6
/*     */     //   49: iand
/*     */     //   50: ifne -> 74
/*     */     //   53: iload #13
/*     */     //   55: aload #10
/*     */     //   57: aload_0
/*     */     //   58: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   63: ifeq -> 70
/*     */     //   66: iconst_4
/*     */     //   67: goto -> 71
/*     */     //   70: iconst_2
/*     */     //   71: ior
/*     */     //   72: istore #13
/*     */     //   74: iload #12
/*     */     //   76: iconst_2
/*     */     //   77: iand
/*     */     //   78: ifeq -> 91
/*     */     //   81: iload #13
/*     */     //   83: bipush #48
/*     */     //   85: ior
/*     */     //   86: istore #13
/*     */     //   88: goto -> 122
/*     */     //   91: iload #11
/*     */     //   93: bipush #48
/*     */     //   95: iand
/*     */     //   96: ifne -> 122
/*     */     //   99: iload #13
/*     */     //   101: aload #10
/*     */     //   103: aload_1
/*     */     //   104: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   109: ifeq -> 117
/*     */     //   112: bipush #32
/*     */     //   114: goto -> 119
/*     */     //   117: bipush #16
/*     */     //   119: ior
/*     */     //   120: istore #13
/*     */     //   122: iload #12
/*     */     //   124: iconst_4
/*     */     //   125: iand
/*     */     //   126: ifeq -> 140
/*     */     //   129: iload #13
/*     */     //   131: sipush #384
/*     */     //   134: ior
/*     */     //   135: istore #13
/*     */     //   137: goto -> 174
/*     */     //   140: iload #11
/*     */     //   142: sipush #384
/*     */     //   145: iand
/*     */     //   146: ifne -> 174
/*     */     //   149: iload #13
/*     */     //   151: aload #10
/*     */     //   153: iload_2
/*     */     //   154: invokeinterface changed : (Z)Z
/*     */     //   159: ifeq -> 168
/*     */     //   162: sipush #256
/*     */     //   165: goto -> 171
/*     */     //   168: sipush #128
/*     */     //   171: ior
/*     */     //   172: istore #13
/*     */     //   174: iload #12
/*     */     //   176: bipush #8
/*     */     //   178: iand
/*     */     //   179: ifeq -> 193
/*     */     //   182: iload #13
/*     */     //   184: sipush #3072
/*     */     //   187: ior
/*     */     //   188: istore #13
/*     */     //   190: goto -> 227
/*     */     //   193: iload #11
/*     */     //   195: sipush #3072
/*     */     //   198: iand
/*     */     //   199: ifne -> 227
/*     */     //   202: iload #13
/*     */     //   204: aload #10
/*     */     //   206: iload_3
/*     */     //   207: invokeinterface changed : (Z)Z
/*     */     //   212: ifeq -> 221
/*     */     //   215: sipush #2048
/*     */     //   218: goto -> 224
/*     */     //   221: sipush #1024
/*     */     //   224: ior
/*     */     //   225: istore #13
/*     */     //   227: iload #12
/*     */     //   229: bipush #16
/*     */     //   231: iand
/*     */     //   232: ifeq -> 246
/*     */     //   235: iload #13
/*     */     //   237: sipush #24576
/*     */     //   240: ior
/*     */     //   241: istore #13
/*     */     //   243: goto -> 281
/*     */     //   246: iload #11
/*     */     //   248: sipush #24576
/*     */     //   251: iand
/*     */     //   252: ifne -> 281
/*     */     //   255: iload #13
/*     */     //   257: aload #10
/*     */     //   259: fload #4
/*     */     //   261: invokeinterface changed : (F)Z
/*     */     //   266: ifeq -> 275
/*     */     //   269: sipush #16384
/*     */     //   272: goto -> 278
/*     */     //   275: sipush #8192
/*     */     //   278: ior
/*     */     //   279: istore #13
/*     */     //   281: iload #12
/*     */     //   283: bipush #32
/*     */     //   285: iand
/*     */     //   286: ifeq -> 299
/*     */     //   289: iload #13
/*     */     //   291: ldc 196608
/*     */     //   293: ior
/*     */     //   294: istore #13
/*     */     //   296: goto -> 331
/*     */     //   299: iload #11
/*     */     //   301: ldc 196608
/*     */     //   303: iand
/*     */     //   304: ifne -> 331
/*     */     //   307: iload #13
/*     */     //   309: aload #10
/*     */     //   311: aload #5
/*     */     //   313: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   318: ifeq -> 326
/*     */     //   321: ldc 131072
/*     */     //   323: goto -> 328
/*     */     //   326: ldc 65536
/*     */     //   328: ior
/*     */     //   329: istore #13
/*     */     //   331: iload #12
/*     */     //   333: bipush #64
/*     */     //   335: iand
/*     */     //   336: ifeq -> 349
/*     */     //   339: iload #13
/*     */     //   341: ldc 1572864
/*     */     //   343: ior
/*     */     //   344: istore #13
/*     */     //   346: goto -> 381
/*     */     //   349: iload #11
/*     */     //   351: ldc 1572864
/*     */     //   353: iand
/*     */     //   354: ifne -> 381
/*     */     //   357: iload #13
/*     */     //   359: aload #10
/*     */     //   361: aload #6
/*     */     //   363: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   368: ifeq -> 376
/*     */     //   371: ldc 1048576
/*     */     //   373: goto -> 378
/*     */     //   376: ldc 524288
/*     */     //   378: ior
/*     */     //   379: istore #13
/*     */     //   381: iload #12
/*     */     //   383: sipush #128
/*     */     //   386: iand
/*     */     //   387: ifeq -> 400
/*     */     //   390: iload #13
/*     */     //   392: ldc 12582912
/*     */     //   394: ior
/*     */     //   395: istore #13
/*     */     //   397: goto -> 432
/*     */     //   400: iload #11
/*     */     //   402: ldc 12582912
/*     */     //   404: iand
/*     */     //   405: ifne -> 432
/*     */     //   408: iload #13
/*     */     //   410: aload #10
/*     */     //   412: aload #7
/*     */     //   414: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   419: ifeq -> 427
/*     */     //   422: ldc 8388608
/*     */     //   424: goto -> 429
/*     */     //   427: ldc 4194304
/*     */     //   429: ior
/*     */     //   430: istore #13
/*     */     //   432: iload #12
/*     */     //   434: sipush #256
/*     */     //   437: iand
/*     */     //   438: ifeq -> 451
/*     */     //   441: iload #13
/*     */     //   443: ldc 100663296
/*     */     //   445: ior
/*     */     //   446: istore #13
/*     */     //   448: goto -> 483
/*     */     //   451: iload #11
/*     */     //   453: ldc 100663296
/*     */     //   455: iand
/*     */     //   456: ifne -> 483
/*     */     //   459: iload #13
/*     */     //   461: aload #10
/*     */     //   463: aload #8
/*     */     //   465: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   470: ifeq -> 478
/*     */     //   473: ldc 67108864
/*     */     //   475: goto -> 480
/*     */     //   478: ldc 33554432
/*     */     //   480: ior
/*     */     //   481: istore #13
/*     */     //   483: iload #12
/*     */     //   485: sipush #512
/*     */     //   488: iand
/*     */     //   489: ifeq -> 502
/*     */     //   492: iload #13
/*     */     //   494: ldc 805306368
/*     */     //   496: ior
/*     */     //   497: istore #13
/*     */     //   499: goto -> 534
/*     */     //   502: iload #11
/*     */     //   504: ldc 805306368
/*     */     //   506: iand
/*     */     //   507: ifne -> 534
/*     */     //   510: iload #13
/*     */     //   512: aload #10
/*     */     //   514: aload #9
/*     */     //   516: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   521: ifeq -> 529
/*     */     //   524: ldc 536870912
/*     */     //   526: goto -> 531
/*     */     //   529: ldc 268435456
/*     */     //   531: ior
/*     */     //   532: istore #13
/*     */     //   534: iload #13
/*     */     //   536: ldc 306783379
/*     */     //   538: iand
/*     */     //   539: ldc 306783378
/*     */     //   541: if_icmpne -> 554
/*     */     //   544: aload #10
/*     */     //   546: invokeinterface getSkipping : ()Z
/*     */     //   551: ifne -> 2542
/*     */     //   554: iload #12
/*     */     //   556: iconst_2
/*     */     //   557: iand
/*     */     //   558: ifeq -> 568
/*     */     //   561: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   564: checkcast androidx/compose/ui/Modifier
/*     */     //   567: astore_1
/*     */     //   568: iload #12
/*     */     //   570: iconst_4
/*     */     //   571: iand
/*     */     //   572: ifeq -> 577
/*     */     //   575: iconst_1
/*     */     //   576: istore_2
/*     */     //   577: iload #12
/*     */     //   579: bipush #8
/*     */     //   581: iand
/*     */     //   582: ifeq -> 587
/*     */     //   585: iconst_1
/*     */     //   586: istore_3
/*     */     //   587: iload #12
/*     */     //   589: bipush #16
/*     */     //   591: iand
/*     */     //   592: ifeq -> 603
/*     */     //   595: getstatic androidx/compose/ui/unit/Dp.Companion : Landroidx/compose/ui/unit/Dp$Companion;
/*     */     //   598: invokevirtual getUnspecified-D9Ej5fM : ()F
/*     */     //   601: fstore #4
/*     */     //   603: iload #12
/*     */     //   605: bipush #32
/*     */     //   607: iand
/*     */     //   608: ifeq -> 698
/*     */     //   611: aload #10
/*     */     //   613: ldc -1952085541
/*     */     //   615: invokeinterface startReplaceGroup : (I)V
/*     */     //   620: aload #10
/*     */     //   622: astore #15
/*     */     //   624: iconst_0
/*     */     //   625: istore #16
/*     */     //   627: iconst_0
/*     */     //   628: istore #17
/*     */     //   630: aload #15
/*     */     //   632: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   637: astore #18
/*     */     //   639: iconst_0
/*     */     //   640: istore #19
/*     */     //   642: aload #18
/*     */     //   644: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   647: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   650: if_acmpne -> 677
/*     */     //   653: iconst_0
/*     */     //   654: istore #20
/*     */     //   656: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   661: astore #20
/*     */     //   663: aload #15
/*     */     //   665: aload #20
/*     */     //   667: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   672: aload #20
/*     */     //   674: goto -> 679
/*     */     //   677: aload #18
/*     */     //   679: nop
/*     */     //   680: nop
/*     */     //   681: nop
/*     */     //   682: checkcast kotlin/jvm/functions/Function1
/*     */     //   685: astore #14
/*     */     //   687: aload #10
/*     */     //   689: invokeinterface endReplaceGroup : ()V
/*     */     //   694: aload #14
/*     */     //   696: astore #5
/*     */     //   698: iload #12
/*     */     //   700: bipush #64
/*     */     //   702: iand
/*     */     //   703: ifeq -> 793
/*     */     //   706: aload #10
/*     */     //   708: ldc -1952084069
/*     */     //   710: invokeinterface startReplaceGroup : (I)V
/*     */     //   715: aload #10
/*     */     //   717: astore #15
/*     */     //   719: iconst_0
/*     */     //   720: istore #16
/*     */     //   722: iconst_0
/*     */     //   723: istore #17
/*     */     //   725: aload #15
/*     */     //   727: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   732: astore #18
/*     */     //   734: iconst_0
/*     */     //   735: istore #19
/*     */     //   737: aload #18
/*     */     //   739: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   742: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   745: if_acmpne -> 772
/*     */     //   748: iconst_0
/*     */     //   749: istore #20
/*     */     //   751: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   756: astore #20
/*     */     //   758: aload #15
/*     */     //   760: aload #20
/*     */     //   762: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   767: aload #20
/*     */     //   769: goto -> 774
/*     */     //   772: aload #18
/*     */     //   774: nop
/*     */     //   775: nop
/*     */     //   776: nop
/*     */     //   777: checkcast kotlin/jvm/functions/Function1
/*     */     //   780: astore #14
/*     */     //   782: aload #10
/*     */     //   784: invokeinterface endReplaceGroup : ()V
/*     */     //   789: aload #14
/*     */     //   791: astore #6
/*     */     //   793: iload #12
/*     */     //   795: sipush #128
/*     */     //   798: iand
/*     */     //   799: ifeq -> 889
/*     */     //   802: aload #10
/*     */     //   804: ldc -1952082565
/*     */     //   806: invokeinterface startReplaceGroup : (I)V
/*     */     //   811: aload #10
/*     */     //   813: astore #15
/*     */     //   815: iconst_0
/*     */     //   816: istore #16
/*     */     //   818: iconst_0
/*     */     //   819: istore #17
/*     */     //   821: aload #15
/*     */     //   823: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   828: astore #18
/*     */     //   830: iconst_0
/*     */     //   831: istore #19
/*     */     //   833: aload #18
/*     */     //   835: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   838: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   841: if_acmpne -> 868
/*     */     //   844: iconst_0
/*     */     //   845: istore #20
/*     */     //   847: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   852: astore #20
/*     */     //   854: aload #15
/*     */     //   856: aload #20
/*     */     //   858: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   863: aload #20
/*     */     //   865: goto -> 870
/*     */     //   868: aload #18
/*     */     //   870: nop
/*     */     //   871: nop
/*     */     //   872: nop
/*     */     //   873: checkcast kotlin/jvm/functions/Function1
/*     */     //   876: astore #14
/*     */     //   878: aload #10
/*     */     //   880: invokeinterface endReplaceGroup : ()V
/*     */     //   885: aload #14
/*     */     //   887: astore #7
/*     */     //   889: iload #12
/*     */     //   891: sipush #256
/*     */     //   894: iand
/*     */     //   895: ifeq -> 985
/*     */     //   898: aload #10
/*     */     //   900: ldc -1952081029
/*     */     //   902: invokeinterface startReplaceGroup : (I)V
/*     */     //   907: aload #10
/*     */     //   909: astore #15
/*     */     //   911: iconst_0
/*     */     //   912: istore #16
/*     */     //   914: iconst_0
/*     */     //   915: istore #17
/*     */     //   917: aload #15
/*     */     //   919: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   924: astore #18
/*     */     //   926: iconst_0
/*     */     //   927: istore #19
/*     */     //   929: aload #18
/*     */     //   931: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   934: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   937: if_acmpne -> 964
/*     */     //   940: iconst_0
/*     */     //   941: istore #20
/*     */     //   943: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   948: astore #20
/*     */     //   950: aload #15
/*     */     //   952: aload #20
/*     */     //   954: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   959: aload #20
/*     */     //   961: goto -> 966
/*     */     //   964: aload #18
/*     */     //   966: nop
/*     */     //   967: nop
/*     */     //   968: nop
/*     */     //   969: checkcast kotlin/jvm/functions/Function1
/*     */     //   972: astore #14
/*     */     //   974: aload #10
/*     */     //   976: invokeinterface endReplaceGroup : ()V
/*     */     //   981: aload #14
/*     */     //   983: astore #8
/*     */     //   985: invokestatic isTraceInProgress : ()Z
/*     */     //   988: ifeq -> 1001
/*     */     //   991: ldc 761713909
/*     */     //   993: iload #13
/*     */     //   995: iconst_m1
/*     */     //   996: ldc 'org.jetbrains.jewel.ui.component.ListComboBox (ListComboBox.kt:46)'
/*     */     //   998: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   1001: aload_0
/*     */     //   1002: invokestatic firstOrNull : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   1005: checkcast java/lang/String
/*     */     //   1008: dup
/*     */     //   1009: ifnonnull -> 1015
/*     */     //   1012: pop
/*     */     //   1013: ldc ''
/*     */     //   1015: astore #14
/*     */     //   1017: aload #14
/*     */     //   1019: lconst_0
/*     */     //   1020: aload #10
/*     */     //   1022: iconst_0
/*     */     //   1023: iconst_2
/*     */     //   1024: invokestatic rememberTextFieldState-Le-punE : (Ljava/lang/String;JLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/text/input/TextFieldState;
/*     */     //   1027: astore #15
/*     */     //   1029: iconst_0
/*     */     //   1030: iconst_0
/*     */     //   1031: aload #10
/*     */     //   1033: iconst_0
/*     */     //   1034: iconst_3
/*     */     //   1035: invokestatic rememberSelectableLazyListState : (IILandroidx/compose/runtime/Composer;II)Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;
/*     */     //   1038: astore #16
/*     */     //   1040: aload #10
/*     */     //   1042: ldc -1952070854
/*     */     //   1044: invokeinterface startReplaceGroup : (I)V
/*     */     //   1049: aload #10
/*     */     //   1051: astore #19
/*     */     //   1053: iconst_0
/*     */     //   1054: istore #20
/*     */     //   1056: nop
/*     */     //   1057: iconst_0
/*     */     //   1058: istore #21
/*     */     //   1060: aload #19
/*     */     //   1062: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1067: astore #22
/*     */     //   1069: iconst_0
/*     */     //   1070: istore #23
/*     */     //   1072: aload #22
/*     */     //   1074: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1077: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1080: if_acmpne -> 1106
/*     */     //   1083: iconst_0
/*     */     //   1084: istore #24
/*     */     //   1086: iconst_0
/*     */     //   1087: invokestatic mutableIntStateOf : (I)Landroidx/compose/runtime/MutableIntState;
/*     */     //   1090: astore #24
/*     */     //   1092: aload #19
/*     */     //   1094: aload #24
/*     */     //   1096: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1101: aload #24
/*     */     //   1103: goto -> 1108
/*     */     //   1106: aload #22
/*     */     //   1108: nop
/*     */     //   1109: nop
/*     */     //   1110: nop
/*     */     //   1111: checkcast androidx/compose/runtime/MutableIntState
/*     */     //   1114: astore #18
/*     */     //   1116: aload #10
/*     */     //   1118: invokeinterface endReplaceGroup : ()V
/*     */     //   1123: aload #18
/*     */     //   1125: astore #17
/*     */     //   1127: aload #10
/*     */     //   1129: ldc -1952068965
/*     */     //   1131: invokeinterface startReplaceGroup : (I)V
/*     */     //   1136: aload #10
/*     */     //   1138: astore #20
/*     */     //   1140: iconst_0
/*     */     //   1141: istore #21
/*     */     //   1143: nop
/*     */     //   1144: iconst_0
/*     */     //   1145: istore #22
/*     */     //   1147: aload #20
/*     */     //   1149: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1154: astore #23
/*     */     //   1156: iconst_0
/*     */     //   1157: istore #24
/*     */     //   1159: aload #23
/*     */     //   1161: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1164: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1167: if_acmpne -> 1199
/*     */     //   1170: iconst_0
/*     */     //   1171: istore #25
/*     */     //   1173: iconst_0
/*     */     //   1174: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   1177: aconst_null
/*     */     //   1178: iconst_2
/*     */     //   1179: aconst_null
/*     */     //   1180: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   1183: astore #25
/*     */     //   1185: aload #20
/*     */     //   1187: aload #25
/*     */     //   1189: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1194: aload #25
/*     */     //   1196: goto -> 1201
/*     */     //   1199: aload #23
/*     */     //   1201: nop
/*     */     //   1202: nop
/*     */     //   1203: nop
/*     */     //   1204: checkcast androidx/compose/runtime/MutableState
/*     */     //   1207: astore #19
/*     */     //   1209: aload #10
/*     */     //   1211: invokeinterface endReplaceGroup : ()V
/*     */     //   1216: aload #19
/*     */     //   1218: astore #18
/*     */     //   1220: aload #10
/*     */     //   1222: ldc -1952066822
/*     */     //   1224: invokeinterface startReplaceGroup : (I)V
/*     */     //   1229: aload #10
/*     */     //   1231: astore #21
/*     */     //   1233: iconst_0
/*     */     //   1234: istore #22
/*     */     //   1236: nop
/*     */     //   1237: iconst_0
/*     */     //   1238: istore #23
/*     */     //   1240: aload #21
/*     */     //   1242: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1247: astore #24
/*     */     //   1249: iconst_0
/*     */     //   1250: istore #25
/*     */     //   1252: aload #24
/*     */     //   1254: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1257: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1260: if_acmpne -> 1289
/*     */     //   1263: iconst_0
/*     */     //   1264: istore #26
/*     */     //   1266: aconst_null
/*     */     //   1267: aconst_null
/*     */     //   1268: iconst_2
/*     */     //   1269: aconst_null
/*     */     //   1270: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   1273: astore #26
/*     */     //   1275: aload #21
/*     */     //   1277: aload #26
/*     */     //   1279: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1284: aload #26
/*     */     //   1286: goto -> 1291
/*     */     //   1289: aload #24
/*     */     //   1291: nop
/*     */     //   1292: nop
/*     */     //   1293: nop
/*     */     //   1294: checkcast androidx/compose/runtime/MutableState
/*     */     //   1297: astore #20
/*     */     //   1299: aload #10
/*     */     //   1301: invokeinterface endReplaceGroup : ()V
/*     */     //   1306: aload #20
/*     */     //   1308: astore #19
/*     */     //   1310: iconst_0
/*     */     //   1311: istore #22
/*     */     //   1313: nop
/*     */     //   1314: iconst_0
/*     */     //   1315: istore #23
/*     */     //   1317: aload #10
/*     */     //   1319: ldc 773894976
/*     */     //   1321: ldc 'CC(rememberCoroutineScope)482@20254L144:Effects.kt#9igjgp'
/*     */     //   1323: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1326: aload #10
/*     */     //   1328: astore #24
/*     */     //   1330: aload #10
/*     */     //   1332: ldc -954370320
/*     */     //   1334: ldc 'CC(remember):Effects.kt#9igjgp'
/*     */     //   1336: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1339: aload #10
/*     */     //   1341: astore #25
/*     */     //   1343: iconst_0
/*     */     //   1344: istore #26
/*     */     //   1346: iconst_0
/*     */     //   1347: istore #27
/*     */     //   1349: aload #25
/*     */     //   1351: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1356: astore #28
/*     */     //   1358: iconst_0
/*     */     //   1359: istore #29
/*     */     //   1361: aload #28
/*     */     //   1363: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1366: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1369: if_acmpne -> 1416
/*     */     //   1372: iconst_0
/*     */     //   1373: istore #30
/*     */     //   1375: iconst_0
/*     */     //   1376: istore #31
/*     */     //   1378: getstatic kotlin/coroutines/EmptyCoroutineContext.INSTANCE : Lkotlin/coroutines/EmptyCoroutineContext;
/*     */     //   1381: checkcast kotlin/coroutines/CoroutineContext
/*     */     //   1384: aload #24
/*     */     //   1386: invokestatic createCompositionCoroutineScope : (Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;
/*     */     //   1389: astore #42
/*     */     //   1391: new androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*     */     //   1394: dup
/*     */     //   1395: aload #42
/*     */     //   1397: invokespecial <init> : (Lkotlinx/coroutines/CoroutineScope;)V
/*     */     //   1400: astore #31
/*     */     //   1402: aload #25
/*     */     //   1404: aload #31
/*     */     //   1406: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1411: aload #31
/*     */     //   1413: goto -> 1418
/*     */     //   1416: aload #28
/*     */     //   1418: nop
/*     */     //   1419: nop
/*     */     //   1420: nop
/*     */     //   1421: checkcast androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*     */     //   1424: astore #32
/*     */     //   1426: aload #10
/*     */     //   1428: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1431: aload #32
/*     */     //   1433: astore #33
/*     */     //   1435: aload #33
/*     */     //   1437: invokevirtual getCoroutineScope : ()Lkotlinx/coroutines/CoroutineScope;
/*     */     //   1440: astore #32
/*     */     //   1442: aload #10
/*     */     //   1444: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1447: aload #32
/*     */     //   1449: nop
/*     */     //   1450: astore #20
/*     */     //   1452: aload #17
/*     */     //   1454: invokestatic ListComboBox_Fsagccs$lambda$9 : (Landroidx/compose/runtime/MutableIntState;)I
/*     */     //   1457: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1460: aload #10
/*     */     //   1462: ldc -1952063310
/*     */     //   1464: invokeinterface startReplaceGroup : (I)V
/*     */     //   1469: aload #10
/*     */     //   1471: astore #22
/*     */     //   1473: aload #10
/*     */     //   1475: aload #16
/*     */     //   1477: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   1482: aload #10
/*     */     //   1484: aload_0
/*     */     //   1485: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   1490: ior
/*     */     //   1491: istore #23
/*     */     //   1493: iconst_0
/*     */     //   1494: istore #24
/*     */     //   1496: aload #22
/*     */     //   1498: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1503: astore #25
/*     */     //   1505: iconst_0
/*     */     //   1506: istore #26
/*     */     //   1508: iload #23
/*     */     //   1510: ifne -> 1524
/*     */     //   1513: aload #25
/*     */     //   1515: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1518: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1521: if_acmpne -> 1564
/*     */     //   1524: astore #36
/*     */     //   1526: iconst_0
/*     */     //   1527: istore #27
/*     */     //   1529: new org/jetbrains/jewel/ui/component/ListComboBoxKt$ListComboBox$5$1
/*     */     //   1532: dup
/*     */     //   1533: aload #16
/*     */     //   1535: aload_0
/*     */     //   1536: aload #17
/*     */     //   1538: aconst_null
/*     */     //   1539: invokespecial <init> : (Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;Ljava/util/List;Landroidx/compose/runtime/MutableIntState;Lkotlin/coroutines/Continuation;)V
/*     */     //   1542: checkcast kotlin/jvm/functions/Function2
/*     */     //   1545: aload #36
/*     */     //   1547: swap
/*     */     //   1548: astore #28
/*     */     //   1550: aload #22
/*     */     //   1552: aload #28
/*     */     //   1554: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1559: aload #28
/*     */     //   1561: goto -> 1566
/*     */     //   1564: aload #25
/*     */     //   1566: nop
/*     */     //   1567: nop
/*     */     //   1568: nop
/*     */     //   1569: checkcast kotlin/jvm/functions/Function2
/*     */     //   1572: astore #21
/*     */     //   1574: aload #10
/*     */     //   1576: invokeinterface endReplaceGroup : ()V
/*     */     //   1581: aload #21
/*     */     //   1583: aload #10
/*     */     //   1585: iconst_0
/*     */     //   1586: invokestatic LaunchedEffect : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1589: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   1592: aload #10
/*     */     //   1594: bipush #6
/*     */     //   1596: invokestatic getComboBoxStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/ComboBoxStyle;
/*     */     //   1599: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/ComboBoxMetrics;
/*     */     //   1602: invokevirtual getPopupContentPadding : ()Landroidx/compose/foundation/layout/PaddingValues;
/*     */     //   1605: astore #21
/*     */     //   1607: aload #10
/*     */     //   1609: ldc_w -1952057806
/*     */     //   1612: invokeinterface startReplaceGroup : (I)V
/*     */     //   1617: fload #4
/*     */     //   1619: getstatic androidx/compose/ui/unit/Dp.Companion : Landroidx/compose/ui/unit/Dp$Companion;
/*     */     //   1622: invokevirtual getUnspecified-D9Ej5fM : ()F
/*     */     //   1625: invokestatic equals-impl0 : (FF)Z
/*     */     //   1628: ifeq -> 1650
/*     */     //   1631: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   1634: aload #10
/*     */     //   1636: bipush #6
/*     */     //   1638: invokestatic getComboBoxStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/ComboBoxStyle;
/*     */     //   1641: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/ComboBoxMetrics;
/*     */     //   1644: invokevirtual getMaxPopupHeight-D9Ej5fM : ()F
/*     */     //   1647: goto -> 1652
/*     */     //   1650: fload #4
/*     */     //   1652: fstore #23
/*     */     //   1654: aload #10
/*     */     //   1656: invokeinterface endReplaceGroup : ()V
/*     */     //   1661: fload #23
/*     */     //   1663: fstore #22
/*     */     //   1665: aload #10
/*     */     //   1667: ldc_w -1952051461
/*     */     //   1670: invokeinterface startReplaceGroup : (I)V
/*     */     //   1675: aload #10
/*     */     //   1677: astore #25
/*     */     //   1679: aload #10
/*     */     //   1681: aload_0
/*     */     //   1682: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   1687: aload #10
/*     */     //   1689: aload #20
/*     */     //   1691: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   1696: ior
/*     */     //   1697: aload #10
/*     */     //   1699: aload #16
/*     */     //   1701: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   1706: ior
/*     */     //   1707: istore #26
/*     */     //   1709: nop
/*     */     //   1710: iconst_0
/*     */     //   1711: istore #27
/*     */     //   1713: aload #25
/*     */     //   1715: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1720: astore #28
/*     */     //   1722: iconst_0
/*     */     //   1723: istore #29
/*     */     //   1725: iload #26
/*     */     //   1727: ifne -> 1741
/*     */     //   1730: aload #28
/*     */     //   1732: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1735: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1738: if_acmpne -> 1774
/*     */     //   1741: iconst_0
/*     */     //   1742: istore #30
/*     */     //   1744: aload_0
/*     */     //   1745: aload #20
/*     */     //   1747: aload #19
/*     */     //   1749: aload #17
/*     */     //   1751: aload #16
/*     */     //   1753: <illegal opcode> invoke : (Ljava/util/List;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableIntState;Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;)Lkotlin/jvm/functions/Function0;
/*     */     //   1758: astore #31
/*     */     //   1760: aload #25
/*     */     //   1762: aload #31
/*     */     //   1764: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1769: aload #31
/*     */     //   1771: goto -> 1776
/*     */     //   1774: aload #28
/*     */     //   1776: nop
/*     */     //   1777: nop
/*     */     //   1778: nop
/*     */     //   1779: checkcast kotlin/jvm/functions/Function0
/*     */     //   1782: astore #24
/*     */     //   1784: aload #10
/*     */     //   1786: invokeinterface endReplaceGroup : ()V
/*     */     //   1791: aload #24
/*     */     //   1793: astore #23
/*     */     //   1795: aload #10
/*     */     //   1797: ldc_w -1952040977
/*     */     //   1800: invokeinterface startReplaceGroup : (I)V
/*     */     //   1805: aload #10
/*     */     //   1807: astore #26
/*     */     //   1809: aload #10
/*     */     //   1811: aload #20
/*     */     //   1813: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   1818: aload #10
/*     */     //   1820: aload #16
/*     */     //   1822: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   1827: ior
/*     */     //   1828: istore #27
/*     */     //   1830: nop
/*     */     //   1831: iconst_0
/*     */     //   1832: istore #28
/*     */     //   1834: aload #26
/*     */     //   1836: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1841: astore #29
/*     */     //   1843: iconst_0
/*     */     //   1844: istore #30
/*     */     //   1846: iload #27
/*     */     //   1848: ifne -> 1862
/*     */     //   1851: aload #29
/*     */     //   1853: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1856: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1859: if_acmpne -> 1894
/*     */     //   1862: iconst_0
/*     */     //   1863: istore #31
/*     */     //   1865: aload #20
/*     */     //   1867: aload #19
/*     */     //   1869: aload #17
/*     */     //   1871: aload #16
/*     */     //   1873: <illegal opcode> invoke : (Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableIntState;Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;)Lkotlin/jvm/functions/Function0;
/*     */     //   1878: astore #32
/*     */     //   1880: aload #26
/*     */     //   1882: aload #32
/*     */     //   1884: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1889: aload #32
/*     */     //   1891: goto -> 1896
/*     */     //   1894: aload #29
/*     */     //   1896: nop
/*     */     //   1897: nop
/*     */     //   1898: nop
/*     */     //   1899: checkcast kotlin/jvm/functions/Function0
/*     */     //   1902: astore #25
/*     */     //   1904: aload #10
/*     */     //   1906: invokeinterface endReplaceGroup : ()V
/*     */     //   1911: aload #25
/*     */     //   1913: astore #24
/*     */     //   1915: aload #10
/*     */     //   1917: ldc_w -1952031424
/*     */     //   1920: invokeinterface startReplaceGroup : (I)V
/*     */     //   1925: aload #10
/*     */     //   1927: astore #27
/*     */     //   1929: aload #10
/*     */     //   1931: aload_0
/*     */     //   1932: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   1937: aload #10
/*     */     //   1939: aload #15
/*     */     //   1941: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   1946: ior
/*     */     //   1947: istore #28
/*     */     //   1949: nop
/*     */     //   1950: iconst_0
/*     */     //   1951: istore #29
/*     */     //   1953: aload #27
/*     */     //   1955: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1960: astore #30
/*     */     //   1962: iconst_0
/*     */     //   1963: istore #31
/*     */     //   1965: iload #28
/*     */     //   1967: ifne -> 1981
/*     */     //   1970: aload #30
/*     */     //   1972: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1975: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1978: if_acmpne -> 2010
/*     */     //   1981: iconst_0
/*     */     //   1982: istore #32
/*     */     //   1984: aload_0
/*     */     //   1985: aload #15
/*     */     //   1987: aload #17
/*     */     //   1989: <illegal opcode> invoke : (Ljava/util/List;Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/runtime/MutableIntState;)Lkotlin/jvm/functions/Function0;
/*     */     //   1994: astore #33
/*     */     //   1996: aload #27
/*     */     //   1998: aload #33
/*     */     //   2000: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2005: aload #33
/*     */     //   2007: goto -> 2012
/*     */     //   2010: aload #30
/*     */     //   2012: nop
/*     */     //   2013: nop
/*     */     //   2014: nop
/*     */     //   2015: checkcast kotlin/jvm/functions/Function0
/*     */     //   2018: astore #26
/*     */     //   2020: aload #10
/*     */     //   2022: invokeinterface endReplaceGroup : ()V
/*     */     //   2027: aload #26
/*     */     //   2029: astore #25
/*     */     //   2031: iload_2
/*     */     //   2032: ifeq -> 2282
/*     */     //   2035: aload #10
/*     */     //   2037: ldc_w -380552656
/*     */     //   2040: invokeinterface startReplaceGroup : (I)V
/*     */     //   2045: aload_1
/*     */     //   2046: aconst_null
/*     */     //   2047: iload_3
/*     */     //   2048: aload #15
/*     */     //   2050: getstatic org/jetbrains/jewel/ui/Outline.None : Lorg/jetbrains/jewel/ui/Outline;
/*     */     //   2053: aload #10
/*     */     //   2055: ldc_w -1951932320
/*     */     //   2058: invokeinterface startReplaceGroup : (I)V
/*     */     //   2063: aload #10
/*     */     //   2065: astore #27
/*     */     //   2067: iconst_0
/*     */     //   2068: istore #28
/*     */     //   2070: nop
/*     */     //   2071: iconst_0
/*     */     //   2072: istore #29
/*     */     //   2074: aload #27
/*     */     //   2076: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   2081: astore #30
/*     */     //   2083: iconst_0
/*     */     //   2084: istore #31
/*     */     //   2086: aload #30
/*     */     //   2088: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   2091: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   2094: if_acmpne -> 2143
/*     */     //   2097: astore #40
/*     */     //   2099: astore #39
/*     */     //   2101: istore #38
/*     */     //   2103: astore #37
/*     */     //   2105: astore #36
/*     */     //   2107: iconst_0
/*     */     //   2108: istore #32
/*     */     //   2110: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   2113: astore #41
/*     */     //   2115: aload #36
/*     */     //   2117: aload #37
/*     */     //   2119: iload #38
/*     */     //   2121: aload #39
/*     */     //   2123: aload #40
/*     */     //   2125: aload #41
/*     */     //   2127: astore #32
/*     */     //   2129: aload #27
/*     */     //   2131: aload #32
/*     */     //   2133: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2138: aload #32
/*     */     //   2140: goto -> 2145
/*     */     //   2143: aload #30
/*     */     //   2145: nop
/*     */     //   2146: nop
/*     */     //   2147: nop
/*     */     //   2148: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   2151: astore #26
/*     */     //   2153: aload #10
/*     */     //   2155: invokeinterface endReplaceGroup : ()V
/*     */     //   2160: aload #26
/*     */     //   2162: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   2165: aload #10
/*     */     //   2167: bipush #6
/*     */     //   2169: invokestatic getComboBoxStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/ComboBoxStyle;
/*     */     //   2172: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   2175: aload #10
/*     */     //   2177: bipush #6
/*     */     //   2179: invokevirtual getDefaultTextStyle : (Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;
/*     */     //   2182: aload #23
/*     */     //   2184: aload #24
/*     */     //   2186: aload #25
/*     */     //   2188: aload #8
/*     */     //   2190: ldc_w 2034640723
/*     */     //   2193: iconst_1
/*     */     //   2194: new org/jetbrains/jewel/ui/component/ListComboBoxKt$ListComboBox$7
/*     */     //   2197: dup
/*     */     //   2198: aload_0
/*     */     //   2199: aload #16
/*     */     //   2201: fload #22
/*     */     //   2203: aload #21
/*     */     //   2205: aload #7
/*     */     //   2207: aload #6
/*     */     //   2209: aload #9
/*     */     //   2211: aload #18
/*     */     //   2213: aload #15
/*     */     //   2215: aload #5
/*     */     //   2217: aload #17
/*     */     //   2219: aload #19
/*     */     //   2221: invokespecial <init> : (Ljava/util/List;Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;FLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function7;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/text/input/TextFieldState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;)V
/*     */     //   2224: aload #10
/*     */     //   2226: bipush #54
/*     */     //   2228: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   2231: checkcast kotlin/jvm/functions/Function2
/*     */     //   2234: aload #10
/*     */     //   2236: ldc_w 221184
/*     */     //   2239: bipush #14
/*     */     //   2241: iload #13
/*     */     //   2243: iconst_3
/*     */     //   2244: ishr
/*     */     //   2245: iand
/*     */     //   2246: ior
/*     */     //   2247: sipush #896
/*     */     //   2250: iload #13
/*     */     //   2252: iconst_3
/*     */     //   2253: ishr
/*     */     //   2254: iand
/*     */     //   2255: ior
/*     */     //   2256: sipush #384
/*     */     //   2259: bipush #112
/*     */     //   2261: iload #13
/*     */     //   2263: bipush #21
/*     */     //   2265: ishr
/*     */     //   2266: iand
/*     */     //   2267: ior
/*     */     //   2268: iconst_2
/*     */     //   2269: invokestatic EditableComboBox : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/text/input/TextFieldState;Lorg/jetbrains/jewel/ui/Outline;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/ComboBoxStyle;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V
/*     */     //   2272: aload #10
/*     */     //   2274: invokeinterface endReplaceGroup : ()V
/*     */     //   2279: goto -> 2530
/*     */     //   2282: aload #10
/*     */     //   2284: ldc_w -379728738
/*     */     //   2287: invokeinterface startReplaceGroup : (I)V
/*     */     //   2292: aload_0
/*     */     //   2293: aload #17
/*     */     //   2295: invokestatic ListComboBox_Fsagccs$lambda$9 : (Landroidx/compose/runtime/MutableIntState;)I
/*     */     //   2298: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   2303: checkcast java/lang/String
/*     */     //   2306: astore #26
/*     */     //   2308: getstatic org/jetbrains/jewel/ui/Outline.None : Lorg/jetbrains/jewel/ui/Outline;
/*     */     //   2311: astore #27
/*     */     //   2313: aload #10
/*     */     //   2315: ldc_w -1951904864
/*     */     //   2318: invokeinterface startReplaceGroup : (I)V
/*     */     //   2323: aload #10
/*     */     //   2325: astore #30
/*     */     //   2327: iconst_0
/*     */     //   2328: istore #31
/*     */     //   2330: nop
/*     */     //   2331: iconst_0
/*     */     //   2332: istore #32
/*     */     //   2334: aload #30
/*     */     //   2336: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   2341: astore #33
/*     */     //   2343: iconst_0
/*     */     //   2344: istore #34
/*     */     //   2346: aload #33
/*     */     //   2348: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   2351: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   2354: if_acmpne -> 2379
/*     */     //   2357: iconst_0
/*     */     //   2358: istore #35
/*     */     //   2360: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   2363: astore #35
/*     */     //   2365: aload #30
/*     */     //   2367: aload #35
/*     */     //   2369: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2374: aload #35
/*     */     //   2376: goto -> 2381
/*     */     //   2379: aload #33
/*     */     //   2381: nop
/*     */     //   2382: nop
/*     */     //   2383: nop
/*     */     //   2384: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   2387: astore #29
/*     */     //   2389: aload #10
/*     */     //   2391: invokeinterface endReplaceGroup : ()V
/*     */     //   2396: aload #29
/*     */     //   2398: astore #28
/*     */     //   2400: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   2403: aload #10
/*     */     //   2405: bipush #6
/*     */     //   2407: invokestatic getComboBoxStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/ComboBoxStyle;
/*     */     //   2410: astore #29
/*     */     //   2412: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   2415: aload #10
/*     */     //   2417: bipush #6
/*     */     //   2419: invokevirtual getDefaultTextStyle : (Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;
/*     */     //   2422: astore #30
/*     */     //   2424: aload #26
/*     */     //   2426: aload_1
/*     */     //   2427: aconst_null
/*     */     //   2428: iload_3
/*     */     //   2429: aload #27
/*     */     //   2431: fload #22
/*     */     //   2433: aload #28
/*     */     //   2435: aload #29
/*     */     //   2437: aload #30
/*     */     //   2439: aload #23
/*     */     //   2441: aload #24
/*     */     //   2443: aload #8
/*     */     //   2445: ldc_w 2130896430
/*     */     //   2448: iconst_1
/*     */     //   2449: new org/jetbrains/jewel/ui/component/ListComboBoxKt$ListComboBox$9
/*     */     //   2452: dup
/*     */     //   2453: aload_0
/*     */     //   2454: aload #16
/*     */     //   2456: fload #22
/*     */     //   2458: aload #21
/*     */     //   2460: aload #7
/*     */     //   2462: aload #6
/*     */     //   2464: aload #9
/*     */     //   2466: aload #18
/*     */     //   2468: aload #15
/*     */     //   2470: aload #5
/*     */     //   2472: aload #17
/*     */     //   2474: aload #19
/*     */     //   2476: invokespecial <init> : (Ljava/util/List;Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;FLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function7;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/text/input/TextFieldState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;)V
/*     */     //   2479: aload #10
/*     */     //   2481: bipush #54
/*     */     //   2483: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   2486: checkcast kotlin/jvm/functions/Function2
/*     */     //   2489: aload #10
/*     */     //   2491: ldc_w 1597440
/*     */     //   2494: bipush #112
/*     */     //   2496: iload #13
/*     */     //   2498: iand
/*     */     //   2499: ior
/*     */     //   2500: sipush #7168
/*     */     //   2503: iload #13
/*     */     //   2505: iand
/*     */     //   2506: ior
/*     */     //   2507: sipush #384
/*     */     //   2510: bipush #112
/*     */     //   2512: iload #13
/*     */     //   2514: bipush #21
/*     */     //   2516: ishr
/*     */     //   2517: iand
/*     */     //   2518: ior
/*     */     //   2519: iconst_4
/*     */     //   2520: invokestatic ComboBox-xYaah8o : (Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/Outline;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/ComboBoxStyle;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V
/*     */     //   2523: aload #10
/*     */     //   2525: invokeinterface endReplaceGroup : ()V
/*     */     //   2530: invokestatic isTraceInProgress : ()Z
/*     */     //   2533: ifeq -> 2549
/*     */     //   2536: invokestatic traceEventEnd : ()V
/*     */     //   2539: goto -> 2549
/*     */     //   2542: aload #10
/*     */     //   2544: invokeinterface skipToGroupEnd : ()V
/*     */     //   2549: aload #10
/*     */     //   2551: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   2556: dup
/*     */     //   2557: ifnull -> 2593
/*     */     //   2560: aload_0
/*     */     //   2561: aload_1
/*     */     //   2562: iload_2
/*     */     //   2563: iload_3
/*     */     //   2564: fload #4
/*     */     //   2566: aload #5
/*     */     //   2568: aload #6
/*     */     //   2570: aload #7
/*     */     //   2572: aload #8
/*     */     //   2574: aload #9
/*     */     //   2576: iload #11
/*     */     //   2578: iload #12
/*     */     //   2580: <illegal opcode> invoke : (Ljava/util/List;Landroidx/compose/ui/Modifier;ZZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function7;II)Lkotlin/jvm/functions/Function2;
/*     */     //   2585: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   2590: goto -> 2594
/*     */     //   2593: pop
/*     */     //   2594: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #47	-> 13
/*     */     //   #38	-> 561
/*     */     //   #39	-> 575
/*     */     //   #40	-> 585
/*     */     //   #41	-> 595
/*     */     //   #42	-> 611
/*     */     //   #239	-> 630
/*     */     //   #240	-> 642
/*     */     //   #241	-> 653
/*     */     //   #241	-> 661
/*     */     //   #242	-> 663
/*     */     //   #243	-> 672
/*     */     //   #244	-> 677
/*     */     //   #240	-> 679
/*     */     //   #239	-> 680
/*     */     //   #239	-> 681
/*     */     //   #42	-> 682
/*     */     //   #43	-> 706
/*     */     //   #245	-> 725
/*     */     //   #246	-> 737
/*     */     //   #247	-> 748
/*     */     //   #247	-> 756
/*     */     //   #248	-> 758
/*     */     //   #249	-> 767
/*     */     //   #250	-> 772
/*     */     //   #246	-> 774
/*     */     //   #245	-> 775
/*     */     //   #245	-> 776
/*     */     //   #43	-> 777
/*     */     //   #44	-> 802
/*     */     //   #251	-> 821
/*     */     //   #252	-> 833
/*     */     //   #253	-> 844
/*     */     //   #253	-> 852
/*     */     //   #254	-> 854
/*     */     //   #255	-> 863
/*     */     //   #256	-> 868
/*     */     //   #252	-> 870
/*     */     //   #251	-> 871
/*     */     //   #251	-> 872
/*     */     //   #44	-> 873
/*     */     //   #45	-> 898
/*     */     //   #257	-> 917
/*     */     //   #258	-> 929
/*     */     //   #259	-> 940
/*     */     //   #259	-> 948
/*     */     //   #260	-> 950
/*     */     //   #261	-> 959
/*     */     //   #262	-> 964
/*     */     //   #258	-> 966
/*     */     //   #257	-> 967
/*     */     //   #257	-> 968
/*     */     //   #45	-> 969
/*     */     //   #47	-> 998
/*     */     //   #48	-> 1001
/*     */     //   #48	-> 1015
/*     */     //   #49	-> 1017
/*     */     //   #50	-> 1035
/*     */     //   #51	-> 1056
/*     */     //   #263	-> 1060
/*     */     //   #264	-> 1072
/*     */     //   #265	-> 1083
/*     */     //   #51	-> 1086
/*     */     //   #265	-> 1090
/*     */     //   #266	-> 1092
/*     */     //   #267	-> 1101
/*     */     //   #268	-> 1106
/*     */     //   #264	-> 1108
/*     */     //   #263	-> 1109
/*     */     //   #263	-> 1110
/*     */     //   #51	-> 1111
/*     */     //   #52	-> 1143
/*     */     //   #269	-> 1147
/*     */     //   #270	-> 1159
/*     */     //   #271	-> 1170
/*     */     //   #52	-> 1173
/*     */     //   #271	-> 1183
/*     */     //   #272	-> 1185
/*     */     //   #273	-> 1194
/*     */     //   #274	-> 1199
/*     */     //   #270	-> 1201
/*     */     //   #269	-> 1202
/*     */     //   #269	-> 1203
/*     */     //   #52	-> 1204
/*     */     //   #53	-> 1236
/*     */     //   #275	-> 1240
/*     */     //   #276	-> 1252
/*     */     //   #277	-> 1263
/*     */     //   #53	-> 1266
/*     */     //   #277	-> 1273
/*     */     //   #278	-> 1275
/*     */     //   #279	-> 1284
/*     */     //   #280	-> 1289
/*     */     //   #276	-> 1291
/*     */     //   #275	-> 1292
/*     */     //   #275	-> 1293
/*     */     //   #53	-> 1294
/*     */     //   #54	-> 1313
/*     */     //   #281	-> 1323
/*     */     //   #282	-> 1326
/*     */     //   #284	-> 1328
/*     */     //   #285	-> 1336
/*     */     //   #286	-> 1349
/*     */     //   #287	-> 1361
/*     */     //   #288	-> 1372
/*     */     //   #289	-> 1375
/*     */     //   #290	-> 1375
/*     */     //   #291	-> 1378
/*     */     //   #290	-> 1381
/*     */     //   #289	-> 1389
/*     */     //   #288	-> 1400
/*     */     //   #292	-> 1402
/*     */     //   #293	-> 1411
/*     */     //   #294	-> 1416
/*     */     //   #287	-> 1418
/*     */     //   #286	-> 1419
/*     */     //   #286	-> 1420
/*     */     //   #285	-> 1421
/*     */     //   #295	-> 1435
/*     */     //   #281	-> 1444
/*     */     //   #295	-> 1449
/*     */     //   #54	-> 1450
/*     */     //   #56	-> 1452
/*     */     //   #296	-> 1496
/*     */     //   #297	-> 1508
/*     */     //   #298	-> 1524
/*     */     //   #56	-> 1529
/*     */     //   #298	-> 1548
/*     */     //   #299	-> 1550
/*     */     //   #300	-> 1559
/*     */     //   #301	-> 1564
/*     */     //   #297	-> 1566
/*     */     //   #296	-> 1567
/*     */     //   #296	-> 1568
/*     */     //   #56	-> 1569
/*     */     //   #57	-> 1589
/*     */     //   #59	-> 1617
/*     */     //   #60	-> 1631
/*     */     //   #62	-> 1650
/*     */     //   #59	-> 1652
/*     */     //   #58	-> 1663
/*     */     //   #65	-> 1709
/*     */     //   #302	-> 1713
/*     */     //   #303	-> 1725
/*     */     //   #304	-> 1741
/*     */     //   #65	-> 1744
/*     */     //   #304	-> 1758
/*     */     //   #305	-> 1760
/*     */     //   #306	-> 1769
/*     */     //   #307	-> 1774
/*     */     //   #303	-> 1776
/*     */     //   #302	-> 1777
/*     */     //   #302	-> 1778
/*     */     //   #65	-> 1779
/*     */     //   #73	-> 1830
/*     */     //   #308	-> 1834
/*     */     //   #309	-> 1846
/*     */     //   #310	-> 1862
/*     */     //   #73	-> 1865
/*     */     //   #310	-> 1878
/*     */     //   #311	-> 1880
/*     */     //   #312	-> 1889
/*     */     //   #313	-> 1894
/*     */     //   #309	-> 1896
/*     */     //   #308	-> 1897
/*     */     //   #308	-> 1898
/*     */     //   #73	-> 1899
/*     */     //   #81	-> 1949
/*     */     //   #314	-> 1953
/*     */     //   #315	-> 1965
/*     */     //   #316	-> 1981
/*     */     //   #81	-> 1984
/*     */     //   #316	-> 1994
/*     */     //   #317	-> 1996
/*     */     //   #318	-> 2005
/*     */     //   #319	-> 2010
/*     */     //   #315	-> 2012
/*     */     //   #314	-> 2013
/*     */     //   #314	-> 2014
/*     */     //   #81	-> 2015
/*     */     //   #156	-> 2031
/*     */     //   #158	-> 2045
/*     */     //   #159	-> 2047
/*     */     //   #160	-> 2048
/*     */     //   #161	-> 2050
/*     */     //   #162	-> 2070
/*     */     //   #320	-> 2074
/*     */     //   #321	-> 2086
/*     */     //   #322	-> 2097
/*     */     //   #162	-> 2110
/*     */     //   #322	-> 2127
/*     */     //   #323	-> 2129
/*     */     //   #324	-> 2138
/*     */     //   #325	-> 2143
/*     */     //   #321	-> 2145
/*     */     //   #320	-> 2146
/*     */     //   #320	-> 2147
/*     */     //   #162	-> 2148
/*     */     //   #163	-> 2162
/*     */     //   #164	-> 2172
/*     */     //   #165	-> 2182
/*     */     //   #166	-> 2184
/*     */     //   #167	-> 2186
/*     */     //   #168	-> 2188
/*     */     //   #169	-> 2190
/*     */     //   #157	-> 2269
/*     */     //   #156	-> 2272
/*     */     //   #180	-> 2282
/*     */     //   #184	-> 2292
/*     */     //   #185	-> 2308
/*     */     //   #187	-> 2330
/*     */     //   #326	-> 2334
/*     */     //   #327	-> 2346
/*     */     //   #328	-> 2357
/*     */     //   #187	-> 2360
/*     */     //   #328	-> 2363
/*     */     //   #329	-> 2365
/*     */     //   #330	-> 2374
/*     */     //   #331	-> 2379
/*     */     //   #327	-> 2381
/*     */     //   #326	-> 2382
/*     */     //   #326	-> 2383
/*     */     //   #187	-> 2384
/*     */     //   #188	-> 2400
/*     */     //   #189	-> 2412
/*     */     //   #184	-> 2424
/*     */     //   #182	-> 2426
/*     */     //   #183	-> 2428
/*     */     //   #185	-> 2429
/*     */     //   #186	-> 2431
/*     */     //   #187	-> 2433
/*     */     //   #188	-> 2435
/*     */     //   #189	-> 2437
/*     */     //   #190	-> 2439
/*     */     //   #191	-> 2441
/*     */     //   #192	-> 2443
/*     */     //   #193	-> 2445
/*     */     //   #181	-> 2520
/*     */     //   #180	-> 2523
/*     */     //   #205	-> 2542
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   656	5	20	$i$a$-cache-ListComboBoxKt$ListComboBox$1	I
/*     */     //   663	11	20	value$iv	Ljava/lang/Object;
/*     */     //   642	38	19	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   639	41	18	it$iv	Ljava/lang/Object;
/*     */     //   630	52	17	$i$f$cache	I
/*     */     //   627	55	15	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   627	55	16	invalid$iv	Z
/*     */     //   751	5	20	$i$a$-cache-ListComboBoxKt$ListComboBox$2	I
/*     */     //   758	11	20	value$iv	Ljava/lang/Object;
/*     */     //   737	38	19	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   734	41	18	it$iv	Ljava/lang/Object;
/*     */     //   725	52	17	$i$f$cache	I
/*     */     //   722	55	15	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   722	55	16	invalid$iv	Z
/*     */     //   847	5	20	$i$a$-cache-ListComboBoxKt$ListComboBox$3	I
/*     */     //   854	11	20	value$iv	Ljava/lang/Object;
/*     */     //   833	38	19	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   830	41	18	it$iv	Ljava/lang/Object;
/*     */     //   821	52	17	$i$f$cache	I
/*     */     //   818	55	15	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   818	55	16	invalid$iv	Z
/*     */     //   943	5	20	$i$a$-cache-ListComboBoxKt$ListComboBox$4	I
/*     */     //   950	11	20	value$iv	Ljava/lang/Object;
/*     */     //   929	38	19	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   926	41	18	it$iv	Ljava/lang/Object;
/*     */     //   917	52	17	$i$f$cache	I
/*     */     //   914	55	15	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   914	55	16	invalid$iv	Z
/*     */     //   1086	4	24	$i$a$-cache-ListComboBoxKt$ListComboBox$selectedItem$2	I
/*     */     //   1092	11	24	value$iv	Ljava/lang/Object;
/*     */     //   1072	37	23	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1069	40	22	it$iv	Ljava/lang/Object;
/*     */     //   1060	51	21	$i$f$cache	I
/*     */     //   1057	54	19	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1057	54	20	invalid$iv	Z
/*     */     //   1173	10	25	$i$a$-cache-ListComboBoxKt$ListComboBox$isListHovered$2	I
/*     */     //   1185	11	25	value$iv	Ljava/lang/Object;
/*     */     //   1159	43	24	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1156	46	23	it$iv	Ljava/lang/Object;
/*     */     //   1147	57	22	$i$f$cache	I
/*     */     //   1144	60	20	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1144	60	21	invalid$iv	Z
/*     */     //   1266	7	26	$i$a$-cache-ListComboBoxKt$ListComboBox$hoverItemIndex$2	I
/*     */     //   1275	11	26	value$iv	Ljava/lang/Object;
/*     */     //   1252	40	25	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1249	43	24	it$iv	Ljava/lang/Object;
/*     */     //   1240	54	23	$i$f$cache	I
/*     */     //   1237	57	21	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1237	57	22	invalid$iv	Z
/*     */     //   1378	3	31	$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1	I
/*     */     //   1375	25	30	$i$a$-cache-EffectsKt$rememberCoroutineScope$wrapper$1$iv	I
/*     */     //   1402	11	31	value$iv$iv	Ljava/lang/Object;
/*     */     //   1361	58	29	$i$a$-let-ComposerKt$cache$1$iv$iv	I
/*     */     //   1358	61	28	it$iv$iv	Ljava/lang/Object;
/*     */     //   1349	72	27	$i$f$cache	I
/*     */     //   1346	75	25	$this$cache$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1346	75	26	invalid$iv$iv	Z
/*     */     //   1317	133	23	$i$f$rememberCoroutineScope	I
/*     */     //   1330	120	24	composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1435	15	33	wrapper$iv	Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;
/*     */     //   1314	136	22	$changed$iv	I
/*     */     //   1529	16	27	$i$a$-cache-ListComboBoxKt$ListComboBox$5	I
/*     */     //   1550	11	28	value$iv	Ljava/lang/Object;
/*     */     //   1508	59	26	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1505	62	25	it$iv	Ljava/lang/Object;
/*     */     //   1496	73	24	$i$f$cache	I
/*     */     //   1493	76	22	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1493	76	23	invalid$iv	Z
/*     */     //   1744	14	30	$i$a$-cache-ListComboBoxKt$ListComboBox$onArrowDownPress$1	I
/*     */     //   1760	11	31	value$iv	Ljava/lang/Object;
/*     */     //   1725	52	29	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1722	55	28	it$iv	Ljava/lang/Object;
/*     */     //   1713	66	27	$i$f$cache	I
/*     */     //   1710	69	25	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1710	69	26	invalid$iv	Z
/*     */     //   1865	13	31	$i$a$-cache-ListComboBoxKt$ListComboBox$onArrowUpPress$1	I
/*     */     //   1880	11	32	value$iv	Ljava/lang/Object;
/*     */     //   1846	51	30	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1843	54	29	it$iv	Ljava/lang/Object;
/*     */     //   1834	65	28	$i$f$cache	I
/*     */     //   1831	68	26	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1831	68	27	invalid$iv	Z
/*     */     //   1984	10	32	$i$a$-cache-ListComboBoxKt$ListComboBox$onEnterPress$1	I
/*     */     //   1996	11	33	value$iv	Ljava/lang/Object;
/*     */     //   1965	48	31	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1962	51	30	it$iv	Ljava/lang/Object;
/*     */     //   1953	62	29	$i$f$cache	I
/*     */     //   1950	65	27	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1950	65	28	invalid$iv	Z
/*     */     //   2110	3	32	$i$a$-cache-ListComboBoxKt$ListComboBox$6	I
/*     */     //   2129	11	32	value$iv	Ljava/lang/Object;
/*     */     //   2086	60	31	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   2083	63	30	it$iv	Ljava/lang/Object;
/*     */     //   2074	74	29	$i$f$cache	I
/*     */     //   2071	77	27	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2071	77	28	invalid$iv	Z
/*     */     //   2360	3	35	$i$a$-cache-ListComboBoxKt$ListComboBox$8	I
/*     */     //   2365	11	35	value$iv	Ljava/lang/Object;
/*     */     //   2346	36	34	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   2343	39	33	it$iv	Ljava/lang/Object;
/*     */     //   2334	50	32	$i$f$cache	I
/*     */     //   2331	53	30	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2331	53	31	invalid$iv	Z
/*     */     //   1017	1522	14	initialTextFieldContent	Ljava/lang/String;
/*     */     //   1029	1510	15	inputTextFieldState	Landroidx/compose/foundation/text/input/TextFieldState;
/*     */     //   1040	1499	16	scrollState	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;
/*     */     //   1127	1412	17	selectedItem$delegate	Landroidx/compose/runtime/MutableIntState;
/*     */     //   1220	1319	18	isListHovered$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   1310	1229	19	hoverItemIndex$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   1452	1087	20	scope	Lkotlinx/coroutines/CoroutineScope;
/*     */     //   1607	932	21	contentPadding	Landroidx/compose/foundation/layout/PaddingValues;
/*     */     //   1665	874	22	popupMaxHeight	F
/*     */     //   1795	744	23	onArrowDownPress	Lkotlin/jvm/functions/Function0;
/*     */     //   1915	624	24	onArrowUpPress	Lkotlin/jvm/functions/Function0;
/*     */     //   2031	508	25	onEnterPress	Lkotlin/jvm/functions/Function0;
/*     */     //   28	2567	13	$dirty	I
/*     */     //   0	2595	0	items	Ljava/util/List;
/*     */     //   0	2595	1	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	2595	2	isEditable	Z
/*     */     //   0	2595	3	isEnabled	Z
/*     */     //   0	2595	4	maxPopupHeight	F
/*     */     //   0	2595	5	onSelectedItemChange	Lkotlin/jvm/functions/Function1;
/*     */     //   0	2595	6	onHoverItemChange	Lkotlin/jvm/functions/Function1;
/*     */     //   0	2595	7	onListHoverChange	Lkotlin/jvm/functions/Function1;
/*     */     //   0	2595	8	onPopupStateChange	Lkotlin/jvm/functions/Function1;
/*     */     //   0	2595	9	listItemContent	Lkotlin/jvm/functions/Function7;
/*     */     //   0	2595	10	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	2595	11	$changed	I
/*  51 */   } private static final int ListComboBox_Fsagccs$lambda$9(MutableIntState $selectedItem$delegate) { IntState intState = (IntState)$selectedItem$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 332 */       intState.getIntValue(); } private static final void ListComboBox_Fsagccs$lambda$10(MutableIntState $selectedItem$delegate, int <set-?>) { MutableIntState mutableIntState = $selectedItem$delegate; Object object = null; KProperty property$iv = null; int $i$f$setValue = 0;
/* 333 */     mutableIntState.setIntValue(<set-?>); } private static final boolean ListComboBox_Fsagccs$lambda$12(MutableState $isListHovered$delegate) { State state = (State)$isListHovered$delegate; Object object = null; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 335 */     return ((Boolean)state.getValue()).booleanValue(); } private static final void ListComboBox_Fsagccs$lambda$13(MutableState $isListHovered$delegate, boolean <set-?>) { MutableState mutableState = $isListHovered$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 336 */     mutableState.setValue(value$iv); } private static final Integer ListComboBox_Fsagccs$lambda$15(MutableState $hoverItemIndex$delegate) { State state = (State)$hoverItemIndex$delegate; Object object = null; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 338 */     return (Integer)state.getValue(); } private static final void ListComboBox_Fsagccs$lambda$16(MutableState $hoverItemIndex$delegate, Integer <set-?>) { MutableState mutableState = $hoverItemIndex$delegate; Object object = null; KProperty property$iv = null; int $i$f$setValue = 0;
/* 339 */     mutableState.setValue(<set-?>); }
/*     */ 
/*     */   
/*     */   @DebugMetadata(f = "ListComboBox.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.ListComboBoxKt$ListComboBox$5$1")
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class ListComboBoxKt$ListComboBox$5$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     ListComboBoxKt$ListComboBox$5$1(SelectableLazyListState $scrollState, List<String> $items, MutableIntState $selectedItem$delegate, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.$scrollState.setSelectedKeys(SetsKt.setOf(this.$items.get(ListComboBoxKt.ListComboBox_Fsagccs$lambda$9(this.$selectedItem$delegate))));
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super ListComboBoxKt$ListComboBox$5$1> $completion) {
/*     */       return (Continuation<Unit>)new ListComboBoxKt$ListComboBox$5$1(this.$scrollState, this.$items, this.$selectedItem$delegate, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((ListComboBoxKt$ListComboBox$5$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private static final Unit ListComboBox_Fsagccs$lambda$20$lambda$19(List $items, CoroutineScope $scope, MutableState<Integer> $hoverItemIndex$delegate, MutableIntState $selectedItem$delegate, SelectableLazyListState $scrollState) {
/*     */     int hoveredIndex = ListComboBox_Fsagccs$lambda$15($hoverItemIndex$delegate).intValue(), $i$a$-let-ListComboBoxKt$ListComboBox$onArrowDownPress$1$1$1 = 0;
/*     */     ListComboBox_Fsagccs$lambda$10($selectedItem$delegate, hoveredIndex);
/*     */     ListComboBox_Fsagccs$lambda$16($hoverItemIndex$delegate, null);
/*     */     ListComboBox_Fsagccs$lambda$15($hoverItemIndex$delegate);
/*     */     ListComboBox_Fsagccs$lambda$10($selectedItem$delegate, RangesKt.coerceAtMost(ListComboBox_Fsagccs$lambda$9($selectedItem$delegate) + 1, CollectionsKt.getLastIndex($items)));
/*     */     BuildersKt.launch$default($scope, null, null, new ListComboBoxKt$ListComboBox$onArrowDownPress$1$1$2($scrollState, $selectedItem$delegate, null), 3, null);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "ListComboBox.kt", l = {71}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.ListComboBoxKt$ListComboBox$onArrowDownPress$1$1$2")
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class ListComboBoxKt$ListComboBox$onArrowDownPress$1$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     ListComboBoxKt$ListComboBox$onArrowDownPress$1$1$2(SelectableLazyListState $scrollState, MutableIntState $selectedItem$delegate, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           if (ListComboBoxKt.scrollToIndex(this.$scrollState.getLazyListState(), ListComboBoxKt.ListComboBox_Fsagccs$lambda$9(this.$selectedItem$delegate), (Continuation)this) == object)
/*     */             return object; 
/*     */           ListComboBoxKt.scrollToIndex(this.$scrollState.getLazyListState(), ListComboBoxKt.ListComboBox_Fsagccs$lambda$9(this.$selectedItem$delegate), (Continuation)this);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super ListComboBoxKt$ListComboBox$onArrowDownPress$1$1$2> $completion) {
/*     */       return (Continuation<Unit>)new ListComboBoxKt$ListComboBox$onArrowDownPress$1$1$2(this.$scrollState, this.$selectedItem$delegate, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((ListComboBoxKt$ListComboBox$onArrowDownPress$1$1$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private static final Unit ListComboBox_Fsagccs$lambda$23$lambda$22(CoroutineScope $scope, MutableState<Integer> $hoverItemIndex$delegate, MutableIntState $selectedItem$delegate, SelectableLazyListState $scrollState) {
/*     */     int hoveredIndex = ListComboBox_Fsagccs$lambda$15($hoverItemIndex$delegate).intValue(), $i$a$-let-ListComboBoxKt$ListComboBox$onArrowUpPress$1$1$1 = 0;
/*     */     ListComboBox_Fsagccs$lambda$10($selectedItem$delegate, hoveredIndex);
/*     */     ListComboBox_Fsagccs$lambda$16($hoverItemIndex$delegate, null);
/*     */     ListComboBox_Fsagccs$lambda$15($hoverItemIndex$delegate);
/*     */     ListComboBox_Fsagccs$lambda$10($selectedItem$delegate, RangesKt.coerceAtLeast(ListComboBox_Fsagccs$lambda$9($selectedItem$delegate) - 1, 0));
/*     */     BuildersKt.launch$default($scope, null, null, new ListComboBoxKt$ListComboBox$onArrowUpPress$1$1$2($scrollState, $selectedItem$delegate, null), 3, null);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "ListComboBox.kt", l = {79}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.ListComboBoxKt$ListComboBox$onArrowUpPress$1$1$2")
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class ListComboBoxKt$ListComboBox$onArrowUpPress$1$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     ListComboBoxKt$ListComboBox$onArrowUpPress$1$1$2(SelectableLazyListState $scrollState, MutableIntState $selectedItem$delegate, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           if (ListComboBoxKt.scrollToIndex(this.$scrollState.getLazyListState(), ListComboBoxKt.ListComboBox_Fsagccs$lambda$9(this.$selectedItem$delegate), (Continuation)this) == object)
/*     */             return object; 
/*     */           ListComboBoxKt.scrollToIndex(this.$scrollState.getLazyListState(), ListComboBoxKt.ListComboBox_Fsagccs$lambda$9(this.$selectedItem$delegate), (Continuation)this);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super ListComboBoxKt$ListComboBox$onArrowUpPress$1$1$2> $completion) {
/*     */       return (Continuation<Unit>)new ListComboBoxKt$ListComboBox$onArrowUpPress$1$1$2(this.$scrollState, this.$selectedItem$delegate, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((ListComboBoxKt$ListComboBox$onArrowUpPress$1$1$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private static final Unit ListComboBox_Fsagccs$lambda$25$lambda$24(List $items, TextFieldState $inputTextFieldState, MutableIntState $selectedItem$delegate) {
/*     */     int indexOfSelected = CollectionsKt.indexOf($items, $inputTextFieldState.getText());
/*     */     if (indexOfSelected != -1)
/*     */       ListComboBox_Fsagccs$lambda$10($selectedItem$delegate, indexOfSelected); 
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final void ListComboBox_Fsagccs$onSelectedIndexChange(TextFieldState inputTextFieldState, List<String> $items, Function1 $onSelectedItemChange, MutableIntState selectedItem$delegate, int selectedItemIndex) {
/*     */     ListComboBox_Fsagccs$lambda$10(selectedItem$delegate, selectedItemIndex);
/*     */     TextFieldStateKt.setTextAndPlaceCursorAtEnd(inputTextFieldState, $items.get(selectedItemIndex));
/*     */     $onSelectedItemChange.invoke($items.get(selectedItemIndex));
/*     */   }
/*     */   
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*     */   private static final Function1<SelectableLazyListScope, Unit> ListComboBox_Fsagccs$contentItems(MutableState hoverItemIndex$delegate, List items, Function1 onHoverItemChange, Function7 listItemContent) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: aload_2
/*     */     //   2: aload_0
/*     */     //   3: aload_3
/*     */     //   4: <illegal opcode> invoke : (Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function7;)Lkotlin/jvm/functions/Function1;
/*     */     //   9: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #98	-> 0
/*     */     //   #123	-> 9
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	10	0	hoverItemIndex$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   0	10	1	items	Ljava/util/List;
/*     */     //   0	10	2	onHoverItemChange	Lkotlin/jvm/functions/Function1;
/*     */     //   0	10	3	listItemContent	Lkotlin/jvm/functions/Function7;
/*     */   }
/*     */   
/*     */   private static final Unit ListComboBox_Fsagccs$contentItems$lambda$26(List<String> $items, Function1<? super String, Unit> $onHoverItemChange, MutableState<Integer> $hoverItemIndex$delegate, Function7<? super String, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, ? super Composer, ? super Integer, Unit> $listItemContent, SelectableLazyListScope <this>) {
/*     */     Intrinsics.checkNotNullParameter(<this>, "<this>");
/*     */     SelectableLazyListScopeKt.items$default(<this>, $items, null, null, null, (Function4)ComposableLambdaKt.composableLambdaInstance(-34086440, true, new ListComboBoxKt$ListComboBox$contentItems$1$1($items, $onHoverItemChange, $hoverItemIndex$delegate, $listItemContent)), 14, null);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nListComboBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListComboBox.kt\norg/jetbrains/jewel/ui/component/ListComboBoxKt$ListComboBox$contentItems$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,238:1\n1225#2,6:239\n1225#2,6:245\n71#3:251\n68#3,6:252\n74#3:286\n78#3:290\n79#4,6:258\n86#4,4:273\n90#4,2:283\n94#4:289\n368#5,9:264\n377#5:285\n378#5,2:287\n4034#6,6:277\n81#7:291\n107#7,2:292\n*S KotlinDebug\n*F\n+ 1 ListComboBox.kt\norg/jetbrains/jewel/ui/component/ListComboBoxKt$ListComboBox$contentItems$1$1\n*L\n102#1:239,6\n105#1:245,6\n103#1:251\n103#1:252,6\n103#1:286\n103#1:290\n103#1:258,6\n103#1:273,4\n103#1:283,2\n103#1:289\n103#1:264,9\n103#1:285\n103#1:287,2\n103#1:277,6\n102#1:291\n102#1:292,2\n*E\n"})
/*     */   static final class ListComboBoxKt$ListComboBox$contentItems$1$1 implements Function4<SelectableLazyItemScope, String, Composer, Integer, Unit> {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(SelectableLazyItemScope $this$items, String item, Composer $composer, int $changed) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc '$this$items'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_2
/*     */       //   7: ldc 'item'
/*     */       //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   12: iload #4
/*     */       //   14: istore #5
/*     */       //   16: iload #4
/*     */       //   18: bipush #6
/*     */       //   20: iand
/*     */       //   21: ifne -> 44
/*     */       //   24: iload #5
/*     */       //   26: aload_3
/*     */       //   27: aload_1
/*     */       //   28: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   33: ifeq -> 40
/*     */       //   36: iconst_4
/*     */       //   37: goto -> 41
/*     */       //   40: iconst_2
/*     */       //   41: ior
/*     */       //   42: istore #5
/*     */       //   44: iload #4
/*     */       //   46: bipush #48
/*     */       //   48: iand
/*     */       //   49: ifne -> 74
/*     */       //   52: iload #5
/*     */       //   54: aload_3
/*     */       //   55: aload_2
/*     */       //   56: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   61: ifeq -> 69
/*     */       //   64: bipush #32
/*     */       //   66: goto -> 71
/*     */       //   69: bipush #16
/*     */       //   71: ior
/*     */       //   72: istore #5
/*     */       //   74: iload #5
/*     */       //   76: sipush #147
/*     */       //   79: iand
/*     */       //   80: sipush #146
/*     */       //   83: if_icmpne -> 95
/*     */       //   86: aload_3
/*     */       //   87: invokeinterface getSkipping : ()Z
/*     */       //   92: ifne -> 861
/*     */       //   95: invokestatic isTraceInProgress : ()Z
/*     */       //   98: ifeq -> 111
/*     */       //   101: ldc -34086440
/*     */       //   103: iload #5
/*     */       //   105: iconst_m1
/*     */       //   106: ldc 'org.jetbrains.jewel.ui.component.ListComboBox.contentItems.<anonymous>.<anonymous> (ListComboBox.kt:101)'
/*     */       //   108: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */       //   111: aload_3
/*     */       //   112: ldc -666838276
/*     */       //   114: invokeinterface startReplaceGroup : (I)V
/*     */       //   119: aload_3
/*     */       //   120: astore #8
/*     */       //   122: iconst_0
/*     */       //   123: istore #9
/*     */       //   125: iconst_0
/*     */       //   126: istore #10
/*     */       //   128: aload #8
/*     */       //   130: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   135: astore #11
/*     */       //   137: iconst_0
/*     */       //   138: istore #12
/*     */       //   140: aload #11
/*     */       //   142: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   145: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   148: if_acmpne -> 180
/*     */       //   151: iconst_0
/*     */       //   152: istore #13
/*     */       //   154: iconst_0
/*     */       //   155: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */       //   158: aconst_null
/*     */       //   159: iconst_2
/*     */       //   160: aconst_null
/*     */       //   161: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */       //   164: astore #13
/*     */       //   166: aload #8
/*     */       //   168: aload #13
/*     */       //   170: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   175: aload #13
/*     */       //   177: goto -> 182
/*     */       //   180: aload #11
/*     */       //   182: nop
/*     */       //   183: nop
/*     */       //   184: nop
/*     */       //   185: checkcast androidx/compose/runtime/MutableState
/*     */       //   188: astore #7
/*     */       //   190: aload_3
/*     */       //   191: invokeinterface endReplaceGroup : ()V
/*     */       //   196: aload #7
/*     */       //   198: astore #6
/*     */       //   200: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */       //   203: checkcast androidx/compose/ui/Modifier
/*     */       //   206: aload_3
/*     */       //   207: ldc -666833936
/*     */       //   209: invokeinterface startReplaceGroup : (I)V
/*     */       //   214: aload_3
/*     */       //   215: astore #8
/*     */       //   217: aload_3
/*     */       //   218: aload_0
/*     */       //   219: getfield $items : Ljava/util/List;
/*     */       //   222: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */       //   227: iload #5
/*     */       //   229: bipush #112
/*     */       //   231: iand
/*     */       //   232: bipush #32
/*     */       //   234: if_icmpne -> 241
/*     */       //   237: iconst_1
/*     */       //   238: goto -> 242
/*     */       //   241: iconst_0
/*     */       //   242: ior
/*     */       //   243: aload_3
/*     */       //   244: aload_0
/*     */       //   245: getfield $onHoverItemChange : Lkotlin/jvm/functions/Function1;
/*     */       //   248: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   253: ior
/*     */       //   254: istore #9
/*     */       //   256: aload_0
/*     */       //   257: getfield $items : Ljava/util/List;
/*     */       //   260: astore #10
/*     */       //   262: aload_0
/*     */       //   263: getfield $onHoverItemChange : Lkotlin/jvm/functions/Function1;
/*     */       //   266: astore #11
/*     */       //   268: aload_0
/*     */       //   269: getfield $hoverItemIndex$delegate : Landroidx/compose/runtime/MutableState;
/*     */       //   272: astore #12
/*     */       //   274: iconst_0
/*     */       //   275: istore #13
/*     */       //   277: aload #8
/*     */       //   279: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   284: astore #14
/*     */       //   286: iconst_0
/*     */       //   287: istore #15
/*     */       //   289: iload #9
/*     */       //   291: ifne -> 305
/*     */       //   294: aload #14
/*     */       //   296: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   299: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   302: if_acmpne -> 343
/*     */       //   305: astore #37
/*     */       //   307: iconst_0
/*     */       //   308: istore #16
/*     */       //   310: aload #10
/*     */       //   312: aload_2
/*     */       //   313: aload #11
/*     */       //   315: aload #6
/*     */       //   317: aload #12
/*     */       //   319: <illegal opcode> invoke : (Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */       //   324: aload #37
/*     */       //   326: swap
/*     */       //   327: astore #17
/*     */       //   329: aload #8
/*     */       //   331: aload #17
/*     */       //   333: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   338: aload #17
/*     */       //   340: goto -> 345
/*     */       //   343: aload #14
/*     */       //   345: nop
/*     */       //   346: nop
/*     */       //   347: nop
/*     */       //   348: checkcast kotlin/jvm/functions/Function1
/*     */       //   351: astore #7
/*     */       //   353: aload_3
/*     */       //   354: invokeinterface endReplaceGroup : ()V
/*     */       //   359: aload #7
/*     */       //   361: invokestatic onHover : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */       //   364: astore #7
/*     */       //   366: aload_0
/*     */       //   367: getfield $listItemContent : Lkotlin/jvm/functions/Function7;
/*     */       //   370: astore #10
/*     */       //   372: aload_0
/*     */       //   373: getfield $items : Ljava/util/List;
/*     */       //   376: astore #11
/*     */       //   378: aload_0
/*     */       //   379: getfield $hoverItemIndex$delegate : Landroidx/compose/runtime/MutableState;
/*     */       //   382: astore #12
/*     */       //   384: iconst_0
/*     */       //   385: istore #13
/*     */       //   387: iconst_0
/*     */       //   388: istore #14
/*     */       //   390: aload_3
/*     */       //   391: ldc 733328855
/*     */       //   393: ldc 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */       //   395: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   398: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */       //   401: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */       //   404: astore #8
/*     */       //   406: iconst_0
/*     */       //   407: istore #9
/*     */       //   409: aload #8
/*     */       //   411: iload #9
/*     */       //   413: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */       //   416: astore #15
/*     */       //   418: bipush #112
/*     */       //   420: iload #13
/*     */       //   422: iconst_3
/*     */       //   423: ishl
/*     */       //   424: iand
/*     */       //   425: istore #16
/*     */       //   427: nop
/*     */       //   428: iconst_0
/*     */       //   429: istore #17
/*     */       //   431: aload_3
/*     */       //   432: ldc -1323940314
/*     */       //   434: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */       //   436: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   439: aload_3
/*     */       //   440: iconst_0
/*     */       //   441: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */       //   444: istore #18
/*     */       //   446: aload_3
/*     */       //   447: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */       //   452: astore #19
/*     */       //   454: aload_3
/*     */       //   455: aload #7
/*     */       //   457: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */       //   460: astore #20
/*     */       //   462: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   465: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */       //   468: astore #21
/*     */       //   470: bipush #6
/*     */       //   472: sipush #896
/*     */       //   475: iload #16
/*     */       //   477: bipush #6
/*     */       //   479: ishl
/*     */       //   480: iand
/*     */       //   481: ior
/*     */       //   482: istore #22
/*     */       //   484: nop
/*     */       //   485: iconst_0
/*     */       //   486: istore #23
/*     */       //   488: aload_3
/*     */       //   489: ldc -692256719
/*     */       //   491: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */       //   493: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   496: aload_3
/*     */       //   497: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */       //   502: instanceof androidx/compose/runtime/Applier
/*     */       //   505: ifne -> 511
/*     */       //   508: invokestatic invalidApplier : ()V
/*     */       //   511: aload_3
/*     */       //   512: invokeinterface startReusableNode : ()V
/*     */       //   517: aload_3
/*     */       //   518: invokeinterface getInserting : ()Z
/*     */       //   523: ifeq -> 537
/*     */       //   526: aload_3
/*     */       //   527: aload #21
/*     */       //   529: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */       //   534: goto -> 543
/*     */       //   537: aload_3
/*     */       //   538: invokeinterface useNode : ()V
/*     */       //   543: aload_3
/*     */       //   544: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */       //   547: astore #24
/*     */       //   549: iconst_0
/*     */       //   550: istore #25
/*     */       //   552: aload #24
/*     */       //   554: aload #15
/*     */       //   556: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   559: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */       //   562: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   565: aload #24
/*     */       //   567: aload #19
/*     */       //   569: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   572: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */       //   575: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   578: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   581: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */       //   584: astore #26
/*     */       //   586: iconst_0
/*     */       //   587: istore #27
/*     */       //   589: aload #24
/*     */       //   591: astore #28
/*     */       //   593: iconst_0
/*     */       //   594: istore #29
/*     */       //   596: aload #28
/*     */       //   598: invokeinterface getInserting : ()Z
/*     */       //   603: ifne -> 624
/*     */       //   606: aload #28
/*     */       //   608: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   613: iload #18
/*     */       //   615: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   618: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   621: ifne -> 650
/*     */       //   624: aload #28
/*     */       //   626: iload #18
/*     */       //   628: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   631: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   636: aload #24
/*     */       //   638: iload #18
/*     */       //   640: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   643: aload #26
/*     */       //   645: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   650: nop
/*     */       //   651: nop
/*     */       //   652: nop
/*     */       //   653: aload #24
/*     */       //   655: aload #20
/*     */       //   657: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   660: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */       //   663: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   666: nop
/*     */       //   667: nop
/*     */       //   668: aload_3
/*     */       //   669: bipush #14
/*     */       //   671: iload #22
/*     */       //   673: bipush #6
/*     */       //   675: ishr
/*     */       //   676: iand
/*     */       //   677: istore #30
/*     */       //   679: astore #31
/*     */       //   681: iconst_0
/*     */       //   682: istore #32
/*     */       //   684: aload #31
/*     */       //   686: ldc_w -2146769399
/*     */       //   689: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */       //   692: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   695: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */       //   698: aload #31
/*     */       //   700: bipush #6
/*     */       //   702: bipush #112
/*     */       //   704: iload #13
/*     */       //   706: bipush #6
/*     */       //   708: ishr
/*     */       //   709: iand
/*     */       //   710: ior
/*     */       //   711: istore #33
/*     */       //   713: astore #34
/*     */       //   715: checkcast androidx/compose/foundation/layout/BoxScope
/*     */       //   718: astore #35
/*     */       //   720: iconst_0
/*     */       //   721: istore #36
/*     */       //   723: aload #10
/*     */       //   725: aload_2
/*     */       //   726: aload_1
/*     */       //   727: invokeinterface isSelected : ()Z
/*     */       //   732: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */       //   735: aload_1
/*     */       //   736: invokeinterface isActive : ()Z
/*     */       //   741: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */       //   744: aload #6
/*     */       //   746: invokestatic invoke$lambda$1 : (Landroidx/compose/runtime/MutableState;)Z
/*     */       //   749: ifne -> 780
/*     */       //   752: aload #11
/*     */       //   754: aload_2
/*     */       //   755: invokeinterface indexOf : (Ljava/lang/Object;)I
/*     */       //   760: aload #12
/*     */       //   762: invokestatic access$ListComboBox_Fsagccs$lambda$15 : (Landroidx/compose/runtime/MutableState;)Ljava/lang/Integer;
/*     */       //   765: dup
/*     */       //   766: ifnonnull -> 774
/*     */       //   769: pop
/*     */       //   770: pop
/*     */       //   771: goto -> 784
/*     */       //   774: invokevirtual intValue : ()I
/*     */       //   777: if_icmpne -> 784
/*     */       //   780: iconst_1
/*     */       //   781: goto -> 785
/*     */       //   784: iconst_0
/*     */       //   785: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */       //   788: aload #12
/*     */       //   790: invokestatic access$ListComboBox_Fsagccs$lambda$15 : (Landroidx/compose/runtime/MutableState;)Ljava/lang/Integer;
/*     */       //   793: ifnull -> 800
/*     */       //   796: iconst_1
/*     */       //   797: goto -> 801
/*     */       //   800: iconst_0
/*     */       //   801: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */       //   804: aload #34
/*     */       //   806: bipush #14
/*     */       //   808: iload #5
/*     */       //   810: iconst_3
/*     */       //   811: ishr
/*     */       //   812: iand
/*     */       //   813: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   816: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   821: pop
/*     */       //   822: nop
/*     */       //   823: aload #31
/*     */       //   825: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   828: aload_3
/*     */       //   829: invokeinterface endNode : ()V
/*     */       //   834: aload_3
/*     */       //   835: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   838: nop
/*     */       //   839: aload_3
/*     */       //   840: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   843: nop
/*     */       //   844: aload_3
/*     */       //   845: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   848: nop
/*     */       //   849: invokestatic isTraceInProgress : ()Z
/*     */       //   852: ifeq -> 867
/*     */       //   855: invokestatic traceEventEnd : ()V
/*     */       //   858: goto -> 867
/*     */       //   861: aload_3
/*     */       //   862: invokeinterface skipToGroupEnd : ()V
/*     */       //   867: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #102	-> 74
/*     */       //   #239	-> 128
/*     */       //   #240	-> 140
/*     */       //   #241	-> 151
/*     */       //   #102	-> 154
/*     */       //   #241	-> 164
/*     */       //   #242	-> 166
/*     */       //   #243	-> 175
/*     */       //   #244	-> 180
/*     */       //   #240	-> 182
/*     */       //   #239	-> 183
/*     */       //   #239	-> 184
/*     */       //   #102	-> 185
/*     */       //   #105	-> 200
/*     */       //   #245	-> 277
/*     */       //   #246	-> 289
/*     */       //   #247	-> 305
/*     */       //   #105	-> 310
/*     */       //   #247	-> 327
/*     */       //   #248	-> 329
/*     */       //   #249	-> 338
/*     */       //   #250	-> 343
/*     */       //   #246	-> 345
/*     */       //   #245	-> 346
/*     */       //   #245	-> 347
/*     */       //   #105	-> 348
/*     */       //   #103	-> 366
/*     */       //   #251	-> 395
/*     */       //   #252	-> 398
/*     */       //   #253	-> 406
/*     */       //   #256	-> 409
/*     */       //   #257	-> 427
/*     */       //   #258	-> 436
/*     */       //   #259	-> 441
/*     */       //   #260	-> 447
/*     */       //   #261	-> 455
/*     */       //   #263	-> 462
/*     */       //   #262	-> 484
/*     */       //   #264	-> 493
/*     */       //   #265	-> 496
/*     */       //   #266	-> 512
/*     */       //   #267	-> 517
/*     */       //   #268	-> 527
/*     */       //   #270	-> 538
/*     */       //   #272	-> 543
/*     */       //   #273	-> 552
/*     */       //   #274	-> 565
/*     */       //   #276	-> 578
/*     */       //   #277	-> 589
/*     */       //   #278	-> 596
/*     */       //   #279	-> 624
/*     */       //   #280	-> 636
/*     */       //   #282	-> 650
/*     */       //   #277	-> 651
/*     */       //   #282	-> 652
/*     */       //   #283	-> 653
/*     */       //   #284	-> 666
/*     */       //   #272	-> 667
/*     */       //   #285	-> 668
/*     */       //   #286	-> 692
/*     */       //   #113	-> 723
/*     */       //   #114	-> 725
/*     */       //   #115	-> 726
/*     */       //   #116	-> 735
/*     */       //   #117	-> 744
/*     */       //   #118	-> 788
/*     */       //   #113	-> 816
/*     */       //   #120	-> 822
/*     */       //   #286	-> 823
/*     */       //   #285	-> 828
/*     */       //   #287	-> 829
/*     */       //   #264	-> 835
/*     */       //   #288	-> 838
/*     */       //   #258	-> 840
/*     */       //   #289	-> 843
/*     */       //   #251	-> 845
/*     */       //   #290	-> 848
/*     */       //   #120	-> 861
/*     */       //   #121	-> 867
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   154	10	13	$i$a$-cache-ListComboBoxKt$ListComboBox$contentItems$1$1$isItemHovered$2	I
/*     */       //   166	11	13	value$iv	Ljava/lang/Object;
/*     */       //   140	43	12	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   137	46	11	it$iv	Ljava/lang/Object;
/*     */       //   128	57	10	$i$f$cache	I
/*     */       //   125	60	8	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   125	60	9	invalid$iv	Z
/*     */       //   310	14	16	$i$a$-cache-ListComboBoxKt$ListComboBox$contentItems$1$1$1	I
/*     */       //   329	11	17	value$iv	Ljava/lang/Object;
/*     */       //   289	57	15	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   286	60	14	it$iv	Ljava/lang/Object;
/*     */       //   277	71	13	$i$f$cache	I
/*     */       //   274	74	8	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   274	74	9	invalid$iv	Z
/*     */       //   723	100	36	$i$a$-Box-ListComboBoxKt$ListComboBox$contentItems$1$1$2	I
/*     */       //   720	103	35	$this$invoke_u24lambda_u245	Landroidx/compose/foundation/layout/BoxScope;
/*     */       //   720	103	34	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   720	103	33	$changed	I
/*     */       //   684	144	32	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */       //   681	147	31	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */       //   681	147	30	$changed$iv	I
/*     */       //   596	55	29	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */       //   593	58	28	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */       //   589	64	27	$i$f$set-impl	I
/*     */       //   586	67	26	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */       //   552	115	25	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */       //   549	118	24	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */       //   488	351	23	$i$f$ReusableComposeNode	I
/*     */       //   485	354	21	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */       //   485	354	22	$changed$iv$iv$iv	I
/*     */       //   431	413	17	$i$f$Layout	I
/*     */       //   446	398	18	compositeKeyHash$iv$iv	I
/*     */       //   454	390	19	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */       //   462	382	20	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */       //   428	416	16	$changed$iv$iv	I
/*     */       //   390	459	14	$i$f$Box	I
/*     */       //   418	431	15	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */       //   387	462	7	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */       //   406	443	8	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */       //   409	440	9	propagateMinConstraints$iv	Z
/*     */       //   387	462	13	$changed$iv	I
/*     */       //   200	658	6	isItemHovered$delegate	Landroidx/compose/runtime/MutableState;
/*     */       //   16	852	5	$dirty	I
/*     */       //   0	868	0	this	Lorg/jetbrains/jewel/ui/component/ListComboBoxKt$ListComboBox$contentItems$1$1;
/*     */       //   0	868	1	$this$items	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyItemScope;
/*     */       //   0	868	2	item	Ljava/lang/String;
/*     */       //   0	868	3	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   0	868	4	$changed	I
/*     */     }
/*     */     
/*     */     private static final boolean invoke$lambda$1(MutableState $isItemHovered$delegate) {
/*     */       State state = (State)$isItemHovered$delegate;
/*     */       Object object = null;
/*     */       KProperty property$iv = null;
/*     */       int $i$f$getValue = 0;
/*     */       return ((Boolean)state.getValue()).booleanValue();
/*     */     }
/*     */     
/*     */     private static final void invoke$lambda$2(MutableState $isItemHovered$delegate, boolean <set-?>) {
/*     */       MutableState mutableState = $isItemHovered$delegate;
/*     */       Object object1 = null, object2 = null;
/*     */       Object value$iv = Boolean.valueOf(<set-?>);
/*     */       int $i$f$setValue = 0;
/*     */       mutableState.setValue(value$iv);
/*     */     }
/*     */     
/*     */     private static final Unit invoke$lambda$4$lambda$3(List $items, String $item, Function1 $onHoverItemChange, MutableState<Boolean> $isItemHovered$delegate, MutableState $hoverItemIndex$delegate, boolean it) {
/*     */       invoke$lambda$2($isItemHovered$delegate, it);
/*     */       if (invoke$lambda$1($isItemHovered$delegate)) {
/*     */         ListComboBoxKt.ListComboBox_Fsagccs$lambda$16($hoverItemIndex$delegate, Integer.valueOf($items.indexOf($item)));
/*     */         $onHoverItemChange.invoke($item);
/*     */       } 
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */     
/*     */     ListComboBoxKt$ListComboBox$contentItems$1$1(List<String> $items, Function1<String, Unit> $onHoverItemChange, MutableState<Integer> $hoverItemIndex$delegate, Function7<String, Boolean, Boolean, Boolean, Boolean, Composer, Integer, Unit> $listItemContent) {}
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*     */   private static final void ListComboBox_Fsagccs$list(MutableState isListHovered$delegate, TextFieldState inputTextFieldState, List $items, Function1 $onSelectedItemChange, MutableIntState selectedItem$delegate, MutableState hoverItemIndex$delegate, List items, SelectableLazyListState scrollState, float popupMaxHeight, PaddingValues contentPadding, Function1 onListHoverChange, Function1 onHoverItemChange, Function7 listItemContent, Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload #13
/*     */     //   2: ldc_w 1093229853
/*     */     //   5: invokeinterface startReplaceGroup : (I)V
/*     */     //   10: invokestatic isTraceInProgress : ()Z
/*     */     //   13: ifeq -> 28
/*     */     //   16: ldc_w 1093229853
/*     */     //   19: iload #14
/*     */     //   21: iconst_m1
/*     */     //   22: ldc_w 'org.jetbrains.jewel.ui.component.ListComboBox.list (ListComboBox.kt:133)'
/*     */     //   25: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   28: aload #7
/*     */     //   30: invokevirtual getLazyListState : ()Landroidx/compose/foundation/lazy/LazyListState;
/*     */     //   33: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   36: checkcast androidx/compose/ui/Modifier
/*     */     //   39: fconst_0
/*     */     //   40: fload #8
/*     */     //   42: iconst_1
/*     */     //   43: aconst_null
/*     */     //   44: invokestatic heightIn-VpY3zN4$default : (Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   47: aload #13
/*     */     //   49: ldc_w 1964173815
/*     */     //   52: invokeinterface startReplaceGroup : (I)V
/*     */     //   57: aload #13
/*     */     //   59: astore #16
/*     */     //   61: iload #14
/*     */     //   63: ldc_w 57344
/*     */     //   66: iand
/*     */     //   67: sipush #24576
/*     */     //   70: ixor
/*     */     //   71: sipush #16384
/*     */     //   74: if_icmple -> 89
/*     */     //   77: aload #13
/*     */     //   79: aload #10
/*     */     //   81: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   86: ifne -> 101
/*     */     //   89: iload #14
/*     */     //   91: sipush #24576
/*     */     //   94: iand
/*     */     //   95: sipush #16384
/*     */     //   98: if_icmpne -> 105
/*     */     //   101: iconst_1
/*     */     //   102: goto -> 106
/*     */     //   105: iconst_0
/*     */     //   106: istore #17
/*     */     //   108: iconst_0
/*     */     //   109: istore #18
/*     */     //   111: aload #16
/*     */     //   113: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   118: astore #19
/*     */     //   120: iconst_0
/*     */     //   121: istore #20
/*     */     //   123: iload #17
/*     */     //   125: ifne -> 139
/*     */     //   128: aload #19
/*     */     //   130: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   133: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   136: if_acmpne -> 178
/*     */     //   139: astore #24
/*     */     //   141: astore #23
/*     */     //   143: iconst_0
/*     */     //   144: istore #21
/*     */     //   146: aload #10
/*     */     //   148: aload_0
/*     */     //   149: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */     //   154: astore #25
/*     */     //   156: aload #23
/*     */     //   158: aload #24
/*     */     //   160: aload #25
/*     */     //   162: astore #22
/*     */     //   164: aload #16
/*     */     //   166: aload #22
/*     */     //   168: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   173: aload #22
/*     */     //   175: goto -> 180
/*     */     //   178: aload #19
/*     */     //   180: nop
/*     */     //   181: nop
/*     */     //   182: nop
/*     */     //   183: checkcast kotlin/jvm/functions/Function1
/*     */     //   186: astore #15
/*     */     //   188: aload #13
/*     */     //   190: invokeinterface endReplaceGroup : ()V
/*     */     //   195: aload #15
/*     */     //   197: invokestatic onHover : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   200: aconst_null
/*     */     //   201: aconst_null
/*     */     //   202: iconst_0
/*     */     //   203: iconst_0
/*     */     //   204: aconst_null
/*     */     //   205: ldc_w 1714593080
/*     */     //   208: iconst_1
/*     */     //   209: new org/jetbrains/jewel/ui/component/ListComboBoxKt$ListComboBox$list$2
/*     */     //   212: dup
/*     */     //   213: fload #8
/*     */     //   215: aload #9
/*     */     //   217: aload #7
/*     */     //   219: aload_1
/*     */     //   220: aload_2
/*     */     //   221: aload_3
/*     */     //   222: aload #6
/*     */     //   224: aload #11
/*     */     //   226: aload #12
/*     */     //   228: aload #4
/*     */     //   230: aload #5
/*     */     //   232: invokespecial <init> : (FLandroidx/compose/foundation/layout/PaddingValues;Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;Landroidx/compose/foundation/text/input/TextFieldState;Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function7;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;)V
/*     */     //   235: aload #13
/*     */     //   237: bipush #54
/*     */     //   239: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   242: checkcast kotlin/jvm/functions/Function2
/*     */     //   245: aload #13
/*     */     //   247: ldc 12582912
/*     */     //   249: bipush #124
/*     */     //   251: invokestatic VerticallyScrollableContainer : (Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*     */     //   254: invokestatic isTraceInProgress : ()Z
/*     */     //   257: ifeq -> 263
/*     */     //   260: invokestatic traceEventEnd : ()V
/*     */     //   263: aload #13
/*     */     //   265: invokeinterface endReplaceGroup : ()V
/*     */     //   270: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #134	-> 25
/*     */     //   #136	-> 28
/*     */     //   #138	-> 33
/*     */     //   #341	-> 111
/*     */     //   #342	-> 123
/*     */     //   #343	-> 139
/*     */     //   #138	-> 146
/*     */     //   #343	-> 162
/*     */     //   #344	-> 164
/*     */     //   #345	-> 173
/*     */     //   #346	-> 178
/*     */     //   #342	-> 180
/*     */     //   #341	-> 181
/*     */     //   #341	-> 182
/*     */     //   #138	-> 183
/*     */     //   #142	-> 205
/*     */     //   #135	-> 251
/*     */     //   #155	-> 270
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   146	8	21	$i$a$-cache-ListComboBoxKt$ListComboBox$list$1	I
/*     */     //   164	11	22	value$iv	Ljava/lang/Object;
/*     */     //   123	58	20	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   120	61	19	it$iv	Ljava/lang/Object;
/*     */     //   111	72	18	$i$f$cache	I
/*     */     //   108	75	16	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   108	75	17	invalid$iv	Z
/*     */     //   0	271	0	isListHovered$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   0	271	1	inputTextFieldState	Landroidx/compose/foundation/text/input/TextFieldState;
/*     */     //   0	271	2	$items	Ljava/util/List;
/*     */     //   0	271	3	$onSelectedItemChange	Lkotlin/jvm/functions/Function1;
/*     */     //   0	271	4	selectedItem$delegate	Landroidx/compose/runtime/MutableIntState;
/*     */     //   0	271	5	hoverItemIndex$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   0	271	6	items	Ljava/util/List;
/*     */     //   0	271	7	scrollState	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;
/*     */     //   0	271	8	popupMaxHeight	F
/*     */     //   0	271	9	contentPadding	Landroidx/compose/foundation/layout/PaddingValues;
/*     */     //   0	271	10	onListHoverChange	Lkotlin/jvm/functions/Function1;
/*     */     //   0	271	11	onHoverItemChange	Lkotlin/jvm/functions/Function1;
/*     */     //   0	271	12	listItemContent	Lkotlin/jvm/functions/Function7;
/*     */     //   0	271	13	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	271	14	$changed	I
/*     */   }
/*     */   
/*     */   private static final Unit ListComboBox_Fsagccs$list$lambda$28$lambda$27(Function1 $onListHoverChange, MutableState<Boolean> $isListHovered$delegate, boolean it) {
/*     */     ListComboBox_Fsagccs$lambda$13($isListHovered$delegate, it);
/*     */     $onListHoverChange.invoke(Boolean.valueOf(it));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nListComboBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListComboBox.kt\norg/jetbrains/jewel/ui/component/ListComboBoxKt$ListComboBox$list$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,238:1\n1225#2,6:239\n*S KotlinDebug\n*F\n+ 1 ListComboBox.kt\norg/jetbrains/jewel/ui/component/ListComboBoxKt$ListComboBox$list$2\n*L\n147#1:239,6\n*E\n"})
/*     */   static final class ListComboBoxKt$ListComboBox$list$2 implements Function2<Composer, Integer, Unit> {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(Composer $composer, int $changed) {
/*     */       // Byte code:
/*     */       //   0: iload_2
/*     */       //   1: iconst_3
/*     */       //   2: iand
/*     */       //   3: iconst_2
/*     */       //   4: if_icmpne -> 16
/*     */       //   7: aload_1
/*     */       //   8: invokeinterface getSkipping : ()Z
/*     */       //   13: ifne -> 295
/*     */       //   16: invokestatic isTraceInProgress : ()Z
/*     */       //   19: ifeq -> 31
/*     */       //   22: ldc 1714593080
/*     */       //   24: iload_2
/*     */       //   25: iconst_m1
/*     */       //   26: ldc 'org.jetbrains.jewel.ui.component.ListComboBox.list.<anonymous> (ListComboBox.kt:142)'
/*     */       //   28: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */       //   31: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */       //   34: checkcast androidx/compose/ui/Modifier
/*     */       //   37: fconst_0
/*     */       //   38: iconst_1
/*     */       //   39: aconst_null
/*     */       //   40: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */       //   43: fconst_0
/*     */       //   44: aload_0
/*     */       //   45: getfield $popupMaxHeight : F
/*     */       //   48: iconst_1
/*     */       //   49: aconst_null
/*     */       //   50: invokestatic heightIn-VpY3zN4$default : (Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */       //   53: aload_0
/*     */       //   54: getfield $contentPadding : Landroidx/compose/foundation/layout/PaddingValues;
/*     */       //   57: invokestatic padding : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;
/*     */       //   60: getstatic org/jetbrains/jewel/foundation/lazy/SelectionMode.Single : Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;
/*     */       //   63: aload_0
/*     */       //   64: getfield $scrollState : Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;
/*     */       //   67: aconst_null
/*     */       //   68: iconst_0
/*     */       //   69: aload_1
/*     */       //   70: ldc -974866245
/*     */       //   72: invokeinterface startReplaceGroup : (I)V
/*     */       //   77: aload_1
/*     */       //   78: astore #4
/*     */       //   80: aload_1
/*     */       //   81: aload_0
/*     */       //   82: getfield $inputTextFieldState : Landroidx/compose/foundation/text/input/TextFieldState;
/*     */       //   85: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   90: aload_1
/*     */       //   91: aload_0
/*     */       //   92: getfield $items : Ljava/util/List;
/*     */       //   95: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */       //   100: ior
/*     */       //   101: aload_1
/*     */       //   102: aload_0
/*     */       //   103: getfield $onSelectedItemChange : Lkotlin/jvm/functions/Function1;
/*     */       //   106: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   111: ior
/*     */       //   112: istore #5
/*     */       //   114: aload_0
/*     */       //   115: getfield $selectedItem$delegate : Landroidx/compose/runtime/MutableIntState;
/*     */       //   118: astore #6
/*     */       //   120: aload_0
/*     */       //   121: getfield $inputTextFieldState : Landroidx/compose/foundation/text/input/TextFieldState;
/*     */       //   124: astore #7
/*     */       //   126: aload_0
/*     */       //   127: getfield $items : Ljava/util/List;
/*     */       //   130: astore #8
/*     */       //   132: aload_0
/*     */       //   133: getfield $onSelectedItemChange : Lkotlin/jvm/functions/Function1;
/*     */       //   136: astore #9
/*     */       //   138: iconst_0
/*     */       //   139: istore #10
/*     */       //   141: aload #4
/*     */       //   143: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   148: astore #11
/*     */       //   150: iconst_0
/*     */       //   151: istore #12
/*     */       //   153: iload #5
/*     */       //   155: ifne -> 169
/*     */       //   158: aload #11
/*     */       //   160: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   163: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   166: if_acmpne -> 225
/*     */       //   169: istore #19
/*     */       //   171: astore #18
/*     */       //   173: astore #17
/*     */       //   175: astore #16
/*     */       //   177: astore #15
/*     */       //   179: iconst_0
/*     */       //   180: istore #13
/*     */       //   182: aload #6
/*     */       //   184: aload #7
/*     */       //   186: aload #8
/*     */       //   188: aload #9
/*     */       //   190: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableIntState;Landroidx/compose/foundation/text/input/TextFieldState;Ljava/util/List;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;
/*     */       //   195: astore #20
/*     */       //   197: aload #15
/*     */       //   199: aload #16
/*     */       //   201: aload #17
/*     */       //   203: aload #18
/*     */       //   205: iload #19
/*     */       //   207: aload #20
/*     */       //   209: astore #14
/*     */       //   211: aload #4
/*     */       //   213: aload #14
/*     */       //   215: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   220: aload #14
/*     */       //   222: goto -> 227
/*     */       //   225: aload #11
/*     */       //   227: nop
/*     */       //   228: nop
/*     */       //   229: nop
/*     */       //   230: checkcast kotlin/jvm/functions/Function1
/*     */       //   233: astore_3
/*     */       //   234: aload_1
/*     */       //   235: invokeinterface endReplaceGroup : ()V
/*     */       //   240: aload_3
/*     */       //   241: aconst_null
/*     */       //   242: aconst_null
/*     */       //   243: aconst_null
/*     */       //   244: aconst_null
/*     */       //   245: aconst_null
/*     */       //   246: aconst_null
/*     */       //   247: aload_0
/*     */       //   248: getfield $hoverItemIndex$delegate : Landroidx/compose/runtime/MutableState;
/*     */       //   251: aload_0
/*     */       //   252: getfield $items$1 : Ljava/util/List;
/*     */       //   255: aload_0
/*     */       //   256: getfield $onHoverItemChange : Lkotlin/jvm/functions/Function1;
/*     */       //   259: aload_0
/*     */       //   260: getfield $listItemContent : Lkotlin/jvm/functions/Function7;
/*     */       //   263: invokestatic access$ListComboBox_Fsagccs$contentItems : (Landroidx/compose/runtime/MutableState;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function7;)Lkotlin/jvm/functions/Function1;
/*     */       //   266: aload_1
/*     */       //   267: bipush #48
/*     */       //   269: getstatic org/jetbrains/jewel/foundation/lazy/SelectableLazyListState.$stable : I
/*     */       //   272: bipush #6
/*     */       //   274: ishl
/*     */       //   275: ior
/*     */       //   276: iconst_0
/*     */       //   277: sipush #4056
/*     */       //   280: invokestatic SelectableLazyColumn : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLkotlin/jvm/functions/Function1;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;Lorg/jetbrains/jewel/foundation/lazy/tree/KeyActions;Lorg/jetbrains/jewel/foundation/lazy/tree/PointerEventActions;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V
/*     */       //   283: invokestatic isTraceInProgress : ()Z
/*     */       //   286: ifeq -> 301
/*     */       //   289: invokestatic traceEventEnd : ()V
/*     */       //   292: goto -> 301
/*     */       //   295: aload_1
/*     */       //   296: invokeinterface skipToGroupEnd : ()V
/*     */       //   301: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #143	-> 0
/*     */       //   #144	-> 31
/*     */       //   #145	-> 60
/*     */       //   #146	-> 63
/*     */       //   #147	-> 114
/*     */       //   #239	-> 141
/*     */       //   #240	-> 153
/*     */       //   #241	-> 169
/*     */       //   #147	-> 182
/*     */       //   #241	-> 209
/*     */       //   #242	-> 211
/*     */       //   #243	-> 220
/*     */       //   #244	-> 225
/*     */       //   #240	-> 227
/*     */       //   #239	-> 228
/*     */       //   #239	-> 229
/*     */       //   #147	-> 230
/*     */       //   #152	-> 247
/*     */       //   #143	-> 280
/*     */       //   #153	-> 295
/*     */       //   #154	-> 301
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   182	13	13	$i$a$-cache-ListComboBoxKt$ListComboBox$list$2$1	I
/*     */       //   211	11	14	value$iv	Ljava/lang/Object;
/*     */       //   153	75	12	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   150	78	11	it$iv	Ljava/lang/Object;
/*     */       //   141	89	10	$i$f$cache	I
/*     */       //   138	92	4	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   138	92	5	invalid$iv	Z
/*     */       //   0	302	0	this	Lorg/jetbrains/jewel/ui/component/ListComboBoxKt$ListComboBox$list$2;
/*     */       //   0	302	1	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   0	302	2	$changed	I
/*     */     }
/*     */     
/*     */     private static final Unit invoke$lambda$1$lambda$0(MutableIntState $selectedItem$delegate, TextFieldState $inputTextFieldState, List $items, Function1 $onSelectedItemChange, List selectedItemsIndexes) {
/*     */       Intrinsics.checkNotNullParameter(selectedItemsIndexes, "selectedItemsIndexes");
/*     */       if (selectedItemsIndexes.isEmpty())
/*     */         return Unit.INSTANCE; 
/*     */       if (((Number)CollectionsKt.first(selectedItemsIndexes)).intValue() == ListComboBoxKt.ListComboBox_Fsagccs$lambda$9($selectedItem$delegate))
/*     */         return Unit.INSTANCE; 
/*     */       ListComboBoxKt.ListComboBox_Fsagccs$onSelectedIndexChange($inputTextFieldState, $items, $onSelectedItemChange, $selectedItem$delegate, ((Number)CollectionsKt.first(selectedItemsIndexes)).intValue());
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */     
/*     */     ListComboBoxKt$ListComboBox$list$2(float $popupMaxHeight, PaddingValues $contentPadding, SelectableLazyListState $scrollState, TextFieldState $inputTextFieldState, List<String> $items, Function1<String, Unit> $onSelectedItemChange, List<String> $items$1, Function1<String, Unit> $onHoverItemChange, Function7<String, Boolean, Boolean, Boolean, Boolean, Composer, Integer, Unit> $listItemContent, MutableIntState $selectedItem$delegate, MutableState<Integer> $hoverItemIndex$delegate) {}
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   static final class ListComboBoxKt$ListComboBox$7 implements Function2<Composer, Integer, Unit> {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(Composer $composer, int $changed) {
/*     */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventStart(2034640723, $changed, -1, "org.jetbrains.jewel.ui.component.ListComboBox.<anonymous> (ListComboBox.kt:169)"); 
/*     */         ListComboBoxKt.ListComboBox_Fsagccs$list(this.$isListHovered$delegate, this.$inputTextFieldState, this.$items, this.$onSelectedItemChange, this.$selectedItem$delegate, this.$hoverItemIndex$delegate, this.$items, this.$scrollState, this.$popupMaxHeight, this.$contentPadding, this.$onListHoverChange, this.$onHoverItemChange, this.$listItemContent, $composer, SelectableLazyListState.$stable << 3);
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventEnd(); 
/*     */       } else {
/*     */         $composer.skipToGroupEnd();
/*     */       } 
/*     */     }
/*     */     
/*     */     ListComboBoxKt$ListComboBox$7(List<String> $items, SelectableLazyListState $scrollState, float $popupMaxHeight, PaddingValues $contentPadding, Function1<Boolean, Unit> $onListHoverChange, Function1<String, Unit> $onHoverItemChange, Function7<String, Boolean, Boolean, Boolean, Boolean, Composer, Integer, Unit> $listItemContent, MutableState<Boolean> $isListHovered$delegate, TextFieldState $inputTextFieldState, Function1<String, Unit> $onSelectedItemChange, MutableIntState $selectedItem$delegate, MutableState<Integer> $hoverItemIndex$delegate) {}
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   static final class ListComboBoxKt$ListComboBox$9 implements Function2<Composer, Integer, Unit> {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(Composer $composer, int $changed) {
/*     */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventStart(2130896430, $changed, -1, "org.jetbrains.jewel.ui.component.ListComboBox.<anonymous> (ListComboBox.kt:193)"); 
/*     */         ListComboBoxKt.ListComboBox_Fsagccs$list(this.$isListHovered$delegate, this.$inputTextFieldState, this.$items, this.$onSelectedItemChange, this.$selectedItem$delegate, this.$hoverItemIndex$delegate, this.$items, this.$scrollState, this.$popupMaxHeight, this.$contentPadding, this.$onListHoverChange, this.$onHoverItemChange, this.$listItemContent, $composer, SelectableLazyListState.$stable << 3);
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventEnd(); 
/*     */       } else {
/*     */         $composer.skipToGroupEnd();
/*     */       } 
/*     */     }
/*     */     
/*     */     ListComboBoxKt$ListComboBox$9(List<String> $items, SelectableLazyListState $scrollState, float $popupMaxHeight, PaddingValues $contentPadding, Function1<Boolean, Unit> $onListHoverChange, Function1<String, Unit> $onHoverItemChange, Function7<String, Boolean, Boolean, Boolean, Boolean, Composer, Integer, Unit> $listItemContent, MutableState<Boolean> $isListHovered$delegate, TextFieldState $inputTextFieldState, Function1<String, Unit> $onSelectedItemChange, MutableIntState $selectedItem$delegate, MutableState<Integer> $hoverItemIndex$delegate) {}
/*     */   }
/*     */   
/*     */   private static final Object scrollToIndex(LazyListState $this$scrollToIndex, int itemIndex, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof org/jetbrains/jewel/ui/component/ListComboBoxKt$scrollToIndex$1
/*     */     //   4: ifeq -> 41
/*     */     //   7: aload_2
/*     */     //   8: checkcast org/jetbrains/jewel/ui/component/ListComboBoxKt$scrollToIndex$1
/*     */     //   11: astore #9
/*     */     //   13: aload #9
/*     */     //   15: getfield label : I
/*     */     //   18: ldc_w -2147483648
/*     */     //   21: iand
/*     */     //   22: ifeq -> 41
/*     */     //   25: aload #9
/*     */     //   27: dup
/*     */     //   28: getfield label : I
/*     */     //   31: ldc_w -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 51
/*     */     //   41: new org/jetbrains/jewel/ui/component/ListComboBoxKt$scrollToIndex$1
/*     */     //   44: dup
/*     */     //   45: aload_2
/*     */     //   46: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*     */     //   49: astore #9
/*     */     //   51: aload #9
/*     */     //   53: getfield result : Ljava/lang/Object;
/*     */     //   56: astore #8
/*     */     //   58: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   61: astore #10
/*     */     //   63: aload #9
/*     */     //   65: getfield label : I
/*     */     //   68: tableswitch default -> 566, 0 -> 108, 1 -> 247, 2 -> 299, 3 -> 361, 4 -> 437, 5 -> 550
/*     */     //   108: aload #8
/*     */     //   110: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   113: aload_0
/*     */     //   114: invokevirtual getFirstVisibleItemScrollOffset : ()I
/*     */     //   117: ifne -> 124
/*     */     //   120: iconst_1
/*     */     //   121: goto -> 125
/*     */     //   124: iconst_0
/*     */     //   125: istore_3
/*     */     //   126: aload_0
/*     */     //   127: invokevirtual getLayoutInfo : ()Landroidx/compose/foundation/lazy/LazyListLayoutInfo;
/*     */     //   130: invokeinterface getVisibleItemsInfo : ()Ljava/util/List;
/*     */     //   135: invokestatic lastOrNull : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   138: checkcast androidx/compose/foundation/lazy/LazyListItemInfo
/*     */     //   141: astore #4
/*     */     //   143: aload #4
/*     */     //   145: ifnull -> 183
/*     */     //   148: aload_0
/*     */     //   149: invokevirtual getLayoutInfo : ()Landroidx/compose/foundation/lazy/LazyListLayoutInfo;
/*     */     //   152: invokeinterface getViewportEndOffset : ()I
/*     */     //   157: aload #4
/*     */     //   159: invokeinterface getOffset : ()I
/*     */     //   164: isub
/*     */     //   165: aload #4
/*     */     //   167: invokeinterface getSize : ()I
/*     */     //   172: if_icmplt -> 179
/*     */     //   175: iconst_1
/*     */     //   176: goto -> 184
/*     */     //   179: iconst_0
/*     */     //   180: goto -> 184
/*     */     //   183: iconst_0
/*     */     //   184: istore #5
/*     */     //   186: aload #4
/*     */     //   188: dup
/*     */     //   189: ifnull -> 200
/*     */     //   192: invokeinterface getSize : ()I
/*     */     //   197: goto -> 202
/*     */     //   200: pop
/*     */     //   201: iconst_0
/*     */     //   202: istore #6
/*     */     //   204: nop
/*     */     //   205: iload_1
/*     */     //   206: aload_0
/*     */     //   207: invokestatic getVisibleItemsRange : (Landroidx/compose/foundation/lazy/LazyListState;)Lkotlin/ranges/IntRange;
/*     */     //   210: invokevirtual getFirst : ()I
/*     */     //   213: if_icmpge -> 259
/*     */     //   216: aload_0
/*     */     //   217: iload_1
/*     */     //   218: iconst_1
/*     */     //   219: isub
/*     */     //   220: iconst_0
/*     */     //   221: invokestatic coerceAtLeast : (II)I
/*     */     //   224: iconst_0
/*     */     //   225: aload #9
/*     */     //   227: iconst_2
/*     */     //   228: aconst_null
/*     */     //   229: aload #9
/*     */     //   231: iconst_1
/*     */     //   232: putfield label : I
/*     */     //   235: invokestatic scrollToItem$default : (Landroidx/compose/foundation/lazy/LazyListState;IILkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   238: dup
/*     */     //   239: aload #10
/*     */     //   241: if_acmpne -> 254
/*     */     //   244: aload #10
/*     */     //   246: areturn
/*     */     //   247: aload #8
/*     */     //   249: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   252: aload #8
/*     */     //   254: pop
/*     */     //   255: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   258: areturn
/*     */     //   259: iload_1
/*     */     //   260: aload_0
/*     */     //   261: invokestatic getVisibleItemsRange : (Landroidx/compose/foundation/lazy/LazyListState;)Lkotlin/ranges/IntRange;
/*     */     //   264: invokevirtual getFirst : ()I
/*     */     //   267: if_icmpne -> 311
/*     */     //   270: iload_3
/*     */     //   271: ifne -> 311
/*     */     //   274: aload_0
/*     */     //   275: iload_1
/*     */     //   276: iconst_0
/*     */     //   277: aload #9
/*     */     //   279: iconst_2
/*     */     //   280: aconst_null
/*     */     //   281: aload #9
/*     */     //   283: iconst_2
/*     */     //   284: putfield label : I
/*     */     //   287: invokestatic scrollToItem$default : (Landroidx/compose/foundation/lazy/LazyListState;IILkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   290: dup
/*     */     //   291: aload #10
/*     */     //   293: if_acmpne -> 306
/*     */     //   296: aload #10
/*     */     //   298: areturn
/*     */     //   299: aload #8
/*     */     //   301: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   304: aload #8
/*     */     //   306: pop
/*     */     //   307: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   310: areturn
/*     */     //   311: iload_1
/*     */     //   312: aload_0
/*     */     //   313: invokestatic getVisibleItemsRange : (Landroidx/compose/foundation/lazy/LazyListState;)Lkotlin/ranges/IntRange;
/*     */     //   316: invokevirtual getLast : ()I
/*     */     //   319: if_icmpne -> 373
/*     */     //   322: iload #5
/*     */     //   324: ifne -> 373
/*     */     //   327: aload_0
/*     */     //   328: iload_1
/*     */     //   329: aload_0
/*     */     //   330: invokevirtual getLayoutInfo : ()Landroidx/compose/foundation/lazy/LazyListLayoutInfo;
/*     */     //   333: invokeinterface getViewportEndOffset : ()I
/*     */     //   338: iload #6
/*     */     //   340: isub
/*     */     //   341: aload #9
/*     */     //   343: aload #9
/*     */     //   345: iconst_3
/*     */     //   346: putfield label : I
/*     */     //   349: invokevirtual scrollToItem : (IILkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   352: dup
/*     */     //   353: aload #10
/*     */     //   355: if_acmpne -> 368
/*     */     //   358: aload #10
/*     */     //   360: areturn
/*     */     //   361: aload #8
/*     */     //   363: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   366: aload #8
/*     */     //   368: pop
/*     */     //   369: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   372: areturn
/*     */     //   373: iload_1
/*     */     //   374: aload_0
/*     */     //   375: invokestatic getVisibleItemsRange : (Landroidx/compose/foundation/lazy/LazyListState;)Lkotlin/ranges/IntRange;
/*     */     //   378: invokevirtual getLast : ()I
/*     */     //   381: if_icmple -> 562
/*     */     //   384: aload_0
/*     */     //   385: iload_1
/*     */     //   386: aload_0
/*     */     //   387: invokevirtual getLayoutInfo : ()Landroidx/compose/foundation/lazy/LazyListLayoutInfo;
/*     */     //   390: invokeinterface getViewportEndOffset : ()I
/*     */     //   395: iload #6
/*     */     //   397: isub
/*     */     //   398: aload #9
/*     */     //   400: aload #9
/*     */     //   402: aload_0
/*     */     //   403: putfield L$0 : Ljava/lang/Object;
/*     */     //   406: aload #9
/*     */     //   408: iload_1
/*     */     //   409: putfield I$0 : I
/*     */     //   412: aload #9
/*     */     //   414: iload #6
/*     */     //   416: putfield I$1 : I
/*     */     //   419: aload #9
/*     */     //   421: iconst_4
/*     */     //   422: putfield label : I
/*     */     //   425: invokevirtual scrollToItem : (IILkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   428: dup
/*     */     //   429: aload #10
/*     */     //   431: if_acmpne -> 466
/*     */     //   434: aload #10
/*     */     //   436: areturn
/*     */     //   437: aload #9
/*     */     //   439: getfield I$1 : I
/*     */     //   442: istore #6
/*     */     //   444: aload #9
/*     */     //   446: getfield I$0 : I
/*     */     //   449: istore_1
/*     */     //   450: aload #9
/*     */     //   452: getfield L$0 : Ljava/lang/Object;
/*     */     //   455: checkcast androidx/compose/foundation/lazy/LazyListState
/*     */     //   458: astore_0
/*     */     //   459: aload #8
/*     */     //   461: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   464: aload #8
/*     */     //   466: pop
/*     */     //   467: aload_0
/*     */     //   468: invokevirtual getLayoutInfo : ()Landroidx/compose/foundation/lazy/LazyListLayoutInfo;
/*     */     //   471: invokeinterface getVisibleItemsInfo : ()Ljava/util/List;
/*     */     //   476: invokestatic lastOrNull : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   479: checkcast androidx/compose/foundation/lazy/LazyListItemInfo
/*     */     //   482: dup
/*     */     //   483: ifnonnull -> 491
/*     */     //   486: pop
/*     */     //   487: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   490: areturn
/*     */     //   491: astore #7
/*     */     //   493: aload #7
/*     */     //   495: invokeinterface getSize : ()I
/*     */     //   500: iload #6
/*     */     //   502: if_icmpeq -> 562
/*     */     //   505: aload_0
/*     */     //   506: iload_1
/*     */     //   507: aload_0
/*     */     //   508: invokevirtual getLayoutInfo : ()Landroidx/compose/foundation/lazy/LazyListLayoutInfo;
/*     */     //   511: invokeinterface getViewportEndOffset : ()I
/*     */     //   516: aload #7
/*     */     //   518: invokeinterface getSize : ()I
/*     */     //   523: isub
/*     */     //   524: aload #9
/*     */     //   526: aload #9
/*     */     //   528: aconst_null
/*     */     //   529: putfield L$0 : Ljava/lang/Object;
/*     */     //   532: aload #9
/*     */     //   534: iconst_5
/*     */     //   535: putfield label : I
/*     */     //   538: invokevirtual scrollToItem : (IILkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   541: dup
/*     */     //   542: aload #10
/*     */     //   544: if_acmpne -> 557
/*     */     //   547: aload #10
/*     */     //   549: areturn
/*     */     //   550: aload #8
/*     */     //   552: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   555: aload #8
/*     */     //   557: pop
/*     */     //   558: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   561: areturn
/*     */     //   562: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   565: areturn
/*     */     //   566: new java/lang/IllegalStateException
/*     */     //   569: dup
/*     */     //   570: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   573: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   576: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #207	-> 61
/*     */     //   #208	-> 113
/*     */     //   #210	-> 126
/*     */     //   #212	-> 143
/*     */     //   #213	-> 148
/*     */     //   #215	-> 183
/*     */     //   #212	-> 184
/*     */     //   #211	-> 184
/*     */     //   #218	-> 186
/*     */     //   #219	-> 204
/*     */     //   #220	-> 205
/*     */     //   #207	-> 244
/*     */     //   #237	-> 254
/*     */     //   #221	-> 259
/*     */     //   #207	-> 296
/*     */     //   #237	-> 306
/*     */     //   #222	-> 311
/*     */     //   #223	-> 327
/*     */     //   #207	-> 358
/*     */     //   #237	-> 368
/*     */     //   #226	-> 373
/*     */     //   #228	-> 384
/*     */     //   #207	-> 434
/*     */     //   #231	-> 466
/*     */     //   #232	-> 493
/*     */     //   #233	-> 505
/*     */     //   #207	-> 547
/*     */     //   #237	-> 557
/*     */     //   #207	-> 566
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   113	125	0	$this$scrollToIndex	Landroidx/compose/foundation/lazy/LazyListState;
/*     */     //   259	31	0	$this$scrollToIndex	Landroidx/compose/foundation/lazy/LazyListState;
/*     */     //   311	41	0	$this$scrollToIndex	Landroidx/compose/foundation/lazy/LazyListState;
/*     */     //   373	64	0	$this$scrollToIndex	Landroidx/compose/foundation/lazy/LazyListState;
/*     */     //   459	27	0	$this$scrollToIndex	Landroidx/compose/foundation/lazy/LazyListState;
/*     */     //   491	50	0	$this$scrollToIndex	Landroidx/compose/foundation/lazy/LazyListState;
/*     */     //   113	125	1	itemIndex	I
/*     */     //   259	31	1	itemIndex	I
/*     */     //   311	41	1	itemIndex	I
/*     */     //   373	64	1	itemIndex	I
/*     */     //   450	36	1	itemIndex	I
/*     */     //   491	50	1	itemIndex	I
/*     */     //   126	112	3	isFirstItemFullyVisible	Z
/*     */     //   259	31	3	isFirstItemFullyVisible	Z
/*     */     //   143	54	4	lastItemInfo	Landroidx/compose/foundation/lazy/LazyListItemInfo;
/*     */     //   186	52	5	isLastItemFullyVisible	Z
/*     */     //   259	31	5	isLastItemFullyVisible	Z
/*     */     //   311	16	5	isLastItemFullyVisible	Z
/*     */     //   204	34	6	lastItemInfoSize	I
/*     */     //   259	31	6	lastItemInfoSize	I
/*     */     //   311	41	6	lastItemInfoSize	I
/*     */     //   373	64	6	lastItemInfoSize	I
/*     */     //   444	42	6	lastItemInfoSize	I
/*     */     //   491	14	6	lastItemInfoSize	I
/*     */     //   493	48	7	newLastItemInfo	Landroidx/compose/foundation/lazy/LazyListItemInfo;
/*     */     //   0	577	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   51	515	9	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   58	508	8	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   private static final Unit ListComboBox_Fsagccs$lambda$31(List<String> $items, Modifier $modifier, boolean $isEditable, boolean $isEnabled, float $maxPopupHeight, Function1<? super String, Unit> $onSelectedItemChange, Function1<? super String, Unit> $onHoverItemChange, Function1<? super Boolean, Unit> $onListHoverChange, Function1<? super Boolean, Unit> $onPopupStateChange, Function7<? super String, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, ? super Composer, ? super Integer, Unit> $listItemContent, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     ListComboBox-Fsagccs($items, $modifier, $isEditable, $isEnabled, $maxPopupHeight, $onSelectedItemChange, $onHoverItemChange, $onListHoverChange, $onPopupStateChange, $listItemContent, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "ListComboBox.kt", l = {220, 221, 223, 228, 233}, i = {3, 3, 3}, s = {"L$0", "I$0", "I$1"}, n = {"$this$scrollToIndex", "itemIndex", "lastItemInfoSize"}, m = "scrollToIndex", c = "org.jetbrains.jewel.ui.component.ListComboBoxKt")
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   static final class ListComboBoxKt$scrollToIndex$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int I$0;
/*     */     int I$1;
/*     */     int label;
/*     */     
/*     */     ListComboBoxKt$scrollToIndex$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return ListComboBoxKt.scrollToIndex(null, 0, (Continuation)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\ListComboBoxKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */